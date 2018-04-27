package example;

import org.gravity.security.annotations.requirements.Integrity;
import org.gravity.security.annotations.requirements.Secrecy;

public class ClassWithAnnotations {

	@Secrecy@Integrity
	String field = "Some secret"; 
	
	@Secrecy@Integrity
	String method() {
		return field;
	}
}
