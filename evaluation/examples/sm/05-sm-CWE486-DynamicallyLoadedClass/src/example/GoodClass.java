package example;

public class GoodClass {
	
	public String getSomeString() {
		System.getSecurityManager().checkPermission(new RuntimePermission("getSomeString()"));
		return "GoodString";
	}

	public String value;
}
