package carisma.rt.securitymanager;

public class Provider {
	
	public String secret = "Secret";
	
	public void method() {
		System.out.println("method()");
		getClass().getClassLoader();
		internal();
	}
	
	public void internal() {
		System.out.println("internal()");
	}
}
