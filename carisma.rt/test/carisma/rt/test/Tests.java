package carisma.rt.test;

import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;

import org.junit.Test;

import carisma.rt.CarismaRT;

public class Tests {

	@Test
	public void paperExample() throws MalformedURLException {
		CarismaRT.main(new String[] { "-java", "-cp", "../examples/PaperExample/bin", "malware.MaliciousApplication" });
	}

	@Test
	public void codeInjection() throws MalformedURLException {
		CarismaRT.main(new String[] { "-java", "-cp", "../examples/CodeInjection/bin", "example.CodeInjection" });
	}

	@Test
	public void javaReflection() throws MalformedURLException {
		try (FileOutputStream out = new FileOutputStream("reflection.txt");
				FileOutputStream err = new FileOutputStream("reflection_err.txt")) {
			new CarismaRT(new String[] { "-java", "-cp", "../examples/JavaReflection/bin", "example.A" }).run(out,
					err);
		} catch (IOException e) {

		}
	}

	@Test
	public void javaReflectionFieldAccess() throws Exception {
		try (FileOutputStream out = new FileOutputStream("reflection.txt");
				FileOutputStream err = new FileOutputStream("reflection_err.txt")) {
			new CarismaRT(new String[] { "-java", "-cp", "../examples/JavaReflection/bin", "example.A2" }).run(out,
					err);
		}
	}
}
