package good;

import secret.ProtectedValues;

public class FieldWriteAccess {

	public static void main(String[] args) {
		ProtectedValues protectedValues = new ProtectedValues();
		boolean value = protectedValues.getValue();
		System.out.println("Value before change: " + value);

		// Illegal assignment
		protectedValues.value = !value;

		System.out.println("EXPECTED" + ": Changed value: " + protectedValues.value + ", expected vlaue: " + value);
	}

}
