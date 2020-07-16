package carisma.rt.instrument;

import java.lang.reflect.Field;

import org.gravity.security.annotations.requirements.Critical;
import org.gravity.security.annotations.requirements.Integrity;
import org.gravity.security.annotations.requirements.Secrecy;

import javassist.CannotCompileException;
import javassist.ClassPool;
import javassist.CtClass;
import javassist.CtField;
import javassist.NotFoundException;
import javassist.expr.ExprEditor;
import javassist.expr.FieldAccess;
import javassist.expr.MethodCall;

final class RTFieldAccessCheck extends ExprEditor {

	private static final boolean SECURITY_EXCEPTION = true;
	private final CtClass accessDeclaringClass;
	private final String[] integrity;
	private final String[] secrecy;

	RTFieldAccessCheck(CtClass declaringClass, String[] integrity, String[] secrecy) {
		this.accessDeclaringClass = declaringClass;
		this.integrity = integrity;
		this.secrecy = secrecy;
	}

	@Override
	public void edit(MethodCall methodCall) throws CannotCompileException {
		if ("java.lang.reflect.Field".equals(methodCall.getClassName())) {
			final String reflectiveMethodName = methodCall.getMethodName();
			if ("get".equals(reflectiveMethodName)) {
				reflectiveGet(methodCall);
			} else if ("set".equals(reflectiveMethodName)) {
				reflectiveSet(methodCall);
			}
		}
	}

	/**
	 * @param methodCall
	 * @throws CannotCompileException
	 */
	private void reflectiveSet(MethodCall methodCall) throws CannotCompileException {
		StringBuilder code = new StringBuilder(
				"Class declaringClass= $0.getDeclaringClass();String fieldSignature=declaringClass.getName()+'.'+$0.getName()+':'+$0.getType().getSimpleName();java.lang.annotation.Annotation[] annotations = $0.getAnnotations();boolean hasIntegrity = false;for(int i = 0; i < annotations.length; i++) {if(\"org.gravity.security.annotations.requirements.Integrity\".equals(annotations[i].getClass().getName())) {hasIntegrity = true;break;}}if(!hasIntegrity){java.lang.annotation.Annotation[] classAnnotations = declaringClass.getAnnotations();for(int i=0;i<classAnnotations.length;i++){java.lang.annotation.Annotation annotation = classAnnotations[i];if(\"org.gravity.security.annotations.requirements.Critical\".equals(annotation.getClass().getName())){String[] integrityValues = ((org.gravity.security.annotations.requirements.Critical) annotation).integrity();for(int s=0; s<integrityValues.length;s++){if(fieldSignature.endsWith(integrityValues[s])){hasIntegrity=true;break;}}}}}boolean callerHasAnnotation=false;");

		for (Object i : integrity) {
			code.append("callerHasAnnotation = callerHasAnnotation || \"").append(i)
					.append("\".equals(fieldSignature);");
		}

		code.append(
				"if(hasIntegrity){if(!callerHasAnnotation){System.out.println(\"[INSTRUMENTATION] JAVA REFLECTION - SECURITY VIOLATION INTEGRITY: The field \"+fieldSignature+\" requires integrity but ")
				.append(accessDeclaringClass.getName())
				.append(" doesn't provide integrity\");throw new java.lang.SecurityException(\"UMLsecRT: [integrity]\");}}else{if(callerHasAnnotation){System.out.println(\"[INSTRUMENTATION] JAVA REFLECTION - SECURITY VIOLATION INTEGRITY: caller ")
				.append(accessDeclaringClass.getName())
				.append(" requires integrity but \"+fieldSignature+\" doesn't provide integrity\");}}$0.set($1, $2);");
		methodCall.replace(code.toString());
	}

