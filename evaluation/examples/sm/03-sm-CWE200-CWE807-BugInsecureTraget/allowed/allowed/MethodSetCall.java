package allowed;

import secret.ProtectedValues;

public class MethodSetCall {

	public static void main(String[] args) {
		ProtectedValues protectedValues = new ProtectedValues();
		boolean value = protectedValues.getValue();
		System.out.println("Secret value before change: " + value);
		
		// Illegal setter call
		protectedValues.setValue(!value);
		
		System.out.println("EXPECTED: Secret value after change: " + protectedValues.getValue()+", expected value: "+value);
		
	}

}
