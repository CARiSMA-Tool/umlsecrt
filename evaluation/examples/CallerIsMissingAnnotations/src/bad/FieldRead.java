package bad;

import example.ClassWithAnnotations;

public class FieldRead {

	public static void main(String[] args) {
		ClassWithAnnotations subject = new ClassWithAnnotations();
		System.out.println("[ATTACKER] Created instance of subject.");
		subject.printField();
		System.out.println("[ATTACKER] Try to read secret data");
		System.out.println("[ATTACKER] The secret data is: "+ subject.field);
		subject.printField();
	}
}
