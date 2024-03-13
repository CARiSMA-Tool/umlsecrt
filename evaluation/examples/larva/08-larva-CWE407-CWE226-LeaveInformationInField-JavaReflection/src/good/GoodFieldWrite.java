package good;

import java.lang.reflect.Field;

import example.ProtectedClass;

//@Critical(integrity = { "example.ProtectedClass.s:String" })
public class GoodFieldWrite {

	public static void main(String[] args) throws Exception {
		ProtectedClass b = new ProtectedClass();
		Field s = b.getClass().getDeclaredField("s");
		s.setAccessible(true);
		s.set(b, "I changed the fields value");
		System.err.println("I did it!");
	}

}