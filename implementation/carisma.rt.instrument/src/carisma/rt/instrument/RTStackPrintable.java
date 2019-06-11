package carisma.rt.instrument;

import static carisma.rt.instrument.RTAgent.OUT;
import static carisma.rt.instrument.RTAgent.TRACE;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;

public final class RTStackPrintable extends RTStack {

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
		result.add("status", new JsonPrimitive("new"));
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
	 * Writes the Json log to the file system
	 */
	private void write() {
		try (FileWriter writer = new FileWriter(new File(OUT, "UMLsecRT-log.json"))) {
			writer.write(result.toString());
		} catch (IOException e) {
			RTHelper.printAgentError(e);
		}
	}

	/**
	 * Adds a call to the Json representation
	 * 
	 * @param target The target of the call
	 * @return A Json Object representing the call
	 */
	private JsonObject addCall(RTAnnotation target) {
		Class<?> clazz = target.getClazz();
		JsonObject jsonObject;
		jsonObject = new JsonObject();
		jsonObject.add("id", new JsonPrimitive(target.ownId));
		jsonObject.add("prev", new JsonPrimitive(target.prevId));
		jsonObject.add("clazz", new JsonPrimitive(clazz.getName()));
		jsonObject.add("bin",
				new JsonPrimitive(clazz.getProtectionDomain().getCodeSource().getLocation().getFile()));
		jsonObject.add("member", new JsonPrimitive(target.getSignature()));
		calls.add(jsonObject);
		return jsonObject;
	}
}