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
import javassist.CannotCompileException;
import javassist.ClassPool;
import javassist.CtBehavior;
import javassist.CtClass;
import javassist.CtConstructor;
import javassist.CtField;
import javassist.CtMethod;
import javassist.NotFoundException;

import static carisma.rt.instrument.RTAgent.DEBUG;

public class RTTransformer implements ClassFileTransformer {

	private String url;
	private RTFieldAccessCheck fieldCheck;
	private Set<String> classSecrecy;
	private Set<String> classIntegrity;
	private ClassPool cPool;

	public RTTransformer() {
		cPool = ClassPool.getDefault();
		url = "jar:file:" + getClass().getProtectionDomain().getCodeSource().getLocation().getFile() + "!/";
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

//		System.out.println("[Agent] Transform class: " + className+ "domain: "+protectionDomain);
		try {
			CtClass ctClass = cPool.makeClass(new ByteArrayInputStream(classfileBuffer));

			getAnnotations(ctClass);
			fieldCheck = new RTFieldAccessCheck(ctClass, classIntegrity, classSecrecy);

			for (CtBehavior behavior : ctClass.getDeclaredBehaviors()) {
				addSecurityCheck(behavior, loader);
			}
			return ctClass.toBytecode();
		} catch (IOException | RuntimeException | CannotCompileException | ClassNotFoundException e) {
			RTHelper.printAgentError(e);
			throw new IllegalClassFormatException(e.getMessage());
		}

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
				classSecrecy.add(RTHelper.getFieldSignature(field));
			}
			if (field.getAnnotation(Integrity.class) != null) {
				classIntegrity.add(RTHelper.getFieldSignature(field));
			}
		}
	}

	private void addSecurityCheck(CtBehavior ctBehavior, ClassLoader loader)
			throws ClassNotFoundException, CannotCompileException {
		if(DEBUG) {
			System.out.println("[Agent] Transform method: " + ctBehavior.getLongName());
		}
		addBeforeMethod(ctBehavior);
		addAfterMethod(ctBehavior);
		ctBehavior.instrument(fieldCheck);
	}

	/**
	 * @param classSecrecy
	 * @param classIntegrity
	 * @param ctBehavior
	 * @throws ClassNotFoundException
	 * @throws CannotCompileException
	 */
	private void addBeforeMethod(CtBehavior ctBehavior) throws ClassNotFoundException, CannotCompileException {
		CtClass methodDeclaringClass = ctBehavior.getDeclaringClass();

		CtClass returnType = null;
		if (ctBehavior instanceof CtConstructor) {
			returnType = methodDeclaringClass;
		} else if (ctBehavior instanceof CtMethod) {
			try {
				returnType = ((CtMethod) ctBehavior).getReturnType();
			} catch (NotFoundException e) {
				RTHelper.printAgentError(e);
			}
		} else {
			System.out.println("[AGENT] ERROR: unknown behavior: " + ctBehavior);
		}

		final Secrecy secrecyAnnotation = (Secrecy) ctBehavior.getAnnotation(Secrecy.class);
		String earlyReturnSecrecy = null;
		if (secrecyAnnotation != null) {
			earlyReturnSecrecy = RTHelper.getEarlyReturn(methodDeclaringClass, returnType,
					secrecyAnnotation.earlyReturn());
		}

		final Integrity integrityAnnotation = (Integrity) ctBehavior.getAnnotation(Integrity.class);
		String earlyReturnIntegrity = null;
		if (integrityAnnotation != null) {
			earlyReturnIntegrity = RTHelper.getEarlyReturn(methodDeclaringClass, returnType,
					integrityAnnotation.earlyReturn());
		}

		String before = "";
		if (DEBUG) {
			before += "System.out.println(\"[Instrumentation]\\n[Instrumentation] Method call:\");";
		}

		// Collect secrecy and integrity information about called method
		before += "java.util.Set secrecySet = new java.util.HashSet();"
				+ "java.util.Set integritySet = new java.util.HashSet();";
		for (String s : classSecrecy) {
			System.out.println("Class secrecy: "+s);
			before += "secrecySet.add(\"" + s + "\");";
		}
		for (String s : classIntegrity) {
			before += "integritySet.add(\"" + s + "\");";
		}

		// Print called method
		if (DEBUG) {
			before += "System.out.println(\"[Instrumentation] this method: " + ctBehavior.getLongName()
					+ " secrecy=\"+secrecySet+\" integrity=\"+integritySet);";
		}

		// Get stack
		before += "try{";
		before += "java.net.URLClassLoader loader = java.net.URLClassLoader.newInstance(new java.net.URL[]{new java.net.URL(\""
				+ url + "\")});"
				+ "java.util.Stack s = (java.util.Stack) loader.loadClass(\"carisma.rt.instrument.RTStack\").getDeclaredMethod(\"getStack\", new java.lang.Class[]{java.lang.Object.class}).invoke(null, new java.lang.Object[]{java.lang.Thread.currentThread()});";

		// Get Top of stack
		before += "java.lang.Object annot = null;";
		before += "if(!s.isEmpty()){";
		before += "annot = s.peek();";
		before += "}";

		// Add called method to stack
		before += "java.lang.Class cRTAnnotation = loader.loadClass(\"carisma.rt.instrument.RTStack$RTAnnotation\");"
				+ "java.lang.reflect.Constructor constr = cRTAnnotation.getDeclaredConstructor(new java.lang.Class[]{java.lang.String.class, java.util.Set.class, java.util.Set.class});"
				+ "java.lang.Object o = constr.newInstance(new java.lang.Object[]{\"" + ctBehavior.getLongName()
				+ "\", secrecySet, integritySet});" + "s.add(o);";

		// Only perform the security check if there was an element on the stack
		before += "if(annot != null){";

		// Get the caller and its security properties
		before += "java.lang.String caller = (java.lang.String) annot.getClass().getDeclaredMethod(\"getMethod\", new java.lang.Class[0]).invoke(annot, new java.lang.Object[0]);";
		before += "java.util.Set secrecy = (java.util.Set) annot.getClass().getDeclaredMethod(\"getSecrecy\", new java.lang.Class[0]).invoke(annot, new java.lang.Object[0]);";
		before += "java.util.Set integrity = (java.util.Set) annot.getClass().getDeclaredMethod(\"getIntegrity\", new java.lang.Class[0]).invoke(annot, new java.lang.Object[0]);";

		// Print caller
		if (DEBUG) {
			before += "System.out.println(\"[Instrumentation] prev method: \"+ caller+\" secrecy=\"+secrecy+\" integrity=\"+integrity);";
		}
		
		if (classIntegrity.contains(ctBehavior.getLongName())) {
			before += "if(!integrity.contains(\"" + ctBehavior.getLongName() + "\")){";
			before += "System.err.println(\"[SECURITY VIOLATION INTEGRITY] - Kind 1\");";
			if (earlyReturnIntegrity != null) {
				before += "System.err.println(\"[SECURITY VIOLATION INTEGRITY] - early return\");" + "return "
						+ earlyReturnIntegrity + ";";
			}
			before += "}";
		}
		if (classSecrecy.contains(ctBehavior.getLongName())) {
			before += "if(!secrecy.contains(\"" + ctBehavior.getLongName() + "\")){";

			before += "System.err.println(\"[SECURITY VIOLATION SECRECY] - Kind 1\");";
			if (earlyReturnSecrecy != null) {
				before += "System.err.println(\"[SECURITY VIOLATION SECRECY] - early return\");" + "return "
						+ earlyReturnSecrecy + ";";
			}
			before += "}";
		}

		before += "if(secrecy.contains(caller) && !secrecySet.contains(caller)){"
				+ "System.err.println(\"[SECURITY VIOLATION SECRECY] - Kind 2\");" + "}"
				+ "if(integrity.contains(caller) && !integritySet.contains(caller)){"
				+ "System.err.println(\"[SECURITY VIOLATION INTEGRITY] - Kind 2\");" + "}";

		before += "}";

		before += "}catch(Exception e) {System.out.println(\"ERROR: \"+e.getMessage());System.exit(-1);}";

		ctBehavior.insertBefore(before);
	}

	/**
	 * Adds the stack.pop() at the end of the method
	 * 
	 * @param ctBehavior The member to which the functionality should be added
	 * @throws CannotCompileException
	 */
	private void addAfterMethod(CtBehavior ctBehavior) throws CannotCompileException {
		String after = "try{";
				after += "java.net.URLClassLoader loader = java.net.URLClassLoader.newInstance(new java.net.URL[]{new java.net.URL(\""
				+ url + "\")});"
				+ "java.util.Stack s = (java.util.Stack) loader.loadClass(\"carisma.rt.instrument.RTStack\").getDeclaredMethod(\"getStack\", new java.lang.Class[]{java.lang.Object.class}).invoke(null, new java.lang.Object[]{java.lang.Thread.currentThread()});"
				+ "Object o = s.pop();";
				if(DEBUG) {
					after += "System.out.println(\"[Instrumentation] stack.pop(): \"+o);";
				}
				after += "}catch(Exception e) {e.printStackTrace();System.exit(-1);}";
		ctBehavior.insertAfter(after);
	}
}
