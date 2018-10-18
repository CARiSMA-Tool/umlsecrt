package example;

import org.gravity.security.annotations.CounterMeasure;
import org.gravity.security.annotations.requirements.Critical;
import org.gravity.security.annotations.requirements.Integrity;
import org.gravity.security.annotations.requirements.Secrecy;

@Critical
public class ProtectedClass {
	
	@Secrecy@Integrity
	private void m() {
		System.out.println("Secret of method m()");
	}
	
	@Secrecy@Integrity(earlyReturn="c")
	String s = "Secret of field s";

	@CounterMeasure
	private String c() {
		System.out.println(s);
		return "replacement";
	}
}
