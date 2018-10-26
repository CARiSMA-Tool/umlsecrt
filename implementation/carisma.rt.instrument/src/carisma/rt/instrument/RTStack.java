package carisma.rt.instrument;

import java.util.Collections;
import java.util.Hashtable;
import java.util.Set;
import java.util.Stack;

public class RTStack {
	
	private static final Hashtable<Object, Stack<RTAnnotation>> stacks = new Hashtable<>();
	
	public static final Stack<RTAnnotation> getStack(Object o) {
		if(stacks.containsKey(o)) {
			return stacks.get(o);
		}
		Stack<RTAnnotation> s = new Stack<>();
		stacks.put(o, s);
		return s;
	}
	
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
		
		@Override
		public String toString() {
			return this.method+" secrecy="+secrecy+" integrity="+integrity;
		}
	}
}
