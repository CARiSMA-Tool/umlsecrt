package carisma.rt;

import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.sun.jdi.ClassType;
import com.sun.jdi.Field;
import com.sun.jdi.Method;
import com.sun.jdi.ThreadReference;
import com.sun.jdi.VirtualMachine;
import com.sun.jdi.event.BreakpointEvent;
import com.sun.jdi.event.ClassPrepareEvent;
import com.sun.jdi.event.Event;
import com.sun.jdi.event.EventIterator;
import com.sun.jdi.event.EventQueue;
import com.sun.jdi.event.EventSet;
import com.sun.jdi.event.MethodEntryEvent;
import com.sun.jdi.event.MethodExitEvent;
import com.sun.jdi.event.VMDeathEvent;
import com.sun.jdi.event.WatchpointEvent;
import com.sun.jdi.request.AccessWatchpointRequest;
import com.sun.jdi.request.BreakpointRequest;
import com.sun.jdi.request.ClassPrepareRequest;
import com.sun.jdi.request.EventRequest;
import com.sun.jdi.request.EventRequestManager;
import com.sun.jdi.request.MethodEntryRequest;
import com.sun.jdi.request.MethodExitRequest;
import com.sun.jdi.request.ModificationWatchpointRequest;
import com.sun.jdi.request.VMDeathRequest;

class EventThread extends Thread {

	private final VirtualMachine vm;
	private final Set<String> excludes;

	private Map<ThreadReference, SecurityCheck> traceMap = new HashMap<>();
	private Set<EventRequest> eventRequests = new HashSet<>();
	private final ClassloaderCache cache;
	private boolean terminate = false;

	EventThread(VirtualMachine vm, Set<String> excludes, Set<URL> classpath) {
		super("event-handler");
		this.vm = vm;
		this.excludes = excludes;
		this.cache = new ClassloaderCache(classpath, this.getClass().getClassLoader(), this);

		createEventRequests();
	}

	@Override
	public void run() {
		System.out.println("Monitoring started");
		EventQueue queue = vm.eventQueue();
		while (true) {
			if(terminate) {
				return;
			}
			try {
				EventSet eventSet = queue.remove(100000);
				if(eventSet == null) {
					System.out.println("System terminated at timeout");
					System.exit(0);
				}
				EventIterator it = eventSet.eventIterator();
				
				while (it.hasNext()) {
					handleEvent(it.nextEvent());
				}
				// eventSet.resume();
				vm.resume();
			} catch (InterruptedException e) {
				break;
			}
		}
	}

	private void createEventRequests() {
		EventRequestManager manager = vm.eventRequestManager();

		MethodEntryRequest methodEntry = manager.createMethodEntryRequest();
		MethodExitRequest methodExit = manager.createMethodExitRequest();
		ClassPrepareRequest classPrepare = manager.createClassPrepareRequest();
		VMDeathRequest	vmDead = manager.createVMDeathRequest();

		for (String exclude : excludes) {
			classPrepare.addClassExclusionFilter(exclude);
			methodEntry.addClassExclusionFilter(exclude);
			methodExit.addClassExclusionFilter(exclude);
		}

		methodEntry.setSuspendPolicy(EventRequest.SUSPEND_ALL);
		methodExit.setSuspendPolicy(EventRequest.SUSPEND_ALL);
		classPrepare.setSuspendPolicy(EventRequest.SUSPEND_ALL);

		eventRequests.add(methodEntry);
		eventRequests.add(methodExit);
		eventRequests.add(classPrepare);
		eventRequests.add(vmDead);

		methodExit.enable();
		methodEntry.enable();
		classPrepare.enable();
		
		eventRequests.add(createBreakPoint(manager, "java.lang.reflect.Field", "get"));
		eventRequests.add(createBreakPoint(manager, "java.lang.reflect.Field", "set"));
	}

	private BreakpointRequest createBreakPoint(EventRequestManager manager, String className, String operationName) {
		ClassType reflectField = (ClassType) vm.classesByName(className).get(0);
		Method method = reflectField.methodsByName(operationName).get(0);
		BreakpointRequest request = manager.createBreakpointRequest(method.location());
		request.enable();
		return request;
	}

