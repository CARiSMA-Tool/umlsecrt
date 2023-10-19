package example;

import lib.Lib;

//@Critical(secrecy = { "lib.Lib.method()" })
public class MethodCall {

	public static void main(String[] args) {
		call();
	}

	private static void call() {
		System.out.println(new Lib().method());
	}
}
