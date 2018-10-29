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

final class RTFieldAccessCheck extends ExprEditor {

	private final CtClass declaringClass;
	private final Collection<String> integrity;
	private final Collection<String> secrecy;

	RTFieldAccessCheck(CtClass declaringClass, Collection<String> integrity, Collection<String> secrecy) {
		this.declaringClass = declaringClass;
		this.integrity = integrity;
		this.secrecy = secrecy;
	}

	@Override
	public void edit(MethodCall methodCall) throws CannotCompileException {
		try {
			CtMethod reflectiveMethod = methodCall.getMethod();
			CtClass methodDeclaringClass = reflectiveMethod.getDeclaringClass();
			if ("java.lang.reflect.Field".equals(methodDeclaringClass.getName())) {
				final String reflectiveMethodName = reflectiveMethod.getName();
				if ("get".equals(reflectiveMethodName)) {
					String code = "String fieldSignature = $1.getClass().getName()+'.'+$0.getName()+':'+$0.getType().getSimpleName();"
							+ "System.out.println(\"[INSTRUMENTATION] Reflective field access to: \"+fieldSignature);";

					// Check if the field is on the secrecy level
					code += "boolean hasSecrecy = $0.isAnnotationPresent(org.gravity.security.annotations.requirements.Secrecy.class);"
							+ "if(!hasSecrecy){"
							+ "org.gravity.security.annotations.requirements.Critical critical = (org.gravity.security.annotations.requirements.Critical) $1.getClass().getAnnotation(org.gravity.security.annotations.requirements.Critical.class);"
							+ "if(critical!=null){"
							+ "hasSecrecy = java.util.Arrays.asList(critical.secrecy()).contains(fieldSignature);" + "}"
							+ "}";

					// Check if the caller requires the secrecy level for the field
					code += "boolean callerHasAnnotation = false;";
					for (String s : secrecy) {
						code += "callerHasAnnotation |= \"" + s + "\".equals(fieldSignature);";
					}

					// Check
					code += "if(hasSecrecy){" + "if(!callerHasAnnotation){"
							+ "System.out.println(\"[INSTRUMENTATION] JAVA REFLECTION - SECURITY VIOLATION SECRECY: The field \"+fieldSignature+\" requires secrecy but "
							+ declaringClass.getName() + " doesn't provide secrecy\");" + "}" + "} else {"
							+ "if(callerHasAnnotation){"
							+ "System.out.println(\"[INSTRUMENTATION] JAVA REFLECTION - SECURITY VIOLATION SECRECY: The caller "
							+ declaringClass.getName()
							+ " requires secrecy but \"+fieldSignature+\" doesn't provide secrecy\");" + "}" + "}"

							+ "$_ = $0.get($1);";
					methodCall.replace(code);
				} else if ("set".equals(reflectiveMethodName)) {
					String code = "String fieldSignature = $1.getClass().getName()+'.'+$0.getName()+':'+$0.getType().getSimpleName();"
							+ "System.out.println(\"[INSTRUMENTATION] Reflective field access to: \"+fieldSignature);";

					// check if field has integrity level
					code += "boolean hasIntegrity = $0.isAnnotationPresent(org.gravity.security.annotations.requirements.Integrity.class);"
							+ "if(!hasIntegrity){"
							+ "org.gravity.security.annotations.requirements.Critical critical = (org.gravity.security.annotations.requirements.Critical) $1.getClass().getAnnotation(org.gravity.security.annotations.requirements.Critical.class);"
							+ "if(critical!=null){"
							+ "hasIntegrity = java.util.Arrays.asList(critical.integrity()).contains(fieldSignature);"
							+ "}" + "}";

					// check if caller has integrity for field
					code += "boolean callerHasAnnotation = false;";
					for (String s : integrity) {
						code += "callerHasAnnotation |= \"" + s + "\".equals(fieldSignature);";
					}

					code += "if(hasIntegrity){ " + "if(!callerHasAnnotation){"
							+ "System.out.println(\"[INSTRUMENTATION] JAVA REFLECTION - SECURITY VIOLATION INTEGRITY: The field \"+fieldSignature+\" requires integrity but "
							+ declaringClass.getName() + " doesn't provide integrity\");" + "}" + "} else {"
							+ "if(callerHasAnnotation){"
							+ "System.out.println(\"[INSTRUMENTATION] JAVA REFLECTION - SECURITY VIOLATION INTEGRITY: caller "
							+ declaringClass.getName()
							+ " requires integrity but \"+fieldSignature+\" doesn't provide integrity\");" + "}" + "}"
							+ "$0.set($1, $2);";
					methodCall.replace(code);
				}
			}
		} catch (NotFoundException e) {
			System.out.println("[Agent] ERROR: " + e.getLocalizedMessage());
		}
	}

	@Override
	public void edit(FieldAccess f) throws CannotCompileException {
		super.edit(f);
		try {
			CtField field = f.getField();
			if (field.getDeclaringClass().equals(declaringClass)) {
				return;
			}
			String fieldSignature = RTHelper.getFieldSignature(field);

			boolean hasSecrecy = field.hasAnnotation(Secrecy.class);
			boolean hasIntegrity = field.hasAnnotation(Integrity.class);

			Critical fieldClassCritical = (Critical) field.getDeclaringClass().getAnnotation(Critical.class);
			if (fieldClassCritical != null) {
				hasSecrecy |= hasSecrecy || Arrays.asList(fieldClassCritical.secrecy()).contains(fieldSignature);
				hasIntegrity |= hasIntegrity || Arrays.asList(fieldClassCritical.integrity()).contains(fieldSignature);
			}

			// Check secrecy only for read
			if (f.isReader() && hasSecrecy) {
				if (!secrecy.contains(fieldSignature)) {
					System.out.println(
							"[AGENT] SECURITY VIOLATION SECRECY - Fieldaccessor has no secrecy: " + fieldSignature);
					counterMeasureFieldRead(f, field);
				}
			}

			// Check integrity only for write
			if (f.isWriter() && hasIntegrity) {
				if (!integrity.contains(fieldSignature)) {
					System.out.println(
							"[AGENT] SECURITY VIOLATION INTEGRITY - Fieldaccessor has no integrity: " + fieldSignature);
					counterMeasureFieldWrite(f, field);
				}
			}

			if (secrecy.contains(fieldSignature) && !hasSecrecy) {
				System.out.println("[AGENT] SECURITY VIOLATION SECRECY - Field has no secrecy: " + fieldSignature);
			}
			if (integrity.contains(fieldSignature) && !hasIntegrity) {
				System.out.println("[AGENT] SECURITY VIOLATION INTEGRITY - Field has no integrity: " + fieldSignature);
			}

		} catch (NotFoundException | ClassNotFoundException e) {
			System.out.println("[Agent] ERROR: " + e.getLocalizedMessage());
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
				StringBuilder replacement = new StringBuilder("$_=");
				if (earlyReturn.endsWith("()")) {
					replacement.append("$0.");
				}
				replacement.append(earlyReturn);
				replacement.append(';');
				access.replace(replacement.toString());
			} else {
				System.out.println("[AGENT] No counter measure specified");
			}
			return true;
		} catch (CannotCompileException | NotFoundException e) {
			System.out.println("[AGENT] ERROR: " + e.getLocalizedMessage());
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
				StringBuilder replacement = new StringBuilder("$0.");
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
				access.replace("$1=$0." + field.getName() + ";");
			}
			return true;
		} catch (CannotCompileException | NotFoundException e) {
			System.out.println("[AGENT] ERROR: " + e.getLocalizedMessage());
			return false;
		}
	}
}