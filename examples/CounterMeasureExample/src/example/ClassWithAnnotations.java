package example;

import org.gravity.security.annotations.CounterMeasure;
import org.gravity.security.annotations.requirements.Integrity;
import org.gravity.security.annotations.requirements.Secrecy;

public class ClassWithAnnotations {
	
	public ClassWithAnnotations() {
		System.out.println("-----> The secret in \"field:String\" is: "+field);
		System.out.println("-----> The secret of \"method():String\" is: "+field);
	}

	@Secrecy
	String field = "Some secret"; 
	
	@Secrecy(earlyReturn="c")@Integrity
	String method() {
		return field;
	}
	
	@CounterMeasure
	private String c() {
		StringBuilder b = new StringBuilder();
		for(int i = 0; i < 10 + 10 * Math.random(); i++) {
			b.append(((char) Math.round(65536 * Math.random())));
		}
		return b.toString();
	}
}
