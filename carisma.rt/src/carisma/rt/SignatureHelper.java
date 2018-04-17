package carisma.rt;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Parameter;

import com.sun.jdi.ClassNotLoadedException;
import com.sun.jdi.Field;
import com.sun.jdi.Method;
import com.sun.jdi.PrimitiveType;
import com.sun.jdi.Type;
import com.sun.jdi.TypeComponent;
import com.sun.tools.jdi.ConcreteMethodImpl;

import sun.tools.javac.SourceMember;

public class SignatureHelper {

	public static String getSignature(Type declaringType) {
		if (declaringType instanceof PrimitiveType) {
			return declaringType.name();
		}
		String signature = declaringType.signature();
		signature = signature.replace('/', '.');
		return signature;
	}

	public static String getSignature(TypeComponent caller) {
		if (caller instanceof Method) {
			String string = caller.toString();
			if (caller instanceof ConcreteMethodImpl) {
				String returnTypeName = ((ConcreteMethodImpl) caller).returnTypeName();
				string += ':' + returnTypeName.substring(returnTypeName.lastIndexOf('.')+1);
			}
			return string;
		} else if (caller instanceof Field) {
			return caller.toString() + ':' + ((Field) caller).typeName();
		}
		return null;
	}

	public static String getSignature(AccessibleObject reflectionMember) {
		if (reflectionMember instanceof java.lang.reflect.Member) {
			java.lang.reflect.Member member = (java.lang.reflect.Member) reflectionMember;
			StringBuilder builder = new StringBuilder(member.getDeclaringClass().getCanonicalName());
			if (member instanceof java.lang.reflect.Constructor) {
				java.lang.reflect.Constructor<?> contructor = (java.lang.reflect.Constructor<?>) member;
				builder.append(".<init>");
				appendParameters(builder, contructor.getParameters());

			} else {
				builder.append('.');
				builder.append(member.getName());
				if (member instanceof java.lang.reflect.Method) {
					java.lang.reflect.Method method = (java.lang.reflect.Method) member;
					appendParameters(builder, method.getParameters());
					builder.append(':');
					builder.append(method.getReturnType().getSimpleName());
				} else if (member instanceof java.lang.reflect.Field) {
					java.lang.reflect.Field field = (java.lang.reflect.Field) member;
					builder.append(':');
					builder.append(field.getType().getName()); //Evtl fullyqualifed name
				}
			}
			return builder.toString();
		}
		return null;
	}

	private static void appendParameters(StringBuilder builder, Parameter[] params) {
		builder.append('(');
		if (params.length > 0) {
			builder.append(params[0].getType().getSimpleName());
			if (params.length > 1) {
				for (int i = 1; i < params.length; i++) {
					builder.append(',');
					builder.append(params[i].getType().getSimpleName());
				}
			}
		}
		builder.append(')');
	}

}
