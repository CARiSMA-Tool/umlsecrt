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
import org.eclipse.modisco.java.AnnotationTypeDeclaration;
import org.eclipse.modisco.java.BodyDeclaration;
import org.eclipse.modisco.java.Modifier;
import org.eclipse.modisco.java.Type;
import org.eclipse.modisco.java.VisibilityKind;

import org.eclipse.modisco.java.emf.JavaFactory;

import org.gravity.modisco.MDefinition;

import org.gravity.tgg.modisco.pm.MDefinitionToTMember;
import org.gravity.tgg.modisco.pm.MModifierToTModifier;
import org.gravity.tgg.modisco.pm.PmFactory;

import org.gravity.tgg.modisco.pm.Rules.MemberInAnnotationVisibility;
import org.gravity.tgg.modisco.pm.Rules.RulesPackage;

import org.gravity.tgg.modisco.pm.TypeToTAbstractType;

import org.gravity.typegraph.basic.BasicFactory;
import org.gravity.typegraph.basic.TAbstractType;
import org.gravity.typegraph.basic.TMember;
import org.gravity.typegraph.basic.TModifier;
import org.gravity.typegraph.basic.TVisibility;

import org.gravity.typegraph.basic.annotations.TAnnotationType;

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
 * An implementation of the model object '<em><b>Member In Annotation Visibility</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class MemberInAnnotationVisibilityImpl extends AbstractRuleImpl implements MemberInAnnotationVisibility {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MemberInAnnotationVisibilityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getMemberInAnnotationVisibility();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, Modifier mModifier, MDefinition mDefinition,
			AnnotationTypeDeclaration Annotation) {

		Object[] result1_black = MemberInAnnotationVisibilityImpl
				.pattern_MemberInAnnotationVisibility_0_1_initialbindings_blackBBBBB(this, match, mModifier,
						mDefinition, Annotation);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[mModifier] = " + mModifier + ", " + "[mDefinition] = "
					+ mDefinition + ", " + "[Annotation] = " + Annotation + ".");
		}

		Object[] result2_bindingAndBlack = MemberInAnnotationVisibilityImpl
				.pattern_MemberInAnnotationVisibility_0_2_SolveCSP_bindingAndBlackFBBBBB(this, match, mModifier,
						mDefinition, Annotation);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[mModifier] = " + mModifier + ", " + "[mDefinition] = "
					+ mDefinition + ", " + "[Annotation] = " + Annotation + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (MemberInAnnotationVisibilityImpl.pattern_MemberInAnnotationVisibility_0_3_CheckCSP_expressionFBB(this,
				csp)) {

			Object[] result4_black = MemberInAnnotationVisibilityImpl
					.pattern_MemberInAnnotationVisibility_0_4_collectelementstobetranslated_blackBBBB(match, mModifier,
							mDefinition, Annotation);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[mModifier] = " + mModifier + ", " + "[mDefinition] = " + mDefinition + ", "
						+ "[Annotation] = " + Annotation + ".");
			}
			MemberInAnnotationVisibilityImpl
					.pattern_MemberInAnnotationVisibility_0_4_collectelementstobetranslated_greenBBBFF(match, mModifier,
							mDefinition);
			//nothing EMoflonEdge mDefinition__mModifier____modifier = (EMoflonEdge) result4_green[3];
			//nothing EMoflonEdge mModifier__mDefinition____bodyDeclaration = (EMoflonEdge) result4_green[4];

			Object[] result5_black = MemberInAnnotationVisibilityImpl
					.pattern_MemberInAnnotationVisibility_0_5_collectcontextelements_blackBBBB(match, mModifier,
							mDefinition, Annotation);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[mModifier] = " + mModifier + ", " + "[mDefinition] = " + mDefinition + ", "
						+ "[Annotation] = " + Annotation + ".");
			}
			MemberInAnnotationVisibilityImpl.pattern_MemberInAnnotationVisibility_0_5_collectcontextelements_greenBBBFF(
					match, mDefinition, Annotation);
			//nothing EMoflonEdge Annotation__mDefinition____bodyDeclarations = (EMoflonEdge) result5_green[3];
			//nothing EMoflonEdge mDefinition__Annotation____abstractTypeDeclaration = (EMoflonEdge) result5_green[4];

			// 
			MemberInAnnotationVisibilityImpl
					.pattern_MemberInAnnotationVisibility_0_6_registerobjectstomatch_expressionBBBBB(this, match,
							mModifier, mDefinition, Annotation);
			return MemberInAnnotationVisibilityImpl.pattern_MemberInAnnotationVisibility_0_7_expressionF();
		} else {
			return MemberInAnnotationVisibilityImpl.pattern_MemberInAnnotationVisibility_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = MemberInAnnotationVisibilityImpl
				.pattern_MemberInAnnotationVisibility_1_1_performtransformation_bindingAndBlackFFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		Modifier mModifier = (Modifier) result1_bindingAndBlack[0];
		MDefinitionToTMember defToMember = (MDefinitionToTMember) result1_bindingAndBlack[1];
		MDefinition mDefinition = (MDefinition) result1_bindingAndBlack[2];
		AnnotationTypeDeclaration Annotation = (AnnotationTypeDeclaration) result1_bindingAndBlack[3];
		TAnnotationType tAnnotation = (TAnnotationType) result1_bindingAndBlack[4];
		TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result1_bindingAndBlack[5];
		TMember tMember = (TMember) result1_bindingAndBlack[6];
		CSP csp = (CSP) result1_bindingAndBlack[7];
		Object[] result1_green = MemberInAnnotationVisibilityImpl
				.pattern_MemberInAnnotationVisibility_1_1_performtransformation_greenBFFBB(mModifier, tMember, csp);
		TModifier tModifier = (TModifier) result1_green[1];
		MModifierToTModifier mModifierToTModifier = (MModifierToTModifier) result1_green[2];

		Object[] result2_black = MemberInAnnotationVisibilityImpl
				.pattern_MemberInAnnotationVisibility_1_2_collecttranslatedelements_blackBBB(mModifier, tModifier,
						mModifierToTModifier);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[mModifier] = " + mModifier + ", "
					+ "[tModifier] = " + tModifier + ", " + "[mModifierToTModifier] = " + mModifierToTModifier + ".");
		}
		Object[] result2_green = MemberInAnnotationVisibilityImpl
				.pattern_MemberInAnnotationVisibility_1_2_collecttranslatedelements_greenFBBB(mModifier, tModifier,
						mModifierToTModifier);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = MemberInAnnotationVisibilityImpl
				.pattern_MemberInAnnotationVisibility_1_3_bookkeepingforedges_blackBBBBBBBBBB(ruleresult, mModifier,
						defToMember, tModifier, mDefinition, mModifierToTModifier, Annotation, tAnnotation,
						mTypeToTType, tMember);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[mModifier] = " + mModifier + ", " + "[defToMember] = " + defToMember + ", "
					+ "[tModifier] = " + tModifier + ", " + "[mDefinition] = " + mDefinition + ", "
					+ "[mModifierToTModifier] = " + mModifierToTModifier + ", " + "[Annotation] = " + Annotation + ", "
					+ "[tAnnotation] = " + tAnnotation + ", " + "[mTypeToTType] = " + mTypeToTType + ", "
					+ "[tMember] = " + tMember + ".");
		}
		MemberInAnnotationVisibilityImpl.pattern_MemberInAnnotationVisibility_1_3_bookkeepingforedges_greenBBBBBBFFFFF(
				ruleresult, mModifier, tModifier, mDefinition, mModifierToTModifier, tMember);
		//nothing EMoflonEdge mModifierToTModifier__mModifier____source = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge mModifierToTModifier__tModifier____target = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge mDefinition__mModifier____modifier = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge mModifier__mDefinition____bodyDeclaration = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge tMember__tModifier____tModifier = (EMoflonEdge) result3_green[10];

		// 
		// 
		MemberInAnnotationVisibilityImpl.pattern_MemberInAnnotationVisibility_1_5_registerobjects_expressionBBBBBBBBBBB(
				this, ruleresult, mModifier, defToMember, tModifier, mDefinition, mModifierToTModifier, Annotation,
				tAnnotation, mTypeToTType, tMember);
		return MemberInAnnotationVisibilityImpl.pattern_MemberInAnnotationVisibility_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = MemberInAnnotationVisibilityImpl
				.pattern_MemberInAnnotationVisibility_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = MemberInAnnotationVisibilityImpl
				.pattern_MemberInAnnotationVisibility_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = MemberInAnnotationVisibilityImpl
				.pattern_MemberInAnnotationVisibility_2_2_corematch_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		Modifier mModifier = (Modifier) result2_binding[0];
		MDefinition mDefinition = (MDefinition) result2_binding[1];
		AnnotationTypeDeclaration Annotation = (AnnotationTypeDeclaration) result2_binding[2];
		for (Object[] result2_black : MemberInAnnotationVisibilityImpl
				.pattern_MemberInAnnotationVisibility_2_2_corematch_blackBFBBFFFB(mModifier, mDefinition, Annotation,
						match)) {
			MDefinitionToTMember defToMember = (MDefinitionToTMember) result2_black[1];
			TAnnotationType tAnnotation = (TAnnotationType) result2_black[4];
			TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result2_black[5];
			TMember tMember = (TMember) result2_black[6];
			// ForEach 
			for (Object[] result3_black : MemberInAnnotationVisibilityImpl
					.pattern_MemberInAnnotationVisibility_2_3_findcontext_blackBBBBBBB(mModifier, defToMember,
							mDefinition, Annotation, tAnnotation, mTypeToTType, tMember)) {
				Object[] result3_green = MemberInAnnotationVisibilityImpl
						.pattern_MemberInAnnotationVisibility_2_3_findcontext_greenBBBBBBBFFFFFFFFFFF(mModifier,
								defToMember, mDefinition, Annotation, tAnnotation, mTypeToTType, tMember);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[7];
				//nothing EMoflonEdge defToMember__mDefinition____source = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge Annotation__mDefinition____bodyDeclarations = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge mDefinition__Annotation____abstractTypeDeclaration = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge mDefinition__mModifier____modifier = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge mModifier__mDefinition____bodyDeclaration = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge tAnnotation__tMember____defines = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge tMember__tAnnotation____definedBy = (EMoflonEdge) result3_green[14];
				//nothing EMoflonEdge mTypeToTType__Annotation____source = (EMoflonEdge) result3_green[15];
				//nothing EMoflonEdge mTypeToTType__tAnnotation____target = (EMoflonEdge) result3_green[16];
				//nothing EMoflonEdge defToMember__tMember____target = (EMoflonEdge) result3_green[17];

				Object[] result4_bindingAndBlack = MemberInAnnotationVisibilityImpl
						.pattern_MemberInAnnotationVisibility_2_4_solveCSP_bindingAndBlackFBBBBBBBBB(this,
								isApplicableMatch, mModifier, defToMember, mDefinition, Annotation, tAnnotation,
								mTypeToTType, tMember);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[mModifier] = " + mModifier + ", "
							+ "[defToMember] = " + defToMember + ", " + "[mDefinition] = " + mDefinition + ", "
							+ "[Annotation] = " + Annotation + ", " + "[tAnnotation] = " + tAnnotation + ", "
							+ "[mTypeToTType] = " + mTypeToTType + ", " + "[tMember] = " + tMember + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (MemberInAnnotationVisibilityImpl
						.pattern_MemberInAnnotationVisibility_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = MemberInAnnotationVisibilityImpl
							.pattern_MemberInAnnotationVisibility_2_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					MemberInAnnotationVisibilityImpl
							.pattern_MemberInAnnotationVisibility_2_6_addmatchtoruleresult_greenBB(ruleresult,
									isApplicableMatch);

				} else {
				}

			}

		}
		return MemberInAnnotationVisibilityImpl.pattern_MemberInAnnotationVisibility_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, Modifier mModifier, MDefinition mDefinition,
			AnnotationTypeDeclaration Annotation) {
		match.registerObject("mModifier", mModifier);
		match.registerObject("mDefinition", mDefinition);
		match.registerObject("Annotation", Annotation);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, Modifier mModifier, MDefinition mDefinition,
			AnnotationTypeDeclaration Annotation) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, Modifier mModifier,
			MDefinitionToTMember defToMember, MDefinition mDefinition, AnnotationTypeDeclaration Annotation,
			TAnnotationType tAnnotation, TypeToTAbstractType mTypeToTType, TMember tMember) {// Create CSP
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
		isApplicableMatch.registerObject("mModifier", mModifier);
		isApplicableMatch.registerObject("defToMember", defToMember);
		isApplicableMatch.registerObject("mDefinition", mDefinition);
		isApplicableMatch.registerObject("Annotation", Annotation);
		isApplicableMatch.registerObject("tAnnotation", tAnnotation);
		isApplicableMatch.registerObject("mTypeToTType", mTypeToTType);
		isApplicableMatch.registerObject("tMember", tMember);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject mModifier, EObject defToMember,
			EObject tModifier, EObject mDefinition, EObject mModifierToTModifier, EObject Annotation,
			EObject tAnnotation, EObject mTypeToTType, EObject tMember) {
		ruleresult.registerObject("mModifier", mModifier);
		ruleresult.registerObject("defToMember", defToMember);
		ruleresult.registerObject("tModifier", tModifier);
		ruleresult.registerObject("mDefinition", mDefinition);
		ruleresult.registerObject("mModifierToTModifier", mModifierToTModifier);
		ruleresult.registerObject("Annotation", Annotation);
		ruleresult.registerObject("tAnnotation", tAnnotation);
		ruleresult.registerObject("mTypeToTType", mTypeToTType);
		ruleresult.registerObject("tMember", tMember);

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
	public boolean isAppropriate_BWD(Match match, TModifier tModifier, TAnnotationType tAnnotation, TMember tMember) {

		Object[] result1_black = MemberInAnnotationVisibilityImpl
				.pattern_MemberInAnnotationVisibility_10_1_initialbindings_blackBBBBB(this, match, tModifier,
						tAnnotation, tMember);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[tModifier] = " + tModifier + ", " + "[tAnnotation] = "
					+ tAnnotation + ", " + "[tMember] = " + tMember + ".");
		}

		Object[] result2_bindingAndBlack = MemberInAnnotationVisibilityImpl
				.pattern_MemberInAnnotationVisibility_10_2_SolveCSP_bindingAndBlackFBBBBB(this, match, tModifier,
						tAnnotation, tMember);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[tModifier] = " + tModifier + ", " + "[tAnnotation] = "
					+ tAnnotation + ", " + "[tMember] = " + tMember + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (MemberInAnnotationVisibilityImpl.pattern_MemberInAnnotationVisibility_10_3_CheckCSP_expressionFBB(this,
				csp)) {

			Object[] result4_black = MemberInAnnotationVisibilityImpl
					.pattern_MemberInAnnotationVisibility_10_4_collectelementstobetranslated_blackBBBB(match, tModifier,
							tAnnotation, tMember);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[tModifier] = " + tModifier + ", " + "[tAnnotation] = " + tAnnotation + ", " + "[tMember] = "
						+ tMember + ".");
			}
			MemberInAnnotationVisibilityImpl
					.pattern_MemberInAnnotationVisibility_10_4_collectelementstobetranslated_greenBBBF(match, tModifier,
							tMember);
			//nothing EMoflonEdge tMember__tModifier____tModifier = (EMoflonEdge) result4_green[3];

			Object[] result5_black = MemberInAnnotationVisibilityImpl
					.pattern_MemberInAnnotationVisibility_10_5_collectcontextelements_blackBBBB(match, tModifier,
							tAnnotation, tMember);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[tModifier] = " + tModifier + ", " + "[tAnnotation] = " + tAnnotation + ", " + "[tMember] = "
						+ tMember + ".");
			}
			MemberInAnnotationVisibilityImpl
					.pattern_MemberInAnnotationVisibility_10_5_collectcontextelements_greenBBBFF(match, tAnnotation,
							tMember);
			//nothing EMoflonEdge tAnnotation__tMember____defines = (EMoflonEdge) result5_green[3];
			//nothing EMoflonEdge tMember__tAnnotation____definedBy = (EMoflonEdge) result5_green[4];

			// 
			MemberInAnnotationVisibilityImpl
					.pattern_MemberInAnnotationVisibility_10_6_registerobjectstomatch_expressionBBBBB(this, match,
							tModifier, tAnnotation, tMember);
			return MemberInAnnotationVisibilityImpl.pattern_MemberInAnnotationVisibility_10_7_expressionF();
		} else {
			return MemberInAnnotationVisibilityImpl.pattern_MemberInAnnotationVisibility_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = MemberInAnnotationVisibilityImpl
				.pattern_MemberInAnnotationVisibility_11_1_performtransformation_bindingAndBlackFFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		MDefinitionToTMember defToMember = (MDefinitionToTMember) result1_bindingAndBlack[0];
		TModifier tModifier = (TModifier) result1_bindingAndBlack[1];
		MDefinition mDefinition = (MDefinition) result1_bindingAndBlack[2];
		AnnotationTypeDeclaration Annotation = (AnnotationTypeDeclaration) result1_bindingAndBlack[3];
		TAnnotationType tAnnotation = (TAnnotationType) result1_bindingAndBlack[4];
		TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result1_bindingAndBlack[5];
		TMember tMember = (TMember) result1_bindingAndBlack[6];
		CSP csp = (CSP) result1_bindingAndBlack[7];
		Object[] result1_green = MemberInAnnotationVisibilityImpl
				.pattern_MemberInAnnotationVisibility_11_1_performtransformation_greenFBBFB(tModifier, mDefinition,
						csp);
		Modifier mModifier = (Modifier) result1_green[0];
		MModifierToTModifier mModifierToTModifier = (MModifierToTModifier) result1_green[3];

		Object[] result2_black = MemberInAnnotationVisibilityImpl
				.pattern_MemberInAnnotationVisibility_11_2_collecttranslatedelements_blackBBB(mModifier, tModifier,
						mModifierToTModifier);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[mModifier] = " + mModifier + ", "
					+ "[tModifier] = " + tModifier + ", " + "[mModifierToTModifier] = " + mModifierToTModifier + ".");
		}
		Object[] result2_green = MemberInAnnotationVisibilityImpl
				.pattern_MemberInAnnotationVisibility_11_2_collecttranslatedelements_greenFBBB(mModifier, tModifier,
						mModifierToTModifier);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = MemberInAnnotationVisibilityImpl
				.pattern_MemberInAnnotationVisibility_11_3_bookkeepingforedges_blackBBBBBBBBBB(ruleresult, mModifier,
						defToMember, tModifier, mDefinition, mModifierToTModifier, Annotation, tAnnotation,
						mTypeToTType, tMember);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[mModifier] = " + mModifier + ", " + "[defToMember] = " + defToMember + ", "
					+ "[tModifier] = " + tModifier + ", " + "[mDefinition] = " + mDefinition + ", "
					+ "[mModifierToTModifier] = " + mModifierToTModifier + ", " + "[Annotation] = " + Annotation + ", "
					+ "[tAnnotation] = " + tAnnotation + ", " + "[mTypeToTType] = " + mTypeToTType + ", "
					+ "[tMember] = " + tMember + ".");
		}
		MemberInAnnotationVisibilityImpl.pattern_MemberInAnnotationVisibility_11_3_bookkeepingforedges_greenBBBBBBFFFFF(
				ruleresult, mModifier, tModifier, mDefinition, mModifierToTModifier, tMember);
		//nothing EMoflonEdge mModifierToTModifier__mModifier____source = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge mModifierToTModifier__tModifier____target = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge mDefinition__mModifier____modifier = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge mModifier__mDefinition____bodyDeclaration = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge tMember__tModifier____tModifier = (EMoflonEdge) result3_green[10];

		// 
		// 
		MemberInAnnotationVisibilityImpl
				.pattern_MemberInAnnotationVisibility_11_5_registerobjects_expressionBBBBBBBBBBB(this, ruleresult,
						mModifier, defToMember, tModifier, mDefinition, mModifierToTModifier, Annotation, tAnnotation,
						mTypeToTType, tMember);
		return MemberInAnnotationVisibilityImpl.pattern_MemberInAnnotationVisibility_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = MemberInAnnotationVisibilityImpl
				.pattern_MemberInAnnotationVisibility_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = MemberInAnnotationVisibilityImpl
				.pattern_MemberInAnnotationVisibility_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = MemberInAnnotationVisibilityImpl
				.pattern_MemberInAnnotationVisibility_12_2_corematch_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		TModifier tModifier = (TModifier) result2_binding[0];
		TAnnotationType tAnnotation = (TAnnotationType) result2_binding[1];
		TMember tMember = (TMember) result2_binding[2];
		for (Object[] result2_black : MemberInAnnotationVisibilityImpl
				.pattern_MemberInAnnotationVisibility_12_2_corematch_blackFBFFBFBB(tModifier, tAnnotation, tMember,
						match)) {
			MDefinitionToTMember defToMember = (MDefinitionToTMember) result2_black[0];
			MDefinition mDefinition = (MDefinition) result2_black[2];
			AnnotationTypeDeclaration Annotation = (AnnotationTypeDeclaration) result2_black[3];
			TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result2_black[5];
			// ForEach 
			for (Object[] result3_black : MemberInAnnotationVisibilityImpl
					.pattern_MemberInAnnotationVisibility_12_3_findcontext_blackBBBBBBB(defToMember, tModifier,
							mDefinition, Annotation, tAnnotation, mTypeToTType, tMember)) {
				Object[] result3_green = MemberInAnnotationVisibilityImpl
						.pattern_MemberInAnnotationVisibility_12_3_findcontext_greenBBBBBBBFFFFFFFFFF(defToMember,
								tModifier, mDefinition, Annotation, tAnnotation, mTypeToTType, tMember);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[7];
				//nothing EMoflonEdge defToMember__mDefinition____source = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge Annotation__mDefinition____bodyDeclarations = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge mDefinition__Annotation____abstractTypeDeclaration = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge tAnnotation__tMember____defines = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge tMember__tAnnotation____definedBy = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge mTypeToTType__Annotation____source = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge tMember__tModifier____tModifier = (EMoflonEdge) result3_green[14];
				//nothing EMoflonEdge mTypeToTType__tAnnotation____target = (EMoflonEdge) result3_green[15];
				//nothing EMoflonEdge defToMember__tMember____target = (EMoflonEdge) result3_green[16];

				Object[] result4_bindingAndBlack = MemberInAnnotationVisibilityImpl
						.pattern_MemberInAnnotationVisibility_12_4_solveCSP_bindingAndBlackFBBBBBBBBB(this,
								isApplicableMatch, defToMember, tModifier, mDefinition, Annotation, tAnnotation,
								mTypeToTType, tMember);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[defToMember] = " + defToMember
							+ ", " + "[tModifier] = " + tModifier + ", " + "[mDefinition] = " + mDefinition + ", "
							+ "[Annotation] = " + Annotation + ", " + "[tAnnotation] = " + tAnnotation + ", "
							+ "[mTypeToTType] = " + mTypeToTType + ", " + "[tMember] = " + tMember + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (MemberInAnnotationVisibilityImpl
						.pattern_MemberInAnnotationVisibility_12_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = MemberInAnnotationVisibilityImpl
							.pattern_MemberInAnnotationVisibility_12_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					MemberInAnnotationVisibilityImpl
							.pattern_MemberInAnnotationVisibility_12_6_addmatchtoruleresult_greenBB(ruleresult,
									isApplicableMatch);

				} else {
				}

			}

		}
		return MemberInAnnotationVisibilityImpl.pattern_MemberInAnnotationVisibility_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, TModifier tModifier, TAnnotationType tAnnotation,
			TMember tMember) {
		match.registerObject("tModifier", tModifier);
		match.registerObject("tAnnotation", tAnnotation);
		match.registerObject("tMember", tMember);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, TModifier tModifier, TAnnotationType tAnnotation,
			TMember tMember) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, MDefinitionToTMember defToMember,
			TModifier tModifier, MDefinition mDefinition, AnnotationTypeDeclaration Annotation,
			TAnnotationType tAnnotation, TypeToTAbstractType mTypeToTType, TMember tMember) {// Create CSP
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
		isApplicableMatch.registerObject("defToMember", defToMember);
		isApplicableMatch.registerObject("tModifier", tModifier);
		isApplicableMatch.registerObject("mDefinition", mDefinition);
		isApplicableMatch.registerObject("Annotation", Annotation);
		isApplicableMatch.registerObject("tAnnotation", tAnnotation);
		isApplicableMatch.registerObject("mTypeToTType", mTypeToTType);
		isApplicableMatch.registerObject("tMember", tMember);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject mModifier, EObject defToMember,
			EObject tModifier, EObject mDefinition, EObject mModifierToTModifier, EObject Annotation,
			EObject tAnnotation, EObject mTypeToTType, EObject tMember) {
		ruleresult.registerObject("mModifier", mModifier);
		ruleresult.registerObject("defToMember", defToMember);
		ruleresult.registerObject("tModifier", tModifier);
		ruleresult.registerObject("mDefinition", mDefinition);
		ruleresult.registerObject("mModifierToTModifier", mModifierToTModifier);
		ruleresult.registerObject("Annotation", Annotation);
		ruleresult.registerObject("tAnnotation", tAnnotation);
		ruleresult.registerObject("mTypeToTType", mTypeToTType);
		ruleresult.registerObject("tMember", tMember);

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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_44(EMoflonEdge _edge_tModifier) {

		Object[] result1_bindingAndBlack = MemberInAnnotationVisibilityImpl
				.pattern_MemberInAnnotationVisibility_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = MemberInAnnotationVisibilityImpl
				.pattern_MemberInAnnotationVisibility_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : MemberInAnnotationVisibilityImpl
				.pattern_MemberInAnnotationVisibility_20_2_testcorematchandDECs_blackFFFB(_edge_tModifier)) {
			TModifier tModifier = (TModifier) result2_black[0];
			TAnnotationType tAnnotation = (TAnnotationType) result2_black[1];
			TMember tMember = (TMember) result2_black[2];
			Object[] result2_green = MemberInAnnotationVisibilityImpl
					.pattern_MemberInAnnotationVisibility_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (MemberInAnnotationVisibilityImpl
					.pattern_MemberInAnnotationVisibility_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
							this, match, tModifier, tAnnotation, tMember)) {
				// 
				if (MemberInAnnotationVisibilityImpl
						.pattern_MemberInAnnotationVisibility_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = MemberInAnnotationVisibilityImpl
							.pattern_MemberInAnnotationVisibility_20_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					MemberInAnnotationVisibilityImpl
							.pattern_MemberInAnnotationVisibility_20_5_Addmatchtoruleresult_greenBBBB(match,
									__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return MemberInAnnotationVisibilityImpl.pattern_MemberInAnnotationVisibility_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_45(EMoflonEdge _edge_modifier) {

		Object[] result1_bindingAndBlack = MemberInAnnotationVisibilityImpl
				.pattern_MemberInAnnotationVisibility_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = MemberInAnnotationVisibilityImpl
				.pattern_MemberInAnnotationVisibility_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : MemberInAnnotationVisibilityImpl
				.pattern_MemberInAnnotationVisibility_21_2_testcorematchandDECs_blackFFFB(_edge_modifier)) {
			Modifier mModifier = (Modifier) result2_black[0];
			MDefinition mDefinition = (MDefinition) result2_black[1];
			AnnotationTypeDeclaration Annotation = (AnnotationTypeDeclaration) result2_black[2];
			Object[] result2_green = MemberInAnnotationVisibilityImpl
					.pattern_MemberInAnnotationVisibility_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (MemberInAnnotationVisibilityImpl
					.pattern_MemberInAnnotationVisibility_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
							this, match, mModifier, mDefinition, Annotation)) {
				// 
				if (MemberInAnnotationVisibilityImpl
						.pattern_MemberInAnnotationVisibility_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = MemberInAnnotationVisibilityImpl
							.pattern_MemberInAnnotationVisibility_21_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					MemberInAnnotationVisibilityImpl
							.pattern_MemberInAnnotationVisibility_21_5_Addmatchtoruleresult_greenBBBB(match,
									__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return MemberInAnnotationVisibilityImpl.pattern_MemberInAnnotationVisibility_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("MemberInAnnotationVisibility");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		Variable var_tModifier_isStatic = CSPFactoryHelper.eINSTANCE.createVariable("tModifier", true, csp);
		var_tModifier_isStatic.setValue(__helper.getValue("tModifier", "isStatic"));
		var_tModifier_isStatic.setType("boolean");

		Variable var_mModifier_static = CSPFactoryHelper.eINSTANCE.createVariable("mModifier", true, csp);
		var_mModifier_static.setValue(__helper.getValue("mModifier", "static"));
		var_mModifier_static.setType("boolean");

		Variable var_mModifier_visibility = CSPFactoryHelper.eINSTANCE.createVariable("mModifier", true, csp);
		var_mModifier_visibility.setValue(__helper.getValue("mModifier", "visibility"));
		var_mModifier_visibility.setType("java.VisibilityKind");

		Variable var_tModifier_tVisibility = CSPFactoryHelper.eINSTANCE.createVariable("tModifier", true, csp);
		var_tModifier_tVisibility.setValue(__helper.getValue("tModifier", "tVisibility"));
		var_tModifier_tVisibility.setType("basic.TVisibility");

		Eq eq0 = new Eq();
		csp.getConstraints().add(eq0);

		DefaultVisibility defaultVisibility1 = new DefaultVisibility();
		csp.getConstraints().add(defaultVisibility1);

		eq0.setRuleName("MemberInAnnotationVisibility");
		eq0.solve(var_mModifier_static, var_tModifier_isStatic);

		defaultVisibility1.setRuleName("MemberInAnnotationVisibility");
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
		ruleResult.setRule("MemberInAnnotationVisibility");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		Variable var_tModifier_isStatic = CSPFactoryHelper.eINSTANCE.createVariable("tModifier", true, csp);
		var_tModifier_isStatic.setValue(__helper.getValue("tModifier", "isStatic"));
		var_tModifier_isStatic.setType("boolean");

		Variable var_mModifier_static = CSPFactoryHelper.eINSTANCE.createVariable("mModifier", true, csp);
		var_mModifier_static.setValue(__helper.getValue("mModifier", "static"));
		var_mModifier_static.setType("boolean");

		Variable var_mModifier_visibility = CSPFactoryHelper.eINSTANCE.createVariable("mModifier", true, csp);
		var_mModifier_visibility.setValue(__helper.getValue("mModifier", "visibility"));
		var_mModifier_visibility.setType("java.VisibilityKind");

		Variable var_tModifier_tVisibility = CSPFactoryHelper.eINSTANCE.createVariable("tModifier", true, csp);
		var_tModifier_tVisibility.setValue(__helper.getValue("tModifier", "tVisibility"));
		var_tModifier_tVisibility.setType("basic.TVisibility");

		Eq eq0 = new Eq();
		csp.getConstraints().add(eq0);

		DefaultVisibility defaultVisibility1 = new DefaultVisibility();
		csp.getConstraints().add(defaultVisibility1);

		eq0.setRuleName("MemberInAnnotationVisibility");
		eq0.solve(var_mModifier_static, var_tModifier_isStatic);

		defaultVisibility1.setRuleName("MemberInAnnotationVisibility");
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

		Object[] result1_black = MemberInAnnotationVisibilityImpl
				.pattern_MemberInAnnotationVisibility_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = MemberInAnnotationVisibilityImpl
				.pattern_MemberInAnnotationVisibility_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = MemberInAnnotationVisibilityImpl
				.pattern_MemberInAnnotationVisibility_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFBB(sourceMatch,
						targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		Modifier mModifier = (Modifier) result2_bindingAndBlack[0];
		TModifier tModifier = (TModifier) result2_bindingAndBlack[1];
		MDefinition mDefinition = (MDefinition) result2_bindingAndBlack[2];
		AnnotationTypeDeclaration Annotation = (AnnotationTypeDeclaration) result2_bindingAndBlack[3];
		TAnnotationType tAnnotation = (TAnnotationType) result2_bindingAndBlack[4];
		TMember tMember = (TMember) result2_bindingAndBlack[5];

		Object[] result3_bindingAndBlack = MemberInAnnotationVisibilityImpl
				.pattern_MemberInAnnotationVisibility_24_3_solvecsp_bindingAndBlackFBBBBBBBBB(this, mModifier,
						tModifier, mDefinition, Annotation, tAnnotation, tMember, sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[mModifier] = " + mModifier + ", " + "[tModifier] = " + tModifier + ", " + "[mDefinition] = "
					+ mDefinition + ", " + "[Annotation] = " + Annotation + ", " + "[tAnnotation] = " + tAnnotation
					+ ", " + "[tMember] = " + tMember + ", " + "[sourceMatch] = " + sourceMatch + ", "
					+ "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (MemberInAnnotationVisibilityImpl.pattern_MemberInAnnotationVisibility_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : MemberInAnnotationVisibilityImpl
					.pattern_MemberInAnnotationVisibility_24_5_matchcorrcontext_blackFBBBFBBB(mDefinition, Annotation,
							tAnnotation, tMember, sourceMatch, targetMatch)) {
				MDefinitionToTMember defToMember = (MDefinitionToTMember) result5_black[0];
				TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result5_black[4];
				Object[] result5_green = MemberInAnnotationVisibilityImpl
						.pattern_MemberInAnnotationVisibility_24_5_matchcorrcontext_greenBBBBF(defToMember,
								mTypeToTType, sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[4];

				Object[] result6_black = MemberInAnnotationVisibilityImpl
						.pattern_MemberInAnnotationVisibility_24_6_createcorrespondence_blackBBBBBBB(mModifier,
								tModifier, mDefinition, Annotation, tAnnotation, tMember, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[mModifier] = "
							+ mModifier + ", " + "[tModifier] = " + tModifier + ", " + "[mDefinition] = " + mDefinition
							+ ", " + "[Annotation] = " + Annotation + ", " + "[tAnnotation] = " + tAnnotation + ", "
							+ "[tMember] = " + tMember + ", " + "[ccMatch] = " + ccMatch + ".");
				}
				MemberInAnnotationVisibilityImpl
						.pattern_MemberInAnnotationVisibility_24_6_createcorrespondence_greenBBFB(mModifier, tModifier,
								ccMatch);
				//nothing MModifierToTModifier mModifierToTModifier = (MModifierToTModifier) result6_green[2];

				Object[] result7_black = MemberInAnnotationVisibilityImpl
						.pattern_MemberInAnnotationVisibility_24_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				MemberInAnnotationVisibilityImpl
						.pattern_MemberInAnnotationVisibility_24_7_addtoreturnedresult_greenBB(result, ccMatch);

			}

		} else {
		}
		return MemberInAnnotationVisibilityImpl.pattern_MemberInAnnotationVisibility_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(Modifier mModifier, TModifier tModifier, MDefinition mDefinition,
			AnnotationTypeDeclaration Annotation, TAnnotationType tAnnotation, TMember tMember, Match sourceMatch,
			Match targetMatch) {// Create CSP
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
	public boolean checkDEC_FWD(Modifier mModifier, MDefinition mDefinition, AnnotationTypeDeclaration Annotation) {// 
		Object[] result1_black = MemberInAnnotationVisibilityImpl
				.pattern_MemberInAnnotationVisibility_27_1_matchtggpattern_blackBBB(mModifier, mDefinition, Annotation);
		if (result1_black != null) {
			return MemberInAnnotationVisibilityImpl.pattern_MemberInAnnotationVisibility_27_2_expressionF();
		} else {
			return MemberInAnnotationVisibilityImpl.pattern_MemberInAnnotationVisibility_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(TModifier tModifier, TAnnotationType tAnnotation, TMember tMember) {// 
		Object[] result1_black = MemberInAnnotationVisibilityImpl
				.pattern_MemberInAnnotationVisibility_28_1_matchtggpattern_blackBBB(tModifier, tAnnotation, tMember);
		if (result1_black != null) {
			return MemberInAnnotationVisibilityImpl.pattern_MemberInAnnotationVisibility_28_2_expressionF();
		} else {
			return MemberInAnnotationVisibilityImpl.pattern_MemberInAnnotationVisibility_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer,
			MDefinitionToTMember defToMemberParameter) {

		Object[] result1_black = MemberInAnnotationVisibilityImpl
				.pattern_MemberInAnnotationVisibility_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = MemberInAnnotationVisibilityImpl
				.pattern_MemberInAnnotationVisibility_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : MemberInAnnotationVisibilityImpl
				.pattern_MemberInAnnotationVisibility_29_2_isapplicablecore_blackFFFFFFFBB(ruleEntryContainer,
						ruleResult)) {
			//nothing RuleEntryList defToMemberList = (RuleEntryList) result2_black[0];
			MDefinitionToTMember defToMember = (MDefinitionToTMember) result2_black[1];
			MDefinition mDefinition = (MDefinition) result2_black[2];
			AnnotationTypeDeclaration Annotation = (AnnotationTypeDeclaration) result2_black[3];
			TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result2_black[4];
			TAnnotationType tAnnotation = (TAnnotationType) result2_black[5];
			TMember tMember = (TMember) result2_black[6];

			Object[] result3_bindingAndBlack = MemberInAnnotationVisibilityImpl
					.pattern_MemberInAnnotationVisibility_29_3_solveCSP_bindingAndBlackFBBBBBBBBB(this,
							isApplicableMatch, defToMember, mDefinition, Annotation, tAnnotation, mTypeToTType, tMember,
							ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[defToMember] = " + defToMember + ", "
						+ "[mDefinition] = " + mDefinition + ", " + "[Annotation] = " + Annotation + ", "
						+ "[tAnnotation] = " + tAnnotation + ", " + "[mTypeToTType] = " + mTypeToTType + ", "
						+ "[tMember] = " + tMember + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (MemberInAnnotationVisibilityImpl.pattern_MemberInAnnotationVisibility_29_4_checkCSP_expressionFBB(this,
					csp)) {
				// 
				Object[] result5_black = MemberInAnnotationVisibilityImpl
						.pattern_MemberInAnnotationVisibility_29_5_checknacs_blackBBBBBB(defToMember, mDefinition,
								Annotation, tAnnotation, mTypeToTType, tMember);
				if (result5_black != null) {

					Object[] result6_black = MemberInAnnotationVisibilityImpl
							.pattern_MemberInAnnotationVisibility_29_6_perform_blackBBBBBBB(defToMember, mDefinition,
									Annotation, tAnnotation, mTypeToTType, tMember, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[defToMember] = "
								+ defToMember + ", " + "[mDefinition] = " + mDefinition + ", " + "[Annotation] = "
								+ Annotation + ", " + "[tAnnotation] = " + tAnnotation + ", " + "[mTypeToTType] = "
								+ mTypeToTType + ", " + "[tMember] = " + tMember + ", " + "[ruleResult] = " + ruleResult
								+ ".");
					}
					MemberInAnnotationVisibilityImpl.pattern_MemberInAnnotationVisibility_29_6_perform_greenFFBFBBB(
							mDefinition, tMember, ruleResult, csp);
					//nothing Modifier mModifier = (Modifier) result6_green[0];
					//nothing TModifier tModifier = (TModifier) result6_green[1];
					//nothing MModifierToTModifier mModifierToTModifier = (MModifierToTModifier) result6_green[3];

				} else {
				}

			} else {
			}

		}
		return MemberInAnnotationVisibilityImpl.pattern_MemberInAnnotationVisibility_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, MDefinitionToTMember defToMember,
			MDefinition mDefinition, AnnotationTypeDeclaration Annotation, TAnnotationType tAnnotation,
			TypeToTAbstractType mTypeToTType, TMember tMember, ModelgeneratorRuleResult ruleResult) {// Create CSP
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
		isApplicableMatch.registerObject("defToMember", defToMember);
		isApplicableMatch.registerObject("mDefinition", mDefinition);
		isApplicableMatch.registerObject("Annotation", Annotation);
		isApplicableMatch.registerObject("tAnnotation", tAnnotation);
		isApplicableMatch.registerObject("mTypeToTType", mTypeToTType);
		isApplicableMatch.registerObject("tMember", tMember);
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
		case RulesPackage.MEMBER_IN_ANNOTATION_VISIBILITY___IS_APPROPRIATE_FWD__MATCH_MODIFIER_MDEFINITION_ANNOTATIONTYPEDECLARATION:
			return isAppropriate_FWD((Match) arguments.get(0), (Modifier) arguments.get(1),
					(MDefinition) arguments.get(2), (AnnotationTypeDeclaration) arguments.get(3));
		case RulesPackage.MEMBER_IN_ANNOTATION_VISIBILITY___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.MEMBER_IN_ANNOTATION_VISIBILITY___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.MEMBER_IN_ANNOTATION_VISIBILITY___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_MODIFIER_MDEFINITION_ANNOTATIONTYPEDECLARATION:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (Modifier) arguments.get(1),
					(MDefinition) arguments.get(2), (AnnotationTypeDeclaration) arguments.get(3));
			return null;
		case RulesPackage.MEMBER_IN_ANNOTATION_VISIBILITY___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_MODIFIER_MDEFINITION_ANNOTATIONTYPEDECLARATION:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (Modifier) arguments.get(1),
					(MDefinition) arguments.get(2), (AnnotationTypeDeclaration) arguments.get(3));
		case RulesPackage.MEMBER_IN_ANNOTATION_VISIBILITY___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.MEMBER_IN_ANNOTATION_VISIBILITY___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_MODIFIER_MDEFINITIONTOTMEMBER_MDEFINITION_ANNOTATIONTYPEDECLARATION_TANNOTATIONTYPE_TYPETOTABSTRACTTYPE_TMEMBER:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (Modifier) arguments.get(1),
					(MDefinitionToTMember) arguments.get(2), (MDefinition) arguments.get(3),
					(AnnotationTypeDeclaration) arguments.get(4), (TAnnotationType) arguments.get(5),
					(TypeToTAbstractType) arguments.get(6), (TMember) arguments.get(7));
		case RulesPackage.MEMBER_IN_ANNOTATION_VISIBILITY___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.MEMBER_IN_ANNOTATION_VISIBILITY___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9));
			return null;
		case RulesPackage.MEMBER_IN_ANNOTATION_VISIBILITY___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.MEMBER_IN_ANNOTATION_VISIBILITY___IS_APPROPRIATE_BWD__MATCH_TMODIFIER_TANNOTATIONTYPE_TMEMBER:
			return isAppropriate_BWD((Match) arguments.get(0), (TModifier) arguments.get(1),
					(TAnnotationType) arguments.get(2), (TMember) arguments.get(3));
		case RulesPackage.MEMBER_IN_ANNOTATION_VISIBILITY___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.MEMBER_IN_ANNOTATION_VISIBILITY___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.MEMBER_IN_ANNOTATION_VISIBILITY___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TMODIFIER_TANNOTATIONTYPE_TMEMBER:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (TModifier) arguments.get(1),
					(TAnnotationType) arguments.get(2), (TMember) arguments.get(3));
			return null;
		case RulesPackage.MEMBER_IN_ANNOTATION_VISIBILITY___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TMODIFIER_TANNOTATIONTYPE_TMEMBER:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (TModifier) arguments.get(1),
					(TAnnotationType) arguments.get(2), (TMember) arguments.get(3));
		case RulesPackage.MEMBER_IN_ANNOTATION_VISIBILITY___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.MEMBER_IN_ANNOTATION_VISIBILITY___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_MDEFINITIONTOTMEMBER_TMODIFIER_MDEFINITION_ANNOTATIONTYPEDECLARATION_TANNOTATIONTYPE_TYPETOTABSTRACTTYPE_TMEMBER:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
					(MDefinitionToTMember) arguments.get(1), (TModifier) arguments.get(2),
					(MDefinition) arguments.get(3), (AnnotationTypeDeclaration) arguments.get(4),
					(TAnnotationType) arguments.get(5), (TypeToTAbstractType) arguments.get(6),
					(TMember) arguments.get(7));
		case RulesPackage.MEMBER_IN_ANNOTATION_VISIBILITY___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.MEMBER_IN_ANNOTATION_VISIBILITY___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9));
			return null;
		case RulesPackage.MEMBER_IN_ANNOTATION_VISIBILITY___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.MEMBER_IN_ANNOTATION_VISIBILITY___IS_APPROPRIATE_BWD_EMOFLON_EDGE_44__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_44((EMoflonEdge) arguments.get(0));
		case RulesPackage.MEMBER_IN_ANNOTATION_VISIBILITY___IS_APPROPRIATE_FWD_EMOFLON_EDGE_45__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_45((EMoflonEdge) arguments.get(0));
		case RulesPackage.MEMBER_IN_ANNOTATION_VISIBILITY___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.MEMBER_IN_ANNOTATION_VISIBILITY___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.MEMBER_IN_ANNOTATION_VISIBILITY___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.MEMBER_IN_ANNOTATION_VISIBILITY___IS_APPLICABLE_SOLVE_CSP_CC__MODIFIER_TMODIFIER_MDEFINITION_ANNOTATIONTYPEDECLARATION_TANNOTATIONTYPE_TMEMBER_MATCH_MATCH:
			return isApplicable_solveCsp_CC((Modifier) arguments.get(0), (TModifier) arguments.get(1),
					(MDefinition) arguments.get(2), (AnnotationTypeDeclaration) arguments.get(3),
					(TAnnotationType) arguments.get(4), (TMember) arguments.get(5), (Match) arguments.get(6),
					(Match) arguments.get(7));
		case RulesPackage.MEMBER_IN_ANNOTATION_VISIBILITY___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.MEMBER_IN_ANNOTATION_VISIBILITY___CHECK_DEC_FWD__MODIFIER_MDEFINITION_ANNOTATIONTYPEDECLARATION:
			return checkDEC_FWD((Modifier) arguments.get(0), (MDefinition) arguments.get(1),
					(AnnotationTypeDeclaration) arguments.get(2));
		case RulesPackage.MEMBER_IN_ANNOTATION_VISIBILITY___CHECK_DEC_BWD__TMODIFIER_TANNOTATIONTYPE_TMEMBER:
			return checkDEC_BWD((TModifier) arguments.get(0), (TAnnotationType) arguments.get(1),
					(TMember) arguments.get(2));
		case RulesPackage.MEMBER_IN_ANNOTATION_VISIBILITY___GENERATE_MODEL__RULEENTRYCONTAINER_MDEFINITIONTOTMEMBER:
			return generateModel((RuleEntryContainer) arguments.get(0), (MDefinitionToTMember) arguments.get(1));
		case RulesPackage.MEMBER_IN_ANNOTATION_VISIBILITY___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_MDEFINITIONTOTMEMBER_MDEFINITION_ANNOTATIONTYPEDECLARATION_TANNOTATIONTYPE_TYPETOTABSTRACTTYPE_TMEMBER_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
					(MDefinitionToTMember) arguments.get(1), (MDefinition) arguments.get(2),
					(AnnotationTypeDeclaration) arguments.get(3), (TAnnotationType) arguments.get(4),
					(TypeToTAbstractType) arguments.get(5), (TMember) arguments.get(6),
					(ModelgeneratorRuleResult) arguments.get(7));
		case RulesPackage.MEMBER_IN_ANNOTATION_VISIBILITY___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_0_1_initialbindings_blackBBBBB(
			MemberInAnnotationVisibility _this, Match match, Modifier mModifier, MDefinition mDefinition,
			AnnotationTypeDeclaration annotation) {
		return new Object[] { _this, match, mModifier, mDefinition, annotation };
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_0_2_SolveCSP_bindingFBBBBB(
			MemberInAnnotationVisibility _this, Match match, Modifier mModifier, MDefinition mDefinition,
			AnnotationTypeDeclaration annotation) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, mModifier, mDefinition, annotation);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, mModifier, mDefinition, annotation };
		}
		return null;
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_0_2_SolveCSP_bindingAndBlackFBBBBB(
			MemberInAnnotationVisibility _this, Match match, Modifier mModifier, MDefinition mDefinition,
			AnnotationTypeDeclaration annotation) {
		Object[] result_pattern_MemberInAnnotationVisibility_0_2_SolveCSP_binding = pattern_MemberInAnnotationVisibility_0_2_SolveCSP_bindingFBBBBB(
				_this, match, mModifier, mDefinition, annotation);
		if (result_pattern_MemberInAnnotationVisibility_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_MemberInAnnotationVisibility_0_2_SolveCSP_binding[0];

			Object[] result_pattern_MemberInAnnotationVisibility_0_2_SolveCSP_black = pattern_MemberInAnnotationVisibility_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_MemberInAnnotationVisibility_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, mModifier, mDefinition, annotation };
			}
		}
		return null;
	}

	public static final boolean pattern_MemberInAnnotationVisibility_0_3_CheckCSP_expressionFBB(
			MemberInAnnotationVisibility _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_0_4_collectelementstobetranslated_blackBBBB(
			Match match, Modifier mModifier, MDefinition mDefinition, AnnotationTypeDeclaration annotation) {
		return new Object[] { match, mModifier, mDefinition, annotation };
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_0_4_collectelementstobetranslated_greenBBBFF(
			Match match, Modifier mModifier, MDefinition mDefinition) {
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
		return new Object[] { match, mModifier, mDefinition, mDefinition__mModifier____modifier,
				mModifier__mDefinition____bodyDeclaration };
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_0_5_collectcontextelements_blackBBBB(Match match,
			Modifier mModifier, MDefinition mDefinition, AnnotationTypeDeclaration annotation) {
		return new Object[] { match, mModifier, mDefinition, annotation };
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_0_5_collectcontextelements_greenBBBFF(Match match,
			MDefinition mDefinition, AnnotationTypeDeclaration annotation) {
		EMoflonEdge annotation__mDefinition____bodyDeclarations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mDefinition__Annotation____abstractTypeDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(mDefinition);
		match.getContextNodes().add(annotation);
		String annotation__mDefinition____bodyDeclarations_name_prime = "bodyDeclarations";
		String mDefinition__Annotation____abstractTypeDeclaration_name_prime = "abstractTypeDeclaration";
		annotation__mDefinition____bodyDeclarations.setSrc(annotation);
		annotation__mDefinition____bodyDeclarations.setTrg(mDefinition);
		match.getContextEdges().add(annotation__mDefinition____bodyDeclarations);
		mDefinition__Annotation____abstractTypeDeclaration.setSrc(mDefinition);
		mDefinition__Annotation____abstractTypeDeclaration.setTrg(annotation);
		match.getContextEdges().add(mDefinition__Annotation____abstractTypeDeclaration);
		annotation__mDefinition____bodyDeclarations.setName(annotation__mDefinition____bodyDeclarations_name_prime);
		mDefinition__Annotation____abstractTypeDeclaration
				.setName(mDefinition__Annotation____abstractTypeDeclaration_name_prime);
		return new Object[] { match, mDefinition, annotation, annotation__mDefinition____bodyDeclarations,
				mDefinition__Annotation____abstractTypeDeclaration };
	}

	public static final void pattern_MemberInAnnotationVisibility_0_6_registerobjectstomatch_expressionBBBBB(
			MemberInAnnotationVisibility _this, Match match, Modifier mModifier, MDefinition mDefinition,
			AnnotationTypeDeclaration annotation) {
		_this.registerObjectsToMatch_FWD(match, mModifier, mDefinition, annotation);

	}

	public static final boolean pattern_MemberInAnnotationVisibility_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_MemberInAnnotationVisibility_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_1_1_performtransformation_bindingFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("mModifier");
		EObject _localVariable_1 = isApplicableMatch.getObject("defToMember");
		EObject _localVariable_2 = isApplicableMatch.getObject("mDefinition");
		EObject _localVariable_3 = isApplicableMatch.getObject("Annotation");
		EObject _localVariable_4 = isApplicableMatch.getObject("tAnnotation");
		EObject _localVariable_5 = isApplicableMatch.getObject("mTypeToTType");
		EObject _localVariable_6 = isApplicableMatch.getObject("tMember");
		EObject tmpMModifier = _localVariable_0;
		EObject tmpDefToMember = _localVariable_1;
		EObject tmpMDefinition = _localVariable_2;
		EObject tmpAnnotation = _localVariable_3;
		EObject tmpTAnnotation = _localVariable_4;
		EObject tmpMTypeToTType = _localVariable_5;
		EObject tmpTMember = _localVariable_6;
		if (tmpMModifier instanceof Modifier) {
			Modifier mModifier = (Modifier) tmpMModifier;
			if (tmpDefToMember instanceof MDefinitionToTMember) {
				MDefinitionToTMember defToMember = (MDefinitionToTMember) tmpDefToMember;
				if (tmpMDefinition instanceof MDefinition) {
					MDefinition mDefinition = (MDefinition) tmpMDefinition;
					if (tmpAnnotation instanceof AnnotationTypeDeclaration) {
						AnnotationTypeDeclaration annotation = (AnnotationTypeDeclaration) tmpAnnotation;
						if (tmpTAnnotation instanceof TAnnotationType) {
							TAnnotationType tAnnotation = (TAnnotationType) tmpTAnnotation;
							if (tmpMTypeToTType instanceof TypeToTAbstractType) {
								TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) tmpMTypeToTType;
								if (tmpTMember instanceof TMember) {
									TMember tMember = (TMember) tmpTMember;
									return new Object[] { mModifier, defToMember, mDefinition, annotation, tAnnotation,
											mTypeToTType, tMember, isApplicableMatch };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_1_1_performtransformation_blackBBBBBBBFBB(
			Modifier mModifier, MDefinitionToTMember defToMember, MDefinition mDefinition,
			AnnotationTypeDeclaration annotation, TAnnotationType tAnnotation, TypeToTAbstractType mTypeToTType,
			TMember tMember, MemberInAnnotationVisibility _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { mModifier, defToMember, mDefinition, annotation, tAnnotation, mTypeToTType,
						tMember, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_1_1_performtransformation_bindingAndBlackFFFFFFFFBB(
			MemberInAnnotationVisibility _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_MemberInAnnotationVisibility_1_1_performtransformation_binding = pattern_MemberInAnnotationVisibility_1_1_performtransformation_bindingFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_MemberInAnnotationVisibility_1_1_performtransformation_binding != null) {
			Modifier mModifier = (Modifier) result_pattern_MemberInAnnotationVisibility_1_1_performtransformation_binding[0];
			MDefinitionToTMember defToMember = (MDefinitionToTMember) result_pattern_MemberInAnnotationVisibility_1_1_performtransformation_binding[1];
			MDefinition mDefinition = (MDefinition) result_pattern_MemberInAnnotationVisibility_1_1_performtransformation_binding[2];
			AnnotationTypeDeclaration annotation = (AnnotationTypeDeclaration) result_pattern_MemberInAnnotationVisibility_1_1_performtransformation_binding[3];
			TAnnotationType tAnnotation = (TAnnotationType) result_pattern_MemberInAnnotationVisibility_1_1_performtransformation_binding[4];
			TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result_pattern_MemberInAnnotationVisibility_1_1_performtransformation_binding[5];
			TMember tMember = (TMember) result_pattern_MemberInAnnotationVisibility_1_1_performtransformation_binding[6];

			Object[] result_pattern_MemberInAnnotationVisibility_1_1_performtransformation_black = pattern_MemberInAnnotationVisibility_1_1_performtransformation_blackBBBBBBBFBB(
					mModifier, defToMember, mDefinition, annotation, tAnnotation, mTypeToTType, tMember, _this,
					isApplicableMatch);
			if (result_pattern_MemberInAnnotationVisibility_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_MemberInAnnotationVisibility_1_1_performtransformation_black[7];

				return new Object[] { mModifier, defToMember, mDefinition, annotation, tAnnotation, mTypeToTType,
						tMember, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_1_1_performtransformation_greenBFFBB(
			Modifier mModifier, TMember tMember, CSP csp) {
		TModifier tModifier = BasicFactory.eINSTANCE.createTModifier();
		MModifierToTModifier mModifierToTModifier = PmFactory.eINSTANCE.createMModifierToTModifier();
		Object _localVariable_0 = csp.getValue("tModifier", "isStatic");
		Object _localVariable_1 = csp.getValue("tModifier", "tVisibility");
		tMember.setTModifier(tModifier);
		mModifierToTModifier.setSource(mModifier);
		mModifierToTModifier.setTarget(tModifier);
		boolean tModifier_isStatic_prime = (boolean) _localVariable_0;
		TVisibility tModifier_tVisibility_prime = (TVisibility) _localVariable_1;
		tModifier.setIsStatic(Boolean.valueOf(tModifier_isStatic_prime));
		tModifier.setTVisibility(tModifier_tVisibility_prime);
		return new Object[] { mModifier, tModifier, mModifierToTModifier, tMember, csp };
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_1_2_collecttranslatedelements_blackBBB(
			Modifier mModifier, TModifier tModifier, MModifierToTModifier mModifierToTModifier) {
		return new Object[] { mModifier, tModifier, mModifierToTModifier };
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_1_2_collecttranslatedelements_greenFBBB(
			Modifier mModifier, TModifier tModifier, MModifierToTModifier mModifierToTModifier) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(mModifier);
		ruleresult.getCreatedElements().add(tModifier);
		ruleresult.getCreatedLinkElements().add(mModifierToTModifier);
		return new Object[] { ruleresult, mModifier, tModifier, mModifierToTModifier };
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_1_3_bookkeepingforedges_blackBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject mModifier, EObject defToMember, EObject tModifier,
			EObject mDefinition, EObject mModifierToTModifier, EObject annotation, EObject tAnnotation,
			EObject mTypeToTType, EObject tMember) {
		if (!mModifier.equals(tModifier)) {
			if (!mModifier.equals(mModifierToTModifier)) {
				if (!mModifier.equals(tAnnotation)) {
					if (!mModifier.equals(mTypeToTType)) {
						if (!mModifier.equals(tMember)) {
							if (!defToMember.equals(mModifier)) {
								if (!defToMember.equals(tModifier)) {
									if (!defToMember.equals(mDefinition)) {
										if (!defToMember.equals(mModifierToTModifier)) {
											if (!defToMember.equals(tAnnotation)) {
												if (!defToMember.equals(mTypeToTType)) {
													if (!defToMember.equals(tMember)) {
														if (!mDefinition.equals(mModifier)) {
															if (!mDefinition.equals(tModifier)) {
																if (!mDefinition.equals(mModifierToTModifier)) {
																	if (!mDefinition.equals(tAnnotation)) {
																		if (!mDefinition.equals(mTypeToTType)) {
																			if (!mDefinition.equals(tMember)) {
																				if (!mModifierToTModifier
																						.equals(tModifier)) {
																					if (!mModifierToTModifier
																							.equals(tAnnotation)) {
																						if (!mModifierToTModifier
																								.equals(mTypeToTType)) {
																							if (!mModifierToTModifier
																									.equals(tMember)) {
																								if (!annotation.equals(
																										mModifier)) {
																									if (!annotation
																											.equals(defToMember)) {
																										if (!annotation
																												.equals(tModifier)) {
																											if (!annotation
																													.equals(mDefinition)) {
																												if (!annotation
																														.equals(mModifierToTModifier)) {
																													if (!annotation
																															.equals(tAnnotation)) {
																														if (!annotation
																																.equals(mTypeToTType)) {
																															if (!annotation
																																	.equals(tMember)) {
																																if (!tAnnotation
																																		.equals(tModifier)) {
																																	if (!tAnnotation
																																			.equals(tMember)) {
																																		if (!mTypeToTType
																																				.equals(tModifier)) {
																																			if (!mTypeToTType
																																					.equals(tAnnotation)) {
																																				if (!mTypeToTType
																																						.equals(tMember)) {
																																					if (!tMember
																																							.equals(tModifier)) {
																																						return new Object[] {
																																								ruleresult,
																																								mModifier,
																																								defToMember,
																																								tModifier,
																																								mDefinition,
																																								mModifierToTModifier,
																																								annotation,
																																								tAnnotation,
																																								mTypeToTType,
																																								tMember };
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_MemberInAnnotationVisibility_1_3_bookkeepingforedges_greenBBBBBBFFFFF(
			PerformRuleResult ruleresult, EObject mModifier, EObject tModifier, EObject mDefinition,
			EObject mModifierToTModifier, EObject tMember) {
		EMoflonEdge mModifierToTModifier__mModifier____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mModifierToTModifier__tModifier____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mDefinition__mModifier____modifier = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mModifier__mDefinition____bodyDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tMember__tModifier____tModifier = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "MemberInAnnotationVisibility";
		String mModifierToTModifier__mModifier____source_name_prime = "source";
		String mModifierToTModifier__tModifier____target_name_prime = "target";
		String mDefinition__mModifier____modifier_name_prime = "modifier";
		String mModifier__mDefinition____bodyDeclaration_name_prime = "bodyDeclaration";
		String tMember__tModifier____tModifier_name_prime = "tModifier";
		mModifierToTModifier__mModifier____source.setSrc(mModifierToTModifier);
		mModifierToTModifier__mModifier____source.setTrg(mModifier);
		ruleresult.getCreatedEdges().add(mModifierToTModifier__mModifier____source);
		mModifierToTModifier__tModifier____target.setSrc(mModifierToTModifier);
		mModifierToTModifier__tModifier____target.setTrg(tModifier);
		ruleresult.getCreatedEdges().add(mModifierToTModifier__tModifier____target);
		mDefinition__mModifier____modifier.setSrc(mDefinition);
		mDefinition__mModifier____modifier.setTrg(mModifier);
		ruleresult.getTranslatedEdges().add(mDefinition__mModifier____modifier);
		mModifier__mDefinition____bodyDeclaration.setSrc(mModifier);
		mModifier__mDefinition____bodyDeclaration.setTrg(mDefinition);
		ruleresult.getTranslatedEdges().add(mModifier__mDefinition____bodyDeclaration);
		tMember__tModifier____tModifier.setSrc(tMember);
		tMember__tModifier____tModifier.setTrg(tModifier);
		ruleresult.getCreatedEdges().add(tMember__tModifier____tModifier);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		mModifierToTModifier__mModifier____source.setName(mModifierToTModifier__mModifier____source_name_prime);
		mModifierToTModifier__tModifier____target.setName(mModifierToTModifier__tModifier____target_name_prime);
		mDefinition__mModifier____modifier.setName(mDefinition__mModifier____modifier_name_prime);
		mModifier__mDefinition____bodyDeclaration.setName(mModifier__mDefinition____bodyDeclaration_name_prime);
		tMember__tModifier____tModifier.setName(tMember__tModifier____tModifier_name_prime);
		return new Object[] { ruleresult, mModifier, tModifier, mDefinition, mModifierToTModifier, tMember,
				mModifierToTModifier__mModifier____source, mModifierToTModifier__tModifier____target,
				mDefinition__mModifier____modifier, mModifier__mDefinition____bodyDeclaration,
				tMember__tModifier____tModifier };
	}

	public static final void pattern_MemberInAnnotationVisibility_1_5_registerobjects_expressionBBBBBBBBBBB(
			MemberInAnnotationVisibility _this, PerformRuleResult ruleresult, EObject mModifier, EObject defToMember,
			EObject tModifier, EObject mDefinition, EObject mModifierToTModifier, EObject annotation,
			EObject tAnnotation, EObject mTypeToTType, EObject tMember) {
		_this.registerObjects_FWD(ruleresult, mModifier, defToMember, tModifier, mDefinition, mModifierToTModifier,
				annotation, tAnnotation, mTypeToTType, tMember);

	}

	public static final PerformRuleResult pattern_MemberInAnnotationVisibility_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_2_1_preparereturnvalue_bindingFB(
			MemberInAnnotationVisibility _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_2_1_preparereturnvalue_blackFBB(EClass eClass,
			MemberInAnnotationVisibility _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_2_1_preparereturnvalue_bindingAndBlackFFB(
			MemberInAnnotationVisibility _this) {
		Object[] result_pattern_MemberInAnnotationVisibility_2_1_preparereturnvalue_binding = pattern_MemberInAnnotationVisibility_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_MemberInAnnotationVisibility_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_MemberInAnnotationVisibility_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_MemberInAnnotationVisibility_2_1_preparereturnvalue_black = pattern_MemberInAnnotationVisibility_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_MemberInAnnotationVisibility_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_MemberInAnnotationVisibility_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_2_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "MemberInAnnotationVisibility";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_2_2_corematch_bindingFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("mModifier");
		EObject _localVariable_1 = match.getObject("mDefinition");
		EObject _localVariable_2 = match.getObject("Annotation");
		EObject tmpMModifier = _localVariable_0;
		EObject tmpMDefinition = _localVariable_1;
		EObject tmpAnnotation = _localVariable_2;
		if (tmpMModifier instanceof Modifier) {
			Modifier mModifier = (Modifier) tmpMModifier;
			if (tmpMDefinition instanceof MDefinition) {
				MDefinition mDefinition = (MDefinition) tmpMDefinition;
				if (tmpAnnotation instanceof AnnotationTypeDeclaration) {
					AnnotationTypeDeclaration annotation = (AnnotationTypeDeclaration) tmpAnnotation;
					return new Object[] { mModifier, mDefinition, annotation, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_MemberInAnnotationVisibility_2_2_corematch_blackBFBBFFFB(
			Modifier mModifier, MDefinition mDefinition, AnnotationTypeDeclaration annotation, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (MDefinitionToTMember defToMember : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mDefinition, MDefinitionToTMember.class, "source")) {
			TMember tMember = defToMember.getTarget();
			if (tMember != null) {
				for (TypeToTAbstractType mTypeToTType : org.moflon.core.utilities.eMoflonEMFUtil
						.getOppositeReferenceTyped(annotation, TypeToTAbstractType.class, "source")) {
					TAbstractType tmpTAnnotation = mTypeToTType.getTarget();
					if (tmpTAnnotation instanceof TAnnotationType) {
						TAnnotationType tAnnotation = (TAnnotationType) tmpTAnnotation;
						_result.add(new Object[] { mModifier, defToMember, mDefinition, annotation, tAnnotation,
								mTypeToTType, tMember, match });
					}

				}
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_MemberInAnnotationVisibility_2_3_findcontext_blackBBBBBBB(
			Modifier mModifier, MDefinitionToTMember defToMember, MDefinition mDefinition,
			AnnotationTypeDeclaration annotation, TAnnotationType tAnnotation, TypeToTAbstractType mTypeToTType,
			TMember tMember) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (mDefinition.equals(defToMember.getSource())) {
			if (annotation.getBodyDeclarations().contains(mDefinition)) {
				if (mModifier.equals(mDefinition.getModifier())) {
					if (tAnnotation.getDefines().contains(tMember)) {
						if (annotation.equals(mTypeToTType.getSource())) {
							if (tAnnotation.equals(mTypeToTType.getTarget())) {
								if (tMember.equals(defToMember.getTarget())) {
									_result.add(new Object[] { mModifier, defToMember, mDefinition, annotation,
											tAnnotation, mTypeToTType, tMember });
								}
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_2_3_findcontext_greenBBBBBBBFFFFFFFFFFF(
			Modifier mModifier, MDefinitionToTMember defToMember, MDefinition mDefinition,
			AnnotationTypeDeclaration annotation, TAnnotationType tAnnotation, TypeToTAbstractType mTypeToTType,
			TMember tMember) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge defToMember__mDefinition____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge annotation__mDefinition____bodyDeclarations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mDefinition__Annotation____abstractTypeDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mDefinition__mModifier____modifier = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mModifier__mDefinition____bodyDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAnnotation__tMember____defines = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tMember__tAnnotation____definedBy = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mTypeToTType__Annotation____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mTypeToTType__tAnnotation____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge defToMember__tMember____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String defToMember__mDefinition____source_name_prime = "source";
		String annotation__mDefinition____bodyDeclarations_name_prime = "bodyDeclarations";
		String mDefinition__Annotation____abstractTypeDeclaration_name_prime = "abstractTypeDeclaration";
		String mDefinition__mModifier____modifier_name_prime = "modifier";
		String mModifier__mDefinition____bodyDeclaration_name_prime = "bodyDeclaration";
		String tAnnotation__tMember____defines_name_prime = "defines";
		String tMember__tAnnotation____definedBy_name_prime = "definedBy";
		String mTypeToTType__Annotation____source_name_prime = "source";
		String mTypeToTType__tAnnotation____target_name_prime = "target";
		String defToMember__tMember____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(mModifier);
		isApplicableMatch.getAllContextElements().add(defToMember);
		isApplicableMatch.getAllContextElements().add(mDefinition);
		isApplicableMatch.getAllContextElements().add(annotation);
		isApplicableMatch.getAllContextElements().add(tAnnotation);
		isApplicableMatch.getAllContextElements().add(mTypeToTType);
		isApplicableMatch.getAllContextElements().add(tMember);
		defToMember__mDefinition____source.setSrc(defToMember);
		defToMember__mDefinition____source.setTrg(mDefinition);
		isApplicableMatch.getAllContextElements().add(defToMember__mDefinition____source);
		annotation__mDefinition____bodyDeclarations.setSrc(annotation);
		annotation__mDefinition____bodyDeclarations.setTrg(mDefinition);
		isApplicableMatch.getAllContextElements().add(annotation__mDefinition____bodyDeclarations);
		mDefinition__Annotation____abstractTypeDeclaration.setSrc(mDefinition);
		mDefinition__Annotation____abstractTypeDeclaration.setTrg(annotation);
		isApplicableMatch.getAllContextElements().add(mDefinition__Annotation____abstractTypeDeclaration);
		mDefinition__mModifier____modifier.setSrc(mDefinition);
		mDefinition__mModifier____modifier.setTrg(mModifier);
		isApplicableMatch.getAllContextElements().add(mDefinition__mModifier____modifier);
		mModifier__mDefinition____bodyDeclaration.setSrc(mModifier);
		mModifier__mDefinition____bodyDeclaration.setTrg(mDefinition);
		isApplicableMatch.getAllContextElements().add(mModifier__mDefinition____bodyDeclaration);
		tAnnotation__tMember____defines.setSrc(tAnnotation);
		tAnnotation__tMember____defines.setTrg(tMember);
		isApplicableMatch.getAllContextElements().add(tAnnotation__tMember____defines);
		tMember__tAnnotation____definedBy.setSrc(tMember);
		tMember__tAnnotation____definedBy.setTrg(tAnnotation);
		isApplicableMatch.getAllContextElements().add(tMember__tAnnotation____definedBy);
		mTypeToTType__Annotation____source.setSrc(mTypeToTType);
		mTypeToTType__Annotation____source.setTrg(annotation);
		isApplicableMatch.getAllContextElements().add(mTypeToTType__Annotation____source);
		mTypeToTType__tAnnotation____target.setSrc(mTypeToTType);
		mTypeToTType__tAnnotation____target.setTrg(tAnnotation);
		isApplicableMatch.getAllContextElements().add(mTypeToTType__tAnnotation____target);
		defToMember__tMember____target.setSrc(defToMember);
		defToMember__tMember____target.setTrg(tMember);
		isApplicableMatch.getAllContextElements().add(defToMember__tMember____target);
		defToMember__mDefinition____source.setName(defToMember__mDefinition____source_name_prime);
		annotation__mDefinition____bodyDeclarations.setName(annotation__mDefinition____bodyDeclarations_name_prime);
		mDefinition__Annotation____abstractTypeDeclaration
				.setName(mDefinition__Annotation____abstractTypeDeclaration_name_prime);
		mDefinition__mModifier____modifier.setName(mDefinition__mModifier____modifier_name_prime);
		mModifier__mDefinition____bodyDeclaration.setName(mModifier__mDefinition____bodyDeclaration_name_prime);
		tAnnotation__tMember____defines.setName(tAnnotation__tMember____defines_name_prime);
		tMember__tAnnotation____definedBy.setName(tMember__tAnnotation____definedBy_name_prime);
		mTypeToTType__Annotation____source.setName(mTypeToTType__Annotation____source_name_prime);
		mTypeToTType__tAnnotation____target.setName(mTypeToTType__tAnnotation____target_name_prime);
		defToMember__tMember____target.setName(defToMember__tMember____target_name_prime);
		return new Object[] { mModifier, defToMember, mDefinition, annotation, tAnnotation, mTypeToTType, tMember,
				isApplicableMatch, defToMember__mDefinition____source, annotation__mDefinition____bodyDeclarations,
				mDefinition__Annotation____abstractTypeDeclaration, mDefinition__mModifier____modifier,
				mModifier__mDefinition____bodyDeclaration, tAnnotation__tMember____defines,
				tMember__tAnnotation____definedBy, mTypeToTType__Annotation____source,
				mTypeToTType__tAnnotation____target, defToMember__tMember____target };
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_2_4_solveCSP_bindingFBBBBBBBBB(
			MemberInAnnotationVisibility _this, IsApplicableMatch isApplicableMatch, Modifier mModifier,
			MDefinitionToTMember defToMember, MDefinition mDefinition, AnnotationTypeDeclaration annotation,
			TAnnotationType tAnnotation, TypeToTAbstractType mTypeToTType, TMember tMember) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, mModifier, defToMember, mDefinition,
				annotation, tAnnotation, mTypeToTType, tMember);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mModifier, defToMember, mDefinition, annotation,
					tAnnotation, mTypeToTType, tMember };
		}
		return null;
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_2_4_solveCSP_bindingAndBlackFBBBBBBBBB(
			MemberInAnnotationVisibility _this, IsApplicableMatch isApplicableMatch, Modifier mModifier,
			MDefinitionToTMember defToMember, MDefinition mDefinition, AnnotationTypeDeclaration annotation,
			TAnnotationType tAnnotation, TypeToTAbstractType mTypeToTType, TMember tMember) {
		Object[] result_pattern_MemberInAnnotationVisibility_2_4_solveCSP_binding = pattern_MemberInAnnotationVisibility_2_4_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, mModifier, defToMember, mDefinition, annotation, tAnnotation, mTypeToTType,
				tMember);
		if (result_pattern_MemberInAnnotationVisibility_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_MemberInAnnotationVisibility_2_4_solveCSP_binding[0];

			Object[] result_pattern_MemberInAnnotationVisibility_2_4_solveCSP_black = pattern_MemberInAnnotationVisibility_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_MemberInAnnotationVisibility_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mModifier, defToMember, mDefinition, annotation,
						tAnnotation, mTypeToTType, tMember };
			}
		}
		return null;
	}

	public static final boolean pattern_MemberInAnnotationVisibility_2_5_checkCSP_expressionFBB(
			MemberInAnnotationVisibility _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "MemberInAnnotationVisibility";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_MemberInAnnotationVisibility_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_10_1_initialbindings_blackBBBBB(
			MemberInAnnotationVisibility _this, Match match, TModifier tModifier, TAnnotationType tAnnotation,
			TMember tMember) {
		return new Object[] { _this, match, tModifier, tAnnotation, tMember };
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_10_2_SolveCSP_bindingFBBBBB(
			MemberInAnnotationVisibility _this, Match match, TModifier tModifier, TAnnotationType tAnnotation,
			TMember tMember) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, tModifier, tAnnotation, tMember);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, tModifier, tAnnotation, tMember };
		}
		return null;
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_10_2_SolveCSP_bindingAndBlackFBBBBB(
			MemberInAnnotationVisibility _this, Match match, TModifier tModifier, TAnnotationType tAnnotation,
			TMember tMember) {
		Object[] result_pattern_MemberInAnnotationVisibility_10_2_SolveCSP_binding = pattern_MemberInAnnotationVisibility_10_2_SolveCSP_bindingFBBBBB(
				_this, match, tModifier, tAnnotation, tMember);
		if (result_pattern_MemberInAnnotationVisibility_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_MemberInAnnotationVisibility_10_2_SolveCSP_binding[0];

			Object[] result_pattern_MemberInAnnotationVisibility_10_2_SolveCSP_black = pattern_MemberInAnnotationVisibility_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_MemberInAnnotationVisibility_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, tModifier, tAnnotation, tMember };
			}
		}
		return null;
	}

	public static final boolean pattern_MemberInAnnotationVisibility_10_3_CheckCSP_expressionFBB(
			MemberInAnnotationVisibility _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_10_4_collectelementstobetranslated_blackBBBB(
			Match match, TModifier tModifier, TAnnotationType tAnnotation, TMember tMember) {
		return new Object[] { match, tModifier, tAnnotation, tMember };
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_10_4_collectelementstobetranslated_greenBBBF(
			Match match, TModifier tModifier, TMember tMember) {
		EMoflonEdge tMember__tModifier____tModifier = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(tModifier);
		String tMember__tModifier____tModifier_name_prime = "tModifier";
		tMember__tModifier____tModifier.setSrc(tMember);
		tMember__tModifier____tModifier.setTrg(tModifier);
		match.getToBeTranslatedEdges().add(tMember__tModifier____tModifier);
		tMember__tModifier____tModifier.setName(tMember__tModifier____tModifier_name_prime);
		return new Object[] { match, tModifier, tMember, tMember__tModifier____tModifier };
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_10_5_collectcontextelements_blackBBBB(Match match,
			TModifier tModifier, TAnnotationType tAnnotation, TMember tMember) {
		return new Object[] { match, tModifier, tAnnotation, tMember };
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_10_5_collectcontextelements_greenBBBFF(
			Match match, TAnnotationType tAnnotation, TMember tMember) {
		EMoflonEdge tAnnotation__tMember____defines = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tMember__tAnnotation____definedBy = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(tAnnotation);
		match.getContextNodes().add(tMember);
		String tAnnotation__tMember____defines_name_prime = "defines";
		String tMember__tAnnotation____definedBy_name_prime = "definedBy";
		tAnnotation__tMember____defines.setSrc(tAnnotation);
		tAnnotation__tMember____defines.setTrg(tMember);
		match.getContextEdges().add(tAnnotation__tMember____defines);
		tMember__tAnnotation____definedBy.setSrc(tMember);
		tMember__tAnnotation____definedBy.setTrg(tAnnotation);
		match.getContextEdges().add(tMember__tAnnotation____definedBy);
		tAnnotation__tMember____defines.setName(tAnnotation__tMember____defines_name_prime);
		tMember__tAnnotation____definedBy.setName(tMember__tAnnotation____definedBy_name_prime);
		return new Object[] { match, tAnnotation, tMember, tAnnotation__tMember____defines,
				tMember__tAnnotation____definedBy };
	}

	public static final void pattern_MemberInAnnotationVisibility_10_6_registerobjectstomatch_expressionBBBBB(
			MemberInAnnotationVisibility _this, Match match, TModifier tModifier, TAnnotationType tAnnotation,
			TMember tMember) {
		_this.registerObjectsToMatch_BWD(match, tModifier, tAnnotation, tMember);

	}

	public static final boolean pattern_MemberInAnnotationVisibility_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_MemberInAnnotationVisibility_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_11_1_performtransformation_bindingFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("defToMember");
		EObject _localVariable_1 = isApplicableMatch.getObject("tModifier");
		EObject _localVariable_2 = isApplicableMatch.getObject("mDefinition");
		EObject _localVariable_3 = isApplicableMatch.getObject("Annotation");
		EObject _localVariable_4 = isApplicableMatch.getObject("tAnnotation");
		EObject _localVariable_5 = isApplicableMatch.getObject("mTypeToTType");
		EObject _localVariable_6 = isApplicableMatch.getObject("tMember");
		EObject tmpDefToMember = _localVariable_0;
		EObject tmpTModifier = _localVariable_1;
		EObject tmpMDefinition = _localVariable_2;
		EObject tmpAnnotation = _localVariable_3;
		EObject tmpTAnnotation = _localVariable_4;
		EObject tmpMTypeToTType = _localVariable_5;
		EObject tmpTMember = _localVariable_6;
		if (tmpDefToMember instanceof MDefinitionToTMember) {
			MDefinitionToTMember defToMember = (MDefinitionToTMember) tmpDefToMember;
			if (tmpTModifier instanceof TModifier) {
				TModifier tModifier = (TModifier) tmpTModifier;
				if (tmpMDefinition instanceof MDefinition) {
					MDefinition mDefinition = (MDefinition) tmpMDefinition;
					if (tmpAnnotation instanceof AnnotationTypeDeclaration) {
						AnnotationTypeDeclaration annotation = (AnnotationTypeDeclaration) tmpAnnotation;
						if (tmpTAnnotation instanceof TAnnotationType) {
							TAnnotationType tAnnotation = (TAnnotationType) tmpTAnnotation;
							if (tmpMTypeToTType instanceof TypeToTAbstractType) {
								TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) tmpMTypeToTType;
								if (tmpTMember instanceof TMember) {
									TMember tMember = (TMember) tmpTMember;
									return new Object[] { defToMember, tModifier, mDefinition, annotation, tAnnotation,
											mTypeToTType, tMember, isApplicableMatch };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_11_1_performtransformation_blackBBBBBBBFBB(
			MDefinitionToTMember defToMember, TModifier tModifier, MDefinition mDefinition,
			AnnotationTypeDeclaration annotation, TAnnotationType tAnnotation, TypeToTAbstractType mTypeToTType,
			TMember tMember, MemberInAnnotationVisibility _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { defToMember, tModifier, mDefinition, annotation, tAnnotation, mTypeToTType,
						tMember, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_11_1_performtransformation_bindingAndBlackFFFFFFFFBB(
			MemberInAnnotationVisibility _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_MemberInAnnotationVisibility_11_1_performtransformation_binding = pattern_MemberInAnnotationVisibility_11_1_performtransformation_bindingFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_MemberInAnnotationVisibility_11_1_performtransformation_binding != null) {
			MDefinitionToTMember defToMember = (MDefinitionToTMember) result_pattern_MemberInAnnotationVisibility_11_1_performtransformation_binding[0];
			TModifier tModifier = (TModifier) result_pattern_MemberInAnnotationVisibility_11_1_performtransformation_binding[1];
			MDefinition mDefinition = (MDefinition) result_pattern_MemberInAnnotationVisibility_11_1_performtransformation_binding[2];
			AnnotationTypeDeclaration annotation = (AnnotationTypeDeclaration) result_pattern_MemberInAnnotationVisibility_11_1_performtransformation_binding[3];
			TAnnotationType tAnnotation = (TAnnotationType) result_pattern_MemberInAnnotationVisibility_11_1_performtransformation_binding[4];
			TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result_pattern_MemberInAnnotationVisibility_11_1_performtransformation_binding[5];
			TMember tMember = (TMember) result_pattern_MemberInAnnotationVisibility_11_1_performtransformation_binding[6];

			Object[] result_pattern_MemberInAnnotationVisibility_11_1_performtransformation_black = pattern_MemberInAnnotationVisibility_11_1_performtransformation_blackBBBBBBBFBB(
					defToMember, tModifier, mDefinition, annotation, tAnnotation, mTypeToTType, tMember, _this,
					isApplicableMatch);
			if (result_pattern_MemberInAnnotationVisibility_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_MemberInAnnotationVisibility_11_1_performtransformation_black[7];

				return new Object[] { defToMember, tModifier, mDefinition, annotation, tAnnotation, mTypeToTType,
						tMember, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_11_1_performtransformation_greenFBBFB(
			TModifier tModifier, MDefinition mDefinition, CSP csp) {
		Modifier mModifier = JavaFactory.eINSTANCE.createModifier();
		MModifierToTModifier mModifierToTModifier = PmFactory.eINSTANCE.createMModifierToTModifier();
		Object _localVariable_0 = csp.getValue("mModifier", "static");
		Object _localVariable_1 = csp.getValue("mModifier", "visibility");
		mDefinition.setModifier(mModifier);
		mModifierToTModifier.setSource(mModifier);
		mModifierToTModifier.setTarget(tModifier);
		boolean mModifier_static_prime = (boolean) _localVariable_0;
		VisibilityKind mModifier_visibility_prime = (VisibilityKind) _localVariable_1;
		mModifier.setStatic(Boolean.valueOf(mModifier_static_prime));
		mModifier.setVisibility(mModifier_visibility_prime);
		return new Object[] { mModifier, tModifier, mDefinition, mModifierToTModifier, csp };
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_11_2_collecttranslatedelements_blackBBB(
			Modifier mModifier, TModifier tModifier, MModifierToTModifier mModifierToTModifier) {
		return new Object[] { mModifier, tModifier, mModifierToTModifier };
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_11_2_collecttranslatedelements_greenFBBB(
			Modifier mModifier, TModifier tModifier, MModifierToTModifier mModifierToTModifier) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(mModifier);
		ruleresult.getTranslatedElements().add(tModifier);
		ruleresult.getCreatedLinkElements().add(mModifierToTModifier);
		return new Object[] { ruleresult, mModifier, tModifier, mModifierToTModifier };
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_11_3_bookkeepingforedges_blackBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject mModifier, EObject defToMember, EObject tModifier,
			EObject mDefinition, EObject mModifierToTModifier, EObject annotation, EObject tAnnotation,
			EObject mTypeToTType, EObject tMember) {
		if (!mModifier.equals(tModifier)) {
			if (!mModifier.equals(mModifierToTModifier)) {
				if (!mModifier.equals(tAnnotation)) {
					if (!mModifier.equals(mTypeToTType)) {
						if (!mModifier.equals(tMember)) {
							if (!defToMember.equals(mModifier)) {
								if (!defToMember.equals(tModifier)) {
									if (!defToMember.equals(mDefinition)) {
										if (!defToMember.equals(mModifierToTModifier)) {
											if (!defToMember.equals(tAnnotation)) {
												if (!defToMember.equals(mTypeToTType)) {
													if (!defToMember.equals(tMember)) {
														if (!mDefinition.equals(mModifier)) {
															if (!mDefinition.equals(tModifier)) {
																if (!mDefinition.equals(mModifierToTModifier)) {
																	if (!mDefinition.equals(tAnnotation)) {
																		if (!mDefinition.equals(mTypeToTType)) {
																			if (!mDefinition.equals(tMember)) {
																				if (!mModifierToTModifier
																						.equals(tModifier)) {
																					if (!mModifierToTModifier
																							.equals(tAnnotation)) {
																						if (!mModifierToTModifier
																								.equals(mTypeToTType)) {
																							if (!mModifierToTModifier
																									.equals(tMember)) {
																								if (!annotation.equals(
																										mModifier)) {
																									if (!annotation
																											.equals(defToMember)) {
																										if (!annotation
																												.equals(tModifier)) {
																											if (!annotation
																													.equals(mDefinition)) {
																												if (!annotation
																														.equals(mModifierToTModifier)) {
																													if (!annotation
																															.equals(tAnnotation)) {
																														if (!annotation
																																.equals(mTypeToTType)) {
																															if (!annotation
																																	.equals(tMember)) {
																																if (!tAnnotation
																																		.equals(tModifier)) {
																																	if (!tAnnotation
																																			.equals(tMember)) {
																																		if (!mTypeToTType
																																				.equals(tModifier)) {
																																			if (!mTypeToTType
																																					.equals(tAnnotation)) {
																																				if (!mTypeToTType
																																						.equals(tMember)) {
																																					if (!tMember
																																							.equals(tModifier)) {
																																						return new Object[] {
																																								ruleresult,
																																								mModifier,
																																								defToMember,
																																								tModifier,
																																								mDefinition,
																																								mModifierToTModifier,
																																								annotation,
																																								tAnnotation,
																																								mTypeToTType,
																																								tMember };
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_MemberInAnnotationVisibility_11_3_bookkeepingforedges_greenBBBBBBFFFFF(
			PerformRuleResult ruleresult, EObject mModifier, EObject tModifier, EObject mDefinition,
			EObject mModifierToTModifier, EObject tMember) {
		EMoflonEdge mModifierToTModifier__mModifier____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mModifierToTModifier__tModifier____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mDefinition__mModifier____modifier = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mModifier__mDefinition____bodyDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tMember__tModifier____tModifier = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "MemberInAnnotationVisibility";
		String mModifierToTModifier__mModifier____source_name_prime = "source";
		String mModifierToTModifier__tModifier____target_name_prime = "target";
		String mDefinition__mModifier____modifier_name_prime = "modifier";
		String mModifier__mDefinition____bodyDeclaration_name_prime = "bodyDeclaration";
		String tMember__tModifier____tModifier_name_prime = "tModifier";
		mModifierToTModifier__mModifier____source.setSrc(mModifierToTModifier);
		mModifierToTModifier__mModifier____source.setTrg(mModifier);
		ruleresult.getCreatedEdges().add(mModifierToTModifier__mModifier____source);
		mModifierToTModifier__tModifier____target.setSrc(mModifierToTModifier);
		mModifierToTModifier__tModifier____target.setTrg(tModifier);
		ruleresult.getCreatedEdges().add(mModifierToTModifier__tModifier____target);
		mDefinition__mModifier____modifier.setSrc(mDefinition);
		mDefinition__mModifier____modifier.setTrg(mModifier);
		ruleresult.getCreatedEdges().add(mDefinition__mModifier____modifier);
		mModifier__mDefinition____bodyDeclaration.setSrc(mModifier);
		mModifier__mDefinition____bodyDeclaration.setTrg(mDefinition);
		ruleresult.getCreatedEdges().add(mModifier__mDefinition____bodyDeclaration);
		tMember__tModifier____tModifier.setSrc(tMember);
		tMember__tModifier____tModifier.setTrg(tModifier);
		ruleresult.getTranslatedEdges().add(tMember__tModifier____tModifier);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		mModifierToTModifier__mModifier____source.setName(mModifierToTModifier__mModifier____source_name_prime);
		mModifierToTModifier__tModifier____target.setName(mModifierToTModifier__tModifier____target_name_prime);
		mDefinition__mModifier____modifier.setName(mDefinition__mModifier____modifier_name_prime);
		mModifier__mDefinition____bodyDeclaration.setName(mModifier__mDefinition____bodyDeclaration_name_prime);
		tMember__tModifier____tModifier.setName(tMember__tModifier____tModifier_name_prime);
		return new Object[] { ruleresult, mModifier, tModifier, mDefinition, mModifierToTModifier, tMember,
				mModifierToTModifier__mModifier____source, mModifierToTModifier__tModifier____target,
				mDefinition__mModifier____modifier, mModifier__mDefinition____bodyDeclaration,
				tMember__tModifier____tModifier };
	}

	public static final void pattern_MemberInAnnotationVisibility_11_5_registerobjects_expressionBBBBBBBBBBB(
			MemberInAnnotationVisibility _this, PerformRuleResult ruleresult, EObject mModifier, EObject defToMember,
			EObject tModifier, EObject mDefinition, EObject mModifierToTModifier, EObject annotation,
			EObject tAnnotation, EObject mTypeToTType, EObject tMember) {
		_this.registerObjects_BWD(ruleresult, mModifier, defToMember, tModifier, mDefinition, mModifierToTModifier,
				annotation, tAnnotation, mTypeToTType, tMember);

	}

	public static final PerformRuleResult pattern_MemberInAnnotationVisibility_11_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_12_1_preparereturnvalue_bindingFB(
			MemberInAnnotationVisibility _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_12_1_preparereturnvalue_blackFBB(EClass eClass,
			MemberInAnnotationVisibility _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_12_1_preparereturnvalue_bindingAndBlackFFB(
			MemberInAnnotationVisibility _this) {
		Object[] result_pattern_MemberInAnnotationVisibility_12_1_preparereturnvalue_binding = pattern_MemberInAnnotationVisibility_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_MemberInAnnotationVisibility_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_MemberInAnnotationVisibility_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_MemberInAnnotationVisibility_12_1_preparereturnvalue_black = pattern_MemberInAnnotationVisibility_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_MemberInAnnotationVisibility_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_MemberInAnnotationVisibility_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_12_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "MemberInAnnotationVisibility";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_12_2_corematch_bindingFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("tModifier");
		EObject _localVariable_1 = match.getObject("tAnnotation");
		EObject _localVariable_2 = match.getObject("tMember");
		EObject tmpTModifier = _localVariable_0;
		EObject tmpTAnnotation = _localVariable_1;
		EObject tmpTMember = _localVariable_2;
		if (tmpTModifier instanceof TModifier) {
			TModifier tModifier = (TModifier) tmpTModifier;
			if (tmpTAnnotation instanceof TAnnotationType) {
				TAnnotationType tAnnotation = (TAnnotationType) tmpTAnnotation;
				if (tmpTMember instanceof TMember) {
					TMember tMember = (TMember) tmpTMember;
					return new Object[] { tModifier, tAnnotation, tMember, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_MemberInAnnotationVisibility_12_2_corematch_blackFBFFBFBB(
			TModifier tModifier, TAnnotationType tAnnotation, TMember tMember, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (TypeToTAbstractType mTypeToTType : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tAnnotation, TypeToTAbstractType.class, "target")) {
			Type tmpAnnotation = mTypeToTType.getSource();
			if (tmpAnnotation instanceof AnnotationTypeDeclaration) {
				AnnotationTypeDeclaration annotation = (AnnotationTypeDeclaration) tmpAnnotation;
				for (MDefinitionToTMember defToMember : org.moflon.core.utilities.eMoflonEMFUtil
						.getOppositeReferenceTyped(tMember, MDefinitionToTMember.class, "target")) {
					BodyDeclaration tmpMDefinition = defToMember.getSource();
					if (tmpMDefinition instanceof MDefinition) {
						MDefinition mDefinition = (MDefinition) tmpMDefinition;
						_result.add(new Object[] { defToMember, tModifier, mDefinition, annotation, tAnnotation,
								mTypeToTType, tMember, match });
					}

				}
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_MemberInAnnotationVisibility_12_3_findcontext_blackBBBBBBB(
			MDefinitionToTMember defToMember, TModifier tModifier, MDefinition mDefinition,
			AnnotationTypeDeclaration annotation, TAnnotationType tAnnotation, TypeToTAbstractType mTypeToTType,
			TMember tMember) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (mDefinition.equals(defToMember.getSource())) {
			if (annotation.getBodyDeclarations().contains(mDefinition)) {
				if (tAnnotation.getDefines().contains(tMember)) {
					if (annotation.equals(mTypeToTType.getSource())) {
						if (tModifier.equals(tMember.getTModifier())) {
							if (tAnnotation.equals(mTypeToTType.getTarget())) {
								if (tMember.equals(defToMember.getTarget())) {
									_result.add(new Object[] { defToMember, tModifier, mDefinition, annotation,
											tAnnotation, mTypeToTType, tMember });
								}
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_12_3_findcontext_greenBBBBBBBFFFFFFFFFF(
			MDefinitionToTMember defToMember, TModifier tModifier, MDefinition mDefinition,
			AnnotationTypeDeclaration annotation, TAnnotationType tAnnotation, TypeToTAbstractType mTypeToTType,
			TMember tMember) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge defToMember__mDefinition____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge annotation__mDefinition____bodyDeclarations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mDefinition__Annotation____abstractTypeDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAnnotation__tMember____defines = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tMember__tAnnotation____definedBy = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mTypeToTType__Annotation____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tMember__tModifier____tModifier = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mTypeToTType__tAnnotation____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge defToMember__tMember____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String defToMember__mDefinition____source_name_prime = "source";
		String annotation__mDefinition____bodyDeclarations_name_prime = "bodyDeclarations";
		String mDefinition__Annotation____abstractTypeDeclaration_name_prime = "abstractTypeDeclaration";
		String tAnnotation__tMember____defines_name_prime = "defines";
		String tMember__tAnnotation____definedBy_name_prime = "definedBy";
		String mTypeToTType__Annotation____source_name_prime = "source";
		String tMember__tModifier____tModifier_name_prime = "tModifier";
		String mTypeToTType__tAnnotation____target_name_prime = "target";
		String defToMember__tMember____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(defToMember);
		isApplicableMatch.getAllContextElements().add(tModifier);
		isApplicableMatch.getAllContextElements().add(mDefinition);
		isApplicableMatch.getAllContextElements().add(annotation);
		isApplicableMatch.getAllContextElements().add(tAnnotation);
		isApplicableMatch.getAllContextElements().add(mTypeToTType);
		isApplicableMatch.getAllContextElements().add(tMember);
		defToMember__mDefinition____source.setSrc(defToMember);
		defToMember__mDefinition____source.setTrg(mDefinition);
		isApplicableMatch.getAllContextElements().add(defToMember__mDefinition____source);
		annotation__mDefinition____bodyDeclarations.setSrc(annotation);
		annotation__mDefinition____bodyDeclarations.setTrg(mDefinition);
		isApplicableMatch.getAllContextElements().add(annotation__mDefinition____bodyDeclarations);
		mDefinition__Annotation____abstractTypeDeclaration.setSrc(mDefinition);
		mDefinition__Annotation____abstractTypeDeclaration.setTrg(annotation);
		isApplicableMatch.getAllContextElements().add(mDefinition__Annotation____abstractTypeDeclaration);
		tAnnotation__tMember____defines.setSrc(tAnnotation);
		tAnnotation__tMember____defines.setTrg(tMember);
		isApplicableMatch.getAllContextElements().add(tAnnotation__tMember____defines);
		tMember__tAnnotation____definedBy.setSrc(tMember);
		tMember__tAnnotation____definedBy.setTrg(tAnnotation);
		isApplicableMatch.getAllContextElements().add(tMember__tAnnotation____definedBy);
		mTypeToTType__Annotation____source.setSrc(mTypeToTType);
		mTypeToTType__Annotation____source.setTrg(annotation);
		isApplicableMatch.getAllContextElements().add(mTypeToTType__Annotation____source);
		tMember__tModifier____tModifier.setSrc(tMember);
		tMember__tModifier____tModifier.setTrg(tModifier);
		isApplicableMatch.getAllContextElements().add(tMember__tModifier____tModifier);
		mTypeToTType__tAnnotation____target.setSrc(mTypeToTType);
		mTypeToTType__tAnnotation____target.setTrg(tAnnotation);
		isApplicableMatch.getAllContextElements().add(mTypeToTType__tAnnotation____target);
		defToMember__tMember____target.setSrc(defToMember);
		defToMember__tMember____target.setTrg(tMember);
		isApplicableMatch.getAllContextElements().add(defToMember__tMember____target);
		defToMember__mDefinition____source.setName(defToMember__mDefinition____source_name_prime);
		annotation__mDefinition____bodyDeclarations.setName(annotation__mDefinition____bodyDeclarations_name_prime);
		mDefinition__Annotation____abstractTypeDeclaration
				.setName(mDefinition__Annotation____abstractTypeDeclaration_name_prime);
		tAnnotation__tMember____defines.setName(tAnnotation__tMember____defines_name_prime);
		tMember__tAnnotation____definedBy.setName(tMember__tAnnotation____definedBy_name_prime);
		mTypeToTType__Annotation____source.setName(mTypeToTType__Annotation____source_name_prime);
		tMember__tModifier____tModifier.setName(tMember__tModifier____tModifier_name_prime);
		mTypeToTType__tAnnotation____target.setName(mTypeToTType__tAnnotation____target_name_prime);
		defToMember__tMember____target.setName(defToMember__tMember____target_name_prime);
		return new Object[] { defToMember, tModifier, mDefinition, annotation, tAnnotation, mTypeToTType, tMember,
				isApplicableMatch, defToMember__mDefinition____source, annotation__mDefinition____bodyDeclarations,
				mDefinition__Annotation____abstractTypeDeclaration, tAnnotation__tMember____defines,
				tMember__tAnnotation____definedBy, mTypeToTType__Annotation____source, tMember__tModifier____tModifier,
				mTypeToTType__tAnnotation____target, defToMember__tMember____target };
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_12_4_solveCSP_bindingFBBBBBBBBB(
			MemberInAnnotationVisibility _this, IsApplicableMatch isApplicableMatch, MDefinitionToTMember defToMember,
			TModifier tModifier, MDefinition mDefinition, AnnotationTypeDeclaration annotation,
			TAnnotationType tAnnotation, TypeToTAbstractType mTypeToTType, TMember tMember) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, defToMember, tModifier, mDefinition,
				annotation, tAnnotation, mTypeToTType, tMember);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, defToMember, tModifier, mDefinition, annotation,
					tAnnotation, mTypeToTType, tMember };
		}
		return null;
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_12_4_solveCSP_bindingAndBlackFBBBBBBBBB(
			MemberInAnnotationVisibility _this, IsApplicableMatch isApplicableMatch, MDefinitionToTMember defToMember,
			TModifier tModifier, MDefinition mDefinition, AnnotationTypeDeclaration annotation,
			TAnnotationType tAnnotation, TypeToTAbstractType mTypeToTType, TMember tMember) {
		Object[] result_pattern_MemberInAnnotationVisibility_12_4_solveCSP_binding = pattern_MemberInAnnotationVisibility_12_4_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, defToMember, tModifier, mDefinition, annotation, tAnnotation, mTypeToTType,
				tMember);
		if (result_pattern_MemberInAnnotationVisibility_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_MemberInAnnotationVisibility_12_4_solveCSP_binding[0];

			Object[] result_pattern_MemberInAnnotationVisibility_12_4_solveCSP_black = pattern_MemberInAnnotationVisibility_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_MemberInAnnotationVisibility_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, defToMember, tModifier, mDefinition, annotation,
						tAnnotation, mTypeToTType, tMember };
			}
		}
		return null;
	}

	public static final boolean pattern_MemberInAnnotationVisibility_12_5_checkCSP_expressionFBB(
			MemberInAnnotationVisibility _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "MemberInAnnotationVisibility";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_MemberInAnnotationVisibility_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_20_1_preparereturnvalue_bindingFB(
			MemberInAnnotationVisibility _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_20_1_preparereturnvalue_blackFBBF(EClass __eClass,
			MemberInAnnotationVisibility _this) {
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

	public static final Object[] pattern_MemberInAnnotationVisibility_20_1_preparereturnvalue_bindingAndBlackFFBF(
			MemberInAnnotationVisibility _this) {
		Object[] result_pattern_MemberInAnnotationVisibility_20_1_preparereturnvalue_binding = pattern_MemberInAnnotationVisibility_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_MemberInAnnotationVisibility_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_MemberInAnnotationVisibility_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_MemberInAnnotationVisibility_20_1_preparereturnvalue_black = pattern_MemberInAnnotationVisibility_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_MemberInAnnotationVisibility_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_MemberInAnnotationVisibility_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_MemberInAnnotationVisibility_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_20_2_testcorematchandDECs_black_nac_0BB(
			TModifier tModifier, TAnnotationType tAnnotation) {
		for (TAbstractType __DEC_tModifier_tModifier_369681 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tModifier, TAbstractType.class, "tModifier")) {
			if (!tAnnotation.equals(__DEC_tModifier_tModifier_369681)) {
				return new Object[] { tModifier, tAnnotation };
			}
		}
		return null;
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_20_2_testcorematchandDECs_black_nac_1BB(
			TAnnotationType tAnnotation, TModifier tModifier) {
		if (tModifier.equals(tAnnotation.getTModifier())) {
			return new Object[] { tAnnotation, tModifier };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_MemberInAnnotationVisibility_20_2_testcorematchandDECs_blackFFFB(
			EMoflonEdge _edge_tModifier) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpTMember = _edge_tModifier.getSrc();
		if (tmpTMember instanceof TMember) {
			TMember tMember = (TMember) tmpTMember;
			EObject tmpTModifier = _edge_tModifier.getTrg();
			if (tmpTModifier instanceof TModifier) {
				TModifier tModifier = (TModifier) tmpTModifier;
				if (tModifier.equals(tMember.getTModifier())) {
					TAbstractType tmpTAnnotation = tMember.getDefinedBy();
					if (tmpTAnnotation instanceof TAnnotationType) {
						TAnnotationType tAnnotation = (TAnnotationType) tmpTAnnotation;
						if (pattern_MemberInAnnotationVisibility_20_2_testcorematchandDECs_black_nac_0BB(tModifier,
								tAnnotation) == null) {
							if (pattern_MemberInAnnotationVisibility_20_2_testcorematchandDECs_black_nac_1BB(
									tAnnotation, tModifier) == null) {
								_result.add(new Object[] { tModifier, tAnnotation, tMember, _edge_tModifier });
							}
						}
					}

				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_20_2_testcorematchandDECs_greenFB(
			EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_MemberInAnnotationVisibility_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
			MemberInAnnotationVisibility _this, Match match, TModifier tModifier, TAnnotationType tAnnotation,
			TMember tMember) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, tModifier, tAnnotation, tMember);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_MemberInAnnotationVisibility_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			MemberInAnnotationVisibility _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_MemberInAnnotationVisibility_20_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_21_1_preparereturnvalue_bindingFB(
			MemberInAnnotationVisibility _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_21_1_preparereturnvalue_blackFBBF(EClass __eClass,
			MemberInAnnotationVisibility _this) {
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

	public static final Object[] pattern_MemberInAnnotationVisibility_21_1_preparereturnvalue_bindingAndBlackFFBF(
			MemberInAnnotationVisibility _this) {
		Object[] result_pattern_MemberInAnnotationVisibility_21_1_preparereturnvalue_binding = pattern_MemberInAnnotationVisibility_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_MemberInAnnotationVisibility_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_MemberInAnnotationVisibility_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_MemberInAnnotationVisibility_21_1_preparereturnvalue_black = pattern_MemberInAnnotationVisibility_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_MemberInAnnotationVisibility_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_MemberInAnnotationVisibility_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_MemberInAnnotationVisibility_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_MemberInAnnotationVisibility_21_2_testcorematchandDECs_blackFFFB(
			EMoflonEdge _edge_modifier) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpMDefinition = _edge_modifier.getSrc();
		if (tmpMDefinition instanceof MDefinition) {
			MDefinition mDefinition = (MDefinition) tmpMDefinition;
			EObject tmpMModifier = _edge_modifier.getTrg();
			if (tmpMModifier instanceof Modifier) {
				Modifier mModifier = (Modifier) tmpMModifier;
				if (mModifier.equals(mDefinition.getModifier())) {
					AbstractTypeDeclaration tmpAnnotation = mDefinition.getAbstractTypeDeclaration();
					if (tmpAnnotation instanceof AnnotationTypeDeclaration) {
						AnnotationTypeDeclaration annotation = (AnnotationTypeDeclaration) tmpAnnotation;
						_result.add(new Object[] { mModifier, mDefinition, annotation, _edge_modifier });
					}

				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_21_2_testcorematchandDECs_greenFB(
			EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_MemberInAnnotationVisibility_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
			MemberInAnnotationVisibility _this, Match match, Modifier mModifier, MDefinition mDefinition,
			AnnotationTypeDeclaration annotation) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, mModifier, mDefinition, annotation);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_MemberInAnnotationVisibility_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			MemberInAnnotationVisibility _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_MemberInAnnotationVisibility_21_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_24_1_prepare_blackB(
			MemberInAnnotationVisibility _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_24_2_matchsrctrgcontext_bindingFFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		EObject _localVariable_0 = sourceMatch.getObject("mModifier");
		EObject _localVariable_1 = targetMatch.getObject("tModifier");
		EObject _localVariable_2 = sourceMatch.getObject("mDefinition");
		EObject _localVariable_3 = sourceMatch.getObject("Annotation");
		EObject _localVariable_4 = targetMatch.getObject("tAnnotation");
		EObject _localVariable_5 = targetMatch.getObject("tMember");
		EObject tmpMModifier = _localVariable_0;
		EObject tmpTModifier = _localVariable_1;
		EObject tmpMDefinition = _localVariable_2;
		EObject tmpAnnotation = _localVariable_3;
		EObject tmpTAnnotation = _localVariable_4;
		EObject tmpTMember = _localVariable_5;
		if (tmpMModifier instanceof Modifier) {
			Modifier mModifier = (Modifier) tmpMModifier;
			if (tmpTModifier instanceof TModifier) {
				TModifier tModifier = (TModifier) tmpTModifier;
				if (tmpMDefinition instanceof MDefinition) {
					MDefinition mDefinition = (MDefinition) tmpMDefinition;
					if (tmpAnnotation instanceof AnnotationTypeDeclaration) {
						AnnotationTypeDeclaration annotation = (AnnotationTypeDeclaration) tmpAnnotation;
						if (tmpTAnnotation instanceof TAnnotationType) {
							TAnnotationType tAnnotation = (TAnnotationType) tmpTAnnotation;
							if (tmpTMember instanceof TMember) {
								TMember tMember = (TMember) tmpTMember;
								return new Object[] { mModifier, tModifier, mDefinition, annotation, tAnnotation,
										tMember, sourceMatch, targetMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_24_2_matchsrctrgcontext_blackBBBBBBBB(
			Modifier mModifier, TModifier tModifier, MDefinition mDefinition, AnnotationTypeDeclaration annotation,
			TAnnotationType tAnnotation, TMember tMember, Match sourceMatch, Match targetMatch) {
		if (!sourceMatch.equals(targetMatch)) {
			return new Object[] { mModifier, tModifier, mDefinition, annotation, tAnnotation, tMember, sourceMatch,
					targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_MemberInAnnotationVisibility_24_2_matchsrctrgcontext_binding = pattern_MemberInAnnotationVisibility_24_2_matchsrctrgcontext_bindingFFFFFFBB(
				sourceMatch, targetMatch);
		if (result_pattern_MemberInAnnotationVisibility_24_2_matchsrctrgcontext_binding != null) {
			Modifier mModifier = (Modifier) result_pattern_MemberInAnnotationVisibility_24_2_matchsrctrgcontext_binding[0];
			TModifier tModifier = (TModifier) result_pattern_MemberInAnnotationVisibility_24_2_matchsrctrgcontext_binding[1];
			MDefinition mDefinition = (MDefinition) result_pattern_MemberInAnnotationVisibility_24_2_matchsrctrgcontext_binding[2];
			AnnotationTypeDeclaration annotation = (AnnotationTypeDeclaration) result_pattern_MemberInAnnotationVisibility_24_2_matchsrctrgcontext_binding[3];
			TAnnotationType tAnnotation = (TAnnotationType) result_pattern_MemberInAnnotationVisibility_24_2_matchsrctrgcontext_binding[4];
			TMember tMember = (TMember) result_pattern_MemberInAnnotationVisibility_24_2_matchsrctrgcontext_binding[5];

			Object[] result_pattern_MemberInAnnotationVisibility_24_2_matchsrctrgcontext_black = pattern_MemberInAnnotationVisibility_24_2_matchsrctrgcontext_blackBBBBBBBB(
					mModifier, tModifier, mDefinition, annotation, tAnnotation, tMember, sourceMatch, targetMatch);
			if (result_pattern_MemberInAnnotationVisibility_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { mModifier, tModifier, mDefinition, annotation, tAnnotation, tMember, sourceMatch,
						targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_24_3_solvecsp_bindingFBBBBBBBBB(
			MemberInAnnotationVisibility _this, Modifier mModifier, TModifier tModifier, MDefinition mDefinition,
			AnnotationTypeDeclaration annotation, TAnnotationType tAnnotation, TMember tMember, Match sourceMatch,
			Match targetMatch) {
		CSP _localVariable_6 = _this.isApplicable_solveCsp_CC(mModifier, tModifier, mDefinition, annotation,
				tAnnotation, tMember, sourceMatch, targetMatch);
		CSP csp = _localVariable_6;
		if (csp != null) {
			return new Object[] { csp, _this, mModifier, tModifier, mDefinition, annotation, tAnnotation, tMember,
					sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_24_3_solvecsp_bindingAndBlackFBBBBBBBBB(
			MemberInAnnotationVisibility _this, Modifier mModifier, TModifier tModifier, MDefinition mDefinition,
			AnnotationTypeDeclaration annotation, TAnnotationType tAnnotation, TMember tMember, Match sourceMatch,
			Match targetMatch) {
		Object[] result_pattern_MemberInAnnotationVisibility_24_3_solvecsp_binding = pattern_MemberInAnnotationVisibility_24_3_solvecsp_bindingFBBBBBBBBB(
				_this, mModifier, tModifier, mDefinition, annotation, tAnnotation, tMember, sourceMatch, targetMatch);
		if (result_pattern_MemberInAnnotationVisibility_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_MemberInAnnotationVisibility_24_3_solvecsp_binding[0];

			Object[] result_pattern_MemberInAnnotationVisibility_24_3_solvecsp_black = pattern_MemberInAnnotationVisibility_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_MemberInAnnotationVisibility_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, mModifier, tModifier, mDefinition, annotation, tAnnotation, tMember,
						sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_MemberInAnnotationVisibility_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_MemberInAnnotationVisibility_24_5_matchcorrcontext_blackFBBBFBBB(
			MDefinition mDefinition, AnnotationTypeDeclaration annotation, TAnnotationType tAnnotation, TMember tMember,
			Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (MDefinitionToTMember defToMember : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(mDefinition, MDefinitionToTMember.class, "source")) {
				if (tMember.equals(defToMember.getTarget())) {
					for (TypeToTAbstractType mTypeToTType : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(annotation, TypeToTAbstractType.class, "source")) {
						if (tAnnotation.equals(mTypeToTType.getTarget())) {
							_result.add(new Object[] { defToMember, mDefinition, annotation, tAnnotation, mTypeToTType,
									tMember, sourceMatch, targetMatch });
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_24_5_matchcorrcontext_greenBBBBF(
			MDefinitionToTMember defToMember, TypeToTAbstractType mTypeToTType, Match sourceMatch, Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "MemberInAnnotationVisibility";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(defToMember);
		ccMatch.getAllContextElements().add(mTypeToTType);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { defToMember, mTypeToTType, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_24_6_createcorrespondence_blackBBBBBBB(
			Modifier mModifier, TModifier tModifier, MDefinition mDefinition, AnnotationTypeDeclaration annotation,
			TAnnotationType tAnnotation, TMember tMember, CCMatch ccMatch) {
		return new Object[] { mModifier, tModifier, mDefinition, annotation, tAnnotation, tMember, ccMatch };
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_24_6_createcorrespondence_greenBBFB(
			Modifier mModifier, TModifier tModifier, CCMatch ccMatch) {
		MModifierToTModifier mModifierToTModifier = PmFactory.eINSTANCE.createMModifierToTModifier();
		mModifierToTModifier.setSource(mModifier);
		mModifierToTModifier.setTarget(tModifier);
		ccMatch.getCreateCorr().add(mModifierToTModifier);
		return new Object[] { mModifier, tModifier, mModifierToTModifier, ccMatch };
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_24_7_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_24_7_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "MemberInAnnotationVisibility";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_MemberInAnnotationVisibility_24_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_27_1_matchtggpattern_blackBBB(Modifier mModifier,
			MDefinition mDefinition, AnnotationTypeDeclaration annotation) {
		if (annotation.getBodyDeclarations().contains(mDefinition)) {
			if (mModifier.equals(mDefinition.getModifier())) {
				return new Object[] { mModifier, mDefinition, annotation };
			}
		}
		return null;
	}

	public static final boolean pattern_MemberInAnnotationVisibility_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_MemberInAnnotationVisibility_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_28_1_matchtggpattern_black_nac_0BB(
			TModifier tModifier, TAnnotationType tAnnotation) {
		for (TAbstractType __DEC_tModifier_tModifier_147558 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tModifier, TAbstractType.class, "tModifier")) {
			if (!tAnnotation.equals(__DEC_tModifier_tModifier_147558)) {
				return new Object[] { tModifier, tAnnotation };
			}
		}
		return null;
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_28_1_matchtggpattern_black_nac_1BB(
			TAnnotationType tAnnotation, TModifier tModifier) {
		if (tModifier.equals(tAnnotation.getTModifier())) {
			return new Object[] { tAnnotation, tModifier };
		}
		return null;
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_28_1_matchtggpattern_blackBBB(TModifier tModifier,
			TAnnotationType tAnnotation, TMember tMember) {
		if (tAnnotation.getDefines().contains(tMember)) {
			if (tModifier.equals(tMember.getTModifier())) {
				if (pattern_MemberInAnnotationVisibility_28_1_matchtggpattern_black_nac_0BB(tModifier,
						tAnnotation) == null) {
					if (pattern_MemberInAnnotationVisibility_28_1_matchtggpattern_black_nac_1BB(tAnnotation,
							tModifier) == null) {
						return new Object[] { tModifier, tAnnotation, tMember };
					}
				}
			}
		}
		return null;
	}

	public static final boolean pattern_MemberInAnnotationVisibility_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_MemberInAnnotationVisibility_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_29_1_createresult_blackB(
			MemberInAnnotationVisibility _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, MDefinitionToTMember defToMember) {
		if (ruleResult.getCorrObjects().contains(defToMember)) {
			return new Object[] { ruleResult, defToMember };
		}
		return null;
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, MDefinition mDefinition) {
		if (ruleResult.getSourceObjects().contains(mDefinition)) {
			return new Object[] { ruleResult, mDefinition };
		}
		return null;
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, AnnotationTypeDeclaration annotation) {
		if (ruleResult.getSourceObjects().contains(annotation)) {
			return new Object[] { ruleResult, annotation };
		}
		return null;
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_29_2_isapplicablecore_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, TypeToTAbstractType mTypeToTType) {
		if (ruleResult.getCorrObjects().contains(mTypeToTType)) {
			return new Object[] { ruleResult, mTypeToTType };
		}
		return null;
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_29_2_isapplicablecore_black_nac_4BB(
			ModelgeneratorRuleResult ruleResult, TAnnotationType tAnnotation) {
		if (ruleResult.getTargetObjects().contains(tAnnotation)) {
			return new Object[] { ruleResult, tAnnotation };
		}
		return null;
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_29_2_isapplicablecore_black_nac_5BB(
			ModelgeneratorRuleResult ruleResult, TMember tMember) {
		if (ruleResult.getTargetObjects().contains(tMember)) {
			return new Object[] { ruleResult, tMember };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_MemberInAnnotationVisibility_29_2_isapplicablecore_blackFFFFFFFBB(
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
							AbstractTypeDeclaration tmpAnnotation = mDefinition.getAbstractTypeDeclaration();
							if (tmpAnnotation instanceof AnnotationTypeDeclaration) {
								AnnotationTypeDeclaration annotation = (AnnotationTypeDeclaration) tmpAnnotation;
								TAbstractType tmpTAnnotation = tMember.getDefinedBy();
								if (tmpTAnnotation instanceof TAnnotationType) {
									TAnnotationType tAnnotation = (TAnnotationType) tmpTAnnotation;
									if (pattern_MemberInAnnotationVisibility_29_2_isapplicablecore_black_nac_0BB(
											ruleResult, defToMember) == null) {
										if (pattern_MemberInAnnotationVisibility_29_2_isapplicablecore_black_nac_1BB(
												ruleResult, mDefinition) == null) {
											if (pattern_MemberInAnnotationVisibility_29_2_isapplicablecore_black_nac_5BB(
													ruleResult, tMember) == null) {
												if (pattern_MemberInAnnotationVisibility_29_2_isapplicablecore_black_nac_2BB(
														ruleResult, annotation) == null) {
													if (pattern_MemberInAnnotationVisibility_29_2_isapplicablecore_black_nac_4BB(
															ruleResult, tAnnotation) == null) {
														for (TypeToTAbstractType mTypeToTType : org.moflon.core.utilities.eMoflonEMFUtil
																.getOppositeReferenceTyped(annotation,
																		TypeToTAbstractType.class, "source")) {
															if (tAnnotation.equals(mTypeToTType.getTarget())) {
																if (pattern_MemberInAnnotationVisibility_29_2_isapplicablecore_black_nac_3BB(
																		ruleResult, mTypeToTType) == null) {
																	_result.add(new Object[] { defToMemberList,
																			defToMember, mDefinition, annotation,
																			mTypeToTType, tAnnotation, tMember,
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

	public static final Object[] pattern_MemberInAnnotationVisibility_29_3_solveCSP_bindingFBBBBBBBBB(
			MemberInAnnotationVisibility _this, IsApplicableMatch isApplicableMatch, MDefinitionToTMember defToMember,
			MDefinition mDefinition, AnnotationTypeDeclaration annotation, TAnnotationType tAnnotation,
			TypeToTAbstractType mTypeToTType, TMember tMember, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, defToMember, mDefinition, annotation,
				tAnnotation, mTypeToTType, tMember, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, defToMember, mDefinition, annotation, tAnnotation,
					mTypeToTType, tMember, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_29_3_solveCSP_bindingAndBlackFBBBBBBBBB(
			MemberInAnnotationVisibility _this, IsApplicableMatch isApplicableMatch, MDefinitionToTMember defToMember,
			MDefinition mDefinition, AnnotationTypeDeclaration annotation, TAnnotationType tAnnotation,
			TypeToTAbstractType mTypeToTType, TMember tMember, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_MemberInAnnotationVisibility_29_3_solveCSP_binding = pattern_MemberInAnnotationVisibility_29_3_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, defToMember, mDefinition, annotation, tAnnotation, mTypeToTType, tMember,
				ruleResult);
		if (result_pattern_MemberInAnnotationVisibility_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_MemberInAnnotationVisibility_29_3_solveCSP_binding[0];

			Object[] result_pattern_MemberInAnnotationVisibility_29_3_solveCSP_black = pattern_MemberInAnnotationVisibility_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_MemberInAnnotationVisibility_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, defToMember, mDefinition, annotation, tAnnotation,
						mTypeToTType, tMember, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_MemberInAnnotationVisibility_29_4_checkCSP_expressionFBB(
			MemberInAnnotationVisibility _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_29_5_checknacs_blackBBBBBB(
			MDefinitionToTMember defToMember, MDefinition mDefinition, AnnotationTypeDeclaration annotation,
			TAnnotationType tAnnotation, TypeToTAbstractType mTypeToTType, TMember tMember) {
		return new Object[] { defToMember, mDefinition, annotation, tAnnotation, mTypeToTType, tMember };
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_29_6_perform_blackBBBBBBB(
			MDefinitionToTMember defToMember, MDefinition mDefinition, AnnotationTypeDeclaration annotation,
			TAnnotationType tAnnotation, TypeToTAbstractType mTypeToTType, TMember tMember,
			ModelgeneratorRuleResult ruleResult) {
		return new Object[] { defToMember, mDefinition, annotation, tAnnotation, mTypeToTType, tMember, ruleResult };
	}

	public static final Object[] pattern_MemberInAnnotationVisibility_29_6_perform_greenFFBFBBB(MDefinition mDefinition,
			TMember tMember, ModelgeneratorRuleResult ruleResult, CSP csp) {
		Modifier mModifier = JavaFactory.eINSTANCE.createModifier();
		TModifier tModifier = BasicFactory.eINSTANCE.createTModifier();
		MModifierToTModifier mModifierToTModifier = PmFactory.eINSTANCE.createMModifierToTModifier();
		Object _localVariable_0 = csp.getValue("mModifier", "static");
		Object _localVariable_1 = csp.getValue("mModifier", "visibility");
		Object _localVariable_2 = csp.getValue("tModifier", "isStatic");
		Object _localVariable_3 = csp.getValue("tModifier", "tVisibility");
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_4 = ruleResult.getIncrementedPerformCount();
		mDefinition.setModifier(mModifier);
		ruleResult.getSourceObjects().add(mModifier);
		tMember.setTModifier(tModifier);
		ruleResult.getTargetObjects().add(tModifier);
		mModifierToTModifier.setSource(mModifier);
		mModifierToTModifier.setTarget(tModifier);
		ruleResult.getCorrObjects().add(mModifierToTModifier);
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
		return new Object[] { mModifier, tModifier, mDefinition, mModifierToTModifier, tMember, ruleResult, csp };
	}

	public static final ModelgeneratorRuleResult pattern_MemberInAnnotationVisibility_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //MemberInAnnotationVisibilityImpl
