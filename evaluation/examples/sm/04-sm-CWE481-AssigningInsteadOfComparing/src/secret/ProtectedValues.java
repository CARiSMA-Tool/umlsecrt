package secret;

import java.security.SecureRandom;

public class ProtectedValues {
	
	public ProtectedValues() {
		zeroOrOne = (new SecureRandom()).nextInt(2) == 0;
	}

	public boolean zeroOrOne;
}
