package carisma.rt.test;

import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;

import org.junit.Test;

import carisma.rt.CarismaRT;

public class LibTest {

	@Test
	public void libnMethodCall() throws MalformedURLException {
		try (FileOutputStream out = new FileOutputStream("reflection.txt");
				FileOutputStream err = new FileOutputStream("reflection_err.txt")) {
			new CarismaRT(new String[] { "-java", "-cp", "../examples/MaliciousLib/bin:../examples/MaliciousLib/lib/Lib.jar", "example.MethodCall" }).run(out,
					err);
		} catch (IOException e) {

		}
	}

	@Test
	public void libFieldRead() throws Exception {
		try (FileOutputStream out = new FileOutputStream("reflection.txt");
				FileOutputStream err = new FileOutputStream("reflection_err.txt")) {
			new CarismaRT(new String[] { "-java", "-cp", "../examples/MaliciousLib/bin:../examples/MaliciousLib/lib/Lib.jar", "example.FieldRead" }).run(out,
					err);
		}
	}
	


	@Test
	public void libFieldWrite() throws Exception {
		try (FileOutputStream out = new FileOutputStream("reflection.txt");
				FileOutputStream err = new FileOutputStream("reflection_err.txt")) {
			new CarismaRT(new String[] { "-java", "-cp", "../examples/MaliciousLib/bin:../examples/MaliciousLib/lib/Lib.jar", "example.FieldRead" }).run(out,
					err);
		}
	}
}
