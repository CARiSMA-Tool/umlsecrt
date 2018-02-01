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
		
		boolean lhsRequiresRhsSecrecy = false; 
		for(String lhsSecrecy : lhsAnnotations.getSecrecy()) {
			if(SignatureHelper.equivalentSignatures(lhsSecrecy, rhsMemberSignature)) {
				lhsRequiresRhsSecrecy = true;
				break;
			}
		}
		boolean rhsRequiresRhsSecrecy = false;
		for(String rhsSecrecy : rhsAnnotations.getSecrecy()) {
			if(SignatureHelper.equivalentSignatures(rhsSecrecy, rhsMemberSignature)) {
				rhsRequiresRhsSecrecy = true;
				break;
			}
		}
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
	
		boolean lhsRequiresRhsIntegrity = false; 
		for(String lhsIntegrity : lhsAnnotations.getIntegrity()) {
			if(SignatureHelper.equivalentSignatures(lhsIntegrity, rhsMemberSignature)) {
				lhsRequiresRhsIntegrity = true;
				break;
			}
		}
		boolean rhsRequiresRhsIntegrity = false;
		for(String rhsIntegrity : rhsAnnotations.getIntegrity()) {
			if(SignatureHelper.equivalentSignatures(rhsIntegrity, rhsMemberSignature)) {
				rhsRequiresRhsIntegrity = true;
				break;
			}
		}
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