package carisma.rt;

import com.sun.jdi.VirtualMachine;
import com.sun.jdi.Bootstrap;
import com.sun.jdi.connect.*;
import java.util.Map;
import java.util.Set;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import java.io.IOException;

public class CarismaRT {

	// Running remote VM
	private final VirtualMachine vm;

	// Thread transferring remote error stream to our error stream
	private Thread errThread = null;

	// Thread transferring remote output stream to our output stream
	private Thread outThread = null;

	// Class patterns for which we don't want events
	private String[] excludes = new String[]{ "java.*", "javax.*", "sun.*", "com.sun.*", "jdk.*" };

	private Set<String> classpath = new HashSet<String>();

	public static void main(String[] args) {
		new CarismaRT(args).run();
	}

	/**
	 * Parse the command line arguments. Launch target VM.
	 */
	CarismaRT(String[] args) {
		int inx;
		for (inx = 0; inx < args.length; ++inx) {
			String arg = args[inx];
			if (arg.charAt(0) != '-') {
				break;
			}
			if (arg.equals("-all")) {
				excludes = new String[0];
			} if (arg.equals("-help")) {
				usage();
				System.exit(0);
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
		System.arraycopy(args, inx, strings, 0, args.length);
		vm = launchTarget(strings);
	}

	/**
	 * Generate the trace. Enable events, start thread to display events, start
	 * threads to forward remote error and output streams, resume the remote VM,
	 * wait for the final event, and shutdown.
	 */
	void run() {
		String[] restrictedPackages = java.security.Security.getProperty("package.access").split(",");
		Set<String> allExcludes = new HashSet<>(restrictedPackages.length+excludes.length);
		allExcludes.addAll(Arrays.asList(restrictedPackages));
		allExcludes.addAll(Arrays.asList(excludes));
		EventThread eventThread = new EventThread(vm, allExcludes, classpath);
		eventThread.start();
		redirectOutput();
		vm.resume();

		// Shutdown begins when event thread terminates
		try {
			eventThread.join();
			errThread.join(); // Make sure output is forwarded
			outThread.join(); // before we exit
		} catch (InterruptedException exc) {
			// we don't interrupt
		}
	}

	/**
	 * Launch target VM. Forward target's output and error.
	 */
	VirtualMachine launchTarget(String[] args) {
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

	void redirectOutput() {
		Process process = vm.process();

		// Copy target's output and error to our output and error.
		errThread = new StreamRedirectThread("error reader", process.getErrorStream(), System.err);
		outThread = new StreamRedirectThread("output reader", process.getInputStream(), System.out);
		errThread.start();
		outThread.start();
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
	 */
	Map<String, Connector.Argument> connectorArguments(LaunchingConnector connector, String[] args) {
		Map<String, Connector.Argument> arguments = connector.defaultArguments();

		Connector.Argument mainArg = arguments.get("main");
		Connector.Argument optionsArg = arguments.get("options");
		if (mainArg == null || optionsArg == null) {
			throw new Error("Bad launching connector");
		}
		mainArg.setValue(args[0]);

		boolean copy = false;
		StringBuilder options = new StringBuilder();
		for (int i = 1; i < args.length; i++) {
			String arg = args[i];
			if (arg.equals("-cp")) {
				copy = true;
			} else {
				if (arg.startsWith("-")) {
					copy = false;
				} else {
					if (copy) {
						classpath.add(arg);
					}
				}
			}
			options.append(arg);
			options.append(' ');
		}
		optionsArg.setValue(options.toString());

		return arguments;
	}

	/**
	 * Print command line usage help
	 */
	void usage() {
		System.err.println("Usage: java Trace <options> <class> <args>");
		System.err.println("<options> are:");
		System.err.println("  -all                 Include system classes in output");
		System.err.println("  -help                Print this help message");
		System.err.println("<class> is the program to trace");
		System.err.println("<args> are the arguments to <class>");
	}
}
