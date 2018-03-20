package carisma.rt;

import java.util.Collections;
import java.util.Stack;

import com.sun.jdi.AbsentInformationException;
import com.sun.jdi.ClassNotLoadedException;
import com.sun.jdi.IncompatibleThreadStateException;
import com.sun.jdi.InvalidTypeException;
import com.sun.jdi.InvocationException;
import com.sun.jdi.Method;
import com.sun.jdi.ObjectReference;
import com.sun.jdi.ReferenceType;
import com.sun.jdi.TypeComponent;
import com.sun.jdi.Value;
import com.sun.jdi.VirtualMachine;
import com.sun.jdi.VoidType;
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
		if (!checkSecureDependencies(method)) {
			try {
				if (method.returnType() instanceof VoidType) {
					System.exit(-1);
				}
			} catch (ClassNotLoadedException e) {
				throw new RuntimeException(e);
			}
			String earlyReturn;
			try {
				earlyReturn = cache.getAnnotations(method).getEarlyReturn().trim();
			} catch (Exception e) {
				throw new RuntimeException(e);
			}
			if (earlyReturn.length() == 0) {
				System.exit(-1);
			} else {
				try {
					Value value;
					if ("null".equals(earlyReturn.toLowerCase())) {
						value = null;
					} else {
						VirtualMachine virtualMachine = event.virtualMachine();
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
									for(Method m : method.declaringType().methodsByName(earlyReturn)) {
										try {
											if(m.arguments().size() == 0) {
												toCall = m;
												break;
											}
										} catch (AbsentInformationException e) {
											e.printStackTrace();
										}
									}
									if(toCall != null) {
										try {
											System.out.println("Get early return from method \""+earlyReturn+"\"");
											value = event.thread().frame(0).thisObject().invokeMethod(event.thread(), toCall, Collections.emptyList(),ObjectReference.INVOKE_SINGLE_THREADED);
											System.out.println("Done");
										} catch (InvocationException e) {
											throw new RuntimeException(e);
										}
									}
									else {
										throw new RuntimeException();
									}
								}
							}
						}
					}
					event.thread().forceEarlyReturn(value);
				} catch (InvalidTypeException | ClassNotLoadedException | IncompatibleThreadStateException e) {
					e.printStackTrace();
				}
			}
		}
	}

	void methodExitEvent(MethodExitEvent event) {
		stack.pop();
	}

	void fieldEvent(TypeComponent field) {
		System.out.println(SignatureHelper.getSignature(field));
		if (!checkSecureDependencies(field)) {
			System.exit(-1);
		}
	}

	private boolean checkSecureDependencies(TypeComponent member) {
		try {
			Annotations annotations = cache.getAnnotations(member);
			TypeComponent caller = stack.get(stack.size() - 2);
			Annotations callerAnnotations = cache.getAnnotations(caller);

			return checkSecureDependencies(callerAnnotations, annotations);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return true;
	}

	private boolean checkSecureDependencies(Annotations lhsAnnotations, Annotations rhsAnnotations) {
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
			return false;
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
			return false;
		}
		return true;
	}

}