package cwe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.gravity.security.annotations.requirements.Integrity;

public class Finalizable {
	private BufferedReader reader;

	public Finalizable() {
		InputStream input = this.getClass().getClassLoader().getResourceAsStream("file.txt");
		this.reader = new BufferedReader(new InputStreamReader(input));
	}

	public String readFirstLine() throws IOException {
		String firstLine = reader.readLine();
		return firstLine;
	}

	@Override
	@Integrity
	public void finalize() throws Throwable {
		reader.close();
	}
}
