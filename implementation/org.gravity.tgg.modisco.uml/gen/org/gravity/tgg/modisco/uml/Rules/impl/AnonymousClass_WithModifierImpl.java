/**
 */
package org.gravity.tgg.modisco.uml.Rules.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.LinkedList;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;

import org.eclipse.modisco.java.AbstractTypeDeclaration;
import org.eclipse.modisco.java.AnnotationMemberValuePair;
import org.eclipse.modisco.java.AnonymousClassDeclaration;
import org.eclipse.modisco.java.ArrayInitializer;
import org.eclipse.modisco.java.BodyDeclaration;

import org.eclipse.modisco.java.emf.JavaFactory;

import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.UMLFactory;

import org.gravity.modisco.MClassInstanceCreation;
import org.gravity.modisco.MDefinition;
import org.gravity.modisco.ModiscoFactory;

import org.gravity.tgg.modisco.uml.ASTNode2Element;
import org.gravity.tgg.modisco.uml.NamedElement2NamedElement;

import org.gravity.tgg.modisco.uml.Rules.AnonymousClass_WithModifier;
import org.gravity.tgg.modisco.uml.Rules.RulesPackage;

import org.gravity.tgg.modisco.uml.UmlFactory;

import org.moflon.tgg.language.csp.CSP;

import org.moflon.tgg.language.modelgenerator.RuleEntryContainer;
import org.moflon.tgg.language.modelgenerator.RuleEntryList;

import org.moflon.tgg.runtime.AttributeConstraintsRuleResult;
import org.moflon.tgg.runtime.CCMatch;
import org.moflon.tgg.runtime.EMoflonEdge;
import org.moflon.tgg.runtime.EObjectContainer;
import org.moflon.tgg.runtime.IsApplicableMatch;
import org.moflon.tgg.runtime.IsApplicableRuleResult;
import org.moflon.tgg.runtime.Match;
import org.moflon.tgg.runtime.ModelgeneratorRuleResult;
import org.moflon.tgg.runtime.PerformRuleResult;
import org.moflon.tgg.runtime.RuntimeFactory;
import org.moflon.tgg.runtime.TripleMatch;

