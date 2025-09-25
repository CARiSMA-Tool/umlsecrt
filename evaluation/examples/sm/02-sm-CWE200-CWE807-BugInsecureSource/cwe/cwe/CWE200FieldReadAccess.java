package cwe;

import secret.ProtectedValues;

public class CWE200FieldReadAccess {

	public static void main(String[] args) {
		// Illegal access
		System.out.println("VIOLATION: Secret value: " + new ProtectedValues().value);
	}

}
