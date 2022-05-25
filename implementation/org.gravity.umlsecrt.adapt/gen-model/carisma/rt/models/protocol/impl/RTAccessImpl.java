/**
 */
package carisma.rt.models.protocol.impl;

import carisma.rt.models.protocol.ProtocolPackage;
import carisma.rt.models.protocol.RTAccess;
import carisma.rt.models.protocol.RTMember;
import carisma.rt.models.protocol.RTSecurity;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RT Access</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link carisma.rt.models.protocol.impl.RTAccessImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link carisma.rt.models.protocol.impl.RTAccessImpl#getNext <em>Next</em>}</li>
 *   <li>{@link carisma.rt.models.protocol.impl.RTAccessImpl#getSource <em>Source</em>}</li>
 *   <li>{@link carisma.rt.models.protocol.impl.RTAccessImpl#getViolations <em>Violations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RTAccessImpl extends MinimalEObjectImpl.Container implements RTAccess {
	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected RTMember target;

	/**
	 * The cached value of the '{@link #getNext() <em>Next</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNext()
	 * @generated
	 * @ordered
	 */
	protected RTAccess next;

	/**
	 * The cached value of the '{@link #getViolations() <em>Violations</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViolations()
	 * @generated
	 * @ordered
	 */
	protected EList<RTSecurity> violations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RTAccessImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProtocolPackage.Literals.RT_ACCESS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RTMember getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (RTMember)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProtocolPackage.RT_ACCESS__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RTMember basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(RTMember newTarget) {
		RTMember oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProtocolPackage.RT_ACCESS__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RTAccess getNext() {
		if (next != null && next.eIsProxy()) {
			InternalEObject oldNext = (InternalEObject)next;
			next = (RTAccess)eResolveProxy(oldNext);
			if (next != oldNext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProtocolPackage.RT_ACCESS__NEXT, oldNext, next));
			}
		}
		return next;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RTAccess basicGetNext() {
		return next;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNext(RTAccess newNext) {
		RTAccess oldNext = next;
		next = newNext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProtocolPackage.RT_ACCESS__NEXT, oldNext, next));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RTMember getSource() {
		if (eContainerFeatureID() != ProtocolPackage.RT_ACCESS__SOURCE) return null;
		return (RTMember)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(RTMember newSource, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSource, ProtocolPackage.RT_ACCESS__SOURCE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(RTMember newSource) {
		if (newSource != eInternalContainer() || (eContainerFeatureID() != ProtocolPackage.RT_ACCESS__SOURCE && newSource != null)) {
			if (EcoreUtil.isAncestor(this, newSource))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSource != null)
				msgs = ((InternalEObject)newSource).eInverseAdd(this, ProtocolPackage.RT_MEMBER__ACCESSES, RTMember.class, msgs);
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProtocolPackage.RT_ACCESS__SOURCE, newSource, newSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RTSecurity> getViolations() {
		if (violations == null) {
			violations = new EDataTypeUniqueEList<RTSecurity>(RTSecurity.class, this, ProtocolPackage.RT_ACCESS__VIOLATIONS);
		}
		return violations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProtocolPackage.RT_ACCESS__SOURCE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSource((RTMember)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProtocolPackage.RT_ACCESS__SOURCE:
				return basicSetSource(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case ProtocolPackage.RT_ACCESS__SOURCE:
				return eInternalContainer().eInverseRemove(this, ProtocolPackage.RT_MEMBER__ACCESSES, RTMember.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProtocolPackage.RT_ACCESS__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case ProtocolPackage.RT_ACCESS__NEXT:
				if (resolve) return getNext();
				return basicGetNext();
			case ProtocolPackage.RT_ACCESS__SOURCE:
				return getSource();
			case ProtocolPackage.RT_ACCESS__VIOLATIONS:
				return getViolations();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ProtocolPackage.RT_ACCESS__TARGET:
				setTarget((RTMember)newValue);
				return;
			case ProtocolPackage.RT_ACCESS__NEXT:
				setNext((RTAccess)newValue);
				return;
			case ProtocolPackage.RT_ACCESS__SOURCE:
				setSource((RTMember)newValue);
				return;
			case ProtocolPackage.RT_ACCESS__VIOLATIONS:
				getViolations().clear();
				getViolations().addAll((Collection<? extends RTSecurity>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ProtocolPackage.RT_ACCESS__TARGET:
				setTarget((RTMember)null);
				return;
			case ProtocolPackage.RT_ACCESS__NEXT:
				setNext((RTAccess)null);
				return;
			case ProtocolPackage.RT_ACCESS__SOURCE:
				setSource((RTMember)null);
				return;
			case ProtocolPackage.RT_ACCESS__VIOLATIONS:
				getViolations().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ProtocolPackage.RT_ACCESS__TARGET:
				return target != null;
			case ProtocolPackage.RT_ACCESS__NEXT:
				return next != null;
			case ProtocolPackage.RT_ACCESS__SOURCE:
				return getSource() != null;
			case ProtocolPackage.RT_ACCESS__VIOLATIONS:
				return violations != null && !violations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (violations: ");
		result.append(violations);
		result.append(')');
		return result.toString();
	}

} //RTAccessImpl
