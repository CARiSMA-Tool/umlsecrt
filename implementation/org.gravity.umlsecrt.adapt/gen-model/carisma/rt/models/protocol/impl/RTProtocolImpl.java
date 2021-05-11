/**
 */
package carisma.rt.models.protocol.impl;

import carisma.rt.models.protocol.ProtocolPackage;
import carisma.rt.models.protocol.RTAccess;
import carisma.rt.models.protocol.RTProtocol;
import carisma.rt.models.protocol.RTType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RT Protocol</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link carisma.rt.models.protocol.impl.RTProtocolImpl#getProgram <em>Program</em>}</li>
 *   <li>{@link carisma.rt.models.protocol.impl.RTProtocolImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link carisma.rt.models.protocol.impl.RTProtocolImpl#getClasses <em>Classes</em>}</li>
 *   <li>{@link carisma.rt.models.protocol.impl.RTProtocolImpl#getFirstAccess <em>First Access</em>}</li>
 *   <li>{@link carisma.rt.models.protocol.impl.RTProtocolImpl#getDate <em>Date</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RTProtocolImpl extends MinimalEObjectImpl.Container implements RTProtocol {
	/**
	 * The default value of the '{@link #getProgram() <em>Program</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgram()
	 * @generated
	 * @ordered
	 */
	protected static final String PROGRAM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProgram() <em>Program</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgram()
	 * @generated
	 * @ordered
	 */
	protected String program = PROGRAM_EDEFAULT;

	/**
	 * The default value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected String location = LOCATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getClasses() <em>Classes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClasses()
	 * @generated
	 * @ordered
	 */
	protected EList<RTType> classes;

	/**
	 * The cached value of the '{@link #getFirstAccess() <em>First Access</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstAccess()
	 * @generated
	 * @ordered
	 */
	protected RTAccess firstAccess;

	/**
	 * The default value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected static final String DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected String date = DATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RTProtocolImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProtocolPackage.Literals.RT_PROTOCOL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProgram() {
		return program;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProgram(String newProgram) {
		String oldProgram = program;
		program = newProgram;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProtocolPackage.RT_PROTOCOL__PROGRAM, oldProgram, program));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocation(String newLocation) {
		String oldLocation = location;
		location = newLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProtocolPackage.RT_PROTOCOL__LOCATION, oldLocation, location));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RTType> getClasses() {
		if (classes == null) {
			classes = new EObjectContainmentEList<RTType>(RTType.class, this, ProtocolPackage.RT_PROTOCOL__CLASSES);
		}
		return classes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RTAccess getFirstAccess() {
		return firstAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFirstAccess(RTAccess newFirstAccess, NotificationChain msgs) {
		RTAccess oldFirstAccess = firstAccess;
		firstAccess = newFirstAccess;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProtocolPackage.RT_PROTOCOL__FIRST_ACCESS, oldFirstAccess, newFirstAccess);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirstAccess(RTAccess newFirstAccess) {
		if (newFirstAccess != firstAccess) {
			NotificationChain msgs = null;
			if (firstAccess != null)
				msgs = ((InternalEObject)firstAccess).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProtocolPackage.RT_PROTOCOL__FIRST_ACCESS, null, msgs);
			if (newFirstAccess != null)
				msgs = ((InternalEObject)newFirstAccess).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProtocolPackage.RT_PROTOCOL__FIRST_ACCESS, null, msgs);
			msgs = basicSetFirstAccess(newFirstAccess, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProtocolPackage.RT_PROTOCOL__FIRST_ACCESS, newFirstAccess, newFirstAccess));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDate(String newDate) {
		String oldDate = date;
		date = newDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProtocolPackage.RT_PROTOCOL__DATE, oldDate, date));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProtocolPackage.RT_PROTOCOL__CLASSES:
				return ((InternalEList<?>)getClasses()).basicRemove(otherEnd, msgs);
			case ProtocolPackage.RT_PROTOCOL__FIRST_ACCESS:
				return basicSetFirstAccess(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProtocolPackage.RT_PROTOCOL__PROGRAM:
				return getProgram();
			case ProtocolPackage.RT_PROTOCOL__LOCATION:
				return getLocation();
			case ProtocolPackage.RT_PROTOCOL__CLASSES:
				return getClasses();
			case ProtocolPackage.RT_PROTOCOL__FIRST_ACCESS:
				return getFirstAccess();
			case ProtocolPackage.RT_PROTOCOL__DATE:
				return getDate();
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
			case ProtocolPackage.RT_PROTOCOL__PROGRAM:
				setProgram((String)newValue);
				return;
			case ProtocolPackage.RT_PROTOCOL__LOCATION:
				setLocation((String)newValue);
				return;
			case ProtocolPackage.RT_PROTOCOL__CLASSES:
				getClasses().clear();
				getClasses().addAll((Collection<? extends RTType>)newValue);
				return;
			case ProtocolPackage.RT_PROTOCOL__FIRST_ACCESS:
				setFirstAccess((RTAccess)newValue);
				return;
			case ProtocolPackage.RT_PROTOCOL__DATE:
				setDate((String)newValue);
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
			case ProtocolPackage.RT_PROTOCOL__PROGRAM:
				setProgram(PROGRAM_EDEFAULT);
				return;
			case ProtocolPackage.RT_PROTOCOL__LOCATION:
				setLocation(LOCATION_EDEFAULT);
				return;
			case ProtocolPackage.RT_PROTOCOL__CLASSES:
				getClasses().clear();
				return;
			case ProtocolPackage.RT_PROTOCOL__FIRST_ACCESS:
				setFirstAccess((RTAccess)null);
				return;
			case ProtocolPackage.RT_PROTOCOL__DATE:
				setDate(DATE_EDEFAULT);
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
			case ProtocolPackage.RT_PROTOCOL__PROGRAM:
				return PROGRAM_EDEFAULT == null ? program != null : !PROGRAM_EDEFAULT.equals(program);
			case ProtocolPackage.RT_PROTOCOL__LOCATION:
				return LOCATION_EDEFAULT == null ? location != null : !LOCATION_EDEFAULT.equals(location);
			case ProtocolPackage.RT_PROTOCOL__CLASSES:
				return classes != null && !classes.isEmpty();
			case ProtocolPackage.RT_PROTOCOL__FIRST_ACCESS:
				return firstAccess != null;
			case ProtocolPackage.RT_PROTOCOL__DATE:
				return DATE_EDEFAULT == null ? date != null : !DATE_EDEFAULT.equals(date);
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
		result.append(" (program: ");
		result.append(program);
		result.append(", location: ");
		result.append(location);
		result.append(", date: ");
		result.append(date);
		result.append(')');
		return result.toString();
	}

} //RTProtocolImpl
