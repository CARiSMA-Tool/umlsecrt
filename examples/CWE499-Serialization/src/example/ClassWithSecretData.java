package example;

import java.io.Serializable;

import org.gravity.security.annotations.requirements.Integrity;
import org.gravity.security.annotations.requirements.Secrecy;

public class ClassWithSecretData implements Serializable {

	private static final long serialVersionUID = 100000L;
	
	@Secrecy @Integrity
	private String passwordHash;

	public void setPassword(String password) {
		passwordHash = password;
	}

	public void printSecret() {
		System.out.println("The Secret is: \""+passwordHash+"\"");
	}
}
