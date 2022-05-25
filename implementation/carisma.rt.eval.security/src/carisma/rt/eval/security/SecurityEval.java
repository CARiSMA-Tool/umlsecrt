package carisma.rt.eval.security;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class SecurityEval {

	private static final File baseLocation = new File(
			"/home/speldszus/Documents/svn/rgse/umlsecrt/implementation/examples");

	private static final String[] projects = new String[] { "CWE470-UnsafeReflection" };

	private static final Pattern pattern = Pattern
			.compile("public\\s+static\\s+void\\s+main\\s*\\(\\s*String\\s*\\[\\s*\\]\\s+(\\w|\\d)+\\)");

	public static void main(String[] args) {
		for (String project : projects) {
			File projectFile = new File(baseLocation, project);
			if (projectFile.exists()) {

				try {
					Path src = new File(projectFile, "src").toPath();
					List<String> mainClasses = Files.walk(src)
							.filter(path -> path.getFileName().toString().endsWith(".java")).filter(path -> {
								try {
									return pattern.matcher(Files.readString(path)).find();
								} catch (IOException e) {
									e.printStackTrace();
									return false;
								}
							}).map(path -> {
								String name = src.relativize(path).toString();
								return name.substring(0, name.length() - ".java".length());
							}).collect(Collectors.toList());
					for (String main : mainClasses) {
						System.out.println("Execute: " + main);
						String[] command = new String[] { "java", "-Djava.security.manager",
								"-Djava.security.policy==" + new File(projectFile, "sm.policy").toString(),
								"-cp", new File(projectFile, "bin").toString(),
								main };
						System.out.println("Command: "+Arrays.toString(command));
						Process process = Runtime.getRuntime()
								.exec(command);
						try (BufferedInputStream error = new BufferedInputStream(process.getErrorStream())) {
							System.err.write(error.readAllBytes());
						}
						try (BufferedInputStream out = new BufferedInputStream(process.getInputStream())) {
							System.out.write(out.readAllBytes());
						}
					}
					System.out.println();
				} catch (IOException e) {
					e.printStackTrace();
					continue;
				}
			}
		}
	}
}
