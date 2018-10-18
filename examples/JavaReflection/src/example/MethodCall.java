package example;

import java.lang.reflect.Method;

public class MethodCall {
	
	public static void main(String[] args) throws Exception {
		ProtectedClass b = new ProtectedClass();
		Method m = b.getClass().getDeclaredMethod("m");
		m.setAccessible(true);
		System.out.println(m.invoke(b));
	}
}
