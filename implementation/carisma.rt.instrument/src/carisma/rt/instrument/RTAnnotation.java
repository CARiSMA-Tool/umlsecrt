package carisma.rt.instrument;

import java.util.Collection;
import java.util.Collections;

public final class RTAnnotation {

	private final String signature;
	private final Collection<String> secrecy;
	private final Collection<String> integrity;
	private final Class<?> clazz;
	long ownId = -1;
	long prevId = -1;

	public RTAnnotation(String signature, Class<?> clazz, Collection<String> secrecy, Collection<String> integrity) {
		this.signature = signature;
		this.clazz = clazz;
		this.secrecy = Collections.unmodifiableCollection(secrecy);
		this.integrity = Collections.unmodifiableCollection(integrity);
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