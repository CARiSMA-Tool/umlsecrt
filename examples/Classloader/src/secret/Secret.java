package secret;

import org.gravity.security.annotations.requirements.Integrity;
import org.gravity.security.annotations.requirements.Secrecy;

public class Secret {
	
	@Secrecy @Integrity
	public static String secret = "Field Secret"; 

	@Secrecy @Integrity
	public static String secret() {
		return "Method Secret";
	}
}
