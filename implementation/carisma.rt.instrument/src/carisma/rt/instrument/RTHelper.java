package carisma.rt.instrument;

import java.lang.annotation.Annotation;

import org.gravity.security.annotations.requirements.High;
import org.gravity.security.annotations.requirements.Integrity;
import org.gravity.security.annotations.requirements.Secrecy;

import javassist.CtBehavior;
import javassist.CtClass;
import javassist.CtConstructor;
import javassist.CtField;
import javassist.CtMember;
import javassist.CtMethod;
import javassist.NotFoundException;

public class RTHelper {

	/**
	 * Creates an early return string which can be inserted into the instrumented
	 * code
	 * 
	 * @param memeber        The member for which the early return is needed
	 * @param annotationType The type of annotation for which the early return is
	 *                       needed
	 * @return An early return string
	 */
	static String getEarlyReturn(CtMember member, Class<? extends Annotation> annotationType)
			throws ClassNotFoundException, NotFoundException {
		String earlyReturn;
		Object annotation = member.getAnnotation(annotationType);
		if (Secrecy.class.equals(annotationType)) {
			earlyReturn = ((Secrecy) annotation).earlyReturn();
		} else if (Integrity.class.equals(annotationType)) {
			earlyReturn = ((Integrity) annotation).earlyReturn();
		} else if (High.class.equals(annotationType)) {
			earlyReturn = ((High) annotation).earlyReturn();
		} else {
			return null;
		}
		CtClass owner = member.getDeclaringClass();
		CtClass type;
		if (member instanceof CtConstructor) {
			type = owner;
		} else if (member instanceof CtMethod) {
			type = ((CtMethod) member).getReturnType();

		} else if (member instanceof CtField) {
			type = ((CtField) member).getType();
		} else {
			return null;
		}
		return getEarlyReturn(owner, type, earlyReturn);
	}

	/**
	 * Creates an early return string which can be inserted into the instrumented
	 * code
	 * 
	 * @param owner       The class owning the member with the member with an early
	 *                    return
	 * @param type        The expected type of the early return value
	 * @param earlyReturn The early return value from the annotation
	 * @return An early return string
	 */
	static String getEarlyReturn(CtClass owner, CtClass type, String earlyReturn) {
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
					method = owner.getDeclaredMethod(earlyReturn);
					if (method != null && method.getParameterTypes().length == 0) {
						if (method.getReturnType().equals(type)) {
							return method.getName() + "()";
						}
					}
				} catch (NotFoundException e) {
					e.printStackTrace();
				}
				try {
					return Integer.toString(Integer.parseInt(earlyReturn));
				} catch (NumberFormatException e) {
					printAgentError(e);
				}
				try {
					return Double.toString(Double.parseDouble(earlyReturn));
				} catch (NumberFormatException e) {
					printAgentError(e);
				}
				System.err.println("Didn't found counter measure: " + earlyReturn);
				return null;
			}
		}
	}

	/**
	 * Builds the signature of a field
	 * 
	 * @param field The field
	 * @return The fields signature
	 */
	public static String getSignature(CtField field) {
		String signature = field.getDeclaringClass().getName() + "." + field.getName();
		try {
			signature += ":" + field.getType().getSimpleName();
		} catch (NotFoundException e) {
			printAgentError(e);
		}
		return signature;
	}

	/**
	 * Builds the signature of a behavior
	 * 
	 * @param behavior The behavior
	 * @return The behaviors signature
	 */
	public static String getSignature(CtBehavior behavior) {
		return behavior.getLongName();
	}

	/**
	 * Prints the exception to the console
	 * 
	 * @param error The thrown exception
	 */
	public static void printAgentError(Exception error) {
		final StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
		String location = "";
		if (stackTrace.length > 1) {
			location = stackTrace[1].toString();
		}
		printAgentError(error, location);
	}

	/**
	 * Prints the exception to the console
	 * 
	 * @param error The thrown exception
	 */
	public static void printAgentError(Exception error, String location) {
		System.out.println("[AGENT] ERROR (" + error.getClass().getSimpleName() + " at \"" + location + "\"): "
				+ error.getLocalizedMessage());
		for (StackTraceElement s : error.getStackTrace()) {
			System.out.println("[AGENT] \t " + s.toString());
		}
	}

}
