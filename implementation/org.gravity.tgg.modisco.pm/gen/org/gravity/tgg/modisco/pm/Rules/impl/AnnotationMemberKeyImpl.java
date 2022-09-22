/**
 */
package org.gravity.tgg.modisco.pm.Rules.impl;

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

import org.gravity.tgg.modisco.pm.ASTNodeToTAnnotatable;
import org.gravity.tgg.modisco.pm.AnnotationMemberValuePairToTAnnotationValue;
import org.gravity.tgg.modisco.pm.AnnotationToTAnnotation;
import org.gravity.tgg.modisco.pm.PmFactory;

import org.gravity.tgg.modisco.pm.Rules.AnnotationMemberKey;
import org.gravity.tgg.modisco.pm.Rules.RulesPackage;

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
	public boolean isAppropriate_FWD(Match match, AnnotationMemberValuePair mValue, Annotation mAnnotation,
			BodyDeclaration mOwner) {

		Object[] result1_black = AnnotationMemberKeyImpl
				.pattern_AnnotationMemberKey_0_1_initialbindings_blackBBBBB(this, match, mValue, mAnnotation, mOwner);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[mValue] = " + mValue + ", " + "[mAnnotation] = " + mAnnotation
					+ ", " + "[mOwner] = " + mOwner + ".");
		}

		Object[] result2_bindingAndBlack = AnnotationMemberKeyImpl
				.pattern_AnnotationMemberKey_0_2_SolveCSP_bindingAndBlackFBBBBB(this, match, mValue, mAnnotation,
						mOwner);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[mValue] = " + mValue + ", " + "[mAnnotation] = " + mAnnotation
					+ ", " + "[mOwner] = " + mOwner + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (AnnotationMemberKeyImpl.pattern_AnnotationMemberKey_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = AnnotationMemberKeyImpl
					.pattern_AnnotationMemberKey_0_4_collectelementstobetranslated_blackBBBB(match, mValue, mAnnotation,
							mOwner);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[mValue] = " + mValue + ", " + "[mAnnotation] = " + mAnnotation + ", " + "[mOwner] = "
						+ mOwner + ".");
			}
			AnnotationMemberKeyImpl.pattern_AnnotationMemberKey_0_4_collectelementstobetranslated_greenBBBF(match,
					mValue, mAnnotation);
			//nothing EMoflonEdge mAnnotation__mValue____values = (EMoflonEdge) result4_green[3];

			Object[] result5_black = AnnotationMemberKeyImpl
					.pattern_AnnotationMemberKey_0_5_collectcontextelements_blackBBBB(match, mValue, mAnnotation,
							mOwner);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[mValue] = " + mValue + ", " + "[mAnnotation] = " + mAnnotation + ", " + "[mOwner] = "
						+ mOwner + ".");
			}
			AnnotationMemberKeyImpl.pattern_AnnotationMemberKey_0_5_collectcontextelements_greenBBBF(match, mAnnotation,
					mOwner);
			//nothing EMoflonEdge mOwner__mAnnotation____annotations = (EMoflonEdge) result5_green[3];

			// 
			AnnotationMemberKeyImpl.pattern_AnnotationMemberKey_0_6_registerobjectstomatch_expressionBBBBB(this, match,
					mValue, mAnnotation, mOwner);
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
		ASTNodeToTAnnotatable ownerToWoner = (ASTNodeToTAnnotatable) result1_bindingAndBlack[0];
		AnnotationMemberValuePair mValue = (AnnotationMemberValuePair) result1_bindingAndBlack[1];
		Annotation mAnnotation = (Annotation) result1_bindingAndBlack[2];
		AnnotationToTAnnotation annotationToTAnnotation = (AnnotationToTAnnotation) result1_bindingAndBlack[3];
		TAnnotation tAnnotation = (TAnnotation) result1_bindingAndBlack[4];
		TAnnotatable tOwner = (TAnnotatable) result1_bindingAndBlack[5];
		BodyDeclaration mOwner = (BodyDeclaration) result1_bindingAndBlack[6];
		CSP csp = (CSP) result1_bindingAndBlack[7];
		Object[] result1_green = AnnotationMemberKeyImpl
				.pattern_AnnotationMemberKey_1_1_performtransformation_greenBFBFB(mValue, tAnnotation, csp);
		TAnnotationValue tAnnotationValue = (TAnnotationValue) result1_green[1];
		AnnotationMemberValuePairToTAnnotationValue annotationMemberValuePairToTAnnotationValue = (AnnotationMemberValuePairToTAnnotationValue) result1_green[3];

		Object[] result2_black = AnnotationMemberKeyImpl
				.pattern_AnnotationMemberKey_1_2_collecttranslatedelements_blackBBB(mValue, tAnnotationValue,
						annotationMemberValuePairToTAnnotationValue);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[mValue] = " + mValue + ", "
					+ "[tAnnotationValue] = " + tAnnotationValue + ", "
					+ "[annotationMemberValuePairToTAnnotationValue] = " + annotationMemberValuePairToTAnnotationValue
					+ ".");
		}
		Object[] result2_green = AnnotationMemberKeyImpl
				.pattern_AnnotationMemberKey_1_2_collecttranslatedelements_greenFBBB(mValue, tAnnotationValue,
						annotationMemberValuePairToTAnnotationValue);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = AnnotationMemberKeyImpl
				.pattern_AnnotationMemberKey_1_3_bookkeepingforedges_blackBBBBBBBBBB(ruleresult, ownerToWoner, mValue,
						mAnnotation, annotationToTAnnotation, tAnnotationValue, tAnnotation,
						annotationMemberValuePairToTAnnotationValue, tOwner, mOwner);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[ownerToWoner] = " + ownerToWoner + ", " + "[mValue] = " + mValue + ", "
					+ "[mAnnotation] = " + mAnnotation + ", " + "[annotationToTAnnotation] = " + annotationToTAnnotation
					+ ", " + "[tAnnotationValue] = " + tAnnotationValue + ", " + "[tAnnotation] = " + tAnnotation + ", "
					+ "[annotationMemberValuePairToTAnnotationValue] = " + annotationMemberValuePairToTAnnotationValue
					+ ", " + "[tOwner] = " + tOwner + ", " + "[mOwner] = " + mOwner + ".");
		}
		AnnotationMemberKeyImpl.pattern_AnnotationMemberKey_1_3_bookkeepingforedges_greenBBBBBBFFFF(ruleresult, mValue,
				mAnnotation, tAnnotationValue, tAnnotation, annotationMemberValuePairToTAnnotationValue);
		//nothing EMoflonEdge mAnnotation__mValue____values = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge annotationMemberValuePairToTAnnotationValue__tAnnotationValue____target = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge annotationMemberValuePairToTAnnotationValue__mValue____source = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge tAnnotation__tAnnotationValue____tValues = (EMoflonEdge) result3_green[9];

		// 
		// 
		AnnotationMemberKeyImpl.pattern_AnnotationMemberKey_1_5_registerobjects_expressionBBBBBBBBBBB(this, ruleresult,
				ownerToWoner, mValue, mAnnotation, annotationToTAnnotation, tAnnotationValue, tAnnotation,
				annotationMemberValuePairToTAnnotationValue, tOwner, mOwner);
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
		AnnotationMemberValuePair mValue = (AnnotationMemberValuePair) result2_binding[0];
		Annotation mAnnotation = (Annotation) result2_binding[1];
		BodyDeclaration mOwner = (BodyDeclaration) result2_binding[2];
		for (Object[] result2_black : AnnotationMemberKeyImpl
				.pattern_AnnotationMemberKey_2_2_corematch_blackFBBFFFBB(mValue, mAnnotation, mOwner, match)) {
			ASTNodeToTAnnotatable ownerToWoner = (ASTNodeToTAnnotatable) result2_black[0];
			AnnotationToTAnnotation annotationToTAnnotation = (AnnotationToTAnnotation) result2_black[3];
			TAnnotation tAnnotation = (TAnnotation) result2_black[4];
			TAnnotatable tOwner = (TAnnotatable) result2_black[5];
			// ForEach 
			for (Object[] result3_black : AnnotationMemberKeyImpl
					.pattern_AnnotationMemberKey_2_3_findcontext_blackBBBBBBB(ownerToWoner, mValue, mAnnotation,
							annotationToTAnnotation, tAnnotation, tOwner, mOwner)) {
				Object[] result3_green = AnnotationMemberKeyImpl
						.pattern_AnnotationMemberKey_2_3_findcontext_greenBBBBBBBFFFFFFFFF(ownerToWoner, mValue,
								mAnnotation, annotationToTAnnotation, tAnnotation, tOwner, mOwner);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[7];
				//nothing EMoflonEdge annotationToTAnnotation__tAnnotation____target = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge mAnnotation__mValue____values = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge annotationToTAnnotation__mAnnotation____source = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge tOwner__tAnnotation____tAnnotation = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge tAnnotation__tOwner____tAnnotated = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge mOwner__mAnnotation____annotations = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge ownerToWoner__mOwner____source = (EMoflonEdge) result3_green[14];
				//nothing EMoflonEdge ownerToWoner__tOwner____target = (EMoflonEdge) result3_green[15];

				Object[] result4_bindingAndBlack = AnnotationMemberKeyImpl
						.pattern_AnnotationMemberKey_2_4_solveCSP_bindingAndBlackFBBBBBBBBB(this, isApplicableMatch,
								ownerToWoner, mValue, mAnnotation, annotationToTAnnotation, tAnnotation, tOwner,
								mOwner);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[ownerToWoner] = " + ownerToWoner
							+ ", " + "[mValue] = " + mValue + ", " + "[mAnnotation] = " + mAnnotation + ", "
							+ "[annotationToTAnnotation] = " + annotationToTAnnotation + ", " + "[tAnnotation] = "
							+ tAnnotation + ", " + "[tOwner] = " + tOwner + ", " + "[mOwner] = " + mOwner + ".");
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
	public void registerObjectsToMatch_FWD(Match match, AnnotationMemberValuePair mValue, Annotation mAnnotation,
			BodyDeclaration mOwner) {
		match.registerObject("mValue", mValue);
		match.registerObject("mAnnotation", mAnnotation);
		match.registerObject("mOwner", mOwner);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, AnnotationMemberValuePair mValue, Annotation mAnnotation,
			BodyDeclaration mOwner) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, ASTNodeToTAnnotatable ownerToWoner,
			AnnotationMemberValuePair mValue, Annotation mAnnotation, AnnotationToTAnnotation annotationToTAnnotation,
			TAnnotation tAnnotation, TAnnotatable tOwner, BodyDeclaration mOwner) {// Create CSP
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
		isApplicableMatch.registerObject("ownerToWoner", ownerToWoner);
		isApplicableMatch.registerObject("mValue", mValue);
		isApplicableMatch.registerObject("mAnnotation", mAnnotation);
		isApplicableMatch.registerObject("annotationToTAnnotation", annotationToTAnnotation);
		isApplicableMatch.registerObject("tAnnotation", tAnnotation);
		isApplicableMatch.registerObject("tOwner", tOwner);
		isApplicableMatch.registerObject("mOwner", mOwner);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject ownerToWoner, EObject mValue,
			EObject mAnnotation, EObject annotationToTAnnotation, EObject tAnnotationValue, EObject tAnnotation,
			EObject annotationMemberValuePairToTAnnotationValue, EObject tOwner, EObject mOwner) {
		ruleresult.registerObject("ownerToWoner", ownerToWoner);
		ruleresult.registerObject("mValue", mValue);
		ruleresult.registerObject("mAnnotation", mAnnotation);
		ruleresult.registerObject("annotationToTAnnotation", annotationToTAnnotation);
		ruleresult.registerObject("tAnnotationValue", tAnnotationValue);
		ruleresult.registerObject("tAnnotation", tAnnotation);
		ruleresult.registerObject("annotationMemberValuePairToTAnnotationValue",
				annotationMemberValuePairToTAnnotationValue);
		ruleresult.registerObject("tOwner", tOwner);
		ruleresult.registerObject("mOwner", mOwner);

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
	public boolean isAppropriate_BWD(Match match, TAnnotationValue tAnnotationValue, TAnnotation tAnnotation,
			TAnnotatable tOwner) {

		Object[] result1_black = AnnotationMemberKeyImpl.pattern_AnnotationMemberKey_10_1_initialbindings_blackBBBBB(
				this, match, tAnnotationValue, tAnnotation, tOwner);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[tAnnotationValue] = " + tAnnotationValue + ", "
					+ "[tAnnotation] = " + tAnnotation + ", " + "[tOwner] = " + tOwner + ".");
		}

		Object[] result2_bindingAndBlack = AnnotationMemberKeyImpl
				.pattern_AnnotationMemberKey_10_2_SolveCSP_bindingAndBlackFBBBBB(this, match, tAnnotationValue,
						tAnnotation, tOwner);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[tAnnotationValue] = " + tAnnotationValue + ", "
					+ "[tAnnotation] = " + tAnnotation + ", " + "[tOwner] = " + tOwner + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (AnnotationMemberKeyImpl.pattern_AnnotationMemberKey_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = AnnotationMemberKeyImpl
					.pattern_AnnotationMemberKey_10_4_collectelementstobetranslated_blackBBBB(match, tAnnotationValue,
							tAnnotation, tOwner);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[tAnnotationValue] = " + tAnnotationValue + ", " + "[tAnnotation] = " + tAnnotation + ", "
						+ "[tOwner] = " + tOwner + ".");
			}
			AnnotationMemberKeyImpl.pattern_AnnotationMemberKey_10_4_collectelementstobetranslated_greenBBBF(match,
					tAnnotationValue, tAnnotation);
			//nothing EMoflonEdge tAnnotation__tAnnotationValue____tValues = (EMoflonEdge) result4_green[3];

			Object[] result5_black = AnnotationMemberKeyImpl
					.pattern_AnnotationMemberKey_10_5_collectcontextelements_blackBBBB(match, tAnnotationValue,
							tAnnotation, tOwner);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[tAnnotationValue] = " + tAnnotationValue + ", " + "[tAnnotation] = " + tAnnotation + ", "
						+ "[tOwner] = " + tOwner + ".");
			}
			AnnotationMemberKeyImpl.pattern_AnnotationMemberKey_10_5_collectcontextelements_greenBBBFF(match,
					tAnnotation, tOwner);
			//nothing EMoflonEdge tOwner__tAnnotation____tAnnotation = (EMoflonEdge) result5_green[3];
			//nothing EMoflonEdge tAnnotation__tOwner____tAnnotated = (EMoflonEdge) result5_green[4];

			// 
			AnnotationMemberKeyImpl.pattern_AnnotationMemberKey_10_6_registerobjectstomatch_expressionBBBBB(this, match,
					tAnnotationValue, tAnnotation, tOwner);
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
		ASTNodeToTAnnotatable ownerToWoner = (ASTNodeToTAnnotatable) result1_bindingAndBlack[0];
		Annotation mAnnotation = (Annotation) result1_bindingAndBlack[1];
		AnnotationToTAnnotation annotationToTAnnotation = (AnnotationToTAnnotation) result1_bindingAndBlack[2];
		TAnnotationValue tAnnotationValue = (TAnnotationValue) result1_bindingAndBlack[3];
		TAnnotation tAnnotation = (TAnnotation) result1_bindingAndBlack[4];
		TAnnotatable tOwner = (TAnnotatable) result1_bindingAndBlack[5];
		BodyDeclaration mOwner = (BodyDeclaration) result1_bindingAndBlack[6];
		CSP csp = (CSP) result1_bindingAndBlack[7];
		Object[] result1_green = AnnotationMemberKeyImpl
				.pattern_AnnotationMemberKey_11_1_performtransformation_greenFBBFB(mAnnotation, tAnnotationValue, csp);
		AnnotationMemberValuePair mValue = (AnnotationMemberValuePair) result1_green[0];
		AnnotationMemberValuePairToTAnnotationValue annotationMemberValuePairToTAnnotationValue = (AnnotationMemberValuePairToTAnnotationValue) result1_green[3];

		Object[] result2_black = AnnotationMemberKeyImpl
				.pattern_AnnotationMemberKey_11_2_collecttranslatedelements_blackBBB(mValue, tAnnotationValue,
						annotationMemberValuePairToTAnnotationValue);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[mValue] = " + mValue + ", "
					+ "[tAnnotationValue] = " + tAnnotationValue + ", "
					+ "[annotationMemberValuePairToTAnnotationValue] = " + annotationMemberValuePairToTAnnotationValue
					+ ".");
		}
		Object[] result2_green = AnnotationMemberKeyImpl
				.pattern_AnnotationMemberKey_11_2_collecttranslatedelements_greenFBBB(mValue, tAnnotationValue,
						annotationMemberValuePairToTAnnotationValue);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = AnnotationMemberKeyImpl
				.pattern_AnnotationMemberKey_11_3_bookkeepingforedges_blackBBBBBBBBBB(ruleresult, ownerToWoner, mValue,
						mAnnotation, annotationToTAnnotation, tAnnotationValue, tAnnotation,
						annotationMemberValuePairToTAnnotationValue, tOwner, mOwner);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[ownerToWoner] = " + ownerToWoner + ", " + "[mValue] = " + mValue + ", "
					+ "[mAnnotation] = " + mAnnotation + ", " + "[annotationToTAnnotation] = " + annotationToTAnnotation
					+ ", " + "[tAnnotationValue] = " + tAnnotationValue + ", " + "[tAnnotation] = " + tAnnotation + ", "
					+ "[annotationMemberValuePairToTAnnotationValue] = " + annotationMemberValuePairToTAnnotationValue
					+ ", " + "[tOwner] = " + tOwner + ", " + "[mOwner] = " + mOwner + ".");
		}
		AnnotationMemberKeyImpl.pattern_AnnotationMemberKey_11_3_bookkeepingforedges_greenBBBBBBFFFF(ruleresult, mValue,
				mAnnotation, tAnnotationValue, tAnnotation, annotationMemberValuePairToTAnnotationValue);
		//nothing EMoflonEdge mAnnotation__mValue____values = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge annotationMemberValuePairToTAnnotationValue__tAnnotationValue____target = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge annotationMemberValuePairToTAnnotationValue__mValue____source = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge tAnnotation__tAnnotationValue____tValues = (EMoflonEdge) result3_green[9];

		// 
		// 
		AnnotationMemberKeyImpl.pattern_AnnotationMemberKey_11_5_registerobjects_expressionBBBBBBBBBBB(this, ruleresult,
				ownerToWoner, mValue, mAnnotation, annotationToTAnnotation, tAnnotationValue, tAnnotation,
				annotationMemberValuePairToTAnnotationValue, tOwner, mOwner);
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
		TAnnotationValue tAnnotationValue = (TAnnotationValue) result2_binding[0];
		TAnnotation tAnnotation = (TAnnotation) result2_binding[1];
		TAnnotatable tOwner = (TAnnotatable) result2_binding[2];
		for (Object[] result2_black : AnnotationMemberKeyImpl.pattern_AnnotationMemberKey_12_2_corematch_blackFFFBBBFB(
				tAnnotationValue, tAnnotation, tOwner, match)) {
			ASTNodeToTAnnotatable ownerToWoner = (ASTNodeToTAnnotatable) result2_black[0];
			Annotation mAnnotation = (Annotation) result2_black[1];
			AnnotationToTAnnotation annotationToTAnnotation = (AnnotationToTAnnotation) result2_black[2];
			BodyDeclaration mOwner = (BodyDeclaration) result2_black[6];
			// ForEach 
			for (Object[] result3_black : AnnotationMemberKeyImpl
					.pattern_AnnotationMemberKey_12_3_findcontext_blackBBBBBBB(ownerToWoner, mAnnotation,
							annotationToTAnnotation, tAnnotationValue, tAnnotation, tOwner, mOwner)) {
				Object[] result3_green = AnnotationMemberKeyImpl
						.pattern_AnnotationMemberKey_12_3_findcontext_greenBBBBBBBFFFFFFFFF(ownerToWoner, mAnnotation,
								annotationToTAnnotation, tAnnotationValue, tAnnotation, tOwner, mOwner);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[7];
				//nothing EMoflonEdge annotationToTAnnotation__tAnnotation____target = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge annotationToTAnnotation__mAnnotation____source = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge tOwner__tAnnotation____tAnnotation = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge tAnnotation__tOwner____tAnnotated = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge mOwner__mAnnotation____annotations = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge ownerToWoner__mOwner____source = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge tAnnotation__tAnnotationValue____tValues = (EMoflonEdge) result3_green[14];
				//nothing EMoflonEdge ownerToWoner__tOwner____target = (EMoflonEdge) result3_green[15];

				Object[] result4_bindingAndBlack = AnnotationMemberKeyImpl
						.pattern_AnnotationMemberKey_12_4_solveCSP_bindingAndBlackFBBBBBBBBB(this, isApplicableMatch,
								ownerToWoner, mAnnotation, annotationToTAnnotation, tAnnotationValue, tAnnotation,
								tOwner, mOwner);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[ownerToWoner] = " + ownerToWoner
							+ ", " + "[mAnnotation] = " + mAnnotation + ", " + "[annotationToTAnnotation] = "
							+ annotationToTAnnotation + ", " + "[tAnnotationValue] = " + tAnnotationValue + ", "
							+ "[tAnnotation] = " + tAnnotation + ", " + "[tOwner] = " + tOwner + ", " + "[mOwner] = "
							+ mOwner + ".");
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
	public void registerObjectsToMatch_BWD(Match match, TAnnotationValue tAnnotationValue, TAnnotation tAnnotation,
			TAnnotatable tOwner) {
		match.registerObject("tAnnotationValue", tAnnotationValue);
		match.registerObject("tAnnotation", tAnnotation);
		match.registerObject("tOwner", tOwner);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, TAnnotationValue tAnnotationValue, TAnnotation tAnnotation,
			TAnnotatable tOwner) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, ASTNodeToTAnnotatable ownerToWoner,
			Annotation mAnnotation, AnnotationToTAnnotation annotationToTAnnotation, TAnnotationValue tAnnotationValue,
			TAnnotation tAnnotation, TAnnotatable tOwner, BodyDeclaration mOwner) {// Create CSP
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
		isApplicableMatch.registerObject("ownerToWoner", ownerToWoner);
		isApplicableMatch.registerObject("mAnnotation", mAnnotation);
		isApplicableMatch.registerObject("annotationToTAnnotation", annotationToTAnnotation);
		isApplicableMatch.registerObject("tAnnotationValue", tAnnotationValue);
		isApplicableMatch.registerObject("tAnnotation", tAnnotation);
		isApplicableMatch.registerObject("tOwner", tOwner);
		isApplicableMatch.registerObject("mOwner", mOwner);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject ownerToWoner, EObject mValue,
			EObject mAnnotation, EObject annotationToTAnnotation, EObject tAnnotationValue, EObject tAnnotation,
			EObject annotationMemberValuePairToTAnnotationValue, EObject tOwner, EObject mOwner) {
		ruleresult.registerObject("ownerToWoner", ownerToWoner);
		ruleresult.registerObject("mValue", mValue);
		ruleresult.registerObject("mAnnotation", mAnnotation);
		ruleresult.registerObject("annotationToTAnnotation", annotationToTAnnotation);
		ruleresult.registerObject("tAnnotationValue", tAnnotationValue);
		ruleresult.registerObject("tAnnotation", tAnnotation);
		ruleresult.registerObject("annotationMemberValuePairToTAnnotationValue",
				annotationMemberValuePairToTAnnotationValue);
		ruleresult.registerObject("tOwner", tOwner);
		ruleresult.registerObject("mOwner", mOwner);

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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_37(EMoflonEdge _edge_tValues) {

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
			TAnnotationValue tAnnotationValue = (TAnnotationValue) result2_black[0];
			TAnnotation tAnnotation = (TAnnotation) result2_black[1];
			TAnnotatable tOwner = (TAnnotatable) result2_black[2];
			Object[] result2_green = AnnotationMemberKeyImpl
					.pattern_AnnotationMemberKey_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (AnnotationMemberKeyImpl
					.pattern_AnnotationMemberKey_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(this,
							match, tAnnotationValue, tAnnotation, tOwner)) {
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_40(EMoflonEdge _edge_values) {

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
			AnnotationMemberValuePair mValue = (AnnotationMemberValuePair) result2_black[0];
			Annotation mAnnotation = (Annotation) result2_black[1];
			BodyDeclaration mOwner = (BodyDeclaration) result2_black[2];
			Object[] result2_green = AnnotationMemberKeyImpl
					.pattern_AnnotationMemberKey_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (AnnotationMemberKeyImpl
					.pattern_AnnotationMemberKey_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(this,
							match, mValue, mAnnotation, mOwner)) {
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

		Variable var_tAnnotationValue_tKey = CSPFactoryHelper.eINSTANCE.createVariable("tAnnotationValue", true, csp);
		var_tAnnotationValue_tKey.setValue(__helper.getValue("tAnnotationValue", "tKey"));
		var_tAnnotationValue_tKey.setType("String");

		Variable var_mValue_name = CSPFactoryHelper.eINSTANCE.createVariable("mValue", true, csp);
		var_mValue_name.setValue(__helper.getValue("mValue", "name"));
		var_mValue_name.setType("String");

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

		Variable var_tAnnotationValue_tKey = CSPFactoryHelper.eINSTANCE.createVariable("tAnnotationValue", true, csp);
		var_tAnnotationValue_tKey.setValue(__helper.getValue("tAnnotationValue", "tKey"));
		var_tAnnotationValue_tKey.setType("String");

		Variable var_mValue_name = CSPFactoryHelper.eINSTANCE.createVariable("mValue", true, csp);
		var_mValue_name.setValue(__helper.getValue("mValue", "name"));
		var_mValue_name.setType("String");

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
		AnnotationMemberValuePair mValue = (AnnotationMemberValuePair) result2_bindingAndBlack[0];
		Annotation mAnnotation = (Annotation) result2_bindingAndBlack[1];
		TAnnotationValue tAnnotationValue = (TAnnotationValue) result2_bindingAndBlack[2];
		TAnnotation tAnnotation = (TAnnotation) result2_bindingAndBlack[3];
		TAnnotatable tOwner = (TAnnotatable) result2_bindingAndBlack[4];
		BodyDeclaration mOwner = (BodyDeclaration) result2_bindingAndBlack[5];

		Object[] result3_bindingAndBlack = AnnotationMemberKeyImpl
				.pattern_AnnotationMemberKey_24_3_solvecsp_bindingAndBlackFBBBBBBBBB(this, mValue, mAnnotation,
						tAnnotationValue, tAnnotation, tOwner, mOwner, sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[mValue] = " + mValue + ", " + "[mAnnotation] = " + mAnnotation + ", " + "[tAnnotationValue] = "
					+ tAnnotationValue + ", " + "[tAnnotation] = " + tAnnotation + ", " + "[tOwner] = " + tOwner + ", "
					+ "[mOwner] = " + mOwner + ", " + "[sourceMatch] = " + sourceMatch + ", " + "[targetMatch] = "
					+ targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (AnnotationMemberKeyImpl.pattern_AnnotationMemberKey_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : AnnotationMemberKeyImpl
					.pattern_AnnotationMemberKey_24_5_matchcorrcontext_blackFBFBBBBB(mAnnotation, tAnnotation, tOwner,
							mOwner, sourceMatch, targetMatch)) {
				ASTNodeToTAnnotatable ownerToWoner = (ASTNodeToTAnnotatable) result5_black[0];
				AnnotationToTAnnotation annotationToTAnnotation = (AnnotationToTAnnotation) result5_black[2];
				Object[] result5_green = AnnotationMemberKeyImpl
						.pattern_AnnotationMemberKey_24_5_matchcorrcontext_greenBBBBF(ownerToWoner,
								annotationToTAnnotation, sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[4];

				Object[] result6_black = AnnotationMemberKeyImpl
						.pattern_AnnotationMemberKey_24_6_createcorrespondence_blackBBBBBBB(mValue, mAnnotation,
								tAnnotationValue, tAnnotation, tOwner, mOwner, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[mValue] = " + mValue
							+ ", " + "[mAnnotation] = " + mAnnotation + ", " + "[tAnnotationValue] = "
							+ tAnnotationValue + ", " + "[tAnnotation] = " + tAnnotation + ", " + "[tOwner] = " + tOwner
							+ ", " + "[mOwner] = " + mOwner + ", " + "[ccMatch] = " + ccMatch + ".");
				}
				AnnotationMemberKeyImpl.pattern_AnnotationMemberKey_24_6_createcorrespondence_greenBBFB(mValue,
						tAnnotationValue, ccMatch);
				//nothing AnnotationMemberValuePairToTAnnotationValue annotationMemberValuePairToTAnnotationValue = (AnnotationMemberValuePairToTAnnotationValue) result6_green[2];

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
	public CSP isApplicable_solveCsp_CC(AnnotationMemberValuePair mValue, Annotation mAnnotation,
			TAnnotationValue tAnnotationValue, TAnnotation tAnnotation, TAnnotatable tOwner, BodyDeclaration mOwner,
			Match sourceMatch, Match targetMatch) {// Create CSP
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
	public boolean checkDEC_FWD(AnnotationMemberValuePair mValue, Annotation mAnnotation, BodyDeclaration mOwner) {// 
		Object[] result1_black = AnnotationMemberKeyImpl
				.pattern_AnnotationMemberKey_27_1_matchtggpattern_blackBBB(mValue, mAnnotation, mOwner);
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
	public boolean checkDEC_BWD(TAnnotationValue tAnnotationValue, TAnnotation tAnnotation, TAnnotatable tOwner) {// 
		Object[] result1_black = AnnotationMemberKeyImpl
				.pattern_AnnotationMemberKey_28_1_matchtggpattern_blackBBB(tAnnotationValue, tAnnotation, tOwner);
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
			ASTNodeToTAnnotatable ownerToWonerParameter) {

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
			//nothing RuleEntryList ownerToWonerList = (RuleEntryList) result2_black[0];
			ASTNodeToTAnnotatable ownerToWoner = (ASTNodeToTAnnotatable) result2_black[1];
			BodyDeclaration mOwner = (BodyDeclaration) result2_black[2];
			Annotation mAnnotation = (Annotation) result2_black[3];
			AnnotationToTAnnotation annotationToTAnnotation = (AnnotationToTAnnotation) result2_black[4];
			TAnnotation tAnnotation = (TAnnotation) result2_black[5];
			TAnnotatable tOwner = (TAnnotatable) result2_black[6];

			Object[] result3_bindingAndBlack = AnnotationMemberKeyImpl
					.pattern_AnnotationMemberKey_29_3_solveCSP_bindingAndBlackFBBBBBBBBB(this, isApplicableMatch,
							ownerToWoner, mAnnotation, annotationToTAnnotation, tAnnotation, tOwner, mOwner,
							ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[ownerToWoner] = " + ownerToWoner
						+ ", " + "[mAnnotation] = " + mAnnotation + ", " + "[annotationToTAnnotation] = "
						+ annotationToTAnnotation + ", " + "[tAnnotation] = " + tAnnotation + ", " + "[tOwner] = "
						+ tOwner + ", " + "[mOwner] = " + mOwner + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (AnnotationMemberKeyImpl.pattern_AnnotationMemberKey_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = AnnotationMemberKeyImpl.pattern_AnnotationMemberKey_29_5_checknacs_blackBBBBBB(
						ownerToWoner, mAnnotation, annotationToTAnnotation, tAnnotation, tOwner, mOwner);
				if (result5_black != null) {

					Object[] result6_black = AnnotationMemberKeyImpl
							.pattern_AnnotationMemberKey_29_6_perform_blackBBBBBBB(ownerToWoner, mAnnotation,
									annotationToTAnnotation, tAnnotation, tOwner, mOwner, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ownerToWoner] = "
								+ ownerToWoner + ", " + "[mAnnotation] = " + mAnnotation + ", "
								+ "[annotationToTAnnotation] = " + annotationToTAnnotation + ", " + "[tAnnotation] = "
								+ tAnnotation + ", " + "[tOwner] = " + tOwner + ", " + "[mOwner] = " + mOwner + ", "
								+ "[ruleResult] = " + ruleResult + ".");
					}
					AnnotationMemberKeyImpl.pattern_AnnotationMemberKey_29_6_perform_greenFBFBFBB(mAnnotation,
							tAnnotation, ruleResult, csp);
					//nothing AnnotationMemberValuePair mValue = (AnnotationMemberValuePair) result6_green[0];
					//nothing TAnnotationValue tAnnotationValue = (TAnnotationValue) result6_green[2];
					//nothing AnnotationMemberValuePairToTAnnotationValue annotationMemberValuePairToTAnnotationValue = (AnnotationMemberValuePairToTAnnotationValue) result6_green[4];

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
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, ASTNodeToTAnnotatable ownerToWoner,
			Annotation mAnnotation, AnnotationToTAnnotation annotationToTAnnotation, TAnnotation tAnnotation,
			TAnnotatable tOwner, BodyDeclaration mOwner, ModelgeneratorRuleResult ruleResult) {// Create CSP
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
		isApplicableMatch.registerObject("ownerToWoner", ownerToWoner);
		isApplicableMatch.registerObject("mAnnotation", mAnnotation);
		isApplicableMatch.registerObject("annotationToTAnnotation", annotationToTAnnotation);
		isApplicableMatch.registerObject("tAnnotation", tAnnotation);
		isApplicableMatch.registerObject("tOwner", tOwner);
		isApplicableMatch.registerObject("mOwner", mOwner);
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
		case RulesPackage.ANNOTATION_MEMBER_KEY___IS_APPROPRIATE_FWD__MATCH_ANNOTATIONMEMBERVALUEPAIR_ANNOTATION_BODYDECLARATION:
			return isAppropriate_FWD((Match) arguments.get(0), (AnnotationMemberValuePair) arguments.get(1),
					(Annotation) arguments.get(2), (BodyDeclaration) arguments.get(3));
		case RulesPackage.ANNOTATION_MEMBER_KEY___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.ANNOTATION_MEMBER_KEY___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.ANNOTATION_MEMBER_KEY___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_ANNOTATIONMEMBERVALUEPAIR_ANNOTATION_BODYDECLARATION:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (AnnotationMemberValuePair) arguments.get(1),
					(Annotation) arguments.get(2), (BodyDeclaration) arguments.get(3));
			return null;
		case RulesPackage.ANNOTATION_MEMBER_KEY___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_ANNOTATIONMEMBERVALUEPAIR_ANNOTATION_BODYDECLARATION:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (AnnotationMemberValuePair) arguments.get(1),
					(Annotation) arguments.get(2), (BodyDeclaration) arguments.get(3));
		case RulesPackage.ANNOTATION_MEMBER_KEY___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.ANNOTATION_MEMBER_KEY___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_ASTNODETOTANNOTATABLE_ANNOTATIONMEMBERVALUEPAIR_ANNOTATION_ANNOTATIONTOTANNOTATION_TANNOTATION_TANNOTATABLE_BODYDECLARATION:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0),
					(ASTNodeToTAnnotatable) arguments.get(1), (AnnotationMemberValuePair) arguments.get(2),
					(Annotation) arguments.get(3), (AnnotationToTAnnotation) arguments.get(4),
					(TAnnotation) arguments.get(5), (TAnnotatable) arguments.get(6),
					(BodyDeclaration) arguments.get(7));
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
		case RulesPackage.ANNOTATION_MEMBER_KEY___IS_APPROPRIATE_BWD__MATCH_TANNOTATIONVALUE_TANNOTATION_TANNOTATABLE:
			return isAppropriate_BWD((Match) arguments.get(0), (TAnnotationValue) arguments.get(1),
					(TAnnotation) arguments.get(2), (TAnnotatable) arguments.get(3));
		case RulesPackage.ANNOTATION_MEMBER_KEY___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.ANNOTATION_MEMBER_KEY___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.ANNOTATION_MEMBER_KEY___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TANNOTATIONVALUE_TANNOTATION_TANNOTATABLE:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (TAnnotationValue) arguments.get(1),
					(TAnnotation) arguments.get(2), (TAnnotatable) arguments.get(3));
			return null;
		case RulesPackage.ANNOTATION_MEMBER_KEY___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TANNOTATIONVALUE_TANNOTATION_TANNOTATABLE:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (TAnnotationValue) arguments.get(1),
					(TAnnotation) arguments.get(2), (TAnnotatable) arguments.get(3));
		case RulesPackage.ANNOTATION_MEMBER_KEY___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.ANNOTATION_MEMBER_KEY___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_ASTNODETOTANNOTATABLE_ANNOTATION_ANNOTATIONTOTANNOTATION_TANNOTATIONVALUE_TANNOTATION_TANNOTATABLE_BODYDECLARATION:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
					(ASTNodeToTAnnotatable) arguments.get(1), (Annotation) arguments.get(2),
					(AnnotationToTAnnotation) arguments.get(3), (TAnnotationValue) arguments.get(4),
					(TAnnotation) arguments.get(5), (TAnnotatable) arguments.get(6),
					(BodyDeclaration) arguments.get(7));
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
		case RulesPackage.ANNOTATION_MEMBER_KEY___IS_APPROPRIATE_BWD_EMOFLON_EDGE_37__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_37((EMoflonEdge) arguments.get(0));
		case RulesPackage.ANNOTATION_MEMBER_KEY___IS_APPROPRIATE_FWD_EMOFLON_EDGE_40__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_40((EMoflonEdge) arguments.get(0));
		case RulesPackage.ANNOTATION_MEMBER_KEY___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.ANNOTATION_MEMBER_KEY___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.ANNOTATION_MEMBER_KEY___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.ANNOTATION_MEMBER_KEY___IS_APPLICABLE_SOLVE_CSP_CC__ANNOTATIONMEMBERVALUEPAIR_ANNOTATION_TANNOTATIONVALUE_TANNOTATION_TANNOTATABLE_BODYDECLARATION_MATCH_MATCH:
			return isApplicable_solveCsp_CC((AnnotationMemberValuePair) arguments.get(0), (Annotation) arguments.get(1),
					(TAnnotationValue) arguments.get(2), (TAnnotation) arguments.get(3),
					(TAnnotatable) arguments.get(4), (BodyDeclaration) arguments.get(5), (Match) arguments.get(6),
					(Match) arguments.get(7));
		case RulesPackage.ANNOTATION_MEMBER_KEY___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.ANNOTATION_MEMBER_KEY___CHECK_DEC_FWD__ANNOTATIONMEMBERVALUEPAIR_ANNOTATION_BODYDECLARATION:
			return checkDEC_FWD((AnnotationMemberValuePair) arguments.get(0), (Annotation) arguments.get(1),
					(BodyDeclaration) arguments.get(2));
		case RulesPackage.ANNOTATION_MEMBER_KEY___CHECK_DEC_BWD__TANNOTATIONVALUE_TANNOTATION_TANNOTATABLE:
			return checkDEC_BWD((TAnnotationValue) arguments.get(0), (TAnnotation) arguments.get(1),
					(TAnnotatable) arguments.get(2));
		case RulesPackage.ANNOTATION_MEMBER_KEY___GENERATE_MODEL__RULEENTRYCONTAINER_ASTNODETOTANNOTATABLE:
			return generateModel((RuleEntryContainer) arguments.get(0), (ASTNodeToTAnnotatable) arguments.get(1));
		case RulesPackage.ANNOTATION_MEMBER_KEY___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_ASTNODETOTANNOTATABLE_ANNOTATION_ANNOTATIONTOTANNOTATION_TANNOTATION_TANNOTATABLE_BODYDECLARATION_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
					(ASTNodeToTAnnotatable) arguments.get(1), (Annotation) arguments.get(2),
					(AnnotationToTAnnotation) arguments.get(3), (TAnnotation) arguments.get(4),
					(TAnnotatable) arguments.get(5), (BodyDeclaration) arguments.get(6),
					(ModelgeneratorRuleResult) arguments.get(7));
		case RulesPackage.ANNOTATION_MEMBER_KEY___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_AnnotationMemberKey_0_1_initialbindings_blackBBBBB(AnnotationMemberKey _this,
			Match match, AnnotationMemberValuePair mValue, Annotation mAnnotation, BodyDeclaration mOwner) {
		return new Object[] { _this, match, mValue, mAnnotation, mOwner };
	}

	public static final Object[] pattern_AnnotationMemberKey_0_2_SolveCSP_bindingFBBBBB(AnnotationMemberKey _this,
			Match match, AnnotationMemberValuePair mValue, Annotation mAnnotation, BodyDeclaration mOwner) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, mValue, mAnnotation, mOwner);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, mValue, mAnnotation, mOwner };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberKey_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_AnnotationMemberKey_0_2_SolveCSP_bindingAndBlackFBBBBB(
			AnnotationMemberKey _this, Match match, AnnotationMemberValuePair mValue, Annotation mAnnotation,
			BodyDeclaration mOwner) {
		Object[] result_pattern_AnnotationMemberKey_0_2_SolveCSP_binding = pattern_AnnotationMemberKey_0_2_SolveCSP_bindingFBBBBB(
				_this, match, mValue, mAnnotation, mOwner);
		if (result_pattern_AnnotationMemberKey_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_AnnotationMemberKey_0_2_SolveCSP_binding[0];

			Object[] result_pattern_AnnotationMemberKey_0_2_SolveCSP_black = pattern_AnnotationMemberKey_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_AnnotationMemberKey_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, mValue, mAnnotation, mOwner };
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
			AnnotationMemberValuePair mValue, Annotation mAnnotation, BodyDeclaration mOwner) {
		return new Object[] { match, mValue, mAnnotation, mOwner };
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
			AnnotationMemberValuePair mValue, Annotation mAnnotation, BodyDeclaration mOwner) {
		return new Object[] { match, mValue, mAnnotation, mOwner };
	}

	public static final Object[] pattern_AnnotationMemberKey_0_5_collectcontextelements_greenBBBF(Match match,
			Annotation mAnnotation, BodyDeclaration mOwner) {
		EMoflonEdge mOwner__mAnnotation____annotations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(mAnnotation);
		match.getContextNodes().add(mOwner);
		String mOwner__mAnnotation____annotations_name_prime = "annotations";
		mOwner__mAnnotation____annotations.setSrc(mOwner);
		mOwner__mAnnotation____annotations.setTrg(mAnnotation);
		match.getContextEdges().add(mOwner__mAnnotation____annotations);
		mOwner__mAnnotation____annotations.setName(mOwner__mAnnotation____annotations_name_prime);
		return new Object[] { match, mAnnotation, mOwner, mOwner__mAnnotation____annotations };
	}

	public static final void pattern_AnnotationMemberKey_0_6_registerobjectstomatch_expressionBBBBB(
			AnnotationMemberKey _this, Match match, AnnotationMemberValuePair mValue, Annotation mAnnotation,
			BodyDeclaration mOwner) {
		_this.registerObjectsToMatch_FWD(match, mValue, mAnnotation, mOwner);

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
		EObject _localVariable_0 = isApplicableMatch.getObject("ownerToWoner");
		EObject _localVariable_1 = isApplicableMatch.getObject("mValue");
		EObject _localVariable_2 = isApplicableMatch.getObject("mAnnotation");
		EObject _localVariable_3 = isApplicableMatch.getObject("annotationToTAnnotation");
		EObject _localVariable_4 = isApplicableMatch.getObject("tAnnotation");
		EObject _localVariable_5 = isApplicableMatch.getObject("tOwner");
		EObject _localVariable_6 = isApplicableMatch.getObject("mOwner");
		EObject tmpOwnerToWoner = _localVariable_0;
		EObject tmpMValue = _localVariable_1;
		EObject tmpMAnnotation = _localVariable_2;
		EObject tmpAnnotationToTAnnotation = _localVariable_3;
		EObject tmpTAnnotation = _localVariable_4;
		EObject tmpTOwner = _localVariable_5;
		EObject tmpMOwner = _localVariable_6;
		if (tmpOwnerToWoner instanceof ASTNodeToTAnnotatable) {
			ASTNodeToTAnnotatable ownerToWoner = (ASTNodeToTAnnotatable) tmpOwnerToWoner;
			if (tmpMValue instanceof AnnotationMemberValuePair) {
				AnnotationMemberValuePair mValue = (AnnotationMemberValuePair) tmpMValue;
				if (tmpMAnnotation instanceof Annotation) {
					Annotation mAnnotation = (Annotation) tmpMAnnotation;
					if (tmpAnnotationToTAnnotation instanceof AnnotationToTAnnotation) {
						AnnotationToTAnnotation annotationToTAnnotation = (AnnotationToTAnnotation) tmpAnnotationToTAnnotation;
						if (tmpTAnnotation instanceof TAnnotation) {
							TAnnotation tAnnotation = (TAnnotation) tmpTAnnotation;
							if (tmpTOwner instanceof TAnnotatable) {
								TAnnotatable tOwner = (TAnnotatable) tmpTOwner;
								if (tmpMOwner instanceof BodyDeclaration) {
									BodyDeclaration mOwner = (BodyDeclaration) tmpMOwner;
									return new Object[] { ownerToWoner, mValue, mAnnotation, annotationToTAnnotation,
											tAnnotation, tOwner, mOwner, isApplicableMatch };
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
			ASTNodeToTAnnotatable ownerToWoner, AnnotationMemberValuePair mValue, Annotation mAnnotation,
			AnnotationToTAnnotation annotationToTAnnotation, TAnnotation tAnnotation, TAnnotatable tOwner,
			BodyDeclaration mOwner, AnnotationMemberKey _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { ownerToWoner, mValue, mAnnotation, annotationToTAnnotation, tAnnotation, tOwner,
						mOwner, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberKey_1_1_performtransformation_bindingAndBlackFFFFFFFFBB(
			AnnotationMemberKey _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_AnnotationMemberKey_1_1_performtransformation_binding = pattern_AnnotationMemberKey_1_1_performtransformation_bindingFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_AnnotationMemberKey_1_1_performtransformation_binding != null) {
			ASTNodeToTAnnotatable ownerToWoner = (ASTNodeToTAnnotatable) result_pattern_AnnotationMemberKey_1_1_performtransformation_binding[0];
			AnnotationMemberValuePair mValue = (AnnotationMemberValuePair) result_pattern_AnnotationMemberKey_1_1_performtransformation_binding[1];
			Annotation mAnnotation = (Annotation) result_pattern_AnnotationMemberKey_1_1_performtransformation_binding[2];
			AnnotationToTAnnotation annotationToTAnnotation = (AnnotationToTAnnotation) result_pattern_AnnotationMemberKey_1_1_performtransformation_binding[3];
			TAnnotation tAnnotation = (TAnnotation) result_pattern_AnnotationMemberKey_1_1_performtransformation_binding[4];
			TAnnotatable tOwner = (TAnnotatable) result_pattern_AnnotationMemberKey_1_1_performtransformation_binding[5];
			BodyDeclaration mOwner = (BodyDeclaration) result_pattern_AnnotationMemberKey_1_1_performtransformation_binding[6];

			Object[] result_pattern_AnnotationMemberKey_1_1_performtransformation_black = pattern_AnnotationMemberKey_1_1_performtransformation_blackBBBBBBBFBB(
					ownerToWoner, mValue, mAnnotation, annotationToTAnnotation, tAnnotation, tOwner, mOwner, _this,
					isApplicableMatch);
			if (result_pattern_AnnotationMemberKey_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_AnnotationMemberKey_1_1_performtransformation_black[7];

				return new Object[] { ownerToWoner, mValue, mAnnotation, annotationToTAnnotation, tAnnotation, tOwner,
						mOwner, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberKey_1_1_performtransformation_greenBFBFB(
			AnnotationMemberValuePair mValue, TAnnotation tAnnotation, CSP csp) {
		TAnnotationValue tAnnotationValue = AnnotationsFactory.eINSTANCE.createTAnnotationValue();
		AnnotationMemberValuePairToTAnnotationValue annotationMemberValuePairToTAnnotationValue = PmFactory.eINSTANCE
				.createAnnotationMemberValuePairToTAnnotationValue();
		Object _localVariable_0 = csp.getValue("tAnnotationValue", "tKey");
		tAnnotation.getTValues().add(tAnnotationValue);
		annotationMemberValuePairToTAnnotationValue.setTarget(tAnnotationValue);
		annotationMemberValuePairToTAnnotationValue.setSource(mValue);
		String tAnnotationValue_tKey_prime = (String) _localVariable_0;
		tAnnotationValue.setTKey(tAnnotationValue_tKey_prime);
		return new Object[] { mValue, tAnnotationValue, tAnnotation, annotationMemberValuePairToTAnnotationValue, csp };
	}

	public static final Object[] pattern_AnnotationMemberKey_1_2_collecttranslatedelements_blackBBB(
			AnnotationMemberValuePair mValue, TAnnotationValue tAnnotationValue,
			AnnotationMemberValuePairToTAnnotationValue annotationMemberValuePairToTAnnotationValue) {
		return new Object[] { mValue, tAnnotationValue, annotationMemberValuePairToTAnnotationValue };
	}

	public static final Object[] pattern_AnnotationMemberKey_1_2_collecttranslatedelements_greenFBBB(
			AnnotationMemberValuePair mValue, TAnnotationValue tAnnotationValue,
			AnnotationMemberValuePairToTAnnotationValue annotationMemberValuePairToTAnnotationValue) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(mValue);
		ruleresult.getCreatedElements().add(tAnnotationValue);
		ruleresult.getCreatedLinkElements().add(annotationMemberValuePairToTAnnotationValue);
		return new Object[] { ruleresult, mValue, tAnnotationValue, annotationMemberValuePairToTAnnotationValue };
	}

	public static final Object[] pattern_AnnotationMemberKey_1_3_bookkeepingforedges_blackBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject ownerToWoner, EObject mValue, EObject mAnnotation,
			EObject annotationToTAnnotation, EObject tAnnotationValue, EObject tAnnotation,
			EObject annotationMemberValuePairToTAnnotationValue, EObject tOwner, EObject mOwner) {
		if (!ownerToWoner.equals(tAnnotationValue)) {
			if (!ownerToWoner.equals(tAnnotation)) {
				if (!ownerToWoner.equals(tOwner)) {
					if (!mValue.equals(ownerToWoner)) {
						if (!mValue.equals(tAnnotationValue)) {
							if (!mValue.equals(tAnnotation)) {
								if (!mValue.equals(tOwner)) {
									if (!mAnnotation.equals(ownerToWoner)) {
										if (!mAnnotation.equals(mValue)) {
											if (!mAnnotation.equals(tAnnotationValue)) {
												if (!mAnnotation.equals(tAnnotation)) {
													if (!mAnnotation.equals(tOwner)) {
														if (!mAnnotation.equals(mOwner)) {
															if (!annotationToTAnnotation.equals(ownerToWoner)) {
																if (!annotationToTAnnotation.equals(mValue)) {
																	if (!annotationToTAnnotation.equals(mAnnotation)) {
																		if (!annotationToTAnnotation
																				.equals(tAnnotationValue)) {
																			if (!annotationToTAnnotation
																					.equals(tAnnotation)) {
																				if (!annotationToTAnnotation
																						.equals(tOwner)) {
																					if (!annotationToTAnnotation
																							.equals(mOwner)) {
																						if (!tAnnotationValue
																								.equals(tOwner)) {
																							if (!tAnnotation.equals(
																									tAnnotationValue)) {
																								if (!tAnnotation.equals(
																										tOwner)) {
																									if (!annotationMemberValuePairToTAnnotationValue
																											.equals(ownerToWoner)) {
																										if (!annotationMemberValuePairToTAnnotationValue
																												.equals(mValue)) {
																											if (!annotationMemberValuePairToTAnnotationValue
																													.equals(mAnnotation)) {
																												if (!annotationMemberValuePairToTAnnotationValue
																														.equals(annotationToTAnnotation)) {
																													if (!annotationMemberValuePairToTAnnotationValue
																															.equals(tAnnotationValue)) {
																														if (!annotationMemberValuePairToTAnnotationValue
																																.equals(tAnnotation)) {
																															if (!annotationMemberValuePairToTAnnotationValue
																																	.equals(tOwner)) {
																																if (!annotationMemberValuePairToTAnnotationValue
																																		.equals(mOwner)) {
																																	if (!mOwner
																																			.equals(ownerToWoner)) {
																																		if (!mOwner
																																				.equals(mValue)) {
																																			if (!mOwner
																																					.equals(tAnnotationValue)) {
																																				if (!mOwner
																																						.equals(tAnnotation)) {
																																					if (!mOwner
																																							.equals(tOwner)) {
																																						return new Object[] {
																																								ruleresult,
																																								ownerToWoner,
																																								mValue,
																																								mAnnotation,
																																								annotationToTAnnotation,
																																								tAnnotationValue,
																																								tAnnotation,
																																								annotationMemberValuePairToTAnnotationValue,
																																								tOwner,
																																								mOwner };
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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
			PerformRuleResult ruleresult, EObject mValue, EObject mAnnotation, EObject tAnnotationValue,
			EObject tAnnotation, EObject annotationMemberValuePairToTAnnotationValue) {
		EMoflonEdge mAnnotation__mValue____values = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge annotationMemberValuePairToTAnnotationValue__tAnnotationValue____target = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge annotationMemberValuePairToTAnnotationValue__mValue____source = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tAnnotation__tAnnotationValue____tValues = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "AnnotationMemberKey";
		String mAnnotation__mValue____values_name_prime = "values";
		String annotationMemberValuePairToTAnnotationValue__tAnnotationValue____target_name_prime = "target";
		String annotationMemberValuePairToTAnnotationValue__mValue____source_name_prime = "source";
		String tAnnotation__tAnnotationValue____tValues_name_prime = "tValues";
		mAnnotation__mValue____values.setSrc(mAnnotation);
		mAnnotation__mValue____values.setTrg(mValue);
		ruleresult.getTranslatedEdges().add(mAnnotation__mValue____values);
		annotationMemberValuePairToTAnnotationValue__tAnnotationValue____target
				.setSrc(annotationMemberValuePairToTAnnotationValue);
		annotationMemberValuePairToTAnnotationValue__tAnnotationValue____target.setTrg(tAnnotationValue);
		ruleresult.getCreatedEdges().add(annotationMemberValuePairToTAnnotationValue__tAnnotationValue____target);
		annotationMemberValuePairToTAnnotationValue__mValue____source
				.setSrc(annotationMemberValuePairToTAnnotationValue);
		annotationMemberValuePairToTAnnotationValue__mValue____source.setTrg(mValue);
		ruleresult.getCreatedEdges().add(annotationMemberValuePairToTAnnotationValue__mValue____source);
		tAnnotation__tAnnotationValue____tValues.setSrc(tAnnotation);
		tAnnotation__tAnnotationValue____tValues.setTrg(tAnnotationValue);
		ruleresult.getCreatedEdges().add(tAnnotation__tAnnotationValue____tValues);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		mAnnotation__mValue____values.setName(mAnnotation__mValue____values_name_prime);
		annotationMemberValuePairToTAnnotationValue__tAnnotationValue____target
				.setName(annotationMemberValuePairToTAnnotationValue__tAnnotationValue____target_name_prime);
		annotationMemberValuePairToTAnnotationValue__mValue____source
				.setName(annotationMemberValuePairToTAnnotationValue__mValue____source_name_prime);
		tAnnotation__tAnnotationValue____tValues.setName(tAnnotation__tAnnotationValue____tValues_name_prime);
		return new Object[] { ruleresult, mValue, mAnnotation, tAnnotationValue, tAnnotation,
				annotationMemberValuePairToTAnnotationValue, mAnnotation__mValue____values,
				annotationMemberValuePairToTAnnotationValue__tAnnotationValue____target,
				annotationMemberValuePairToTAnnotationValue__mValue____source,
				tAnnotation__tAnnotationValue____tValues };
	}

	public static final void pattern_AnnotationMemberKey_1_5_registerobjects_expressionBBBBBBBBBBB(
			AnnotationMemberKey _this, PerformRuleResult ruleresult, EObject ownerToWoner, EObject mValue,
			EObject mAnnotation, EObject annotationToTAnnotation, EObject tAnnotationValue, EObject tAnnotation,
			EObject annotationMemberValuePairToTAnnotationValue, EObject tOwner, EObject mOwner) {
		_this.registerObjects_FWD(ruleresult, ownerToWoner, mValue, mAnnotation, annotationToTAnnotation,
				tAnnotationValue, tAnnotation, annotationMemberValuePairToTAnnotationValue, tOwner, mOwner);

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
		EObject _localVariable_0 = match.getObject("mValue");
		EObject _localVariable_1 = match.getObject("mAnnotation");
		EObject _localVariable_2 = match.getObject("mOwner");
		EObject tmpMValue = _localVariable_0;
		EObject tmpMAnnotation = _localVariable_1;
		EObject tmpMOwner = _localVariable_2;
		if (tmpMValue instanceof AnnotationMemberValuePair) {
			AnnotationMemberValuePair mValue = (AnnotationMemberValuePair) tmpMValue;
			if (tmpMAnnotation instanceof Annotation) {
				Annotation mAnnotation = (Annotation) tmpMAnnotation;
				if (tmpMOwner instanceof BodyDeclaration) {
					BodyDeclaration mOwner = (BodyDeclaration) tmpMOwner;
					return new Object[] { mValue, mAnnotation, mOwner, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_AnnotationMemberKey_2_2_corematch_blackFBBFFFBB(
			AnnotationMemberValuePair mValue, Annotation mAnnotation, BodyDeclaration mOwner, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (AnnotationToTAnnotation annotationToTAnnotation : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mAnnotation, AnnotationToTAnnotation.class, "source")) {
			TAnnotation tAnnotation = annotationToTAnnotation.getTarget();
			if (tAnnotation != null) {
				for (ASTNodeToTAnnotatable ownerToWoner : org.moflon.core.utilities.eMoflonEMFUtil
						.getOppositeReferenceTyped(mOwner, ASTNodeToTAnnotatable.class, "source")) {
					TAnnotatable tOwner = ownerToWoner.getTarget();
					if (tOwner != null) {
						_result.add(new Object[] { ownerToWoner, mValue, mAnnotation, annotationToTAnnotation,
								tAnnotation, tOwner, mOwner, match });
					}

				}
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_AnnotationMemberKey_2_3_findcontext_blackBBBBBBB(
			ASTNodeToTAnnotatable ownerToWoner, AnnotationMemberValuePair mValue, Annotation mAnnotation,
			AnnotationToTAnnotation annotationToTAnnotation, TAnnotation tAnnotation, TAnnotatable tOwner,
			BodyDeclaration mOwner) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (tAnnotation.equals(annotationToTAnnotation.getTarget())) {
			if (mAnnotation.getValues().contains(mValue)) {
				if (mAnnotation.equals(annotationToTAnnotation.getSource())) {
					if (tOwner.getTAnnotation().contains(tAnnotation)) {
						if (mOwner.getAnnotations().contains(mAnnotation)) {
							if (mOwner.equals(ownerToWoner.getSource())) {
								if (tOwner.equals(ownerToWoner.getTarget())) {
									_result.add(new Object[] { ownerToWoner, mValue, mAnnotation,
											annotationToTAnnotation, tAnnotation, tOwner, mOwner });
								}
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_AnnotationMemberKey_2_3_findcontext_greenBBBBBBBFFFFFFFFF(
			ASTNodeToTAnnotatable ownerToWoner, AnnotationMemberValuePair mValue, Annotation mAnnotation,
			AnnotationToTAnnotation annotationToTAnnotation, TAnnotation tAnnotation, TAnnotatable tOwner,
			BodyDeclaration mOwner) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge annotationToTAnnotation__tAnnotation____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mAnnotation__mValue____values = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge annotationToTAnnotation__mAnnotation____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tOwner__tAnnotation____tAnnotation = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAnnotation__tOwner____tAnnotated = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mOwner__mAnnotation____annotations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge ownerToWoner__mOwner____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge ownerToWoner__tOwner____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String annotationToTAnnotation__tAnnotation____target_name_prime = "target";
		String mAnnotation__mValue____values_name_prime = "values";
		String annotationToTAnnotation__mAnnotation____source_name_prime = "source";
		String tOwner__tAnnotation____tAnnotation_name_prime = "tAnnotation";
		String tAnnotation__tOwner____tAnnotated_name_prime = "tAnnotated";
		String mOwner__mAnnotation____annotations_name_prime = "annotations";
		String ownerToWoner__mOwner____source_name_prime = "source";
		String ownerToWoner__tOwner____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(ownerToWoner);
		isApplicableMatch.getAllContextElements().add(mValue);
		isApplicableMatch.getAllContextElements().add(mAnnotation);
		isApplicableMatch.getAllContextElements().add(annotationToTAnnotation);
		isApplicableMatch.getAllContextElements().add(tAnnotation);
		isApplicableMatch.getAllContextElements().add(tOwner);
		isApplicableMatch.getAllContextElements().add(mOwner);
		annotationToTAnnotation__tAnnotation____target.setSrc(annotationToTAnnotation);
		annotationToTAnnotation__tAnnotation____target.setTrg(tAnnotation);
		isApplicableMatch.getAllContextElements().add(annotationToTAnnotation__tAnnotation____target);
		mAnnotation__mValue____values.setSrc(mAnnotation);
		mAnnotation__mValue____values.setTrg(mValue);
		isApplicableMatch.getAllContextElements().add(mAnnotation__mValue____values);
		annotationToTAnnotation__mAnnotation____source.setSrc(annotationToTAnnotation);
		annotationToTAnnotation__mAnnotation____source.setTrg(mAnnotation);
		isApplicableMatch.getAllContextElements().add(annotationToTAnnotation__mAnnotation____source);
		tOwner__tAnnotation____tAnnotation.setSrc(tOwner);
		tOwner__tAnnotation____tAnnotation.setTrg(tAnnotation);
		isApplicableMatch.getAllContextElements().add(tOwner__tAnnotation____tAnnotation);
		tAnnotation__tOwner____tAnnotated.setSrc(tAnnotation);
		tAnnotation__tOwner____tAnnotated.setTrg(tOwner);
		isApplicableMatch.getAllContextElements().add(tAnnotation__tOwner____tAnnotated);
		mOwner__mAnnotation____annotations.setSrc(mOwner);
		mOwner__mAnnotation____annotations.setTrg(mAnnotation);
		isApplicableMatch.getAllContextElements().add(mOwner__mAnnotation____annotations);
		ownerToWoner__mOwner____source.setSrc(ownerToWoner);
		ownerToWoner__mOwner____source.setTrg(mOwner);
		isApplicableMatch.getAllContextElements().add(ownerToWoner__mOwner____source);
		ownerToWoner__tOwner____target.setSrc(ownerToWoner);
		ownerToWoner__tOwner____target.setTrg(tOwner);
		isApplicableMatch.getAllContextElements().add(ownerToWoner__tOwner____target);
		annotationToTAnnotation__tAnnotation____target
				.setName(annotationToTAnnotation__tAnnotation____target_name_prime);
		mAnnotation__mValue____values.setName(mAnnotation__mValue____values_name_prime);
		annotationToTAnnotation__mAnnotation____source
				.setName(annotationToTAnnotation__mAnnotation____source_name_prime);
		tOwner__tAnnotation____tAnnotation.setName(tOwner__tAnnotation____tAnnotation_name_prime);
		tAnnotation__tOwner____tAnnotated.setName(tAnnotation__tOwner____tAnnotated_name_prime);
		mOwner__mAnnotation____annotations.setName(mOwner__mAnnotation____annotations_name_prime);
		ownerToWoner__mOwner____source.setName(ownerToWoner__mOwner____source_name_prime);
		ownerToWoner__tOwner____target.setName(ownerToWoner__tOwner____target_name_prime);
		return new Object[] { ownerToWoner, mValue, mAnnotation, annotationToTAnnotation, tAnnotation, tOwner, mOwner,
				isApplicableMatch, annotationToTAnnotation__tAnnotation____target, mAnnotation__mValue____values,
				annotationToTAnnotation__mAnnotation____source, tOwner__tAnnotation____tAnnotation,
				tAnnotation__tOwner____tAnnotated, mOwner__mAnnotation____annotations, ownerToWoner__mOwner____source,
				ownerToWoner__tOwner____target };
	}

	public static final Object[] pattern_AnnotationMemberKey_2_4_solveCSP_bindingFBBBBBBBBB(AnnotationMemberKey _this,
			IsApplicableMatch isApplicableMatch, ASTNodeToTAnnotatable ownerToWoner, AnnotationMemberValuePair mValue,
			Annotation mAnnotation, AnnotationToTAnnotation annotationToTAnnotation, TAnnotation tAnnotation,
			TAnnotatable tOwner, BodyDeclaration mOwner) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, ownerToWoner, mValue, mAnnotation,
				annotationToTAnnotation, tAnnotation, tOwner, mOwner);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, ownerToWoner, mValue, mAnnotation,
					annotationToTAnnotation, tAnnotation, tOwner, mOwner };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberKey_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_AnnotationMemberKey_2_4_solveCSP_bindingAndBlackFBBBBBBBBB(
			AnnotationMemberKey _this, IsApplicableMatch isApplicableMatch, ASTNodeToTAnnotatable ownerToWoner,
			AnnotationMemberValuePair mValue, Annotation mAnnotation, AnnotationToTAnnotation annotationToTAnnotation,
			TAnnotation tAnnotation, TAnnotatable tOwner, BodyDeclaration mOwner) {
		Object[] result_pattern_AnnotationMemberKey_2_4_solveCSP_binding = pattern_AnnotationMemberKey_2_4_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, ownerToWoner, mValue, mAnnotation, annotationToTAnnotation, tAnnotation,
				tOwner, mOwner);
		if (result_pattern_AnnotationMemberKey_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_AnnotationMemberKey_2_4_solveCSP_binding[0];

			Object[] result_pattern_AnnotationMemberKey_2_4_solveCSP_black = pattern_AnnotationMemberKey_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_AnnotationMemberKey_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, ownerToWoner, mValue, mAnnotation,
						annotationToTAnnotation, tAnnotation, tOwner, mOwner };
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
			Match match, TAnnotationValue tAnnotationValue, TAnnotation tAnnotation, TAnnotatable tOwner) {
		return new Object[] { _this, match, tAnnotationValue, tAnnotation, tOwner };
	}

	public static final Object[] pattern_AnnotationMemberKey_10_2_SolveCSP_bindingFBBBBB(AnnotationMemberKey _this,
			Match match, TAnnotationValue tAnnotationValue, TAnnotation tAnnotation, TAnnotatable tOwner) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, tAnnotationValue, tAnnotation, tOwner);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, tAnnotationValue, tAnnotation, tOwner };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberKey_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_AnnotationMemberKey_10_2_SolveCSP_bindingAndBlackFBBBBB(
			AnnotationMemberKey _this, Match match, TAnnotationValue tAnnotationValue, TAnnotation tAnnotation,
			TAnnotatable tOwner) {
		Object[] result_pattern_AnnotationMemberKey_10_2_SolveCSP_binding = pattern_AnnotationMemberKey_10_2_SolveCSP_bindingFBBBBB(
				_this, match, tAnnotationValue, tAnnotation, tOwner);
		if (result_pattern_AnnotationMemberKey_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_AnnotationMemberKey_10_2_SolveCSP_binding[0];

			Object[] result_pattern_AnnotationMemberKey_10_2_SolveCSP_black = pattern_AnnotationMemberKey_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_AnnotationMemberKey_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, tAnnotationValue, tAnnotation, tOwner };
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
			TAnnotationValue tAnnotationValue, TAnnotation tAnnotation, TAnnotatable tOwner) {
		return new Object[] { match, tAnnotationValue, tAnnotation, tOwner };
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
			TAnnotationValue tAnnotationValue, TAnnotation tAnnotation, TAnnotatable tOwner) {
		return new Object[] { match, tAnnotationValue, tAnnotation, tOwner };
	}

	public static final Object[] pattern_AnnotationMemberKey_10_5_collectcontextelements_greenBBBFF(Match match,
			TAnnotation tAnnotation, TAnnotatable tOwner) {
		EMoflonEdge tOwner__tAnnotation____tAnnotation = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAnnotation__tOwner____tAnnotated = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(tAnnotation);
		match.getContextNodes().add(tOwner);
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
		return new Object[] { match, tAnnotation, tOwner, tOwner__tAnnotation____tAnnotation,
				tAnnotation__tOwner____tAnnotated };
	}

	public static final void pattern_AnnotationMemberKey_10_6_registerobjectstomatch_expressionBBBBB(
			AnnotationMemberKey _this, Match match, TAnnotationValue tAnnotationValue, TAnnotation tAnnotation,
			TAnnotatable tOwner) {
		_this.registerObjectsToMatch_BWD(match, tAnnotationValue, tAnnotation, tOwner);

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
		EObject _localVariable_0 = isApplicableMatch.getObject("ownerToWoner");
		EObject _localVariable_1 = isApplicableMatch.getObject("mAnnotation");
		EObject _localVariable_2 = isApplicableMatch.getObject("annotationToTAnnotation");
		EObject _localVariable_3 = isApplicableMatch.getObject("tAnnotationValue");
		EObject _localVariable_4 = isApplicableMatch.getObject("tAnnotation");
		EObject _localVariable_5 = isApplicableMatch.getObject("tOwner");
		EObject _localVariable_6 = isApplicableMatch.getObject("mOwner");
		EObject tmpOwnerToWoner = _localVariable_0;
		EObject tmpMAnnotation = _localVariable_1;
		EObject tmpAnnotationToTAnnotation = _localVariable_2;
		EObject tmpTAnnotationValue = _localVariable_3;
		EObject tmpTAnnotation = _localVariable_4;
		EObject tmpTOwner = _localVariable_5;
		EObject tmpMOwner = _localVariable_6;
		if (tmpOwnerToWoner instanceof ASTNodeToTAnnotatable) {
			ASTNodeToTAnnotatable ownerToWoner = (ASTNodeToTAnnotatable) tmpOwnerToWoner;
			if (tmpMAnnotation instanceof Annotation) {
				Annotation mAnnotation = (Annotation) tmpMAnnotation;
				if (tmpAnnotationToTAnnotation instanceof AnnotationToTAnnotation) {
					AnnotationToTAnnotation annotationToTAnnotation = (AnnotationToTAnnotation) tmpAnnotationToTAnnotation;
					if (tmpTAnnotationValue instanceof TAnnotationValue) {
						TAnnotationValue tAnnotationValue = (TAnnotationValue) tmpTAnnotationValue;
						if (tmpTAnnotation instanceof TAnnotation) {
							TAnnotation tAnnotation = (TAnnotation) tmpTAnnotation;
							if (tmpTOwner instanceof TAnnotatable) {
								TAnnotatable tOwner = (TAnnotatable) tmpTOwner;
								if (tmpMOwner instanceof BodyDeclaration) {
									BodyDeclaration mOwner = (BodyDeclaration) tmpMOwner;
									return new Object[] { ownerToWoner, mAnnotation, annotationToTAnnotation,
											tAnnotationValue, tAnnotation, tOwner, mOwner, isApplicableMatch };
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
			ASTNodeToTAnnotatable ownerToWoner, Annotation mAnnotation, AnnotationToTAnnotation annotationToTAnnotation,
			TAnnotationValue tAnnotationValue, TAnnotation tAnnotation, TAnnotatable tOwner, BodyDeclaration mOwner,
			AnnotationMemberKey _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { ownerToWoner, mAnnotation, annotationToTAnnotation, tAnnotationValue, tAnnotation,
						tOwner, mOwner, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberKey_11_1_performtransformation_bindingAndBlackFFFFFFFFBB(
			AnnotationMemberKey _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_AnnotationMemberKey_11_1_performtransformation_binding = pattern_AnnotationMemberKey_11_1_performtransformation_bindingFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_AnnotationMemberKey_11_1_performtransformation_binding != null) {
			ASTNodeToTAnnotatable ownerToWoner = (ASTNodeToTAnnotatable) result_pattern_AnnotationMemberKey_11_1_performtransformation_binding[0];
			Annotation mAnnotation = (Annotation) result_pattern_AnnotationMemberKey_11_1_performtransformation_binding[1];
			AnnotationToTAnnotation annotationToTAnnotation = (AnnotationToTAnnotation) result_pattern_AnnotationMemberKey_11_1_performtransformation_binding[2];
			TAnnotationValue tAnnotationValue = (TAnnotationValue) result_pattern_AnnotationMemberKey_11_1_performtransformation_binding[3];
			TAnnotation tAnnotation = (TAnnotation) result_pattern_AnnotationMemberKey_11_1_performtransformation_binding[4];
			TAnnotatable tOwner = (TAnnotatable) result_pattern_AnnotationMemberKey_11_1_performtransformation_binding[5];
			BodyDeclaration mOwner = (BodyDeclaration) result_pattern_AnnotationMemberKey_11_1_performtransformation_binding[6];

			Object[] result_pattern_AnnotationMemberKey_11_1_performtransformation_black = pattern_AnnotationMemberKey_11_1_performtransformation_blackBBBBBBBFBB(
					ownerToWoner, mAnnotation, annotationToTAnnotation, tAnnotationValue, tAnnotation, tOwner, mOwner,
					_this, isApplicableMatch);
			if (result_pattern_AnnotationMemberKey_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_AnnotationMemberKey_11_1_performtransformation_black[7];

				return new Object[] { ownerToWoner, mAnnotation, annotationToTAnnotation, tAnnotationValue, tAnnotation,
						tOwner, mOwner, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberKey_11_1_performtransformation_greenFBBFB(
			Annotation mAnnotation, TAnnotationValue tAnnotationValue, CSP csp) {
		AnnotationMemberValuePair mValue = JavaFactory.eINSTANCE.createAnnotationMemberValuePair();
		AnnotationMemberValuePairToTAnnotationValue annotationMemberValuePairToTAnnotationValue = PmFactory.eINSTANCE
				.createAnnotationMemberValuePairToTAnnotationValue();
		Object _localVariable_0 = csp.getValue("mValue", "name");
		mAnnotation.getValues().add(mValue);
		annotationMemberValuePairToTAnnotationValue.setTarget(tAnnotationValue);
		annotationMemberValuePairToTAnnotationValue.setSource(mValue);
		String mValue_name_prime = (String) _localVariable_0;
		mValue.setName(mValue_name_prime);
		return new Object[] { mValue, mAnnotation, tAnnotationValue, annotationMemberValuePairToTAnnotationValue, csp };
	}

	public static final Object[] pattern_AnnotationMemberKey_11_2_collecttranslatedelements_blackBBB(
			AnnotationMemberValuePair mValue, TAnnotationValue tAnnotationValue,
			AnnotationMemberValuePairToTAnnotationValue annotationMemberValuePairToTAnnotationValue) {
		return new Object[] { mValue, tAnnotationValue, annotationMemberValuePairToTAnnotationValue };
	}

	public static final Object[] pattern_AnnotationMemberKey_11_2_collecttranslatedelements_greenFBBB(
			AnnotationMemberValuePair mValue, TAnnotationValue tAnnotationValue,
			AnnotationMemberValuePairToTAnnotationValue annotationMemberValuePairToTAnnotationValue) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(mValue);
		ruleresult.getTranslatedElements().add(tAnnotationValue);
		ruleresult.getCreatedLinkElements().add(annotationMemberValuePairToTAnnotationValue);
		return new Object[] { ruleresult, mValue, tAnnotationValue, annotationMemberValuePairToTAnnotationValue };
	}

	public static final Object[] pattern_AnnotationMemberKey_11_3_bookkeepingforedges_blackBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject ownerToWoner, EObject mValue, EObject mAnnotation,
			EObject annotationToTAnnotation, EObject tAnnotationValue, EObject tAnnotation,
			EObject annotationMemberValuePairToTAnnotationValue, EObject tOwner, EObject mOwner) {
		if (!ownerToWoner.equals(tAnnotationValue)) {
			if (!ownerToWoner.equals(tAnnotation)) {
				if (!ownerToWoner.equals(tOwner)) {
					if (!mValue.equals(ownerToWoner)) {
						if (!mValue.equals(tAnnotationValue)) {
							if (!mValue.equals(tAnnotation)) {
								if (!mValue.equals(tOwner)) {
									if (!mAnnotation.equals(ownerToWoner)) {
										if (!mAnnotation.equals(mValue)) {
											if (!mAnnotation.equals(tAnnotationValue)) {
												if (!mAnnotation.equals(tAnnotation)) {
													if (!mAnnotation.equals(tOwner)) {
														if (!mAnnotation.equals(mOwner)) {
															if (!annotationToTAnnotation.equals(ownerToWoner)) {
																if (!annotationToTAnnotation.equals(mValue)) {
																	if (!annotationToTAnnotation.equals(mAnnotation)) {
																		if (!annotationToTAnnotation
																				.equals(tAnnotationValue)) {
																			if (!annotationToTAnnotation
																					.equals(tAnnotation)) {
																				if (!annotationToTAnnotation
																						.equals(tOwner)) {
																					if (!annotationToTAnnotation
																							.equals(mOwner)) {
																						if (!tAnnotationValue
																								.equals(tOwner)) {
																							if (!tAnnotation.equals(
																									tAnnotationValue)) {
																								if (!tAnnotation.equals(
																										tOwner)) {
																									if (!annotationMemberValuePairToTAnnotationValue
																											.equals(ownerToWoner)) {
																										if (!annotationMemberValuePairToTAnnotationValue
																												.equals(mValue)) {
																											if (!annotationMemberValuePairToTAnnotationValue
																													.equals(mAnnotation)) {
																												if (!annotationMemberValuePairToTAnnotationValue
																														.equals(annotationToTAnnotation)) {
																													if (!annotationMemberValuePairToTAnnotationValue
																															.equals(tAnnotationValue)) {
																														if (!annotationMemberValuePairToTAnnotationValue
																																.equals(tAnnotation)) {
																															if (!annotationMemberValuePairToTAnnotationValue
																																	.equals(tOwner)) {
																																if (!annotationMemberValuePairToTAnnotationValue
																																		.equals(mOwner)) {
																																	if (!mOwner
																																			.equals(ownerToWoner)) {
																																		if (!mOwner
																																				.equals(mValue)) {
																																			if (!mOwner
																																					.equals(tAnnotationValue)) {
																																				if (!mOwner
																																						.equals(tAnnotation)) {
																																					if (!mOwner
																																							.equals(tOwner)) {
																																						return new Object[] {
																																								ruleresult,
																																								ownerToWoner,
																																								mValue,
																																								mAnnotation,
																																								annotationToTAnnotation,
																																								tAnnotationValue,
																																								tAnnotation,
																																								annotationMemberValuePairToTAnnotationValue,
																																								tOwner,
																																								mOwner };
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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
			PerformRuleResult ruleresult, EObject mValue, EObject mAnnotation, EObject tAnnotationValue,
			EObject tAnnotation, EObject annotationMemberValuePairToTAnnotationValue) {
		EMoflonEdge mAnnotation__mValue____values = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge annotationMemberValuePairToTAnnotationValue__tAnnotationValue____target = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge annotationMemberValuePairToTAnnotationValue__mValue____source = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tAnnotation__tAnnotationValue____tValues = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "AnnotationMemberKey";
		String mAnnotation__mValue____values_name_prime = "values";
		String annotationMemberValuePairToTAnnotationValue__tAnnotationValue____target_name_prime = "target";
		String annotationMemberValuePairToTAnnotationValue__mValue____source_name_prime = "source";
		String tAnnotation__tAnnotationValue____tValues_name_prime = "tValues";
		mAnnotation__mValue____values.setSrc(mAnnotation);
		mAnnotation__mValue____values.setTrg(mValue);
		ruleresult.getCreatedEdges().add(mAnnotation__mValue____values);
		annotationMemberValuePairToTAnnotationValue__tAnnotationValue____target
				.setSrc(annotationMemberValuePairToTAnnotationValue);
		annotationMemberValuePairToTAnnotationValue__tAnnotationValue____target.setTrg(tAnnotationValue);
		ruleresult.getCreatedEdges().add(annotationMemberValuePairToTAnnotationValue__tAnnotationValue____target);
		annotationMemberValuePairToTAnnotationValue__mValue____source
				.setSrc(annotationMemberValuePairToTAnnotationValue);
		annotationMemberValuePairToTAnnotationValue__mValue____source.setTrg(mValue);
		ruleresult.getCreatedEdges().add(annotationMemberValuePairToTAnnotationValue__mValue____source);
		tAnnotation__tAnnotationValue____tValues.setSrc(tAnnotation);
		tAnnotation__tAnnotationValue____tValues.setTrg(tAnnotationValue);
		ruleresult.getTranslatedEdges().add(tAnnotation__tAnnotationValue____tValues);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		mAnnotation__mValue____values.setName(mAnnotation__mValue____values_name_prime);
		annotationMemberValuePairToTAnnotationValue__tAnnotationValue____target
				.setName(annotationMemberValuePairToTAnnotationValue__tAnnotationValue____target_name_prime);
		annotationMemberValuePairToTAnnotationValue__mValue____source
				.setName(annotationMemberValuePairToTAnnotationValue__mValue____source_name_prime);
		tAnnotation__tAnnotationValue____tValues.setName(tAnnotation__tAnnotationValue____tValues_name_prime);
		return new Object[] { ruleresult, mValue, mAnnotation, tAnnotationValue, tAnnotation,
				annotationMemberValuePairToTAnnotationValue, mAnnotation__mValue____values,
				annotationMemberValuePairToTAnnotationValue__tAnnotationValue____target,
				annotationMemberValuePairToTAnnotationValue__mValue____source,
				tAnnotation__tAnnotationValue____tValues };
	}

	public static final void pattern_AnnotationMemberKey_11_5_registerobjects_expressionBBBBBBBBBBB(
			AnnotationMemberKey _this, PerformRuleResult ruleresult, EObject ownerToWoner, EObject mValue,
			EObject mAnnotation, EObject annotationToTAnnotation, EObject tAnnotationValue, EObject tAnnotation,
			EObject annotationMemberValuePairToTAnnotationValue, EObject tOwner, EObject mOwner) {
		_this.registerObjects_BWD(ruleresult, ownerToWoner, mValue, mAnnotation, annotationToTAnnotation,
				tAnnotationValue, tAnnotation, annotationMemberValuePairToTAnnotationValue, tOwner, mOwner);

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
		EObject _localVariable_0 = match.getObject("tAnnotationValue");
		EObject _localVariable_1 = match.getObject("tAnnotation");
		EObject _localVariable_2 = match.getObject("tOwner");
		EObject tmpTAnnotationValue = _localVariable_0;
		EObject tmpTAnnotation = _localVariable_1;
		EObject tmpTOwner = _localVariable_2;
		if (tmpTAnnotationValue instanceof TAnnotationValue) {
			TAnnotationValue tAnnotationValue = (TAnnotationValue) tmpTAnnotationValue;
			if (tmpTAnnotation instanceof TAnnotation) {
				TAnnotation tAnnotation = (TAnnotation) tmpTAnnotation;
				if (tmpTOwner instanceof TAnnotatable) {
					TAnnotatable tOwner = (TAnnotatable) tmpTOwner;
					return new Object[] { tAnnotationValue, tAnnotation, tOwner, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_AnnotationMemberKey_12_2_corematch_blackFFFBBBFB(
			TAnnotationValue tAnnotationValue, TAnnotation tAnnotation, TAnnotatable tOwner, Match match) {
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
						_result.add(new Object[] { ownerToWoner, mAnnotation, annotationToTAnnotation, tAnnotationValue,
								tAnnotation, tOwner, mOwner, match });
					}

				}
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_AnnotationMemberKey_12_3_findcontext_blackBBBBBBB(
			ASTNodeToTAnnotatable ownerToWoner, Annotation mAnnotation, AnnotationToTAnnotation annotationToTAnnotation,
			TAnnotationValue tAnnotationValue, TAnnotation tAnnotation, TAnnotatable tOwner, BodyDeclaration mOwner) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (tAnnotation.equals(annotationToTAnnotation.getTarget())) {
			if (mAnnotation.equals(annotationToTAnnotation.getSource())) {
				if (tOwner.getTAnnotation().contains(tAnnotation)) {
					if (mOwner.getAnnotations().contains(mAnnotation)) {
						if (mOwner.equals(ownerToWoner.getSource())) {
							if (tAnnotation.getTValues().contains(tAnnotationValue)) {
								if (tOwner.equals(ownerToWoner.getTarget())) {
									_result.add(new Object[] { ownerToWoner, mAnnotation, annotationToTAnnotation,
											tAnnotationValue, tAnnotation, tOwner, mOwner });
								}
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_AnnotationMemberKey_12_3_findcontext_greenBBBBBBBFFFFFFFFF(
			ASTNodeToTAnnotatable ownerToWoner, Annotation mAnnotation, AnnotationToTAnnotation annotationToTAnnotation,
			TAnnotationValue tAnnotationValue, TAnnotation tAnnotation, TAnnotatable tOwner, BodyDeclaration mOwner) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge annotationToTAnnotation__tAnnotation____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge annotationToTAnnotation__mAnnotation____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tOwner__tAnnotation____tAnnotation = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAnnotation__tOwner____tAnnotated = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mOwner__mAnnotation____annotations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge ownerToWoner__mOwner____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAnnotation__tAnnotationValue____tValues = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge ownerToWoner__tOwner____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String annotationToTAnnotation__tAnnotation____target_name_prime = "target";
		String annotationToTAnnotation__mAnnotation____source_name_prime = "source";
		String tOwner__tAnnotation____tAnnotation_name_prime = "tAnnotation";
		String tAnnotation__tOwner____tAnnotated_name_prime = "tAnnotated";
		String mOwner__mAnnotation____annotations_name_prime = "annotations";
		String ownerToWoner__mOwner____source_name_prime = "source";
		String tAnnotation__tAnnotationValue____tValues_name_prime = "tValues";
		String ownerToWoner__tOwner____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(ownerToWoner);
		isApplicableMatch.getAllContextElements().add(mAnnotation);
		isApplicableMatch.getAllContextElements().add(annotationToTAnnotation);
		isApplicableMatch.getAllContextElements().add(tAnnotationValue);
		isApplicableMatch.getAllContextElements().add(tAnnotation);
		isApplicableMatch.getAllContextElements().add(tOwner);
		isApplicableMatch.getAllContextElements().add(mOwner);
		annotationToTAnnotation__tAnnotation____target.setSrc(annotationToTAnnotation);
		annotationToTAnnotation__tAnnotation____target.setTrg(tAnnotation);
		isApplicableMatch.getAllContextElements().add(annotationToTAnnotation__tAnnotation____target);
		annotationToTAnnotation__mAnnotation____source.setSrc(annotationToTAnnotation);
		annotationToTAnnotation__mAnnotation____source.setTrg(mAnnotation);
		isApplicableMatch.getAllContextElements().add(annotationToTAnnotation__mAnnotation____source);
		tOwner__tAnnotation____tAnnotation.setSrc(tOwner);
		tOwner__tAnnotation____tAnnotation.setTrg(tAnnotation);
		isApplicableMatch.getAllContextElements().add(tOwner__tAnnotation____tAnnotation);
		tAnnotation__tOwner____tAnnotated.setSrc(tAnnotation);
		tAnnotation__tOwner____tAnnotated.setTrg(tOwner);
		isApplicableMatch.getAllContextElements().add(tAnnotation__tOwner____tAnnotated);
		mOwner__mAnnotation____annotations.setSrc(mOwner);
		mOwner__mAnnotation____annotations.setTrg(mAnnotation);
		isApplicableMatch.getAllContextElements().add(mOwner__mAnnotation____annotations);
		ownerToWoner__mOwner____source.setSrc(ownerToWoner);
		ownerToWoner__mOwner____source.setTrg(mOwner);
		isApplicableMatch.getAllContextElements().add(ownerToWoner__mOwner____source);
		tAnnotation__tAnnotationValue____tValues.setSrc(tAnnotation);
		tAnnotation__tAnnotationValue____tValues.setTrg(tAnnotationValue);
		isApplicableMatch.getAllContextElements().add(tAnnotation__tAnnotationValue____tValues);
		ownerToWoner__tOwner____target.setSrc(ownerToWoner);
		ownerToWoner__tOwner____target.setTrg(tOwner);
		isApplicableMatch.getAllContextElements().add(ownerToWoner__tOwner____target);
		annotationToTAnnotation__tAnnotation____target
				.setName(annotationToTAnnotation__tAnnotation____target_name_prime);
		annotationToTAnnotation__mAnnotation____source
				.setName(annotationToTAnnotation__mAnnotation____source_name_prime);
		tOwner__tAnnotation____tAnnotation.setName(tOwner__tAnnotation____tAnnotation_name_prime);
		tAnnotation__tOwner____tAnnotated.setName(tAnnotation__tOwner____tAnnotated_name_prime);
		mOwner__mAnnotation____annotations.setName(mOwner__mAnnotation____annotations_name_prime);
		ownerToWoner__mOwner____source.setName(ownerToWoner__mOwner____source_name_prime);
		tAnnotation__tAnnotationValue____tValues.setName(tAnnotation__tAnnotationValue____tValues_name_prime);
		ownerToWoner__tOwner____target.setName(ownerToWoner__tOwner____target_name_prime);
		return new Object[] { ownerToWoner, mAnnotation, annotationToTAnnotation, tAnnotationValue, tAnnotation, tOwner,
				mOwner, isApplicableMatch, annotationToTAnnotation__tAnnotation____target,
				annotationToTAnnotation__mAnnotation____source, tOwner__tAnnotation____tAnnotation,
				tAnnotation__tOwner____tAnnotated, mOwner__mAnnotation____annotations, ownerToWoner__mOwner____source,
				tAnnotation__tAnnotationValue____tValues, ownerToWoner__tOwner____target };
	}

	public static final Object[] pattern_AnnotationMemberKey_12_4_solveCSP_bindingFBBBBBBBBB(AnnotationMemberKey _this,
			IsApplicableMatch isApplicableMatch, ASTNodeToTAnnotatable ownerToWoner, Annotation mAnnotation,
			AnnotationToTAnnotation annotationToTAnnotation, TAnnotationValue tAnnotationValue, TAnnotation tAnnotation,
			TAnnotatable tOwner, BodyDeclaration mOwner) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, ownerToWoner, mAnnotation,
				annotationToTAnnotation, tAnnotationValue, tAnnotation, tOwner, mOwner);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, ownerToWoner, mAnnotation, annotationToTAnnotation,
					tAnnotationValue, tAnnotation, tOwner, mOwner };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberKey_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_AnnotationMemberKey_12_4_solveCSP_bindingAndBlackFBBBBBBBBB(
			AnnotationMemberKey _this, IsApplicableMatch isApplicableMatch, ASTNodeToTAnnotatable ownerToWoner,
			Annotation mAnnotation, AnnotationToTAnnotation annotationToTAnnotation, TAnnotationValue tAnnotationValue,
			TAnnotation tAnnotation, TAnnotatable tOwner, BodyDeclaration mOwner) {
		Object[] result_pattern_AnnotationMemberKey_12_4_solveCSP_binding = pattern_AnnotationMemberKey_12_4_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, ownerToWoner, mAnnotation, annotationToTAnnotation, tAnnotationValue,
				tAnnotation, tOwner, mOwner);
		if (result_pattern_AnnotationMemberKey_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_AnnotationMemberKey_12_4_solveCSP_binding[0];

			Object[] result_pattern_AnnotationMemberKey_12_4_solveCSP_black = pattern_AnnotationMemberKey_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_AnnotationMemberKey_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, ownerToWoner, mAnnotation, annotationToTAnnotation,
						tAnnotationValue, tAnnotation, tOwner, mOwner };
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
						_result.add(new Object[] { tAnnotationValue, tAnnotation, tOwner, _edge_tValues });
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
			AnnotationMemberKey _this, Match match, TAnnotationValue tAnnotationValue, TAnnotation tAnnotation,
			TAnnotatable tOwner) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, tAnnotationValue, tAnnotation, tOwner);
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
						_result.add(new Object[] { mValue, mAnnotation, mOwner, _edge_values });
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
			AnnotationMemberKey _this, Match match, AnnotationMemberValuePair mValue, Annotation mAnnotation,
			BodyDeclaration mOwner) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, mValue, mAnnotation, mOwner);
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

	public static final Object[] pattern_AnnotationMemberKey_24_2_matchsrctrgcontext_bindingFFFFFFBB(Match sourceMatch,
			Match targetMatch) {
		EObject _localVariable_0 = sourceMatch.getObject("mValue");
		EObject _localVariable_1 = sourceMatch.getObject("mAnnotation");
		EObject _localVariable_2 = targetMatch.getObject("tAnnotationValue");
		EObject _localVariable_3 = targetMatch.getObject("tAnnotation");
		EObject _localVariable_4 = targetMatch.getObject("tOwner");
		EObject _localVariable_5 = sourceMatch.getObject("mOwner");
		EObject tmpMValue = _localVariable_0;
		EObject tmpMAnnotation = _localVariable_1;
		EObject tmpTAnnotationValue = _localVariable_2;
		EObject tmpTAnnotation = _localVariable_3;
		EObject tmpTOwner = _localVariable_4;
		EObject tmpMOwner = _localVariable_5;
		if (tmpMValue instanceof AnnotationMemberValuePair) {
			AnnotationMemberValuePair mValue = (AnnotationMemberValuePair) tmpMValue;
			if (tmpMAnnotation instanceof Annotation) {
				Annotation mAnnotation = (Annotation) tmpMAnnotation;
				if (tmpTAnnotationValue instanceof TAnnotationValue) {
					TAnnotationValue tAnnotationValue = (TAnnotationValue) tmpTAnnotationValue;
					if (tmpTAnnotation instanceof TAnnotation) {
						TAnnotation tAnnotation = (TAnnotation) tmpTAnnotation;
						if (tmpTOwner instanceof TAnnotatable) {
							TAnnotatable tOwner = (TAnnotatable) tmpTOwner;
							if (tmpMOwner instanceof BodyDeclaration) {
								BodyDeclaration mOwner = (BodyDeclaration) tmpMOwner;
								return new Object[] { mValue, mAnnotation, tAnnotationValue, tAnnotation, tOwner,
										mOwner, sourceMatch, targetMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberKey_24_2_matchsrctrgcontext_blackBBBBBBBB(
			AnnotationMemberValuePair mValue, Annotation mAnnotation, TAnnotationValue tAnnotationValue,
			TAnnotation tAnnotation, TAnnotatable tOwner, BodyDeclaration mOwner, Match sourceMatch,
			Match targetMatch) {
		if (!sourceMatch.equals(targetMatch)) {
			return new Object[] { mValue, mAnnotation, tAnnotationValue, tAnnotation, tOwner, mOwner, sourceMatch,
					targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberKey_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_AnnotationMemberKey_24_2_matchsrctrgcontext_binding = pattern_AnnotationMemberKey_24_2_matchsrctrgcontext_bindingFFFFFFBB(
				sourceMatch, targetMatch);
		if (result_pattern_AnnotationMemberKey_24_2_matchsrctrgcontext_binding != null) {
			AnnotationMemberValuePair mValue = (AnnotationMemberValuePair) result_pattern_AnnotationMemberKey_24_2_matchsrctrgcontext_binding[0];
			Annotation mAnnotation = (Annotation) result_pattern_AnnotationMemberKey_24_2_matchsrctrgcontext_binding[1];
			TAnnotationValue tAnnotationValue = (TAnnotationValue) result_pattern_AnnotationMemberKey_24_2_matchsrctrgcontext_binding[2];
			TAnnotation tAnnotation = (TAnnotation) result_pattern_AnnotationMemberKey_24_2_matchsrctrgcontext_binding[3];
			TAnnotatable tOwner = (TAnnotatable) result_pattern_AnnotationMemberKey_24_2_matchsrctrgcontext_binding[4];
			BodyDeclaration mOwner = (BodyDeclaration) result_pattern_AnnotationMemberKey_24_2_matchsrctrgcontext_binding[5];

			Object[] result_pattern_AnnotationMemberKey_24_2_matchsrctrgcontext_black = pattern_AnnotationMemberKey_24_2_matchsrctrgcontext_blackBBBBBBBB(
					mValue, mAnnotation, tAnnotationValue, tAnnotation, tOwner, mOwner, sourceMatch, targetMatch);
			if (result_pattern_AnnotationMemberKey_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { mValue, mAnnotation, tAnnotationValue, tAnnotation, tOwner, mOwner, sourceMatch,
						targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberKey_24_3_solvecsp_bindingFBBBBBBBBB(AnnotationMemberKey _this,
			AnnotationMemberValuePair mValue, Annotation mAnnotation, TAnnotationValue tAnnotationValue,
			TAnnotation tAnnotation, TAnnotatable tOwner, BodyDeclaration mOwner, Match sourceMatch,
			Match targetMatch) {
		CSP _localVariable_6 = _this.isApplicable_solveCsp_CC(mValue, mAnnotation, tAnnotationValue, tAnnotation,
				tOwner, mOwner, sourceMatch, targetMatch);
		CSP csp = _localVariable_6;
		if (csp != null) {
			return new Object[] { csp, _this, mValue, mAnnotation, tAnnotationValue, tAnnotation, tOwner, mOwner,
					sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberKey_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_AnnotationMemberKey_24_3_solvecsp_bindingAndBlackFBBBBBBBBB(
			AnnotationMemberKey _this, AnnotationMemberValuePair mValue, Annotation mAnnotation,
			TAnnotationValue tAnnotationValue, TAnnotation tAnnotation, TAnnotatable tOwner, BodyDeclaration mOwner,
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_AnnotationMemberKey_24_3_solvecsp_binding = pattern_AnnotationMemberKey_24_3_solvecsp_bindingFBBBBBBBBB(
				_this, mValue, mAnnotation, tAnnotationValue, tAnnotation, tOwner, mOwner, sourceMatch, targetMatch);
		if (result_pattern_AnnotationMemberKey_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_AnnotationMemberKey_24_3_solvecsp_binding[0];

			Object[] result_pattern_AnnotationMemberKey_24_3_solvecsp_black = pattern_AnnotationMemberKey_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_AnnotationMemberKey_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, mValue, mAnnotation, tAnnotationValue, tAnnotation, tOwner, mOwner,
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

	public static final Iterable<Object[]> pattern_AnnotationMemberKey_24_5_matchcorrcontext_blackFBFBBBBB(
			Annotation mAnnotation, TAnnotation tAnnotation, TAnnotatable tOwner, BodyDeclaration mOwner,
			Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (AnnotationToTAnnotation annotationToTAnnotation : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(tAnnotation, AnnotationToTAnnotation.class, "target")) {
				if (mAnnotation.equals(annotationToTAnnotation.getSource())) {
					for (ASTNodeToTAnnotatable ownerToWoner : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(mOwner, ASTNodeToTAnnotatable.class, "source")) {
						if (tOwner.equals(ownerToWoner.getTarget())) {
							_result.add(new Object[] { ownerToWoner, mAnnotation, annotationToTAnnotation, tAnnotation,
									tOwner, mOwner, sourceMatch, targetMatch });
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_AnnotationMemberKey_24_5_matchcorrcontext_greenBBBBF(
			ASTNodeToTAnnotatable ownerToWoner, AnnotationToTAnnotation annotationToTAnnotation, Match sourceMatch,
			Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "AnnotationMemberKey";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(ownerToWoner);
		ccMatch.getAllContextElements().add(annotationToTAnnotation);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { ownerToWoner, annotationToTAnnotation, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_AnnotationMemberKey_24_6_createcorrespondence_blackBBBBBBB(
			AnnotationMemberValuePair mValue, Annotation mAnnotation, TAnnotationValue tAnnotationValue,
			TAnnotation tAnnotation, TAnnotatable tOwner, BodyDeclaration mOwner, CCMatch ccMatch) {
		return new Object[] { mValue, mAnnotation, tAnnotationValue, tAnnotation, tOwner, mOwner, ccMatch };
	}

	public static final Object[] pattern_AnnotationMemberKey_24_6_createcorrespondence_greenBBFB(
			AnnotationMemberValuePair mValue, TAnnotationValue tAnnotationValue, CCMatch ccMatch) {
		AnnotationMemberValuePairToTAnnotationValue annotationMemberValuePairToTAnnotationValue = PmFactory.eINSTANCE
				.createAnnotationMemberValuePairToTAnnotationValue();
		annotationMemberValuePairToTAnnotationValue.setTarget(tAnnotationValue);
		annotationMemberValuePairToTAnnotationValue.setSource(mValue);
		ccMatch.getCreateCorr().add(annotationMemberValuePairToTAnnotationValue);
		return new Object[] { mValue, tAnnotationValue, annotationMemberValuePairToTAnnotationValue, ccMatch };
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

	public static final Object[] pattern_AnnotationMemberKey_27_1_matchtggpattern_blackBBB(
			AnnotationMemberValuePair mValue, Annotation mAnnotation, BodyDeclaration mOwner) {
		if (mAnnotation.getValues().contains(mValue)) {
			if (mOwner.getAnnotations().contains(mAnnotation)) {
				return new Object[] { mValue, mAnnotation, mOwner };
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

	public static final Object[] pattern_AnnotationMemberKey_28_1_matchtggpattern_blackBBB(
			TAnnotationValue tAnnotationValue, TAnnotation tAnnotation, TAnnotatable tOwner) {
		if (tOwner.getTAnnotation().contains(tAnnotation)) {
			if (tAnnotation.getTValues().contains(tAnnotationValue)) {
				return new Object[] { tAnnotationValue, tAnnotation, tOwner };
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
			ModelgeneratorRuleResult ruleResult, ASTNodeToTAnnotatable ownerToWoner) {
		if (ruleResult.getCorrObjects().contains(ownerToWoner)) {
			return new Object[] { ruleResult, ownerToWoner };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberKey_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, BodyDeclaration mOwner) {
		if (ruleResult.getSourceObjects().contains(mOwner)) {
			return new Object[] { ruleResult, mOwner };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberKey_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, Annotation mAnnotation) {
		if (ruleResult.getSourceObjects().contains(mAnnotation)) {
			return new Object[] { ruleResult, mAnnotation };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberKey_29_2_isapplicablecore_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, AnnotationToTAnnotation annotationToTAnnotation) {
		if (ruleResult.getCorrObjects().contains(annotationToTAnnotation)) {
			return new Object[] { ruleResult, annotationToTAnnotation };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberKey_29_2_isapplicablecore_black_nac_4BB(
			ModelgeneratorRuleResult ruleResult, TAnnotation tAnnotation) {
		if (ruleResult.getTargetObjects().contains(tAnnotation)) {
			return new Object[] { ruleResult, tAnnotation };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberKey_29_2_isapplicablecore_black_nac_5BB(
			ModelgeneratorRuleResult ruleResult, TAnnotatable tOwner) {
		if (ruleResult.getTargetObjects().contains(tOwner)) {
			return new Object[] { ruleResult, tOwner };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_AnnotationMemberKey_29_2_isapplicablecore_blackFFFFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList ownerToWonerList : ruleEntryContainer.getRuleEntryList()) {
			for (EObject tmpOwnerToWoner : ownerToWonerList.getEntryObjects()) {
				if (tmpOwnerToWoner instanceof ASTNodeToTAnnotatable) {
					ASTNodeToTAnnotatable ownerToWoner = (ASTNodeToTAnnotatable) tmpOwnerToWoner;
					ASTNode tmpMOwner = ownerToWoner.getSource();
					if (tmpMOwner instanceof BodyDeclaration) {
						BodyDeclaration mOwner = (BodyDeclaration) tmpMOwner;
						TAnnotatable tOwner = ownerToWoner.getTarget();
						if (tOwner != null) {
							if (pattern_AnnotationMemberKey_29_2_isapplicablecore_black_nac_0BB(ruleResult,
									ownerToWoner) == null) {
								if (pattern_AnnotationMemberKey_29_2_isapplicablecore_black_nac_1BB(ruleResult,
										mOwner) == null) {
									if (pattern_AnnotationMemberKey_29_2_isapplicablecore_black_nac_5BB(ruleResult,
											tOwner) == null) {
										for (Annotation mAnnotation : mOwner.getAnnotations()) {
											if (pattern_AnnotationMemberKey_29_2_isapplicablecore_black_nac_2BB(
													ruleResult, mAnnotation) == null) {
												for (TAnnotation tAnnotation : tOwner.getTAnnotation()) {
													if (pattern_AnnotationMemberKey_29_2_isapplicablecore_black_nac_4BB(
															ruleResult, tAnnotation) == null) {
														for (AnnotationToTAnnotation annotationToTAnnotation : org.moflon.core.utilities.eMoflonEMFUtil
																.getOppositeReferenceTyped(mAnnotation,
																		AnnotationToTAnnotation.class, "source")) {
															if (tAnnotation
																	.equals(annotationToTAnnotation.getTarget())) {
																if (pattern_AnnotationMemberKey_29_2_isapplicablecore_black_nac_3BB(
																		ruleResult, annotationToTAnnotation) == null) {
																	_result.add(new Object[] { ownerToWonerList,
																			ownerToWoner, mOwner, mAnnotation,
																			annotationToTAnnotation, tAnnotation,
																			tOwner, ruleEntryContainer, ruleResult });
																}
															}
														}
													}
												}
											}
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
			IsApplicableMatch isApplicableMatch, ASTNodeToTAnnotatable ownerToWoner, Annotation mAnnotation,
			AnnotationToTAnnotation annotationToTAnnotation, TAnnotation tAnnotation, TAnnotatable tOwner,
			BodyDeclaration mOwner, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, ownerToWoner, mAnnotation,
				annotationToTAnnotation, tAnnotation, tOwner, mOwner, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, ownerToWoner, mAnnotation, annotationToTAnnotation,
					tAnnotation, tOwner, mOwner, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberKey_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_AnnotationMemberKey_29_3_solveCSP_bindingAndBlackFBBBBBBBBB(
			AnnotationMemberKey _this, IsApplicableMatch isApplicableMatch, ASTNodeToTAnnotatable ownerToWoner,
			Annotation mAnnotation, AnnotationToTAnnotation annotationToTAnnotation, TAnnotation tAnnotation,
			TAnnotatable tOwner, BodyDeclaration mOwner, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_AnnotationMemberKey_29_3_solveCSP_binding = pattern_AnnotationMemberKey_29_3_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, ownerToWoner, mAnnotation, annotationToTAnnotation, tAnnotation, tOwner,
				mOwner, ruleResult);
		if (result_pattern_AnnotationMemberKey_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_AnnotationMemberKey_29_3_solveCSP_binding[0];

			Object[] result_pattern_AnnotationMemberKey_29_3_solveCSP_black = pattern_AnnotationMemberKey_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_AnnotationMemberKey_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, ownerToWoner, mAnnotation, annotationToTAnnotation,
						tAnnotation, tOwner, mOwner, ruleResult };
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

	public static final Object[] pattern_AnnotationMemberKey_29_5_checknacs_blackBBBBBB(
			ASTNodeToTAnnotatable ownerToWoner, Annotation mAnnotation, AnnotationToTAnnotation annotationToTAnnotation,
			TAnnotation tAnnotation, TAnnotatable tOwner, BodyDeclaration mOwner) {
		return new Object[] { ownerToWoner, mAnnotation, annotationToTAnnotation, tAnnotation, tOwner, mOwner };
	}

	public static final Object[] pattern_AnnotationMemberKey_29_6_perform_blackBBBBBBB(
			ASTNodeToTAnnotatable ownerToWoner, Annotation mAnnotation, AnnotationToTAnnotation annotationToTAnnotation,
			TAnnotation tAnnotation, TAnnotatable tOwner, BodyDeclaration mOwner, ModelgeneratorRuleResult ruleResult) {
		return new Object[] { ownerToWoner, mAnnotation, annotationToTAnnotation, tAnnotation, tOwner, mOwner,
				ruleResult };
	}

	public static final Object[] pattern_AnnotationMemberKey_29_6_perform_greenFBFBFBB(Annotation mAnnotation,
			TAnnotation tAnnotation, ModelgeneratorRuleResult ruleResult, CSP csp) {
		AnnotationMemberValuePair mValue = JavaFactory.eINSTANCE.createAnnotationMemberValuePair();
		TAnnotationValue tAnnotationValue = AnnotationsFactory.eINSTANCE.createTAnnotationValue();
		AnnotationMemberValuePairToTAnnotationValue annotationMemberValuePairToTAnnotationValue = PmFactory.eINSTANCE
				.createAnnotationMemberValuePairToTAnnotationValue();
		Object _localVariable_0 = csp.getValue("mValue", "name");
		Object _localVariable_1 = csp.getValue("tAnnotationValue", "tKey");
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_2 = ruleResult.getIncrementedPerformCount();
		mAnnotation.getValues().add(mValue);
		ruleResult.getSourceObjects().add(mValue);
		tAnnotation.getTValues().add(tAnnotationValue);
		ruleResult.getTargetObjects().add(tAnnotationValue);
		annotationMemberValuePairToTAnnotationValue.setTarget(tAnnotationValue);
		annotationMemberValuePairToTAnnotationValue.setSource(mValue);
		ruleResult.getCorrObjects().add(annotationMemberValuePairToTAnnotationValue);
		String mValue_name_prime = (String) _localVariable_0;
		String tAnnotationValue_tKey_prime = (String) _localVariable_1;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_2);
		mValue.setName(mValue_name_prime);
		tAnnotationValue.setTKey(tAnnotationValue_tKey_prime);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { mValue, mAnnotation, tAnnotationValue, tAnnotation,
				annotationMemberValuePairToTAnnotationValue, ruleResult, csp };
	}

	public static final ModelgeneratorRuleResult pattern_AnnotationMemberKey_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //AnnotationMemberKeyImpl
