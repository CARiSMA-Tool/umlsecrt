/**
 */
package carisma.rt.models.protocol;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see carisma.rt.models.protocol.ProtocolPackage
 * @generated
 */
public interface ProtocolFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ProtocolFactory eINSTANCE = carisma.rt.models.protocol.impl.ProtocolFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>RT Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>RT Class</em>'.
	 * @generated
	 */
	RTClass createRTClass();

	/**
	 * Returns a new object of class '<em>RT Method</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>RT Method</em>'.
	 * @generated
	 */
	RTMethod createRTMethod();

	/**
	 * Returns a new object of class '<em>RT Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>RT Field</em>'.
	 * @generated
	 */
	RTField createRTField();

	/**
	 * Returns a new object of class '<em>RT Protocol</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>RT Protocol</em>'.
	 * @generated
	 */
	RTProtocol createRTProtocol();

	/**
	 * Returns a new object of class '<em>RT Access</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>RT Access</em>'.
	 * @generated
	 */
	RTAccess createRTAccess();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ProtocolPackage getProtocolPackage();

} //ProtocolFactory
