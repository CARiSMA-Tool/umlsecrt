package carisma.rt.eval.security;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class SecurityEvalUMLsecRT {

	private static final File baseLocation = new File(
			"/home/speldszus/Documents/svn/rgse/umlsecrt/implementation/examples");

	private static final String[] projects = new String[] { "CWE470-UnsafeReflection" };

	private static final Pattern pattern = Pattern
			.compile("public\\s+static\\s+void\\s+main\\s*\\(\\s*String\\s*\\[\\s*\\]\\s+\\d+\\)");

	public static void main(final String[] args) {
		for (final String project : projects) {
			final var projectFile = new File(baseLocation, project);
			if (projectFile.exists()) {
				final var src = new File(projectFile, "src").toPath();
				try (final var files = Files.walk(src)){
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
								"-Djava.security.policy==" + new File(projectFile, "umlsecrt.policy").toString(),
								"-cp", new File(projectFile, "bin").toString(),
								main };
						System.out.println("Command: "+Arrays.toString(command));
						final var process = Runtime.getRuntime()
								.exec(command);
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
