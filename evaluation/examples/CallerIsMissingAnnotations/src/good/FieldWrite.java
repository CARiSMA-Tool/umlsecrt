package good;

import example.ClassWithAnnotations;

public class FieldWrite {

	public static void main(String[] args) {
		ClassWithAnnotations subject = new ClassWithAnnotations();
		System.out.println("[ATTACKER] Created instance of subject.");
		subject.printField();
		String data = "Corrupted Data";
		System.out.println("[ATTACKER] Try to wirte corrupted date to the field: " + data);
		subject.field = data;
		System.out.println("Wrote corrupted data to field with @Integrity");
		subject.printField();
	}
}
