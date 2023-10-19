package org.gravity.umlsecrt.eval.overhead;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import compiler.Compiler;
import compiler.Global;

public class GenerateCode {

	private static final int[] SIZES = new int[] { 450 
			//10, 20, 30, 50, 100, 200, 300, 400, 500, 1000, 2000, 3000, 5000, 10000
			};

	public static void main(String[] args) throws IOException {
		Map<Integer, Long> weaving = new HashMap<>(SIZES.length);
		for (int classes : SIZES) {
			System.out.println("############################");
			System.out.println("### Generate " + classes + " classes ###");
			System.out.println("############################");
			int methodsPerClass = 10;

			File out = new File(new File("out"), Integer.toString(classes) + "classes");

			File plainOut = new File(out, "plain");
			GenerateCode generator = new GenerateCode();
			Code plainCode = generator.generate(plainOut, classes, methodsPerClass, false);
			System.out.println("Plain - done");

			File smOut = new File(out, "sm");
			Code smCode = generator.generate(smOut, classes, methodsPerClass, true);
			Files.write(new File(smOut, "java.policy").toPath(), ("grant codeBase \"file:${user.dir}/*\" {\n"
					+ "    permission java.lang.RuntimePermission \"dummy\";\n" + "};").getBytes());
			run(smOut, smCode.getJavaFiles().stream().collect(Collectors.joining(" ", "javac -cp . ", "")), false);
			System.out.println("Security manager - done");

			if (classes < 500) {
				larvaLoadTime(out, plainOut, plainCode);
			}

			if (classes < 500) {
				larvaCompileTime(out, plainOut, plainCode, weaving, classes);
			}

			// Compile reference files
			run(plainOut, plainCode.getJavaFiles().stream().collect(Collectors.joining(" ", "javac -cp . ", "")),
					false);
		}
		Files.write(Paths.get("weaving.csv"), weaving.entrySet().stream().map(e -> e.getKey() + ";" + e.getValue())
				.collect(Collectors.joining("\n")).getBytes());
	}

	private static void larvaCompileTime(File out, File plainOut, Code standard, Map<Integer, Long> weaving,
			int classes) throws IOException {
		Path larvaOutCompiletime = new File(out, "larva-ct").toPath();
		copyDirectory(plainOut.toPath(), larvaOutCompiletime);
		File larva = larvaPolicy(larvaOutCompiletime.toFile(), standard);
		Files.write(Paths.get(larvaOutCompiletime.toString(), "secrecy.json"), "{}".getBytes());
		Files.write(Paths.get(larvaOutCompiletime.toString(), "integrity.json"), "{}".getBytes());
		String[] command = new String[] { larva.getAbsolutePath(), "-o",
				larvaOutCompiletime.toAbsolutePath().toString() };
		System.out.println("Larva: " + Stream.of(command).collect(Collectors.joining(" ")));
		Global.sid = -1;
		Compiler.main(command);
		// call ajc -1.5 -cp aspectjrt.jar;%O% -sourceroots %O%
		long start = System.currentTimeMillis();
		run(larvaOutCompiletime.toFile(), "ajc -1.8 -cp " + new File("aspectjrt.jar").getAbsolutePath() + ':'
				+ new File("gson.jar").getAbsolutePath() + " -sourceroots .", true);
		long time = System.currentTimeMillis() - start;
		weaving.put(classes, time);
		System.out.println("weaving: " + time + "ms");
		System.out.println("Larva compile-time weaving - done");
		// call ajc -1.5 -cp aspectjrt.jar;%O% -outxmlfile %O%\META-INF\aop.xml
		// %O%\aspects\*.aj
		run(larvaOutCompiletime.toFile(),
				"ajc -1.8 -cp " + new File("aspectjrt.jar").getAbsolutePath() + ':'
						+ new File("gson.jar").getAbsolutePath() + ":. -outxmlfile META-INF/aop.xml aspects/*.aj",
				true);
	}

