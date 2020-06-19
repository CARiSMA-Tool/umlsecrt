/**
 */
package org.gravity.modisco;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MFlow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gravity.modisco.MFlow#getFlowOwner <em>Flow Owner</em>}</li>
 * </ul>
 *
 * @see org.gravity.modisco.ModiscoPackage#getMFlow()
 * @model
 * @generated
 */
public interface MFlow extends MAbstractFlowElement {
	/**
	 * Returns the value of the '<em><b>Flow Owner</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.gravity.modisco.MAbstractFlowElement#getOwnedFlows <em>Owned Flows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flow Owner</em>' container reference.
	 * @see #setFlowOwner(MAbstractFlowElement)
	 * @see org.gravity.modisco.ModiscoPackage#getMFlow_FlowOwner()
	 * @see org.gravity.modisco.MAbstractFlowElement#getOwnedFlows
	 * @model opposite="ownedFlows" required="true" transient="false"
	 * @generated
	 */
	MAbstractFlowElement getFlowOwner();

	/**
	 * Sets the value of the '{@link org.gravity.modisco.MFlow#getFlowOwner <em>Flow Owner</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flow Owner</em>' container reference.
	 * @see #getFlowOwner()
	 * @generated
	 */
	void setFlowOwner(MAbstractFlowElement value);

} // MFlow
