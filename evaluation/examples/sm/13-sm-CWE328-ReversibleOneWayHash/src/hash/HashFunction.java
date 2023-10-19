package hash;

/**
 * Some deprecated hash function like SHA1 which cannot guarantee integrity.
 * For this reason the @Integrity annotation has been removed in a newer version
 * @Secrecy is still guaranteed!
 * 
 * @author speldszus
 *
 */
public class HashFunction {

	public static int hash(String value) {
		// A granted security requirement cannot be revoked using the Java Security Manager to lead to an violation if this method does not provide some requirements any longer that a required by a caller
		return value.hashCode();
	}
}
