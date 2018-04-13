package passwords;

public class Application {
	
	PasswordStore pwds = new PasswordStore();

	public void requestPassword() {
		String pwd = pwds.getPassword("ID", "MasterPassword");
		System.out.println("Requested pwd: "+pwd);
	}
}
