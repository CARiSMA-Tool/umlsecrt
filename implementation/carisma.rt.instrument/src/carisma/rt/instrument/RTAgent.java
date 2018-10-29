package carisma.rt.instrument;

import java.lang.instrument.Instrumentation;

public class RTAgent {
	
	public static final boolean DEBUG = false;
	
	public static void premain(String args, Instrumentation instrumentation) {
		System.out.println("[Agent] Start agent during JVM startup using argument '-javaagent'");
		instrumentation.addTransformer(new RTTransformer());
	}

	public static void agentmain(String args, Instrumentation instrumentation) {
		System.out.println("[Agent] Load agent into running JVM using Attach API");
		instrumentation.addTransformer(new RTTransformer());
	}
}
