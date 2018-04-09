package carisma.rt;

import java.lang.annotation.Annotation;
import java.lang.reflect.AccessibleObject;
import java.util.Collections;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;

import org.gravity.security.annotations.requirements.Critical;
import org.gravity.security.annotations.requirements.Integrity;
import org.gravity.security.annotations.requirements.Secrecy;

class Annotations {

	private final Set<String> secrecy, integrity;
	private final Class<?> clazz;
	private final Hashtable<String, String> earlyReturns = new Hashtable<>();

	Annotations(Class<?> reflectionClass) {
		this.clazz = reflectionClass;
		
		Set<String> secrecy = new HashSet<>();
		Set<String> integrity = new HashSet<>();

		getAnnotations(secrecy, integrity, clazz.getDeclaredFields());
		getAnnotations(secrecy, integrity, clazz.getDeclaredMethods());
		getAnnotations(secrecy, integrity, clazz.getDeclaredConstructors());

		for (Annotation annotation : reflectionClass.getAnnotationsByType(Critical.class)) {
			Critical critical = (Critical) annotation;
			for (String signature : critical.secrecy()) {
				secrecy.add(normalize(signature));
			}
			for (String signature : critical.integrity()) {
				integrity.add(normalize(signature));
			}

		}
		this.secrecy = Collections.unmodifiableSet(secrecy);
		this.integrity = Collections.unmodifiableSet(integrity);
	}

	private void getAnnotations(Set<String> secrecy, Set<String> integrity, AccessibleObject[] accessibleObjects) {
		for(AccessibleObject object: accessibleObjects) {
			for (Annotation annotation : object.getDeclaredAnnotations()) {
				String signature = SignatureHelper.getSignature(object);
				if (annotation instanceof Secrecy) {
					secrecy.add(signature);
					this.earlyReturns.put(signature, ((Secrecy) annotation).earlyReturn().trim());
				} else if (annotation instanceof Integrity) {
					integrity.add(signature);
					this.earlyReturns.put(signature, ((Integrity) annotation).earlyReturn().trim());
				}
			}
		}
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

//	public String getMemberSignature() {
//		return clazz;
//	}
//
//	public String getEarlyReturn() {
//		return earlyReturn;
//	}

	@Override
	public String toString() {
		return super.toString() + "(" + clazz + ": secrecy=" + secrecy + ", integrity=" + integrity + ")";
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

	public String getEarlyReturn(String memberSiganture) {
		return earlyReturns.containsKey(memberSiganture) ? earlyReturns.get(memberSiganture) : null;
	}
}
