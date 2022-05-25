package carisma.rt.instrument;

import java.util.ArrayList;
import static carisma.rt.instrument.RTAgent.PRINT;

/**
 * This class is used for managing stacks based on threads
 * 
 * @author speldszus
 *
 */
public final class RTStackManager {

	private static final int INITIAL_CAPACITY = 50;

	private static final ArrayList<RTStack> stacks = new ArrayList<>(INITIAL_CAPACITY);

	private RTStackManager() {
		// This class shouldn't be initaialized
	}
	
	public static final void pop() {
		getStack().pollFirst();
	}

	/**
	 * Get the stack for the given thread
	 * 
	 * @param thread The tread
	 * @return The stack
	 */
	public static final RTStack getStack() {
		Thread thread = Thread.currentThread();
		int index = (int) (thread.getId() - 1);

		// First try unsynchronized read
		RTStack stack = null;
		int size = stacks.size();
		if (size > index) {
			stack = stacks.get(index);
		}

		// If no success the stack has to be added in a synchronous way
		if(stack == null) {
			stack = synchronizedGetStack(index, newStack());
		}
		return stack;
	}

	/**
	 * @param id
	 * @return
	 */
	private static synchronized RTStack synchronizedGetStack(int id, RTStack newStack) {
		RTStack stack;
		int size = stacks.size();
		if (size > id) {
			stack = stacks.get(id);
			if (stack == null) {
				stack = newStack;
				stacks.set(id, stack);
			}
		} else if (size == id) {
			stack = newStack;
			stacks.add(stack);
		} else {
			for (int i = size; i < id; i++) {
				stacks.add(null);
			}
			stack = newStack;
			stacks.add(stack);
		}

		return stack;
	}

	/**
	 * Creates a new stack
	 * 
	 * @return The stack
	 */
	private static RTStack newStack() {
		RTStack stack;
		if (PRINT) {
			stack = new RTStackPrintable();
		} else {
			stack = new RTStack();
		}
		return stack;
	}
}
