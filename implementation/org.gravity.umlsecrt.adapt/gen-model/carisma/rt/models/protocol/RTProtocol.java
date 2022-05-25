/**
 */
package carisma.rt.models.protocol;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RT Protocol</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link carisma.rt.models.protocol.RTProtocol#getProgram <em>Program</em>}</li>
 *   <li>{@link carisma.rt.models.protocol.RTProtocol#getLocation <em>Location</em>}</li>
 *   <li>{@link carisma.rt.models.protocol.RTProtocol#getClasses <em>Classes</em>}</li>
 *   <li>{@link carisma.rt.models.protocol.RTProtocol#getFirstAccess <em>First Access</em>}</li>
 *   <li>{@link carisma.rt.models.protocol.RTProtocol#getDate <em>Date</em>}</li>
 * </ul>
 *
 * @see carisma.rt.models.protocol.ProtocolPackage#getRTProtocol()
 * @model
 * @generated
 */
public interface RTProtocol extends EObject {
	/**
	 * Returns the value of the '<em><b>Program</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Program</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Program</em>' attribute.
	 * @see #setProgram(String)
	 * @see carisma.rt.models.protocol.ProtocolPackage#getRTProtocol_Program()
	 * @model
	 * @generated
	 */
	String getProgram();

	/**
	 * Sets the value of the '{@link carisma.rt.models.protocol.RTProtocol#getProgram <em>Program</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Program</em>' attribute.
	 * @see #getProgram()
	 * @generated
	 */
	void setProgram(String value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' attribute.
	 * @see #setLocation(String)
	 * @see carisma.rt.models.protocol.ProtocolPackage#getRTProtocol_Location()
	 * @model
	 * @generated
	 */
	String getLocation();

	/**
	 * Sets the value of the '{@link carisma.rt.models.protocol.RTProtocol#getLocation <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' attribute.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(String value);

	/**
	 * Returns the value of the '<em><b>Classes</b></em>' containment reference list.
	 * The list contents are of type {@link carisma.rt.models.protocol.RTType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classes</em>' containment reference list.
	 * @see carisma.rt.models.protocol.ProtocolPackage#getRTProtocol_Classes()
	 * @model containment="true"
	 * @generated
	 */
	EList<RTType> getClasses();

	/**
	 * Returns the value of the '<em><b>First Access</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First Access</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Access</em>' containment reference.
	 * @see #setFirstAccess(RTAccess)
	 * @see carisma.rt.models.protocol.ProtocolPackage#getRTProtocol_FirstAccess()
	 * @model containment="true"
	 * @generated
	 */
	RTAccess getFirstAccess();

	/**
	 * Sets the value of the '{@link carisma.rt.models.protocol.RTProtocol#getFirstAccess <em>First Access</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Access</em>' containment reference.
	 * @see #getFirstAccess()
	 * @generated
	 */
	void setFirstAccess(RTAccess value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' attribute.
	 * @see #setDate(String)
	 * @see carisma.rt.models.protocol.ProtocolPackage#getRTProtocol_Date()
	 * @model
	 * @generated
	 */
	String getDate();

	/**
	 * Sets the value of the '{@link carisma.rt.models.protocol.RTProtocol#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(String value);

} // RTProtocol
