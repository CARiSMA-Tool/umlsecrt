package secret;

import java.security.SecureRandom;

import org.gravity.security.annotations.requirements.Integrity;
import org.gravity.security.annotations.requirements.Secrecy;

public class ProtectedValues {
	
	public ProtectedValues() {
		zeroOrOne = (new SecureRandom()).nextInt(2) == 0;
	}

	@Secrecy@Integrity
	public boolean zeroOrOne;
}
