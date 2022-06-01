/**
 */
package org.gravity.tgg.modisco.pm.Rules.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.LinkedList;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;

import org.eclipse.modisco.java.Type;

import org.gravity.modisco.MMethodName;
import org.gravity.modisco.MMethodSignature;
import org.gravity.modisco.ModiscoFactory;

import org.gravity.tgg.modisco.pm.MAbstractFlowElementToTAbstractFlowElement;
import org.gravity.tgg.modisco.pm.MMethodNameToTMethod;
import org.gravity.tgg.modisco.pm.MSignatureToTSignature;
import org.gravity.tgg.modisco.pm.PmFactory;

import org.gravity.tgg.modisco.pm.Rules.MethodSignature;
import org.gravity.tgg.modisco.pm.Rules.RulesPackage;

import org.gravity.tgg.modisco.pm.TypeToTAbstractType;

import org.gravity.typegraph.basic.BasicFactory;
import org.gravity.typegraph.basic.TAbstractType;
import org.gravity.typegraph.basic.TMethod;
import org.gravity.typegraph.basic.TMethodSignature;

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
 * An implementation of the model object '<em><b>Method Signature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class MethodSignatureImpl extends AbstractRuleImpl implements MethodSignature {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MethodSignatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getMethodSignature();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, Type mType, MMethodName mName, MMethodSignature mSignature) {

		Object[] result1_black = MethodSignatureImpl.pattern_MethodSignature_0_1_initialbindings_blackBBBBB(this, match,
				mType, mName, mSignature);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[mType] = " + mType + ", " + "[mName] = " + mName + ", "
					+ "[mSignature] = " + mSignature + ".");
		}

		Object[] result2_bindingAndBlack = MethodSignatureImpl
				.pattern_MethodSignature_0_2_SolveCSP_bindingAndBlackFBBBBB(this, match, mType, mName, mSignature);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[mType] = " + mType + ", " + "[mName] = " + mName + ", "
					+ "[mSignature] = " + mSignature + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (MethodSignatureImpl.pattern_MethodSignature_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = MethodSignatureImpl
					.pattern_MethodSignature_0_4_collectelementstobetranslated_blackBBBB(match, mType, mName,
							mSignature);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching failed." + " Variables: " + "[match] = " + match + ", " + "[mType] = " + mType
								+ ", " + "[mName] = " + mName + ", " + "[mSignature] = " + mSignature + ".");
			}
			MethodSignatureImpl.pattern_MethodSignature_0_4_collectelementstobetranslated_greenBBBBFF(match, mType,
					mName, mSignature);
			//nothing EMoflonEdge mName__mSignature____mSignatures = (EMoflonEdge) result4_green[4];
			//nothing EMoflonEdge mSignature__mType____returnType = (EMoflonEdge) result4_green[5];

			Object[] result5_black = MethodSignatureImpl
					.pattern_MethodSignature_0_5_collectcontextelements_blackBBBB(match, mType, mName, mSignature);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching failed." + " Variables: " + "[match] = " + match + ", " + "[mType] = " + mType
								+ ", " + "[mName] = " + mName + ", " + "[mSignature] = " + mSignature + ".");
			}
			MethodSignatureImpl.pattern_MethodSignature_0_5_collectcontextelements_greenBBB(match, mType, mName);

			// 
			MethodSignatureImpl.pattern_MethodSignature_0_6_registerobjectstomatch_expressionBBBBB(this, match, mType,
					mName, mSignature);
			return MethodSignatureImpl.pattern_MethodSignature_0_7_expressionF();
		} else {
			return MethodSignatureImpl.pattern_MethodSignature_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = MethodSignatureImpl
				.pattern_MethodSignature_1_1_performtransformation_bindingAndBlackFFFFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		Type mType = (Type) result1_bindingAndBlack[0];
		TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result1_bindingAndBlack[1];
		TMethod tName = (TMethod) result1_bindingAndBlack[2];
		MMethodName mName = (MMethodName) result1_bindingAndBlack[3];
		TAbstractType tAbstractType = (TAbstractType) result1_bindingAndBlack[4];
		MMethodSignature mSignature = (MMethodSignature) result1_bindingAndBlack[5];
		MMethodNameToTMethod mNameToTName = (MMethodNameToTMethod) result1_bindingAndBlack[6];
		CSP csp = (CSP) result1_bindingAndBlack[7];
		Object[] result1_green = MethodSignatureImpl
				.pattern_MethodSignature_1_1_performtransformation_greenFFBFBBB(tName, tAbstractType, mSignature, csp);
		TMethodSignature tSignature = (TMethodSignature) result1_green[0];
		MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement = (MAbstractFlowElementToTAbstractFlowElement) result1_green[1];
		MSignatureToTSignature mSignatureToTSignature = (MSignatureToTSignature) result1_green[3];

		Object[] result2_black = MethodSignatureImpl.pattern_MethodSignature_1_2_collecttranslatedelements_blackBBBB(
				tSignature, mFlowElementToTFlowElement, mSignatureToTSignature, mSignature);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[tSignature] = " + tSignature
					+ ", " + "[mFlowElementToTFlowElement] = " + mFlowElementToTFlowElement + ", "
					+ "[mSignatureToTSignature] = " + mSignatureToTSignature + ", " + "[mSignature] = " + mSignature
					+ ".");
		}
		Object[] result2_green = MethodSignatureImpl.pattern_MethodSignature_1_2_collecttranslatedelements_greenFBBBB(
				tSignature, mFlowElementToTFlowElement, mSignatureToTSignature, mSignature);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = MethodSignatureImpl.pattern_MethodSignature_1_3_bookkeepingforedges_blackBBBBBBBBBBB(
				ruleresult, mType, tSignature, mFlowElementToTFlowElement, mTypeToTType, tName, mSignatureToTSignature,
				mName, tAbstractType, mSignature, mNameToTName);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[mType] = " + mType + ", " + "[tSignature] = " + tSignature + ", "
					+ "[mFlowElementToTFlowElement] = " + mFlowElementToTFlowElement + ", " + "[mTypeToTType] = "
					+ mTypeToTType + ", " + "[tName] = " + tName + ", " + "[mSignatureToTSignature] = "
					+ mSignatureToTSignature + ", " + "[mName] = " + mName + ", " + "[tAbstractType] = " + tAbstractType
					+ ", " + "[mSignature] = " + mSignature + ", " + "[mNameToTName] = " + mNameToTName + ".");
		}
		MethodSignatureImpl.pattern_MethodSignature_1_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFFF(ruleresult, mType,
				tSignature, mFlowElementToTFlowElement, tName, mSignatureToTSignature, mName, tAbstractType,
				mSignature);
		//nothing EMoflonEdge tSignature__tAbstractType____returnType = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge mName__mSignature____mSignatures = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge mSignatureToTSignature__tSignature____target = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge mFlowElementToTFlowElement__tSignature____target = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge mFlowElementToTFlowElement__mSignature____source = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge mSignatureToTSignature__mSignature____source = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge tName__tSignature____signatures = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge tSignature__tName____method = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge mSignature__mType____returnType = (EMoflonEdge) result3_green[17];

		// 
		// 
		MethodSignatureImpl.pattern_MethodSignature_1_5_registerobjects_expressionBBBBBBBBBBBB(this, ruleresult, mType,
				tSignature, mFlowElementToTFlowElement, mTypeToTType, tName, mSignatureToTSignature, mName,
				tAbstractType, mSignature, mNameToTName);
		return MethodSignatureImpl.pattern_MethodSignature_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = MethodSignatureImpl
				.pattern_MethodSignature_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = MethodSignatureImpl
				.pattern_MethodSignature_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = MethodSignatureImpl.pattern_MethodSignature_2_2_corematch_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		Type mType = (Type) result2_binding[0];
		MMethodName mName = (MMethodName) result2_binding[1];
		MMethodSignature mSignature = (MMethodSignature) result2_binding[2];
		for (Object[] result2_black : MethodSignatureImpl.pattern_MethodSignature_2_2_corematch_blackBFFBFBFB(mType,
				mName, mSignature, match)) {
			TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result2_black[1];
			TMethod tName = (TMethod) result2_black[2];
			TAbstractType tAbstractType = (TAbstractType) result2_black[4];
			MMethodNameToTMethod mNameToTName = (MMethodNameToTMethod) result2_black[6];
			// ForEach 
			for (Object[] result3_black : MethodSignatureImpl.pattern_MethodSignature_2_3_findcontext_blackBBBBBBB(
					mType, mTypeToTType, tName, mName, tAbstractType, mSignature, mNameToTName)) {
				Object[] result3_green = MethodSignatureImpl
						.pattern_MethodSignature_2_3_findcontext_greenBBBBBBBFFFFFFF(mType, mTypeToTType, tName, mName,
								tAbstractType, mSignature, mNameToTName);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[7];
				//nothing EMoflonEdge mTypeToTType__mType____source = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge mName__mSignature____mSignatures = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge mTypeToTType__tAbstractType____target = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge mNameToTName__mName____source = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge mNameToTName__tName____target = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge mSignature__mType____returnType = (EMoflonEdge) result3_green[13];

				Object[] result4_bindingAndBlack = MethodSignatureImpl
						.pattern_MethodSignature_2_4_solveCSP_bindingAndBlackFBBBBBBBBB(this, isApplicableMatch, mType,
								mTypeToTType, tName, mName, tAbstractType, mSignature, mNameToTName);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[mType] = " + mType + ", "
							+ "[mTypeToTType] = " + mTypeToTType + ", " + "[tName] = " + tName + ", " + "[mName] = "
							+ mName + ", " + "[tAbstractType] = " + tAbstractType + ", " + "[mSignature] = "
							+ mSignature + ", " + "[mNameToTName] = " + mNameToTName + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (MethodSignatureImpl.pattern_MethodSignature_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = MethodSignatureImpl
							.pattern_MethodSignature_2_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					MethodSignatureImpl.pattern_MethodSignature_2_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return MethodSignatureImpl.pattern_MethodSignature_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, Type mType, MMethodName mName, MMethodSignature mSignature) {
		match.registerObject("mType", mType);
		match.registerObject("mName", mName);
		match.registerObject("mSignature", mSignature);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, Type mType, MMethodName mName, MMethodSignature mSignature) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, Type mType,
			TypeToTAbstractType mTypeToTType, TMethod tName, MMethodName mName, TAbstractType tAbstractType,
			MMethodSignature mSignature, MMethodNameToTMethod mNameToTName) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_mType_name = CSPFactoryHelper.eINSTANCE.createVariable("mType.name", true, csp);
		var_mType_name.setValue(mType.getName());
		var_mType_name.setType("String");

		// Create unbound variables
		Variable var_tSignature_upperBound = CSPFactoryHelper.eINSTANCE.createVariable("tSignature.upperBound", csp);
		var_tSignature_upperBound.setType("int");

		// Create constraints
		UpperBound upperBound = new UpperBound();

		csp.getConstraints().add(upperBound);

		// Solve CSP
		upperBound.setRuleName("NoRuleName");
		upperBound.solve(var_mType_name, var_tSignature_upperBound);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("mType", mType);
		isApplicableMatch.registerObject("mTypeToTType", mTypeToTType);
		isApplicableMatch.registerObject("tName", tName);
		isApplicableMatch.registerObject("mName", mName);
		isApplicableMatch.registerObject("tAbstractType", tAbstractType);
		isApplicableMatch.registerObject("mSignature", mSignature);
		isApplicableMatch.registerObject("mNameToTName", mNameToTName);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject mType, EObject tSignature,
			EObject mFlowElementToTFlowElement, EObject mTypeToTType, EObject tName, EObject mSignatureToTSignature,
			EObject mName, EObject tAbstractType, EObject mSignature, EObject mNameToTName) {
		ruleresult.registerObject("mType", mType);
		ruleresult.registerObject("tSignature", tSignature);
		ruleresult.registerObject("mFlowElementToTFlowElement", mFlowElementToTFlowElement);
		ruleresult.registerObject("mTypeToTType", mTypeToTType);
		ruleresult.registerObject("tName", tName);
		ruleresult.registerObject("mSignatureToTSignature", mSignatureToTSignature);
		ruleresult.registerObject("mName", mName);
		ruleresult.registerObject("tAbstractType", tAbstractType);
		ruleresult.registerObject("mSignature", mSignature);
		ruleresult.registerObject("mNameToTName", mNameToTName);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("mSignature").eClass())
				.equals("modisco.MMethodSignature.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, TMethodSignature tSignature, TMethod tName,
			TAbstractType tAbstractType) {

		Object[] result1_black = MethodSignatureImpl.pattern_MethodSignature_10_1_initialbindings_blackBBBBB(this,
				match, tSignature, tName, tAbstractType);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[tSignature] = " + tSignature + ", " + "[tName] = " + tName + ", "
					+ "[tAbstractType] = " + tAbstractType + ".");
		}

		Object[] result2_bindingAndBlack = MethodSignatureImpl
				.pattern_MethodSignature_10_2_SolveCSP_bindingAndBlackFBBBBB(this, match, tSignature, tName,
						tAbstractType);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[tSignature] = " + tSignature + ", " + "[tName] = " + tName + ", "
					+ "[tAbstractType] = " + tAbstractType + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (MethodSignatureImpl.pattern_MethodSignature_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = MethodSignatureImpl
					.pattern_MethodSignature_10_4_collectelementstobetranslated_blackBBBB(match, tSignature, tName,
							tAbstractType);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[tSignature] = " + tSignature + ", " + "[tName] = " + tName + ", " + "[tAbstractType] = "
						+ tAbstractType + ".");
			}
			MethodSignatureImpl.pattern_MethodSignature_10_4_collectelementstobetranslated_greenBBBBFFF(match,
					tSignature, tName, tAbstractType);
			//nothing EMoflonEdge tSignature__tAbstractType____returnType = (EMoflonEdge) result4_green[4];
			//nothing EMoflonEdge tName__tSignature____signatures = (EMoflonEdge) result4_green[5];
			//nothing EMoflonEdge tSignature__tName____method = (EMoflonEdge) result4_green[6];

			Object[] result5_black = MethodSignatureImpl.pattern_MethodSignature_10_5_collectcontextelements_blackBBBB(
					match, tSignature, tName, tAbstractType);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[tSignature] = " + tSignature + ", " + "[tName] = " + tName + ", " + "[tAbstractType] = "
						+ tAbstractType + ".");
			}
			MethodSignatureImpl.pattern_MethodSignature_10_5_collectcontextelements_greenBBB(match, tName,
					tAbstractType);

			// 
			MethodSignatureImpl.pattern_MethodSignature_10_6_registerobjectstomatch_expressionBBBBB(this, match,
					tSignature, tName, tAbstractType);
			return MethodSignatureImpl.pattern_MethodSignature_10_7_expressionF();
		} else {
			return MethodSignatureImpl.pattern_MethodSignature_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = MethodSignatureImpl
				.pattern_MethodSignature_11_1_performtransformation_bindingAndBlackFFFFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		Type mType = (Type) result1_bindingAndBlack[0];
		TMethodSignature tSignature = (TMethodSignature) result1_bindingAndBlack[1];
		TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result1_bindingAndBlack[2];
		TMethod tName = (TMethod) result1_bindingAndBlack[3];
		MMethodName mName = (MMethodName) result1_bindingAndBlack[4];
		TAbstractType tAbstractType = (TAbstractType) result1_bindingAndBlack[5];
		MMethodNameToTMethod mNameToTName = (MMethodNameToTMethod) result1_bindingAndBlack[6];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[7];
		Object[] result1_green = MethodSignatureImpl
				.pattern_MethodSignature_11_1_performtransformation_greenBBFFBF(mType, tSignature, mName);
		MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement = (MAbstractFlowElementToTAbstractFlowElement) result1_green[2];
		MSignatureToTSignature mSignatureToTSignature = (MSignatureToTSignature) result1_green[3];
		MMethodSignature mSignature = (MMethodSignature) result1_green[5];

		Object[] result2_black = MethodSignatureImpl.pattern_MethodSignature_11_2_collecttranslatedelements_blackBBBB(
				tSignature, mFlowElementToTFlowElement, mSignatureToTSignature, mSignature);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[tSignature] = " + tSignature
					+ ", " + "[mFlowElementToTFlowElement] = " + mFlowElementToTFlowElement + ", "
					+ "[mSignatureToTSignature] = " + mSignatureToTSignature + ", " + "[mSignature] = " + mSignature
					+ ".");
		}
		Object[] result2_green = MethodSignatureImpl.pattern_MethodSignature_11_2_collecttranslatedelements_greenFBBBB(
				tSignature, mFlowElementToTFlowElement, mSignatureToTSignature, mSignature);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = MethodSignatureImpl.pattern_MethodSignature_11_3_bookkeepingforedges_blackBBBBBBBBBBB(
				ruleresult, mType, tSignature, mFlowElementToTFlowElement, mTypeToTType, tName, mSignatureToTSignature,
				mName, tAbstractType, mSignature, mNameToTName);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[mType] = " + mType + ", " + "[tSignature] = " + tSignature + ", "
					+ "[mFlowElementToTFlowElement] = " + mFlowElementToTFlowElement + ", " + "[mTypeToTType] = "
					+ mTypeToTType + ", " + "[tName] = " + tName + ", " + "[mSignatureToTSignature] = "
					+ mSignatureToTSignature + ", " + "[mName] = " + mName + ", " + "[tAbstractType] = " + tAbstractType
					+ ", " + "[mSignature] = " + mSignature + ", " + "[mNameToTName] = " + mNameToTName + ".");
		}
		MethodSignatureImpl.pattern_MethodSignature_11_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFFF(ruleresult, mType,
				tSignature, mFlowElementToTFlowElement, tName, mSignatureToTSignature, mName, tAbstractType,
				mSignature);
		//nothing EMoflonEdge tSignature__tAbstractType____returnType = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge mName__mSignature____mSignatures = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge mSignatureToTSignature__tSignature____target = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge mFlowElementToTFlowElement__tSignature____target = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge mFlowElementToTFlowElement__mSignature____source = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge mSignatureToTSignature__mSignature____source = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge tName__tSignature____signatures = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge tSignature__tName____method = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge mSignature__mType____returnType = (EMoflonEdge) result3_green[17];

		// 
		// 
		MethodSignatureImpl.pattern_MethodSignature_11_5_registerobjects_expressionBBBBBBBBBBBB(this, ruleresult, mType,
				tSignature, mFlowElementToTFlowElement, mTypeToTType, tName, mSignatureToTSignature, mName,
				tAbstractType, mSignature, mNameToTName);
		return MethodSignatureImpl.pattern_MethodSignature_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = MethodSignatureImpl
				.pattern_MethodSignature_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = MethodSignatureImpl
				.pattern_MethodSignature_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = MethodSignatureImpl.pattern_MethodSignature_12_2_corematch_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		TMethodSignature tSignature = (TMethodSignature) result2_binding[0];
		TMethod tName = (TMethod) result2_binding[1];
		TAbstractType tAbstractType = (TAbstractType) result2_binding[2];
		for (Object[] result2_black : MethodSignatureImpl
				.pattern_MethodSignature_12_2_corematch_blackFBFBFBFB(tSignature, tName, tAbstractType, match)) {
			Type mType = (Type) result2_black[0];
			TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result2_black[2];
			MMethodName mName = (MMethodName) result2_black[4];
			MMethodNameToTMethod mNameToTName = (MMethodNameToTMethod) result2_black[6];
			// ForEach 
			for (Object[] result3_black : MethodSignatureImpl.pattern_MethodSignature_12_3_findcontext_blackBBBBBBB(
					mType, tSignature, mTypeToTType, tName, mName, tAbstractType, mNameToTName)) {
				Object[] result3_green = MethodSignatureImpl
						.pattern_MethodSignature_12_3_findcontext_greenBBBBBBBFFFFFFFF(mType, tSignature, mTypeToTType,
								tName, mName, tAbstractType, mNameToTName);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[7];
				//nothing EMoflonEdge mTypeToTType__mType____source = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge tSignature__tAbstractType____returnType = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge mTypeToTType__tAbstractType____target = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge tName__tSignature____signatures = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge tSignature__tName____method = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge mNameToTName__mName____source = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge mNameToTName__tName____target = (EMoflonEdge) result3_green[14];

				Object[] result4_bindingAndBlack = MethodSignatureImpl
						.pattern_MethodSignature_12_4_solveCSP_bindingAndBlackFBBBBBBBBB(this, isApplicableMatch, mType,
								tSignature, mTypeToTType, tName, mName, tAbstractType, mNameToTName);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[mType] = " + mType + ", "
							+ "[tSignature] = " + tSignature + ", " + "[mTypeToTType] = " + mTypeToTType + ", "
							+ "[tName] = " + tName + ", " + "[mName] = " + mName + ", " + "[tAbstractType] = "
							+ tAbstractType + ", " + "[mNameToTName] = " + mNameToTName + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (MethodSignatureImpl.pattern_MethodSignature_12_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = MethodSignatureImpl
							.pattern_MethodSignature_12_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					MethodSignatureImpl.pattern_MethodSignature_12_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return MethodSignatureImpl.pattern_MethodSignature_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, TMethodSignature tSignature, TMethod tName,
			TAbstractType tAbstractType) {
		match.registerObject("tSignature", tSignature);
		match.registerObject("tName", tName);
		match.registerObject("tAbstractType", tAbstractType);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, TMethodSignature tSignature, TMethod tName,
			TAbstractType tAbstractType) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, Type mType, TMethodSignature tSignature,
			TypeToTAbstractType mTypeToTType, TMethod tName, MMethodName mName, TAbstractType tAbstractType,
			MMethodNameToTMethod mNameToTName) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_mType_name = CSPFactoryHelper.eINSTANCE.createVariable("mType.name", true, csp);
		var_mType_name.setValue(mType.getName());
		var_mType_name.setType("String");
		Variable var_tSignature_upperBound = CSPFactoryHelper.eINSTANCE.createVariable("tSignature.upperBound", true,
				csp);
		var_tSignature_upperBound.setValue(tSignature.getUpperBound());
		var_tSignature_upperBound.setType("int");

		// Create unbound variables

		// Create constraints
		UpperBound upperBound = new UpperBound();

		csp.getConstraints().add(upperBound);

		// Solve CSP
		upperBound.setRuleName("NoRuleName");
		upperBound.solve(var_mType_name, var_tSignature_upperBound);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("mType", mType);
		isApplicableMatch.registerObject("tSignature", tSignature);
		isApplicableMatch.registerObject("mTypeToTType", mTypeToTType);
		isApplicableMatch.registerObject("tName", tName);
		isApplicableMatch.registerObject("mName", mName);
		isApplicableMatch.registerObject("tAbstractType", tAbstractType);
		isApplicableMatch.registerObject("mNameToTName", mNameToTName);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject mType, EObject tSignature,
			EObject mFlowElementToTFlowElement, EObject mTypeToTType, EObject tName, EObject mSignatureToTSignature,
			EObject mName, EObject tAbstractType, EObject mSignature, EObject mNameToTName) {
		ruleresult.registerObject("mType", mType);
		ruleresult.registerObject("tSignature", tSignature);
		ruleresult.registerObject("mFlowElementToTFlowElement", mFlowElementToTFlowElement);
		ruleresult.registerObject("mTypeToTType", mTypeToTType);
		ruleresult.registerObject("tName", tName);
		ruleresult.registerObject("mSignatureToTSignature", mSignatureToTSignature);
		ruleresult.registerObject("mName", mName);
		ruleresult.registerObject("tAbstractType", tAbstractType);
		ruleresult.registerObject("mSignature", mSignature);
		ruleresult.registerObject("mNameToTName", mNameToTName);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("tSignature").eClass())
				.equals("basic.TMethodSignature.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_37(EMoflonEdge _edge_returnType) {

		Object[] result1_bindingAndBlack = MethodSignatureImpl
				.pattern_MethodSignature_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = MethodSignatureImpl.pattern_MethodSignature_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : MethodSignatureImpl
				.pattern_MethodSignature_20_2_testcorematchandDECs_blackFFFB(_edge_returnType)) {
			TMethodSignature tSignature = (TMethodSignature) result2_black[0];
			TMethod tName = (TMethod) result2_black[1];
			TAbstractType tAbstractType = (TAbstractType) result2_black[2];
			Object[] result2_green = MethodSignatureImpl
					.pattern_MethodSignature_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (MethodSignatureImpl
					.pattern_MethodSignature_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(this,
							match, tSignature, tName, tAbstractType)) {
				// 
				if (MethodSignatureImpl
						.pattern_MethodSignature_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(this,
								match)) {

					Object[] result5_black = MethodSignatureImpl
							.pattern_MethodSignature_20_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					MethodSignatureImpl.pattern_MethodSignature_20_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return MethodSignatureImpl.pattern_MethodSignature_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_38(EMoflonEdge _edge_mSignatures) {

		Object[] result1_bindingAndBlack = MethodSignatureImpl
				.pattern_MethodSignature_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = MethodSignatureImpl.pattern_MethodSignature_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : MethodSignatureImpl
				.pattern_MethodSignature_21_2_testcorematchandDECs_blackFFFB(_edge_mSignatures)) {
			Type mType = (Type) result2_black[0];
			MMethodName mName = (MMethodName) result2_black[1];
			MMethodSignature mSignature = (MMethodSignature) result2_black[2];
			Object[] result2_green = MethodSignatureImpl
					.pattern_MethodSignature_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (MethodSignatureImpl
					.pattern_MethodSignature_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(this,
							match, mType, mName, mSignature)) {
				// 
				if (MethodSignatureImpl
						.pattern_MethodSignature_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(this,
								match)) {

					Object[] result5_black = MethodSignatureImpl
							.pattern_MethodSignature_21_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					MethodSignatureImpl.pattern_MethodSignature_21_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return MethodSignatureImpl.pattern_MethodSignature_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("MethodSignature");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		if (!__helper.hasExpectedValue("tSignature", "lowerBound", 0, ComparingOperator.EQUAL)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		Variable var_tSignature_upperBound = CSPFactoryHelper.eINSTANCE.createVariable("tSignature", true, csp);
		var_tSignature_upperBound.setValue(__helper.getValue("tSignature", "upperBound"));
		var_tSignature_upperBound.setType("int");

		Variable var_mType_name = CSPFactoryHelper.eINSTANCE.createVariable("mType", true, csp);
		var_mType_name.setValue(__helper.getValue("mType", "name"));
		var_mType_name.setType("String");

		UpperBound upperBound0 = new UpperBound();
		csp.getConstraints().add(upperBound0);

		upperBound0.setRuleName("MethodSignature");
		upperBound0.solve(var_mType_name, var_tSignature_upperBound);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_tSignature_upperBound.setBound(false);
			upperBound0.solve(var_mType_name, var_tSignature_upperBound);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
				__helper.setValue("tSignature", "upperBound", var_tSignature_upperBound.getValue());
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
		ruleResult.setRule("MethodSignature");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		if (!__helper.hasExpectedValue("tSignature", "lowerBound", 0, ComparingOperator.EQUAL)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		Variable var_tSignature_upperBound = CSPFactoryHelper.eINSTANCE.createVariable("tSignature", true, csp);
		var_tSignature_upperBound.setValue(__helper.getValue("tSignature", "upperBound"));
		var_tSignature_upperBound.setType("int");

		Variable var_mType_name = CSPFactoryHelper.eINSTANCE.createVariable("mType", true, csp);
		var_mType_name.setValue(__helper.getValue("mType", "name"));
		var_mType_name.setType("String");

		UpperBound upperBound0 = new UpperBound();
		csp.getConstraints().add(upperBound0);

		upperBound0.setRuleName("MethodSignature");
		upperBound0.solve(var_mType_name, var_tSignature_upperBound);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			upperBound0.solve(var_mType_name, var_tSignature_upperBound);
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

		Object[] result1_black = MethodSignatureImpl.pattern_MethodSignature_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = MethodSignatureImpl.pattern_MethodSignature_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = MethodSignatureImpl
				.pattern_MethodSignature_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFBB(sourceMatch, targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		Type mType = (Type) result2_bindingAndBlack[0];
		TMethodSignature tSignature = (TMethodSignature) result2_bindingAndBlack[1];
		TMethod tName = (TMethod) result2_bindingAndBlack[2];
		MMethodName mName = (MMethodName) result2_bindingAndBlack[3];
		TAbstractType tAbstractType = (TAbstractType) result2_bindingAndBlack[4];
		MMethodSignature mSignature = (MMethodSignature) result2_bindingAndBlack[5];

		Object[] result3_bindingAndBlack = MethodSignatureImpl
				.pattern_MethodSignature_24_3_solvecsp_bindingAndBlackFBBBBBBBBB(this, mType, tSignature, tName, mName,
						tAbstractType, mSignature, sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[mType] = " + mType + ", " + "[tSignature] = " + tSignature + ", " + "[tName] = " + tName + ", "
					+ "[mName] = " + mName + ", " + "[tAbstractType] = " + tAbstractType + ", " + "[mSignature] = "
					+ mSignature + ", " + "[sourceMatch] = " + sourceMatch + ", " + "[targetMatch] = " + targetMatch
					+ ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (MethodSignatureImpl.pattern_MethodSignature_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : MethodSignatureImpl
					.pattern_MethodSignature_24_5_matchcorrcontext_blackBFBBBFBB(mType, tName, mName, tAbstractType,
							sourceMatch, targetMatch)) {
				TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result5_black[1];
				MMethodNameToTMethod mNameToTName = (MMethodNameToTMethod) result5_black[5];
				Object[] result5_green = MethodSignatureImpl.pattern_MethodSignature_24_5_matchcorrcontext_greenBBBBF(
						mTypeToTType, mNameToTName, sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[4];

				Object[] result6_black = MethodSignatureImpl
						.pattern_MethodSignature_24_6_createcorrespondence_blackBBBBBBB(mType, tSignature, tName, mName,
								tAbstractType, mSignature, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[mType] = " + mType + ", "
							+ "[tSignature] = " + tSignature + ", " + "[tName] = " + tName + ", " + "[mName] = " + mName
							+ ", " + "[tAbstractType] = " + tAbstractType + ", " + "[mSignature] = " + mSignature + ", "
							+ "[ccMatch] = " + ccMatch + ".");
				}
				MethodSignatureImpl.pattern_MethodSignature_24_6_createcorrespondence_greenBFFBB(tSignature, mSignature,
						ccMatch);
				//nothing MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement = (MAbstractFlowElementToTAbstractFlowElement) result6_green[1];
				//nothing MSignatureToTSignature mSignatureToTSignature = (MSignatureToTSignature) result6_green[2];

				Object[] result7_black = MethodSignatureImpl
						.pattern_MethodSignature_24_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				MethodSignatureImpl.pattern_MethodSignature_24_7_addtoreturnedresult_greenBB(result, ccMatch);

			}

		} else {
		}
		return MethodSignatureImpl.pattern_MethodSignature_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(Type mType, TMethodSignature tSignature, TMethod tName, MMethodName mName,
			TAbstractType tAbstractType, MMethodSignature mSignature, Match sourceMatch, Match targetMatch) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals

		// Create attribute variables
		Variable var_mType_name = CSPFactoryHelper.eINSTANCE.createVariable("mType.name", true, csp);
		var_mType_name.setValue(mType.getName());
		var_mType_name.setType("String");
		Variable var_tSignature_upperBound = CSPFactoryHelper.eINSTANCE.createVariable("tSignature.upperBound", true,
				csp);
		var_tSignature_upperBound.setValue(tSignature.getUpperBound());
		var_tSignature_upperBound.setType("int");

		// Create unbound variables

		// Create constraints
		UpperBound upperBound = new UpperBound();

		csp.getConstraints().add(upperBound);

		// Solve CSP
		upperBound.setRuleName("NoRuleName");
		upperBound.solve(var_mType_name, var_tSignature_upperBound);
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
	public boolean checkDEC_FWD(Type mType, MMethodName mName, MMethodSignature mSignature) {// 
		Object[] result1_black = MethodSignatureImpl.pattern_MethodSignature_27_1_matchtggpattern_blackBBB(mType, mName,
				mSignature);
		if (result1_black != null) {
			return MethodSignatureImpl.pattern_MethodSignature_27_2_expressionF();
		} else {
			return MethodSignatureImpl.pattern_MethodSignature_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(TMethodSignature tSignature, TMethod tName, TAbstractType tAbstractType) {// 
		Object[] result1_black = MethodSignatureImpl.pattern_MethodSignature_28_1_matchtggpattern_blackBBB(tSignature,
				tName, tAbstractType);
		if (result1_black != null) {
			MethodSignatureImpl.pattern_MethodSignature_28_1_matchtggpattern_greenB(tSignature);

			return MethodSignatureImpl.pattern_MethodSignature_28_2_expressionF();
		} else {
			return MethodSignatureImpl.pattern_MethodSignature_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer,
			TypeToTAbstractType mTypeToTTypeParameter, MMethodNameToTMethod mNameToTNameParameter) {

		Object[] result1_black = MethodSignatureImpl.pattern_MethodSignature_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = MethodSignatureImpl.pattern_MethodSignature_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : MethodSignatureImpl
				.pattern_MethodSignature_29_2_isapplicablecore_blackFFFFFFFFBB(ruleEntryContainer, ruleResult)) {
			//nothing RuleEntryList mTypeToTTypeList = (RuleEntryList) result2_black[0];
			Type mType = (Type) result2_black[1];
			TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result2_black[2];
			TAbstractType tAbstractType = (TAbstractType) result2_black[3];
			//nothing RuleEntryList mNameToTNameList = (RuleEntryList) result2_black[4];
			TMethod tName = (TMethod) result2_black[5];
			MMethodNameToTMethod mNameToTName = (MMethodNameToTMethod) result2_black[6];
			MMethodName mName = (MMethodName) result2_black[7];

			Object[] result3_bindingAndBlack = MethodSignatureImpl
					.pattern_MethodSignature_29_3_solveCSP_bindingAndBlackFBBBBBBBBB(this, isApplicableMatch, mType,
							mTypeToTType, tName, mName, tAbstractType, mNameToTName, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[mType] = " + mType + ", "
						+ "[mTypeToTType] = " + mTypeToTType + ", " + "[tName] = " + tName + ", " + "[mName] = " + mName
						+ ", " + "[tAbstractType] = " + tAbstractType + ", " + "[mNameToTName] = " + mNameToTName + ", "
						+ "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (MethodSignatureImpl.pattern_MethodSignature_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = MethodSignatureImpl.pattern_MethodSignature_29_5_checknacs_blackBBBBBB(mType,
						mTypeToTType, tName, mName, tAbstractType, mNameToTName);
				if (result5_black != null) {

					Object[] result6_black = MethodSignatureImpl.pattern_MethodSignature_29_6_perform_blackBBBBBBB(
							mType, mTypeToTType, tName, mName, tAbstractType, mNameToTName, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[mType] = " + mType
								+ ", " + "[mTypeToTType] = " + mTypeToTType + ", " + "[tName] = " + tName + ", "
								+ "[mName] = " + mName + ", " + "[tAbstractType] = " + tAbstractType + ", "
								+ "[mNameToTName] = " + mNameToTName + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					MethodSignatureImpl.pattern_MethodSignature_29_6_perform_greenBFFBFBBFBB(mType, tName, mName,
							tAbstractType, ruleResult, csp);
					//nothing TMethodSignature tSignature = (TMethodSignature) result6_green[1];
					//nothing MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement = (MAbstractFlowElementToTAbstractFlowElement) result6_green[2];
					//nothing MSignatureToTSignature mSignatureToTSignature = (MSignatureToTSignature) result6_green[4];
					//nothing MMethodSignature mSignature = (MMethodSignature) result6_green[7];

				} else {
				}

			} else {
			}

		}
		return MethodSignatureImpl.pattern_MethodSignature_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, Type mType,
			TypeToTAbstractType mTypeToTType, TMethod tName, MMethodName mName, TAbstractType tAbstractType,
			MMethodNameToTMethod mNameToTName, ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_mType_name = CSPFactoryHelper.eINSTANCE.createVariable("mType.name", true, csp);
		var_mType_name.setValue(mType.getName());
		var_mType_name.setType("String");

		// Create unbound variables
		Variable var_tSignature_upperBound = CSPFactoryHelper.eINSTANCE.createVariable("tSignature.upperBound", csp);
		var_tSignature_upperBound.setType("int");

		// Create constraints
		UpperBound upperBound = new UpperBound();

		csp.getConstraints().add(upperBound);

		// Solve CSP
		upperBound.setRuleName("NoRuleName");
		upperBound.solve(var_mType_name, var_tSignature_upperBound);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("mType", mType);
		isApplicableMatch.registerObject("mTypeToTType", mTypeToTType);
		isApplicableMatch.registerObject("tName", tName);
		isApplicableMatch.registerObject("mName", mName);
		isApplicableMatch.registerObject("tAbstractType", tAbstractType);
		isApplicableMatch.registerObject("mNameToTName", mNameToTName);
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
		case RulesPackage.METHOD_SIGNATURE___IS_APPROPRIATE_FWD__MATCH_TYPE_MMETHODNAME_MMETHODSIGNATURE:
			return isAppropriate_FWD((Match) arguments.get(0), (Type) arguments.get(1), (MMethodName) arguments.get(2),
					(MMethodSignature) arguments.get(3));
		case RulesPackage.METHOD_SIGNATURE___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.METHOD_SIGNATURE___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.METHOD_SIGNATURE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_TYPE_MMETHODNAME_MMETHODSIGNATURE:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (Type) arguments.get(1),
					(MMethodName) arguments.get(2), (MMethodSignature) arguments.get(3));
			return null;
		case RulesPackage.METHOD_SIGNATURE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_TYPE_MMETHODNAME_MMETHODSIGNATURE:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (Type) arguments.get(1),
					(MMethodName) arguments.get(2), (MMethodSignature) arguments.get(3));
		case RulesPackage.METHOD_SIGNATURE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.METHOD_SIGNATURE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_TYPE_TYPETOTABSTRACTTYPE_TMETHOD_MMETHODNAME_TABSTRACTTYPE_MMETHODSIGNATURE_MMETHODNAMETOTMETHOD:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (Type) arguments.get(1),
					(TypeToTAbstractType) arguments.get(2), (TMethod) arguments.get(3), (MMethodName) arguments.get(4),
					(TAbstractType) arguments.get(5), (MMethodSignature) arguments.get(6),
					(MMethodNameToTMethod) arguments.get(7));
		case RulesPackage.METHOD_SIGNATURE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.METHOD_SIGNATURE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10));
			return null;
		case RulesPackage.METHOD_SIGNATURE___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.METHOD_SIGNATURE___IS_APPROPRIATE_BWD__MATCH_TMETHODSIGNATURE_TMETHOD_TABSTRACTTYPE:
			return isAppropriate_BWD((Match) arguments.get(0), (TMethodSignature) arguments.get(1),
					(TMethod) arguments.get(2), (TAbstractType) arguments.get(3));
		case RulesPackage.METHOD_SIGNATURE___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.METHOD_SIGNATURE___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.METHOD_SIGNATURE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TMETHODSIGNATURE_TMETHOD_TABSTRACTTYPE:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (TMethodSignature) arguments.get(1),
					(TMethod) arguments.get(2), (TAbstractType) arguments.get(3));
			return null;
		case RulesPackage.METHOD_SIGNATURE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TMETHODSIGNATURE_TMETHOD_TABSTRACTTYPE:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (TMethodSignature) arguments.get(1),
					(TMethod) arguments.get(2), (TAbstractType) arguments.get(3));
		case RulesPackage.METHOD_SIGNATURE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.METHOD_SIGNATURE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_TYPE_TMETHODSIGNATURE_TYPETOTABSTRACTTYPE_TMETHOD_MMETHODNAME_TABSTRACTTYPE_MMETHODNAMETOTMETHOD:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (Type) arguments.get(1),
					(TMethodSignature) arguments.get(2), (TypeToTAbstractType) arguments.get(3),
					(TMethod) arguments.get(4), (MMethodName) arguments.get(5), (TAbstractType) arguments.get(6),
					(MMethodNameToTMethod) arguments.get(7));
		case RulesPackage.METHOD_SIGNATURE___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.METHOD_SIGNATURE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10));
			return null;
		case RulesPackage.METHOD_SIGNATURE___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.METHOD_SIGNATURE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_37__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_37((EMoflonEdge) arguments.get(0));
		case RulesPackage.METHOD_SIGNATURE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_38__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_38((EMoflonEdge) arguments.get(0));
		case RulesPackage.METHOD_SIGNATURE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.METHOD_SIGNATURE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.METHOD_SIGNATURE___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.METHOD_SIGNATURE___IS_APPLICABLE_SOLVE_CSP_CC__TYPE_TMETHODSIGNATURE_TMETHOD_MMETHODNAME_TABSTRACTTYPE_MMETHODSIGNATURE_MATCH_MATCH:
			return isApplicable_solveCsp_CC((Type) arguments.get(0), (TMethodSignature) arguments.get(1),
					(TMethod) arguments.get(2), (MMethodName) arguments.get(3), (TAbstractType) arguments.get(4),
					(MMethodSignature) arguments.get(5), (Match) arguments.get(6), (Match) arguments.get(7));
		case RulesPackage.METHOD_SIGNATURE___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.METHOD_SIGNATURE___CHECK_DEC_FWD__TYPE_MMETHODNAME_MMETHODSIGNATURE:
			return checkDEC_FWD((Type) arguments.get(0), (MMethodName) arguments.get(1),
					(MMethodSignature) arguments.get(2));
		case RulesPackage.METHOD_SIGNATURE___CHECK_DEC_BWD__TMETHODSIGNATURE_TMETHOD_TABSTRACTTYPE:
			return checkDEC_BWD((TMethodSignature) arguments.get(0), (TMethod) arguments.get(1),
					(TAbstractType) arguments.get(2));
		case RulesPackage.METHOD_SIGNATURE___GENERATE_MODEL__RULEENTRYCONTAINER_TYPETOTABSTRACTTYPE_MMETHODNAMETOTMETHOD:
			return generateModel((RuleEntryContainer) arguments.get(0), (TypeToTAbstractType) arguments.get(1),
					(MMethodNameToTMethod) arguments.get(2));
		case RulesPackage.METHOD_SIGNATURE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_TYPE_TYPETOTABSTRACTTYPE_TMETHOD_MMETHODNAME_TABSTRACTTYPE_MMETHODNAMETOTMETHOD_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (Type) arguments.get(1),
					(TypeToTAbstractType) arguments.get(2), (TMethod) arguments.get(3), (MMethodName) arguments.get(4),
					(TAbstractType) arguments.get(5), (MMethodNameToTMethod) arguments.get(6),
					(ModelgeneratorRuleResult) arguments.get(7));
		case RulesPackage.METHOD_SIGNATURE___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_MethodSignature_0_1_initialbindings_blackBBBBB(MethodSignature _this,
			Match match, Type mType, MMethodName mName, MMethodSignature mSignature) {
		return new Object[] { _this, match, mType, mName, mSignature };
	}

	public static final Object[] pattern_MethodSignature_0_2_SolveCSP_bindingFBBBBB(MethodSignature _this, Match match,
			Type mType, MMethodName mName, MMethodSignature mSignature) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, mType, mName, mSignature);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, mType, mName, mSignature };
		}
		return null;
	}

	public static final Object[] pattern_MethodSignature_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MethodSignature_0_2_SolveCSP_bindingAndBlackFBBBBB(MethodSignature _this,
			Match match, Type mType, MMethodName mName, MMethodSignature mSignature) {
		Object[] result_pattern_MethodSignature_0_2_SolveCSP_binding = pattern_MethodSignature_0_2_SolveCSP_bindingFBBBBB(
				_this, match, mType, mName, mSignature);
		if (result_pattern_MethodSignature_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_MethodSignature_0_2_SolveCSP_binding[0];

			Object[] result_pattern_MethodSignature_0_2_SolveCSP_black = pattern_MethodSignature_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_MethodSignature_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, mType, mName, mSignature };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodSignature_0_3_CheckCSP_expressionFBB(MethodSignature _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodSignature_0_4_collectelementstobetranslated_blackBBBB(Match match,
			Type mType, MMethodName mName, MMethodSignature mSignature) {
		return new Object[] { match, mType, mName, mSignature };
	}

	public static final Object[] pattern_MethodSignature_0_4_collectelementstobetranslated_greenBBBBFF(Match match,
			Type mType, MMethodName mName, MMethodSignature mSignature) {
		EMoflonEdge mName__mSignature____mSignatures = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSignature__mType____returnType = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(mSignature);
		String mName__mSignature____mSignatures_name_prime = "mSignatures";
		String mSignature__mType____returnType_name_prime = "returnType";
		mName__mSignature____mSignatures.setSrc(mName);
		mName__mSignature____mSignatures.setTrg(mSignature);
		match.getToBeTranslatedEdges().add(mName__mSignature____mSignatures);
		mSignature__mType____returnType.setSrc(mSignature);
		mSignature__mType____returnType.setTrg(mType);
		match.getToBeTranslatedEdges().add(mSignature__mType____returnType);
		mName__mSignature____mSignatures.setName(mName__mSignature____mSignatures_name_prime);
		mSignature__mType____returnType.setName(mSignature__mType____returnType_name_prime);
		return new Object[] { match, mType, mName, mSignature, mName__mSignature____mSignatures,
				mSignature__mType____returnType };
	}

	public static final Object[] pattern_MethodSignature_0_5_collectcontextelements_blackBBBB(Match match, Type mType,
			MMethodName mName, MMethodSignature mSignature) {
		return new Object[] { match, mType, mName, mSignature };
	}

	public static final Object[] pattern_MethodSignature_0_5_collectcontextelements_greenBBB(Match match, Type mType,
			MMethodName mName) {
		match.getContextNodes().add(mType);
		match.getContextNodes().add(mName);
		return new Object[] { match, mType, mName };
	}

	public static final void pattern_MethodSignature_0_6_registerobjectstomatch_expressionBBBBB(MethodSignature _this,
			Match match, Type mType, MMethodName mName, MMethodSignature mSignature) {
		_this.registerObjectsToMatch_FWD(match, mType, mName, mSignature);

	}

	public static final boolean pattern_MethodSignature_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_MethodSignature_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_MethodSignature_1_1_performtransformation_bindingFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("mType");
		EObject _localVariable_1 = isApplicableMatch.getObject("mTypeToTType");
		EObject _localVariable_2 = isApplicableMatch.getObject("tName");
		EObject _localVariable_3 = isApplicableMatch.getObject("mName");
		EObject _localVariable_4 = isApplicableMatch.getObject("tAbstractType");
		EObject _localVariable_5 = isApplicableMatch.getObject("mSignature");
		EObject _localVariable_6 = isApplicableMatch.getObject("mNameToTName");
		EObject tmpMType = _localVariable_0;
		EObject tmpMTypeToTType = _localVariable_1;
		EObject tmpTName = _localVariable_2;
		EObject tmpMName = _localVariable_3;
		EObject tmpTAbstractType = _localVariable_4;
		EObject tmpMSignature = _localVariable_5;
		EObject tmpMNameToTName = _localVariable_6;
		if (tmpMType instanceof Type) {
			Type mType = (Type) tmpMType;
			if (tmpMTypeToTType instanceof TypeToTAbstractType) {
				TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) tmpMTypeToTType;
				if (tmpTName instanceof TMethod) {
					TMethod tName = (TMethod) tmpTName;
					if (tmpMName instanceof MMethodName) {
						MMethodName mName = (MMethodName) tmpMName;
						if (tmpTAbstractType instanceof TAbstractType) {
							TAbstractType tAbstractType = (TAbstractType) tmpTAbstractType;
							if (tmpMSignature instanceof MMethodSignature) {
								MMethodSignature mSignature = (MMethodSignature) tmpMSignature;
								if (tmpMNameToTName instanceof MMethodNameToTMethod) {
									MMethodNameToTMethod mNameToTName = (MMethodNameToTMethod) tmpMNameToTName;
									return new Object[] { mType, mTypeToTType, tName, mName, tAbstractType, mSignature,
											mNameToTName, isApplicableMatch };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodSignature_1_1_performtransformation_blackBBBBBBBFBB(Type mType,
			TypeToTAbstractType mTypeToTType, TMethod tName, MMethodName mName, TAbstractType tAbstractType,
			MMethodSignature mSignature, MMethodNameToTMethod mNameToTName, MethodSignature _this,
			IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { mType, mTypeToTType, tName, mName, tAbstractType, mSignature, mNameToTName, csp,
						_this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodSignature_1_1_performtransformation_bindingAndBlackFFFFFFFFBB(
			MethodSignature _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_MethodSignature_1_1_performtransformation_binding = pattern_MethodSignature_1_1_performtransformation_bindingFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_MethodSignature_1_1_performtransformation_binding != null) {
			Type mType = (Type) result_pattern_MethodSignature_1_1_performtransformation_binding[0];
			TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result_pattern_MethodSignature_1_1_performtransformation_binding[1];
			TMethod tName = (TMethod) result_pattern_MethodSignature_1_1_performtransformation_binding[2];
			MMethodName mName = (MMethodName) result_pattern_MethodSignature_1_1_performtransformation_binding[3];
			TAbstractType tAbstractType = (TAbstractType) result_pattern_MethodSignature_1_1_performtransformation_binding[4];
			MMethodSignature mSignature = (MMethodSignature) result_pattern_MethodSignature_1_1_performtransformation_binding[5];
			MMethodNameToTMethod mNameToTName = (MMethodNameToTMethod) result_pattern_MethodSignature_1_1_performtransformation_binding[6];

			Object[] result_pattern_MethodSignature_1_1_performtransformation_black = pattern_MethodSignature_1_1_performtransformation_blackBBBBBBBFBB(
					mType, mTypeToTType, tName, mName, tAbstractType, mSignature, mNameToTName, _this,
					isApplicableMatch);
			if (result_pattern_MethodSignature_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_MethodSignature_1_1_performtransformation_black[7];

				return new Object[] { mType, mTypeToTType, tName, mName, tAbstractType, mSignature, mNameToTName, csp,
						_this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodSignature_1_1_performtransformation_greenFFBFBBB(TMethod tName,
			TAbstractType tAbstractType, MMethodSignature mSignature, CSP csp) {
		TMethodSignature tSignature = BasicFactory.eINSTANCE.createTMethodSignature();
		MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement = PmFactory.eINSTANCE
				.createMAbstractFlowElementToTAbstractFlowElement();
		MSignatureToTSignature mSignatureToTSignature = PmFactory.eINSTANCE.createMSignatureToTSignature();
		int tSignature_lowerBound_prime = Integer.valueOf(0);
		Object _localVariable_0 = csp.getValue("tSignature", "upperBound");
		tSignature.setReturnType(tAbstractType);
		tName.getSignatures().add(tSignature);
		mFlowElementToTFlowElement.setTarget(tSignature);
		mFlowElementToTFlowElement.setSource(mSignature);
		mSignatureToTSignature.setTarget(tSignature);
		mSignatureToTSignature.setSource(mSignature);
		tSignature.setLowerBound(Integer.valueOf(tSignature_lowerBound_prime));
		int tSignature_upperBound_prime = (int) _localVariable_0;
		tSignature.setUpperBound(Integer.valueOf(tSignature_upperBound_prime));
		return new Object[] { tSignature, mFlowElementToTFlowElement, tName, mSignatureToTSignature, tAbstractType,
				mSignature, csp };
	}

	public static final Object[] pattern_MethodSignature_1_2_collecttranslatedelements_blackBBBB(
			TMethodSignature tSignature, MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement,
			MSignatureToTSignature mSignatureToTSignature, MMethodSignature mSignature) {
		return new Object[] { tSignature, mFlowElementToTFlowElement, mSignatureToTSignature, mSignature };
	}

	public static final Object[] pattern_MethodSignature_1_2_collecttranslatedelements_greenFBBBB(
			TMethodSignature tSignature, MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement,
			MSignatureToTSignature mSignatureToTSignature, MMethodSignature mSignature) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(tSignature);
		ruleresult.getCreatedLinkElements().add(mFlowElementToTFlowElement);
		ruleresult.getCreatedLinkElements().add(mSignatureToTSignature);
		ruleresult.getTranslatedElements().add(mSignature);
		return new Object[] { ruleresult, tSignature, mFlowElementToTFlowElement, mSignatureToTSignature, mSignature };
	}

	public static final Object[] pattern_MethodSignature_1_3_bookkeepingforedges_blackBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject mType, EObject tSignature, EObject mFlowElementToTFlowElement,
			EObject mTypeToTType, EObject tName, EObject mSignatureToTSignature, EObject mName, EObject tAbstractType,
			EObject mSignature, EObject mNameToTName) {
		if (!mType.equals(tSignature)) {
			if (!mType.equals(mTypeToTType)) {
				if (!mType.equals(tName)) {
					if (!mType.equals(tAbstractType)) {
						if (!mFlowElementToTFlowElement.equals(mType)) {
							if (!mFlowElementToTFlowElement.equals(tSignature)) {
								if (!mFlowElementToTFlowElement.equals(mTypeToTType)) {
									if (!mFlowElementToTFlowElement.equals(tName)) {
										if (!mFlowElementToTFlowElement.equals(mSignatureToTSignature)) {
											if (!mFlowElementToTFlowElement.equals(mName)) {
												if (!mFlowElementToTFlowElement.equals(tAbstractType)) {
													if (!mFlowElementToTFlowElement.equals(mSignature)) {
														if (!mFlowElementToTFlowElement.equals(mNameToTName)) {
															if (!mTypeToTType.equals(tSignature)) {
																if (!mTypeToTType.equals(tName)) {
																	if (!mTypeToTType.equals(tAbstractType)) {
																		if (!tName.equals(tSignature)) {
																			if (!mSignatureToTSignature.equals(mType)) {
																				if (!mSignatureToTSignature
																						.equals(tSignature)) {
																					if (!mSignatureToTSignature
																							.equals(mTypeToTType)) {
																						if (!mSignatureToTSignature
																								.equals(tName)) {
																							if (!mSignatureToTSignature
																									.equals(tAbstractType)) {
																								if (!mName.equals(
																										mType)) {
																									if (!mName.equals(
																											tSignature)) {
																										if (!mName
																												.equals(mTypeToTType)) {
																											if (!mName
																													.equals(tName)) {
																												if (!mName
																														.equals(mSignatureToTSignature)) {
																													if (!mName
																															.equals(tAbstractType)) {
																														if (!mName
																																.equals(mSignature)) {
																															if (!mName
																																	.equals(mNameToTName)) {
																																if (!tAbstractType
																																		.equals(tSignature)) {
																																	if (!tAbstractType
																																			.equals(tName)) {
																																		if (!mSignature
																																				.equals(mType)) {
																																			if (!mSignature
																																					.equals(tSignature)) {
																																				if (!mSignature
																																						.equals(mTypeToTType)) {
																																					if (!mSignature
																																							.equals(tName)) {
																																						if (!mSignature
																																								.equals(mSignatureToTSignature)) {
																																							if (!mSignature
																																									.equals(tAbstractType)) {
																																								if (!mNameToTName
																																										.equals(mType)) {
																																									if (!mNameToTName
																																											.equals(tSignature)) {
																																										if (!mNameToTName
																																												.equals(mTypeToTType)) {
																																											if (!mNameToTName
																																													.equals(tName)) {
																																												if (!mNameToTName
																																														.equals(mSignatureToTSignature)) {
																																													if (!mNameToTName
																																															.equals(tAbstractType)) {
																																														if (!mNameToTName
																																																.equals(mSignature)) {
																																															return new Object[] {
																																																	ruleresult,
																																																	mType,
																																																	tSignature,
																																																	mFlowElementToTFlowElement,
																																																	mTypeToTType,
																																																	tName,
																																																	mSignatureToTSignature,
																																																	mName,
																																																	tAbstractType,
																																																	mSignature,
																																																	mNameToTName };
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

	public static final Object[] pattern_MethodSignature_1_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFFF(
			PerformRuleResult ruleresult, EObject mType, EObject tSignature, EObject mFlowElementToTFlowElement,
			EObject tName, EObject mSignatureToTSignature, EObject mName, EObject tAbstractType, EObject mSignature) {
		EMoflonEdge tSignature__tAbstractType____returnType = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mName__mSignature____mSignatures = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSignatureToTSignature__tSignature____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mFlowElementToTFlowElement__tSignature____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mFlowElementToTFlowElement__mSignature____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSignatureToTSignature__mSignature____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tName__tSignature____signatures = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSignature__tName____method = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSignature__mType____returnType = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "MethodSignature";
		String tSignature__tAbstractType____returnType_name_prime = "returnType";
		String mName__mSignature____mSignatures_name_prime = "mSignatures";
		String mSignatureToTSignature__tSignature____target_name_prime = "target";
		String mFlowElementToTFlowElement__tSignature____target_name_prime = "target";
		String mFlowElementToTFlowElement__mSignature____source_name_prime = "source";
		String mSignatureToTSignature__mSignature____source_name_prime = "source";
		String tName__tSignature____signatures_name_prime = "signatures";
		String tSignature__tName____method_name_prime = "method";
		String mSignature__mType____returnType_name_prime = "returnType";
		tSignature__tAbstractType____returnType.setSrc(tSignature);
		tSignature__tAbstractType____returnType.setTrg(tAbstractType);
		ruleresult.getCreatedEdges().add(tSignature__tAbstractType____returnType);
		mName__mSignature____mSignatures.setSrc(mName);
		mName__mSignature____mSignatures.setTrg(mSignature);
		ruleresult.getTranslatedEdges().add(mName__mSignature____mSignatures);
		mSignatureToTSignature__tSignature____target.setSrc(mSignatureToTSignature);
		mSignatureToTSignature__tSignature____target.setTrg(tSignature);
		ruleresult.getCreatedEdges().add(mSignatureToTSignature__tSignature____target);
		mFlowElementToTFlowElement__tSignature____target.setSrc(mFlowElementToTFlowElement);
		mFlowElementToTFlowElement__tSignature____target.setTrg(tSignature);
		ruleresult.getCreatedEdges().add(mFlowElementToTFlowElement__tSignature____target);
		mFlowElementToTFlowElement__mSignature____source.setSrc(mFlowElementToTFlowElement);
		mFlowElementToTFlowElement__mSignature____source.setTrg(mSignature);
		ruleresult.getCreatedEdges().add(mFlowElementToTFlowElement__mSignature____source);
		mSignatureToTSignature__mSignature____source.setSrc(mSignatureToTSignature);
		mSignatureToTSignature__mSignature____source.setTrg(mSignature);
		ruleresult.getCreatedEdges().add(mSignatureToTSignature__mSignature____source);
		tName__tSignature____signatures.setSrc(tName);
		tName__tSignature____signatures.setTrg(tSignature);
		ruleresult.getCreatedEdges().add(tName__tSignature____signatures);
		tSignature__tName____method.setSrc(tSignature);
		tSignature__tName____method.setTrg(tName);
		ruleresult.getCreatedEdges().add(tSignature__tName____method);
		mSignature__mType____returnType.setSrc(mSignature);
		mSignature__mType____returnType.setTrg(mType);
		ruleresult.getTranslatedEdges().add(mSignature__mType____returnType);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		tSignature__tAbstractType____returnType.setName(tSignature__tAbstractType____returnType_name_prime);
		mName__mSignature____mSignatures.setName(mName__mSignature____mSignatures_name_prime);
		mSignatureToTSignature__tSignature____target.setName(mSignatureToTSignature__tSignature____target_name_prime);
		mFlowElementToTFlowElement__tSignature____target
				.setName(mFlowElementToTFlowElement__tSignature____target_name_prime);
		mFlowElementToTFlowElement__mSignature____source
				.setName(mFlowElementToTFlowElement__mSignature____source_name_prime);
		mSignatureToTSignature__mSignature____source.setName(mSignatureToTSignature__mSignature____source_name_prime);
		tName__tSignature____signatures.setName(tName__tSignature____signatures_name_prime);
		tSignature__tName____method.setName(tSignature__tName____method_name_prime);
		mSignature__mType____returnType.setName(mSignature__mType____returnType_name_prime);
		return new Object[] { ruleresult, mType, tSignature, mFlowElementToTFlowElement, tName, mSignatureToTSignature,
				mName, tAbstractType, mSignature, tSignature__tAbstractType____returnType,
				mName__mSignature____mSignatures, mSignatureToTSignature__tSignature____target,
				mFlowElementToTFlowElement__tSignature____target, mFlowElementToTFlowElement__mSignature____source,
				mSignatureToTSignature__mSignature____source, tName__tSignature____signatures,
				tSignature__tName____method, mSignature__mType____returnType };
	}

	public static final void pattern_MethodSignature_1_5_registerobjects_expressionBBBBBBBBBBBB(MethodSignature _this,
			PerformRuleResult ruleresult, EObject mType, EObject tSignature, EObject mFlowElementToTFlowElement,
			EObject mTypeToTType, EObject tName, EObject mSignatureToTSignature, EObject mName, EObject tAbstractType,
			EObject mSignature, EObject mNameToTName) {
		_this.registerObjects_FWD(ruleresult, mType, tSignature, mFlowElementToTFlowElement, mTypeToTType, tName,
				mSignatureToTSignature, mName, tAbstractType, mSignature, mNameToTName);

	}

	public static final PerformRuleResult pattern_MethodSignature_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_MethodSignature_2_1_preparereturnvalue_bindingFB(MethodSignature _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_MethodSignature_2_1_preparereturnvalue_blackFBB(EClass eClass,
			MethodSignature _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_MethodSignature_2_1_preparereturnvalue_bindingAndBlackFFB(
			MethodSignature _this) {
		Object[] result_pattern_MethodSignature_2_1_preparereturnvalue_binding = pattern_MethodSignature_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_MethodSignature_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_MethodSignature_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_MethodSignature_2_1_preparereturnvalue_black = pattern_MethodSignature_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_MethodSignature_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_MethodSignature_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodSignature_2_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "MethodSignature";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_MethodSignature_2_2_corematch_bindingFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("mType");
		EObject _localVariable_1 = match.getObject("mName");
		EObject _localVariable_2 = match.getObject("mSignature");
		EObject tmpMType = _localVariable_0;
		EObject tmpMName = _localVariable_1;
		EObject tmpMSignature = _localVariable_2;
		if (tmpMType instanceof Type) {
			Type mType = (Type) tmpMType;
			if (tmpMName instanceof MMethodName) {
				MMethodName mName = (MMethodName) tmpMName;
				if (tmpMSignature instanceof MMethodSignature) {
					MMethodSignature mSignature = (MMethodSignature) tmpMSignature;
					return new Object[] { mType, mName, mSignature, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_MethodSignature_2_2_corematch_blackBFFBFBFB(Type mType,
			MMethodName mName, MMethodSignature mSignature, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (TypeToTAbstractType mTypeToTType : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mType, TypeToTAbstractType.class, "source")) {
			TAbstractType tAbstractType = mTypeToTType.getTarget();
			if (tAbstractType != null) {
				for (MMethodNameToTMethod mNameToTName : org.moflon.core.utilities.eMoflonEMFUtil
						.getOppositeReferenceTyped(mName, MMethodNameToTMethod.class, "source")) {
					TMethod tName = mNameToTName.getTarget();
					if (tName != null) {
						_result.add(new Object[] { mType, mTypeToTType, tName, mName, tAbstractType, mSignature,
								mNameToTName, match });
					}

				}
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_MethodSignature_2_3_findcontext_blackBBBBBBB(Type mType,
			TypeToTAbstractType mTypeToTType, TMethod tName, MMethodName mName, TAbstractType tAbstractType,
			MMethodSignature mSignature, MMethodNameToTMethod mNameToTName) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (mType.equals(mTypeToTType.getSource())) {
			if (mName.getMSignatures().contains(mSignature)) {
				if (tAbstractType.equals(mTypeToTType.getTarget())) {
					if (mName.equals(mNameToTName.getSource())) {
						if (tName.equals(mNameToTName.getTarget())) {
							if (mType.equals(mSignature.getReturnType())) {
								_result.add(new Object[] { mType, mTypeToTType, tName, mName, tAbstractType, mSignature,
										mNameToTName });
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_MethodSignature_2_3_findcontext_greenBBBBBBBFFFFFFF(Type mType,
			TypeToTAbstractType mTypeToTType, TMethod tName, MMethodName mName, TAbstractType tAbstractType,
			MMethodSignature mSignature, MMethodNameToTMethod mNameToTName) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge mTypeToTType__mType____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mName__mSignature____mSignatures = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mTypeToTType__tAbstractType____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mNameToTName__mName____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mNameToTName__tName____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSignature__mType____returnType = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String mTypeToTType__mType____source_name_prime = "source";
		String mName__mSignature____mSignatures_name_prime = "mSignatures";
		String mTypeToTType__tAbstractType____target_name_prime = "target";
		String mNameToTName__mName____source_name_prime = "source";
		String mNameToTName__tName____target_name_prime = "target";
		String mSignature__mType____returnType_name_prime = "returnType";
		isApplicableMatch.getAllContextElements().add(mType);
		isApplicableMatch.getAllContextElements().add(mTypeToTType);
		isApplicableMatch.getAllContextElements().add(tName);
		isApplicableMatch.getAllContextElements().add(mName);
		isApplicableMatch.getAllContextElements().add(tAbstractType);
		isApplicableMatch.getAllContextElements().add(mSignature);
		isApplicableMatch.getAllContextElements().add(mNameToTName);
		mTypeToTType__mType____source.setSrc(mTypeToTType);
		mTypeToTType__mType____source.setTrg(mType);
		isApplicableMatch.getAllContextElements().add(mTypeToTType__mType____source);
		mName__mSignature____mSignatures.setSrc(mName);
		mName__mSignature____mSignatures.setTrg(mSignature);
		isApplicableMatch.getAllContextElements().add(mName__mSignature____mSignatures);
		mTypeToTType__tAbstractType____target.setSrc(mTypeToTType);
		mTypeToTType__tAbstractType____target.setTrg(tAbstractType);
		isApplicableMatch.getAllContextElements().add(mTypeToTType__tAbstractType____target);
		mNameToTName__mName____source.setSrc(mNameToTName);
		mNameToTName__mName____source.setTrg(mName);
		isApplicableMatch.getAllContextElements().add(mNameToTName__mName____source);
		mNameToTName__tName____target.setSrc(mNameToTName);
		mNameToTName__tName____target.setTrg(tName);
		isApplicableMatch.getAllContextElements().add(mNameToTName__tName____target);
		mSignature__mType____returnType.setSrc(mSignature);
		mSignature__mType____returnType.setTrg(mType);
		isApplicableMatch.getAllContextElements().add(mSignature__mType____returnType);
		mTypeToTType__mType____source.setName(mTypeToTType__mType____source_name_prime);
		mName__mSignature____mSignatures.setName(mName__mSignature____mSignatures_name_prime);
		mTypeToTType__tAbstractType____target.setName(mTypeToTType__tAbstractType____target_name_prime);
		mNameToTName__mName____source.setName(mNameToTName__mName____source_name_prime);
		mNameToTName__tName____target.setName(mNameToTName__tName____target_name_prime);
		mSignature__mType____returnType.setName(mSignature__mType____returnType_name_prime);
		return new Object[] { mType, mTypeToTType, tName, mName, tAbstractType, mSignature, mNameToTName,
				isApplicableMatch, mTypeToTType__mType____source, mName__mSignature____mSignatures,
				mTypeToTType__tAbstractType____target, mNameToTName__mName____source, mNameToTName__tName____target,
				mSignature__mType____returnType };
	}

	public static final Object[] pattern_MethodSignature_2_4_solveCSP_bindingFBBBBBBBBB(MethodSignature _this,
			IsApplicableMatch isApplicableMatch, Type mType, TypeToTAbstractType mTypeToTType, TMethod tName,
			MMethodName mName, TAbstractType tAbstractType, MMethodSignature mSignature,
			MMethodNameToTMethod mNameToTName) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, mType, mTypeToTType, tName, mName,
				tAbstractType, mSignature, mNameToTName);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mType, mTypeToTType, tName, mName, tAbstractType,
					mSignature, mNameToTName };
		}
		return null;
	}

	public static final Object[] pattern_MethodSignature_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MethodSignature_2_4_solveCSP_bindingAndBlackFBBBBBBBBB(MethodSignature _this,
			IsApplicableMatch isApplicableMatch, Type mType, TypeToTAbstractType mTypeToTType, TMethod tName,
			MMethodName mName, TAbstractType tAbstractType, MMethodSignature mSignature,
			MMethodNameToTMethod mNameToTName) {
		Object[] result_pattern_MethodSignature_2_4_solveCSP_binding = pattern_MethodSignature_2_4_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, mType, mTypeToTType, tName, mName, tAbstractType, mSignature, mNameToTName);
		if (result_pattern_MethodSignature_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_MethodSignature_2_4_solveCSP_binding[0];

			Object[] result_pattern_MethodSignature_2_4_solveCSP_black = pattern_MethodSignature_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_MethodSignature_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mType, mTypeToTType, tName, mName, tAbstractType,
						mSignature, mNameToTName };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodSignature_2_5_checkCSP_expressionFBB(MethodSignature _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodSignature_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_MethodSignature_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "MethodSignature";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_MethodSignature_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_MethodSignature_10_1_initialbindings_blackBBBBB(MethodSignature _this,
			Match match, TMethodSignature tSignature, TMethod tName, TAbstractType tAbstractType) {
		return new Object[] { _this, match, tSignature, tName, tAbstractType };
	}

	public static final Object[] pattern_MethodSignature_10_2_SolveCSP_bindingFBBBBB(MethodSignature _this, Match match,
			TMethodSignature tSignature, TMethod tName, TAbstractType tAbstractType) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, tSignature, tName, tAbstractType);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, tSignature, tName, tAbstractType };
		}
		return null;
	}

	public static final Object[] pattern_MethodSignature_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MethodSignature_10_2_SolveCSP_bindingAndBlackFBBBBB(MethodSignature _this,
			Match match, TMethodSignature tSignature, TMethod tName, TAbstractType tAbstractType) {
		Object[] result_pattern_MethodSignature_10_2_SolveCSP_binding = pattern_MethodSignature_10_2_SolveCSP_bindingFBBBBB(
				_this, match, tSignature, tName, tAbstractType);
		if (result_pattern_MethodSignature_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_MethodSignature_10_2_SolveCSP_binding[0];

			Object[] result_pattern_MethodSignature_10_2_SolveCSP_black = pattern_MethodSignature_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_MethodSignature_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, tSignature, tName, tAbstractType };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodSignature_10_3_CheckCSP_expressionFBB(MethodSignature _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodSignature_10_4_collectelementstobetranslated_blackBBBB(Match match,
			TMethodSignature tSignature, TMethod tName, TAbstractType tAbstractType) {
		return new Object[] { match, tSignature, tName, tAbstractType };
	}

	public static final Object[] pattern_MethodSignature_10_4_collectelementstobetranslated_greenBBBBFFF(Match match,
			TMethodSignature tSignature, TMethod tName, TAbstractType tAbstractType) {
		EMoflonEdge tSignature__tAbstractType____returnType = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tName__tSignature____signatures = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSignature__tName____method = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(tSignature);
		String tSignature__tAbstractType____returnType_name_prime = "returnType";
		String tName__tSignature____signatures_name_prime = "signatures";
		String tSignature__tName____method_name_prime = "method";
		tSignature__tAbstractType____returnType.setSrc(tSignature);
		tSignature__tAbstractType____returnType.setTrg(tAbstractType);
		match.getToBeTranslatedEdges().add(tSignature__tAbstractType____returnType);
		tName__tSignature____signatures.setSrc(tName);
		tName__tSignature____signatures.setTrg(tSignature);
		match.getToBeTranslatedEdges().add(tName__tSignature____signatures);
		tSignature__tName____method.setSrc(tSignature);
		tSignature__tName____method.setTrg(tName);
		match.getToBeTranslatedEdges().add(tSignature__tName____method);
		tSignature__tAbstractType____returnType.setName(tSignature__tAbstractType____returnType_name_prime);
		tName__tSignature____signatures.setName(tName__tSignature____signatures_name_prime);
		tSignature__tName____method.setName(tSignature__tName____method_name_prime);
		return new Object[] { match, tSignature, tName, tAbstractType, tSignature__tAbstractType____returnType,
				tName__tSignature____signatures, tSignature__tName____method };
	}

	public static final Object[] pattern_MethodSignature_10_5_collectcontextelements_blackBBBB(Match match,
			TMethodSignature tSignature, TMethod tName, TAbstractType tAbstractType) {
		return new Object[] { match, tSignature, tName, tAbstractType };
	}

	public static final Object[] pattern_MethodSignature_10_5_collectcontextelements_greenBBB(Match match,
			TMethod tName, TAbstractType tAbstractType) {
		match.getContextNodes().add(tName);
		match.getContextNodes().add(tAbstractType);
		return new Object[] { match, tName, tAbstractType };
	}

	public static final void pattern_MethodSignature_10_6_registerobjectstomatch_expressionBBBBB(MethodSignature _this,
			Match match, TMethodSignature tSignature, TMethod tName, TAbstractType tAbstractType) {
		_this.registerObjectsToMatch_BWD(match, tSignature, tName, tAbstractType);

	}

	public static final boolean pattern_MethodSignature_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_MethodSignature_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_MethodSignature_11_1_performtransformation_bindingFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("mType");
		EObject _localVariable_1 = isApplicableMatch.getObject("tSignature");
		EObject _localVariable_2 = isApplicableMatch.getObject("mTypeToTType");
		EObject _localVariable_3 = isApplicableMatch.getObject("tName");
		EObject _localVariable_4 = isApplicableMatch.getObject("mName");
		EObject _localVariable_5 = isApplicableMatch.getObject("tAbstractType");
		EObject _localVariable_6 = isApplicableMatch.getObject("mNameToTName");
		EObject tmpMType = _localVariable_0;
		EObject tmpTSignature = _localVariable_1;
		EObject tmpMTypeToTType = _localVariable_2;
		EObject tmpTName = _localVariable_3;
		EObject tmpMName = _localVariable_4;
		EObject tmpTAbstractType = _localVariable_5;
		EObject tmpMNameToTName = _localVariable_6;
		if (tmpMType instanceof Type) {
			Type mType = (Type) tmpMType;
			if (tmpTSignature instanceof TMethodSignature) {
				TMethodSignature tSignature = (TMethodSignature) tmpTSignature;
				if (tmpMTypeToTType instanceof TypeToTAbstractType) {
					TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) tmpMTypeToTType;
					if (tmpTName instanceof TMethod) {
						TMethod tName = (TMethod) tmpTName;
						if (tmpMName instanceof MMethodName) {
							MMethodName mName = (MMethodName) tmpMName;
							if (tmpTAbstractType instanceof TAbstractType) {
								TAbstractType tAbstractType = (TAbstractType) tmpTAbstractType;
								if (tmpMNameToTName instanceof MMethodNameToTMethod) {
									MMethodNameToTMethod mNameToTName = (MMethodNameToTMethod) tmpMNameToTName;
									return new Object[] { mType, tSignature, mTypeToTType, tName, mName, tAbstractType,
											mNameToTName, isApplicableMatch };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodSignature_11_1_performtransformation_blackBBBBBBBFBB(Type mType,
			TMethodSignature tSignature, TypeToTAbstractType mTypeToTType, TMethod tName, MMethodName mName,
			TAbstractType tAbstractType, MMethodNameToTMethod mNameToTName, MethodSignature _this,
			IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { mType, tSignature, mTypeToTType, tName, mName, tAbstractType, mNameToTName, csp,
						_this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodSignature_11_1_performtransformation_bindingAndBlackFFFFFFFFBB(
			MethodSignature _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_MethodSignature_11_1_performtransformation_binding = pattern_MethodSignature_11_1_performtransformation_bindingFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_MethodSignature_11_1_performtransformation_binding != null) {
			Type mType = (Type) result_pattern_MethodSignature_11_1_performtransformation_binding[0];
			TMethodSignature tSignature = (TMethodSignature) result_pattern_MethodSignature_11_1_performtransformation_binding[1];
			TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result_pattern_MethodSignature_11_1_performtransformation_binding[2];
			TMethod tName = (TMethod) result_pattern_MethodSignature_11_1_performtransformation_binding[3];
			MMethodName mName = (MMethodName) result_pattern_MethodSignature_11_1_performtransformation_binding[4];
			TAbstractType tAbstractType = (TAbstractType) result_pattern_MethodSignature_11_1_performtransformation_binding[5];
			MMethodNameToTMethod mNameToTName = (MMethodNameToTMethod) result_pattern_MethodSignature_11_1_performtransformation_binding[6];

			Object[] result_pattern_MethodSignature_11_1_performtransformation_black = pattern_MethodSignature_11_1_performtransformation_blackBBBBBBBFBB(
					mType, tSignature, mTypeToTType, tName, mName, tAbstractType, mNameToTName, _this,
					isApplicableMatch);
			if (result_pattern_MethodSignature_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_MethodSignature_11_1_performtransformation_black[7];

				return new Object[] { mType, tSignature, mTypeToTType, tName, mName, tAbstractType, mNameToTName, csp,
						_this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodSignature_11_1_performtransformation_greenBBFFBF(Type mType,
			TMethodSignature tSignature, MMethodName mName) {
		MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement = PmFactory.eINSTANCE
				.createMAbstractFlowElementToTAbstractFlowElement();
		MSignatureToTSignature mSignatureToTSignature = PmFactory.eINSTANCE.createMSignatureToTSignature();
		MMethodSignature mSignature = ModiscoFactory.eINSTANCE.createMMethodSignature();
		mFlowElementToTFlowElement.setTarget(tSignature);
		mSignatureToTSignature.setTarget(tSignature);
		mName.getMSignatures().add(mSignature);
		mFlowElementToTFlowElement.setSource(mSignature);
		mSignatureToTSignature.setSource(mSignature);
		mSignature.setReturnType(mType);
		return new Object[] { mType, tSignature, mFlowElementToTFlowElement, mSignatureToTSignature, mName,
				mSignature };
	}

	public static final Object[] pattern_MethodSignature_11_2_collecttranslatedelements_blackBBBB(
			TMethodSignature tSignature, MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement,
			MSignatureToTSignature mSignatureToTSignature, MMethodSignature mSignature) {
		return new Object[] { tSignature, mFlowElementToTFlowElement, mSignatureToTSignature, mSignature };
	}

	public static final Object[] pattern_MethodSignature_11_2_collecttranslatedelements_greenFBBBB(
			TMethodSignature tSignature, MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement,
			MSignatureToTSignature mSignatureToTSignature, MMethodSignature mSignature) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(tSignature);
		ruleresult.getCreatedLinkElements().add(mFlowElementToTFlowElement);
		ruleresult.getCreatedLinkElements().add(mSignatureToTSignature);
		ruleresult.getCreatedElements().add(mSignature);
		return new Object[] { ruleresult, tSignature, mFlowElementToTFlowElement, mSignatureToTSignature, mSignature };
	}

	public static final Object[] pattern_MethodSignature_11_3_bookkeepingforedges_blackBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject mType, EObject tSignature, EObject mFlowElementToTFlowElement,
			EObject mTypeToTType, EObject tName, EObject mSignatureToTSignature, EObject mName, EObject tAbstractType,
			EObject mSignature, EObject mNameToTName) {
		if (!mType.equals(tSignature)) {
			if (!mType.equals(mTypeToTType)) {
				if (!mType.equals(tName)) {
					if (!mType.equals(tAbstractType)) {
						if (!mFlowElementToTFlowElement.equals(mType)) {
							if (!mFlowElementToTFlowElement.equals(tSignature)) {
								if (!mFlowElementToTFlowElement.equals(mTypeToTType)) {
									if (!mFlowElementToTFlowElement.equals(tName)) {
										if (!mFlowElementToTFlowElement.equals(mSignatureToTSignature)) {
											if (!mFlowElementToTFlowElement.equals(mName)) {
												if (!mFlowElementToTFlowElement.equals(tAbstractType)) {
													if (!mFlowElementToTFlowElement.equals(mSignature)) {
														if (!mFlowElementToTFlowElement.equals(mNameToTName)) {
															if (!mTypeToTType.equals(tSignature)) {
																if (!mTypeToTType.equals(tName)) {
																	if (!mTypeToTType.equals(tAbstractType)) {
																		if (!tName.equals(tSignature)) {
																			if (!mSignatureToTSignature.equals(mType)) {
																				if (!mSignatureToTSignature
																						.equals(tSignature)) {
																					if (!mSignatureToTSignature
																							.equals(mTypeToTType)) {
																						if (!mSignatureToTSignature
																								.equals(tName)) {
																							if (!mSignatureToTSignature
																									.equals(tAbstractType)) {
																								if (!mName.equals(
																										mType)) {
																									if (!mName.equals(
																											tSignature)) {
																										if (!mName
																												.equals(mTypeToTType)) {
																											if (!mName
																													.equals(tName)) {
																												if (!mName
																														.equals(mSignatureToTSignature)) {
																													if (!mName
																															.equals(tAbstractType)) {
																														if (!mName
																																.equals(mSignature)) {
																															if (!mName
																																	.equals(mNameToTName)) {
																																if (!tAbstractType
																																		.equals(tSignature)) {
																																	if (!tAbstractType
																																			.equals(tName)) {
																																		if (!mSignature
																																				.equals(mType)) {
																																			if (!mSignature
																																					.equals(tSignature)) {
																																				if (!mSignature
																																						.equals(mTypeToTType)) {
																																					if (!mSignature
																																							.equals(tName)) {
																																						if (!mSignature
																																								.equals(mSignatureToTSignature)) {
																																							if (!mSignature
																																									.equals(tAbstractType)) {
																																								if (!mNameToTName
																																										.equals(mType)) {
																																									if (!mNameToTName
																																											.equals(tSignature)) {
																																										if (!mNameToTName
																																												.equals(mTypeToTType)) {
																																											if (!mNameToTName
																																													.equals(tName)) {
																																												if (!mNameToTName
																																														.equals(mSignatureToTSignature)) {
																																													if (!mNameToTName
																																															.equals(tAbstractType)) {
																																														if (!mNameToTName
																																																.equals(mSignature)) {
																																															return new Object[] {
																																																	ruleresult,
																																																	mType,
																																																	tSignature,
																																																	mFlowElementToTFlowElement,
																																																	mTypeToTType,
																																																	tName,
																																																	mSignatureToTSignature,
																																																	mName,
																																																	tAbstractType,
																																																	mSignature,
																																																	mNameToTName };
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

	public static final Object[] pattern_MethodSignature_11_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFFF(
			PerformRuleResult ruleresult, EObject mType, EObject tSignature, EObject mFlowElementToTFlowElement,
			EObject tName, EObject mSignatureToTSignature, EObject mName, EObject tAbstractType, EObject mSignature) {
		EMoflonEdge tSignature__tAbstractType____returnType = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mName__mSignature____mSignatures = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSignatureToTSignature__tSignature____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mFlowElementToTFlowElement__tSignature____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mFlowElementToTFlowElement__mSignature____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSignatureToTSignature__mSignature____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tName__tSignature____signatures = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSignature__tName____method = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSignature__mType____returnType = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "MethodSignature";
		String tSignature__tAbstractType____returnType_name_prime = "returnType";
		String mName__mSignature____mSignatures_name_prime = "mSignatures";
		String mSignatureToTSignature__tSignature____target_name_prime = "target";
		String mFlowElementToTFlowElement__tSignature____target_name_prime = "target";
		String mFlowElementToTFlowElement__mSignature____source_name_prime = "source";
		String mSignatureToTSignature__mSignature____source_name_prime = "source";
		String tName__tSignature____signatures_name_prime = "signatures";
		String tSignature__tName____method_name_prime = "method";
		String mSignature__mType____returnType_name_prime = "returnType";
		tSignature__tAbstractType____returnType.setSrc(tSignature);
		tSignature__tAbstractType____returnType.setTrg(tAbstractType);
		ruleresult.getTranslatedEdges().add(tSignature__tAbstractType____returnType);
		mName__mSignature____mSignatures.setSrc(mName);
		mName__mSignature____mSignatures.setTrg(mSignature);
		ruleresult.getCreatedEdges().add(mName__mSignature____mSignatures);
		mSignatureToTSignature__tSignature____target.setSrc(mSignatureToTSignature);
		mSignatureToTSignature__tSignature____target.setTrg(tSignature);
		ruleresult.getCreatedEdges().add(mSignatureToTSignature__tSignature____target);
		mFlowElementToTFlowElement__tSignature____target.setSrc(mFlowElementToTFlowElement);
		mFlowElementToTFlowElement__tSignature____target.setTrg(tSignature);
		ruleresult.getCreatedEdges().add(mFlowElementToTFlowElement__tSignature____target);
		mFlowElementToTFlowElement__mSignature____source.setSrc(mFlowElementToTFlowElement);
		mFlowElementToTFlowElement__mSignature____source.setTrg(mSignature);
		ruleresult.getCreatedEdges().add(mFlowElementToTFlowElement__mSignature____source);
		mSignatureToTSignature__mSignature____source.setSrc(mSignatureToTSignature);
		mSignatureToTSignature__mSignature____source.setTrg(mSignature);
		ruleresult.getCreatedEdges().add(mSignatureToTSignature__mSignature____source);
		tName__tSignature____signatures.setSrc(tName);
		tName__tSignature____signatures.setTrg(tSignature);
		ruleresult.getTranslatedEdges().add(tName__tSignature____signatures);
		tSignature__tName____method.setSrc(tSignature);
		tSignature__tName____method.setTrg(tName);
		ruleresult.getTranslatedEdges().add(tSignature__tName____method);
		mSignature__mType____returnType.setSrc(mSignature);
		mSignature__mType____returnType.setTrg(mType);
		ruleresult.getCreatedEdges().add(mSignature__mType____returnType);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		tSignature__tAbstractType____returnType.setName(tSignature__tAbstractType____returnType_name_prime);
		mName__mSignature____mSignatures.setName(mName__mSignature____mSignatures_name_prime);
		mSignatureToTSignature__tSignature____target.setName(mSignatureToTSignature__tSignature____target_name_prime);
		mFlowElementToTFlowElement__tSignature____target
				.setName(mFlowElementToTFlowElement__tSignature____target_name_prime);
		mFlowElementToTFlowElement__mSignature____source
				.setName(mFlowElementToTFlowElement__mSignature____source_name_prime);
		mSignatureToTSignature__mSignature____source.setName(mSignatureToTSignature__mSignature____source_name_prime);
		tName__tSignature____signatures.setName(tName__tSignature____signatures_name_prime);
		tSignature__tName____method.setName(tSignature__tName____method_name_prime);
		mSignature__mType____returnType.setName(mSignature__mType____returnType_name_prime);
		return new Object[] { ruleresult, mType, tSignature, mFlowElementToTFlowElement, tName, mSignatureToTSignature,
				mName, tAbstractType, mSignature, tSignature__tAbstractType____returnType,
				mName__mSignature____mSignatures, mSignatureToTSignature__tSignature____target,
				mFlowElementToTFlowElement__tSignature____target, mFlowElementToTFlowElement__mSignature____source,
				mSignatureToTSignature__mSignature____source, tName__tSignature____signatures,
				tSignature__tName____method, mSignature__mType____returnType };
	}

	public static final void pattern_MethodSignature_11_5_registerobjects_expressionBBBBBBBBBBBB(MethodSignature _this,
			PerformRuleResult ruleresult, EObject mType, EObject tSignature, EObject mFlowElementToTFlowElement,
			EObject mTypeToTType, EObject tName, EObject mSignatureToTSignature, EObject mName, EObject tAbstractType,
			EObject mSignature, EObject mNameToTName) {
		_this.registerObjects_BWD(ruleresult, mType, tSignature, mFlowElementToTFlowElement, mTypeToTType, tName,
				mSignatureToTSignature, mName, tAbstractType, mSignature, mNameToTName);

	}

	public static final PerformRuleResult pattern_MethodSignature_11_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_MethodSignature_12_1_preparereturnvalue_bindingFB(MethodSignature _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_MethodSignature_12_1_preparereturnvalue_blackFBB(EClass eClass,
			MethodSignature _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_MethodSignature_12_1_preparereturnvalue_bindingAndBlackFFB(
			MethodSignature _this) {
		Object[] result_pattern_MethodSignature_12_1_preparereturnvalue_binding = pattern_MethodSignature_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_MethodSignature_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_MethodSignature_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_MethodSignature_12_1_preparereturnvalue_black = pattern_MethodSignature_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_MethodSignature_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_MethodSignature_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodSignature_12_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "MethodSignature";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_MethodSignature_12_2_corematch_bindingFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("tSignature");
		EObject _localVariable_1 = match.getObject("tName");
		EObject _localVariable_2 = match.getObject("tAbstractType");
		EObject tmpTSignature = _localVariable_0;
		EObject tmpTName = _localVariable_1;
		EObject tmpTAbstractType = _localVariable_2;
		if (tmpTSignature instanceof TMethodSignature) {
			TMethodSignature tSignature = (TMethodSignature) tmpTSignature;
			if (tmpTName instanceof TMethod) {
				TMethod tName = (TMethod) tmpTName;
				if (tmpTAbstractType instanceof TAbstractType) {
					TAbstractType tAbstractType = (TAbstractType) tmpTAbstractType;
					return new Object[] { tSignature, tName, tAbstractType, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_MethodSignature_12_2_corematch_blackFBFBFBFB(
			TMethodSignature tSignature, TMethod tName, TAbstractType tAbstractType, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		int tSignature_lowerBound = tSignature.getLowerBound();
		if (Integer.valueOf(tSignature_lowerBound).equals(Integer.valueOf(0))) {
			for (TypeToTAbstractType mTypeToTType : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(tAbstractType, TypeToTAbstractType.class, "target")) {
				Type mType = mTypeToTType.getSource();
				if (mType != null) {
					for (MMethodNameToTMethod mNameToTName : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(tName, MMethodNameToTMethod.class, "target")) {
						MMethodName mName = mNameToTName.getSource();
						if (mName != null) {
							_result.add(new Object[] { mType, tSignature, mTypeToTType, tName, mName, tAbstractType,
									mNameToTName, match });
						}

					}
				}

			}
		}

		return _result;
	}

	public static final Iterable<Object[]> pattern_MethodSignature_12_3_findcontext_blackBBBBBBB(Type mType,
			TMethodSignature tSignature, TypeToTAbstractType mTypeToTType, TMethod tName, MMethodName mName,
			TAbstractType tAbstractType, MMethodNameToTMethod mNameToTName) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (mType.equals(mTypeToTType.getSource())) {
			if (tAbstractType.equals(tSignature.getReturnType())) {
				if (tAbstractType.equals(mTypeToTType.getTarget())) {
					if (tName.getSignatures().contains(tSignature)) {
						if (mName.equals(mNameToTName.getSource())) {
							if (tName.equals(mNameToTName.getTarget())) {
								int tSignature_lowerBound = tSignature.getLowerBound();
								if (Integer.valueOf(tSignature_lowerBound).equals(Integer.valueOf(0))) {
									_result.add(new Object[] { mType, tSignature, mTypeToTType, tName, mName,
											tAbstractType, mNameToTName });
								}

							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_MethodSignature_12_3_findcontext_greenBBBBBBBFFFFFFFF(Type mType,
			TMethodSignature tSignature, TypeToTAbstractType mTypeToTType, TMethod tName, MMethodName mName,
			TAbstractType tAbstractType, MMethodNameToTMethod mNameToTName) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge mTypeToTType__mType____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSignature__tAbstractType____returnType = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mTypeToTType__tAbstractType____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tName__tSignature____signatures = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSignature__tName____method = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mNameToTName__mName____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mNameToTName__tName____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String mTypeToTType__mType____source_name_prime = "source";
		String tSignature__tAbstractType____returnType_name_prime = "returnType";
		String mTypeToTType__tAbstractType____target_name_prime = "target";
		String tName__tSignature____signatures_name_prime = "signatures";
		String tSignature__tName____method_name_prime = "method";
		String mNameToTName__mName____source_name_prime = "source";
		String mNameToTName__tName____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(mType);
		isApplicableMatch.getAllContextElements().add(tSignature);
		isApplicableMatch.getAllContextElements().add(mTypeToTType);
		isApplicableMatch.getAllContextElements().add(tName);
		isApplicableMatch.getAllContextElements().add(mName);
		isApplicableMatch.getAllContextElements().add(tAbstractType);
		isApplicableMatch.getAllContextElements().add(mNameToTName);
		mTypeToTType__mType____source.setSrc(mTypeToTType);
		mTypeToTType__mType____source.setTrg(mType);
		isApplicableMatch.getAllContextElements().add(mTypeToTType__mType____source);
		tSignature__tAbstractType____returnType.setSrc(tSignature);
		tSignature__tAbstractType____returnType.setTrg(tAbstractType);
		isApplicableMatch.getAllContextElements().add(tSignature__tAbstractType____returnType);
		mTypeToTType__tAbstractType____target.setSrc(mTypeToTType);
		mTypeToTType__tAbstractType____target.setTrg(tAbstractType);
		isApplicableMatch.getAllContextElements().add(mTypeToTType__tAbstractType____target);
		tName__tSignature____signatures.setSrc(tName);
		tName__tSignature____signatures.setTrg(tSignature);
		isApplicableMatch.getAllContextElements().add(tName__tSignature____signatures);
		tSignature__tName____method.setSrc(tSignature);
		tSignature__tName____method.setTrg(tName);
		isApplicableMatch.getAllContextElements().add(tSignature__tName____method);
		mNameToTName__mName____source.setSrc(mNameToTName);
		mNameToTName__mName____source.setTrg(mName);
		isApplicableMatch.getAllContextElements().add(mNameToTName__mName____source);
		mNameToTName__tName____target.setSrc(mNameToTName);
		mNameToTName__tName____target.setTrg(tName);
		isApplicableMatch.getAllContextElements().add(mNameToTName__tName____target);
		mTypeToTType__mType____source.setName(mTypeToTType__mType____source_name_prime);
		tSignature__tAbstractType____returnType.setName(tSignature__tAbstractType____returnType_name_prime);
		mTypeToTType__tAbstractType____target.setName(mTypeToTType__tAbstractType____target_name_prime);
		tName__tSignature____signatures.setName(tName__tSignature____signatures_name_prime);
		tSignature__tName____method.setName(tSignature__tName____method_name_prime);
		mNameToTName__mName____source.setName(mNameToTName__mName____source_name_prime);
		mNameToTName__tName____target.setName(mNameToTName__tName____target_name_prime);
		return new Object[] { mType, tSignature, mTypeToTType, tName, mName, tAbstractType, mNameToTName,
				isApplicableMatch, mTypeToTType__mType____source, tSignature__tAbstractType____returnType,
				mTypeToTType__tAbstractType____target, tName__tSignature____signatures, tSignature__tName____method,
				mNameToTName__mName____source, mNameToTName__tName____target };
	}

	public static final Object[] pattern_MethodSignature_12_4_solveCSP_bindingFBBBBBBBBB(MethodSignature _this,
			IsApplicableMatch isApplicableMatch, Type mType, TMethodSignature tSignature,
			TypeToTAbstractType mTypeToTType, TMethod tName, MMethodName mName, TAbstractType tAbstractType,
			MMethodNameToTMethod mNameToTName) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, mType, tSignature, mTypeToTType,
				tName, mName, tAbstractType, mNameToTName);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mType, tSignature, mTypeToTType, tName, mName,
					tAbstractType, mNameToTName };
		}
		return null;
	}

	public static final Object[] pattern_MethodSignature_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MethodSignature_12_4_solveCSP_bindingAndBlackFBBBBBBBBB(MethodSignature _this,
			IsApplicableMatch isApplicableMatch, Type mType, TMethodSignature tSignature,
			TypeToTAbstractType mTypeToTType, TMethod tName, MMethodName mName, TAbstractType tAbstractType,
			MMethodNameToTMethod mNameToTName) {
		Object[] result_pattern_MethodSignature_12_4_solveCSP_binding = pattern_MethodSignature_12_4_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, mType, tSignature, mTypeToTType, tName, mName, tAbstractType, mNameToTName);
		if (result_pattern_MethodSignature_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_MethodSignature_12_4_solveCSP_binding[0];

			Object[] result_pattern_MethodSignature_12_4_solveCSP_black = pattern_MethodSignature_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_MethodSignature_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mType, tSignature, mTypeToTType, tName, mName,
						tAbstractType, mNameToTName };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodSignature_12_5_checkCSP_expressionFBB(MethodSignature _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodSignature_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_MethodSignature_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "MethodSignature";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_MethodSignature_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_MethodSignature_20_1_preparereturnvalue_bindingFB(MethodSignature _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_MethodSignature_20_1_preparereturnvalue_blackFBBF(EClass __eClass,
			MethodSignature _this) {
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

	public static final Object[] pattern_MethodSignature_20_1_preparereturnvalue_bindingAndBlackFFBF(
			MethodSignature _this) {
		Object[] result_pattern_MethodSignature_20_1_preparereturnvalue_binding = pattern_MethodSignature_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_MethodSignature_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_MethodSignature_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_MethodSignature_20_1_preparereturnvalue_black = pattern_MethodSignature_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_MethodSignature_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_MethodSignature_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_MethodSignature_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodSignature_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_MethodSignature_20_2_testcorematchandDECs_black_nac_0BB(
			TMethodSignature tSignature, TMethod tName) {
		TMethod __DEC_tSignature_method_245601 = tSignature.getMethod();
		if (__DEC_tSignature_method_245601 != null) {
			if (!tName.equals(__DEC_tSignature_method_245601)) {
				return new Object[] { tSignature, tName };
			}
		}

		return null;
	}

	public static final Iterable<Object[]> pattern_MethodSignature_20_2_testcorematchandDECs_blackFFFB(
			EMoflonEdge _edge_returnType) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpTSignature = _edge_returnType.getSrc();
		if (tmpTSignature instanceof TMethodSignature) {
			TMethodSignature tSignature = (TMethodSignature) tmpTSignature;
			EObject tmpTAbstractType = _edge_returnType.getTrg();
			if (tmpTAbstractType instanceof TAbstractType) {
				TAbstractType tAbstractType = (TAbstractType) tmpTAbstractType;
				if (tAbstractType.equals(tSignature.getReturnType())) {
					TMethod tName = tSignature.getMethod();
					if (tName != null) {
						int tSignature_lowerBound = tSignature.getLowerBound();
						if (Integer.valueOf(tSignature_lowerBound).equals(Integer.valueOf(0))) {
							if (pattern_MethodSignature_20_2_testcorematchandDECs_black_nac_0BB(tSignature,
									tName) == null) {
								_result.add(new Object[] { tSignature, tName, tAbstractType, _edge_returnType });
							}
						}

					}

				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_MethodSignature_20_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_MethodSignature_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
			MethodSignature _this, Match match, TMethodSignature tSignature, TMethod tName,
			TAbstractType tAbstractType) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, tSignature, tName, tAbstractType);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_MethodSignature_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			MethodSignature _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodSignature_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_MethodSignature_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_MethodSignature_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_MethodSignature_21_1_preparereturnvalue_bindingFB(MethodSignature _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_MethodSignature_21_1_preparereturnvalue_blackFBBF(EClass __eClass,
			MethodSignature _this) {
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

	public static final Object[] pattern_MethodSignature_21_1_preparereturnvalue_bindingAndBlackFFBF(
			MethodSignature _this) {
		Object[] result_pattern_MethodSignature_21_1_preparereturnvalue_binding = pattern_MethodSignature_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_MethodSignature_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_MethodSignature_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_MethodSignature_21_1_preparereturnvalue_black = pattern_MethodSignature_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_MethodSignature_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_MethodSignature_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_MethodSignature_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodSignature_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_MethodSignature_21_2_testcorematchandDECs_blackFFFB(
			EMoflonEdge _edge_mSignatures) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpMName = _edge_mSignatures.getSrc();
		if (tmpMName instanceof MMethodName) {
			MMethodName mName = (MMethodName) tmpMName;
			EObject tmpMSignature = _edge_mSignatures.getTrg();
			if (tmpMSignature instanceof MMethodSignature) {
				MMethodSignature mSignature = (MMethodSignature) tmpMSignature;
				if (mName.getMSignatures().contains(mSignature)) {
					Type mType = mSignature.getReturnType();
					if (mType != null) {
						_result.add(new Object[] { mType, mName, mSignature, _edge_mSignatures });
					}

				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_MethodSignature_21_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_MethodSignature_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
			MethodSignature _this, Match match, Type mType, MMethodName mName, MMethodSignature mSignature) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, mType, mName, mSignature);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_MethodSignature_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			MethodSignature _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodSignature_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_MethodSignature_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_MethodSignature_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_MethodSignature_24_1_prepare_blackB(MethodSignature _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_MethodSignature_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_MethodSignature_24_2_matchsrctrgcontext_bindingFFFFFFBB(Match sourceMatch,
			Match targetMatch) {
		EObject _localVariable_0 = sourceMatch.getObject("mType");
		EObject _localVariable_1 = targetMatch.getObject("tSignature");
		EObject _localVariable_2 = targetMatch.getObject("tName");
		EObject _localVariable_3 = sourceMatch.getObject("mName");
		EObject _localVariable_4 = targetMatch.getObject("tAbstractType");
		EObject _localVariable_5 = sourceMatch.getObject("mSignature");
		EObject tmpMType = _localVariable_0;
		EObject tmpTSignature = _localVariable_1;
		EObject tmpTName = _localVariable_2;
		EObject tmpMName = _localVariable_3;
		EObject tmpTAbstractType = _localVariable_4;
		EObject tmpMSignature = _localVariable_5;
		if (tmpMType instanceof Type) {
			Type mType = (Type) tmpMType;
			if (tmpTSignature instanceof TMethodSignature) {
				TMethodSignature tSignature = (TMethodSignature) tmpTSignature;
				if (tmpTName instanceof TMethod) {
					TMethod tName = (TMethod) tmpTName;
					if (tmpMName instanceof MMethodName) {
						MMethodName mName = (MMethodName) tmpMName;
						if (tmpTAbstractType instanceof TAbstractType) {
							TAbstractType tAbstractType = (TAbstractType) tmpTAbstractType;
							if (tmpMSignature instanceof MMethodSignature) {
								MMethodSignature mSignature = (MMethodSignature) tmpMSignature;
								return new Object[] { mType, tSignature, tName, mName, tAbstractType, mSignature,
										sourceMatch, targetMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodSignature_24_2_matchsrctrgcontext_blackBBBBBBBB(Type mType,
			TMethodSignature tSignature, TMethod tName, MMethodName mName, TAbstractType tAbstractType,
			MMethodSignature mSignature, Match sourceMatch, Match targetMatch) {
		if (!sourceMatch.equals(targetMatch)) {
			int tSignature_lowerBound = tSignature.getLowerBound();
			if (Integer.valueOf(tSignature_lowerBound).equals(Integer.valueOf(0))) {
				return new Object[] { mType, tSignature, tName, mName, tAbstractType, mSignature, sourceMatch,
						targetMatch };
			}

		}
		return null;
	}

	public static final Object[] pattern_MethodSignature_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_MethodSignature_24_2_matchsrctrgcontext_binding = pattern_MethodSignature_24_2_matchsrctrgcontext_bindingFFFFFFBB(
				sourceMatch, targetMatch);
		if (result_pattern_MethodSignature_24_2_matchsrctrgcontext_binding != null) {
			Type mType = (Type) result_pattern_MethodSignature_24_2_matchsrctrgcontext_binding[0];
			TMethodSignature tSignature = (TMethodSignature) result_pattern_MethodSignature_24_2_matchsrctrgcontext_binding[1];
			TMethod tName = (TMethod) result_pattern_MethodSignature_24_2_matchsrctrgcontext_binding[2];
			MMethodName mName = (MMethodName) result_pattern_MethodSignature_24_2_matchsrctrgcontext_binding[3];
			TAbstractType tAbstractType = (TAbstractType) result_pattern_MethodSignature_24_2_matchsrctrgcontext_binding[4];
			MMethodSignature mSignature = (MMethodSignature) result_pattern_MethodSignature_24_2_matchsrctrgcontext_binding[5];

			Object[] result_pattern_MethodSignature_24_2_matchsrctrgcontext_black = pattern_MethodSignature_24_2_matchsrctrgcontext_blackBBBBBBBB(
					mType, tSignature, tName, mName, tAbstractType, mSignature, sourceMatch, targetMatch);
			if (result_pattern_MethodSignature_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { mType, tSignature, tName, mName, tAbstractType, mSignature, sourceMatch,
						targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodSignature_24_3_solvecsp_bindingFBBBBBBBBB(MethodSignature _this,
			Type mType, TMethodSignature tSignature, TMethod tName, MMethodName mName, TAbstractType tAbstractType,
			MMethodSignature mSignature, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_6 = _this.isApplicable_solveCsp_CC(mType, tSignature, tName, mName, tAbstractType,
				mSignature, sourceMatch, targetMatch);
		CSP csp = _localVariable_6;
		if (csp != null) {
			return new Object[] { csp, _this, mType, tSignature, tName, mName, tAbstractType, mSignature, sourceMatch,
					targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_MethodSignature_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MethodSignature_24_3_solvecsp_bindingAndBlackFBBBBBBBBB(MethodSignature _this,
			Type mType, TMethodSignature tSignature, TMethod tName, MMethodName mName, TAbstractType tAbstractType,
			MMethodSignature mSignature, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_MethodSignature_24_3_solvecsp_binding = pattern_MethodSignature_24_3_solvecsp_bindingFBBBBBBBBB(
				_this, mType, tSignature, tName, mName, tAbstractType, mSignature, sourceMatch, targetMatch);
		if (result_pattern_MethodSignature_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_MethodSignature_24_3_solvecsp_binding[0];

			Object[] result_pattern_MethodSignature_24_3_solvecsp_black = pattern_MethodSignature_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_MethodSignature_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, mType, tSignature, tName, mName, tAbstractType, mSignature,
						sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodSignature_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_MethodSignature_24_5_matchcorrcontext_blackBFBBBFBB(Type mType,
			TMethod tName, MMethodName mName, TAbstractType tAbstractType, Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (TypeToTAbstractType mTypeToTType : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(mType, TypeToTAbstractType.class, "source")) {
				if (tAbstractType.equals(mTypeToTType.getTarget())) {
					for (MMethodNameToTMethod mNameToTName : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(mName, MMethodNameToTMethod.class, "source")) {
						if (tName.equals(mNameToTName.getTarget())) {
							_result.add(new Object[] { mType, mTypeToTType, tName, mName, tAbstractType, mNameToTName,
									sourceMatch, targetMatch });
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_MethodSignature_24_5_matchcorrcontext_greenBBBBF(
			TypeToTAbstractType mTypeToTType, MMethodNameToTMethod mNameToTName, Match sourceMatch, Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "MethodSignature";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(mTypeToTType);
		ccMatch.getAllContextElements().add(mNameToTName);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { mTypeToTType, mNameToTName, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_MethodSignature_24_6_createcorrespondence_blackBBBBBBB(Type mType,
			TMethodSignature tSignature, TMethod tName, MMethodName mName, TAbstractType tAbstractType,
			MMethodSignature mSignature, CCMatch ccMatch) {
		return new Object[] { mType, tSignature, tName, mName, tAbstractType, mSignature, ccMatch };
	}

	public static final Object[] pattern_MethodSignature_24_6_createcorrespondence_greenBFFBB(
			TMethodSignature tSignature, MMethodSignature mSignature, CCMatch ccMatch) {
		MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement = PmFactory.eINSTANCE
				.createMAbstractFlowElementToTAbstractFlowElement();
		MSignatureToTSignature mSignatureToTSignature = PmFactory.eINSTANCE.createMSignatureToTSignature();
		mFlowElementToTFlowElement.setTarget(tSignature);
		mFlowElementToTFlowElement.setSource(mSignature);
		ccMatch.getCreateCorr().add(mFlowElementToTFlowElement);
		mSignatureToTSignature.setTarget(tSignature);
		mSignatureToTSignature.setSource(mSignature);
		ccMatch.getCreateCorr().add(mSignatureToTSignature);
		return new Object[] { tSignature, mFlowElementToTFlowElement, mSignatureToTSignature, mSignature, ccMatch };
	}

	public static final Object[] pattern_MethodSignature_24_7_addtoreturnedresult_blackBB(IsApplicableRuleResult result,
			CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_MethodSignature_24_7_addtoreturnedresult_greenBB(IsApplicableRuleResult result,
			CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "MethodSignature";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_MethodSignature_24_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_MethodSignature_27_1_matchtggpattern_blackBBB(Type mType, MMethodName mName,
			MMethodSignature mSignature) {
		if (mName.getMSignatures().contains(mSignature)) {
			if (mType.equals(mSignature.getReturnType())) {
				return new Object[] { mType, mName, mSignature };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodSignature_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_MethodSignature_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_MethodSignature_28_1_matchtggpattern_black_nac_0BB(TMethodSignature tSignature,
			TMethod tName) {
		TMethod __DEC_tSignature_method_577282 = tSignature.getMethod();
		if (__DEC_tSignature_method_577282 != null) {
			if (!tName.equals(__DEC_tSignature_method_577282)) {
				return new Object[] { tSignature, tName };
			}
		}

		return null;
	}

	public static final Object[] pattern_MethodSignature_28_1_matchtggpattern_blackBBB(TMethodSignature tSignature,
			TMethod tName, TAbstractType tAbstractType) {
		if (tAbstractType.equals(tSignature.getReturnType())) {
			if (tName.getSignatures().contains(tSignature)) {
				if (pattern_MethodSignature_28_1_matchtggpattern_black_nac_0BB(tSignature, tName) == null) {
					return new Object[] { tSignature, tName, tAbstractType };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodSignature_28_1_matchtggpattern_greenB(TMethodSignature tSignature) {
		int tSignature_lowerBound_prime = Integer.valueOf(0);
		tSignature.setLowerBound(Integer.valueOf(tSignature_lowerBound_prime));
		return new Object[] { tSignature };
	}

	public static final boolean pattern_MethodSignature_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_MethodSignature_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_MethodSignature_29_1_createresult_blackB(MethodSignature _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_MethodSignature_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_MethodSignature_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, Type mType) {
		if (ruleResult.getSourceObjects().contains(mType)) {
			return new Object[] { ruleResult, mType };
		}
		return null;
	}

	public static final Object[] pattern_MethodSignature_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, TypeToTAbstractType mTypeToTType) {
		if (ruleResult.getCorrObjects().contains(mTypeToTType)) {
			return new Object[] { ruleResult, mTypeToTType };
		}
		return null;
	}

	public static final Object[] pattern_MethodSignature_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, TAbstractType tAbstractType) {
		if (ruleResult.getTargetObjects().contains(tAbstractType)) {
			return new Object[] { ruleResult, tAbstractType };
		}
		return null;
	}

	public static final Object[] pattern_MethodSignature_29_2_isapplicablecore_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, TMethod tName) {
		if (ruleResult.getTargetObjects().contains(tName)) {
			return new Object[] { ruleResult, tName };
		}
		return null;
	}

	public static final Object[] pattern_MethodSignature_29_2_isapplicablecore_black_nac_4BB(
			ModelgeneratorRuleResult ruleResult, MMethodNameToTMethod mNameToTName) {
		if (ruleResult.getCorrObjects().contains(mNameToTName)) {
			return new Object[] { ruleResult, mNameToTName };
		}
		return null;
	}

	public static final Object[] pattern_MethodSignature_29_2_isapplicablecore_black_nac_5BB(
			ModelgeneratorRuleResult ruleResult, MMethodName mName) {
		if (ruleResult.getSourceObjects().contains(mName)) {
			return new Object[] { ruleResult, mName };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_MethodSignature_29_2_isapplicablecore_blackFFFFFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList mTypeToTTypeList : ruleEntryContainer.getRuleEntryList()) {
			for (RuleEntryList mNameToTNameList : ruleEntryContainer.getRuleEntryList()) {
				if (!mNameToTNameList.equals(mTypeToTTypeList)) {
					for (EObject tmpMTypeToTType : mTypeToTTypeList.getEntryObjects()) {
						if (tmpMTypeToTType instanceof TypeToTAbstractType) {
							TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) tmpMTypeToTType;
							Type mType = mTypeToTType.getSource();
							if (mType != null) {
								TAbstractType tAbstractType = mTypeToTType.getTarget();
								if (tAbstractType != null) {
									if (pattern_MethodSignature_29_2_isapplicablecore_black_nac_1BB(ruleResult,
											mTypeToTType) == null) {
										if (pattern_MethodSignature_29_2_isapplicablecore_black_nac_0BB(ruleResult,
												mType) == null) {
											if (pattern_MethodSignature_29_2_isapplicablecore_black_nac_2BB(ruleResult,
													tAbstractType) == null) {
												for (EObject tmpMNameToTName : mNameToTNameList.getEntryObjects()) {
													if (tmpMNameToTName instanceof MMethodNameToTMethod) {
														MMethodNameToTMethod mNameToTName = (MMethodNameToTMethod) tmpMNameToTName;
														TMethod tName = mNameToTName.getTarget();
														if (tName != null) {
															MMethodName mName = mNameToTName.getSource();
															if (mName != null) {
																if (pattern_MethodSignature_29_2_isapplicablecore_black_nac_4BB(
																		ruleResult, mNameToTName) == null) {
																	if (pattern_MethodSignature_29_2_isapplicablecore_black_nac_3BB(
																			ruleResult, tName) == null) {
																		if (pattern_MethodSignature_29_2_isapplicablecore_black_nac_5BB(
																				ruleResult, mName) == null) {
																			_result.add(new Object[] { mTypeToTTypeList,
																					mType, mTypeToTType, tAbstractType,
																					mNameToTNameList, tName,
																					mNameToTName, mName,
																					ruleEntryContainer, ruleResult });
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

	public static final Object[] pattern_MethodSignature_29_3_solveCSP_bindingFBBBBBBBBB(MethodSignature _this,
			IsApplicableMatch isApplicableMatch, Type mType, TypeToTAbstractType mTypeToTType, TMethod tName,
			MMethodName mName, TAbstractType tAbstractType, MMethodNameToTMethod mNameToTName,
			ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, mType, mTypeToTType, tName, mName,
				tAbstractType, mNameToTName, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mType, mTypeToTType, tName, mName, tAbstractType,
					mNameToTName, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_MethodSignature_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MethodSignature_29_3_solveCSP_bindingAndBlackFBBBBBBBBB(MethodSignature _this,
			IsApplicableMatch isApplicableMatch, Type mType, TypeToTAbstractType mTypeToTType, TMethod tName,
			MMethodName mName, TAbstractType tAbstractType, MMethodNameToTMethod mNameToTName,
			ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_MethodSignature_29_3_solveCSP_binding = pattern_MethodSignature_29_3_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, mType, mTypeToTType, tName, mName, tAbstractType, mNameToTName, ruleResult);
		if (result_pattern_MethodSignature_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_MethodSignature_29_3_solveCSP_binding[0];

			Object[] result_pattern_MethodSignature_29_3_solveCSP_black = pattern_MethodSignature_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_MethodSignature_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mType, mTypeToTType, tName, mName, tAbstractType,
						mNameToTName, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodSignature_29_4_checkCSP_expressionFBB(MethodSignature _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodSignature_29_5_checknacs_blackBBBBBB(Type mType,
			TypeToTAbstractType mTypeToTType, TMethod tName, MMethodName mName, TAbstractType tAbstractType,
			MMethodNameToTMethod mNameToTName) {
		return new Object[] { mType, mTypeToTType, tName, mName, tAbstractType, mNameToTName };
	}

	public static final Object[] pattern_MethodSignature_29_6_perform_blackBBBBBBB(Type mType,
			TypeToTAbstractType mTypeToTType, TMethod tName, MMethodName mName, TAbstractType tAbstractType,
			MMethodNameToTMethod mNameToTName, ModelgeneratorRuleResult ruleResult) {
		return new Object[] { mType, mTypeToTType, tName, mName, tAbstractType, mNameToTName, ruleResult };
	}

	public static final Object[] pattern_MethodSignature_29_6_perform_greenBFFBFBBFBB(Type mType, TMethod tName,
			MMethodName mName, TAbstractType tAbstractType, ModelgeneratorRuleResult ruleResult, CSP csp) {
		TMethodSignature tSignature = BasicFactory.eINSTANCE.createTMethodSignature();
		MAbstractFlowElementToTAbstractFlowElement mFlowElementToTFlowElement = PmFactory.eINSTANCE
				.createMAbstractFlowElementToTAbstractFlowElement();
		MSignatureToTSignature mSignatureToTSignature = PmFactory.eINSTANCE.createMSignatureToTSignature();
		MMethodSignature mSignature = ModiscoFactory.eINSTANCE.createMMethodSignature();
		int tSignature_lowerBound_prime = Integer.valueOf(0);
		Object _localVariable_0 = csp.getValue("tSignature", "upperBound");
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_1 = ruleResult.getIncrementedPerformCount();
		tSignature.setReturnType(tAbstractType);
		tName.getSignatures().add(tSignature);
		ruleResult.getTargetObjects().add(tSignature);
		mFlowElementToTFlowElement.setTarget(tSignature);
		ruleResult.getCorrObjects().add(mFlowElementToTFlowElement);
		mSignatureToTSignature.setTarget(tSignature);
		ruleResult.getCorrObjects().add(mSignatureToTSignature);
		mName.getMSignatures().add(mSignature);
		mFlowElementToTFlowElement.setSource(mSignature);
		mSignatureToTSignature.setSource(mSignature);
		mSignature.setReturnType(mType);
		ruleResult.getSourceObjects().add(mSignature);
		tSignature.setLowerBound(Integer.valueOf(tSignature_lowerBound_prime));
		int tSignature_upperBound_prime = (int) _localVariable_0;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_1);
		tSignature.setUpperBound(Integer.valueOf(tSignature_upperBound_prime));
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { mType, tSignature, mFlowElementToTFlowElement, tName, mSignatureToTSignature, mName,
				tAbstractType, mSignature, ruleResult, csp };
	}

	public static final ModelgeneratorRuleResult pattern_MethodSignature_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //MethodSignatureImpl
