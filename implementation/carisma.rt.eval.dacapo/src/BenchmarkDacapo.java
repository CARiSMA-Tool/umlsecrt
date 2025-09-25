import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import carisma.rt.eval.Configuration;

public class BenchmarkDacapo {

	public static final String[] BENCHMARKS = new String[] { "avrora", // 0
			"batik", // 1
			"eclipse", // 2
			"fop", // 3
			"h2", // 4
//			"jython", // 5
			"luindex", // 6
//			"lusearch", 	// 7 << use luindex-fix
			"lusearch-fix", // 8
			"pmd", // 9
			"sunflow", // 10
//			"tomcat", 		// 11 << broken
//			"tradebeans", // 12
//			"tradesoap", // 13
			"xalan" // 14
	};

	private static final int RUNS = 30;

	private static final boolean PLAIN = true;
	private static final String PLAIN_VALUES = "results/2020-05-23/21-49/all-2020-05-23-21-49.csv";

	public static void main(String[] args) {
		System.gc();
		new BenchmarkDacapo().runAll();
	}

	private String date;
	private File runLocation;

	private File outputLocation;

	public BenchmarkDacapo() {
		Date dateObject = new Date();
		date = new SimpleDateFormat("yyyy-MM-dd-HH-mm").format(dateObject);
		outputLocation = new File(new File(new File("results"), new SimpleDateFormat("yyyy-MM-dd").format(dateObject)), new SimpleDateFormat("HH-mm").format(dateObject));
		outputLocation.mkdirs();
		runLocation = new File(".");
	}

	/**
	 * 
	 */
	private void runAll() {
		System.out.println("Run in: " + runLocation.getAbsolutePath() + " with " + RUNS + " runs");
		long start = System.currentTimeMillis();

		Map<String, Double> plainResults = new HashMap<>(BENCHMARKS.length);
		if(!PLAIN && PLAIN_VALUES != null && !PLAIN_VALUES.isEmpty()) {
			readPlainResults(plainResults);
		}
		
		Map<String, Double> agentResults = new HashMap<>(BENCHMARKS.length);
		List<Double> slowdowns = new ArrayList<>(BENCHMARKS.length);
		int i = 1;
		for (String benchmark : BENCHMARKS) {
			System.out.println("Run benchmark \"" + benchmark + "\" (" + (i++) + "/" + BENCHMARKS.length + ")");
			try {
				double plainValue;
				if (PLAIN) {
					plainValue = runBenchmark(benchmark, false).parallelStream().mapToDouble(Integer::parseInt)
							.average().orElse(-1);
					plainResults.put(benchmark, plainValue);
				}
				else {
					if(!plainResults.isEmpty()) {
						plainValue = plainResults.get(benchmark);
						System.out.println("Previously recorded plain duration for \""+benchmark+"\": "+plainValue+"ms");
					}
					else {
						plainValue = -1;
					}
				}
				double agent = runBenchmark(benchmark, true).parallelStream().mapToDouble(Integer::parseInt).average()
						.orElse(-1);
				agentResults.put(benchmark, agent);
				if(plainValue > 0) {
					double slowdown = agent/plainValue;
					slowdowns.add(slowdown);
					System.out.println("Slowdown for \""+benchmark+"\": "+slowdown);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		writeStatistic(plainResults, agentResults);
		System.out.println("DONE in "+ (System.currentTimeMillis() - start) / 1000 / 60 + " minutes");
		if(!slowdowns.isEmpty()) {
			System.out.println("Average slowdown: "+slowdowns.stream().mapToDouble(Double::doubleValue).average().orElse(0));
		}
	}

	/**
	 * @param plainResults
	 */
	private void readPlainResults(Map<String, Double> plainResults) {
		try {
			List<String> lines = Files.readAllLines(Paths.get(PLAIN_VALUES));
			List<String> keys = Arrays.asList(lines.get(0).split(","));
			for(int j = 1; j < lines.size(); j++) {
				String[] nextLine = lines.get(j).split(",");
				if(nextLine[0].equalsIgnoreCase(Boolean.toString(false))) {
					for(String benchmark : BENCHMARKS) {
						int index = keys.indexOf(benchmark);
						if(index < 0) {
							plainResults.clear();
							return;
						}
						else {
							plainResults.put(benchmark, Double.valueOf(nextLine[index]));
						}
					}
					return;
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * @param plainResults
	 * @param agentResults
	 */
	private void writeStatistic(Map<String, Double> plainResults, Map<String, Double> agentResults) {
		try (BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(Files.newOutputStream(
				new File(outputLocation, "all-" + date + ".csv").toPath(), StandardOpenOption.CREATE_NEW)))) {
			writer.write("agent," + String.join(",", BENCHMARKS));
			writer.newLine();

			
			if (!plainResults.isEmpty()) {
				writeLine(false, plainResults, writer);
			}
			writeLine(true, agentResults, writer);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * @param plain
	 * @param results
	 * @param writer
	 * @throws IOException
	 */
	private void writeLine(boolean plain, Map<String, Double> results, BufferedWriter writer) throws IOException {
		writer.write(Boolean.toString(plain));
		for (String benchmark : BENCHMARKS) {
			writer.write(',');
			writer.write(Integer.toString(results.get(benchmark).intValue()));
		}
		writer.newLine();
	}

	/**
	 * @param benchmark
	 * @param agent
	 * @return
	 * @throws IOException
	 */
	private List<String> runBenchmark(String benchmark, boolean agent) throws IOException {
		List<String> times = new ArrayList<>(RUNS);
		for (int i = 0; i < RUNS; i++) {
			System.out.println("Run " + (i + 1) + "/" + RUNS + (agent ? " with agent" : " plain"));
			List<String> cmd = Arrays.asList("-jar", "dacapo-9.12-MR1-bach.jar", benchmark);
			File location = runLocation;

			Process process = Configuration.runJava(location, cmd, agent);

			try (BufferedReader errors = new BufferedReader(new InputStreamReader(process.getErrorStream()))) {
				Integer duration = getDuration(benchmark, errors);
				if (duration != null) {
					times.add(duration.toString());
				}
			}

		}
		Path path = new File(outputLocation, benchmark + '-' + date + ".csv").toPath();
		String prefix = agent ? "agent," : "plain,";
		if (path.toFile().exists()) {
			prefix = '\n' + prefix;
		}
		Files.write(path, (prefix + String.join(",", times)).getBytes(), StandardOpenOption.APPEND,
				StandardOpenOption.CREATE);
		return times;
	}

	/**
	 * @param benchmark
	 * @param errors
	 * @return
	 * @throws IOException
	 */
	private static Integer getDuration(String benchmark, BufferedReader errors) throws IOException {
		Integer duration = null;
		String line;
		while ((line = errors.readLine()) != null) {
			String prefix = "===== DaCapo 9.12-MR1 " + benchmark;
			if (line.startsWith(prefix) && !line.endsWith("starting =====")) {
				String[] values = line.substring(prefix.length() + 1, line.length() - " msec =====".length())
						.split(" in ");
				if (!"PASSED".equals(values[0])) {
					throw new RuntimeException("Benchmark failed");
				}
				duration = Integer.decode(values[1]);

			}
			System.out.println(line);
		}
		return duration;
	}
}
