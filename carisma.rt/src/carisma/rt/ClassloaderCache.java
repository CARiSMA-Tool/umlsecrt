package carisma.rt;

import java.io.File;
import java.lang.reflect.AccessibleObject;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import javax.management.RuntimeErrorException;

import com.sun.jdi.ArrayReference;
import com.sun.jdi.ArrayType;
import com.sun.jdi.ClassNotLoadedException;
import com.sun.jdi.ClassObjectReference;
import com.sun.jdi.Field;
import com.sun.jdi.IncompatibleThreadStateException;
import com.sun.jdi.InvalidTypeException;
import com.sun.jdi.InvocationException;
import com.sun.jdi.Method;
import com.sun.jdi.ObjectReference;
import com.sun.jdi.ReferenceType;
import com.sun.jdi.StringReference;
import com.sun.jdi.ThreadReference;
import com.sun.jdi.Type;
import com.sun.jdi.TypeComponent;
import com.sun.jdi.Value;

class ClassloaderCache {

	private Hashtable<String, Class<?>> classes = new Hashtable<>();

	private Hashtable<String, Annotations> memberAnnotations = new Hashtable<>();
	private Hashtable<String, Annotations> clazzAnnotations = new Hashtable<>();

	private final ClassLoader loader;

	ClassloaderCache(Set<String> classpath, ClassLoader parent) {
		int i = 0;
		URL[] urls = new URL[classpath.size()];
		for (String entry : classpath) {
			try {
				urls[i++] = new File(entry).toURI().toURL();
			} catch (MalformedURLException e) {
				e.printStackTrace();
			}
		}
		this.loader = new URLClassLoader(urls, parent);
	}

	Annotations getAnnotations(TypeComponent member) throws Exception {

		ThreadReference thread = null;
		for (ThreadReference t : member.virtualMachine().allThreads()) {
			if ("main".equals(t.name())) {
				thread = t;
			}
		}

		// Value clazz = invokeMethod(thread, member.declaringType().classObject(),
		// "getClass");
		ClassObjectReference clazzReference = member.declaringType().classObject();
		
		List<Value> val = new ArrayList<Value>();
		StringReference valName = (StringReference) invokeMethod(thread, clazzReference, "getName");
		Value mirrorOf = clazzReference.virtualMachine().mirrorOf(valName.value().replace('.', '/')+".class");
		val.add(mirrorOf);
		
		invokeMethod(thread, clazzReference, "getResource", val);
		
		ArrayReference classAnnotations = (ArrayReference) invokeMethod(thread, clazzReference, "getDeclaredAnnotations");

		ObjectReference memberObject = null;
		if (member instanceof Method) {
			ArrayReference declared;
			if (((Method) member).isConstructor()) {
				declared = (ArrayReference) invokeMethod(thread, clazzReference, "getDeclaredConstructors");
			} else {
				declared = (ArrayReference) invokeMethod(thread, clazzReference, "getDeclaredMethods");
				List<Value> toRemove = new LinkedList<>();
				for (Value value : declared.getValues()) {
					ObjectReference object = (ObjectReference) value;
					StringReference name = (StringReference) invokeMethod(thread, object, "getName");
					if (!member.name().equals(name.value())) {
						toRemove.add(value);
					}
				}
				declared.getValues().removeAll(toRemove);
			}

			for (Value d : declared.getValues()) {
				ObjectReference objectReference = (ObjectReference) d;
				boolean match = true;
				List<String> searched = ((Method) member).argumentTypeNames();
				ArrayReference current = (ArrayReference) invokeMethod(thread, objectReference, "getParameterTypes");
				if (searched.size() == current.length()) {
					for (int i = 0; i < searched.size(); i++) {
						Value value = current.getValue(i);
						String name = null;
						if (value instanceof ClassObjectReference) {
							name = ((ClassObjectReference) value).reflectedType().name();
						}
						else {
							throw new RuntimeException();
						}
						
						if (!searched.get(i).equals(name)) {
							match = false;
							break;
						}
					}
					if (match) {
						memberObject = (ObjectReference) d;
						break;
					}
				}

			}
		} else if (member instanceof Field) {
			Field field = (Field) member;
			ArrayReference declared = (ArrayReference) invokeMethod(thread, clazzReference, "getDeclaredFields");
			for (Value v : declared.getValues()) {
				ObjectReference object = (ObjectReference) v;
				StringReference name = (StringReference) invokeMethod(thread, object, "getName");
				if (member.name().equals(name.value())) {
					Value type = invokeMethod(thread, object, "getType");
					String typeName;
					if (type instanceof ClassObjectReference) {
						typeName = ((ClassObjectReference) type).reflectedType().name();
					} else {
						throw new RuntimeException();
					}
					if (field.typeName().equals(typeName)) {
						memberObject = object;
						break;
					}
				}
			}
		} else {
			throw new RuntimeException();
		}
		ArrayReference annotationReferences = (ArrayReference) invokeMethod(thread, memberObject,
				"getDeclaredAnnotations");
		
		Set<String> secrecy = new HashSet<>();
		Set<String> integrity = new HashSet<>();
		for(Value value : annotationReferences.getValues()) {
			System.out.println(value);
		}

		return new Annotations(member.name(), secrecy, integrity);
	}

