package example;

import org.gravity.security.annotations.requirements.Critical;
import lib.Lib;

@Critical(secrecy= {"lib.Lib.method():String"})
public class MethodCall {
	
	
public static void main(String[] args) {
		System.out.println(new Lib().method());
	}
}
