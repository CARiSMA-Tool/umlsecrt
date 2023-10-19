package org.gravity.umlsecrt.eval.overhead;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConvertToDataPerMethodExecution {

	public static void main(String[] args) throws IOException {
		Map<String, List<List<String>>> map = new HashMap<>();

		for (File classes : new File("out").listFiles()) {
			if (classes.isFile())
				continue;
			String name = classes.getName();
			int numberOfClasses = Integer.parseInt(name.substring(0, name.length() - "classes".length()));
			File csv = new File(classes, name + ".csv");
			if (!csv.exists())
				continue;
			try (BufferedReader reader = new BufferedReader(new FileReader(csv))) {
				String line = reader.readLine(); // Discard first line
				while ((line = reader.readLine()) != null) {
					String[] values = line.split(";");
					List<List<String>> entry = map.computeIfAbsent(values[0], (v) -> new LinkedList<>());
					List<String> measurements = new LinkedList<>();
					measurements.add(Integer.toString(numberOfClasses));
					for (int i = 1; i < values.length; i++) {
						measurements.add(values[i]);
					}
					entry.add(measurements);
				}
			}
		}
		map.entrySet().forEach(entry -> {
			String key = entry.getKey();
			try (FileOutputStream stream = new FileOutputStream(new File(new File("out"), key + "methodExecs.csv"))) {
				stream.write("classes;plain;UMLsecRT;SM;LarvaCT;LarvaLT\n".getBytes());
				entry.getValue().forEach(v -> {
					try {
						stream.write(v.stream().collect(Collectors.joining(";", "", "\n")).getBytes());
					} catch (IOException e) {
						e.printStackTrace();
					}
				});
			} catch (IOException e) {
				e.printStackTrace();
			}
		});
	}

	enum IDs {

		PLAIN(1), UMLSECRT(2), SM(3), LARVA_CT(4), LARVA_LT(5);

		int index;

		private IDs(int index) {
			this.index = index;
		}

	}
}
