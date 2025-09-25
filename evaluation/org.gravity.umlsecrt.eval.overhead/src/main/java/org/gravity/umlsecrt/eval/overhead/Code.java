package org.gravity.umlsecrt.eval.overhead;

import java.util.List;

public class Code {

	private String main;
	private List<String> javaFiles;
	private List<String> methodIDs;

	public Code(String main, List<String> javaFiles, List<String> methodIDs) {
		this.main = main;
		this.javaFiles = javaFiles;
		this.methodIDs = methodIDs;
	}

	public List<String> getMethodIDs() {
		return methodIDs;
	}

	public List<String> getJavaFiles() {
		return javaFiles;
	}

}
