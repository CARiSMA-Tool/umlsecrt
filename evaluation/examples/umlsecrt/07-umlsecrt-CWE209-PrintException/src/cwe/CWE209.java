package cwe;

import secure.SecureException;

public class CWE209 {
	
	public static void main(String[] args) {
		try {
			new CWE209().doSomething();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	public void doSomething() {
		throw new SecureException("Secret");
	}
}
