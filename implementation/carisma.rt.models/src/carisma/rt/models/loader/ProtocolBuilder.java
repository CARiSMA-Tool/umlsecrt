package carisma.rt.models.loader;

import java.util.Set;

import carisma.rt.models.protocol.ProtocolFactory;
import carisma.rt.models.protocol.RTAccess;
import carisma.rt.models.protocol.RTMember;
import carisma.rt.models.protocol.RTProtocol;
import carisma.rt.models.protocol.RTSecurity;
import carisma.rt.models.protocol.RTType;

public class ProtocolBuilder {

	private RTProtocol protocol;
	private RTAccess previous = null;
	
	public ProtocolBuilder() {
		protocol = ProtocolFactory.eINSTANCE.createRTProtocol();
	}

	public void setDate(String date) {
		protocol.setDate(date);
	}

	public void setApplication(String application) {
		protocol.setProgram(application);
	}

	public void setLocation(String location) {
		protocol.setLocation(location);
	}

	public RTProtocol getProtocol() {
		return protocol;
	}

	public RTMember getMember(String clazz, String member, String bin) {
		RTType rtType = null;
		for(RTType tmp : protocol.getClasses()) {
			if(tmp.getName().equals(clazz) && tmp.getPath().equals(bin)) {
				rtType = tmp;
			}
		}
		if(rtType == null) {
			rtType = ProtocolFactory.eINSTANCE.createRTClass();
			rtType.setName(clazz);
			rtType.setPath(bin);
			protocol.getClasses().add(rtType);
		}
		for(RTMember tmp : rtType.getMembers()) {
			if(tmp.getName().equals(member)) {
				return tmp;
			}
		}
		RTMember rtMember;
		if(member.contains("(")) {
			rtMember = ProtocolFactory.eINSTANCE.createRTMethod();
		}
		else {
			rtMember = ProtocolFactory.eINSTANCE.createRTField();
		}
		rtMember.setName(member);
		rtType.getMembers().add(rtMember);
		return rtMember;
	}
	
	public void addCall(RTMember member, Set<RTSecurity> violations) {
		RTAccess access = ProtocolFactory.eINSTANCE.createRTAccess();
		access.getViolations().addAll(violations);
		access.setTarget(member);
		if(previous == null) {
			protocol.setFirstAccess(access);
		}
		else{
			previous.setNext(access);
			access.setSource(previous.getTarget());
		}
		previous = access;
		
	}
}
