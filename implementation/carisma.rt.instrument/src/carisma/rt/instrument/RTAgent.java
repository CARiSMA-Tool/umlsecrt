package carisma.rt.instrument;

import java.io.File;
import java.io.IOException;
import java.lang.instrument.Instrumentation;
import javassist.NotFoundException;

public class RTAgent {

	/**
	 * If recording sequence diagrams is enabled
	 */
	public static boolean PRINT = false;

	/**
	 * If calls should be traced after detecting a violation
	 */
	public static boolean TRACE = false;

	/**
	 * The output location
	 */
	public static File OUT = new File(".");

	public static void premain(String args, Instrumentation instrumentation) {
		System.out.println("[Agent] Start agent during JVM startup using argument '-javaagent'");
		run(args, instrumentation);
	}

	public static void agentmain(String args, Instrumentation instrumentation) {
		System.out.println("[Agent] Load agent into running JVM using Attach API");
		run(args, instrumentation);
	}

	/**
	 * @param args
	 * @param instrumentation
	 */
	private static void run(String args, Instrumentation instrumentation) {
		try {
			parseArgs(args);
			instrumentation.addTransformer(new RTTransformer(), instrumentation.isRetransformClassesSupported());
		} catch (IOException | NotFoundException e) {
			RTHelper.printAgentError(e);
		}
	}

	private static final void parseArgs(String args) throws IOException {
		if (args != null) {
			for (String arg : args.split(",")) {
				String[] a = arg.split("=");
				switch (a[0].trim().toLowerCase()) {
				case "trace":
					TRACE = true;
					break;
				case "print":
					PRINT = true;
					break;
				case "out":
					if (a.length == 2) {
						OUT = new File(a[1]);
						if (!OUT.exists()) {
							OUT.mkdirs();
						} else {
							if (OUT.isFile()) {
								throw new IOException("The output directory is a file.");
							}
						}
						break;
					}
				case "help":
				default:
					printHelp();
					break;
				}
			}
		}
	}

	/**
	 * 
	 */
	private static void printHelp() {
		System.out.println(
				"UMLsecRT Help\nThe options are:\n\tPRINT to continue printing the call stack after a violation has been detected\n\tOUT=<path> the path where logs should be stored");
	}
}
