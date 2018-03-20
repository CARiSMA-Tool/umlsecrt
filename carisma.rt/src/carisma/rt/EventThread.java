package carisma.rt;

import com.sun.jdi.*;
import com.sun.jdi.request.*;
import com.sun.jdi.event.*;

import java.util.*;

class EventThread extends Thread {

	private final VirtualMachine vm;
	private final Set<String> excludes;

	private Map<ThreadReference, SecurityCheck> traceMap = new HashMap<>();
	private Set<EventRequest> eventRequests = new HashSet<>();
	private final ClassloaderCache cache;
	
	
	
	EventThread(VirtualMachine vm, Set<String> excludes, Set<String> classpath) {
		super("event-handler");
		this.vm = vm;
		this.excludes = excludes;
		this.cache = new ClassloaderCache(classpath, this.getClass().getClassLoader());

		createEventRequests();
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
				break;
			}
		}
	}

	private void createEventRequests() {
		EventRequestManager manager = vm.eventRequestManager();

		MethodEntryRequest methodEntry = manager.createMethodEntryRequest();
		MethodExitRequest methodExit = manager.createMethodExitRequest();
		ClassPrepareRequest classPrepare = manager.createClassPrepareRequest();
		
		for (String exclude : excludes) {
			classPrepare.addClassExclusionFilter(exclude);
			methodEntry.addClassExclusionFilter(exclude);
			methodExit.addClassExclusionFilter(exclude);
		}
		
		methodEntry.setSuspendPolicy(EventRequest.SUSPEND_ALL);
		methodExit.setSuspendPolicy(EventRequest.SUSPEND_ALL);
		classPrepare.setSuspendPolicy(EventRequest.SUSPEND_ALL);
		
		methodExit.enable();
		methodEntry.enable();
		classPrepare.enable();
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
		if (event instanceof WatchpointEvent) {
			threadTrace(((WatchpointEvent) event).thread()).fieldEvent(((WatchpointEvent) event).field());
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
		EventRequestManager manager = vm.eventRequestManager();
		List<Field> fields = event.referenceType().visibleFields();
		for (Field field : fields) {
			try {
				Annotations annotation = cache.getAnnotations(field);
				if (annotation.hasSecrecy(annotation.getMemberSignature())
						|| annotation.hasIntegrity(annotation.getMemberSignature())) {
					
					ModificationWatchpointRequest modificationWatchPoint = manager
							.createModificationWatchpointRequest(field);
					AccessWatchpointRequest accessWatchPoint = manager.createAccessWatchpointRequest(field);
					
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
	
	public void enableEventRequests() {
		
	}
}
