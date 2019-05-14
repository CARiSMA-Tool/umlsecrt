package carisma.rt.instrument;

import java.lang.instrument.ClassFileTransformer;
import java.lang.instrument.IllegalClassFormatException;
import java.security.ProtectionDomain;
import java.util.HashSet;
import java.util.Set;
import org.gravity.security.annotations.requirements.Critical;
import org.gravity.security.annotations.requirements.Integrity;
import org.gravity.security.annotations.requirements.Secrecy;

import java.io.ByteArrayInputStream;
import java.io.IOException;

import javassist.ByteArrayClassPath;
import javassist.CannotCompileException;
import javassist.ClassPath;
import javassist.ClassPool;
import javassist.CtBehavior;
import javassist.CtClass;
import javassist.CtConstructor;
import javassist.CtField;
import javassist.CtMethod;
import javassist.LoaderClassPath;
import javassist.Modifier;
import javassist.NotFoundException;

import static carisma.rt.instrument.RTAgent.DEBUG;

@SuppressWarnings("unused")
public class RTTransformer implements ClassFileTransformer {

	private RTFieldAccessCheck fieldCheck;
	private Set<String> classSecrecy;
	private Set<String> classIntegrity;

	private final ClassPool cPool = ClassPool.getDefault();
	private final HashSet<ClassLoader> loaders = new HashSet<>();
	
	public RTTransformer() {
		ClassLoader loader = getClass().getClassLoader();
		LoaderClassPath loaderClassPath = new LoaderClassPath(loader);
		cPool.appendClassPath(loaderClassPath);
		loaders.add(loader);
	}
	

	@Override
	public byte[] transform(ClassLoader loader, String className, Class<?> classBeingRedefined,
			ProtectionDomain protectionDomain, byte[] classfileBuffer) throws IllegalClassFormatException {
		// We don't want to instrument classes provided by us or from the JRE core to
		// which additions aren't possible
		if (protectionDomain == null // Classes from JRE //TODO: Verify null assumption
				|| getClass().getProtectionDomain().equals(protectionDomain)) { // Carisma.rt.
			return classfileBuffer;
		}

		if (RTAgent.DEBUG) {
			System.out.println(
					"[Agent] Transform class: " + className + " class: " + classBeingRedefined + " loader: " + loader);
		}

		byte[] bytecode;
		String classNameDotted = className.replaceAll("/", ".");

		if (classNameDotted.startsWith("carisma.rt.instrument")) {
//			System.out.println("[AGENT] skip "+classNameDotted);
			return classfileBuffer;
		}

		if (!loaders.contains(loader)) {
			LoaderClassPath loaderClassPath = new LoaderClassPath(loader);
			cPool.appendClassPath(loaderClassPath);
			loaders.add(loader);
		}
		ClassPath byteArrayClassPath = new ByteArrayClassPath(classNameDotted, classfileBuffer);
		cPool.insertClassPath(byteArrayClassPath);

		try {
			CtClass ctClass = cPool.get(classNameDotted);
			if (ctClass.isFrozen()) {
				bytecode = classfileBuffer;
				System.out.println("Frozen Class: " + classNameDotted);
			} else {
				// Interfaces cannot contain concrete m)
				if (ctClass.isInterface()) {
					// Interfaces cannot contain concrete methods and fields
					bytecode = classfileBuffer;
				} else {
					bytecode = transform(classNameDotted, ctClass, cPool);
				}
			}
		} catch (IOException | RuntimeException | ClassNotFoundException | NotFoundException
				| CannotCompileException e) {
			RTHelper.printAgentError(e);
			bytecode = classfileBuffer;
		}

		return bytecode;
	}

