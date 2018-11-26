package carisma.rt.instrument;

import java.util.Arrays;
import java.util.Collection;

import org.gravity.security.annotations.requirements.Critical;
import org.gravity.security.annotations.requirements.Integrity;
import org.gravity.security.annotations.requirements.Secrecy;

import javassist.CannotCompileException;
import javassist.CtClass;
import javassist.CtField;
import javassist.CtMethod;
import javassist.NotFoundException;
import javassist.expr.ExprEditor;
import javassist.expr.FieldAccess;
import javassist.expr.MethodCall;
import static carisma.rt.instrument.RTAgent.DEBUG;

final class RTFieldAccessCheck extends ExprEditor {

	private final CtClass declaringClass;
	private final Collection<String> integrity;
	private final Collection<String> secrecy;
	private final String url;

	RTFieldAccessCheck(CtClass declaringClass, Collection<String> integrity, Collection<String> secrecy, String url) {
		this.declaringClass = declaringClass;
		this.integrity = integrity;
		this.secrecy = secrecy;
		this.url = url;
	}

	@Override
	public void edit(MethodCall methodCall) throws CannotCompileException {
		try {
			CtMethod reflectiveMethod = methodCall.getMethod(); //TODO: What to do if class is unknown (e.g. DACAPO)
			CtClass methodDeclaringClass = reflectiveMethod.getDeclaringClass();
			if ("java.lang.reflect.Field".equals(methodDeclaringClass.getName())) {
				final String reflectiveMethodName = reflectiveMethod.getName();
				if ("get".equals(reflectiveMethodName)) {
					String code = "String fieldSignature = $1.getClass().getName()+'.'+$0.getName()+':'+$0.getType().getSimpleName();\n";

					if (DEBUG) {
						code += "System.out.println(\"[INSTRUMENTATION] Reflective field access to: \"+fieldSignature);\n";
					}

					// Check if the field is on the secrecy level
					code += "boolean hasSecrecy = $0.isAnnotationPresent(org.gravity.security.annotations.requirements.Secrecy.class);\n"
							+ "if(!hasSecrecy){"
							+ "org.gravity.security.annotations.requirements.Critical critical = (org.gravity.security.annotations.requirements.Critical) $1.getClass().getAnnotation(org.gravity.security.annotations.requirements.Critical.class);\n"
							+ "if(critical!=null){"
							+ "hasSecrecy = java.util.Arrays.asList(critical.secrecy()).contains(fieldSignature);\n"
							+ "}" + "}";

					// Check if the caller requires the secrecy level for the field
					code += "boolean callerHasAnnotation = false;\n";
					for (String s : secrecy) {
						code += "callerHasAnnotation |= \"" + s + "\".equals(fieldSignature);\n";
					}

					// Check
					code += "if(hasSecrecy){" + "if(!callerHasAnnotation){"
							+ "System.out.println(\"[INSTRUMENTATION] JAVA REFLECTION - SECURITY VIOLATION SECRECY: The field \"+fieldSignature+\" requires secrecy but "
							+ declaringClass.getName() + " doesn't provide secrecy\");\n" + getPrintCode("secrecy", "fieldSignature", "$1.getClass()") + "}"
							+ "} else {" + "if(callerHasAnnotation){"
							+ "System.out.println(\"[INSTRUMENTATION] JAVA REFLECTION - SECURITY VIOLATION SECRECY: The caller "
							+ declaringClass.getName()
							+ " requires secrecy but \"+fieldSignature+\" doesn't provide secrecy\");\n"
							+ getPrintCode("secrecy", "fieldSignature", "$1.getClass()") + "}" + "}"

							+ "$_ = $0.get($1);\n"; //TODO: Store result of countermeasure in $_
					methodCall.replace(code);
				} else if ("set".equals(reflectiveMethodName)) {
					String code = "String fieldSignature = $1.getClass().getName()+'.'+$0.getName()+':'+$0.getType().getSimpleName();\n";
					if (DEBUG) {
						code += "System.out.println(\"[INSTRUMENTATION] Reflective field access to: \"+fieldSignature);\n";
					}

					// check if field has integrity level
					code += "boolean hasIntegrity = $0.isAnnotationPresent(org.gravity.security.annotations.requirements.Integrity.class);\n"
							+ "if(!hasIntegrity){"
							+ "org.gravity.security.annotations.requirements.Critical critical = (org.gravity.security.annotations.requirements.Critical) $1.getClass().getAnnotation(org.gravity.security.annotations.requirements.Critical.class);\n"
							+ "if(critical!=null){"
							+ "hasIntegrity = java.util.Arrays.asList(critical.integrity()).contains(fieldSignature);\n"
							+ "}" + "}";

					// check if caller has integrity for field
					code += "boolean callerHasAnnotation = false;\n";
					for (String s : integrity) {
						code += "callerHasAnnotation |= \"" + s + "\".equals(fieldSignature);\n";
					}

					code += "if(hasIntegrity){ " + "if(!callerHasAnnotation){"
					// If the caller has integrity the field needs integrity
							+ "System.out.println(\"[INSTRUMENTATION] JAVA REFLECTION - SECURITY VIOLATION INTEGRITY: The field \"+fieldSignature+\" requires integrity but "
							+ declaringClass.getName() + " doesn't provide integrity\");\n" + getPrintCode("integrity", "fieldSignature", "$1.getClass()") + "}"
							+ "} else {" + "if(callerHasAnnotation){"
							// If the caller doesn't has integrity but the field has integrity we have a
							// violation
							+ "System.out.println(\"[INSTRUMENTATION] JAVA REFLECTION - SECURITY VIOLATION INTEGRITY: caller "
							+ declaringClass.getName()
							+ " requires integrity but \"+fieldSignature+\" doesn't provide integrity\");\n"
							+ getPrintCode("integrity", "fieldSignature", "$1.getClass()") + "}" + "}" + "$0.set($1, $2);\n"; //TODO: Counter measure to get value of $2
					methodCall.replace(code);
				}
			}
		} catch (NotFoundException e) {
			RTHelper.printAgentError(e);
		}
	}

