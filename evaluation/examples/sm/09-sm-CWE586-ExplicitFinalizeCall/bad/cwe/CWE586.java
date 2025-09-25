package cwe;

public class CWE586 {
	public static void main(String[] args) throws Throwable {
		Finalizable finalizeable = new Finalizable();
		method(finalizeable);
		System.out.println(finalizeable.readFirstLine());
		
	}

	private static void method(Finalizable finalizeable) throws Throwable {
		// Do something with the finalizable object
		finalizeable.finalize();
	}
}
