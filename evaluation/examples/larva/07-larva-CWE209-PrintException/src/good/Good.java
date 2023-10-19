package good;

import secure.SecureException;

public class Good {
	
	public static void main(String[] args) {
		run();
	}

	private static void run() {
		try {
			new Good().doSomething();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	public void doSomething() {
		throw new SecureException("Secret");
	}
}
