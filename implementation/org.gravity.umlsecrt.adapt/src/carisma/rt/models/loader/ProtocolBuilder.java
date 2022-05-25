package carisma.rt.models.loader;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import carisma.rt.models.json.Call;
import carisma.rt.models.json.Protocol;
import carisma.rt.models.protocol.ProtocolFactory;
import carisma.rt.models.protocol.RTAccess;
import carisma.rt.models.protocol.RTMember;
import carisma.rt.models.protocol.RTProtocol;
import carisma.rt.models.protocol.RTSecurity;
import carisma.rt.models.protocol.RTType;

public class ProtocolBuilder {

	private HashMap<Long, RTMember> rtMembers;
	private RTProtocol rtProtocol;
	private RTAccess rtPrevious;

	public RTProtocol getProtocol(Protocol protocol) {
		rtMembers = new HashMap<>();
		rtProtocol = ProtocolFactory.eINSTANCE.createRTProtocol();
		rtProtocol.setDate(protocol.getDate());
		rtProtocol.setLocation(protocol.getLocation());
		rtProtocol.setProgram(protocol.getApplication());

		for (Call call : protocol.getCalls()) {
			registerMember(call.getClazz(), call.getMember(), call.getBin(), call.getOwnId());
			List<String> violations = call.getViolations();
			if (violations == null) {
				violations = Collections.emptyList();
			}
			addCall(call.getPrevId(), call.getOwnId(), violations.stream().map(s -> {
				switch (s.toLowerCase().trim()) {
				case "secrecy":
					return RTSecurity.RT_SECRECY;
				case "integrity":
					return RTSecurity.RT_INTEGRITY;
				}
				return null;
			}).collect(Collectors.toSet())); // TODO: get prev
		}
		return rtProtocol;
	}

	public RTMember registerMember(String clazz, String member, String bin, long id) {
		RTType rtType = null;
		for (RTType tmp : rtProtocol.getClasses()) {
			if (tmp.getName().equals(clazz) && tmp.getPath().equals(bin)) {
				rtType = tmp;
			}
		}
		if (rtType == null) {
			rtType = ProtocolFactory.eINSTANCE.createRTClass();
			rtType.setName(clazz);
			rtType.setPath(bin);
			rtProtocol.getClasses().add(rtType);
		}
		for (RTMember tmp : rtType.getMembers()) {
			if (tmp.getName().equals(member)) {
				rtMembers.put(id, tmp);
				return tmp;
			}
		}
		RTMember rtMember;
		if (member.contains("(")) {
			rtMember = ProtocolFactory.eINSTANCE.createRTMethod();
		} else {
			rtMember = ProtocolFactory.eINSTANCE.createRTField();
		}
		rtMember.setName(member);
		rtType.getMembers().add(rtMember);
		rtMembers.put(id, rtMember);
		return rtMember;
	}

	public void addCall(long callerId, long calledId, Set<RTSecurity> violations) {
		RTAccess access = ProtocolFactory.eINSTANCE.createRTAccess();
		access.getViolations().addAll(violations);
		access.setTarget(rtMembers.get(calledId));
		if (callerId < 0) {
			rtProtocol.setFirstAccess(access);
		} else {
			access.setSource(rtMembers.get(callerId));
		}
		if(rtPrevious != null) {
			rtPrevious.setNext(access);
		}
		rtPrevious = access;
	}
}
