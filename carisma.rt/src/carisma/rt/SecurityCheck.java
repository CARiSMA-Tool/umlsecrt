package carisma.rt;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.Stack;

import com.sun.jdi.AbsentInformationException;
import com.sun.jdi.ClassNotLoadedException;
import com.sun.jdi.ClassObjectReference;
import com.sun.jdi.Field;
import com.sun.jdi.IncompatibleThreadStateException;
import com.sun.jdi.InvalidTypeException;
import com.sun.jdi.InvocationException;
import com.sun.jdi.Method;
import com.sun.jdi.ObjectReference;
import com.sun.jdi.ReferenceType;
import com.sun.jdi.StringReference;
import com.sun.jdi.ThreadReference;
import com.sun.jdi.TypeComponent;
import com.sun.jdi.Value;
import com.sun.jdi.VirtualMachine;
import com.sun.jdi.VoidType;
import com.sun.jdi.event.BreakpointEvent;
import com.sun.jdi.event.MethodEntryEvent;
import com.sun.jdi.event.MethodExitEvent;
import com.sun.jdi.event.WatchpointEvent;

class SecurityCheck {

	private final Stack<TypeComponent> stack;
	private final ClassloaderCache cache;
	private final EventThread events;

	private boolean record = false;
	private final String trace;
	private String intend = "";
	
	SecurityCheck(ClassloaderCache cache, EventThread events, String traceLocation) {
		this.stack = new Stack<TypeComponent>();
		this.cache = cache;
		this.events = events;
		this.trace = traceLocation;
	}

