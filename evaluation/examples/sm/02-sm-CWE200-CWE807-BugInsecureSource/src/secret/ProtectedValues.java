package secret;

import java.security.SecureRandom;

public class ProtectedValues {
	
	public ProtectedValues() {
		value = (new SecureRandom()).nextInt(2) == 0;
	}

	public boolean value;
	
	public boolean getValue() {
		System.getSecurityManager().checkPermission(new RuntimePermission("getValue()"));
		return value;
	}

	public void setValue(boolean value) {
		System.getSecurityManager().checkPermission(new RuntimePermission("setValue(boolean)"));
		this.value = value;
	}
}
