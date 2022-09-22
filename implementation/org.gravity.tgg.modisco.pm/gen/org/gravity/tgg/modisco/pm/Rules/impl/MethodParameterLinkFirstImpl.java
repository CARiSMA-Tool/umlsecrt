/**
 */
package org.gravity.tgg.modisco.pm.Rules.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.LinkedList;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;

import org.gravity.modisco.MEntry;
import org.gravity.modisco.MMethodSignature;
import org.gravity.modisco.MSignature;

import org.gravity.tgg.modisco.pm.MEntryToTParameter;
import org.gravity.tgg.modisco.pm.MSignatureToTSignature;

import org.gravity.tgg.modisco.pm.Rules.MethodParameterLinkFirst;
import org.gravity.tgg.modisco.pm.Rules.RulesPackage;

import org.gravity.typegraph.basic.TMethodSignature;
import org.gravity.typegraph.basic.TParameter;
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
 * An implementation of the model object '<em><b>Method Parameter Link First</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class MethodParameterLinkFirstImpl extends AbstractRuleImpl implements MethodParameterLinkFirst {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MethodParameterLinkFirstImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getMethodParameterLinkFirst();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, MMethodSignature mParameterList, MEntry mEntry) {

		Object[] result1_black = MethodParameterLinkFirstImpl
				.pattern_MethodParameterLinkFirst_0_1_initialbindings_blackBBBB(this, match, mParameterList, mEntry);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[match] = " + match
							+ ", " + "[mParameterList] = " + mParameterList + ", " + "[mEntry] = " + mEntry + ".");
		}

		Object[] result2_bindingAndBlack = MethodParameterLinkFirstImpl
				.pattern_MethodParameterLinkFirst_0_2_SolveCSP_bindingAndBlackFBBBB(this, match, mParameterList,
						mEntry);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[match] = " + match
							+ ", " + "[mParameterList] = " + mParameterList + ", " + "[mEntry] = " + mEntry + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (MethodParameterLinkFirstImpl.pattern_MethodParameterLinkFirst_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = MethodParameterLinkFirstImpl
					.pattern_MethodParameterLinkFirst_0_4_collectelementstobetranslated_blackBBB(match, mParameterList,
							mEntry);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[mParameterList] = " + mParameterList + ", " + "[mEntry] = " + mEntry + ".");
			}
			MethodParameterLinkFirstImpl.pattern_MethodParameterLinkFirst_0_4_collectelementstobetranslated_greenBBBF(
					match, mParameterList, mEntry);
			//nothing EMoflonEdge mParameterList__mEntry____mFirstEntry = (EMoflonEdge) result4_green[3];

			Object[] result5_black = MethodParameterLinkFirstImpl
					.pattern_MethodParameterLinkFirst_0_5_collectcontextelements_blackBBB(match, mParameterList,
							mEntry);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[mParameterList] = " + mParameterList + ", " + "[mEntry] = " + mEntry + ".");
			}
			MethodParameterLinkFirstImpl.pattern_MethodParameterLinkFirst_0_5_collectcontextelements_greenBBB(match,
					mParameterList, mEntry);

			// 
			MethodParameterLinkFirstImpl.pattern_MethodParameterLinkFirst_0_6_registerobjectstomatch_expressionBBBB(
					this, match, mParameterList, mEntry);
			return MethodParameterLinkFirstImpl.pattern_MethodParameterLinkFirst_0_7_expressionF();
		} else {
			return MethodParameterLinkFirstImpl.pattern_MethodParameterLinkFirst_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = MethodParameterLinkFirstImpl
				.pattern_MethodParameterLinkFirst_1_1_performtransformation_bindingAndBlackFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		MSignatureToTSignature mmethodSignatureToTMethodSignature = (MSignatureToTSignature) result1_bindingAndBlack[0];
		TMethodSignature tMethodSignature = (TMethodSignature) result1_bindingAndBlack[1];
		TParameter tParameter = (TParameter) result1_bindingAndBlack[2];
		MMethodSignature mParameterList = (MMethodSignature) result1_bindingAndBlack[3];
		MEntry mEntry = (MEntry) result1_bindingAndBlack[4];
		MEntryToTParameter eSingleVariableDeclarationToTParameter = (MEntryToTParameter) result1_bindingAndBlack[5];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[6];
		MethodParameterLinkFirstImpl
				.pattern_MethodParameterLinkFirst_1_1_performtransformation_greenBB(tMethodSignature, tParameter);

		Object[] result2_green = MethodParameterLinkFirstImpl
				.pattern_MethodParameterLinkFirst_1_2_collecttranslatedelements_greenF();
		if (result2_green == null) {
			throw new RuntimeException("Pattern matching failed.");
		}
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = MethodParameterLinkFirstImpl
				.pattern_MethodParameterLinkFirst_1_3_bookkeepingforedges_blackBBBBBBB(ruleresult,
						mmethodSignatureToTMethodSignature, tMethodSignature, tParameter, mParameterList, mEntry,
						eSingleVariableDeclarationToTParameter);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[mmethodSignatureToTMethodSignature] = " + mmethodSignatureToTMethodSignature + ", "
					+ "[tMethodSignature] = " + tMethodSignature + ", " + "[tParameter] = " + tParameter + ", "
					+ "[mParameterList] = " + mParameterList + ", " + "[mEntry] = " + mEntry + ", "
					+ "[eSingleVariableDeclarationToTParameter] = " + eSingleVariableDeclarationToTParameter + ".");
		}
		MethodParameterLinkFirstImpl.pattern_MethodParameterLinkFirst_1_3_bookkeepingforedges_greenBBBBBFF(ruleresult,
				tMethodSignature, tParameter, mParameterList, mEntry);
		//nothing EMoflonEdge tMethodSignature__tParameter____firstParameter = (EMoflonEdge) result3_green[5];
		//nothing EMoflonEdge mParameterList__mEntry____mFirstEntry = (EMoflonEdge) result3_green[6];

		// 
		// 
		MethodParameterLinkFirstImpl.pattern_MethodParameterLinkFirst_1_5_registerobjects_expressionBBBBBBBB(this,
				ruleresult, mmethodSignatureToTMethodSignature, tMethodSignature, tParameter, mParameterList, mEntry,
				eSingleVariableDeclarationToTParameter);
		return MethodParameterLinkFirstImpl.pattern_MethodParameterLinkFirst_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = MethodParameterLinkFirstImpl
				.pattern_MethodParameterLinkFirst_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = MethodParameterLinkFirstImpl
				.pattern_MethodParameterLinkFirst_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = MethodParameterLinkFirstImpl
				.pattern_MethodParameterLinkFirst_2_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		MMethodSignature mParameterList = (MMethodSignature) result2_binding[0];
		MEntry mEntry = (MEntry) result2_binding[1];
		for (Object[] result2_black : MethodParameterLinkFirstImpl
				.pattern_MethodParameterLinkFirst_2_2_corematch_blackFFFBBFB(mParameterList, mEntry, match)) {
			MSignatureToTSignature mmethodSignatureToTMethodSignature = (MSignatureToTSignature) result2_black[0];
			TMethodSignature tMethodSignature = (TMethodSignature) result2_black[1];
			TParameter tParameter = (TParameter) result2_black[2];
			MEntryToTParameter eSingleVariableDeclarationToTParameter = (MEntryToTParameter) result2_black[5];
			// ForEach 
			for (Object[] result3_black : MethodParameterLinkFirstImpl
					.pattern_MethodParameterLinkFirst_2_3_findcontext_blackBBBBBB(mmethodSignatureToTMethodSignature,
							tMethodSignature, tParameter, mParameterList, mEntry,
							eSingleVariableDeclarationToTParameter)) {
				Object[] result3_green = MethodParameterLinkFirstImpl
						.pattern_MethodParameterLinkFirst_2_3_findcontext_greenBBBBBBFFFFFF(
								mmethodSignatureToTMethodSignature, tMethodSignature, tParameter, mParameterList,
								mEntry, eSingleVariableDeclarationToTParameter);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[6];
				//nothing EMoflonEdge mmethodSignatureToTMethodSignature__mParameterList____source = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge mmethodSignatureToTMethodSignature__tMethodSignature____target = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge eSingleVariableDeclarationToTParameter__tParameter____target = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge eSingleVariableDeclarationToTParameter__mEntry____source = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge mParameterList__mEntry____mFirstEntry = (EMoflonEdge) result3_green[11];

				Object[] result4_bindingAndBlack = MethodParameterLinkFirstImpl
						.pattern_MethodParameterLinkFirst_2_4_solveCSP_bindingAndBlackFBBBBBBBB(this, isApplicableMatch,
								mmethodSignatureToTMethodSignature, tMethodSignature, tParameter, mParameterList,
								mEntry, eSingleVariableDeclarationToTParameter);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", "
							+ "[mmethodSignatureToTMethodSignature] = " + mmethodSignatureToTMethodSignature + ", "
							+ "[tMethodSignature] = " + tMethodSignature + ", " + "[tParameter] = " + tParameter + ", "
							+ "[mParameterList] = " + mParameterList + ", " + "[mEntry] = " + mEntry + ", "
							+ "[eSingleVariableDeclarationToTParameter] = " + eSingleVariableDeclarationToTParameter
							+ ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (MethodParameterLinkFirstImpl.pattern_MethodParameterLinkFirst_2_5_checkCSP_expressionFBB(this,
						csp)) {

					Object[] result6_black = MethodParameterLinkFirstImpl
							.pattern_MethodParameterLinkFirst_2_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					MethodParameterLinkFirstImpl.pattern_MethodParameterLinkFirst_2_6_addmatchtoruleresult_greenBB(
							ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return MethodParameterLinkFirstImpl.pattern_MethodParameterLinkFirst_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, MMethodSignature mParameterList, MEntry mEntry) {
		match.registerObject("mParameterList", mParameterList);
		match.registerObject("mEntry", mEntry);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, MMethodSignature mParameterList, MEntry mEntry) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch,
			MSignatureToTSignature mmethodSignatureToTMethodSignature, TMethodSignature tMethodSignature,
			TParameter tParameter, MMethodSignature mParameterList, MEntry mEntry,
			MEntryToTParameter eSingleVariableDeclarationToTParameter) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("mmethodSignatureToTMethodSignature", mmethodSignatureToTMethodSignature);
		isApplicableMatch.registerObject("tMethodSignature", tMethodSignature);
		isApplicableMatch.registerObject("tParameter", tParameter);
		isApplicableMatch.registerObject("mParameterList", mParameterList);
		isApplicableMatch.registerObject("mEntry", mEntry);
		isApplicableMatch.registerObject("eSingleVariableDeclarationToTParameter",
				eSingleVariableDeclarationToTParameter);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject mmethodSignatureToTMethodSignature,
			EObject tMethodSignature, EObject tParameter, EObject mParameterList, EObject mEntry,
			EObject eSingleVariableDeclarationToTParameter) {
		ruleresult.registerObject("mmethodSignatureToTMethodSignature", mmethodSignatureToTMethodSignature);
		ruleresult.registerObject("tMethodSignature", tMethodSignature);
		ruleresult.registerObject("tParameter", tParameter);
		ruleresult.registerObject("mParameterList", mParameterList);
		ruleresult.registerObject("mEntry", mEntry);
		ruleresult.registerObject("eSingleVariableDeclarationToTParameter", eSingleVariableDeclarationToTParameter);

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
	public boolean isAppropriate_BWD(Match match, TMethodSignature tMethodSignature, TParameter tParameter) {

		Object[] result1_black = MethodParameterLinkFirstImpl
				.pattern_MethodParameterLinkFirst_10_1_initialbindings_blackBBBB(this, match, tMethodSignature,
						tParameter);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[tMethodSignature] = " + tMethodSignature + ", "
					+ "[tParameter] = " + tParameter + ".");
		}

		Object[] result2_bindingAndBlack = MethodParameterLinkFirstImpl
				.pattern_MethodParameterLinkFirst_10_2_SolveCSP_bindingAndBlackFBBBB(this, match, tMethodSignature,
						tParameter);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[tMethodSignature] = " + tMethodSignature + ", "
					+ "[tParameter] = " + tParameter + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (MethodParameterLinkFirstImpl.pattern_MethodParameterLinkFirst_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = MethodParameterLinkFirstImpl
					.pattern_MethodParameterLinkFirst_10_4_collectelementstobetranslated_blackBBB(match,
							tMethodSignature, tParameter);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[tMethodSignature] = " + tMethodSignature + ", " + "[tParameter] = " + tParameter + ".");
			}
			MethodParameterLinkFirstImpl.pattern_MethodParameterLinkFirst_10_4_collectelementstobetranslated_greenBBBF(
					match, tMethodSignature, tParameter);
			//nothing EMoflonEdge tMethodSignature__tParameter____firstParameter = (EMoflonEdge) result4_green[3];

			Object[] result5_black = MethodParameterLinkFirstImpl
					.pattern_MethodParameterLinkFirst_10_5_collectcontextelements_blackBBB(match, tMethodSignature,
							tParameter);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[tMethodSignature] = " + tMethodSignature + ", " + "[tParameter] = " + tParameter + ".");
			}
			MethodParameterLinkFirstImpl.pattern_MethodParameterLinkFirst_10_5_collectcontextelements_greenBBB(match,
					tMethodSignature, tParameter);

			// 
			MethodParameterLinkFirstImpl.pattern_MethodParameterLinkFirst_10_6_registerobjectstomatch_expressionBBBB(
					this, match, tMethodSignature, tParameter);
			return MethodParameterLinkFirstImpl.pattern_MethodParameterLinkFirst_10_7_expressionF();
		} else {
			return MethodParameterLinkFirstImpl.pattern_MethodParameterLinkFirst_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = MethodParameterLinkFirstImpl
				.pattern_MethodParameterLinkFirst_11_1_performtransformation_bindingAndBlackFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		MSignatureToTSignature mmethodSignatureToTMethodSignature = (MSignatureToTSignature) result1_bindingAndBlack[0];
		TMethodSignature tMethodSignature = (TMethodSignature) result1_bindingAndBlack[1];
		TParameter tParameter = (TParameter) result1_bindingAndBlack[2];
		MMethodSignature mParameterList = (MMethodSignature) result1_bindingAndBlack[3];
		MEntry mEntry = (MEntry) result1_bindingAndBlack[4];
		MEntryToTParameter eSingleVariableDeclarationToTParameter = (MEntryToTParameter) result1_bindingAndBlack[5];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[6];
		MethodParameterLinkFirstImpl.pattern_MethodParameterLinkFirst_11_1_performtransformation_greenBB(mParameterList,
				mEntry);

		Object[] result2_green = MethodParameterLinkFirstImpl
				.pattern_MethodParameterLinkFirst_11_2_collecttranslatedelements_greenF();
		if (result2_green == null) {
			throw new RuntimeException("Pattern matching failed.");
		}
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = MethodParameterLinkFirstImpl
				.pattern_MethodParameterLinkFirst_11_3_bookkeepingforedges_blackBBBBBBB(ruleresult,
						mmethodSignatureToTMethodSignature, tMethodSignature, tParameter, mParameterList, mEntry,
						eSingleVariableDeclarationToTParameter);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[mmethodSignatureToTMethodSignature] = " + mmethodSignatureToTMethodSignature + ", "
					+ "[tMethodSignature] = " + tMethodSignature + ", " + "[tParameter] = " + tParameter + ", "
					+ "[mParameterList] = " + mParameterList + ", " + "[mEntry] = " + mEntry + ", "
					+ "[eSingleVariableDeclarationToTParameter] = " + eSingleVariableDeclarationToTParameter + ".");
		}
		MethodParameterLinkFirstImpl.pattern_MethodParameterLinkFirst_11_3_bookkeepingforedges_greenBBBBBFF(ruleresult,
				tMethodSignature, tParameter, mParameterList, mEntry);
		//nothing EMoflonEdge tMethodSignature__tParameter____firstParameter = (EMoflonEdge) result3_green[5];
		//nothing EMoflonEdge mParameterList__mEntry____mFirstEntry = (EMoflonEdge) result3_green[6];

		// 
		// 
		MethodParameterLinkFirstImpl.pattern_MethodParameterLinkFirst_11_5_registerobjects_expressionBBBBBBBB(this,
				ruleresult, mmethodSignatureToTMethodSignature, tMethodSignature, tParameter, mParameterList, mEntry,
				eSingleVariableDeclarationToTParameter);
		return MethodParameterLinkFirstImpl.pattern_MethodParameterLinkFirst_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = MethodParameterLinkFirstImpl
				.pattern_MethodParameterLinkFirst_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = MethodParameterLinkFirstImpl
				.pattern_MethodParameterLinkFirst_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = MethodParameterLinkFirstImpl
				.pattern_MethodParameterLinkFirst_12_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		TMethodSignature tMethodSignature = (TMethodSignature) result2_binding[0];
		TParameter tParameter = (TParameter) result2_binding[1];
		for (Object[] result2_black : MethodParameterLinkFirstImpl
				.pattern_MethodParameterLinkFirst_12_2_corematch_blackFBBFFFB(tMethodSignature, tParameter, match)) {
			MSignatureToTSignature mmethodSignatureToTMethodSignature = (MSignatureToTSignature) result2_black[0];
			MMethodSignature mParameterList = (MMethodSignature) result2_black[3];
			MEntry mEntry = (MEntry) result2_black[4];
			MEntryToTParameter eSingleVariableDeclarationToTParameter = (MEntryToTParameter) result2_black[5];
			// ForEach 
			for (Object[] result3_black : MethodParameterLinkFirstImpl
					.pattern_MethodParameterLinkFirst_12_3_findcontext_blackBBBBBB(mmethodSignatureToTMethodSignature,
							tMethodSignature, tParameter, mParameterList, mEntry,
							eSingleVariableDeclarationToTParameter)) {
				Object[] result3_green = MethodParameterLinkFirstImpl
						.pattern_MethodParameterLinkFirst_12_3_findcontext_greenBBBBBBFFFFFF(
								mmethodSignatureToTMethodSignature, tMethodSignature, tParameter, mParameterList,
								mEntry, eSingleVariableDeclarationToTParameter);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[6];
				//nothing EMoflonEdge tMethodSignature__tParameter____firstParameter = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge mmethodSignatureToTMethodSignature__mParameterList____source = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge mmethodSignatureToTMethodSignature__tMethodSignature____target = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge eSingleVariableDeclarationToTParameter__tParameter____target = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge eSingleVariableDeclarationToTParameter__mEntry____source = (EMoflonEdge) result3_green[11];

				Object[] result4_bindingAndBlack = MethodParameterLinkFirstImpl
						.pattern_MethodParameterLinkFirst_12_4_solveCSP_bindingAndBlackFBBBBBBBB(this,
								isApplicableMatch, mmethodSignatureToTMethodSignature, tMethodSignature, tParameter,
								mParameterList, mEntry, eSingleVariableDeclarationToTParameter);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", "
							+ "[mmethodSignatureToTMethodSignature] = " + mmethodSignatureToTMethodSignature + ", "
							+ "[tMethodSignature] = " + tMethodSignature + ", " + "[tParameter] = " + tParameter + ", "
							+ "[mParameterList] = " + mParameterList + ", " + "[mEntry] = " + mEntry + ", "
							+ "[eSingleVariableDeclarationToTParameter] = " + eSingleVariableDeclarationToTParameter
							+ ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (MethodParameterLinkFirstImpl.pattern_MethodParameterLinkFirst_12_5_checkCSP_expressionFBB(this,
						csp)) {

					Object[] result6_black = MethodParameterLinkFirstImpl
							.pattern_MethodParameterLinkFirst_12_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					MethodParameterLinkFirstImpl.pattern_MethodParameterLinkFirst_12_6_addmatchtoruleresult_greenBB(
							ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return MethodParameterLinkFirstImpl.pattern_MethodParameterLinkFirst_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, TMethodSignature tMethodSignature, TParameter tParameter) {
		match.registerObject("tMethodSignature", tMethodSignature);
		match.registerObject("tParameter", tParameter);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, TMethodSignature tMethodSignature, TParameter tParameter) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch,
			MSignatureToTSignature mmethodSignatureToTMethodSignature, TMethodSignature tMethodSignature,
			TParameter tParameter, MMethodSignature mParameterList, MEntry mEntry,
			MEntryToTParameter eSingleVariableDeclarationToTParameter) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("mmethodSignatureToTMethodSignature", mmethodSignatureToTMethodSignature);
		isApplicableMatch.registerObject("tMethodSignature", tMethodSignature);
		isApplicableMatch.registerObject("tParameter", tParameter);
		isApplicableMatch.registerObject("mParameterList", mParameterList);
		isApplicableMatch.registerObject("mEntry", mEntry);
		isApplicableMatch.registerObject("eSingleVariableDeclarationToTParameter",
				eSingleVariableDeclarationToTParameter);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject mmethodSignatureToTMethodSignature,
			EObject tMethodSignature, EObject tParameter, EObject mParameterList, EObject mEntry,
			EObject eSingleVariableDeclarationToTParameter) {
		ruleresult.registerObject("mmethodSignatureToTMethodSignature", mmethodSignatureToTMethodSignature);
		ruleresult.registerObject("tMethodSignature", tMethodSignature);
		ruleresult.registerObject("tParameter", tParameter);
		ruleresult.registerObject("mParameterList", mParameterList);
		ruleresult.registerObject("mEntry", mEntry);
		ruleresult.registerObject("eSingleVariableDeclarationToTParameter", eSingleVariableDeclarationToTParameter);

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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_18(EMoflonEdge _edge_firstParameter) {

		Object[] result1_bindingAndBlack = MethodParameterLinkFirstImpl
				.pattern_MethodParameterLinkFirst_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = MethodParameterLinkFirstImpl
				.pattern_MethodParameterLinkFirst_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : MethodParameterLinkFirstImpl
				.pattern_MethodParameterLinkFirst_20_2_testcorematchandDECs_blackFFB(_edge_firstParameter)) {
			TMethodSignature tMethodSignature = (TMethodSignature) result2_black[0];
			TParameter tParameter = (TParameter) result2_black[1];
			Object[] result2_green = MethodParameterLinkFirstImpl
					.pattern_MethodParameterLinkFirst_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (MethodParameterLinkFirstImpl
					.pattern_MethodParameterLinkFirst_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
							this, match, tMethodSignature, tParameter)) {
				// 
				if (MethodParameterLinkFirstImpl
						.pattern_MethodParameterLinkFirst_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = MethodParameterLinkFirstImpl
							.pattern_MethodParameterLinkFirst_20_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					MethodParameterLinkFirstImpl.pattern_MethodParameterLinkFirst_20_5_Addmatchtoruleresult_greenBBBB(
							match, __performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return MethodParameterLinkFirstImpl.pattern_MethodParameterLinkFirst_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_19(EMoflonEdge _edge_mFirstEntry) {

		Object[] result1_bindingAndBlack = MethodParameterLinkFirstImpl
				.pattern_MethodParameterLinkFirst_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = MethodParameterLinkFirstImpl
				.pattern_MethodParameterLinkFirst_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : MethodParameterLinkFirstImpl
				.pattern_MethodParameterLinkFirst_21_2_testcorematchandDECs_blackFFB(_edge_mFirstEntry)) {
			MMethodSignature mParameterList = (MMethodSignature) result2_black[0];
			MEntry mEntry = (MEntry) result2_black[1];
			Object[] result2_green = MethodParameterLinkFirstImpl
					.pattern_MethodParameterLinkFirst_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (MethodParameterLinkFirstImpl
					.pattern_MethodParameterLinkFirst_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
							this, match, mParameterList, mEntry)) {
				// 
				if (MethodParameterLinkFirstImpl
						.pattern_MethodParameterLinkFirst_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = MethodParameterLinkFirstImpl
							.pattern_MethodParameterLinkFirst_21_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					MethodParameterLinkFirstImpl.pattern_MethodParameterLinkFirst_21_5_Addmatchtoruleresult_greenBBBB(
							match, __performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return MethodParameterLinkFirstImpl.pattern_MethodParameterLinkFirst_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("MethodParameterLinkFirst");
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
		ruleResult.setRule("MethodParameterLinkFirst");
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

		Object[] result1_black = MethodParameterLinkFirstImpl
				.pattern_MethodParameterLinkFirst_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = MethodParameterLinkFirstImpl.pattern_MethodParameterLinkFirst_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = MethodParameterLinkFirstImpl
				.pattern_MethodParameterLinkFirst_24_2_matchsrctrgcontext_bindingAndBlackFFFFBB(sourceMatch,
						targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		TMethodSignature tMethodSignature = (TMethodSignature) result2_bindingAndBlack[0];
		TParameter tParameter = (TParameter) result2_bindingAndBlack[1];
		MMethodSignature mParameterList = (MMethodSignature) result2_bindingAndBlack[2];
		MEntry mEntry = (MEntry) result2_bindingAndBlack[3];

		Object[] result3_bindingAndBlack = MethodParameterLinkFirstImpl
				.pattern_MethodParameterLinkFirst_24_3_solvecsp_bindingAndBlackFBBBBBBB(this, tMethodSignature,
						tParameter, mParameterList, mEntry, sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[tMethodSignature] = " + tMethodSignature + ", " + "[tParameter] = " + tParameter + ", "
					+ "[mParameterList] = " + mParameterList + ", " + "[mEntry] = " + mEntry + ", " + "[sourceMatch] = "
					+ sourceMatch + ", " + "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (MethodParameterLinkFirstImpl.pattern_MethodParameterLinkFirst_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : MethodParameterLinkFirstImpl
					.pattern_MethodParameterLinkFirst_24_5_matchcorrcontext_blackFBBBBFBB(tMethodSignature, tParameter,
							mParameterList, mEntry, sourceMatch, targetMatch)) {
				MSignatureToTSignature mmethodSignatureToTMethodSignature = (MSignatureToTSignature) result5_black[0];
				MEntryToTParameter eSingleVariableDeclarationToTParameter = (MEntryToTParameter) result5_black[5];
				Object[] result5_green = MethodParameterLinkFirstImpl
						.pattern_MethodParameterLinkFirst_24_5_matchcorrcontext_greenBBBBF(
								mmethodSignatureToTMethodSignature, eSingleVariableDeclarationToTParameter, sourceMatch,
								targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[4];

				Object[] result6_black = MethodParameterLinkFirstImpl
						.pattern_MethodParameterLinkFirst_24_6_createcorrespondence_blackBBBBB(tMethodSignature,
								tParameter, mParameterList, mEntry, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[tMethodSignature] = "
							+ tMethodSignature + ", " + "[tParameter] = " + tParameter + ", " + "[mParameterList] = "
							+ mParameterList + ", " + "[mEntry] = " + mEntry + ", " + "[ccMatch] = " + ccMatch + ".");
				}

				Object[] result7_black = MethodParameterLinkFirstImpl
						.pattern_MethodParameterLinkFirst_24_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				MethodParameterLinkFirstImpl.pattern_MethodParameterLinkFirst_24_7_addtoreturnedresult_greenBB(result,
						ccMatch);

			}

		} else {
		}
		return MethodParameterLinkFirstImpl.pattern_MethodParameterLinkFirst_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(TMethodSignature tMethodSignature, TParameter tParameter,
			MMethodSignature mParameterList, MEntry mEntry, Match sourceMatch, Match targetMatch) {// Create CSP
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
	public boolean checkDEC_FWD(MMethodSignature mParameterList, MEntry mEntry) {// 
		Object[] result1_black = MethodParameterLinkFirstImpl
				.pattern_MethodParameterLinkFirst_27_1_matchtggpattern_blackBB(mParameterList, mEntry);
		if (result1_black != null) {
			return MethodParameterLinkFirstImpl.pattern_MethodParameterLinkFirst_27_2_expressionF();
		} else {
			return MethodParameterLinkFirstImpl.pattern_MethodParameterLinkFirst_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(TMethodSignature tMethodSignature, TParameter tParameter) {// 
		Object[] result1_black = MethodParameterLinkFirstImpl
				.pattern_MethodParameterLinkFirst_28_1_matchtggpattern_blackBB(tMethodSignature, tParameter);
		if (result1_black != null) {
			return MethodParameterLinkFirstImpl.pattern_MethodParameterLinkFirst_28_2_expressionF();
		} else {
			return MethodParameterLinkFirstImpl.pattern_MethodParameterLinkFirst_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer,
			MSignatureToTSignature mmethodSignatureToTMethodSignatureParameter,
			MEntryToTParameter eSingleVariableDeclarationToTParameterParameter) {

		Object[] result1_black = MethodParameterLinkFirstImpl
				.pattern_MethodParameterLinkFirst_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = MethodParameterLinkFirstImpl
				.pattern_MethodParameterLinkFirst_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : MethodParameterLinkFirstImpl
				.pattern_MethodParameterLinkFirst_29_2_isapplicablecore_blackFFFFFFFFBB(ruleEntryContainer,
						ruleResult)) {
			//nothing RuleEntryList mmethodSignatureToTMethodSignatureList = (RuleEntryList) result2_black[0];
			MSignatureToTSignature mmethodSignatureToTMethodSignature = (MSignatureToTSignature) result2_black[1];
			MMethodSignature mParameterList = (MMethodSignature) result2_black[2];
			TMethodSignature tMethodSignature = (TMethodSignature) result2_black[3];
			//nothing RuleEntryList eSingleVariableDeclarationToTParameterList = (RuleEntryList) result2_black[4];
			TParameter tParameter = (TParameter) result2_black[5];
			MEntryToTParameter eSingleVariableDeclarationToTParameter = (MEntryToTParameter) result2_black[6];
			MEntry mEntry = (MEntry) result2_black[7];

			Object[] result3_bindingAndBlack = MethodParameterLinkFirstImpl
					.pattern_MethodParameterLinkFirst_29_3_solveCSP_bindingAndBlackFBBBBBBBBB(this, isApplicableMatch,
							mmethodSignatureToTMethodSignature, tMethodSignature, tParameter, mParameterList, mEntry,
							eSingleVariableDeclarationToTParameter, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", "
						+ "[mmethodSignatureToTMethodSignature] = " + mmethodSignatureToTMethodSignature + ", "
						+ "[tMethodSignature] = " + tMethodSignature + ", " + "[tParameter] = " + tParameter + ", "
						+ "[mParameterList] = " + mParameterList + ", " + "[mEntry] = " + mEntry + ", "
						+ "[eSingleVariableDeclarationToTParameter] = " + eSingleVariableDeclarationToTParameter + ", "
						+ "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (MethodParameterLinkFirstImpl.pattern_MethodParameterLinkFirst_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = MethodParameterLinkFirstImpl
						.pattern_MethodParameterLinkFirst_29_5_checknacs_blackBBBBBB(mmethodSignatureToTMethodSignature,
								tMethodSignature, tParameter, mParameterList, mEntry,
								eSingleVariableDeclarationToTParameter);
				if (result5_black != null) {

					Object[] result6_black = MethodParameterLinkFirstImpl
							.pattern_MethodParameterLinkFirst_29_6_perform_blackBBBBBBB(
									mmethodSignatureToTMethodSignature, tMethodSignature, tParameter, mParameterList,
									mEntry, eSingleVariableDeclarationToTParameter, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: "
								+ "[mmethodSignatureToTMethodSignature] = " + mmethodSignatureToTMethodSignature + ", "
								+ "[tMethodSignature] = " + tMethodSignature + ", " + "[tParameter] = " + tParameter
								+ ", " + "[mParameterList] = " + mParameterList + ", " + "[mEntry] = " + mEntry + ", "
								+ "[eSingleVariableDeclarationToTParameter] = " + eSingleVariableDeclarationToTParameter
								+ ", " + "[ruleResult] = " + ruleResult + ".");
					}
					MethodParameterLinkFirstImpl.pattern_MethodParameterLinkFirst_29_6_perform_greenBBBBB(
							tMethodSignature, tParameter, mParameterList, mEntry, ruleResult);

				} else {
				}

			} else {
			}

		}
		return MethodParameterLinkFirstImpl.pattern_MethodParameterLinkFirst_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch,
			MSignatureToTSignature mmethodSignatureToTMethodSignature, TMethodSignature tMethodSignature,
			TParameter tParameter, MMethodSignature mParameterList, MEntry mEntry,
			MEntryToTParameter eSingleVariableDeclarationToTParameter, ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("mmethodSignatureToTMethodSignature", mmethodSignatureToTMethodSignature);
		isApplicableMatch.registerObject("tMethodSignature", tMethodSignature);
		isApplicableMatch.registerObject("tParameter", tParameter);
		isApplicableMatch.registerObject("mParameterList", mParameterList);
		isApplicableMatch.registerObject("mEntry", mEntry);
		isApplicableMatch.registerObject("eSingleVariableDeclarationToTParameter",
				eSingleVariableDeclarationToTParameter);
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
		case RulesPackage.METHOD_PARAMETER_LINK_FIRST___IS_APPROPRIATE_FWD__MATCH_MMETHODSIGNATURE_MENTRY:
			return isAppropriate_FWD((Match) arguments.get(0), (MMethodSignature) arguments.get(1),
					(MEntry) arguments.get(2));
		case RulesPackage.METHOD_PARAMETER_LINK_FIRST___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.METHOD_PARAMETER_LINK_FIRST___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.METHOD_PARAMETER_LINK_FIRST___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_MMETHODSIGNATURE_MENTRY:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (MMethodSignature) arguments.get(1),
					(MEntry) arguments.get(2));
			return null;
		case RulesPackage.METHOD_PARAMETER_LINK_FIRST___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_MMETHODSIGNATURE_MENTRY:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (MMethodSignature) arguments.get(1),
					(MEntry) arguments.get(2));
		case RulesPackage.METHOD_PARAMETER_LINK_FIRST___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.METHOD_PARAMETER_LINK_FIRST___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_MSIGNATURETOTSIGNATURE_TMETHODSIGNATURE_TPARAMETER_MMETHODSIGNATURE_MENTRY_MENTRYTOTPARAMETER:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0),
					(MSignatureToTSignature) arguments.get(1), (TMethodSignature) arguments.get(2),
					(TParameter) arguments.get(3), (MMethodSignature) arguments.get(4), (MEntry) arguments.get(5),
					(MEntryToTParameter) arguments.get(6));
		case RulesPackage.METHOD_PARAMETER_LINK_FIRST___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.METHOD_PARAMETER_LINK_FIRST___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6));
			return null;
		case RulesPackage.METHOD_PARAMETER_LINK_FIRST___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.METHOD_PARAMETER_LINK_FIRST___IS_APPROPRIATE_BWD__MATCH_TMETHODSIGNATURE_TPARAMETER:
			return isAppropriate_BWD((Match) arguments.get(0), (TMethodSignature) arguments.get(1),
					(TParameter) arguments.get(2));
		case RulesPackage.METHOD_PARAMETER_LINK_FIRST___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.METHOD_PARAMETER_LINK_FIRST___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.METHOD_PARAMETER_LINK_FIRST___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TMETHODSIGNATURE_TPARAMETER:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (TMethodSignature) arguments.get(1),
					(TParameter) arguments.get(2));
			return null;
		case RulesPackage.METHOD_PARAMETER_LINK_FIRST___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TMETHODSIGNATURE_TPARAMETER:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (TMethodSignature) arguments.get(1),
					(TParameter) arguments.get(2));
		case RulesPackage.METHOD_PARAMETER_LINK_FIRST___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.METHOD_PARAMETER_LINK_FIRST___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_MSIGNATURETOTSIGNATURE_TMETHODSIGNATURE_TPARAMETER_MMETHODSIGNATURE_MENTRY_MENTRYTOTPARAMETER:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
					(MSignatureToTSignature) arguments.get(1), (TMethodSignature) arguments.get(2),
					(TParameter) arguments.get(3), (MMethodSignature) arguments.get(4), (MEntry) arguments.get(5),
					(MEntryToTParameter) arguments.get(6));
		case RulesPackage.METHOD_PARAMETER_LINK_FIRST___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.METHOD_PARAMETER_LINK_FIRST___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6));
			return null;
		case RulesPackage.METHOD_PARAMETER_LINK_FIRST___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.METHOD_PARAMETER_LINK_FIRST___IS_APPROPRIATE_BWD_EMOFLON_EDGE_18__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_18((EMoflonEdge) arguments.get(0));
		case RulesPackage.METHOD_PARAMETER_LINK_FIRST___IS_APPROPRIATE_FWD_EMOFLON_EDGE_19__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_19((EMoflonEdge) arguments.get(0));
		case RulesPackage.METHOD_PARAMETER_LINK_FIRST___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.METHOD_PARAMETER_LINK_FIRST___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.METHOD_PARAMETER_LINK_FIRST___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.METHOD_PARAMETER_LINK_FIRST___IS_APPLICABLE_SOLVE_CSP_CC__TMETHODSIGNATURE_TPARAMETER_MMETHODSIGNATURE_MENTRY_MATCH_MATCH:
			return isApplicable_solveCsp_CC((TMethodSignature) arguments.get(0), (TParameter) arguments.get(1),
					(MMethodSignature) arguments.get(2), (MEntry) arguments.get(3), (Match) arguments.get(4),
					(Match) arguments.get(5));
		case RulesPackage.METHOD_PARAMETER_LINK_FIRST___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.METHOD_PARAMETER_LINK_FIRST___CHECK_DEC_FWD__MMETHODSIGNATURE_MENTRY:
			return checkDEC_FWD((MMethodSignature) arguments.get(0), (MEntry) arguments.get(1));
		case RulesPackage.METHOD_PARAMETER_LINK_FIRST___CHECK_DEC_BWD__TMETHODSIGNATURE_TPARAMETER:
			return checkDEC_BWD((TMethodSignature) arguments.get(0), (TParameter) arguments.get(1));
		case RulesPackage.METHOD_PARAMETER_LINK_FIRST___GENERATE_MODEL__RULEENTRYCONTAINER_MSIGNATURETOTSIGNATURE_MENTRYTOTPARAMETER:
			return generateModel((RuleEntryContainer) arguments.get(0), (MSignatureToTSignature) arguments.get(1),
					(MEntryToTParameter) arguments.get(2));
		case RulesPackage.METHOD_PARAMETER_LINK_FIRST___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_MSIGNATURETOTSIGNATURE_TMETHODSIGNATURE_TPARAMETER_MMETHODSIGNATURE_MENTRY_MENTRYTOTPARAMETER_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
					(MSignatureToTSignature) arguments.get(1), (TMethodSignature) arguments.get(2),
					(TParameter) arguments.get(3), (MMethodSignature) arguments.get(4), (MEntry) arguments.get(5),
					(MEntryToTParameter) arguments.get(6), (ModelgeneratorRuleResult) arguments.get(7));
		case RulesPackage.METHOD_PARAMETER_LINK_FIRST___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_MethodParameterLinkFirst_0_1_initialbindings_blackBBBB(
			MethodParameterLinkFirst _this, Match match, MMethodSignature mParameterList, MEntry mEntry) {
		return new Object[] { _this, match, mParameterList, mEntry };
	}

	public static final Object[] pattern_MethodParameterLinkFirst_0_2_SolveCSP_bindingFBBBB(
			MethodParameterLinkFirst _this, Match match, MMethodSignature mParameterList, MEntry mEntry) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, mParameterList, mEntry);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, mParameterList, mEntry };
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterLinkFirst_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MethodParameterLinkFirst_0_2_SolveCSP_bindingAndBlackFBBBB(
			MethodParameterLinkFirst _this, Match match, MMethodSignature mParameterList, MEntry mEntry) {
		Object[] result_pattern_MethodParameterLinkFirst_0_2_SolveCSP_binding = pattern_MethodParameterLinkFirst_0_2_SolveCSP_bindingFBBBB(
				_this, match, mParameterList, mEntry);
		if (result_pattern_MethodParameterLinkFirst_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_MethodParameterLinkFirst_0_2_SolveCSP_binding[0];

			Object[] result_pattern_MethodParameterLinkFirst_0_2_SolveCSP_black = pattern_MethodParameterLinkFirst_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_MethodParameterLinkFirst_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, mParameterList, mEntry };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodParameterLinkFirst_0_3_CheckCSP_expressionFBB(
			MethodParameterLinkFirst _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodParameterLinkFirst_0_4_collectelementstobetranslated_blackBBB(
			Match match, MMethodSignature mParameterList, MEntry mEntry) {
		return new Object[] { match, mParameterList, mEntry };
	}

	public static final Object[] pattern_MethodParameterLinkFirst_0_4_collectelementstobetranslated_greenBBBF(
			Match match, MMethodSignature mParameterList, MEntry mEntry) {
		EMoflonEdge mParameterList__mEntry____mFirstEntry = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String mParameterList__mEntry____mFirstEntry_name_prime = "mFirstEntry";
		mParameterList__mEntry____mFirstEntry.setSrc(mParameterList);
		mParameterList__mEntry____mFirstEntry.setTrg(mEntry);
		match.getToBeTranslatedEdges().add(mParameterList__mEntry____mFirstEntry);
		mParameterList__mEntry____mFirstEntry.setName(mParameterList__mEntry____mFirstEntry_name_prime);
		return new Object[] { match, mParameterList, mEntry, mParameterList__mEntry____mFirstEntry };
	}

	public static final Object[] pattern_MethodParameterLinkFirst_0_5_collectcontextelements_blackBBB(Match match,
			MMethodSignature mParameterList, MEntry mEntry) {
		return new Object[] { match, mParameterList, mEntry };
	}

	public static final Object[] pattern_MethodParameterLinkFirst_0_5_collectcontextelements_greenBBB(Match match,
			MMethodSignature mParameterList, MEntry mEntry) {
		match.getContextNodes().add(mParameterList);
		match.getContextNodes().add(mEntry);
		return new Object[] { match, mParameterList, mEntry };
	}

	public static final void pattern_MethodParameterLinkFirst_0_6_registerobjectstomatch_expressionBBBB(
			MethodParameterLinkFirst _this, Match match, MMethodSignature mParameterList, MEntry mEntry) {
		_this.registerObjectsToMatch_FWD(match, mParameterList, mEntry);

	}

	public static final boolean pattern_MethodParameterLinkFirst_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_MethodParameterLinkFirst_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_MethodParameterLinkFirst_1_1_performtransformation_bindingFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("mmethodSignatureToTMethodSignature");
		EObject _localVariable_1 = isApplicableMatch.getObject("tMethodSignature");
		EObject _localVariable_2 = isApplicableMatch.getObject("tParameter");
		EObject _localVariable_3 = isApplicableMatch.getObject("mParameterList");
		EObject _localVariable_4 = isApplicableMatch.getObject("mEntry");
		EObject _localVariable_5 = isApplicableMatch.getObject("eSingleVariableDeclarationToTParameter");
		EObject tmpMmethodSignatureToTMethodSignature = _localVariable_0;
		EObject tmpTMethodSignature = _localVariable_1;
		EObject tmpTParameter = _localVariable_2;
		EObject tmpMParameterList = _localVariable_3;
		EObject tmpMEntry = _localVariable_4;
		EObject tmpESingleVariableDeclarationToTParameter = _localVariable_5;
		if (tmpMmethodSignatureToTMethodSignature instanceof MSignatureToTSignature) {
			MSignatureToTSignature mmethodSignatureToTMethodSignature = (MSignatureToTSignature) tmpMmethodSignatureToTMethodSignature;
			if (tmpTMethodSignature instanceof TMethodSignature) {
				TMethodSignature tMethodSignature = (TMethodSignature) tmpTMethodSignature;
				if (tmpTParameter instanceof TParameter) {
					TParameter tParameter = (TParameter) tmpTParameter;
					if (tmpMParameterList instanceof MMethodSignature) {
						MMethodSignature mParameterList = (MMethodSignature) tmpMParameterList;
						if (tmpMEntry instanceof MEntry) {
							MEntry mEntry = (MEntry) tmpMEntry;
							if (tmpESingleVariableDeclarationToTParameter instanceof MEntryToTParameter) {
								MEntryToTParameter eSingleVariableDeclarationToTParameter = (MEntryToTParameter) tmpESingleVariableDeclarationToTParameter;
								return new Object[] { mmethodSignatureToTMethodSignature, tMethodSignature, tParameter,
										mParameterList, mEntry, eSingleVariableDeclarationToTParameter,
										isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterLinkFirst_1_1_performtransformation_blackBBBBBBFBB(
			MSignatureToTSignature mmethodSignatureToTMethodSignature, TMethodSignature tMethodSignature,
			TParameter tParameter, MMethodSignature mParameterList, MEntry mEntry,
			MEntryToTParameter eSingleVariableDeclarationToTParameter, MethodParameterLinkFirst _this,
			IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { mmethodSignatureToTMethodSignature, tMethodSignature, tParameter, mParameterList,
						mEntry, eSingleVariableDeclarationToTParameter, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterLinkFirst_1_1_performtransformation_bindingAndBlackFFFFFFFBB(
			MethodParameterLinkFirst _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_MethodParameterLinkFirst_1_1_performtransformation_binding = pattern_MethodParameterLinkFirst_1_1_performtransformation_bindingFFFFFFB(
				isApplicableMatch);
		if (result_pattern_MethodParameterLinkFirst_1_1_performtransformation_binding != null) {
			MSignatureToTSignature mmethodSignatureToTMethodSignature = (MSignatureToTSignature) result_pattern_MethodParameterLinkFirst_1_1_performtransformation_binding[0];
			TMethodSignature tMethodSignature = (TMethodSignature) result_pattern_MethodParameterLinkFirst_1_1_performtransformation_binding[1];
			TParameter tParameter = (TParameter) result_pattern_MethodParameterLinkFirst_1_1_performtransformation_binding[2];
			MMethodSignature mParameterList = (MMethodSignature) result_pattern_MethodParameterLinkFirst_1_1_performtransformation_binding[3];
			MEntry mEntry = (MEntry) result_pattern_MethodParameterLinkFirst_1_1_performtransformation_binding[4];
			MEntryToTParameter eSingleVariableDeclarationToTParameter = (MEntryToTParameter) result_pattern_MethodParameterLinkFirst_1_1_performtransformation_binding[5];

			Object[] result_pattern_MethodParameterLinkFirst_1_1_performtransformation_black = pattern_MethodParameterLinkFirst_1_1_performtransformation_blackBBBBBBFBB(
					mmethodSignatureToTMethodSignature, tMethodSignature, tParameter, mParameterList, mEntry,
					eSingleVariableDeclarationToTParameter, _this, isApplicableMatch);
			if (result_pattern_MethodParameterLinkFirst_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_MethodParameterLinkFirst_1_1_performtransformation_black[6];

				return new Object[] { mmethodSignatureToTMethodSignature, tMethodSignature, tParameter, mParameterList,
						mEntry, eSingleVariableDeclarationToTParameter, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterLinkFirst_1_1_performtransformation_greenBB(
			TMethodSignature tMethodSignature, TParameter tParameter) {
		tMethodSignature.setFirstParameter(tParameter);
		return new Object[] { tMethodSignature, tParameter };
	}

	public static final Object[] pattern_MethodParameterLinkFirst_1_2_collecttranslatedelements_greenF() {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		return new Object[] { ruleresult };
	}

	public static final Object[] pattern_MethodParameterLinkFirst_1_3_bookkeepingforedges_blackBBBBBBB(
			PerformRuleResult ruleresult, EObject mmethodSignatureToTMethodSignature, EObject tMethodSignature,
			EObject tParameter, EObject mParameterList, EObject mEntry,
			EObject eSingleVariableDeclarationToTParameter) {
		if (!mmethodSignatureToTMethodSignature.equals(tMethodSignature)) {
			if (!mmethodSignatureToTMethodSignature.equals(tParameter)) {
				if (!tMethodSignature.equals(tParameter)) {
					if (!mParameterList.equals(mmethodSignatureToTMethodSignature)) {
						if (!mParameterList.equals(tMethodSignature)) {
							if (!mParameterList.equals(tParameter)) {
								if (!mEntry.equals(mmethodSignatureToTMethodSignature)) {
									if (!mEntry.equals(tMethodSignature)) {
										if (!mEntry.equals(tParameter)) {
											if (!mEntry.equals(mParameterList)) {
												if (!eSingleVariableDeclarationToTParameter
														.equals(mmethodSignatureToTMethodSignature)) {
													if (!eSingleVariableDeclarationToTParameter
															.equals(tMethodSignature)) {
														if (!eSingleVariableDeclarationToTParameter
																.equals(tParameter)) {
															if (!eSingleVariableDeclarationToTParameter
																	.equals(mParameterList)) {
																if (!eSingleVariableDeclarationToTParameter
																		.equals(mEntry)) {
																	return new Object[] { ruleresult,
																			mmethodSignatureToTMethodSignature,
																			tMethodSignature, tParameter,
																			mParameterList, mEntry,
																			eSingleVariableDeclarationToTParameter };
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_MethodParameterLinkFirst_1_3_bookkeepingforedges_greenBBBBBFF(
			PerformRuleResult ruleresult, EObject tMethodSignature, EObject tParameter, EObject mParameterList,
			EObject mEntry) {
		EMoflonEdge tMethodSignature__tParameter____firstParameter = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mParameterList__mEntry____mFirstEntry = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "MethodParameterLinkFirst";
		String tMethodSignature__tParameter____firstParameter_name_prime = "firstParameter";
		String mParameterList__mEntry____mFirstEntry_name_prime = "mFirstEntry";
		tMethodSignature__tParameter____firstParameter.setSrc(tMethodSignature);
		tMethodSignature__tParameter____firstParameter.setTrg(tParameter);
		ruleresult.getCreatedEdges().add(tMethodSignature__tParameter____firstParameter);
		mParameterList__mEntry____mFirstEntry.setSrc(mParameterList);
		mParameterList__mEntry____mFirstEntry.setTrg(mEntry);
		ruleresult.getTranslatedEdges().add(mParameterList__mEntry____mFirstEntry);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		tMethodSignature__tParameter____firstParameter
				.setName(tMethodSignature__tParameter____firstParameter_name_prime);
		mParameterList__mEntry____mFirstEntry.setName(mParameterList__mEntry____mFirstEntry_name_prime);
		return new Object[] { ruleresult, tMethodSignature, tParameter, mParameterList, mEntry,
				tMethodSignature__tParameter____firstParameter, mParameterList__mEntry____mFirstEntry };
	}

	public static final void pattern_MethodParameterLinkFirst_1_5_registerobjects_expressionBBBBBBBB(
			MethodParameterLinkFirst _this, PerformRuleResult ruleresult, EObject mmethodSignatureToTMethodSignature,
			EObject tMethodSignature, EObject tParameter, EObject mParameterList, EObject mEntry,
			EObject eSingleVariableDeclarationToTParameter) {
		_this.registerObjects_FWD(ruleresult, mmethodSignatureToTMethodSignature, tMethodSignature, tParameter,
				mParameterList, mEntry, eSingleVariableDeclarationToTParameter);

	}

	public static final PerformRuleResult pattern_MethodParameterLinkFirst_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_MethodParameterLinkFirst_2_1_preparereturnvalue_bindingFB(
			MethodParameterLinkFirst _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterLinkFirst_2_1_preparereturnvalue_blackFBB(EClass eClass,
			MethodParameterLinkFirst _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_MethodParameterLinkFirst_2_1_preparereturnvalue_bindingAndBlackFFB(
			MethodParameterLinkFirst _this) {
		Object[] result_pattern_MethodParameterLinkFirst_2_1_preparereturnvalue_binding = pattern_MethodParameterLinkFirst_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_MethodParameterLinkFirst_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_MethodParameterLinkFirst_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_MethodParameterLinkFirst_2_1_preparereturnvalue_black = pattern_MethodParameterLinkFirst_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_MethodParameterLinkFirst_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_MethodParameterLinkFirst_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterLinkFirst_2_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "MethodParameterLinkFirst";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_MethodParameterLinkFirst_2_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("mParameterList");
		EObject _localVariable_1 = match.getObject("mEntry");
		EObject tmpMParameterList = _localVariable_0;
		EObject tmpMEntry = _localVariable_1;
		if (tmpMParameterList instanceof MMethodSignature) {
			MMethodSignature mParameterList = (MMethodSignature) tmpMParameterList;
			if (tmpMEntry instanceof MEntry) {
				MEntry mEntry = (MEntry) tmpMEntry;
				return new Object[] { mParameterList, mEntry, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_MethodParameterLinkFirst_2_2_corematch_blackFFFBBFB(
			MMethodSignature mParameterList, MEntry mEntry, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (MSignatureToTSignature mmethodSignatureToTMethodSignature : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mParameterList, MSignatureToTSignature.class, "source")) {
			TSignature tmpTMethodSignature = mmethodSignatureToTMethodSignature.getTarget();
			if (tmpTMethodSignature instanceof TMethodSignature) {
				TMethodSignature tMethodSignature = (TMethodSignature) tmpTMethodSignature;
				for (MEntryToTParameter eSingleVariableDeclarationToTParameter : org.moflon.core.utilities.eMoflonEMFUtil
						.getOppositeReferenceTyped(mEntry, MEntryToTParameter.class, "source")) {
					TParameter tParameter = eSingleVariableDeclarationToTParameter.getTarget();
					if (tParameter != null) {
						_result.add(new Object[] { mmethodSignatureToTMethodSignature, tMethodSignature, tParameter,
								mParameterList, mEntry, eSingleVariableDeclarationToTParameter, match });
					}

				}
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_MethodParameterLinkFirst_2_3_findcontext_blackBBBBBB(
			MSignatureToTSignature mmethodSignatureToTMethodSignature, TMethodSignature tMethodSignature,
			TParameter tParameter, MMethodSignature mParameterList, MEntry mEntry,
			MEntryToTParameter eSingleVariableDeclarationToTParameter) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (mParameterList.equals(mmethodSignatureToTMethodSignature.getSource())) {
			if (tMethodSignature.equals(mmethodSignatureToTMethodSignature.getTarget())) {
				if (tParameter.equals(eSingleVariableDeclarationToTParameter.getTarget())) {
					if (mEntry.equals(eSingleVariableDeclarationToTParameter.getSource())) {
						if (mEntry.equals(mParameterList.getMFirstEntry())) {
							_result.add(new Object[] { mmethodSignatureToTMethodSignature, tMethodSignature, tParameter,
									mParameterList, mEntry, eSingleVariableDeclarationToTParameter });
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_MethodParameterLinkFirst_2_3_findcontext_greenBBBBBBFFFFFF(
			MSignatureToTSignature mmethodSignatureToTMethodSignature, TMethodSignature tMethodSignature,
			TParameter tParameter, MMethodSignature mParameterList, MEntry mEntry,
			MEntryToTParameter eSingleVariableDeclarationToTParameter) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge mmethodSignatureToTMethodSignature__mParameterList____source = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge mmethodSignatureToTMethodSignature__tMethodSignature____target = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge eSingleVariableDeclarationToTParameter__tParameter____target = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge eSingleVariableDeclarationToTParameter__mEntry____source = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge mParameterList__mEntry____mFirstEntry = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String mmethodSignatureToTMethodSignature__mParameterList____source_name_prime = "source";
		String mmethodSignatureToTMethodSignature__tMethodSignature____target_name_prime = "target";
		String eSingleVariableDeclarationToTParameter__tParameter____target_name_prime = "target";
		String eSingleVariableDeclarationToTParameter__mEntry____source_name_prime = "source";
		String mParameterList__mEntry____mFirstEntry_name_prime = "mFirstEntry";
		isApplicableMatch.getAllContextElements().add(mmethodSignatureToTMethodSignature);
		isApplicableMatch.getAllContextElements().add(tMethodSignature);
		isApplicableMatch.getAllContextElements().add(tParameter);
		isApplicableMatch.getAllContextElements().add(mParameterList);
		isApplicableMatch.getAllContextElements().add(mEntry);
		isApplicableMatch.getAllContextElements().add(eSingleVariableDeclarationToTParameter);
		mmethodSignatureToTMethodSignature__mParameterList____source.setSrc(mmethodSignatureToTMethodSignature);
		mmethodSignatureToTMethodSignature__mParameterList____source.setTrg(mParameterList);
		isApplicableMatch.getAllContextElements().add(mmethodSignatureToTMethodSignature__mParameterList____source);
		mmethodSignatureToTMethodSignature__tMethodSignature____target.setSrc(mmethodSignatureToTMethodSignature);
		mmethodSignatureToTMethodSignature__tMethodSignature____target.setTrg(tMethodSignature);
		isApplicableMatch.getAllContextElements().add(mmethodSignatureToTMethodSignature__tMethodSignature____target);
		eSingleVariableDeclarationToTParameter__tParameter____target.setSrc(eSingleVariableDeclarationToTParameter);
		eSingleVariableDeclarationToTParameter__tParameter____target.setTrg(tParameter);
		isApplicableMatch.getAllContextElements().add(eSingleVariableDeclarationToTParameter__tParameter____target);
		eSingleVariableDeclarationToTParameter__mEntry____source.setSrc(eSingleVariableDeclarationToTParameter);
		eSingleVariableDeclarationToTParameter__mEntry____source.setTrg(mEntry);
		isApplicableMatch.getAllContextElements().add(eSingleVariableDeclarationToTParameter__mEntry____source);
		mParameterList__mEntry____mFirstEntry.setSrc(mParameterList);
		mParameterList__mEntry____mFirstEntry.setTrg(mEntry);
		isApplicableMatch.getAllContextElements().add(mParameterList__mEntry____mFirstEntry);
		mmethodSignatureToTMethodSignature__mParameterList____source
				.setName(mmethodSignatureToTMethodSignature__mParameterList____source_name_prime);
		mmethodSignatureToTMethodSignature__tMethodSignature____target
				.setName(mmethodSignatureToTMethodSignature__tMethodSignature____target_name_prime);
		eSingleVariableDeclarationToTParameter__tParameter____target
				.setName(eSingleVariableDeclarationToTParameter__tParameter____target_name_prime);
		eSingleVariableDeclarationToTParameter__mEntry____source
				.setName(eSingleVariableDeclarationToTParameter__mEntry____source_name_prime);
		mParameterList__mEntry____mFirstEntry.setName(mParameterList__mEntry____mFirstEntry_name_prime);
		return new Object[] { mmethodSignatureToTMethodSignature, tMethodSignature, tParameter, mParameterList, mEntry,
				eSingleVariableDeclarationToTParameter, isApplicableMatch,
				mmethodSignatureToTMethodSignature__mParameterList____source,
				mmethodSignatureToTMethodSignature__tMethodSignature____target,
				eSingleVariableDeclarationToTParameter__tParameter____target,
				eSingleVariableDeclarationToTParameter__mEntry____source, mParameterList__mEntry____mFirstEntry };
	}

	public static final Object[] pattern_MethodParameterLinkFirst_2_4_solveCSP_bindingFBBBBBBBB(
			MethodParameterLinkFirst _this, IsApplicableMatch isApplicableMatch,
			MSignatureToTSignature mmethodSignatureToTMethodSignature, TMethodSignature tMethodSignature,
			TParameter tParameter, MMethodSignature mParameterList, MEntry mEntry,
			MEntryToTParameter eSingleVariableDeclarationToTParameter) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, mmethodSignatureToTMethodSignature,
				tMethodSignature, tParameter, mParameterList, mEntry, eSingleVariableDeclarationToTParameter);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mmethodSignatureToTMethodSignature, tMethodSignature,
					tParameter, mParameterList, mEntry, eSingleVariableDeclarationToTParameter };
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterLinkFirst_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MethodParameterLinkFirst_2_4_solveCSP_bindingAndBlackFBBBBBBBB(
			MethodParameterLinkFirst _this, IsApplicableMatch isApplicableMatch,
			MSignatureToTSignature mmethodSignatureToTMethodSignature, TMethodSignature tMethodSignature,
			TParameter tParameter, MMethodSignature mParameterList, MEntry mEntry,
			MEntryToTParameter eSingleVariableDeclarationToTParameter) {
		Object[] result_pattern_MethodParameterLinkFirst_2_4_solveCSP_binding = pattern_MethodParameterLinkFirst_2_4_solveCSP_bindingFBBBBBBBB(
				_this, isApplicableMatch, mmethodSignatureToTMethodSignature, tMethodSignature, tParameter,
				mParameterList, mEntry, eSingleVariableDeclarationToTParameter);
		if (result_pattern_MethodParameterLinkFirst_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_MethodParameterLinkFirst_2_4_solveCSP_binding[0];

			Object[] result_pattern_MethodParameterLinkFirst_2_4_solveCSP_black = pattern_MethodParameterLinkFirst_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_MethodParameterLinkFirst_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mmethodSignatureToTMethodSignature,
						tMethodSignature, tParameter, mParameterList, mEntry, eSingleVariableDeclarationToTParameter };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodParameterLinkFirst_2_5_checkCSP_expressionFBB(
			MethodParameterLinkFirst _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodParameterLinkFirst_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_MethodParameterLinkFirst_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "MethodParameterLinkFirst";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_MethodParameterLinkFirst_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_MethodParameterLinkFirst_10_1_initialbindings_blackBBBB(
			MethodParameterLinkFirst _this, Match match, TMethodSignature tMethodSignature, TParameter tParameter) {
		return new Object[] { _this, match, tMethodSignature, tParameter };
	}

	public static final Object[] pattern_MethodParameterLinkFirst_10_2_SolveCSP_bindingFBBBB(
			MethodParameterLinkFirst _this, Match match, TMethodSignature tMethodSignature, TParameter tParameter) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, tMethodSignature, tParameter);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, tMethodSignature, tParameter };
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterLinkFirst_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MethodParameterLinkFirst_10_2_SolveCSP_bindingAndBlackFBBBB(
			MethodParameterLinkFirst _this, Match match, TMethodSignature tMethodSignature, TParameter tParameter) {
		Object[] result_pattern_MethodParameterLinkFirst_10_2_SolveCSP_binding = pattern_MethodParameterLinkFirst_10_2_SolveCSP_bindingFBBBB(
				_this, match, tMethodSignature, tParameter);
		if (result_pattern_MethodParameterLinkFirst_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_MethodParameterLinkFirst_10_2_SolveCSP_binding[0];

			Object[] result_pattern_MethodParameterLinkFirst_10_2_SolveCSP_black = pattern_MethodParameterLinkFirst_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_MethodParameterLinkFirst_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, tMethodSignature, tParameter };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodParameterLinkFirst_10_3_CheckCSP_expressionFBB(
			MethodParameterLinkFirst _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodParameterLinkFirst_10_4_collectelementstobetranslated_blackBBB(
			Match match, TMethodSignature tMethodSignature, TParameter tParameter) {
		return new Object[] { match, tMethodSignature, tParameter };
	}

	public static final Object[] pattern_MethodParameterLinkFirst_10_4_collectelementstobetranslated_greenBBBF(
			Match match, TMethodSignature tMethodSignature, TParameter tParameter) {
		EMoflonEdge tMethodSignature__tParameter____firstParameter = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String tMethodSignature__tParameter____firstParameter_name_prime = "firstParameter";
		tMethodSignature__tParameter____firstParameter.setSrc(tMethodSignature);
		tMethodSignature__tParameter____firstParameter.setTrg(tParameter);
		match.getToBeTranslatedEdges().add(tMethodSignature__tParameter____firstParameter);
		tMethodSignature__tParameter____firstParameter
				.setName(tMethodSignature__tParameter____firstParameter_name_prime);
		return new Object[] { match, tMethodSignature, tParameter, tMethodSignature__tParameter____firstParameter };
	}

	public static final Object[] pattern_MethodParameterLinkFirst_10_5_collectcontextelements_blackBBB(Match match,
			TMethodSignature tMethodSignature, TParameter tParameter) {
		return new Object[] { match, tMethodSignature, tParameter };
	}

	public static final Object[] pattern_MethodParameterLinkFirst_10_5_collectcontextelements_greenBBB(Match match,
			TMethodSignature tMethodSignature, TParameter tParameter) {
		match.getContextNodes().add(tMethodSignature);
		match.getContextNodes().add(tParameter);
		return new Object[] { match, tMethodSignature, tParameter };
	}

	public static final void pattern_MethodParameterLinkFirst_10_6_registerobjectstomatch_expressionBBBB(
			MethodParameterLinkFirst _this, Match match, TMethodSignature tMethodSignature, TParameter tParameter) {
		_this.registerObjectsToMatch_BWD(match, tMethodSignature, tParameter);

	}

	public static final boolean pattern_MethodParameterLinkFirst_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_MethodParameterLinkFirst_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_MethodParameterLinkFirst_11_1_performtransformation_bindingFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("mmethodSignatureToTMethodSignature");
		EObject _localVariable_1 = isApplicableMatch.getObject("tMethodSignature");
		EObject _localVariable_2 = isApplicableMatch.getObject("tParameter");
		EObject _localVariable_3 = isApplicableMatch.getObject("mParameterList");
		EObject _localVariable_4 = isApplicableMatch.getObject("mEntry");
		EObject _localVariable_5 = isApplicableMatch.getObject("eSingleVariableDeclarationToTParameter");
		EObject tmpMmethodSignatureToTMethodSignature = _localVariable_0;
		EObject tmpTMethodSignature = _localVariable_1;
		EObject tmpTParameter = _localVariable_2;
		EObject tmpMParameterList = _localVariable_3;
		EObject tmpMEntry = _localVariable_4;
		EObject tmpESingleVariableDeclarationToTParameter = _localVariable_5;
		if (tmpMmethodSignatureToTMethodSignature instanceof MSignatureToTSignature) {
			MSignatureToTSignature mmethodSignatureToTMethodSignature = (MSignatureToTSignature) tmpMmethodSignatureToTMethodSignature;
			if (tmpTMethodSignature instanceof TMethodSignature) {
				TMethodSignature tMethodSignature = (TMethodSignature) tmpTMethodSignature;
				if (tmpTParameter instanceof TParameter) {
					TParameter tParameter = (TParameter) tmpTParameter;
					if (tmpMParameterList instanceof MMethodSignature) {
						MMethodSignature mParameterList = (MMethodSignature) tmpMParameterList;
						if (tmpMEntry instanceof MEntry) {
							MEntry mEntry = (MEntry) tmpMEntry;
							if (tmpESingleVariableDeclarationToTParameter instanceof MEntryToTParameter) {
								MEntryToTParameter eSingleVariableDeclarationToTParameter = (MEntryToTParameter) tmpESingleVariableDeclarationToTParameter;
								return new Object[] { mmethodSignatureToTMethodSignature, tMethodSignature, tParameter,
										mParameterList, mEntry, eSingleVariableDeclarationToTParameter,
										isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterLinkFirst_11_1_performtransformation_blackBBBBBBFBB(
			MSignatureToTSignature mmethodSignatureToTMethodSignature, TMethodSignature tMethodSignature,
			TParameter tParameter, MMethodSignature mParameterList, MEntry mEntry,
			MEntryToTParameter eSingleVariableDeclarationToTParameter, MethodParameterLinkFirst _this,
			IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { mmethodSignatureToTMethodSignature, tMethodSignature, tParameter, mParameterList,
						mEntry, eSingleVariableDeclarationToTParameter, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterLinkFirst_11_1_performtransformation_bindingAndBlackFFFFFFFBB(
			MethodParameterLinkFirst _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_MethodParameterLinkFirst_11_1_performtransformation_binding = pattern_MethodParameterLinkFirst_11_1_performtransformation_bindingFFFFFFB(
				isApplicableMatch);
		if (result_pattern_MethodParameterLinkFirst_11_1_performtransformation_binding != null) {
			MSignatureToTSignature mmethodSignatureToTMethodSignature = (MSignatureToTSignature) result_pattern_MethodParameterLinkFirst_11_1_performtransformation_binding[0];
			TMethodSignature tMethodSignature = (TMethodSignature) result_pattern_MethodParameterLinkFirst_11_1_performtransformation_binding[1];
			TParameter tParameter = (TParameter) result_pattern_MethodParameterLinkFirst_11_1_performtransformation_binding[2];
			MMethodSignature mParameterList = (MMethodSignature) result_pattern_MethodParameterLinkFirst_11_1_performtransformation_binding[3];
			MEntry mEntry = (MEntry) result_pattern_MethodParameterLinkFirst_11_1_performtransformation_binding[4];
			MEntryToTParameter eSingleVariableDeclarationToTParameter = (MEntryToTParameter) result_pattern_MethodParameterLinkFirst_11_1_performtransformation_binding[5];

			Object[] result_pattern_MethodParameterLinkFirst_11_1_performtransformation_black = pattern_MethodParameterLinkFirst_11_1_performtransformation_blackBBBBBBFBB(
					mmethodSignatureToTMethodSignature, tMethodSignature, tParameter, mParameterList, mEntry,
					eSingleVariableDeclarationToTParameter, _this, isApplicableMatch);
			if (result_pattern_MethodParameterLinkFirst_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_MethodParameterLinkFirst_11_1_performtransformation_black[6];

				return new Object[] { mmethodSignatureToTMethodSignature, tMethodSignature, tParameter, mParameterList,
						mEntry, eSingleVariableDeclarationToTParameter, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterLinkFirst_11_1_performtransformation_greenBB(
			MMethodSignature mParameterList, MEntry mEntry) {
		mParameterList.setMFirstEntry(mEntry);
		return new Object[] { mParameterList, mEntry };
	}

	public static final Object[] pattern_MethodParameterLinkFirst_11_2_collecttranslatedelements_greenF() {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		return new Object[] { ruleresult };
	}

	public static final Object[] pattern_MethodParameterLinkFirst_11_3_bookkeepingforedges_blackBBBBBBB(
			PerformRuleResult ruleresult, EObject mmethodSignatureToTMethodSignature, EObject tMethodSignature,
			EObject tParameter, EObject mParameterList, EObject mEntry,
			EObject eSingleVariableDeclarationToTParameter) {
		if (!mmethodSignatureToTMethodSignature.equals(tMethodSignature)) {
			if (!mmethodSignatureToTMethodSignature.equals(tParameter)) {
				if (!tMethodSignature.equals(tParameter)) {
					if (!mParameterList.equals(mmethodSignatureToTMethodSignature)) {
						if (!mParameterList.equals(tMethodSignature)) {
							if (!mParameterList.equals(tParameter)) {
								if (!mEntry.equals(mmethodSignatureToTMethodSignature)) {
									if (!mEntry.equals(tMethodSignature)) {
										if (!mEntry.equals(tParameter)) {
											if (!mEntry.equals(mParameterList)) {
												if (!eSingleVariableDeclarationToTParameter
														.equals(mmethodSignatureToTMethodSignature)) {
													if (!eSingleVariableDeclarationToTParameter
															.equals(tMethodSignature)) {
														if (!eSingleVariableDeclarationToTParameter
																.equals(tParameter)) {
															if (!eSingleVariableDeclarationToTParameter
																	.equals(mParameterList)) {
																if (!eSingleVariableDeclarationToTParameter
																		.equals(mEntry)) {
																	return new Object[] { ruleresult,
																			mmethodSignatureToTMethodSignature,
																			tMethodSignature, tParameter,
																			mParameterList, mEntry,
																			eSingleVariableDeclarationToTParameter };
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_MethodParameterLinkFirst_11_3_bookkeepingforedges_greenBBBBBFF(
			PerformRuleResult ruleresult, EObject tMethodSignature, EObject tParameter, EObject mParameterList,
			EObject mEntry) {
		EMoflonEdge tMethodSignature__tParameter____firstParameter = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mParameterList__mEntry____mFirstEntry = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "MethodParameterLinkFirst";
		String tMethodSignature__tParameter____firstParameter_name_prime = "firstParameter";
		String mParameterList__mEntry____mFirstEntry_name_prime = "mFirstEntry";
		tMethodSignature__tParameter____firstParameter.setSrc(tMethodSignature);
		tMethodSignature__tParameter____firstParameter.setTrg(tParameter);
		ruleresult.getTranslatedEdges().add(tMethodSignature__tParameter____firstParameter);
		mParameterList__mEntry____mFirstEntry.setSrc(mParameterList);
		mParameterList__mEntry____mFirstEntry.setTrg(mEntry);
		ruleresult.getCreatedEdges().add(mParameterList__mEntry____mFirstEntry);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		tMethodSignature__tParameter____firstParameter
				.setName(tMethodSignature__tParameter____firstParameter_name_prime);
		mParameterList__mEntry____mFirstEntry.setName(mParameterList__mEntry____mFirstEntry_name_prime);
		return new Object[] { ruleresult, tMethodSignature, tParameter, mParameterList, mEntry,
				tMethodSignature__tParameter____firstParameter, mParameterList__mEntry____mFirstEntry };
	}

	public static final void pattern_MethodParameterLinkFirst_11_5_registerobjects_expressionBBBBBBBB(
			MethodParameterLinkFirst _this, PerformRuleResult ruleresult, EObject mmethodSignatureToTMethodSignature,
			EObject tMethodSignature, EObject tParameter, EObject mParameterList, EObject mEntry,
			EObject eSingleVariableDeclarationToTParameter) {
		_this.registerObjects_BWD(ruleresult, mmethodSignatureToTMethodSignature, tMethodSignature, tParameter,
				mParameterList, mEntry, eSingleVariableDeclarationToTParameter);

	}

	public static final PerformRuleResult pattern_MethodParameterLinkFirst_11_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_MethodParameterLinkFirst_12_1_preparereturnvalue_bindingFB(
			MethodParameterLinkFirst _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterLinkFirst_12_1_preparereturnvalue_blackFBB(EClass eClass,
			MethodParameterLinkFirst _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_MethodParameterLinkFirst_12_1_preparereturnvalue_bindingAndBlackFFB(
			MethodParameterLinkFirst _this) {
		Object[] result_pattern_MethodParameterLinkFirst_12_1_preparereturnvalue_binding = pattern_MethodParameterLinkFirst_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_MethodParameterLinkFirst_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_MethodParameterLinkFirst_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_MethodParameterLinkFirst_12_1_preparereturnvalue_black = pattern_MethodParameterLinkFirst_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_MethodParameterLinkFirst_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_MethodParameterLinkFirst_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterLinkFirst_12_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "MethodParameterLinkFirst";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_MethodParameterLinkFirst_12_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("tMethodSignature");
		EObject _localVariable_1 = match.getObject("tParameter");
		EObject tmpTMethodSignature = _localVariable_0;
		EObject tmpTParameter = _localVariable_1;
		if (tmpTMethodSignature instanceof TMethodSignature) {
			TMethodSignature tMethodSignature = (TMethodSignature) tmpTMethodSignature;
			if (tmpTParameter instanceof TParameter) {
				TParameter tParameter = (TParameter) tmpTParameter;
				return new Object[] { tMethodSignature, tParameter, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_MethodParameterLinkFirst_12_2_corematch_blackFBBFFFB(
			TMethodSignature tMethodSignature, TParameter tParameter, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (MSignatureToTSignature mmethodSignatureToTMethodSignature : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tMethodSignature, MSignatureToTSignature.class, "target")) {
			MSignature tmpMParameterList = mmethodSignatureToTMethodSignature.getSource();
			if (tmpMParameterList instanceof MMethodSignature) {
				MMethodSignature mParameterList = (MMethodSignature) tmpMParameterList;
				for (MEntryToTParameter eSingleVariableDeclarationToTParameter : org.moflon.core.utilities.eMoflonEMFUtil
						.getOppositeReferenceTyped(tParameter, MEntryToTParameter.class, "target")) {
					MEntry mEntry = eSingleVariableDeclarationToTParameter.getSource();
					if (mEntry != null) {
						_result.add(new Object[] { mmethodSignatureToTMethodSignature, tMethodSignature, tParameter,
								mParameterList, mEntry, eSingleVariableDeclarationToTParameter, match });
					}

				}
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_MethodParameterLinkFirst_12_3_findcontext_blackBBBBBB(
			MSignatureToTSignature mmethodSignatureToTMethodSignature, TMethodSignature tMethodSignature,
			TParameter tParameter, MMethodSignature mParameterList, MEntry mEntry,
			MEntryToTParameter eSingleVariableDeclarationToTParameter) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (tParameter.equals(tMethodSignature.getFirstParameter())) {
			if (mParameterList.equals(mmethodSignatureToTMethodSignature.getSource())) {
				if (tMethodSignature.equals(mmethodSignatureToTMethodSignature.getTarget())) {
					if (tParameter.equals(eSingleVariableDeclarationToTParameter.getTarget())) {
						if (mEntry.equals(eSingleVariableDeclarationToTParameter.getSource())) {
							_result.add(new Object[] { mmethodSignatureToTMethodSignature, tMethodSignature, tParameter,
									mParameterList, mEntry, eSingleVariableDeclarationToTParameter });
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_MethodParameterLinkFirst_12_3_findcontext_greenBBBBBBFFFFFF(
			MSignatureToTSignature mmethodSignatureToTMethodSignature, TMethodSignature tMethodSignature,
			TParameter tParameter, MMethodSignature mParameterList, MEntry mEntry,
			MEntryToTParameter eSingleVariableDeclarationToTParameter) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge tMethodSignature__tParameter____firstParameter = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mmethodSignatureToTMethodSignature__mParameterList____source = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge mmethodSignatureToTMethodSignature__tMethodSignature____target = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge eSingleVariableDeclarationToTParameter__tParameter____target = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge eSingleVariableDeclarationToTParameter__mEntry____source = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String tMethodSignature__tParameter____firstParameter_name_prime = "firstParameter";
		String mmethodSignatureToTMethodSignature__mParameterList____source_name_prime = "source";
		String mmethodSignatureToTMethodSignature__tMethodSignature____target_name_prime = "target";
		String eSingleVariableDeclarationToTParameter__tParameter____target_name_prime = "target";
		String eSingleVariableDeclarationToTParameter__mEntry____source_name_prime = "source";
		isApplicableMatch.getAllContextElements().add(mmethodSignatureToTMethodSignature);
		isApplicableMatch.getAllContextElements().add(tMethodSignature);
		isApplicableMatch.getAllContextElements().add(tParameter);
		isApplicableMatch.getAllContextElements().add(mParameterList);
		isApplicableMatch.getAllContextElements().add(mEntry);
		isApplicableMatch.getAllContextElements().add(eSingleVariableDeclarationToTParameter);
		tMethodSignature__tParameter____firstParameter.setSrc(tMethodSignature);
		tMethodSignature__tParameter____firstParameter.setTrg(tParameter);
		isApplicableMatch.getAllContextElements().add(tMethodSignature__tParameter____firstParameter);
		mmethodSignatureToTMethodSignature__mParameterList____source.setSrc(mmethodSignatureToTMethodSignature);
		mmethodSignatureToTMethodSignature__mParameterList____source.setTrg(mParameterList);
		isApplicableMatch.getAllContextElements().add(mmethodSignatureToTMethodSignature__mParameterList____source);
		mmethodSignatureToTMethodSignature__tMethodSignature____target.setSrc(mmethodSignatureToTMethodSignature);
		mmethodSignatureToTMethodSignature__tMethodSignature____target.setTrg(tMethodSignature);
		isApplicableMatch.getAllContextElements().add(mmethodSignatureToTMethodSignature__tMethodSignature____target);
		eSingleVariableDeclarationToTParameter__tParameter____target.setSrc(eSingleVariableDeclarationToTParameter);
		eSingleVariableDeclarationToTParameter__tParameter____target.setTrg(tParameter);
		isApplicableMatch.getAllContextElements().add(eSingleVariableDeclarationToTParameter__tParameter____target);
		eSingleVariableDeclarationToTParameter__mEntry____source.setSrc(eSingleVariableDeclarationToTParameter);
		eSingleVariableDeclarationToTParameter__mEntry____source.setTrg(mEntry);
		isApplicableMatch.getAllContextElements().add(eSingleVariableDeclarationToTParameter__mEntry____source);
		tMethodSignature__tParameter____firstParameter
				.setName(tMethodSignature__tParameter____firstParameter_name_prime);
		mmethodSignatureToTMethodSignature__mParameterList____source
				.setName(mmethodSignatureToTMethodSignature__mParameterList____source_name_prime);
		mmethodSignatureToTMethodSignature__tMethodSignature____target
				.setName(mmethodSignatureToTMethodSignature__tMethodSignature____target_name_prime);
		eSingleVariableDeclarationToTParameter__tParameter____target
				.setName(eSingleVariableDeclarationToTParameter__tParameter____target_name_prime);
		eSingleVariableDeclarationToTParameter__mEntry____source
				.setName(eSingleVariableDeclarationToTParameter__mEntry____source_name_prime);
		return new Object[] { mmethodSignatureToTMethodSignature, tMethodSignature, tParameter, mParameterList, mEntry,
				eSingleVariableDeclarationToTParameter, isApplicableMatch,
				tMethodSignature__tParameter____firstParameter,
				mmethodSignatureToTMethodSignature__mParameterList____source,
				mmethodSignatureToTMethodSignature__tMethodSignature____target,
				eSingleVariableDeclarationToTParameter__tParameter____target,
				eSingleVariableDeclarationToTParameter__mEntry____source };
	}

	public static final Object[] pattern_MethodParameterLinkFirst_12_4_solveCSP_bindingFBBBBBBBB(
			MethodParameterLinkFirst _this, IsApplicableMatch isApplicableMatch,
			MSignatureToTSignature mmethodSignatureToTMethodSignature, TMethodSignature tMethodSignature,
			TParameter tParameter, MMethodSignature mParameterList, MEntry mEntry,
			MEntryToTParameter eSingleVariableDeclarationToTParameter) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, mmethodSignatureToTMethodSignature,
				tMethodSignature, tParameter, mParameterList, mEntry, eSingleVariableDeclarationToTParameter);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mmethodSignatureToTMethodSignature, tMethodSignature,
					tParameter, mParameterList, mEntry, eSingleVariableDeclarationToTParameter };
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterLinkFirst_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MethodParameterLinkFirst_12_4_solveCSP_bindingAndBlackFBBBBBBBB(
			MethodParameterLinkFirst _this, IsApplicableMatch isApplicableMatch,
			MSignatureToTSignature mmethodSignatureToTMethodSignature, TMethodSignature tMethodSignature,
			TParameter tParameter, MMethodSignature mParameterList, MEntry mEntry,
			MEntryToTParameter eSingleVariableDeclarationToTParameter) {
		Object[] result_pattern_MethodParameterLinkFirst_12_4_solveCSP_binding = pattern_MethodParameterLinkFirst_12_4_solveCSP_bindingFBBBBBBBB(
				_this, isApplicableMatch, mmethodSignatureToTMethodSignature, tMethodSignature, tParameter,
				mParameterList, mEntry, eSingleVariableDeclarationToTParameter);
		if (result_pattern_MethodParameterLinkFirst_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_MethodParameterLinkFirst_12_4_solveCSP_binding[0];

			Object[] result_pattern_MethodParameterLinkFirst_12_4_solveCSP_black = pattern_MethodParameterLinkFirst_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_MethodParameterLinkFirst_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mmethodSignatureToTMethodSignature,
						tMethodSignature, tParameter, mParameterList, mEntry, eSingleVariableDeclarationToTParameter };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodParameterLinkFirst_12_5_checkCSP_expressionFBB(
			MethodParameterLinkFirst _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodParameterLinkFirst_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_MethodParameterLinkFirst_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "MethodParameterLinkFirst";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_MethodParameterLinkFirst_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_MethodParameterLinkFirst_20_1_preparereturnvalue_bindingFB(
			MethodParameterLinkFirst _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterLinkFirst_20_1_preparereturnvalue_blackFBBF(EClass __eClass,
			MethodParameterLinkFirst _this) {
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

	public static final Object[] pattern_MethodParameterLinkFirst_20_1_preparereturnvalue_bindingAndBlackFFBF(
			MethodParameterLinkFirst _this) {
		Object[] result_pattern_MethodParameterLinkFirst_20_1_preparereturnvalue_binding = pattern_MethodParameterLinkFirst_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_MethodParameterLinkFirst_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_MethodParameterLinkFirst_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_MethodParameterLinkFirst_20_1_preparereturnvalue_black = pattern_MethodParameterLinkFirst_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_MethodParameterLinkFirst_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_MethodParameterLinkFirst_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_MethodParameterLinkFirst_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterLinkFirst_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_MethodParameterLinkFirst_20_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_firstParameter) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpTMethodSignature = _edge_firstParameter.getSrc();
		if (tmpTMethodSignature instanceof TMethodSignature) {
			TMethodSignature tMethodSignature = (TMethodSignature) tmpTMethodSignature;
			EObject tmpTParameter = _edge_firstParameter.getTrg();
			if (tmpTParameter instanceof TParameter) {
				TParameter tParameter = (TParameter) tmpTParameter;
				if (tParameter.equals(tMethodSignature.getFirstParameter())) {
					_result.add(new Object[] { tMethodSignature, tParameter, _edge_firstParameter });
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_MethodParameterLinkFirst_20_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_MethodParameterLinkFirst_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			MethodParameterLinkFirst _this, Match match, TMethodSignature tMethodSignature, TParameter tParameter) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, tMethodSignature, tParameter);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_MethodParameterLinkFirst_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			MethodParameterLinkFirst _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodParameterLinkFirst_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterLinkFirst_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_MethodParameterLinkFirst_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_MethodParameterLinkFirst_21_1_preparereturnvalue_bindingFB(
			MethodParameterLinkFirst _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterLinkFirst_21_1_preparereturnvalue_blackFBBF(EClass __eClass,
			MethodParameterLinkFirst _this) {
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

	public static final Object[] pattern_MethodParameterLinkFirst_21_1_preparereturnvalue_bindingAndBlackFFBF(
			MethodParameterLinkFirst _this) {
		Object[] result_pattern_MethodParameterLinkFirst_21_1_preparereturnvalue_binding = pattern_MethodParameterLinkFirst_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_MethodParameterLinkFirst_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_MethodParameterLinkFirst_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_MethodParameterLinkFirst_21_1_preparereturnvalue_black = pattern_MethodParameterLinkFirst_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_MethodParameterLinkFirst_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_MethodParameterLinkFirst_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_MethodParameterLinkFirst_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterLinkFirst_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_MethodParameterLinkFirst_21_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_mFirstEntry) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpMParameterList = _edge_mFirstEntry.getSrc();
		if (tmpMParameterList instanceof MMethodSignature) {
			MMethodSignature mParameterList = (MMethodSignature) tmpMParameterList;
			EObject tmpMEntry = _edge_mFirstEntry.getTrg();
			if (tmpMEntry instanceof MEntry) {
				MEntry mEntry = (MEntry) tmpMEntry;
				if (mEntry.equals(mParameterList.getMFirstEntry())) {
					_result.add(new Object[] { mParameterList, mEntry, _edge_mFirstEntry });
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_MethodParameterLinkFirst_21_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_MethodParameterLinkFirst_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			MethodParameterLinkFirst _this, Match match, MMethodSignature mParameterList, MEntry mEntry) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, mParameterList, mEntry);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_MethodParameterLinkFirst_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			MethodParameterLinkFirst _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodParameterLinkFirst_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterLinkFirst_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_MethodParameterLinkFirst_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_MethodParameterLinkFirst_24_1_prepare_blackB(MethodParameterLinkFirst _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_MethodParameterLinkFirst_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_MethodParameterLinkFirst_24_2_matchsrctrgcontext_bindingFFFFBB(
			Match targetMatch, Match sourceMatch) {
		EObject _localVariable_0 = targetMatch.getObject("tMethodSignature");
		EObject _localVariable_1 = targetMatch.getObject("tParameter");
		EObject _localVariable_2 = sourceMatch.getObject("mParameterList");
		EObject _localVariable_3 = sourceMatch.getObject("mEntry");
		EObject tmpTMethodSignature = _localVariable_0;
		EObject tmpTParameter = _localVariable_1;
		EObject tmpMParameterList = _localVariable_2;
		EObject tmpMEntry = _localVariable_3;
		if (tmpTMethodSignature instanceof TMethodSignature) {
			TMethodSignature tMethodSignature = (TMethodSignature) tmpTMethodSignature;
			if (tmpTParameter instanceof TParameter) {
				TParameter tParameter = (TParameter) tmpTParameter;
				if (tmpMParameterList instanceof MMethodSignature) {
					MMethodSignature mParameterList = (MMethodSignature) tmpMParameterList;
					if (tmpMEntry instanceof MEntry) {
						MEntry mEntry = (MEntry) tmpMEntry;
						return new Object[] { tMethodSignature, tParameter, mParameterList, mEntry, targetMatch,
								sourceMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterLinkFirst_24_2_matchsrctrgcontext_blackBBBBBB(
			TMethodSignature tMethodSignature, TParameter tParameter, MMethodSignature mParameterList, MEntry mEntry,
			Match sourceMatch, Match targetMatch) {
		if (!sourceMatch.equals(targetMatch)) {
			return new Object[] { tMethodSignature, tParameter, mParameterList, mEntry, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterLinkFirst_24_2_matchsrctrgcontext_bindingAndBlackFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_MethodParameterLinkFirst_24_2_matchsrctrgcontext_binding = pattern_MethodParameterLinkFirst_24_2_matchsrctrgcontext_bindingFFFFBB(
				targetMatch, sourceMatch);
		if (result_pattern_MethodParameterLinkFirst_24_2_matchsrctrgcontext_binding != null) {
			TMethodSignature tMethodSignature = (TMethodSignature) result_pattern_MethodParameterLinkFirst_24_2_matchsrctrgcontext_binding[0];
			TParameter tParameter = (TParameter) result_pattern_MethodParameterLinkFirst_24_2_matchsrctrgcontext_binding[1];
			MMethodSignature mParameterList = (MMethodSignature) result_pattern_MethodParameterLinkFirst_24_2_matchsrctrgcontext_binding[2];
			MEntry mEntry = (MEntry) result_pattern_MethodParameterLinkFirst_24_2_matchsrctrgcontext_binding[3];

			Object[] result_pattern_MethodParameterLinkFirst_24_2_matchsrctrgcontext_black = pattern_MethodParameterLinkFirst_24_2_matchsrctrgcontext_blackBBBBBB(
					tMethodSignature, tParameter, mParameterList, mEntry, sourceMatch, targetMatch);
			if (result_pattern_MethodParameterLinkFirst_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { tMethodSignature, tParameter, mParameterList, mEntry, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterLinkFirst_24_3_solvecsp_bindingFBBBBBBB(
			MethodParameterLinkFirst _this, TMethodSignature tMethodSignature, TParameter tParameter,
			MMethodSignature mParameterList, MEntry mEntry, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_4 = _this.isApplicable_solveCsp_CC(tMethodSignature, tParameter, mParameterList, mEntry,
				sourceMatch, targetMatch);
		CSP csp = _localVariable_4;
		if (csp != null) {
			return new Object[] { csp, _this, tMethodSignature, tParameter, mParameterList, mEntry, sourceMatch,
					targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterLinkFirst_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MethodParameterLinkFirst_24_3_solvecsp_bindingAndBlackFBBBBBBB(
			MethodParameterLinkFirst _this, TMethodSignature tMethodSignature, TParameter tParameter,
			MMethodSignature mParameterList, MEntry mEntry, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_MethodParameterLinkFirst_24_3_solvecsp_binding = pattern_MethodParameterLinkFirst_24_3_solvecsp_bindingFBBBBBBB(
				_this, tMethodSignature, tParameter, mParameterList, mEntry, sourceMatch, targetMatch);
		if (result_pattern_MethodParameterLinkFirst_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_MethodParameterLinkFirst_24_3_solvecsp_binding[0];

			Object[] result_pattern_MethodParameterLinkFirst_24_3_solvecsp_black = pattern_MethodParameterLinkFirst_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_MethodParameterLinkFirst_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, tMethodSignature, tParameter, mParameterList, mEntry, sourceMatch,
						targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodParameterLinkFirst_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_MethodParameterLinkFirst_24_5_matchcorrcontext_blackFBBBBFBB(
			TMethodSignature tMethodSignature, TParameter tParameter, MMethodSignature mParameterList, MEntry mEntry,
			Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (MSignatureToTSignature mmethodSignatureToTMethodSignature : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(mParameterList, MSignatureToTSignature.class, "source")) {
				if (tMethodSignature.equals(mmethodSignatureToTMethodSignature.getTarget())) {
					for (MEntryToTParameter eSingleVariableDeclarationToTParameter : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(tParameter, MEntryToTParameter.class, "target")) {
						if (mEntry.equals(eSingleVariableDeclarationToTParameter.getSource())) {
							_result.add(new Object[] { mmethodSignatureToTMethodSignature, tMethodSignature, tParameter,
									mParameterList, mEntry, eSingleVariableDeclarationToTParameter, sourceMatch,
									targetMatch });
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_MethodParameterLinkFirst_24_5_matchcorrcontext_greenBBBBF(
			MSignatureToTSignature mmethodSignatureToTMethodSignature,
			MEntryToTParameter eSingleVariableDeclarationToTParameter, Match sourceMatch, Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "MethodParameterLinkFirst";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(mmethodSignatureToTMethodSignature);
		ccMatch.getAllContextElements().add(eSingleVariableDeclarationToTParameter);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { mmethodSignatureToTMethodSignature, eSingleVariableDeclarationToTParameter, sourceMatch,
				targetMatch, ccMatch };
	}

	public static final Object[] pattern_MethodParameterLinkFirst_24_6_createcorrespondence_blackBBBBB(
			TMethodSignature tMethodSignature, TParameter tParameter, MMethodSignature mParameterList, MEntry mEntry,
			CCMatch ccMatch) {
		return new Object[] { tMethodSignature, tParameter, mParameterList, mEntry, ccMatch };
	}

	public static final Object[] pattern_MethodParameterLinkFirst_24_7_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_MethodParameterLinkFirst_24_7_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "MethodParameterLinkFirst";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_MethodParameterLinkFirst_24_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_MethodParameterLinkFirst_27_1_matchtggpattern_blackBB(
			MMethodSignature mParameterList, MEntry mEntry) {
		if (mEntry.equals(mParameterList.getMFirstEntry())) {
			return new Object[] { mParameterList, mEntry };
		}
		return null;
	}

	public static final boolean pattern_MethodParameterLinkFirst_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_MethodParameterLinkFirst_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_MethodParameterLinkFirst_28_1_matchtggpattern_blackBB(
			TMethodSignature tMethodSignature, TParameter tParameter) {
		if (tParameter.equals(tMethodSignature.getFirstParameter())) {
			return new Object[] { tMethodSignature, tParameter };
		}
		return null;
	}

	public static final boolean pattern_MethodParameterLinkFirst_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_MethodParameterLinkFirst_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_MethodParameterLinkFirst_29_1_createresult_blackB(
			MethodParameterLinkFirst _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_MethodParameterLinkFirst_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_MethodParameterLinkFirst_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, MSignatureToTSignature mmethodSignatureToTMethodSignature) {
		if (ruleResult.getCorrObjects().contains(mmethodSignatureToTMethodSignature)) {
			return new Object[] { ruleResult, mmethodSignatureToTMethodSignature };
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterLinkFirst_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, MMethodSignature mParameterList) {
		if (ruleResult.getSourceObjects().contains(mParameterList)) {
			return new Object[] { ruleResult, mParameterList };
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterLinkFirst_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, TMethodSignature tMethodSignature) {
		if (ruleResult.getTargetObjects().contains(tMethodSignature)) {
			return new Object[] { ruleResult, tMethodSignature };
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterLinkFirst_29_2_isapplicablecore_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, TParameter tParameter) {
		if (ruleResult.getTargetObjects().contains(tParameter)) {
			return new Object[] { ruleResult, tParameter };
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterLinkFirst_29_2_isapplicablecore_black_nac_4BB(
			ModelgeneratorRuleResult ruleResult, MEntryToTParameter eSingleVariableDeclarationToTParameter) {
		if (ruleResult.getCorrObjects().contains(eSingleVariableDeclarationToTParameter)) {
			return new Object[] { ruleResult, eSingleVariableDeclarationToTParameter };
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterLinkFirst_29_2_isapplicablecore_black_nac_5BB(
			ModelgeneratorRuleResult ruleResult, MEntry mEntry) {
		if (ruleResult.getSourceObjects().contains(mEntry)) {
			return new Object[] { ruleResult, mEntry };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_MethodParameterLinkFirst_29_2_isapplicablecore_blackFFFFFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList mmethodSignatureToTMethodSignatureList : ruleEntryContainer.getRuleEntryList()) {
			for (RuleEntryList eSingleVariableDeclarationToTParameterList : ruleEntryContainer.getRuleEntryList()) {
				if (!eSingleVariableDeclarationToTParameterList.equals(mmethodSignatureToTMethodSignatureList)) {
					for (EObject tmpMmethodSignatureToTMethodSignature : mmethodSignatureToTMethodSignatureList
							.getEntryObjects()) {
						if (tmpMmethodSignatureToTMethodSignature instanceof MSignatureToTSignature) {
							MSignatureToTSignature mmethodSignatureToTMethodSignature = (MSignatureToTSignature) tmpMmethodSignatureToTMethodSignature;
							MSignature tmpMParameterList = mmethodSignatureToTMethodSignature.getSource();
							if (tmpMParameterList instanceof MMethodSignature) {
								MMethodSignature mParameterList = (MMethodSignature) tmpMParameterList;
								TSignature tmpTMethodSignature = mmethodSignatureToTMethodSignature.getTarget();
								if (tmpTMethodSignature instanceof TMethodSignature) {
									TMethodSignature tMethodSignature = (TMethodSignature) tmpTMethodSignature;
									if (pattern_MethodParameterLinkFirst_29_2_isapplicablecore_black_nac_0BB(ruleResult,
											mmethodSignatureToTMethodSignature) == null) {
										if (pattern_MethodParameterLinkFirst_29_2_isapplicablecore_black_nac_1BB(
												ruleResult, mParameterList) == null) {
											if (pattern_MethodParameterLinkFirst_29_2_isapplicablecore_black_nac_2BB(
													ruleResult, tMethodSignature) == null) {
												for (EObject tmpESingleVariableDeclarationToTParameter : eSingleVariableDeclarationToTParameterList
														.getEntryObjects()) {
													if (tmpESingleVariableDeclarationToTParameter instanceof MEntryToTParameter) {
														MEntryToTParameter eSingleVariableDeclarationToTParameter = (MEntryToTParameter) tmpESingleVariableDeclarationToTParameter;
														TParameter tParameter = eSingleVariableDeclarationToTParameter
																.getTarget();
														if (tParameter != null) {
															MEntry mEntry = eSingleVariableDeclarationToTParameter
																	.getSource();
															if (mEntry != null) {
																if (pattern_MethodParameterLinkFirst_29_2_isapplicablecore_black_nac_4BB(
																		ruleResult,
																		eSingleVariableDeclarationToTParameter) == null) {
																	if (pattern_MethodParameterLinkFirst_29_2_isapplicablecore_black_nac_3BB(
																			ruleResult, tParameter) == null) {
																		if (pattern_MethodParameterLinkFirst_29_2_isapplicablecore_black_nac_5BB(
																				ruleResult, mEntry) == null) {
																			_result.add(new Object[] {
																					mmethodSignatureToTMethodSignatureList,
																					mmethodSignatureToTMethodSignature,
																					mParameterList, tMethodSignature,
																					eSingleVariableDeclarationToTParameterList,
																					tParameter,
																					eSingleVariableDeclarationToTParameter,
																					mEntry, ruleEntryContainer,
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
		return _result;
	}

	public static final Object[] pattern_MethodParameterLinkFirst_29_3_solveCSP_bindingFBBBBBBBBB(
			MethodParameterLinkFirst _this, IsApplicableMatch isApplicableMatch,
			MSignatureToTSignature mmethodSignatureToTMethodSignature, TMethodSignature tMethodSignature,
			TParameter tParameter, MMethodSignature mParameterList, MEntry mEntry,
			MEntryToTParameter eSingleVariableDeclarationToTParameter, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, mmethodSignatureToTMethodSignature,
				tMethodSignature, tParameter, mParameterList, mEntry, eSingleVariableDeclarationToTParameter,
				ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mmethodSignatureToTMethodSignature, tMethodSignature,
					tParameter, mParameterList, mEntry, eSingleVariableDeclarationToTParameter, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_MethodParameterLinkFirst_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MethodParameterLinkFirst_29_3_solveCSP_bindingAndBlackFBBBBBBBBB(
			MethodParameterLinkFirst _this, IsApplicableMatch isApplicableMatch,
			MSignatureToTSignature mmethodSignatureToTMethodSignature, TMethodSignature tMethodSignature,
			TParameter tParameter, MMethodSignature mParameterList, MEntry mEntry,
			MEntryToTParameter eSingleVariableDeclarationToTParameter, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_MethodParameterLinkFirst_29_3_solveCSP_binding = pattern_MethodParameterLinkFirst_29_3_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, mmethodSignatureToTMethodSignature, tMethodSignature, tParameter,
				mParameterList, mEntry, eSingleVariableDeclarationToTParameter, ruleResult);
		if (result_pattern_MethodParameterLinkFirst_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_MethodParameterLinkFirst_29_3_solveCSP_binding[0];

			Object[] result_pattern_MethodParameterLinkFirst_29_3_solveCSP_black = pattern_MethodParameterLinkFirst_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_MethodParameterLinkFirst_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mmethodSignatureToTMethodSignature,
						tMethodSignature, tParameter, mParameterList, mEntry, eSingleVariableDeclarationToTParameter,
						ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodParameterLinkFirst_29_4_checkCSP_expressionFBB(
			MethodParameterLinkFirst _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodParameterLinkFirst_29_5_checknacs_blackBBBBBB(
			MSignatureToTSignature mmethodSignatureToTMethodSignature, TMethodSignature tMethodSignature,
			TParameter tParameter, MMethodSignature mParameterList, MEntry mEntry,
			MEntryToTParameter eSingleVariableDeclarationToTParameter) {
		return new Object[] { mmethodSignatureToTMethodSignature, tMethodSignature, tParameter, mParameterList, mEntry,
				eSingleVariableDeclarationToTParameter };
	}

	public static final Object[] pattern_MethodParameterLinkFirst_29_6_perform_blackBBBBBBB(
			MSignatureToTSignature mmethodSignatureToTMethodSignature, TMethodSignature tMethodSignature,
			TParameter tParameter, MMethodSignature mParameterList, MEntry mEntry,
			MEntryToTParameter eSingleVariableDeclarationToTParameter, ModelgeneratorRuleResult ruleResult) {
		return new Object[] { mmethodSignatureToTMethodSignature, tMethodSignature, tParameter, mParameterList, mEntry,
				eSingleVariableDeclarationToTParameter, ruleResult };
	}

	public static final Object[] pattern_MethodParameterLinkFirst_29_6_perform_greenBBBBB(
			TMethodSignature tMethodSignature, TParameter tParameter, MMethodSignature mParameterList, MEntry mEntry,
			ModelgeneratorRuleResult ruleResult) {
		tMethodSignature.setFirstParameter(tParameter);
		mParameterList.setMFirstEntry(mEntry);
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { tMethodSignature, tParameter, mParameterList, mEntry, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_MethodParameterLinkFirst_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //MethodParameterLinkFirstImpl
