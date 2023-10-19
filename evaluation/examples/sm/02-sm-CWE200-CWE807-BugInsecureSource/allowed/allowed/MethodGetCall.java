package allowed;

import secret.ProtectedValues;

public class MethodGetCall {

	public static void main(String[] args) {
		// Illegal call
		System.out.println("EXPECTED: Secret value: " + new ProtectedValues().getValue());
	}

}
