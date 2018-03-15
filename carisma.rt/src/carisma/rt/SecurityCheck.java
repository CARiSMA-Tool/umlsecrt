package carisma.rt;

import java.util.Stack;
import com.sun.jdi.Method;
import com.sun.jdi.TypeComponent;
import com.sun.jdi.event.MethodEntryEvent;
import com.sun.jdi.event.MethodExitEvent;

class SecurityCheck {

	private final Stack<TypeComponent> stack;
	private final ClassloaderCache cache;

	SecurityCheck(ClassloaderCache cache) {
		this.stack = new Stack<TypeComponent>();
		this.cache = cache;
	}

	void methodEntryEvent(MethodEntryEvent event) {
		Method method = event.method();
		stack.add(method);
		if (stack.size() < 2) {
			return;
		}
		checkSecureDependencies(method);
	}

	void methodExitEvent(MethodExitEvent event) {
		stack.pop();
	}

	void fieldEvent(TypeComponent field) {
		System.out.println(SignatureHelper.getSignature(field));
		checkSecureDependencies(field);
	}

	private void checkSecureDependencies(TypeComponent member) {
		try {
			Annotations annotations = cache.getAnnotations(member);
			TypeComponent caller = stack.get(stack.size() - 2);
			Annotations callerAnnotations = cache.getAnnotations(caller);
	
			checkSecureDependencies(callerAnnotations, annotations);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void checkSecureDependencies(Annotations lhsAnnotations, Annotations rhsAnnotations) {
		String rhsMemberSignature = rhsAnnotations.getMemberSignature();
		
		boolean lhsRequiresRhsSecrecy = lhsAnnotations.hasSecrecy(rhsMemberSignature);
		boolean rhsRequiresRhsSecrecy = rhsAnnotations.hasSecrecy(rhsMemberSignature);
		
		if (lhsRequiresRhsSecrecy != rhsRequiresRhsSecrecy) {
			String lhsMemberSignature = lhsAnnotations.getMemberSignature();
			if (lhsRequiresRhsSecrecy) {
				System.err.println("Violation of Secrecy: \"" + lhsMemberSignature + "\" requires secrecy but \""
						+ rhsMemberSignature + "\" doesn't provides secrecy!");
			} else {
				System.err.println("Violation of Secrecy: \"" + rhsMemberSignature + "\" requires secrecy but \""
						+ lhsMemberSignature + "\" doesn't provides secrecy!");
			}
			System.exit(-1);
		}
	
		boolean lhsRequiresRhsIntegrity = lhsAnnotations.hasIntegrity(rhsMemberSignature);
		boolean rhsRequiresRhsIntegrity = rhsAnnotations.hasIntegrity(rhsMemberSignature);
		
		if (lhsRequiresRhsIntegrity != rhsRequiresRhsIntegrity) {
			String lhsMemberSignature = lhsAnnotations.getMemberSignature();
			if (lhsRequiresRhsIntegrity) {
				System.err.println("Violation of Integrity: \"" + lhsMemberSignature + "\" requires integrity but \""
						+ rhsMemberSignature + "\" doesn't provides integrity!");
			} else {
				System.err.println("Violation of Integrity: \"" + rhsMemberSignature + "\" requires integrity but \""
						+ lhsMemberSignature + "\" doesn't provides integrity!");
			}
			System.exit(-1);
		}
	}

}