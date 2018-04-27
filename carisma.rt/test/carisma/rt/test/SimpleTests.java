package carisma.rt.test;

import java.net.MalformedURLException;

import org.junit.Test;

import carisma.rt.CarismaRT;

public class SimpleTests {

	@Test
	public void simpleMethodCall() throws MalformedURLException {
		CarismaRT.main(new String[] { "-java", "-cp", "../examples/MissingAmmotations/bin", "example.MethodCall" });
	}
	
	@Test
	public void simpleFieldRead() throws MalformedURLException {
		CarismaRT.main(new String[] { "-java", "-cp", "../examples/MissingAmmotations/bin", "example.FieldRead" });
	}
	
	@Test
	public void simpleFieldWrite() throws MalformedURLException {
		CarismaRT.main(new String[] { "-java", "-cp", "../examples/MissingAmmotations/bin", "example.FieldWrite" });
	}
	
	@Test
	public void paperExample() throws MalformedURLException {
		CarismaRT.main(new String[] { "-java", "-cp", "../examples/PaperExample/bin", "malware.MaliciousApplication" });
	}

	@Test
	public void codeInjection() throws MalformedURLException {
		CarismaRT.main(new String[] { "-java", "-cp", "../examples/CodeInjection/bin", "example.CodeInjection" });
	}
}
