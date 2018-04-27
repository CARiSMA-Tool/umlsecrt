package example;

import org.gravity.security.annotations.requirements.Critical;
import lib.Lib;

@Critical(secrecy= {"lib.Lib.field:java.lang.String"}, integrity = {"lib.Lib.field:java.lang.String"})
public class FieldWrite {
	
	public static void main(String[] args) {
		System.out.println(new Lib().field);
	}
}
