package good;

import org.gravity.security.annotations.requirements.Critical;

import example.ClassWithAnnotations;

@Critical(secrecy = "method()", integrity = "method()")
public class FieldRead {

	public static void main(final String[] args) {
		final ClassWithAnnotations subject = new ClassWithAnnotations();
		System.out.println("[ATTACKER] Created instance of subject.");
		subject.printField();
		System.out.println("[ATTACKER] Try to read secret data");
		System.out.println("[ATTACKER] The secret data is: "+ subject.field);
		subject.printField();
	}
}
