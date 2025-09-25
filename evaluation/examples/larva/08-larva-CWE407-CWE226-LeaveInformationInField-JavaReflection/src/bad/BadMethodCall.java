package bad;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import example.ProtectedClass;

public class BadMethodCall {
	
	public static void main(String[] args) throws Exception {
		run();
	}

	private static void run() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
		ProtectedClass b = new ProtectedClass();
		Method m = b.getClass().getDeclaredMethod("m");
		m.setAccessible(true);
		System.out.println("[ATTACKER] called m: "+m.invoke(b));
	}
}
