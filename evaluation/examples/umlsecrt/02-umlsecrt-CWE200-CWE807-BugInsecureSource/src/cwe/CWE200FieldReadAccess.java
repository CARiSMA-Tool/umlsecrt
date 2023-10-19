package cwe;

import org.gravity.security.annotations.requirements.Critical;

import secret.ProtectedValues;

@Critical(secrecy = "value:boolean")
public class CWE200FieldReadAccess {

	public static void main(String[] args) {
		// Illegal access
		System.out.println("VIOLATION: Secret value: " + new ProtectedValues().value);
	}

}
