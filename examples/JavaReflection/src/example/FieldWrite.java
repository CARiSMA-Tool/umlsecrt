package example;

import java.lang.reflect.Field;

public class FieldWrite {

public static void main(String[] args) throws Exception {
		ProtectedClass b = new ProtectedClass();
		Field s = b.getClass().getDeclaredField("s");
		s.setAccessible(true);
		s.set(b, "I changed the fields value");
		System.err.println("I did it!");
	}

}
