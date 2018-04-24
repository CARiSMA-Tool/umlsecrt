package carisma.rt.test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.BeforeClass;
import org.junit.Test;

import carisma.rt.CarismaRT;
import carisma.rt.StreamRedirectThread;

public class SortBenchmark {
	
	private static String folder;

	@BeforeClass
	public static void setUp() {
		folder = "sort/logs/"+new SimpleDateFormat("yyyy-MM-dd_HH-mm").format(new Date())+"/";
	}
	
	@Test
	public void sortPlain() throws IOException, InterruptedException {
		String folder = SortBenchmark.folder + "plain/";
		new File(folder).mkdirs();
		
		Process proc = Runtime.getRuntime().exec(new String[] { "java", "-cp", "../examples/Sort/bin", "sort.RecursiveBubbleSort", folder+"sort_app.txt"  });
		StreamRedirectThread output = new StreamRedirectThread("output", proc.getInputStream(),
				new FileOutputStream(folder+"sort.txt"));
		StreamRedirectThread error = new StreamRedirectThread("error", proc.getErrorStream(),
				new FileOutputStream(folder+"sort_err.txt"));
		output.start();
		error.start();
		proc.waitFor();
	}

	@Test
	public void sortUMLsecRT() throws Exception {
		String folder = SortBenchmark.folder + "UMLsecRT/";
		new File(folder).mkdirs();
		try (FileOutputStream out = new FileOutputStream(folder+"sort.txt");
				FileOutputStream err = new FileOutputStream(folder + "sort_err.txt")) {
			new CarismaRT(new String[] { "-java", "-cp", "../examples/Sort/bin", "sort.RecursiveBubbleSort", folder+"sort_app.txt" }).run(out,
					err);
		}
	}
}
