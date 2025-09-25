package secure;

import org.gravity.security.annotations.requirements.Critical;
import host.Interface;
import host.Manager;
import secret.Secret;

@Critical(secrecy = {"secret.Secret.secret:String","secret.Secret.secret()"}, integrity = {"secret.Secret.secret:String","secret.Secret.setSecret(java.lang.String)"})
public class MethodSet implements Interface {
	
	@Override
	public void startUp(Manager manager) {
		Secret secret = (Secret) manager.getPlugin("secret");
		System.out.println("Secret before change: "+secret.secret());
		secret.setSecret("Bad value");
		System.out.println("Secret after change: "+secret.secret());
	}
	
	@Override
	public String getID() {
		return "secureFR";
	}
}
