/**
 */
package carisma.rt.models.protocol.impl;

import carisma.rt.models.protocol.ProtocolPackage;
import carisma.rt.models.protocol.RTAccess;
import carisma.rt.models.protocol.RTMember;

import carisma.rt.models.protocol.RTType;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RT Member</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link carisma.rt.models.protocol.impl.RTMemberImpl#getAccesses <em>Accesses</em>}</li>
 *   <li>{@link carisma.rt.models.protocol.impl.RTMemberImpl#getOwner <em>Owner</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class RTMemberImpl extends RTNamedElementImpl implements RTMember {
	/**
	 * The cached value of the '{@link #getAccesses() <em>Accesses</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccesses()
	 * @generated
	 * @ordered
	 */
	protected EList<RTAccess> accesses;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RTMemberImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProtocolPackage.Literals.RT_MEMBER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RTAccess> getAccesses() {
		if (accesses == null) {
			accesses = new EObjectContainmentWithInverseEList<RTAccess>(RTAccess.class, this, ProtocolPackage.RT_MEMBER__ACCESSES, ProtocolPackage.RT_ACCESS__SOURCE);
		}
		return accesses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RTType getOwner() {
		if (eContainerFeatureID() != ProtocolPackage.RT_MEMBER__OWNER) return null;
		return (RTType)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwner(RTType newOwner, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwner, ProtocolPackage.RT_MEMBER__OWNER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwner(RTType newOwner) {
		if (newOwner != eInternalContainer() || (eContainerFeatureID() != ProtocolPackage.RT_MEMBER__OWNER && newOwner != null)) {
			if (EcoreUtil.isAncestor(this, newOwner))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwner != null)
				msgs = ((InternalEObject)newOwner).eInverseAdd(this, ProtocolPackage.RT_TYPE__MEMBERS, RTType.class, msgs);
			msgs = basicSetOwner(newOwner, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProtocolPackage.RT_MEMBER__OWNER, newOwner, newOwner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProtocolPackage.RT_MEMBER__ACCESSES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAccesses()).basicAdd(otherEnd, msgs);
			case ProtocolPackage.RT_MEMBER__OWNER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwner((RTType)otherEnd, msgs);
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
			case ProtocolPackage.RT_MEMBER__ACCESSES:
				return ((InternalEList<?>)getAccesses()).basicRemove(otherEnd, msgs);
			case ProtocolPackage.RT_MEMBER__OWNER:
				return basicSetOwner(null, msgs);
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
			case ProtocolPackage.RT_MEMBER__OWNER:
				return eInternalContainer().eInverseRemove(this, ProtocolPackage.RT_TYPE__MEMBERS, RTType.class, msgs);
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
			case ProtocolPackage.RT_MEMBER__ACCESSES:
				return getAccesses();
			case ProtocolPackage.RT_MEMBER__OWNER:
				return getOwner();
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
			case ProtocolPackage.RT_MEMBER__ACCESSES:
				getAccesses().clear();
				getAccesses().addAll((Collection<? extends RTAccess>)newValue);
				return;
			case ProtocolPackage.RT_MEMBER__OWNER:
				setOwner((RTType)newValue);
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
			case ProtocolPackage.RT_MEMBER__ACCESSES:
				getAccesses().clear();
				return;
			case ProtocolPackage.RT_MEMBER__OWNER:
				setOwner((RTType)null);
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
			case ProtocolPackage.RT_MEMBER__ACCESSES:
				return accesses != null && !accesses.isEmpty();
			case ProtocolPackage.RT_MEMBER__OWNER:
				return getOwner() != null;
		}
		return super.eIsSet(featureID);
	}

} //RTMemberImpl
