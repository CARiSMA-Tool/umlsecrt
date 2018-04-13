package passwords;

import java.util.Hashtable;

import org.gravity.security.annotations.requirements.Critical;
import org.gravity.security.annotations.requirements.Secrecy;

@Critical(integrity = { "checkMasterPassword" })
public class PasswordStore {

	@Secrecy(earlyReturn = "secure")
	private Hashtable<String, String> table = new Hashtable<String, String>();

	public String getPassword(String id, String pwd) {
		if (checkMasterPassword(pwd)) {
			return table.get(id);
		}
		throw new SecurityException();
	}

	private boolean checkMasterPassword(String pwd) {
		return true;
	}
	
	public void savePassword(String id, String password) {
		table.put(id, password);
	}

	public Hashtable<String, String> secure() {
		for (String key : table.keySet()) {
			table.put(key, randomString());
		}
		return table;
	}

	private String randomString() {
		return "replacement";
	}

}
