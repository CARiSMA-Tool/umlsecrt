/**
 */
package carisma.rt.models.protocol;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RT Access</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link carisma.rt.models.protocol.RTAccess#getTarget <em>Target</em>}</li>
 *   <li>{@link carisma.rt.models.protocol.RTAccess#getNext <em>Next</em>}</li>
 *   <li>{@link carisma.rt.models.protocol.RTAccess#getSource <em>Source</em>}</li>
 *   <li>{@link carisma.rt.models.protocol.RTAccess#getViolations <em>Violations</em>}</li>
 * </ul>
 *
 * @see carisma.rt.models.protocol.ProtocolPackage#getRTAccess()
 * @model
 * @generated
 */
public interface RTAccess extends EObject {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(RTMember)
	 * @see carisma.rt.models.protocol.ProtocolPackage#getRTAccess_Target()
	 * @model
	 * @generated
	 */
	RTMember getTarget();

	/**
	 * Sets the value of the '{@link carisma.rt.models.protocol.RTAccess#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(RTMember value);

	/**
	 * Returns the value of the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next</em>' reference.
	 * @see #setNext(RTAccess)
	 * @see carisma.rt.models.protocol.ProtocolPackage#getRTAccess_Next()
	 * @model
	 * @generated
	 */
	RTAccess getNext();

	/**
	 * Sets the value of the '{@link carisma.rt.models.protocol.RTAccess#getNext <em>Next</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next</em>' reference.
	 * @see #getNext()
	 * @generated
	 */
	void setNext(RTAccess value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link carisma.rt.models.protocol.RTMember#getAccesses <em>Accesses</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' container reference.
	 * @see #setSource(RTMember)
	 * @see carisma.rt.models.protocol.ProtocolPackage#getRTAccess_Source()
	 * @see carisma.rt.models.protocol.RTMember#getAccesses
	 * @model opposite="accesses" transient="false"
	 * @generated
	 */
	RTMember getSource();

	/**
	 * Sets the value of the '{@link carisma.rt.models.protocol.RTAccess#getSource <em>Source</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' container reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(RTMember value);

	/**
	 * Returns the value of the '<em><b>Violations</b></em>' attribute list.
	 * The list contents are of type {@link carisma.rt.models.protocol.RTSecurity}.
	 * The literals are from the enumeration {@link carisma.rt.models.protocol.RTSecurity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Violations</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Violations</em>' attribute list.
	 * @see carisma.rt.models.protocol.RTSecurity
	 * @see carisma.rt.models.protocol.ProtocolPackage#getRTAccess_Violations()
	 * @model
	 * @generated
	 */
	EList<RTSecurity> getViolations();

} // RTAccess
