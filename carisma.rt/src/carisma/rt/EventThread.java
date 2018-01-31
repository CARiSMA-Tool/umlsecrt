/*
 * Copyright (c) 2001, 2011, Oracle and/or its affiliates. All rights reserved.
 * ORACLE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */

/*
 * This source code is provided to illustrate the usage of a given feature
 * or technique and has been deliberately simplified. Additional steps
 * required for a production-quality application, such as security checks,
 * input validation and proper error handling, might not be present in
 * this sample code.
 */

package carisma.rt;

import com.sun.jdi.*;
import com.sun.jdi.request.*;
import com.sun.jdi.event.*;

import java.util.*;

/**
 * This class processes incoming JDI events and displays them
 *
 * @author Robert Field
 */
class EventThread extends Thread {

	final VirtualMachine vm; // Running VM
	private final String[] excludes; // Packages to exclude

	private boolean connected = true; // Connected to VM
	// Maps ThreadReference to ThreadTrace instances
	private Map<ThreadReference, SecurityCheck> traceMap = new HashMap<>();
	List<String> classpath;

	EventThread(VirtualMachine vm, String[] excludes, List<String> classpath) {
		super("event-handler");
		this.vm = vm;
		this.excludes = excludes;
		this.classpath = classpath;

		setEventRequests();
	}

	/**
	 * Run the event handling thread. As long as we are connected, get event sets
	 * off the queue and dispatch the events within them.
	 */
	@Override
	public void run() {
		EventQueue queue = vm.eventQueue();
		while (connected) {
			try {
				EventSet eventSet = queue.remove();
				EventIterator it = eventSet.eventIterator();
				while (it.hasNext()) {
					handleEvent(it.nextEvent());
				}
				eventSet.resume();
			} catch (InterruptedException exc) {
				// Ignore
			} catch (VMDisconnectedException discExc) {
//				handleDisconnectedException();
				break;
			}
		}
	}

	/**
	 * Create the desired event requests, and enable them so that we will get
	 * events.
	 */
	private void setEventRequests() {
		EventRequestManager mgr = vm.eventRequestManager();

		// want all exceptions
		ExceptionRequest excReq = mgr.createExceptionRequest(null, true, true);
		// suspend so we can step
		excReq.setSuspendPolicy(EventRequest.SUSPEND_ALL);
		excReq.enable();

		MethodEntryRequest menr = mgr.createMethodEntryRequest();
		for (int i = 0; i < excludes.length; ++i) {
			menr.addClassExclusionFilter(excludes[i]);
		}
		menr.setSuspendPolicy(EventRequest.SUSPEND_NONE);
		menr.enable();

		MethodExitRequest mexr = mgr.createMethodExitRequest();
		for (int i = 0; i < excludes.length; ++i) {
			mexr.addClassExclusionFilter(excludes[i]);
		}
		mexr.setSuspendPolicy(EventRequest.SUSPEND_NONE);
		mexr.enable();

		ThreadDeathRequest tdr = mgr.createThreadDeathRequest();
		// Make sure we sync on thread death
		tdr.setSuspendPolicy(EventRequest.SUSPEND_ALL);
		tdr.enable();

		ClassPrepareRequest cpr = mgr.createClassPrepareRequest();
		for (int i = 0; i < excludes.length; ++i) {
			cpr.addClassExclusionFilter(excludes[i]);
		}
		cpr.setSuspendPolicy(EventRequest.SUSPEND_ALL);
		cpr.enable();

	}

	/**
	 * Returns the ThreadTrace instance for the specified thread, creating one if
	 * needed.
	 */
	private SecurityCheck threadTrace(ThreadReference thread) {
		SecurityCheck trace = traceMap.get(thread);
		if (trace == null) {
			trace = new SecurityCheck(classpath);
			traceMap.put(thread, trace);
		}
		return trace;
	}

