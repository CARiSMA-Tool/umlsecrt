package carisma.rt;

import java.lang.annotation.Annotation;
import java.lang.reflect.AccessibleObject;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import org.gravity.security.annotations.requirements.Critical;
import org.gravity.security.annotations.requirements.Integrity;
import org.gravity.security.annotations.requirements.Secrecy;

public class Annotations {
	
	private final boolean hasSecrecy, hasIntegrity;
	private final Set<String> secrecy, integrity;
	private final String memberSignature;
	
	public Annotations(Class<?> reflectionClass, AccessibleObject reflectionMember) {
		this.memberSignature = Signatures.getSignature(reflectionMember);
		
		boolean hasSecrecy = false;
		Set<String> secrecy = new HashSet<>();
		boolean hasIntegrity = false;
		Set<String> integrity = new HashSet<>();

		for (Annotation annotation : reflectionMember.getDeclaredAnnotations()) {
			if (annotation instanceof Secrecy) {
				hasSecrecy = true;
			} else if (annotation instanceof Integrity) {
				hasIntegrity = true;
			}
		}

		for (Annotation annotation : reflectionClass.getAnnotationsByType(Critical.class)) {
			if (annotation instanceof Critical) {
				Critical critical = (Critical) annotation;
				for (String signature : critical.secrecy()) {
					if (signature.equals(memberSignature)) {
						hasSecrecy = true;
					} else {
						secrecy.add(signature);
					}
				}
				for (String signature : critical.integrity()) {
					if (signature.equals(memberSignature)) {
						hasIntegrity = true;
					} else {
						integrity.add(signature);
					}
				}
			}
		}
		this.secrecy = Collections.unmodifiableSet(secrecy);
		this.hasSecrecy = hasSecrecy; //todo: add to list
		this.integrity = Collections.unmodifiableSet(integrity);
		this.hasIntegrity = hasIntegrity;
	}
	
	public boolean hasSecrecy() {
		return hasSecrecy;
	}

	public boolean hasIntegrity() {
		return hasIntegrity;
	}

	public Set<String> getSecrecy() {
		return secrecy;
	}

	public Set<String> getIntegrity() {
		return integrity;
	}

	public String getMemberSignature() {
		return memberSignature;
	}
	
	@Override
	public String toString() {
		return super.toString()+ "("+memberSignature+": secrecy="+hasSecrecy+", integrity="+hasIntegrity+", secrecy="+secrecy+", integrity="+integrity+")";
	}
}
