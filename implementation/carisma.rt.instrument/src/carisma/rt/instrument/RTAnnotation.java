package carisma.rt.instrument;

public final class RTAnnotation {

	private final String signature;
	private final String[] secrecy;
	private final String[] integrity;
	private final Class<?> clazz;
	long ownId = -1;
	long prevId = -1;

	public RTAnnotation(String signature, Class<?> clazz, String[] secrecy, String[] integrity) {
		this.signature = signature;
		this.clazz = clazz;
		this.secrecy = secrecy;
		this.integrity = integrity;
	}

	public String getSignature() {
		return signature;
	}

	public Class<?> getClazz() {
		return clazz;
	}

	public boolean hasSecrecy(String signature) {
		for (String s : secrecy) {
			if (signature.endsWith(s)) {
				return true;
			}
		}
		return false;
	}

	public boolean hasIntegrity(String signature) {
		for (String s : integrity) {
			if (signature.endsWith(s)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public String toString() {
		return this.signature + " secrecy=" + secrecy + " integrity=" + integrity;
	}
}