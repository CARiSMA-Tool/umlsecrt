/**
 */
package carisma.rt.models.protocol.impl;

import carisma.rt.models.protocol.ProtocolFactory;
import carisma.rt.models.protocol.ProtocolPackage;
import carisma.rt.models.protocol.RTAccess;
import carisma.rt.models.protocol.RTClass;
import carisma.rt.models.protocol.RTField;
import carisma.rt.models.protocol.RTMember;
import carisma.rt.models.protocol.RTMethod;
import carisma.rt.models.protocol.RTNamedElement;
import carisma.rt.models.protocol.RTProtocol;
import carisma.rt.models.protocol.RTSecurity;
import carisma.rt.models.protocol.RTType;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProtocolPackageImpl extends EPackageImpl implements ProtocolPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rtClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rtMemberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rtMethodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rtFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rtNamedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rtTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rtProtocolEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rtAccessEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum rtSecurityEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see carisma.rt.models.protocol.ProtocolPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ProtocolPackageImpl() {
		super(eNS_URI, ProtocolFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link ProtocolPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ProtocolPackage init() {
		if (isInited) return (ProtocolPackage)EPackage.Registry.INSTANCE.getEPackage(ProtocolPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredProtocolPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ProtocolPackageImpl theProtocolPackage = registeredProtocolPackage instanceof ProtocolPackageImpl ? (ProtocolPackageImpl)registeredProtocolPackage : new ProtocolPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theProtocolPackage.createPackageContents();

		// Initialize created meta-data
		theProtocolPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theProtocolPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ProtocolPackage.eNS_URI, theProtocolPackage);
		return theProtocolPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRTClass() {
		return rtClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRTMember() {
		return rtMemberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRTMember_Accesses() {
		return (EReference)rtMemberEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRTMember_Owner() {
		return (EReference)rtMemberEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRTMethod() {
		return rtMethodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRTField() {
		return rtFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRTNamedElement() {
		return rtNamedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRTNamedElement_Name() {
		return (EAttribute)rtNamedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRTType() {
		return rtTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRTType_Path() {
		return (EAttribute)rtTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRTType_Members() {
		return (EReference)rtTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRTProtocol() {
		return rtProtocolEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRTProtocol_Program() {
		return (EAttribute)rtProtocolEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRTProtocol_Location() {
		return (EAttribute)rtProtocolEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRTProtocol_Classes() {
		return (EReference)rtProtocolEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRTProtocol_FirstAccess() {
		return (EReference)rtProtocolEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRTProtocol_Date() {
		return (EAttribute)rtProtocolEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRTAccess() {
		return rtAccessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRTAccess_Target() {
		return (EReference)rtAccessEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRTAccess_Next() {
		return (EReference)rtAccessEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRTAccess_Source() {
		return (EReference)rtAccessEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRTAccess_Violations() {
		return (EAttribute)rtAccessEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRTSecurity() {
		return rtSecurityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProtocolFactory getProtocolFactory() {
		return (ProtocolFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		rtClassEClass = createEClass(RT_CLASS);

		rtMemberEClass = createEClass(RT_MEMBER);
		createEReference(rtMemberEClass, RT_MEMBER__ACCESSES);
		createEReference(rtMemberEClass, RT_MEMBER__OWNER);

		rtMethodEClass = createEClass(RT_METHOD);

		rtFieldEClass = createEClass(RT_FIELD);

		rtNamedElementEClass = createEClass(RT_NAMED_ELEMENT);
		createEAttribute(rtNamedElementEClass, RT_NAMED_ELEMENT__NAME);

		rtTypeEClass = createEClass(RT_TYPE);
		createEAttribute(rtTypeEClass, RT_TYPE__PATH);
		createEReference(rtTypeEClass, RT_TYPE__MEMBERS);

		rtProtocolEClass = createEClass(RT_PROTOCOL);
		createEAttribute(rtProtocolEClass, RT_PROTOCOL__PROGRAM);
		createEAttribute(rtProtocolEClass, RT_PROTOCOL__LOCATION);
		createEReference(rtProtocolEClass, RT_PROTOCOL__CLASSES);
		createEReference(rtProtocolEClass, RT_PROTOCOL__FIRST_ACCESS);
		createEAttribute(rtProtocolEClass, RT_PROTOCOL__DATE);

		rtAccessEClass = createEClass(RT_ACCESS);
		createEReference(rtAccessEClass, RT_ACCESS__TARGET);
		createEReference(rtAccessEClass, RT_ACCESS__NEXT);
		createEReference(rtAccessEClass, RT_ACCESS__SOURCE);
		createEAttribute(rtAccessEClass, RT_ACCESS__VIOLATIONS);

		// Create enums
		rtSecurityEEnum = createEEnum(RT_SECURITY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		rtClassEClass.getESuperTypes().add(this.getRTType());
		rtMemberEClass.getESuperTypes().add(this.getRTNamedElement());
		rtMethodEClass.getESuperTypes().add(this.getRTMember());
		rtFieldEClass.getESuperTypes().add(this.getRTMember());
		rtTypeEClass.getESuperTypes().add(this.getRTNamedElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(rtClassEClass, RTClass.class, "RTClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(rtMemberEClass, RTMember.class, "RTMember", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRTMember_Accesses(), this.getRTAccess(), this.getRTAccess_Source(), "accesses", null, 0, -1, RTMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRTMember_Owner(), this.getRTType(), this.getRTType_Members(), "owner", null, 0, 1, RTMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rtMethodEClass, RTMethod.class, "RTMethod", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(rtFieldEClass, RTField.class, "RTField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(rtNamedElementEClass, RTNamedElement.class, "RTNamedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRTNamedElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, RTNamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rtTypeEClass, RTType.class, "RTType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRTType_Path(), ecorePackage.getEString(), "path", null, 0, 1, RTType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRTType_Members(), this.getRTMember(), this.getRTMember_Owner(), "members", null, 0, -1, RTType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rtProtocolEClass, RTProtocol.class, "RTProtocol", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRTProtocol_Program(), ecorePackage.getEString(), "program", null, 0, 1, RTProtocol.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRTProtocol_Location(), ecorePackage.getEString(), "location", null, 0, 1, RTProtocol.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRTProtocol_Classes(), this.getRTType(), null, "classes", null, 0, -1, RTProtocol.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRTProtocol_FirstAccess(), this.getRTAccess(), null, "firstAccess", null, 0, 1, RTProtocol.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRTProtocol_Date(), ecorePackage.getEString(), "date", null, 0, 1, RTProtocol.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rtAccessEClass, RTAccess.class, "RTAccess", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRTAccess_Target(), this.getRTMember(), null, "target", null, 0, 1, RTAccess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRTAccess_Next(), this.getRTAccess(), null, "next", null, 0, 1, RTAccess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRTAccess_Source(), this.getRTMember(), this.getRTMember_Accesses(), "source", null, 0, 1, RTAccess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRTAccess_Violations(), this.getRTSecurity(), "violations", null, 0, -1, RTAccess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(rtSecurityEEnum, RTSecurity.class, "RTSecurity");
		addEEnumLiteral(rtSecurityEEnum, RTSecurity.RT_SECRECY);
		addEEnumLiteral(rtSecurityEEnum, RTSecurity.RT_INTEGRITY);

		// Create resource
		createResource(eNS_URI);
	}

} //ProtocolPackageImpl
