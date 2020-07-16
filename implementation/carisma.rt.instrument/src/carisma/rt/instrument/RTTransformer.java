package carisma.rt.instrument;

import java.lang.instrument.ClassFileTransformer;
import java.lang.instrument.IllegalClassFormatException;
import java.security.ProtectionDomain;
import java.util.HashSet;
import org.gravity.security.annotations.requirements.Critical;
import org.gravity.security.annotations.requirements.Integrity;
import org.gravity.security.annotations.requirements.Secrecy;

import java.io.IOException;

import javassist.ByteArrayClassPath;
import javassist.CannotCompileException;
import javassist.ClassPath;
import javassist.ClassPool;
import javassist.CtBehavior;
import javassist.CtClass;
import javassist.CtConstructor;
import javassist.CtMethod;
import javassist.LoaderClassPath;
import javassist.Modifier;
import javassist.NotFoundException;

public class RTTransformer implements ClassFileTransformer {

	private RTFieldAccessCheck fieldCheck;
	private String[] classSecrecy;
	private String[] classIntegrity;

	private final ClassPool cPool = ClassPool.getDefault();
	private final HashSet<ClassLoader> loaders = new HashSet<>();

	public RTTransformer() throws NotFoundException {
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

		String classNameDotted = className.replace("/", ".");

		// This class loader is used to generate java classes from python that cannot be
		// part of a security check
//		if ("org.python.core.BytecodeLoader$Loader".equals(loader.getClass().getName())) {
//			return classfileBuffer;
//		}
//		if (classNameDotted.contains("___exposer")) {
//			return classfileBuffer;
//		}
//		if (className.contains("$$EnhancerByCGLIB$$")) {
//			return classfileBuffer;
//		}

		if (classNameDotted.startsWith("carisma.rt.instrument.") || classNameDotted.startsWith("javassist.")) {
			return classfileBuffer;
		}

		registerClass(loader, classfileBuffer, classNameDotted);
		CtClass ctClass;
		try {
			ctClass = cPool.get(classNameDotted);
		} catch (NotFoundException e) {
			RTHelper.printAgentError(e);
			return classfileBuffer;
		}
		// Interfaces cannot contain concrete methods
		if (!ctClass.isInterface()) {
			if (ctClass.isFrozen()) {
				ctClass.defrost();
			}
			try {
				return transformClass(ctClass);
			} catch (IOException | RuntimeException | ClassNotFoundException | NotFoundException
					| CannotCompileException e) {
				RTHelper.printAgentError(e);
			}
		}
		return classfileBuffer;
	}

