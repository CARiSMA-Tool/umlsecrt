package carisma.rt.test;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import carisma.rt.CarismaRT;
import carisma.rt.StreamRedirectThread;

@RunWith(Parameterized.class)
public class DacapoBenchmark {

	private static final String[] BENCHMARKS = new String[] {/*"luindex",*/ "lusearch", "fop", "xalan", "pmd",
			"tradebeans", "sunflow", "fop", "tomcat", "jython", "avrora", "h2", "tradesoap", "eclipse", "batik" };
	private static final String DACAPO = "dacapo/dacapo-9.12-MR1-bach.jar";
	private String testcase;
	private String timestamp;

	public DacapoBenchmark(String testCase, String timestamp) {
		this.timestamp = timestamp;
		this.testcase = testCase;
	}

	@Parameters(name = "{index}: {0}")
	public static Collection<String[]> parameters() {
		String timestamp = new SimpleDateFormat("yyyy-MM-dd_HH-mm").format(new Date());
		ArrayList<String[]> values = new ArrayList<>();
		for (String testcase : BENCHMARKS) {
			values.add(new String[] { testcase, timestamp });
		}
		return values;
	}

	@Test
	public void dacapoPlain() throws Exception {
		try {
			String folder = "dacapo/logs/"+timestamp+"/plain/";
			new File(folder).mkdirs();
			String prefix = folder + "dacapo_" + timestamp + "_plain_";
			Process proc = Runtime.getRuntime().exec(new String[] { "java", "-jar", DACAPO, testcase });
			StreamRedirectThread output = new StreamRedirectThread("output", proc.getInputStream(),
					new FileOutputStream(prefix + testcase + ".txt"));
			StreamRedirectThread error = new StreamRedirectThread("error", proc.getErrorStream(),
					new FileOutputStream(prefix + testcase + "_errors.txt"));
			output.start();
			error.start();
			proc.waitFor();
			assertEquals(0, proc.exitValue());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Test//(timeout = 300000)
	public void dacapoUMLsecRT() throws MalformedURLException {
		System.out.println(timestamp+" - Start Benchmark: " + testcase);
		String folder = "dacapo/logs/"+timestamp+"/umlsecrt/";
		new File(folder).mkdirs();
		String prefix = folder+"dacapo_" + timestamp + "_UMLsecRT_";
		try (FileOutputStream out = new FileOutputStream(prefix + testcase + ".txt");
				FileOutputStream err = new FileOutputStream(
						prefix + testcase + "_error.txt")) {
			new CarismaRT(new String[] { "-java", "-jar", DACAPO, testcase }).run(out, err);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
