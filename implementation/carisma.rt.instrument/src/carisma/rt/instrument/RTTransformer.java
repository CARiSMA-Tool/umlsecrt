package carisma.rt.instrument;

import java.lang.instrument.ClassFileTransformer;
import java.lang.instrument.IllegalClassFormatException;
import java.security.ProtectionDomain;
import java.util.ArrayList;
import java.util.Arrays;
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
import javassist.expr.ExprEditor;
import javassist.expr.FieldAccess;

public class RTTransformer implements ClassFileTransformer {

	private String url;

	public RTTransformer() {
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
			ClassPool cPool = ClassPool.getDefault();
			CtClass ctClass = cPool.makeClass(new ByteArrayInputStream(classfileBuffer));

			Set<String> classSecrecy = new HashSet<>();
			Set<String> classIntegrity = new HashSet<>();

			Critical critical = (Critical) ctClass.getAnnotation(Critical.class);
			if (critical != null) {
				for (String s : critical.secrecy()) {
					classSecrecy.add(s);
				}
				for (String i : critical.integrity()) {
					classIntegrity.add(i);
				}
			}

			for (CtMethod method : ctClass.getDeclaredMethods()) {
				prepare(classSecrecy, classIntegrity, method, loader);
			}
			for (CtConstructor constructor : ctClass.getDeclaredConstructors()) {
				prepare(classSecrecy, classIntegrity, constructor, loader);
			}
			return ctClass.toBytecode();
		} catch (IOException e) {
			throw new IllegalClassFormatException(e.getMessage());
		} catch (RuntimeException e) {
			throw new IllegalClassFormatException(e.getMessage());
		} catch (CannotCompileException e) {
			System.out.println("ERROR: " + e.getLocalizedMessage());
			throw new IllegalClassFormatException(e.getMessage());
		} catch (ClassNotFoundException e) {
			throw new IllegalClassFormatException(e.getMessage());
		}

	}

	private void prepare(Set<String> classSecrecy, Set<String> classIntegrity, CtBehavior ctBehavior,
			ClassLoader loader) throws ClassNotFoundException, CannotCompileException {
		System.out.println("[Agent] Transform method: " + ctBehavior.getLongName());
		CtClass methodDeclaringClass = ctBehavior.getDeclaringClass();

		ArrayList<String> secrecy = new ArrayList<>(classSecrecy);
		final Secrecy secrecyAnnotation = (Secrecy) ctBehavior.getAnnotation(Secrecy.class);
		boolean hasSecrecy = secrecyAnnotation != null;
		String earlyReturnSecrecy = null;
		if (hasSecrecy) {
			secrecy.add(ctBehavior.getLongName());
			earlyReturnSecrecy = getEarlyReturn(ctBehavior, secrecyAnnotation.earlyReturn());
		}

		ArrayList<String> integrity = new ArrayList<>(classIntegrity);
		final Integrity integrityAnnotation = (Integrity) ctBehavior.getAnnotation(Integrity.class);
		boolean hasIntegrity = integrityAnnotation != null;
		String earlyReturnIntegrity = null;
		if (hasIntegrity) {
			integrity.add(ctBehavior.getLongName());
			earlyReturnIntegrity = getEarlyReturn(ctBehavior, integrityAnnotation.earlyReturn());
		}

		String before = "System.out.println(\"[Instrumentation]\\n[Instrumentation] Method call:\");";

		// Collect secrecy and integrity information about called method
		before += "java.util.Set secrecySet = new java.util.HashSet();"
				+ "java.util.Set integritySet = new java.util.HashSet();";
		for (String s : secrecy) {
			before += "secrecySet.add(\"" + s + "\");";
		}
		for (String s : integrity) {
			before += "integritySet.add(\"" + s + "\");";
		}

		// Print called method
		before += "System.out.println(\"[Instrumentation] this method: " + ctBehavior.getLongName()
				+ " secrecy=\"+secrecySet+\" integrity=\"+integritySet);";

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
				+ "\", secrecySet, integritySet});" + "s.add(o);"
				+ "System.out.println(\"[Instrumentation] stack.add(\\\"" + ctBehavior.getLongName() + "\\\")\");";

		// Only perform the security check if there was an element on the stack
		before += "if(annot != null){";

		// Get the caller and its security properties
		before += "java.lang.String caller = (java.lang.String) annot.getClass().getDeclaredMethod(\"getMethod\", new java.lang.Class[0]).invoke(annot, new java.lang.Object[0]);";
		before += "java.util.Set secrecy = (java.util.Set) annot.getClass().getDeclaredMethod(\"getSecrecy\", new java.lang.Class[0]).invoke(annot, new java.lang.Object[0]);";
		before += "java.util.Set integrity = (java.util.Set) annot.getClass().getDeclaredMethod(\"getIntegrity\", new java.lang.Class[0]).invoke(annot, new java.lang.Object[0]);";

		// Print caller
		before += "System.out.println(\"[Instrumentation] prev method: \"+ caller+\" secrecy=\"+secrecy+\" integrity=\"+integrity);";

		if (hasIntegrity || classIntegrity.contains(ctBehavior.getLongName())) {
			before += "if(!integrity.contains(\"" + ctBehavior.getLongName() + "\")){";
			before += "System.err.println(\"[SECURITY VIOLATION INTEGRITY] - Kind 1\");";
			if (earlyReturnIntegrity != null) {
				before += "System.err.println(\"[SECURITY VIOLATION INTEGRITY] - early return\");" + "return "
						+ earlyReturnIntegrity + ";";
			}
			before += "}";
		}
		if (hasSecrecy || classSecrecy.contains(ctBehavior.getLongName())) {
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

		String after = "try{"
				+ "java.net.URLClassLoader loader = java.net.URLClassLoader.newInstance(new java.net.URL[]{new java.net.URL(\""
				+ url + "\")});"
				+ "java.util.Stack s = (java.util.Stack) loader.loadClass(\"carisma.rt.instrument.RTStack\").getDeclaredMethod(\"getStack\", new java.lang.Class[]{java.lang.Object.class}).invoke(null, new java.lang.Object[]{java.lang.Thread.currentThread()});"
				+ "System.out.println(\"[Instrumentation] stack.pop(\\\"\"+s.pop()+\"\\\")\");"
				+ "}catch(Exception e) {e.printStackTrace();System.exit(-1);}";
		ctBehavior.insertAfter(after);

		ctBehavior.instrument(new ExprEditor() {
			@Override
			public void edit(FieldAccess f) throws CannotCompileException {
				super.edit(f);
				try {
					CtField field = f.getField();
					if (field.getDeclaringClass().equals(methodDeclaringClass)) {
						return;
					}
					String fieldSignature = field.getDeclaringClass().getName()+"."+field.getName()+":"+field.getType().getSimpleName();
					Critical fieldClassCritical = (Critical) field.getDeclaringClass().getAnnotation(Critical.class);

					Secrecy fieldSecrecy = (Secrecy) field.getAnnotation(Secrecy.class);
					Set<String> fieldSecrecySignatures = new HashSet<>();
					Integrity fieldIntegrity = (Integrity) field.getAnnotation(Integrity.class);
					Set<String> fieldIntegritySignatures = new HashSet<String>();
					if (fieldClassCritical != null) {
						fieldSecrecySignatures.addAll(Arrays.asList(fieldClassCritical.secrecy()));
						fieldIntegritySignatures.addAll(Arrays.asList(fieldClassCritical.integrity()));
					}
					if (fieldSecrecy != null) {
						fieldSecrecySignatures.add(fieldSignature);
					}
					if(fieldIntegrity != null) {
						fieldIntegritySignatures.add(fieldSignature);
					}
					
					// Check secrecy only for read
					if (f.isReader() && (fieldSecrecy != null || fieldSecrecySignatures.contains(fieldSignature))) {
						if (!secrecy.contains(fieldSignature)) {
							System.out.println("[AGENT] SECURITY VIOLATION SECRECY - Fieldaccessor has no secrecy: " + fieldSignature);
						} 
					}
					
					// Check integrity only for write
					if(f.isWriter() && (fieldIntegrity != null || fieldIntegritySignatures.contains(fieldSignature))) {
						if(!integrity.contains(fieldSignature)) {
							System.out.println("[AGENT] SECURITY VIOLATION INTEGRITY - Fieldaccessor has no integrity: " + fieldSignature);
						}
						
					}
					
					if(secrecy.contains(fieldSignature) && !fieldSecrecySignatures.contains(fieldSignature)) {
						System.out.println("[AGENT] SECURITY VIOLATION SECRECY - Field has no secrecy: " + fieldSignature);
					}
					if(integrity.contains(fieldSignature) && !fieldIntegritySignatures.contains(fieldSignature)) {
						System.out.println("[AGENT] SECURITY VIOLATION INTEGRITY - Field has no integrity: " + fieldSignature);
					}
							
				} catch (NotFoundException | ClassNotFoundException e) {
					System.out.println("ERROR: " + e.getLocalizedMessage());
				}
			}
		});
	}

	private String getEarlyReturn(CtBehavior behavior, String earlyReturn) {
		System.out.println("get early return for: \"" + earlyReturn + "\"");
		if (earlyReturn == null || earlyReturn.length() == 0) {
			return null;
		} else if ("null".equals(earlyReturn.toLowerCase())) {
			return "null";
		} else {
			if ("void".equals(earlyReturn.toLowerCase())) {
				return "";
			} else if ("true".equals(earlyReturn.toLowerCase())) {
				return Boolean.toString(true);
			} else if ("false".equals(earlyReturn.toLowerCase())) {
				return Boolean.toString(false);
			} else if ('"' == earlyReturn.charAt(0) && earlyReturn.charAt(earlyReturn.length() - 1) == '"') {
				return earlyReturn;
			} else {
				CtMethod method;
				try {
					method = behavior.getDeclaringClass().getDeclaredMethod(earlyReturn);
					if (method != null && method.getParameterTypes().length == 0) {
						CtClass expectedReturn = null;
						if (behavior instanceof CtMethod) {
							expectedReturn = ((CtMethod) behavior).getReturnType();
						} else {
							expectedReturn = behavior.getDeclaringClass();
						}
						if (method.getReturnType().equals(expectedReturn)) {
							return method.getName() + "()";
						}
					}
				} catch (NotFoundException e) {
					e.printStackTrace();
				}
				try {
					return Integer.toString(Integer.parseInt(earlyReturn));
				} catch (NumberFormatException e) {
					e.printStackTrace();
				}
				try {
					return Double.toString(Double.parseDouble(earlyReturn));
				} catch (NumberFormatException e) {
					e.printStackTrace();
				}
				System.err.println("Didn't found counter measure: " + earlyReturn);
				return null;
			}
		}
	}
}
