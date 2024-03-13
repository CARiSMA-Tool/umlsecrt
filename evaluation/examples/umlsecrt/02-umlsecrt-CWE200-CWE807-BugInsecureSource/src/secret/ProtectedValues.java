package secret;

import java.security.SecureRandom;

import org.gravity.security.annotations.requirements.Integrity;
import org.gravity.security.annotations.requirements.Secrecy;

public class ProtectedValues {
	
	public ProtectedValues() {
		value = (new SecureRandom()).nextInt(2) == 0;
	}

	@Secrecy@Integrity
	public boolean value;
	
	@Secrecy
	public boolean getValue() {
		return value;
	}

	@Integrity
	public void setValue(boolean value) {
		this.value = value;
	}
}