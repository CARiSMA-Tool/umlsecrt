package bad;

import java.lang.reflect.Method;

import example.ProtectedClass;

public class MethodCall {
	
	public static void main(String[] args) throws Exception {
		ProtectedClass b = new ProtectedClass();
		Method m = b.getClass().getDeclaredMethod("m");
		m.setAccessible(true);
		System.out.println("[ATTACKER] called m: "+m.invoke(b));
	}
}
