package carisma.rt.instrument;

import java.util.ArrayList;
import java.util.List;

import static carisma.rt.instrument.RTAgent.PRINT;

/**
 * This class is used for managing stacks based on threads
 * 
 * @author speldszus
 *
 */
public class RTStackManager {

	private static final List<Thread> threads = new ArrayList<>();
	private static final List<RTStack> stacks = new ArrayList<>();
 
	/**
	 * Get the stack for the given thread
	 * 
	 * @param thread The tread
	 * @return The stack
	 */
	public static synchronized final RTStack getStack(Thread thread) {
		int index = threads.size();
		while (--index >= 0) {
			if (threads.get(index).equals(thread)) {
				return stacks.get(index);
			}
		}
		RTStack stack;
		if (PRINT) {
			stack = new RTStackPrintable();
		} else {
			stack = new RTStack();
		}
		threads.add(thread);
		stacks.add(stack);
		return stack;

	}
}
