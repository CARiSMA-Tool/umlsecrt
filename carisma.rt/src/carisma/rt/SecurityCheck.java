package carisma.rt;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
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

	SecurityCheck(List<String> classpath) {
		this.stack = new Stack<TypeComponent>();
		URL[] urls = new URL[classpath.size()];
		for (int i = 0; i < classpath.size(); i++) {
			try {
				urls[i] = new File(classpath.get(i)).toURI().toURL();
			} catch (MalformedURLException e) {
				e.printStackTrace();
			}
		}
		this.cache = new Cache(urls);
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
		boolean lhsRequiresRhsSecrecy = false;
		String rhsSignature = rhsAnnotations.getMemberSignature();
		for (String value : lhsAnnotations.getSecrecy()) {
			if (Signatures.equalSignatures(rhsSignature, value)) {
				lhsRequiresRhsSecrecy = true;
				break;
			}
		}
		if (lhsRequiresRhsSecrecy != rhsAnnotations.hasSecrecy()) {
			String req;
			String prov;
			if (lhsRequiresRhsSecrecy) {
				req = lhsAnnotations.getMemberSignature();
				prov = rhsAnnotations.getMemberSignature();
			} else {
				prov = lhsAnnotations.getMemberSignature();
				req = rhsAnnotations.getMemberSignature();
			}System.err.println("Violation of Secrecy: \"" + req + "\" requires secrecy but \"" + prov
					+ "\" doesn't provides secrecy!");
			System.exit(-1);
		}

		boolean lhsRequiresRhsIntegrity = false;
		for (String value : lhsAnnotations.getIntegrity()) {
			if (Signatures.equalSignatures(rhsSignature, value)) {
				lhsRequiresRhsIntegrity = true;
				break;
			}
		}
		if (lhsRequiresRhsIntegrity != rhsAnnotations.hasIntegrity()) {
			String req;
			String prov;
			if (lhsRequiresRhsIntegrity) {
				req = lhsAnnotations.getMemberSignature();
				prov = rhsAnnotations.getMemberSignature();
			} else {
				prov = lhsAnnotations.getMemberSignature();
				req = rhsAnnotations.getMemberSignature();
			}
			System.err.println("Violation of Integrity: \"" + req + "\" requires secrecy but \"" + prov
					+ "\" doesn't provides secrecy!");
			System.exit(-1);
		}
	}

	void methodExitEvent(MethodExitEvent event) {
		stack.pop();
	}

	void fieldWatchEvent(ModificationWatchpointEvent event) {
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

//	void exceptionEvent(ExceptionEvent event) {
//
//		// Step to the catch
//		EventRequestManager mgr = this.eventThread.vm.eventRequestManager();
//		StepRequest req = mgr.createStepRequest(thread, StepRequest.STEP_MIN, StepRequest.STEP_INTO);
//		req.addCountFilter(1); // next step only
//		req.setSuspendPolicy(EventRequest.SUSPEND_ALL);
//		req.enable();
//	}
//
//	// Step to exception catch
//	void stepEvent(StepEvent event) {
//		EventRequestManager mgr = this.eventThread.vm.eventRequestManager();
//		mgr.deleteEventRequest(event.request());
//	}
//
//	void threadDeathEvent(ThreadDeathEvent event) {
//
//	}
}