	/**
	 * @param classloader
	 * @param classfileBuffer
	 * @param classNameDotted
	 */
	private void registerClass(ClassLoader classloader, byte[] classfileBuffer, String classNameDotted) {
		if (!loaders.contains(classloader)) {
			LoaderClassPath loaderClassPath = new LoaderClassPath(classloader);
			cPool.appendClassPath(loaderClassPath);
			loaders.add(classloader);
		}
		ClassPath byteArrayClassPath = new ByteArrayClassPath(classNameDotted, classfileBuffer);
		cPool.insertClassPath(byteArrayClassPath);
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
	private byte[] transformClass(CtClass ctClass)
			throws NotFoundException, ClassNotFoundException, IOException, CannotCompileException {
		Critical critical = (Critical) ctClass.getAnnotation(Critical.class);
		if (critical != null) {
			classSecrecy = critical.secrecy();
			classIntegrity = critical.integrity();
		} else {
			classSecrecy = new String[0];
			classIntegrity = new String[0];
		}

		fieldCheck = new RTFieldAccessCheck(ctClass, classIntegrity, classSecrecy);

		for (CtBehavior behavior : ctClass.getDeclaredBehaviors()) {
			int modifiers = behavior.getModifiers();
			if (Modifier.isAbstract(modifiers) || Modifier.isNative(modifiers) || behavior.isEmpty()) {
				continue;
			}
			try {
				if (!addSecurityCheck(ctClass, behavior)) {
					System.out.println("[AGENT] Couldn't instrument: " + behavior.getLongName());
				}
			} catch (NotFoundException e) {
				RTHelper.printAgentError(e);
			}
		}
		return ctClass.toBytecode();

	}

	private boolean addSecurityCheck(CtClass declaringClass, CtBehavior behavior)
			throws ClassNotFoundException, NotFoundException {
		boolean isConstructor = behavior instanceof CtConstructor;
		if (isConstructor && ((CtConstructor) behavior).isClassInitializer()) {
			return true;
		}
		if (!addBeforeMethod(declaringClass, behavior, isConstructor)) {
			return false;
		}
		if (!addAfterMethod(behavior, declaringClass)) {
			return false;
		}
		try {
			behavior.instrument(fieldCheck);
		} catch (CannotCompileException e) {
			RTHelper.printAgentError(e);
			return false;
		}
		return true;
	}

	private boolean addBeforeMethod(CtClass declaringClass, CtBehavior ctBehavior, boolean isConstructor)
			throws ClassNotFoundException, NotFoundException {

		String signature = ctBehavior.getLongName();

		Secrecy secrecyAnnotation = null;
		Integrity integrityAnnotation = null;
		for (Object o : ctBehavior.getAnnotations()) {
			if (o instanceof Secrecy) {
				secrecyAnnotation = (Secrecy) o;
			} else if (o instanceof Integrity) {
				integrityAnnotation = (Integrity) o;
			}
		}

		boolean hasSecrecyAnnotation = secrecyAnnotation != null;
		boolean hasSecrecy = hasSecrecyAnnotation;
		int secrecyArrayLength = classSecrecy.length;
		if (hasSecrecy) {
			secrecyArrayLength++;
		}

		// Get stack
		StringBuilder before = new StringBuilder("{String thisSignature = \"").append(signature).append(
				"\";carisma.rt.instrument.RTStack carismaRTStack = carisma.rt.instrument.RTStackManager.getStack();carisma.rt.instrument.RTAnnotation annotCaller = (carisma.rt.instrument.RTAnnotation) carismaRTStack.peek();java.lang.String[] secrecySet = new java.lang.String["
						+ secrecyArrayLength + "];");
		if (hasSecrecyAnnotation) {
			before.append("secrecySet[0]=thisSignature;");
		}

		int secrecyIndex = 1;
		for (String s : classSecrecy) {
			hasSecrecy = hasSecrecy || signature.endsWith(s);
			before.append("secrecySet[").append(secrecyIndex++).append("]=\"").append(s).append("\";");
		}

		boolean hasIntegrityAnnotation = integrityAnnotation != null;
		boolean hasIntegrity = hasIntegrityAnnotation;
		int integrityArrayLength = classIntegrity.length;
		if (hasIntegrity) {
			integrityArrayLength++;
		}

		before.append("java.lang.String[] integritySet = new java.lang.String[").append(integrityArrayLength)
				.append("];");
		if (hasIntegrityAnnotation) {
			before.append("integritySet[0]=thisSignature;");
		}
		int integrityIndex = 1;
		for (String s : classIntegrity) {
			hasIntegrity = hasIntegrity || signature.endsWith(s);
			before.append("integritySet[").append(integrityIndex++).append("]=\"").append(s).append("\";");
		}

		if (Modifier.isStatic(ctBehavior.getModifiers())) {
			before.append("java.lang.Class thisClass = ").append(declaringClass.getName()).append(".class;");
		} else {
			// Get class is 25% to 50% faster than static class access
			before.append("java.lang.Class thisClass = getClass();");
		}

		// Add called method to stack
		before.append(
				"carisma.rt.instrument.RTAnnotation thisAnnot= new carisma.rt.instrument.RTAnnotation(thisSignature, thisClass, secrecySet, integritySet); carismaRTStack.push(thisAnnot);if(annotCaller != null && !annotCaller.getClazz().equals(thisClass)){boolean callerHasSecrecy = annotCaller.hasSecrecy(thisSignature);boolean callerHasIntegrity = annotCaller.hasIntegrity(thisSignature);String violationSecrecy=null;String violationIntegrity=null;");

		// if the instrumented method has secrecy add code for checking the caller for
		// secrecy
		if (hasSecrecy) {
			before.append(
					"if(!callerHasSecrecy){violationSecrecy = \"[SECURITY VIOLATION SECRECY] - The member \"+thisSignature+\" requires secrecy but the accessor \"+annotCaller.getSignature()+\" doesn't provide secrecy.\";System.err.println(violationSecrecy);");
			if (hasSecrecyAnnotation) {
				CtClass returnType = getReturnType(ctBehavior, declaringClass);
				String earlyReturnSecrecy = RTHelper.getEarlyReturn(declaringClass, returnType,
						secrecyAnnotation.earlyReturn());
				if (earlyReturnSecrecy != null) {
					before.append(
							"violationIntegrity=\"[SECURITY VIOLATION SECRECY] - early return\";System.err.println(violationIntegrity);carismaRTStack.print(violationIntegrity);return ")
							.append(earlyReturnSecrecy).append(";");
				}
			}
			before.append("}");
		} else {
			// Add check if this method provides secrecy in case the caller requires it
			before.append(
					"if(callerHasSecrecy){ violationSecrecy = \"[SECURITY VIOLATION SECRECY] - The accessor \"+annotCaller.getSignature()+\" requires secrecy but the member \"+thisSignature+\" doesn't provide secrecy.\";System.err.println(violationSecrecy);}");
		}

		if (hasIntegrity) {
			// if the instrumented method has integrity add code for checking the caller for
			// integrity
			before.append(
					"if(!annotCaller.hasIntegrity(thisSignature)){violationIntegrity = \"[SECURITY VIOLATION INTEGRITY] - The member \"+thisSignature\" requires integrity but the accessor \"+annotCaller.getSignature()+\" doesn't provides integrity.\";System.err.println(violationIntegrity);");
			if (hasIntegrityAnnotation) {
				CtClass returnType = getReturnType(ctBehavior, declaringClass);
				String earlyReturnIntegrity = RTHelper.getEarlyReturn(declaringClass, returnType,
						integrityAnnotation.earlyReturn());
				if (earlyReturnIntegrity != null) {
					before.append(
							"violationIntegrity=\"[SECURITY VIOLATION INTEGRITY] - early return\";System.err.println();carismaRTStack.print(violationIntegrity);return ")
							.append(earlyReturnIntegrity).append(";");
				}
			}
			before.append("}");
		} else {
			// Add check if this method provides integrity in case the caller requires it,
			// this can only lead to a problem if this method doesn't have integrity
			before.append(
					"if(callerHasIntegrity){ violationIntegrity = \"[SECURITY VIOLATION INTEGRITY] - The accessor \"+annotCaller.getSignature()+\" requires integrity but the member \"+thisSignature+\" doesn't provide integrity.\";System.err.println(violationIntegrity);}");
		}

		// If there were violations in the previous checks start printing
		before.append(
				"if(violationSecrecy!=null){carismaRTStack.print(violationSecrecy); throw new java.lang.SecurityException(\"UMLsecRT: \"+violationSecrecy);}if(violationIntegrity!=null){ carismaRTStack.print(violationIntegrity); throw new java.lang.SecurityException(\"UMLsecRT: \"+violationIntegrity);}}}");
		try {
			if (isConstructor) {
				((CtConstructor) ctBehavior).insertBeforeBody(before.toString());
			} else {
				ctBehavior.insertBefore(before.toString());
			}
		} catch (CannotCompileException e) {
			RTHelper.printAgentError(e);
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
	 * @param ctClass
	 * @param stackName
	 * @return
	 */
	private boolean addAfterMethod(CtBehavior ctBehavior, CtClass ctClass) {
		String string = "";
		if ("org.eclipse.osgi.internal.loader.BundleLoader".equals(ctClass.getName())
				&& "createClassLoader".equals(ctBehavior.getName())) {
			string = "parent = new java.net.URLClassLoader(new java.net.URL[]{new java.net.URL(\""
					+ getClass().getProtectionDomain().getCodeSource().getLocation().toString() + "\")}, parent);";

		}

		try {
			ctBehavior.insertAfter(string + "carisma.rt.instrument.RTStackManager.getStack().pop();", true);
		} catch (CannotCompileException e) {
			System.out.println("------> ctBehavior.insertAfter(after)");
			RTHelper.printAgentError(e);
			return false;
		}
		return true;
	}
}