	/**
	 * @param bytecode
	 * @param classNameDotted
	 * @param cPool
	 * @return
	 * @throws NotFoundException
	 * @throws ClassNotFoundException
	 * @throws IOException
	 * @throws CannotCompileException
	 */
	private byte[] transform(String classNameDotted, CtClass ctClass, ClassPool cPool)
			throws NotFoundException, ClassNotFoundException, IOException, CannotCompileException {

		getAnnotations(ctClass);
		fieldCheck = new RTFieldAccessCheck(ctClass, classIntegrity, classSecrecy);

		for (CtBehavior behavior : ctClass.getDeclaredBehaviors()) {
			int modifiers = behavior.getModifiers();
			if (Modifier.isAbstract(modifiers) || Modifier.isNative(modifiers)) {
				continue;
			}
			try {
				try {
					behavior.getParameterTypes();
				} catch (NotFoundException e) {
					System.out.println("[AGENT] Skip due to unresolved pram type: " + behavior.getLongName());
					continue;
				}
				try {
					behavior.getExceptionTypes();
				} catch (NotFoundException e) {
					System.out.println("[AGENT] Skip due to unresolved exception type: " + behavior.getLongName());
					continue;
				}
				if (behavior instanceof CtMethod) {
					CtMethod method = (CtMethod) behavior;
					try {
						method.getReturnType();
					} catch (NotFoundException e) {
						System.out.println("[AGENT] Skip due to unresolved return type: " + behavior.getLongName());
						continue;
					}
					try {
						method.getDeclaringClass().getSuperclass();
						method.getDeclaringClass().getInterfaces();
					} catch (NotFoundException e) {
						System.out.println("[AGENT] Skip due to unresolved super type: " + behavior.getLongName());
						continue;
					}
				}

				if (!addSecurityCheck(ctClass, behavior, classNameDotted)) {
					System.out.println("[AGENT] Couldn't instrument: " + behavior.getLongName());
				}
			} catch (NotFoundException e) {
				RTHelper.printAgentError(e);
			}
		}
		return ctClass.toBytecode();

	}

	/**
	 * Fills the classSecrecy and classIntergity fields based on the @Critical
	 * annotation of the class and the @Secrecy and @Intergity annotations of its
	 * members
	 * 
	 * @param ctClass
	 * @throws ClassNotFoundException
	 */
	private void getAnnotations(CtClass ctClass) throws ClassNotFoundException {
		classSecrecy = new HashSet<>();
		classIntegrity = new HashSet<>();

		Critical critical = (Critical) ctClass.getAnnotation(Critical.class);
		if (critical != null) {
			for (String s : critical.secrecy()) {
				classSecrecy.add(s);
			}
			for (String i : critical.integrity()) {
				classIntegrity.add(i);
			}
		}
		for (CtBehavior behavior : ctClass.getDeclaredBehaviors()) {
			if (behavior.getAnnotation(Secrecy.class) != null) {
				classSecrecy.add(behavior.getLongName());
			}
			if (behavior.getAnnotation(Integrity.class) != null) {
				classIntegrity.add(behavior.getLongName());
			}
		}
		for (CtField field : ctClass.getDeclaredFields()) {
			if (field.getAnnotation(Secrecy.class) != null) {
				classSecrecy.add(RTHelper.getSignature(field));
			}
			if (field.getAnnotation(Integrity.class) != null) {
				classIntegrity.add(RTHelper.getSignature(field));
			}
		}
	}

	private boolean addSecurityCheck(CtClass declaringClass, CtBehavior ctBehavior, String className)
			throws ClassNotFoundException, NotFoundException {
		if (ctBehavior instanceof CtConstructor) {
			if (((CtConstructor) ctBehavior).isClassInitializer()) {
				return true;
			}
		}

		if (DEBUG) {
			System.out.println("[Agent] Transform method: " + ctBehavior.getLongName());
		}
		if (!addBeforeMethod(declaringClass, ctBehavior, className)) {
			return false;
		}
		if (!addAfterMethod(ctBehavior)) {
			return false;
		}
		try {
			ctBehavior.instrument(fieldCheck);
		} catch (CannotCompileException e) {
			RTHelper.printAgentError(e);
			return false;
		}
		return true;
	}

