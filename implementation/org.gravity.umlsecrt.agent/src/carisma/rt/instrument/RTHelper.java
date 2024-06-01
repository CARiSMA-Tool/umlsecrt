package carisma.rt.instrument;

import java.lang.annotation.Annotation;
import java.util.List;

import org.gravity.security.annotations.requirements.Integrity;
import org.gravity.security.annotations.requirements.Secrecy;

import javassist.CtClass;
import javassist.CtConstructor;
import javassist.CtField;
import javassist.CtMember;
import javassist.CtMethod;
import javassist.NotFoundException;
import javassist.expr.FieldAccess;

public class RTHelper {

	private RTHelper() {
		// This class shouldn't be instantiated
	}

	/**
	 * Creates an early return string which can be inserted into the instrumented
	 * code
	 *
	 * @param memeber        The member for which the early return is needed
	 * @param annotationType The type of annotation for which the early return is
	 *                       needed
	 * @return An early return string
	 */
	static String getEarlyReturn(final CtMember member, final CtClass owner,
			final Class<? extends Annotation> annotationType)
			throws ClassNotFoundException, NotFoundException {
		String earlyReturn;
		final Object annotation = member.getAnnotation(annotationType);
		if (Secrecy.class.equals(annotationType)) {
			earlyReturn = ((Secrecy) annotation).earlyReturn();
		} else if (Integrity.class.equals(annotationType)) {
			earlyReturn = ((Integrity) annotation).earlyReturn();
		} else {
			return null;
		}
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
	static String getEarlyReturn(final CtClass owner, final CtClass type, final String earlyReturn) {
		if (earlyReturn == null || earlyReturn.length() == 0) {
			return null;
		}
		if ("null".equalsIgnoreCase(earlyReturn)) {
			return "null";
		} else if ("void".equalsIgnoreCase(earlyReturn)) {
			return "";
		} else if ("true".equalsIgnoreCase(earlyReturn)) {
			return Boolean.toString(true);
		} else if ("false".equalsIgnoreCase(earlyReturn)) {
			return Boolean.toString(false);
		} else if ('"' == earlyReturn.charAt(0) && earlyReturn.charAt(earlyReturn.length() - 1) == '"') {
			return earlyReturn;
		} else {
			CtMethod method;
			try {
				method = owner.getDeclaredMethod(earlyReturn);
				if (method != null && method.getParameterTypes().length == 0
						&& method.getReturnType().equals(type)) {
					return method.getName() + "()";

				}
			} catch (final NotFoundException e) {
				e.printStackTrace();
			}
			try {
				return Integer.toString(Integer.parseInt(earlyReturn));
			} catch (final NumberFormatException e) {
				printAgentError(e);
			}
			try {
				return Double.toString(Double.parseDouble(earlyReturn));
			} catch (final NumberFormatException e) {
				printAgentError(e);
			}
			System.err.println("Didn't found counter measure: " + earlyReturn);
			return null;
		}
	}

	/**
	 * Builds the signature of a field
	 *
	 * @param field The field
	 * @return The fields signature
	 */
	public static String getSignature(final CtField field) {
		final StringBuilder signature = new StringBuilder(field.getDeclaringClass().getName());
		signature.append('.');
		signature.append(field.getName());
		try {
			signature.append(':');
			signature.append(field.getType().getSimpleName());
		} catch (final NotFoundException e) {
			printAgentError(e);
		}
		return signature.toString();
	}

	public static String getFieldSignature(final FieldAccess access) {
		final StringBuilder signature = new StringBuilder(access.getClassName()).append('.')
				.append(access.getFieldName())
				.append(':');
		String type = access.getSignature();
		if (type.charAt(type.length() - 1) == ';') {
			type = type.substring(0, type.length() - 1);
		}
		final char firstChar = type.charAt(0);
		if (type.length() == 1) {
			return appendPrimitiveType(signature, firstChar).toString();
		}
		final String substring = type.substring(1);
		if ('L' == firstChar) {
			return signature.append(substring.replace('/', '.')).toString();
		}
		if ('[' == firstChar) {
			if (substring.length() == 1) {
				return appendPrimitiveType(signature, substring.charAt(0)).append("[]").toString();
			}
			return signature.append(substring).append("[]").toString();
		}
		throw new IllegalStateException("Unknown type String: " + type);
	}

	/**
	 * @param signature
	 * @param firstChar
	 * @return
	 */
	private static StringBuilder appendPrimitiveType(final StringBuilder signature, final char firstChar) {
		switch (firstChar) {
			case 'Z':
				return signature.append("boolean");
			case 'B':
				return signature.append("byte");
			case 'C':
				return signature.append("char");
			case 'S':
				return signature.append("short");
			case 'I':
				return signature.append("int");
			case 'J':
				return signature.append("long");
			case 'F':
				return signature.append("float");
			case 'D':
				return signature.append("double");
			default:
				throw new IllegalStateException("Unknown primitive type: " + firstChar);
		}
	}

	/**
	 * Prints the exception to the console
	 *
	 * @param error The thrown exception
	 */
	public static void printAgentError(final Exception error) {
		String location = "Couldn't get location";
		final Thread currentThread = Thread.currentThread();
		if (currentThread != null) {
			final StackTraceElement[] stackTrace = currentThread.getStackTrace();
			if (stackTrace.length > 1) {
				location = stackTrace[1].toString();
			}
		}
		printAgentError(error, location);
	}

	/**
	 * Prints the exception to the console
	 *
	 * @param error The thrown exception
	 */
	public static void printAgentError(final Exception error, final String location) {
		if (error != null) {
			System.out.println("[AGENT] ERROR (" + error.getClass().getSimpleName() + " at \"" + location + "\"): "
					+ error.getLocalizedMessage());
			for (final StackTraceElement s : error.getStackTrace()) {
				System.out.println("[AGENT] \t " + s.toString());
			}
		} else {
			System.out.println("[AGENT] \t Unknown Error at \"" + location + "\n");
		}
	}

	static boolean containsSignature(final String fieldSignature, final String[] values) {
		for (final String value : values) {
			if (fieldSignature.endsWith(value)) {
				return true;
			}
		}
		return false;
	}

	static boolean containsSignature(final String fieldSignature, final List<String> values) {
		for (final String value : values) {
			if (fieldSignature.endsWith(value)) {
				return true;
			}
		}
		return false;
	}

}
