/**
 */
package carisma.rt.models.protocol;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>RT Security</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see carisma.rt.models.protocol.ProtocolPackage#getRTSecurity()
 * @model
 * @generated
 */
public enum RTSecurity implements Enumerator {
	/**
	 * The '<em><b>RT Secrecy</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RT_SECRECY_VALUE
	 * @generated
	 * @ordered
	 */
	RT_SECRECY(0, "RTSecrecy", "RTSecrecy"),

	/**
	 * The '<em><b>RT Integrity</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RT_INTEGRITY_VALUE
	 * @generated
	 * @ordered
	 */
	RT_INTEGRITY(0, "RTIntegrity", "RTIntegrity");

	/**
	 * The '<em><b>RT Secrecy</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RT Secrecy</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RT_SECRECY
	 * @model name="RTSecrecy"
	 * @generated
	 * @ordered
	 */
	public static final int RT_SECRECY_VALUE = 0;

	/**
	 * The '<em><b>RT Integrity</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RT Integrity</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RT_INTEGRITY
	 * @model name="RTIntegrity"
	 * @generated
	 * @ordered
	 */
	public static final int RT_INTEGRITY_VALUE = 0;

	/**
	 * An array of all the '<em><b>RT Security</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final RTSecurity[] VALUES_ARRAY =
		new RTSecurity[] {
			RT_SECRECY,
			RT_INTEGRITY,
		};

	/**
	 * A public read-only list of all the '<em><b>RT Security</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<RTSecurity> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>RT Security</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RTSecurity get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RTSecurity result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>RT Security</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RTSecurity getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RTSecurity result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>RT Security</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RTSecurity get(int value) {
		switch (value) {
			case RT_SECRECY_VALUE: return RT_SECRECY;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private RTSecurity(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //RTSecurity