	/**
	 * @param methodCall
	 * @throws CannotCompileException
	 */
	private void reflectiveGet(MethodCall methodCall) throws CannotCompileException {
		StringBuilder code = new StringBuilder(
				"Class declaringClass = $0.getDeclaringClass();String fieldSignature = declaringClass.getName()+'.'+$0.getName()+':'+$0.getType().getSimpleName();java.lang.annotation.Annotation[] annotations= $0.getAnnotations();boolean hasSecrecy=false;for(int i=0;i<annotations.length;i++){if(\"org.gravity.security.annotations.requirements.Secrecy\".equals(annotations[i].getClass().getName())){hasSecrecy=true;break;}}if(!hasSecrecy){java.lang.annotation.Annotation[] classAnnotations = declaringClass.getAnnotations();for(int i=0;i<classAnnotations.length;i++){java.lang.annotation.Annotation annotation = classAnnotations[i];if(\"org.gravity.security.annotations.requirements.Critical\".equals(annotation.getClass().getName())){String[] secrecyValues=((org.gravity.security.annotations.requirements.Critical) annotation).secrecy();for(int s=0;s<secrecyValues.length;s++){if(fieldSignature.endsWith(secrecyValues[s])){hasSecrecy=true;break;}}}}}boolean callerHasAnnotation=false;");
		for (Object i : secrecy) {
			code.append("callerHasAnnotation = callerHasAnnotation || fieldSignature.endsWith(\"").append(i)
					.append("\";");
		}

		// Check
		code.append(" if(hasSecrecy){"
				+ "if(!callerHasAnnotation){System.out.println(\"[INSTRUMENTATION] JAVA REFLECTION - SECURITY VIOLATION SECRECY: The field \"+fieldSignature+\" requires secrecy but ")
				.append(accessDeclaringClass.getName()
						+ " doesn't provide secrecy\");throw new java.lang.SecurityException(\"UMLsecRT: [secrecy]\");}} else {if(callerHasAnnotation){System.out.println(\"[INSTRUMENTATION] JAVA REFLECTION - SECURITY VIOLATION SECRECY: The caller ")
				.append(accessDeclaringClass.getName())
				.append(" requires secrecy but \"+fieldSignature+\" doesn't provide secrecy\");}}$_ = $0.get($$);");
		// TODO: Store result of countermeasure in $_

		methodCall.replace(code.toString());
	}

	@Override
	public void edit(FieldAccess fieldAccess) throws CannotCompileException {
		String className = fieldAccess.getClassName();
		if (accessDeclaringClass.getName().equals(className)) {
			return;
		}
		String fieldSignature = RTHelper.getFieldSignature(fieldAccess);
		String fieldName = fieldAccess.getFieldName();

		Object[] annotations;
		Class<?> fieldDeclaringClassReflection = null;
		CtClass fieldDeclaringClassJavassist = null;
		ClassPool classPool = accessDeclaringClass.getClassPool();
		try {
			fieldDeclaringClassReflection = classPool.getClassLoader().loadClass(className);
			Field rField = fieldDeclaringClassReflection.getField(fieldName);
			annotations = rField.getAnnotations();
		} catch (ClassNotFoundException | NoSuchFieldException | SecurityException e) {
			try {
				fieldDeclaringClassJavassist = classPool.get(className);
				CtField field = fieldDeclaringClassJavassist.getField(fieldName);
				annotations = field.getAnnotations();
			} catch (NotFoundException | ClassNotFoundException e1) {
				RTHelper.printAgentError(e1);
				return;
			}
		}

		// Check secrecy only for read
		if (fieldAccess.isReader()) {
			boolean fieldHasSecrecy = false;
			for (Object a :  annotations) {
				if (a instanceof Secrecy) {
					fieldHasSecrecy = true;
					break;
				}
			}
			if (!fieldHasSecrecy) {
				Critical critical;
				if (fieldDeclaringClassReflection != null) {
					critical = fieldDeclaringClassReflection.getAnnotation(Critical.class);
				} else {
					try {
						critical = (Critical) fieldDeclaringClassJavassist.getAnnotation(Critical.class);
					} catch (ClassNotFoundException e) {
						RTHelper.printAgentError(e);
						return;
					}
				}
				if (critical != null) {
					fieldHasSecrecy = RTHelper.containsSignature(fieldSignature, critical.secrecy());
				}
			}

			boolean callerHasSecrecyForField = RTHelper.containsSignature(fieldSignature, secrecy);
			if (fieldHasSecrecy) {
				if (!callerHasSecrecyForField) {
					System.out.println(
							"[AGENT] SECURITY VIOLATION SECRECY - Fieldaccessor has no secrecy: " + fieldSignature);
					try {
						counterMeasureFieldRead(fieldAccess, fieldName, fieldSignature);
					} catch (ClassNotFoundException e1) {
						RTHelper.printAgentError(e1);
						return;
					}
				}
			} else if (callerHasSecrecyForField) {
				System.out.println("[AGENT] SECURITY VIOLATION SECRECY - Field has no secrecy: " + fieldSignature);
				fieldAccess.replace(
						getPrintCode("secrecy", '\"' + fieldSignature + '\"', "$class") + "$_ = $0." + fieldName + ";");
			}
		}

		// Check integrity only for write
		if (fieldAccess.isWriter()) {
			boolean fieldHasIntegrity = false;
			for (Object a : annotations) {
				if (a instanceof Integrity) {
					fieldHasIntegrity = true;
					break;
				}
			}
			if (!fieldHasIntegrity) {
				Critical critical;
				if (fieldDeclaringClassReflection != null) {
					critical = fieldDeclaringClassReflection.getAnnotation(Critical.class);
				} else {
					try {
						critical = (Critical) fieldDeclaringClassJavassist.getAnnotation(Critical.class);
					} catch (ClassNotFoundException e) {
						RTHelper.printAgentError(e);
						return;
					}
				}
				if (critical != null) {
					fieldHasIntegrity = RTHelper.containsSignature(fieldSignature, critical.integrity());
				}
			}

			boolean callerHasIntegrityForField = RTHelper.containsSignature(fieldSignature, integrity);
			if (fieldHasIntegrity) {
				if (!callerHasIntegrityForField) {
					System.out.println(
							"[AGENT] SECURITY VIOLATION INTEGRITY - Fieldaccessor has no integrity: " + fieldSignature);
					try {
						counterMeasureFieldWrite(fieldAccess, fieldName, fieldSignature);
					} catch (ClassNotFoundException e1) {
						RTHelper.printAgentError(e1);
					}
				}
			} else if (callerHasIntegrityForField) {
				System.out.println("[AGENT] SECURITY VIOLATION INTEGRITY - Field has no integrity: " + fieldSignature);
				fieldAccess.replace(
						getPrintCode("integrity", '\"' + fieldSignature + '\"', "$class") + "$1=$0." + fieldName + ";");
			}
		}

	}

