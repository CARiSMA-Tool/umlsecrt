/**
 */
package org.gravity.tgg.modisco.pm.Rules.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.LinkedList;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;

import org.eclipse.modisco.java.AbstractTypeDeclaration;
import org.eclipse.modisco.java.AnonymousClassDeclaration;
import org.eclipse.modisco.java.Model;

import org.gravity.modisco.MAbstractMethodDefinition;
import org.gravity.modisco.MClass;
import org.gravity.modisco.ModiscoFactory;

import org.gravity.tgg.modisco.pm.ASTNodeToTAnnotatable;
import org.gravity.tgg.modisco.pm.AnonymousClassDeclarationToTClass;
import org.gravity.tgg.modisco.pm.PmFactory;

import org.gravity.tgg.modisco.pm.Rules.ClassInAnonymous;
import org.gravity.tgg.modisco.pm.Rules.RulesPackage;

import org.gravity.tgg.modisco.pm.TypeToTAbstractType;

import org.gravity.typegraph.basic.BasicFactory;
import org.gravity.typegraph.basic.TAbstractType;
import org.gravity.typegraph.basic.TClass;
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
 * An implementation of the model object '<em><b>Class In Anonymous</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ClassInAnonymousImpl extends AbstractRuleImpl implements ClassInAnonymous {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassInAnonymousImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getClassInAnonymous();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, MClass mNestedType,
			AnonymousClassDeclaration eAnonymousClassDeclaration) {

		Object[] result1_black = ClassInAnonymousImpl.pattern_ClassInAnonymous_0_1_initialbindings_blackBBBB(this,
				match, mNestedType, eAnonymousClassDeclaration);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[mNestedType] = " + mNestedType + ", "
					+ "[eAnonymousClassDeclaration] = " + eAnonymousClassDeclaration + ".");
		}

		Object[] result2_bindingAndBlack = ClassInAnonymousImpl
				.pattern_ClassInAnonymous_0_2_SolveCSP_bindingAndBlackFBBBB(this, match, mNestedType,
						eAnonymousClassDeclaration);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[mNestedType] = " + mNestedType + ", "
					+ "[eAnonymousClassDeclaration] = " + eAnonymousClassDeclaration + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (ClassInAnonymousImpl.pattern_ClassInAnonymous_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = ClassInAnonymousImpl
					.pattern_ClassInAnonymous_0_4_collectelementstobetranslated_blackBBB(match, mNestedType,
							eAnonymousClassDeclaration);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[mNestedType] = " + mNestedType + ", " + "[eAnonymousClassDeclaration] = "
						+ eAnonymousClassDeclaration + ".");
			}
			ClassInAnonymousImpl.pattern_ClassInAnonymous_0_4_collectelementstobetranslated_greenBBBFF(match,
					mNestedType, eAnonymousClassDeclaration);
			//nothing EMoflonEdge mNestedType__eAnonymousClassDeclaration____anonymousClassDeclarationOwner = (EMoflonEdge) result4_green[3];
			//nothing EMoflonEdge eAnonymousClassDeclaration__mNestedType____bodyDeclarations = (EMoflonEdge) result4_green[4];

			Object[] result5_black = ClassInAnonymousImpl.pattern_ClassInAnonymous_0_5_collectcontextelements_blackBBB(
					match, mNestedType, eAnonymousClassDeclaration);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[mNestedType] = " + mNestedType + ", " + "[eAnonymousClassDeclaration] = "
						+ eAnonymousClassDeclaration + ".");
			}
			ClassInAnonymousImpl.pattern_ClassInAnonymous_0_5_collectcontextelements_greenBB(match,
					eAnonymousClassDeclaration);

			// 
			ClassInAnonymousImpl.pattern_ClassInAnonymous_0_6_registerobjectstomatch_expressionBBBB(this, match,
					mNestedType, eAnonymousClassDeclaration);
			return ClassInAnonymousImpl.pattern_ClassInAnonymous_0_7_expressionF();
		} else {
			return ClassInAnonymousImpl.pattern_ClassInAnonymous_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = ClassInAnonymousImpl
				.pattern_ClassInAnonymous_1_1_performtransformation_bindingAndBlackFFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		TClass tClass = (TClass) result1_bindingAndBlack[0];
		MClass mNestedType = (MClass) result1_bindingAndBlack[1];
		TypeGraph pg = (TypeGraph) result1_bindingAndBlack[2];
		AnonymousClassDeclarationToTClass eAnonymousClassDeclarationToTClass = (AnonymousClassDeclarationToTClass) result1_bindingAndBlack[3];
		AnonymousClassDeclaration eAnonymousClassDeclaration = (AnonymousClassDeclaration) result1_bindingAndBlack[4];
		CSP csp = (CSP) result1_bindingAndBlack[5];
		Object[] result1_green = ClassInAnonymousImpl
				.pattern_ClassInAnonymous_1_1_performtransformation_greenBBBFFFB(tClass, mNestedType, pg, csp);
		ASTNodeToTAnnotatable mbodyToTAnnotatable = (ASTNodeToTAnnotatable) result1_green[3];
		TClass tNestedType = (TClass) result1_green[4];
		TypeToTAbstractType mNestedTypeToTNestedType = (TypeToTAbstractType) result1_green[5];

		Object[] result2_black = ClassInAnonymousImpl.pattern_ClassInAnonymous_1_2_collecttranslatedelements_blackBBBB(
				mNestedType, mbodyToTAnnotatable, tNestedType, mNestedTypeToTNestedType);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[mNestedType] = " + mNestedType
					+ ", " + "[mbodyToTAnnotatable] = " + mbodyToTAnnotatable + ", " + "[tNestedType] = " + tNestedType
					+ ", " + "[mNestedTypeToTNestedType] = " + mNestedTypeToTNestedType + ".");
		}
		Object[] result2_green = ClassInAnonymousImpl.pattern_ClassInAnonymous_1_2_collecttranslatedelements_greenFBBBB(
				mNestedType, mbodyToTAnnotatable, tNestedType, mNestedTypeToTNestedType);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = ClassInAnonymousImpl.pattern_ClassInAnonymous_1_3_bookkeepingforedges_blackBBBBBBBBB(
				ruleresult, tClass, mNestedType, pg, mbodyToTAnnotatable, tNestedType,
				eAnonymousClassDeclarationToTClass, mNestedTypeToTNestedType, eAnonymousClassDeclaration);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[tClass] = " + tClass + ", " + "[mNestedType] = " + mNestedType + ", " + "[pg] = " + pg
					+ ", " + "[mbodyToTAnnotatable] = " + mbodyToTAnnotatable + ", " + "[tNestedType] = " + tNestedType
					+ ", " + "[eAnonymousClassDeclarationToTClass] = " + eAnonymousClassDeclarationToTClass + ", "
					+ "[mNestedTypeToTNestedType] = " + mNestedTypeToTNestedType + ", "
					+ "[eAnonymousClassDeclaration] = " + eAnonymousClassDeclaration + ".");
		}
		ClassInAnonymousImpl.pattern_ClassInAnonymous_1_3_bookkeepingforedges_greenBBBBBBBBFFFFFFFFFFF(ruleresult,
				tClass, mNestedType, pg, mbodyToTAnnotatable, tNestedType, mNestedTypeToTNestedType,
				eAnonymousClassDeclaration);
		//nothing EMoflonEdge mbodyToTAnnotatable__mNestedType____source = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge pg__tNestedType____classes = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge mNestedTypeToTNestedType__tNestedType____target = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge mbodyToTAnnotatable__tNestedType____target = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge tClass__tNestedType____innerTypes = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge tNestedType__tClass____outerType = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge pg__tNestedType____ownedTypes = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge tNestedType__pg____model = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge mNestedTypeToTNestedType__mNestedType____source = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge mNestedType__eAnonymousClassDeclaration____anonymousClassDeclarationOwner = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge eAnonymousClassDeclaration__mNestedType____bodyDeclarations = (EMoflonEdge) result3_green[18];

		// 
		// 
		ClassInAnonymousImpl.pattern_ClassInAnonymous_1_5_registerobjects_expressionBBBBBBBBBB(this, ruleresult, tClass,
				mNestedType, pg, mbodyToTAnnotatable, tNestedType, eAnonymousClassDeclarationToTClass,
				mNestedTypeToTNestedType, eAnonymousClassDeclaration);
		return ClassInAnonymousImpl.pattern_ClassInAnonymous_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = ClassInAnonymousImpl
				.pattern_ClassInAnonymous_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ClassInAnonymousImpl
				.pattern_ClassInAnonymous_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = ClassInAnonymousImpl.pattern_ClassInAnonymous_2_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		MClass mNestedType = (MClass) result2_binding[0];
		AnonymousClassDeclaration eAnonymousClassDeclaration = (AnonymousClassDeclaration) result2_binding[1];
		for (Object[] result2_black : ClassInAnonymousImpl
				.pattern_ClassInAnonymous_2_2_corematch_blackFBFBB(mNestedType, eAnonymousClassDeclaration, match)) {
			TClass tClass = (TClass) result2_black[0];
			AnonymousClassDeclarationToTClass eAnonymousClassDeclarationToTClass = (AnonymousClassDeclarationToTClass) result2_black[2];
			// ForEach 
			for (Object[] result3_black : ClassInAnonymousImpl.pattern_ClassInAnonymous_2_3_findcontext_blackBBFBB(
					tClass, mNestedType, eAnonymousClassDeclarationToTClass, eAnonymousClassDeclaration)) {
				TypeGraph pg = (TypeGraph) result3_black[2];
				Object[] result3_green = ClassInAnonymousImpl
						.pattern_ClassInAnonymous_2_3_findcontext_greenBBBBBFFFFFFFF(tClass, mNestedType, pg,
								eAnonymousClassDeclarationToTClass, eAnonymousClassDeclaration);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[5];
				//nothing EMoflonEdge pg__tClass____classes = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge eAnonymousClassDeclarationToTClass__tClass____target = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge pg__tClass____ownedTypes = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge tClass__pg____model = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge eAnonymousClassDeclarationToTClass__eAnonymousClassDeclaration____source = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge mNestedType__eAnonymousClassDeclaration____anonymousClassDeclarationOwner = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge eAnonymousClassDeclaration__mNestedType____bodyDeclarations = (EMoflonEdge) result3_green[12];

				Object[] result4_bindingAndBlack = ClassInAnonymousImpl
						.pattern_ClassInAnonymous_2_4_solveCSP_bindingAndBlackFBBBBBBB(this, isApplicableMatch, tClass,
								mNestedType, pg, eAnonymousClassDeclarationToTClass, eAnonymousClassDeclaration);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[tClass] = " + tClass + ", "
							+ "[mNestedType] = " + mNestedType + ", " + "[pg] = " + pg + ", "
							+ "[eAnonymousClassDeclarationToTClass] = " + eAnonymousClassDeclarationToTClass + ", "
							+ "[eAnonymousClassDeclaration] = " + eAnonymousClassDeclaration + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (ClassInAnonymousImpl.pattern_ClassInAnonymous_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = ClassInAnonymousImpl
							.pattern_ClassInAnonymous_2_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					ClassInAnonymousImpl.pattern_ClassInAnonymous_2_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return ClassInAnonymousImpl.pattern_ClassInAnonymous_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, MClass mNestedType,
			AnonymousClassDeclaration eAnonymousClassDeclaration) {
		match.registerObject("mNestedType", mNestedType);
		match.registerObject("eAnonymousClassDeclaration", eAnonymousClassDeclaration);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, MClass mNestedType,
			AnonymousClassDeclaration eAnonymousClassDeclaration) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, TClass tClass, MClass mNestedType,
			TypeGraph pg, AnonymousClassDeclarationToTClass eAnonymousClassDeclarationToTClass,
			AnonymousClassDeclaration eAnonymousClassDeclaration) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_mNestedType_proxy = CSPFactoryHelper.eINSTANCE.createVariable("mNestedType.proxy", true, csp);
		var_mNestedType_proxy.setValue(mNestedType.isProxy());
		var_mNestedType_proxy.setType("Boolean");
		Variable var_mNestedType_name = CSPFactoryHelper.eINSTANCE.createVariable("mNestedType.name", true, csp);
		var_mNestedType_name.setValue(mNestedType.getName());
		var_mNestedType_name.setType("String");

		// Create unbound variables
		Variable var_tNestedType_tLib = CSPFactoryHelper.eINSTANCE.createVariable("tNestedType.tLib", csp);
		var_tNestedType_tLib.setType("Boolean");
		Variable var_tNestedType_tName = CSPFactoryHelper.eINSTANCE.createVariable("tNestedType.tName", csp);
		var_tNestedType_tName.setType("String");

		// Create constraints
		Eq eq = new Eq();
		Eq eq_0 = new Eq();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(eq_0);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_mNestedType_proxy, var_tNestedType_tLib);
		eq_0.setRuleName("NoRuleName");
		eq_0.solve(var_mNestedType_name, var_tNestedType_tName);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("tClass", tClass);
		isApplicableMatch.registerObject("mNestedType", mNestedType);
		isApplicableMatch.registerObject("pg", pg);
		isApplicableMatch.registerObject("eAnonymousClassDeclarationToTClass", eAnonymousClassDeclarationToTClass);
		isApplicableMatch.registerObject("eAnonymousClassDeclaration", eAnonymousClassDeclaration);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject tClass, EObject mNestedType, EObject pg,
			EObject mbodyToTAnnotatable, EObject tNestedType, EObject eAnonymousClassDeclarationToTClass,
			EObject mNestedTypeToTNestedType, EObject eAnonymousClassDeclaration) {
		ruleresult.registerObject("tClass", tClass);
		ruleresult.registerObject("mNestedType", mNestedType);
		ruleresult.registerObject("pg", pg);
		ruleresult.registerObject("mbodyToTAnnotatable", mbodyToTAnnotatable);
		ruleresult.registerObject("tNestedType", tNestedType);
		ruleresult.registerObject("eAnonymousClassDeclarationToTClass", eAnonymousClassDeclarationToTClass);
		ruleresult.registerObject("mNestedTypeToTNestedType", mNestedTypeToTNestedType);
		ruleresult.registerObject("eAnonymousClassDeclaration", eAnonymousClassDeclaration);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("mNestedType").eClass())
				.equals("modisco.MClass.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, TClass tClass, TypeGraph pg, TClass tNestedType) {

		Object[] result1_black = ClassInAnonymousImpl.pattern_ClassInAnonymous_10_1_initialbindings_blackBBBBB(this,
				match, tClass, pg, tNestedType);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[tClass] = " + tClass + ", " + "[pg] = " + pg + ", "
					+ "[tNestedType] = " + tNestedType + ".");
		}

		Object[] result2_bindingAndBlack = ClassInAnonymousImpl
				.pattern_ClassInAnonymous_10_2_SolveCSP_bindingAndBlackFBBBBB(this, match, tClass, pg, tNestedType);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[tClass] = " + tClass + ", " + "[pg] = " + pg + ", "
					+ "[tNestedType] = " + tNestedType + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (ClassInAnonymousImpl.pattern_ClassInAnonymous_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = ClassInAnonymousImpl
					.pattern_ClassInAnonymous_10_4_collectelementstobetranslated_blackBBBB(match, tClass, pg,
							tNestedType);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching failed." + " Variables: " + "[match] = " + match + ", " + "[tClass] = "
								+ tClass + ", " + "[pg] = " + pg + ", " + "[tNestedType] = " + tNestedType + ".");
			}
			ClassInAnonymousImpl.pattern_ClassInAnonymous_10_4_collectelementstobetranslated_greenBBBBFFFFF(match,
					tClass, pg, tNestedType);
			//nothing EMoflonEdge pg__tNestedType____classes = (EMoflonEdge) result4_green[4];
			//nothing EMoflonEdge tClass__tNestedType____innerTypes = (EMoflonEdge) result4_green[5];
			//nothing EMoflonEdge tNestedType__tClass____outerType = (EMoflonEdge) result4_green[6];
			//nothing EMoflonEdge pg__tNestedType____ownedTypes = (EMoflonEdge) result4_green[7];
			//nothing EMoflonEdge tNestedType__pg____model = (EMoflonEdge) result4_green[8];

			Object[] result5_black = ClassInAnonymousImpl
					.pattern_ClassInAnonymous_10_5_collectcontextelements_blackBBBB(match, tClass, pg, tNestedType);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching failed." + " Variables: " + "[match] = " + match + ", " + "[tClass] = "
								+ tClass + ", " + "[pg] = " + pg + ", " + "[tNestedType] = " + tNestedType + ".");
			}
			ClassInAnonymousImpl.pattern_ClassInAnonymous_10_5_collectcontextelements_greenBBBFFF(match, tClass, pg);
			//nothing EMoflonEdge pg__tClass____classes = (EMoflonEdge) result5_green[3];
			//nothing EMoflonEdge pg__tClass____ownedTypes = (EMoflonEdge) result5_green[4];
			//nothing EMoflonEdge tClass__pg____model = (EMoflonEdge) result5_green[5];

			// 
			ClassInAnonymousImpl.pattern_ClassInAnonymous_10_6_registerobjectstomatch_expressionBBBBB(this, match,
					tClass, pg, tNestedType);
			return ClassInAnonymousImpl.pattern_ClassInAnonymous_10_7_expressionF();
		} else {
			return ClassInAnonymousImpl.pattern_ClassInAnonymous_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = ClassInAnonymousImpl
				.pattern_ClassInAnonymous_11_1_performtransformation_bindingAndBlackFFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		TClass tClass = (TClass) result1_bindingAndBlack[0];
		TypeGraph pg = (TypeGraph) result1_bindingAndBlack[1];
		TClass tNestedType = (TClass) result1_bindingAndBlack[2];
		AnonymousClassDeclarationToTClass eAnonymousClassDeclarationToTClass = (AnonymousClassDeclarationToTClass) result1_bindingAndBlack[3];
		AnonymousClassDeclaration eAnonymousClassDeclaration = (AnonymousClassDeclaration) result1_bindingAndBlack[4];
		CSP csp = (CSP) result1_bindingAndBlack[5];
		Object[] result1_green = ClassInAnonymousImpl.pattern_ClassInAnonymous_11_1_performtransformation_greenFFBFBB(
				tNestedType, eAnonymousClassDeclaration, csp);
		MClass mNestedType = (MClass) result1_green[0];
		ASTNodeToTAnnotatable mbodyToTAnnotatable = (ASTNodeToTAnnotatable) result1_green[1];
		TypeToTAbstractType mNestedTypeToTNestedType = (TypeToTAbstractType) result1_green[3];

		Object[] result2_black = ClassInAnonymousImpl.pattern_ClassInAnonymous_11_2_collecttranslatedelements_blackBBBB(
				mNestedType, mbodyToTAnnotatable, tNestedType, mNestedTypeToTNestedType);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[mNestedType] = " + mNestedType
					+ ", " + "[mbodyToTAnnotatable] = " + mbodyToTAnnotatable + ", " + "[tNestedType] = " + tNestedType
					+ ", " + "[mNestedTypeToTNestedType] = " + mNestedTypeToTNestedType + ".");
		}
		Object[] result2_green = ClassInAnonymousImpl
				.pattern_ClassInAnonymous_11_2_collecttranslatedelements_greenFBBBB(mNestedType, mbodyToTAnnotatable,
						tNestedType, mNestedTypeToTNestedType);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = ClassInAnonymousImpl.pattern_ClassInAnonymous_11_3_bookkeepingforedges_blackBBBBBBBBB(
				ruleresult, tClass, mNestedType, pg, mbodyToTAnnotatable, tNestedType,
				eAnonymousClassDeclarationToTClass, mNestedTypeToTNestedType, eAnonymousClassDeclaration);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[tClass] = " + tClass + ", " + "[mNestedType] = " + mNestedType + ", " + "[pg] = " + pg
					+ ", " + "[mbodyToTAnnotatable] = " + mbodyToTAnnotatable + ", " + "[tNestedType] = " + tNestedType
					+ ", " + "[eAnonymousClassDeclarationToTClass] = " + eAnonymousClassDeclarationToTClass + ", "
					+ "[mNestedTypeToTNestedType] = " + mNestedTypeToTNestedType + ", "
					+ "[eAnonymousClassDeclaration] = " + eAnonymousClassDeclaration + ".");
		}
		ClassInAnonymousImpl.pattern_ClassInAnonymous_11_3_bookkeepingforedges_greenBBBBBBBBFFFFFFFFFFF(ruleresult,
				tClass, mNestedType, pg, mbodyToTAnnotatable, tNestedType, mNestedTypeToTNestedType,
				eAnonymousClassDeclaration);
		//nothing EMoflonEdge mbodyToTAnnotatable__mNestedType____source = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge pg__tNestedType____classes = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge mNestedTypeToTNestedType__tNestedType____target = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge mbodyToTAnnotatable__tNestedType____target = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge tClass__tNestedType____innerTypes = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge tNestedType__tClass____outerType = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge pg__tNestedType____ownedTypes = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge tNestedType__pg____model = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge mNestedTypeToTNestedType__mNestedType____source = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge mNestedType__eAnonymousClassDeclaration____anonymousClassDeclarationOwner = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge eAnonymousClassDeclaration__mNestedType____bodyDeclarations = (EMoflonEdge) result3_green[18];

		// 
		// 
		ClassInAnonymousImpl.pattern_ClassInAnonymous_11_5_registerobjects_expressionBBBBBBBBBB(this, ruleresult,
				tClass, mNestedType, pg, mbodyToTAnnotatable, tNestedType, eAnonymousClassDeclarationToTClass,
				mNestedTypeToTNestedType, eAnonymousClassDeclaration);
		return ClassInAnonymousImpl.pattern_ClassInAnonymous_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = ClassInAnonymousImpl
				.pattern_ClassInAnonymous_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ClassInAnonymousImpl
				.pattern_ClassInAnonymous_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = ClassInAnonymousImpl.pattern_ClassInAnonymous_12_2_corematch_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		TClass tClass = (TClass) result2_binding[0];
		TypeGraph pg = (TypeGraph) result2_binding[1];
		TClass tNestedType = (TClass) result2_binding[2];
		for (Object[] result2_black : ClassInAnonymousImpl.pattern_ClassInAnonymous_12_2_corematch_blackBBBFFB(tClass,
				pg, tNestedType, match)) {
			AnonymousClassDeclarationToTClass eAnonymousClassDeclarationToTClass = (AnonymousClassDeclarationToTClass) result2_black[3];
			AnonymousClassDeclaration eAnonymousClassDeclaration = (AnonymousClassDeclaration) result2_black[4];
			// ForEach 
			for (Object[] result3_black : ClassInAnonymousImpl.pattern_ClassInAnonymous_12_3_findcontext_blackBBBBB(
					tClass, pg, tNestedType, eAnonymousClassDeclarationToTClass, eAnonymousClassDeclaration)) {
				Object[] result3_green = ClassInAnonymousImpl
						.pattern_ClassInAnonymous_12_3_findcontext_greenBBBBBFFFFFFFFFFF(tClass, pg, tNestedType,
								eAnonymousClassDeclarationToTClass, eAnonymousClassDeclaration);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[5];
				//nothing EMoflonEdge pg__tClass____classes = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge eAnonymousClassDeclarationToTClass__tClass____target = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge pg__tNestedType____classes = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge pg__tClass____ownedTypes = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge tClass__pg____model = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge eAnonymousClassDeclarationToTClass__eAnonymousClassDeclaration____source = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge tClass__tNestedType____innerTypes = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge tNestedType__tClass____outerType = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge pg__tNestedType____ownedTypes = (EMoflonEdge) result3_green[14];
				//nothing EMoflonEdge tNestedType__pg____model = (EMoflonEdge) result3_green[15];

				Object[] result4_bindingAndBlack = ClassInAnonymousImpl
						.pattern_ClassInAnonymous_12_4_solveCSP_bindingAndBlackFBBBBBBB(this, isApplicableMatch, tClass,
								pg, tNestedType, eAnonymousClassDeclarationToTClass, eAnonymousClassDeclaration);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[tClass] = " + tClass + ", "
							+ "[pg] = " + pg + ", " + "[tNestedType] = " + tNestedType + ", "
							+ "[eAnonymousClassDeclarationToTClass] = " + eAnonymousClassDeclarationToTClass + ", "
							+ "[eAnonymousClassDeclaration] = " + eAnonymousClassDeclaration + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (ClassInAnonymousImpl.pattern_ClassInAnonymous_12_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = ClassInAnonymousImpl
							.pattern_ClassInAnonymous_12_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					ClassInAnonymousImpl.pattern_ClassInAnonymous_12_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return ClassInAnonymousImpl.pattern_ClassInAnonymous_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, TClass tClass, TypeGraph pg, TClass tNestedType) {
		match.registerObject("tClass", tClass);
		match.registerObject("pg", pg);
		match.registerObject("tNestedType", tNestedType);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, TClass tClass, TypeGraph pg, TClass tNestedType) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, TClass tClass, TypeGraph pg,
			TClass tNestedType, AnonymousClassDeclarationToTClass eAnonymousClassDeclarationToTClass,
			AnonymousClassDeclaration eAnonymousClassDeclaration) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_tNestedType_tLib = CSPFactoryHelper.eINSTANCE.createVariable("tNestedType.tLib", true, csp);
		var_tNestedType_tLib.setValue(tNestedType.isTLib());
		var_tNestedType_tLib.setType("Boolean");
		Variable var_tNestedType_tName = CSPFactoryHelper.eINSTANCE.createVariable("tNestedType.tName", true, csp);
		var_tNestedType_tName.setValue(tNestedType.getTName());
		var_tNestedType_tName.setType("String");

		// Create unbound variables
		Variable var_mNestedType_proxy = CSPFactoryHelper.eINSTANCE.createVariable("mNestedType.proxy", csp);
		var_mNestedType_proxy.setType("Boolean");
		Variable var_mNestedType_name = CSPFactoryHelper.eINSTANCE.createVariable("mNestedType.name", csp);
		var_mNestedType_name.setType("String");

		// Create constraints
		Eq eq = new Eq();
		Eq eq_0 = new Eq();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(eq_0);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_mNestedType_proxy, var_tNestedType_tLib);
		eq_0.setRuleName("NoRuleName");
		eq_0.solve(var_mNestedType_name, var_tNestedType_tName);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("tClass", tClass);
		isApplicableMatch.registerObject("pg", pg);
		isApplicableMatch.registerObject("tNestedType", tNestedType);
		isApplicableMatch.registerObject("eAnonymousClassDeclarationToTClass", eAnonymousClassDeclarationToTClass);
		isApplicableMatch.registerObject("eAnonymousClassDeclaration", eAnonymousClassDeclaration);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject tClass, EObject mNestedType, EObject pg,
			EObject mbodyToTAnnotatable, EObject tNestedType, EObject eAnonymousClassDeclarationToTClass,
			EObject mNestedTypeToTNestedType, EObject eAnonymousClassDeclaration) {
		ruleresult.registerObject("tClass", tClass);
		ruleresult.registerObject("mNestedType", mNestedType);
		ruleresult.registerObject("pg", pg);
		ruleresult.registerObject("mbodyToTAnnotatable", mbodyToTAnnotatable);
		ruleresult.registerObject("tNestedType", tNestedType);
		ruleresult.registerObject("eAnonymousClassDeclarationToTClass", eAnonymousClassDeclarationToTClass);
		ruleresult.registerObject("mNestedTypeToTNestedType", mNestedTypeToTNestedType);
		ruleresult.registerObject("eAnonymousClassDeclaration", eAnonymousClassDeclaration);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("tNestedType").eClass())
				.equals("basic.TClass.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_35(EMoflonEdge _edge_classes) {

		Object[] result1_bindingAndBlack = ClassInAnonymousImpl
				.pattern_ClassInAnonymous_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = ClassInAnonymousImpl.pattern_ClassInAnonymous_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : ClassInAnonymousImpl
				.pattern_ClassInAnonymous_20_2_testcorematchandDECs_blackFFFB(_edge_classes)) {
			TClass tClass = (TClass) result2_black[0];
			TypeGraph pg = (TypeGraph) result2_black[1];
			TClass tNestedType = (TClass) result2_black[2];
			Object[] result2_green = ClassInAnonymousImpl
					.pattern_ClassInAnonymous_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (ClassInAnonymousImpl
					.pattern_ClassInAnonymous_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(this,
							match, tClass, pg, tNestedType)) {
				// 
				if (ClassInAnonymousImpl
						.pattern_ClassInAnonymous_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(this,
								match)) {

					Object[] result5_black = ClassInAnonymousImpl
							.pattern_ClassInAnonymous_20_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					ClassInAnonymousImpl.pattern_ClassInAnonymous_20_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return ClassInAnonymousImpl.pattern_ClassInAnonymous_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_37(EMoflonEdge _edge_anonymousClassDeclarationOwner) {

		Object[] result1_bindingAndBlack = ClassInAnonymousImpl
				.pattern_ClassInAnonymous_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = ClassInAnonymousImpl.pattern_ClassInAnonymous_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : ClassInAnonymousImpl
				.pattern_ClassInAnonymous_21_2_testcorematchandDECs_blackFFB(_edge_anonymousClassDeclarationOwner)) {
			MClass mNestedType = (MClass) result2_black[0];
			AnonymousClassDeclaration eAnonymousClassDeclaration = (AnonymousClassDeclaration) result2_black[1];
			Object[] result2_green = ClassInAnonymousImpl
					.pattern_ClassInAnonymous_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (ClassInAnonymousImpl
					.pattern_ClassInAnonymous_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(this,
							match, mNestedType, eAnonymousClassDeclaration)) {
				// 
				if (ClassInAnonymousImpl
						.pattern_ClassInAnonymous_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(this,
								match)) {

					Object[] result5_black = ClassInAnonymousImpl
							.pattern_ClassInAnonymous_21_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					ClassInAnonymousImpl.pattern_ClassInAnonymous_21_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return ClassInAnonymousImpl.pattern_ClassInAnonymous_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("ClassInAnonymous");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		Variable var_tNestedType_tLib = CSPFactoryHelper.eINSTANCE.createVariable("tNestedType", true, csp);
		var_tNestedType_tLib.setValue(__helper.getValue("tNestedType", "tLib"));
		var_tNestedType_tLib.setType("boolean");

		Variable var_mNestedType_proxy = CSPFactoryHelper.eINSTANCE.createVariable("mNestedType", true, csp);
		var_mNestedType_proxy.setValue(__helper.getValue("mNestedType", "proxy"));
		var_mNestedType_proxy.setType("boolean");

		Variable var_mNestedType_name = CSPFactoryHelper.eINSTANCE.createVariable("mNestedType", true, csp);
		var_mNestedType_name.setValue(__helper.getValue("mNestedType", "name"));
		var_mNestedType_name.setType("String");

		Variable var_tNestedType_tName = CSPFactoryHelper.eINSTANCE.createVariable("tNestedType", true, csp);
		var_tNestedType_tName.setValue(__helper.getValue("tNestedType", "tName"));
		var_tNestedType_tName.setType("String");

		Eq eq0 = new Eq();
		csp.getConstraints().add(eq0);

		Eq eq1 = new Eq();
		csp.getConstraints().add(eq1);

		eq0.setRuleName("ClassInAnonymous");
		eq0.solve(var_mNestedType_proxy, var_tNestedType_tLib);

		eq1.setRuleName("ClassInAnonymous");
		eq1.solve(var_mNestedType_name, var_tNestedType_tName);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_tNestedType_tLib.setBound(false);
			var_tNestedType_tName.setBound(false);
			eq0.solve(var_mNestedType_proxy, var_tNestedType_tLib);
			eq1.solve(var_mNestedType_name, var_tNestedType_tName);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
				__helper.setValue("tNestedType", "tLib", var_tNestedType_tLib.getValue());
				__helper.setValue("tNestedType", "tName", var_tNestedType_tName.getValue());
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
		ruleResult.setRule("ClassInAnonymous");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		Variable var_tNestedType_tLib = CSPFactoryHelper.eINSTANCE.createVariable("tNestedType", true, csp);
		var_tNestedType_tLib.setValue(__helper.getValue("tNestedType", "tLib"));
		var_tNestedType_tLib.setType("boolean");

		Variable var_mNestedType_proxy = CSPFactoryHelper.eINSTANCE.createVariable("mNestedType", true, csp);
		var_mNestedType_proxy.setValue(__helper.getValue("mNestedType", "proxy"));
		var_mNestedType_proxy.setType("boolean");

		Variable var_mNestedType_name = CSPFactoryHelper.eINSTANCE.createVariable("mNestedType", true, csp);
		var_mNestedType_name.setValue(__helper.getValue("mNestedType", "name"));
		var_mNestedType_name.setType("String");

		Variable var_tNestedType_tName = CSPFactoryHelper.eINSTANCE.createVariable("tNestedType", true, csp);
		var_tNestedType_tName.setValue(__helper.getValue("tNestedType", "tName"));
		var_tNestedType_tName.setType("String");

		Eq eq0 = new Eq();
		csp.getConstraints().add(eq0);

		Eq eq1 = new Eq();
		csp.getConstraints().add(eq1);

		eq0.setRuleName("ClassInAnonymous");
		eq0.solve(var_mNestedType_proxy, var_tNestedType_tLib);

		eq1.setRuleName("ClassInAnonymous");
		eq1.solve(var_mNestedType_name, var_tNestedType_tName);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_mNestedType_proxy.setBound(false);
			var_mNestedType_name.setBound(false);
			eq0.solve(var_mNestedType_proxy, var_tNestedType_tLib);
			eq1.solve(var_mNestedType_name, var_tNestedType_tName);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
				__helper.setValue("mNestedType", "proxy", var_mNestedType_proxy.getValue());
				__helper.setValue("mNestedType", "name", var_mNestedType_name.getValue());
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

		Object[] result1_black = ClassInAnonymousImpl.pattern_ClassInAnonymous_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = ClassInAnonymousImpl.pattern_ClassInAnonymous_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = ClassInAnonymousImpl
				.pattern_ClassInAnonymous_24_2_matchsrctrgcontext_bindingAndBlackFFFFFBB(sourceMatch, targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		TClass tClass = (TClass) result2_bindingAndBlack[0];
		MClass mNestedType = (MClass) result2_bindingAndBlack[1];
		TypeGraph pg = (TypeGraph) result2_bindingAndBlack[2];
		TClass tNestedType = (TClass) result2_bindingAndBlack[3];
		AnonymousClassDeclaration eAnonymousClassDeclaration = (AnonymousClassDeclaration) result2_bindingAndBlack[4];

		Object[] result3_bindingAndBlack = ClassInAnonymousImpl
				.pattern_ClassInAnonymous_24_3_solvecsp_bindingAndBlackFBBBBBBBB(this, tClass, mNestedType, pg,
						tNestedType, eAnonymousClassDeclaration, sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[tClass] = " + tClass + ", " + "[mNestedType] = " + mNestedType + ", " + "[pg] = " + pg + ", "
					+ "[tNestedType] = " + tNestedType + ", " + "[eAnonymousClassDeclaration] = "
					+ eAnonymousClassDeclaration + ", " + "[sourceMatch] = " + sourceMatch + ", " + "[targetMatch] = "
					+ targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (ClassInAnonymousImpl.pattern_ClassInAnonymous_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : ClassInAnonymousImpl
					.pattern_ClassInAnonymous_24_5_matchcorrcontext_blackBFBBB(tClass, eAnonymousClassDeclaration,
							sourceMatch, targetMatch)) {
				AnonymousClassDeclarationToTClass eAnonymousClassDeclarationToTClass = (AnonymousClassDeclarationToTClass) result5_black[1];
				Object[] result5_green = ClassInAnonymousImpl.pattern_ClassInAnonymous_24_5_matchcorrcontext_greenBBBF(
						eAnonymousClassDeclarationToTClass, sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[3];

				Object[] result6_black = ClassInAnonymousImpl
						.pattern_ClassInAnonymous_24_6_createcorrespondence_blackBBBBBB(tClass, mNestedType, pg,
								tNestedType, eAnonymousClassDeclaration, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[tClass] = " + tClass
							+ ", " + "[mNestedType] = " + mNestedType + ", " + "[pg] = " + pg + ", "
							+ "[tNestedType] = " + tNestedType + ", " + "[eAnonymousClassDeclaration] = "
							+ eAnonymousClassDeclaration + ", " + "[ccMatch] = " + ccMatch + ".");
				}
				ClassInAnonymousImpl.pattern_ClassInAnonymous_24_6_createcorrespondence_greenBFBFB(mNestedType,
						tNestedType, ccMatch);
				//nothing ASTNodeToTAnnotatable mbodyToTAnnotatable = (ASTNodeToTAnnotatable) result6_green[1];
				//nothing TypeToTAbstractType mNestedTypeToTNestedType = (TypeToTAbstractType) result6_green[3];

				Object[] result7_black = ClassInAnonymousImpl
						.pattern_ClassInAnonymous_24_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				ClassInAnonymousImpl.pattern_ClassInAnonymous_24_7_addtoreturnedresult_greenBB(result, ccMatch);

			}

		} else {
		}
		return ClassInAnonymousImpl.pattern_ClassInAnonymous_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(TClass tClass, MClass mNestedType, TypeGraph pg, TClass tNestedType,
			AnonymousClassDeclaration eAnonymousClassDeclaration, Match sourceMatch, Match targetMatch) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals

		// Create attribute variables
		Variable var_mNestedType_proxy = CSPFactoryHelper.eINSTANCE.createVariable("mNestedType.proxy", true, csp);
		var_mNestedType_proxy.setValue(mNestedType.isProxy());
		var_mNestedType_proxy.setType("Boolean");
		Variable var_tNestedType_tLib = CSPFactoryHelper.eINSTANCE.createVariable("tNestedType.tLib", true, csp);
		var_tNestedType_tLib.setValue(tNestedType.isTLib());
		var_tNestedType_tLib.setType("Boolean");
		Variable var_mNestedType_name = CSPFactoryHelper.eINSTANCE.createVariable("mNestedType.name", true, csp);
		var_mNestedType_name.setValue(mNestedType.getName());
		var_mNestedType_name.setType("String");
		Variable var_tNestedType_tName = CSPFactoryHelper.eINSTANCE.createVariable("tNestedType.tName", true, csp);
		var_tNestedType_tName.setValue(tNestedType.getTName());
		var_tNestedType_tName.setType("String");

		// Create unbound variables

		// Create constraints
		Eq eq = new Eq();
		Eq eq_0 = new Eq();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(eq_0);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_mNestedType_proxy, var_tNestedType_tLib);
		eq_0.setRuleName("NoRuleName");
		eq_0.solve(var_mNestedType_name, var_tNestedType_tName);
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
	public boolean checkDEC_FWD(MClass mNestedType, AnonymousClassDeclaration eAnonymousClassDeclaration) {// 
		Object[] result1_black = ClassInAnonymousImpl.pattern_ClassInAnonymous_27_1_matchtggpattern_blackBB(mNestedType,
				eAnonymousClassDeclaration);
		if (result1_black != null) {
			return ClassInAnonymousImpl.pattern_ClassInAnonymous_27_2_expressionF();
		} else {
			return ClassInAnonymousImpl.pattern_ClassInAnonymous_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(TClass tClass, TypeGraph pg, TClass tNestedType) {// 
		Object[] result1_black = ClassInAnonymousImpl.pattern_ClassInAnonymous_28_1_matchtggpattern_blackBBB(tClass, pg,
				tNestedType);
		if (result1_black != null) {
			return ClassInAnonymousImpl.pattern_ClassInAnonymous_28_2_expressionF();
		} else {
			return ClassInAnonymousImpl.pattern_ClassInAnonymous_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer,
			AnonymousClassDeclarationToTClass eAnonymousClassDeclarationToTClassParameter) {

		Object[] result1_black = ClassInAnonymousImpl.pattern_ClassInAnonymous_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = ClassInAnonymousImpl.pattern_ClassInAnonymous_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : ClassInAnonymousImpl
				.pattern_ClassInAnonymous_29_2_isapplicablecore_blackFFFFFBB(ruleEntryContainer, ruleResult)) {
			//nothing RuleEntryList eAnonymousClassDeclarationToTClassList = (RuleEntryList) result2_black[0];
			TClass tClass = (TClass) result2_black[1];
			TypeGraph pg = (TypeGraph) result2_black[2];
			AnonymousClassDeclarationToTClass eAnonymousClassDeclarationToTClass = (AnonymousClassDeclarationToTClass) result2_black[3];
			AnonymousClassDeclaration eAnonymousClassDeclaration = (AnonymousClassDeclaration) result2_black[4];

			Object[] result3_bindingAndBlack = ClassInAnonymousImpl
					.pattern_ClassInAnonymous_29_3_solveCSP_bindingAndBlackFBBBBBBB(this, isApplicableMatch, tClass, pg,
							eAnonymousClassDeclarationToTClass, eAnonymousClassDeclaration, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[tClass] = " + tClass + ", "
						+ "[pg] = " + pg + ", " + "[eAnonymousClassDeclarationToTClass] = "
						+ eAnonymousClassDeclarationToTClass + ", " + "[eAnonymousClassDeclaration] = "
						+ eAnonymousClassDeclaration + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (ClassInAnonymousImpl.pattern_ClassInAnonymous_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = ClassInAnonymousImpl.pattern_ClassInAnonymous_29_5_checknacs_blackBBBB(tClass,
						pg, eAnonymousClassDeclarationToTClass, eAnonymousClassDeclaration);
				if (result5_black != null) {

					Object[] result6_black = ClassInAnonymousImpl.pattern_ClassInAnonymous_29_6_perform_blackBBBBB(
							tClass, pg, eAnonymousClassDeclarationToTClass, eAnonymousClassDeclaration, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[tClass] = " + tClass
								+ ", " + "[pg] = " + pg + ", " + "[eAnonymousClassDeclarationToTClass] = "
								+ eAnonymousClassDeclarationToTClass + ", " + "[eAnonymousClassDeclaration] = "
								+ eAnonymousClassDeclaration + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					ClassInAnonymousImpl.pattern_ClassInAnonymous_29_6_perform_greenBFBFFFBBB(tClass, pg,
							eAnonymousClassDeclaration, ruleResult, csp);
					//nothing MClass mNestedType = (MClass) result6_green[1];
					//nothing ASTNodeToTAnnotatable mbodyToTAnnotatable = (ASTNodeToTAnnotatable) result6_green[3];
					//nothing TClass tNestedType = (TClass) result6_green[4];
					//nothing TypeToTAbstractType mNestedTypeToTNestedType = (TypeToTAbstractType) result6_green[5];

				} else {
				}

			} else {
			}

		}
		return ClassInAnonymousImpl.pattern_ClassInAnonymous_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, TClass tClass, TypeGraph pg,
			AnonymousClassDeclarationToTClass eAnonymousClassDeclarationToTClass,
			AnonymousClassDeclaration eAnonymousClassDeclaration, ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables
		Variable var_mNestedType_proxy = CSPFactoryHelper.eINSTANCE.createVariable("mNestedType.proxy", csp);
		var_mNestedType_proxy.setType("Boolean");
		Variable var_tNestedType_tLib = CSPFactoryHelper.eINSTANCE.createVariable("tNestedType.tLib", csp);
		var_tNestedType_tLib.setType("Boolean");
		Variable var_mNestedType_name = CSPFactoryHelper.eINSTANCE.createVariable("mNestedType.name", csp);
		var_mNestedType_name.setType("String");
		Variable var_tNestedType_tName = CSPFactoryHelper.eINSTANCE.createVariable("tNestedType.tName", csp);
		var_tNestedType_tName.setType("String");

		// Create constraints
		Eq eq = new Eq();
		Eq eq_0 = new Eq();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(eq_0);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_mNestedType_proxy, var_tNestedType_tLib);
		eq_0.setRuleName("NoRuleName");
		eq_0.solve(var_mNestedType_name, var_tNestedType_tName);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("tClass", tClass);
		isApplicableMatch.registerObject("pg", pg);
		isApplicableMatch.registerObject("eAnonymousClassDeclarationToTClass", eAnonymousClassDeclarationToTClass);
		isApplicableMatch.registerObject("eAnonymousClassDeclaration", eAnonymousClassDeclaration);
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
		case RulesPackage.CLASS_IN_ANONYMOUS___IS_APPROPRIATE_FWD__MATCH_MCLASS_ANONYMOUSCLASSDECLARATION:
			return isAppropriate_FWD((Match) arguments.get(0), (MClass) arguments.get(1),
					(AnonymousClassDeclaration) arguments.get(2));
		case RulesPackage.CLASS_IN_ANONYMOUS___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.CLASS_IN_ANONYMOUS___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.CLASS_IN_ANONYMOUS___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_MCLASS_ANONYMOUSCLASSDECLARATION:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (MClass) arguments.get(1),
					(AnonymousClassDeclaration) arguments.get(2));
			return null;
		case RulesPackage.CLASS_IN_ANONYMOUS___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_MCLASS_ANONYMOUSCLASSDECLARATION:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (MClass) arguments.get(1),
					(AnonymousClassDeclaration) arguments.get(2));
		case RulesPackage.CLASS_IN_ANONYMOUS___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.CLASS_IN_ANONYMOUS___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_TCLASS_MCLASS_TYPEGRAPH_ANONYMOUSCLASSDECLARATIONTOTCLASS_ANONYMOUSCLASSDECLARATION:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (TClass) arguments.get(1),
					(MClass) arguments.get(2), (TypeGraph) arguments.get(3),
					(AnonymousClassDeclarationToTClass) arguments.get(4), (AnonymousClassDeclaration) arguments.get(5));
		case RulesPackage.CLASS_IN_ANONYMOUS___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.CLASS_IN_ANONYMOUS___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8));
			return null;
		case RulesPackage.CLASS_IN_ANONYMOUS___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.CLASS_IN_ANONYMOUS___IS_APPROPRIATE_BWD__MATCH_TCLASS_TYPEGRAPH_TCLASS:
			return isAppropriate_BWD((Match) arguments.get(0), (TClass) arguments.get(1), (TypeGraph) arguments.get(2),
					(TClass) arguments.get(3));
		case RulesPackage.CLASS_IN_ANONYMOUS___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.CLASS_IN_ANONYMOUS___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.CLASS_IN_ANONYMOUS___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TCLASS_TYPEGRAPH_TCLASS:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (TClass) arguments.get(1),
					(TypeGraph) arguments.get(2), (TClass) arguments.get(3));
			return null;
		case RulesPackage.CLASS_IN_ANONYMOUS___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TCLASS_TYPEGRAPH_TCLASS:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (TClass) arguments.get(1),
					(TypeGraph) arguments.get(2), (TClass) arguments.get(3));
		case RulesPackage.CLASS_IN_ANONYMOUS___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.CLASS_IN_ANONYMOUS___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_TCLASS_TYPEGRAPH_TCLASS_ANONYMOUSCLASSDECLARATIONTOTCLASS_ANONYMOUSCLASSDECLARATION:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (TClass) arguments.get(1),
					(TypeGraph) arguments.get(2), (TClass) arguments.get(3),
					(AnonymousClassDeclarationToTClass) arguments.get(4), (AnonymousClassDeclaration) arguments.get(5));
		case RulesPackage.CLASS_IN_ANONYMOUS___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.CLASS_IN_ANONYMOUS___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8));
			return null;
		case RulesPackage.CLASS_IN_ANONYMOUS___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.CLASS_IN_ANONYMOUS___IS_APPROPRIATE_BWD_EMOFLON_EDGE_35__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_35((EMoflonEdge) arguments.get(0));
		case RulesPackage.CLASS_IN_ANONYMOUS___IS_APPROPRIATE_FWD_EMOFLON_EDGE_37__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_37((EMoflonEdge) arguments.get(0));
		case RulesPackage.CLASS_IN_ANONYMOUS___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.CLASS_IN_ANONYMOUS___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.CLASS_IN_ANONYMOUS___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.CLASS_IN_ANONYMOUS___IS_APPLICABLE_SOLVE_CSP_CC__TCLASS_MCLASS_TYPEGRAPH_TCLASS_ANONYMOUSCLASSDECLARATION_MATCH_MATCH:
			return isApplicable_solveCsp_CC((TClass) arguments.get(0), (MClass) arguments.get(1),
					(TypeGraph) arguments.get(2), (TClass) arguments.get(3),
					(AnonymousClassDeclaration) arguments.get(4), (Match) arguments.get(5), (Match) arguments.get(6));
		case RulesPackage.CLASS_IN_ANONYMOUS___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.CLASS_IN_ANONYMOUS___CHECK_DEC_FWD__MCLASS_ANONYMOUSCLASSDECLARATION:
			return checkDEC_FWD((MClass) arguments.get(0), (AnonymousClassDeclaration) arguments.get(1));
		case RulesPackage.CLASS_IN_ANONYMOUS___CHECK_DEC_BWD__TCLASS_TYPEGRAPH_TCLASS:
			return checkDEC_BWD((TClass) arguments.get(0), (TypeGraph) arguments.get(1), (TClass) arguments.get(2));
		case RulesPackage.CLASS_IN_ANONYMOUS___GENERATE_MODEL__RULEENTRYCONTAINER_ANONYMOUSCLASSDECLARATIONTOTCLASS:
			return generateModel((RuleEntryContainer) arguments.get(0),
					(AnonymousClassDeclarationToTClass) arguments.get(1));
		case RulesPackage.CLASS_IN_ANONYMOUS___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_TCLASS_TYPEGRAPH_ANONYMOUSCLASSDECLARATIONTOTCLASS_ANONYMOUSCLASSDECLARATION_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (TClass) arguments.get(1),
					(TypeGraph) arguments.get(2), (AnonymousClassDeclarationToTClass) arguments.get(3),
					(AnonymousClassDeclaration) arguments.get(4), (ModelgeneratorRuleResult) arguments.get(5));
		case RulesPackage.CLASS_IN_ANONYMOUS___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_ClassInAnonymous_0_1_initialbindings_blackBBBB(ClassInAnonymous _this,
			Match match, MClass mNestedType, AnonymousClassDeclaration eAnonymousClassDeclaration) {
		return new Object[] { _this, match, mNestedType, eAnonymousClassDeclaration };
	}

	public static final Object[] pattern_ClassInAnonymous_0_2_SolveCSP_bindingFBBBB(ClassInAnonymous _this, Match match,
			MClass mNestedType, AnonymousClassDeclaration eAnonymousClassDeclaration) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, mNestedType, eAnonymousClassDeclaration);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, mNestedType, eAnonymousClassDeclaration };
		}
		return null;
	}

	public static final Object[] pattern_ClassInAnonymous_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ClassInAnonymous_0_2_SolveCSP_bindingAndBlackFBBBB(ClassInAnonymous _this,
			Match match, MClass mNestedType, AnonymousClassDeclaration eAnonymousClassDeclaration) {
		Object[] result_pattern_ClassInAnonymous_0_2_SolveCSP_binding = pattern_ClassInAnonymous_0_2_SolveCSP_bindingFBBBB(
				_this, match, mNestedType, eAnonymousClassDeclaration);
		if (result_pattern_ClassInAnonymous_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_ClassInAnonymous_0_2_SolveCSP_binding[0];

			Object[] result_pattern_ClassInAnonymous_0_2_SolveCSP_black = pattern_ClassInAnonymous_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_ClassInAnonymous_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, mNestedType, eAnonymousClassDeclaration };
			}
		}
		return null;
	}

	public static final boolean pattern_ClassInAnonymous_0_3_CheckCSP_expressionFBB(ClassInAnonymous _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ClassInAnonymous_0_4_collectelementstobetranslated_blackBBB(Match match,
			MClass mNestedType, AnonymousClassDeclaration eAnonymousClassDeclaration) {
		return new Object[] { match, mNestedType, eAnonymousClassDeclaration };
	}

	public static final Object[] pattern_ClassInAnonymous_0_4_collectelementstobetranslated_greenBBBFF(Match match,
			MClass mNestedType, AnonymousClassDeclaration eAnonymousClassDeclaration) {
		EMoflonEdge mNestedType__eAnonymousClassDeclaration____anonymousClassDeclarationOwner = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge eAnonymousClassDeclaration__mNestedType____bodyDeclarations = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(mNestedType);
		String mNestedType__eAnonymousClassDeclaration____anonymousClassDeclarationOwner_name_prime = "anonymousClassDeclarationOwner";
		String eAnonymousClassDeclaration__mNestedType____bodyDeclarations_name_prime = "bodyDeclarations";
		mNestedType__eAnonymousClassDeclaration____anonymousClassDeclarationOwner.setSrc(mNestedType);
		mNestedType__eAnonymousClassDeclaration____anonymousClassDeclarationOwner.setTrg(eAnonymousClassDeclaration);
		match.getToBeTranslatedEdges().add(mNestedType__eAnonymousClassDeclaration____anonymousClassDeclarationOwner);
		eAnonymousClassDeclaration__mNestedType____bodyDeclarations.setSrc(eAnonymousClassDeclaration);
		eAnonymousClassDeclaration__mNestedType____bodyDeclarations.setTrg(mNestedType);
		match.getToBeTranslatedEdges().add(eAnonymousClassDeclaration__mNestedType____bodyDeclarations);
		mNestedType__eAnonymousClassDeclaration____anonymousClassDeclarationOwner
				.setName(mNestedType__eAnonymousClassDeclaration____anonymousClassDeclarationOwner_name_prime);
		eAnonymousClassDeclaration__mNestedType____bodyDeclarations
				.setName(eAnonymousClassDeclaration__mNestedType____bodyDeclarations_name_prime);
		return new Object[] { match, mNestedType, eAnonymousClassDeclaration,
				mNestedType__eAnonymousClassDeclaration____anonymousClassDeclarationOwner,
				eAnonymousClassDeclaration__mNestedType____bodyDeclarations };
	}

	public static final Object[] pattern_ClassInAnonymous_0_5_collectcontextelements_blackBBB(Match match,
			MClass mNestedType, AnonymousClassDeclaration eAnonymousClassDeclaration) {
		return new Object[] { match, mNestedType, eAnonymousClassDeclaration };
	}

	public static final Object[] pattern_ClassInAnonymous_0_5_collectcontextelements_greenBB(Match match,
			AnonymousClassDeclaration eAnonymousClassDeclaration) {
		match.getContextNodes().add(eAnonymousClassDeclaration);
		return new Object[] { match, eAnonymousClassDeclaration };
	}

	public static final void pattern_ClassInAnonymous_0_6_registerobjectstomatch_expressionBBBB(ClassInAnonymous _this,
			Match match, MClass mNestedType, AnonymousClassDeclaration eAnonymousClassDeclaration) {
		_this.registerObjectsToMatch_FWD(match, mNestedType, eAnonymousClassDeclaration);

	}

	public static final boolean pattern_ClassInAnonymous_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ClassInAnonymous_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_ClassInAnonymous_1_1_performtransformation_bindingFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("tClass");
		EObject _localVariable_1 = isApplicableMatch.getObject("mNestedType");
		EObject _localVariable_2 = isApplicableMatch.getObject("pg");
		EObject _localVariable_3 = isApplicableMatch.getObject("eAnonymousClassDeclarationToTClass");
		EObject _localVariable_4 = isApplicableMatch.getObject("eAnonymousClassDeclaration");
		EObject tmpTClass = _localVariable_0;
		EObject tmpMNestedType = _localVariable_1;
		EObject tmpPg = _localVariable_2;
		EObject tmpEAnonymousClassDeclarationToTClass = _localVariable_3;
		EObject tmpEAnonymousClassDeclaration = _localVariable_4;
		if (tmpTClass instanceof TClass) {
			TClass tClass = (TClass) tmpTClass;
			if (tmpMNestedType instanceof MClass) {
				MClass mNestedType = (MClass) tmpMNestedType;
				if (tmpPg instanceof TypeGraph) {
					TypeGraph pg = (TypeGraph) tmpPg;
					if (tmpEAnonymousClassDeclarationToTClass instanceof AnonymousClassDeclarationToTClass) {
						AnonymousClassDeclarationToTClass eAnonymousClassDeclarationToTClass = (AnonymousClassDeclarationToTClass) tmpEAnonymousClassDeclarationToTClass;
						if (tmpEAnonymousClassDeclaration instanceof AnonymousClassDeclaration) {
							AnonymousClassDeclaration eAnonymousClassDeclaration = (AnonymousClassDeclaration) tmpEAnonymousClassDeclaration;
							return new Object[] { tClass, mNestedType, pg, eAnonymousClassDeclarationToTClass,
									eAnonymousClassDeclaration, isApplicableMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassInAnonymous_1_1_performtransformation_blackBBBBBFBB(TClass tClass,
			MClass mNestedType, TypeGraph pg, AnonymousClassDeclarationToTClass eAnonymousClassDeclarationToTClass,
			AnonymousClassDeclaration eAnonymousClassDeclaration, ClassInAnonymous _this,
			IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { tClass, mNestedType, pg, eAnonymousClassDeclarationToTClass,
						eAnonymousClassDeclaration, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassInAnonymous_1_1_performtransformation_bindingAndBlackFFFFFFBB(
			ClassInAnonymous _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_ClassInAnonymous_1_1_performtransformation_binding = pattern_ClassInAnonymous_1_1_performtransformation_bindingFFFFFB(
				isApplicableMatch);
		if (result_pattern_ClassInAnonymous_1_1_performtransformation_binding != null) {
			TClass tClass = (TClass) result_pattern_ClassInAnonymous_1_1_performtransformation_binding[0];
			MClass mNestedType = (MClass) result_pattern_ClassInAnonymous_1_1_performtransformation_binding[1];
			TypeGraph pg = (TypeGraph) result_pattern_ClassInAnonymous_1_1_performtransformation_binding[2];
			AnonymousClassDeclarationToTClass eAnonymousClassDeclarationToTClass = (AnonymousClassDeclarationToTClass) result_pattern_ClassInAnonymous_1_1_performtransformation_binding[3];
			AnonymousClassDeclaration eAnonymousClassDeclaration = (AnonymousClassDeclaration) result_pattern_ClassInAnonymous_1_1_performtransformation_binding[4];

			Object[] result_pattern_ClassInAnonymous_1_1_performtransformation_black = pattern_ClassInAnonymous_1_1_performtransformation_blackBBBBBFBB(
					tClass, mNestedType, pg, eAnonymousClassDeclarationToTClass, eAnonymousClassDeclaration, _this,
					isApplicableMatch);
			if (result_pattern_ClassInAnonymous_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_ClassInAnonymous_1_1_performtransformation_black[5];

				return new Object[] { tClass, mNestedType, pg, eAnonymousClassDeclarationToTClass,
						eAnonymousClassDeclaration, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassInAnonymous_1_1_performtransformation_greenBBBFFFB(TClass tClass,
			MClass mNestedType, TypeGraph pg, CSP csp) {
		ASTNodeToTAnnotatable mbodyToTAnnotatable = PmFactory.eINSTANCE.createASTNodeToTAnnotatable();
		TClass tNestedType = BasicFactory.eINSTANCE.createTClass();
		TypeToTAbstractType mNestedTypeToTNestedType = PmFactory.eINSTANCE.createTypeToTAbstractType();
		Object _localVariable_0 = csp.getValue("tNestedType", "tLib");
		Object _localVariable_1 = csp.getValue("tNestedType", "tName");
		mbodyToTAnnotatable.setSource(mNestedType);
		pg.getClasses().add(tNestedType);
		mbodyToTAnnotatable.setTarget(tNestedType);
		tClass.getInnerTypes().add(tNestedType);
		pg.getOwnedTypes().add(tNestedType);
		mNestedTypeToTNestedType.setTarget(tNestedType);
		mNestedTypeToTNestedType.setSource(mNestedType);
		boolean tNestedType_tLib_prime = (boolean) _localVariable_0;
		String tNestedType_tName_prime = (String) _localVariable_1;
		tNestedType.setTLib(Boolean.valueOf(tNestedType_tLib_prime));
		tNestedType.setTName(tNestedType_tName_prime);
		return new Object[] { tClass, mNestedType, pg, mbodyToTAnnotatable, tNestedType, mNestedTypeToTNestedType,
				csp };
	}

	public static final Object[] pattern_ClassInAnonymous_1_2_collecttranslatedelements_blackBBBB(MClass mNestedType,
			ASTNodeToTAnnotatable mbodyToTAnnotatable, TClass tNestedType,
			TypeToTAbstractType mNestedTypeToTNestedType) {
		return new Object[] { mNestedType, mbodyToTAnnotatable, tNestedType, mNestedTypeToTNestedType };
	}

	public static final Object[] pattern_ClassInAnonymous_1_2_collecttranslatedelements_greenFBBBB(MClass mNestedType,
			ASTNodeToTAnnotatable mbodyToTAnnotatable, TClass tNestedType,
			TypeToTAbstractType mNestedTypeToTNestedType) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(mNestedType);
		ruleresult.getCreatedLinkElements().add(mbodyToTAnnotatable);
		ruleresult.getCreatedElements().add(tNestedType);
		ruleresult.getCreatedLinkElements().add(mNestedTypeToTNestedType);
		return new Object[] { ruleresult, mNestedType, mbodyToTAnnotatable, tNestedType, mNestedTypeToTNestedType };
	}

	public static final Object[] pattern_ClassInAnonymous_1_3_bookkeepingforedges_blackBBBBBBBBB(
			PerformRuleResult ruleresult, EObject tClass, EObject mNestedType, EObject pg, EObject mbodyToTAnnotatable,
			EObject tNestedType, EObject eAnonymousClassDeclarationToTClass, EObject mNestedTypeToTNestedType,
			EObject eAnonymousClassDeclaration) {
		if (!tClass.equals(tNestedType)) {
			if (!mNestedType.equals(tClass)) {
				if (!mNestedType.equals(pg)) {
					if (!mNestedType.equals(mbodyToTAnnotatable)) {
						if (!mNestedType.equals(tNestedType)) {
							if (!mNestedType.equals(mNestedTypeToTNestedType)) {
								if (!pg.equals(tClass)) {
									if (!pg.equals(tNestedType)) {
										if (!mbodyToTAnnotatable.equals(tClass)) {
											if (!mbodyToTAnnotatable.equals(pg)) {
												if (!mbodyToTAnnotatable.equals(tNestedType)) {
													if (!eAnonymousClassDeclarationToTClass.equals(tClass)) {
														if (!eAnonymousClassDeclarationToTClass.equals(mNestedType)) {
															if (!eAnonymousClassDeclarationToTClass.equals(pg)) {
																if (!eAnonymousClassDeclarationToTClass
																		.equals(mbodyToTAnnotatable)) {
																	if (!eAnonymousClassDeclarationToTClass
																			.equals(tNestedType)) {
																		if (!eAnonymousClassDeclarationToTClass
																				.equals(mNestedTypeToTNestedType)) {
																			if (!mNestedTypeToTNestedType
																					.equals(tClass)) {
																				if (!mNestedTypeToTNestedType
																						.equals(pg)) {
																					if (!mNestedTypeToTNestedType
																							.equals(mbodyToTAnnotatable)) {
																						if (!mNestedTypeToTNestedType
																								.equals(tNestedType)) {
																							if (!eAnonymousClassDeclaration
																									.equals(tClass)) {
																								if (!eAnonymousClassDeclaration
																										.equals(mNestedType)) {
																									if (!eAnonymousClassDeclaration
																											.equals(pg)) {
																										if (!eAnonymousClassDeclaration
																												.equals(mbodyToTAnnotatable)) {
																											if (!eAnonymousClassDeclaration
																													.equals(tNestedType)) {
																												if (!eAnonymousClassDeclaration
																														.equals(eAnonymousClassDeclarationToTClass)) {
																													if (!eAnonymousClassDeclaration
																															.equals(mNestedTypeToTNestedType)) {
																														return new Object[] {
																																ruleresult,
																																tClass,
																																mNestedType,
																																pg,
																																mbodyToTAnnotatable,
																																tNestedType,
																																eAnonymousClassDeclarationToTClass,
																																mNestedTypeToTNestedType,
																																eAnonymousClassDeclaration };
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_ClassInAnonymous_1_3_bookkeepingforedges_greenBBBBBBBBFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject tClass, EObject mNestedType, EObject pg, EObject mbodyToTAnnotatable,
			EObject tNestedType, EObject mNestedTypeToTNestedType, EObject eAnonymousClassDeclaration) {
		EMoflonEdge mbodyToTAnnotatable__mNestedType____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pg__tNestedType____classes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mNestedTypeToTNestedType__tNestedType____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mbodyToTAnnotatable__tNestedType____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tClass__tNestedType____innerTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tNestedType__tClass____outerType = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pg__tNestedType____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tNestedType__pg____model = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mNestedTypeToTNestedType__mNestedType____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mNestedType__eAnonymousClassDeclaration____anonymousClassDeclarationOwner = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge eAnonymousClassDeclaration__mNestedType____bodyDeclarations = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String ruleresult_ruleName_prime = "ClassInAnonymous";
		String mbodyToTAnnotatable__mNestedType____source_name_prime = "source";
		String pg__tNestedType____classes_name_prime = "classes";
		String mNestedTypeToTNestedType__tNestedType____target_name_prime = "target";
		String mbodyToTAnnotatable__tNestedType____target_name_prime = "target";
		String tClass__tNestedType____innerTypes_name_prime = "innerTypes";
		String tNestedType__tClass____outerType_name_prime = "outerType";
		String pg__tNestedType____ownedTypes_name_prime = "ownedTypes";
		String tNestedType__pg____model_name_prime = "model";
		String mNestedTypeToTNestedType__mNestedType____source_name_prime = "source";
		String mNestedType__eAnonymousClassDeclaration____anonymousClassDeclarationOwner_name_prime = "anonymousClassDeclarationOwner";
		String eAnonymousClassDeclaration__mNestedType____bodyDeclarations_name_prime = "bodyDeclarations";
		mbodyToTAnnotatable__mNestedType____source.setSrc(mbodyToTAnnotatable);
		mbodyToTAnnotatable__mNestedType____source.setTrg(mNestedType);
		ruleresult.getCreatedEdges().add(mbodyToTAnnotatable__mNestedType____source);
		pg__tNestedType____classes.setSrc(pg);
		pg__tNestedType____classes.setTrg(tNestedType);
		ruleresult.getCreatedEdges().add(pg__tNestedType____classes);
		mNestedTypeToTNestedType__tNestedType____target.setSrc(mNestedTypeToTNestedType);
		mNestedTypeToTNestedType__tNestedType____target.setTrg(tNestedType);
		ruleresult.getCreatedEdges().add(mNestedTypeToTNestedType__tNestedType____target);
		mbodyToTAnnotatable__tNestedType____target.setSrc(mbodyToTAnnotatable);
		mbodyToTAnnotatable__tNestedType____target.setTrg(tNestedType);
		ruleresult.getCreatedEdges().add(mbodyToTAnnotatable__tNestedType____target);
		tClass__tNestedType____innerTypes.setSrc(tClass);
		tClass__tNestedType____innerTypes.setTrg(tNestedType);
		ruleresult.getCreatedEdges().add(tClass__tNestedType____innerTypes);
		tNestedType__tClass____outerType.setSrc(tNestedType);
		tNestedType__tClass____outerType.setTrg(tClass);
		ruleresult.getCreatedEdges().add(tNestedType__tClass____outerType);
		pg__tNestedType____ownedTypes.setSrc(pg);
		pg__tNestedType____ownedTypes.setTrg(tNestedType);
		ruleresult.getCreatedEdges().add(pg__tNestedType____ownedTypes);
		tNestedType__pg____model.setSrc(tNestedType);
		tNestedType__pg____model.setTrg(pg);
		ruleresult.getCreatedEdges().add(tNestedType__pg____model);
		mNestedTypeToTNestedType__mNestedType____source.setSrc(mNestedTypeToTNestedType);
		mNestedTypeToTNestedType__mNestedType____source.setTrg(mNestedType);
		ruleresult.getCreatedEdges().add(mNestedTypeToTNestedType__mNestedType____source);
		mNestedType__eAnonymousClassDeclaration____anonymousClassDeclarationOwner.setSrc(mNestedType);
		mNestedType__eAnonymousClassDeclaration____anonymousClassDeclarationOwner.setTrg(eAnonymousClassDeclaration);
		ruleresult.getTranslatedEdges().add(mNestedType__eAnonymousClassDeclaration____anonymousClassDeclarationOwner);
		eAnonymousClassDeclaration__mNestedType____bodyDeclarations.setSrc(eAnonymousClassDeclaration);
		eAnonymousClassDeclaration__mNestedType____bodyDeclarations.setTrg(mNestedType);
		ruleresult.getTranslatedEdges().add(eAnonymousClassDeclaration__mNestedType____bodyDeclarations);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		mbodyToTAnnotatable__mNestedType____source.setName(mbodyToTAnnotatable__mNestedType____source_name_prime);
		pg__tNestedType____classes.setName(pg__tNestedType____classes_name_prime);
		mNestedTypeToTNestedType__tNestedType____target
				.setName(mNestedTypeToTNestedType__tNestedType____target_name_prime);
		mbodyToTAnnotatable__tNestedType____target.setName(mbodyToTAnnotatable__tNestedType____target_name_prime);
		tClass__tNestedType____innerTypes.setName(tClass__tNestedType____innerTypes_name_prime);
		tNestedType__tClass____outerType.setName(tNestedType__tClass____outerType_name_prime);
		pg__tNestedType____ownedTypes.setName(pg__tNestedType____ownedTypes_name_prime);
		tNestedType__pg____model.setName(tNestedType__pg____model_name_prime);
		mNestedTypeToTNestedType__mNestedType____source
				.setName(mNestedTypeToTNestedType__mNestedType____source_name_prime);
		mNestedType__eAnonymousClassDeclaration____anonymousClassDeclarationOwner
				.setName(mNestedType__eAnonymousClassDeclaration____anonymousClassDeclarationOwner_name_prime);
		eAnonymousClassDeclaration__mNestedType____bodyDeclarations
				.setName(eAnonymousClassDeclaration__mNestedType____bodyDeclarations_name_prime);
		return new Object[] { ruleresult, tClass, mNestedType, pg, mbodyToTAnnotatable, tNestedType,
				mNestedTypeToTNestedType, eAnonymousClassDeclaration, mbodyToTAnnotatable__mNestedType____source,
				pg__tNestedType____classes, mNestedTypeToTNestedType__tNestedType____target,
				mbodyToTAnnotatable__tNestedType____target, tClass__tNestedType____innerTypes,
				tNestedType__tClass____outerType, pg__tNestedType____ownedTypes, tNestedType__pg____model,
				mNestedTypeToTNestedType__mNestedType____source,
				mNestedType__eAnonymousClassDeclaration____anonymousClassDeclarationOwner,
				eAnonymousClassDeclaration__mNestedType____bodyDeclarations };
	}

	public static final void pattern_ClassInAnonymous_1_5_registerobjects_expressionBBBBBBBBBB(ClassInAnonymous _this,
			PerformRuleResult ruleresult, EObject tClass, EObject mNestedType, EObject pg, EObject mbodyToTAnnotatable,
			EObject tNestedType, EObject eAnonymousClassDeclarationToTClass, EObject mNestedTypeToTNestedType,
			EObject eAnonymousClassDeclaration) {
		_this.registerObjects_FWD(ruleresult, tClass, mNestedType, pg, mbodyToTAnnotatable, tNestedType,
				eAnonymousClassDeclarationToTClass, mNestedTypeToTNestedType, eAnonymousClassDeclaration);

	}

	public static final PerformRuleResult pattern_ClassInAnonymous_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ClassInAnonymous_2_1_preparereturnvalue_bindingFB(ClassInAnonymous _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ClassInAnonymous_2_1_preparereturnvalue_blackFBB(EClass eClass,
			ClassInAnonymous _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ClassInAnonymous_2_1_preparereturnvalue_bindingAndBlackFFB(
			ClassInAnonymous _this) {
		Object[] result_pattern_ClassInAnonymous_2_1_preparereturnvalue_binding = pattern_ClassInAnonymous_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_ClassInAnonymous_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_ClassInAnonymous_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_ClassInAnonymous_2_1_preparereturnvalue_black = pattern_ClassInAnonymous_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_ClassInAnonymous_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_ClassInAnonymous_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassInAnonymous_2_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "ClassInAnonymous";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_ClassInAnonymous_2_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("mNestedType");
		EObject _localVariable_1 = match.getObject("eAnonymousClassDeclaration");
		EObject tmpMNestedType = _localVariable_0;
		EObject tmpEAnonymousClassDeclaration = _localVariable_1;
		if (tmpMNestedType instanceof MClass) {
			MClass mNestedType = (MClass) tmpMNestedType;
			if (tmpEAnonymousClassDeclaration instanceof AnonymousClassDeclaration) {
				AnonymousClassDeclaration eAnonymousClassDeclaration = (AnonymousClassDeclaration) tmpEAnonymousClassDeclaration;
				return new Object[] { mNestedType, eAnonymousClassDeclaration, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ClassInAnonymous_2_2_corematch_blackFBFBB(MClass mNestedType,
			AnonymousClassDeclaration eAnonymousClassDeclaration, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (AnonymousClassDeclarationToTClass eAnonymousClassDeclarationToTClass : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(eAnonymousClassDeclaration, AnonymousClassDeclarationToTClass.class,
						"source")) {
			TClass tClass = eAnonymousClassDeclarationToTClass.getTarget();
			if (tClass != null) {
				_result.add(new Object[] { tClass, mNestedType, eAnonymousClassDeclarationToTClass,
						eAnonymousClassDeclaration, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_ClassInAnonymous_2_3_findcontext_blackBBFBB(TClass tClass,
			MClass mNestedType, AnonymousClassDeclarationToTClass eAnonymousClassDeclarationToTClass,
			AnonymousClassDeclaration eAnonymousClassDeclaration) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (tClass.equals(eAnonymousClassDeclarationToTClass.getTarget())) {
			if (eAnonymousClassDeclaration.equals(eAnonymousClassDeclarationToTClass.getSource())) {
				if (eAnonymousClassDeclaration.equals(mNestedType.getAnonymousClassDeclarationOwner())) {
					TypeGraph pg = tClass.getModel();
					if (pg != null) {
						if (pg.getClasses().contains(tClass)) {
							_result.add(new Object[] { tClass, mNestedType, pg, eAnonymousClassDeclarationToTClass,
									eAnonymousClassDeclaration });
						}
					}

				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_ClassInAnonymous_2_3_findcontext_greenBBBBBFFFFFFFF(TClass tClass,
			MClass mNestedType, TypeGraph pg, AnonymousClassDeclarationToTClass eAnonymousClassDeclarationToTClass,
			AnonymousClassDeclaration eAnonymousClassDeclaration) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge pg__tClass____classes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eAnonymousClassDeclarationToTClass__tClass____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pg__tClass____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tClass__pg____model = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eAnonymousClassDeclarationToTClass__eAnonymousClassDeclaration____source = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge mNestedType__eAnonymousClassDeclaration____anonymousClassDeclarationOwner = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge eAnonymousClassDeclaration__mNestedType____bodyDeclarations = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String pg__tClass____classes_name_prime = "classes";
		String eAnonymousClassDeclarationToTClass__tClass____target_name_prime = "target";
		String pg__tClass____ownedTypes_name_prime = "ownedTypes";
		String tClass__pg____model_name_prime = "model";
		String eAnonymousClassDeclarationToTClass__eAnonymousClassDeclaration____source_name_prime = "source";
		String mNestedType__eAnonymousClassDeclaration____anonymousClassDeclarationOwner_name_prime = "anonymousClassDeclarationOwner";
		String eAnonymousClassDeclaration__mNestedType____bodyDeclarations_name_prime = "bodyDeclarations";
		isApplicableMatch.getAllContextElements().add(tClass);
		isApplicableMatch.getAllContextElements().add(mNestedType);
		isApplicableMatch.getAllContextElements().add(pg);
		isApplicableMatch.getAllContextElements().add(eAnonymousClassDeclarationToTClass);
		isApplicableMatch.getAllContextElements().add(eAnonymousClassDeclaration);
		pg__tClass____classes.setSrc(pg);
		pg__tClass____classes.setTrg(tClass);
		isApplicableMatch.getAllContextElements().add(pg__tClass____classes);
		eAnonymousClassDeclarationToTClass__tClass____target.setSrc(eAnonymousClassDeclarationToTClass);
		eAnonymousClassDeclarationToTClass__tClass____target.setTrg(tClass);
		isApplicableMatch.getAllContextElements().add(eAnonymousClassDeclarationToTClass__tClass____target);
		pg__tClass____ownedTypes.setSrc(pg);
		pg__tClass____ownedTypes.setTrg(tClass);
		isApplicableMatch.getAllContextElements().add(pg__tClass____ownedTypes);
		tClass__pg____model.setSrc(tClass);
		tClass__pg____model.setTrg(pg);
		isApplicableMatch.getAllContextElements().add(tClass__pg____model);
		eAnonymousClassDeclarationToTClass__eAnonymousClassDeclaration____source
				.setSrc(eAnonymousClassDeclarationToTClass);
		eAnonymousClassDeclarationToTClass__eAnonymousClassDeclaration____source.setTrg(eAnonymousClassDeclaration);
		isApplicableMatch.getAllContextElements()
				.add(eAnonymousClassDeclarationToTClass__eAnonymousClassDeclaration____source);
		mNestedType__eAnonymousClassDeclaration____anonymousClassDeclarationOwner.setSrc(mNestedType);
		mNestedType__eAnonymousClassDeclaration____anonymousClassDeclarationOwner.setTrg(eAnonymousClassDeclaration);
		isApplicableMatch.getAllContextElements()
				.add(mNestedType__eAnonymousClassDeclaration____anonymousClassDeclarationOwner);
		eAnonymousClassDeclaration__mNestedType____bodyDeclarations.setSrc(eAnonymousClassDeclaration);
		eAnonymousClassDeclaration__mNestedType____bodyDeclarations.setTrg(mNestedType);
		isApplicableMatch.getAllContextElements().add(eAnonymousClassDeclaration__mNestedType____bodyDeclarations);
		pg__tClass____classes.setName(pg__tClass____classes_name_prime);
		eAnonymousClassDeclarationToTClass__tClass____target
				.setName(eAnonymousClassDeclarationToTClass__tClass____target_name_prime);
		pg__tClass____ownedTypes.setName(pg__tClass____ownedTypes_name_prime);
		tClass__pg____model.setName(tClass__pg____model_name_prime);
		eAnonymousClassDeclarationToTClass__eAnonymousClassDeclaration____source
				.setName(eAnonymousClassDeclarationToTClass__eAnonymousClassDeclaration____source_name_prime);
		mNestedType__eAnonymousClassDeclaration____anonymousClassDeclarationOwner
				.setName(mNestedType__eAnonymousClassDeclaration____anonymousClassDeclarationOwner_name_prime);
		eAnonymousClassDeclaration__mNestedType____bodyDeclarations
				.setName(eAnonymousClassDeclaration__mNestedType____bodyDeclarations_name_prime);
		return new Object[] { tClass, mNestedType, pg, eAnonymousClassDeclarationToTClass, eAnonymousClassDeclaration,
				isApplicableMatch, pg__tClass____classes, eAnonymousClassDeclarationToTClass__tClass____target,
				pg__tClass____ownedTypes, tClass__pg____model,
				eAnonymousClassDeclarationToTClass__eAnonymousClassDeclaration____source,
				mNestedType__eAnonymousClassDeclaration____anonymousClassDeclarationOwner,
				eAnonymousClassDeclaration__mNestedType____bodyDeclarations };
	}

	public static final Object[] pattern_ClassInAnonymous_2_4_solveCSP_bindingFBBBBBBB(ClassInAnonymous _this,
			IsApplicableMatch isApplicableMatch, TClass tClass, MClass mNestedType, TypeGraph pg,
			AnonymousClassDeclarationToTClass eAnonymousClassDeclarationToTClass,
			AnonymousClassDeclaration eAnonymousClassDeclaration) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, tClass, mNestedType, pg,
				eAnonymousClassDeclarationToTClass, eAnonymousClassDeclaration);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, tClass, mNestedType, pg,
					eAnonymousClassDeclarationToTClass, eAnonymousClassDeclaration };
		}
		return null;
	}

	public static final Object[] pattern_ClassInAnonymous_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ClassInAnonymous_2_4_solveCSP_bindingAndBlackFBBBBBBB(ClassInAnonymous _this,
			IsApplicableMatch isApplicableMatch, TClass tClass, MClass mNestedType, TypeGraph pg,
			AnonymousClassDeclarationToTClass eAnonymousClassDeclarationToTClass,
			AnonymousClassDeclaration eAnonymousClassDeclaration) {
		Object[] result_pattern_ClassInAnonymous_2_4_solveCSP_binding = pattern_ClassInAnonymous_2_4_solveCSP_bindingFBBBBBBB(
				_this, isApplicableMatch, tClass, mNestedType, pg, eAnonymousClassDeclarationToTClass,
				eAnonymousClassDeclaration);
		if (result_pattern_ClassInAnonymous_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_ClassInAnonymous_2_4_solveCSP_binding[0];

			Object[] result_pattern_ClassInAnonymous_2_4_solveCSP_black = pattern_ClassInAnonymous_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_ClassInAnonymous_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, tClass, mNestedType, pg,
						eAnonymousClassDeclarationToTClass, eAnonymousClassDeclaration };
			}
		}
		return null;
	}

	public static final boolean pattern_ClassInAnonymous_2_5_checkCSP_expressionFBB(ClassInAnonymous _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ClassInAnonymous_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_ClassInAnonymous_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "ClassInAnonymous";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_ClassInAnonymous_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ClassInAnonymous_10_1_initialbindings_blackBBBBB(ClassInAnonymous _this,
			Match match, TClass tClass, TypeGraph pg, TClass tNestedType) {
		if (!tClass.equals(tNestedType)) {
			return new Object[] { _this, match, tClass, pg, tNestedType };
		}
		return null;
	}

	public static final Object[] pattern_ClassInAnonymous_10_2_SolveCSP_bindingFBBBBB(ClassInAnonymous _this,
			Match match, TClass tClass, TypeGraph pg, TClass tNestedType) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, tClass, pg, tNestedType);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, tClass, pg, tNestedType };
		}
		return null;
	}

	public static final Object[] pattern_ClassInAnonymous_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ClassInAnonymous_10_2_SolveCSP_bindingAndBlackFBBBBB(ClassInAnonymous _this,
			Match match, TClass tClass, TypeGraph pg, TClass tNestedType) {
		Object[] result_pattern_ClassInAnonymous_10_2_SolveCSP_binding = pattern_ClassInAnonymous_10_2_SolveCSP_bindingFBBBBB(
				_this, match, tClass, pg, tNestedType);
		if (result_pattern_ClassInAnonymous_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_ClassInAnonymous_10_2_SolveCSP_binding[0];

			Object[] result_pattern_ClassInAnonymous_10_2_SolveCSP_black = pattern_ClassInAnonymous_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_ClassInAnonymous_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, tClass, pg, tNestedType };
			}
		}
		return null;
	}

	public static final boolean pattern_ClassInAnonymous_10_3_CheckCSP_expressionFBB(ClassInAnonymous _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ClassInAnonymous_10_4_collectelementstobetranslated_blackBBBB(Match match,
			TClass tClass, TypeGraph pg, TClass tNestedType) {
		if (!tClass.equals(tNestedType)) {
			return new Object[] { match, tClass, pg, tNestedType };
		}
		return null;
	}

	public static final Object[] pattern_ClassInAnonymous_10_4_collectelementstobetranslated_greenBBBBFFFFF(Match match,
			TClass tClass, TypeGraph pg, TClass tNestedType) {
		EMoflonEdge pg__tNestedType____classes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tClass__tNestedType____innerTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tNestedType__tClass____outerType = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pg__tNestedType____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tNestedType__pg____model = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(tNestedType);
		String pg__tNestedType____classes_name_prime = "classes";
		String tClass__tNestedType____innerTypes_name_prime = "innerTypes";
		String tNestedType__tClass____outerType_name_prime = "outerType";
		String pg__tNestedType____ownedTypes_name_prime = "ownedTypes";
		String tNestedType__pg____model_name_prime = "model";
		pg__tNestedType____classes.setSrc(pg);
		pg__tNestedType____classes.setTrg(tNestedType);
		match.getToBeTranslatedEdges().add(pg__tNestedType____classes);
		tClass__tNestedType____innerTypes.setSrc(tClass);
		tClass__tNestedType____innerTypes.setTrg(tNestedType);
		match.getToBeTranslatedEdges().add(tClass__tNestedType____innerTypes);
		tNestedType__tClass____outerType.setSrc(tNestedType);
		tNestedType__tClass____outerType.setTrg(tClass);
		match.getToBeTranslatedEdges().add(tNestedType__tClass____outerType);
		pg__tNestedType____ownedTypes.setSrc(pg);
		pg__tNestedType____ownedTypes.setTrg(tNestedType);
		match.getToBeTranslatedEdges().add(pg__tNestedType____ownedTypes);
		tNestedType__pg____model.setSrc(tNestedType);
		tNestedType__pg____model.setTrg(pg);
		match.getToBeTranslatedEdges().add(tNestedType__pg____model);
		pg__tNestedType____classes.setName(pg__tNestedType____classes_name_prime);
		tClass__tNestedType____innerTypes.setName(tClass__tNestedType____innerTypes_name_prime);
		tNestedType__tClass____outerType.setName(tNestedType__tClass____outerType_name_prime);
		pg__tNestedType____ownedTypes.setName(pg__tNestedType____ownedTypes_name_prime);
		tNestedType__pg____model.setName(tNestedType__pg____model_name_prime);
		return new Object[] { match, tClass, pg, tNestedType, pg__tNestedType____classes,
				tClass__tNestedType____innerTypes, tNestedType__tClass____outerType, pg__tNestedType____ownedTypes,
				tNestedType__pg____model };
	}

	public static final Object[] pattern_ClassInAnonymous_10_5_collectcontextelements_blackBBBB(Match match,
			TClass tClass, TypeGraph pg, TClass tNestedType) {
		if (!tClass.equals(tNestedType)) {
			return new Object[] { match, tClass, pg, tNestedType };
		}
		return null;
	}

	public static final Object[] pattern_ClassInAnonymous_10_5_collectcontextelements_greenBBBFFF(Match match,
			TClass tClass, TypeGraph pg) {
		EMoflonEdge pg__tClass____classes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pg__tClass____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tClass__pg____model = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(tClass);
		match.getContextNodes().add(pg);
		String pg__tClass____classes_name_prime = "classes";
		String pg__tClass____ownedTypes_name_prime = "ownedTypes";
		String tClass__pg____model_name_prime = "model";
		pg__tClass____classes.setSrc(pg);
		pg__tClass____classes.setTrg(tClass);
		match.getContextEdges().add(pg__tClass____classes);
		pg__tClass____ownedTypes.setSrc(pg);
		pg__tClass____ownedTypes.setTrg(tClass);
		match.getContextEdges().add(pg__tClass____ownedTypes);
		tClass__pg____model.setSrc(tClass);
		tClass__pg____model.setTrg(pg);
		match.getContextEdges().add(tClass__pg____model);
		pg__tClass____classes.setName(pg__tClass____classes_name_prime);
		pg__tClass____ownedTypes.setName(pg__tClass____ownedTypes_name_prime);
		tClass__pg____model.setName(tClass__pg____model_name_prime);
		return new Object[] { match, tClass, pg, pg__tClass____classes, pg__tClass____ownedTypes, tClass__pg____model };
	}

	public static final void pattern_ClassInAnonymous_10_6_registerobjectstomatch_expressionBBBBB(
			ClassInAnonymous _this, Match match, TClass tClass, TypeGraph pg, TClass tNestedType) {
		_this.registerObjectsToMatch_BWD(match, tClass, pg, tNestedType);

	}

	public static final boolean pattern_ClassInAnonymous_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ClassInAnonymous_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_ClassInAnonymous_11_1_performtransformation_bindingFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("tClass");
		EObject _localVariable_1 = isApplicableMatch.getObject("pg");
		EObject _localVariable_2 = isApplicableMatch.getObject("tNestedType");
		EObject _localVariable_3 = isApplicableMatch.getObject("eAnonymousClassDeclarationToTClass");
		EObject _localVariable_4 = isApplicableMatch.getObject("eAnonymousClassDeclaration");
		EObject tmpTClass = _localVariable_0;
		EObject tmpPg = _localVariable_1;
		EObject tmpTNestedType = _localVariable_2;
		EObject tmpEAnonymousClassDeclarationToTClass = _localVariable_3;
		EObject tmpEAnonymousClassDeclaration = _localVariable_4;
		if (tmpTClass instanceof TClass) {
			TClass tClass = (TClass) tmpTClass;
			if (tmpPg instanceof TypeGraph) {
				TypeGraph pg = (TypeGraph) tmpPg;
				if (tmpTNestedType instanceof TClass) {
					TClass tNestedType = (TClass) tmpTNestedType;
					if (tmpEAnonymousClassDeclarationToTClass instanceof AnonymousClassDeclarationToTClass) {
						AnonymousClassDeclarationToTClass eAnonymousClassDeclarationToTClass = (AnonymousClassDeclarationToTClass) tmpEAnonymousClassDeclarationToTClass;
						if (tmpEAnonymousClassDeclaration instanceof AnonymousClassDeclaration) {
							AnonymousClassDeclaration eAnonymousClassDeclaration = (AnonymousClassDeclaration) tmpEAnonymousClassDeclaration;
							return new Object[] { tClass, pg, tNestedType, eAnonymousClassDeclarationToTClass,
									eAnonymousClassDeclaration, isApplicableMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassInAnonymous_11_1_performtransformation_blackBBBBBFBB(TClass tClass,
			TypeGraph pg, TClass tNestedType, AnonymousClassDeclarationToTClass eAnonymousClassDeclarationToTClass,
			AnonymousClassDeclaration eAnonymousClassDeclaration, ClassInAnonymous _this,
			IsApplicableMatch isApplicableMatch) {
		if (!tClass.equals(tNestedType)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { tClass, pg, tNestedType, eAnonymousClassDeclarationToTClass,
							eAnonymousClassDeclaration, csp, _this, isApplicableMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassInAnonymous_11_1_performtransformation_bindingAndBlackFFFFFFBB(
			ClassInAnonymous _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_ClassInAnonymous_11_1_performtransformation_binding = pattern_ClassInAnonymous_11_1_performtransformation_bindingFFFFFB(
				isApplicableMatch);
		if (result_pattern_ClassInAnonymous_11_1_performtransformation_binding != null) {
			TClass tClass = (TClass) result_pattern_ClassInAnonymous_11_1_performtransformation_binding[0];
			TypeGraph pg = (TypeGraph) result_pattern_ClassInAnonymous_11_1_performtransformation_binding[1];
			TClass tNestedType = (TClass) result_pattern_ClassInAnonymous_11_1_performtransformation_binding[2];
			AnonymousClassDeclarationToTClass eAnonymousClassDeclarationToTClass = (AnonymousClassDeclarationToTClass) result_pattern_ClassInAnonymous_11_1_performtransformation_binding[3];
			AnonymousClassDeclaration eAnonymousClassDeclaration = (AnonymousClassDeclaration) result_pattern_ClassInAnonymous_11_1_performtransformation_binding[4];

			Object[] result_pattern_ClassInAnonymous_11_1_performtransformation_black = pattern_ClassInAnonymous_11_1_performtransformation_blackBBBBBFBB(
					tClass, pg, tNestedType, eAnonymousClassDeclarationToTClass, eAnonymousClassDeclaration, _this,
					isApplicableMatch);
			if (result_pattern_ClassInAnonymous_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_ClassInAnonymous_11_1_performtransformation_black[5];

				return new Object[] { tClass, pg, tNestedType, eAnonymousClassDeclarationToTClass,
						eAnonymousClassDeclaration, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassInAnonymous_11_1_performtransformation_greenFFBFBB(TClass tNestedType,
			AnonymousClassDeclaration eAnonymousClassDeclaration, CSP csp) {
		MClass mNestedType = ModiscoFactory.eINSTANCE.createMClass();
		ASTNodeToTAnnotatable mbodyToTAnnotatable = PmFactory.eINSTANCE.createASTNodeToTAnnotatable();
		TypeToTAbstractType mNestedTypeToTNestedType = PmFactory.eINSTANCE.createTypeToTAbstractType();
		Object _localVariable_0 = csp.getValue("mNestedType", "proxy");
		Object _localVariable_1 = csp.getValue("mNestedType", "name");
		mNestedType.setAnonymousClassDeclarationOwner(eAnonymousClassDeclaration);
		mbodyToTAnnotatable.setSource(mNestedType);
		mbodyToTAnnotatable.setTarget(tNestedType);
		mNestedTypeToTNestedType.setTarget(tNestedType);
		mNestedTypeToTNestedType.setSource(mNestedType);
		boolean mNestedType_proxy_prime = (boolean) _localVariable_0;
		String mNestedType_name_prime = (String) _localVariable_1;
		mNestedType.setProxy(Boolean.valueOf(mNestedType_proxy_prime));
		mNestedType.setName(mNestedType_name_prime);
		return new Object[] { mNestedType, mbodyToTAnnotatable, tNestedType, mNestedTypeToTNestedType,
				eAnonymousClassDeclaration, csp };
	}

	public static final Object[] pattern_ClassInAnonymous_11_2_collecttranslatedelements_blackBBBB(MClass mNestedType,
			ASTNodeToTAnnotatable mbodyToTAnnotatable, TClass tNestedType,
			TypeToTAbstractType mNestedTypeToTNestedType) {
		return new Object[] { mNestedType, mbodyToTAnnotatable, tNestedType, mNestedTypeToTNestedType };
	}

	public static final Object[] pattern_ClassInAnonymous_11_2_collecttranslatedelements_greenFBBBB(MClass mNestedType,
			ASTNodeToTAnnotatable mbodyToTAnnotatable, TClass tNestedType,
			TypeToTAbstractType mNestedTypeToTNestedType) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(mNestedType);
		ruleresult.getCreatedLinkElements().add(mbodyToTAnnotatable);
		ruleresult.getTranslatedElements().add(tNestedType);
		ruleresult.getCreatedLinkElements().add(mNestedTypeToTNestedType);
		return new Object[] { ruleresult, mNestedType, mbodyToTAnnotatable, tNestedType, mNestedTypeToTNestedType };
	}

	public static final Object[] pattern_ClassInAnonymous_11_3_bookkeepingforedges_blackBBBBBBBBB(
			PerformRuleResult ruleresult, EObject tClass, EObject mNestedType, EObject pg, EObject mbodyToTAnnotatable,
			EObject tNestedType, EObject eAnonymousClassDeclarationToTClass, EObject mNestedTypeToTNestedType,
			EObject eAnonymousClassDeclaration) {
		if (!tClass.equals(tNestedType)) {
			if (!mNestedType.equals(tClass)) {
				if (!mNestedType.equals(pg)) {
					if (!mNestedType.equals(mbodyToTAnnotatable)) {
						if (!mNestedType.equals(tNestedType)) {
							if (!mNestedType.equals(mNestedTypeToTNestedType)) {
								if (!pg.equals(tClass)) {
									if (!pg.equals(tNestedType)) {
										if (!mbodyToTAnnotatable.equals(tClass)) {
											if (!mbodyToTAnnotatable.equals(pg)) {
												if (!mbodyToTAnnotatable.equals(tNestedType)) {
													if (!eAnonymousClassDeclarationToTClass.equals(tClass)) {
														if (!eAnonymousClassDeclarationToTClass.equals(mNestedType)) {
															if (!eAnonymousClassDeclarationToTClass.equals(pg)) {
																if (!eAnonymousClassDeclarationToTClass
																		.equals(mbodyToTAnnotatable)) {
																	if (!eAnonymousClassDeclarationToTClass
																			.equals(tNestedType)) {
																		if (!eAnonymousClassDeclarationToTClass
																				.equals(mNestedTypeToTNestedType)) {
																			if (!mNestedTypeToTNestedType
																					.equals(tClass)) {
																				if (!mNestedTypeToTNestedType
																						.equals(pg)) {
																					if (!mNestedTypeToTNestedType
																							.equals(mbodyToTAnnotatable)) {
																						if (!mNestedTypeToTNestedType
																								.equals(tNestedType)) {
																							if (!eAnonymousClassDeclaration
																									.equals(tClass)) {
																								if (!eAnonymousClassDeclaration
																										.equals(mNestedType)) {
																									if (!eAnonymousClassDeclaration
																											.equals(pg)) {
																										if (!eAnonymousClassDeclaration
																												.equals(mbodyToTAnnotatable)) {
																											if (!eAnonymousClassDeclaration
																													.equals(tNestedType)) {
																												if (!eAnonymousClassDeclaration
																														.equals(eAnonymousClassDeclarationToTClass)) {
																													if (!eAnonymousClassDeclaration
																															.equals(mNestedTypeToTNestedType)) {
																														return new Object[] {
																																ruleresult,
																																tClass,
																																mNestedType,
																																pg,
																																mbodyToTAnnotatable,
																																tNestedType,
																																eAnonymousClassDeclarationToTClass,
																																mNestedTypeToTNestedType,
																																eAnonymousClassDeclaration };
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_ClassInAnonymous_11_3_bookkeepingforedges_greenBBBBBBBBFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject tClass, EObject mNestedType, EObject pg, EObject mbodyToTAnnotatable,
			EObject tNestedType, EObject mNestedTypeToTNestedType, EObject eAnonymousClassDeclaration) {
		EMoflonEdge mbodyToTAnnotatable__mNestedType____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pg__tNestedType____classes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mNestedTypeToTNestedType__tNestedType____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mbodyToTAnnotatable__tNestedType____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tClass__tNestedType____innerTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tNestedType__tClass____outerType = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pg__tNestedType____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tNestedType__pg____model = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mNestedTypeToTNestedType__mNestedType____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mNestedType__eAnonymousClassDeclaration____anonymousClassDeclarationOwner = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge eAnonymousClassDeclaration__mNestedType____bodyDeclarations = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String ruleresult_ruleName_prime = "ClassInAnonymous";
		String mbodyToTAnnotatable__mNestedType____source_name_prime = "source";
		String pg__tNestedType____classes_name_prime = "classes";
		String mNestedTypeToTNestedType__tNestedType____target_name_prime = "target";
		String mbodyToTAnnotatable__tNestedType____target_name_prime = "target";
		String tClass__tNestedType____innerTypes_name_prime = "innerTypes";
		String tNestedType__tClass____outerType_name_prime = "outerType";
		String pg__tNestedType____ownedTypes_name_prime = "ownedTypes";
		String tNestedType__pg____model_name_prime = "model";
		String mNestedTypeToTNestedType__mNestedType____source_name_prime = "source";
		String mNestedType__eAnonymousClassDeclaration____anonymousClassDeclarationOwner_name_prime = "anonymousClassDeclarationOwner";
		String eAnonymousClassDeclaration__mNestedType____bodyDeclarations_name_prime = "bodyDeclarations";
		mbodyToTAnnotatable__mNestedType____source.setSrc(mbodyToTAnnotatable);
		mbodyToTAnnotatable__mNestedType____source.setTrg(mNestedType);
		ruleresult.getCreatedEdges().add(mbodyToTAnnotatable__mNestedType____source);
		pg__tNestedType____classes.setSrc(pg);
		pg__tNestedType____classes.setTrg(tNestedType);
		ruleresult.getTranslatedEdges().add(pg__tNestedType____classes);
		mNestedTypeToTNestedType__tNestedType____target.setSrc(mNestedTypeToTNestedType);
		mNestedTypeToTNestedType__tNestedType____target.setTrg(tNestedType);
		ruleresult.getCreatedEdges().add(mNestedTypeToTNestedType__tNestedType____target);
		mbodyToTAnnotatable__tNestedType____target.setSrc(mbodyToTAnnotatable);
		mbodyToTAnnotatable__tNestedType____target.setTrg(tNestedType);
		ruleresult.getCreatedEdges().add(mbodyToTAnnotatable__tNestedType____target);
		tClass__tNestedType____innerTypes.setSrc(tClass);
		tClass__tNestedType____innerTypes.setTrg(tNestedType);
		ruleresult.getTranslatedEdges().add(tClass__tNestedType____innerTypes);
		tNestedType__tClass____outerType.setSrc(tNestedType);
		tNestedType__tClass____outerType.setTrg(tClass);
		ruleresult.getTranslatedEdges().add(tNestedType__tClass____outerType);
		pg__tNestedType____ownedTypes.setSrc(pg);
		pg__tNestedType____ownedTypes.setTrg(tNestedType);
		ruleresult.getTranslatedEdges().add(pg__tNestedType____ownedTypes);
		tNestedType__pg____model.setSrc(tNestedType);
		tNestedType__pg____model.setTrg(pg);
		ruleresult.getTranslatedEdges().add(tNestedType__pg____model);
		mNestedTypeToTNestedType__mNestedType____source.setSrc(mNestedTypeToTNestedType);
		mNestedTypeToTNestedType__mNestedType____source.setTrg(mNestedType);
		ruleresult.getCreatedEdges().add(mNestedTypeToTNestedType__mNestedType____source);
		mNestedType__eAnonymousClassDeclaration____anonymousClassDeclarationOwner.setSrc(mNestedType);
		mNestedType__eAnonymousClassDeclaration____anonymousClassDeclarationOwner.setTrg(eAnonymousClassDeclaration);
		ruleresult.getCreatedEdges().add(mNestedType__eAnonymousClassDeclaration____anonymousClassDeclarationOwner);
		eAnonymousClassDeclaration__mNestedType____bodyDeclarations.setSrc(eAnonymousClassDeclaration);
		eAnonymousClassDeclaration__mNestedType____bodyDeclarations.setTrg(mNestedType);
		ruleresult.getCreatedEdges().add(eAnonymousClassDeclaration__mNestedType____bodyDeclarations);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		mbodyToTAnnotatable__mNestedType____source.setName(mbodyToTAnnotatable__mNestedType____source_name_prime);
		pg__tNestedType____classes.setName(pg__tNestedType____classes_name_prime);
		mNestedTypeToTNestedType__tNestedType____target
				.setName(mNestedTypeToTNestedType__tNestedType____target_name_prime);
		mbodyToTAnnotatable__tNestedType____target.setName(mbodyToTAnnotatable__tNestedType____target_name_prime);
		tClass__tNestedType____innerTypes.setName(tClass__tNestedType____innerTypes_name_prime);
		tNestedType__tClass____outerType.setName(tNestedType__tClass____outerType_name_prime);
		pg__tNestedType____ownedTypes.setName(pg__tNestedType____ownedTypes_name_prime);
		tNestedType__pg____model.setName(tNestedType__pg____model_name_prime);
		mNestedTypeToTNestedType__mNestedType____source
				.setName(mNestedTypeToTNestedType__mNestedType____source_name_prime);
		mNestedType__eAnonymousClassDeclaration____anonymousClassDeclarationOwner
				.setName(mNestedType__eAnonymousClassDeclaration____anonymousClassDeclarationOwner_name_prime);
		eAnonymousClassDeclaration__mNestedType____bodyDeclarations
				.setName(eAnonymousClassDeclaration__mNestedType____bodyDeclarations_name_prime);
		return new Object[] { ruleresult, tClass, mNestedType, pg, mbodyToTAnnotatable, tNestedType,
				mNestedTypeToTNestedType, eAnonymousClassDeclaration, mbodyToTAnnotatable__mNestedType____source,
				pg__tNestedType____classes, mNestedTypeToTNestedType__tNestedType____target,
				mbodyToTAnnotatable__tNestedType____target, tClass__tNestedType____innerTypes,
				tNestedType__tClass____outerType, pg__tNestedType____ownedTypes, tNestedType__pg____model,
				mNestedTypeToTNestedType__mNestedType____source,
				mNestedType__eAnonymousClassDeclaration____anonymousClassDeclarationOwner,
				eAnonymousClassDeclaration__mNestedType____bodyDeclarations };
	}

	public static final void pattern_ClassInAnonymous_11_5_registerobjects_expressionBBBBBBBBBB(ClassInAnonymous _this,
			PerformRuleResult ruleresult, EObject tClass, EObject mNestedType, EObject pg, EObject mbodyToTAnnotatable,
			EObject tNestedType, EObject eAnonymousClassDeclarationToTClass, EObject mNestedTypeToTNestedType,
			EObject eAnonymousClassDeclaration) {
		_this.registerObjects_BWD(ruleresult, tClass, mNestedType, pg, mbodyToTAnnotatable, tNestedType,
				eAnonymousClassDeclarationToTClass, mNestedTypeToTNestedType, eAnonymousClassDeclaration);

	}

	public static final PerformRuleResult pattern_ClassInAnonymous_11_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ClassInAnonymous_12_1_preparereturnvalue_bindingFB(ClassInAnonymous _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ClassInAnonymous_12_1_preparereturnvalue_blackFBB(EClass eClass,
			ClassInAnonymous _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ClassInAnonymous_12_1_preparereturnvalue_bindingAndBlackFFB(
			ClassInAnonymous _this) {
		Object[] result_pattern_ClassInAnonymous_12_1_preparereturnvalue_binding = pattern_ClassInAnonymous_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_ClassInAnonymous_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_ClassInAnonymous_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_ClassInAnonymous_12_1_preparereturnvalue_black = pattern_ClassInAnonymous_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_ClassInAnonymous_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_ClassInAnonymous_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassInAnonymous_12_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "ClassInAnonymous";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_ClassInAnonymous_12_2_corematch_bindingFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("tClass");
		EObject _localVariable_1 = match.getObject("pg");
		EObject _localVariable_2 = match.getObject("tNestedType");
		EObject tmpTClass = _localVariable_0;
		EObject tmpPg = _localVariable_1;
		EObject tmpTNestedType = _localVariable_2;
		if (tmpTClass instanceof TClass) {
			TClass tClass = (TClass) tmpTClass;
			if (tmpPg instanceof TypeGraph) {
				TypeGraph pg = (TypeGraph) tmpPg;
				if (tmpTNestedType instanceof TClass) {
					TClass tNestedType = (TClass) tmpTNestedType;
					return new Object[] { tClass, pg, tNestedType, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ClassInAnonymous_12_2_corematch_blackBBBFFB(TClass tClass,
			TypeGraph pg, TClass tNestedType, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!tClass.equals(tNestedType)) {
			for (AnonymousClassDeclarationToTClass eAnonymousClassDeclarationToTClass : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(tClass, AnonymousClassDeclarationToTClass.class, "target")) {
				AnonymousClassDeclaration eAnonymousClassDeclaration = eAnonymousClassDeclarationToTClass.getSource();
				if (eAnonymousClassDeclaration != null) {
					_result.add(new Object[] { tClass, pg, tNestedType, eAnonymousClassDeclarationToTClass,
							eAnonymousClassDeclaration, match });
				}

			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_ClassInAnonymous_12_3_findcontext_blackBBBBB(TClass tClass,
			TypeGraph pg, TClass tNestedType, AnonymousClassDeclarationToTClass eAnonymousClassDeclarationToTClass,
			AnonymousClassDeclaration eAnonymousClassDeclaration) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!tClass.equals(tNestedType)) {
			if (pg.getClasses().contains(tClass)) {
				if (tClass.equals(eAnonymousClassDeclarationToTClass.getTarget())) {
					if (pg.getClasses().contains(tNestedType)) {
						if (pg.getOwnedTypes().contains(tClass)) {
							if (eAnonymousClassDeclaration.equals(eAnonymousClassDeclarationToTClass.getSource())) {
								if (tClass.getInnerTypes().contains(tNestedType)) {
									if (pg.getOwnedTypes().contains(tNestedType)) {
										_result.add(new Object[] { tClass, pg, tNestedType,
												eAnonymousClassDeclarationToTClass, eAnonymousClassDeclaration });
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

	public static final Object[] pattern_ClassInAnonymous_12_3_findcontext_greenBBBBBFFFFFFFFFFF(TClass tClass,
			TypeGraph pg, TClass tNestedType, AnonymousClassDeclarationToTClass eAnonymousClassDeclarationToTClass,
			AnonymousClassDeclaration eAnonymousClassDeclaration) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge pg__tClass____classes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eAnonymousClassDeclarationToTClass__tClass____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pg__tNestedType____classes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pg__tClass____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tClass__pg____model = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eAnonymousClassDeclarationToTClass__eAnonymousClassDeclaration____source = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tClass__tNestedType____innerTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tNestedType__tClass____outerType = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pg__tNestedType____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tNestedType__pg____model = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String pg__tClass____classes_name_prime = "classes";
		String eAnonymousClassDeclarationToTClass__tClass____target_name_prime = "target";
		String pg__tNestedType____classes_name_prime = "classes";
		String pg__tClass____ownedTypes_name_prime = "ownedTypes";
		String tClass__pg____model_name_prime = "model";
		String eAnonymousClassDeclarationToTClass__eAnonymousClassDeclaration____source_name_prime = "source";
		String tClass__tNestedType____innerTypes_name_prime = "innerTypes";
		String tNestedType__tClass____outerType_name_prime = "outerType";
		String pg__tNestedType____ownedTypes_name_prime = "ownedTypes";
		String tNestedType__pg____model_name_prime = "model";
		isApplicableMatch.getAllContextElements().add(tClass);
		isApplicableMatch.getAllContextElements().add(pg);
		isApplicableMatch.getAllContextElements().add(tNestedType);
		isApplicableMatch.getAllContextElements().add(eAnonymousClassDeclarationToTClass);
		isApplicableMatch.getAllContextElements().add(eAnonymousClassDeclaration);
		pg__tClass____classes.setSrc(pg);
		pg__tClass____classes.setTrg(tClass);
		isApplicableMatch.getAllContextElements().add(pg__tClass____classes);
		eAnonymousClassDeclarationToTClass__tClass____target.setSrc(eAnonymousClassDeclarationToTClass);
		eAnonymousClassDeclarationToTClass__tClass____target.setTrg(tClass);
		isApplicableMatch.getAllContextElements().add(eAnonymousClassDeclarationToTClass__tClass____target);
		pg__tNestedType____classes.setSrc(pg);
		pg__tNestedType____classes.setTrg(tNestedType);
		isApplicableMatch.getAllContextElements().add(pg__tNestedType____classes);
		pg__tClass____ownedTypes.setSrc(pg);
		pg__tClass____ownedTypes.setTrg(tClass);
		isApplicableMatch.getAllContextElements().add(pg__tClass____ownedTypes);
		tClass__pg____model.setSrc(tClass);
		tClass__pg____model.setTrg(pg);
		isApplicableMatch.getAllContextElements().add(tClass__pg____model);
		eAnonymousClassDeclarationToTClass__eAnonymousClassDeclaration____source
				.setSrc(eAnonymousClassDeclarationToTClass);
		eAnonymousClassDeclarationToTClass__eAnonymousClassDeclaration____source.setTrg(eAnonymousClassDeclaration);
		isApplicableMatch.getAllContextElements()
				.add(eAnonymousClassDeclarationToTClass__eAnonymousClassDeclaration____source);
		tClass__tNestedType____innerTypes.setSrc(tClass);
		tClass__tNestedType____innerTypes.setTrg(tNestedType);
		isApplicableMatch.getAllContextElements().add(tClass__tNestedType____innerTypes);
		tNestedType__tClass____outerType.setSrc(tNestedType);
		tNestedType__tClass____outerType.setTrg(tClass);
		isApplicableMatch.getAllContextElements().add(tNestedType__tClass____outerType);
		pg__tNestedType____ownedTypes.setSrc(pg);
		pg__tNestedType____ownedTypes.setTrg(tNestedType);
		isApplicableMatch.getAllContextElements().add(pg__tNestedType____ownedTypes);
		tNestedType__pg____model.setSrc(tNestedType);
		tNestedType__pg____model.setTrg(pg);
		isApplicableMatch.getAllContextElements().add(tNestedType__pg____model);
		pg__tClass____classes.setName(pg__tClass____classes_name_prime);
		eAnonymousClassDeclarationToTClass__tClass____target
				.setName(eAnonymousClassDeclarationToTClass__tClass____target_name_prime);
		pg__tNestedType____classes.setName(pg__tNestedType____classes_name_prime);
		pg__tClass____ownedTypes.setName(pg__tClass____ownedTypes_name_prime);
		tClass__pg____model.setName(tClass__pg____model_name_prime);
		eAnonymousClassDeclarationToTClass__eAnonymousClassDeclaration____source
				.setName(eAnonymousClassDeclarationToTClass__eAnonymousClassDeclaration____source_name_prime);
		tClass__tNestedType____innerTypes.setName(tClass__tNestedType____innerTypes_name_prime);
		tNestedType__tClass____outerType.setName(tNestedType__tClass____outerType_name_prime);
		pg__tNestedType____ownedTypes.setName(pg__tNestedType____ownedTypes_name_prime);
		tNestedType__pg____model.setName(tNestedType__pg____model_name_prime);
		return new Object[] { tClass, pg, tNestedType, eAnonymousClassDeclarationToTClass, eAnonymousClassDeclaration,
				isApplicableMatch, pg__tClass____classes, eAnonymousClassDeclarationToTClass__tClass____target,
				pg__tNestedType____classes, pg__tClass____ownedTypes, tClass__pg____model,
				eAnonymousClassDeclarationToTClass__eAnonymousClassDeclaration____source,
				tClass__tNestedType____innerTypes, tNestedType__tClass____outerType, pg__tNestedType____ownedTypes,
				tNestedType__pg____model };
	}

	public static final Object[] pattern_ClassInAnonymous_12_4_solveCSP_bindingFBBBBBBB(ClassInAnonymous _this,
			IsApplicableMatch isApplicableMatch, TClass tClass, TypeGraph pg, TClass tNestedType,
			AnonymousClassDeclarationToTClass eAnonymousClassDeclarationToTClass,
			AnonymousClassDeclaration eAnonymousClassDeclaration) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, tClass, pg, tNestedType,
				eAnonymousClassDeclarationToTClass, eAnonymousClassDeclaration);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, tClass, pg, tNestedType,
					eAnonymousClassDeclarationToTClass, eAnonymousClassDeclaration };
		}
		return null;
	}

	public static final Object[] pattern_ClassInAnonymous_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ClassInAnonymous_12_4_solveCSP_bindingAndBlackFBBBBBBB(ClassInAnonymous _this,
			IsApplicableMatch isApplicableMatch, TClass tClass, TypeGraph pg, TClass tNestedType,
			AnonymousClassDeclarationToTClass eAnonymousClassDeclarationToTClass,
			AnonymousClassDeclaration eAnonymousClassDeclaration) {
		Object[] result_pattern_ClassInAnonymous_12_4_solveCSP_binding = pattern_ClassInAnonymous_12_4_solveCSP_bindingFBBBBBBB(
				_this, isApplicableMatch, tClass, pg, tNestedType, eAnonymousClassDeclarationToTClass,
				eAnonymousClassDeclaration);
		if (result_pattern_ClassInAnonymous_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_ClassInAnonymous_12_4_solveCSP_binding[0];

			Object[] result_pattern_ClassInAnonymous_12_4_solveCSP_black = pattern_ClassInAnonymous_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_ClassInAnonymous_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, tClass, pg, tNestedType,
						eAnonymousClassDeclarationToTClass, eAnonymousClassDeclaration };
			}
		}
		return null;
	}

	public static final boolean pattern_ClassInAnonymous_12_5_checkCSP_expressionFBB(ClassInAnonymous _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ClassInAnonymous_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_ClassInAnonymous_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "ClassInAnonymous";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_ClassInAnonymous_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ClassInAnonymous_20_1_preparereturnvalue_bindingFB(ClassInAnonymous _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ClassInAnonymous_20_1_preparereturnvalue_blackFBBF(EClass __eClass,
			ClassInAnonymous _this) {
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

	public static final Object[] pattern_ClassInAnonymous_20_1_preparereturnvalue_bindingAndBlackFFBF(
			ClassInAnonymous _this) {
		Object[] result_pattern_ClassInAnonymous_20_1_preparereturnvalue_binding = pattern_ClassInAnonymous_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_ClassInAnonymous_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_ClassInAnonymous_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_ClassInAnonymous_20_1_preparereturnvalue_black = pattern_ClassInAnonymous_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_ClassInAnonymous_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ClassInAnonymous_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_ClassInAnonymous_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassInAnonymous_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_ClassInAnonymous_20_2_testcorematchandDECs_black_nac_0B(TClass tNestedType) {
		for (TPackage __DEC_tNestedType_classes_802776 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tNestedType, TPackage.class, "classes")) {
			return new Object[] { tNestedType };
		}
		return null;
	}

	public static final Object[] pattern_ClassInAnonymous_20_2_testcorematchandDECs_black_nac_1BB(TClass tNestedType,
			TypeGraph pg) {
		for (TypeGraph __DEC_tNestedType_classes_8617 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tNestedType, TypeGraph.class, "classes")) {
			if (!pg.equals(__DEC_tNestedType_classes_8617)) {
				return new Object[] { tNestedType, pg };
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassInAnonymous_20_2_testcorematchandDECs_black_nac_2B(TClass tNestedType) {
		TPackage __DEC_tNestedType_ownedTypes_638121 = tNestedType.getPackage();
		if (__DEC_tNestedType_ownedTypes_638121 != null) {
			return new Object[] { tNestedType };
		}

		return null;
	}

	public static final Object[] pattern_ClassInAnonymous_20_2_testcorematchandDECs_black_nac_3BB(TClass tNestedType,
			TClass tClass) {
		if (!tClass.equals(tNestedType)) {
			TAbstractType __DEC_tNestedType_innerTypes_741066 = tNestedType.getOuterType();
			if (__DEC_tNestedType_innerTypes_741066 != null) {
				if (!tNestedType.equals(__DEC_tNestedType_innerTypes_741066)) {
					if (!tClass.equals(__DEC_tNestedType_innerTypes_741066)) {
						return new Object[] { tNestedType, tClass };
					}
				}
			}

		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ClassInAnonymous_20_2_testcorematchandDECs_blackFFFB(
			EMoflonEdge _edge_classes) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpPg = _edge_classes.getSrc();
		if (tmpPg instanceof TypeGraph) {
			TypeGraph pg = (TypeGraph) tmpPg;
			EObject tmpTNestedType = _edge_classes.getTrg();
			if (tmpTNestedType instanceof TClass) {
				TClass tNestedType = (TClass) tmpTNestedType;
				if (pg.getClasses().contains(tNestedType)) {
					if (pg.getOwnedTypes().contains(tNestedType)) {
						TAbstractType tmpTClass = tNestedType.getOuterType();
						if (tmpTClass instanceof TClass) {
							TClass tClass = (TClass) tmpTClass;
							if (!tClass.equals(tNestedType)) {
								if (pg.getClasses().contains(tClass)) {
									if (pg.getOwnedTypes().contains(tClass)) {
										if (pattern_ClassInAnonymous_20_2_testcorematchandDECs_black_nac_0B(
												tNestedType) == null) {
											if (pattern_ClassInAnonymous_20_2_testcorematchandDECs_black_nac_1BB(
													tNestedType, pg) == null) {
												if (pattern_ClassInAnonymous_20_2_testcorematchandDECs_black_nac_2B(
														tNestedType) == null) {
													if (pattern_ClassInAnonymous_20_2_testcorematchandDECs_black_nac_3BB(
															tNestedType, tClass) == null) {
														_result.add(new Object[] { tClass, pg, tNestedType,
																_edge_classes });
													}
												}
											}
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

	public static final Object[] pattern_ClassInAnonymous_20_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ClassInAnonymous_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
			ClassInAnonymous _this, Match match, TClass tClass, TypeGraph pg, TClass tNestedType) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, tClass, pg, tNestedType);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ClassInAnonymous_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			ClassInAnonymous _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ClassInAnonymous_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_ClassInAnonymous_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_ClassInAnonymous_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ClassInAnonymous_21_1_preparereturnvalue_bindingFB(ClassInAnonymous _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ClassInAnonymous_21_1_preparereturnvalue_blackFBBF(EClass __eClass,
			ClassInAnonymous _this) {
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

	public static final Object[] pattern_ClassInAnonymous_21_1_preparereturnvalue_bindingAndBlackFFBF(
			ClassInAnonymous _this) {
		Object[] result_pattern_ClassInAnonymous_21_1_preparereturnvalue_binding = pattern_ClassInAnonymous_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_ClassInAnonymous_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_ClassInAnonymous_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_ClassInAnonymous_21_1_preparereturnvalue_black = pattern_ClassInAnonymous_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_ClassInAnonymous_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ClassInAnonymous_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_ClassInAnonymous_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassInAnonymous_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_ClassInAnonymous_21_2_testcorematchandDECs_black_nac_0B(MClass mNestedType) {
		AbstractTypeDeclaration __DEC_mNestedType_abstractTypeDeclaration_578369 = mNestedType
				.getAbstractTypeDeclaration();
		if (__DEC_mNestedType_abstractTypeDeclaration_578369 != null) {
			if (!mNestedType.equals(__DEC_mNestedType_abstractTypeDeclaration_578369)) {
				return new Object[] { mNestedType };
			}
		}

		return null;
	}

	public static final Object[] pattern_ClassInAnonymous_21_2_testcorematchandDECs_black_nac_1B(MClass mNestedType) {
		for (Model __DEC_mNestedType_orphanTypes_49390 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mNestedType, Model.class, "orphanTypes")) {
			return new Object[] { mNestedType };
		}
		return null;
	}

	public static final Object[] pattern_ClassInAnonymous_21_2_testcorematchandDECs_black_nac_2B(MClass mNestedType) {
		org.eclipse.modisco.java.Package __DEC_mNestedType_ownedElements_70281 = mNestedType.getPackage();
		if (__DEC_mNestedType_ownedElements_70281 != null) {
			return new Object[] { mNestedType };
		}

		return null;
	}

	public static final Object[] pattern_ClassInAnonymous_21_2_testcorematchandDECs_black_nac_3B(MClass mNestedType) {
		for (MAbstractMethodDefinition __DEC_mNestedType_mInnerTypes_805979 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mNestedType, MAbstractMethodDefinition.class, "mInnerTypes")) {
			return new Object[] { mNestedType };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ClassInAnonymous_21_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_anonymousClassDeclarationOwner) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpMNestedType = _edge_anonymousClassDeclarationOwner.getSrc();
		if (tmpMNestedType instanceof MClass) {
			MClass mNestedType = (MClass) tmpMNestedType;
			EObject tmpEAnonymousClassDeclaration = _edge_anonymousClassDeclarationOwner.getTrg();
			if (tmpEAnonymousClassDeclaration instanceof AnonymousClassDeclaration) {
				AnonymousClassDeclaration eAnonymousClassDeclaration = (AnonymousClassDeclaration) tmpEAnonymousClassDeclaration;
				if (eAnonymousClassDeclaration.equals(mNestedType.getAnonymousClassDeclarationOwner())) {
					if (pattern_ClassInAnonymous_21_2_testcorematchandDECs_black_nac_0B(mNestedType) == null) {
						if (pattern_ClassInAnonymous_21_2_testcorematchandDECs_black_nac_1B(mNestedType) == null) {
							if (pattern_ClassInAnonymous_21_2_testcorematchandDECs_black_nac_2B(mNestedType) == null) {
								if (pattern_ClassInAnonymous_21_2_testcorematchandDECs_black_nac_3B(
										mNestedType) == null) {
									_result.add(new Object[] { mNestedType, eAnonymousClassDeclaration,
											_edge_anonymousClassDeclarationOwner });
								}
							}
						}
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_ClassInAnonymous_21_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ClassInAnonymous_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			ClassInAnonymous _this, Match match, MClass mNestedType,
			AnonymousClassDeclaration eAnonymousClassDeclaration) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, mNestedType, eAnonymousClassDeclaration);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ClassInAnonymous_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			ClassInAnonymous _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ClassInAnonymous_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_ClassInAnonymous_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_ClassInAnonymous_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ClassInAnonymous_24_1_prepare_blackB(ClassInAnonymous _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_ClassInAnonymous_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_ClassInAnonymous_24_2_matchsrctrgcontext_bindingFFFFFBB(Match targetMatch,
			Match sourceMatch) {
		EObject _localVariable_0 = targetMatch.getObject("tClass");
		EObject _localVariable_1 = sourceMatch.getObject("mNestedType");
		EObject _localVariable_2 = targetMatch.getObject("pg");
		EObject _localVariable_3 = targetMatch.getObject("tNestedType");
		EObject _localVariable_4 = sourceMatch.getObject("eAnonymousClassDeclaration");
		EObject tmpTClass = _localVariable_0;
		EObject tmpMNestedType = _localVariable_1;
		EObject tmpPg = _localVariable_2;
		EObject tmpTNestedType = _localVariable_3;
		EObject tmpEAnonymousClassDeclaration = _localVariable_4;
		if (tmpTClass instanceof TClass) {
			TClass tClass = (TClass) tmpTClass;
			if (tmpMNestedType instanceof MClass) {
				MClass mNestedType = (MClass) tmpMNestedType;
				if (tmpPg instanceof TypeGraph) {
					TypeGraph pg = (TypeGraph) tmpPg;
					if (tmpTNestedType instanceof TClass) {
						TClass tNestedType = (TClass) tmpTNestedType;
						if (tmpEAnonymousClassDeclaration instanceof AnonymousClassDeclaration) {
							AnonymousClassDeclaration eAnonymousClassDeclaration = (AnonymousClassDeclaration) tmpEAnonymousClassDeclaration;
							return new Object[] { tClass, mNestedType, pg, tNestedType, eAnonymousClassDeclaration,
									targetMatch, sourceMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassInAnonymous_24_2_matchsrctrgcontext_blackBBBBBBB(TClass tClass,
			MClass mNestedType, TypeGraph pg, TClass tNestedType, AnonymousClassDeclaration eAnonymousClassDeclaration,
			Match sourceMatch, Match targetMatch) {
		if (!tClass.equals(tNestedType)) {
			if (!sourceMatch.equals(targetMatch)) {
				return new Object[] { tClass, mNestedType, pg, tNestedType, eAnonymousClassDeclaration, sourceMatch,
						targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassInAnonymous_24_2_matchsrctrgcontext_bindingAndBlackFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_ClassInAnonymous_24_2_matchsrctrgcontext_binding = pattern_ClassInAnonymous_24_2_matchsrctrgcontext_bindingFFFFFBB(
				targetMatch, sourceMatch);
		if (result_pattern_ClassInAnonymous_24_2_matchsrctrgcontext_binding != null) {
			TClass tClass = (TClass) result_pattern_ClassInAnonymous_24_2_matchsrctrgcontext_binding[0];
			MClass mNestedType = (MClass) result_pattern_ClassInAnonymous_24_2_matchsrctrgcontext_binding[1];
			TypeGraph pg = (TypeGraph) result_pattern_ClassInAnonymous_24_2_matchsrctrgcontext_binding[2];
			TClass tNestedType = (TClass) result_pattern_ClassInAnonymous_24_2_matchsrctrgcontext_binding[3];
			AnonymousClassDeclaration eAnonymousClassDeclaration = (AnonymousClassDeclaration) result_pattern_ClassInAnonymous_24_2_matchsrctrgcontext_binding[4];

			Object[] result_pattern_ClassInAnonymous_24_2_matchsrctrgcontext_black = pattern_ClassInAnonymous_24_2_matchsrctrgcontext_blackBBBBBBB(
					tClass, mNestedType, pg, tNestedType, eAnonymousClassDeclaration, sourceMatch, targetMatch);
			if (result_pattern_ClassInAnonymous_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { tClass, mNestedType, pg, tNestedType, eAnonymousClassDeclaration, sourceMatch,
						targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassInAnonymous_24_3_solvecsp_bindingFBBBBBBBB(ClassInAnonymous _this,
			TClass tClass, MClass mNestedType, TypeGraph pg, TClass tNestedType,
			AnonymousClassDeclaration eAnonymousClassDeclaration, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_5 = _this.isApplicable_solveCsp_CC(tClass, mNestedType, pg, tNestedType,
				eAnonymousClassDeclaration, sourceMatch, targetMatch);
		CSP csp = _localVariable_5;
		if (csp != null) {
			return new Object[] { csp, _this, tClass, mNestedType, pg, tNestedType, eAnonymousClassDeclaration,
					sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_ClassInAnonymous_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ClassInAnonymous_24_3_solvecsp_bindingAndBlackFBBBBBBBB(ClassInAnonymous _this,
			TClass tClass, MClass mNestedType, TypeGraph pg, TClass tNestedType,
			AnonymousClassDeclaration eAnonymousClassDeclaration, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_ClassInAnonymous_24_3_solvecsp_binding = pattern_ClassInAnonymous_24_3_solvecsp_bindingFBBBBBBBB(
				_this, tClass, mNestedType, pg, tNestedType, eAnonymousClassDeclaration, sourceMatch, targetMatch);
		if (result_pattern_ClassInAnonymous_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_ClassInAnonymous_24_3_solvecsp_binding[0];

			Object[] result_pattern_ClassInAnonymous_24_3_solvecsp_black = pattern_ClassInAnonymous_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_ClassInAnonymous_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, tClass, mNestedType, pg, tNestedType, eAnonymousClassDeclaration,
						sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_ClassInAnonymous_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_ClassInAnonymous_24_5_matchcorrcontext_blackBFBBB(TClass tClass,
			AnonymousClassDeclaration eAnonymousClassDeclaration, Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (AnonymousClassDeclarationToTClass eAnonymousClassDeclarationToTClass : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(tClass, AnonymousClassDeclarationToTClass.class, "target")) {
				if (eAnonymousClassDeclaration.equals(eAnonymousClassDeclarationToTClass.getSource())) {
					_result.add(new Object[] { tClass, eAnonymousClassDeclarationToTClass, eAnonymousClassDeclaration,
							sourceMatch, targetMatch });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_ClassInAnonymous_24_5_matchcorrcontext_greenBBBF(
			AnonymousClassDeclarationToTClass eAnonymousClassDeclarationToTClass, Match sourceMatch,
			Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "ClassInAnonymous";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(eAnonymousClassDeclarationToTClass);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { eAnonymousClassDeclarationToTClass, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_ClassInAnonymous_24_6_createcorrespondence_blackBBBBBB(TClass tClass,
			MClass mNestedType, TypeGraph pg, TClass tNestedType, AnonymousClassDeclaration eAnonymousClassDeclaration,
			CCMatch ccMatch) {
		if (!tClass.equals(tNestedType)) {
			return new Object[] { tClass, mNestedType, pg, tNestedType, eAnonymousClassDeclaration, ccMatch };
		}
		return null;
	}

	public static final Object[] pattern_ClassInAnonymous_24_6_createcorrespondence_greenBFBFB(MClass mNestedType,
			TClass tNestedType, CCMatch ccMatch) {
		ASTNodeToTAnnotatable mbodyToTAnnotatable = PmFactory.eINSTANCE.createASTNodeToTAnnotatable();
		TypeToTAbstractType mNestedTypeToTNestedType = PmFactory.eINSTANCE.createTypeToTAbstractType();
		mbodyToTAnnotatable.setSource(mNestedType);
		mbodyToTAnnotatable.setTarget(tNestedType);
		ccMatch.getCreateCorr().add(mbodyToTAnnotatable);
		mNestedTypeToTNestedType.setTarget(tNestedType);
		mNestedTypeToTNestedType.setSource(mNestedType);
		ccMatch.getCreateCorr().add(mNestedTypeToTNestedType);
		return new Object[] { mNestedType, mbodyToTAnnotatable, tNestedType, mNestedTypeToTNestedType, ccMatch };
	}

	public static final Object[] pattern_ClassInAnonymous_24_7_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_ClassInAnonymous_24_7_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "ClassInAnonymous";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_ClassInAnonymous_24_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_ClassInAnonymous_27_1_matchtggpattern_black_nac_0B(MClass mNestedType) {
		AbstractTypeDeclaration __DEC_mNestedType_abstractTypeDeclaration_624812 = mNestedType
				.getAbstractTypeDeclaration();
		if (__DEC_mNestedType_abstractTypeDeclaration_624812 != null) {
			if (!mNestedType.equals(__DEC_mNestedType_abstractTypeDeclaration_624812)) {
				return new Object[] { mNestedType };
			}
		}

		return null;
	}

	public static final Object[] pattern_ClassInAnonymous_27_1_matchtggpattern_black_nac_1B(MClass mNestedType) {
		for (Model __DEC_mNestedType_orphanTypes_978549 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mNestedType, Model.class, "orphanTypes")) {
			return new Object[] { mNestedType };
		}
		return null;
	}

	public static final Object[] pattern_ClassInAnonymous_27_1_matchtggpattern_black_nac_2B(MClass mNestedType) {
		org.eclipse.modisco.java.Package __DEC_mNestedType_ownedElements_800781 = mNestedType.getPackage();
		if (__DEC_mNestedType_ownedElements_800781 != null) {
			return new Object[] { mNestedType };
		}

		return null;
	}

	public static final Object[] pattern_ClassInAnonymous_27_1_matchtggpattern_black_nac_3B(MClass mNestedType) {
		for (MAbstractMethodDefinition __DEC_mNestedType_mInnerTypes_447012 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mNestedType, MAbstractMethodDefinition.class, "mInnerTypes")) {
			return new Object[] { mNestedType };
		}
		return null;
	}

	public static final Object[] pattern_ClassInAnonymous_27_1_matchtggpattern_blackBB(MClass mNestedType,
			AnonymousClassDeclaration eAnonymousClassDeclaration) {
		if (eAnonymousClassDeclaration.equals(mNestedType.getAnonymousClassDeclarationOwner())) {
			if (pattern_ClassInAnonymous_27_1_matchtggpattern_black_nac_0B(mNestedType) == null) {
				if (pattern_ClassInAnonymous_27_1_matchtggpattern_black_nac_1B(mNestedType) == null) {
					if (pattern_ClassInAnonymous_27_1_matchtggpattern_black_nac_2B(mNestedType) == null) {
						if (pattern_ClassInAnonymous_27_1_matchtggpattern_black_nac_3B(mNestedType) == null) {
							return new Object[] { mNestedType, eAnonymousClassDeclaration };
						}
					}
				}
			}
		}
		return null;
	}

	public static final boolean pattern_ClassInAnonymous_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ClassInAnonymous_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_ClassInAnonymous_28_1_matchtggpattern_black_nac_0B(TClass tNestedType) {
		for (TPackage __DEC_tNestedType_classes_621395 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tNestedType, TPackage.class, "classes")) {
			return new Object[] { tNestedType };
		}
		return null;
	}

	public static final Object[] pattern_ClassInAnonymous_28_1_matchtggpattern_black_nac_1BB(TClass tNestedType,
			TypeGraph pg) {
		for (TypeGraph __DEC_tNestedType_classes_773466 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tNestedType, TypeGraph.class, "classes")) {
			if (!pg.equals(__DEC_tNestedType_classes_773466)) {
				return new Object[] { tNestedType, pg };
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassInAnonymous_28_1_matchtggpattern_black_nac_2B(TClass tNestedType) {
		TPackage __DEC_tNestedType_ownedTypes_494191 = tNestedType.getPackage();
		if (__DEC_tNestedType_ownedTypes_494191 != null) {
			return new Object[] { tNestedType };
		}

		return null;
	}

	public static final Object[] pattern_ClassInAnonymous_28_1_matchtggpattern_black_nac_3BB(TClass tNestedType,
			TClass tClass) {
		if (!tClass.equals(tNestedType)) {
			TAbstractType __DEC_tNestedType_innerTypes_473317 = tNestedType.getOuterType();
			if (__DEC_tNestedType_innerTypes_473317 != null) {
				if (!tNestedType.equals(__DEC_tNestedType_innerTypes_473317)) {
					if (!tClass.equals(__DEC_tNestedType_innerTypes_473317)) {
						return new Object[] { tNestedType, tClass };
					}
				}
			}

		}
		return null;
	}

	public static final Object[] pattern_ClassInAnonymous_28_1_matchtggpattern_blackBBB(TClass tClass, TypeGraph pg,
			TClass tNestedType) {
		if (!tClass.equals(tNestedType)) {
			if (pg.getClasses().contains(tClass)) {
				if (pg.getClasses().contains(tNestedType)) {
					if (pg.getOwnedTypes().contains(tClass)) {
						if (tClass.getInnerTypes().contains(tNestedType)) {
							if (pg.getOwnedTypes().contains(tNestedType)) {
								if (pattern_ClassInAnonymous_28_1_matchtggpattern_black_nac_0B(tNestedType) == null) {
									if (pattern_ClassInAnonymous_28_1_matchtggpattern_black_nac_1BB(tNestedType,
											pg) == null) {
										if (pattern_ClassInAnonymous_28_1_matchtggpattern_black_nac_2B(
												tNestedType) == null) {
											if (pattern_ClassInAnonymous_28_1_matchtggpattern_black_nac_3BB(tNestedType,
													tClass) == null) {
												return new Object[] { tClass, pg, tNestedType };
											}
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

	public static final boolean pattern_ClassInAnonymous_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ClassInAnonymous_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_ClassInAnonymous_29_1_createresult_blackB(ClassInAnonymous _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_ClassInAnonymous_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_ClassInAnonymous_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, TClass tClass) {
		if (ruleResult.getTargetObjects().contains(tClass)) {
			return new Object[] { ruleResult, tClass };
		}
		return null;
	}

	public static final Object[] pattern_ClassInAnonymous_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, TypeGraph pg) {
		if (ruleResult.getTargetObjects().contains(pg)) {
			return new Object[] { ruleResult, pg };
		}
		return null;
	}

	public static final Object[] pattern_ClassInAnonymous_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, AnonymousClassDeclarationToTClass eAnonymousClassDeclarationToTClass) {
		if (ruleResult.getCorrObjects().contains(eAnonymousClassDeclarationToTClass)) {
			return new Object[] { ruleResult, eAnonymousClassDeclarationToTClass };
		}
		return null;
	}

	public static final Object[] pattern_ClassInAnonymous_29_2_isapplicablecore_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, AnonymousClassDeclaration eAnonymousClassDeclaration) {
		if (ruleResult.getSourceObjects().contains(eAnonymousClassDeclaration)) {
			return new Object[] { ruleResult, eAnonymousClassDeclaration };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ClassInAnonymous_29_2_isapplicablecore_blackFFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList eAnonymousClassDeclarationToTClassList : ruleEntryContainer.getRuleEntryList()) {
			for (EObject tmpEAnonymousClassDeclarationToTClass : eAnonymousClassDeclarationToTClassList
					.getEntryObjects()) {
				if (tmpEAnonymousClassDeclarationToTClass instanceof AnonymousClassDeclarationToTClass) {
					AnonymousClassDeclarationToTClass eAnonymousClassDeclarationToTClass = (AnonymousClassDeclarationToTClass) tmpEAnonymousClassDeclarationToTClass;
					TClass tClass = eAnonymousClassDeclarationToTClass.getTarget();
					if (tClass != null) {
						AnonymousClassDeclaration eAnonymousClassDeclaration = eAnonymousClassDeclarationToTClass
								.getSource();
						if (eAnonymousClassDeclaration != null) {
							TypeGraph pg = tClass.getModel();
							if (pg != null) {
								if (pg.getClasses().contains(tClass)) {
									if (pattern_ClassInAnonymous_29_2_isapplicablecore_black_nac_2BB(ruleResult,
											eAnonymousClassDeclarationToTClass) == null) {
										if (pattern_ClassInAnonymous_29_2_isapplicablecore_black_nac_0BB(ruleResult,
												tClass) == null) {
											if (pattern_ClassInAnonymous_29_2_isapplicablecore_black_nac_3BB(ruleResult,
													eAnonymousClassDeclaration) == null) {
												if (pattern_ClassInAnonymous_29_2_isapplicablecore_black_nac_1BB(
														ruleResult, pg) == null) {
													_result.add(new Object[] { eAnonymousClassDeclarationToTClassList,
															tClass, pg, eAnonymousClassDeclarationToTClass,
															eAnonymousClassDeclaration, ruleEntryContainer,
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
		return _result;
	}

	public static final Object[] pattern_ClassInAnonymous_29_3_solveCSP_bindingFBBBBBBB(ClassInAnonymous _this,
			IsApplicableMatch isApplicableMatch, TClass tClass, TypeGraph pg,
			AnonymousClassDeclarationToTClass eAnonymousClassDeclarationToTClass,
			AnonymousClassDeclaration eAnonymousClassDeclaration, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, tClass, pg,
				eAnonymousClassDeclarationToTClass, eAnonymousClassDeclaration, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, tClass, pg, eAnonymousClassDeclarationToTClass,
					eAnonymousClassDeclaration, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_ClassInAnonymous_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ClassInAnonymous_29_3_solveCSP_bindingAndBlackFBBBBBBB(ClassInAnonymous _this,
			IsApplicableMatch isApplicableMatch, TClass tClass, TypeGraph pg,
			AnonymousClassDeclarationToTClass eAnonymousClassDeclarationToTClass,
			AnonymousClassDeclaration eAnonymousClassDeclaration, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_ClassInAnonymous_29_3_solveCSP_binding = pattern_ClassInAnonymous_29_3_solveCSP_bindingFBBBBBBB(
				_this, isApplicableMatch, tClass, pg, eAnonymousClassDeclarationToTClass, eAnonymousClassDeclaration,
				ruleResult);
		if (result_pattern_ClassInAnonymous_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_ClassInAnonymous_29_3_solveCSP_binding[0];

			Object[] result_pattern_ClassInAnonymous_29_3_solveCSP_black = pattern_ClassInAnonymous_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_ClassInAnonymous_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, tClass, pg, eAnonymousClassDeclarationToTClass,
						eAnonymousClassDeclaration, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_ClassInAnonymous_29_4_checkCSP_expressionFBB(ClassInAnonymous _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ClassInAnonymous_29_5_checknacs_blackBBBB(TClass tClass, TypeGraph pg,
			AnonymousClassDeclarationToTClass eAnonymousClassDeclarationToTClass,
			AnonymousClassDeclaration eAnonymousClassDeclaration) {
		return new Object[] { tClass, pg, eAnonymousClassDeclarationToTClass, eAnonymousClassDeclaration };
	}

	public static final Object[] pattern_ClassInAnonymous_29_6_perform_blackBBBBB(TClass tClass, TypeGraph pg,
			AnonymousClassDeclarationToTClass eAnonymousClassDeclarationToTClass,
			AnonymousClassDeclaration eAnonymousClassDeclaration, ModelgeneratorRuleResult ruleResult) {
		return new Object[] { tClass, pg, eAnonymousClassDeclarationToTClass, eAnonymousClassDeclaration, ruleResult };
	}

	public static final Object[] pattern_ClassInAnonymous_29_6_perform_greenBFBFFFBBB(TClass tClass, TypeGraph pg,
			AnonymousClassDeclaration eAnonymousClassDeclaration, ModelgeneratorRuleResult ruleResult, CSP csp) {
		MClass mNestedType = ModiscoFactory.eINSTANCE.createMClass();
		ASTNodeToTAnnotatable mbodyToTAnnotatable = PmFactory.eINSTANCE.createASTNodeToTAnnotatable();
		TClass tNestedType = BasicFactory.eINSTANCE.createTClass();
		TypeToTAbstractType mNestedTypeToTNestedType = PmFactory.eINSTANCE.createTypeToTAbstractType();
		Object _localVariable_0 = csp.getValue("mNestedType", "proxy");
		Object _localVariable_1 = csp.getValue("mNestedType", "name");
		Object _localVariable_2 = csp.getValue("tNestedType", "tLib");
		Object _localVariable_3 = csp.getValue("tNestedType", "tName");
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_4 = ruleResult.getIncrementedPerformCount();
		mNestedType.setAnonymousClassDeclarationOwner(eAnonymousClassDeclaration);
		ruleResult.getSourceObjects().add(mNestedType);
		mbodyToTAnnotatable.setSource(mNestedType);
		ruleResult.getCorrObjects().add(mbodyToTAnnotatable);
		pg.getClasses().add(tNestedType);
		mbodyToTAnnotatable.setTarget(tNestedType);
		tClass.getInnerTypes().add(tNestedType);
		pg.getOwnedTypes().add(tNestedType);
		ruleResult.getTargetObjects().add(tNestedType);
		mNestedTypeToTNestedType.setTarget(tNestedType);
		mNestedTypeToTNestedType.setSource(mNestedType);
		ruleResult.getCorrObjects().add(mNestedTypeToTNestedType);
		boolean mNestedType_proxy_prime = (boolean) _localVariable_0;
		String mNestedType_name_prime = (String) _localVariable_1;
		boolean tNestedType_tLib_prime = (boolean) _localVariable_2;
		String tNestedType_tName_prime = (String) _localVariable_3;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_4);
		mNestedType.setProxy(Boolean.valueOf(mNestedType_proxy_prime));
		mNestedType.setName(mNestedType_name_prime);
		tNestedType.setTLib(Boolean.valueOf(tNestedType_tLib_prime));
		tNestedType.setTName(tNestedType_tName_prime);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { tClass, mNestedType, pg, mbodyToTAnnotatable, tNestedType, mNestedTypeToTNestedType,
				eAnonymousClassDeclaration, ruleResult, csp };
	}

	public static final ModelgeneratorRuleResult pattern_ClassInAnonymous_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //ClassInAnonymousImpl
