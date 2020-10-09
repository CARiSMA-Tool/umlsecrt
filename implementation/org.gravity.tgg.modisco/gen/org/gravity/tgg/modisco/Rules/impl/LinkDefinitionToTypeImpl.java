/**
 */
package org.gravity.tgg.modisco.Rules.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.LinkedList;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;

import org.eclipse.modisco.java.AbstractTypeDeclaration;
import org.eclipse.modisco.java.BodyDeclaration;
import org.eclipse.modisco.java.Type;

import org.gravity.modisco.MDefinition;
import org.gravity.modisco.MSignature;

import org.gravity.tgg.modisco.MDefinitionToTMember;
import org.gravity.tgg.modisco.MSignatureToTSignature;

import org.gravity.tgg.modisco.Rules.LinkDefinitionToType;
import org.gravity.tgg.modisco.Rules.RulesPackage;

import org.gravity.tgg.modisco.TypeToTAbstractType;

import org.gravity.typegraph.basic.TAbstractType;
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
import org.gravity.tgg.modisco.csp.constraints.*;
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
 * An implementation of the model object '<em><b>Link Definition To Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class LinkDefinitionToTypeImpl extends AbstractRuleImpl implements LinkDefinitionToType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LinkDefinitionToTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getLinkDefinitionToType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, MDefinition mDefinition, MSignature mSignature,
			AbstractTypeDeclaration mType) {

		Object[] result1_black = LinkDefinitionToTypeImpl.pattern_LinkDefinitionToType_0_1_initialbindings_blackBBBBB(
				this, match, mDefinition, mSignature, mType);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[mDefinition] = " + mDefinition + ", " + "[mSignature] = "
					+ mSignature + ", " + "[mType] = " + mType + ".");
		}

		Object[] result2_bindingAndBlack = LinkDefinitionToTypeImpl
				.pattern_LinkDefinitionToType_0_2_SolveCSP_bindingAndBlackFBBBBB(this, match, mDefinition, mSignature,
						mType);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[mDefinition] = " + mDefinition + ", " + "[mSignature] = "
					+ mSignature + ", " + "[mType] = " + mType + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (LinkDefinitionToTypeImpl.pattern_LinkDefinitionToType_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = LinkDefinitionToTypeImpl
					.pattern_LinkDefinitionToType_0_4_collectelementstobetranslated_blackBBBB(match, mDefinition,
							mSignature, mType);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[mDefinition] = " + mDefinition + ", " + "[mSignature] = " + mSignature + ", " + "[mType] = "
						+ mType + ".");
			}
			LinkDefinitionToTypeImpl.pattern_LinkDefinitionToType_0_4_collectelementstobetranslated_greenBBBFF(match,
					mDefinition, mType);
			//nothing EMoflonEdge mType__mDefinition____bodyDeclarations = (EMoflonEdge) result4_green[3];
			//nothing EMoflonEdge mDefinition__mType____abstractTypeDeclaration = (EMoflonEdge) result4_green[4];

			Object[] result5_black = LinkDefinitionToTypeImpl
					.pattern_LinkDefinitionToType_0_5_collectcontextelements_blackBBBB(match, mDefinition, mSignature,
							mType);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[mDefinition] = " + mDefinition + ", " + "[mSignature] = " + mSignature + ", " + "[mType] = "
						+ mType + ".");
			}
			LinkDefinitionToTypeImpl.pattern_LinkDefinitionToType_0_5_collectcontextelements_greenBBBBFF(match,
					mDefinition, mSignature, mType);
			//nothing EMoflonEdge mSignature__mDefinition____mDefinitions = (EMoflonEdge) result5_green[4];
			//nothing EMoflonEdge mDefinition__mSignature____mSignature = (EMoflonEdge) result5_green[5];

			// 
			LinkDefinitionToTypeImpl.pattern_LinkDefinitionToType_0_6_registerobjectstomatch_expressionBBBBB(this,
					match, mDefinition, mSignature, mType);
			return LinkDefinitionToTypeImpl.pattern_LinkDefinitionToType_0_7_expressionF();
		} else {
			return LinkDefinitionToTypeImpl.pattern_LinkDefinitionToType_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = LinkDefinitionToTypeImpl
				.pattern_LinkDefinitionToType_1_1_performtransformation_bindingAndBlackFFFFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result1_bindingAndBlack[0];
		MDefinitionToTMember mDefinitionToTMember = (MDefinitionToTMember) result1_bindingAndBlack[1];
		TMember tDefinition = (TMember) result1_bindingAndBlack[2];
		MSignatureToTSignature mSignatureToTSignature = (MSignatureToTSignature) result1_bindingAndBlack[3];
		MDefinition mDefinition = (MDefinition) result1_bindingAndBlack[4];
		MSignature mSignature = (MSignature) result1_bindingAndBlack[5];
		TSignature tSignature = (TSignature) result1_bindingAndBlack[6];
		AbstractTypeDeclaration mType = (AbstractTypeDeclaration) result1_bindingAndBlack[7];
		TAbstractType tType = (TAbstractType) result1_bindingAndBlack[8];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[9];
		LinkDefinitionToTypeImpl.pattern_LinkDefinitionToType_1_1_performtransformation_greenBBB(tDefinition,
				tSignature, tType);

		Object[] result2_green = LinkDefinitionToTypeImpl
				.pattern_LinkDefinitionToType_1_2_collecttranslatedelements_greenF();
		if (result2_green == null) {
			throw new RuntimeException("Pattern matching failed.");
		}
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = LinkDefinitionToTypeImpl
				.pattern_LinkDefinitionToType_1_3_bookkeepingforedges_blackBBBBBBBBBB(ruleresult, mTypeToTType,
						mDefinitionToTMember, tDefinition, mSignatureToTSignature, mDefinition, mSignature, tSignature,
						mType, tType);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[mTypeToTType] = " + mTypeToTType + ", " + "[mDefinitionToTMember] = "
					+ mDefinitionToTMember + ", " + "[tDefinition] = " + tDefinition + ", "
					+ "[mSignatureToTSignature] = " + mSignatureToTSignature + ", " + "[mDefinition] = " + mDefinition
					+ ", " + "[mSignature] = " + mSignature + ", " + "[tSignature] = " + tSignature + ", "
					+ "[mType] = " + mType + ", " + "[tType] = " + tType + ".");
		}
		LinkDefinitionToTypeImpl.pattern_LinkDefinitionToType_1_3_bookkeepingforedges_greenBBBBBBFFFFF(ruleresult,
				tDefinition, mDefinition, tSignature, mType, tType);
		//nothing EMoflonEdge mType__mDefinition____bodyDeclarations = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge mDefinition__mType____abstractTypeDeclaration = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge tType__tDefinition____defines = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge tDefinition__tType____definedBy = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge tType__tSignature____signature = (EMoflonEdge) result3_green[10];

		// 
		// 
		LinkDefinitionToTypeImpl.pattern_LinkDefinitionToType_1_5_registerobjects_expressionBBBBBBBBBBB(this,
				ruleresult, mTypeToTType, mDefinitionToTMember, tDefinition, mSignatureToTSignature, mDefinition,
				mSignature, tSignature, mType, tType);
		return LinkDefinitionToTypeImpl.pattern_LinkDefinitionToType_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = LinkDefinitionToTypeImpl
				.pattern_LinkDefinitionToType_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = LinkDefinitionToTypeImpl
				.pattern_LinkDefinitionToType_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = LinkDefinitionToTypeImpl
				.pattern_LinkDefinitionToType_2_2_corematch_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		MDefinition mDefinition = (MDefinition) result2_binding[0];
		MSignature mSignature = (MSignature) result2_binding[1];
		AbstractTypeDeclaration mType = (AbstractTypeDeclaration) result2_binding[2];
		for (Object[] result2_black : LinkDefinitionToTypeImpl
				.pattern_LinkDefinitionToType_2_2_corematch_blackFFFFBBFBFB(mDefinition, mSignature, mType, match)) {
			TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result2_black[0];
			MDefinitionToTMember mDefinitionToTMember = (MDefinitionToTMember) result2_black[1];
			TMember tDefinition = (TMember) result2_black[2];
			MSignatureToTSignature mSignatureToTSignature = (MSignatureToTSignature) result2_black[3];
			TSignature tSignature = (TSignature) result2_black[6];
			TAbstractType tType = (TAbstractType) result2_black[8];
			// ForEach 
			for (Object[] result3_black : LinkDefinitionToTypeImpl
					.pattern_LinkDefinitionToType_2_3_findcontext_blackBBBBBBBBB(mTypeToTType, mDefinitionToTMember,
							tDefinition, mSignatureToTSignature, mDefinition, mSignature, tSignature, mType, tType)) {
				Object[] result3_green = LinkDefinitionToTypeImpl
						.pattern_LinkDefinitionToType_2_3_findcontext_greenBBBBBBBBBFFFFFFFFFFFFF(mTypeToTType,
								mDefinitionToTMember, tDefinition, mSignatureToTSignature, mDefinition, mSignature,
								tSignature, mType, tType);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[9];
				//nothing EMoflonEdge mDefinitionToTMember__mDefinition____source = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge mSignatureToTSignature__tSignature____target = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge mSignature__mDefinition____mDefinitions = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge mDefinition__mSignature____mSignature = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge mSignatureToTSignature__mSignature____source = (EMoflonEdge) result3_green[14];
				//nothing EMoflonEdge mType__mDefinition____bodyDeclarations = (EMoflonEdge) result3_green[15];
				//nothing EMoflonEdge mDefinition__mType____abstractTypeDeclaration = (EMoflonEdge) result3_green[16];
				//nothing EMoflonEdge tSignature__tDefinition____definitions = (EMoflonEdge) result3_green[17];
				//nothing EMoflonEdge tDefinition__tSignature____signature = (EMoflonEdge) result3_green[18];
				//nothing EMoflonEdge mTypeToTType__mType____source = (EMoflonEdge) result3_green[19];
				//nothing EMoflonEdge mTypeToTType__tType____target = (EMoflonEdge) result3_green[20];
				//nothing EMoflonEdge mDefinitionToTMember__tDefinition____target = (EMoflonEdge) result3_green[21];

				Object[] result4_bindingAndBlack = LinkDefinitionToTypeImpl
						.pattern_LinkDefinitionToType_2_4_solveCSP_bindingAndBlackFBBBBBBBBBBB(this, isApplicableMatch,
								mTypeToTType, mDefinitionToTMember, tDefinition, mSignatureToTSignature, mDefinition,
								mSignature, tSignature, mType, tType);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[mTypeToTType] = " + mTypeToTType
							+ ", " + "[mDefinitionToTMember] = " + mDefinitionToTMember + ", " + "[tDefinition] = "
							+ tDefinition + ", " + "[mSignatureToTSignature] = " + mSignatureToTSignature + ", "
							+ "[mDefinition] = " + mDefinition + ", " + "[mSignature] = " + mSignature + ", "
							+ "[tSignature] = " + tSignature + ", " + "[mType] = " + mType + ", " + "[tType] = " + tType
							+ ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (LinkDefinitionToTypeImpl.pattern_LinkDefinitionToType_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = LinkDefinitionToTypeImpl
							.pattern_LinkDefinitionToType_2_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					LinkDefinitionToTypeImpl.pattern_LinkDefinitionToType_2_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return LinkDefinitionToTypeImpl.pattern_LinkDefinitionToType_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, MDefinition mDefinition, MSignature mSignature,
			AbstractTypeDeclaration mType) {
		match.registerObject("mDefinition", mDefinition);
		match.registerObject("mSignature", mSignature);
		match.registerObject("mType", mType);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, MDefinition mDefinition, MSignature mSignature,
			AbstractTypeDeclaration mType) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, TypeToTAbstractType mTypeToTType,
			MDefinitionToTMember mDefinitionToTMember, TMember tDefinition,
			MSignatureToTSignature mSignatureToTSignature, MDefinition mDefinition, MSignature mSignature,
			TSignature tSignature, AbstractTypeDeclaration mType, TAbstractType tType) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("mTypeToTType", mTypeToTType);
		isApplicableMatch.registerObject("mDefinitionToTMember", mDefinitionToTMember);
		isApplicableMatch.registerObject("tDefinition", tDefinition);
		isApplicableMatch.registerObject("mSignatureToTSignature", mSignatureToTSignature);
		isApplicableMatch.registerObject("mDefinition", mDefinition);
		isApplicableMatch.registerObject("mSignature", mSignature);
		isApplicableMatch.registerObject("tSignature", tSignature);
		isApplicableMatch.registerObject("mType", mType);
		isApplicableMatch.registerObject("tType", tType);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject mTypeToTType, EObject mDefinitionToTMember,
			EObject tDefinition, EObject mSignatureToTSignature, EObject mDefinition, EObject mSignature,
			EObject tSignature, EObject mType, EObject tType) {
		ruleresult.registerObject("mTypeToTType", mTypeToTType);
		ruleresult.registerObject("mDefinitionToTMember", mDefinitionToTMember);
		ruleresult.registerObject("tDefinition", tDefinition);
		ruleresult.registerObject("mSignatureToTSignature", mSignatureToTSignature);
		ruleresult.registerObject("mDefinition", mDefinition);
		ruleresult.registerObject("mSignature", mSignature);
		ruleresult.registerObject("tSignature", tSignature);
		ruleresult.registerObject("mType", mType);
		ruleresult.registerObject("tType", tType);

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
	public boolean isAppropriate_BWD(Match match, TMember tDefinition, TSignature tSignature, TAbstractType tType) {

		Object[] result1_black = LinkDefinitionToTypeImpl.pattern_LinkDefinitionToType_10_1_initialbindings_blackBBBBB(
				this, match, tDefinition, tSignature, tType);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[tDefinition] = " + tDefinition + ", " + "[tSignature] = "
					+ tSignature + ", " + "[tType] = " + tType + ".");
		}

		Object[] result2_bindingAndBlack = LinkDefinitionToTypeImpl
				.pattern_LinkDefinitionToType_10_2_SolveCSP_bindingAndBlackFBBBBB(this, match, tDefinition, tSignature,
						tType);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[tDefinition] = " + tDefinition + ", " + "[tSignature] = "
					+ tSignature + ", " + "[tType] = " + tType + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (LinkDefinitionToTypeImpl.pattern_LinkDefinitionToType_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = LinkDefinitionToTypeImpl
					.pattern_LinkDefinitionToType_10_4_collectelementstobetranslated_blackBBBB(match, tDefinition,
							tSignature, tType);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[tDefinition] = " + tDefinition + ", " + "[tSignature] = " + tSignature + ", " + "[tType] = "
						+ tType + ".");
			}
			LinkDefinitionToTypeImpl.pattern_LinkDefinitionToType_10_4_collectelementstobetranslated_greenBBBBFFF(match,
					tDefinition, tSignature, tType);
			//nothing EMoflonEdge tType__tDefinition____defines = (EMoflonEdge) result4_green[4];
			//nothing EMoflonEdge tDefinition__tType____definedBy = (EMoflonEdge) result4_green[5];
			//nothing EMoflonEdge tType__tSignature____signature = (EMoflonEdge) result4_green[6];

			Object[] result5_black = LinkDefinitionToTypeImpl
					.pattern_LinkDefinitionToType_10_5_collectcontextelements_blackBBBB(match, tDefinition, tSignature,
							tType);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[tDefinition] = " + tDefinition + ", " + "[tSignature] = " + tSignature + ", " + "[tType] = "
						+ tType + ".");
			}
			LinkDefinitionToTypeImpl.pattern_LinkDefinitionToType_10_5_collectcontextelements_greenBBBBFF(match,
					tDefinition, tSignature, tType);
			//nothing EMoflonEdge tSignature__tDefinition____definitions = (EMoflonEdge) result5_green[4];
			//nothing EMoflonEdge tDefinition__tSignature____signature = (EMoflonEdge) result5_green[5];

			// 
			LinkDefinitionToTypeImpl.pattern_LinkDefinitionToType_10_6_registerobjectstomatch_expressionBBBBB(this,
					match, tDefinition, tSignature, tType);
			return LinkDefinitionToTypeImpl.pattern_LinkDefinitionToType_10_7_expressionF();
		} else {
			return LinkDefinitionToTypeImpl.pattern_LinkDefinitionToType_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = LinkDefinitionToTypeImpl
				.pattern_LinkDefinitionToType_11_1_performtransformation_bindingAndBlackFFFFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result1_bindingAndBlack[0];
		MDefinitionToTMember mDefinitionToTMember = (MDefinitionToTMember) result1_bindingAndBlack[1];
		TMember tDefinition = (TMember) result1_bindingAndBlack[2];
		MSignatureToTSignature mSignatureToTSignature = (MSignatureToTSignature) result1_bindingAndBlack[3];
		MDefinition mDefinition = (MDefinition) result1_bindingAndBlack[4];
		MSignature mSignature = (MSignature) result1_bindingAndBlack[5];
		TSignature tSignature = (TSignature) result1_bindingAndBlack[6];
		AbstractTypeDeclaration mType = (AbstractTypeDeclaration) result1_bindingAndBlack[7];
		TAbstractType tType = (TAbstractType) result1_bindingAndBlack[8];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[9];
		LinkDefinitionToTypeImpl.pattern_LinkDefinitionToType_11_1_performtransformation_greenBB(mDefinition, mType);

		Object[] result2_green = LinkDefinitionToTypeImpl
				.pattern_LinkDefinitionToType_11_2_collecttranslatedelements_greenF();
		if (result2_green == null) {
			throw new RuntimeException("Pattern matching failed.");
		}
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = LinkDefinitionToTypeImpl
				.pattern_LinkDefinitionToType_11_3_bookkeepingforedges_blackBBBBBBBBBB(ruleresult, mTypeToTType,
						mDefinitionToTMember, tDefinition, mSignatureToTSignature, mDefinition, mSignature, tSignature,
						mType, tType);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[mTypeToTType] = " + mTypeToTType + ", " + "[mDefinitionToTMember] = "
					+ mDefinitionToTMember + ", " + "[tDefinition] = " + tDefinition + ", "
					+ "[mSignatureToTSignature] = " + mSignatureToTSignature + ", " + "[mDefinition] = " + mDefinition
					+ ", " + "[mSignature] = " + mSignature + ", " + "[tSignature] = " + tSignature + ", "
					+ "[mType] = " + mType + ", " + "[tType] = " + tType + ".");
		}
		LinkDefinitionToTypeImpl.pattern_LinkDefinitionToType_11_3_bookkeepingforedges_greenBBBBBBFFFFF(ruleresult,
				tDefinition, mDefinition, tSignature, mType, tType);
		//nothing EMoflonEdge mType__mDefinition____bodyDeclarations = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge mDefinition__mType____abstractTypeDeclaration = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge tType__tDefinition____defines = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge tDefinition__tType____definedBy = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge tType__tSignature____signature = (EMoflonEdge) result3_green[10];

		// 
		// 
		LinkDefinitionToTypeImpl.pattern_LinkDefinitionToType_11_5_registerobjects_expressionBBBBBBBBBBB(this,
				ruleresult, mTypeToTType, mDefinitionToTMember, tDefinition, mSignatureToTSignature, mDefinition,
				mSignature, tSignature, mType, tType);
		return LinkDefinitionToTypeImpl.pattern_LinkDefinitionToType_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = LinkDefinitionToTypeImpl
				.pattern_LinkDefinitionToType_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = LinkDefinitionToTypeImpl
				.pattern_LinkDefinitionToType_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = LinkDefinitionToTypeImpl
				.pattern_LinkDefinitionToType_12_2_corematch_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		TMember tDefinition = (TMember) result2_binding[0];
		TSignature tSignature = (TSignature) result2_binding[1];
		TAbstractType tType = (TAbstractType) result2_binding[2];
		for (Object[] result2_black : LinkDefinitionToTypeImpl
				.pattern_LinkDefinitionToType_12_2_corematch_blackFFBFFFBFBB(tDefinition, tSignature, tType, match)) {
			TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result2_black[0];
			MDefinitionToTMember mDefinitionToTMember = (MDefinitionToTMember) result2_black[1];
			MSignatureToTSignature mSignatureToTSignature = (MSignatureToTSignature) result2_black[3];
			MDefinition mDefinition = (MDefinition) result2_black[4];
			MSignature mSignature = (MSignature) result2_black[5];
			AbstractTypeDeclaration mType = (AbstractTypeDeclaration) result2_black[7];
			// ForEach 
			for (Object[] result3_black : LinkDefinitionToTypeImpl
					.pattern_LinkDefinitionToType_12_3_findcontext_blackBBBBBBBBB(mTypeToTType, mDefinitionToTMember,
							tDefinition, mSignatureToTSignature, mDefinition, mSignature, tSignature, mType, tType)) {
				Object[] result3_green = LinkDefinitionToTypeImpl
						.pattern_LinkDefinitionToType_12_3_findcontext_greenBBBBBBBBBFFFFFFFFFFFFFF(mTypeToTType,
								mDefinitionToTMember, tDefinition, mSignatureToTSignature, mDefinition, mSignature,
								tSignature, mType, tType);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[9];
				//nothing EMoflonEdge mDefinitionToTMember__mDefinition____source = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge mSignatureToTSignature__tSignature____target = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge mSignature__mDefinition____mDefinitions = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge mDefinition__mSignature____mSignature = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge mSignatureToTSignature__mSignature____source = (EMoflonEdge) result3_green[14];
				//nothing EMoflonEdge tSignature__tDefinition____definitions = (EMoflonEdge) result3_green[15];
				//nothing EMoflonEdge tDefinition__tSignature____signature = (EMoflonEdge) result3_green[16];
				//nothing EMoflonEdge mTypeToTType__mType____source = (EMoflonEdge) result3_green[17];
				//nothing EMoflonEdge mTypeToTType__tType____target = (EMoflonEdge) result3_green[18];
				//nothing EMoflonEdge tType__tDefinition____defines = (EMoflonEdge) result3_green[19];
				//nothing EMoflonEdge tDefinition__tType____definedBy = (EMoflonEdge) result3_green[20];
				//nothing EMoflonEdge mDefinitionToTMember__tDefinition____target = (EMoflonEdge) result3_green[21];
				//nothing EMoflonEdge tType__tSignature____signature = (EMoflonEdge) result3_green[22];

				Object[] result4_bindingAndBlack = LinkDefinitionToTypeImpl
						.pattern_LinkDefinitionToType_12_4_solveCSP_bindingAndBlackFBBBBBBBBBBB(this, isApplicableMatch,
								mTypeToTType, mDefinitionToTMember, tDefinition, mSignatureToTSignature, mDefinition,
								mSignature, tSignature, mType, tType);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[mTypeToTType] = " + mTypeToTType
							+ ", " + "[mDefinitionToTMember] = " + mDefinitionToTMember + ", " + "[tDefinition] = "
							+ tDefinition + ", " + "[mSignatureToTSignature] = " + mSignatureToTSignature + ", "
							+ "[mDefinition] = " + mDefinition + ", " + "[mSignature] = " + mSignature + ", "
							+ "[tSignature] = " + tSignature + ", " + "[mType] = " + mType + ", " + "[tType] = " + tType
							+ ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (LinkDefinitionToTypeImpl.pattern_LinkDefinitionToType_12_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = LinkDefinitionToTypeImpl
							.pattern_LinkDefinitionToType_12_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					LinkDefinitionToTypeImpl.pattern_LinkDefinitionToType_12_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return LinkDefinitionToTypeImpl.pattern_LinkDefinitionToType_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, TMember tDefinition, TSignature tSignature,
			TAbstractType tType) {
		match.registerObject("tDefinition", tDefinition);
		match.registerObject("tSignature", tSignature);
		match.registerObject("tType", tType);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, TMember tDefinition, TSignature tSignature,
			TAbstractType tType) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, TypeToTAbstractType mTypeToTType,
			MDefinitionToTMember mDefinitionToTMember, TMember tDefinition,
			MSignatureToTSignature mSignatureToTSignature, MDefinition mDefinition, MSignature mSignature,
			TSignature tSignature, AbstractTypeDeclaration mType, TAbstractType tType) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("mTypeToTType", mTypeToTType);
		isApplicableMatch.registerObject("mDefinitionToTMember", mDefinitionToTMember);
		isApplicableMatch.registerObject("tDefinition", tDefinition);
		isApplicableMatch.registerObject("mSignatureToTSignature", mSignatureToTSignature);
		isApplicableMatch.registerObject("mDefinition", mDefinition);
		isApplicableMatch.registerObject("mSignature", mSignature);
		isApplicableMatch.registerObject("tSignature", tSignature);
		isApplicableMatch.registerObject("mType", mType);
		isApplicableMatch.registerObject("tType", tType);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject mTypeToTType, EObject mDefinitionToTMember,
			EObject tDefinition, EObject mSignatureToTSignature, EObject mDefinition, EObject mSignature,
			EObject tSignature, EObject mType, EObject tType) {
		ruleresult.registerObject("mTypeToTType", mTypeToTType);
		ruleresult.registerObject("mDefinitionToTMember", mDefinitionToTMember);
		ruleresult.registerObject("tDefinition", tDefinition);
		ruleresult.registerObject("mSignatureToTSignature", mSignatureToTSignature);
		ruleresult.registerObject("mDefinition", mDefinition);
		ruleresult.registerObject("mSignature", mSignature);
		ruleresult.registerObject("tSignature", tSignature);
		ruleresult.registerObject("mType", mType);
		ruleresult.registerObject("tType", tType);

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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_234(EMoflonEdge _edge_defines) {

		Object[] result1_bindingAndBlack = LinkDefinitionToTypeImpl
				.pattern_LinkDefinitionToType_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = LinkDefinitionToTypeImpl.pattern_LinkDefinitionToType_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : LinkDefinitionToTypeImpl
				.pattern_LinkDefinitionToType_20_2_testcorematchandDECs_blackFFFB(_edge_defines)) {
			TMember tDefinition = (TMember) result2_black[0];
			TSignature tSignature = (TSignature) result2_black[1];
			TAbstractType tType = (TAbstractType) result2_black[2];
			Object[] result2_green = LinkDefinitionToTypeImpl
					.pattern_LinkDefinitionToType_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (LinkDefinitionToTypeImpl
					.pattern_LinkDefinitionToType_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(this,
							match, tDefinition, tSignature, tType)) {
				// 
				if (LinkDefinitionToTypeImpl
						.pattern_LinkDefinitionToType_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = LinkDefinitionToTypeImpl
							.pattern_LinkDefinitionToType_20_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					LinkDefinitionToTypeImpl.pattern_LinkDefinitionToType_20_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return LinkDefinitionToTypeImpl.pattern_LinkDefinitionToType_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_242(EMoflonEdge _edge_bodyDeclarations) {

		Object[] result1_bindingAndBlack = LinkDefinitionToTypeImpl
				.pattern_LinkDefinitionToType_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = LinkDefinitionToTypeImpl.pattern_LinkDefinitionToType_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : LinkDefinitionToTypeImpl
				.pattern_LinkDefinitionToType_21_2_testcorematchandDECs_blackFFFB(_edge_bodyDeclarations)) {
			MDefinition mDefinition = (MDefinition) result2_black[0];
			MSignature mSignature = (MSignature) result2_black[1];
			AbstractTypeDeclaration mType = (AbstractTypeDeclaration) result2_black[2];
			Object[] result2_green = LinkDefinitionToTypeImpl
					.pattern_LinkDefinitionToType_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (LinkDefinitionToTypeImpl
					.pattern_LinkDefinitionToType_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(this,
							match, mDefinition, mSignature, mType)) {
				// 
				if (LinkDefinitionToTypeImpl
						.pattern_LinkDefinitionToType_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = LinkDefinitionToTypeImpl
							.pattern_LinkDefinitionToType_21_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					LinkDefinitionToTypeImpl.pattern_LinkDefinitionToType_21_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return LinkDefinitionToTypeImpl.pattern_LinkDefinitionToType_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("LinkDefinitionToType");
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
		ruleResult.setRule("LinkDefinitionToType");
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

		Object[] result1_black = LinkDefinitionToTypeImpl.pattern_LinkDefinitionToType_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = LinkDefinitionToTypeImpl.pattern_LinkDefinitionToType_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = LinkDefinitionToTypeImpl
				.pattern_LinkDefinitionToType_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFBB(sourceMatch, targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		TMember tDefinition = (TMember) result2_bindingAndBlack[0];
		MDefinition mDefinition = (MDefinition) result2_bindingAndBlack[1];
		MSignature mSignature = (MSignature) result2_bindingAndBlack[2];
		TSignature tSignature = (TSignature) result2_bindingAndBlack[3];
		AbstractTypeDeclaration mType = (AbstractTypeDeclaration) result2_bindingAndBlack[4];
		TAbstractType tType = (TAbstractType) result2_bindingAndBlack[5];

		Object[] result3_bindingAndBlack = LinkDefinitionToTypeImpl
				.pattern_LinkDefinitionToType_24_3_solvecsp_bindingAndBlackFBBBBBBBBB(this, tDefinition, mDefinition,
						mSignature, tSignature, mType, tType, sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[tDefinition] = " + tDefinition + ", " + "[mDefinition] = " + mDefinition + ", "
					+ "[mSignature] = " + mSignature + ", " + "[tSignature] = " + tSignature + ", " + "[mType] = "
					+ mType + ", " + "[tType] = " + tType + ", " + "[sourceMatch] = " + sourceMatch + ", "
					+ "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (LinkDefinitionToTypeImpl.pattern_LinkDefinitionToType_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : LinkDefinitionToTypeImpl
					.pattern_LinkDefinitionToType_24_5_matchcorrcontext_blackFFBFBBBBBBB(tDefinition, mDefinition,
							mSignature, tSignature, mType, tType, sourceMatch, targetMatch)) {
				TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result5_black[0];
				MDefinitionToTMember mDefinitionToTMember = (MDefinitionToTMember) result5_black[1];
				MSignatureToTSignature mSignatureToTSignature = (MSignatureToTSignature) result5_black[3];
				Object[] result5_green = LinkDefinitionToTypeImpl
						.pattern_LinkDefinitionToType_24_5_matchcorrcontext_greenBBBBBF(mTypeToTType,
								mDefinitionToTMember, mSignatureToTSignature, sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[5];

				Object[] result6_black = LinkDefinitionToTypeImpl
						.pattern_LinkDefinitionToType_24_6_createcorrespondence_blackBBBBBBB(tDefinition, mDefinition,
								mSignature, tSignature, mType, tType, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[tDefinition] = "
							+ tDefinition + ", " + "[mDefinition] = " + mDefinition + ", " + "[mSignature] = "
							+ mSignature + ", " + "[tSignature] = " + tSignature + ", " + "[mType] = " + mType + ", "
							+ "[tType] = " + tType + ", " + "[ccMatch] = " + ccMatch + ".");
				}

				Object[] result7_black = LinkDefinitionToTypeImpl
						.pattern_LinkDefinitionToType_24_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				LinkDefinitionToTypeImpl.pattern_LinkDefinitionToType_24_7_addtoreturnedresult_greenBB(result, ccMatch);

			}

		} else {
		}
		return LinkDefinitionToTypeImpl.pattern_LinkDefinitionToType_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(TMember tDefinition, MDefinition mDefinition, MSignature mSignature,
			TSignature tSignature, AbstractTypeDeclaration mType, TAbstractType tType, Match sourceMatch,
			Match targetMatch) {// Create CSP
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
	public boolean checkDEC_FWD(MDefinition mDefinition, MSignature mSignature, AbstractTypeDeclaration mType) {// 
		Object[] result1_black = LinkDefinitionToTypeImpl
				.pattern_LinkDefinitionToType_27_1_matchtggpattern_blackBBB(mDefinition, mSignature, mType);
		if (result1_black != null) {
			return LinkDefinitionToTypeImpl.pattern_LinkDefinitionToType_27_2_expressionF();
		} else {
			return LinkDefinitionToTypeImpl.pattern_LinkDefinitionToType_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(TMember tDefinition, TSignature tSignature, TAbstractType tType) {// 
		Object[] result1_black = LinkDefinitionToTypeImpl
				.pattern_LinkDefinitionToType_28_1_matchtggpattern_blackBBB(tDefinition, tSignature, tType);
		if (result1_black != null) {
			return LinkDefinitionToTypeImpl.pattern_LinkDefinitionToType_28_2_expressionF();
		} else {
			return LinkDefinitionToTypeImpl.pattern_LinkDefinitionToType_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer,
			TypeToTAbstractType mTypeToTTypeParameter, MDefinitionToTMember mDefinitionToTMemberParameter) {

		Object[] result1_black = LinkDefinitionToTypeImpl.pattern_LinkDefinitionToType_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = LinkDefinitionToTypeImpl.pattern_LinkDefinitionToType_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : LinkDefinitionToTypeImpl
				.pattern_LinkDefinitionToType_29_2_isapplicablecore_blackFFFFFFFFFFFBB(ruleEntryContainer,
						ruleResult)) {
			//nothing RuleEntryList mTypeToTTypeList = (RuleEntryList) result2_black[0];
			TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result2_black[1];
			AbstractTypeDeclaration mType = (AbstractTypeDeclaration) result2_black[2];
			TAbstractType tType = (TAbstractType) result2_black[3];
			//nothing RuleEntryList mDefinitionToTMemberList = (RuleEntryList) result2_black[4];
			MDefinitionToTMember mDefinitionToTMember = (MDefinitionToTMember) result2_black[5];
			MDefinition mDefinition = (MDefinition) result2_black[6];
			MSignature mSignature = (MSignature) result2_black[7];
			MSignatureToTSignature mSignatureToTSignature = (MSignatureToTSignature) result2_black[8];
			TSignature tSignature = (TSignature) result2_black[9];
			TMember tDefinition = (TMember) result2_black[10];

			Object[] result3_bindingAndBlack = LinkDefinitionToTypeImpl
					.pattern_LinkDefinitionToType_29_3_solveCSP_bindingAndBlackFBBBBBBBBBBBB(this, isApplicableMatch,
							mTypeToTType, mDefinitionToTMember, tDefinition, mSignatureToTSignature, mDefinition,
							mSignature, tSignature, mType, tType, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[mTypeToTType] = " + mTypeToTType
						+ ", " + "[mDefinitionToTMember] = " + mDefinitionToTMember + ", " + "[tDefinition] = "
						+ tDefinition + ", " + "[mSignatureToTSignature] = " + mSignatureToTSignature + ", "
						+ "[mDefinition] = " + mDefinition + ", " + "[mSignature] = " + mSignature + ", "
						+ "[tSignature] = " + tSignature + ", " + "[mType] = " + mType + ", " + "[tType] = " + tType
						+ ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (LinkDefinitionToTypeImpl.pattern_LinkDefinitionToType_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = LinkDefinitionToTypeImpl
						.pattern_LinkDefinitionToType_29_5_checknacs_blackBBBBBBBBB(mTypeToTType, mDefinitionToTMember,
								tDefinition, mSignatureToTSignature, mDefinition, mSignature, tSignature, mType, tType);
				if (result5_black != null) {

					Object[] result6_black = LinkDefinitionToTypeImpl
							.pattern_LinkDefinitionToType_29_6_perform_blackBBBBBBBBBB(mTypeToTType,
									mDefinitionToTMember, tDefinition, mSignatureToTSignature, mDefinition, mSignature,
									tSignature, mType, tType, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[mTypeToTType] = "
								+ mTypeToTType + ", " + "[mDefinitionToTMember] = " + mDefinitionToTMember + ", "
								+ "[tDefinition] = " + tDefinition + ", " + "[mSignatureToTSignature] = "
								+ mSignatureToTSignature + ", " + "[mDefinition] = " + mDefinition + ", "
								+ "[mSignature] = " + mSignature + ", " + "[tSignature] = " + tSignature + ", "
								+ "[mType] = " + mType + ", " + "[tType] = " + tType + ", " + "[ruleResult] = "
								+ ruleResult + ".");
					}
					LinkDefinitionToTypeImpl.pattern_LinkDefinitionToType_29_6_perform_greenBBBBBB(tDefinition,
							mDefinition, tSignature, mType, tType, ruleResult);

				} else {
				}

			} else {
			}

		}
		return LinkDefinitionToTypeImpl.pattern_LinkDefinitionToType_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, TypeToTAbstractType mTypeToTType,
			MDefinitionToTMember mDefinitionToTMember, TMember tDefinition,
			MSignatureToTSignature mSignatureToTSignature, MDefinition mDefinition, MSignature mSignature,
			TSignature tSignature, AbstractTypeDeclaration mType, TAbstractType tType,
			ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("mTypeToTType", mTypeToTType);
		isApplicableMatch.registerObject("mDefinitionToTMember", mDefinitionToTMember);
		isApplicableMatch.registerObject("tDefinition", tDefinition);
		isApplicableMatch.registerObject("mSignatureToTSignature", mSignatureToTSignature);
		isApplicableMatch.registerObject("mDefinition", mDefinition);
		isApplicableMatch.registerObject("mSignature", mSignature);
		isApplicableMatch.registerObject("tSignature", tSignature);
		isApplicableMatch.registerObject("mType", mType);
		isApplicableMatch.registerObject("tType", tType);
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
		case RulesPackage.LINK_DEFINITION_TO_TYPE___IS_APPROPRIATE_FWD__MATCH_MDEFINITION_MSIGNATURE_ABSTRACTTYPEDECLARATION:
			return isAppropriate_FWD((Match) arguments.get(0), (MDefinition) arguments.get(1),
					(MSignature) arguments.get(2), (AbstractTypeDeclaration) arguments.get(3));
		case RulesPackage.LINK_DEFINITION_TO_TYPE___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.LINK_DEFINITION_TO_TYPE___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.LINK_DEFINITION_TO_TYPE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_MDEFINITION_MSIGNATURE_ABSTRACTTYPEDECLARATION:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (MDefinition) arguments.get(1),
					(MSignature) arguments.get(2), (AbstractTypeDeclaration) arguments.get(3));
			return null;
		case RulesPackage.LINK_DEFINITION_TO_TYPE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_MDEFINITION_MSIGNATURE_ABSTRACTTYPEDECLARATION:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (MDefinition) arguments.get(1),
					(MSignature) arguments.get(2), (AbstractTypeDeclaration) arguments.get(3));
		case RulesPackage.LINK_DEFINITION_TO_TYPE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.LINK_DEFINITION_TO_TYPE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_TYPETOTABSTRACTTYPE_MDEFINITIONTOTMEMBER_TMEMBER_MSIGNATURETOTSIGNATURE_MDEFINITION_MSIGNATURE_TSIGNATURE_ABSTRACTTYPEDECLARATION_TABSTRACTTYPE:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0),
					(TypeToTAbstractType) arguments.get(1), (MDefinitionToTMember) arguments.get(2),
					(TMember) arguments.get(3), (MSignatureToTSignature) arguments.get(4),
					(MDefinition) arguments.get(5), (MSignature) arguments.get(6), (TSignature) arguments.get(7),
					(AbstractTypeDeclaration) arguments.get(8), (TAbstractType) arguments.get(9));
		case RulesPackage.LINK_DEFINITION_TO_TYPE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.LINK_DEFINITION_TO_TYPE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9));
			return null;
		case RulesPackage.LINK_DEFINITION_TO_TYPE___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.LINK_DEFINITION_TO_TYPE___IS_APPROPRIATE_BWD__MATCH_TMEMBER_TSIGNATURE_TABSTRACTTYPE:
			return isAppropriate_BWD((Match) arguments.get(0), (TMember) arguments.get(1),
					(TSignature) arguments.get(2), (TAbstractType) arguments.get(3));
		case RulesPackage.LINK_DEFINITION_TO_TYPE___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.LINK_DEFINITION_TO_TYPE___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.LINK_DEFINITION_TO_TYPE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TMEMBER_TSIGNATURE_TABSTRACTTYPE:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (TMember) arguments.get(1),
					(TSignature) arguments.get(2), (TAbstractType) arguments.get(3));
			return null;
		case RulesPackage.LINK_DEFINITION_TO_TYPE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TMEMBER_TSIGNATURE_TABSTRACTTYPE:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (TMember) arguments.get(1),
					(TSignature) arguments.get(2), (TAbstractType) arguments.get(3));
		case RulesPackage.LINK_DEFINITION_TO_TYPE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.LINK_DEFINITION_TO_TYPE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_TYPETOTABSTRACTTYPE_MDEFINITIONTOTMEMBER_TMEMBER_MSIGNATURETOTSIGNATURE_MDEFINITION_MSIGNATURE_TSIGNATURE_ABSTRACTTYPEDECLARATION_TABSTRACTTYPE:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
					(TypeToTAbstractType) arguments.get(1), (MDefinitionToTMember) arguments.get(2),
					(TMember) arguments.get(3), (MSignatureToTSignature) arguments.get(4),
					(MDefinition) arguments.get(5), (MSignature) arguments.get(6), (TSignature) arguments.get(7),
					(AbstractTypeDeclaration) arguments.get(8), (TAbstractType) arguments.get(9));
		case RulesPackage.LINK_DEFINITION_TO_TYPE___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.LINK_DEFINITION_TO_TYPE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9));
			return null;
		case RulesPackage.LINK_DEFINITION_TO_TYPE___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.LINK_DEFINITION_TO_TYPE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_234__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_234((EMoflonEdge) arguments.get(0));
		case RulesPackage.LINK_DEFINITION_TO_TYPE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_242__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_242((EMoflonEdge) arguments.get(0));
		case RulesPackage.LINK_DEFINITION_TO_TYPE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.LINK_DEFINITION_TO_TYPE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.LINK_DEFINITION_TO_TYPE___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.LINK_DEFINITION_TO_TYPE___IS_APPLICABLE_SOLVE_CSP_CC__TMEMBER_MDEFINITION_MSIGNATURE_TSIGNATURE_ABSTRACTTYPEDECLARATION_TABSTRACTTYPE_MATCH_MATCH:
			return isApplicable_solveCsp_CC((TMember) arguments.get(0), (MDefinition) arguments.get(1),
					(MSignature) arguments.get(2), (TSignature) arguments.get(3),
					(AbstractTypeDeclaration) arguments.get(4), (TAbstractType) arguments.get(5),
					(Match) arguments.get(6), (Match) arguments.get(7));
		case RulesPackage.LINK_DEFINITION_TO_TYPE___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.LINK_DEFINITION_TO_TYPE___CHECK_DEC_FWD__MDEFINITION_MSIGNATURE_ABSTRACTTYPEDECLARATION:
			return checkDEC_FWD((MDefinition) arguments.get(0), (MSignature) arguments.get(1),
					(AbstractTypeDeclaration) arguments.get(2));
		case RulesPackage.LINK_DEFINITION_TO_TYPE___CHECK_DEC_BWD__TMEMBER_TSIGNATURE_TABSTRACTTYPE:
			return checkDEC_BWD((TMember) arguments.get(0), (TSignature) arguments.get(1),
					(TAbstractType) arguments.get(2));
		case RulesPackage.LINK_DEFINITION_TO_TYPE___GENERATE_MODEL__RULEENTRYCONTAINER_TYPETOTABSTRACTTYPE_MDEFINITIONTOTMEMBER:
			return generateModel((RuleEntryContainer) arguments.get(0), (TypeToTAbstractType) arguments.get(1),
					(MDefinitionToTMember) arguments.get(2));
		case RulesPackage.LINK_DEFINITION_TO_TYPE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_TYPETOTABSTRACTTYPE_MDEFINITIONTOTMEMBER_TMEMBER_MSIGNATURETOTSIGNATURE_MDEFINITION_MSIGNATURE_TSIGNATURE_ABSTRACTTYPEDECLARATION_TABSTRACTTYPE_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
					(TypeToTAbstractType) arguments.get(1), (MDefinitionToTMember) arguments.get(2),
					(TMember) arguments.get(3), (MSignatureToTSignature) arguments.get(4),
					(MDefinition) arguments.get(5), (MSignature) arguments.get(6), (TSignature) arguments.get(7),
					(AbstractTypeDeclaration) arguments.get(8), (TAbstractType) arguments.get(9),
					(ModelgeneratorRuleResult) arguments.get(10));
		case RulesPackage.LINK_DEFINITION_TO_TYPE___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_LinkDefinitionToType_0_1_initialbindings_blackBBBBB(LinkDefinitionToType _this,
			Match match, MDefinition mDefinition, MSignature mSignature, AbstractTypeDeclaration mType) {
		return new Object[] { _this, match, mDefinition, mSignature, mType };
	}

	public static final Object[] pattern_LinkDefinitionToType_0_2_SolveCSP_bindingFBBBBB(LinkDefinitionToType _this,
			Match match, MDefinition mDefinition, MSignature mSignature, AbstractTypeDeclaration mType) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, mDefinition, mSignature, mType);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, mDefinition, mSignature, mType };
		}
		return null;
	}

	public static final Object[] pattern_LinkDefinitionToType_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_LinkDefinitionToType_0_2_SolveCSP_bindingAndBlackFBBBBB(
			LinkDefinitionToType _this, Match match, MDefinition mDefinition, MSignature mSignature,
			AbstractTypeDeclaration mType) {
		Object[] result_pattern_LinkDefinitionToType_0_2_SolveCSP_binding = pattern_LinkDefinitionToType_0_2_SolveCSP_bindingFBBBBB(
				_this, match, mDefinition, mSignature, mType);
		if (result_pattern_LinkDefinitionToType_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_LinkDefinitionToType_0_2_SolveCSP_binding[0];

			Object[] result_pattern_LinkDefinitionToType_0_2_SolveCSP_black = pattern_LinkDefinitionToType_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_LinkDefinitionToType_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, mDefinition, mSignature, mType };
			}
		}
		return null;
	}

	public static final boolean pattern_LinkDefinitionToType_0_3_CheckCSP_expressionFBB(LinkDefinitionToType _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_LinkDefinitionToType_0_4_collectelementstobetranslated_blackBBBB(Match match,
			MDefinition mDefinition, MSignature mSignature, AbstractTypeDeclaration mType) {
		return new Object[] { match, mDefinition, mSignature, mType };
	}

	public static final Object[] pattern_LinkDefinitionToType_0_4_collectelementstobetranslated_greenBBBFF(Match match,
			MDefinition mDefinition, AbstractTypeDeclaration mType) {
		EMoflonEdge mType__mDefinition____bodyDeclarations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mDefinition__mType____abstractTypeDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String mType__mDefinition____bodyDeclarations_name_prime = "bodyDeclarations";
		String mDefinition__mType____abstractTypeDeclaration_name_prime = "abstractTypeDeclaration";
		mType__mDefinition____bodyDeclarations.setSrc(mType);
		mType__mDefinition____bodyDeclarations.setTrg(mDefinition);
		match.getToBeTranslatedEdges().add(mType__mDefinition____bodyDeclarations);
		mDefinition__mType____abstractTypeDeclaration.setSrc(mDefinition);
		mDefinition__mType____abstractTypeDeclaration.setTrg(mType);
		match.getToBeTranslatedEdges().add(mDefinition__mType____abstractTypeDeclaration);
		mType__mDefinition____bodyDeclarations.setName(mType__mDefinition____bodyDeclarations_name_prime);
		mDefinition__mType____abstractTypeDeclaration.setName(mDefinition__mType____abstractTypeDeclaration_name_prime);
		return new Object[] { match, mDefinition, mType, mType__mDefinition____bodyDeclarations,
				mDefinition__mType____abstractTypeDeclaration };
	}

	public static final Object[] pattern_LinkDefinitionToType_0_5_collectcontextelements_blackBBBB(Match match,
			MDefinition mDefinition, MSignature mSignature, AbstractTypeDeclaration mType) {
		return new Object[] { match, mDefinition, mSignature, mType };
	}

	public static final Object[] pattern_LinkDefinitionToType_0_5_collectcontextelements_greenBBBBFF(Match match,
			MDefinition mDefinition, MSignature mSignature, AbstractTypeDeclaration mType) {
		EMoflonEdge mSignature__mDefinition____mDefinitions = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mDefinition__mSignature____mSignature = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(mDefinition);
		match.getContextNodes().add(mSignature);
		match.getContextNodes().add(mType);
		String mSignature__mDefinition____mDefinitions_name_prime = "mDefinitions";
		String mDefinition__mSignature____mSignature_name_prime = "mSignature";
		mSignature__mDefinition____mDefinitions.setSrc(mSignature);
		mSignature__mDefinition____mDefinitions.setTrg(mDefinition);
		match.getContextEdges().add(mSignature__mDefinition____mDefinitions);
		mDefinition__mSignature____mSignature.setSrc(mDefinition);
		mDefinition__mSignature____mSignature.setTrg(mSignature);
		match.getContextEdges().add(mDefinition__mSignature____mSignature);
		mSignature__mDefinition____mDefinitions.setName(mSignature__mDefinition____mDefinitions_name_prime);
		mDefinition__mSignature____mSignature.setName(mDefinition__mSignature____mSignature_name_prime);
		return new Object[] { match, mDefinition, mSignature, mType, mSignature__mDefinition____mDefinitions,
				mDefinition__mSignature____mSignature };
	}

	public static final void pattern_LinkDefinitionToType_0_6_registerobjectstomatch_expressionBBBBB(
			LinkDefinitionToType _this, Match match, MDefinition mDefinition, MSignature mSignature,
			AbstractTypeDeclaration mType) {
		_this.registerObjectsToMatch_FWD(match, mDefinition, mSignature, mType);

	}

	public static final boolean pattern_LinkDefinitionToType_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_LinkDefinitionToType_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_LinkDefinitionToType_1_1_performtransformation_bindingFFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("mTypeToTType");
		EObject _localVariable_1 = isApplicableMatch.getObject("mDefinitionToTMember");
		EObject _localVariable_2 = isApplicableMatch.getObject("tDefinition");
		EObject _localVariable_3 = isApplicableMatch.getObject("mSignatureToTSignature");
		EObject _localVariable_4 = isApplicableMatch.getObject("mDefinition");
		EObject _localVariable_5 = isApplicableMatch.getObject("mSignature");
		EObject _localVariable_6 = isApplicableMatch.getObject("tSignature");
		EObject _localVariable_7 = isApplicableMatch.getObject("mType");
		EObject _localVariable_8 = isApplicableMatch.getObject("tType");
		EObject tmpMTypeToTType = _localVariable_0;
		EObject tmpMDefinitionToTMember = _localVariable_1;
		EObject tmpTDefinition = _localVariable_2;
		EObject tmpMSignatureToTSignature = _localVariable_3;
		EObject tmpMDefinition = _localVariable_4;
		EObject tmpMSignature = _localVariable_5;
		EObject tmpTSignature = _localVariable_6;
		EObject tmpMType = _localVariable_7;
		EObject tmpTType = _localVariable_8;
		if (tmpMTypeToTType instanceof TypeToTAbstractType) {
			TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) tmpMTypeToTType;
			if (tmpMDefinitionToTMember instanceof MDefinitionToTMember) {
				MDefinitionToTMember mDefinitionToTMember = (MDefinitionToTMember) tmpMDefinitionToTMember;
				if (tmpTDefinition instanceof TMember) {
					TMember tDefinition = (TMember) tmpTDefinition;
					if (tmpMSignatureToTSignature instanceof MSignatureToTSignature) {
						MSignatureToTSignature mSignatureToTSignature = (MSignatureToTSignature) tmpMSignatureToTSignature;
						if (tmpMDefinition instanceof MDefinition) {
							MDefinition mDefinition = (MDefinition) tmpMDefinition;
							if (tmpMSignature instanceof MSignature) {
								MSignature mSignature = (MSignature) tmpMSignature;
								if (tmpTSignature instanceof TSignature) {
									TSignature tSignature = (TSignature) tmpTSignature;
									if (tmpMType instanceof AbstractTypeDeclaration) {
										AbstractTypeDeclaration mType = (AbstractTypeDeclaration) tmpMType;
										if (tmpTType instanceof TAbstractType) {
											TAbstractType tType = (TAbstractType) tmpTType;
											return new Object[] { mTypeToTType, mDefinitionToTMember, tDefinition,
													mSignatureToTSignature, mDefinition, mSignature, tSignature, mType,
													tType, isApplicableMatch };
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

	public static final Object[] pattern_LinkDefinitionToType_1_1_performtransformation_blackBBBBBBBBBFBB(
			TypeToTAbstractType mTypeToTType, MDefinitionToTMember mDefinitionToTMember, TMember tDefinition,
			MSignatureToTSignature mSignatureToTSignature, MDefinition mDefinition, MSignature mSignature,
			TSignature tSignature, AbstractTypeDeclaration mType, TAbstractType tType, LinkDefinitionToType _this,
			IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { mTypeToTType, mDefinitionToTMember, tDefinition, mSignatureToTSignature,
						mDefinition, mSignature, tSignature, mType, tType, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_LinkDefinitionToType_1_1_performtransformation_bindingAndBlackFFFFFFFFFFBB(
			LinkDefinitionToType _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_LinkDefinitionToType_1_1_performtransformation_binding = pattern_LinkDefinitionToType_1_1_performtransformation_bindingFFFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_LinkDefinitionToType_1_1_performtransformation_binding != null) {
			TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result_pattern_LinkDefinitionToType_1_1_performtransformation_binding[0];
			MDefinitionToTMember mDefinitionToTMember = (MDefinitionToTMember) result_pattern_LinkDefinitionToType_1_1_performtransformation_binding[1];
			TMember tDefinition = (TMember) result_pattern_LinkDefinitionToType_1_1_performtransformation_binding[2];
			MSignatureToTSignature mSignatureToTSignature = (MSignatureToTSignature) result_pattern_LinkDefinitionToType_1_1_performtransformation_binding[3];
			MDefinition mDefinition = (MDefinition) result_pattern_LinkDefinitionToType_1_1_performtransformation_binding[4];
			MSignature mSignature = (MSignature) result_pattern_LinkDefinitionToType_1_1_performtransformation_binding[5];
			TSignature tSignature = (TSignature) result_pattern_LinkDefinitionToType_1_1_performtransformation_binding[6];
			AbstractTypeDeclaration mType = (AbstractTypeDeclaration) result_pattern_LinkDefinitionToType_1_1_performtransformation_binding[7];
			TAbstractType tType = (TAbstractType) result_pattern_LinkDefinitionToType_1_1_performtransformation_binding[8];

			Object[] result_pattern_LinkDefinitionToType_1_1_performtransformation_black = pattern_LinkDefinitionToType_1_1_performtransformation_blackBBBBBBBBBFBB(
					mTypeToTType, mDefinitionToTMember, tDefinition, mSignatureToTSignature, mDefinition, mSignature,
					tSignature, mType, tType, _this, isApplicableMatch);
			if (result_pattern_LinkDefinitionToType_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_LinkDefinitionToType_1_1_performtransformation_black[9];

				return new Object[] { mTypeToTType, mDefinitionToTMember, tDefinition, mSignatureToTSignature,
						mDefinition, mSignature, tSignature, mType, tType, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_LinkDefinitionToType_1_1_performtransformation_greenBBB(TMember tDefinition,
			TSignature tSignature, TAbstractType tType) {
		tType.getDefines().add(tDefinition);
		tType.getSignature().add(tSignature);
		return new Object[] { tDefinition, tSignature, tType };
	}

	public static final Object[] pattern_LinkDefinitionToType_1_2_collecttranslatedelements_greenF() {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		return new Object[] { ruleresult };
	}

	public static final Object[] pattern_LinkDefinitionToType_1_3_bookkeepingforedges_blackBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject mTypeToTType, EObject mDefinitionToTMember, EObject tDefinition,
			EObject mSignatureToTSignature, EObject mDefinition, EObject mSignature, EObject tSignature, EObject mType,
			EObject tType) {
		if (!mTypeToTType.equals(tDefinition)) {
			if (!mTypeToTType.equals(tSignature)) {
				if (!mTypeToTType.equals(tType)) {
					if (!mDefinitionToTMember.equals(mTypeToTType)) {
						if (!mDefinitionToTMember.equals(tDefinition)) {
							if (!mDefinitionToTMember.equals(mSignatureToTSignature)) {
								if (!mDefinitionToTMember.equals(mSignature)) {
									if (!mDefinitionToTMember.equals(tSignature)) {
										if (!mDefinitionToTMember.equals(mType)) {
											if (!mDefinitionToTMember.equals(tType)) {
												if (!tDefinition.equals(tSignature)) {
													if (!tDefinition.equals(tType)) {
														if (!mSignatureToTSignature.equals(mTypeToTType)) {
															if (!mSignatureToTSignature.equals(tDefinition)) {
																if (!mSignatureToTSignature.equals(tSignature)) {
																	if (!mSignatureToTSignature.equals(mType)) {
																		if (!mSignatureToTSignature.equals(tType)) {
																			if (!mDefinition.equals(mTypeToTType)) {
																				if (!mDefinition
																						.equals(mDefinitionToTMember)) {
																					if (!mDefinition
																							.equals(tDefinition)) {
																						if (!mDefinition.equals(
																								mSignatureToTSignature)) {
																							if (!mDefinition.equals(
																									mSignature)) {
																								if (!mDefinition.equals(
																										tSignature)) {
																									if (!mDefinition
																											.equals(mType)) {
																										if (!mDefinition
																												.equals(tType)) {
																											if (!mSignature
																													.equals(mTypeToTType)) {
																												if (!mSignature
																														.equals(tDefinition)) {
																													if (!mSignature
																															.equals(mSignatureToTSignature)) {
																														if (!mSignature
																																.equals(tSignature)) {
																															if (!mSignature
																																	.equals(mType)) {
																																if (!mSignature
																																		.equals(tType)) {
																																	if (!tSignature
																																			.equals(tType)) {
																																		if (!mType
																																				.equals(mTypeToTType)) {
																																			if (!mType
																																					.equals(tDefinition)) {
																																				if (!mType
																																						.equals(tSignature)) {
																																					if (!mType
																																							.equals(tType)) {
																																						return new Object[] {
																																								ruleresult,
																																								mTypeToTType,
																																								mDefinitionToTMember,
																																								tDefinition,
																																								mSignatureToTSignature,
																																								mDefinition,
																																								mSignature,
																																								tSignature,
																																								mType,
																																								tType };
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

	public static final Object[] pattern_LinkDefinitionToType_1_3_bookkeepingforedges_greenBBBBBBFFFFF(
			PerformRuleResult ruleresult, EObject tDefinition, EObject mDefinition, EObject tSignature, EObject mType,
			EObject tType) {
		EMoflonEdge mType__mDefinition____bodyDeclarations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mDefinition__mType____abstractTypeDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tType__tDefinition____defines = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tDefinition__tType____definedBy = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tType__tSignature____signature = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "LinkDefinitionToType";
		String mType__mDefinition____bodyDeclarations_name_prime = "bodyDeclarations";
		String mDefinition__mType____abstractTypeDeclaration_name_prime = "abstractTypeDeclaration";
		String tType__tDefinition____defines_name_prime = "defines";
		String tDefinition__tType____definedBy_name_prime = "definedBy";
		String tType__tSignature____signature_name_prime = "signature";
		mType__mDefinition____bodyDeclarations.setSrc(mType);
		mType__mDefinition____bodyDeclarations.setTrg(mDefinition);
		ruleresult.getTranslatedEdges().add(mType__mDefinition____bodyDeclarations);
		mDefinition__mType____abstractTypeDeclaration.setSrc(mDefinition);
		mDefinition__mType____abstractTypeDeclaration.setTrg(mType);
		ruleresult.getTranslatedEdges().add(mDefinition__mType____abstractTypeDeclaration);
		tType__tDefinition____defines.setSrc(tType);
		tType__tDefinition____defines.setTrg(tDefinition);
		ruleresult.getCreatedEdges().add(tType__tDefinition____defines);
		tDefinition__tType____definedBy.setSrc(tDefinition);
		tDefinition__tType____definedBy.setTrg(tType);
		ruleresult.getCreatedEdges().add(tDefinition__tType____definedBy);
		tType__tSignature____signature.setSrc(tType);
		tType__tSignature____signature.setTrg(tSignature);
		ruleresult.getCreatedEdges().add(tType__tSignature____signature);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		mType__mDefinition____bodyDeclarations.setName(mType__mDefinition____bodyDeclarations_name_prime);
		mDefinition__mType____abstractTypeDeclaration.setName(mDefinition__mType____abstractTypeDeclaration_name_prime);
		tType__tDefinition____defines.setName(tType__tDefinition____defines_name_prime);
		tDefinition__tType____definedBy.setName(tDefinition__tType____definedBy_name_prime);
		tType__tSignature____signature.setName(tType__tSignature____signature_name_prime);
		return new Object[] { ruleresult, tDefinition, mDefinition, tSignature, mType, tType,
				mType__mDefinition____bodyDeclarations, mDefinition__mType____abstractTypeDeclaration,
				tType__tDefinition____defines, tDefinition__tType____definedBy, tType__tSignature____signature };
	}

	public static final void pattern_LinkDefinitionToType_1_5_registerobjects_expressionBBBBBBBBBBB(
			LinkDefinitionToType _this, PerformRuleResult ruleresult, EObject mTypeToTType,
			EObject mDefinitionToTMember, EObject tDefinition, EObject mSignatureToTSignature, EObject mDefinition,
			EObject mSignature, EObject tSignature, EObject mType, EObject tType) {
		_this.registerObjects_FWD(ruleresult, mTypeToTType, mDefinitionToTMember, tDefinition, mSignatureToTSignature,
				mDefinition, mSignature, tSignature, mType, tType);

	}

	public static final PerformRuleResult pattern_LinkDefinitionToType_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_LinkDefinitionToType_2_1_preparereturnvalue_bindingFB(
			LinkDefinitionToType _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_LinkDefinitionToType_2_1_preparereturnvalue_blackFBB(EClass eClass,
			LinkDefinitionToType _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_LinkDefinitionToType_2_1_preparereturnvalue_bindingAndBlackFFB(
			LinkDefinitionToType _this) {
		Object[] result_pattern_LinkDefinitionToType_2_1_preparereturnvalue_binding = pattern_LinkDefinitionToType_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_LinkDefinitionToType_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_LinkDefinitionToType_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_LinkDefinitionToType_2_1_preparereturnvalue_black = pattern_LinkDefinitionToType_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_LinkDefinitionToType_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_LinkDefinitionToType_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_LinkDefinitionToType_2_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "LinkDefinitionToType";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_LinkDefinitionToType_2_2_corematch_bindingFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("mDefinition");
		EObject _localVariable_1 = match.getObject("mSignature");
		EObject _localVariable_2 = match.getObject("mType");
		EObject tmpMDefinition = _localVariable_0;
		EObject tmpMSignature = _localVariable_1;
		EObject tmpMType = _localVariable_2;
		if (tmpMDefinition instanceof MDefinition) {
			MDefinition mDefinition = (MDefinition) tmpMDefinition;
			if (tmpMSignature instanceof MSignature) {
				MSignature mSignature = (MSignature) tmpMSignature;
				if (tmpMType instanceof AbstractTypeDeclaration) {
					AbstractTypeDeclaration mType = (AbstractTypeDeclaration) tmpMType;
					return new Object[] { mDefinition, mSignature, mType, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_LinkDefinitionToType_2_2_corematch_blackFFFFBBFBFB(
			MDefinition mDefinition, MSignature mSignature, AbstractTypeDeclaration mType, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (MDefinitionToTMember mDefinitionToTMember : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mDefinition, MDefinitionToTMember.class, "source")) {
			TMember tDefinition = mDefinitionToTMember.getTarget();
			if (tDefinition != null) {
				for (MSignatureToTSignature mSignatureToTSignature : org.moflon.core.utilities.eMoflonEMFUtil
						.getOppositeReferenceTyped(mSignature, MSignatureToTSignature.class, "source")) {
					TSignature tSignature = mSignatureToTSignature.getTarget();
					if (tSignature != null) {
						for (TypeToTAbstractType mTypeToTType : org.moflon.core.utilities.eMoflonEMFUtil
								.getOppositeReferenceTyped(mType, TypeToTAbstractType.class, "source")) {
							TAbstractType tType = mTypeToTType.getTarget();
							if (tType != null) {
								_result.add(new Object[] { mTypeToTType, mDefinitionToTMember, tDefinition,
										mSignatureToTSignature, mDefinition, mSignature, tSignature, mType, tType,
										match });
							}

						}
					}

				}
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_LinkDefinitionToType_2_3_findcontext_blackBBBBBBBBB(
			TypeToTAbstractType mTypeToTType, MDefinitionToTMember mDefinitionToTMember, TMember tDefinition,
			MSignatureToTSignature mSignatureToTSignature, MDefinition mDefinition, MSignature mSignature,
			TSignature tSignature, AbstractTypeDeclaration mType, TAbstractType tType) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (mDefinition.equals(mDefinitionToTMember.getSource())) {
			if (tSignature.equals(mSignatureToTSignature.getTarget())) {
				if (mSignature.getMDefinitions().contains(mDefinition)) {
					if (mSignature.equals(mSignatureToTSignature.getSource())) {
						if (mType.getBodyDeclarations().contains(mDefinition)) {
							if (tSignature.getDefinitions().contains(tDefinition)) {
								if (mType.equals(mTypeToTType.getSource())) {
									if (tType.equals(mTypeToTType.getTarget())) {
										if (tDefinition.equals(mDefinitionToTMember.getTarget())) {
											_result.add(new Object[] { mTypeToTType, mDefinitionToTMember, tDefinition,
													mSignatureToTSignature, mDefinition, mSignature, tSignature, mType,
													tType });
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

	public static final Object[] pattern_LinkDefinitionToType_2_3_findcontext_greenBBBBBBBBBFFFFFFFFFFFFF(
			TypeToTAbstractType mTypeToTType, MDefinitionToTMember mDefinitionToTMember, TMember tDefinition,
			MSignatureToTSignature mSignatureToTSignature, MDefinition mDefinition, MSignature mSignature,
			TSignature tSignature, AbstractTypeDeclaration mType, TAbstractType tType) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge mDefinitionToTMember__mDefinition____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSignatureToTSignature__tSignature____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSignature__mDefinition____mDefinitions = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mDefinition__mSignature____mSignature = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSignatureToTSignature__mSignature____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mType__mDefinition____bodyDeclarations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mDefinition__mType____abstractTypeDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSignature__tDefinition____definitions = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tDefinition__tSignature____signature = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mTypeToTType__mType____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mTypeToTType__tType____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mDefinitionToTMember__tDefinition____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String mDefinitionToTMember__mDefinition____source_name_prime = "source";
		String mSignatureToTSignature__tSignature____target_name_prime = "target";
		String mSignature__mDefinition____mDefinitions_name_prime = "mDefinitions";
		String mDefinition__mSignature____mSignature_name_prime = "mSignature";
		String mSignatureToTSignature__mSignature____source_name_prime = "source";
		String mType__mDefinition____bodyDeclarations_name_prime = "bodyDeclarations";
		String mDefinition__mType____abstractTypeDeclaration_name_prime = "abstractTypeDeclaration";
		String tSignature__tDefinition____definitions_name_prime = "definitions";
		String tDefinition__tSignature____signature_name_prime = "signature";
		String mTypeToTType__mType____source_name_prime = "source";
		String mTypeToTType__tType____target_name_prime = "target";
		String mDefinitionToTMember__tDefinition____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(mTypeToTType);
		isApplicableMatch.getAllContextElements().add(mDefinitionToTMember);
		isApplicableMatch.getAllContextElements().add(tDefinition);
		isApplicableMatch.getAllContextElements().add(mSignatureToTSignature);
		isApplicableMatch.getAllContextElements().add(mDefinition);
		isApplicableMatch.getAllContextElements().add(mSignature);
		isApplicableMatch.getAllContextElements().add(tSignature);
		isApplicableMatch.getAllContextElements().add(mType);
		isApplicableMatch.getAllContextElements().add(tType);
		mDefinitionToTMember__mDefinition____source.setSrc(mDefinitionToTMember);
		mDefinitionToTMember__mDefinition____source.setTrg(mDefinition);
		isApplicableMatch.getAllContextElements().add(mDefinitionToTMember__mDefinition____source);
		mSignatureToTSignature__tSignature____target.setSrc(mSignatureToTSignature);
		mSignatureToTSignature__tSignature____target.setTrg(tSignature);
		isApplicableMatch.getAllContextElements().add(mSignatureToTSignature__tSignature____target);
		mSignature__mDefinition____mDefinitions.setSrc(mSignature);
		mSignature__mDefinition____mDefinitions.setTrg(mDefinition);
		isApplicableMatch.getAllContextElements().add(mSignature__mDefinition____mDefinitions);
		mDefinition__mSignature____mSignature.setSrc(mDefinition);
		mDefinition__mSignature____mSignature.setTrg(mSignature);
		isApplicableMatch.getAllContextElements().add(mDefinition__mSignature____mSignature);
		mSignatureToTSignature__mSignature____source.setSrc(mSignatureToTSignature);
		mSignatureToTSignature__mSignature____source.setTrg(mSignature);
		isApplicableMatch.getAllContextElements().add(mSignatureToTSignature__mSignature____source);
		mType__mDefinition____bodyDeclarations.setSrc(mType);
		mType__mDefinition____bodyDeclarations.setTrg(mDefinition);
		isApplicableMatch.getAllContextElements().add(mType__mDefinition____bodyDeclarations);
		mDefinition__mType____abstractTypeDeclaration.setSrc(mDefinition);
		mDefinition__mType____abstractTypeDeclaration.setTrg(mType);
		isApplicableMatch.getAllContextElements().add(mDefinition__mType____abstractTypeDeclaration);
		tSignature__tDefinition____definitions.setSrc(tSignature);
		tSignature__tDefinition____definitions.setTrg(tDefinition);
		isApplicableMatch.getAllContextElements().add(tSignature__tDefinition____definitions);
		tDefinition__tSignature____signature.setSrc(tDefinition);
		tDefinition__tSignature____signature.setTrg(tSignature);
		isApplicableMatch.getAllContextElements().add(tDefinition__tSignature____signature);
		mTypeToTType__mType____source.setSrc(mTypeToTType);
		mTypeToTType__mType____source.setTrg(mType);
		isApplicableMatch.getAllContextElements().add(mTypeToTType__mType____source);
		mTypeToTType__tType____target.setSrc(mTypeToTType);
		mTypeToTType__tType____target.setTrg(tType);
		isApplicableMatch.getAllContextElements().add(mTypeToTType__tType____target);
		mDefinitionToTMember__tDefinition____target.setSrc(mDefinitionToTMember);
		mDefinitionToTMember__tDefinition____target.setTrg(tDefinition);
		isApplicableMatch.getAllContextElements().add(mDefinitionToTMember__tDefinition____target);
		mDefinitionToTMember__mDefinition____source.setName(mDefinitionToTMember__mDefinition____source_name_prime);
		mSignatureToTSignature__tSignature____target.setName(mSignatureToTSignature__tSignature____target_name_prime);
		mSignature__mDefinition____mDefinitions.setName(mSignature__mDefinition____mDefinitions_name_prime);
		mDefinition__mSignature____mSignature.setName(mDefinition__mSignature____mSignature_name_prime);
		mSignatureToTSignature__mSignature____source.setName(mSignatureToTSignature__mSignature____source_name_prime);
		mType__mDefinition____bodyDeclarations.setName(mType__mDefinition____bodyDeclarations_name_prime);
		mDefinition__mType____abstractTypeDeclaration.setName(mDefinition__mType____abstractTypeDeclaration_name_prime);
		tSignature__tDefinition____definitions.setName(tSignature__tDefinition____definitions_name_prime);
		tDefinition__tSignature____signature.setName(tDefinition__tSignature____signature_name_prime);
		mTypeToTType__mType____source.setName(mTypeToTType__mType____source_name_prime);
		mTypeToTType__tType____target.setName(mTypeToTType__tType____target_name_prime);
		mDefinitionToTMember__tDefinition____target.setName(mDefinitionToTMember__tDefinition____target_name_prime);
		return new Object[] { mTypeToTType, mDefinitionToTMember, tDefinition, mSignatureToTSignature, mDefinition,
				mSignature, tSignature, mType, tType, isApplicableMatch, mDefinitionToTMember__mDefinition____source,
				mSignatureToTSignature__tSignature____target, mSignature__mDefinition____mDefinitions,
				mDefinition__mSignature____mSignature, mSignatureToTSignature__mSignature____source,
				mType__mDefinition____bodyDeclarations, mDefinition__mType____abstractTypeDeclaration,
				tSignature__tDefinition____definitions, tDefinition__tSignature____signature,
				mTypeToTType__mType____source, mTypeToTType__tType____target,
				mDefinitionToTMember__tDefinition____target };
	}

	public static final Object[] pattern_LinkDefinitionToType_2_4_solveCSP_bindingFBBBBBBBBBBB(
			LinkDefinitionToType _this, IsApplicableMatch isApplicableMatch, TypeToTAbstractType mTypeToTType,
			MDefinitionToTMember mDefinitionToTMember, TMember tDefinition,
			MSignatureToTSignature mSignatureToTSignature, MDefinition mDefinition, MSignature mSignature,
			TSignature tSignature, AbstractTypeDeclaration mType, TAbstractType tType) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, mTypeToTType, mDefinitionToTMember,
				tDefinition, mSignatureToTSignature, mDefinition, mSignature, tSignature, mType, tType);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mTypeToTType, mDefinitionToTMember, tDefinition,
					mSignatureToTSignature, mDefinition, mSignature, tSignature, mType, tType };
		}
		return null;
	}

	public static final Object[] pattern_LinkDefinitionToType_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_LinkDefinitionToType_2_4_solveCSP_bindingAndBlackFBBBBBBBBBBB(
			LinkDefinitionToType _this, IsApplicableMatch isApplicableMatch, TypeToTAbstractType mTypeToTType,
			MDefinitionToTMember mDefinitionToTMember, TMember tDefinition,
			MSignatureToTSignature mSignatureToTSignature, MDefinition mDefinition, MSignature mSignature,
			TSignature tSignature, AbstractTypeDeclaration mType, TAbstractType tType) {
		Object[] result_pattern_LinkDefinitionToType_2_4_solveCSP_binding = pattern_LinkDefinitionToType_2_4_solveCSP_bindingFBBBBBBBBBBB(
				_this, isApplicableMatch, mTypeToTType, mDefinitionToTMember, tDefinition, mSignatureToTSignature,
				mDefinition, mSignature, tSignature, mType, tType);
		if (result_pattern_LinkDefinitionToType_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_LinkDefinitionToType_2_4_solveCSP_binding[0];

			Object[] result_pattern_LinkDefinitionToType_2_4_solveCSP_black = pattern_LinkDefinitionToType_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_LinkDefinitionToType_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mTypeToTType, mDefinitionToTMember, tDefinition,
						mSignatureToTSignature, mDefinition, mSignature, tSignature, mType, tType };
			}
		}
		return null;
	}

	public static final boolean pattern_LinkDefinitionToType_2_5_checkCSP_expressionFBB(LinkDefinitionToType _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_LinkDefinitionToType_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_LinkDefinitionToType_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "LinkDefinitionToType";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_LinkDefinitionToType_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_LinkDefinitionToType_10_1_initialbindings_blackBBBBB(
			LinkDefinitionToType _this, Match match, TMember tDefinition, TSignature tSignature, TAbstractType tType) {
		return new Object[] { _this, match, tDefinition, tSignature, tType };
	}

	public static final Object[] pattern_LinkDefinitionToType_10_2_SolveCSP_bindingFBBBBB(LinkDefinitionToType _this,
			Match match, TMember tDefinition, TSignature tSignature, TAbstractType tType) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, tDefinition, tSignature, tType);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, tDefinition, tSignature, tType };
		}
		return null;
	}

	public static final Object[] pattern_LinkDefinitionToType_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_LinkDefinitionToType_10_2_SolveCSP_bindingAndBlackFBBBBB(
			LinkDefinitionToType _this, Match match, TMember tDefinition, TSignature tSignature, TAbstractType tType) {
		Object[] result_pattern_LinkDefinitionToType_10_2_SolveCSP_binding = pattern_LinkDefinitionToType_10_2_SolveCSP_bindingFBBBBB(
				_this, match, tDefinition, tSignature, tType);
		if (result_pattern_LinkDefinitionToType_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_LinkDefinitionToType_10_2_SolveCSP_binding[0];

			Object[] result_pattern_LinkDefinitionToType_10_2_SolveCSP_black = pattern_LinkDefinitionToType_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_LinkDefinitionToType_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, tDefinition, tSignature, tType };
			}
		}
		return null;
	}

	public static final boolean pattern_LinkDefinitionToType_10_3_CheckCSP_expressionFBB(LinkDefinitionToType _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_LinkDefinitionToType_10_4_collectelementstobetranslated_blackBBBB(Match match,
			TMember tDefinition, TSignature tSignature, TAbstractType tType) {
		return new Object[] { match, tDefinition, tSignature, tType };
	}

	public static final Object[] pattern_LinkDefinitionToType_10_4_collectelementstobetranslated_greenBBBBFFF(
			Match match, TMember tDefinition, TSignature tSignature, TAbstractType tType) {
		EMoflonEdge tType__tDefinition____defines = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tDefinition__tType____definedBy = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tType__tSignature____signature = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String tType__tDefinition____defines_name_prime = "defines";
		String tDefinition__tType____definedBy_name_prime = "definedBy";
		String tType__tSignature____signature_name_prime = "signature";
		tType__tDefinition____defines.setSrc(tType);
		tType__tDefinition____defines.setTrg(tDefinition);
		match.getToBeTranslatedEdges().add(tType__tDefinition____defines);
		tDefinition__tType____definedBy.setSrc(tDefinition);
		tDefinition__tType____definedBy.setTrg(tType);
		match.getToBeTranslatedEdges().add(tDefinition__tType____definedBy);
		tType__tSignature____signature.setSrc(tType);
		tType__tSignature____signature.setTrg(tSignature);
		match.getToBeTranslatedEdges().add(tType__tSignature____signature);
		tType__tDefinition____defines.setName(tType__tDefinition____defines_name_prime);
		tDefinition__tType____definedBy.setName(tDefinition__tType____definedBy_name_prime);
		tType__tSignature____signature.setName(tType__tSignature____signature_name_prime);
		return new Object[] { match, tDefinition, tSignature, tType, tType__tDefinition____defines,
				tDefinition__tType____definedBy, tType__tSignature____signature };
	}

	public static final Object[] pattern_LinkDefinitionToType_10_5_collectcontextelements_blackBBBB(Match match,
			TMember tDefinition, TSignature tSignature, TAbstractType tType) {
		return new Object[] { match, tDefinition, tSignature, tType };
	}

	public static final Object[] pattern_LinkDefinitionToType_10_5_collectcontextelements_greenBBBBFF(Match match,
			TMember tDefinition, TSignature tSignature, TAbstractType tType) {
		EMoflonEdge tSignature__tDefinition____definitions = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tDefinition__tSignature____signature = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(tDefinition);
		match.getContextNodes().add(tSignature);
		match.getContextNodes().add(tType);
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
		return new Object[] { match, tDefinition, tSignature, tType, tSignature__tDefinition____definitions,
				tDefinition__tSignature____signature };
	}

	public static final void pattern_LinkDefinitionToType_10_6_registerobjectstomatch_expressionBBBBB(
			LinkDefinitionToType _this, Match match, TMember tDefinition, TSignature tSignature, TAbstractType tType) {
		_this.registerObjectsToMatch_BWD(match, tDefinition, tSignature, tType);

	}

	public static final boolean pattern_LinkDefinitionToType_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_LinkDefinitionToType_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_LinkDefinitionToType_11_1_performtransformation_bindingFFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("mTypeToTType");
		EObject _localVariable_1 = isApplicableMatch.getObject("mDefinitionToTMember");
		EObject _localVariable_2 = isApplicableMatch.getObject("tDefinition");
		EObject _localVariable_3 = isApplicableMatch.getObject("mSignatureToTSignature");
		EObject _localVariable_4 = isApplicableMatch.getObject("mDefinition");
		EObject _localVariable_5 = isApplicableMatch.getObject("mSignature");
		EObject _localVariable_6 = isApplicableMatch.getObject("tSignature");
		EObject _localVariable_7 = isApplicableMatch.getObject("mType");
		EObject _localVariable_8 = isApplicableMatch.getObject("tType");
		EObject tmpMTypeToTType = _localVariable_0;
		EObject tmpMDefinitionToTMember = _localVariable_1;
		EObject tmpTDefinition = _localVariable_2;
		EObject tmpMSignatureToTSignature = _localVariable_3;
		EObject tmpMDefinition = _localVariable_4;
		EObject tmpMSignature = _localVariable_5;
		EObject tmpTSignature = _localVariable_6;
		EObject tmpMType = _localVariable_7;
		EObject tmpTType = _localVariable_8;
		if (tmpMTypeToTType instanceof TypeToTAbstractType) {
			TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) tmpMTypeToTType;
			if (tmpMDefinitionToTMember instanceof MDefinitionToTMember) {
				MDefinitionToTMember mDefinitionToTMember = (MDefinitionToTMember) tmpMDefinitionToTMember;
				if (tmpTDefinition instanceof TMember) {
					TMember tDefinition = (TMember) tmpTDefinition;
					if (tmpMSignatureToTSignature instanceof MSignatureToTSignature) {
						MSignatureToTSignature mSignatureToTSignature = (MSignatureToTSignature) tmpMSignatureToTSignature;
						if (tmpMDefinition instanceof MDefinition) {
							MDefinition mDefinition = (MDefinition) tmpMDefinition;
							if (tmpMSignature instanceof MSignature) {
								MSignature mSignature = (MSignature) tmpMSignature;
								if (tmpTSignature instanceof TSignature) {
									TSignature tSignature = (TSignature) tmpTSignature;
									if (tmpMType instanceof AbstractTypeDeclaration) {
										AbstractTypeDeclaration mType = (AbstractTypeDeclaration) tmpMType;
										if (tmpTType instanceof TAbstractType) {
											TAbstractType tType = (TAbstractType) tmpTType;
											return new Object[] { mTypeToTType, mDefinitionToTMember, tDefinition,
													mSignatureToTSignature, mDefinition, mSignature, tSignature, mType,
													tType, isApplicableMatch };
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

	public static final Object[] pattern_LinkDefinitionToType_11_1_performtransformation_blackBBBBBBBBBFBB(
			TypeToTAbstractType mTypeToTType, MDefinitionToTMember mDefinitionToTMember, TMember tDefinition,
			MSignatureToTSignature mSignatureToTSignature, MDefinition mDefinition, MSignature mSignature,
			TSignature tSignature, AbstractTypeDeclaration mType, TAbstractType tType, LinkDefinitionToType _this,
			IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { mTypeToTType, mDefinitionToTMember, tDefinition, mSignatureToTSignature,
						mDefinition, mSignature, tSignature, mType, tType, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_LinkDefinitionToType_11_1_performtransformation_bindingAndBlackFFFFFFFFFFBB(
			LinkDefinitionToType _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_LinkDefinitionToType_11_1_performtransformation_binding = pattern_LinkDefinitionToType_11_1_performtransformation_bindingFFFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_LinkDefinitionToType_11_1_performtransformation_binding != null) {
			TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result_pattern_LinkDefinitionToType_11_1_performtransformation_binding[0];
			MDefinitionToTMember mDefinitionToTMember = (MDefinitionToTMember) result_pattern_LinkDefinitionToType_11_1_performtransformation_binding[1];
			TMember tDefinition = (TMember) result_pattern_LinkDefinitionToType_11_1_performtransformation_binding[2];
			MSignatureToTSignature mSignatureToTSignature = (MSignatureToTSignature) result_pattern_LinkDefinitionToType_11_1_performtransformation_binding[3];
			MDefinition mDefinition = (MDefinition) result_pattern_LinkDefinitionToType_11_1_performtransformation_binding[4];
			MSignature mSignature = (MSignature) result_pattern_LinkDefinitionToType_11_1_performtransformation_binding[5];
			TSignature tSignature = (TSignature) result_pattern_LinkDefinitionToType_11_1_performtransformation_binding[6];
			AbstractTypeDeclaration mType = (AbstractTypeDeclaration) result_pattern_LinkDefinitionToType_11_1_performtransformation_binding[7];
			TAbstractType tType = (TAbstractType) result_pattern_LinkDefinitionToType_11_1_performtransformation_binding[8];

			Object[] result_pattern_LinkDefinitionToType_11_1_performtransformation_black = pattern_LinkDefinitionToType_11_1_performtransformation_blackBBBBBBBBBFBB(
					mTypeToTType, mDefinitionToTMember, tDefinition, mSignatureToTSignature, mDefinition, mSignature,
					tSignature, mType, tType, _this, isApplicableMatch);
			if (result_pattern_LinkDefinitionToType_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_LinkDefinitionToType_11_1_performtransformation_black[9];

				return new Object[] { mTypeToTType, mDefinitionToTMember, tDefinition, mSignatureToTSignature,
						mDefinition, mSignature, tSignature, mType, tType, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_LinkDefinitionToType_11_1_performtransformation_greenBB(
			MDefinition mDefinition, AbstractTypeDeclaration mType) {
		mType.getBodyDeclarations().add(mDefinition);
		return new Object[] { mDefinition, mType };
	}

	public static final Object[] pattern_LinkDefinitionToType_11_2_collecttranslatedelements_greenF() {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		return new Object[] { ruleresult };
	}

	public static final Object[] pattern_LinkDefinitionToType_11_3_bookkeepingforedges_blackBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject mTypeToTType, EObject mDefinitionToTMember, EObject tDefinition,
			EObject mSignatureToTSignature, EObject mDefinition, EObject mSignature, EObject tSignature, EObject mType,
			EObject tType) {
		if (!mTypeToTType.equals(tDefinition)) {
			if (!mTypeToTType.equals(tSignature)) {
				if (!mTypeToTType.equals(tType)) {
					if (!mDefinitionToTMember.equals(mTypeToTType)) {
						if (!mDefinitionToTMember.equals(tDefinition)) {
							if (!mDefinitionToTMember.equals(mSignatureToTSignature)) {
								if (!mDefinitionToTMember.equals(mSignature)) {
									if (!mDefinitionToTMember.equals(tSignature)) {
										if (!mDefinitionToTMember.equals(mType)) {
											if (!mDefinitionToTMember.equals(tType)) {
												if (!tDefinition.equals(tSignature)) {
													if (!tDefinition.equals(tType)) {
														if (!mSignatureToTSignature.equals(mTypeToTType)) {
															if (!mSignatureToTSignature.equals(tDefinition)) {
																if (!mSignatureToTSignature.equals(tSignature)) {
																	if (!mSignatureToTSignature.equals(mType)) {
																		if (!mSignatureToTSignature.equals(tType)) {
																			if (!mDefinition.equals(mTypeToTType)) {
																				if (!mDefinition
																						.equals(mDefinitionToTMember)) {
																					if (!mDefinition
																							.equals(tDefinition)) {
																						if (!mDefinition.equals(
																								mSignatureToTSignature)) {
																							if (!mDefinition.equals(
																									mSignature)) {
																								if (!mDefinition.equals(
																										tSignature)) {
																									if (!mDefinition
																											.equals(mType)) {
																										if (!mDefinition
																												.equals(tType)) {
																											if (!mSignature
																													.equals(mTypeToTType)) {
																												if (!mSignature
																														.equals(tDefinition)) {
																													if (!mSignature
																															.equals(mSignatureToTSignature)) {
																														if (!mSignature
																																.equals(tSignature)) {
																															if (!mSignature
																																	.equals(mType)) {
																																if (!mSignature
																																		.equals(tType)) {
																																	if (!tSignature
																																			.equals(tType)) {
																																		if (!mType
																																				.equals(mTypeToTType)) {
																																			if (!mType
																																					.equals(tDefinition)) {
																																				if (!mType
																																						.equals(tSignature)) {
																																					if (!mType
																																							.equals(tType)) {
																																						return new Object[] {
																																								ruleresult,
																																								mTypeToTType,
																																								mDefinitionToTMember,
																																								tDefinition,
																																								mSignatureToTSignature,
																																								mDefinition,
																																								mSignature,
																																								tSignature,
																																								mType,
																																								tType };
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

	public static final Object[] pattern_LinkDefinitionToType_11_3_bookkeepingforedges_greenBBBBBBFFFFF(
			PerformRuleResult ruleresult, EObject tDefinition, EObject mDefinition, EObject tSignature, EObject mType,
			EObject tType) {
		EMoflonEdge mType__mDefinition____bodyDeclarations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mDefinition__mType____abstractTypeDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tType__tDefinition____defines = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tDefinition__tType____definedBy = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tType__tSignature____signature = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "LinkDefinitionToType";
		String mType__mDefinition____bodyDeclarations_name_prime = "bodyDeclarations";
		String mDefinition__mType____abstractTypeDeclaration_name_prime = "abstractTypeDeclaration";
		String tType__tDefinition____defines_name_prime = "defines";
		String tDefinition__tType____definedBy_name_prime = "definedBy";
		String tType__tSignature____signature_name_prime = "signature";
		mType__mDefinition____bodyDeclarations.setSrc(mType);
		mType__mDefinition____bodyDeclarations.setTrg(mDefinition);
		ruleresult.getCreatedEdges().add(mType__mDefinition____bodyDeclarations);
		mDefinition__mType____abstractTypeDeclaration.setSrc(mDefinition);
		mDefinition__mType____abstractTypeDeclaration.setTrg(mType);
		ruleresult.getCreatedEdges().add(mDefinition__mType____abstractTypeDeclaration);
		tType__tDefinition____defines.setSrc(tType);
		tType__tDefinition____defines.setTrg(tDefinition);
		ruleresult.getTranslatedEdges().add(tType__tDefinition____defines);
		tDefinition__tType____definedBy.setSrc(tDefinition);
		tDefinition__tType____definedBy.setTrg(tType);
		ruleresult.getTranslatedEdges().add(tDefinition__tType____definedBy);
		tType__tSignature____signature.setSrc(tType);
		tType__tSignature____signature.setTrg(tSignature);
		ruleresult.getTranslatedEdges().add(tType__tSignature____signature);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		mType__mDefinition____bodyDeclarations.setName(mType__mDefinition____bodyDeclarations_name_prime);
		mDefinition__mType____abstractTypeDeclaration.setName(mDefinition__mType____abstractTypeDeclaration_name_prime);
		tType__tDefinition____defines.setName(tType__tDefinition____defines_name_prime);
		tDefinition__tType____definedBy.setName(tDefinition__tType____definedBy_name_prime);
		tType__tSignature____signature.setName(tType__tSignature____signature_name_prime);
		return new Object[] { ruleresult, tDefinition, mDefinition, tSignature, mType, tType,
				mType__mDefinition____bodyDeclarations, mDefinition__mType____abstractTypeDeclaration,
				tType__tDefinition____defines, tDefinition__tType____definedBy, tType__tSignature____signature };
	}

	public static final void pattern_LinkDefinitionToType_11_5_registerobjects_expressionBBBBBBBBBBB(
			LinkDefinitionToType _this, PerformRuleResult ruleresult, EObject mTypeToTType,
			EObject mDefinitionToTMember, EObject tDefinition, EObject mSignatureToTSignature, EObject mDefinition,
			EObject mSignature, EObject tSignature, EObject mType, EObject tType) {
		_this.registerObjects_BWD(ruleresult, mTypeToTType, mDefinitionToTMember, tDefinition, mSignatureToTSignature,
				mDefinition, mSignature, tSignature, mType, tType);

	}

	public static final PerformRuleResult pattern_LinkDefinitionToType_11_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_LinkDefinitionToType_12_1_preparereturnvalue_bindingFB(
			LinkDefinitionToType _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_LinkDefinitionToType_12_1_preparereturnvalue_blackFBB(EClass eClass,
			LinkDefinitionToType _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_LinkDefinitionToType_12_1_preparereturnvalue_bindingAndBlackFFB(
			LinkDefinitionToType _this) {
		Object[] result_pattern_LinkDefinitionToType_12_1_preparereturnvalue_binding = pattern_LinkDefinitionToType_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_LinkDefinitionToType_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_LinkDefinitionToType_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_LinkDefinitionToType_12_1_preparereturnvalue_black = pattern_LinkDefinitionToType_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_LinkDefinitionToType_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_LinkDefinitionToType_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_LinkDefinitionToType_12_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "LinkDefinitionToType";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_LinkDefinitionToType_12_2_corematch_bindingFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("tDefinition");
		EObject _localVariable_1 = match.getObject("tSignature");
		EObject _localVariable_2 = match.getObject("tType");
		EObject tmpTDefinition = _localVariable_0;
		EObject tmpTSignature = _localVariable_1;
		EObject tmpTType = _localVariable_2;
		if (tmpTDefinition instanceof TMember) {
			TMember tDefinition = (TMember) tmpTDefinition;
			if (tmpTSignature instanceof TSignature) {
				TSignature tSignature = (TSignature) tmpTSignature;
				if (tmpTType instanceof TAbstractType) {
					TAbstractType tType = (TAbstractType) tmpTType;
					return new Object[] { tDefinition, tSignature, tType, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_LinkDefinitionToType_12_2_corematch_blackFFBFFFBFBB(
			TMember tDefinition, TSignature tSignature, TAbstractType tType, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (MSignatureToTSignature mSignatureToTSignature : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tSignature, MSignatureToTSignature.class, "target")) {
			MSignature mSignature = mSignatureToTSignature.getSource();
			if (mSignature != null) {
				for (TypeToTAbstractType mTypeToTType : org.moflon.core.utilities.eMoflonEMFUtil
						.getOppositeReferenceTyped(tType, TypeToTAbstractType.class, "target")) {
					Type tmpMType = mTypeToTType.getSource();
					if (tmpMType instanceof AbstractTypeDeclaration) {
						AbstractTypeDeclaration mType = (AbstractTypeDeclaration) tmpMType;
						for (MDefinitionToTMember mDefinitionToTMember : org.moflon.core.utilities.eMoflonEMFUtil
								.getOppositeReferenceTyped(tDefinition, MDefinitionToTMember.class, "target")) {
							BodyDeclaration tmpMDefinition = mDefinitionToTMember.getSource();
							if (tmpMDefinition instanceof MDefinition) {
								MDefinition mDefinition = (MDefinition) tmpMDefinition;
								_result.add(new Object[] { mTypeToTType, mDefinitionToTMember, tDefinition,
										mSignatureToTSignature, mDefinition, mSignature, tSignature, mType, tType,
										match });
							}

						}
					}

				}
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_LinkDefinitionToType_12_3_findcontext_blackBBBBBBBBB(
			TypeToTAbstractType mTypeToTType, MDefinitionToTMember mDefinitionToTMember, TMember tDefinition,
			MSignatureToTSignature mSignatureToTSignature, MDefinition mDefinition, MSignature mSignature,
			TSignature tSignature, AbstractTypeDeclaration mType, TAbstractType tType) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (mDefinition.equals(mDefinitionToTMember.getSource())) {
			if (tSignature.equals(mSignatureToTSignature.getTarget())) {
				if (mSignature.getMDefinitions().contains(mDefinition)) {
					if (mSignature.equals(mSignatureToTSignature.getSource())) {
						if (tSignature.getDefinitions().contains(tDefinition)) {
							if (mType.equals(mTypeToTType.getSource())) {
								if (tType.equals(mTypeToTType.getTarget())) {
									if (tType.getDefines().contains(tDefinition)) {
										if (tDefinition.equals(mDefinitionToTMember.getTarget())) {
											if (tType.getSignature().contains(tSignature)) {
												_result.add(new Object[] { mTypeToTType, mDefinitionToTMember,
														tDefinition, mSignatureToTSignature, mDefinition, mSignature,
														tSignature, mType, tType });
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

	public static final Object[] pattern_LinkDefinitionToType_12_3_findcontext_greenBBBBBBBBBFFFFFFFFFFFFFF(
			TypeToTAbstractType mTypeToTType, MDefinitionToTMember mDefinitionToTMember, TMember tDefinition,
			MSignatureToTSignature mSignatureToTSignature, MDefinition mDefinition, MSignature mSignature,
			TSignature tSignature, AbstractTypeDeclaration mType, TAbstractType tType) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge mDefinitionToTMember__mDefinition____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSignatureToTSignature__tSignature____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSignature__mDefinition____mDefinitions = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mDefinition__mSignature____mSignature = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSignatureToTSignature__mSignature____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSignature__tDefinition____definitions = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tDefinition__tSignature____signature = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mTypeToTType__mType____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mTypeToTType__tType____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tType__tDefinition____defines = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tDefinition__tType____definedBy = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mDefinitionToTMember__tDefinition____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tType__tSignature____signature = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String mDefinitionToTMember__mDefinition____source_name_prime = "source";
		String mSignatureToTSignature__tSignature____target_name_prime = "target";
		String mSignature__mDefinition____mDefinitions_name_prime = "mDefinitions";
		String mDefinition__mSignature____mSignature_name_prime = "mSignature";
		String mSignatureToTSignature__mSignature____source_name_prime = "source";
		String tSignature__tDefinition____definitions_name_prime = "definitions";
		String tDefinition__tSignature____signature_name_prime = "signature";
		String mTypeToTType__mType____source_name_prime = "source";
		String mTypeToTType__tType____target_name_prime = "target";
		String tType__tDefinition____defines_name_prime = "defines";
		String tDefinition__tType____definedBy_name_prime = "definedBy";
		String mDefinitionToTMember__tDefinition____target_name_prime = "target";
		String tType__tSignature____signature_name_prime = "signature";
		isApplicableMatch.getAllContextElements().add(mTypeToTType);
		isApplicableMatch.getAllContextElements().add(mDefinitionToTMember);
		isApplicableMatch.getAllContextElements().add(tDefinition);
		isApplicableMatch.getAllContextElements().add(mSignatureToTSignature);
		isApplicableMatch.getAllContextElements().add(mDefinition);
		isApplicableMatch.getAllContextElements().add(mSignature);
		isApplicableMatch.getAllContextElements().add(tSignature);
		isApplicableMatch.getAllContextElements().add(mType);
		isApplicableMatch.getAllContextElements().add(tType);
		mDefinitionToTMember__mDefinition____source.setSrc(mDefinitionToTMember);
		mDefinitionToTMember__mDefinition____source.setTrg(mDefinition);
		isApplicableMatch.getAllContextElements().add(mDefinitionToTMember__mDefinition____source);
		mSignatureToTSignature__tSignature____target.setSrc(mSignatureToTSignature);
		mSignatureToTSignature__tSignature____target.setTrg(tSignature);
		isApplicableMatch.getAllContextElements().add(mSignatureToTSignature__tSignature____target);
		mSignature__mDefinition____mDefinitions.setSrc(mSignature);
		mSignature__mDefinition____mDefinitions.setTrg(mDefinition);
		isApplicableMatch.getAllContextElements().add(mSignature__mDefinition____mDefinitions);
		mDefinition__mSignature____mSignature.setSrc(mDefinition);
		mDefinition__mSignature____mSignature.setTrg(mSignature);
		isApplicableMatch.getAllContextElements().add(mDefinition__mSignature____mSignature);
		mSignatureToTSignature__mSignature____source.setSrc(mSignatureToTSignature);
		mSignatureToTSignature__mSignature____source.setTrg(mSignature);
		isApplicableMatch.getAllContextElements().add(mSignatureToTSignature__mSignature____source);
		tSignature__tDefinition____definitions.setSrc(tSignature);
		tSignature__tDefinition____definitions.setTrg(tDefinition);
		isApplicableMatch.getAllContextElements().add(tSignature__tDefinition____definitions);
		tDefinition__tSignature____signature.setSrc(tDefinition);
		tDefinition__tSignature____signature.setTrg(tSignature);
		isApplicableMatch.getAllContextElements().add(tDefinition__tSignature____signature);
		mTypeToTType__mType____source.setSrc(mTypeToTType);
		mTypeToTType__mType____source.setTrg(mType);
		isApplicableMatch.getAllContextElements().add(mTypeToTType__mType____source);
		mTypeToTType__tType____target.setSrc(mTypeToTType);
		mTypeToTType__tType____target.setTrg(tType);
		isApplicableMatch.getAllContextElements().add(mTypeToTType__tType____target);
		tType__tDefinition____defines.setSrc(tType);
		tType__tDefinition____defines.setTrg(tDefinition);
		isApplicableMatch.getAllContextElements().add(tType__tDefinition____defines);
		tDefinition__tType____definedBy.setSrc(tDefinition);
		tDefinition__tType____definedBy.setTrg(tType);
		isApplicableMatch.getAllContextElements().add(tDefinition__tType____definedBy);
		mDefinitionToTMember__tDefinition____target.setSrc(mDefinitionToTMember);
		mDefinitionToTMember__tDefinition____target.setTrg(tDefinition);
		isApplicableMatch.getAllContextElements().add(mDefinitionToTMember__tDefinition____target);
		tType__tSignature____signature.setSrc(tType);
		tType__tSignature____signature.setTrg(tSignature);
		isApplicableMatch.getAllContextElements().add(tType__tSignature____signature);
		mDefinitionToTMember__mDefinition____source.setName(mDefinitionToTMember__mDefinition____source_name_prime);
		mSignatureToTSignature__tSignature____target.setName(mSignatureToTSignature__tSignature____target_name_prime);
		mSignature__mDefinition____mDefinitions.setName(mSignature__mDefinition____mDefinitions_name_prime);
		mDefinition__mSignature____mSignature.setName(mDefinition__mSignature____mSignature_name_prime);
		mSignatureToTSignature__mSignature____source.setName(mSignatureToTSignature__mSignature____source_name_prime);
		tSignature__tDefinition____definitions.setName(tSignature__tDefinition____definitions_name_prime);
		tDefinition__tSignature____signature.setName(tDefinition__tSignature____signature_name_prime);
		mTypeToTType__mType____source.setName(mTypeToTType__mType____source_name_prime);
		mTypeToTType__tType____target.setName(mTypeToTType__tType____target_name_prime);
		tType__tDefinition____defines.setName(tType__tDefinition____defines_name_prime);
		tDefinition__tType____definedBy.setName(tDefinition__tType____definedBy_name_prime);
		mDefinitionToTMember__tDefinition____target.setName(mDefinitionToTMember__tDefinition____target_name_prime);
		tType__tSignature____signature.setName(tType__tSignature____signature_name_prime);
		return new Object[] { mTypeToTType, mDefinitionToTMember, tDefinition, mSignatureToTSignature, mDefinition,
				mSignature, tSignature, mType, tType, isApplicableMatch, mDefinitionToTMember__mDefinition____source,
				mSignatureToTSignature__tSignature____target, mSignature__mDefinition____mDefinitions,
				mDefinition__mSignature____mSignature, mSignatureToTSignature__mSignature____source,
				tSignature__tDefinition____definitions, tDefinition__tSignature____signature,
				mTypeToTType__mType____source, mTypeToTType__tType____target, tType__tDefinition____defines,
				tDefinition__tType____definedBy, mDefinitionToTMember__tDefinition____target,
				tType__tSignature____signature };
	}

	public static final Object[] pattern_LinkDefinitionToType_12_4_solveCSP_bindingFBBBBBBBBBBB(
			LinkDefinitionToType _this, IsApplicableMatch isApplicableMatch, TypeToTAbstractType mTypeToTType,
			MDefinitionToTMember mDefinitionToTMember, TMember tDefinition,
			MSignatureToTSignature mSignatureToTSignature, MDefinition mDefinition, MSignature mSignature,
			TSignature tSignature, AbstractTypeDeclaration mType, TAbstractType tType) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, mTypeToTType, mDefinitionToTMember,
				tDefinition, mSignatureToTSignature, mDefinition, mSignature, tSignature, mType, tType);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mTypeToTType, mDefinitionToTMember, tDefinition,
					mSignatureToTSignature, mDefinition, mSignature, tSignature, mType, tType };
		}
		return null;
	}

	public static final Object[] pattern_LinkDefinitionToType_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_LinkDefinitionToType_12_4_solveCSP_bindingAndBlackFBBBBBBBBBBB(
			LinkDefinitionToType _this, IsApplicableMatch isApplicableMatch, TypeToTAbstractType mTypeToTType,
			MDefinitionToTMember mDefinitionToTMember, TMember tDefinition,
			MSignatureToTSignature mSignatureToTSignature, MDefinition mDefinition, MSignature mSignature,
			TSignature tSignature, AbstractTypeDeclaration mType, TAbstractType tType) {
		Object[] result_pattern_LinkDefinitionToType_12_4_solveCSP_binding = pattern_LinkDefinitionToType_12_4_solveCSP_bindingFBBBBBBBBBBB(
				_this, isApplicableMatch, mTypeToTType, mDefinitionToTMember, tDefinition, mSignatureToTSignature,
				mDefinition, mSignature, tSignature, mType, tType);
		if (result_pattern_LinkDefinitionToType_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_LinkDefinitionToType_12_4_solveCSP_binding[0];

			Object[] result_pattern_LinkDefinitionToType_12_4_solveCSP_black = pattern_LinkDefinitionToType_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_LinkDefinitionToType_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mTypeToTType, mDefinitionToTMember, tDefinition,
						mSignatureToTSignature, mDefinition, mSignature, tSignature, mType, tType };
			}
		}
		return null;
	}

	public static final boolean pattern_LinkDefinitionToType_12_5_checkCSP_expressionFBB(LinkDefinitionToType _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_LinkDefinitionToType_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_LinkDefinitionToType_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "LinkDefinitionToType";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_LinkDefinitionToType_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_LinkDefinitionToType_20_1_preparereturnvalue_bindingFB(
			LinkDefinitionToType _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_LinkDefinitionToType_20_1_preparereturnvalue_blackFBBF(EClass __eClass,
			LinkDefinitionToType _this) {
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

	public static final Object[] pattern_LinkDefinitionToType_20_1_preparereturnvalue_bindingAndBlackFFBF(
			LinkDefinitionToType _this) {
		Object[] result_pattern_LinkDefinitionToType_20_1_preparereturnvalue_binding = pattern_LinkDefinitionToType_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_LinkDefinitionToType_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_LinkDefinitionToType_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_LinkDefinitionToType_20_1_preparereturnvalue_black = pattern_LinkDefinitionToType_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_LinkDefinitionToType_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_LinkDefinitionToType_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_LinkDefinitionToType_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_LinkDefinitionToType_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_LinkDefinitionToType_20_2_testcorematchandDECs_blackFFFB(
			EMoflonEdge _edge_defines) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpTType = _edge_defines.getSrc();
		if (tmpTType instanceof TAbstractType) {
			TAbstractType tType = (TAbstractType) tmpTType;
			EObject tmpTDefinition = _edge_defines.getTrg();
			if (tmpTDefinition instanceof TMember) {
				TMember tDefinition = (TMember) tmpTDefinition;
				if (tType.getDefines().contains(tDefinition)) {
					TSignature tSignature = tDefinition.getSignature();
					if (tSignature != null) {
						if (tType.getSignature().contains(tSignature)) {
							_result.add(new Object[] { tDefinition, tSignature, tType, _edge_defines });
						}
					}

				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_LinkDefinitionToType_20_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_LinkDefinitionToType_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
			LinkDefinitionToType _this, Match match, TMember tDefinition, TSignature tSignature, TAbstractType tType) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, tDefinition, tSignature, tType);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_LinkDefinitionToType_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			LinkDefinitionToType _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_LinkDefinitionToType_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_LinkDefinitionToType_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_LinkDefinitionToType_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_LinkDefinitionToType_21_1_preparereturnvalue_bindingFB(
			LinkDefinitionToType _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_LinkDefinitionToType_21_1_preparereturnvalue_blackFBBF(EClass __eClass,
			LinkDefinitionToType _this) {
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

	public static final Object[] pattern_LinkDefinitionToType_21_1_preparereturnvalue_bindingAndBlackFFBF(
			LinkDefinitionToType _this) {
		Object[] result_pattern_LinkDefinitionToType_21_1_preparereturnvalue_binding = pattern_LinkDefinitionToType_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_LinkDefinitionToType_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_LinkDefinitionToType_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_LinkDefinitionToType_21_1_preparereturnvalue_black = pattern_LinkDefinitionToType_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_LinkDefinitionToType_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_LinkDefinitionToType_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_LinkDefinitionToType_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_LinkDefinitionToType_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_LinkDefinitionToType_21_2_testcorematchandDECs_blackFFFB(
			EMoflonEdge _edge_bodyDeclarations) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpMType = _edge_bodyDeclarations.getSrc();
		if (tmpMType instanceof AbstractTypeDeclaration) {
			AbstractTypeDeclaration mType = (AbstractTypeDeclaration) tmpMType;
			EObject tmpMDefinition = _edge_bodyDeclarations.getTrg();
			if (tmpMDefinition instanceof MDefinition) {
				MDefinition mDefinition = (MDefinition) tmpMDefinition;
				if (mType.getBodyDeclarations().contains(mDefinition)) {
					MSignature mSignature = mDefinition.getMSignature();
					if (mSignature != null) {
						_result.add(new Object[] { mDefinition, mSignature, mType, _edge_bodyDeclarations });
					}

				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_LinkDefinitionToType_21_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_LinkDefinitionToType_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
			LinkDefinitionToType _this, Match match, MDefinition mDefinition, MSignature mSignature,
			AbstractTypeDeclaration mType) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, mDefinition, mSignature, mType);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_LinkDefinitionToType_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			LinkDefinitionToType _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_LinkDefinitionToType_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_LinkDefinitionToType_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_LinkDefinitionToType_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_LinkDefinitionToType_24_1_prepare_blackB(LinkDefinitionToType _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_LinkDefinitionToType_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_LinkDefinitionToType_24_2_matchsrctrgcontext_bindingFFFFFFBB(Match targetMatch,
			Match sourceMatch) {
		EObject _localVariable_0 = targetMatch.getObject("tDefinition");
		EObject _localVariable_1 = sourceMatch.getObject("mDefinition");
		EObject _localVariable_2 = sourceMatch.getObject("mSignature");
		EObject _localVariable_3 = targetMatch.getObject("tSignature");
		EObject _localVariable_4 = sourceMatch.getObject("mType");
		EObject _localVariable_5 = targetMatch.getObject("tType");
		EObject tmpTDefinition = _localVariable_0;
		EObject tmpMDefinition = _localVariable_1;
		EObject tmpMSignature = _localVariable_2;
		EObject tmpTSignature = _localVariable_3;
		EObject tmpMType = _localVariable_4;
		EObject tmpTType = _localVariable_5;
		if (tmpTDefinition instanceof TMember) {
			TMember tDefinition = (TMember) tmpTDefinition;
			if (tmpMDefinition instanceof MDefinition) {
				MDefinition mDefinition = (MDefinition) tmpMDefinition;
				if (tmpMSignature instanceof MSignature) {
					MSignature mSignature = (MSignature) tmpMSignature;
					if (tmpTSignature instanceof TSignature) {
						TSignature tSignature = (TSignature) tmpTSignature;
						if (tmpMType instanceof AbstractTypeDeclaration) {
							AbstractTypeDeclaration mType = (AbstractTypeDeclaration) tmpMType;
							if (tmpTType instanceof TAbstractType) {
								TAbstractType tType = (TAbstractType) tmpTType;
								return new Object[] { tDefinition, mDefinition, mSignature, tSignature, mType, tType,
										targetMatch, sourceMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_LinkDefinitionToType_24_2_matchsrctrgcontext_blackBBBBBBBB(TMember tDefinition,
			MDefinition mDefinition, MSignature mSignature, TSignature tSignature, AbstractTypeDeclaration mType,
			TAbstractType tType, Match sourceMatch, Match targetMatch) {
		if (!sourceMatch.equals(targetMatch)) {
			return new Object[] { tDefinition, mDefinition, mSignature, tSignature, mType, tType, sourceMatch,
					targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_LinkDefinitionToType_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_LinkDefinitionToType_24_2_matchsrctrgcontext_binding = pattern_LinkDefinitionToType_24_2_matchsrctrgcontext_bindingFFFFFFBB(
				targetMatch, sourceMatch);
		if (result_pattern_LinkDefinitionToType_24_2_matchsrctrgcontext_binding != null) {
			TMember tDefinition = (TMember) result_pattern_LinkDefinitionToType_24_2_matchsrctrgcontext_binding[0];
			MDefinition mDefinition = (MDefinition) result_pattern_LinkDefinitionToType_24_2_matchsrctrgcontext_binding[1];
			MSignature mSignature = (MSignature) result_pattern_LinkDefinitionToType_24_2_matchsrctrgcontext_binding[2];
			TSignature tSignature = (TSignature) result_pattern_LinkDefinitionToType_24_2_matchsrctrgcontext_binding[3];
			AbstractTypeDeclaration mType = (AbstractTypeDeclaration) result_pattern_LinkDefinitionToType_24_2_matchsrctrgcontext_binding[4];
			TAbstractType tType = (TAbstractType) result_pattern_LinkDefinitionToType_24_2_matchsrctrgcontext_binding[5];

			Object[] result_pattern_LinkDefinitionToType_24_2_matchsrctrgcontext_black = pattern_LinkDefinitionToType_24_2_matchsrctrgcontext_blackBBBBBBBB(
					tDefinition, mDefinition, mSignature, tSignature, mType, tType, sourceMatch, targetMatch);
			if (result_pattern_LinkDefinitionToType_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { tDefinition, mDefinition, mSignature, tSignature, mType, tType, sourceMatch,
						targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_LinkDefinitionToType_24_3_solvecsp_bindingFBBBBBBBBB(
			LinkDefinitionToType _this, TMember tDefinition, MDefinition mDefinition, MSignature mSignature,
			TSignature tSignature, AbstractTypeDeclaration mType, TAbstractType tType, Match sourceMatch,
			Match targetMatch) {
		CSP _localVariable_6 = _this.isApplicable_solveCsp_CC(tDefinition, mDefinition, mSignature, tSignature, mType,
				tType, sourceMatch, targetMatch);
		CSP csp = _localVariable_6;
		if (csp != null) {
			return new Object[] { csp, _this, tDefinition, mDefinition, mSignature, tSignature, mType, tType,
					sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_LinkDefinitionToType_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_LinkDefinitionToType_24_3_solvecsp_bindingAndBlackFBBBBBBBBB(
			LinkDefinitionToType _this, TMember tDefinition, MDefinition mDefinition, MSignature mSignature,
			TSignature tSignature, AbstractTypeDeclaration mType, TAbstractType tType, Match sourceMatch,
			Match targetMatch) {
		Object[] result_pattern_LinkDefinitionToType_24_3_solvecsp_binding = pattern_LinkDefinitionToType_24_3_solvecsp_bindingFBBBBBBBBB(
				_this, tDefinition, mDefinition, mSignature, tSignature, mType, tType, sourceMatch, targetMatch);
		if (result_pattern_LinkDefinitionToType_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_LinkDefinitionToType_24_3_solvecsp_binding[0];

			Object[] result_pattern_LinkDefinitionToType_24_3_solvecsp_black = pattern_LinkDefinitionToType_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_LinkDefinitionToType_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, tDefinition, mDefinition, mSignature, tSignature, mType, tType,
						sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_LinkDefinitionToType_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_LinkDefinitionToType_24_5_matchcorrcontext_blackFFBFBBBBBBB(
			TMember tDefinition, MDefinition mDefinition, MSignature mSignature, TSignature tSignature,
			AbstractTypeDeclaration mType, TAbstractType tType, Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (MDefinitionToTMember mDefinitionToTMember : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(mDefinition, MDefinitionToTMember.class, "source")) {
				if (tDefinition.equals(mDefinitionToTMember.getTarget())) {
					for (MSignatureToTSignature mSignatureToTSignature : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(tSignature, MSignatureToTSignature.class, "target")) {
						if (mSignature.equals(mSignatureToTSignature.getSource())) {
							for (TypeToTAbstractType mTypeToTType : org.moflon.core.utilities.eMoflonEMFUtil
									.getOppositeReferenceTyped(mType, TypeToTAbstractType.class, "source")) {
								if (tType.equals(mTypeToTType.getTarget())) {
									_result.add(new Object[] { mTypeToTType, mDefinitionToTMember, tDefinition,
											mSignatureToTSignature, mDefinition, mSignature, tSignature, mType, tType,
											sourceMatch, targetMatch });
								}
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_LinkDefinitionToType_24_5_matchcorrcontext_greenBBBBBF(
			TypeToTAbstractType mTypeToTType, MDefinitionToTMember mDefinitionToTMember,
			MSignatureToTSignature mSignatureToTSignature, Match sourceMatch, Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "LinkDefinitionToType";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(mTypeToTType);
		ccMatch.getAllContextElements().add(mDefinitionToTMember);
		ccMatch.getAllContextElements().add(mSignatureToTSignature);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { mTypeToTType, mDefinitionToTMember, mSignatureToTSignature, sourceMatch, targetMatch,
				ccMatch };
	}

	public static final Object[] pattern_LinkDefinitionToType_24_6_createcorrespondence_blackBBBBBBB(
			TMember tDefinition, MDefinition mDefinition, MSignature mSignature, TSignature tSignature,
			AbstractTypeDeclaration mType, TAbstractType tType, CCMatch ccMatch) {
		return new Object[] { tDefinition, mDefinition, mSignature, tSignature, mType, tType, ccMatch };
	}

	public static final Object[] pattern_LinkDefinitionToType_24_7_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_LinkDefinitionToType_24_7_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "LinkDefinitionToType";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_LinkDefinitionToType_24_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_LinkDefinitionToType_27_1_matchtggpattern_blackBBB(MDefinition mDefinition,
			MSignature mSignature, AbstractTypeDeclaration mType) {
		if (mSignature.getMDefinitions().contains(mDefinition)) {
			if (mType.getBodyDeclarations().contains(mDefinition)) {
				return new Object[] { mDefinition, mSignature, mType };
			}
		}
		return null;
	}

	public static final boolean pattern_LinkDefinitionToType_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_LinkDefinitionToType_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_LinkDefinitionToType_28_1_matchtggpattern_blackBBB(TMember tDefinition,
			TSignature tSignature, TAbstractType tType) {
		if (tSignature.getDefinitions().contains(tDefinition)) {
			if (tType.getDefines().contains(tDefinition)) {
				if (tType.getSignature().contains(tSignature)) {
					return new Object[] { tDefinition, tSignature, tType };
				}
			}
		}
		return null;
	}

	public static final boolean pattern_LinkDefinitionToType_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_LinkDefinitionToType_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_LinkDefinitionToType_29_1_createresult_blackB(LinkDefinitionToType _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_LinkDefinitionToType_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_LinkDefinitionToType_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, TypeToTAbstractType mTypeToTType) {
		if (ruleResult.getCorrObjects().contains(mTypeToTType)) {
			return new Object[] { ruleResult, mTypeToTType };
		}
		return null;
	}

	public static final Object[] pattern_LinkDefinitionToType_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, AbstractTypeDeclaration mType) {
		if (ruleResult.getSourceObjects().contains(mType)) {
			return new Object[] { ruleResult, mType };
		}
		return null;
	}

	public static final Object[] pattern_LinkDefinitionToType_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, TAbstractType tType) {
		if (ruleResult.getTargetObjects().contains(tType)) {
			return new Object[] { ruleResult, tType };
		}
		return null;
	}

	public static final Object[] pattern_LinkDefinitionToType_29_2_isapplicablecore_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, MDefinitionToTMember mDefinitionToTMember) {
		if (ruleResult.getCorrObjects().contains(mDefinitionToTMember)) {
			return new Object[] { ruleResult, mDefinitionToTMember };
		}
		return null;
	}

	public static final Object[] pattern_LinkDefinitionToType_29_2_isapplicablecore_black_nac_4BB(
			ModelgeneratorRuleResult ruleResult, MDefinition mDefinition) {
		if (ruleResult.getSourceObjects().contains(mDefinition)) {
			return new Object[] { ruleResult, mDefinition };
		}
		return null;
	}

	public static final Object[] pattern_LinkDefinitionToType_29_2_isapplicablecore_black_nac_5BB(
			ModelgeneratorRuleResult ruleResult, MSignature mSignature) {
		if (ruleResult.getSourceObjects().contains(mSignature)) {
			return new Object[] { ruleResult, mSignature };
		}
		return null;
	}

	public static final Object[] pattern_LinkDefinitionToType_29_2_isapplicablecore_black_nac_6BB(
			ModelgeneratorRuleResult ruleResult, MSignatureToTSignature mSignatureToTSignature) {
		if (ruleResult.getCorrObjects().contains(mSignatureToTSignature)) {
			return new Object[] { ruleResult, mSignatureToTSignature };
		}
		return null;
	}

	public static final Object[] pattern_LinkDefinitionToType_29_2_isapplicablecore_black_nac_7BB(
			ModelgeneratorRuleResult ruleResult, TSignature tSignature) {
		if (ruleResult.getTargetObjects().contains(tSignature)) {
			return new Object[] { ruleResult, tSignature };
		}
		return null;
	}

	public static final Object[] pattern_LinkDefinitionToType_29_2_isapplicablecore_black_nac_8BB(
			ModelgeneratorRuleResult ruleResult, TMember tDefinition) {
		if (ruleResult.getTargetObjects().contains(tDefinition)) {
			return new Object[] { ruleResult, tDefinition };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_LinkDefinitionToType_29_2_isapplicablecore_blackFFFFFFFFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList mTypeToTTypeList : ruleEntryContainer.getRuleEntryList()) {
			for (RuleEntryList mDefinitionToTMemberList : ruleEntryContainer.getRuleEntryList()) {
				if (!mDefinitionToTMemberList.equals(mTypeToTTypeList)) {
					for (EObject tmpMTypeToTType : mTypeToTTypeList.getEntryObjects()) {
						if (tmpMTypeToTType instanceof TypeToTAbstractType) {
							TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) tmpMTypeToTType;
							Type tmpMType = mTypeToTType.getSource();
							if (tmpMType instanceof AbstractTypeDeclaration) {
								AbstractTypeDeclaration mType = (AbstractTypeDeclaration) tmpMType;
								TAbstractType tType = mTypeToTType.getTarget();
								if (tType != null) {
									if (pattern_LinkDefinitionToType_29_2_isapplicablecore_black_nac_0BB(ruleResult,
											mTypeToTType) == null) {
										if (pattern_LinkDefinitionToType_29_2_isapplicablecore_black_nac_1BB(ruleResult,
												mType) == null) {
											if (pattern_LinkDefinitionToType_29_2_isapplicablecore_black_nac_2BB(
													ruleResult, tType) == null) {
												for (EObject tmpMDefinitionToTMember : mDefinitionToTMemberList
														.getEntryObjects()) {
													if (tmpMDefinitionToTMember instanceof MDefinitionToTMember) {
														MDefinitionToTMember mDefinitionToTMember = (MDefinitionToTMember) tmpMDefinitionToTMember;
														BodyDeclaration tmpMDefinition = mDefinitionToTMember
																.getSource();
														if (tmpMDefinition instanceof MDefinition) {
															MDefinition mDefinition = (MDefinition) tmpMDefinition;
															TMember tDefinition = mDefinitionToTMember.getTarget();
															if (tDefinition != null) {
																MSignature mSignature = mDefinition.getMSignature();
																if (mSignature != null) {
																	TSignature tSignature = tDefinition.getSignature();
																	if (tSignature != null) {
																		if (pattern_LinkDefinitionToType_29_2_isapplicablecore_black_nac_3BB(
																				ruleResult,
																				mDefinitionToTMember) == null) {
																			if (pattern_LinkDefinitionToType_29_2_isapplicablecore_black_nac_4BB(
																					ruleResult, mDefinition) == null) {
																				if (pattern_LinkDefinitionToType_29_2_isapplicablecore_black_nac_8BB(
																						ruleResult,
																						tDefinition) == null) {
																					if (pattern_LinkDefinitionToType_29_2_isapplicablecore_black_nac_5BB(
																							ruleResult,
																							mSignature) == null) {
																						if (pattern_LinkDefinitionToType_29_2_isapplicablecore_black_nac_7BB(
																								ruleResult,
																								tSignature) == null) {
																							for (MSignatureToTSignature mSignatureToTSignature : org.moflon.core.utilities.eMoflonEMFUtil
																									.getOppositeReferenceTyped(
																											mSignature,
																											MSignatureToTSignature.class,
																											"source")) {
																								if (tSignature.equals(
																										mSignatureToTSignature
																												.getTarget())) {
																									if (pattern_LinkDefinitionToType_29_2_isapplicablecore_black_nac_6BB(
																											ruleResult,
																											mSignatureToTSignature) == null) {
																										_result.add(
																												new Object[] {
																														mTypeToTTypeList,
																														mTypeToTType,
																														mType,
																														tType,
																														mDefinitionToTMemberList,
																														mDefinitionToTMember,
																														mDefinition,
																														mSignature,
																														mSignatureToTSignature,
																														tSignature,
																														tDefinition,
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
		return _result;
	}

	public static final Object[] pattern_LinkDefinitionToType_29_3_solveCSP_bindingFBBBBBBBBBBBB(
			LinkDefinitionToType _this, IsApplicableMatch isApplicableMatch, TypeToTAbstractType mTypeToTType,
			MDefinitionToTMember mDefinitionToTMember, TMember tDefinition,
			MSignatureToTSignature mSignatureToTSignature, MDefinition mDefinition, MSignature mSignature,
			TSignature tSignature, AbstractTypeDeclaration mType, TAbstractType tType,
			ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, mTypeToTType, mDefinitionToTMember,
				tDefinition, mSignatureToTSignature, mDefinition, mSignature, tSignature, mType, tType, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mTypeToTType, mDefinitionToTMember, tDefinition,
					mSignatureToTSignature, mDefinition, mSignature, tSignature, mType, tType, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_LinkDefinitionToType_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_LinkDefinitionToType_29_3_solveCSP_bindingAndBlackFBBBBBBBBBBBB(
			LinkDefinitionToType _this, IsApplicableMatch isApplicableMatch, TypeToTAbstractType mTypeToTType,
			MDefinitionToTMember mDefinitionToTMember, TMember tDefinition,
			MSignatureToTSignature mSignatureToTSignature, MDefinition mDefinition, MSignature mSignature,
			TSignature tSignature, AbstractTypeDeclaration mType, TAbstractType tType,
			ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_LinkDefinitionToType_29_3_solveCSP_binding = pattern_LinkDefinitionToType_29_3_solveCSP_bindingFBBBBBBBBBBBB(
				_this, isApplicableMatch, mTypeToTType, mDefinitionToTMember, tDefinition, mSignatureToTSignature,
				mDefinition, mSignature, tSignature, mType, tType, ruleResult);
		if (result_pattern_LinkDefinitionToType_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_LinkDefinitionToType_29_3_solveCSP_binding[0];

			Object[] result_pattern_LinkDefinitionToType_29_3_solveCSP_black = pattern_LinkDefinitionToType_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_LinkDefinitionToType_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mTypeToTType, mDefinitionToTMember, tDefinition,
						mSignatureToTSignature, mDefinition, mSignature, tSignature, mType, tType, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_LinkDefinitionToType_29_4_checkCSP_expressionFBB(LinkDefinitionToType _this,
			CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_LinkDefinitionToType_29_5_checknacs_blackBBBBBBBBB(
			TypeToTAbstractType mTypeToTType, MDefinitionToTMember mDefinitionToTMember, TMember tDefinition,
			MSignatureToTSignature mSignatureToTSignature, MDefinition mDefinition, MSignature mSignature,
			TSignature tSignature, AbstractTypeDeclaration mType, TAbstractType tType) {
		return new Object[] { mTypeToTType, mDefinitionToTMember, tDefinition, mSignatureToTSignature, mDefinition,
				mSignature, tSignature, mType, tType };
	}

	public static final Object[] pattern_LinkDefinitionToType_29_6_perform_blackBBBBBBBBBB(
			TypeToTAbstractType mTypeToTType, MDefinitionToTMember mDefinitionToTMember, TMember tDefinition,
			MSignatureToTSignature mSignatureToTSignature, MDefinition mDefinition, MSignature mSignature,
			TSignature tSignature, AbstractTypeDeclaration mType, TAbstractType tType,
			ModelgeneratorRuleResult ruleResult) {
		return new Object[] { mTypeToTType, mDefinitionToTMember, tDefinition, mSignatureToTSignature, mDefinition,
				mSignature, tSignature, mType, tType, ruleResult };
	}

	public static final Object[] pattern_LinkDefinitionToType_29_6_perform_greenBBBBBB(TMember tDefinition,
			MDefinition mDefinition, TSignature tSignature, AbstractTypeDeclaration mType, TAbstractType tType,
			ModelgeneratorRuleResult ruleResult) {
		mType.getBodyDeclarations().add(mDefinition);
		tType.getDefines().add(tDefinition);
		tType.getSignature().add(tSignature);
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { tDefinition, mDefinition, tSignature, mType, tType, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_LinkDefinitionToType_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //LinkDefinitionToTypeImpl
