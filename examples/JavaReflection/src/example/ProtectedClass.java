package example;

import org.gravity.security.annotations.requirements.Critical;
import org.gravity.security.annotations.requirements.Secrecy;

@Critical
public class ProtectedClass {
	@Secrecy
	private void m() {
		System.out.println("m()");
	}

}
