package carisma.rt.test;

import java.net.MalformedURLException;

import org.junit.Test;

import carisma.rt.CarismaRT;

public class ClassloaderTests {

	@Test
	public void classloaderMethodCall() throws MalformedURLException {	
		CarismaRT.main(new String[] { "-java", "-cp", "../examples/Classloader/bin", "malware.MalwareMethodCall" });
	}
	
	@Test
	public void classloaderFieldWrite() throws MalformedURLException {
		CarismaRT.main(new String[] { "-java", "-cp", "../examples/Classloader/bin", "malware.MalwareFieldWrite" });
	}
	
	@Test
	public void classloaderFieldRead() throws MalformedURLException {
		CarismaRT.main(new String[] { "-java", "-cp", "../examples/Classloader/bin", "malware.MalwareFieldRead" });
	}
}