	private static void larvaLoadTime(File out, File plainOut, Code standard) throws IOException {
		Path larvaOutLoadtime = new File(out, "larva-lt").toPath();
		copyDirectory(plainOut.toPath(), larvaOutLoadtime);
		File larvaLT = larvaPolicy(larvaOutLoadtime.toFile(), standard);
		Files.write(Paths.get(larvaOutLoadtime.toString(), "secrecy.json"), "{}".getBytes());
		Files.write(Paths.get(larvaOutLoadtime.toString(), "integrity.json"), "{}".getBytes());
		// ajc -1.5 -cp aspectjrt.jar;%O% -sourceroots %O%
		run(larvaOutLoadtime.toFile(), "ajc -1.8 -cp " + new File("aspectjrt.jar").getAbsolutePath() + ':'
				+ new File("gson.jar").getAbsolutePath() + ":. -sourceroots .", true);
		// java -cp . compiler.Compiler %F% -o %O%
		String[] command = new String[] { larvaLT.getAbsolutePath(), "-o",
				larvaOutLoadtime.toAbsolutePath().toString() };
		System.out.println("Larva: " + Stream.of(command).collect(Collectors.joining(" ")));
		Global.sid = -1;
		Compiler.main(command);
		// call ajc -1.5 -cp aspectjrt.jar;%O% %O%/larva/*.java
		run(larvaOutLoadtime.toFile(), "ajc -1.8 -cp " + new File("aspectjrt.jar").getAbsolutePath() + ':'
				+ new File("gson.jar").getAbsolutePath() + ":. larva/*.java", true);
		// call ajc -1.5 -cp aspectjrt.jar;%O% -outxmlfile %O%\META-INF\aop.xml
		// %O%\aspects\*.aj
		run(larvaOutLoadtime.toFile(),
				"ajc -1.8 -cp " + new File("aspectjrt.jar").getAbsolutePath() + ':'
						+ new File("gson.jar").getAbsolutePath() + ":. -outxmlfile META-INF/aop.xml aspects/*.aj",
				true);
		System.out.println("Larva load-time weaving - done");
	}

	public static void copyDirectory(Path src, Path trg) throws IOException {
		try (Stream<Path> stream = Files.walk(src)) {
			stream.forEach(source -> {
				Path destination = Paths.get(trg.toString(), source.toString().substring(src.toString().length()));
				try {
					Files.copy(source, destination);
				} catch (IOException e) {
					e.printStackTrace();
				}
			});
		}
	}

	private static File larvaPolicy(File out, Code code) throws IOException {
		File policy = new File(out, "secdep.lrv");
		try (FileWriter writer = new FileWriter(policy)) {
			writer.append(LARVA_START);
			for (int i = 0; i < code.getMethodIDs().size(); i++) {
				writer.append("\tenterM" + i + "(String id) = {" + code.getMethodIDs().get(i) + "()} where id = \""
						+ code.getMethodIDs().get(i) + "\";\n");
				writer.append("\texitM" + i + "() = {" + code.getMethodIDs().get(i) + "()uponReturning(*)}\n");
			}
			writer.append("\tenterMethod() = {enterM0");
			for (int i = 1; i < code.getMethodIDs().size(); i++) {
				writer.append("|enterM" + i);
			}
			writer.append("}\n");
			writer.append("\texitMethod() = {exitM0");
			for (int i = 1; i < code.getMethodIDs().size(); i++) {
				writer.append("|exitM" + i);
			}
			writer.append("}\n");
			writer.append(LARVA_END);
		}
		return policy;
	}

	private static final String LARVA_START = "IMPORTS{\n" + "  import java.util.LinkedList;\n"
			+ "  import java.util.HashMap;\n" + "  import java.util.LinkedList;\n" + "  import java.util.Collections;\n"
			+ "  import java.util.Set;\n" + "  import java.util.Map;\n" + "  import java.util.Collection;\n" + "  \n"
			+ "  import java.nio.file.Files;\n" + "  import java.nio.file.Paths;\n" + "  \n"
			+ "  import com.google.gson.Gson;\n" + "}\n" + "GLOBAL{\n" + "  VARIABLES{\n"
			+ "    LinkedList<String> stack = new LinkedList<>();\n"
			+ "    Map<String,Collection<String>> secrecyMap =  readSecurityLevels(\"secrecy.json\");\n"
			+ "    Map<String,Collection<String>> integrityMap =  readSecurityLevels(\"integrity.json\");\n" + "  }\n"
			+ "  EVENTS{\n";

