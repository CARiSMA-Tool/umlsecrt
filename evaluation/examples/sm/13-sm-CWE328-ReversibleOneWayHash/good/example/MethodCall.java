package example;

import hash.HashFunction;

public class MethodCall {

	public static void main(String[] args) {
		MethodCall m = new MethodCall();
		m.storePassword("password");
	}

	private void storePassword(String passwd) {
		HashFunction.hash(passwd);
	}
}
