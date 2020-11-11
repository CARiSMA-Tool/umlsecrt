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
import org.eclipse.modisco.java.AbstractTypeDeclaration;
import org.eclipse.modisco.java.AnonymousClassDeclaration;
import org.eclipse.modisco.java.EnumDeclaration;
import org.eclipse.modisco.java.Modifier;

import org.eclipse.modisco.java.emf.JavaFactory;

import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.VisibilityKind;

import org.gravity.modisco.MMethodDefinition;
import org.gravity.modisco.ModiscoFactory;

import org.gravity.tgg.modisco.uml.ASTNode2Element;
import org.gravity.tgg.modisco.uml.Modifier2NamedElement;
import org.gravity.tgg.modisco.uml.NamedElement2NamedElement;

import org.gravity.tgg.modisco.uml.Rules.MethodDec2Operation4EnumWithModifier;
import org.gravity.tgg.modisco.uml.Rules.RulesPackage;

import org.gravity.tgg.modisco.uml.UmlFactory;

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
 * An implementation of the model object '<em><b>Method Dec2 Operation4 Enum With Modifier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class MethodDec2Operation4EnumWithModifierImpl extends AbstractRuleImpl
		implements MethodDec2Operation4EnumWithModifier {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MethodDec2Operation4EnumWithModifierImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getMethodDec2Operation4EnumWithModifier();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, MMethodDefinition bodyDeclaration, Modifier modifier,
			EnumDeclaration classDec) {

		Object[] result1_black = MethodDec2Operation4EnumWithModifierImpl
				.pattern_MethodDec2Operation4EnumWithModifier_0_1_initialbindings_blackBBBBB(this, match,
						bodyDeclaration, modifier, classDec);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[bodyDeclaration] = " + bodyDeclaration + ", " + "[modifier] = "
					+ modifier + ", " + "[classDec] = " + classDec + ".");
		}

		Object[] result2_bindingAndBlack = MethodDec2Operation4EnumWithModifierImpl
				.pattern_MethodDec2Operation4EnumWithModifier_0_2_SolveCSP_bindingAndBlackFBBBBB(this, match,
						bodyDeclaration, modifier, classDec);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[bodyDeclaration] = " + bodyDeclaration + ", " + "[modifier] = "
					+ modifier + ", " + "[classDec] = " + classDec + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (MethodDec2Operation4EnumWithModifierImpl
				.pattern_MethodDec2Operation4EnumWithModifier_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = MethodDec2Operation4EnumWithModifierImpl
					.pattern_MethodDec2Operation4EnumWithModifier_0_4_collectelementstobetranslated_blackBBBB(match,
							bodyDeclaration, modifier, classDec);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[bodyDeclaration] = " + bodyDeclaration + ", " + "[modifier] = " + modifier + ", "
						+ "[classDec] = " + classDec + ".");
			}
			MethodDec2Operation4EnumWithModifierImpl
					.pattern_MethodDec2Operation4EnumWithModifier_0_4_collectelementstobetranslated_greenBBBBFFFF(match,
							bodyDeclaration, modifier, classDec);
			//nothing EMoflonEdge bodyDeclaration__modifier____modifier = (EMoflonEdge) result4_green[4];
			//nothing EMoflonEdge modifier__bodyDeclaration____bodyDeclaration = (EMoflonEdge) result4_green[5];
			//nothing EMoflonEdge classDec__bodyDeclaration____bodyDeclarations = (EMoflonEdge) result4_green[6];
			//nothing EMoflonEdge bodyDeclaration__classDec____abstractTypeDeclaration = (EMoflonEdge) result4_green[7];

			Object[] result5_black = MethodDec2Operation4EnumWithModifierImpl
					.pattern_MethodDec2Operation4EnumWithModifier_0_5_collectcontextelements_blackBBBB(match,
							bodyDeclaration, modifier, classDec);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[bodyDeclaration] = " + bodyDeclaration + ", " + "[modifier] = " + modifier + ", "
						+ "[classDec] = " + classDec + ".");
			}
			MethodDec2Operation4EnumWithModifierImpl
					.pattern_MethodDec2Operation4EnumWithModifier_0_5_collectcontextelements_greenBB(match, classDec);

			// 
			MethodDec2Operation4EnumWithModifierImpl
					.pattern_MethodDec2Operation4EnumWithModifier_0_6_registerobjectstomatch_expressionBBBBB(this,
							match, bodyDeclaration, modifier, classDec);
			return MethodDec2Operation4EnumWithModifierImpl
					.pattern_MethodDec2Operation4EnumWithModifier_0_7_expressionF();
		} else {
			return MethodDec2Operation4EnumWithModifierImpl
					.pattern_MethodDec2Operation4EnumWithModifier_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = MethodDec2Operation4EnumWithModifierImpl
				.pattern_MethodDec2Operation4EnumWithModifier_1_1_performtransformation_bindingAndBlackFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		MMethodDefinition bodyDeclaration = (MMethodDefinition) result1_bindingAndBlack[0];
		Modifier modifier = (Modifier) result1_bindingAndBlack[1];
		Enumeration umlClass = (Enumeration) result1_bindingAndBlack[2];
		ASTNode2Element cd2c = (ASTNode2Element) result1_bindingAndBlack[3];
		EnumDeclaration classDec = (EnumDeclaration) result1_bindingAndBlack[4];
		CSP csp = (CSP) result1_bindingAndBlack[5];
		Object[] result1_green = MethodDec2Operation4EnumWithModifierImpl
				.pattern_MethodDec2Operation4EnumWithModifier_1_1_performtransformation_greenFFFFBBBB(bodyDeclaration,
						modifier, umlClass, csp);
		Modifier2NamedElement m2f = (Modifier2NamedElement) result1_green[0];
		Operation feature = (Operation) result1_green[1];
		NamedElement2NamedElement bd2ne = (NamedElement2NamedElement) result1_green[2];
		ASTNode2Element b2e = (ASTNode2Element) result1_green[3];

		Object[] result2_black = MethodDec2Operation4EnumWithModifierImpl
				.pattern_MethodDec2Operation4EnumWithModifier_1_2_collecttranslatedelements_blackBBBBBB(m2f, feature,
						bd2ne, b2e, bodyDeclaration, modifier);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[m2f] = " + m2f + ", "
					+ "[feature] = " + feature + ", " + "[bd2ne] = " + bd2ne + ", " + "[b2e] = " + b2e + ", "
					+ "[bodyDeclaration] = " + bodyDeclaration + ", " + "[modifier] = " + modifier + ".");
		}
		Object[] result2_green = MethodDec2Operation4EnumWithModifierImpl
				.pattern_MethodDec2Operation4EnumWithModifier_1_2_collecttranslatedelements_greenFBBBBBB(m2f, feature,
						bd2ne, b2e, bodyDeclaration, modifier);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = MethodDec2Operation4EnumWithModifierImpl
				.pattern_MethodDec2Operation4EnumWithModifier_1_3_bookkeepingforedges_blackBBBBBBBBBB(ruleresult, m2f,
						feature, bd2ne, b2e, bodyDeclaration, modifier, umlClass, cd2c, classDec);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[m2f] = " + m2f + ", " + "[feature] = " + feature + ", " + "[bd2ne] = " + bd2ne + ", "
					+ "[b2e] = " + b2e + ", " + "[bodyDeclaration] = " + bodyDeclaration + ", " + "[modifier] = "
					+ modifier + ", " + "[umlClass] = " + umlClass + ", " + "[cd2c] = " + cd2c + ", " + "[classDec] = "
					+ classDec + ".");
		}
		MethodDec2Operation4EnumWithModifierImpl
				.pattern_MethodDec2Operation4EnumWithModifier_1_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFFFFFF(
						ruleresult, m2f, feature, bd2ne, b2e, bodyDeclaration, modifier, umlClass, classDec);
		//nothing EMoflonEdge umlClass__feature____ownedOperation = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge feature__umlClass____datatype = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge bd2ne__bodyDeclaration____source = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge bodyDeclaration__modifier____modifier = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge modifier__bodyDeclaration____bodyDeclaration = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge m2f__feature____target = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge bd2ne__feature____target = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge b2e__bodyDeclaration____source = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge classDec__bodyDeclaration____bodyDeclarations = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge bodyDeclaration__classDec____abstractTypeDeclaration = (EMoflonEdge) result3_green[18];
		//nothing EMoflonEdge m2f__modifier____source = (EMoflonEdge) result3_green[19];
		//nothing EMoflonEdge b2e__feature____target = (EMoflonEdge) result3_green[20];

		// 
		// 
		MethodDec2Operation4EnumWithModifierImpl
				.pattern_MethodDec2Operation4EnumWithModifier_1_5_registerobjects_expressionBBBBBBBBBBB(this,
						ruleresult, m2f, feature, bd2ne, b2e, bodyDeclaration, modifier, umlClass, cd2c, classDec);
		return MethodDec2Operation4EnumWithModifierImpl
				.pattern_MethodDec2Operation4EnumWithModifier_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = MethodDec2Operation4EnumWithModifierImpl
				.pattern_MethodDec2Operation4EnumWithModifier_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = MethodDec2Operation4EnumWithModifierImpl
				.pattern_MethodDec2Operation4EnumWithModifier_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = MethodDec2Operation4EnumWithModifierImpl
				.pattern_MethodDec2Operation4EnumWithModifier_2_2_corematch_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		MMethodDefinition bodyDeclaration = (MMethodDefinition) result2_binding[0];
		Modifier modifier = (Modifier) result2_binding[1];
		EnumDeclaration classDec = (EnumDeclaration) result2_binding[2];
		for (Object[] result2_black : MethodDec2Operation4EnumWithModifierImpl
				.pattern_MethodDec2Operation4EnumWithModifier_2_2_corematch_blackBBFFBB(bodyDeclaration, modifier,
						classDec, match)) {
			Enumeration umlClass = (Enumeration) result2_black[2];
			ASTNode2Element cd2c = (ASTNode2Element) result2_black[3];
			// ForEach 
			for (Object[] result3_black : MethodDec2Operation4EnumWithModifierImpl
					.pattern_MethodDec2Operation4EnumWithModifier_2_3_findcontext_blackBBBBB(bodyDeclaration, modifier,
							umlClass, cd2c, classDec)) {
				Object[] result3_green = MethodDec2Operation4EnumWithModifierImpl
						.pattern_MethodDec2Operation4EnumWithModifier_2_3_findcontext_greenBBBBBFFFFFFF(bodyDeclaration,
								modifier, umlClass, cd2c, classDec);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[5];
				//nothing EMoflonEdge cd2c__classDec____source = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge bodyDeclaration__modifier____modifier = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge modifier__bodyDeclaration____bodyDeclaration = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge cd2c__umlClass____target = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge classDec__bodyDeclaration____bodyDeclarations = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge bodyDeclaration__classDec____abstractTypeDeclaration = (EMoflonEdge) result3_green[11];

				Object[] result4_bindingAndBlack = MethodDec2Operation4EnumWithModifierImpl
						.pattern_MethodDec2Operation4EnumWithModifier_2_4_solveCSP_bindingAndBlackFBBBBBBB(this,
								isApplicableMatch, bodyDeclaration, modifier, umlClass, cd2c, classDec);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[bodyDeclaration] = "
							+ bodyDeclaration + ", " + "[modifier] = " + modifier + ", " + "[umlClass] = " + umlClass
							+ ", " + "[cd2c] = " + cd2c + ", " + "[classDec] = " + classDec + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (MethodDec2Operation4EnumWithModifierImpl
						.pattern_MethodDec2Operation4EnumWithModifier_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = MethodDec2Operation4EnumWithModifierImpl
							.pattern_MethodDec2Operation4EnumWithModifier_2_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					MethodDec2Operation4EnumWithModifierImpl
							.pattern_MethodDec2Operation4EnumWithModifier_2_6_addmatchtoruleresult_greenBB(ruleresult,
									isApplicableMatch);

				} else {
				}

			}

		}
		return MethodDec2Operation4EnumWithModifierImpl
				.pattern_MethodDec2Operation4EnumWithModifier_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, MMethodDefinition bodyDeclaration, Modifier modifier,
			EnumDeclaration classDec) {
		match.registerObject("bodyDeclaration", bodyDeclaration);
		match.registerObject("modifier", modifier);
		match.registerObject("classDec", classDec);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, MMethodDefinition bodyDeclaration, Modifier modifier,
			EnumDeclaration classDec) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, MMethodDefinition bodyDeclaration,
			Modifier modifier, Enumeration umlClass, ASTNode2Element cd2c, EnumDeclaration classDec) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_bodyDeclaration_name = CSPFactoryHelper.eINSTANCE.createVariable("bodyDeclaration.name", true,
				csp);
		var_bodyDeclaration_name.setValue(bodyDeclaration.getName());
		var_bodyDeclaration_name.setType("String");
		Variable var_modifier_static = CSPFactoryHelper.eINSTANCE.createVariable("modifier.static", true, csp);
		var_modifier_static.setValue(modifier.isStatic());
		var_modifier_static.setType("Boolean");
		Variable var_modifier_visibility = CSPFactoryHelper.eINSTANCE.createVariable("modifier.visibility", true, csp);
		var_modifier_visibility.setValue(modifier.getVisibility());
		var_modifier_visibility.setType("java.VisibilityKind");

		// Create unbound variables
		Variable var_feature_name = CSPFactoryHelper.eINSTANCE.createVariable("feature.name", csp);
		var_feature_name.setType("String");
		Variable var_feature_isStatic = CSPFactoryHelper.eINSTANCE.createVariable("feature.isStatic", csp);
		var_feature_isStatic.setType("Boolean");
		Variable var_feature_visibility = CSPFactoryHelper.eINSTANCE.createVariable("feature.visibility", csp);
		var_feature_visibility.setType("uml.VisibilityKind");

		// Create constraints
		Eq eq = new Eq();
		Eq eq_0 = new Eq();
		JVisibility2umlVisibility jVisibility2umlVisibility = new JVisibility2umlVisibility();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(eq_0);
		csp.getConstraints().add(jVisibility2umlVisibility);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_bodyDeclaration_name, var_feature_name);
		eq_0.setRuleName("NoRuleName");
		eq_0.solve(var_modifier_static, var_feature_isStatic);
		jVisibility2umlVisibility.setRuleName("NoRuleName");
		jVisibility2umlVisibility.solve(var_modifier_visibility, var_feature_visibility);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("bodyDeclaration", bodyDeclaration);
		isApplicableMatch.registerObject("modifier", modifier);
		isApplicableMatch.registerObject("umlClass", umlClass);
		isApplicableMatch.registerObject("cd2c", cd2c);
		isApplicableMatch.registerObject("classDec", classDec);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject m2f, EObject feature, EObject bd2ne,
			EObject b2e, EObject bodyDeclaration, EObject modifier, EObject umlClass, EObject cd2c, EObject classDec) {
		ruleresult.registerObject("m2f", m2f);
		ruleresult.registerObject("feature", feature);
		ruleresult.registerObject("bd2ne", bd2ne);
		ruleresult.registerObject("b2e", b2e);
		ruleresult.registerObject("bodyDeclaration", bodyDeclaration);
		ruleresult.registerObject("modifier", modifier);
		ruleresult.registerObject("umlClass", umlClass);
		ruleresult.registerObject("cd2c", cd2c);
		ruleresult.registerObject("classDec", classDec);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("bodyDeclaration").eClass())
						.equals("modisco.MMethodDefinition.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("modifier").eClass()).equals("java.Modifier.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, Operation feature, Enumeration umlClass) {

		Object[] result1_black = MethodDec2Operation4EnumWithModifierImpl
				.pattern_MethodDec2Operation4EnumWithModifier_10_1_initialbindings_blackBBBB(this, match, feature,
						umlClass);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[feature] = " + feature + ", " + "[umlClass] = " + umlClass + ".");
		}

		Object[] result2_bindingAndBlack = MethodDec2Operation4EnumWithModifierImpl
				.pattern_MethodDec2Operation4EnumWithModifier_10_2_SolveCSP_bindingAndBlackFBBBB(this, match, feature,
						umlClass);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[feature] = " + feature + ", " + "[umlClass] = " + umlClass + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (MethodDec2Operation4EnumWithModifierImpl
				.pattern_MethodDec2Operation4EnumWithModifier_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = MethodDec2Operation4EnumWithModifierImpl
					.pattern_MethodDec2Operation4EnumWithModifier_10_4_collectelementstobetranslated_blackBBB(match,
							feature, umlClass);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[feature] = " + feature + ", " + "[umlClass] = " + umlClass + ".");
			}
			MethodDec2Operation4EnumWithModifierImpl
					.pattern_MethodDec2Operation4EnumWithModifier_10_4_collectelementstobetranslated_greenBBBFF(match,
							feature, umlClass);
			//nothing EMoflonEdge umlClass__feature____ownedOperation = (EMoflonEdge) result4_green[3];
			//nothing EMoflonEdge feature__umlClass____datatype = (EMoflonEdge) result4_green[4];

			Object[] result5_black = MethodDec2Operation4EnumWithModifierImpl
					.pattern_MethodDec2Operation4EnumWithModifier_10_5_collectcontextelements_blackBBB(match, feature,
							umlClass);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[feature] = " + feature + ", " + "[umlClass] = " + umlClass + ".");
			}
			MethodDec2Operation4EnumWithModifierImpl
					.pattern_MethodDec2Operation4EnumWithModifier_10_5_collectcontextelements_greenBB(match, umlClass);

			// 
			MethodDec2Operation4EnumWithModifierImpl
					.pattern_MethodDec2Operation4EnumWithModifier_10_6_registerobjectstomatch_expressionBBBB(this,
							match, feature, umlClass);
			return MethodDec2Operation4EnumWithModifierImpl
					.pattern_MethodDec2Operation4EnumWithModifier_10_7_expressionF();
		} else {
			return MethodDec2Operation4EnumWithModifierImpl
					.pattern_MethodDec2Operation4EnumWithModifier_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = MethodDec2Operation4EnumWithModifierImpl
				.pattern_MethodDec2Operation4EnumWithModifier_11_1_performtransformation_bindingAndBlackFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		Operation feature = (Operation) result1_bindingAndBlack[0];
		Enumeration umlClass = (Enumeration) result1_bindingAndBlack[1];
		ASTNode2Element cd2c = (ASTNode2Element) result1_bindingAndBlack[2];
		EnumDeclaration classDec = (EnumDeclaration) result1_bindingAndBlack[3];
		CSP csp = (CSP) result1_bindingAndBlack[4];
		Object[] result1_green = MethodDec2Operation4EnumWithModifierImpl
				.pattern_MethodDec2Operation4EnumWithModifier_11_1_performtransformation_greenFBFFFFBB(feature,
						classDec, csp);
		Modifier2NamedElement m2f = (Modifier2NamedElement) result1_green[0];
		NamedElement2NamedElement bd2ne = (NamedElement2NamedElement) result1_green[2];
		ASTNode2Element b2e = (ASTNode2Element) result1_green[3];
		MMethodDefinition bodyDeclaration = (MMethodDefinition) result1_green[4];
		Modifier modifier = (Modifier) result1_green[5];

		Object[] result2_black = MethodDec2Operation4EnumWithModifierImpl
				.pattern_MethodDec2Operation4EnumWithModifier_11_2_collecttranslatedelements_blackBBBBBB(m2f, feature,
						bd2ne, b2e, bodyDeclaration, modifier);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[m2f] = " + m2f + ", "
					+ "[feature] = " + feature + ", " + "[bd2ne] = " + bd2ne + ", " + "[b2e] = " + b2e + ", "
					+ "[bodyDeclaration] = " + bodyDeclaration + ", " + "[modifier] = " + modifier + ".");
		}
		Object[] result2_green = MethodDec2Operation4EnumWithModifierImpl
				.pattern_MethodDec2Operation4EnumWithModifier_11_2_collecttranslatedelements_greenFBBBBBB(m2f, feature,
						bd2ne, b2e, bodyDeclaration, modifier);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = MethodDec2Operation4EnumWithModifierImpl
				.pattern_MethodDec2Operation4EnumWithModifier_11_3_bookkeepingforedges_blackBBBBBBBBBB(ruleresult, m2f,
						feature, bd2ne, b2e, bodyDeclaration, modifier, umlClass, cd2c, classDec);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[m2f] = " + m2f + ", " + "[feature] = " + feature + ", " + "[bd2ne] = " + bd2ne + ", "
					+ "[b2e] = " + b2e + ", " + "[bodyDeclaration] = " + bodyDeclaration + ", " + "[modifier] = "
					+ modifier + ", " + "[umlClass] = " + umlClass + ", " + "[cd2c] = " + cd2c + ", " + "[classDec] = "
					+ classDec + ".");
		}
		MethodDec2Operation4EnumWithModifierImpl
				.pattern_MethodDec2Operation4EnumWithModifier_11_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFFFFFF(
						ruleresult, m2f, feature, bd2ne, b2e, bodyDeclaration, modifier, umlClass, classDec);
		//nothing EMoflonEdge umlClass__feature____ownedOperation = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge feature__umlClass____datatype = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge bd2ne__bodyDeclaration____source = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge bodyDeclaration__modifier____modifier = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge modifier__bodyDeclaration____bodyDeclaration = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge m2f__feature____target = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge bd2ne__feature____target = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge b2e__bodyDeclaration____source = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge classDec__bodyDeclaration____bodyDeclarations = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge bodyDeclaration__classDec____abstractTypeDeclaration = (EMoflonEdge) result3_green[18];
		//nothing EMoflonEdge m2f__modifier____source = (EMoflonEdge) result3_green[19];
		//nothing EMoflonEdge b2e__feature____target = (EMoflonEdge) result3_green[20];

		// 
		// 
		MethodDec2Operation4EnumWithModifierImpl
				.pattern_MethodDec2Operation4EnumWithModifier_11_5_registerobjects_expressionBBBBBBBBBBB(this,
						ruleresult, m2f, feature, bd2ne, b2e, bodyDeclaration, modifier, umlClass, cd2c, classDec);
		return MethodDec2Operation4EnumWithModifierImpl
				.pattern_MethodDec2Operation4EnumWithModifier_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = MethodDec2Operation4EnumWithModifierImpl
				.pattern_MethodDec2Operation4EnumWithModifier_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = MethodDec2Operation4EnumWithModifierImpl
				.pattern_MethodDec2Operation4EnumWithModifier_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = MethodDec2Operation4EnumWithModifierImpl
				.pattern_MethodDec2Operation4EnumWithModifier_12_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		Operation feature = (Operation) result2_binding[0];
		Enumeration umlClass = (Enumeration) result2_binding[1];
		for (Object[] result2_black : MethodDec2Operation4EnumWithModifierImpl
				.pattern_MethodDec2Operation4EnumWithModifier_12_2_corematch_blackBBFFB(feature, umlClass, match)) {
			ASTNode2Element cd2c = (ASTNode2Element) result2_black[2];
			EnumDeclaration classDec = (EnumDeclaration) result2_black[3];
			// ForEach 
			for (Object[] result3_black : MethodDec2Operation4EnumWithModifierImpl
					.pattern_MethodDec2Operation4EnumWithModifier_12_3_findcontext_blackBBBB(feature, umlClass, cd2c,
							classDec)) {
				Object[] result3_green = MethodDec2Operation4EnumWithModifierImpl
						.pattern_MethodDec2Operation4EnumWithModifier_12_3_findcontext_greenBBBBFFFFF(feature, umlClass,
								cd2c, classDec);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[4];
				//nothing EMoflonEdge umlClass__feature____ownedOperation = (EMoflonEdge) result3_green[5];
				//nothing EMoflonEdge feature__umlClass____datatype = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge cd2c__classDec____source = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge cd2c__umlClass____target = (EMoflonEdge) result3_green[8];

				Object[] result4_bindingAndBlack = MethodDec2Operation4EnumWithModifierImpl
						.pattern_MethodDec2Operation4EnumWithModifier_12_4_solveCSP_bindingAndBlackFBBBBBB(this,
								isApplicableMatch, feature, umlClass, cd2c, classDec);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[feature] = " + feature + ", "
							+ "[umlClass] = " + umlClass + ", " + "[cd2c] = " + cd2c + ", " + "[classDec] = " + classDec
							+ ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (MethodDec2Operation4EnumWithModifierImpl
						.pattern_MethodDec2Operation4EnumWithModifier_12_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = MethodDec2Operation4EnumWithModifierImpl
							.pattern_MethodDec2Operation4EnumWithModifier_12_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					MethodDec2Operation4EnumWithModifierImpl
							.pattern_MethodDec2Operation4EnumWithModifier_12_6_addmatchtoruleresult_greenBB(ruleresult,
									isApplicableMatch);

				} else {
				}

			}

		}
		return MethodDec2Operation4EnumWithModifierImpl
				.pattern_MethodDec2Operation4EnumWithModifier_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, Operation feature, Enumeration umlClass) {
		match.registerObject("feature", feature);
		match.registerObject("umlClass", umlClass);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, Operation feature, Enumeration umlClass) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, Operation feature, Enumeration umlClass,
			ASTNode2Element cd2c, EnumDeclaration classDec) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_feature_name = CSPFactoryHelper.eINSTANCE.createVariable("feature.name", true, csp);
		var_feature_name.setValue(feature.getName());
		var_feature_name.setType("String");
		Variable var_feature_isStatic = CSPFactoryHelper.eINSTANCE.createVariable("feature.isStatic", true, csp);
		var_feature_isStatic.setValue(feature.isStatic());
		var_feature_isStatic.setType("Boolean");
		Variable var_feature_visibility = CSPFactoryHelper.eINSTANCE.createVariable("feature.visibility", true, csp);
		var_feature_visibility.setValue(feature.getVisibility());
		var_feature_visibility.setType("uml.VisibilityKind");

		// Create unbound variables
		Variable var_bodyDeclaration_name = CSPFactoryHelper.eINSTANCE.createVariable("bodyDeclaration.name", csp);
		var_bodyDeclaration_name.setType("String");
		Variable var_modifier_static = CSPFactoryHelper.eINSTANCE.createVariable("modifier.static", csp);
		var_modifier_static.setType("Boolean");
		Variable var_modifier_visibility = CSPFactoryHelper.eINSTANCE.createVariable("modifier.visibility", csp);
		var_modifier_visibility.setType("java.VisibilityKind");

		// Create constraints
		Eq eq = new Eq();
		Eq eq_0 = new Eq();
		JVisibility2umlVisibility jVisibility2umlVisibility = new JVisibility2umlVisibility();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(eq_0);
		csp.getConstraints().add(jVisibility2umlVisibility);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_bodyDeclaration_name, var_feature_name);
		eq_0.setRuleName("NoRuleName");
		eq_0.solve(var_modifier_static, var_feature_isStatic);
		jVisibility2umlVisibility.setRuleName("NoRuleName");
		jVisibility2umlVisibility.solve(var_modifier_visibility, var_feature_visibility);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("feature", feature);
		isApplicableMatch.registerObject("umlClass", umlClass);
		isApplicableMatch.registerObject("cd2c", cd2c);
		isApplicableMatch.registerObject("classDec", classDec);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject m2f, EObject feature, EObject bd2ne,
			EObject b2e, EObject bodyDeclaration, EObject modifier, EObject umlClass, EObject cd2c, EObject classDec) {
		ruleresult.registerObject("m2f", m2f);
		ruleresult.registerObject("feature", feature);
		ruleresult.registerObject("bd2ne", bd2ne);
		ruleresult.registerObject("b2e", b2e);
		ruleresult.registerObject("bodyDeclaration", bodyDeclaration);
		ruleresult.registerObject("modifier", modifier);
		ruleresult.registerObject("umlClass", umlClass);
		ruleresult.registerObject("cd2c", cd2c);
		ruleresult.registerObject("classDec", classDec);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("feature").eClass()).equals("uml.Operation.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_938(EMoflonEdge _edge_ownedOperation) {

		Object[] result1_bindingAndBlack = MethodDec2Operation4EnumWithModifierImpl
				.pattern_MethodDec2Operation4EnumWithModifier_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = MethodDec2Operation4EnumWithModifierImpl
				.pattern_MethodDec2Operation4EnumWithModifier_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : MethodDec2Operation4EnumWithModifierImpl
				.pattern_MethodDec2Operation4EnumWithModifier_20_2_testcorematchandDECs_blackFFB(
						_edge_ownedOperation)) {
			Operation feature = (Operation) result2_black[0];
			Enumeration umlClass = (Enumeration) result2_black[1];
			Object[] result2_green = MethodDec2Operation4EnumWithModifierImpl
					.pattern_MethodDec2Operation4EnumWithModifier_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (MethodDec2Operation4EnumWithModifierImpl
					.pattern_MethodDec2Operation4EnumWithModifier_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
							this, match, feature, umlClass)) {
				// 
				if (MethodDec2Operation4EnumWithModifierImpl
						.pattern_MethodDec2Operation4EnumWithModifier_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = MethodDec2Operation4EnumWithModifierImpl
							.pattern_MethodDec2Operation4EnumWithModifier_20_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					MethodDec2Operation4EnumWithModifierImpl
							.pattern_MethodDec2Operation4EnumWithModifier_20_5_Addmatchtoruleresult_greenBBBB(match,
									__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return MethodDec2Operation4EnumWithModifierImpl
				.pattern_MethodDec2Operation4EnumWithModifier_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_961(EMoflonEdge _edge_modifier) {

		Object[] result1_bindingAndBlack = MethodDec2Operation4EnumWithModifierImpl
				.pattern_MethodDec2Operation4EnumWithModifier_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = MethodDec2Operation4EnumWithModifierImpl
				.pattern_MethodDec2Operation4EnumWithModifier_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : MethodDec2Operation4EnumWithModifierImpl
				.pattern_MethodDec2Operation4EnumWithModifier_21_2_testcorematchandDECs_blackFFFB(_edge_modifier)) {
			MMethodDefinition bodyDeclaration = (MMethodDefinition) result2_black[0];
			Modifier modifier = (Modifier) result2_black[1];
			EnumDeclaration classDec = (EnumDeclaration) result2_black[2];
			Object[] result2_green = MethodDec2Operation4EnumWithModifierImpl
					.pattern_MethodDec2Operation4EnumWithModifier_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (MethodDec2Operation4EnumWithModifierImpl
					.pattern_MethodDec2Operation4EnumWithModifier_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
							this, match, bodyDeclaration, modifier, classDec)) {
				// 
				if (MethodDec2Operation4EnumWithModifierImpl
						.pattern_MethodDec2Operation4EnumWithModifier_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = MethodDec2Operation4EnumWithModifierImpl
							.pattern_MethodDec2Operation4EnumWithModifier_21_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					MethodDec2Operation4EnumWithModifierImpl
							.pattern_MethodDec2Operation4EnumWithModifier_21_5_Addmatchtoruleresult_greenBBBB(match,
									__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return MethodDec2Operation4EnumWithModifierImpl
				.pattern_MethodDec2Operation4EnumWithModifier_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("MethodDec2Operation4EnumWithModifier");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		Variable var_feature_name = CSPFactoryHelper.eINSTANCE.createVariable("feature", true, csp);
		var_feature_name.setValue(__helper.getValue("feature", "name"));
		var_feature_name.setType("String");

		Variable var_bodyDeclaration_name = CSPFactoryHelper.eINSTANCE.createVariable("bodyDeclaration", true, csp);
		var_bodyDeclaration_name.setValue(__helper.getValue("bodyDeclaration", "name"));
		var_bodyDeclaration_name.setType("String");

		Variable var_modifier_static = CSPFactoryHelper.eINSTANCE.createVariable("modifier", true, csp);
		var_modifier_static.setValue(__helper.getValue("modifier", "static"));
		var_modifier_static.setType("boolean");

		Variable var_feature_isStatic = CSPFactoryHelper.eINSTANCE.createVariable("feature", true, csp);
		var_feature_isStatic.setValue(__helper.getValue("feature", "isStatic"));
		var_feature_isStatic.setType("boolean");

		Variable var_modifier_visibility = CSPFactoryHelper.eINSTANCE.createVariable("modifier", true, csp);
		var_modifier_visibility.setValue(__helper.getValue("modifier", "visibility"));
		var_modifier_visibility.setType("java.VisibilityKind");

		Variable var_feature_visibility = CSPFactoryHelper.eINSTANCE.createVariable("feature", true, csp);
		var_feature_visibility.setValue(__helper.getValue("feature", "visibility"));
		var_feature_visibility.setType("uml.VisibilityKind");

		Eq eq0 = new Eq();
		csp.getConstraints().add(eq0);

		Eq eq1 = new Eq();
		csp.getConstraints().add(eq1);

		JVisibility2umlVisibility jVisibility2umlVisibility2 = new JVisibility2umlVisibility();
		csp.getConstraints().add(jVisibility2umlVisibility2);

		eq0.setRuleName("MethodDec2Operation4EnumWithModifier");
		eq0.solve(var_bodyDeclaration_name, var_feature_name);

		eq1.setRuleName("MethodDec2Operation4EnumWithModifier");
		eq1.solve(var_modifier_static, var_feature_isStatic);

		jVisibility2umlVisibility2.setRuleName("MethodDec2Operation4EnumWithModifier");
		jVisibility2umlVisibility2.solve(var_modifier_visibility, var_feature_visibility);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_feature_name.setBound(false);
			var_feature_isStatic.setBound(false);
			var_feature_visibility.setBound(false);
			eq0.solve(var_bodyDeclaration_name, var_feature_name);
			eq1.solve(var_modifier_static, var_feature_isStatic);
			jVisibility2umlVisibility2.solve(var_modifier_visibility, var_feature_visibility);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
				__helper.setValue("feature", "name", var_feature_name.getValue());
				__helper.setValue("feature", "isStatic", var_feature_isStatic.getValue());
				__helper.setValue("feature", "visibility", var_feature_visibility.getValue());
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
		ruleResult.setRule("MethodDec2Operation4EnumWithModifier");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		Variable var_feature_name = CSPFactoryHelper.eINSTANCE.createVariable("feature", true, csp);
		var_feature_name.setValue(__helper.getValue("feature", "name"));
		var_feature_name.setType("String");

		Variable var_bodyDeclaration_name = CSPFactoryHelper.eINSTANCE.createVariable("bodyDeclaration", true, csp);
		var_bodyDeclaration_name.setValue(__helper.getValue("bodyDeclaration", "name"));
		var_bodyDeclaration_name.setType("String");

		Variable var_modifier_static = CSPFactoryHelper.eINSTANCE.createVariable("modifier", true, csp);
		var_modifier_static.setValue(__helper.getValue("modifier", "static"));
		var_modifier_static.setType("boolean");

		Variable var_feature_isStatic = CSPFactoryHelper.eINSTANCE.createVariable("feature", true, csp);
		var_feature_isStatic.setValue(__helper.getValue("feature", "isStatic"));
		var_feature_isStatic.setType("boolean");

		Variable var_modifier_visibility = CSPFactoryHelper.eINSTANCE.createVariable("modifier", true, csp);
		var_modifier_visibility.setValue(__helper.getValue("modifier", "visibility"));
		var_modifier_visibility.setType("java.VisibilityKind");

		Variable var_feature_visibility = CSPFactoryHelper.eINSTANCE.createVariable("feature", true, csp);
		var_feature_visibility.setValue(__helper.getValue("feature", "visibility"));
		var_feature_visibility.setType("uml.VisibilityKind");

		Eq eq0 = new Eq();
		csp.getConstraints().add(eq0);

		Eq eq1 = new Eq();
		csp.getConstraints().add(eq1);

		JVisibility2umlVisibility jVisibility2umlVisibility2 = new JVisibility2umlVisibility();
		csp.getConstraints().add(jVisibility2umlVisibility2);

		eq0.setRuleName("MethodDec2Operation4EnumWithModifier");
		eq0.solve(var_bodyDeclaration_name, var_feature_name);

		eq1.setRuleName("MethodDec2Operation4EnumWithModifier");
		eq1.solve(var_modifier_static, var_feature_isStatic);

		jVisibility2umlVisibility2.setRuleName("MethodDec2Operation4EnumWithModifier");
		jVisibility2umlVisibility2.solve(var_modifier_visibility, var_feature_visibility);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_bodyDeclaration_name.setBound(false);
			var_modifier_static.setBound(false);
			var_modifier_visibility.setBound(false);
			eq0.solve(var_bodyDeclaration_name, var_feature_name);
			eq1.solve(var_modifier_static, var_feature_isStatic);
			jVisibility2umlVisibility2.solve(var_modifier_visibility, var_feature_visibility);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
				__helper.setValue("bodyDeclaration", "name", var_bodyDeclaration_name.getValue());
				__helper.setValue("modifier", "static", var_modifier_static.getValue());
				__helper.setValue("modifier", "visibility", var_modifier_visibility.getValue());
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

		Object[] result1_black = MethodDec2Operation4EnumWithModifierImpl
				.pattern_MethodDec2Operation4EnumWithModifier_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = MethodDec2Operation4EnumWithModifierImpl
				.pattern_MethodDec2Operation4EnumWithModifier_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = MethodDec2Operation4EnumWithModifierImpl
				.pattern_MethodDec2Operation4EnumWithModifier_24_2_matchsrctrgcontext_bindingAndBlackFFFFFBB(
						sourceMatch, targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		Operation feature = (Operation) result2_bindingAndBlack[0];
		MMethodDefinition bodyDeclaration = (MMethodDefinition) result2_bindingAndBlack[1];
		Modifier modifier = (Modifier) result2_bindingAndBlack[2];
		Enumeration umlClass = (Enumeration) result2_bindingAndBlack[3];
		EnumDeclaration classDec = (EnumDeclaration) result2_bindingAndBlack[4];

		Object[] result3_bindingAndBlack = MethodDec2Operation4EnumWithModifierImpl
				.pattern_MethodDec2Operation4EnumWithModifier_24_3_solvecsp_bindingAndBlackFBBBBBBBB(this, feature,
						bodyDeclaration, modifier, umlClass, classDec, sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[feature] = " + feature + ", " + "[bodyDeclaration] = " + bodyDeclaration + ", "
					+ "[modifier] = " + modifier + ", " + "[umlClass] = " + umlClass + ", " + "[classDec] = " + classDec
					+ ", " + "[sourceMatch] = " + sourceMatch + ", " + "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (MethodDec2Operation4EnumWithModifierImpl
				.pattern_MethodDec2Operation4EnumWithModifier_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : MethodDec2Operation4EnumWithModifierImpl
					.pattern_MethodDec2Operation4EnumWithModifier_24_5_matchcorrcontext_blackBFBBB(umlClass, classDec,
							sourceMatch, targetMatch)) {
				ASTNode2Element cd2c = (ASTNode2Element) result5_black[1];
				Object[] result5_green = MethodDec2Operation4EnumWithModifierImpl
						.pattern_MethodDec2Operation4EnumWithModifier_24_5_matchcorrcontext_greenBBBF(cd2c, sourceMatch,
								targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[3];

				Object[] result6_black = MethodDec2Operation4EnumWithModifierImpl
						.pattern_MethodDec2Operation4EnumWithModifier_24_6_createcorrespondence_blackBBBBBB(feature,
								bodyDeclaration, modifier, umlClass, classDec, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[feature] = " + feature
							+ ", " + "[bodyDeclaration] = " + bodyDeclaration + ", " + "[modifier] = " + modifier + ", "
							+ "[umlClass] = " + umlClass + ", " + "[classDec] = " + classDec + ", " + "[ccMatch] = "
							+ ccMatch + ".");
				}
				MethodDec2Operation4EnumWithModifierImpl
						.pattern_MethodDec2Operation4EnumWithModifier_24_6_createcorrespondence_greenFBFFBBB(feature,
								bodyDeclaration, modifier, ccMatch);
				//nothing Modifier2NamedElement m2f = (Modifier2NamedElement) result6_green[0];
				//nothing NamedElement2NamedElement bd2ne = (NamedElement2NamedElement) result6_green[2];
				//nothing ASTNode2Element b2e = (ASTNode2Element) result6_green[3];

				Object[] result7_black = MethodDec2Operation4EnumWithModifierImpl
						.pattern_MethodDec2Operation4EnumWithModifier_24_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				MethodDec2Operation4EnumWithModifierImpl
						.pattern_MethodDec2Operation4EnumWithModifier_24_7_addtoreturnedresult_greenBB(result, ccMatch);

			}

		} else {
		}
		return MethodDec2Operation4EnumWithModifierImpl
				.pattern_MethodDec2Operation4EnumWithModifier_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(Operation feature, MMethodDefinition bodyDeclaration, Modifier modifier,
			Enumeration umlClass, EnumDeclaration classDec, Match sourceMatch, Match targetMatch) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals

		// Create attribute variables
		Variable var_bodyDeclaration_name = CSPFactoryHelper.eINSTANCE.createVariable("bodyDeclaration.name", true,
				csp);
		var_bodyDeclaration_name.setValue(bodyDeclaration.getName());
		var_bodyDeclaration_name.setType("String");
		Variable var_feature_name = CSPFactoryHelper.eINSTANCE.createVariable("feature.name", true, csp);
		var_feature_name.setValue(feature.getName());
		var_feature_name.setType("String");
		Variable var_modifier_static = CSPFactoryHelper.eINSTANCE.createVariable("modifier.static", true, csp);
		var_modifier_static.setValue(modifier.isStatic());
		var_modifier_static.setType("Boolean");
		Variable var_feature_isStatic = CSPFactoryHelper.eINSTANCE.createVariable("feature.isStatic", true, csp);
		var_feature_isStatic.setValue(feature.isStatic());
		var_feature_isStatic.setType("Boolean");
		Variable var_modifier_visibility = CSPFactoryHelper.eINSTANCE.createVariable("modifier.visibility", true, csp);
		var_modifier_visibility.setValue(modifier.getVisibility());
		var_modifier_visibility.setType("java.VisibilityKind");
		Variable var_feature_visibility = CSPFactoryHelper.eINSTANCE.createVariable("feature.visibility", true, csp);
		var_feature_visibility.setValue(feature.getVisibility());
		var_feature_visibility.setType("uml.VisibilityKind");

		// Create unbound variables

		// Create constraints
		Eq eq = new Eq();
		Eq eq_0 = new Eq();
		JVisibility2umlVisibility jVisibility2umlVisibility = new JVisibility2umlVisibility();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(eq_0);
		csp.getConstraints().add(jVisibility2umlVisibility);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_bodyDeclaration_name, var_feature_name);
		eq_0.setRuleName("NoRuleName");
		eq_0.solve(var_modifier_static, var_feature_isStatic);
		jVisibility2umlVisibility.setRuleName("NoRuleName");
		jVisibility2umlVisibility.solve(var_modifier_visibility, var_feature_visibility);
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
	public boolean checkDEC_FWD(MMethodDefinition bodyDeclaration, Modifier modifier, EnumDeclaration classDec) {// 
		Object[] result1_black = MethodDec2Operation4EnumWithModifierImpl
				.pattern_MethodDec2Operation4EnumWithModifier_27_1_matchtggpattern_blackBBB(bodyDeclaration, modifier,
						classDec);
		if (result1_black != null) {
			return MethodDec2Operation4EnumWithModifierImpl
					.pattern_MethodDec2Operation4EnumWithModifier_27_2_expressionF();
		} else {
			return MethodDec2Operation4EnumWithModifierImpl
					.pattern_MethodDec2Operation4EnumWithModifier_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(Operation feature, Enumeration umlClass) {// 
		Object[] result1_black = MethodDec2Operation4EnumWithModifierImpl
				.pattern_MethodDec2Operation4EnumWithModifier_28_1_matchtggpattern_blackBB(feature, umlClass);
		if (result1_black != null) {
			return MethodDec2Operation4EnumWithModifierImpl
					.pattern_MethodDec2Operation4EnumWithModifier_28_2_expressionF();
		} else {
			return MethodDec2Operation4EnumWithModifierImpl
					.pattern_MethodDec2Operation4EnumWithModifier_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer,
			ASTNode2Element cd2cParameter) {

		Object[] result1_black = MethodDec2Operation4EnumWithModifierImpl
				.pattern_MethodDec2Operation4EnumWithModifier_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = MethodDec2Operation4EnumWithModifierImpl
				.pattern_MethodDec2Operation4EnumWithModifier_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : MethodDec2Operation4EnumWithModifierImpl
				.pattern_MethodDec2Operation4EnumWithModifier_29_2_isapplicablecore_blackFFFFBB(ruleEntryContainer,
						ruleResult)) {
			//nothing RuleEntryList cd2cList = (RuleEntryList) result2_black[0];
			Enumeration umlClass = (Enumeration) result2_black[1];
			ASTNode2Element cd2c = (ASTNode2Element) result2_black[2];
			EnumDeclaration classDec = (EnumDeclaration) result2_black[3];

			Object[] result3_bindingAndBlack = MethodDec2Operation4EnumWithModifierImpl
					.pattern_MethodDec2Operation4EnumWithModifier_29_3_solveCSP_bindingAndBlackFBBBBBB(this,
							isApplicableMatch, umlClass, cd2c, classDec, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[umlClass] = " + umlClass + ", "
						+ "[cd2c] = " + cd2c + ", " + "[classDec] = " + classDec + ", " + "[ruleResult] = " + ruleResult
						+ ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (MethodDec2Operation4EnumWithModifierImpl
					.pattern_MethodDec2Operation4EnumWithModifier_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = MethodDec2Operation4EnumWithModifierImpl
						.pattern_MethodDec2Operation4EnumWithModifier_29_5_checknacs_blackBBB(umlClass, cd2c, classDec);
				if (result5_black != null) {

					Object[] result6_black = MethodDec2Operation4EnumWithModifierImpl
							.pattern_MethodDec2Operation4EnumWithModifier_29_6_perform_blackBBBB(umlClass, cd2c,
									classDec, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[umlClass] = "
								+ umlClass + ", " + "[cd2c] = " + cd2c + ", " + "[classDec] = " + classDec + ", "
								+ "[ruleResult] = " + ruleResult + ".");
					}
					MethodDec2Operation4EnumWithModifierImpl
							.pattern_MethodDec2Operation4EnumWithModifier_29_6_perform_greenFFFFFFBBBB(umlClass,
									classDec, ruleResult, csp);
					//nothing Modifier2NamedElement m2f = (Modifier2NamedElement) result6_green[0];
					//nothing Operation feature = (Operation) result6_green[1];
					//nothing NamedElement2NamedElement bd2ne = (NamedElement2NamedElement) result6_green[2];
					//nothing ASTNode2Element b2e = (ASTNode2Element) result6_green[3];
					//nothing MMethodDefinition bodyDeclaration = (MMethodDefinition) result6_green[4];
					//nothing Modifier modifier = (Modifier) result6_green[5];

				} else {
				}

			} else {
			}

		}
		return MethodDec2Operation4EnumWithModifierImpl
				.pattern_MethodDec2Operation4EnumWithModifier_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, Enumeration umlClass,
			ASTNode2Element cd2c, EnumDeclaration classDec, ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables
		Variable var_bodyDeclaration_name = CSPFactoryHelper.eINSTANCE.createVariable("bodyDeclaration.name", csp);
		var_bodyDeclaration_name.setType("String");
		Variable var_feature_name = CSPFactoryHelper.eINSTANCE.createVariable("feature.name", csp);
		var_feature_name.setType("String");
		Variable var_modifier_static = CSPFactoryHelper.eINSTANCE.createVariable("modifier.static", csp);
		var_modifier_static.setType("Boolean");
		Variable var_feature_isStatic = CSPFactoryHelper.eINSTANCE.createVariable("feature.isStatic", csp);
		var_feature_isStatic.setType("Boolean");
		Variable var_modifier_visibility = CSPFactoryHelper.eINSTANCE.createVariable("modifier.visibility", csp);
		var_modifier_visibility.setType("java.VisibilityKind");
		Variable var_feature_visibility = CSPFactoryHelper.eINSTANCE.createVariable("feature.visibility", csp);
		var_feature_visibility.setType("uml.VisibilityKind");

		// Create constraints
		Eq eq = new Eq();
		Eq eq_0 = new Eq();
		JVisibility2umlVisibility jVisibility2umlVisibility = new JVisibility2umlVisibility();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(eq_0);
		csp.getConstraints().add(jVisibility2umlVisibility);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_bodyDeclaration_name, var_feature_name);
		eq_0.setRuleName("NoRuleName");
		eq_0.solve(var_modifier_static, var_feature_isStatic);
		jVisibility2umlVisibility.setRuleName("NoRuleName");
		jVisibility2umlVisibility.solve(var_modifier_visibility, var_feature_visibility);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("umlClass", umlClass);
		isApplicableMatch.registerObject("cd2c", cd2c);
		isApplicableMatch.registerObject("classDec", classDec);
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
		case RulesPackage.METHOD_DEC2_OPERATION4_ENUM_WITH_MODIFIER___IS_APPROPRIATE_FWD__MATCH_MMETHODDEFINITION_MODIFIER_ENUMDECLARATION:
			return isAppropriate_FWD((Match) arguments.get(0), (MMethodDefinition) arguments.get(1),
					(Modifier) arguments.get(2), (EnumDeclaration) arguments.get(3));
		case RulesPackage.METHOD_DEC2_OPERATION4_ENUM_WITH_MODIFIER___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.METHOD_DEC2_OPERATION4_ENUM_WITH_MODIFIER___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.METHOD_DEC2_OPERATION4_ENUM_WITH_MODIFIER___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_MMETHODDEFINITION_MODIFIER_ENUMDECLARATION:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (MMethodDefinition) arguments.get(1),
					(Modifier) arguments.get(2), (EnumDeclaration) arguments.get(3));
			return null;
		case RulesPackage.METHOD_DEC2_OPERATION4_ENUM_WITH_MODIFIER___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_MMETHODDEFINITION_MODIFIER_ENUMDECLARATION:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (MMethodDefinition) arguments.get(1),
					(Modifier) arguments.get(2), (EnumDeclaration) arguments.get(3));
		case RulesPackage.METHOD_DEC2_OPERATION4_ENUM_WITH_MODIFIER___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.METHOD_DEC2_OPERATION4_ENUM_WITH_MODIFIER___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_MMETHODDEFINITION_MODIFIER_ENUMERATION_ASTNODE2ELEMENT_ENUMDECLARATION:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (MMethodDefinition) arguments.get(1),
					(Modifier) arguments.get(2), (Enumeration) arguments.get(3), (ASTNode2Element) arguments.get(4),
					(EnumDeclaration) arguments.get(5));
		case RulesPackage.METHOD_DEC2_OPERATION4_ENUM_WITH_MODIFIER___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.METHOD_DEC2_OPERATION4_ENUM_WITH_MODIFIER___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9));
			return null;
		case RulesPackage.METHOD_DEC2_OPERATION4_ENUM_WITH_MODIFIER___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.METHOD_DEC2_OPERATION4_ENUM_WITH_MODIFIER___IS_APPROPRIATE_BWD__MATCH_OPERATION_ENUMERATION:
			return isAppropriate_BWD((Match) arguments.get(0), (Operation) arguments.get(1),
					(Enumeration) arguments.get(2));
		case RulesPackage.METHOD_DEC2_OPERATION4_ENUM_WITH_MODIFIER___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.METHOD_DEC2_OPERATION4_ENUM_WITH_MODIFIER___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.METHOD_DEC2_OPERATION4_ENUM_WITH_MODIFIER___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_OPERATION_ENUMERATION:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (Operation) arguments.get(1),
					(Enumeration) arguments.get(2));
			return null;
		case RulesPackage.METHOD_DEC2_OPERATION4_ENUM_WITH_MODIFIER___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_OPERATION_ENUMERATION:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (Operation) arguments.get(1),
					(Enumeration) arguments.get(2));
		case RulesPackage.METHOD_DEC2_OPERATION4_ENUM_WITH_MODIFIER___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.METHOD_DEC2_OPERATION4_ENUM_WITH_MODIFIER___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_OPERATION_ENUMERATION_ASTNODE2ELEMENT_ENUMDECLARATION:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (Operation) arguments.get(1),
					(Enumeration) arguments.get(2), (ASTNode2Element) arguments.get(3),
					(EnumDeclaration) arguments.get(4));
		case RulesPackage.METHOD_DEC2_OPERATION4_ENUM_WITH_MODIFIER___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.METHOD_DEC2_OPERATION4_ENUM_WITH_MODIFIER___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9));
			return null;
		case RulesPackage.METHOD_DEC2_OPERATION4_ENUM_WITH_MODIFIER___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.METHOD_DEC2_OPERATION4_ENUM_WITH_MODIFIER___IS_APPROPRIATE_BWD_EMOFLON_EDGE_938__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_938((EMoflonEdge) arguments.get(0));
		case RulesPackage.METHOD_DEC2_OPERATION4_ENUM_WITH_MODIFIER___IS_APPROPRIATE_FWD_EMOFLON_EDGE_961__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_961((EMoflonEdge) arguments.get(0));
		case RulesPackage.METHOD_DEC2_OPERATION4_ENUM_WITH_MODIFIER___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.METHOD_DEC2_OPERATION4_ENUM_WITH_MODIFIER___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.METHOD_DEC2_OPERATION4_ENUM_WITH_MODIFIER___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.METHOD_DEC2_OPERATION4_ENUM_WITH_MODIFIER___IS_APPLICABLE_SOLVE_CSP_CC__OPERATION_MMETHODDEFINITION_MODIFIER_ENUMERATION_ENUMDECLARATION_MATCH_MATCH:
			return isApplicable_solveCsp_CC((Operation) arguments.get(0), (MMethodDefinition) arguments.get(1),
					(Modifier) arguments.get(2), (Enumeration) arguments.get(3), (EnumDeclaration) arguments.get(4),
					(Match) arguments.get(5), (Match) arguments.get(6));
		case RulesPackage.METHOD_DEC2_OPERATION4_ENUM_WITH_MODIFIER___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.METHOD_DEC2_OPERATION4_ENUM_WITH_MODIFIER___CHECK_DEC_FWD__MMETHODDEFINITION_MODIFIER_ENUMDECLARATION:
			return checkDEC_FWD((MMethodDefinition) arguments.get(0), (Modifier) arguments.get(1),
					(EnumDeclaration) arguments.get(2));
		case RulesPackage.METHOD_DEC2_OPERATION4_ENUM_WITH_MODIFIER___CHECK_DEC_BWD__OPERATION_ENUMERATION:
			return checkDEC_BWD((Operation) arguments.get(0), (Enumeration) arguments.get(1));
		case RulesPackage.METHOD_DEC2_OPERATION4_ENUM_WITH_MODIFIER___GENERATE_MODEL__RULEENTRYCONTAINER_ASTNODE2ELEMENT:
			return generateModel((RuleEntryContainer) arguments.get(0), (ASTNode2Element) arguments.get(1));
		case RulesPackage.METHOD_DEC2_OPERATION4_ENUM_WITH_MODIFIER___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_ENUMERATION_ASTNODE2ELEMENT_ENUMDECLARATION_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (Enumeration) arguments.get(1),
					(ASTNode2Element) arguments.get(2), (EnumDeclaration) arguments.get(3),
					(ModelgeneratorRuleResult) arguments.get(4));
		case RulesPackage.METHOD_DEC2_OPERATION4_ENUM_WITH_MODIFIER___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_MethodDec2Operation4EnumWithModifier_0_1_initialbindings_blackBBBBB(
			MethodDec2Operation4EnumWithModifier _this, Match match, MMethodDefinition bodyDeclaration,
			Modifier modifier, EnumDeclaration classDec) {
		return new Object[] { _this, match, bodyDeclaration, modifier, classDec };
	}

	public static final Object[] pattern_MethodDec2Operation4EnumWithModifier_0_2_SolveCSP_bindingFBBBBB(
			MethodDec2Operation4EnumWithModifier _this, Match match, MMethodDefinition bodyDeclaration,
			Modifier modifier, EnumDeclaration classDec) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, bodyDeclaration, modifier, classDec);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, bodyDeclaration, modifier, classDec };
		}
		return null;
	}

	public static final Object[] pattern_MethodDec2Operation4EnumWithModifier_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MethodDec2Operation4EnumWithModifier_0_2_SolveCSP_bindingAndBlackFBBBBB(
			MethodDec2Operation4EnumWithModifier _this, Match match, MMethodDefinition bodyDeclaration,
			Modifier modifier, EnumDeclaration classDec) {
		Object[] result_pattern_MethodDec2Operation4EnumWithModifier_0_2_SolveCSP_binding = pattern_MethodDec2Operation4EnumWithModifier_0_2_SolveCSP_bindingFBBBBB(
				_this, match, bodyDeclaration, modifier, classDec);
		if (result_pattern_MethodDec2Operation4EnumWithModifier_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_MethodDec2Operation4EnumWithModifier_0_2_SolveCSP_binding[0];

			Object[] result_pattern_MethodDec2Operation4EnumWithModifier_0_2_SolveCSP_black = pattern_MethodDec2Operation4EnumWithModifier_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_MethodDec2Operation4EnumWithModifier_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, bodyDeclaration, modifier, classDec };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodDec2Operation4EnumWithModifier_0_3_CheckCSP_expressionFBB(
			MethodDec2Operation4EnumWithModifier _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodDec2Operation4EnumWithModifier_0_4_collectelementstobetranslated_blackBBBB(
			Match match, MMethodDefinition bodyDeclaration, Modifier modifier, EnumDeclaration classDec) {
		return new Object[] { match, bodyDeclaration, modifier, classDec };
	}

	public static final Object[] pattern_MethodDec2Operation4EnumWithModifier_0_4_collectelementstobetranslated_greenBBBBFFFF(
			Match match, MMethodDefinition bodyDeclaration, Modifier modifier, EnumDeclaration classDec) {
		EMoflonEdge bodyDeclaration__modifier____modifier = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge modifier__bodyDeclaration____bodyDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge classDec__bodyDeclaration____bodyDeclarations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge bodyDeclaration__classDec____abstractTypeDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(bodyDeclaration);
		match.getToBeTranslatedNodes().add(modifier);
		String bodyDeclaration__modifier____modifier_name_prime = "modifier";
		String modifier__bodyDeclaration____bodyDeclaration_name_prime = "bodyDeclaration";
		String classDec__bodyDeclaration____bodyDeclarations_name_prime = "bodyDeclarations";
		String bodyDeclaration__classDec____abstractTypeDeclaration_name_prime = "abstractTypeDeclaration";
		bodyDeclaration__modifier____modifier.setSrc(bodyDeclaration);
		bodyDeclaration__modifier____modifier.setTrg(modifier);
		match.getToBeTranslatedEdges().add(bodyDeclaration__modifier____modifier);
		modifier__bodyDeclaration____bodyDeclaration.setSrc(modifier);
		modifier__bodyDeclaration____bodyDeclaration.setTrg(bodyDeclaration);
		match.getToBeTranslatedEdges().add(modifier__bodyDeclaration____bodyDeclaration);
		classDec__bodyDeclaration____bodyDeclarations.setSrc(classDec);
		classDec__bodyDeclaration____bodyDeclarations.setTrg(bodyDeclaration);
		match.getToBeTranslatedEdges().add(classDec__bodyDeclaration____bodyDeclarations);
		bodyDeclaration__classDec____abstractTypeDeclaration.setSrc(bodyDeclaration);
		bodyDeclaration__classDec____abstractTypeDeclaration.setTrg(classDec);
		match.getToBeTranslatedEdges().add(bodyDeclaration__classDec____abstractTypeDeclaration);
		bodyDeclaration__modifier____modifier.setName(bodyDeclaration__modifier____modifier_name_prime);
		modifier__bodyDeclaration____bodyDeclaration.setName(modifier__bodyDeclaration____bodyDeclaration_name_prime);
		classDec__bodyDeclaration____bodyDeclarations.setName(classDec__bodyDeclaration____bodyDeclarations_name_prime);
		bodyDeclaration__classDec____abstractTypeDeclaration
				.setName(bodyDeclaration__classDec____abstractTypeDeclaration_name_prime);
		return new Object[] { match, bodyDeclaration, modifier, classDec, bodyDeclaration__modifier____modifier,
				modifier__bodyDeclaration____bodyDeclaration, classDec__bodyDeclaration____bodyDeclarations,
				bodyDeclaration__classDec____abstractTypeDeclaration };
	}

	public static final Object[] pattern_MethodDec2Operation4EnumWithModifier_0_5_collectcontextelements_blackBBBB(
			Match match, MMethodDefinition bodyDeclaration, Modifier modifier, EnumDeclaration classDec) {
		return new Object[] { match, bodyDeclaration, modifier, classDec };
	}

	public static final Object[] pattern_MethodDec2Operation4EnumWithModifier_0_5_collectcontextelements_greenBB(
			Match match, EnumDeclaration classDec) {
		match.getContextNodes().add(classDec);
		return new Object[] { match, classDec };
	}

	public static final void pattern_MethodDec2Operation4EnumWithModifier_0_6_registerobjectstomatch_expressionBBBBB(
			MethodDec2Operation4EnumWithModifier _this, Match match, MMethodDefinition bodyDeclaration,
			Modifier modifier, EnumDeclaration classDec) {
		_this.registerObjectsToMatch_FWD(match, bodyDeclaration, modifier, classDec);

	}

	public static final boolean pattern_MethodDec2Operation4EnumWithModifier_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_MethodDec2Operation4EnumWithModifier_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_MethodDec2Operation4EnumWithModifier_1_1_performtransformation_bindingFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("bodyDeclaration");
		EObject _localVariable_1 = isApplicableMatch.getObject("modifier");
		EObject _localVariable_2 = isApplicableMatch.getObject("umlClass");
		EObject _localVariable_3 = isApplicableMatch.getObject("cd2c");
		EObject _localVariable_4 = isApplicableMatch.getObject("classDec");
		EObject tmpBodyDeclaration = _localVariable_0;
		EObject tmpModifier = _localVariable_1;
		EObject tmpUmlClass = _localVariable_2;
		EObject tmpCd2c = _localVariable_3;
		EObject tmpClassDec = _localVariable_4;
		if (tmpBodyDeclaration instanceof MMethodDefinition) {
			MMethodDefinition bodyDeclaration = (MMethodDefinition) tmpBodyDeclaration;
			if (tmpModifier instanceof Modifier) {
				Modifier modifier = (Modifier) tmpModifier;
				if (tmpUmlClass instanceof Enumeration) {
					Enumeration umlClass = (Enumeration) tmpUmlClass;
					if (tmpCd2c instanceof ASTNode2Element) {
						ASTNode2Element cd2c = (ASTNode2Element) tmpCd2c;
						if (tmpClassDec instanceof EnumDeclaration) {
							EnumDeclaration classDec = (EnumDeclaration) tmpClassDec;
							return new Object[] { bodyDeclaration, modifier, umlClass, cd2c, classDec,
									isApplicableMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodDec2Operation4EnumWithModifier_1_1_performtransformation_blackBBBBBFBB(
			MMethodDefinition bodyDeclaration, Modifier modifier, Enumeration umlClass, ASTNode2Element cd2c,
			EnumDeclaration classDec, MethodDec2Operation4EnumWithModifier _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { bodyDeclaration, modifier, umlClass, cd2c, classDec, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodDec2Operation4EnumWithModifier_1_1_performtransformation_bindingAndBlackFFFFFFBB(
			MethodDec2Operation4EnumWithModifier _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_MethodDec2Operation4EnumWithModifier_1_1_performtransformation_binding = pattern_MethodDec2Operation4EnumWithModifier_1_1_performtransformation_bindingFFFFFB(
				isApplicableMatch);
		if (result_pattern_MethodDec2Operation4EnumWithModifier_1_1_performtransformation_binding != null) {
			MMethodDefinition bodyDeclaration = (MMethodDefinition) result_pattern_MethodDec2Operation4EnumWithModifier_1_1_performtransformation_binding[0];
			Modifier modifier = (Modifier) result_pattern_MethodDec2Operation4EnumWithModifier_1_1_performtransformation_binding[1];
			Enumeration umlClass = (Enumeration) result_pattern_MethodDec2Operation4EnumWithModifier_1_1_performtransformation_binding[2];
			ASTNode2Element cd2c = (ASTNode2Element) result_pattern_MethodDec2Operation4EnumWithModifier_1_1_performtransformation_binding[3];
			EnumDeclaration classDec = (EnumDeclaration) result_pattern_MethodDec2Operation4EnumWithModifier_1_1_performtransformation_binding[4];

			Object[] result_pattern_MethodDec2Operation4EnumWithModifier_1_1_performtransformation_black = pattern_MethodDec2Operation4EnumWithModifier_1_1_performtransformation_blackBBBBBFBB(
					bodyDeclaration, modifier, umlClass, cd2c, classDec, _this, isApplicableMatch);
			if (result_pattern_MethodDec2Operation4EnumWithModifier_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_MethodDec2Operation4EnumWithModifier_1_1_performtransformation_black[5];

				return new Object[] { bodyDeclaration, modifier, umlClass, cd2c, classDec, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodDec2Operation4EnumWithModifier_1_1_performtransformation_greenFFFFBBBB(
			MMethodDefinition bodyDeclaration, Modifier modifier, Enumeration umlClass, CSP csp) {
		Modifier2NamedElement m2f = UmlFactory.eINSTANCE.createModifier2NamedElement();
		Operation feature = UMLFactory.eINSTANCE.createOperation();
		NamedElement2NamedElement bd2ne = UmlFactory.eINSTANCE.createNamedElement2NamedElement();
		ASTNode2Element b2e = UmlFactory.eINSTANCE.createASTNode2Element();
		Object _localVariable_0 = csp.getValue("feature", "name");
		Object _localVariable_1 = csp.getValue("feature", "isStatic");
		Object _localVariable_2 = csp.getValue("feature", "visibility");
		m2f.setSource(modifier);
		umlClass.getOwnedOperations().add(feature);
		m2f.setTarget(feature);
		bd2ne.setSource(bodyDeclaration);
		bd2ne.setTarget(feature);
		b2e.setSource(bodyDeclaration);
		b2e.setTarget(feature);
		String feature_name_prime = (String) _localVariable_0;
		boolean feature_isStatic_prime = (boolean) _localVariable_1;
		VisibilityKind feature_visibility_prime = (VisibilityKind) _localVariable_2;
		feature.setName(feature_name_prime);
		feature.setIsStatic(Boolean.valueOf(feature_isStatic_prime));
		feature.setVisibility(feature_visibility_prime);
		return new Object[] { m2f, feature, bd2ne, b2e, bodyDeclaration, modifier, umlClass, csp };
	}

	public static final Object[] pattern_MethodDec2Operation4EnumWithModifier_1_2_collecttranslatedelements_blackBBBBBB(
			Modifier2NamedElement m2f, Operation feature, NamedElement2NamedElement bd2ne, ASTNode2Element b2e,
			MMethodDefinition bodyDeclaration, Modifier modifier) {
		return new Object[] { m2f, feature, bd2ne, b2e, bodyDeclaration, modifier };
	}

	public static final Object[] pattern_MethodDec2Operation4EnumWithModifier_1_2_collecttranslatedelements_greenFBBBBBB(
			Modifier2NamedElement m2f, Operation feature, NamedElement2NamedElement bd2ne, ASTNode2Element b2e,
			MMethodDefinition bodyDeclaration, Modifier modifier) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(m2f);
		ruleresult.getCreatedElements().add(feature);
		ruleresult.getCreatedLinkElements().add(bd2ne);
		ruleresult.getCreatedLinkElements().add(b2e);
		ruleresult.getTranslatedElements().add(bodyDeclaration);
		ruleresult.getTranslatedElements().add(modifier);
		return new Object[] { ruleresult, m2f, feature, bd2ne, b2e, bodyDeclaration, modifier };
	}

	public static final Object[] pattern_MethodDec2Operation4EnumWithModifier_1_3_bookkeepingforedges_blackBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject m2f, EObject feature, EObject bd2ne, EObject b2e,
			EObject bodyDeclaration, EObject modifier, EObject umlClass, EObject cd2c, EObject classDec) {
		if (!m2f.equals(modifier)) {
			if (!m2f.equals(umlClass)) {
				if (!feature.equals(m2f)) {
					if (!feature.equals(modifier)) {
						if (!feature.equals(umlClass)) {
							if (!bd2ne.equals(m2f)) {
								if (!bd2ne.equals(feature)) {
									if (!bd2ne.equals(bodyDeclaration)) {
										if (!bd2ne.equals(modifier)) {
											if (!bd2ne.equals(umlClass)) {
												if (!bd2ne.equals(cd2c)) {
													if (!bd2ne.equals(classDec)) {
														if (!b2e.equals(m2f)) {
															if (!b2e.equals(feature)) {
																if (!b2e.equals(bd2ne)) {
																	if (!b2e.equals(bodyDeclaration)) {
																		if (!b2e.equals(modifier)) {
																			if (!b2e.equals(umlClass)) {
																				if (!b2e.equals(cd2c)) {
																					if (!b2e.equals(classDec)) {
																						if (!bodyDeclaration
																								.equals(m2f)) {
																							if (!bodyDeclaration
																									.equals(feature)) {
																								if (!bodyDeclaration
																										.equals(modifier)) {
																									if (!bodyDeclaration
																											.equals(umlClass)) {
																										if (!bodyDeclaration
																												.equals(cd2c)) {
																											if (!bodyDeclaration
																													.equals(classDec)) {
																												if (!modifier
																														.equals(umlClass)) {
																													if (!cd2c
																															.equals(m2f)) {
																														if (!cd2c
																																.equals(feature)) {
																															if (!cd2c
																																	.equals(modifier)) {
																																if (!cd2c
																																		.equals(umlClass)) {
																																	if (!cd2c
																																			.equals(classDec)) {
																																		if (!classDec
																																				.equals(m2f)) {
																																			if (!classDec
																																					.equals(feature)) {
																																				if (!classDec
																																						.equals(modifier)) {
																																					if (!classDec
																																							.equals(umlClass)) {
																																						return new Object[] {
																																								ruleresult,
																																								m2f,
																																								feature,
																																								bd2ne,
																																								b2e,
																																								bodyDeclaration,
																																								modifier,
																																								umlClass,
																																								cd2c,
																																								classDec };
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_MethodDec2Operation4EnumWithModifier_1_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject m2f, EObject feature, EObject bd2ne, EObject b2e,
			EObject bodyDeclaration, EObject modifier, EObject umlClass, EObject classDec) {
		EMoflonEdge umlClass__feature____ownedOperation = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge feature__umlClass____datatype = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge bd2ne__bodyDeclaration____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge bodyDeclaration__modifier____modifier = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge modifier__bodyDeclaration____bodyDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge m2f__feature____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge bd2ne__feature____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2e__bodyDeclaration____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge classDec__bodyDeclaration____bodyDeclarations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge bodyDeclaration__classDec____abstractTypeDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge m2f__modifier____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2e__feature____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "MethodDec2Operation4EnumWithModifier";
		String umlClass__feature____ownedOperation_name_prime = "ownedOperation";
		String feature__umlClass____datatype_name_prime = "datatype";
		String bd2ne__bodyDeclaration____source_name_prime = "source";
		String bodyDeclaration__modifier____modifier_name_prime = "modifier";
		String modifier__bodyDeclaration____bodyDeclaration_name_prime = "bodyDeclaration";
		String m2f__feature____target_name_prime = "target";
		String bd2ne__feature____target_name_prime = "target";
		String b2e__bodyDeclaration____source_name_prime = "source";
		String classDec__bodyDeclaration____bodyDeclarations_name_prime = "bodyDeclarations";
		String bodyDeclaration__classDec____abstractTypeDeclaration_name_prime = "abstractTypeDeclaration";
		String m2f__modifier____source_name_prime = "source";
		String b2e__feature____target_name_prime = "target";
		umlClass__feature____ownedOperation.setSrc(umlClass);
		umlClass__feature____ownedOperation.setTrg(feature);
		ruleresult.getCreatedEdges().add(umlClass__feature____ownedOperation);
		feature__umlClass____datatype.setSrc(feature);
		feature__umlClass____datatype.setTrg(umlClass);
		ruleresult.getCreatedEdges().add(feature__umlClass____datatype);
		bd2ne__bodyDeclaration____source.setSrc(bd2ne);
		bd2ne__bodyDeclaration____source.setTrg(bodyDeclaration);
		ruleresult.getCreatedEdges().add(bd2ne__bodyDeclaration____source);
		bodyDeclaration__modifier____modifier.setSrc(bodyDeclaration);
		bodyDeclaration__modifier____modifier.setTrg(modifier);
		ruleresult.getTranslatedEdges().add(bodyDeclaration__modifier____modifier);
		modifier__bodyDeclaration____bodyDeclaration.setSrc(modifier);
		modifier__bodyDeclaration____bodyDeclaration.setTrg(bodyDeclaration);
		ruleresult.getTranslatedEdges().add(modifier__bodyDeclaration____bodyDeclaration);
		m2f__feature____target.setSrc(m2f);
		m2f__feature____target.setTrg(feature);
		ruleresult.getCreatedEdges().add(m2f__feature____target);
		bd2ne__feature____target.setSrc(bd2ne);
		bd2ne__feature____target.setTrg(feature);
		ruleresult.getCreatedEdges().add(bd2ne__feature____target);
		b2e__bodyDeclaration____source.setSrc(b2e);
		b2e__bodyDeclaration____source.setTrg(bodyDeclaration);
		ruleresult.getCreatedEdges().add(b2e__bodyDeclaration____source);
		classDec__bodyDeclaration____bodyDeclarations.setSrc(classDec);
		classDec__bodyDeclaration____bodyDeclarations.setTrg(bodyDeclaration);
		ruleresult.getTranslatedEdges().add(classDec__bodyDeclaration____bodyDeclarations);
		bodyDeclaration__classDec____abstractTypeDeclaration.setSrc(bodyDeclaration);
		bodyDeclaration__classDec____abstractTypeDeclaration.setTrg(classDec);
		ruleresult.getTranslatedEdges().add(bodyDeclaration__classDec____abstractTypeDeclaration);
		m2f__modifier____source.setSrc(m2f);
		m2f__modifier____source.setTrg(modifier);
		ruleresult.getCreatedEdges().add(m2f__modifier____source);
		b2e__feature____target.setSrc(b2e);
		b2e__feature____target.setTrg(feature);
		ruleresult.getCreatedEdges().add(b2e__feature____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		umlClass__feature____ownedOperation.setName(umlClass__feature____ownedOperation_name_prime);
		feature__umlClass____datatype.setName(feature__umlClass____datatype_name_prime);
		bd2ne__bodyDeclaration____source.setName(bd2ne__bodyDeclaration____source_name_prime);
		bodyDeclaration__modifier____modifier.setName(bodyDeclaration__modifier____modifier_name_prime);
		modifier__bodyDeclaration____bodyDeclaration.setName(modifier__bodyDeclaration____bodyDeclaration_name_prime);
		m2f__feature____target.setName(m2f__feature____target_name_prime);
		bd2ne__feature____target.setName(bd2ne__feature____target_name_prime);
		b2e__bodyDeclaration____source.setName(b2e__bodyDeclaration____source_name_prime);
		classDec__bodyDeclaration____bodyDeclarations.setName(classDec__bodyDeclaration____bodyDeclarations_name_prime);
		bodyDeclaration__classDec____abstractTypeDeclaration
				.setName(bodyDeclaration__classDec____abstractTypeDeclaration_name_prime);
		m2f__modifier____source.setName(m2f__modifier____source_name_prime);
		b2e__feature____target.setName(b2e__feature____target_name_prime);
		return new Object[] { ruleresult, m2f, feature, bd2ne, b2e, bodyDeclaration, modifier, umlClass, classDec,
				umlClass__feature____ownedOperation, feature__umlClass____datatype, bd2ne__bodyDeclaration____source,
				bodyDeclaration__modifier____modifier, modifier__bodyDeclaration____bodyDeclaration,
				m2f__feature____target, bd2ne__feature____target, b2e__bodyDeclaration____source,
				classDec__bodyDeclaration____bodyDeclarations, bodyDeclaration__classDec____abstractTypeDeclaration,
				m2f__modifier____source, b2e__feature____target };
	}

	public static final void pattern_MethodDec2Operation4EnumWithModifier_1_5_registerobjects_expressionBBBBBBBBBBB(
			MethodDec2Operation4EnumWithModifier _this, PerformRuleResult ruleresult, EObject m2f, EObject feature,
			EObject bd2ne, EObject b2e, EObject bodyDeclaration, EObject modifier, EObject umlClass, EObject cd2c,
			EObject classDec) {
		_this.registerObjects_FWD(ruleresult, m2f, feature, bd2ne, b2e, bodyDeclaration, modifier, umlClass, cd2c,
				classDec);

	}

	public static final PerformRuleResult pattern_MethodDec2Operation4EnumWithModifier_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_MethodDec2Operation4EnumWithModifier_2_1_preparereturnvalue_bindingFB(
			MethodDec2Operation4EnumWithModifier _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_MethodDec2Operation4EnumWithModifier_2_1_preparereturnvalue_blackFBB(
			EClass eClass, MethodDec2Operation4EnumWithModifier _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_MethodDec2Operation4EnumWithModifier_2_1_preparereturnvalue_bindingAndBlackFFB(
			MethodDec2Operation4EnumWithModifier _this) {
		Object[] result_pattern_MethodDec2Operation4EnumWithModifier_2_1_preparereturnvalue_binding = pattern_MethodDec2Operation4EnumWithModifier_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_MethodDec2Operation4EnumWithModifier_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_MethodDec2Operation4EnumWithModifier_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_MethodDec2Operation4EnumWithModifier_2_1_preparereturnvalue_black = pattern_MethodDec2Operation4EnumWithModifier_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_MethodDec2Operation4EnumWithModifier_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_MethodDec2Operation4EnumWithModifier_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodDec2Operation4EnumWithModifier_2_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "MethodDec2Operation4EnumWithModifier";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_MethodDec2Operation4EnumWithModifier_2_2_corematch_bindingFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("bodyDeclaration");
		EObject _localVariable_1 = match.getObject("modifier");
		EObject _localVariable_2 = match.getObject("classDec");
		EObject tmpBodyDeclaration = _localVariable_0;
		EObject tmpModifier = _localVariable_1;
		EObject tmpClassDec = _localVariable_2;
		if (tmpBodyDeclaration instanceof MMethodDefinition) {
			MMethodDefinition bodyDeclaration = (MMethodDefinition) tmpBodyDeclaration;
			if (tmpModifier instanceof Modifier) {
				Modifier modifier = (Modifier) tmpModifier;
				if (tmpClassDec instanceof EnumDeclaration) {
					EnumDeclaration classDec = (EnumDeclaration) tmpClassDec;
					return new Object[] { bodyDeclaration, modifier, classDec, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_MethodDec2Operation4EnumWithModifier_2_2_corematch_blackBBFFBB(
			MMethodDefinition bodyDeclaration, Modifier modifier, EnumDeclaration classDec, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (ASTNode2Element cd2c : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(classDec,
				ASTNode2Element.class, "source")) {
			Element tmpUmlClass = cd2c.getTarget();
			if (tmpUmlClass instanceof Enumeration) {
				Enumeration umlClass = (Enumeration) tmpUmlClass;
				_result.add(new Object[] { bodyDeclaration, modifier, umlClass, cd2c, classDec, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_MethodDec2Operation4EnumWithModifier_2_3_findcontext_blackBBBBB(
			MMethodDefinition bodyDeclaration, Modifier modifier, Enumeration umlClass, ASTNode2Element cd2c,
			EnumDeclaration classDec) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (classDec.equals(cd2c.getSource())) {
			if (modifier.equals(bodyDeclaration.getModifier())) {
				if (umlClass.equals(cd2c.getTarget())) {
					if (classDec.getBodyDeclarations().contains(bodyDeclaration)) {
						_result.add(new Object[] { bodyDeclaration, modifier, umlClass, cd2c, classDec });
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_MethodDec2Operation4EnumWithModifier_2_3_findcontext_greenBBBBBFFFFFFF(
			MMethodDefinition bodyDeclaration, Modifier modifier, Enumeration umlClass, ASTNode2Element cd2c,
			EnumDeclaration classDec) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge cd2c__classDec____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge bodyDeclaration__modifier____modifier = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge modifier__bodyDeclaration____bodyDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge cd2c__umlClass____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge classDec__bodyDeclaration____bodyDeclarations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge bodyDeclaration__classDec____abstractTypeDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String cd2c__classDec____source_name_prime = "source";
		String bodyDeclaration__modifier____modifier_name_prime = "modifier";
		String modifier__bodyDeclaration____bodyDeclaration_name_prime = "bodyDeclaration";
		String cd2c__umlClass____target_name_prime = "target";
		String classDec__bodyDeclaration____bodyDeclarations_name_prime = "bodyDeclarations";
		String bodyDeclaration__classDec____abstractTypeDeclaration_name_prime = "abstractTypeDeclaration";
		isApplicableMatch.getAllContextElements().add(bodyDeclaration);
		isApplicableMatch.getAllContextElements().add(modifier);
		isApplicableMatch.getAllContextElements().add(umlClass);
		isApplicableMatch.getAllContextElements().add(cd2c);
		isApplicableMatch.getAllContextElements().add(classDec);
		cd2c__classDec____source.setSrc(cd2c);
		cd2c__classDec____source.setTrg(classDec);
		isApplicableMatch.getAllContextElements().add(cd2c__classDec____source);
		bodyDeclaration__modifier____modifier.setSrc(bodyDeclaration);
		bodyDeclaration__modifier____modifier.setTrg(modifier);
		isApplicableMatch.getAllContextElements().add(bodyDeclaration__modifier____modifier);
		modifier__bodyDeclaration____bodyDeclaration.setSrc(modifier);
		modifier__bodyDeclaration____bodyDeclaration.setTrg(bodyDeclaration);
		isApplicableMatch.getAllContextElements().add(modifier__bodyDeclaration____bodyDeclaration);
		cd2c__umlClass____target.setSrc(cd2c);
		cd2c__umlClass____target.setTrg(umlClass);
		isApplicableMatch.getAllContextElements().add(cd2c__umlClass____target);
		classDec__bodyDeclaration____bodyDeclarations.setSrc(classDec);
		classDec__bodyDeclaration____bodyDeclarations.setTrg(bodyDeclaration);
		isApplicableMatch.getAllContextElements().add(classDec__bodyDeclaration____bodyDeclarations);
		bodyDeclaration__classDec____abstractTypeDeclaration.setSrc(bodyDeclaration);
		bodyDeclaration__classDec____abstractTypeDeclaration.setTrg(classDec);
		isApplicableMatch.getAllContextElements().add(bodyDeclaration__classDec____abstractTypeDeclaration);
		cd2c__classDec____source.setName(cd2c__classDec____source_name_prime);
		bodyDeclaration__modifier____modifier.setName(bodyDeclaration__modifier____modifier_name_prime);
		modifier__bodyDeclaration____bodyDeclaration.setName(modifier__bodyDeclaration____bodyDeclaration_name_prime);
		cd2c__umlClass____target.setName(cd2c__umlClass____target_name_prime);
		classDec__bodyDeclaration____bodyDeclarations.setName(classDec__bodyDeclaration____bodyDeclarations_name_prime);
		bodyDeclaration__classDec____abstractTypeDeclaration
				.setName(bodyDeclaration__classDec____abstractTypeDeclaration_name_prime);
		return new Object[] { bodyDeclaration, modifier, umlClass, cd2c, classDec, isApplicableMatch,
				cd2c__classDec____source, bodyDeclaration__modifier____modifier,
				modifier__bodyDeclaration____bodyDeclaration, cd2c__umlClass____target,
				classDec__bodyDeclaration____bodyDeclarations, bodyDeclaration__classDec____abstractTypeDeclaration };
	}

	public static final Object[] pattern_MethodDec2Operation4EnumWithModifier_2_4_solveCSP_bindingFBBBBBBB(
			MethodDec2Operation4EnumWithModifier _this, IsApplicableMatch isApplicableMatch,
			MMethodDefinition bodyDeclaration, Modifier modifier, Enumeration umlClass, ASTNode2Element cd2c,
			EnumDeclaration classDec) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, bodyDeclaration, modifier, umlClass,
				cd2c, classDec);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, bodyDeclaration, modifier, umlClass, cd2c, classDec };
		}
		return null;
	}

	public static final Object[] pattern_MethodDec2Operation4EnumWithModifier_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MethodDec2Operation4EnumWithModifier_2_4_solveCSP_bindingAndBlackFBBBBBBB(
			MethodDec2Operation4EnumWithModifier _this, IsApplicableMatch isApplicableMatch,
			MMethodDefinition bodyDeclaration, Modifier modifier, Enumeration umlClass, ASTNode2Element cd2c,
			EnumDeclaration classDec) {
		Object[] result_pattern_MethodDec2Operation4EnumWithModifier_2_4_solveCSP_binding = pattern_MethodDec2Operation4EnumWithModifier_2_4_solveCSP_bindingFBBBBBBB(
				_this, isApplicableMatch, bodyDeclaration, modifier, umlClass, cd2c, classDec);
		if (result_pattern_MethodDec2Operation4EnumWithModifier_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_MethodDec2Operation4EnumWithModifier_2_4_solveCSP_binding[0];

			Object[] result_pattern_MethodDec2Operation4EnumWithModifier_2_4_solveCSP_black = pattern_MethodDec2Operation4EnumWithModifier_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_MethodDec2Operation4EnumWithModifier_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, bodyDeclaration, modifier, umlClass, cd2c,
						classDec };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodDec2Operation4EnumWithModifier_2_5_checkCSP_expressionFBB(
			MethodDec2Operation4EnumWithModifier _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodDec2Operation4EnumWithModifier_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_MethodDec2Operation4EnumWithModifier_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "MethodDec2Operation4EnumWithModifier";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_MethodDec2Operation4EnumWithModifier_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_MethodDec2Operation4EnumWithModifier_10_1_initialbindings_blackBBBB(
			MethodDec2Operation4EnumWithModifier _this, Match match, Operation feature, Enumeration umlClass) {
		return new Object[] { _this, match, feature, umlClass };
	}

	public static final Object[] pattern_MethodDec2Operation4EnumWithModifier_10_2_SolveCSP_bindingFBBBB(
			MethodDec2Operation4EnumWithModifier _this, Match match, Operation feature, Enumeration umlClass) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, feature, umlClass);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, feature, umlClass };
		}
		return null;
	}

	public static final Object[] pattern_MethodDec2Operation4EnumWithModifier_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MethodDec2Operation4EnumWithModifier_10_2_SolveCSP_bindingAndBlackFBBBB(
			MethodDec2Operation4EnumWithModifier _this, Match match, Operation feature, Enumeration umlClass) {
		Object[] result_pattern_MethodDec2Operation4EnumWithModifier_10_2_SolveCSP_binding = pattern_MethodDec2Operation4EnumWithModifier_10_2_SolveCSP_bindingFBBBB(
				_this, match, feature, umlClass);
		if (result_pattern_MethodDec2Operation4EnumWithModifier_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_MethodDec2Operation4EnumWithModifier_10_2_SolveCSP_binding[0];

			Object[] result_pattern_MethodDec2Operation4EnumWithModifier_10_2_SolveCSP_black = pattern_MethodDec2Operation4EnumWithModifier_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_MethodDec2Operation4EnumWithModifier_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, feature, umlClass };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodDec2Operation4EnumWithModifier_10_3_CheckCSP_expressionFBB(
			MethodDec2Operation4EnumWithModifier _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodDec2Operation4EnumWithModifier_10_4_collectelementstobetranslated_blackBBB(
			Match match, Operation feature, Enumeration umlClass) {
		return new Object[] { match, feature, umlClass };
	}

	public static final Object[] pattern_MethodDec2Operation4EnumWithModifier_10_4_collectelementstobetranslated_greenBBBFF(
			Match match, Operation feature, Enumeration umlClass) {
		EMoflonEdge umlClass__feature____ownedOperation = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge feature__umlClass____datatype = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(feature);
		String umlClass__feature____ownedOperation_name_prime = "ownedOperation";
		String feature__umlClass____datatype_name_prime = "datatype";
		umlClass__feature____ownedOperation.setSrc(umlClass);
		umlClass__feature____ownedOperation.setTrg(feature);
		match.getToBeTranslatedEdges().add(umlClass__feature____ownedOperation);
		feature__umlClass____datatype.setSrc(feature);
		feature__umlClass____datatype.setTrg(umlClass);
		match.getToBeTranslatedEdges().add(feature__umlClass____datatype);
		umlClass__feature____ownedOperation.setName(umlClass__feature____ownedOperation_name_prime);
		feature__umlClass____datatype.setName(feature__umlClass____datatype_name_prime);
		return new Object[] { match, feature, umlClass, umlClass__feature____ownedOperation,
				feature__umlClass____datatype };
	}

	public static final Object[] pattern_MethodDec2Operation4EnumWithModifier_10_5_collectcontextelements_blackBBB(
			Match match, Operation feature, Enumeration umlClass) {
		return new Object[] { match, feature, umlClass };
	}

	public static final Object[] pattern_MethodDec2Operation4EnumWithModifier_10_5_collectcontextelements_greenBB(
			Match match, Enumeration umlClass) {
		match.getContextNodes().add(umlClass);
		return new Object[] { match, umlClass };
	}

	public static final void pattern_MethodDec2Operation4EnumWithModifier_10_6_registerobjectstomatch_expressionBBBB(
			MethodDec2Operation4EnumWithModifier _this, Match match, Operation feature, Enumeration umlClass) {
		_this.registerObjectsToMatch_BWD(match, feature, umlClass);

	}

	public static final boolean pattern_MethodDec2Operation4EnumWithModifier_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_MethodDec2Operation4EnumWithModifier_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_MethodDec2Operation4EnumWithModifier_11_1_performtransformation_bindingFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("feature");
		EObject _localVariable_1 = isApplicableMatch.getObject("umlClass");
		EObject _localVariable_2 = isApplicableMatch.getObject("cd2c");
		EObject _localVariable_3 = isApplicableMatch.getObject("classDec");
		EObject tmpFeature = _localVariable_0;
		EObject tmpUmlClass = _localVariable_1;
		EObject tmpCd2c = _localVariable_2;
		EObject tmpClassDec = _localVariable_3;
		if (tmpFeature instanceof Operation) {
			Operation feature = (Operation) tmpFeature;
			if (tmpUmlClass instanceof Enumeration) {
				Enumeration umlClass = (Enumeration) tmpUmlClass;
				if (tmpCd2c instanceof ASTNode2Element) {
					ASTNode2Element cd2c = (ASTNode2Element) tmpCd2c;
					if (tmpClassDec instanceof EnumDeclaration) {
						EnumDeclaration classDec = (EnumDeclaration) tmpClassDec;
						return new Object[] { feature, umlClass, cd2c, classDec, isApplicableMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodDec2Operation4EnumWithModifier_11_1_performtransformation_blackBBBBFBB(
			Operation feature, Enumeration umlClass, ASTNode2Element cd2c, EnumDeclaration classDec,
			MethodDec2Operation4EnumWithModifier _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { feature, umlClass, cd2c, classDec, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodDec2Operation4EnumWithModifier_11_1_performtransformation_bindingAndBlackFFFFFBB(
			MethodDec2Operation4EnumWithModifier _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_MethodDec2Operation4EnumWithModifier_11_1_performtransformation_binding = pattern_MethodDec2Operation4EnumWithModifier_11_1_performtransformation_bindingFFFFB(
				isApplicableMatch);
		if (result_pattern_MethodDec2Operation4EnumWithModifier_11_1_performtransformation_binding != null) {
			Operation feature = (Operation) result_pattern_MethodDec2Operation4EnumWithModifier_11_1_performtransformation_binding[0];
			Enumeration umlClass = (Enumeration) result_pattern_MethodDec2Operation4EnumWithModifier_11_1_performtransformation_binding[1];
			ASTNode2Element cd2c = (ASTNode2Element) result_pattern_MethodDec2Operation4EnumWithModifier_11_1_performtransformation_binding[2];
			EnumDeclaration classDec = (EnumDeclaration) result_pattern_MethodDec2Operation4EnumWithModifier_11_1_performtransformation_binding[3];

			Object[] result_pattern_MethodDec2Operation4EnumWithModifier_11_1_performtransformation_black = pattern_MethodDec2Operation4EnumWithModifier_11_1_performtransformation_blackBBBBFBB(
					feature, umlClass, cd2c, classDec, _this, isApplicableMatch);
			if (result_pattern_MethodDec2Operation4EnumWithModifier_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_MethodDec2Operation4EnumWithModifier_11_1_performtransformation_black[4];

				return new Object[] { feature, umlClass, cd2c, classDec, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodDec2Operation4EnumWithModifier_11_1_performtransformation_greenFBFFFFBB(
			Operation feature, EnumDeclaration classDec, CSP csp) {
		Modifier2NamedElement m2f = UmlFactory.eINSTANCE.createModifier2NamedElement();
		NamedElement2NamedElement bd2ne = UmlFactory.eINSTANCE.createNamedElement2NamedElement();
		ASTNode2Element b2e = UmlFactory.eINSTANCE.createASTNode2Element();
		MMethodDefinition bodyDeclaration = ModiscoFactory.eINSTANCE.createMMethodDefinition();
		Modifier modifier = JavaFactory.eINSTANCE.createModifier();
		Object _localVariable_0 = csp.getValue("bodyDeclaration", "name");
		Object _localVariable_1 = csp.getValue("modifier", "static");
		Object _localVariable_2 = csp.getValue("modifier", "visibility");
		m2f.setTarget(feature);
		bd2ne.setTarget(feature);
		b2e.setTarget(feature);
		bd2ne.setSource(bodyDeclaration);
		b2e.setSource(bodyDeclaration);
		classDec.getBodyDeclarations().add(bodyDeclaration);
		bodyDeclaration.setModifier(modifier);
		m2f.setSource(modifier);
		String bodyDeclaration_name_prime = (String) _localVariable_0;
		boolean modifier_static_prime = (boolean) _localVariable_1;
		org.eclipse.modisco.java.VisibilityKind modifier_visibility_prime = (org.eclipse.modisco.java.VisibilityKind) _localVariable_2;
		bodyDeclaration.setName(bodyDeclaration_name_prime);
		modifier.setStatic(Boolean.valueOf(modifier_static_prime));
		modifier.setVisibility(modifier_visibility_prime);
		return new Object[] { m2f, feature, bd2ne, b2e, bodyDeclaration, modifier, classDec, csp };
	}

	public static final Object[] pattern_MethodDec2Operation4EnumWithModifier_11_2_collecttranslatedelements_blackBBBBBB(
			Modifier2NamedElement m2f, Operation feature, NamedElement2NamedElement bd2ne, ASTNode2Element b2e,
			MMethodDefinition bodyDeclaration, Modifier modifier) {
		return new Object[] { m2f, feature, bd2ne, b2e, bodyDeclaration, modifier };
	}

	public static final Object[] pattern_MethodDec2Operation4EnumWithModifier_11_2_collecttranslatedelements_greenFBBBBBB(
			Modifier2NamedElement m2f, Operation feature, NamedElement2NamedElement bd2ne, ASTNode2Element b2e,
			MMethodDefinition bodyDeclaration, Modifier modifier) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(m2f);
		ruleresult.getTranslatedElements().add(feature);
		ruleresult.getCreatedLinkElements().add(bd2ne);
		ruleresult.getCreatedLinkElements().add(b2e);
		ruleresult.getCreatedElements().add(bodyDeclaration);
		ruleresult.getCreatedElements().add(modifier);
		return new Object[] { ruleresult, m2f, feature, bd2ne, b2e, bodyDeclaration, modifier };
	}

	public static final Object[] pattern_MethodDec2Operation4EnumWithModifier_11_3_bookkeepingforedges_blackBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject m2f, EObject feature, EObject bd2ne, EObject b2e,
			EObject bodyDeclaration, EObject modifier, EObject umlClass, EObject cd2c, EObject classDec) {
		if (!m2f.equals(modifier)) {
			if (!m2f.equals(umlClass)) {
				if (!feature.equals(m2f)) {
					if (!feature.equals(modifier)) {
						if (!feature.equals(umlClass)) {
							if (!bd2ne.equals(m2f)) {
								if (!bd2ne.equals(feature)) {
									if (!bd2ne.equals(bodyDeclaration)) {
										if (!bd2ne.equals(modifier)) {
											if (!bd2ne.equals(umlClass)) {
												if (!bd2ne.equals(cd2c)) {
													if (!bd2ne.equals(classDec)) {
														if (!b2e.equals(m2f)) {
															if (!b2e.equals(feature)) {
																if (!b2e.equals(bd2ne)) {
																	if (!b2e.equals(bodyDeclaration)) {
																		if (!b2e.equals(modifier)) {
																			if (!b2e.equals(umlClass)) {
																				if (!b2e.equals(cd2c)) {
																					if (!b2e.equals(classDec)) {
																						if (!bodyDeclaration
																								.equals(m2f)) {
																							if (!bodyDeclaration
																									.equals(feature)) {
																								if (!bodyDeclaration
																										.equals(modifier)) {
																									if (!bodyDeclaration
																											.equals(umlClass)) {
																										if (!bodyDeclaration
																												.equals(cd2c)) {
																											if (!bodyDeclaration
																													.equals(classDec)) {
																												if (!modifier
																														.equals(umlClass)) {
																													if (!cd2c
																															.equals(m2f)) {
																														if (!cd2c
																																.equals(feature)) {
																															if (!cd2c
																																	.equals(modifier)) {
																																if (!cd2c
																																		.equals(umlClass)) {
																																	if (!cd2c
																																			.equals(classDec)) {
																																		if (!classDec
																																				.equals(m2f)) {
																																			if (!classDec
																																					.equals(feature)) {
																																				if (!classDec
																																						.equals(modifier)) {
																																					if (!classDec
																																							.equals(umlClass)) {
																																						return new Object[] {
																																								ruleresult,
																																								m2f,
																																								feature,
																																								bd2ne,
																																								b2e,
																																								bodyDeclaration,
																																								modifier,
																																								umlClass,
																																								cd2c,
																																								classDec };
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_MethodDec2Operation4EnumWithModifier_11_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject m2f, EObject feature, EObject bd2ne, EObject b2e,
			EObject bodyDeclaration, EObject modifier, EObject umlClass, EObject classDec) {
		EMoflonEdge umlClass__feature____ownedOperation = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge feature__umlClass____datatype = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge bd2ne__bodyDeclaration____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge bodyDeclaration__modifier____modifier = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge modifier__bodyDeclaration____bodyDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge m2f__feature____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge bd2ne__feature____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2e__bodyDeclaration____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge classDec__bodyDeclaration____bodyDeclarations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge bodyDeclaration__classDec____abstractTypeDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge m2f__modifier____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2e__feature____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "MethodDec2Operation4EnumWithModifier";
		String umlClass__feature____ownedOperation_name_prime = "ownedOperation";
		String feature__umlClass____datatype_name_prime = "datatype";
		String bd2ne__bodyDeclaration____source_name_prime = "source";
		String bodyDeclaration__modifier____modifier_name_prime = "modifier";
		String modifier__bodyDeclaration____bodyDeclaration_name_prime = "bodyDeclaration";
		String m2f__feature____target_name_prime = "target";
		String bd2ne__feature____target_name_prime = "target";
		String b2e__bodyDeclaration____source_name_prime = "source";
		String classDec__bodyDeclaration____bodyDeclarations_name_prime = "bodyDeclarations";
		String bodyDeclaration__classDec____abstractTypeDeclaration_name_prime = "abstractTypeDeclaration";
		String m2f__modifier____source_name_prime = "source";
		String b2e__feature____target_name_prime = "target";
		umlClass__feature____ownedOperation.setSrc(umlClass);
		umlClass__feature____ownedOperation.setTrg(feature);
		ruleresult.getTranslatedEdges().add(umlClass__feature____ownedOperation);
		feature__umlClass____datatype.setSrc(feature);
		feature__umlClass____datatype.setTrg(umlClass);
		ruleresult.getTranslatedEdges().add(feature__umlClass____datatype);
		bd2ne__bodyDeclaration____source.setSrc(bd2ne);
		bd2ne__bodyDeclaration____source.setTrg(bodyDeclaration);
		ruleresult.getCreatedEdges().add(bd2ne__bodyDeclaration____source);
		bodyDeclaration__modifier____modifier.setSrc(bodyDeclaration);
		bodyDeclaration__modifier____modifier.setTrg(modifier);
		ruleresult.getCreatedEdges().add(bodyDeclaration__modifier____modifier);
		modifier__bodyDeclaration____bodyDeclaration.setSrc(modifier);
		modifier__bodyDeclaration____bodyDeclaration.setTrg(bodyDeclaration);
		ruleresult.getCreatedEdges().add(modifier__bodyDeclaration____bodyDeclaration);
		m2f__feature____target.setSrc(m2f);
		m2f__feature____target.setTrg(feature);
		ruleresult.getCreatedEdges().add(m2f__feature____target);
		bd2ne__feature____target.setSrc(bd2ne);
		bd2ne__feature____target.setTrg(feature);
		ruleresult.getCreatedEdges().add(bd2ne__feature____target);
		b2e__bodyDeclaration____source.setSrc(b2e);
		b2e__bodyDeclaration____source.setTrg(bodyDeclaration);
		ruleresult.getCreatedEdges().add(b2e__bodyDeclaration____source);
		classDec__bodyDeclaration____bodyDeclarations.setSrc(classDec);
		classDec__bodyDeclaration____bodyDeclarations.setTrg(bodyDeclaration);
		ruleresult.getCreatedEdges().add(classDec__bodyDeclaration____bodyDeclarations);
		bodyDeclaration__classDec____abstractTypeDeclaration.setSrc(bodyDeclaration);
		bodyDeclaration__classDec____abstractTypeDeclaration.setTrg(classDec);
		ruleresult.getCreatedEdges().add(bodyDeclaration__classDec____abstractTypeDeclaration);
		m2f__modifier____source.setSrc(m2f);
		m2f__modifier____source.setTrg(modifier);
		ruleresult.getCreatedEdges().add(m2f__modifier____source);
		b2e__feature____target.setSrc(b2e);
		b2e__feature____target.setTrg(feature);
		ruleresult.getCreatedEdges().add(b2e__feature____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		umlClass__feature____ownedOperation.setName(umlClass__feature____ownedOperation_name_prime);
		feature__umlClass____datatype.setName(feature__umlClass____datatype_name_prime);
		bd2ne__bodyDeclaration____source.setName(bd2ne__bodyDeclaration____source_name_prime);
		bodyDeclaration__modifier____modifier.setName(bodyDeclaration__modifier____modifier_name_prime);
		modifier__bodyDeclaration____bodyDeclaration.setName(modifier__bodyDeclaration____bodyDeclaration_name_prime);
		m2f__feature____target.setName(m2f__feature____target_name_prime);
		bd2ne__feature____target.setName(bd2ne__feature____target_name_prime);
		b2e__bodyDeclaration____source.setName(b2e__bodyDeclaration____source_name_prime);
		classDec__bodyDeclaration____bodyDeclarations.setName(classDec__bodyDeclaration____bodyDeclarations_name_prime);
		bodyDeclaration__classDec____abstractTypeDeclaration
				.setName(bodyDeclaration__classDec____abstractTypeDeclaration_name_prime);
		m2f__modifier____source.setName(m2f__modifier____source_name_prime);
		b2e__feature____target.setName(b2e__feature____target_name_prime);
		return new Object[] { ruleresult, m2f, feature, bd2ne, b2e, bodyDeclaration, modifier, umlClass, classDec,
				umlClass__feature____ownedOperation, feature__umlClass____datatype, bd2ne__bodyDeclaration____source,
				bodyDeclaration__modifier____modifier, modifier__bodyDeclaration____bodyDeclaration,
				m2f__feature____target, bd2ne__feature____target, b2e__bodyDeclaration____source,
				classDec__bodyDeclaration____bodyDeclarations, bodyDeclaration__classDec____abstractTypeDeclaration,
				m2f__modifier____source, b2e__feature____target };
	}

	public static final void pattern_MethodDec2Operation4EnumWithModifier_11_5_registerobjects_expressionBBBBBBBBBBB(
			MethodDec2Operation4EnumWithModifier _this, PerformRuleResult ruleresult, EObject m2f, EObject feature,
			EObject bd2ne, EObject b2e, EObject bodyDeclaration, EObject modifier, EObject umlClass, EObject cd2c,
			EObject classDec) {
		_this.registerObjects_BWD(ruleresult, m2f, feature, bd2ne, b2e, bodyDeclaration, modifier, umlClass, cd2c,
				classDec);

	}

	public static final PerformRuleResult pattern_MethodDec2Operation4EnumWithModifier_11_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_MethodDec2Operation4EnumWithModifier_12_1_preparereturnvalue_bindingFB(
			MethodDec2Operation4EnumWithModifier _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_MethodDec2Operation4EnumWithModifier_12_1_preparereturnvalue_blackFBB(
			EClass eClass, MethodDec2Operation4EnumWithModifier _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_MethodDec2Operation4EnumWithModifier_12_1_preparereturnvalue_bindingAndBlackFFB(
			MethodDec2Operation4EnumWithModifier _this) {
		Object[] result_pattern_MethodDec2Operation4EnumWithModifier_12_1_preparereturnvalue_binding = pattern_MethodDec2Operation4EnumWithModifier_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_MethodDec2Operation4EnumWithModifier_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_MethodDec2Operation4EnumWithModifier_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_MethodDec2Operation4EnumWithModifier_12_1_preparereturnvalue_black = pattern_MethodDec2Operation4EnumWithModifier_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_MethodDec2Operation4EnumWithModifier_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_MethodDec2Operation4EnumWithModifier_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodDec2Operation4EnumWithModifier_12_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "MethodDec2Operation4EnumWithModifier";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_MethodDec2Operation4EnumWithModifier_12_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("feature");
		EObject _localVariable_1 = match.getObject("umlClass");
		EObject tmpFeature = _localVariable_0;
		EObject tmpUmlClass = _localVariable_1;
		if (tmpFeature instanceof Operation) {
			Operation feature = (Operation) tmpFeature;
			if (tmpUmlClass instanceof Enumeration) {
				Enumeration umlClass = (Enumeration) tmpUmlClass;
				return new Object[] { feature, umlClass, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_MethodDec2Operation4EnumWithModifier_12_2_corematch_blackBBFFB(
			Operation feature, Enumeration umlClass, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (ASTNode2Element cd2c : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(umlClass,
				ASTNode2Element.class, "target")) {
			ASTNode tmpClassDec = cd2c.getSource();
			if (tmpClassDec instanceof EnumDeclaration) {
				EnumDeclaration classDec = (EnumDeclaration) tmpClassDec;
				_result.add(new Object[] { feature, umlClass, cd2c, classDec, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_MethodDec2Operation4EnumWithModifier_12_3_findcontext_blackBBBB(
			Operation feature, Enumeration umlClass, ASTNode2Element cd2c, EnumDeclaration classDec) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (umlClass.getOwnedOperations().contains(feature)) {
			if (classDec.equals(cd2c.getSource())) {
				if (umlClass.equals(cd2c.getTarget())) {
					_result.add(new Object[] { feature, umlClass, cd2c, classDec });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_MethodDec2Operation4EnumWithModifier_12_3_findcontext_greenBBBBFFFFF(
			Operation feature, Enumeration umlClass, ASTNode2Element cd2c, EnumDeclaration classDec) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge umlClass__feature____ownedOperation = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge feature__umlClass____datatype = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge cd2c__classDec____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge cd2c__umlClass____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String umlClass__feature____ownedOperation_name_prime = "ownedOperation";
		String feature__umlClass____datatype_name_prime = "datatype";
		String cd2c__classDec____source_name_prime = "source";
		String cd2c__umlClass____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(feature);
		isApplicableMatch.getAllContextElements().add(umlClass);
		isApplicableMatch.getAllContextElements().add(cd2c);
		isApplicableMatch.getAllContextElements().add(classDec);
		umlClass__feature____ownedOperation.setSrc(umlClass);
		umlClass__feature____ownedOperation.setTrg(feature);
		isApplicableMatch.getAllContextElements().add(umlClass__feature____ownedOperation);
		feature__umlClass____datatype.setSrc(feature);
		feature__umlClass____datatype.setTrg(umlClass);
		isApplicableMatch.getAllContextElements().add(feature__umlClass____datatype);
		cd2c__classDec____source.setSrc(cd2c);
		cd2c__classDec____source.setTrg(classDec);
		isApplicableMatch.getAllContextElements().add(cd2c__classDec____source);
		cd2c__umlClass____target.setSrc(cd2c);
		cd2c__umlClass____target.setTrg(umlClass);
		isApplicableMatch.getAllContextElements().add(cd2c__umlClass____target);
		umlClass__feature____ownedOperation.setName(umlClass__feature____ownedOperation_name_prime);
		feature__umlClass____datatype.setName(feature__umlClass____datatype_name_prime);
		cd2c__classDec____source.setName(cd2c__classDec____source_name_prime);
		cd2c__umlClass____target.setName(cd2c__umlClass____target_name_prime);
		return new Object[] { feature, umlClass, cd2c, classDec, isApplicableMatch, umlClass__feature____ownedOperation,
				feature__umlClass____datatype, cd2c__classDec____source, cd2c__umlClass____target };
	}

	public static final Object[] pattern_MethodDec2Operation4EnumWithModifier_12_4_solveCSP_bindingFBBBBBB(
			MethodDec2Operation4EnumWithModifier _this, IsApplicableMatch isApplicableMatch, Operation feature,
			Enumeration umlClass, ASTNode2Element cd2c, EnumDeclaration classDec) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, feature, umlClass, cd2c, classDec);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, feature, umlClass, cd2c, classDec };
		}
		return null;
	}

	public static final Object[] pattern_MethodDec2Operation4EnumWithModifier_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MethodDec2Operation4EnumWithModifier_12_4_solveCSP_bindingAndBlackFBBBBBB(
			MethodDec2Operation4EnumWithModifier _this, IsApplicableMatch isApplicableMatch, Operation feature,
			Enumeration umlClass, ASTNode2Element cd2c, EnumDeclaration classDec) {
		Object[] result_pattern_MethodDec2Operation4EnumWithModifier_12_4_solveCSP_binding = pattern_MethodDec2Operation4EnumWithModifier_12_4_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, feature, umlClass, cd2c, classDec);
		if (result_pattern_MethodDec2Operation4EnumWithModifier_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_MethodDec2Operation4EnumWithModifier_12_4_solveCSP_binding[0];

			Object[] result_pattern_MethodDec2Operation4EnumWithModifier_12_4_solveCSP_black = pattern_MethodDec2Operation4EnumWithModifier_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_MethodDec2Operation4EnumWithModifier_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, feature, umlClass, cd2c, classDec };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodDec2Operation4EnumWithModifier_12_5_checkCSP_expressionFBB(
			MethodDec2Operation4EnumWithModifier _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodDec2Operation4EnumWithModifier_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_MethodDec2Operation4EnumWithModifier_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "MethodDec2Operation4EnumWithModifier";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_MethodDec2Operation4EnumWithModifier_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_MethodDec2Operation4EnumWithModifier_20_1_preparereturnvalue_bindingFB(
			MethodDec2Operation4EnumWithModifier _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_MethodDec2Operation4EnumWithModifier_20_1_preparereturnvalue_blackFBBF(
			EClass __eClass, MethodDec2Operation4EnumWithModifier _this) {
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

	public static final Object[] pattern_MethodDec2Operation4EnumWithModifier_20_1_preparereturnvalue_bindingAndBlackFFBF(
			MethodDec2Operation4EnumWithModifier _this) {
		Object[] result_pattern_MethodDec2Operation4EnumWithModifier_20_1_preparereturnvalue_binding = pattern_MethodDec2Operation4EnumWithModifier_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_MethodDec2Operation4EnumWithModifier_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_MethodDec2Operation4EnumWithModifier_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_MethodDec2Operation4EnumWithModifier_20_1_preparereturnvalue_black = pattern_MethodDec2Operation4EnumWithModifier_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_MethodDec2Operation4EnumWithModifier_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_MethodDec2Operation4EnumWithModifier_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_MethodDec2Operation4EnumWithModifier_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodDec2Operation4EnumWithModifier_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_MethodDec2Operation4EnumWithModifier_20_2_testcorematchandDECs_black_nac_0B(
			Operation feature) {
		org.eclipse.uml2.uml.Class __DEC_feature_ownedOperation_144182 = feature.getClass_();
		if (__DEC_feature_ownedOperation_144182 != null) {
			return new Object[] { feature };
		}

		return null;
	}

	public static final Object[] pattern_MethodDec2Operation4EnumWithModifier_20_2_testcorematchandDECs_black_nac_1B(
			Operation feature) {
		Interface __DEC_feature_ownedOperation_672672 = feature.getInterface();
		if (__DEC_feature_ownedOperation_672672 != null) {
			return new Object[] { feature };
		}

		return null;
	}

	public static final Iterable<Object[]> pattern_MethodDec2Operation4EnumWithModifier_20_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_ownedOperation) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpUmlClass = _edge_ownedOperation.getSrc();
		if (tmpUmlClass instanceof Enumeration) {
			Enumeration umlClass = (Enumeration) tmpUmlClass;
			EObject tmpFeature = _edge_ownedOperation.getTrg();
			if (tmpFeature instanceof Operation) {
				Operation feature = (Operation) tmpFeature;
				if (umlClass.getOwnedOperations().contains(feature)) {
					if (pattern_MethodDec2Operation4EnumWithModifier_20_2_testcorematchandDECs_black_nac_0B(
							feature) == null) {
						if (pattern_MethodDec2Operation4EnumWithModifier_20_2_testcorematchandDECs_black_nac_1B(
								feature) == null) {
							_result.add(new Object[] { feature, umlClass, _edge_ownedOperation });
						}
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_MethodDec2Operation4EnumWithModifier_20_2_testcorematchandDECs_greenFB(
			EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_MethodDec2Operation4EnumWithModifier_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			MethodDec2Operation4EnumWithModifier _this, Match match, Operation feature, Enumeration umlClass) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, feature, umlClass);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_MethodDec2Operation4EnumWithModifier_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			MethodDec2Operation4EnumWithModifier _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodDec2Operation4EnumWithModifier_20_5_Addmatchtoruleresult_blackBBBB(
			Match match, EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_MethodDec2Operation4EnumWithModifier_20_5_Addmatchtoruleresult_greenBBBB(
			Match match, EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_MethodDec2Operation4EnumWithModifier_20_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_MethodDec2Operation4EnumWithModifier_21_1_preparereturnvalue_bindingFB(
			MethodDec2Operation4EnumWithModifier _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_MethodDec2Operation4EnumWithModifier_21_1_preparereturnvalue_blackFBBF(
			EClass __eClass, MethodDec2Operation4EnumWithModifier _this) {
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

	public static final Object[] pattern_MethodDec2Operation4EnumWithModifier_21_1_preparereturnvalue_bindingAndBlackFFBF(
			MethodDec2Operation4EnumWithModifier _this) {
		Object[] result_pattern_MethodDec2Operation4EnumWithModifier_21_1_preparereturnvalue_binding = pattern_MethodDec2Operation4EnumWithModifier_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_MethodDec2Operation4EnumWithModifier_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_MethodDec2Operation4EnumWithModifier_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_MethodDec2Operation4EnumWithModifier_21_1_preparereturnvalue_black = pattern_MethodDec2Operation4EnumWithModifier_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_MethodDec2Operation4EnumWithModifier_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_MethodDec2Operation4EnumWithModifier_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_MethodDec2Operation4EnumWithModifier_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodDec2Operation4EnumWithModifier_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_MethodDec2Operation4EnumWithModifier_21_2_testcorematchandDECs_black_nac_0B(
			MMethodDefinition bodyDeclaration) {
		AnonymousClassDeclaration __DEC_bodyDeclaration_bodyDeclarations_706224 = bodyDeclaration
				.getAnonymousClassDeclarationOwner();
		if (__DEC_bodyDeclaration_bodyDeclarations_706224 != null) {
			return new Object[] { bodyDeclaration };
		}

		return null;
	}

	public static final Iterable<Object[]> pattern_MethodDec2Operation4EnumWithModifier_21_2_testcorematchandDECs_blackFFFB(
			EMoflonEdge _edge_modifier) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpBodyDeclaration = _edge_modifier.getSrc();
		if (tmpBodyDeclaration instanceof MMethodDefinition) {
			MMethodDefinition bodyDeclaration = (MMethodDefinition) tmpBodyDeclaration;
			EObject tmpModifier = _edge_modifier.getTrg();
			if (tmpModifier instanceof Modifier) {
				Modifier modifier = (Modifier) tmpModifier;
				if (modifier.equals(bodyDeclaration.getModifier())) {
					AbstractTypeDeclaration tmpClassDec = bodyDeclaration.getAbstractTypeDeclaration();
					if (tmpClassDec instanceof EnumDeclaration) {
						EnumDeclaration classDec = (EnumDeclaration) tmpClassDec;
						if (pattern_MethodDec2Operation4EnumWithModifier_21_2_testcorematchandDECs_black_nac_0B(
								bodyDeclaration) == null) {
							_result.add(new Object[] { bodyDeclaration, modifier, classDec, _edge_modifier });
						}
					}

				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_MethodDec2Operation4EnumWithModifier_21_2_testcorematchandDECs_greenFB(
			EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_MethodDec2Operation4EnumWithModifier_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
			MethodDec2Operation4EnumWithModifier _this, Match match, MMethodDefinition bodyDeclaration,
			Modifier modifier, EnumDeclaration classDec) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, bodyDeclaration, modifier, classDec);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_MethodDec2Operation4EnumWithModifier_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			MethodDec2Operation4EnumWithModifier _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodDec2Operation4EnumWithModifier_21_5_Addmatchtoruleresult_blackBBBB(
			Match match, EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_MethodDec2Operation4EnumWithModifier_21_5_Addmatchtoruleresult_greenBBBB(
			Match match, EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_MethodDec2Operation4EnumWithModifier_21_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_MethodDec2Operation4EnumWithModifier_24_1_prepare_blackB(
			MethodDec2Operation4EnumWithModifier _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_MethodDec2Operation4EnumWithModifier_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_MethodDec2Operation4EnumWithModifier_24_2_matchsrctrgcontext_bindingFFFFFBB(
			Match targetMatch, Match sourceMatch) {
		EObject _localVariable_0 = targetMatch.getObject("feature");
		EObject _localVariable_1 = sourceMatch.getObject("bodyDeclaration");
		EObject _localVariable_2 = sourceMatch.getObject("modifier");
		EObject _localVariable_3 = targetMatch.getObject("umlClass");
		EObject _localVariable_4 = sourceMatch.getObject("classDec");
		EObject tmpFeature = _localVariable_0;
		EObject tmpBodyDeclaration = _localVariable_1;
		EObject tmpModifier = _localVariable_2;
		EObject tmpUmlClass = _localVariable_3;
		EObject tmpClassDec = _localVariable_4;
		if (tmpFeature instanceof Operation) {
			Operation feature = (Operation) tmpFeature;
			if (tmpBodyDeclaration instanceof MMethodDefinition) {
				MMethodDefinition bodyDeclaration = (MMethodDefinition) tmpBodyDeclaration;
				if (tmpModifier instanceof Modifier) {
					Modifier modifier = (Modifier) tmpModifier;
					if (tmpUmlClass instanceof Enumeration) {
						Enumeration umlClass = (Enumeration) tmpUmlClass;
						if (tmpClassDec instanceof EnumDeclaration) {
							EnumDeclaration classDec = (EnumDeclaration) tmpClassDec;
							return new Object[] { feature, bodyDeclaration, modifier, umlClass, classDec, targetMatch,
									sourceMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodDec2Operation4EnumWithModifier_24_2_matchsrctrgcontext_blackBBBBBBB(
			Operation feature, MMethodDefinition bodyDeclaration, Modifier modifier, Enumeration umlClass,
			EnumDeclaration classDec, Match sourceMatch, Match targetMatch) {
		if (!sourceMatch.equals(targetMatch)) {
			return new Object[] { feature, bodyDeclaration, modifier, umlClass, classDec, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_MethodDec2Operation4EnumWithModifier_24_2_matchsrctrgcontext_bindingAndBlackFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_MethodDec2Operation4EnumWithModifier_24_2_matchsrctrgcontext_binding = pattern_MethodDec2Operation4EnumWithModifier_24_2_matchsrctrgcontext_bindingFFFFFBB(
				targetMatch, sourceMatch);
		if (result_pattern_MethodDec2Operation4EnumWithModifier_24_2_matchsrctrgcontext_binding != null) {
			Operation feature = (Operation) result_pattern_MethodDec2Operation4EnumWithModifier_24_2_matchsrctrgcontext_binding[0];
			MMethodDefinition bodyDeclaration = (MMethodDefinition) result_pattern_MethodDec2Operation4EnumWithModifier_24_2_matchsrctrgcontext_binding[1];
			Modifier modifier = (Modifier) result_pattern_MethodDec2Operation4EnumWithModifier_24_2_matchsrctrgcontext_binding[2];
			Enumeration umlClass = (Enumeration) result_pattern_MethodDec2Operation4EnumWithModifier_24_2_matchsrctrgcontext_binding[3];
			EnumDeclaration classDec = (EnumDeclaration) result_pattern_MethodDec2Operation4EnumWithModifier_24_2_matchsrctrgcontext_binding[4];

			Object[] result_pattern_MethodDec2Operation4EnumWithModifier_24_2_matchsrctrgcontext_black = pattern_MethodDec2Operation4EnumWithModifier_24_2_matchsrctrgcontext_blackBBBBBBB(
					feature, bodyDeclaration, modifier, umlClass, classDec, sourceMatch, targetMatch);
			if (result_pattern_MethodDec2Operation4EnumWithModifier_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { feature, bodyDeclaration, modifier, umlClass, classDec, sourceMatch,
						targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodDec2Operation4EnumWithModifier_24_3_solvecsp_bindingFBBBBBBBB(
			MethodDec2Operation4EnumWithModifier _this, Operation feature, MMethodDefinition bodyDeclaration,
			Modifier modifier, Enumeration umlClass, EnumDeclaration classDec, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_5 = _this.isApplicable_solveCsp_CC(feature, bodyDeclaration, modifier, umlClass, classDec,
				sourceMatch, targetMatch);
		CSP csp = _localVariable_5;
		if (csp != null) {
			return new Object[] { csp, _this, feature, bodyDeclaration, modifier, umlClass, classDec, sourceMatch,
					targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_MethodDec2Operation4EnumWithModifier_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MethodDec2Operation4EnumWithModifier_24_3_solvecsp_bindingAndBlackFBBBBBBBB(
			MethodDec2Operation4EnumWithModifier _this, Operation feature, MMethodDefinition bodyDeclaration,
			Modifier modifier, Enumeration umlClass, EnumDeclaration classDec, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_MethodDec2Operation4EnumWithModifier_24_3_solvecsp_binding = pattern_MethodDec2Operation4EnumWithModifier_24_3_solvecsp_bindingFBBBBBBBB(
				_this, feature, bodyDeclaration, modifier, umlClass, classDec, sourceMatch, targetMatch);
		if (result_pattern_MethodDec2Operation4EnumWithModifier_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_MethodDec2Operation4EnumWithModifier_24_3_solvecsp_binding[0];

			Object[] result_pattern_MethodDec2Operation4EnumWithModifier_24_3_solvecsp_black = pattern_MethodDec2Operation4EnumWithModifier_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_MethodDec2Operation4EnumWithModifier_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, feature, bodyDeclaration, modifier, umlClass, classDec, sourceMatch,
						targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodDec2Operation4EnumWithModifier_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_MethodDec2Operation4EnumWithModifier_24_5_matchcorrcontext_blackBFBBB(
			Enumeration umlClass, EnumDeclaration classDec, Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (ASTNode2Element cd2c : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(classDec,
					ASTNode2Element.class, "source")) {
				if (umlClass.equals(cd2c.getTarget())) {
					_result.add(new Object[] { umlClass, cd2c, classDec, sourceMatch, targetMatch });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_MethodDec2Operation4EnumWithModifier_24_5_matchcorrcontext_greenBBBF(
			ASTNode2Element cd2c, Match sourceMatch, Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "MethodDec2Operation4EnumWithModifier";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(cd2c);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { cd2c, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_MethodDec2Operation4EnumWithModifier_24_6_createcorrespondence_blackBBBBBB(
			Operation feature, MMethodDefinition bodyDeclaration, Modifier modifier, Enumeration umlClass,
			EnumDeclaration classDec, CCMatch ccMatch) {
		return new Object[] { feature, bodyDeclaration, modifier, umlClass, classDec, ccMatch };
	}

	public static final Object[] pattern_MethodDec2Operation4EnumWithModifier_24_6_createcorrespondence_greenFBFFBBB(
			Operation feature, MMethodDefinition bodyDeclaration, Modifier modifier, CCMatch ccMatch) {
		Modifier2NamedElement m2f = UmlFactory.eINSTANCE.createModifier2NamedElement();
		NamedElement2NamedElement bd2ne = UmlFactory.eINSTANCE.createNamedElement2NamedElement();
		ASTNode2Element b2e = UmlFactory.eINSTANCE.createASTNode2Element();
		m2f.setTarget(feature);
		m2f.setSource(modifier);
		ccMatch.getCreateCorr().add(m2f);
		bd2ne.setSource(bodyDeclaration);
		bd2ne.setTarget(feature);
		ccMatch.getCreateCorr().add(bd2ne);
		b2e.setSource(bodyDeclaration);
		b2e.setTarget(feature);
		ccMatch.getCreateCorr().add(b2e);
		return new Object[] { m2f, feature, bd2ne, b2e, bodyDeclaration, modifier, ccMatch };
	}

	public static final Object[] pattern_MethodDec2Operation4EnumWithModifier_24_7_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_MethodDec2Operation4EnumWithModifier_24_7_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "MethodDec2Operation4EnumWithModifier";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_MethodDec2Operation4EnumWithModifier_24_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_MethodDec2Operation4EnumWithModifier_27_1_matchtggpattern_black_nac_0B(
			MMethodDefinition bodyDeclaration) {
		AnonymousClassDeclaration __DEC_bodyDeclaration_bodyDeclarations_554164 = bodyDeclaration
				.getAnonymousClassDeclarationOwner();
		if (__DEC_bodyDeclaration_bodyDeclarations_554164 != null) {
			return new Object[] { bodyDeclaration };
		}

		return null;
	}

	public static final Object[] pattern_MethodDec2Operation4EnumWithModifier_27_1_matchtggpattern_blackBBB(
			MMethodDefinition bodyDeclaration, Modifier modifier, EnumDeclaration classDec) {
		if (modifier.equals(bodyDeclaration.getModifier())) {
			if (classDec.getBodyDeclarations().contains(bodyDeclaration)) {
				if (pattern_MethodDec2Operation4EnumWithModifier_27_1_matchtggpattern_black_nac_0B(
						bodyDeclaration) == null) {
					return new Object[] { bodyDeclaration, modifier, classDec };
				}
			}
		}
		return null;
	}

	public static final boolean pattern_MethodDec2Operation4EnumWithModifier_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_MethodDec2Operation4EnumWithModifier_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_MethodDec2Operation4EnumWithModifier_28_1_matchtggpattern_black_nac_0B(
			Operation feature) {
		org.eclipse.uml2.uml.Class __DEC_feature_ownedOperation_10295 = feature.getClass_();
		if (__DEC_feature_ownedOperation_10295 != null) {
			return new Object[] { feature };
		}

		return null;
	}

	public static final Object[] pattern_MethodDec2Operation4EnumWithModifier_28_1_matchtggpattern_black_nac_1B(
			Operation feature) {
		Interface __DEC_feature_ownedOperation_630542 = feature.getInterface();
		if (__DEC_feature_ownedOperation_630542 != null) {
			return new Object[] { feature };
		}

		return null;
	}

	public static final Object[] pattern_MethodDec2Operation4EnumWithModifier_28_1_matchtggpattern_blackBB(
			Operation feature, Enumeration umlClass) {
		if (umlClass.getOwnedOperations().contains(feature)) {
			if (pattern_MethodDec2Operation4EnumWithModifier_28_1_matchtggpattern_black_nac_0B(feature) == null) {
				if (pattern_MethodDec2Operation4EnumWithModifier_28_1_matchtggpattern_black_nac_1B(feature) == null) {
					return new Object[] { feature, umlClass };
				}
			}
		}
		return null;
	}

	public static final boolean pattern_MethodDec2Operation4EnumWithModifier_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_MethodDec2Operation4EnumWithModifier_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_MethodDec2Operation4EnumWithModifier_29_1_createresult_blackB(
			MethodDec2Operation4EnumWithModifier _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_MethodDec2Operation4EnumWithModifier_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_MethodDec2Operation4EnumWithModifier_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, Enumeration umlClass) {
		if (ruleResult.getTargetObjects().contains(umlClass)) {
			return new Object[] { ruleResult, umlClass };
		}
		return null;
	}

	public static final Object[] pattern_MethodDec2Operation4EnumWithModifier_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, ASTNode2Element cd2c) {
		if (ruleResult.getCorrObjects().contains(cd2c)) {
			return new Object[] { ruleResult, cd2c };
		}
		return null;
	}

	public static final Object[] pattern_MethodDec2Operation4EnumWithModifier_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, EnumDeclaration classDec) {
		if (ruleResult.getSourceObjects().contains(classDec)) {
			return new Object[] { ruleResult, classDec };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_MethodDec2Operation4EnumWithModifier_29_2_isapplicablecore_blackFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList cd2cList : ruleEntryContainer.getRuleEntryList()) {
			for (EObject tmpCd2c : cd2cList.getEntryObjects()) {
				if (tmpCd2c instanceof ASTNode2Element) {
					ASTNode2Element cd2c = (ASTNode2Element) tmpCd2c;
					Element tmpUmlClass = cd2c.getTarget();
					if (tmpUmlClass instanceof Enumeration) {
						Enumeration umlClass = (Enumeration) tmpUmlClass;
						ASTNode tmpClassDec = cd2c.getSource();
						if (tmpClassDec instanceof EnumDeclaration) {
							EnumDeclaration classDec = (EnumDeclaration) tmpClassDec;
							if (pattern_MethodDec2Operation4EnumWithModifier_29_2_isapplicablecore_black_nac_1BB(
									ruleResult, cd2c) == null) {
								if (pattern_MethodDec2Operation4EnumWithModifier_29_2_isapplicablecore_black_nac_0BB(
										ruleResult, umlClass) == null) {
									if (pattern_MethodDec2Operation4EnumWithModifier_29_2_isapplicablecore_black_nac_2BB(
											ruleResult, classDec) == null) {
										_result.add(new Object[] { cd2cList, umlClass, cd2c, classDec,
												ruleEntryContainer, ruleResult });
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

	public static final Object[] pattern_MethodDec2Operation4EnumWithModifier_29_3_solveCSP_bindingFBBBBBB(
			MethodDec2Operation4EnumWithModifier _this, IsApplicableMatch isApplicableMatch, Enumeration umlClass,
			ASTNode2Element cd2c, EnumDeclaration classDec, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, umlClass, cd2c, classDec,
				ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, umlClass, cd2c, classDec, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_MethodDec2Operation4EnumWithModifier_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MethodDec2Operation4EnumWithModifier_29_3_solveCSP_bindingAndBlackFBBBBBB(
			MethodDec2Operation4EnumWithModifier _this, IsApplicableMatch isApplicableMatch, Enumeration umlClass,
			ASTNode2Element cd2c, EnumDeclaration classDec, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_MethodDec2Operation4EnumWithModifier_29_3_solveCSP_binding = pattern_MethodDec2Operation4EnumWithModifier_29_3_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, umlClass, cd2c, classDec, ruleResult);
		if (result_pattern_MethodDec2Operation4EnumWithModifier_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_MethodDec2Operation4EnumWithModifier_29_3_solveCSP_binding[0];

			Object[] result_pattern_MethodDec2Operation4EnumWithModifier_29_3_solveCSP_black = pattern_MethodDec2Operation4EnumWithModifier_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_MethodDec2Operation4EnumWithModifier_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, umlClass, cd2c, classDec, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodDec2Operation4EnumWithModifier_29_4_checkCSP_expressionFBB(
			MethodDec2Operation4EnumWithModifier _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodDec2Operation4EnumWithModifier_29_5_checknacs_blackBBB(
			Enumeration umlClass, ASTNode2Element cd2c, EnumDeclaration classDec) {
		return new Object[] { umlClass, cd2c, classDec };
	}

	public static final Object[] pattern_MethodDec2Operation4EnumWithModifier_29_6_perform_blackBBBB(
			Enumeration umlClass, ASTNode2Element cd2c, EnumDeclaration classDec, ModelgeneratorRuleResult ruleResult) {
		return new Object[] { umlClass, cd2c, classDec, ruleResult };
	}

	public static final Object[] pattern_MethodDec2Operation4EnumWithModifier_29_6_perform_greenFFFFFFBBBB(
			Enumeration umlClass, EnumDeclaration classDec, ModelgeneratorRuleResult ruleResult, CSP csp) {
		Modifier2NamedElement m2f = UmlFactory.eINSTANCE.createModifier2NamedElement();
		Operation feature = UMLFactory.eINSTANCE.createOperation();
		NamedElement2NamedElement bd2ne = UmlFactory.eINSTANCE.createNamedElement2NamedElement();
		ASTNode2Element b2e = UmlFactory.eINSTANCE.createASTNode2Element();
		MMethodDefinition bodyDeclaration = ModiscoFactory.eINSTANCE.createMMethodDefinition();
		Modifier modifier = JavaFactory.eINSTANCE.createModifier();
		Object _localVariable_0 = csp.getValue("feature", "name");
		Object _localVariable_1 = csp.getValue("feature", "isStatic");
		Object _localVariable_2 = csp.getValue("feature", "visibility");
		Object _localVariable_3 = csp.getValue("bodyDeclaration", "name");
		Object _localVariable_4 = csp.getValue("modifier", "static");
		Object _localVariable_5 = csp.getValue("modifier", "visibility");
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_6 = ruleResult.getIncrementedPerformCount();
		ruleResult.getCorrObjects().add(m2f);
		umlClass.getOwnedOperations().add(feature);
		m2f.setTarget(feature);
		ruleResult.getTargetObjects().add(feature);
		bd2ne.setTarget(feature);
		ruleResult.getCorrObjects().add(bd2ne);
		b2e.setTarget(feature);
		ruleResult.getCorrObjects().add(b2e);
		bd2ne.setSource(bodyDeclaration);
		b2e.setSource(bodyDeclaration);
		classDec.getBodyDeclarations().add(bodyDeclaration);
		ruleResult.getSourceObjects().add(bodyDeclaration);
		bodyDeclaration.setModifier(modifier);
		m2f.setSource(modifier);
		ruleResult.getSourceObjects().add(modifier);
		String feature_name_prime = (String) _localVariable_0;
		boolean feature_isStatic_prime = (boolean) _localVariable_1;
		VisibilityKind feature_visibility_prime = (VisibilityKind) _localVariable_2;
		String bodyDeclaration_name_prime = (String) _localVariable_3;
		boolean modifier_static_prime = (boolean) _localVariable_4;
		org.eclipse.modisco.java.VisibilityKind modifier_visibility_prime = (org.eclipse.modisco.java.VisibilityKind) _localVariable_5;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_6);
		feature.setName(feature_name_prime);
		feature.setIsStatic(Boolean.valueOf(feature_isStatic_prime));
		feature.setVisibility(feature_visibility_prime);
		bodyDeclaration.setName(bodyDeclaration_name_prime);
		modifier.setStatic(Boolean.valueOf(modifier_static_prime));
		modifier.setVisibility(modifier_visibility_prime);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { m2f, feature, bd2ne, b2e, bodyDeclaration, modifier, umlClass, classDec, ruleResult,
				csp };
	}

	public static final ModelgeneratorRuleResult pattern_MethodDec2Operation4EnumWithModifier_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //MethodDec2Operation4EnumWithModifierImpl
