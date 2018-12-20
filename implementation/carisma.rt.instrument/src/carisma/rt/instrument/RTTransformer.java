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

		ClassPool cPool = ClassPool.getDefault();
		ClassPath byteArrayClassPath = new ByteArrayClassPath(classNameDotted, classfileBuffer);
		LoaderClassPath loaderClassPath = new LoaderClassPath(loader);

		cPool.appendClassPath(loaderClassPath);
		cPool.insertClassPath(byteArrayClassPath);

		try {
			bytecode = transform(classNameDotted, cPool);
		} catch (IOException | RuntimeException | ClassNotFoundException | NotFoundException
				| CannotCompileException e) {
			RTHelper.printAgentError(e);
			bytecode = classfileBuffer;
		}

		cPool.removeClassPath(loaderClassPath);
		cPool.removeClassPath(byteArrayClassPath);

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
	private byte[] transform(String classNameDotted, ClassPool cPool)
			throws NotFoundException, ClassNotFoundException, IOException, CannotCompileException {
		CtClass ctClass = cPool.get(classNameDotted);

		getAnnotations(ctClass);
		fieldCheck = new RTFieldAccessCheck(ctClass, classIntegrity, classSecrecy);

		for (CtBehavior behavior : ctClass.getDeclaredBehaviors()) {
			int modifiers = behavior.getModifiers();
			if (Modifier.isAbstract(modifiers) || Modifier.isNative(modifiers)) {
				continue;
			}
			try {
				if (!addSecurityCheck(behavior, classNameDotted)) {
					System.out.println("Couldn't instrument: " + behavior);
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

	private boolean addSecurityCheck(CtBehavior ctBehavior, String className)
			throws ClassNotFoundException, NotFoundException {
		if (ctBehavior instanceof CtConstructor) {
			if (((CtConstructor) ctBehavior).isClassInitializer()) {
				return true;
			}
		}

		if (DEBUG) {
			System.out.println("[Agent] Transform method: " + ctBehavior.getLongName());
		}
		if (!addBeforeMethod(ctBehavior, className)) {
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

	/**
	 * @param classSecrecy
	 * @param classIntegrity
	 * @param ctBehavior
	 * @param className
	 * @return
	 * @throws ClassNotFoundException
	 * @throws NotFoundException
	 * @throws CannotCompileException
	 */
	private boolean addBeforeMethod(CtBehavior ctBehavior, String className)
			throws ClassNotFoundException, NotFoundException {
		CtClass methodDeclaringClass = ctBehavior.getDeclaringClass();

		String earlyReturnIntegrity = null;
		String earlyReturnSecrecy = null;

		CtClass returnType = null;
		if (ctBehavior instanceof CtConstructor) {
			returnType = methodDeclaringClass;
		} else if (ctBehavior instanceof CtMethod) {
			returnType = ((CtMethod) ctBehavior).getReturnType();
		} else {
			System.out.println("[AGENT] ERROR: unknown behavior: " + ctBehavior);
		}

		final Integrity integrityAnnotation = (Integrity) ctBehavior.getAnnotation(Integrity.class);
		boolean hasIntegrity = integrityAnnotation != null;
		if (hasIntegrity) {
			earlyReturnIntegrity = RTHelper.getEarlyReturn(methodDeclaringClass, returnType,
					integrityAnnotation.earlyReturn());
		}

		final Secrecy secrecyAnnotation = (Secrecy) ctBehavior.getAnnotation(Secrecy.class);
		boolean hasSecrecy = secrecyAnnotation != null;
		if (hasSecrecy) {
			earlyReturnSecrecy = RTHelper.getEarlyReturn(methodDeclaringClass, returnType,
					secrecyAnnotation.earlyReturn());
		}

		String before = "";
		if (DEBUG) {
			before += "System.out.println(\"[Instrumentation]\\n[Instrumentation] Method call:\");";
		}

		String methodSignature = ctBehavior.getLongName();
		
		// Collect secrecy and integrity information about called method
		before += "java.util.Set secrecySet = new java.util.HashSet();"
				+ "java.util.Set integritySet = new java.util.HashSet();";
		for (String s : classSecrecy) {
			hasSecrecy = hasSecrecy || methodSignature.equals(s);
			before += "secrecySet.add(\"" + s + "\");";
		}
		for (String s : classIntegrity) {
			hasIntegrity = hasIntegrity || methodSignature.equals(s);
			before += "integritySet.add(\"" + s + "\");";
		}

		// Print called method
		if (DEBUG) {
			before += "System.out.println(\"[Instrumentation] this method: " + methodSignature
					+ " secrecy=\"+secrecySet+\" integrity=\"+integritySet);";
		}

		// Get stack
		before += "try{";
		before += "carisma.rt.instrument.RTStack$PrintableStack s = carisma.rt.instrument.RTStack.getStack(java.lang.Thread.currentThread());";

		// Get Top of stack
		before += "carisma.rt.instrument.RTStack$RTAnnotation annot = null;";
		before += "if(!s.isEmpty()){";
		before += "annot = (carisma.rt.instrument.RTStack$RTAnnotation) s.peek();";
		before += "}";

		// Add called method to stack
		before += "carisma.rt.instrument.RTStack$RTAnnotation o = new carisma.rt.instrument.RTStack$RTAnnotation(\""
				+ RTHelper.getSignature(ctBehavior) + "\" , " + className + ".class, secrecySet, integritySet);"
				+ "s.push(o);";

		// Only perform the security check if there was an element on the stack
		before += "if(annot != null){";

		// Get the caller and its security properties
		before += "boolean callerSecrecy = annot.hasSecrecy(\""+methodSignature+"\");"
				+ "boolean callerIntegrity = annot.hasIntegrity(\""+methodSignature+"\");";

		// Print caller
		if (DEBUG) {
			before += "System.out.println(\"[Instrumentation] prev method: \"+annot.getSignature()+\" secrecy=\"+secrecy+\" integrity=\"+integrity);";
		}

		before += "java.util.Set violations = new java.util.HashSet();";

		// if the instrumented method has secrecy add code for checking the caller for
		// secrecy
		if (hasSecrecy) {
			before += "if(!callerSecrecy){";
			before += "System.err.println(\"[SECURITY VIOLATION SECRECY] - The member " + methodSignature
					+ " requires secrecy but the accessor \"+annot.getSignature()+\" doesn't provide secrecy.\");";
			before += "violations.add(\"secrecy\");";
			if (earlyReturnSecrecy != null) {
				before += "System.err.println(\"[SECURITY VIOLATION SECRECY] - early return\");"
						// Add call early return;
						+ "return " + earlyReturnSecrecy + ";"; // TODO: move behind print
			}
			before += "}";
		}

		// if the instrumented method has integrity add code for checking the caller for
		// integrity
		if (hasIntegrity) {
			before += "if(!annot.hasIntegrity(\"" + methodSignature + "\")){";
			before += "System.err.println(\"[SECURITY VIOLATION INTEGRITY] - The member " + methodSignature
					+ " requires integrity but the accessor \"+annot.getSignature()+\" doesn't provides integrity.\");";
			before += "violations.add(\"integrity\");";
			if (earlyReturnIntegrity != null) {
				before += "System.err.println(\"[SECURITY VIOLATION INTEGRITY] - early return\");"
						// Add call of early return
						+ "return " + earlyReturnIntegrity + ";"; // TODO: move behind print;
			}
			before += "}";
		}

		// Add check if this method provides secrecy in case the caller requires it
		before += "if(callerSecrecy && "+!hasSecrecy+"){"
				+ "System.err.println(\"[SECURITY VIOLATION SECRECY] - The accessor \"+annot.getSignature()+\" requires secrecy but the member "
				+ methodSignature + " doesn't provide secrecy.\");"
				// Add secrecy to the list of violations
				+ "violations.add(\"secrecy\");" + "}";

		// Add check if this method provides integrity in case the caller requires it
		before += "if(callerIntegrity && "+!hasIntegrity+"){"
				+ "System.err.println(\"[SECURITY VIOLATION INTEGRITY] - The accessor \"+annot.getSignature()+\" requires integrity but the member "
				+ methodSignature + " doesn't provide integrity.\");"
				// Add integrity to the list of violations
				+ "violations.add(\"integrity\");" + "}";

		// If there were violations in the previous checks start printing
		before += "if(!violations.isEmpty()){"
				+ "s.print(violations);"
				+ "throw new java.lang.SecurityException(\"UMLsecRT: \"+violations.toString());" + "}";

		before += "}";

		before += "}catch(SecurityException e) {" + "throw e;" + "}" + "catch(Exception e) {"
				+ "System.out.println(\"[Instrumentation] ERROR (\"+e.getClass().getSimpleName()+\"): \"+e.getLocalizedMessage());"
				+ "System.exit(-1);" + "}"
//				+ "long duration = System.nanoTime() - start;"
//				+ "try { "
//				+ "java.nio.file.Files.write(java.nio.file.Paths.get(\"duration.txt\", new String[0]), (java.lang.Long.toString(duration)+\"\\n\").getBytes(), new java.nio.file.StandardOpenOption[]{java.nio.file.StandardOpenOption.APPEND, java.nio.file.StandardOpenOption.CREATE});" + 
//				"}catch (java.io.IOException e) {}"
		;

		try {
			if (ctBehavior instanceof CtConstructor) {
				((CtConstructor) ctBehavior).insertBeforeBody(before);
			} else {
				ctBehavior.insertBefore(before);
			}
		} catch (CannotCompileException e) {
			System.out.println("----> ctBehavior.insertBefore(before);");
			System.out.println();
			System.out.println(before);
			System.out.println();
			RTHelper.printAgentError(e);
			return false;
		}
		return true;
	}

	/**
	 * Adds the stack.pop() at the end of the method
	 * 
	 * @param ctBehavior The member to which the functionality should be added
	 * @return
	 */
	private boolean addAfterMethod(CtBehavior ctBehavior) {
		try {
			ctBehavior.insertAfter("carisma.rt.instrument.RTStack.getStack(java.lang.Thread.currentThread()).pop();");
		} catch (CannotCompileException e) {
			System.out.println("------> ctBehavior.insertAfter(after)");
			RTHelper.printAgentError(e);
			return false;
		}
		return true;
	}
}
