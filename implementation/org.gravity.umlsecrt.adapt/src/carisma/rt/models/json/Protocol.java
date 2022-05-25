package carisma.rt.models.json;

import java.util.List;

public class Protocol {
	
	private String date;
	private String application;
	private String location;
	private List<Call> calls;
	
	public Protocol(String date, String application, String location, List<Call> calls) {
		super();
		this.date = date;
		this.application = application;
		this.location = location;
		this.calls = calls;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getApplication() {
		return application;
	}

	public void setApplication(String application) {
		this.application = application;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public List<Call> getCalls() {
		return calls;
	}

	public void setCalls(List<Call> calls) {
		this.calls = calls;
	}
}
