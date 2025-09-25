package example;

import java.io.Serializable;

public class ClassWithSecretData implements Serializable {

	private static final long serialVersionUID = 100000L;
	
	private String passwordHash;

	public void setPassword(String password) {
		passwordHash = password;
	}

	public void printSecret() {
		System.getSecurityManager().checkPermission(new RuntimePermission("printSecret"));
		System.out.println("The Secret is: \""+passwordHash+"\"");
	}
}
