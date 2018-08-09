package carisma.rt.instrument;

import java.util.Collections;
import java.util.Set;
import java.util.Stack;

public class RTStack {

	public static final Stack<RTAnnotation> stack = new Stack<>();
	
	public static final class RTAnnotation {

		private final String method;
		private final Set<String> secrecy;
		private final Set<String> integrity;
		
		public RTAnnotation(String method, Set<String> secrecy, Set<String> integrity) {
			this.method = method;
			this.secrecy = Collections.unmodifiableSet(secrecy);
			this.integrity = Collections.unmodifiableSet(integrity);
		}
		
		public String getMethod() {
			return method;
		}

		public Set<String> getSecrecy() {
			return secrecy;
		}

		public Set<String> getIntegrity() {
			return integrity;
		}
	}
}
