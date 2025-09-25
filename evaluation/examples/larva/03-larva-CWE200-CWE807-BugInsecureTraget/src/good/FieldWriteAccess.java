package good;

import org.gravity.security.annotations.requirements.Critical;

import secret.ProtectedValues;

@Critical(integrity = "value:boolean", secrecy = "getValue():boolean")
public class FieldWriteAccess {

	public static void main(String[] args) {
		ProtectedValues protectedValues = new ProtectedValues();
		boolean value = protectedValues.getValue();
		System.out.println("Value before change: " + value);

		// Illegal assignment
		protectedValues.value = !value;

		System.out.println("EXPECTED" + ": Changed value: " + protectedValues.getValue() + ", expected vlaue: " + value);
	}

}
