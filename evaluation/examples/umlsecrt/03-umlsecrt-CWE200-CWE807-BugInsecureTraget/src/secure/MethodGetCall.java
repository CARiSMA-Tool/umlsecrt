package secure;

import org.gravity.security.annotations.requirements.Critical;

import secret.ProtectedValues;

@Critical(secrecy =  "getValue():boolean")
public class MethodGetCall {

	public static void main(String[] args) {
		// Illegal call
		System.out.println("EXPECTED: Secret value: " + new ProtectedValues().getValue());
	}

}
