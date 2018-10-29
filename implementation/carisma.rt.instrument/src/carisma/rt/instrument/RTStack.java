package carisma.rt.instrument;

import java.util.Collections;
import java.util.Hashtable;
import java.util.Set;
import java.util.Stack;
import java.util.stream.Collectors;

public class RTStack {

	private static final Hashtable<Object, Stack<RTAnnotation>> stacks = new Hashtable<>();

	public static final Stack<RTAnnotation> getStack(Object o) {
		Stack<RTAnnotation> stack;
		if (stacks.containsKey(o)) {
			stack = stacks.get(o);
		} else {
			stack = new Stack<>();
			stacks.put(o, stack);
		}
		return stack;
	}
	
	public static void print() {
		int i = 0;
		for(Stack<RTAnnotation> stack : stacks.values()) {
			System.out.println(stack.stream().map(RTAnnotation::getMethod).collect(Collectors.joining(", ", "[RTStack-"+(i++)+"] ", "")));
		}
	}

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
			return this.method + " secrecy=" + secrecy + " integrity=" + integrity;
		}
	}
}
