package carisma.rt.eval;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Configuration {

	public static final String JRE = "/usr/lib/jvm/java-8-oracle/jre/bin/java";
	public static final String AGENT = "/home/speldszus/Documents/git/umlsecrt/implementation/carisma.rt.instrument/umlsecrt.jar"; 
			//"/home/speldszus/Documents/svn/rgse/umlsecrt/implementation/carisma.rt.instrument/agent.jar";
	/**
	 * @param location
	 * @param cmd
	 * @param agent
	 * @return
	 * @throws IOException
	 */
	public static Process runJava(File location, List<String> cmd, boolean agent) throws IOException {
		List<String> cmdarray = new ArrayList<>();
		cmdarray.add(JRE);
		if (agent) {
			cmdarray.add("-javaagent:" + AGENT);
		}
		cmdarray.addAll(cmd);
		return Runtime.getRuntime().exec(cmdarray.toArray(new String[0]), null,	location.getAbsoluteFile());
	}

}
