package example;

import org.gravity.security.annotations.requirements.Integrity;
import org.gravity.security.annotations.requirements.Secrecy;

public class GoodClass {
	
	@Secrecy@Integrity
	public String getSomeString() {
		return "GoodString";
	}

	@Secrecy@Integrity
	public String value;
}
