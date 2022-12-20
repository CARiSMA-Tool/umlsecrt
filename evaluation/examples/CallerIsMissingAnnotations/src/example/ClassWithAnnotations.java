package example;

import org.gravity.security.annotations.requirements.Integrity;
import org.gravity.security.annotations.requirements.Secrecy;

public class ClassWithAnnotations {

	public ClassWithAnnotations() {
		System.out.println("[SUBJECT] The initial value of the field is: "+this.field);
	}

	@Secrecy(earlyReturn = "c")@Integrity(earlyReturn = "c")
	public String field = "Some secret";

	@Secrecy@Integrity
	public String method() {
		System.getSecurityManager().checkPermission(new RuntimePermission("method"));
		return this.field;
	}

	public String c() {
		System.out.println("[SUBJECT] Execute counter measure");
		return "COUNTER MEASURE";
	}

	public void printField() {
		System.out.println("[SUBJECT] The current value of the field is: "+this.field);
	}
}
