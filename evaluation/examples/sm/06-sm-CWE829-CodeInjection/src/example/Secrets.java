package example;

public class Secrets {

	public static String field = "Secrets new";
	
	public static String method() {
		System.getSecurityManager().checkPermission(new RuntimePermission("method()"));
		return "Secrets";
	}
}
