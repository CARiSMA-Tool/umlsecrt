package carisma.rt;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Collections;
import java.util.Hashtable;
import java.util.List;
import java.util.Set;

import com.sun.jdi.ArrayReference;
import com.sun.jdi.ClassLoaderReference;
import com.sun.jdi.ClassNotLoadedException;
import com.sun.jdi.IncompatibleThreadStateException;
import com.sun.jdi.InvalidTypeException;
import com.sun.jdi.InvocationException;
import com.sun.jdi.Method;
import com.sun.jdi.ObjectReference;
import com.sun.jdi.ReferenceType;
import com.sun.jdi.StringReference;
import com.sun.jdi.ThreadReference;
import com.sun.jdi.TypeComponent;
import com.sun.jdi.Value;

class ClassloaderCache {

	private Hashtable<ReferenceType, Class<?>> classes = new Hashtable<>();
	private Hashtable<Class<?>, Annotations> clazzAnnotations = new Hashtable<>();

	private final ModifiableURLClassLoader loader;

	private final EventThread events;

	ClassloaderCache(Set<URL> classpath, ClassLoader parent, EventThread events) {
		this.loader = new ModifiableURLClassLoader(classpath.toArray(new URL[classpath.size()]), parent);
		this.events = events;
	}

	//
	// Annotations getAnnotationsNew(TypeComponent member, ObjectReference
	// clazzReference, ThreadReference thread) throws Exception {
	//
	// ClassObjectReference classObjectReference;
	// if(clazzReference instanceof ClassObjectReference) {
	// classObjectReference = (ClassObjectReference) clazzReference;
	// }
	// else {
	// classObjectReference = clazzReference.referenceType().classObject();
	// }
	//
	// ObjectReference memberObject = null;
	// if (member instanceof Method) {
	// ArrayReference declared;
	// if (((Method) member).isConstructor()) {
	// declared = (ArrayReference) invokeMethod(thread, classObjectReference,
	// "getDeclaredConstructors");
	// } else {
	// declared = (ArrayReference) invokeMethod(thread, classObjectReference,
	// "getDeclaredMethods");
	// List<Value> toRemove = new LinkedList<>();
	// for (Value value : declared.getValues()) {
	// ObjectReference object = (ObjectReference) value;
	// StringReference name = (StringReference) invokeMethod(thread, object,
	// "getName");
	// if (!member.name().equals(name.value())) {
	// toRemove.add(value);
	// }
	// }
	// declared.getValues().removeAll(toRemove);
	// }
	//
	// for (Value d : declared.getValues()) {
	// ObjectReference objectReference = (ObjectReference) d;
	// boolean match = true;
	// List<String> searched = ((Method) member).argumentTypeNames();
	// ArrayReference current = (ArrayReference) invokeMethod(thread,
	// objectReference, "getParameterTypes");
	// if (searched.size() == current.length()) {
	// for (int i = 0; i < searched.size(); i++) {
	// Value value = current.getValue(i);
	// String name = null;
	// if (value instanceof ClassObjectReference) {
	// name = ((ClassObjectReference) value).reflectedType().name();
	// } else {
	// throw new RuntimeException();
	// }
	//
	// if (!searched.get(i).equals(name)) {
	// match = false;
	// break;
	// }
	// }
	// if (match) {
	// memberObject = (ObjectReference) d;
	// break;
	// }
	// }
	//
	// }
	// } else if (member instanceof Field) {
	// Field field = (Field) member;
	// ArrayReference declared = (ArrayReference) invokeMethod(thread,
	// classObjectReference, "getDeclaredFields");
	// for (Value v : declared.getValues()) {
	// ObjectReference object = (ObjectReference) v;
	// StringReference name = (StringReference) invokeMethod(thread, object,
	// "getName");
	// if (member.name().equals(name.value())) {
	// Value type = invokeMethod(thread, object, "getType");
	// String typeName;
	// if (type instanceof ClassObjectReference) {
	// typeName = ((ClassObjectReference) type).reflectedType().name();
	// } else {
	// throw new RuntimeException();
	// }
	// if (field.typeName().equals(typeName)) {
	// memberObject = object;
	// break;
	// }
	// }
	// }
	// } else {
	// throw new RuntimeException();
	// }
	// ArrayReference annotationReferences = (ArrayReference) invokeMethod(thread,
	// memberObject,
	// "getDeclaredAnnotations");
	//
	// Set<String> secrecy = new HashSet<>();
	// Set<String> integrity = new HashSet<>();
	// for (Value value : annotationReferences.getValues()) {
	// System.out.println(value);
	// }
	//
	// return new Annotations(member.name(), secrecy, integrity, "");
	// }
	//
	Annotations getAnnotations(ReferenceType type, ThreadReference thread) throws Exception {
		Class<?> reflectionClass = loadClass(type, thread);

		if (clazzAnnotations.containsKey(reflectionClass)) {
			return clazzAnnotations.get(reflectionClass);
		}

		Annotations annotations = new Annotations(reflectionClass);
		clazzAnnotations.put(reflectionClass, annotations);
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

		events.disableEventRequests();

		Method method = null;
		for (Method m : object.referenceType().allMethods()) {
			if (methodName.equals(m.name())) {
				boolean match = true;
				List<String> current = m.argumentTypeNames();
				if (parameters.size() == current.size()) {
					for (int i = 0; i < parameters.size(); i++) {
						Value value = parameters.get(i);
						if (!current.get(i).equals(value == null ? "java.lang.Object" : value.type().name())) {
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
		}
		Value returnValue = object.invokeMethod(thread, method, parameters, 0);

		events.enableEventRequests();

		return returnValue;
	}

	private Class<?> loadClass(ReferenceType referenceType, ThreadReference thread) {
		String classSignature = SignatureHelper.getSignature(referenceType);
		Class<?> reflectionClass;
		if (classes.containsKey(referenceType)) {
			reflectionClass = classes.get(referenceType);
		} else {

			ClassLoaderReference classLoader = referenceType.classLoader();
			if (classLoader == null) {
				String name = referenceType.name();
				if (name.startsWith("java.")) { // Classes from java.* have no class loader
					
				} else {
					System.err.println("Couldn't load class \""+name+"\" it ahs no class loader.");
				}
				try {
					reflectionClass = loader.loadClass(name);
				} catch (ClassNotFoundException e) {
					throw new RuntimeException(e);
				}
			} else {
				try {
					if (classSignature.startsWith("[")) {
						reflectionClass = Class.forName(classSignature, true, loader);
					} else if (classSignature.endsWith(";")) {
						reflectionClass = loader.loadClass(classSignature.substring(1, classSignature.length() - 1));
					} else {
						reflectionClass = getPrimitive(classSignature);
					}
				} catch (ClassNotFoundException e) {
					try {
						ArrayReference urls = (ArrayReference) invokeMethod(thread, classLoader, "getURLs");
						for (Value value : urls.getValues()) {
							StringReference path = (StringReference) invokeMethod(thread, (ObjectReference) value,
									"getPath");
							loader.addURL(new File(path.value()).toURI().toURL());
						}
						reflectionClass = loader.loadClass(classSignature.substring(1, classSignature.length() - 1));
					} catch (MalformedURLException | ClassNotFoundException e1) {
						throw new RuntimeException(e1);
					}
				}
			}
			classes.put(referenceType, reflectionClass);
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

	public String getEarlyReturn(TypeComponent member, ThreadReference thread) throws Exception {
		Class<?> referenceType;
		if (classes.containsKey(member.declaringType())) {
			referenceType = classes.get(member.declaringType());
		} else {
			referenceType = loadClass(member.declaringType(), thread);
		}
		if (clazzAnnotations.containsKey(referenceType)) {
			return clazzAnnotations.get(referenceType).getEarlyReturn(SignatureHelper.getSignature(member));
		} else {
			Annotations annotations = getAnnotations(member.declaringType(), thread);
			clazzAnnotations.put(referenceType, annotations);
			return annotations.getEarlyReturn(SignatureHelper.getSignature(member));
		}
	}
}
