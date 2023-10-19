package example;

import lib.Lib;

//@Critical(secrecy = { "lib.Lib.method()" })
public class MethodCall {

	public static void main(String[] args) {
		call();
	}

	private static void call() {
		// Security requirements cannot be expressed for external libraries using the Java Security Manager
		System.out.println(new Lib().method());
	}
}
