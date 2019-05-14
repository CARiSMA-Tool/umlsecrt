package cwe;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.net.URLClassLoader;

import org.gravity.security.annotations.requirements.Critical;

import example.GoodClass;

@Critical(secrecy = { "example.GoodClass.getSomeString():String" }, integrity = {
		"example.GoodClass.getSomeString():String" })
public class CWE486 {

	public static void main(String[] args)
			throws ClassNotFoundException, IOException, InstantiationException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		Object goodObject = new GoodClass();

		Class<?> goodClass = goodObject.getClass();
		Class<?> evilClass;
		File exampleFolder = new File("malware/");
		if(!exampleFolder.exists()) {
			exampleFolder = new File("/home/speldszus/workspace/umlsecrt/CWE486/malware/");
		}
		try (URLClassLoader loader = new URLClassLoader(new URL[] { exampleFolder.toURI().toURL() }, null)) {
			evilClass = loader.loadClass("example.GoodClass");
		}

		Object evilObject = evilClass.newInstance();

		System.out.println(
				"Same class files: " + goodClass.equals(evilClass) + " -- good:" + goodClass + ", evil:" + evilClass);
		System.out.println(doSomething(goodObject));
		System.out.println(doSomething(evilObject));
	}

	private static String doSomething(Object goodObject) throws IllegalAccessException, IllegalArgumentException,
			InvocationTargetException, NoSuchMethodException, SecurityException {
		if ("example.GoodClass".equals(goodObject.getClass().getName())) {
			return (String) goodObject.getClass().getDeclaredMethod("getSomeString").invoke(goodObject);
		}
		return null;
	}
}
