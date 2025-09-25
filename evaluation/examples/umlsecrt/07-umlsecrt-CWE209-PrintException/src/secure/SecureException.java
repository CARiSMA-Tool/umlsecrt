package secure;

import java.io.PrintStream;
import java.io.PrintWriter;

import org.gravity.security.annotations.requirements.Secrecy;

public class SecureException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4201547923417482602L;

	public SecureException(String string) {
		super(string);
	}

	@Override@Secrecy
	public void printStackTrace() {
		super.printStackTrace();
	}
	
	@Override@Secrecy
	public void printStackTrace(PrintStream s) {
		super.printStackTrace(s);
	}
	
	@Override@Secrecy
	public void printStackTrace(PrintWriter s) {
		super.printStackTrace(s);
	}
}
