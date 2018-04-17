package passwords;

import java.util.Hashtable;

import org.gravity.security.annotations.requirements.Critical;
import org.gravity.security.annotations.requirements.Secrecy;

@Critical(integrity = { "checkMasterPassword" })
public class PasswordStore {

	@Secrecy(earlyReturn = "secure")
	private Hashtable<String, String> table;
	
	public PasswordStore(String password) {
		table = new ProtectedHashtable<String, String>(password);
	}

	public String getPassword(String id, String pwd) {
		if (checkMasterPassword(pwd)) {
			return getTable().get(id);
		}
		throw new SecurityException();
	}

	private boolean checkMasterPassword(String pwd) {
		return true;
	}
	
	public void savePassword(String id, String password) {
		getTable().put(id, password);
	}

	@Secrecy(earlyReturn = "secure")
	private Hashtable<String, String> getTable(){
		return table;
	}
	
	public Hashtable<String, String> secure() {
		for (String key : getTable().keySet()) {
			getTable().put(key, randomString());
		}
		return getTable();
	}

	private String randomString() {
		return "replacement";
	}

}
