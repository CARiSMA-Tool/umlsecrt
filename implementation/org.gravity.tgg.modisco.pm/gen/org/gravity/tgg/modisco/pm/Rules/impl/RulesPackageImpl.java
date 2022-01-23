/**
 */
package org.gravity.tgg.modisco.pm.Rules.impl;

import MocaTree.MocaTreePackage;

import SDMLanguage.SDMLanguagePackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.modisco.java.emf.JavaPackage;

import org.gravity.modisco.ModiscoPackage;

import org.gravity.tgg.modisco.pm.PmPackage;

import org.gravity.tgg.modisco.pm.Rules.RulesFactory;
import org.gravity.tgg.modisco.pm.Rules.RulesPackage;

import org.gravity.tgg.modisco.pm.impl.PmPackageImpl;

import org.gravity.typegraph.basic.BasicPackage;

import org.moflon.tgg.language.LanguagePackage;

import org.moflon.tgg.runtime.RuntimePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RulesPackageImpl extends EPackageImpl implements RulesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotationMemberValueClassArrayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfaceExtendsInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotationMemberValueAnnotationArrayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textAnnotationsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotationMemberValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classInPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constructorInvocationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotationTypeInAnonymousEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass syntethicMethodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fieldDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass superMethodInvocationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumInPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typesOrphanedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkDefinitionToAnonymousEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fieldAccessReadWriteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classInnerClassMemberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primitiveType_AbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass initializerInAnonymousEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass initializerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfaceInAnonymousEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotationMemberValueBooleanArrayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass packageToPGPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subPackageToPGPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass methodDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass methodSignatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass anonymousClassInAnonymousEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass anonymousClassTypeInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfaceInPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unresolvedMethodDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classImplementsPatrameterizedInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nestedClassInTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass memberInEnumVisibilityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractMethodInvocationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fieldNameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableDeclarationFragmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primitiveTypeIsByteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass memberInClassVisibilityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotationMemberValueStringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass methodParameterLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fieldAccessEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotationMemberValueNumberArrayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass methodInvocationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeNestedInType_AbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkDefinitionToTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primitiveTypeIsShortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primitiveTypeIsDoubleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass methodInvocationStaticTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterizedTypeToTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotationMemberValueBooleanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass methodOverridingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelToPgEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumInAnonymousEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fieldAccessReadEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotationTypeAccessOnBodyDeclEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass superConstructorInvocationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotationMemberValueNumberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arrayTypeToTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classInnerMemberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unresolvedTypeDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classInAnonymousEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fieldSignatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass anonymousClassTypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass methodParameterLinkFirstEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataFlowInEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractAnnotationTypeAccessEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classExtendsClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotationTypeAccessOnSelfEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass memberInAnnotationVisibilityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primitiveTypesIsVoidEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass methodInvocationTargetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primitiveTypeIsFloatEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotationTypeInPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primitiveTypeIsCharEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeInPackage_AbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotationTypeAccessOnAnnotationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primitiveTypeIsBooleanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataFlowOutEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotationMemberValueArrayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass methodParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nestedEnumInTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classImplementsInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfaceMemberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass anonymousClassTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass anonymousClassInTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotationMemberKeyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fieldAccessWriteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass initializerInTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotationTypeNestedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeNestedInAnonymous_AbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotationMemberValueStringArrayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotationMemberValueClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass anonymousClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constructorDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumConstantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classInstanceCreationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arrayInitializerIgnoreExpressionsEdgeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotationMemberValueAnnotationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typesVisibilityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractMethodDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primitiveTypeIsLongEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nestedInterfaceInTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flowNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primitiveTypeIsIntEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classImplementsInterface_AbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classInnerAnonClassMemberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass methodNameEClass = null;

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
	 * @see org.gravity.tgg.modisco.pm.Rules.RulesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RulesPackageImpl() {
		super(eNS_URI, RulesFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link RulesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @generated
	 */
	public static RulesPackage init() {
		if (isInited)
			return (RulesPackage) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredRulesPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		RulesPackageImpl theRulesPackage = registeredRulesPackage instanceof RulesPackageImpl
				? (RulesPackageImpl) registeredRulesPackage
				: new RulesPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		ModiscoPackage.eINSTANCE.eClass();
		BasicPackage.eINSTANCE.eClass();
		JavaPackage.eINSTANCE.eClass();
		RuntimePackage.eINSTANCE.eClass();
		LanguagePackage.eINSTANCE.eClass();
		SDMLanguagePackage.eINSTANCE.eClass();
		MocaTreePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(PmPackage.eNS_URI);
		PmPackageImpl thePmPackage = (PmPackageImpl) (registeredPackage instanceof PmPackageImpl ? registeredPackage
				: PmPackage.eINSTANCE);

		// Load packages
		thePmPackage.loadPackage();

		// Fix loaded packages
		theRulesPackage.fixPackageContents();
		thePmPackage.fixPackageContents();

		// Mark meta-data to indicate it can't be changed
		theRulesPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RulesPackage.eNS_URI, theRulesPackage);
		return theRulesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnnotationMemberValueClassArray() {
		if (annotationMemberValueClassArrayEClass == null) {
			annotationMemberValueClassArrayEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(RulesPackage.eNS_URI).getEClassifiers().get(0);
		}
		return annotationMemberValueClassArrayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueClassArray__IsAppropriate_FWD__Match_Annotation_TypeAccess_AnnotationMemberValuePair_ArrayInitializer_TypeLiteral_Type_BodyDeclaration() {
		return getAnnotationMemberValueClassArray().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueClassArray__Perform_FWD__IsApplicableMatch() {
		return getAnnotationMemberValueClassArray().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueClassArray__IsApplicable_FWD__Match() {
		return getAnnotationMemberValueClassArray().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueClassArray__RegisterObjectsToMatch_FWD__Match_Annotation_TypeAccess_AnnotationMemberValuePair_ArrayInitializer_TypeLiteral_Type_BodyDeclaration() {
		return getAnnotationMemberValueClassArray().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueClassArray__IsAppropriate_solveCsp_FWD__Match_Annotation_TypeAccess_AnnotationMemberValuePair_ArrayInitializer_TypeLiteral_Type_BodyDeclaration() {
		return getAnnotationMemberValueClassArray().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueClassArray__IsAppropriate_checkCsp_FWD__CSP() {
		return getAnnotationMemberValueClassArray().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueClassArray__IsApplicable_solveCsp_FWD__IsApplicableMatch_Annotation_TypeAccess_AnnotationMemberValuePair_TypeToTAbstractType_TAbstractType_ArrayInitializer_TypeLiteral_Type_AnnotationMemberValuePairToTAnnotationValue_BodyDeclaration_TAnnotationValue() {
		return getAnnotationMemberValueClassArray().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueClassArray__IsApplicable_checkCsp_FWD__CSP() {
		return getAnnotationMemberValueClassArray().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueClassArray__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getAnnotationMemberValueClassArray().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueClassArray__CheckTypes_FWD__Match() {
		return getAnnotationMemberValueClassArray().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueClassArray__IsAppropriate_BWD__Match_TAbstractType_TClassNode_TAnnotationValue() {
		return getAnnotationMemberValueClassArray().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueClassArray__Perform_BWD__IsApplicableMatch() {
		return getAnnotationMemberValueClassArray().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueClassArray__IsApplicable_BWD__Match() {
		return getAnnotationMemberValueClassArray().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueClassArray__RegisterObjectsToMatch_BWD__Match_TAbstractType_TClassNode_TAnnotationValue() {
		return getAnnotationMemberValueClassArray().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueClassArray__IsAppropriate_solveCsp_BWD__Match_TAbstractType_TClassNode_TAnnotationValue() {
		return getAnnotationMemberValueClassArray().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueClassArray__IsAppropriate_checkCsp_BWD__CSP() {
		return getAnnotationMemberValueClassArray().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueClassArray__IsApplicable_solveCsp_BWD__IsApplicableMatch_Annotation_AnnotationMemberValuePair_TypeToTAbstractType_TAbstractType_TClassNode_Type_AnnotationMemberValuePairToTAnnotationValue_BodyDeclaration_TAnnotationValue() {
		return getAnnotationMemberValueClassArray().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueClassArray__IsApplicable_checkCsp_BWD__CSP() {
		return getAnnotationMemberValueClassArray().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueClassArray__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getAnnotationMemberValueClassArray().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueClassArray__CheckTypes_BWD__Match() {
		return getAnnotationMemberValueClassArray().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueClassArray__IsAppropriate_BWD_EMoflonEdge_0__EMoflonEdge() {
		return getAnnotationMemberValueClassArray().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueClassArray__IsAppropriate_FWD_EMoflonEdge_0__EMoflonEdge() {
		return getAnnotationMemberValueClassArray().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueClassArray__CheckAttributes_FWD__TripleMatch() {
		return getAnnotationMemberValueClassArray().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueClassArray__CheckAttributes_BWD__TripleMatch() {
		return getAnnotationMemberValueClassArray().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueClassArray__IsApplicable_CC__Match_Match() {
		return getAnnotationMemberValueClassArray().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueClassArray__IsApplicable_solveCsp_CC__Annotation_TypeAccess_AnnotationMemberValuePair_TAbstractType_ArrayInitializer_TClassNode_TypeLiteral_Type_BodyDeclaration_TAnnotationValue_Match_Match() {
		return getAnnotationMemberValueClassArray().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueClassArray__IsApplicable_checkCsp_CC__CSP() {
		return getAnnotationMemberValueClassArray().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueClassArray__CheckDEC_FWD__Annotation_TypeAccess_AnnotationMemberValuePair_ArrayInitializer_TypeLiteral_Type_BodyDeclaration() {
		return getAnnotationMemberValueClassArray().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueClassArray__CheckDEC_BWD__TAbstractType_TClassNode_TAnnotationValue() {
		return getAnnotationMemberValueClassArray().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueClassArray__GenerateModel__RuleEntryContainer_AnnotationMemberValuePairToTAnnotationValue_TypeToTAbstractType() {
		return getAnnotationMemberValueClassArray().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueClassArray__GenerateModel_solveCsp_BWD__IsApplicableMatch_Annotation_AnnotationMemberValuePair_TypeToTAbstractType_TAbstractType_Type_AnnotationMemberValuePairToTAnnotationValue_BodyDeclaration_TAnnotationValue_ModelgeneratorRuleResult() {
		return getAnnotationMemberValueClassArray().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueClassArray__GenerateModel_checkCsp_BWD__CSP() {
		return getAnnotationMemberValueClassArray().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInterfaceExtendsInterface() {
		if (interfaceExtendsInterfaceEClass == null) {
			interfaceExtendsInterfaceEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(1);
		}
		return interfaceExtendsInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterfaceExtendsInterface__IsAppropriate_FWD__Match_TypeAccess_InterfaceDeclaration_InterfaceDeclaration() {
		return getInterfaceExtendsInterface().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterfaceExtendsInterface__Perform_FWD__IsApplicableMatch() {
		return getInterfaceExtendsInterface().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterfaceExtendsInterface__IsApplicable_FWD__Match() {
		return getInterfaceExtendsInterface().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterfaceExtendsInterface__RegisterObjectsToMatch_FWD__Match_TypeAccess_InterfaceDeclaration_InterfaceDeclaration() {
		return getInterfaceExtendsInterface().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterfaceExtendsInterface__IsAppropriate_solveCsp_FWD__Match_TypeAccess_InterfaceDeclaration_InterfaceDeclaration() {
		return getInterfaceExtendsInterface().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterfaceExtendsInterface__IsAppropriate_checkCsp_FWD__CSP() {
		return getInterfaceExtendsInterface().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterfaceExtendsInterface__IsApplicable_solveCsp_FWD__IsApplicableMatch_TypeAccess_TInterface_TInterface_TypeToTAbstractType_TypeToTAbstractType_InterfaceDeclaration_InterfaceDeclaration() {
		return getInterfaceExtendsInterface().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterfaceExtendsInterface__IsApplicable_checkCsp_FWD__CSP() {
		return getInterfaceExtendsInterface().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterfaceExtendsInterface__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getInterfaceExtendsInterface().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterfaceExtendsInterface__CheckTypes_FWD__Match() {
		return getInterfaceExtendsInterface().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterfaceExtendsInterface__IsAppropriate_BWD__Match_TInterface_TInterface() {
		return getInterfaceExtendsInterface().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterfaceExtendsInterface__Perform_BWD__IsApplicableMatch() {
		return getInterfaceExtendsInterface().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterfaceExtendsInterface__IsApplicable_BWD__Match() {
		return getInterfaceExtendsInterface().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterfaceExtendsInterface__RegisterObjectsToMatch_BWD__Match_TInterface_TInterface() {
		return getInterfaceExtendsInterface().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterfaceExtendsInterface__IsAppropriate_solveCsp_BWD__Match_TInterface_TInterface() {
		return getInterfaceExtendsInterface().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterfaceExtendsInterface__IsAppropriate_checkCsp_BWD__CSP() {
		return getInterfaceExtendsInterface().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterfaceExtendsInterface__IsApplicable_solveCsp_BWD__IsApplicableMatch_TInterface_TInterface_TypeToTAbstractType_TypeToTAbstractType_InterfaceDeclaration_InterfaceDeclaration() {
		return getInterfaceExtendsInterface().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterfaceExtendsInterface__IsApplicable_checkCsp_BWD__CSP() {
		return getInterfaceExtendsInterface().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterfaceExtendsInterface__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getInterfaceExtendsInterface().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterfaceExtendsInterface__CheckTypes_BWD__Match() {
		return getInterfaceExtendsInterface().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterfaceExtendsInterface__IsAppropriate_BWD_EMoflonEdge_1__EMoflonEdge() {
		return getInterfaceExtendsInterface().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterfaceExtendsInterface__IsAppropriate_FWD_EMoflonEdge_1__EMoflonEdge() {
		return getInterfaceExtendsInterface().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterfaceExtendsInterface__CheckAttributes_FWD__TripleMatch() {
		return getInterfaceExtendsInterface().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterfaceExtendsInterface__CheckAttributes_BWD__TripleMatch() {
		return getInterfaceExtendsInterface().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterfaceExtendsInterface__IsApplicable_CC__Match_Match() {
		return getInterfaceExtendsInterface().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterfaceExtendsInterface__IsApplicable_solveCsp_CC__TypeAccess_TInterface_TInterface_InterfaceDeclaration_InterfaceDeclaration_Match_Match() {
		return getInterfaceExtendsInterface().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterfaceExtendsInterface__IsApplicable_checkCsp_CC__CSP() {
		return getInterfaceExtendsInterface().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterfaceExtendsInterface__CheckDEC_FWD__TypeAccess_InterfaceDeclaration_InterfaceDeclaration() {
		return getInterfaceExtendsInterface().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterfaceExtendsInterface__CheckDEC_BWD__TInterface_TInterface() {
		return getInterfaceExtendsInterface().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterfaceExtendsInterface__GenerateModel__RuleEntryContainer_TypeToTAbstractType_TypeToTAbstractType() {
		return getInterfaceExtendsInterface().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterfaceExtendsInterface__GenerateModel_solveCsp_BWD__IsApplicableMatch_TInterface_TInterface_TypeToTAbstractType_TypeToTAbstractType_InterfaceDeclaration_InterfaceDeclaration_ModelgeneratorRuleResult() {
		return getInterfaceExtendsInterface().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterfaceExtendsInterface__GenerateModel_checkCsp_BWD__CSP() {
		return getInterfaceExtendsInterface().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnnotationMemberValueAnnotationArray() {
		if (annotationMemberValueAnnotationArrayEClass == null) {
			annotationMemberValueAnnotationArrayEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(RulesPackage.eNS_URI).getEClassifiers().get(2);
		}
		return annotationMemberValueAnnotationArrayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueAnnotationArray__IsAppropriate_FWD__Match_Annotation_AnnotationMemberValuePair_ArrayInitializer_BodyDeclaration_Annotation() {
		return getAnnotationMemberValueAnnotationArray().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueAnnotationArray__Perform_FWD__IsApplicableMatch() {
		return getAnnotationMemberValueAnnotationArray().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueAnnotationArray__IsApplicable_FWD__Match() {
		return getAnnotationMemberValueAnnotationArray().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueAnnotationArray__RegisterObjectsToMatch_FWD__Match_Annotation_AnnotationMemberValuePair_ArrayInitializer_BodyDeclaration_Annotation() {
		return getAnnotationMemberValueAnnotationArray().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueAnnotationArray__IsAppropriate_solveCsp_FWD__Match_Annotation_AnnotationMemberValuePair_ArrayInitializer_BodyDeclaration_Annotation() {
		return getAnnotationMemberValueAnnotationArray().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueAnnotationArray__IsAppropriate_checkCsp_FWD__CSP() {
		return getAnnotationMemberValueAnnotationArray().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueAnnotationArray__IsApplicable_solveCsp_FWD__IsApplicableMatch_Annotation_AnnotationMemberValuePair_AnnotationMemberValuePairToTAnnotationValue_ArrayInitializer_BodyDeclaration_Annotation_TAnnotationValue() {
		return getAnnotationMemberValueAnnotationArray().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueAnnotationArray__IsApplicable_checkCsp_FWD__CSP() {
		return getAnnotationMemberValueAnnotationArray().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueAnnotationArray__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getAnnotationMemberValueAnnotationArray().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueAnnotationArray__CheckTypes_FWD__Match() {
		return getAnnotationMemberValueAnnotationArray().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueAnnotationArray__IsAppropriate_BWD__Match_TAnnotation_TAnnotationValue() {
		return getAnnotationMemberValueAnnotationArray().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueAnnotationArray__Perform_BWD__IsApplicableMatch() {
		return getAnnotationMemberValueAnnotationArray().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueAnnotationArray__IsApplicable_BWD__Match() {
		return getAnnotationMemberValueAnnotationArray().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueAnnotationArray__RegisterObjectsToMatch_BWD__Match_TAnnotation_TAnnotationValue() {
		return getAnnotationMemberValueAnnotationArray().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueAnnotationArray__IsAppropriate_solveCsp_BWD__Match_TAnnotation_TAnnotationValue() {
		return getAnnotationMemberValueAnnotationArray().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueAnnotationArray__IsAppropriate_checkCsp_BWD__CSP() {
		return getAnnotationMemberValueAnnotationArray().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueAnnotationArray__IsApplicable_solveCsp_BWD__IsApplicableMatch_Annotation_AnnotationMemberValuePair_AnnotationMemberValuePairToTAnnotationValue_TAnnotation_BodyDeclaration_TAnnotationValue() {
		return getAnnotationMemberValueAnnotationArray().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueAnnotationArray__IsApplicable_checkCsp_BWD__CSP() {
		return getAnnotationMemberValueAnnotationArray().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueAnnotationArray__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getAnnotationMemberValueAnnotationArray().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueAnnotationArray__CheckTypes_BWD__Match() {
		return getAnnotationMemberValueAnnotationArray().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueAnnotationArray__IsAppropriate_BWD_EMoflonEdge_2__EMoflonEdge() {
		return getAnnotationMemberValueAnnotationArray().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueAnnotationArray__IsAppropriate_FWD_EMoflonEdge_2__EMoflonEdge() {
		return getAnnotationMemberValueAnnotationArray().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueAnnotationArray__CheckAttributes_FWD__TripleMatch() {
		return getAnnotationMemberValueAnnotationArray().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueAnnotationArray__CheckAttributes_BWD__TripleMatch() {
		return getAnnotationMemberValueAnnotationArray().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueAnnotationArray__IsApplicable_CC__Match_Match() {
		return getAnnotationMemberValueAnnotationArray().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueAnnotationArray__IsApplicable_solveCsp_CC__Annotation_AnnotationMemberValuePair_ArrayInitializer_TAnnotation_BodyDeclaration_Annotation_TAnnotationValue_Match_Match() {
		return getAnnotationMemberValueAnnotationArray().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueAnnotationArray__IsApplicable_checkCsp_CC__CSP() {
		return getAnnotationMemberValueAnnotationArray().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueAnnotationArray__CheckDEC_FWD__Annotation_AnnotationMemberValuePair_ArrayInitializer_BodyDeclaration_Annotation() {
		return getAnnotationMemberValueAnnotationArray().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueAnnotationArray__CheckDEC_BWD__TAnnotation_TAnnotationValue() {
		return getAnnotationMemberValueAnnotationArray().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueAnnotationArray__GenerateModel__RuleEntryContainer_AnnotationMemberValuePairToTAnnotationValue() {
		return getAnnotationMemberValueAnnotationArray().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueAnnotationArray__GenerateModel_solveCsp_BWD__IsApplicableMatch_Annotation_AnnotationMemberValuePair_AnnotationMemberValuePairToTAnnotationValue_BodyDeclaration_TAnnotationValue_ModelgeneratorRuleResult() {
		return getAnnotationMemberValueAnnotationArray().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueAnnotationArray__GenerateModel_checkCsp_BWD__CSP() {
		return getAnnotationMemberValueAnnotationArray().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTextAnnotations() {
		if (textAnnotationsEClass == null) {
			textAnnotationsEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(3);
		}
		return textAnnotationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTextAnnotations__IsAppropriate_FWD__Match_MDefinition_LineComment() {
		return getTextAnnotations().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTextAnnotations__Perform_FWD__IsApplicableMatch() {
		return getTextAnnotations().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTextAnnotations__IsApplicable_FWD__Match() {
		return getTextAnnotations().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTextAnnotations__RegisterObjectsToMatch_FWD__Match_MDefinition_LineComment() {
		return getTextAnnotations().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTextAnnotations__IsAppropriate_solveCsp_FWD__Match_MDefinition_LineComment() {
		return getTextAnnotations().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTextAnnotations__IsAppropriate_checkCsp_FWD__CSP() {
		return getTextAnnotations().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTextAnnotations__IsApplicable_solveCsp_FWD__IsApplicableMatch_MDefinitionToTMember_TMember_MDefinition_LineComment() {
		return getTextAnnotations().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTextAnnotations__IsApplicable_checkCsp_FWD__CSP() {
		return getTextAnnotations().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTextAnnotations__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getTextAnnotations().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTextAnnotations__CheckTypes_FWD__Match() {
		return getTextAnnotations().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTextAnnotations__IsAppropriate_BWD__Match_TMember_TTextAnnotation() {
		return getTextAnnotations().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTextAnnotations__Perform_BWD__IsApplicableMatch() {
		return getTextAnnotations().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTextAnnotations__IsApplicable_BWD__Match() {
		return getTextAnnotations().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTextAnnotations__RegisterObjectsToMatch_BWD__Match_TMember_TTextAnnotation() {
		return getTextAnnotations().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTextAnnotations__IsAppropriate_solveCsp_BWD__Match_TMember_TTextAnnotation() {
		return getTextAnnotations().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTextAnnotations__IsAppropriate_checkCsp_BWD__CSP() {
		return getTextAnnotations().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTextAnnotations__IsApplicable_solveCsp_BWD__IsApplicableMatch_MDefinitionToTMember_TMember_MDefinition_TTextAnnotation() {
		return getTextAnnotations().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTextAnnotations__IsApplicable_checkCsp_BWD__CSP() {
		return getTextAnnotations().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTextAnnotations__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getTextAnnotations().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTextAnnotations__CheckTypes_BWD__Match() {
		return getTextAnnotations().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTextAnnotations__IsAppropriate_BWD_EMoflonEdge_3__EMoflonEdge() {
		return getTextAnnotations().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTextAnnotations__IsAppropriate_FWD_EMoflonEdge_3__EMoflonEdge() {
		return getTextAnnotations().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTextAnnotations__CheckAttributes_FWD__TripleMatch() {
		return getTextAnnotations().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTextAnnotations__CheckAttributes_BWD__TripleMatch() {
		return getTextAnnotations().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTextAnnotations__IsApplicable_CC__Match_Match() {
		return getTextAnnotations().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTextAnnotations__IsApplicable_solveCsp_CC__TMember_MDefinition_LineComment_TTextAnnotation_Match_Match() {
		return getTextAnnotations().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTextAnnotations__IsApplicable_checkCsp_CC__CSP() {
		return getTextAnnotations().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTextAnnotations__CheckDEC_FWD__MDefinition_LineComment() {
		return getTextAnnotations().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTextAnnotations__CheckDEC_BWD__TMember_TTextAnnotation() {
		return getTextAnnotations().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTextAnnotations__GenerateModel__RuleEntryContainer_MDefinitionToTMember() {
		return getTextAnnotations().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTextAnnotations__GenerateModel_solveCsp_BWD__IsApplicableMatch_MDefinitionToTMember_TMember_MDefinition_ModelgeneratorRuleResult() {
		return getTextAnnotations().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTextAnnotations__GenerateModel_checkCsp_BWD__CSP() {
		return getTextAnnotations().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnnotationMemberValue() {
		if (annotationMemberValueEClass == null) {
			annotationMemberValueEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(4);
		}
		return annotationMemberValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getClassInPackage() {
		if (classInPackageEClass == null) {
			classInPackageEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(5);
		}
		return classInPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassInPackage__IsAppropriate_FWD__Match_Package_MClass() {
		return getClassInPackage().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassInPackage__Perform_FWD__IsApplicableMatch() {
		return getClassInPackage().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassInPackage__IsApplicable_FWD__Match() {
		return getClassInPackage().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassInPackage__RegisterObjectsToMatch_FWD__Match_Package_MClass() {
		return getClassInPackage().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassInPackage__IsAppropriate_solveCsp_FWD__Match_Package_MClass() {
		return getClassInPackage().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassInPackage__IsAppropriate_checkCsp_FWD__CSP() {
		return getClassInPackage().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassInPackage__IsApplicable_solveCsp_FWD__IsApplicableMatch_PackageToTPackage_TPackage_Package_TypeGraph_MClass() {
		return getClassInPackage().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassInPackage__IsApplicable_checkCsp_FWD__CSP() {
		return getClassInPackage().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassInPackage__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getClassInPackage().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassInPackage__CheckTypes_FWD__Match() {
		return getClassInPackage().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassInPackage__IsAppropriate_BWD__Match_TClass_TPackage_TypeGraph() {
		return getClassInPackage().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassInPackage__Perform_BWD__IsApplicableMatch() {
		return getClassInPackage().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassInPackage__IsApplicable_BWD__Match() {
		return getClassInPackage().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassInPackage__RegisterObjectsToMatch_BWD__Match_TClass_TPackage_TypeGraph() {
		return getClassInPackage().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassInPackage__IsAppropriate_solveCsp_BWD__Match_TClass_TPackage_TypeGraph() {
		return getClassInPackage().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassInPackage__IsAppropriate_checkCsp_BWD__CSP() {
		return getClassInPackage().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassInPackage__IsApplicable_solveCsp_BWD__IsApplicableMatch_PackageToTPackage_TClass_TPackage_Package_TypeGraph() {
		return getClassInPackage().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassInPackage__IsApplicable_checkCsp_BWD__CSP() {
		return getClassInPackage().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassInPackage__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getClassInPackage().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassInPackage__CheckTypes_BWD__Match() {
		return getClassInPackage().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassInPackage__IsAppropriate_BWD_EMoflonEdge_4__EMoflonEdge() {
		return getClassInPackage().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassInPackage__IsAppropriate_FWD_EMoflonEdge_4__EMoflonEdge() {
		return getClassInPackage().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassInPackage__CheckAttributes_FWD__TripleMatch() {
		return getClassInPackage().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassInPackage__CheckAttributes_BWD__TripleMatch() {
		return getClassInPackage().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassInPackage__IsApplicable_CC__Match_Match() {
		return getClassInPackage().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassInPackage__IsApplicable_solveCsp_CC__TClass_TPackage_Package_TypeGraph_MClass_Match_Match() {
		return getClassInPackage().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassInPackage__IsApplicable_checkCsp_CC__CSP() {
		return getClassInPackage().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassInPackage__CheckDEC_FWD__Package_MClass() {
		return getClassInPackage().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassInPackage__CheckDEC_BWD__TClass_TPackage_TypeGraph() {
		return getClassInPackage().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassInPackage__GenerateModel__RuleEntryContainer_PackageToTPackage() {
		return getClassInPackage().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassInPackage__GenerateModel_solveCsp_BWD__IsApplicableMatch_PackageToTPackage_TPackage_Package_TypeGraph_ModelgeneratorRuleResult() {
		return getClassInPackage().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassInPackage__GenerateModel_checkCsp_BWD__CSP() {
		return getClassInPackage().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConstructorInvocation() {
		if (constructorInvocationEClass == null) {
			constructorInvocationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(6);
		}
		return constructorInvocationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConstructorInvocation__IsAppropriate_FWD__Match_MConstructorInvocation_MDefinition() {
		return getConstructorInvocation().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConstructorInvocation__Perform_FWD__IsApplicableMatch() {
		return getConstructorInvocation().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConstructorInvocation__IsApplicable_FWD__Match() {
		return getConstructorInvocation().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConstructorInvocation__RegisterObjectsToMatch_FWD__Match_MConstructorInvocation_MDefinition() {
		return getConstructorInvocation().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConstructorInvocation__IsAppropriate_solveCsp_FWD__Match_MConstructorInvocation_MDefinition() {
		return getConstructorInvocation().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConstructorInvocation__IsAppropriate_checkCsp_FWD__CSP() {
		return getConstructorInvocation().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConstructorInvocation__IsApplicable_solveCsp_FWD__IsApplicableMatch_MConstructorInvocation_MDefinitionToTMember_TMember_MDefinition() {
		return getConstructorInvocation().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConstructorInvocation__IsApplicable_checkCsp_FWD__CSP() {
		return getConstructorInvocation().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConstructorInvocation__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getConstructorInvocation().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConstructorInvocation__CheckTypes_FWD__Match() {
		return getConstructorInvocation().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConstructorInvocation__IsAppropriate_BWD__Match_TMember_TCall() {
		return getConstructorInvocation().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConstructorInvocation__Perform_BWD__IsApplicableMatch() {
		return getConstructorInvocation().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConstructorInvocation__IsApplicable_BWD__Match() {
		return getConstructorInvocation().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConstructorInvocation__RegisterObjectsToMatch_BWD__Match_TMember_TCall() {
		return getConstructorInvocation().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConstructorInvocation__IsAppropriate_solveCsp_BWD__Match_TMember_TCall() {
		return getConstructorInvocation().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConstructorInvocation__IsAppropriate_checkCsp_BWD__CSP() {
		return getConstructorInvocation().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConstructorInvocation__IsApplicable_solveCsp_BWD__IsApplicableMatch_MDefinitionToTMember_TMember_TCall_MDefinition() {
		return getConstructorInvocation().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConstructorInvocation__IsApplicable_checkCsp_BWD__CSP() {
		return getConstructorInvocation().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConstructorInvocation__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getConstructorInvocation().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConstructorInvocation__CheckTypes_BWD__Match() {
		return getConstructorInvocation().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConstructorInvocation__IsAppropriate_BWD_EMoflonEdge_5__EMoflonEdge() {
		return getConstructorInvocation().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConstructorInvocation__IsAppropriate_FWD_EMoflonEdge_5__EMoflonEdge() {
		return getConstructorInvocation().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConstructorInvocation__CheckAttributes_FWD__TripleMatch() {
		return getConstructorInvocation().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConstructorInvocation__CheckAttributes_BWD__TripleMatch() {
		return getConstructorInvocation().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConstructorInvocation__IsApplicable_CC__Match_Match() {
		return getConstructorInvocation().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConstructorInvocation__IsApplicable_solveCsp_CC__MConstructorInvocation_TMember_TCall_MDefinition_Match_Match() {
		return getConstructorInvocation().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConstructorInvocation__IsApplicable_checkCsp_CC__CSP() {
		return getConstructorInvocation().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConstructorInvocation__CheckDEC_FWD__MConstructorInvocation_MDefinition() {
		return getConstructorInvocation().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConstructorInvocation__CheckDEC_BWD__TMember_TCall() {
		return getConstructorInvocation().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConstructorInvocation__GenerateModel__RuleEntryContainer_MDefinitionToTMember() {
		return getConstructorInvocation().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConstructorInvocation__GenerateModel_solveCsp_BWD__IsApplicableMatch_MDefinitionToTMember_TMember_MDefinition_ModelgeneratorRuleResult() {
		return getConstructorInvocation().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConstructorInvocation__GenerateModel_checkCsp_BWD__CSP() {
		return getConstructorInvocation().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnnotationTypeInAnonymous() {
		if (annotationTypeInAnonymousEClass == null) {
			annotationTypeInAnonymousEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(7);
		}
		return annotationTypeInAnonymousEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeInAnonymous__IsAppropriate_FWD__Match_AnnotationTypeDeclaration_AnonymousClassDeclaration() {
		return getAnnotationTypeInAnonymous().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeInAnonymous__Perform_FWD__IsApplicableMatch() {
		return getAnnotationTypeInAnonymous().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeInAnonymous__IsApplicable_FWD__Match() {
		return getAnnotationTypeInAnonymous().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeInAnonymous__RegisterObjectsToMatch_FWD__Match_AnnotationTypeDeclaration_AnonymousClassDeclaration() {
		return getAnnotationTypeInAnonymous().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeInAnonymous__IsAppropriate_solveCsp_FWD__Match_AnnotationTypeDeclaration_AnonymousClassDeclaration() {
		return getAnnotationTypeInAnonymous().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeInAnonymous__IsAppropriate_checkCsp_FWD__CSP() {
		return getAnnotationTypeInAnonymous().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeInAnonymous__IsApplicable_solveCsp_FWD__IsApplicableMatch_TClass_AnnotationTypeDeclaration_TPackage_TypeGraph_AnonymousClassDeclarationToTClass_AnonymousClassDeclaration() {
		return getAnnotationTypeInAnonymous().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeInAnonymous__IsApplicable_checkCsp_FWD__CSP() {
		return getAnnotationTypeInAnonymous().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeInAnonymous__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getAnnotationTypeInAnonymous().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeInAnonymous__CheckTypes_FWD__Match() {
		return getAnnotationTypeInAnonymous().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeInAnonymous__IsAppropriate_BWD__Match_TClass_TPackage_TypeGraph_TAnnotationType() {
		return getAnnotationTypeInAnonymous().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeInAnonymous__Perform_BWD__IsApplicableMatch() {
		return getAnnotationTypeInAnonymous().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeInAnonymous__IsApplicable_BWD__Match() {
		return getAnnotationTypeInAnonymous().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeInAnonymous__RegisterObjectsToMatch_BWD__Match_TClass_TPackage_TypeGraph_TAnnotationType() {
		return getAnnotationTypeInAnonymous().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeInAnonymous__IsAppropriate_solveCsp_BWD__Match_TClass_TPackage_TypeGraph_TAnnotationType() {
		return getAnnotationTypeInAnonymous().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeInAnonymous__IsAppropriate_checkCsp_BWD__CSP() {
		return getAnnotationTypeInAnonymous().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeInAnonymous__IsApplicable_solveCsp_BWD__IsApplicableMatch_TClass_TPackage_TypeGraph_TAnnotationType_AnonymousClassDeclarationToTClass_AnonymousClassDeclaration() {
		return getAnnotationTypeInAnonymous().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeInAnonymous__IsApplicable_checkCsp_BWD__CSP() {
		return getAnnotationTypeInAnonymous().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeInAnonymous__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getAnnotationTypeInAnonymous().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeInAnonymous__CheckTypes_BWD__Match() {
		return getAnnotationTypeInAnonymous().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeInAnonymous__IsAppropriate_BWD_EMoflonEdge_6__EMoflonEdge() {
		return getAnnotationTypeInAnonymous().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeInAnonymous__IsAppropriate_FWD_EMoflonEdge_6__EMoflonEdge() {
		return getAnnotationTypeInAnonymous().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeInAnonymous__CheckAttributes_FWD__TripleMatch() {
		return getAnnotationTypeInAnonymous().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeInAnonymous__CheckAttributes_BWD__TripleMatch() {
		return getAnnotationTypeInAnonymous().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeInAnonymous__IsApplicable_CC__Match_Match() {
		return getAnnotationTypeInAnonymous().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeInAnonymous__IsApplicable_solveCsp_CC__TClass_AnnotationTypeDeclaration_TPackage_TypeGraph_TAnnotationType_AnonymousClassDeclaration_Match_Match() {
		return getAnnotationTypeInAnonymous().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeInAnonymous__IsApplicable_checkCsp_CC__CSP() {
		return getAnnotationTypeInAnonymous().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeInAnonymous__CheckDEC_FWD__AnnotationTypeDeclaration_AnonymousClassDeclaration() {
		return getAnnotationTypeInAnonymous().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeInAnonymous__CheckDEC_BWD__TClass_TPackage_TypeGraph_TAnnotationType() {
		return getAnnotationTypeInAnonymous().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeInAnonymous__GenerateModel__RuleEntryContainer_AnonymousClassDeclarationToTClass() {
		return getAnnotationTypeInAnonymous().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeInAnonymous__GenerateModel_solveCsp_BWD__IsApplicableMatch_TClass_TPackage_TypeGraph_AnonymousClassDeclarationToTClass_AnonymousClassDeclaration_ModelgeneratorRuleResult() {
		return getAnnotationTypeInAnonymous().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeInAnonymous__GenerateModel_checkCsp_BWD__CSP() {
		return getAnnotationTypeInAnonymous().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSyntethicMethod() {
		if (syntethicMethodEClass == null) {
			syntethicMethodEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(8);
		}
		return syntethicMethodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSyntethicMethod__IsAppropriate_FWD__Match_MSyntheticMethodDefinition_ClassDeclaration_MMethodDefinition() {
		return getSyntethicMethod().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSyntethicMethod__Perform_FWD__IsApplicableMatch() {
		return getSyntethicMethod().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSyntethicMethod__IsApplicable_FWD__Match() {
		return getSyntethicMethod().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSyntethicMethod__RegisterObjectsToMatch_FWD__Match_MSyntheticMethodDefinition_ClassDeclaration_MMethodDefinition() {
		return getSyntethicMethod().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSyntethicMethod__IsAppropriate_solveCsp_FWD__Match_MSyntheticMethodDefinition_ClassDeclaration_MMethodDefinition() {
		return getSyntethicMethod().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSyntethicMethod__IsAppropriate_checkCsp_FWD__CSP() {
		return getSyntethicMethod().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSyntethicMethod__IsApplicable_solveCsp_FWD__IsApplicableMatch_MSyntheticMethodDefinition_ClassDeclaration_TypeToTAbstractType_TClass_MMethodDefinition_MDefinitionToTMember_TMethodSignature_TMethodDefinition() {
		return getSyntethicMethod().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSyntethicMethod__IsApplicable_checkCsp_FWD__CSP() {
		return getSyntethicMethod().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSyntethicMethod__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getSyntethicMethod().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSyntethicMethod__CheckTypes_FWD__Match() {
		return getSyntethicMethod().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSyntethicMethod__IsAppropriate_BWD__Match_TClass_TMethodSignature_TSyntethicMethod_TMethodDefinition() {
		return getSyntethicMethod().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSyntethicMethod__Perform_BWD__IsApplicableMatch() {
		return getSyntethicMethod().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSyntethicMethod__IsApplicable_BWD__Match() {
		return getSyntethicMethod().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSyntethicMethod__RegisterObjectsToMatch_BWD__Match_TClass_TMethodSignature_TSyntethicMethod_TMethodDefinition() {
		return getSyntethicMethod().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSyntethicMethod__IsAppropriate_solveCsp_BWD__Match_TClass_TMethodSignature_TSyntethicMethod_TMethodDefinition() {
		return getSyntethicMethod().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSyntethicMethod__IsAppropriate_checkCsp_BWD__CSP() {
		return getSyntethicMethod().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSyntethicMethod__IsApplicable_solveCsp_BWD__IsApplicableMatch_ClassDeclaration_TypeToTAbstractType_TClass_MMethodDefinition_MDefinitionToTMember_TMethodSignature_TSyntethicMethod_TMethodDefinition() {
		return getSyntethicMethod().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSyntethicMethod__IsApplicable_checkCsp_BWD__CSP() {
		return getSyntethicMethod().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSyntethicMethod__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getSyntethicMethod().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSyntethicMethod__CheckTypes_BWD__Match() {
		return getSyntethicMethod().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSyntethicMethod__IsAppropriate_BWD_EMoflonEdge_7__EMoflonEdge() {
		return getSyntethicMethod().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSyntethicMethod__IsAppropriate_FWD_EMoflonEdge_7__EMoflonEdge() {
		return getSyntethicMethod().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSyntethicMethod__CheckAttributes_FWD__TripleMatch() {
		return getSyntethicMethod().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSyntethicMethod__CheckAttributes_BWD__TripleMatch() {
		return getSyntethicMethod().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSyntethicMethod__IsApplicable_CC__Match_Match() {
		return getSyntethicMethod().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSyntethicMethod__IsApplicable_solveCsp_CC__MSyntheticMethodDefinition_ClassDeclaration_TClass_MMethodDefinition_TMethodSignature_TSyntethicMethod_TMethodDefinition_Match_Match() {
		return getSyntethicMethod().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSyntethicMethod__IsApplicable_checkCsp_CC__CSP() {
		return getSyntethicMethod().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSyntethicMethod__CheckDEC_FWD__MSyntheticMethodDefinition_ClassDeclaration_MMethodDefinition() {
		return getSyntethicMethod().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSyntethicMethod__CheckDEC_BWD__TClass_TMethodSignature_TSyntethicMethod_TMethodDefinition() {
		return getSyntethicMethod().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSyntethicMethod__GenerateModel__RuleEntryContainer_TypeToTAbstractType_MDefinitionToTMember() {
		return getSyntethicMethod().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSyntethicMethod__GenerateModel_solveCsp_BWD__IsApplicableMatch_ClassDeclaration_TypeToTAbstractType_TClass_MMethodDefinition_MDefinitionToTMember_TMethodSignature_TMethodDefinition_ModelgeneratorRuleResult() {
		return getSyntethicMethod().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSyntethicMethod__GenerateModel_checkCsp_BWD__CSP() {
		return getSyntethicMethod().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFieldDefinition() {
		if (fieldDefinitionEClass == null) {
			fieldDefinitionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(9);
		}
		return fieldDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDefinition__IsAppropriate_FWD__Match_MFieldDefinition_MFieldSignature() {
		return getFieldDefinition().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDefinition__Perform_FWD__IsApplicableMatch() {
		return getFieldDefinition().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDefinition__IsApplicable_FWD__Match() {
		return getFieldDefinition().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDefinition__RegisterObjectsToMatch_FWD__Match_MFieldDefinition_MFieldSignature() {
		return getFieldDefinition().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDefinition__IsAppropriate_solveCsp_FWD__Match_MFieldDefinition_MFieldSignature() {
		return getFieldDefinition().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDefinition__IsAppropriate_checkCsp_FWD__CSP() {
		return getFieldDefinition().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDefinition__IsApplicable_solveCsp_FWD__IsApplicableMatch_MSignatureToTSignature_MFieldDefinition_MFieldSignature_TFieldSignature() {
		return getFieldDefinition().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDefinition__IsApplicable_checkCsp_FWD__CSP() {
		return getFieldDefinition().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDefinition__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getFieldDefinition().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDefinition__CheckTypes_FWD__Match() {
		return getFieldDefinition().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDefinition__IsAppropriate_BWD__Match_TFieldDefinition_TFieldSignature() {
		return getFieldDefinition().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDefinition__Perform_BWD__IsApplicableMatch() {
		return getFieldDefinition().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDefinition__IsApplicable_BWD__Match() {
		return getFieldDefinition().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDefinition__RegisterObjectsToMatch_BWD__Match_TFieldDefinition_TFieldSignature() {
		return getFieldDefinition().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDefinition__IsAppropriate_solveCsp_BWD__Match_TFieldDefinition_TFieldSignature() {
		return getFieldDefinition().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDefinition__IsAppropriate_checkCsp_BWD__CSP() {
		return getFieldDefinition().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDefinition__IsApplicable_solveCsp_BWD__IsApplicableMatch_MSignatureToTSignature_TFieldDefinition_MFieldSignature_TFieldSignature() {
		return getFieldDefinition().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDefinition__IsApplicable_checkCsp_BWD__CSP() {
		return getFieldDefinition().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDefinition__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getFieldDefinition().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDefinition__CheckTypes_BWD__Match() {
		return getFieldDefinition().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDefinition__IsAppropriate_BWD_EMoflonEdge_8__EMoflonEdge() {
		return getFieldDefinition().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDefinition__IsAppropriate_FWD_EMoflonEdge_8__EMoflonEdge() {
		return getFieldDefinition().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDefinition__CheckAttributes_FWD__TripleMatch() {
		return getFieldDefinition().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDefinition__CheckAttributes_BWD__TripleMatch() {
		return getFieldDefinition().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDefinition__IsApplicable_CC__Match_Match() {
		return getFieldDefinition().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDefinition__IsApplicable_solveCsp_CC__MFieldDefinition_TFieldDefinition_MFieldSignature_TFieldSignature_Match_Match() {
		return getFieldDefinition().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDefinition__IsApplicable_checkCsp_CC__CSP() {
		return getFieldDefinition().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDefinition__CheckDEC_FWD__MFieldDefinition_MFieldSignature() {
		return getFieldDefinition().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDefinition__CheckDEC_BWD__TFieldDefinition_TFieldSignature() {
		return getFieldDefinition().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDefinition__GenerateModel__RuleEntryContainer_MSignatureToTSignature() {
		return getFieldDefinition().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDefinition__GenerateModel_solveCsp_BWD__IsApplicableMatch_MSignatureToTSignature_MFieldSignature_TFieldSignature_ModelgeneratorRuleResult() {
		return getFieldDefinition().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldDefinition__GenerateModel_checkCsp_BWD__CSP() {
		return getFieldDefinition().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTypeParameter() {
		if (typeParameterEClass == null) {
			typeParameterEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(10);
		}
		return typeParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeParameter__IsAppropriate_FWD__Match_MGravityModel_TypeParameter() {
		return getTypeParameter().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeParameter__Perform_FWD__IsApplicableMatch() {
		return getTypeParameter().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeParameter__IsApplicable_FWD__Match() {
		return getTypeParameter().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeParameter__RegisterObjectsToMatch_FWD__Match_MGravityModel_TypeParameter() {
		return getTypeParameter().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeParameter__IsAppropriate_solveCsp_FWD__Match_MGravityModel_TypeParameter() {
		return getTypeParameter().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeParameter__IsAppropriate_checkCsp_FWD__CSP() {
		return getTypeParameter().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeParameter__IsApplicable_solveCsp_FWD__IsApplicableMatch_ModelToTypeGraph_MGravityModel_TypeParameter_TypeGraph() {
		return getTypeParameter().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeParameter__IsApplicable_checkCsp_FWD__CSP() {
		return getTypeParameter().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeParameter__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getTypeParameter().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeParameter__CheckTypes_FWD__Match() {
		return getTypeParameter().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeParameter__IsAppropriate_BWD__Match_TypeGraph_TClass() {
		return getTypeParameter().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeParameter__Perform_BWD__IsApplicableMatch() {
		return getTypeParameter().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeParameter__IsApplicable_BWD__Match() {
		return getTypeParameter().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeParameter__RegisterObjectsToMatch_BWD__Match_TypeGraph_TClass() {
		return getTypeParameter().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeParameter__IsAppropriate_solveCsp_BWD__Match_TypeGraph_TClass() {
		return getTypeParameter().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeParameter__IsAppropriate_checkCsp_BWD__CSP() {
		return getTypeParameter().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeParameter__IsApplicable_solveCsp_BWD__IsApplicableMatch_ModelToTypeGraph_MGravityModel_TypeGraph_TClass() {
		return getTypeParameter().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeParameter__IsApplicable_checkCsp_BWD__CSP() {
		return getTypeParameter().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeParameter__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getTypeParameter().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeParameter__CheckTypes_BWD__Match() {
		return getTypeParameter().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeParameter__IsAppropriate_BWD_EMoflonEdge_9__EMoflonEdge() {
		return getTypeParameter().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeParameter__IsAppropriate_FWD_EMoflonEdge_9__EMoflonEdge() {
		return getTypeParameter().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeParameter__CheckAttributes_FWD__TripleMatch() {
		return getTypeParameter().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeParameter__CheckAttributes_BWD__TripleMatch() {
		return getTypeParameter().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeParameter__IsApplicable_CC__Match_Match() {
		return getTypeParameter().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeParameter__IsApplicable_solveCsp_CC__MGravityModel_TypeParameter_TypeGraph_TClass_Match_Match() {
		return getTypeParameter().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeParameter__IsApplicable_checkCsp_CC__CSP() {
		return getTypeParameter().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeParameter__CheckDEC_FWD__MGravityModel_TypeParameter() {
		return getTypeParameter().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeParameter__CheckDEC_BWD__TypeGraph_TClass() {
		return getTypeParameter().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeParameter__GenerateModel__RuleEntryContainer_ModelToTypeGraph() {
		return getTypeParameter().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeParameter__GenerateModel_solveCsp_BWD__IsApplicableMatch_ModelToTypeGraph_MGravityModel_TypeGraph_ModelgeneratorRuleResult() {
		return getTypeParameter().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypeParameter__GenerateModel_checkCsp_BWD__CSP() {
		return getTypeParameter().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSuperMethodInvocation() {
		if (superMethodInvocationEClass == null) {
			superMethodInvocationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(11);
		}
		return superMethodInvocationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperMethodInvocation__IsAppropriate_FWD__Match_MSuperMethodInvocation_MDefinition() {
		return getSuperMethodInvocation().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperMethodInvocation__Perform_FWD__IsApplicableMatch() {
		return getSuperMethodInvocation().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperMethodInvocation__IsApplicable_FWD__Match() {
		return getSuperMethodInvocation().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperMethodInvocation__RegisterObjectsToMatch_FWD__Match_MSuperMethodInvocation_MDefinition() {
		return getSuperMethodInvocation().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperMethodInvocation__IsAppropriate_solveCsp_FWD__Match_MSuperMethodInvocation_MDefinition() {
		return getSuperMethodInvocation().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperMethodInvocation__IsAppropriate_checkCsp_FWD__CSP() {
		return getSuperMethodInvocation().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperMethodInvocation__IsApplicable_solveCsp_FWD__IsApplicableMatch_MSuperMethodInvocation_MDefinitionToTMember_TMember_MDefinition() {
		return getSuperMethodInvocation().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperMethodInvocation__IsApplicable_checkCsp_FWD__CSP() {
		return getSuperMethodInvocation().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperMethodInvocation__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getSuperMethodInvocation().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperMethodInvocation__CheckTypes_FWD__Match() {
		return getSuperMethodInvocation().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperMethodInvocation__IsAppropriate_BWD__Match_TMember_TCall() {
		return getSuperMethodInvocation().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperMethodInvocation__Perform_BWD__IsApplicableMatch() {
		return getSuperMethodInvocation().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperMethodInvocation__IsApplicable_BWD__Match() {
		return getSuperMethodInvocation().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperMethodInvocation__RegisterObjectsToMatch_BWD__Match_TMember_TCall() {
		return getSuperMethodInvocation().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperMethodInvocation__IsAppropriate_solveCsp_BWD__Match_TMember_TCall() {
		return getSuperMethodInvocation().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperMethodInvocation__IsAppropriate_checkCsp_BWD__CSP() {
		return getSuperMethodInvocation().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperMethodInvocation__IsApplicable_solveCsp_BWD__IsApplicableMatch_MDefinitionToTMember_TMember_TCall_MDefinition() {
		return getSuperMethodInvocation().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperMethodInvocation__IsApplicable_checkCsp_BWD__CSP() {
		return getSuperMethodInvocation().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperMethodInvocation__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getSuperMethodInvocation().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperMethodInvocation__CheckTypes_BWD__Match() {
		return getSuperMethodInvocation().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperMethodInvocation__IsAppropriate_BWD_EMoflonEdge_10__EMoflonEdge() {
		return getSuperMethodInvocation().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperMethodInvocation__IsAppropriate_FWD_EMoflonEdge_10__EMoflonEdge() {
		return getSuperMethodInvocation().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperMethodInvocation__CheckAttributes_FWD__TripleMatch() {
		return getSuperMethodInvocation().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperMethodInvocation__CheckAttributes_BWD__TripleMatch() {
		return getSuperMethodInvocation().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperMethodInvocation__IsApplicable_CC__Match_Match() {
		return getSuperMethodInvocation().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperMethodInvocation__IsApplicable_solveCsp_CC__MSuperMethodInvocation_TMember_TCall_MDefinition_Match_Match() {
		return getSuperMethodInvocation().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperMethodInvocation__IsApplicable_checkCsp_CC__CSP() {
		return getSuperMethodInvocation().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperMethodInvocation__CheckDEC_FWD__MSuperMethodInvocation_MDefinition() {
		return getSuperMethodInvocation().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperMethodInvocation__CheckDEC_BWD__TMember_TCall() {
		return getSuperMethodInvocation().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperMethodInvocation__GenerateModel__RuleEntryContainer_MDefinitionToTMember() {
		return getSuperMethodInvocation().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperMethodInvocation__GenerateModel_solveCsp_BWD__IsApplicableMatch_MDefinitionToTMember_TMember_MDefinition_ModelgeneratorRuleResult() {
		return getSuperMethodInvocation().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperMethodInvocation__GenerateModel_checkCsp_BWD__CSP() {
		return getSuperMethodInvocation().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEnumInPackage() {
		if (enumInPackageEClass == null) {
			enumInPackageEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(12);
		}
		return enumInPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEnumInPackage__IsAppropriate_FWD__Match_Package_EnumDeclaration() {
		return getEnumInPackage().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEnumInPackage__Perform_FWD__IsApplicableMatch() {
		return getEnumInPackage().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEnumInPackage__IsApplicable_FWD__Match() {
		return getEnumInPackage().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEnumInPackage__RegisterObjectsToMatch_FWD__Match_Package_EnumDeclaration() {
		return getEnumInPackage().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEnumInPackage__IsAppropriate_solveCsp_FWD__Match_Package_EnumDeclaration() {
		return getEnumInPackage().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEnumInPackage__IsAppropriate_checkCsp_FWD__CSP() {
		return getEnumInPackage().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEnumInPackage__IsApplicable_solveCsp_FWD__IsApplicableMatch_PackageToTPackage_TPackage_Package_TypeGraph_EnumDeclaration() {
		return getEnumInPackage().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEnumInPackage__IsApplicable_checkCsp_FWD__CSP() {
		return getEnumInPackage().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEnumInPackage__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getEnumInPackage().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEnumInPackage__CheckTypes_FWD__Match() {
		return getEnumInPackage().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEnumInPackage__IsAppropriate_BWD__Match_TEnum_TPackage_TClass_TypeGraph() {
		return getEnumInPackage().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEnumInPackage__Perform_BWD__IsApplicableMatch() {
		return getEnumInPackage().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEnumInPackage__IsApplicable_BWD__Match() {
		return getEnumInPackage().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEnumInPackage__RegisterObjectsToMatch_BWD__Match_TEnum_TPackage_TClass_TypeGraph() {
		return getEnumInPackage().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEnumInPackage__IsAppropriate_solveCsp_BWD__Match_TEnum_TPackage_TClass_TypeGraph() {
		return getEnumInPackage().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEnumInPackage__IsAppropriate_checkCsp_BWD__CSP() {
		return getEnumInPackage().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEnumInPackage__IsApplicable_solveCsp_BWD__IsApplicableMatch_TEnum_PackageToTPackage_TPackage_TClass_Package_TypeGraph() {
		return getEnumInPackage().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEnumInPackage__IsApplicable_checkCsp_BWD__CSP() {
		return getEnumInPackage().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEnumInPackage__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getEnumInPackage().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEnumInPackage__CheckTypes_BWD__Match() {
		return getEnumInPackage().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEnumInPackage__IsAppropriate_BWD_EMoflonEdge_11__EMoflonEdge() {
		return getEnumInPackage().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEnumInPackage__IsAppropriate_FWD_EMoflonEdge_11__EMoflonEdge() {
		return getEnumInPackage().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEnumInPackage__CheckAttributes_FWD__TripleMatch() {
		return getEnumInPackage().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEnumInPackage__CheckAttributes_BWD__TripleMatch() {
		return getEnumInPackage().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEnumInPackage__IsApplicable_CC__Match_Match() {
		return getEnumInPackage().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEnumInPackage__IsApplicable_solveCsp_CC__TEnum_TPackage_TClass_Package_TypeGraph_EnumDeclaration_Match_Match() {
		return getEnumInPackage().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEnumInPackage__IsApplicable_checkCsp_CC__CSP() {
		return getEnumInPackage().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEnumInPackage__CheckDEC_FWD__Package_EnumDeclaration() {
		return getEnumInPackage().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEnumInPackage__CheckDEC_BWD__TEnum_TPackage_TClass_TypeGraph() {
		return getEnumInPackage().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEnumInPackage__GenerateModel__RuleEntryContainer_PackageToTPackage() {
		return getEnumInPackage().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEnumInPackage__GenerateModel_solveCsp_BWD__IsApplicableMatch_PackageToTPackage_TPackage_Package_TypeGraph_ModelgeneratorRuleResult() {
		return getEnumInPackage().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEnumInPackage__GenerateModel_checkCsp_BWD__CSP() {
		return getEnumInPackage().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTypesOrphaned() {
		if (typesOrphanedEClass == null) {
			typesOrphanedEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(13);
		}
		return typesOrphanedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypesOrphaned__IsAppropriate_FWD__Match_Model_MClass() {
		return getTypesOrphaned().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypesOrphaned__Perform_FWD__IsApplicableMatch() {
		return getTypesOrphaned().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypesOrphaned__IsApplicable_FWD__Match() {
		return getTypesOrphaned().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypesOrphaned__RegisterObjectsToMatch_FWD__Match_Model_MClass() {
		return getTypesOrphaned().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypesOrphaned__IsAppropriate_solveCsp_FWD__Match_Model_MClass() {
		return getTypesOrphaned().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypesOrphaned__IsAppropriate_checkCsp_FWD__CSP() {
		return getTypesOrphaned().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypesOrphaned__IsApplicable_solveCsp_FWD__IsApplicableMatch_ModelToTypeGraph_Model_TypeGraph_MClass_TClass_TypeToTAbstractType() {
		return getTypesOrphaned().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypesOrphaned__IsApplicable_checkCsp_FWD__CSP() {
		return getTypesOrphaned().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypesOrphaned__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getTypesOrphaned().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypesOrphaned__CheckTypes_FWD__Match() {
		return getTypesOrphaned().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypesOrphaned__IsAppropriate_BWD__Match_TypeGraph_TClass() {
		return getTypesOrphaned().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypesOrphaned__Perform_BWD__IsApplicableMatch() {
		return getTypesOrphaned().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypesOrphaned__IsApplicable_BWD__Match() {
		return getTypesOrphaned().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypesOrphaned__RegisterObjectsToMatch_BWD__Match_TypeGraph_TClass() {
		return getTypesOrphaned().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypesOrphaned__IsAppropriate_solveCsp_BWD__Match_TypeGraph_TClass() {
		return getTypesOrphaned().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypesOrphaned__IsAppropriate_checkCsp_BWD__CSP() {
		return getTypesOrphaned().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypesOrphaned__IsApplicable_solveCsp_BWD__IsApplicableMatch_ModelToTypeGraph_Model_TypeGraph_MClass_TClass_TypeToTAbstractType() {
		return getTypesOrphaned().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypesOrphaned__IsApplicable_checkCsp_BWD__CSP() {
		return getTypesOrphaned().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypesOrphaned__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getTypesOrphaned().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypesOrphaned__CheckTypes_BWD__Match() {
		return getTypesOrphaned().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypesOrphaned__IsAppropriate_BWD_EMoflonEdge_12__EMoflonEdge() {
		return getTypesOrphaned().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypesOrphaned__IsAppropriate_FWD_EMoflonEdge_12__EMoflonEdge() {
		return getTypesOrphaned().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypesOrphaned__CheckAttributes_FWD__TripleMatch() {
		return getTypesOrphaned().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypesOrphaned__CheckAttributes_BWD__TripleMatch() {
		return getTypesOrphaned().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypesOrphaned__IsApplicable_CC__Match_Match() {
		return getTypesOrphaned().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypesOrphaned__IsApplicable_solveCsp_CC__Model_TypeGraph_MClass_TClass_Match_Match() {
		return getTypesOrphaned().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypesOrphaned__IsApplicable_checkCsp_CC__CSP() {
		return getTypesOrphaned().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypesOrphaned__CheckDEC_FWD__Model_MClass() {
		return getTypesOrphaned().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypesOrphaned__CheckDEC_BWD__TypeGraph_TClass() {
		return getTypesOrphaned().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypesOrphaned__GenerateModel__RuleEntryContainer_ModelToTypeGraph_TypeToTAbstractType() {
		return getTypesOrphaned().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypesOrphaned__GenerateModel_solveCsp_BWD__IsApplicableMatch_ModelToTypeGraph_Model_TypeGraph_MClass_TClass_TypeToTAbstractType_ModelgeneratorRuleResult() {
		return getTypesOrphaned().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypesOrphaned__GenerateModel_checkCsp_BWD__CSP() {
		return getTypesOrphaned().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLinkDefinitionToAnonymous() {
		if (linkDefinitionToAnonymousEClass == null) {
			linkDefinitionToAnonymousEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(14);
		}
		return linkDefinitionToAnonymousEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getLinkDefinitionToAnonymous__IsAppropriate_FWD__Match_ClassInstanceCreation_AnonymousClassDeclaration_MSignature_MDefinition() {
		return getLinkDefinitionToAnonymous().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getLinkDefinitionToAnonymous__Perform_FWD__IsApplicableMatch() {
		return getLinkDefinitionToAnonymous().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getLinkDefinitionToAnonymous__IsApplicable_FWD__Match() {
		return getLinkDefinitionToAnonymous().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getLinkDefinitionToAnonymous__RegisterObjectsToMatch_FWD__Match_ClassInstanceCreation_AnonymousClassDeclaration_MSignature_MDefinition() {
		return getLinkDefinitionToAnonymous().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getLinkDefinitionToAnonymous__IsAppropriate_solveCsp_FWD__Match_ClassInstanceCreation_AnonymousClassDeclaration_MSignature_MDefinition() {
		return getLinkDefinitionToAnonymous().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getLinkDefinitionToAnonymous__IsAppropriate_checkCsp_FWD__CSP() {
		return getLinkDefinitionToAnonymous().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getLinkDefinitionToAnonymous__IsApplicable_solveCsp_FWD__IsApplicableMatch_ClassInstanceCreation_AnonymousClassDeclaration_MSignature_TSignature_MSignatureToTSignature_TClass_MDefinition_AnonymousClassDeclarationToTClass_TMember_MDefinitionToTMember() {
		return getLinkDefinitionToAnonymous().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getLinkDefinitionToAnonymous__IsApplicable_checkCsp_FWD__CSP() {
		return getLinkDefinitionToAnonymous().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getLinkDefinitionToAnonymous__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getLinkDefinitionToAnonymous().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getLinkDefinitionToAnonymous__CheckTypes_FWD__Match() {
		return getLinkDefinitionToAnonymous().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getLinkDefinitionToAnonymous__IsAppropriate_BWD__Match_TSignature_TClass_TMember() {
		return getLinkDefinitionToAnonymous().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getLinkDefinitionToAnonymous__Perform_BWD__IsApplicableMatch() {
		return getLinkDefinitionToAnonymous().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getLinkDefinitionToAnonymous__IsApplicable_BWD__Match() {
		return getLinkDefinitionToAnonymous().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getLinkDefinitionToAnonymous__RegisterObjectsToMatch_BWD__Match_TSignature_TClass_TMember() {
		return getLinkDefinitionToAnonymous().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getLinkDefinitionToAnonymous__IsAppropriate_solveCsp_BWD__Match_TSignature_TClass_TMember() {
		return getLinkDefinitionToAnonymous().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getLinkDefinitionToAnonymous__IsAppropriate_checkCsp_BWD__CSP() {
		return getLinkDefinitionToAnonymous().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getLinkDefinitionToAnonymous__IsApplicable_solveCsp_BWD__IsApplicableMatch_ClassInstanceCreation_AnonymousClassDeclaration_MSignature_TSignature_MSignatureToTSignature_TClass_MDefinition_AnonymousClassDeclarationToTClass_TMember_MDefinitionToTMember() {
		return getLinkDefinitionToAnonymous().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getLinkDefinitionToAnonymous__IsApplicable_checkCsp_BWD__CSP() {
		return getLinkDefinitionToAnonymous().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getLinkDefinitionToAnonymous__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getLinkDefinitionToAnonymous().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getLinkDefinitionToAnonymous__CheckTypes_BWD__Match() {
		return getLinkDefinitionToAnonymous().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getLinkDefinitionToAnonymous__IsAppropriate_BWD_EMoflonEdge_13__EMoflonEdge() {
		return getLinkDefinitionToAnonymous().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getLinkDefinitionToAnonymous__IsAppropriate_FWD_EMoflonEdge_13__EMoflonEdge() {
		return getLinkDefinitionToAnonymous().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getLinkDefinitionToAnonymous__CheckAttributes_FWD__TripleMatch() {
		return getLinkDefinitionToAnonymous().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getLinkDefinitionToAnonymous__CheckAttributes_BWD__TripleMatch() {
		return getLinkDefinitionToAnonymous().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getLinkDefinitionToAnonymous__IsApplicable_CC__Match_Match() {
		return getLinkDefinitionToAnonymous().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getLinkDefinitionToAnonymous__IsApplicable_solveCsp_CC__ClassInstanceCreation_AnonymousClassDeclaration_MSignature_TSignature_TClass_MDefinition_TMember_Match_Match() {
		return getLinkDefinitionToAnonymous().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getLinkDefinitionToAnonymous__IsApplicable_checkCsp_CC__CSP() {
		return getLinkDefinitionToAnonymous().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getLinkDefinitionToAnonymous__CheckDEC_FWD__ClassInstanceCreation_AnonymousClassDeclaration_MSignature_MDefinition() {
		return getLinkDefinitionToAnonymous().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getLinkDefinitionToAnonymous__CheckDEC_BWD__TSignature_TClass_TMember() {
		return getLinkDefinitionToAnonymous().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getLinkDefinitionToAnonymous__GenerateModel__RuleEntryContainer_AnonymousClassDeclarationToTClass_MDefinitionToTMember() {
		return getLinkDefinitionToAnonymous().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getLinkDefinitionToAnonymous__GenerateModel_solveCsp_BWD__IsApplicableMatch_ClassInstanceCreation_AnonymousClassDeclaration_MSignature_TSignature_MSignatureToTSignature_TClass_MDefinition_AnonymousClassDeclarationToTClass_TMember_MDefinitionToTMember_ModelgeneratorRuleResult() {
		return getLinkDefinitionToAnonymous().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getLinkDefinitionToAnonymous__GenerateModel_checkCsp_BWD__CSP() {
		return getLinkDefinitionToAnonymous().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFieldAccessReadWrite() {
		if (fieldAccessReadWriteEClass == null) {
			fieldAccessReadWriteEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(15);
		}
		return fieldAccessReadWriteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldAccessReadWrite__IsAppropriate_FWD__Match_MSingleVariableAccess_VariableDeclarationFragment_MFieldDefinition_MDefinition() {
		return getFieldAccessReadWrite().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldAccessReadWrite__Perform_FWD__IsApplicableMatch() {
		return getFieldAccessReadWrite().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldAccessReadWrite__IsApplicable_FWD__Match() {
		return getFieldAccessReadWrite().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldAccessReadWrite__RegisterObjectsToMatch_FWD__Match_MSingleVariableAccess_VariableDeclarationFragment_MFieldDefinition_MDefinition() {
		return getFieldAccessReadWrite().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldAccessReadWrite__IsAppropriate_solveCsp_FWD__Match_MSingleVariableAccess_VariableDeclarationFragment_MFieldDefinition_MDefinition() {
		return getFieldAccessReadWrite().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldAccessReadWrite__IsAppropriate_checkCsp_FWD__CSP() {
		return getFieldAccessReadWrite().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldAccessReadWrite__IsApplicable_solveCsp_FWD__IsApplicableMatch_MSingleVariableAccess_MDefinitionToTMember_VariableDeclarationFragment_TMember_MFieldDefinition_MDefinitionToTMember_MDefinition_TFieldDefinition() {
		return getFieldAccessReadWrite().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldAccessReadWrite__IsApplicable_checkCsp_FWD__CSP() {
		return getFieldAccessReadWrite().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldAccessReadWrite__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getFieldAccessReadWrite().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldAccessReadWrite__CheckTypes_FWD__Match() {
		return getFieldAccessReadWrite().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldAccessReadWrite__IsAppropriate_BWD__Match_TMember_TReadWrite_TFieldDefinition() {
		return getFieldAccessReadWrite().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldAccessReadWrite__Perform_BWD__IsApplicableMatch() {
		return getFieldAccessReadWrite().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldAccessReadWrite__IsApplicable_BWD__Match() {
		return getFieldAccessReadWrite().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldAccessReadWrite__RegisterObjectsToMatch_BWD__Match_TMember_TReadWrite_TFieldDefinition() {
		return getFieldAccessReadWrite().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldAccessReadWrite__IsAppropriate_solveCsp_BWD__Match_TMember_TReadWrite_TFieldDefinition() {
		return getFieldAccessReadWrite().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldAccessReadWrite__IsAppropriate_checkCsp_BWD__CSP() {
		return getFieldAccessReadWrite().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldAccessReadWrite__IsApplicable_solveCsp_BWD__IsApplicableMatch_MDefinitionToTMember_VariableDeclarationFragment_TMember_MFieldDefinition_TReadWrite_MDefinitionToTMember_MDefinition_TFieldDefinition() {
		return getFieldAccessReadWrite().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldAccessReadWrite__IsApplicable_checkCsp_BWD__CSP() {
		return getFieldAccessReadWrite().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldAccessReadWrite__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getFieldAccessReadWrite().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldAccessReadWrite__CheckTypes_BWD__Match() {
		return getFieldAccessReadWrite().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldAccessReadWrite__IsAppropriate_BWD_EMoflonEdge_14__EMoflonEdge() {
		return getFieldAccessReadWrite().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldAccessReadWrite__IsAppropriate_FWD_EMoflonEdge_14__EMoflonEdge() {
		return getFieldAccessReadWrite().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldAccessReadWrite__CheckAttributes_FWD__TripleMatch() {
		return getFieldAccessReadWrite().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldAccessReadWrite__CheckAttributes_BWD__TripleMatch() {
		return getFieldAccessReadWrite().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldAccessReadWrite__IsApplicable_CC__Match_Match() {
		return getFieldAccessReadWrite().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldAccessReadWrite__IsApplicable_solveCsp_CC__MSingleVariableAccess_VariableDeclarationFragment_TMember_MFieldDefinition_TReadWrite_MDefinition_TFieldDefinition_Match_Match() {
		return getFieldAccessReadWrite().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldAccessReadWrite__IsApplicable_checkCsp_CC__CSP() {
		return getFieldAccessReadWrite().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldAccessReadWrite__CheckDEC_FWD__MSingleVariableAccess_VariableDeclarationFragment_MFieldDefinition_MDefinition() {
		return getFieldAccessReadWrite().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldAccessReadWrite__CheckDEC_BWD__TMember_TReadWrite_TFieldDefinition() {
		return getFieldAccessReadWrite().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldAccessReadWrite__GenerateModel__RuleEntryContainer_MDefinitionToTMember_MDefinitionToTMember() {
		return getFieldAccessReadWrite().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldAccessReadWrite__GenerateModel_solveCsp_BWD__IsApplicableMatch_MDefinitionToTMember_VariableDeclarationFragment_TMember_MFieldDefinition_MDefinitionToTMember_MDefinition_TFieldDefinition_ModelgeneratorRuleResult() {
		return getFieldAccessReadWrite().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldAccessReadWrite__GenerateModel_checkCsp_BWD__CSP() {
		return getFieldAccessReadWrite().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getClassInnerClassMember() {
		if (classInnerClassMemberEClass == null) {
			classInnerClassMemberEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(16);
		}
		return classInnerClassMemberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassInnerClassMember__IsAppropriate_FWD__Match_MClass_ClassDeclaration_MAbstractMethodDefinition() {
		return getClassInnerClassMember().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassInnerClassMember__Perform_FWD__IsApplicableMatch() {
		return getClassInnerClassMember().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassInnerClassMember__IsApplicable_FWD__Match() {
		return getClassInnerClassMember().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassInnerClassMember__RegisterObjectsToMatch_FWD__Match_MClass_ClassDeclaration_MAbstractMethodDefinition() {
		return getClassInnerClassMember().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassInnerClassMember__IsAppropriate_solveCsp_FWD__Match_MClass_ClassDeclaration_MAbstractMethodDefinition() {
		return getClassInnerClassMember().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassInnerClassMember__IsAppropriate_checkCsp_FWD__CSP() {
		return getClassInnerClassMember().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassInnerClassMember__IsApplicable_solveCsp_FWD__IsApplicableMatch_TPackage_MClass_TypeGraph_ClassDeclaration_MAbstractMethodDefinition_TClass_TypeToTAbstractType() {
		return getClassInnerClassMember().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassInnerClassMember__IsApplicable_checkCsp_FWD__CSP() {
		return getClassInnerClassMember().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassInnerClassMember__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getClassInnerClassMember().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassInnerClassMember__CheckTypes_FWD__Match() {
		return getClassInnerClassMember().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassInnerClassMember__IsAppropriate_BWD__Match_TPackage_TypeGraph_TClass_TClass() {
		return getClassInnerClassMember().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassInnerClassMember__Perform_BWD__IsApplicableMatch() {
		return getClassInnerClassMember().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassInnerClassMember__IsApplicable_BWD__Match() {
		return getClassInnerClassMember().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassInnerClassMember__RegisterObjectsToMatch_BWD__Match_TPackage_TypeGraph_TClass_TClass() {
		return getClassInnerClassMember().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassInnerClassMember__IsAppropriate_solveCsp_BWD__Match_TPackage_TypeGraph_TClass_TClass() {
		return getClassInnerClassMember().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassInnerClassMember__IsAppropriate_checkCsp_BWD__CSP() {
		return getClassInnerClassMember().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassInnerClassMember__IsApplicable_solveCsp_BWD__IsApplicableMatch_TPackage_TypeGraph_ClassDeclaration_MAbstractMethodDefinition_TClass_TClass_TypeToTAbstractType() {
		return getClassInnerClassMember().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassInnerClassMember__IsApplicable_checkCsp_BWD__CSP() {
		return getClassInnerClassMember().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassInnerClassMember__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getClassInnerClassMember().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassInnerClassMember__CheckTypes_BWD__Match() {
		return getClassInnerClassMember().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassInnerClassMember__IsAppropriate_BWD_EMoflonEdge_15__EMoflonEdge() {
		return getClassInnerClassMember().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassInnerClassMember__IsAppropriate_FWD_EMoflonEdge_15__EMoflonEdge() {
		return getClassInnerClassMember().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassInnerClassMember__CheckAttributes_FWD__TripleMatch() {
		return getClassInnerClassMember().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassInnerClassMember__CheckAttributes_BWD__TripleMatch() {
		return getClassInnerClassMember().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassInnerClassMember__IsApplicable_CC__Match_Match() {
		return getClassInnerClassMember().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassInnerClassMember__IsApplicable_solveCsp_CC__TPackage_MClass_TypeGraph_ClassDeclaration_MAbstractMethodDefinition_TClass_TClass_Match_Match() {
		return getClassInnerClassMember().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassInnerClassMember__IsApplicable_checkCsp_CC__CSP() {
		return getClassInnerClassMember().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassInnerClassMember__CheckDEC_FWD__MClass_ClassDeclaration_MAbstractMethodDefinition() {
		return getClassInnerClassMember().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassInnerClassMember__CheckDEC_BWD__TPackage_TypeGraph_TClass_TClass() {
		return getClassInnerClassMember().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassInnerClassMember__GenerateModel__RuleEntryContainer_TypeToTAbstractType() {
		return getClassInnerClassMember().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassInnerClassMember__GenerateModel_solveCsp_BWD__IsApplicableMatch_TPackage_TypeGraph_ClassDeclaration_MAbstractMethodDefinition_TClass_TypeToTAbstractType_ModelgeneratorRuleResult() {
		return getClassInnerClassMember().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassInnerClassMember__GenerateModel_checkCsp_BWD__CSP() {
		return getClassInnerClassMember().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPrimitiveType_Abstract() {
		if (primitiveType_AbstractEClass == null) {
			primitiveType_AbstractEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(17);
		}
		return primitiveType_AbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInitializerInAnonymous() {
		if (initializerInAnonymousEClass == null) {
			initializerInAnonymousEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(18);
		}
		return initializerInAnonymousEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitializerInAnonymous__IsAppropriate_FWD__Match_MInitializer_AnonymousClassDeclaration() {
		return getInitializerInAnonymous().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitializerInAnonymous__Perform_FWD__IsApplicableMatch() {
		return getInitializerInAnonymous().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitializerInAnonymous__IsApplicable_FWD__Match() {
		return getInitializerInAnonymous().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitializerInAnonymous__RegisterObjectsToMatch_FWD__Match_MInitializer_AnonymousClassDeclaration() {
		return getInitializerInAnonymous().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitializerInAnonymous__IsAppropriate_solveCsp_FWD__Match_MInitializer_AnonymousClassDeclaration() {
		return getInitializerInAnonymous().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitializerInAnonymous__IsAppropriate_checkCsp_FWD__CSP() {
		return getInitializerInAnonymous().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitializerInAnonymous__IsApplicable_solveCsp_FWD__IsApplicableMatch_TypeGraph_TClass_AnonymousClassDeclarationToTClass_MInitializer_AnonymousClassDeclaration() {
		return getInitializerInAnonymous().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitializerInAnonymous__IsApplicable_checkCsp_FWD__CSP() {
		return getInitializerInAnonymous().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitializerInAnonymous__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getInitializerInAnonymous().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitializerInAnonymous__CheckTypes_FWD__Match() {
		return getInitializerInAnonymous().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitializerInAnonymous__IsAppropriate_BWD__Match_TypeGraph_TMethodSignature_TClass_TModifier_TMethod_TMethodDefinition() {
		return getInitializerInAnonymous().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitializerInAnonymous__Perform_BWD__IsApplicableMatch() {
		return getInitializerInAnonymous().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitializerInAnonymous__IsApplicable_BWD__Match() {
		return getInitializerInAnonymous().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitializerInAnonymous__RegisterObjectsToMatch_BWD__Match_TypeGraph_TMethodSignature_TClass_TModifier_TMethod_TMethodDefinition() {
		return getInitializerInAnonymous().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitializerInAnonymous__IsAppropriate_solveCsp_BWD__Match_TypeGraph_TMethodSignature_TClass_TModifier_TMethod_TMethodDefinition() {
		return getInitializerInAnonymous().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitializerInAnonymous__IsAppropriate_checkCsp_BWD__CSP() {
		return getInitializerInAnonymous().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitializerInAnonymous__IsApplicable_solveCsp_BWD__IsApplicableMatch_TypeGraph_TMethodSignature_TClass_AnonymousClassDeclarationToTClass_TModifier_TMethod_TMethodDefinition_AnonymousClassDeclaration() {
		return getInitializerInAnonymous().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitializerInAnonymous__IsApplicable_checkCsp_BWD__CSP() {
		return getInitializerInAnonymous().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitializerInAnonymous__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getInitializerInAnonymous().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitializerInAnonymous__CheckTypes_BWD__Match() {
		return getInitializerInAnonymous().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitializerInAnonymous__IsAppropriate_BWD_EMoflonEdge_16__EMoflonEdge() {
		return getInitializerInAnonymous().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitializerInAnonymous__IsAppropriate_FWD_EMoflonEdge_16__EMoflonEdge() {
		return getInitializerInAnonymous().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitializerInAnonymous__CheckAttributes_FWD__TripleMatch() {
		return getInitializerInAnonymous().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitializerInAnonymous__CheckAttributes_BWD__TripleMatch() {
		return getInitializerInAnonymous().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitializerInAnonymous__IsApplicable_CC__Match_Match() {
		return getInitializerInAnonymous().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitializerInAnonymous__IsApplicable_solveCsp_CC__TypeGraph_TMethodSignature_TClass_TModifier_TMethod_MInitializer_TMethodDefinition_AnonymousClassDeclaration_Match_Match() {
		return getInitializerInAnonymous().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitializerInAnonymous__IsApplicable_checkCsp_CC__CSP() {
		return getInitializerInAnonymous().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitializerInAnonymous__CheckDEC_FWD__MInitializer_AnonymousClassDeclaration() {
		return getInitializerInAnonymous().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitializerInAnonymous__CheckDEC_BWD__TypeGraph_TMethodSignature_TClass_TModifier_TMethod_TMethodDefinition() {
		return getInitializerInAnonymous().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitializerInAnonymous__GenerateModel__RuleEntryContainer_AnonymousClassDeclarationToTClass() {
		return getInitializerInAnonymous().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitializerInAnonymous__GenerateModel_solveCsp_BWD__IsApplicableMatch_TypeGraph_TClass_AnonymousClassDeclarationToTClass_AnonymousClassDeclaration_ModelgeneratorRuleResult() {
		return getInitializerInAnonymous().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitializerInAnonymous__GenerateModel_checkCsp_BWD__CSP() {
		return getInitializerInAnonymous().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInitializer() {
		if (initializerEClass == null) {
			initializerEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI).getEClassifiers()
					.get(19);
		}
		return initializerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInterfaceInAnonymous() {
		if (interfaceInAnonymousEClass == null) {
			interfaceInAnonymousEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(20);
		}
		return interfaceInAnonymousEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterfaceInAnonymous__IsAppropriate_FWD__Match_InterfaceDeclaration_AnonymousClassDeclaration() {
		return getInterfaceInAnonymous().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterfaceInAnonymous__Perform_FWD__IsApplicableMatch() {
		return getInterfaceInAnonymous().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterfaceInAnonymous__IsApplicable_FWD__Match() {
		return getInterfaceInAnonymous().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterfaceInAnonymous__RegisterObjectsToMatch_FWD__Match_InterfaceDeclaration_AnonymousClassDeclaration() {
		return getInterfaceInAnonymous().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterfaceInAnonymous__IsAppropriate_solveCsp_FWD__Match_InterfaceDeclaration_AnonymousClassDeclaration() {
		return getInterfaceInAnonymous().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterfaceInAnonymous__IsAppropriate_checkCsp_FWD__CSP() {
		return getInterfaceInAnonymous().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterfaceInAnonymous__IsApplicable_solveCsp_FWD__IsApplicableMatch_TClass_InterfaceDeclaration_TPackage_TypeGraph_AnonymousClassDeclarationToTClass_AnonymousClassDeclaration() {
		return getInterfaceInAnonymous().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterfaceInAnonymous__IsApplicable_checkCsp_FWD__CSP() {
		return getInterfaceInAnonymous().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterfaceInAnonymous__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getInterfaceInAnonymous().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterfaceInAnonymous__CheckTypes_FWD__Match() {
		return getInterfaceInAnonymous().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterfaceInAnonymous__IsAppropriate_BWD__Match_TClass_TPackage_TypeGraph_TInterface() {
		return getInterfaceInAnonymous().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterfaceInAnonymous__Perform_BWD__IsApplicableMatch() {
		return getInterfaceInAnonymous().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterfaceInAnonymous__IsApplicable_BWD__Match() {
		return getInterfaceInAnonymous().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterfaceInAnonymous__RegisterObjectsToMatch_BWD__Match_TClass_TPackage_TypeGraph_TInterface() {
		return getInterfaceInAnonymous().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterfaceInAnonymous__IsAppropriate_solveCsp_BWD__Match_TClass_TPackage_TypeGraph_TInterface() {
		return getInterfaceInAnonymous().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterfaceInAnonymous__IsAppropriate_checkCsp_BWD__CSP() {
		return getInterfaceInAnonymous().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterfaceInAnonymous__IsApplicable_solveCsp_BWD__IsApplicableMatch_TClass_TPackage_TypeGraph_TInterface_AnonymousClassDeclarationToTClass_AnonymousClassDeclaration() {
		return getInterfaceInAnonymous().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterfaceInAnonymous__IsApplicable_checkCsp_BWD__CSP() {
		return getInterfaceInAnonymous().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterfaceInAnonymous__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getInterfaceInAnonymous().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterfaceInAnonymous__CheckTypes_BWD__Match() {
		return getInterfaceInAnonymous().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterfaceInAnonymous__IsAppropriate_BWD_EMoflonEdge_17__EMoflonEdge() {
		return getInterfaceInAnonymous().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterfaceInAnonymous__IsAppropriate_FWD_EMoflonEdge_17__EMoflonEdge() {
		return getInterfaceInAnonymous().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterfaceInAnonymous__CheckAttributes_FWD__TripleMatch() {
		return getInterfaceInAnonymous().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterfaceInAnonymous__CheckAttributes_BWD__TripleMatch() {
		return getInterfaceInAnonymous().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterfaceInAnonymous__IsApplicable_CC__Match_Match() {
		return getInterfaceInAnonymous().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterfaceInAnonymous__IsApplicable_solveCsp_CC__TClass_InterfaceDeclaration_TPackage_TypeGraph_TInterface_AnonymousClassDeclaration_Match_Match() {
		return getInterfaceInAnonymous().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterfaceInAnonymous__IsApplicable_checkCsp_CC__CSP() {
		return getInterfaceInAnonymous().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterfaceInAnonymous__CheckDEC_FWD__InterfaceDeclaration_AnonymousClassDeclaration() {
		return getInterfaceInAnonymous().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterfaceInAnonymous__CheckDEC_BWD__TClass_TPackage_TypeGraph_TInterface() {
		return getInterfaceInAnonymous().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterfaceInAnonymous__GenerateModel__RuleEntryContainer_AnonymousClassDeclarationToTClass() {
		return getInterfaceInAnonymous().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterfaceInAnonymous__GenerateModel_solveCsp_BWD__IsApplicableMatch_TClass_TPackage_TypeGraph_AnonymousClassDeclarationToTClass_AnonymousClassDeclaration_ModelgeneratorRuleResult() {
		return getInterfaceInAnonymous().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterfaceInAnonymous__GenerateModel_checkCsp_BWD__CSP() {
		return getInterfaceInAnonymous().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnnotationMemberValueBooleanArray() {
		if (annotationMemberValueBooleanArrayEClass == null) {
			annotationMemberValueBooleanArrayEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(RulesPackage.eNS_URI).getEClassifiers().get(21);
		}
		return annotationMemberValueBooleanArrayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueBooleanArray__IsAppropriate_FWD__Match_Annotation_AnnotationMemberValuePair_ArrayInitializer_BodyDeclaration_BooleanLiteral() {
		return getAnnotationMemberValueBooleanArray().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueBooleanArray__Perform_FWD__IsApplicableMatch() {
		return getAnnotationMemberValueBooleanArray().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueBooleanArray__IsApplicable_FWD__Match() {
		return getAnnotationMemberValueBooleanArray().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueBooleanArray__RegisterObjectsToMatch_FWD__Match_Annotation_AnnotationMemberValuePair_ArrayInitializer_BodyDeclaration_BooleanLiteral() {
		return getAnnotationMemberValueBooleanArray().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueBooleanArray__IsAppropriate_solveCsp_FWD__Match_Annotation_AnnotationMemberValuePair_ArrayInitializer_BodyDeclaration_BooleanLiteral() {
		return getAnnotationMemberValueBooleanArray().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueBooleanArray__IsAppropriate_checkCsp_FWD__CSP() {
		return getAnnotationMemberValueBooleanArray().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueBooleanArray__IsApplicable_solveCsp_FWD__IsApplicableMatch_Annotation_AnnotationMemberValuePair_AnnotationMemberValuePairToTAnnotationValue_ArrayInitializer_BodyDeclaration_BooleanLiteral_TAnnotationValue() {
		return getAnnotationMemberValueBooleanArray().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueBooleanArray__IsApplicable_checkCsp_FWD__CSP() {
		return getAnnotationMemberValueBooleanArray().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueBooleanArray__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getAnnotationMemberValueBooleanArray().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueBooleanArray__CheckTypes_FWD__Match() {
		return getAnnotationMemberValueBooleanArray().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueBooleanArray__IsAppropriate_BWD__Match_TBoolNode_TAnnotationValue() {
		return getAnnotationMemberValueBooleanArray().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueBooleanArray__Perform_BWD__IsApplicableMatch() {
		return getAnnotationMemberValueBooleanArray().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueBooleanArray__IsApplicable_BWD__Match() {
		return getAnnotationMemberValueBooleanArray().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueBooleanArray__RegisterObjectsToMatch_BWD__Match_TBoolNode_TAnnotationValue() {
		return getAnnotationMemberValueBooleanArray().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueBooleanArray__IsAppropriate_solveCsp_BWD__Match_TBoolNode_TAnnotationValue() {
		return getAnnotationMemberValueBooleanArray().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueBooleanArray__IsAppropriate_checkCsp_BWD__CSP() {
		return getAnnotationMemberValueBooleanArray().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueBooleanArray__IsApplicable_solveCsp_BWD__IsApplicableMatch_Annotation_AnnotationMemberValuePair_AnnotationMemberValuePairToTAnnotationValue_TBoolNode_BodyDeclaration_TAnnotationValue() {
		return getAnnotationMemberValueBooleanArray().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueBooleanArray__IsApplicable_checkCsp_BWD__CSP() {
		return getAnnotationMemberValueBooleanArray().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueBooleanArray__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getAnnotationMemberValueBooleanArray().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueBooleanArray__CheckTypes_BWD__Match() {
		return getAnnotationMemberValueBooleanArray().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueBooleanArray__IsAppropriate_BWD_EMoflonEdge_18__EMoflonEdge() {
		return getAnnotationMemberValueBooleanArray().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueBooleanArray__IsAppropriate_FWD_EMoflonEdge_18__EMoflonEdge() {
		return getAnnotationMemberValueBooleanArray().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueBooleanArray__CheckAttributes_FWD__TripleMatch() {
		return getAnnotationMemberValueBooleanArray().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueBooleanArray__CheckAttributes_BWD__TripleMatch() {
		return getAnnotationMemberValueBooleanArray().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueBooleanArray__IsApplicable_CC__Match_Match() {
		return getAnnotationMemberValueBooleanArray().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueBooleanArray__IsApplicable_solveCsp_CC__Annotation_AnnotationMemberValuePair_ArrayInitializer_TBoolNode_BodyDeclaration_BooleanLiteral_TAnnotationValue_Match_Match() {
		return getAnnotationMemberValueBooleanArray().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueBooleanArray__IsApplicable_checkCsp_CC__CSP() {
		return getAnnotationMemberValueBooleanArray().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueBooleanArray__CheckDEC_FWD__Annotation_AnnotationMemberValuePair_ArrayInitializer_BodyDeclaration_BooleanLiteral() {
		return getAnnotationMemberValueBooleanArray().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueBooleanArray__CheckDEC_BWD__TBoolNode_TAnnotationValue() {
		return getAnnotationMemberValueBooleanArray().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueBooleanArray__GenerateModel__RuleEntryContainer_AnnotationMemberValuePairToTAnnotationValue() {
		return getAnnotationMemberValueBooleanArray().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueBooleanArray__GenerateModel_solveCsp_BWD__IsApplicableMatch_Annotation_AnnotationMemberValuePair_AnnotationMemberValuePairToTAnnotationValue_BodyDeclaration_TAnnotationValue_ModelgeneratorRuleResult() {
		return getAnnotationMemberValueBooleanArray().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueBooleanArray__GenerateModel_checkCsp_BWD__CSP() {
		return getAnnotationMemberValueBooleanArray().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPackageToPGPackage() {
		if (packageToPGPackageEClass == null) {
			packageToPGPackageEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(22);
		}
		return packageToPGPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPackageToPGPackage__IsAppropriate_FWD__Match_Model_Package() {
		return getPackageToPGPackage().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPackageToPGPackage__Perform_FWD__IsApplicableMatch() {
		return getPackageToPGPackage().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPackageToPGPackage__IsApplicable_FWD__Match() {
		return getPackageToPGPackage().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPackageToPGPackage__RegisterObjectsToMatch_FWD__Match_Model_Package() {
		return getPackageToPGPackage().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPackageToPGPackage__IsAppropriate_solveCsp_FWD__Match_Model_Package() {
		return getPackageToPGPackage().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPackageToPGPackage__IsAppropriate_checkCsp_FWD__CSP() {
		return getPackageToPGPackage().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPackageToPGPackage__IsApplicable_solveCsp_FWD__IsApplicableMatch_TypeGraph_Model_ModelToTypeGraph_Package() {
		return getPackageToPGPackage().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPackageToPGPackage__IsApplicable_checkCsp_FWD__CSP() {
		return getPackageToPGPackage().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPackageToPGPackage__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getPackageToPGPackage().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPackageToPGPackage__CheckTypes_FWD__Match() {
		return getPackageToPGPackage().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPackageToPGPackage__IsAppropriate_BWD__Match_TypeGraph_TPackage() {
		return getPackageToPGPackage().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPackageToPGPackage__Perform_BWD__IsApplicableMatch() {
		return getPackageToPGPackage().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPackageToPGPackage__IsApplicable_BWD__Match() {
		return getPackageToPGPackage().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPackageToPGPackage__RegisterObjectsToMatch_BWD__Match_TypeGraph_TPackage() {
		return getPackageToPGPackage().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPackageToPGPackage__IsAppropriate_solveCsp_BWD__Match_TypeGraph_TPackage() {
		return getPackageToPGPackage().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPackageToPGPackage__IsAppropriate_checkCsp_BWD__CSP() {
		return getPackageToPGPackage().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPackageToPGPackage__IsApplicable_solveCsp_BWD__IsApplicableMatch_TypeGraph_Model_TPackage_ModelToTypeGraph() {
		return getPackageToPGPackage().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPackageToPGPackage__IsApplicable_checkCsp_BWD__CSP() {
		return getPackageToPGPackage().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPackageToPGPackage__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getPackageToPGPackage().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPackageToPGPackage__CheckTypes_BWD__Match() {
		return getPackageToPGPackage().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPackageToPGPackage__IsAppropriate_BWD_EMoflonEdge_19__EMoflonEdge() {
		return getPackageToPGPackage().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPackageToPGPackage__IsAppropriate_FWD_EMoflonEdge_19__EMoflonEdge() {
		return getPackageToPGPackage().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPackageToPGPackage__CheckAttributes_FWD__TripleMatch() {
		return getPackageToPGPackage().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPackageToPGPackage__CheckAttributes_BWD__TripleMatch() {
		return getPackageToPGPackage().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPackageToPGPackage__IsApplicable_CC__Match_Match() {
		return getPackageToPGPackage().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPackageToPGPackage__IsApplicable_solveCsp_CC__TypeGraph_Model_TPackage_Package_Match_Match() {
		return getPackageToPGPackage().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPackageToPGPackage__IsApplicable_checkCsp_CC__CSP() {
		return getPackageToPGPackage().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPackageToPGPackage__CheckDEC_FWD__Model_Package() {
		return getPackageToPGPackage().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPackageToPGPackage__CheckDEC_BWD__TypeGraph_TPackage() {
		return getPackageToPGPackage().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPackageToPGPackage__GenerateModel__RuleEntryContainer_ModelToTypeGraph() {
		return getPackageToPGPackage().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPackageToPGPackage__GenerateModel_solveCsp_BWD__IsApplicableMatch_TypeGraph_Model_ModelToTypeGraph_ModelgeneratorRuleResult() {
		return getPackageToPGPackage().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPackageToPGPackage__GenerateModel_checkCsp_BWD__CSP() {
		return getPackageToPGPackage().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSubPackageToPGPackage() {
		if (subPackageToPGPackageEClass == null) {
			subPackageToPGPackageEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(23);
		}
		return subPackageToPGPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubPackageToPGPackage__IsAppropriate_FWD__Match_Package_Package() {
		return getSubPackageToPGPackage().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubPackageToPGPackage__Perform_FWD__IsApplicableMatch() {
		return getSubPackageToPGPackage().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubPackageToPGPackage__IsApplicable_FWD__Match() {
		return getSubPackageToPGPackage().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubPackageToPGPackage__RegisterObjectsToMatch_FWD__Match_Package_Package() {
		return getSubPackageToPGPackage().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubPackageToPGPackage__IsAppropriate_solveCsp_FWD__Match_Package_Package() {
		return getSubPackageToPGPackage().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubPackageToPGPackage__IsAppropriate_checkCsp_FWD__CSP() {
		return getSubPackageToPGPackage().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubPackageToPGPackage__IsApplicable_solveCsp_FWD__IsApplicableMatch_TypeGraph_TPackage_Package_Package_PackageToTPackage() {
		return getSubPackageToPGPackage().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubPackageToPGPackage__IsApplicable_checkCsp_FWD__CSP() {
		return getSubPackageToPGPackage().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubPackageToPGPackage__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getSubPackageToPGPackage().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubPackageToPGPackage__CheckTypes_FWD__Match() {
		return getSubPackageToPGPackage().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubPackageToPGPackage__IsAppropriate_BWD__Match_TypeGraph_TPackage_TPackage() {
		return getSubPackageToPGPackage().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubPackageToPGPackage__Perform_BWD__IsApplicableMatch() {
		return getSubPackageToPGPackage().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubPackageToPGPackage__IsApplicable_BWD__Match() {
		return getSubPackageToPGPackage().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubPackageToPGPackage__RegisterObjectsToMatch_BWD__Match_TypeGraph_TPackage_TPackage() {
		return getSubPackageToPGPackage().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubPackageToPGPackage__IsAppropriate_solveCsp_BWD__Match_TypeGraph_TPackage_TPackage() {
		return getSubPackageToPGPackage().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubPackageToPGPackage__IsAppropriate_checkCsp_BWD__CSP() {
		return getSubPackageToPGPackage().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubPackageToPGPackage__IsApplicable_solveCsp_BWD__IsApplicableMatch_TypeGraph_TPackage_Package_PackageToTPackage_TPackage() {
		return getSubPackageToPGPackage().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubPackageToPGPackage__IsApplicable_checkCsp_BWD__CSP() {
		return getSubPackageToPGPackage().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubPackageToPGPackage__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getSubPackageToPGPackage().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubPackageToPGPackage__CheckTypes_BWD__Match() {
		return getSubPackageToPGPackage().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubPackageToPGPackage__IsAppropriate_BWD_EMoflonEdge_20__EMoflonEdge() {
		return getSubPackageToPGPackage().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubPackageToPGPackage__IsAppropriate_FWD_EMoflonEdge_20__EMoflonEdge() {
		return getSubPackageToPGPackage().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubPackageToPGPackage__CheckAttributes_FWD__TripleMatch() {
		return getSubPackageToPGPackage().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubPackageToPGPackage__CheckAttributes_BWD__TripleMatch() {
		return getSubPackageToPGPackage().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubPackageToPGPackage__IsApplicable_CC__Match_Match() {
		return getSubPackageToPGPackage().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubPackageToPGPackage__IsApplicable_solveCsp_CC__TypeGraph_TPackage_Package_Package_TPackage_Match_Match() {
		return getSubPackageToPGPackage().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubPackageToPGPackage__IsApplicable_checkCsp_CC__CSP() {
		return getSubPackageToPGPackage().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubPackageToPGPackage__CheckDEC_FWD__Package_Package() {
		return getSubPackageToPGPackage().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubPackageToPGPackage__CheckDEC_BWD__TypeGraph_TPackage_TPackage() {
		return getSubPackageToPGPackage().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubPackageToPGPackage__GenerateModel__RuleEntryContainer_PackageToTPackage() {
		return getSubPackageToPGPackage().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubPackageToPGPackage__GenerateModel_solveCsp_BWD__IsApplicableMatch_TypeGraph_TPackage_Package_PackageToTPackage_ModelgeneratorRuleResult() {
		return getSubPackageToPGPackage().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubPackageToPGPackage__GenerateModel_checkCsp_BWD__CSP() {
		return getSubPackageToPGPackage().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMethodDefinition() {
		if (methodDefinitionEClass == null) {
			methodDefinitionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(24);
		}
		return methodDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodDefinition__IsAppropriate_FWD__Match_MMethodDefinition_TypeAccess_Type_MMethodSignature() {
		return getMethodDefinition().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodDefinition__Perform_FWD__IsApplicableMatch() {
		return getMethodDefinition().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodDefinition__IsApplicable_FWD__Match() {
		return getMethodDefinition().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodDefinition__RegisterObjectsToMatch_FWD__Match_MMethodDefinition_TypeAccess_Type_MMethodSignature() {
		return getMethodDefinition().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodDefinition__IsAppropriate_solveCsp_FWD__Match_MMethodDefinition_TypeAccess_Type_MMethodSignature() {
		return getMethodDefinition().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodDefinition__IsAppropriate_checkCsp_FWD__CSP() {
		return getMethodDefinition().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodDefinition__IsApplicable_solveCsp_FWD__IsApplicableMatch_TypeToTAbstractType_TAbstractType_TMethodSignature_MSignatureToTSignature_MMethodDefinition_TypeAccess_Type_MMethodSignature() {
		return getMethodDefinition().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodDefinition__IsApplicable_checkCsp_FWD__CSP() {
		return getMethodDefinition().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodDefinition__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getMethodDefinition().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodDefinition__CheckTypes_FWD__Match() {
		return getMethodDefinition().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodDefinition__IsAppropriate_BWD__Match_TAbstractType_TMethodSignature_TMethodDefinition() {
		return getMethodDefinition().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodDefinition__Perform_BWD__IsApplicableMatch() {
		return getMethodDefinition().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodDefinition__IsApplicable_BWD__Match() {
		return getMethodDefinition().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodDefinition__RegisterObjectsToMatch_BWD__Match_TAbstractType_TMethodSignature_TMethodDefinition() {
		return getMethodDefinition().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodDefinition__IsAppropriate_solveCsp_BWD__Match_TAbstractType_TMethodSignature_TMethodDefinition() {
		return getMethodDefinition().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodDefinition__IsAppropriate_checkCsp_BWD__CSP() {
		return getMethodDefinition().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodDefinition__IsApplicable_solveCsp_BWD__IsApplicableMatch_TypeToTAbstractType_TAbstractType_TMethodSignature_MSignatureToTSignature_TMethodDefinition_Type_MMethodSignature() {
		return getMethodDefinition().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodDefinition__IsApplicable_checkCsp_BWD__CSP() {
		return getMethodDefinition().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodDefinition__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getMethodDefinition().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodDefinition__CheckTypes_BWD__Match() {
		return getMethodDefinition().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodDefinition__IsAppropriate_BWD_EMoflonEdge_21__EMoflonEdge() {
		return getMethodDefinition().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodDefinition__IsAppropriate_FWD_EMoflonEdge_21__EMoflonEdge() {
		return getMethodDefinition().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodDefinition__CheckAttributes_FWD__TripleMatch() {
		return getMethodDefinition().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodDefinition__CheckAttributes_BWD__TripleMatch() {
		return getMethodDefinition().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodDefinition__IsApplicable_CC__Match_Match() {
		return getMethodDefinition().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodDefinition__IsApplicable_solveCsp_CC__TAbstractType_TMethodSignature_TMethodDefinition_MMethodDefinition_TypeAccess_Type_MMethodSignature_Match_Match() {
		return getMethodDefinition().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodDefinition__IsApplicable_checkCsp_CC__CSP() {
		return getMethodDefinition().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodDefinition__CheckDEC_FWD__MMethodDefinition_TypeAccess_Type_MMethodSignature() {
		return getMethodDefinition().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodDefinition__CheckDEC_BWD__TAbstractType_TMethodSignature_TMethodDefinition() {
		return getMethodDefinition().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodDefinition__GenerateModel__RuleEntryContainer_TypeToTAbstractType_MSignatureToTSignature() {
		return getMethodDefinition().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodDefinition__GenerateModel_solveCsp_BWD__IsApplicableMatch_TypeToTAbstractType_TAbstractType_TMethodSignature_MSignatureToTSignature_Type_MMethodSignature_ModelgeneratorRuleResult() {
		return getMethodDefinition().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodDefinition__GenerateModel_checkCsp_BWD__CSP() {
		return getMethodDefinition().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMethodSignature() {
		if (methodSignatureEClass == null) {
			methodSignatureEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(25);
		}
		return methodSignatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodSignature__IsAppropriate_FWD__Match_Type_MMethodSignature_MMethodName() {
		return getMethodSignature().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodSignature__Perform_FWD__IsApplicableMatch() {
		return getMethodSignature().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodSignature__IsApplicable_FWD__Match() {
		return getMethodSignature().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodSignature__RegisterObjectsToMatch_FWD__Match_Type_MMethodSignature_MMethodName() {
		return getMethodSignature().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodSignature__IsAppropriate_solveCsp_FWD__Match_Type_MMethodSignature_MMethodName() {
		return getMethodSignature().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodSignature__IsAppropriate_checkCsp_FWD__CSP() {
		return getMethodSignature().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodSignature__IsApplicable_solveCsp_FWD__IsApplicableMatch_TypeToTAbstractType_TMethod_Type_MMethodSignature_MMethodName_TAbstractType_MMethodNameToTMethod() {
		return getMethodSignature().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodSignature__IsApplicable_checkCsp_FWD__CSP() {
		return getMethodSignature().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodSignature__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getMethodSignature().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodSignature__CheckTypes_FWD__Match() {
		return getMethodSignature().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodSignature__IsAppropriate_BWD__Match_TMethod_TMethodSignature_TAbstractType() {
		return getMethodSignature().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodSignature__Perform_BWD__IsApplicableMatch() {
		return getMethodSignature().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodSignature__IsApplicable_BWD__Match() {
		return getMethodSignature().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodSignature__RegisterObjectsToMatch_BWD__Match_TMethod_TMethodSignature_TAbstractType() {
		return getMethodSignature().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodSignature__IsAppropriate_solveCsp_BWD__Match_TMethod_TMethodSignature_TAbstractType() {
		return getMethodSignature().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodSignature__IsAppropriate_checkCsp_BWD__CSP() {
		return getMethodSignature().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodSignature__IsApplicable_solveCsp_BWD__IsApplicableMatch_TypeToTAbstractType_TMethod_TMethodSignature_Type_MMethodName_TAbstractType_MMethodNameToTMethod() {
		return getMethodSignature().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodSignature__IsApplicable_checkCsp_BWD__CSP() {
		return getMethodSignature().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodSignature__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getMethodSignature().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodSignature__CheckTypes_BWD__Match() {
		return getMethodSignature().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodSignature__IsAppropriate_BWD_EMoflonEdge_22__EMoflonEdge() {
		return getMethodSignature().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodSignature__IsAppropriate_FWD_EMoflonEdge_22__EMoflonEdge() {
		return getMethodSignature().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodSignature__CheckAttributes_FWD__TripleMatch() {
		return getMethodSignature().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodSignature__CheckAttributes_BWD__TripleMatch() {
		return getMethodSignature().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodSignature__IsApplicable_CC__Match_Match() {
		return getMethodSignature().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodSignature__IsApplicable_solveCsp_CC__TMethod_TMethodSignature_Type_MMethodSignature_MMethodName_TAbstractType_Match_Match() {
		return getMethodSignature().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodSignature__IsApplicable_checkCsp_CC__CSP() {
		return getMethodSignature().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodSignature__CheckDEC_FWD__Type_MMethodSignature_MMethodName() {
		return getMethodSignature().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodSignature__CheckDEC_BWD__TMethod_TMethodSignature_TAbstractType() {
		return getMethodSignature().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodSignature__GenerateModel__RuleEntryContainer_TypeToTAbstractType_MMethodNameToTMethod() {
		return getMethodSignature().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodSignature__GenerateModel_solveCsp_BWD__IsApplicableMatch_TypeToTAbstractType_TMethod_Type_MMethodName_TAbstractType_MMethodNameToTMethod_ModelgeneratorRuleResult() {
		return getMethodSignature().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodSignature__GenerateModel_checkCsp_BWD__CSP() {
		return getMethodSignature().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnonymousClassInAnonymous() {
		if (anonymousClassInAnonymousEClass == null) {
			anonymousClassInAnonymousEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(26);
		}
		return anonymousClassInAnonymousEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClassInAnonymous__IsAppropriate_FWD__Match_ClassInstanceCreation_MDefinition_AnonymousClassDeclaration_AnonymousClassDeclaration() {
		return getAnonymousClassInAnonymous().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClassInAnonymous__Perform_FWD__IsApplicableMatch() {
		return getAnonymousClassInAnonymous().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClassInAnonymous__IsApplicable_FWD__Match() {
		return getAnonymousClassInAnonymous().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClassInAnonymous__RegisterObjectsToMatch_FWD__Match_ClassInstanceCreation_MDefinition_AnonymousClassDeclaration_AnonymousClassDeclaration() {
		return getAnonymousClassInAnonymous().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClassInAnonymous__IsAppropriate_solveCsp_FWD__Match_ClassInstanceCreation_MDefinition_AnonymousClassDeclaration_AnonymousClassDeclaration() {
		return getAnonymousClassInAnonymous().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClassInAnonymous__IsAppropriate_checkCsp_FWD__CSP() {
		return getAnonymousClassInAnonymous().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClassInAnonymous__IsApplicable_solveCsp_FWD__IsApplicableMatch_MDefinitionToTMember_ClassInstanceCreation_AnonymousClassDeclarationToTClass_TClass_TMember_TPackage_TypeGraph_MDefinition_AnonymousClassDeclaration_AnonymousClassDeclaration() {
		return getAnonymousClassInAnonymous().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClassInAnonymous__IsApplicable_checkCsp_FWD__CSP() {
		return getAnonymousClassInAnonymous().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClassInAnonymous__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getAnonymousClassInAnonymous().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClassInAnonymous__CheckTypes_FWD__Match() {
		return getAnonymousClassInAnonymous().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClassInAnonymous__IsAppropriate_BWD__Match_TClass_TClass_TMember_TPackage_TypeGraph() {
		return getAnonymousClassInAnonymous().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClassInAnonymous__Perform_BWD__IsApplicableMatch() {
		return getAnonymousClassInAnonymous().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClassInAnonymous__IsApplicable_BWD__Match() {
		return getAnonymousClassInAnonymous().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClassInAnonymous__RegisterObjectsToMatch_BWD__Match_TClass_TClass_TMember_TPackage_TypeGraph() {
		return getAnonymousClassInAnonymous().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClassInAnonymous__IsAppropriate_solveCsp_BWD__Match_TClass_TClass_TMember_TPackage_TypeGraph() {
		return getAnonymousClassInAnonymous().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClassInAnonymous__IsAppropriate_checkCsp_BWD__CSP() {
		return getAnonymousClassInAnonymous().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClassInAnonymous__IsApplicable_solveCsp_BWD__IsApplicableMatch_MDefinitionToTMember_ClassInstanceCreation_TClass_AnonymousClassDeclarationToTClass_TClass_TMember_TPackage_TypeGraph_MDefinition_AnonymousClassDeclaration() {
		return getAnonymousClassInAnonymous().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClassInAnonymous__IsApplicable_checkCsp_BWD__CSP() {
		return getAnonymousClassInAnonymous().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClassInAnonymous__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getAnonymousClassInAnonymous().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClassInAnonymous__CheckTypes_BWD__Match() {
		return getAnonymousClassInAnonymous().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClassInAnonymous__IsAppropriate_BWD_EMoflonEdge_23__EMoflonEdge() {
		return getAnonymousClassInAnonymous().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClassInAnonymous__IsAppropriate_FWD_EMoflonEdge_23__EMoflonEdge() {
		return getAnonymousClassInAnonymous().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClassInAnonymous__CheckAttributes_FWD__TripleMatch() {
		return getAnonymousClassInAnonymous().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClassInAnonymous__CheckAttributes_BWD__TripleMatch() {
		return getAnonymousClassInAnonymous().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClassInAnonymous__IsApplicable_CC__Match_Match() {
		return getAnonymousClassInAnonymous().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClassInAnonymous__IsApplicable_solveCsp_CC__ClassInstanceCreation_TClass_TClass_TMember_TPackage_TypeGraph_MDefinition_AnonymousClassDeclaration_AnonymousClassDeclaration_Match_Match() {
		return getAnonymousClassInAnonymous().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClassInAnonymous__IsApplicable_checkCsp_CC__CSP() {
		return getAnonymousClassInAnonymous().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClassInAnonymous__CheckDEC_FWD__ClassInstanceCreation_MDefinition_AnonymousClassDeclaration_AnonymousClassDeclaration() {
		return getAnonymousClassInAnonymous().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClassInAnonymous__CheckDEC_BWD__TClass_TClass_TMember_TPackage_TypeGraph() {
		return getAnonymousClassInAnonymous().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClassInAnonymous__GenerateModel__RuleEntryContainer_MDefinitionToTMember() {
		return getAnonymousClassInAnonymous().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClassInAnonymous__GenerateModel_solveCsp_BWD__IsApplicableMatch_MDefinitionToTMember_ClassInstanceCreation_AnonymousClassDeclarationToTClass_TClass_TMember_TPackage_TypeGraph_MDefinition_AnonymousClassDeclaration_ModelgeneratorRuleResult() {
		return getAnonymousClassInAnonymous().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClassInAnonymous__GenerateModel_checkCsp_BWD__CSP() {
		return getAnonymousClassInAnonymous().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnonymousClassTypeInterface() {
		if (anonymousClassTypeInterfaceEClass == null) {
			anonymousClassTypeInterfaceEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(27);
		}
		return anonymousClassTypeInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClassTypeInterface__IsAppropriate_FWD__Match_InterfaceDeclaration_ClassInstanceCreation_AnonymousClassDeclaration_TypeAccess() {
		return getAnonymousClassTypeInterface().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClassTypeInterface__Perform_FWD__IsApplicableMatch() {
		return getAnonymousClassTypeInterface().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClassTypeInterface__IsApplicable_FWD__Match() {
		return getAnonymousClassTypeInterface().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClassTypeInterface__RegisterObjectsToMatch_FWD__Match_InterfaceDeclaration_ClassInstanceCreation_AnonymousClassDeclaration_TypeAccess() {
		return getAnonymousClassTypeInterface().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClassTypeInterface__IsAppropriate_solveCsp_FWD__Match_InterfaceDeclaration_ClassInstanceCreation_AnonymousClassDeclaration_TypeAccess() {
		return getAnonymousClassTypeInterface().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClassTypeInterface__IsAppropriate_checkCsp_FWD__CSP() {
		return getAnonymousClassTypeInterface().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClassTypeInterface__IsApplicable_solveCsp_FWD__IsApplicableMatch_InterfaceDeclaration_TClass_ClassInstanceCreation_TypeToTAbstractType_AnonymousClassDeclaration_TInterface_AnonymousClassDeclarationToTClass_TypeAccess() {
		return getAnonymousClassTypeInterface().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClassTypeInterface__IsApplicable_checkCsp_FWD__CSP() {
		return getAnonymousClassTypeInterface().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClassTypeInterface__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getAnonymousClassTypeInterface().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClassTypeInterface__CheckTypes_FWD__Match() {
		return getAnonymousClassTypeInterface().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClassTypeInterface__IsAppropriate_BWD__Match_TClass_TInterface() {
		return getAnonymousClassTypeInterface().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClassTypeInterface__Perform_BWD__IsApplicableMatch() {
		return getAnonymousClassTypeInterface().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClassTypeInterface__IsApplicable_BWD__Match() {
		return getAnonymousClassTypeInterface().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClassTypeInterface__RegisterObjectsToMatch_BWD__Match_TClass_TInterface() {
		return getAnonymousClassTypeInterface().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClassTypeInterface__IsAppropriate_solveCsp_BWD__Match_TClass_TInterface() {
		return getAnonymousClassTypeInterface().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClassTypeInterface__IsAppropriate_checkCsp_BWD__CSP() {
		return getAnonymousClassTypeInterface().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClassTypeInterface__IsApplicable_solveCsp_BWD__IsApplicableMatch_InterfaceDeclaration_TClass_ClassInstanceCreation_TypeToTAbstractType_AnonymousClassDeclaration_TInterface_AnonymousClassDeclarationToTClass() {
		return getAnonymousClassTypeInterface().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClassTypeInterface__IsApplicable_checkCsp_BWD__CSP() {
		return getAnonymousClassTypeInterface().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClassTypeInterface__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getAnonymousClassTypeInterface().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClassTypeInterface__CheckTypes_BWD__Match() {
		return getAnonymousClassTypeInterface().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClassTypeInterface__IsAppropriate_BWD_EMoflonEdge_24__EMoflonEdge() {
		return getAnonymousClassTypeInterface().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClassTypeInterface__IsAppropriate_FWD_EMoflonEdge_24__EMoflonEdge() {
		return getAnonymousClassTypeInterface().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClassTypeInterface__CheckAttributes_FWD__TripleMatch() {
		return getAnonymousClassTypeInterface().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClassTypeInterface__CheckAttributes_BWD__TripleMatch() {
		return getAnonymousClassTypeInterface().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClassTypeInterface__IsApplicable_CC__Match_Match() {
		return getAnonymousClassTypeInterface().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClassTypeInterface__IsApplicable_solveCsp_CC__InterfaceDeclaration_TClass_ClassInstanceCreation_AnonymousClassDeclaration_TInterface_TypeAccess_Match_Match() {
		return getAnonymousClassTypeInterface().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClassTypeInterface__IsApplicable_checkCsp_CC__CSP() {
		return getAnonymousClassTypeInterface().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClassTypeInterface__CheckDEC_FWD__InterfaceDeclaration_ClassInstanceCreation_AnonymousClassDeclaration_TypeAccess() {
		return getAnonymousClassTypeInterface().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClassTypeInterface__CheckDEC_BWD__TClass_TInterface() {
		return getAnonymousClassTypeInterface().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClassTypeInterface__GenerateModel__RuleEntryContainer_TypeToTAbstractType_AnonymousClassDeclarationToTClass() {
		return getAnonymousClassTypeInterface().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClassTypeInterface__GenerateModel_solveCsp_BWD__IsApplicableMatch_InterfaceDeclaration_TClass_ClassInstanceCreation_TypeToTAbstractType_AnonymousClassDeclaration_TInterface_AnonymousClassDeclarationToTClass_ModelgeneratorRuleResult() {
		return getAnonymousClassTypeInterface().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClassTypeInterface__GenerateModel_checkCsp_BWD__CSP() {
		return getAnonymousClassTypeInterface().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInterfaceInPackage() {
		if (interfaceInPackageEClass == null) {
			interfaceInPackageEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(28);
		}
		return interfaceInPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterfaceInPackage__IsAppropriate_FWD__Match_Package_InterfaceDeclaration() {
		return getInterfaceInPackage().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterfaceInPackage__Perform_FWD__IsApplicableMatch() {
		return getInterfaceInPackage().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterfaceInPackage__IsApplicable_FWD__Match() {
		return getInterfaceInPackage().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterfaceInPackage__RegisterObjectsToMatch_FWD__Match_Package_InterfaceDeclaration() {
		return getInterfaceInPackage().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterfaceInPackage__IsAppropriate_solveCsp_FWD__Match_Package_InterfaceDeclaration() {
		return getInterfaceInPackage().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterfaceInPackage__IsAppropriate_checkCsp_FWD__CSP() {
		return getInterfaceInPackage().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterfaceInPackage__IsApplicable_solveCsp_FWD__IsApplicableMatch_PackageToTPackage_TPackage_Package_TypeGraph_InterfaceDeclaration() {
		return getInterfaceInPackage().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterfaceInPackage__IsApplicable_checkCsp_FWD__CSP() {
		return getInterfaceInPackage().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterfaceInPackage__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getInterfaceInPackage().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterfaceInPackage__CheckTypes_FWD__Match() {
		return getInterfaceInPackage().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterfaceInPackage__IsAppropriate_BWD__Match_TPackage_TInterface_TypeGraph() {
		return getInterfaceInPackage().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterfaceInPackage__Perform_BWD__IsApplicableMatch() {
		return getInterfaceInPackage().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterfaceInPackage__IsApplicable_BWD__Match() {
		return getInterfaceInPackage().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterfaceInPackage__RegisterObjectsToMatch_BWD__Match_TPackage_TInterface_TypeGraph() {
		return getInterfaceInPackage().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterfaceInPackage__IsAppropriate_solveCsp_BWD__Match_TPackage_TInterface_TypeGraph() {
		return getInterfaceInPackage().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterfaceInPackage__IsAppropriate_checkCsp_BWD__CSP() {
		return getInterfaceInPackage().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterfaceInPackage__IsApplicable_solveCsp_BWD__IsApplicableMatch_PackageToTPackage_TPackage_TInterface_Package_TypeGraph() {
		return getInterfaceInPackage().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterfaceInPackage__IsApplicable_checkCsp_BWD__CSP() {
		return getInterfaceInPackage().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterfaceInPackage__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getInterfaceInPackage().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterfaceInPackage__CheckTypes_BWD__Match() {
		return getInterfaceInPackage().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterfaceInPackage__IsAppropriate_BWD_EMoflonEdge_25__EMoflonEdge() {
		return getInterfaceInPackage().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterfaceInPackage__IsAppropriate_FWD_EMoflonEdge_25__EMoflonEdge() {
		return getInterfaceInPackage().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterfaceInPackage__CheckAttributes_FWD__TripleMatch() {
		return getInterfaceInPackage().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterfaceInPackage__CheckAttributes_BWD__TripleMatch() {
		return getInterfaceInPackage().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterfaceInPackage__IsApplicable_CC__Match_Match() {
		return getInterfaceInPackage().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterfaceInPackage__IsApplicable_solveCsp_CC__TPackage_TInterface_Package_TypeGraph_InterfaceDeclaration_Match_Match() {
		return getInterfaceInPackage().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterfaceInPackage__IsApplicable_checkCsp_CC__CSP() {
		return getInterfaceInPackage().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterfaceInPackage__CheckDEC_FWD__Package_InterfaceDeclaration() {
		return getInterfaceInPackage().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterfaceInPackage__CheckDEC_BWD__TPackage_TInterface_TypeGraph() {
		return getInterfaceInPackage().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterfaceInPackage__GenerateModel__RuleEntryContainer_PackageToTPackage() {
		return getInterfaceInPackage().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterfaceInPackage__GenerateModel_solveCsp_BWD__IsApplicableMatch_PackageToTPackage_TPackage_Package_TypeGraph_ModelgeneratorRuleResult() {
		return getInterfaceInPackage().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterfaceInPackage__GenerateModel_checkCsp_BWD__CSP() {
		return getInterfaceInPackage().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUnresolvedMethodDeclaration() {
		if (unresolvedMethodDeclarationEClass == null) {
			unresolvedMethodDeclarationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(29);
		}
		return unresolvedMethodDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getUnresolvedMethodDeclaration__IsAppropriate_FWD__Match_Model_UnresolvedMethodDeclaration() {
		return getUnresolvedMethodDeclaration().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getUnresolvedMethodDeclaration__Perform_FWD__IsApplicableMatch() {
		return getUnresolvedMethodDeclaration().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getUnresolvedMethodDeclaration__IsApplicable_FWD__Match() {
		return getUnresolvedMethodDeclaration().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getUnresolvedMethodDeclaration__RegisterObjectsToMatch_FWD__Match_Model_UnresolvedMethodDeclaration() {
		return getUnresolvedMethodDeclaration().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getUnresolvedMethodDeclaration__IsAppropriate_solveCsp_FWD__Match_Model_UnresolvedMethodDeclaration() {
		return getUnresolvedMethodDeclaration().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getUnresolvedMethodDeclaration__IsAppropriate_checkCsp_FWD__CSP() {
		return getUnresolvedMethodDeclaration().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getUnresolvedMethodDeclaration__IsApplicable_solveCsp_FWD__IsApplicableMatch_ModelToTypeGraph_TypeGraph_Model_UnresolvedMethodDeclaration() {
		return getUnresolvedMethodDeclaration().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getUnresolvedMethodDeclaration__IsApplicable_checkCsp_FWD__CSP() {
		return getUnresolvedMethodDeclaration().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getUnresolvedMethodDeclaration__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getUnresolvedMethodDeclaration().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getUnresolvedMethodDeclaration__CheckTypes_FWD__Match() {
		return getUnresolvedMethodDeclaration().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getUnresolvedMethodDeclaration__IsAppropriate_BWD__Match_TMethodSignature_TypeGraph_TMethod_TMethodDefinition() {
		return getUnresolvedMethodDeclaration().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getUnresolvedMethodDeclaration__Perform_BWD__IsApplicableMatch() {
		return getUnresolvedMethodDeclaration().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getUnresolvedMethodDeclaration__IsApplicable_BWD__Match() {
		return getUnresolvedMethodDeclaration().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getUnresolvedMethodDeclaration__RegisterObjectsToMatch_BWD__Match_TMethodSignature_TypeGraph_TMethod_TMethodDefinition() {
		return getUnresolvedMethodDeclaration().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getUnresolvedMethodDeclaration__IsAppropriate_solveCsp_BWD__Match_TMethodSignature_TypeGraph_TMethod_TMethodDefinition() {
		return getUnresolvedMethodDeclaration().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getUnresolvedMethodDeclaration__IsAppropriate_checkCsp_BWD__CSP() {
		return getUnresolvedMethodDeclaration().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getUnresolvedMethodDeclaration__IsApplicable_solveCsp_BWD__IsApplicableMatch_ModelToTypeGraph_TMethodSignature_TypeGraph_TMethod_TMethodDefinition_Model() {
		return getUnresolvedMethodDeclaration().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getUnresolvedMethodDeclaration__IsApplicable_checkCsp_BWD__CSP() {
		return getUnresolvedMethodDeclaration().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getUnresolvedMethodDeclaration__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getUnresolvedMethodDeclaration().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getUnresolvedMethodDeclaration__CheckTypes_BWD__Match() {
		return getUnresolvedMethodDeclaration().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getUnresolvedMethodDeclaration__IsAppropriate_BWD_EMoflonEdge_26__EMoflonEdge() {
		return getUnresolvedMethodDeclaration().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getUnresolvedMethodDeclaration__IsAppropriate_FWD_EMoflonEdge_26__EMoflonEdge() {
		return getUnresolvedMethodDeclaration().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getUnresolvedMethodDeclaration__CheckAttributes_FWD__TripleMatch() {
		return getUnresolvedMethodDeclaration().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getUnresolvedMethodDeclaration__CheckAttributes_BWD__TripleMatch() {
		return getUnresolvedMethodDeclaration().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getUnresolvedMethodDeclaration__IsApplicable_CC__Match_Match() {
		return getUnresolvedMethodDeclaration().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getUnresolvedMethodDeclaration__IsApplicable_solveCsp_CC__TMethodSignature_TypeGraph_TMethod_TMethodDefinition_Model_UnresolvedMethodDeclaration_Match_Match() {
		return getUnresolvedMethodDeclaration().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getUnresolvedMethodDeclaration__IsApplicable_checkCsp_CC__CSP() {
		return getUnresolvedMethodDeclaration().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getUnresolvedMethodDeclaration__CheckDEC_FWD__Model_UnresolvedMethodDeclaration() {
		return getUnresolvedMethodDeclaration().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getUnresolvedMethodDeclaration__CheckDEC_BWD__TMethodSignature_TypeGraph_TMethod_TMethodDefinition() {
		return getUnresolvedMethodDeclaration().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getUnresolvedMethodDeclaration__GenerateModel__RuleEntryContainer_ModelToTypeGraph() {
		return getUnresolvedMethodDeclaration().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getUnresolvedMethodDeclaration__GenerateModel_solveCsp_BWD__IsApplicableMatch_ModelToTypeGraph_TypeGraph_Model_ModelgeneratorRuleResult() {
		return getUnresolvedMethodDeclaration().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getUnresolvedMethodDeclaration__GenerateModel_checkCsp_BWD__CSP() {
		return getUnresolvedMethodDeclaration().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getClassImplementsPatrameterizedInterface() {
		if (classImplementsPatrameterizedInterfaceEClass == null) {
			classImplementsPatrameterizedInterfaceEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(RulesPackage.eNS_URI).getEClassifiers().get(30);
		}
		return classImplementsPatrameterizedInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassImplementsPatrameterizedInterface__IsAppropriate_FWD__Match_ClassDeclaration_TypeAccess_ParameterizedType_AbstractTypeDeclaration_TypeAccess() {
		return getClassImplementsPatrameterizedInterface().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassImplementsPatrameterizedInterface__Perform_FWD__IsApplicableMatch() {
		return getClassImplementsPatrameterizedInterface().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassImplementsPatrameterizedInterface__IsApplicable_FWD__Match() {
		return getClassImplementsPatrameterizedInterface().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassImplementsPatrameterizedInterface__RegisterObjectsToMatch_FWD__Match_ClassDeclaration_TypeAccess_ParameterizedType_AbstractTypeDeclaration_TypeAccess() {
		return getClassImplementsPatrameterizedInterface().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassImplementsPatrameterizedInterface__IsAppropriate_solveCsp_FWD__Match_ClassDeclaration_TypeAccess_ParameterizedType_AbstractTypeDeclaration_TypeAccess() {
		return getClassImplementsPatrameterizedInterface().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassImplementsPatrameterizedInterface__IsAppropriate_checkCsp_FWD__CSP() {
		return getClassImplementsPatrameterizedInterface().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassImplementsPatrameterizedInterface__IsApplicable_solveCsp_FWD__IsApplicableMatch_TClass_ClassDeclaration_TypeAccess_TInterface_ParameterizedType_AbstractTypeDeclaration_TypeToTAbstractType_TypeAccess_TypeToTAbstractType() {
		return getClassImplementsPatrameterizedInterface().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassImplementsPatrameterizedInterface__IsApplicable_checkCsp_FWD__CSP() {
		return getClassImplementsPatrameterizedInterface().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassImplementsPatrameterizedInterface__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getClassImplementsPatrameterizedInterface().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassImplementsPatrameterizedInterface__CheckTypes_FWD__Match() {
		return getClassImplementsPatrameterizedInterface().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassImplementsPatrameterizedInterface__IsAppropriate_BWD__Match_TClass_TInterface() {
		return getClassImplementsPatrameterizedInterface().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassImplementsPatrameterizedInterface__Perform_BWD__IsApplicableMatch() {
		return getClassImplementsPatrameterizedInterface().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassImplementsPatrameterizedInterface__IsApplicable_BWD__Match() {
		return getClassImplementsPatrameterizedInterface().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassImplementsPatrameterizedInterface__RegisterObjectsToMatch_BWD__Match_TClass_TInterface() {
		return getClassImplementsPatrameterizedInterface().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassImplementsPatrameterizedInterface__IsAppropriate_solveCsp_BWD__Match_TClass_TInterface() {
		return getClassImplementsPatrameterizedInterface().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassImplementsPatrameterizedInterface__IsAppropriate_checkCsp_BWD__CSP() {
		return getClassImplementsPatrameterizedInterface().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassImplementsPatrameterizedInterface__IsApplicable_solveCsp_BWD__IsApplicableMatch_TClass_ClassDeclaration_TInterface_ParameterizedType_AbstractTypeDeclaration_TypeToTAbstractType_TypeAccess_TypeToTAbstractType() {
		return getClassImplementsPatrameterizedInterface().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassImplementsPatrameterizedInterface__IsApplicable_checkCsp_BWD__CSP() {
		return getClassImplementsPatrameterizedInterface().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassImplementsPatrameterizedInterface__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getClassImplementsPatrameterizedInterface().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassImplementsPatrameterizedInterface__CheckTypes_BWD__Match() {
		return getClassImplementsPatrameterizedInterface().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassImplementsPatrameterizedInterface__IsAppropriate_BWD_EMoflonEdge_27__EMoflonEdge() {
		return getClassImplementsPatrameterizedInterface().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassImplementsPatrameterizedInterface__IsAppropriate_FWD_EMoflonEdge_27__EMoflonEdge() {
		return getClassImplementsPatrameterizedInterface().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassImplementsPatrameterizedInterface__CheckAttributes_FWD__TripleMatch() {
		return getClassImplementsPatrameterizedInterface().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassImplementsPatrameterizedInterface__CheckAttributes_BWD__TripleMatch() {
		return getClassImplementsPatrameterizedInterface().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassImplementsPatrameterizedInterface__IsApplicable_CC__Match_Match() {
		return getClassImplementsPatrameterizedInterface().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassImplementsPatrameterizedInterface__IsApplicable_solveCsp_CC__TClass_ClassDeclaration_TypeAccess_TInterface_ParameterizedType_AbstractTypeDeclaration_TypeAccess_Match_Match() {
		return getClassImplementsPatrameterizedInterface().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassImplementsPatrameterizedInterface__IsApplicable_checkCsp_CC__CSP() {
		return getClassImplementsPatrameterizedInterface().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassImplementsPatrameterizedInterface__CheckDEC_FWD__ClassDeclaration_TypeAccess_ParameterizedType_AbstractTypeDeclaration_TypeAccess() {
		return getClassImplementsPatrameterizedInterface().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassImplementsPatrameterizedInterface__CheckDEC_BWD__TClass_TInterface() {
		return getClassImplementsPatrameterizedInterface().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassImplementsPatrameterizedInterface__GenerateModel__RuleEntryContainer_TypeToTAbstractType_TypeToTAbstractType() {
		return getClassImplementsPatrameterizedInterface().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassImplementsPatrameterizedInterface__GenerateModel_solveCsp_BWD__IsApplicableMatch_TClass_ClassDeclaration_TInterface_ParameterizedType_AbstractTypeDeclaration_TypeToTAbstractType_TypeAccess_TypeToTAbstractType_ModelgeneratorRuleResult() {
		return getClassImplementsPatrameterizedInterface().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassImplementsPatrameterizedInterface__GenerateModel_checkCsp_BWD__CSP() {
		return getClassImplementsPatrameterizedInterface().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNestedClassInType() {
		if (nestedClassInTypeEClass == null) {
			nestedClassInTypeEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(31);
		}
		return nestedClassInTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNestedClassInType__IsAppropriate_FWD__Match_MClass_AbstractTypeDeclaration() {
		return getNestedClassInType().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNestedClassInType__Perform_FWD__IsApplicableMatch() {
		return getNestedClassInType().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNestedClassInType__IsApplicable_FWD__Match() {
		return getNestedClassInType().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNestedClassInType__RegisterObjectsToMatch_FWD__Match_MClass_AbstractTypeDeclaration() {
		return getNestedClassInType().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNestedClassInType__IsAppropriate_solveCsp_FWD__Match_MClass_AbstractTypeDeclaration() {
		return getNestedClassInType().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNestedClassInType__IsAppropriate_checkCsp_FWD__CSP() {
		return getNestedClassInType().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNestedClassInType__IsApplicable_solveCsp_FWD__IsApplicableMatch_MClass_TypeGraph_TAbstractType_TypeToTAbstractType_AbstractTypeDeclaration_TPackage() {
		return getNestedClassInType().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNestedClassInType__IsApplicable_checkCsp_FWD__CSP() {
		return getNestedClassInType().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNestedClassInType__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getNestedClassInType().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNestedClassInType__CheckTypes_FWD__Match() {
		return getNestedClassInType().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNestedClassInType__IsAppropriate_BWD__Match_TypeGraph_TClass_TAbstractType_TPackage() {
		return getNestedClassInType().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNestedClassInType__Perform_BWD__IsApplicableMatch() {
		return getNestedClassInType().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNestedClassInType__IsApplicable_BWD__Match() {
		return getNestedClassInType().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNestedClassInType__RegisterObjectsToMatch_BWD__Match_TypeGraph_TClass_TAbstractType_TPackage() {
		return getNestedClassInType().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNestedClassInType__IsAppropriate_solveCsp_BWD__Match_TypeGraph_TClass_TAbstractType_TPackage() {
		return getNestedClassInType().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNestedClassInType__IsAppropriate_checkCsp_BWD__CSP() {
		return getNestedClassInType().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNestedClassInType__IsApplicable_solveCsp_BWD__IsApplicableMatch_TypeGraph_TClass_TAbstractType_TypeToTAbstractType_AbstractTypeDeclaration_TPackage() {
		return getNestedClassInType().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNestedClassInType__IsApplicable_checkCsp_BWD__CSP() {
		return getNestedClassInType().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNestedClassInType__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getNestedClassInType().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNestedClassInType__CheckTypes_BWD__Match() {
		return getNestedClassInType().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNestedClassInType__IsAppropriate_BWD_EMoflonEdge_28__EMoflonEdge() {
		return getNestedClassInType().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNestedClassInType__IsAppropriate_FWD_EMoflonEdge_28__EMoflonEdge() {
		return getNestedClassInType().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNestedClassInType__CheckAttributes_FWD__TripleMatch() {
		return getNestedClassInType().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNestedClassInType__CheckAttributes_BWD__TripleMatch() {
		return getNestedClassInType().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNestedClassInType__IsApplicable_CC__Match_Match() {
		return getNestedClassInType().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNestedClassInType__IsApplicable_solveCsp_CC__MClass_TypeGraph_TClass_TAbstractType_AbstractTypeDeclaration_TPackage_Match_Match() {
		return getNestedClassInType().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNestedClassInType__IsApplicable_checkCsp_CC__CSP() {
		return getNestedClassInType().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNestedClassInType__CheckDEC_FWD__MClass_AbstractTypeDeclaration() {
		return getNestedClassInType().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNestedClassInType__CheckDEC_BWD__TypeGraph_TClass_TAbstractType_TPackage() {
		return getNestedClassInType().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNestedClassInType__GenerateModel__RuleEntryContainer_TypeToTAbstractType() {
		return getNestedClassInType().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNestedClassInType__GenerateModel_solveCsp_BWD__IsApplicableMatch_TypeGraph_TAbstractType_TypeToTAbstractType_AbstractTypeDeclaration_TPackage_ModelgeneratorRuleResult() {
		return getNestedClassInType().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNestedClassInType__GenerateModel_checkCsp_BWD__CSP() {
		return getNestedClassInType().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMemberInEnumVisibility() {
		if (memberInEnumVisibilityEClass == null) {
			memberInEnumVisibilityEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(32);
		}
		return memberInEnumVisibilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMemberInEnumVisibility__IsAppropriate_FWD__Match_Modifier_EnumDeclaration_MDefinition() {
		return getMemberInEnumVisibility().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMemberInEnumVisibility__Perform_FWD__IsApplicableMatch() {
		return getMemberInEnumVisibility().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMemberInEnumVisibility__IsApplicable_FWD__Match() {
		return getMemberInEnumVisibility().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMemberInEnumVisibility__RegisterObjectsToMatch_FWD__Match_Modifier_EnumDeclaration_MDefinition() {
		return getMemberInEnumVisibility().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMemberInEnumVisibility__IsAppropriate_solveCsp_FWD__Match_Modifier_EnumDeclaration_MDefinition() {
		return getMemberInEnumVisibility().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMemberInEnumVisibility__IsAppropriate_checkCsp_FWD__CSP() {
		return getMemberInEnumVisibility().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMemberInEnumVisibility__IsApplicable_solveCsp_FWD__IsApplicableMatch_TMember_TClass_Modifier_EnumDeclaration_MDefinition_MDefinitionToTMember_TypeToTAbstractType() {
		return getMemberInEnumVisibility().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMemberInEnumVisibility__IsApplicable_checkCsp_FWD__CSP() {
		return getMemberInEnumVisibility().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMemberInEnumVisibility__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getMemberInEnumVisibility().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMemberInEnumVisibility__CheckTypes_FWD__Match() {
		return getMemberInEnumVisibility().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMemberInEnumVisibility__IsAppropriate_BWD__Match_TMember_TClass_TModifier() {
		return getMemberInEnumVisibility().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMemberInEnumVisibility__Perform_BWD__IsApplicableMatch() {
		return getMemberInEnumVisibility().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMemberInEnumVisibility__IsApplicable_BWD__Match() {
		return getMemberInEnumVisibility().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMemberInEnumVisibility__RegisterObjectsToMatch_BWD__Match_TMember_TClass_TModifier() {
		return getMemberInEnumVisibility().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMemberInEnumVisibility__IsAppropriate_solveCsp_BWD__Match_TMember_TClass_TModifier() {
		return getMemberInEnumVisibility().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMemberInEnumVisibility__IsAppropriate_checkCsp_BWD__CSP() {
		return getMemberInEnumVisibility().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMemberInEnumVisibility__IsApplicable_solveCsp_BWD__IsApplicableMatch_TMember_TClass_TModifier_EnumDeclaration_MDefinition_MDefinitionToTMember_TypeToTAbstractType() {
		return getMemberInEnumVisibility().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMemberInEnumVisibility__IsApplicable_checkCsp_BWD__CSP() {
		return getMemberInEnumVisibility().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMemberInEnumVisibility__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getMemberInEnumVisibility().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMemberInEnumVisibility__CheckTypes_BWD__Match() {
		return getMemberInEnumVisibility().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMemberInEnumVisibility__IsAppropriate_BWD_EMoflonEdge_29__EMoflonEdge() {
		return getMemberInEnumVisibility().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMemberInEnumVisibility__IsAppropriate_FWD_EMoflonEdge_29__EMoflonEdge() {
		return getMemberInEnumVisibility().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMemberInEnumVisibility__CheckAttributes_FWD__TripleMatch() {
		return getMemberInEnumVisibility().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMemberInEnumVisibility__CheckAttributes_BWD__TripleMatch() {
		return getMemberInEnumVisibility().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMemberInEnumVisibility__IsApplicable_CC__Match_Match() {
		return getMemberInEnumVisibility().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMemberInEnumVisibility__IsApplicable_solveCsp_CC__TMember_TClass_TModifier_Modifier_EnumDeclaration_MDefinition_Match_Match() {
		return getMemberInEnumVisibility().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMemberInEnumVisibility__IsApplicable_checkCsp_CC__CSP() {
		return getMemberInEnumVisibility().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMemberInEnumVisibility__CheckDEC_FWD__Modifier_EnumDeclaration_MDefinition() {
		return getMemberInEnumVisibility().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMemberInEnumVisibility__CheckDEC_BWD__TMember_TClass_TModifier() {
		return getMemberInEnumVisibility().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMemberInEnumVisibility__GenerateModel__RuleEntryContainer_TypeToTAbstractType() {
		return getMemberInEnumVisibility().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMemberInEnumVisibility__GenerateModel_solveCsp_BWD__IsApplicableMatch_TMember_TClass_EnumDeclaration_MDefinition_MDefinitionToTMember_TypeToTAbstractType_ModelgeneratorRuleResult() {
		return getMemberInEnumVisibility().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMemberInEnumVisibility__GenerateModel_checkCsp_BWD__CSP() {
		return getMemberInEnumVisibility().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAbstractMethodInvocation() {
		if (abstractMethodInvocationEClass == null) {
			abstractMethodInvocationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(33);
		}
		return abstractMethodInvocationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFieldName() {
		if (fieldNameEClass == null) {
			fieldNameEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI).getEClassifiers()
					.get(34);
		}
		return fieldNameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldName__IsAppropriate_FWD__Match_MGravityModel_MFieldName() {
		return getFieldName().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldName__Perform_FWD__IsApplicableMatch() {
		return getFieldName().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldName__IsApplicable_FWD__Match() {
		return getFieldName().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldName__RegisterObjectsToMatch_FWD__Match_MGravityModel_MFieldName() {
		return getFieldName().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldName__IsAppropriate_solveCsp_FWD__Match_MGravityModel_MFieldName() {
		return getFieldName().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldName__IsAppropriate_checkCsp_FWD__CSP() {
		return getFieldName().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldName__IsApplicable_solveCsp_FWD__IsApplicableMatch_ModelToTypeGraph_MGravityModel_TypeGraph_MFieldName() {
		return getFieldName().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldName__IsApplicable_checkCsp_FWD__CSP() {
		return getFieldName().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldName__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getFieldName().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldName__CheckTypes_FWD__Match() {
		return getFieldName().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldName__IsAppropriate_BWD__Match_TypeGraph_TField() {
		return getFieldName().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldName__Perform_BWD__IsApplicableMatch() {
		return getFieldName().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldName__IsApplicable_BWD__Match() {
		return getFieldName().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldName__RegisterObjectsToMatch_BWD__Match_TypeGraph_TField() {
		return getFieldName().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldName__IsAppropriate_solveCsp_BWD__Match_TypeGraph_TField() {
		return getFieldName().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldName__IsAppropriate_checkCsp_BWD__CSP() {
		return getFieldName().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldName__IsApplicable_solveCsp_BWD__IsApplicableMatch_ModelToTypeGraph_MGravityModel_TypeGraph_TField() {
		return getFieldName().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldName__IsApplicable_checkCsp_BWD__CSP() {
		return getFieldName().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldName__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getFieldName().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldName__CheckTypes_BWD__Match() {
		return getFieldName().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldName__IsAppropriate_BWD_EMoflonEdge_30__EMoflonEdge() {
		return getFieldName().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldName__IsAppropriate_FWD_EMoflonEdge_30__EMoflonEdge() {
		return getFieldName().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldName__CheckAttributes_FWD__TripleMatch() {
		return getFieldName().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldName__CheckAttributes_BWD__TripleMatch() {
		return getFieldName().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldName__IsApplicable_CC__Match_Match() {
		return getFieldName().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldName__IsApplicable_solveCsp_CC__MGravityModel_TypeGraph_MFieldName_TField_Match_Match() {
		return getFieldName().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldName__IsApplicable_checkCsp_CC__CSP() {
		return getFieldName().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldName__CheckDEC_FWD__MGravityModel_MFieldName() {
		return getFieldName().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldName__CheckDEC_BWD__TypeGraph_TField() {
		return getFieldName().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldName__GenerateModel__RuleEntryContainer_ModelToTypeGraph() {
		return getFieldName().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldName__GenerateModel_solveCsp_BWD__IsApplicableMatch_ModelToTypeGraph_MGravityModel_TypeGraph_ModelgeneratorRuleResult() {
		return getFieldName().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldName__GenerateModel_checkCsp_BWD__CSP() {
		return getFieldName().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVariableDeclarationFragment() {
		if (variableDeclarationFragmentEClass == null) {
			variableDeclarationFragmentEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(35);
		}
		return variableDeclarationFragmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getVariableDeclarationFragment__IsAppropriate_FWD__Match_MFieldDefinition_VariableDeclarationFragment() {
		return getVariableDeclarationFragment().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getVariableDeclarationFragment__Perform_FWD__IsApplicableMatch() {
		return getVariableDeclarationFragment().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getVariableDeclarationFragment__IsApplicable_FWD__Match() {
		return getVariableDeclarationFragment().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getVariableDeclarationFragment__RegisterObjectsToMatch_FWD__Match_MFieldDefinition_VariableDeclarationFragment() {
		return getVariableDeclarationFragment().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getVariableDeclarationFragment__IsAppropriate_solveCsp_FWD__Match_MFieldDefinition_VariableDeclarationFragment() {
		return getVariableDeclarationFragment().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getVariableDeclarationFragment__IsAppropriate_checkCsp_FWD__CSP() {
		return getVariableDeclarationFragment().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getVariableDeclarationFragment__IsApplicable_solveCsp_FWD__IsApplicableMatch_MFieldDefinition_VariableDeclarationFragment_MDefinitionToTMember_TFieldDefinition() {
		return getVariableDeclarationFragment().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getVariableDeclarationFragment__IsApplicable_checkCsp_FWD__CSP() {
		return getVariableDeclarationFragment().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getVariableDeclarationFragment__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject() {
		return getVariableDeclarationFragment().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getVariableDeclarationFragment__CheckTypes_FWD__Match() {
		return getVariableDeclarationFragment().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getVariableDeclarationFragment__IsAppropriate_BWD__Match_TFieldDefinition() {
		return getVariableDeclarationFragment().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getVariableDeclarationFragment__Perform_BWD__IsApplicableMatch() {
		return getVariableDeclarationFragment().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getVariableDeclarationFragment__IsApplicable_BWD__Match() {
		return getVariableDeclarationFragment().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getVariableDeclarationFragment__RegisterObjectsToMatch_BWD__Match_TFieldDefinition() {
		return getVariableDeclarationFragment().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getVariableDeclarationFragment__IsAppropriate_solveCsp_BWD__Match_TFieldDefinition() {
		return getVariableDeclarationFragment().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getVariableDeclarationFragment__IsAppropriate_checkCsp_BWD__CSP() {
		return getVariableDeclarationFragment().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getVariableDeclarationFragment__CheckTypes_BWD__Match() {
		return getVariableDeclarationFragment().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getVariableDeclarationFragment__IsAppropriate_BWD_TFieldDefinition_0__TFieldDefinition() {
		return getVariableDeclarationFragment().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getVariableDeclarationFragment__IsAppropriate_FWD_EMoflonEdge_31__EMoflonEdge() {
		return getVariableDeclarationFragment().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getVariableDeclarationFragment__CheckAttributes_FWD__TripleMatch() {
		return getVariableDeclarationFragment().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getVariableDeclarationFragment__CheckAttributes_BWD__TripleMatch() {
		return getVariableDeclarationFragment().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getVariableDeclarationFragment__IsApplicable_CC__Match_Match() {
		return getVariableDeclarationFragment().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getVariableDeclarationFragment__IsApplicable_solveCsp_CC__MFieldDefinition_VariableDeclarationFragment_TFieldDefinition_Match_Match() {
		return getVariableDeclarationFragment().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getVariableDeclarationFragment__IsApplicable_checkCsp_CC__CSP() {
		return getVariableDeclarationFragment().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getVariableDeclarationFragment__CheckDEC_FWD__MFieldDefinition_VariableDeclarationFragment() {
		return getVariableDeclarationFragment().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getVariableDeclarationFragment__CheckDEC_BWD__TFieldDefinition() {
		return getVariableDeclarationFragment().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getVariableDeclarationFragment__GenerateModel__RuleEntryContainer_MDefinitionToTMember() {
		return getVariableDeclarationFragment().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getVariableDeclarationFragment__GenerateModel_solveCsp_BWD__IsApplicableMatch_MFieldDefinition_MDefinitionToTMember_TFieldDefinition_ModelgeneratorRuleResult() {
		return getVariableDeclarationFragment().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getVariableDeclarationFragment__GenerateModel_checkCsp_BWD__CSP() {
		return getVariableDeclarationFragment().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPrimitiveTypeIsByte() {
		if (primitiveTypeIsByteEClass == null) {
			primitiveTypeIsByteEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(36);
		}
		return primitiveTypeIsByteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsByte__IsAppropriate_FWD__Match_PrimitiveTypeByte_Model() {
		return getPrimitiveTypeIsByte().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsByte__Perform_FWD__IsApplicableMatch() {
		return getPrimitiveTypeIsByte().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsByte__IsApplicable_FWD__Match() {
		return getPrimitiveTypeIsByte().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsByte__RegisterObjectsToMatch_FWD__Match_PrimitiveTypeByte_Model() {
		return getPrimitiveTypeIsByte().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsByte__IsAppropriate_solveCsp_FWD__Match_PrimitiveTypeByte_Model() {
		return getPrimitiveTypeIsByte().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsByte__IsAppropriate_checkCsp_FWD__CSP() {
		return getPrimitiveTypeIsByte().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsByte__IsApplicable_solveCsp_FWD__IsApplicableMatch_PrimitiveTypeByte_ModelToTypeGraph_TypeGraph_Model() {
		return getPrimitiveTypeIsByte().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsByte__IsApplicable_checkCsp_FWD__CSP() {
		return getPrimitiveTypeIsByte().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsByte__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getPrimitiveTypeIsByte().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsByte__CheckTypes_FWD__Match() {
		return getPrimitiveTypeIsByte().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsByte__IsAppropriate_BWD__Match_TypeGraph_TClass() {
		return getPrimitiveTypeIsByte().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsByte__Perform_BWD__IsApplicableMatch() {
		return getPrimitiveTypeIsByte().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsByte__IsApplicable_BWD__Match() {
		return getPrimitiveTypeIsByte().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsByte__RegisterObjectsToMatch_BWD__Match_TypeGraph_TClass() {
		return getPrimitiveTypeIsByte().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsByte__IsAppropriate_solveCsp_BWD__Match_TypeGraph_TClass() {
		return getPrimitiveTypeIsByte().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsByte__IsAppropriate_checkCsp_BWD__CSP() {
		return getPrimitiveTypeIsByte().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsByte__IsApplicable_solveCsp_BWD__IsApplicableMatch_ModelToTypeGraph_TypeGraph_TClass_Model() {
		return getPrimitiveTypeIsByte().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsByte__IsApplicable_checkCsp_BWD__CSP() {
		return getPrimitiveTypeIsByte().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsByte__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getPrimitiveTypeIsByte().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsByte__CheckTypes_BWD__Match() {
		return getPrimitiveTypeIsByte().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsByte__IsAppropriate_BWD_EMoflonEdge_31__EMoflonEdge() {
		return getPrimitiveTypeIsByte().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsByte__IsAppropriate_FWD_EMoflonEdge_32__EMoflonEdge() {
		return getPrimitiveTypeIsByte().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsByte__CheckAttributes_FWD__TripleMatch() {
		return getPrimitiveTypeIsByte().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsByte__CheckAttributes_BWD__TripleMatch() {
		return getPrimitiveTypeIsByte().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsByte__IsApplicable_CC__Match_Match() {
		return getPrimitiveTypeIsByte().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsByte__IsApplicable_solveCsp_CC__PrimitiveTypeByte_TypeGraph_TClass_Model_Match_Match() {
		return getPrimitiveTypeIsByte().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsByte__IsApplicable_checkCsp_CC__CSP() {
		return getPrimitiveTypeIsByte().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsByte__CheckDEC_FWD__PrimitiveTypeByte_Model() {
		return getPrimitiveTypeIsByte().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsByte__CheckDEC_BWD__TypeGraph_TClass() {
		return getPrimitiveTypeIsByte().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsByte__GenerateModel__RuleEntryContainer_ModelToTypeGraph() {
		return getPrimitiveTypeIsByte().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsByte__GenerateModel_solveCsp_BWD__IsApplicableMatch_ModelToTypeGraph_TypeGraph_Model_ModelgeneratorRuleResult() {
		return getPrimitiveTypeIsByte().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsByte__GenerateModel_checkCsp_BWD__CSP() {
		return getPrimitiveTypeIsByte().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMemberInClassVisibility() {
		if (memberInClassVisibilityEClass == null) {
			memberInClassVisibilityEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(37);
		}
		return memberInClassVisibilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMemberInClassVisibility__IsAppropriate_FWD__Match_Modifier_ClassDeclaration_MDefinition() {
		return getMemberInClassVisibility().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMemberInClassVisibility__Perform_FWD__IsApplicableMatch() {
		return getMemberInClassVisibility().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMemberInClassVisibility__IsApplicable_FWD__Match() {
		return getMemberInClassVisibility().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMemberInClassVisibility__RegisterObjectsToMatch_FWD__Match_Modifier_ClassDeclaration_MDefinition() {
		return getMemberInClassVisibility().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMemberInClassVisibility__IsAppropriate_solveCsp_FWD__Match_Modifier_ClassDeclaration_MDefinition() {
		return getMemberInClassVisibility().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMemberInClassVisibility__IsAppropriate_checkCsp_FWD__CSP() {
		return getMemberInClassVisibility().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMemberInClassVisibility__IsApplicable_solveCsp_FWD__IsApplicableMatch_MDefinitionToTMember_Modifier_TClass_TMember_ClassDeclaration_TypeToTAbstractType_MDefinition() {
		return getMemberInClassVisibility().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMemberInClassVisibility__IsApplicable_checkCsp_FWD__CSP() {
		return getMemberInClassVisibility().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMemberInClassVisibility__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getMemberInClassVisibility().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMemberInClassVisibility__CheckTypes_FWD__Match() {
		return getMemberInClassVisibility().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMemberInClassVisibility__IsAppropriate_BWD__Match_TClass_TMember_TModifier() {
		return getMemberInClassVisibility().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMemberInClassVisibility__Perform_BWD__IsApplicableMatch() {
		return getMemberInClassVisibility().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMemberInClassVisibility__IsApplicable_BWD__Match() {
		return getMemberInClassVisibility().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMemberInClassVisibility__RegisterObjectsToMatch_BWD__Match_TClass_TMember_TModifier() {
		return getMemberInClassVisibility().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMemberInClassVisibility__IsAppropriate_solveCsp_BWD__Match_TClass_TMember_TModifier() {
		return getMemberInClassVisibility().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMemberInClassVisibility__IsAppropriate_checkCsp_BWD__CSP() {
		return getMemberInClassVisibility().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMemberInClassVisibility__IsApplicable_solveCsp_BWD__IsApplicableMatch_MDefinitionToTMember_TClass_TMember_ClassDeclaration_TModifier_TypeToTAbstractType_MDefinition() {
		return getMemberInClassVisibility().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMemberInClassVisibility__IsApplicable_checkCsp_BWD__CSP() {
		return getMemberInClassVisibility().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMemberInClassVisibility__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getMemberInClassVisibility().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMemberInClassVisibility__CheckTypes_BWD__Match() {
		return getMemberInClassVisibility().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMemberInClassVisibility__IsAppropriate_BWD_EMoflonEdge_32__EMoflonEdge() {
		return getMemberInClassVisibility().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMemberInClassVisibility__IsAppropriate_FWD_EMoflonEdge_33__EMoflonEdge() {
		return getMemberInClassVisibility().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMemberInClassVisibility__CheckAttributes_FWD__TripleMatch() {
		return getMemberInClassVisibility().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMemberInClassVisibility__CheckAttributes_BWD__TripleMatch() {
		return getMemberInClassVisibility().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMemberInClassVisibility__IsApplicable_CC__Match_Match() {
		return getMemberInClassVisibility().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMemberInClassVisibility__IsApplicable_solveCsp_CC__Modifier_TClass_TMember_ClassDeclaration_TModifier_MDefinition_Match_Match() {
		return getMemberInClassVisibility().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMemberInClassVisibility__IsApplicable_checkCsp_CC__CSP() {
		return getMemberInClassVisibility().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMemberInClassVisibility__CheckDEC_FWD__Modifier_ClassDeclaration_MDefinition() {
		return getMemberInClassVisibility().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMemberInClassVisibility__CheckDEC_BWD__TClass_TMember_TModifier() {
		return getMemberInClassVisibility().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMemberInClassVisibility__GenerateModel__RuleEntryContainer_MDefinitionToTMember() {
		return getMemberInClassVisibility().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMemberInClassVisibility__GenerateModel_solveCsp_BWD__IsApplicableMatch_MDefinitionToTMember_TClass_TMember_ClassDeclaration_TypeToTAbstractType_MDefinition_ModelgeneratorRuleResult() {
		return getMemberInClassVisibility().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMemberInClassVisibility__GenerateModel_checkCsp_BWD__CSP() {
		return getMemberInClassVisibility().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnnotationMemberValueString() {
		if (annotationMemberValueStringEClass == null) {
			annotationMemberValueStringEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(38);
		}
		return annotationMemberValueStringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueString__IsAppropriate_FWD__Match_Annotation_AnnotationMemberValuePair_BodyDeclaration_StringLiteral() {
		return getAnnotationMemberValueString().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueString__Perform_FWD__IsApplicableMatch() {
		return getAnnotationMemberValueString().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueString__IsApplicable_FWD__Match() {
		return getAnnotationMemberValueString().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueString__RegisterObjectsToMatch_FWD__Match_Annotation_AnnotationMemberValuePair_BodyDeclaration_StringLiteral() {
		return getAnnotationMemberValueString().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueString__IsAppropriate_solveCsp_FWD__Match_Annotation_AnnotationMemberValuePair_BodyDeclaration_StringLiteral() {
		return getAnnotationMemberValueString().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueString__IsAppropriate_checkCsp_FWD__CSP() {
		return getAnnotationMemberValueString().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueString__IsApplicable_solveCsp_FWD__IsApplicableMatch_Annotation_AnnotationMemberValuePairToTAnnotationValue_AnnotationMemberValuePair_BodyDeclaration_StringLiteral_TAnnotationValue() {
		return getAnnotationMemberValueString().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueString__IsApplicable_checkCsp_FWD__CSP() {
		return getAnnotationMemberValueString().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueString__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getAnnotationMemberValueString().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueString__CheckTypes_FWD__Match() {
		return getAnnotationMemberValueString().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueString__IsAppropriate_BWD__Match_TTextNode_TAnnotationValue() {
		return getAnnotationMemberValueString().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueString__Perform_BWD__IsApplicableMatch() {
		return getAnnotationMemberValueString().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueString__IsApplicable_BWD__Match() {
		return getAnnotationMemberValueString().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueString__RegisterObjectsToMatch_BWD__Match_TTextNode_TAnnotationValue() {
		return getAnnotationMemberValueString().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueString__IsAppropriate_solveCsp_BWD__Match_TTextNode_TAnnotationValue() {
		return getAnnotationMemberValueString().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueString__IsAppropriate_checkCsp_BWD__CSP() {
		return getAnnotationMemberValueString().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueString__IsApplicable_solveCsp_BWD__IsApplicableMatch_Annotation_AnnotationMemberValuePairToTAnnotationValue_AnnotationMemberValuePair_TTextNode_BodyDeclaration_TAnnotationValue() {
		return getAnnotationMemberValueString().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueString__IsApplicable_checkCsp_BWD__CSP() {
		return getAnnotationMemberValueString().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueString__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getAnnotationMemberValueString().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueString__CheckTypes_BWD__Match() {
		return getAnnotationMemberValueString().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueString__IsAppropriate_BWD_EMoflonEdge_33__EMoflonEdge() {
		return getAnnotationMemberValueString().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueString__IsAppropriate_FWD_EMoflonEdge_34__EMoflonEdge() {
		return getAnnotationMemberValueString().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueString__CheckAttributes_FWD__TripleMatch() {
		return getAnnotationMemberValueString().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueString__CheckAttributes_BWD__TripleMatch() {
		return getAnnotationMemberValueString().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueString__IsApplicable_CC__Match_Match() {
		return getAnnotationMemberValueString().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueString__IsApplicable_solveCsp_CC__Annotation_AnnotationMemberValuePair_TTextNode_BodyDeclaration_StringLiteral_TAnnotationValue_Match_Match() {
		return getAnnotationMemberValueString().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueString__IsApplicable_checkCsp_CC__CSP() {
		return getAnnotationMemberValueString().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueString__CheckDEC_FWD__Annotation_AnnotationMemberValuePair_BodyDeclaration_StringLiteral() {
		return getAnnotationMemberValueString().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueString__CheckDEC_BWD__TTextNode_TAnnotationValue() {
		return getAnnotationMemberValueString().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueString__GenerateModel__RuleEntryContainer_AnnotationMemberValuePairToTAnnotationValue() {
		return getAnnotationMemberValueString().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueString__GenerateModel_solveCsp_BWD__IsApplicableMatch_Annotation_AnnotationMemberValuePairToTAnnotationValue_AnnotationMemberValuePair_BodyDeclaration_TAnnotationValue_ModelgeneratorRuleResult() {
		return getAnnotationMemberValueString().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueString__GenerateModel_checkCsp_BWD__CSP() {
		return getAnnotationMemberValueString().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMethodParameterLink() {
		if (methodParameterLinkEClass == null) {
			methodParameterLinkEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(39);
		}
		return methodParameterLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodParameterLink__IsAppropriate_FWD__Match_MEntry_MEntry() {
		return getMethodParameterLink().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodParameterLink__Perform_FWD__IsApplicableMatch() {
		return getMethodParameterLink().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodParameterLink__IsApplicable_FWD__Match() {
		return getMethodParameterLink().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodParameterLink__RegisterObjectsToMatch_FWD__Match_MEntry_MEntry() {
		return getMethodParameterLink().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodParameterLink__IsAppropriate_solveCsp_FWD__Match_MEntry_MEntry() {
		return getMethodParameterLink().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodParameterLink__IsAppropriate_checkCsp_FWD__CSP() {
		return getMethodParameterLink().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodParameterLink__IsApplicable_solveCsp_FWD__IsApplicableMatch_MEntry_MEntry_MEntryToTParameter_TParameter_TParameter_MEntryToTParameter() {
		return getMethodParameterLink().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodParameterLink__IsApplicable_checkCsp_FWD__CSP() {
		return getMethodParameterLink().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodParameterLink__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getMethodParameterLink().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodParameterLink__CheckTypes_FWD__Match() {
		return getMethodParameterLink().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodParameterLink__IsAppropriate_BWD__Match_TParameter_TParameter() {
		return getMethodParameterLink().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodParameterLink__Perform_BWD__IsApplicableMatch() {
		return getMethodParameterLink().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodParameterLink__IsApplicable_BWD__Match() {
		return getMethodParameterLink().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodParameterLink__RegisterObjectsToMatch_BWD__Match_TParameter_TParameter() {
		return getMethodParameterLink().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodParameterLink__IsAppropriate_solveCsp_BWD__Match_TParameter_TParameter() {
		return getMethodParameterLink().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodParameterLink__IsAppropriate_checkCsp_BWD__CSP() {
		return getMethodParameterLink().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodParameterLink__IsApplicable_solveCsp_BWD__IsApplicableMatch_MEntry_MEntry_MEntryToTParameter_TParameter_TParameter_MEntryToTParameter() {
		return getMethodParameterLink().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodParameterLink__IsApplicable_checkCsp_BWD__CSP() {
		return getMethodParameterLink().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodParameterLink__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getMethodParameterLink().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodParameterLink__CheckTypes_BWD__Match() {
		return getMethodParameterLink().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodParameterLink__IsAppropriate_BWD_EMoflonEdge_34__EMoflonEdge() {
		return getMethodParameterLink().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodParameterLink__IsAppropriate_FWD_EMoflonEdge_35__EMoflonEdge() {
		return getMethodParameterLink().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodParameterLink__CheckAttributes_FWD__TripleMatch() {
		return getMethodParameterLink().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodParameterLink__CheckAttributes_BWD__TripleMatch() {
		return getMethodParameterLink().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodParameterLink__IsApplicable_CC__Match_Match() {
		return getMethodParameterLink().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodParameterLink__IsApplicable_solveCsp_CC__MEntry_MEntry_TParameter_TParameter_Match_Match() {
		return getMethodParameterLink().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodParameterLink__IsApplicable_checkCsp_CC__CSP() {
		return getMethodParameterLink().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodParameterLink__CheckDEC_FWD__MEntry_MEntry() {
		return getMethodParameterLink().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodParameterLink__CheckDEC_BWD__TParameter_TParameter() {
		return getMethodParameterLink().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodParameterLink__GenerateModel__RuleEntryContainer_MEntryToTParameter_MEntryToTParameter() {
		return getMethodParameterLink().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodParameterLink__GenerateModel_solveCsp_BWD__IsApplicableMatch_MEntry_MEntry_MEntryToTParameter_TParameter_TParameter_MEntryToTParameter_ModelgeneratorRuleResult() {
		return getMethodParameterLink().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodParameterLink__GenerateModel_checkCsp_BWD__CSP() {
		return getMethodParameterLink().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFieldAccess() {
		if (fieldAccessEClass == null) {
			fieldAccessEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI).getEClassifiers()
					.get(40);
		}
		return fieldAccessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnnotationMemberValueNumberArray() {
		if (annotationMemberValueNumberArrayEClass == null) {
			annotationMemberValueNumberArrayEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(RulesPackage.eNS_URI).getEClassifiers().get(41);
		}
		return annotationMemberValueNumberArrayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueNumberArray__IsAppropriate_FWD__Match_Annotation_AnnotationMemberValuePair_ArrayInitializer_BodyDeclaration_NumberLiteral() {
		return getAnnotationMemberValueNumberArray().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueNumberArray__Perform_FWD__IsApplicableMatch() {
		return getAnnotationMemberValueNumberArray().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueNumberArray__IsApplicable_FWD__Match() {
		return getAnnotationMemberValueNumberArray().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueNumberArray__RegisterObjectsToMatch_FWD__Match_Annotation_AnnotationMemberValuePair_ArrayInitializer_BodyDeclaration_NumberLiteral() {
		return getAnnotationMemberValueNumberArray().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueNumberArray__IsAppropriate_solveCsp_FWD__Match_Annotation_AnnotationMemberValuePair_ArrayInitializer_BodyDeclaration_NumberLiteral() {
		return getAnnotationMemberValueNumberArray().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueNumberArray__IsAppropriate_checkCsp_FWD__CSP() {
		return getAnnotationMemberValueNumberArray().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueNumberArray__IsApplicable_solveCsp_FWD__IsApplicableMatch_Annotation_AnnotationMemberValuePair_AnnotationMemberValuePairToTAnnotationValue_ArrayInitializer_BodyDeclaration_TAnnotationValue_NumberLiteral() {
		return getAnnotationMemberValueNumberArray().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueNumberArray__IsApplicable_checkCsp_FWD__CSP() {
		return getAnnotationMemberValueNumberArray().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueNumberArray__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getAnnotationMemberValueNumberArray().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueNumberArray__CheckTypes_FWD__Match() {
		return getAnnotationMemberValueNumberArray().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueNumberArray__IsAppropriate_BWD__Match_TNumberNode_TAnnotationValue() {
		return getAnnotationMemberValueNumberArray().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueNumberArray__Perform_BWD__IsApplicableMatch() {
		return getAnnotationMemberValueNumberArray().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueNumberArray__IsApplicable_BWD__Match() {
		return getAnnotationMemberValueNumberArray().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueNumberArray__RegisterObjectsToMatch_BWD__Match_TNumberNode_TAnnotationValue() {
		return getAnnotationMemberValueNumberArray().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueNumberArray__IsAppropriate_solveCsp_BWD__Match_TNumberNode_TAnnotationValue() {
		return getAnnotationMemberValueNumberArray().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueNumberArray__IsAppropriate_checkCsp_BWD__CSP() {
		return getAnnotationMemberValueNumberArray().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueNumberArray__IsApplicable_solveCsp_BWD__IsApplicableMatch_Annotation_AnnotationMemberValuePair_AnnotationMemberValuePairToTAnnotationValue_TNumberNode_BodyDeclaration_TAnnotationValue() {
		return getAnnotationMemberValueNumberArray().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueNumberArray__IsApplicable_checkCsp_BWD__CSP() {
		return getAnnotationMemberValueNumberArray().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueNumberArray__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getAnnotationMemberValueNumberArray().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueNumberArray__CheckTypes_BWD__Match() {
		return getAnnotationMemberValueNumberArray().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueNumberArray__IsAppropriate_BWD_EMoflonEdge_35__EMoflonEdge() {
		return getAnnotationMemberValueNumberArray().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueNumberArray__IsAppropriate_FWD_EMoflonEdge_36__EMoflonEdge() {
		return getAnnotationMemberValueNumberArray().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueNumberArray__CheckAttributes_FWD__TripleMatch() {
		return getAnnotationMemberValueNumberArray().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueNumberArray__CheckAttributes_BWD__TripleMatch() {
		return getAnnotationMemberValueNumberArray().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueNumberArray__IsApplicable_CC__Match_Match() {
		return getAnnotationMemberValueNumberArray().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueNumberArray__IsApplicable_solveCsp_CC__Annotation_AnnotationMemberValuePair_ArrayInitializer_TNumberNode_BodyDeclaration_TAnnotationValue_NumberLiteral_Match_Match() {
		return getAnnotationMemberValueNumberArray().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueNumberArray__IsApplicable_checkCsp_CC__CSP() {
		return getAnnotationMemberValueNumberArray().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueNumberArray__CheckDEC_FWD__Annotation_AnnotationMemberValuePair_ArrayInitializer_BodyDeclaration_NumberLiteral() {
		return getAnnotationMemberValueNumberArray().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueNumberArray__CheckDEC_BWD__TNumberNode_TAnnotationValue() {
		return getAnnotationMemberValueNumberArray().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueNumberArray__GenerateModel__RuleEntryContainer_AnnotationMemberValuePairToTAnnotationValue() {
		return getAnnotationMemberValueNumberArray().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueNumberArray__GenerateModel_solveCsp_BWD__IsApplicableMatch_Annotation_AnnotationMemberValuePair_AnnotationMemberValuePairToTAnnotationValue_BodyDeclaration_TAnnotationValue_ModelgeneratorRuleResult() {
		return getAnnotationMemberValueNumberArray().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueNumberArray__GenerateModel_checkCsp_BWD__CSP() {
		return getAnnotationMemberValueNumberArray().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMethodInvocation() {
		if (methodInvocationEClass == null) {
			methodInvocationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(42);
		}
		return methodInvocationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodInvocation__IsAppropriate_FWD__Match_MMethodInvocation_MDefinition() {
		return getMethodInvocation().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodInvocation__Perform_FWD__IsApplicableMatch() {
		return getMethodInvocation().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodInvocation__IsApplicable_FWD__Match() {
		return getMethodInvocation().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodInvocation__RegisterObjectsToMatch_FWD__Match_MMethodInvocation_MDefinition() {
		return getMethodInvocation().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodInvocation__IsAppropriate_solveCsp_FWD__Match_MMethodInvocation_MDefinition() {
		return getMethodInvocation().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodInvocation__IsAppropriate_checkCsp_FWD__CSP() {
		return getMethodInvocation().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodInvocation__IsApplicable_solveCsp_FWD__IsApplicableMatch_MMethodInvocation_MDefinitionToTMember_TMember_MDefinition() {
		return getMethodInvocation().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodInvocation__IsApplicable_checkCsp_FWD__CSP() {
		return getMethodInvocation().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodInvocation__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getMethodInvocation().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodInvocation__CheckTypes_FWD__Match() {
		return getMethodInvocation().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodInvocation__IsAppropriate_BWD__Match_TMember_TCall() {
		return getMethodInvocation().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodInvocation__Perform_BWD__IsApplicableMatch() {
		return getMethodInvocation().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodInvocation__IsApplicable_BWD__Match() {
		return getMethodInvocation().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodInvocation__RegisterObjectsToMatch_BWD__Match_TMember_TCall() {
		return getMethodInvocation().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodInvocation__IsAppropriate_solveCsp_BWD__Match_TMember_TCall() {
		return getMethodInvocation().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodInvocation__IsAppropriate_checkCsp_BWD__CSP() {
		return getMethodInvocation().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodInvocation__IsApplicable_solveCsp_BWD__IsApplicableMatch_MDefinitionToTMember_TMember_TCall_MDefinition() {
		return getMethodInvocation().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodInvocation__IsApplicable_checkCsp_BWD__CSP() {
		return getMethodInvocation().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodInvocation__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getMethodInvocation().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodInvocation__CheckTypes_BWD__Match() {
		return getMethodInvocation().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodInvocation__IsAppropriate_BWD_EMoflonEdge_36__EMoflonEdge() {
		return getMethodInvocation().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodInvocation__IsAppropriate_FWD_EMoflonEdge_37__EMoflonEdge() {
		return getMethodInvocation().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodInvocation__CheckAttributes_FWD__TripleMatch() {
		return getMethodInvocation().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodInvocation__CheckAttributes_BWD__TripleMatch() {
		return getMethodInvocation().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodInvocation__IsApplicable_CC__Match_Match() {
		return getMethodInvocation().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodInvocation__IsApplicable_solveCsp_CC__MMethodInvocation_TMember_TCall_MDefinition_Match_Match() {
		return getMethodInvocation().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodInvocation__IsApplicable_checkCsp_CC__CSP() {
		return getMethodInvocation().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodInvocation__CheckDEC_FWD__MMethodInvocation_MDefinition() {
		return getMethodInvocation().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodInvocation__CheckDEC_BWD__TMember_TCall() {
		return getMethodInvocation().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodInvocation__GenerateModel__RuleEntryContainer_MDefinitionToTMember() {
		return getMethodInvocation().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodInvocation__GenerateModel_solveCsp_BWD__IsApplicableMatch_MDefinitionToTMember_TMember_MDefinition_ModelgeneratorRuleResult() {
		return getMethodInvocation().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodInvocation__GenerateModel_checkCsp_BWD__CSP() {
		return getMethodInvocation().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTypeNestedInType_Abstract() {
		if (typeNestedInType_AbstractEClass == null) {
			typeNestedInType_AbstractEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(43);
		}
		return typeNestedInType_AbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLinkDefinitionToType() {
		if (linkDefinitionToTypeEClass == null) {
			linkDefinitionToTypeEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(44);
		}
		return linkDefinitionToTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getLinkDefinitionToType__IsAppropriate_FWD__Match_MDefinition_AbstractTypeDeclaration_MSignature() {
		return getLinkDefinitionToType().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getLinkDefinitionToType__Perform_FWD__IsApplicableMatch() {
		return getLinkDefinitionToType().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getLinkDefinitionToType__IsApplicable_FWD__Match() {
		return getLinkDefinitionToType().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getLinkDefinitionToType__RegisterObjectsToMatch_FWD__Match_MDefinition_AbstractTypeDeclaration_MSignature() {
		return getLinkDefinitionToType().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getLinkDefinitionToType__IsAppropriate_solveCsp_FWD__Match_MDefinition_AbstractTypeDeclaration_MSignature() {
		return getLinkDefinitionToType().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getLinkDefinitionToType__IsAppropriate_checkCsp_FWD__CSP() {
		return getLinkDefinitionToType().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getLinkDefinitionToType__IsApplicable_solveCsp_FWD__IsApplicableMatch_TSignature_TypeToTAbstractType_MDefinition_MSignatureToTSignature_TAbstractType_MDefinitionToTMember_AbstractTypeDeclaration_TMember_MSignature() {
		return getLinkDefinitionToType().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getLinkDefinitionToType__IsApplicable_checkCsp_FWD__CSP() {
		return getLinkDefinitionToType().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getLinkDefinitionToType__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getLinkDefinitionToType().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getLinkDefinitionToType__CheckTypes_FWD__Match() {
		return getLinkDefinitionToType().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getLinkDefinitionToType__IsAppropriate_BWD__Match_TSignature_TAbstractType_TMember() {
		return getLinkDefinitionToType().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getLinkDefinitionToType__Perform_BWD__IsApplicableMatch() {
		return getLinkDefinitionToType().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getLinkDefinitionToType__IsApplicable_BWD__Match() {
		return getLinkDefinitionToType().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getLinkDefinitionToType__RegisterObjectsToMatch_BWD__Match_TSignature_TAbstractType_TMember() {
		return getLinkDefinitionToType().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getLinkDefinitionToType__IsAppropriate_solveCsp_BWD__Match_TSignature_TAbstractType_TMember() {
		return getLinkDefinitionToType().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getLinkDefinitionToType__IsAppropriate_checkCsp_BWD__CSP() {
		return getLinkDefinitionToType().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getLinkDefinitionToType__IsApplicable_solveCsp_BWD__IsApplicableMatch_TSignature_TypeToTAbstractType_MDefinition_MSignatureToTSignature_TAbstractType_MDefinitionToTMember_AbstractTypeDeclaration_TMember_MSignature() {
		return getLinkDefinitionToType().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getLinkDefinitionToType__IsApplicable_checkCsp_BWD__CSP() {
		return getLinkDefinitionToType().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getLinkDefinitionToType__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getLinkDefinitionToType().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getLinkDefinitionToType__CheckTypes_BWD__Match() {
		return getLinkDefinitionToType().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getLinkDefinitionToType__IsAppropriate_BWD_EMoflonEdge_37__EMoflonEdge() {
		return getLinkDefinitionToType().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getLinkDefinitionToType__IsAppropriate_FWD_EMoflonEdge_38__EMoflonEdge() {
		return getLinkDefinitionToType().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getLinkDefinitionToType__CheckAttributes_FWD__TripleMatch() {
		return getLinkDefinitionToType().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getLinkDefinitionToType__CheckAttributes_BWD__TripleMatch() {
		return getLinkDefinitionToType().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getLinkDefinitionToType__IsApplicable_CC__Match_Match() {
		return getLinkDefinitionToType().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getLinkDefinitionToType__IsApplicable_solveCsp_CC__TSignature_MDefinition_TAbstractType_AbstractTypeDeclaration_TMember_MSignature_Match_Match() {
		return getLinkDefinitionToType().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getLinkDefinitionToType__IsApplicable_checkCsp_CC__CSP() {
		return getLinkDefinitionToType().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getLinkDefinitionToType__CheckDEC_FWD__MDefinition_AbstractTypeDeclaration_MSignature() {
		return getLinkDefinitionToType().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getLinkDefinitionToType__CheckDEC_BWD__TSignature_TAbstractType_TMember() {
		return getLinkDefinitionToType().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getLinkDefinitionToType__GenerateModel__RuleEntryContainer_MDefinitionToTMember_TypeToTAbstractType() {
		return getLinkDefinitionToType().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getLinkDefinitionToType__GenerateModel_solveCsp_BWD__IsApplicableMatch_TSignature_TypeToTAbstractType_MDefinition_MSignatureToTSignature_TAbstractType_MDefinitionToTMember_AbstractTypeDeclaration_TMember_MSignature_ModelgeneratorRuleResult() {
		return getLinkDefinitionToType().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getLinkDefinitionToType__GenerateModel_checkCsp_BWD__CSP() {
		return getLinkDefinitionToType().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPrimitiveTypeIsShort() {
		if (primitiveTypeIsShortEClass == null) {
			primitiveTypeIsShortEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(45);
		}
		return primitiveTypeIsShortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsShort__IsAppropriate_FWD__Match_PrimitiveTypeShort_Model() {
		return getPrimitiveTypeIsShort().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsShort__Perform_FWD__IsApplicableMatch() {
		return getPrimitiveTypeIsShort().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsShort__IsApplicable_FWD__Match() {
		return getPrimitiveTypeIsShort().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsShort__RegisterObjectsToMatch_FWD__Match_PrimitiveTypeShort_Model() {
		return getPrimitiveTypeIsShort().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsShort__IsAppropriate_solveCsp_FWD__Match_PrimitiveTypeShort_Model() {
		return getPrimitiveTypeIsShort().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsShort__IsAppropriate_checkCsp_FWD__CSP() {
		return getPrimitiveTypeIsShort().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsShort__IsApplicable_solveCsp_FWD__IsApplicableMatch_PrimitiveTypeShort_ModelToTypeGraph_TypeGraph_Model() {
		return getPrimitiveTypeIsShort().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsShort__IsApplicable_checkCsp_FWD__CSP() {
		return getPrimitiveTypeIsShort().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsShort__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getPrimitiveTypeIsShort().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsShort__CheckTypes_FWD__Match() {
		return getPrimitiveTypeIsShort().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsShort__IsAppropriate_BWD__Match_TypeGraph_TClass() {
		return getPrimitiveTypeIsShort().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsShort__Perform_BWD__IsApplicableMatch() {
		return getPrimitiveTypeIsShort().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsShort__IsApplicable_BWD__Match() {
		return getPrimitiveTypeIsShort().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsShort__RegisterObjectsToMatch_BWD__Match_TypeGraph_TClass() {
		return getPrimitiveTypeIsShort().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsShort__IsAppropriate_solveCsp_BWD__Match_TypeGraph_TClass() {
		return getPrimitiveTypeIsShort().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsShort__IsAppropriate_checkCsp_BWD__CSP() {
		return getPrimitiveTypeIsShort().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsShort__IsApplicable_solveCsp_BWD__IsApplicableMatch_ModelToTypeGraph_TypeGraph_TClass_Model() {
		return getPrimitiveTypeIsShort().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsShort__IsApplicable_checkCsp_BWD__CSP() {
		return getPrimitiveTypeIsShort().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsShort__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getPrimitiveTypeIsShort().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsShort__CheckTypes_BWD__Match() {
		return getPrimitiveTypeIsShort().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsShort__IsAppropriate_BWD_EMoflonEdge_38__EMoflonEdge() {
		return getPrimitiveTypeIsShort().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsShort__IsAppropriate_FWD_EMoflonEdge_39__EMoflonEdge() {
		return getPrimitiveTypeIsShort().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsShort__CheckAttributes_FWD__TripleMatch() {
		return getPrimitiveTypeIsShort().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsShort__CheckAttributes_BWD__TripleMatch() {
		return getPrimitiveTypeIsShort().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsShort__IsApplicable_CC__Match_Match() {
		return getPrimitiveTypeIsShort().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsShort__IsApplicable_solveCsp_CC__PrimitiveTypeShort_TypeGraph_TClass_Model_Match_Match() {
		return getPrimitiveTypeIsShort().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsShort__IsApplicable_checkCsp_CC__CSP() {
		return getPrimitiveTypeIsShort().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsShort__CheckDEC_FWD__PrimitiveTypeShort_Model() {
		return getPrimitiveTypeIsShort().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsShort__CheckDEC_BWD__TypeGraph_TClass() {
		return getPrimitiveTypeIsShort().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsShort__GenerateModel__RuleEntryContainer_ModelToTypeGraph() {
		return getPrimitiveTypeIsShort().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsShort__GenerateModel_solveCsp_BWD__IsApplicableMatch_ModelToTypeGraph_TypeGraph_Model_ModelgeneratorRuleResult() {
		return getPrimitiveTypeIsShort().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsShort__GenerateModel_checkCsp_BWD__CSP() {
		return getPrimitiveTypeIsShort().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPrimitiveTypeIsDouble() {
		if (primitiveTypeIsDoubleEClass == null) {
			primitiveTypeIsDoubleEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(46);
		}
		return primitiveTypeIsDoubleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsDouble__IsAppropriate_FWD__Match_PrimitiveTypeDouble_Model() {
		return getPrimitiveTypeIsDouble().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsDouble__Perform_FWD__IsApplicableMatch() {
		return getPrimitiveTypeIsDouble().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsDouble__IsApplicable_FWD__Match() {
		return getPrimitiveTypeIsDouble().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsDouble__RegisterObjectsToMatch_FWD__Match_PrimitiveTypeDouble_Model() {
		return getPrimitiveTypeIsDouble().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsDouble__IsAppropriate_solveCsp_FWD__Match_PrimitiveTypeDouble_Model() {
		return getPrimitiveTypeIsDouble().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsDouble__IsAppropriate_checkCsp_FWD__CSP() {
		return getPrimitiveTypeIsDouble().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsDouble__IsApplicable_solveCsp_FWD__IsApplicableMatch_PrimitiveTypeDouble_ModelToTypeGraph_TypeGraph_Model() {
		return getPrimitiveTypeIsDouble().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsDouble__IsApplicable_checkCsp_FWD__CSP() {
		return getPrimitiveTypeIsDouble().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsDouble__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getPrimitiveTypeIsDouble().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsDouble__CheckTypes_FWD__Match() {
		return getPrimitiveTypeIsDouble().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsDouble__IsAppropriate_BWD__Match_TypeGraph_TClass() {
		return getPrimitiveTypeIsDouble().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsDouble__Perform_BWD__IsApplicableMatch() {
		return getPrimitiveTypeIsDouble().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsDouble__IsApplicable_BWD__Match() {
		return getPrimitiveTypeIsDouble().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsDouble__RegisterObjectsToMatch_BWD__Match_TypeGraph_TClass() {
		return getPrimitiveTypeIsDouble().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsDouble__IsAppropriate_solveCsp_BWD__Match_TypeGraph_TClass() {
		return getPrimitiveTypeIsDouble().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsDouble__IsAppropriate_checkCsp_BWD__CSP() {
		return getPrimitiveTypeIsDouble().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsDouble__IsApplicable_solveCsp_BWD__IsApplicableMatch_ModelToTypeGraph_TypeGraph_TClass_Model() {
		return getPrimitiveTypeIsDouble().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsDouble__IsApplicable_checkCsp_BWD__CSP() {
		return getPrimitiveTypeIsDouble().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsDouble__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getPrimitiveTypeIsDouble().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsDouble__CheckTypes_BWD__Match() {
		return getPrimitiveTypeIsDouble().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsDouble__IsAppropriate_BWD_EMoflonEdge_39__EMoflonEdge() {
		return getPrimitiveTypeIsDouble().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsDouble__IsAppropriate_FWD_EMoflonEdge_40__EMoflonEdge() {
		return getPrimitiveTypeIsDouble().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsDouble__CheckAttributes_FWD__TripleMatch() {
		return getPrimitiveTypeIsDouble().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsDouble__CheckAttributes_BWD__TripleMatch() {
		return getPrimitiveTypeIsDouble().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsDouble__IsApplicable_CC__Match_Match() {
		return getPrimitiveTypeIsDouble().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsDouble__IsApplicable_solveCsp_CC__PrimitiveTypeDouble_TypeGraph_TClass_Model_Match_Match() {
		return getPrimitiveTypeIsDouble().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsDouble__IsApplicable_checkCsp_CC__CSP() {
		return getPrimitiveTypeIsDouble().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsDouble__CheckDEC_FWD__PrimitiveTypeDouble_Model() {
		return getPrimitiveTypeIsDouble().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsDouble__CheckDEC_BWD__TypeGraph_TClass() {
		return getPrimitiveTypeIsDouble().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsDouble__GenerateModel__RuleEntryContainer_ModelToTypeGraph() {
		return getPrimitiveTypeIsDouble().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsDouble__GenerateModel_solveCsp_BWD__IsApplicableMatch_ModelToTypeGraph_TypeGraph_Model_ModelgeneratorRuleResult() {
		return getPrimitiveTypeIsDouble().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsDouble__GenerateModel_checkCsp_BWD__CSP() {
		return getPrimitiveTypeIsDouble().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMethodInvocationStaticType() {
		if (methodInvocationStaticTypeEClass == null) {
			methodInvocationStaticTypeEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(47);
		}
		return methodInvocationStaticTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodInvocationStaticType__IsAppropriate_FWD__Match_MMethodInvocation_Type() {
		return getMethodInvocationStaticType().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodInvocationStaticType__Perform_FWD__IsApplicableMatch() {
		return getMethodInvocationStaticType().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodInvocationStaticType__IsApplicable_FWD__Match() {
		return getMethodInvocationStaticType().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodInvocationStaticType__RegisterObjectsToMatch_FWD__Match_MMethodInvocation_Type() {
		return getMethodInvocationStaticType().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodInvocationStaticType__IsAppropriate_solveCsp_FWD__Match_MMethodInvocation_Type() {
		return getMethodInvocationStaticType().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodInvocationStaticType__IsAppropriate_checkCsp_FWD__CSP() {
		return getMethodInvocationStaticType().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodInvocationStaticType__IsApplicable_solveCsp_FWD__IsApplicableMatch_AbstractMethodInvocationToTAccess_MMethodInvocation_TypeToTAbstractType_TCall_TAbstractType_Type() {
		return getMethodInvocationStaticType().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodInvocationStaticType__IsApplicable_checkCsp_FWD__CSP() {
		return getMethodInvocationStaticType().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodInvocationStaticType__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getMethodInvocationStaticType().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodInvocationStaticType__CheckTypes_FWD__Match() {
		return getMethodInvocationStaticType().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodInvocationStaticType__IsAppropriate_BWD__Match_TCall_TAbstractType() {
		return getMethodInvocationStaticType().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodInvocationStaticType__Perform_BWD__IsApplicableMatch() {
		return getMethodInvocationStaticType().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodInvocationStaticType__IsApplicable_BWD__Match() {
		return getMethodInvocationStaticType().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodInvocationStaticType__RegisterObjectsToMatch_BWD__Match_TCall_TAbstractType() {
		return getMethodInvocationStaticType().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodInvocationStaticType__IsAppropriate_solveCsp_BWD__Match_TCall_TAbstractType() {
		return getMethodInvocationStaticType().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodInvocationStaticType__IsAppropriate_checkCsp_BWD__CSP() {
		return getMethodInvocationStaticType().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodInvocationStaticType__IsApplicable_solveCsp_BWD__IsApplicableMatch_AbstractMethodInvocationToTAccess_MMethodInvocation_TypeToTAbstractType_TCall_TAbstractType_Type() {
		return getMethodInvocationStaticType().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodInvocationStaticType__IsApplicable_checkCsp_BWD__CSP() {
		return getMethodInvocationStaticType().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodInvocationStaticType__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getMethodInvocationStaticType().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodInvocationStaticType__CheckTypes_BWD__Match() {
		return getMethodInvocationStaticType().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodInvocationStaticType__IsAppropriate_BWD_EMoflonEdge_40__EMoflonEdge() {
		return getMethodInvocationStaticType().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodInvocationStaticType__IsAppropriate_FWD_EMoflonEdge_41__EMoflonEdge() {
		return getMethodInvocationStaticType().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodInvocationStaticType__CheckAttributes_FWD__TripleMatch() {
		return getMethodInvocationStaticType().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodInvocationStaticType__CheckAttributes_BWD__TripleMatch() {
		return getMethodInvocationStaticType().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodInvocationStaticType__IsApplicable_CC__Match_Match() {
		return getMethodInvocationStaticType().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodInvocationStaticType__IsApplicable_solveCsp_CC__MMethodInvocation_TCall_TAbstractType_Type_Match_Match() {
		return getMethodInvocationStaticType().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodInvocationStaticType__IsApplicable_checkCsp_CC__CSP() {
		return getMethodInvocationStaticType().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodInvocationStaticType__CheckDEC_FWD__MMethodInvocation_Type() {
		return getMethodInvocationStaticType().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodInvocationStaticType__CheckDEC_BWD__TCall_TAbstractType() {
		return getMethodInvocationStaticType().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodInvocationStaticType__GenerateModel__RuleEntryContainer_AbstractMethodInvocationToTAccess_TypeToTAbstractType() {
		return getMethodInvocationStaticType().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodInvocationStaticType__GenerateModel_solveCsp_BWD__IsApplicableMatch_AbstractMethodInvocationToTAccess_MMethodInvocation_TypeToTAbstractType_TCall_TAbstractType_Type_ModelgeneratorRuleResult() {
		return getMethodInvocationStaticType().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodInvocationStaticType__GenerateModel_checkCsp_BWD__CSP() {
		return getMethodInvocationStaticType().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getParameterizedTypeToType() {
		if (parameterizedTypeToTypeEClass == null) {
			parameterizedTypeToTypeEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(48);
		}
		return parameterizedTypeToTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedTypeToType__IsAppropriate_FWD__Match_ParameterizedType_Model_AbstractTypeDeclaration_TypeAccess() {
		return getParameterizedTypeToType().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedTypeToType__Perform_FWD__IsApplicableMatch() {
		return getParameterizedTypeToType().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedTypeToType__IsApplicable_FWD__Match() {
		return getParameterizedTypeToType().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedTypeToType__RegisterObjectsToMatch_FWD__Match_ParameterizedType_Model_AbstractTypeDeclaration_TypeAccess() {
		return getParameterizedTypeToType().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedTypeToType__IsAppropriate_solveCsp_FWD__Match_ParameterizedType_Model_AbstractTypeDeclaration_TypeAccess() {
		return getParameterizedTypeToType().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedTypeToType__IsAppropriate_checkCsp_FWD__CSP() {
		return getParameterizedTypeToType().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedTypeToType__IsApplicable_solveCsp_FWD__IsApplicableMatch_ParameterizedType_Model_TAbstractType_AbstractTypeDeclaration_TypeToTAbstractType_TypeAccess() {
		return getParameterizedTypeToType().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedTypeToType__IsApplicable_checkCsp_FWD__CSP() {
		return getParameterizedTypeToType().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedTypeToType__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getParameterizedTypeToType().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedTypeToType__CheckTypes_FWD__Match() {
		return getParameterizedTypeToType().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedTypeToType__IsAppropriate_BWD__Match_TAbstractType() {
		return getParameterizedTypeToType().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedTypeToType__Perform_BWD__IsApplicableMatch() {
		return getParameterizedTypeToType().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedTypeToType__IsApplicable_BWD__Match() {
		return getParameterizedTypeToType().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedTypeToType__RegisterObjectsToMatch_BWD__Match_TAbstractType() {
		return getParameterizedTypeToType().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedTypeToType__IsAppropriate_solveCsp_BWD__Match_TAbstractType() {
		return getParameterizedTypeToType().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedTypeToType__IsAppropriate_checkCsp_BWD__CSP() {
		return getParameterizedTypeToType().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedTypeToType__CheckTypes_BWD__Match() {
		return getParameterizedTypeToType().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedTypeToType__IsAppropriate_BWD_TAbstractType_0__TAbstractType() {
		return getParameterizedTypeToType().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedTypeToType__IsAppropriate_FWD_EMoflonEdge_42__EMoflonEdge() {
		return getParameterizedTypeToType().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedTypeToType__CheckAttributes_FWD__TripleMatch() {
		return getParameterizedTypeToType().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedTypeToType__CheckAttributes_BWD__TripleMatch() {
		return getParameterizedTypeToType().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedTypeToType__IsApplicable_CC__Match_Match() {
		return getParameterizedTypeToType().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedTypeToType__IsApplicable_solveCsp_CC__ParameterizedType_Model_TAbstractType_AbstractTypeDeclaration_TypeAccess_Match_Match() {
		return getParameterizedTypeToType().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedTypeToType__IsApplicable_checkCsp_CC__CSP() {
		return getParameterizedTypeToType().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedTypeToType__CheckDEC_FWD__ParameterizedType_Model_AbstractTypeDeclaration_TypeAccess() {
		return getParameterizedTypeToType().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedTypeToType__CheckDEC_BWD__TAbstractType() {
		return getParameterizedTypeToType().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedTypeToType__GenerateModel__RuleEntryContainer_Model_TypeToTAbstractType() {
		return getParameterizedTypeToType().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedTypeToType__GenerateModel_solveCsp_BWD__IsApplicableMatch_Model_TAbstractType_AbstractTypeDeclaration_TypeToTAbstractType_ModelgeneratorRuleResult() {
		return getParameterizedTypeToType().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterizedTypeToType__GenerateModel_checkCsp_BWD__CSP() {
		return getParameterizedTypeToType().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnnotationMemberValueBoolean() {
		if (annotationMemberValueBooleanEClass == null) {
			annotationMemberValueBooleanEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(49);
		}
		return annotationMemberValueBooleanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueBoolean__IsAppropriate_FWD__Match_Annotation_AnnotationMemberValuePair_BodyDeclaration_BooleanLiteral() {
		return getAnnotationMemberValueBoolean().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueBoolean__Perform_FWD__IsApplicableMatch() {
		return getAnnotationMemberValueBoolean().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueBoolean__IsApplicable_FWD__Match() {
		return getAnnotationMemberValueBoolean().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueBoolean__RegisterObjectsToMatch_FWD__Match_Annotation_AnnotationMemberValuePair_BodyDeclaration_BooleanLiteral() {
		return getAnnotationMemberValueBoolean().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueBoolean__IsAppropriate_solveCsp_FWD__Match_Annotation_AnnotationMemberValuePair_BodyDeclaration_BooleanLiteral() {
		return getAnnotationMemberValueBoolean().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueBoolean__IsAppropriate_checkCsp_FWD__CSP() {
		return getAnnotationMemberValueBoolean().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueBoolean__IsApplicable_solveCsp_FWD__IsApplicableMatch_Annotation_AnnotationMemberValuePairToTAnnotationValue_AnnotationMemberValuePair_BodyDeclaration_TAnnotationValue_BooleanLiteral() {
		return getAnnotationMemberValueBoolean().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueBoolean__IsApplicable_checkCsp_FWD__CSP() {
		return getAnnotationMemberValueBoolean().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueBoolean__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getAnnotationMemberValueBoolean().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueBoolean__CheckTypes_FWD__Match() {
		return getAnnotationMemberValueBoolean().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueBoolean__IsAppropriate_BWD__Match_TBoolNode_TAnnotationValue() {
		return getAnnotationMemberValueBoolean().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueBoolean__Perform_BWD__IsApplicableMatch() {
		return getAnnotationMemberValueBoolean().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueBoolean__IsApplicable_BWD__Match() {
		return getAnnotationMemberValueBoolean().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueBoolean__RegisterObjectsToMatch_BWD__Match_TBoolNode_TAnnotationValue() {
		return getAnnotationMemberValueBoolean().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueBoolean__IsAppropriate_solveCsp_BWD__Match_TBoolNode_TAnnotationValue() {
		return getAnnotationMemberValueBoolean().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueBoolean__IsAppropriate_checkCsp_BWD__CSP() {
		return getAnnotationMemberValueBoolean().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueBoolean__IsApplicable_solveCsp_BWD__IsApplicableMatch_Annotation_AnnotationMemberValuePairToTAnnotationValue_AnnotationMemberValuePair_TBoolNode_BodyDeclaration_TAnnotationValue() {
		return getAnnotationMemberValueBoolean().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueBoolean__IsApplicable_checkCsp_BWD__CSP() {
		return getAnnotationMemberValueBoolean().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueBoolean__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getAnnotationMemberValueBoolean().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueBoolean__CheckTypes_BWD__Match() {
		return getAnnotationMemberValueBoolean().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueBoolean__IsAppropriate_BWD_EMoflonEdge_41__EMoflonEdge() {
		return getAnnotationMemberValueBoolean().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueBoolean__IsAppropriate_FWD_EMoflonEdge_43__EMoflonEdge() {
		return getAnnotationMemberValueBoolean().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueBoolean__CheckAttributes_FWD__TripleMatch() {
		return getAnnotationMemberValueBoolean().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueBoolean__CheckAttributes_BWD__TripleMatch() {
		return getAnnotationMemberValueBoolean().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueBoolean__IsApplicable_CC__Match_Match() {
		return getAnnotationMemberValueBoolean().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueBoolean__IsApplicable_solveCsp_CC__Annotation_AnnotationMemberValuePair_TBoolNode_BodyDeclaration_TAnnotationValue_BooleanLiteral_Match_Match() {
		return getAnnotationMemberValueBoolean().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueBoolean__IsApplicable_checkCsp_CC__CSP() {
		return getAnnotationMemberValueBoolean().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueBoolean__CheckDEC_FWD__Annotation_AnnotationMemberValuePair_BodyDeclaration_BooleanLiteral() {
		return getAnnotationMemberValueBoolean().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueBoolean__CheckDEC_BWD__TBoolNode_TAnnotationValue() {
		return getAnnotationMemberValueBoolean().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueBoolean__GenerateModel__RuleEntryContainer_AnnotationMemberValuePairToTAnnotationValue() {
		return getAnnotationMemberValueBoolean().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueBoolean__GenerateModel_solveCsp_BWD__IsApplicableMatch_Annotation_AnnotationMemberValuePairToTAnnotationValue_AnnotationMemberValuePair_BodyDeclaration_TAnnotationValue_ModelgeneratorRuleResult() {
		return getAnnotationMemberValueBoolean().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueBoolean__GenerateModel_checkCsp_BWD__CSP() {
		return getAnnotationMemberValueBoolean().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMethodOverriding() {
		if (methodOverridingEClass == null) {
			methodOverridingEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(50);
		}
		return methodOverridingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodOverriding__IsAppropriate_FWD__Match_MMethodDefinition_MMethodDefinition() {
		return getMethodOverriding().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodOverriding__Perform_FWD__IsApplicableMatch() {
		return getMethodOverriding().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodOverriding__IsApplicable_FWD__Match() {
		return getMethodOverriding().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodOverriding__RegisterObjectsToMatch_FWD__Match_MMethodDefinition_MMethodDefinition() {
		return getMethodOverriding().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodOverriding__IsAppropriate_solveCsp_FWD__Match_MMethodDefinition_MMethodDefinition() {
		return getMethodOverriding().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodOverriding__IsAppropriate_checkCsp_FWD__CSP() {
		return getMethodOverriding().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodOverriding__IsApplicable_solveCsp_FWD__IsApplicableMatch_MMethodDefinition_MMethodDefinition_MDefinitionToTMember_TMethodDefinition_TMethodDefinition_MDefinitionToTMember() {
		return getMethodOverriding().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodOverriding__IsApplicable_checkCsp_FWD__CSP() {
		return getMethodOverriding().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodOverriding__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getMethodOverriding().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodOverriding__CheckTypes_FWD__Match() {
		return getMethodOverriding().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodOverriding__IsAppropriate_BWD__Match_TMethodDefinition_TMethodDefinition() {
		return getMethodOverriding().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodOverriding__Perform_BWD__IsApplicableMatch() {
		return getMethodOverriding().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodOverriding__IsApplicable_BWD__Match() {
		return getMethodOverriding().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodOverriding__RegisterObjectsToMatch_BWD__Match_TMethodDefinition_TMethodDefinition() {
		return getMethodOverriding().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodOverriding__IsAppropriate_solveCsp_BWD__Match_TMethodDefinition_TMethodDefinition() {
		return getMethodOverriding().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodOverriding__IsAppropriate_checkCsp_BWD__CSP() {
		return getMethodOverriding().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodOverriding__IsApplicable_solveCsp_BWD__IsApplicableMatch_MMethodDefinition_MMethodDefinition_MDefinitionToTMember_TMethodDefinition_TMethodDefinition_MDefinitionToTMember() {
		return getMethodOverriding().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodOverriding__IsApplicable_checkCsp_BWD__CSP() {
		return getMethodOverriding().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodOverriding__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getMethodOverriding().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodOverriding__CheckTypes_BWD__Match() {
		return getMethodOverriding().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodOverriding__IsAppropriate_BWD_EMoflonEdge_42__EMoflonEdge() {
		return getMethodOverriding().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodOverriding__IsAppropriate_FWD_EMoflonEdge_44__EMoflonEdge() {
		return getMethodOverriding().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodOverriding__CheckAttributes_FWD__TripleMatch() {
		return getMethodOverriding().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodOverriding__CheckAttributes_BWD__TripleMatch() {
		return getMethodOverriding().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodOverriding__IsApplicable_CC__Match_Match() {
		return getMethodOverriding().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodOverriding__IsApplicable_solveCsp_CC__MMethodDefinition_MMethodDefinition_TMethodDefinition_TMethodDefinition_Match_Match() {
		return getMethodOverriding().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodOverriding__IsApplicable_checkCsp_CC__CSP() {
		return getMethodOverriding().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodOverriding__CheckDEC_FWD__MMethodDefinition_MMethodDefinition() {
		return getMethodOverriding().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodOverriding__CheckDEC_BWD__TMethodDefinition_TMethodDefinition() {
		return getMethodOverriding().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodOverriding__GenerateModel__RuleEntryContainer_MDefinitionToTMember_MDefinitionToTMember() {
		return getMethodOverriding().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodOverriding__GenerateModel_solveCsp_BWD__IsApplicableMatch_MMethodDefinition_MMethodDefinition_MDefinitionToTMember_TMethodDefinition_TMethodDefinition_MDefinitionToTMember_ModelgeneratorRuleResult() {
		return getMethodOverriding().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodOverriding__GenerateModel_checkCsp_BWD__CSP() {
		return getMethodOverriding().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getModelToPg() {
		if (modelToPgEClass == null) {
			modelToPgEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI).getEClassifiers()
					.get(51);
		}
		return modelToPgEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getModelToPg__IsAppropriate_FWD__Match_MGravityModel() {
		return getModelToPg().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getModelToPg__Perform_FWD__IsApplicableMatch() {
		return getModelToPg().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getModelToPg__IsApplicable_FWD__Match() {
		return getModelToPg().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getModelToPg__RegisterObjectsToMatch_FWD__Match_MGravityModel() {
		return getModelToPg().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getModelToPg__IsAppropriate_solveCsp_FWD__Match_MGravityModel() {
		return getModelToPg().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getModelToPg__IsAppropriate_checkCsp_FWD__CSP() {
		return getModelToPg().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getModelToPg__IsApplicable_solveCsp_FWD__IsApplicableMatch_MGravityModel() {
		return getModelToPg().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getModelToPg__IsApplicable_checkCsp_FWD__CSP() {
		return getModelToPg().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getModelToPg__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject() {
		return getModelToPg().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getModelToPg__CheckTypes_FWD__Match() {
		return getModelToPg().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getModelToPg__IsAppropriate_BWD__Match_TypeGraph() {
		return getModelToPg().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getModelToPg__Perform_BWD__IsApplicableMatch() {
		return getModelToPg().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getModelToPg__IsApplicable_BWD__Match() {
		return getModelToPg().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getModelToPg__RegisterObjectsToMatch_BWD__Match_TypeGraph() {
		return getModelToPg().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getModelToPg__IsAppropriate_solveCsp_BWD__Match_TypeGraph() {
		return getModelToPg().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getModelToPg__IsAppropriate_checkCsp_BWD__CSP() {
		return getModelToPg().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getModelToPg__IsApplicable_solveCsp_BWD__IsApplicableMatch_TypeGraph() {
		return getModelToPg().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getModelToPg__IsApplicable_checkCsp_BWD__CSP() {
		return getModelToPg().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getModelToPg__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject() {
		return getModelToPg().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getModelToPg__CheckTypes_BWD__Match() {
		return getModelToPg().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getModelToPg__IsAppropriate_BWD_TypeGraph_0__TypeGraph() {
		return getModelToPg().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getModelToPg__IsAppropriate_FWD_MGravityModel_0__MGravityModel() {
		return getModelToPg().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getModelToPg__CheckAttributes_FWD__TripleMatch() {
		return getModelToPg().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getModelToPg__CheckAttributes_BWD__TripleMatch() {
		return getModelToPg().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getModelToPg__IsApplicable_CC__Match_Match() {
		return getModelToPg().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getModelToPg__IsApplicable_solveCsp_CC__MGravityModel_TypeGraph_Match_Match() {
		return getModelToPg().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getModelToPg__IsApplicable_checkCsp_CC__CSP() {
		return getModelToPg().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getModelToPg__CheckDEC_FWD__MGravityModel() {
		return getModelToPg().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getModelToPg__CheckDEC_BWD__TypeGraph() {
		return getModelToPg().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getModelToPg__GenerateModel__RuleEntryContainer() {
		return getModelToPg().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getModelToPg__GenerateModel_solveCsp_BWD__IsApplicableMatch_ModelgeneratorRuleResult() {
		return getModelToPg().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getModelToPg__GenerateModel_checkCsp_BWD__CSP() {
		return getModelToPg().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEnumInAnonymous() {
		if (enumInAnonymousEClass == null) {
			enumInAnonymousEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(52);
		}
		return enumInAnonymousEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEnumInAnonymous__IsAppropriate_FWD__Match_EnumDeclaration_AnonymousClassDeclaration() {
		return getEnumInAnonymous().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEnumInAnonymous__Perform_FWD__IsApplicableMatch() {
		return getEnumInAnonymous().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEnumInAnonymous__IsApplicable_FWD__Match() {
		return getEnumInAnonymous().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEnumInAnonymous__RegisterObjectsToMatch_FWD__Match_EnumDeclaration_AnonymousClassDeclaration() {
		return getEnumInAnonymous().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEnumInAnonymous__IsAppropriate_solveCsp_FWD__Match_EnumDeclaration_AnonymousClassDeclaration() {
		return getEnumInAnonymous().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEnumInAnonymous__IsAppropriate_checkCsp_FWD__CSP() {
		return getEnumInAnonymous().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEnumInAnonymous__IsApplicable_solveCsp_FWD__IsApplicableMatch_TClass_EnumDeclaration_TPackage_TypeGraph_AnonymousClassDeclarationToTClass_AnonymousClassDeclaration() {
		return getEnumInAnonymous().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEnumInAnonymous__IsApplicable_checkCsp_FWD__CSP() {
		return getEnumInAnonymous().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEnumInAnonymous__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getEnumInAnonymous().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEnumInAnonymous__CheckTypes_FWD__Match() {
		return getEnumInAnonymous().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEnumInAnonymous__IsAppropriate_BWD__Match_TClass_TPackage_TEnum_TypeGraph_TClass() {
		return getEnumInAnonymous().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEnumInAnonymous__Perform_BWD__IsApplicableMatch() {
		return getEnumInAnonymous().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEnumInAnonymous__IsApplicable_BWD__Match() {
		return getEnumInAnonymous().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEnumInAnonymous__RegisterObjectsToMatch_BWD__Match_TClass_TPackage_TEnum_TypeGraph_TClass() {
		return getEnumInAnonymous().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEnumInAnonymous__IsAppropriate_solveCsp_BWD__Match_TClass_TPackage_TEnum_TypeGraph_TClass() {
		return getEnumInAnonymous().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEnumInAnonymous__IsAppropriate_checkCsp_BWD__CSP() {
		return getEnumInAnonymous().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEnumInAnonymous__IsApplicable_solveCsp_BWD__IsApplicableMatch_TClass_TPackage_TEnum_TypeGraph_TClass_AnonymousClassDeclarationToTClass_AnonymousClassDeclaration() {
		return getEnumInAnonymous().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEnumInAnonymous__IsApplicable_checkCsp_BWD__CSP() {
		return getEnumInAnonymous().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEnumInAnonymous__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getEnumInAnonymous().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEnumInAnonymous__CheckTypes_BWD__Match() {
		return getEnumInAnonymous().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEnumInAnonymous__IsAppropriate_BWD_EMoflonEdge_43__EMoflonEdge() {
		return getEnumInAnonymous().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEnumInAnonymous__IsAppropriate_FWD_EMoflonEdge_45__EMoflonEdge() {
		return getEnumInAnonymous().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEnumInAnonymous__CheckAttributes_FWD__TripleMatch() {
		return getEnumInAnonymous().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEnumInAnonymous__CheckAttributes_BWD__TripleMatch() {
		return getEnumInAnonymous().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEnumInAnonymous__IsApplicable_CC__Match_Match() {
		return getEnumInAnonymous().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEnumInAnonymous__IsApplicable_solveCsp_CC__TClass_EnumDeclaration_TPackage_TEnum_TypeGraph_TClass_AnonymousClassDeclaration_Match_Match() {
		return getEnumInAnonymous().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEnumInAnonymous__IsApplicable_checkCsp_CC__CSP() {
		return getEnumInAnonymous().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEnumInAnonymous__CheckDEC_FWD__EnumDeclaration_AnonymousClassDeclaration() {
		return getEnumInAnonymous().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEnumInAnonymous__CheckDEC_BWD__TClass_TPackage_TEnum_TypeGraph_TClass() {
		return getEnumInAnonymous().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEnumInAnonymous__GenerateModel__RuleEntryContainer_AnonymousClassDeclarationToTClass() {
		return getEnumInAnonymous().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEnumInAnonymous__GenerateModel_solveCsp_BWD__IsApplicableMatch_TClass_TPackage_TypeGraph_AnonymousClassDeclarationToTClass_AnonymousClassDeclaration_ModelgeneratorRuleResult() {
		return getEnumInAnonymous().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEnumInAnonymous__GenerateModel_checkCsp_BWD__CSP() {
		return getEnumInAnonymous().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFieldAccessRead() {
		if (fieldAccessReadEClass == null) {
			fieldAccessReadEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(53);
		}
		return fieldAccessReadEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldAccessRead__IsAppropriate_FWD__Match_MSingleVariableAccess_VariableDeclarationFragment_MFieldDefinition_MDefinition() {
		return getFieldAccessRead().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldAccessRead__Perform_FWD__IsApplicableMatch() {
		return getFieldAccessRead().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldAccessRead__IsApplicable_FWD__Match() {
		return getFieldAccessRead().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldAccessRead__RegisterObjectsToMatch_FWD__Match_MSingleVariableAccess_VariableDeclarationFragment_MFieldDefinition_MDefinition() {
		return getFieldAccessRead().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldAccessRead__IsAppropriate_solveCsp_FWD__Match_MSingleVariableAccess_VariableDeclarationFragment_MFieldDefinition_MDefinition() {
		return getFieldAccessRead().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldAccessRead__IsAppropriate_checkCsp_FWD__CSP() {
		return getFieldAccessRead().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldAccessRead__IsApplicable_solveCsp_FWD__IsApplicableMatch_MSingleVariableAccess_MDefinitionToTMember_VariableDeclarationFragment_TMember_MFieldDefinition_MDefinitionToTMember_MDefinition_TFieldDefinition() {
		return getFieldAccessRead().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldAccessRead__IsApplicable_checkCsp_FWD__CSP() {
		return getFieldAccessRead().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldAccessRead__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getFieldAccessRead().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldAccessRead__CheckTypes_FWD__Match() {
		return getFieldAccessRead().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldAccessRead__IsAppropriate_BWD__Match_TMember_TRead_TFieldDefinition() {
		return getFieldAccessRead().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldAccessRead__Perform_BWD__IsApplicableMatch() {
		return getFieldAccessRead().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldAccessRead__IsApplicable_BWD__Match() {
		return getFieldAccessRead().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldAccessRead__RegisterObjectsToMatch_BWD__Match_TMember_TRead_TFieldDefinition() {
		return getFieldAccessRead().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldAccessRead__IsAppropriate_solveCsp_BWD__Match_TMember_TRead_TFieldDefinition() {
		return getFieldAccessRead().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldAccessRead__IsAppropriate_checkCsp_BWD__CSP() {
		return getFieldAccessRead().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldAccessRead__IsApplicable_solveCsp_BWD__IsApplicableMatch_MDefinitionToTMember_VariableDeclarationFragment_TMember_MFieldDefinition_TRead_MDefinitionToTMember_MDefinition_TFieldDefinition() {
		return getFieldAccessRead().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldAccessRead__IsApplicable_checkCsp_BWD__CSP() {
		return getFieldAccessRead().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldAccessRead__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getFieldAccessRead().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldAccessRead__CheckTypes_BWD__Match() {
		return getFieldAccessRead().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldAccessRead__IsAppropriate_BWD_EMoflonEdge_44__EMoflonEdge() {
		return getFieldAccessRead().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldAccessRead__IsAppropriate_FWD_EMoflonEdge_46__EMoflonEdge() {
		return getFieldAccessRead().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldAccessRead__CheckAttributes_FWD__TripleMatch() {
		return getFieldAccessRead().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldAccessRead__CheckAttributes_BWD__TripleMatch() {
		return getFieldAccessRead().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldAccessRead__IsApplicable_CC__Match_Match() {
		return getFieldAccessRead().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldAccessRead__IsApplicable_solveCsp_CC__MSingleVariableAccess_VariableDeclarationFragment_TMember_MFieldDefinition_TRead_MDefinition_TFieldDefinition_Match_Match() {
		return getFieldAccessRead().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldAccessRead__IsApplicable_checkCsp_CC__CSP() {
		return getFieldAccessRead().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldAccessRead__CheckDEC_FWD__MSingleVariableAccess_VariableDeclarationFragment_MFieldDefinition_MDefinition() {
		return getFieldAccessRead().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldAccessRead__CheckDEC_BWD__TMember_TRead_TFieldDefinition() {
		return getFieldAccessRead().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldAccessRead__GenerateModel__RuleEntryContainer_MDefinitionToTMember_MDefinitionToTMember() {
		return getFieldAccessRead().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldAccessRead__GenerateModel_solveCsp_BWD__IsApplicableMatch_MDefinitionToTMember_VariableDeclarationFragment_TMember_MFieldDefinition_MDefinitionToTMember_MDefinition_TFieldDefinition_ModelgeneratorRuleResult() {
		return getFieldAccessRead().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldAccessRead__GenerateModel_checkCsp_BWD__CSP() {
		return getFieldAccessRead().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnnotationTypeAccessOnBodyDecl() {
		if (annotationTypeAccessOnBodyDeclEClass == null) {
			annotationTypeAccessOnBodyDeclEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(54);
		}
		return annotationTypeAccessOnBodyDeclEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeAccessOnBodyDecl__IsAppropriate_FWD__Match_TypeAccess_AnnotationTypeDeclaration_BodyDeclaration_Annotation() {
		return getAnnotationTypeAccessOnBodyDecl().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeAccessOnBodyDecl__Perform_FWD__IsApplicableMatch() {
		return getAnnotationTypeAccessOnBodyDecl().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeAccessOnBodyDecl__IsApplicable_FWD__Match() {
		return getAnnotationTypeAccessOnBodyDecl().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeAccessOnBodyDecl__RegisterObjectsToMatch_FWD__Match_TypeAccess_AnnotationTypeDeclaration_BodyDeclaration_Annotation() {
		return getAnnotationTypeAccessOnBodyDecl().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeAccessOnBodyDecl__IsAppropriate_solveCsp_FWD__Match_TypeAccess_AnnotationTypeDeclaration_BodyDeclaration_Annotation() {
		return getAnnotationTypeAccessOnBodyDecl().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeAccessOnBodyDecl__IsAppropriate_checkCsp_FWD__CSP() {
		return getAnnotationTypeAccessOnBodyDecl().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeAccessOnBodyDecl__IsApplicable_solveCsp_FWD__IsApplicableMatch_TAnnotation_TypeAccess_AnnotationToTAnnotation_AnnotationTypeDeclaration_TypeToTAbstractType_BodyDeclaration_Annotation_TAnnotationType() {
		return getAnnotationTypeAccessOnBodyDecl().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeAccessOnBodyDecl__IsApplicable_checkCsp_FWD__CSP() {
		return getAnnotationTypeAccessOnBodyDecl().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeAccessOnBodyDecl__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getAnnotationTypeAccessOnBodyDecl().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeAccessOnBodyDecl__CheckTypes_FWD__Match() {
		return getAnnotationTypeAccessOnBodyDecl().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeAccessOnBodyDecl__IsAppropriate_BWD__Match_TAnnotation_TAnnotationType() {
		return getAnnotationTypeAccessOnBodyDecl().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeAccessOnBodyDecl__Perform_BWD__IsApplicableMatch() {
		return getAnnotationTypeAccessOnBodyDecl().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeAccessOnBodyDecl__IsApplicable_BWD__Match() {
		return getAnnotationTypeAccessOnBodyDecl().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeAccessOnBodyDecl__RegisterObjectsToMatch_BWD__Match_TAnnotation_TAnnotationType() {
		return getAnnotationTypeAccessOnBodyDecl().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeAccessOnBodyDecl__IsAppropriate_solveCsp_BWD__Match_TAnnotation_TAnnotationType() {
		return getAnnotationTypeAccessOnBodyDecl().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeAccessOnBodyDecl__IsAppropriate_checkCsp_BWD__CSP() {
		return getAnnotationTypeAccessOnBodyDecl().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeAccessOnBodyDecl__IsApplicable_solveCsp_BWD__IsApplicableMatch_TAnnotation_AnnotationToTAnnotation_AnnotationTypeDeclaration_TypeToTAbstractType_BodyDeclaration_Annotation_TAnnotationType() {
		return getAnnotationTypeAccessOnBodyDecl().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeAccessOnBodyDecl__IsApplicable_checkCsp_BWD__CSP() {
		return getAnnotationTypeAccessOnBodyDecl().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeAccessOnBodyDecl__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getAnnotationTypeAccessOnBodyDecl().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeAccessOnBodyDecl__CheckTypes_BWD__Match() {
		return getAnnotationTypeAccessOnBodyDecl().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeAccessOnBodyDecl__IsAppropriate_BWD_EMoflonEdge_45__EMoflonEdge() {
		return getAnnotationTypeAccessOnBodyDecl().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeAccessOnBodyDecl__IsAppropriate_FWD_EMoflonEdge_47__EMoflonEdge() {
		return getAnnotationTypeAccessOnBodyDecl().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeAccessOnBodyDecl__CheckAttributes_FWD__TripleMatch() {
		return getAnnotationTypeAccessOnBodyDecl().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeAccessOnBodyDecl__CheckAttributes_BWD__TripleMatch() {
		return getAnnotationTypeAccessOnBodyDecl().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeAccessOnBodyDecl__IsApplicable_CC__Match_Match() {
		return getAnnotationTypeAccessOnBodyDecl().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeAccessOnBodyDecl__IsApplicable_solveCsp_CC__TAnnotation_TypeAccess_AnnotationTypeDeclaration_BodyDeclaration_Annotation_TAnnotationType_Match_Match() {
		return getAnnotationTypeAccessOnBodyDecl().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeAccessOnBodyDecl__IsApplicable_checkCsp_CC__CSP() {
		return getAnnotationTypeAccessOnBodyDecl().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeAccessOnBodyDecl__CheckDEC_FWD__TypeAccess_AnnotationTypeDeclaration_BodyDeclaration_Annotation() {
		return getAnnotationTypeAccessOnBodyDecl().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeAccessOnBodyDecl__CheckDEC_BWD__TAnnotation_TAnnotationType() {
		return getAnnotationTypeAccessOnBodyDecl().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeAccessOnBodyDecl__GenerateModel__RuleEntryContainer_AnnotationToTAnnotation_TypeToTAbstractType() {
		return getAnnotationTypeAccessOnBodyDecl().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeAccessOnBodyDecl__GenerateModel_solveCsp_BWD__IsApplicableMatch_TAnnotation_AnnotationToTAnnotation_AnnotationTypeDeclaration_TypeToTAbstractType_BodyDeclaration_Annotation_TAnnotationType_ModelgeneratorRuleResult() {
		return getAnnotationTypeAccessOnBodyDecl().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeAccessOnBodyDecl__GenerateModel_checkCsp_BWD__CSP() {
		return getAnnotationTypeAccessOnBodyDecl().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSuperConstructorInvocation() {
		if (superConstructorInvocationEClass == null) {
			superConstructorInvocationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(55);
		}
		return superConstructorInvocationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperConstructorInvocation__IsAppropriate_FWD__Match_MSuperConstructorInvocation_MDefinition() {
		return getSuperConstructorInvocation().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperConstructorInvocation__Perform_FWD__IsApplicableMatch() {
		return getSuperConstructorInvocation().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperConstructorInvocation__IsApplicable_FWD__Match() {
		return getSuperConstructorInvocation().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperConstructorInvocation__RegisterObjectsToMatch_FWD__Match_MSuperConstructorInvocation_MDefinition() {
		return getSuperConstructorInvocation().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperConstructorInvocation__IsAppropriate_solveCsp_FWD__Match_MSuperConstructorInvocation_MDefinition() {
		return getSuperConstructorInvocation().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperConstructorInvocation__IsAppropriate_checkCsp_FWD__CSP() {
		return getSuperConstructorInvocation().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperConstructorInvocation__IsApplicable_solveCsp_FWD__IsApplicableMatch_MSuperConstructorInvocation_MDefinitionToTMember_TMember_MDefinition() {
		return getSuperConstructorInvocation().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperConstructorInvocation__IsApplicable_checkCsp_FWD__CSP() {
		return getSuperConstructorInvocation().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperConstructorInvocation__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getSuperConstructorInvocation().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperConstructorInvocation__CheckTypes_FWD__Match() {
		return getSuperConstructorInvocation().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperConstructorInvocation__IsAppropriate_BWD__Match_TMember_TCall() {
		return getSuperConstructorInvocation().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperConstructorInvocation__Perform_BWD__IsApplicableMatch() {
		return getSuperConstructorInvocation().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperConstructorInvocation__IsApplicable_BWD__Match() {
		return getSuperConstructorInvocation().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperConstructorInvocation__RegisterObjectsToMatch_BWD__Match_TMember_TCall() {
		return getSuperConstructorInvocation().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperConstructorInvocation__IsAppropriate_solveCsp_BWD__Match_TMember_TCall() {
		return getSuperConstructorInvocation().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperConstructorInvocation__IsAppropriate_checkCsp_BWD__CSP() {
		return getSuperConstructorInvocation().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperConstructorInvocation__IsApplicable_solveCsp_BWD__IsApplicableMatch_MDefinitionToTMember_TMember_TCall_MDefinition() {
		return getSuperConstructorInvocation().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperConstructorInvocation__IsApplicable_checkCsp_BWD__CSP() {
		return getSuperConstructorInvocation().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperConstructorInvocation__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getSuperConstructorInvocation().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperConstructorInvocation__CheckTypes_BWD__Match() {
		return getSuperConstructorInvocation().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperConstructorInvocation__IsAppropriate_BWD_EMoflonEdge_46__EMoflonEdge() {
		return getSuperConstructorInvocation().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperConstructorInvocation__IsAppropriate_FWD_EMoflonEdge_48__EMoflonEdge() {
		return getSuperConstructorInvocation().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperConstructorInvocation__CheckAttributes_FWD__TripleMatch() {
		return getSuperConstructorInvocation().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperConstructorInvocation__CheckAttributes_BWD__TripleMatch() {
		return getSuperConstructorInvocation().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperConstructorInvocation__IsApplicable_CC__Match_Match() {
		return getSuperConstructorInvocation().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperConstructorInvocation__IsApplicable_solveCsp_CC__MSuperConstructorInvocation_TMember_TCall_MDefinition_Match_Match() {
		return getSuperConstructorInvocation().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperConstructorInvocation__IsApplicable_checkCsp_CC__CSP() {
		return getSuperConstructorInvocation().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperConstructorInvocation__CheckDEC_FWD__MSuperConstructorInvocation_MDefinition() {
		return getSuperConstructorInvocation().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperConstructorInvocation__CheckDEC_BWD__TMember_TCall() {
		return getSuperConstructorInvocation().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperConstructorInvocation__GenerateModel__RuleEntryContainer_MDefinitionToTMember() {
		return getSuperConstructorInvocation().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperConstructorInvocation__GenerateModel_solveCsp_BWD__IsApplicableMatch_MDefinitionToTMember_TMember_MDefinition_ModelgeneratorRuleResult() {
		return getSuperConstructorInvocation().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSuperConstructorInvocation__GenerateModel_checkCsp_BWD__CSP() {
		return getSuperConstructorInvocation().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnnotationMemberValueNumber() {
		if (annotationMemberValueNumberEClass == null) {
			annotationMemberValueNumberEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(56);
		}
		return annotationMemberValueNumberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueNumber__IsAppropriate_FWD__Match_Annotation_AnnotationMemberValuePair_BodyDeclaration_NumberLiteral() {
		return getAnnotationMemberValueNumber().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueNumber__Perform_FWD__IsApplicableMatch() {
		return getAnnotationMemberValueNumber().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueNumber__IsApplicable_FWD__Match() {
		return getAnnotationMemberValueNumber().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueNumber__RegisterObjectsToMatch_FWD__Match_Annotation_AnnotationMemberValuePair_BodyDeclaration_NumberLiteral() {
		return getAnnotationMemberValueNumber().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueNumber__IsAppropriate_solveCsp_FWD__Match_Annotation_AnnotationMemberValuePair_BodyDeclaration_NumberLiteral() {
		return getAnnotationMemberValueNumber().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueNumber__IsAppropriate_checkCsp_FWD__CSP() {
		return getAnnotationMemberValueNumber().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueNumber__IsApplicable_solveCsp_FWD__IsApplicableMatch_Annotation_AnnotationMemberValuePairToTAnnotationValue_AnnotationMemberValuePair_BodyDeclaration_NumberLiteral_TAnnotationValue() {
		return getAnnotationMemberValueNumber().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueNumber__IsApplicable_checkCsp_FWD__CSP() {
		return getAnnotationMemberValueNumber().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueNumber__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getAnnotationMemberValueNumber().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueNumber__CheckTypes_FWD__Match() {
		return getAnnotationMemberValueNumber().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueNumber__IsAppropriate_BWD__Match_TNumberNode_TAnnotationValue() {
		return getAnnotationMemberValueNumber().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueNumber__Perform_BWD__IsApplicableMatch() {
		return getAnnotationMemberValueNumber().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueNumber__IsApplicable_BWD__Match() {
		return getAnnotationMemberValueNumber().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueNumber__RegisterObjectsToMatch_BWD__Match_TNumberNode_TAnnotationValue() {
		return getAnnotationMemberValueNumber().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueNumber__IsAppropriate_solveCsp_BWD__Match_TNumberNode_TAnnotationValue() {
		return getAnnotationMemberValueNumber().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueNumber__IsAppropriate_checkCsp_BWD__CSP() {
		return getAnnotationMemberValueNumber().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueNumber__IsApplicable_solveCsp_BWD__IsApplicableMatch_Annotation_AnnotationMemberValuePairToTAnnotationValue_AnnotationMemberValuePair_TNumberNode_BodyDeclaration_TAnnotationValue() {
		return getAnnotationMemberValueNumber().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueNumber__IsApplicable_checkCsp_BWD__CSP() {
		return getAnnotationMemberValueNumber().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueNumber__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getAnnotationMemberValueNumber().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueNumber__CheckTypes_BWD__Match() {
		return getAnnotationMemberValueNumber().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueNumber__IsAppropriate_BWD_EMoflonEdge_47__EMoflonEdge() {
		return getAnnotationMemberValueNumber().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueNumber__IsAppropriate_FWD_EMoflonEdge_49__EMoflonEdge() {
		return getAnnotationMemberValueNumber().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueNumber__CheckAttributes_FWD__TripleMatch() {
		return getAnnotationMemberValueNumber().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueNumber__CheckAttributes_BWD__TripleMatch() {
		return getAnnotationMemberValueNumber().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueNumber__IsApplicable_CC__Match_Match() {
		return getAnnotationMemberValueNumber().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueNumber__IsApplicable_solveCsp_CC__Annotation_AnnotationMemberValuePair_TNumberNode_BodyDeclaration_NumberLiteral_TAnnotationValue_Match_Match() {
		return getAnnotationMemberValueNumber().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueNumber__IsApplicable_checkCsp_CC__CSP() {
		return getAnnotationMemberValueNumber().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueNumber__CheckDEC_FWD__Annotation_AnnotationMemberValuePair_BodyDeclaration_NumberLiteral() {
		return getAnnotationMemberValueNumber().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueNumber__CheckDEC_BWD__TNumberNode_TAnnotationValue() {
		return getAnnotationMemberValueNumber().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueNumber__GenerateModel__RuleEntryContainer_AnnotationMemberValuePairToTAnnotationValue() {
		return getAnnotationMemberValueNumber().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueNumber__GenerateModel_solveCsp_BWD__IsApplicableMatch_Annotation_AnnotationMemberValuePairToTAnnotationValue_AnnotationMemberValuePair_BodyDeclaration_TAnnotationValue_ModelgeneratorRuleResult() {
		return getAnnotationMemberValueNumber().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueNumber__GenerateModel_checkCsp_BWD__CSP() {
		return getAnnotationMemberValueNumber().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getArrayTypeToType() {
		if (arrayTypeToTypeEClass == null) {
			arrayTypeToTypeEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(57);
		}
		return arrayTypeToTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getArrayTypeToType__IsAppropriate_FWD__Match_Model_ArrayType_Type_TypeAccess() {
		return getArrayTypeToType().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getArrayTypeToType__Perform_FWD__IsApplicableMatch() {
		return getArrayTypeToType().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getArrayTypeToType__IsApplicable_FWD__Match() {
		return getArrayTypeToType().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getArrayTypeToType__RegisterObjectsToMatch_FWD__Match_Model_ArrayType_Type_TypeAccess() {
		return getArrayTypeToType().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getArrayTypeToType__IsAppropriate_solveCsp_FWD__Match_Model_ArrayType_Type_TypeAccess() {
		return getArrayTypeToType().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getArrayTypeToType__IsAppropriate_checkCsp_FWD__CSP() {
		return getArrayTypeToType().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getArrayTypeToType__IsApplicable_solveCsp_FWD__IsApplicableMatch_Model_ArrayType_TypeToTAbstractType_TAbstractType_TypeGraph_Type_ModelToTypeGraph_TypeAccess() {
		return getArrayTypeToType().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getArrayTypeToType__IsApplicable_checkCsp_FWD__CSP() {
		return getArrayTypeToType().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getArrayTypeToType__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getArrayTypeToType().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getArrayTypeToType__CheckTypes_FWD__Match() {
		return getArrayTypeToType().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getArrayTypeToType__IsAppropriate_BWD__Match_TAbstractType_TypeGraph() {
		return getArrayTypeToType().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getArrayTypeToType__Perform_BWD__IsApplicableMatch() {
		return getArrayTypeToType().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getArrayTypeToType__IsApplicable_BWD__Match() {
		return getArrayTypeToType().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getArrayTypeToType__RegisterObjectsToMatch_BWD__Match_TAbstractType_TypeGraph() {
		return getArrayTypeToType().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getArrayTypeToType__IsAppropriate_solveCsp_BWD__Match_TAbstractType_TypeGraph() {
		return getArrayTypeToType().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getArrayTypeToType__IsAppropriate_checkCsp_BWD__CSP() {
		return getArrayTypeToType().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getArrayTypeToType__CheckTypes_BWD__Match() {
		return getArrayTypeToType().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getArrayTypeToType__IsAppropriate_BWD_TAbstractType_1__TAbstractType() {
		return getArrayTypeToType().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getArrayTypeToType__IsAppropriate_FWD_EMoflonEdge_50__EMoflonEdge() {
		return getArrayTypeToType().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getArrayTypeToType__CheckAttributes_FWD__TripleMatch() {
		return getArrayTypeToType().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getArrayTypeToType__CheckAttributes_BWD__TripleMatch() {
		return getArrayTypeToType().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getArrayTypeToType__IsApplicable_CC__Match_Match() {
		return getArrayTypeToType().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getArrayTypeToType__IsApplicable_solveCsp_CC__Model_ArrayType_TAbstractType_TypeGraph_Type_TypeAccess_Match_Match() {
		return getArrayTypeToType().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getArrayTypeToType__IsApplicable_checkCsp_CC__CSP() {
		return getArrayTypeToType().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getArrayTypeToType__CheckDEC_FWD__Model_ArrayType_Type_TypeAccess() {
		return getArrayTypeToType().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getArrayTypeToType__CheckDEC_BWD__TAbstractType_TypeGraph() {
		return getArrayTypeToType().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getArrayTypeToType__GenerateModel__RuleEntryContainer_ModelToTypeGraph() {
		return getArrayTypeToType().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getArrayTypeToType__GenerateModel_solveCsp_BWD__IsApplicableMatch_Model_TypeToTAbstractType_TAbstractType_TypeGraph_Type_ModelToTypeGraph_ModelgeneratorRuleResult() {
		return getArrayTypeToType().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getArrayTypeToType__GenerateModel_checkCsp_BWD__CSP() {
		return getArrayTypeToType().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getClassInnerMember() {
		if (classInnerMemberEClass == null) {
			classInnerMemberEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(58);
		}
		return classInnerMemberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUnresolvedTypeDeclaration() {
		if (unresolvedTypeDeclarationEClass == null) {
			unresolvedTypeDeclarationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(59);
		}
		return unresolvedTypeDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getUnresolvedTypeDeclaration__IsAppropriate_FWD__Match_MGravityModel_UnresolvedTypeDeclaration() {
		return getUnresolvedTypeDeclaration().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getUnresolvedTypeDeclaration__Perform_FWD__IsApplicableMatch() {
		return getUnresolvedTypeDeclaration().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getUnresolvedTypeDeclaration__IsApplicable_FWD__Match() {
		return getUnresolvedTypeDeclaration().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getUnresolvedTypeDeclaration__RegisterObjectsToMatch_FWD__Match_MGravityModel_UnresolvedTypeDeclaration() {
		return getUnresolvedTypeDeclaration().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getUnresolvedTypeDeclaration__IsAppropriate_solveCsp_FWD__Match_MGravityModel_UnresolvedTypeDeclaration() {
		return getUnresolvedTypeDeclaration().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getUnresolvedTypeDeclaration__IsAppropriate_checkCsp_FWD__CSP() {
		return getUnresolvedTypeDeclaration().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getUnresolvedTypeDeclaration__IsApplicable_solveCsp_FWD__IsApplicableMatch_TypeGraph_MGravityModel_ModelToTypeGraph_UnresolvedTypeDeclaration() {
		return getUnresolvedTypeDeclaration().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getUnresolvedTypeDeclaration__IsApplicable_checkCsp_FWD__CSP() {
		return getUnresolvedTypeDeclaration().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getUnresolvedTypeDeclaration__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getUnresolvedTypeDeclaration().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getUnresolvedTypeDeclaration__CheckTypes_FWD__Match() {
		return getUnresolvedTypeDeclaration().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getUnresolvedTypeDeclaration__IsAppropriate_BWD__Match_TypeGraph_TUnresolvedType() {
		return getUnresolvedTypeDeclaration().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getUnresolvedTypeDeclaration__Perform_BWD__IsApplicableMatch() {
		return getUnresolvedTypeDeclaration().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getUnresolvedTypeDeclaration__IsApplicable_BWD__Match() {
		return getUnresolvedTypeDeclaration().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getUnresolvedTypeDeclaration__RegisterObjectsToMatch_BWD__Match_TypeGraph_TUnresolvedType() {
		return getUnresolvedTypeDeclaration().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getUnresolvedTypeDeclaration__IsAppropriate_solveCsp_BWD__Match_TypeGraph_TUnresolvedType() {
		return getUnresolvedTypeDeclaration().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getUnresolvedTypeDeclaration__IsAppropriate_checkCsp_BWD__CSP() {
		return getUnresolvedTypeDeclaration().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getUnresolvedTypeDeclaration__IsApplicable_solveCsp_BWD__IsApplicableMatch_TypeGraph_MGravityModel_ModelToTypeGraph_TUnresolvedType() {
		return getUnresolvedTypeDeclaration().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getUnresolvedTypeDeclaration__IsApplicable_checkCsp_BWD__CSP() {
		return getUnresolvedTypeDeclaration().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getUnresolvedTypeDeclaration__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getUnresolvedTypeDeclaration().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getUnresolvedTypeDeclaration__CheckTypes_BWD__Match() {
		return getUnresolvedTypeDeclaration().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getUnresolvedTypeDeclaration__IsAppropriate_BWD_EMoflonEdge_48__EMoflonEdge() {
		return getUnresolvedTypeDeclaration().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getUnresolvedTypeDeclaration__IsAppropriate_FWD_EMoflonEdge_51__EMoflonEdge() {
		return getUnresolvedTypeDeclaration().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getUnresolvedTypeDeclaration__CheckAttributes_FWD__TripleMatch() {
		return getUnresolvedTypeDeclaration().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getUnresolvedTypeDeclaration__CheckAttributes_BWD__TripleMatch() {
		return getUnresolvedTypeDeclaration().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getUnresolvedTypeDeclaration__IsApplicable_CC__Match_Match() {
		return getUnresolvedTypeDeclaration().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getUnresolvedTypeDeclaration__IsApplicable_solveCsp_CC__TypeGraph_MGravityModel_TUnresolvedType_UnresolvedTypeDeclaration_Match_Match() {
		return getUnresolvedTypeDeclaration().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getUnresolvedTypeDeclaration__IsApplicable_checkCsp_CC__CSP() {
		return getUnresolvedTypeDeclaration().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getUnresolvedTypeDeclaration__CheckDEC_FWD__MGravityModel_UnresolvedTypeDeclaration() {
		return getUnresolvedTypeDeclaration().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getUnresolvedTypeDeclaration__CheckDEC_BWD__TypeGraph_TUnresolvedType() {
		return getUnresolvedTypeDeclaration().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getUnresolvedTypeDeclaration__GenerateModel__RuleEntryContainer_ModelToTypeGraph() {
		return getUnresolvedTypeDeclaration().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getUnresolvedTypeDeclaration__GenerateModel_solveCsp_BWD__IsApplicableMatch_TypeGraph_MGravityModel_ModelToTypeGraph_ModelgeneratorRuleResult() {
		return getUnresolvedTypeDeclaration().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getUnresolvedTypeDeclaration__GenerateModel_checkCsp_BWD__CSP() {
		return getUnresolvedTypeDeclaration().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getClassInAnonymous() {
		if (classInAnonymousEClass == null) {
			classInAnonymousEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(60);
		}
		return classInAnonymousEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassInAnonymous__IsAppropriate_FWD__Match_MClass_AnonymousClassDeclaration() {
		return getClassInAnonymous().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassInAnonymous__Perform_FWD__IsApplicableMatch() {
		return getClassInAnonymous().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassInAnonymous__IsApplicable_FWD__Match() {
		return getClassInAnonymous().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassInAnonymous__RegisterObjectsToMatch_FWD__Match_MClass_AnonymousClassDeclaration() {
		return getClassInAnonymous().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassInAnonymous__IsAppropriate_solveCsp_FWD__Match_MClass_AnonymousClassDeclaration() {
		return getClassInAnonymous().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassInAnonymous__IsAppropriate_checkCsp_FWD__CSP() {
		return getClassInAnonymous().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassInAnonymous__IsApplicable_solveCsp_FWD__IsApplicableMatch_TClass_MClass_TPackage_TypeGraph_AnonymousClassDeclarationToTClass_AnonymousClassDeclaration() {
		return getClassInAnonymous().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassInAnonymous__IsApplicable_checkCsp_FWD__CSP() {
		return getClassInAnonymous().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassInAnonymous__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getClassInAnonymous().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassInAnonymous__CheckTypes_FWD__Match() {
		return getClassInAnonymous().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassInAnonymous__IsAppropriate_BWD__Match_TClass_TPackage_TypeGraph_TClass() {
		return getClassInAnonymous().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassInAnonymous__Perform_BWD__IsApplicableMatch() {
		return getClassInAnonymous().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassInAnonymous__IsApplicable_BWD__Match() {
		return getClassInAnonymous().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassInAnonymous__RegisterObjectsToMatch_BWD__Match_TClass_TPackage_TypeGraph_TClass() {
		return getClassInAnonymous().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassInAnonymous__IsAppropriate_solveCsp_BWD__Match_TClass_TPackage_TypeGraph_TClass() {
		return getClassInAnonymous().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassInAnonymous__IsAppropriate_checkCsp_BWD__CSP() {
		return getClassInAnonymous().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassInAnonymous__IsApplicable_solveCsp_BWD__IsApplicableMatch_TClass_TPackage_TypeGraph_TClass_AnonymousClassDeclarationToTClass_AnonymousClassDeclaration() {
		return getClassInAnonymous().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassInAnonymous__IsApplicable_checkCsp_BWD__CSP() {
		return getClassInAnonymous().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassInAnonymous__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getClassInAnonymous().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassInAnonymous__CheckTypes_BWD__Match() {
		return getClassInAnonymous().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassInAnonymous__IsAppropriate_BWD_EMoflonEdge_49__EMoflonEdge() {
		return getClassInAnonymous().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassInAnonymous__IsAppropriate_FWD_EMoflonEdge_52__EMoflonEdge() {
		return getClassInAnonymous().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassInAnonymous__CheckAttributes_FWD__TripleMatch() {
		return getClassInAnonymous().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassInAnonymous__CheckAttributes_BWD__TripleMatch() {
		return getClassInAnonymous().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassInAnonymous__IsApplicable_CC__Match_Match() {
		return getClassInAnonymous().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassInAnonymous__IsApplicable_solveCsp_CC__TClass_MClass_TPackage_TypeGraph_TClass_AnonymousClassDeclaration_Match_Match() {
		return getClassInAnonymous().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassInAnonymous__IsApplicable_checkCsp_CC__CSP() {
		return getClassInAnonymous().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassInAnonymous__CheckDEC_FWD__MClass_AnonymousClassDeclaration() {
		return getClassInAnonymous().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassInAnonymous__CheckDEC_BWD__TClass_TPackage_TypeGraph_TClass() {
		return getClassInAnonymous().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassInAnonymous__GenerateModel__RuleEntryContainer_AnonymousClassDeclarationToTClass() {
		return getClassInAnonymous().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassInAnonymous__GenerateModel_solveCsp_BWD__IsApplicableMatch_TClass_TPackage_TypeGraph_AnonymousClassDeclarationToTClass_AnonymousClassDeclaration_ModelgeneratorRuleResult() {
		return getClassInAnonymous().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassInAnonymous__GenerateModel_checkCsp_BWD__CSP() {
		return getClassInAnonymous().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFieldSignature() {
		if (fieldSignatureEClass == null) {
			fieldSignatureEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(61);
		}
		return fieldSignatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldSignature__IsAppropriate_FWD__Match_MFieldName_Type_MFieldSignature() {
		return getFieldSignature().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldSignature__Perform_FWD__IsApplicableMatch() {
		return getFieldSignature().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldSignature__IsApplicable_FWD__Match() {
		return getFieldSignature().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldSignature__RegisterObjectsToMatch_FWD__Match_MFieldName_Type_MFieldSignature() {
		return getFieldSignature().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldSignature__IsAppropriate_solveCsp_FWD__Match_MFieldName_Type_MFieldSignature() {
		return getFieldSignature().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldSignature__IsAppropriate_checkCsp_FWD__CSP() {
		return getFieldSignature().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldSignature__IsApplicable_solveCsp_FWD__IsApplicableMatch_MFieldName_TField_TAbstractType_Type_TypeToTAbstractType_MFieldNameToTField_MFieldSignature() {
		return getFieldSignature().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldSignature__IsApplicable_checkCsp_FWD__CSP() {
		return getFieldSignature().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldSignature__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getFieldSignature().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldSignature__CheckTypes_FWD__Match() {
		return getFieldSignature().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldSignature__IsAppropriate_BWD__Match_TField_TAbstractType_TFieldSignature() {
		return getFieldSignature().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldSignature__Perform_BWD__IsApplicableMatch() {
		return getFieldSignature().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldSignature__IsApplicable_BWD__Match() {
		return getFieldSignature().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldSignature__RegisterObjectsToMatch_BWD__Match_TField_TAbstractType_TFieldSignature() {
		return getFieldSignature().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldSignature__IsAppropriate_solveCsp_BWD__Match_TField_TAbstractType_TFieldSignature() {
		return getFieldSignature().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldSignature__IsAppropriate_checkCsp_BWD__CSP() {
		return getFieldSignature().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldSignature__IsApplicable_solveCsp_BWD__IsApplicableMatch_MFieldName_TField_TAbstractType_Type_TypeToTAbstractType_MFieldNameToTField_TFieldSignature() {
		return getFieldSignature().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldSignature__IsApplicable_checkCsp_BWD__CSP() {
		return getFieldSignature().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldSignature__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getFieldSignature().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldSignature__CheckTypes_BWD__Match() {
		return getFieldSignature().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldSignature__IsAppropriate_BWD_EMoflonEdge_50__EMoflonEdge() {
		return getFieldSignature().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldSignature__IsAppropriate_FWD_EMoflonEdge_53__EMoflonEdge() {
		return getFieldSignature().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldSignature__CheckAttributes_FWD__TripleMatch() {
		return getFieldSignature().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldSignature__CheckAttributes_BWD__TripleMatch() {
		return getFieldSignature().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldSignature__IsApplicable_CC__Match_Match() {
		return getFieldSignature().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldSignature__IsApplicable_solveCsp_CC__MFieldName_TField_TAbstractType_Type_MFieldSignature_TFieldSignature_Match_Match() {
		return getFieldSignature().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldSignature__IsApplicable_checkCsp_CC__CSP() {
		return getFieldSignature().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldSignature__CheckDEC_FWD__MFieldName_Type_MFieldSignature() {
		return getFieldSignature().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldSignature__CheckDEC_BWD__TField_TAbstractType_TFieldSignature() {
		return getFieldSignature().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldSignature__GenerateModel__RuleEntryContainer_MFieldNameToTField_TypeToTAbstractType() {
		return getFieldSignature().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldSignature__GenerateModel_solveCsp_BWD__IsApplicableMatch_MFieldName_TField_TAbstractType_Type_TypeToTAbstractType_MFieldNameToTField_ModelgeneratorRuleResult() {
		return getFieldSignature().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldSignature__GenerateModel_checkCsp_BWD__CSP() {
		return getFieldSignature().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnonymousClassTypeClass() {
		if (anonymousClassTypeClassEClass == null) {
			anonymousClassTypeClassEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(62);
		}
		return anonymousClassTypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClassTypeClass__IsAppropriate_FWD__Match_ClassDeclaration_ClassInstanceCreation_AnonymousClassDeclaration_TypeAccess() {
		return getAnonymousClassTypeClass().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClassTypeClass__Perform_FWD__IsApplicableMatch() {
		return getAnonymousClassTypeClass().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClassTypeClass__IsApplicable_FWD__Match() {
		return getAnonymousClassTypeClass().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClassTypeClass__RegisterObjectsToMatch_FWD__Match_ClassDeclaration_ClassInstanceCreation_AnonymousClassDeclaration_TypeAccess() {
		return getAnonymousClassTypeClass().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClassTypeClass__IsAppropriate_solveCsp_FWD__Match_ClassDeclaration_ClassInstanceCreation_AnonymousClassDeclaration_TypeAccess() {
		return getAnonymousClassTypeClass().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClassTypeClass__IsAppropriate_checkCsp_FWD__CSP() {
		return getAnonymousClassTypeClass().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClassTypeClass__IsApplicable_solveCsp_FWD__IsApplicableMatch_ClassDeclaration_TClass_ClassInstanceCreation_TypeToTAbstractType_AnonymousClassDeclaration_TClass_AnonymousClassDeclarationToTClass_TypeAccess() {
		return getAnonymousClassTypeClass().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClassTypeClass__IsApplicable_checkCsp_FWD__CSP() {
		return getAnonymousClassTypeClass().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClassTypeClass__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getAnonymousClassTypeClass().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClassTypeClass__CheckTypes_FWD__Match() {
		return getAnonymousClassTypeClass().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClassTypeClass__IsAppropriate_BWD__Match_TClass_TClass() {
		return getAnonymousClassTypeClass().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClassTypeClass__Perform_BWD__IsApplicableMatch() {
		return getAnonymousClassTypeClass().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClassTypeClass__IsApplicable_BWD__Match() {
		return getAnonymousClassTypeClass().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClassTypeClass__RegisterObjectsToMatch_BWD__Match_TClass_TClass() {
		return getAnonymousClassTypeClass().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClassTypeClass__IsAppropriate_solveCsp_BWD__Match_TClass_TClass() {
		return getAnonymousClassTypeClass().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClassTypeClass__IsAppropriate_checkCsp_BWD__CSP() {
		return getAnonymousClassTypeClass().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClassTypeClass__IsApplicable_solveCsp_BWD__IsApplicableMatch_ClassDeclaration_TClass_ClassInstanceCreation_TypeToTAbstractType_AnonymousClassDeclaration_TClass_AnonymousClassDeclarationToTClass() {
		return getAnonymousClassTypeClass().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClassTypeClass__IsApplicable_checkCsp_BWD__CSP() {
		return getAnonymousClassTypeClass().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClassTypeClass__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getAnonymousClassTypeClass().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClassTypeClass__CheckTypes_BWD__Match() {
		return getAnonymousClassTypeClass().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClassTypeClass__IsAppropriate_BWD_EMoflonEdge_51__EMoflonEdge() {
		return getAnonymousClassTypeClass().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClassTypeClass__IsAppropriate_FWD_EMoflonEdge_54__EMoflonEdge() {
		return getAnonymousClassTypeClass().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClassTypeClass__CheckAttributes_FWD__TripleMatch() {
		return getAnonymousClassTypeClass().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClassTypeClass__CheckAttributes_BWD__TripleMatch() {
		return getAnonymousClassTypeClass().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClassTypeClass__IsApplicable_CC__Match_Match() {
		return getAnonymousClassTypeClass().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClassTypeClass__IsApplicable_solveCsp_CC__ClassDeclaration_TClass_ClassInstanceCreation_AnonymousClassDeclaration_TClass_TypeAccess_Match_Match() {
		return getAnonymousClassTypeClass().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClassTypeClass__IsApplicable_checkCsp_CC__CSP() {
		return getAnonymousClassTypeClass().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClassTypeClass__CheckDEC_FWD__ClassDeclaration_ClassInstanceCreation_AnonymousClassDeclaration_TypeAccess() {
		return getAnonymousClassTypeClass().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClassTypeClass__CheckDEC_BWD__TClass_TClass() {
		return getAnonymousClassTypeClass().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClassTypeClass__GenerateModel__RuleEntryContainer_TypeToTAbstractType_AnonymousClassDeclarationToTClass() {
		return getAnonymousClassTypeClass().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClassTypeClass__GenerateModel_solveCsp_BWD__IsApplicableMatch_ClassDeclaration_TClass_ClassInstanceCreation_TypeToTAbstractType_AnonymousClassDeclaration_TClass_AnonymousClassDeclarationToTClass_ModelgeneratorRuleResult() {
		return getAnonymousClassTypeClass().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClassTypeClass__GenerateModel_checkCsp_BWD__CSP() {
		return getAnonymousClassTypeClass().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMethodParameterLinkFirst() {
		if (methodParameterLinkFirstEClass == null) {
			methodParameterLinkFirstEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(63);
		}
		return methodParameterLinkFirstEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodParameterLinkFirst__IsAppropriate_FWD__Match_MEntry_MMethodSignature() {
		return getMethodParameterLinkFirst().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodParameterLinkFirst__Perform_FWD__IsApplicableMatch() {
		return getMethodParameterLinkFirst().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodParameterLinkFirst__IsApplicable_FWD__Match() {
		return getMethodParameterLinkFirst().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodParameterLinkFirst__RegisterObjectsToMatch_FWD__Match_MEntry_MMethodSignature() {
		return getMethodParameterLinkFirst().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodParameterLinkFirst__IsAppropriate_solveCsp_FWD__Match_MEntry_MMethodSignature() {
		return getMethodParameterLinkFirst().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodParameterLinkFirst__IsAppropriate_checkCsp_FWD__CSP() {
		return getMethodParameterLinkFirst().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodParameterLinkFirst__IsApplicable_solveCsp_FWD__IsApplicableMatch_TParameter_MEntry_TMethodSignature_MMethodSignature_MSignatureToTSignature_MEntryToTParameter() {
		return getMethodParameterLinkFirst().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodParameterLinkFirst__IsApplicable_checkCsp_FWD__CSP() {
		return getMethodParameterLinkFirst().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodParameterLinkFirst__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getMethodParameterLinkFirst().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodParameterLinkFirst__CheckTypes_FWD__Match() {
		return getMethodParameterLinkFirst().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodParameterLinkFirst__IsAppropriate_BWD__Match_TParameter_TMethodSignature() {
		return getMethodParameterLinkFirst().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodParameterLinkFirst__Perform_BWD__IsApplicableMatch() {
		return getMethodParameterLinkFirst().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodParameterLinkFirst__IsApplicable_BWD__Match() {
		return getMethodParameterLinkFirst().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodParameterLinkFirst__RegisterObjectsToMatch_BWD__Match_TParameter_TMethodSignature() {
		return getMethodParameterLinkFirst().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodParameterLinkFirst__IsAppropriate_solveCsp_BWD__Match_TParameter_TMethodSignature() {
		return getMethodParameterLinkFirst().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodParameterLinkFirst__IsAppropriate_checkCsp_BWD__CSP() {
		return getMethodParameterLinkFirst().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodParameterLinkFirst__IsApplicable_solveCsp_BWD__IsApplicableMatch_TParameter_MEntry_TMethodSignature_MMethodSignature_MSignatureToTSignature_MEntryToTParameter() {
		return getMethodParameterLinkFirst().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodParameterLinkFirst__IsApplicable_checkCsp_BWD__CSP() {
		return getMethodParameterLinkFirst().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodParameterLinkFirst__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getMethodParameterLinkFirst().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodParameterLinkFirst__CheckTypes_BWD__Match() {
		return getMethodParameterLinkFirst().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodParameterLinkFirst__IsAppropriate_BWD_EMoflonEdge_52__EMoflonEdge() {
		return getMethodParameterLinkFirst().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodParameterLinkFirst__IsAppropriate_FWD_EMoflonEdge_55__EMoflonEdge() {
		return getMethodParameterLinkFirst().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodParameterLinkFirst__CheckAttributes_FWD__TripleMatch() {
		return getMethodParameterLinkFirst().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodParameterLinkFirst__CheckAttributes_BWD__TripleMatch() {
		return getMethodParameterLinkFirst().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodParameterLinkFirst__IsApplicable_CC__Match_Match() {
		return getMethodParameterLinkFirst().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodParameterLinkFirst__IsApplicable_solveCsp_CC__TParameter_MEntry_TMethodSignature_MMethodSignature_Match_Match() {
		return getMethodParameterLinkFirst().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodParameterLinkFirst__IsApplicable_checkCsp_CC__CSP() {
		return getMethodParameterLinkFirst().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodParameterLinkFirst__CheckDEC_FWD__MEntry_MMethodSignature() {
		return getMethodParameterLinkFirst().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodParameterLinkFirst__CheckDEC_BWD__TParameter_TMethodSignature() {
		return getMethodParameterLinkFirst().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodParameterLinkFirst__GenerateModel__RuleEntryContainer_MEntryToTParameter_MSignatureToTSignature() {
		return getMethodParameterLinkFirst().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodParameterLinkFirst__GenerateModel_solveCsp_BWD__IsApplicableMatch_TParameter_MEntry_TMethodSignature_MMethodSignature_MSignatureToTSignature_MEntryToTParameter_ModelgeneratorRuleResult() {
		return getMethodParameterLinkFirst().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodParameterLinkFirst__GenerateModel_checkCsp_BWD__CSP() {
		return getMethodParameterLinkFirst().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataFlowIn() {
		if (dataFlowInEClass == null) {
			dataFlowInEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI).getEClassifiers()
					.get(64);
		}
		return dataFlowInEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataFlowIn__IsAppropriate_FWD__Match_MFlow_MAbstractFlowElement() {
		return getDataFlowIn().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataFlowIn__Perform_FWD__IsApplicableMatch() {
		return getDataFlowIn().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataFlowIn__IsApplicable_FWD__Match() {
		return getDataFlowIn().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataFlowIn__RegisterObjectsToMatch_FWD__Match_MFlow_MAbstractFlowElement() {
		return getDataFlowIn().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataFlowIn__IsAppropriate_solveCsp_FWD__Match_MFlow_MAbstractFlowElement() {
		return getDataFlowIn().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataFlowIn__IsAppropriate_checkCsp_FWD__CSP() {
		return getDataFlowIn().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataFlowIn__IsApplicable_solveCsp_FWD__IsApplicableMatch_TAbstractFlowElement_MFlow_TAbstractFlowElement_MAbstractFlowElement_MAbstractFlowElementToTAbstractFlowElement_MAbstractFlowElementToTAbstractFlowElement() {
		return getDataFlowIn().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataFlowIn__IsApplicable_checkCsp_FWD__CSP() {
		return getDataFlowIn().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataFlowIn__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getDataFlowIn().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataFlowIn__CheckTypes_FWD__Match() {
		return getDataFlowIn().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataFlowIn__IsAppropriate_BWD__Match_TAbstractFlowElement_TAbstractFlowElement() {
		return getDataFlowIn().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataFlowIn__Perform_BWD__IsApplicableMatch() {
		return getDataFlowIn().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataFlowIn__IsApplicable_BWD__Match() {
		return getDataFlowIn().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataFlowIn__RegisterObjectsToMatch_BWD__Match_TAbstractFlowElement_TAbstractFlowElement() {
		return getDataFlowIn().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataFlowIn__IsAppropriate_solveCsp_BWD__Match_TAbstractFlowElement_TAbstractFlowElement() {
		return getDataFlowIn().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataFlowIn__IsAppropriate_checkCsp_BWD__CSP() {
		return getDataFlowIn().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataFlowIn__IsApplicable_solveCsp_BWD__IsApplicableMatch_TAbstractFlowElement_MFlow_TAbstractFlowElement_MAbstractFlowElement_MAbstractFlowElementToTAbstractFlowElement_MAbstractFlowElementToTAbstractFlowElement() {
		return getDataFlowIn().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataFlowIn__IsApplicable_checkCsp_BWD__CSP() {
		return getDataFlowIn().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataFlowIn__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getDataFlowIn().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataFlowIn__CheckTypes_BWD__Match() {
		return getDataFlowIn().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataFlowIn__IsAppropriate_BWD_EMoflonEdge_53__EMoflonEdge() {
		return getDataFlowIn().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataFlowIn__IsAppropriate_FWD_EMoflonEdge_56__EMoflonEdge() {
		return getDataFlowIn().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataFlowIn__CheckAttributes_FWD__TripleMatch() {
		return getDataFlowIn().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataFlowIn__CheckAttributes_BWD__TripleMatch() {
		return getDataFlowIn().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataFlowIn__IsApplicable_CC__Match_Match() {
		return getDataFlowIn().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataFlowIn__IsApplicable_solveCsp_CC__TAbstractFlowElement_MFlow_TAbstractFlowElement_MAbstractFlowElement_Match_Match() {
		return getDataFlowIn().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataFlowIn__IsApplicable_checkCsp_CC__CSP() {
		return getDataFlowIn().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataFlowIn__CheckDEC_FWD__MFlow_MAbstractFlowElement() {
		return getDataFlowIn().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataFlowIn__CheckDEC_BWD__TAbstractFlowElement_TAbstractFlowElement() {
		return getDataFlowIn().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataFlowIn__GenerateModel__RuleEntryContainer_MAbstractFlowElementToTAbstractFlowElement_MAbstractFlowElementToTAbstractFlowElement() {
		return getDataFlowIn().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataFlowIn__GenerateModel_solveCsp_BWD__IsApplicableMatch_TAbstractFlowElement_MFlow_TAbstractFlowElement_MAbstractFlowElement_MAbstractFlowElementToTAbstractFlowElement_MAbstractFlowElementToTAbstractFlowElement_ModelgeneratorRuleResult() {
		return getDataFlowIn().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataFlowIn__GenerateModel_checkCsp_BWD__CSP() {
		return getDataFlowIn().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAbstractAnnotationTypeAccess() {
		if (abstractAnnotationTypeAccessEClass == null) {
			abstractAnnotationTypeAccessEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(65);
		}
		return abstractAnnotationTypeAccessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getClassExtendsClass() {
		if (classExtendsClassEClass == null) {
			classExtendsClassEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(66);
		}
		return classExtendsClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassExtendsClass__IsAppropriate_FWD__Match_ClassDeclaration_TypeAccess_ClassDeclaration() {
		return getClassExtendsClass().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassExtendsClass__Perform_FWD__IsApplicableMatch() {
		return getClassExtendsClass().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassExtendsClass__IsApplicable_FWD__Match() {
		return getClassExtendsClass().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassExtendsClass__RegisterObjectsToMatch_FWD__Match_ClassDeclaration_TypeAccess_ClassDeclaration() {
		return getClassExtendsClass().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassExtendsClass__IsAppropriate_solveCsp_FWD__Match_ClassDeclaration_TypeAccess_ClassDeclaration() {
		return getClassExtendsClass().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassExtendsClass__IsAppropriate_checkCsp_FWD__CSP() {
		return getClassExtendsClass().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassExtendsClass__IsApplicable_solveCsp_FWD__IsApplicableMatch_TClass_ClassDeclaration_TypeToTAbstractType_TypeAccess_TClass_ClassDeclaration_TypeToTAbstractType() {
		return getClassExtendsClass().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassExtendsClass__IsApplicable_checkCsp_FWD__CSP() {
		return getClassExtendsClass().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassExtendsClass__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getClassExtendsClass().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassExtendsClass__CheckTypes_FWD__Match() {
		return getClassExtendsClass().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassExtendsClass__IsAppropriate_BWD__Match_TClass_TClass() {
		return getClassExtendsClass().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassExtendsClass__Perform_BWD__IsApplicableMatch() {
		return getClassExtendsClass().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassExtendsClass__IsApplicable_BWD__Match() {
		return getClassExtendsClass().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassExtendsClass__RegisterObjectsToMatch_BWD__Match_TClass_TClass() {
		return getClassExtendsClass().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassExtendsClass__IsAppropriate_solveCsp_BWD__Match_TClass_TClass() {
		return getClassExtendsClass().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassExtendsClass__IsAppropriate_checkCsp_BWD__CSP() {
		return getClassExtendsClass().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassExtendsClass__IsApplicable_solveCsp_BWD__IsApplicableMatch_TClass_ClassDeclaration_TypeToTAbstractType_TClass_ClassDeclaration_TypeToTAbstractType() {
		return getClassExtendsClass().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassExtendsClass__IsApplicable_checkCsp_BWD__CSP() {
		return getClassExtendsClass().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassExtendsClass__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getClassExtendsClass().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassExtendsClass__CheckTypes_BWD__Match() {
		return getClassExtendsClass().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassExtendsClass__IsAppropriate_BWD_EMoflonEdge_54__EMoflonEdge() {
		return getClassExtendsClass().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassExtendsClass__IsAppropriate_FWD_EMoflonEdge_57__EMoflonEdge() {
		return getClassExtendsClass().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassExtendsClass__CheckAttributes_FWD__TripleMatch() {
		return getClassExtendsClass().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassExtendsClass__CheckAttributes_BWD__TripleMatch() {
		return getClassExtendsClass().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassExtendsClass__IsApplicable_CC__Match_Match() {
		return getClassExtendsClass().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassExtendsClass__IsApplicable_solveCsp_CC__TClass_ClassDeclaration_TypeAccess_TClass_ClassDeclaration_Match_Match() {
		return getClassExtendsClass().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassExtendsClass__IsApplicable_checkCsp_CC__CSP() {
		return getClassExtendsClass().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassExtendsClass__CheckDEC_FWD__ClassDeclaration_TypeAccess_ClassDeclaration() {
		return getClassExtendsClass().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassExtendsClass__CheckDEC_BWD__TClass_TClass() {
		return getClassExtendsClass().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassExtendsClass__GenerateModel__RuleEntryContainer_TypeToTAbstractType_TypeToTAbstractType() {
		return getClassExtendsClass().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassExtendsClass__GenerateModel_solveCsp_BWD__IsApplicableMatch_TClass_ClassDeclaration_TypeToTAbstractType_TClass_ClassDeclaration_TypeToTAbstractType_ModelgeneratorRuleResult() {
		return getClassExtendsClass().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassExtendsClass__GenerateModel_checkCsp_BWD__CSP() {
		return getClassExtendsClass().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnnotationTypeAccessOnSelf() {
		if (annotationTypeAccessOnSelfEClass == null) {
			annotationTypeAccessOnSelfEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(67);
		}
		return annotationTypeAccessOnSelfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeAccessOnSelf__IsAppropriate_FWD__Match_TypeAccess_AnnotationTypeDeclaration_Annotation() {
		return getAnnotationTypeAccessOnSelf().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeAccessOnSelf__Perform_FWD__IsApplicableMatch() {
		return getAnnotationTypeAccessOnSelf().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeAccessOnSelf__IsApplicable_FWD__Match() {
		return getAnnotationTypeAccessOnSelf().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeAccessOnSelf__RegisterObjectsToMatch_FWD__Match_TypeAccess_AnnotationTypeDeclaration_Annotation() {
		return getAnnotationTypeAccessOnSelf().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeAccessOnSelf__IsAppropriate_solveCsp_FWD__Match_TypeAccess_AnnotationTypeDeclaration_Annotation() {
		return getAnnotationTypeAccessOnSelf().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeAccessOnSelf__IsAppropriate_checkCsp_FWD__CSP() {
		return getAnnotationTypeAccessOnSelf().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeAccessOnSelf__IsApplicable_solveCsp_FWD__IsApplicableMatch_TAnnotation_TypeAccess_AnnotationTypeDeclaration_AnnotationToTAnnotation_TypeToTAbstractType_Annotation_TAnnotationType() {
		return getAnnotationTypeAccessOnSelf().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeAccessOnSelf__IsApplicable_checkCsp_FWD__CSP() {
		return getAnnotationTypeAccessOnSelf().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeAccessOnSelf__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getAnnotationTypeAccessOnSelf().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeAccessOnSelf__CheckTypes_FWD__Match() {
		return getAnnotationTypeAccessOnSelf().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeAccessOnSelf__IsAppropriate_BWD__Match_TAnnotation_TAnnotationType() {
		return getAnnotationTypeAccessOnSelf().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeAccessOnSelf__Perform_BWD__IsApplicableMatch() {
		return getAnnotationTypeAccessOnSelf().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeAccessOnSelf__IsApplicable_BWD__Match() {
		return getAnnotationTypeAccessOnSelf().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeAccessOnSelf__RegisterObjectsToMatch_BWD__Match_TAnnotation_TAnnotationType() {
		return getAnnotationTypeAccessOnSelf().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeAccessOnSelf__IsAppropriate_solveCsp_BWD__Match_TAnnotation_TAnnotationType() {
		return getAnnotationTypeAccessOnSelf().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeAccessOnSelf__IsAppropriate_checkCsp_BWD__CSP() {
		return getAnnotationTypeAccessOnSelf().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeAccessOnSelf__IsApplicable_solveCsp_BWD__IsApplicableMatch_TAnnotation_AnnotationTypeDeclaration_AnnotationToTAnnotation_TypeToTAbstractType_Annotation_TAnnotationType() {
		return getAnnotationTypeAccessOnSelf().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeAccessOnSelf__IsApplicable_checkCsp_BWD__CSP() {
		return getAnnotationTypeAccessOnSelf().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeAccessOnSelf__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getAnnotationTypeAccessOnSelf().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeAccessOnSelf__CheckTypes_BWD__Match() {
		return getAnnotationTypeAccessOnSelf().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeAccessOnSelf__IsAppropriate_BWD_EMoflonEdge_55__EMoflonEdge() {
		return getAnnotationTypeAccessOnSelf().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeAccessOnSelf__IsAppropriate_FWD_EMoflonEdge_58__EMoflonEdge() {
		return getAnnotationTypeAccessOnSelf().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeAccessOnSelf__CheckAttributes_FWD__TripleMatch() {
		return getAnnotationTypeAccessOnSelf().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeAccessOnSelf__CheckAttributes_BWD__TripleMatch() {
		return getAnnotationTypeAccessOnSelf().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeAccessOnSelf__IsApplicable_CC__Match_Match() {
		return getAnnotationTypeAccessOnSelf().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeAccessOnSelf__IsApplicable_solveCsp_CC__TAnnotation_TypeAccess_AnnotationTypeDeclaration_Annotation_TAnnotationType_Match_Match() {
		return getAnnotationTypeAccessOnSelf().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeAccessOnSelf__IsApplicable_checkCsp_CC__CSP() {
		return getAnnotationTypeAccessOnSelf().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeAccessOnSelf__CheckDEC_FWD__TypeAccess_AnnotationTypeDeclaration_Annotation() {
		return getAnnotationTypeAccessOnSelf().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeAccessOnSelf__CheckDEC_BWD__TAnnotation_TAnnotationType() {
		return getAnnotationTypeAccessOnSelf().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeAccessOnSelf__GenerateModel__RuleEntryContainer_AnnotationToTAnnotation() {
		return getAnnotationTypeAccessOnSelf().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeAccessOnSelf__GenerateModel_solveCsp_BWD__IsApplicableMatch_TAnnotation_AnnotationTypeDeclaration_AnnotationToTAnnotation_TypeToTAbstractType_Annotation_TAnnotationType_ModelgeneratorRuleResult() {
		return getAnnotationTypeAccessOnSelf().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeAccessOnSelf__GenerateModel_checkCsp_BWD__CSP() {
		return getAnnotationTypeAccessOnSelf().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMemberInAnnotationVisibility() {
		if (memberInAnnotationVisibilityEClass == null) {
			memberInAnnotationVisibilityEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(68);
		}
		return memberInAnnotationVisibilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMemberInAnnotationVisibility__IsAppropriate_FWD__Match_AnnotationTypeDeclaration_Modifier_MDefinition() {
		return getMemberInAnnotationVisibility().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMemberInAnnotationVisibility__Perform_FWD__IsApplicableMatch() {
		return getMemberInAnnotationVisibility().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMemberInAnnotationVisibility__IsApplicable_FWD__Match() {
		return getMemberInAnnotationVisibility().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMemberInAnnotationVisibility__RegisterObjectsToMatch_FWD__Match_AnnotationTypeDeclaration_Modifier_MDefinition() {
		return getMemberInAnnotationVisibility().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMemberInAnnotationVisibility__IsAppropriate_solveCsp_FWD__Match_AnnotationTypeDeclaration_Modifier_MDefinition() {
		return getMemberInAnnotationVisibility().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMemberInAnnotationVisibility__IsAppropriate_checkCsp_FWD__CSP() {
		return getMemberInAnnotationVisibility().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMemberInAnnotationVisibility__IsApplicable_solveCsp_FWD__IsApplicableMatch_TMember_MDefinitionToTMember_AnnotationTypeDeclaration_TAnnotationType_Modifier_TypeToTAbstractType_MDefinition() {
		return getMemberInAnnotationVisibility().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMemberInAnnotationVisibility__IsApplicable_checkCsp_FWD__CSP() {
		return getMemberInAnnotationVisibility().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMemberInAnnotationVisibility__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getMemberInAnnotationVisibility().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMemberInAnnotationVisibility__CheckTypes_FWD__Match() {
		return getMemberInAnnotationVisibility().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMemberInAnnotationVisibility__IsAppropriate_BWD__Match_TMember_TModifier_TAnnotationType() {
		return getMemberInAnnotationVisibility().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMemberInAnnotationVisibility__Perform_BWD__IsApplicableMatch() {
		return getMemberInAnnotationVisibility().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMemberInAnnotationVisibility__IsApplicable_BWD__Match() {
		return getMemberInAnnotationVisibility().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMemberInAnnotationVisibility__RegisterObjectsToMatch_BWD__Match_TMember_TModifier_TAnnotationType() {
		return getMemberInAnnotationVisibility().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMemberInAnnotationVisibility__IsAppropriate_solveCsp_BWD__Match_TMember_TModifier_TAnnotationType() {
		return getMemberInAnnotationVisibility().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMemberInAnnotationVisibility__IsAppropriate_checkCsp_BWD__CSP() {
		return getMemberInAnnotationVisibility().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMemberInAnnotationVisibility__IsApplicable_solveCsp_BWD__IsApplicableMatch_TMember_TModifier_MDefinitionToTMember_AnnotationTypeDeclaration_TAnnotationType_TypeToTAbstractType_MDefinition() {
		return getMemberInAnnotationVisibility().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMemberInAnnotationVisibility__IsApplicable_checkCsp_BWD__CSP() {
		return getMemberInAnnotationVisibility().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMemberInAnnotationVisibility__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getMemberInAnnotationVisibility().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMemberInAnnotationVisibility__CheckTypes_BWD__Match() {
		return getMemberInAnnotationVisibility().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMemberInAnnotationVisibility__IsAppropriate_BWD_EMoflonEdge_56__EMoflonEdge() {
		return getMemberInAnnotationVisibility().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMemberInAnnotationVisibility__IsAppropriate_FWD_EMoflonEdge_59__EMoflonEdge() {
		return getMemberInAnnotationVisibility().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMemberInAnnotationVisibility__CheckAttributes_FWD__TripleMatch() {
		return getMemberInAnnotationVisibility().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMemberInAnnotationVisibility__CheckAttributes_BWD__TripleMatch() {
		return getMemberInAnnotationVisibility().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMemberInAnnotationVisibility__IsApplicable_CC__Match_Match() {
		return getMemberInAnnotationVisibility().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMemberInAnnotationVisibility__IsApplicable_solveCsp_CC__TMember_TModifier_AnnotationTypeDeclaration_TAnnotationType_Modifier_MDefinition_Match_Match() {
		return getMemberInAnnotationVisibility().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMemberInAnnotationVisibility__IsApplicable_checkCsp_CC__CSP() {
		return getMemberInAnnotationVisibility().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMemberInAnnotationVisibility__CheckDEC_FWD__AnnotationTypeDeclaration_Modifier_MDefinition() {
		return getMemberInAnnotationVisibility().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMemberInAnnotationVisibility__CheckDEC_BWD__TMember_TModifier_TAnnotationType() {
		return getMemberInAnnotationVisibility().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMemberInAnnotationVisibility__GenerateModel__RuleEntryContainer_MDefinitionToTMember() {
		return getMemberInAnnotationVisibility().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMemberInAnnotationVisibility__GenerateModel_solveCsp_BWD__IsApplicableMatch_TMember_MDefinitionToTMember_AnnotationTypeDeclaration_TAnnotationType_TypeToTAbstractType_MDefinition_ModelgeneratorRuleResult() {
		return getMemberInAnnotationVisibility().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMemberInAnnotationVisibility__GenerateModel_checkCsp_BWD__CSP() {
		return getMemberInAnnotationVisibility().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPrimitiveTypesIsVoid() {
		if (primitiveTypesIsVoidEClass == null) {
			primitiveTypesIsVoidEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(69);
		}
		return primitiveTypesIsVoidEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypesIsVoid__IsAppropriate_FWD__Match_PrimitiveTypeVoid_Model() {
		return getPrimitiveTypesIsVoid().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypesIsVoid__Perform_FWD__IsApplicableMatch() {
		return getPrimitiveTypesIsVoid().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypesIsVoid__IsApplicable_FWD__Match() {
		return getPrimitiveTypesIsVoid().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypesIsVoid__RegisterObjectsToMatch_FWD__Match_PrimitiveTypeVoid_Model() {
		return getPrimitiveTypesIsVoid().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypesIsVoid__IsAppropriate_solveCsp_FWD__Match_PrimitiveTypeVoid_Model() {
		return getPrimitiveTypesIsVoid().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypesIsVoid__IsAppropriate_checkCsp_FWD__CSP() {
		return getPrimitiveTypesIsVoid().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypesIsVoid__IsApplicable_solveCsp_FWD__IsApplicableMatch_PrimitiveTypeVoid_ModelToTypeGraph_TypeGraph_Model() {
		return getPrimitiveTypesIsVoid().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypesIsVoid__IsApplicable_checkCsp_FWD__CSP() {
		return getPrimitiveTypesIsVoid().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypesIsVoid__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getPrimitiveTypesIsVoid().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypesIsVoid__CheckTypes_FWD__Match() {
		return getPrimitiveTypesIsVoid().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypesIsVoid__IsAppropriate_BWD__Match_TypeGraph_TClass() {
		return getPrimitiveTypesIsVoid().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypesIsVoid__Perform_BWD__IsApplicableMatch() {
		return getPrimitiveTypesIsVoid().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypesIsVoid__IsApplicable_BWD__Match() {
		return getPrimitiveTypesIsVoid().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypesIsVoid__RegisterObjectsToMatch_BWD__Match_TypeGraph_TClass() {
		return getPrimitiveTypesIsVoid().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypesIsVoid__IsAppropriate_solveCsp_BWD__Match_TypeGraph_TClass() {
		return getPrimitiveTypesIsVoid().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypesIsVoid__IsAppropriate_checkCsp_BWD__CSP() {
		return getPrimitiveTypesIsVoid().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypesIsVoid__IsApplicable_solveCsp_BWD__IsApplicableMatch_ModelToTypeGraph_TypeGraph_TClass_Model() {
		return getPrimitiveTypesIsVoid().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypesIsVoid__IsApplicable_checkCsp_BWD__CSP() {
		return getPrimitiveTypesIsVoid().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypesIsVoid__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getPrimitiveTypesIsVoid().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypesIsVoid__CheckTypes_BWD__Match() {
		return getPrimitiveTypesIsVoid().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypesIsVoid__IsAppropriate_BWD_EMoflonEdge_57__EMoflonEdge() {
		return getPrimitiveTypesIsVoid().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypesIsVoid__IsAppropriate_FWD_EMoflonEdge_60__EMoflonEdge() {
		return getPrimitiveTypesIsVoid().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypesIsVoid__CheckAttributes_FWD__TripleMatch() {
		return getPrimitiveTypesIsVoid().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypesIsVoid__CheckAttributes_BWD__TripleMatch() {
		return getPrimitiveTypesIsVoid().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypesIsVoid__IsApplicable_CC__Match_Match() {
		return getPrimitiveTypesIsVoid().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypesIsVoid__IsApplicable_solveCsp_CC__PrimitiveTypeVoid_TypeGraph_TClass_Model_Match_Match() {
		return getPrimitiveTypesIsVoid().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypesIsVoid__IsApplicable_checkCsp_CC__CSP() {
		return getPrimitiveTypesIsVoid().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypesIsVoid__CheckDEC_FWD__PrimitiveTypeVoid_Model() {
		return getPrimitiveTypesIsVoid().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypesIsVoid__CheckDEC_BWD__TypeGraph_TClass() {
		return getPrimitiveTypesIsVoid().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypesIsVoid__GenerateModel__RuleEntryContainer_ModelToTypeGraph() {
		return getPrimitiveTypesIsVoid().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypesIsVoid__GenerateModel_solveCsp_BWD__IsApplicableMatch_ModelToTypeGraph_TypeGraph_Model_ModelgeneratorRuleResult() {
		return getPrimitiveTypesIsVoid().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypesIsVoid__GenerateModel_checkCsp_BWD__CSP() {
		return getPrimitiveTypesIsVoid().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMethodInvocationTarget() {
		if (methodInvocationTargetEClass == null) {
			methodInvocationTargetEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(70);
		}
		return methodInvocationTargetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodInvocationTarget__IsAppropriate_FWD__Match_AbstractMethodInvocation_AbstractMethodDeclaration() {
		return getMethodInvocationTarget().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodInvocationTarget__Perform_FWD__IsApplicableMatch() {
		return getMethodInvocationTarget().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodInvocationTarget__IsApplicable_FWD__Match() {
		return getMethodInvocationTarget().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodInvocationTarget__RegisterObjectsToMatch_FWD__Match_AbstractMethodInvocation_AbstractMethodDeclaration() {
		return getMethodInvocationTarget().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodInvocationTarget__IsAppropriate_solveCsp_FWD__Match_AbstractMethodInvocation_AbstractMethodDeclaration() {
		return getMethodInvocationTarget().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodInvocationTarget__IsAppropriate_checkCsp_FWD__CSP() {
		return getMethodInvocationTarget().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodInvocationTarget__IsApplicable_solveCsp_FWD__IsApplicableMatch_TAccess_AbstractMethodInvocation_TMethodDefinition_AbstractMethodInvocationToTAccess_MDefinitionToTMember_AbstractMethodDeclaration() {
		return getMethodInvocationTarget().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodInvocationTarget__IsApplicable_checkCsp_FWD__CSP() {
		return getMethodInvocationTarget().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodInvocationTarget__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getMethodInvocationTarget().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodInvocationTarget__CheckTypes_FWD__Match() {
		return getMethodInvocationTarget().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodInvocationTarget__IsAppropriate_BWD__Match_TAccess_TMethodDefinition() {
		return getMethodInvocationTarget().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodInvocationTarget__Perform_BWD__IsApplicableMatch() {
		return getMethodInvocationTarget().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodInvocationTarget__IsApplicable_BWD__Match() {
		return getMethodInvocationTarget().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodInvocationTarget__RegisterObjectsToMatch_BWD__Match_TAccess_TMethodDefinition() {
		return getMethodInvocationTarget().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodInvocationTarget__IsAppropriate_solveCsp_BWD__Match_TAccess_TMethodDefinition() {
		return getMethodInvocationTarget().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodInvocationTarget__IsAppropriate_checkCsp_BWD__CSP() {
		return getMethodInvocationTarget().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodInvocationTarget__IsApplicable_solveCsp_BWD__IsApplicableMatch_TAccess_AbstractMethodInvocation_TMethodDefinition_AbstractMethodInvocationToTAccess_MDefinitionToTMember_AbstractMethodDeclaration() {
		return getMethodInvocationTarget().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodInvocationTarget__IsApplicable_checkCsp_BWD__CSP() {
		return getMethodInvocationTarget().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodInvocationTarget__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getMethodInvocationTarget().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodInvocationTarget__CheckTypes_BWD__Match() {
		return getMethodInvocationTarget().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodInvocationTarget__IsAppropriate_BWD_EMoflonEdge_58__EMoflonEdge() {
		return getMethodInvocationTarget().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodInvocationTarget__IsAppropriate_FWD_EMoflonEdge_61__EMoflonEdge() {
		return getMethodInvocationTarget().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodInvocationTarget__CheckAttributes_FWD__TripleMatch() {
		return getMethodInvocationTarget().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodInvocationTarget__CheckAttributes_BWD__TripleMatch() {
		return getMethodInvocationTarget().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodInvocationTarget__IsApplicable_CC__Match_Match() {
		return getMethodInvocationTarget().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodInvocationTarget__IsApplicable_solveCsp_CC__TAccess_AbstractMethodInvocation_TMethodDefinition_AbstractMethodDeclaration_Match_Match() {
		return getMethodInvocationTarget().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodInvocationTarget__IsApplicable_checkCsp_CC__CSP() {
		return getMethodInvocationTarget().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodInvocationTarget__CheckDEC_FWD__AbstractMethodInvocation_AbstractMethodDeclaration() {
		return getMethodInvocationTarget().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodInvocationTarget__CheckDEC_BWD__TAccess_TMethodDefinition() {
		return getMethodInvocationTarget().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodInvocationTarget__GenerateModel__RuleEntryContainer_AbstractMethodInvocationToTAccess_MDefinitionToTMember() {
		return getMethodInvocationTarget().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodInvocationTarget__GenerateModel_solveCsp_BWD__IsApplicableMatch_TAccess_AbstractMethodInvocation_TMethodDefinition_AbstractMethodInvocationToTAccess_MDefinitionToTMember_AbstractMethodDeclaration_ModelgeneratorRuleResult() {
		return getMethodInvocationTarget().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodInvocationTarget__GenerateModel_checkCsp_BWD__CSP() {
		return getMethodInvocationTarget().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPrimitiveTypeIsFloat() {
		if (primitiveTypeIsFloatEClass == null) {
			primitiveTypeIsFloatEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(71);
		}
		return primitiveTypeIsFloatEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsFloat__IsAppropriate_FWD__Match_PrimitiveTypeFloat_Model() {
		return getPrimitiveTypeIsFloat().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsFloat__Perform_FWD__IsApplicableMatch() {
		return getPrimitiveTypeIsFloat().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsFloat__IsApplicable_FWD__Match() {
		return getPrimitiveTypeIsFloat().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsFloat__RegisterObjectsToMatch_FWD__Match_PrimitiveTypeFloat_Model() {
		return getPrimitiveTypeIsFloat().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsFloat__IsAppropriate_solveCsp_FWD__Match_PrimitiveTypeFloat_Model() {
		return getPrimitiveTypeIsFloat().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsFloat__IsAppropriate_checkCsp_FWD__CSP() {
		return getPrimitiveTypeIsFloat().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsFloat__IsApplicable_solveCsp_FWD__IsApplicableMatch_PrimitiveTypeFloat_ModelToTypeGraph_TypeGraph_Model() {
		return getPrimitiveTypeIsFloat().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsFloat__IsApplicable_checkCsp_FWD__CSP() {
		return getPrimitiveTypeIsFloat().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsFloat__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getPrimitiveTypeIsFloat().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsFloat__CheckTypes_FWD__Match() {
		return getPrimitiveTypeIsFloat().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsFloat__IsAppropriate_BWD__Match_TypeGraph_TClass() {
		return getPrimitiveTypeIsFloat().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsFloat__Perform_BWD__IsApplicableMatch() {
		return getPrimitiveTypeIsFloat().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsFloat__IsApplicable_BWD__Match() {
		return getPrimitiveTypeIsFloat().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsFloat__RegisterObjectsToMatch_BWD__Match_TypeGraph_TClass() {
		return getPrimitiveTypeIsFloat().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsFloat__IsAppropriate_solveCsp_BWD__Match_TypeGraph_TClass() {
		return getPrimitiveTypeIsFloat().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsFloat__IsAppropriate_checkCsp_BWD__CSP() {
		return getPrimitiveTypeIsFloat().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsFloat__IsApplicable_solveCsp_BWD__IsApplicableMatch_ModelToTypeGraph_TypeGraph_TClass_Model() {
		return getPrimitiveTypeIsFloat().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsFloat__IsApplicable_checkCsp_BWD__CSP() {
		return getPrimitiveTypeIsFloat().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsFloat__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getPrimitiveTypeIsFloat().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsFloat__CheckTypes_BWD__Match() {
		return getPrimitiveTypeIsFloat().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsFloat__IsAppropriate_BWD_EMoflonEdge_59__EMoflonEdge() {
		return getPrimitiveTypeIsFloat().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsFloat__IsAppropriate_FWD_EMoflonEdge_62__EMoflonEdge() {
		return getPrimitiveTypeIsFloat().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsFloat__CheckAttributes_FWD__TripleMatch() {
		return getPrimitiveTypeIsFloat().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsFloat__CheckAttributes_BWD__TripleMatch() {
		return getPrimitiveTypeIsFloat().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsFloat__IsApplicable_CC__Match_Match() {
		return getPrimitiveTypeIsFloat().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsFloat__IsApplicable_solveCsp_CC__PrimitiveTypeFloat_TypeGraph_TClass_Model_Match_Match() {
		return getPrimitiveTypeIsFloat().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsFloat__IsApplicable_checkCsp_CC__CSP() {
		return getPrimitiveTypeIsFloat().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsFloat__CheckDEC_FWD__PrimitiveTypeFloat_Model() {
		return getPrimitiveTypeIsFloat().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsFloat__CheckDEC_BWD__TypeGraph_TClass() {
		return getPrimitiveTypeIsFloat().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsFloat__GenerateModel__RuleEntryContainer_ModelToTypeGraph() {
		return getPrimitiveTypeIsFloat().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsFloat__GenerateModel_solveCsp_BWD__IsApplicableMatch_ModelToTypeGraph_TypeGraph_Model_ModelgeneratorRuleResult() {
		return getPrimitiveTypeIsFloat().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsFloat__GenerateModel_checkCsp_BWD__CSP() {
		return getPrimitiveTypeIsFloat().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnnotationTypeInPackage() {
		if (annotationTypeInPackageEClass == null) {
			annotationTypeInPackageEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(72);
		}
		return annotationTypeInPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeInPackage__IsAppropriate_FWD__Match_Package_AnnotationTypeDeclaration() {
		return getAnnotationTypeInPackage().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeInPackage__Perform_FWD__IsApplicableMatch() {
		return getAnnotationTypeInPackage().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeInPackage__IsApplicable_FWD__Match() {
		return getAnnotationTypeInPackage().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeInPackage__RegisterObjectsToMatch_FWD__Match_Package_AnnotationTypeDeclaration() {
		return getAnnotationTypeInPackage().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeInPackage__IsAppropriate_solveCsp_FWD__Match_Package_AnnotationTypeDeclaration() {
		return getAnnotationTypeInPackage().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeInPackage__IsAppropriate_checkCsp_FWD__CSP() {
		return getAnnotationTypeInPackage().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeInPackage__IsApplicable_solveCsp_FWD__IsApplicableMatch_PackageToTPackage_TPackage_Package_TypeGraph_AnnotationTypeDeclaration() {
		return getAnnotationTypeInPackage().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeInPackage__IsApplicable_checkCsp_FWD__CSP() {
		return getAnnotationTypeInPackage().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeInPackage__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getAnnotationTypeInPackage().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeInPackage__CheckTypes_FWD__Match() {
		return getAnnotationTypeInPackage().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeInPackage__IsAppropriate_BWD__Match_TAnnotationType_TPackage_TypeGraph() {
		return getAnnotationTypeInPackage().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeInPackage__Perform_BWD__IsApplicableMatch() {
		return getAnnotationTypeInPackage().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeInPackage__IsApplicable_BWD__Match() {
		return getAnnotationTypeInPackage().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeInPackage__RegisterObjectsToMatch_BWD__Match_TAnnotationType_TPackage_TypeGraph() {
		return getAnnotationTypeInPackage().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeInPackage__IsAppropriate_solveCsp_BWD__Match_TAnnotationType_TPackage_TypeGraph() {
		return getAnnotationTypeInPackage().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeInPackage__IsAppropriate_checkCsp_BWD__CSP() {
		return getAnnotationTypeInPackage().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeInPackage__IsApplicable_solveCsp_BWD__IsApplicableMatch_PackageToTPackage_TAnnotationType_TPackage_Package_TypeGraph() {
		return getAnnotationTypeInPackage().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeInPackage__IsApplicable_checkCsp_BWD__CSP() {
		return getAnnotationTypeInPackage().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeInPackage__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getAnnotationTypeInPackage().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeInPackage__CheckTypes_BWD__Match() {
		return getAnnotationTypeInPackage().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeInPackage__IsAppropriate_BWD_EMoflonEdge_60__EMoflonEdge() {
		return getAnnotationTypeInPackage().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeInPackage__IsAppropriate_FWD_EMoflonEdge_63__EMoflonEdge() {
		return getAnnotationTypeInPackage().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeInPackage__CheckAttributes_FWD__TripleMatch() {
		return getAnnotationTypeInPackage().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeInPackage__CheckAttributes_BWD__TripleMatch() {
		return getAnnotationTypeInPackage().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeInPackage__IsApplicable_CC__Match_Match() {
		return getAnnotationTypeInPackage().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeInPackage__IsApplicable_solveCsp_CC__TAnnotationType_TPackage_Package_TypeGraph_AnnotationTypeDeclaration_Match_Match() {
		return getAnnotationTypeInPackage().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeInPackage__IsApplicable_checkCsp_CC__CSP() {
		return getAnnotationTypeInPackage().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeInPackage__CheckDEC_FWD__Package_AnnotationTypeDeclaration() {
		return getAnnotationTypeInPackage().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeInPackage__CheckDEC_BWD__TAnnotationType_TPackage_TypeGraph() {
		return getAnnotationTypeInPackage().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeInPackage__GenerateModel__RuleEntryContainer_PackageToTPackage() {
		return getAnnotationTypeInPackage().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeInPackage__GenerateModel_solveCsp_BWD__IsApplicableMatch_PackageToTPackage_TPackage_Package_TypeGraph_ModelgeneratorRuleResult() {
		return getAnnotationTypeInPackage().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeInPackage__GenerateModel_checkCsp_BWD__CSP() {
		return getAnnotationTypeInPackage().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPrimitiveTypeIsChar() {
		if (primitiveTypeIsCharEClass == null) {
			primitiveTypeIsCharEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(73);
		}
		return primitiveTypeIsCharEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsChar__IsAppropriate_FWD__Match_PrimitiveTypeChar_Model() {
		return getPrimitiveTypeIsChar().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsChar__Perform_FWD__IsApplicableMatch() {
		return getPrimitiveTypeIsChar().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsChar__IsApplicable_FWD__Match() {
		return getPrimitiveTypeIsChar().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsChar__RegisterObjectsToMatch_FWD__Match_PrimitiveTypeChar_Model() {
		return getPrimitiveTypeIsChar().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsChar__IsAppropriate_solveCsp_FWD__Match_PrimitiveTypeChar_Model() {
		return getPrimitiveTypeIsChar().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsChar__IsAppropriate_checkCsp_FWD__CSP() {
		return getPrimitiveTypeIsChar().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsChar__IsApplicable_solveCsp_FWD__IsApplicableMatch_PrimitiveTypeChar_ModelToTypeGraph_TypeGraph_Model() {
		return getPrimitiveTypeIsChar().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsChar__IsApplicable_checkCsp_FWD__CSP() {
		return getPrimitiveTypeIsChar().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsChar__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getPrimitiveTypeIsChar().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsChar__CheckTypes_FWD__Match() {
		return getPrimitiveTypeIsChar().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsChar__IsAppropriate_BWD__Match_TypeGraph_TClass() {
		return getPrimitiveTypeIsChar().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsChar__Perform_BWD__IsApplicableMatch() {
		return getPrimitiveTypeIsChar().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsChar__IsApplicable_BWD__Match() {
		return getPrimitiveTypeIsChar().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsChar__RegisterObjectsToMatch_BWD__Match_TypeGraph_TClass() {
		return getPrimitiveTypeIsChar().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsChar__IsAppropriate_solveCsp_BWD__Match_TypeGraph_TClass() {
		return getPrimitiveTypeIsChar().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsChar__IsAppropriate_checkCsp_BWD__CSP() {
		return getPrimitiveTypeIsChar().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsChar__IsApplicable_solveCsp_BWD__IsApplicableMatch_ModelToTypeGraph_TypeGraph_TClass_Model() {
		return getPrimitiveTypeIsChar().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsChar__IsApplicable_checkCsp_BWD__CSP() {
		return getPrimitiveTypeIsChar().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsChar__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getPrimitiveTypeIsChar().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsChar__CheckTypes_BWD__Match() {
		return getPrimitiveTypeIsChar().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsChar__IsAppropriate_BWD_EMoflonEdge_61__EMoflonEdge() {
		return getPrimitiveTypeIsChar().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsChar__IsAppropriate_FWD_EMoflonEdge_64__EMoflonEdge() {
		return getPrimitiveTypeIsChar().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsChar__CheckAttributes_FWD__TripleMatch() {
		return getPrimitiveTypeIsChar().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsChar__CheckAttributes_BWD__TripleMatch() {
		return getPrimitiveTypeIsChar().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsChar__IsApplicable_CC__Match_Match() {
		return getPrimitiveTypeIsChar().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsChar__IsApplicable_solveCsp_CC__PrimitiveTypeChar_TypeGraph_TClass_Model_Match_Match() {
		return getPrimitiveTypeIsChar().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsChar__IsApplicable_checkCsp_CC__CSP() {
		return getPrimitiveTypeIsChar().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsChar__CheckDEC_FWD__PrimitiveTypeChar_Model() {
		return getPrimitiveTypeIsChar().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsChar__CheckDEC_BWD__TypeGraph_TClass() {
		return getPrimitiveTypeIsChar().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsChar__GenerateModel__RuleEntryContainer_ModelToTypeGraph() {
		return getPrimitiveTypeIsChar().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsChar__GenerateModel_solveCsp_BWD__IsApplicableMatch_ModelToTypeGraph_TypeGraph_Model_ModelgeneratorRuleResult() {
		return getPrimitiveTypeIsChar().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsChar__GenerateModel_checkCsp_BWD__CSP() {
		return getPrimitiveTypeIsChar().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTypeInPackage_Abstract() {
		if (typeInPackage_AbstractEClass == null) {
			typeInPackage_AbstractEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(74);
		}
		return typeInPackage_AbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnnotationTypeAccessOnAnnotation() {
		if (annotationTypeAccessOnAnnotationEClass == null) {
			annotationTypeAccessOnAnnotationEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(RulesPackage.eNS_URI).getEClassifiers().get(75);
		}
		return annotationTypeAccessOnAnnotationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeAccessOnAnnotation__IsAppropriate_FWD__Match_TypeAccess_AnnotationTypeDeclaration_AnnotationMemberValuePair_Annotation() {
		return getAnnotationTypeAccessOnAnnotation().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeAccessOnAnnotation__Perform_FWD__IsApplicableMatch() {
		return getAnnotationTypeAccessOnAnnotation().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeAccessOnAnnotation__IsApplicable_FWD__Match() {
		return getAnnotationTypeAccessOnAnnotation().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeAccessOnAnnotation__RegisterObjectsToMatch_FWD__Match_TypeAccess_AnnotationTypeDeclaration_AnnotationMemberValuePair_Annotation() {
		return getAnnotationTypeAccessOnAnnotation().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeAccessOnAnnotation__IsAppropriate_solveCsp_FWD__Match_TypeAccess_AnnotationTypeDeclaration_AnnotationMemberValuePair_Annotation() {
		return getAnnotationTypeAccessOnAnnotation().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeAccessOnAnnotation__IsAppropriate_checkCsp_FWD__CSP() {
		return getAnnotationTypeAccessOnAnnotation().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeAccessOnAnnotation__IsApplicable_solveCsp_FWD__IsApplicableMatch_TAnnotation_TypeAccess_AnnotationToTAnnotation_AnnotationTypeDeclaration_TypeToTAbstractType_AnnotationMemberValuePair_Annotation_TAnnotationType() {
		return getAnnotationTypeAccessOnAnnotation().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeAccessOnAnnotation__IsApplicable_checkCsp_FWD__CSP() {
		return getAnnotationTypeAccessOnAnnotation().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeAccessOnAnnotation__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getAnnotationTypeAccessOnAnnotation().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeAccessOnAnnotation__CheckTypes_FWD__Match() {
		return getAnnotationTypeAccessOnAnnotation().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeAccessOnAnnotation__IsAppropriate_BWD__Match_TAnnotation_TAnnotationType() {
		return getAnnotationTypeAccessOnAnnotation().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeAccessOnAnnotation__Perform_BWD__IsApplicableMatch() {
		return getAnnotationTypeAccessOnAnnotation().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeAccessOnAnnotation__IsApplicable_BWD__Match() {
		return getAnnotationTypeAccessOnAnnotation().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeAccessOnAnnotation__RegisterObjectsToMatch_BWD__Match_TAnnotation_TAnnotationType() {
		return getAnnotationTypeAccessOnAnnotation().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeAccessOnAnnotation__IsAppropriate_solveCsp_BWD__Match_TAnnotation_TAnnotationType() {
		return getAnnotationTypeAccessOnAnnotation().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeAccessOnAnnotation__IsAppropriate_checkCsp_BWD__CSP() {
		return getAnnotationTypeAccessOnAnnotation().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeAccessOnAnnotation__IsApplicable_solveCsp_BWD__IsApplicableMatch_TAnnotation_AnnotationToTAnnotation_AnnotationTypeDeclaration_TypeToTAbstractType_AnnotationMemberValuePair_Annotation_TAnnotationType() {
		return getAnnotationTypeAccessOnAnnotation().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeAccessOnAnnotation__IsApplicable_checkCsp_BWD__CSP() {
		return getAnnotationTypeAccessOnAnnotation().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeAccessOnAnnotation__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getAnnotationTypeAccessOnAnnotation().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeAccessOnAnnotation__CheckTypes_BWD__Match() {
		return getAnnotationTypeAccessOnAnnotation().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeAccessOnAnnotation__IsAppropriate_BWD_EMoflonEdge_62__EMoflonEdge() {
		return getAnnotationTypeAccessOnAnnotation().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeAccessOnAnnotation__IsAppropriate_FWD_EMoflonEdge_65__EMoflonEdge() {
		return getAnnotationTypeAccessOnAnnotation().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeAccessOnAnnotation__CheckAttributes_FWD__TripleMatch() {
		return getAnnotationTypeAccessOnAnnotation().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeAccessOnAnnotation__CheckAttributes_BWD__TripleMatch() {
		return getAnnotationTypeAccessOnAnnotation().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeAccessOnAnnotation__IsApplicable_CC__Match_Match() {
		return getAnnotationTypeAccessOnAnnotation().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeAccessOnAnnotation__IsApplicable_solveCsp_CC__TAnnotation_TypeAccess_AnnotationTypeDeclaration_AnnotationMemberValuePair_Annotation_TAnnotationType_Match_Match() {
		return getAnnotationTypeAccessOnAnnotation().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeAccessOnAnnotation__IsApplicable_checkCsp_CC__CSP() {
		return getAnnotationTypeAccessOnAnnotation().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeAccessOnAnnotation__CheckDEC_FWD__TypeAccess_AnnotationTypeDeclaration_AnnotationMemberValuePair_Annotation() {
		return getAnnotationTypeAccessOnAnnotation().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeAccessOnAnnotation__CheckDEC_BWD__TAnnotation_TAnnotationType() {
		return getAnnotationTypeAccessOnAnnotation().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeAccessOnAnnotation__GenerateModel__RuleEntryContainer_AnnotationToTAnnotation_TypeToTAbstractType() {
		return getAnnotationTypeAccessOnAnnotation().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeAccessOnAnnotation__GenerateModel_solveCsp_BWD__IsApplicableMatch_TAnnotation_AnnotationToTAnnotation_AnnotationTypeDeclaration_TypeToTAbstractType_AnnotationMemberValuePair_Annotation_TAnnotationType_ModelgeneratorRuleResult() {
		return getAnnotationTypeAccessOnAnnotation().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeAccessOnAnnotation__GenerateModel_checkCsp_BWD__CSP() {
		return getAnnotationTypeAccessOnAnnotation().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPrimitiveTypeIsBoolean() {
		if (primitiveTypeIsBooleanEClass == null) {
			primitiveTypeIsBooleanEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(76);
		}
		return primitiveTypeIsBooleanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsBoolean__IsAppropriate_FWD__Match_PrimitiveTypeBoolean_Model() {
		return getPrimitiveTypeIsBoolean().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsBoolean__Perform_FWD__IsApplicableMatch() {
		return getPrimitiveTypeIsBoolean().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsBoolean__IsApplicable_FWD__Match() {
		return getPrimitiveTypeIsBoolean().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsBoolean__RegisterObjectsToMatch_FWD__Match_PrimitiveTypeBoolean_Model() {
		return getPrimitiveTypeIsBoolean().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsBoolean__IsAppropriate_solveCsp_FWD__Match_PrimitiveTypeBoolean_Model() {
		return getPrimitiveTypeIsBoolean().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsBoolean__IsAppropriate_checkCsp_FWD__CSP() {
		return getPrimitiveTypeIsBoolean().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsBoolean__IsApplicable_solveCsp_FWD__IsApplicableMatch_PrimitiveTypeBoolean_ModelToTypeGraph_TypeGraph_Model() {
		return getPrimitiveTypeIsBoolean().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsBoolean__IsApplicable_checkCsp_FWD__CSP() {
		return getPrimitiveTypeIsBoolean().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsBoolean__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getPrimitiveTypeIsBoolean().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsBoolean__CheckTypes_FWD__Match() {
		return getPrimitiveTypeIsBoolean().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsBoolean__IsAppropriate_BWD__Match_TypeGraph_TClass() {
		return getPrimitiveTypeIsBoolean().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsBoolean__Perform_BWD__IsApplicableMatch() {
		return getPrimitiveTypeIsBoolean().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsBoolean__IsApplicable_BWD__Match() {
		return getPrimitiveTypeIsBoolean().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsBoolean__RegisterObjectsToMatch_BWD__Match_TypeGraph_TClass() {
		return getPrimitiveTypeIsBoolean().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsBoolean__IsAppropriate_solveCsp_BWD__Match_TypeGraph_TClass() {
		return getPrimitiveTypeIsBoolean().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsBoolean__IsAppropriate_checkCsp_BWD__CSP() {
		return getPrimitiveTypeIsBoolean().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsBoolean__IsApplicable_solveCsp_BWD__IsApplicableMatch_ModelToTypeGraph_TypeGraph_TClass_Model() {
		return getPrimitiveTypeIsBoolean().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsBoolean__IsApplicable_checkCsp_BWD__CSP() {
		return getPrimitiveTypeIsBoolean().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsBoolean__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getPrimitiveTypeIsBoolean().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsBoolean__CheckTypes_BWD__Match() {
		return getPrimitiveTypeIsBoolean().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsBoolean__IsAppropriate_BWD_EMoflonEdge_63__EMoflonEdge() {
		return getPrimitiveTypeIsBoolean().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsBoolean__IsAppropriate_FWD_EMoflonEdge_66__EMoflonEdge() {
		return getPrimitiveTypeIsBoolean().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsBoolean__CheckAttributes_FWD__TripleMatch() {
		return getPrimitiveTypeIsBoolean().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsBoolean__CheckAttributes_BWD__TripleMatch() {
		return getPrimitiveTypeIsBoolean().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsBoolean__IsApplicable_CC__Match_Match() {
		return getPrimitiveTypeIsBoolean().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsBoolean__IsApplicable_solveCsp_CC__PrimitiveTypeBoolean_TypeGraph_TClass_Model_Match_Match() {
		return getPrimitiveTypeIsBoolean().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsBoolean__IsApplicable_checkCsp_CC__CSP() {
		return getPrimitiveTypeIsBoolean().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsBoolean__CheckDEC_FWD__PrimitiveTypeBoolean_Model() {
		return getPrimitiveTypeIsBoolean().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsBoolean__CheckDEC_BWD__TypeGraph_TClass() {
		return getPrimitiveTypeIsBoolean().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsBoolean__GenerateModel__RuleEntryContainer_ModelToTypeGraph() {
		return getPrimitiveTypeIsBoolean().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsBoolean__GenerateModel_solveCsp_BWD__IsApplicableMatch_ModelToTypeGraph_TypeGraph_Model_ModelgeneratorRuleResult() {
		return getPrimitiveTypeIsBoolean().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsBoolean__GenerateModel_checkCsp_BWD__CSP() {
		return getPrimitiveTypeIsBoolean().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataFlowOut() {
		if (dataFlowOutEClass == null) {
			dataFlowOutEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI).getEClassifiers()
					.get(77);
		}
		return dataFlowOutEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataFlowOut__IsAppropriate_FWD__Match_MAbstractFlowElement_MFlow() {
		return getDataFlowOut().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataFlowOut__Perform_FWD__IsApplicableMatch() {
		return getDataFlowOut().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataFlowOut__IsApplicable_FWD__Match() {
		return getDataFlowOut().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataFlowOut__RegisterObjectsToMatch_FWD__Match_MAbstractFlowElement_MFlow() {
		return getDataFlowOut().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataFlowOut__IsAppropriate_solveCsp_FWD__Match_MAbstractFlowElement_MFlow() {
		return getDataFlowOut().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataFlowOut__IsAppropriate_checkCsp_FWD__CSP() {
		return getDataFlowOut().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataFlowOut__IsApplicable_solveCsp_FWD__IsApplicableMatch_MAbstractFlowElement_TAbstractFlowElement_TAbstractFlowElement_MFlow_MAbstractFlowElementToTAbstractFlowElement_MAbstractFlowElementToTAbstractFlowElement() {
		return getDataFlowOut().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataFlowOut__IsApplicable_checkCsp_FWD__CSP() {
		return getDataFlowOut().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataFlowOut__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getDataFlowOut().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataFlowOut__CheckTypes_FWD__Match() {
		return getDataFlowOut().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataFlowOut__IsAppropriate_BWD__Match_TAbstractFlowElement_TAbstractFlowElement() {
		return getDataFlowOut().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataFlowOut__Perform_BWD__IsApplicableMatch() {
		return getDataFlowOut().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataFlowOut__IsApplicable_BWD__Match() {
		return getDataFlowOut().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataFlowOut__RegisterObjectsToMatch_BWD__Match_TAbstractFlowElement_TAbstractFlowElement() {
		return getDataFlowOut().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataFlowOut__IsAppropriate_solveCsp_BWD__Match_TAbstractFlowElement_TAbstractFlowElement() {
		return getDataFlowOut().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataFlowOut__IsAppropriate_checkCsp_BWD__CSP() {
		return getDataFlowOut().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataFlowOut__IsApplicable_solveCsp_BWD__IsApplicableMatch_MAbstractFlowElement_TAbstractFlowElement_TAbstractFlowElement_MFlow_MAbstractFlowElementToTAbstractFlowElement_MAbstractFlowElementToTAbstractFlowElement() {
		return getDataFlowOut().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataFlowOut__IsApplicable_checkCsp_BWD__CSP() {
		return getDataFlowOut().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataFlowOut__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getDataFlowOut().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataFlowOut__CheckTypes_BWD__Match() {
		return getDataFlowOut().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataFlowOut__IsAppropriate_BWD_EMoflonEdge_64__EMoflonEdge() {
		return getDataFlowOut().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataFlowOut__IsAppropriate_FWD_EMoflonEdge_67__EMoflonEdge() {
		return getDataFlowOut().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataFlowOut__CheckAttributes_FWD__TripleMatch() {
		return getDataFlowOut().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataFlowOut__CheckAttributes_BWD__TripleMatch() {
		return getDataFlowOut().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataFlowOut__IsApplicable_CC__Match_Match() {
		return getDataFlowOut().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataFlowOut__IsApplicable_solveCsp_CC__MAbstractFlowElement_TAbstractFlowElement_TAbstractFlowElement_MFlow_Match_Match() {
		return getDataFlowOut().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataFlowOut__IsApplicable_checkCsp_CC__CSP() {
		return getDataFlowOut().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataFlowOut__CheckDEC_FWD__MAbstractFlowElement_MFlow() {
		return getDataFlowOut().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataFlowOut__CheckDEC_BWD__TAbstractFlowElement_TAbstractFlowElement() {
		return getDataFlowOut().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataFlowOut__GenerateModel__RuleEntryContainer_MAbstractFlowElementToTAbstractFlowElement_MAbstractFlowElementToTAbstractFlowElement() {
		return getDataFlowOut().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataFlowOut__GenerateModel_solveCsp_BWD__IsApplicableMatch_MAbstractFlowElement_TAbstractFlowElement_TAbstractFlowElement_MFlow_MAbstractFlowElementToTAbstractFlowElement_MAbstractFlowElementToTAbstractFlowElement_ModelgeneratorRuleResult() {
		return getDataFlowOut().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataFlowOut__GenerateModel_checkCsp_BWD__CSP() {
		return getDataFlowOut().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnnotationMemberValueArray() {
		if (annotationMemberValueArrayEClass == null) {
			annotationMemberValueArrayEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(78);
		}
		return annotationMemberValueArrayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMethodParameter() {
		if (methodParameterEClass == null) {
			methodParameterEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(79);
		}
		return methodParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodParameter__IsAppropriate_FWD__Match_MMethodSignature_Type_MEntry() {
		return getMethodParameter().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodParameter__Perform_FWD__IsApplicableMatch() {
		return getMethodParameter().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodParameter__IsApplicable_FWD__Match() {
		return getMethodParameter().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodParameter__RegisterObjectsToMatch_FWD__Match_MMethodSignature_Type_MEntry() {
		return getMethodParameter().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodParameter__IsAppropriate_solveCsp_FWD__Match_MMethodSignature_Type_MEntry() {
		return getMethodParameter().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodParameter__IsAppropriate_checkCsp_FWD__CSP() {
		return getMethodParameter().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodParameter__IsApplicable_solveCsp_FWD__IsApplicableMatch_TMethodSignature_TAbstractType_TypeToTAbstractType_MMethodSignature_MSignatureToTSignature_Type_MEntry() {
		return getMethodParameter().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodParameter__IsApplicable_checkCsp_FWD__CSP() {
		return getMethodParameter().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodParameter__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getMethodParameter().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodParameter__CheckTypes_FWD__Match() {
		return getMethodParameter().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodParameter__IsAppropriate_BWD__Match_TMethodSignature_TAbstractType_TParameter() {
		return getMethodParameter().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodParameter__Perform_BWD__IsApplicableMatch() {
		return getMethodParameter().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodParameter__IsApplicable_BWD__Match() {
		return getMethodParameter().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodParameter__RegisterObjectsToMatch_BWD__Match_TMethodSignature_TAbstractType_TParameter() {
		return getMethodParameter().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodParameter__IsAppropriate_solveCsp_BWD__Match_TMethodSignature_TAbstractType_TParameter() {
		return getMethodParameter().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodParameter__IsAppropriate_checkCsp_BWD__CSP() {
		return getMethodParameter().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodParameter__IsApplicable_solveCsp_BWD__IsApplicableMatch_TMethodSignature_TAbstractType_TypeToTAbstractType_MMethodSignature_MSignatureToTSignature_Type_TParameter() {
		return getMethodParameter().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodParameter__IsApplicable_checkCsp_BWD__CSP() {
		return getMethodParameter().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodParameter__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getMethodParameter().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodParameter__CheckTypes_BWD__Match() {
		return getMethodParameter().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodParameter__IsAppropriate_BWD_EMoflonEdge_65__EMoflonEdge() {
		return getMethodParameter().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodParameter__IsAppropriate_FWD_EMoflonEdge_68__EMoflonEdge() {
		return getMethodParameter().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodParameter__CheckAttributes_FWD__TripleMatch() {
		return getMethodParameter().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodParameter__CheckAttributes_BWD__TripleMatch() {
		return getMethodParameter().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodParameter__IsApplicable_CC__Match_Match() {
		return getMethodParameter().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodParameter__IsApplicable_solveCsp_CC__TMethodSignature_TAbstractType_MMethodSignature_Type_TParameter_MEntry_Match_Match() {
		return getMethodParameter().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodParameter__IsApplicable_checkCsp_CC__CSP() {
		return getMethodParameter().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodParameter__CheckDEC_FWD__MMethodSignature_Type_MEntry() {
		return getMethodParameter().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodParameter__CheckDEC_BWD__TMethodSignature_TAbstractType_TParameter() {
		return getMethodParameter().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodParameter__GenerateModel__RuleEntryContainer_MSignatureToTSignature_TypeToTAbstractType() {
		return getMethodParameter().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodParameter__GenerateModel_solveCsp_BWD__IsApplicableMatch_TMethodSignature_TAbstractType_TypeToTAbstractType_MMethodSignature_MSignatureToTSignature_Type_ModelgeneratorRuleResult() {
		return getMethodParameter().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodParameter__GenerateModel_checkCsp_BWD__CSP() {
		return getMethodParameter().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNestedEnumInType() {
		if (nestedEnumInTypeEClass == null) {
			nestedEnumInTypeEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(80);
		}
		return nestedEnumInTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNestedEnumInType__IsAppropriate_FWD__Match_EnumDeclaration_AbstractTypeDeclaration() {
		return getNestedEnumInType().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNestedEnumInType__Perform_FWD__IsApplicableMatch() {
		return getNestedEnumInType().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNestedEnumInType__IsApplicable_FWD__Match() {
		return getNestedEnumInType().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNestedEnumInType__RegisterObjectsToMatch_FWD__Match_EnumDeclaration_AbstractTypeDeclaration() {
		return getNestedEnumInType().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNestedEnumInType__IsAppropriate_solveCsp_FWD__Match_EnumDeclaration_AbstractTypeDeclaration() {
		return getNestedEnumInType().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNestedEnumInType__IsAppropriate_checkCsp_FWD__CSP() {
		return getNestedEnumInType().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNestedEnumInType__IsApplicable_solveCsp_FWD__IsApplicableMatch_EnumDeclaration_TypeGraph_TAbstractType_TypeToTAbstractType_AbstractTypeDeclaration_TPackage() {
		return getNestedEnumInType().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNestedEnumInType__IsApplicable_checkCsp_FWD__CSP() {
		return getNestedEnumInType().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNestedEnumInType__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getNestedEnumInType().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNestedEnumInType__CheckTypes_FWD__Match() {
		return getNestedEnumInType().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNestedEnumInType__IsAppropriate_BWD__Match_TypeGraph_TEnum_TClass_TAbstractType_TPackage() {
		return getNestedEnumInType().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNestedEnumInType__Perform_BWD__IsApplicableMatch() {
		return getNestedEnumInType().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNestedEnumInType__IsApplicable_BWD__Match() {
		return getNestedEnumInType().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNestedEnumInType__RegisterObjectsToMatch_BWD__Match_TypeGraph_TEnum_TClass_TAbstractType_TPackage() {
		return getNestedEnumInType().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNestedEnumInType__IsAppropriate_solveCsp_BWD__Match_TypeGraph_TEnum_TClass_TAbstractType_TPackage() {
		return getNestedEnumInType().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNestedEnumInType__IsAppropriate_checkCsp_BWD__CSP() {
		return getNestedEnumInType().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNestedEnumInType__IsApplicable_solveCsp_BWD__IsApplicableMatch_TypeGraph_TEnum_TClass_TAbstractType_TypeToTAbstractType_AbstractTypeDeclaration_TPackage() {
		return getNestedEnumInType().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNestedEnumInType__IsApplicable_checkCsp_BWD__CSP() {
		return getNestedEnumInType().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNestedEnumInType__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getNestedEnumInType().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNestedEnumInType__CheckTypes_BWD__Match() {
		return getNestedEnumInType().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNestedEnumInType__IsAppropriate_BWD_EMoflonEdge_66__EMoflonEdge() {
		return getNestedEnumInType().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNestedEnumInType__IsAppropriate_FWD_EMoflonEdge_69__EMoflonEdge() {
		return getNestedEnumInType().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNestedEnumInType__CheckAttributes_FWD__TripleMatch() {
		return getNestedEnumInType().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNestedEnumInType__CheckAttributes_BWD__TripleMatch() {
		return getNestedEnumInType().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNestedEnumInType__IsApplicable_CC__Match_Match() {
		return getNestedEnumInType().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNestedEnumInType__IsApplicable_solveCsp_CC__EnumDeclaration_TypeGraph_TEnum_TClass_TAbstractType_AbstractTypeDeclaration_TPackage_Match_Match() {
		return getNestedEnumInType().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNestedEnumInType__IsApplicable_checkCsp_CC__CSP() {
		return getNestedEnumInType().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNestedEnumInType__CheckDEC_FWD__EnumDeclaration_AbstractTypeDeclaration() {
		return getNestedEnumInType().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNestedEnumInType__CheckDEC_BWD__TypeGraph_TEnum_TClass_TAbstractType_TPackage() {
		return getNestedEnumInType().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNestedEnumInType__GenerateModel__RuleEntryContainer_TypeToTAbstractType() {
		return getNestedEnumInType().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNestedEnumInType__GenerateModel_solveCsp_BWD__IsApplicableMatch_TypeGraph_TAbstractType_TypeToTAbstractType_AbstractTypeDeclaration_TPackage_ModelgeneratorRuleResult() {
		return getNestedEnumInType().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNestedEnumInType__GenerateModel_checkCsp_BWD__CSP() {
		return getNestedEnumInType().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getClassImplementsInterface() {
		if (classImplementsInterfaceEClass == null) {
			classImplementsInterfaceEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(81);
		}
		return classImplementsInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassImplementsInterface__IsAppropriate_FWD__Match_ClassDeclaration_TypeAccess_AbstractTypeDeclaration() {
		return getClassImplementsInterface().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassImplementsInterface__Perform_FWD__IsApplicableMatch() {
		return getClassImplementsInterface().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassImplementsInterface__IsApplicable_FWD__Match() {
		return getClassImplementsInterface().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassImplementsInterface__RegisterObjectsToMatch_FWD__Match_ClassDeclaration_TypeAccess_AbstractTypeDeclaration() {
		return getClassImplementsInterface().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassImplementsInterface__IsAppropriate_solveCsp_FWD__Match_ClassDeclaration_TypeAccess_AbstractTypeDeclaration() {
		return getClassImplementsInterface().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassImplementsInterface__IsAppropriate_checkCsp_FWD__CSP() {
		return getClassImplementsInterface().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassImplementsInterface__IsApplicable_solveCsp_FWD__IsApplicableMatch_TClass_ClassDeclaration_TypeAccess_TInterface_AbstractTypeDeclaration_TypeToTAbstractType_TypeToTAbstractType() {
		return getClassImplementsInterface().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassImplementsInterface__IsApplicable_checkCsp_FWD__CSP() {
		return getClassImplementsInterface().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassImplementsInterface__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getClassImplementsInterface().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassImplementsInterface__CheckTypes_FWD__Match() {
		return getClassImplementsInterface().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassImplementsInterface__IsAppropriate_BWD__Match_TClass_TInterface() {
		return getClassImplementsInterface().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassImplementsInterface__Perform_BWD__IsApplicableMatch() {
		return getClassImplementsInterface().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassImplementsInterface__IsApplicable_BWD__Match() {
		return getClassImplementsInterface().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassImplementsInterface__RegisterObjectsToMatch_BWD__Match_TClass_TInterface() {
		return getClassImplementsInterface().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassImplementsInterface__IsAppropriate_solveCsp_BWD__Match_TClass_TInterface() {
		return getClassImplementsInterface().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassImplementsInterface__IsAppropriate_checkCsp_BWD__CSP() {
		return getClassImplementsInterface().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassImplementsInterface__IsApplicable_solveCsp_BWD__IsApplicableMatch_TClass_ClassDeclaration_TInterface_AbstractTypeDeclaration_TypeToTAbstractType_TypeToTAbstractType() {
		return getClassImplementsInterface().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassImplementsInterface__IsApplicable_checkCsp_BWD__CSP() {
		return getClassImplementsInterface().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassImplementsInterface__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getClassImplementsInterface().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassImplementsInterface__CheckTypes_BWD__Match() {
		return getClassImplementsInterface().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassImplementsInterface__IsAppropriate_BWD_EMoflonEdge_67__EMoflonEdge() {
		return getClassImplementsInterface().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassImplementsInterface__IsAppropriate_FWD_EMoflonEdge_70__EMoflonEdge() {
		return getClassImplementsInterface().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassImplementsInterface__CheckAttributes_FWD__TripleMatch() {
		return getClassImplementsInterface().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassImplementsInterface__CheckAttributes_BWD__TripleMatch() {
		return getClassImplementsInterface().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassImplementsInterface__IsApplicable_CC__Match_Match() {
		return getClassImplementsInterface().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassImplementsInterface__IsApplicable_solveCsp_CC__TClass_ClassDeclaration_TypeAccess_TInterface_AbstractTypeDeclaration_Match_Match() {
		return getClassImplementsInterface().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassImplementsInterface__IsApplicable_checkCsp_CC__CSP() {
		return getClassImplementsInterface().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassImplementsInterface__CheckDEC_FWD__ClassDeclaration_TypeAccess_AbstractTypeDeclaration() {
		return getClassImplementsInterface().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassImplementsInterface__CheckDEC_BWD__TClass_TInterface() {
		return getClassImplementsInterface().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassImplementsInterface__GenerateModel__RuleEntryContainer_TypeToTAbstractType_TypeToTAbstractType() {
		return getClassImplementsInterface().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassImplementsInterface__GenerateModel_solveCsp_BWD__IsApplicableMatch_TClass_ClassDeclaration_TInterface_AbstractTypeDeclaration_TypeToTAbstractType_TypeToTAbstractType_ModelgeneratorRuleResult() {
		return getClassImplementsInterface().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassImplementsInterface__GenerateModel_checkCsp_BWD__CSP() {
		return getClassImplementsInterface().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInterfaceMember() {
		if (interfaceMemberEClass == null) {
			interfaceMemberEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(82);
		}
		return interfaceMemberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterfaceMember__IsAppropriate_FWD__Match_Modifier_MDefinition_InterfaceDeclaration() {
		return getInterfaceMember().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterfaceMember__Perform_FWD__IsApplicableMatch() {
		return getInterfaceMember().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterfaceMember__IsApplicable_FWD__Match() {
		return getInterfaceMember().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterfaceMember__RegisterObjectsToMatch_FWD__Match_Modifier_MDefinition_InterfaceDeclaration() {
		return getInterfaceMember().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterfaceMember__IsAppropriate_solveCsp_FWD__Match_Modifier_MDefinition_InterfaceDeclaration() {
		return getInterfaceMember().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterfaceMember__IsAppropriate_checkCsp_FWD__CSP() {
		return getInterfaceMember().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterfaceMember__IsApplicable_solveCsp_FWD__IsApplicableMatch_TMember_MDefinitionToTMember_Modifier_MDefinition_TInterface_InterfaceDeclaration_TypeToTAbstractType() {
		return getInterfaceMember().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterfaceMember__IsApplicable_checkCsp_FWD__CSP() {
		return getInterfaceMember().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterfaceMember__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getInterfaceMember().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterfaceMember__CheckTypes_FWD__Match() {
		return getInterfaceMember().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterfaceMember__IsAppropriate_BWD__Match_TMember_TModifier_TInterface() {
		return getInterfaceMember().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterfaceMember__Perform_BWD__IsApplicableMatch() {
		return getInterfaceMember().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterfaceMember__IsApplicable_BWD__Match() {
		return getInterfaceMember().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterfaceMember__RegisterObjectsToMatch_BWD__Match_TMember_TModifier_TInterface() {
		return getInterfaceMember().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterfaceMember__IsAppropriate_solveCsp_BWD__Match_TMember_TModifier_TInterface() {
		return getInterfaceMember().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterfaceMember__IsAppropriate_checkCsp_BWD__CSP() {
		return getInterfaceMember().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterfaceMember__IsApplicable_solveCsp_BWD__IsApplicableMatch_TMember_MDefinitionToTMember_MDefinition_TModifier_TInterface_InterfaceDeclaration_TypeToTAbstractType() {
		return getInterfaceMember().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterfaceMember__IsApplicable_checkCsp_BWD__CSP() {
		return getInterfaceMember().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterfaceMember__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getInterfaceMember().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterfaceMember__CheckTypes_BWD__Match() {
		return getInterfaceMember().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterfaceMember__IsAppropriate_BWD_EMoflonEdge_68__EMoflonEdge() {
		return getInterfaceMember().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterfaceMember__IsAppropriate_FWD_EMoflonEdge_71__EMoflonEdge() {
		return getInterfaceMember().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterfaceMember__CheckAttributes_FWD__TripleMatch() {
		return getInterfaceMember().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterfaceMember__CheckAttributes_BWD__TripleMatch() {
		return getInterfaceMember().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterfaceMember__IsApplicable_CC__Match_Match() {
		return getInterfaceMember().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterfaceMember__IsApplicable_solveCsp_CC__TMember_Modifier_MDefinition_TModifier_TInterface_InterfaceDeclaration_Match_Match() {
		return getInterfaceMember().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterfaceMember__IsApplicable_checkCsp_CC__CSP() {
		return getInterfaceMember().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterfaceMember__CheckDEC_FWD__Modifier_MDefinition_InterfaceDeclaration() {
		return getInterfaceMember().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterfaceMember__CheckDEC_BWD__TMember_TModifier_TInterface() {
		return getInterfaceMember().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterfaceMember__GenerateModel__RuleEntryContainer_MDefinitionToTMember() {
		return getInterfaceMember().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterfaceMember__GenerateModel_solveCsp_BWD__IsApplicableMatch_TMember_MDefinitionToTMember_MDefinition_TInterface_InterfaceDeclaration_TypeToTAbstractType_ModelgeneratorRuleResult() {
		return getInterfaceMember().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterfaceMember__GenerateModel_checkCsp_BWD__CSP() {
		return getInterfaceMember().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnonymousClassType() {
		if (anonymousClassTypeEClass == null) {
			anonymousClassTypeEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(83);
		}
		return anonymousClassTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnonymousClassInType() {
		if (anonymousClassInTypeEClass == null) {
			anonymousClassInTypeEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(84);
		}
		return anonymousClassInTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClassInType__IsAppropriate_FWD__Match_ClassInstanceCreation_MDefinition_AnonymousClassDeclaration_AbstractTypeDeclaration() {
		return getAnonymousClassInType().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClassInType__Perform_FWD__IsApplicableMatch() {
		return getAnonymousClassInType().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClassInType__IsApplicable_FWD__Match() {
		return getAnonymousClassInType().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClassInType__RegisterObjectsToMatch_FWD__Match_ClassInstanceCreation_MDefinition_AnonymousClassDeclaration_AbstractTypeDeclaration() {
		return getAnonymousClassInType().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClassInType__IsAppropriate_solveCsp_FWD__Match_ClassInstanceCreation_MDefinition_AnonymousClassDeclaration_AbstractTypeDeclaration() {
		return getAnonymousClassInType().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClassInType__IsAppropriate_checkCsp_FWD__CSP() {
		return getAnonymousClassInType().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClassInType__IsApplicable_solveCsp_FWD__IsApplicableMatch_MDefinitionToTMember_ClassInstanceCreation_TAbstractType_TypeToTAbstractType_TMember_TPackage_TypeGraph_MDefinition_AnonymousClassDeclaration_AbstractTypeDeclaration() {
		return getAnonymousClassInType().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClassInType__IsApplicable_checkCsp_FWD__CSP() {
		return getAnonymousClassInType().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClassInType__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getAnonymousClassInType().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClassInType__CheckTypes_FWD__Match() {
		return getAnonymousClassInType().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClassInType__IsAppropriate_BWD__Match_TAbstractType_TClass_TMember_TPackage_TypeGraph() {
		return getAnonymousClassInType().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClassInType__Perform_BWD__IsApplicableMatch() {
		return getAnonymousClassInType().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClassInType__IsApplicable_BWD__Match() {
		return getAnonymousClassInType().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClassInType__RegisterObjectsToMatch_BWD__Match_TAbstractType_TClass_TMember_TPackage_TypeGraph() {
		return getAnonymousClassInType().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClassInType__IsAppropriate_solveCsp_BWD__Match_TAbstractType_TClass_TMember_TPackage_TypeGraph() {
		return getAnonymousClassInType().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClassInType__IsAppropriate_checkCsp_BWD__CSP() {
		return getAnonymousClassInType().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClassInType__IsApplicable_solveCsp_BWD__IsApplicableMatch_MDefinitionToTMember_ClassInstanceCreation_TAbstractType_TClass_TypeToTAbstractType_TMember_TPackage_TypeGraph_MDefinition_AbstractTypeDeclaration() {
		return getAnonymousClassInType().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClassInType__IsApplicable_checkCsp_BWD__CSP() {
		return getAnonymousClassInType().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClassInType__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getAnonymousClassInType().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClassInType__CheckTypes_BWD__Match() {
		return getAnonymousClassInType().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClassInType__IsAppropriate_BWD_EMoflonEdge_69__EMoflonEdge() {
		return getAnonymousClassInType().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClassInType__IsAppropriate_FWD_EMoflonEdge_72__EMoflonEdge() {
		return getAnonymousClassInType().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClassInType__CheckAttributes_FWD__TripleMatch() {
		return getAnonymousClassInType().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClassInType__CheckAttributes_BWD__TripleMatch() {
		return getAnonymousClassInType().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClassInType__IsApplicable_CC__Match_Match() {
		return getAnonymousClassInType().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClassInType__IsApplicable_solveCsp_CC__ClassInstanceCreation_TAbstractType_TClass_TMember_TPackage_TypeGraph_MDefinition_AnonymousClassDeclaration_AbstractTypeDeclaration_Match_Match() {
		return getAnonymousClassInType().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClassInType__IsApplicable_checkCsp_CC__CSP() {
		return getAnonymousClassInType().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClassInType__CheckDEC_FWD__ClassInstanceCreation_MDefinition_AnonymousClassDeclaration_AbstractTypeDeclaration() {
		return getAnonymousClassInType().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClassInType__CheckDEC_BWD__TAbstractType_TClass_TMember_TPackage_TypeGraph() {
		return getAnonymousClassInType().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClassInType__GenerateModel__RuleEntryContainer_MDefinitionToTMember() {
		return getAnonymousClassInType().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClassInType__GenerateModel_solveCsp_BWD__IsApplicableMatch_MDefinitionToTMember_ClassInstanceCreation_TAbstractType_TypeToTAbstractType_TMember_TPackage_TypeGraph_MDefinition_AbstractTypeDeclaration_ModelgeneratorRuleResult() {
		return getAnonymousClassInType().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousClassInType__GenerateModel_checkCsp_BWD__CSP() {
		return getAnonymousClassInType().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnnotationMemberKey() {
		if (annotationMemberKeyEClass == null) {
			annotationMemberKeyEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(85);
		}
		return annotationMemberKeyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberKey__IsAppropriate_FWD__Match_BodyDeclaration_Annotation_AnnotationMemberValuePair() {
		return getAnnotationMemberKey().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberKey__Perform_FWD__IsApplicableMatch() {
		return getAnnotationMemberKey().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberKey__IsApplicable_FWD__Match() {
		return getAnnotationMemberKey().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberKey__RegisterObjectsToMatch_FWD__Match_BodyDeclaration_Annotation_AnnotationMemberValuePair() {
		return getAnnotationMemberKey().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberKey__IsAppropriate_solveCsp_FWD__Match_BodyDeclaration_Annotation_AnnotationMemberValuePair() {
		return getAnnotationMemberKey().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberKey__IsAppropriate_checkCsp_FWD__CSP() {
		return getAnnotationMemberKey().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberKey__IsApplicable_solveCsp_FWD__IsApplicableMatch_TAnnotatable_BodyDeclaration_Annotation_ASTNodeToTAnnotatable_AnnotationToTAnnotation_TAnnotation_AnnotationMemberValuePair() {
		return getAnnotationMemberKey().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberKey__IsApplicable_checkCsp_FWD__CSP() {
		return getAnnotationMemberKey().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberKey__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getAnnotationMemberKey().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberKey__CheckTypes_FWD__Match() {
		return getAnnotationMemberKey().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberKey__IsAppropriate_BWD__Match_TAnnotatable_TAnnotationValue_TAnnotation() {
		return getAnnotationMemberKey().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberKey__Perform_BWD__IsApplicableMatch() {
		return getAnnotationMemberKey().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberKey__IsApplicable_BWD__Match() {
		return getAnnotationMemberKey().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberKey__RegisterObjectsToMatch_BWD__Match_TAnnotatable_TAnnotationValue_TAnnotation() {
		return getAnnotationMemberKey().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberKey__IsAppropriate_solveCsp_BWD__Match_TAnnotatable_TAnnotationValue_TAnnotation() {
		return getAnnotationMemberKey().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberKey__IsAppropriate_checkCsp_BWD__CSP() {
		return getAnnotationMemberKey().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberKey__IsApplicable_solveCsp_BWD__IsApplicableMatch_TAnnotatable_TAnnotationValue_BodyDeclaration_Annotation_ASTNodeToTAnnotatable_AnnotationToTAnnotation_TAnnotation() {
		return getAnnotationMemberKey().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberKey__IsApplicable_checkCsp_BWD__CSP() {
		return getAnnotationMemberKey().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberKey__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getAnnotationMemberKey().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberKey__CheckTypes_BWD__Match() {
		return getAnnotationMemberKey().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberKey__IsAppropriate_BWD_EMoflonEdge_70__EMoflonEdge() {
		return getAnnotationMemberKey().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberKey__IsAppropriate_FWD_EMoflonEdge_73__EMoflonEdge() {
		return getAnnotationMemberKey().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberKey__CheckAttributes_FWD__TripleMatch() {
		return getAnnotationMemberKey().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberKey__CheckAttributes_BWD__TripleMatch() {
		return getAnnotationMemberKey().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberKey__IsApplicable_CC__Match_Match() {
		return getAnnotationMemberKey().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberKey__IsApplicable_solveCsp_CC__TAnnotatable_TAnnotationValue_BodyDeclaration_Annotation_TAnnotation_AnnotationMemberValuePair_Match_Match() {
		return getAnnotationMemberKey().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberKey__IsApplicable_checkCsp_CC__CSP() {
		return getAnnotationMemberKey().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberKey__CheckDEC_FWD__BodyDeclaration_Annotation_AnnotationMemberValuePair() {
		return getAnnotationMemberKey().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberKey__CheckDEC_BWD__TAnnotatable_TAnnotationValue_TAnnotation() {
		return getAnnotationMemberKey().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberKey__GenerateModel__RuleEntryContainer_AnnotationToTAnnotation() {
		return getAnnotationMemberKey().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberKey__GenerateModel_solveCsp_BWD__IsApplicableMatch_TAnnotatable_BodyDeclaration_Annotation_ASTNodeToTAnnotatable_AnnotationToTAnnotation_TAnnotation_ModelgeneratorRuleResult() {
		return getAnnotationMemberKey().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberKey__GenerateModel_checkCsp_BWD__CSP() {
		return getAnnotationMemberKey().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFieldAccessWrite() {
		if (fieldAccessWriteEClass == null) {
			fieldAccessWriteEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(86);
		}
		return fieldAccessWriteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldAccessWrite__IsAppropriate_FWD__Match_MSingleVariableAccess_VariableDeclarationFragment_MFieldDefinition_MDefinition() {
		return getFieldAccessWrite().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldAccessWrite__Perform_FWD__IsApplicableMatch() {
		return getFieldAccessWrite().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldAccessWrite__IsApplicable_FWD__Match() {
		return getFieldAccessWrite().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldAccessWrite__RegisterObjectsToMatch_FWD__Match_MSingleVariableAccess_VariableDeclarationFragment_MFieldDefinition_MDefinition() {
		return getFieldAccessWrite().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldAccessWrite__IsAppropriate_solveCsp_FWD__Match_MSingleVariableAccess_VariableDeclarationFragment_MFieldDefinition_MDefinition() {
		return getFieldAccessWrite().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldAccessWrite__IsAppropriate_checkCsp_FWD__CSP() {
		return getFieldAccessWrite().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldAccessWrite__IsApplicable_solveCsp_FWD__IsApplicableMatch_MSingleVariableAccess_MDefinitionToTMember_VariableDeclarationFragment_TMember_MFieldDefinition_MDefinitionToTMember_MDefinition_TFieldDefinition() {
		return getFieldAccessWrite().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldAccessWrite__IsApplicable_checkCsp_FWD__CSP() {
		return getFieldAccessWrite().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldAccessWrite__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getFieldAccessWrite().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldAccessWrite__CheckTypes_FWD__Match() {
		return getFieldAccessWrite().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldAccessWrite__IsAppropriate_BWD__Match_TMember_TWrite_TFieldDefinition() {
		return getFieldAccessWrite().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldAccessWrite__Perform_BWD__IsApplicableMatch() {
		return getFieldAccessWrite().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldAccessWrite__IsApplicable_BWD__Match() {
		return getFieldAccessWrite().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldAccessWrite__RegisterObjectsToMatch_BWD__Match_TMember_TWrite_TFieldDefinition() {
		return getFieldAccessWrite().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldAccessWrite__IsAppropriate_solveCsp_BWD__Match_TMember_TWrite_TFieldDefinition() {
		return getFieldAccessWrite().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldAccessWrite__IsAppropriate_checkCsp_BWD__CSP() {
		return getFieldAccessWrite().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldAccessWrite__IsApplicable_solveCsp_BWD__IsApplicableMatch_MDefinitionToTMember_VariableDeclarationFragment_TMember_MFieldDefinition_TWrite_MDefinitionToTMember_MDefinition_TFieldDefinition() {
		return getFieldAccessWrite().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldAccessWrite__IsApplicable_checkCsp_BWD__CSP() {
		return getFieldAccessWrite().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldAccessWrite__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getFieldAccessWrite().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldAccessWrite__CheckTypes_BWD__Match() {
		return getFieldAccessWrite().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldAccessWrite__IsAppropriate_BWD_EMoflonEdge_71__EMoflonEdge() {
		return getFieldAccessWrite().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldAccessWrite__IsAppropriate_FWD_EMoflonEdge_74__EMoflonEdge() {
		return getFieldAccessWrite().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldAccessWrite__CheckAttributes_FWD__TripleMatch() {
		return getFieldAccessWrite().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldAccessWrite__CheckAttributes_BWD__TripleMatch() {
		return getFieldAccessWrite().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldAccessWrite__IsApplicable_CC__Match_Match() {
		return getFieldAccessWrite().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldAccessWrite__IsApplicable_solveCsp_CC__MSingleVariableAccess_VariableDeclarationFragment_TMember_MFieldDefinition_TWrite_MDefinition_TFieldDefinition_Match_Match() {
		return getFieldAccessWrite().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldAccessWrite__IsApplicable_checkCsp_CC__CSP() {
		return getFieldAccessWrite().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldAccessWrite__CheckDEC_FWD__MSingleVariableAccess_VariableDeclarationFragment_MFieldDefinition_MDefinition() {
		return getFieldAccessWrite().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldAccessWrite__CheckDEC_BWD__TMember_TWrite_TFieldDefinition() {
		return getFieldAccessWrite().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldAccessWrite__GenerateModel__RuleEntryContainer_MDefinitionToTMember_MDefinitionToTMember() {
		return getFieldAccessWrite().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldAccessWrite__GenerateModel_solveCsp_BWD__IsApplicableMatch_MDefinitionToTMember_VariableDeclarationFragment_TMember_MFieldDefinition_MDefinitionToTMember_MDefinition_TFieldDefinition_ModelgeneratorRuleResult() {
		return getFieldAccessWrite().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFieldAccessWrite__GenerateModel_checkCsp_BWD__CSP() {
		return getFieldAccessWrite().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInitializerInType() {
		if (initializerInTypeEClass == null) {
			initializerInTypeEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(87);
		}
		return initializerInTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitializerInType__IsAppropriate_FWD__Match_MInitializer_AbstractTypeDeclaration() {
		return getInitializerInType().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitializerInType__Perform_FWD__IsApplicableMatch() {
		return getInitializerInType().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitializerInType__IsApplicable_FWD__Match() {
		return getInitializerInType().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitializerInType__RegisterObjectsToMatch_FWD__Match_MInitializer_AbstractTypeDeclaration() {
		return getInitializerInType().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitializerInType__IsAppropriate_solveCsp_FWD__Match_MInitializer_AbstractTypeDeclaration() {
		return getInitializerInType().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitializerInType__IsAppropriate_checkCsp_FWD__CSP() {
		return getInitializerInType().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitializerInType__IsApplicable_solveCsp_FWD__IsApplicableMatch_TypeGraph_TAbstractType_TypeToTAbstractType_MInitializer_AbstractTypeDeclaration() {
		return getInitializerInType().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitializerInType__IsApplicable_checkCsp_FWD__CSP() {
		return getInitializerInType().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitializerInType__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getInitializerInType().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitializerInType__CheckTypes_FWD__Match() {
		return getInitializerInType().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitializerInType__IsAppropriate_BWD__Match_TypeGraph_TMethodSignature_TAbstractType_TModifier_TMethod_TMethodDefinition() {
		return getInitializerInType().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitializerInType__Perform_BWD__IsApplicableMatch() {
		return getInitializerInType().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitializerInType__IsApplicable_BWD__Match() {
		return getInitializerInType().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitializerInType__RegisterObjectsToMatch_BWD__Match_TypeGraph_TMethodSignature_TAbstractType_TModifier_TMethod_TMethodDefinition() {
		return getInitializerInType().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitializerInType__IsAppropriate_solveCsp_BWD__Match_TypeGraph_TMethodSignature_TAbstractType_TModifier_TMethod_TMethodDefinition() {
		return getInitializerInType().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitializerInType__IsAppropriate_checkCsp_BWD__CSP() {
		return getInitializerInType().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitializerInType__IsApplicable_solveCsp_BWD__IsApplicableMatch_TypeGraph_TMethodSignature_TAbstractType_TypeToTAbstractType_TModifier_TMethod_TMethodDefinition_AbstractTypeDeclaration() {
		return getInitializerInType().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitializerInType__IsApplicable_checkCsp_BWD__CSP() {
		return getInitializerInType().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitializerInType__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getInitializerInType().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitializerInType__CheckTypes_BWD__Match() {
		return getInitializerInType().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitializerInType__IsAppropriate_BWD_EMoflonEdge_72__EMoflonEdge() {
		return getInitializerInType().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitializerInType__IsAppropriate_FWD_EMoflonEdge_75__EMoflonEdge() {
		return getInitializerInType().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitializerInType__CheckAttributes_FWD__TripleMatch() {
		return getInitializerInType().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitializerInType__CheckAttributes_BWD__TripleMatch() {
		return getInitializerInType().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitializerInType__IsApplicable_CC__Match_Match() {
		return getInitializerInType().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitializerInType__IsApplicable_solveCsp_CC__TypeGraph_TMethodSignature_TAbstractType_TModifier_TMethod_MInitializer_TMethodDefinition_AbstractTypeDeclaration_Match_Match() {
		return getInitializerInType().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitializerInType__IsApplicable_checkCsp_CC__CSP() {
		return getInitializerInType().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitializerInType__CheckDEC_FWD__MInitializer_AbstractTypeDeclaration() {
		return getInitializerInType().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitializerInType__CheckDEC_BWD__TypeGraph_TMethodSignature_TAbstractType_TModifier_TMethod_TMethodDefinition() {
		return getInitializerInType().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitializerInType__GenerateModel__RuleEntryContainer_TypeToTAbstractType() {
		return getInitializerInType().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitializerInType__GenerateModel_solveCsp_BWD__IsApplicableMatch_TypeGraph_TAbstractType_TypeToTAbstractType_AbstractTypeDeclaration_ModelgeneratorRuleResult() {
		return getInitializerInType().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInitializerInType__GenerateModel_checkCsp_BWD__CSP() {
		return getInitializerInType().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnnotationTypeNested() {
		if (annotationTypeNestedEClass == null) {
			annotationTypeNestedEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(88);
		}
		return annotationTypeNestedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeNested__IsAppropriate_FWD__Match_AnnotationTypeDeclaration_AbstractTypeDeclaration() {
		return getAnnotationTypeNested().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeNested__Perform_FWD__IsApplicableMatch() {
		return getAnnotationTypeNested().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeNested__IsApplicable_FWD__Match() {
		return getAnnotationTypeNested().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeNested__RegisterObjectsToMatch_FWD__Match_AnnotationTypeDeclaration_AbstractTypeDeclaration() {
		return getAnnotationTypeNested().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeNested__IsAppropriate_solveCsp_FWD__Match_AnnotationTypeDeclaration_AbstractTypeDeclaration() {
		return getAnnotationTypeNested().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeNested__IsAppropriate_checkCsp_FWD__CSP() {
		return getAnnotationTypeNested().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeNested__IsApplicable_solveCsp_FWD__IsApplicableMatch_AnnotationTypeDeclaration_TypeGraph_TAbstractType_TypeToTAbstractType_AbstractTypeDeclaration_TPackage() {
		return getAnnotationTypeNested().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeNested__IsApplicable_checkCsp_FWD__CSP() {
		return getAnnotationTypeNested().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeNested__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getAnnotationTypeNested().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeNested__CheckTypes_FWD__Match() {
		return getAnnotationTypeNested().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeNested__IsAppropriate_BWD__Match_TypeGraph_TAnnotationType_TAbstractType_TPackage() {
		return getAnnotationTypeNested().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeNested__Perform_BWD__IsApplicableMatch() {
		return getAnnotationTypeNested().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeNested__IsApplicable_BWD__Match() {
		return getAnnotationTypeNested().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeNested__RegisterObjectsToMatch_BWD__Match_TypeGraph_TAnnotationType_TAbstractType_TPackage() {
		return getAnnotationTypeNested().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeNested__IsAppropriate_solveCsp_BWD__Match_TypeGraph_TAnnotationType_TAbstractType_TPackage() {
		return getAnnotationTypeNested().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeNested__IsAppropriate_checkCsp_BWD__CSP() {
		return getAnnotationTypeNested().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeNested__IsApplicable_solveCsp_BWD__IsApplicableMatch_TypeGraph_TAnnotationType_TAbstractType_TypeToTAbstractType_AbstractTypeDeclaration_TPackage() {
		return getAnnotationTypeNested().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeNested__IsApplicable_checkCsp_BWD__CSP() {
		return getAnnotationTypeNested().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeNested__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getAnnotationTypeNested().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeNested__CheckTypes_BWD__Match() {
		return getAnnotationTypeNested().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeNested__IsAppropriate_BWD_EMoflonEdge_73__EMoflonEdge() {
		return getAnnotationTypeNested().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeNested__IsAppropriate_FWD_EMoflonEdge_76__EMoflonEdge() {
		return getAnnotationTypeNested().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeNested__CheckAttributes_FWD__TripleMatch() {
		return getAnnotationTypeNested().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeNested__CheckAttributes_BWD__TripleMatch() {
		return getAnnotationTypeNested().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeNested__IsApplicable_CC__Match_Match() {
		return getAnnotationTypeNested().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeNested__IsApplicable_solveCsp_CC__AnnotationTypeDeclaration_TypeGraph_TAnnotationType_TAbstractType_AbstractTypeDeclaration_TPackage_Match_Match() {
		return getAnnotationTypeNested().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeNested__IsApplicable_checkCsp_CC__CSP() {
		return getAnnotationTypeNested().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeNested__CheckDEC_FWD__AnnotationTypeDeclaration_AbstractTypeDeclaration() {
		return getAnnotationTypeNested().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeNested__CheckDEC_BWD__TypeGraph_TAnnotationType_TAbstractType_TPackage() {
		return getAnnotationTypeNested().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeNested__GenerateModel__RuleEntryContainer_TypeToTAbstractType() {
		return getAnnotationTypeNested().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeNested__GenerateModel_solveCsp_BWD__IsApplicableMatch_TypeGraph_TAbstractType_TypeToTAbstractType_AbstractTypeDeclaration_TPackage_ModelgeneratorRuleResult() {
		return getAnnotationTypeNested().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationTypeNested__GenerateModel_checkCsp_BWD__CSP() {
		return getAnnotationTypeNested().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTypeNestedInAnonymous_Abstract() {
		if (typeNestedInAnonymous_AbstractEClass == null) {
			typeNestedInAnonymous_AbstractEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(89);
		}
		return typeNestedInAnonymous_AbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnnotationMemberValueStringArray() {
		if (annotationMemberValueStringArrayEClass == null) {
			annotationMemberValueStringArrayEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(RulesPackage.eNS_URI).getEClassifiers().get(90);
		}
		return annotationMemberValueStringArrayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueStringArray__IsAppropriate_FWD__Match_Annotation_AnnotationMemberValuePair_ArrayInitializer_BodyDeclaration_StringLiteral() {
		return getAnnotationMemberValueStringArray().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueStringArray__Perform_FWD__IsApplicableMatch() {
		return getAnnotationMemberValueStringArray().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueStringArray__IsApplicable_FWD__Match() {
		return getAnnotationMemberValueStringArray().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueStringArray__RegisterObjectsToMatch_FWD__Match_Annotation_AnnotationMemberValuePair_ArrayInitializer_BodyDeclaration_StringLiteral() {
		return getAnnotationMemberValueStringArray().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueStringArray__IsAppropriate_solveCsp_FWD__Match_Annotation_AnnotationMemberValuePair_ArrayInitializer_BodyDeclaration_StringLiteral() {
		return getAnnotationMemberValueStringArray().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueStringArray__IsAppropriate_checkCsp_FWD__CSP() {
		return getAnnotationMemberValueStringArray().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueStringArray__IsApplicable_solveCsp_FWD__IsApplicableMatch_Annotation_AnnotationMemberValuePair_AnnotationMemberValuePairToTAnnotationValue_ArrayInitializer_BodyDeclaration_TAnnotationValue_StringLiteral() {
		return getAnnotationMemberValueStringArray().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueStringArray__IsApplicable_checkCsp_FWD__CSP() {
		return getAnnotationMemberValueStringArray().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueStringArray__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getAnnotationMemberValueStringArray().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueStringArray__CheckTypes_FWD__Match() {
		return getAnnotationMemberValueStringArray().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueStringArray__IsAppropriate_BWD__Match_TTextNode_TAnnotationValue() {
		return getAnnotationMemberValueStringArray().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueStringArray__Perform_BWD__IsApplicableMatch() {
		return getAnnotationMemberValueStringArray().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueStringArray__IsApplicable_BWD__Match() {
		return getAnnotationMemberValueStringArray().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueStringArray__RegisterObjectsToMatch_BWD__Match_TTextNode_TAnnotationValue() {
		return getAnnotationMemberValueStringArray().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueStringArray__IsAppropriate_solveCsp_BWD__Match_TTextNode_TAnnotationValue() {
		return getAnnotationMemberValueStringArray().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueStringArray__IsAppropriate_checkCsp_BWD__CSP() {
		return getAnnotationMemberValueStringArray().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueStringArray__IsApplicable_solveCsp_BWD__IsApplicableMatch_Annotation_AnnotationMemberValuePair_AnnotationMemberValuePairToTAnnotationValue_TTextNode_BodyDeclaration_TAnnotationValue() {
		return getAnnotationMemberValueStringArray().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueStringArray__IsApplicable_checkCsp_BWD__CSP() {
		return getAnnotationMemberValueStringArray().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueStringArray__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getAnnotationMemberValueStringArray().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueStringArray__CheckTypes_BWD__Match() {
		return getAnnotationMemberValueStringArray().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueStringArray__IsAppropriate_BWD_EMoflonEdge_74__EMoflonEdge() {
		return getAnnotationMemberValueStringArray().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueStringArray__IsAppropriate_FWD_EMoflonEdge_77__EMoflonEdge() {
		return getAnnotationMemberValueStringArray().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueStringArray__CheckAttributes_FWD__TripleMatch() {
		return getAnnotationMemberValueStringArray().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueStringArray__CheckAttributes_BWD__TripleMatch() {
		return getAnnotationMemberValueStringArray().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueStringArray__IsApplicable_CC__Match_Match() {
		return getAnnotationMemberValueStringArray().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueStringArray__IsApplicable_solveCsp_CC__Annotation_AnnotationMemberValuePair_ArrayInitializer_TTextNode_BodyDeclaration_TAnnotationValue_StringLiteral_Match_Match() {
		return getAnnotationMemberValueStringArray().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueStringArray__IsApplicable_checkCsp_CC__CSP() {
		return getAnnotationMemberValueStringArray().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueStringArray__CheckDEC_FWD__Annotation_AnnotationMemberValuePair_ArrayInitializer_BodyDeclaration_StringLiteral() {
		return getAnnotationMemberValueStringArray().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueStringArray__CheckDEC_BWD__TTextNode_TAnnotationValue() {
		return getAnnotationMemberValueStringArray().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueStringArray__GenerateModel__RuleEntryContainer_AnnotationMemberValuePairToTAnnotationValue() {
		return getAnnotationMemberValueStringArray().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueStringArray__GenerateModel_solveCsp_BWD__IsApplicableMatch_Annotation_AnnotationMemberValuePair_AnnotationMemberValuePairToTAnnotationValue_BodyDeclaration_TAnnotationValue_ModelgeneratorRuleResult() {
		return getAnnotationMemberValueStringArray().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueStringArray__GenerateModel_checkCsp_BWD__CSP() {
		return getAnnotationMemberValueStringArray().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnnotationMemberValueClass() {
		if (annotationMemberValueClassEClass == null) {
			annotationMemberValueClassEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(91);
		}
		return annotationMemberValueClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueClass__IsAppropriate_FWD__Match_Annotation_TypeAccess_AnnotationMemberValuePair_BodyDeclaration_TypeLiteral_Type() {
		return getAnnotationMemberValueClass().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueClass__Perform_FWD__IsApplicableMatch() {
		return getAnnotationMemberValueClass().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueClass__IsApplicable_FWD__Match() {
		return getAnnotationMemberValueClass().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueClass__RegisterObjectsToMatch_FWD__Match_Annotation_TypeAccess_AnnotationMemberValuePair_BodyDeclaration_TypeLiteral_Type() {
		return getAnnotationMemberValueClass().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueClass__IsAppropriate_solveCsp_FWD__Match_Annotation_TypeAccess_AnnotationMemberValuePair_BodyDeclaration_TypeLiteral_Type() {
		return getAnnotationMemberValueClass().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueClass__IsAppropriate_checkCsp_FWD__CSP() {
		return getAnnotationMemberValueClass().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueClass__IsApplicable_solveCsp_FWD__IsApplicableMatch_Annotation_TypeAccess_AnnotationMemberValuePairToTAnnotationValue_AnnotationMemberValuePair_TAbstractType_TypeToTAbstractType_BodyDeclaration_TypeLiteral_TAnnotationValue_Type() {
		return getAnnotationMemberValueClass().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueClass__IsApplicable_checkCsp_FWD__CSP() {
		return getAnnotationMemberValueClass().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueClass__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getAnnotationMemberValueClass().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueClass__CheckTypes_FWD__Match() {
		return getAnnotationMemberValueClass().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueClass__IsAppropriate_BWD__Match_TAbstractType_TClassNode_TAnnotationValue() {
		return getAnnotationMemberValueClass().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueClass__Perform_BWD__IsApplicableMatch() {
		return getAnnotationMemberValueClass().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueClass__IsApplicable_BWD__Match() {
		return getAnnotationMemberValueClass().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueClass__RegisterObjectsToMatch_BWD__Match_TAbstractType_TClassNode_TAnnotationValue() {
		return getAnnotationMemberValueClass().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueClass__IsAppropriate_solveCsp_BWD__Match_TAbstractType_TClassNode_TAnnotationValue() {
		return getAnnotationMemberValueClass().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueClass__IsAppropriate_checkCsp_BWD__CSP() {
		return getAnnotationMemberValueClass().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueClass__IsApplicable_solveCsp_BWD__IsApplicableMatch_Annotation_AnnotationMemberValuePairToTAnnotationValue_AnnotationMemberValuePair_TAbstractType_TypeToTAbstractType_TClassNode_BodyDeclaration_TAnnotationValue_Type() {
		return getAnnotationMemberValueClass().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueClass__IsApplicable_checkCsp_BWD__CSP() {
		return getAnnotationMemberValueClass().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueClass__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getAnnotationMemberValueClass().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueClass__CheckTypes_BWD__Match() {
		return getAnnotationMemberValueClass().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueClass__IsAppropriate_BWD_EMoflonEdge_75__EMoflonEdge() {
		return getAnnotationMemberValueClass().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueClass__IsAppropriate_FWD_EMoflonEdge_78__EMoflonEdge() {
		return getAnnotationMemberValueClass().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueClass__CheckAttributes_FWD__TripleMatch() {
		return getAnnotationMemberValueClass().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueClass__CheckAttributes_BWD__TripleMatch() {
		return getAnnotationMemberValueClass().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueClass__IsApplicable_CC__Match_Match() {
		return getAnnotationMemberValueClass().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueClass__IsApplicable_solveCsp_CC__Annotation_TypeAccess_AnnotationMemberValuePair_TAbstractType_TClassNode_BodyDeclaration_TypeLiteral_TAnnotationValue_Type_Match_Match() {
		return getAnnotationMemberValueClass().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueClass__IsApplicable_checkCsp_CC__CSP() {
		return getAnnotationMemberValueClass().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueClass__CheckDEC_FWD__Annotation_TypeAccess_AnnotationMemberValuePair_BodyDeclaration_TypeLiteral_Type() {
		return getAnnotationMemberValueClass().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueClass__CheckDEC_BWD__TAbstractType_TClassNode_TAnnotationValue() {
		return getAnnotationMemberValueClass().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueClass__GenerateModel__RuleEntryContainer_AnnotationMemberValuePairToTAnnotationValue_TypeToTAbstractType() {
		return getAnnotationMemberValueClass().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueClass__GenerateModel_solveCsp_BWD__IsApplicableMatch_Annotation_AnnotationMemberValuePairToTAnnotationValue_AnnotationMemberValuePair_TAbstractType_TypeToTAbstractType_BodyDeclaration_TAnnotationValue_Type_ModelgeneratorRuleResult() {
		return getAnnotationMemberValueClass().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueClass__GenerateModel_checkCsp_BWD__CSP() {
		return getAnnotationMemberValueClass().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnonymousClass() {
		if (anonymousClassEClass == null) {
			anonymousClassEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(92);
		}
		return anonymousClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConstructorDefinition() {
		if (constructorDefinitionEClass == null) {
			constructorDefinitionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(93);
		}
		return constructorDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConstructorDefinition__IsAppropriate_FWD__Match_MConstructorDefinition_MMethodSignature() {
		return getConstructorDefinition().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConstructorDefinition__Perform_FWD__IsApplicableMatch() {
		return getConstructorDefinition().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConstructorDefinition__IsApplicable_FWD__Match() {
		return getConstructorDefinition().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConstructorDefinition__RegisterObjectsToMatch_FWD__Match_MConstructorDefinition_MMethodSignature() {
		return getConstructorDefinition().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConstructorDefinition__IsAppropriate_solveCsp_FWD__Match_MConstructorDefinition_MMethodSignature() {
		return getConstructorDefinition().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConstructorDefinition__IsAppropriate_checkCsp_FWD__CSP() {
		return getConstructorDefinition().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConstructorDefinition__IsApplicable_solveCsp_FWD__IsApplicableMatch_MSignatureToTSignature_TMethodSignature_MConstructorDefinition_MMethodSignature() {
		return getConstructorDefinition().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConstructorDefinition__IsApplicable_checkCsp_FWD__CSP() {
		return getConstructorDefinition().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConstructorDefinition__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getConstructorDefinition().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConstructorDefinition__CheckTypes_FWD__Match() {
		return getConstructorDefinition().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConstructorDefinition__IsAppropriate_BWD__Match_TConstructor_TMethodSignature_TMethodDefinition() {
		return getConstructorDefinition().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConstructorDefinition__Perform_BWD__IsApplicableMatch() {
		return getConstructorDefinition().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConstructorDefinition__IsApplicable_BWD__Match() {
		return getConstructorDefinition().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConstructorDefinition__RegisterObjectsToMatch_BWD__Match_TConstructor_TMethodSignature_TMethodDefinition() {
		return getConstructorDefinition().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConstructorDefinition__IsAppropriate_solveCsp_BWD__Match_TConstructor_TMethodSignature_TMethodDefinition() {
		return getConstructorDefinition().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConstructorDefinition__IsAppropriate_checkCsp_BWD__CSP() {
		return getConstructorDefinition().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConstructorDefinition__IsApplicable_solveCsp_BWD__IsApplicableMatch_TConstructor_MSignatureToTSignature_TMethodSignature_TMethodDefinition_MMethodSignature() {
		return getConstructorDefinition().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConstructorDefinition__IsApplicable_checkCsp_BWD__CSP() {
		return getConstructorDefinition().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConstructorDefinition__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getConstructorDefinition().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConstructorDefinition__CheckTypes_BWD__Match() {
		return getConstructorDefinition().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConstructorDefinition__IsAppropriate_BWD_EMoflonEdge_76__EMoflonEdge() {
		return getConstructorDefinition().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConstructorDefinition__IsAppropriate_FWD_EMoflonEdge_79__EMoflonEdge() {
		return getConstructorDefinition().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConstructorDefinition__CheckAttributes_FWD__TripleMatch() {
		return getConstructorDefinition().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConstructorDefinition__CheckAttributes_BWD__TripleMatch() {
		return getConstructorDefinition().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConstructorDefinition__IsApplicable_CC__Match_Match() {
		return getConstructorDefinition().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConstructorDefinition__IsApplicable_solveCsp_CC__TConstructor_TMethodSignature_MConstructorDefinition_TMethodDefinition_MMethodSignature_Match_Match() {
		return getConstructorDefinition().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConstructorDefinition__IsApplicable_checkCsp_CC__CSP() {
		return getConstructorDefinition().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConstructorDefinition__CheckDEC_FWD__MConstructorDefinition_MMethodSignature() {
		return getConstructorDefinition().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConstructorDefinition__CheckDEC_BWD__TConstructor_TMethodSignature_TMethodDefinition() {
		return getConstructorDefinition().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConstructorDefinition__GenerateModel__RuleEntryContainer_MSignatureToTSignature() {
		return getConstructorDefinition().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConstructorDefinition__GenerateModel_solveCsp_BWD__IsApplicableMatch_MSignatureToTSignature_TMethodSignature_MMethodSignature_ModelgeneratorRuleResult() {
		return getConstructorDefinition().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConstructorDefinition__GenerateModel_checkCsp_BWD__CSP() {
		return getConstructorDefinition().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnnotation() {
		if (annotationEClass == null) {
			annotationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI).getEClassifiers()
					.get(94);
		}
		return annotationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotation__IsAppropriate_FWD__Match_Annotation_BodyDeclaration() {
		return getAnnotation().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotation__Perform_FWD__IsApplicableMatch() {
		return getAnnotation().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotation__IsApplicable_FWD__Match() {
		return getAnnotation().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotation__RegisterObjectsToMatch_FWD__Match_Annotation_BodyDeclaration() {
		return getAnnotation().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotation__IsAppropriate_solveCsp_FWD__Match_Annotation_BodyDeclaration() {
		return getAnnotation().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotation__IsAppropriate_checkCsp_FWD__CSP() {
		return getAnnotation().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotation__IsApplicable_solveCsp_FWD__IsApplicableMatch_Annotation_BodyDeclaration_TAnnotatable_ASTNodeToTAnnotatable() {
		return getAnnotation().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotation__IsApplicable_checkCsp_FWD__CSP() {
		return getAnnotation().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotation__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getAnnotation().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotation__CheckTypes_FWD__Match() {
		return getAnnotation().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotation__IsAppropriate_BWD__Match_TAnnotation_TAnnotatable() {
		return getAnnotation().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotation__Perform_BWD__IsApplicableMatch() {
		return getAnnotation().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotation__IsApplicable_BWD__Match() {
		return getAnnotation().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotation__RegisterObjectsToMatch_BWD__Match_TAnnotation_TAnnotatable() {
		return getAnnotation().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotation__IsAppropriate_solveCsp_BWD__Match_TAnnotation_TAnnotatable() {
		return getAnnotation().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotation__IsAppropriate_checkCsp_BWD__CSP() {
		return getAnnotation().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotation__IsApplicable_solveCsp_BWD__IsApplicableMatch_TAnnotation_BodyDeclaration_TAnnotatable_ASTNodeToTAnnotatable() {
		return getAnnotation().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotation__IsApplicable_checkCsp_BWD__CSP() {
		return getAnnotation().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotation__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getAnnotation().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotation__CheckTypes_BWD__Match() {
		return getAnnotation().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotation__IsAppropriate_BWD_EMoflonEdge_77__EMoflonEdge() {
		return getAnnotation().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotation__IsAppropriate_FWD_EMoflonEdge_80__EMoflonEdge() {
		return getAnnotation().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotation__CheckAttributes_FWD__TripleMatch() {
		return getAnnotation().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotation__CheckAttributes_BWD__TripleMatch() {
		return getAnnotation().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotation__IsApplicable_CC__Match_Match() {
		return getAnnotation().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotation__IsApplicable_solveCsp_CC__Annotation_TAnnotation_BodyDeclaration_TAnnotatable_Match_Match() {
		return getAnnotation().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotation__IsApplicable_checkCsp_CC__CSP() {
		return getAnnotation().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotation__CheckDEC_FWD__Annotation_BodyDeclaration() {
		return getAnnotation().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotation__CheckDEC_BWD__TAnnotation_TAnnotatable() {
		return getAnnotation().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotation__GenerateModel__RuleEntryContainer_ASTNodeToTAnnotatable() {
		return getAnnotation().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotation__GenerateModel_solveCsp_BWD__IsApplicableMatch_BodyDeclaration_TAnnotatable_ASTNodeToTAnnotatable_ModelgeneratorRuleResult() {
		return getAnnotation().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotation__GenerateModel_checkCsp_BWD__CSP() {
		return getAnnotation().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEnumConstant() {
		if (enumConstantEClass == null) {
			enumConstantEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI).getEClassifiers()
					.get(95);
		}
		return enumConstantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEnumConstant__IsAppropriate_FWD__Match_MEnumConstantDeclaration_EnumDeclaration() {
		return getEnumConstant().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEnumConstant__Perform_FWD__IsApplicableMatch() {
		return getEnumConstant().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEnumConstant__IsApplicable_FWD__Match() {
		return getEnumConstant().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEnumConstant__RegisterObjectsToMatch_FWD__Match_MEnumConstantDeclaration_EnumDeclaration() {
		return getEnumConstant().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEnumConstant__IsAppropriate_solveCsp_FWD__Match_MEnumConstantDeclaration_EnumDeclaration() {
		return getEnumConstant().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEnumConstant__IsAppropriate_checkCsp_FWD__CSP() {
		return getEnumConstant().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEnumConstant__IsApplicable_solveCsp_FWD__IsApplicableMatch_TypeToTAbstractType_TClass_TypeGraph_MEnumConstantDeclaration_EnumDeclaration() {
		return getEnumConstant().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEnumConstant__IsApplicable_checkCsp_FWD__CSP() {
		return getEnumConstant().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEnumConstant__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getEnumConstant().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEnumConstant__CheckTypes_FWD__Match() {
		return getEnumConstant().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEnumConstant__IsAppropriate_BWD__Match_TField_TFieldDefinition_TClass_TypeGraph_TFieldSignature() {
		return getEnumConstant().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEnumConstant__Perform_BWD__IsApplicableMatch() {
		return getEnumConstant().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEnumConstant__IsApplicable_BWD__Match() {
		return getEnumConstant().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEnumConstant__RegisterObjectsToMatch_BWD__Match_TField_TFieldDefinition_TClass_TypeGraph_TFieldSignature() {
		return getEnumConstant().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEnumConstant__IsAppropriate_solveCsp_BWD__Match_TField_TFieldDefinition_TClass_TypeGraph_TFieldSignature() {
		return getEnumConstant().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEnumConstant__IsAppropriate_checkCsp_BWD__CSP() {
		return getEnumConstant().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEnumConstant__IsApplicable_solveCsp_BWD__IsApplicableMatch_TypeToTAbstractType_TField_TFieldDefinition_TClass_TypeGraph_TFieldSignature_EnumDeclaration() {
		return getEnumConstant().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEnumConstant__IsApplicable_checkCsp_BWD__CSP() {
		return getEnumConstant().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEnumConstant__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getEnumConstant().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEnumConstant__CheckTypes_BWD__Match() {
		return getEnumConstant().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEnumConstant__IsAppropriate_BWD_EMoflonEdge_78__EMoflonEdge() {
		return getEnumConstant().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEnumConstant__IsAppropriate_FWD_EMoflonEdge_81__EMoflonEdge() {
		return getEnumConstant().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEnumConstant__CheckAttributes_FWD__TripleMatch() {
		return getEnumConstant().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEnumConstant__CheckAttributes_BWD__TripleMatch() {
		return getEnumConstant().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEnumConstant__IsApplicable_CC__Match_Match() {
		return getEnumConstant().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEnumConstant__IsApplicable_solveCsp_CC__TField_TFieldDefinition_TClass_TypeGraph_TFieldSignature_MEnumConstantDeclaration_EnumDeclaration_Match_Match() {
		return getEnumConstant().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEnumConstant__IsApplicable_checkCsp_CC__CSP() {
		return getEnumConstant().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEnumConstant__CheckDEC_FWD__MEnumConstantDeclaration_EnumDeclaration() {
		return getEnumConstant().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEnumConstant__CheckDEC_BWD__TField_TFieldDefinition_TClass_TypeGraph_TFieldSignature() {
		return getEnumConstant().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEnumConstant__GenerateModel__RuleEntryContainer_TypeToTAbstractType() {
		return getEnumConstant().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEnumConstant__GenerateModel_solveCsp_BWD__IsApplicableMatch_TypeToTAbstractType_TClass_TypeGraph_EnumDeclaration_ModelgeneratorRuleResult() {
		return getEnumConstant().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEnumConstant__GenerateModel_checkCsp_BWD__CSP() {
		return getEnumConstant().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getClassInstanceCreation() {
		if (classInstanceCreationEClass == null) {
			classInstanceCreationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(96);
		}
		return classInstanceCreationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassInstanceCreation__IsAppropriate_FWD__Match_MClassInstanceCreation_MDefinition() {
		return getClassInstanceCreation().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassInstanceCreation__Perform_FWD__IsApplicableMatch() {
		return getClassInstanceCreation().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassInstanceCreation__IsApplicable_FWD__Match() {
		return getClassInstanceCreation().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassInstanceCreation__RegisterObjectsToMatch_FWD__Match_MClassInstanceCreation_MDefinition() {
		return getClassInstanceCreation().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassInstanceCreation__IsAppropriate_solveCsp_FWD__Match_MClassInstanceCreation_MDefinition() {
		return getClassInstanceCreation().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassInstanceCreation__IsAppropriate_checkCsp_FWD__CSP() {
		return getClassInstanceCreation().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassInstanceCreation__IsApplicable_solveCsp_FWD__IsApplicableMatch_MClassInstanceCreation_MDefinitionToTMember_TMember_MDefinition() {
		return getClassInstanceCreation().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassInstanceCreation__IsApplicable_checkCsp_FWD__CSP() {
		return getClassInstanceCreation().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassInstanceCreation__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getClassInstanceCreation().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassInstanceCreation__CheckTypes_FWD__Match() {
		return getClassInstanceCreation().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassInstanceCreation__IsAppropriate_BWD__Match_TMember_TCall() {
		return getClassInstanceCreation().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassInstanceCreation__Perform_BWD__IsApplicableMatch() {
		return getClassInstanceCreation().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassInstanceCreation__IsApplicable_BWD__Match() {
		return getClassInstanceCreation().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassInstanceCreation__RegisterObjectsToMatch_BWD__Match_TMember_TCall() {
		return getClassInstanceCreation().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassInstanceCreation__IsAppropriate_solveCsp_BWD__Match_TMember_TCall() {
		return getClassInstanceCreation().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassInstanceCreation__IsAppropriate_checkCsp_BWD__CSP() {
		return getClassInstanceCreation().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassInstanceCreation__IsApplicable_solveCsp_BWD__IsApplicableMatch_MDefinitionToTMember_TMember_TCall_MDefinition() {
		return getClassInstanceCreation().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassInstanceCreation__IsApplicable_checkCsp_BWD__CSP() {
		return getClassInstanceCreation().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassInstanceCreation__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getClassInstanceCreation().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassInstanceCreation__CheckTypes_BWD__Match() {
		return getClassInstanceCreation().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassInstanceCreation__IsAppropriate_BWD_EMoflonEdge_79__EMoflonEdge() {
		return getClassInstanceCreation().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassInstanceCreation__IsAppropriate_FWD_EMoflonEdge_82__EMoflonEdge() {
		return getClassInstanceCreation().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassInstanceCreation__CheckAttributes_FWD__TripleMatch() {
		return getClassInstanceCreation().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassInstanceCreation__CheckAttributes_BWD__TripleMatch() {
		return getClassInstanceCreation().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassInstanceCreation__IsApplicable_CC__Match_Match() {
		return getClassInstanceCreation().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassInstanceCreation__IsApplicable_solveCsp_CC__MClassInstanceCreation_TMember_TCall_MDefinition_Match_Match() {
		return getClassInstanceCreation().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassInstanceCreation__IsApplicable_checkCsp_CC__CSP() {
		return getClassInstanceCreation().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassInstanceCreation__CheckDEC_FWD__MClassInstanceCreation_MDefinition() {
		return getClassInstanceCreation().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassInstanceCreation__CheckDEC_BWD__TMember_TCall() {
		return getClassInstanceCreation().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassInstanceCreation__GenerateModel__RuleEntryContainer_MDefinitionToTMember() {
		return getClassInstanceCreation().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassInstanceCreation__GenerateModel_solveCsp_BWD__IsApplicableMatch_MDefinitionToTMember_TMember_MDefinition_ModelgeneratorRuleResult() {
		return getClassInstanceCreation().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassInstanceCreation__GenerateModel_checkCsp_BWD__CSP() {
		return getClassInstanceCreation().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getArrayInitializerIgnoreExpressionsEdge() {
		if (arrayInitializerIgnoreExpressionsEdgeEClass == null) {
			arrayInitializerIgnoreExpressionsEdgeEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(RulesPackage.eNS_URI).getEClassifiers().get(97);
		}
		return arrayInitializerIgnoreExpressionsEdgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getArrayInitializerIgnoreExpressionsEdge__IsAppropriate_FWD__Match_ArrayInitializer_MethodInvocation() {
		return getArrayInitializerIgnoreExpressionsEdge().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getArrayInitializerIgnoreExpressionsEdge__Perform_FWD__IsApplicableMatch() {
		return getArrayInitializerIgnoreExpressionsEdge().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getArrayInitializerIgnoreExpressionsEdge__IsApplicable_FWD__Match() {
		return getArrayInitializerIgnoreExpressionsEdge().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getArrayInitializerIgnoreExpressionsEdge__RegisterObjectsToMatch_FWD__Match_ArrayInitializer_MethodInvocation() {
		return getArrayInitializerIgnoreExpressionsEdge().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getArrayInitializerIgnoreExpressionsEdge__IsAppropriate_solveCsp_FWD__Match_ArrayInitializer_MethodInvocation() {
		return getArrayInitializerIgnoreExpressionsEdge().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getArrayInitializerIgnoreExpressionsEdge__IsAppropriate_checkCsp_FWD__CSP() {
		return getArrayInitializerIgnoreExpressionsEdge().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getArrayInitializerIgnoreExpressionsEdge__IsApplicable_solveCsp_FWD__IsApplicableMatch_ArrayInitializer_MethodInvocation() {
		return getArrayInitializerIgnoreExpressionsEdge().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getArrayInitializerIgnoreExpressionsEdge__IsApplicable_checkCsp_FWD__CSP() {
		return getArrayInitializerIgnoreExpressionsEdge().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getArrayInitializerIgnoreExpressionsEdge__RegisterObjects_FWD__PerformRuleResult_EObject_EObject() {
		return getArrayInitializerIgnoreExpressionsEdge().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getArrayInitializerIgnoreExpressionsEdge__CheckTypes_FWD__Match() {
		return getArrayInitializerIgnoreExpressionsEdge().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getArrayInitializerIgnoreExpressionsEdge__IsAppropriate_BWD__Match() {
		return getArrayInitializerIgnoreExpressionsEdge().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getArrayInitializerIgnoreExpressionsEdge__Perform_BWD__IsApplicableMatch() {
		return getArrayInitializerIgnoreExpressionsEdge().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getArrayInitializerIgnoreExpressionsEdge__IsApplicable_BWD__Match() {
		return getArrayInitializerIgnoreExpressionsEdge().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getArrayInitializerIgnoreExpressionsEdge__RegisterObjectsToMatch_BWD__Match() {
		return getArrayInitializerIgnoreExpressionsEdge().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getArrayInitializerIgnoreExpressionsEdge__IsAppropriate_solveCsp_BWD__Match() {
		return getArrayInitializerIgnoreExpressionsEdge().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getArrayInitializerIgnoreExpressionsEdge__IsAppropriate_checkCsp_BWD__CSP() {
		return getArrayInitializerIgnoreExpressionsEdge().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getArrayInitializerIgnoreExpressionsEdge__CheckTypes_BWD__Match() {
		return getArrayInitializerIgnoreExpressionsEdge().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getArrayInitializerIgnoreExpressionsEdge__IsAppropriate_FWD_EMoflonEdge_83__EMoflonEdge() {
		return getArrayInitializerIgnoreExpressionsEdge().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getArrayInitializerIgnoreExpressionsEdge__CheckAttributes_FWD__TripleMatch() {
		return getArrayInitializerIgnoreExpressionsEdge().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getArrayInitializerIgnoreExpressionsEdge__CheckAttributes_BWD__TripleMatch() {
		return getArrayInitializerIgnoreExpressionsEdge().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getArrayInitializerIgnoreExpressionsEdge__IsApplicable_CC__Match_Match() {
		return getArrayInitializerIgnoreExpressionsEdge().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getArrayInitializerIgnoreExpressionsEdge__IsApplicable_solveCsp_CC__ArrayInitializer_MethodInvocation_Match_Match() {
		return getArrayInitializerIgnoreExpressionsEdge().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getArrayInitializerIgnoreExpressionsEdge__IsApplicable_checkCsp_CC__CSP() {
		return getArrayInitializerIgnoreExpressionsEdge().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getArrayInitializerIgnoreExpressionsEdge__CheckDEC_FWD__ArrayInitializer_MethodInvocation() {
		return getArrayInitializerIgnoreExpressionsEdge().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getArrayInitializerIgnoreExpressionsEdge__CheckDEC_BWD() {
		return getArrayInitializerIgnoreExpressionsEdge().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getArrayInitializerIgnoreExpressionsEdge__GenerateModel__RuleEntryContainer_ArrayInitializer_MethodInvocation() {
		return getArrayInitializerIgnoreExpressionsEdge().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getArrayInitializerIgnoreExpressionsEdge__GenerateModel_solveCsp_BWD__IsApplicableMatch_ArrayInitializer_MethodInvocation_ModelgeneratorRuleResult() {
		return getArrayInitializerIgnoreExpressionsEdge().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getArrayInitializerIgnoreExpressionsEdge__GenerateModel_checkCsp_BWD__CSP() {
		return getArrayInitializerIgnoreExpressionsEdge().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnnotationMemberValueAnnotation() {
		if (annotationMemberValueAnnotationEClass == null) {
			annotationMemberValueAnnotationEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(RulesPackage.eNS_URI).getEClassifiers().get(98);
		}
		return annotationMemberValueAnnotationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueAnnotation__IsAppropriate_FWD__Match_Annotation_AnnotationMemberValuePair_BodyDeclaration_Annotation() {
		return getAnnotationMemberValueAnnotation().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueAnnotation__Perform_FWD__IsApplicableMatch() {
		return getAnnotationMemberValueAnnotation().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueAnnotation__IsApplicable_FWD__Match() {
		return getAnnotationMemberValueAnnotation().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueAnnotation__RegisterObjectsToMatch_FWD__Match_Annotation_AnnotationMemberValuePair_BodyDeclaration_Annotation() {
		return getAnnotationMemberValueAnnotation().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueAnnotation__IsAppropriate_solveCsp_FWD__Match_Annotation_AnnotationMemberValuePair_BodyDeclaration_Annotation() {
		return getAnnotationMemberValueAnnotation().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueAnnotation__IsAppropriate_checkCsp_FWD__CSP() {
		return getAnnotationMemberValueAnnotation().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueAnnotation__IsApplicable_solveCsp_FWD__IsApplicableMatch_Annotation_AnnotationMemberValuePairToTAnnotationValue_AnnotationMemberValuePair_BodyDeclaration_TAnnotationValue_Annotation() {
		return getAnnotationMemberValueAnnotation().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueAnnotation__IsApplicable_checkCsp_FWD__CSP() {
		return getAnnotationMemberValueAnnotation().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueAnnotation__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getAnnotationMemberValueAnnotation().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueAnnotation__CheckTypes_FWD__Match() {
		return getAnnotationMemberValueAnnotation().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueAnnotation__IsAppropriate_BWD__Match_TAnnotation_TAnnotationValue() {
		return getAnnotationMemberValueAnnotation().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueAnnotation__Perform_BWD__IsApplicableMatch() {
		return getAnnotationMemberValueAnnotation().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueAnnotation__IsApplicable_BWD__Match() {
		return getAnnotationMemberValueAnnotation().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueAnnotation__RegisterObjectsToMatch_BWD__Match_TAnnotation_TAnnotationValue() {
		return getAnnotationMemberValueAnnotation().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueAnnotation__IsAppropriate_solveCsp_BWD__Match_TAnnotation_TAnnotationValue() {
		return getAnnotationMemberValueAnnotation().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueAnnotation__IsAppropriate_checkCsp_BWD__CSP() {
		return getAnnotationMemberValueAnnotation().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueAnnotation__IsApplicable_solveCsp_BWD__IsApplicableMatch_Annotation_AnnotationMemberValuePairToTAnnotationValue_AnnotationMemberValuePair_TAnnotation_BodyDeclaration_TAnnotationValue() {
		return getAnnotationMemberValueAnnotation().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueAnnotation__IsApplicable_checkCsp_BWD__CSP() {
		return getAnnotationMemberValueAnnotation().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueAnnotation__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getAnnotationMemberValueAnnotation().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueAnnotation__CheckTypes_BWD__Match() {
		return getAnnotationMemberValueAnnotation().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueAnnotation__IsAppropriate_BWD_EMoflonEdge_80__EMoflonEdge() {
		return getAnnotationMemberValueAnnotation().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueAnnotation__IsAppropriate_FWD_EMoflonEdge_84__EMoflonEdge() {
		return getAnnotationMemberValueAnnotation().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueAnnotation__CheckAttributes_FWD__TripleMatch() {
		return getAnnotationMemberValueAnnotation().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueAnnotation__CheckAttributes_BWD__TripleMatch() {
		return getAnnotationMemberValueAnnotation().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueAnnotation__IsApplicable_CC__Match_Match() {
		return getAnnotationMemberValueAnnotation().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueAnnotation__IsApplicable_solveCsp_CC__Annotation_AnnotationMemberValuePair_TAnnotation_BodyDeclaration_TAnnotationValue_Annotation_Match_Match() {
		return getAnnotationMemberValueAnnotation().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueAnnotation__IsApplicable_checkCsp_CC__CSP() {
		return getAnnotationMemberValueAnnotation().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueAnnotation__CheckDEC_FWD__Annotation_AnnotationMemberValuePair_BodyDeclaration_Annotation() {
		return getAnnotationMemberValueAnnotation().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueAnnotation__CheckDEC_BWD__TAnnotation_TAnnotationValue() {
		return getAnnotationMemberValueAnnotation().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueAnnotation__GenerateModel__RuleEntryContainer_AnnotationMemberValuePairToTAnnotationValue() {
		return getAnnotationMemberValueAnnotation().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueAnnotation__GenerateModel_solveCsp_BWD__IsApplicableMatch_Annotation_AnnotationMemberValuePairToTAnnotationValue_AnnotationMemberValuePair_BodyDeclaration_TAnnotationValue_ModelgeneratorRuleResult() {
		return getAnnotationMemberValueAnnotation().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnnotationMemberValueAnnotation__GenerateModel_checkCsp_BWD__CSP() {
		return getAnnotationMemberValueAnnotation().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTypesVisibility() {
		if (typesVisibilityEClass == null) {
			typesVisibilityEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(99);
		}
		return typesVisibilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypesVisibility__IsAppropriate_FWD__Match_Modifier_AbstractTypeDeclaration() {
		return getTypesVisibility().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypesVisibility__Perform_FWD__IsApplicableMatch() {
		return getTypesVisibility().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypesVisibility__IsApplicable_FWD__Match() {
		return getTypesVisibility().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypesVisibility__RegisterObjectsToMatch_FWD__Match_Modifier_AbstractTypeDeclaration() {
		return getTypesVisibility().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypesVisibility__IsAppropriate_solveCsp_FWD__Match_Modifier_AbstractTypeDeclaration() {
		return getTypesVisibility().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypesVisibility__IsAppropriate_checkCsp_FWD__CSP() {
		return getTypesVisibility().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypesVisibility__IsApplicable_solveCsp_FWD__IsApplicableMatch_Modifier_AbstractTypeDeclaration_TAbstractType_TypeToTAbstractType() {
		return getTypesVisibility().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypesVisibility__IsApplicable_checkCsp_FWD__CSP() {
		return getTypesVisibility().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypesVisibility__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getTypesVisibility().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypesVisibility__CheckTypes_FWD__Match() {
		return getTypesVisibility().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypesVisibility__IsAppropriate_BWD__Match_TModifier_TAbstractType() {
		return getTypesVisibility().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypesVisibility__Perform_BWD__IsApplicableMatch() {
		return getTypesVisibility().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypesVisibility__IsApplicable_BWD__Match() {
		return getTypesVisibility().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypesVisibility__RegisterObjectsToMatch_BWD__Match_TModifier_TAbstractType() {
		return getTypesVisibility().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypesVisibility__IsAppropriate_solveCsp_BWD__Match_TModifier_TAbstractType() {
		return getTypesVisibility().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypesVisibility__IsAppropriate_checkCsp_BWD__CSP() {
		return getTypesVisibility().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypesVisibility__IsApplicable_solveCsp_BWD__IsApplicableMatch_TModifier_AbstractTypeDeclaration_TAbstractType_TypeToTAbstractType() {
		return getTypesVisibility().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypesVisibility__IsApplicable_checkCsp_BWD__CSP() {
		return getTypesVisibility().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypesVisibility__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getTypesVisibility().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypesVisibility__CheckTypes_BWD__Match() {
		return getTypesVisibility().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypesVisibility__IsAppropriate_BWD_EMoflonEdge_81__EMoflonEdge() {
		return getTypesVisibility().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypesVisibility__IsAppropriate_FWD_EMoflonEdge_85__EMoflonEdge() {
		return getTypesVisibility().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypesVisibility__CheckAttributes_FWD__TripleMatch() {
		return getTypesVisibility().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypesVisibility__CheckAttributes_BWD__TripleMatch() {
		return getTypesVisibility().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypesVisibility__IsApplicable_CC__Match_Match() {
		return getTypesVisibility().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypesVisibility__IsApplicable_solveCsp_CC__Modifier_TModifier_AbstractTypeDeclaration_TAbstractType_Match_Match() {
		return getTypesVisibility().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypesVisibility__IsApplicable_checkCsp_CC__CSP() {
		return getTypesVisibility().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypesVisibility__CheckDEC_FWD__Modifier_AbstractTypeDeclaration() {
		return getTypesVisibility().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypesVisibility__CheckDEC_BWD__TModifier_TAbstractType() {
		return getTypesVisibility().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypesVisibility__GenerateModel__RuleEntryContainer_TypeToTAbstractType() {
		return getTypesVisibility().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypesVisibility__GenerateModel_solveCsp_BWD__IsApplicableMatch_AbstractTypeDeclaration_TAbstractType_TypeToTAbstractType_ModelgeneratorRuleResult() {
		return getTypesVisibility().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTypesVisibility__GenerateModel_checkCsp_BWD__CSP() {
		return getTypesVisibility().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAbstractMethodDefinition() {
		if (abstractMethodDefinitionEClass == null) {
			abstractMethodDefinitionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(100);
		}
		return abstractMethodDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPrimitiveTypeIsLong() {
		if (primitiveTypeIsLongEClass == null) {
			primitiveTypeIsLongEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(101);
		}
		return primitiveTypeIsLongEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsLong__IsAppropriate_FWD__Match_PrimitiveTypeLong_Model() {
		return getPrimitiveTypeIsLong().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsLong__Perform_FWD__IsApplicableMatch() {
		return getPrimitiveTypeIsLong().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsLong__IsApplicable_FWD__Match() {
		return getPrimitiveTypeIsLong().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsLong__RegisterObjectsToMatch_FWD__Match_PrimitiveTypeLong_Model() {
		return getPrimitiveTypeIsLong().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsLong__IsAppropriate_solveCsp_FWD__Match_PrimitiveTypeLong_Model() {
		return getPrimitiveTypeIsLong().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsLong__IsAppropriate_checkCsp_FWD__CSP() {
		return getPrimitiveTypeIsLong().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsLong__IsApplicable_solveCsp_FWD__IsApplicableMatch_PrimitiveTypeLong_ModelToTypeGraph_TypeGraph_Model() {
		return getPrimitiveTypeIsLong().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsLong__IsApplicable_checkCsp_FWD__CSP() {
		return getPrimitiveTypeIsLong().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsLong__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getPrimitiveTypeIsLong().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsLong__CheckTypes_FWD__Match() {
		return getPrimitiveTypeIsLong().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsLong__IsAppropriate_BWD__Match_TypeGraph_TClass() {
		return getPrimitiveTypeIsLong().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsLong__Perform_BWD__IsApplicableMatch() {
		return getPrimitiveTypeIsLong().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsLong__IsApplicable_BWD__Match() {
		return getPrimitiveTypeIsLong().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsLong__RegisterObjectsToMatch_BWD__Match_TypeGraph_TClass() {
		return getPrimitiveTypeIsLong().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsLong__IsAppropriate_solveCsp_BWD__Match_TypeGraph_TClass() {
		return getPrimitiveTypeIsLong().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsLong__IsAppropriate_checkCsp_BWD__CSP() {
		return getPrimitiveTypeIsLong().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsLong__IsApplicable_solveCsp_BWD__IsApplicableMatch_ModelToTypeGraph_TypeGraph_TClass_Model() {
		return getPrimitiveTypeIsLong().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsLong__IsApplicable_checkCsp_BWD__CSP() {
		return getPrimitiveTypeIsLong().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsLong__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getPrimitiveTypeIsLong().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsLong__CheckTypes_BWD__Match() {
		return getPrimitiveTypeIsLong().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsLong__IsAppropriate_BWD_EMoflonEdge_82__EMoflonEdge() {
		return getPrimitiveTypeIsLong().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsLong__IsAppropriate_FWD_EMoflonEdge_86__EMoflonEdge() {
		return getPrimitiveTypeIsLong().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsLong__CheckAttributes_FWD__TripleMatch() {
		return getPrimitiveTypeIsLong().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsLong__CheckAttributes_BWD__TripleMatch() {
		return getPrimitiveTypeIsLong().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsLong__IsApplicable_CC__Match_Match() {
		return getPrimitiveTypeIsLong().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsLong__IsApplicable_solveCsp_CC__PrimitiveTypeLong_TypeGraph_TClass_Model_Match_Match() {
		return getPrimitiveTypeIsLong().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsLong__IsApplicable_checkCsp_CC__CSP() {
		return getPrimitiveTypeIsLong().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsLong__CheckDEC_FWD__PrimitiveTypeLong_Model() {
		return getPrimitiveTypeIsLong().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsLong__CheckDEC_BWD__TypeGraph_TClass() {
		return getPrimitiveTypeIsLong().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsLong__GenerateModel__RuleEntryContainer_ModelToTypeGraph() {
		return getPrimitiveTypeIsLong().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsLong__GenerateModel_solveCsp_BWD__IsApplicableMatch_ModelToTypeGraph_TypeGraph_Model_ModelgeneratorRuleResult() {
		return getPrimitiveTypeIsLong().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsLong__GenerateModel_checkCsp_BWD__CSP() {
		return getPrimitiveTypeIsLong().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNestedInterfaceInType() {
		if (nestedInterfaceInTypeEClass == null) {
			nestedInterfaceInTypeEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(102);
		}
		return nestedInterfaceInTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNestedInterfaceInType__IsAppropriate_FWD__Match_InterfaceDeclaration_AbstractTypeDeclaration() {
		return getNestedInterfaceInType().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNestedInterfaceInType__Perform_FWD__IsApplicableMatch() {
		return getNestedInterfaceInType().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNestedInterfaceInType__IsApplicable_FWD__Match() {
		return getNestedInterfaceInType().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNestedInterfaceInType__RegisterObjectsToMatch_FWD__Match_InterfaceDeclaration_AbstractTypeDeclaration() {
		return getNestedInterfaceInType().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNestedInterfaceInType__IsAppropriate_solveCsp_FWD__Match_InterfaceDeclaration_AbstractTypeDeclaration() {
		return getNestedInterfaceInType().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNestedInterfaceInType__IsAppropriate_checkCsp_FWD__CSP() {
		return getNestedInterfaceInType().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNestedInterfaceInType__IsApplicable_solveCsp_FWD__IsApplicableMatch_InterfaceDeclaration_TypeGraph_TAbstractType_TypeToTAbstractType_AbstractTypeDeclaration_TPackage() {
		return getNestedInterfaceInType().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNestedInterfaceInType__IsApplicable_checkCsp_FWD__CSP() {
		return getNestedInterfaceInType().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNestedInterfaceInType__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getNestedInterfaceInType().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNestedInterfaceInType__CheckTypes_FWD__Match() {
		return getNestedInterfaceInType().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNestedInterfaceInType__IsAppropriate_BWD__Match_TypeGraph_TInterface_TAbstractType_TPackage() {
		return getNestedInterfaceInType().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNestedInterfaceInType__Perform_BWD__IsApplicableMatch() {
		return getNestedInterfaceInType().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNestedInterfaceInType__IsApplicable_BWD__Match() {
		return getNestedInterfaceInType().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNestedInterfaceInType__RegisterObjectsToMatch_BWD__Match_TypeGraph_TInterface_TAbstractType_TPackage() {
		return getNestedInterfaceInType().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNestedInterfaceInType__IsAppropriate_solveCsp_BWD__Match_TypeGraph_TInterface_TAbstractType_TPackage() {
		return getNestedInterfaceInType().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNestedInterfaceInType__IsAppropriate_checkCsp_BWD__CSP() {
		return getNestedInterfaceInType().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNestedInterfaceInType__IsApplicable_solveCsp_BWD__IsApplicableMatch_TypeGraph_TInterface_TAbstractType_TypeToTAbstractType_AbstractTypeDeclaration_TPackage() {
		return getNestedInterfaceInType().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNestedInterfaceInType__IsApplicable_checkCsp_BWD__CSP() {
		return getNestedInterfaceInType().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNestedInterfaceInType__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getNestedInterfaceInType().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNestedInterfaceInType__CheckTypes_BWD__Match() {
		return getNestedInterfaceInType().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNestedInterfaceInType__IsAppropriate_BWD_EMoflonEdge_83__EMoflonEdge() {
		return getNestedInterfaceInType().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNestedInterfaceInType__IsAppropriate_FWD_EMoflonEdge_87__EMoflonEdge() {
		return getNestedInterfaceInType().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNestedInterfaceInType__CheckAttributes_FWD__TripleMatch() {
		return getNestedInterfaceInType().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNestedInterfaceInType__CheckAttributes_BWD__TripleMatch() {
		return getNestedInterfaceInType().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNestedInterfaceInType__IsApplicable_CC__Match_Match() {
		return getNestedInterfaceInType().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNestedInterfaceInType__IsApplicable_solveCsp_CC__InterfaceDeclaration_TypeGraph_TInterface_TAbstractType_AbstractTypeDeclaration_TPackage_Match_Match() {
		return getNestedInterfaceInType().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNestedInterfaceInType__IsApplicable_checkCsp_CC__CSP() {
		return getNestedInterfaceInType().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNestedInterfaceInType__CheckDEC_FWD__InterfaceDeclaration_AbstractTypeDeclaration() {
		return getNestedInterfaceInType().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNestedInterfaceInType__CheckDEC_BWD__TypeGraph_TInterface_TAbstractType_TPackage() {
		return getNestedInterfaceInType().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNestedInterfaceInType__GenerateModel__RuleEntryContainer_TypeToTAbstractType() {
		return getNestedInterfaceInType().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNestedInterfaceInType__GenerateModel_solveCsp_BWD__IsApplicableMatch_TypeGraph_TAbstractType_TypeToTAbstractType_AbstractTypeDeclaration_TPackage_ModelgeneratorRuleResult() {
		return getNestedInterfaceInType().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNestedInterfaceInType__GenerateModel_checkCsp_BWD__CSP() {
		return getNestedInterfaceInType().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFlowNode() {
		if (flowNodeEClass == null) {
			flowNodeEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI).getEClassifiers()
					.get(103);
		}
		return flowNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFlowNode__IsAppropriate_FWD__Match_MAbstractFlowElement_MFlow() {
		return getFlowNode().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFlowNode__Perform_FWD__IsApplicableMatch() {
		return getFlowNode().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFlowNode__IsApplicable_FWD__Match() {
		return getFlowNode().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFlowNode__RegisterObjectsToMatch_FWD__Match_MAbstractFlowElement_MFlow() {
		return getFlowNode().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFlowNode__IsAppropriate_solveCsp_FWD__Match_MAbstractFlowElement_MFlow() {
		return getFlowNode().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFlowNode__IsAppropriate_checkCsp_FWD__CSP() {
		return getFlowNode().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFlowNode__IsApplicable_solveCsp_FWD__IsApplicableMatch_MAbstractFlowElement_MFlow_TAbstractFlowElement_MAbstractFlowElementToTAbstractFlowElement() {
		return getFlowNode().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFlowNode__IsApplicable_checkCsp_FWD__CSP() {
		return getFlowNode().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFlowNode__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getFlowNode().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFlowNode__CheckTypes_FWD__Match() {
		return getFlowNode().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFlowNode__IsAppropriate_BWD__Match_TFlow_TAbstractFlowElement() {
		return getFlowNode().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFlowNode__Perform_BWD__IsApplicableMatch() {
		return getFlowNode().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFlowNode__IsApplicable_BWD__Match() {
		return getFlowNode().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFlowNode__RegisterObjectsToMatch_BWD__Match_TFlow_TAbstractFlowElement() {
		return getFlowNode().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFlowNode__IsAppropriate_solveCsp_BWD__Match_TFlow_TAbstractFlowElement() {
		return getFlowNode().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFlowNode__IsAppropriate_checkCsp_BWD__CSP() {
		return getFlowNode().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFlowNode__IsApplicable_solveCsp_BWD__IsApplicableMatch_MAbstractFlowElement_TFlow_TAbstractFlowElement_MAbstractFlowElementToTAbstractFlowElement() {
		return getFlowNode().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFlowNode__IsApplicable_checkCsp_BWD__CSP() {
		return getFlowNode().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFlowNode__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getFlowNode().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFlowNode__CheckTypes_BWD__Match() {
		return getFlowNode().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFlowNode__IsAppropriate_BWD_EMoflonEdge_84__EMoflonEdge() {
		return getFlowNode().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFlowNode__IsAppropriate_FWD_EMoflonEdge_88__EMoflonEdge() {
		return getFlowNode().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFlowNode__CheckAttributes_FWD__TripleMatch() {
		return getFlowNode().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFlowNode__CheckAttributes_BWD__TripleMatch() {
		return getFlowNode().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFlowNode__IsApplicable_CC__Match_Match() {
		return getFlowNode().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFlowNode__IsApplicable_solveCsp_CC__MAbstractFlowElement_TFlow_MFlow_TAbstractFlowElement_Match_Match() {
		return getFlowNode().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFlowNode__IsApplicable_checkCsp_CC__CSP() {
		return getFlowNode().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFlowNode__CheckDEC_FWD__MAbstractFlowElement_MFlow() {
		return getFlowNode().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFlowNode__CheckDEC_BWD__TFlow_TAbstractFlowElement() {
		return getFlowNode().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFlowNode__GenerateModel__RuleEntryContainer_MAbstractFlowElementToTAbstractFlowElement() {
		return getFlowNode().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFlowNode__GenerateModel_solveCsp_BWD__IsApplicableMatch_MAbstractFlowElement_TAbstractFlowElement_MAbstractFlowElementToTAbstractFlowElement_ModelgeneratorRuleResult() {
		return getFlowNode().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFlowNode__GenerateModel_checkCsp_BWD__CSP() {
		return getFlowNode().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPrimitiveTypeIsInt() {
		if (primitiveTypeIsIntEClass == null) {
			primitiveTypeIsIntEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(104);
		}
		return primitiveTypeIsIntEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsInt__IsAppropriate_FWD__Match_PrimitiveTypeInt_Model() {
		return getPrimitiveTypeIsInt().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsInt__Perform_FWD__IsApplicableMatch() {
		return getPrimitiveTypeIsInt().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsInt__IsApplicable_FWD__Match() {
		return getPrimitiveTypeIsInt().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsInt__RegisterObjectsToMatch_FWD__Match_PrimitiveTypeInt_Model() {
		return getPrimitiveTypeIsInt().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsInt__IsAppropriate_solveCsp_FWD__Match_PrimitiveTypeInt_Model() {
		return getPrimitiveTypeIsInt().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsInt__IsAppropriate_checkCsp_FWD__CSP() {
		return getPrimitiveTypeIsInt().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsInt__IsApplicable_solveCsp_FWD__IsApplicableMatch_PrimitiveTypeInt_ModelToTypeGraph_TypeGraph_Model() {
		return getPrimitiveTypeIsInt().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsInt__IsApplicable_checkCsp_FWD__CSP() {
		return getPrimitiveTypeIsInt().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsInt__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getPrimitiveTypeIsInt().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsInt__CheckTypes_FWD__Match() {
		return getPrimitiveTypeIsInt().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsInt__IsAppropriate_BWD__Match_TypeGraph_TClass() {
		return getPrimitiveTypeIsInt().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsInt__Perform_BWD__IsApplicableMatch() {
		return getPrimitiveTypeIsInt().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsInt__IsApplicable_BWD__Match() {
		return getPrimitiveTypeIsInt().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsInt__RegisterObjectsToMatch_BWD__Match_TypeGraph_TClass() {
		return getPrimitiveTypeIsInt().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsInt__IsAppropriate_solveCsp_BWD__Match_TypeGraph_TClass() {
		return getPrimitiveTypeIsInt().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsInt__IsAppropriate_checkCsp_BWD__CSP() {
		return getPrimitiveTypeIsInt().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsInt__IsApplicable_solveCsp_BWD__IsApplicableMatch_ModelToTypeGraph_TypeGraph_TClass_Model() {
		return getPrimitiveTypeIsInt().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsInt__IsApplicable_checkCsp_BWD__CSP() {
		return getPrimitiveTypeIsInt().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsInt__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getPrimitiveTypeIsInt().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsInt__CheckTypes_BWD__Match() {
		return getPrimitiveTypeIsInt().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsInt__IsAppropriate_BWD_EMoflonEdge_85__EMoflonEdge() {
		return getPrimitiveTypeIsInt().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsInt__IsAppropriate_FWD_EMoflonEdge_89__EMoflonEdge() {
		return getPrimitiveTypeIsInt().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsInt__CheckAttributes_FWD__TripleMatch() {
		return getPrimitiveTypeIsInt().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsInt__CheckAttributes_BWD__TripleMatch() {
		return getPrimitiveTypeIsInt().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsInt__IsApplicable_CC__Match_Match() {
		return getPrimitiveTypeIsInt().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsInt__IsApplicable_solveCsp_CC__PrimitiveTypeInt_TypeGraph_TClass_Model_Match_Match() {
		return getPrimitiveTypeIsInt().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsInt__IsApplicable_checkCsp_CC__CSP() {
		return getPrimitiveTypeIsInt().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsInt__CheckDEC_FWD__PrimitiveTypeInt_Model() {
		return getPrimitiveTypeIsInt().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsInt__CheckDEC_BWD__TypeGraph_TClass() {
		return getPrimitiveTypeIsInt().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsInt__GenerateModel__RuleEntryContainer_ModelToTypeGraph() {
		return getPrimitiveTypeIsInt().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsInt__GenerateModel_solveCsp_BWD__IsApplicableMatch_ModelToTypeGraph_TypeGraph_Model_ModelgeneratorRuleResult() {
		return getPrimitiveTypeIsInt().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypeIsInt__GenerateModel_checkCsp_BWD__CSP() {
		return getPrimitiveTypeIsInt().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getClassImplementsInterface_Abstract() {
		if (classImplementsInterface_AbstractEClass == null) {
			classImplementsInterface_AbstractEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(RulesPackage.eNS_URI).getEClassifiers().get(105);
		}
		return classImplementsInterface_AbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getClassInnerAnonClassMember() {
		if (classInnerAnonClassMemberEClass == null) {
			classInnerAnonClassMemberEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(106);
		}
		return classInnerAnonClassMemberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassInnerAnonClassMember__IsAppropriate_FWD__Match_MClass_AnonymousClassDeclaration_MAbstractMethodDefinition() {
		return getClassInnerAnonClassMember().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassInnerAnonClassMember__Perform_FWD__IsApplicableMatch() {
		return getClassInnerAnonClassMember().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassInnerAnonClassMember__IsApplicable_FWD__Match() {
		return getClassInnerAnonClassMember().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassInnerAnonClassMember__RegisterObjectsToMatch_FWD__Match_MClass_AnonymousClassDeclaration_MAbstractMethodDefinition() {
		return getClassInnerAnonClassMember().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassInnerAnonClassMember__IsAppropriate_solveCsp_FWD__Match_MClass_AnonymousClassDeclaration_MAbstractMethodDefinition() {
		return getClassInnerAnonClassMember().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassInnerAnonClassMember__IsAppropriate_checkCsp_FWD__CSP() {
		return getClassInnerAnonClassMember().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassInnerAnonClassMember__IsApplicable_solveCsp_FWD__IsApplicableMatch_TPackage_MClass_TypeGraph_AnonymousClassDeclaration_MAbstractMethodDefinition_TClass_AnonymousClassDeclarationToTClass() {
		return getClassInnerAnonClassMember().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassInnerAnonClassMember__IsApplicable_checkCsp_FWD__CSP() {
		return getClassInnerAnonClassMember().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassInnerAnonClassMember__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getClassInnerAnonClassMember().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassInnerAnonClassMember__CheckTypes_FWD__Match() {
		return getClassInnerAnonClassMember().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassInnerAnonClassMember__IsAppropriate_BWD__Match_TPackage_TypeGraph_TClass_TClass() {
		return getClassInnerAnonClassMember().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassInnerAnonClassMember__Perform_BWD__IsApplicableMatch() {
		return getClassInnerAnonClassMember().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassInnerAnonClassMember__IsApplicable_BWD__Match() {
		return getClassInnerAnonClassMember().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassInnerAnonClassMember__RegisterObjectsToMatch_BWD__Match_TPackage_TypeGraph_TClass_TClass() {
		return getClassInnerAnonClassMember().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassInnerAnonClassMember__IsAppropriate_solveCsp_BWD__Match_TPackage_TypeGraph_TClass_TClass() {
		return getClassInnerAnonClassMember().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassInnerAnonClassMember__IsAppropriate_checkCsp_BWD__CSP() {
		return getClassInnerAnonClassMember().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassInnerAnonClassMember__IsApplicable_solveCsp_BWD__IsApplicableMatch_TPackage_TypeGraph_AnonymousClassDeclaration_MAbstractMethodDefinition_TClass_TClass_AnonymousClassDeclarationToTClass() {
		return getClassInnerAnonClassMember().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassInnerAnonClassMember__IsApplicable_checkCsp_BWD__CSP() {
		return getClassInnerAnonClassMember().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassInnerAnonClassMember__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getClassInnerAnonClassMember().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassInnerAnonClassMember__CheckTypes_BWD__Match() {
		return getClassInnerAnonClassMember().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassInnerAnonClassMember__IsAppropriate_BWD_EMoflonEdge_86__EMoflonEdge() {
		return getClassInnerAnonClassMember().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassInnerAnonClassMember__IsAppropriate_FWD_EMoflonEdge_90__EMoflonEdge() {
		return getClassInnerAnonClassMember().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassInnerAnonClassMember__CheckAttributes_FWD__TripleMatch() {
		return getClassInnerAnonClassMember().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassInnerAnonClassMember__CheckAttributes_BWD__TripleMatch() {
		return getClassInnerAnonClassMember().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassInnerAnonClassMember__IsApplicable_CC__Match_Match() {
		return getClassInnerAnonClassMember().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassInnerAnonClassMember__IsApplicable_solveCsp_CC__TPackage_MClass_TypeGraph_AnonymousClassDeclaration_MAbstractMethodDefinition_TClass_TClass_Match_Match() {
		return getClassInnerAnonClassMember().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassInnerAnonClassMember__IsApplicable_checkCsp_CC__CSP() {
		return getClassInnerAnonClassMember().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassInnerAnonClassMember__CheckDEC_FWD__MClass_AnonymousClassDeclaration_MAbstractMethodDefinition() {
		return getClassInnerAnonClassMember().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassInnerAnonClassMember__CheckDEC_BWD__TPackage_TypeGraph_TClass_TClass() {
		return getClassInnerAnonClassMember().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassInnerAnonClassMember__GenerateModel__RuleEntryContainer_AnonymousClassDeclarationToTClass() {
		return getClassInnerAnonClassMember().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassInnerAnonClassMember__GenerateModel_solveCsp_BWD__IsApplicableMatch_TPackage_TypeGraph_AnonymousClassDeclaration_MAbstractMethodDefinition_TClass_AnonymousClassDeclarationToTClass_ModelgeneratorRuleResult() {
		return getClassInnerAnonClassMember().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getClassInnerAnonClassMember__GenerateModel_checkCsp_BWD__CSP() {
		return getClassInnerAnonClassMember().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMethodName() {
		if (methodNameEClass == null) {
			methodNameEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI).getEClassifiers()
					.get(107);
		}
		return methodNameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodName__IsAppropriate_FWD__Match_MMethodName_MGravityModel() {
		return getMethodName().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodName__Perform_FWD__IsApplicableMatch() {
		return getMethodName().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodName__IsApplicable_FWD__Match() {
		return getMethodName().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodName__RegisterObjectsToMatch_FWD__Match_MMethodName_MGravityModel() {
		return getMethodName().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodName__IsAppropriate_solveCsp_FWD__Match_MMethodName_MGravityModel() {
		return getMethodName().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodName__IsAppropriate_checkCsp_FWD__CSP() {
		return getMethodName().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodName__IsApplicable_solveCsp_FWD__IsApplicableMatch_TypeGraph_MMethodName_ModelToTypeGraph_MGravityModel() {
		return getMethodName().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodName__IsApplicable_checkCsp_FWD__CSP() {
		return getMethodName().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodName__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getMethodName().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodName__CheckTypes_FWD__Match() {
		return getMethodName().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodName__IsAppropriate_BWD__Match_TMethod_TypeGraph() {
		return getMethodName().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodName__Perform_BWD__IsApplicableMatch() {
		return getMethodName().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodName__IsApplicable_BWD__Match() {
		return getMethodName().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodName__RegisterObjectsToMatch_BWD__Match_TMethod_TypeGraph() {
		return getMethodName().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodName__IsAppropriate_solveCsp_BWD__Match_TMethod_TypeGraph() {
		return getMethodName().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodName__IsAppropriate_checkCsp_BWD__CSP() {
		return getMethodName().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodName__IsApplicable_solveCsp_BWD__IsApplicableMatch_TMethod_TypeGraph_ModelToTypeGraph_MGravityModel() {
		return getMethodName().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodName__IsApplicable_checkCsp_BWD__CSP() {
		return getMethodName().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodName__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getMethodName().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodName__CheckTypes_BWD__Match() {
		return getMethodName().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodName__IsAppropriate_BWD_EMoflonEdge_87__EMoflonEdge() {
		return getMethodName().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodName__IsAppropriate_FWD_EMoflonEdge_91__EMoflonEdge() {
		return getMethodName().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodName__CheckAttributes_FWD__TripleMatch() {
		return getMethodName().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodName__CheckAttributes_BWD__TripleMatch() {
		return getMethodName().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodName__IsApplicable_CC__Match_Match() {
		return getMethodName().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodName__IsApplicable_solveCsp_CC__TMethod_TypeGraph_MMethodName_MGravityModel_Match_Match() {
		return getMethodName().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodName__IsApplicable_checkCsp_CC__CSP() {
		return getMethodName().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodName__CheckDEC_FWD__MMethodName_MGravityModel() {
		return getMethodName().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodName__CheckDEC_BWD__TMethod_TypeGraph() {
		return getMethodName().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodName__GenerateModel__RuleEntryContainer_ModelToTypeGraph() {
		return getMethodName().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodName__GenerateModel_solveCsp_BWD__IsApplicableMatch_TypeGraph_ModelToTypeGraph_MGravityModel_ModelgeneratorRuleResult() {
		return getMethodName().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMethodName__GenerateModel_checkCsp_BWD__CSP() {
		return getMethodName().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RulesFactory getRulesFactory() {
		return (RulesFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isFixed = false;

	/**
	 * Fixes up the loaded package, to make it appear as if it had been programmatically built.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fixPackageContents() {
		if (isFixed)
			return;
		isFixed = true;
		fixEClassifiers();
	}

	/**
	 * Sets the instance class on the given classifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void fixInstanceClass(EClassifier eClassifier) {
		if (eClassifier.getInstanceClassName() == null) {
			eClassifier.setInstanceClassName("org.gravity.tgg.modisco.pm.Rules." + eClassifier.getName());
			setGeneratedClassName(eClassifier);
		}
	}

} //RulesPackageImpl
