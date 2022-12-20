package carisma.rt.eval.security;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class SecurityEvalSecurityManager {

	private static final File baseLocation = new File(
			new File(SecurityEvalSecurityManager.class.getProtectionDomain().getCodeSource().getLocation().getFile())
			.getParentFile().getParentFile().getParentFile(),
			"examples");

	private static final String[] projects = new String[] {
			"CallerIsMissingAnnotations",
			//			"Classloader",
			//			"CounterMeasureExample",
			//			"CWE20-CodeInjection",
			//			"CWE209-PrintException",
			//			"CWE226-LeaveInformationInField-JavaReflection",
			//			"CWE328-ReversibleOneWayHash",
			//			"CWE470-UnsafeReflection",
			//			"CWE481-AssigningInsteadOfComparing",
			//			"CWE486-ComparisonOfClassesByName",
			//			"CWE491-ObjectHijack",
			//			"CWE498-CloneableClassWithSensitiveInformation",
			//			"CWE499-Serialization",
			//			"CWE502-Deserialization-Jackson",
			//			"CWE502-DeserializationOfUntrustedData",
			//			"CWE586-ExplicitFinalizeCall",
			"LibNotProvidingSecurity",
			"PaperExample"
	};

	private static final Pattern pattern = Pattern
			.compile("public\\s+static\\s+void\\s+main\\s*\\(\\s*String\\s*\\[\\s*\\]\\s+\\w+\\s*\\)");

	public static void main(final String[] args) {
		for (final String project : projects) {
			final var projectFile = new File(baseLocation, project);
			if (projectFile.exists()) {
				final var src = new File(projectFile, "src").toPath();
				try (final var files = Files.walk(src)) {
					final List<String> mainClasses = files
							.filter(path -> path.getFileName().toString().endsWith(".java")).filter(path -> {
								try {
									return pattern.matcher(Files.readString(path)).find();
								} catch (final IOException e) {
									e.printStackTrace();
									return false;
								}
							}).map(path -> {
								final var name = src.relativize(path).toString();
								return name.substring(0, name.length() - ".java".length());
							}).collect(Collectors.toList());
					for (final String main : mainClasses) {
						System.out.println("Execute: " + main);
						final var command = new String[] { "java", "-Djava.security.manager",
								"-Djava.security.policy==" + new File(projectFile, "sm.policy").toString(), "-cp",
								new File(projectFile, "bin").toString(), main };
						System.out.println("Command: " + Arrays.toString(command));
						final var process = Runtime.getRuntime().exec(command, new String[0], projectFile);
						try (var error = new BufferedInputStream(process.getErrorStream())) {
							System.err.write(error.readAllBytes());
						}
						try (var out = new BufferedInputStream(process.getInputStream())) {
							System.out.write(out.readAllBytes());
						}
					}
					System.out.println();
				} catch (final IOException e) {
					e.printStackTrace();
					continue;
				}
			}
		}
	}
}
