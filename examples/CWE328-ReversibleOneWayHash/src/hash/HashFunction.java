package hash;

import org.gravity.security.annotations.requirements.Secrecy;

/**
 * Some deprecated hash function like SHA1 which cannot guarantee integrity.
 * For this reason the @Integrity annotation has been removed in a newer version
 * @Secrecy is still guaranteed!
 * 
 * @author speldszus
 *
 */
public class HashFunction {

	@Secrecy
	public static int hash(String value) {
		return value.hashCode();
	}
}
