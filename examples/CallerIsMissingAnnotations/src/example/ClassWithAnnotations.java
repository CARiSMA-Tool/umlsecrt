package example;

import org.gravity.security.annotations.requirements.Integrity;
import org.gravity.security.annotations.requirements.Secrecy;

public class ClassWithAnnotations {
	
	public ClassWithAnnotations() {
		System.out.println("[SUBJECT] The initial value of the field is: "+field);
	}

	@Secrecy(earlyReturn = "c")@Integrity(earlyReturn = "c")
	String field = "Some secret"; 
	
	@Secrecy@Integrity
	String method() {
		return field;
	}
	
	public String c() {
		System.out.println("[SUBJECT] Execute counter measure");
		return "COUNTER MEASURE";
	}
	
	public void printField() {
		System.out.println("[SUBJECT] The current value of the field is: "+field);
	}
}
