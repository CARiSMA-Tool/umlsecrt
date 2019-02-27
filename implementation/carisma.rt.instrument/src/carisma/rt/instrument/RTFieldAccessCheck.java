package carisma.rt.instrument;

import java.util.Arrays;
import java.util.Collection;

import org.gravity.security.annotations.requirements.Critical;
import org.gravity.security.annotations.requirements.Integrity;
import org.gravity.security.annotations.requirements.Secrecy;

import javassist.CannotCompileException;
import javassist.CtClass;
import javassist.CtField;
import javassist.NotFoundException;
import javassist.expr.ConstructorCall;
import javassist.expr.ExprEditor;
import javassist.expr.FieldAccess;
import javassist.expr.MethodCall;
import static carisma.rt.instrument.RTAgent.DEBUG;

final class RTFieldAccessCheck extends ExprEditor {

	private final CtClass declaringClass;
	private final Collection<String> integrity;
	private final Collection<String> secrecy;
	private final String url = getClass().getProtectionDomain().getCodeSource().getLocation().toString();

	RTFieldAccessCheck(CtClass declaringClass, Collection<String> integrity, Collection<String> secrecy) {
		this.declaringClass = declaringClass;
		this.integrity = integrity;
		this.secrecy = secrecy;
	}

	@Override
	public void edit(MethodCall methodCall) throws CannotCompileException {
		super.edit(methodCall);
		if ("java.lang.reflect.Field".equals(methodCall.getClassName())) {
			final String reflectiveMethodName = methodCall.getMethodName();
			if ("get".equals(reflectiveMethodName)) {
				reflectiveGet(methodCall);
			} else if ("set".equals(reflectiveMethodName)) {
				reflectiveSet(methodCall);
			}
		}
//		else if("java.net.URLClassLoader".equals(methodCall.getClassName())) {
//			final String reflectiveMethodName = methodCall.getMethodName();
//			if("newInstance".equals(reflectiveMethodName)) {
//				String code = "java.net.URL[] newUrls = new java.net.URL[$1.length+1];"
//						+ "newUrls[0] = new java.net.URL(\""+url+"\");"
//						+ "System.arraycopy($1,0,newUrls,1,$1.length);"
//						+ "$1 = newUrls;"
//						+ "$_ = $proceed($$);";
//				methodCall.replace(code);
//			}
//		}
	}

	/**
	 * @param methodCall
	 * @throws CannotCompileException
	 */
	private void reflectiveSet(MethodCall methodCall) throws CannotCompileException {
		String code = "String fieldSignature = $0.getDeclaringClass().getName()+'.'+$0.getName()+':'+$0.getType().getSimpleName();\n";
		if (DEBUG) {
			code += "System.out.println(\"[INSTRUMENTATION] Reflective field access to: \"+fieldSignature);\n";
		}

		// check if field has integrity level
		code += "Class integrityClass;" + "try {" 
				+ "integrityClass = Class.forName(\"org.gravity.security.annotations.requirements.Integrity\");\n"
				+ "}catch(java.lang.ClassNotFoundException e){"
				+ "integrityClass = Class.forName(\"org.gravity.security.annotations.requirements.Integrity\",true, new java.net.URLClassLoader(new java.net.URL[]{new java.net.URL(\""
				+ url +"\")}));" + "}";	
		
		code += "boolean hasIntegrity = $0.isAnnotationPresent(integrityClass);\n"
				+ "if(!hasIntegrity){"
				+ "Class criticalAnnotation;"
				+ "try {"
				+ "criticalAnnotation = Class.forName(\"org.gravity.security.annotations.requirements.Critical\");"
				+ "}catch(java.lang.ClassNotFoundException e){"
				+ "criticalAnnotation = Class.forName(\"org.gravity.security.annotations.requirements.Critical\",true, new java.net.URLClassLoader(new java.net.URL[]{new java.net.URL(\""
				+ url +"\")}));"
				+ "}"
				+ "org.gravity.security.annotations.requirements.Critical critical = (org.gravity.security.annotations.requirements.Critical) $0.getDeclaringClass().getAnnotation(criticalAnnotation);\n"
				+ "if(critical!=null){"
				+ "hasIntegrity = java.util.Arrays.asList(critical.integrity()).contains(fieldSignature);\n" + "}"
				+ "}";

		// check if caller has integrity for field
		code += "boolean callerHasAnnotation = false;\n";
		for (String s : integrity) {
			code += "callerHasAnnotation |= \"" + s + "\".equals(fieldSignature);\n";
		}

		code += "if(hasIntegrity){ " + "if(!callerHasAnnotation){"
		// If the caller has integrity the field needs integrity
				+ "System.out.println(\"[INSTRUMENTATION] JAVA REFLECTION - SECURITY VIOLATION INTEGRITY: The field \"+fieldSignature+\" requires integrity but "
				+ declaringClass.getName() + " doesn't provide integrity\");\n"
//				+ getPrintCode("integrity", "fieldSignature", "$0.getDeclaringClass()") //TODO: Re-enable when fixes
				+ "throw new java.lang.SecurityException(\"UMLsecRT: [integrity]\");" + "}" + "} else {"
				+ "if(callerHasAnnotation){"
				// If the caller doesn't has integrity but the field has integrity we have a
				// violation
				+ "System.out.println(\"[INSTRUMENTATION] JAVA REFLECTION - SECURITY VIOLATION INTEGRITY: caller "
				+ declaringClass.getName()
				+ " requires integrity but \"+fieldSignature+\" doesn't provide integrity\");\n"
//				+ getPrintCode("integrity", "fieldSignature", "$0.getDeclaringClass()") //TODO: Fix
				+ "}" + "}";
				// Perform counter measure
		code += "$0.set($1, $2);\n"; // TODO: Counter measure to get value of $2
		methodCall.replace(code);
	}