	@Override
	public void edit(FieldAccess fieldAccess) throws CannotCompileException {
		super.edit(fieldAccess);
		try {
			CtField field = fieldAccess.getField();
			if (field.getDeclaringClass().equals(declaringClass)) {
				return;
			}
			String fieldSignature = RTHelper.getSignature(field);

			boolean fieldHasSecrecy = field.hasAnnotation(Secrecy.class);
			boolean fieldHasIntegrity = field.hasAnnotation(Integrity.class);

			Critical fieldClassCritical = (Critical) field.getDeclaringClass().getAnnotation(Critical.class);
			if (fieldClassCritical != null) {
				fieldHasSecrecy |= fieldHasSecrecy || Arrays.asList(fieldClassCritical.secrecy()).contains(fieldSignature);
				fieldHasIntegrity |= fieldHasIntegrity || Arrays.asList(fieldClassCritical.integrity()).contains(fieldSignature);
			}

			// Check secrecy only for read
			if (fieldAccess.isReader() && fieldHasSecrecy) {
				if (!secrecy.contains(fieldSignature)) {
					System.out.println(
							"[AGENT] SECURITY VIOLATION SECRECY - Fieldaccessor has no secrecy: " + fieldSignature);
					counterMeasureFieldRead(fieldAccess, field);
				}
				if (secrecy.contains(fieldSignature) && !fieldHasSecrecy) {
					System.out.println("[AGENT] SECURITY VIOLATION SECRECY - Field has no secrecy: " + fieldSignature);
					fieldAccess.replace(getPrintCode("secrecy", '\"'+RTHelper.getSignature(field)+'\"', "$class")+"$_ = $0."+field.getName()+";");
				}
			}

			// Check integrity only for write
			if (fieldAccess.isWriter() && fieldHasIntegrity) {
				if (!integrity.contains(fieldSignature)) {
					System.out.println(
							"[AGENT] SECURITY VIOLATION INTEGRITY - Fieldaccessor has no integrity: " + fieldSignature);
					counterMeasureFieldWrite(fieldAccess, field);
				}
				if (integrity.contains(fieldSignature) && !fieldHasIntegrity) {
					System.out.println("[AGENT] SECURITY VIOLATION INTEGRITY - Field has no integrity: " + fieldSignature);
					fieldAccess.replace(getPrintCode("integrity", '\"'+RTHelper.getSignature(field)+'\"', "$class")+"$1=$0." + field.getName() + ";\n");
				}
			}

		} catch (NotFoundException | ClassNotFoundException e) {
			RTHelper.printAgentError(e);
		}
	}

