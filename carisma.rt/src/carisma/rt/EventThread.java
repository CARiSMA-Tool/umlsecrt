package carisma.rt;

import com.sun.jdi.*;
import com.sun.jdi.request.*;
import com.sun.jdi.event.*;

import java.util.*;

class EventThread extends Thread {

	final VirtualMachine vm;
	private final Set<String> excludes;

	private Map<ThreadReference, SecurityCheck> traceMap = new HashMap<>();
	private final ClassloaderCache cache;

	EventThread(VirtualMachine vm, Set<String> excludes, Set<String> classpath) {
		super("event-handler");
		this.vm = vm;
		this.excludes = excludes;
		this.cache = new ClassloaderCache(classpath);

		setEventRequests();
	}

	@Override
	public void run() {
		EventQueue queue = vm.eventQueue();
		while (true) {
			try {
				EventSet eventSet = queue.remove();
				EventIterator it = eventSet.eventIterator();
				while (it.hasNext()) {
					handleEvent(it.nextEvent());
				}
				eventSet.resume();
			} catch (InterruptedException | VMDisconnectedException e) {
				e.printStackTrace();
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

		MethodEntryRequest menr = mgr.createMethodEntryRequest();
		for (String exclude : excludes) {
			menr.addClassExclusionFilter(exclude);
		}
		menr.setSuspendPolicy(EventRequest.SUSPEND_NONE);
		menr.enable();

		MethodExitRequest mexr = mgr.createMethodExitRequest();
		for (String exclude : excludes) {
			mexr.addClassExclusionFilter(exclude);
		}
		mexr.setSuspendPolicy(EventRequest.SUSPEND_NONE);
		mexr.enable();

		ClassPrepareRequest cpr = mgr.createClassPrepareRequest();
		for (String exclude : excludes) {
			cpr.addClassExclusionFilter(exclude);
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
			trace = new SecurityCheck(cache);
			traceMap.put(thread, trace);
		}
		return trace;
	}

	/**
	 * Dispatch incoming events
	 */
	private void handleEvent(Event event) {
		if (event instanceof ModificationWatchpointEvent || event instanceof AccessWatchpointEvent) {
			threadTrace(((LocatableEvent) event).thread()).fieldEvent(((WatchpointEvent) event).field());
		} else if (event instanceof MethodEntryEvent) {
			threadTrace(((MethodEntryEvent) event).thread()).methodEntryEvent((MethodEntryEvent) event);
		} else if (event instanceof MethodExitEvent) {
			threadTrace(((MethodExitEvent) event).thread()).methodExitEvent((MethodExitEvent) event);
		} else if (event instanceof ClassPrepareEvent) {
			prepareClass((ClassPrepareEvent) event);
		}
	}

	/**
	 * A new class has been loaded. Set watchpoints on each of its fields
	 */
	private void prepareClass(ClassPrepareEvent event) {
		EventRequestManager mgr = vm.eventRequestManager();
		List<Field> fields = event.referenceType().visibleFields();
		for (Field field : fields) {
			try {
				Annotations annotation = cache.getAnnotations(field);
				if (annotation.getSecrecy().contains(annotation.getMemberSignature())
						|| annotation.getIntegrity().contains(annotation.getMemberSignature())) {
					ModificationWatchpointRequest modificationWatchPoint = mgr
							.createModificationWatchpointRequest(field);
					AccessWatchpointRequest accessWatchPoint = mgr.createAccessWatchpointRequest(field);
					for (String exclude : excludes) {
						modificationWatchPoint.addClassExclusionFilter(exclude);
						accessWatchPoint.addClassExclusionFilter(exclude);
					}
					modificationWatchPoint.setSuspendPolicy(EventRequest.SUSPEND_NONE);
					accessWatchPoint.setSuspendPolicy(EventRequest.SUSPEND_NONE);
					modificationWatchPoint.enable();
					accessWatchPoint.enable();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
	}
}
