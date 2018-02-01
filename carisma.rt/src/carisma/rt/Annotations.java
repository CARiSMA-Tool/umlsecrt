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

	private final Set<String> secrecy, integrity;
	private final String memberSignature;

	public Annotations(Class<?> reflectionClass, AccessibleObject reflectionMember) {
		this.memberSignature = SignatureHelper.getSignature(reflectionMember);

		Set<String> secrecy = new HashSet<>();
		Set<String> integrity = new HashSet<>();

		for (Annotation annotation : reflectionMember.getDeclaredAnnotations()) {
			if (annotation instanceof Secrecy) {
				secrecy.add(memberSignature);
			} else if (annotation instanceof Integrity) {
				integrity.add(memberSignature);
			}
		}

		for (Annotation annotation : reflectionClass.getAnnotationsByType(Critical.class)) {
			Critical critical = (Critical) annotation;
			for (String signature : critical.secrecy()) {
				if (!signature.equals(memberSignature)) {
					secrecy.add(normalize(signature));
				}
			}
			for (String signature : critical.integrity()) {
				if (!signature.equals(memberSignature)) {
					integrity.add(normalize(signature));
				}
			}

		}
		this.secrecy = Collections.unmodifiableSet(secrecy);
		this.integrity = Collections.unmodifiableSet(integrity);
	}

	public boolean hasSecrecy(String signature) {
		for (String s : secrecy) {
			if (equivalentSignatures(s, signature)) {
				return true;
			}
		}
		return false;
	}

	public boolean hasIntegrity(String signature) {
		for (String i : integrity) {
			if (equivalentSignatures(i, signature)) {
				return true;
			}
		}
		return false;
	}

	public String getMemberSignature() {
		return memberSignature;
	}

	@Override
	public String toString() {
		return super.toString() + "(" + memberSignature + ": secrecy=" + secrecy + ", integrity=" + integrity + ")";
	}

	private static boolean equivalentSignatures(String rhs, String lhs) {
		String tmpLhs = normalize(lhs);
		String tmpRhs = normalize(rhs);
		return tmpLhs.endsWith(tmpRhs) || tmpRhs.endsWith(tmpLhs);
	}

	private static String normalize(String signature) {
		signature = signature.replace(" ", "");
		if (signature.indexOf(':') < 0) {
			return signature + ":void";
		}
		return signature;
	}
}
