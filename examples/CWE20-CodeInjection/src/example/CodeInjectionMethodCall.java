package example;

import java.lang.annotation.Annotation;

import javax.script.*;

import org.gravity.security.annotations.requirements.Critical;
import org.gravity.security.annotations.requirements.Secrecy;

@Critical
public class CodeInjectionMethodCall {
		
	public static final String injection = "Everything beyond here has been injected via the JavaScript engine:');\n"
	 		+ "var File = Java.type('java.io.File');\n"
			+ "var URLClassLoader = Java.type('java.net.URLClassLoader');\n"
			+ "var loader = new URLClassLoader(new Array(new File('../examples/CodeInjection/malware').toURI().toURL()));\n"
			+ "var clazz = loader.loadClass('example.Evil');\n"
			+ "clazz.getDeclaredMethod('invokeEvil').invoke(clazz.newInstance());\n"
			+ "loader.close();\n"
			+ "//";
	 

	@Secrecy
	public static void main(String[] args) {
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
		return CodeInjectionMethodCall.class.getAnnotations();
	}
}
