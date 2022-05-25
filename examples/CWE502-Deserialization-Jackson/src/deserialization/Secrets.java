package deserialization;

import org.gravity.security.annotations.requirements.Integrity;
import org.gravity.security.annotations.requirements.Secrecy;

public class Secrets {

	@Secrecy@Integrity
	private String secret = "Secret";

	@Secrecy
	public String getSecret(){
		return secret;
	}
	
	@Integrity
	public void updateSecret(String newSecret) {
		secret = newSecret;
	}
}
