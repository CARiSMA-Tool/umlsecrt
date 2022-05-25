package carisma.rt.models.json;

import java.util.List;

public class Call {

	private String clazz;
	private String member;
	private String bin;
	private long id;
	private long prev;
	private List<String> violations;
	
	public Call(String clazz, String member, String bin, long ownId, long prevId, List<String> violations) {
		this.clazz = clazz;
		this.member = member;
		this.bin = bin;
		this.id = ownId;
		this.prev = prevId;
		this.violations = violations;
	}
	
	public String getClazz() {
		return clazz;
	}
	public void setClazz(String clazz) {
		this.clazz = clazz;
	}
	public String getMember() {
		return member;
	}
	public void setMember(String member) {
		this.member = member;
	}
	public String getBin() {
		return bin;
	}
	public void setBin(String bin) {
		this.bin = bin;
	}

	public long getOwnId() {
		return id;
	}

	public void setOwnId(long ownId) {
		this.id = ownId;
	}

	public long getPrevId() {
		return prev;
	}

	public void setPrevId(long prevId) {
		this.prev = prevId;
	}

	public List<String> getViolations() {
		return violations;
	}

	public void setViolations(List<String> violations) {
		this.violations = violations;
	}
}