	/**
	 * Adds a counter measure into the code
	 * 
	 * @param access The violating access
	 * @param field  The accessed field
	 * @return true, iff the countermeasure has been added successfully
	 * @throws ClassNotFoundException
	 */
	private boolean counterMeasureFieldRead(FieldAccess access, CtField field) throws ClassNotFoundException {
		try {
			String earlyReturn = RTHelper.getEarlyReturn(field, Secrecy.class);
			if (earlyReturn != null) {
				StringBuilder replacement = new StringBuilder(getPrintCode("secrecy", '\"'+RTHelper.getSignature(field)+'\"', "$class"));
				replacement.append("$_=");
				if (earlyReturn.endsWith("()")) {
					replacement.append("$0.");
				}
				replacement.append(earlyReturn);
				replacement.append(';');
				access.replace(replacement.toString());
			} else {
				access.replace(getPrintCode("secrecy", '\"'+RTHelper.getSignature(field)+'\"', "$class")+"$_ = $0."+field.getName()+";");
				System.out.println("[AGENT] No counter measure specified");
			}
			return true;
		} catch (CannotCompileException | NotFoundException e) {
			RTHelper.printAgentError(e);
			return false;
		}
	}

	/**
	 * Adds a counter measure into the code
	 * 
	 * @param access The violating access
	 * @param field  The accessed field
	 * @return true, iff the countermeasure has been added successfully
	 * @throws ClassNotFoundException
	 */
	private boolean counterMeasureFieldWrite(FieldAccess access, CtField field) throws ClassNotFoundException {
		try {
			String earlyReturn = RTHelper.getEarlyReturn(field, Integrity.class);
			System.out.println("[AGENT] The earlyReturn is: " + earlyReturn);
			if (earlyReturn != null) {
				StringBuilder replacement = new StringBuilder(getPrintCode("integrity", '\"'+RTHelper.getSignature(field)+'\"', "$class"));
				replacement.append("$0.");
				replacement.append(field.getName());
				replacement.append('=');
				if (earlyReturn.endsWith("()")) {
					replacement.append("$0.");
				}
				replacement.append(earlyReturn);
				replacement.append(';');
				access.replace(replacement.toString());
			} else {
				System.out.println("[AGENT] No counter measure specified, forbidding field write");
				// For illegal field writes we aren't changing the field in this case
				access.replace(getPrintCode("integrity", '\"'+RTHelper.getSignature(field)+'\"', "$class")+"$1=$0." + field.getName() + ";\n");
			}
			return true;
		} catch (CannotCompileException | NotFoundException e) {
			RTHelper.printAgentError(e);
			return false;
		}
	}

	private String getPrintCode(String violation, String fieldSignature, String clazz) {
		String print = "java.net.URL url = new java.net.URL(\"" + url + "\");\n"
				+ "java.net.URLClassLoader loader = java.net.URLClassLoader.newInstance(new java.net.URL[]{url});\n"
				+ "java.util.Stack s = (java.util.Stack) loader.loadClass(\"carisma.rt.instrument.RTStack\").getDeclaredMethod(\"getStack\", new java.lang.Class[]{java.lang.Thread.class}).invoke(null, new java.lang.Object[]{java.lang.Thread.currentThread()});\n"
				+ "java.lang.Class cRTAnnotation = loader.loadClass(\"carisma.rt.instrument.RTStack$RTAnnotation\");\n"
				+ "java.lang.reflect.Constructor constr = cRTAnnotation.getDeclaredConstructor(new java.lang.Class[]{java.lang.String.class, java.lang.Class.class, java.util.Set.class, java.util.Set.class});\n"
				+ "java.lang.Object annotation = constr.newInstance(new java.lang.Object[]{"+fieldSignature+", "+clazz+" ,java.util.Collections.emptySet(), java.util.Collections.emptySet()});\n"
				+ "s.push(annotation);\n"
				+ "s.getClass().getDeclaredMethod(\"print\", new java.lang.Class[]{java.util.Set.class}).invoke(s, new Object[]{java.util.Collections.singleton(\""+violation+"\")});\n"
				+ "s.pop();\n";
		return print;
	}
}