	/**
	 * Adds a counter measure into the code
	 * 
	 * @param access              The violating access
	 * @param field               The accessed field
	 * @param fieldSignature
	 * @param fieldDeclaringClass
	 * @return true, iff the countermeasure has been added successfully
	 * @throws ClassNotFoundException
	 */
	private boolean counterMeasureFieldRead(FieldAccess access, String fieldName, String fieldSignature)
			throws ClassNotFoundException {
		try {
			CtField field = access.getField();
			String earlyReturn = RTHelper.getEarlyReturn(field, field.getDeclaringClass(), Secrecy.class);
			if (earlyReturn != null) {
				StringBuilder replacement = new StringBuilder(
						getPrintCode("secrecy", '\"' + fieldSignature + '\"', "$class"));
				replacement.append("$_=");
				if (earlyReturn.endsWith("()")) {
					replacement.append("$0.");
				}
				replacement.append(earlyReturn);
				replacement.append(';');
				access.replace(replacement.toString());
			} else {
				access.replace(
						getPrintCode("secrecy", '\"' + fieldSignature + '\"', "$class") + "$_ = $0." + fieldName + ";");
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
	 * @param access          The violating access
	 * @param field           The accessed field
	 * @param fieldSignature
	 * @param fieldSignature2
	 * @return true, iff the countermeasure has been added successfully
	 * @throws ClassNotFoundException
	 */
	private boolean counterMeasureFieldWrite(FieldAccess access, String fieldName, String fieldSignature)
			throws ClassNotFoundException {

		try {
			CtField field = access.getField();
			String earlyReturn = RTHelper.getEarlyReturn(field, field.getDeclaringClass(), Integrity.class);
			System.out.println("[AGENT] The earlyReturn is: " + earlyReturn);
			if (earlyReturn != null) {
				StringBuilder replacement = new StringBuilder(
						getPrintCode("integrity", '\"' + fieldSignature + '\"', "$class"));
				replacement.append("$1=");
				if (earlyReturn.endsWith("()")) {
					replacement.append("$0.");
				}
				replacement.append(earlyReturn);
				replacement.append(';');
				access.replace(replacement.toString());
			} else {
				System.out.println("[AGENT] No counter measure specified, forbidding field write");
				// For illegal field writes we changing the value of the field to the value of
				// the field
				access.replace(
						getPrintCode("integrity", '\"' + fieldSignature + '\"', "$class") + "$1=$0." + fieldName + ";");
			}
			return true;
		} catch (CannotCompileException | NotFoundException e) {
			RTHelper.printAgentError(e);
			return false;
		}
	}

	private String getPrintCode(String violation, String fieldSignature, String clazz) {
		String print = "carisma.rt.instrument.RTStack s = carisma.rt.instrument.RTStackManager.getStack();"
				+ "carisma.rt.instrument.RTAnnotation annotation = new carisma.rt.instrument.RTAnnotation("
				+ fieldSignature + ", " + clazz + " ,new String[0], new String[0]);" + "s.push(annotation);"
				+ "s.print(\"" + violation + "\");" + "s.pop();";
		if (SECURITY_EXCEPTION) {
			print += "throw new java.lang.SecurityException(\"Security Violation of " + violation + "\");";
		}
		return print;
	}
}