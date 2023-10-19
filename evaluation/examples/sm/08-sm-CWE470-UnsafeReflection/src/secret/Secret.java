package secret;


public class Secret {

	public Secret() {
		System.getSecurityManager().checkPermission(new RuntimePermission("Secret()"));
	}
	
}
