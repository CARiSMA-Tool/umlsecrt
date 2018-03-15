package example;

import javax.script.*;

import org.gravity.security.annotations.requirements.Critical;
import org.gravity.security.annotations.requirements.Integrity;
import org.gravity.security.annotations.requirements.Secrecy;

@Critical
public class CodeInjection {
		
	@Integrity
	 public static final String injection = "Everything beyond here has been injected via the JavaScript engine:');\n"
	 		+ "var File = Java.type('java.io.File');\n"
			+ "var URLClassLoader = Java.type('java.net.URLClassLoader');\n"
			+ "var loader = new URLClassLoader(new Array(new File('../examples/CodeInjection/bin2').toURI().toURL()));\n"
			+ "var clazz = loader.loadClass('example.Evil');\n"
			+ "clazz.getDeclaredMethod('invokeEvil').invoke(clazz.newInstance());\n"
			+ "loader.close();\n"
			+ "//";
	 

	@Secrecy
	public static void main(String[] args) {
		System.out.println(CodeInjection.class.getDeclaredMethods()[0].getDeclaredAnnotations());
		try {
			ScriptEngineManager manager = new ScriptEngineManager();
			ScriptEngine engine = manager.getEngineByName("JavaScript");
			engine.eval("print('" + injection + "')");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
