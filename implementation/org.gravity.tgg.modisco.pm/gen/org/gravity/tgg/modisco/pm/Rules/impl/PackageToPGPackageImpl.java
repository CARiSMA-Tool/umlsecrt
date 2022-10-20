/**
 */
package org.gravity.tgg.modisco.pm.Rules.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.LinkedList;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;

import org.eclipse.modisco.java.Model;

import org.eclipse.modisco.java.emf.JavaFactory;

import org.gravity.tgg.modisco.pm.ModelToTypeGraph;
import org.gravity.tgg.modisco.pm.PackageToTPackage;
import org.gravity.tgg.modisco.pm.PmFactory;

import org.gravity.tgg.modisco.pm.Rules.PackageToPGPackage;
import org.gravity.tgg.modisco.pm.Rules.RulesPackage;

import org.gravity.typegraph.basic.BasicFactory;
import org.gravity.typegraph.basic.TPackage;
import org.gravity.typegraph.basic.TypeGraph;

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
 * An implementation of the model object '<em><b>Package To PG Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class PackageToPGPackageImpl extends AbstractRuleImpl implements PackageToPGPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PackageToPGPackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getPackageToPGPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, org.eclipse.modisco.java.Package mPackage, Model mModel) {

		Object[] result1_black = PackageToPGPackageImpl.pattern_PackageToPGPackage_0_1_initialbindings_blackBBBB(this,
				match, mPackage, mModel);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[mPackage] = " + mPackage + ", " + "[mModel] = " + mModel + ".");
		}

		Object[] result2_bindingAndBlack = PackageToPGPackageImpl
				.pattern_PackageToPGPackage_0_2_SolveCSP_bindingAndBlackFBBBB(this, match, mPackage, mModel);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[mPackage] = " + mPackage + ", " + "[mModel] = " + mModel + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (PackageToPGPackageImpl.pattern_PackageToPGPackage_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = PackageToPGPackageImpl
					.pattern_PackageToPGPackage_0_4_collectelementstobetranslated_blackBBB(match, mPackage, mModel);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[mPackage] = " + mPackage + ", " + "[mModel] = " + mModel + ".");
			}
			PackageToPGPackageImpl.pattern_PackageToPGPackage_0_4_collectelementstobetranslated_greenBBBFF(match,
					mPackage, mModel);
			//nothing EMoflonEdge mPackage__mModel____model = (EMoflonEdge) result4_green[3];
			//nothing EMoflonEdge mModel__mPackage____ownedElements = (EMoflonEdge) result4_green[4];

			Object[] result5_black = PackageToPGPackageImpl
					.pattern_PackageToPGPackage_0_5_collectcontextelements_blackBBB(match, mPackage, mModel);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[mPackage] = " + mPackage + ", " + "[mModel] = " + mModel + ".");
			}
			PackageToPGPackageImpl.pattern_PackageToPGPackage_0_5_collectcontextelements_greenBB(match, mModel);

			// 
			PackageToPGPackageImpl.pattern_PackageToPGPackage_0_6_registerobjectstomatch_expressionBBBB(this, match,
					mPackage, mModel);
			return PackageToPGPackageImpl.pattern_PackageToPGPackage_0_7_expressionF();
		} else {
			return PackageToPGPackageImpl.pattern_PackageToPGPackage_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = PackageToPGPackageImpl
				.pattern_PackageToPGPackage_1_1_performtransformation_bindingAndBlackFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		ModelToTypeGraph mModelToTypeGraph = (ModelToTypeGraph) result1_bindingAndBlack[0];
		org.eclipse.modisco.java.Package mPackage = (org.eclipse.modisco.java.Package) result1_bindingAndBlack[1];
		TypeGraph typeGraph = (TypeGraph) result1_bindingAndBlack[2];
		Model mModel = (Model) result1_bindingAndBlack[3];
		CSP csp = (CSP) result1_bindingAndBlack[4];
		Object[] result1_green = PackageToPGPackageImpl
				.pattern_PackageToPGPackage_1_1_performtransformation_greenFBBFB(mPackage, typeGraph, csp);
		TPackage tPackage = (TPackage) result1_green[0];
		PackageToTPackage mPackageToTPackage = (PackageToTPackage) result1_green[3];

		Object[] result2_black = PackageToPGPackageImpl
				.pattern_PackageToPGPackage_1_2_collecttranslatedelements_blackBBB(tPackage, mPackage,
						mPackageToTPackage);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[tPackage] = " + tPackage + ", "
					+ "[mPackage] = " + mPackage + ", " + "[mPackageToTPackage] = " + mPackageToTPackage + ".");
		}
		Object[] result2_green = PackageToPGPackageImpl
				.pattern_PackageToPGPackage_1_2_collecttranslatedelements_greenFBBB(tPackage, mPackage,
						mPackageToTPackage);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = PackageToPGPackageImpl.pattern_PackageToPGPackage_1_3_bookkeepingforedges_blackBBBBBBB(
				ruleresult, mModelToTypeGraph, tPackage, mPackage, typeGraph, mModel, mPackageToTPackage);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[mModelToTypeGraph] = " + mModelToTypeGraph + ", " + "[tPackage] = " + tPackage + ", "
					+ "[mPackage] = " + mPackage + ", " + "[typeGraph] = " + typeGraph + ", " + "[mModel] = " + mModel
					+ ", " + "[mPackageToTPackage] = " + mPackageToTPackage + ".");
		}
		PackageToPGPackageImpl.pattern_PackageToPGPackage_1_3_bookkeepingforedges_greenBBBBBBFFFFFF(ruleresult,
				tPackage, mPackage, typeGraph, mModel, mPackageToTPackage);
		//nothing EMoflonEdge tPackage__typeGraph____model = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge mPackage__mModel____model = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge mModel__mPackage____ownedElements = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge typeGraph__tPackage____packages = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge mPackageToTPackage__tPackage____target = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge mPackageToTPackage__mPackage____source = (EMoflonEdge) result3_green[11];

		// 
		// 
		PackageToPGPackageImpl.pattern_PackageToPGPackage_1_5_registerobjects_expressionBBBBBBBB(this, ruleresult,
				mModelToTypeGraph, tPackage, mPackage, typeGraph, mModel, mPackageToTPackage);
		return PackageToPGPackageImpl.pattern_PackageToPGPackage_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = PackageToPGPackageImpl
				.pattern_PackageToPGPackage_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = PackageToPGPackageImpl
				.pattern_PackageToPGPackage_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = PackageToPGPackageImpl.pattern_PackageToPGPackage_2_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		org.eclipse.modisco.java.Package mPackage = (org.eclipse.modisco.java.Package) result2_binding[0];
		Model mModel = (Model) result2_binding[1];
		for (Object[] result2_black : PackageToPGPackageImpl
				.pattern_PackageToPGPackage_2_2_corematch_blackFBFBB(mPackage, mModel, match)) {
			ModelToTypeGraph mModelToTypeGraph = (ModelToTypeGraph) result2_black[0];
			TypeGraph typeGraph = (TypeGraph) result2_black[2];
			// ForEach 
			for (Object[] result3_black : PackageToPGPackageImpl.pattern_PackageToPGPackage_2_3_findcontext_blackBBBB(
					mModelToTypeGraph, mPackage, typeGraph, mModel)) {
				Object[] result3_green = PackageToPGPackageImpl
						.pattern_PackageToPGPackage_2_3_findcontext_greenBBBBFFFFF(mModelToTypeGraph, mPackage,
								typeGraph, mModel);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[4];
				//nothing EMoflonEdge mPackage__mModel____model = (EMoflonEdge) result3_green[5];
				//nothing EMoflonEdge mModel__mPackage____ownedElements = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge mModelToTypeGraph__mModel____source = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge mModelToTypeGraph__typeGraph____target = (EMoflonEdge) result3_green[8];

				Object[] result4_bindingAndBlack = PackageToPGPackageImpl
						.pattern_PackageToPGPackage_2_4_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch,
								mModelToTypeGraph, mPackage, typeGraph, mModel);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[mModelToTypeGraph] = "
							+ mModelToTypeGraph + ", " + "[mPackage] = " + mPackage + ", " + "[typeGraph] = "
							+ typeGraph + ", " + "[mModel] = " + mModel + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (PackageToPGPackageImpl.pattern_PackageToPGPackage_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = PackageToPGPackageImpl
							.pattern_PackageToPGPackage_2_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					PackageToPGPackageImpl.pattern_PackageToPGPackage_2_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return PackageToPGPackageImpl.pattern_PackageToPGPackage_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, org.eclipse.modisco.java.Package mPackage, Model mModel) {
		match.registerObject("mPackage", mPackage);
		match.registerObject("mModel", mModel);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, org.eclipse.modisco.java.Package mPackage, Model mModel) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, ModelToTypeGraph mModelToTypeGraph,
			org.eclipse.modisco.java.Package mPackage, TypeGraph typeGraph, Model mModel) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_mPackage_name = CSPFactoryHelper.eINSTANCE.createVariable("mPackage.name", true, csp);
		var_mPackage_name.setValue(mPackage.getName());
		var_mPackage_name.setType("String");

		// Create unbound variables
		Variable var_tPackage_tName = CSPFactoryHelper.eINSTANCE.createVariable("tPackage.tName", csp);
		var_tPackage_tName.setType("String");

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_mPackage_name, var_tPackage_tName);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("mModelToTypeGraph", mModelToTypeGraph);
		isApplicableMatch.registerObject("mPackage", mPackage);
		isApplicableMatch.registerObject("typeGraph", typeGraph);
		isApplicableMatch.registerObject("mModel", mModel);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject mModelToTypeGraph, EObject tPackage,
			EObject mPackage, EObject typeGraph, EObject mModel, EObject mPackageToTPackage) {
		ruleresult.registerObject("mModelToTypeGraph", mModelToTypeGraph);
		ruleresult.registerObject("tPackage", tPackage);
		ruleresult.registerObject("mPackage", mPackage);
		ruleresult.registerObject("typeGraph", typeGraph);
		ruleresult.registerObject("mModel", mModel);
		ruleresult.registerObject("mPackageToTPackage", mPackageToTPackage);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("mPackage").eClass()).equals("java.Package.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, TPackage tPackage, TypeGraph typeGraph) {

		Object[] result1_black = PackageToPGPackageImpl.pattern_PackageToPGPackage_10_1_initialbindings_blackBBBB(this,
				match, tPackage, typeGraph);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[match] = " + match
							+ ", " + "[tPackage] = " + tPackage + ", " + "[typeGraph] = " + typeGraph + ".");
		}

		Object[] result2_bindingAndBlack = PackageToPGPackageImpl
				.pattern_PackageToPGPackage_10_2_SolveCSP_bindingAndBlackFBBBB(this, match, tPackage, typeGraph);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[match] = " + match
							+ ", " + "[tPackage] = " + tPackage + ", " + "[typeGraph] = " + typeGraph + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (PackageToPGPackageImpl.pattern_PackageToPGPackage_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = PackageToPGPackageImpl
					.pattern_PackageToPGPackage_10_4_collectelementstobetranslated_blackBBB(match, tPackage, typeGraph);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[tPackage] = " + tPackage + ", " + "[typeGraph] = " + typeGraph + ".");
			}
			PackageToPGPackageImpl.pattern_PackageToPGPackage_10_4_collectelementstobetranslated_greenBBBFF(match,
					tPackage, typeGraph);
			//nothing EMoflonEdge tPackage__typeGraph____model = (EMoflonEdge) result4_green[3];
			//nothing EMoflonEdge typeGraph__tPackage____packages = (EMoflonEdge) result4_green[4];

			Object[] result5_black = PackageToPGPackageImpl
					.pattern_PackageToPGPackage_10_5_collectcontextelements_blackBBB(match, tPackage, typeGraph);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[tPackage] = " + tPackage + ", " + "[typeGraph] = " + typeGraph + ".");
			}
			PackageToPGPackageImpl.pattern_PackageToPGPackage_10_5_collectcontextelements_greenBB(match, typeGraph);

			// 
			PackageToPGPackageImpl.pattern_PackageToPGPackage_10_6_registerobjectstomatch_expressionBBBB(this, match,
					tPackage, typeGraph);
			return PackageToPGPackageImpl.pattern_PackageToPGPackage_10_7_expressionF();
		} else {
			return PackageToPGPackageImpl.pattern_PackageToPGPackage_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = PackageToPGPackageImpl
				.pattern_PackageToPGPackage_11_1_performtransformation_bindingAndBlackFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		ModelToTypeGraph mModelToTypeGraph = (ModelToTypeGraph) result1_bindingAndBlack[0];
		TPackage tPackage = (TPackage) result1_bindingAndBlack[1];
		TypeGraph typeGraph = (TypeGraph) result1_bindingAndBlack[2];
		Model mModel = (Model) result1_bindingAndBlack[3];
		CSP csp = (CSP) result1_bindingAndBlack[4];
		Object[] result1_green = PackageToPGPackageImpl
				.pattern_PackageToPGPackage_11_1_performtransformation_greenBFBFB(tPackage, mModel, csp);
		org.eclipse.modisco.java.Package mPackage = (org.eclipse.modisco.java.Package) result1_green[1];
		PackageToTPackage mPackageToTPackage = (PackageToTPackage) result1_green[3];

		Object[] result2_black = PackageToPGPackageImpl
				.pattern_PackageToPGPackage_11_2_collecttranslatedelements_blackBBB(tPackage, mPackage,
						mPackageToTPackage);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[tPackage] = " + tPackage + ", "
					+ "[mPackage] = " + mPackage + ", " + "[mPackageToTPackage] = " + mPackageToTPackage + ".");
		}
		Object[] result2_green = PackageToPGPackageImpl
				.pattern_PackageToPGPackage_11_2_collecttranslatedelements_greenFBBB(tPackage, mPackage,
						mPackageToTPackage);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = PackageToPGPackageImpl
				.pattern_PackageToPGPackage_11_3_bookkeepingforedges_blackBBBBBBB(ruleresult, mModelToTypeGraph,
						tPackage, mPackage, typeGraph, mModel, mPackageToTPackage);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[mModelToTypeGraph] = " + mModelToTypeGraph + ", " + "[tPackage] = " + tPackage + ", "
					+ "[mPackage] = " + mPackage + ", " + "[typeGraph] = " + typeGraph + ", " + "[mModel] = " + mModel
					+ ", " + "[mPackageToTPackage] = " + mPackageToTPackage + ".");
		}
		PackageToPGPackageImpl.pattern_PackageToPGPackage_11_3_bookkeepingforedges_greenBBBBBBFFFFFF(ruleresult,
				tPackage, mPackage, typeGraph, mModel, mPackageToTPackage);
		//nothing EMoflonEdge tPackage__typeGraph____model = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge mPackage__mModel____model = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge mModel__mPackage____ownedElements = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge typeGraph__tPackage____packages = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge mPackageToTPackage__tPackage____target = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge mPackageToTPackage__mPackage____source = (EMoflonEdge) result3_green[11];

		// 
		// 
		PackageToPGPackageImpl.pattern_PackageToPGPackage_11_5_registerobjects_expressionBBBBBBBB(this, ruleresult,
				mModelToTypeGraph, tPackage, mPackage, typeGraph, mModel, mPackageToTPackage);
		return PackageToPGPackageImpl.pattern_PackageToPGPackage_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = PackageToPGPackageImpl
				.pattern_PackageToPGPackage_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = PackageToPGPackageImpl
				.pattern_PackageToPGPackage_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = PackageToPGPackageImpl.pattern_PackageToPGPackage_12_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		TPackage tPackage = (TPackage) result2_binding[0];
		TypeGraph typeGraph = (TypeGraph) result2_binding[1];
		for (Object[] result2_black : PackageToPGPackageImpl
				.pattern_PackageToPGPackage_12_2_corematch_blackFBBFB(tPackage, typeGraph, match)) {
			ModelToTypeGraph mModelToTypeGraph = (ModelToTypeGraph) result2_black[0];
			Model mModel = (Model) result2_black[3];
			// ForEach 
			for (Object[] result3_black : PackageToPGPackageImpl.pattern_PackageToPGPackage_12_3_findcontext_blackBBBB(
					mModelToTypeGraph, tPackage, typeGraph, mModel)) {
				Object[] result3_green = PackageToPGPackageImpl
						.pattern_PackageToPGPackage_12_3_findcontext_greenBBBBFFFFF(mModelToTypeGraph, tPackage,
								typeGraph, mModel);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[4];
				//nothing EMoflonEdge tPackage__typeGraph____model = (EMoflonEdge) result3_green[5];
				//nothing EMoflonEdge mModelToTypeGraph__mModel____source = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge mModelToTypeGraph__typeGraph____target = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge typeGraph__tPackage____packages = (EMoflonEdge) result3_green[8];

				Object[] result4_bindingAndBlack = PackageToPGPackageImpl
						.pattern_PackageToPGPackage_12_4_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch,
								mModelToTypeGraph, tPackage, typeGraph, mModel);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[mModelToTypeGraph] = "
							+ mModelToTypeGraph + ", " + "[tPackage] = " + tPackage + ", " + "[typeGraph] = "
							+ typeGraph + ", " + "[mModel] = " + mModel + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (PackageToPGPackageImpl.pattern_PackageToPGPackage_12_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = PackageToPGPackageImpl
							.pattern_PackageToPGPackage_12_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					PackageToPGPackageImpl.pattern_PackageToPGPackage_12_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return PackageToPGPackageImpl.pattern_PackageToPGPackage_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, TPackage tPackage, TypeGraph typeGraph) {
		match.registerObject("tPackage", tPackage);
		match.registerObject("typeGraph", typeGraph);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, TPackage tPackage, TypeGraph typeGraph) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, ModelToTypeGraph mModelToTypeGraph,
			TPackage tPackage, TypeGraph typeGraph, Model mModel) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_tPackage_tName = CSPFactoryHelper.eINSTANCE.createVariable("tPackage.tName", true, csp);
		var_tPackage_tName.setValue(tPackage.getTName());
		var_tPackage_tName.setType("String");

		// Create unbound variables
		Variable var_mPackage_name = CSPFactoryHelper.eINSTANCE.createVariable("mPackage.name", csp);
		var_mPackage_name.setType("String");

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_mPackage_name, var_tPackage_tName);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("mModelToTypeGraph", mModelToTypeGraph);
		isApplicableMatch.registerObject("tPackage", tPackage);
		isApplicableMatch.registerObject("typeGraph", typeGraph);
		isApplicableMatch.registerObject("mModel", mModel);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject mModelToTypeGraph, EObject tPackage,
			EObject mPackage, EObject typeGraph, EObject mModel, EObject mPackageToTPackage) {
		ruleresult.registerObject("mModelToTypeGraph", mModelToTypeGraph);
		ruleresult.registerObject("tPackage", tPackage);
		ruleresult.registerObject("mPackage", mPackage);
		ruleresult.registerObject("typeGraph", typeGraph);
		ruleresult.registerObject("mModel", mModel);
		ruleresult.registerObject("mPackageToTPackage", mPackageToTPackage);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("tPackage").eClass())
				.equals("basic.TPackage.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_81(EMoflonEdge _edge_model) {

		Object[] result1_bindingAndBlack = PackageToPGPackageImpl
				.pattern_PackageToPGPackage_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = PackageToPGPackageImpl.pattern_PackageToPGPackage_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : PackageToPGPackageImpl
				.pattern_PackageToPGPackage_20_2_testcorematchandDECs_blackFFB(_edge_model)) {
			TPackage tPackage = (TPackage) result2_black[0];
			TypeGraph typeGraph = (TypeGraph) result2_black[1];
			Object[] result2_green = PackageToPGPackageImpl
					.pattern_PackageToPGPackage_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (PackageToPGPackageImpl
					.pattern_PackageToPGPackage_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(this,
							match, tPackage, typeGraph)) {
				// 
				if (PackageToPGPackageImpl
						.pattern_PackageToPGPackage_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = PackageToPGPackageImpl
							.pattern_PackageToPGPackage_20_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					PackageToPGPackageImpl.pattern_PackageToPGPackage_20_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return PackageToPGPackageImpl.pattern_PackageToPGPackage_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_85(EMoflonEdge _edge_model) {

		Object[] result1_bindingAndBlack = PackageToPGPackageImpl
				.pattern_PackageToPGPackage_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = PackageToPGPackageImpl.pattern_PackageToPGPackage_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : PackageToPGPackageImpl
				.pattern_PackageToPGPackage_21_2_testcorematchandDECs_blackFFB(_edge_model)) {
			org.eclipse.modisco.java.Package mPackage = (org.eclipse.modisco.java.Package) result2_black[0];
			Model mModel = (Model) result2_black[1];
			Object[] result2_green = PackageToPGPackageImpl
					.pattern_PackageToPGPackage_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (PackageToPGPackageImpl
					.pattern_PackageToPGPackage_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(this,
							match, mPackage, mModel)) {
				// 
				if (PackageToPGPackageImpl
						.pattern_PackageToPGPackage_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = PackageToPGPackageImpl
							.pattern_PackageToPGPackage_21_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					PackageToPGPackageImpl.pattern_PackageToPGPackage_21_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return PackageToPGPackageImpl.pattern_PackageToPGPackage_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("PackageToPGPackage");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		Variable var_tPackage_tName = CSPFactoryHelper.eINSTANCE.createVariable("tPackage", true, csp);
		var_tPackage_tName.setValue(__helper.getValue("tPackage", "tName"));
		var_tPackage_tName.setType("String");

		Variable var_mPackage_name = CSPFactoryHelper.eINSTANCE.createVariable("mPackage", true, csp);
		var_mPackage_name.setValue(__helper.getValue("mPackage", "name"));
		var_mPackage_name.setType("String");

		Eq eq0 = new Eq();
		csp.getConstraints().add(eq0);

		eq0.setRuleName("PackageToPGPackage");
		eq0.solve(var_mPackage_name, var_tPackage_tName);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_tPackage_tName.setBound(false);
			eq0.solve(var_mPackage_name, var_tPackage_tName);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
				__helper.setValue("tPackage", "tName", var_tPackage_tName.getValue());
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
		ruleResult.setRule("PackageToPGPackage");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		Variable var_tPackage_tName = CSPFactoryHelper.eINSTANCE.createVariable("tPackage", true, csp);
		var_tPackage_tName.setValue(__helper.getValue("tPackage", "tName"));
		var_tPackage_tName.setType("String");

		Variable var_mPackage_name = CSPFactoryHelper.eINSTANCE.createVariable("mPackage", true, csp);
		var_mPackage_name.setValue(__helper.getValue("mPackage", "name"));
		var_mPackage_name.setType("String");

		Eq eq0 = new Eq();
		csp.getConstraints().add(eq0);

		eq0.setRuleName("PackageToPGPackage");
		eq0.solve(var_mPackage_name, var_tPackage_tName);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_mPackage_name.setBound(false);
			eq0.solve(var_mPackage_name, var_tPackage_tName);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
				__helper.setValue("mPackage", "name", var_mPackage_name.getValue());
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

		Object[] result1_black = PackageToPGPackageImpl.pattern_PackageToPGPackage_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = PackageToPGPackageImpl.pattern_PackageToPGPackage_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = PackageToPGPackageImpl
				.pattern_PackageToPGPackage_24_2_matchsrctrgcontext_bindingAndBlackFFFFBB(sourceMatch, targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		TPackage tPackage = (TPackage) result2_bindingAndBlack[0];
		org.eclipse.modisco.java.Package mPackage = (org.eclipse.modisco.java.Package) result2_bindingAndBlack[1];
		TypeGraph typeGraph = (TypeGraph) result2_bindingAndBlack[2];
		Model mModel = (Model) result2_bindingAndBlack[3];

		Object[] result3_bindingAndBlack = PackageToPGPackageImpl
				.pattern_PackageToPGPackage_24_3_solvecsp_bindingAndBlackFBBBBBBB(this, tPackage, mPackage, typeGraph,
						mModel, sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[tPackage] = " + tPackage + ", " + "[mPackage] = " + mPackage + ", " + "[typeGraph] = "
					+ typeGraph + ", " + "[mModel] = " + mModel + ", " + "[sourceMatch] = " + sourceMatch + ", "
					+ "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (PackageToPGPackageImpl.pattern_PackageToPGPackage_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : PackageToPGPackageImpl
					.pattern_PackageToPGPackage_24_5_matchcorrcontext_blackFBBBB(typeGraph, mModel, sourceMatch,
							targetMatch)) {
				ModelToTypeGraph mModelToTypeGraph = (ModelToTypeGraph) result5_black[0];
				Object[] result5_green = PackageToPGPackageImpl
						.pattern_PackageToPGPackage_24_5_matchcorrcontext_greenBBBF(mModelToTypeGraph, sourceMatch,
								targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[3];

				Object[] result6_black = PackageToPGPackageImpl
						.pattern_PackageToPGPackage_24_6_createcorrespondence_blackBBBBB(tPackage, mPackage, typeGraph,
								mModel, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[tPackage] = " + tPackage
							+ ", " + "[mPackage] = " + mPackage + ", " + "[typeGraph] = " + typeGraph + ", "
							+ "[mModel] = " + mModel + ", " + "[ccMatch] = " + ccMatch + ".");
				}
				PackageToPGPackageImpl.pattern_PackageToPGPackage_24_6_createcorrespondence_greenBBFB(tPackage,
						mPackage, ccMatch);
				//nothing PackageToTPackage mPackageToTPackage = (PackageToTPackage) result6_green[2];

				Object[] result7_black = PackageToPGPackageImpl
						.pattern_PackageToPGPackage_24_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				PackageToPGPackageImpl.pattern_PackageToPGPackage_24_7_addtoreturnedresult_greenBB(result, ccMatch);

			}

		} else {
		}
		return PackageToPGPackageImpl.pattern_PackageToPGPackage_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(TPackage tPackage, org.eclipse.modisco.java.Package mPackage,
			TypeGraph typeGraph, Model mModel, Match sourceMatch, Match targetMatch) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals

		// Create attribute variables
		Variable var_mPackage_name = CSPFactoryHelper.eINSTANCE.createVariable("mPackage.name", true, csp);
		var_mPackage_name.setValue(mPackage.getName());
		var_mPackage_name.setType("String");
		Variable var_tPackage_tName = CSPFactoryHelper.eINSTANCE.createVariable("tPackage.tName", true, csp);
		var_tPackage_tName.setValue(tPackage.getTName());
		var_tPackage_tName.setType("String");

		// Create unbound variables

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_mPackage_name, var_tPackage_tName);
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
	public boolean checkDEC_FWD(org.eclipse.modisco.java.Package mPackage, Model mModel) {// 
		Object[] result1_black = PackageToPGPackageImpl
				.pattern_PackageToPGPackage_27_1_matchtggpattern_blackBB(mPackage, mModel);
		if (result1_black != null) {
			return PackageToPGPackageImpl.pattern_PackageToPGPackage_27_2_expressionF();
		} else {
			return PackageToPGPackageImpl.pattern_PackageToPGPackage_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(TPackage tPackage, TypeGraph typeGraph) {// 
		Object[] result1_black = PackageToPGPackageImpl
				.pattern_PackageToPGPackage_28_1_matchtggpattern_blackBB(tPackage, typeGraph);
		if (result1_black != null) {
			return PackageToPGPackageImpl.pattern_PackageToPGPackage_28_2_expressionF();
		} else {
			return PackageToPGPackageImpl.pattern_PackageToPGPackage_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer,
			ModelToTypeGraph mModelToTypeGraphParameter) {

		Object[] result1_black = PackageToPGPackageImpl.pattern_PackageToPGPackage_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = PackageToPGPackageImpl.pattern_PackageToPGPackage_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : PackageToPGPackageImpl
				.pattern_PackageToPGPackage_29_2_isapplicablecore_blackFFFFBB(ruleEntryContainer, ruleResult)) {
			//nothing RuleEntryList mModelToTypeGraphList = (RuleEntryList) result2_black[0];
			ModelToTypeGraph mModelToTypeGraph = (ModelToTypeGraph) result2_black[1];
			Model mModel = (Model) result2_black[2];
			TypeGraph typeGraph = (TypeGraph) result2_black[3];

			Object[] result3_bindingAndBlack = PackageToPGPackageImpl
					.pattern_PackageToPGPackage_29_3_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch,
							mModelToTypeGraph, typeGraph, mModel, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[mModelToTypeGraph] = "
						+ mModelToTypeGraph + ", " + "[typeGraph] = " + typeGraph + ", " + "[mModel] = " + mModel + ", "
						+ "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (PackageToPGPackageImpl.pattern_PackageToPGPackage_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = PackageToPGPackageImpl
						.pattern_PackageToPGPackage_29_5_checknacs_blackBBB(mModelToTypeGraph, typeGraph, mModel);
				if (result5_black != null) {

					Object[] result6_black = PackageToPGPackageImpl.pattern_PackageToPGPackage_29_6_perform_blackBBBB(
							mModelToTypeGraph, typeGraph, mModel, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: "
								+ "[mModelToTypeGraph] = " + mModelToTypeGraph + ", " + "[typeGraph] = " + typeGraph
								+ ", " + "[mModel] = " + mModel + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					PackageToPGPackageImpl.pattern_PackageToPGPackage_29_6_perform_greenFFBBFBB(typeGraph, mModel,
							ruleResult, csp);
					//nothing TPackage tPackage = (TPackage) result6_green[0];
					//nothing org.eclipse.modisco.java.Package mPackage = (org.eclipse.modisco.java.Package) result6_green[1];
					//nothing PackageToTPackage mPackageToTPackage = (PackageToTPackage) result6_green[4];

				} else {
				}

			} else {
			}

		}
		return PackageToPGPackageImpl.pattern_PackageToPGPackage_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, ModelToTypeGraph mModelToTypeGraph,
			TypeGraph typeGraph, Model mModel, ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables
		Variable var_mPackage_name = CSPFactoryHelper.eINSTANCE.createVariable("mPackage.name", csp);
		var_mPackage_name.setType("String");
		Variable var_tPackage_tName = CSPFactoryHelper.eINSTANCE.createVariable("tPackage.tName", csp);
		var_tPackage_tName.setType("String");

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_mPackage_name, var_tPackage_tName);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("mModelToTypeGraph", mModelToTypeGraph);
		isApplicableMatch.registerObject("typeGraph", typeGraph);
		isApplicableMatch.registerObject("mModel", mModel);
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
		case RulesPackage.PACKAGE_TO_PG_PACKAGE___IS_APPROPRIATE_FWD__MATCH_PACKAGE_MODEL:
			return isAppropriate_FWD((Match) arguments.get(0), (org.eclipse.modisco.java.Package) arguments.get(1),
					(Model) arguments.get(2));
		case RulesPackage.PACKAGE_TO_PG_PACKAGE___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.PACKAGE_TO_PG_PACKAGE___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.PACKAGE_TO_PG_PACKAGE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_PACKAGE_MODEL:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (org.eclipse.modisco.java.Package) arguments.get(1),
					(Model) arguments.get(2));
			return null;
		case RulesPackage.PACKAGE_TO_PG_PACKAGE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_PACKAGE_MODEL:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0),
					(org.eclipse.modisco.java.Package) arguments.get(1), (Model) arguments.get(2));
		case RulesPackage.PACKAGE_TO_PG_PACKAGE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.PACKAGE_TO_PG_PACKAGE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_MODELTOTYPEGRAPH_PACKAGE_TYPEGRAPH_MODEL:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (ModelToTypeGraph) arguments.get(1),
					(org.eclipse.modisco.java.Package) arguments.get(2), (TypeGraph) arguments.get(3),
					(Model) arguments.get(4));
		case RulesPackage.PACKAGE_TO_PG_PACKAGE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.PACKAGE_TO_PG_PACKAGE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6));
			return null;
		case RulesPackage.PACKAGE_TO_PG_PACKAGE___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.PACKAGE_TO_PG_PACKAGE___IS_APPROPRIATE_BWD__MATCH_TPACKAGE_TYPEGRAPH:
			return isAppropriate_BWD((Match) arguments.get(0), (TPackage) arguments.get(1),
					(TypeGraph) arguments.get(2));
		case RulesPackage.PACKAGE_TO_PG_PACKAGE___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.PACKAGE_TO_PG_PACKAGE___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.PACKAGE_TO_PG_PACKAGE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TPACKAGE_TYPEGRAPH:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (TPackage) arguments.get(1),
					(TypeGraph) arguments.get(2));
			return null;
		case RulesPackage.PACKAGE_TO_PG_PACKAGE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TPACKAGE_TYPEGRAPH:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (TPackage) arguments.get(1),
					(TypeGraph) arguments.get(2));
		case RulesPackage.PACKAGE_TO_PG_PACKAGE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.PACKAGE_TO_PG_PACKAGE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_MODELTOTYPEGRAPH_TPACKAGE_TYPEGRAPH_MODEL:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (ModelToTypeGraph) arguments.get(1),
					(TPackage) arguments.get(2), (TypeGraph) arguments.get(3), (Model) arguments.get(4));
		case RulesPackage.PACKAGE_TO_PG_PACKAGE___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.PACKAGE_TO_PG_PACKAGE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6));
			return null;
		case RulesPackage.PACKAGE_TO_PG_PACKAGE___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.PACKAGE_TO_PG_PACKAGE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_81__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_81((EMoflonEdge) arguments.get(0));
		case RulesPackage.PACKAGE_TO_PG_PACKAGE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_85__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_85((EMoflonEdge) arguments.get(0));
		case RulesPackage.PACKAGE_TO_PG_PACKAGE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.PACKAGE_TO_PG_PACKAGE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.PACKAGE_TO_PG_PACKAGE___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.PACKAGE_TO_PG_PACKAGE___IS_APPLICABLE_SOLVE_CSP_CC__TPACKAGE_PACKAGE_TYPEGRAPH_MODEL_MATCH_MATCH:
			return isApplicable_solveCsp_CC((TPackage) arguments.get(0),
					(org.eclipse.modisco.java.Package) arguments.get(1), (TypeGraph) arguments.get(2),
					(Model) arguments.get(3), (Match) arguments.get(4), (Match) arguments.get(5));
		case RulesPackage.PACKAGE_TO_PG_PACKAGE___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.PACKAGE_TO_PG_PACKAGE___CHECK_DEC_FWD__PACKAGE_MODEL:
			return checkDEC_FWD((org.eclipse.modisco.java.Package) arguments.get(0), (Model) arguments.get(1));
		case RulesPackage.PACKAGE_TO_PG_PACKAGE___CHECK_DEC_BWD__TPACKAGE_TYPEGRAPH:
			return checkDEC_BWD((TPackage) arguments.get(0), (TypeGraph) arguments.get(1));
		case RulesPackage.PACKAGE_TO_PG_PACKAGE___GENERATE_MODEL__RULEENTRYCONTAINER_MODELTOTYPEGRAPH:
			return generateModel((RuleEntryContainer) arguments.get(0), (ModelToTypeGraph) arguments.get(1));
		case RulesPackage.PACKAGE_TO_PG_PACKAGE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_MODELTOTYPEGRAPH_TYPEGRAPH_MODEL_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (ModelToTypeGraph) arguments.get(1),
					(TypeGraph) arguments.get(2), (Model) arguments.get(3),
					(ModelgeneratorRuleResult) arguments.get(4));
		case RulesPackage.PACKAGE_TO_PG_PACKAGE___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_PackageToPGPackage_0_1_initialbindings_blackBBBB(PackageToPGPackage _this,
			Match match, org.eclipse.modisco.java.Package mPackage, Model mModel) {
		return new Object[] { _this, match, mPackage, mModel };
	}

	public static final Object[] pattern_PackageToPGPackage_0_2_SolveCSP_bindingFBBBB(PackageToPGPackage _this,
			Match match, org.eclipse.modisco.java.Package mPackage, Model mModel) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, mPackage, mModel);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, mPackage, mModel };
		}
		return null;
	}

	public static final Object[] pattern_PackageToPGPackage_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_PackageToPGPackage_0_2_SolveCSP_bindingAndBlackFBBBB(PackageToPGPackage _this,
			Match match, org.eclipse.modisco.java.Package mPackage, Model mModel) {
		Object[] result_pattern_PackageToPGPackage_0_2_SolveCSP_binding = pattern_PackageToPGPackage_0_2_SolveCSP_bindingFBBBB(
				_this, match, mPackage, mModel);
		if (result_pattern_PackageToPGPackage_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_PackageToPGPackage_0_2_SolveCSP_binding[0];

			Object[] result_pattern_PackageToPGPackage_0_2_SolveCSP_black = pattern_PackageToPGPackage_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_PackageToPGPackage_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, mPackage, mModel };
			}
		}
		return null;
	}

	public static final boolean pattern_PackageToPGPackage_0_3_CheckCSP_expressionFBB(PackageToPGPackage _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_PackageToPGPackage_0_4_collectelementstobetranslated_blackBBB(Match match,
			org.eclipse.modisco.java.Package mPackage, Model mModel) {
		return new Object[] { match, mPackage, mModel };
	}

	public static final Object[] pattern_PackageToPGPackage_0_4_collectelementstobetranslated_greenBBBFF(Match match,
			org.eclipse.modisco.java.Package mPackage, Model mModel) {
		EMoflonEdge mPackage__mModel____model = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mModel__mPackage____ownedElements = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(mPackage);
		String mPackage__mModel____model_name_prime = "model";
		String mModel__mPackage____ownedElements_name_prime = "ownedElements";
		mPackage__mModel____model.setSrc(mPackage);
		mPackage__mModel____model.setTrg(mModel);
		match.getToBeTranslatedEdges().add(mPackage__mModel____model);
		mModel__mPackage____ownedElements.setSrc(mModel);
		mModel__mPackage____ownedElements.setTrg(mPackage);
		match.getToBeTranslatedEdges().add(mModel__mPackage____ownedElements);
		mPackage__mModel____model.setName(mPackage__mModel____model_name_prime);
		mModel__mPackage____ownedElements.setName(mModel__mPackage____ownedElements_name_prime);
		return new Object[] { match, mPackage, mModel, mPackage__mModel____model, mModel__mPackage____ownedElements };
	}

	public static final Object[] pattern_PackageToPGPackage_0_5_collectcontextelements_blackBBB(Match match,
			org.eclipse.modisco.java.Package mPackage, Model mModel) {
		return new Object[] { match, mPackage, mModel };
	}

	public static final Object[] pattern_PackageToPGPackage_0_5_collectcontextelements_greenBB(Match match,
			Model mModel) {
		match.getContextNodes().add(mModel);
		return new Object[] { match, mModel };
	}

	public static final void pattern_PackageToPGPackage_0_6_registerobjectstomatch_expressionBBBB(
			PackageToPGPackage _this, Match match, org.eclipse.modisco.java.Package mPackage, Model mModel) {
		_this.registerObjectsToMatch_FWD(match, mPackage, mModel);

	}

	public static final boolean pattern_PackageToPGPackage_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_PackageToPGPackage_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_PackageToPGPackage_1_1_performtransformation_bindingFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("mModelToTypeGraph");
		EObject _localVariable_1 = isApplicableMatch.getObject("mPackage");
		EObject _localVariable_2 = isApplicableMatch.getObject("typeGraph");
		EObject _localVariable_3 = isApplicableMatch.getObject("mModel");
		EObject tmpMModelToTypeGraph = _localVariable_0;
		EObject tmpMPackage = _localVariable_1;
		EObject tmpTypeGraph = _localVariable_2;
		EObject tmpMModel = _localVariable_3;
		if (tmpMModelToTypeGraph instanceof ModelToTypeGraph) {
			ModelToTypeGraph mModelToTypeGraph = (ModelToTypeGraph) tmpMModelToTypeGraph;
			if (tmpMPackage instanceof org.eclipse.modisco.java.Package) {
				org.eclipse.modisco.java.Package mPackage = (org.eclipse.modisco.java.Package) tmpMPackage;
				if (tmpTypeGraph instanceof TypeGraph) {
					TypeGraph typeGraph = (TypeGraph) tmpTypeGraph;
					if (tmpMModel instanceof Model) {
						Model mModel = (Model) tmpMModel;
						return new Object[] { mModelToTypeGraph, mPackage, typeGraph, mModel, isApplicableMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_PackageToPGPackage_1_1_performtransformation_blackBBBBFBB(
			ModelToTypeGraph mModelToTypeGraph, org.eclipse.modisco.java.Package mPackage, TypeGraph typeGraph,
			Model mModel, PackageToPGPackage _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { mModelToTypeGraph, mPackage, typeGraph, mModel, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_PackageToPGPackage_1_1_performtransformation_bindingAndBlackFFFFFBB(
			PackageToPGPackage _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_PackageToPGPackage_1_1_performtransformation_binding = pattern_PackageToPGPackage_1_1_performtransformation_bindingFFFFB(
				isApplicableMatch);
		if (result_pattern_PackageToPGPackage_1_1_performtransformation_binding != null) {
			ModelToTypeGraph mModelToTypeGraph = (ModelToTypeGraph) result_pattern_PackageToPGPackage_1_1_performtransformation_binding[0];
			org.eclipse.modisco.java.Package mPackage = (org.eclipse.modisco.java.Package) result_pattern_PackageToPGPackage_1_1_performtransformation_binding[1];
			TypeGraph typeGraph = (TypeGraph) result_pattern_PackageToPGPackage_1_1_performtransformation_binding[2];
			Model mModel = (Model) result_pattern_PackageToPGPackage_1_1_performtransformation_binding[3];

			Object[] result_pattern_PackageToPGPackage_1_1_performtransformation_black = pattern_PackageToPGPackage_1_1_performtransformation_blackBBBBFBB(
					mModelToTypeGraph, mPackage, typeGraph, mModel, _this, isApplicableMatch);
			if (result_pattern_PackageToPGPackage_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_PackageToPGPackage_1_1_performtransformation_black[4];

				return new Object[] { mModelToTypeGraph, mPackage, typeGraph, mModel, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_PackageToPGPackage_1_1_performtransformation_greenFBBFB(
			org.eclipse.modisco.java.Package mPackage, TypeGraph typeGraph, CSP csp) {
		TPackage tPackage = BasicFactory.eINSTANCE.createTPackage();
		PackageToTPackage mPackageToTPackage = PmFactory.eINSTANCE.createPackageToTPackage();
		Object _localVariable_0 = csp.getValue("tPackage", "tName");
		tPackage.setModel(typeGraph);
		typeGraph.getPackages().add(tPackage);
		mPackageToTPackage.setTarget(tPackage);
		mPackageToTPackage.setSource(mPackage);
		String tPackage_tName_prime = (String) _localVariable_0;
		tPackage.setTName(tPackage_tName_prime);
		return new Object[] { tPackage, mPackage, typeGraph, mPackageToTPackage, csp };
	}

	public static final Object[] pattern_PackageToPGPackage_1_2_collecttranslatedelements_blackBBB(TPackage tPackage,
			org.eclipse.modisco.java.Package mPackage, PackageToTPackage mPackageToTPackage) {
		return new Object[] { tPackage, mPackage, mPackageToTPackage };
	}

	public static final Object[] pattern_PackageToPGPackage_1_2_collecttranslatedelements_greenFBBB(TPackage tPackage,
			org.eclipse.modisco.java.Package mPackage, PackageToTPackage mPackageToTPackage) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(tPackage);
		ruleresult.getTranslatedElements().add(mPackage);
		ruleresult.getCreatedLinkElements().add(mPackageToTPackage);
		return new Object[] { ruleresult, tPackage, mPackage, mPackageToTPackage };
	}

	public static final Object[] pattern_PackageToPGPackage_1_3_bookkeepingforedges_blackBBBBBBB(
			PerformRuleResult ruleresult, EObject mModelToTypeGraph, EObject tPackage, EObject mPackage,
			EObject typeGraph, EObject mModel, EObject mPackageToTPackage) {
		if (!mModelToTypeGraph.equals(tPackage)) {
			if (!mModelToTypeGraph.equals(mPackage)) {
				if (!mModelToTypeGraph.equals(typeGraph)) {
					if (!mModelToTypeGraph.equals(mPackageToTPackage)) {
						if (!tPackage.equals(typeGraph)) {
							if (!mPackage.equals(tPackage)) {
								if (!mPackage.equals(typeGraph)) {
									if (!mPackage.equals(mPackageToTPackage)) {
										if (!mModel.equals(mModelToTypeGraph)) {
											if (!mModel.equals(tPackage)) {
												if (!mModel.equals(mPackage)) {
													if (!mModel.equals(typeGraph)) {
														if (!mModel.equals(mPackageToTPackage)) {
															if (!mPackageToTPackage.equals(tPackage)) {
																if (!mPackageToTPackage.equals(typeGraph)) {
																	return new Object[] { ruleresult, mModelToTypeGraph,
																			tPackage, mPackage, typeGraph, mModel,
																			mPackageToTPackage };
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_PackageToPGPackage_1_3_bookkeepingforedges_greenBBBBBBFFFFFF(
			PerformRuleResult ruleresult, EObject tPackage, EObject mPackage, EObject typeGraph, EObject mModel,
			EObject mPackageToTPackage) {
		EMoflonEdge tPackage__typeGraph____model = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mPackage__mModel____model = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mModel__mPackage____ownedElements = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge typeGraph__tPackage____packages = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mPackageToTPackage__tPackage____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mPackageToTPackage__mPackage____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "PackageToPGPackage";
		String tPackage__typeGraph____model_name_prime = "model";
		String mPackage__mModel____model_name_prime = "model";
		String mModel__mPackage____ownedElements_name_prime = "ownedElements";
		String typeGraph__tPackage____packages_name_prime = "packages";
		String mPackageToTPackage__tPackage____target_name_prime = "target";
		String mPackageToTPackage__mPackage____source_name_prime = "source";
		tPackage__typeGraph____model.setSrc(tPackage);
		tPackage__typeGraph____model.setTrg(typeGraph);
		ruleresult.getCreatedEdges().add(tPackage__typeGraph____model);
		mPackage__mModel____model.setSrc(mPackage);
		mPackage__mModel____model.setTrg(mModel);
		ruleresult.getTranslatedEdges().add(mPackage__mModel____model);
		mModel__mPackage____ownedElements.setSrc(mModel);
		mModel__mPackage____ownedElements.setTrg(mPackage);
		ruleresult.getTranslatedEdges().add(mModel__mPackage____ownedElements);
		typeGraph__tPackage____packages.setSrc(typeGraph);
		typeGraph__tPackage____packages.setTrg(tPackage);
		ruleresult.getCreatedEdges().add(typeGraph__tPackage____packages);
		mPackageToTPackage__tPackage____target.setSrc(mPackageToTPackage);
		mPackageToTPackage__tPackage____target.setTrg(tPackage);
		ruleresult.getCreatedEdges().add(mPackageToTPackage__tPackage____target);
		mPackageToTPackage__mPackage____source.setSrc(mPackageToTPackage);
		mPackageToTPackage__mPackage____source.setTrg(mPackage);
		ruleresult.getCreatedEdges().add(mPackageToTPackage__mPackage____source);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		tPackage__typeGraph____model.setName(tPackage__typeGraph____model_name_prime);
		mPackage__mModel____model.setName(mPackage__mModel____model_name_prime);
		mModel__mPackage____ownedElements.setName(mModel__mPackage____ownedElements_name_prime);
		typeGraph__tPackage____packages.setName(typeGraph__tPackage____packages_name_prime);
		mPackageToTPackage__tPackage____target.setName(mPackageToTPackage__tPackage____target_name_prime);
		mPackageToTPackage__mPackage____source.setName(mPackageToTPackage__mPackage____source_name_prime);
		return new Object[] { ruleresult, tPackage, mPackage, typeGraph, mModel, mPackageToTPackage,
				tPackage__typeGraph____model, mPackage__mModel____model, mModel__mPackage____ownedElements,
				typeGraph__tPackage____packages, mPackageToTPackage__tPackage____target,
				mPackageToTPackage__mPackage____source };
	}

	public static final void pattern_PackageToPGPackage_1_5_registerobjects_expressionBBBBBBBB(PackageToPGPackage _this,
			PerformRuleResult ruleresult, EObject mModelToTypeGraph, EObject tPackage, EObject mPackage,
			EObject typeGraph, EObject mModel, EObject mPackageToTPackage) {
		_this.registerObjects_FWD(ruleresult, mModelToTypeGraph, tPackage, mPackage, typeGraph, mModel,
				mPackageToTPackage);

	}

	public static final PerformRuleResult pattern_PackageToPGPackage_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_PackageToPGPackage_2_1_preparereturnvalue_bindingFB(PackageToPGPackage _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_PackageToPGPackage_2_1_preparereturnvalue_blackFBB(EClass eClass,
			PackageToPGPackage _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_PackageToPGPackage_2_1_preparereturnvalue_bindingAndBlackFFB(
			PackageToPGPackage _this) {
		Object[] result_pattern_PackageToPGPackage_2_1_preparereturnvalue_binding = pattern_PackageToPGPackage_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_PackageToPGPackage_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_PackageToPGPackage_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_PackageToPGPackage_2_1_preparereturnvalue_black = pattern_PackageToPGPackage_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_PackageToPGPackage_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_PackageToPGPackage_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_PackageToPGPackage_2_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "PackageToPGPackage";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_PackageToPGPackage_2_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("mPackage");
		EObject _localVariable_1 = match.getObject("mModel");
		EObject tmpMPackage = _localVariable_0;
		EObject tmpMModel = _localVariable_1;
		if (tmpMPackage instanceof org.eclipse.modisco.java.Package) {
			org.eclipse.modisco.java.Package mPackage = (org.eclipse.modisco.java.Package) tmpMPackage;
			if (tmpMModel instanceof Model) {
				Model mModel = (Model) tmpMModel;
				return new Object[] { mPackage, mModel, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_PackageToPGPackage_2_2_corematch_blackFBFBB(
			org.eclipse.modisco.java.Package mPackage, Model mModel, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (ModelToTypeGraph mModelToTypeGraph : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mModel, ModelToTypeGraph.class, "source")) {
			TypeGraph typeGraph = mModelToTypeGraph.getTarget();
			if (typeGraph != null) {
				_result.add(new Object[] { mModelToTypeGraph, mPackage, typeGraph, mModel, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_PackageToPGPackage_2_3_findcontext_blackBBBB(
			ModelToTypeGraph mModelToTypeGraph, org.eclipse.modisco.java.Package mPackage, TypeGraph typeGraph,
			Model mModel) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (mModel.equals(mPackage.getModel())) {
			if (mModel.equals(mModelToTypeGraph.getSource())) {
				if (typeGraph.equals(mModelToTypeGraph.getTarget())) {
					_result.add(new Object[] { mModelToTypeGraph, mPackage, typeGraph, mModel });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_PackageToPGPackage_2_3_findcontext_greenBBBBFFFFF(
			ModelToTypeGraph mModelToTypeGraph, org.eclipse.modisco.java.Package mPackage, TypeGraph typeGraph,
			Model mModel) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge mPackage__mModel____model = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mModel__mPackage____ownedElements = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mModelToTypeGraph__mModel____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mModelToTypeGraph__typeGraph____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String mPackage__mModel____model_name_prime = "model";
		String mModel__mPackage____ownedElements_name_prime = "ownedElements";
		String mModelToTypeGraph__mModel____source_name_prime = "source";
		String mModelToTypeGraph__typeGraph____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(mModelToTypeGraph);
		isApplicableMatch.getAllContextElements().add(mPackage);
		isApplicableMatch.getAllContextElements().add(typeGraph);
		isApplicableMatch.getAllContextElements().add(mModel);
		mPackage__mModel____model.setSrc(mPackage);
		mPackage__mModel____model.setTrg(mModel);
		isApplicableMatch.getAllContextElements().add(mPackage__mModel____model);
		mModel__mPackage____ownedElements.setSrc(mModel);
		mModel__mPackage____ownedElements.setTrg(mPackage);
		isApplicableMatch.getAllContextElements().add(mModel__mPackage____ownedElements);
		mModelToTypeGraph__mModel____source.setSrc(mModelToTypeGraph);
		mModelToTypeGraph__mModel____source.setTrg(mModel);
		isApplicableMatch.getAllContextElements().add(mModelToTypeGraph__mModel____source);
		mModelToTypeGraph__typeGraph____target.setSrc(mModelToTypeGraph);
		mModelToTypeGraph__typeGraph____target.setTrg(typeGraph);
		isApplicableMatch.getAllContextElements().add(mModelToTypeGraph__typeGraph____target);
		mPackage__mModel____model.setName(mPackage__mModel____model_name_prime);
		mModel__mPackage____ownedElements.setName(mModel__mPackage____ownedElements_name_prime);
		mModelToTypeGraph__mModel____source.setName(mModelToTypeGraph__mModel____source_name_prime);
		mModelToTypeGraph__typeGraph____target.setName(mModelToTypeGraph__typeGraph____target_name_prime);
		return new Object[] { mModelToTypeGraph, mPackage, typeGraph, mModel, isApplicableMatch,
				mPackage__mModel____model, mModel__mPackage____ownedElements, mModelToTypeGraph__mModel____source,
				mModelToTypeGraph__typeGraph____target };
	}

	public static final Object[] pattern_PackageToPGPackage_2_4_solveCSP_bindingFBBBBBB(PackageToPGPackage _this,
			IsApplicableMatch isApplicableMatch, ModelToTypeGraph mModelToTypeGraph,
			org.eclipse.modisco.java.Package mPackage, TypeGraph typeGraph, Model mModel) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, mModelToTypeGraph, mPackage,
				typeGraph, mModel);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mModelToTypeGraph, mPackage, typeGraph, mModel };
		}
		return null;
	}

	public static final Object[] pattern_PackageToPGPackage_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_PackageToPGPackage_2_4_solveCSP_bindingAndBlackFBBBBBB(
			PackageToPGPackage _this, IsApplicableMatch isApplicableMatch, ModelToTypeGraph mModelToTypeGraph,
			org.eclipse.modisco.java.Package mPackage, TypeGraph typeGraph, Model mModel) {
		Object[] result_pattern_PackageToPGPackage_2_4_solveCSP_binding = pattern_PackageToPGPackage_2_4_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, mModelToTypeGraph, mPackage, typeGraph, mModel);
		if (result_pattern_PackageToPGPackage_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_PackageToPGPackage_2_4_solveCSP_binding[0];

			Object[] result_pattern_PackageToPGPackage_2_4_solveCSP_black = pattern_PackageToPGPackage_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_PackageToPGPackage_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mModelToTypeGraph, mPackage, typeGraph, mModel };
			}
		}
		return null;
	}

	public static final boolean pattern_PackageToPGPackage_2_5_checkCSP_expressionFBB(PackageToPGPackage _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_PackageToPGPackage_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_PackageToPGPackage_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "PackageToPGPackage";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_PackageToPGPackage_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_PackageToPGPackage_10_1_initialbindings_blackBBBB(PackageToPGPackage _this,
			Match match, TPackage tPackage, TypeGraph typeGraph) {
		return new Object[] { _this, match, tPackage, typeGraph };
	}

	public static final Object[] pattern_PackageToPGPackage_10_2_SolveCSP_bindingFBBBB(PackageToPGPackage _this,
			Match match, TPackage tPackage, TypeGraph typeGraph) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, tPackage, typeGraph);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, tPackage, typeGraph };
		}
		return null;
	}

	public static final Object[] pattern_PackageToPGPackage_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_PackageToPGPackage_10_2_SolveCSP_bindingAndBlackFBBBB(PackageToPGPackage _this,
			Match match, TPackage tPackage, TypeGraph typeGraph) {
		Object[] result_pattern_PackageToPGPackage_10_2_SolveCSP_binding = pattern_PackageToPGPackage_10_2_SolveCSP_bindingFBBBB(
				_this, match, tPackage, typeGraph);
		if (result_pattern_PackageToPGPackage_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_PackageToPGPackage_10_2_SolveCSP_binding[0];

			Object[] result_pattern_PackageToPGPackage_10_2_SolveCSP_black = pattern_PackageToPGPackage_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_PackageToPGPackage_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, tPackage, typeGraph };
			}
		}
		return null;
	}

	public static final boolean pattern_PackageToPGPackage_10_3_CheckCSP_expressionFBB(PackageToPGPackage _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_PackageToPGPackage_10_4_collectelementstobetranslated_blackBBB(Match match,
			TPackage tPackage, TypeGraph typeGraph) {
		return new Object[] { match, tPackage, typeGraph };
	}

	public static final Object[] pattern_PackageToPGPackage_10_4_collectelementstobetranslated_greenBBBFF(Match match,
			TPackage tPackage, TypeGraph typeGraph) {
		EMoflonEdge tPackage__typeGraph____model = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge typeGraph__tPackage____packages = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(tPackage);
		String tPackage__typeGraph____model_name_prime = "model";
		String typeGraph__tPackage____packages_name_prime = "packages";
		tPackage__typeGraph____model.setSrc(tPackage);
		tPackage__typeGraph____model.setTrg(typeGraph);
		match.getToBeTranslatedEdges().add(tPackage__typeGraph____model);
		typeGraph__tPackage____packages.setSrc(typeGraph);
		typeGraph__tPackage____packages.setTrg(tPackage);
		match.getToBeTranslatedEdges().add(typeGraph__tPackage____packages);
		tPackage__typeGraph____model.setName(tPackage__typeGraph____model_name_prime);
		typeGraph__tPackage____packages.setName(typeGraph__tPackage____packages_name_prime);
		return new Object[] { match, tPackage, typeGraph, tPackage__typeGraph____model,
				typeGraph__tPackage____packages };
	}

	public static final Object[] pattern_PackageToPGPackage_10_5_collectcontextelements_blackBBB(Match match,
			TPackage tPackage, TypeGraph typeGraph) {
		return new Object[] { match, tPackage, typeGraph };
	}

	public static final Object[] pattern_PackageToPGPackage_10_5_collectcontextelements_greenBB(Match match,
			TypeGraph typeGraph) {
		match.getContextNodes().add(typeGraph);
		return new Object[] { match, typeGraph };
	}

	public static final void pattern_PackageToPGPackage_10_6_registerobjectstomatch_expressionBBBB(
			PackageToPGPackage _this, Match match, TPackage tPackage, TypeGraph typeGraph) {
		_this.registerObjectsToMatch_BWD(match, tPackage, typeGraph);

	}

	public static final boolean pattern_PackageToPGPackage_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_PackageToPGPackage_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_PackageToPGPackage_11_1_performtransformation_bindingFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("mModelToTypeGraph");
		EObject _localVariable_1 = isApplicableMatch.getObject("tPackage");
		EObject _localVariable_2 = isApplicableMatch.getObject("typeGraph");
		EObject _localVariable_3 = isApplicableMatch.getObject("mModel");
		EObject tmpMModelToTypeGraph = _localVariable_0;
		EObject tmpTPackage = _localVariable_1;
		EObject tmpTypeGraph = _localVariable_2;
		EObject tmpMModel = _localVariable_3;
		if (tmpMModelToTypeGraph instanceof ModelToTypeGraph) {
			ModelToTypeGraph mModelToTypeGraph = (ModelToTypeGraph) tmpMModelToTypeGraph;
			if (tmpTPackage instanceof TPackage) {
				TPackage tPackage = (TPackage) tmpTPackage;
				if (tmpTypeGraph instanceof TypeGraph) {
					TypeGraph typeGraph = (TypeGraph) tmpTypeGraph;
					if (tmpMModel instanceof Model) {
						Model mModel = (Model) tmpMModel;
						return new Object[] { mModelToTypeGraph, tPackage, typeGraph, mModel, isApplicableMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_PackageToPGPackage_11_1_performtransformation_blackBBBBFBB(
			ModelToTypeGraph mModelToTypeGraph, TPackage tPackage, TypeGraph typeGraph, Model mModel,
			PackageToPGPackage _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { mModelToTypeGraph, tPackage, typeGraph, mModel, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_PackageToPGPackage_11_1_performtransformation_bindingAndBlackFFFFFBB(
			PackageToPGPackage _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_PackageToPGPackage_11_1_performtransformation_binding = pattern_PackageToPGPackage_11_1_performtransformation_bindingFFFFB(
				isApplicableMatch);
		if (result_pattern_PackageToPGPackage_11_1_performtransformation_binding != null) {
			ModelToTypeGraph mModelToTypeGraph = (ModelToTypeGraph) result_pattern_PackageToPGPackage_11_1_performtransformation_binding[0];
			TPackage tPackage = (TPackage) result_pattern_PackageToPGPackage_11_1_performtransformation_binding[1];
			TypeGraph typeGraph = (TypeGraph) result_pattern_PackageToPGPackage_11_1_performtransformation_binding[2];
			Model mModel = (Model) result_pattern_PackageToPGPackage_11_1_performtransformation_binding[3];

			Object[] result_pattern_PackageToPGPackage_11_1_performtransformation_black = pattern_PackageToPGPackage_11_1_performtransformation_blackBBBBFBB(
					mModelToTypeGraph, tPackage, typeGraph, mModel, _this, isApplicableMatch);
			if (result_pattern_PackageToPGPackage_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_PackageToPGPackage_11_1_performtransformation_black[4];

				return new Object[] { mModelToTypeGraph, tPackage, typeGraph, mModel, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_PackageToPGPackage_11_1_performtransformation_greenBFBFB(TPackage tPackage,
			Model mModel, CSP csp) {
		org.eclipse.modisco.java.Package mPackage = JavaFactory.eINSTANCE.createPackage();
		PackageToTPackage mPackageToTPackage = PmFactory.eINSTANCE.createPackageToTPackage();
		Object _localVariable_0 = csp.getValue("mPackage", "name");
		mPackage.setModel(mModel);
		mPackageToTPackage.setTarget(tPackage);
		mPackageToTPackage.setSource(mPackage);
		String mPackage_name_prime = (String) _localVariable_0;
		mPackage.setName(mPackage_name_prime);
		return new Object[] { tPackage, mPackage, mModel, mPackageToTPackage, csp };
	}

	public static final Object[] pattern_PackageToPGPackage_11_2_collecttranslatedelements_blackBBB(TPackage tPackage,
			org.eclipse.modisco.java.Package mPackage, PackageToTPackage mPackageToTPackage) {
		return new Object[] { tPackage, mPackage, mPackageToTPackage };
	}

	public static final Object[] pattern_PackageToPGPackage_11_2_collecttranslatedelements_greenFBBB(TPackage tPackage,
			org.eclipse.modisco.java.Package mPackage, PackageToTPackage mPackageToTPackage) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(tPackage);
		ruleresult.getCreatedElements().add(mPackage);
		ruleresult.getCreatedLinkElements().add(mPackageToTPackage);
		return new Object[] { ruleresult, tPackage, mPackage, mPackageToTPackage };
	}

	public static final Object[] pattern_PackageToPGPackage_11_3_bookkeepingforedges_blackBBBBBBB(
			PerformRuleResult ruleresult, EObject mModelToTypeGraph, EObject tPackage, EObject mPackage,
			EObject typeGraph, EObject mModel, EObject mPackageToTPackage) {
		if (!mModelToTypeGraph.equals(tPackage)) {
			if (!mModelToTypeGraph.equals(mPackage)) {
				if (!mModelToTypeGraph.equals(typeGraph)) {
					if (!mModelToTypeGraph.equals(mPackageToTPackage)) {
						if (!tPackage.equals(typeGraph)) {
							if (!mPackage.equals(tPackage)) {
								if (!mPackage.equals(typeGraph)) {
									if (!mPackage.equals(mPackageToTPackage)) {
										if (!mModel.equals(mModelToTypeGraph)) {
											if (!mModel.equals(tPackage)) {
												if (!mModel.equals(mPackage)) {
													if (!mModel.equals(typeGraph)) {
														if (!mModel.equals(mPackageToTPackage)) {
															if (!mPackageToTPackage.equals(tPackage)) {
																if (!mPackageToTPackage.equals(typeGraph)) {
																	return new Object[] { ruleresult, mModelToTypeGraph,
																			tPackage, mPackage, typeGraph, mModel,
																			mPackageToTPackage };
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_PackageToPGPackage_11_3_bookkeepingforedges_greenBBBBBBFFFFFF(
			PerformRuleResult ruleresult, EObject tPackage, EObject mPackage, EObject typeGraph, EObject mModel,
			EObject mPackageToTPackage) {
		EMoflonEdge tPackage__typeGraph____model = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mPackage__mModel____model = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mModel__mPackage____ownedElements = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge typeGraph__tPackage____packages = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mPackageToTPackage__tPackage____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mPackageToTPackage__mPackage____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "PackageToPGPackage";
		String tPackage__typeGraph____model_name_prime = "model";
		String mPackage__mModel____model_name_prime = "model";
		String mModel__mPackage____ownedElements_name_prime = "ownedElements";
		String typeGraph__tPackage____packages_name_prime = "packages";
		String mPackageToTPackage__tPackage____target_name_prime = "target";
		String mPackageToTPackage__mPackage____source_name_prime = "source";
		tPackage__typeGraph____model.setSrc(tPackage);
		tPackage__typeGraph____model.setTrg(typeGraph);
		ruleresult.getTranslatedEdges().add(tPackage__typeGraph____model);
		mPackage__mModel____model.setSrc(mPackage);
		mPackage__mModel____model.setTrg(mModel);
		ruleresult.getCreatedEdges().add(mPackage__mModel____model);
		mModel__mPackage____ownedElements.setSrc(mModel);
		mModel__mPackage____ownedElements.setTrg(mPackage);
		ruleresult.getCreatedEdges().add(mModel__mPackage____ownedElements);
		typeGraph__tPackage____packages.setSrc(typeGraph);
		typeGraph__tPackage____packages.setTrg(tPackage);
		ruleresult.getTranslatedEdges().add(typeGraph__tPackage____packages);
		mPackageToTPackage__tPackage____target.setSrc(mPackageToTPackage);
		mPackageToTPackage__tPackage____target.setTrg(tPackage);
		ruleresult.getCreatedEdges().add(mPackageToTPackage__tPackage____target);
		mPackageToTPackage__mPackage____source.setSrc(mPackageToTPackage);
		mPackageToTPackage__mPackage____source.setTrg(mPackage);
		ruleresult.getCreatedEdges().add(mPackageToTPackage__mPackage____source);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		tPackage__typeGraph____model.setName(tPackage__typeGraph____model_name_prime);
		mPackage__mModel____model.setName(mPackage__mModel____model_name_prime);
		mModel__mPackage____ownedElements.setName(mModel__mPackage____ownedElements_name_prime);
		typeGraph__tPackage____packages.setName(typeGraph__tPackage____packages_name_prime);
		mPackageToTPackage__tPackage____target.setName(mPackageToTPackage__tPackage____target_name_prime);
		mPackageToTPackage__mPackage____source.setName(mPackageToTPackage__mPackage____source_name_prime);
		return new Object[] { ruleresult, tPackage, mPackage, typeGraph, mModel, mPackageToTPackage,
				tPackage__typeGraph____model, mPackage__mModel____model, mModel__mPackage____ownedElements,
				typeGraph__tPackage____packages, mPackageToTPackage__tPackage____target,
				mPackageToTPackage__mPackage____source };
	}

	public static final void pattern_PackageToPGPackage_11_5_registerobjects_expressionBBBBBBBB(
			PackageToPGPackage _this, PerformRuleResult ruleresult, EObject mModelToTypeGraph, EObject tPackage,
			EObject mPackage, EObject typeGraph, EObject mModel, EObject mPackageToTPackage) {
		_this.registerObjects_BWD(ruleresult, mModelToTypeGraph, tPackage, mPackage, typeGraph, mModel,
				mPackageToTPackage);

	}

	public static final PerformRuleResult pattern_PackageToPGPackage_11_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_PackageToPGPackage_12_1_preparereturnvalue_bindingFB(
			PackageToPGPackage _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_PackageToPGPackage_12_1_preparereturnvalue_blackFBB(EClass eClass,
			PackageToPGPackage _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_PackageToPGPackage_12_1_preparereturnvalue_bindingAndBlackFFB(
			PackageToPGPackage _this) {
		Object[] result_pattern_PackageToPGPackage_12_1_preparereturnvalue_binding = pattern_PackageToPGPackage_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_PackageToPGPackage_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_PackageToPGPackage_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_PackageToPGPackage_12_1_preparereturnvalue_black = pattern_PackageToPGPackage_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_PackageToPGPackage_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_PackageToPGPackage_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_PackageToPGPackage_12_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "PackageToPGPackage";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_PackageToPGPackage_12_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("tPackage");
		EObject _localVariable_1 = match.getObject("typeGraph");
		EObject tmpTPackage = _localVariable_0;
		EObject tmpTypeGraph = _localVariable_1;
		if (tmpTPackage instanceof TPackage) {
			TPackage tPackage = (TPackage) tmpTPackage;
			if (tmpTypeGraph instanceof TypeGraph) {
				TypeGraph typeGraph = (TypeGraph) tmpTypeGraph;
				return new Object[] { tPackage, typeGraph, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_PackageToPGPackage_12_2_corematch_blackFBBFB(TPackage tPackage,
			TypeGraph typeGraph, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (ModelToTypeGraph mModelToTypeGraph : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeGraph, ModelToTypeGraph.class, "target")) {
			Model mModel = mModelToTypeGraph.getSource();
			if (mModel != null) {
				_result.add(new Object[] { mModelToTypeGraph, tPackage, typeGraph, mModel, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_PackageToPGPackage_12_3_findcontext_blackBBBB(
			ModelToTypeGraph mModelToTypeGraph, TPackage tPackage, TypeGraph typeGraph, Model mModel) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (typeGraph.equals(tPackage.getModel())) {
			if (mModel.equals(mModelToTypeGraph.getSource())) {
				if (typeGraph.equals(mModelToTypeGraph.getTarget())) {
					if (typeGraph.getPackages().contains(tPackage)) {
						_result.add(new Object[] { mModelToTypeGraph, tPackage, typeGraph, mModel });
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_PackageToPGPackage_12_3_findcontext_greenBBBBFFFFF(
			ModelToTypeGraph mModelToTypeGraph, TPackage tPackage, TypeGraph typeGraph, Model mModel) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge tPackage__typeGraph____model = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mModelToTypeGraph__mModel____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mModelToTypeGraph__typeGraph____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge typeGraph__tPackage____packages = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String tPackage__typeGraph____model_name_prime = "model";
		String mModelToTypeGraph__mModel____source_name_prime = "source";
		String mModelToTypeGraph__typeGraph____target_name_prime = "target";
		String typeGraph__tPackage____packages_name_prime = "packages";
		isApplicableMatch.getAllContextElements().add(mModelToTypeGraph);
		isApplicableMatch.getAllContextElements().add(tPackage);
		isApplicableMatch.getAllContextElements().add(typeGraph);
		isApplicableMatch.getAllContextElements().add(mModel);
		tPackage__typeGraph____model.setSrc(tPackage);
		tPackage__typeGraph____model.setTrg(typeGraph);
		isApplicableMatch.getAllContextElements().add(tPackage__typeGraph____model);
		mModelToTypeGraph__mModel____source.setSrc(mModelToTypeGraph);
		mModelToTypeGraph__mModel____source.setTrg(mModel);
		isApplicableMatch.getAllContextElements().add(mModelToTypeGraph__mModel____source);
		mModelToTypeGraph__typeGraph____target.setSrc(mModelToTypeGraph);
		mModelToTypeGraph__typeGraph____target.setTrg(typeGraph);
		isApplicableMatch.getAllContextElements().add(mModelToTypeGraph__typeGraph____target);
		typeGraph__tPackage____packages.setSrc(typeGraph);
		typeGraph__tPackage____packages.setTrg(tPackage);
		isApplicableMatch.getAllContextElements().add(typeGraph__tPackage____packages);
		tPackage__typeGraph____model.setName(tPackage__typeGraph____model_name_prime);
		mModelToTypeGraph__mModel____source.setName(mModelToTypeGraph__mModel____source_name_prime);
		mModelToTypeGraph__typeGraph____target.setName(mModelToTypeGraph__typeGraph____target_name_prime);
		typeGraph__tPackage____packages.setName(typeGraph__tPackage____packages_name_prime);
		return new Object[] { mModelToTypeGraph, tPackage, typeGraph, mModel, isApplicableMatch,
				tPackage__typeGraph____model, mModelToTypeGraph__mModel____source,
				mModelToTypeGraph__typeGraph____target, typeGraph__tPackage____packages };
	}

	public static final Object[] pattern_PackageToPGPackage_12_4_solveCSP_bindingFBBBBBB(PackageToPGPackage _this,
			IsApplicableMatch isApplicableMatch, ModelToTypeGraph mModelToTypeGraph, TPackage tPackage,
			TypeGraph typeGraph, Model mModel) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, mModelToTypeGraph, tPackage,
				typeGraph, mModel);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mModelToTypeGraph, tPackage, typeGraph, mModel };
		}
		return null;
	}

	public static final Object[] pattern_PackageToPGPackage_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_PackageToPGPackage_12_4_solveCSP_bindingAndBlackFBBBBBB(
			PackageToPGPackage _this, IsApplicableMatch isApplicableMatch, ModelToTypeGraph mModelToTypeGraph,
			TPackage tPackage, TypeGraph typeGraph, Model mModel) {
		Object[] result_pattern_PackageToPGPackage_12_4_solveCSP_binding = pattern_PackageToPGPackage_12_4_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, mModelToTypeGraph, tPackage, typeGraph, mModel);
		if (result_pattern_PackageToPGPackage_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_PackageToPGPackage_12_4_solveCSP_binding[0];

			Object[] result_pattern_PackageToPGPackage_12_4_solveCSP_black = pattern_PackageToPGPackage_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_PackageToPGPackage_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mModelToTypeGraph, tPackage, typeGraph, mModel };
			}
		}
		return null;
	}

	public static final boolean pattern_PackageToPGPackage_12_5_checkCSP_expressionFBB(PackageToPGPackage _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_PackageToPGPackage_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_PackageToPGPackage_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "PackageToPGPackage";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_PackageToPGPackage_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_PackageToPGPackage_20_1_preparereturnvalue_bindingFB(
			PackageToPGPackage _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_PackageToPGPackage_20_1_preparereturnvalue_blackFBBF(EClass __eClass,
			PackageToPGPackage _this) {
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

	public static final Object[] pattern_PackageToPGPackage_20_1_preparereturnvalue_bindingAndBlackFFBF(
			PackageToPGPackage _this) {
		Object[] result_pattern_PackageToPGPackage_20_1_preparereturnvalue_binding = pattern_PackageToPGPackage_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_PackageToPGPackage_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_PackageToPGPackage_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_PackageToPGPackage_20_1_preparereturnvalue_black = pattern_PackageToPGPackage_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_PackageToPGPackage_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_PackageToPGPackage_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_PackageToPGPackage_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_PackageToPGPackage_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_PackageToPGPackage_20_2_testcorematchandDECs_black_nac_0B(TPackage tPackage) {
		TPackage __DEC_tPackage_subpackages_991050 = tPackage.getParent();
		if (__DEC_tPackage_subpackages_991050 != null) {
			if (!tPackage.equals(__DEC_tPackage_subpackages_991050)) {
				return new Object[] { tPackage };
			}
		}

		return null;
	}

	public static final Iterable<Object[]> pattern_PackageToPGPackage_20_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_model) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpTPackage = _edge_model.getSrc();
		if (tmpTPackage instanceof TPackage) {
			TPackage tPackage = (TPackage) tmpTPackage;
			EObject tmpTypeGraph = _edge_model.getTrg();
			if (tmpTypeGraph instanceof TypeGraph) {
				TypeGraph typeGraph = (TypeGraph) tmpTypeGraph;
				if (typeGraph.equals(tPackage.getModel())) {
					if (typeGraph.getPackages().contains(tPackage)) {
						if (pattern_PackageToPGPackage_20_2_testcorematchandDECs_black_nac_0B(tPackage) == null) {
							_result.add(new Object[] { tPackage, typeGraph, _edge_model });
						}
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_PackageToPGPackage_20_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_PackageToPGPackage_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			PackageToPGPackage _this, Match match, TPackage tPackage, TypeGraph typeGraph) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, tPackage, typeGraph);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_PackageToPGPackage_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			PackageToPGPackage _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_PackageToPGPackage_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_PackageToPGPackage_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_PackageToPGPackage_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_PackageToPGPackage_21_1_preparereturnvalue_bindingFB(
			PackageToPGPackage _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_PackageToPGPackage_21_1_preparereturnvalue_blackFBBF(EClass __eClass,
			PackageToPGPackage _this) {
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

	public static final Object[] pattern_PackageToPGPackage_21_1_preparereturnvalue_bindingAndBlackFFBF(
			PackageToPGPackage _this) {
		Object[] result_pattern_PackageToPGPackage_21_1_preparereturnvalue_binding = pattern_PackageToPGPackage_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_PackageToPGPackage_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_PackageToPGPackage_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_PackageToPGPackage_21_1_preparereturnvalue_black = pattern_PackageToPGPackage_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_PackageToPGPackage_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_PackageToPGPackage_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_PackageToPGPackage_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_PackageToPGPackage_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_PackageToPGPackage_21_2_testcorematchandDECs_black_nac_0B(
			org.eclipse.modisco.java.Package mPackage) {
		org.eclipse.modisco.java.Package __DEC_mPackage_ownedPackages_900799 = mPackage.getPackage();
		if (__DEC_mPackage_ownedPackages_900799 != null) {
			if (!mPackage.equals(__DEC_mPackage_ownedPackages_900799)) {
				return new Object[] { mPackage };
			}
		}

		return null;
	}

	public static final Iterable<Object[]> pattern_PackageToPGPackage_21_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_model) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpMPackage = _edge_model.getSrc();
		if (tmpMPackage instanceof org.eclipse.modisco.java.Package) {
			org.eclipse.modisco.java.Package mPackage = (org.eclipse.modisco.java.Package) tmpMPackage;
			EObject tmpMModel = _edge_model.getTrg();
			if (tmpMModel instanceof Model) {
				Model mModel = (Model) tmpMModel;
				if (mModel.equals(mPackage.getModel())) {
					if (pattern_PackageToPGPackage_21_2_testcorematchandDECs_black_nac_0B(mPackage) == null) {
						_result.add(new Object[] { mPackage, mModel, _edge_model });
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_PackageToPGPackage_21_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_PackageToPGPackage_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			PackageToPGPackage _this, Match match, org.eclipse.modisco.java.Package mPackage, Model mModel) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, mPackage, mModel);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_PackageToPGPackage_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			PackageToPGPackage _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_PackageToPGPackage_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_PackageToPGPackage_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_PackageToPGPackage_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_PackageToPGPackage_24_1_prepare_blackB(PackageToPGPackage _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_PackageToPGPackage_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_PackageToPGPackage_24_2_matchsrctrgcontext_bindingFFFFBB(Match targetMatch,
			Match sourceMatch) {
		EObject _localVariable_0 = targetMatch.getObject("tPackage");
		EObject _localVariable_1 = sourceMatch.getObject("mPackage");
		EObject _localVariable_2 = targetMatch.getObject("typeGraph");
		EObject _localVariable_3 = sourceMatch.getObject("mModel");
		EObject tmpTPackage = _localVariable_0;
		EObject tmpMPackage = _localVariable_1;
		EObject tmpTypeGraph = _localVariable_2;
		EObject tmpMModel = _localVariable_3;
		if (tmpTPackage instanceof TPackage) {
			TPackage tPackage = (TPackage) tmpTPackage;
			if (tmpMPackage instanceof org.eclipse.modisco.java.Package) {
				org.eclipse.modisco.java.Package mPackage = (org.eclipse.modisco.java.Package) tmpMPackage;
				if (tmpTypeGraph instanceof TypeGraph) {
					TypeGraph typeGraph = (TypeGraph) tmpTypeGraph;
					if (tmpMModel instanceof Model) {
						Model mModel = (Model) tmpMModel;
						return new Object[] { tPackage, mPackage, typeGraph, mModel, targetMatch, sourceMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_PackageToPGPackage_24_2_matchsrctrgcontext_blackBBBBBB(TPackage tPackage,
			org.eclipse.modisco.java.Package mPackage, TypeGraph typeGraph, Model mModel, Match sourceMatch,
			Match targetMatch) {
		if (!sourceMatch.equals(targetMatch)) {
			return new Object[] { tPackage, mPackage, typeGraph, mModel, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_PackageToPGPackage_24_2_matchsrctrgcontext_bindingAndBlackFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_PackageToPGPackage_24_2_matchsrctrgcontext_binding = pattern_PackageToPGPackage_24_2_matchsrctrgcontext_bindingFFFFBB(
				targetMatch, sourceMatch);
		if (result_pattern_PackageToPGPackage_24_2_matchsrctrgcontext_binding != null) {
			TPackage tPackage = (TPackage) result_pattern_PackageToPGPackage_24_2_matchsrctrgcontext_binding[0];
			org.eclipse.modisco.java.Package mPackage = (org.eclipse.modisco.java.Package) result_pattern_PackageToPGPackage_24_2_matchsrctrgcontext_binding[1];
			TypeGraph typeGraph = (TypeGraph) result_pattern_PackageToPGPackage_24_2_matchsrctrgcontext_binding[2];
			Model mModel = (Model) result_pattern_PackageToPGPackage_24_2_matchsrctrgcontext_binding[3];

			Object[] result_pattern_PackageToPGPackage_24_2_matchsrctrgcontext_black = pattern_PackageToPGPackage_24_2_matchsrctrgcontext_blackBBBBBB(
					tPackage, mPackage, typeGraph, mModel, sourceMatch, targetMatch);
			if (result_pattern_PackageToPGPackage_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { tPackage, mPackage, typeGraph, mModel, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_PackageToPGPackage_24_3_solvecsp_bindingFBBBBBBB(PackageToPGPackage _this,
			TPackage tPackage, org.eclipse.modisco.java.Package mPackage, TypeGraph typeGraph, Model mModel,
			Match sourceMatch, Match targetMatch) {
		CSP _localVariable_4 = _this.isApplicable_solveCsp_CC(tPackage, mPackage, typeGraph, mModel, sourceMatch,
				targetMatch);
		CSP csp = _localVariable_4;
		if (csp != null) {
			return new Object[] { csp, _this, tPackage, mPackage, typeGraph, mModel, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_PackageToPGPackage_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_PackageToPGPackage_24_3_solvecsp_bindingAndBlackFBBBBBBB(
			PackageToPGPackage _this, TPackage tPackage, org.eclipse.modisco.java.Package mPackage, TypeGraph typeGraph,
			Model mModel, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_PackageToPGPackage_24_3_solvecsp_binding = pattern_PackageToPGPackage_24_3_solvecsp_bindingFBBBBBBB(
				_this, tPackage, mPackage, typeGraph, mModel, sourceMatch, targetMatch);
		if (result_pattern_PackageToPGPackage_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_PackageToPGPackage_24_3_solvecsp_binding[0];

			Object[] result_pattern_PackageToPGPackage_24_3_solvecsp_black = pattern_PackageToPGPackage_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_PackageToPGPackage_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, tPackage, mPackage, typeGraph, mModel, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_PackageToPGPackage_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_PackageToPGPackage_24_5_matchcorrcontext_blackFBBBB(
			TypeGraph typeGraph, Model mModel, Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (ModelToTypeGraph mModelToTypeGraph : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(mModel, ModelToTypeGraph.class, "source")) {
				if (typeGraph.equals(mModelToTypeGraph.getTarget())) {
					_result.add(new Object[] { mModelToTypeGraph, typeGraph, mModel, sourceMatch, targetMatch });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_PackageToPGPackage_24_5_matchcorrcontext_greenBBBF(
			ModelToTypeGraph mModelToTypeGraph, Match sourceMatch, Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "PackageToPGPackage";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(mModelToTypeGraph);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { mModelToTypeGraph, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_PackageToPGPackage_24_6_createcorrespondence_blackBBBBB(TPackage tPackage,
			org.eclipse.modisco.java.Package mPackage, TypeGraph typeGraph, Model mModel, CCMatch ccMatch) {
		return new Object[] { tPackage, mPackage, typeGraph, mModel, ccMatch };
	}

	public static final Object[] pattern_PackageToPGPackage_24_6_createcorrespondence_greenBBFB(TPackage tPackage,
			org.eclipse.modisco.java.Package mPackage, CCMatch ccMatch) {
		PackageToTPackage mPackageToTPackage = PmFactory.eINSTANCE.createPackageToTPackage();
		mPackageToTPackage.setTarget(tPackage);
		mPackageToTPackage.setSource(mPackage);
		ccMatch.getCreateCorr().add(mPackageToTPackage);
		return new Object[] { tPackage, mPackage, mPackageToTPackage, ccMatch };
	}

	public static final Object[] pattern_PackageToPGPackage_24_7_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_PackageToPGPackage_24_7_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "PackageToPGPackage";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_PackageToPGPackage_24_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_PackageToPGPackage_27_1_matchtggpattern_black_nac_0B(
			org.eclipse.modisco.java.Package mPackage) {
		org.eclipse.modisco.java.Package __DEC_mPackage_ownedPackages_805874 = mPackage.getPackage();
		if (__DEC_mPackage_ownedPackages_805874 != null) {
			if (!mPackage.equals(__DEC_mPackage_ownedPackages_805874)) {
				return new Object[] { mPackage };
			}
		}

		return null;
	}

	public static final Object[] pattern_PackageToPGPackage_27_1_matchtggpattern_blackBB(
			org.eclipse.modisco.java.Package mPackage, Model mModel) {
		if (mModel.equals(mPackage.getModel())) {
			if (pattern_PackageToPGPackage_27_1_matchtggpattern_black_nac_0B(mPackage) == null) {
				return new Object[] { mPackage, mModel };
			}
		}
		return null;
	}

	public static final boolean pattern_PackageToPGPackage_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_PackageToPGPackage_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_PackageToPGPackage_28_1_matchtggpattern_black_nac_0B(TPackage tPackage) {
		TPackage __DEC_tPackage_subpackages_336262 = tPackage.getParent();
		if (__DEC_tPackage_subpackages_336262 != null) {
			if (!tPackage.equals(__DEC_tPackage_subpackages_336262)) {
				return new Object[] { tPackage };
			}
		}

		return null;
	}

	public static final Object[] pattern_PackageToPGPackage_28_1_matchtggpattern_blackBB(TPackage tPackage,
			TypeGraph typeGraph) {
		if (typeGraph.equals(tPackage.getModel())) {
			if (typeGraph.getPackages().contains(tPackage)) {
				if (pattern_PackageToPGPackage_28_1_matchtggpattern_black_nac_0B(tPackage) == null) {
					return new Object[] { tPackage, typeGraph };
				}
			}
		}
		return null;
	}

	public static final boolean pattern_PackageToPGPackage_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_PackageToPGPackage_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_PackageToPGPackage_29_1_createresult_blackB(PackageToPGPackage _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_PackageToPGPackage_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_PackageToPGPackage_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, ModelToTypeGraph mModelToTypeGraph) {
		if (ruleResult.getCorrObjects().contains(mModelToTypeGraph)) {
			return new Object[] { ruleResult, mModelToTypeGraph };
		}
		return null;
	}

	public static final Object[] pattern_PackageToPGPackage_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, Model mModel) {
		if (ruleResult.getSourceObjects().contains(mModel)) {
			return new Object[] { ruleResult, mModel };
		}
		return null;
	}

	public static final Object[] pattern_PackageToPGPackage_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, TypeGraph typeGraph) {
		if (ruleResult.getTargetObjects().contains(typeGraph)) {
			return new Object[] { ruleResult, typeGraph };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_PackageToPGPackage_29_2_isapplicablecore_blackFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList mModelToTypeGraphList : ruleEntryContainer.getRuleEntryList()) {
			for (EObject tmpMModelToTypeGraph : mModelToTypeGraphList.getEntryObjects()) {
				if (tmpMModelToTypeGraph instanceof ModelToTypeGraph) {
					ModelToTypeGraph mModelToTypeGraph = (ModelToTypeGraph) tmpMModelToTypeGraph;
					Model mModel = mModelToTypeGraph.getSource();
					if (mModel != null) {
						TypeGraph typeGraph = mModelToTypeGraph.getTarget();
						if (typeGraph != null) {
							if (pattern_PackageToPGPackage_29_2_isapplicablecore_black_nac_0BB(ruleResult,
									mModelToTypeGraph) == null) {
								if (pattern_PackageToPGPackage_29_2_isapplicablecore_black_nac_1BB(ruleResult,
										mModel) == null) {
									if (pattern_PackageToPGPackage_29_2_isapplicablecore_black_nac_2BB(ruleResult,
											typeGraph) == null) {
										_result.add(new Object[] { mModelToTypeGraphList, mModelToTypeGraph, mModel,
												typeGraph, ruleEntryContainer, ruleResult });
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

	public static final Object[] pattern_PackageToPGPackage_29_3_solveCSP_bindingFBBBBBB(PackageToPGPackage _this,
			IsApplicableMatch isApplicableMatch, ModelToTypeGraph mModelToTypeGraph, TypeGraph typeGraph, Model mModel,
			ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, mModelToTypeGraph, typeGraph, mModel,
				ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mModelToTypeGraph, typeGraph, mModel, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_PackageToPGPackage_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_PackageToPGPackage_29_3_solveCSP_bindingAndBlackFBBBBBB(
			PackageToPGPackage _this, IsApplicableMatch isApplicableMatch, ModelToTypeGraph mModelToTypeGraph,
			TypeGraph typeGraph, Model mModel, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_PackageToPGPackage_29_3_solveCSP_binding = pattern_PackageToPGPackage_29_3_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, mModelToTypeGraph, typeGraph, mModel, ruleResult);
		if (result_pattern_PackageToPGPackage_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_PackageToPGPackage_29_3_solveCSP_binding[0];

			Object[] result_pattern_PackageToPGPackage_29_3_solveCSP_black = pattern_PackageToPGPackage_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_PackageToPGPackage_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mModelToTypeGraph, typeGraph, mModel, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_PackageToPGPackage_29_4_checkCSP_expressionFBB(PackageToPGPackage _this,
			CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_PackageToPGPackage_29_5_checknacs_blackBBB(ModelToTypeGraph mModelToTypeGraph,
			TypeGraph typeGraph, Model mModel) {
		return new Object[] { mModelToTypeGraph, typeGraph, mModel };
	}

	public static final Object[] pattern_PackageToPGPackage_29_6_perform_blackBBBB(ModelToTypeGraph mModelToTypeGraph,
			TypeGraph typeGraph, Model mModel, ModelgeneratorRuleResult ruleResult) {
		return new Object[] { mModelToTypeGraph, typeGraph, mModel, ruleResult };
	}

	public static final Object[] pattern_PackageToPGPackage_29_6_perform_greenFFBBFBB(TypeGraph typeGraph, Model mModel,
			ModelgeneratorRuleResult ruleResult, CSP csp) {
		TPackage tPackage = BasicFactory.eINSTANCE.createTPackage();
		org.eclipse.modisco.java.Package mPackage = JavaFactory.eINSTANCE.createPackage();
		PackageToTPackage mPackageToTPackage = PmFactory.eINSTANCE.createPackageToTPackage();
		Object _localVariable_0 = csp.getValue("tPackage", "tName");
		Object _localVariable_1 = csp.getValue("mPackage", "name");
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_2 = ruleResult.getIncrementedPerformCount();
		tPackage.setModel(typeGraph);
		typeGraph.getPackages().add(tPackage);
		ruleResult.getTargetObjects().add(tPackage);
		mPackage.setModel(mModel);
		ruleResult.getSourceObjects().add(mPackage);
		mPackageToTPackage.setTarget(tPackage);
		mPackageToTPackage.setSource(mPackage);
		ruleResult.getCorrObjects().add(mPackageToTPackage);
		String tPackage_tName_prime = (String) _localVariable_0;
		String mPackage_name_prime = (String) _localVariable_1;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_2);
		tPackage.setTName(tPackage_tName_prime);
		mPackage.setName(mPackage_name_prime);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { tPackage, mPackage, typeGraph, mModel, mPackageToTPackage, ruleResult, csp };
	}

	public static final ModelgeneratorRuleResult pattern_PackageToPGPackage_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //PackageToPGPackageImpl
