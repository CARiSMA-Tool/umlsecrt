package example;

import java.lang.reflect.Field;

public class FieldRead {
	
	public static void main(String[] args) throws Exception {
		ProtectedClass b = new ProtectedClass();
		Field s = b.getClass().getDeclaredField("s");
		s.setAccessible(true);
		System.err.println(s.get(b));
	}

}
