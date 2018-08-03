/**
 */
package carisma.rt.models.protocol;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RT Member</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link carisma.rt.models.protocol.RTMember#getAccesses <em>Accesses</em>}</li>
 *   <li>{@link carisma.rt.models.protocol.RTMember#getOwner <em>Owner</em>}</li>
 * </ul>
 *
 * @see carisma.rt.models.protocol.ProtocolPackage#getRTMember()
 * @model abstract="true"
 * @generated
 */
public interface RTMember extends RTNamedElement {
	/**
	 * Returns the value of the '<em><b>Accesses</b></em>' containment reference list.
	 * The list contents are of type {@link carisma.rt.models.protocol.RTAccess}.
	 * It is bidirectional and its opposite is '{@link carisma.rt.models.protocol.RTAccess#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Accesses</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accesses</em>' containment reference list.
	 * @see carisma.rt.models.protocol.ProtocolPackage#getRTMember_Accesses()
	 * @see carisma.rt.models.protocol.RTAccess#getSource
	 * @model opposite="source" containment="true"
	 * @generated
	 */
	EList<RTAccess> getAccesses();

	/**
	 * Returns the value of the '<em><b>Owner</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link carisma.rt.models.protocol.RTType#getMembers <em>Members</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owner</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner</em>' container reference.
	 * @see #setOwner(RTType)
	 * @see carisma.rt.models.protocol.ProtocolPackage#getRTMember_Owner()
	 * @see carisma.rt.models.protocol.RTType#getMembers
	 * @model opposite="members" transient="false"
	 * @generated
	 */
	RTType getOwner();

	/**
	 * Sets the value of the '{@link carisma.rt.models.protocol.RTMember#getOwner <em>Owner</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' container reference.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(RTType value);

} // RTMember