	void methodEntryEvent(MethodEntryEvent event) {
		

		Method method = event.method();
		if (record) {
			try (FileWriter writer = new FileWriter(trace, true)) {
				writer.append(intend);
				writer.append(SignatureHelper.getSignature(method));
				writer.append(System.lineSeparator());
				intend += "--";
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		stack.add(method);
		if (stack.size() < 2) {
			return;
		}
		ThreadReference thread = event.thread();
		if (!checkSecureDependencies(method, thread)) {
			try {
				if (method.returnType() instanceof VoidType) {
					System.err.println("Shutdown system!");
					System.exit(-1);
				}
			} catch (ClassNotLoadedException e) {
				throw new RuntimeException(e);
			}
			String earlyReturn;
			try {
				earlyReturn = cache.getEarlyReturn(method, thread);
				if (earlyReturn == null || earlyReturn.length() == 0) {
					System.err.println("Shutdown system!");
					System.exit(-1);
				} else {
					try {
						Value value = getCounterMeasureValue(method, thread, earlyReturn);
						events.disableEventRequests();
						thread.forceEarlyReturn(value);
						System.out.println("Forced early return of \"" + SignatureHelper.getSignature(method)
								+ "\" with the value \"" + value + "\".");
						events.enableEventRequests();
					} catch (InvalidTypeException | ClassNotLoadedException | IncompatibleThreadStateException e) {
						e.printStackTrace();
					}
				}
			} catch (Exception e1) {
				e1.printStackTrace();
			}

		}
	}

	void methodExitEvent(MethodExitEvent event) {
		
		stack.pop();
		if (record && intend.length() >= 2) {
			intend = intend.substring(2);
		}
	}

	void fieldEvent(WatchpointEvent event) {
		ThreadReference thread = event.thread();
		Field field = event.field();
		if (record) {
			try (FileWriter writer = new FileWriter(trace, true)) {
				writer.append(intend);
				writer.append(SignatureHelper.getSignature(field));
				writer.append(System.lineSeparator());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		stack.add(field);
		if (stack.size() < 2) {
			return;
		}
		if (!checkSecureDependencies(field, thread)) {
			String earlyReturn;
			try {
				earlyReturn = cache.getEarlyReturn(field, thread).trim();
				if (earlyReturn.length() == 0) {
					System.exit(-1);
				} else {
					try {
						Value value = getCounterMeasureValue(field, thread, earlyReturn);
						event.object().setValue(field, value);
					} catch (InvalidTypeException | ClassNotLoadedException | IncompatibleThreadStateException e) {
						e.printStackTrace();
					}
				}
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

		}
		stack.pop();
	}

	void breakpointEvent(BreakpointEvent breakpointEvent) {
		if (stack.isEmpty()) {
			return;
		}
		
		Method method = breakpointEvent.location().method();
		if (!"java.lang.reflect.Field".equals(method.declaringType().name())) {
			return;
		}
		if ("get".equals(method.name()) || "set".equals(method.name())) {
			try {
				ObjectReference field = breakpointEvent.thread().frame(0).thisObject();
				events.disableEventRequests();
				ClassObjectReference value = (ClassObjectReference) field.invokeMethod(breakpointEvent.thread(),
						method.declaringType().methodsByName("getDeclaringClass").get(0), Collections.emptyList(), 0);

				if (events.excluded(value.referenceType().name())) {
					return;
				}

				Annotations accessedField = cache.getAnnotations(value.reflectedType(), breakpointEvent.thread());
				Annotations callerAnnotations = cache.getAnnotations(stack.peek().declaringType(),
						breakpointEvent.thread());

				StringReference fieldName = (StringReference) field.invokeMethod(breakpointEvent.thread(),
						method.declaringType().methodsByName("getName").get(0), Collections.emptyList(), 0);
				String lhsSignature = SignatureHelper.getSignature(stack.peek());
				String rhsSignature = SignatureHelper
						.getSignature(value.reflectedType().fieldByName(fieldName.value()));
				checkSecureDependencies(lhsSignature, rhsSignature, callerAnnotations, accessedField);
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				events.enableEventRequests();
			}

		}
	}

	private void enableTraceRecord(TypeComponent caller, TypeComponent called) {
		record = true;
		try (FileWriter writer = new FileWriter(trace)) {
			int indexOf = stack.indexOf(caller);
			if (indexOf > 0) {
				writer.append(SignatureHelper.getSignature(stack.get(indexOf - 1)));
				writer.append(System.lineSeparator());
				writer.append("--");
			}
			writer.append(SignatureHelper.getSignature(caller));
			writer.append(System.lineSeparator());
			writer.append("--");
			writer.append(SignatureHelper.getSignature(called));
			writer.append(" <---- Violation of SecureDependencies");
			writer.append(System.lineSeparator());
			intend = "----";
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private boolean checkSecureDependencies(TypeComponent member, ThreadReference thread) {
		
		if (!thread.isSuspended()) {
			thread.suspend();
		}
		try {
			ReferenceType thisType = member.declaringType();

			TypeComponent caller = stack.get(stack.size() - 2);
			ReferenceType callerType = caller.declaringType();

			if (thisType.equals(callerType)) {
				return true;
			}

			Annotations annotations = cache.getAnnotations(thisType, thread);
			Annotations callerAnnotations = cache.getAnnotations(callerType, thread);

			String callerSignature = SignatureHelper.getSignature(caller);
			String calledSignature = SignatureHelper.getSignature(member);

			boolean results = checkSecureDependencies(callerSignature, calledSignature, callerAnnotations, annotations);
			if (!results) {
				enableTraceRecord(caller, member);
			}
			return results;
		} catch (IncompatibleThreadStateException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return true;
	}

	private boolean checkSecureDependencies(String lhsMemberSignature, String rhsMemberSignature,
			Annotations lhsAnnotations, Annotations rhsAnnotations) {
//		System.out.println(lhsMemberSignature + " --> " + rhsMemberSignature);
		

		boolean lhsRequiresRhsSecrecy = lhsAnnotations.hasSecrecy(rhsMemberSignature);
		boolean rhsRequiresRhsSecrecy = rhsAnnotations.hasSecrecy(rhsMemberSignature);

		if (lhsRequiresRhsSecrecy != rhsRequiresRhsSecrecy) {
			if (lhsRequiresRhsSecrecy) {
				System.err.println("Violation of Secrecy: \"" + lhsMemberSignature + "\" requires secrecy but \""
						+ rhsMemberSignature + "\" doesn't provides secrecy!");
			} else {
				System.err.println("Violation of Secrecy: \"" + rhsMemberSignature + "\" requires secrecy but \""
						+ lhsMemberSignature + "\" doesn't provides secrecy!");
			}
			return false;
		}

		boolean lhsRequiresRhsIntegrity = lhsAnnotations.hasIntegrity(rhsMemberSignature);
		boolean rhsRequiresRhsIntegrity = rhsAnnotations.hasIntegrity(rhsMemberSignature);

		if (lhsRequiresRhsIntegrity != rhsRequiresRhsIntegrity) {
			if (lhsRequiresRhsIntegrity) {
				System.err.println("Violation of Integrity: \"" + lhsMemberSignature + "\" requires integrity but \""
						+ rhsMemberSignature + "\" doesn't provides integrity!");
			} else {
				System.err.println("Violation of Integrity: \"" + rhsMemberSignature + "\" requires integrity but \""
						+ lhsMemberSignature + "\" doesn't provides integrity!");
			}
			return false;
		}
		return true;
	}

	private Value getCounterMeasureValue(TypeComponent member, ThreadReference thread, String earlyReturn)
			throws IncompatibleThreadStateException, InvalidTypeException, ClassNotLoadedException {
		Value value;
		if ("null".equals(earlyReturn.toLowerCase())) {
			value = null;
		} else {
			VirtualMachine virtualMachine = member.virtualMachine();
			if ("void".equals(earlyReturn.toLowerCase())) {
				value = virtualMachine.mirrorOfVoid();
			} else if ("true".equals(earlyReturn.toLowerCase())) {
				value = virtualMachine.mirrorOf(true);
			} else if ("false".equals(earlyReturn.toLowerCase())) {
				value = virtualMachine.mirrorOf(false);
			} else if ('"' == earlyReturn.charAt(0) && earlyReturn.charAt(earlyReturn.length() - 1) == '"') {
				value = virtualMachine.mirrorOf(earlyReturn.substring(1, earlyReturn.length() - 1));
			} else {
				try {
					int i = Integer.parseInt(earlyReturn);
					value = virtualMachine.mirrorOf(i);
				} catch (NumberFormatException e0) {
					try {
						double d = Double.parseDouble(earlyReturn);
						value = virtualMachine.mirrorOf(d);
					} catch (NumberFormatException e1) {
						Method toCall = null;
						for (Method m : member.declaringType().methodsByName(earlyReturn)) {
							try {
								if (m.arguments().size() == 0) {
									toCall = m;
									break;
								}
							} catch (AbsentInformationException e) {
								e.printStackTrace();
							}
						}
						if (toCall != null) {
							try {
								events.disableEventRequests();
								ObjectReference thisObject = thread.frame(0).thisObject();
								value = thisObject.invokeMethod(thread, toCall, Collections.emptyList(),
										ObjectReference.INVOKE_NONVIRTUAL);
								events.enableEventRequests();
								System.out.println("Got early return from method \"" + earlyReturn + "\": " + value);
							} catch (InvocationException e) {
								throw new RuntimeException(e);
							}
						} else {
							throw new RuntimeException();
						}
					}
				}
			}
		}
		return value;
	}

}