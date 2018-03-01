package example;

import javax.script.*;
import org.gravity.security.annotations.requirements.Secrecy;

public class CodeInjection {
	
	 public static final String injection = "hello');\n"
			 + "var MyFile = Java.type('example.Foo'); "
			 + "var f = new MyFile();\n"
			 + "f.doEvil();\n"
			 + "//";

	public static void main(String[] args) {
		try {
			ScriptEngineManager manager = new ScriptEngineManager();
			ScriptEngine engine = manager.getEngineByName("JavaScript");
			engine.eval("print('" + injection + "')");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Secrecy
	public void m() {
		System.out.println("m()");
	}
}
