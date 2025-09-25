package secret;

import java.security.SecureRandom;

import org.gravity.security.annotations.requirements.Integrity;
import org.gravity.security.annotations.requirements.Secrecy;

public class ProtectedValues {
	
	public ProtectedValues() {
		boolean internal = (new SecureRandom()).nextInt(2) == 0;
		value = internal;
	}

	@Secrecy@Integrity
	public boolean value;

	@Secrecy@Integrity
	public boolean getValue() {
		return value;
	}

	@Secrecy@Integrity
	public void setValue(boolean value) {
		this.value = value;
	}
}
