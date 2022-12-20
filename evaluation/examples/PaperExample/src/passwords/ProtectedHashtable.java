package passwords;

import java.util.Hashtable;

public class ProtectedHashtable<T1, T2> extends Hashtable<String, String> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5975685199424870468L;
	private String master;
	
	public ProtectedHashtable(String master) {
		this.master = master;
	}

	@Override
	public synchronized String get(Object key) {
		throw new SecurityException();
	}
	
	public synchronized String get(Object key, String password) {
		if(master.equals(password)) {
			return super.get(key);
		}
		throw new SecurityException();
	}
}