	/**
	 * Returns the ThreadTrace instance for the specified thread, creating one if
	 * needed.
	 */
	private SecurityCheck threadTrace(ThreadReference thread) {
		SecurityCheck trace = traceMap.get(thread);
		if (trace == null) {
			trace = new SecurityCheck(cache, this, "trace_"+ new SimpleDateFormat("yyyy-MM-dd_HH-mm").format(new Date())+".txt");
			traceMap.put(thread, trace);
		}
		return trace;
	}

	/**
	 * Dispatch incoming events
	 */
	private void handleEvent(Event event) {
		if(event instanceof BreakpointEvent) {
			threadTrace(((BreakpointEvent) event).thread()).breakpointEvent(((BreakpointEvent) event));
		} else if (event instanceof WatchpointEvent) {
			threadTrace(((WatchpointEvent) event).thread()).fieldEvent(((WatchpointEvent) event));
		} else if (event instanceof MethodEntryEvent) {
			threadTrace(((MethodEntryEvent) event).thread()).methodEntryEvent((MethodEntryEvent) event);
		} else if (event instanceof MethodExitEvent) {
			threadTrace(((MethodExitEvent) event).thread()).methodExitEvent((MethodExitEvent) event);
		} else if (event instanceof ClassPrepareEvent) {
			prepareClass((ClassPrepareEvent) event);
		} else if (event instanceof VMDeathEvent) {
			System.out.println("System terminated at VMDead event");
			terminate  = true;
		}
	}

