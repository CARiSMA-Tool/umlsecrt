package data;

public class Secrets {

	private String secret = "Secret";

	public String getSecret(){
		System.getSecurityManager().checkPermission(new RuntimePermission("getSecret"));
		return secret;
	}
	
	public void updateSecret(String newSecret) {
		System.getSecurityManager().checkPermission(new RuntimePermission("updateSecret"));
		secret = newSecret;
	}
}
