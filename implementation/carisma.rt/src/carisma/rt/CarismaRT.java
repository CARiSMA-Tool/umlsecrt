package carisma.rt;

import com.sun.jdi.VirtualMachine;
import com.sun.jdi.Bootstrap;
import com.sun.jdi.connect.*;
import java.util.Map;
import java.util.Set;
import java.util.jar.JarEntry;
import java.util.jar.JarInputStream;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class CarismaRT {

	// Running remote VM
	private final VirtualMachine vm;

	// Class patterns for which we don't want events
	private String[] excludes = new String[] { "javax.*", "sun.*", "com.sun.*", "jdk.*", "java.*" }; //"java.*"

	private Set<URL> classpath = new HashSet<URL>();

	public static void main(String[] args) throws MalformedURLException {
		new CarismaRT(args).run();
	}

	/**
	 * Parse the command line arguments. Launch target VM.
	 * @throws MalformedURLException 
	 */
	public CarismaRT(String[] args) throws MalformedURLException {
		String[] strings = parseArgs(args);
		vm = launchTarget(strings);
	}

	private String[] parseArgs(String[] args) {
		int inx;
		for (inx = 0; inx < args.length; ++inx) {
			String arg = args[inx];
			if (arg.charAt(0) != '-') {
				break;
			}
			if (arg.equals("-all")) {
				excludes = new String[0];
			}
			if (arg.equals("-help")) {
				usage();
				System.exit(0);
			} else if(arg.equals("-java")) {
				inx++;
				break;
			} else {
				System.err.println("No option: " + arg);
				usage();
				System.exit(1);
			} 
		}
		if (inx >= args.length) {
			System.err.println("<class> missing");
			usage();
			System.exit(1);
		}
		String[] strings = new String[args.length - inx];
		System.arraycopy(args, inx, strings, 0, strings.length);
		return strings;
	}

	/**
	 * Generate the trace. Enable events, start thread to display events, start
	 * threads to forward remote error and output streams, resume the remote VM,
	 * wait for the final event, and shutdown.
	 */
	public void run(OutputStream out, OutputStream err) {
		Set<String> allExcludes = getRestrictedPackages();
		EventThread eventThread = new EventThread(vm, allExcludes, classpath);
		eventThread.start();
		
		Process process = vm.process();
		try(BufferedReader r = new BufferedReader(new InputStreamReader(process.getErrorStream()))) {
			String  line;
			while((line = r.readLine())!= null){
				System.err.println(line);
			}
		}
//		errThread = new StreamRedirectThread("error reader", process.getErrorStream(), err);
//		outThread = new StreamRedirectThread("output reader", process.getInputStream(), out);
//		errThread.start();
//		outThread.start();
 catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
		
//		vm.resume();

		// Shutdown begins when event thread terminates
//		try {
//			eventThread.join();
//			errThread.join(); // Make sure output is forwarded
//			outThread.join(); // before we exit
//		} catch (InterruptedException exc) {
//			// we don't interrupt
//			System.err.println("Interruption");
//		}
	}
	
	private void run() {
		run(System.out, System.err);
	}

	private Set<String> getRestrictedPackages() {
		String[] restrictedPackages = java.security.Security.getProperty("package.access").split(",");
		Set<String> allExcludes = new HashSet<>(restrictedPackages.length + excludes.length);
		allExcludes.addAll(Arrays.asList(restrictedPackages));
		allExcludes.addAll(Arrays.asList(excludes));
		return allExcludes;
	}

	/**
	 * Launch target VM. Forward target's output and error.
	 * @throws MalformedURLException 
	 */
	VirtualMachine launchTarget(String[] args) throws MalformedURLException {
		LaunchingConnector connector = findLaunchingConnector();
		Map<String, Connector.Argument> arguments = connectorArguments(connector, args);
		try {
			return connector.launch(arguments);
		} catch (IOException exc) {
			throw new Error("Unable to launch target VM: " + exc);
		} catch (IllegalConnectorArgumentsException exc) {
			throw new Error("Internal error: " + exc);
		} catch (VMStartException exc) {
			throw new Error("Target VM failed to initialize: " + exc.getMessage());
		}
	}

	/**
	 * Find a com.sun.jdi.CommandLineLaunch connector
	 */
	LaunchingConnector findLaunchingConnector() {
		List<Connector> connectors = Bootstrap.virtualMachineManager().allConnectors();
		for (Connector connector : connectors) {
			if (connector.name().equals("com.sun.jdi.CommandLineLaunch")) {
				return (LaunchingConnector) connector;
			}
		}
		throw new Error("No launching connector");
	}

	/**
	 * Return the launching connector's arguments.
	 * @throws MalformedURLException 
	 */
	Map<String, Connector.Argument> connectorArguments(LaunchingConnector connector, String[] args) throws MalformedURLException {
		Map<String, Connector.Argument> arguments = connector.defaultArguments();

		Connector.Argument mainArg = arguments.get("main");
		Connector.Argument optionsArg = arguments.get("options");
		if (mainArg == null || optionsArg == null) {
			throw new Error("Bad launching connector");
		}
		
		StringBuilder options = new StringBuilder();
		int i = 0;
		for (; i < args.length; i++) {
			String arg = args[i];
			if (arg.equals("-cp")) {
				arg = args[++i];
				options.append("-cp");
				options.append(' ');
				options.append(arg);
				for(String cp : arg.split(":")) {
					classpath.add(new File(cp).toURI().toURL());
				}
				
			} else {
				if (arg.startsWith("-")) {
					if(arg.equals("-jar")) {
						try {
							getClassPathEntriesFromJAR(new FileInputStream(args[i+1]),args[i+1]);
						} catch (FileNotFoundException e) {
							e.printStackTrace();
						}
						classpath.add(new URL("file:jar:"+args[i+1]+"!/"));
						break;
					}
					else {
						
					}
				} else {
					break;
				}
			}
		}
		optionsArg.setValue(options.toString());
		

		StringBuilder main = new StringBuilder();
		for( ; i< args.length; i++) {
			main.append(args[i]);
			main.append(' ');
		}
		mainArg.setValue(main.toString());

		return arguments;
	}

	private void getClassPathEntriesFromJAR(InputStream stream, String path) {
		try(JarInputStream entries = new JarInputStream(stream)){
			JarEntry entry;
			while((entry = entries.getNextJarEntry())!=null) {
				String name = entry.getName();
				if(name.endsWith(".class")) {
					int lastIndexOf = 1;
					String substring = name;
					do {
						lastIndexOf = substring.lastIndexOf('/');
						substring = (lastIndexOf > 0 ? substring.substring(0, lastIndexOf) : "");
						classpath.add(new URL("jar:file:"+path+"!/"+ substring +'/'));
					}
					while (lastIndexOf > 0);
				}
				else if (name.endsWith(".jar")) {
					 FilterInputStream inner = new FilterInputStream(entries) {
			                public void close() throws IOException {
			                    // ignore the close
			                }
			            };
					getClassPathEntriesFromJAR(inner, path+"!/"+entry.getName());
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Print command line usage help
	 */
	void usage() {
		System.err.println("Usage: java Trace <options> -java <java-options> [<class> | -jar <path>] <args>");
		System.err.println("<options> are:");
		System.err.println("  -all                 Include system classes in output");
		System.err.println("  -help                Print this help message");
		System.err.println("<class> is the program to trace");
		System.err.println("<path> is the path of the jar file containing the program to trace");
		System.err.println("<args> are the arguments to the executed program");
	}
}