	/**
	 * A new class has been loaded. Set watchpoints on each of its fields
	 */
	private void prepareClass(ClassPrepareEvent event) {
		EventRequestManager manager = vm.eventRequestManager();
		List<Field> fields = event.referenceType().fields();
		for (Field field : fields) {
			try {
//				Annotations annotation = cache.getAnnotations(event.referenceType(),
//						event.thread());
//				if (annotation.hasSecrecy(SignatureHelper.getSignature(field))) {

					AccessWatchpointRequest accessWatchPoint = manager.createAccessWatchpointRequest(field);
					eventRequests.add(accessWatchPoint);
					for (String exclude : excludes) {
						accessWatchPoint.addClassExclusionFilter(exclude);
					}
					accessWatchPoint.setSuspendPolicy(EventRequest.SUSPEND_ALL);
					accessWatchPoint.enable();
//				}
//				if (annotation.hasIntegrity(SignatureHelper.getSignature(field))) {

					ModificationWatchpointRequest modificationWatchPoint = manager
							.createModificationWatchpointRequest(field);

					for (String exclude : excludes) {
						modificationWatchPoint.addClassExclusionFilter(exclude);
					}
					modificationWatchPoint.setSuspendPolicy(EventRequest.SUSPEND_ALL);
					modificationWatchPoint.enable();
//				}
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
	}

	public void enableEventRequests() {
		// for (EventRequest request : eventRequests) {
		// if (!request.isEnabled()) {
		// request.enable();
		// }
		// }
		EventRequestManager manager = vm.eventRequestManager();
		for (EventRequest rq : manager.accessWatchpointRequests()) {
			if (!rq.isEnabled()) {
				rq.enable();
			}
		}
		for (EventRequest rq : manager.breakpointRequests()) {
			if (!rq.isEnabled()) {
				rq.enable();
			}
		}
		for (EventRequest rq : manager.classPrepareRequests()) {
			if (!rq.isEnabled()) {
				rq.enable();
			}
		}
		for (EventRequest rq : manager.classUnloadRequests()) {
			if (!rq.isEnabled()) {
				rq.enable();
			}
		}
		for (EventRequest rq : manager.exceptionRequests()) {
			if (!rq.isEnabled()) {
				rq.enable();
			}
		}
		for (EventRequest rq : manager.methodEntryRequests()) {
			if (!rq.isEnabled()) {
				rq.enable();
			}
		}
		for (EventRequest rq : manager.methodExitRequests()) {
			if (!rq.isEnabled()) {
				rq.enable();
			}
		}
		for (EventRequest rq : manager.modificationWatchpointRequests()) {
			if (!rq.isEnabled()) {
				rq.enable();
			}
		}
		for (EventRequest rq : manager.monitorContendedEnteredRequests()) {
			if (!rq.isEnabled()) {
				rq.enable();
			}
		}
		for (EventRequest rq : manager.monitorContendedEnterRequests()) {
			if (!rq.isEnabled()) {
				rq.enable();
			}
		}
		for (EventRequest rq : manager.monitorWaitedRequests()) {
			if (!rq.isEnabled()) {
				rq.enable();
			}
		}
		for (EventRequest rq : manager.monitorWaitRequests()) {
			if (!rq.isEnabled()) {
				rq.enable();
			}
		}
		for (EventRequest rq : manager.stepRequests()) {
			if (!rq.isEnabled()) {
				rq.enable();
			}
		}
		for (EventRequest rq : manager.threadDeathRequests()) {
			if (!rq.isEnabled()) {
				rq.enable();
			}
		}
		for (EventRequest rq : manager.threadStartRequests()) {
			if (!rq.isEnabled()) {
				rq.enable();
			}
		}
		for (EventRequest rq : manager.vmDeathRequests()) {
			if (!rq.isEnabled()) {
				rq.enable();
			}
		}
	}

	public void disableEventRequests() {
		// for (EventRequest request : eventRequests) {
		// if (request.isEnabled()) {
		// request.disable();
		// }
		// }
		EventRequestManager manager = vm.eventRequestManager();
		for (EventRequest rq : manager.accessWatchpointRequests()) {
			if (rq.isEnabled()) {
				rq.disable();
			}
		}
		for (EventRequest rq : manager.breakpointRequests()) {
			if (rq.isEnabled()) {
				rq.disable();
			}
		}
		for (EventRequest rq : manager.classPrepareRequests()) {
			if (rq.isEnabled()) {
				rq.disable();
			}
		}
		for (EventRequest rq : manager.classUnloadRequests()) {
			if (rq.isEnabled()) {
				rq.disable();
			}
		}
		for (EventRequest rq : manager.exceptionRequests()) {
			if (rq.isEnabled()) {
				rq.disable();
			}
		}
		for (EventRequest rq : manager.methodEntryRequests()) {
			if (rq.isEnabled()) {
				rq.disable();
			}
		}
		for (EventRequest rq : manager.methodExitRequests()) {
			if (rq.isEnabled()) {
				rq.disable();
			}
		}
		for (EventRequest rq : manager.modificationWatchpointRequests()) {
			if (rq.isEnabled()) {
				rq.disable();
			}
		}
		for (EventRequest rq : manager.monitorContendedEnteredRequests()) {
			if (rq.isEnabled()) {
				rq.disable();
			}
		}
		for (EventRequest rq : manager.monitorContendedEnterRequests()) {
			if (rq.isEnabled()) {
				rq.disable();
			}
		}
		for (EventRequest rq : manager.monitorWaitedRequests()) {
			if (rq.isEnabled()) {
				rq.disable();
			}
		}
		for (EventRequest rq : manager.monitorWaitRequests()) {
			if (rq.isEnabled()) {
				rq.disable();
			}
		}
		for (EventRequest rq : manager.stepRequests()) {
			if (rq.isEnabled()) {
				rq.disable();
			}
		}
		for (EventRequest rq : manager.threadDeathRequests()) {
			if (rq.isEnabled()) {
				rq.disable();
			}
		}
		for (EventRequest rq : manager.threadStartRequests()) {
			if (rq.isEnabled()) {
				rq.disable();
			}
		}
		for (EventRequest rq : manager.vmDeathRequests()) {
			if (rq.isEnabled()) {
				rq.disable();
			}
		}
	}

	public boolean excluded(String name) {
		for(String exclude : excludes) {
			if(exclude.endsWith("*")) {
				if(name.startsWith(exclude.substring(0, exclude.length()-1))) {
					return true;
				}
			}
			else {
				if(name.substring(0, name.lastIndexOf('.')).equals(exclude)) {
					return true;
				}
			}
		}
		return false;
	}
}
