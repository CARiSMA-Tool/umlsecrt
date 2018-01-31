package carisma.rt;

import java.util.Stack;
import com.sun.jdi.Field;
import com.sun.jdi.Method;
import com.sun.jdi.TypeComponent;
import com.sun.jdi.event.MethodEntryEvent;
import com.sun.jdi.event.MethodExitEvent;
import com.sun.jdi.event.ModificationWatchpointEvent;

class SecurityCheck {

	private final Stack<TypeComponent> stack;
	private final Cache cache;

	SecurityCheck(Cache cache) {
		this.stack = new Stack<TypeComponent>();
		this.cache = cache;
	}

	void methodEntryEvent(MethodEntryEvent event) {
		Method method = event.method();
		stack.add(method);
		if (stack.size() < 2) {
			return;
		}
		try {
			Annotations annotations = cache.getAnnotations(method);
			TypeComponent caller = stack.get(stack.size() - 2);
			Annotations callerAnnotations = cache.getAnnotations(caller);

			check(callerAnnotations, annotations);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void check(Annotations lhsAnnotations, Annotations rhsAnnotations) {
		String rhsMemberSignature = rhsAnnotations.getMemberSignature();
		
		boolean lhsRequiresRhsSecrecy = false; 
		for(String lhsSecrecy : lhsAnnotations.getSecrecy()) {
			if(Signatures.equivalentSignatures(lhsSecrecy, rhsMemberSignature)) {
				lhsRequiresRhsSecrecy = true;
				break;
			}
		}
		boolean rhsRequiresRhsSecrecy = false;
		for(String rhsSecrecy : rhsAnnotations.getSecrecy()) {
			if(Signatures.equivalentSignatures(rhsSecrecy, rhsMemberSignature)) {
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
			if(Signatures.equivalentSignatures(lhsIntegrity, rhsMemberSignature)) {
				lhsRequiresRhsIntegrity = true;
				break;
			}
		}
		boolean rhsRequiresRhsIntegrity = false;
		for(String rhsIntegrity : rhsAnnotations.getIntegrity()) {
			if(Signatures.equivalentSignatures(rhsIntegrity, rhsMemberSignature)) {
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

	void methodExitEvent(MethodExitEvent event) {
		stack.pop();
	}

	void fieldModificationEvent(ModificationWatchpointEvent event) {
		Field field = event.field();
		try {
			Annotations annotations = cache.getAnnotations(field);
			TypeComponent caller = stack.get(stack.size() - 2);
			Annotations callerAnnotations = cache.getAnnotations(caller);

			check(callerAnnotations, annotations);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// void exceptionEvent(ExceptionEvent event) {
	//
	// // Step to the catch
	// EventRequestManager mgr = this.eventThread.vm.eventRequestManager();
	// StepRequest req = mgr.createStepRequest(thread, StepRequest.STEP_MIN,
	// StepRequest.STEP_INTO);
	// req.addCountFilter(1); // next step only
	// req.setSuspendPolicy(EventRequest.SUSPEND_ALL);
	// req.enable();
	// }
	//
	// // Step to exception catch
	// void stepEvent(StepEvent event) {
	// EventRequestManager mgr = this.eventThread.vm.eventRequestManager();
	// mgr.deleteEventRequest(event.request());
	// }
	//
	// void threadDeathEvent(ThreadDeathEvent event) {
	//
	// }
}