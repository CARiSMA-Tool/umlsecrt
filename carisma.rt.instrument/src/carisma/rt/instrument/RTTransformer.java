package carisma.rt.instrument;

import java.lang.instrument.ClassFileTransformer;
import java.lang.instrument.IllegalClassFormatException;
import java.net.URLClassLoader;
import java.security.ProtectionDomain;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import org.gravity.security.annotations.requirements.Critical;
import org.gravity.security.annotations.requirements.Integrity;
import org.gravity.security.annotations.requirements.Secrecy;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import javassist.CannotCompileException;
import javassist.ClassPool;
import javassist.CtBehavior;
import javassist.CtClass;
import javassist.CtConstructor;
import javassist.CtMethod;

public class RTTransformer implements ClassFileTransformer {

	private String url;

	public RTTransformer() {
		url = "jar:file:" + getClass().getProtectionDomain().getCodeSource().getLocation().getFile() + "!/";
	}

	@Override
	public byte[] transform(ClassLoader loader, String className, Class<?> classBeingRedefined,
			ProtectionDomain protectionDomain, byte[] classfileBuffer) throws IllegalClassFormatException {
		// We don't want to instrument classes provided by us or from the JRE core to
		// which additions aren't possible
		if (protectionDomain == null // Classes from JRE //TODO: Verify null assumption
				|| getClass().getProtectionDomain().equals(protectionDomain)) { // Carisma.rt.
			return classfileBuffer;
		}

//		System.out.println("[Agent] Transform class: " + className+ "domain: "+protectionDomain);
		try {
			ClassPool cPool = ClassPool.getDefault();
			CtClass ctClass = cPool.makeClass(new ByteArrayInputStream(classfileBuffer));

			Set<String> classSecrecy = new HashSet<>();
			Set<String> classIntegrity = new HashSet<>();

			Critical critical = (Critical) ctClass.getAnnotation(Critical.class);
			if (critical != null) {
				for (String s : critical.secrecy()) {
					classSecrecy.add(s);
				}
				for (String i : critical.integrity()) {
					classIntegrity.add(i);
				}
			}

			for (CtMethod method : ctClass.getDeclaredMethods()) {
				prepare(classSecrecy, classIntegrity, method, loader);
			}
			for (CtConstructor constructor : ctClass.getDeclaredConstructors()) {
				prepare(classSecrecy, classIntegrity, constructor, loader);
			}
			return ctClass.toBytecode();
		} catch (IOException e) {
			throw new IllegalClassFormatException(e.getMessage());
		} catch (RuntimeException e) {
			throw new IllegalClassFormatException(e.getMessage());
		} catch (CannotCompileException e) {
			throw new IllegalClassFormatException(e.getMessage());
		} catch (ClassNotFoundException e) {
			throw new IllegalClassFormatException(e.getMessage());
		}

	}

