package secure;

import org.gravity.security.annotations.requirements.Critical;

import secret.ProtectedValues;

@Critical(secrecy =  "value:boolean")
public class FieldReadAccess {

	public static void main(String[] args) {
		// Illegal access
		System.out.println("EXPECTED: Secret value: " + new ProtectedValues().value);
	}

}