import org.moflon.tgg.runtime.impl.AbstractRuleImpl;
// <-- [user defined imports]
import org.moflon.tgg.csp.*;
import org.gravity.tgg.modisco.uml.csp.constraints.*;
import org.moflon.tgg.csp.constraints.*;
import org.moflon.tgg.language.csp.*;
import org.moflon.tgg.runtime.TripleMatchNodeMapping;
import java.util.Optional;
import org.moflon.tgg.algorithm.delta.attribute.CheckAttributeHelper;
import SDMLanguage.expressions.ComparingOperator;
import org.moflon.tgg.runtime.TripleMatchNodeMapping;
import java.util.Optional;
import org.moflon.tgg.algorithm.delta.attribute.CheckAttributeHelper;
import SDMLanguage.expressions.ComparingOperator;
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Anonymous Class With Modifier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class AnonymousClass_WithModifierImpl extends AbstractRuleImpl implements AnonymousClass_WithModifier {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnonymousClass_WithModifierImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getAnonymousClass_WithModifier();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, AbstractTypeDeclaration jContainer,
			MClassInstanceCreation mConstructor, AnonymousClassDeclaration mAnon, MDefinition mMember) {

		Object[] result1_black = AnonymousClass_WithModifierImpl
				.pattern_AnonymousClass_WithModifier_0_1_initialbindings_blackBBBBBB(this, match, jContainer,
						mConstructor, mAnon, mMember);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[jContainer] = " + jContainer + ", " + "[mConstructor] = "
					+ mConstructor + ", " + "[mAnon] = " + mAnon + ", " + "[mMember] = " + mMember + ".");
		}

		Object[] result2_bindingAndBlack = AnonymousClass_WithModifierImpl
				.pattern_AnonymousClass_WithModifier_0_2_SolveCSP_bindingAndBlackFBBBBBB(this, match, jContainer,
						mConstructor, mAnon, mMember);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[jContainer] = " + jContainer + ", " + "[mConstructor] = "
					+ mConstructor + ", " + "[mAnon] = " + mAnon + ", " + "[mMember] = " + mMember + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (AnonymousClass_WithModifierImpl.pattern_AnonymousClass_WithModifier_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = AnonymousClass_WithModifierImpl
					.pattern_AnonymousClass_WithModifier_0_4_collectelementstobetranslated_blackBBBBB(match, jContainer,
							mConstructor, mAnon, mMember);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[jContainer] = " + jContainer + ", " + "[mConstructor] = " + mConstructor + ", "
						+ "[mAnon] = " + mAnon + ", " + "[mMember] = " + mMember + ".");
			}
			AnonymousClass_WithModifierImpl
					.pattern_AnonymousClass_WithModifier_0_4_collectelementstobetranslated_greenBBBBFFF(match,
							mConstructor, mAnon, mMember);
			//nothing EMoflonEdge mConstructor__mAnon____anonymousClassDeclaration = (EMoflonEdge) result4_green[4];
			//nothing EMoflonEdge mAnon__mConstructor____classInstanceCreation = (EMoflonEdge) result4_green[5];
			//nothing EMoflonEdge mMember__mConstructor____mMethodInvocations = (EMoflonEdge) result4_green[6];

			Object[] result5_black = AnonymousClass_WithModifierImpl
					.pattern_AnonymousClass_WithModifier_0_5_collectcontextelements_blackBBBBB(match, jContainer,
							mConstructor, mAnon, mMember);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[jContainer] = " + jContainer + ", " + "[mConstructor] = " + mConstructor + ", "
						+ "[mAnon] = " + mAnon + ", " + "[mMember] = " + mMember + ".");
			}
			AnonymousClass_WithModifierImpl.pattern_AnonymousClass_WithModifier_0_5_collectcontextelements_greenBBBFF(
					match, jContainer, mMember);
			//nothing EMoflonEdge jContainer__mMember____bodyDeclarations = (EMoflonEdge) result5_green[3];
			//nothing EMoflonEdge mMember__jContainer____abstractTypeDeclaration = (EMoflonEdge) result5_green[4];

			// 
			AnonymousClass_WithModifierImpl
					.pattern_AnonymousClass_WithModifier_0_6_registerobjectstomatch_expressionBBBBBB(this, match,
							jContainer, mConstructor, mAnon, mMember);
			return AnonymousClass_WithModifierImpl.pattern_AnonymousClass_WithModifier_0_7_expressionF();
		} else {
			return AnonymousClass_WithModifierImpl.pattern_AnonymousClass_WithModifier_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = AnonymousClass_WithModifierImpl
				.pattern_AnonymousClass_WithModifier_1_1_performtransformation_bindingAndBlackFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		org.eclipse.uml2.uml.Class uContainer = (org.eclipse.uml2.uml.Class) result1_bindingAndBlack[0];
		AbstractTypeDeclaration jContainer = (AbstractTypeDeclaration) result1_bindingAndBlack[1];
		MClassInstanceCreation mConstructor = (MClassInstanceCreation) result1_bindingAndBlack[2];
		NamedElement2NamedElement ne2ne = (NamedElement2NamedElement) result1_bindingAndBlack[3];
		AnonymousClassDeclaration mAnon = (AnonymousClassDeclaration) result1_bindingAndBlack[4];
		MDefinition mMember = (MDefinition) result1_bindingAndBlack[5];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[6];
		Object[] result1_green = AnonymousClass_WithModifierImpl
				.pattern_AnonymousClass_WithModifier_1_1_performtransformation_greenFBFB(uContainer, mAnon);
		ASTNode2Element bd2ne = (ASTNode2Element) result1_green[0];
		org.eclipse.uml2.uml.Class uAnon = (org.eclipse.uml2.uml.Class) result1_green[2];

		Object[] result2_black = AnonymousClass_WithModifierImpl
				.pattern_AnonymousClass_WithModifier_1_2_collecttranslatedelements_blackBBBB(bd2ne, mConstructor, uAnon,
						mAnon);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[bd2ne] = " + bd2ne + ", " + "[mConstructor] = "
							+ mConstructor + ", " + "[uAnon] = " + uAnon + ", " + "[mAnon] = " + mAnon + ".");
		}
		Object[] result2_green = AnonymousClass_WithModifierImpl
				.pattern_AnonymousClass_WithModifier_1_2_collecttranslatedelements_greenFBBBB(bd2ne, mConstructor,
						uAnon, mAnon);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = AnonymousClass_WithModifierImpl
				.pattern_AnonymousClass_WithModifier_1_3_bookkeepingforedges_blackBBBBBBBBB(ruleresult, bd2ne,
						uContainer, jContainer, mConstructor, uAnon, ne2ne, mAnon, mMember);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[bd2ne] = " + bd2ne + ", " + "[uContainer] = " + uContainer + ", " + "[jContainer] = "
					+ jContainer + ", " + "[mConstructor] = " + mConstructor + ", " + "[uAnon] = " + uAnon + ", "
					+ "[ne2ne] = " + ne2ne + ", " + "[mAnon] = " + mAnon + ", " + "[mMember] = " + mMember + ".");
		}
		AnonymousClass_WithModifierImpl.pattern_AnonymousClass_WithModifier_1_3_bookkeepingforedges_greenBBBBBBBFFFFFF(
				ruleresult, bd2ne, uContainer, mConstructor, uAnon, mAnon, mMember);
		//nothing EMoflonEdge mConstructor__mAnon____anonymousClassDeclaration = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge mAnon__mConstructor____classInstanceCreation = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge bd2ne__uAnon____target = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge bd2ne__mAnon____source = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge mMember__mConstructor____mMethodInvocations = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge uContainer__uAnon____nestedClassifier = (EMoflonEdge) result3_green[12];

		// 
		// 
		AnonymousClass_WithModifierImpl.pattern_AnonymousClass_WithModifier_1_5_registerobjects_expressionBBBBBBBBBB(
				this, ruleresult, bd2ne, uContainer, jContainer, mConstructor, uAnon, ne2ne, mAnon, mMember);
		return AnonymousClass_WithModifierImpl.pattern_AnonymousClass_WithModifier_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = AnonymousClass_WithModifierImpl
				.pattern_AnonymousClass_WithModifier_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = AnonymousClass_WithModifierImpl
				.pattern_AnonymousClass_WithModifier_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = AnonymousClass_WithModifierImpl
				.pattern_AnonymousClass_WithModifier_2_2_corematch_bindingFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		AbstractTypeDeclaration jContainer = (AbstractTypeDeclaration) result2_binding[0];
		MClassInstanceCreation mConstructor = (MClassInstanceCreation) result2_binding[1];
		AnonymousClassDeclaration mAnon = (AnonymousClassDeclaration) result2_binding[2];
		MDefinition mMember = (MDefinition) result2_binding[3];
		for (Object[] result2_black : AnonymousClass_WithModifierImpl
				.pattern_AnonymousClass_WithModifier_2_2_corematch_blackFBBFBBB(jContainer, mConstructor, mAnon,
						mMember, match)) {
			org.eclipse.uml2.uml.Class uContainer = (org.eclipse.uml2.uml.Class) result2_black[0];
			NamedElement2NamedElement ne2ne = (NamedElement2NamedElement) result2_black[3];
			// ForEach 
			for (Object[] result3_black : AnonymousClass_WithModifierImpl
					.pattern_AnonymousClass_WithModifier_2_3_findcontext_blackBBBBBB(uContainer, jContainer,
							mConstructor, ne2ne, mAnon, mMember)) {
				Object[] result3_green = AnonymousClass_WithModifierImpl
						.pattern_AnonymousClass_WithModifier_2_3_findcontext_greenBBBBBBFFFFFFFF(uContainer, jContainer,
								mConstructor, ne2ne, mAnon, mMember);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[6];
				//nothing EMoflonEdge mConstructor__mAnon____anonymousClassDeclaration = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge mAnon__mConstructor____classInstanceCreation = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge ne2ne__jContainer____source = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge ne2ne__uContainer____target = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge mMember__mConstructor____mMethodInvocations = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge jContainer__mMember____bodyDeclarations = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge mMember__jContainer____abstractTypeDeclaration = (EMoflonEdge) result3_green[13];

				Object[] result4_bindingAndBlack = AnonymousClass_WithModifierImpl
						.pattern_AnonymousClass_WithModifier_2_4_solveCSP_bindingAndBlackFBBBBBBBB(this,
								isApplicableMatch, uContainer, jContainer, mConstructor, ne2ne, mAnon, mMember);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[uContainer] = " + uContainer
							+ ", " + "[jContainer] = " + jContainer + ", " + "[mConstructor] = " + mConstructor + ", "
							+ "[ne2ne] = " + ne2ne + ", " + "[mAnon] = " + mAnon + ", " + "[mMember] = " + mMember
							+ ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (AnonymousClass_WithModifierImpl.pattern_AnonymousClass_WithModifier_2_5_checkCSP_expressionFBB(this,
						csp)) {

					Object[] result6_black = AnonymousClass_WithModifierImpl
							.pattern_AnonymousClass_WithModifier_2_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					AnonymousClass_WithModifierImpl
							.pattern_AnonymousClass_WithModifier_2_6_addmatchtoruleresult_greenBB(ruleresult,
									isApplicableMatch);

				} else {
				}

			}

		}
		return AnonymousClass_WithModifierImpl.pattern_AnonymousClass_WithModifier_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, AbstractTypeDeclaration jContainer,
			MClassInstanceCreation mConstructor, AnonymousClassDeclaration mAnon, MDefinition mMember) {
		match.registerObject("jContainer", jContainer);
		match.registerObject("mConstructor", mConstructor);
		match.registerObject("mAnon", mAnon);
		match.registerObject("mMember", mMember);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, AbstractTypeDeclaration jContainer,
			MClassInstanceCreation mConstructor, AnonymousClassDeclaration mAnon, MDefinition mMember) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP
		return csp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_checkCsp_FWD(CSP csp) {
		return csp.check();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, org.eclipse.uml2.uml.Class uContainer,
			AbstractTypeDeclaration jContainer, MClassInstanceCreation mConstructor, NamedElement2NamedElement ne2ne,
			AnonymousClassDeclaration mAnon, MDefinition mMember) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("uContainer", uContainer);
		isApplicableMatch.registerObject("jContainer", jContainer);
		isApplicableMatch.registerObject("mConstructor", mConstructor);
		isApplicableMatch.registerObject("ne2ne", ne2ne);
		isApplicableMatch.registerObject("mAnon", mAnon);
		isApplicableMatch.registerObject("mMember", mMember);
		return csp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isApplicable_checkCsp_FWD(CSP csp) {
		return csp.check();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject bd2ne, EObject uContainer, EObject jContainer,
			EObject mConstructor, EObject uAnon, EObject ne2ne, EObject mAnon, EObject mMember) {
		ruleresult.registerObject("bd2ne", bd2ne);
		ruleresult.registerObject("uContainer", uContainer);
		ruleresult.registerObject("jContainer", jContainer);
		ruleresult.registerObject("mConstructor", mConstructor);
		ruleresult.registerObject("uAnon", uAnon);
		ruleresult.registerObject("ne2ne", ne2ne);
		ruleresult.registerObject("mAnon", mAnon);
		ruleresult.registerObject("mMember", mMember);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("mConstructor").eClass())
						.equals("modisco.MClassInstanceCreation.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("mAnon").eClass())
						.equals("java.AnonymousClassDeclaration.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, org.eclipse.uml2.uml.Class uContainer,
			org.eclipse.uml2.uml.Class uAnon) {

		Object[] result1_black = AnonymousClass_WithModifierImpl
				.pattern_AnonymousClass_WithModifier_10_1_initialbindings_blackBBBB(this, match, uContainer, uAnon);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[uContainer] = " + uContainer + ", " + "[uAnon] = " + uAnon + ".");
		}

		Object[] result2_bindingAndBlack = AnonymousClass_WithModifierImpl
				.pattern_AnonymousClass_WithModifier_10_2_SolveCSP_bindingAndBlackFBBBB(this, match, uContainer, uAnon);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[uContainer] = " + uContainer + ", " + "[uAnon] = " + uAnon + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (AnonymousClass_WithModifierImpl.pattern_AnonymousClass_WithModifier_10_3_CheckCSP_expressionFBB(this,
				csp)) {

			Object[] result4_black = AnonymousClass_WithModifierImpl
					.pattern_AnonymousClass_WithModifier_10_4_collectelementstobetranslated_blackBBB(match, uContainer,
							uAnon);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[uContainer] = " + uContainer + ", " + "[uAnon] = " + uAnon + ".");
			}
			AnonymousClass_WithModifierImpl
					.pattern_AnonymousClass_WithModifier_10_4_collectelementstobetranslated_greenBBBF(match, uContainer,
							uAnon);
			//nothing EMoflonEdge uContainer__uAnon____nestedClassifier = (EMoflonEdge) result4_green[3];

			Object[] result5_black = AnonymousClass_WithModifierImpl
					.pattern_AnonymousClass_WithModifier_10_5_collectcontextelements_blackBBB(match, uContainer, uAnon);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[uContainer] = " + uContainer + ", " + "[uAnon] = " + uAnon + ".");
			}
			AnonymousClass_WithModifierImpl
					.pattern_AnonymousClass_WithModifier_10_5_collectcontextelements_greenBB(match, uContainer);

			// 
			AnonymousClass_WithModifierImpl
					.pattern_AnonymousClass_WithModifier_10_6_registerobjectstomatch_expressionBBBB(this, match,
							uContainer, uAnon);
			return AnonymousClass_WithModifierImpl.pattern_AnonymousClass_WithModifier_10_7_expressionF();
		} else {
			return AnonymousClass_WithModifierImpl.pattern_AnonymousClass_WithModifier_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = AnonymousClass_WithModifierImpl
				.pattern_AnonymousClass_WithModifier_11_1_performtransformation_bindingAndBlackFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		org.eclipse.uml2.uml.Class uContainer = (org.eclipse.uml2.uml.Class) result1_bindingAndBlack[0];
		AbstractTypeDeclaration jContainer = (AbstractTypeDeclaration) result1_bindingAndBlack[1];
		org.eclipse.uml2.uml.Class uAnon = (org.eclipse.uml2.uml.Class) result1_bindingAndBlack[2];
		NamedElement2NamedElement ne2ne = (NamedElement2NamedElement) result1_bindingAndBlack[3];
		MDefinition mMember = (MDefinition) result1_bindingAndBlack[4];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[5];
		Object[] result1_green = AnonymousClass_WithModifierImpl
				.pattern_AnonymousClass_WithModifier_11_1_performtransformation_greenFFBFB(uAnon, mMember);
		ASTNode2Element bd2ne = (ASTNode2Element) result1_green[0];
		MClassInstanceCreation mConstructor = (MClassInstanceCreation) result1_green[1];
		AnonymousClassDeclaration mAnon = (AnonymousClassDeclaration) result1_green[3];

		Object[] result2_black = AnonymousClass_WithModifierImpl
				.pattern_AnonymousClass_WithModifier_11_2_collecttranslatedelements_blackBBBB(bd2ne, mConstructor,
						uAnon, mAnon);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[bd2ne] = " + bd2ne + ", " + "[mConstructor] = "
							+ mConstructor + ", " + "[uAnon] = " + uAnon + ", " + "[mAnon] = " + mAnon + ".");
		}
		Object[] result2_green = AnonymousClass_WithModifierImpl
				.pattern_AnonymousClass_WithModifier_11_2_collecttranslatedelements_greenFBBBB(bd2ne, mConstructor,
						uAnon, mAnon);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = AnonymousClass_WithModifierImpl
				.pattern_AnonymousClass_WithModifier_11_3_bookkeepingforedges_blackBBBBBBBBB(ruleresult, bd2ne,
						uContainer, jContainer, mConstructor, uAnon, ne2ne, mAnon, mMember);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[bd2ne] = " + bd2ne + ", " + "[uContainer] = " + uContainer + ", " + "[jContainer] = "
					+ jContainer + ", " + "[mConstructor] = " + mConstructor + ", " + "[uAnon] = " + uAnon + ", "
					+ "[ne2ne] = " + ne2ne + ", " + "[mAnon] = " + mAnon + ", " + "[mMember] = " + mMember + ".");
		}
		AnonymousClass_WithModifierImpl.pattern_AnonymousClass_WithModifier_11_3_bookkeepingforedges_greenBBBBBBBFFFFFF(
				ruleresult, bd2ne, uContainer, mConstructor, uAnon, mAnon, mMember);
		//nothing EMoflonEdge mConstructor__mAnon____anonymousClassDeclaration = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge mAnon__mConstructor____classInstanceCreation = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge bd2ne__uAnon____target = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge bd2ne__mAnon____source = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge mMember__mConstructor____mMethodInvocations = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge uContainer__uAnon____nestedClassifier = (EMoflonEdge) result3_green[12];

		// 
		// 
		AnonymousClass_WithModifierImpl.pattern_AnonymousClass_WithModifier_11_5_registerobjects_expressionBBBBBBBBBB(
				this, ruleresult, bd2ne, uContainer, jContainer, mConstructor, uAnon, ne2ne, mAnon, mMember);
		return AnonymousClass_WithModifierImpl.pattern_AnonymousClass_WithModifier_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = AnonymousClass_WithModifierImpl
				.pattern_AnonymousClass_WithModifier_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = AnonymousClass_WithModifierImpl
				.pattern_AnonymousClass_WithModifier_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = AnonymousClass_WithModifierImpl
				.pattern_AnonymousClass_WithModifier_12_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		org.eclipse.uml2.uml.Class uContainer = (org.eclipse.uml2.uml.Class) result2_binding[0];
		org.eclipse.uml2.uml.Class uAnon = (org.eclipse.uml2.uml.Class) result2_binding[1];
		for (Object[] result2_black : AnonymousClass_WithModifierImpl
				.pattern_AnonymousClass_WithModifier_12_2_corematch_blackBFBFB(uContainer, uAnon, match)) {
			AbstractTypeDeclaration jContainer = (AbstractTypeDeclaration) result2_black[1];
			NamedElement2NamedElement ne2ne = (NamedElement2NamedElement) result2_black[3];
			// ForEach 
			for (Object[] result3_black : AnonymousClass_WithModifierImpl
					.pattern_AnonymousClass_WithModifier_12_3_findcontext_blackBBBBF(uContainer, jContainer, uAnon,
							ne2ne)) {
				MDefinition mMember = (MDefinition) result3_black[4];
				Object[] result3_green = AnonymousClass_WithModifierImpl
						.pattern_AnonymousClass_WithModifier_12_3_findcontext_greenBBBBBFFFFFF(uContainer, jContainer,
								uAnon, ne2ne, mMember);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[5];
				//nothing EMoflonEdge ne2ne__jContainer____source = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge ne2ne__uContainer____target = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge jContainer__mMember____bodyDeclarations = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge mMember__jContainer____abstractTypeDeclaration = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge uContainer__uAnon____nestedClassifier = (EMoflonEdge) result3_green[10];

				Object[] result4_bindingAndBlack = AnonymousClass_WithModifierImpl
						.pattern_AnonymousClass_WithModifier_12_4_solveCSP_bindingAndBlackFBBBBBBB(this,
								isApplicableMatch, uContainer, jContainer, uAnon, ne2ne, mMember);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[uContainer] = " + uContainer
							+ ", " + "[jContainer] = " + jContainer + ", " + "[uAnon] = " + uAnon + ", " + "[ne2ne] = "
							+ ne2ne + ", " + "[mMember] = " + mMember + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (AnonymousClass_WithModifierImpl
						.pattern_AnonymousClass_WithModifier_12_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = AnonymousClass_WithModifierImpl
							.pattern_AnonymousClass_WithModifier_12_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					AnonymousClass_WithModifierImpl
							.pattern_AnonymousClass_WithModifier_12_6_addmatchtoruleresult_greenBB(ruleresult,
									isApplicableMatch);

				} else {
				}

			}

		}
		return AnonymousClass_WithModifierImpl.pattern_AnonymousClass_WithModifier_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, org.eclipse.uml2.uml.Class uContainer,
			org.eclipse.uml2.uml.Class uAnon) {
		match.registerObject("uContainer", uContainer);
		match.registerObject("uAnon", uAnon);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, org.eclipse.uml2.uml.Class uContainer,
			org.eclipse.uml2.uml.Class uAnon) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP
		return csp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_checkCsp_BWD(CSP csp) {
		return csp.check();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, org.eclipse.uml2.uml.Class uContainer,
			AbstractTypeDeclaration jContainer, org.eclipse.uml2.uml.Class uAnon, NamedElement2NamedElement ne2ne,
			MDefinition mMember) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("uContainer", uContainer);
		isApplicableMatch.registerObject("jContainer", jContainer);
		isApplicableMatch.registerObject("uAnon", uAnon);
		isApplicableMatch.registerObject("ne2ne", ne2ne);
		isApplicableMatch.registerObject("mMember", mMember);
		return csp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isApplicable_checkCsp_BWD(CSP csp) {
		return csp.check();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject bd2ne, EObject uContainer, EObject jContainer,
			EObject mConstructor, EObject uAnon, EObject ne2ne, EObject mAnon, EObject mMember) {
		ruleresult.registerObject("bd2ne", bd2ne);
		ruleresult.registerObject("uContainer", uContainer);
		ruleresult.registerObject("jContainer", jContainer);
		ruleresult.registerObject("mConstructor", mConstructor);
		ruleresult.registerObject("uAnon", uAnon);
		ruleresult.registerObject("ne2ne", ne2ne);
		ruleresult.registerObject("mAnon", mAnon);
		ruleresult.registerObject("mMember", mMember);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("uAnon").eClass()).equals("uml.Class.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_981(EMoflonEdge _edge_nestedClassifier) {

		Object[] result1_bindingAndBlack = AnonymousClass_WithModifierImpl
				.pattern_AnonymousClass_WithModifier_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = AnonymousClass_WithModifierImpl
				.pattern_AnonymousClass_WithModifier_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : AnonymousClass_WithModifierImpl
				.pattern_AnonymousClass_WithModifier_20_2_testcorematchandDECs_blackFFB(_edge_nestedClassifier)) {
			org.eclipse.uml2.uml.Class uContainer = (org.eclipse.uml2.uml.Class) result2_black[0];
			org.eclipse.uml2.uml.Class uAnon = (org.eclipse.uml2.uml.Class) result2_black[1];
			Object[] result2_green = AnonymousClass_WithModifierImpl
					.pattern_AnonymousClass_WithModifier_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (AnonymousClass_WithModifierImpl
					.pattern_AnonymousClass_WithModifier_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
							this, match, uContainer, uAnon)) {
				// 
				if (AnonymousClass_WithModifierImpl
						.pattern_AnonymousClass_WithModifier_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = AnonymousClass_WithModifierImpl
							.pattern_AnonymousClass_WithModifier_20_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					AnonymousClass_WithModifierImpl
							.pattern_AnonymousClass_WithModifier_20_5_Addmatchtoruleresult_greenBBBB(match,
									__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return AnonymousClass_WithModifierImpl.pattern_AnonymousClass_WithModifier_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_1004(EMoflonEdge _edge_anonymousClassDeclaration) {

		Object[] result1_bindingAndBlack = AnonymousClass_WithModifierImpl
				.pattern_AnonymousClass_WithModifier_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = AnonymousClass_WithModifierImpl
				.pattern_AnonymousClass_WithModifier_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : AnonymousClass_WithModifierImpl
				.pattern_AnonymousClass_WithModifier_21_2_testcorematchandDECs_blackFFFFB(
						_edge_anonymousClassDeclaration)) {
			AbstractTypeDeclaration jContainer = (AbstractTypeDeclaration) result2_black[0];
			MClassInstanceCreation mConstructor = (MClassInstanceCreation) result2_black[1];
			AnonymousClassDeclaration mAnon = (AnonymousClassDeclaration) result2_black[2];
			MDefinition mMember = (MDefinition) result2_black[3];
			Object[] result2_green = AnonymousClass_WithModifierImpl
					.pattern_AnonymousClass_WithModifier_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (AnonymousClass_WithModifierImpl
					.pattern_AnonymousClass_WithModifier_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(
							this, match, jContainer, mConstructor, mAnon, mMember)) {
				// 
				if (AnonymousClass_WithModifierImpl
						.pattern_AnonymousClass_WithModifier_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = AnonymousClass_WithModifierImpl
							.pattern_AnonymousClass_WithModifier_21_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					AnonymousClass_WithModifierImpl
							.pattern_AnonymousClass_WithModifier_21_5_Addmatchtoruleresult_greenBBBB(match,
									__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return AnonymousClass_WithModifierImpl.pattern_AnonymousClass_WithModifier_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("AnonymousClass_WithModifier");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		if (!__helper.hasExpectedValue("uAnon", "name", "Anonymous", ComparingOperator.EQUAL)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
			} else {
				ruleResult.setSuccess(false);
				return ruleResult;
			}
		}

		return ruleResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_BWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("AnonymousClass_WithModifier");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		if (!__helper.hasExpectedValue("uAnon", "name", "Anonymous", ComparingOperator.EQUAL)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
			} else {
				ruleResult.setSuccess(false);
				return ruleResult;
			}
		}

		return ruleResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_CC(Match sourceMatch, Match targetMatch) {

		Object[] result1_black = AnonymousClass_WithModifierImpl
				.pattern_AnonymousClass_WithModifier_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = AnonymousClass_WithModifierImpl
				.pattern_AnonymousClass_WithModifier_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = AnonymousClass_WithModifierImpl
				.pattern_AnonymousClass_WithModifier_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFBB(sourceMatch,
						targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		org.eclipse.uml2.uml.Class uContainer = (org.eclipse.uml2.uml.Class) result2_bindingAndBlack[0];
		AbstractTypeDeclaration jContainer = (AbstractTypeDeclaration) result2_bindingAndBlack[1];
		MClassInstanceCreation mConstructor = (MClassInstanceCreation) result2_bindingAndBlack[2];
		org.eclipse.uml2.uml.Class uAnon = (org.eclipse.uml2.uml.Class) result2_bindingAndBlack[3];
		AnonymousClassDeclaration mAnon = (AnonymousClassDeclaration) result2_bindingAndBlack[4];
		MDefinition mMember = (MDefinition) result2_bindingAndBlack[5];

		Object[] result3_bindingAndBlack = AnonymousClass_WithModifierImpl
				.pattern_AnonymousClass_WithModifier_24_3_solvecsp_bindingAndBlackFBBBBBBBBB(this, uContainer,
						jContainer, mConstructor, uAnon, mAnon, mMember, sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[uContainer] = " + uContainer + ", " + "[jContainer] = " + jContainer + ", "
					+ "[mConstructor] = " + mConstructor + ", " + "[uAnon] = " + uAnon + ", " + "[mAnon] = " + mAnon
					+ ", " + "[mMember] = " + mMember + ", " + "[sourceMatch] = " + sourceMatch + ", "
					+ "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (AnonymousClass_WithModifierImpl.pattern_AnonymousClass_WithModifier_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : AnonymousClass_WithModifierImpl
					.pattern_AnonymousClass_WithModifier_24_5_matchcorrcontext_blackBBFBB(uContainer, jContainer,
							sourceMatch, targetMatch)) {
				NamedElement2NamedElement ne2ne = (NamedElement2NamedElement) result5_black[2];
				Object[] result5_green = AnonymousClass_WithModifierImpl
						.pattern_AnonymousClass_WithModifier_24_5_matchcorrcontext_greenBBBF(ne2ne, sourceMatch,
								targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[3];

				Object[] result6_black = AnonymousClass_WithModifierImpl
						.pattern_AnonymousClass_WithModifier_24_6_createcorrespondence_blackBBBBBBB(uContainer,
								jContainer, mConstructor, uAnon, mAnon, mMember, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[uContainer] = "
							+ uContainer + ", " + "[jContainer] = " + jContainer + ", " + "[mConstructor] = "
							+ mConstructor + ", " + "[uAnon] = " + uAnon + ", " + "[mAnon] = " + mAnon + ", "
							+ "[mMember] = " + mMember + ", " + "[ccMatch] = " + ccMatch + ".");
				}
				AnonymousClass_WithModifierImpl
						.pattern_AnonymousClass_WithModifier_24_6_createcorrespondence_greenFBBB(uAnon, mAnon, ccMatch);
				//nothing ASTNode2Element bd2ne = (ASTNode2Element) result6_green[0];

				Object[] result7_black = AnonymousClass_WithModifierImpl
						.pattern_AnonymousClass_WithModifier_24_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				AnonymousClass_WithModifierImpl
						.pattern_AnonymousClass_WithModifier_24_7_addtoreturnedresult_greenBB(result, ccMatch);

			}

		} else {
		}
		return AnonymousClass_WithModifierImpl.pattern_AnonymousClass_WithModifier_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(org.eclipse.uml2.uml.Class uContainer, AbstractTypeDeclaration jContainer,
			MClassInstanceCreation mConstructor, org.eclipse.uml2.uml.Class uAnon, AnonymousClassDeclaration mAnon,
			MDefinition mMember, Match sourceMatch, Match targetMatch) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP
		return csp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isApplicable_checkCsp_CC(CSP csp) {
		return csp.check();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_FWD(AbstractTypeDeclaration jContainer, MClassInstanceCreation mConstructor,
			AnonymousClassDeclaration mAnon, MDefinition mMember) {// 
		Object[] result1_black = AnonymousClass_WithModifierImpl
				.pattern_AnonymousClass_WithModifier_27_1_matchtggpattern_blackBBBB(jContainer, mConstructor, mAnon,
						mMember);
		if (result1_black != null) {
			return AnonymousClass_WithModifierImpl.pattern_AnonymousClass_WithModifier_27_2_expressionF();
		} else {
			return AnonymousClass_WithModifierImpl.pattern_AnonymousClass_WithModifier_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(org.eclipse.uml2.uml.Class uContainer, org.eclipse.uml2.uml.Class uAnon) {// 
		Object[] result1_black = AnonymousClass_WithModifierImpl
				.pattern_AnonymousClass_WithModifier_28_1_matchtggpattern_blackBB(uContainer, uAnon);
		if (result1_black != null) {
			AnonymousClass_WithModifierImpl.pattern_AnonymousClass_WithModifier_28_1_matchtggpattern_greenB(uAnon);

			return AnonymousClass_WithModifierImpl.pattern_AnonymousClass_WithModifier_28_2_expressionF();
		} else {
			return AnonymousClass_WithModifierImpl.pattern_AnonymousClass_WithModifier_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer,
			NamedElement2NamedElement ne2neParameter) {

		Object[] result1_black = AnonymousClass_WithModifierImpl
				.pattern_AnonymousClass_WithModifier_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = AnonymousClass_WithModifierImpl
				.pattern_AnonymousClass_WithModifier_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : AnonymousClass_WithModifierImpl
				.pattern_AnonymousClass_WithModifier_29_2_isapplicablecore_blackFFFFFBB(ruleEntryContainer,
						ruleResult)) {
			//nothing RuleEntryList ne2neList = (RuleEntryList) result2_black[0];
			org.eclipse.uml2.uml.Class uContainer = (org.eclipse.uml2.uml.Class) result2_black[1];
			NamedElement2NamedElement ne2ne = (NamedElement2NamedElement) result2_black[2];
			AbstractTypeDeclaration jContainer = (AbstractTypeDeclaration) result2_black[3];
			MDefinition mMember = (MDefinition) result2_black[4];

			Object[] result3_bindingAndBlack = AnonymousClass_WithModifierImpl
					.pattern_AnonymousClass_WithModifier_29_3_solveCSP_bindingAndBlackFBBBBBBB(this, isApplicableMatch,
							uContainer, jContainer, ne2ne, mMember, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[uContainer] = " + uContainer + ", "
						+ "[jContainer] = " + jContainer + ", " + "[ne2ne] = " + ne2ne + ", " + "[mMember] = " + mMember
						+ ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (AnonymousClass_WithModifierImpl.pattern_AnonymousClass_WithModifier_29_4_checkCSP_expressionFBB(this,
					csp)) {
				// 
				Object[] result5_black = AnonymousClass_WithModifierImpl
						.pattern_AnonymousClass_WithModifier_29_5_checknacs_blackBBBB(uContainer, jContainer, ne2ne,
								mMember);
				if (result5_black != null) {

					Object[] result6_black = AnonymousClass_WithModifierImpl
							.pattern_AnonymousClass_WithModifier_29_6_perform_blackBBBBB(uContainer, jContainer, ne2ne,
									mMember, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[uContainer] = "
								+ uContainer + ", " + "[jContainer] = " + jContainer + ", " + "[ne2ne] = " + ne2ne
								+ ", " + "[mMember] = " + mMember + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					AnonymousClass_WithModifierImpl.pattern_AnonymousClass_WithModifier_29_6_perform_greenFBFFFBB(
							uContainer, mMember, ruleResult);
					//nothing ASTNode2Element bd2ne = (ASTNode2Element) result6_green[0];
					//nothing MClassInstanceCreation mConstructor = (MClassInstanceCreation) result6_green[2];
					//nothing org.eclipse.uml2.uml.Class uAnon = (org.eclipse.uml2.uml.Class) result6_green[3];
					//nothing AnonymousClassDeclaration mAnon = (AnonymousClassDeclaration) result6_green[4];

				} else {
				}

			} else {
			}

		}
		return AnonymousClass_WithModifierImpl.pattern_AnonymousClass_WithModifier_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, org.eclipse.uml2.uml.Class uContainer,
			AbstractTypeDeclaration jContainer, NamedElement2NamedElement ne2ne, MDefinition mMember,
			ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("uContainer", uContainer);
		isApplicableMatch.registerObject("jContainer", jContainer);
		isApplicableMatch.registerObject("ne2ne", ne2ne);
		isApplicableMatch.registerObject("mMember", mMember);
		return csp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean generateModel_checkCsp_BWD(CSP csp) {
		return csp.check();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case RulesPackage.ANONYMOUS_CLASS_WITH_MODIFIER___IS_APPROPRIATE_FWD__MATCH_ABSTRACTTYPEDECLARATION_MCLASSINSTANCECREATION_ANONYMOUSCLASSDECLARATION_MDEFINITION:
			return isAppropriate_FWD((Match) arguments.get(0), (AbstractTypeDeclaration) arguments.get(1),
					(MClassInstanceCreation) arguments.get(2), (AnonymousClassDeclaration) arguments.get(3),
					(MDefinition) arguments.get(4));
		case RulesPackage.ANONYMOUS_CLASS_WITH_MODIFIER___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.ANONYMOUS_CLASS_WITH_MODIFIER___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.ANONYMOUS_CLASS_WITH_MODIFIER___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_ABSTRACTTYPEDECLARATION_MCLASSINSTANCECREATION_ANONYMOUSCLASSDECLARATION_MDEFINITION:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (AbstractTypeDeclaration) arguments.get(1),
					(MClassInstanceCreation) arguments.get(2), (AnonymousClassDeclaration) arguments.get(3),
					(MDefinition) arguments.get(4));
			return null;
		case RulesPackage.ANONYMOUS_CLASS_WITH_MODIFIER___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_ABSTRACTTYPEDECLARATION_MCLASSINSTANCECREATION_ANONYMOUSCLASSDECLARATION_MDEFINITION:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (AbstractTypeDeclaration) arguments.get(1),
					(MClassInstanceCreation) arguments.get(2), (AnonymousClassDeclaration) arguments.get(3),
					(MDefinition) arguments.get(4));
		case RulesPackage.ANONYMOUS_CLASS_WITH_MODIFIER___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.ANONYMOUS_CLASS_WITH_MODIFIER___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_CLASS_ABSTRACTTYPEDECLARATION_MCLASSINSTANCECREATION_NAMEDELEMENT2NAMEDELEMENT_ANONYMOUSCLASSDECLARATION_MDEFINITION:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0),
					(org.eclipse.uml2.uml.Class) arguments.get(1), (AbstractTypeDeclaration) arguments.get(2),
					(MClassInstanceCreation) arguments.get(3), (NamedElement2NamedElement) arguments.get(4),
					(AnonymousClassDeclaration) arguments.get(5), (MDefinition) arguments.get(6));
		case RulesPackage.ANONYMOUS_CLASS_WITH_MODIFIER___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.ANONYMOUS_CLASS_WITH_MODIFIER___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8));
			return null;
		case RulesPackage.ANONYMOUS_CLASS_WITH_MODIFIER___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.ANONYMOUS_CLASS_WITH_MODIFIER___IS_APPROPRIATE_BWD__MATCH_CLASS_CLASS:
			return isAppropriate_BWD((Match) arguments.get(0), (org.eclipse.uml2.uml.Class) arguments.get(1),
					(org.eclipse.uml2.uml.Class) arguments.get(2));
		case RulesPackage.ANONYMOUS_CLASS_WITH_MODIFIER___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.ANONYMOUS_CLASS_WITH_MODIFIER___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.ANONYMOUS_CLASS_WITH_MODIFIER___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_CLASS_CLASS:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (org.eclipse.uml2.uml.Class) arguments.get(1),
					(org.eclipse.uml2.uml.Class) arguments.get(2));
			return null;
		case RulesPackage.ANONYMOUS_CLASS_WITH_MODIFIER___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_CLASS_CLASS:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (org.eclipse.uml2.uml.Class) arguments.get(1),
					(org.eclipse.uml2.uml.Class) arguments.get(2));
		case RulesPackage.ANONYMOUS_CLASS_WITH_MODIFIER___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.ANONYMOUS_CLASS_WITH_MODIFIER___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_CLASS_ABSTRACTTYPEDECLARATION_CLASS_NAMEDELEMENT2NAMEDELEMENT_MDEFINITION:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
					(org.eclipse.uml2.uml.Class) arguments.get(1), (AbstractTypeDeclaration) arguments.get(2),
					(org.eclipse.uml2.uml.Class) arguments.get(3), (NamedElement2NamedElement) arguments.get(4),
					(MDefinition) arguments.get(5));
		case RulesPackage.ANONYMOUS_CLASS_WITH_MODIFIER___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.ANONYMOUS_CLASS_WITH_MODIFIER___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8));
			return null;
		case RulesPackage.ANONYMOUS_CLASS_WITH_MODIFIER___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.ANONYMOUS_CLASS_WITH_MODIFIER___IS_APPROPRIATE_BWD_EMOFLON_EDGE_981__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_981((EMoflonEdge) arguments.get(0));
		case RulesPackage.ANONYMOUS_CLASS_WITH_MODIFIER___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1004__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_1004((EMoflonEdge) arguments.get(0));
		case RulesPackage.ANONYMOUS_CLASS_WITH_MODIFIER___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.ANONYMOUS_CLASS_WITH_MODIFIER___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.ANONYMOUS_CLASS_WITH_MODIFIER___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.ANONYMOUS_CLASS_WITH_MODIFIER___IS_APPLICABLE_SOLVE_CSP_CC__CLASS_ABSTRACTTYPEDECLARATION_MCLASSINSTANCECREATION_CLASS_ANONYMOUSCLASSDECLARATION_MDEFINITION_MATCH_MATCH:
			return isApplicable_solveCsp_CC((org.eclipse.uml2.uml.Class) arguments.get(0),
					(AbstractTypeDeclaration) arguments.get(1), (MClassInstanceCreation) arguments.get(2),
					(org.eclipse.uml2.uml.Class) arguments.get(3), (AnonymousClassDeclaration) arguments.get(4),
					(MDefinition) arguments.get(5), (Match) arguments.get(6), (Match) arguments.get(7));
		case RulesPackage.ANONYMOUS_CLASS_WITH_MODIFIER___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.ANONYMOUS_CLASS_WITH_MODIFIER___CHECK_DEC_FWD__ABSTRACTTYPEDECLARATION_MCLASSINSTANCECREATION_ANONYMOUSCLASSDECLARATION_MDEFINITION:
			return checkDEC_FWD((AbstractTypeDeclaration) arguments.get(0), (MClassInstanceCreation) arguments.get(1),
					(AnonymousClassDeclaration) arguments.get(2), (MDefinition) arguments.get(3));
		case RulesPackage.ANONYMOUS_CLASS_WITH_MODIFIER___CHECK_DEC_BWD__CLASS_CLASS:
			return checkDEC_BWD((org.eclipse.uml2.uml.Class) arguments.get(0),
					(org.eclipse.uml2.uml.Class) arguments.get(1));
		case RulesPackage.ANONYMOUS_CLASS_WITH_MODIFIER___GENERATE_MODEL__RULEENTRYCONTAINER_NAMEDELEMENT2NAMEDELEMENT:
			return generateModel((RuleEntryContainer) arguments.get(0), (NamedElement2NamedElement) arguments.get(1));
		case RulesPackage.ANONYMOUS_CLASS_WITH_MODIFIER___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_CLASS_ABSTRACTTYPEDECLARATION_NAMEDELEMENT2NAMEDELEMENT_MDEFINITION_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
					(org.eclipse.uml2.uml.Class) arguments.get(1), (AbstractTypeDeclaration) arguments.get(2),
					(NamedElement2NamedElement) arguments.get(3), (MDefinition) arguments.get(4),
					(ModelgeneratorRuleResult) arguments.get(5));
		case RulesPackage.ANONYMOUS_CLASS_WITH_MODIFIER___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_AnonymousClass_WithModifier_0_1_initialbindings_blackBBBBBB(
			AnonymousClass_WithModifier _this, Match match, AbstractTypeDeclaration jContainer,
			MClassInstanceCreation mConstructor, AnonymousClassDeclaration mAnon, MDefinition mMember) {
		return new Object[] { _this, match, jContainer, mConstructor, mAnon, mMember };
	}

	public static final Object[] pattern_AnonymousClass_WithModifier_0_2_SolveCSP_bindingFBBBBBB(
			AnonymousClass_WithModifier _this, Match match, AbstractTypeDeclaration jContainer,
			MClassInstanceCreation mConstructor, AnonymousClassDeclaration mAnon, MDefinition mMember) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, jContainer, mConstructor, mAnon, mMember);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, jContainer, mConstructor, mAnon, mMember };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClass_WithModifier_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_AnonymousClass_WithModifier_0_2_SolveCSP_bindingAndBlackFBBBBBB(
			AnonymousClass_WithModifier _this, Match match, AbstractTypeDeclaration jContainer,
			MClassInstanceCreation mConstructor, AnonymousClassDeclaration mAnon, MDefinition mMember) {
		Object[] result_pattern_AnonymousClass_WithModifier_0_2_SolveCSP_binding = pattern_AnonymousClass_WithModifier_0_2_SolveCSP_bindingFBBBBBB(
				_this, match, jContainer, mConstructor, mAnon, mMember);
		if (result_pattern_AnonymousClass_WithModifier_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_AnonymousClass_WithModifier_0_2_SolveCSP_binding[0];

			Object[] result_pattern_AnonymousClass_WithModifier_0_2_SolveCSP_black = pattern_AnonymousClass_WithModifier_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_AnonymousClass_WithModifier_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, jContainer, mConstructor, mAnon, mMember };
			}
		}
		return null;
	}

	public static final boolean pattern_AnonymousClass_WithModifier_0_3_CheckCSP_expressionFBB(
			AnonymousClass_WithModifier _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AnonymousClass_WithModifier_0_4_collectelementstobetranslated_blackBBBBB(
			Match match, AbstractTypeDeclaration jContainer, MClassInstanceCreation mConstructor,
			AnonymousClassDeclaration mAnon, MDefinition mMember) {
		return new Object[] { match, jContainer, mConstructor, mAnon, mMember };
	}

	public static final Object[] pattern_AnonymousClass_WithModifier_0_4_collectelementstobetranslated_greenBBBBFFF(
			Match match, MClassInstanceCreation mConstructor, AnonymousClassDeclaration mAnon, MDefinition mMember) {
		EMoflonEdge mConstructor__mAnon____anonymousClassDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mAnon__mConstructor____classInstanceCreation = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mMember__mConstructor____mMethodInvocations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(mConstructor);
		match.getToBeTranslatedNodes().add(mAnon);
		String mConstructor__mAnon____anonymousClassDeclaration_name_prime = "anonymousClassDeclaration";
		String mAnon__mConstructor____classInstanceCreation_name_prime = "classInstanceCreation";
		String mMember__mConstructor____mMethodInvocations_name_prime = "mMethodInvocations";
		mConstructor__mAnon____anonymousClassDeclaration.setSrc(mConstructor);
		mConstructor__mAnon____anonymousClassDeclaration.setTrg(mAnon);
		match.getToBeTranslatedEdges().add(mConstructor__mAnon____anonymousClassDeclaration);
		mAnon__mConstructor____classInstanceCreation.setSrc(mAnon);
		mAnon__mConstructor____classInstanceCreation.setTrg(mConstructor);
		match.getToBeTranslatedEdges().add(mAnon__mConstructor____classInstanceCreation);
		mMember__mConstructor____mMethodInvocations.setSrc(mMember);
		mMember__mConstructor____mMethodInvocations.setTrg(mConstructor);
		match.getToBeTranslatedEdges().add(mMember__mConstructor____mMethodInvocations);
		mConstructor__mAnon____anonymousClassDeclaration
				.setName(mConstructor__mAnon____anonymousClassDeclaration_name_prime);
		mAnon__mConstructor____classInstanceCreation.setName(mAnon__mConstructor____classInstanceCreation_name_prime);
		mMember__mConstructor____mMethodInvocations.setName(mMember__mConstructor____mMethodInvocations_name_prime);
		return new Object[] { match, mConstructor, mAnon, mMember, mConstructor__mAnon____anonymousClassDeclaration,
				mAnon__mConstructor____classInstanceCreation, mMember__mConstructor____mMethodInvocations };
	}

	public static final Object[] pattern_AnonymousClass_WithModifier_0_5_collectcontextelements_blackBBBBB(Match match,
			AbstractTypeDeclaration jContainer, MClassInstanceCreation mConstructor, AnonymousClassDeclaration mAnon,
			MDefinition mMember) {
		return new Object[] { match, jContainer, mConstructor, mAnon, mMember };
	}

	public static final Object[] pattern_AnonymousClass_WithModifier_0_5_collectcontextelements_greenBBBFF(Match match,
			AbstractTypeDeclaration jContainer, MDefinition mMember) {
		EMoflonEdge jContainer__mMember____bodyDeclarations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mMember__jContainer____abstractTypeDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(jContainer);
		match.getContextNodes().add(mMember);
		String jContainer__mMember____bodyDeclarations_name_prime = "bodyDeclarations";
		String mMember__jContainer____abstractTypeDeclaration_name_prime = "abstractTypeDeclaration";
		jContainer__mMember____bodyDeclarations.setSrc(jContainer);
		jContainer__mMember____bodyDeclarations.setTrg(mMember);
		match.getContextEdges().add(jContainer__mMember____bodyDeclarations);
		mMember__jContainer____abstractTypeDeclaration.setSrc(mMember);
		mMember__jContainer____abstractTypeDeclaration.setTrg(jContainer);
		match.getContextEdges().add(mMember__jContainer____abstractTypeDeclaration);
		jContainer__mMember____bodyDeclarations.setName(jContainer__mMember____bodyDeclarations_name_prime);
		mMember__jContainer____abstractTypeDeclaration
				.setName(mMember__jContainer____abstractTypeDeclaration_name_prime);
		return new Object[] { match, jContainer, mMember, jContainer__mMember____bodyDeclarations,
				mMember__jContainer____abstractTypeDeclaration };
	}

	public static final void pattern_AnonymousClass_WithModifier_0_6_registerobjectstomatch_expressionBBBBBB(
			AnonymousClass_WithModifier _this, Match match, AbstractTypeDeclaration jContainer,
			MClassInstanceCreation mConstructor, AnonymousClassDeclaration mAnon, MDefinition mMember) {
		_this.registerObjectsToMatch_FWD(match, jContainer, mConstructor, mAnon, mMember);

	}

	public static final boolean pattern_AnonymousClass_WithModifier_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_AnonymousClass_WithModifier_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_AnonymousClass_WithModifier_1_1_performtransformation_bindingFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("uContainer");
		EObject _localVariable_1 = isApplicableMatch.getObject("jContainer");
		EObject _localVariable_2 = isApplicableMatch.getObject("mConstructor");
		EObject _localVariable_3 = isApplicableMatch.getObject("ne2ne");
		EObject _localVariable_4 = isApplicableMatch.getObject("mAnon");
		EObject _localVariable_5 = isApplicableMatch.getObject("mMember");
		EObject tmpUContainer = _localVariable_0;
		EObject tmpJContainer = _localVariable_1;
		EObject tmpMConstructor = _localVariable_2;
		EObject tmpNe2ne = _localVariable_3;
		EObject tmpMAnon = _localVariable_4;
		EObject tmpMMember = _localVariable_5;
		if (tmpUContainer instanceof org.eclipse.uml2.uml.Class) {
			org.eclipse.uml2.uml.Class uContainer = (org.eclipse.uml2.uml.Class) tmpUContainer;
			if (tmpJContainer instanceof AbstractTypeDeclaration) {
				AbstractTypeDeclaration jContainer = (AbstractTypeDeclaration) tmpJContainer;
				if (tmpMConstructor instanceof MClassInstanceCreation) {
					MClassInstanceCreation mConstructor = (MClassInstanceCreation) tmpMConstructor;
					if (tmpNe2ne instanceof NamedElement2NamedElement) {
						NamedElement2NamedElement ne2ne = (NamedElement2NamedElement) tmpNe2ne;
						if (tmpMAnon instanceof AnonymousClassDeclaration) {
							AnonymousClassDeclaration mAnon = (AnonymousClassDeclaration) tmpMAnon;
							if (tmpMMember instanceof MDefinition) {
								MDefinition mMember = (MDefinition) tmpMMember;
								return new Object[] { uContainer, jContainer, mConstructor, ne2ne, mAnon, mMember,
										isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClass_WithModifier_1_1_performtransformation_blackBBBBBBFBB(
			org.eclipse.uml2.uml.Class uContainer, AbstractTypeDeclaration jContainer,
			MClassInstanceCreation mConstructor, NamedElement2NamedElement ne2ne, AnonymousClassDeclaration mAnon,
			MDefinition mMember, AnonymousClass_WithModifier _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { uContainer, jContainer, mConstructor, ne2ne, mAnon, mMember, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClass_WithModifier_1_1_performtransformation_bindingAndBlackFFFFFFFBB(
			AnonymousClass_WithModifier _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_AnonymousClass_WithModifier_1_1_performtransformation_binding = pattern_AnonymousClass_WithModifier_1_1_performtransformation_bindingFFFFFFB(
				isApplicableMatch);
		if (result_pattern_AnonymousClass_WithModifier_1_1_performtransformation_binding != null) {
			org.eclipse.uml2.uml.Class uContainer = (org.eclipse.uml2.uml.Class) result_pattern_AnonymousClass_WithModifier_1_1_performtransformation_binding[0];
			AbstractTypeDeclaration jContainer = (AbstractTypeDeclaration) result_pattern_AnonymousClass_WithModifier_1_1_performtransformation_binding[1];
			MClassInstanceCreation mConstructor = (MClassInstanceCreation) result_pattern_AnonymousClass_WithModifier_1_1_performtransformation_binding[2];
			NamedElement2NamedElement ne2ne = (NamedElement2NamedElement) result_pattern_AnonymousClass_WithModifier_1_1_performtransformation_binding[3];
			AnonymousClassDeclaration mAnon = (AnonymousClassDeclaration) result_pattern_AnonymousClass_WithModifier_1_1_performtransformation_binding[4];
			MDefinition mMember = (MDefinition) result_pattern_AnonymousClass_WithModifier_1_1_performtransformation_binding[5];

			Object[] result_pattern_AnonymousClass_WithModifier_1_1_performtransformation_black = pattern_AnonymousClass_WithModifier_1_1_performtransformation_blackBBBBBBFBB(
					uContainer, jContainer, mConstructor, ne2ne, mAnon, mMember, _this, isApplicableMatch);
			if (result_pattern_AnonymousClass_WithModifier_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_AnonymousClass_WithModifier_1_1_performtransformation_black[6];

				return new Object[] { uContainer, jContainer, mConstructor, ne2ne, mAnon, mMember, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClass_WithModifier_1_1_performtransformation_greenFBFB(
			org.eclipse.uml2.uml.Class uContainer, AnonymousClassDeclaration mAnon) {
		ASTNode2Element bd2ne = UmlFactory.eINSTANCE.createASTNode2Element();
		org.eclipse.uml2.uml.Class uAnon = UMLFactory.eINSTANCE.createClass();
		String uAnon_name_prime = "Anonymous";
		bd2ne.setSource(mAnon);
		bd2ne.setTarget(uAnon);
		uContainer.getNestedClassifiers().add(uAnon);
		uAnon.setName(uAnon_name_prime);
		return new Object[] { bd2ne, uContainer, uAnon, mAnon };
	}

	public static final Object[] pattern_AnonymousClass_WithModifier_1_2_collecttranslatedelements_blackBBBB(
			ASTNode2Element bd2ne, MClassInstanceCreation mConstructor, org.eclipse.uml2.uml.Class uAnon,
			AnonymousClassDeclaration mAnon) {
		return new Object[] { bd2ne, mConstructor, uAnon, mAnon };
	}

	public static final Object[] pattern_AnonymousClass_WithModifier_1_2_collecttranslatedelements_greenFBBBB(
			ASTNode2Element bd2ne, MClassInstanceCreation mConstructor, org.eclipse.uml2.uml.Class uAnon,
			AnonymousClassDeclaration mAnon) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(bd2ne);
		ruleresult.getTranslatedElements().add(mConstructor);
		ruleresult.getCreatedElements().add(uAnon);
		ruleresult.getTranslatedElements().add(mAnon);
		return new Object[] { ruleresult, bd2ne, mConstructor, uAnon, mAnon };
	}

	public static final Object[] pattern_AnonymousClass_WithModifier_1_3_bookkeepingforedges_blackBBBBBBBBB(
			PerformRuleResult ruleresult, EObject bd2ne, EObject uContainer, EObject jContainer, EObject mConstructor,
			EObject uAnon, EObject ne2ne, EObject mAnon, EObject mMember) {
		if (!bd2ne.equals(uContainer)) {
			if (!bd2ne.equals(jContainer)) {
				if (!bd2ne.equals(mConstructor)) {
					if (!bd2ne.equals(uAnon)) {
						if (!bd2ne.equals(ne2ne)) {
							if (!bd2ne.equals(mAnon)) {
								if (!bd2ne.equals(mMember)) {
									if (!jContainer.equals(uContainer)) {
										if (!jContainer.equals(mConstructor)) {
											if (!jContainer.equals(uAnon)) {
												if (!jContainer.equals(ne2ne)) {
													if (!jContainer.equals(mAnon)) {
														if (!jContainer.equals(mMember)) {
															if (!mConstructor.equals(uContainer)) {
																if (!mConstructor.equals(uAnon)) {
																	if (!mConstructor.equals(ne2ne)) {
																		if (!mConstructor.equals(mMember)) {
																			if (!uAnon.equals(uContainer)) {
																				if (!ne2ne.equals(uContainer)) {
																					if (!ne2ne.equals(uAnon)) {
																						if (!mAnon.equals(uContainer)) {
																							if (!mAnon.equals(
																									mConstructor)) {
																								if (!mAnon.equals(
																										uAnon)) {
																									if (!mAnon.equals(
																											ne2ne)) {
																										if (!mAnon
																												.equals(mMember)) {
																											if (!mMember
																													.equals(uContainer)) {
																												if (!mMember
																														.equals(uAnon)) {
																													if (!mMember
																															.equals(ne2ne)) {
																														return new Object[] {
																																ruleresult,
																																bd2ne,
																																uContainer,
																																jContainer,
																																mConstructor,
																																uAnon,
																																ne2ne,
																																mAnon,
																																mMember };
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClass_WithModifier_1_3_bookkeepingforedges_greenBBBBBBBFFFFFF(
			PerformRuleResult ruleresult, EObject bd2ne, EObject uContainer, EObject mConstructor, EObject uAnon,
			EObject mAnon, EObject mMember) {
		EMoflonEdge mConstructor__mAnon____anonymousClassDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mAnon__mConstructor____classInstanceCreation = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge bd2ne__uAnon____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge bd2ne__mAnon____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mMember__mConstructor____mMethodInvocations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge uContainer__uAnon____nestedClassifier = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "AnonymousClass_WithModifier";
		String mConstructor__mAnon____anonymousClassDeclaration_name_prime = "anonymousClassDeclaration";
		String mAnon__mConstructor____classInstanceCreation_name_prime = "classInstanceCreation";
		String bd2ne__uAnon____target_name_prime = "target";
		String bd2ne__mAnon____source_name_prime = "source";
		String mMember__mConstructor____mMethodInvocations_name_prime = "mMethodInvocations";
		String uContainer__uAnon____nestedClassifier_name_prime = "nestedClassifier";
		mConstructor__mAnon____anonymousClassDeclaration.setSrc(mConstructor);
		mConstructor__mAnon____anonymousClassDeclaration.setTrg(mAnon);
		ruleresult.getTranslatedEdges().add(mConstructor__mAnon____anonymousClassDeclaration);
		mAnon__mConstructor____classInstanceCreation.setSrc(mAnon);
		mAnon__mConstructor____classInstanceCreation.setTrg(mConstructor);
		ruleresult.getTranslatedEdges().add(mAnon__mConstructor____classInstanceCreation);
		bd2ne__uAnon____target.setSrc(bd2ne);
		bd2ne__uAnon____target.setTrg(uAnon);
		ruleresult.getCreatedEdges().add(bd2ne__uAnon____target);
		bd2ne__mAnon____source.setSrc(bd2ne);
		bd2ne__mAnon____source.setTrg(mAnon);
		ruleresult.getCreatedEdges().add(bd2ne__mAnon____source);
		mMember__mConstructor____mMethodInvocations.setSrc(mMember);
		mMember__mConstructor____mMethodInvocations.setTrg(mConstructor);
		ruleresult.getTranslatedEdges().add(mMember__mConstructor____mMethodInvocations);
		uContainer__uAnon____nestedClassifier.setSrc(uContainer);
		uContainer__uAnon____nestedClassifier.setTrg(uAnon);
		ruleresult.getCreatedEdges().add(uContainer__uAnon____nestedClassifier);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		mConstructor__mAnon____anonymousClassDeclaration
				.setName(mConstructor__mAnon____anonymousClassDeclaration_name_prime);
		mAnon__mConstructor____classInstanceCreation.setName(mAnon__mConstructor____classInstanceCreation_name_prime);
		bd2ne__uAnon____target.setName(bd2ne__uAnon____target_name_prime);
		bd2ne__mAnon____source.setName(bd2ne__mAnon____source_name_prime);
		mMember__mConstructor____mMethodInvocations.setName(mMember__mConstructor____mMethodInvocations_name_prime);
		uContainer__uAnon____nestedClassifier.setName(uContainer__uAnon____nestedClassifier_name_prime);
		return new Object[] { ruleresult, bd2ne, uContainer, mConstructor, uAnon, mAnon, mMember,
				mConstructor__mAnon____anonymousClassDeclaration, mAnon__mConstructor____classInstanceCreation,
				bd2ne__uAnon____target, bd2ne__mAnon____source, mMember__mConstructor____mMethodInvocations,
				uContainer__uAnon____nestedClassifier };
	}

	public static final void pattern_AnonymousClass_WithModifier_1_5_registerobjects_expressionBBBBBBBBBB(
			AnonymousClass_WithModifier _this, PerformRuleResult ruleresult, EObject bd2ne, EObject uContainer,
			EObject jContainer, EObject mConstructor, EObject uAnon, EObject ne2ne, EObject mAnon, EObject mMember) {
		_this.registerObjects_FWD(ruleresult, bd2ne, uContainer, jContainer, mConstructor, uAnon, ne2ne, mAnon,
				mMember);

	}

	public static final PerformRuleResult pattern_AnonymousClass_WithModifier_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_AnonymousClass_WithModifier_2_1_preparereturnvalue_bindingFB(
			AnonymousClass_WithModifier _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClass_WithModifier_2_1_preparereturnvalue_blackFBB(EClass eClass,
			AnonymousClass_WithModifier _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_AnonymousClass_WithModifier_2_1_preparereturnvalue_bindingAndBlackFFB(
			AnonymousClass_WithModifier _this) {
		Object[] result_pattern_AnonymousClass_WithModifier_2_1_preparereturnvalue_binding = pattern_AnonymousClass_WithModifier_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_AnonymousClass_WithModifier_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_AnonymousClass_WithModifier_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_AnonymousClass_WithModifier_2_1_preparereturnvalue_black = pattern_AnonymousClass_WithModifier_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_AnonymousClass_WithModifier_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_AnonymousClass_WithModifier_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClass_WithModifier_2_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "AnonymousClass_WithModifier";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_AnonymousClass_WithModifier_2_2_corematch_bindingFFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("jContainer");
		EObject _localVariable_1 = match.getObject("mConstructor");
		EObject _localVariable_2 = match.getObject("mAnon");
		EObject _localVariable_3 = match.getObject("mMember");
		EObject tmpJContainer = _localVariable_0;
		EObject tmpMConstructor = _localVariable_1;
		EObject tmpMAnon = _localVariable_2;
		EObject tmpMMember = _localVariable_3;
		if (tmpJContainer instanceof AbstractTypeDeclaration) {
			AbstractTypeDeclaration jContainer = (AbstractTypeDeclaration) tmpJContainer;
			if (tmpMConstructor instanceof MClassInstanceCreation) {
				MClassInstanceCreation mConstructor = (MClassInstanceCreation) tmpMConstructor;
				if (tmpMAnon instanceof AnonymousClassDeclaration) {
					AnonymousClassDeclaration mAnon = (AnonymousClassDeclaration) tmpMAnon;
					if (tmpMMember instanceof MDefinition) {
						MDefinition mMember = (MDefinition) tmpMMember;
						return new Object[] { jContainer, mConstructor, mAnon, mMember, match };
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_AnonymousClass_WithModifier_2_2_corematch_blackFBBFBBB(
			AbstractTypeDeclaration jContainer, MClassInstanceCreation mConstructor, AnonymousClassDeclaration mAnon,
			MDefinition mMember, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (NamedElement2NamedElement ne2ne : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(jContainer, NamedElement2NamedElement.class, "source")) {
			NamedElement tmpUContainer = ne2ne.getTarget();
			if (tmpUContainer instanceof org.eclipse.uml2.uml.Class) {
				org.eclipse.uml2.uml.Class uContainer = (org.eclipse.uml2.uml.Class) tmpUContainer;
				_result.add(new Object[] { uContainer, jContainer, mConstructor, ne2ne, mAnon, mMember, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_AnonymousClass_WithModifier_2_3_findcontext_blackBBBBBB(
			org.eclipse.uml2.uml.Class uContainer, AbstractTypeDeclaration jContainer,
			MClassInstanceCreation mConstructor, NamedElement2NamedElement ne2ne, AnonymousClassDeclaration mAnon,
			MDefinition mMember) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (mAnon.equals(mConstructor.getAnonymousClassDeclaration())) {
			if (jContainer.equals(ne2ne.getSource())) {
				if (uContainer.equals(ne2ne.getTarget())) {
					if (mMember.getMMethodInvocations().contains(mConstructor)) {
						if (jContainer.getBodyDeclarations().contains(mMember)) {
							_result.add(new Object[] { uContainer, jContainer, mConstructor, ne2ne, mAnon, mMember });
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_AnonymousClass_WithModifier_2_3_findcontext_greenBBBBBBFFFFFFFF(
			org.eclipse.uml2.uml.Class uContainer, AbstractTypeDeclaration jContainer,
			MClassInstanceCreation mConstructor, NamedElement2NamedElement ne2ne, AnonymousClassDeclaration mAnon,
			MDefinition mMember) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge mConstructor__mAnon____anonymousClassDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mAnon__mConstructor____classInstanceCreation = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge ne2ne__jContainer____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge ne2ne__uContainer____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mMember__mConstructor____mMethodInvocations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge jContainer__mMember____bodyDeclarations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mMember__jContainer____abstractTypeDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String mConstructor__mAnon____anonymousClassDeclaration_name_prime = "anonymousClassDeclaration";
		String mAnon__mConstructor____classInstanceCreation_name_prime = "classInstanceCreation";
		String ne2ne__jContainer____source_name_prime = "source";
		String ne2ne__uContainer____target_name_prime = "target";
		String mMember__mConstructor____mMethodInvocations_name_prime = "mMethodInvocations";
		String jContainer__mMember____bodyDeclarations_name_prime = "bodyDeclarations";
		String mMember__jContainer____abstractTypeDeclaration_name_prime = "abstractTypeDeclaration";
		isApplicableMatch.getAllContextElements().add(uContainer);
		isApplicableMatch.getAllContextElements().add(jContainer);
		isApplicableMatch.getAllContextElements().add(mConstructor);
		isApplicableMatch.getAllContextElements().add(ne2ne);
		isApplicableMatch.getAllContextElements().add(mAnon);
		isApplicableMatch.getAllContextElements().add(mMember);
		mConstructor__mAnon____anonymousClassDeclaration.setSrc(mConstructor);
		mConstructor__mAnon____anonymousClassDeclaration.setTrg(mAnon);
		isApplicableMatch.getAllContextElements().add(mConstructor__mAnon____anonymousClassDeclaration);
		mAnon__mConstructor____classInstanceCreation.setSrc(mAnon);
		mAnon__mConstructor____classInstanceCreation.setTrg(mConstructor);
		isApplicableMatch.getAllContextElements().add(mAnon__mConstructor____classInstanceCreation);
		ne2ne__jContainer____source.setSrc(ne2ne);
		ne2ne__jContainer____source.setTrg(jContainer);
		isApplicableMatch.getAllContextElements().add(ne2ne__jContainer____source);
		ne2ne__uContainer____target.setSrc(ne2ne);
		ne2ne__uContainer____target.setTrg(uContainer);
		isApplicableMatch.getAllContextElements().add(ne2ne__uContainer____target);
		mMember__mConstructor____mMethodInvocations.setSrc(mMember);
		mMember__mConstructor____mMethodInvocations.setTrg(mConstructor);
		isApplicableMatch.getAllContextElements().add(mMember__mConstructor____mMethodInvocations);
		jContainer__mMember____bodyDeclarations.setSrc(jContainer);
		jContainer__mMember____bodyDeclarations.setTrg(mMember);
		isApplicableMatch.getAllContextElements().add(jContainer__mMember____bodyDeclarations);
		mMember__jContainer____abstractTypeDeclaration.setSrc(mMember);
		mMember__jContainer____abstractTypeDeclaration.setTrg(jContainer);
		isApplicableMatch.getAllContextElements().add(mMember__jContainer____abstractTypeDeclaration);
		mConstructor__mAnon____anonymousClassDeclaration
				.setName(mConstructor__mAnon____anonymousClassDeclaration_name_prime);
		mAnon__mConstructor____classInstanceCreation.setName(mAnon__mConstructor____classInstanceCreation_name_prime);
		ne2ne__jContainer____source.setName(ne2ne__jContainer____source_name_prime);
		ne2ne__uContainer____target.setName(ne2ne__uContainer____target_name_prime);
		mMember__mConstructor____mMethodInvocations.setName(mMember__mConstructor____mMethodInvocations_name_prime);
		jContainer__mMember____bodyDeclarations.setName(jContainer__mMember____bodyDeclarations_name_prime);
		mMember__jContainer____abstractTypeDeclaration
				.setName(mMember__jContainer____abstractTypeDeclaration_name_prime);
		return new Object[] { uContainer, jContainer, mConstructor, ne2ne, mAnon, mMember, isApplicableMatch,
				mConstructor__mAnon____anonymousClassDeclaration, mAnon__mConstructor____classInstanceCreation,
				ne2ne__jContainer____source, ne2ne__uContainer____target, mMember__mConstructor____mMethodInvocations,
				jContainer__mMember____bodyDeclarations, mMember__jContainer____abstractTypeDeclaration };
	}

	public static final Object[] pattern_AnonymousClass_WithModifier_2_4_solveCSP_bindingFBBBBBBBB(
			AnonymousClass_WithModifier _this, IsApplicableMatch isApplicableMatch,
			org.eclipse.uml2.uml.Class uContainer, AbstractTypeDeclaration jContainer,
			MClassInstanceCreation mConstructor, NamedElement2NamedElement ne2ne, AnonymousClassDeclaration mAnon,
			MDefinition mMember) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, uContainer, jContainer, mConstructor,
				ne2ne, mAnon, mMember);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, uContainer, jContainer, mConstructor, ne2ne, mAnon,
					mMember };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClass_WithModifier_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_AnonymousClass_WithModifier_2_4_solveCSP_bindingAndBlackFBBBBBBBB(
			AnonymousClass_WithModifier _this, IsApplicableMatch isApplicableMatch,
			org.eclipse.uml2.uml.Class uContainer, AbstractTypeDeclaration jContainer,
			MClassInstanceCreation mConstructor, NamedElement2NamedElement ne2ne, AnonymousClassDeclaration mAnon,
			MDefinition mMember) {
		Object[] result_pattern_AnonymousClass_WithModifier_2_4_solveCSP_binding = pattern_AnonymousClass_WithModifier_2_4_solveCSP_bindingFBBBBBBBB(
				_this, isApplicableMatch, uContainer, jContainer, mConstructor, ne2ne, mAnon, mMember);
		if (result_pattern_AnonymousClass_WithModifier_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_AnonymousClass_WithModifier_2_4_solveCSP_binding[0];

			Object[] result_pattern_AnonymousClass_WithModifier_2_4_solveCSP_black = pattern_AnonymousClass_WithModifier_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_AnonymousClass_WithModifier_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, uContainer, jContainer, mConstructor, ne2ne, mAnon,
						mMember };
			}
		}
		return null;
	}

	public static final boolean pattern_AnonymousClass_WithModifier_2_5_checkCSP_expressionFBB(
			AnonymousClass_WithModifier _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AnonymousClass_WithModifier_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_AnonymousClass_WithModifier_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "AnonymousClass_WithModifier";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_AnonymousClass_WithModifier_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_AnonymousClass_WithModifier_10_1_initialbindings_blackBBBB(
			AnonymousClass_WithModifier _this, Match match, org.eclipse.uml2.uml.Class uContainer,
			org.eclipse.uml2.uml.Class uAnon) {
		if (!uAnon.equals(uContainer)) {
			return new Object[] { _this, match, uContainer, uAnon };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClass_WithModifier_10_2_SolveCSP_bindingFBBBB(
			AnonymousClass_WithModifier _this, Match match, org.eclipse.uml2.uml.Class uContainer,
			org.eclipse.uml2.uml.Class uAnon) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, uContainer, uAnon);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, uContainer, uAnon };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClass_WithModifier_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_AnonymousClass_WithModifier_10_2_SolveCSP_bindingAndBlackFBBBB(
			AnonymousClass_WithModifier _this, Match match, org.eclipse.uml2.uml.Class uContainer,
			org.eclipse.uml2.uml.Class uAnon) {
		Object[] result_pattern_AnonymousClass_WithModifier_10_2_SolveCSP_binding = pattern_AnonymousClass_WithModifier_10_2_SolveCSP_bindingFBBBB(
				_this, match, uContainer, uAnon);
		if (result_pattern_AnonymousClass_WithModifier_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_AnonymousClass_WithModifier_10_2_SolveCSP_binding[0];

			Object[] result_pattern_AnonymousClass_WithModifier_10_2_SolveCSP_black = pattern_AnonymousClass_WithModifier_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_AnonymousClass_WithModifier_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, uContainer, uAnon };
			}
		}
		return null;
	}

	public static final boolean pattern_AnonymousClass_WithModifier_10_3_CheckCSP_expressionFBB(
			AnonymousClass_WithModifier _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AnonymousClass_WithModifier_10_4_collectelementstobetranslated_blackBBB(
			Match match, org.eclipse.uml2.uml.Class uContainer, org.eclipse.uml2.uml.Class uAnon) {
		if (!uAnon.equals(uContainer)) {
			return new Object[] { match, uContainer, uAnon };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClass_WithModifier_10_4_collectelementstobetranslated_greenBBBF(
			Match match, org.eclipse.uml2.uml.Class uContainer, org.eclipse.uml2.uml.Class uAnon) {
		EMoflonEdge uContainer__uAnon____nestedClassifier = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(uAnon);
		String uContainer__uAnon____nestedClassifier_name_prime = "nestedClassifier";
		uContainer__uAnon____nestedClassifier.setSrc(uContainer);
		uContainer__uAnon____nestedClassifier.setTrg(uAnon);
		match.getToBeTranslatedEdges().add(uContainer__uAnon____nestedClassifier);
		uContainer__uAnon____nestedClassifier.setName(uContainer__uAnon____nestedClassifier_name_prime);
		return new Object[] { match, uContainer, uAnon, uContainer__uAnon____nestedClassifier };
	}

	public static final Object[] pattern_AnonymousClass_WithModifier_10_5_collectcontextelements_blackBBB(Match match,
			org.eclipse.uml2.uml.Class uContainer, org.eclipse.uml2.uml.Class uAnon) {
		if (!uAnon.equals(uContainer)) {
			return new Object[] { match, uContainer, uAnon };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClass_WithModifier_10_5_collectcontextelements_greenBB(Match match,
			org.eclipse.uml2.uml.Class uContainer) {
		match.getContextNodes().add(uContainer);
		return new Object[] { match, uContainer };
	}

	public static final void pattern_AnonymousClass_WithModifier_10_6_registerobjectstomatch_expressionBBBB(
			AnonymousClass_WithModifier _this, Match match, org.eclipse.uml2.uml.Class uContainer,
			org.eclipse.uml2.uml.Class uAnon) {
		_this.registerObjectsToMatch_BWD(match, uContainer, uAnon);

	}

	public static final boolean pattern_AnonymousClass_WithModifier_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_AnonymousClass_WithModifier_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_AnonymousClass_WithModifier_11_1_performtransformation_bindingFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("uContainer");
		EObject _localVariable_1 = isApplicableMatch.getObject("jContainer");
		EObject _localVariable_2 = isApplicableMatch.getObject("uAnon");
		EObject _localVariable_3 = isApplicableMatch.getObject("ne2ne");
		EObject _localVariable_4 = isApplicableMatch.getObject("mMember");
		EObject tmpUContainer = _localVariable_0;
		EObject tmpJContainer = _localVariable_1;
		EObject tmpUAnon = _localVariable_2;
		EObject tmpNe2ne = _localVariable_3;
		EObject tmpMMember = _localVariable_4;
		if (tmpUContainer instanceof org.eclipse.uml2.uml.Class) {
			org.eclipse.uml2.uml.Class uContainer = (org.eclipse.uml2.uml.Class) tmpUContainer;
			if (tmpJContainer instanceof AbstractTypeDeclaration) {
				AbstractTypeDeclaration jContainer = (AbstractTypeDeclaration) tmpJContainer;
				if (tmpUAnon instanceof org.eclipse.uml2.uml.Class) {
					org.eclipse.uml2.uml.Class uAnon = (org.eclipse.uml2.uml.Class) tmpUAnon;
					if (tmpNe2ne instanceof NamedElement2NamedElement) {
						NamedElement2NamedElement ne2ne = (NamedElement2NamedElement) tmpNe2ne;
						if (tmpMMember instanceof MDefinition) {
							MDefinition mMember = (MDefinition) tmpMMember;
							return new Object[] { uContainer, jContainer, uAnon, ne2ne, mMember, isApplicableMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClass_WithModifier_11_1_performtransformation_blackBBBBBFBB(
			org.eclipse.uml2.uml.Class uContainer, AbstractTypeDeclaration jContainer, org.eclipse.uml2.uml.Class uAnon,
			NamedElement2NamedElement ne2ne, MDefinition mMember, AnonymousClass_WithModifier _this,
			IsApplicableMatch isApplicableMatch) {
		if (!uAnon.equals(uContainer)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { uContainer, jContainer, uAnon, ne2ne, mMember, csp, _this,
							isApplicableMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClass_WithModifier_11_1_performtransformation_bindingAndBlackFFFFFFBB(
			AnonymousClass_WithModifier _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_AnonymousClass_WithModifier_11_1_performtransformation_binding = pattern_AnonymousClass_WithModifier_11_1_performtransformation_bindingFFFFFB(
				isApplicableMatch);
		if (result_pattern_AnonymousClass_WithModifier_11_1_performtransformation_binding != null) {
			org.eclipse.uml2.uml.Class uContainer = (org.eclipse.uml2.uml.Class) result_pattern_AnonymousClass_WithModifier_11_1_performtransformation_binding[0];
			AbstractTypeDeclaration jContainer = (AbstractTypeDeclaration) result_pattern_AnonymousClass_WithModifier_11_1_performtransformation_binding[1];
			org.eclipse.uml2.uml.Class uAnon = (org.eclipse.uml2.uml.Class) result_pattern_AnonymousClass_WithModifier_11_1_performtransformation_binding[2];
			NamedElement2NamedElement ne2ne = (NamedElement2NamedElement) result_pattern_AnonymousClass_WithModifier_11_1_performtransformation_binding[3];
			MDefinition mMember = (MDefinition) result_pattern_AnonymousClass_WithModifier_11_1_performtransformation_binding[4];

			Object[] result_pattern_AnonymousClass_WithModifier_11_1_performtransformation_black = pattern_AnonymousClass_WithModifier_11_1_performtransformation_blackBBBBBFBB(
					uContainer, jContainer, uAnon, ne2ne, mMember, _this, isApplicableMatch);
			if (result_pattern_AnonymousClass_WithModifier_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_AnonymousClass_WithModifier_11_1_performtransformation_black[5];

				return new Object[] { uContainer, jContainer, uAnon, ne2ne, mMember, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClass_WithModifier_11_1_performtransformation_greenFFBFB(
			org.eclipse.uml2.uml.Class uAnon, MDefinition mMember) {
		ASTNode2Element bd2ne = UmlFactory.eINSTANCE.createASTNode2Element();
		MClassInstanceCreation mConstructor = ModiscoFactory.eINSTANCE.createMClassInstanceCreation();
		AnonymousClassDeclaration mAnon = JavaFactory.eINSTANCE.createAnonymousClassDeclaration();
		bd2ne.setTarget(uAnon);
		mMember.getMMethodInvocations().add(mConstructor);
		mConstructor.setAnonymousClassDeclaration(mAnon);
		bd2ne.setSource(mAnon);
		return new Object[] { bd2ne, mConstructor, uAnon, mAnon, mMember };
	}

	public static final Object[] pattern_AnonymousClass_WithModifier_11_2_collecttranslatedelements_blackBBBB(
			ASTNode2Element bd2ne, MClassInstanceCreation mConstructor, org.eclipse.uml2.uml.Class uAnon,
			AnonymousClassDeclaration mAnon) {
		return new Object[] { bd2ne, mConstructor, uAnon, mAnon };
	}

	public static final Object[] pattern_AnonymousClass_WithModifier_11_2_collecttranslatedelements_greenFBBBB(
			ASTNode2Element bd2ne, MClassInstanceCreation mConstructor, org.eclipse.uml2.uml.Class uAnon,
			AnonymousClassDeclaration mAnon) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(bd2ne);
		ruleresult.getCreatedElements().add(mConstructor);
		ruleresult.getTranslatedElements().add(uAnon);
		ruleresult.getCreatedElements().add(mAnon);
		return new Object[] { ruleresult, bd2ne, mConstructor, uAnon, mAnon };
	}

	public static final Object[] pattern_AnonymousClass_WithModifier_11_3_bookkeepingforedges_blackBBBBBBBBB(
			PerformRuleResult ruleresult, EObject bd2ne, EObject uContainer, EObject jContainer, EObject mConstructor,
			EObject uAnon, EObject ne2ne, EObject mAnon, EObject mMember) {
		if (!bd2ne.equals(uContainer)) {
			if (!bd2ne.equals(jContainer)) {
				if (!bd2ne.equals(mConstructor)) {
					if (!bd2ne.equals(uAnon)) {
						if (!bd2ne.equals(ne2ne)) {
							if (!bd2ne.equals(mAnon)) {
								if (!bd2ne.equals(mMember)) {
									if (!jContainer.equals(uContainer)) {
										if (!jContainer.equals(mConstructor)) {
											if (!jContainer.equals(uAnon)) {
												if (!jContainer.equals(ne2ne)) {
													if (!jContainer.equals(mAnon)) {
														if (!jContainer.equals(mMember)) {
															if (!mConstructor.equals(uContainer)) {
																if (!mConstructor.equals(uAnon)) {
																	if (!mConstructor.equals(ne2ne)) {
																		if (!mConstructor.equals(mMember)) {
																			if (!uAnon.equals(uContainer)) {
																				if (!ne2ne.equals(uContainer)) {
																					if (!ne2ne.equals(uAnon)) {
																						if (!mAnon.equals(uContainer)) {
																							if (!mAnon.equals(
																									mConstructor)) {
																								if (!mAnon.equals(
																										uAnon)) {
																									if (!mAnon.equals(
																											ne2ne)) {
																										if (!mAnon
																												.equals(mMember)) {
																											if (!mMember
																													.equals(uContainer)) {
																												if (!mMember
																														.equals(uAnon)) {
																													if (!mMember
																															.equals(ne2ne)) {
																														return new Object[] {
																																ruleresult,
																																bd2ne,
																																uContainer,
																																jContainer,
																																mConstructor,
																																uAnon,
																																ne2ne,
																																mAnon,
																																mMember };
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClass_WithModifier_11_3_bookkeepingforedges_greenBBBBBBBFFFFFF(
			PerformRuleResult ruleresult, EObject bd2ne, EObject uContainer, EObject mConstructor, EObject uAnon,
			EObject mAnon, EObject mMember) {
		EMoflonEdge mConstructor__mAnon____anonymousClassDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mAnon__mConstructor____classInstanceCreation = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge bd2ne__uAnon____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge bd2ne__mAnon____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mMember__mConstructor____mMethodInvocations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge uContainer__uAnon____nestedClassifier = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "AnonymousClass_WithModifier";
		String mConstructor__mAnon____anonymousClassDeclaration_name_prime = "anonymousClassDeclaration";
		String mAnon__mConstructor____classInstanceCreation_name_prime = "classInstanceCreation";
		String bd2ne__uAnon____target_name_prime = "target";
		String bd2ne__mAnon____source_name_prime = "source";
		String mMember__mConstructor____mMethodInvocations_name_prime = "mMethodInvocations";
		String uContainer__uAnon____nestedClassifier_name_prime = "nestedClassifier";
		mConstructor__mAnon____anonymousClassDeclaration.setSrc(mConstructor);
		mConstructor__mAnon____anonymousClassDeclaration.setTrg(mAnon);
		ruleresult.getCreatedEdges().add(mConstructor__mAnon____anonymousClassDeclaration);
		mAnon__mConstructor____classInstanceCreation.setSrc(mAnon);
		mAnon__mConstructor____classInstanceCreation.setTrg(mConstructor);
		ruleresult.getCreatedEdges().add(mAnon__mConstructor____classInstanceCreation);
		bd2ne__uAnon____target.setSrc(bd2ne);
		bd2ne__uAnon____target.setTrg(uAnon);
		ruleresult.getCreatedEdges().add(bd2ne__uAnon____target);
		bd2ne__mAnon____source.setSrc(bd2ne);
		bd2ne__mAnon____source.setTrg(mAnon);
		ruleresult.getCreatedEdges().add(bd2ne__mAnon____source);
		mMember__mConstructor____mMethodInvocations.setSrc(mMember);
		mMember__mConstructor____mMethodInvocations.setTrg(mConstructor);
		ruleresult.getCreatedEdges().add(mMember__mConstructor____mMethodInvocations);
		uContainer__uAnon____nestedClassifier.setSrc(uContainer);
		uContainer__uAnon____nestedClassifier.setTrg(uAnon);
		ruleresult.getTranslatedEdges().add(uContainer__uAnon____nestedClassifier);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		mConstructor__mAnon____anonymousClassDeclaration
				.setName(mConstructor__mAnon____anonymousClassDeclaration_name_prime);
		mAnon__mConstructor____classInstanceCreation.setName(mAnon__mConstructor____classInstanceCreation_name_prime);
		bd2ne__uAnon____target.setName(bd2ne__uAnon____target_name_prime);
		bd2ne__mAnon____source.setName(bd2ne__mAnon____source_name_prime);
		mMember__mConstructor____mMethodInvocations.setName(mMember__mConstructor____mMethodInvocations_name_prime);
		uContainer__uAnon____nestedClassifier.setName(uContainer__uAnon____nestedClassifier_name_prime);
		return new Object[] { ruleresult, bd2ne, uContainer, mConstructor, uAnon, mAnon, mMember,
				mConstructor__mAnon____anonymousClassDeclaration, mAnon__mConstructor____classInstanceCreation,
				bd2ne__uAnon____target, bd2ne__mAnon____source, mMember__mConstructor____mMethodInvocations,
				uContainer__uAnon____nestedClassifier };
	}

	public static final void pattern_AnonymousClass_WithModifier_11_5_registerobjects_expressionBBBBBBBBBB(
			AnonymousClass_WithModifier _this, PerformRuleResult ruleresult, EObject bd2ne, EObject uContainer,
			EObject jContainer, EObject mConstructor, EObject uAnon, EObject ne2ne, EObject mAnon, EObject mMember) {
		_this.registerObjects_BWD(ruleresult, bd2ne, uContainer, jContainer, mConstructor, uAnon, ne2ne, mAnon,
				mMember);

	}

	public static final PerformRuleResult pattern_AnonymousClass_WithModifier_11_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_AnonymousClass_WithModifier_12_1_preparereturnvalue_bindingFB(
			AnonymousClass_WithModifier _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClass_WithModifier_12_1_preparereturnvalue_blackFBB(EClass eClass,
			AnonymousClass_WithModifier _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_AnonymousClass_WithModifier_12_1_preparereturnvalue_bindingAndBlackFFB(
			AnonymousClass_WithModifier _this) {
		Object[] result_pattern_AnonymousClass_WithModifier_12_1_preparereturnvalue_binding = pattern_AnonymousClass_WithModifier_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_AnonymousClass_WithModifier_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_AnonymousClass_WithModifier_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_AnonymousClass_WithModifier_12_1_preparereturnvalue_black = pattern_AnonymousClass_WithModifier_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_AnonymousClass_WithModifier_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_AnonymousClass_WithModifier_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClass_WithModifier_12_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "AnonymousClass_WithModifier";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_AnonymousClass_WithModifier_12_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("uContainer");
		EObject _localVariable_1 = match.getObject("uAnon");
		EObject tmpUContainer = _localVariable_0;
		EObject tmpUAnon = _localVariable_1;
		if (tmpUContainer instanceof org.eclipse.uml2.uml.Class) {
			org.eclipse.uml2.uml.Class uContainer = (org.eclipse.uml2.uml.Class) tmpUContainer;
			if (tmpUAnon instanceof org.eclipse.uml2.uml.Class) {
				org.eclipse.uml2.uml.Class uAnon = (org.eclipse.uml2.uml.Class) tmpUAnon;
				return new Object[] { uContainer, uAnon, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_AnonymousClass_WithModifier_12_2_corematch_blackBFBFB(
			org.eclipse.uml2.uml.Class uContainer, org.eclipse.uml2.uml.Class uAnon, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!uAnon.equals(uContainer)) {
			String uAnon_name = uAnon.getName();
			if (uAnon_name.equals("Anonymous")) {
				for (NamedElement2NamedElement ne2ne : org.moflon.core.utilities.eMoflonEMFUtil
						.getOppositeReferenceTyped(uContainer, NamedElement2NamedElement.class, "target")) {
					org.eclipse.modisco.java.NamedElement tmpJContainer = ne2ne.getSource();
					if (tmpJContainer instanceof AbstractTypeDeclaration) {
						AbstractTypeDeclaration jContainer = (AbstractTypeDeclaration) tmpJContainer;
						_result.add(new Object[] { uContainer, jContainer, uAnon, ne2ne, match });
					}

				}
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_AnonymousClass_WithModifier_12_3_findcontext_blackBBBBF(
			org.eclipse.uml2.uml.Class uContainer, AbstractTypeDeclaration jContainer, org.eclipse.uml2.uml.Class uAnon,
			NamedElement2NamedElement ne2ne) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!uAnon.equals(uContainer)) {
			if (jContainer.equals(ne2ne.getSource())) {
				if (uContainer.equals(ne2ne.getTarget())) {
					if (uContainer.getNestedClassifiers().contains(uAnon)) {
						String uAnon_name = uAnon.getName();
						if (uAnon_name.equals("Anonymous")) {
							for (BodyDeclaration tmpMMember : jContainer.getBodyDeclarations()) {
								if (tmpMMember instanceof MDefinition) {
									MDefinition mMember = (MDefinition) tmpMMember;
									_result.add(new Object[] { uContainer, jContainer, uAnon, ne2ne, mMember });
								}
							}
						}

					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_AnonymousClass_WithModifier_12_3_findcontext_greenBBBBBFFFFFF(
			org.eclipse.uml2.uml.Class uContainer, AbstractTypeDeclaration jContainer, org.eclipse.uml2.uml.Class uAnon,
			NamedElement2NamedElement ne2ne, MDefinition mMember) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge ne2ne__jContainer____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge ne2ne__uContainer____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge jContainer__mMember____bodyDeclarations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mMember__jContainer____abstractTypeDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge uContainer__uAnon____nestedClassifier = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ne2ne__jContainer____source_name_prime = "source";
		String ne2ne__uContainer____target_name_prime = "target";
		String jContainer__mMember____bodyDeclarations_name_prime = "bodyDeclarations";
		String mMember__jContainer____abstractTypeDeclaration_name_prime = "abstractTypeDeclaration";
		String uContainer__uAnon____nestedClassifier_name_prime = "nestedClassifier";
		isApplicableMatch.getAllContextElements().add(uContainer);
		isApplicableMatch.getAllContextElements().add(jContainer);
		isApplicableMatch.getAllContextElements().add(uAnon);
		isApplicableMatch.getAllContextElements().add(ne2ne);
		isApplicableMatch.getAllContextElements().add(mMember);
		ne2ne__jContainer____source.setSrc(ne2ne);
		ne2ne__jContainer____source.setTrg(jContainer);
		isApplicableMatch.getAllContextElements().add(ne2ne__jContainer____source);
		ne2ne__uContainer____target.setSrc(ne2ne);
		ne2ne__uContainer____target.setTrg(uContainer);
		isApplicableMatch.getAllContextElements().add(ne2ne__uContainer____target);
		jContainer__mMember____bodyDeclarations.setSrc(jContainer);
		jContainer__mMember____bodyDeclarations.setTrg(mMember);
		isApplicableMatch.getAllContextElements().add(jContainer__mMember____bodyDeclarations);
		mMember__jContainer____abstractTypeDeclaration.setSrc(mMember);
		mMember__jContainer____abstractTypeDeclaration.setTrg(jContainer);
		isApplicableMatch.getAllContextElements().add(mMember__jContainer____abstractTypeDeclaration);
		uContainer__uAnon____nestedClassifier.setSrc(uContainer);
		uContainer__uAnon____nestedClassifier.setTrg(uAnon);
		isApplicableMatch.getAllContextElements().add(uContainer__uAnon____nestedClassifier);
		ne2ne__jContainer____source.setName(ne2ne__jContainer____source_name_prime);
		ne2ne__uContainer____target.setName(ne2ne__uContainer____target_name_prime);
		jContainer__mMember____bodyDeclarations.setName(jContainer__mMember____bodyDeclarations_name_prime);
		mMember__jContainer____abstractTypeDeclaration
				.setName(mMember__jContainer____abstractTypeDeclaration_name_prime);
		uContainer__uAnon____nestedClassifier.setName(uContainer__uAnon____nestedClassifier_name_prime);
		return new Object[] { uContainer, jContainer, uAnon, ne2ne, mMember, isApplicableMatch,
				ne2ne__jContainer____source, ne2ne__uContainer____target, jContainer__mMember____bodyDeclarations,
				mMember__jContainer____abstractTypeDeclaration, uContainer__uAnon____nestedClassifier };
	}

	public static final Object[] pattern_AnonymousClass_WithModifier_12_4_solveCSP_bindingFBBBBBBB(
			AnonymousClass_WithModifier _this, IsApplicableMatch isApplicableMatch,
			org.eclipse.uml2.uml.Class uContainer, AbstractTypeDeclaration jContainer, org.eclipse.uml2.uml.Class uAnon,
			NamedElement2NamedElement ne2ne, MDefinition mMember) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, uContainer, jContainer, uAnon, ne2ne,
				mMember);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, uContainer, jContainer, uAnon, ne2ne, mMember };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClass_WithModifier_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_AnonymousClass_WithModifier_12_4_solveCSP_bindingAndBlackFBBBBBBB(
			AnonymousClass_WithModifier _this, IsApplicableMatch isApplicableMatch,
			org.eclipse.uml2.uml.Class uContainer, AbstractTypeDeclaration jContainer, org.eclipse.uml2.uml.Class uAnon,
			NamedElement2NamedElement ne2ne, MDefinition mMember) {
		Object[] result_pattern_AnonymousClass_WithModifier_12_4_solveCSP_binding = pattern_AnonymousClass_WithModifier_12_4_solveCSP_bindingFBBBBBBB(
				_this, isApplicableMatch, uContainer, jContainer, uAnon, ne2ne, mMember);
		if (result_pattern_AnonymousClass_WithModifier_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_AnonymousClass_WithModifier_12_4_solveCSP_binding[0];

			Object[] result_pattern_AnonymousClass_WithModifier_12_4_solveCSP_black = pattern_AnonymousClass_WithModifier_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_AnonymousClass_WithModifier_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, uContainer, jContainer, uAnon, ne2ne, mMember };
			}
		}
		return null;
	}

	public static final boolean pattern_AnonymousClass_WithModifier_12_5_checkCSP_expressionFBB(
			AnonymousClass_WithModifier _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AnonymousClass_WithModifier_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_AnonymousClass_WithModifier_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "AnonymousClass_WithModifier";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_AnonymousClass_WithModifier_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_AnonymousClass_WithModifier_20_1_preparereturnvalue_bindingFB(
			AnonymousClass_WithModifier _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClass_WithModifier_20_1_preparereturnvalue_blackFBBF(EClass __eClass,
			AnonymousClass_WithModifier _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperation_name = __performOperation.getName();
			if (__performOperation_name.equals("isApplicable_BWD")) {
				for (EOperation isApplicableCC : __eClass.getEOperations()) {
					if (!__performOperation.equals(isApplicableCC)) {
						String isApplicableCC_name = isApplicableCC.getName();
						if (isApplicableCC_name.equals("isApplicable_CC")) {
							return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
						}

					}
				}
			}

		}
		return null;
	}

	public static final Object[] pattern_AnonymousClass_WithModifier_20_1_preparereturnvalue_bindingAndBlackFFBF(
			AnonymousClass_WithModifier _this) {
		Object[] result_pattern_AnonymousClass_WithModifier_20_1_preparereturnvalue_binding = pattern_AnonymousClass_WithModifier_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_AnonymousClass_WithModifier_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_AnonymousClass_WithModifier_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_AnonymousClass_WithModifier_20_1_preparereturnvalue_black = pattern_AnonymousClass_WithModifier_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_AnonymousClass_WithModifier_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_AnonymousClass_WithModifier_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_AnonymousClass_WithModifier_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClass_WithModifier_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_AnonymousClass_WithModifier_20_2_testcorematchandDECs_black_nac_0B(
			org.eclipse.uml2.uml.Class uAnon) {
		for (org.eclipse.uml2.uml.Package __DEC_uAnon_packagedElement_646294 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(uAnon, org.eclipse.uml2.uml.Package.class, "packagedElement")) {
			return new Object[] { uAnon };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClass_WithModifier_20_2_testcorematchandDECs_black_nac_1B(
			org.eclipse.uml2.uml.Class uAnon) {
		for (Interface __DEC_uAnon_nestedClassifier_993856 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(uAnon, Interface.class, "nestedClassifier")) {
			return new Object[] { uAnon };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_AnonymousClass_WithModifier_20_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_nestedClassifier) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpUContainer = _edge_nestedClassifier.getSrc();
		if (tmpUContainer instanceof org.eclipse.uml2.uml.Class) {
			org.eclipse.uml2.uml.Class uContainer = (org.eclipse.uml2.uml.Class) tmpUContainer;
			EObject tmpUAnon = _edge_nestedClassifier.getTrg();
			if (tmpUAnon instanceof org.eclipse.uml2.uml.Class) {
				org.eclipse.uml2.uml.Class uAnon = (org.eclipse.uml2.uml.Class) tmpUAnon;
				if (!uAnon.equals(uContainer)) {
					if (uContainer.getNestedClassifiers().contains(uAnon)) {
						String uAnon_name = uAnon.getName();
						if (uAnon_name.equals("Anonymous")) {
							if (pattern_AnonymousClass_WithModifier_20_2_testcorematchandDECs_black_nac_0B(
									uAnon) == null) {
								if (pattern_AnonymousClass_WithModifier_20_2_testcorematchandDECs_black_nac_1B(
										uAnon) == null) {
									_result.add(new Object[] { uContainer, uAnon, _edge_nestedClassifier });
								}
							}
						}

					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_AnonymousClass_WithModifier_20_2_testcorematchandDECs_greenFB(
			EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_AnonymousClass_WithModifier_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			AnonymousClass_WithModifier _this, Match match, org.eclipse.uml2.uml.Class uContainer,
			org.eclipse.uml2.uml.Class uAnon) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, uContainer, uAnon);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_AnonymousClass_WithModifier_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			AnonymousClass_WithModifier _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AnonymousClass_WithModifier_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClass_WithModifier_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_AnonymousClass_WithModifier_20_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_AnonymousClass_WithModifier_21_1_preparereturnvalue_bindingFB(
			AnonymousClass_WithModifier _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClass_WithModifier_21_1_preparereturnvalue_blackFBBF(EClass __eClass,
			AnonymousClass_WithModifier _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperation_name = __performOperation.getName();
			if (__performOperation_name.equals("isApplicable_FWD")) {
				for (EOperation isApplicableCC : __eClass.getEOperations()) {
					if (!__performOperation.equals(isApplicableCC)) {
						String isApplicableCC_name = isApplicableCC.getName();
						if (isApplicableCC_name.equals("isApplicable_CC")) {
							return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
						}

					}
				}
			}

		}
		return null;
	}

	public static final Object[] pattern_AnonymousClass_WithModifier_21_1_preparereturnvalue_bindingAndBlackFFBF(
			AnonymousClass_WithModifier _this) {
		Object[] result_pattern_AnonymousClass_WithModifier_21_1_preparereturnvalue_binding = pattern_AnonymousClass_WithModifier_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_AnonymousClass_WithModifier_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_AnonymousClass_WithModifier_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_AnonymousClass_WithModifier_21_1_preparereturnvalue_black = pattern_AnonymousClass_WithModifier_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_AnonymousClass_WithModifier_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_AnonymousClass_WithModifier_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_AnonymousClass_WithModifier_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClass_WithModifier_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_AnonymousClass_WithModifier_21_2_testcorematchandDECs_black_nac_0B(
			MClassInstanceCreation mConstructor) {
		for (AnnotationMemberValuePair __DEC_mConstructor_value_703153 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mConstructor, AnnotationMemberValuePair.class, "value")) {
			return new Object[] { mConstructor };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClass_WithModifier_21_2_testcorematchandDECs_black_nac_1B(
			MClassInstanceCreation mConstructor) {
		for (ArrayInitializer __DEC_mConstructor_expressions_19903 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mConstructor, ArrayInitializer.class, "expressions")) {
			return new Object[] { mConstructor };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClass_WithModifier_21_2_testcorematchandDECs_black_nac_2BB(
			MClassInstanceCreation mConstructor, MDefinition mMember) {
		for (MDefinition __DEC_mConstructor_mMethodInvocations_784327 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mConstructor, MDefinition.class, "mMethodInvocations")) {
			if (!mMember.equals(__DEC_mConstructor_mMethodInvocations_784327)) {
				return new Object[] { mConstructor, mMember };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_AnonymousClass_WithModifier_21_2_testcorematchandDECs_blackFFFFB(
			EMoflonEdge _edge_anonymousClassDeclaration) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpMConstructor = _edge_anonymousClassDeclaration.getSrc();
		if (tmpMConstructor instanceof MClassInstanceCreation) {
			MClassInstanceCreation mConstructor = (MClassInstanceCreation) tmpMConstructor;
			EObject tmpMAnon = _edge_anonymousClassDeclaration.getTrg();
			if (tmpMAnon instanceof AnonymousClassDeclaration) {
				AnonymousClassDeclaration mAnon = (AnonymousClassDeclaration) tmpMAnon;
				if (mAnon.equals(mConstructor.getAnonymousClassDeclaration())) {
					if (pattern_AnonymousClass_WithModifier_21_2_testcorematchandDECs_black_nac_0B(
							mConstructor) == null) {
						if (pattern_AnonymousClass_WithModifier_21_2_testcorematchandDECs_black_nac_1B(
								mConstructor) == null) {
							for (MDefinition mMember : org.moflon.core.utilities.eMoflonEMFUtil
									.getOppositeReferenceTyped(mConstructor, MDefinition.class, "mMethodInvocations")) {
								AbstractTypeDeclaration jContainer = mMember.getAbstractTypeDeclaration();
								if (jContainer != null) {
									if (pattern_AnonymousClass_WithModifier_21_2_testcorematchandDECs_black_nac_2BB(
											mConstructor, mMember) == null) {
										_result.add(new Object[] { jContainer, mConstructor, mAnon, mMember,
												_edge_anonymousClassDeclaration });
									}
								}

							}
						}
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_AnonymousClass_WithModifier_21_2_testcorematchandDECs_greenFB(
			EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_AnonymousClass_WithModifier_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(
			AnonymousClass_WithModifier _this, Match match, AbstractTypeDeclaration jContainer,
			MClassInstanceCreation mConstructor, AnonymousClassDeclaration mAnon, MDefinition mMember) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, jContainer, mConstructor, mAnon, mMember);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_AnonymousClass_WithModifier_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			AnonymousClass_WithModifier _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AnonymousClass_WithModifier_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClass_WithModifier_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_AnonymousClass_WithModifier_21_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_AnonymousClass_WithModifier_24_1_prepare_blackB(
			AnonymousClass_WithModifier _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_AnonymousClass_WithModifier_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_AnonymousClass_WithModifier_24_2_matchsrctrgcontext_bindingFFFFFFBB(
			Match targetMatch, Match sourceMatch) {
		EObject _localVariable_0 = targetMatch.getObject("uContainer");
		EObject _localVariable_1 = sourceMatch.getObject("jContainer");
		EObject _localVariable_2 = sourceMatch.getObject("mConstructor");
		EObject _localVariable_3 = targetMatch.getObject("uAnon");
		EObject _localVariable_4 = sourceMatch.getObject("mAnon");
		EObject _localVariable_5 = sourceMatch.getObject("mMember");
		EObject tmpUContainer = _localVariable_0;
		EObject tmpJContainer = _localVariable_1;
		EObject tmpMConstructor = _localVariable_2;
		EObject tmpUAnon = _localVariable_3;
		EObject tmpMAnon = _localVariable_4;
		EObject tmpMMember = _localVariable_5;
		if (tmpUContainer instanceof org.eclipse.uml2.uml.Class) {
			org.eclipse.uml2.uml.Class uContainer = (org.eclipse.uml2.uml.Class) tmpUContainer;
			if (tmpJContainer instanceof AbstractTypeDeclaration) {
				AbstractTypeDeclaration jContainer = (AbstractTypeDeclaration) tmpJContainer;
				if (tmpMConstructor instanceof MClassInstanceCreation) {
					MClassInstanceCreation mConstructor = (MClassInstanceCreation) tmpMConstructor;
					if (tmpUAnon instanceof org.eclipse.uml2.uml.Class) {
						org.eclipse.uml2.uml.Class uAnon = (org.eclipse.uml2.uml.Class) tmpUAnon;
						if (tmpMAnon instanceof AnonymousClassDeclaration) {
							AnonymousClassDeclaration mAnon = (AnonymousClassDeclaration) tmpMAnon;
							if (tmpMMember instanceof MDefinition) {
								MDefinition mMember = (MDefinition) tmpMMember;
								return new Object[] { uContainer, jContainer, mConstructor, uAnon, mAnon, mMember,
										targetMatch, sourceMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClass_WithModifier_24_2_matchsrctrgcontext_blackBBBBBBBB(
			org.eclipse.uml2.uml.Class uContainer, AbstractTypeDeclaration jContainer,
			MClassInstanceCreation mConstructor, org.eclipse.uml2.uml.Class uAnon, AnonymousClassDeclaration mAnon,
			MDefinition mMember, Match sourceMatch, Match targetMatch) {
		if (!uAnon.equals(uContainer)) {
			if (!sourceMatch.equals(targetMatch)) {
				String uAnon_name = uAnon.getName();
				if (uAnon_name.equals("Anonymous")) {
					return new Object[] { uContainer, jContainer, mConstructor, uAnon, mAnon, mMember, sourceMatch,
							targetMatch };
				}

			}
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClass_WithModifier_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_AnonymousClass_WithModifier_24_2_matchsrctrgcontext_binding = pattern_AnonymousClass_WithModifier_24_2_matchsrctrgcontext_bindingFFFFFFBB(
				targetMatch, sourceMatch);
		if (result_pattern_AnonymousClass_WithModifier_24_2_matchsrctrgcontext_binding != null) {
			org.eclipse.uml2.uml.Class uContainer = (org.eclipse.uml2.uml.Class) result_pattern_AnonymousClass_WithModifier_24_2_matchsrctrgcontext_binding[0];
			AbstractTypeDeclaration jContainer = (AbstractTypeDeclaration) result_pattern_AnonymousClass_WithModifier_24_2_matchsrctrgcontext_binding[1];
			MClassInstanceCreation mConstructor = (MClassInstanceCreation) result_pattern_AnonymousClass_WithModifier_24_2_matchsrctrgcontext_binding[2];
			org.eclipse.uml2.uml.Class uAnon = (org.eclipse.uml2.uml.Class) result_pattern_AnonymousClass_WithModifier_24_2_matchsrctrgcontext_binding[3];
			AnonymousClassDeclaration mAnon = (AnonymousClassDeclaration) result_pattern_AnonymousClass_WithModifier_24_2_matchsrctrgcontext_binding[4];
			MDefinition mMember = (MDefinition) result_pattern_AnonymousClass_WithModifier_24_2_matchsrctrgcontext_binding[5];

			Object[] result_pattern_AnonymousClass_WithModifier_24_2_matchsrctrgcontext_black = pattern_AnonymousClass_WithModifier_24_2_matchsrctrgcontext_blackBBBBBBBB(
					uContainer, jContainer, mConstructor, uAnon, mAnon, mMember, sourceMatch, targetMatch);
			if (result_pattern_AnonymousClass_WithModifier_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { uContainer, jContainer, mConstructor, uAnon, mAnon, mMember, sourceMatch,
						targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClass_WithModifier_24_3_solvecsp_bindingFBBBBBBBBB(
			AnonymousClass_WithModifier _this, org.eclipse.uml2.uml.Class uContainer,
			AbstractTypeDeclaration jContainer, MClassInstanceCreation mConstructor, org.eclipse.uml2.uml.Class uAnon,
			AnonymousClassDeclaration mAnon, MDefinition mMember, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_6 = _this.isApplicable_solveCsp_CC(uContainer, jContainer, mConstructor, uAnon, mAnon,
				mMember, sourceMatch, targetMatch);
		CSP csp = _localVariable_6;
		if (csp != null) {
			return new Object[] { csp, _this, uContainer, jContainer, mConstructor, uAnon, mAnon, mMember, sourceMatch,
					targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClass_WithModifier_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_AnonymousClass_WithModifier_24_3_solvecsp_bindingAndBlackFBBBBBBBBB(
			AnonymousClass_WithModifier _this, org.eclipse.uml2.uml.Class uContainer,
			AbstractTypeDeclaration jContainer, MClassInstanceCreation mConstructor, org.eclipse.uml2.uml.Class uAnon,
			AnonymousClassDeclaration mAnon, MDefinition mMember, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_AnonymousClass_WithModifier_24_3_solvecsp_binding = pattern_AnonymousClass_WithModifier_24_3_solvecsp_bindingFBBBBBBBBB(
				_this, uContainer, jContainer, mConstructor, uAnon, mAnon, mMember, sourceMatch, targetMatch);
		if (result_pattern_AnonymousClass_WithModifier_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_AnonymousClass_WithModifier_24_3_solvecsp_binding[0];

			Object[] result_pattern_AnonymousClass_WithModifier_24_3_solvecsp_black = pattern_AnonymousClass_WithModifier_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_AnonymousClass_WithModifier_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, uContainer, jContainer, mConstructor, uAnon, mAnon, mMember,
						sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_AnonymousClass_WithModifier_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_AnonymousClass_WithModifier_24_5_matchcorrcontext_blackBBFBB(
			org.eclipse.uml2.uml.Class uContainer, AbstractTypeDeclaration jContainer, Match sourceMatch,
			Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (NamedElement2NamedElement ne2ne : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(jContainer, NamedElement2NamedElement.class, "source")) {
				if (uContainer.equals(ne2ne.getTarget())) {
					_result.add(new Object[] { uContainer, jContainer, ne2ne, sourceMatch, targetMatch });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_AnonymousClass_WithModifier_24_5_matchcorrcontext_greenBBBF(
			NamedElement2NamedElement ne2ne, Match sourceMatch, Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "AnonymousClass_WithModifier";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(ne2ne);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { ne2ne, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_AnonymousClass_WithModifier_24_6_createcorrespondence_blackBBBBBBB(
			org.eclipse.uml2.uml.Class uContainer, AbstractTypeDeclaration jContainer,
			MClassInstanceCreation mConstructor, org.eclipse.uml2.uml.Class uAnon, AnonymousClassDeclaration mAnon,
			MDefinition mMember, CCMatch ccMatch) {
		if (!uAnon.equals(uContainer)) {
			return new Object[] { uContainer, jContainer, mConstructor, uAnon, mAnon, mMember, ccMatch };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClass_WithModifier_24_6_createcorrespondence_greenFBBB(
			org.eclipse.uml2.uml.Class uAnon, AnonymousClassDeclaration mAnon, CCMatch ccMatch) {
		ASTNode2Element bd2ne = UmlFactory.eINSTANCE.createASTNode2Element();
		bd2ne.setTarget(uAnon);
		bd2ne.setSource(mAnon);
		ccMatch.getCreateCorr().add(bd2ne);
		return new Object[] { bd2ne, uAnon, mAnon, ccMatch };
	}

	public static final Object[] pattern_AnonymousClass_WithModifier_24_7_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_AnonymousClass_WithModifier_24_7_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "AnonymousClass_WithModifier";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_AnonymousClass_WithModifier_24_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_AnonymousClass_WithModifier_27_1_matchtggpattern_black_nac_0B(
			MClassInstanceCreation mConstructor) {
		for (AnnotationMemberValuePair __DEC_mConstructor_value_901458 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mConstructor, AnnotationMemberValuePair.class, "value")) {
			return new Object[] { mConstructor };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClass_WithModifier_27_1_matchtggpattern_black_nac_1B(
			MClassInstanceCreation mConstructor) {
		for (ArrayInitializer __DEC_mConstructor_expressions_453181 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mConstructor, ArrayInitializer.class, "expressions")) {
			return new Object[] { mConstructor };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClass_WithModifier_27_1_matchtggpattern_black_nac_2BB(
			MClassInstanceCreation mConstructor, MDefinition mMember) {
		for (MDefinition __DEC_mConstructor_mMethodInvocations_121087 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mConstructor, MDefinition.class, "mMethodInvocations")) {
			if (!mMember.equals(__DEC_mConstructor_mMethodInvocations_121087)) {
				return new Object[] { mConstructor, mMember };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClass_WithModifier_27_1_matchtggpattern_blackBBBB(
			AbstractTypeDeclaration jContainer, MClassInstanceCreation mConstructor, AnonymousClassDeclaration mAnon,
			MDefinition mMember) {
		if (mAnon.equals(mConstructor.getAnonymousClassDeclaration())) {
			if (mMember.getMMethodInvocations().contains(mConstructor)) {
				if (jContainer.getBodyDeclarations().contains(mMember)) {
					if (pattern_AnonymousClass_WithModifier_27_1_matchtggpattern_black_nac_0B(mConstructor) == null) {
						if (pattern_AnonymousClass_WithModifier_27_1_matchtggpattern_black_nac_1B(
								mConstructor) == null) {
							if (pattern_AnonymousClass_WithModifier_27_1_matchtggpattern_black_nac_2BB(mConstructor,
									mMember) == null) {
								return new Object[] { jContainer, mConstructor, mAnon, mMember };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final boolean pattern_AnonymousClass_WithModifier_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_AnonymousClass_WithModifier_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_AnonymousClass_WithModifier_28_1_matchtggpattern_black_nac_0B(
			org.eclipse.uml2.uml.Class uAnon) {
		for (org.eclipse.uml2.uml.Package __DEC_uAnon_packagedElement_544819 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(uAnon, org.eclipse.uml2.uml.Package.class, "packagedElement")) {
			return new Object[] { uAnon };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClass_WithModifier_28_1_matchtggpattern_black_nac_1B(
			org.eclipse.uml2.uml.Class uAnon) {
		for (Interface __DEC_uAnon_nestedClassifier_22462 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(uAnon, Interface.class, "nestedClassifier")) {
			return new Object[] { uAnon };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClass_WithModifier_28_1_matchtggpattern_blackBB(
			org.eclipse.uml2.uml.Class uContainer, org.eclipse.uml2.uml.Class uAnon) {
		if (!uAnon.equals(uContainer)) {
			if (uContainer.getNestedClassifiers().contains(uAnon)) {
				if (pattern_AnonymousClass_WithModifier_28_1_matchtggpattern_black_nac_0B(uAnon) == null) {
					if (pattern_AnonymousClass_WithModifier_28_1_matchtggpattern_black_nac_1B(uAnon) == null) {
						return new Object[] { uContainer, uAnon };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClass_WithModifier_28_1_matchtggpattern_greenB(
			org.eclipse.uml2.uml.Class uAnon) {
		String uAnon_name_prime = "Anonymous";
		uAnon.setName(uAnon_name_prime);
		return new Object[] { uAnon };
	}

	public static final boolean pattern_AnonymousClass_WithModifier_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_AnonymousClass_WithModifier_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_AnonymousClass_WithModifier_29_1_createresult_blackB(
			AnonymousClass_WithModifier _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_AnonymousClass_WithModifier_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_AnonymousClass_WithModifier_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, org.eclipse.uml2.uml.Class uContainer) {
		if (ruleResult.getTargetObjects().contains(uContainer)) {
			return new Object[] { ruleResult, uContainer };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClass_WithModifier_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, NamedElement2NamedElement ne2ne) {
		if (ruleResult.getCorrObjects().contains(ne2ne)) {
			return new Object[] { ruleResult, ne2ne };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClass_WithModifier_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, AbstractTypeDeclaration jContainer) {
		if (ruleResult.getSourceObjects().contains(jContainer)) {
			return new Object[] { ruleResult, jContainer };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClass_WithModifier_29_2_isapplicablecore_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, MDefinition mMember) {
		if (ruleResult.getSourceObjects().contains(mMember)) {
			return new Object[] { ruleResult, mMember };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_AnonymousClass_WithModifier_29_2_isapplicablecore_blackFFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList ne2neList : ruleEntryContainer.getRuleEntryList()) {
			for (EObject tmpNe2ne : ne2neList.getEntryObjects()) {
				if (tmpNe2ne instanceof NamedElement2NamedElement) {
					NamedElement2NamedElement ne2ne = (NamedElement2NamedElement) tmpNe2ne;
					NamedElement tmpUContainer = ne2ne.getTarget();
					if (tmpUContainer instanceof org.eclipse.uml2.uml.Class) {
						org.eclipse.uml2.uml.Class uContainer = (org.eclipse.uml2.uml.Class) tmpUContainer;
						org.eclipse.modisco.java.NamedElement tmpJContainer = ne2ne.getSource();
						if (tmpJContainer instanceof AbstractTypeDeclaration) {
							AbstractTypeDeclaration jContainer = (AbstractTypeDeclaration) tmpJContainer;
							if (pattern_AnonymousClass_WithModifier_29_2_isapplicablecore_black_nac_1BB(ruleResult,
									ne2ne) == null) {
								if (pattern_AnonymousClass_WithModifier_29_2_isapplicablecore_black_nac_0BB(ruleResult,
										uContainer) == null) {
									if (pattern_AnonymousClass_WithModifier_29_2_isapplicablecore_black_nac_2BB(
											ruleResult, jContainer) == null) {
										for (BodyDeclaration tmpMMember : jContainer.getBodyDeclarations()) {
											if (tmpMMember instanceof MDefinition) {
												MDefinition mMember = (MDefinition) tmpMMember;
												if (pattern_AnonymousClass_WithModifier_29_2_isapplicablecore_black_nac_3BB(
														ruleResult, mMember) == null) {
													_result.add(new Object[] { ne2neList, uContainer, ne2ne, jContainer,
															mMember, ruleEntryContainer, ruleResult });
												}
											}
										}
									}
								}
							}
						}

					}

				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_AnonymousClass_WithModifier_29_3_solveCSP_bindingFBBBBBBB(
			AnonymousClass_WithModifier _this, IsApplicableMatch isApplicableMatch,
			org.eclipse.uml2.uml.Class uContainer, AbstractTypeDeclaration jContainer, NamedElement2NamedElement ne2ne,
			MDefinition mMember, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, uContainer, jContainer, ne2ne,
				mMember, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, uContainer, jContainer, ne2ne, mMember, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClass_WithModifier_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_AnonymousClass_WithModifier_29_3_solveCSP_bindingAndBlackFBBBBBBB(
			AnonymousClass_WithModifier _this, IsApplicableMatch isApplicableMatch,
			org.eclipse.uml2.uml.Class uContainer, AbstractTypeDeclaration jContainer, NamedElement2NamedElement ne2ne,
			MDefinition mMember, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_AnonymousClass_WithModifier_29_3_solveCSP_binding = pattern_AnonymousClass_WithModifier_29_3_solveCSP_bindingFBBBBBBB(
				_this, isApplicableMatch, uContainer, jContainer, ne2ne, mMember, ruleResult);
		if (result_pattern_AnonymousClass_WithModifier_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_AnonymousClass_WithModifier_29_3_solveCSP_binding[0];

			Object[] result_pattern_AnonymousClass_WithModifier_29_3_solveCSP_black = pattern_AnonymousClass_WithModifier_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_AnonymousClass_WithModifier_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, uContainer, jContainer, ne2ne, mMember,
						ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_AnonymousClass_WithModifier_29_4_checkCSP_expressionFBB(
			AnonymousClass_WithModifier _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AnonymousClass_WithModifier_29_5_checknacs_blackBBBB(
			org.eclipse.uml2.uml.Class uContainer, AbstractTypeDeclaration jContainer, NamedElement2NamedElement ne2ne,
			MDefinition mMember) {
		return new Object[] { uContainer, jContainer, ne2ne, mMember };
	}

	public static final Object[] pattern_AnonymousClass_WithModifier_29_6_perform_blackBBBBB(
			org.eclipse.uml2.uml.Class uContainer, AbstractTypeDeclaration jContainer, NamedElement2NamedElement ne2ne,
			MDefinition mMember, ModelgeneratorRuleResult ruleResult) {
		return new Object[] { uContainer, jContainer, ne2ne, mMember, ruleResult };
	}

	public static final Object[] pattern_AnonymousClass_WithModifier_29_6_perform_greenFBFFFBB(
			org.eclipse.uml2.uml.Class uContainer, MDefinition mMember, ModelgeneratorRuleResult ruleResult) {
		ASTNode2Element bd2ne = UmlFactory.eINSTANCE.createASTNode2Element();
		MClassInstanceCreation mConstructor = ModiscoFactory.eINSTANCE.createMClassInstanceCreation();
		org.eclipse.uml2.uml.Class uAnon = UMLFactory.eINSTANCE.createClass();
		AnonymousClassDeclaration mAnon = JavaFactory.eINSTANCE.createAnonymousClassDeclaration();
		String uAnon_name_prime = "Anonymous";
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		ruleResult.getCorrObjects().add(bd2ne);
		mMember.getMMethodInvocations().add(mConstructor);
		ruleResult.getSourceObjects().add(mConstructor);
		bd2ne.setTarget(uAnon);
		uContainer.getNestedClassifiers().add(uAnon);
		ruleResult.getTargetObjects().add(uAnon);
		mConstructor.setAnonymousClassDeclaration(mAnon);
		bd2ne.setSource(mAnon);
		ruleResult.getSourceObjects().add(mAnon);
		uAnon.setName(uAnon_name_prime);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { bd2ne, uContainer, mConstructor, uAnon, mAnon, mMember, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_AnonymousClass_WithModifier_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //AnonymousClass_WithModifierImpl
