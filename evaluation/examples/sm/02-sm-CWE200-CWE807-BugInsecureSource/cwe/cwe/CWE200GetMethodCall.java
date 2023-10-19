package cwe;

import secret.ProtectedValues;

public class CWE200GetMethodCall {

	public static void main(String[] args) {
		// Illegal call
		System.out.println("VIOLATION: Secret value: " + new ProtectedValues().getValue());
	}

}