	private boolean addBeforeMethod(CtClass declaringClass, CtBehavior ctBehavior, String className)
			throws ClassNotFoundException, NotFoundException {

		// Get the annotations on this member
		final Integrity integrityAnnotation = (Integrity) ctBehavior.getAnnotation(Integrity.class);
		final Secrecy secrecyAnnotation = (Secrecy) ctBehavior.getAnnotation(Secrecy.class);
		boolean hasIntegrity = integrityAnnotation != null;
		boolean hasSecrecy = secrecyAnnotation != null;

		StringBuilder before = new StringBuilder();
		if (DEBUG) {
			before.append("System.out.println(\"[Instrumentation]\n[Instrumentation] Method call:\");");
		}

		String methodSignature = ctBehavior.getLongName();

		// Get stack
		before.append(
				"carisma.rt.instrument.RTStack carismaRtStack = carisma.rt.instrument.RTStackManager.getStack(java.lang.Thread.currentThread());\n");

		// Get Top of stack
		before.append(
				"carisma.rt.instrument.RTAnnotation annot = null;\n if(!carismaRtStack.isEmpty()){\n\t annot = (carisma.rt.instrument.RTAnnotation) carismaRtStack.peek();\n }\n");

		// Collect secrecy and integrity information about called method
		before.append("java.util.List secrecySet = new java.util.ArrayList();\n")
				.append("java.util.List integritySet = new java.util.ArrayList();\n");
		for (String s : classSecrecy) {
			hasSecrecy = hasSecrecy || methodSignature.equals(s);
			before.append("secrecySet.add(\"" + s + "\");\n");
		}
		for (String s : classIntegrity) {
			hasIntegrity = hasIntegrity || methodSignature.equals(s);
			before.append("integritySet.add(\"" + s + "\");\n");
		}

		// Print called method
		if (DEBUG) {
			before.append("System.out.println(\"[Instrumentation] this method: ").append(methodSignature)
					.append(" secrecy=\"+secrecySet+\" integrity=\"+integritySet);\n");
		}

		if (Modifier.isStatic(ctBehavior.getModifiers())) {
			before.append("Class thisClass = ").append(declaringClass.getName()).append(".class;\n");
		} else {
			before.append("Class thisClass = getClass();\n");
		}

		// Add called method to stack
		before.append("carisma.rt.instrument.RTAnnotation o = new carisma.rt.instrument.RTAnnotation(\"")
				.append(RTHelper.getSignature(ctBehavior)).append("\" , thisClass, secrecySet, integritySet);\n")
				.append("carismaRtStack.push(o);\n");

		// Only perform the security check if there was an element on the stack and it
		// is not defined in the same class
		before.append("if(annot != null && !annot.getClazz().equals(thisClass)){\n\t");

		// Get the caller and its security properties
		before.append("boolean callerHasSecrecy = annot.hasSecrecy(\"").append(methodSignature).append("\");\n\t")
				.append("boolean callerHasIntegrity = annot.hasIntegrity(\"").append(methodSignature)
				.append("\");\n\t");

		// Print caller
		if (DEBUG) {
			before.append(
					"System.out.println(\"[Instrumentation] prev method: \"+annot.getSignature()+\" secrecy=\"+secrecy+\" integrity=\"+integrity);\n\t");
		}

		before.append("java.util.Set violations = new java.util.HashSet();\n\t");

		// if the instrumented method has secrecy add code for checking the caller for
		// secrecy
		if (hasSecrecy) {
			before.append("if(!callerHasSecrecy){\n\t\t")
					.append("System.err.println(\"[SECURITY VIOLATION SECRECY] - The member ").append(methodSignature)
					.append(" requires secrecy but the accessor \"+annot.getSignature()+\" doesn't provide secrecy.\");\n\t\t")
					.append("violations.add(\"secrecy\");\n\t\t");

			CtClass returnType = getReturnType(ctBehavior, declaringClass);
			String earlyReturnSecrecy = RTHelper.getEarlyReturn(declaringClass, returnType,
					secrecyAnnotation.earlyReturn());
			if (earlyReturnSecrecy != null) {
				before.append("System.err.println(\"[SECURITY VIOLATION SECRECY] - early return\");\n\t\t")
						// Add call early return;
						.append("return ").append(earlyReturnSecrecy).append(";\n"); // TODO: move behind print
			}
			before.append("}\n\t");
		} else {
			// Add check if this method provides secrecy in case the caller requires it
			before.append(
					"if(callerHasSecrecy){\n\t\t System.err.println(\"[SECURITY VIOLATION SECRECY] - The accessor \"+annot.getSignature()+\" requires secrecy but the member ")
					.append(methodSignature)
					.append(" doesn't provide secrecy.\"); violations.add(\"secrecy\");\n\t }\n\t");
		}

		if (hasIntegrity) {
			// if the instrumented method has integrity add code for checking the caller for
			// integrity
			before.append("if(!annot.hasIntegrity(\"").append(methodSignature).append("\")){\n\t\t");
			before.append("System.err.println(\"[SECURITY VIOLATION INTEGRITY] - The member ").append(methodSignature)
					.append(" requires integrity but the accessor \"+annot.getSignature()+\" doesn't provides integrity.\");\n\t\t");
			before.append("violations.add(\"integrity\");\n\t\t");

			CtClass returnType = getReturnType(ctBehavior, declaringClass);
			String earlyReturnIntegrity = RTHelper.getEarlyReturn(declaringClass, returnType,
					integrityAnnotation.earlyReturn());
			if (earlyReturnIntegrity != null) {
				before.append("System.err.println(\"[SECURITY VIOLATION INTEGRITY] - early return\");\n\t\t")
						// Add call of early return
						.append("return ").append(earlyReturnIntegrity).append(";\n\t"); // TODO: move behind print;
			}
			before.append("}\n\t");
		} else {
			// Add check if this method provides integrity in case the caller requires it,
			// this can only lead to a problem if this method doesn't have integrity
			before.append(
					"if(callerHasIntegrity){\n\t\t System.err.println(\"[SECURITY VIOLATION INTEGRITY] - The accessor \"+annot.getSignature()+\" requires integrity but the member ")
					.append(methodSignature)
					.append(" doesn't provide integrity.\");\n\t\t violations.add(\"integrity\");\n\t }\n\t");
		}

		// If there were violations in the previous checks start printing
		before.append(
				"if(!violations.isEmpty()){\n\t\t carismaRtStack.print(violations);\n\t\t throw new java.lang.SecurityException(\"UMLsecRT: \"+violations.toString());\n\t }\n");

		before.append("}");

//		before = new StringBuilder("int b = 0;");
		try {
			if (ctBehavior instanceof CtConstructor) {
				((CtConstructor) ctBehavior).insertBeforeBody(before.toString());
			} else {
				ctBehavior.insertBefore(before.toString());
			}
		} catch (CannotCompileException e) {
//			System.out.println("[Agent] ------------------------------------");
//			System.out.println("[Agent] ----> ctBehavior.insertBefore(before);");
//			System.out.println("[Agent] Class: " + ctBehavior.getDeclaringClass().getName());
//			System.out.println("[Agent] Behavior: " + ctBehavior.getLongName());
//			if (ctBehavior instanceof CtMethod) {
//				System.out.println("[Agent] Behavior return: " + ((CtMethod) ctBehavior).getReturnType().getName());
//			}
//			for (CtClass ex : ctBehavior.getExceptionTypes()) {
//				System.out.println("[Agent] Exception type: " + ex.getName());
//			}
//			System.out.println("[Agent] ");
//			System.out.println("[Agent] " + e.getMessage());
//			System.out.println("[Agent] ");
//			System.out.println("[Agent] Inserted code:\n\n" + before.toString() + "\n\n");
//			System.out.println("[Agent] ");
//			System.out.println("[Agent] ------------------------------------");
//			System.exit(-1);
//			RTHelper.printAgentError(e);
			return false;
		}
		return true;
	}

