package cwe;

import secret.ProtectedValues;

public class CWE807MethodSetCall {

	public static void main(String[] args) {
		ProtectedValues protectedValues = new ProtectedValues();
		boolean value = protectedValues.getValue();
		System.out.println("Secret value before change: " + value);
		
		// Illegal setter call
		protectedValues.setValue(!value);
		
		System.out.println("VIOLATION: Secret value after change: " + protectedValues.getValue()+", expected value: "+value);
		
	}

}