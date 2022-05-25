/**
 */
package carisma.rt.models.protocol;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RT Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link carisma.rt.models.protocol.RTType#getPath <em>Path</em>}</li>
 *   <li>{@link carisma.rt.models.protocol.RTType#getMembers <em>Members</em>}</li>
 * </ul>
 *
 * @see carisma.rt.models.protocol.ProtocolPackage#getRTType()
 * @model abstract="true"
 * @generated
 */
public interface RTType extends RTNamedElement {
	/**
	 * Returns the value of the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' attribute.
	 * @see #setPath(String)
	 * @see carisma.rt.models.protocol.ProtocolPackage#getRTType_Path()
	 * @model
	 * @generated
	 */
	String getPath();

	/**
	 * Sets the value of the '{@link carisma.rt.models.protocol.RTType#getPath <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' attribute.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(String value);

	/**
	 * Returns the value of the '<em><b>Members</b></em>' containment reference list.
	 * The list contents are of type {@link carisma.rt.models.protocol.RTMember}.
	 * It is bidirectional and its opposite is '{@link carisma.rt.models.protocol.RTMember#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Members</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Members</em>' containment reference list.
	 * @see carisma.rt.models.protocol.ProtocolPackage#getRTType_Members()
	 * @see carisma.rt.models.protocol.RTMember#getOwner
	 * @model opposite="owner" containment="true"
	 * @generated
	 */
	EList<RTMember> getMembers();

} // RTType