	/**
	 * @param methodCall
	 * @throws CannotCompileException
	 */
	private void reflectiveGet(MethodCall methodCall) throws CannotCompileException {
		String code = "Class declaringClass = $0.getDeclaringClass();"
				+ "String fieldSignature = declaringClass.getName()+'.'+$0.getName()+':'+$0.getType().getSimpleName();\n";

		if (DEBUG) {
			code += "System.out.println(\"[INSTRUMENTATION] Reflective field access to: \"+fieldSignature);\n";
		}

		// Check if the field is on the secrecy level

		code += "Class secrecyClass;" + "try {" 
				+ "secrecyClass = Class.forName(\"org.gravity.security.annotations.requirements.Secrecy\");\n"
				+ "}catch(java.lang.ClassNotFoundException e){"
				+ "secrecyClass = Class.forName(\"org.gravity.security.annotations.requirements.Secrecy\",true, new java.net.URLClassLoader(new java.net.URL[]{new java.net.URL(\""
				+ url +"\")}));" + "}";		
		//END new part
		
		code += "boolean hasSecrecy = $0.isAnnotationPresent(secrecyClass);\n";
		code += "if(!hasSecrecy){"
					+ "Class criticalAnnotation;"
					+ "try {"
					+ "criticalAnnotation = Class.forName(\"org.gravity.security.annotations.requirements.Critical\");"
					+ "}catch(java.lang.ClassNotFoundException e){"
					+ "criticalAnnotation = Class.forName(\"org.gravity.security.annotations.requirements.Critical\",true, new java.net.URLClassLoader(new java.net.URL[]{new java.net.URL(\""
					+ url +"\")}));"
					+ "}"
					+ "org.gravity.security.annotations.requirements.Critical critical = (org.gravity.security.annotations.requirements.Critical) declaringClass.getAnnotation(criticalAnnotation);\n"
					+ "if(critical!=null){"
						+ "hasSecrecy = java.util.Arrays.asList(critical.secrecy()).contains(fieldSignature);\n" 
					+ "}" 
				+ "}";

		// Check if the caller requires the secrecy level for the field
		code += "boolean callerHasAnnotation = false;\n";
		for (String s : secrecy) {
			code += "callerHasAnnotation |= \"" + s + "\".equals(fieldSignature);\n";
		}
		
		// Check
		code += "if(hasSecrecy){" 
				+ "if(!callerHasAnnotation){"
					+ "System.out.println(\"[INSTRUMENTATION] JAVA REFLECTION - SECURITY VIOLATION SECRECY: The field \"+fieldSignature+\" requires secrecy but "
				+ declaringClass.getName() + " doesn't provide secrecy\");\n"
//				+ getPrintCode("secrecy", "fieldSignature", "declaringClass") //TODO: Fix
				+ "throw new java.lang.SecurityException(\"UMLsecRT: [secrecy]\");" 
					+ "}" 
				+ "} else {"
				+ "if(callerHasAnnotation){"
				+ "System.out.println(\"[INSTRUMENTATION] JAVA REFLECTION - SECURITY VIOLATION SECRECY: The caller "
				+ declaringClass.getName() + " requires secrecy but \"+fieldSignature+\" doesn't provide secrecy\");\n"
//				+ getPrintCode("secrecy", "fieldSignature", "declaringClass")  //TODO: Fix
				+ "}" + "}";
				// Counter measure
		code += "$_ = $0.get($$);\n"; // TODO: Store result of countermeasure in $_
		methodCall.replace(code);
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
				fieldHasSecrecy |= fieldHasSecrecy
						|| Arrays.asList(fieldClassCritical.secrecy()).contains(fieldSignature);
				fieldHasIntegrity |= fieldHasIntegrity
						|| Arrays.asList(fieldClassCritical.integrity()).contains(fieldSignature);
			}

