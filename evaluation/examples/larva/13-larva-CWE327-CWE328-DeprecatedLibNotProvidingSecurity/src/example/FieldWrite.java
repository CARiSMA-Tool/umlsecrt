package example;

import lib.Lib;

//@Critical(secrecy= {"lib.Lib.field:java.lang.String"}, integrity = {"lib.Lib.field:java.lang.String"})
public class FieldWrite {
	
	public static void main(String[] args) {
		write();
	}

	private static void write() {
		System.out.println(new Lib().field);
	}
}