	Annotations getAnnotationsOld(TypeComponent member) throws Exception {
		String memberSignature = member.toString();
		if (memberAnnotations.contains(memberSignature)) {
			return memberAnnotations.get(memberSignature);
		}

		String classSignature = SignatureHelper.getSignature(member.declaringType());
		Class<?> reflectionClass = loadClass(classSignature);

		AccessibleObject reflectionMember = null;
		if (member instanceof Method) {
			List<Type> argumentTypes = ((Method) member).argumentTypes();
			Class<?>[] parameters = new Class<?>[argumentTypes.size()];
			for (int i = 0; i < argumentTypes.size(); i++) {
				Type parameter = argumentTypes.get(i);
				parameters[i] = loadClass(SignatureHelper.getSignature(parameter));

			}
			if (((Method) member).isConstructor()) {
				reflectionMember = reflectionClass.getConstructor(parameters);
			} else {
				try {
					reflectionMember = reflectionClass.getDeclaredMethod(member.name(), parameters);
				} catch (Exception e) {
					reflectionMember = reflectionClass.getMethod(member.name(), parameters);
				}
			}

		} else if (member instanceof Field) {
			try {
				reflectionMember = reflectionClass.getDeclaredField(member.name());
			} catch (Exception e) {
				reflectionMember = reflectionClass.getField(member.name());
			}
		}

		Annotations annotations = new Annotations(reflectionClass, reflectionMember);
		clazzAnnotations.put(classSignature, annotations);
		return annotations;
	}

	private Value invokeMethod(ThreadReference thread, ObjectReference object, String methodName) {
		try {
			return invokeMethod(thread, object, methodName, Collections.emptyList());
		} catch (InvalidTypeException | ClassNotLoadedException | IncompatibleThreadStateException
				| InvocationException e) {
			throw new RuntimeException(e);
		}
	}

	private Value invokeMethod(ThreadReference thread, ObjectReference object, String methodName,
			List<? extends Value> parameters) throws InvalidTypeException, ClassNotLoadedException,
			IncompatibleThreadStateException, InvocationException {
		Method method = null;
		for (Method m : object.referenceType().methodsByName(methodName)) {
			boolean match = true;
			List<String> current = m.argumentTypeNames();
			if (parameters.size() == current.size()) {
				for (int i = 0; i < parameters.size(); i++) {
					if (!current.get(i).equals(parameters.get(i).type().name())) {
						match = false;
						break;
					}
				}
				if (match) {
					method = m;
					break;
				}
			}
		}
		Value returnValue = object.invokeMethod(thread, method, parameters, 0);

		return returnValue;
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
