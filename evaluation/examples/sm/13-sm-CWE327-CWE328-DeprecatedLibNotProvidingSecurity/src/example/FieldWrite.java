package example;

import lib.Lib;

//@Critical(secrecy= {"lib.Lib.field:java.lang.String"}, integrity = {"lib.Lib.field:java.lang.String"})
public class FieldWrite {
	
	public static void main(String[] args) {
		write();
	}

	private static void write() {
		// Integrity requirement cannot be expressed using the Java Security Manager for an external lib
		Lib lib = new Lib();
		System.out.println(lib.field);
		lib.field = "Changed value";
		System.out.println(lib.field);
	}
}
