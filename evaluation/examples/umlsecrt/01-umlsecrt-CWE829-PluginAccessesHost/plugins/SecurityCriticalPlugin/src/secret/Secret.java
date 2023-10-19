package secret;

import org.gravity.security.annotations.requirements.Integrity;
import org.gravity.security.annotations.requirements.Secrecy;
import host.Interface;
import host.Manager;

public class Secret implements Interface {
	
	@Secrecy@Integrity
	public String secret = "the secret";
	
	@Secrecy
	public String secret() {
		System.out.println("@Secrecy secret:String");
		return this.secret;
	}
	
	@Integrity
	public void setSecret(String secret) {
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
