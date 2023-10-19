package secure;

import java.io.PrintStream;
import java.io.PrintWriter;

public class SecureException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4201547923417482602L;

	public SecureException(String string) {
		super(string);
	}

	@Override
	public void printStackTrace() {
		System.getSecurityManager().checkPermission(new RuntimePermission("printStackTrace()"));
		super.printStackTrace();
	}
	
	@Override
	public void printStackTrace(PrintStream s) {
		System.getSecurityManager().checkPermission(new RuntimePermission("printStackTrace(PrintStream)"));
		super.printStackTrace(s);
	}
	
	@Override
	public void printStackTrace(PrintWriter s) {
		System.getSecurityManager().checkPermission(new RuntimePermission("printStackTrace(PrintWriter)"));
		super.printStackTrace(s);
	}
}
