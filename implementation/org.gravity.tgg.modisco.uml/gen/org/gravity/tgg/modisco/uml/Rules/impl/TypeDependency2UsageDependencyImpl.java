/**
 */
package org.gravity.tgg.modisco.uml.Rules.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.LinkedList;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;

import org.eclipse.modisco.java.ASTNode;
import org.eclipse.modisco.java.Type;

import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.Usage;

import org.gravity.modisco.MClass;

import org.gravity.tgg.modisco.uml.ASTNode2Element;
import org.gravity.tgg.modisco.uml.JavaPackage2UmlPackage;

import org.gravity.tgg.modisco.uml.Rules.RulesPackage;
import org.gravity.tgg.modisco.uml.Rules.TypeDependency2UsageDependency;

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
 * An implementation of the model object '<em><b>Type Dependency2 Usage Dependency</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class TypeDependency2UsageDependencyImpl extends AbstractRuleImpl implements TypeDependency2UsageDependency {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeDependency2UsageDependencyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getTypeDependency2UsageDependency();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, org.eclipse.modisco.java.Package mPackage, MClass mSrcType,
			Type mTrgType) {

		Object[] result1_black = TypeDependency2UsageDependencyImpl
				.pattern_TypeDependency2UsageDependency_0_1_initialbindings_blackBBBBB(this, match, mPackage, mSrcType,
						mTrgType);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[mPackage] = " + mPackage + ", " + "[mSrcType] = " + mSrcType
					+ ", " + "[mTrgType] = " + mTrgType + ".");
		}

		Object[] result2_bindingAndBlack = TypeDependency2UsageDependencyImpl
				.pattern_TypeDependency2UsageDependency_0_2_SolveCSP_bindingAndBlackFBBBBB(this, match, mPackage,
						mSrcType, mTrgType);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[mPackage] = " + mPackage + ", " + "[mSrcType] = " + mSrcType
					+ ", " + "[mTrgType] = " + mTrgType + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (TypeDependency2UsageDependencyImpl.pattern_TypeDependency2UsageDependency_0_3_CheckCSP_expressionFBB(this,
				csp)) {

			Object[] result4_black = TypeDependency2UsageDependencyImpl
					.pattern_TypeDependency2UsageDependency_0_4_collectelementstobetranslated_blackBBBB(match, mPackage,
							mSrcType, mTrgType);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[mPackage] = " + mPackage + ", " + "[mSrcType] = " + mSrcType + ", " + "[mTrgType] = "
						+ mTrgType + ".");
			}
			TypeDependency2UsageDependencyImpl
					.pattern_TypeDependency2UsageDependency_0_4_collectelementstobetranslated_greenBBBF(match, mSrcType,
							mTrgType);
			//nothing EMoflonEdge mSrcType__mTrgType____dependencies = (EMoflonEdge) result4_green[3];

			Object[] result5_black = TypeDependency2UsageDependencyImpl
					.pattern_TypeDependency2UsageDependency_0_5_collectcontextelements_blackBBBB(match, mPackage,
							mSrcType, mTrgType);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[mPackage] = " + mPackage + ", " + "[mSrcType] = " + mSrcType + ", " + "[mTrgType] = "
						+ mTrgType + ".");
			}
			TypeDependency2UsageDependencyImpl
					.pattern_TypeDependency2UsageDependency_0_5_collectcontextelements_greenBBBBFF(match, mPackage,
							mSrcType, mTrgType);
			//nothing EMoflonEdge mPackage__mSrcType____ownedElements = (EMoflonEdge) result5_green[4];
			//nothing EMoflonEdge mSrcType__mPackage____package = (EMoflonEdge) result5_green[5];

			// 
			TypeDependency2UsageDependencyImpl
					.pattern_TypeDependency2UsageDependency_0_6_registerobjectstomatch_expressionBBBBB(this, match,
							mPackage, mSrcType, mTrgType);
			return TypeDependency2UsageDependencyImpl.pattern_TypeDependency2UsageDependency_0_7_expressionF();
		} else {
			return TypeDependency2UsageDependencyImpl.pattern_TypeDependency2UsageDependency_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = TypeDependency2UsageDependencyImpl
				.pattern_TypeDependency2UsageDependency_1_1_performtransformation_bindingAndBlackFFFFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		org.eclipse.modisco.java.Package mPackage = (org.eclipse.modisco.java.Package) result1_bindingAndBlack[0];
		org.eclipse.uml2.uml.Package uPackage = (org.eclipse.uml2.uml.Package) result1_bindingAndBlack[1];
		MClass mSrcType = (MClass) result1_bindingAndBlack[2];
		Classifier uTrgType = (Classifier) result1_bindingAndBlack[3];
		org.eclipse.uml2.uml.Class uSrcType = (org.eclipse.uml2.uml.Class) result1_bindingAndBlack[4];
		ASTNode2Element trg2Trg = (ASTNode2Element) result1_bindingAndBlack[5];
		Type mTrgType = (Type) result1_bindingAndBlack[6];
		JavaPackage2UmlPackage p2p = (JavaPackage2UmlPackage) result1_bindingAndBlack[7];
		ASTNode2Element src2Src = (ASTNode2Element) result1_bindingAndBlack[8];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[9];
		Object[] result1_green = TypeDependency2UsageDependencyImpl
				.pattern_TypeDependency2UsageDependency_1_1_performtransformation_greenBBBF(uPackage, uTrgType,
						uSrcType);
		Usage uUsage = (Usage) result1_green[3];

		Object[] result2_black = TypeDependency2UsageDependencyImpl
				.pattern_TypeDependency2UsageDependency_1_2_collecttranslatedelements_blackB(uUsage);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[uUsage] = " + uUsage + ".");
		}
		Object[] result2_green = TypeDependency2UsageDependencyImpl
				.pattern_TypeDependency2UsageDependency_1_2_collecttranslatedelements_greenFB(uUsage);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = TypeDependency2UsageDependencyImpl
				.pattern_TypeDependency2UsageDependency_1_3_bookkeepingforedges_blackBBBBBBBBBBB(ruleresult, mPackage,
						uPackage, mSrcType, uTrgType, uSrcType, uUsage, trg2Trg, mTrgType, p2p, src2Src);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[mPackage] = " + mPackage + ", " + "[uPackage] = " + uPackage + ", " + "[mSrcType] = "
					+ mSrcType + ", " + "[uTrgType] = " + uTrgType + ", " + "[uSrcType] = " + uSrcType + ", "
					+ "[uUsage] = " + uUsage + ", " + "[trg2Trg] = " + trg2Trg + ", " + "[mTrgType] = " + mTrgType
					+ ", " + "[p2p] = " + p2p + ", " + "[src2Src] = " + src2Src + ".");
		}
		TypeDependency2UsageDependencyImpl
				.pattern_TypeDependency2UsageDependency_1_3_bookkeepingforedges_greenBBBBBBBFFFF(ruleresult, uPackage,
						mSrcType, uTrgType, uSrcType, uUsage, mTrgType);
		//nothing EMoflonEdge uUsage__uTrgType____supplier = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge uPackage__uUsage____packagedElement = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge uUsage__uSrcType____client = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge mSrcType__mTrgType____dependencies = (EMoflonEdge) result3_green[10];

		// 
		// 
		TypeDependency2UsageDependencyImpl
				.pattern_TypeDependency2UsageDependency_1_5_registerobjects_expressionBBBBBBBBBBBB(this, ruleresult,
						mPackage, uPackage, mSrcType, uTrgType, uSrcType, uUsage, trg2Trg, mTrgType, p2p, src2Src);
		return TypeDependency2UsageDependencyImpl.pattern_TypeDependency2UsageDependency_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = TypeDependency2UsageDependencyImpl
				.pattern_TypeDependency2UsageDependency_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = TypeDependency2UsageDependencyImpl
				.pattern_TypeDependency2UsageDependency_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = TypeDependency2UsageDependencyImpl
				.pattern_TypeDependency2UsageDependency_2_2_corematch_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		org.eclipse.modisco.java.Package mPackage = (org.eclipse.modisco.java.Package) result2_binding[0];
		MClass mSrcType = (MClass) result2_binding[1];
		Type mTrgType = (Type) result2_binding[2];
		for (Object[] result2_black : TypeDependency2UsageDependencyImpl
				.pattern_TypeDependency2UsageDependency_2_2_corematch_blackBFBFFFBFFB(mPackage, mSrcType, mTrgType,
						match)) {
			org.eclipse.uml2.uml.Package uPackage = (org.eclipse.uml2.uml.Package) result2_black[1];
			Classifier uTrgType = (Classifier) result2_black[3];
			org.eclipse.uml2.uml.Class uSrcType = (org.eclipse.uml2.uml.Class) result2_black[4];
			ASTNode2Element trg2Trg = (ASTNode2Element) result2_black[5];
			JavaPackage2UmlPackage p2p = (JavaPackage2UmlPackage) result2_black[7];
			ASTNode2Element src2Src = (ASTNode2Element) result2_black[8];
			// ForEach 
			for (Object[] result3_black : TypeDependency2UsageDependencyImpl
					.pattern_TypeDependency2UsageDependency_2_3_findcontext_blackBBBBBBBBB(mPackage, uPackage, mSrcType,
							uTrgType, uSrcType, trg2Trg, mTrgType, p2p, src2Src)) {
				Object[] result3_green = TypeDependency2UsageDependencyImpl
						.pattern_TypeDependency2UsageDependency_2_3_findcontext_greenBBBBBBBBBFFFFFFFFFFFF(mPackage,
								uPackage, mSrcType, uTrgType, uSrcType, trg2Trg, mTrgType, p2p, src2Src);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[9];
				//nothing EMoflonEdge uPackage__uSrcType____ownedElement = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge uSrcType__uPackage____owner = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge mPackage__mSrcType____ownedElements = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge mSrcType__mPackage____package = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge trg2Trg__mTrgType____source = (EMoflonEdge) result3_green[14];
				//nothing EMoflonEdge p2p__mPackage____source = (EMoflonEdge) result3_green[15];
				//nothing EMoflonEdge p2p__uPackage____target = (EMoflonEdge) result3_green[16];
				//nothing EMoflonEdge src2Src__uSrcType____target = (EMoflonEdge) result3_green[17];
				//nothing EMoflonEdge trg2Trg__uTrgType____target = (EMoflonEdge) result3_green[18];
				//nothing EMoflonEdge src2Src__mSrcType____source = (EMoflonEdge) result3_green[19];
				//nothing EMoflonEdge mSrcType__mTrgType____dependencies = (EMoflonEdge) result3_green[20];

				Object[] result4_bindingAndBlack = TypeDependency2UsageDependencyImpl
						.pattern_TypeDependency2UsageDependency_2_4_solveCSP_bindingAndBlackFBBBBBBBBBBB(this,
								isApplicableMatch, mPackage, uPackage, mSrcType, uTrgType, uSrcType, trg2Trg, mTrgType,
								p2p, src2Src);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[mPackage] = " + mPackage + ", "
							+ "[uPackage] = " + uPackage + ", " + "[mSrcType] = " + mSrcType + ", " + "[uTrgType] = "
							+ uTrgType + ", " + "[uSrcType] = " + uSrcType + ", " + "[trg2Trg] = " + trg2Trg + ", "
							+ "[mTrgType] = " + mTrgType + ", " + "[p2p] = " + p2p + ", " + "[src2Src] = " + src2Src
							+ ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (TypeDependency2UsageDependencyImpl
						.pattern_TypeDependency2UsageDependency_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = TypeDependency2UsageDependencyImpl
							.pattern_TypeDependency2UsageDependency_2_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					TypeDependency2UsageDependencyImpl
							.pattern_TypeDependency2UsageDependency_2_6_addmatchtoruleresult_greenBB(ruleresult,
									isApplicableMatch);

				} else {
				}

			}

		}
		return TypeDependency2UsageDependencyImpl.pattern_TypeDependency2UsageDependency_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, org.eclipse.modisco.java.Package mPackage, MClass mSrcType,
			Type mTrgType) {
		match.registerObject("mPackage", mPackage);
		match.registerObject("mSrcType", mSrcType);
		match.registerObject("mTrgType", mTrgType);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, org.eclipse.modisco.java.Package mPackage, MClass mSrcType,
			Type mTrgType) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, org.eclipse.modisco.java.Package mPackage,
			org.eclipse.uml2.uml.Package uPackage, MClass mSrcType, Classifier uTrgType,
			org.eclipse.uml2.uml.Class uSrcType, ASTNode2Element trg2Trg, Type mTrgType, JavaPackage2UmlPackage p2p,
			ASTNode2Element src2Src) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("mPackage", mPackage);
		isApplicableMatch.registerObject("uPackage", uPackage);
		isApplicableMatch.registerObject("mSrcType", mSrcType);
		isApplicableMatch.registerObject("uTrgType", uTrgType);
		isApplicableMatch.registerObject("uSrcType", uSrcType);
		isApplicableMatch.registerObject("trg2Trg", trg2Trg);
		isApplicableMatch.registerObject("mTrgType", mTrgType);
		isApplicableMatch.registerObject("p2p", p2p);
		isApplicableMatch.registerObject("src2Src", src2Src);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject mPackage, EObject uPackage, EObject mSrcType,
			EObject uTrgType, EObject uSrcType, EObject uUsage, EObject trg2Trg, EObject mTrgType, EObject p2p,
			EObject src2Src) {
		ruleresult.registerObject("mPackage", mPackage);
		ruleresult.registerObject("uPackage", uPackage);
		ruleresult.registerObject("mSrcType", mSrcType);
		ruleresult.registerObject("uTrgType", uTrgType);
		ruleresult.registerObject("uSrcType", uSrcType);
		ruleresult.registerObject("uUsage", uUsage);
		ruleresult.registerObject("trg2Trg", trg2Trg);
		ruleresult.registerObject("mTrgType", mTrgType);
		ruleresult.registerObject("p2p", p2p);
		ruleresult.registerObject("src2Src", src2Src);

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
	public boolean isAppropriate_BWD(Match match, org.eclipse.uml2.uml.Package uPackage, Classifier uTrgType,
			org.eclipse.uml2.uml.Class uSrcType, Usage uUsage) {

		Object[] result1_black = TypeDependency2UsageDependencyImpl
				.pattern_TypeDependency2UsageDependency_10_1_initialbindings_blackBBBBBB(this, match, uPackage,
						uTrgType, uSrcType, uUsage);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[uPackage] = " + uPackage + ", " + "[uTrgType] = " + uTrgType
					+ ", " + "[uSrcType] = " + uSrcType + ", " + "[uUsage] = " + uUsage + ".");
		}

		Object[] result2_bindingAndBlack = TypeDependency2UsageDependencyImpl
				.pattern_TypeDependency2UsageDependency_10_2_SolveCSP_bindingAndBlackFBBBBBB(this, match, uPackage,
						uTrgType, uSrcType, uUsage);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[uPackage] = " + uPackage + ", " + "[uTrgType] = " + uTrgType
					+ ", " + "[uSrcType] = " + uSrcType + ", " + "[uUsage] = " + uUsage + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (TypeDependency2UsageDependencyImpl.pattern_TypeDependency2UsageDependency_10_3_CheckCSP_expressionFBB(this,
				csp)) {

			Object[] result4_black = TypeDependency2UsageDependencyImpl
					.pattern_TypeDependency2UsageDependency_10_4_collectelementstobetranslated_blackBBBBB(match,
							uPackage, uTrgType, uSrcType, uUsage);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[uPackage] = " + uPackage + ", " + "[uTrgType] = " + uTrgType + ", " + "[uSrcType] = "
						+ uSrcType + ", " + "[uUsage] = " + uUsage + ".");
			}
			TypeDependency2UsageDependencyImpl
					.pattern_TypeDependency2UsageDependency_10_4_collectelementstobetranslated_greenBBBBBFFF(match,
							uPackage, uTrgType, uSrcType, uUsage);
			//nothing EMoflonEdge uUsage__uTrgType____supplier = (EMoflonEdge) result4_green[5];
			//nothing EMoflonEdge uPackage__uUsage____packagedElement = (EMoflonEdge) result4_green[6];
			//nothing EMoflonEdge uUsage__uSrcType____client = (EMoflonEdge) result4_green[7];

			Object[] result5_black = TypeDependency2UsageDependencyImpl
					.pattern_TypeDependency2UsageDependency_10_5_collectcontextelements_blackBBBBB(match, uPackage,
							uTrgType, uSrcType, uUsage);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[uPackage] = " + uPackage + ", " + "[uTrgType] = " + uTrgType + ", " + "[uSrcType] = "
						+ uSrcType + ", " + "[uUsage] = " + uUsage + ".");
			}
			TypeDependency2UsageDependencyImpl
					.pattern_TypeDependency2UsageDependency_10_5_collectcontextelements_greenBBBBFF(match, uPackage,
							uTrgType, uSrcType);
			//nothing EMoflonEdge uPackage__uSrcType____ownedElement = (EMoflonEdge) result5_green[4];
			//nothing EMoflonEdge uSrcType__uPackage____owner = (EMoflonEdge) result5_green[5];

			// 
			TypeDependency2UsageDependencyImpl
					.pattern_TypeDependency2UsageDependency_10_6_registerobjectstomatch_expressionBBBBBB(this, match,
							uPackage, uTrgType, uSrcType, uUsage);
			return TypeDependency2UsageDependencyImpl.pattern_TypeDependency2UsageDependency_10_7_expressionF();
		} else {
			return TypeDependency2UsageDependencyImpl.pattern_TypeDependency2UsageDependency_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = TypeDependency2UsageDependencyImpl
				.pattern_TypeDependency2UsageDependency_11_1_performtransformation_bindingAndBlackFFFFFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		org.eclipse.modisco.java.Package mPackage = (org.eclipse.modisco.java.Package) result1_bindingAndBlack[0];
		org.eclipse.uml2.uml.Package uPackage = (org.eclipse.uml2.uml.Package) result1_bindingAndBlack[1];
		MClass mSrcType = (MClass) result1_bindingAndBlack[2];
		Classifier uTrgType = (Classifier) result1_bindingAndBlack[3];
		org.eclipse.uml2.uml.Class uSrcType = (org.eclipse.uml2.uml.Class) result1_bindingAndBlack[4];
		Usage uUsage = (Usage) result1_bindingAndBlack[5];
		ASTNode2Element trg2Trg = (ASTNode2Element) result1_bindingAndBlack[6];
		Type mTrgType = (Type) result1_bindingAndBlack[7];
		JavaPackage2UmlPackage p2p = (JavaPackage2UmlPackage) result1_bindingAndBlack[8];
		ASTNode2Element src2Src = (ASTNode2Element) result1_bindingAndBlack[9];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[10];
		TypeDependency2UsageDependencyImpl
				.pattern_TypeDependency2UsageDependency_11_1_performtransformation_greenBB(mSrcType, mTrgType);

		Object[] result2_black = TypeDependency2UsageDependencyImpl
				.pattern_TypeDependency2UsageDependency_11_2_collecttranslatedelements_blackB(uUsage);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[uUsage] = " + uUsage + ".");
		}
		Object[] result2_green = TypeDependency2UsageDependencyImpl
				.pattern_TypeDependency2UsageDependency_11_2_collecttranslatedelements_greenFB(uUsage);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = TypeDependency2UsageDependencyImpl
				.pattern_TypeDependency2UsageDependency_11_3_bookkeepingforedges_blackBBBBBBBBBBB(ruleresult, mPackage,
						uPackage, mSrcType, uTrgType, uSrcType, uUsage, trg2Trg, mTrgType, p2p, src2Src);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[mPackage] = " + mPackage + ", " + "[uPackage] = " + uPackage + ", " + "[mSrcType] = "
					+ mSrcType + ", " + "[uTrgType] = " + uTrgType + ", " + "[uSrcType] = " + uSrcType + ", "
					+ "[uUsage] = " + uUsage + ", " + "[trg2Trg] = " + trg2Trg + ", " + "[mTrgType] = " + mTrgType
					+ ", " + "[p2p] = " + p2p + ", " + "[src2Src] = " + src2Src + ".");
		}
		TypeDependency2UsageDependencyImpl
				.pattern_TypeDependency2UsageDependency_11_3_bookkeepingforedges_greenBBBBBBBFFFF(ruleresult, uPackage,
						mSrcType, uTrgType, uSrcType, uUsage, mTrgType);
		//nothing EMoflonEdge uUsage__uTrgType____supplier = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge uPackage__uUsage____packagedElement = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge uUsage__uSrcType____client = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge mSrcType__mTrgType____dependencies = (EMoflonEdge) result3_green[10];

		// 
		// 
		TypeDependency2UsageDependencyImpl
				.pattern_TypeDependency2UsageDependency_11_5_registerobjects_expressionBBBBBBBBBBBB(this, ruleresult,
						mPackage, uPackage, mSrcType, uTrgType, uSrcType, uUsage, trg2Trg, mTrgType, p2p, src2Src);
		return TypeDependency2UsageDependencyImpl.pattern_TypeDependency2UsageDependency_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = TypeDependency2UsageDependencyImpl
				.pattern_TypeDependency2UsageDependency_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = TypeDependency2UsageDependencyImpl
				.pattern_TypeDependency2UsageDependency_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = TypeDependency2UsageDependencyImpl
				.pattern_TypeDependency2UsageDependency_12_2_corematch_bindingFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		org.eclipse.uml2.uml.Package uPackage = (org.eclipse.uml2.uml.Package) result2_binding[0];
		Classifier uTrgType = (Classifier) result2_binding[1];
		org.eclipse.uml2.uml.Class uSrcType = (org.eclipse.uml2.uml.Class) result2_binding[2];
		Usage uUsage = (Usage) result2_binding[3];
		for (Object[] result2_black : TypeDependency2UsageDependencyImpl
				.pattern_TypeDependency2UsageDependency_12_2_corematch_blackFBFBBBFFFFB(uPackage, uTrgType, uSrcType,
						uUsage, match)) {
			org.eclipse.modisco.java.Package mPackage = (org.eclipse.modisco.java.Package) result2_black[0];
			MClass mSrcType = (MClass) result2_black[2];
			ASTNode2Element trg2Trg = (ASTNode2Element) result2_black[6];
			Type mTrgType = (Type) result2_black[7];
			JavaPackage2UmlPackage p2p = (JavaPackage2UmlPackage) result2_black[8];
			ASTNode2Element src2Src = (ASTNode2Element) result2_black[9];
			// ForEach 
			for (Object[] result3_black : TypeDependency2UsageDependencyImpl
					.pattern_TypeDependency2UsageDependency_12_3_findcontext_blackBBBBBBBBBB(mPackage, uPackage,
							mSrcType, uTrgType, uSrcType, uUsage, trg2Trg, mTrgType, p2p, src2Src)) {
				Object[] result3_green = TypeDependency2UsageDependencyImpl
						.pattern_TypeDependency2UsageDependency_12_3_findcontext_greenBBBBBBBBBBFFFFFFFFFFFFFF(mPackage,
								uPackage, mSrcType, uTrgType, uSrcType, uUsage, trg2Trg, mTrgType, p2p, src2Src);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[10];
				//nothing EMoflonEdge uPackage__uSrcType____ownedElement = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge uSrcType__uPackage____owner = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge uUsage__uTrgType____supplier = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge mPackage__mSrcType____ownedElements = (EMoflonEdge) result3_green[14];
				//nothing EMoflonEdge mSrcType__mPackage____package = (EMoflonEdge) result3_green[15];
				//nothing EMoflonEdge uPackage__uUsage____packagedElement = (EMoflonEdge) result3_green[16];
				//nothing EMoflonEdge uUsage__uSrcType____client = (EMoflonEdge) result3_green[17];
				//nothing EMoflonEdge trg2Trg__mTrgType____source = (EMoflonEdge) result3_green[18];
				//nothing EMoflonEdge p2p__mPackage____source = (EMoflonEdge) result3_green[19];
				//nothing EMoflonEdge p2p__uPackage____target = (EMoflonEdge) result3_green[20];
				//nothing EMoflonEdge src2Src__uSrcType____target = (EMoflonEdge) result3_green[21];
				//nothing EMoflonEdge trg2Trg__uTrgType____target = (EMoflonEdge) result3_green[22];
				//nothing EMoflonEdge src2Src__mSrcType____source = (EMoflonEdge) result3_green[23];

				Object[] result4_bindingAndBlack = TypeDependency2UsageDependencyImpl
						.pattern_TypeDependency2UsageDependency_12_4_solveCSP_bindingAndBlackFBBBBBBBBBBBB(this,
								isApplicableMatch, mPackage, uPackage, mSrcType, uTrgType, uSrcType, uUsage, trg2Trg,
								mTrgType, p2p, src2Src);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[mPackage] = " + mPackage + ", "
							+ "[uPackage] = " + uPackage + ", " + "[mSrcType] = " + mSrcType + ", " + "[uTrgType] = "
							+ uTrgType + ", " + "[uSrcType] = " + uSrcType + ", " + "[uUsage] = " + uUsage + ", "
							+ "[trg2Trg] = " + trg2Trg + ", " + "[mTrgType] = " + mTrgType + ", " + "[p2p] = " + p2p
							+ ", " + "[src2Src] = " + src2Src + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (TypeDependency2UsageDependencyImpl
						.pattern_TypeDependency2UsageDependency_12_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = TypeDependency2UsageDependencyImpl
							.pattern_TypeDependency2UsageDependency_12_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					TypeDependency2UsageDependencyImpl
							.pattern_TypeDependency2UsageDependency_12_6_addmatchtoruleresult_greenBB(ruleresult,
									isApplicableMatch);

				} else {
				}

			}

		}
		return TypeDependency2UsageDependencyImpl.pattern_TypeDependency2UsageDependency_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, org.eclipse.uml2.uml.Package uPackage, Classifier uTrgType,
			org.eclipse.uml2.uml.Class uSrcType, Usage uUsage) {
		match.registerObject("uPackage", uPackage);
		match.registerObject("uTrgType", uTrgType);
		match.registerObject("uSrcType", uSrcType);
		match.registerObject("uUsage", uUsage);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, org.eclipse.uml2.uml.Package uPackage, Classifier uTrgType,
			org.eclipse.uml2.uml.Class uSrcType, Usage uUsage) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, org.eclipse.modisco.java.Package mPackage,
			org.eclipse.uml2.uml.Package uPackage, MClass mSrcType, Classifier uTrgType,
			org.eclipse.uml2.uml.Class uSrcType, Usage uUsage, ASTNode2Element trg2Trg, Type mTrgType,
			JavaPackage2UmlPackage p2p, ASTNode2Element src2Src) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("mPackage", mPackage);
		isApplicableMatch.registerObject("uPackage", uPackage);
		isApplicableMatch.registerObject("mSrcType", mSrcType);
		isApplicableMatch.registerObject("uTrgType", uTrgType);
		isApplicableMatch.registerObject("uSrcType", uSrcType);
		isApplicableMatch.registerObject("uUsage", uUsage);
		isApplicableMatch.registerObject("trg2Trg", trg2Trg);
		isApplicableMatch.registerObject("mTrgType", mTrgType);
		isApplicableMatch.registerObject("p2p", p2p);
		isApplicableMatch.registerObject("src2Src", src2Src);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject mPackage, EObject uPackage, EObject mSrcType,
			EObject uTrgType, EObject uSrcType, EObject uUsage, EObject trg2Trg, EObject mTrgType, EObject p2p,
			EObject src2Src) {
		ruleresult.registerObject("mPackage", mPackage);
		ruleresult.registerObject("uPackage", uPackage);
		ruleresult.registerObject("mSrcType", mSrcType);
		ruleresult.registerObject("uTrgType", uTrgType);
		ruleresult.registerObject("uSrcType", uSrcType);
		ruleresult.registerObject("uUsage", uUsage);
		ruleresult.registerObject("trg2Trg", trg2Trg);
		ruleresult.registerObject("mTrgType", mTrgType);
		ruleresult.registerObject("p2p", p2p);
		ruleresult.registerObject("src2Src", src2Src);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("uUsage").eClass()).equals("uml.Usage.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_129(EMoflonEdge _edge_supplier) {

		Object[] result1_bindingAndBlack = TypeDependency2UsageDependencyImpl
				.pattern_TypeDependency2UsageDependency_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = TypeDependency2UsageDependencyImpl
				.pattern_TypeDependency2UsageDependency_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : TypeDependency2UsageDependencyImpl
				.pattern_TypeDependency2UsageDependency_20_2_testcorematchandDECs_blackFFFFB(_edge_supplier)) {
			org.eclipse.uml2.uml.Package uPackage = (org.eclipse.uml2.uml.Package) result2_black[0];
			Classifier uTrgType = (Classifier) result2_black[1];
			org.eclipse.uml2.uml.Class uSrcType = (org.eclipse.uml2.uml.Class) result2_black[2];
			Usage uUsage = (Usage) result2_black[3];
			Object[] result2_green = TypeDependency2UsageDependencyImpl
					.pattern_TypeDependency2UsageDependency_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (TypeDependency2UsageDependencyImpl
					.pattern_TypeDependency2UsageDependency_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(
							this, match, uPackage, uTrgType, uSrcType, uUsage)) {
				// 
				if (TypeDependency2UsageDependencyImpl
						.pattern_TypeDependency2UsageDependency_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = TypeDependency2UsageDependencyImpl
							.pattern_TypeDependency2UsageDependency_20_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					TypeDependency2UsageDependencyImpl
							.pattern_TypeDependency2UsageDependency_20_5_Addmatchtoruleresult_greenBBBB(match,
									__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return TypeDependency2UsageDependencyImpl.pattern_TypeDependency2UsageDependency_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_141(EMoflonEdge _edge_dependencies) {

		Object[] result1_bindingAndBlack = TypeDependency2UsageDependencyImpl
				.pattern_TypeDependency2UsageDependency_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = TypeDependency2UsageDependencyImpl
				.pattern_TypeDependency2UsageDependency_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : TypeDependency2UsageDependencyImpl
				.pattern_TypeDependency2UsageDependency_21_2_testcorematchandDECs_blackFFFB(_edge_dependencies)) {
			org.eclipse.modisco.java.Package mPackage = (org.eclipse.modisco.java.Package) result2_black[0];
			MClass mSrcType = (MClass) result2_black[1];
			Type mTrgType = (Type) result2_black[2];
			Object[] result2_green = TypeDependency2UsageDependencyImpl
					.pattern_TypeDependency2UsageDependency_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (TypeDependency2UsageDependencyImpl
					.pattern_TypeDependency2UsageDependency_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
							this, match, mPackage, mSrcType, mTrgType)) {
				// 
				if (TypeDependency2UsageDependencyImpl
						.pattern_TypeDependency2UsageDependency_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = TypeDependency2UsageDependencyImpl
							.pattern_TypeDependency2UsageDependency_21_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					TypeDependency2UsageDependencyImpl
							.pattern_TypeDependency2UsageDependency_21_5_Addmatchtoruleresult_greenBBBB(match,
									__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return TypeDependency2UsageDependencyImpl.pattern_TypeDependency2UsageDependency_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("TypeDependency2UsageDependency");
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
		ruleResult.setRule("TypeDependency2UsageDependency");
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

		Object[] result1_black = TypeDependency2UsageDependencyImpl
				.pattern_TypeDependency2UsageDependency_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = TypeDependency2UsageDependencyImpl
				.pattern_TypeDependency2UsageDependency_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = TypeDependency2UsageDependencyImpl
				.pattern_TypeDependency2UsageDependency_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFFBB(sourceMatch,
						targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		org.eclipse.modisco.java.Package mPackage = (org.eclipse.modisco.java.Package) result2_bindingAndBlack[0];
		org.eclipse.uml2.uml.Package uPackage = (org.eclipse.uml2.uml.Package) result2_bindingAndBlack[1];
		MClass mSrcType = (MClass) result2_bindingAndBlack[2];
		Classifier uTrgType = (Classifier) result2_bindingAndBlack[3];
		org.eclipse.uml2.uml.Class uSrcType = (org.eclipse.uml2.uml.Class) result2_bindingAndBlack[4];
		Usage uUsage = (Usage) result2_bindingAndBlack[5];
		Type mTrgType = (Type) result2_bindingAndBlack[6];

		Object[] result3_bindingAndBlack = TypeDependency2UsageDependencyImpl
				.pattern_TypeDependency2UsageDependency_24_3_solvecsp_bindingAndBlackFBBBBBBBBBB(this, mPackage,
						uPackage, mSrcType, uTrgType, uSrcType, uUsage, mTrgType, sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[mPackage] = " + mPackage + ", " + "[uPackage] = " + uPackage + ", " + "[mSrcType] = " + mSrcType
					+ ", " + "[uTrgType] = " + uTrgType + ", " + "[uSrcType] = " + uSrcType + ", " + "[uUsage] = "
					+ uUsage + ", " + "[mTrgType] = " + mTrgType + ", " + "[sourceMatch] = " + sourceMatch + ", "
					+ "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (TypeDependency2UsageDependencyImpl.pattern_TypeDependency2UsageDependency_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : TypeDependency2UsageDependencyImpl
					.pattern_TypeDependency2UsageDependency_24_5_matchcorrcontext_blackBBBBBFBFFBB(mPackage, uPackage,
							mSrcType, uTrgType, uSrcType, mTrgType, sourceMatch, targetMatch)) {
				ASTNode2Element trg2Trg = (ASTNode2Element) result5_black[5];
				JavaPackage2UmlPackage p2p = (JavaPackage2UmlPackage) result5_black[7];
				ASTNode2Element src2Src = (ASTNode2Element) result5_black[8];
				Object[] result5_green = TypeDependency2UsageDependencyImpl
						.pattern_TypeDependency2UsageDependency_24_5_matchcorrcontext_greenBBBBBF(trg2Trg, p2p, src2Src,
								sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[5];

				Object[] result6_black = TypeDependency2UsageDependencyImpl
						.pattern_TypeDependency2UsageDependency_24_6_createcorrespondence_blackBBBBBBBB(mPackage,
								uPackage, mSrcType, uTrgType, uSrcType, uUsage, mTrgType, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[mPackage] = " + mPackage
							+ ", " + "[uPackage] = " + uPackage + ", " + "[mSrcType] = " + mSrcType + ", "
							+ "[uTrgType] = " + uTrgType + ", " + "[uSrcType] = " + uSrcType + ", " + "[uUsage] = "
							+ uUsage + ", " + "[mTrgType] = " + mTrgType + ", " + "[ccMatch] = " + ccMatch + ".");
				}

				Object[] result7_black = TypeDependency2UsageDependencyImpl
						.pattern_TypeDependency2UsageDependency_24_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				TypeDependency2UsageDependencyImpl
						.pattern_TypeDependency2UsageDependency_24_7_addtoreturnedresult_greenBB(result, ccMatch);

			}

		} else {
		}
		return TypeDependency2UsageDependencyImpl.pattern_TypeDependency2UsageDependency_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(org.eclipse.modisco.java.Package mPackage,
			org.eclipse.uml2.uml.Package uPackage, MClass mSrcType, Classifier uTrgType,
			org.eclipse.uml2.uml.Class uSrcType, Usage uUsage, Type mTrgType, Match sourceMatch, Match targetMatch) {// Create CSP
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
	public boolean checkDEC_FWD(org.eclipse.modisco.java.Package mPackage, MClass mSrcType, Type mTrgType) {// 
		Object[] result1_black = TypeDependency2UsageDependencyImpl
				.pattern_TypeDependency2UsageDependency_27_1_matchtggpattern_blackBBB(mPackage, mSrcType, mTrgType);
		if (result1_black != null) {
			return TypeDependency2UsageDependencyImpl.pattern_TypeDependency2UsageDependency_27_2_expressionF();
		} else {
			return TypeDependency2UsageDependencyImpl.pattern_TypeDependency2UsageDependency_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(org.eclipse.uml2.uml.Package uPackage, Classifier uTrgType,
			org.eclipse.uml2.uml.Class uSrcType, Usage uUsage) {// 
		Object[] result1_black = TypeDependency2UsageDependencyImpl
				.pattern_TypeDependency2UsageDependency_28_1_matchtggpattern_blackBBBB(uPackage, uTrgType, uSrcType,
						uUsage);
		if (result1_black != null) {
			return TypeDependency2UsageDependencyImpl.pattern_TypeDependency2UsageDependency_28_2_expressionF();
		} else {
			return TypeDependency2UsageDependencyImpl.pattern_TypeDependency2UsageDependency_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer,
			ASTNode2Element src2SrcParameter, ASTNode2Element trg2TrgParameter) {

		Object[] result1_black = TypeDependency2UsageDependencyImpl
				.pattern_TypeDependency2UsageDependency_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = TypeDependency2UsageDependencyImpl
				.pattern_TypeDependency2UsageDependency_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : TypeDependency2UsageDependencyImpl
				.pattern_TypeDependency2UsageDependency_29_2_isapplicablecore_blackFFFFFFFFFFFBB(ruleEntryContainer,
						ruleResult)) {
			//nothing RuleEntryList src2SrcList = (RuleEntryList) result2_black[0];
			org.eclipse.modisco.java.Package mPackage = (org.eclipse.modisco.java.Package) result2_black[1];
			MClass mSrcType = (MClass) result2_black[2];
			ASTNode2Element src2Src = (ASTNode2Element) result2_black[3];
			org.eclipse.uml2.uml.Class uSrcType = (org.eclipse.uml2.uml.Class) result2_black[4];
			org.eclipse.uml2.uml.Package uPackage = (org.eclipse.uml2.uml.Package) result2_black[5];
			JavaPackage2UmlPackage p2p = (JavaPackage2UmlPackage) result2_black[6];
			//nothing RuleEntryList trg2TrgList = (RuleEntryList) result2_black[7];
			Classifier uTrgType = (Classifier) result2_black[8];
			ASTNode2Element trg2Trg = (ASTNode2Element) result2_black[9];
			Type mTrgType = (Type) result2_black[10];

			Object[] result3_bindingAndBlack = TypeDependency2UsageDependencyImpl
					.pattern_TypeDependency2UsageDependency_29_3_solveCSP_bindingAndBlackFBBBBBBBBBBBB(this,
							isApplicableMatch, mPackage, uPackage, mSrcType, uTrgType, uSrcType, trg2Trg, mTrgType, p2p,
							src2Src, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[mPackage] = " + mPackage + ", "
						+ "[uPackage] = " + uPackage + ", " + "[mSrcType] = " + mSrcType + ", " + "[uTrgType] = "
						+ uTrgType + ", " + "[uSrcType] = " + uSrcType + ", " + "[trg2Trg] = " + trg2Trg + ", "
						+ "[mTrgType] = " + mTrgType + ", " + "[p2p] = " + p2p + ", " + "[src2Src] = " + src2Src + ", "
						+ "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (TypeDependency2UsageDependencyImpl
					.pattern_TypeDependency2UsageDependency_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = TypeDependency2UsageDependencyImpl
						.pattern_TypeDependency2UsageDependency_29_5_checknacs_blackBBBBBBBBB(mPackage, uPackage,
								mSrcType, uTrgType, uSrcType, trg2Trg, mTrgType, p2p, src2Src);
				if (result5_black != null) {

					Object[] result6_black = TypeDependency2UsageDependencyImpl
							.pattern_TypeDependency2UsageDependency_29_6_perform_blackBBBBBBBBBB(mPackage, uPackage,
									mSrcType, uTrgType, uSrcType, trg2Trg, mTrgType, p2p, src2Src, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[mPackage] = "
								+ mPackage + ", " + "[uPackage] = " + uPackage + ", " + "[mSrcType] = " + mSrcType
								+ ", " + "[uTrgType] = " + uTrgType + ", " + "[uSrcType] = " + uSrcType + ", "
								+ "[trg2Trg] = " + trg2Trg + ", " + "[mTrgType] = " + mTrgType + ", " + "[p2p] = " + p2p
								+ ", " + "[src2Src] = " + src2Src + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					TypeDependency2UsageDependencyImpl.pattern_TypeDependency2UsageDependency_29_6_perform_greenBBBBFBB(
							uPackage, mSrcType, uTrgType, uSrcType, mTrgType, ruleResult);
					//nothing Usage uUsage = (Usage) result6_green[4];

				} else {
				}

			} else {
			}

		}
		return TypeDependency2UsageDependencyImpl.pattern_TypeDependency2UsageDependency_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch,
			org.eclipse.modisco.java.Package mPackage, org.eclipse.uml2.uml.Package uPackage, MClass mSrcType,
			Classifier uTrgType, org.eclipse.uml2.uml.Class uSrcType, ASTNode2Element trg2Trg, Type mTrgType,
			JavaPackage2UmlPackage p2p, ASTNode2Element src2Src, ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("mPackage", mPackage);
		isApplicableMatch.registerObject("uPackage", uPackage);
		isApplicableMatch.registerObject("mSrcType", mSrcType);
		isApplicableMatch.registerObject("uTrgType", uTrgType);
		isApplicableMatch.registerObject("uSrcType", uSrcType);
		isApplicableMatch.registerObject("trg2Trg", trg2Trg);
		isApplicableMatch.registerObject("mTrgType", mTrgType);
		isApplicableMatch.registerObject("p2p", p2p);
		isApplicableMatch.registerObject("src2Src", src2Src);
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
		case RulesPackage.TYPE_DEPENDENCY2_USAGE_DEPENDENCY___IS_APPROPRIATE_FWD__MATCH_PACKAGE_MCLASS_TYPE:
			return isAppropriate_FWD((Match) arguments.get(0), (org.eclipse.modisco.java.Package) arguments.get(1),
					(MClass) arguments.get(2), (Type) arguments.get(3));
		case RulesPackage.TYPE_DEPENDENCY2_USAGE_DEPENDENCY___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.TYPE_DEPENDENCY2_USAGE_DEPENDENCY___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.TYPE_DEPENDENCY2_USAGE_DEPENDENCY___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_PACKAGE_MCLASS_TYPE:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (org.eclipse.modisco.java.Package) arguments.get(1),
					(MClass) arguments.get(2), (Type) arguments.get(3));
			return null;
		case RulesPackage.TYPE_DEPENDENCY2_USAGE_DEPENDENCY___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_PACKAGE_MCLASS_TYPE:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0),
					(org.eclipse.modisco.java.Package) arguments.get(1), (MClass) arguments.get(2),
					(Type) arguments.get(3));
		case RulesPackage.TYPE_DEPENDENCY2_USAGE_DEPENDENCY___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.TYPE_DEPENDENCY2_USAGE_DEPENDENCY___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_PACKAGE_PACKAGE_MCLASS_CLASSIFIER_CLASS_ASTNODE2ELEMENT_TYPE_JAVAPACKAGE2UMLPACKAGE_ASTNODE2ELEMENT:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0),
					(org.eclipse.modisco.java.Package) arguments.get(1),
					(org.eclipse.uml2.uml.Package) arguments.get(2), (MClass) arguments.get(3),
					(Classifier) arguments.get(4), (org.eclipse.uml2.uml.Class) arguments.get(5),
					(ASTNode2Element) arguments.get(6), (Type) arguments.get(7),
					(JavaPackage2UmlPackage) arguments.get(8), (ASTNode2Element) arguments.get(9));
		case RulesPackage.TYPE_DEPENDENCY2_USAGE_DEPENDENCY___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.TYPE_DEPENDENCY2_USAGE_DEPENDENCY___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10));
			return null;
		case RulesPackage.TYPE_DEPENDENCY2_USAGE_DEPENDENCY___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.TYPE_DEPENDENCY2_USAGE_DEPENDENCY___IS_APPROPRIATE_BWD__MATCH_PACKAGE_CLASSIFIER_CLASS_USAGE:
			return isAppropriate_BWD((Match) arguments.get(0), (org.eclipse.uml2.uml.Package) arguments.get(1),
					(Classifier) arguments.get(2), (org.eclipse.uml2.uml.Class) arguments.get(3),
					(Usage) arguments.get(4));
		case RulesPackage.TYPE_DEPENDENCY2_USAGE_DEPENDENCY___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.TYPE_DEPENDENCY2_USAGE_DEPENDENCY___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.TYPE_DEPENDENCY2_USAGE_DEPENDENCY___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_PACKAGE_CLASSIFIER_CLASS_USAGE:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (org.eclipse.uml2.uml.Package) arguments.get(1),
					(Classifier) arguments.get(2), (org.eclipse.uml2.uml.Class) arguments.get(3),
					(Usage) arguments.get(4));
			return null;
		case RulesPackage.TYPE_DEPENDENCY2_USAGE_DEPENDENCY___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_PACKAGE_CLASSIFIER_CLASS_USAGE:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (org.eclipse.uml2.uml.Package) arguments.get(1),
					(Classifier) arguments.get(2), (org.eclipse.uml2.uml.Class) arguments.get(3),
					(Usage) arguments.get(4));
		case RulesPackage.TYPE_DEPENDENCY2_USAGE_DEPENDENCY___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.TYPE_DEPENDENCY2_USAGE_DEPENDENCY___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_PACKAGE_PACKAGE_MCLASS_CLASSIFIER_CLASS_USAGE_ASTNODE2ELEMENT_TYPE_JAVAPACKAGE2UMLPACKAGE_ASTNODE2ELEMENT:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
					(org.eclipse.modisco.java.Package) arguments.get(1),
					(org.eclipse.uml2.uml.Package) arguments.get(2), (MClass) arguments.get(3),
					(Classifier) arguments.get(4), (org.eclipse.uml2.uml.Class) arguments.get(5),
					(Usage) arguments.get(6), (ASTNode2Element) arguments.get(7), (Type) arguments.get(8),
					(JavaPackage2UmlPackage) arguments.get(9), (ASTNode2Element) arguments.get(10));
		case RulesPackage.TYPE_DEPENDENCY2_USAGE_DEPENDENCY___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.TYPE_DEPENDENCY2_USAGE_DEPENDENCY___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10));
			return null;
		case RulesPackage.TYPE_DEPENDENCY2_USAGE_DEPENDENCY___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.TYPE_DEPENDENCY2_USAGE_DEPENDENCY___IS_APPROPRIATE_BWD_EMOFLON_EDGE_129__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_129((EMoflonEdge) arguments.get(0));
		case RulesPackage.TYPE_DEPENDENCY2_USAGE_DEPENDENCY___IS_APPROPRIATE_FWD_EMOFLON_EDGE_141__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_141((EMoflonEdge) arguments.get(0));
		case RulesPackage.TYPE_DEPENDENCY2_USAGE_DEPENDENCY___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.TYPE_DEPENDENCY2_USAGE_DEPENDENCY___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.TYPE_DEPENDENCY2_USAGE_DEPENDENCY___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.TYPE_DEPENDENCY2_USAGE_DEPENDENCY___IS_APPLICABLE_SOLVE_CSP_CC__PACKAGE_PACKAGE_MCLASS_CLASSIFIER_CLASS_USAGE_TYPE_MATCH_MATCH:
			return isApplicable_solveCsp_CC((org.eclipse.modisco.java.Package) arguments.get(0),
					(org.eclipse.uml2.uml.Package) arguments.get(1), (MClass) arguments.get(2),
					(Classifier) arguments.get(3), (org.eclipse.uml2.uml.Class) arguments.get(4),
					(Usage) arguments.get(5), (Type) arguments.get(6), (Match) arguments.get(7),
					(Match) arguments.get(8));
		case RulesPackage.TYPE_DEPENDENCY2_USAGE_DEPENDENCY___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.TYPE_DEPENDENCY2_USAGE_DEPENDENCY___CHECK_DEC_FWD__PACKAGE_MCLASS_TYPE:
			return checkDEC_FWD((org.eclipse.modisco.java.Package) arguments.get(0), (MClass) arguments.get(1),
					(Type) arguments.get(2));
		case RulesPackage.TYPE_DEPENDENCY2_USAGE_DEPENDENCY___CHECK_DEC_BWD__PACKAGE_CLASSIFIER_CLASS_USAGE:
			return checkDEC_BWD((org.eclipse.uml2.uml.Package) arguments.get(0), (Classifier) arguments.get(1),
					(org.eclipse.uml2.uml.Class) arguments.get(2), (Usage) arguments.get(3));
		case RulesPackage.TYPE_DEPENDENCY2_USAGE_DEPENDENCY___GENERATE_MODEL__RULEENTRYCONTAINER_ASTNODE2ELEMENT_ASTNODE2ELEMENT:
			return generateModel((RuleEntryContainer) arguments.get(0), (ASTNode2Element) arguments.get(1),
					(ASTNode2Element) arguments.get(2));
		case RulesPackage.TYPE_DEPENDENCY2_USAGE_DEPENDENCY___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_PACKAGE_PACKAGE_MCLASS_CLASSIFIER_CLASS_ASTNODE2ELEMENT_TYPE_JAVAPACKAGE2UMLPACKAGE_ASTNODE2ELEMENT_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
					(org.eclipse.modisco.java.Package) arguments.get(1),
					(org.eclipse.uml2.uml.Package) arguments.get(2), (MClass) arguments.get(3),
					(Classifier) arguments.get(4), (org.eclipse.uml2.uml.Class) arguments.get(5),
					(ASTNode2Element) arguments.get(6), (Type) arguments.get(7),
					(JavaPackage2UmlPackage) arguments.get(8), (ASTNode2Element) arguments.get(9),
					(ModelgeneratorRuleResult) arguments.get(10));
		case RulesPackage.TYPE_DEPENDENCY2_USAGE_DEPENDENCY___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_TypeDependency2UsageDependency_0_1_initialbindings_blackBBBBB(
			TypeDependency2UsageDependency _this, Match match, org.eclipse.modisco.java.Package mPackage,
			MClass mSrcType, Type mTrgType) {
		if (!mSrcType.equals(mTrgType)) {
			return new Object[] { _this, match, mPackage, mSrcType, mTrgType };
		}
		return null;
	}

	public static final Object[] pattern_TypeDependency2UsageDependency_0_2_SolveCSP_bindingFBBBBB(
			TypeDependency2UsageDependency _this, Match match, org.eclipse.modisco.java.Package mPackage,
			MClass mSrcType, Type mTrgType) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, mPackage, mSrcType, mTrgType);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, mPackage, mSrcType, mTrgType };
		}
		return null;
	}

	public static final Object[] pattern_TypeDependency2UsageDependency_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_TypeDependency2UsageDependency_0_2_SolveCSP_bindingAndBlackFBBBBB(
			TypeDependency2UsageDependency _this, Match match, org.eclipse.modisco.java.Package mPackage,
			MClass mSrcType, Type mTrgType) {
		Object[] result_pattern_TypeDependency2UsageDependency_0_2_SolveCSP_binding = pattern_TypeDependency2UsageDependency_0_2_SolveCSP_bindingFBBBBB(
				_this, match, mPackage, mSrcType, mTrgType);
		if (result_pattern_TypeDependency2UsageDependency_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_TypeDependency2UsageDependency_0_2_SolveCSP_binding[0];

			Object[] result_pattern_TypeDependency2UsageDependency_0_2_SolveCSP_black = pattern_TypeDependency2UsageDependency_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_TypeDependency2UsageDependency_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, mPackage, mSrcType, mTrgType };
			}
		}
		return null;
	}

	public static final boolean pattern_TypeDependency2UsageDependency_0_3_CheckCSP_expressionFBB(
			TypeDependency2UsageDependency _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_TypeDependency2UsageDependency_0_4_collectelementstobetranslated_blackBBBB(
			Match match, org.eclipse.modisco.java.Package mPackage, MClass mSrcType, Type mTrgType) {
		if (!mSrcType.equals(mTrgType)) {
			return new Object[] { match, mPackage, mSrcType, mTrgType };
		}
		return null;
	}

	public static final Object[] pattern_TypeDependency2UsageDependency_0_4_collectelementstobetranslated_greenBBBF(
			Match match, MClass mSrcType, Type mTrgType) {
		EMoflonEdge mSrcType__mTrgType____dependencies = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String mSrcType__mTrgType____dependencies_name_prime = "dependencies";
		mSrcType__mTrgType____dependencies.setSrc(mSrcType);
		mSrcType__mTrgType____dependencies.setTrg(mTrgType);
		match.getToBeTranslatedEdges().add(mSrcType__mTrgType____dependencies);
		mSrcType__mTrgType____dependencies.setName(mSrcType__mTrgType____dependencies_name_prime);
		return new Object[] { match, mSrcType, mTrgType, mSrcType__mTrgType____dependencies };
	}

	public static final Object[] pattern_TypeDependency2UsageDependency_0_5_collectcontextelements_blackBBBB(
			Match match, org.eclipse.modisco.java.Package mPackage, MClass mSrcType, Type mTrgType) {
		if (!mSrcType.equals(mTrgType)) {
			return new Object[] { match, mPackage, mSrcType, mTrgType };
		}
		return null;
	}

	public static final Object[] pattern_TypeDependency2UsageDependency_0_5_collectcontextelements_greenBBBBFF(
			Match match, org.eclipse.modisco.java.Package mPackage, MClass mSrcType, Type mTrgType) {
		EMoflonEdge mPackage__mSrcType____ownedElements = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSrcType__mPackage____package = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(mPackage);
		match.getContextNodes().add(mSrcType);
		match.getContextNodes().add(mTrgType);
		String mPackage__mSrcType____ownedElements_name_prime = "ownedElements";
		String mSrcType__mPackage____package_name_prime = "package";
		mPackage__mSrcType____ownedElements.setSrc(mPackage);
		mPackage__mSrcType____ownedElements.setTrg(mSrcType);
		match.getContextEdges().add(mPackage__mSrcType____ownedElements);
		mSrcType__mPackage____package.setSrc(mSrcType);
		mSrcType__mPackage____package.setTrg(mPackage);
		match.getContextEdges().add(mSrcType__mPackage____package);
		mPackage__mSrcType____ownedElements.setName(mPackage__mSrcType____ownedElements_name_prime);
		mSrcType__mPackage____package.setName(mSrcType__mPackage____package_name_prime);
		return new Object[] { match, mPackage, mSrcType, mTrgType, mPackage__mSrcType____ownedElements,
				mSrcType__mPackage____package };
	}

	public static final void pattern_TypeDependency2UsageDependency_0_6_registerobjectstomatch_expressionBBBBB(
			TypeDependency2UsageDependency _this, Match match, org.eclipse.modisco.java.Package mPackage,
			MClass mSrcType, Type mTrgType) {
		_this.registerObjectsToMatch_FWD(match, mPackage, mSrcType, mTrgType);

	}

	public static final boolean pattern_TypeDependency2UsageDependency_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_TypeDependency2UsageDependency_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_TypeDependency2UsageDependency_1_1_performtransformation_bindingFFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("mPackage");
		EObject _localVariable_1 = isApplicableMatch.getObject("uPackage");
		EObject _localVariable_2 = isApplicableMatch.getObject("mSrcType");
		EObject _localVariable_3 = isApplicableMatch.getObject("uTrgType");
		EObject _localVariable_4 = isApplicableMatch.getObject("uSrcType");
		EObject _localVariable_5 = isApplicableMatch.getObject("trg2Trg");
		EObject _localVariable_6 = isApplicableMatch.getObject("mTrgType");
		EObject _localVariable_7 = isApplicableMatch.getObject("p2p");
		EObject _localVariable_8 = isApplicableMatch.getObject("src2Src");
		EObject tmpMPackage = _localVariable_0;
		EObject tmpUPackage = _localVariable_1;
		EObject tmpMSrcType = _localVariable_2;
		EObject tmpUTrgType = _localVariable_3;
		EObject tmpUSrcType = _localVariable_4;
		EObject tmpTrg2Trg = _localVariable_5;
		EObject tmpMTrgType = _localVariable_6;
		EObject tmpP2p = _localVariable_7;
		EObject tmpSrc2Src = _localVariable_8;
		if (tmpMPackage instanceof org.eclipse.modisco.java.Package) {
			org.eclipse.modisco.java.Package mPackage = (org.eclipse.modisco.java.Package) tmpMPackage;
			if (tmpUPackage instanceof org.eclipse.uml2.uml.Package) {
				org.eclipse.uml2.uml.Package uPackage = (org.eclipse.uml2.uml.Package) tmpUPackage;
				if (tmpMSrcType instanceof MClass) {
					MClass mSrcType = (MClass) tmpMSrcType;
					if (tmpUTrgType instanceof Classifier) {
						Classifier uTrgType = (Classifier) tmpUTrgType;
						if (tmpUSrcType instanceof org.eclipse.uml2.uml.Class) {
							org.eclipse.uml2.uml.Class uSrcType = (org.eclipse.uml2.uml.Class) tmpUSrcType;
							if (tmpTrg2Trg instanceof ASTNode2Element) {
								ASTNode2Element trg2Trg = (ASTNode2Element) tmpTrg2Trg;
								if (tmpMTrgType instanceof Type) {
									Type mTrgType = (Type) tmpMTrgType;
									if (tmpP2p instanceof JavaPackage2UmlPackage) {
										JavaPackage2UmlPackage p2p = (JavaPackage2UmlPackage) tmpP2p;
										if (tmpSrc2Src instanceof ASTNode2Element) {
											ASTNode2Element src2Src = (ASTNode2Element) tmpSrc2Src;
											return new Object[] { mPackage, uPackage, mSrcType, uTrgType, uSrcType,
													trg2Trg, mTrgType, p2p, src2Src, isApplicableMatch };
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

	public static final Object[] pattern_TypeDependency2UsageDependency_1_1_performtransformation_blackBBBBBBBBBFBB(
			org.eclipse.modisco.java.Package mPackage, org.eclipse.uml2.uml.Package uPackage, MClass mSrcType,
			Classifier uTrgType, org.eclipse.uml2.uml.Class uSrcType, ASTNode2Element trg2Trg, Type mTrgType,
			JavaPackage2UmlPackage p2p, ASTNode2Element src2Src, TypeDependency2UsageDependency _this,
			IsApplicableMatch isApplicableMatch) {
		if (!mSrcType.equals(mTrgType)) {
			if (!uSrcType.equals(uTrgType)) {
				if (!src2Src.equals(trg2Trg)) {
					for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
						if (tmpCsp instanceof CSP) {
							CSP csp = (CSP) tmpCsp;
							return new Object[] { mPackage, uPackage, mSrcType, uTrgType, uSrcType, trg2Trg, mTrgType,
									p2p, src2Src, csp, _this, isApplicableMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_TypeDependency2UsageDependency_1_1_performtransformation_bindingAndBlackFFFFFFFFFFBB(
			TypeDependency2UsageDependency _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_TypeDependency2UsageDependency_1_1_performtransformation_binding = pattern_TypeDependency2UsageDependency_1_1_performtransformation_bindingFFFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_TypeDependency2UsageDependency_1_1_performtransformation_binding != null) {
			org.eclipse.modisco.java.Package mPackage = (org.eclipse.modisco.java.Package) result_pattern_TypeDependency2UsageDependency_1_1_performtransformation_binding[0];
			org.eclipse.uml2.uml.Package uPackage = (org.eclipse.uml2.uml.Package) result_pattern_TypeDependency2UsageDependency_1_1_performtransformation_binding[1];
			MClass mSrcType = (MClass) result_pattern_TypeDependency2UsageDependency_1_1_performtransformation_binding[2];
			Classifier uTrgType = (Classifier) result_pattern_TypeDependency2UsageDependency_1_1_performtransformation_binding[3];
			org.eclipse.uml2.uml.Class uSrcType = (org.eclipse.uml2.uml.Class) result_pattern_TypeDependency2UsageDependency_1_1_performtransformation_binding[4];
			ASTNode2Element trg2Trg = (ASTNode2Element) result_pattern_TypeDependency2UsageDependency_1_1_performtransformation_binding[5];
			Type mTrgType = (Type) result_pattern_TypeDependency2UsageDependency_1_1_performtransformation_binding[6];
			JavaPackage2UmlPackage p2p = (JavaPackage2UmlPackage) result_pattern_TypeDependency2UsageDependency_1_1_performtransformation_binding[7];
			ASTNode2Element src2Src = (ASTNode2Element) result_pattern_TypeDependency2UsageDependency_1_1_performtransformation_binding[8];

			Object[] result_pattern_TypeDependency2UsageDependency_1_1_performtransformation_black = pattern_TypeDependency2UsageDependency_1_1_performtransformation_blackBBBBBBBBBFBB(
					mPackage, uPackage, mSrcType, uTrgType, uSrcType, trg2Trg, mTrgType, p2p, src2Src, _this,
					isApplicableMatch);
			if (result_pattern_TypeDependency2UsageDependency_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_TypeDependency2UsageDependency_1_1_performtransformation_black[9];

				return new Object[] { mPackage, uPackage, mSrcType, uTrgType, uSrcType, trg2Trg, mTrgType, p2p, src2Src,
						csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_TypeDependency2UsageDependency_1_1_performtransformation_greenBBBF(
			org.eclipse.uml2.uml.Package uPackage, Classifier uTrgType, org.eclipse.uml2.uml.Class uSrcType) {
		Usage uUsage = UMLFactory.eINSTANCE.createUsage();
		uUsage.getSuppliers().add(uTrgType);
		uPackage.getPackagedElements().add(uUsage);
		uUsage.getClients().add(uSrcType);
		return new Object[] { uPackage, uTrgType, uSrcType, uUsage };
	}

	public static final Object[] pattern_TypeDependency2UsageDependency_1_2_collecttranslatedelements_blackB(
			Usage uUsage) {
		return new Object[] { uUsage };
	}

	public static final Object[] pattern_TypeDependency2UsageDependency_1_2_collecttranslatedelements_greenFB(
			Usage uUsage) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(uUsage);
		return new Object[] { ruleresult, uUsage };
	}

	public static final Object[] pattern_TypeDependency2UsageDependency_1_3_bookkeepingforedges_blackBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject mPackage, EObject uPackage, EObject mSrcType, EObject uTrgType,
			EObject uSrcType, EObject uUsage, EObject trg2Trg, EObject mTrgType, EObject p2p, EObject src2Src) {
		if (!mPackage.equals(uPackage)) {
			if (!mPackage.equals(mSrcType)) {
				if (!mPackage.equals(uTrgType)) {
					if (!mPackage.equals(uSrcType)) {
						if (!mPackage.equals(uUsage)) {
							if (!mPackage.equals(trg2Trg)) {
								if (!mPackage.equals(mTrgType)) {
									if (!mPackage.equals(p2p)) {
										if (!mPackage.equals(src2Src)) {
											if (!uPackage.equals(uTrgType)) {
												if (!uPackage.equals(uSrcType)) {
													if (!uPackage.equals(uUsage)) {
														if (!mSrcType.equals(uPackage)) {
															if (!mSrcType.equals(uTrgType)) {
																if (!mSrcType.equals(uSrcType)) {
																	if (!mSrcType.equals(uUsage)) {
																		if (!mSrcType.equals(trg2Trg)) {
																			if (!mSrcType.equals(mTrgType)) {
																				if (!mSrcType.equals(p2p)) {
																					if (!mSrcType.equals(src2Src)) {
																						if (!uTrgType.equals(uUsage)) {
																							if (!uSrcType
																									.equals(uTrgType)) {
																								if (!uSrcType.equals(
																										uUsage)) {
																									if (!trg2Trg.equals(
																											uPackage)) {
																										if (!trg2Trg
																												.equals(uTrgType)) {
																											if (!trg2Trg
																													.equals(uSrcType)) {
																												if (!trg2Trg
																														.equals(uUsage)) {
																													if (!mTrgType
																															.equals(uPackage)) {
																														if (!mTrgType
																																.equals(uTrgType)) {
																															if (!mTrgType
																																	.equals(uSrcType)) {
																																if (!mTrgType
																																		.equals(uUsage)) {
																																	if (!mTrgType
																																			.equals(trg2Trg)) {
																																		if (!mTrgType
																																				.equals(p2p)) {
																																			if (!mTrgType
																																					.equals(src2Src)) {
																																				if (!p2p.equals(
																																						uPackage)) {
																																					if (!p2p.equals(
																																							uTrgType)) {
																																						if (!p2p.equals(
																																								uSrcType)) {
																																							if (!p2p.equals(
																																									uUsage)) {
																																								if (!p2p.equals(
																																										trg2Trg)) {
																																									if (!p2p.equals(
																																											src2Src)) {
																																										if (!src2Src
																																												.equals(uPackage)) {
																																											if (!src2Src
																																													.equals(uTrgType)) {
																																												if (!src2Src
																																														.equals(uSrcType)) {
																																													if (!src2Src
																																															.equals(uUsage)) {
																																														if (!src2Src
																																																.equals(trg2Trg)) {
																																															return new Object[] {
																																																	ruleresult,
																																																	mPackage,
																																																	uPackage,
																																																	mSrcType,
																																																	uTrgType,
																																																	uSrcType,
																																																	uUsage,
																																																	trg2Trg,
																																																	mTrgType,
																																																	p2p,
																																																	src2Src };
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_TypeDependency2UsageDependency_1_3_bookkeepingforedges_greenBBBBBBBFFFF(
			PerformRuleResult ruleresult, EObject uPackage, EObject mSrcType, EObject uTrgType, EObject uSrcType,
			EObject uUsage, EObject mTrgType) {
		EMoflonEdge uUsage__uTrgType____supplier = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge uPackage__uUsage____packagedElement = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge uUsage__uSrcType____client = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSrcType__mTrgType____dependencies = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "TypeDependency2UsageDependency";
		String uUsage__uTrgType____supplier_name_prime = "supplier";
		String uPackage__uUsage____packagedElement_name_prime = "packagedElement";
		String uUsage__uSrcType____client_name_prime = "client";
		String mSrcType__mTrgType____dependencies_name_prime = "dependencies";
		uUsage__uTrgType____supplier.setSrc(uUsage);
		uUsage__uTrgType____supplier.setTrg(uTrgType);
		ruleresult.getCreatedEdges().add(uUsage__uTrgType____supplier);
		uPackage__uUsage____packagedElement.setSrc(uPackage);
		uPackage__uUsage____packagedElement.setTrg(uUsage);
		ruleresult.getCreatedEdges().add(uPackage__uUsage____packagedElement);
		uUsage__uSrcType____client.setSrc(uUsage);
		uUsage__uSrcType____client.setTrg(uSrcType);
		ruleresult.getCreatedEdges().add(uUsage__uSrcType____client);
		mSrcType__mTrgType____dependencies.setSrc(mSrcType);
		mSrcType__mTrgType____dependencies.setTrg(mTrgType);
		ruleresult.getTranslatedEdges().add(mSrcType__mTrgType____dependencies);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		uUsage__uTrgType____supplier.setName(uUsage__uTrgType____supplier_name_prime);
		uPackage__uUsage____packagedElement.setName(uPackage__uUsage____packagedElement_name_prime);
		uUsage__uSrcType____client.setName(uUsage__uSrcType____client_name_prime);
		mSrcType__mTrgType____dependencies.setName(mSrcType__mTrgType____dependencies_name_prime);
		return new Object[] { ruleresult, uPackage, mSrcType, uTrgType, uSrcType, uUsage, mTrgType,
				uUsage__uTrgType____supplier, uPackage__uUsage____packagedElement, uUsage__uSrcType____client,
				mSrcType__mTrgType____dependencies };
	}

	public static final void pattern_TypeDependency2UsageDependency_1_5_registerobjects_expressionBBBBBBBBBBBB(
			TypeDependency2UsageDependency _this, PerformRuleResult ruleresult, EObject mPackage, EObject uPackage,
			EObject mSrcType, EObject uTrgType, EObject uSrcType, EObject uUsage, EObject trg2Trg, EObject mTrgType,
			EObject p2p, EObject src2Src) {
		_this.registerObjects_FWD(ruleresult, mPackage, uPackage, mSrcType, uTrgType, uSrcType, uUsage, trg2Trg,
				mTrgType, p2p, src2Src);

	}

	public static final PerformRuleResult pattern_TypeDependency2UsageDependency_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_TypeDependency2UsageDependency_2_1_preparereturnvalue_bindingFB(
			TypeDependency2UsageDependency _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_TypeDependency2UsageDependency_2_1_preparereturnvalue_blackFBB(EClass eClass,
			TypeDependency2UsageDependency _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_TypeDependency2UsageDependency_2_1_preparereturnvalue_bindingAndBlackFFB(
			TypeDependency2UsageDependency _this) {
		Object[] result_pattern_TypeDependency2UsageDependency_2_1_preparereturnvalue_binding = pattern_TypeDependency2UsageDependency_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_TypeDependency2UsageDependency_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_TypeDependency2UsageDependency_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_TypeDependency2UsageDependency_2_1_preparereturnvalue_black = pattern_TypeDependency2UsageDependency_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_TypeDependency2UsageDependency_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_TypeDependency2UsageDependency_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_TypeDependency2UsageDependency_2_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "TypeDependency2UsageDependency";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_TypeDependency2UsageDependency_2_2_corematch_bindingFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("mPackage");
		EObject _localVariable_1 = match.getObject("mSrcType");
		EObject _localVariable_2 = match.getObject("mTrgType");
		EObject tmpMPackage = _localVariable_0;
		EObject tmpMSrcType = _localVariable_1;
		EObject tmpMTrgType = _localVariable_2;
		if (tmpMPackage instanceof org.eclipse.modisco.java.Package) {
			org.eclipse.modisco.java.Package mPackage = (org.eclipse.modisco.java.Package) tmpMPackage;
			if (tmpMSrcType instanceof MClass) {
				MClass mSrcType = (MClass) tmpMSrcType;
				if (tmpMTrgType instanceof Type) {
					Type mTrgType = (Type) tmpMTrgType;
					return new Object[] { mPackage, mSrcType, mTrgType, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_TypeDependency2UsageDependency_2_2_corematch_blackBFBFFFBFFB(
			org.eclipse.modisco.java.Package mPackage, MClass mSrcType, Type mTrgType, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!mSrcType.equals(mTrgType)) {
			for (ASTNode2Element trg2Trg : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(mTrgType,
					ASTNode2Element.class, "source")) {
				Element tmpUTrgType = trg2Trg.getTarget();
				if (tmpUTrgType instanceof Classifier) {
					Classifier uTrgType = (Classifier) tmpUTrgType;
					for (JavaPackage2UmlPackage p2p : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(mPackage, JavaPackage2UmlPackage.class, "source")) {
						org.eclipse.uml2.uml.Package uPackage = p2p.getTarget();
						if (uPackage != null) {
							for (ASTNode2Element src2Src : org.moflon.core.utilities.eMoflonEMFUtil
									.getOppositeReferenceTyped(mSrcType, ASTNode2Element.class, "source")) {
								if (!src2Src.equals(trg2Trg)) {
									Element tmpUSrcType = src2Src.getTarget();
									if (tmpUSrcType instanceof org.eclipse.uml2.uml.Class) {
										org.eclipse.uml2.uml.Class uSrcType = (org.eclipse.uml2.uml.Class) tmpUSrcType;
										if (!uSrcType.equals(uTrgType)) {
											_result.add(new Object[] { mPackage, uPackage, mSrcType, uTrgType, uSrcType,
													trg2Trg, mTrgType, p2p, src2Src, match });
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

	public static final Iterable<Object[]> pattern_TypeDependency2UsageDependency_2_3_findcontext_blackBBBBBBBBB(
			org.eclipse.modisco.java.Package mPackage, org.eclipse.uml2.uml.Package uPackage, MClass mSrcType,
			Classifier uTrgType, org.eclipse.uml2.uml.Class uSrcType, ASTNode2Element trg2Trg, Type mTrgType,
			JavaPackage2UmlPackage p2p, ASTNode2Element src2Src) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!mSrcType.equals(mTrgType)) {
			if (!uSrcType.equals(uTrgType)) {
				if (!src2Src.equals(trg2Trg)) {
					if (uPackage.getOwnedElements().contains(uSrcType)) {
						if (mPackage.getOwnedElements().contains(mSrcType)) {
							if (mTrgType.equals(trg2Trg.getSource())) {
								if (mPackage.equals(p2p.getSource())) {
									if (uPackage.equals(p2p.getTarget())) {
										if (uSrcType.equals(src2Src.getTarget())) {
											if (uTrgType.equals(trg2Trg.getTarget())) {
												if (mSrcType.equals(src2Src.getSource())) {
													if (mSrcType.getDependencies().contains(mTrgType)) {
														_result.add(new Object[] { mPackage, uPackage, mSrcType,
																uTrgType, uSrcType, trg2Trg, mTrgType, p2p, src2Src });
													}
												}
											}
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

	public static final Object[] pattern_TypeDependency2UsageDependency_2_3_findcontext_greenBBBBBBBBBFFFFFFFFFFFF(
			org.eclipse.modisco.java.Package mPackage, org.eclipse.uml2.uml.Package uPackage, MClass mSrcType,
			Classifier uTrgType, org.eclipse.uml2.uml.Class uSrcType, ASTNode2Element trg2Trg, Type mTrgType,
			JavaPackage2UmlPackage p2p, ASTNode2Element src2Src) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge uPackage__uSrcType____ownedElement = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge uSrcType__uPackage____owner = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mPackage__mSrcType____ownedElements = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSrcType__mPackage____package = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge trg2Trg__mTrgType____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge p2p__mPackage____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge p2p__uPackage____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge src2Src__uSrcType____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge trg2Trg__uTrgType____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge src2Src__mSrcType____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSrcType__mTrgType____dependencies = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String uPackage__uSrcType____ownedElement_name_prime = "ownedElement";
		String uSrcType__uPackage____owner_name_prime = "owner";
		String mPackage__mSrcType____ownedElements_name_prime = "ownedElements";
		String mSrcType__mPackage____package_name_prime = "package";
		String trg2Trg__mTrgType____source_name_prime = "source";
		String p2p__mPackage____source_name_prime = "source";
		String p2p__uPackage____target_name_prime = "target";
		String src2Src__uSrcType____target_name_prime = "target";
		String trg2Trg__uTrgType____target_name_prime = "target";
		String src2Src__mSrcType____source_name_prime = "source";
		String mSrcType__mTrgType____dependencies_name_prime = "dependencies";
		isApplicableMatch.getAllContextElements().add(mPackage);
		isApplicableMatch.getAllContextElements().add(uPackage);
		isApplicableMatch.getAllContextElements().add(mSrcType);
		isApplicableMatch.getAllContextElements().add(uTrgType);
		isApplicableMatch.getAllContextElements().add(uSrcType);
		isApplicableMatch.getAllContextElements().add(trg2Trg);
		isApplicableMatch.getAllContextElements().add(mTrgType);
		isApplicableMatch.getAllContextElements().add(p2p);
		isApplicableMatch.getAllContextElements().add(src2Src);
		uPackage__uSrcType____ownedElement.setSrc(uPackage);
		uPackage__uSrcType____ownedElement.setTrg(uSrcType);
		isApplicableMatch.getAllContextElements().add(uPackage__uSrcType____ownedElement);
		uSrcType__uPackage____owner.setSrc(uSrcType);
		uSrcType__uPackage____owner.setTrg(uPackage);
		isApplicableMatch.getAllContextElements().add(uSrcType__uPackage____owner);
		mPackage__mSrcType____ownedElements.setSrc(mPackage);
		mPackage__mSrcType____ownedElements.setTrg(mSrcType);
		isApplicableMatch.getAllContextElements().add(mPackage__mSrcType____ownedElements);
		mSrcType__mPackage____package.setSrc(mSrcType);
		mSrcType__mPackage____package.setTrg(mPackage);
		isApplicableMatch.getAllContextElements().add(mSrcType__mPackage____package);
		trg2Trg__mTrgType____source.setSrc(trg2Trg);
		trg2Trg__mTrgType____source.setTrg(mTrgType);
		isApplicableMatch.getAllContextElements().add(trg2Trg__mTrgType____source);
		p2p__mPackage____source.setSrc(p2p);
		p2p__mPackage____source.setTrg(mPackage);
		isApplicableMatch.getAllContextElements().add(p2p__mPackage____source);
		p2p__uPackage____target.setSrc(p2p);
		p2p__uPackage____target.setTrg(uPackage);
		isApplicableMatch.getAllContextElements().add(p2p__uPackage____target);
		src2Src__uSrcType____target.setSrc(src2Src);
		src2Src__uSrcType____target.setTrg(uSrcType);
		isApplicableMatch.getAllContextElements().add(src2Src__uSrcType____target);
		trg2Trg__uTrgType____target.setSrc(trg2Trg);
		trg2Trg__uTrgType____target.setTrg(uTrgType);
		isApplicableMatch.getAllContextElements().add(trg2Trg__uTrgType____target);
		src2Src__mSrcType____source.setSrc(src2Src);
		src2Src__mSrcType____source.setTrg(mSrcType);
		isApplicableMatch.getAllContextElements().add(src2Src__mSrcType____source);
		mSrcType__mTrgType____dependencies.setSrc(mSrcType);
		mSrcType__mTrgType____dependencies.setTrg(mTrgType);
		isApplicableMatch.getAllContextElements().add(mSrcType__mTrgType____dependencies);
		uPackage__uSrcType____ownedElement.setName(uPackage__uSrcType____ownedElement_name_prime);
		uSrcType__uPackage____owner.setName(uSrcType__uPackage____owner_name_prime);
		mPackage__mSrcType____ownedElements.setName(mPackage__mSrcType____ownedElements_name_prime);
		mSrcType__mPackage____package.setName(mSrcType__mPackage____package_name_prime);
		trg2Trg__mTrgType____source.setName(trg2Trg__mTrgType____source_name_prime);
		p2p__mPackage____source.setName(p2p__mPackage____source_name_prime);
		p2p__uPackage____target.setName(p2p__uPackage____target_name_prime);
		src2Src__uSrcType____target.setName(src2Src__uSrcType____target_name_prime);
		trg2Trg__uTrgType____target.setName(trg2Trg__uTrgType____target_name_prime);
		src2Src__mSrcType____source.setName(src2Src__mSrcType____source_name_prime);
		mSrcType__mTrgType____dependencies.setName(mSrcType__mTrgType____dependencies_name_prime);
		return new Object[] { mPackage, uPackage, mSrcType, uTrgType, uSrcType, trg2Trg, mTrgType, p2p, src2Src,
				isApplicableMatch, uPackage__uSrcType____ownedElement, uSrcType__uPackage____owner,
				mPackage__mSrcType____ownedElements, mSrcType__mPackage____package, trg2Trg__mTrgType____source,
				p2p__mPackage____source, p2p__uPackage____target, src2Src__uSrcType____target,
				trg2Trg__uTrgType____target, src2Src__mSrcType____source, mSrcType__mTrgType____dependencies };
	}

	public static final Object[] pattern_TypeDependency2UsageDependency_2_4_solveCSP_bindingFBBBBBBBBBBB(
			TypeDependency2UsageDependency _this, IsApplicableMatch isApplicableMatch,
			org.eclipse.modisco.java.Package mPackage, org.eclipse.uml2.uml.Package uPackage, MClass mSrcType,
			Classifier uTrgType, org.eclipse.uml2.uml.Class uSrcType, ASTNode2Element trg2Trg, Type mTrgType,
			JavaPackage2UmlPackage p2p, ASTNode2Element src2Src) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, mPackage, uPackage, mSrcType,
				uTrgType, uSrcType, trg2Trg, mTrgType, p2p, src2Src);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mPackage, uPackage, mSrcType, uTrgType, uSrcType,
					trg2Trg, mTrgType, p2p, src2Src };
		}
		return null;
	}

	public static final Object[] pattern_TypeDependency2UsageDependency_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_TypeDependency2UsageDependency_2_4_solveCSP_bindingAndBlackFBBBBBBBBBBB(
			TypeDependency2UsageDependency _this, IsApplicableMatch isApplicableMatch,
			org.eclipse.modisco.java.Package mPackage, org.eclipse.uml2.uml.Package uPackage, MClass mSrcType,
			Classifier uTrgType, org.eclipse.uml2.uml.Class uSrcType, ASTNode2Element trg2Trg, Type mTrgType,
			JavaPackage2UmlPackage p2p, ASTNode2Element src2Src) {
		Object[] result_pattern_TypeDependency2UsageDependency_2_4_solveCSP_binding = pattern_TypeDependency2UsageDependency_2_4_solveCSP_bindingFBBBBBBBBBBB(
				_this, isApplicableMatch, mPackage, uPackage, mSrcType, uTrgType, uSrcType, trg2Trg, mTrgType, p2p,
				src2Src);
		if (result_pattern_TypeDependency2UsageDependency_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_TypeDependency2UsageDependency_2_4_solveCSP_binding[0];

			Object[] result_pattern_TypeDependency2UsageDependency_2_4_solveCSP_black = pattern_TypeDependency2UsageDependency_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_TypeDependency2UsageDependency_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mPackage, uPackage, mSrcType, uTrgType, uSrcType,
						trg2Trg, mTrgType, p2p, src2Src };
			}
		}
		return null;
	}

	public static final boolean pattern_TypeDependency2UsageDependency_2_5_checkCSP_expressionFBB(
			TypeDependency2UsageDependency _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_TypeDependency2UsageDependency_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_TypeDependency2UsageDependency_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "TypeDependency2UsageDependency";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_TypeDependency2UsageDependency_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_TypeDependency2UsageDependency_10_1_initialbindings_blackBBBBBB(
			TypeDependency2UsageDependency _this, Match match, org.eclipse.uml2.uml.Package uPackage,
			Classifier uTrgType, org.eclipse.uml2.uml.Class uSrcType, Usage uUsage) {
		if (!uSrcType.equals(uTrgType)) {
			return new Object[] { _this, match, uPackage, uTrgType, uSrcType, uUsage };
		}
		return null;
	}

	public static final Object[] pattern_TypeDependency2UsageDependency_10_2_SolveCSP_bindingFBBBBBB(
			TypeDependency2UsageDependency _this, Match match, org.eclipse.uml2.uml.Package uPackage,
			Classifier uTrgType, org.eclipse.uml2.uml.Class uSrcType, Usage uUsage) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, uPackage, uTrgType, uSrcType, uUsage);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, uPackage, uTrgType, uSrcType, uUsage };
		}
		return null;
	}

	public static final Object[] pattern_TypeDependency2UsageDependency_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_TypeDependency2UsageDependency_10_2_SolveCSP_bindingAndBlackFBBBBBB(
			TypeDependency2UsageDependency _this, Match match, org.eclipse.uml2.uml.Package uPackage,
			Classifier uTrgType, org.eclipse.uml2.uml.Class uSrcType, Usage uUsage) {
		Object[] result_pattern_TypeDependency2UsageDependency_10_2_SolveCSP_binding = pattern_TypeDependency2UsageDependency_10_2_SolveCSP_bindingFBBBBBB(
				_this, match, uPackage, uTrgType, uSrcType, uUsage);
		if (result_pattern_TypeDependency2UsageDependency_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_TypeDependency2UsageDependency_10_2_SolveCSP_binding[0];

			Object[] result_pattern_TypeDependency2UsageDependency_10_2_SolveCSP_black = pattern_TypeDependency2UsageDependency_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_TypeDependency2UsageDependency_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, uPackage, uTrgType, uSrcType, uUsage };
			}
		}
		return null;
	}

	public static final boolean pattern_TypeDependency2UsageDependency_10_3_CheckCSP_expressionFBB(
			TypeDependency2UsageDependency _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_TypeDependency2UsageDependency_10_4_collectelementstobetranslated_blackBBBBB(
			Match match, org.eclipse.uml2.uml.Package uPackage, Classifier uTrgType,
			org.eclipse.uml2.uml.Class uSrcType, Usage uUsage) {
		if (!uSrcType.equals(uTrgType)) {
			return new Object[] { match, uPackage, uTrgType, uSrcType, uUsage };
		}
		return null;
	}

	public static final Object[] pattern_TypeDependency2UsageDependency_10_4_collectelementstobetranslated_greenBBBBBFFF(
			Match match, org.eclipse.uml2.uml.Package uPackage, Classifier uTrgType,
			org.eclipse.uml2.uml.Class uSrcType, Usage uUsage) {
		EMoflonEdge uUsage__uTrgType____supplier = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge uPackage__uUsage____packagedElement = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge uUsage__uSrcType____client = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(uUsage);
		String uUsage__uTrgType____supplier_name_prime = "supplier";
		String uPackage__uUsage____packagedElement_name_prime = "packagedElement";
		String uUsage__uSrcType____client_name_prime = "client";
		uUsage__uTrgType____supplier.setSrc(uUsage);
		uUsage__uTrgType____supplier.setTrg(uTrgType);
		match.getToBeTranslatedEdges().add(uUsage__uTrgType____supplier);
		uPackage__uUsage____packagedElement.setSrc(uPackage);
		uPackage__uUsage____packagedElement.setTrg(uUsage);
		match.getToBeTranslatedEdges().add(uPackage__uUsage____packagedElement);
		uUsage__uSrcType____client.setSrc(uUsage);
		uUsage__uSrcType____client.setTrg(uSrcType);
		match.getToBeTranslatedEdges().add(uUsage__uSrcType____client);
		uUsage__uTrgType____supplier.setName(uUsage__uTrgType____supplier_name_prime);
		uPackage__uUsage____packagedElement.setName(uPackage__uUsage____packagedElement_name_prime);
		uUsage__uSrcType____client.setName(uUsage__uSrcType____client_name_prime);
		return new Object[] { match, uPackage, uTrgType, uSrcType, uUsage, uUsage__uTrgType____supplier,
				uPackage__uUsage____packagedElement, uUsage__uSrcType____client };
	}

	public static final Object[] pattern_TypeDependency2UsageDependency_10_5_collectcontextelements_blackBBBBB(
			Match match, org.eclipse.uml2.uml.Package uPackage, Classifier uTrgType,
			org.eclipse.uml2.uml.Class uSrcType, Usage uUsage) {
		if (!uSrcType.equals(uTrgType)) {
			return new Object[] { match, uPackage, uTrgType, uSrcType, uUsage };
		}
		return null;
	}

	public static final Object[] pattern_TypeDependency2UsageDependency_10_5_collectcontextelements_greenBBBBFF(
			Match match, org.eclipse.uml2.uml.Package uPackage, Classifier uTrgType,
			org.eclipse.uml2.uml.Class uSrcType) {
		EMoflonEdge uPackage__uSrcType____ownedElement = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge uSrcType__uPackage____owner = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(uPackage);
		match.getContextNodes().add(uTrgType);
		match.getContextNodes().add(uSrcType);
		String uPackage__uSrcType____ownedElement_name_prime = "ownedElement";
		String uSrcType__uPackage____owner_name_prime = "owner";
		uPackage__uSrcType____ownedElement.setSrc(uPackage);
		uPackage__uSrcType____ownedElement.setTrg(uSrcType);
		match.getContextEdges().add(uPackage__uSrcType____ownedElement);
		uSrcType__uPackage____owner.setSrc(uSrcType);
		uSrcType__uPackage____owner.setTrg(uPackage);
		match.getContextEdges().add(uSrcType__uPackage____owner);
		uPackage__uSrcType____ownedElement.setName(uPackage__uSrcType____ownedElement_name_prime);
		uSrcType__uPackage____owner.setName(uSrcType__uPackage____owner_name_prime);
		return new Object[] { match, uPackage, uTrgType, uSrcType, uPackage__uSrcType____ownedElement,
				uSrcType__uPackage____owner };
	}

	public static final void pattern_TypeDependency2UsageDependency_10_6_registerobjectstomatch_expressionBBBBBB(
			TypeDependency2UsageDependency _this, Match match, org.eclipse.uml2.uml.Package uPackage,
			Classifier uTrgType, org.eclipse.uml2.uml.Class uSrcType, Usage uUsage) {
		_this.registerObjectsToMatch_BWD(match, uPackage, uTrgType, uSrcType, uUsage);

	}

	public static final boolean pattern_TypeDependency2UsageDependency_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_TypeDependency2UsageDependency_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_TypeDependency2UsageDependency_11_1_performtransformation_bindingFFFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("mPackage");
		EObject _localVariable_1 = isApplicableMatch.getObject("uPackage");
		EObject _localVariable_2 = isApplicableMatch.getObject("mSrcType");
		EObject _localVariable_3 = isApplicableMatch.getObject("uTrgType");
		EObject _localVariable_4 = isApplicableMatch.getObject("uSrcType");
		EObject _localVariable_5 = isApplicableMatch.getObject("uUsage");
		EObject _localVariable_6 = isApplicableMatch.getObject("trg2Trg");
		EObject _localVariable_7 = isApplicableMatch.getObject("mTrgType");
		EObject _localVariable_8 = isApplicableMatch.getObject("p2p");
		EObject _localVariable_9 = isApplicableMatch.getObject("src2Src");
		EObject tmpMPackage = _localVariable_0;
		EObject tmpUPackage = _localVariable_1;
		EObject tmpMSrcType = _localVariable_2;
		EObject tmpUTrgType = _localVariable_3;
		EObject tmpUSrcType = _localVariable_4;
		EObject tmpUUsage = _localVariable_5;
		EObject tmpTrg2Trg = _localVariable_6;
		EObject tmpMTrgType = _localVariable_7;
		EObject tmpP2p = _localVariable_8;
		EObject tmpSrc2Src = _localVariable_9;
		if (tmpMPackage instanceof org.eclipse.modisco.java.Package) {
			org.eclipse.modisco.java.Package mPackage = (org.eclipse.modisco.java.Package) tmpMPackage;
			if (tmpUPackage instanceof org.eclipse.uml2.uml.Package) {
				org.eclipse.uml2.uml.Package uPackage = (org.eclipse.uml2.uml.Package) tmpUPackage;
				if (tmpMSrcType instanceof MClass) {
					MClass mSrcType = (MClass) tmpMSrcType;
					if (tmpUTrgType instanceof Classifier) {
						Classifier uTrgType = (Classifier) tmpUTrgType;
						if (tmpUSrcType instanceof org.eclipse.uml2.uml.Class) {
							org.eclipse.uml2.uml.Class uSrcType = (org.eclipse.uml2.uml.Class) tmpUSrcType;
							if (tmpUUsage instanceof Usage) {
								Usage uUsage = (Usage) tmpUUsage;
								if (tmpTrg2Trg instanceof ASTNode2Element) {
									ASTNode2Element trg2Trg = (ASTNode2Element) tmpTrg2Trg;
									if (tmpMTrgType instanceof Type) {
										Type mTrgType = (Type) tmpMTrgType;
										if (tmpP2p instanceof JavaPackage2UmlPackage) {
											JavaPackage2UmlPackage p2p = (JavaPackage2UmlPackage) tmpP2p;
											if (tmpSrc2Src instanceof ASTNode2Element) {
												ASTNode2Element src2Src = (ASTNode2Element) tmpSrc2Src;
												return new Object[] { mPackage, uPackage, mSrcType, uTrgType, uSrcType,
														uUsage, trg2Trg, mTrgType, p2p, src2Src, isApplicableMatch };
											}
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

	public static final Object[] pattern_TypeDependency2UsageDependency_11_1_performtransformation_blackBBBBBBBBBBFBB(
			org.eclipse.modisco.java.Package mPackage, org.eclipse.uml2.uml.Package uPackage, MClass mSrcType,
			Classifier uTrgType, org.eclipse.uml2.uml.Class uSrcType, Usage uUsage, ASTNode2Element trg2Trg,
			Type mTrgType, JavaPackage2UmlPackage p2p, ASTNode2Element src2Src, TypeDependency2UsageDependency _this,
			IsApplicableMatch isApplicableMatch) {
		if (!mSrcType.equals(mTrgType)) {
			if (!uSrcType.equals(uTrgType)) {
				if (!src2Src.equals(trg2Trg)) {
					for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
						if (tmpCsp instanceof CSP) {
							CSP csp = (CSP) tmpCsp;
							return new Object[] { mPackage, uPackage, mSrcType, uTrgType, uSrcType, uUsage, trg2Trg,
									mTrgType, p2p, src2Src, csp, _this, isApplicableMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_TypeDependency2UsageDependency_11_1_performtransformation_bindingAndBlackFFFFFFFFFFFBB(
			TypeDependency2UsageDependency _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_TypeDependency2UsageDependency_11_1_performtransformation_binding = pattern_TypeDependency2UsageDependency_11_1_performtransformation_bindingFFFFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_TypeDependency2UsageDependency_11_1_performtransformation_binding != null) {
			org.eclipse.modisco.java.Package mPackage = (org.eclipse.modisco.java.Package) result_pattern_TypeDependency2UsageDependency_11_1_performtransformation_binding[0];
			org.eclipse.uml2.uml.Package uPackage = (org.eclipse.uml2.uml.Package) result_pattern_TypeDependency2UsageDependency_11_1_performtransformation_binding[1];
			MClass mSrcType = (MClass) result_pattern_TypeDependency2UsageDependency_11_1_performtransformation_binding[2];
			Classifier uTrgType = (Classifier) result_pattern_TypeDependency2UsageDependency_11_1_performtransformation_binding[3];
			org.eclipse.uml2.uml.Class uSrcType = (org.eclipse.uml2.uml.Class) result_pattern_TypeDependency2UsageDependency_11_1_performtransformation_binding[4];
			Usage uUsage = (Usage) result_pattern_TypeDependency2UsageDependency_11_1_performtransformation_binding[5];
			ASTNode2Element trg2Trg = (ASTNode2Element) result_pattern_TypeDependency2UsageDependency_11_1_performtransformation_binding[6];
			Type mTrgType = (Type) result_pattern_TypeDependency2UsageDependency_11_1_performtransformation_binding[7];
			JavaPackage2UmlPackage p2p = (JavaPackage2UmlPackage) result_pattern_TypeDependency2UsageDependency_11_1_performtransformation_binding[8];
			ASTNode2Element src2Src = (ASTNode2Element) result_pattern_TypeDependency2UsageDependency_11_1_performtransformation_binding[9];

			Object[] result_pattern_TypeDependency2UsageDependency_11_1_performtransformation_black = pattern_TypeDependency2UsageDependency_11_1_performtransformation_blackBBBBBBBBBBFBB(
					mPackage, uPackage, mSrcType, uTrgType, uSrcType, uUsage, trg2Trg, mTrgType, p2p, src2Src, _this,
					isApplicableMatch);
			if (result_pattern_TypeDependency2UsageDependency_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_TypeDependency2UsageDependency_11_1_performtransformation_black[10];

				return new Object[] { mPackage, uPackage, mSrcType, uTrgType, uSrcType, uUsage, trg2Trg, mTrgType, p2p,
						src2Src, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_TypeDependency2UsageDependency_11_1_performtransformation_greenBB(
			MClass mSrcType, Type mTrgType) {
		mSrcType.getDependencies().add(mTrgType);
		return new Object[] { mSrcType, mTrgType };
	}

	public static final Object[] pattern_TypeDependency2UsageDependency_11_2_collecttranslatedelements_blackB(
			Usage uUsage) {
		return new Object[] { uUsage };
	}

	public static final Object[] pattern_TypeDependency2UsageDependency_11_2_collecttranslatedelements_greenFB(
			Usage uUsage) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(uUsage);
		return new Object[] { ruleresult, uUsage };
	}

	public static final Object[] pattern_TypeDependency2UsageDependency_11_3_bookkeepingforedges_blackBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject mPackage, EObject uPackage, EObject mSrcType, EObject uTrgType,
			EObject uSrcType, EObject uUsage, EObject trg2Trg, EObject mTrgType, EObject p2p, EObject src2Src) {
		if (!mPackage.equals(uPackage)) {
			if (!mPackage.equals(mSrcType)) {
				if (!mPackage.equals(uTrgType)) {
					if (!mPackage.equals(uSrcType)) {
						if (!mPackage.equals(uUsage)) {
							if (!mPackage.equals(trg2Trg)) {
								if (!mPackage.equals(mTrgType)) {
									if (!mPackage.equals(p2p)) {
										if (!mPackage.equals(src2Src)) {
											if (!uPackage.equals(uTrgType)) {
												if (!uPackage.equals(uSrcType)) {
													if (!uPackage.equals(uUsage)) {
														if (!mSrcType.equals(uPackage)) {
															if (!mSrcType.equals(uTrgType)) {
																if (!mSrcType.equals(uSrcType)) {
																	if (!mSrcType.equals(uUsage)) {
																		if (!mSrcType.equals(trg2Trg)) {
																			if (!mSrcType.equals(mTrgType)) {
																				if (!mSrcType.equals(p2p)) {
																					if (!mSrcType.equals(src2Src)) {
																						if (!uTrgType.equals(uUsage)) {
																							if (!uSrcType
																									.equals(uTrgType)) {
																								if (!uSrcType.equals(
																										uUsage)) {
																									if (!trg2Trg.equals(
																											uPackage)) {
																										if (!trg2Trg
																												.equals(uTrgType)) {
																											if (!trg2Trg
																													.equals(uSrcType)) {
																												if (!trg2Trg
																														.equals(uUsage)) {
																													if (!mTrgType
																															.equals(uPackage)) {
																														if (!mTrgType
																																.equals(uTrgType)) {
																															if (!mTrgType
																																	.equals(uSrcType)) {
																																if (!mTrgType
																																		.equals(uUsage)) {
																																	if (!mTrgType
																																			.equals(trg2Trg)) {
																																		if (!mTrgType
																																				.equals(p2p)) {
																																			if (!mTrgType
																																					.equals(src2Src)) {
																																				if (!p2p.equals(
																																						uPackage)) {
																																					if (!p2p.equals(
																																							uTrgType)) {
																																						if (!p2p.equals(
																																								uSrcType)) {
																																							if (!p2p.equals(
																																									uUsage)) {
																																								if (!p2p.equals(
																																										trg2Trg)) {
																																									if (!p2p.equals(
																																											src2Src)) {
																																										if (!src2Src
																																												.equals(uPackage)) {
																																											if (!src2Src
																																													.equals(uTrgType)) {
																																												if (!src2Src
																																														.equals(uSrcType)) {
																																													if (!src2Src
																																															.equals(uUsage)) {
																																														if (!src2Src
																																																.equals(trg2Trg)) {
																																															return new Object[] {
																																																	ruleresult,
																																																	mPackage,
																																																	uPackage,
																																																	mSrcType,
																																																	uTrgType,
																																																	uSrcType,
																																																	uUsage,
																																																	trg2Trg,
																																																	mTrgType,
																																																	p2p,
																																																	src2Src };
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_TypeDependency2UsageDependency_11_3_bookkeepingforedges_greenBBBBBBBFFFF(
			PerformRuleResult ruleresult, EObject uPackage, EObject mSrcType, EObject uTrgType, EObject uSrcType,
			EObject uUsage, EObject mTrgType) {
		EMoflonEdge uUsage__uTrgType____supplier = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge uPackage__uUsage____packagedElement = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge uUsage__uSrcType____client = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSrcType__mTrgType____dependencies = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "TypeDependency2UsageDependency";
		String uUsage__uTrgType____supplier_name_prime = "supplier";
		String uPackage__uUsage____packagedElement_name_prime = "packagedElement";
		String uUsage__uSrcType____client_name_prime = "client";
		String mSrcType__mTrgType____dependencies_name_prime = "dependencies";
		uUsage__uTrgType____supplier.setSrc(uUsage);
		uUsage__uTrgType____supplier.setTrg(uTrgType);
		ruleresult.getTranslatedEdges().add(uUsage__uTrgType____supplier);
		uPackage__uUsage____packagedElement.setSrc(uPackage);
		uPackage__uUsage____packagedElement.setTrg(uUsage);
		ruleresult.getTranslatedEdges().add(uPackage__uUsage____packagedElement);
		uUsage__uSrcType____client.setSrc(uUsage);
		uUsage__uSrcType____client.setTrg(uSrcType);
		ruleresult.getTranslatedEdges().add(uUsage__uSrcType____client);
		mSrcType__mTrgType____dependencies.setSrc(mSrcType);
		mSrcType__mTrgType____dependencies.setTrg(mTrgType);
		ruleresult.getCreatedEdges().add(mSrcType__mTrgType____dependencies);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		uUsage__uTrgType____supplier.setName(uUsage__uTrgType____supplier_name_prime);
		uPackage__uUsage____packagedElement.setName(uPackage__uUsage____packagedElement_name_prime);
		uUsage__uSrcType____client.setName(uUsage__uSrcType____client_name_prime);
		mSrcType__mTrgType____dependencies.setName(mSrcType__mTrgType____dependencies_name_prime);
		return new Object[] { ruleresult, uPackage, mSrcType, uTrgType, uSrcType, uUsage, mTrgType,
				uUsage__uTrgType____supplier, uPackage__uUsage____packagedElement, uUsage__uSrcType____client,
				mSrcType__mTrgType____dependencies };
	}

	public static final void pattern_TypeDependency2UsageDependency_11_5_registerobjects_expressionBBBBBBBBBBBB(
			TypeDependency2UsageDependency _this, PerformRuleResult ruleresult, EObject mPackage, EObject uPackage,
			EObject mSrcType, EObject uTrgType, EObject uSrcType, EObject uUsage, EObject trg2Trg, EObject mTrgType,
			EObject p2p, EObject src2Src) {
		_this.registerObjects_BWD(ruleresult, mPackage, uPackage, mSrcType, uTrgType, uSrcType, uUsage, trg2Trg,
				mTrgType, p2p, src2Src);

	}

	public static final PerformRuleResult pattern_TypeDependency2UsageDependency_11_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_TypeDependency2UsageDependency_12_1_preparereturnvalue_bindingFB(
			TypeDependency2UsageDependency _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_TypeDependency2UsageDependency_12_1_preparereturnvalue_blackFBB(EClass eClass,
			TypeDependency2UsageDependency _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_TypeDependency2UsageDependency_12_1_preparereturnvalue_bindingAndBlackFFB(
			TypeDependency2UsageDependency _this) {
		Object[] result_pattern_TypeDependency2UsageDependency_12_1_preparereturnvalue_binding = pattern_TypeDependency2UsageDependency_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_TypeDependency2UsageDependency_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_TypeDependency2UsageDependency_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_TypeDependency2UsageDependency_12_1_preparereturnvalue_black = pattern_TypeDependency2UsageDependency_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_TypeDependency2UsageDependency_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_TypeDependency2UsageDependency_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_TypeDependency2UsageDependency_12_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "TypeDependency2UsageDependency";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_TypeDependency2UsageDependency_12_2_corematch_bindingFFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("uPackage");
		EObject _localVariable_1 = match.getObject("uTrgType");
		EObject _localVariable_2 = match.getObject("uSrcType");
		EObject _localVariable_3 = match.getObject("uUsage");
		EObject tmpUPackage = _localVariable_0;
		EObject tmpUTrgType = _localVariable_1;
		EObject tmpUSrcType = _localVariable_2;
		EObject tmpUUsage = _localVariable_3;
		if (tmpUPackage instanceof org.eclipse.uml2.uml.Package) {
			org.eclipse.uml2.uml.Package uPackage = (org.eclipse.uml2.uml.Package) tmpUPackage;
			if (tmpUTrgType instanceof Classifier) {
				Classifier uTrgType = (Classifier) tmpUTrgType;
				if (tmpUSrcType instanceof org.eclipse.uml2.uml.Class) {
					org.eclipse.uml2.uml.Class uSrcType = (org.eclipse.uml2.uml.Class) tmpUSrcType;
					if (tmpUUsage instanceof Usage) {
						Usage uUsage = (Usage) tmpUUsage;
						return new Object[] { uPackage, uTrgType, uSrcType, uUsage, match };
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_TypeDependency2UsageDependency_12_2_corematch_blackFBFBBBFFFFB(
			org.eclipse.uml2.uml.Package uPackage, Classifier uTrgType, org.eclipse.uml2.uml.Class uSrcType,
			Usage uUsage, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!uSrcType.equals(uTrgType)) {
			for (JavaPackage2UmlPackage p2p : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(uPackage, JavaPackage2UmlPackage.class, "target")) {
				org.eclipse.modisco.java.Package mPackage = p2p.getSource();
				if (mPackage != null) {
					for (ASTNode2Element src2Src : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(uSrcType, ASTNode2Element.class, "target")) {
						ASTNode tmpMSrcType = src2Src.getSource();
						if (tmpMSrcType instanceof MClass) {
							MClass mSrcType = (MClass) tmpMSrcType;
							for (ASTNode2Element trg2Trg : org.moflon.core.utilities.eMoflonEMFUtil
									.getOppositeReferenceTyped(uTrgType, ASTNode2Element.class, "target")) {
								if (!src2Src.equals(trg2Trg)) {
									ASTNode tmpMTrgType = trg2Trg.getSource();
									if (tmpMTrgType instanceof Type) {
										Type mTrgType = (Type) tmpMTrgType;
										if (!mSrcType.equals(mTrgType)) {
											_result.add(new Object[] { mPackage, uPackage, mSrcType, uTrgType, uSrcType,
													uUsage, trg2Trg, mTrgType, p2p, src2Src, match });
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

	public static final Iterable<Object[]> pattern_TypeDependency2UsageDependency_12_3_findcontext_blackBBBBBBBBBB(
			org.eclipse.modisco.java.Package mPackage, org.eclipse.uml2.uml.Package uPackage, MClass mSrcType,
			Classifier uTrgType, org.eclipse.uml2.uml.Class uSrcType, Usage uUsage, ASTNode2Element trg2Trg,
			Type mTrgType, JavaPackage2UmlPackage p2p, ASTNode2Element src2Src) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!mSrcType.equals(mTrgType)) {
			if (!uSrcType.equals(uTrgType)) {
				if (!src2Src.equals(trg2Trg)) {
					if (uPackage.getOwnedElements().contains(uSrcType)) {
						if (uUsage.getSuppliers().contains(uTrgType)) {
							if (mPackage.getOwnedElements().contains(mSrcType)) {
								if (uPackage.getPackagedElements().contains(uUsage)) {
									if (uUsage.getClients().contains(uSrcType)) {
										if (mTrgType.equals(trg2Trg.getSource())) {
											if (mPackage.equals(p2p.getSource())) {
												if (uPackage.equals(p2p.getTarget())) {
													if (uSrcType.equals(src2Src.getTarget())) {
														if (uTrgType.equals(trg2Trg.getTarget())) {
															if (mSrcType.equals(src2Src.getSource())) {
																_result.add(new Object[] { mPackage, uPackage, mSrcType,
																		uTrgType, uSrcType, uUsage, trg2Trg, mTrgType,
																		p2p, src2Src });
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_TypeDependency2UsageDependency_12_3_findcontext_greenBBBBBBBBBBFFFFFFFFFFFFFF(
			org.eclipse.modisco.java.Package mPackage, org.eclipse.uml2.uml.Package uPackage, MClass mSrcType,
			Classifier uTrgType, org.eclipse.uml2.uml.Class uSrcType, Usage uUsage, ASTNode2Element trg2Trg,
			Type mTrgType, JavaPackage2UmlPackage p2p, ASTNode2Element src2Src) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge uPackage__uSrcType____ownedElement = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge uSrcType__uPackage____owner = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge uUsage__uTrgType____supplier = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mPackage__mSrcType____ownedElements = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSrcType__mPackage____package = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge uPackage__uUsage____packagedElement = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge uUsage__uSrcType____client = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge trg2Trg__mTrgType____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge p2p__mPackage____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge p2p__uPackage____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge src2Src__uSrcType____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge trg2Trg__uTrgType____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge src2Src__mSrcType____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String uPackage__uSrcType____ownedElement_name_prime = "ownedElement";
		String uSrcType__uPackage____owner_name_prime = "owner";
		String uUsage__uTrgType____supplier_name_prime = "supplier";
		String mPackage__mSrcType____ownedElements_name_prime = "ownedElements";
		String mSrcType__mPackage____package_name_prime = "package";
		String uPackage__uUsage____packagedElement_name_prime = "packagedElement";
		String uUsage__uSrcType____client_name_prime = "client";
		String trg2Trg__mTrgType____source_name_prime = "source";
		String p2p__mPackage____source_name_prime = "source";
		String p2p__uPackage____target_name_prime = "target";
		String src2Src__uSrcType____target_name_prime = "target";
		String trg2Trg__uTrgType____target_name_prime = "target";
		String src2Src__mSrcType____source_name_prime = "source";
		isApplicableMatch.getAllContextElements().add(mPackage);
		isApplicableMatch.getAllContextElements().add(uPackage);
		isApplicableMatch.getAllContextElements().add(mSrcType);
		isApplicableMatch.getAllContextElements().add(uTrgType);
		isApplicableMatch.getAllContextElements().add(uSrcType);
		isApplicableMatch.getAllContextElements().add(uUsage);
		isApplicableMatch.getAllContextElements().add(trg2Trg);
		isApplicableMatch.getAllContextElements().add(mTrgType);
		isApplicableMatch.getAllContextElements().add(p2p);
		isApplicableMatch.getAllContextElements().add(src2Src);
		uPackage__uSrcType____ownedElement.setSrc(uPackage);
		uPackage__uSrcType____ownedElement.setTrg(uSrcType);
		isApplicableMatch.getAllContextElements().add(uPackage__uSrcType____ownedElement);
		uSrcType__uPackage____owner.setSrc(uSrcType);
		uSrcType__uPackage____owner.setTrg(uPackage);
		isApplicableMatch.getAllContextElements().add(uSrcType__uPackage____owner);
		uUsage__uTrgType____supplier.setSrc(uUsage);
		uUsage__uTrgType____supplier.setTrg(uTrgType);
		isApplicableMatch.getAllContextElements().add(uUsage__uTrgType____supplier);
		mPackage__mSrcType____ownedElements.setSrc(mPackage);
		mPackage__mSrcType____ownedElements.setTrg(mSrcType);
		isApplicableMatch.getAllContextElements().add(mPackage__mSrcType____ownedElements);
		mSrcType__mPackage____package.setSrc(mSrcType);
		mSrcType__mPackage____package.setTrg(mPackage);
		isApplicableMatch.getAllContextElements().add(mSrcType__mPackage____package);
		uPackage__uUsage____packagedElement.setSrc(uPackage);
		uPackage__uUsage____packagedElement.setTrg(uUsage);
		isApplicableMatch.getAllContextElements().add(uPackage__uUsage____packagedElement);
		uUsage__uSrcType____client.setSrc(uUsage);
		uUsage__uSrcType____client.setTrg(uSrcType);
		isApplicableMatch.getAllContextElements().add(uUsage__uSrcType____client);
		trg2Trg__mTrgType____source.setSrc(trg2Trg);
		trg2Trg__mTrgType____source.setTrg(mTrgType);
		isApplicableMatch.getAllContextElements().add(trg2Trg__mTrgType____source);
		p2p__mPackage____source.setSrc(p2p);
		p2p__mPackage____source.setTrg(mPackage);
		isApplicableMatch.getAllContextElements().add(p2p__mPackage____source);
		p2p__uPackage____target.setSrc(p2p);
		p2p__uPackage____target.setTrg(uPackage);
		isApplicableMatch.getAllContextElements().add(p2p__uPackage____target);
		src2Src__uSrcType____target.setSrc(src2Src);
		src2Src__uSrcType____target.setTrg(uSrcType);
		isApplicableMatch.getAllContextElements().add(src2Src__uSrcType____target);
		trg2Trg__uTrgType____target.setSrc(trg2Trg);
		trg2Trg__uTrgType____target.setTrg(uTrgType);
		isApplicableMatch.getAllContextElements().add(trg2Trg__uTrgType____target);
		src2Src__mSrcType____source.setSrc(src2Src);
		src2Src__mSrcType____source.setTrg(mSrcType);
		isApplicableMatch.getAllContextElements().add(src2Src__mSrcType____source);
		uPackage__uSrcType____ownedElement.setName(uPackage__uSrcType____ownedElement_name_prime);
		uSrcType__uPackage____owner.setName(uSrcType__uPackage____owner_name_prime);
		uUsage__uTrgType____supplier.setName(uUsage__uTrgType____supplier_name_prime);
		mPackage__mSrcType____ownedElements.setName(mPackage__mSrcType____ownedElements_name_prime);
		mSrcType__mPackage____package.setName(mSrcType__mPackage____package_name_prime);
		uPackage__uUsage____packagedElement.setName(uPackage__uUsage____packagedElement_name_prime);
		uUsage__uSrcType____client.setName(uUsage__uSrcType____client_name_prime);
		trg2Trg__mTrgType____source.setName(trg2Trg__mTrgType____source_name_prime);
		p2p__mPackage____source.setName(p2p__mPackage____source_name_prime);
		p2p__uPackage____target.setName(p2p__uPackage____target_name_prime);
		src2Src__uSrcType____target.setName(src2Src__uSrcType____target_name_prime);
		trg2Trg__uTrgType____target.setName(trg2Trg__uTrgType____target_name_prime);
		src2Src__mSrcType____source.setName(src2Src__mSrcType____source_name_prime);
		return new Object[] { mPackage, uPackage, mSrcType, uTrgType, uSrcType, uUsage, trg2Trg, mTrgType, p2p, src2Src,
				isApplicableMatch, uPackage__uSrcType____ownedElement, uSrcType__uPackage____owner,
				uUsage__uTrgType____supplier, mPackage__mSrcType____ownedElements, mSrcType__mPackage____package,
				uPackage__uUsage____packagedElement, uUsage__uSrcType____client, trg2Trg__mTrgType____source,
				p2p__mPackage____source, p2p__uPackage____target, src2Src__uSrcType____target,
				trg2Trg__uTrgType____target, src2Src__mSrcType____source };
	}

	public static final Object[] pattern_TypeDependency2UsageDependency_12_4_solveCSP_bindingFBBBBBBBBBBBB(
			TypeDependency2UsageDependency _this, IsApplicableMatch isApplicableMatch,
			org.eclipse.modisco.java.Package mPackage, org.eclipse.uml2.uml.Package uPackage, MClass mSrcType,
			Classifier uTrgType, org.eclipse.uml2.uml.Class uSrcType, Usage uUsage, ASTNode2Element trg2Trg,
			Type mTrgType, JavaPackage2UmlPackage p2p, ASTNode2Element src2Src) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, mPackage, uPackage, mSrcType,
				uTrgType, uSrcType, uUsage, trg2Trg, mTrgType, p2p, src2Src);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mPackage, uPackage, mSrcType, uTrgType, uSrcType,
					uUsage, trg2Trg, mTrgType, p2p, src2Src };
		}
		return null;
	}

	public static final Object[] pattern_TypeDependency2UsageDependency_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_TypeDependency2UsageDependency_12_4_solveCSP_bindingAndBlackFBBBBBBBBBBBB(
			TypeDependency2UsageDependency _this, IsApplicableMatch isApplicableMatch,
			org.eclipse.modisco.java.Package mPackage, org.eclipse.uml2.uml.Package uPackage, MClass mSrcType,
			Classifier uTrgType, org.eclipse.uml2.uml.Class uSrcType, Usage uUsage, ASTNode2Element trg2Trg,
			Type mTrgType, JavaPackage2UmlPackage p2p, ASTNode2Element src2Src) {
		Object[] result_pattern_TypeDependency2UsageDependency_12_4_solveCSP_binding = pattern_TypeDependency2UsageDependency_12_4_solveCSP_bindingFBBBBBBBBBBBB(
				_this, isApplicableMatch, mPackage, uPackage, mSrcType, uTrgType, uSrcType, uUsage, trg2Trg, mTrgType,
				p2p, src2Src);
		if (result_pattern_TypeDependency2UsageDependency_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_TypeDependency2UsageDependency_12_4_solveCSP_binding[0];

			Object[] result_pattern_TypeDependency2UsageDependency_12_4_solveCSP_black = pattern_TypeDependency2UsageDependency_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_TypeDependency2UsageDependency_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mPackage, uPackage, mSrcType, uTrgType, uSrcType,
						uUsage, trg2Trg, mTrgType, p2p, src2Src };
			}
		}
		return null;
	}

	public static final boolean pattern_TypeDependency2UsageDependency_12_5_checkCSP_expressionFBB(
			TypeDependency2UsageDependency _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_TypeDependency2UsageDependency_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_TypeDependency2UsageDependency_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "TypeDependency2UsageDependency";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_TypeDependency2UsageDependency_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_TypeDependency2UsageDependency_20_1_preparereturnvalue_bindingFB(
			TypeDependency2UsageDependency _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_TypeDependency2UsageDependency_20_1_preparereturnvalue_blackFBBF(
			EClass __eClass, TypeDependency2UsageDependency _this) {
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

	public static final Object[] pattern_TypeDependency2UsageDependency_20_1_preparereturnvalue_bindingAndBlackFFBF(
			TypeDependency2UsageDependency _this) {
		Object[] result_pattern_TypeDependency2UsageDependency_20_1_preparereturnvalue_binding = pattern_TypeDependency2UsageDependency_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_TypeDependency2UsageDependency_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_TypeDependency2UsageDependency_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_TypeDependency2UsageDependency_20_1_preparereturnvalue_black = pattern_TypeDependency2UsageDependency_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_TypeDependency2UsageDependency_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_TypeDependency2UsageDependency_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_TypeDependency2UsageDependency_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_TypeDependency2UsageDependency_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_TypeDependency2UsageDependency_20_2_testcorematchandDECs_black_nac_0BBBB(
			Usage uUsage, org.eclipse.uml2.uml.Package uPackage, Classifier uTrgType,
			org.eclipse.uml2.uml.Class uSrcType) {
		if (!uSrcType.equals(uTrgType)) {
			for (NamedElement __DEC_uUsage_client_436109 : uUsage.getClients()) {
				if (!uUsage.equals(__DEC_uUsage_client_436109)) {
					if (!uPackage.equals(__DEC_uUsage_client_436109)) {
						if (!uTrgType.equals(__DEC_uUsage_client_436109)) {
							if (!uSrcType.equals(__DEC_uUsage_client_436109)) {
								return new Object[] { uUsage, uPackage, uTrgType, uSrcType };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_TypeDependency2UsageDependency_20_2_testcorematchandDECs_black_nac_1BBBB(
			Usage uUsage, org.eclipse.uml2.uml.Package uPackage, Classifier uTrgType,
			org.eclipse.uml2.uml.Class uSrcType) {
		if (!uSrcType.equals(uTrgType)) {
			for (NamedElement __DEC_uUsage_supplier_504167 : uUsage.getSuppliers()) {
				if (!uUsage.equals(__DEC_uUsage_supplier_504167)) {
					if (!uPackage.equals(__DEC_uUsage_supplier_504167)) {
						if (!uTrgType.equals(__DEC_uUsage_supplier_504167)) {
							if (!uSrcType.equals(__DEC_uUsage_supplier_504167)) {
								return new Object[] { uUsage, uPackage, uTrgType, uSrcType };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_TypeDependency2UsageDependency_20_2_testcorematchandDECs_black_nac_2BB(
			Usage uUsage, org.eclipse.uml2.uml.Package uPackage) {
		if (uUsage.getClients().contains(uPackage)) {
			return new Object[] { uUsage, uPackage };
		}
		return null;
	}

	public static final Object[] pattern_TypeDependency2UsageDependency_20_2_testcorematchandDECs_black_nac_3BB(
			Usage uUsage, Classifier uTrgType) {
		if (uUsage.getClients().contains(uTrgType)) {
			return new Object[] { uUsage, uTrgType };
		}
		return null;
	}

	public static final Object[] pattern_TypeDependency2UsageDependency_20_2_testcorematchandDECs_black_nac_4BB(
			Usage uUsage, org.eclipse.uml2.uml.Package uPackage) {
		if (uUsage.getSuppliers().contains(uPackage)) {
			return new Object[] { uUsage, uPackage };
		}
		return null;
	}

	public static final Object[] pattern_TypeDependency2UsageDependency_20_2_testcorematchandDECs_black_nac_5BB(
			Usage uUsage, org.eclipse.uml2.uml.Class uSrcType) {
		if (uUsage.getSuppliers().contains(uSrcType)) {
			return new Object[] { uUsage, uSrcType };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_TypeDependency2UsageDependency_20_2_testcorematchandDECs_blackFFFFB(
			EMoflonEdge _edge_supplier) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpUUsage = _edge_supplier.getSrc();
		if (tmpUUsage instanceof Usage) {
			Usage uUsage = (Usage) tmpUUsage;
			EObject tmpUTrgType = _edge_supplier.getTrg();
			if (tmpUTrgType instanceof Classifier) {
				Classifier uTrgType = (Classifier) tmpUTrgType;
				if (uUsage.getSuppliers().contains(uTrgType)) {
					if (pattern_TypeDependency2UsageDependency_20_2_testcorematchandDECs_black_nac_3BB(uUsage,
							uTrgType) == null) {
						for (NamedElement tmpUSrcType : uUsage.getClients()) {
							if (tmpUSrcType instanceof org.eclipse.uml2.uml.Class) {
								org.eclipse.uml2.uml.Class uSrcType = (org.eclipse.uml2.uml.Class) tmpUSrcType;
								if (!uSrcType.equals(uTrgType)) {
									Element tmpUPackage = uSrcType.getOwner();
									if (tmpUPackage instanceof org.eclipse.uml2.uml.Package) {
										org.eclipse.uml2.uml.Package uPackage = (org.eclipse.uml2.uml.Package) tmpUPackage;
										if (uPackage.getPackagedElements().contains(uUsage)) {
											if (pattern_TypeDependency2UsageDependency_20_2_testcorematchandDECs_black_nac_5BB(
													uUsage, uSrcType) == null) {
												if (pattern_TypeDependency2UsageDependency_20_2_testcorematchandDECs_black_nac_0BBBB(
														uUsage, uPackage, uTrgType, uSrcType) == null) {
													if (pattern_TypeDependency2UsageDependency_20_2_testcorematchandDECs_black_nac_1BBBB(
															uUsage, uPackage, uTrgType, uSrcType) == null) {
														if (pattern_TypeDependency2UsageDependency_20_2_testcorematchandDECs_black_nac_2BB(
																uUsage, uPackage) == null) {
															if (pattern_TypeDependency2UsageDependency_20_2_testcorematchandDECs_black_nac_4BB(
																	uUsage, uPackage) == null) {
																_result.add(new Object[] { uPackage, uTrgType, uSrcType,
																		uUsage, _edge_supplier });
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_TypeDependency2UsageDependency_20_2_testcorematchandDECs_greenFB(
			EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_TypeDependency2UsageDependency_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(
			TypeDependency2UsageDependency _this, Match match, org.eclipse.uml2.uml.Package uPackage,
			Classifier uTrgType, org.eclipse.uml2.uml.Class uSrcType, Usage uUsage) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, uPackage, uTrgType, uSrcType, uUsage);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_TypeDependency2UsageDependency_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			TypeDependency2UsageDependency _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_TypeDependency2UsageDependency_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_TypeDependency2UsageDependency_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_TypeDependency2UsageDependency_20_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_TypeDependency2UsageDependency_21_1_preparereturnvalue_bindingFB(
			TypeDependency2UsageDependency _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_TypeDependency2UsageDependency_21_1_preparereturnvalue_blackFBBF(
			EClass __eClass, TypeDependency2UsageDependency _this) {
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

	public static final Object[] pattern_TypeDependency2UsageDependency_21_1_preparereturnvalue_bindingAndBlackFFBF(
			TypeDependency2UsageDependency _this) {
		Object[] result_pattern_TypeDependency2UsageDependency_21_1_preparereturnvalue_binding = pattern_TypeDependency2UsageDependency_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_TypeDependency2UsageDependency_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_TypeDependency2UsageDependency_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_TypeDependency2UsageDependency_21_1_preparereturnvalue_black = pattern_TypeDependency2UsageDependency_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_TypeDependency2UsageDependency_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_TypeDependency2UsageDependency_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_TypeDependency2UsageDependency_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_TypeDependency2UsageDependency_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_TypeDependency2UsageDependency_21_2_testcorematchandDECs_blackFFFB(
			EMoflonEdge _edge_dependencies) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpMSrcType = _edge_dependencies.getSrc();
		if (tmpMSrcType instanceof MClass) {
			MClass mSrcType = (MClass) tmpMSrcType;
			EObject tmpMTrgType = _edge_dependencies.getTrg();
			if (tmpMTrgType instanceof Type) {
				Type mTrgType = (Type) tmpMTrgType;
				if (!mSrcType.equals(mTrgType)) {
					if (mSrcType.getDependencies().contains(mTrgType)) {
						org.eclipse.modisco.java.Package mPackage = mSrcType.getPackage();
						if (mPackage != null) {
							_result.add(new Object[] { mPackage, mSrcType, mTrgType, _edge_dependencies });
						}

					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_TypeDependency2UsageDependency_21_2_testcorematchandDECs_greenFB(
			EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_TypeDependency2UsageDependency_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
			TypeDependency2UsageDependency _this, Match match, org.eclipse.modisco.java.Package mPackage,
			MClass mSrcType, Type mTrgType) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, mPackage, mSrcType, mTrgType);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_TypeDependency2UsageDependency_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			TypeDependency2UsageDependency _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_TypeDependency2UsageDependency_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_TypeDependency2UsageDependency_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_TypeDependency2UsageDependency_21_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_TypeDependency2UsageDependency_24_1_prepare_blackB(
			TypeDependency2UsageDependency _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_TypeDependency2UsageDependency_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_TypeDependency2UsageDependency_24_2_matchsrctrgcontext_bindingFFFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		EObject _localVariable_0 = sourceMatch.getObject("mPackage");
		EObject _localVariable_1 = targetMatch.getObject("uPackage");
		EObject _localVariable_2 = sourceMatch.getObject("mSrcType");
		EObject _localVariable_3 = targetMatch.getObject("uTrgType");
		EObject _localVariable_4 = targetMatch.getObject("uSrcType");
		EObject _localVariable_5 = targetMatch.getObject("uUsage");
		EObject _localVariable_6 = sourceMatch.getObject("mTrgType");
		EObject tmpMPackage = _localVariable_0;
		EObject tmpUPackage = _localVariable_1;
		EObject tmpMSrcType = _localVariable_2;
		EObject tmpUTrgType = _localVariable_3;
		EObject tmpUSrcType = _localVariable_4;
		EObject tmpUUsage = _localVariable_5;
		EObject tmpMTrgType = _localVariable_6;
		if (tmpMPackage instanceof org.eclipse.modisco.java.Package) {
			org.eclipse.modisco.java.Package mPackage = (org.eclipse.modisco.java.Package) tmpMPackage;
			if (tmpUPackage instanceof org.eclipse.uml2.uml.Package) {
				org.eclipse.uml2.uml.Package uPackage = (org.eclipse.uml2.uml.Package) tmpUPackage;
				if (tmpMSrcType instanceof MClass) {
					MClass mSrcType = (MClass) tmpMSrcType;
					if (tmpUTrgType instanceof Classifier) {
						Classifier uTrgType = (Classifier) tmpUTrgType;
						if (tmpUSrcType instanceof org.eclipse.uml2.uml.Class) {
							org.eclipse.uml2.uml.Class uSrcType = (org.eclipse.uml2.uml.Class) tmpUSrcType;
							if (tmpUUsage instanceof Usage) {
								Usage uUsage = (Usage) tmpUUsage;
								if (tmpMTrgType instanceof Type) {
									Type mTrgType = (Type) tmpMTrgType;
									return new Object[] { mPackage, uPackage, mSrcType, uTrgType, uSrcType, uUsage,
											mTrgType, sourceMatch, targetMatch };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_TypeDependency2UsageDependency_24_2_matchsrctrgcontext_blackBBBBBBBBB(
			org.eclipse.modisco.java.Package mPackage, org.eclipse.uml2.uml.Package uPackage, MClass mSrcType,
			Classifier uTrgType, org.eclipse.uml2.uml.Class uSrcType, Usage uUsage, Type mTrgType, Match sourceMatch,
			Match targetMatch) {
		if (!mSrcType.equals(mTrgType)) {
			if (!uSrcType.equals(uTrgType)) {
				if (!sourceMatch.equals(targetMatch)) {
					return new Object[] { mPackage, uPackage, mSrcType, uTrgType, uSrcType, uUsage, mTrgType,
							sourceMatch, targetMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_TypeDependency2UsageDependency_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_TypeDependency2UsageDependency_24_2_matchsrctrgcontext_binding = pattern_TypeDependency2UsageDependency_24_2_matchsrctrgcontext_bindingFFFFFFFBB(
				sourceMatch, targetMatch);
		if (result_pattern_TypeDependency2UsageDependency_24_2_matchsrctrgcontext_binding != null) {
			org.eclipse.modisco.java.Package mPackage = (org.eclipse.modisco.java.Package) result_pattern_TypeDependency2UsageDependency_24_2_matchsrctrgcontext_binding[0];
			org.eclipse.uml2.uml.Package uPackage = (org.eclipse.uml2.uml.Package) result_pattern_TypeDependency2UsageDependency_24_2_matchsrctrgcontext_binding[1];
			MClass mSrcType = (MClass) result_pattern_TypeDependency2UsageDependency_24_2_matchsrctrgcontext_binding[2];
			Classifier uTrgType = (Classifier) result_pattern_TypeDependency2UsageDependency_24_2_matchsrctrgcontext_binding[3];
			org.eclipse.uml2.uml.Class uSrcType = (org.eclipse.uml2.uml.Class) result_pattern_TypeDependency2UsageDependency_24_2_matchsrctrgcontext_binding[4];
			Usage uUsage = (Usage) result_pattern_TypeDependency2UsageDependency_24_2_matchsrctrgcontext_binding[5];
			Type mTrgType = (Type) result_pattern_TypeDependency2UsageDependency_24_2_matchsrctrgcontext_binding[6];

			Object[] result_pattern_TypeDependency2UsageDependency_24_2_matchsrctrgcontext_black = pattern_TypeDependency2UsageDependency_24_2_matchsrctrgcontext_blackBBBBBBBBB(
					mPackage, uPackage, mSrcType, uTrgType, uSrcType, uUsage, mTrgType, sourceMatch, targetMatch);
			if (result_pattern_TypeDependency2UsageDependency_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { mPackage, uPackage, mSrcType, uTrgType, uSrcType, uUsage, mTrgType, sourceMatch,
						targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_TypeDependency2UsageDependency_24_3_solvecsp_bindingFBBBBBBBBBB(
			TypeDependency2UsageDependency _this, org.eclipse.modisco.java.Package mPackage,
			org.eclipse.uml2.uml.Package uPackage, MClass mSrcType, Classifier uTrgType,
			org.eclipse.uml2.uml.Class uSrcType, Usage uUsage, Type mTrgType, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_7 = _this.isApplicable_solveCsp_CC(mPackage, uPackage, mSrcType, uTrgType, uSrcType, uUsage,
				mTrgType, sourceMatch, targetMatch);
		CSP csp = _localVariable_7;
		if (csp != null) {
			return new Object[] { csp, _this, mPackage, uPackage, mSrcType, uTrgType, uSrcType, uUsage, mTrgType,
					sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_TypeDependency2UsageDependency_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_TypeDependency2UsageDependency_24_3_solvecsp_bindingAndBlackFBBBBBBBBBB(
			TypeDependency2UsageDependency _this, org.eclipse.modisco.java.Package mPackage,
			org.eclipse.uml2.uml.Package uPackage, MClass mSrcType, Classifier uTrgType,
			org.eclipse.uml2.uml.Class uSrcType, Usage uUsage, Type mTrgType, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_TypeDependency2UsageDependency_24_3_solvecsp_binding = pattern_TypeDependency2UsageDependency_24_3_solvecsp_bindingFBBBBBBBBBB(
				_this, mPackage, uPackage, mSrcType, uTrgType, uSrcType, uUsage, mTrgType, sourceMatch, targetMatch);
		if (result_pattern_TypeDependency2UsageDependency_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_TypeDependency2UsageDependency_24_3_solvecsp_binding[0];

			Object[] result_pattern_TypeDependency2UsageDependency_24_3_solvecsp_black = pattern_TypeDependency2UsageDependency_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_TypeDependency2UsageDependency_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, mPackage, uPackage, mSrcType, uTrgType, uSrcType, uUsage, mTrgType,
						sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_TypeDependency2UsageDependency_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_TypeDependency2UsageDependency_24_5_matchcorrcontext_blackBBBBBFBFFBB(
			org.eclipse.modisco.java.Package mPackage, org.eclipse.uml2.uml.Package uPackage, MClass mSrcType,
			Classifier uTrgType, org.eclipse.uml2.uml.Class uSrcType, Type mTrgType, Match sourceMatch,
			Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!mSrcType.equals(mTrgType)) {
			if (!uSrcType.equals(uTrgType)) {
				if (!sourceMatch.equals(targetMatch)) {
					for (ASTNode2Element trg2Trg : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(mTrgType, ASTNode2Element.class, "source")) {
						if (uTrgType.equals(trg2Trg.getTarget())) {
							for (JavaPackage2UmlPackage p2p : org.moflon.core.utilities.eMoflonEMFUtil
									.getOppositeReferenceTyped(mPackage, JavaPackage2UmlPackage.class, "source")) {
								if (uPackage.equals(p2p.getTarget())) {
									for (ASTNode2Element src2Src : org.moflon.core.utilities.eMoflonEMFUtil
											.getOppositeReferenceTyped(uSrcType, ASTNode2Element.class, "target")) {
										if (!src2Src.equals(trg2Trg)) {
											if (mSrcType.equals(src2Src.getSource())) {
												_result.add(new Object[] { mPackage, uPackage, mSrcType, uTrgType,
														uSrcType, trg2Trg, mTrgType, p2p, src2Src, sourceMatch,
														targetMatch });
											}
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

	public static final Object[] pattern_TypeDependency2UsageDependency_24_5_matchcorrcontext_greenBBBBBF(
			ASTNode2Element trg2Trg, JavaPackage2UmlPackage p2p, ASTNode2Element src2Src, Match sourceMatch,
			Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "TypeDependency2UsageDependency";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(trg2Trg);
		ccMatch.getAllContextElements().add(p2p);
		ccMatch.getAllContextElements().add(src2Src);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { trg2Trg, p2p, src2Src, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_TypeDependency2UsageDependency_24_6_createcorrespondence_blackBBBBBBBB(
			org.eclipse.modisco.java.Package mPackage, org.eclipse.uml2.uml.Package uPackage, MClass mSrcType,
			Classifier uTrgType, org.eclipse.uml2.uml.Class uSrcType, Usage uUsage, Type mTrgType, CCMatch ccMatch) {
		if (!mSrcType.equals(mTrgType)) {
			if (!uSrcType.equals(uTrgType)) {
				return new Object[] { mPackage, uPackage, mSrcType, uTrgType, uSrcType, uUsage, mTrgType, ccMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_TypeDependency2UsageDependency_24_7_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_TypeDependency2UsageDependency_24_7_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "TypeDependency2UsageDependency";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_TypeDependency2UsageDependency_24_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_TypeDependency2UsageDependency_27_1_matchtggpattern_blackBBB(
			org.eclipse.modisco.java.Package mPackage, MClass mSrcType, Type mTrgType) {
		if (!mSrcType.equals(mTrgType)) {
			if (mPackage.getOwnedElements().contains(mSrcType)) {
				if (mSrcType.getDependencies().contains(mTrgType)) {
					return new Object[] { mPackage, mSrcType, mTrgType };
				}
			}
		}
		return null;
	}

	public static final boolean pattern_TypeDependency2UsageDependency_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_TypeDependency2UsageDependency_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_TypeDependency2UsageDependency_28_1_matchtggpattern_black_nac_0BBBB(
			Usage uUsage, org.eclipse.uml2.uml.Package uPackage, Classifier uTrgType,
			org.eclipse.uml2.uml.Class uSrcType) {
		if (!uSrcType.equals(uTrgType)) {
			for (NamedElement __DEC_uUsage_client_724253 : uUsage.getClients()) {
				if (!uUsage.equals(__DEC_uUsage_client_724253)) {
					if (!uPackage.equals(__DEC_uUsage_client_724253)) {
						if (!uTrgType.equals(__DEC_uUsage_client_724253)) {
							if (!uSrcType.equals(__DEC_uUsage_client_724253)) {
								return new Object[] { uUsage, uPackage, uTrgType, uSrcType };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_TypeDependency2UsageDependency_28_1_matchtggpattern_black_nac_1BBBB(
			Usage uUsage, org.eclipse.uml2.uml.Package uPackage, Classifier uTrgType,
			org.eclipse.uml2.uml.Class uSrcType) {
		if (!uSrcType.equals(uTrgType)) {
			for (NamedElement __DEC_uUsage_supplier_575692 : uUsage.getSuppliers()) {
				if (!uUsage.equals(__DEC_uUsage_supplier_575692)) {
					if (!uPackage.equals(__DEC_uUsage_supplier_575692)) {
						if (!uTrgType.equals(__DEC_uUsage_supplier_575692)) {
							if (!uSrcType.equals(__DEC_uUsage_supplier_575692)) {
								return new Object[] { uUsage, uPackage, uTrgType, uSrcType };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_TypeDependency2UsageDependency_28_1_matchtggpattern_black_nac_2BB(Usage uUsage,
			org.eclipse.uml2.uml.Package uPackage) {
		if (uUsage.getClients().contains(uPackage)) {
			return new Object[] { uUsage, uPackage };
		}
		return null;
	}

	public static final Object[] pattern_TypeDependency2UsageDependency_28_1_matchtggpattern_black_nac_3BB(Usage uUsage,
			Classifier uTrgType) {
		if (uUsage.getClients().contains(uTrgType)) {
			return new Object[] { uUsage, uTrgType };
		}
		return null;
	}

	public static final Object[] pattern_TypeDependency2UsageDependency_28_1_matchtggpattern_black_nac_4BB(Usage uUsage,
			org.eclipse.uml2.uml.Package uPackage) {
		if (uUsage.getSuppliers().contains(uPackage)) {
			return new Object[] { uUsage, uPackage };
		}
		return null;
	}

	public static final Object[] pattern_TypeDependency2UsageDependency_28_1_matchtggpattern_black_nac_5BB(Usage uUsage,
			org.eclipse.uml2.uml.Class uSrcType) {
		if (uUsage.getSuppliers().contains(uSrcType)) {
			return new Object[] { uUsage, uSrcType };
		}
		return null;
	}

	public static final Object[] pattern_TypeDependency2UsageDependency_28_1_matchtggpattern_blackBBBB(
			org.eclipse.uml2.uml.Package uPackage, Classifier uTrgType, org.eclipse.uml2.uml.Class uSrcType,
			Usage uUsage) {
		if (!uSrcType.equals(uTrgType)) {
			if (uPackage.getOwnedElements().contains(uSrcType)) {
				if (uUsage.getSuppliers().contains(uTrgType)) {
					if (uPackage.getPackagedElements().contains(uUsage)) {
						if (uUsage.getClients().contains(uSrcType)) {
							if (pattern_TypeDependency2UsageDependency_28_1_matchtggpattern_black_nac_0BBBB(uUsage,
									uPackage, uTrgType, uSrcType) == null) {
								if (pattern_TypeDependency2UsageDependency_28_1_matchtggpattern_black_nac_1BBBB(uUsage,
										uPackage, uTrgType, uSrcType) == null) {
									if (pattern_TypeDependency2UsageDependency_28_1_matchtggpattern_black_nac_2BB(
											uUsage, uPackage) == null) {
										if (pattern_TypeDependency2UsageDependency_28_1_matchtggpattern_black_nac_3BB(
												uUsage, uTrgType) == null) {
											if (pattern_TypeDependency2UsageDependency_28_1_matchtggpattern_black_nac_4BB(
													uUsage, uPackage) == null) {
												if (pattern_TypeDependency2UsageDependency_28_1_matchtggpattern_black_nac_5BB(
														uUsage, uSrcType) == null) {
													return new Object[] { uPackage, uTrgType, uSrcType, uUsage };
												}
											}
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

	public static final boolean pattern_TypeDependency2UsageDependency_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_TypeDependency2UsageDependency_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_TypeDependency2UsageDependency_29_1_createresult_blackB(
			TypeDependency2UsageDependency _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_TypeDependency2UsageDependency_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_TypeDependency2UsageDependency_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, org.eclipse.modisco.java.Package mPackage) {
		if (ruleResult.getSourceObjects().contains(mPackage)) {
			return new Object[] { ruleResult, mPackage };
		}
		return null;
	}

	public static final Object[] pattern_TypeDependency2UsageDependency_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, MClass mSrcType) {
		if (ruleResult.getSourceObjects().contains(mSrcType)) {
			return new Object[] { ruleResult, mSrcType };
		}
		return null;
	}

	public static final Object[] pattern_TypeDependency2UsageDependency_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, ASTNode2Element src2Src) {
		if (ruleResult.getCorrObjects().contains(src2Src)) {
			return new Object[] { ruleResult, src2Src };
		}
		return null;
	}

	public static final Object[] pattern_TypeDependency2UsageDependency_29_2_isapplicablecore_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, org.eclipse.uml2.uml.Class uSrcType) {
		if (ruleResult.getTargetObjects().contains(uSrcType)) {
			return new Object[] { ruleResult, uSrcType };
		}
		return null;
	}

	public static final Object[] pattern_TypeDependency2UsageDependency_29_2_isapplicablecore_black_nac_4BB(
			ModelgeneratorRuleResult ruleResult, org.eclipse.uml2.uml.Package uPackage) {
		if (ruleResult.getTargetObjects().contains(uPackage)) {
			return new Object[] { ruleResult, uPackage };
		}
		return null;
	}

	public static final Object[] pattern_TypeDependency2UsageDependency_29_2_isapplicablecore_black_nac_5BB(
			ModelgeneratorRuleResult ruleResult, JavaPackage2UmlPackage p2p) {
		if (ruleResult.getCorrObjects().contains(p2p)) {
			return new Object[] { ruleResult, p2p };
		}
		return null;
	}

	public static final Object[] pattern_TypeDependency2UsageDependency_29_2_isapplicablecore_black_nac_6BB(
			ModelgeneratorRuleResult ruleResult, Classifier uTrgType) {
		if (ruleResult.getTargetObjects().contains(uTrgType)) {
			return new Object[] { ruleResult, uTrgType };
		}
		return null;
	}

	public static final Object[] pattern_TypeDependency2UsageDependency_29_2_isapplicablecore_black_nac_7BB(
			ModelgeneratorRuleResult ruleResult, ASTNode2Element trg2Trg) {
		if (ruleResult.getCorrObjects().contains(trg2Trg)) {
			return new Object[] { ruleResult, trg2Trg };
		}
		return null;
	}

	public static final Object[] pattern_TypeDependency2UsageDependency_29_2_isapplicablecore_black_nac_8BB(
			ModelgeneratorRuleResult ruleResult, Type mTrgType) {
		if (ruleResult.getSourceObjects().contains(mTrgType)) {
			return new Object[] { ruleResult, mTrgType };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_TypeDependency2UsageDependency_29_2_isapplicablecore_blackFFFFFFFFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList src2SrcList : ruleEntryContainer.getRuleEntryList()) {
			for (RuleEntryList trg2TrgList : ruleEntryContainer.getRuleEntryList()) {
				if (!src2SrcList.equals(trg2TrgList)) {
					for (EObject tmpSrc2Src : src2SrcList.getEntryObjects()) {
						if (tmpSrc2Src instanceof ASTNode2Element) {
							ASTNode2Element src2Src = (ASTNode2Element) tmpSrc2Src;
							ASTNode tmpMSrcType = src2Src.getSource();
							if (tmpMSrcType instanceof MClass) {
								MClass mSrcType = (MClass) tmpMSrcType;
								Element tmpUSrcType = src2Src.getTarget();
								if (tmpUSrcType instanceof org.eclipse.uml2.uml.Class) {
									org.eclipse.uml2.uml.Class uSrcType = (org.eclipse.uml2.uml.Class) tmpUSrcType;
									org.eclipse.modisco.java.Package mPackage = mSrcType.getPackage();
									if (mPackage != null) {
										Element tmpUPackage = uSrcType.getOwner();
										if (tmpUPackage instanceof org.eclipse.uml2.uml.Package) {
											org.eclipse.uml2.uml.Package uPackage = (org.eclipse.uml2.uml.Package) tmpUPackage;
											if (pattern_TypeDependency2UsageDependency_29_2_isapplicablecore_black_nac_2BB(
													ruleResult, src2Src) == null) {
												if (pattern_TypeDependency2UsageDependency_29_2_isapplicablecore_black_nac_1BB(
														ruleResult, mSrcType) == null) {
													if (pattern_TypeDependency2UsageDependency_29_2_isapplicablecore_black_nac_3BB(
															ruleResult, uSrcType) == null) {
														if (pattern_TypeDependency2UsageDependency_29_2_isapplicablecore_black_nac_0BB(
																ruleResult, mPackage) == null) {
															if (pattern_TypeDependency2UsageDependency_29_2_isapplicablecore_black_nac_4BB(
																	ruleResult, uPackage) == null) {
																for (EObject tmpTrg2Trg : trg2TrgList
																		.getEntryObjects()) {
																	if (tmpTrg2Trg instanceof ASTNode2Element) {
																		ASTNode2Element trg2Trg = (ASTNode2Element) tmpTrg2Trg;
																		if (!src2Src.equals(trg2Trg)) {
																			Element tmpUTrgType = trg2Trg.getTarget();
																			if (tmpUTrgType instanceof Classifier) {
																				Classifier uTrgType = (Classifier) tmpUTrgType;
																				if (!uSrcType.equals(uTrgType)) {
																					ASTNode tmpMTrgType = trg2Trg
																							.getSource();
																					if (tmpMTrgType instanceof Type) {
																						Type mTrgType = (Type) tmpMTrgType;
																						if (!mSrcType
																								.equals(mTrgType)) {
																							if (pattern_TypeDependency2UsageDependency_29_2_isapplicablecore_black_nac_7BB(
																									ruleResult,
																									trg2Trg) == null) {
																								if (pattern_TypeDependency2UsageDependency_29_2_isapplicablecore_black_nac_6BB(
																										ruleResult,
																										uTrgType) == null) {
																									if (pattern_TypeDependency2UsageDependency_29_2_isapplicablecore_black_nac_8BB(
																											ruleResult,
																											mTrgType) == null) {
																										for (JavaPackage2UmlPackage p2p : org.moflon.core.utilities.eMoflonEMFUtil
																												.getOppositeReferenceTyped(
																														mPackage,
																														JavaPackage2UmlPackage.class,
																														"source")) {
																											if (uPackage
																													.equals(p2p
																															.getTarget())) {
																												if (pattern_TypeDependency2UsageDependency_29_2_isapplicablecore_black_nac_5BB(
																														ruleResult,
																														p2p) == null) {
																													_result.add(
																															new Object[] {
																																	src2SrcList,
																																	mPackage,
																																	mSrcType,
																																	src2Src,
																																	uSrcType,
																																	uPackage,
																																	p2p,
																																	trg2TrgList,
																																	uTrgType,
																																	trg2Trg,
																																	mTrgType,
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
		}
		return _result;
	}

	public static final Object[] pattern_TypeDependency2UsageDependency_29_3_solveCSP_bindingFBBBBBBBBBBBB(
			TypeDependency2UsageDependency _this, IsApplicableMatch isApplicableMatch,
			org.eclipse.modisco.java.Package mPackage, org.eclipse.uml2.uml.Package uPackage, MClass mSrcType,
			Classifier uTrgType, org.eclipse.uml2.uml.Class uSrcType, ASTNode2Element trg2Trg, Type mTrgType,
			JavaPackage2UmlPackage p2p, ASTNode2Element src2Src, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, mPackage, uPackage, mSrcType,
				uTrgType, uSrcType, trg2Trg, mTrgType, p2p, src2Src, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mPackage, uPackage, mSrcType, uTrgType, uSrcType,
					trg2Trg, mTrgType, p2p, src2Src, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_TypeDependency2UsageDependency_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_TypeDependency2UsageDependency_29_3_solveCSP_bindingAndBlackFBBBBBBBBBBBB(
			TypeDependency2UsageDependency _this, IsApplicableMatch isApplicableMatch,
			org.eclipse.modisco.java.Package mPackage, org.eclipse.uml2.uml.Package uPackage, MClass mSrcType,
			Classifier uTrgType, org.eclipse.uml2.uml.Class uSrcType, ASTNode2Element trg2Trg, Type mTrgType,
			JavaPackage2UmlPackage p2p, ASTNode2Element src2Src, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_TypeDependency2UsageDependency_29_3_solveCSP_binding = pattern_TypeDependency2UsageDependency_29_3_solveCSP_bindingFBBBBBBBBBBBB(
				_this, isApplicableMatch, mPackage, uPackage, mSrcType, uTrgType, uSrcType, trg2Trg, mTrgType, p2p,
				src2Src, ruleResult);
		if (result_pattern_TypeDependency2UsageDependency_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_TypeDependency2UsageDependency_29_3_solveCSP_binding[0];

			Object[] result_pattern_TypeDependency2UsageDependency_29_3_solveCSP_black = pattern_TypeDependency2UsageDependency_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_TypeDependency2UsageDependency_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mPackage, uPackage, mSrcType, uTrgType, uSrcType,
						trg2Trg, mTrgType, p2p, src2Src, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_TypeDependency2UsageDependency_29_4_checkCSP_expressionFBB(
			TypeDependency2UsageDependency _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_TypeDependency2UsageDependency_29_5_checknacs_blackBBBBBBBBB(
			org.eclipse.modisco.java.Package mPackage, org.eclipse.uml2.uml.Package uPackage, MClass mSrcType,
			Classifier uTrgType, org.eclipse.uml2.uml.Class uSrcType, ASTNode2Element trg2Trg, Type mTrgType,
			JavaPackage2UmlPackage p2p, ASTNode2Element src2Src) {
		if (!mSrcType.equals(mTrgType)) {
			if (!uSrcType.equals(uTrgType)) {
				if (!src2Src.equals(trg2Trg)) {
					return new Object[] { mPackage, uPackage, mSrcType, uTrgType, uSrcType, trg2Trg, mTrgType, p2p,
							src2Src };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_TypeDependency2UsageDependency_29_6_perform_blackBBBBBBBBBB(
			org.eclipse.modisco.java.Package mPackage, org.eclipse.uml2.uml.Package uPackage, MClass mSrcType,
			Classifier uTrgType, org.eclipse.uml2.uml.Class uSrcType, ASTNode2Element trg2Trg, Type mTrgType,
			JavaPackage2UmlPackage p2p, ASTNode2Element src2Src, ModelgeneratorRuleResult ruleResult) {
		if (!mSrcType.equals(mTrgType)) {
			if (!uSrcType.equals(uTrgType)) {
				if (!src2Src.equals(trg2Trg)) {
					return new Object[] { mPackage, uPackage, mSrcType, uTrgType, uSrcType, trg2Trg, mTrgType, p2p,
							src2Src, ruleResult };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_TypeDependency2UsageDependency_29_6_perform_greenBBBBFBB(
			org.eclipse.uml2.uml.Package uPackage, MClass mSrcType, Classifier uTrgType,
			org.eclipse.uml2.uml.Class uSrcType, Type mTrgType, ModelgeneratorRuleResult ruleResult) {
		Usage uUsage = UMLFactory.eINSTANCE.createUsage();
		mSrcType.getDependencies().add(mTrgType);
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		uUsage.getSuppliers().add(uTrgType);
		uPackage.getPackagedElements().add(uUsage);
		uUsage.getClients().add(uSrcType);
		ruleResult.getTargetObjects().add(uUsage);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { uPackage, mSrcType, uTrgType, uSrcType, uUsage, mTrgType, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_TypeDependency2UsageDependency_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //TypeDependency2UsageDependencyImpl
