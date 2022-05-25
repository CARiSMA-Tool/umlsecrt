package carisma.rt.securitymanager;

import java.io.File;
import java.io.FilePermission;
import java.lang.reflect.InvocationTargetException;

public class Caller {

	public static void main(String[] args) {
		// set the policy file as the system securuty policy
		System.setProperty("java.security.policy", new File("umlsecrt.policy").getAbsolutePath());

		
		RTSecurityManager sm = new RTSecurityManager();
		System.setSecurityManager(sm);
	    
		Caller caller = new Caller();
		caller.getClass().getProtectionDomain().getPermissions();
		caller.call();
	}
	
	private void call() {
		System.out.println("call()");
		Provider p = new Provider();
		
		String secret = p.secret;
		try {
			p.getClass().getDeclaredMethods()[0].invoke(p, new Object[0]);
		} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException | SecurityException e) {
			e.printStackTrace();
		}
	}
}