	/**
	 * Gets the type of an early return value
	 * 
	 * @param ctBehavior The behavior
	 * @param ctClass    The class declaring the behavior
	 * @return The type
	 * @throws NotFoundException If there is an javaassist problem
	 */
	private CtClass getReturnType(CtBehavior ctBehavior, CtClass ctClass) throws NotFoundException {
		CtClass returnType = null;
		if (ctBehavior instanceof CtConstructor) {
			returnType = ctClass;
		} else if (ctBehavior instanceof CtMethod) {
			returnType = ((CtMethod) ctBehavior).getReturnType();
		} else {
			System.out.println("[AGENT] ERROR: unknown behavior: " + ctBehavior);
		}
		return returnType;
	}

	/**
	 * Adds the stack.pop() at the end of the method
	 * 
	 * @param ctBehavior The member to which the functionality should be added
	 * @return
	 */
	private boolean addAfterMethod(CtBehavior ctBehavior) {
		String string = "";
		if ("org.eclipse.osgi.internal.loader.BundleLoader".equals(ctBehavior.getDeclaringClass().getName())) {
			if ("createClassLoader".equals(ctBehavior.getName())) {
				string = "parent = new java.net.URLClassLoader(new java.net.URL[]{new java.net.URL(\""
						+ getClass().getProtectionDomain().getCodeSource().getLocation().toString() + "\")}, parent);";
			}
		}
		try {
			string += "carisma.rt.instrument.RTStackManager.getStack(java.lang.Thread.currentThread()).pop();";
//			string = "int a = 0;";
			ctBehavior.insertAfter(string);
		} catch (CannotCompileException e) {
			System.out.println("------> ctBehavior.insertAfter(after)");
			RTHelper.printAgentError(e);
			return false;
		}
		return true;
	}
}
