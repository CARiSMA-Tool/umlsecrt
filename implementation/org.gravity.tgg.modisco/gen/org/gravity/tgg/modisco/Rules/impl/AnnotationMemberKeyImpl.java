/**
 */
package org.gravity.tgg.modisco.Rules.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.LinkedList;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;

import org.eclipse.modisco.java.ASTNode;
import org.eclipse.modisco.java.Annotation;
import org.eclipse.modisco.java.AnnotationMemberValuePair;
import org.eclipse.modisco.java.BodyDeclaration;

import org.eclipse.modisco.java.emf.JavaFactory;

import org.gravity.tgg.modisco.ASTNodeToTAnnotatable;
import org.gravity.tgg.modisco.AnnotationMemberValuePairToTAnnotationValue;
import org.gravity.tgg.modisco.AnnotationToTAnnotation;
import org.gravity.tgg.modisco.ModiscoFactory;

import org.gravity.tgg.modisco.Rules.AnnotationMemberKey;
import org.gravity.tgg.modisco.Rules.RulesPackage;

import org.gravity.typegraph.basic.annotations.AnnotationsFactory;
import org.gravity.typegraph.basic.annotations.TAnnotatable;
import org.gravity.typegraph.basic.annotations.TAnnotation;
import org.gravity.typegraph.basic.annotations.TAnnotationValue;

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
 * An implementation of the model object '<em><b>Annotation Member Key</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class AnnotationMemberKeyImpl extends AbstractRuleImpl implements AnnotationMemberKey {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnnotationMemberKeyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getAnnotationMemberKey();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, BodyDeclaration mOwner, AnnotationMemberValuePair mValue,
			Annotation mAnnotation) {

		Object[] result1_black = AnnotationMemberKeyImpl
				.pattern_AnnotationMemberKey_0_1_initialbindings_blackBBBBB(this, match, mOwner, mValue, mAnnotation);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[mOwner] = " + mOwner + ", " + "[mValue] = " + mValue + ", "
					+ "[mAnnotation] = " + mAnnotation + ".");
		}

		Object[] result2_bindingAndBlack = AnnotationMemberKeyImpl
				.pattern_AnnotationMemberKey_0_2_SolveCSP_bindingAndBlackFBBBBB(this, match, mOwner, mValue,
						mAnnotation);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[mOwner] = " + mOwner + ", " + "[mValue] = " + mValue + ", "
					+ "[mAnnotation] = " + mAnnotation + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (AnnotationMemberKeyImpl.pattern_AnnotationMemberKey_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = AnnotationMemberKeyImpl
					.pattern_AnnotationMemberKey_0_4_collectelementstobetranslated_blackBBBB(match, mOwner, mValue,
							mAnnotation);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[mOwner] = " + mOwner + ", " + "[mValue] = " + mValue + ", " + "[mAnnotation] = "
						+ mAnnotation + ".");
			}
			AnnotationMemberKeyImpl.pattern_AnnotationMemberKey_0_4_collectelementstobetranslated_greenBBBF(match,
					mValue, mAnnotation);
			//nothing EMoflonEdge mAnnotation__mValue____values = (EMoflonEdge) result4_green[3];

			Object[] result5_black = AnnotationMemberKeyImpl
					.pattern_AnnotationMemberKey_0_5_collectcontextelements_blackBBBB(match, mOwner, mValue,
							mAnnotation);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[mOwner] = " + mOwner + ", " + "[mValue] = " + mValue + ", " + "[mAnnotation] = "
						+ mAnnotation + ".");
			}
			AnnotationMemberKeyImpl.pattern_AnnotationMemberKey_0_5_collectcontextelements_greenBBBF(match, mOwner,
					mAnnotation);
			//nothing EMoflonEdge mOwner__mAnnotation____annotations = (EMoflonEdge) result5_green[3];

			// 
			AnnotationMemberKeyImpl.pattern_AnnotationMemberKey_0_6_registerobjectstomatch_expressionBBBBB(this, match,
					mOwner, mValue, mAnnotation);
			return AnnotationMemberKeyImpl.pattern_AnnotationMemberKey_0_7_expressionF();
		} else {
			return AnnotationMemberKeyImpl.pattern_AnnotationMemberKey_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = AnnotationMemberKeyImpl
				.pattern_AnnotationMemberKey_1_1_performtransformation_bindingAndBlackFFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		TAnnotatable tOwner = (TAnnotatable) result1_bindingAndBlack[0];
		BodyDeclaration mOwner = (BodyDeclaration) result1_bindingAndBlack[1];
		TAnnotation tAnnotation = (TAnnotation) result1_bindingAndBlack[2];
		AnnotationToTAnnotation annotationToTAnnotation = (AnnotationToTAnnotation) result1_bindingAndBlack[3];
		AnnotationMemberValuePair mValue = (AnnotationMemberValuePair) result1_bindingAndBlack[4];
		Annotation mAnnotation = (Annotation) result1_bindingAndBlack[5];
		ASTNodeToTAnnotatable ownerToWoner = (ASTNodeToTAnnotatable) result1_bindingAndBlack[6];
		CSP csp = (CSP) result1_bindingAndBlack[7];
		Object[] result1_green = AnnotationMemberKeyImpl
				.pattern_AnnotationMemberKey_1_1_performtransformation_greenFBFBB(tAnnotation, mValue, csp);
		TAnnotationValue tAnnotationValue = (TAnnotationValue) result1_green[0];
		AnnotationMemberValuePairToTAnnotationValue annotationMemberValuePairToTAnnotationValue = (AnnotationMemberValuePairToTAnnotationValue) result1_green[2];

		Object[] result2_black = AnnotationMemberKeyImpl
				.pattern_AnnotationMemberKey_1_2_collecttranslatedelements_blackBBB(tAnnotationValue,
						annotationMemberValuePairToTAnnotationValue, mValue);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[tAnnotationValue] = "
					+ tAnnotationValue + ", " + "[annotationMemberValuePairToTAnnotationValue] = "
					+ annotationMemberValuePairToTAnnotationValue + ", " + "[mValue] = " + mValue + ".");
		}
		Object[] result2_green = AnnotationMemberKeyImpl
				.pattern_AnnotationMemberKey_1_2_collecttranslatedelements_greenFBBB(tAnnotationValue,
						annotationMemberValuePairToTAnnotationValue, mValue);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = AnnotationMemberKeyImpl
				.pattern_AnnotationMemberKey_1_3_bookkeepingforedges_blackBBBBBBBBBB(ruleresult, tOwner,
						tAnnotationValue, mOwner, tAnnotation, annotationToTAnnotation,
						annotationMemberValuePairToTAnnotationValue, mValue, mAnnotation, ownerToWoner);
		if (result3_black == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult + ", " + "[tOwner] = "
							+ tOwner + ", " + "[tAnnotationValue] = " + tAnnotationValue + ", " + "[mOwner] = " + mOwner
							+ ", " + "[tAnnotation] = " + tAnnotation + ", " + "[annotationToTAnnotation] = "
							+ annotationToTAnnotation + ", " + "[annotationMemberValuePairToTAnnotationValue] = "
							+ annotationMemberValuePairToTAnnotationValue + ", " + "[mValue] = " + mValue + ", "
							+ "[mAnnotation] = " + mAnnotation + ", " + "[ownerToWoner] = " + ownerToWoner + ".");
		}
		AnnotationMemberKeyImpl.pattern_AnnotationMemberKey_1_3_bookkeepingforedges_greenBBBBBBFFFF(ruleresult,
				tAnnotationValue, tAnnotation, annotationMemberValuePairToTAnnotationValue, mValue, mAnnotation);
		//nothing EMoflonEdge tAnnotation__tAnnotationValue____tValues = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge annotationMemberValuePairToTAnnotationValue__tAnnotationValue____target = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge annotationMemberValuePairToTAnnotationValue__mValue____source = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge mAnnotation__mValue____values = (EMoflonEdge) result3_green[9];

		// 
		// 
		AnnotationMemberKeyImpl.pattern_AnnotationMemberKey_1_5_registerobjects_expressionBBBBBBBBBBB(this, ruleresult,
				tOwner, tAnnotationValue, mOwner, tAnnotation, annotationToTAnnotation,
				annotationMemberValuePairToTAnnotationValue, mValue, mAnnotation, ownerToWoner);
		return AnnotationMemberKeyImpl.pattern_AnnotationMemberKey_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = AnnotationMemberKeyImpl
				.pattern_AnnotationMemberKey_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = AnnotationMemberKeyImpl
				.pattern_AnnotationMemberKey_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = AnnotationMemberKeyImpl.pattern_AnnotationMemberKey_2_2_corematch_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		BodyDeclaration mOwner = (BodyDeclaration) result2_binding[0];
		AnnotationMemberValuePair mValue = (AnnotationMemberValuePair) result2_binding[1];
		Annotation mAnnotation = (Annotation) result2_binding[2];
		for (Object[] result2_black : AnnotationMemberKeyImpl
				.pattern_AnnotationMemberKey_2_2_corematch_blackFBFFBBFB(mOwner, mValue, mAnnotation, match)) {
			TAnnotatable tOwner = (TAnnotatable) result2_black[0];
			TAnnotation tAnnotation = (TAnnotation) result2_black[2];
			AnnotationToTAnnotation annotationToTAnnotation = (AnnotationToTAnnotation) result2_black[3];
			ASTNodeToTAnnotatable ownerToWoner = (ASTNodeToTAnnotatable) result2_black[6];
			// ForEach 
			for (Object[] result3_black : AnnotationMemberKeyImpl
					.pattern_AnnotationMemberKey_2_3_findcontext_blackBBBBBBB(tOwner, mOwner, tAnnotation,
							annotationToTAnnotation, mValue, mAnnotation, ownerToWoner)) {
				Object[] result3_green = AnnotationMemberKeyImpl
						.pattern_AnnotationMemberKey_2_3_findcontext_greenBBBBBBBFFFFFFFFF(tOwner, mOwner, tAnnotation,
								annotationToTAnnotation, mValue, mAnnotation, ownerToWoner);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[7];
				//nothing EMoflonEdge tOwner__tAnnotation____tAnnotation = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge tAnnotation__tOwner____tAnnotated = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge mOwner__mAnnotation____annotations = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge annotationToTAnnotation__tAnnotation____target = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge mAnnotation__mValue____values = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge annotationToTAnnotation__mAnnotation____source = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge ownerToWoner__tOwner____target = (EMoflonEdge) result3_green[14];
				//nothing EMoflonEdge ownerToWoner__mOwner____source = (EMoflonEdge) result3_green[15];

				Object[] result4_bindingAndBlack = AnnotationMemberKeyImpl
						.pattern_AnnotationMemberKey_2_4_solveCSP_bindingAndBlackFBBBBBBBBB(this, isApplicableMatch,
								tOwner, mOwner, tAnnotation, annotationToTAnnotation, mValue, mAnnotation,
								ownerToWoner);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[tOwner] = " + tOwner + ", "
							+ "[mOwner] = " + mOwner + ", " + "[tAnnotation] = " + tAnnotation + ", "
							+ "[annotationToTAnnotation] = " + annotationToTAnnotation + ", " + "[mValue] = " + mValue
							+ ", " + "[mAnnotation] = " + mAnnotation + ", " + "[ownerToWoner] = " + ownerToWoner
							+ ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (AnnotationMemberKeyImpl.pattern_AnnotationMemberKey_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = AnnotationMemberKeyImpl
							.pattern_AnnotationMemberKey_2_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					AnnotationMemberKeyImpl.pattern_AnnotationMemberKey_2_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return AnnotationMemberKeyImpl.pattern_AnnotationMemberKey_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, BodyDeclaration mOwner, AnnotationMemberValuePair mValue,
			Annotation mAnnotation) {
		match.registerObject("mOwner", mOwner);
		match.registerObject("mValue", mValue);
		match.registerObject("mAnnotation", mAnnotation);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, BodyDeclaration mOwner, AnnotationMemberValuePair mValue,
			Annotation mAnnotation) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, TAnnotatable tOwner,
			BodyDeclaration mOwner, TAnnotation tAnnotation, AnnotationToTAnnotation annotationToTAnnotation,
			AnnotationMemberValuePair mValue, Annotation mAnnotation, ASTNodeToTAnnotatable ownerToWoner) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_mValue_name = CSPFactoryHelper.eINSTANCE.createVariable("mValue.name", true, csp);
		var_mValue_name.setValue(mValue.getName());
		var_mValue_name.setType("String");

		// Create unbound variables
		Variable var_tAnnotationValue_tKey = CSPFactoryHelper.eINSTANCE.createVariable("tAnnotationValue.tKey", csp);
		var_tAnnotationValue_tKey.setType("String");

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_mValue_name, var_tAnnotationValue_tKey);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("tOwner", tOwner);
		isApplicableMatch.registerObject("mOwner", mOwner);
		isApplicableMatch.registerObject("tAnnotation", tAnnotation);
		isApplicableMatch.registerObject("annotationToTAnnotation", annotationToTAnnotation);
		isApplicableMatch.registerObject("mValue", mValue);
		isApplicableMatch.registerObject("mAnnotation", mAnnotation);
		isApplicableMatch.registerObject("ownerToWoner", ownerToWoner);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject tOwner, EObject tAnnotationValue,
			EObject mOwner, EObject tAnnotation, EObject annotationToTAnnotation,
			EObject annotationMemberValuePairToTAnnotationValue, EObject mValue, EObject mAnnotation,
			EObject ownerToWoner) {
		ruleresult.registerObject("tOwner", tOwner);
		ruleresult.registerObject("tAnnotationValue", tAnnotationValue);
		ruleresult.registerObject("mOwner", mOwner);
		ruleresult.registerObject("tAnnotation", tAnnotation);
		ruleresult.registerObject("annotationToTAnnotation", annotationToTAnnotation);
		ruleresult.registerObject("annotationMemberValuePairToTAnnotationValue",
				annotationMemberValuePairToTAnnotationValue);
		ruleresult.registerObject("mValue", mValue);
		ruleresult.registerObject("mAnnotation", mAnnotation);
		ruleresult.registerObject("ownerToWoner", ownerToWoner);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("mValue").eClass())
				.equals("java.AnnotationMemberValuePair.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, TAnnotatable tOwner, TAnnotationValue tAnnotationValue,
			TAnnotation tAnnotation) {

		Object[] result1_black = AnnotationMemberKeyImpl.pattern_AnnotationMemberKey_10_1_initialbindings_blackBBBBB(
				this, match, tOwner, tAnnotationValue, tAnnotation);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[tOwner] = " + tOwner + ", " + "[tAnnotationValue] = "
					+ tAnnotationValue + ", " + "[tAnnotation] = " + tAnnotation + ".");
		}

		Object[] result2_bindingAndBlack = AnnotationMemberKeyImpl
				.pattern_AnnotationMemberKey_10_2_SolveCSP_bindingAndBlackFBBBBB(this, match, tOwner, tAnnotationValue,
						tAnnotation);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[tOwner] = " + tOwner + ", " + "[tAnnotationValue] = "
					+ tAnnotationValue + ", " + "[tAnnotation] = " + tAnnotation + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (AnnotationMemberKeyImpl.pattern_AnnotationMemberKey_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = AnnotationMemberKeyImpl
					.pattern_AnnotationMemberKey_10_4_collectelementstobetranslated_blackBBBB(match, tOwner,
							tAnnotationValue, tAnnotation);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[tOwner] = " + tOwner + ", " + "[tAnnotationValue] = " + tAnnotationValue + ", "
						+ "[tAnnotation] = " + tAnnotation + ".");
			}
			AnnotationMemberKeyImpl.pattern_AnnotationMemberKey_10_4_collectelementstobetranslated_greenBBBF(match,
					tAnnotationValue, tAnnotation);
			//nothing EMoflonEdge tAnnotation__tAnnotationValue____tValues = (EMoflonEdge) result4_green[3];

			Object[] result5_black = AnnotationMemberKeyImpl
					.pattern_AnnotationMemberKey_10_5_collectcontextelements_blackBBBB(match, tOwner, tAnnotationValue,
							tAnnotation);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[tOwner] = " + tOwner + ", " + "[tAnnotationValue] = " + tAnnotationValue + ", "
						+ "[tAnnotation] = " + tAnnotation + ".");
			}
			AnnotationMemberKeyImpl.pattern_AnnotationMemberKey_10_5_collectcontextelements_greenBBBFF(match, tOwner,
					tAnnotation);
			//nothing EMoflonEdge tOwner__tAnnotation____tAnnotation = (EMoflonEdge) result5_green[3];
			//nothing EMoflonEdge tAnnotation__tOwner____tAnnotated = (EMoflonEdge) result5_green[4];

			// 
			AnnotationMemberKeyImpl.pattern_AnnotationMemberKey_10_6_registerobjectstomatch_expressionBBBBB(this, match,
					tOwner, tAnnotationValue, tAnnotation);
			return AnnotationMemberKeyImpl.pattern_AnnotationMemberKey_10_7_expressionF();
		} else {
			return AnnotationMemberKeyImpl.pattern_AnnotationMemberKey_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = AnnotationMemberKeyImpl
				.pattern_AnnotationMemberKey_11_1_performtransformation_bindingAndBlackFFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		TAnnotatable tOwner = (TAnnotatable) result1_bindingAndBlack[0];
		TAnnotationValue tAnnotationValue = (TAnnotationValue) result1_bindingAndBlack[1];
		BodyDeclaration mOwner = (BodyDeclaration) result1_bindingAndBlack[2];
		TAnnotation tAnnotation = (TAnnotation) result1_bindingAndBlack[3];
		AnnotationToTAnnotation annotationToTAnnotation = (AnnotationToTAnnotation) result1_bindingAndBlack[4];
		Annotation mAnnotation = (Annotation) result1_bindingAndBlack[5];
		ASTNodeToTAnnotatable ownerToWoner = (ASTNodeToTAnnotatable) result1_bindingAndBlack[6];
		CSP csp = (CSP) result1_bindingAndBlack[7];
		Object[] result1_green = AnnotationMemberKeyImpl
				.pattern_AnnotationMemberKey_11_1_performtransformation_greenBFFBB(tAnnotationValue, mAnnotation, csp);
		AnnotationMemberValuePairToTAnnotationValue annotationMemberValuePairToTAnnotationValue = (AnnotationMemberValuePairToTAnnotationValue) result1_green[1];
		AnnotationMemberValuePair mValue = (AnnotationMemberValuePair) result1_green[2];

		Object[] result2_black = AnnotationMemberKeyImpl
				.pattern_AnnotationMemberKey_11_2_collecttranslatedelements_blackBBB(tAnnotationValue,
						annotationMemberValuePairToTAnnotationValue, mValue);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[tAnnotationValue] = "
					+ tAnnotationValue + ", " + "[annotationMemberValuePairToTAnnotationValue] = "
					+ annotationMemberValuePairToTAnnotationValue + ", " + "[mValue] = " + mValue + ".");
		}
		Object[] result2_green = AnnotationMemberKeyImpl
				.pattern_AnnotationMemberKey_11_2_collecttranslatedelements_greenFBBB(tAnnotationValue,
						annotationMemberValuePairToTAnnotationValue, mValue);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = AnnotationMemberKeyImpl
				.pattern_AnnotationMemberKey_11_3_bookkeepingforedges_blackBBBBBBBBBB(ruleresult, tOwner,
						tAnnotationValue, mOwner, tAnnotation, annotationToTAnnotation,
						annotationMemberValuePairToTAnnotationValue, mValue, mAnnotation, ownerToWoner);
		if (result3_black == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult + ", " + "[tOwner] = "
							+ tOwner + ", " + "[tAnnotationValue] = " + tAnnotationValue + ", " + "[mOwner] = " + mOwner
							+ ", " + "[tAnnotation] = " + tAnnotation + ", " + "[annotationToTAnnotation] = "
							+ annotationToTAnnotation + ", " + "[annotationMemberValuePairToTAnnotationValue] = "
							+ annotationMemberValuePairToTAnnotationValue + ", " + "[mValue] = " + mValue + ", "
							+ "[mAnnotation] = " + mAnnotation + ", " + "[ownerToWoner] = " + ownerToWoner + ".");
		}
		AnnotationMemberKeyImpl.pattern_AnnotationMemberKey_11_3_bookkeepingforedges_greenBBBBBBFFFF(ruleresult,
				tAnnotationValue, tAnnotation, annotationMemberValuePairToTAnnotationValue, mValue, mAnnotation);
		//nothing EMoflonEdge tAnnotation__tAnnotationValue____tValues = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge annotationMemberValuePairToTAnnotationValue__tAnnotationValue____target = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge annotationMemberValuePairToTAnnotationValue__mValue____source = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge mAnnotation__mValue____values = (EMoflonEdge) result3_green[9];

		// 
		// 
		AnnotationMemberKeyImpl.pattern_AnnotationMemberKey_11_5_registerobjects_expressionBBBBBBBBBBB(this, ruleresult,
				tOwner, tAnnotationValue, mOwner, tAnnotation, annotationToTAnnotation,
				annotationMemberValuePairToTAnnotationValue, mValue, mAnnotation, ownerToWoner);
		return AnnotationMemberKeyImpl.pattern_AnnotationMemberKey_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = AnnotationMemberKeyImpl
				.pattern_AnnotationMemberKey_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = AnnotationMemberKeyImpl
				.pattern_AnnotationMemberKey_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = AnnotationMemberKeyImpl
				.pattern_AnnotationMemberKey_12_2_corematch_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		TAnnotatable tOwner = (TAnnotatable) result2_binding[0];
		TAnnotationValue tAnnotationValue = (TAnnotationValue) result2_binding[1];
		TAnnotation tAnnotation = (TAnnotation) result2_binding[2];
		for (Object[] result2_black : AnnotationMemberKeyImpl.pattern_AnnotationMemberKey_12_2_corematch_blackBBFBFFFB(
				tOwner, tAnnotationValue, tAnnotation, match)) {
			BodyDeclaration mOwner = (BodyDeclaration) result2_black[2];
			AnnotationToTAnnotation annotationToTAnnotation = (AnnotationToTAnnotation) result2_black[4];
			Annotation mAnnotation = (Annotation) result2_black[5];
			ASTNodeToTAnnotatable ownerToWoner = (ASTNodeToTAnnotatable) result2_black[6];
			// ForEach 
			for (Object[] result3_black : AnnotationMemberKeyImpl
					.pattern_AnnotationMemberKey_12_3_findcontext_blackBBBBBBB(tOwner, tAnnotationValue, mOwner,
							tAnnotation, annotationToTAnnotation, mAnnotation, ownerToWoner)) {
				Object[] result3_green = AnnotationMemberKeyImpl
						.pattern_AnnotationMemberKey_12_3_findcontext_greenBBBBBBBFFFFFFFFF(tOwner, tAnnotationValue,
								mOwner, tAnnotation, annotationToTAnnotation, mAnnotation, ownerToWoner);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[7];
				//nothing EMoflonEdge tOwner__tAnnotation____tAnnotation = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge tAnnotation__tOwner____tAnnotated = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge mOwner__mAnnotation____annotations = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge tAnnotation__tAnnotationValue____tValues = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge annotationToTAnnotation__tAnnotation____target = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge annotationToTAnnotation__mAnnotation____source = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge ownerToWoner__tOwner____target = (EMoflonEdge) result3_green[14];
				//nothing EMoflonEdge ownerToWoner__mOwner____source = (EMoflonEdge) result3_green[15];

				Object[] result4_bindingAndBlack = AnnotationMemberKeyImpl
						.pattern_AnnotationMemberKey_12_4_solveCSP_bindingAndBlackFBBBBBBBBB(this, isApplicableMatch,
								tOwner, tAnnotationValue, mOwner, tAnnotation, annotationToTAnnotation, mAnnotation,
								ownerToWoner);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[tOwner] = " + tOwner + ", "
							+ "[tAnnotationValue] = " + tAnnotationValue + ", " + "[mOwner] = " + mOwner + ", "
							+ "[tAnnotation] = " + tAnnotation + ", " + "[annotationToTAnnotation] = "
							+ annotationToTAnnotation + ", " + "[mAnnotation] = " + mAnnotation + ", "
							+ "[ownerToWoner] = " + ownerToWoner + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (AnnotationMemberKeyImpl.pattern_AnnotationMemberKey_12_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = AnnotationMemberKeyImpl
							.pattern_AnnotationMemberKey_12_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					AnnotationMemberKeyImpl.pattern_AnnotationMemberKey_12_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return AnnotationMemberKeyImpl.pattern_AnnotationMemberKey_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, TAnnotatable tOwner, TAnnotationValue tAnnotationValue,
			TAnnotation tAnnotation) {
		match.registerObject("tOwner", tOwner);
		match.registerObject("tAnnotationValue", tAnnotationValue);
		match.registerObject("tAnnotation", tAnnotation);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, TAnnotatable tOwner, TAnnotationValue tAnnotationValue,
			TAnnotation tAnnotation) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, TAnnotatable tOwner,
			TAnnotationValue tAnnotationValue, BodyDeclaration mOwner, TAnnotation tAnnotation,
			AnnotationToTAnnotation annotationToTAnnotation, Annotation mAnnotation,
			ASTNodeToTAnnotatable ownerToWoner) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_tAnnotationValue_tKey = CSPFactoryHelper.eINSTANCE.createVariable("tAnnotationValue.tKey", true,
				csp);
		var_tAnnotationValue_tKey.setValue(tAnnotationValue.getTKey());
		var_tAnnotationValue_tKey.setType("String");

		// Create unbound variables
		Variable var_mValue_name = CSPFactoryHelper.eINSTANCE.createVariable("mValue.name", csp);
		var_mValue_name.setType("String");

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_mValue_name, var_tAnnotationValue_tKey);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("tOwner", tOwner);
		isApplicableMatch.registerObject("tAnnotationValue", tAnnotationValue);
		isApplicableMatch.registerObject("mOwner", mOwner);
		isApplicableMatch.registerObject("tAnnotation", tAnnotation);
		isApplicableMatch.registerObject("annotationToTAnnotation", annotationToTAnnotation);
		isApplicableMatch.registerObject("mAnnotation", mAnnotation);
		isApplicableMatch.registerObject("ownerToWoner", ownerToWoner);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject tOwner, EObject tAnnotationValue,
			EObject mOwner, EObject tAnnotation, EObject annotationToTAnnotation,
			EObject annotationMemberValuePairToTAnnotationValue, EObject mValue, EObject mAnnotation,
			EObject ownerToWoner) {
		ruleresult.registerObject("tOwner", tOwner);
		ruleresult.registerObject("tAnnotationValue", tAnnotationValue);
		ruleresult.registerObject("mOwner", mOwner);
		ruleresult.registerObject("tAnnotation", tAnnotation);
		ruleresult.registerObject("annotationToTAnnotation", annotationToTAnnotation);
		ruleresult.registerObject("annotationMemberValuePairToTAnnotationValue",
				annotationMemberValuePairToTAnnotationValue);
		ruleresult.registerObject("mValue", mValue);
		ruleresult.registerObject("mAnnotation", mAnnotation);
		ruleresult.registerObject("ownerToWoner", ownerToWoner);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("tAnnotationValue").eClass())
				.equals("basic.annotations.TAnnotationValue.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_175(EMoflonEdge _edge_tValues) {

		Object[] result1_bindingAndBlack = AnnotationMemberKeyImpl
				.pattern_AnnotationMemberKey_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = AnnotationMemberKeyImpl.pattern_AnnotationMemberKey_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : AnnotationMemberKeyImpl
				.pattern_AnnotationMemberKey_20_2_testcorematchandDECs_blackFFFB(_edge_tValues)) {
			TAnnotatable tOwner = (TAnnotatable) result2_black[0];
			TAnnotationValue tAnnotationValue = (TAnnotationValue) result2_black[1];
			TAnnotation tAnnotation = (TAnnotation) result2_black[2];
			Object[] result2_green = AnnotationMemberKeyImpl
					.pattern_AnnotationMemberKey_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (AnnotationMemberKeyImpl
					.pattern_AnnotationMemberKey_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(this,
							match, tOwner, tAnnotationValue, tAnnotation)) {
				// 
				if (AnnotationMemberKeyImpl
						.pattern_AnnotationMemberKey_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = AnnotationMemberKeyImpl
							.pattern_AnnotationMemberKey_20_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					AnnotationMemberKeyImpl.pattern_AnnotationMemberKey_20_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return AnnotationMemberKeyImpl.pattern_AnnotationMemberKey_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_180(EMoflonEdge _edge_values) {

		Object[] result1_bindingAndBlack = AnnotationMemberKeyImpl
				.pattern_AnnotationMemberKey_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = AnnotationMemberKeyImpl.pattern_AnnotationMemberKey_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : AnnotationMemberKeyImpl
				.pattern_AnnotationMemberKey_21_2_testcorematchandDECs_blackFFFB(_edge_values)) {
			BodyDeclaration mOwner = (BodyDeclaration) result2_black[0];
			AnnotationMemberValuePair mValue = (AnnotationMemberValuePair) result2_black[1];
			Annotation mAnnotation = (Annotation) result2_black[2];
			Object[] result2_green = AnnotationMemberKeyImpl
					.pattern_AnnotationMemberKey_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (AnnotationMemberKeyImpl
					.pattern_AnnotationMemberKey_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(this,
							match, mOwner, mValue, mAnnotation)) {
				// 
				if (AnnotationMemberKeyImpl
						.pattern_AnnotationMemberKey_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = AnnotationMemberKeyImpl
							.pattern_AnnotationMemberKey_21_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					AnnotationMemberKeyImpl.pattern_AnnotationMemberKey_21_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return AnnotationMemberKeyImpl.pattern_AnnotationMemberKey_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("AnnotationMemberKey");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		Variable var_mValue_name = CSPFactoryHelper.eINSTANCE.createVariable("mValue", true, csp);
		var_mValue_name.setValue(__helper.getValue("mValue", "name"));
		var_mValue_name.setType("String");

		Variable var_tAnnotationValue_tKey = CSPFactoryHelper.eINSTANCE.createVariable("tAnnotationValue", true, csp);
		var_tAnnotationValue_tKey.setValue(__helper.getValue("tAnnotationValue", "tKey"));
		var_tAnnotationValue_tKey.setType("String");

		Eq eq0 = new Eq();
		csp.getConstraints().add(eq0);

		eq0.setRuleName("AnnotationMemberKey");
		eq0.solve(var_mValue_name, var_tAnnotationValue_tKey);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_tAnnotationValue_tKey.setBound(false);
			eq0.solve(var_mValue_name, var_tAnnotationValue_tKey);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
				__helper.setValue("tAnnotationValue", "tKey", var_tAnnotationValue_tKey.getValue());
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
		ruleResult.setRule("AnnotationMemberKey");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		Variable var_mValue_name = CSPFactoryHelper.eINSTANCE.createVariable("mValue", true, csp);
		var_mValue_name.setValue(__helper.getValue("mValue", "name"));
		var_mValue_name.setType("String");

		Variable var_tAnnotationValue_tKey = CSPFactoryHelper.eINSTANCE.createVariable("tAnnotationValue", true, csp);
		var_tAnnotationValue_tKey.setValue(__helper.getValue("tAnnotationValue", "tKey"));
		var_tAnnotationValue_tKey.setType("String");

		Eq eq0 = new Eq();
		csp.getConstraints().add(eq0);

		eq0.setRuleName("AnnotationMemberKey");
		eq0.solve(var_mValue_name, var_tAnnotationValue_tKey);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_mValue_name.setBound(false);
			eq0.solve(var_mValue_name, var_tAnnotationValue_tKey);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
				__helper.setValue("mValue", "name", var_mValue_name.getValue());
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

		Object[] result1_black = AnnotationMemberKeyImpl.pattern_AnnotationMemberKey_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = AnnotationMemberKeyImpl.pattern_AnnotationMemberKey_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = AnnotationMemberKeyImpl
				.pattern_AnnotationMemberKey_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFBB(sourceMatch, targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		TAnnotatable tOwner = (TAnnotatable) result2_bindingAndBlack[0];
		TAnnotationValue tAnnotationValue = (TAnnotationValue) result2_bindingAndBlack[1];
		BodyDeclaration mOwner = (BodyDeclaration) result2_bindingAndBlack[2];
		TAnnotation tAnnotation = (TAnnotation) result2_bindingAndBlack[3];
		AnnotationMemberValuePair mValue = (AnnotationMemberValuePair) result2_bindingAndBlack[4];
		Annotation mAnnotation = (Annotation) result2_bindingAndBlack[5];

		Object[] result3_bindingAndBlack = AnnotationMemberKeyImpl
				.pattern_AnnotationMemberKey_24_3_solvecsp_bindingAndBlackFBBBBBBBBB(this, tOwner, tAnnotationValue,
						mOwner, tAnnotation, mValue, mAnnotation, sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[tOwner] = " + tOwner + ", " + "[tAnnotationValue] = " + tAnnotationValue + ", " + "[mOwner] = "
					+ mOwner + ", " + "[tAnnotation] = " + tAnnotation + ", " + "[mValue] = " + mValue + ", "
					+ "[mAnnotation] = " + mAnnotation + ", " + "[sourceMatch] = " + sourceMatch + ", "
					+ "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (AnnotationMemberKeyImpl.pattern_AnnotationMemberKey_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : AnnotationMemberKeyImpl
					.pattern_AnnotationMemberKey_24_5_matchcorrcontext_blackBBBFBFBB(tOwner, mOwner, tAnnotation,
							mAnnotation, sourceMatch, targetMatch)) {
				AnnotationToTAnnotation annotationToTAnnotation = (AnnotationToTAnnotation) result5_black[3];
				ASTNodeToTAnnotatable ownerToWoner = (ASTNodeToTAnnotatable) result5_black[5];
				Object[] result5_green = AnnotationMemberKeyImpl
						.pattern_AnnotationMemberKey_24_5_matchcorrcontext_greenBBBBF(annotationToTAnnotation,
								ownerToWoner, sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[4];

				Object[] result6_black = AnnotationMemberKeyImpl
						.pattern_AnnotationMemberKey_24_6_createcorrespondence_blackBBBBBBB(tOwner, tAnnotationValue,
								mOwner, tAnnotation, mValue, mAnnotation, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[tOwner] = " + tOwner
							+ ", " + "[tAnnotationValue] = " + tAnnotationValue + ", " + "[mOwner] = " + mOwner + ", "
							+ "[tAnnotation] = " + tAnnotation + ", " + "[mValue] = " + mValue + ", "
							+ "[mAnnotation] = " + mAnnotation + ", " + "[ccMatch] = " + ccMatch + ".");
				}
				AnnotationMemberKeyImpl.pattern_AnnotationMemberKey_24_6_createcorrespondence_greenBFBB(
						tAnnotationValue, mValue, ccMatch);
				//nothing AnnotationMemberValuePairToTAnnotationValue annotationMemberValuePairToTAnnotationValue = (AnnotationMemberValuePairToTAnnotationValue) result6_green[1];

				Object[] result7_black = AnnotationMemberKeyImpl
						.pattern_AnnotationMemberKey_24_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				AnnotationMemberKeyImpl.pattern_AnnotationMemberKey_24_7_addtoreturnedresult_greenBB(result, ccMatch);

			}

		} else {
		}
		return AnnotationMemberKeyImpl.pattern_AnnotationMemberKey_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(TAnnotatable tOwner, TAnnotationValue tAnnotationValue, BodyDeclaration mOwner,
			TAnnotation tAnnotation, AnnotationMemberValuePair mValue, Annotation mAnnotation, Match sourceMatch,
			Match targetMatch) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals

		// Create attribute variables
		Variable var_mValue_name = CSPFactoryHelper.eINSTANCE.createVariable("mValue.name", true, csp);
		var_mValue_name.setValue(mValue.getName());
		var_mValue_name.setType("String");
		Variable var_tAnnotationValue_tKey = CSPFactoryHelper.eINSTANCE.createVariable("tAnnotationValue.tKey", true,
				csp);
		var_tAnnotationValue_tKey.setValue(tAnnotationValue.getTKey());
		var_tAnnotationValue_tKey.setType("String");

		// Create unbound variables

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_mValue_name, var_tAnnotationValue_tKey);
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
	public boolean checkDEC_FWD(BodyDeclaration mOwner, AnnotationMemberValuePair mValue, Annotation mAnnotation) {// 
		Object[] result1_black = AnnotationMemberKeyImpl
				.pattern_AnnotationMemberKey_27_1_matchtggpattern_blackBBB(mOwner, mValue, mAnnotation);
		if (result1_black != null) {
			return AnnotationMemberKeyImpl.pattern_AnnotationMemberKey_27_2_expressionF();
		} else {
			return AnnotationMemberKeyImpl.pattern_AnnotationMemberKey_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(TAnnotatable tOwner, TAnnotationValue tAnnotationValue, TAnnotation tAnnotation) {// 
		Object[] result1_black = AnnotationMemberKeyImpl
				.pattern_AnnotationMemberKey_28_1_matchtggpattern_blackBBB(tOwner, tAnnotationValue, tAnnotation);
		if (result1_black != null) {
			return AnnotationMemberKeyImpl.pattern_AnnotationMemberKey_28_2_expressionF();
		} else {
			return AnnotationMemberKeyImpl.pattern_AnnotationMemberKey_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer,
			AnnotationToTAnnotation annotationToTAnnotationParameter) {

		Object[] result1_black = AnnotationMemberKeyImpl.pattern_AnnotationMemberKey_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = AnnotationMemberKeyImpl.pattern_AnnotationMemberKey_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : AnnotationMemberKeyImpl
				.pattern_AnnotationMemberKey_29_2_isapplicablecore_blackFFFFFFFBB(ruleEntryContainer, ruleResult)) {
			//nothing RuleEntryList annotationToTAnnotationList = (RuleEntryList) result2_black[0];
			TAnnotatable tOwner = (TAnnotatable) result2_black[1];
			TAnnotation tAnnotation = (TAnnotation) result2_black[2];
			AnnotationToTAnnotation annotationToTAnnotation = (AnnotationToTAnnotation) result2_black[3];
			Annotation mAnnotation = (Annotation) result2_black[4];
			BodyDeclaration mOwner = (BodyDeclaration) result2_black[5];
			ASTNodeToTAnnotatable ownerToWoner = (ASTNodeToTAnnotatable) result2_black[6];

			Object[] result3_bindingAndBlack = AnnotationMemberKeyImpl
					.pattern_AnnotationMemberKey_29_3_solveCSP_bindingAndBlackFBBBBBBBBB(this, isApplicableMatch,
							tOwner, mOwner, tAnnotation, annotationToTAnnotation, mAnnotation, ownerToWoner,
							ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[tOwner] = " + tOwner + ", "
						+ "[mOwner] = " + mOwner + ", " + "[tAnnotation] = " + tAnnotation + ", "
						+ "[annotationToTAnnotation] = " + annotationToTAnnotation + ", " + "[mAnnotation] = "
						+ mAnnotation + ", " + "[ownerToWoner] = " + ownerToWoner + ", " + "[ruleResult] = "
						+ ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (AnnotationMemberKeyImpl.pattern_AnnotationMemberKey_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = AnnotationMemberKeyImpl.pattern_AnnotationMemberKey_29_5_checknacs_blackBBBBBB(
						tOwner, mOwner, tAnnotation, annotationToTAnnotation, mAnnotation, ownerToWoner);
				if (result5_black != null) {

					Object[] result6_black = AnnotationMemberKeyImpl
							.pattern_AnnotationMemberKey_29_6_perform_blackBBBBBBB(tOwner, mOwner, tAnnotation,
									annotationToTAnnotation, mAnnotation, ownerToWoner, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[tOwner] = " + tOwner
								+ ", " + "[mOwner] = " + mOwner + ", " + "[tAnnotation] = " + tAnnotation + ", "
								+ "[annotationToTAnnotation] = " + annotationToTAnnotation + ", " + "[mAnnotation] = "
								+ mAnnotation + ", " + "[ownerToWoner] = " + ownerToWoner + ", " + "[ruleResult] = "
								+ ruleResult + ".");
					}
					AnnotationMemberKeyImpl.pattern_AnnotationMemberKey_29_6_perform_greenFBFFBBB(tAnnotation,
							mAnnotation, ruleResult, csp);
					//nothing TAnnotationValue tAnnotationValue = (TAnnotationValue) result6_green[0];
					//nothing AnnotationMemberValuePairToTAnnotationValue annotationMemberValuePairToTAnnotationValue = (AnnotationMemberValuePairToTAnnotationValue) result6_green[2];
					//nothing AnnotationMemberValuePair mValue = (AnnotationMemberValuePair) result6_green[3];

				} else {
				}

			} else {
			}

		}
		return AnnotationMemberKeyImpl.pattern_AnnotationMemberKey_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, TAnnotatable tOwner,
			BodyDeclaration mOwner, TAnnotation tAnnotation, AnnotationToTAnnotation annotationToTAnnotation,
			Annotation mAnnotation, ASTNodeToTAnnotatable ownerToWoner, ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables
		Variable var_mValue_name = CSPFactoryHelper.eINSTANCE.createVariable("mValue.name", csp);
		var_mValue_name.setType("String");
		Variable var_tAnnotationValue_tKey = CSPFactoryHelper.eINSTANCE.createVariable("tAnnotationValue.tKey", csp);
		var_tAnnotationValue_tKey.setType("String");

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_mValue_name, var_tAnnotationValue_tKey);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("tOwner", tOwner);
		isApplicableMatch.registerObject("mOwner", mOwner);
		isApplicableMatch.registerObject("tAnnotation", tAnnotation);
		isApplicableMatch.registerObject("annotationToTAnnotation", annotationToTAnnotation);
		isApplicableMatch.registerObject("mAnnotation", mAnnotation);
		isApplicableMatch.registerObject("ownerToWoner", ownerToWoner);
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
		case RulesPackage.ANNOTATION_MEMBER_KEY___IS_APPROPRIATE_FWD__MATCH_BODYDECLARATION_ANNOTATIONMEMBERVALUEPAIR_ANNOTATION:
			return isAppropriate_FWD((Match) arguments.get(0), (BodyDeclaration) arguments.get(1),
					(AnnotationMemberValuePair) arguments.get(2), (Annotation) arguments.get(3));
		case RulesPackage.ANNOTATION_MEMBER_KEY___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.ANNOTATION_MEMBER_KEY___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.ANNOTATION_MEMBER_KEY___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_BODYDECLARATION_ANNOTATIONMEMBERVALUEPAIR_ANNOTATION:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (BodyDeclaration) arguments.get(1),
					(AnnotationMemberValuePair) arguments.get(2), (Annotation) arguments.get(3));
			return null;
		case RulesPackage.ANNOTATION_MEMBER_KEY___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_BODYDECLARATION_ANNOTATIONMEMBERVALUEPAIR_ANNOTATION:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (BodyDeclaration) arguments.get(1),
					(AnnotationMemberValuePair) arguments.get(2), (Annotation) arguments.get(3));
		case RulesPackage.ANNOTATION_MEMBER_KEY___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.ANNOTATION_MEMBER_KEY___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_TANNOTATABLE_BODYDECLARATION_TANNOTATION_ANNOTATIONTOTANNOTATION_ANNOTATIONMEMBERVALUEPAIR_ANNOTATION_ASTNODETOTANNOTATABLE:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (TAnnotatable) arguments.get(1),
					(BodyDeclaration) arguments.get(2), (TAnnotation) arguments.get(3),
					(AnnotationToTAnnotation) arguments.get(4), (AnnotationMemberValuePair) arguments.get(5),
					(Annotation) arguments.get(6), (ASTNodeToTAnnotatable) arguments.get(7));
		case RulesPackage.ANNOTATION_MEMBER_KEY___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.ANNOTATION_MEMBER_KEY___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9));
			return null;
		case RulesPackage.ANNOTATION_MEMBER_KEY___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.ANNOTATION_MEMBER_KEY___IS_APPROPRIATE_BWD__MATCH_TANNOTATABLE_TANNOTATIONVALUE_TANNOTATION:
			return isAppropriate_BWD((Match) arguments.get(0), (TAnnotatable) arguments.get(1),
					(TAnnotationValue) arguments.get(2), (TAnnotation) arguments.get(3));
		case RulesPackage.ANNOTATION_MEMBER_KEY___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.ANNOTATION_MEMBER_KEY___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.ANNOTATION_MEMBER_KEY___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TANNOTATABLE_TANNOTATIONVALUE_TANNOTATION:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (TAnnotatable) arguments.get(1),
					(TAnnotationValue) arguments.get(2), (TAnnotation) arguments.get(3));
			return null;
		case RulesPackage.ANNOTATION_MEMBER_KEY___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TANNOTATABLE_TANNOTATIONVALUE_TANNOTATION:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (TAnnotatable) arguments.get(1),
					(TAnnotationValue) arguments.get(2), (TAnnotation) arguments.get(3));
		case RulesPackage.ANNOTATION_MEMBER_KEY___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.ANNOTATION_MEMBER_KEY___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_TANNOTATABLE_TANNOTATIONVALUE_BODYDECLARATION_TANNOTATION_ANNOTATIONTOTANNOTATION_ANNOTATION_ASTNODETOTANNOTATABLE:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (TAnnotatable) arguments.get(1),
					(TAnnotationValue) arguments.get(2), (BodyDeclaration) arguments.get(3),
					(TAnnotation) arguments.get(4), (AnnotationToTAnnotation) arguments.get(5),
					(Annotation) arguments.get(6), (ASTNodeToTAnnotatable) arguments.get(7));
		case RulesPackage.ANNOTATION_MEMBER_KEY___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.ANNOTATION_MEMBER_KEY___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9));
			return null;
		case RulesPackage.ANNOTATION_MEMBER_KEY___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.ANNOTATION_MEMBER_KEY___IS_APPROPRIATE_BWD_EMOFLON_EDGE_175__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_175((EMoflonEdge) arguments.get(0));
		case RulesPackage.ANNOTATION_MEMBER_KEY___IS_APPROPRIATE_FWD_EMOFLON_EDGE_180__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_180((EMoflonEdge) arguments.get(0));
		case RulesPackage.ANNOTATION_MEMBER_KEY___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.ANNOTATION_MEMBER_KEY___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.ANNOTATION_MEMBER_KEY___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.ANNOTATION_MEMBER_KEY___IS_APPLICABLE_SOLVE_CSP_CC__TANNOTATABLE_TANNOTATIONVALUE_BODYDECLARATION_TANNOTATION_ANNOTATIONMEMBERVALUEPAIR_ANNOTATION_MATCH_MATCH:
			return isApplicable_solveCsp_CC((TAnnotatable) arguments.get(0), (TAnnotationValue) arguments.get(1),
					(BodyDeclaration) arguments.get(2), (TAnnotation) arguments.get(3),
					(AnnotationMemberValuePair) arguments.get(4), (Annotation) arguments.get(5),
					(Match) arguments.get(6), (Match) arguments.get(7));
		case RulesPackage.ANNOTATION_MEMBER_KEY___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.ANNOTATION_MEMBER_KEY___CHECK_DEC_FWD__BODYDECLARATION_ANNOTATIONMEMBERVALUEPAIR_ANNOTATION:
			return checkDEC_FWD((BodyDeclaration) arguments.get(0), (AnnotationMemberValuePair) arguments.get(1),
					(Annotation) arguments.get(2));
		case RulesPackage.ANNOTATION_MEMBER_KEY___CHECK_DEC_BWD__TANNOTATABLE_TANNOTATIONVALUE_TANNOTATION:
			return checkDEC_BWD((TAnnotatable) arguments.get(0), (TAnnotationValue) arguments.get(1),
					(TAnnotation) arguments.get(2));
		case RulesPackage.ANNOTATION_MEMBER_KEY___GENERATE_MODEL__RULEENTRYCONTAINER_ANNOTATIONTOTANNOTATION:
			return generateModel((RuleEntryContainer) arguments.get(0), (AnnotationToTAnnotation) arguments.get(1));
		case RulesPackage.ANNOTATION_MEMBER_KEY___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_TANNOTATABLE_BODYDECLARATION_TANNOTATION_ANNOTATIONTOTANNOTATION_ANNOTATION_ASTNODETOTANNOTATABLE_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (TAnnotatable) arguments.get(1),
					(BodyDeclaration) arguments.get(2), (TAnnotation) arguments.get(3),
					(AnnotationToTAnnotation) arguments.get(4), (Annotation) arguments.get(5),
					(ASTNodeToTAnnotatable) arguments.get(6), (ModelgeneratorRuleResult) arguments.get(7));
		case RulesPackage.ANNOTATION_MEMBER_KEY___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_AnnotationMemberKey_0_1_initialbindings_blackBBBBB(AnnotationMemberKey _this,
			Match match, BodyDeclaration mOwner, AnnotationMemberValuePair mValue, Annotation mAnnotation) {
		return new Object[] { _this, match, mOwner, mValue, mAnnotation };
	}

	public static final Object[] pattern_AnnotationMemberKey_0_2_SolveCSP_bindingFBBBBB(AnnotationMemberKey _this,
			Match match, BodyDeclaration mOwner, AnnotationMemberValuePair mValue, Annotation mAnnotation) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, mOwner, mValue, mAnnotation);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, mOwner, mValue, mAnnotation };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberKey_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_AnnotationMemberKey_0_2_SolveCSP_bindingAndBlackFBBBBB(
			AnnotationMemberKey _this, Match match, BodyDeclaration mOwner, AnnotationMemberValuePair mValue,
			Annotation mAnnotation) {
		Object[] result_pattern_AnnotationMemberKey_0_2_SolveCSP_binding = pattern_AnnotationMemberKey_0_2_SolveCSP_bindingFBBBBB(
				_this, match, mOwner, mValue, mAnnotation);
		if (result_pattern_AnnotationMemberKey_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_AnnotationMemberKey_0_2_SolveCSP_binding[0];

			Object[] result_pattern_AnnotationMemberKey_0_2_SolveCSP_black = pattern_AnnotationMemberKey_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_AnnotationMemberKey_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, mOwner, mValue, mAnnotation };
			}
		}
		return null;
	}

	public static final boolean pattern_AnnotationMemberKey_0_3_CheckCSP_expressionFBB(AnnotationMemberKey _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AnnotationMemberKey_0_4_collectelementstobetranslated_blackBBBB(Match match,
			BodyDeclaration mOwner, AnnotationMemberValuePair mValue, Annotation mAnnotation) {
		return new Object[] { match, mOwner, mValue, mAnnotation };
	}

	public static final Object[] pattern_AnnotationMemberKey_0_4_collectelementstobetranslated_greenBBBF(Match match,
			AnnotationMemberValuePair mValue, Annotation mAnnotation) {
		EMoflonEdge mAnnotation__mValue____values = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(mValue);
		String mAnnotation__mValue____values_name_prime = "values";
		mAnnotation__mValue____values.setSrc(mAnnotation);
		mAnnotation__mValue____values.setTrg(mValue);
		match.getToBeTranslatedEdges().add(mAnnotation__mValue____values);
		mAnnotation__mValue____values.setName(mAnnotation__mValue____values_name_prime);
		return new Object[] { match, mValue, mAnnotation, mAnnotation__mValue____values };
	}

	public static final Object[] pattern_AnnotationMemberKey_0_5_collectcontextelements_blackBBBB(Match match,
			BodyDeclaration mOwner, AnnotationMemberValuePair mValue, Annotation mAnnotation) {
		return new Object[] { match, mOwner, mValue, mAnnotation };
	}

	public static final Object[] pattern_AnnotationMemberKey_0_5_collectcontextelements_greenBBBF(Match match,
			BodyDeclaration mOwner, Annotation mAnnotation) {
		EMoflonEdge mOwner__mAnnotation____annotations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(mOwner);
		match.getContextNodes().add(mAnnotation);
		String mOwner__mAnnotation____annotations_name_prime = "annotations";
		mOwner__mAnnotation____annotations.setSrc(mOwner);
		mOwner__mAnnotation____annotations.setTrg(mAnnotation);
		match.getContextEdges().add(mOwner__mAnnotation____annotations);
		mOwner__mAnnotation____annotations.setName(mOwner__mAnnotation____annotations_name_prime);
		return new Object[] { match, mOwner, mAnnotation, mOwner__mAnnotation____annotations };
	}

	public static final void pattern_AnnotationMemberKey_0_6_registerobjectstomatch_expressionBBBBB(
			AnnotationMemberKey _this, Match match, BodyDeclaration mOwner, AnnotationMemberValuePair mValue,
			Annotation mAnnotation) {
		_this.registerObjectsToMatch_FWD(match, mOwner, mValue, mAnnotation);

	}

	public static final boolean pattern_AnnotationMemberKey_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_AnnotationMemberKey_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_AnnotationMemberKey_1_1_performtransformation_bindingFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("tOwner");
		EObject _localVariable_1 = isApplicableMatch.getObject("mOwner");
		EObject _localVariable_2 = isApplicableMatch.getObject("tAnnotation");
		EObject _localVariable_3 = isApplicableMatch.getObject("annotationToTAnnotation");
		EObject _localVariable_4 = isApplicableMatch.getObject("mValue");
		EObject _localVariable_5 = isApplicableMatch.getObject("mAnnotation");
		EObject _localVariable_6 = isApplicableMatch.getObject("ownerToWoner");
		EObject tmpTOwner = _localVariable_0;
		EObject tmpMOwner = _localVariable_1;
		EObject tmpTAnnotation = _localVariable_2;
		EObject tmpAnnotationToTAnnotation = _localVariable_3;
		EObject tmpMValue = _localVariable_4;
		EObject tmpMAnnotation = _localVariable_5;
		EObject tmpOwnerToWoner = _localVariable_6;
		if (tmpTOwner instanceof TAnnotatable) {
			TAnnotatable tOwner = (TAnnotatable) tmpTOwner;
			if (tmpMOwner instanceof BodyDeclaration) {
				BodyDeclaration mOwner = (BodyDeclaration) tmpMOwner;
				if (tmpTAnnotation instanceof TAnnotation) {
					TAnnotation tAnnotation = (TAnnotation) tmpTAnnotation;
					if (tmpAnnotationToTAnnotation instanceof AnnotationToTAnnotation) {
						AnnotationToTAnnotation annotationToTAnnotation = (AnnotationToTAnnotation) tmpAnnotationToTAnnotation;
						if (tmpMValue instanceof AnnotationMemberValuePair) {
							AnnotationMemberValuePair mValue = (AnnotationMemberValuePair) tmpMValue;
							if (tmpMAnnotation instanceof Annotation) {
								Annotation mAnnotation = (Annotation) tmpMAnnotation;
								if (tmpOwnerToWoner instanceof ASTNodeToTAnnotatable) {
									ASTNodeToTAnnotatable ownerToWoner = (ASTNodeToTAnnotatable) tmpOwnerToWoner;
									return new Object[] { tOwner, mOwner, tAnnotation, annotationToTAnnotation, mValue,
											mAnnotation, ownerToWoner, isApplicableMatch };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberKey_1_1_performtransformation_blackBBBBBBBFBB(
			TAnnotatable tOwner, BodyDeclaration mOwner, TAnnotation tAnnotation,
			AnnotationToTAnnotation annotationToTAnnotation, AnnotationMemberValuePair mValue, Annotation mAnnotation,
			ASTNodeToTAnnotatable ownerToWoner, AnnotationMemberKey _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { tOwner, mOwner, tAnnotation, annotationToTAnnotation, mValue, mAnnotation,
						ownerToWoner, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberKey_1_1_performtransformation_bindingAndBlackFFFFFFFFBB(
			AnnotationMemberKey _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_AnnotationMemberKey_1_1_performtransformation_binding = pattern_AnnotationMemberKey_1_1_performtransformation_bindingFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_AnnotationMemberKey_1_1_performtransformation_binding != null) {
			TAnnotatable tOwner = (TAnnotatable) result_pattern_AnnotationMemberKey_1_1_performtransformation_binding[0];
			BodyDeclaration mOwner = (BodyDeclaration) result_pattern_AnnotationMemberKey_1_1_performtransformation_binding[1];
			TAnnotation tAnnotation = (TAnnotation) result_pattern_AnnotationMemberKey_1_1_performtransformation_binding[2];
			AnnotationToTAnnotation annotationToTAnnotation = (AnnotationToTAnnotation) result_pattern_AnnotationMemberKey_1_1_performtransformation_binding[3];
			AnnotationMemberValuePair mValue = (AnnotationMemberValuePair) result_pattern_AnnotationMemberKey_1_1_performtransformation_binding[4];
			Annotation mAnnotation = (Annotation) result_pattern_AnnotationMemberKey_1_1_performtransformation_binding[5];
			ASTNodeToTAnnotatable ownerToWoner = (ASTNodeToTAnnotatable) result_pattern_AnnotationMemberKey_1_1_performtransformation_binding[6];

			Object[] result_pattern_AnnotationMemberKey_1_1_performtransformation_black = pattern_AnnotationMemberKey_1_1_performtransformation_blackBBBBBBBFBB(
					tOwner, mOwner, tAnnotation, annotationToTAnnotation, mValue, mAnnotation, ownerToWoner, _this,
					isApplicableMatch);
			if (result_pattern_AnnotationMemberKey_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_AnnotationMemberKey_1_1_performtransformation_black[7];

				return new Object[] { tOwner, mOwner, tAnnotation, annotationToTAnnotation, mValue, mAnnotation,
						ownerToWoner, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberKey_1_1_performtransformation_greenFBFBB(
			TAnnotation tAnnotation, AnnotationMemberValuePair mValue, CSP csp) {
		TAnnotationValue tAnnotationValue = AnnotationsFactory.eINSTANCE.createTAnnotationValue();
		AnnotationMemberValuePairToTAnnotationValue annotationMemberValuePairToTAnnotationValue = ModiscoFactory.eINSTANCE
				.createAnnotationMemberValuePairToTAnnotationValue();
		Object _localVariable_0 = csp.getValue("tAnnotationValue", "tKey");
		tAnnotation.getTValues().add(tAnnotationValue);
		annotationMemberValuePairToTAnnotationValue.setTarget(tAnnotationValue);
		annotationMemberValuePairToTAnnotationValue.setSource(mValue);
		String tAnnotationValue_tKey_prime = (String) _localVariable_0;
		tAnnotationValue.setTKey(tAnnotationValue_tKey_prime);
		return new Object[] { tAnnotationValue, tAnnotation, annotationMemberValuePairToTAnnotationValue, mValue, csp };
	}

	public static final Object[] pattern_AnnotationMemberKey_1_2_collecttranslatedelements_blackBBB(
			TAnnotationValue tAnnotationValue,
			AnnotationMemberValuePairToTAnnotationValue annotationMemberValuePairToTAnnotationValue,
			AnnotationMemberValuePair mValue) {
		return new Object[] { tAnnotationValue, annotationMemberValuePairToTAnnotationValue, mValue };
	}

	public static final Object[] pattern_AnnotationMemberKey_1_2_collecttranslatedelements_greenFBBB(
			TAnnotationValue tAnnotationValue,
			AnnotationMemberValuePairToTAnnotationValue annotationMemberValuePairToTAnnotationValue,
			AnnotationMemberValuePair mValue) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(tAnnotationValue);
		ruleresult.getCreatedLinkElements().add(annotationMemberValuePairToTAnnotationValue);
		ruleresult.getTranslatedElements().add(mValue);
		return new Object[] { ruleresult, tAnnotationValue, annotationMemberValuePairToTAnnotationValue, mValue };
	}

	public static final Object[] pattern_AnnotationMemberKey_1_3_bookkeepingforedges_blackBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject tOwner, EObject tAnnotationValue, EObject mOwner, EObject tAnnotation,
			EObject annotationToTAnnotation, EObject annotationMemberValuePairToTAnnotationValue, EObject mValue,
			EObject mAnnotation, EObject ownerToWoner) {
		if (!tAnnotationValue.equals(tOwner)) {
			if (!mOwner.equals(tOwner)) {
				if (!mOwner.equals(tAnnotationValue)) {
					if (!mOwner.equals(tAnnotation)) {
						if (!mOwner.equals(mValue)) {
							if (!mOwner.equals(ownerToWoner)) {
								if (!tAnnotation.equals(tOwner)) {
									if (!tAnnotation.equals(tAnnotationValue)) {
										if (!annotationToTAnnotation.equals(tOwner)) {
											if (!annotationToTAnnotation.equals(tAnnotationValue)) {
												if (!annotationToTAnnotation.equals(mOwner)) {
													if (!annotationToTAnnotation.equals(tAnnotation)) {
														if (!annotationToTAnnotation.equals(mValue)) {
															if (!annotationToTAnnotation.equals(mAnnotation)) {
																if (!annotationToTAnnotation.equals(ownerToWoner)) {
																	if (!annotationMemberValuePairToTAnnotationValue
																			.equals(tOwner)) {
																		if (!annotationMemberValuePairToTAnnotationValue
																				.equals(tAnnotationValue)) {
																			if (!annotationMemberValuePairToTAnnotationValue
																					.equals(mOwner)) {
																				if (!annotationMemberValuePairToTAnnotationValue
																						.equals(tAnnotation)) {
																					if (!annotationMemberValuePairToTAnnotationValue
																							.equals(annotationToTAnnotation)) {
																						if (!annotationMemberValuePairToTAnnotationValue
																								.equals(mValue)) {
																							if (!annotationMemberValuePairToTAnnotationValue
																									.equals(mAnnotation)) {
																								if (!annotationMemberValuePairToTAnnotationValue
																										.equals(ownerToWoner)) {
																									if (!mValue.equals(
																											tOwner)) {
																										if (!mValue
																												.equals(tAnnotationValue)) {
																											if (!mValue
																													.equals(tAnnotation)) {
																												if (!mValue
																														.equals(ownerToWoner)) {
																													if (!mAnnotation
																															.equals(tOwner)) {
																														if (!mAnnotation
																																.equals(tAnnotationValue)) {
																															if (!mAnnotation
																																	.equals(mOwner)) {
																																if (!mAnnotation
																																		.equals(tAnnotation)) {
																																	if (!mAnnotation
																																			.equals(mValue)) {
																																		if (!mAnnotation
																																				.equals(ownerToWoner)) {
																																			if (!ownerToWoner
																																					.equals(tOwner)) {
																																				if (!ownerToWoner
																																						.equals(tAnnotationValue)) {
																																					if (!ownerToWoner
																																							.equals(tAnnotation)) {
																																						return new Object[] {
																																								ruleresult,
																																								tOwner,
																																								tAnnotationValue,
																																								mOwner,
																																								tAnnotation,
																																								annotationToTAnnotation,
																																								annotationMemberValuePairToTAnnotationValue,
																																								mValue,
																																								mAnnotation,
																																								ownerToWoner };
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_AnnotationMemberKey_1_3_bookkeepingforedges_greenBBBBBBFFFF(
			PerformRuleResult ruleresult, EObject tAnnotationValue, EObject tAnnotation,
			EObject annotationMemberValuePairToTAnnotationValue, EObject mValue, EObject mAnnotation) {
		EMoflonEdge tAnnotation__tAnnotationValue____tValues = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge annotationMemberValuePairToTAnnotationValue__tAnnotationValue____target = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge annotationMemberValuePairToTAnnotationValue__mValue____source = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge mAnnotation__mValue____values = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "AnnotationMemberKey";
		String tAnnotation__tAnnotationValue____tValues_name_prime = "tValues";
		String annotationMemberValuePairToTAnnotationValue__tAnnotationValue____target_name_prime = "target";
		String annotationMemberValuePairToTAnnotationValue__mValue____source_name_prime = "source";
		String mAnnotation__mValue____values_name_prime = "values";
		tAnnotation__tAnnotationValue____tValues.setSrc(tAnnotation);
		tAnnotation__tAnnotationValue____tValues.setTrg(tAnnotationValue);
		ruleresult.getCreatedEdges().add(tAnnotation__tAnnotationValue____tValues);
		annotationMemberValuePairToTAnnotationValue__tAnnotationValue____target
				.setSrc(annotationMemberValuePairToTAnnotationValue);
		annotationMemberValuePairToTAnnotationValue__tAnnotationValue____target.setTrg(tAnnotationValue);
		ruleresult.getCreatedEdges().add(annotationMemberValuePairToTAnnotationValue__tAnnotationValue____target);
		annotationMemberValuePairToTAnnotationValue__mValue____source
				.setSrc(annotationMemberValuePairToTAnnotationValue);
		annotationMemberValuePairToTAnnotationValue__mValue____source.setTrg(mValue);
		ruleresult.getCreatedEdges().add(annotationMemberValuePairToTAnnotationValue__mValue____source);
		mAnnotation__mValue____values.setSrc(mAnnotation);
		mAnnotation__mValue____values.setTrg(mValue);
		ruleresult.getTranslatedEdges().add(mAnnotation__mValue____values);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		tAnnotation__tAnnotationValue____tValues.setName(tAnnotation__tAnnotationValue____tValues_name_prime);
		annotationMemberValuePairToTAnnotationValue__tAnnotationValue____target
				.setName(annotationMemberValuePairToTAnnotationValue__tAnnotationValue____target_name_prime);
		annotationMemberValuePairToTAnnotationValue__mValue____source
				.setName(annotationMemberValuePairToTAnnotationValue__mValue____source_name_prime);
		mAnnotation__mValue____values.setName(mAnnotation__mValue____values_name_prime);
		return new Object[] { ruleresult, tAnnotationValue, tAnnotation, annotationMemberValuePairToTAnnotationValue,
				mValue, mAnnotation, tAnnotation__tAnnotationValue____tValues,
				annotationMemberValuePairToTAnnotationValue__tAnnotationValue____target,
				annotationMemberValuePairToTAnnotationValue__mValue____source, mAnnotation__mValue____values };
	}

	public static final void pattern_AnnotationMemberKey_1_5_registerobjects_expressionBBBBBBBBBBB(
			AnnotationMemberKey _this, PerformRuleResult ruleresult, EObject tOwner, EObject tAnnotationValue,
			EObject mOwner, EObject tAnnotation, EObject annotationToTAnnotation,
			EObject annotationMemberValuePairToTAnnotationValue, EObject mValue, EObject mAnnotation,
			EObject ownerToWoner) {
		_this.registerObjects_FWD(ruleresult, tOwner, tAnnotationValue, mOwner, tAnnotation, annotationToTAnnotation,
				annotationMemberValuePairToTAnnotationValue, mValue, mAnnotation, ownerToWoner);

	}

	public static final PerformRuleResult pattern_AnnotationMemberKey_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_AnnotationMemberKey_2_1_preparereturnvalue_bindingFB(
			AnnotationMemberKey _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberKey_2_1_preparereturnvalue_blackFBB(EClass eClass,
			AnnotationMemberKey _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberKey_2_1_preparereturnvalue_bindingAndBlackFFB(
			AnnotationMemberKey _this) {
		Object[] result_pattern_AnnotationMemberKey_2_1_preparereturnvalue_binding = pattern_AnnotationMemberKey_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_AnnotationMemberKey_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_AnnotationMemberKey_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_AnnotationMemberKey_2_1_preparereturnvalue_black = pattern_AnnotationMemberKey_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_AnnotationMemberKey_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_AnnotationMemberKey_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberKey_2_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "AnnotationMemberKey";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_AnnotationMemberKey_2_2_corematch_bindingFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("mOwner");
		EObject _localVariable_1 = match.getObject("mValue");
		EObject _localVariable_2 = match.getObject("mAnnotation");
		EObject tmpMOwner = _localVariable_0;
		EObject tmpMValue = _localVariable_1;
		EObject tmpMAnnotation = _localVariable_2;
		if (tmpMOwner instanceof BodyDeclaration) {
			BodyDeclaration mOwner = (BodyDeclaration) tmpMOwner;
			if (tmpMValue instanceof AnnotationMemberValuePair) {
				AnnotationMemberValuePair mValue = (AnnotationMemberValuePair) tmpMValue;
				if (tmpMAnnotation instanceof Annotation) {
					Annotation mAnnotation = (Annotation) tmpMAnnotation;
					return new Object[] { mOwner, mValue, mAnnotation, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_AnnotationMemberKey_2_2_corematch_blackFBFFBBFB(
			BodyDeclaration mOwner, AnnotationMemberValuePair mValue, Annotation mAnnotation, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (AnnotationToTAnnotation annotationToTAnnotation : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mAnnotation, AnnotationToTAnnotation.class, "source")) {
			TAnnotation tAnnotation = annotationToTAnnotation.getTarget();
			if (tAnnotation != null) {
				for (ASTNodeToTAnnotatable ownerToWoner : org.moflon.core.utilities.eMoflonEMFUtil
						.getOppositeReferenceTyped(mOwner, ASTNodeToTAnnotatable.class, "source")) {
					TAnnotatable tOwner = ownerToWoner.getTarget();
					if (tOwner != null) {
						_result.add(new Object[] { tOwner, mOwner, tAnnotation, annotationToTAnnotation, mValue,
								mAnnotation, ownerToWoner, match });
					}

				}
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_AnnotationMemberKey_2_3_findcontext_blackBBBBBBB(TAnnotatable tOwner,
			BodyDeclaration mOwner, TAnnotation tAnnotation, AnnotationToTAnnotation annotationToTAnnotation,
			AnnotationMemberValuePair mValue, Annotation mAnnotation, ASTNodeToTAnnotatable ownerToWoner) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (tOwner.getTAnnotation().contains(tAnnotation)) {
			if (mOwner.getAnnotations().contains(mAnnotation)) {
				if (tAnnotation.equals(annotationToTAnnotation.getTarget())) {
					if (mAnnotation.getValues().contains(mValue)) {
						if (mAnnotation.equals(annotationToTAnnotation.getSource())) {
							if (tOwner.equals(ownerToWoner.getTarget())) {
								if (mOwner.equals(ownerToWoner.getSource())) {
									_result.add(new Object[] { tOwner, mOwner, tAnnotation, annotationToTAnnotation,
											mValue, mAnnotation, ownerToWoner });
								}
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_AnnotationMemberKey_2_3_findcontext_greenBBBBBBBFFFFFFFFF(TAnnotatable tOwner,
			BodyDeclaration mOwner, TAnnotation tAnnotation, AnnotationToTAnnotation annotationToTAnnotation,
			AnnotationMemberValuePair mValue, Annotation mAnnotation, ASTNodeToTAnnotatable ownerToWoner) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge tOwner__tAnnotation____tAnnotation = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAnnotation__tOwner____tAnnotated = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mOwner__mAnnotation____annotations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge annotationToTAnnotation__tAnnotation____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mAnnotation__mValue____values = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge annotationToTAnnotation__mAnnotation____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge ownerToWoner__tOwner____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge ownerToWoner__mOwner____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String tOwner__tAnnotation____tAnnotation_name_prime = "tAnnotation";
		String tAnnotation__tOwner____tAnnotated_name_prime = "tAnnotated";
		String mOwner__mAnnotation____annotations_name_prime = "annotations";
		String annotationToTAnnotation__tAnnotation____target_name_prime = "target";
		String mAnnotation__mValue____values_name_prime = "values";
		String annotationToTAnnotation__mAnnotation____source_name_prime = "source";
		String ownerToWoner__tOwner____target_name_prime = "target";
		String ownerToWoner__mOwner____source_name_prime = "source";
		isApplicableMatch.getAllContextElements().add(tOwner);
		isApplicableMatch.getAllContextElements().add(mOwner);
		isApplicableMatch.getAllContextElements().add(tAnnotation);
		isApplicableMatch.getAllContextElements().add(annotationToTAnnotation);
		isApplicableMatch.getAllContextElements().add(mValue);
		isApplicableMatch.getAllContextElements().add(mAnnotation);
		isApplicableMatch.getAllContextElements().add(ownerToWoner);
		tOwner__tAnnotation____tAnnotation.setSrc(tOwner);
		tOwner__tAnnotation____tAnnotation.setTrg(tAnnotation);
		isApplicableMatch.getAllContextElements().add(tOwner__tAnnotation____tAnnotation);
		tAnnotation__tOwner____tAnnotated.setSrc(tAnnotation);
		tAnnotation__tOwner____tAnnotated.setTrg(tOwner);
		isApplicableMatch.getAllContextElements().add(tAnnotation__tOwner____tAnnotated);
		mOwner__mAnnotation____annotations.setSrc(mOwner);
		mOwner__mAnnotation____annotations.setTrg(mAnnotation);
		isApplicableMatch.getAllContextElements().add(mOwner__mAnnotation____annotations);
		annotationToTAnnotation__tAnnotation____target.setSrc(annotationToTAnnotation);
		annotationToTAnnotation__tAnnotation____target.setTrg(tAnnotation);
		isApplicableMatch.getAllContextElements().add(annotationToTAnnotation__tAnnotation____target);
		mAnnotation__mValue____values.setSrc(mAnnotation);
		mAnnotation__mValue____values.setTrg(mValue);
		isApplicableMatch.getAllContextElements().add(mAnnotation__mValue____values);
		annotationToTAnnotation__mAnnotation____source.setSrc(annotationToTAnnotation);
		annotationToTAnnotation__mAnnotation____source.setTrg(mAnnotation);
		isApplicableMatch.getAllContextElements().add(annotationToTAnnotation__mAnnotation____source);
		ownerToWoner__tOwner____target.setSrc(ownerToWoner);
		ownerToWoner__tOwner____target.setTrg(tOwner);
		isApplicableMatch.getAllContextElements().add(ownerToWoner__tOwner____target);
		ownerToWoner__mOwner____source.setSrc(ownerToWoner);
		ownerToWoner__mOwner____source.setTrg(mOwner);
		isApplicableMatch.getAllContextElements().add(ownerToWoner__mOwner____source);
		tOwner__tAnnotation____tAnnotation.setName(tOwner__tAnnotation____tAnnotation_name_prime);
		tAnnotation__tOwner____tAnnotated.setName(tAnnotation__tOwner____tAnnotated_name_prime);
		mOwner__mAnnotation____annotations.setName(mOwner__mAnnotation____annotations_name_prime);
		annotationToTAnnotation__tAnnotation____target
				.setName(annotationToTAnnotation__tAnnotation____target_name_prime);
		mAnnotation__mValue____values.setName(mAnnotation__mValue____values_name_prime);
		annotationToTAnnotation__mAnnotation____source
				.setName(annotationToTAnnotation__mAnnotation____source_name_prime);
		ownerToWoner__tOwner____target.setName(ownerToWoner__tOwner____target_name_prime);
		ownerToWoner__mOwner____source.setName(ownerToWoner__mOwner____source_name_prime);
		return new Object[] { tOwner, mOwner, tAnnotation, annotationToTAnnotation, mValue, mAnnotation, ownerToWoner,
				isApplicableMatch, tOwner__tAnnotation____tAnnotation, tAnnotation__tOwner____tAnnotated,
				mOwner__mAnnotation____annotations, annotationToTAnnotation__tAnnotation____target,
				mAnnotation__mValue____values, annotationToTAnnotation__mAnnotation____source,
				ownerToWoner__tOwner____target, ownerToWoner__mOwner____source };
	}

	public static final Object[] pattern_AnnotationMemberKey_2_4_solveCSP_bindingFBBBBBBBBB(AnnotationMemberKey _this,
			IsApplicableMatch isApplicableMatch, TAnnotatable tOwner, BodyDeclaration mOwner, TAnnotation tAnnotation,
			AnnotationToTAnnotation annotationToTAnnotation, AnnotationMemberValuePair mValue, Annotation mAnnotation,
			ASTNodeToTAnnotatable ownerToWoner) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, tOwner, mOwner, tAnnotation,
				annotationToTAnnotation, mValue, mAnnotation, ownerToWoner);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, tOwner, mOwner, tAnnotation, annotationToTAnnotation,
					mValue, mAnnotation, ownerToWoner };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberKey_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_AnnotationMemberKey_2_4_solveCSP_bindingAndBlackFBBBBBBBBB(
			AnnotationMemberKey _this, IsApplicableMatch isApplicableMatch, TAnnotatable tOwner, BodyDeclaration mOwner,
			TAnnotation tAnnotation, AnnotationToTAnnotation annotationToTAnnotation, AnnotationMemberValuePair mValue,
			Annotation mAnnotation, ASTNodeToTAnnotatable ownerToWoner) {
		Object[] result_pattern_AnnotationMemberKey_2_4_solveCSP_binding = pattern_AnnotationMemberKey_2_4_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, tOwner, mOwner, tAnnotation, annotationToTAnnotation, mValue, mAnnotation,
				ownerToWoner);
		if (result_pattern_AnnotationMemberKey_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_AnnotationMemberKey_2_4_solveCSP_binding[0];

			Object[] result_pattern_AnnotationMemberKey_2_4_solveCSP_black = pattern_AnnotationMemberKey_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_AnnotationMemberKey_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, tOwner, mOwner, tAnnotation,
						annotationToTAnnotation, mValue, mAnnotation, ownerToWoner };
			}
		}
		return null;
	}

	public static final boolean pattern_AnnotationMemberKey_2_5_checkCSP_expressionFBB(AnnotationMemberKey _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AnnotationMemberKey_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_AnnotationMemberKey_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "AnnotationMemberKey";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_AnnotationMemberKey_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_AnnotationMemberKey_10_1_initialbindings_blackBBBBB(AnnotationMemberKey _this,
			Match match, TAnnotatable tOwner, TAnnotationValue tAnnotationValue, TAnnotation tAnnotation) {
		return new Object[] { _this, match, tOwner, tAnnotationValue, tAnnotation };
	}

	public static final Object[] pattern_AnnotationMemberKey_10_2_SolveCSP_bindingFBBBBB(AnnotationMemberKey _this,
			Match match, TAnnotatable tOwner, TAnnotationValue tAnnotationValue, TAnnotation tAnnotation) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, tOwner, tAnnotationValue, tAnnotation);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, tOwner, tAnnotationValue, tAnnotation };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberKey_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_AnnotationMemberKey_10_2_SolveCSP_bindingAndBlackFBBBBB(
			AnnotationMemberKey _this, Match match, TAnnotatable tOwner, TAnnotationValue tAnnotationValue,
			TAnnotation tAnnotation) {
		Object[] result_pattern_AnnotationMemberKey_10_2_SolveCSP_binding = pattern_AnnotationMemberKey_10_2_SolveCSP_bindingFBBBBB(
				_this, match, tOwner, tAnnotationValue, tAnnotation);
		if (result_pattern_AnnotationMemberKey_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_AnnotationMemberKey_10_2_SolveCSP_binding[0];

			Object[] result_pattern_AnnotationMemberKey_10_2_SolveCSP_black = pattern_AnnotationMemberKey_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_AnnotationMemberKey_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, tOwner, tAnnotationValue, tAnnotation };
			}
		}
		return null;
	}

	public static final boolean pattern_AnnotationMemberKey_10_3_CheckCSP_expressionFBB(AnnotationMemberKey _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AnnotationMemberKey_10_4_collectelementstobetranslated_blackBBBB(Match match,
			TAnnotatable tOwner, TAnnotationValue tAnnotationValue, TAnnotation tAnnotation) {
		return new Object[] { match, tOwner, tAnnotationValue, tAnnotation };
	}

	public static final Object[] pattern_AnnotationMemberKey_10_4_collectelementstobetranslated_greenBBBF(Match match,
			TAnnotationValue tAnnotationValue, TAnnotation tAnnotation) {
		EMoflonEdge tAnnotation__tAnnotationValue____tValues = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(tAnnotationValue);
		String tAnnotation__tAnnotationValue____tValues_name_prime = "tValues";
		tAnnotation__tAnnotationValue____tValues.setSrc(tAnnotation);
		tAnnotation__tAnnotationValue____tValues.setTrg(tAnnotationValue);
		match.getToBeTranslatedEdges().add(tAnnotation__tAnnotationValue____tValues);
		tAnnotation__tAnnotationValue____tValues.setName(tAnnotation__tAnnotationValue____tValues_name_prime);
		return new Object[] { match, tAnnotationValue, tAnnotation, tAnnotation__tAnnotationValue____tValues };
	}

	public static final Object[] pattern_AnnotationMemberKey_10_5_collectcontextelements_blackBBBB(Match match,
			TAnnotatable tOwner, TAnnotationValue tAnnotationValue, TAnnotation tAnnotation) {
		return new Object[] { match, tOwner, tAnnotationValue, tAnnotation };
	}

	public static final Object[] pattern_AnnotationMemberKey_10_5_collectcontextelements_greenBBBFF(Match match,
			TAnnotatable tOwner, TAnnotation tAnnotation) {
		EMoflonEdge tOwner__tAnnotation____tAnnotation = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAnnotation__tOwner____tAnnotated = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(tOwner);
		match.getContextNodes().add(tAnnotation);
		String tOwner__tAnnotation____tAnnotation_name_prime = "tAnnotation";
		String tAnnotation__tOwner____tAnnotated_name_prime = "tAnnotated";
		tOwner__tAnnotation____tAnnotation.setSrc(tOwner);
		tOwner__tAnnotation____tAnnotation.setTrg(tAnnotation);
		match.getContextEdges().add(tOwner__tAnnotation____tAnnotation);
		tAnnotation__tOwner____tAnnotated.setSrc(tAnnotation);
		tAnnotation__tOwner____tAnnotated.setTrg(tOwner);
		match.getContextEdges().add(tAnnotation__tOwner____tAnnotated);
		tOwner__tAnnotation____tAnnotation.setName(tOwner__tAnnotation____tAnnotation_name_prime);
		tAnnotation__tOwner____tAnnotated.setName(tAnnotation__tOwner____tAnnotated_name_prime);
		return new Object[] { match, tOwner, tAnnotation, tOwner__tAnnotation____tAnnotation,
				tAnnotation__tOwner____tAnnotated };
	}

	public static final void pattern_AnnotationMemberKey_10_6_registerobjectstomatch_expressionBBBBB(
			AnnotationMemberKey _this, Match match, TAnnotatable tOwner, TAnnotationValue tAnnotationValue,
			TAnnotation tAnnotation) {
		_this.registerObjectsToMatch_BWD(match, tOwner, tAnnotationValue, tAnnotation);

	}

	public static final boolean pattern_AnnotationMemberKey_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_AnnotationMemberKey_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_AnnotationMemberKey_11_1_performtransformation_bindingFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("tOwner");
		EObject _localVariable_1 = isApplicableMatch.getObject("tAnnotationValue");
		EObject _localVariable_2 = isApplicableMatch.getObject("mOwner");
		EObject _localVariable_3 = isApplicableMatch.getObject("tAnnotation");
		EObject _localVariable_4 = isApplicableMatch.getObject("annotationToTAnnotation");
		EObject _localVariable_5 = isApplicableMatch.getObject("mAnnotation");
		EObject _localVariable_6 = isApplicableMatch.getObject("ownerToWoner");
		EObject tmpTOwner = _localVariable_0;
		EObject tmpTAnnotationValue = _localVariable_1;
		EObject tmpMOwner = _localVariable_2;
		EObject tmpTAnnotation = _localVariable_3;
		EObject tmpAnnotationToTAnnotation = _localVariable_4;
		EObject tmpMAnnotation = _localVariable_5;
		EObject tmpOwnerToWoner = _localVariable_6;
		if (tmpTOwner instanceof TAnnotatable) {
			TAnnotatable tOwner = (TAnnotatable) tmpTOwner;
			if (tmpTAnnotationValue instanceof TAnnotationValue) {
				TAnnotationValue tAnnotationValue = (TAnnotationValue) tmpTAnnotationValue;
				if (tmpMOwner instanceof BodyDeclaration) {
					BodyDeclaration mOwner = (BodyDeclaration) tmpMOwner;
					if (tmpTAnnotation instanceof TAnnotation) {
						TAnnotation tAnnotation = (TAnnotation) tmpTAnnotation;
						if (tmpAnnotationToTAnnotation instanceof AnnotationToTAnnotation) {
							AnnotationToTAnnotation annotationToTAnnotation = (AnnotationToTAnnotation) tmpAnnotationToTAnnotation;
							if (tmpMAnnotation instanceof Annotation) {
								Annotation mAnnotation = (Annotation) tmpMAnnotation;
								if (tmpOwnerToWoner instanceof ASTNodeToTAnnotatable) {
									ASTNodeToTAnnotatable ownerToWoner = (ASTNodeToTAnnotatable) tmpOwnerToWoner;
									return new Object[] { tOwner, tAnnotationValue, mOwner, tAnnotation,
											annotationToTAnnotation, mAnnotation, ownerToWoner, isApplicableMatch };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberKey_11_1_performtransformation_blackBBBBBBBFBB(
			TAnnotatable tOwner, TAnnotationValue tAnnotationValue, BodyDeclaration mOwner, TAnnotation tAnnotation,
			AnnotationToTAnnotation annotationToTAnnotation, Annotation mAnnotation, ASTNodeToTAnnotatable ownerToWoner,
			AnnotationMemberKey _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { tOwner, tAnnotationValue, mOwner, tAnnotation, annotationToTAnnotation,
						mAnnotation, ownerToWoner, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberKey_11_1_performtransformation_bindingAndBlackFFFFFFFFBB(
			AnnotationMemberKey _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_AnnotationMemberKey_11_1_performtransformation_binding = pattern_AnnotationMemberKey_11_1_performtransformation_bindingFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_AnnotationMemberKey_11_1_performtransformation_binding != null) {
			TAnnotatable tOwner = (TAnnotatable) result_pattern_AnnotationMemberKey_11_1_performtransformation_binding[0];
			TAnnotationValue tAnnotationValue = (TAnnotationValue) result_pattern_AnnotationMemberKey_11_1_performtransformation_binding[1];
			BodyDeclaration mOwner = (BodyDeclaration) result_pattern_AnnotationMemberKey_11_1_performtransformation_binding[2];
			TAnnotation tAnnotation = (TAnnotation) result_pattern_AnnotationMemberKey_11_1_performtransformation_binding[3];
			AnnotationToTAnnotation annotationToTAnnotation = (AnnotationToTAnnotation) result_pattern_AnnotationMemberKey_11_1_performtransformation_binding[4];
			Annotation mAnnotation = (Annotation) result_pattern_AnnotationMemberKey_11_1_performtransformation_binding[5];
			ASTNodeToTAnnotatable ownerToWoner = (ASTNodeToTAnnotatable) result_pattern_AnnotationMemberKey_11_1_performtransformation_binding[6];

			Object[] result_pattern_AnnotationMemberKey_11_1_performtransformation_black = pattern_AnnotationMemberKey_11_1_performtransformation_blackBBBBBBBFBB(
					tOwner, tAnnotationValue, mOwner, tAnnotation, annotationToTAnnotation, mAnnotation, ownerToWoner,
					_this, isApplicableMatch);
			if (result_pattern_AnnotationMemberKey_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_AnnotationMemberKey_11_1_performtransformation_black[7];

				return new Object[] { tOwner, tAnnotationValue, mOwner, tAnnotation, annotationToTAnnotation,
						mAnnotation, ownerToWoner, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberKey_11_1_performtransformation_greenBFFBB(
			TAnnotationValue tAnnotationValue, Annotation mAnnotation, CSP csp) {
		AnnotationMemberValuePairToTAnnotationValue annotationMemberValuePairToTAnnotationValue = ModiscoFactory.eINSTANCE
				.createAnnotationMemberValuePairToTAnnotationValue();
		AnnotationMemberValuePair mValue = JavaFactory.eINSTANCE.createAnnotationMemberValuePair();
		Object _localVariable_0 = csp.getValue("mValue", "name");
		annotationMemberValuePairToTAnnotationValue.setTarget(tAnnotationValue);
		annotationMemberValuePairToTAnnotationValue.setSource(mValue);
		mAnnotation.getValues().add(mValue);
		String mValue_name_prime = (String) _localVariable_0;
		mValue.setName(mValue_name_prime);
		return new Object[] { tAnnotationValue, annotationMemberValuePairToTAnnotationValue, mValue, mAnnotation, csp };
	}

	public static final Object[] pattern_AnnotationMemberKey_11_2_collecttranslatedelements_blackBBB(
			TAnnotationValue tAnnotationValue,
			AnnotationMemberValuePairToTAnnotationValue annotationMemberValuePairToTAnnotationValue,
			AnnotationMemberValuePair mValue) {
		return new Object[] { tAnnotationValue, annotationMemberValuePairToTAnnotationValue, mValue };
	}

	public static final Object[] pattern_AnnotationMemberKey_11_2_collecttranslatedelements_greenFBBB(
			TAnnotationValue tAnnotationValue,
			AnnotationMemberValuePairToTAnnotationValue annotationMemberValuePairToTAnnotationValue,
			AnnotationMemberValuePair mValue) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(tAnnotationValue);
		ruleresult.getCreatedLinkElements().add(annotationMemberValuePairToTAnnotationValue);
		ruleresult.getCreatedElements().add(mValue);
		return new Object[] { ruleresult, tAnnotationValue, annotationMemberValuePairToTAnnotationValue, mValue };
	}

	public static final Object[] pattern_AnnotationMemberKey_11_3_bookkeepingforedges_blackBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject tOwner, EObject tAnnotationValue, EObject mOwner, EObject tAnnotation,
			EObject annotationToTAnnotation, EObject annotationMemberValuePairToTAnnotationValue, EObject mValue,
			EObject mAnnotation, EObject ownerToWoner) {
		if (!tAnnotationValue.equals(tOwner)) {
			if (!mOwner.equals(tOwner)) {
				if (!mOwner.equals(tAnnotationValue)) {
					if (!mOwner.equals(tAnnotation)) {
						if (!mOwner.equals(mValue)) {
							if (!mOwner.equals(ownerToWoner)) {
								if (!tAnnotation.equals(tOwner)) {
									if (!tAnnotation.equals(tAnnotationValue)) {
										if (!annotationToTAnnotation.equals(tOwner)) {
											if (!annotationToTAnnotation.equals(tAnnotationValue)) {
												if (!annotationToTAnnotation.equals(mOwner)) {
													if (!annotationToTAnnotation.equals(tAnnotation)) {
														if (!annotationToTAnnotation.equals(mValue)) {
															if (!annotationToTAnnotation.equals(mAnnotation)) {
																if (!annotationToTAnnotation.equals(ownerToWoner)) {
																	if (!annotationMemberValuePairToTAnnotationValue
																			.equals(tOwner)) {
																		if (!annotationMemberValuePairToTAnnotationValue
																				.equals(tAnnotationValue)) {
																			if (!annotationMemberValuePairToTAnnotationValue
																					.equals(mOwner)) {
																				if (!annotationMemberValuePairToTAnnotationValue
																						.equals(tAnnotation)) {
																					if (!annotationMemberValuePairToTAnnotationValue
																							.equals(annotationToTAnnotation)) {
																						if (!annotationMemberValuePairToTAnnotationValue
																								.equals(mValue)) {
																							if (!annotationMemberValuePairToTAnnotationValue
																									.equals(mAnnotation)) {
																								if (!annotationMemberValuePairToTAnnotationValue
																										.equals(ownerToWoner)) {
																									if (!mValue.equals(
																											tOwner)) {
																										if (!mValue
																												.equals(tAnnotationValue)) {
																											if (!mValue
																													.equals(tAnnotation)) {
																												if (!mValue
																														.equals(ownerToWoner)) {
																													if (!mAnnotation
																															.equals(tOwner)) {
																														if (!mAnnotation
																																.equals(tAnnotationValue)) {
																															if (!mAnnotation
																																	.equals(mOwner)) {
																																if (!mAnnotation
																																		.equals(tAnnotation)) {
																																	if (!mAnnotation
																																			.equals(mValue)) {
																																		if (!mAnnotation
																																				.equals(ownerToWoner)) {
																																			if (!ownerToWoner
																																					.equals(tOwner)) {
																																				if (!ownerToWoner
																																						.equals(tAnnotationValue)) {
																																					if (!ownerToWoner
																																							.equals(tAnnotation)) {
																																						return new Object[] {
																																								ruleresult,
																																								tOwner,
																																								tAnnotationValue,
																																								mOwner,
																																								tAnnotation,
																																								annotationToTAnnotation,
																																								annotationMemberValuePairToTAnnotationValue,
																																								mValue,
																																								mAnnotation,
																																								ownerToWoner };
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_AnnotationMemberKey_11_3_bookkeepingforedges_greenBBBBBBFFFF(
			PerformRuleResult ruleresult, EObject tAnnotationValue, EObject tAnnotation,
			EObject annotationMemberValuePairToTAnnotationValue, EObject mValue, EObject mAnnotation) {
		EMoflonEdge tAnnotation__tAnnotationValue____tValues = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge annotationMemberValuePairToTAnnotationValue__tAnnotationValue____target = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge annotationMemberValuePairToTAnnotationValue__mValue____source = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge mAnnotation__mValue____values = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "AnnotationMemberKey";
		String tAnnotation__tAnnotationValue____tValues_name_prime = "tValues";
		String annotationMemberValuePairToTAnnotationValue__tAnnotationValue____target_name_prime = "target";
		String annotationMemberValuePairToTAnnotationValue__mValue____source_name_prime = "source";
		String mAnnotation__mValue____values_name_prime = "values";
		tAnnotation__tAnnotationValue____tValues.setSrc(tAnnotation);
		tAnnotation__tAnnotationValue____tValues.setTrg(tAnnotationValue);
		ruleresult.getTranslatedEdges().add(tAnnotation__tAnnotationValue____tValues);
		annotationMemberValuePairToTAnnotationValue__tAnnotationValue____target
				.setSrc(annotationMemberValuePairToTAnnotationValue);
		annotationMemberValuePairToTAnnotationValue__tAnnotationValue____target.setTrg(tAnnotationValue);
		ruleresult.getCreatedEdges().add(annotationMemberValuePairToTAnnotationValue__tAnnotationValue____target);
		annotationMemberValuePairToTAnnotationValue__mValue____source
				.setSrc(annotationMemberValuePairToTAnnotationValue);
		annotationMemberValuePairToTAnnotationValue__mValue____source.setTrg(mValue);
		ruleresult.getCreatedEdges().add(annotationMemberValuePairToTAnnotationValue__mValue____source);
		mAnnotation__mValue____values.setSrc(mAnnotation);
		mAnnotation__mValue____values.setTrg(mValue);
		ruleresult.getCreatedEdges().add(mAnnotation__mValue____values);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		tAnnotation__tAnnotationValue____tValues.setName(tAnnotation__tAnnotationValue____tValues_name_prime);
		annotationMemberValuePairToTAnnotationValue__tAnnotationValue____target
				.setName(annotationMemberValuePairToTAnnotationValue__tAnnotationValue____target_name_prime);
		annotationMemberValuePairToTAnnotationValue__mValue____source
				.setName(annotationMemberValuePairToTAnnotationValue__mValue____source_name_prime);
		mAnnotation__mValue____values.setName(mAnnotation__mValue____values_name_prime);
		return new Object[] { ruleresult, tAnnotationValue, tAnnotation, annotationMemberValuePairToTAnnotationValue,
				mValue, mAnnotation, tAnnotation__tAnnotationValue____tValues,
				annotationMemberValuePairToTAnnotationValue__tAnnotationValue____target,
				annotationMemberValuePairToTAnnotationValue__mValue____source, mAnnotation__mValue____values };
	}

	public static final void pattern_AnnotationMemberKey_11_5_registerobjects_expressionBBBBBBBBBBB(
			AnnotationMemberKey _this, PerformRuleResult ruleresult, EObject tOwner, EObject tAnnotationValue,
			EObject mOwner, EObject tAnnotation, EObject annotationToTAnnotation,
			EObject annotationMemberValuePairToTAnnotationValue, EObject mValue, EObject mAnnotation,
			EObject ownerToWoner) {
		_this.registerObjects_BWD(ruleresult, tOwner, tAnnotationValue, mOwner, tAnnotation, annotationToTAnnotation,
				annotationMemberValuePairToTAnnotationValue, mValue, mAnnotation, ownerToWoner);

	}

	public static final PerformRuleResult pattern_AnnotationMemberKey_11_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_AnnotationMemberKey_12_1_preparereturnvalue_bindingFB(
			AnnotationMemberKey _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberKey_12_1_preparereturnvalue_blackFBB(EClass eClass,
			AnnotationMemberKey _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberKey_12_1_preparereturnvalue_bindingAndBlackFFB(
			AnnotationMemberKey _this) {
		Object[] result_pattern_AnnotationMemberKey_12_1_preparereturnvalue_binding = pattern_AnnotationMemberKey_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_AnnotationMemberKey_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_AnnotationMemberKey_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_AnnotationMemberKey_12_1_preparereturnvalue_black = pattern_AnnotationMemberKey_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_AnnotationMemberKey_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_AnnotationMemberKey_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberKey_12_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "AnnotationMemberKey";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_AnnotationMemberKey_12_2_corematch_bindingFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("tOwner");
		EObject _localVariable_1 = match.getObject("tAnnotationValue");
		EObject _localVariable_2 = match.getObject("tAnnotation");
		EObject tmpTOwner = _localVariable_0;
		EObject tmpTAnnotationValue = _localVariable_1;
		EObject tmpTAnnotation = _localVariable_2;
		if (tmpTOwner instanceof TAnnotatable) {
			TAnnotatable tOwner = (TAnnotatable) tmpTOwner;
			if (tmpTAnnotationValue instanceof TAnnotationValue) {
				TAnnotationValue tAnnotationValue = (TAnnotationValue) tmpTAnnotationValue;
				if (tmpTAnnotation instanceof TAnnotation) {
					TAnnotation tAnnotation = (TAnnotation) tmpTAnnotation;
					return new Object[] { tOwner, tAnnotationValue, tAnnotation, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_AnnotationMemberKey_12_2_corematch_blackBBFBFFFB(TAnnotatable tOwner,
			TAnnotationValue tAnnotationValue, TAnnotation tAnnotation, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (AnnotationToTAnnotation annotationToTAnnotation : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tAnnotation, AnnotationToTAnnotation.class, "target")) {
			Annotation mAnnotation = annotationToTAnnotation.getSource();
			if (mAnnotation != null) {
				for (ASTNodeToTAnnotatable ownerToWoner : org.moflon.core.utilities.eMoflonEMFUtil
						.getOppositeReferenceTyped(tOwner, ASTNodeToTAnnotatable.class, "target")) {
					ASTNode tmpMOwner = ownerToWoner.getSource();
					if (tmpMOwner instanceof BodyDeclaration) {
						BodyDeclaration mOwner = (BodyDeclaration) tmpMOwner;
						_result.add(new Object[] { tOwner, tAnnotationValue, mOwner, tAnnotation,
								annotationToTAnnotation, mAnnotation, ownerToWoner, match });
					}

				}
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_AnnotationMemberKey_12_3_findcontext_blackBBBBBBB(
			TAnnotatable tOwner, TAnnotationValue tAnnotationValue, BodyDeclaration mOwner, TAnnotation tAnnotation,
			AnnotationToTAnnotation annotationToTAnnotation, Annotation mAnnotation,
			ASTNodeToTAnnotatable ownerToWoner) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (tOwner.getTAnnotation().contains(tAnnotation)) {
			if (mOwner.getAnnotations().contains(mAnnotation)) {
				if (tAnnotation.getTValues().contains(tAnnotationValue)) {
					if (tAnnotation.equals(annotationToTAnnotation.getTarget())) {
						if (mAnnotation.equals(annotationToTAnnotation.getSource())) {
							if (tOwner.equals(ownerToWoner.getTarget())) {
								if (mOwner.equals(ownerToWoner.getSource())) {
									_result.add(new Object[] { tOwner, tAnnotationValue, mOwner, tAnnotation,
											annotationToTAnnotation, mAnnotation, ownerToWoner });
								}
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_AnnotationMemberKey_12_3_findcontext_greenBBBBBBBFFFFFFFFF(TAnnotatable tOwner,
			TAnnotationValue tAnnotationValue, BodyDeclaration mOwner, TAnnotation tAnnotation,
			AnnotationToTAnnotation annotationToTAnnotation, Annotation mAnnotation,
			ASTNodeToTAnnotatable ownerToWoner) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge tOwner__tAnnotation____tAnnotation = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAnnotation__tOwner____tAnnotated = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mOwner__mAnnotation____annotations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAnnotation__tAnnotationValue____tValues = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge annotationToTAnnotation__tAnnotation____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge annotationToTAnnotation__mAnnotation____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge ownerToWoner__tOwner____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge ownerToWoner__mOwner____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String tOwner__tAnnotation____tAnnotation_name_prime = "tAnnotation";
		String tAnnotation__tOwner____tAnnotated_name_prime = "tAnnotated";
		String mOwner__mAnnotation____annotations_name_prime = "annotations";
		String tAnnotation__tAnnotationValue____tValues_name_prime = "tValues";
		String annotationToTAnnotation__tAnnotation____target_name_prime = "target";
		String annotationToTAnnotation__mAnnotation____source_name_prime = "source";
		String ownerToWoner__tOwner____target_name_prime = "target";
		String ownerToWoner__mOwner____source_name_prime = "source";
		isApplicableMatch.getAllContextElements().add(tOwner);
		isApplicableMatch.getAllContextElements().add(tAnnotationValue);
		isApplicableMatch.getAllContextElements().add(mOwner);
		isApplicableMatch.getAllContextElements().add(tAnnotation);
		isApplicableMatch.getAllContextElements().add(annotationToTAnnotation);
		isApplicableMatch.getAllContextElements().add(mAnnotation);
		isApplicableMatch.getAllContextElements().add(ownerToWoner);
		tOwner__tAnnotation____tAnnotation.setSrc(tOwner);
		tOwner__tAnnotation____tAnnotation.setTrg(tAnnotation);
		isApplicableMatch.getAllContextElements().add(tOwner__tAnnotation____tAnnotation);
		tAnnotation__tOwner____tAnnotated.setSrc(tAnnotation);
		tAnnotation__tOwner____tAnnotated.setTrg(tOwner);
		isApplicableMatch.getAllContextElements().add(tAnnotation__tOwner____tAnnotated);
		mOwner__mAnnotation____annotations.setSrc(mOwner);
		mOwner__mAnnotation____annotations.setTrg(mAnnotation);
		isApplicableMatch.getAllContextElements().add(mOwner__mAnnotation____annotations);
		tAnnotation__tAnnotationValue____tValues.setSrc(tAnnotation);
		tAnnotation__tAnnotationValue____tValues.setTrg(tAnnotationValue);
		isApplicableMatch.getAllContextElements().add(tAnnotation__tAnnotationValue____tValues);
		annotationToTAnnotation__tAnnotation____target.setSrc(annotationToTAnnotation);
		annotationToTAnnotation__tAnnotation____target.setTrg(tAnnotation);
		isApplicableMatch.getAllContextElements().add(annotationToTAnnotation__tAnnotation____target);
		annotationToTAnnotation__mAnnotation____source.setSrc(annotationToTAnnotation);
		annotationToTAnnotation__mAnnotation____source.setTrg(mAnnotation);
		isApplicableMatch.getAllContextElements().add(annotationToTAnnotation__mAnnotation____source);
		ownerToWoner__tOwner____target.setSrc(ownerToWoner);
		ownerToWoner__tOwner____target.setTrg(tOwner);
		isApplicableMatch.getAllContextElements().add(ownerToWoner__tOwner____target);
		ownerToWoner__mOwner____source.setSrc(ownerToWoner);
		ownerToWoner__mOwner____source.setTrg(mOwner);
		isApplicableMatch.getAllContextElements().add(ownerToWoner__mOwner____source);
		tOwner__tAnnotation____tAnnotation.setName(tOwner__tAnnotation____tAnnotation_name_prime);
		tAnnotation__tOwner____tAnnotated.setName(tAnnotation__tOwner____tAnnotated_name_prime);
		mOwner__mAnnotation____annotations.setName(mOwner__mAnnotation____annotations_name_prime);
		tAnnotation__tAnnotationValue____tValues.setName(tAnnotation__tAnnotationValue____tValues_name_prime);
		annotationToTAnnotation__tAnnotation____target
				.setName(annotationToTAnnotation__tAnnotation____target_name_prime);
		annotationToTAnnotation__mAnnotation____source
				.setName(annotationToTAnnotation__mAnnotation____source_name_prime);
		ownerToWoner__tOwner____target.setName(ownerToWoner__tOwner____target_name_prime);
		ownerToWoner__mOwner____source.setName(ownerToWoner__mOwner____source_name_prime);
		return new Object[] { tOwner, tAnnotationValue, mOwner, tAnnotation, annotationToTAnnotation, mAnnotation,
				ownerToWoner, isApplicableMatch, tOwner__tAnnotation____tAnnotation, tAnnotation__tOwner____tAnnotated,
				mOwner__mAnnotation____annotations, tAnnotation__tAnnotationValue____tValues,
				annotationToTAnnotation__tAnnotation____target, annotationToTAnnotation__mAnnotation____source,
				ownerToWoner__tOwner____target, ownerToWoner__mOwner____source };
	}

	public static final Object[] pattern_AnnotationMemberKey_12_4_solveCSP_bindingFBBBBBBBBB(AnnotationMemberKey _this,
			IsApplicableMatch isApplicableMatch, TAnnotatable tOwner, TAnnotationValue tAnnotationValue,
			BodyDeclaration mOwner, TAnnotation tAnnotation, AnnotationToTAnnotation annotationToTAnnotation,
			Annotation mAnnotation, ASTNodeToTAnnotatable ownerToWoner) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, tOwner, tAnnotationValue, mOwner,
				tAnnotation, annotationToTAnnotation, mAnnotation, ownerToWoner);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, tOwner, tAnnotationValue, mOwner, tAnnotation,
					annotationToTAnnotation, mAnnotation, ownerToWoner };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberKey_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_AnnotationMemberKey_12_4_solveCSP_bindingAndBlackFBBBBBBBBB(
			AnnotationMemberKey _this, IsApplicableMatch isApplicableMatch, TAnnotatable tOwner,
			TAnnotationValue tAnnotationValue, BodyDeclaration mOwner, TAnnotation tAnnotation,
			AnnotationToTAnnotation annotationToTAnnotation, Annotation mAnnotation,
			ASTNodeToTAnnotatable ownerToWoner) {
		Object[] result_pattern_AnnotationMemberKey_12_4_solveCSP_binding = pattern_AnnotationMemberKey_12_4_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, tOwner, tAnnotationValue, mOwner, tAnnotation, annotationToTAnnotation,
				mAnnotation, ownerToWoner);
		if (result_pattern_AnnotationMemberKey_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_AnnotationMemberKey_12_4_solveCSP_binding[0];

			Object[] result_pattern_AnnotationMemberKey_12_4_solveCSP_black = pattern_AnnotationMemberKey_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_AnnotationMemberKey_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, tOwner, tAnnotationValue, mOwner, tAnnotation,
						annotationToTAnnotation, mAnnotation, ownerToWoner };
			}
		}
		return null;
	}

	public static final boolean pattern_AnnotationMemberKey_12_5_checkCSP_expressionFBB(AnnotationMemberKey _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AnnotationMemberKey_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_AnnotationMemberKey_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "AnnotationMemberKey";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_AnnotationMemberKey_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_AnnotationMemberKey_20_1_preparereturnvalue_bindingFB(
			AnnotationMemberKey _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberKey_20_1_preparereturnvalue_blackFBBF(EClass __eClass,
			AnnotationMemberKey _this) {
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

	public static final Object[] pattern_AnnotationMemberKey_20_1_preparereturnvalue_bindingAndBlackFFBF(
			AnnotationMemberKey _this) {
		Object[] result_pattern_AnnotationMemberKey_20_1_preparereturnvalue_binding = pattern_AnnotationMemberKey_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_AnnotationMemberKey_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_AnnotationMemberKey_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_AnnotationMemberKey_20_1_preparereturnvalue_black = pattern_AnnotationMemberKey_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_AnnotationMemberKey_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_AnnotationMemberKey_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_AnnotationMemberKey_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberKey_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_AnnotationMemberKey_20_2_testcorematchandDECs_blackFFFB(
			EMoflonEdge _edge_tValues) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpTAnnotation = _edge_tValues.getSrc();
		if (tmpTAnnotation instanceof TAnnotation) {
			TAnnotation tAnnotation = (TAnnotation) tmpTAnnotation;
			EObject tmpTAnnotationValue = _edge_tValues.getTrg();
			if (tmpTAnnotationValue instanceof TAnnotationValue) {
				TAnnotationValue tAnnotationValue = (TAnnotationValue) tmpTAnnotationValue;
				if (tAnnotation.getTValues().contains(tAnnotationValue)) {
					TAnnotatable tOwner = tAnnotation.getTAnnotated();
					if (tOwner != null) {
						_result.add(new Object[] { tOwner, tAnnotationValue, tAnnotation, _edge_tValues });
					}

				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_AnnotationMemberKey_20_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_AnnotationMemberKey_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
			AnnotationMemberKey _this, Match match, TAnnotatable tOwner, TAnnotationValue tAnnotationValue,
			TAnnotation tAnnotation) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, tOwner, tAnnotationValue, tAnnotation);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_AnnotationMemberKey_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			AnnotationMemberKey _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AnnotationMemberKey_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberKey_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_AnnotationMemberKey_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_AnnotationMemberKey_21_1_preparereturnvalue_bindingFB(
			AnnotationMemberKey _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberKey_21_1_preparereturnvalue_blackFBBF(EClass __eClass,
			AnnotationMemberKey _this) {
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

	public static final Object[] pattern_AnnotationMemberKey_21_1_preparereturnvalue_bindingAndBlackFFBF(
			AnnotationMemberKey _this) {
		Object[] result_pattern_AnnotationMemberKey_21_1_preparereturnvalue_binding = pattern_AnnotationMemberKey_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_AnnotationMemberKey_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_AnnotationMemberKey_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_AnnotationMemberKey_21_1_preparereturnvalue_black = pattern_AnnotationMemberKey_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_AnnotationMemberKey_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_AnnotationMemberKey_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_AnnotationMemberKey_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberKey_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_AnnotationMemberKey_21_2_testcorematchandDECs_blackFFFB(
			EMoflonEdge _edge_values) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpMAnnotation = _edge_values.getSrc();
		if (tmpMAnnotation instanceof Annotation) {
			Annotation mAnnotation = (Annotation) tmpMAnnotation;
			EObject tmpMValue = _edge_values.getTrg();
			if (tmpMValue instanceof AnnotationMemberValuePair) {
				AnnotationMemberValuePair mValue = (AnnotationMemberValuePair) tmpMValue;
				if (mAnnotation.getValues().contains(mValue)) {
					for (BodyDeclaration mOwner : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(mAnnotation, BodyDeclaration.class, "annotations")) {
						_result.add(new Object[] { mOwner, mValue, mAnnotation, _edge_values });
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_AnnotationMemberKey_21_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_AnnotationMemberKey_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
			AnnotationMemberKey _this, Match match, BodyDeclaration mOwner, AnnotationMemberValuePair mValue,
			Annotation mAnnotation) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, mOwner, mValue, mAnnotation);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_AnnotationMemberKey_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			AnnotationMemberKey _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AnnotationMemberKey_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberKey_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_AnnotationMemberKey_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_AnnotationMemberKey_24_1_prepare_blackB(AnnotationMemberKey _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_AnnotationMemberKey_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_AnnotationMemberKey_24_2_matchsrctrgcontext_bindingFFFFFFBB(Match targetMatch,
			Match sourceMatch) {
		EObject _localVariable_0 = targetMatch.getObject("tOwner");
		EObject _localVariable_1 = targetMatch.getObject("tAnnotationValue");
		EObject _localVariable_2 = sourceMatch.getObject("mOwner");
		EObject _localVariable_3 = targetMatch.getObject("tAnnotation");
		EObject _localVariable_4 = sourceMatch.getObject("mValue");
		EObject _localVariable_5 = sourceMatch.getObject("mAnnotation");
		EObject tmpTOwner = _localVariable_0;
		EObject tmpTAnnotationValue = _localVariable_1;
		EObject tmpMOwner = _localVariable_2;
		EObject tmpTAnnotation = _localVariable_3;
		EObject tmpMValue = _localVariable_4;
		EObject tmpMAnnotation = _localVariable_5;
		if (tmpTOwner instanceof TAnnotatable) {
			TAnnotatable tOwner = (TAnnotatable) tmpTOwner;
			if (tmpTAnnotationValue instanceof TAnnotationValue) {
				TAnnotationValue tAnnotationValue = (TAnnotationValue) tmpTAnnotationValue;
				if (tmpMOwner instanceof BodyDeclaration) {
					BodyDeclaration mOwner = (BodyDeclaration) tmpMOwner;
					if (tmpTAnnotation instanceof TAnnotation) {
						TAnnotation tAnnotation = (TAnnotation) tmpTAnnotation;
						if (tmpMValue instanceof AnnotationMemberValuePair) {
							AnnotationMemberValuePair mValue = (AnnotationMemberValuePair) tmpMValue;
							if (tmpMAnnotation instanceof Annotation) {
								Annotation mAnnotation = (Annotation) tmpMAnnotation;
								return new Object[] { tOwner, tAnnotationValue, mOwner, tAnnotation, mValue,
										mAnnotation, targetMatch, sourceMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberKey_24_2_matchsrctrgcontext_blackBBBBBBBB(TAnnotatable tOwner,
			TAnnotationValue tAnnotationValue, BodyDeclaration mOwner, TAnnotation tAnnotation,
			AnnotationMemberValuePair mValue, Annotation mAnnotation, Match sourceMatch, Match targetMatch) {
		if (!sourceMatch.equals(targetMatch)) {
			return new Object[] { tOwner, tAnnotationValue, mOwner, tAnnotation, mValue, mAnnotation, sourceMatch,
					targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberKey_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_AnnotationMemberKey_24_2_matchsrctrgcontext_binding = pattern_AnnotationMemberKey_24_2_matchsrctrgcontext_bindingFFFFFFBB(
				targetMatch, sourceMatch);
		if (result_pattern_AnnotationMemberKey_24_2_matchsrctrgcontext_binding != null) {
			TAnnotatable tOwner = (TAnnotatable) result_pattern_AnnotationMemberKey_24_2_matchsrctrgcontext_binding[0];
			TAnnotationValue tAnnotationValue = (TAnnotationValue) result_pattern_AnnotationMemberKey_24_2_matchsrctrgcontext_binding[1];
			BodyDeclaration mOwner = (BodyDeclaration) result_pattern_AnnotationMemberKey_24_2_matchsrctrgcontext_binding[2];
			TAnnotation tAnnotation = (TAnnotation) result_pattern_AnnotationMemberKey_24_2_matchsrctrgcontext_binding[3];
			AnnotationMemberValuePair mValue = (AnnotationMemberValuePair) result_pattern_AnnotationMemberKey_24_2_matchsrctrgcontext_binding[4];
			Annotation mAnnotation = (Annotation) result_pattern_AnnotationMemberKey_24_2_matchsrctrgcontext_binding[5];

			Object[] result_pattern_AnnotationMemberKey_24_2_matchsrctrgcontext_black = pattern_AnnotationMemberKey_24_2_matchsrctrgcontext_blackBBBBBBBB(
					tOwner, tAnnotationValue, mOwner, tAnnotation, mValue, mAnnotation, sourceMatch, targetMatch);
			if (result_pattern_AnnotationMemberKey_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { tOwner, tAnnotationValue, mOwner, tAnnotation, mValue, mAnnotation, sourceMatch,
						targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberKey_24_3_solvecsp_bindingFBBBBBBBBB(AnnotationMemberKey _this,
			TAnnotatable tOwner, TAnnotationValue tAnnotationValue, BodyDeclaration mOwner, TAnnotation tAnnotation,
			AnnotationMemberValuePair mValue, Annotation mAnnotation, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_6 = _this.isApplicable_solveCsp_CC(tOwner, tAnnotationValue, mOwner, tAnnotation, mValue,
				mAnnotation, sourceMatch, targetMatch);
		CSP csp = _localVariable_6;
		if (csp != null) {
			return new Object[] { csp, _this, tOwner, tAnnotationValue, mOwner, tAnnotation, mValue, mAnnotation,
					sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberKey_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_AnnotationMemberKey_24_3_solvecsp_bindingAndBlackFBBBBBBBBB(
			AnnotationMemberKey _this, TAnnotatable tOwner, TAnnotationValue tAnnotationValue, BodyDeclaration mOwner,
			TAnnotation tAnnotation, AnnotationMemberValuePair mValue, Annotation mAnnotation, Match sourceMatch,
			Match targetMatch) {
		Object[] result_pattern_AnnotationMemberKey_24_3_solvecsp_binding = pattern_AnnotationMemberKey_24_3_solvecsp_bindingFBBBBBBBBB(
				_this, tOwner, tAnnotationValue, mOwner, tAnnotation, mValue, mAnnotation, sourceMatch, targetMatch);
		if (result_pattern_AnnotationMemberKey_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_AnnotationMemberKey_24_3_solvecsp_binding[0];

			Object[] result_pattern_AnnotationMemberKey_24_3_solvecsp_black = pattern_AnnotationMemberKey_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_AnnotationMemberKey_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, tOwner, tAnnotationValue, mOwner, tAnnotation, mValue, mAnnotation,
						sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_AnnotationMemberKey_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_AnnotationMemberKey_24_5_matchcorrcontext_blackBBBFBFBB(
			TAnnotatable tOwner, BodyDeclaration mOwner, TAnnotation tAnnotation, Annotation mAnnotation,
			Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (AnnotationToTAnnotation annotationToTAnnotation : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(tAnnotation, AnnotationToTAnnotation.class, "target")) {
				if (mAnnotation.equals(annotationToTAnnotation.getSource())) {
					for (ASTNodeToTAnnotatable ownerToWoner : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(tOwner, ASTNodeToTAnnotatable.class, "target")) {
						if (mOwner.equals(ownerToWoner.getSource())) {
							_result.add(new Object[] { tOwner, mOwner, tAnnotation, annotationToTAnnotation,
									mAnnotation, ownerToWoner, sourceMatch, targetMatch });
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_AnnotationMemberKey_24_5_matchcorrcontext_greenBBBBF(
			AnnotationToTAnnotation annotationToTAnnotation, ASTNodeToTAnnotatable ownerToWoner, Match sourceMatch,
			Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "AnnotationMemberKey";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(annotationToTAnnotation);
		ccMatch.getAllContextElements().add(ownerToWoner);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { annotationToTAnnotation, ownerToWoner, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_AnnotationMemberKey_24_6_createcorrespondence_blackBBBBBBB(TAnnotatable tOwner,
			TAnnotationValue tAnnotationValue, BodyDeclaration mOwner, TAnnotation tAnnotation,
			AnnotationMemberValuePair mValue, Annotation mAnnotation, CCMatch ccMatch) {
		return new Object[] { tOwner, tAnnotationValue, mOwner, tAnnotation, mValue, mAnnotation, ccMatch };
	}

	public static final Object[] pattern_AnnotationMemberKey_24_6_createcorrespondence_greenBFBB(
			TAnnotationValue tAnnotationValue, AnnotationMemberValuePair mValue, CCMatch ccMatch) {
		AnnotationMemberValuePairToTAnnotationValue annotationMemberValuePairToTAnnotationValue = ModiscoFactory.eINSTANCE
				.createAnnotationMemberValuePairToTAnnotationValue();
		annotationMemberValuePairToTAnnotationValue.setTarget(tAnnotationValue);
		annotationMemberValuePairToTAnnotationValue.setSource(mValue);
		ccMatch.getCreateCorr().add(annotationMemberValuePairToTAnnotationValue);
		return new Object[] { tAnnotationValue, annotationMemberValuePairToTAnnotationValue, mValue, ccMatch };
	}

	public static final Object[] pattern_AnnotationMemberKey_24_7_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_AnnotationMemberKey_24_7_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "AnnotationMemberKey";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_AnnotationMemberKey_24_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_AnnotationMemberKey_27_1_matchtggpattern_blackBBB(BodyDeclaration mOwner,
			AnnotationMemberValuePair mValue, Annotation mAnnotation) {
		if (mOwner.getAnnotations().contains(mAnnotation)) {
			if (mAnnotation.getValues().contains(mValue)) {
				return new Object[] { mOwner, mValue, mAnnotation };
			}
		}
		return null;
	}

	public static final boolean pattern_AnnotationMemberKey_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_AnnotationMemberKey_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_AnnotationMemberKey_28_1_matchtggpattern_blackBBB(TAnnotatable tOwner,
			TAnnotationValue tAnnotationValue, TAnnotation tAnnotation) {
		if (tOwner.getTAnnotation().contains(tAnnotation)) {
			if (tAnnotation.getTValues().contains(tAnnotationValue)) {
				return new Object[] { tOwner, tAnnotationValue, tAnnotation };
			}
		}
		return null;
	}

	public static final boolean pattern_AnnotationMemberKey_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_AnnotationMemberKey_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_AnnotationMemberKey_29_1_createresult_blackB(AnnotationMemberKey _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_AnnotationMemberKey_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_AnnotationMemberKey_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, TAnnotatable tOwner) {
		if (ruleResult.getTargetObjects().contains(tOwner)) {
			return new Object[] { ruleResult, tOwner };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberKey_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, TAnnotation tAnnotation) {
		if (ruleResult.getTargetObjects().contains(tAnnotation)) {
			return new Object[] { ruleResult, tAnnotation };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberKey_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, AnnotationToTAnnotation annotationToTAnnotation) {
		if (ruleResult.getCorrObjects().contains(annotationToTAnnotation)) {
			return new Object[] { ruleResult, annotationToTAnnotation };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberKey_29_2_isapplicablecore_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, Annotation mAnnotation) {
		if (ruleResult.getSourceObjects().contains(mAnnotation)) {
			return new Object[] { ruleResult, mAnnotation };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberKey_29_2_isapplicablecore_black_nac_4BB(
			ModelgeneratorRuleResult ruleResult, BodyDeclaration mOwner) {
		if (ruleResult.getSourceObjects().contains(mOwner)) {
			return new Object[] { ruleResult, mOwner };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberKey_29_2_isapplicablecore_black_nac_5BB(
			ModelgeneratorRuleResult ruleResult, ASTNodeToTAnnotatable ownerToWoner) {
		if (ruleResult.getCorrObjects().contains(ownerToWoner)) {
			return new Object[] { ruleResult, ownerToWoner };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_AnnotationMemberKey_29_2_isapplicablecore_blackFFFFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList annotationToTAnnotationList : ruleEntryContainer.getRuleEntryList()) {
			for (EObject tmpAnnotationToTAnnotation : annotationToTAnnotationList.getEntryObjects()) {
				if (tmpAnnotationToTAnnotation instanceof AnnotationToTAnnotation) {
					AnnotationToTAnnotation annotationToTAnnotation = (AnnotationToTAnnotation) tmpAnnotationToTAnnotation;
					TAnnotation tAnnotation = annotationToTAnnotation.getTarget();
					if (tAnnotation != null) {
						Annotation mAnnotation = annotationToTAnnotation.getSource();
						if (mAnnotation != null) {
							TAnnotatable tOwner = tAnnotation.getTAnnotated();
							if (tOwner != null) {
								if (pattern_AnnotationMemberKey_29_2_isapplicablecore_black_nac_2BB(ruleResult,
										annotationToTAnnotation) == null) {
									if (pattern_AnnotationMemberKey_29_2_isapplicablecore_black_nac_1BB(ruleResult,
											tAnnotation) == null) {
										if (pattern_AnnotationMemberKey_29_2_isapplicablecore_black_nac_3BB(ruleResult,
												mAnnotation) == null) {
											if (pattern_AnnotationMemberKey_29_2_isapplicablecore_black_nac_0BB(
													ruleResult, tOwner) == null) {
												for (BodyDeclaration mOwner : org.moflon.core.utilities.eMoflonEMFUtil
														.getOppositeReferenceTyped(mAnnotation, BodyDeclaration.class,
																"annotations")) {
													if (pattern_AnnotationMemberKey_29_2_isapplicablecore_black_nac_4BB(
															ruleResult, mOwner) == null) {
														for (ASTNodeToTAnnotatable ownerToWoner : org.moflon.core.utilities.eMoflonEMFUtil
																.getOppositeReferenceTyped(tOwner,
																		ASTNodeToTAnnotatable.class, "target")) {
															if (mOwner.equals(ownerToWoner.getSource())) {
																if (pattern_AnnotationMemberKey_29_2_isapplicablecore_black_nac_5BB(
																		ruleResult, ownerToWoner) == null) {
																	_result.add(new Object[] {
																			annotationToTAnnotationList, tOwner,
																			tAnnotation, annotationToTAnnotation,
																			mAnnotation, mOwner, ownerToWoner,
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
		return _result;
	}

	public static final Object[] pattern_AnnotationMemberKey_29_3_solveCSP_bindingFBBBBBBBBB(AnnotationMemberKey _this,
			IsApplicableMatch isApplicableMatch, TAnnotatable tOwner, BodyDeclaration mOwner, TAnnotation tAnnotation,
			AnnotationToTAnnotation annotationToTAnnotation, Annotation mAnnotation, ASTNodeToTAnnotatable ownerToWoner,
			ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, tOwner, mOwner, tAnnotation,
				annotationToTAnnotation, mAnnotation, ownerToWoner, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, tOwner, mOwner, tAnnotation, annotationToTAnnotation,
					mAnnotation, ownerToWoner, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberKey_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_AnnotationMemberKey_29_3_solveCSP_bindingAndBlackFBBBBBBBBB(
			AnnotationMemberKey _this, IsApplicableMatch isApplicableMatch, TAnnotatable tOwner, BodyDeclaration mOwner,
			TAnnotation tAnnotation, AnnotationToTAnnotation annotationToTAnnotation, Annotation mAnnotation,
			ASTNodeToTAnnotatable ownerToWoner, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_AnnotationMemberKey_29_3_solveCSP_binding = pattern_AnnotationMemberKey_29_3_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, tOwner, mOwner, tAnnotation, annotationToTAnnotation, mAnnotation,
				ownerToWoner, ruleResult);
		if (result_pattern_AnnotationMemberKey_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_AnnotationMemberKey_29_3_solveCSP_binding[0];

			Object[] result_pattern_AnnotationMemberKey_29_3_solveCSP_black = pattern_AnnotationMemberKey_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_AnnotationMemberKey_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, tOwner, mOwner, tAnnotation,
						annotationToTAnnotation, mAnnotation, ownerToWoner, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_AnnotationMemberKey_29_4_checkCSP_expressionFBB(AnnotationMemberKey _this,
			CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AnnotationMemberKey_29_5_checknacs_blackBBBBBB(TAnnotatable tOwner,
			BodyDeclaration mOwner, TAnnotation tAnnotation, AnnotationToTAnnotation annotationToTAnnotation,
			Annotation mAnnotation, ASTNodeToTAnnotatable ownerToWoner) {
		return new Object[] { tOwner, mOwner, tAnnotation, annotationToTAnnotation, mAnnotation, ownerToWoner };
	}

	public static final Object[] pattern_AnnotationMemberKey_29_6_perform_blackBBBBBBB(TAnnotatable tOwner,
			BodyDeclaration mOwner, TAnnotation tAnnotation, AnnotationToTAnnotation annotationToTAnnotation,
			Annotation mAnnotation, ASTNodeToTAnnotatable ownerToWoner, ModelgeneratorRuleResult ruleResult) {
		return new Object[] { tOwner, mOwner, tAnnotation, annotationToTAnnotation, mAnnotation, ownerToWoner,
				ruleResult };
	}

	public static final Object[] pattern_AnnotationMemberKey_29_6_perform_greenFBFFBBB(TAnnotation tAnnotation,
			Annotation mAnnotation, ModelgeneratorRuleResult ruleResult, CSP csp) {
		TAnnotationValue tAnnotationValue = AnnotationsFactory.eINSTANCE.createTAnnotationValue();
		AnnotationMemberValuePairToTAnnotationValue annotationMemberValuePairToTAnnotationValue = ModiscoFactory.eINSTANCE
				.createAnnotationMemberValuePairToTAnnotationValue();
		AnnotationMemberValuePair mValue = JavaFactory.eINSTANCE.createAnnotationMemberValuePair();
		Object _localVariable_0 = csp.getValue("tAnnotationValue", "tKey");
		Object _localVariable_1 = csp.getValue("mValue", "name");
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_2 = ruleResult.getIncrementedPerformCount();
		tAnnotation.getTValues().add(tAnnotationValue);
		ruleResult.getTargetObjects().add(tAnnotationValue);
		annotationMemberValuePairToTAnnotationValue.setTarget(tAnnotationValue);
		ruleResult.getCorrObjects().add(annotationMemberValuePairToTAnnotationValue);
		annotationMemberValuePairToTAnnotationValue.setSource(mValue);
		mAnnotation.getValues().add(mValue);
		ruleResult.getSourceObjects().add(mValue);
		String tAnnotationValue_tKey_prime = (String) _localVariable_0;
		String mValue_name_prime = (String) _localVariable_1;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_2);
		tAnnotationValue.setTKey(tAnnotationValue_tKey_prime);
		mValue.setName(mValue_name_prime);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { tAnnotationValue, tAnnotation, annotationMemberValuePairToTAnnotationValue, mValue,
				mAnnotation, ruleResult, csp };
	}

	public static final ModelgeneratorRuleResult pattern_AnnotationMemberKey_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //AnnotationMemberKeyImpl
