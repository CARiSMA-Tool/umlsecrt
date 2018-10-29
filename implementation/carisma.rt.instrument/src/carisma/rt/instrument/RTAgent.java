package carisma.rt.instrument;

import java.lang.instrument.Instrumentation;

public class RTAgent {
	
	public static boolean DEBUG = false;
	
	public static void premain(String args, Instrumentation instrumentation) {
		System.out.println("[Agent] Start agent during JVM startup using argument '-javaagent'");
		parseArgs(args);
		instrumentation.addTransformer(new RTTransformer());
	}

	public static void agentmain(String args, Instrumentation instrumentation) {
		System.out.println("[Agent] Load agent into running JVM using Attach API");
		parseArgs(args);
		instrumentation.addTransformer(new RTTransformer());
	}
	
	private static final void parseArgs(String args) {
		if(args != null) {
			for(String arg : args.split(",")) {
				DEBUG |= "debug".equalsIgnoreCase(arg.trim());
			}
		}
	}
}
