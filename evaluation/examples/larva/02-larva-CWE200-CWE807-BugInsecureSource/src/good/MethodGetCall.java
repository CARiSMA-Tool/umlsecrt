package good;

import secret.ProtectedValues;

public class MethodGetCall {

	public static void main(String[] args) {
		run();
	}

	private static void run() {
		// Illegal call
		System.out.println("EXPECTED: Secret value: " + new ProtectedValues().getValue());
	}

}
