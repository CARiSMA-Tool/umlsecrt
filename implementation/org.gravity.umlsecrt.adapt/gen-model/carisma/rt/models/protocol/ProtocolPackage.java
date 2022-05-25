/**
 */
package carisma.rt.models.protocol;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see carisma.rt.models.protocol.ProtocolFactory
 * @model kind="package"
 * @generated
 */
public interface ProtocolPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "protocol";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/plugin/carisma.rt.models/model/UMLsecRtProtocol.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "carisma.rt.models.protocol";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ProtocolPackage eINSTANCE = carisma.rt.models.protocol.impl.ProtocolPackageImpl.init();

	/**
	 * The meta object id for the '{@link carisma.rt.models.protocol.impl.RTClassImpl <em>RT Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see carisma.rt.models.protocol.impl.RTClassImpl
	 * @see carisma.rt.models.protocol.impl.ProtocolPackageImpl#getRTClass()
	 * @generated
	 */
	int RT_CLASS = 0;

	/**
	 * The meta object id for the '{@link carisma.rt.models.protocol.impl.RTNamedElementImpl <em>RT Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see carisma.rt.models.protocol.impl.RTNamedElementImpl
	 * @see carisma.rt.models.protocol.impl.ProtocolPackageImpl#getRTNamedElement()
	 * @generated
	 */
	int RT_NAMED_ELEMENT = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RT_NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>RT Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RT_NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>RT Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RT_NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link carisma.rt.models.protocol.impl.RTMemberImpl <em>RT Member</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see carisma.rt.models.protocol.impl.RTMemberImpl
	 * @see carisma.rt.models.protocol.impl.ProtocolPackageImpl#getRTMember()
	 * @generated
	 */
	int RT_MEMBER = 1;

	/**
	 * The meta object id for the '{@link carisma.rt.models.protocol.impl.RTMethodImpl <em>RT Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see carisma.rt.models.protocol.impl.RTMethodImpl
	 * @see carisma.rt.models.protocol.impl.ProtocolPackageImpl#getRTMethod()
	 * @generated
	 */
	int RT_METHOD = 2;

	/**
	 * The meta object id for the '{@link carisma.rt.models.protocol.impl.RTFieldImpl <em>RT Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see carisma.rt.models.protocol.impl.RTFieldImpl
	 * @see carisma.rt.models.protocol.impl.ProtocolPackageImpl#getRTField()
	 * @generated
	 */
	int RT_FIELD = 3;

	/**
	 * The meta object id for the '{@link carisma.rt.models.protocol.impl.RTTypeImpl <em>RT Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see carisma.rt.models.protocol.impl.RTTypeImpl
	 * @see carisma.rt.models.protocol.impl.ProtocolPackageImpl#getRTType()
	 * @generated
	 */
	int RT_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RT_TYPE__NAME = RT_NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RT_TYPE__PATH = RT_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Members</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RT_TYPE__MEMBERS = RT_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>RT Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RT_TYPE_FEATURE_COUNT = RT_NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>RT Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RT_TYPE_OPERATION_COUNT = RT_NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RT_CLASS__NAME = RT_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RT_CLASS__PATH = RT_TYPE__PATH;

	/**
	 * The feature id for the '<em><b>Members</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RT_CLASS__MEMBERS = RT_TYPE__MEMBERS;

	/**
	 * The number of structural features of the '<em>RT Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RT_CLASS_FEATURE_COUNT = RT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>RT Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RT_CLASS_OPERATION_COUNT = RT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RT_MEMBER__NAME = RT_NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Accesses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RT_MEMBER__ACCESSES = RT_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RT_MEMBER__OWNER = RT_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>RT Member</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RT_MEMBER_FEATURE_COUNT = RT_NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>RT Member</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RT_MEMBER_OPERATION_COUNT = RT_NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RT_METHOD__NAME = RT_MEMBER__NAME;

	/**
	 * The feature id for the '<em><b>Accesses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RT_METHOD__ACCESSES = RT_MEMBER__ACCESSES;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RT_METHOD__OWNER = RT_MEMBER__OWNER;

	/**
	 * The number of structural features of the '<em>RT Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RT_METHOD_FEATURE_COUNT = RT_MEMBER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>RT Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RT_METHOD_OPERATION_COUNT = RT_MEMBER_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RT_FIELD__NAME = RT_MEMBER__NAME;

	/**
	 * The feature id for the '<em><b>Accesses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RT_FIELD__ACCESSES = RT_MEMBER__ACCESSES;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RT_FIELD__OWNER = RT_MEMBER__OWNER;

	/**
	 * The number of structural features of the '<em>RT Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RT_FIELD_FEATURE_COUNT = RT_MEMBER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>RT Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RT_FIELD_OPERATION_COUNT = RT_MEMBER_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link carisma.rt.models.protocol.impl.RTProtocolImpl <em>RT Protocol</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see carisma.rt.models.protocol.impl.RTProtocolImpl
	 * @see carisma.rt.models.protocol.impl.ProtocolPackageImpl#getRTProtocol()
	 * @generated
	 */
	int RT_PROTOCOL = 6;

	/**
	 * The feature id for the '<em><b>Program</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RT_PROTOCOL__PROGRAM = 0;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RT_PROTOCOL__LOCATION = 1;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RT_PROTOCOL__CLASSES = 2;

	/**
	 * The feature id for the '<em><b>First Access</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RT_PROTOCOL__FIRST_ACCESS = 3;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RT_PROTOCOL__DATE = 4;

	/**
	 * The number of structural features of the '<em>RT Protocol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RT_PROTOCOL_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>RT Protocol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RT_PROTOCOL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link carisma.rt.models.protocol.impl.RTAccessImpl <em>RT Access</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see carisma.rt.models.protocol.impl.RTAccessImpl
	 * @see carisma.rt.models.protocol.impl.ProtocolPackageImpl#getRTAccess()
	 * @generated
	 */
	int RT_ACCESS = 7;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RT_ACCESS__TARGET = 0;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RT_ACCESS__NEXT = 1;

	/**
	 * The feature id for the '<em><b>Source</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RT_ACCESS__SOURCE = 2;

	/**
	 * The feature id for the '<em><b>Violations</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RT_ACCESS__VIOLATIONS = 3;

	/**
	 * The number of structural features of the '<em>RT Access</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RT_ACCESS_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>RT Access</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RT_ACCESS_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link carisma.rt.models.protocol.RTSecurity <em>RT Security</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see carisma.rt.models.protocol.RTSecurity
	 * @see carisma.rt.models.protocol.impl.ProtocolPackageImpl#getRTSecurity()
	 * @generated
	 */
	int RT_SECURITY = 8;


	/**
	 * Returns the meta object for class '{@link carisma.rt.models.protocol.RTClass <em>RT Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RT Class</em>'.
	 * @see carisma.rt.models.protocol.RTClass
	 * @generated
	 */
	EClass getRTClass();

	/**
	 * Returns the meta object for class '{@link carisma.rt.models.protocol.RTMember <em>RT Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RT Member</em>'.
	 * @see carisma.rt.models.protocol.RTMember
	 * @generated
	 */
	EClass getRTMember();

	/**
	 * Returns the meta object for the containment reference list '{@link carisma.rt.models.protocol.RTMember#getAccesses <em>Accesses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Accesses</em>'.
	 * @see carisma.rt.models.protocol.RTMember#getAccesses()
	 * @see #getRTMember()
	 * @generated
	 */
	EReference getRTMember_Accesses();

	/**
	 * Returns the meta object for the container reference '{@link carisma.rt.models.protocol.RTMember#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owner</em>'.
	 * @see carisma.rt.models.protocol.RTMember#getOwner()
	 * @see #getRTMember()
	 * @generated
	 */
	EReference getRTMember_Owner();

	/**
	 * Returns the meta object for class '{@link carisma.rt.models.protocol.RTMethod <em>RT Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RT Method</em>'.
	 * @see carisma.rt.models.protocol.RTMethod
	 * @generated
	 */
	EClass getRTMethod();

	/**
	 * Returns the meta object for class '{@link carisma.rt.models.protocol.RTField <em>RT Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RT Field</em>'.
	 * @see carisma.rt.models.protocol.RTField
	 * @generated
	 */
	EClass getRTField();

	/**
	 * Returns the meta object for class '{@link carisma.rt.models.protocol.RTNamedElement <em>RT Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RT Named Element</em>'.
	 * @see carisma.rt.models.protocol.RTNamedElement
	 * @generated
	 */
	EClass getRTNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link carisma.rt.models.protocol.RTNamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see carisma.rt.models.protocol.RTNamedElement#getName()
	 * @see #getRTNamedElement()
	 * @generated
	 */
	EAttribute getRTNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link carisma.rt.models.protocol.RTType <em>RT Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RT Type</em>'.
	 * @see carisma.rt.models.protocol.RTType
	 * @generated
	 */
	EClass getRTType();

	/**
	 * Returns the meta object for the attribute '{@link carisma.rt.models.protocol.RTType#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see carisma.rt.models.protocol.RTType#getPath()
	 * @see #getRTType()
	 * @generated
	 */
	EAttribute getRTType_Path();

	/**
	 * Returns the meta object for the containment reference list '{@link carisma.rt.models.protocol.RTType#getMembers <em>Members</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Members</em>'.
	 * @see carisma.rt.models.protocol.RTType#getMembers()
	 * @see #getRTType()
	 * @generated
	 */
	EReference getRTType_Members();

	/**
	 * Returns the meta object for class '{@link carisma.rt.models.protocol.RTProtocol <em>RT Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RT Protocol</em>'.
	 * @see carisma.rt.models.protocol.RTProtocol
	 * @generated
	 */
	EClass getRTProtocol();

	/**
	 * Returns the meta object for the attribute '{@link carisma.rt.models.protocol.RTProtocol#getProgram <em>Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Program</em>'.
	 * @see carisma.rt.models.protocol.RTProtocol#getProgram()
	 * @see #getRTProtocol()
	 * @generated
	 */
	EAttribute getRTProtocol_Program();

	/**
	 * Returns the meta object for the attribute '{@link carisma.rt.models.protocol.RTProtocol#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see carisma.rt.models.protocol.RTProtocol#getLocation()
	 * @see #getRTProtocol()
	 * @generated
	 */
	EAttribute getRTProtocol_Location();

	/**
	 * Returns the meta object for the containment reference list '{@link carisma.rt.models.protocol.RTProtocol#getClasses <em>Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Classes</em>'.
	 * @see carisma.rt.models.protocol.RTProtocol#getClasses()
	 * @see #getRTProtocol()
	 * @generated
	 */
	EReference getRTProtocol_Classes();

	/**
	 * Returns the meta object for the containment reference '{@link carisma.rt.models.protocol.RTProtocol#getFirstAccess <em>First Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>First Access</em>'.
	 * @see carisma.rt.models.protocol.RTProtocol#getFirstAccess()
	 * @see #getRTProtocol()
	 * @generated
	 */
	EReference getRTProtocol_FirstAccess();

	/**
	 * Returns the meta object for the attribute '{@link carisma.rt.models.protocol.RTProtocol#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see carisma.rt.models.protocol.RTProtocol#getDate()
	 * @see #getRTProtocol()
	 * @generated
	 */
	EAttribute getRTProtocol_Date();

	/**
	 * Returns the meta object for class '{@link carisma.rt.models.protocol.RTAccess <em>RT Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RT Access</em>'.
	 * @see carisma.rt.models.protocol.RTAccess
	 * @generated
	 */
	EClass getRTAccess();

	/**
	 * Returns the meta object for the reference '{@link carisma.rt.models.protocol.RTAccess#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see carisma.rt.models.protocol.RTAccess#getTarget()
	 * @see #getRTAccess()
	 * @generated
	 */
	EReference getRTAccess_Target();

	/**
	 * Returns the meta object for the reference '{@link carisma.rt.models.protocol.RTAccess#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Next</em>'.
	 * @see carisma.rt.models.protocol.RTAccess#getNext()
	 * @see #getRTAccess()
	 * @generated
	 */
	EReference getRTAccess_Next();

	/**
	 * Returns the meta object for the container reference '{@link carisma.rt.models.protocol.RTAccess#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Source</em>'.
	 * @see carisma.rt.models.protocol.RTAccess#getSource()
	 * @see #getRTAccess()
	 * @generated
	 */
	EReference getRTAccess_Source();

	/**
	 * Returns the meta object for the attribute list '{@link carisma.rt.models.protocol.RTAccess#getViolations <em>Violations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Violations</em>'.
	 * @see carisma.rt.models.protocol.RTAccess#getViolations()
	 * @see #getRTAccess()
	 * @generated
	 */
	EAttribute getRTAccess_Violations();

	/**
	 * Returns the meta object for enum '{@link carisma.rt.models.protocol.RTSecurity <em>RT Security</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>RT Security</em>'.
	 * @see carisma.rt.models.protocol.RTSecurity
	 * @generated
	 */
	EEnum getRTSecurity();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ProtocolFactory getProtocolFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link carisma.rt.models.protocol.impl.RTClassImpl <em>RT Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see carisma.rt.models.protocol.impl.RTClassImpl
		 * @see carisma.rt.models.protocol.impl.ProtocolPackageImpl#getRTClass()
		 * @generated
		 */
		EClass RT_CLASS = eINSTANCE.getRTClass();

		/**
		 * The meta object literal for the '{@link carisma.rt.models.protocol.impl.RTMemberImpl <em>RT Member</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see carisma.rt.models.protocol.impl.RTMemberImpl
		 * @see carisma.rt.models.protocol.impl.ProtocolPackageImpl#getRTMember()
		 * @generated
		 */
		EClass RT_MEMBER = eINSTANCE.getRTMember();

		/**
		 * The meta object literal for the '<em><b>Accesses</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RT_MEMBER__ACCESSES = eINSTANCE.getRTMember_Accesses();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RT_MEMBER__OWNER = eINSTANCE.getRTMember_Owner();

		/**
		 * The meta object literal for the '{@link carisma.rt.models.protocol.impl.RTMethodImpl <em>RT Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see carisma.rt.models.protocol.impl.RTMethodImpl
		 * @see carisma.rt.models.protocol.impl.ProtocolPackageImpl#getRTMethod()
		 * @generated
		 */
		EClass RT_METHOD = eINSTANCE.getRTMethod();

		/**
		 * The meta object literal for the '{@link carisma.rt.models.protocol.impl.RTFieldImpl <em>RT Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see carisma.rt.models.protocol.impl.RTFieldImpl
		 * @see carisma.rt.models.protocol.impl.ProtocolPackageImpl#getRTField()
		 * @generated
		 */
		EClass RT_FIELD = eINSTANCE.getRTField();

		/**
		 * The meta object literal for the '{@link carisma.rt.models.protocol.impl.RTNamedElementImpl <em>RT Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see carisma.rt.models.protocol.impl.RTNamedElementImpl
		 * @see carisma.rt.models.protocol.impl.ProtocolPackageImpl#getRTNamedElement()
		 * @generated
		 */
		EClass RT_NAMED_ELEMENT = eINSTANCE.getRTNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RT_NAMED_ELEMENT__NAME = eINSTANCE.getRTNamedElement_Name();

		/**
		 * The meta object literal for the '{@link carisma.rt.models.protocol.impl.RTTypeImpl <em>RT Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see carisma.rt.models.protocol.impl.RTTypeImpl
		 * @see carisma.rt.models.protocol.impl.ProtocolPackageImpl#getRTType()
		 * @generated
		 */
		EClass RT_TYPE = eINSTANCE.getRTType();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RT_TYPE__PATH = eINSTANCE.getRTType_Path();

		/**
		 * The meta object literal for the '<em><b>Members</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RT_TYPE__MEMBERS = eINSTANCE.getRTType_Members();

		/**
		 * The meta object literal for the '{@link carisma.rt.models.protocol.impl.RTProtocolImpl <em>RT Protocol</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see carisma.rt.models.protocol.impl.RTProtocolImpl
		 * @see carisma.rt.models.protocol.impl.ProtocolPackageImpl#getRTProtocol()
		 * @generated
		 */
		EClass RT_PROTOCOL = eINSTANCE.getRTProtocol();

		/**
		 * The meta object literal for the '<em><b>Program</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RT_PROTOCOL__PROGRAM = eINSTANCE.getRTProtocol_Program();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RT_PROTOCOL__LOCATION = eINSTANCE.getRTProtocol_Location();

		/**
		 * The meta object literal for the '<em><b>Classes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RT_PROTOCOL__CLASSES = eINSTANCE.getRTProtocol_Classes();

		/**
		 * The meta object literal for the '<em><b>First Access</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RT_PROTOCOL__FIRST_ACCESS = eINSTANCE.getRTProtocol_FirstAccess();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RT_PROTOCOL__DATE = eINSTANCE.getRTProtocol_Date();

		/**
		 * The meta object literal for the '{@link carisma.rt.models.protocol.impl.RTAccessImpl <em>RT Access</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see carisma.rt.models.protocol.impl.RTAccessImpl
		 * @see carisma.rt.models.protocol.impl.ProtocolPackageImpl#getRTAccess()
		 * @generated
		 */
		EClass RT_ACCESS = eINSTANCE.getRTAccess();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RT_ACCESS__TARGET = eINSTANCE.getRTAccess_Target();

		/**
		 * The meta object literal for the '<em><b>Next</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RT_ACCESS__NEXT = eINSTANCE.getRTAccess_Next();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RT_ACCESS__SOURCE = eINSTANCE.getRTAccess_Source();

		/**
		 * The meta object literal for the '<em><b>Violations</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RT_ACCESS__VIOLATIONS = eINSTANCE.getRTAccess_Violations();

		/**
		 * The meta object literal for the '{@link carisma.rt.models.protocol.RTSecurity <em>RT Security</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see carisma.rt.models.protocol.RTSecurity
		 * @see carisma.rt.models.protocol.impl.ProtocolPackageImpl#getRTSecurity()
		 * @generated
		 */
		EEnum RT_SECURITY = eINSTANCE.getRTSecurity();

	}

} //ProtocolPackage
