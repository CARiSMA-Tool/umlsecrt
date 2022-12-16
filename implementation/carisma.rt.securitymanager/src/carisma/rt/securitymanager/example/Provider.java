package carisma.rt.securitymanager.example;

import org.gravity.security.annotations.requirements.Secrecy;

import carisma.rt.securitymanager.UMLsecRTPermission;

public class Provider {

	public String secret = "Secret";

	public void method() {
		System.out.println("method()");
		getClass().getClassLoader();
		internal();
	}

	@Secrecy
	public void internal() {
		try {
			System.getSecurityManager().checkPermission(new UMLsecRTPermission(Provider.class.getMethod("internal")));
		} catch (NoSuchMethodException | SecurityException e) {

		}
		System.out.println("internal()");
	}
}
