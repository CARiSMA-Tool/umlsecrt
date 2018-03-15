package example;

import org.gravity.security.annotations.requirements.Integrity;

public class Evil {

	@Integrity
	public void invokeEvil() {
		System.err.println("I did something evil!");
	}
}
