package allowed;

import secret.ProtectedValues;

public class FieldReadAccess {

	public static void main(String[] args) {
		// Illegal access
		System.out.println("EXPECTED: Secret value: " + new ProtectedValues().value);
	}

}
