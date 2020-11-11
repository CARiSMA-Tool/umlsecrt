/**
 */
package org.gravity.tgg.modisco.uml.Rules;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.modisco.java.AbstractTypeDeclaration;
import org.eclipse.modisco.java.ParameterizedType;
import org.eclipse.modisco.java.TypeAccess;
import org.eclipse.modisco.java.TypeDeclaration;

import org.gravity.tgg.modisco.uml.JavaPackage2UmlPackage;
import org.gravity.tgg.modisco.uml.NamedElement2NamedElement;

import org.moflon.tgg.language.csp.CSP;

import org.moflon.tgg.language.modelgenerator.RuleEntryContainer;

import org.moflon.tgg.runtime.AbstractRule;
import org.moflon.tgg.runtime.AttributeConstraintsRuleResult;
import org.moflon.tgg.runtime.EMoflonEdge;
import org.moflon.tgg.runtime.EObjectContainer;
import org.moflon.tgg.runtime.IsApplicableMatch;
import org.moflon.tgg.runtime.IsApplicableRuleResult;
import org.moflon.tgg.runtime.Match;
import org.moflon.tgg.runtime.ModelgeneratorRuleResult;
import org.moflon.tgg.runtime.PerformRuleResult;
import org.moflon.tgg.runtime.TripleMatch;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameterized Type2 Class Inner Type In Class</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.gravity.tgg.modisco.uml.Rules.RulesPackage#getParameterizedType2Class_InnerTypeInClass()
 * @model
 * @generated
 */
