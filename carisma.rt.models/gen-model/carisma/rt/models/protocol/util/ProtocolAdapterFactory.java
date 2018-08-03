/**
 */
package carisma.rt.models.protocol.util;

import carisma.rt.models.protocol.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see carisma.rt.models.protocol.ProtocolPackage
 * @generated
 */
public class ProtocolAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ProtocolPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProtocolAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ProtocolPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProtocolSwitch<Adapter> modelSwitch =
		new ProtocolSwitch<Adapter>() {
			@Override
			public Adapter caseRTClass(RTClass object) {
				return createRTClassAdapter();
			}
			@Override
			public Adapter caseRTMember(RTMember object) {
				return createRTMemberAdapter();
			}
			@Override
			public Adapter caseRTMethod(RTMethod object) {
				return createRTMethodAdapter();
			}
			@Override
			public Adapter caseRTField(RTField object) {
				return createRTFieldAdapter();
			}
			@Override
			public Adapter caseRTNamedElement(RTNamedElement object) {
				return createRTNamedElementAdapter();
			}
			@Override
			public Adapter caseRTType(RTType object) {
				return createRTTypeAdapter();
			}
			@Override
			public Adapter caseRTProtocol(RTProtocol object) {
				return createRTProtocolAdapter();
			}
			@Override
			public Adapter caseRTAccess(RTAccess object) {
				return createRTAccessAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link carisma.rt.models.protocol.RTClass <em>RT Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see carisma.rt.models.protocol.RTClass
	 * @generated
	 */
	public Adapter createRTClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link carisma.rt.models.protocol.RTMember <em>RT Member</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see carisma.rt.models.protocol.RTMember
	 * @generated
	 */
	public Adapter createRTMemberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link carisma.rt.models.protocol.RTMethod <em>RT Method</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see carisma.rt.models.protocol.RTMethod
	 * @generated
	 */
	public Adapter createRTMethodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link carisma.rt.models.protocol.RTField <em>RT Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see carisma.rt.models.protocol.RTField
	 * @generated
	 */
	public Adapter createRTFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link carisma.rt.models.protocol.RTNamedElement <em>RT Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see carisma.rt.models.protocol.RTNamedElement
	 * @generated
	 */
	public Adapter createRTNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link carisma.rt.models.protocol.RTType <em>RT Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see carisma.rt.models.protocol.RTType
	 * @generated
	 */
	public Adapter createRTTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link carisma.rt.models.protocol.RTProtocol <em>RT Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see carisma.rt.models.protocol.RTProtocol
	 * @generated
	 */
	public Adapter createRTProtocolAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link carisma.rt.models.protocol.RTAccess <em>RT Access</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see carisma.rt.models.protocol.RTAccess
	 * @generated
	 */
	public Adapter createRTAccessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ProtocolAdapterFactory