	private final static String LARVA_END = "  }\n" + "  PROPERTY secureDependency{\n" + "    STATES{\n"
			+ "      BAD{bad {System.err.println(\"Illegal Access\");System.exit(-1);}}\n" + "      STARTING{ok}\n"
			+ "    }\n" + "    TRANSITIONS {\n" + "      ok -> ok [exitMethod \\ \\ stack.pop();]\n"
			+ "      ok -> bad [enterMethod \\ !checkSecureDependency(stack.peek(),id) \\ ]\n"
			+ "      ok -> ok [enterMethod \\ \\ stack.push(id); ]\n" + "    }\n" + "  }\n" + "}\n" + "METHODS{\n"
			+ "  boolean checkSecureDependency(String caller, String callee){\n" + "    if(caller == null) {\n"
			+ "      return true;\n" + "    }\n" // +"System.out.println(\"larva\");\n"
			+ "    return checkSecrecy(caller,callee) && checkIntegrity(caller, callee);\n" + "  }\n" + "  \n"
			+ "  boolean checkSecrecy(String caller, String callee){\n"
			+ "    Collection<String> calleeSecrecy = secrecyMap.getOrDefault(callee, Collections.emptySet());\n"
			+ "    if(secrecyMap.getOrDefault(caller, Collections.emptySet()).contains(callee)) {\n"
			+ "      return calleeSecrecy.contains(callee);\n" + "    }\n"
			+ "    return !calleeSecrecy.contains(callee);\n" + "  }\n" + "  \n"
			+ "  boolean checkIntegrity(String caller, String callee){\n"
			+ "    Collection<String> calleeIntegrity = integrityMap.getOrDefault(callee, Collections.emptySet());\n"
			+ "    if(secrecyMap.getOrDefault(caller, Collections.emptySet()).contains(callee)) {\n"
			+ "      return calleeIntegrity.contains(callee);\n" + "    }\n"
			+ "    return !calleeIntegrity.contains(callee);\n" + "  }\n" + "  \n"
			+ "  Map<String, Collection<String>> readSecurityLevels(String path) {\n" + "    try {\n"
			+ "      return (Map<String, Collection<String>>) new Gson().fromJson(Files.newBufferedReader(Paths.get(path)), Map.class);\n"
			+ "    } catch (Exception e) {\n" + "      e.printStackTrace();\n" + "      System.exit(-1);\n" + "    }\n"
			+ "    return null;\n" + "  }\n" + "}\n";

	public static void run(File out, String command, boolean errors) throws IOException {
		System.out.println("> Run: " + command);
		Process process = Runtime.getRuntime().exec(command, new String[] {}, out);
		if (errors)
			try (BufferedReader reader = new BufferedReader(new InputStreamReader(process.getErrorStream()))) {
				String line;
				while ((line = reader.readLine()) != null) {
					System.err.println("> " + line);
				}
			}
		try (BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()))) {
			String line;
			while ((line = reader.readLine()) != null) {
				System.out.println("> " + line);
			}
		}
		try {
			process.waitFor();
		} catch (InterruptedException e) {
			e.printStackTrace();
			Thread.currentThread().interrupt();
		}
	}

	private Code generate(File dir, int classes, int methods, boolean sm) throws IOException {
		dir.mkdirs();

		List<String> javaFiles = new LinkedList<>();
		List<String> methodIDs = new LinkedList<>();

		String main = null;
		String lastMethod = null;

		for (int c = classes - 1; c >= 0; --c) {
//			System.out.println("c = " + c);
			String className = "Class" + c;
			String file = className + ".java";
			javaFiles.add(file);
			try (BufferedWriter stream = new BufferedWriter(new FileWriter(new File(dir, file)))) {
				stream.append("public class " + className + " {\n");
				for (int m = methods - 1; m >= 0; --m) {
//					System.out.println("m = " + m);
					String methodName = "method" + c + m;

					stream.append("\tpublic static void " + methodName + "() {\n");
					if (sm) {
						stream.append(
								"\t\tSystem.getSecurityManager().checkPermission(new RuntimePermission(\"dummy\"));");
					}

					String id = className + "." + methodName;
					methodIDs.add(id);

					stream.append("\t\tSystem.out.println(\"" + id + "\");\n");
					if (lastMethod == null) {
						stream.append("\t\tSystem.out.println(\"Done\");\n");
					} else if (lastMethod.startsWith(className)) {
						stream.append("\t\t" + lastMethod + "();\n");
					}
					stream.append("\t}\n");
					lastMethod = id;
				}
				if (c == 0) {
					main = className;
					stream.append("\tpublic static void main(String[] args) {\n");
					if(sm) {
						stream.append("\t\tSystem.setSecurityManager(new SecurityManager());\n");
					}
					stream.append("\t\tfor(int i = 0; i<Integer.parseInt(args[0]);i++){\n\t\t");
					for (int i = 0; i < classes; i++) {
						stream.append("\t\t\tClass"+i
								+ ".method"+i
								+ "0();\n");
					}
					stream.append("\t\t}\n" + "\t}\n");
				}
				stream.append("}");
			}
		}
		return new Code(main, javaFiles, methodIDs);
	}
}