			// Check secrecy only for read
			if (fieldAccess.isReader()) {
				boolean callerHasSecrecyForField = secrecy.contains(fieldSignature);
				if (fieldHasSecrecy && !callerHasSecrecyForField) {
					System.out.println(
							"[AGENT] SECURITY VIOLATION SECRECY - Fieldaccessor has no secrecy: " + fieldSignature);
					counterMeasureFieldRead(fieldAccess, field);
				}
				if (callerHasSecrecyForField && !fieldHasSecrecy) {
					System.out.println("[AGENT] SECURITY VIOLATION SECRECY - Field has no secrecy: " + fieldSignature);
					fieldAccess.replace(getPrintCode("secrecy", '\"' + RTHelper.getSignature(field) + '\"', "$class")
							+ "$_ = $0." + field.getName() + ";");
				}
			}

			// Check integrity only for write
			if (fieldAccess.isWriter()) {
				boolean callerHasIntegrityForField = integrity.contains(fieldSignature);
				if (fieldHasIntegrity && !callerHasIntegrityForField) {
					System.out.println(
							"[AGENT] SECURITY VIOLATION INTEGRITY - Fieldaccessor has no integrity: " + fieldSignature);
					counterMeasureFieldWrite(fieldAccess, field);
				}
				if (callerHasIntegrityForField && !fieldHasIntegrity) {
					System.out.println(
							"[AGENT] SECURITY VIOLATION INTEGRITY - Field has no integrity: " + fieldSignature);
					fieldAccess.replace(getPrintCode("integrity", '\"' + RTHelper.getSignature(field) + '\"', "$class")
							+ "$1=$0." + field.getName() + ";\n");
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
				StringBuilder replacement = new StringBuilder(
						getPrintCode("secrecy", '\"' + RTHelper.getSignature(field) + '\"', "$class"));
				replacement.append("$_=");
				if (earlyReturn.endsWith("()")) {
					replacement.append("$0.");
				}
				replacement.append(earlyReturn);
				replacement.append(';');
				access.replace(replacement.toString());
			} else {
				access.replace(getPrintCode("secrecy", '\"' + RTHelper.getSignature(field) + '\"', "$class")
						+ "$_ = $0." + field.getName() + ";");
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
				StringBuilder replacement = new StringBuilder(
						getPrintCode("integrity", '\"' + RTHelper.getSignature(field) + '\"', "$class"));
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
				access.replace(getPrintCode("integrity", '\"' + RTHelper.getSignature(field) + '\"', "$class")
						+ "$1=$0." + field.getName() + ";\n");
			}
			return true;
		} catch (CannotCompileException | NotFoundException e) {
			RTHelper.printAgentError(e);
			return false;
		}
	}

	private String getPrintCode(String violation, String fieldSignature, String clazz) {
		//TODO: Use url classloader for loading RTStack and RTAnnotation
		String print = "carisma.rt.instrument.RTStack s = carisma.rt.instrument.RTStackManager.getStack(java.lang.Thread.currentThread());"
				+ "carisma.rt.instrument.RTAnnotation annotation = new carisma.rt.instrument.RTAnnotation("
				+ fieldSignature + ", " + clazz
				+ " ,java.util.Collections.emptySet(), java.util.Collections.emptySet());\n" + "s.push(annotation);\n"
				+ "s.print(java.util.Collections.singleton(\"" + violation + "\"));" + "s.pop();";
		return print;
	}
}