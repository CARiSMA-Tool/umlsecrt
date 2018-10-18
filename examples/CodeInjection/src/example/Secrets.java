package example;

import org.gravity.security.annotations.requirements.Integrity;
import org.gravity.security.annotations.requirements.Secrecy;

public class Secrets {

	@Secrecy@Integrity
	public static String field = "Secrets";
	
	@Secrecy@Integrity
	public static String method() {
		return "Secrets";
	}
}
