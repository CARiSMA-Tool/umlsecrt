package carisma.rt.securitymanager.example;

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import carisma.rt.securitymanager.RTSecurityManager;

public class Caller {

	public static void main(final String[] args) {
		// set the policy file as the system securuty policy
		System.setProperty("java.security.policy", new File("umlsecrt.policy").getAbsolutePath());

		final RTSecurityManager sm = new RTSecurityManager();
		System.setSecurityManager(sm);

		final Caller caller = new Caller();
		// caller.getClass().getProtectionDomain().getPermissions();
		caller.call();
	}

	private void call() {
		System.out.println("call()");
		final Provider p = new Provider();

		System.out.println("Access field");
		final String secret = p.secret;

		System.out.println("Access");
		p.method();
		p.internal();

		System.out.println("Access using reflection");
		try {
			for(final Method method : p.getClass().getDeclaredMethods()) {
				System.out.println("Invoke: " + method.getName());
				method.invoke(p);
			}
		} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException | SecurityException e) {
			e.printStackTrace();
		}
	}
}
