package example;

public class ProtectedClass {
	
	private String m() {
		System.getSecurityManager().checkPermission(new RuntimePermission("m()"));
		System.out.println("[SUBJECT] m()");
		params("", this);
		return "secret";
	}
	
	private void params(String s, ProtectedClass p) {
		
	}
	
	String s = "Secret of field s";

	private String c() {
		System.getSecurityManager().checkPermission(new RuntimePermission("c()"));
		System.out.println(s);
		return "replacement";
	}
}
