package carisma.rt.test;

import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;

import org.junit.Test;

import carisma.rt.CarismaRT;

public class JavaReflectionTest {

	@Test
	public void javaReflectionMethodCall() throws MalformedURLException {
		try (FileOutputStream out = new FileOutputStream("reflection.txt");
				FileOutputStream err = new FileOutputStream("reflection_err.txt")) {
			new CarismaRT(new String[] { "-java", "-cp", "../examples/JavaReflection/bin", "example.MethodCall" }).run(out,
					err);
		} catch (IOException e) {

		}
	}

	@Test
	public void javaReflectionFieldRead() throws Exception {
		try (FileOutputStream out = new FileOutputStream("reflection.txt");
				FileOutputStream err = new FileOutputStream("reflection_err.txt")) {
			new CarismaRT(new String[] { "-java", "-cp", "../examples/JavaReflection/bin", "example.FieldRead" }).run(out,
					err);
		}
	}
	


	@Test
	public void javaReflectionFieldWrite() throws Exception {
		try (FileOutputStream out = new FileOutputStream("reflection.txt");
				FileOutputStream err = new FileOutputStream("reflection_err.txt")) {
			new CarismaRT(new String[] { "-java", "-cp", "../examples/JavaReflection/bin", "example.FieldRead" }).run(out,
					err);
		}
	}
}
