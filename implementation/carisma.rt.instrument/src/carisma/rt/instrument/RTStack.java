package carisma.rt.instrument;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.Stack;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;

import static carisma.rt.instrument.RTAgent.PRINT;
import static carisma.rt.instrument.RTAgent.TRACE;
import static carisma.rt.instrument.RTAgent.OUT;

public class RTStack {

	private static final List<Thread> threads = new ArrayList<>();
	private static final List<PrintableStack> stacks = new ArrayList<>();

	public static final PrintableStack getStack(Thread thread) {
		int index = threads.size();
		while (--index >= 0) {
			if (threads.get(index).equals(thread)) {
				return stacks.get(index);
			}
		}
		PrintableStack stack;
		if (PRINT) {
			stack = new PrintableStackImpl();
		} else {
			stack = new PrintableStack();
		}
		threads.add(thread);
		stacks.add(stack);
		return stack;

	}

	public static class PrintableStack extends Stack<RTAnnotation> {

		/**
		 * 
		 */
		private static final long serialVersionUID = 9067872292563356071L;

		public void print(Set<String> set) {
			// We want to do nothing
		}
	}

	public static final class PrintableStackImpl extends PrintableStack {

		/**
		 * 
		 */
		private static final long serialVersionUID = -1095113710199326175L;

		private boolean trace = false;

		private long id = 0;

		private JsonArray calls;

		private JsonObject result;

		@Override
		public RTAnnotation push(RTAnnotation item) {
			item.ownId = id++; // TODO: Remove print and measure
			if (!isEmpty()) {
				item.prevId = peek().ownId;
			}
			if (trace) {
				addCall(item);
				write(); // TODO: find a way to append
			}
			return super.push(item);
		}

		@Override
		public void print(Set<String> violations) {
			trace = TRACE;
			result = new JsonObject();
			result.add("date", new JsonPrimitive(new SimpleDateFormat("yyyy-MM-dd").format(new Date())));
			result.add("application", new JsonPrimitive(""));
			result.add("location", new JsonPrimitive(new File(".").getAbsolutePath()));
			calls = new JsonArray(size());
			result.add("calls", calls);
			JsonObject jsonObject = null;
			for (RTAnnotation a : this) {
				jsonObject = addCall(a);
			}
			if (violations != null) {
				final JsonArray jsonViolationsArray = new JsonArray(violations.size());
				for (String v : violations) {
					jsonViolationsArray.add(v);
				}
				jsonObject.add("violations", jsonViolationsArray);
			}
			write();
		}

		/**
		 * 
		 */
		private void write() {
			try (FileWriter writer = new FileWriter(new File(OUT, "UMLsecRT-log.json"))) {
				writer.write(result.toString());
			} catch (IOException e) {
				RTHelper.printAgentError(e);
			}
		}

		/**
		 * @param target
		 * @return
		 */
		private JsonObject addCall(RTAnnotation target) {
			JsonObject jsonObject;
			jsonObject = new JsonObject();
			jsonObject.add("id", new JsonPrimitive(target.ownId));
			jsonObject.add("prev", new JsonPrimitive(target.prevId));
			jsonObject.add("clazz", new JsonPrimitive(target.getClazz().getName()));
			jsonObject.add("bin",
					new JsonPrimitive(target.getClazz().getProtectionDomain().getCodeSource().getLocation().getFile()));
			jsonObject.add("member", new JsonPrimitive(target.getSignature()));
			calls.add(jsonObject);
			return jsonObject;
		}
	}

	public static final class RTAnnotation {

		private final String signature;
		private final Set<String> secrecy;
		private final Set<String> integrity;
		private final Class<?> clazz;
		private long ownId = -1;
		private long prevId = -1;

		public RTAnnotation(String signature, Class<?> clazz, Set<String> secrecy, Set<String> integrity) {
			this.signature = signature;
			this.clazz = clazz;
			this.secrecy = Collections.unmodifiableSet(secrecy);
			this.integrity = Collections.unmodifiableSet(integrity);
		}

		public String getSignature() {
			return signature;
		}

		public Class<?> getClazz() {
			return clazz;
		}

		public boolean hasSecrecy(String signature) {
			return secrecy.contains(signature);
		}

		public boolean hasIntegrity(String signature) {
			return integrity.contains(signature);
		}

		@Override
		public String toString() {
			return this.signature + " secrecy=" + secrecy + " integrity=" + integrity;
		}
	}
}
