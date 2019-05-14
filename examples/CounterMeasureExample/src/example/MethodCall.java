package example;

import org.gravity.security.annotations.requirements.Critical;

@Critical(integrity= {"example.ClassWithAnnotations.method()"})
public class MethodCall {

	public static void main(String[] args) {
		System.out.println("---> I stole the secret: "+new ClassWithAnnotations().method());
	}
}
