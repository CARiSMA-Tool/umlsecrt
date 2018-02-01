package example;

import org.gravity.security.annotations.requirements.Secrecy;

public class B {
	@Secrecy
	private void m() {
		System.out.println("m()");
	}
}
