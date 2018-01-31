package carisma.rt;

import com.sun.jdi.*;
import com.sun.jdi.request.*;
import com.sun.jdi.event.*;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
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
	private final Cache cache;

	EventThread(VirtualMachine vm, String[] excludes, List<String> classpath) {
		super("event-handler");
		this.vm = vm;
		this.excludes = excludes;
		URL[] urls = new URL[classpath.size()];
		for (int i = 0; i < classpath.size(); i++) {
			try {
				urls[i] = new File(classpath.get(i)).toURI().toURL();
			} catch (MalformedURLException e) {
				e.printStackTrace();
			}
		}
		this.cache = new Cache(urls);

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
				// handleDisconnectedException();
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
			trace = new SecurityCheck(cache);
			traceMap.put(thread, trace);
		}
		return trace;
	}

	/**
	 * Dispatch incoming events
	 */
	private void handleEvent(Event event) {
		if (event instanceof ModificationWatchpointEvent) {
			fieldModificationEvent((ModificationWatchpointEvent) event);
		} else if (event instanceof MethodEntryEvent) {
			methodEntryEvent((MethodEntryEvent) event);
		} else if (event instanceof MethodExitEvent) {
			methodExitEvent((MethodExitEvent) event);
		} else if (event instanceof ClassPrepareEvent) {
			classPrepareEvent((ClassPrepareEvent) event);
		}
		else {
			System.err.println("Unknown Event: "+event);
		}
	}

	
	private void methodEntryEvent(MethodEntryEvent event) {
		threadTrace(event.thread()).methodEntryEvent(event);
	}

	private void methodExitEvent(MethodExitEvent event) {
		threadTrace(event.thread()).methodExitEvent(event);
	}

	private void fieldModificationEvent(ModificationWatchpointEvent event) {
		threadTrace(event.thread()).fieldModificationEvent(event);
	}

	/**
	 * A new class has been loaded. Set watchpoints on each of its fields
	 */
	private void classPrepareEvent(ClassPrepareEvent event) {
		EventRequestManager mgr = vm.eventRequestManager();
		List<Field> fields = event.referenceType().visibleFields();
		for (Field field : fields) {
			try {
				Annotations annotation = cache.getAnnotations(field);
				if (annotation.getSecrecy().contains(annotation.getMemberSignature())
						|| annotation.getIntegrity().contains(annotation.getMemberSignature())) {
					ModificationWatchpointRequest modificationWatchPoint = mgr.createModificationWatchpointRequest(field);
					AccessWatchpointRequest accessWatchPoint = mgr.createAccessWatchpointRequest(field);
					for (int i = 0; i < excludes.length; ++i) {
						modificationWatchPoint.addClassExclusionFilter(excludes[i]);
						accessWatchPoint.addClassExclusionFilter(excludes[i]);
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