	/**
	 * Dispatch incoming events
	 */
	private void handleEvent(Event event) {
		if (event instanceof ExceptionEvent) {
//			exceptionEvent((ExceptionEvent) event);
		} else if (event instanceof ModificationWatchpointEvent) {
			fieldWatchEvent((ModificationWatchpointEvent) event);
		} else if (event instanceof MethodEntryEvent) {
			methodEntryEvent((MethodEntryEvent) event);
		} else if (event instanceof MethodExitEvent) {
			methodExitEvent((MethodExitEvent) event);
//		} else if (event instanceof StepEvent) {
//			stepEvent((StepEvent) event);
//		} else if (event instanceof ThreadDeathEvent) {
//			threadDeathEvent((ThreadDeathEvent) event);
		} else if (event instanceof ClassPrepareEvent) {
			classPrepareEvent((ClassPrepareEvent) event);
//		} else if (event instanceof VMStartEvent) {
//			vmStartEvent((VMStartEvent) event);
//		} else if (event instanceof VMDeathEvent) {
//			vmDeathEvent((VMDeathEvent) event);
//		} else if (event instanceof VMDisconnectEvent) {
//			vmDisconnectEvent((VMDisconnectEvent) event);
//		} else {
//			throw new Error("Unexpected event type");
		}
	}

	/***
	 * A VMDisconnectedException has happened while dealing with another event. We
	 * need to flush the event queue, dealing only with exit events (VMDeath,
	 * VMDisconnect) so that we terminate correctly.
	 */
//	private synchronized void handleDisconnectedException() {
//		EventQueue queue = vm.eventQueue();
//		while (connected) {
//			try {
//				EventSet eventSet = queue.remove();
//				EventIterator iter = eventSet.eventIterator();
//				while (iter.hasNext()) {
//					Event event = iter.nextEvent();
//					if (event instanceof VMDeathEvent) {
//						vmDeathEvent((VMDeathEvent) event);
//					} else if (event instanceof VMDisconnectEvent) {
//						vmDisconnectEvent((VMDisconnectEvent) event);
//					}
//				}
//				eventSet.resume(); // Resume the VM
//			} catch (InterruptedException exc) {
//				// ignore
//			}
//		}
//	}
//
//	private void vmStartEvent(VMStartEvent event) {
//	}

	// Forward event for thread specific processing
	private void methodEntryEvent(MethodEntryEvent event) {
		threadTrace(event.thread()).methodEntryEvent(event);
	}

	// Forward event for thread specific processing
	private void methodExitEvent(MethodExitEvent event) {
		threadTrace(event.thread()).methodExitEvent(event);
	}

//	// Forward event for thread specific processing
//	private void stepEvent(StepEvent event) {
//		threadTrace(event.thread()).stepEvent(event);
//	}

	// Forward event for thread specific processing
	private void fieldWatchEvent(ModificationWatchpointEvent event) {
		threadTrace(event.thread()).fieldWatchEvent(event);
	}

//	void threadDeathEvent(ThreadDeathEvent event) {
//		SecurityCheck trace = traceMap.get(event.thread());
//		if (trace != null) { // only want threads we care about
//			trace.threadDeathEvent(event); // Forward event
//		}
//	}

	/**
	 * A new class has been loaded. Set watchpoints on each of its fields
	 */
	private void classPrepareEvent(ClassPrepareEvent event) {
		EventRequestManager mgr = vm.eventRequestManager();
		List<Field> fields = event.referenceType().visibleFields();
		for (Field field : fields) {
			ModificationWatchpointRequest req = mgr.createModificationWatchpointRequest(field);
			for (int i = 0; i < excludes.length; ++i) {
				req.addClassExclusionFilter(excludes[i]);
			}
			req.setSuspendPolicy(EventRequest.SUSPEND_NONE);
			req.enable();
		}
	}

//	private void exceptionEvent(ExceptionEvent event) {
//		SecurityCheck trace = traceMap.get(event.thread());
//		if (trace != null) { // only want threads we care about
//			trace.exceptionEvent(event); // Forward event
//		}
//	}
//
//	private void vmDeathEvent(VMDeathEvent event) {
//	}
//
//	private void vmDisconnectEvent(VMDisconnectEvent event) {
//		connected = false;
//	}
}
