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
import org.eclipse.modisco.java.BodyDeclaration;
import org.eclipse.modisco.java.ClassDeclaration;
import org.eclipse.modisco.java.Modifier;
import org.eclipse.modisco.java.Type;
import org.eclipse.modisco.java.VisibilityKind;

import org.eclipse.modisco.java.emf.JavaFactory;

import org.gravity.modisco.MDefinition;

import org.gravity.tgg.modisco.pm.MDefinitionToTMember;
import org.gravity.tgg.modisco.pm.MModifierToTModifier;
import org.gravity.tgg.modisco.pm.PmFactory;

import org.gravity.tgg.modisco.pm.Rules.MemberInClassVisibility;
import org.gravity.tgg.modisco.pm.Rules.RulesPackage;

import org.gravity.tgg.modisco.pm.TypeToTAbstractType;

import org.gravity.typegraph.basic.BasicFactory;
import org.gravity.typegraph.basic.TAbstractType;
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TMember;
import org.gravity.typegraph.basic.TModifier;
import org.gravity.typegraph.basic.TVisibility;

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
 * An implementation of the model object '<em><b>Member In Class Visibility</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class MemberInClassVisibilityImpl extends AbstractRuleImpl implements MemberInClassVisibility {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MemberInClassVisibilityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getMemberInClassVisibility();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, ClassDeclaration mClass, MDefinition mDefinition,
			Modifier mModifier) {

		Object[] result1_black = MemberInClassVisibilityImpl
				.pattern_MemberInClassVisibility_0_1_initialbindings_blackBBBBB(this, match, mClass, mDefinition,
						mModifier);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[mClass] = " + mClass + ", " + "[mDefinition] = " + mDefinition
					+ ", " + "[mModifier] = " + mModifier + ".");
		}

		Object[] result2_bindingAndBlack = MemberInClassVisibilityImpl
				.pattern_MemberInClassVisibility_0_2_SolveCSP_bindingAndBlackFBBBBB(this, match, mClass, mDefinition,
						mModifier);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[mClass] = " + mClass + ", " + "[mDefinition] = " + mDefinition
					+ ", " + "[mModifier] = " + mModifier + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (MemberInClassVisibilityImpl.pattern_MemberInClassVisibility_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = MemberInClassVisibilityImpl
					.pattern_MemberInClassVisibility_0_4_collectelementstobetranslated_blackBBBB(match, mClass,
							mDefinition, mModifier);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[mClass] = " + mClass + ", " + "[mDefinition] = " + mDefinition + ", " + "[mModifier] = "
						+ mModifier + ".");
			}
			MemberInClassVisibilityImpl.pattern_MemberInClassVisibility_0_4_collectelementstobetranslated_greenBBBFF(
					match, mDefinition, mModifier);
			//nothing EMoflonEdge mDefinition__mModifier____modifier = (EMoflonEdge) result4_green[3];
			//nothing EMoflonEdge mModifier__mDefinition____bodyDeclaration = (EMoflonEdge) result4_green[4];

			Object[] result5_black = MemberInClassVisibilityImpl
					.pattern_MemberInClassVisibility_0_5_collectcontextelements_blackBBBB(match, mClass, mDefinition,
							mModifier);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[mClass] = " + mClass + ", " + "[mDefinition] = " + mDefinition + ", " + "[mModifier] = "
						+ mModifier + ".");
			}
			MemberInClassVisibilityImpl.pattern_MemberInClassVisibility_0_5_collectcontextelements_greenBBBFF(match,
					mClass, mDefinition);
			//nothing EMoflonEdge mClass__mDefinition____bodyDeclarations = (EMoflonEdge) result5_green[3];
			//nothing EMoflonEdge mDefinition__mClass____abstractTypeDeclaration = (EMoflonEdge) result5_green[4];

			// 
			MemberInClassVisibilityImpl.pattern_MemberInClassVisibility_0_6_registerobjectstomatch_expressionBBBBB(this,
					match, mClass, mDefinition, mModifier);
			return MemberInClassVisibilityImpl.pattern_MemberInClassVisibility_0_7_expressionF();
		} else {
			return MemberInClassVisibilityImpl.pattern_MemberInClassVisibility_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = MemberInClassVisibilityImpl
				.pattern_MemberInClassVisibility_1_1_performtransformation_bindingAndBlackFFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		ClassDeclaration mClass = (ClassDeclaration) result1_bindingAndBlack[0];
		TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result1_bindingAndBlack[1];
		MDefinition mDefinition = (MDefinition) result1_bindingAndBlack[2];
		Modifier mModifier = (Modifier) result1_bindingAndBlack[3];
		TMember tMember = (TMember) result1_bindingAndBlack[4];
		TClass tClass = (TClass) result1_bindingAndBlack[5];
		MDefinitionToTMember defToMember = (MDefinitionToTMember) result1_bindingAndBlack[6];
		CSP csp = (CSP) result1_bindingAndBlack[7];
		Object[] result1_green = MemberInClassVisibilityImpl
				.pattern_MemberInClassVisibility_1_1_performtransformation_greenFBBFB(mModifier, tMember, csp);
		MModifierToTModifier mModifierToTModifier = (MModifierToTModifier) result1_green[0];
		TModifier tModifier = (TModifier) result1_green[3];

		Object[] result2_black = MemberInClassVisibilityImpl
				.pattern_MemberInClassVisibility_1_2_collecttranslatedelements_blackBBB(mModifierToTModifier, mModifier,
						tModifier);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[mModifierToTModifier] = " + mModifierToTModifier
							+ ", " + "[mModifier] = " + mModifier + ", " + "[tModifier] = " + tModifier + ".");
		}
		Object[] result2_green = MemberInClassVisibilityImpl
				.pattern_MemberInClassVisibility_1_2_collecttranslatedelements_greenFBBB(mModifierToTModifier,
						mModifier, tModifier);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = MemberInClassVisibilityImpl
				.pattern_MemberInClassVisibility_1_3_bookkeepingforedges_blackBBBBBBBBBB(ruleresult, mClass,
						mTypeToTType, mDefinition, mModifierToTModifier, mModifier, tMember, tModifier, tClass,
						defToMember);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[mClass] = " + mClass + ", " + "[mTypeToTType] = " + mTypeToTType + ", "
					+ "[mDefinition] = " + mDefinition + ", " + "[mModifierToTModifier] = " + mModifierToTModifier
					+ ", " + "[mModifier] = " + mModifier + ", " + "[tMember] = " + tMember + ", " + "[tModifier] = "
					+ tModifier + ", " + "[tClass] = " + tClass + ", " + "[defToMember] = " + defToMember + ".");
		}
		MemberInClassVisibilityImpl.pattern_MemberInClassVisibility_1_3_bookkeepingforedges_greenBBBBBBFFFFF(ruleresult,
				mDefinition, mModifierToTModifier, mModifier, tMember, tModifier);
		//nothing EMoflonEdge mModifierToTModifier__mModifier____source = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge mDefinition__mModifier____modifier = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge mModifier__mDefinition____bodyDeclaration = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge tMember__tModifier____tModifier = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge mModifierToTModifier__tModifier____target = (EMoflonEdge) result3_green[10];

		// 
		// 
		MemberInClassVisibilityImpl.pattern_MemberInClassVisibility_1_5_registerobjects_expressionBBBBBBBBBBB(this,
				ruleresult, mClass, mTypeToTType, mDefinition, mModifierToTModifier, mModifier, tMember, tModifier,
				tClass, defToMember);
		return MemberInClassVisibilityImpl.pattern_MemberInClassVisibility_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = MemberInClassVisibilityImpl
				.pattern_MemberInClassVisibility_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = MemberInClassVisibilityImpl
				.pattern_MemberInClassVisibility_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = MemberInClassVisibilityImpl
				.pattern_MemberInClassVisibility_2_2_corematch_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		ClassDeclaration mClass = (ClassDeclaration) result2_binding[0];
		MDefinition mDefinition = (MDefinition) result2_binding[1];
		Modifier mModifier = (Modifier) result2_binding[2];
		for (Object[] result2_black : MemberInClassVisibilityImpl
				.pattern_MemberInClassVisibility_2_2_corematch_blackBFBBFFFB(mClass, mDefinition, mModifier, match)) {
			TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result2_black[1];
			TMember tMember = (TMember) result2_black[4];
			TClass tClass = (TClass) result2_black[5];
			MDefinitionToTMember defToMember = (MDefinitionToTMember) result2_black[6];
			// ForEach 
			for (Object[] result3_black : MemberInClassVisibilityImpl
					.pattern_MemberInClassVisibility_2_3_findcontext_blackBBBBBBB(mClass, mTypeToTType, mDefinition,
							mModifier, tMember, tClass, defToMember)) {
				Object[] result3_green = MemberInClassVisibilityImpl
						.pattern_MemberInClassVisibility_2_3_findcontext_greenBBBBBBBFFFFFFFFFFF(mClass, mTypeToTType,
								mDefinition, mModifier, tMember, tClass, defToMember);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[7];
				//nothing EMoflonEdge mClass__mDefinition____bodyDeclarations = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge mDefinition__mClass____abstractTypeDeclaration = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge mTypeToTType__mClass____source = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge mDefinition__mModifier____modifier = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge mModifier__mDefinition____bodyDeclaration = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge mTypeToTType__tClass____target = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge tClass__tMember____defines = (EMoflonEdge) result3_green[14];
				//nothing EMoflonEdge tMember__tClass____definedBy = (EMoflonEdge) result3_green[15];
				//nothing EMoflonEdge defToMember__tMember____target = (EMoflonEdge) result3_green[16];
				//nothing EMoflonEdge defToMember__mDefinition____source = (EMoflonEdge) result3_green[17];

				Object[] result4_bindingAndBlack = MemberInClassVisibilityImpl
						.pattern_MemberInClassVisibility_2_4_solveCSP_bindingAndBlackFBBBBBBBBB(this, isApplicableMatch,
								mClass, mTypeToTType, mDefinition, mModifier, tMember, tClass, defToMember);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[mClass] = " + mClass + ", "
							+ "[mTypeToTType] = " + mTypeToTType + ", " + "[mDefinition] = " + mDefinition + ", "
							+ "[mModifier] = " + mModifier + ", " + "[tMember] = " + tMember + ", " + "[tClass] = "
							+ tClass + ", " + "[defToMember] = " + defToMember + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (MemberInClassVisibilityImpl.pattern_MemberInClassVisibility_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = MemberInClassVisibilityImpl
							.pattern_MemberInClassVisibility_2_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					MemberInClassVisibilityImpl.pattern_MemberInClassVisibility_2_6_addmatchtoruleresult_greenBB(
							ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return MemberInClassVisibilityImpl.pattern_MemberInClassVisibility_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, ClassDeclaration mClass, MDefinition mDefinition,
			Modifier mModifier) {
		match.registerObject("mClass", mClass);
		match.registerObject("mDefinition", mDefinition);
		match.registerObject("mModifier", mModifier);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, ClassDeclaration mClass, MDefinition mDefinition,
			Modifier mModifier) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, ClassDeclaration mClass,
			TypeToTAbstractType mTypeToTType, MDefinition mDefinition, Modifier mModifier, TMember tMember,
			TClass tClass, MDefinitionToTMember defToMember) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_mModifier_static = CSPFactoryHelper.eINSTANCE.createVariable("mModifier.static", true, csp);
		var_mModifier_static.setValue(mModifier.isStatic());
		var_mModifier_static.setType("Boolean");
		Variable var_mModifier_visibility = CSPFactoryHelper.eINSTANCE.createVariable("mModifier.visibility", true,
				csp);
		var_mModifier_visibility.setValue(mModifier.getVisibility());
		var_mModifier_visibility.setType("java.VisibilityKind");

		// Create unbound variables
		Variable var_tModifier_isStatic = CSPFactoryHelper.eINSTANCE.createVariable("tModifier.isStatic", csp);
		var_tModifier_isStatic.setType("Boolean");
		Variable var_tModifier_tVisibility = CSPFactoryHelper.eINSTANCE.createVariable("tModifier.tVisibility", csp);
		var_tModifier_tVisibility.setType("basic.TVisibility");

		// Create constraints
		Eq eq = new Eq();
		DefaultVisibility defaultVisibility = new DefaultVisibility();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(defaultVisibility);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_mModifier_static, var_tModifier_isStatic);
		defaultVisibility.setRuleName("NoRuleName");
		defaultVisibility.solve(var_mModifier_visibility, var_tModifier_tVisibility);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("mClass", mClass);
		isApplicableMatch.registerObject("mTypeToTType", mTypeToTType);
		isApplicableMatch.registerObject("mDefinition", mDefinition);
		isApplicableMatch.registerObject("mModifier", mModifier);
		isApplicableMatch.registerObject("tMember", tMember);
		isApplicableMatch.registerObject("tClass", tClass);
		isApplicableMatch.registerObject("defToMember", defToMember);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject mClass, EObject mTypeToTType,
			EObject mDefinition, EObject mModifierToTModifier, EObject mModifier, EObject tMember, EObject tModifier,
			EObject tClass, EObject defToMember) {
		ruleresult.registerObject("mClass", mClass);
		ruleresult.registerObject("mTypeToTType", mTypeToTType);
		ruleresult.registerObject("mDefinition", mDefinition);
		ruleresult.registerObject("mModifierToTModifier", mModifierToTModifier);
		ruleresult.registerObject("mModifier", mModifier);
		ruleresult.registerObject("tMember", tMember);
		ruleresult.registerObject("tModifier", tModifier);
		ruleresult.registerObject("tClass", tClass);
		ruleresult.registerObject("defToMember", defToMember);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("mModifier").eClass())
				.equals("java.Modifier.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, TMember tMember, TModifier tModifier, TClass tClass) {

		Object[] result1_black = MemberInClassVisibilityImpl
				.pattern_MemberInClassVisibility_10_1_initialbindings_blackBBBBB(this, match, tMember, tModifier,
						tClass);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[tMember] = " + tMember + ", " + "[tModifier] = " + tModifier
					+ ", " + "[tClass] = " + tClass + ".");
		}

		Object[] result2_bindingAndBlack = MemberInClassVisibilityImpl
				.pattern_MemberInClassVisibility_10_2_SolveCSP_bindingAndBlackFBBBBB(this, match, tMember, tModifier,
						tClass);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[tMember] = " + tMember + ", " + "[tModifier] = " + tModifier
					+ ", " + "[tClass] = " + tClass + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (MemberInClassVisibilityImpl.pattern_MemberInClassVisibility_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = MemberInClassVisibilityImpl
					.pattern_MemberInClassVisibility_10_4_collectelementstobetranslated_blackBBBB(match, tMember,
							tModifier, tClass);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching failed." + " Variables: " + "[match] = " + match + ", " + "[tMember] = "
								+ tMember + ", " + "[tModifier] = " + tModifier + ", " + "[tClass] = " + tClass + ".");
			}
			MemberInClassVisibilityImpl.pattern_MemberInClassVisibility_10_4_collectelementstobetranslated_greenBBBF(
					match, tMember, tModifier);
			//nothing EMoflonEdge tMember__tModifier____tModifier = (EMoflonEdge) result4_green[3];

			Object[] result5_black = MemberInClassVisibilityImpl
					.pattern_MemberInClassVisibility_10_5_collectcontextelements_blackBBBB(match, tMember, tModifier,
							tClass);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching failed." + " Variables: " + "[match] = " + match + ", " + "[tMember] = "
								+ tMember + ", " + "[tModifier] = " + tModifier + ", " + "[tClass] = " + tClass + ".");
			}
			MemberInClassVisibilityImpl.pattern_MemberInClassVisibility_10_5_collectcontextelements_greenBBBFF(match,
					tMember, tClass);
			//nothing EMoflonEdge tClass__tMember____defines = (EMoflonEdge) result5_green[3];
			//nothing EMoflonEdge tMember__tClass____definedBy = (EMoflonEdge) result5_green[4];

			// 
			MemberInClassVisibilityImpl.pattern_MemberInClassVisibility_10_6_registerobjectstomatch_expressionBBBBB(
					this, match, tMember, tModifier, tClass);
			return MemberInClassVisibilityImpl.pattern_MemberInClassVisibility_10_7_expressionF();
		} else {
			return MemberInClassVisibilityImpl.pattern_MemberInClassVisibility_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = MemberInClassVisibilityImpl
				.pattern_MemberInClassVisibility_11_1_performtransformation_bindingAndBlackFFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		ClassDeclaration mClass = (ClassDeclaration) result1_bindingAndBlack[0];
		TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result1_bindingAndBlack[1];
		MDefinition mDefinition = (MDefinition) result1_bindingAndBlack[2];
		TMember tMember = (TMember) result1_bindingAndBlack[3];
		TModifier tModifier = (TModifier) result1_bindingAndBlack[4];
		TClass tClass = (TClass) result1_bindingAndBlack[5];
		MDefinitionToTMember defToMember = (MDefinitionToTMember) result1_bindingAndBlack[6];
		CSP csp = (CSP) result1_bindingAndBlack[7];
		Object[] result1_green = MemberInClassVisibilityImpl
				.pattern_MemberInClassVisibility_11_1_performtransformation_greenBFFBB(mDefinition, tModifier, csp);
		MModifierToTModifier mModifierToTModifier = (MModifierToTModifier) result1_green[1];
		Modifier mModifier = (Modifier) result1_green[2];

		Object[] result2_black = MemberInClassVisibilityImpl
				.pattern_MemberInClassVisibility_11_2_collecttranslatedelements_blackBBB(mModifierToTModifier,
						mModifier, tModifier);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[mModifierToTModifier] = " + mModifierToTModifier
							+ ", " + "[mModifier] = " + mModifier + ", " + "[tModifier] = " + tModifier + ".");
		}
		Object[] result2_green = MemberInClassVisibilityImpl
				.pattern_MemberInClassVisibility_11_2_collecttranslatedelements_greenFBBB(mModifierToTModifier,
						mModifier, tModifier);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = MemberInClassVisibilityImpl
				.pattern_MemberInClassVisibility_11_3_bookkeepingforedges_blackBBBBBBBBBB(ruleresult, mClass,
						mTypeToTType, mDefinition, mModifierToTModifier, mModifier, tMember, tModifier, tClass,
						defToMember);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[mClass] = " + mClass + ", " + "[mTypeToTType] = " + mTypeToTType + ", "
					+ "[mDefinition] = " + mDefinition + ", " + "[mModifierToTModifier] = " + mModifierToTModifier
					+ ", " + "[mModifier] = " + mModifier + ", " + "[tMember] = " + tMember + ", " + "[tModifier] = "
					+ tModifier + ", " + "[tClass] = " + tClass + ", " + "[defToMember] = " + defToMember + ".");
		}
		MemberInClassVisibilityImpl.pattern_MemberInClassVisibility_11_3_bookkeepingforedges_greenBBBBBBFFFFF(
				ruleresult, mDefinition, mModifierToTModifier, mModifier, tMember, tModifier);
		//nothing EMoflonEdge mModifierToTModifier__mModifier____source = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge mDefinition__mModifier____modifier = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge mModifier__mDefinition____bodyDeclaration = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge tMember__tModifier____tModifier = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge mModifierToTModifier__tModifier____target = (EMoflonEdge) result3_green[10];

		// 
		// 
		MemberInClassVisibilityImpl.pattern_MemberInClassVisibility_11_5_registerobjects_expressionBBBBBBBBBBB(this,
				ruleresult, mClass, mTypeToTType, mDefinition, mModifierToTModifier, mModifier, tMember, tModifier,
				tClass, defToMember);
		return MemberInClassVisibilityImpl.pattern_MemberInClassVisibility_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = MemberInClassVisibilityImpl
				.pattern_MemberInClassVisibility_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = MemberInClassVisibilityImpl
				.pattern_MemberInClassVisibility_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = MemberInClassVisibilityImpl
				.pattern_MemberInClassVisibility_12_2_corematch_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		TMember tMember = (TMember) result2_binding[0];
		TModifier tModifier = (TModifier) result2_binding[1];
		TClass tClass = (TClass) result2_binding[2];
		for (Object[] result2_black : MemberInClassVisibilityImpl
				.pattern_MemberInClassVisibility_12_2_corematch_blackFFFBBBFB(tMember, tModifier, tClass, match)) {
			ClassDeclaration mClass = (ClassDeclaration) result2_black[0];
			TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result2_black[1];
			MDefinition mDefinition = (MDefinition) result2_black[2];
			MDefinitionToTMember defToMember = (MDefinitionToTMember) result2_black[6];
			// ForEach 
			for (Object[] result3_black : MemberInClassVisibilityImpl
					.pattern_MemberInClassVisibility_12_3_findcontext_blackBBBBBBB(mClass, mTypeToTType, mDefinition,
							tMember, tModifier, tClass, defToMember)) {
				Object[] result3_green = MemberInClassVisibilityImpl
						.pattern_MemberInClassVisibility_12_3_findcontext_greenBBBBBBBFFFFFFFFFF(mClass, mTypeToTType,
								mDefinition, tMember, tModifier, tClass, defToMember);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[7];
				//nothing EMoflonEdge mClass__mDefinition____bodyDeclarations = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge mDefinition__mClass____abstractTypeDeclaration = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge mTypeToTType__mClass____source = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge tMember__tModifier____tModifier = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge mTypeToTType__tClass____target = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge tClass__tMember____defines = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge tMember__tClass____definedBy = (EMoflonEdge) result3_green[14];
				//nothing EMoflonEdge defToMember__tMember____target = (EMoflonEdge) result3_green[15];
				//nothing EMoflonEdge defToMember__mDefinition____source = (EMoflonEdge) result3_green[16];

				Object[] result4_bindingAndBlack = MemberInClassVisibilityImpl
						.pattern_MemberInClassVisibility_12_4_solveCSP_bindingAndBlackFBBBBBBBBB(this,
								isApplicableMatch, mClass, mTypeToTType, mDefinition, tMember, tModifier, tClass,
								defToMember);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[mClass] = " + mClass + ", "
							+ "[mTypeToTType] = " + mTypeToTType + ", " + "[mDefinition] = " + mDefinition + ", "
							+ "[tMember] = " + tMember + ", " + "[tModifier] = " + tModifier + ", " + "[tClass] = "
							+ tClass + ", " + "[defToMember] = " + defToMember + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (MemberInClassVisibilityImpl.pattern_MemberInClassVisibility_12_5_checkCSP_expressionFBB(this,
						csp)) {

					Object[] result6_black = MemberInClassVisibilityImpl
							.pattern_MemberInClassVisibility_12_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					MemberInClassVisibilityImpl.pattern_MemberInClassVisibility_12_6_addmatchtoruleresult_greenBB(
							ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return MemberInClassVisibilityImpl.pattern_MemberInClassVisibility_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, TMember tMember, TModifier tModifier, TClass tClass) {
		match.registerObject("tMember", tMember);
		match.registerObject("tModifier", tModifier);
		match.registerObject("tClass", tClass);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, TMember tMember, TModifier tModifier, TClass tClass) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, ClassDeclaration mClass,
			TypeToTAbstractType mTypeToTType, MDefinition mDefinition, TMember tMember, TModifier tModifier,
			TClass tClass, MDefinitionToTMember defToMember) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_tModifier_isStatic = CSPFactoryHelper.eINSTANCE.createVariable("tModifier.isStatic", true, csp);
		var_tModifier_isStatic.setValue(tModifier.isIsStatic());
		var_tModifier_isStatic.setType("Boolean");
		Variable var_tModifier_tVisibility = CSPFactoryHelper.eINSTANCE.createVariable("tModifier.tVisibility", true,
				csp);
		var_tModifier_tVisibility.setValue(tModifier.getTVisibility());
		var_tModifier_tVisibility.setType("basic.TVisibility");

		// Create unbound variables
		Variable var_mModifier_static = CSPFactoryHelper.eINSTANCE.createVariable("mModifier.static", csp);
		var_mModifier_static.setType("Boolean");
		Variable var_mModifier_visibility = CSPFactoryHelper.eINSTANCE.createVariable("mModifier.visibility", csp);
		var_mModifier_visibility.setType("java.VisibilityKind");

		// Create constraints
		Eq eq = new Eq();
		DefaultVisibility defaultVisibility = new DefaultVisibility();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(defaultVisibility);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_mModifier_static, var_tModifier_isStatic);
		defaultVisibility.setRuleName("NoRuleName");
		defaultVisibility.solve(var_mModifier_visibility, var_tModifier_tVisibility);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("mClass", mClass);
		isApplicableMatch.registerObject("mTypeToTType", mTypeToTType);
		isApplicableMatch.registerObject("mDefinition", mDefinition);
		isApplicableMatch.registerObject("tMember", tMember);
		isApplicableMatch.registerObject("tModifier", tModifier);
		isApplicableMatch.registerObject("tClass", tClass);
		isApplicableMatch.registerObject("defToMember", defToMember);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject mClass, EObject mTypeToTType,
			EObject mDefinition, EObject mModifierToTModifier, EObject mModifier, EObject tMember, EObject tModifier,
			EObject tClass, EObject defToMember) {
		ruleresult.registerObject("mClass", mClass);
		ruleresult.registerObject("mTypeToTType", mTypeToTType);
		ruleresult.registerObject("mDefinition", mDefinition);
		ruleresult.registerObject("mModifierToTModifier", mModifierToTModifier);
		ruleresult.registerObject("mModifier", mModifier);
		ruleresult.registerObject("tMember", tMember);
		ruleresult.registerObject("tModifier", tModifier);
		ruleresult.registerObject("tClass", tClass);
		ruleresult.registerObject("defToMember", defToMember);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("tModifier").eClass())
				.equals("basic.TModifier.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_41(EMoflonEdge _edge_tModifier) {

		Object[] result1_bindingAndBlack = MemberInClassVisibilityImpl
				.pattern_MemberInClassVisibility_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = MemberInClassVisibilityImpl
				.pattern_MemberInClassVisibility_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : MemberInClassVisibilityImpl
				.pattern_MemberInClassVisibility_20_2_testcorematchandDECs_blackFFFB(_edge_tModifier)) {
			TMember tMember = (TMember) result2_black[0];
			TModifier tModifier = (TModifier) result2_black[1];
			TClass tClass = (TClass) result2_black[2];
			Object[] result2_green = MemberInClassVisibilityImpl
					.pattern_MemberInClassVisibility_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (MemberInClassVisibilityImpl
					.pattern_MemberInClassVisibility_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
							this, match, tMember, tModifier, tClass)) {
				// 
				if (MemberInClassVisibilityImpl
						.pattern_MemberInClassVisibility_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = MemberInClassVisibilityImpl
							.pattern_MemberInClassVisibility_20_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					MemberInClassVisibilityImpl.pattern_MemberInClassVisibility_20_5_Addmatchtoruleresult_greenBBBB(
							match, __performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return MemberInClassVisibilityImpl.pattern_MemberInClassVisibility_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_42(EMoflonEdge _edge_modifier) {

		Object[] result1_bindingAndBlack = MemberInClassVisibilityImpl
				.pattern_MemberInClassVisibility_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = MemberInClassVisibilityImpl
				.pattern_MemberInClassVisibility_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : MemberInClassVisibilityImpl
				.pattern_MemberInClassVisibility_21_2_testcorematchandDECs_blackFFFB(_edge_modifier)) {
			ClassDeclaration mClass = (ClassDeclaration) result2_black[0];
			MDefinition mDefinition = (MDefinition) result2_black[1];
			Modifier mModifier = (Modifier) result2_black[2];
			Object[] result2_green = MemberInClassVisibilityImpl
					.pattern_MemberInClassVisibility_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (MemberInClassVisibilityImpl
					.pattern_MemberInClassVisibility_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
							this, match, mClass, mDefinition, mModifier)) {
				// 
				if (MemberInClassVisibilityImpl
						.pattern_MemberInClassVisibility_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = MemberInClassVisibilityImpl
							.pattern_MemberInClassVisibility_21_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					MemberInClassVisibilityImpl.pattern_MemberInClassVisibility_21_5_Addmatchtoruleresult_greenBBBB(
							match, __performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return MemberInClassVisibilityImpl.pattern_MemberInClassVisibility_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("MemberInClassVisibility");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		Variable var_mModifier_static = CSPFactoryHelper.eINSTANCE.createVariable("mModifier", true, csp);
		var_mModifier_static.setValue(__helper.getValue("mModifier", "static"));
		var_mModifier_static.setType("boolean");

		Variable var_tModifier_isStatic = CSPFactoryHelper.eINSTANCE.createVariable("tModifier", true, csp);
		var_tModifier_isStatic.setValue(__helper.getValue("tModifier", "isStatic"));
		var_tModifier_isStatic.setType("boolean");

		Variable var_tModifier_tVisibility = CSPFactoryHelper.eINSTANCE.createVariable("tModifier", true, csp);
		var_tModifier_tVisibility.setValue(__helper.getValue("tModifier", "tVisibility"));
		var_tModifier_tVisibility.setType("basic.TVisibility");

		Variable var_mModifier_visibility = CSPFactoryHelper.eINSTANCE.createVariable("mModifier", true, csp);
		var_mModifier_visibility.setValue(__helper.getValue("mModifier", "visibility"));
		var_mModifier_visibility.setType("java.VisibilityKind");

		Eq eq0 = new Eq();
		csp.getConstraints().add(eq0);

		DefaultVisibility defaultVisibility1 = new DefaultVisibility();
		csp.getConstraints().add(defaultVisibility1);

		eq0.setRuleName("MemberInClassVisibility");
		eq0.solve(var_mModifier_static, var_tModifier_isStatic);

		defaultVisibility1.setRuleName("MemberInClassVisibility");
		defaultVisibility1.solve(var_mModifier_visibility, var_tModifier_tVisibility);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_tModifier_isStatic.setBound(false);
			var_tModifier_tVisibility.setBound(false);
			eq0.solve(var_mModifier_static, var_tModifier_isStatic);
			defaultVisibility1.solve(var_mModifier_visibility, var_tModifier_tVisibility);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
				__helper.setValue("tModifier", "isStatic", var_tModifier_isStatic.getValue());
				__helper.setValue("tModifier", "tVisibility", var_tModifier_tVisibility.getValue());
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
		ruleResult.setRule("MemberInClassVisibility");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		Variable var_mModifier_static = CSPFactoryHelper.eINSTANCE.createVariable("mModifier", true, csp);
		var_mModifier_static.setValue(__helper.getValue("mModifier", "static"));
		var_mModifier_static.setType("boolean");

		Variable var_tModifier_isStatic = CSPFactoryHelper.eINSTANCE.createVariable("tModifier", true, csp);
		var_tModifier_isStatic.setValue(__helper.getValue("tModifier", "isStatic"));
		var_tModifier_isStatic.setType("boolean");

		Variable var_tModifier_tVisibility = CSPFactoryHelper.eINSTANCE.createVariable("tModifier", true, csp);
		var_tModifier_tVisibility.setValue(__helper.getValue("tModifier", "tVisibility"));
		var_tModifier_tVisibility.setType("basic.TVisibility");

		Variable var_mModifier_visibility = CSPFactoryHelper.eINSTANCE.createVariable("mModifier", true, csp);
		var_mModifier_visibility.setValue(__helper.getValue("mModifier", "visibility"));
		var_mModifier_visibility.setType("java.VisibilityKind");

		Eq eq0 = new Eq();
		csp.getConstraints().add(eq0);

		DefaultVisibility defaultVisibility1 = new DefaultVisibility();
		csp.getConstraints().add(defaultVisibility1);

		eq0.setRuleName("MemberInClassVisibility");
		eq0.solve(var_mModifier_static, var_tModifier_isStatic);

		defaultVisibility1.setRuleName("MemberInClassVisibility");
		defaultVisibility1.solve(var_mModifier_visibility, var_tModifier_tVisibility);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_mModifier_static.setBound(false);
			var_mModifier_visibility.setBound(false);
			eq0.solve(var_mModifier_static, var_tModifier_isStatic);
			defaultVisibility1.solve(var_mModifier_visibility, var_tModifier_tVisibility);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
				__helper.setValue("mModifier", "static", var_mModifier_static.getValue());
				__helper.setValue("mModifier", "visibility", var_mModifier_visibility.getValue());
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

		Object[] result1_black = MemberInClassVisibilityImpl.pattern_MemberInClassVisibility_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = MemberInClassVisibilityImpl.pattern_MemberInClassVisibility_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = MemberInClassVisibilityImpl
				.pattern_MemberInClassVisibility_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFBB(sourceMatch,
						targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		ClassDeclaration mClass = (ClassDeclaration) result2_bindingAndBlack[0];
		MDefinition mDefinition = (MDefinition) result2_bindingAndBlack[1];
		Modifier mModifier = (Modifier) result2_bindingAndBlack[2];
		TMember tMember = (TMember) result2_bindingAndBlack[3];
		TModifier tModifier = (TModifier) result2_bindingAndBlack[4];
		TClass tClass = (TClass) result2_bindingAndBlack[5];

		Object[] result3_bindingAndBlack = MemberInClassVisibilityImpl
				.pattern_MemberInClassVisibility_24_3_solvecsp_bindingAndBlackFBBBBBBBBB(this, mClass, mDefinition,
						mModifier, tMember, tModifier, tClass, sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[mClass] = " + mClass + ", " + "[mDefinition] = " + mDefinition + ", " + "[mModifier] = "
					+ mModifier + ", " + "[tMember] = " + tMember + ", " + "[tModifier] = " + tModifier + ", "
					+ "[tClass] = " + tClass + ", " + "[sourceMatch] = " + sourceMatch + ", " + "[targetMatch] = "
					+ targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (MemberInClassVisibilityImpl.pattern_MemberInClassVisibility_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : MemberInClassVisibilityImpl
					.pattern_MemberInClassVisibility_24_5_matchcorrcontext_blackBFBBBFBB(mClass, mDefinition, tMember,
							tClass, sourceMatch, targetMatch)) {
				TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result5_black[1];
				MDefinitionToTMember defToMember = (MDefinitionToTMember) result5_black[5];
				Object[] result5_green = MemberInClassVisibilityImpl
						.pattern_MemberInClassVisibility_24_5_matchcorrcontext_greenBBBBF(mTypeToTType, defToMember,
								sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[4];

				Object[] result6_black = MemberInClassVisibilityImpl
						.pattern_MemberInClassVisibility_24_6_createcorrespondence_blackBBBBBBB(mClass, mDefinition,
								mModifier, tMember, tModifier, tClass, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[mClass] = " + mClass
							+ ", " + "[mDefinition] = " + mDefinition + ", " + "[mModifier] = " + mModifier + ", "
							+ "[tMember] = " + tMember + ", " + "[tModifier] = " + tModifier + ", " + "[tClass] = "
							+ tClass + ", " + "[ccMatch] = " + ccMatch + ".");
				}
				MemberInClassVisibilityImpl.pattern_MemberInClassVisibility_24_6_createcorrespondence_greenFBBB(
						mModifier, tModifier, ccMatch);
				//nothing MModifierToTModifier mModifierToTModifier = (MModifierToTModifier) result6_green[0];

				Object[] result7_black = MemberInClassVisibilityImpl
						.pattern_MemberInClassVisibility_24_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				MemberInClassVisibilityImpl.pattern_MemberInClassVisibility_24_7_addtoreturnedresult_greenBB(result,
						ccMatch);

			}

		} else {
		}
		return MemberInClassVisibilityImpl.pattern_MemberInClassVisibility_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(ClassDeclaration mClass, MDefinition mDefinition, Modifier mModifier,
			TMember tMember, TModifier tModifier, TClass tClass, Match sourceMatch, Match targetMatch) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals

		// Create attribute variables
		Variable var_mModifier_static = CSPFactoryHelper.eINSTANCE.createVariable("mModifier.static", true, csp);
		var_mModifier_static.setValue(mModifier.isStatic());
		var_mModifier_static.setType("Boolean");
		Variable var_tModifier_isStatic = CSPFactoryHelper.eINSTANCE.createVariable("tModifier.isStatic", true, csp);
		var_tModifier_isStatic.setValue(tModifier.isIsStatic());
		var_tModifier_isStatic.setType("Boolean");
		Variable var_mModifier_visibility = CSPFactoryHelper.eINSTANCE.createVariable("mModifier.visibility", true,
				csp);
		var_mModifier_visibility.setValue(mModifier.getVisibility());
		var_mModifier_visibility.setType("java.VisibilityKind");
		Variable var_tModifier_tVisibility = CSPFactoryHelper.eINSTANCE.createVariable("tModifier.tVisibility", true,
				csp);
		var_tModifier_tVisibility.setValue(tModifier.getTVisibility());
		var_tModifier_tVisibility.setType("basic.TVisibility");

		// Create unbound variables

		// Create constraints
		Eq eq = new Eq();
		DefaultVisibility defaultVisibility = new DefaultVisibility();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(defaultVisibility);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_mModifier_static, var_tModifier_isStatic);
		defaultVisibility.setRuleName("NoRuleName");
		defaultVisibility.solve(var_mModifier_visibility, var_tModifier_tVisibility);
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
	public boolean checkDEC_FWD(ClassDeclaration mClass, MDefinition mDefinition, Modifier mModifier) {// 
		Object[] result1_black = MemberInClassVisibilityImpl
				.pattern_MemberInClassVisibility_27_1_matchtggpattern_blackBBB(mClass, mDefinition, mModifier);
		if (result1_black != null) {
			return MemberInClassVisibilityImpl.pattern_MemberInClassVisibility_27_2_expressionF();
		} else {
			return MemberInClassVisibilityImpl.pattern_MemberInClassVisibility_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(TMember tMember, TModifier tModifier, TClass tClass) {// 
		Object[] result1_black = MemberInClassVisibilityImpl
				.pattern_MemberInClassVisibility_28_1_matchtggpattern_blackBBB(tMember, tModifier, tClass);
		if (result1_black != null) {
			return MemberInClassVisibilityImpl.pattern_MemberInClassVisibility_28_2_expressionF();
		} else {
			return MemberInClassVisibilityImpl.pattern_MemberInClassVisibility_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer,
			MDefinitionToTMember defToMemberParameter) {

		Object[] result1_black = MemberInClassVisibilityImpl
				.pattern_MemberInClassVisibility_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = MemberInClassVisibilityImpl
				.pattern_MemberInClassVisibility_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : MemberInClassVisibilityImpl
				.pattern_MemberInClassVisibility_29_2_isapplicablecore_blackFFFFFFFBB(ruleEntryContainer, ruleResult)) {
			//nothing RuleEntryList defToMemberList = (RuleEntryList) result2_black[0];
			ClassDeclaration mClass = (ClassDeclaration) result2_black[1];
			MDefinition mDefinition = (MDefinition) result2_black[2];
			MDefinitionToTMember defToMember = (MDefinitionToTMember) result2_black[3];
			TMember tMember = (TMember) result2_black[4];
			TClass tClass = (TClass) result2_black[5];
			TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result2_black[6];

			Object[] result3_bindingAndBlack = MemberInClassVisibilityImpl
					.pattern_MemberInClassVisibility_29_3_solveCSP_bindingAndBlackFBBBBBBBBB(this, isApplicableMatch,
							mClass, mTypeToTType, mDefinition, tMember, tClass, defToMember, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[mClass] = " + mClass + ", "
						+ "[mTypeToTType] = " + mTypeToTType + ", " + "[mDefinition] = " + mDefinition + ", "
						+ "[tMember] = " + tMember + ", " + "[tClass] = " + tClass + ", " + "[defToMember] = "
						+ defToMember + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (MemberInClassVisibilityImpl.pattern_MemberInClassVisibility_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = MemberInClassVisibilityImpl
						.pattern_MemberInClassVisibility_29_5_checknacs_blackBBBBBB(mClass, mTypeToTType, mDefinition,
								tMember, tClass, defToMember);
				if (result5_black != null) {

					Object[] result6_black = MemberInClassVisibilityImpl
							.pattern_MemberInClassVisibility_29_6_perform_blackBBBBBBB(mClass, mTypeToTType,
									mDefinition, tMember, tClass, defToMember, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[mClass] = " + mClass
								+ ", " + "[mTypeToTType] = " + mTypeToTType + ", " + "[mDefinition] = " + mDefinition
								+ ", " + "[tMember] = " + tMember + ", " + "[tClass] = " + tClass + ", "
								+ "[defToMember] = " + defToMember + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					MemberInClassVisibilityImpl.pattern_MemberInClassVisibility_29_6_perform_greenBFFBFBB(mDefinition,
							tMember, ruleResult, csp);
					//nothing MModifierToTModifier mModifierToTModifier = (MModifierToTModifier) result6_green[1];
					//nothing Modifier mModifier = (Modifier) result6_green[2];
					//nothing TModifier tModifier = (TModifier) result6_green[4];

				} else {
				}

			} else {
			}

		}
		return MemberInClassVisibilityImpl.pattern_MemberInClassVisibility_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, ClassDeclaration mClass,
			TypeToTAbstractType mTypeToTType, MDefinition mDefinition, TMember tMember, TClass tClass,
			MDefinitionToTMember defToMember, ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables
		Variable var_mModifier_static = CSPFactoryHelper.eINSTANCE.createVariable("mModifier.static", csp);
		var_mModifier_static.setType("Boolean");
		Variable var_tModifier_isStatic = CSPFactoryHelper.eINSTANCE.createVariable("tModifier.isStatic", csp);
		var_tModifier_isStatic.setType("Boolean");
		Variable var_mModifier_visibility = CSPFactoryHelper.eINSTANCE.createVariable("mModifier.visibility", csp);
		var_mModifier_visibility.setType("java.VisibilityKind");
		Variable var_tModifier_tVisibility = CSPFactoryHelper.eINSTANCE.createVariable("tModifier.tVisibility", csp);
		var_tModifier_tVisibility.setType("basic.TVisibility");

		// Create constraints
		Eq eq = new Eq();
		DefaultVisibility defaultVisibility = new DefaultVisibility();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(defaultVisibility);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_mModifier_static, var_tModifier_isStatic);
		defaultVisibility.setRuleName("NoRuleName");
		defaultVisibility.solve(var_mModifier_visibility, var_tModifier_tVisibility);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("mClass", mClass);
		isApplicableMatch.registerObject("mTypeToTType", mTypeToTType);
		isApplicableMatch.registerObject("mDefinition", mDefinition);
		isApplicableMatch.registerObject("tMember", tMember);
		isApplicableMatch.registerObject("tClass", tClass);
		isApplicableMatch.registerObject("defToMember", defToMember);
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
		case RulesPackage.MEMBER_IN_CLASS_VISIBILITY___IS_APPROPRIATE_FWD__MATCH_CLASSDECLARATION_MDEFINITION_MODIFIER:
			return isAppropriate_FWD((Match) arguments.get(0), (ClassDeclaration) arguments.get(1),
					(MDefinition) arguments.get(2), (Modifier) arguments.get(3));
		case RulesPackage.MEMBER_IN_CLASS_VISIBILITY___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.MEMBER_IN_CLASS_VISIBILITY___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.MEMBER_IN_CLASS_VISIBILITY___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_CLASSDECLARATION_MDEFINITION_MODIFIER:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (ClassDeclaration) arguments.get(1),
					(MDefinition) arguments.get(2), (Modifier) arguments.get(3));
			return null;
		case RulesPackage.MEMBER_IN_CLASS_VISIBILITY___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_CLASSDECLARATION_MDEFINITION_MODIFIER:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (ClassDeclaration) arguments.get(1),
					(MDefinition) arguments.get(2), (Modifier) arguments.get(3));
		case RulesPackage.MEMBER_IN_CLASS_VISIBILITY___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.MEMBER_IN_CLASS_VISIBILITY___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_CLASSDECLARATION_TYPETOTABSTRACTTYPE_MDEFINITION_MODIFIER_TMEMBER_TCLASS_MDEFINITIONTOTMEMBER:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (ClassDeclaration) arguments.get(1),
					(TypeToTAbstractType) arguments.get(2), (MDefinition) arguments.get(3), (Modifier) arguments.get(4),
					(TMember) arguments.get(5), (TClass) arguments.get(6), (MDefinitionToTMember) arguments.get(7));
		case RulesPackage.MEMBER_IN_CLASS_VISIBILITY___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.MEMBER_IN_CLASS_VISIBILITY___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9));
			return null;
		case RulesPackage.MEMBER_IN_CLASS_VISIBILITY___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.MEMBER_IN_CLASS_VISIBILITY___IS_APPROPRIATE_BWD__MATCH_TMEMBER_TMODIFIER_TCLASS:
			return isAppropriate_BWD((Match) arguments.get(0), (TMember) arguments.get(1), (TModifier) arguments.get(2),
					(TClass) arguments.get(3));
		case RulesPackage.MEMBER_IN_CLASS_VISIBILITY___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.MEMBER_IN_CLASS_VISIBILITY___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.MEMBER_IN_CLASS_VISIBILITY___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TMEMBER_TMODIFIER_TCLASS:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (TMember) arguments.get(1),
					(TModifier) arguments.get(2), (TClass) arguments.get(3));
			return null;
		case RulesPackage.MEMBER_IN_CLASS_VISIBILITY___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TMEMBER_TMODIFIER_TCLASS:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (TMember) arguments.get(1),
					(TModifier) arguments.get(2), (TClass) arguments.get(3));
		case RulesPackage.MEMBER_IN_CLASS_VISIBILITY___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.MEMBER_IN_CLASS_VISIBILITY___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_CLASSDECLARATION_TYPETOTABSTRACTTYPE_MDEFINITION_TMEMBER_TMODIFIER_TCLASS_MDEFINITIONTOTMEMBER:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (ClassDeclaration) arguments.get(1),
					(TypeToTAbstractType) arguments.get(2), (MDefinition) arguments.get(3), (TMember) arguments.get(4),
					(TModifier) arguments.get(5), (TClass) arguments.get(6), (MDefinitionToTMember) arguments.get(7));
		case RulesPackage.MEMBER_IN_CLASS_VISIBILITY___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.MEMBER_IN_CLASS_VISIBILITY___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9));
			return null;
		case RulesPackage.MEMBER_IN_CLASS_VISIBILITY___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.MEMBER_IN_CLASS_VISIBILITY___IS_APPROPRIATE_BWD_EMOFLON_EDGE_41__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_41((EMoflonEdge) arguments.get(0));
		case RulesPackage.MEMBER_IN_CLASS_VISIBILITY___IS_APPROPRIATE_FWD_EMOFLON_EDGE_42__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_42((EMoflonEdge) arguments.get(0));
		case RulesPackage.MEMBER_IN_CLASS_VISIBILITY___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.MEMBER_IN_CLASS_VISIBILITY___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.MEMBER_IN_CLASS_VISIBILITY___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.MEMBER_IN_CLASS_VISIBILITY___IS_APPLICABLE_SOLVE_CSP_CC__CLASSDECLARATION_MDEFINITION_MODIFIER_TMEMBER_TMODIFIER_TCLASS_MATCH_MATCH:
			return isApplicable_solveCsp_CC((ClassDeclaration) arguments.get(0), (MDefinition) arguments.get(1),
					(Modifier) arguments.get(2), (TMember) arguments.get(3), (TModifier) arguments.get(4),
					(TClass) arguments.get(5), (Match) arguments.get(6), (Match) arguments.get(7));
		case RulesPackage.MEMBER_IN_CLASS_VISIBILITY___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.MEMBER_IN_CLASS_VISIBILITY___CHECK_DEC_FWD__CLASSDECLARATION_MDEFINITION_MODIFIER:
			return checkDEC_FWD((ClassDeclaration) arguments.get(0), (MDefinition) arguments.get(1),
					(Modifier) arguments.get(2));
		case RulesPackage.MEMBER_IN_CLASS_VISIBILITY___CHECK_DEC_BWD__TMEMBER_TMODIFIER_TCLASS:
			return checkDEC_BWD((TMember) arguments.get(0), (TModifier) arguments.get(1), (TClass) arguments.get(2));
		case RulesPackage.MEMBER_IN_CLASS_VISIBILITY___GENERATE_MODEL__RULEENTRYCONTAINER_MDEFINITIONTOTMEMBER:
			return generateModel((RuleEntryContainer) arguments.get(0), (MDefinitionToTMember) arguments.get(1));
		case RulesPackage.MEMBER_IN_CLASS_VISIBILITY___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_CLASSDECLARATION_TYPETOTABSTRACTTYPE_MDEFINITION_TMEMBER_TCLASS_MDEFINITIONTOTMEMBER_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (ClassDeclaration) arguments.get(1),
					(TypeToTAbstractType) arguments.get(2), (MDefinition) arguments.get(3), (TMember) arguments.get(4),
					(TClass) arguments.get(5), (MDefinitionToTMember) arguments.get(6),
					(ModelgeneratorRuleResult) arguments.get(7));
		case RulesPackage.MEMBER_IN_CLASS_VISIBILITY___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_MemberInClassVisibility_0_1_initialbindings_blackBBBBB(
			MemberInClassVisibility _this, Match match, ClassDeclaration mClass, MDefinition mDefinition,
			Modifier mModifier) {
		return new Object[] { _this, match, mClass, mDefinition, mModifier };
	}

	public static final Object[] pattern_MemberInClassVisibility_0_2_SolveCSP_bindingFBBBBB(
			MemberInClassVisibility _this, Match match, ClassDeclaration mClass, MDefinition mDefinition,
			Modifier mModifier) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, mClass, mDefinition, mModifier);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, mClass, mDefinition, mModifier };
		}
		return null;
	}

	public static final Object[] pattern_MemberInClassVisibility_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MemberInClassVisibility_0_2_SolveCSP_bindingAndBlackFBBBBB(
			MemberInClassVisibility _this, Match match, ClassDeclaration mClass, MDefinition mDefinition,
			Modifier mModifier) {
		Object[] result_pattern_MemberInClassVisibility_0_2_SolveCSP_binding = pattern_MemberInClassVisibility_0_2_SolveCSP_bindingFBBBBB(
				_this, match, mClass, mDefinition, mModifier);
		if (result_pattern_MemberInClassVisibility_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_MemberInClassVisibility_0_2_SolveCSP_binding[0];

			Object[] result_pattern_MemberInClassVisibility_0_2_SolveCSP_black = pattern_MemberInClassVisibility_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_MemberInClassVisibility_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, mClass, mDefinition, mModifier };
			}
		}
		return null;
	}

	public static final boolean pattern_MemberInClassVisibility_0_3_CheckCSP_expressionFBB(
			MemberInClassVisibility _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MemberInClassVisibility_0_4_collectelementstobetranslated_blackBBBB(
			Match match, ClassDeclaration mClass, MDefinition mDefinition, Modifier mModifier) {
		return new Object[] { match, mClass, mDefinition, mModifier };
	}

	public static final Object[] pattern_MemberInClassVisibility_0_4_collectelementstobetranslated_greenBBBFF(
			Match match, MDefinition mDefinition, Modifier mModifier) {
		EMoflonEdge mDefinition__mModifier____modifier = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mModifier__mDefinition____bodyDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(mModifier);
		String mDefinition__mModifier____modifier_name_prime = "modifier";
		String mModifier__mDefinition____bodyDeclaration_name_prime = "bodyDeclaration";
		mDefinition__mModifier____modifier.setSrc(mDefinition);
		mDefinition__mModifier____modifier.setTrg(mModifier);
		match.getToBeTranslatedEdges().add(mDefinition__mModifier____modifier);
		mModifier__mDefinition____bodyDeclaration.setSrc(mModifier);
		mModifier__mDefinition____bodyDeclaration.setTrg(mDefinition);
		match.getToBeTranslatedEdges().add(mModifier__mDefinition____bodyDeclaration);
		mDefinition__mModifier____modifier.setName(mDefinition__mModifier____modifier_name_prime);
		mModifier__mDefinition____bodyDeclaration.setName(mModifier__mDefinition____bodyDeclaration_name_prime);
		return new Object[] { match, mDefinition, mModifier, mDefinition__mModifier____modifier,
				mModifier__mDefinition____bodyDeclaration };
	}

	public static final Object[] pattern_MemberInClassVisibility_0_5_collectcontextelements_blackBBBB(Match match,
			ClassDeclaration mClass, MDefinition mDefinition, Modifier mModifier) {
		return new Object[] { match, mClass, mDefinition, mModifier };
	}

	public static final Object[] pattern_MemberInClassVisibility_0_5_collectcontextelements_greenBBBFF(Match match,
			ClassDeclaration mClass, MDefinition mDefinition) {
		EMoflonEdge mClass__mDefinition____bodyDeclarations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mDefinition__mClass____abstractTypeDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(mClass);
		match.getContextNodes().add(mDefinition);
		String mClass__mDefinition____bodyDeclarations_name_prime = "bodyDeclarations";
		String mDefinition__mClass____abstractTypeDeclaration_name_prime = "abstractTypeDeclaration";
		mClass__mDefinition____bodyDeclarations.setSrc(mClass);
		mClass__mDefinition____bodyDeclarations.setTrg(mDefinition);
		match.getContextEdges().add(mClass__mDefinition____bodyDeclarations);
		mDefinition__mClass____abstractTypeDeclaration.setSrc(mDefinition);
		mDefinition__mClass____abstractTypeDeclaration.setTrg(mClass);
		match.getContextEdges().add(mDefinition__mClass____abstractTypeDeclaration);
		mClass__mDefinition____bodyDeclarations.setName(mClass__mDefinition____bodyDeclarations_name_prime);
		mDefinition__mClass____abstractTypeDeclaration
				.setName(mDefinition__mClass____abstractTypeDeclaration_name_prime);
		return new Object[] { match, mClass, mDefinition, mClass__mDefinition____bodyDeclarations,
				mDefinition__mClass____abstractTypeDeclaration };
	}

	public static final void pattern_MemberInClassVisibility_0_6_registerobjectstomatch_expressionBBBBB(
			MemberInClassVisibility _this, Match match, ClassDeclaration mClass, MDefinition mDefinition,
			Modifier mModifier) {
		_this.registerObjectsToMatch_FWD(match, mClass, mDefinition, mModifier);

	}

	public static final boolean pattern_MemberInClassVisibility_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_MemberInClassVisibility_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_MemberInClassVisibility_1_1_performtransformation_bindingFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("mClass");
		EObject _localVariable_1 = isApplicableMatch.getObject("mTypeToTType");
		EObject _localVariable_2 = isApplicableMatch.getObject("mDefinition");
		EObject _localVariable_3 = isApplicableMatch.getObject("mModifier");
		EObject _localVariable_4 = isApplicableMatch.getObject("tMember");
		EObject _localVariable_5 = isApplicableMatch.getObject("tClass");
		EObject _localVariable_6 = isApplicableMatch.getObject("defToMember");
		EObject tmpMClass = _localVariable_0;
		EObject tmpMTypeToTType = _localVariable_1;
		EObject tmpMDefinition = _localVariable_2;
		EObject tmpMModifier = _localVariable_3;
		EObject tmpTMember = _localVariable_4;
		EObject tmpTClass = _localVariable_5;
		EObject tmpDefToMember = _localVariable_6;
		if (tmpMClass instanceof ClassDeclaration) {
			ClassDeclaration mClass = (ClassDeclaration) tmpMClass;
			if (tmpMTypeToTType instanceof TypeToTAbstractType) {
				TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) tmpMTypeToTType;
				if (tmpMDefinition instanceof MDefinition) {
					MDefinition mDefinition = (MDefinition) tmpMDefinition;
					if (tmpMModifier instanceof Modifier) {
						Modifier mModifier = (Modifier) tmpMModifier;
						if (tmpTMember instanceof TMember) {
							TMember tMember = (TMember) tmpTMember;
							if (tmpTClass instanceof TClass) {
								TClass tClass = (TClass) tmpTClass;
								if (tmpDefToMember instanceof MDefinitionToTMember) {
									MDefinitionToTMember defToMember = (MDefinitionToTMember) tmpDefToMember;
									return new Object[] { mClass, mTypeToTType, mDefinition, mModifier, tMember, tClass,
											defToMember, isApplicableMatch };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_MemberInClassVisibility_1_1_performtransformation_blackBBBBBBBFBB(
			ClassDeclaration mClass, TypeToTAbstractType mTypeToTType, MDefinition mDefinition, Modifier mModifier,
			TMember tMember, TClass tClass, MDefinitionToTMember defToMember, MemberInClassVisibility _this,
			IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { mClass, mTypeToTType, mDefinition, mModifier, tMember, tClass, defToMember, csp,
						_this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_MemberInClassVisibility_1_1_performtransformation_bindingAndBlackFFFFFFFFBB(
			MemberInClassVisibility _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_MemberInClassVisibility_1_1_performtransformation_binding = pattern_MemberInClassVisibility_1_1_performtransformation_bindingFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_MemberInClassVisibility_1_1_performtransformation_binding != null) {
			ClassDeclaration mClass = (ClassDeclaration) result_pattern_MemberInClassVisibility_1_1_performtransformation_binding[0];
			TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result_pattern_MemberInClassVisibility_1_1_performtransformation_binding[1];
			MDefinition mDefinition = (MDefinition) result_pattern_MemberInClassVisibility_1_1_performtransformation_binding[2];
			Modifier mModifier = (Modifier) result_pattern_MemberInClassVisibility_1_1_performtransformation_binding[3];
			TMember tMember = (TMember) result_pattern_MemberInClassVisibility_1_1_performtransformation_binding[4];
			TClass tClass = (TClass) result_pattern_MemberInClassVisibility_1_1_performtransformation_binding[5];
			MDefinitionToTMember defToMember = (MDefinitionToTMember) result_pattern_MemberInClassVisibility_1_1_performtransformation_binding[6];

			Object[] result_pattern_MemberInClassVisibility_1_1_performtransformation_black = pattern_MemberInClassVisibility_1_1_performtransformation_blackBBBBBBBFBB(
					mClass, mTypeToTType, mDefinition, mModifier, tMember, tClass, defToMember, _this,
					isApplicableMatch);
			if (result_pattern_MemberInClassVisibility_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_MemberInClassVisibility_1_1_performtransformation_black[7];

				return new Object[] { mClass, mTypeToTType, mDefinition, mModifier, tMember, tClass, defToMember, csp,
						_this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_MemberInClassVisibility_1_1_performtransformation_greenFBBFB(
			Modifier mModifier, TMember tMember, CSP csp) {
		MModifierToTModifier mModifierToTModifier = PmFactory.eINSTANCE.createMModifierToTModifier();
		TModifier tModifier = BasicFactory.eINSTANCE.createTModifier();
		Object _localVariable_0 = csp.getValue("tModifier", "isStatic");
		Object _localVariable_1 = csp.getValue("tModifier", "tVisibility");
		mModifierToTModifier.setSource(mModifier);
		tMember.setTModifier(tModifier);
		mModifierToTModifier.setTarget(tModifier);
		boolean tModifier_isStatic_prime = (boolean) _localVariable_0;
		TVisibility tModifier_tVisibility_prime = (TVisibility) _localVariable_1;
		tModifier.setIsStatic(Boolean.valueOf(tModifier_isStatic_prime));
		tModifier.setTVisibility(tModifier_tVisibility_prime);
		return new Object[] { mModifierToTModifier, mModifier, tMember, tModifier, csp };
	}

	public static final Object[] pattern_MemberInClassVisibility_1_2_collecttranslatedelements_blackBBB(
			MModifierToTModifier mModifierToTModifier, Modifier mModifier, TModifier tModifier) {
		return new Object[] { mModifierToTModifier, mModifier, tModifier };
	}

	public static final Object[] pattern_MemberInClassVisibility_1_2_collecttranslatedelements_greenFBBB(
			MModifierToTModifier mModifierToTModifier, Modifier mModifier, TModifier tModifier) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(mModifierToTModifier);
		ruleresult.getTranslatedElements().add(mModifier);
		ruleresult.getCreatedElements().add(tModifier);
		return new Object[] { ruleresult, mModifierToTModifier, mModifier, tModifier };
	}

	public static final Object[] pattern_MemberInClassVisibility_1_3_bookkeepingforedges_blackBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject mClass, EObject mTypeToTType, EObject mDefinition,
			EObject mModifierToTModifier, EObject mModifier, EObject tMember, EObject tModifier, EObject tClass,
			EObject defToMember) {
		if (!mClass.equals(mTypeToTType)) {
			if (!mClass.equals(mDefinition)) {
				if (!mClass.equals(mModifierToTModifier)) {
					if (!mClass.equals(mModifier)) {
						if (!mClass.equals(tMember)) {
							if (!mClass.equals(tModifier)) {
								if (!mClass.equals(tClass)) {
									if (!mTypeToTType.equals(tMember)) {
										if (!mTypeToTType.equals(tModifier)) {
											if (!mTypeToTType.equals(tClass)) {
												if (!mDefinition.equals(mTypeToTType)) {
													if (!mDefinition.equals(mModifierToTModifier)) {
														if (!mDefinition.equals(mModifier)) {
															if (!mDefinition.equals(tMember)) {
																if (!mDefinition.equals(tModifier)) {
																	if (!mDefinition.equals(tClass)) {
																		if (!mModifierToTModifier
																				.equals(mTypeToTType)) {
																			if (!mModifierToTModifier.equals(tMember)) {
																				if (!mModifierToTModifier
																						.equals(tModifier)) {
																					if (!mModifierToTModifier
																							.equals(tClass)) {
																						if (!mModifier
																								.equals(mTypeToTType)) {
																							if (!mModifier.equals(
																									mModifierToTModifier)) {
																								if (!mModifier.equals(
																										tMember)) {
																									if (!mModifier
																											.equals(tModifier)) {
																										if (!mModifier
																												.equals(tClass)) {
																											if (!tMember
																													.equals(tModifier)) {
																												if (!tClass
																														.equals(tMember)) {
																													if (!tClass
																															.equals(tModifier)) {
																														if (!defToMember
																																.equals(mClass)) {
																															if (!defToMember
																																	.equals(mTypeToTType)) {
																																if (!defToMember
																																		.equals(mDefinition)) {
																																	if (!defToMember
																																			.equals(mModifierToTModifier)) {
																																		if (!defToMember
																																				.equals(mModifier)) {
																																			if (!defToMember
																																					.equals(tMember)) {
																																				if (!defToMember
																																						.equals(tModifier)) {
																																					if (!defToMember
																																							.equals(tClass)) {
																																						return new Object[] {
																																								ruleresult,
																																								mClass,
																																								mTypeToTType,
																																								mDefinition,
																																								mModifierToTModifier,
																																								mModifier,
																																								tMember,
																																								tModifier,
																																								tClass,
																																								defToMember };
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_MemberInClassVisibility_1_3_bookkeepingforedges_greenBBBBBBFFFFF(
			PerformRuleResult ruleresult, EObject mDefinition, EObject mModifierToTModifier, EObject mModifier,
			EObject tMember, EObject tModifier) {
		EMoflonEdge mModifierToTModifier__mModifier____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mDefinition__mModifier____modifier = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mModifier__mDefinition____bodyDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tMember__tModifier____tModifier = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mModifierToTModifier__tModifier____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "MemberInClassVisibility";
		String mModifierToTModifier__mModifier____source_name_prime = "source";
		String mDefinition__mModifier____modifier_name_prime = "modifier";
		String mModifier__mDefinition____bodyDeclaration_name_prime = "bodyDeclaration";
		String tMember__tModifier____tModifier_name_prime = "tModifier";
		String mModifierToTModifier__tModifier____target_name_prime = "target";
		mModifierToTModifier__mModifier____source.setSrc(mModifierToTModifier);
		mModifierToTModifier__mModifier____source.setTrg(mModifier);
		ruleresult.getCreatedEdges().add(mModifierToTModifier__mModifier____source);
		mDefinition__mModifier____modifier.setSrc(mDefinition);
		mDefinition__mModifier____modifier.setTrg(mModifier);
		ruleresult.getTranslatedEdges().add(mDefinition__mModifier____modifier);
		mModifier__mDefinition____bodyDeclaration.setSrc(mModifier);
		mModifier__mDefinition____bodyDeclaration.setTrg(mDefinition);
		ruleresult.getTranslatedEdges().add(mModifier__mDefinition____bodyDeclaration);
		tMember__tModifier____tModifier.setSrc(tMember);
		tMember__tModifier____tModifier.setTrg(tModifier);
		ruleresult.getCreatedEdges().add(tMember__tModifier____tModifier);
		mModifierToTModifier__tModifier____target.setSrc(mModifierToTModifier);
		mModifierToTModifier__tModifier____target.setTrg(tModifier);
		ruleresult.getCreatedEdges().add(mModifierToTModifier__tModifier____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		mModifierToTModifier__mModifier____source.setName(mModifierToTModifier__mModifier____source_name_prime);
		mDefinition__mModifier____modifier.setName(mDefinition__mModifier____modifier_name_prime);
		mModifier__mDefinition____bodyDeclaration.setName(mModifier__mDefinition____bodyDeclaration_name_prime);
		tMember__tModifier____tModifier.setName(tMember__tModifier____tModifier_name_prime);
		mModifierToTModifier__tModifier____target.setName(mModifierToTModifier__tModifier____target_name_prime);
		return new Object[] { ruleresult, mDefinition, mModifierToTModifier, mModifier, tMember, tModifier,
				mModifierToTModifier__mModifier____source, mDefinition__mModifier____modifier,
				mModifier__mDefinition____bodyDeclaration, tMember__tModifier____tModifier,
				mModifierToTModifier__tModifier____target };
	}

	public static final void pattern_MemberInClassVisibility_1_5_registerobjects_expressionBBBBBBBBBBB(
			MemberInClassVisibility _this, PerformRuleResult ruleresult, EObject mClass, EObject mTypeToTType,
			EObject mDefinition, EObject mModifierToTModifier, EObject mModifier, EObject tMember, EObject tModifier,
			EObject tClass, EObject defToMember) {
		_this.registerObjects_FWD(ruleresult, mClass, mTypeToTType, mDefinition, mModifierToTModifier, mModifier,
				tMember, tModifier, tClass, defToMember);

	}

	public static final PerformRuleResult pattern_MemberInClassVisibility_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_MemberInClassVisibility_2_1_preparereturnvalue_bindingFB(
			MemberInClassVisibility _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_MemberInClassVisibility_2_1_preparereturnvalue_blackFBB(EClass eClass,
			MemberInClassVisibility _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_MemberInClassVisibility_2_1_preparereturnvalue_bindingAndBlackFFB(
			MemberInClassVisibility _this) {
		Object[] result_pattern_MemberInClassVisibility_2_1_preparereturnvalue_binding = pattern_MemberInClassVisibility_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_MemberInClassVisibility_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_MemberInClassVisibility_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_MemberInClassVisibility_2_1_preparereturnvalue_black = pattern_MemberInClassVisibility_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_MemberInClassVisibility_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_MemberInClassVisibility_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_MemberInClassVisibility_2_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "MemberInClassVisibility";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_MemberInClassVisibility_2_2_corematch_bindingFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("mClass");
		EObject _localVariable_1 = match.getObject("mDefinition");
		EObject _localVariable_2 = match.getObject("mModifier");
		EObject tmpMClass = _localVariable_0;
		EObject tmpMDefinition = _localVariable_1;
		EObject tmpMModifier = _localVariable_2;
		if (tmpMClass instanceof ClassDeclaration) {
			ClassDeclaration mClass = (ClassDeclaration) tmpMClass;
			if (tmpMDefinition instanceof MDefinition) {
				MDefinition mDefinition = (MDefinition) tmpMDefinition;
				if (tmpMModifier instanceof Modifier) {
					Modifier mModifier = (Modifier) tmpMModifier;
					return new Object[] { mClass, mDefinition, mModifier, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_MemberInClassVisibility_2_2_corematch_blackBFBBFFFB(
			ClassDeclaration mClass, MDefinition mDefinition, Modifier mModifier, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (TypeToTAbstractType mTypeToTType : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mClass, TypeToTAbstractType.class, "source")) {
			TAbstractType tmpTClass = mTypeToTType.getTarget();
			if (tmpTClass instanceof TClass) {
				TClass tClass = (TClass) tmpTClass;
				for (MDefinitionToTMember defToMember : org.moflon.core.utilities.eMoflonEMFUtil
						.getOppositeReferenceTyped(mDefinition, MDefinitionToTMember.class, "source")) {
					TMember tMember = defToMember.getTarget();
					if (tMember != null) {
						_result.add(new Object[] { mClass, mTypeToTType, mDefinition, mModifier, tMember, tClass,
								defToMember, match });
					}

				}
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_MemberInClassVisibility_2_3_findcontext_blackBBBBBBB(
			ClassDeclaration mClass, TypeToTAbstractType mTypeToTType, MDefinition mDefinition, Modifier mModifier,
			TMember tMember, TClass tClass, MDefinitionToTMember defToMember) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (mClass.getBodyDeclarations().contains(mDefinition)) {
			if (mClass.equals(mTypeToTType.getSource())) {
				if (mModifier.equals(mDefinition.getModifier())) {
					if (tClass.equals(mTypeToTType.getTarget())) {
						if (tClass.getDefines().contains(tMember)) {
							if (tMember.equals(defToMember.getTarget())) {
								if (mDefinition.equals(defToMember.getSource())) {
									_result.add(new Object[] { mClass, mTypeToTType, mDefinition, mModifier, tMember,
											tClass, defToMember });
								}
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_MemberInClassVisibility_2_3_findcontext_greenBBBBBBBFFFFFFFFFFF(
			ClassDeclaration mClass, TypeToTAbstractType mTypeToTType, MDefinition mDefinition, Modifier mModifier,
			TMember tMember, TClass tClass, MDefinitionToTMember defToMember) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge mClass__mDefinition____bodyDeclarations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mDefinition__mClass____abstractTypeDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mTypeToTType__mClass____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mDefinition__mModifier____modifier = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mModifier__mDefinition____bodyDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mTypeToTType__tClass____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tClass__tMember____defines = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tMember__tClass____definedBy = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge defToMember__tMember____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge defToMember__mDefinition____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String mClass__mDefinition____bodyDeclarations_name_prime = "bodyDeclarations";
		String mDefinition__mClass____abstractTypeDeclaration_name_prime = "abstractTypeDeclaration";
		String mTypeToTType__mClass____source_name_prime = "source";
		String mDefinition__mModifier____modifier_name_prime = "modifier";
		String mModifier__mDefinition____bodyDeclaration_name_prime = "bodyDeclaration";
		String mTypeToTType__tClass____target_name_prime = "target";
		String tClass__tMember____defines_name_prime = "defines";
		String tMember__tClass____definedBy_name_prime = "definedBy";
		String defToMember__tMember____target_name_prime = "target";
		String defToMember__mDefinition____source_name_prime = "source";
		isApplicableMatch.getAllContextElements().add(mClass);
		isApplicableMatch.getAllContextElements().add(mTypeToTType);
		isApplicableMatch.getAllContextElements().add(mDefinition);
		isApplicableMatch.getAllContextElements().add(mModifier);
		isApplicableMatch.getAllContextElements().add(tMember);
		isApplicableMatch.getAllContextElements().add(tClass);
		isApplicableMatch.getAllContextElements().add(defToMember);
		mClass__mDefinition____bodyDeclarations.setSrc(mClass);
		mClass__mDefinition____bodyDeclarations.setTrg(mDefinition);
		isApplicableMatch.getAllContextElements().add(mClass__mDefinition____bodyDeclarations);
		mDefinition__mClass____abstractTypeDeclaration.setSrc(mDefinition);
		mDefinition__mClass____abstractTypeDeclaration.setTrg(mClass);
		isApplicableMatch.getAllContextElements().add(mDefinition__mClass____abstractTypeDeclaration);
		mTypeToTType__mClass____source.setSrc(mTypeToTType);
		mTypeToTType__mClass____source.setTrg(mClass);
		isApplicableMatch.getAllContextElements().add(mTypeToTType__mClass____source);
		mDefinition__mModifier____modifier.setSrc(mDefinition);
		mDefinition__mModifier____modifier.setTrg(mModifier);
		isApplicableMatch.getAllContextElements().add(mDefinition__mModifier____modifier);
		mModifier__mDefinition____bodyDeclaration.setSrc(mModifier);
		mModifier__mDefinition____bodyDeclaration.setTrg(mDefinition);
		isApplicableMatch.getAllContextElements().add(mModifier__mDefinition____bodyDeclaration);
		mTypeToTType__tClass____target.setSrc(mTypeToTType);
		mTypeToTType__tClass____target.setTrg(tClass);
		isApplicableMatch.getAllContextElements().add(mTypeToTType__tClass____target);
		tClass__tMember____defines.setSrc(tClass);
		tClass__tMember____defines.setTrg(tMember);
		isApplicableMatch.getAllContextElements().add(tClass__tMember____defines);
		tMember__tClass____definedBy.setSrc(tMember);
		tMember__tClass____definedBy.setTrg(tClass);
		isApplicableMatch.getAllContextElements().add(tMember__tClass____definedBy);
		defToMember__tMember____target.setSrc(defToMember);
		defToMember__tMember____target.setTrg(tMember);
		isApplicableMatch.getAllContextElements().add(defToMember__tMember____target);
		defToMember__mDefinition____source.setSrc(defToMember);
		defToMember__mDefinition____source.setTrg(mDefinition);
		isApplicableMatch.getAllContextElements().add(defToMember__mDefinition____source);
		mClass__mDefinition____bodyDeclarations.setName(mClass__mDefinition____bodyDeclarations_name_prime);
		mDefinition__mClass____abstractTypeDeclaration
				.setName(mDefinition__mClass____abstractTypeDeclaration_name_prime);
		mTypeToTType__mClass____source.setName(mTypeToTType__mClass____source_name_prime);
		mDefinition__mModifier____modifier.setName(mDefinition__mModifier____modifier_name_prime);
		mModifier__mDefinition____bodyDeclaration.setName(mModifier__mDefinition____bodyDeclaration_name_prime);
		mTypeToTType__tClass____target.setName(mTypeToTType__tClass____target_name_prime);
		tClass__tMember____defines.setName(tClass__tMember____defines_name_prime);
		tMember__tClass____definedBy.setName(tMember__tClass____definedBy_name_prime);
		defToMember__tMember____target.setName(defToMember__tMember____target_name_prime);
		defToMember__mDefinition____source.setName(defToMember__mDefinition____source_name_prime);
		return new Object[] { mClass, mTypeToTType, mDefinition, mModifier, tMember, tClass, defToMember,
				isApplicableMatch, mClass__mDefinition____bodyDeclarations,
				mDefinition__mClass____abstractTypeDeclaration, mTypeToTType__mClass____source,
				mDefinition__mModifier____modifier, mModifier__mDefinition____bodyDeclaration,
				mTypeToTType__tClass____target, tClass__tMember____defines, tMember__tClass____definedBy,
				defToMember__tMember____target, defToMember__mDefinition____source };
	}

	public static final Object[] pattern_MemberInClassVisibility_2_4_solveCSP_bindingFBBBBBBBBB(
			MemberInClassVisibility _this, IsApplicableMatch isApplicableMatch, ClassDeclaration mClass,
			TypeToTAbstractType mTypeToTType, MDefinition mDefinition, Modifier mModifier, TMember tMember,
			TClass tClass, MDefinitionToTMember defToMember) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, mClass, mTypeToTType, mDefinition,
				mModifier, tMember, tClass, defToMember);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mClass, mTypeToTType, mDefinition, mModifier, tMember,
					tClass, defToMember };
		}
		return null;
	}

	public static final Object[] pattern_MemberInClassVisibility_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MemberInClassVisibility_2_4_solveCSP_bindingAndBlackFBBBBBBBBB(
			MemberInClassVisibility _this, IsApplicableMatch isApplicableMatch, ClassDeclaration mClass,
			TypeToTAbstractType mTypeToTType, MDefinition mDefinition, Modifier mModifier, TMember tMember,
			TClass tClass, MDefinitionToTMember defToMember) {
		Object[] result_pattern_MemberInClassVisibility_2_4_solveCSP_binding = pattern_MemberInClassVisibility_2_4_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, mClass, mTypeToTType, mDefinition, mModifier, tMember, tClass, defToMember);
		if (result_pattern_MemberInClassVisibility_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_MemberInClassVisibility_2_4_solveCSP_binding[0];

			Object[] result_pattern_MemberInClassVisibility_2_4_solveCSP_black = pattern_MemberInClassVisibility_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_MemberInClassVisibility_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mClass, mTypeToTType, mDefinition, mModifier,
						tMember, tClass, defToMember };
			}
		}
		return null;
	}

	public static final boolean pattern_MemberInClassVisibility_2_5_checkCSP_expressionFBB(
			MemberInClassVisibility _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MemberInClassVisibility_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_MemberInClassVisibility_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "MemberInClassVisibility";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_MemberInClassVisibility_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_MemberInClassVisibility_10_1_initialbindings_blackBBBBB(
			MemberInClassVisibility _this, Match match, TMember tMember, TModifier tModifier, TClass tClass) {
		return new Object[] { _this, match, tMember, tModifier, tClass };
	}

	public static final Object[] pattern_MemberInClassVisibility_10_2_SolveCSP_bindingFBBBBB(
			MemberInClassVisibility _this, Match match, TMember tMember, TModifier tModifier, TClass tClass) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, tMember, tModifier, tClass);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, tMember, tModifier, tClass };
		}
		return null;
	}

	public static final Object[] pattern_MemberInClassVisibility_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MemberInClassVisibility_10_2_SolveCSP_bindingAndBlackFBBBBB(
			MemberInClassVisibility _this, Match match, TMember tMember, TModifier tModifier, TClass tClass) {
		Object[] result_pattern_MemberInClassVisibility_10_2_SolveCSP_binding = pattern_MemberInClassVisibility_10_2_SolveCSP_bindingFBBBBB(
				_this, match, tMember, tModifier, tClass);
		if (result_pattern_MemberInClassVisibility_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_MemberInClassVisibility_10_2_SolveCSP_binding[0];

			Object[] result_pattern_MemberInClassVisibility_10_2_SolveCSP_black = pattern_MemberInClassVisibility_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_MemberInClassVisibility_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, tMember, tModifier, tClass };
			}
		}
		return null;
	}

	public static final boolean pattern_MemberInClassVisibility_10_3_CheckCSP_expressionFBB(
			MemberInClassVisibility _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MemberInClassVisibility_10_4_collectelementstobetranslated_blackBBBB(
			Match match, TMember tMember, TModifier tModifier, TClass tClass) {
		return new Object[] { match, tMember, tModifier, tClass };
	}

	public static final Object[] pattern_MemberInClassVisibility_10_4_collectelementstobetranslated_greenBBBF(
			Match match, TMember tMember, TModifier tModifier) {
		EMoflonEdge tMember__tModifier____tModifier = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(tModifier);
		String tMember__tModifier____tModifier_name_prime = "tModifier";
		tMember__tModifier____tModifier.setSrc(tMember);
		tMember__tModifier____tModifier.setTrg(tModifier);
		match.getToBeTranslatedEdges().add(tMember__tModifier____tModifier);
		tMember__tModifier____tModifier.setName(tMember__tModifier____tModifier_name_prime);
		return new Object[] { match, tMember, tModifier, tMember__tModifier____tModifier };
	}

	public static final Object[] pattern_MemberInClassVisibility_10_5_collectcontextelements_blackBBBB(Match match,
			TMember tMember, TModifier tModifier, TClass tClass) {
		return new Object[] { match, tMember, tModifier, tClass };
	}

	public static final Object[] pattern_MemberInClassVisibility_10_5_collectcontextelements_greenBBBFF(Match match,
			TMember tMember, TClass tClass) {
		EMoflonEdge tClass__tMember____defines = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tMember__tClass____definedBy = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(tMember);
		match.getContextNodes().add(tClass);
		String tClass__tMember____defines_name_prime = "defines";
		String tMember__tClass____definedBy_name_prime = "definedBy";
		tClass__tMember____defines.setSrc(tClass);
		tClass__tMember____defines.setTrg(tMember);
		match.getContextEdges().add(tClass__tMember____defines);
		tMember__tClass____definedBy.setSrc(tMember);
		tMember__tClass____definedBy.setTrg(tClass);
		match.getContextEdges().add(tMember__tClass____definedBy);
		tClass__tMember____defines.setName(tClass__tMember____defines_name_prime);
		tMember__tClass____definedBy.setName(tMember__tClass____definedBy_name_prime);
		return new Object[] { match, tMember, tClass, tClass__tMember____defines, tMember__tClass____definedBy };
	}

	public static final void pattern_MemberInClassVisibility_10_6_registerobjectstomatch_expressionBBBBB(
			MemberInClassVisibility _this, Match match, TMember tMember, TModifier tModifier, TClass tClass) {
		_this.registerObjectsToMatch_BWD(match, tMember, tModifier, tClass);

	}

	public static final boolean pattern_MemberInClassVisibility_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_MemberInClassVisibility_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_MemberInClassVisibility_11_1_performtransformation_bindingFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("mClass");
		EObject _localVariable_1 = isApplicableMatch.getObject("mTypeToTType");
		EObject _localVariable_2 = isApplicableMatch.getObject("mDefinition");
		EObject _localVariable_3 = isApplicableMatch.getObject("tMember");
		EObject _localVariable_4 = isApplicableMatch.getObject("tModifier");
		EObject _localVariable_5 = isApplicableMatch.getObject("tClass");
		EObject _localVariable_6 = isApplicableMatch.getObject("defToMember");
		EObject tmpMClass = _localVariable_0;
		EObject tmpMTypeToTType = _localVariable_1;
		EObject tmpMDefinition = _localVariable_2;
		EObject tmpTMember = _localVariable_3;
		EObject tmpTModifier = _localVariable_4;
		EObject tmpTClass = _localVariable_5;
		EObject tmpDefToMember = _localVariable_6;
		if (tmpMClass instanceof ClassDeclaration) {
			ClassDeclaration mClass = (ClassDeclaration) tmpMClass;
			if (tmpMTypeToTType instanceof TypeToTAbstractType) {
				TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) tmpMTypeToTType;
				if (tmpMDefinition instanceof MDefinition) {
					MDefinition mDefinition = (MDefinition) tmpMDefinition;
					if (tmpTMember instanceof TMember) {
						TMember tMember = (TMember) tmpTMember;
						if (tmpTModifier instanceof TModifier) {
							TModifier tModifier = (TModifier) tmpTModifier;
							if (tmpTClass instanceof TClass) {
								TClass tClass = (TClass) tmpTClass;
								if (tmpDefToMember instanceof MDefinitionToTMember) {
									MDefinitionToTMember defToMember = (MDefinitionToTMember) tmpDefToMember;
									return new Object[] { mClass, mTypeToTType, mDefinition, tMember, tModifier, tClass,
											defToMember, isApplicableMatch };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_MemberInClassVisibility_11_1_performtransformation_blackBBBBBBBFBB(
			ClassDeclaration mClass, TypeToTAbstractType mTypeToTType, MDefinition mDefinition, TMember tMember,
			TModifier tModifier, TClass tClass, MDefinitionToTMember defToMember, MemberInClassVisibility _this,
			IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { mClass, mTypeToTType, mDefinition, tMember, tModifier, tClass, defToMember, csp,
						_this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_MemberInClassVisibility_11_1_performtransformation_bindingAndBlackFFFFFFFFBB(
			MemberInClassVisibility _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_MemberInClassVisibility_11_1_performtransformation_binding = pattern_MemberInClassVisibility_11_1_performtransformation_bindingFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_MemberInClassVisibility_11_1_performtransformation_binding != null) {
			ClassDeclaration mClass = (ClassDeclaration) result_pattern_MemberInClassVisibility_11_1_performtransformation_binding[0];
			TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result_pattern_MemberInClassVisibility_11_1_performtransformation_binding[1];
			MDefinition mDefinition = (MDefinition) result_pattern_MemberInClassVisibility_11_1_performtransformation_binding[2];
			TMember tMember = (TMember) result_pattern_MemberInClassVisibility_11_1_performtransformation_binding[3];
			TModifier tModifier = (TModifier) result_pattern_MemberInClassVisibility_11_1_performtransformation_binding[4];
			TClass tClass = (TClass) result_pattern_MemberInClassVisibility_11_1_performtransformation_binding[5];
			MDefinitionToTMember defToMember = (MDefinitionToTMember) result_pattern_MemberInClassVisibility_11_1_performtransformation_binding[6];

			Object[] result_pattern_MemberInClassVisibility_11_1_performtransformation_black = pattern_MemberInClassVisibility_11_1_performtransformation_blackBBBBBBBFBB(
					mClass, mTypeToTType, mDefinition, tMember, tModifier, tClass, defToMember, _this,
					isApplicableMatch);
			if (result_pattern_MemberInClassVisibility_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_MemberInClassVisibility_11_1_performtransformation_black[7];

				return new Object[] { mClass, mTypeToTType, mDefinition, tMember, tModifier, tClass, defToMember, csp,
						_this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_MemberInClassVisibility_11_1_performtransformation_greenBFFBB(
			MDefinition mDefinition, TModifier tModifier, CSP csp) {
		MModifierToTModifier mModifierToTModifier = PmFactory.eINSTANCE.createMModifierToTModifier();
		Modifier mModifier = JavaFactory.eINSTANCE.createModifier();
		Object _localVariable_0 = csp.getValue("mModifier", "static");
		Object _localVariable_1 = csp.getValue("mModifier", "visibility");
		mModifierToTModifier.setTarget(tModifier);
		mModifierToTModifier.setSource(mModifier);
		mDefinition.setModifier(mModifier);
		boolean mModifier_static_prime = (boolean) _localVariable_0;
		VisibilityKind mModifier_visibility_prime = (VisibilityKind) _localVariable_1;
		mModifier.setStatic(Boolean.valueOf(mModifier_static_prime));
		mModifier.setVisibility(mModifier_visibility_prime);
		return new Object[] { mDefinition, mModifierToTModifier, mModifier, tModifier, csp };
	}

	public static final Object[] pattern_MemberInClassVisibility_11_2_collecttranslatedelements_blackBBB(
			MModifierToTModifier mModifierToTModifier, Modifier mModifier, TModifier tModifier) {
		return new Object[] { mModifierToTModifier, mModifier, tModifier };
	}

	public static final Object[] pattern_MemberInClassVisibility_11_2_collecttranslatedelements_greenFBBB(
			MModifierToTModifier mModifierToTModifier, Modifier mModifier, TModifier tModifier) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(mModifierToTModifier);
		ruleresult.getCreatedElements().add(mModifier);
		ruleresult.getTranslatedElements().add(tModifier);
		return new Object[] { ruleresult, mModifierToTModifier, mModifier, tModifier };
	}

	public static final Object[] pattern_MemberInClassVisibility_11_3_bookkeepingforedges_blackBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject mClass, EObject mTypeToTType, EObject mDefinition,
			EObject mModifierToTModifier, EObject mModifier, EObject tMember, EObject tModifier, EObject tClass,
			EObject defToMember) {
		if (!mClass.equals(mTypeToTType)) {
			if (!mClass.equals(mDefinition)) {
				if (!mClass.equals(mModifierToTModifier)) {
					if (!mClass.equals(mModifier)) {
						if (!mClass.equals(tMember)) {
							if (!mClass.equals(tModifier)) {
								if (!mClass.equals(tClass)) {
									if (!mTypeToTType.equals(tMember)) {
										if (!mTypeToTType.equals(tModifier)) {
											if (!mTypeToTType.equals(tClass)) {
												if (!mDefinition.equals(mTypeToTType)) {
													if (!mDefinition.equals(mModifierToTModifier)) {
														if (!mDefinition.equals(mModifier)) {
															if (!mDefinition.equals(tMember)) {
																if (!mDefinition.equals(tModifier)) {
																	if (!mDefinition.equals(tClass)) {
																		if (!mModifierToTModifier
																				.equals(mTypeToTType)) {
																			if (!mModifierToTModifier.equals(tMember)) {
																				if (!mModifierToTModifier
																						.equals(tModifier)) {
																					if (!mModifierToTModifier
																							.equals(tClass)) {
																						if (!mModifier
																								.equals(mTypeToTType)) {
																							if (!mModifier.equals(
																									mModifierToTModifier)) {
																								if (!mModifier.equals(
																										tMember)) {
																									if (!mModifier
																											.equals(tModifier)) {
																										if (!mModifier
																												.equals(tClass)) {
																											if (!tMember
																													.equals(tModifier)) {
																												if (!tClass
																														.equals(tMember)) {
																													if (!tClass
																															.equals(tModifier)) {
																														if (!defToMember
																																.equals(mClass)) {
																															if (!defToMember
																																	.equals(mTypeToTType)) {
																																if (!defToMember
																																		.equals(mDefinition)) {
																																	if (!defToMember
																																			.equals(mModifierToTModifier)) {
																																		if (!defToMember
																																				.equals(mModifier)) {
																																			if (!defToMember
																																					.equals(tMember)) {
																																				if (!defToMember
																																						.equals(tModifier)) {
																																					if (!defToMember
																																							.equals(tClass)) {
																																						return new Object[] {
																																								ruleresult,
																																								mClass,
																																								mTypeToTType,
																																								mDefinition,
																																								mModifierToTModifier,
																																								mModifier,
																																								tMember,
																																								tModifier,
																																								tClass,
																																								defToMember };
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_MemberInClassVisibility_11_3_bookkeepingforedges_greenBBBBBBFFFFF(
			PerformRuleResult ruleresult, EObject mDefinition, EObject mModifierToTModifier, EObject mModifier,
			EObject tMember, EObject tModifier) {
		EMoflonEdge mModifierToTModifier__mModifier____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mDefinition__mModifier____modifier = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mModifier__mDefinition____bodyDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tMember__tModifier____tModifier = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mModifierToTModifier__tModifier____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "MemberInClassVisibility";
		String mModifierToTModifier__mModifier____source_name_prime = "source";
		String mDefinition__mModifier____modifier_name_prime = "modifier";
		String mModifier__mDefinition____bodyDeclaration_name_prime = "bodyDeclaration";
		String tMember__tModifier____tModifier_name_prime = "tModifier";
		String mModifierToTModifier__tModifier____target_name_prime = "target";
		mModifierToTModifier__mModifier____source.setSrc(mModifierToTModifier);
		mModifierToTModifier__mModifier____source.setTrg(mModifier);
		ruleresult.getCreatedEdges().add(mModifierToTModifier__mModifier____source);
		mDefinition__mModifier____modifier.setSrc(mDefinition);
		mDefinition__mModifier____modifier.setTrg(mModifier);
		ruleresult.getCreatedEdges().add(mDefinition__mModifier____modifier);
		mModifier__mDefinition____bodyDeclaration.setSrc(mModifier);
		mModifier__mDefinition____bodyDeclaration.setTrg(mDefinition);
		ruleresult.getCreatedEdges().add(mModifier__mDefinition____bodyDeclaration);
		tMember__tModifier____tModifier.setSrc(tMember);
		tMember__tModifier____tModifier.setTrg(tModifier);
		ruleresult.getTranslatedEdges().add(tMember__tModifier____tModifier);
		mModifierToTModifier__tModifier____target.setSrc(mModifierToTModifier);
		mModifierToTModifier__tModifier____target.setTrg(tModifier);
		ruleresult.getCreatedEdges().add(mModifierToTModifier__tModifier____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		mModifierToTModifier__mModifier____source.setName(mModifierToTModifier__mModifier____source_name_prime);
		mDefinition__mModifier____modifier.setName(mDefinition__mModifier____modifier_name_prime);
		mModifier__mDefinition____bodyDeclaration.setName(mModifier__mDefinition____bodyDeclaration_name_prime);
		tMember__tModifier____tModifier.setName(tMember__tModifier____tModifier_name_prime);
		mModifierToTModifier__tModifier____target.setName(mModifierToTModifier__tModifier____target_name_prime);
		return new Object[] { ruleresult, mDefinition, mModifierToTModifier, mModifier, tMember, tModifier,
				mModifierToTModifier__mModifier____source, mDefinition__mModifier____modifier,
				mModifier__mDefinition____bodyDeclaration, tMember__tModifier____tModifier,
				mModifierToTModifier__tModifier____target };
	}

	public static final void pattern_MemberInClassVisibility_11_5_registerobjects_expressionBBBBBBBBBBB(
			MemberInClassVisibility _this, PerformRuleResult ruleresult, EObject mClass, EObject mTypeToTType,
			EObject mDefinition, EObject mModifierToTModifier, EObject mModifier, EObject tMember, EObject tModifier,
			EObject tClass, EObject defToMember) {
		_this.registerObjects_BWD(ruleresult, mClass, mTypeToTType, mDefinition, mModifierToTModifier, mModifier,
				tMember, tModifier, tClass, defToMember);

	}

	public static final PerformRuleResult pattern_MemberInClassVisibility_11_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_MemberInClassVisibility_12_1_preparereturnvalue_bindingFB(
			MemberInClassVisibility _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_MemberInClassVisibility_12_1_preparereturnvalue_blackFBB(EClass eClass,
			MemberInClassVisibility _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_MemberInClassVisibility_12_1_preparereturnvalue_bindingAndBlackFFB(
			MemberInClassVisibility _this) {
		Object[] result_pattern_MemberInClassVisibility_12_1_preparereturnvalue_binding = pattern_MemberInClassVisibility_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_MemberInClassVisibility_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_MemberInClassVisibility_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_MemberInClassVisibility_12_1_preparereturnvalue_black = pattern_MemberInClassVisibility_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_MemberInClassVisibility_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_MemberInClassVisibility_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_MemberInClassVisibility_12_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "MemberInClassVisibility";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_MemberInClassVisibility_12_2_corematch_bindingFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("tMember");
		EObject _localVariable_1 = match.getObject("tModifier");
		EObject _localVariable_2 = match.getObject("tClass");
		EObject tmpTMember = _localVariable_0;
		EObject tmpTModifier = _localVariable_1;
		EObject tmpTClass = _localVariable_2;
		if (tmpTMember instanceof TMember) {
			TMember tMember = (TMember) tmpTMember;
			if (tmpTModifier instanceof TModifier) {
				TModifier tModifier = (TModifier) tmpTModifier;
				if (tmpTClass instanceof TClass) {
					TClass tClass = (TClass) tmpTClass;
					return new Object[] { tMember, tModifier, tClass, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_MemberInClassVisibility_12_2_corematch_blackFFFBBBFB(TMember tMember,
			TModifier tModifier, TClass tClass, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (TypeToTAbstractType mTypeToTType : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tClass, TypeToTAbstractType.class, "target")) {
			Type tmpMClass = mTypeToTType.getSource();
			if (tmpMClass instanceof ClassDeclaration) {
				ClassDeclaration mClass = (ClassDeclaration) tmpMClass;
				for (MDefinitionToTMember defToMember : org.moflon.core.utilities.eMoflonEMFUtil
						.getOppositeReferenceTyped(tMember, MDefinitionToTMember.class, "target")) {
					BodyDeclaration tmpMDefinition = defToMember.getSource();
					if (tmpMDefinition instanceof MDefinition) {
						MDefinition mDefinition = (MDefinition) tmpMDefinition;
						_result.add(new Object[] { mClass, mTypeToTType, mDefinition, tMember, tModifier, tClass,
								defToMember, match });
					}

				}
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_MemberInClassVisibility_12_3_findcontext_blackBBBBBBB(
			ClassDeclaration mClass, TypeToTAbstractType mTypeToTType, MDefinition mDefinition, TMember tMember,
			TModifier tModifier, TClass tClass, MDefinitionToTMember defToMember) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (mClass.getBodyDeclarations().contains(mDefinition)) {
			if (mClass.equals(mTypeToTType.getSource())) {
				if (tModifier.equals(tMember.getTModifier())) {
					if (tClass.equals(mTypeToTType.getTarget())) {
						if (tClass.getDefines().contains(tMember)) {
							if (tMember.equals(defToMember.getTarget())) {
								if (mDefinition.equals(defToMember.getSource())) {
									_result.add(new Object[] { mClass, mTypeToTType, mDefinition, tMember, tModifier,
											tClass, defToMember });
								}
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_MemberInClassVisibility_12_3_findcontext_greenBBBBBBBFFFFFFFFFF(
			ClassDeclaration mClass, TypeToTAbstractType mTypeToTType, MDefinition mDefinition, TMember tMember,
			TModifier tModifier, TClass tClass, MDefinitionToTMember defToMember) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge mClass__mDefinition____bodyDeclarations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mDefinition__mClass____abstractTypeDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mTypeToTType__mClass____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tMember__tModifier____tModifier = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mTypeToTType__tClass____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tClass__tMember____defines = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tMember__tClass____definedBy = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge defToMember__tMember____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge defToMember__mDefinition____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String mClass__mDefinition____bodyDeclarations_name_prime = "bodyDeclarations";
		String mDefinition__mClass____abstractTypeDeclaration_name_prime = "abstractTypeDeclaration";
		String mTypeToTType__mClass____source_name_prime = "source";
		String tMember__tModifier____tModifier_name_prime = "tModifier";
		String mTypeToTType__tClass____target_name_prime = "target";
		String tClass__tMember____defines_name_prime = "defines";
		String tMember__tClass____definedBy_name_prime = "definedBy";
		String defToMember__tMember____target_name_prime = "target";
		String defToMember__mDefinition____source_name_prime = "source";
		isApplicableMatch.getAllContextElements().add(mClass);
		isApplicableMatch.getAllContextElements().add(mTypeToTType);
		isApplicableMatch.getAllContextElements().add(mDefinition);
		isApplicableMatch.getAllContextElements().add(tMember);
		isApplicableMatch.getAllContextElements().add(tModifier);
		isApplicableMatch.getAllContextElements().add(tClass);
		isApplicableMatch.getAllContextElements().add(defToMember);
		mClass__mDefinition____bodyDeclarations.setSrc(mClass);
		mClass__mDefinition____bodyDeclarations.setTrg(mDefinition);
		isApplicableMatch.getAllContextElements().add(mClass__mDefinition____bodyDeclarations);
		mDefinition__mClass____abstractTypeDeclaration.setSrc(mDefinition);
		mDefinition__mClass____abstractTypeDeclaration.setTrg(mClass);
		isApplicableMatch.getAllContextElements().add(mDefinition__mClass____abstractTypeDeclaration);
		mTypeToTType__mClass____source.setSrc(mTypeToTType);
		mTypeToTType__mClass____source.setTrg(mClass);
		isApplicableMatch.getAllContextElements().add(mTypeToTType__mClass____source);
		tMember__tModifier____tModifier.setSrc(tMember);
		tMember__tModifier____tModifier.setTrg(tModifier);
		isApplicableMatch.getAllContextElements().add(tMember__tModifier____tModifier);
		mTypeToTType__tClass____target.setSrc(mTypeToTType);
		mTypeToTType__tClass____target.setTrg(tClass);
		isApplicableMatch.getAllContextElements().add(mTypeToTType__tClass____target);
		tClass__tMember____defines.setSrc(tClass);
		tClass__tMember____defines.setTrg(tMember);
		isApplicableMatch.getAllContextElements().add(tClass__tMember____defines);
		tMember__tClass____definedBy.setSrc(tMember);
		tMember__tClass____definedBy.setTrg(tClass);
		isApplicableMatch.getAllContextElements().add(tMember__tClass____definedBy);
		defToMember__tMember____target.setSrc(defToMember);
		defToMember__tMember____target.setTrg(tMember);
		isApplicableMatch.getAllContextElements().add(defToMember__tMember____target);
		defToMember__mDefinition____source.setSrc(defToMember);
		defToMember__mDefinition____source.setTrg(mDefinition);
		isApplicableMatch.getAllContextElements().add(defToMember__mDefinition____source);
		mClass__mDefinition____bodyDeclarations.setName(mClass__mDefinition____bodyDeclarations_name_prime);
		mDefinition__mClass____abstractTypeDeclaration
				.setName(mDefinition__mClass____abstractTypeDeclaration_name_prime);
		mTypeToTType__mClass____source.setName(mTypeToTType__mClass____source_name_prime);
		tMember__tModifier____tModifier.setName(tMember__tModifier____tModifier_name_prime);
		mTypeToTType__tClass____target.setName(mTypeToTType__tClass____target_name_prime);
		tClass__tMember____defines.setName(tClass__tMember____defines_name_prime);
		tMember__tClass____definedBy.setName(tMember__tClass____definedBy_name_prime);
		defToMember__tMember____target.setName(defToMember__tMember____target_name_prime);
		defToMember__mDefinition____source.setName(defToMember__mDefinition____source_name_prime);
		return new Object[] { mClass, mTypeToTType, mDefinition, tMember, tModifier, tClass, defToMember,
				isApplicableMatch, mClass__mDefinition____bodyDeclarations,
				mDefinition__mClass____abstractTypeDeclaration, mTypeToTType__mClass____source,
				tMember__tModifier____tModifier, mTypeToTType__tClass____target, tClass__tMember____defines,
				tMember__tClass____definedBy, defToMember__tMember____target, defToMember__mDefinition____source };
	}

	public static final Object[] pattern_MemberInClassVisibility_12_4_solveCSP_bindingFBBBBBBBBB(
			MemberInClassVisibility _this, IsApplicableMatch isApplicableMatch, ClassDeclaration mClass,
			TypeToTAbstractType mTypeToTType, MDefinition mDefinition, TMember tMember, TModifier tModifier,
			TClass tClass, MDefinitionToTMember defToMember) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, mClass, mTypeToTType, mDefinition,
				tMember, tModifier, tClass, defToMember);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mClass, mTypeToTType, mDefinition, tMember, tModifier,
					tClass, defToMember };
		}
		return null;
	}

	public static final Object[] pattern_MemberInClassVisibility_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MemberInClassVisibility_12_4_solveCSP_bindingAndBlackFBBBBBBBBB(
			MemberInClassVisibility _this, IsApplicableMatch isApplicableMatch, ClassDeclaration mClass,
			TypeToTAbstractType mTypeToTType, MDefinition mDefinition, TMember tMember, TModifier tModifier,
			TClass tClass, MDefinitionToTMember defToMember) {
		Object[] result_pattern_MemberInClassVisibility_12_4_solveCSP_binding = pattern_MemberInClassVisibility_12_4_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, mClass, mTypeToTType, mDefinition, tMember, tModifier, tClass, defToMember);
		if (result_pattern_MemberInClassVisibility_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_MemberInClassVisibility_12_4_solveCSP_binding[0];

			Object[] result_pattern_MemberInClassVisibility_12_4_solveCSP_black = pattern_MemberInClassVisibility_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_MemberInClassVisibility_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mClass, mTypeToTType, mDefinition, tMember,
						tModifier, tClass, defToMember };
			}
		}
		return null;
	}

	public static final boolean pattern_MemberInClassVisibility_12_5_checkCSP_expressionFBB(
			MemberInClassVisibility _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MemberInClassVisibility_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_MemberInClassVisibility_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "MemberInClassVisibility";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_MemberInClassVisibility_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_MemberInClassVisibility_20_1_preparereturnvalue_bindingFB(
			MemberInClassVisibility _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_MemberInClassVisibility_20_1_preparereturnvalue_blackFBBF(EClass __eClass,
			MemberInClassVisibility _this) {
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

	public static final Object[] pattern_MemberInClassVisibility_20_1_preparereturnvalue_bindingAndBlackFFBF(
			MemberInClassVisibility _this) {
		Object[] result_pattern_MemberInClassVisibility_20_1_preparereturnvalue_binding = pattern_MemberInClassVisibility_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_MemberInClassVisibility_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_MemberInClassVisibility_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_MemberInClassVisibility_20_1_preparereturnvalue_black = pattern_MemberInClassVisibility_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_MemberInClassVisibility_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_MemberInClassVisibility_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_MemberInClassVisibility_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_MemberInClassVisibility_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_MemberInClassVisibility_20_2_testcorematchandDECs_black_nac_0BB(
			TModifier tModifier, TClass tClass) {
		for (TAbstractType __DEC_tModifier_tModifier_383388 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tModifier, TAbstractType.class, "tModifier")) {
			if (!tClass.equals(__DEC_tModifier_tModifier_383388)) {
				return new Object[] { tModifier, tClass };
			}
		}
		return null;
	}

	public static final Object[] pattern_MemberInClassVisibility_20_2_testcorematchandDECs_black_nac_1BB(TClass tClass,
			TModifier tModifier) {
		if (tModifier.equals(tClass.getTModifier())) {
			return new Object[] { tClass, tModifier };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_MemberInClassVisibility_20_2_testcorematchandDECs_blackFFFB(
			EMoflonEdge _edge_tModifier) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpTMember = _edge_tModifier.getSrc();
		if (tmpTMember instanceof TMember) {
			TMember tMember = (TMember) tmpTMember;
			EObject tmpTModifier = _edge_tModifier.getTrg();
			if (tmpTModifier instanceof TModifier) {
				TModifier tModifier = (TModifier) tmpTModifier;
				if (tModifier.equals(tMember.getTModifier())) {
					TAbstractType tmpTClass = tMember.getDefinedBy();
					if (tmpTClass instanceof TClass) {
						TClass tClass = (TClass) tmpTClass;
						if (pattern_MemberInClassVisibility_20_2_testcorematchandDECs_black_nac_0BB(tModifier,
								tClass) == null) {
							if (pattern_MemberInClassVisibility_20_2_testcorematchandDECs_black_nac_1BB(tClass,
									tModifier) == null) {
								_result.add(new Object[] { tMember, tModifier, tClass, _edge_tModifier });
							}
						}
					}

				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_MemberInClassVisibility_20_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_MemberInClassVisibility_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
			MemberInClassVisibility _this, Match match, TMember tMember, TModifier tModifier, TClass tClass) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, tMember, tModifier, tClass);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_MemberInClassVisibility_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			MemberInClassVisibility _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MemberInClassVisibility_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_MemberInClassVisibility_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_MemberInClassVisibility_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_MemberInClassVisibility_21_1_preparereturnvalue_bindingFB(
			MemberInClassVisibility _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_MemberInClassVisibility_21_1_preparereturnvalue_blackFBBF(EClass __eClass,
			MemberInClassVisibility _this) {
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

	public static final Object[] pattern_MemberInClassVisibility_21_1_preparereturnvalue_bindingAndBlackFFBF(
			MemberInClassVisibility _this) {
		Object[] result_pattern_MemberInClassVisibility_21_1_preparereturnvalue_binding = pattern_MemberInClassVisibility_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_MemberInClassVisibility_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_MemberInClassVisibility_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_MemberInClassVisibility_21_1_preparereturnvalue_black = pattern_MemberInClassVisibility_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_MemberInClassVisibility_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_MemberInClassVisibility_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_MemberInClassVisibility_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_MemberInClassVisibility_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_MemberInClassVisibility_21_2_testcorematchandDECs_blackFFFB(
			EMoflonEdge _edge_modifier) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpMDefinition = _edge_modifier.getSrc();
		if (tmpMDefinition instanceof MDefinition) {
			MDefinition mDefinition = (MDefinition) tmpMDefinition;
			EObject tmpMModifier = _edge_modifier.getTrg();
			if (tmpMModifier instanceof Modifier) {
				Modifier mModifier = (Modifier) tmpMModifier;
				if (mModifier.equals(mDefinition.getModifier())) {
					AbstractTypeDeclaration tmpMClass = mDefinition.getAbstractTypeDeclaration();
					if (tmpMClass instanceof ClassDeclaration) {
						ClassDeclaration mClass = (ClassDeclaration) tmpMClass;
						_result.add(new Object[] { mClass, mDefinition, mModifier, _edge_modifier });
					}

				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_MemberInClassVisibility_21_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_MemberInClassVisibility_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
			MemberInClassVisibility _this, Match match, ClassDeclaration mClass, MDefinition mDefinition,
			Modifier mModifier) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, mClass, mDefinition, mModifier);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_MemberInClassVisibility_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			MemberInClassVisibility _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MemberInClassVisibility_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_MemberInClassVisibility_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_MemberInClassVisibility_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_MemberInClassVisibility_24_1_prepare_blackB(MemberInClassVisibility _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_MemberInClassVisibility_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_MemberInClassVisibility_24_2_matchsrctrgcontext_bindingFFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		EObject _localVariable_0 = sourceMatch.getObject("mClass");
		EObject _localVariable_1 = sourceMatch.getObject("mDefinition");
		EObject _localVariable_2 = sourceMatch.getObject("mModifier");
		EObject _localVariable_3 = targetMatch.getObject("tMember");
		EObject _localVariable_4 = targetMatch.getObject("tModifier");
		EObject _localVariable_5 = targetMatch.getObject("tClass");
		EObject tmpMClass = _localVariable_0;
		EObject tmpMDefinition = _localVariable_1;
		EObject tmpMModifier = _localVariable_2;
		EObject tmpTMember = _localVariable_3;
		EObject tmpTModifier = _localVariable_4;
		EObject tmpTClass = _localVariable_5;
		if (tmpMClass instanceof ClassDeclaration) {
			ClassDeclaration mClass = (ClassDeclaration) tmpMClass;
			if (tmpMDefinition instanceof MDefinition) {
				MDefinition mDefinition = (MDefinition) tmpMDefinition;
				if (tmpMModifier instanceof Modifier) {
					Modifier mModifier = (Modifier) tmpMModifier;
					if (tmpTMember instanceof TMember) {
						TMember tMember = (TMember) tmpTMember;
						if (tmpTModifier instanceof TModifier) {
							TModifier tModifier = (TModifier) tmpTModifier;
							if (tmpTClass instanceof TClass) {
								TClass tClass = (TClass) tmpTClass;
								return new Object[] { mClass, mDefinition, mModifier, tMember, tModifier, tClass,
										sourceMatch, targetMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_MemberInClassVisibility_24_2_matchsrctrgcontext_blackBBBBBBBB(
			ClassDeclaration mClass, MDefinition mDefinition, Modifier mModifier, TMember tMember, TModifier tModifier,
			TClass tClass, Match sourceMatch, Match targetMatch) {
		if (!sourceMatch.equals(targetMatch)) {
			return new Object[] { mClass, mDefinition, mModifier, tMember, tModifier, tClass, sourceMatch,
					targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_MemberInClassVisibility_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_MemberInClassVisibility_24_2_matchsrctrgcontext_binding = pattern_MemberInClassVisibility_24_2_matchsrctrgcontext_bindingFFFFFFBB(
				sourceMatch, targetMatch);
		if (result_pattern_MemberInClassVisibility_24_2_matchsrctrgcontext_binding != null) {
			ClassDeclaration mClass = (ClassDeclaration) result_pattern_MemberInClassVisibility_24_2_matchsrctrgcontext_binding[0];
			MDefinition mDefinition = (MDefinition) result_pattern_MemberInClassVisibility_24_2_matchsrctrgcontext_binding[1];
			Modifier mModifier = (Modifier) result_pattern_MemberInClassVisibility_24_2_matchsrctrgcontext_binding[2];
			TMember tMember = (TMember) result_pattern_MemberInClassVisibility_24_2_matchsrctrgcontext_binding[3];
			TModifier tModifier = (TModifier) result_pattern_MemberInClassVisibility_24_2_matchsrctrgcontext_binding[4];
			TClass tClass = (TClass) result_pattern_MemberInClassVisibility_24_2_matchsrctrgcontext_binding[5];

			Object[] result_pattern_MemberInClassVisibility_24_2_matchsrctrgcontext_black = pattern_MemberInClassVisibility_24_2_matchsrctrgcontext_blackBBBBBBBB(
					mClass, mDefinition, mModifier, tMember, tModifier, tClass, sourceMatch, targetMatch);
			if (result_pattern_MemberInClassVisibility_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { mClass, mDefinition, mModifier, tMember, tModifier, tClass, sourceMatch,
						targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_MemberInClassVisibility_24_3_solvecsp_bindingFBBBBBBBBB(
			MemberInClassVisibility _this, ClassDeclaration mClass, MDefinition mDefinition, Modifier mModifier,
			TMember tMember, TModifier tModifier, TClass tClass, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_6 = _this.isApplicable_solveCsp_CC(mClass, mDefinition, mModifier, tMember, tModifier,
				tClass, sourceMatch, targetMatch);
		CSP csp = _localVariable_6;
		if (csp != null) {
			return new Object[] { csp, _this, mClass, mDefinition, mModifier, tMember, tModifier, tClass, sourceMatch,
					targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_MemberInClassVisibility_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MemberInClassVisibility_24_3_solvecsp_bindingAndBlackFBBBBBBBBB(
			MemberInClassVisibility _this, ClassDeclaration mClass, MDefinition mDefinition, Modifier mModifier,
			TMember tMember, TModifier tModifier, TClass tClass, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_MemberInClassVisibility_24_3_solvecsp_binding = pattern_MemberInClassVisibility_24_3_solvecsp_bindingFBBBBBBBBB(
				_this, mClass, mDefinition, mModifier, tMember, tModifier, tClass, sourceMatch, targetMatch);
		if (result_pattern_MemberInClassVisibility_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_MemberInClassVisibility_24_3_solvecsp_binding[0];

			Object[] result_pattern_MemberInClassVisibility_24_3_solvecsp_black = pattern_MemberInClassVisibility_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_MemberInClassVisibility_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, mClass, mDefinition, mModifier, tMember, tModifier, tClass,
						sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_MemberInClassVisibility_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_MemberInClassVisibility_24_5_matchcorrcontext_blackBFBBBFBB(
			ClassDeclaration mClass, MDefinition mDefinition, TMember tMember, TClass tClass, Match sourceMatch,
			Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (TypeToTAbstractType mTypeToTType : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(mClass, TypeToTAbstractType.class, "source")) {
				if (tClass.equals(mTypeToTType.getTarget())) {
					for (MDefinitionToTMember defToMember : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(tMember, MDefinitionToTMember.class, "target")) {
						if (mDefinition.equals(defToMember.getSource())) {
							_result.add(new Object[] { mClass, mTypeToTType, mDefinition, tMember, tClass, defToMember,
									sourceMatch, targetMatch });
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_MemberInClassVisibility_24_5_matchcorrcontext_greenBBBBF(
			TypeToTAbstractType mTypeToTType, MDefinitionToTMember defToMember, Match sourceMatch, Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "MemberInClassVisibility";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(mTypeToTType);
		ccMatch.getAllContextElements().add(defToMember);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { mTypeToTType, defToMember, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_MemberInClassVisibility_24_6_createcorrespondence_blackBBBBBBB(
			ClassDeclaration mClass, MDefinition mDefinition, Modifier mModifier, TMember tMember, TModifier tModifier,
			TClass tClass, CCMatch ccMatch) {
		return new Object[] { mClass, mDefinition, mModifier, tMember, tModifier, tClass, ccMatch };
	}

	public static final Object[] pattern_MemberInClassVisibility_24_6_createcorrespondence_greenFBBB(Modifier mModifier,
			TModifier tModifier, CCMatch ccMatch) {
		MModifierToTModifier mModifierToTModifier = PmFactory.eINSTANCE.createMModifierToTModifier();
		mModifierToTModifier.setSource(mModifier);
		mModifierToTModifier.setTarget(tModifier);
		ccMatch.getCreateCorr().add(mModifierToTModifier);
		return new Object[] { mModifierToTModifier, mModifier, tModifier, ccMatch };
	}

	public static final Object[] pattern_MemberInClassVisibility_24_7_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_MemberInClassVisibility_24_7_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "MemberInClassVisibility";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_MemberInClassVisibility_24_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_MemberInClassVisibility_27_1_matchtggpattern_blackBBB(ClassDeclaration mClass,
			MDefinition mDefinition, Modifier mModifier) {
		if (mClass.getBodyDeclarations().contains(mDefinition)) {
			if (mModifier.equals(mDefinition.getModifier())) {
				return new Object[] { mClass, mDefinition, mModifier };
			}
		}
		return null;
	}

	public static final boolean pattern_MemberInClassVisibility_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_MemberInClassVisibility_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_MemberInClassVisibility_28_1_matchtggpattern_black_nac_0BB(TModifier tModifier,
			TClass tClass) {
		for (TAbstractType __DEC_tModifier_tModifier_551224 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tModifier, TAbstractType.class, "tModifier")) {
			if (!tClass.equals(__DEC_tModifier_tModifier_551224)) {
				return new Object[] { tModifier, tClass };
			}
		}
		return null;
	}

	public static final Object[] pattern_MemberInClassVisibility_28_1_matchtggpattern_black_nac_1BB(TClass tClass,
			TModifier tModifier) {
		if (tModifier.equals(tClass.getTModifier())) {
			return new Object[] { tClass, tModifier };
		}
		return null;
	}

	public static final Object[] pattern_MemberInClassVisibility_28_1_matchtggpattern_blackBBB(TMember tMember,
			TModifier tModifier, TClass tClass) {
		if (tModifier.equals(tMember.getTModifier())) {
			if (tClass.getDefines().contains(tMember)) {
				if (pattern_MemberInClassVisibility_28_1_matchtggpattern_black_nac_0BB(tModifier, tClass) == null) {
					if (pattern_MemberInClassVisibility_28_1_matchtggpattern_black_nac_1BB(tClass, tModifier) == null) {
						return new Object[] { tMember, tModifier, tClass };
					}
				}
			}
		}
		return null;
	}

	public static final boolean pattern_MemberInClassVisibility_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_MemberInClassVisibility_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_MemberInClassVisibility_29_1_createresult_blackB(
			MemberInClassVisibility _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_MemberInClassVisibility_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_MemberInClassVisibility_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, ClassDeclaration mClass) {
		if (ruleResult.getSourceObjects().contains(mClass)) {
			return new Object[] { ruleResult, mClass };
		}
		return null;
	}

	public static final Object[] pattern_MemberInClassVisibility_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, MDefinition mDefinition) {
		if (ruleResult.getSourceObjects().contains(mDefinition)) {
			return new Object[] { ruleResult, mDefinition };
		}
		return null;
	}

	public static final Object[] pattern_MemberInClassVisibility_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, MDefinitionToTMember defToMember) {
		if (ruleResult.getCorrObjects().contains(defToMember)) {
			return new Object[] { ruleResult, defToMember };
		}
		return null;
	}

	public static final Object[] pattern_MemberInClassVisibility_29_2_isapplicablecore_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, TMember tMember) {
		if (ruleResult.getTargetObjects().contains(tMember)) {
			return new Object[] { ruleResult, tMember };
		}
		return null;
	}

	public static final Object[] pattern_MemberInClassVisibility_29_2_isapplicablecore_black_nac_4BB(
			ModelgeneratorRuleResult ruleResult, TClass tClass) {
		if (ruleResult.getTargetObjects().contains(tClass)) {
			return new Object[] { ruleResult, tClass };
		}
		return null;
	}

	public static final Object[] pattern_MemberInClassVisibility_29_2_isapplicablecore_black_nac_5BB(
			ModelgeneratorRuleResult ruleResult, TypeToTAbstractType mTypeToTType) {
		if (ruleResult.getCorrObjects().contains(mTypeToTType)) {
			return new Object[] { ruleResult, mTypeToTType };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_MemberInClassVisibility_29_2_isapplicablecore_blackFFFFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList defToMemberList : ruleEntryContainer.getRuleEntryList()) {
			for (EObject tmpDefToMember : defToMemberList.getEntryObjects()) {
				if (tmpDefToMember instanceof MDefinitionToTMember) {
					MDefinitionToTMember defToMember = (MDefinitionToTMember) tmpDefToMember;
					BodyDeclaration tmpMDefinition = defToMember.getSource();
					if (tmpMDefinition instanceof MDefinition) {
						MDefinition mDefinition = (MDefinition) tmpMDefinition;
						TMember tMember = defToMember.getTarget();
						if (tMember != null) {
							AbstractTypeDeclaration tmpMClass = mDefinition.getAbstractTypeDeclaration();
							if (tmpMClass instanceof ClassDeclaration) {
								ClassDeclaration mClass = (ClassDeclaration) tmpMClass;
								TAbstractType tmpTClass = tMember.getDefinedBy();
								if (tmpTClass instanceof TClass) {
									TClass tClass = (TClass) tmpTClass;
									if (pattern_MemberInClassVisibility_29_2_isapplicablecore_black_nac_2BB(ruleResult,
											defToMember) == null) {
										if (pattern_MemberInClassVisibility_29_2_isapplicablecore_black_nac_1BB(
												ruleResult, mDefinition) == null) {
											if (pattern_MemberInClassVisibility_29_2_isapplicablecore_black_nac_3BB(
													ruleResult, tMember) == null) {
												if (pattern_MemberInClassVisibility_29_2_isapplicablecore_black_nac_0BB(
														ruleResult, mClass) == null) {
													if (pattern_MemberInClassVisibility_29_2_isapplicablecore_black_nac_4BB(
															ruleResult, tClass) == null) {
														for (TypeToTAbstractType mTypeToTType : org.moflon.core.utilities.eMoflonEMFUtil
																.getOppositeReferenceTyped(mClass,
																		TypeToTAbstractType.class, "source")) {
															if (tClass.equals(mTypeToTType.getTarget())) {
																if (pattern_MemberInClassVisibility_29_2_isapplicablecore_black_nac_5BB(
																		ruleResult, mTypeToTType) == null) {
																	_result.add(new Object[] { defToMemberList, mClass,
																			mDefinition, defToMember, tMember, tClass,
																			mTypeToTType, ruleEntryContainer,
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
		return _result;
	}

	public static final Object[] pattern_MemberInClassVisibility_29_3_solveCSP_bindingFBBBBBBBBB(
			MemberInClassVisibility _this, IsApplicableMatch isApplicableMatch, ClassDeclaration mClass,
			TypeToTAbstractType mTypeToTType, MDefinition mDefinition, TMember tMember, TClass tClass,
			MDefinitionToTMember defToMember, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, mClass, mTypeToTType, mDefinition,
				tMember, tClass, defToMember, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mClass, mTypeToTType, mDefinition, tMember, tClass,
					defToMember, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_MemberInClassVisibility_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MemberInClassVisibility_29_3_solveCSP_bindingAndBlackFBBBBBBBBB(
			MemberInClassVisibility _this, IsApplicableMatch isApplicableMatch, ClassDeclaration mClass,
			TypeToTAbstractType mTypeToTType, MDefinition mDefinition, TMember tMember, TClass tClass,
			MDefinitionToTMember defToMember, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_MemberInClassVisibility_29_3_solveCSP_binding = pattern_MemberInClassVisibility_29_3_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, mClass, mTypeToTType, mDefinition, tMember, tClass, defToMember, ruleResult);
		if (result_pattern_MemberInClassVisibility_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_MemberInClassVisibility_29_3_solveCSP_binding[0];

			Object[] result_pattern_MemberInClassVisibility_29_3_solveCSP_black = pattern_MemberInClassVisibility_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_MemberInClassVisibility_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mClass, mTypeToTType, mDefinition, tMember, tClass,
						defToMember, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_MemberInClassVisibility_29_4_checkCSP_expressionFBB(
			MemberInClassVisibility _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MemberInClassVisibility_29_5_checknacs_blackBBBBBB(ClassDeclaration mClass,
			TypeToTAbstractType mTypeToTType, MDefinition mDefinition, TMember tMember, TClass tClass,
			MDefinitionToTMember defToMember) {
		return new Object[] { mClass, mTypeToTType, mDefinition, tMember, tClass, defToMember };
	}

	public static final Object[] pattern_MemberInClassVisibility_29_6_perform_blackBBBBBBB(ClassDeclaration mClass,
			TypeToTAbstractType mTypeToTType, MDefinition mDefinition, TMember tMember, TClass tClass,
			MDefinitionToTMember defToMember, ModelgeneratorRuleResult ruleResult) {
		return new Object[] { mClass, mTypeToTType, mDefinition, tMember, tClass, defToMember, ruleResult };
	}

	public static final Object[] pattern_MemberInClassVisibility_29_6_perform_greenBFFBFBB(MDefinition mDefinition,
			TMember tMember, ModelgeneratorRuleResult ruleResult, CSP csp) {
		MModifierToTModifier mModifierToTModifier = PmFactory.eINSTANCE.createMModifierToTModifier();
		Modifier mModifier = JavaFactory.eINSTANCE.createModifier();
		TModifier tModifier = BasicFactory.eINSTANCE.createTModifier();
		Object _localVariable_0 = csp.getValue("mModifier", "static");
		Object _localVariable_1 = csp.getValue("mModifier", "visibility");
		Object _localVariable_2 = csp.getValue("tModifier", "isStatic");
		Object _localVariable_3 = csp.getValue("tModifier", "tVisibility");
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_4 = ruleResult.getIncrementedPerformCount();
		ruleResult.getCorrObjects().add(mModifierToTModifier);
		mModifierToTModifier.setSource(mModifier);
		mDefinition.setModifier(mModifier);
		ruleResult.getSourceObjects().add(mModifier);
		tMember.setTModifier(tModifier);
		mModifierToTModifier.setTarget(tModifier);
		ruleResult.getTargetObjects().add(tModifier);
		boolean mModifier_static_prime = (boolean) _localVariable_0;
		VisibilityKind mModifier_visibility_prime = (VisibilityKind) _localVariable_1;
		boolean tModifier_isStatic_prime = (boolean) _localVariable_2;
		TVisibility tModifier_tVisibility_prime = (TVisibility) _localVariable_3;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_4);
		mModifier.setStatic(Boolean.valueOf(mModifier_static_prime));
		mModifier.setVisibility(mModifier_visibility_prime);
		tModifier.setIsStatic(Boolean.valueOf(tModifier_isStatic_prime));
		tModifier.setTVisibility(tModifier_tVisibility_prime);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { mDefinition, mModifierToTModifier, mModifier, tMember, tModifier, ruleResult, csp };
	}

	public static final ModelgeneratorRuleResult pattern_MemberInClassVisibility_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //MemberInClassVisibilityImpl
