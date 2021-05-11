/**
 */
package carisma.rt.models.protocol.util;

import carisma.rt.models.protocol.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see carisma.rt.models.protocol.ProtocolPackage
 * @generated
 */
public class ProtocolSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ProtocolPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProtocolSwitch() {
		if (modelPackage == null) {
			modelPackage = ProtocolPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ProtocolPackage.RT_CLASS: {
				RTClass rtClass = (RTClass)theEObject;
				T result = caseRTClass(rtClass);
				if (result == null) result = caseRTType(rtClass);
				if (result == null) result = caseRTNamedElement(rtClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProtocolPackage.RT_MEMBER: {
				RTMember rtMember = (RTMember)theEObject;
				T result = caseRTMember(rtMember);
				if (result == null) result = caseRTNamedElement(rtMember);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProtocolPackage.RT_METHOD: {
				RTMethod rtMethod = (RTMethod)theEObject;
				T result = caseRTMethod(rtMethod);
				if (result == null) result = caseRTMember(rtMethod);
				if (result == null) result = caseRTNamedElement(rtMethod);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProtocolPackage.RT_FIELD: {
				RTField rtField = (RTField)theEObject;
				T result = caseRTField(rtField);
				if (result == null) result = caseRTMember(rtField);
				if (result == null) result = caseRTNamedElement(rtField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProtocolPackage.RT_NAMED_ELEMENT: {
				RTNamedElement rtNamedElement = (RTNamedElement)theEObject;
				T result = caseRTNamedElement(rtNamedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProtocolPackage.RT_TYPE: {
				RTType rtType = (RTType)theEObject;
				T result = caseRTType(rtType);
				if (result == null) result = caseRTNamedElement(rtType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProtocolPackage.RT_PROTOCOL: {
				RTProtocol rtProtocol = (RTProtocol)theEObject;
				T result = caseRTProtocol(rtProtocol);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProtocolPackage.RT_ACCESS: {
				RTAccess rtAccess = (RTAccess)theEObject;
				T result = caseRTAccess(rtAccess);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RT Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RT Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRTClass(RTClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RT Member</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RT Member</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRTMember(RTMember object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RT Method</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RT Method</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRTMethod(RTMethod object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RT Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RT Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRTField(RTField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RT Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RT Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRTNamedElement(RTNamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RT Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RT Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRTType(RTType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RT Protocol</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RT Protocol</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRTProtocol(RTProtocol object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RT Access</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RT Access</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRTAccess(RTAccess object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ProtocolSwitch