	private void prepare(Set<String> classSecrecy, Set<String> classIntegrity, CtBehavior ctBehavior, ClassLoader loader)
			throws ClassNotFoundException, CannotCompileException {
		ArrayList<String> secrecy = new ArrayList<>(classSecrecy);
		boolean hasSecrecy = ctBehavior.getAnnotation(Secrecy.class) != null;
		if (hasSecrecy) {
			secrecy.add(ctBehavior.getLongName());
		}

		ArrayList<String> integrity = new ArrayList<>(classIntegrity);
		boolean hasIntegrity = ctBehavior.getAnnotation(Integrity.class) != null;
		if (hasIntegrity) {
			integrity.add(ctBehavior.getLongName());
		}
		
		String before = "try{"
				+ "java.net.URLClassLoader loader = java.net.URLClassLoader.newInstance(new java.net.URL[]{new java.net.URL(\""
				+ url + "\")});"
				+ "java.util.Stack s = (java.util.Stack) loader.loadClass(\"carisma.rt.instrument.RTStack\").getDeclaredMethod(\"getStack\", new java.lang.Class[]{java.lang.Object.class}).invoke(null, new java.lang.Object[]{java.lang.Thread.currentThread()});"
//				+ "java.util.Stack s = ((java.util.Stack) loader.loadClass(\"carisma.rt.instrument.RTStack\").getDeclaredField(\"stack\").get(null));"

				+ "java.util.Set secrecySet = new java.util.HashSet();"
				+ "java.util.Set integritySet = new java.util.HashSet();";
		for (String s : secrecy) {
			before += "secrecySet.add(\"" + s + "\");";
		}
		for (String s : integrity) {
			before += "integritySet.add(\"" + s + "\");";
		}

		before += "if(!s.isEmpty()){" + "java.lang.Object annot = s.peek();"
				+ "java.lang.String caller = (java.lang.String) annot.getClass().getDeclaredMethod(\"getMethod\", new java.lang.Class[0]).invoke(annot, new java.lang.Object[0]);"
				+ "java.util.Set secrecy = (java.util.Set) annot.getClass().getDeclaredMethod(\"getSecrecy\", new java.lang.Class[0]).invoke(annot, new java.lang.Object[0]);"
				+ "java.util.Set integrity = (java.util.Set) annot.getClass().getDeclaredMethod(\"getIntegrity\", new java.lang.Class[0]).invoke(annot, new java.lang.Object[0]);";

		if (hasIntegrity || classIntegrity.contains(ctBehavior.getLongName())) {
			before += "if(!integrity.contains(\"" + ctBehavior.getLongName() + "\")){"
					+ "System.err.println(\"[SECURITY VIOLATION INTEGRITY] - Kind 1\");" + "}";
		}
		if (hasSecrecy || classSecrecy.contains(ctBehavior.getLongName())) {
			before += "if(!secrecy.contains(\"" + ctBehavior.getLongName() + "\")){"
					+ "System.err.println(\"[SECURITY VIOLATION SECRECY] - Kind 1\");" + "}";
		}

		before += "if(secrecy.contains(caller) && !secrecySet.contains(caller)){"
				+ "System.err.println(\"[SECURITY VIOLATION SECRECY] - Kind 2\");" + "}"
				+ "if(integrity.contains(caller) && !integritySet.contains(caller)){"
				+ "System.err.println(\"[SECURITY VIOLATION INTEGRITY] - Kind 2\");" + "}";

		before += "System.out.println(\"[Instrumentation] prev method: \"+ caller+\" secrecy=\"+secrecy+\" integrity=\"+integrity);"
				+ "}" + "System.out.println(\"[Instrumentation] this method: " + ctBehavior.getLongName()
				+ " secrecy=\"+secrecySet+\" integrity=\"+integritySet);";

		before += "java.lang.Class cRTAnnotation = loader.loadClass(\"carisma.rt.instrument.RTStack$RTAnnotation\");"
				+ "java.lang.reflect.Constructor constr = cRTAnnotation.getDeclaredConstructor(new java.lang.Class[]{java.lang.String.class, java.util.Set.class, java.util.Set.class});"
				+ "java.lang.Object o = constr.newInstance(new java.lang.Object[]{\"" + ctBehavior.getLongName()
				+ "\", secrecySet, integritySet});" + "s.add(o);";

		before += "}catch(Exception e) {e.printStackTrace();System.exit(-1);}";
		
		ctBehavior.insertBefore(before);

		String after = "try{"
				+ "java.net.URLClassLoader loader = java.net.URLClassLoader.newInstance(new java.net.URL[]{new java.net.URL(\""	+ url + "\")});"
				+ "java.util.Stack s = (java.util.Stack) loader.loadClass(\"carisma.rt.instrument.RTStack\").getDeclaredMethod(\"getStack\", new java.lang.Class[]{java.lang.Object.class}).invoke(null, new java.lang.Object[]{java.lang.Thread.currentThread()});"
				+ "s.pop();"
				+ "}catch(Exception e) {e.printStackTrace();System.exit(-1);}";
		ctBehavior.insertAfter(after);
	}
}
