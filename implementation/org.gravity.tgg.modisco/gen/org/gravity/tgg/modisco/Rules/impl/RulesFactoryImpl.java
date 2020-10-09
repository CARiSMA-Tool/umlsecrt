/**
 */
package org.gravity.tgg.modisco.Rules.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.gravity.tgg.modisco.Rules.AbstractAnnotationTypeAccess;
import org.gravity.tgg.modisco.Rules.AbstractMethodDefinition;
import org.gravity.tgg.modisco.Rules.AbstractMethodInvocation;
import org.gravity.tgg.modisco.Rules.Annotation;
import org.gravity.tgg.modisco.Rules.AnnotationMemberKey;
import org.gravity.tgg.modisco.Rules.AnnotationMemberValue;
import org.gravity.tgg.modisco.Rules.AnnotationMemberValueAnnotation;
import org.gravity.tgg.modisco.Rules.AnnotationMemberValueAnnotationArray;
import org.gravity.tgg.modisco.Rules.AnnotationMemberValueArray;
import org.gravity.tgg.modisco.Rules.AnnotationMemberValueBoolean;
import org.gravity.tgg.modisco.Rules.AnnotationMemberValueBooleanArray;
import org.gravity.tgg.modisco.Rules.AnnotationMemberValueClass;
import org.gravity.tgg.modisco.Rules.AnnotationMemberValueClassArray;
import org.gravity.tgg.modisco.Rules.AnnotationMemberValueNumber;
import org.gravity.tgg.modisco.Rules.AnnotationMemberValueNumberArray;
import org.gravity.tgg.modisco.Rules.AnnotationMemberValueString;
import org.gravity.tgg.modisco.Rules.AnnotationMemberValueStringArray;
import org.gravity.tgg.modisco.Rules.AnnotationOnBodyDeclaration;
import org.gravity.tgg.modisco.Rules.AnnotationType;
import org.gravity.tgg.modisco.Rules.AnnotationTypeAccessOnAnnotation;
import org.gravity.tgg.modisco.Rules.AnnotationTypeAccessOnBodyDecl;
import org.gravity.tgg.modisco.Rules.AnnotationTypeAccessOnSelf;
import org.gravity.tgg.modisco.Rules.AnnotationTypeInAnonymous;
import org.gravity.tgg.modisco.Rules.AnnotationTypeNested;
import org.gravity.tgg.modisco.Rules.AnonymousClass;
import org.gravity.tgg.modisco.Rules.AnonymousClassType;
import org.gravity.tgg.modisco.Rules.AnonymousClassTypeClass;
import org.gravity.tgg.modisco.Rules.AnonymousClassTypeInterface;
import org.gravity.tgg.modisco.Rules.ArrayInitializerIgnoreExpressionsEdge;
import org.gravity.tgg.modisco.Rules.ArrayTypeToClass;
import org.gravity.tgg.modisco.Rules.ClassExtendsClass;
import org.gravity.tgg.modisco.Rules.ClassImplementsInterface;
import org.gravity.tgg.modisco.Rules.ClassInAnonymous;
import org.gravity.tgg.modisco.Rules.ClassInnerAnonClassMember;
import org.gravity.tgg.modisco.Rules.ClassInnerClassMember;
import org.gravity.tgg.modisco.Rules.ClassInnerMember;
import org.gravity.tgg.modisco.Rules.ClassInstanceCreation;
import org.gravity.tgg.modisco.Rules.ConstructorDefinition;
import org.gravity.tgg.modisco.Rules.ConstructorInvocation;
import org.gravity.tgg.modisco.Rules.DataFlow;
import org.gravity.tgg.modisco.Rules.EnumInAnonymous;
import org.gravity.tgg.modisco.Rules.FieldAccess;
import org.gravity.tgg.modisco.Rules.FieldAccessRead;
import org.gravity.tgg.modisco.Rules.FieldAccessReadWrite;
import org.gravity.tgg.modisco.Rules.FieldAccessWrite;
import org.gravity.tgg.modisco.Rules.FieldDefinition;
import org.gravity.tgg.modisco.Rules.FieldName;
import org.gravity.tgg.modisco.Rules.FieldSignature;
import org.gravity.tgg.modisco.Rules.FieldSignatureAbstract;
import org.gravity.tgg.modisco.Rules.FieldSignatureArrayType;
import org.gravity.tgg.modisco.Rules.FlowNode;
import org.gravity.tgg.modisco.Rules.Interface;
import org.gravity.tgg.modisco.Rules.InterfaceExtendsInterface;
import org.gravity.tgg.modisco.Rules.InterfaceInAnonymous;
import org.gravity.tgg.modisco.Rules.InterfaceMember;
import org.gravity.tgg.modisco.Rules.LinkDefinitionToAnonymous;
import org.gravity.tgg.modisco.Rules.LinkDefinitionToType;
import org.gravity.tgg.modisco.Rules.MemberInAnnotationVisibility;
import org.gravity.tgg.modisco.Rules.MemberInClassVisibility;
import org.gravity.tgg.modisco.Rules.MemberInEnumVisibility;
import org.gravity.tgg.modisco.Rules.MethodDefinition;
import org.gravity.tgg.modisco.Rules.MethodDefinitionReturnArray;
import org.gravity.tgg.modisco.Rules.MethodDefinitionReturnSingle;
import org.gravity.tgg.modisco.Rules.MethodInvocation;
import org.gravity.tgg.modisco.Rules.MethodInvocationRecursive;
import org.gravity.tgg.modisco.Rules.MethodInvocationStaticType;
import org.gravity.tgg.modisco.Rules.MethodInvocationStaticTypeArray;
import org.gravity.tgg.modisco.Rules.MethodInvocationStaticType_abstract;
import org.gravity.tgg.modisco.Rules.MethodName;
import org.gravity.tgg.modisco.Rules.MethodOverriding;
import org.gravity.tgg.modisco.Rules.MethodParameter;
import org.gravity.tgg.modisco.Rules.MethodParameterArrayType;
import org.gravity.tgg.modisco.Rules.MethodParameterLink;
import org.gravity.tgg.modisco.Rules.MethodParameterLinkFirst;
import org.gravity.tgg.modisco.Rules.MethodParameterSingleType;
import org.gravity.tgg.modisco.Rules.MethodSignature;
import org.gravity.tgg.modisco.Rules.MethodSignatureArrayReturn;
import org.gravity.tgg.modisco.Rules.MethodSignatureSingleReturn;
import org.gravity.tgg.modisco.Rules.ModelToPg;
import org.gravity.tgg.modisco.Rules.NestedClassInType;
import org.gravity.tgg.modisco.Rules.NestedEnum;
import org.gravity.tgg.modisco.Rules.NestedInterfaceInType;
import org.gravity.tgg.modisco.Rules.NestedTypes;
import org.gravity.tgg.modisco.Rules.NestedTypesInAnonymous;
import org.gravity.tgg.modisco.Rules.PackageToPGPackage;
import org.gravity.tgg.modisco.Rules.ParameterizedTypeToClass;
import org.gravity.tgg.modisco.Rules.PrimitiveTypeIsBoolean;
import org.gravity.tgg.modisco.Rules.PrimitiveTypeIsByte;
import org.gravity.tgg.modisco.Rules.PrimitiveTypeIsChar;
import org.gravity.tgg.modisco.Rules.PrimitiveTypeIsDouble;
import org.gravity.tgg.modisco.Rules.PrimitiveTypeIsFloat;
import org.gravity.tgg.modisco.Rules.PrimitiveTypeIsInt;
import org.gravity.tgg.modisco.Rules.PrimitiveTypeIsLong;
import org.gravity.tgg.modisco.Rules.PrimitiveTypeIsShort;
import org.gravity.tgg.modisco.Rules.PrimitiveTypesIsVoid;
import org.gravity.tgg.modisco.Rules.PrimitiveTypesToClass;
import org.gravity.tgg.modisco.Rules.RulesFactory;
import org.gravity.tgg.modisco.Rules.RulesPackage;
import org.gravity.tgg.modisco.Rules.SubPackageToPGPackage;
import org.gravity.tgg.modisco.Rules.SuperConstructorInvocation;
import org.gravity.tgg.modisco.Rules.SuperMethodInvocation;
import org.gravity.tgg.modisco.Rules.SyntethicMethod;
import org.gravity.tgg.modisco.Rules.TextAnnotations;
import org.gravity.tgg.modisco.Rules.TypeParameter;
import org.gravity.tgg.modisco.Rules.Types;
import org.gravity.tgg.modisco.Rules.TypesOrphaned;
import org.gravity.tgg.modisco.Rules.TypesVisibility;
import org.gravity.tgg.modisco.Rules.UnresolvedMethodDeclaration;
import org.gravity.tgg.modisco.Rules.UnresolvedTypeDeclaration;
import org.gravity.tgg.modisco.Rules.VariableDeclarationFragment;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RulesFactoryImpl extends EFactoryImpl implements RulesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RulesFactory init() {
		try {
			RulesFactory theRulesFactory = (RulesFactory) EPackage.Registry.INSTANCE.getEFactory(RulesPackage.eNS_URI);
			if (theRulesFactory != null) {
				return theRulesFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RulesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RulesFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case RulesPackage.METHOD_INVOCATION_STATIC_TYPE:
			return createMethodInvocationStaticType();
		case RulesPackage.TYPES_VISIBILITY:
			return createTypesVisibility();
		case RulesPackage.ANNOTATION_MEMBER_VALUE:
			return createAnnotationMemberValue();
		case RulesPackage.ANNOTATION_TYPE_ACCESS_ON_BODY_DECL:
			return createAnnotationTypeAccessOnBodyDecl();
		case RulesPackage.FIELD_SIGNATURE_ARRAY_TYPE:
			return createFieldSignatureArrayType();
		case RulesPackage.SYNTETHIC_METHOD:
			return createSyntethicMethod();
		case RulesPackage.FIELD_ACCESS_READ_WRITE:
			return createFieldAccessReadWrite();
		case RulesPackage.METHOD_SIGNATURE_ARRAY_RETURN:
			return createMethodSignatureArrayReturn();
		case RulesPackage.ANNOTATION_MEMBER_KEY:
			return createAnnotationMemberKey();
		case RulesPackage.PRIMITIVE_TYPE_IS_BOOLEAN:
			return createPrimitiveTypeIsBoolean();
		case RulesPackage.PRIMITIVE_TYPES_TO_CLASS:
			return createPrimitiveTypesToClass();
		case RulesPackage.ANNOTATION:
			return createAnnotation();
		case RulesPackage.PACKAGE_TO_PG_PACKAGE:
			return createPackageToPGPackage();
		case RulesPackage.CLASS_EXTENDS_CLASS:
			return createClassExtendsClass();
		case RulesPackage.TYPES:
			return createTypes();
		case RulesPackage.ANNOTATION_MEMBER_VALUE_BOOLEAN_ARRAY:
			return createAnnotationMemberValueBooleanArray();
		case RulesPackage.METHOD_NAME:
			return createMethodName();
		case RulesPackage.METHOD_PARAMETER_LINK:
			return createMethodParameterLink();
		case RulesPackage.METHOD_PARAMETER_SINGLE_TYPE:
			return createMethodParameterSingleType();
		case RulesPackage.METHOD_PARAMETER_LINK_FIRST:
			return createMethodParameterLinkFirst();
		case RulesPackage.METHOD_INVOCATION_STATIC_TYPE_ARRAY:
			return createMethodInvocationStaticTypeArray();
		case RulesPackage.CLASS_IN_ANONYMOUS:
			return createClassInAnonymous();
		case RulesPackage.PRIMITIVE_TYPE_IS_LONG:
			return createPrimitiveTypeIsLong();
		case RulesPackage.VARIABLE_DECLARATION_FRAGMENT:
			return createVariableDeclarationFragment();
		case RulesPackage.ANNOTATION_MEMBER_VALUE_ARRAY:
			return createAnnotationMemberValueArray();
		case RulesPackage.LINK_DEFINITION_TO_ANONYMOUS:
			return createLinkDefinitionToAnonymous();
		case RulesPackage.INTERFACE_IN_ANONYMOUS:
			return createInterfaceInAnonymous();
		case RulesPackage.CLASS_INSTANCE_CREATION:
			return createClassInstanceCreation();
		case RulesPackage.METHOD_PARAMETER:
			return createMethodParameter();
		case RulesPackage.INTERFACE_MEMBER:
			return createInterfaceMember();
		case RulesPackage.CLASS_IMPLEMENTS_INTERFACE:
			return createClassImplementsInterface();
		case RulesPackage.SUPER_CONSTRUCTOR_INVOCATION:
			return createSuperConstructorInvocation();
		case RulesPackage.MEMBER_IN_CLASS_VISIBILITY:
			return createMemberInClassVisibility();
		case RulesPackage.METHOD_SIGNATURE:
			return createMethodSignature();
		case RulesPackage.ANNOTATION_MEMBER_VALUE_NUMBER:
			return createAnnotationMemberValueNumber();
		case RulesPackage.MEMBER_IN_ANNOTATION_VISIBILITY:
			return createMemberInAnnotationVisibility();
		case RulesPackage.METHOD_SIGNATURE_SINGLE_RETURN:
			return createMethodSignatureSingleReturn();
		case RulesPackage.FLOW_NODE:
			return createFlowNode();
		case RulesPackage.ANNOTATION_MEMBER_VALUE_NUMBER_ARRAY:
			return createAnnotationMemberValueNumberArray();
		case RulesPackage.ABSTRACT_METHOD_DEFINITION:
			return createAbstractMethodDefinition();
		case RulesPackage.INTERFACE:
			return createInterface();
		case RulesPackage.MEMBER_IN_ENUM_VISIBILITY:
			return createMemberInEnumVisibility();
		case RulesPackage.UNRESOLVED_TYPE_DECLARATION:
			return createUnresolvedTypeDeclaration();
		case RulesPackage.METHOD_DEFINITION:
			return createMethodDefinition();
		case RulesPackage.SUB_PACKAGE_TO_PG_PACKAGE:
			return createSubPackageToPGPackage();
		case RulesPackage.NESTED_TYPES_IN_ANONYMOUS:
			return createNestedTypesInAnonymous();
		case RulesPackage.PRIMITIVE_TYPES_IS_VOID:
			return createPrimitiveTypesIsVoid();
		case RulesPackage.ANNOTATION_MEMBER_VALUE_ANNOTATION_ARRAY:
			return createAnnotationMemberValueAnnotationArray();
		case RulesPackage.ANNOTATION_ON_BODY_DECLARATION:
			return createAnnotationOnBodyDeclaration();
		case RulesPackage.ANONYMOUS_CLASS_TYPE_CLASS:
			return createAnonymousClassTypeClass();
		case RulesPackage.METHOD_DEFINITION_RETURN_ARRAY:
			return createMethodDefinitionReturnArray();
		case RulesPackage.ARRAY_TYPE_TO_CLASS:
			return createArrayTypeToClass();
		case RulesPackage.METHOD_INVOCATION_RECURSIVE:
			return createMethodInvocationRecursive();
		case RulesPackage.ANNOTATION_MEMBER_VALUE_STRING_ARRAY:
			return createAnnotationMemberValueStringArray();
		case RulesPackage.CLASS_INNER_CLASS_MEMBER:
			return createClassInnerClassMember();
		case RulesPackage.PRIMITIVE_TYPE_IS_DOUBLE:
			return createPrimitiveTypeIsDouble();
		case RulesPackage.TYPE_PARAMETER:
			return createTypeParameter();
		case RulesPackage.INTERFACE_EXTENDS_INTERFACE:
			return createInterfaceExtendsInterface();
		case RulesPackage.NESTED_TYPES:
			return createNestedTypes();
		case RulesPackage.DATA_FLOW:
			return createDataFlow();
		case RulesPackage.ANNOTATION_TYPE_ACCESS_ON_SELF:
			return createAnnotationTypeAccessOnSelf();
		case RulesPackage.PARAMETERIZED_TYPE_TO_CLASS:
			return createParameterizedTypeToClass();
		case RulesPackage.ANNOTATION_MEMBER_VALUE_STRING:
			return createAnnotationMemberValueString();
		case RulesPackage.METHOD_DEFINITION_RETURN_SINGLE:
			return createMethodDefinitionReturnSingle();
		case RulesPackage.CLASS:
			return createClass();
		case RulesPackage.METHOD_INVOCATION_STATIC_TYPE_ABSTRACT:
			return createMethodInvocationStaticType_abstract();
		case RulesPackage.PRIMITIVE_TYPE_IS_SHORT:
			return createPrimitiveTypeIsShort();
		case RulesPackage.ANNOTATION_MEMBER_VALUE_CLASS_ARRAY:
			return createAnnotationMemberValueClassArray();
		case RulesPackage.TYPES_ORPHANED:
			return createTypesOrphaned();
		case RulesPackage.FIELD_NAME:
			return createFieldName();
		case RulesPackage.MODEL_TO_PG:
			return createModelToPg();
		case RulesPackage.FIELD_DEFINITION:
			return createFieldDefinition();
		case RulesPackage.METHOD_PARAMETER_ARRAY_TYPE:
			return createMethodParameterArrayType();
		case RulesPackage.ANONYMOUS_CLASS_TYPE_INTERFACE:
			return createAnonymousClassTypeInterface();
		case RulesPackage.METHOD_INVOCATION:
			return createMethodInvocation();
		case RulesPackage.ANNOTATION_MEMBER_VALUE_BOOLEAN:
			return createAnnotationMemberValueBoolean();
		case RulesPackage.PRIMITIVE_TYPE_IS_INT:
			return createPrimitiveTypeIsInt();
		case RulesPackage.FIELD_ACCESS:
			return createFieldAccess();
		case RulesPackage.UNRESOLVED_METHOD_DECLARATION:
			return createUnresolvedMethodDeclaration();
		case RulesPackage.CONSTRUCTOR_INVOCATION:
			return createConstructorInvocation();
		case RulesPackage.ENUM:
			return createEnum();
		case RulesPackage.NESTED_INTERFACE_IN_TYPE:
			return createNestedInterfaceInType();
		case RulesPackage.ANNOTATION_TYPE_NESTED:
			return createAnnotationTypeNested();
		case RulesPackage.LINK_DEFINITION_TO_TYPE:
			return createLinkDefinitionToType();
		case RulesPackage.PRIMITIVE_TYPE_IS_CHAR:
			return createPrimitiveTypeIsChar();
		case RulesPackage.ANONYMOUS_CLASS_TYPE:
			return createAnonymousClassType();
		case RulesPackage.FIELD_ACCESS_READ:
			return createFieldAccessRead();
		case RulesPackage.FIELD_ACCESS_WRITE:
			return createFieldAccessWrite();
		case RulesPackage.PRIMITIVE_TYPE_IS_FLOAT:
			return createPrimitiveTypeIsFloat();
		case RulesPackage.ABSTRACT_ANNOTATION_TYPE_ACCESS:
			return createAbstractAnnotationTypeAccess();
		case RulesPackage.TEXT_ANNOTATIONS:
			return createTextAnnotations();
		case RulesPackage.CLASS_INNER_ANON_CLASS_MEMBER:
			return createClassInnerAnonClassMember();
		case RulesPackage.NESTED_CLASS_IN_TYPE:
			return createNestedClassInType();
		case RulesPackage.ABSTRACT_METHOD_INVOCATION:
			return createAbstractMethodInvocation();
		case RulesPackage.ANNOTATION_MEMBER_VALUE_ANNOTATION:
			return createAnnotationMemberValueAnnotation();
		case RulesPackage.ARRAY_INITIALIZER_IGNORE_EXPRESSIONS_EDGE:
			return createArrayInitializerIgnoreExpressionsEdge();
		case RulesPackage.ENUM_IN_ANONYMOUS:
			return createEnumInAnonymous();
		case RulesPackage.CONSTRUCTOR_DEFINITION:
			return createConstructorDefinition();
		case RulesPackage.FIELD_SIGNATURE:
			return createFieldSignature();
		case RulesPackage.ANNOTATION_TYPE_ACCESS_ON_ANNOTATION:
			return createAnnotationTypeAccessOnAnnotation();
		case RulesPackage.FIELD_SIGNATURE_ABSTRACT:
			return createFieldSignatureAbstract();
		case RulesPackage.CLASS_INNER_MEMBER:
			return createClassInnerMember();
		case RulesPackage.SUPER_METHOD_INVOCATION:
			return createSuperMethodInvocation();
		case RulesPackage.NESTED_ENUM:
			return createNestedEnum();
		case RulesPackage.ANNOTATION_TYPE:
			return createAnnotationType();
		case RulesPackage.ANNOTATION_MEMBER_VALUE_CLASS:
			return createAnnotationMemberValueClass();
		case RulesPackage.PRIMITIVE_TYPE_IS_BYTE:
			return createPrimitiveTypeIsByte();
		case RulesPackage.ANONYMOUS_CLASS:
			return createAnonymousClass();
		case RulesPackage.METHOD_OVERRIDING:
			return createMethodOverriding();
		case RulesPackage.ANNOTATION_TYPE_IN_ANONYMOUS:
			return createAnnotationTypeInAnonymous();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MethodInvocationStaticType createMethodInvocationStaticType() {
		MethodInvocationStaticTypeImpl methodInvocationStaticType = new MethodInvocationStaticTypeImpl();
		return methodInvocationStaticType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypesVisibility createTypesVisibility() {
		TypesVisibilityImpl typesVisibility = new TypesVisibilityImpl();
		return typesVisibility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnnotationMemberValue createAnnotationMemberValue() {
		AnnotationMemberValueImpl annotationMemberValue = new AnnotationMemberValueImpl();
		return annotationMemberValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnnotationTypeAccessOnBodyDecl createAnnotationTypeAccessOnBodyDecl() {
		AnnotationTypeAccessOnBodyDeclImpl annotationTypeAccessOnBodyDecl = new AnnotationTypeAccessOnBodyDeclImpl();
		return annotationTypeAccessOnBodyDecl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FieldSignatureArrayType createFieldSignatureArrayType() {
		FieldSignatureArrayTypeImpl fieldSignatureArrayType = new FieldSignatureArrayTypeImpl();
		return fieldSignatureArrayType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SyntethicMethod createSyntethicMethod() {
		SyntethicMethodImpl syntethicMethod = new SyntethicMethodImpl();
		return syntethicMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FieldAccessReadWrite createFieldAccessReadWrite() {
		FieldAccessReadWriteImpl fieldAccessReadWrite = new FieldAccessReadWriteImpl();
		return fieldAccessReadWrite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MethodSignatureArrayReturn createMethodSignatureArrayReturn() {
		MethodSignatureArrayReturnImpl methodSignatureArrayReturn = new MethodSignatureArrayReturnImpl();
		return methodSignatureArrayReturn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnnotationMemberKey createAnnotationMemberKey() {
		AnnotationMemberKeyImpl annotationMemberKey = new AnnotationMemberKeyImpl();
		return annotationMemberKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrimitiveTypeIsBoolean createPrimitiveTypeIsBoolean() {
		PrimitiveTypeIsBooleanImpl primitiveTypeIsBoolean = new PrimitiveTypeIsBooleanImpl();
		return primitiveTypeIsBoolean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrimitiveTypesToClass createPrimitiveTypesToClass() {
		PrimitiveTypesToClassImpl primitiveTypesToClass = new PrimitiveTypesToClassImpl();
		return primitiveTypesToClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Annotation createAnnotation() {
		AnnotationImpl annotation = new AnnotationImpl();
		return annotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PackageToPGPackage createPackageToPGPackage() {
		PackageToPGPackageImpl packageToPGPackage = new PackageToPGPackageImpl();
		return packageToPGPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClassExtendsClass createClassExtendsClass() {
		ClassExtendsClassImpl classExtendsClass = new ClassExtendsClassImpl();
		return classExtendsClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Types createTypes() {
		TypesImpl types = new TypesImpl();
		return types;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnnotationMemberValueBooleanArray createAnnotationMemberValueBooleanArray() {
		AnnotationMemberValueBooleanArrayImpl annotationMemberValueBooleanArray = new AnnotationMemberValueBooleanArrayImpl();
		return annotationMemberValueBooleanArray;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MethodName createMethodName() {
		MethodNameImpl methodName = new MethodNameImpl();
		return methodName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MethodParameterLink createMethodParameterLink() {
		MethodParameterLinkImpl methodParameterLink = new MethodParameterLinkImpl();
		return methodParameterLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MethodParameterSingleType createMethodParameterSingleType() {
		MethodParameterSingleTypeImpl methodParameterSingleType = new MethodParameterSingleTypeImpl();
		return methodParameterSingleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MethodParameterLinkFirst createMethodParameterLinkFirst() {
		MethodParameterLinkFirstImpl methodParameterLinkFirst = new MethodParameterLinkFirstImpl();
		return methodParameterLinkFirst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MethodInvocationStaticTypeArray createMethodInvocationStaticTypeArray() {
		MethodInvocationStaticTypeArrayImpl methodInvocationStaticTypeArray = new MethodInvocationStaticTypeArrayImpl();
		return methodInvocationStaticTypeArray;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClassInAnonymous createClassInAnonymous() {
		ClassInAnonymousImpl classInAnonymous = new ClassInAnonymousImpl();
		return classInAnonymous;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrimitiveTypeIsLong createPrimitiveTypeIsLong() {
		PrimitiveTypeIsLongImpl primitiveTypeIsLong = new PrimitiveTypeIsLongImpl();
		return primitiveTypeIsLong;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VariableDeclarationFragment createVariableDeclarationFragment() {
		VariableDeclarationFragmentImpl variableDeclarationFragment = new VariableDeclarationFragmentImpl();
		return variableDeclarationFragment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnnotationMemberValueArray createAnnotationMemberValueArray() {
		AnnotationMemberValueArrayImpl annotationMemberValueArray = new AnnotationMemberValueArrayImpl();
		return annotationMemberValueArray;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LinkDefinitionToAnonymous createLinkDefinitionToAnonymous() {
		LinkDefinitionToAnonymousImpl linkDefinitionToAnonymous = new LinkDefinitionToAnonymousImpl();
		return linkDefinitionToAnonymous;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InterfaceInAnonymous createInterfaceInAnonymous() {
		InterfaceInAnonymousImpl interfaceInAnonymous = new InterfaceInAnonymousImpl();
		return interfaceInAnonymous;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClassInstanceCreation createClassInstanceCreation() {
		ClassInstanceCreationImpl classInstanceCreation = new ClassInstanceCreationImpl();
		return classInstanceCreation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MethodParameter createMethodParameter() {
		MethodParameterImpl methodParameter = new MethodParameterImpl();
		return methodParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InterfaceMember createInterfaceMember() {
		InterfaceMemberImpl interfaceMember = new InterfaceMemberImpl();
		return interfaceMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClassImplementsInterface createClassImplementsInterface() {
		ClassImplementsInterfaceImpl classImplementsInterface = new ClassImplementsInterfaceImpl();
		return classImplementsInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SuperConstructorInvocation createSuperConstructorInvocation() {
		SuperConstructorInvocationImpl superConstructorInvocation = new SuperConstructorInvocationImpl();
		return superConstructorInvocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MemberInClassVisibility createMemberInClassVisibility() {
		MemberInClassVisibilityImpl memberInClassVisibility = new MemberInClassVisibilityImpl();
		return memberInClassVisibility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MethodSignature createMethodSignature() {
		MethodSignatureImpl methodSignature = new MethodSignatureImpl();
		return methodSignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnnotationMemberValueNumber createAnnotationMemberValueNumber() {
		AnnotationMemberValueNumberImpl annotationMemberValueNumber = new AnnotationMemberValueNumberImpl();
		return annotationMemberValueNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MemberInAnnotationVisibility createMemberInAnnotationVisibility() {
		MemberInAnnotationVisibilityImpl memberInAnnotationVisibility = new MemberInAnnotationVisibilityImpl();
		return memberInAnnotationVisibility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MethodSignatureSingleReturn createMethodSignatureSingleReturn() {
		MethodSignatureSingleReturnImpl methodSignatureSingleReturn = new MethodSignatureSingleReturnImpl();
		return methodSignatureSingleReturn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FlowNode createFlowNode() {
		FlowNodeImpl flowNode = new FlowNodeImpl();
		return flowNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnnotationMemberValueNumberArray createAnnotationMemberValueNumberArray() {
		AnnotationMemberValueNumberArrayImpl annotationMemberValueNumberArray = new AnnotationMemberValueNumberArrayImpl();
		return annotationMemberValueNumberArray;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractMethodDefinition createAbstractMethodDefinition() {
		AbstractMethodDefinitionImpl abstractMethodDefinition = new AbstractMethodDefinitionImpl();
		return abstractMethodDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Interface createInterface() {
		InterfaceImpl interface_ = new InterfaceImpl();
		return interface_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MemberInEnumVisibility createMemberInEnumVisibility() {
		MemberInEnumVisibilityImpl memberInEnumVisibility = new MemberInEnumVisibilityImpl();
		return memberInEnumVisibility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnresolvedTypeDeclaration createUnresolvedTypeDeclaration() {
		UnresolvedTypeDeclarationImpl unresolvedTypeDeclaration = new UnresolvedTypeDeclarationImpl();
		return unresolvedTypeDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MethodDefinition createMethodDefinition() {
		MethodDefinitionImpl methodDefinition = new MethodDefinitionImpl();
		return methodDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubPackageToPGPackage createSubPackageToPGPackage() {
		SubPackageToPGPackageImpl subPackageToPGPackage = new SubPackageToPGPackageImpl();
		return subPackageToPGPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NestedTypesInAnonymous createNestedTypesInAnonymous() {
		NestedTypesInAnonymousImpl nestedTypesInAnonymous = new NestedTypesInAnonymousImpl();
		return nestedTypesInAnonymous;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrimitiveTypesIsVoid createPrimitiveTypesIsVoid() {
		PrimitiveTypesIsVoidImpl primitiveTypesIsVoid = new PrimitiveTypesIsVoidImpl();
		return primitiveTypesIsVoid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnnotationMemberValueAnnotationArray createAnnotationMemberValueAnnotationArray() {
		AnnotationMemberValueAnnotationArrayImpl annotationMemberValueAnnotationArray = new AnnotationMemberValueAnnotationArrayImpl();
		return annotationMemberValueAnnotationArray;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnnotationOnBodyDeclaration createAnnotationOnBodyDeclaration() {
		AnnotationOnBodyDeclarationImpl annotationOnBodyDeclaration = new AnnotationOnBodyDeclarationImpl();
		return annotationOnBodyDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnonymousClassTypeClass createAnonymousClassTypeClass() {
		AnonymousClassTypeClassImpl anonymousClassTypeClass = new AnonymousClassTypeClassImpl();
		return anonymousClassTypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MethodDefinitionReturnArray createMethodDefinitionReturnArray() {
		MethodDefinitionReturnArrayImpl methodDefinitionReturnArray = new MethodDefinitionReturnArrayImpl();
		return methodDefinitionReturnArray;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArrayTypeToClass createArrayTypeToClass() {
		ArrayTypeToClassImpl arrayTypeToClass = new ArrayTypeToClassImpl();
		return arrayTypeToClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MethodInvocationRecursive createMethodInvocationRecursive() {
		MethodInvocationRecursiveImpl methodInvocationRecursive = new MethodInvocationRecursiveImpl();
		return methodInvocationRecursive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnnotationMemberValueStringArray createAnnotationMemberValueStringArray() {
		AnnotationMemberValueStringArrayImpl annotationMemberValueStringArray = new AnnotationMemberValueStringArrayImpl();
		return annotationMemberValueStringArray;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClassInnerClassMember createClassInnerClassMember() {
		ClassInnerClassMemberImpl classInnerClassMember = new ClassInnerClassMemberImpl();
		return classInnerClassMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrimitiveTypeIsDouble createPrimitiveTypeIsDouble() {
		PrimitiveTypeIsDoubleImpl primitiveTypeIsDouble = new PrimitiveTypeIsDoubleImpl();
		return primitiveTypeIsDouble;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeParameter createTypeParameter() {
		TypeParameterImpl typeParameter = new TypeParameterImpl();
		return typeParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InterfaceExtendsInterface createInterfaceExtendsInterface() {
		InterfaceExtendsInterfaceImpl interfaceExtendsInterface = new InterfaceExtendsInterfaceImpl();
		return interfaceExtendsInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NestedTypes createNestedTypes() {
		NestedTypesImpl nestedTypes = new NestedTypesImpl();
		return nestedTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataFlow createDataFlow() {
		DataFlowImpl dataFlow = new DataFlowImpl();
		return dataFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnnotationTypeAccessOnSelf createAnnotationTypeAccessOnSelf() {
		AnnotationTypeAccessOnSelfImpl annotationTypeAccessOnSelf = new AnnotationTypeAccessOnSelfImpl();
		return annotationTypeAccessOnSelf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ParameterizedTypeToClass createParameterizedTypeToClass() {
		ParameterizedTypeToClassImpl parameterizedTypeToClass = new ParameterizedTypeToClassImpl();
		return parameterizedTypeToClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnnotationMemberValueString createAnnotationMemberValueString() {
		AnnotationMemberValueStringImpl annotationMemberValueString = new AnnotationMemberValueStringImpl();
		return annotationMemberValueString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MethodDefinitionReturnSingle createMethodDefinitionReturnSingle() {
		MethodDefinitionReturnSingleImpl methodDefinitionReturnSingle = new MethodDefinitionReturnSingleImpl();
		return methodDefinitionReturnSingle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.gravity.tgg.modisco.Rules.Class createClass() {
		ClassImpl class_ = new ClassImpl();
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MethodInvocationStaticType_abstract createMethodInvocationStaticType_abstract() {
		MethodInvocationStaticType_abstractImpl methodInvocationStaticType_abstract = new MethodInvocationStaticType_abstractImpl();
		return methodInvocationStaticType_abstract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrimitiveTypeIsShort createPrimitiveTypeIsShort() {
		PrimitiveTypeIsShortImpl primitiveTypeIsShort = new PrimitiveTypeIsShortImpl();
		return primitiveTypeIsShort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnnotationMemberValueClassArray createAnnotationMemberValueClassArray() {
		AnnotationMemberValueClassArrayImpl annotationMemberValueClassArray = new AnnotationMemberValueClassArrayImpl();
		return annotationMemberValueClassArray;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypesOrphaned createTypesOrphaned() {
		TypesOrphanedImpl typesOrphaned = new TypesOrphanedImpl();
		return typesOrphaned;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FieldName createFieldName() {
		FieldNameImpl fieldName = new FieldNameImpl();
		return fieldName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ModelToPg createModelToPg() {
		ModelToPgImpl modelToPg = new ModelToPgImpl();
		return modelToPg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FieldDefinition createFieldDefinition() {
		FieldDefinitionImpl fieldDefinition = new FieldDefinitionImpl();
		return fieldDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MethodParameterArrayType createMethodParameterArrayType() {
		MethodParameterArrayTypeImpl methodParameterArrayType = new MethodParameterArrayTypeImpl();
		return methodParameterArrayType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnonymousClassTypeInterface createAnonymousClassTypeInterface() {
		AnonymousClassTypeInterfaceImpl anonymousClassTypeInterface = new AnonymousClassTypeInterfaceImpl();
		return anonymousClassTypeInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MethodInvocation createMethodInvocation() {
		MethodInvocationImpl methodInvocation = new MethodInvocationImpl();
		return methodInvocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnnotationMemberValueBoolean createAnnotationMemberValueBoolean() {
		AnnotationMemberValueBooleanImpl annotationMemberValueBoolean = new AnnotationMemberValueBooleanImpl();
		return annotationMemberValueBoolean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrimitiveTypeIsInt createPrimitiveTypeIsInt() {
		PrimitiveTypeIsIntImpl primitiveTypeIsInt = new PrimitiveTypeIsIntImpl();
		return primitiveTypeIsInt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FieldAccess createFieldAccess() {
		FieldAccessImpl fieldAccess = new FieldAccessImpl();
		return fieldAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnresolvedMethodDeclaration createUnresolvedMethodDeclaration() {
		UnresolvedMethodDeclarationImpl unresolvedMethodDeclaration = new UnresolvedMethodDeclarationImpl();
		return unresolvedMethodDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConstructorInvocation createConstructorInvocation() {
		ConstructorInvocationImpl constructorInvocation = new ConstructorInvocationImpl();
		return constructorInvocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.gravity.tgg.modisco.Rules.Enum createEnum() {
		EnumImpl enum_ = new EnumImpl();
		return enum_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NestedInterfaceInType createNestedInterfaceInType() {
		NestedInterfaceInTypeImpl nestedInterfaceInType = new NestedInterfaceInTypeImpl();
		return nestedInterfaceInType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnnotationTypeNested createAnnotationTypeNested() {
		AnnotationTypeNestedImpl annotationTypeNested = new AnnotationTypeNestedImpl();
		return annotationTypeNested;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LinkDefinitionToType createLinkDefinitionToType() {
		LinkDefinitionToTypeImpl linkDefinitionToType = new LinkDefinitionToTypeImpl();
		return linkDefinitionToType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrimitiveTypeIsChar createPrimitiveTypeIsChar() {
		PrimitiveTypeIsCharImpl primitiveTypeIsChar = new PrimitiveTypeIsCharImpl();
		return primitiveTypeIsChar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnonymousClassType createAnonymousClassType() {
		AnonymousClassTypeImpl anonymousClassType = new AnonymousClassTypeImpl();
		return anonymousClassType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FieldAccessRead createFieldAccessRead() {
		FieldAccessReadImpl fieldAccessRead = new FieldAccessReadImpl();
		return fieldAccessRead;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FieldAccessWrite createFieldAccessWrite() {
		FieldAccessWriteImpl fieldAccessWrite = new FieldAccessWriteImpl();
		return fieldAccessWrite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrimitiveTypeIsFloat createPrimitiveTypeIsFloat() {
		PrimitiveTypeIsFloatImpl primitiveTypeIsFloat = new PrimitiveTypeIsFloatImpl();
		return primitiveTypeIsFloat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractAnnotationTypeAccess createAbstractAnnotationTypeAccess() {
		AbstractAnnotationTypeAccessImpl abstractAnnotationTypeAccess = new AbstractAnnotationTypeAccessImpl();
		return abstractAnnotationTypeAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TextAnnotations createTextAnnotations() {
		TextAnnotationsImpl textAnnotations = new TextAnnotationsImpl();
		return textAnnotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClassInnerAnonClassMember createClassInnerAnonClassMember() {
		ClassInnerAnonClassMemberImpl classInnerAnonClassMember = new ClassInnerAnonClassMemberImpl();
		return classInnerAnonClassMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NestedClassInType createNestedClassInType() {
		NestedClassInTypeImpl nestedClassInType = new NestedClassInTypeImpl();
		return nestedClassInType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractMethodInvocation createAbstractMethodInvocation() {
		AbstractMethodInvocationImpl abstractMethodInvocation = new AbstractMethodInvocationImpl();
		return abstractMethodInvocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnnotationMemberValueAnnotation createAnnotationMemberValueAnnotation() {
		AnnotationMemberValueAnnotationImpl annotationMemberValueAnnotation = new AnnotationMemberValueAnnotationImpl();
		return annotationMemberValueAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArrayInitializerIgnoreExpressionsEdge createArrayInitializerIgnoreExpressionsEdge() {
		ArrayInitializerIgnoreExpressionsEdgeImpl arrayInitializerIgnoreExpressionsEdge = new ArrayInitializerIgnoreExpressionsEdgeImpl();
		return arrayInitializerIgnoreExpressionsEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnumInAnonymous createEnumInAnonymous() {
		EnumInAnonymousImpl enumInAnonymous = new EnumInAnonymousImpl();
		return enumInAnonymous;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConstructorDefinition createConstructorDefinition() {
		ConstructorDefinitionImpl constructorDefinition = new ConstructorDefinitionImpl();
		return constructorDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FieldSignature createFieldSignature() {
		FieldSignatureImpl fieldSignature = new FieldSignatureImpl();
		return fieldSignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnnotationTypeAccessOnAnnotation createAnnotationTypeAccessOnAnnotation() {
		AnnotationTypeAccessOnAnnotationImpl annotationTypeAccessOnAnnotation = new AnnotationTypeAccessOnAnnotationImpl();
		return annotationTypeAccessOnAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FieldSignatureAbstract createFieldSignatureAbstract() {
		FieldSignatureAbstractImpl fieldSignatureAbstract = new FieldSignatureAbstractImpl();
		return fieldSignatureAbstract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClassInnerMember createClassInnerMember() {
		ClassInnerMemberImpl classInnerMember = new ClassInnerMemberImpl();
		return classInnerMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SuperMethodInvocation createSuperMethodInvocation() {
		SuperMethodInvocationImpl superMethodInvocation = new SuperMethodInvocationImpl();
		return superMethodInvocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NestedEnum createNestedEnum() {
		NestedEnumImpl nestedEnum = new NestedEnumImpl();
		return nestedEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnnotationType createAnnotationType() {
		AnnotationTypeImpl annotationType = new AnnotationTypeImpl();
		return annotationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnnotationMemberValueClass createAnnotationMemberValueClass() {
		AnnotationMemberValueClassImpl annotationMemberValueClass = new AnnotationMemberValueClassImpl();
		return annotationMemberValueClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrimitiveTypeIsByte createPrimitiveTypeIsByte() {
		PrimitiveTypeIsByteImpl primitiveTypeIsByte = new PrimitiveTypeIsByteImpl();
		return primitiveTypeIsByte;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnonymousClass createAnonymousClass() {
		AnonymousClassImpl anonymousClass = new AnonymousClassImpl();
		return anonymousClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MethodOverriding createMethodOverriding() {
		MethodOverridingImpl methodOverriding = new MethodOverridingImpl();
		return methodOverriding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnnotationTypeInAnonymous createAnnotationTypeInAnonymous() {
		AnnotationTypeInAnonymousImpl annotationTypeInAnonymous = new AnnotationTypeInAnonymousImpl();
		return annotationTypeInAnonymous;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RulesPackage getRulesPackage() {
		return (RulesPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RulesPackage getPackage() {
		return RulesPackage.eINSTANCE;
	}

} //RulesFactoryImpl
