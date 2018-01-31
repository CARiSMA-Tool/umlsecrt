package carisma.rt;

import java.lang.reflect.AccessibleObject;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.Hashtable;
import java.util.List;

import com.sun.jdi.Field;
import com.sun.jdi.Method;
import com.sun.jdi.Type;
import com.sun.jdi.TypeComponent;

public class Cache {

	private Hashtable<String, Class<?>> classes = new Hashtable<>();

	private Hashtable<String, Annotations> memberAnnotations = new Hashtable<>();
	private Hashtable<String, Annotations> clazzAnnotations = new Hashtable<>();

	private final ClassLoader loader;

	public Cache(URL[] urls) {
		this.loader = new URLClassLoader(urls, this.getClass().getClassLoader());
	}

	public Annotations getAnnotations(TypeComponent member) throws Exception {
		String memberSignature = member.toString();
		if (memberAnnotations.contains(memberSignature)) {
			return memberAnnotations.get(memberSignature);
		}

		String classSignature = Signatures.getSignature(member.declaringType());
		Class<?> reflectionClass = loadClass(classSignature);
		
		AccessibleObject reflectionMember = null;
		if (member instanceof Method) {
			List<Type> argumentTypes = ((Method) member).argumentTypes();
			Class<?>[] parameters = new Class<?>[argumentTypes.size()];
			for (int i = 0; i < argumentTypes.size(); i++) {
				Type parameter = argumentTypes.get(i);
				parameters[i] = loadClass(Signatures.getSignature(parameter));

			}
			if (((Method) member).isConstructor()) {
				reflectionMember = reflectionClass.getConstructor(parameters);
			} else {
				reflectionMember = reflectionClass.getMethod(member.name(), parameters);
			}

		} else if (member instanceof Field) {
			reflectionMember = reflectionClass.getDeclaredField(member.name());
		}

		Annotations annotations = new Annotations(reflectionClass, reflectionMember);
		clazzAnnotations.put(classSignature, annotations);
		return annotations;
	}

	private Class<?> loadClass(String signature) throws ClassNotFoundException {
		Class<?> reflectionClass;
		if (classes.containsKey(signature)) {
			reflectionClass = classes.get(signature);
		} else {
			if (signature.startsWith("[")) {
				reflectionClass = Class.forName(signature, true, loader);
			} else if (signature.endsWith(";")) {
				reflectionClass = loader.loadClass(signature.substring(1, signature.length() - 1));
			} else {
				reflectionClass = getPrimitive(signature);
			}
			classes.put(signature, reflectionClass);
		}
		return reflectionClass;
	}

	private Class<?> getPrimitive(String className) {
		switch (className) {
		case "boolean":
			return boolean.class;
		case "byte":
			return byte.class;
		case "short":
			return short.class;
		case "int":
			return int.class;
		case "long":
			return long.class;
		case "float":
			return float.class;
		case "double":
			return double.class;
		case "char":
			return char.class;
		case "void":
			return void.class;
		}
		return null;
	}
}
