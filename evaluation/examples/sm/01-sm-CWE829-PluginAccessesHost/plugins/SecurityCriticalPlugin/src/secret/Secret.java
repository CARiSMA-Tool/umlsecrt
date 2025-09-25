package secret;

import host.Interface;
import host.Manager;

public class Secret implements Interface {
	
	public String secret = "the secret";
	
	public String secret() {
		System.getSecurityManager().checkPermission(new RuntimePermission("secret.Secret.secret()"));
		System.out.println("@Secrecy secret:String");
		return this.secret;
	}
	
	public void setSecret(String secret) {
		System.getSecurityManager().checkPermission(new RuntimePermission("secret.Secret.setScret(String)"));
		System.out.println("@Integrity setSecret(String)");
		this.secret = secret;
	}
	
	@Override
	public void startUp(Manager manager) {
		System.out.println("Secret plugin has been loaded");
	}
	
	@Override
	public String getID() {
		return "secret";
	}
}
