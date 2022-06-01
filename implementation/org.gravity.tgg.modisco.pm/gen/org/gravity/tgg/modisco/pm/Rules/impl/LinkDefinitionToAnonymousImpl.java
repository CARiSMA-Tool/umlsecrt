/**
 */
package org.gravity.tgg.modisco.pm.Rules.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.LinkedList;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;

import org.eclipse.modisco.java.AnonymousClassDeclaration;
import org.eclipse.modisco.java.BodyDeclaration;
import org.eclipse.modisco.java.ClassInstanceCreation;

import org.gravity.modisco.MDefinition;
import org.gravity.modisco.MSignature;

import org.gravity.tgg.modisco.pm.AnonymousClassDeclarationToTClass;
import org.gravity.tgg.modisco.pm.MDefinitionToTMember;
import org.gravity.tgg.modisco.pm.MSignatureToTSignature;

import org.gravity.tgg.modisco.pm.Rules.LinkDefinitionToAnonymous;
import org.gravity.tgg.modisco.pm.Rules.RulesPackage;

import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TMember;
import org.gravity.typegraph.basic.TSignature;

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
import org.gravity.tgg.modisco.pm.csp.constraints.*;
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
 * An implementation of the model object '<em><b>Link Definition To Anonymous</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class LinkDefinitionToAnonymousImpl extends AbstractRuleImpl implements LinkDefinitionToAnonymous {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LinkDefinitionToAnonymousImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getLinkDefinitionToAnonymous();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, MSignature mSignature, AnonymousClassDeclaration mAnonymous,
			ClassInstanceCreation mInstance, MDefinition mDefinition) {

		Object[] result1_black = LinkDefinitionToAnonymousImpl
				.pattern_LinkDefinitionToAnonymous_0_1_initialbindings_blackBBBBBB(this, match, mSignature, mAnonymous,
						mInstance, mDefinition);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[mSignature] = " + mSignature + ", " + "[mAnonymous] = "
					+ mAnonymous + ", " + "[mInstance] = " + mInstance + ", " + "[mDefinition] = " + mDefinition + ".");
		}

		Object[] result2_bindingAndBlack = LinkDefinitionToAnonymousImpl
				.pattern_LinkDefinitionToAnonymous_0_2_SolveCSP_bindingAndBlackFBBBBBB(this, match, mSignature,
						mAnonymous, mInstance, mDefinition);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[mSignature] = " + mSignature + ", " + "[mAnonymous] = "
					+ mAnonymous + ", " + "[mInstance] = " + mInstance + ", " + "[mDefinition] = " + mDefinition + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (LinkDefinitionToAnonymousImpl.pattern_LinkDefinitionToAnonymous_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = LinkDefinitionToAnonymousImpl
					.pattern_LinkDefinitionToAnonymous_0_4_collectelementstobetranslated_blackBBBBB(match, mSignature,
							mAnonymous, mInstance, mDefinition);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[mSignature] = " + mSignature + ", " + "[mAnonymous] = " + mAnonymous + ", "
						+ "[mInstance] = " + mInstance + ", " + "[mDefinition] = " + mDefinition + ".");
			}
			LinkDefinitionToAnonymousImpl
					.pattern_LinkDefinitionToAnonymous_0_4_collectelementstobetranslated_greenBBBFF(match, mAnonymous,
							mDefinition);
			//nothing EMoflonEdge mAnonymous__mDefinition____bodyDeclarations = (EMoflonEdge) result4_green[3];
			//nothing EMoflonEdge mDefinition__mAnonymous____anonymousClassDeclarationOwner = (EMoflonEdge) result4_green[4];

			Object[] result5_black = LinkDefinitionToAnonymousImpl
					.pattern_LinkDefinitionToAnonymous_0_5_collectcontextelements_blackBBBBB(match, mSignature,
							mAnonymous, mInstance, mDefinition);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[mSignature] = " + mSignature + ", " + "[mAnonymous] = " + mAnonymous + ", "
						+ "[mInstance] = " + mInstance + ", " + "[mDefinition] = " + mDefinition + ".");
			}
			LinkDefinitionToAnonymousImpl.pattern_LinkDefinitionToAnonymous_0_5_collectcontextelements_greenBBBBBFFFF(
					match, mSignature, mAnonymous, mInstance, mDefinition);
			//nothing EMoflonEdge mInstance__mAnonymous____anonymousClassDeclaration = (EMoflonEdge) result5_green[5];
			//nothing EMoflonEdge mAnonymous__mInstance____classInstanceCreation = (EMoflonEdge) result5_green[6];
			//nothing EMoflonEdge mSignature__mDefinition____mDefinitions = (EMoflonEdge) result5_green[7];
			//nothing EMoflonEdge mDefinition__mSignature____mSignature = (EMoflonEdge) result5_green[8];

			// 
			LinkDefinitionToAnonymousImpl.pattern_LinkDefinitionToAnonymous_0_6_registerobjectstomatch_expressionBBBBBB(
					this, match, mSignature, mAnonymous, mInstance, mDefinition);
			return LinkDefinitionToAnonymousImpl.pattern_LinkDefinitionToAnonymous_0_7_expressionF();
		} else {
			return LinkDefinitionToAnonymousImpl.pattern_LinkDefinitionToAnonymous_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = LinkDefinitionToAnonymousImpl
				.pattern_LinkDefinitionToAnonymous_1_1_performtransformation_bindingAndBlackFFFFFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		MSignature mSignature = (MSignature) result1_bindingAndBlack[0];
		AnonymousClassDeclaration mAnonymous = (AnonymousClassDeclaration) result1_bindingAndBlack[1];
		TClass tAnonymous = (TClass) result1_bindingAndBlack[2];
		TMember tDefinition = (TMember) result1_bindingAndBlack[3];
		TSignature tSignature = (TSignature) result1_bindingAndBlack[4];
		ClassInstanceCreation mInstance = (ClassInstanceCreation) result1_bindingAndBlack[5];
		AnonymousClassDeclarationToTClass mAnonymousToTAnonymous = (AnonymousClassDeclarationToTClass) result1_bindingAndBlack[6];
		MSignatureToTSignature mSignatureToTSignature = (MSignatureToTSignature) result1_bindingAndBlack[7];
		MDefinitionToTMember mDefinitionToTMember = (MDefinitionToTMember) result1_bindingAndBlack[8];
		MDefinition mDefinition = (MDefinition) result1_bindingAndBlack[9];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[10];
		LinkDefinitionToAnonymousImpl.pattern_LinkDefinitionToAnonymous_1_1_performtransformation_greenBBB(tAnonymous,
				tDefinition, tSignature);

		Object[] result2_green = LinkDefinitionToAnonymousImpl
				.pattern_LinkDefinitionToAnonymous_1_2_collecttranslatedelements_greenF();
		if (result2_green == null) {
			throw new RuntimeException("Pattern matching failed.");
		}
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = LinkDefinitionToAnonymousImpl
				.pattern_LinkDefinitionToAnonymous_1_3_bookkeepingforedges_blackBBBBBBBBBBB(ruleresult, mSignature,
						mAnonymous, tAnonymous, tDefinition, tSignature, mInstance, mAnonymousToTAnonymous,
						mSignatureToTSignature, mDefinitionToTMember, mDefinition);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[mSignature] = " + mSignature + ", " + "[mAnonymous] = " + mAnonymous + ", "
					+ "[tAnonymous] = " + tAnonymous + ", " + "[tDefinition] = " + tDefinition + ", "
					+ "[tSignature] = " + tSignature + ", " + "[mInstance] = " + mInstance + ", "
					+ "[mAnonymousToTAnonymous] = " + mAnonymousToTAnonymous + ", " + "[mSignatureToTSignature] = "
					+ mSignatureToTSignature + ", " + "[mDefinitionToTMember] = " + mDefinitionToTMember + ", "
					+ "[mDefinition] = " + mDefinition + ".");
		}
		LinkDefinitionToAnonymousImpl.pattern_LinkDefinitionToAnonymous_1_3_bookkeepingforedges_greenBBBBBBFFFFF(
				ruleresult, mAnonymous, tAnonymous, tDefinition, tSignature, mDefinition);
		//nothing EMoflonEdge tAnonymous__tDefinition____defines = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge tDefinition__tAnonymous____definedBy = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge tAnonymous__tSignature____signature = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge mAnonymous__mDefinition____bodyDeclarations = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge mDefinition__mAnonymous____anonymousClassDeclarationOwner = (EMoflonEdge) result3_green[10];

		// 
		// 
		LinkDefinitionToAnonymousImpl.pattern_LinkDefinitionToAnonymous_1_5_registerobjects_expressionBBBBBBBBBBBB(this,
				ruleresult, mSignature, mAnonymous, tAnonymous, tDefinition, tSignature, mInstance,
				mAnonymousToTAnonymous, mSignatureToTSignature, mDefinitionToTMember, mDefinition);
		return LinkDefinitionToAnonymousImpl.pattern_LinkDefinitionToAnonymous_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = LinkDefinitionToAnonymousImpl
				.pattern_LinkDefinitionToAnonymous_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = LinkDefinitionToAnonymousImpl
				.pattern_LinkDefinitionToAnonymous_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = LinkDefinitionToAnonymousImpl
				.pattern_LinkDefinitionToAnonymous_2_2_corematch_bindingFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		MSignature mSignature = (MSignature) result2_binding[0];
		AnonymousClassDeclaration mAnonymous = (AnonymousClassDeclaration) result2_binding[1];
		ClassInstanceCreation mInstance = (ClassInstanceCreation) result2_binding[2];
		MDefinition mDefinition = (MDefinition) result2_binding[3];
		for (Object[] result2_black : LinkDefinitionToAnonymousImpl
				.pattern_LinkDefinitionToAnonymous_2_2_corematch_blackBBFFFBFFFBB(mSignature, mAnonymous, mInstance,
						mDefinition, match)) {
			TClass tAnonymous = (TClass) result2_black[2];
			TMember tDefinition = (TMember) result2_black[3];
			TSignature tSignature = (TSignature) result2_black[4];
			AnonymousClassDeclarationToTClass mAnonymousToTAnonymous = (AnonymousClassDeclarationToTClass) result2_black[6];
			MSignatureToTSignature mSignatureToTSignature = (MSignatureToTSignature) result2_black[7];
			MDefinitionToTMember mDefinitionToTMember = (MDefinitionToTMember) result2_black[8];
			// ForEach 
			for (Object[] result3_black : LinkDefinitionToAnonymousImpl
					.pattern_LinkDefinitionToAnonymous_2_3_findcontext_blackBBBBBBBBBB(mSignature, mAnonymous,
							tAnonymous, tDefinition, tSignature, mInstance, mAnonymousToTAnonymous,
							mSignatureToTSignature, mDefinitionToTMember, mDefinition)) {
				Object[] result3_green = LinkDefinitionToAnonymousImpl
						.pattern_LinkDefinitionToAnonymous_2_3_findcontext_greenBBBBBBBBBBFFFFFFFFFFFFFFF(mSignature,
								mAnonymous, tAnonymous, tDefinition, tSignature, mInstance, mAnonymousToTAnonymous,
								mSignatureToTSignature, mDefinitionToTMember, mDefinition);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[10];
				//nothing EMoflonEdge tSignature__tDefinition____definitions = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge tDefinition__tSignature____signature = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge mInstance__mAnonymous____anonymousClassDeclaration = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge mAnonymous__mInstance____classInstanceCreation = (EMoflonEdge) result3_green[14];
				//nothing EMoflonEdge mAnonymousToTAnonymous__tAnonymous____target = (EMoflonEdge) result3_green[15];
				//nothing EMoflonEdge mSignatureToTSignature__mSignature____source = (EMoflonEdge) result3_green[16];
				//nothing EMoflonEdge mSignatureToTSignature__tSignature____target = (EMoflonEdge) result3_green[17];
				//nothing EMoflonEdge mDefinitionToTMember__tDefinition____target = (EMoflonEdge) result3_green[18];
				//nothing EMoflonEdge mAnonymous__mDefinition____bodyDeclarations = (EMoflonEdge) result3_green[19];
				//nothing EMoflonEdge mDefinition__mAnonymous____anonymousClassDeclarationOwner = (EMoflonEdge) result3_green[20];
				//nothing EMoflonEdge mAnonymousToTAnonymous__mAnonymous____source = (EMoflonEdge) result3_green[21];
				//nothing EMoflonEdge mDefinitionToTMember__mDefinition____source = (EMoflonEdge) result3_green[22];
				//nothing EMoflonEdge mSignature__mDefinition____mDefinitions = (EMoflonEdge) result3_green[23];
				//nothing EMoflonEdge mDefinition__mSignature____mSignature = (EMoflonEdge) result3_green[24];

				Object[] result4_bindingAndBlack = LinkDefinitionToAnonymousImpl
						.pattern_LinkDefinitionToAnonymous_2_4_solveCSP_bindingAndBlackFBBBBBBBBBBBB(this,
								isApplicableMatch, mSignature, mAnonymous, tAnonymous, tDefinition, tSignature,
								mInstance, mAnonymousToTAnonymous, mSignatureToTSignature, mDefinitionToTMember,
								mDefinition);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[mSignature] = " + mSignature
							+ ", " + "[mAnonymous] = " + mAnonymous + ", " + "[tAnonymous] = " + tAnonymous + ", "
							+ "[tDefinition] = " + tDefinition + ", " + "[tSignature] = " + tSignature + ", "
							+ "[mInstance] = " + mInstance + ", " + "[mAnonymousToTAnonymous] = "
							+ mAnonymousToTAnonymous + ", " + "[mSignatureToTSignature] = " + mSignatureToTSignature
							+ ", " + "[mDefinitionToTMember] = " + mDefinitionToTMember + ", " + "[mDefinition] = "
							+ mDefinition + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (LinkDefinitionToAnonymousImpl.pattern_LinkDefinitionToAnonymous_2_5_checkCSP_expressionFBB(this,
						csp)) {

					Object[] result6_black = LinkDefinitionToAnonymousImpl
							.pattern_LinkDefinitionToAnonymous_2_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					LinkDefinitionToAnonymousImpl.pattern_LinkDefinitionToAnonymous_2_6_addmatchtoruleresult_greenBB(
							ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return LinkDefinitionToAnonymousImpl.pattern_LinkDefinitionToAnonymous_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, MSignature mSignature, AnonymousClassDeclaration mAnonymous,
			ClassInstanceCreation mInstance, MDefinition mDefinition) {
		match.registerObject("mSignature", mSignature);
		match.registerObject("mAnonymous", mAnonymous);
		match.registerObject("mInstance", mInstance);
		match.registerObject("mDefinition", mDefinition);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, MSignature mSignature, AnonymousClassDeclaration mAnonymous,
			ClassInstanceCreation mInstance, MDefinition mDefinition) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, MSignature mSignature,
			AnonymousClassDeclaration mAnonymous, TClass tAnonymous, TMember tDefinition, TSignature tSignature,
			ClassInstanceCreation mInstance, AnonymousClassDeclarationToTClass mAnonymousToTAnonymous,
			MSignatureToTSignature mSignatureToTSignature, MDefinitionToTMember mDefinitionToTMember,
			MDefinition mDefinition) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("mSignature", mSignature);
		isApplicableMatch.registerObject("mAnonymous", mAnonymous);
		isApplicableMatch.registerObject("tAnonymous", tAnonymous);
		isApplicableMatch.registerObject("tDefinition", tDefinition);
		isApplicableMatch.registerObject("tSignature", tSignature);
		isApplicableMatch.registerObject("mInstance", mInstance);
		isApplicableMatch.registerObject("mAnonymousToTAnonymous", mAnonymousToTAnonymous);
		isApplicableMatch.registerObject("mSignatureToTSignature", mSignatureToTSignature);
		isApplicableMatch.registerObject("mDefinitionToTMember", mDefinitionToTMember);
		isApplicableMatch.registerObject("mDefinition", mDefinition);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject mSignature, EObject mAnonymous,
			EObject tAnonymous, EObject tDefinition, EObject tSignature, EObject mInstance,
			EObject mAnonymousToTAnonymous, EObject mSignatureToTSignature, EObject mDefinitionToTMember,
			EObject mDefinition) {
		ruleresult.registerObject("mSignature", mSignature);
		ruleresult.registerObject("mAnonymous", mAnonymous);
		ruleresult.registerObject("tAnonymous", tAnonymous);
		ruleresult.registerObject("tDefinition", tDefinition);
		ruleresult.registerObject("tSignature", tSignature);
		ruleresult.registerObject("mInstance", mInstance);
		ruleresult.registerObject("mAnonymousToTAnonymous", mAnonymousToTAnonymous);
		ruleresult.registerObject("mSignatureToTSignature", mSignatureToTSignature);
		ruleresult.registerObject("mDefinitionToTMember", mDefinitionToTMember);
		ruleresult.registerObject("mDefinition", mDefinition);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, TClass tAnonymous, TMember tDefinition, TSignature tSignature) {

		Object[] result1_black = LinkDefinitionToAnonymousImpl
				.pattern_LinkDefinitionToAnonymous_10_1_initialbindings_blackBBBBB(this, match, tAnonymous, tDefinition,
						tSignature);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[tAnonymous] = " + tAnonymous + ", " + "[tDefinition] = "
					+ tDefinition + ", " + "[tSignature] = " + tSignature + ".");
		}

		Object[] result2_bindingAndBlack = LinkDefinitionToAnonymousImpl
				.pattern_LinkDefinitionToAnonymous_10_2_SolveCSP_bindingAndBlackFBBBBB(this, match, tAnonymous,
						tDefinition, tSignature);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[tAnonymous] = " + tAnonymous + ", " + "[tDefinition] = "
					+ tDefinition + ", " + "[tSignature] = " + tSignature + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (LinkDefinitionToAnonymousImpl.pattern_LinkDefinitionToAnonymous_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = LinkDefinitionToAnonymousImpl
					.pattern_LinkDefinitionToAnonymous_10_4_collectelementstobetranslated_blackBBBB(match, tAnonymous,
							tDefinition, tSignature);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[tAnonymous] = " + tAnonymous + ", " + "[tDefinition] = " + tDefinition + ", "
						+ "[tSignature] = " + tSignature + ".");
			}
			LinkDefinitionToAnonymousImpl
					.pattern_LinkDefinitionToAnonymous_10_4_collectelementstobetranslated_greenBBBBFFF(match,
							tAnonymous, tDefinition, tSignature);
			//nothing EMoflonEdge tAnonymous__tDefinition____defines = (EMoflonEdge) result4_green[4];
			//nothing EMoflonEdge tDefinition__tAnonymous____definedBy = (EMoflonEdge) result4_green[5];
			//nothing EMoflonEdge tAnonymous__tSignature____signature = (EMoflonEdge) result4_green[6];

			Object[] result5_black = LinkDefinitionToAnonymousImpl
					.pattern_LinkDefinitionToAnonymous_10_5_collectcontextelements_blackBBBB(match, tAnonymous,
							tDefinition, tSignature);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[tAnonymous] = " + tAnonymous + ", " + "[tDefinition] = " + tDefinition + ", "
						+ "[tSignature] = " + tSignature + ".");
			}
			LinkDefinitionToAnonymousImpl.pattern_LinkDefinitionToAnonymous_10_5_collectcontextelements_greenBBBBFF(
					match, tAnonymous, tDefinition, tSignature);
			//nothing EMoflonEdge tSignature__tDefinition____definitions = (EMoflonEdge) result5_green[4];
			//nothing EMoflonEdge tDefinition__tSignature____signature = (EMoflonEdge) result5_green[5];

			// 
			LinkDefinitionToAnonymousImpl.pattern_LinkDefinitionToAnonymous_10_6_registerobjectstomatch_expressionBBBBB(
					this, match, tAnonymous, tDefinition, tSignature);
			return LinkDefinitionToAnonymousImpl.pattern_LinkDefinitionToAnonymous_10_7_expressionF();
		} else {
			return LinkDefinitionToAnonymousImpl.pattern_LinkDefinitionToAnonymous_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = LinkDefinitionToAnonymousImpl
				.pattern_LinkDefinitionToAnonymous_11_1_performtransformation_bindingAndBlackFFFFFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		MSignature mSignature = (MSignature) result1_bindingAndBlack[0];
		AnonymousClassDeclaration mAnonymous = (AnonymousClassDeclaration) result1_bindingAndBlack[1];
		TClass tAnonymous = (TClass) result1_bindingAndBlack[2];
		TMember tDefinition = (TMember) result1_bindingAndBlack[3];
		TSignature tSignature = (TSignature) result1_bindingAndBlack[4];
		ClassInstanceCreation mInstance = (ClassInstanceCreation) result1_bindingAndBlack[5];
		AnonymousClassDeclarationToTClass mAnonymousToTAnonymous = (AnonymousClassDeclarationToTClass) result1_bindingAndBlack[6];
		MSignatureToTSignature mSignatureToTSignature = (MSignatureToTSignature) result1_bindingAndBlack[7];
		MDefinitionToTMember mDefinitionToTMember = (MDefinitionToTMember) result1_bindingAndBlack[8];
		MDefinition mDefinition = (MDefinition) result1_bindingAndBlack[9];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[10];
		LinkDefinitionToAnonymousImpl.pattern_LinkDefinitionToAnonymous_11_1_performtransformation_greenBB(mAnonymous,
				mDefinition);

		Object[] result2_green = LinkDefinitionToAnonymousImpl
				.pattern_LinkDefinitionToAnonymous_11_2_collecttranslatedelements_greenF();
		if (result2_green == null) {
			throw new RuntimeException("Pattern matching failed.");
		}
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = LinkDefinitionToAnonymousImpl
				.pattern_LinkDefinitionToAnonymous_11_3_bookkeepingforedges_blackBBBBBBBBBBB(ruleresult, mSignature,
						mAnonymous, tAnonymous, tDefinition, tSignature, mInstance, mAnonymousToTAnonymous,
						mSignatureToTSignature, mDefinitionToTMember, mDefinition);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[mSignature] = " + mSignature + ", " + "[mAnonymous] = " + mAnonymous + ", "
					+ "[tAnonymous] = " + tAnonymous + ", " + "[tDefinition] = " + tDefinition + ", "
					+ "[tSignature] = " + tSignature + ", " + "[mInstance] = " + mInstance + ", "
					+ "[mAnonymousToTAnonymous] = " + mAnonymousToTAnonymous + ", " + "[mSignatureToTSignature] = "
					+ mSignatureToTSignature + ", " + "[mDefinitionToTMember] = " + mDefinitionToTMember + ", "
					+ "[mDefinition] = " + mDefinition + ".");
		}
		LinkDefinitionToAnonymousImpl.pattern_LinkDefinitionToAnonymous_11_3_bookkeepingforedges_greenBBBBBBFFFFF(
				ruleresult, mAnonymous, tAnonymous, tDefinition, tSignature, mDefinition);
		//nothing EMoflonEdge tAnonymous__tDefinition____defines = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge tDefinition__tAnonymous____definedBy = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge tAnonymous__tSignature____signature = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge mAnonymous__mDefinition____bodyDeclarations = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge mDefinition__mAnonymous____anonymousClassDeclarationOwner = (EMoflonEdge) result3_green[10];

		// 
		// 
		LinkDefinitionToAnonymousImpl.pattern_LinkDefinitionToAnonymous_11_5_registerobjects_expressionBBBBBBBBBBBB(
				this, ruleresult, mSignature, mAnonymous, tAnonymous, tDefinition, tSignature, mInstance,
				mAnonymousToTAnonymous, mSignatureToTSignature, mDefinitionToTMember, mDefinition);
		return LinkDefinitionToAnonymousImpl.pattern_LinkDefinitionToAnonymous_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = LinkDefinitionToAnonymousImpl
				.pattern_LinkDefinitionToAnonymous_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = LinkDefinitionToAnonymousImpl
				.pattern_LinkDefinitionToAnonymous_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = LinkDefinitionToAnonymousImpl
				.pattern_LinkDefinitionToAnonymous_12_2_corematch_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		TClass tAnonymous = (TClass) result2_binding[0];
		TMember tDefinition = (TMember) result2_binding[1];
		TSignature tSignature = (TSignature) result2_binding[2];
		for (Object[] result2_black : LinkDefinitionToAnonymousImpl
				.pattern_LinkDefinitionToAnonymous_12_2_corematch_blackFFBBBFFFFB(tAnonymous, tDefinition, tSignature,
						match)) {
			MSignature mSignature = (MSignature) result2_black[0];
			AnonymousClassDeclaration mAnonymous = (AnonymousClassDeclaration) result2_black[1];
			AnonymousClassDeclarationToTClass mAnonymousToTAnonymous = (AnonymousClassDeclarationToTClass) result2_black[5];
			MSignatureToTSignature mSignatureToTSignature = (MSignatureToTSignature) result2_black[6];
			MDefinitionToTMember mDefinitionToTMember = (MDefinitionToTMember) result2_black[7];
			MDefinition mDefinition = (MDefinition) result2_black[8];
			// ForEach 
			for (Object[] result3_black : LinkDefinitionToAnonymousImpl
					.pattern_LinkDefinitionToAnonymous_12_3_findcontext_blackBBBBBFBBBB(mSignature, mAnonymous,
							tAnonymous, tDefinition, tSignature, mAnonymousToTAnonymous, mSignatureToTSignature,
							mDefinitionToTMember, mDefinition)) {
				ClassInstanceCreation mInstance = (ClassInstanceCreation) result3_black[5];
				Object[] result3_green = LinkDefinitionToAnonymousImpl
						.pattern_LinkDefinitionToAnonymous_12_3_findcontext_greenBBBBBBBBBBFFFFFFFFFFFFFFFF(mSignature,
								mAnonymous, tAnonymous, tDefinition, tSignature, mInstance, mAnonymousToTAnonymous,
								mSignatureToTSignature, mDefinitionToTMember, mDefinition);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[10];
				//nothing EMoflonEdge tAnonymous__tDefinition____defines = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge tDefinition__tAnonymous____definedBy = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge tSignature__tDefinition____definitions = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge tDefinition__tSignature____signature = (EMoflonEdge) result3_green[14];
				//nothing EMoflonEdge mInstance__mAnonymous____anonymousClassDeclaration = (EMoflonEdge) result3_green[15];
				//nothing EMoflonEdge mAnonymous__mInstance____classInstanceCreation = (EMoflonEdge) result3_green[16];
				//nothing EMoflonEdge tAnonymous__tSignature____signature = (EMoflonEdge) result3_green[17];
				//nothing EMoflonEdge mAnonymousToTAnonymous__tAnonymous____target = (EMoflonEdge) result3_green[18];
				//nothing EMoflonEdge mSignatureToTSignature__mSignature____source = (EMoflonEdge) result3_green[19];
				//nothing EMoflonEdge mSignatureToTSignature__tSignature____target = (EMoflonEdge) result3_green[20];
				//nothing EMoflonEdge mDefinitionToTMember__tDefinition____target = (EMoflonEdge) result3_green[21];
				//nothing EMoflonEdge mAnonymousToTAnonymous__mAnonymous____source = (EMoflonEdge) result3_green[22];
				//nothing EMoflonEdge mDefinitionToTMember__mDefinition____source = (EMoflonEdge) result3_green[23];
				//nothing EMoflonEdge mSignature__mDefinition____mDefinitions = (EMoflonEdge) result3_green[24];
				//nothing EMoflonEdge mDefinition__mSignature____mSignature = (EMoflonEdge) result3_green[25];

				Object[] result4_bindingAndBlack = LinkDefinitionToAnonymousImpl
						.pattern_LinkDefinitionToAnonymous_12_4_solveCSP_bindingAndBlackFBBBBBBBBBBBB(this,
								isApplicableMatch, mSignature, mAnonymous, tAnonymous, tDefinition, tSignature,
								mInstance, mAnonymousToTAnonymous, mSignatureToTSignature, mDefinitionToTMember,
								mDefinition);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[mSignature] = " + mSignature
							+ ", " + "[mAnonymous] = " + mAnonymous + ", " + "[tAnonymous] = " + tAnonymous + ", "
							+ "[tDefinition] = " + tDefinition + ", " + "[tSignature] = " + tSignature + ", "
							+ "[mInstance] = " + mInstance + ", " + "[mAnonymousToTAnonymous] = "
							+ mAnonymousToTAnonymous + ", " + "[mSignatureToTSignature] = " + mSignatureToTSignature
							+ ", " + "[mDefinitionToTMember] = " + mDefinitionToTMember + ", " + "[mDefinition] = "
							+ mDefinition + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (LinkDefinitionToAnonymousImpl.pattern_LinkDefinitionToAnonymous_12_5_checkCSP_expressionFBB(this,
						csp)) {

					Object[] result6_black = LinkDefinitionToAnonymousImpl
							.pattern_LinkDefinitionToAnonymous_12_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					LinkDefinitionToAnonymousImpl.pattern_LinkDefinitionToAnonymous_12_6_addmatchtoruleresult_greenBB(
							ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return LinkDefinitionToAnonymousImpl.pattern_LinkDefinitionToAnonymous_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, TClass tAnonymous, TMember tDefinition, TSignature tSignature) {
		match.registerObject("tAnonymous", tAnonymous);
		match.registerObject("tDefinition", tDefinition);
		match.registerObject("tSignature", tSignature);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, TClass tAnonymous, TMember tDefinition, TSignature tSignature) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, MSignature mSignature,
			AnonymousClassDeclaration mAnonymous, TClass tAnonymous, TMember tDefinition, TSignature tSignature,
			ClassInstanceCreation mInstance, AnonymousClassDeclarationToTClass mAnonymousToTAnonymous,
			MSignatureToTSignature mSignatureToTSignature, MDefinitionToTMember mDefinitionToTMember,
			MDefinition mDefinition) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("mSignature", mSignature);
		isApplicableMatch.registerObject("mAnonymous", mAnonymous);
		isApplicableMatch.registerObject("tAnonymous", tAnonymous);
		isApplicableMatch.registerObject("tDefinition", tDefinition);
		isApplicableMatch.registerObject("tSignature", tSignature);
		isApplicableMatch.registerObject("mInstance", mInstance);
		isApplicableMatch.registerObject("mAnonymousToTAnonymous", mAnonymousToTAnonymous);
		isApplicableMatch.registerObject("mSignatureToTSignature", mSignatureToTSignature);
		isApplicableMatch.registerObject("mDefinitionToTMember", mDefinitionToTMember);
		isApplicableMatch.registerObject("mDefinition", mDefinition);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject mSignature, EObject mAnonymous,
			EObject tAnonymous, EObject tDefinition, EObject tSignature, EObject mInstance,
			EObject mAnonymousToTAnonymous, EObject mSignatureToTSignature, EObject mDefinitionToTMember,
			EObject mDefinition) {
		ruleresult.registerObject("mSignature", mSignature);
		ruleresult.registerObject("mAnonymous", mAnonymous);
		ruleresult.registerObject("tAnonymous", tAnonymous);
		ruleresult.registerObject("tDefinition", tDefinition);
		ruleresult.registerObject("tSignature", tSignature);
		ruleresult.registerObject("mInstance", mInstance);
		ruleresult.registerObject("mAnonymousToTAnonymous", mAnonymousToTAnonymous);
		ruleresult.registerObject("mSignatureToTSignature", mSignatureToTSignature);
		ruleresult.registerObject("mDefinitionToTMember", mDefinitionToTMember);
		ruleresult.registerObject("mDefinition", mDefinition);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_48(EMoflonEdge _edge_defines) {

		Object[] result1_bindingAndBlack = LinkDefinitionToAnonymousImpl
				.pattern_LinkDefinitionToAnonymous_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = LinkDefinitionToAnonymousImpl
				.pattern_LinkDefinitionToAnonymous_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : LinkDefinitionToAnonymousImpl
				.pattern_LinkDefinitionToAnonymous_20_2_testcorematchandDECs_blackFFFB(_edge_defines)) {
			TClass tAnonymous = (TClass) result2_black[0];
			TMember tDefinition = (TMember) result2_black[1];
			TSignature tSignature = (TSignature) result2_black[2];
			Object[] result2_green = LinkDefinitionToAnonymousImpl
					.pattern_LinkDefinitionToAnonymous_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (LinkDefinitionToAnonymousImpl
					.pattern_LinkDefinitionToAnonymous_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
							this, match, tAnonymous, tDefinition, tSignature)) {
				// 
				if (LinkDefinitionToAnonymousImpl
						.pattern_LinkDefinitionToAnonymous_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = LinkDefinitionToAnonymousImpl
							.pattern_LinkDefinitionToAnonymous_20_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					LinkDefinitionToAnonymousImpl.pattern_LinkDefinitionToAnonymous_20_5_Addmatchtoruleresult_greenBBBB(
							match, __performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return LinkDefinitionToAnonymousImpl.pattern_LinkDefinitionToAnonymous_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_49(EMoflonEdge _edge_bodyDeclarations) {

		Object[] result1_bindingAndBlack = LinkDefinitionToAnonymousImpl
				.pattern_LinkDefinitionToAnonymous_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = LinkDefinitionToAnonymousImpl
				.pattern_LinkDefinitionToAnonymous_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : LinkDefinitionToAnonymousImpl
				.pattern_LinkDefinitionToAnonymous_21_2_testcorematchandDECs_blackFFFFB(_edge_bodyDeclarations)) {
			MSignature mSignature = (MSignature) result2_black[0];
			AnonymousClassDeclaration mAnonymous = (AnonymousClassDeclaration) result2_black[1];
			ClassInstanceCreation mInstance = (ClassInstanceCreation) result2_black[2];
			MDefinition mDefinition = (MDefinition) result2_black[3];
			Object[] result2_green = LinkDefinitionToAnonymousImpl
					.pattern_LinkDefinitionToAnonymous_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (LinkDefinitionToAnonymousImpl
					.pattern_LinkDefinitionToAnonymous_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(
							this, match, mSignature, mAnonymous, mInstance, mDefinition)) {
				// 
				if (LinkDefinitionToAnonymousImpl
						.pattern_LinkDefinitionToAnonymous_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = LinkDefinitionToAnonymousImpl
							.pattern_LinkDefinitionToAnonymous_21_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					LinkDefinitionToAnonymousImpl.pattern_LinkDefinitionToAnonymous_21_5_Addmatchtoruleresult_greenBBBB(
							match, __performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return LinkDefinitionToAnonymousImpl.pattern_LinkDefinitionToAnonymous_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("LinkDefinitionToAnonymous");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

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
		ruleResult.setRule("LinkDefinitionToAnonymous");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

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

		Object[] result1_black = LinkDefinitionToAnonymousImpl
				.pattern_LinkDefinitionToAnonymous_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = LinkDefinitionToAnonymousImpl.pattern_LinkDefinitionToAnonymous_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = LinkDefinitionToAnonymousImpl
				.pattern_LinkDefinitionToAnonymous_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFFBB(sourceMatch,
						targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		MSignature mSignature = (MSignature) result2_bindingAndBlack[0];
		AnonymousClassDeclaration mAnonymous = (AnonymousClassDeclaration) result2_bindingAndBlack[1];
		TClass tAnonymous = (TClass) result2_bindingAndBlack[2];
		TMember tDefinition = (TMember) result2_bindingAndBlack[3];
		TSignature tSignature = (TSignature) result2_bindingAndBlack[4];
		ClassInstanceCreation mInstance = (ClassInstanceCreation) result2_bindingAndBlack[5];
		MDefinition mDefinition = (MDefinition) result2_bindingAndBlack[6];

		Object[] result3_bindingAndBlack = LinkDefinitionToAnonymousImpl
				.pattern_LinkDefinitionToAnonymous_24_3_solvecsp_bindingAndBlackFBBBBBBBBBB(this, mSignature,
						mAnonymous, tAnonymous, tDefinition, tSignature, mInstance, mDefinition, sourceMatch,
						targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[mSignature] = " + mSignature + ", " + "[mAnonymous] = " + mAnonymous + ", " + "[tAnonymous] = "
					+ tAnonymous + ", " + "[tDefinition] = " + tDefinition + ", " + "[tSignature] = " + tSignature
					+ ", " + "[mInstance] = " + mInstance + ", " + "[mDefinition] = " + mDefinition + ", "
					+ "[sourceMatch] = " + sourceMatch + ", " + "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (LinkDefinitionToAnonymousImpl.pattern_LinkDefinitionToAnonymous_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : LinkDefinitionToAnonymousImpl
					.pattern_LinkDefinitionToAnonymous_24_5_matchcorrcontext_blackBBBBBFFFBBB(mSignature, mAnonymous,
							tAnonymous, tDefinition, tSignature, mDefinition, sourceMatch, targetMatch)) {
				AnonymousClassDeclarationToTClass mAnonymousToTAnonymous = (AnonymousClassDeclarationToTClass) result5_black[5];
				MSignatureToTSignature mSignatureToTSignature = (MSignatureToTSignature) result5_black[6];
				MDefinitionToTMember mDefinitionToTMember = (MDefinitionToTMember) result5_black[7];
				Object[] result5_green = LinkDefinitionToAnonymousImpl
						.pattern_LinkDefinitionToAnonymous_24_5_matchcorrcontext_greenBBBBBF(mAnonymousToTAnonymous,
								mSignatureToTSignature, mDefinitionToTMember, sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[5];

				Object[] result6_black = LinkDefinitionToAnonymousImpl
						.pattern_LinkDefinitionToAnonymous_24_6_createcorrespondence_blackBBBBBBBB(mSignature,
								mAnonymous, tAnonymous, tDefinition, tSignature, mInstance, mDefinition, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[mSignature] = "
							+ mSignature + ", " + "[mAnonymous] = " + mAnonymous + ", " + "[tAnonymous] = " + tAnonymous
							+ ", " + "[tDefinition] = " + tDefinition + ", " + "[tSignature] = " + tSignature + ", "
							+ "[mInstance] = " + mInstance + ", " + "[mDefinition] = " + mDefinition + ", "
							+ "[ccMatch] = " + ccMatch + ".");
				}

				Object[] result7_black = LinkDefinitionToAnonymousImpl
						.pattern_LinkDefinitionToAnonymous_24_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				LinkDefinitionToAnonymousImpl.pattern_LinkDefinitionToAnonymous_24_7_addtoreturnedresult_greenBB(result,
						ccMatch);

			}

		} else {
		}
		return LinkDefinitionToAnonymousImpl.pattern_LinkDefinitionToAnonymous_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(MSignature mSignature, AnonymousClassDeclaration mAnonymous, TClass tAnonymous,
			TMember tDefinition, TSignature tSignature, ClassInstanceCreation mInstance, MDefinition mDefinition,
			Match sourceMatch, Match targetMatch) {// Create CSP
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
	public boolean checkDEC_FWD(MSignature mSignature, AnonymousClassDeclaration mAnonymous,
			ClassInstanceCreation mInstance, MDefinition mDefinition) {// 
		Object[] result1_black = LinkDefinitionToAnonymousImpl
				.pattern_LinkDefinitionToAnonymous_27_1_matchtggpattern_blackBBBB(mSignature, mAnonymous, mInstance,
						mDefinition);
		if (result1_black != null) {
			return LinkDefinitionToAnonymousImpl.pattern_LinkDefinitionToAnonymous_27_2_expressionF();
		} else {
			return LinkDefinitionToAnonymousImpl.pattern_LinkDefinitionToAnonymous_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(TClass tAnonymous, TMember tDefinition, TSignature tSignature) {// 
		Object[] result1_black = LinkDefinitionToAnonymousImpl
				.pattern_LinkDefinitionToAnonymous_28_1_matchtggpattern_blackBBB(tAnonymous, tDefinition, tSignature);
		if (result1_black != null) {
			return LinkDefinitionToAnonymousImpl.pattern_LinkDefinitionToAnonymous_28_2_expressionF();
		} else {
			return LinkDefinitionToAnonymousImpl.pattern_LinkDefinitionToAnonymous_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer,
			MDefinitionToTMember mDefinitionToTMemberParameter,
			AnonymousClassDeclarationToTClass mAnonymousToTAnonymousParameter) {

		Object[] result1_black = LinkDefinitionToAnonymousImpl
				.pattern_LinkDefinitionToAnonymous_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = LinkDefinitionToAnonymousImpl
				.pattern_LinkDefinitionToAnonymous_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : LinkDefinitionToAnonymousImpl
				.pattern_LinkDefinitionToAnonymous_29_2_isapplicablecore_blackFFFFFFFFFFFFBB(ruleEntryContainer,
						ruleResult)) {
			//nothing RuleEntryList mDefinitionToTMemberList = (RuleEntryList) result2_black[0];
			MSignature mSignature = (MSignature) result2_black[1];
			MDefinition mDefinition = (MDefinition) result2_black[2];
			MDefinitionToTMember mDefinitionToTMember = (MDefinitionToTMember) result2_black[3];
			TMember tDefinition = (TMember) result2_black[4];
			TSignature tSignature = (TSignature) result2_black[5];
			MSignatureToTSignature mSignatureToTSignature = (MSignatureToTSignature) result2_black[6];
			//nothing RuleEntryList mAnonymousToTAnonymousList = (RuleEntryList) result2_black[7];
			AnonymousClassDeclaration mAnonymous = (AnonymousClassDeclaration) result2_black[8];
			ClassInstanceCreation mInstance = (ClassInstanceCreation) result2_black[9];
			AnonymousClassDeclarationToTClass mAnonymousToTAnonymous = (AnonymousClassDeclarationToTClass) result2_black[10];
			TClass tAnonymous = (TClass) result2_black[11];

			Object[] result3_bindingAndBlack = LinkDefinitionToAnonymousImpl
					.pattern_LinkDefinitionToAnonymous_29_3_solveCSP_bindingAndBlackFBBBBBBBBBBBBB(this,
							isApplicableMatch, mSignature, mAnonymous, tAnonymous, tDefinition, tSignature, mInstance,
							mAnonymousToTAnonymous, mSignatureToTSignature, mDefinitionToTMember, mDefinition,
							ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[mSignature] = " + mSignature + ", "
						+ "[mAnonymous] = " + mAnonymous + ", " + "[tAnonymous] = " + tAnonymous + ", "
						+ "[tDefinition] = " + tDefinition + ", " + "[tSignature] = " + tSignature + ", "
						+ "[mInstance] = " + mInstance + ", " + "[mAnonymousToTAnonymous] = " + mAnonymousToTAnonymous
						+ ", " + "[mSignatureToTSignature] = " + mSignatureToTSignature + ", "
						+ "[mDefinitionToTMember] = " + mDefinitionToTMember + ", " + "[mDefinition] = " + mDefinition
						+ ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (LinkDefinitionToAnonymousImpl.pattern_LinkDefinitionToAnonymous_29_4_checkCSP_expressionFBB(this,
					csp)) {
				// 
				Object[] result5_black = LinkDefinitionToAnonymousImpl
						.pattern_LinkDefinitionToAnonymous_29_5_checknacs_blackBBBBBBBBBB(mSignature, mAnonymous,
								tAnonymous, tDefinition, tSignature, mInstance, mAnonymousToTAnonymous,
								mSignatureToTSignature, mDefinitionToTMember, mDefinition);
				if (result5_black != null) {

					Object[] result6_black = LinkDefinitionToAnonymousImpl
							.pattern_LinkDefinitionToAnonymous_29_6_perform_blackBBBBBBBBBBB(mSignature, mAnonymous,
									tAnonymous, tDefinition, tSignature, mInstance, mAnonymousToTAnonymous,
									mSignatureToTSignature, mDefinitionToTMember, mDefinition, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[mSignature] = "
								+ mSignature + ", " + "[mAnonymous] = " + mAnonymous + ", " + "[tAnonymous] = "
								+ tAnonymous + ", " + "[tDefinition] = " + tDefinition + ", " + "[tSignature] = "
								+ tSignature + ", " + "[mInstance] = " + mInstance + ", "
								+ "[mAnonymousToTAnonymous] = " + mAnonymousToTAnonymous + ", "
								+ "[mSignatureToTSignature] = " + mSignatureToTSignature + ", "
								+ "[mDefinitionToTMember] = " + mDefinitionToTMember + ", " + "[mDefinition] = "
								+ mDefinition + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					LinkDefinitionToAnonymousImpl.pattern_LinkDefinitionToAnonymous_29_6_perform_greenBBBBBB(mAnonymous,
							tAnonymous, tDefinition, tSignature, mDefinition, ruleResult);

				} else {
				}

			} else {
			}

		}
		return LinkDefinitionToAnonymousImpl.pattern_LinkDefinitionToAnonymous_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, MSignature mSignature,
			AnonymousClassDeclaration mAnonymous, TClass tAnonymous, TMember tDefinition, TSignature tSignature,
			ClassInstanceCreation mInstance, AnonymousClassDeclarationToTClass mAnonymousToTAnonymous,
			MSignatureToTSignature mSignatureToTSignature, MDefinitionToTMember mDefinitionToTMember,
			MDefinition mDefinition, ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("mSignature", mSignature);
		isApplicableMatch.registerObject("mAnonymous", mAnonymous);
		isApplicableMatch.registerObject("tAnonymous", tAnonymous);
		isApplicableMatch.registerObject("tDefinition", tDefinition);
		isApplicableMatch.registerObject("tSignature", tSignature);
		isApplicableMatch.registerObject("mInstance", mInstance);
		isApplicableMatch.registerObject("mAnonymousToTAnonymous", mAnonymousToTAnonymous);
		isApplicableMatch.registerObject("mSignatureToTSignature", mSignatureToTSignature);
		isApplicableMatch.registerObject("mDefinitionToTMember", mDefinitionToTMember);
		isApplicableMatch.registerObject("mDefinition", mDefinition);
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
		case RulesPackage.LINK_DEFINITION_TO_ANONYMOUS___IS_APPROPRIATE_FWD__MATCH_MSIGNATURE_ANONYMOUSCLASSDECLARATION_CLASSINSTANCECREATION_MDEFINITION:
			return isAppropriate_FWD((Match) arguments.get(0), (MSignature) arguments.get(1),
					(AnonymousClassDeclaration) arguments.get(2), (ClassInstanceCreation) arguments.get(3),
					(MDefinition) arguments.get(4));
		case RulesPackage.LINK_DEFINITION_TO_ANONYMOUS___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.LINK_DEFINITION_TO_ANONYMOUS___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.LINK_DEFINITION_TO_ANONYMOUS___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_MSIGNATURE_ANONYMOUSCLASSDECLARATION_CLASSINSTANCECREATION_MDEFINITION:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (MSignature) arguments.get(1),
					(AnonymousClassDeclaration) arguments.get(2), (ClassInstanceCreation) arguments.get(3),
					(MDefinition) arguments.get(4));
			return null;
		case RulesPackage.LINK_DEFINITION_TO_ANONYMOUS___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_MSIGNATURE_ANONYMOUSCLASSDECLARATION_CLASSINSTANCECREATION_MDEFINITION:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (MSignature) arguments.get(1),
					(AnonymousClassDeclaration) arguments.get(2), (ClassInstanceCreation) arguments.get(3),
					(MDefinition) arguments.get(4));
		case RulesPackage.LINK_DEFINITION_TO_ANONYMOUS___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.LINK_DEFINITION_TO_ANONYMOUS___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_MSIGNATURE_ANONYMOUSCLASSDECLARATION_TCLASS_TMEMBER_TSIGNATURE_CLASSINSTANCECREATION_ANONYMOUSCLASSDECLARATIONTOTCLASS_MSIGNATURETOTSIGNATURE_MDEFINITIONTOTMEMBER_MDEFINITION:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (MSignature) arguments.get(1),
					(AnonymousClassDeclaration) arguments.get(2), (TClass) arguments.get(3), (TMember) arguments.get(4),
					(TSignature) arguments.get(5), (ClassInstanceCreation) arguments.get(6),
					(AnonymousClassDeclarationToTClass) arguments.get(7), (MSignatureToTSignature) arguments.get(8),
					(MDefinitionToTMember) arguments.get(9), (MDefinition) arguments.get(10));
		case RulesPackage.LINK_DEFINITION_TO_ANONYMOUS___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.LINK_DEFINITION_TO_ANONYMOUS___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10));
			return null;
		case RulesPackage.LINK_DEFINITION_TO_ANONYMOUS___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.LINK_DEFINITION_TO_ANONYMOUS___IS_APPROPRIATE_BWD__MATCH_TCLASS_TMEMBER_TSIGNATURE:
			return isAppropriate_BWD((Match) arguments.get(0), (TClass) arguments.get(1), (TMember) arguments.get(2),
					(TSignature) arguments.get(3));
		case RulesPackage.LINK_DEFINITION_TO_ANONYMOUS___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.LINK_DEFINITION_TO_ANONYMOUS___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.LINK_DEFINITION_TO_ANONYMOUS___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TCLASS_TMEMBER_TSIGNATURE:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (TClass) arguments.get(1), (TMember) arguments.get(2),
					(TSignature) arguments.get(3));
			return null;
		case RulesPackage.LINK_DEFINITION_TO_ANONYMOUS___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TCLASS_TMEMBER_TSIGNATURE:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (TClass) arguments.get(1),
					(TMember) arguments.get(2), (TSignature) arguments.get(3));
		case RulesPackage.LINK_DEFINITION_TO_ANONYMOUS___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.LINK_DEFINITION_TO_ANONYMOUS___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_MSIGNATURE_ANONYMOUSCLASSDECLARATION_TCLASS_TMEMBER_TSIGNATURE_CLASSINSTANCECREATION_ANONYMOUSCLASSDECLARATIONTOTCLASS_MSIGNATURETOTSIGNATURE_MDEFINITIONTOTMEMBER_MDEFINITION:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (MSignature) arguments.get(1),
					(AnonymousClassDeclaration) arguments.get(2), (TClass) arguments.get(3), (TMember) arguments.get(4),
					(TSignature) arguments.get(5), (ClassInstanceCreation) arguments.get(6),
					(AnonymousClassDeclarationToTClass) arguments.get(7), (MSignatureToTSignature) arguments.get(8),
					(MDefinitionToTMember) arguments.get(9), (MDefinition) arguments.get(10));
		case RulesPackage.LINK_DEFINITION_TO_ANONYMOUS___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.LINK_DEFINITION_TO_ANONYMOUS___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10));
			return null;
		case RulesPackage.LINK_DEFINITION_TO_ANONYMOUS___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.LINK_DEFINITION_TO_ANONYMOUS___IS_APPROPRIATE_BWD_EMOFLON_EDGE_48__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_48((EMoflonEdge) arguments.get(0));
		case RulesPackage.LINK_DEFINITION_TO_ANONYMOUS___IS_APPROPRIATE_FWD_EMOFLON_EDGE_49__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_49((EMoflonEdge) arguments.get(0));
		case RulesPackage.LINK_DEFINITION_TO_ANONYMOUS___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.LINK_DEFINITION_TO_ANONYMOUS___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.LINK_DEFINITION_TO_ANONYMOUS___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.LINK_DEFINITION_TO_ANONYMOUS___IS_APPLICABLE_SOLVE_CSP_CC__MSIGNATURE_ANONYMOUSCLASSDECLARATION_TCLASS_TMEMBER_TSIGNATURE_CLASSINSTANCECREATION_MDEFINITION_MATCH_MATCH:
			return isApplicable_solveCsp_CC((MSignature) arguments.get(0), (AnonymousClassDeclaration) arguments.get(1),
					(TClass) arguments.get(2), (TMember) arguments.get(3), (TSignature) arguments.get(4),
					(ClassInstanceCreation) arguments.get(5), (MDefinition) arguments.get(6), (Match) arguments.get(7),
					(Match) arguments.get(8));
		case RulesPackage.LINK_DEFINITION_TO_ANONYMOUS___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.LINK_DEFINITION_TO_ANONYMOUS___CHECK_DEC_FWD__MSIGNATURE_ANONYMOUSCLASSDECLARATION_CLASSINSTANCECREATION_MDEFINITION:
			return checkDEC_FWD((MSignature) arguments.get(0), (AnonymousClassDeclaration) arguments.get(1),
					(ClassInstanceCreation) arguments.get(2), (MDefinition) arguments.get(3));
		case RulesPackage.LINK_DEFINITION_TO_ANONYMOUS___CHECK_DEC_BWD__TCLASS_TMEMBER_TSIGNATURE:
			return checkDEC_BWD((TClass) arguments.get(0), (TMember) arguments.get(1), (TSignature) arguments.get(2));
		case RulesPackage.LINK_DEFINITION_TO_ANONYMOUS___GENERATE_MODEL__RULEENTRYCONTAINER_MDEFINITIONTOTMEMBER_ANONYMOUSCLASSDECLARATIONTOTCLASS:
			return generateModel((RuleEntryContainer) arguments.get(0), (MDefinitionToTMember) arguments.get(1),
					(AnonymousClassDeclarationToTClass) arguments.get(2));
		case RulesPackage.LINK_DEFINITION_TO_ANONYMOUS___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_MSIGNATURE_ANONYMOUSCLASSDECLARATION_TCLASS_TMEMBER_TSIGNATURE_CLASSINSTANCECREATION_ANONYMOUSCLASSDECLARATIONTOTCLASS_MSIGNATURETOTSIGNATURE_MDEFINITIONTOTMEMBER_MDEFINITION_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (MSignature) arguments.get(1),
					(AnonymousClassDeclaration) arguments.get(2), (TClass) arguments.get(3), (TMember) arguments.get(4),
					(TSignature) arguments.get(5), (ClassInstanceCreation) arguments.get(6),
					(AnonymousClassDeclarationToTClass) arguments.get(7), (MSignatureToTSignature) arguments.get(8),
					(MDefinitionToTMember) arguments.get(9), (MDefinition) arguments.get(10),
					(ModelgeneratorRuleResult) arguments.get(11));
		case RulesPackage.LINK_DEFINITION_TO_ANONYMOUS___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_0_1_initialbindings_blackBBBBBB(
			LinkDefinitionToAnonymous _this, Match match, MSignature mSignature, AnonymousClassDeclaration mAnonymous,
			ClassInstanceCreation mInstance, MDefinition mDefinition) {
		return new Object[] { _this, match, mSignature, mAnonymous, mInstance, mDefinition };
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_0_2_SolveCSP_bindingFBBBBBB(
			LinkDefinitionToAnonymous _this, Match match, MSignature mSignature, AnonymousClassDeclaration mAnonymous,
			ClassInstanceCreation mInstance, MDefinition mDefinition) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, mSignature, mAnonymous, mInstance, mDefinition);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, mSignature, mAnonymous, mInstance, mDefinition };
		}
		return null;
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_0_2_SolveCSP_bindingAndBlackFBBBBBB(
			LinkDefinitionToAnonymous _this, Match match, MSignature mSignature, AnonymousClassDeclaration mAnonymous,
			ClassInstanceCreation mInstance, MDefinition mDefinition) {
		Object[] result_pattern_LinkDefinitionToAnonymous_0_2_SolveCSP_binding = pattern_LinkDefinitionToAnonymous_0_2_SolveCSP_bindingFBBBBBB(
				_this, match, mSignature, mAnonymous, mInstance, mDefinition);
		if (result_pattern_LinkDefinitionToAnonymous_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_LinkDefinitionToAnonymous_0_2_SolveCSP_binding[0];

			Object[] result_pattern_LinkDefinitionToAnonymous_0_2_SolveCSP_black = pattern_LinkDefinitionToAnonymous_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_LinkDefinitionToAnonymous_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, mSignature, mAnonymous, mInstance, mDefinition };
			}
		}
		return null;
	}

	public static final boolean pattern_LinkDefinitionToAnonymous_0_3_CheckCSP_expressionFBB(
			LinkDefinitionToAnonymous _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_0_4_collectelementstobetranslated_blackBBBBB(
			Match match, MSignature mSignature, AnonymousClassDeclaration mAnonymous, ClassInstanceCreation mInstance,
			MDefinition mDefinition) {
		return new Object[] { match, mSignature, mAnonymous, mInstance, mDefinition };
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_0_4_collectelementstobetranslated_greenBBBFF(
			Match match, AnonymousClassDeclaration mAnonymous, MDefinition mDefinition) {
		EMoflonEdge mAnonymous__mDefinition____bodyDeclarations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mDefinition__mAnonymous____anonymousClassDeclarationOwner = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String mAnonymous__mDefinition____bodyDeclarations_name_prime = "bodyDeclarations";
		String mDefinition__mAnonymous____anonymousClassDeclarationOwner_name_prime = "anonymousClassDeclarationOwner";
		mAnonymous__mDefinition____bodyDeclarations.setSrc(mAnonymous);
		mAnonymous__mDefinition____bodyDeclarations.setTrg(mDefinition);
		match.getToBeTranslatedEdges().add(mAnonymous__mDefinition____bodyDeclarations);
		mDefinition__mAnonymous____anonymousClassDeclarationOwner.setSrc(mDefinition);
		mDefinition__mAnonymous____anonymousClassDeclarationOwner.setTrg(mAnonymous);
		match.getToBeTranslatedEdges().add(mDefinition__mAnonymous____anonymousClassDeclarationOwner);
		mAnonymous__mDefinition____bodyDeclarations.setName(mAnonymous__mDefinition____bodyDeclarations_name_prime);
		mDefinition__mAnonymous____anonymousClassDeclarationOwner
				.setName(mDefinition__mAnonymous____anonymousClassDeclarationOwner_name_prime);
		return new Object[] { match, mAnonymous, mDefinition, mAnonymous__mDefinition____bodyDeclarations,
				mDefinition__mAnonymous____anonymousClassDeclarationOwner };
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_0_5_collectcontextelements_blackBBBBB(Match match,
			MSignature mSignature, AnonymousClassDeclaration mAnonymous, ClassInstanceCreation mInstance,
			MDefinition mDefinition) {
		return new Object[] { match, mSignature, mAnonymous, mInstance, mDefinition };
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_0_5_collectcontextelements_greenBBBBBFFFF(
			Match match, MSignature mSignature, AnonymousClassDeclaration mAnonymous, ClassInstanceCreation mInstance,
			MDefinition mDefinition) {
		EMoflonEdge mInstance__mAnonymous____anonymousClassDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mAnonymous__mInstance____classInstanceCreation = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSignature__mDefinition____mDefinitions = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mDefinition__mSignature____mSignature = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(mSignature);
		match.getContextNodes().add(mAnonymous);
		match.getContextNodes().add(mInstance);
		match.getContextNodes().add(mDefinition);
		String mInstance__mAnonymous____anonymousClassDeclaration_name_prime = "anonymousClassDeclaration";
		String mAnonymous__mInstance____classInstanceCreation_name_prime = "classInstanceCreation";
		String mSignature__mDefinition____mDefinitions_name_prime = "mDefinitions";
		String mDefinition__mSignature____mSignature_name_prime = "mSignature";
		mInstance__mAnonymous____anonymousClassDeclaration.setSrc(mInstance);
		mInstance__mAnonymous____anonymousClassDeclaration.setTrg(mAnonymous);
		match.getContextEdges().add(mInstance__mAnonymous____anonymousClassDeclaration);
		mAnonymous__mInstance____classInstanceCreation.setSrc(mAnonymous);
		mAnonymous__mInstance____classInstanceCreation.setTrg(mInstance);
		match.getContextEdges().add(mAnonymous__mInstance____classInstanceCreation);
		mSignature__mDefinition____mDefinitions.setSrc(mSignature);
		mSignature__mDefinition____mDefinitions.setTrg(mDefinition);
		match.getContextEdges().add(mSignature__mDefinition____mDefinitions);
		mDefinition__mSignature____mSignature.setSrc(mDefinition);
		mDefinition__mSignature____mSignature.setTrg(mSignature);
		match.getContextEdges().add(mDefinition__mSignature____mSignature);
		mInstance__mAnonymous____anonymousClassDeclaration
				.setName(mInstance__mAnonymous____anonymousClassDeclaration_name_prime);
		mAnonymous__mInstance____classInstanceCreation
				.setName(mAnonymous__mInstance____classInstanceCreation_name_prime);
		mSignature__mDefinition____mDefinitions.setName(mSignature__mDefinition____mDefinitions_name_prime);
		mDefinition__mSignature____mSignature.setName(mDefinition__mSignature____mSignature_name_prime);
		return new Object[] { match, mSignature, mAnonymous, mInstance, mDefinition,
				mInstance__mAnonymous____anonymousClassDeclaration, mAnonymous__mInstance____classInstanceCreation,
				mSignature__mDefinition____mDefinitions, mDefinition__mSignature____mSignature };
	}

	public static final void pattern_LinkDefinitionToAnonymous_0_6_registerobjectstomatch_expressionBBBBBB(
			LinkDefinitionToAnonymous _this, Match match, MSignature mSignature, AnonymousClassDeclaration mAnonymous,
			ClassInstanceCreation mInstance, MDefinition mDefinition) {
		_this.registerObjectsToMatch_FWD(match, mSignature, mAnonymous, mInstance, mDefinition);

	}

	public static final boolean pattern_LinkDefinitionToAnonymous_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_LinkDefinitionToAnonymous_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_1_1_performtransformation_bindingFFFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("mSignature");
		EObject _localVariable_1 = isApplicableMatch.getObject("mAnonymous");
		EObject _localVariable_2 = isApplicableMatch.getObject("tAnonymous");
		EObject _localVariable_3 = isApplicableMatch.getObject("tDefinition");
		EObject _localVariable_4 = isApplicableMatch.getObject("tSignature");
		EObject _localVariable_5 = isApplicableMatch.getObject("mInstance");
		EObject _localVariable_6 = isApplicableMatch.getObject("mAnonymousToTAnonymous");
		EObject _localVariable_7 = isApplicableMatch.getObject("mSignatureToTSignature");
		EObject _localVariable_8 = isApplicableMatch.getObject("mDefinitionToTMember");
		EObject _localVariable_9 = isApplicableMatch.getObject("mDefinition");
		EObject tmpMSignature = _localVariable_0;
		EObject tmpMAnonymous = _localVariable_1;
		EObject tmpTAnonymous = _localVariable_2;
		EObject tmpTDefinition = _localVariable_3;
		EObject tmpTSignature = _localVariable_4;
		EObject tmpMInstance = _localVariable_5;
		EObject tmpMAnonymousToTAnonymous = _localVariable_6;
		EObject tmpMSignatureToTSignature = _localVariable_7;
		EObject tmpMDefinitionToTMember = _localVariable_8;
		EObject tmpMDefinition = _localVariable_9;
		if (tmpMSignature instanceof MSignature) {
			MSignature mSignature = (MSignature) tmpMSignature;
			if (tmpMAnonymous instanceof AnonymousClassDeclaration) {
				AnonymousClassDeclaration mAnonymous = (AnonymousClassDeclaration) tmpMAnonymous;
				if (tmpTAnonymous instanceof TClass) {
					TClass tAnonymous = (TClass) tmpTAnonymous;
					if (tmpTDefinition instanceof TMember) {
						TMember tDefinition = (TMember) tmpTDefinition;
						if (tmpTSignature instanceof TSignature) {
							TSignature tSignature = (TSignature) tmpTSignature;
							if (tmpMInstance instanceof ClassInstanceCreation) {
								ClassInstanceCreation mInstance = (ClassInstanceCreation) tmpMInstance;
								if (tmpMAnonymousToTAnonymous instanceof AnonymousClassDeclarationToTClass) {
									AnonymousClassDeclarationToTClass mAnonymousToTAnonymous = (AnonymousClassDeclarationToTClass) tmpMAnonymousToTAnonymous;
									if (tmpMSignatureToTSignature instanceof MSignatureToTSignature) {
										MSignatureToTSignature mSignatureToTSignature = (MSignatureToTSignature) tmpMSignatureToTSignature;
										if (tmpMDefinitionToTMember instanceof MDefinitionToTMember) {
											MDefinitionToTMember mDefinitionToTMember = (MDefinitionToTMember) tmpMDefinitionToTMember;
											if (tmpMDefinition instanceof MDefinition) {
												MDefinition mDefinition = (MDefinition) tmpMDefinition;
												return new Object[] { mSignature, mAnonymous, tAnonymous, tDefinition,
														tSignature, mInstance, mAnonymousToTAnonymous,
														mSignatureToTSignature, mDefinitionToTMember, mDefinition,
														isApplicableMatch };
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

	public static final Object[] pattern_LinkDefinitionToAnonymous_1_1_performtransformation_blackBBBBBBBBBBFBB(
			MSignature mSignature, AnonymousClassDeclaration mAnonymous, TClass tAnonymous, TMember tDefinition,
			TSignature tSignature, ClassInstanceCreation mInstance,
			AnonymousClassDeclarationToTClass mAnonymousToTAnonymous, MSignatureToTSignature mSignatureToTSignature,
			MDefinitionToTMember mDefinitionToTMember, MDefinition mDefinition, LinkDefinitionToAnonymous _this,
			IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { mSignature, mAnonymous, tAnonymous, tDefinition, tSignature, mInstance,
						mAnonymousToTAnonymous, mSignatureToTSignature, mDefinitionToTMember, mDefinition, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_1_1_performtransformation_bindingAndBlackFFFFFFFFFFFBB(
			LinkDefinitionToAnonymous _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_LinkDefinitionToAnonymous_1_1_performtransformation_binding = pattern_LinkDefinitionToAnonymous_1_1_performtransformation_bindingFFFFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_LinkDefinitionToAnonymous_1_1_performtransformation_binding != null) {
			MSignature mSignature = (MSignature) result_pattern_LinkDefinitionToAnonymous_1_1_performtransformation_binding[0];
			AnonymousClassDeclaration mAnonymous = (AnonymousClassDeclaration) result_pattern_LinkDefinitionToAnonymous_1_1_performtransformation_binding[1];
			TClass tAnonymous = (TClass) result_pattern_LinkDefinitionToAnonymous_1_1_performtransformation_binding[2];
			TMember tDefinition = (TMember) result_pattern_LinkDefinitionToAnonymous_1_1_performtransformation_binding[3];
			TSignature tSignature = (TSignature) result_pattern_LinkDefinitionToAnonymous_1_1_performtransformation_binding[4];
			ClassInstanceCreation mInstance = (ClassInstanceCreation) result_pattern_LinkDefinitionToAnonymous_1_1_performtransformation_binding[5];
			AnonymousClassDeclarationToTClass mAnonymousToTAnonymous = (AnonymousClassDeclarationToTClass) result_pattern_LinkDefinitionToAnonymous_1_1_performtransformation_binding[6];
			MSignatureToTSignature mSignatureToTSignature = (MSignatureToTSignature) result_pattern_LinkDefinitionToAnonymous_1_1_performtransformation_binding[7];
			MDefinitionToTMember mDefinitionToTMember = (MDefinitionToTMember) result_pattern_LinkDefinitionToAnonymous_1_1_performtransformation_binding[8];
			MDefinition mDefinition = (MDefinition) result_pattern_LinkDefinitionToAnonymous_1_1_performtransformation_binding[9];

			Object[] result_pattern_LinkDefinitionToAnonymous_1_1_performtransformation_black = pattern_LinkDefinitionToAnonymous_1_1_performtransformation_blackBBBBBBBBBBFBB(
					mSignature, mAnonymous, tAnonymous, tDefinition, tSignature, mInstance, mAnonymousToTAnonymous,
					mSignatureToTSignature, mDefinitionToTMember, mDefinition, _this, isApplicableMatch);
			if (result_pattern_LinkDefinitionToAnonymous_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_LinkDefinitionToAnonymous_1_1_performtransformation_black[10];

				return new Object[] { mSignature, mAnonymous, tAnonymous, tDefinition, tSignature, mInstance,
						mAnonymousToTAnonymous, mSignatureToTSignature, mDefinitionToTMember, mDefinition, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_1_1_performtransformation_greenBBB(TClass tAnonymous,
			TMember tDefinition, TSignature tSignature) {
		tAnonymous.getDefines().add(tDefinition);
		tAnonymous.getSignature().add(tSignature);
		return new Object[] { tAnonymous, tDefinition, tSignature };
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_1_2_collecttranslatedelements_greenF() {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		return new Object[] { ruleresult };
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_1_3_bookkeepingforedges_blackBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject mSignature, EObject mAnonymous, EObject tAnonymous,
			EObject tDefinition, EObject tSignature, EObject mInstance, EObject mAnonymousToTAnonymous,
			EObject mSignatureToTSignature, EObject mDefinitionToTMember, EObject mDefinition) {
		if (!mSignature.equals(tAnonymous)) {
			if (!mSignature.equals(tDefinition)) {
				if (!mSignature.equals(tSignature)) {
					if (!mSignature.equals(mSignatureToTSignature)) {
						if (!mAnonymous.equals(mSignature)) {
							if (!mAnonymous.equals(tAnonymous)) {
								if (!mAnonymous.equals(tDefinition)) {
									if (!mAnonymous.equals(tSignature)) {
										if (!mAnonymous.equals(mInstance)) {
											if (!mAnonymous.equals(mAnonymousToTAnonymous)) {
												if (!mAnonymous.equals(mSignatureToTSignature)) {
													if (!mAnonymous.equals(mDefinitionToTMember)) {
														if (!mAnonymous.equals(mDefinition)) {
															if (!tAnonymous.equals(tDefinition)) {
																if (!tAnonymous.equals(tSignature)) {
																	if (!tDefinition.equals(tSignature)) {
																		if (!mInstance.equals(mSignature)) {
																			if (!mInstance.equals(tAnonymous)) {
																				if (!mInstance.equals(tDefinition)) {
																					if (!mInstance.equals(tSignature)) {
																						if (!mInstance.equals(
																								mSignatureToTSignature)) {
																							if (!mAnonymousToTAnonymous
																									.equals(mSignature)) {
																								if (!mAnonymousToTAnonymous
																										.equals(tAnonymous)) {
																									if (!mAnonymousToTAnonymous
																											.equals(tDefinition)) {
																										if (!mAnonymousToTAnonymous
																												.equals(tSignature)) {
																											if (!mAnonymousToTAnonymous
																													.equals(mInstance)) {
																												if (!mAnonymousToTAnonymous
																														.equals(mSignatureToTSignature)) {
																													if (!mAnonymousToTAnonymous
																															.equals(mDefinitionToTMember)) {
																														if (!mAnonymousToTAnonymous
																																.equals(mDefinition)) {
																															if (!mSignatureToTSignature
																																	.equals(tAnonymous)) {
																																if (!mSignatureToTSignature
																																		.equals(tDefinition)) {
																																	if (!mSignatureToTSignature
																																			.equals(tSignature)) {
																																		if (!mDefinitionToTMember
																																				.equals(mSignature)) {
																																			if (!mDefinitionToTMember
																																					.equals(tAnonymous)) {
																																				if (!mDefinitionToTMember
																																						.equals(tDefinition)) {
																																					if (!mDefinitionToTMember
																																							.equals(tSignature)) {
																																						if (!mDefinitionToTMember
																																								.equals(mInstance)) {
																																							if (!mDefinitionToTMember
																																									.equals(mSignatureToTSignature)) {
																																								if (!mDefinition
																																										.equals(mSignature)) {
																																									if (!mDefinition
																																											.equals(tAnonymous)) {
																																										if (!mDefinition
																																												.equals(tDefinition)) {
																																											if (!mDefinition
																																													.equals(tSignature)) {
																																												if (!mDefinition
																																														.equals(mInstance)) {
																																													if (!mDefinition
																																															.equals(mSignatureToTSignature)) {
																																														if (!mDefinition
																																																.equals(mDefinitionToTMember)) {
																																															return new Object[] {
																																																	ruleresult,
																																																	mSignature,
																																																	mAnonymous,
																																																	tAnonymous,
																																																	tDefinition,
																																																	tSignature,
																																																	mInstance,
																																																	mAnonymousToTAnonymous,
																																																	mSignatureToTSignature,
																																																	mDefinitionToTMember,
																																																	mDefinition };
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

	public static final Object[] pattern_LinkDefinitionToAnonymous_1_3_bookkeepingforedges_greenBBBBBBFFFFF(
			PerformRuleResult ruleresult, EObject mAnonymous, EObject tAnonymous, EObject tDefinition,
			EObject tSignature, EObject mDefinition) {
		EMoflonEdge tAnonymous__tDefinition____defines = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tDefinition__tAnonymous____definedBy = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAnonymous__tSignature____signature = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mAnonymous__mDefinition____bodyDeclarations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mDefinition__mAnonymous____anonymousClassDeclarationOwner = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String ruleresult_ruleName_prime = "LinkDefinitionToAnonymous";
		String tAnonymous__tDefinition____defines_name_prime = "defines";
		String tDefinition__tAnonymous____definedBy_name_prime = "definedBy";
		String tAnonymous__tSignature____signature_name_prime = "signature";
		String mAnonymous__mDefinition____bodyDeclarations_name_prime = "bodyDeclarations";
		String mDefinition__mAnonymous____anonymousClassDeclarationOwner_name_prime = "anonymousClassDeclarationOwner";
		tAnonymous__tDefinition____defines.setSrc(tAnonymous);
		tAnonymous__tDefinition____defines.setTrg(tDefinition);
		ruleresult.getCreatedEdges().add(tAnonymous__tDefinition____defines);
		tDefinition__tAnonymous____definedBy.setSrc(tDefinition);
		tDefinition__tAnonymous____definedBy.setTrg(tAnonymous);
		ruleresult.getCreatedEdges().add(tDefinition__tAnonymous____definedBy);
		tAnonymous__tSignature____signature.setSrc(tAnonymous);
		tAnonymous__tSignature____signature.setTrg(tSignature);
		ruleresult.getCreatedEdges().add(tAnonymous__tSignature____signature);
		mAnonymous__mDefinition____bodyDeclarations.setSrc(mAnonymous);
		mAnonymous__mDefinition____bodyDeclarations.setTrg(mDefinition);
		ruleresult.getTranslatedEdges().add(mAnonymous__mDefinition____bodyDeclarations);
		mDefinition__mAnonymous____anonymousClassDeclarationOwner.setSrc(mDefinition);
		mDefinition__mAnonymous____anonymousClassDeclarationOwner.setTrg(mAnonymous);
		ruleresult.getTranslatedEdges().add(mDefinition__mAnonymous____anonymousClassDeclarationOwner);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		tAnonymous__tDefinition____defines.setName(tAnonymous__tDefinition____defines_name_prime);
		tDefinition__tAnonymous____definedBy.setName(tDefinition__tAnonymous____definedBy_name_prime);
		tAnonymous__tSignature____signature.setName(tAnonymous__tSignature____signature_name_prime);
		mAnonymous__mDefinition____bodyDeclarations.setName(mAnonymous__mDefinition____bodyDeclarations_name_prime);
		mDefinition__mAnonymous____anonymousClassDeclarationOwner
				.setName(mDefinition__mAnonymous____anonymousClassDeclarationOwner_name_prime);
		return new Object[] { ruleresult, mAnonymous, tAnonymous, tDefinition, tSignature, mDefinition,
				tAnonymous__tDefinition____defines, tDefinition__tAnonymous____definedBy,
				tAnonymous__tSignature____signature, mAnonymous__mDefinition____bodyDeclarations,
				mDefinition__mAnonymous____anonymousClassDeclarationOwner };
	}

	public static final void pattern_LinkDefinitionToAnonymous_1_5_registerobjects_expressionBBBBBBBBBBBB(
			LinkDefinitionToAnonymous _this, PerformRuleResult ruleresult, EObject mSignature, EObject mAnonymous,
			EObject tAnonymous, EObject tDefinition, EObject tSignature, EObject mInstance,
			EObject mAnonymousToTAnonymous, EObject mSignatureToTSignature, EObject mDefinitionToTMember,
			EObject mDefinition) {
		_this.registerObjects_FWD(ruleresult, mSignature, mAnonymous, tAnonymous, tDefinition, tSignature, mInstance,
				mAnonymousToTAnonymous, mSignatureToTSignature, mDefinitionToTMember, mDefinition);

	}

	public static final PerformRuleResult pattern_LinkDefinitionToAnonymous_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_2_1_preparereturnvalue_bindingFB(
			LinkDefinitionToAnonymous _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_2_1_preparereturnvalue_blackFBB(EClass eClass,
			LinkDefinitionToAnonymous _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_2_1_preparereturnvalue_bindingAndBlackFFB(
			LinkDefinitionToAnonymous _this) {
		Object[] result_pattern_LinkDefinitionToAnonymous_2_1_preparereturnvalue_binding = pattern_LinkDefinitionToAnonymous_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_LinkDefinitionToAnonymous_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_LinkDefinitionToAnonymous_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_LinkDefinitionToAnonymous_2_1_preparereturnvalue_black = pattern_LinkDefinitionToAnonymous_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_LinkDefinitionToAnonymous_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_LinkDefinitionToAnonymous_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_2_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "LinkDefinitionToAnonymous";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_2_2_corematch_bindingFFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("mSignature");
		EObject _localVariable_1 = match.getObject("mAnonymous");
		EObject _localVariable_2 = match.getObject("mInstance");
		EObject _localVariable_3 = match.getObject("mDefinition");
		EObject tmpMSignature = _localVariable_0;
		EObject tmpMAnonymous = _localVariable_1;
		EObject tmpMInstance = _localVariable_2;
		EObject tmpMDefinition = _localVariable_3;
		if (tmpMSignature instanceof MSignature) {
			MSignature mSignature = (MSignature) tmpMSignature;
			if (tmpMAnonymous instanceof AnonymousClassDeclaration) {
				AnonymousClassDeclaration mAnonymous = (AnonymousClassDeclaration) tmpMAnonymous;
				if (tmpMInstance instanceof ClassInstanceCreation) {
					ClassInstanceCreation mInstance = (ClassInstanceCreation) tmpMInstance;
					if (tmpMDefinition instanceof MDefinition) {
						MDefinition mDefinition = (MDefinition) tmpMDefinition;
						return new Object[] { mSignature, mAnonymous, mInstance, mDefinition, match };
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_LinkDefinitionToAnonymous_2_2_corematch_blackBBFFFBFFFBB(
			MSignature mSignature, AnonymousClassDeclaration mAnonymous, ClassInstanceCreation mInstance,
			MDefinition mDefinition, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (MSignatureToTSignature mSignatureToTSignature : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mSignature, MSignatureToTSignature.class, "source")) {
			TSignature tSignature = mSignatureToTSignature.getTarget();
			if (tSignature != null) {
				for (AnonymousClassDeclarationToTClass mAnonymousToTAnonymous : org.moflon.core.utilities.eMoflonEMFUtil
						.getOppositeReferenceTyped(mAnonymous, AnonymousClassDeclarationToTClass.class, "source")) {
					TClass tAnonymous = mAnonymousToTAnonymous.getTarget();
					if (tAnonymous != null) {
						for (MDefinitionToTMember mDefinitionToTMember : org.moflon.core.utilities.eMoflonEMFUtil
								.getOppositeReferenceTyped(mDefinition, MDefinitionToTMember.class, "source")) {
							TMember tDefinition = mDefinitionToTMember.getTarget();
							if (tDefinition != null) {
								_result.add(new Object[] { mSignature, mAnonymous, tAnonymous, tDefinition, tSignature,
										mInstance, mAnonymousToTAnonymous, mSignatureToTSignature, mDefinitionToTMember,
										mDefinition, match });
							}

						}
					}

				}
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_LinkDefinitionToAnonymous_2_3_findcontext_blackBBBBBBBBBB(
			MSignature mSignature, AnonymousClassDeclaration mAnonymous, TClass tAnonymous, TMember tDefinition,
			TSignature tSignature, ClassInstanceCreation mInstance,
			AnonymousClassDeclarationToTClass mAnonymousToTAnonymous, MSignatureToTSignature mSignatureToTSignature,
			MDefinitionToTMember mDefinitionToTMember, MDefinition mDefinition) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (tSignature.getDefinitions().contains(tDefinition)) {
			if (mAnonymous.equals(mInstance.getAnonymousClassDeclaration())) {
				if (tAnonymous.equals(mAnonymousToTAnonymous.getTarget())) {
					if (mSignature.equals(mSignatureToTSignature.getSource())) {
						if (tSignature.equals(mSignatureToTSignature.getTarget())) {
							if (tDefinition.equals(mDefinitionToTMember.getTarget())) {
								if (mAnonymous.getBodyDeclarations().contains(mDefinition)) {
									if (mAnonymous.equals(mAnonymousToTAnonymous.getSource())) {
										if (mDefinition.equals(mDefinitionToTMember.getSource())) {
											if (mSignature.getMDefinitions().contains(mDefinition)) {
												_result.add(new Object[] { mSignature, mAnonymous, tAnonymous,
														tDefinition, tSignature, mInstance, mAnonymousToTAnonymous,
														mSignatureToTSignature, mDefinitionToTMember, mDefinition });
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

	public static final Object[] pattern_LinkDefinitionToAnonymous_2_3_findcontext_greenBBBBBBBBBBFFFFFFFFFFFFFFF(
			MSignature mSignature, AnonymousClassDeclaration mAnonymous, TClass tAnonymous, TMember tDefinition,
			TSignature tSignature, ClassInstanceCreation mInstance,
			AnonymousClassDeclarationToTClass mAnonymousToTAnonymous, MSignatureToTSignature mSignatureToTSignature,
			MDefinitionToTMember mDefinitionToTMember, MDefinition mDefinition) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge tSignature__tDefinition____definitions = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tDefinition__tSignature____signature = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mInstance__mAnonymous____anonymousClassDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mAnonymous__mInstance____classInstanceCreation = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mAnonymousToTAnonymous__tAnonymous____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSignatureToTSignature__mSignature____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSignatureToTSignature__tSignature____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mDefinitionToTMember__tDefinition____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mAnonymous__mDefinition____bodyDeclarations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mDefinition__mAnonymous____anonymousClassDeclarationOwner = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge mAnonymousToTAnonymous__mAnonymous____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mDefinitionToTMember__mDefinition____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSignature__mDefinition____mDefinitions = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mDefinition__mSignature____mSignature = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String tSignature__tDefinition____definitions_name_prime = "definitions";
		String tDefinition__tSignature____signature_name_prime = "signature";
		String mInstance__mAnonymous____anonymousClassDeclaration_name_prime = "anonymousClassDeclaration";
		String mAnonymous__mInstance____classInstanceCreation_name_prime = "classInstanceCreation";
		String mAnonymousToTAnonymous__tAnonymous____target_name_prime = "target";
		String mSignatureToTSignature__mSignature____source_name_prime = "source";
		String mSignatureToTSignature__tSignature____target_name_prime = "target";
		String mDefinitionToTMember__tDefinition____target_name_prime = "target";
		String mAnonymous__mDefinition____bodyDeclarations_name_prime = "bodyDeclarations";
		String mDefinition__mAnonymous____anonymousClassDeclarationOwner_name_prime = "anonymousClassDeclarationOwner";
		String mAnonymousToTAnonymous__mAnonymous____source_name_prime = "source";
		String mDefinitionToTMember__mDefinition____source_name_prime = "source";
		String mSignature__mDefinition____mDefinitions_name_prime = "mDefinitions";
		String mDefinition__mSignature____mSignature_name_prime = "mSignature";
		isApplicableMatch.getAllContextElements().add(mSignature);
		isApplicableMatch.getAllContextElements().add(mAnonymous);
		isApplicableMatch.getAllContextElements().add(tAnonymous);
		isApplicableMatch.getAllContextElements().add(tDefinition);
		isApplicableMatch.getAllContextElements().add(tSignature);
		isApplicableMatch.getAllContextElements().add(mInstance);
		isApplicableMatch.getAllContextElements().add(mAnonymousToTAnonymous);
		isApplicableMatch.getAllContextElements().add(mSignatureToTSignature);
		isApplicableMatch.getAllContextElements().add(mDefinitionToTMember);
		isApplicableMatch.getAllContextElements().add(mDefinition);
		tSignature__tDefinition____definitions.setSrc(tSignature);
		tSignature__tDefinition____definitions.setTrg(tDefinition);
		isApplicableMatch.getAllContextElements().add(tSignature__tDefinition____definitions);
		tDefinition__tSignature____signature.setSrc(tDefinition);
		tDefinition__tSignature____signature.setTrg(tSignature);
		isApplicableMatch.getAllContextElements().add(tDefinition__tSignature____signature);
		mInstance__mAnonymous____anonymousClassDeclaration.setSrc(mInstance);
		mInstance__mAnonymous____anonymousClassDeclaration.setTrg(mAnonymous);
		isApplicableMatch.getAllContextElements().add(mInstance__mAnonymous____anonymousClassDeclaration);
		mAnonymous__mInstance____classInstanceCreation.setSrc(mAnonymous);
		mAnonymous__mInstance____classInstanceCreation.setTrg(mInstance);
		isApplicableMatch.getAllContextElements().add(mAnonymous__mInstance____classInstanceCreation);
		mAnonymousToTAnonymous__tAnonymous____target.setSrc(mAnonymousToTAnonymous);
		mAnonymousToTAnonymous__tAnonymous____target.setTrg(tAnonymous);
		isApplicableMatch.getAllContextElements().add(mAnonymousToTAnonymous__tAnonymous____target);
		mSignatureToTSignature__mSignature____source.setSrc(mSignatureToTSignature);
		mSignatureToTSignature__mSignature____source.setTrg(mSignature);
		isApplicableMatch.getAllContextElements().add(mSignatureToTSignature__mSignature____source);
		mSignatureToTSignature__tSignature____target.setSrc(mSignatureToTSignature);
		mSignatureToTSignature__tSignature____target.setTrg(tSignature);
		isApplicableMatch.getAllContextElements().add(mSignatureToTSignature__tSignature____target);
		mDefinitionToTMember__tDefinition____target.setSrc(mDefinitionToTMember);
		mDefinitionToTMember__tDefinition____target.setTrg(tDefinition);
		isApplicableMatch.getAllContextElements().add(mDefinitionToTMember__tDefinition____target);
		mAnonymous__mDefinition____bodyDeclarations.setSrc(mAnonymous);
		mAnonymous__mDefinition____bodyDeclarations.setTrg(mDefinition);
		isApplicableMatch.getAllContextElements().add(mAnonymous__mDefinition____bodyDeclarations);
		mDefinition__mAnonymous____anonymousClassDeclarationOwner.setSrc(mDefinition);
		mDefinition__mAnonymous____anonymousClassDeclarationOwner.setTrg(mAnonymous);
		isApplicableMatch.getAllContextElements().add(mDefinition__mAnonymous____anonymousClassDeclarationOwner);
		mAnonymousToTAnonymous__mAnonymous____source.setSrc(mAnonymousToTAnonymous);
		mAnonymousToTAnonymous__mAnonymous____source.setTrg(mAnonymous);
		isApplicableMatch.getAllContextElements().add(mAnonymousToTAnonymous__mAnonymous____source);
		mDefinitionToTMember__mDefinition____source.setSrc(mDefinitionToTMember);
		mDefinitionToTMember__mDefinition____source.setTrg(mDefinition);
		isApplicableMatch.getAllContextElements().add(mDefinitionToTMember__mDefinition____source);
		mSignature__mDefinition____mDefinitions.setSrc(mSignature);
		mSignature__mDefinition____mDefinitions.setTrg(mDefinition);
		isApplicableMatch.getAllContextElements().add(mSignature__mDefinition____mDefinitions);
		mDefinition__mSignature____mSignature.setSrc(mDefinition);
		mDefinition__mSignature____mSignature.setTrg(mSignature);
		isApplicableMatch.getAllContextElements().add(mDefinition__mSignature____mSignature);
		tSignature__tDefinition____definitions.setName(tSignature__tDefinition____definitions_name_prime);
		tDefinition__tSignature____signature.setName(tDefinition__tSignature____signature_name_prime);
		mInstance__mAnonymous____anonymousClassDeclaration
				.setName(mInstance__mAnonymous____anonymousClassDeclaration_name_prime);
		mAnonymous__mInstance____classInstanceCreation
				.setName(mAnonymous__mInstance____classInstanceCreation_name_prime);
		mAnonymousToTAnonymous__tAnonymous____target.setName(mAnonymousToTAnonymous__tAnonymous____target_name_prime);
		mSignatureToTSignature__mSignature____source.setName(mSignatureToTSignature__mSignature____source_name_prime);
		mSignatureToTSignature__tSignature____target.setName(mSignatureToTSignature__tSignature____target_name_prime);
		mDefinitionToTMember__tDefinition____target.setName(mDefinitionToTMember__tDefinition____target_name_prime);
		mAnonymous__mDefinition____bodyDeclarations.setName(mAnonymous__mDefinition____bodyDeclarations_name_prime);
		mDefinition__mAnonymous____anonymousClassDeclarationOwner
				.setName(mDefinition__mAnonymous____anonymousClassDeclarationOwner_name_prime);
		mAnonymousToTAnonymous__mAnonymous____source.setName(mAnonymousToTAnonymous__mAnonymous____source_name_prime);
		mDefinitionToTMember__mDefinition____source.setName(mDefinitionToTMember__mDefinition____source_name_prime);
		mSignature__mDefinition____mDefinitions.setName(mSignature__mDefinition____mDefinitions_name_prime);
		mDefinition__mSignature____mSignature.setName(mDefinition__mSignature____mSignature_name_prime);
		return new Object[] { mSignature, mAnonymous, tAnonymous, tDefinition, tSignature, mInstance,
				mAnonymousToTAnonymous, mSignatureToTSignature, mDefinitionToTMember, mDefinition, isApplicableMatch,
				tSignature__tDefinition____definitions, tDefinition__tSignature____signature,
				mInstance__mAnonymous____anonymousClassDeclaration, mAnonymous__mInstance____classInstanceCreation,
				mAnonymousToTAnonymous__tAnonymous____target, mSignatureToTSignature__mSignature____source,
				mSignatureToTSignature__tSignature____target, mDefinitionToTMember__tDefinition____target,
				mAnonymous__mDefinition____bodyDeclarations, mDefinition__mAnonymous____anonymousClassDeclarationOwner,
				mAnonymousToTAnonymous__mAnonymous____source, mDefinitionToTMember__mDefinition____source,
				mSignature__mDefinition____mDefinitions, mDefinition__mSignature____mSignature };
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_2_4_solveCSP_bindingFBBBBBBBBBBBB(
			LinkDefinitionToAnonymous _this, IsApplicableMatch isApplicableMatch, MSignature mSignature,
			AnonymousClassDeclaration mAnonymous, TClass tAnonymous, TMember tDefinition, TSignature tSignature,
			ClassInstanceCreation mInstance, AnonymousClassDeclarationToTClass mAnonymousToTAnonymous,
			MSignatureToTSignature mSignatureToTSignature, MDefinitionToTMember mDefinitionToTMember,
			MDefinition mDefinition) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, mSignature, mAnonymous, tAnonymous,
				tDefinition, tSignature, mInstance, mAnonymousToTAnonymous, mSignatureToTSignature,
				mDefinitionToTMember, mDefinition);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mSignature, mAnonymous, tAnonymous, tDefinition,
					tSignature, mInstance, mAnonymousToTAnonymous, mSignatureToTSignature, mDefinitionToTMember,
					mDefinition };
		}
		return null;
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_2_4_solveCSP_bindingAndBlackFBBBBBBBBBBBB(
			LinkDefinitionToAnonymous _this, IsApplicableMatch isApplicableMatch, MSignature mSignature,
			AnonymousClassDeclaration mAnonymous, TClass tAnonymous, TMember tDefinition, TSignature tSignature,
			ClassInstanceCreation mInstance, AnonymousClassDeclarationToTClass mAnonymousToTAnonymous,
			MSignatureToTSignature mSignatureToTSignature, MDefinitionToTMember mDefinitionToTMember,
			MDefinition mDefinition) {
		Object[] result_pattern_LinkDefinitionToAnonymous_2_4_solveCSP_binding = pattern_LinkDefinitionToAnonymous_2_4_solveCSP_bindingFBBBBBBBBBBBB(
				_this, isApplicableMatch, mSignature, mAnonymous, tAnonymous, tDefinition, tSignature, mInstance,
				mAnonymousToTAnonymous, mSignatureToTSignature, mDefinitionToTMember, mDefinition);
		if (result_pattern_LinkDefinitionToAnonymous_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_LinkDefinitionToAnonymous_2_4_solveCSP_binding[0];

			Object[] result_pattern_LinkDefinitionToAnonymous_2_4_solveCSP_black = pattern_LinkDefinitionToAnonymous_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_LinkDefinitionToAnonymous_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mSignature, mAnonymous, tAnonymous, tDefinition,
						tSignature, mInstance, mAnonymousToTAnonymous, mSignatureToTSignature, mDefinitionToTMember,
						mDefinition };
			}
		}
		return null;
	}

	public static final boolean pattern_LinkDefinitionToAnonymous_2_5_checkCSP_expressionFBB(
			LinkDefinitionToAnonymous _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "LinkDefinitionToAnonymous";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_LinkDefinitionToAnonymous_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_10_1_initialbindings_blackBBBBB(
			LinkDefinitionToAnonymous _this, Match match, TClass tAnonymous, TMember tDefinition,
			TSignature tSignature) {
		return new Object[] { _this, match, tAnonymous, tDefinition, tSignature };
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_10_2_SolveCSP_bindingFBBBBB(
			LinkDefinitionToAnonymous _this, Match match, TClass tAnonymous, TMember tDefinition,
			TSignature tSignature) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, tAnonymous, tDefinition, tSignature);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, tAnonymous, tDefinition, tSignature };
		}
		return null;
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_10_2_SolveCSP_bindingAndBlackFBBBBB(
			LinkDefinitionToAnonymous _this, Match match, TClass tAnonymous, TMember tDefinition,
			TSignature tSignature) {
		Object[] result_pattern_LinkDefinitionToAnonymous_10_2_SolveCSP_binding = pattern_LinkDefinitionToAnonymous_10_2_SolveCSP_bindingFBBBBB(
				_this, match, tAnonymous, tDefinition, tSignature);
		if (result_pattern_LinkDefinitionToAnonymous_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_LinkDefinitionToAnonymous_10_2_SolveCSP_binding[0];

			Object[] result_pattern_LinkDefinitionToAnonymous_10_2_SolveCSP_black = pattern_LinkDefinitionToAnonymous_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_LinkDefinitionToAnonymous_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, tAnonymous, tDefinition, tSignature };
			}
		}
		return null;
	}

	public static final boolean pattern_LinkDefinitionToAnonymous_10_3_CheckCSP_expressionFBB(
			LinkDefinitionToAnonymous _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_10_4_collectelementstobetranslated_blackBBBB(
			Match match, TClass tAnonymous, TMember tDefinition, TSignature tSignature) {
		return new Object[] { match, tAnonymous, tDefinition, tSignature };
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_10_4_collectelementstobetranslated_greenBBBBFFF(
			Match match, TClass tAnonymous, TMember tDefinition, TSignature tSignature) {
		EMoflonEdge tAnonymous__tDefinition____defines = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tDefinition__tAnonymous____definedBy = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAnonymous__tSignature____signature = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String tAnonymous__tDefinition____defines_name_prime = "defines";
		String tDefinition__tAnonymous____definedBy_name_prime = "definedBy";
		String tAnonymous__tSignature____signature_name_prime = "signature";
		tAnonymous__tDefinition____defines.setSrc(tAnonymous);
		tAnonymous__tDefinition____defines.setTrg(tDefinition);
		match.getToBeTranslatedEdges().add(tAnonymous__tDefinition____defines);
		tDefinition__tAnonymous____definedBy.setSrc(tDefinition);
		tDefinition__tAnonymous____definedBy.setTrg(tAnonymous);
		match.getToBeTranslatedEdges().add(tDefinition__tAnonymous____definedBy);
		tAnonymous__tSignature____signature.setSrc(tAnonymous);
		tAnonymous__tSignature____signature.setTrg(tSignature);
		match.getToBeTranslatedEdges().add(tAnonymous__tSignature____signature);
		tAnonymous__tDefinition____defines.setName(tAnonymous__tDefinition____defines_name_prime);
		tDefinition__tAnonymous____definedBy.setName(tDefinition__tAnonymous____definedBy_name_prime);
		tAnonymous__tSignature____signature.setName(tAnonymous__tSignature____signature_name_prime);
		return new Object[] { match, tAnonymous, tDefinition, tSignature, tAnonymous__tDefinition____defines,
				tDefinition__tAnonymous____definedBy, tAnonymous__tSignature____signature };
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_10_5_collectcontextelements_blackBBBB(Match match,
			TClass tAnonymous, TMember tDefinition, TSignature tSignature) {
		return new Object[] { match, tAnonymous, tDefinition, tSignature };
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_10_5_collectcontextelements_greenBBBBFF(Match match,
			TClass tAnonymous, TMember tDefinition, TSignature tSignature) {
		EMoflonEdge tSignature__tDefinition____definitions = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tDefinition__tSignature____signature = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(tAnonymous);
		match.getContextNodes().add(tDefinition);
		match.getContextNodes().add(tSignature);
		String tSignature__tDefinition____definitions_name_prime = "definitions";
		String tDefinition__tSignature____signature_name_prime = "signature";
		tSignature__tDefinition____definitions.setSrc(tSignature);
		tSignature__tDefinition____definitions.setTrg(tDefinition);
		match.getContextEdges().add(tSignature__tDefinition____definitions);
		tDefinition__tSignature____signature.setSrc(tDefinition);
		tDefinition__tSignature____signature.setTrg(tSignature);
		match.getContextEdges().add(tDefinition__tSignature____signature);
		tSignature__tDefinition____definitions.setName(tSignature__tDefinition____definitions_name_prime);
		tDefinition__tSignature____signature.setName(tDefinition__tSignature____signature_name_prime);
		return new Object[] { match, tAnonymous, tDefinition, tSignature, tSignature__tDefinition____definitions,
				tDefinition__tSignature____signature };
	}

	public static final void pattern_LinkDefinitionToAnonymous_10_6_registerobjectstomatch_expressionBBBBB(
			LinkDefinitionToAnonymous _this, Match match, TClass tAnonymous, TMember tDefinition,
			TSignature tSignature) {
		_this.registerObjectsToMatch_BWD(match, tAnonymous, tDefinition, tSignature);

	}

	public static final boolean pattern_LinkDefinitionToAnonymous_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_LinkDefinitionToAnonymous_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_11_1_performtransformation_bindingFFFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("mSignature");
		EObject _localVariable_1 = isApplicableMatch.getObject("mAnonymous");
		EObject _localVariable_2 = isApplicableMatch.getObject("tAnonymous");
		EObject _localVariable_3 = isApplicableMatch.getObject("tDefinition");
		EObject _localVariable_4 = isApplicableMatch.getObject("tSignature");
		EObject _localVariable_5 = isApplicableMatch.getObject("mInstance");
		EObject _localVariable_6 = isApplicableMatch.getObject("mAnonymousToTAnonymous");
		EObject _localVariable_7 = isApplicableMatch.getObject("mSignatureToTSignature");
		EObject _localVariable_8 = isApplicableMatch.getObject("mDefinitionToTMember");
		EObject _localVariable_9 = isApplicableMatch.getObject("mDefinition");
		EObject tmpMSignature = _localVariable_0;
		EObject tmpMAnonymous = _localVariable_1;
		EObject tmpTAnonymous = _localVariable_2;
		EObject tmpTDefinition = _localVariable_3;
		EObject tmpTSignature = _localVariable_4;
		EObject tmpMInstance = _localVariable_5;
		EObject tmpMAnonymousToTAnonymous = _localVariable_6;
		EObject tmpMSignatureToTSignature = _localVariable_7;
		EObject tmpMDefinitionToTMember = _localVariable_8;
		EObject tmpMDefinition = _localVariable_9;
		if (tmpMSignature instanceof MSignature) {
			MSignature mSignature = (MSignature) tmpMSignature;
			if (tmpMAnonymous instanceof AnonymousClassDeclaration) {
				AnonymousClassDeclaration mAnonymous = (AnonymousClassDeclaration) tmpMAnonymous;
				if (tmpTAnonymous instanceof TClass) {
					TClass tAnonymous = (TClass) tmpTAnonymous;
					if (tmpTDefinition instanceof TMember) {
						TMember tDefinition = (TMember) tmpTDefinition;
						if (tmpTSignature instanceof TSignature) {
							TSignature tSignature = (TSignature) tmpTSignature;
							if (tmpMInstance instanceof ClassInstanceCreation) {
								ClassInstanceCreation mInstance = (ClassInstanceCreation) tmpMInstance;
								if (tmpMAnonymousToTAnonymous instanceof AnonymousClassDeclarationToTClass) {
									AnonymousClassDeclarationToTClass mAnonymousToTAnonymous = (AnonymousClassDeclarationToTClass) tmpMAnonymousToTAnonymous;
									if (tmpMSignatureToTSignature instanceof MSignatureToTSignature) {
										MSignatureToTSignature mSignatureToTSignature = (MSignatureToTSignature) tmpMSignatureToTSignature;
										if (tmpMDefinitionToTMember instanceof MDefinitionToTMember) {
											MDefinitionToTMember mDefinitionToTMember = (MDefinitionToTMember) tmpMDefinitionToTMember;
											if (tmpMDefinition instanceof MDefinition) {
												MDefinition mDefinition = (MDefinition) tmpMDefinition;
												return new Object[] { mSignature, mAnonymous, tAnonymous, tDefinition,
														tSignature, mInstance, mAnonymousToTAnonymous,
														mSignatureToTSignature, mDefinitionToTMember, mDefinition,
														isApplicableMatch };
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

	public static final Object[] pattern_LinkDefinitionToAnonymous_11_1_performtransformation_blackBBBBBBBBBBFBB(
			MSignature mSignature, AnonymousClassDeclaration mAnonymous, TClass tAnonymous, TMember tDefinition,
			TSignature tSignature, ClassInstanceCreation mInstance,
			AnonymousClassDeclarationToTClass mAnonymousToTAnonymous, MSignatureToTSignature mSignatureToTSignature,
			MDefinitionToTMember mDefinitionToTMember, MDefinition mDefinition, LinkDefinitionToAnonymous _this,
			IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { mSignature, mAnonymous, tAnonymous, tDefinition, tSignature, mInstance,
						mAnonymousToTAnonymous, mSignatureToTSignature, mDefinitionToTMember, mDefinition, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_11_1_performtransformation_bindingAndBlackFFFFFFFFFFFBB(
			LinkDefinitionToAnonymous _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_LinkDefinitionToAnonymous_11_1_performtransformation_binding = pattern_LinkDefinitionToAnonymous_11_1_performtransformation_bindingFFFFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_LinkDefinitionToAnonymous_11_1_performtransformation_binding != null) {
			MSignature mSignature = (MSignature) result_pattern_LinkDefinitionToAnonymous_11_1_performtransformation_binding[0];
			AnonymousClassDeclaration mAnonymous = (AnonymousClassDeclaration) result_pattern_LinkDefinitionToAnonymous_11_1_performtransformation_binding[1];
			TClass tAnonymous = (TClass) result_pattern_LinkDefinitionToAnonymous_11_1_performtransformation_binding[2];
			TMember tDefinition = (TMember) result_pattern_LinkDefinitionToAnonymous_11_1_performtransformation_binding[3];
			TSignature tSignature = (TSignature) result_pattern_LinkDefinitionToAnonymous_11_1_performtransformation_binding[4];
			ClassInstanceCreation mInstance = (ClassInstanceCreation) result_pattern_LinkDefinitionToAnonymous_11_1_performtransformation_binding[5];
			AnonymousClassDeclarationToTClass mAnonymousToTAnonymous = (AnonymousClassDeclarationToTClass) result_pattern_LinkDefinitionToAnonymous_11_1_performtransformation_binding[6];
			MSignatureToTSignature mSignatureToTSignature = (MSignatureToTSignature) result_pattern_LinkDefinitionToAnonymous_11_1_performtransformation_binding[7];
			MDefinitionToTMember mDefinitionToTMember = (MDefinitionToTMember) result_pattern_LinkDefinitionToAnonymous_11_1_performtransformation_binding[8];
			MDefinition mDefinition = (MDefinition) result_pattern_LinkDefinitionToAnonymous_11_1_performtransformation_binding[9];

			Object[] result_pattern_LinkDefinitionToAnonymous_11_1_performtransformation_black = pattern_LinkDefinitionToAnonymous_11_1_performtransformation_blackBBBBBBBBBBFBB(
					mSignature, mAnonymous, tAnonymous, tDefinition, tSignature, mInstance, mAnonymousToTAnonymous,
					mSignatureToTSignature, mDefinitionToTMember, mDefinition, _this, isApplicableMatch);
			if (result_pattern_LinkDefinitionToAnonymous_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_LinkDefinitionToAnonymous_11_1_performtransformation_black[10];

				return new Object[] { mSignature, mAnonymous, tAnonymous, tDefinition, tSignature, mInstance,
						mAnonymousToTAnonymous, mSignatureToTSignature, mDefinitionToTMember, mDefinition, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_11_1_performtransformation_greenBB(
			AnonymousClassDeclaration mAnonymous, MDefinition mDefinition) {
		mAnonymous.getBodyDeclarations().add(mDefinition);
		return new Object[] { mAnonymous, mDefinition };
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_11_2_collecttranslatedelements_greenF() {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		return new Object[] { ruleresult };
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_11_3_bookkeepingforedges_blackBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject mSignature, EObject mAnonymous, EObject tAnonymous,
			EObject tDefinition, EObject tSignature, EObject mInstance, EObject mAnonymousToTAnonymous,
			EObject mSignatureToTSignature, EObject mDefinitionToTMember, EObject mDefinition) {
		if (!mSignature.equals(tAnonymous)) {
			if (!mSignature.equals(tDefinition)) {
				if (!mSignature.equals(tSignature)) {
					if (!mSignature.equals(mSignatureToTSignature)) {
						if (!mAnonymous.equals(mSignature)) {
							if (!mAnonymous.equals(tAnonymous)) {
								if (!mAnonymous.equals(tDefinition)) {
									if (!mAnonymous.equals(tSignature)) {
										if (!mAnonymous.equals(mInstance)) {
											if (!mAnonymous.equals(mAnonymousToTAnonymous)) {
												if (!mAnonymous.equals(mSignatureToTSignature)) {
													if (!mAnonymous.equals(mDefinitionToTMember)) {
														if (!mAnonymous.equals(mDefinition)) {
															if (!tAnonymous.equals(tDefinition)) {
																if (!tAnonymous.equals(tSignature)) {
																	if (!tDefinition.equals(tSignature)) {
																		if (!mInstance.equals(mSignature)) {
																			if (!mInstance.equals(tAnonymous)) {
																				if (!mInstance.equals(tDefinition)) {
																					if (!mInstance.equals(tSignature)) {
																						if (!mInstance.equals(
																								mSignatureToTSignature)) {
																							if (!mAnonymousToTAnonymous
																									.equals(mSignature)) {
																								if (!mAnonymousToTAnonymous
																										.equals(tAnonymous)) {
																									if (!mAnonymousToTAnonymous
																											.equals(tDefinition)) {
																										if (!mAnonymousToTAnonymous
																												.equals(tSignature)) {
																											if (!mAnonymousToTAnonymous
																													.equals(mInstance)) {
																												if (!mAnonymousToTAnonymous
																														.equals(mSignatureToTSignature)) {
																													if (!mAnonymousToTAnonymous
																															.equals(mDefinitionToTMember)) {
																														if (!mAnonymousToTAnonymous
																																.equals(mDefinition)) {
																															if (!mSignatureToTSignature
																																	.equals(tAnonymous)) {
																																if (!mSignatureToTSignature
																																		.equals(tDefinition)) {
																																	if (!mSignatureToTSignature
																																			.equals(tSignature)) {
																																		if (!mDefinitionToTMember
																																				.equals(mSignature)) {
																																			if (!mDefinitionToTMember
																																					.equals(tAnonymous)) {
																																				if (!mDefinitionToTMember
																																						.equals(tDefinition)) {
																																					if (!mDefinitionToTMember
																																							.equals(tSignature)) {
																																						if (!mDefinitionToTMember
																																								.equals(mInstance)) {
																																							if (!mDefinitionToTMember
																																									.equals(mSignatureToTSignature)) {
																																								if (!mDefinition
																																										.equals(mSignature)) {
																																									if (!mDefinition
																																											.equals(tAnonymous)) {
																																										if (!mDefinition
																																												.equals(tDefinition)) {
																																											if (!mDefinition
																																													.equals(tSignature)) {
																																												if (!mDefinition
																																														.equals(mInstance)) {
																																													if (!mDefinition
																																															.equals(mSignatureToTSignature)) {
																																														if (!mDefinition
																																																.equals(mDefinitionToTMember)) {
																																															return new Object[] {
																																																	ruleresult,
																																																	mSignature,
																																																	mAnonymous,
																																																	tAnonymous,
																																																	tDefinition,
																																																	tSignature,
																																																	mInstance,
																																																	mAnonymousToTAnonymous,
																																																	mSignatureToTSignature,
																																																	mDefinitionToTMember,
																																																	mDefinition };
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

	public static final Object[] pattern_LinkDefinitionToAnonymous_11_3_bookkeepingforedges_greenBBBBBBFFFFF(
			PerformRuleResult ruleresult, EObject mAnonymous, EObject tAnonymous, EObject tDefinition,
			EObject tSignature, EObject mDefinition) {
		EMoflonEdge tAnonymous__tDefinition____defines = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tDefinition__tAnonymous____definedBy = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAnonymous__tSignature____signature = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mAnonymous__mDefinition____bodyDeclarations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mDefinition__mAnonymous____anonymousClassDeclarationOwner = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String ruleresult_ruleName_prime = "LinkDefinitionToAnonymous";
		String tAnonymous__tDefinition____defines_name_prime = "defines";
		String tDefinition__tAnonymous____definedBy_name_prime = "definedBy";
		String tAnonymous__tSignature____signature_name_prime = "signature";
		String mAnonymous__mDefinition____bodyDeclarations_name_prime = "bodyDeclarations";
		String mDefinition__mAnonymous____anonymousClassDeclarationOwner_name_prime = "anonymousClassDeclarationOwner";
		tAnonymous__tDefinition____defines.setSrc(tAnonymous);
		tAnonymous__tDefinition____defines.setTrg(tDefinition);
		ruleresult.getTranslatedEdges().add(tAnonymous__tDefinition____defines);
		tDefinition__tAnonymous____definedBy.setSrc(tDefinition);
		tDefinition__tAnonymous____definedBy.setTrg(tAnonymous);
		ruleresult.getTranslatedEdges().add(tDefinition__tAnonymous____definedBy);
		tAnonymous__tSignature____signature.setSrc(tAnonymous);
		tAnonymous__tSignature____signature.setTrg(tSignature);
		ruleresult.getTranslatedEdges().add(tAnonymous__tSignature____signature);
		mAnonymous__mDefinition____bodyDeclarations.setSrc(mAnonymous);
		mAnonymous__mDefinition____bodyDeclarations.setTrg(mDefinition);
		ruleresult.getCreatedEdges().add(mAnonymous__mDefinition____bodyDeclarations);
		mDefinition__mAnonymous____anonymousClassDeclarationOwner.setSrc(mDefinition);
		mDefinition__mAnonymous____anonymousClassDeclarationOwner.setTrg(mAnonymous);
		ruleresult.getCreatedEdges().add(mDefinition__mAnonymous____anonymousClassDeclarationOwner);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		tAnonymous__tDefinition____defines.setName(tAnonymous__tDefinition____defines_name_prime);
		tDefinition__tAnonymous____definedBy.setName(tDefinition__tAnonymous____definedBy_name_prime);
		tAnonymous__tSignature____signature.setName(tAnonymous__tSignature____signature_name_prime);
		mAnonymous__mDefinition____bodyDeclarations.setName(mAnonymous__mDefinition____bodyDeclarations_name_prime);
		mDefinition__mAnonymous____anonymousClassDeclarationOwner
				.setName(mDefinition__mAnonymous____anonymousClassDeclarationOwner_name_prime);
		return new Object[] { ruleresult, mAnonymous, tAnonymous, tDefinition, tSignature, mDefinition,
				tAnonymous__tDefinition____defines, tDefinition__tAnonymous____definedBy,
				tAnonymous__tSignature____signature, mAnonymous__mDefinition____bodyDeclarations,
				mDefinition__mAnonymous____anonymousClassDeclarationOwner };
	}

	public static final void pattern_LinkDefinitionToAnonymous_11_5_registerobjects_expressionBBBBBBBBBBBB(
			LinkDefinitionToAnonymous _this, PerformRuleResult ruleresult, EObject mSignature, EObject mAnonymous,
			EObject tAnonymous, EObject tDefinition, EObject tSignature, EObject mInstance,
			EObject mAnonymousToTAnonymous, EObject mSignatureToTSignature, EObject mDefinitionToTMember,
			EObject mDefinition) {
		_this.registerObjects_BWD(ruleresult, mSignature, mAnonymous, tAnonymous, tDefinition, tSignature, mInstance,
				mAnonymousToTAnonymous, mSignatureToTSignature, mDefinitionToTMember, mDefinition);

	}

	public static final PerformRuleResult pattern_LinkDefinitionToAnonymous_11_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_12_1_preparereturnvalue_bindingFB(
			LinkDefinitionToAnonymous _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_12_1_preparereturnvalue_blackFBB(EClass eClass,
			LinkDefinitionToAnonymous _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_12_1_preparereturnvalue_bindingAndBlackFFB(
			LinkDefinitionToAnonymous _this) {
		Object[] result_pattern_LinkDefinitionToAnonymous_12_1_preparereturnvalue_binding = pattern_LinkDefinitionToAnonymous_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_LinkDefinitionToAnonymous_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_LinkDefinitionToAnonymous_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_LinkDefinitionToAnonymous_12_1_preparereturnvalue_black = pattern_LinkDefinitionToAnonymous_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_LinkDefinitionToAnonymous_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_LinkDefinitionToAnonymous_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_12_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "LinkDefinitionToAnonymous";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_12_2_corematch_bindingFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("tAnonymous");
		EObject _localVariable_1 = match.getObject("tDefinition");
		EObject _localVariable_2 = match.getObject("tSignature");
		EObject tmpTAnonymous = _localVariable_0;
		EObject tmpTDefinition = _localVariable_1;
		EObject tmpTSignature = _localVariable_2;
		if (tmpTAnonymous instanceof TClass) {
			TClass tAnonymous = (TClass) tmpTAnonymous;
			if (tmpTDefinition instanceof TMember) {
				TMember tDefinition = (TMember) tmpTDefinition;
				if (tmpTSignature instanceof TSignature) {
					TSignature tSignature = (TSignature) tmpTSignature;
					return new Object[] { tAnonymous, tDefinition, tSignature, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_LinkDefinitionToAnonymous_12_2_corematch_blackFFBBBFFFFB(
			TClass tAnonymous, TMember tDefinition, TSignature tSignature, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (AnonymousClassDeclarationToTClass mAnonymousToTAnonymous : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tAnonymous, AnonymousClassDeclarationToTClass.class, "target")) {
			AnonymousClassDeclaration mAnonymous = mAnonymousToTAnonymous.getSource();
			if (mAnonymous != null) {
				for (MSignatureToTSignature mSignatureToTSignature : org.moflon.core.utilities.eMoflonEMFUtil
						.getOppositeReferenceTyped(tSignature, MSignatureToTSignature.class, "target")) {
					MSignature mSignature = mSignatureToTSignature.getSource();
					if (mSignature != null) {
						for (MDefinitionToTMember mDefinitionToTMember : org.moflon.core.utilities.eMoflonEMFUtil
								.getOppositeReferenceTyped(tDefinition, MDefinitionToTMember.class, "target")) {
							BodyDeclaration tmpMDefinition = mDefinitionToTMember.getSource();
							if (tmpMDefinition instanceof MDefinition) {
								MDefinition mDefinition = (MDefinition) tmpMDefinition;
								_result.add(new Object[] { mSignature, mAnonymous, tAnonymous, tDefinition, tSignature,
										mAnonymousToTAnonymous, mSignatureToTSignature, mDefinitionToTMember,
										mDefinition, match });
							}

						}
					}

				}
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_LinkDefinitionToAnonymous_12_3_findcontext_blackBBBBBFBBBB(
			MSignature mSignature, AnonymousClassDeclaration mAnonymous, TClass tAnonymous, TMember tDefinition,
			TSignature tSignature, AnonymousClassDeclarationToTClass mAnonymousToTAnonymous,
			MSignatureToTSignature mSignatureToTSignature, MDefinitionToTMember mDefinitionToTMember,
			MDefinition mDefinition) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (tAnonymous.getDefines().contains(tDefinition)) {
			if (tSignature.getDefinitions().contains(tDefinition)) {
				if (tAnonymous.getSignature().contains(tSignature)) {
					if (tAnonymous.equals(mAnonymousToTAnonymous.getTarget())) {
						if (mSignature.equals(mSignatureToTSignature.getSource())) {
							if (tSignature.equals(mSignatureToTSignature.getTarget())) {
								if (tDefinition.equals(mDefinitionToTMember.getTarget())) {
									if (mAnonymous.equals(mAnonymousToTAnonymous.getSource())) {
										if (mDefinition.equals(mDefinitionToTMember.getSource())) {
											if (mSignature.getMDefinitions().contains(mDefinition)) {
												ClassInstanceCreation mInstance = mAnonymous.getClassInstanceCreation();
												if (mInstance != null) {
													_result.add(new Object[] { mSignature, mAnonymous, tAnonymous,
															tDefinition, tSignature, mInstance, mAnonymousToTAnonymous,
															mSignatureToTSignature, mDefinitionToTMember,
															mDefinition });
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

	public static final Object[] pattern_LinkDefinitionToAnonymous_12_3_findcontext_greenBBBBBBBBBBFFFFFFFFFFFFFFFF(
			MSignature mSignature, AnonymousClassDeclaration mAnonymous, TClass tAnonymous, TMember tDefinition,
			TSignature tSignature, ClassInstanceCreation mInstance,
			AnonymousClassDeclarationToTClass mAnonymousToTAnonymous, MSignatureToTSignature mSignatureToTSignature,
			MDefinitionToTMember mDefinitionToTMember, MDefinition mDefinition) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge tAnonymous__tDefinition____defines = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tDefinition__tAnonymous____definedBy = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSignature__tDefinition____definitions = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tDefinition__tSignature____signature = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mInstance__mAnonymous____anonymousClassDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mAnonymous__mInstance____classInstanceCreation = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAnonymous__tSignature____signature = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mAnonymousToTAnonymous__tAnonymous____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSignatureToTSignature__mSignature____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSignatureToTSignature__tSignature____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mDefinitionToTMember__tDefinition____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mAnonymousToTAnonymous__mAnonymous____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mDefinitionToTMember__mDefinition____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSignature__mDefinition____mDefinitions = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mDefinition__mSignature____mSignature = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String tAnonymous__tDefinition____defines_name_prime = "defines";
		String tDefinition__tAnonymous____definedBy_name_prime = "definedBy";
		String tSignature__tDefinition____definitions_name_prime = "definitions";
		String tDefinition__tSignature____signature_name_prime = "signature";
		String mInstance__mAnonymous____anonymousClassDeclaration_name_prime = "anonymousClassDeclaration";
		String mAnonymous__mInstance____classInstanceCreation_name_prime = "classInstanceCreation";
		String tAnonymous__tSignature____signature_name_prime = "signature";
		String mAnonymousToTAnonymous__tAnonymous____target_name_prime = "target";
		String mSignatureToTSignature__mSignature____source_name_prime = "source";
		String mSignatureToTSignature__tSignature____target_name_prime = "target";
		String mDefinitionToTMember__tDefinition____target_name_prime = "target";
		String mAnonymousToTAnonymous__mAnonymous____source_name_prime = "source";
		String mDefinitionToTMember__mDefinition____source_name_prime = "source";
		String mSignature__mDefinition____mDefinitions_name_prime = "mDefinitions";
		String mDefinition__mSignature____mSignature_name_prime = "mSignature";
		isApplicableMatch.getAllContextElements().add(mSignature);
		isApplicableMatch.getAllContextElements().add(mAnonymous);
		isApplicableMatch.getAllContextElements().add(tAnonymous);
		isApplicableMatch.getAllContextElements().add(tDefinition);
		isApplicableMatch.getAllContextElements().add(tSignature);
		isApplicableMatch.getAllContextElements().add(mInstance);
		isApplicableMatch.getAllContextElements().add(mAnonymousToTAnonymous);
		isApplicableMatch.getAllContextElements().add(mSignatureToTSignature);
		isApplicableMatch.getAllContextElements().add(mDefinitionToTMember);
		isApplicableMatch.getAllContextElements().add(mDefinition);
		tAnonymous__tDefinition____defines.setSrc(tAnonymous);
		tAnonymous__tDefinition____defines.setTrg(tDefinition);
		isApplicableMatch.getAllContextElements().add(tAnonymous__tDefinition____defines);
		tDefinition__tAnonymous____definedBy.setSrc(tDefinition);
		tDefinition__tAnonymous____definedBy.setTrg(tAnonymous);
		isApplicableMatch.getAllContextElements().add(tDefinition__tAnonymous____definedBy);
		tSignature__tDefinition____definitions.setSrc(tSignature);
		tSignature__tDefinition____definitions.setTrg(tDefinition);
		isApplicableMatch.getAllContextElements().add(tSignature__tDefinition____definitions);
		tDefinition__tSignature____signature.setSrc(tDefinition);
		tDefinition__tSignature____signature.setTrg(tSignature);
		isApplicableMatch.getAllContextElements().add(tDefinition__tSignature____signature);
		mInstance__mAnonymous____anonymousClassDeclaration.setSrc(mInstance);
		mInstance__mAnonymous____anonymousClassDeclaration.setTrg(mAnonymous);
		isApplicableMatch.getAllContextElements().add(mInstance__mAnonymous____anonymousClassDeclaration);
		mAnonymous__mInstance____classInstanceCreation.setSrc(mAnonymous);
		mAnonymous__mInstance____classInstanceCreation.setTrg(mInstance);
		isApplicableMatch.getAllContextElements().add(mAnonymous__mInstance____classInstanceCreation);
		tAnonymous__tSignature____signature.setSrc(tAnonymous);
		tAnonymous__tSignature____signature.setTrg(tSignature);
		isApplicableMatch.getAllContextElements().add(tAnonymous__tSignature____signature);
		mAnonymousToTAnonymous__tAnonymous____target.setSrc(mAnonymousToTAnonymous);
		mAnonymousToTAnonymous__tAnonymous____target.setTrg(tAnonymous);
		isApplicableMatch.getAllContextElements().add(mAnonymousToTAnonymous__tAnonymous____target);
		mSignatureToTSignature__mSignature____source.setSrc(mSignatureToTSignature);
		mSignatureToTSignature__mSignature____source.setTrg(mSignature);
		isApplicableMatch.getAllContextElements().add(mSignatureToTSignature__mSignature____source);
		mSignatureToTSignature__tSignature____target.setSrc(mSignatureToTSignature);
		mSignatureToTSignature__tSignature____target.setTrg(tSignature);
		isApplicableMatch.getAllContextElements().add(mSignatureToTSignature__tSignature____target);
		mDefinitionToTMember__tDefinition____target.setSrc(mDefinitionToTMember);
		mDefinitionToTMember__tDefinition____target.setTrg(tDefinition);
		isApplicableMatch.getAllContextElements().add(mDefinitionToTMember__tDefinition____target);
		mAnonymousToTAnonymous__mAnonymous____source.setSrc(mAnonymousToTAnonymous);
		mAnonymousToTAnonymous__mAnonymous____source.setTrg(mAnonymous);
		isApplicableMatch.getAllContextElements().add(mAnonymousToTAnonymous__mAnonymous____source);
		mDefinitionToTMember__mDefinition____source.setSrc(mDefinitionToTMember);
		mDefinitionToTMember__mDefinition____source.setTrg(mDefinition);
		isApplicableMatch.getAllContextElements().add(mDefinitionToTMember__mDefinition____source);
		mSignature__mDefinition____mDefinitions.setSrc(mSignature);
		mSignature__mDefinition____mDefinitions.setTrg(mDefinition);
		isApplicableMatch.getAllContextElements().add(mSignature__mDefinition____mDefinitions);
		mDefinition__mSignature____mSignature.setSrc(mDefinition);
		mDefinition__mSignature____mSignature.setTrg(mSignature);
		isApplicableMatch.getAllContextElements().add(mDefinition__mSignature____mSignature);
		tAnonymous__tDefinition____defines.setName(tAnonymous__tDefinition____defines_name_prime);
		tDefinition__tAnonymous____definedBy.setName(tDefinition__tAnonymous____definedBy_name_prime);
		tSignature__tDefinition____definitions.setName(tSignature__tDefinition____definitions_name_prime);
		tDefinition__tSignature____signature.setName(tDefinition__tSignature____signature_name_prime);
		mInstance__mAnonymous____anonymousClassDeclaration
				.setName(mInstance__mAnonymous____anonymousClassDeclaration_name_prime);
		mAnonymous__mInstance____classInstanceCreation
				.setName(mAnonymous__mInstance____classInstanceCreation_name_prime);
		tAnonymous__tSignature____signature.setName(tAnonymous__tSignature____signature_name_prime);
		mAnonymousToTAnonymous__tAnonymous____target.setName(mAnonymousToTAnonymous__tAnonymous____target_name_prime);
		mSignatureToTSignature__mSignature____source.setName(mSignatureToTSignature__mSignature____source_name_prime);
		mSignatureToTSignature__tSignature____target.setName(mSignatureToTSignature__tSignature____target_name_prime);
		mDefinitionToTMember__tDefinition____target.setName(mDefinitionToTMember__tDefinition____target_name_prime);
		mAnonymousToTAnonymous__mAnonymous____source.setName(mAnonymousToTAnonymous__mAnonymous____source_name_prime);
		mDefinitionToTMember__mDefinition____source.setName(mDefinitionToTMember__mDefinition____source_name_prime);
		mSignature__mDefinition____mDefinitions.setName(mSignature__mDefinition____mDefinitions_name_prime);
		mDefinition__mSignature____mSignature.setName(mDefinition__mSignature____mSignature_name_prime);
		return new Object[] { mSignature, mAnonymous, tAnonymous, tDefinition, tSignature, mInstance,
				mAnonymousToTAnonymous, mSignatureToTSignature, mDefinitionToTMember, mDefinition, isApplicableMatch,
				tAnonymous__tDefinition____defines, tDefinition__tAnonymous____definedBy,
				tSignature__tDefinition____definitions, tDefinition__tSignature____signature,
				mInstance__mAnonymous____anonymousClassDeclaration, mAnonymous__mInstance____classInstanceCreation,
				tAnonymous__tSignature____signature, mAnonymousToTAnonymous__tAnonymous____target,
				mSignatureToTSignature__mSignature____source, mSignatureToTSignature__tSignature____target,
				mDefinitionToTMember__tDefinition____target, mAnonymousToTAnonymous__mAnonymous____source,
				mDefinitionToTMember__mDefinition____source, mSignature__mDefinition____mDefinitions,
				mDefinition__mSignature____mSignature };
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_12_4_solveCSP_bindingFBBBBBBBBBBBB(
			LinkDefinitionToAnonymous _this, IsApplicableMatch isApplicableMatch, MSignature mSignature,
			AnonymousClassDeclaration mAnonymous, TClass tAnonymous, TMember tDefinition, TSignature tSignature,
			ClassInstanceCreation mInstance, AnonymousClassDeclarationToTClass mAnonymousToTAnonymous,
			MSignatureToTSignature mSignatureToTSignature, MDefinitionToTMember mDefinitionToTMember,
			MDefinition mDefinition) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, mSignature, mAnonymous, tAnonymous,
				tDefinition, tSignature, mInstance, mAnonymousToTAnonymous, mSignatureToTSignature,
				mDefinitionToTMember, mDefinition);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mSignature, mAnonymous, tAnonymous, tDefinition,
					tSignature, mInstance, mAnonymousToTAnonymous, mSignatureToTSignature, mDefinitionToTMember,
					mDefinition };
		}
		return null;
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_12_4_solveCSP_bindingAndBlackFBBBBBBBBBBBB(
			LinkDefinitionToAnonymous _this, IsApplicableMatch isApplicableMatch, MSignature mSignature,
			AnonymousClassDeclaration mAnonymous, TClass tAnonymous, TMember tDefinition, TSignature tSignature,
			ClassInstanceCreation mInstance, AnonymousClassDeclarationToTClass mAnonymousToTAnonymous,
			MSignatureToTSignature mSignatureToTSignature, MDefinitionToTMember mDefinitionToTMember,
			MDefinition mDefinition) {
		Object[] result_pattern_LinkDefinitionToAnonymous_12_4_solveCSP_binding = pattern_LinkDefinitionToAnonymous_12_4_solveCSP_bindingFBBBBBBBBBBBB(
				_this, isApplicableMatch, mSignature, mAnonymous, tAnonymous, tDefinition, tSignature, mInstance,
				mAnonymousToTAnonymous, mSignatureToTSignature, mDefinitionToTMember, mDefinition);
		if (result_pattern_LinkDefinitionToAnonymous_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_LinkDefinitionToAnonymous_12_4_solveCSP_binding[0];

			Object[] result_pattern_LinkDefinitionToAnonymous_12_4_solveCSP_black = pattern_LinkDefinitionToAnonymous_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_LinkDefinitionToAnonymous_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mSignature, mAnonymous, tAnonymous, tDefinition,
						tSignature, mInstance, mAnonymousToTAnonymous, mSignatureToTSignature, mDefinitionToTMember,
						mDefinition };
			}
		}
		return null;
	}

	public static final boolean pattern_LinkDefinitionToAnonymous_12_5_checkCSP_expressionFBB(
			LinkDefinitionToAnonymous _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "LinkDefinitionToAnonymous";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_LinkDefinitionToAnonymous_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_20_1_preparereturnvalue_bindingFB(
			LinkDefinitionToAnonymous _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_20_1_preparereturnvalue_blackFBBF(EClass __eClass,
			LinkDefinitionToAnonymous _this) {
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

	public static final Object[] pattern_LinkDefinitionToAnonymous_20_1_preparereturnvalue_bindingAndBlackFFBF(
			LinkDefinitionToAnonymous _this) {
		Object[] result_pattern_LinkDefinitionToAnonymous_20_1_preparereturnvalue_binding = pattern_LinkDefinitionToAnonymous_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_LinkDefinitionToAnonymous_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_LinkDefinitionToAnonymous_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_LinkDefinitionToAnonymous_20_1_preparereturnvalue_black = pattern_LinkDefinitionToAnonymous_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_LinkDefinitionToAnonymous_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_LinkDefinitionToAnonymous_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_LinkDefinitionToAnonymous_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_LinkDefinitionToAnonymous_20_2_testcorematchandDECs_blackFFFB(
			EMoflonEdge _edge_defines) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpTAnonymous = _edge_defines.getSrc();
		if (tmpTAnonymous instanceof TClass) {
			TClass tAnonymous = (TClass) tmpTAnonymous;
			EObject tmpTDefinition = _edge_defines.getTrg();
			if (tmpTDefinition instanceof TMember) {
				TMember tDefinition = (TMember) tmpTDefinition;
				if (tAnonymous.getDefines().contains(tDefinition)) {
					TSignature tSignature = tDefinition.getSignature();
					if (tSignature != null) {
						if (tAnonymous.getSignature().contains(tSignature)) {
							_result.add(new Object[] { tAnonymous, tDefinition, tSignature, _edge_defines });
						}
					}

				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_20_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_LinkDefinitionToAnonymous_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
			LinkDefinitionToAnonymous _this, Match match, TClass tAnonymous, TMember tDefinition,
			TSignature tSignature) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, tAnonymous, tDefinition, tSignature);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_LinkDefinitionToAnonymous_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			LinkDefinitionToAnonymous _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_LinkDefinitionToAnonymous_20_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_21_1_preparereturnvalue_bindingFB(
			LinkDefinitionToAnonymous _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_21_1_preparereturnvalue_blackFBBF(EClass __eClass,
			LinkDefinitionToAnonymous _this) {
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

	public static final Object[] pattern_LinkDefinitionToAnonymous_21_1_preparereturnvalue_bindingAndBlackFFBF(
			LinkDefinitionToAnonymous _this) {
		Object[] result_pattern_LinkDefinitionToAnonymous_21_1_preparereturnvalue_binding = pattern_LinkDefinitionToAnonymous_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_LinkDefinitionToAnonymous_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_LinkDefinitionToAnonymous_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_LinkDefinitionToAnonymous_21_1_preparereturnvalue_black = pattern_LinkDefinitionToAnonymous_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_LinkDefinitionToAnonymous_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_LinkDefinitionToAnonymous_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_LinkDefinitionToAnonymous_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_LinkDefinitionToAnonymous_21_2_testcorematchandDECs_blackFFFFB(
			EMoflonEdge _edge_bodyDeclarations) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpMAnonymous = _edge_bodyDeclarations.getSrc();
		if (tmpMAnonymous instanceof AnonymousClassDeclaration) {
			AnonymousClassDeclaration mAnonymous = (AnonymousClassDeclaration) tmpMAnonymous;
			EObject tmpMDefinition = _edge_bodyDeclarations.getTrg();
			if (tmpMDefinition instanceof MDefinition) {
				MDefinition mDefinition = (MDefinition) tmpMDefinition;
				if (mAnonymous.getBodyDeclarations().contains(mDefinition)) {
					ClassInstanceCreation mInstance = mAnonymous.getClassInstanceCreation();
					if (mInstance != null) {
						MSignature mSignature = mDefinition.getMSignature();
						if (mSignature != null) {
							_result.add(new Object[] { mSignature, mAnonymous, mInstance, mDefinition,
									_edge_bodyDeclarations });
						}

					}

				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_21_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_LinkDefinitionToAnonymous_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(
			LinkDefinitionToAnonymous _this, Match match, MSignature mSignature, AnonymousClassDeclaration mAnonymous,
			ClassInstanceCreation mInstance, MDefinition mDefinition) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, mSignature, mAnonymous, mInstance, mDefinition);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_LinkDefinitionToAnonymous_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			LinkDefinitionToAnonymous _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_LinkDefinitionToAnonymous_21_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_24_1_prepare_blackB(
			LinkDefinitionToAnonymous _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_24_2_matchsrctrgcontext_bindingFFFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		EObject _localVariable_0 = sourceMatch.getObject("mSignature");
		EObject _localVariable_1 = sourceMatch.getObject("mAnonymous");
		EObject _localVariable_2 = targetMatch.getObject("tAnonymous");
		EObject _localVariable_3 = targetMatch.getObject("tDefinition");
		EObject _localVariable_4 = targetMatch.getObject("tSignature");
		EObject _localVariable_5 = sourceMatch.getObject("mInstance");
		EObject _localVariable_6 = sourceMatch.getObject("mDefinition");
		EObject tmpMSignature = _localVariable_0;
		EObject tmpMAnonymous = _localVariable_1;
		EObject tmpTAnonymous = _localVariable_2;
		EObject tmpTDefinition = _localVariable_3;
		EObject tmpTSignature = _localVariable_4;
		EObject tmpMInstance = _localVariable_5;
		EObject tmpMDefinition = _localVariable_6;
		if (tmpMSignature instanceof MSignature) {
			MSignature mSignature = (MSignature) tmpMSignature;
			if (tmpMAnonymous instanceof AnonymousClassDeclaration) {
				AnonymousClassDeclaration mAnonymous = (AnonymousClassDeclaration) tmpMAnonymous;
				if (tmpTAnonymous instanceof TClass) {
					TClass tAnonymous = (TClass) tmpTAnonymous;
					if (tmpTDefinition instanceof TMember) {
						TMember tDefinition = (TMember) tmpTDefinition;
						if (tmpTSignature instanceof TSignature) {
							TSignature tSignature = (TSignature) tmpTSignature;
							if (tmpMInstance instanceof ClassInstanceCreation) {
								ClassInstanceCreation mInstance = (ClassInstanceCreation) tmpMInstance;
								if (tmpMDefinition instanceof MDefinition) {
									MDefinition mDefinition = (MDefinition) tmpMDefinition;
									return new Object[] { mSignature, mAnonymous, tAnonymous, tDefinition, tSignature,
											mInstance, mDefinition, sourceMatch, targetMatch };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_24_2_matchsrctrgcontext_blackBBBBBBBBB(
			MSignature mSignature, AnonymousClassDeclaration mAnonymous, TClass tAnonymous, TMember tDefinition,
			TSignature tSignature, ClassInstanceCreation mInstance, MDefinition mDefinition, Match sourceMatch,
			Match targetMatch) {
		if (!sourceMatch.equals(targetMatch)) {
			return new Object[] { mSignature, mAnonymous, tAnonymous, tDefinition, tSignature, mInstance, mDefinition,
					sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_LinkDefinitionToAnonymous_24_2_matchsrctrgcontext_binding = pattern_LinkDefinitionToAnonymous_24_2_matchsrctrgcontext_bindingFFFFFFFBB(
				sourceMatch, targetMatch);
		if (result_pattern_LinkDefinitionToAnonymous_24_2_matchsrctrgcontext_binding != null) {
			MSignature mSignature = (MSignature) result_pattern_LinkDefinitionToAnonymous_24_2_matchsrctrgcontext_binding[0];
			AnonymousClassDeclaration mAnonymous = (AnonymousClassDeclaration) result_pattern_LinkDefinitionToAnonymous_24_2_matchsrctrgcontext_binding[1];
			TClass tAnonymous = (TClass) result_pattern_LinkDefinitionToAnonymous_24_2_matchsrctrgcontext_binding[2];
			TMember tDefinition = (TMember) result_pattern_LinkDefinitionToAnonymous_24_2_matchsrctrgcontext_binding[3];
			TSignature tSignature = (TSignature) result_pattern_LinkDefinitionToAnonymous_24_2_matchsrctrgcontext_binding[4];
			ClassInstanceCreation mInstance = (ClassInstanceCreation) result_pattern_LinkDefinitionToAnonymous_24_2_matchsrctrgcontext_binding[5];
			MDefinition mDefinition = (MDefinition) result_pattern_LinkDefinitionToAnonymous_24_2_matchsrctrgcontext_binding[6];

			Object[] result_pattern_LinkDefinitionToAnonymous_24_2_matchsrctrgcontext_black = pattern_LinkDefinitionToAnonymous_24_2_matchsrctrgcontext_blackBBBBBBBBB(
					mSignature, mAnonymous, tAnonymous, tDefinition, tSignature, mInstance, mDefinition, sourceMatch,
					targetMatch);
			if (result_pattern_LinkDefinitionToAnonymous_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { mSignature, mAnonymous, tAnonymous, tDefinition, tSignature, mInstance,
						mDefinition, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_24_3_solvecsp_bindingFBBBBBBBBBB(
			LinkDefinitionToAnonymous _this, MSignature mSignature, AnonymousClassDeclaration mAnonymous,
			TClass tAnonymous, TMember tDefinition, TSignature tSignature, ClassInstanceCreation mInstance,
			MDefinition mDefinition, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_7 = _this.isApplicable_solveCsp_CC(mSignature, mAnonymous, tAnonymous, tDefinition,
				tSignature, mInstance, mDefinition, sourceMatch, targetMatch);
		CSP csp = _localVariable_7;
		if (csp != null) {
			return new Object[] { csp, _this, mSignature, mAnonymous, tAnonymous, tDefinition, tSignature, mInstance,
					mDefinition, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_24_3_solvecsp_bindingAndBlackFBBBBBBBBBB(
			LinkDefinitionToAnonymous _this, MSignature mSignature, AnonymousClassDeclaration mAnonymous,
			TClass tAnonymous, TMember tDefinition, TSignature tSignature, ClassInstanceCreation mInstance,
			MDefinition mDefinition, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_LinkDefinitionToAnonymous_24_3_solvecsp_binding = pattern_LinkDefinitionToAnonymous_24_3_solvecsp_bindingFBBBBBBBBBB(
				_this, mSignature, mAnonymous, tAnonymous, tDefinition, tSignature, mInstance, mDefinition, sourceMatch,
				targetMatch);
		if (result_pattern_LinkDefinitionToAnonymous_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_LinkDefinitionToAnonymous_24_3_solvecsp_binding[0];

			Object[] result_pattern_LinkDefinitionToAnonymous_24_3_solvecsp_black = pattern_LinkDefinitionToAnonymous_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_LinkDefinitionToAnonymous_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, mSignature, mAnonymous, tAnonymous, tDefinition, tSignature,
						mInstance, mDefinition, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_LinkDefinitionToAnonymous_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_LinkDefinitionToAnonymous_24_5_matchcorrcontext_blackBBBBBFFFBBB(
			MSignature mSignature, AnonymousClassDeclaration mAnonymous, TClass tAnonymous, TMember tDefinition,
			TSignature tSignature, MDefinition mDefinition, Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (AnonymousClassDeclarationToTClass mAnonymousToTAnonymous : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(tAnonymous, AnonymousClassDeclarationToTClass.class, "target")) {
				if (mAnonymous.equals(mAnonymousToTAnonymous.getSource())) {
					for (MSignatureToTSignature mSignatureToTSignature : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(mSignature, MSignatureToTSignature.class, "source")) {
						if (tSignature.equals(mSignatureToTSignature.getTarget())) {
							for (MDefinitionToTMember mDefinitionToTMember : org.moflon.core.utilities.eMoflonEMFUtil
									.getOppositeReferenceTyped(tDefinition, MDefinitionToTMember.class, "target")) {
								if (mDefinition.equals(mDefinitionToTMember.getSource())) {
									_result.add(new Object[] { mSignature, mAnonymous, tAnonymous, tDefinition,
											tSignature, mAnonymousToTAnonymous, mSignatureToTSignature,
											mDefinitionToTMember, mDefinition, sourceMatch, targetMatch });
								}
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_24_5_matchcorrcontext_greenBBBBBF(
			AnonymousClassDeclarationToTClass mAnonymousToTAnonymous, MSignatureToTSignature mSignatureToTSignature,
			MDefinitionToTMember mDefinitionToTMember, Match sourceMatch, Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "LinkDefinitionToAnonymous";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(mAnonymousToTAnonymous);
		ccMatch.getAllContextElements().add(mSignatureToTSignature);
		ccMatch.getAllContextElements().add(mDefinitionToTMember);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { mAnonymousToTAnonymous, mSignatureToTSignature, mDefinitionToTMember, sourceMatch,
				targetMatch, ccMatch };
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_24_6_createcorrespondence_blackBBBBBBBB(
			MSignature mSignature, AnonymousClassDeclaration mAnonymous, TClass tAnonymous, TMember tDefinition,
			TSignature tSignature, ClassInstanceCreation mInstance, MDefinition mDefinition, CCMatch ccMatch) {
		return new Object[] { mSignature, mAnonymous, tAnonymous, tDefinition, tSignature, mInstance, mDefinition,
				ccMatch };
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_24_7_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_24_7_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "LinkDefinitionToAnonymous";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_LinkDefinitionToAnonymous_24_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_27_1_matchtggpattern_blackBBBB(MSignature mSignature,
			AnonymousClassDeclaration mAnonymous, ClassInstanceCreation mInstance, MDefinition mDefinition) {
		if (mAnonymous.equals(mInstance.getAnonymousClassDeclaration())) {
			if (mAnonymous.getBodyDeclarations().contains(mDefinition)) {
				if (mSignature.getMDefinitions().contains(mDefinition)) {
					return new Object[] { mSignature, mAnonymous, mInstance, mDefinition };
				}
			}
		}
		return null;
	}

	public static final boolean pattern_LinkDefinitionToAnonymous_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_LinkDefinitionToAnonymous_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_28_1_matchtggpattern_blackBBB(TClass tAnonymous,
			TMember tDefinition, TSignature tSignature) {
		if (tAnonymous.getDefines().contains(tDefinition)) {
			if (tSignature.getDefinitions().contains(tDefinition)) {
				if (tAnonymous.getSignature().contains(tSignature)) {
					return new Object[] { tAnonymous, tDefinition, tSignature };
				}
			}
		}
		return null;
	}

	public static final boolean pattern_LinkDefinitionToAnonymous_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_LinkDefinitionToAnonymous_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_29_1_createresult_blackB(
			LinkDefinitionToAnonymous _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, MSignature mSignature) {
		if (ruleResult.getSourceObjects().contains(mSignature)) {
			return new Object[] { ruleResult, mSignature };
		}
		return null;
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, MDefinition mDefinition) {
		if (ruleResult.getSourceObjects().contains(mDefinition)) {
			return new Object[] { ruleResult, mDefinition };
		}
		return null;
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, MDefinitionToTMember mDefinitionToTMember) {
		if (ruleResult.getCorrObjects().contains(mDefinitionToTMember)) {
			return new Object[] { ruleResult, mDefinitionToTMember };
		}
		return null;
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_29_2_isapplicablecore_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, TMember tDefinition) {
		if (ruleResult.getTargetObjects().contains(tDefinition)) {
			return new Object[] { ruleResult, tDefinition };
		}
		return null;
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_29_2_isapplicablecore_black_nac_4BB(
			ModelgeneratorRuleResult ruleResult, TSignature tSignature) {
		if (ruleResult.getTargetObjects().contains(tSignature)) {
			return new Object[] { ruleResult, tSignature };
		}
		return null;
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_29_2_isapplicablecore_black_nac_5BB(
			ModelgeneratorRuleResult ruleResult, MSignatureToTSignature mSignatureToTSignature) {
		if (ruleResult.getCorrObjects().contains(mSignatureToTSignature)) {
			return new Object[] { ruleResult, mSignatureToTSignature };
		}
		return null;
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_29_2_isapplicablecore_black_nac_6BB(
			ModelgeneratorRuleResult ruleResult, AnonymousClassDeclaration mAnonymous) {
		if (ruleResult.getSourceObjects().contains(mAnonymous)) {
			return new Object[] { ruleResult, mAnonymous };
		}
		return null;
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_29_2_isapplicablecore_black_nac_7BB(
			ModelgeneratorRuleResult ruleResult, ClassInstanceCreation mInstance) {
		if (ruleResult.getSourceObjects().contains(mInstance)) {
			return new Object[] { ruleResult, mInstance };
		}
		return null;
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_29_2_isapplicablecore_black_nac_8BB(
			ModelgeneratorRuleResult ruleResult, AnonymousClassDeclarationToTClass mAnonymousToTAnonymous) {
		if (ruleResult.getCorrObjects().contains(mAnonymousToTAnonymous)) {
			return new Object[] { ruleResult, mAnonymousToTAnonymous };
		}
		return null;
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_29_2_isapplicablecore_black_nac_9BB(
			ModelgeneratorRuleResult ruleResult, TClass tAnonymous) {
		if (ruleResult.getTargetObjects().contains(tAnonymous)) {
			return new Object[] { ruleResult, tAnonymous };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_LinkDefinitionToAnonymous_29_2_isapplicablecore_blackFFFFFFFFFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList mDefinitionToTMemberList : ruleEntryContainer.getRuleEntryList()) {
			for (RuleEntryList mAnonymousToTAnonymousList : ruleEntryContainer.getRuleEntryList()) {
				if (!mAnonymousToTAnonymousList.equals(mDefinitionToTMemberList)) {
					for (EObject tmpMDefinitionToTMember : mDefinitionToTMemberList.getEntryObjects()) {
						if (tmpMDefinitionToTMember instanceof MDefinitionToTMember) {
							MDefinitionToTMember mDefinitionToTMember = (MDefinitionToTMember) tmpMDefinitionToTMember;
							BodyDeclaration tmpMDefinition = mDefinitionToTMember.getSource();
							if (tmpMDefinition instanceof MDefinition) {
								MDefinition mDefinition = (MDefinition) tmpMDefinition;
								TMember tDefinition = mDefinitionToTMember.getTarget();
								if (tDefinition != null) {
									MSignature mSignature = mDefinition.getMSignature();
									if (mSignature != null) {
										TSignature tSignature = tDefinition.getSignature();
										if (tSignature != null) {
											if (pattern_LinkDefinitionToAnonymous_29_2_isapplicablecore_black_nac_2BB(
													ruleResult, mDefinitionToTMember) == null) {
												if (pattern_LinkDefinitionToAnonymous_29_2_isapplicablecore_black_nac_1BB(
														ruleResult, mDefinition) == null) {
													if (pattern_LinkDefinitionToAnonymous_29_2_isapplicablecore_black_nac_3BB(
															ruleResult, tDefinition) == null) {
														if (pattern_LinkDefinitionToAnonymous_29_2_isapplicablecore_black_nac_0BB(
																ruleResult, mSignature) == null) {
															if (pattern_LinkDefinitionToAnonymous_29_2_isapplicablecore_black_nac_4BB(
																	ruleResult, tSignature) == null) {
																for (EObject tmpMAnonymousToTAnonymous : mAnonymousToTAnonymousList
																		.getEntryObjects()) {
																	if (tmpMAnonymousToTAnonymous instanceof AnonymousClassDeclarationToTClass) {
																		AnonymousClassDeclarationToTClass mAnonymousToTAnonymous = (AnonymousClassDeclarationToTClass) tmpMAnonymousToTAnonymous;
																		AnonymousClassDeclaration mAnonymous = mAnonymousToTAnonymous
																				.getSource();
																		if (mAnonymous != null) {
																			TClass tAnonymous = mAnonymousToTAnonymous
																					.getTarget();
																			if (tAnonymous != null) {
																				ClassInstanceCreation mInstance = mAnonymous
																						.getClassInstanceCreation();
																				if (mInstance != null) {
																					if (pattern_LinkDefinitionToAnonymous_29_2_isapplicablecore_black_nac_8BB(
																							ruleResult,
																							mAnonymousToTAnonymous) == null) {
																						if (pattern_LinkDefinitionToAnonymous_29_2_isapplicablecore_black_nac_6BB(
																								ruleResult,
																								mAnonymous) == null) {
																							if (pattern_LinkDefinitionToAnonymous_29_2_isapplicablecore_black_nac_9BB(
																									ruleResult,
																									tAnonymous) == null) {
																								if (pattern_LinkDefinitionToAnonymous_29_2_isapplicablecore_black_nac_7BB(
																										ruleResult,
																										mInstance) == null) {
																									for (MSignatureToTSignature mSignatureToTSignature : org.moflon.core.utilities.eMoflonEMFUtil
																											.getOppositeReferenceTyped(
																													mSignature,
																													MSignatureToTSignature.class,
																													"source")) {
																										if (tSignature
																												.equals(mSignatureToTSignature
																														.getTarget())) {
																											if (pattern_LinkDefinitionToAnonymous_29_2_isapplicablecore_black_nac_5BB(
																													ruleResult,
																													mSignatureToTSignature) == null) {
																												_result.add(
																														new Object[] {
																																mDefinitionToTMemberList,
																																mSignature,
																																mDefinition,
																																mDefinitionToTMember,
																																tDefinition,
																																tSignature,
																																mSignatureToTSignature,
																																mAnonymousToTAnonymousList,
																																mAnonymous,
																																mInstance,
																																mAnonymousToTAnonymous,
																																tAnonymous,
																																ruleEntryContainer,
																																ruleResult });
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
		return _result;
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_29_3_solveCSP_bindingFBBBBBBBBBBBBB(
			LinkDefinitionToAnonymous _this, IsApplicableMatch isApplicableMatch, MSignature mSignature,
			AnonymousClassDeclaration mAnonymous, TClass tAnonymous, TMember tDefinition, TSignature tSignature,
			ClassInstanceCreation mInstance, AnonymousClassDeclarationToTClass mAnonymousToTAnonymous,
			MSignatureToTSignature mSignatureToTSignature, MDefinitionToTMember mDefinitionToTMember,
			MDefinition mDefinition, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, mSignature, mAnonymous, tAnonymous,
				tDefinition, tSignature, mInstance, mAnonymousToTAnonymous, mSignatureToTSignature,
				mDefinitionToTMember, mDefinition, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mSignature, mAnonymous, tAnonymous, tDefinition,
					tSignature, mInstance, mAnonymousToTAnonymous, mSignatureToTSignature, mDefinitionToTMember,
					mDefinition, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_29_3_solveCSP_bindingAndBlackFBBBBBBBBBBBBB(
			LinkDefinitionToAnonymous _this, IsApplicableMatch isApplicableMatch, MSignature mSignature,
			AnonymousClassDeclaration mAnonymous, TClass tAnonymous, TMember tDefinition, TSignature tSignature,
			ClassInstanceCreation mInstance, AnonymousClassDeclarationToTClass mAnonymousToTAnonymous,
			MSignatureToTSignature mSignatureToTSignature, MDefinitionToTMember mDefinitionToTMember,
			MDefinition mDefinition, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_LinkDefinitionToAnonymous_29_3_solveCSP_binding = pattern_LinkDefinitionToAnonymous_29_3_solveCSP_bindingFBBBBBBBBBBBBB(
				_this, isApplicableMatch, mSignature, mAnonymous, tAnonymous, tDefinition, tSignature, mInstance,
				mAnonymousToTAnonymous, mSignatureToTSignature, mDefinitionToTMember, mDefinition, ruleResult);
		if (result_pattern_LinkDefinitionToAnonymous_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_LinkDefinitionToAnonymous_29_3_solveCSP_binding[0];

			Object[] result_pattern_LinkDefinitionToAnonymous_29_3_solveCSP_black = pattern_LinkDefinitionToAnonymous_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_LinkDefinitionToAnonymous_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mSignature, mAnonymous, tAnonymous, tDefinition,
						tSignature, mInstance, mAnonymousToTAnonymous, mSignatureToTSignature, mDefinitionToTMember,
						mDefinition, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_LinkDefinitionToAnonymous_29_4_checkCSP_expressionFBB(
			LinkDefinitionToAnonymous _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_29_5_checknacs_blackBBBBBBBBBB(MSignature mSignature,
			AnonymousClassDeclaration mAnonymous, TClass tAnonymous, TMember tDefinition, TSignature tSignature,
			ClassInstanceCreation mInstance, AnonymousClassDeclarationToTClass mAnonymousToTAnonymous,
			MSignatureToTSignature mSignatureToTSignature, MDefinitionToTMember mDefinitionToTMember,
			MDefinition mDefinition) {
		return new Object[] { mSignature, mAnonymous, tAnonymous, tDefinition, tSignature, mInstance,
				mAnonymousToTAnonymous, mSignatureToTSignature, mDefinitionToTMember, mDefinition };
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_29_6_perform_blackBBBBBBBBBBB(MSignature mSignature,
			AnonymousClassDeclaration mAnonymous, TClass tAnonymous, TMember tDefinition, TSignature tSignature,
			ClassInstanceCreation mInstance, AnonymousClassDeclarationToTClass mAnonymousToTAnonymous,
			MSignatureToTSignature mSignatureToTSignature, MDefinitionToTMember mDefinitionToTMember,
			MDefinition mDefinition, ModelgeneratorRuleResult ruleResult) {
		return new Object[] { mSignature, mAnonymous, tAnonymous, tDefinition, tSignature, mInstance,
				mAnonymousToTAnonymous, mSignatureToTSignature, mDefinitionToTMember, mDefinition, ruleResult };
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_29_6_perform_greenBBBBBB(
			AnonymousClassDeclaration mAnonymous, TClass tAnonymous, TMember tDefinition, TSignature tSignature,
			MDefinition mDefinition, ModelgeneratorRuleResult ruleResult) {
		tAnonymous.getDefines().add(tDefinition);
		tAnonymous.getSignature().add(tSignature);
		mAnonymous.getBodyDeclarations().add(mDefinition);
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { mAnonymous, tAnonymous, tDefinition, tSignature, mDefinition, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_LinkDefinitionToAnonymous_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //LinkDefinitionToAnonymousImpl
