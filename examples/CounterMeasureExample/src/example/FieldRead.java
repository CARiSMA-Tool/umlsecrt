package example;

import org.gravity.security.annotations.requirements.Critical;

@Critical(integrity= {"example.ClassWithAnnotations.field:String"})
public class FieldRead {

	public static void main(String[] args) {
		System.out.println(new ClassWithAnnotations().field);
	}
}
