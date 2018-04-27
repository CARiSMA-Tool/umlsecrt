package example;

public class FieldWrite {

	public static void main(String[] args) {
		new ClassWithAnnotations().field = "Corrupted Data";
		System.out.println("Wrote corrupted data to field woth @Integrity");
	}
}