public interface ParameterizedType2Class_InnerTypeInClass extends EObject, AbstractRule {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean isAppropriate_FWD(Match match, TypeDeclaration jContainer, AbstractTypeDeclaration nonParamType,
			ParameterizedType parameterizedType, org.eclipse.modisco.java.Package nonParamPackage,
			TypeAccess typeTypeAccess);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	IsApplicableRuleResult isApplicable_FWD(Match match);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void registerObjectsToMatch_FWD(Match match, TypeDeclaration jContainer, AbstractTypeDeclaration nonParamType,
			ParameterizedType parameterizedType, org.eclipse.modisco.java.Package nonParamPackage,
			TypeAccess typeTypeAccess);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	CSP isAppropriate_solveCsp_FWD(Match match, TypeDeclaration jContainer, AbstractTypeDeclaration nonParamType,
			ParameterizedType parameterizedType, org.eclipse.modisco.java.Package nonParamPackage,
			TypeAccess typeTypeAccess);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean isAppropriate_checkCsp_FWD(CSP csp);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, org.eclipse.uml2.uml.Package umlPackage,
			NamedElement2NamedElement ne2neNonParam, org.eclipse.uml2.uml.Class uContainer, TypeDeclaration jContainer,
			AbstractTypeDeclaration nonParamType, ParameterizedType parameterizedType,
			org.eclipse.modisco.java.Package nonParamPackage, JavaPackage2UmlPackage jp2up, TypeAccess typeTypeAccess,
			org.eclipse.uml2.uml.Class nonParamElement, NamedElement2NamedElement c2c);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean isApplicable_checkCsp_FWD(CSP csp);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void registerObjects_FWD(PerformRuleResult ruleresult, EObject umlPackage, EObject ne2neNonParam,
			EObject uContainer, EObject jContainer, EObject nonParamType, EObject parameterizedType,
			EObject nonParamPackage, EObject jp2up, EObject ne2ne, EObject typeTypeAccess, EObject nonParamElement,
			EObject c2c, EObject parameterizedClassifier);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean checkTypes_FWD(Match match);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean isAppropriate_BWD(Match match, org.eclipse.uml2.uml.Package umlPackage,
			org.eclipse.uml2.uml.Class uContainer, org.eclipse.uml2.uml.Class nonParamElement,
			org.eclipse.uml2.uml.Class parameterizedClassifier);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	IsApplicableRuleResult isApplicable_BWD(Match match);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void registerObjectsToMatch_BWD(Match match, org.eclipse.uml2.uml.Package umlPackage,
			org.eclipse.uml2.uml.Class uContainer, org.eclipse.uml2.uml.Class nonParamElement,
			org.eclipse.uml2.uml.Class parameterizedClassifier);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	CSP isAppropriate_solveCsp_BWD(Match match, org.eclipse.uml2.uml.Package umlPackage,
			org.eclipse.uml2.uml.Class uContainer, org.eclipse.uml2.uml.Class nonParamElement,
			org.eclipse.uml2.uml.Class parameterizedClassifier);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean isAppropriate_checkCsp_BWD(CSP csp);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, org.eclipse.uml2.uml.Package umlPackage,
			NamedElement2NamedElement ne2neNonParam, org.eclipse.uml2.uml.Class uContainer, TypeDeclaration jContainer,
			AbstractTypeDeclaration nonParamType, org.eclipse.modisco.java.Package nonParamPackage,
			JavaPackage2UmlPackage jp2up, org.eclipse.uml2.uml.Class nonParamElement, NamedElement2NamedElement c2c,
			org.eclipse.uml2.uml.Class parameterizedClassifier);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean isApplicable_checkCsp_BWD(CSP csp);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void registerObjects_BWD(PerformRuleResult ruleresult, EObject umlPackage, EObject ne2neNonParam,
			EObject uContainer, EObject jContainer, EObject nonParamType, EObject parameterizedType,
			EObject nonParamPackage, EObject jp2up, EObject ne2ne, EObject typeTypeAccess, EObject nonParamElement,
			EObject c2c, EObject parameterizedClassifier);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean checkTypes_BWD(Match match);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EObjectContainer isAppropriate_BWD_EMoflonEdge_961(EMoflonEdge _edge_packagedElement);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EObjectContainer isAppropriate_FWD_EMoflonEdge_984(EMoflonEdge _edge_type);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	AttributeConstraintsRuleResult checkAttributes_BWD(TripleMatch __tripleMatch);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	IsApplicableRuleResult isApplicable_CC(Match sourceMatch, Match targetMatch);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	CSP isApplicable_solveCsp_CC(org.eclipse.uml2.uml.Package umlPackage, org.eclipse.uml2.uml.Class uContainer,
			TypeDeclaration jContainer, AbstractTypeDeclaration nonParamType, ParameterizedType parameterizedType,
			org.eclipse.modisco.java.Package nonParamPackage, TypeAccess typeTypeAccess,
			org.eclipse.uml2.uml.Class nonParamElement, org.eclipse.uml2.uml.Class parameterizedClassifier,
			Match sourceMatch, Match targetMatch);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean isApplicable_checkCsp_CC(CSP csp);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean checkDEC_FWD(TypeDeclaration jContainer, AbstractTypeDeclaration nonParamType,
			ParameterizedType parameterizedType, org.eclipse.modisco.java.Package nonParamPackage,
			TypeAccess typeTypeAccess);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean checkDEC_BWD(org.eclipse.uml2.uml.Package umlPackage, org.eclipse.uml2.uml.Class uContainer,
			org.eclipse.uml2.uml.Class nonParamElement, org.eclipse.uml2.uml.Class parameterizedClassifier);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer,
			NamedElement2NamedElement ne2neNonParamParameter);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, org.eclipse.uml2.uml.Package umlPackage,
			NamedElement2NamedElement ne2neNonParam, org.eclipse.uml2.uml.Class uContainer, TypeDeclaration jContainer,
			AbstractTypeDeclaration nonParamType, org.eclipse.modisco.java.Package nonParamPackage,
			JavaPackage2UmlPackage jp2up, org.eclipse.uml2.uml.Class nonParamElement, NamedElement2NamedElement c2c,
			ModelgeneratorRuleResult ruleResult);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean generateModel_checkCsp_BWD(CSP csp);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // ParameterizedType2Class_InnerTypeInClass
