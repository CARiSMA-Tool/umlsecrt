/**
 */
package org.gravity.tgg.modisco.pm.Rules.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.LinkedList;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;

import org.eclipse.modisco.java.AbstractMethodInvocation;
import org.eclipse.modisco.java.Type;

import org.gravity.modisco.MMethodInvocation;

import org.gravity.tgg.modisco.pm.AbstractMethodInvocationToTAccess;

import org.gravity.tgg.modisco.pm.Rules.MethodInvocationStaticType;
import org.gravity.tgg.modisco.pm.Rules.RulesPackage;

import org.gravity.tgg.modisco.pm.TypeToTAbstractType;

import org.gravity.typegraph.basic.TAbstractType;
import org.gravity.typegraph.basic.TAccess;
import org.gravity.typegraph.basic.TCall;

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
 * An implementation of the model object '<em><b>Method Invocation Static Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class MethodInvocationStaticTypeImpl extends AbstractRuleImpl implements MethodInvocationStaticType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MethodInvocationStaticTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getMethodInvocationStaticType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, MMethodInvocation invocation, Type mStaticType) {

		Object[] result1_black = MethodInvocationStaticTypeImpl
				.pattern_MethodInvocationStaticType_0_1_initialbindings_blackBBBB(this, match, invocation, mStaticType);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[match] = " + match
							+ ", " + "[invocation] = " + invocation + ", " + "[mStaticType] = " + mStaticType + ".");
		}

		Object[] result2_bindingAndBlack = MethodInvocationStaticTypeImpl
				.pattern_MethodInvocationStaticType_0_2_SolveCSP_bindingAndBlackFBBBB(this, match, invocation,
						mStaticType);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[match] = " + match
							+ ", " + "[invocation] = " + invocation + ", " + "[mStaticType] = " + mStaticType + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (MethodInvocationStaticTypeImpl.pattern_MethodInvocationStaticType_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = MethodInvocationStaticTypeImpl
					.pattern_MethodInvocationStaticType_0_4_collectelementstobetranslated_blackBBB(match, invocation,
							mStaticType);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[invocation] = " + invocation + ", " + "[mStaticType] = " + mStaticType + ".");
			}
			MethodInvocationStaticTypeImpl
					.pattern_MethodInvocationStaticType_0_4_collectelementstobetranslated_greenBBBF(match, invocation,
							mStaticType);
			//nothing EMoflonEdge invocation__mStaticType____mStaticType = (EMoflonEdge) result4_green[3];

			Object[] result5_black = MethodInvocationStaticTypeImpl
					.pattern_MethodInvocationStaticType_0_5_collectcontextelements_blackBBB(match, invocation,
							mStaticType);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[invocation] = " + invocation + ", " + "[mStaticType] = " + mStaticType + ".");
			}
			MethodInvocationStaticTypeImpl.pattern_MethodInvocationStaticType_0_5_collectcontextelements_greenBBB(match,
					invocation, mStaticType);

			// 
			MethodInvocationStaticTypeImpl.pattern_MethodInvocationStaticType_0_6_registerobjectstomatch_expressionBBBB(
					this, match, invocation, mStaticType);
			return MethodInvocationStaticTypeImpl.pattern_MethodInvocationStaticType_0_7_expressionF();
		} else {
			return MethodInvocationStaticTypeImpl.pattern_MethodInvocationStaticType_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = MethodInvocationStaticTypeImpl
				.pattern_MethodInvocationStaticType_1_1_performtransformation_bindingAndBlackFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		TypeToTAbstractType mStaticTypeTotStaticType = (TypeToTAbstractType) result1_bindingAndBlack[0];
		MMethodInvocation invocation = (MMethodInvocation) result1_bindingAndBlack[1];
		TCall tAccess = (TCall) result1_bindingAndBlack[2];
		TAbstractType tStaticType = (TAbstractType) result1_bindingAndBlack[3];
		Type mStaticType = (Type) result1_bindingAndBlack[4];
		AbstractMethodInvocationToTAccess invocationToTAccess = (AbstractMethodInvocationToTAccess) result1_bindingAndBlack[5];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[6];
		MethodInvocationStaticTypeImpl.pattern_MethodInvocationStaticType_1_1_performtransformation_greenBB(tAccess,
				tStaticType);

		Object[] result2_green = MethodInvocationStaticTypeImpl
				.pattern_MethodInvocationStaticType_1_2_collecttranslatedelements_greenF();
		if (result2_green == null) {
			throw new RuntimeException("Pattern matching failed.");
		}
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = MethodInvocationStaticTypeImpl
				.pattern_MethodInvocationStaticType_1_3_bookkeepingforedges_blackBBBBBBB(ruleresult,
						mStaticTypeTotStaticType, invocation, tAccess, tStaticType, mStaticType, invocationToTAccess);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[mStaticTypeTotStaticType] = " + mStaticTypeTotStaticType + ", " + "[invocation] = "
					+ invocation + ", " + "[tAccess] = " + tAccess + ", " + "[tStaticType] = " + tStaticType + ", "
					+ "[mStaticType] = " + mStaticType + ", " + "[invocationToTAccess] = " + invocationToTAccess + ".");
		}
		MethodInvocationStaticTypeImpl.pattern_MethodInvocationStaticType_1_3_bookkeepingforedges_greenBBBBBFF(
				ruleresult, invocation, tAccess, tStaticType, mStaticType);
		//nothing EMoflonEdge tAccess__tStaticType____staticType = (EMoflonEdge) result3_green[5];
		//nothing EMoflonEdge invocation__mStaticType____mStaticType = (EMoflonEdge) result3_green[6];

		// 
		// 
		MethodInvocationStaticTypeImpl.pattern_MethodInvocationStaticType_1_5_registerobjects_expressionBBBBBBBB(this,
				ruleresult, mStaticTypeTotStaticType, invocation, tAccess, tStaticType, mStaticType,
				invocationToTAccess);
		return MethodInvocationStaticTypeImpl.pattern_MethodInvocationStaticType_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = MethodInvocationStaticTypeImpl
				.pattern_MethodInvocationStaticType_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = MethodInvocationStaticTypeImpl
				.pattern_MethodInvocationStaticType_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = MethodInvocationStaticTypeImpl
				.pattern_MethodInvocationStaticType_2_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		MMethodInvocation invocation = (MMethodInvocation) result2_binding[0];
		Type mStaticType = (Type) result2_binding[1];
		for (Object[] result2_black : MethodInvocationStaticTypeImpl
				.pattern_MethodInvocationStaticType_2_2_corematch_blackFBFFBFB(invocation, mStaticType, match)) {
			TypeToTAbstractType mStaticTypeTotStaticType = (TypeToTAbstractType) result2_black[0];
			TCall tAccess = (TCall) result2_black[2];
			TAbstractType tStaticType = (TAbstractType) result2_black[3];
			AbstractMethodInvocationToTAccess invocationToTAccess = (AbstractMethodInvocationToTAccess) result2_black[5];
			// ForEach 
			for (Object[] result3_black : MethodInvocationStaticTypeImpl
					.pattern_MethodInvocationStaticType_2_3_findcontext_blackBBBBBB(mStaticTypeTotStaticType,
							invocation, tAccess, tStaticType, mStaticType, invocationToTAccess)) {
				Object[] result3_green = MethodInvocationStaticTypeImpl
						.pattern_MethodInvocationStaticType_2_3_findcontext_greenBBBBBBFFFFFF(mStaticTypeTotStaticType,
								invocation, tAccess, tStaticType, mStaticType, invocationToTAccess);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[6];
				//nothing EMoflonEdge mStaticTypeTotStaticType__tStaticType____target = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge invocation__mStaticType____mStaticType = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge mStaticTypeTotStaticType__mStaticType____source = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge invocationToTAccess__invocation____source = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge invocationToTAccess__tAccess____target = (EMoflonEdge) result3_green[11];

				Object[] result4_bindingAndBlack = MethodInvocationStaticTypeImpl
						.pattern_MethodInvocationStaticType_2_4_solveCSP_bindingAndBlackFBBBBBBBB(this,
								isApplicableMatch, mStaticTypeTotStaticType, invocation, tAccess, tStaticType,
								mStaticType, invocationToTAccess);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[mStaticTypeTotStaticType] = "
							+ mStaticTypeTotStaticType + ", " + "[invocation] = " + invocation + ", " + "[tAccess] = "
							+ tAccess + ", " + "[tStaticType] = " + tStaticType + ", " + "[mStaticType] = "
							+ mStaticType + ", " + "[invocationToTAccess] = " + invocationToTAccess + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (MethodInvocationStaticTypeImpl.pattern_MethodInvocationStaticType_2_5_checkCSP_expressionFBB(this,
						csp)) {

					Object[] result6_black = MethodInvocationStaticTypeImpl
							.pattern_MethodInvocationStaticType_2_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					MethodInvocationStaticTypeImpl.pattern_MethodInvocationStaticType_2_6_addmatchtoruleresult_greenBB(
							ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return MethodInvocationStaticTypeImpl.pattern_MethodInvocationStaticType_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, MMethodInvocation invocation, Type mStaticType) {
		match.registerObject("invocation", invocation);
		match.registerObject("mStaticType", mStaticType);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, MMethodInvocation invocation, Type mStaticType) {// Create CSP
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
			TypeToTAbstractType mStaticTypeTotStaticType, MMethodInvocation invocation, TCall tAccess,
			TAbstractType tStaticType, Type mStaticType, AbstractMethodInvocationToTAccess invocationToTAccess) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("mStaticTypeTotStaticType", mStaticTypeTotStaticType);
		isApplicableMatch.registerObject("invocation", invocation);
		isApplicableMatch.registerObject("tAccess", tAccess);
		isApplicableMatch.registerObject("tStaticType", tStaticType);
		isApplicableMatch.registerObject("mStaticType", mStaticType);
		isApplicableMatch.registerObject("invocationToTAccess", invocationToTAccess);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject mStaticTypeTotStaticType, EObject invocation,
			EObject tAccess, EObject tStaticType, EObject mStaticType, EObject invocationToTAccess) {
		ruleresult.registerObject("mStaticTypeTotStaticType", mStaticTypeTotStaticType);
		ruleresult.registerObject("invocation", invocation);
		ruleresult.registerObject("tAccess", tAccess);
		ruleresult.registerObject("tStaticType", tStaticType);
		ruleresult.registerObject("mStaticType", mStaticType);
		ruleresult.registerObject("invocationToTAccess", invocationToTAccess);

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
	public boolean isAppropriate_BWD(Match match, TCall tAccess, TAbstractType tStaticType) {

		Object[] result1_black = MethodInvocationStaticTypeImpl
				.pattern_MethodInvocationStaticType_10_1_initialbindings_blackBBBB(this, match, tAccess, tStaticType);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[match] = " + match
							+ ", " + "[tAccess] = " + tAccess + ", " + "[tStaticType] = " + tStaticType + ".");
		}

		Object[] result2_bindingAndBlack = MethodInvocationStaticTypeImpl
				.pattern_MethodInvocationStaticType_10_2_SolveCSP_bindingAndBlackFBBBB(this, match, tAccess,
						tStaticType);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[match] = " + match
							+ ", " + "[tAccess] = " + tAccess + ", " + "[tStaticType] = " + tStaticType + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (MethodInvocationStaticTypeImpl.pattern_MethodInvocationStaticType_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = MethodInvocationStaticTypeImpl
					.pattern_MethodInvocationStaticType_10_4_collectelementstobetranslated_blackBBB(match, tAccess,
							tStaticType);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[tAccess] = " + tAccess + ", " + "[tStaticType] = " + tStaticType + ".");
			}
			MethodInvocationStaticTypeImpl
					.pattern_MethodInvocationStaticType_10_4_collectelementstobetranslated_greenBBBF(match, tAccess,
							tStaticType);
			//nothing EMoflonEdge tAccess__tStaticType____staticType = (EMoflonEdge) result4_green[3];

			Object[] result5_black = MethodInvocationStaticTypeImpl
					.pattern_MethodInvocationStaticType_10_5_collectcontextelements_blackBBB(match, tAccess,
							tStaticType);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[tAccess] = " + tAccess + ", " + "[tStaticType] = " + tStaticType + ".");
			}
			MethodInvocationStaticTypeImpl.pattern_MethodInvocationStaticType_10_5_collectcontextelements_greenBBB(
					match, tAccess, tStaticType);

			// 
			MethodInvocationStaticTypeImpl
					.pattern_MethodInvocationStaticType_10_6_registerobjectstomatch_expressionBBBB(this, match, tAccess,
							tStaticType);
			return MethodInvocationStaticTypeImpl.pattern_MethodInvocationStaticType_10_7_expressionF();
		} else {
			return MethodInvocationStaticTypeImpl.pattern_MethodInvocationStaticType_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = MethodInvocationStaticTypeImpl
				.pattern_MethodInvocationStaticType_11_1_performtransformation_bindingAndBlackFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		TypeToTAbstractType mStaticTypeTotStaticType = (TypeToTAbstractType) result1_bindingAndBlack[0];
		MMethodInvocation invocation = (MMethodInvocation) result1_bindingAndBlack[1];
		TCall tAccess = (TCall) result1_bindingAndBlack[2];
		TAbstractType tStaticType = (TAbstractType) result1_bindingAndBlack[3];
		Type mStaticType = (Type) result1_bindingAndBlack[4];
		AbstractMethodInvocationToTAccess invocationToTAccess = (AbstractMethodInvocationToTAccess) result1_bindingAndBlack[5];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[6];
		MethodInvocationStaticTypeImpl.pattern_MethodInvocationStaticType_11_1_performtransformation_greenBB(invocation,
				mStaticType);

		Object[] result2_green = MethodInvocationStaticTypeImpl
				.pattern_MethodInvocationStaticType_11_2_collecttranslatedelements_greenF();
		if (result2_green == null) {
			throw new RuntimeException("Pattern matching failed.");
		}
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = MethodInvocationStaticTypeImpl
				.pattern_MethodInvocationStaticType_11_3_bookkeepingforedges_blackBBBBBBB(ruleresult,
						mStaticTypeTotStaticType, invocation, tAccess, tStaticType, mStaticType, invocationToTAccess);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[mStaticTypeTotStaticType] = " + mStaticTypeTotStaticType + ", " + "[invocation] = "
					+ invocation + ", " + "[tAccess] = " + tAccess + ", " + "[tStaticType] = " + tStaticType + ", "
					+ "[mStaticType] = " + mStaticType + ", " + "[invocationToTAccess] = " + invocationToTAccess + ".");
		}
		MethodInvocationStaticTypeImpl.pattern_MethodInvocationStaticType_11_3_bookkeepingforedges_greenBBBBBFF(
				ruleresult, invocation, tAccess, tStaticType, mStaticType);
		//nothing EMoflonEdge tAccess__tStaticType____staticType = (EMoflonEdge) result3_green[5];
		//nothing EMoflonEdge invocation__mStaticType____mStaticType = (EMoflonEdge) result3_green[6];

		// 
		// 
		MethodInvocationStaticTypeImpl.pattern_MethodInvocationStaticType_11_5_registerobjects_expressionBBBBBBBB(this,
				ruleresult, mStaticTypeTotStaticType, invocation, tAccess, tStaticType, mStaticType,
				invocationToTAccess);
		return MethodInvocationStaticTypeImpl.pattern_MethodInvocationStaticType_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = MethodInvocationStaticTypeImpl
				.pattern_MethodInvocationStaticType_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = MethodInvocationStaticTypeImpl
				.pattern_MethodInvocationStaticType_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = MethodInvocationStaticTypeImpl
				.pattern_MethodInvocationStaticType_12_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		TCall tAccess = (TCall) result2_binding[0];
		TAbstractType tStaticType = (TAbstractType) result2_binding[1];
		for (Object[] result2_black : MethodInvocationStaticTypeImpl
				.pattern_MethodInvocationStaticType_12_2_corematch_blackFFBBFFB(tAccess, tStaticType, match)) {
			TypeToTAbstractType mStaticTypeTotStaticType = (TypeToTAbstractType) result2_black[0];
			MMethodInvocation invocation = (MMethodInvocation) result2_black[1];
			Type mStaticType = (Type) result2_black[4];
			AbstractMethodInvocationToTAccess invocationToTAccess = (AbstractMethodInvocationToTAccess) result2_black[5];
			// ForEach 
			for (Object[] result3_black : MethodInvocationStaticTypeImpl
					.pattern_MethodInvocationStaticType_12_3_findcontext_blackBBBBBB(mStaticTypeTotStaticType,
							invocation, tAccess, tStaticType, mStaticType, invocationToTAccess)) {
				Object[] result3_green = MethodInvocationStaticTypeImpl
						.pattern_MethodInvocationStaticType_12_3_findcontext_greenBBBBBBFFFFFF(mStaticTypeTotStaticType,
								invocation, tAccess, tStaticType, mStaticType, invocationToTAccess);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[6];
				//nothing EMoflonEdge tAccess__tStaticType____staticType = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge mStaticTypeTotStaticType__tStaticType____target = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge mStaticTypeTotStaticType__mStaticType____source = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge invocationToTAccess__invocation____source = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge invocationToTAccess__tAccess____target = (EMoflonEdge) result3_green[11];

				Object[] result4_bindingAndBlack = MethodInvocationStaticTypeImpl
						.pattern_MethodInvocationStaticType_12_4_solveCSP_bindingAndBlackFBBBBBBBB(this,
								isApplicableMatch, mStaticTypeTotStaticType, invocation, tAccess, tStaticType,
								mStaticType, invocationToTAccess);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[mStaticTypeTotStaticType] = "
							+ mStaticTypeTotStaticType + ", " + "[invocation] = " + invocation + ", " + "[tAccess] = "
							+ tAccess + ", " + "[tStaticType] = " + tStaticType + ", " + "[mStaticType] = "
							+ mStaticType + ", " + "[invocationToTAccess] = " + invocationToTAccess + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (MethodInvocationStaticTypeImpl.pattern_MethodInvocationStaticType_12_5_checkCSP_expressionFBB(this,
						csp)) {

					Object[] result6_black = MethodInvocationStaticTypeImpl
							.pattern_MethodInvocationStaticType_12_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					MethodInvocationStaticTypeImpl.pattern_MethodInvocationStaticType_12_6_addmatchtoruleresult_greenBB(
							ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return MethodInvocationStaticTypeImpl.pattern_MethodInvocationStaticType_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, TCall tAccess, TAbstractType tStaticType) {
		match.registerObject("tAccess", tAccess);
		match.registerObject("tStaticType", tStaticType);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, TCall tAccess, TAbstractType tStaticType) {// Create CSP
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
			TypeToTAbstractType mStaticTypeTotStaticType, MMethodInvocation invocation, TCall tAccess,
			TAbstractType tStaticType, Type mStaticType, AbstractMethodInvocationToTAccess invocationToTAccess) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("mStaticTypeTotStaticType", mStaticTypeTotStaticType);
		isApplicableMatch.registerObject("invocation", invocation);
		isApplicableMatch.registerObject("tAccess", tAccess);
		isApplicableMatch.registerObject("tStaticType", tStaticType);
		isApplicableMatch.registerObject("mStaticType", mStaticType);
		isApplicableMatch.registerObject("invocationToTAccess", invocationToTAccess);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject mStaticTypeTotStaticType, EObject invocation,
			EObject tAccess, EObject tStaticType, EObject mStaticType, EObject invocationToTAccess) {
		ruleresult.registerObject("mStaticTypeTotStaticType", mStaticTypeTotStaticType);
		ruleresult.registerObject("invocation", invocation);
		ruleresult.registerObject("tAccess", tAccess);
		ruleresult.registerObject("tStaticType", tStaticType);
		ruleresult.registerObject("mStaticType", mStaticType);
		ruleresult.registerObject("invocationToTAccess", invocationToTAccess);

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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_66(EMoflonEdge _edge_staticType) {

		Object[] result1_bindingAndBlack = MethodInvocationStaticTypeImpl
				.pattern_MethodInvocationStaticType_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = MethodInvocationStaticTypeImpl
				.pattern_MethodInvocationStaticType_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : MethodInvocationStaticTypeImpl
				.pattern_MethodInvocationStaticType_20_2_testcorematchandDECs_blackFFB(_edge_staticType)) {
			TCall tAccess = (TCall) result2_black[0];
			TAbstractType tStaticType = (TAbstractType) result2_black[1];
			Object[] result2_green = MethodInvocationStaticTypeImpl
					.pattern_MethodInvocationStaticType_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (MethodInvocationStaticTypeImpl
					.pattern_MethodInvocationStaticType_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
							this, match, tAccess, tStaticType)) {
				// 
				if (MethodInvocationStaticTypeImpl
						.pattern_MethodInvocationStaticType_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = MethodInvocationStaticTypeImpl
							.pattern_MethodInvocationStaticType_20_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					MethodInvocationStaticTypeImpl
							.pattern_MethodInvocationStaticType_20_5_Addmatchtoruleresult_greenBBBB(match,
									__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return MethodInvocationStaticTypeImpl.pattern_MethodInvocationStaticType_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_69(EMoflonEdge _edge_mStaticType) {

		Object[] result1_bindingAndBlack = MethodInvocationStaticTypeImpl
				.pattern_MethodInvocationStaticType_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = MethodInvocationStaticTypeImpl
				.pattern_MethodInvocationStaticType_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : MethodInvocationStaticTypeImpl
				.pattern_MethodInvocationStaticType_21_2_testcorematchandDECs_blackFFB(_edge_mStaticType)) {
			MMethodInvocation invocation = (MMethodInvocation) result2_black[0];
			Type mStaticType = (Type) result2_black[1];
			Object[] result2_green = MethodInvocationStaticTypeImpl
					.pattern_MethodInvocationStaticType_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (MethodInvocationStaticTypeImpl
					.pattern_MethodInvocationStaticType_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
							this, match, invocation, mStaticType)) {
				// 
				if (MethodInvocationStaticTypeImpl
						.pattern_MethodInvocationStaticType_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = MethodInvocationStaticTypeImpl
							.pattern_MethodInvocationStaticType_21_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					MethodInvocationStaticTypeImpl
							.pattern_MethodInvocationStaticType_21_5_Addmatchtoruleresult_greenBBBB(match,
									__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return MethodInvocationStaticTypeImpl.pattern_MethodInvocationStaticType_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("MethodInvocationStaticType");
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
		ruleResult.setRule("MethodInvocationStaticType");
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

		Object[] result1_black = MethodInvocationStaticTypeImpl
				.pattern_MethodInvocationStaticType_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = MethodInvocationStaticTypeImpl
				.pattern_MethodInvocationStaticType_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = MethodInvocationStaticTypeImpl
				.pattern_MethodInvocationStaticType_24_2_matchsrctrgcontext_bindingAndBlackFFFFBB(sourceMatch,
						targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		MMethodInvocation invocation = (MMethodInvocation) result2_bindingAndBlack[0];
		TCall tAccess = (TCall) result2_bindingAndBlack[1];
		TAbstractType tStaticType = (TAbstractType) result2_bindingAndBlack[2];
		Type mStaticType = (Type) result2_bindingAndBlack[3];

		Object[] result3_bindingAndBlack = MethodInvocationStaticTypeImpl
				.pattern_MethodInvocationStaticType_24_3_solvecsp_bindingAndBlackFBBBBBBB(this, invocation, tAccess,
						tStaticType, mStaticType, sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[invocation] = " + invocation + ", " + "[tAccess] = " + tAccess + ", " + "[tStaticType] = "
					+ tStaticType + ", " + "[mStaticType] = " + mStaticType + ", " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (MethodInvocationStaticTypeImpl.pattern_MethodInvocationStaticType_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : MethodInvocationStaticTypeImpl
					.pattern_MethodInvocationStaticType_24_5_matchcorrcontext_blackFBBBBFBB(invocation, tAccess,
							tStaticType, mStaticType, sourceMatch, targetMatch)) {
				TypeToTAbstractType mStaticTypeTotStaticType = (TypeToTAbstractType) result5_black[0];
				AbstractMethodInvocationToTAccess invocationToTAccess = (AbstractMethodInvocationToTAccess) result5_black[5];
				Object[] result5_green = MethodInvocationStaticTypeImpl
						.pattern_MethodInvocationStaticType_24_5_matchcorrcontext_greenBBBBF(mStaticTypeTotStaticType,
								invocationToTAccess, sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[4];

				Object[] result6_black = MethodInvocationStaticTypeImpl
						.pattern_MethodInvocationStaticType_24_6_createcorrespondence_blackBBBBB(invocation, tAccess,
								tStaticType, mStaticType, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[invocation] = "
							+ invocation + ", " + "[tAccess] = " + tAccess + ", " + "[tStaticType] = " + tStaticType
							+ ", " + "[mStaticType] = " + mStaticType + ", " + "[ccMatch] = " + ccMatch + ".");
				}

				Object[] result7_black = MethodInvocationStaticTypeImpl
						.pattern_MethodInvocationStaticType_24_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				MethodInvocationStaticTypeImpl
						.pattern_MethodInvocationStaticType_24_7_addtoreturnedresult_greenBB(result, ccMatch);

			}

		} else {
		}
		return MethodInvocationStaticTypeImpl.pattern_MethodInvocationStaticType_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(MMethodInvocation invocation, TCall tAccess, TAbstractType tStaticType,
			Type mStaticType, Match sourceMatch, Match targetMatch) {// Create CSP
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
	public boolean checkDEC_FWD(MMethodInvocation invocation, Type mStaticType) {// 
		Object[] result1_black = MethodInvocationStaticTypeImpl
				.pattern_MethodInvocationStaticType_27_1_matchtggpattern_blackBB(invocation, mStaticType);
		if (result1_black != null) {
			return MethodInvocationStaticTypeImpl.pattern_MethodInvocationStaticType_27_2_expressionF();
		} else {
			return MethodInvocationStaticTypeImpl.pattern_MethodInvocationStaticType_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(TCall tAccess, TAbstractType tStaticType) {// 
		Object[] result1_black = MethodInvocationStaticTypeImpl
				.pattern_MethodInvocationStaticType_28_1_matchtggpattern_blackBB(tAccess, tStaticType);
		if (result1_black != null) {
			return MethodInvocationStaticTypeImpl.pattern_MethodInvocationStaticType_28_2_expressionF();
		} else {
			return MethodInvocationStaticTypeImpl.pattern_MethodInvocationStaticType_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer,
			TypeToTAbstractType mStaticTypeTotStaticTypeParameter,
			AbstractMethodInvocationToTAccess invocationToTAccessParameter) {

		Object[] result1_black = MethodInvocationStaticTypeImpl
				.pattern_MethodInvocationStaticType_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = MethodInvocationStaticTypeImpl
				.pattern_MethodInvocationStaticType_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : MethodInvocationStaticTypeImpl
				.pattern_MethodInvocationStaticType_29_2_isapplicablecore_blackFFFFFFFFBB(ruleEntryContainer,
						ruleResult)) {
			//nothing RuleEntryList mStaticTypeTotStaticTypeList = (RuleEntryList) result2_black[0];
			TypeToTAbstractType mStaticTypeTotStaticType = (TypeToTAbstractType) result2_black[1];
			TAbstractType tStaticType = (TAbstractType) result2_black[2];
			Type mStaticType = (Type) result2_black[3];
			//nothing RuleEntryList invocationToTAccessList = (RuleEntryList) result2_black[4];
			MMethodInvocation invocation = (MMethodInvocation) result2_black[5];
			AbstractMethodInvocationToTAccess invocationToTAccess = (AbstractMethodInvocationToTAccess) result2_black[6];
			TCall tAccess = (TCall) result2_black[7];

			Object[] result3_bindingAndBlack = MethodInvocationStaticTypeImpl
					.pattern_MethodInvocationStaticType_29_3_solveCSP_bindingAndBlackFBBBBBBBBB(this, isApplicableMatch,
							mStaticTypeTotStaticType, invocation, tAccess, tStaticType, mStaticType,
							invocationToTAccess, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[mStaticTypeTotStaticType] = "
						+ mStaticTypeTotStaticType + ", " + "[invocation] = " + invocation + ", " + "[tAccess] = "
						+ tAccess + ", " + "[tStaticType] = " + tStaticType + ", " + "[mStaticType] = " + mStaticType
						+ ", " + "[invocationToTAccess] = " + invocationToTAccess + ", " + "[ruleResult] = "
						+ ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (MethodInvocationStaticTypeImpl.pattern_MethodInvocationStaticType_29_4_checkCSP_expressionFBB(this,
					csp)) {
				// 
				Object[] result5_black = MethodInvocationStaticTypeImpl
						.pattern_MethodInvocationStaticType_29_5_checknacs_blackBBBBBB(mStaticTypeTotStaticType,
								invocation, tAccess, tStaticType, mStaticType, invocationToTAccess);
				if (result5_black != null) {

					Object[] result6_black = MethodInvocationStaticTypeImpl
							.pattern_MethodInvocationStaticType_29_6_perform_blackBBBBBBB(mStaticTypeTotStaticType,
									invocation, tAccess, tStaticType, mStaticType, invocationToTAccess, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: "
								+ "[mStaticTypeTotStaticType] = " + mStaticTypeTotStaticType + ", " + "[invocation] = "
								+ invocation + ", " + "[tAccess] = " + tAccess + ", " + "[tStaticType] = " + tStaticType
								+ ", " + "[mStaticType] = " + mStaticType + ", " + "[invocationToTAccess] = "
								+ invocationToTAccess + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					MethodInvocationStaticTypeImpl.pattern_MethodInvocationStaticType_29_6_perform_greenBBBBB(
							invocation, tAccess, tStaticType, mStaticType, ruleResult);

				} else {
				}

			} else {
			}

		}
		return MethodInvocationStaticTypeImpl.pattern_MethodInvocationStaticType_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch,
			TypeToTAbstractType mStaticTypeTotStaticType, MMethodInvocation invocation, TCall tAccess,
			TAbstractType tStaticType, Type mStaticType, AbstractMethodInvocationToTAccess invocationToTAccess,
			ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("mStaticTypeTotStaticType", mStaticTypeTotStaticType);
		isApplicableMatch.registerObject("invocation", invocation);
		isApplicableMatch.registerObject("tAccess", tAccess);
		isApplicableMatch.registerObject("tStaticType", tStaticType);
		isApplicableMatch.registerObject("mStaticType", mStaticType);
		isApplicableMatch.registerObject("invocationToTAccess", invocationToTAccess);
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
		case RulesPackage.METHOD_INVOCATION_STATIC_TYPE___IS_APPROPRIATE_FWD__MATCH_MMETHODINVOCATION_TYPE:
			return isAppropriate_FWD((Match) arguments.get(0), (MMethodInvocation) arguments.get(1),
					(Type) arguments.get(2));
		case RulesPackage.METHOD_INVOCATION_STATIC_TYPE___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.METHOD_INVOCATION_STATIC_TYPE___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.METHOD_INVOCATION_STATIC_TYPE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_MMETHODINVOCATION_TYPE:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (MMethodInvocation) arguments.get(1),
					(Type) arguments.get(2));
			return null;
		case RulesPackage.METHOD_INVOCATION_STATIC_TYPE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_MMETHODINVOCATION_TYPE:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (MMethodInvocation) arguments.get(1),
					(Type) arguments.get(2));
		case RulesPackage.METHOD_INVOCATION_STATIC_TYPE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.METHOD_INVOCATION_STATIC_TYPE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_TYPETOTABSTRACTTYPE_MMETHODINVOCATION_TCALL_TABSTRACTTYPE_TYPE_ABSTRACTMETHODINVOCATIONTOTACCESS:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0),
					(TypeToTAbstractType) arguments.get(1), (MMethodInvocation) arguments.get(2),
					(TCall) arguments.get(3), (TAbstractType) arguments.get(4), (Type) arguments.get(5),
					(AbstractMethodInvocationToTAccess) arguments.get(6));
		case RulesPackage.METHOD_INVOCATION_STATIC_TYPE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.METHOD_INVOCATION_STATIC_TYPE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6));
			return null;
		case RulesPackage.METHOD_INVOCATION_STATIC_TYPE___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.METHOD_INVOCATION_STATIC_TYPE___IS_APPROPRIATE_BWD__MATCH_TCALL_TABSTRACTTYPE:
			return isAppropriate_BWD((Match) arguments.get(0), (TCall) arguments.get(1),
					(TAbstractType) arguments.get(2));
		case RulesPackage.METHOD_INVOCATION_STATIC_TYPE___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.METHOD_INVOCATION_STATIC_TYPE___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.METHOD_INVOCATION_STATIC_TYPE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TCALL_TABSTRACTTYPE:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (TCall) arguments.get(1),
					(TAbstractType) arguments.get(2));
			return null;
		case RulesPackage.METHOD_INVOCATION_STATIC_TYPE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TCALL_TABSTRACTTYPE:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (TCall) arguments.get(1),
					(TAbstractType) arguments.get(2));
		case RulesPackage.METHOD_INVOCATION_STATIC_TYPE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.METHOD_INVOCATION_STATIC_TYPE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_TYPETOTABSTRACTTYPE_MMETHODINVOCATION_TCALL_TABSTRACTTYPE_TYPE_ABSTRACTMETHODINVOCATIONTOTACCESS:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
					(TypeToTAbstractType) arguments.get(1), (MMethodInvocation) arguments.get(2),
					(TCall) arguments.get(3), (TAbstractType) arguments.get(4), (Type) arguments.get(5),
					(AbstractMethodInvocationToTAccess) arguments.get(6));
		case RulesPackage.METHOD_INVOCATION_STATIC_TYPE___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.METHOD_INVOCATION_STATIC_TYPE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6));
			return null;
		case RulesPackage.METHOD_INVOCATION_STATIC_TYPE___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.METHOD_INVOCATION_STATIC_TYPE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_66__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_66((EMoflonEdge) arguments.get(0));
		case RulesPackage.METHOD_INVOCATION_STATIC_TYPE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_69__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_69((EMoflonEdge) arguments.get(0));
		case RulesPackage.METHOD_INVOCATION_STATIC_TYPE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.METHOD_INVOCATION_STATIC_TYPE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.METHOD_INVOCATION_STATIC_TYPE___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.METHOD_INVOCATION_STATIC_TYPE___IS_APPLICABLE_SOLVE_CSP_CC__MMETHODINVOCATION_TCALL_TABSTRACTTYPE_TYPE_MATCH_MATCH:
			return isApplicable_solveCsp_CC((MMethodInvocation) arguments.get(0), (TCall) arguments.get(1),
					(TAbstractType) arguments.get(2), (Type) arguments.get(3), (Match) arguments.get(4),
					(Match) arguments.get(5));
		case RulesPackage.METHOD_INVOCATION_STATIC_TYPE___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.METHOD_INVOCATION_STATIC_TYPE___CHECK_DEC_FWD__MMETHODINVOCATION_TYPE:
			return checkDEC_FWD((MMethodInvocation) arguments.get(0), (Type) arguments.get(1));
		case RulesPackage.METHOD_INVOCATION_STATIC_TYPE___CHECK_DEC_BWD__TCALL_TABSTRACTTYPE:
			return checkDEC_BWD((TCall) arguments.get(0), (TAbstractType) arguments.get(1));
		case RulesPackage.METHOD_INVOCATION_STATIC_TYPE___GENERATE_MODEL__RULEENTRYCONTAINER_TYPETOTABSTRACTTYPE_ABSTRACTMETHODINVOCATIONTOTACCESS:
			return generateModel((RuleEntryContainer) arguments.get(0), (TypeToTAbstractType) arguments.get(1),
					(AbstractMethodInvocationToTAccess) arguments.get(2));
		case RulesPackage.METHOD_INVOCATION_STATIC_TYPE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_TYPETOTABSTRACTTYPE_MMETHODINVOCATION_TCALL_TABSTRACTTYPE_TYPE_ABSTRACTMETHODINVOCATIONTOTACCESS_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
					(TypeToTAbstractType) arguments.get(1), (MMethodInvocation) arguments.get(2),
					(TCall) arguments.get(3), (TAbstractType) arguments.get(4), (Type) arguments.get(5),
					(AbstractMethodInvocationToTAccess) arguments.get(6), (ModelgeneratorRuleResult) arguments.get(7));
		case RulesPackage.METHOD_INVOCATION_STATIC_TYPE___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_MethodInvocationStaticType_0_1_initialbindings_blackBBBB(
			MethodInvocationStaticType _this, Match match, MMethodInvocation invocation, Type mStaticType) {
		return new Object[] { _this, match, invocation, mStaticType };
	}

	public static final Object[] pattern_MethodInvocationStaticType_0_2_SolveCSP_bindingFBBBB(
			MethodInvocationStaticType _this, Match match, MMethodInvocation invocation, Type mStaticType) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, invocation, mStaticType);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, invocation, mStaticType };
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationStaticType_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MethodInvocationStaticType_0_2_SolveCSP_bindingAndBlackFBBBB(
			MethodInvocationStaticType _this, Match match, MMethodInvocation invocation, Type mStaticType) {
		Object[] result_pattern_MethodInvocationStaticType_0_2_SolveCSP_binding = pattern_MethodInvocationStaticType_0_2_SolveCSP_bindingFBBBB(
				_this, match, invocation, mStaticType);
		if (result_pattern_MethodInvocationStaticType_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_MethodInvocationStaticType_0_2_SolveCSP_binding[0];

			Object[] result_pattern_MethodInvocationStaticType_0_2_SolveCSP_black = pattern_MethodInvocationStaticType_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_MethodInvocationStaticType_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, invocation, mStaticType };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodInvocationStaticType_0_3_CheckCSP_expressionFBB(
			MethodInvocationStaticType _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodInvocationStaticType_0_4_collectelementstobetranslated_blackBBB(
			Match match, MMethodInvocation invocation, Type mStaticType) {
		return new Object[] { match, invocation, mStaticType };
	}

	public static final Object[] pattern_MethodInvocationStaticType_0_4_collectelementstobetranslated_greenBBBF(
			Match match, MMethodInvocation invocation, Type mStaticType) {
		EMoflonEdge invocation__mStaticType____mStaticType = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String invocation__mStaticType____mStaticType_name_prime = "mStaticType";
		invocation__mStaticType____mStaticType.setSrc(invocation);
		invocation__mStaticType____mStaticType.setTrg(mStaticType);
		match.getToBeTranslatedEdges().add(invocation__mStaticType____mStaticType);
		invocation__mStaticType____mStaticType.setName(invocation__mStaticType____mStaticType_name_prime);
		return new Object[] { match, invocation, mStaticType, invocation__mStaticType____mStaticType };
	}

	public static final Object[] pattern_MethodInvocationStaticType_0_5_collectcontextelements_blackBBB(Match match,
			MMethodInvocation invocation, Type mStaticType) {
		return new Object[] { match, invocation, mStaticType };
	}

	public static final Object[] pattern_MethodInvocationStaticType_0_5_collectcontextelements_greenBBB(Match match,
			MMethodInvocation invocation, Type mStaticType) {
		match.getContextNodes().add(invocation);
		match.getContextNodes().add(mStaticType);
		return new Object[] { match, invocation, mStaticType };
	}

	public static final void pattern_MethodInvocationStaticType_0_6_registerobjectstomatch_expressionBBBB(
			MethodInvocationStaticType _this, Match match, MMethodInvocation invocation, Type mStaticType) {
		_this.registerObjectsToMatch_FWD(match, invocation, mStaticType);

	}

	public static final boolean pattern_MethodInvocationStaticType_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_MethodInvocationStaticType_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_MethodInvocationStaticType_1_1_performtransformation_bindingFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("mStaticTypeTotStaticType");
		EObject _localVariable_1 = isApplicableMatch.getObject("invocation");
		EObject _localVariable_2 = isApplicableMatch.getObject("tAccess");
		EObject _localVariable_3 = isApplicableMatch.getObject("tStaticType");
		EObject _localVariable_4 = isApplicableMatch.getObject("mStaticType");
		EObject _localVariable_5 = isApplicableMatch.getObject("invocationToTAccess");
		EObject tmpMStaticTypeTotStaticType = _localVariable_0;
		EObject tmpInvocation = _localVariable_1;
		EObject tmpTAccess = _localVariable_2;
		EObject tmpTStaticType = _localVariable_3;
		EObject tmpMStaticType = _localVariable_4;
		EObject tmpInvocationToTAccess = _localVariable_5;
		if (tmpMStaticTypeTotStaticType instanceof TypeToTAbstractType) {
			TypeToTAbstractType mStaticTypeTotStaticType = (TypeToTAbstractType) tmpMStaticTypeTotStaticType;
			if (tmpInvocation instanceof MMethodInvocation) {
				MMethodInvocation invocation = (MMethodInvocation) tmpInvocation;
				if (tmpTAccess instanceof TCall) {
					TCall tAccess = (TCall) tmpTAccess;
					if (tmpTStaticType instanceof TAbstractType) {
						TAbstractType tStaticType = (TAbstractType) tmpTStaticType;
						if (tmpMStaticType instanceof Type) {
							Type mStaticType = (Type) tmpMStaticType;
							if (tmpInvocationToTAccess instanceof AbstractMethodInvocationToTAccess) {
								AbstractMethodInvocationToTAccess invocationToTAccess = (AbstractMethodInvocationToTAccess) tmpInvocationToTAccess;
								return new Object[] { mStaticTypeTotStaticType, invocation, tAccess, tStaticType,
										mStaticType, invocationToTAccess, isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationStaticType_1_1_performtransformation_blackBBBBBBFBB(
			TypeToTAbstractType mStaticTypeTotStaticType, MMethodInvocation invocation, TCall tAccess,
			TAbstractType tStaticType, Type mStaticType, AbstractMethodInvocationToTAccess invocationToTAccess,
			MethodInvocationStaticType _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { mStaticTypeTotStaticType, invocation, tAccess, tStaticType, mStaticType,
						invocationToTAccess, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationStaticType_1_1_performtransformation_bindingAndBlackFFFFFFFBB(
			MethodInvocationStaticType _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_MethodInvocationStaticType_1_1_performtransformation_binding = pattern_MethodInvocationStaticType_1_1_performtransformation_bindingFFFFFFB(
				isApplicableMatch);
		if (result_pattern_MethodInvocationStaticType_1_1_performtransformation_binding != null) {
			TypeToTAbstractType mStaticTypeTotStaticType = (TypeToTAbstractType) result_pattern_MethodInvocationStaticType_1_1_performtransformation_binding[0];
			MMethodInvocation invocation = (MMethodInvocation) result_pattern_MethodInvocationStaticType_1_1_performtransformation_binding[1];
			TCall tAccess = (TCall) result_pattern_MethodInvocationStaticType_1_1_performtransformation_binding[2];
			TAbstractType tStaticType = (TAbstractType) result_pattern_MethodInvocationStaticType_1_1_performtransformation_binding[3];
			Type mStaticType = (Type) result_pattern_MethodInvocationStaticType_1_1_performtransformation_binding[4];
			AbstractMethodInvocationToTAccess invocationToTAccess = (AbstractMethodInvocationToTAccess) result_pattern_MethodInvocationStaticType_1_1_performtransformation_binding[5];

			Object[] result_pattern_MethodInvocationStaticType_1_1_performtransformation_black = pattern_MethodInvocationStaticType_1_1_performtransformation_blackBBBBBBFBB(
					mStaticTypeTotStaticType, invocation, tAccess, tStaticType, mStaticType, invocationToTAccess, _this,
					isApplicableMatch);
			if (result_pattern_MethodInvocationStaticType_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_MethodInvocationStaticType_1_1_performtransformation_black[6];

				return new Object[] { mStaticTypeTotStaticType, invocation, tAccess, tStaticType, mStaticType,
						invocationToTAccess, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationStaticType_1_1_performtransformation_greenBB(TCall tAccess,
			TAbstractType tStaticType) {
		tAccess.setStaticType(tStaticType);
		return new Object[] { tAccess, tStaticType };
	}

	public static final Object[] pattern_MethodInvocationStaticType_1_2_collecttranslatedelements_greenF() {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		return new Object[] { ruleresult };
	}

	public static final Object[] pattern_MethodInvocationStaticType_1_3_bookkeepingforedges_blackBBBBBBB(
			PerformRuleResult ruleresult, EObject mStaticTypeTotStaticType, EObject invocation, EObject tAccess,
			EObject tStaticType, EObject mStaticType, EObject invocationToTAccess) {
		if (!mStaticTypeTotStaticType.equals(tAccess)) {
			if (!mStaticTypeTotStaticType.equals(tStaticType)) {
				if (!invocation.equals(mStaticTypeTotStaticType)) {
					if (!invocation.equals(tAccess)) {
						if (!invocation.equals(tStaticType)) {
							if (!invocation.equals(mStaticType)) {
								if (!invocation.equals(invocationToTAccess)) {
									if (!tAccess.equals(tStaticType)) {
										if (!mStaticType.equals(mStaticTypeTotStaticType)) {
											if (!mStaticType.equals(tAccess)) {
												if (!mStaticType.equals(tStaticType)) {
													if (!invocationToTAccess.equals(mStaticTypeTotStaticType)) {
														if (!invocationToTAccess.equals(tAccess)) {
															if (!invocationToTAccess.equals(tStaticType)) {
																if (!invocationToTAccess.equals(mStaticType)) {
																	return new Object[] { ruleresult,
																			mStaticTypeTotStaticType, invocation,
																			tAccess, tStaticType, mStaticType,
																			invocationToTAccess };
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_MethodInvocationStaticType_1_3_bookkeepingforedges_greenBBBBBFF(
			PerformRuleResult ruleresult, EObject invocation, EObject tAccess, EObject tStaticType,
			EObject mStaticType) {
		EMoflonEdge tAccess__tStaticType____staticType = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge invocation__mStaticType____mStaticType = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "MethodInvocationStaticType";
		String tAccess__tStaticType____staticType_name_prime = "staticType";
		String invocation__mStaticType____mStaticType_name_prime = "mStaticType";
		tAccess__tStaticType____staticType.setSrc(tAccess);
		tAccess__tStaticType____staticType.setTrg(tStaticType);
		ruleresult.getCreatedEdges().add(tAccess__tStaticType____staticType);
		invocation__mStaticType____mStaticType.setSrc(invocation);
		invocation__mStaticType____mStaticType.setTrg(mStaticType);
		ruleresult.getTranslatedEdges().add(invocation__mStaticType____mStaticType);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		tAccess__tStaticType____staticType.setName(tAccess__tStaticType____staticType_name_prime);
		invocation__mStaticType____mStaticType.setName(invocation__mStaticType____mStaticType_name_prime);
		return new Object[] { ruleresult, invocation, tAccess, tStaticType, mStaticType,
				tAccess__tStaticType____staticType, invocation__mStaticType____mStaticType };
	}

	public static final void pattern_MethodInvocationStaticType_1_5_registerobjects_expressionBBBBBBBB(
			MethodInvocationStaticType _this, PerformRuleResult ruleresult, EObject mStaticTypeTotStaticType,
			EObject invocation, EObject tAccess, EObject tStaticType, EObject mStaticType,
			EObject invocationToTAccess) {
		_this.registerObjects_FWD(ruleresult, mStaticTypeTotStaticType, invocation, tAccess, tStaticType, mStaticType,
				invocationToTAccess);

	}

	public static final PerformRuleResult pattern_MethodInvocationStaticType_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_MethodInvocationStaticType_2_1_preparereturnvalue_bindingFB(
			MethodInvocationStaticType _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationStaticType_2_1_preparereturnvalue_blackFBB(EClass eClass,
			MethodInvocationStaticType _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationStaticType_2_1_preparereturnvalue_bindingAndBlackFFB(
			MethodInvocationStaticType _this) {
		Object[] result_pattern_MethodInvocationStaticType_2_1_preparereturnvalue_binding = pattern_MethodInvocationStaticType_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_MethodInvocationStaticType_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_MethodInvocationStaticType_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_MethodInvocationStaticType_2_1_preparereturnvalue_black = pattern_MethodInvocationStaticType_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_MethodInvocationStaticType_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_MethodInvocationStaticType_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationStaticType_2_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "MethodInvocationStaticType";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_MethodInvocationStaticType_2_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("invocation");
		EObject _localVariable_1 = match.getObject("mStaticType");
		EObject tmpInvocation = _localVariable_0;
		EObject tmpMStaticType = _localVariable_1;
		if (tmpInvocation instanceof MMethodInvocation) {
			MMethodInvocation invocation = (MMethodInvocation) tmpInvocation;
			if (tmpMStaticType instanceof Type) {
				Type mStaticType = (Type) tmpMStaticType;
				return new Object[] { invocation, mStaticType, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_MethodInvocationStaticType_2_2_corematch_blackFBFFBFB(
			MMethodInvocation invocation, Type mStaticType, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (TypeToTAbstractType mStaticTypeTotStaticType : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mStaticType, TypeToTAbstractType.class, "source")) {
			TAbstractType tStaticType = mStaticTypeTotStaticType.getTarget();
			if (tStaticType != null) {
				for (AbstractMethodInvocationToTAccess invocationToTAccess : org.moflon.core.utilities.eMoflonEMFUtil
						.getOppositeReferenceTyped(invocation, AbstractMethodInvocationToTAccess.class, "source")) {
					TAccess tmpTAccess = invocationToTAccess.getTarget();
					if (tmpTAccess instanceof TCall) {
						TCall tAccess = (TCall) tmpTAccess;
						_result.add(new Object[] { mStaticTypeTotStaticType, invocation, tAccess, tStaticType,
								mStaticType, invocationToTAccess, match });
					}

				}
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_MethodInvocationStaticType_2_3_findcontext_blackBBBBBB(
			TypeToTAbstractType mStaticTypeTotStaticType, MMethodInvocation invocation, TCall tAccess,
			TAbstractType tStaticType, Type mStaticType, AbstractMethodInvocationToTAccess invocationToTAccess) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (tStaticType.equals(mStaticTypeTotStaticType.getTarget())) {
			if (mStaticType.equals(invocation.getMStaticType())) {
				if (mStaticType.equals(mStaticTypeTotStaticType.getSource())) {
					if (invocation.equals(invocationToTAccess.getSource())) {
						if (tAccess.equals(invocationToTAccess.getTarget())) {
							_result.add(new Object[] { mStaticTypeTotStaticType, invocation, tAccess, tStaticType,
									mStaticType, invocationToTAccess });
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_MethodInvocationStaticType_2_3_findcontext_greenBBBBBBFFFFFF(
			TypeToTAbstractType mStaticTypeTotStaticType, MMethodInvocation invocation, TCall tAccess,
			TAbstractType tStaticType, Type mStaticType, AbstractMethodInvocationToTAccess invocationToTAccess) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge mStaticTypeTotStaticType__tStaticType____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge invocation__mStaticType____mStaticType = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mStaticTypeTotStaticType__mStaticType____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge invocationToTAccess__invocation____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge invocationToTAccess__tAccess____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String mStaticTypeTotStaticType__tStaticType____target_name_prime = "target";
		String invocation__mStaticType____mStaticType_name_prime = "mStaticType";
		String mStaticTypeTotStaticType__mStaticType____source_name_prime = "source";
		String invocationToTAccess__invocation____source_name_prime = "source";
		String invocationToTAccess__tAccess____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(mStaticTypeTotStaticType);
		isApplicableMatch.getAllContextElements().add(invocation);
		isApplicableMatch.getAllContextElements().add(tAccess);
		isApplicableMatch.getAllContextElements().add(tStaticType);
		isApplicableMatch.getAllContextElements().add(mStaticType);
		isApplicableMatch.getAllContextElements().add(invocationToTAccess);
		mStaticTypeTotStaticType__tStaticType____target.setSrc(mStaticTypeTotStaticType);
		mStaticTypeTotStaticType__tStaticType____target.setTrg(tStaticType);
		isApplicableMatch.getAllContextElements().add(mStaticTypeTotStaticType__tStaticType____target);
		invocation__mStaticType____mStaticType.setSrc(invocation);
		invocation__mStaticType____mStaticType.setTrg(mStaticType);
		isApplicableMatch.getAllContextElements().add(invocation__mStaticType____mStaticType);
		mStaticTypeTotStaticType__mStaticType____source.setSrc(mStaticTypeTotStaticType);
		mStaticTypeTotStaticType__mStaticType____source.setTrg(mStaticType);
		isApplicableMatch.getAllContextElements().add(mStaticTypeTotStaticType__mStaticType____source);
		invocationToTAccess__invocation____source.setSrc(invocationToTAccess);
		invocationToTAccess__invocation____source.setTrg(invocation);
		isApplicableMatch.getAllContextElements().add(invocationToTAccess__invocation____source);
		invocationToTAccess__tAccess____target.setSrc(invocationToTAccess);
		invocationToTAccess__tAccess____target.setTrg(tAccess);
		isApplicableMatch.getAllContextElements().add(invocationToTAccess__tAccess____target);
		mStaticTypeTotStaticType__tStaticType____target
				.setName(mStaticTypeTotStaticType__tStaticType____target_name_prime);
		invocation__mStaticType____mStaticType.setName(invocation__mStaticType____mStaticType_name_prime);
		mStaticTypeTotStaticType__mStaticType____source
				.setName(mStaticTypeTotStaticType__mStaticType____source_name_prime);
		invocationToTAccess__invocation____source.setName(invocationToTAccess__invocation____source_name_prime);
		invocationToTAccess__tAccess____target.setName(invocationToTAccess__tAccess____target_name_prime);
		return new Object[] { mStaticTypeTotStaticType, invocation, tAccess, tStaticType, mStaticType,
				invocationToTAccess, isApplicableMatch, mStaticTypeTotStaticType__tStaticType____target,
				invocation__mStaticType____mStaticType, mStaticTypeTotStaticType__mStaticType____source,
				invocationToTAccess__invocation____source, invocationToTAccess__tAccess____target };
	}

	public static final Object[] pattern_MethodInvocationStaticType_2_4_solveCSP_bindingFBBBBBBBB(
			MethodInvocationStaticType _this, IsApplicableMatch isApplicableMatch,
			TypeToTAbstractType mStaticTypeTotStaticType, MMethodInvocation invocation, TCall tAccess,
			TAbstractType tStaticType, Type mStaticType, AbstractMethodInvocationToTAccess invocationToTAccess) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, mStaticTypeTotStaticType, invocation,
				tAccess, tStaticType, mStaticType, invocationToTAccess);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mStaticTypeTotStaticType, invocation, tAccess,
					tStaticType, mStaticType, invocationToTAccess };
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationStaticType_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MethodInvocationStaticType_2_4_solveCSP_bindingAndBlackFBBBBBBBB(
			MethodInvocationStaticType _this, IsApplicableMatch isApplicableMatch,
			TypeToTAbstractType mStaticTypeTotStaticType, MMethodInvocation invocation, TCall tAccess,
			TAbstractType tStaticType, Type mStaticType, AbstractMethodInvocationToTAccess invocationToTAccess) {
		Object[] result_pattern_MethodInvocationStaticType_2_4_solveCSP_binding = pattern_MethodInvocationStaticType_2_4_solveCSP_bindingFBBBBBBBB(
				_this, isApplicableMatch, mStaticTypeTotStaticType, invocation, tAccess, tStaticType, mStaticType,
				invocationToTAccess);
		if (result_pattern_MethodInvocationStaticType_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_MethodInvocationStaticType_2_4_solveCSP_binding[0];

			Object[] result_pattern_MethodInvocationStaticType_2_4_solveCSP_black = pattern_MethodInvocationStaticType_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_MethodInvocationStaticType_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mStaticTypeTotStaticType, invocation, tAccess,
						tStaticType, mStaticType, invocationToTAccess };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodInvocationStaticType_2_5_checkCSP_expressionFBB(
			MethodInvocationStaticType _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodInvocationStaticType_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_MethodInvocationStaticType_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "MethodInvocationStaticType";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_MethodInvocationStaticType_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_MethodInvocationStaticType_10_1_initialbindings_blackBBBB(
			MethodInvocationStaticType _this, Match match, TCall tAccess, TAbstractType tStaticType) {
		return new Object[] { _this, match, tAccess, tStaticType };
	}

	public static final Object[] pattern_MethodInvocationStaticType_10_2_SolveCSP_bindingFBBBB(
			MethodInvocationStaticType _this, Match match, TCall tAccess, TAbstractType tStaticType) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, tAccess, tStaticType);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, tAccess, tStaticType };
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationStaticType_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MethodInvocationStaticType_10_2_SolveCSP_bindingAndBlackFBBBB(
			MethodInvocationStaticType _this, Match match, TCall tAccess, TAbstractType tStaticType) {
		Object[] result_pattern_MethodInvocationStaticType_10_2_SolveCSP_binding = pattern_MethodInvocationStaticType_10_2_SolveCSP_bindingFBBBB(
				_this, match, tAccess, tStaticType);
		if (result_pattern_MethodInvocationStaticType_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_MethodInvocationStaticType_10_2_SolveCSP_binding[0];

			Object[] result_pattern_MethodInvocationStaticType_10_2_SolveCSP_black = pattern_MethodInvocationStaticType_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_MethodInvocationStaticType_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, tAccess, tStaticType };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodInvocationStaticType_10_3_CheckCSP_expressionFBB(
			MethodInvocationStaticType _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodInvocationStaticType_10_4_collectelementstobetranslated_blackBBB(
			Match match, TCall tAccess, TAbstractType tStaticType) {
		return new Object[] { match, tAccess, tStaticType };
	}

	public static final Object[] pattern_MethodInvocationStaticType_10_4_collectelementstobetranslated_greenBBBF(
			Match match, TCall tAccess, TAbstractType tStaticType) {
		EMoflonEdge tAccess__tStaticType____staticType = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String tAccess__tStaticType____staticType_name_prime = "staticType";
		tAccess__tStaticType____staticType.setSrc(tAccess);
		tAccess__tStaticType____staticType.setTrg(tStaticType);
		match.getToBeTranslatedEdges().add(tAccess__tStaticType____staticType);
		tAccess__tStaticType____staticType.setName(tAccess__tStaticType____staticType_name_prime);
		return new Object[] { match, tAccess, tStaticType, tAccess__tStaticType____staticType };
	}

	public static final Object[] pattern_MethodInvocationStaticType_10_5_collectcontextelements_blackBBB(Match match,
			TCall tAccess, TAbstractType tStaticType) {
		return new Object[] { match, tAccess, tStaticType };
	}

	public static final Object[] pattern_MethodInvocationStaticType_10_5_collectcontextelements_greenBBB(Match match,
			TCall tAccess, TAbstractType tStaticType) {
		match.getContextNodes().add(tAccess);
		match.getContextNodes().add(tStaticType);
		return new Object[] { match, tAccess, tStaticType };
	}

	public static final void pattern_MethodInvocationStaticType_10_6_registerobjectstomatch_expressionBBBB(
			MethodInvocationStaticType _this, Match match, TCall tAccess, TAbstractType tStaticType) {
		_this.registerObjectsToMatch_BWD(match, tAccess, tStaticType);

	}

	public static final boolean pattern_MethodInvocationStaticType_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_MethodInvocationStaticType_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_MethodInvocationStaticType_11_1_performtransformation_bindingFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("mStaticTypeTotStaticType");
		EObject _localVariable_1 = isApplicableMatch.getObject("invocation");
		EObject _localVariable_2 = isApplicableMatch.getObject("tAccess");
		EObject _localVariable_3 = isApplicableMatch.getObject("tStaticType");
		EObject _localVariable_4 = isApplicableMatch.getObject("mStaticType");
		EObject _localVariable_5 = isApplicableMatch.getObject("invocationToTAccess");
		EObject tmpMStaticTypeTotStaticType = _localVariable_0;
		EObject tmpInvocation = _localVariable_1;
		EObject tmpTAccess = _localVariable_2;
		EObject tmpTStaticType = _localVariable_3;
		EObject tmpMStaticType = _localVariable_4;
		EObject tmpInvocationToTAccess = _localVariable_5;
		if (tmpMStaticTypeTotStaticType instanceof TypeToTAbstractType) {
			TypeToTAbstractType mStaticTypeTotStaticType = (TypeToTAbstractType) tmpMStaticTypeTotStaticType;
			if (tmpInvocation instanceof MMethodInvocation) {
				MMethodInvocation invocation = (MMethodInvocation) tmpInvocation;
				if (tmpTAccess instanceof TCall) {
					TCall tAccess = (TCall) tmpTAccess;
					if (tmpTStaticType instanceof TAbstractType) {
						TAbstractType tStaticType = (TAbstractType) tmpTStaticType;
						if (tmpMStaticType instanceof Type) {
							Type mStaticType = (Type) tmpMStaticType;
							if (tmpInvocationToTAccess instanceof AbstractMethodInvocationToTAccess) {
								AbstractMethodInvocationToTAccess invocationToTAccess = (AbstractMethodInvocationToTAccess) tmpInvocationToTAccess;
								return new Object[] { mStaticTypeTotStaticType, invocation, tAccess, tStaticType,
										mStaticType, invocationToTAccess, isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationStaticType_11_1_performtransformation_blackBBBBBBFBB(
			TypeToTAbstractType mStaticTypeTotStaticType, MMethodInvocation invocation, TCall tAccess,
			TAbstractType tStaticType, Type mStaticType, AbstractMethodInvocationToTAccess invocationToTAccess,
			MethodInvocationStaticType _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { mStaticTypeTotStaticType, invocation, tAccess, tStaticType, mStaticType,
						invocationToTAccess, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationStaticType_11_1_performtransformation_bindingAndBlackFFFFFFFBB(
			MethodInvocationStaticType _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_MethodInvocationStaticType_11_1_performtransformation_binding = pattern_MethodInvocationStaticType_11_1_performtransformation_bindingFFFFFFB(
				isApplicableMatch);
		if (result_pattern_MethodInvocationStaticType_11_1_performtransformation_binding != null) {
			TypeToTAbstractType mStaticTypeTotStaticType = (TypeToTAbstractType) result_pattern_MethodInvocationStaticType_11_1_performtransformation_binding[0];
			MMethodInvocation invocation = (MMethodInvocation) result_pattern_MethodInvocationStaticType_11_1_performtransformation_binding[1];
			TCall tAccess = (TCall) result_pattern_MethodInvocationStaticType_11_1_performtransformation_binding[2];
			TAbstractType tStaticType = (TAbstractType) result_pattern_MethodInvocationStaticType_11_1_performtransformation_binding[3];
			Type mStaticType = (Type) result_pattern_MethodInvocationStaticType_11_1_performtransformation_binding[4];
			AbstractMethodInvocationToTAccess invocationToTAccess = (AbstractMethodInvocationToTAccess) result_pattern_MethodInvocationStaticType_11_1_performtransformation_binding[5];

			Object[] result_pattern_MethodInvocationStaticType_11_1_performtransformation_black = pattern_MethodInvocationStaticType_11_1_performtransformation_blackBBBBBBFBB(
					mStaticTypeTotStaticType, invocation, tAccess, tStaticType, mStaticType, invocationToTAccess, _this,
					isApplicableMatch);
			if (result_pattern_MethodInvocationStaticType_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_MethodInvocationStaticType_11_1_performtransformation_black[6];

				return new Object[] { mStaticTypeTotStaticType, invocation, tAccess, tStaticType, mStaticType,
						invocationToTAccess, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationStaticType_11_1_performtransformation_greenBB(
			MMethodInvocation invocation, Type mStaticType) {
		invocation.setMStaticType(mStaticType);
		return new Object[] { invocation, mStaticType };
	}

	public static final Object[] pattern_MethodInvocationStaticType_11_2_collecttranslatedelements_greenF() {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		return new Object[] { ruleresult };
	}

	public static final Object[] pattern_MethodInvocationStaticType_11_3_bookkeepingforedges_blackBBBBBBB(
			PerformRuleResult ruleresult, EObject mStaticTypeTotStaticType, EObject invocation, EObject tAccess,
			EObject tStaticType, EObject mStaticType, EObject invocationToTAccess) {
		if (!mStaticTypeTotStaticType.equals(tAccess)) {
			if (!mStaticTypeTotStaticType.equals(tStaticType)) {
				if (!invocation.equals(mStaticTypeTotStaticType)) {
					if (!invocation.equals(tAccess)) {
						if (!invocation.equals(tStaticType)) {
							if (!invocation.equals(mStaticType)) {
								if (!invocation.equals(invocationToTAccess)) {
									if (!tAccess.equals(tStaticType)) {
										if (!mStaticType.equals(mStaticTypeTotStaticType)) {
											if (!mStaticType.equals(tAccess)) {
												if (!mStaticType.equals(tStaticType)) {
													if (!invocationToTAccess.equals(mStaticTypeTotStaticType)) {
														if (!invocationToTAccess.equals(tAccess)) {
															if (!invocationToTAccess.equals(tStaticType)) {
																if (!invocationToTAccess.equals(mStaticType)) {
																	return new Object[] { ruleresult,
																			mStaticTypeTotStaticType, invocation,
																			tAccess, tStaticType, mStaticType,
																			invocationToTAccess };
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_MethodInvocationStaticType_11_3_bookkeepingforedges_greenBBBBBFF(
			PerformRuleResult ruleresult, EObject invocation, EObject tAccess, EObject tStaticType,
			EObject mStaticType) {
		EMoflonEdge tAccess__tStaticType____staticType = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge invocation__mStaticType____mStaticType = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "MethodInvocationStaticType";
		String tAccess__tStaticType____staticType_name_prime = "staticType";
		String invocation__mStaticType____mStaticType_name_prime = "mStaticType";
		tAccess__tStaticType____staticType.setSrc(tAccess);
		tAccess__tStaticType____staticType.setTrg(tStaticType);
		ruleresult.getTranslatedEdges().add(tAccess__tStaticType____staticType);
		invocation__mStaticType____mStaticType.setSrc(invocation);
		invocation__mStaticType____mStaticType.setTrg(mStaticType);
		ruleresult.getCreatedEdges().add(invocation__mStaticType____mStaticType);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		tAccess__tStaticType____staticType.setName(tAccess__tStaticType____staticType_name_prime);
		invocation__mStaticType____mStaticType.setName(invocation__mStaticType____mStaticType_name_prime);
		return new Object[] { ruleresult, invocation, tAccess, tStaticType, mStaticType,
				tAccess__tStaticType____staticType, invocation__mStaticType____mStaticType };
	}

	public static final void pattern_MethodInvocationStaticType_11_5_registerobjects_expressionBBBBBBBB(
			MethodInvocationStaticType _this, PerformRuleResult ruleresult, EObject mStaticTypeTotStaticType,
			EObject invocation, EObject tAccess, EObject tStaticType, EObject mStaticType,
			EObject invocationToTAccess) {
		_this.registerObjects_BWD(ruleresult, mStaticTypeTotStaticType, invocation, tAccess, tStaticType, mStaticType,
				invocationToTAccess);

	}

	public static final PerformRuleResult pattern_MethodInvocationStaticType_11_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_MethodInvocationStaticType_12_1_preparereturnvalue_bindingFB(
			MethodInvocationStaticType _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationStaticType_12_1_preparereturnvalue_blackFBB(EClass eClass,
			MethodInvocationStaticType _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationStaticType_12_1_preparereturnvalue_bindingAndBlackFFB(
			MethodInvocationStaticType _this) {
		Object[] result_pattern_MethodInvocationStaticType_12_1_preparereturnvalue_binding = pattern_MethodInvocationStaticType_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_MethodInvocationStaticType_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_MethodInvocationStaticType_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_MethodInvocationStaticType_12_1_preparereturnvalue_black = pattern_MethodInvocationStaticType_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_MethodInvocationStaticType_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_MethodInvocationStaticType_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationStaticType_12_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "MethodInvocationStaticType";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_MethodInvocationStaticType_12_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("tAccess");
		EObject _localVariable_1 = match.getObject("tStaticType");
		EObject tmpTAccess = _localVariable_0;
		EObject tmpTStaticType = _localVariable_1;
		if (tmpTAccess instanceof TCall) {
			TCall tAccess = (TCall) tmpTAccess;
			if (tmpTStaticType instanceof TAbstractType) {
				TAbstractType tStaticType = (TAbstractType) tmpTStaticType;
				return new Object[] { tAccess, tStaticType, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_MethodInvocationStaticType_12_2_corematch_blackFFBBFFB(TCall tAccess,
			TAbstractType tStaticType, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (TypeToTAbstractType mStaticTypeTotStaticType : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tStaticType, TypeToTAbstractType.class, "target")) {
			Type mStaticType = mStaticTypeTotStaticType.getSource();
			if (mStaticType != null) {
				for (AbstractMethodInvocationToTAccess invocationToTAccess : org.moflon.core.utilities.eMoflonEMFUtil
						.getOppositeReferenceTyped(tAccess, AbstractMethodInvocationToTAccess.class, "target")) {
					AbstractMethodInvocation tmpInvocation = invocationToTAccess.getSource();
					if (tmpInvocation instanceof MMethodInvocation) {
						MMethodInvocation invocation = (MMethodInvocation) tmpInvocation;
						_result.add(new Object[] { mStaticTypeTotStaticType, invocation, tAccess, tStaticType,
								mStaticType, invocationToTAccess, match });
					}

				}
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_MethodInvocationStaticType_12_3_findcontext_blackBBBBBB(
			TypeToTAbstractType mStaticTypeTotStaticType, MMethodInvocation invocation, TCall tAccess,
			TAbstractType tStaticType, Type mStaticType, AbstractMethodInvocationToTAccess invocationToTAccess) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (tStaticType.equals(tAccess.getStaticType())) {
			if (tStaticType.equals(mStaticTypeTotStaticType.getTarget())) {
				if (mStaticType.equals(mStaticTypeTotStaticType.getSource())) {
					if (invocation.equals(invocationToTAccess.getSource())) {
						if (tAccess.equals(invocationToTAccess.getTarget())) {
							_result.add(new Object[] { mStaticTypeTotStaticType, invocation, tAccess, tStaticType,
									mStaticType, invocationToTAccess });
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_MethodInvocationStaticType_12_3_findcontext_greenBBBBBBFFFFFF(
			TypeToTAbstractType mStaticTypeTotStaticType, MMethodInvocation invocation, TCall tAccess,
			TAbstractType tStaticType, Type mStaticType, AbstractMethodInvocationToTAccess invocationToTAccess) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge tAccess__tStaticType____staticType = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mStaticTypeTotStaticType__tStaticType____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mStaticTypeTotStaticType__mStaticType____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge invocationToTAccess__invocation____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge invocationToTAccess__tAccess____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String tAccess__tStaticType____staticType_name_prime = "staticType";
		String mStaticTypeTotStaticType__tStaticType____target_name_prime = "target";
		String mStaticTypeTotStaticType__mStaticType____source_name_prime = "source";
		String invocationToTAccess__invocation____source_name_prime = "source";
		String invocationToTAccess__tAccess____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(mStaticTypeTotStaticType);
		isApplicableMatch.getAllContextElements().add(invocation);
		isApplicableMatch.getAllContextElements().add(tAccess);
		isApplicableMatch.getAllContextElements().add(tStaticType);
		isApplicableMatch.getAllContextElements().add(mStaticType);
		isApplicableMatch.getAllContextElements().add(invocationToTAccess);
		tAccess__tStaticType____staticType.setSrc(tAccess);
		tAccess__tStaticType____staticType.setTrg(tStaticType);
		isApplicableMatch.getAllContextElements().add(tAccess__tStaticType____staticType);
		mStaticTypeTotStaticType__tStaticType____target.setSrc(mStaticTypeTotStaticType);
		mStaticTypeTotStaticType__tStaticType____target.setTrg(tStaticType);
		isApplicableMatch.getAllContextElements().add(mStaticTypeTotStaticType__tStaticType____target);
		mStaticTypeTotStaticType__mStaticType____source.setSrc(mStaticTypeTotStaticType);
		mStaticTypeTotStaticType__mStaticType____source.setTrg(mStaticType);
		isApplicableMatch.getAllContextElements().add(mStaticTypeTotStaticType__mStaticType____source);
		invocationToTAccess__invocation____source.setSrc(invocationToTAccess);
		invocationToTAccess__invocation____source.setTrg(invocation);
		isApplicableMatch.getAllContextElements().add(invocationToTAccess__invocation____source);
		invocationToTAccess__tAccess____target.setSrc(invocationToTAccess);
		invocationToTAccess__tAccess____target.setTrg(tAccess);
		isApplicableMatch.getAllContextElements().add(invocationToTAccess__tAccess____target);
		tAccess__tStaticType____staticType.setName(tAccess__tStaticType____staticType_name_prime);
		mStaticTypeTotStaticType__tStaticType____target
				.setName(mStaticTypeTotStaticType__tStaticType____target_name_prime);
		mStaticTypeTotStaticType__mStaticType____source
				.setName(mStaticTypeTotStaticType__mStaticType____source_name_prime);
		invocationToTAccess__invocation____source.setName(invocationToTAccess__invocation____source_name_prime);
		invocationToTAccess__tAccess____target.setName(invocationToTAccess__tAccess____target_name_prime);
		return new Object[] { mStaticTypeTotStaticType, invocation, tAccess, tStaticType, mStaticType,
				invocationToTAccess, isApplicableMatch, tAccess__tStaticType____staticType,
				mStaticTypeTotStaticType__tStaticType____target, mStaticTypeTotStaticType__mStaticType____source,
				invocationToTAccess__invocation____source, invocationToTAccess__tAccess____target };
	}

	public static final Object[] pattern_MethodInvocationStaticType_12_4_solveCSP_bindingFBBBBBBBB(
			MethodInvocationStaticType _this, IsApplicableMatch isApplicableMatch,
			TypeToTAbstractType mStaticTypeTotStaticType, MMethodInvocation invocation, TCall tAccess,
			TAbstractType tStaticType, Type mStaticType, AbstractMethodInvocationToTAccess invocationToTAccess) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, mStaticTypeTotStaticType, invocation,
				tAccess, tStaticType, mStaticType, invocationToTAccess);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mStaticTypeTotStaticType, invocation, tAccess,
					tStaticType, mStaticType, invocationToTAccess };
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationStaticType_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MethodInvocationStaticType_12_4_solveCSP_bindingAndBlackFBBBBBBBB(
			MethodInvocationStaticType _this, IsApplicableMatch isApplicableMatch,
			TypeToTAbstractType mStaticTypeTotStaticType, MMethodInvocation invocation, TCall tAccess,
			TAbstractType tStaticType, Type mStaticType, AbstractMethodInvocationToTAccess invocationToTAccess) {
		Object[] result_pattern_MethodInvocationStaticType_12_4_solveCSP_binding = pattern_MethodInvocationStaticType_12_4_solveCSP_bindingFBBBBBBBB(
				_this, isApplicableMatch, mStaticTypeTotStaticType, invocation, tAccess, tStaticType, mStaticType,
				invocationToTAccess);
		if (result_pattern_MethodInvocationStaticType_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_MethodInvocationStaticType_12_4_solveCSP_binding[0];

			Object[] result_pattern_MethodInvocationStaticType_12_4_solveCSP_black = pattern_MethodInvocationStaticType_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_MethodInvocationStaticType_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mStaticTypeTotStaticType, invocation, tAccess,
						tStaticType, mStaticType, invocationToTAccess };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodInvocationStaticType_12_5_checkCSP_expressionFBB(
			MethodInvocationStaticType _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodInvocationStaticType_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_MethodInvocationStaticType_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "MethodInvocationStaticType";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_MethodInvocationStaticType_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_MethodInvocationStaticType_20_1_preparereturnvalue_bindingFB(
			MethodInvocationStaticType _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationStaticType_20_1_preparereturnvalue_blackFBBF(EClass __eClass,
			MethodInvocationStaticType _this) {
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

	public static final Object[] pattern_MethodInvocationStaticType_20_1_preparereturnvalue_bindingAndBlackFFBF(
			MethodInvocationStaticType _this) {
		Object[] result_pattern_MethodInvocationStaticType_20_1_preparereturnvalue_binding = pattern_MethodInvocationStaticType_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_MethodInvocationStaticType_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_MethodInvocationStaticType_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_MethodInvocationStaticType_20_1_preparereturnvalue_black = pattern_MethodInvocationStaticType_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_MethodInvocationStaticType_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_MethodInvocationStaticType_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_MethodInvocationStaticType_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationStaticType_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_MethodInvocationStaticType_20_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_staticType) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpTAccess = _edge_staticType.getSrc();
		if (tmpTAccess instanceof TCall) {
			TCall tAccess = (TCall) tmpTAccess;
			EObject tmpTStaticType = _edge_staticType.getTrg();
			if (tmpTStaticType instanceof TAbstractType) {
				TAbstractType tStaticType = (TAbstractType) tmpTStaticType;
				if (tStaticType.equals(tAccess.getStaticType())) {
					_result.add(new Object[] { tAccess, tStaticType, _edge_staticType });
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_MethodInvocationStaticType_20_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_MethodInvocationStaticType_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			MethodInvocationStaticType _this, Match match, TCall tAccess, TAbstractType tStaticType) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, tAccess, tStaticType);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_MethodInvocationStaticType_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			MethodInvocationStaticType _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodInvocationStaticType_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationStaticType_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_MethodInvocationStaticType_20_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_MethodInvocationStaticType_21_1_preparereturnvalue_bindingFB(
			MethodInvocationStaticType _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationStaticType_21_1_preparereturnvalue_blackFBBF(EClass __eClass,
			MethodInvocationStaticType _this) {
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

	public static final Object[] pattern_MethodInvocationStaticType_21_1_preparereturnvalue_bindingAndBlackFFBF(
			MethodInvocationStaticType _this) {
		Object[] result_pattern_MethodInvocationStaticType_21_1_preparereturnvalue_binding = pattern_MethodInvocationStaticType_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_MethodInvocationStaticType_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_MethodInvocationStaticType_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_MethodInvocationStaticType_21_1_preparereturnvalue_black = pattern_MethodInvocationStaticType_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_MethodInvocationStaticType_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_MethodInvocationStaticType_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_MethodInvocationStaticType_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationStaticType_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_MethodInvocationStaticType_21_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_mStaticType) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpInvocation = _edge_mStaticType.getSrc();
		if (tmpInvocation instanceof MMethodInvocation) {
			MMethodInvocation invocation = (MMethodInvocation) tmpInvocation;
			EObject tmpMStaticType = _edge_mStaticType.getTrg();
			if (tmpMStaticType instanceof Type) {
				Type mStaticType = (Type) tmpMStaticType;
				if (mStaticType.equals(invocation.getMStaticType())) {
					_result.add(new Object[] { invocation, mStaticType, _edge_mStaticType });
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_MethodInvocationStaticType_21_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_MethodInvocationStaticType_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			MethodInvocationStaticType _this, Match match, MMethodInvocation invocation, Type mStaticType) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, invocation, mStaticType);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_MethodInvocationStaticType_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			MethodInvocationStaticType _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodInvocationStaticType_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationStaticType_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_MethodInvocationStaticType_21_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_MethodInvocationStaticType_24_1_prepare_blackB(
			MethodInvocationStaticType _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_MethodInvocationStaticType_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_MethodInvocationStaticType_24_2_matchsrctrgcontext_bindingFFFFBB(
			Match sourceMatch, Match targetMatch) {
		EObject _localVariable_0 = sourceMatch.getObject("invocation");
		EObject _localVariable_1 = targetMatch.getObject("tAccess");
		EObject _localVariable_2 = targetMatch.getObject("tStaticType");
		EObject _localVariable_3 = sourceMatch.getObject("mStaticType");
		EObject tmpInvocation = _localVariable_0;
		EObject tmpTAccess = _localVariable_1;
		EObject tmpTStaticType = _localVariable_2;
		EObject tmpMStaticType = _localVariable_3;
		if (tmpInvocation instanceof MMethodInvocation) {
			MMethodInvocation invocation = (MMethodInvocation) tmpInvocation;
			if (tmpTAccess instanceof TCall) {
				TCall tAccess = (TCall) tmpTAccess;
				if (tmpTStaticType instanceof TAbstractType) {
					TAbstractType tStaticType = (TAbstractType) tmpTStaticType;
					if (tmpMStaticType instanceof Type) {
						Type mStaticType = (Type) tmpMStaticType;
						return new Object[] { invocation, tAccess, tStaticType, mStaticType, sourceMatch, targetMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationStaticType_24_2_matchsrctrgcontext_blackBBBBBB(
			MMethodInvocation invocation, TCall tAccess, TAbstractType tStaticType, Type mStaticType, Match sourceMatch,
			Match targetMatch) {
		if (!sourceMatch.equals(targetMatch)) {
			return new Object[] { invocation, tAccess, tStaticType, mStaticType, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationStaticType_24_2_matchsrctrgcontext_bindingAndBlackFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_MethodInvocationStaticType_24_2_matchsrctrgcontext_binding = pattern_MethodInvocationStaticType_24_2_matchsrctrgcontext_bindingFFFFBB(
				sourceMatch, targetMatch);
		if (result_pattern_MethodInvocationStaticType_24_2_matchsrctrgcontext_binding != null) {
			MMethodInvocation invocation = (MMethodInvocation) result_pattern_MethodInvocationStaticType_24_2_matchsrctrgcontext_binding[0];
			TCall tAccess = (TCall) result_pattern_MethodInvocationStaticType_24_2_matchsrctrgcontext_binding[1];
			TAbstractType tStaticType = (TAbstractType) result_pattern_MethodInvocationStaticType_24_2_matchsrctrgcontext_binding[2];
			Type mStaticType = (Type) result_pattern_MethodInvocationStaticType_24_2_matchsrctrgcontext_binding[3];

			Object[] result_pattern_MethodInvocationStaticType_24_2_matchsrctrgcontext_black = pattern_MethodInvocationStaticType_24_2_matchsrctrgcontext_blackBBBBBB(
					invocation, tAccess, tStaticType, mStaticType, sourceMatch, targetMatch);
			if (result_pattern_MethodInvocationStaticType_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { invocation, tAccess, tStaticType, mStaticType, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationStaticType_24_3_solvecsp_bindingFBBBBBBB(
			MethodInvocationStaticType _this, MMethodInvocation invocation, TCall tAccess, TAbstractType tStaticType,
			Type mStaticType, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_4 = _this.isApplicable_solveCsp_CC(invocation, tAccess, tStaticType, mStaticType,
				sourceMatch, targetMatch);
		CSP csp = _localVariable_4;
		if (csp != null) {
			return new Object[] { csp, _this, invocation, tAccess, tStaticType, mStaticType, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationStaticType_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MethodInvocationStaticType_24_3_solvecsp_bindingAndBlackFBBBBBBB(
			MethodInvocationStaticType _this, MMethodInvocation invocation, TCall tAccess, TAbstractType tStaticType,
			Type mStaticType, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_MethodInvocationStaticType_24_3_solvecsp_binding = pattern_MethodInvocationStaticType_24_3_solvecsp_bindingFBBBBBBB(
				_this, invocation, tAccess, tStaticType, mStaticType, sourceMatch, targetMatch);
		if (result_pattern_MethodInvocationStaticType_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_MethodInvocationStaticType_24_3_solvecsp_binding[0];

			Object[] result_pattern_MethodInvocationStaticType_24_3_solvecsp_black = pattern_MethodInvocationStaticType_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_MethodInvocationStaticType_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, invocation, tAccess, tStaticType, mStaticType, sourceMatch,
						targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodInvocationStaticType_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_MethodInvocationStaticType_24_5_matchcorrcontext_blackFBBBBFBB(
			MMethodInvocation invocation, TCall tAccess, TAbstractType tStaticType, Type mStaticType, Match sourceMatch,
			Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (TypeToTAbstractType mStaticTypeTotStaticType : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(tStaticType, TypeToTAbstractType.class, "target")) {
				if (mStaticType.equals(mStaticTypeTotStaticType.getSource())) {
					for (AbstractMethodInvocationToTAccess invocationToTAccess : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(invocation, AbstractMethodInvocationToTAccess.class, "source")) {
						if (tAccess.equals(invocationToTAccess.getTarget())) {
							_result.add(new Object[] { mStaticTypeTotStaticType, invocation, tAccess, tStaticType,
									mStaticType, invocationToTAccess, sourceMatch, targetMatch });
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_MethodInvocationStaticType_24_5_matchcorrcontext_greenBBBBF(
			TypeToTAbstractType mStaticTypeTotStaticType, AbstractMethodInvocationToTAccess invocationToTAccess,
			Match sourceMatch, Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "MethodInvocationStaticType";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(mStaticTypeTotStaticType);
		ccMatch.getAllContextElements().add(invocationToTAccess);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { mStaticTypeTotStaticType, invocationToTAccess, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_MethodInvocationStaticType_24_6_createcorrespondence_blackBBBBB(
			MMethodInvocation invocation, TCall tAccess, TAbstractType tStaticType, Type mStaticType, CCMatch ccMatch) {
		return new Object[] { invocation, tAccess, tStaticType, mStaticType, ccMatch };
	}

	public static final Object[] pattern_MethodInvocationStaticType_24_7_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_MethodInvocationStaticType_24_7_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "MethodInvocationStaticType";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_MethodInvocationStaticType_24_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_MethodInvocationStaticType_27_1_matchtggpattern_blackBB(
			MMethodInvocation invocation, Type mStaticType) {
		if (mStaticType.equals(invocation.getMStaticType())) {
			return new Object[] { invocation, mStaticType };
		}
		return null;
	}

	public static final boolean pattern_MethodInvocationStaticType_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_MethodInvocationStaticType_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_MethodInvocationStaticType_28_1_matchtggpattern_blackBB(TCall tAccess,
			TAbstractType tStaticType) {
		if (tStaticType.equals(tAccess.getStaticType())) {
			return new Object[] { tAccess, tStaticType };
		}
		return null;
	}

	public static final boolean pattern_MethodInvocationStaticType_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_MethodInvocationStaticType_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_MethodInvocationStaticType_29_1_createresult_blackB(
			MethodInvocationStaticType _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_MethodInvocationStaticType_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_MethodInvocationStaticType_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, TypeToTAbstractType mStaticTypeTotStaticType) {
		if (ruleResult.getCorrObjects().contains(mStaticTypeTotStaticType)) {
			return new Object[] { ruleResult, mStaticTypeTotStaticType };
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationStaticType_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, TAbstractType tStaticType) {
		if (ruleResult.getTargetObjects().contains(tStaticType)) {
			return new Object[] { ruleResult, tStaticType };
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationStaticType_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, Type mStaticType) {
		if (ruleResult.getSourceObjects().contains(mStaticType)) {
			return new Object[] { ruleResult, mStaticType };
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationStaticType_29_2_isapplicablecore_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, MMethodInvocation invocation) {
		if (ruleResult.getSourceObjects().contains(invocation)) {
			return new Object[] { ruleResult, invocation };
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationStaticType_29_2_isapplicablecore_black_nac_4BB(
			ModelgeneratorRuleResult ruleResult, AbstractMethodInvocationToTAccess invocationToTAccess) {
		if (ruleResult.getCorrObjects().contains(invocationToTAccess)) {
			return new Object[] { ruleResult, invocationToTAccess };
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationStaticType_29_2_isapplicablecore_black_nac_5BB(
			ModelgeneratorRuleResult ruleResult, TCall tAccess) {
		if (ruleResult.getTargetObjects().contains(tAccess)) {
			return new Object[] { ruleResult, tAccess };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_MethodInvocationStaticType_29_2_isapplicablecore_blackFFFFFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList mStaticTypeTotStaticTypeList : ruleEntryContainer.getRuleEntryList()) {
			for (RuleEntryList invocationToTAccessList : ruleEntryContainer.getRuleEntryList()) {
				if (!invocationToTAccessList.equals(mStaticTypeTotStaticTypeList)) {
					for (EObject tmpMStaticTypeTotStaticType : mStaticTypeTotStaticTypeList.getEntryObjects()) {
						if (tmpMStaticTypeTotStaticType instanceof TypeToTAbstractType) {
							TypeToTAbstractType mStaticTypeTotStaticType = (TypeToTAbstractType) tmpMStaticTypeTotStaticType;
							TAbstractType tStaticType = mStaticTypeTotStaticType.getTarget();
							if (tStaticType != null) {
								Type mStaticType = mStaticTypeTotStaticType.getSource();
								if (mStaticType != null) {
									if (pattern_MethodInvocationStaticType_29_2_isapplicablecore_black_nac_0BB(
											ruleResult, mStaticTypeTotStaticType) == null) {
										if (pattern_MethodInvocationStaticType_29_2_isapplicablecore_black_nac_1BB(
												ruleResult, tStaticType) == null) {
											if (pattern_MethodInvocationStaticType_29_2_isapplicablecore_black_nac_2BB(
													ruleResult, mStaticType) == null) {
												for (EObject tmpInvocationToTAccess : invocationToTAccessList
														.getEntryObjects()) {
													if (tmpInvocationToTAccess instanceof AbstractMethodInvocationToTAccess) {
														AbstractMethodInvocationToTAccess invocationToTAccess = (AbstractMethodInvocationToTAccess) tmpInvocationToTAccess;
														AbstractMethodInvocation tmpInvocation = invocationToTAccess
																.getSource();
														if (tmpInvocation instanceof MMethodInvocation) {
															MMethodInvocation invocation = (MMethodInvocation) tmpInvocation;
															TAccess tmpTAccess = invocationToTAccess.getTarget();
															if (tmpTAccess instanceof TCall) {
																TCall tAccess = (TCall) tmpTAccess;
																if (pattern_MethodInvocationStaticType_29_2_isapplicablecore_black_nac_4BB(
																		ruleResult, invocationToTAccess) == null) {
																	if (pattern_MethodInvocationStaticType_29_2_isapplicablecore_black_nac_3BB(
																			ruleResult, invocation) == null) {
																		if (pattern_MethodInvocationStaticType_29_2_isapplicablecore_black_nac_5BB(
																				ruleResult, tAccess) == null) {
																			_result.add(new Object[] {
																					mStaticTypeTotStaticTypeList,
																					mStaticTypeTotStaticType,
																					tStaticType, mStaticType,
																					invocationToTAccessList, invocation,
																					invocationToTAccess, tAccess,
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

	public static final Object[] pattern_MethodInvocationStaticType_29_3_solveCSP_bindingFBBBBBBBBB(
			MethodInvocationStaticType _this, IsApplicableMatch isApplicableMatch,
			TypeToTAbstractType mStaticTypeTotStaticType, MMethodInvocation invocation, TCall tAccess,
			TAbstractType tStaticType, Type mStaticType, AbstractMethodInvocationToTAccess invocationToTAccess,
			ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, mStaticTypeTotStaticType, invocation,
				tAccess, tStaticType, mStaticType, invocationToTAccess, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mStaticTypeTotStaticType, invocation, tAccess,
					tStaticType, mStaticType, invocationToTAccess, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationStaticType_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MethodInvocationStaticType_29_3_solveCSP_bindingAndBlackFBBBBBBBBB(
			MethodInvocationStaticType _this, IsApplicableMatch isApplicableMatch,
			TypeToTAbstractType mStaticTypeTotStaticType, MMethodInvocation invocation, TCall tAccess,
			TAbstractType tStaticType, Type mStaticType, AbstractMethodInvocationToTAccess invocationToTAccess,
			ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_MethodInvocationStaticType_29_3_solveCSP_binding = pattern_MethodInvocationStaticType_29_3_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, mStaticTypeTotStaticType, invocation, tAccess, tStaticType, mStaticType,
				invocationToTAccess, ruleResult);
		if (result_pattern_MethodInvocationStaticType_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_MethodInvocationStaticType_29_3_solveCSP_binding[0];

			Object[] result_pattern_MethodInvocationStaticType_29_3_solveCSP_black = pattern_MethodInvocationStaticType_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_MethodInvocationStaticType_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mStaticTypeTotStaticType, invocation, tAccess,
						tStaticType, mStaticType, invocationToTAccess, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodInvocationStaticType_29_4_checkCSP_expressionFBB(
			MethodInvocationStaticType _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodInvocationStaticType_29_5_checknacs_blackBBBBBB(
			TypeToTAbstractType mStaticTypeTotStaticType, MMethodInvocation invocation, TCall tAccess,
			TAbstractType tStaticType, Type mStaticType, AbstractMethodInvocationToTAccess invocationToTAccess) {
		return new Object[] { mStaticTypeTotStaticType, invocation, tAccess, tStaticType, mStaticType,
				invocationToTAccess };
	}

	public static final Object[] pattern_MethodInvocationStaticType_29_6_perform_blackBBBBBBB(
			TypeToTAbstractType mStaticTypeTotStaticType, MMethodInvocation invocation, TCall tAccess,
			TAbstractType tStaticType, Type mStaticType, AbstractMethodInvocationToTAccess invocationToTAccess,
			ModelgeneratorRuleResult ruleResult) {
		return new Object[] { mStaticTypeTotStaticType, invocation, tAccess, tStaticType, mStaticType,
				invocationToTAccess, ruleResult };
	}

	public static final Object[] pattern_MethodInvocationStaticType_29_6_perform_greenBBBBB(
			MMethodInvocation invocation, TCall tAccess, TAbstractType tStaticType, Type mStaticType,
			ModelgeneratorRuleResult ruleResult) {
		tAccess.setStaticType(tStaticType);
		invocation.setMStaticType(mStaticType);
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { invocation, tAccess, tStaticType, mStaticType, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_MethodInvocationStaticType_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //MethodInvocationStaticTypeImpl
