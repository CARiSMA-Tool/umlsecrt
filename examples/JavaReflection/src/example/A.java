package example;

import java.lang.reflect.Method;

public class A {
	public static void main(String[] args) throws Exception {
		B b = new B();
		Method m = b.getClass().getDeclaredMethod("m");
		m.setAccessible(true);
		m.invoke(b);
	}
}
