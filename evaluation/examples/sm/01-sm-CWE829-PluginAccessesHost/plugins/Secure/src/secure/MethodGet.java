package secure;

import org.gravity.security.annotations.requirements.Critical;
import host.Interface;
import host.Manager;
import secret.Secret;

@Critical(secrecy = {"secret.Secret.secret:String","secret.Secret.secret()"}, integrity = {"secret.Secret.secret:String","secret.Secret.setSecret(java.lang.String)"})
public class MethodGet implements Interface {
	
	@Override
	public void startUp(Manager manager) {
		System.out.println("Accessed the secret: "+((Secret) manager.getPlugin("secret")).secret());
	}
	
	@Override
	public String getID() {
		return "secureFR";
	}
}
