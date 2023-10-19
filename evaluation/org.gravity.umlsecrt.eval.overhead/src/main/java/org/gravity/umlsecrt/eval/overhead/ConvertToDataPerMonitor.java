package org.gravity.umlsecrt.eval.overhead;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.stream.Stream;

public class ConvertToDataPerMonitor {

	public static void main(String[] args) throws IOException {

		FileOutputStream[] csvStreams = { new FileOutputStream("out/plain.csv"), new FileOutputStream("out/umlsecrt.csv"),
				new FileOutputStream("out/securitymanager.csv"), new FileOutputStream("out/larvaLT.csv"),
				new FileOutputStream("out/larvaCT.csv") };
		FileOutputStream[] datStreams = { new FileOutputStream("out/plain.dat"), new FileOutputStream("out/umlsecrt.dat"),
				new FileOutputStream("out/securitymanager.dat"), new FileOutputStream("out/larvaLT.dat"),
				new FileOutputStream("out/larvaCT.dat") };

		try {
			Stream.of(csvStreams).forEach(s -> {
				try {
					s.write("size;runs;time\n".getBytes());
				} catch (IOException e) {
					e.printStackTrace();
				}
			});

			for (File classes : new File("out").listFiles()) {
				if (classes.isFile())
					continue;
				String name = classes.getName();
				int size = Integer.parseInt(name.substring(0, name.length() - "classes".length()));
				try (BufferedReader reader = new BufferedReader(new FileReader(new File(classes, name + ".csv")))) {
					String line = reader.readLine(); // Discard first line
					while ((line = reader.readLine()) != null) {
						String[] values = line.split(";");
						writeCSV(csvStreams, values, IDs.PLAIN, size);
						writeCSV(csvStreams, values, IDs.UMLSECRT, size);
						writeCSV(csvStreams, values, IDs.SM, size);
						writeCSV(csvStreams, values, IDs.LARVA_LT, size);
						writeCSV(csvStreams, values, IDs.LARVA_CT, size);

						writeDAT(datStreams, values, IDs.PLAIN, size);
						writeDAT(datStreams, values, IDs.UMLSECRT, size);
						writeDAT(datStreams, values, IDs.SM, size);
						writeDAT(datStreams, values, IDs.LARVA_LT, size);
						writeDAT(datStreams, values, IDs.LARVA_CT, size);
					}
				}
			}
		} finally {
			Stream.of(csvStreams).forEach(t -> {
				try {
					t.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			});
		}
	}

	private static void writeCSV(FileOutputStream[] streams, String[] values, IDs id, int size) throws IOException {
		if(values.length > id.index) {
			streams[id.index - 1].write((size + ";" + values[0] + ";" + values[id.index] + '\n').getBytes());
		}
	}
	
	private static void writeDAT(FileOutputStream[] streams, String[] values, IDs id, int size) throws IOException {
		if(values.length > id.index) {
			streams[id.index - 1]
				.write((size + " " + values[0] + " " + values[id.index] + '\n').getBytes());
		}
	}

	enum IDs {

		PLAIN(1), UMLSECRT(2), SM(3), LARVA_CT(4), LARVA_LT(5);

		int index;

		private IDs(int index) {
			this.index = index;
		}

	}
}
