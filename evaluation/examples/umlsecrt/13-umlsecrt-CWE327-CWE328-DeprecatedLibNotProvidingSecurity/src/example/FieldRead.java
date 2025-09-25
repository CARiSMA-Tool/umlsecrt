package example;

import lib.Lib;

//@Critical(secrecy= {"lib.Lib.field:java.lang.String"}, integrity = {"lib.Lib.field:java.lang.String"})
public class FieldRead {
	
	public static void main(String[] args) {
		read();
	}

	private static void read() {
		new Lib().field = "Secret data";
		System.out.println("Wrote data to untrusted field");
	}
}
