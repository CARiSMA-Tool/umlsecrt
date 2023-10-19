package secret;

import java.security.SecureRandom;

public class ProtectedValues {
	
	public ProtectedValues() {
		value = (new SecureRandom()).nextInt(2) == 0;
	}

	public boolean value;
	
	public boolean getValue() {
		return value;
	}

	public void setValue(boolean value) {
		this.value = value;
	}
}
