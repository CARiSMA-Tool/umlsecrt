package org.gravity.umlsecrt.eval.overhead;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Measure {

	private static final String PLAIN = "plain";
	private static final String MAIN = "Class0";
	private static final int[] RUNS = { 1, 2, 3, 5, 7, 10, 15, 20, 30, 50, 70, 100, 150, 300, 500, 700, 1000, 1300, 1500, 1700, 2000
		};
	
	private static final List<String> INCLUDE = Arrays.asList("300classes", "450classes", "500classes","1000classes","2000classes","3000classes","5000classes","10000classes");
	private static final List<String> EXCLUDE = Arrays.asList("10classes","20classes","30classes","50classes","100classes","200classes","400classes");
	
	public static void main(String[] args) throws IOException {
		File out = new File("out");
		for (File file : out.listFiles()) {
			if (file.isFile() || EXCLUDE.contains(file.getName()) || (!INCLUDE.isEmpty() && !INCLUDE.contains(file.getName()))) {
				continue;
			}
			System.out.println(file.getName());
			File csv = new File(file, file.getName() + ".csv");
			boolean append = csv.exists();
			try (FileOutputStream stream = new FileOutputStream(csv, append)) {
				if (!append) {
					stream.write("runs;plain;UMLsecRT;sm;larva-ct;larva-lt\n".getBytes());
				}
				for (int loops : RUNS) {
					System.out.println("Loops: " + loops);
					stream.write(Integer.toString(loops).getBytes());
					stream.write(';');
					stream.write(
							Long.toString(measure(new File(file, PLAIN), PLAIN, "java -cp . " + MAIN + ' ' + loops))
									.getBytes());

					stream.write(';');

					stream.write(Long
							.toString(measure(new File(file, PLAIN), "UMLsecRT", "java -cp . -javaagent:"
									+ new File("UMLsecRT.jar").getAbsolutePath() + ' ' + MAIN + ' ' + loops))
							.getBytes());

					stream.write(';');

					stream.write(Long
							.toString(measure(new File(file, "sm"), "Security Manager",
									"java -cp . -Djava.security.policy==java.policy " + MAIN + ' ' + loops))
							.getBytes());

					stream.write(';');

					File lt = new File(file, "larva-lt");
					if (lt.exists())
						stream.write(Long
								.toString(measure(lt, "Larva LT", "aj5 -cp .:" + new File("gson.jar").getAbsolutePath()
										+ ':' + new File("aspectjrt.jar").getAbsolutePath() + " " + MAIN + ' ' + loops))
								.getBytes());

					stream.write(';');

					File ct = new File(file, "larva-ct");
					if (ct.exists())
						stream.write(Long
								.toString(measure(ct, "Larva CT", "aj5 -cp .:" + new File("gson.jar").getAbsolutePath()
										+ ':' + new File("aspectjrt.jar").getAbsolutePath() + " " + MAIN + ' ' + loops))
								.getBytes());

					stream.write('\n');

				}
			}
		}
	}

	private static long measure(File out, String name, String command) throws IOException {
		System.gc();
		long startUMLsecRT = System.currentTimeMillis();
		Process process = Runtime.getRuntime().exec(command, new String[] {}, out);
		new Thread(() -> {
			int b;
			try {
				while ((b = process.getErrorStream().read()) > -1)
					;
			} catch (IOException e) {
				e.printStackTrace();
			}
		}).start();
		new Thread(() -> {
			int b;
			try {
				while ((b = process.getInputStream().read()) > -1)
					;
			} catch (IOException e) {
				e.printStackTrace();
			}
		}).start();
		try {
			process.waitFor();
		} catch (InterruptedException e) {
			e.printStackTrace();
			Thread.currentThread().interrupt();
		}
		long time = System.currentTimeMillis() - startUMLsecRT;
		System.out.println(name + ": " + time + "ms");
		return time;
	}
}
