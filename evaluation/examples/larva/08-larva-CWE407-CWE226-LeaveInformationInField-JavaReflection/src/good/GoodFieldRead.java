package good;

import java.lang.reflect.Field;

import example.ProtectedClass;

public class GoodFieldRead {
	
	public static void main(String[] args) throws Exception {
		ProtectedClass b = new ProtectedClass();
		Field s = b.getClass().getDeclaredField("s");
		s.setAccessible(true);
		System.err.println(s.get(b));
	}

}
