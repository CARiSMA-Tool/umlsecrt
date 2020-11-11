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
import org.eclipse.modisco.java.Annotation;
import org.eclipse.modisco.java.AnnotationMemberValuePair;
import org.eclipse.modisco.java.ArrayType;
import org.eclipse.modisco.java.ClassDeclaration;
import org.eclipse.modisco.java.ClassInstanceCreation;
import org.eclipse.modisco.java.MethodDeclaration;
import org.eclipse.modisco.java.ParameterizedType;
import org.eclipse.modisco.java.Type;
import org.eclipse.modisco.java.TypeAccess;
import org.eclipse.modisco.java.TypeLiteral;

import org.eclipse.modisco.java.emf.JavaFactory;

import org.gravity.tgg.modisco.pm.Rules.ClassImplementsInterface;
import org.gravity.tgg.modisco.pm.Rules.RulesPackage;

import org.gravity.tgg.modisco.pm.TypeToTAbstractType;

import org.gravity.typegraph.basic.TAbstractType;
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TInterface;

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
 * An implementation of the model object '<em><b>Class Implements Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ClassImplementsInterfaceImpl extends AbstractRuleImpl implements ClassImplementsInterface {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassImplementsInterfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getClassImplementsInterface();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, ClassDeclaration eClassDeclaration, TypeAccess eTypeAccess,
			Type eSuperInterface) {

		Object[] result1_black = ClassImplementsInterfaceImpl
				.pattern_ClassImplementsInterface_0_1_initialbindings_blackBBBBB(this, match, eClassDeclaration,
						eTypeAccess, eSuperInterface);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[eClassDeclaration] = " + eClassDeclaration + ", "
					+ "[eTypeAccess] = " + eTypeAccess + ", " + "[eSuperInterface] = " + eSuperInterface + ".");
		}

		Object[] result2_bindingAndBlack = ClassImplementsInterfaceImpl
				.pattern_ClassImplementsInterface_0_2_SolveCSP_bindingAndBlackFBBBBB(this, match, eClassDeclaration,
						eTypeAccess, eSuperInterface);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[eClassDeclaration] = " + eClassDeclaration + ", "
					+ "[eTypeAccess] = " + eTypeAccess + ", " + "[eSuperInterface] = " + eSuperInterface + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (ClassImplementsInterfaceImpl.pattern_ClassImplementsInterface_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = ClassImplementsInterfaceImpl
					.pattern_ClassImplementsInterface_0_4_collectelementstobetranslated_blackBBBB(match,
							eClassDeclaration, eTypeAccess, eSuperInterface);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[eClassDeclaration] = " + eClassDeclaration + ", " + "[eTypeAccess] = " + eTypeAccess + ", "
						+ "[eSuperInterface] = " + eSuperInterface + ".");
			}
			ClassImplementsInterfaceImpl
					.pattern_ClassImplementsInterface_0_4_collectelementstobetranslated_greenBBBBFFF(match,
							eClassDeclaration, eTypeAccess, eSuperInterface);
			//nothing EMoflonEdge eTypeAccess__eSuperInterface____type = (EMoflonEdge) result4_green[4];
			//nothing EMoflonEdge eSuperInterface__eTypeAccess____usagesInTypeAccess = (EMoflonEdge) result4_green[5];
			//nothing EMoflonEdge eClassDeclaration__eTypeAccess____superInterfaces = (EMoflonEdge) result4_green[6];

			Object[] result5_black = ClassImplementsInterfaceImpl
					.pattern_ClassImplementsInterface_0_5_collectcontextelements_blackBBBB(match, eClassDeclaration,
							eTypeAccess, eSuperInterface);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[eClassDeclaration] = " + eClassDeclaration + ", " + "[eTypeAccess] = " + eTypeAccess + ", "
						+ "[eSuperInterface] = " + eSuperInterface + ".");
			}
			ClassImplementsInterfaceImpl.pattern_ClassImplementsInterface_0_5_collectcontextelements_greenBBB(match,
					eClassDeclaration, eSuperInterface);

			// 
			ClassImplementsInterfaceImpl.pattern_ClassImplementsInterface_0_6_registerobjectstomatch_expressionBBBBB(
					this, match, eClassDeclaration, eTypeAccess, eSuperInterface);
			return ClassImplementsInterfaceImpl.pattern_ClassImplementsInterface_0_7_expressionF();
		} else {
			return ClassImplementsInterfaceImpl.pattern_ClassImplementsInterface_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = ClassImplementsInterfaceImpl
				.pattern_ClassImplementsInterface_1_1_performtransformation_bindingAndBlackFFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		ClassDeclaration eClassDeclaration = (ClassDeclaration) result1_bindingAndBlack[0];
		TypeToTAbstractType eSuperInterfaceToTSuperInterface = (TypeToTAbstractType) result1_bindingAndBlack[1];
		TClass tClass = (TClass) result1_bindingAndBlack[2];
		TInterface tSuperInterface = (TInterface) result1_bindingAndBlack[3];
		TypeAccess eTypeAccess = (TypeAccess) result1_bindingAndBlack[4];
		TypeToTAbstractType eClassDeclarationToTClass = (TypeToTAbstractType) result1_bindingAndBlack[5];
		Type eSuperInterface = (Type) result1_bindingAndBlack[6];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[7];
		ClassImplementsInterfaceImpl.pattern_ClassImplementsInterface_1_1_performtransformation_greenBB(tClass,
				tSuperInterface);

		Object[] result2_black = ClassImplementsInterfaceImpl
				.pattern_ClassImplementsInterface_1_2_collecttranslatedelements_blackB(eTypeAccess);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[eTypeAccess] = " + eTypeAccess + ".");
		}
		Object[] result2_green = ClassImplementsInterfaceImpl
				.pattern_ClassImplementsInterface_1_2_collecttranslatedelements_greenFB(eTypeAccess);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = ClassImplementsInterfaceImpl
				.pattern_ClassImplementsInterface_1_3_bookkeepingforedges_blackBBBBBBBB(ruleresult, eClassDeclaration,
						eSuperInterfaceToTSuperInterface, tClass, tSuperInterface, eTypeAccess,
						eClassDeclarationToTClass, eSuperInterface);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[eClassDeclaration] = " + eClassDeclaration + ", "
					+ "[eSuperInterfaceToTSuperInterface] = " + eSuperInterfaceToTSuperInterface + ", " + "[tClass] = "
					+ tClass + ", " + "[tSuperInterface] = " + tSuperInterface + ", " + "[eTypeAccess] = " + eTypeAccess
					+ ", " + "[eClassDeclarationToTClass] = " + eClassDeclarationToTClass + ", "
					+ "[eSuperInterface] = " + eSuperInterface + ".");
		}
		ClassImplementsInterfaceImpl.pattern_ClassImplementsInterface_1_3_bookkeepingforedges_greenBBBBBBFFFFF(
				ruleresult, eClassDeclaration, tClass, tSuperInterface, eTypeAccess, eSuperInterface);
		//nothing EMoflonEdge eTypeAccess__eSuperInterface____type = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge eSuperInterface__eTypeAccess____usagesInTypeAccess = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge eClassDeclaration__eTypeAccess____superInterfaces = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge tSuperInterface__tClass____implementedBy = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge tClass__tSuperInterface____implements = (EMoflonEdge) result3_green[10];

		// 
		// 
		ClassImplementsInterfaceImpl.pattern_ClassImplementsInterface_1_5_registerobjects_expressionBBBBBBBBB(this,
				ruleresult, eClassDeclaration, eSuperInterfaceToTSuperInterface, tClass, tSuperInterface, eTypeAccess,
				eClassDeclarationToTClass, eSuperInterface);
		return ClassImplementsInterfaceImpl.pattern_ClassImplementsInterface_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = ClassImplementsInterfaceImpl
				.pattern_ClassImplementsInterface_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ClassImplementsInterfaceImpl
				.pattern_ClassImplementsInterface_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = ClassImplementsInterfaceImpl
				.pattern_ClassImplementsInterface_2_2_corematch_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		ClassDeclaration eClassDeclaration = (ClassDeclaration) result2_binding[0];
		TypeAccess eTypeAccess = (TypeAccess) result2_binding[1];
		Type eSuperInterface = (Type) result2_binding[2];
		for (Object[] result2_black : ClassImplementsInterfaceImpl
				.pattern_ClassImplementsInterface_2_2_corematch_blackBFFFBFBB(eClassDeclaration, eTypeAccess,
						eSuperInterface, match)) {
			TypeToTAbstractType eSuperInterfaceToTSuperInterface = (TypeToTAbstractType) result2_black[1];
			TClass tClass = (TClass) result2_black[2];
			TInterface tSuperInterface = (TInterface) result2_black[3];
			TypeToTAbstractType eClassDeclarationToTClass = (TypeToTAbstractType) result2_black[5];
			// ForEach 
			for (Object[] result3_black : ClassImplementsInterfaceImpl
					.pattern_ClassImplementsInterface_2_3_findcontext_blackBBBBBBB(eClassDeclaration,
							eSuperInterfaceToTSuperInterface, tClass, tSuperInterface, eTypeAccess,
							eClassDeclarationToTClass, eSuperInterface)) {
				Object[] result3_green = ClassImplementsInterfaceImpl
						.pattern_ClassImplementsInterface_2_3_findcontext_greenBBBBBBBFFFFFFFF(eClassDeclaration,
								eSuperInterfaceToTSuperInterface, tClass, tSuperInterface, eTypeAccess,
								eClassDeclarationToTClass, eSuperInterface);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[7];
				//nothing EMoflonEdge eSuperInterfaceToTSuperInterface__tSuperInterface____target = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge eClassDeclarationToTClass__tClass____target = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge eTypeAccess__eSuperInterface____type = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge eSuperInterface__eTypeAccess____usagesInTypeAccess = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge eClassDeclaration__eTypeAccess____superInterfaces = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge eSuperInterfaceToTSuperInterface__eSuperInterface____source = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge eClassDeclarationToTClass__eClassDeclaration____source = (EMoflonEdge) result3_green[14];

				Object[] result4_bindingAndBlack = ClassImplementsInterfaceImpl
						.pattern_ClassImplementsInterface_2_4_solveCSP_bindingAndBlackFBBBBBBBBB(this,
								isApplicableMatch, eClassDeclaration, eSuperInterfaceToTSuperInterface, tClass,
								tSuperInterface, eTypeAccess, eClassDeclarationToTClass, eSuperInterface);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[eClassDeclaration] = "
							+ eClassDeclaration + ", " + "[eSuperInterfaceToTSuperInterface] = "
							+ eSuperInterfaceToTSuperInterface + ", " + "[tClass] = " + tClass + ", "
							+ "[tSuperInterface] = " + tSuperInterface + ", " + "[eTypeAccess] = " + eTypeAccess + ", "
							+ "[eClassDeclarationToTClass] = " + eClassDeclarationToTClass + ", "
							+ "[eSuperInterface] = " + eSuperInterface + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (ClassImplementsInterfaceImpl.pattern_ClassImplementsInterface_2_5_checkCSP_expressionFBB(this,
						csp)) {

					Object[] result6_black = ClassImplementsInterfaceImpl
							.pattern_ClassImplementsInterface_2_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					ClassImplementsInterfaceImpl.pattern_ClassImplementsInterface_2_6_addmatchtoruleresult_greenBB(
							ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return ClassImplementsInterfaceImpl.pattern_ClassImplementsInterface_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, ClassDeclaration eClassDeclaration, TypeAccess eTypeAccess,
			Type eSuperInterface) {
		match.registerObject("eClassDeclaration", eClassDeclaration);
		match.registerObject("eTypeAccess", eTypeAccess);
		match.registerObject("eSuperInterface", eSuperInterface);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, ClassDeclaration eClassDeclaration, TypeAccess eTypeAccess,
			Type eSuperInterface) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, ClassDeclaration eClassDeclaration,
			TypeToTAbstractType eSuperInterfaceToTSuperInterface, TClass tClass, TInterface tSuperInterface,
			TypeAccess eTypeAccess, TypeToTAbstractType eClassDeclarationToTClass, Type eSuperInterface) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("eClassDeclaration", eClassDeclaration);
		isApplicableMatch.registerObject("eSuperInterfaceToTSuperInterface", eSuperInterfaceToTSuperInterface);
		isApplicableMatch.registerObject("tClass", tClass);
		isApplicableMatch.registerObject("tSuperInterface", tSuperInterface);
		isApplicableMatch.registerObject("eTypeAccess", eTypeAccess);
		isApplicableMatch.registerObject("eClassDeclarationToTClass", eClassDeclarationToTClass);
		isApplicableMatch.registerObject("eSuperInterface", eSuperInterface);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject eClassDeclaration,
			EObject eSuperInterfaceToTSuperInterface, EObject tClass, EObject tSuperInterface, EObject eTypeAccess,
			EObject eClassDeclarationToTClass, EObject eSuperInterface) {
		ruleresult.registerObject("eClassDeclaration", eClassDeclaration);
		ruleresult.registerObject("eSuperInterfaceToTSuperInterface", eSuperInterfaceToTSuperInterface);
		ruleresult.registerObject("tClass", tClass);
		ruleresult.registerObject("tSuperInterface", tSuperInterface);
		ruleresult.registerObject("eTypeAccess", eTypeAccess);
		ruleresult.registerObject("eClassDeclarationToTClass", eClassDeclarationToTClass);
		ruleresult.registerObject("eSuperInterface", eSuperInterface);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("eTypeAccess").eClass())
				.equals("java.TypeAccess.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, TClass tClass, TInterface tSuperInterface) {

		Object[] result1_black = ClassImplementsInterfaceImpl
				.pattern_ClassImplementsInterface_10_1_initialbindings_blackBBBB(this, match, tClass, tSuperInterface);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[match] = " + match
							+ ", " + "[tClass] = " + tClass + ", " + "[tSuperInterface] = " + tSuperInterface + ".");
		}

		Object[] result2_bindingAndBlack = ClassImplementsInterfaceImpl
				.pattern_ClassImplementsInterface_10_2_SolveCSP_bindingAndBlackFBBBB(this, match, tClass,
						tSuperInterface);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[match] = " + match
							+ ", " + "[tClass] = " + tClass + ", " + "[tSuperInterface] = " + tSuperInterface + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (ClassImplementsInterfaceImpl.pattern_ClassImplementsInterface_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = ClassImplementsInterfaceImpl
					.pattern_ClassImplementsInterface_10_4_collectelementstobetranslated_blackBBB(match, tClass,
							tSuperInterface);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[tClass] = " + tClass + ", " + "[tSuperInterface] = " + tSuperInterface + ".");
			}
			ClassImplementsInterfaceImpl.pattern_ClassImplementsInterface_10_4_collectelementstobetranslated_greenBBBFF(
					match, tClass, tSuperInterface);
			//nothing EMoflonEdge tSuperInterface__tClass____implementedBy = (EMoflonEdge) result4_green[3];
			//nothing EMoflonEdge tClass__tSuperInterface____implements = (EMoflonEdge) result4_green[4];

			Object[] result5_black = ClassImplementsInterfaceImpl
					.pattern_ClassImplementsInterface_10_5_collectcontextelements_blackBBB(match, tClass,
							tSuperInterface);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[tClass] = " + tClass + ", " + "[tSuperInterface] = " + tSuperInterface + ".");
			}
			ClassImplementsInterfaceImpl.pattern_ClassImplementsInterface_10_5_collectcontextelements_greenBBB(match,
					tClass, tSuperInterface);

			// 
			ClassImplementsInterfaceImpl.pattern_ClassImplementsInterface_10_6_registerobjectstomatch_expressionBBBB(
					this, match, tClass, tSuperInterface);
			return ClassImplementsInterfaceImpl.pattern_ClassImplementsInterface_10_7_expressionF();
		} else {
			return ClassImplementsInterfaceImpl.pattern_ClassImplementsInterface_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = ClassImplementsInterfaceImpl
				.pattern_ClassImplementsInterface_11_1_performtransformation_bindingAndBlackFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		ClassDeclaration eClassDeclaration = (ClassDeclaration) result1_bindingAndBlack[0];
		TypeToTAbstractType eSuperInterfaceToTSuperInterface = (TypeToTAbstractType) result1_bindingAndBlack[1];
		TClass tClass = (TClass) result1_bindingAndBlack[2];
		TInterface tSuperInterface = (TInterface) result1_bindingAndBlack[3];
		TypeToTAbstractType eClassDeclarationToTClass = (TypeToTAbstractType) result1_bindingAndBlack[4];
		Type eSuperInterface = (Type) result1_bindingAndBlack[5];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[6];
		Object[] result1_green = ClassImplementsInterfaceImpl
				.pattern_ClassImplementsInterface_11_1_performtransformation_greenBFB(eClassDeclaration,
						eSuperInterface);
		TypeAccess eTypeAccess = (TypeAccess) result1_green[1];

		Object[] result2_black = ClassImplementsInterfaceImpl
				.pattern_ClassImplementsInterface_11_2_collecttranslatedelements_blackB(eTypeAccess);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[eTypeAccess] = " + eTypeAccess + ".");
		}
		Object[] result2_green = ClassImplementsInterfaceImpl
				.pattern_ClassImplementsInterface_11_2_collecttranslatedelements_greenFB(eTypeAccess);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = ClassImplementsInterfaceImpl
				.pattern_ClassImplementsInterface_11_3_bookkeepingforedges_blackBBBBBBBB(ruleresult, eClassDeclaration,
						eSuperInterfaceToTSuperInterface, tClass, tSuperInterface, eTypeAccess,
						eClassDeclarationToTClass, eSuperInterface);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[eClassDeclaration] = " + eClassDeclaration + ", "
					+ "[eSuperInterfaceToTSuperInterface] = " + eSuperInterfaceToTSuperInterface + ", " + "[tClass] = "
					+ tClass + ", " + "[tSuperInterface] = " + tSuperInterface + ", " + "[eTypeAccess] = " + eTypeAccess
					+ ", " + "[eClassDeclarationToTClass] = " + eClassDeclarationToTClass + ", "
					+ "[eSuperInterface] = " + eSuperInterface + ".");
		}
		ClassImplementsInterfaceImpl.pattern_ClassImplementsInterface_11_3_bookkeepingforedges_greenBBBBBBFFFFF(
				ruleresult, eClassDeclaration, tClass, tSuperInterface, eTypeAccess, eSuperInterface);
		//nothing EMoflonEdge eTypeAccess__eSuperInterface____type = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge eSuperInterface__eTypeAccess____usagesInTypeAccess = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge eClassDeclaration__eTypeAccess____superInterfaces = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge tSuperInterface__tClass____implementedBy = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge tClass__tSuperInterface____implements = (EMoflonEdge) result3_green[10];

		// 
		// 
		ClassImplementsInterfaceImpl.pattern_ClassImplementsInterface_11_5_registerobjects_expressionBBBBBBBBB(this,
				ruleresult, eClassDeclaration, eSuperInterfaceToTSuperInterface, tClass, tSuperInterface, eTypeAccess,
				eClassDeclarationToTClass, eSuperInterface);
		return ClassImplementsInterfaceImpl.pattern_ClassImplementsInterface_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = ClassImplementsInterfaceImpl
				.pattern_ClassImplementsInterface_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ClassImplementsInterfaceImpl
				.pattern_ClassImplementsInterface_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = ClassImplementsInterfaceImpl
				.pattern_ClassImplementsInterface_12_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		TClass tClass = (TClass) result2_binding[0];
		TInterface tSuperInterface = (TInterface) result2_binding[1];
		for (Object[] result2_black : ClassImplementsInterfaceImpl
				.pattern_ClassImplementsInterface_12_2_corematch_blackFFBBFFB(tClass, tSuperInterface, match)) {
			ClassDeclaration eClassDeclaration = (ClassDeclaration) result2_black[0];
			TypeToTAbstractType eSuperInterfaceToTSuperInterface = (TypeToTAbstractType) result2_black[1];
			TypeToTAbstractType eClassDeclarationToTClass = (TypeToTAbstractType) result2_black[4];
			Type eSuperInterface = (Type) result2_black[5];
			// ForEach 
			for (Object[] result3_black : ClassImplementsInterfaceImpl
					.pattern_ClassImplementsInterface_12_3_findcontext_blackBBBBBB(eClassDeclaration,
							eSuperInterfaceToTSuperInterface, tClass, tSuperInterface, eClassDeclarationToTClass,
							eSuperInterface)) {
				Object[] result3_green = ClassImplementsInterfaceImpl
						.pattern_ClassImplementsInterface_12_3_findcontext_greenBBBBBBFFFFFFF(eClassDeclaration,
								eSuperInterfaceToTSuperInterface, tClass, tSuperInterface, eClassDeclarationToTClass,
								eSuperInterface);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[6];
				//nothing EMoflonEdge eSuperInterfaceToTSuperInterface__tSuperInterface____target = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge eClassDeclarationToTClass__tClass____target = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge eSuperInterfaceToTSuperInterface__eSuperInterface____source = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge tSuperInterface__tClass____implementedBy = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge tClass__tSuperInterface____implements = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge eClassDeclarationToTClass__eClassDeclaration____source = (EMoflonEdge) result3_green[12];

				Object[] result4_bindingAndBlack = ClassImplementsInterfaceImpl
						.pattern_ClassImplementsInterface_12_4_solveCSP_bindingAndBlackFBBBBBBBB(this,
								isApplicableMatch, eClassDeclaration, eSuperInterfaceToTSuperInterface, tClass,
								tSuperInterface, eClassDeclarationToTClass, eSuperInterface);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[eClassDeclaration] = "
							+ eClassDeclaration + ", " + "[eSuperInterfaceToTSuperInterface] = "
							+ eSuperInterfaceToTSuperInterface + ", " + "[tClass] = " + tClass + ", "
							+ "[tSuperInterface] = " + tSuperInterface + ", " + "[eClassDeclarationToTClass] = "
							+ eClassDeclarationToTClass + ", " + "[eSuperInterface] = " + eSuperInterface + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (ClassImplementsInterfaceImpl.pattern_ClassImplementsInterface_12_5_checkCSP_expressionFBB(this,
						csp)) {

					Object[] result6_black = ClassImplementsInterfaceImpl
							.pattern_ClassImplementsInterface_12_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					ClassImplementsInterfaceImpl.pattern_ClassImplementsInterface_12_6_addmatchtoruleresult_greenBB(
							ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return ClassImplementsInterfaceImpl.pattern_ClassImplementsInterface_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, TClass tClass, TInterface tSuperInterface) {
		match.registerObject("tClass", tClass);
		match.registerObject("tSuperInterface", tSuperInterface);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, TClass tClass, TInterface tSuperInterface) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, ClassDeclaration eClassDeclaration,
			TypeToTAbstractType eSuperInterfaceToTSuperInterface, TClass tClass, TInterface tSuperInterface,
			TypeToTAbstractType eClassDeclarationToTClass, Type eSuperInterface) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("eClassDeclaration", eClassDeclaration);
		isApplicableMatch.registerObject("eSuperInterfaceToTSuperInterface", eSuperInterfaceToTSuperInterface);
		isApplicableMatch.registerObject("tClass", tClass);
		isApplicableMatch.registerObject("tSuperInterface", tSuperInterface);
		isApplicableMatch.registerObject("eClassDeclarationToTClass", eClassDeclarationToTClass);
		isApplicableMatch.registerObject("eSuperInterface", eSuperInterface);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject eClassDeclaration,
			EObject eSuperInterfaceToTSuperInterface, EObject tClass, EObject tSuperInterface, EObject eTypeAccess,
			EObject eClassDeclarationToTClass, EObject eSuperInterface) {
		ruleresult.registerObject("eClassDeclaration", eClassDeclaration);
		ruleresult.registerObject("eSuperInterfaceToTSuperInterface", eSuperInterfaceToTSuperInterface);
		ruleresult.registerObject("tClass", tClass);
		ruleresult.registerObject("tSuperInterface", tSuperInterface);
		ruleresult.registerObject("eTypeAccess", eTypeAccess);
		ruleresult.registerObject("eClassDeclarationToTClass", eClassDeclarationToTClass);
		ruleresult.registerObject("eSuperInterface", eSuperInterface);

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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_692(EMoflonEdge _edge_implementedBy) {

		Object[] result1_bindingAndBlack = ClassImplementsInterfaceImpl
				.pattern_ClassImplementsInterface_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = ClassImplementsInterfaceImpl
				.pattern_ClassImplementsInterface_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : ClassImplementsInterfaceImpl
				.pattern_ClassImplementsInterface_20_2_testcorematchandDECs_blackFFB(_edge_implementedBy)) {
			TClass tClass = (TClass) result2_black[0];
			TInterface tSuperInterface = (TInterface) result2_black[1];
			Object[] result2_green = ClassImplementsInterfaceImpl
					.pattern_ClassImplementsInterface_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (ClassImplementsInterfaceImpl
					.pattern_ClassImplementsInterface_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
							this, match, tClass, tSuperInterface)) {
				// 
				if (ClassImplementsInterfaceImpl
						.pattern_ClassImplementsInterface_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = ClassImplementsInterfaceImpl
							.pattern_ClassImplementsInterface_20_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					ClassImplementsInterfaceImpl.pattern_ClassImplementsInterface_20_5_Addmatchtoruleresult_greenBBBB(
							match, __performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return ClassImplementsInterfaceImpl.pattern_ClassImplementsInterface_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_711(EMoflonEdge _edge_type) {

		Object[] result1_bindingAndBlack = ClassImplementsInterfaceImpl
				.pattern_ClassImplementsInterface_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = ClassImplementsInterfaceImpl
				.pattern_ClassImplementsInterface_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : ClassImplementsInterfaceImpl
				.pattern_ClassImplementsInterface_21_2_testcorematchandDECs_blackFFFB(_edge_type)) {
			ClassDeclaration eClassDeclaration = (ClassDeclaration) result2_black[0];
			TypeAccess eTypeAccess = (TypeAccess) result2_black[1];
			Type eSuperInterface = (Type) result2_black[2];
			Object[] result2_green = ClassImplementsInterfaceImpl
					.pattern_ClassImplementsInterface_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (ClassImplementsInterfaceImpl
					.pattern_ClassImplementsInterface_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
							this, match, eClassDeclaration, eTypeAccess, eSuperInterface)) {
				// 
				if (ClassImplementsInterfaceImpl
						.pattern_ClassImplementsInterface_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = ClassImplementsInterfaceImpl
							.pattern_ClassImplementsInterface_21_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					ClassImplementsInterfaceImpl.pattern_ClassImplementsInterface_21_5_Addmatchtoruleresult_greenBBBB(
							match, __performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return ClassImplementsInterfaceImpl.pattern_ClassImplementsInterface_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("ClassImplementsInterface");
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
		ruleResult.setRule("ClassImplementsInterface");
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

		Object[] result1_black = ClassImplementsInterfaceImpl
				.pattern_ClassImplementsInterface_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = ClassImplementsInterfaceImpl.pattern_ClassImplementsInterface_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = ClassImplementsInterfaceImpl
				.pattern_ClassImplementsInterface_24_2_matchsrctrgcontext_bindingAndBlackFFFFFBB(sourceMatch,
						targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		ClassDeclaration eClassDeclaration = (ClassDeclaration) result2_bindingAndBlack[0];
		TClass tClass = (TClass) result2_bindingAndBlack[1];
		TInterface tSuperInterface = (TInterface) result2_bindingAndBlack[2];
		TypeAccess eTypeAccess = (TypeAccess) result2_bindingAndBlack[3];
		Type eSuperInterface = (Type) result2_bindingAndBlack[4];

		Object[] result3_bindingAndBlack = ClassImplementsInterfaceImpl
				.pattern_ClassImplementsInterface_24_3_solvecsp_bindingAndBlackFBBBBBBBB(this, eClassDeclaration,
						tClass, tSuperInterface, eTypeAccess, eSuperInterface, sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[eClassDeclaration] = " + eClassDeclaration + ", " + "[tClass] = " + tClass + ", "
					+ "[tSuperInterface] = " + tSuperInterface + ", " + "[eTypeAccess] = " + eTypeAccess + ", "
					+ "[eSuperInterface] = " + eSuperInterface + ", " + "[sourceMatch] = " + sourceMatch + ", "
					+ "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (ClassImplementsInterfaceImpl.pattern_ClassImplementsInterface_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : ClassImplementsInterfaceImpl
					.pattern_ClassImplementsInterface_24_5_matchcorrcontext_blackBFBBFBBB(eClassDeclaration, tClass,
							tSuperInterface, eSuperInterface, sourceMatch, targetMatch)) {
				TypeToTAbstractType eSuperInterfaceToTSuperInterface = (TypeToTAbstractType) result5_black[1];
				TypeToTAbstractType eClassDeclarationToTClass = (TypeToTAbstractType) result5_black[4];
				Object[] result5_green = ClassImplementsInterfaceImpl
						.pattern_ClassImplementsInterface_24_5_matchcorrcontext_greenBBBBF(
								eSuperInterfaceToTSuperInterface, eClassDeclarationToTClass, sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[4];

				Object[] result6_black = ClassImplementsInterfaceImpl
						.pattern_ClassImplementsInterface_24_6_createcorrespondence_blackBBBBBB(eClassDeclaration,
								tClass, tSuperInterface, eTypeAccess, eSuperInterface, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[eClassDeclaration] = "
							+ eClassDeclaration + ", " + "[tClass] = " + tClass + ", " + "[tSuperInterface] = "
							+ tSuperInterface + ", " + "[eTypeAccess] = " + eTypeAccess + ", " + "[eSuperInterface] = "
							+ eSuperInterface + ", " + "[ccMatch] = " + ccMatch + ".");
				}

				Object[] result7_black = ClassImplementsInterfaceImpl
						.pattern_ClassImplementsInterface_24_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				ClassImplementsInterfaceImpl.pattern_ClassImplementsInterface_24_7_addtoreturnedresult_greenBB(result,
						ccMatch);

			}

		} else {
		}
		return ClassImplementsInterfaceImpl.pattern_ClassImplementsInterface_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(ClassDeclaration eClassDeclaration, TClass tClass, TInterface tSuperInterface,
			TypeAccess eTypeAccess, Type eSuperInterface, Match sourceMatch, Match targetMatch) {// Create CSP
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
	public boolean checkDEC_FWD(ClassDeclaration eClassDeclaration, TypeAccess eTypeAccess, Type eSuperInterface) {// 
		Object[] result1_black = ClassImplementsInterfaceImpl
				.pattern_ClassImplementsInterface_27_1_matchtggpattern_blackBBB(eClassDeclaration, eTypeAccess,
						eSuperInterface);
		if (result1_black != null) {
			return ClassImplementsInterfaceImpl.pattern_ClassImplementsInterface_27_2_expressionF();
		} else {
			return ClassImplementsInterfaceImpl.pattern_ClassImplementsInterface_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(TClass tClass, TInterface tSuperInterface) {// 
		Object[] result1_black = ClassImplementsInterfaceImpl
				.pattern_ClassImplementsInterface_28_1_matchtggpattern_blackBB(tClass, tSuperInterface);
		if (result1_black != null) {
			return ClassImplementsInterfaceImpl.pattern_ClassImplementsInterface_28_2_expressionF();
		} else {
			return ClassImplementsInterfaceImpl.pattern_ClassImplementsInterface_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer,
			TypeToTAbstractType eClassDeclarationToTClassParameter,
			TypeToTAbstractType eSuperInterfaceToTSuperInterfaceParameter) {

		Object[] result1_black = ClassImplementsInterfaceImpl
				.pattern_ClassImplementsInterface_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = ClassImplementsInterfaceImpl
				.pattern_ClassImplementsInterface_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : ClassImplementsInterfaceImpl
				.pattern_ClassImplementsInterface_29_2_isapplicablecore_blackFFFFFFFFBB(ruleEntryContainer,
						ruleResult)) {
			//nothing RuleEntryList eClassDeclarationToTClassList = (RuleEntryList) result2_black[0];
			ClassDeclaration eClassDeclaration = (ClassDeclaration) result2_black[1];
			TypeToTAbstractType eClassDeclarationToTClass = (TypeToTAbstractType) result2_black[2];
			TClass tClass = (TClass) result2_black[3];
			//nothing RuleEntryList eSuperInterfaceToTSuperInterfaceList = (RuleEntryList) result2_black[4];
			TypeToTAbstractType eSuperInterfaceToTSuperInterface = (TypeToTAbstractType) result2_black[5];
			TInterface tSuperInterface = (TInterface) result2_black[6];
			Type eSuperInterface = (Type) result2_black[7];

			Object[] result3_bindingAndBlack = ClassImplementsInterfaceImpl
					.pattern_ClassImplementsInterface_29_3_solveCSP_bindingAndBlackFBBBBBBBBB(this, isApplicableMatch,
							eClassDeclaration, eSuperInterfaceToTSuperInterface, tClass, tSuperInterface,
							eClassDeclarationToTClass, eSuperInterface, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[eClassDeclaration] = "
						+ eClassDeclaration + ", " + "[eSuperInterfaceToTSuperInterface] = "
						+ eSuperInterfaceToTSuperInterface + ", " + "[tClass] = " + tClass + ", "
						+ "[tSuperInterface] = " + tSuperInterface + ", " + "[eClassDeclarationToTClass] = "
						+ eClassDeclarationToTClass + ", " + "[eSuperInterface] = " + eSuperInterface + ", "
						+ "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (ClassImplementsInterfaceImpl.pattern_ClassImplementsInterface_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = ClassImplementsInterfaceImpl
						.pattern_ClassImplementsInterface_29_5_checknacs_blackBBBBBB(eClassDeclaration,
								eSuperInterfaceToTSuperInterface, tClass, tSuperInterface, eClassDeclarationToTClass,
								eSuperInterface);
				if (result5_black != null) {

					Object[] result6_black = ClassImplementsInterfaceImpl
							.pattern_ClassImplementsInterface_29_6_perform_blackBBBBBBB(eClassDeclaration,
									eSuperInterfaceToTSuperInterface, tClass, tSuperInterface,
									eClassDeclarationToTClass, eSuperInterface, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: "
								+ "[eClassDeclaration] = " + eClassDeclaration + ", "
								+ "[eSuperInterfaceToTSuperInterface] = " + eSuperInterfaceToTSuperInterface + ", "
								+ "[tClass] = " + tClass + ", " + "[tSuperInterface] = " + tSuperInterface + ", "
								+ "[eClassDeclarationToTClass] = " + eClassDeclarationToTClass + ", "
								+ "[eSuperInterface] = " + eSuperInterface + ", " + "[ruleResult] = " + ruleResult
								+ ".");
					}
					ClassImplementsInterfaceImpl.pattern_ClassImplementsInterface_29_6_perform_greenBBBFBB(
							eClassDeclaration, tClass, tSuperInterface, eSuperInterface, ruleResult);
					//nothing TypeAccess eTypeAccess = (TypeAccess) result6_green[3];

				} else {
				}

			} else {
			}

		}
		return ClassImplementsInterfaceImpl.pattern_ClassImplementsInterface_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, ClassDeclaration eClassDeclaration,
			TypeToTAbstractType eSuperInterfaceToTSuperInterface, TClass tClass, TInterface tSuperInterface,
			TypeToTAbstractType eClassDeclarationToTClass, Type eSuperInterface, ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("eClassDeclaration", eClassDeclaration);
		isApplicableMatch.registerObject("eSuperInterfaceToTSuperInterface", eSuperInterfaceToTSuperInterface);
		isApplicableMatch.registerObject("tClass", tClass);
		isApplicableMatch.registerObject("tSuperInterface", tSuperInterface);
		isApplicableMatch.registerObject("eClassDeclarationToTClass", eClassDeclarationToTClass);
		isApplicableMatch.registerObject("eSuperInterface", eSuperInterface);
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
		case RulesPackage.CLASS_IMPLEMENTS_INTERFACE___IS_APPROPRIATE_FWD__MATCH_CLASSDECLARATION_TYPEACCESS_TYPE:
			return isAppropriate_FWD((Match) arguments.get(0), (ClassDeclaration) arguments.get(1),
					(TypeAccess) arguments.get(2), (Type) arguments.get(3));
		case RulesPackage.CLASS_IMPLEMENTS_INTERFACE___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.CLASS_IMPLEMENTS_INTERFACE___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.CLASS_IMPLEMENTS_INTERFACE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_CLASSDECLARATION_TYPEACCESS_TYPE:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (ClassDeclaration) arguments.get(1),
					(TypeAccess) arguments.get(2), (Type) arguments.get(3));
			return null;
		case RulesPackage.CLASS_IMPLEMENTS_INTERFACE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_CLASSDECLARATION_TYPEACCESS_TYPE:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (ClassDeclaration) arguments.get(1),
					(TypeAccess) arguments.get(2), (Type) arguments.get(3));
		case RulesPackage.CLASS_IMPLEMENTS_INTERFACE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.CLASS_IMPLEMENTS_INTERFACE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_CLASSDECLARATION_TYPETOTABSTRACTTYPE_TCLASS_TINTERFACE_TYPEACCESS_TYPETOTABSTRACTTYPE_TYPE:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (ClassDeclaration) arguments.get(1),
					(TypeToTAbstractType) arguments.get(2), (TClass) arguments.get(3), (TInterface) arguments.get(4),
					(TypeAccess) arguments.get(5), (TypeToTAbstractType) arguments.get(6), (Type) arguments.get(7));
		case RulesPackage.CLASS_IMPLEMENTS_INTERFACE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.CLASS_IMPLEMENTS_INTERFACE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7));
			return null;
		case RulesPackage.CLASS_IMPLEMENTS_INTERFACE___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.CLASS_IMPLEMENTS_INTERFACE___IS_APPROPRIATE_BWD__MATCH_TCLASS_TINTERFACE:
			return isAppropriate_BWD((Match) arguments.get(0), (TClass) arguments.get(1),
					(TInterface) arguments.get(2));
		case RulesPackage.CLASS_IMPLEMENTS_INTERFACE___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.CLASS_IMPLEMENTS_INTERFACE___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.CLASS_IMPLEMENTS_INTERFACE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TCLASS_TINTERFACE:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (TClass) arguments.get(1),
					(TInterface) arguments.get(2));
			return null;
		case RulesPackage.CLASS_IMPLEMENTS_INTERFACE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TCLASS_TINTERFACE:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (TClass) arguments.get(1),
					(TInterface) arguments.get(2));
		case RulesPackage.CLASS_IMPLEMENTS_INTERFACE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.CLASS_IMPLEMENTS_INTERFACE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_CLASSDECLARATION_TYPETOTABSTRACTTYPE_TCLASS_TINTERFACE_TYPETOTABSTRACTTYPE_TYPE:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (ClassDeclaration) arguments.get(1),
					(TypeToTAbstractType) arguments.get(2), (TClass) arguments.get(3), (TInterface) arguments.get(4),
					(TypeToTAbstractType) arguments.get(5), (Type) arguments.get(6));
		case RulesPackage.CLASS_IMPLEMENTS_INTERFACE___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.CLASS_IMPLEMENTS_INTERFACE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7));
			return null;
		case RulesPackage.CLASS_IMPLEMENTS_INTERFACE___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.CLASS_IMPLEMENTS_INTERFACE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_692__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_692((EMoflonEdge) arguments.get(0));
		case RulesPackage.CLASS_IMPLEMENTS_INTERFACE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_711__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_711((EMoflonEdge) arguments.get(0));
		case RulesPackage.CLASS_IMPLEMENTS_INTERFACE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.CLASS_IMPLEMENTS_INTERFACE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.CLASS_IMPLEMENTS_INTERFACE___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.CLASS_IMPLEMENTS_INTERFACE___IS_APPLICABLE_SOLVE_CSP_CC__CLASSDECLARATION_TCLASS_TINTERFACE_TYPEACCESS_TYPE_MATCH_MATCH:
			return isApplicable_solveCsp_CC((ClassDeclaration) arguments.get(0), (TClass) arguments.get(1),
					(TInterface) arguments.get(2), (TypeAccess) arguments.get(3), (Type) arguments.get(4),
					(Match) arguments.get(5), (Match) arguments.get(6));
		case RulesPackage.CLASS_IMPLEMENTS_INTERFACE___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.CLASS_IMPLEMENTS_INTERFACE___CHECK_DEC_FWD__CLASSDECLARATION_TYPEACCESS_TYPE:
			return checkDEC_FWD((ClassDeclaration) arguments.get(0), (TypeAccess) arguments.get(1),
					(Type) arguments.get(2));
		case RulesPackage.CLASS_IMPLEMENTS_INTERFACE___CHECK_DEC_BWD__TCLASS_TINTERFACE:
			return checkDEC_BWD((TClass) arguments.get(0), (TInterface) arguments.get(1));
		case RulesPackage.CLASS_IMPLEMENTS_INTERFACE___GENERATE_MODEL__RULEENTRYCONTAINER_TYPETOTABSTRACTTYPE_TYPETOTABSTRACTTYPE:
			return generateModel((RuleEntryContainer) arguments.get(0), (TypeToTAbstractType) arguments.get(1),
					(TypeToTAbstractType) arguments.get(2));
		case RulesPackage.CLASS_IMPLEMENTS_INTERFACE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_CLASSDECLARATION_TYPETOTABSTRACTTYPE_TCLASS_TINTERFACE_TYPETOTABSTRACTTYPE_TYPE_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (ClassDeclaration) arguments.get(1),
					(TypeToTAbstractType) arguments.get(2), (TClass) arguments.get(3), (TInterface) arguments.get(4),
					(TypeToTAbstractType) arguments.get(5), (Type) arguments.get(6),
					(ModelgeneratorRuleResult) arguments.get(7));
		case RulesPackage.CLASS_IMPLEMENTS_INTERFACE___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_ClassImplementsInterface_0_1_initialbindings_blackBBBBB(
			ClassImplementsInterface _this, Match match, ClassDeclaration eClassDeclaration, TypeAccess eTypeAccess,
			Type eSuperInterface) {
		if (!eClassDeclaration.equals(eSuperInterface)) {
			return new Object[] { _this, match, eClassDeclaration, eTypeAccess, eSuperInterface };
		}
		return null;
	}

	public static final Object[] pattern_ClassImplementsInterface_0_2_SolveCSP_bindingFBBBBB(
			ClassImplementsInterface _this, Match match, ClassDeclaration eClassDeclaration, TypeAccess eTypeAccess,
			Type eSuperInterface) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, eClassDeclaration, eTypeAccess, eSuperInterface);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, eClassDeclaration, eTypeAccess, eSuperInterface };
		}
		return null;
	}

	public static final Object[] pattern_ClassImplementsInterface_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ClassImplementsInterface_0_2_SolveCSP_bindingAndBlackFBBBBB(
			ClassImplementsInterface _this, Match match, ClassDeclaration eClassDeclaration, TypeAccess eTypeAccess,
			Type eSuperInterface) {
		Object[] result_pattern_ClassImplementsInterface_0_2_SolveCSP_binding = pattern_ClassImplementsInterface_0_2_SolveCSP_bindingFBBBBB(
				_this, match, eClassDeclaration, eTypeAccess, eSuperInterface);
		if (result_pattern_ClassImplementsInterface_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_ClassImplementsInterface_0_2_SolveCSP_binding[0];

			Object[] result_pattern_ClassImplementsInterface_0_2_SolveCSP_black = pattern_ClassImplementsInterface_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_ClassImplementsInterface_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, eClassDeclaration, eTypeAccess, eSuperInterface };
			}
		}
		return null;
	}

	public static final boolean pattern_ClassImplementsInterface_0_3_CheckCSP_expressionFBB(
			ClassImplementsInterface _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ClassImplementsInterface_0_4_collectelementstobetranslated_blackBBBB(
			Match match, ClassDeclaration eClassDeclaration, TypeAccess eTypeAccess, Type eSuperInterface) {
		if (!eClassDeclaration.equals(eSuperInterface)) {
			return new Object[] { match, eClassDeclaration, eTypeAccess, eSuperInterface };
		}
		return null;
	}

	public static final Object[] pattern_ClassImplementsInterface_0_4_collectelementstobetranslated_greenBBBBFFF(
			Match match, ClassDeclaration eClassDeclaration, TypeAccess eTypeAccess, Type eSuperInterface) {
		EMoflonEdge eTypeAccess__eSuperInterface____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eSuperInterface__eTypeAccess____usagesInTypeAccess = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eClassDeclaration__eTypeAccess____superInterfaces = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(eTypeAccess);
		String eTypeAccess__eSuperInterface____type_name_prime = "type";
		String eSuperInterface__eTypeAccess____usagesInTypeAccess_name_prime = "usagesInTypeAccess";
		String eClassDeclaration__eTypeAccess____superInterfaces_name_prime = "superInterfaces";
		eTypeAccess__eSuperInterface____type.setSrc(eTypeAccess);
		eTypeAccess__eSuperInterface____type.setTrg(eSuperInterface);
		match.getToBeTranslatedEdges().add(eTypeAccess__eSuperInterface____type);
		eSuperInterface__eTypeAccess____usagesInTypeAccess.setSrc(eSuperInterface);
		eSuperInterface__eTypeAccess____usagesInTypeAccess.setTrg(eTypeAccess);
		match.getToBeTranslatedEdges().add(eSuperInterface__eTypeAccess____usagesInTypeAccess);
		eClassDeclaration__eTypeAccess____superInterfaces.setSrc(eClassDeclaration);
		eClassDeclaration__eTypeAccess____superInterfaces.setTrg(eTypeAccess);
		match.getToBeTranslatedEdges().add(eClassDeclaration__eTypeAccess____superInterfaces);
		eTypeAccess__eSuperInterface____type.setName(eTypeAccess__eSuperInterface____type_name_prime);
		eSuperInterface__eTypeAccess____usagesInTypeAccess
				.setName(eSuperInterface__eTypeAccess____usagesInTypeAccess_name_prime);
		eClassDeclaration__eTypeAccess____superInterfaces
				.setName(eClassDeclaration__eTypeAccess____superInterfaces_name_prime);
		return new Object[] { match, eClassDeclaration, eTypeAccess, eSuperInterface,
				eTypeAccess__eSuperInterface____type, eSuperInterface__eTypeAccess____usagesInTypeAccess,
				eClassDeclaration__eTypeAccess____superInterfaces };
	}

	public static final Object[] pattern_ClassImplementsInterface_0_5_collectcontextelements_blackBBBB(Match match,
			ClassDeclaration eClassDeclaration, TypeAccess eTypeAccess, Type eSuperInterface) {
		if (!eClassDeclaration.equals(eSuperInterface)) {
			return new Object[] { match, eClassDeclaration, eTypeAccess, eSuperInterface };
		}
		return null;
	}

	public static final Object[] pattern_ClassImplementsInterface_0_5_collectcontextelements_greenBBB(Match match,
			ClassDeclaration eClassDeclaration, Type eSuperInterface) {
		match.getContextNodes().add(eClassDeclaration);
		match.getContextNodes().add(eSuperInterface);
		return new Object[] { match, eClassDeclaration, eSuperInterface };
	}

	public static final void pattern_ClassImplementsInterface_0_6_registerobjectstomatch_expressionBBBBB(
			ClassImplementsInterface _this, Match match, ClassDeclaration eClassDeclaration, TypeAccess eTypeAccess,
			Type eSuperInterface) {
		_this.registerObjectsToMatch_FWD(match, eClassDeclaration, eTypeAccess, eSuperInterface);

	}

	public static final boolean pattern_ClassImplementsInterface_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ClassImplementsInterface_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_ClassImplementsInterface_1_1_performtransformation_bindingFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("eClassDeclaration");
		EObject _localVariable_1 = isApplicableMatch.getObject("eSuperInterfaceToTSuperInterface");
		EObject _localVariable_2 = isApplicableMatch.getObject("tClass");
		EObject _localVariable_3 = isApplicableMatch.getObject("tSuperInterface");
		EObject _localVariable_4 = isApplicableMatch.getObject("eTypeAccess");
		EObject _localVariable_5 = isApplicableMatch.getObject("eClassDeclarationToTClass");
		EObject _localVariable_6 = isApplicableMatch.getObject("eSuperInterface");
		EObject tmpEClassDeclaration = _localVariable_0;
		EObject tmpESuperInterfaceToTSuperInterface = _localVariable_1;
		EObject tmpTClass = _localVariable_2;
		EObject tmpTSuperInterface = _localVariable_3;
		EObject tmpETypeAccess = _localVariable_4;
		EObject tmpEClassDeclarationToTClass = _localVariable_5;
		EObject tmpESuperInterface = _localVariable_6;
		if (tmpEClassDeclaration instanceof ClassDeclaration) {
			ClassDeclaration eClassDeclaration = (ClassDeclaration) tmpEClassDeclaration;
			if (tmpESuperInterfaceToTSuperInterface instanceof TypeToTAbstractType) {
				TypeToTAbstractType eSuperInterfaceToTSuperInterface = (TypeToTAbstractType) tmpESuperInterfaceToTSuperInterface;
				if (tmpTClass instanceof TClass) {
					TClass tClass = (TClass) tmpTClass;
					if (tmpTSuperInterface instanceof TInterface) {
						TInterface tSuperInterface = (TInterface) tmpTSuperInterface;
						if (tmpETypeAccess instanceof TypeAccess) {
							TypeAccess eTypeAccess = (TypeAccess) tmpETypeAccess;
							if (tmpEClassDeclarationToTClass instanceof TypeToTAbstractType) {
								TypeToTAbstractType eClassDeclarationToTClass = (TypeToTAbstractType) tmpEClassDeclarationToTClass;
								if (tmpESuperInterface instanceof Type) {
									Type eSuperInterface = (Type) tmpESuperInterface;
									return new Object[] { eClassDeclaration, eSuperInterfaceToTSuperInterface, tClass,
											tSuperInterface, eTypeAccess, eClassDeclarationToTClass, eSuperInterface,
											isApplicableMatch };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassImplementsInterface_1_1_performtransformation_blackBBBBBBBFBB(
			ClassDeclaration eClassDeclaration, TypeToTAbstractType eSuperInterfaceToTSuperInterface, TClass tClass,
			TInterface tSuperInterface, TypeAccess eTypeAccess, TypeToTAbstractType eClassDeclarationToTClass,
			Type eSuperInterface, ClassImplementsInterface _this, IsApplicableMatch isApplicableMatch) {
		if (!eClassDeclaration.equals(eSuperInterface)) {
			if (!eClassDeclarationToTClass.equals(eSuperInterfaceToTSuperInterface)) {
				for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
					if (tmpCsp instanceof CSP) {
						CSP csp = (CSP) tmpCsp;
						return new Object[] { eClassDeclaration, eSuperInterfaceToTSuperInterface, tClass,
								tSuperInterface, eTypeAccess, eClassDeclarationToTClass, eSuperInterface, csp, _this,
								isApplicableMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassImplementsInterface_1_1_performtransformation_bindingAndBlackFFFFFFFFBB(
			ClassImplementsInterface _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_ClassImplementsInterface_1_1_performtransformation_binding = pattern_ClassImplementsInterface_1_1_performtransformation_bindingFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_ClassImplementsInterface_1_1_performtransformation_binding != null) {
			ClassDeclaration eClassDeclaration = (ClassDeclaration) result_pattern_ClassImplementsInterface_1_1_performtransformation_binding[0];
			TypeToTAbstractType eSuperInterfaceToTSuperInterface = (TypeToTAbstractType) result_pattern_ClassImplementsInterface_1_1_performtransformation_binding[1];
			TClass tClass = (TClass) result_pattern_ClassImplementsInterface_1_1_performtransformation_binding[2];
			TInterface tSuperInterface = (TInterface) result_pattern_ClassImplementsInterface_1_1_performtransformation_binding[3];
			TypeAccess eTypeAccess = (TypeAccess) result_pattern_ClassImplementsInterface_1_1_performtransformation_binding[4];
			TypeToTAbstractType eClassDeclarationToTClass = (TypeToTAbstractType) result_pattern_ClassImplementsInterface_1_1_performtransformation_binding[5];
			Type eSuperInterface = (Type) result_pattern_ClassImplementsInterface_1_1_performtransformation_binding[6];

			Object[] result_pattern_ClassImplementsInterface_1_1_performtransformation_black = pattern_ClassImplementsInterface_1_1_performtransformation_blackBBBBBBBFBB(
					eClassDeclaration, eSuperInterfaceToTSuperInterface, tClass, tSuperInterface, eTypeAccess,
					eClassDeclarationToTClass, eSuperInterface, _this, isApplicableMatch);
			if (result_pattern_ClassImplementsInterface_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_ClassImplementsInterface_1_1_performtransformation_black[7];

				return new Object[] { eClassDeclaration, eSuperInterfaceToTSuperInterface, tClass, tSuperInterface,
						eTypeAccess, eClassDeclarationToTClass, eSuperInterface, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassImplementsInterface_1_1_performtransformation_greenBB(TClass tClass,
			TInterface tSuperInterface) {
		tSuperInterface.getImplementedBy().add(tClass);
		return new Object[] { tClass, tSuperInterface };
	}

	public static final Object[] pattern_ClassImplementsInterface_1_2_collecttranslatedelements_blackB(
			TypeAccess eTypeAccess) {
		return new Object[] { eTypeAccess };
	}

	public static final Object[] pattern_ClassImplementsInterface_1_2_collecttranslatedelements_greenFB(
			TypeAccess eTypeAccess) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(eTypeAccess);
		return new Object[] { ruleresult, eTypeAccess };
	}

	public static final Object[] pattern_ClassImplementsInterface_1_3_bookkeepingforedges_blackBBBBBBBB(
			PerformRuleResult ruleresult, EObject eClassDeclaration, EObject eSuperInterfaceToTSuperInterface,
			EObject tClass, EObject tSuperInterface, EObject eTypeAccess, EObject eClassDeclarationToTClass,
			EObject eSuperInterface) {
		if (!eClassDeclaration.equals(eSuperInterfaceToTSuperInterface)) {
			if (!eClassDeclaration.equals(tClass)) {
				if (!eClassDeclaration.equals(tSuperInterface)) {
					if (!eClassDeclaration.equals(eTypeAccess)) {
						if (!eClassDeclaration.equals(eClassDeclarationToTClass)) {
							if (!eClassDeclaration.equals(eSuperInterface)) {
								if (!eSuperInterfaceToTSuperInterface.equals(tClass)) {
									if (!eSuperInterfaceToTSuperInterface.equals(tSuperInterface)) {
										if (!eSuperInterfaceToTSuperInterface.equals(eTypeAccess)) {
											if (!tClass.equals(tSuperInterface)) {
												if (!eTypeAccess.equals(tClass)) {
													if (!eTypeAccess.equals(tSuperInterface)) {
														if (!eClassDeclarationToTClass
																.equals(eSuperInterfaceToTSuperInterface)) {
															if (!eClassDeclarationToTClass.equals(tClass)) {
																if (!eClassDeclarationToTClass
																		.equals(tSuperInterface)) {
																	if (!eClassDeclarationToTClass
																			.equals(eTypeAccess)) {
																		if (!eClassDeclarationToTClass
																				.equals(eSuperInterface)) {
																			if (!eSuperInterface.equals(
																					eSuperInterfaceToTSuperInterface)) {
																				if (!eSuperInterface.equals(tClass)) {
																					if (!eSuperInterface
																							.equals(tSuperInterface)) {
																						if (!eSuperInterface
																								.equals(eTypeAccess)) {
																							return new Object[] {
																									ruleresult,
																									eClassDeclaration,
																									eSuperInterfaceToTSuperInterface,
																									tClass,
																									tSuperInterface,
																									eTypeAccess,
																									eClassDeclarationToTClass,
																									eSuperInterface };
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_ClassImplementsInterface_1_3_bookkeepingforedges_greenBBBBBBFFFFF(
			PerformRuleResult ruleresult, EObject eClassDeclaration, EObject tClass, EObject tSuperInterface,
			EObject eTypeAccess, EObject eSuperInterface) {
		EMoflonEdge eTypeAccess__eSuperInterface____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eSuperInterface__eTypeAccess____usagesInTypeAccess = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eClassDeclaration__eTypeAccess____superInterfaces = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSuperInterface__tClass____implementedBy = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tClass__tSuperInterface____implements = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "ClassImplementsInterface";
		String eTypeAccess__eSuperInterface____type_name_prime = "type";
		String eSuperInterface__eTypeAccess____usagesInTypeAccess_name_prime = "usagesInTypeAccess";
		String eClassDeclaration__eTypeAccess____superInterfaces_name_prime = "superInterfaces";
		String tSuperInterface__tClass____implementedBy_name_prime = "implementedBy";
		String tClass__tSuperInterface____implements_name_prime = "implements";
		eTypeAccess__eSuperInterface____type.setSrc(eTypeAccess);
		eTypeAccess__eSuperInterface____type.setTrg(eSuperInterface);
		ruleresult.getTranslatedEdges().add(eTypeAccess__eSuperInterface____type);
		eSuperInterface__eTypeAccess____usagesInTypeAccess.setSrc(eSuperInterface);
		eSuperInterface__eTypeAccess____usagesInTypeAccess.setTrg(eTypeAccess);
		ruleresult.getTranslatedEdges().add(eSuperInterface__eTypeAccess____usagesInTypeAccess);
		eClassDeclaration__eTypeAccess____superInterfaces.setSrc(eClassDeclaration);
		eClassDeclaration__eTypeAccess____superInterfaces.setTrg(eTypeAccess);
		ruleresult.getTranslatedEdges().add(eClassDeclaration__eTypeAccess____superInterfaces);
		tSuperInterface__tClass____implementedBy.setSrc(tSuperInterface);
		tSuperInterface__tClass____implementedBy.setTrg(tClass);
		ruleresult.getCreatedEdges().add(tSuperInterface__tClass____implementedBy);
		tClass__tSuperInterface____implements.setSrc(tClass);
		tClass__tSuperInterface____implements.setTrg(tSuperInterface);
		ruleresult.getCreatedEdges().add(tClass__tSuperInterface____implements);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		eTypeAccess__eSuperInterface____type.setName(eTypeAccess__eSuperInterface____type_name_prime);
		eSuperInterface__eTypeAccess____usagesInTypeAccess
				.setName(eSuperInterface__eTypeAccess____usagesInTypeAccess_name_prime);
		eClassDeclaration__eTypeAccess____superInterfaces
				.setName(eClassDeclaration__eTypeAccess____superInterfaces_name_prime);
		tSuperInterface__tClass____implementedBy.setName(tSuperInterface__tClass____implementedBy_name_prime);
		tClass__tSuperInterface____implements.setName(tClass__tSuperInterface____implements_name_prime);
		return new Object[] { ruleresult, eClassDeclaration, tClass, tSuperInterface, eTypeAccess, eSuperInterface,
				eTypeAccess__eSuperInterface____type, eSuperInterface__eTypeAccess____usagesInTypeAccess,
				eClassDeclaration__eTypeAccess____superInterfaces, tSuperInterface__tClass____implementedBy,
				tClass__tSuperInterface____implements };
	}

	public static final void pattern_ClassImplementsInterface_1_5_registerobjects_expressionBBBBBBBBB(
			ClassImplementsInterface _this, PerformRuleResult ruleresult, EObject eClassDeclaration,
			EObject eSuperInterfaceToTSuperInterface, EObject tClass, EObject tSuperInterface, EObject eTypeAccess,
			EObject eClassDeclarationToTClass, EObject eSuperInterface) {
		_this.registerObjects_FWD(ruleresult, eClassDeclaration, eSuperInterfaceToTSuperInterface, tClass,
				tSuperInterface, eTypeAccess, eClassDeclarationToTClass, eSuperInterface);

	}

	public static final PerformRuleResult pattern_ClassImplementsInterface_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ClassImplementsInterface_2_1_preparereturnvalue_bindingFB(
			ClassImplementsInterface _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ClassImplementsInterface_2_1_preparereturnvalue_blackFBB(EClass eClass,
			ClassImplementsInterface _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ClassImplementsInterface_2_1_preparereturnvalue_bindingAndBlackFFB(
			ClassImplementsInterface _this) {
		Object[] result_pattern_ClassImplementsInterface_2_1_preparereturnvalue_binding = pattern_ClassImplementsInterface_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_ClassImplementsInterface_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_ClassImplementsInterface_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_ClassImplementsInterface_2_1_preparereturnvalue_black = pattern_ClassImplementsInterface_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_ClassImplementsInterface_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_ClassImplementsInterface_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassImplementsInterface_2_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "ClassImplementsInterface";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_ClassImplementsInterface_2_2_corematch_bindingFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("eClassDeclaration");
		EObject _localVariable_1 = match.getObject("eTypeAccess");
		EObject _localVariable_2 = match.getObject("eSuperInterface");
		EObject tmpEClassDeclaration = _localVariable_0;
		EObject tmpETypeAccess = _localVariable_1;
		EObject tmpESuperInterface = _localVariable_2;
		if (tmpEClassDeclaration instanceof ClassDeclaration) {
			ClassDeclaration eClassDeclaration = (ClassDeclaration) tmpEClassDeclaration;
			if (tmpETypeAccess instanceof TypeAccess) {
				TypeAccess eTypeAccess = (TypeAccess) tmpETypeAccess;
				if (tmpESuperInterface instanceof Type) {
					Type eSuperInterface = (Type) tmpESuperInterface;
					return new Object[] { eClassDeclaration, eTypeAccess, eSuperInterface, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ClassImplementsInterface_2_2_corematch_blackBFFFBFBB(
			ClassDeclaration eClassDeclaration, TypeAccess eTypeAccess, Type eSuperInterface, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!eClassDeclaration.equals(eSuperInterface)) {
			for (TypeToTAbstractType eSuperInterfaceToTSuperInterface : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(eSuperInterface, TypeToTAbstractType.class, "source")) {
				TAbstractType tmpTSuperInterface = eSuperInterfaceToTSuperInterface.getTarget();
				if (tmpTSuperInterface instanceof TInterface) {
					TInterface tSuperInterface = (TInterface) tmpTSuperInterface;
					for (TypeToTAbstractType eClassDeclarationToTClass : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(eClassDeclaration, TypeToTAbstractType.class, "source")) {
						if (!eClassDeclarationToTClass.equals(eSuperInterfaceToTSuperInterface)) {
							TAbstractType tmpTClass = eClassDeclarationToTClass.getTarget();
							if (tmpTClass instanceof TClass) {
								TClass tClass = (TClass) tmpTClass;
								_result.add(new Object[] { eClassDeclaration, eSuperInterfaceToTSuperInterface, tClass,
										tSuperInterface, eTypeAccess, eClassDeclarationToTClass, eSuperInterface,
										match });
							}

						}
					}
				}

			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_ClassImplementsInterface_2_3_findcontext_blackBBBBBBB(
			ClassDeclaration eClassDeclaration, TypeToTAbstractType eSuperInterfaceToTSuperInterface, TClass tClass,
			TInterface tSuperInterface, TypeAccess eTypeAccess, TypeToTAbstractType eClassDeclarationToTClass,
			Type eSuperInterface) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!eClassDeclaration.equals(eSuperInterface)) {
			if (!eClassDeclarationToTClass.equals(eSuperInterfaceToTSuperInterface)) {
				if (tSuperInterface.equals(eSuperInterfaceToTSuperInterface.getTarget())) {
					if (tClass.equals(eClassDeclarationToTClass.getTarget())) {
						if (eSuperInterface.equals(eTypeAccess.getType())) {
							if (eClassDeclaration.getSuperInterfaces().contains(eTypeAccess)) {
								if (eSuperInterface.equals(eSuperInterfaceToTSuperInterface.getSource())) {
									if (eClassDeclaration.equals(eClassDeclarationToTClass.getSource())) {
										_result.add(new Object[] { eClassDeclaration, eSuperInterfaceToTSuperInterface,
												tClass, tSuperInterface, eTypeAccess, eClassDeclarationToTClass,
												eSuperInterface });
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

	public static final Object[] pattern_ClassImplementsInterface_2_3_findcontext_greenBBBBBBBFFFFFFFF(
			ClassDeclaration eClassDeclaration, TypeToTAbstractType eSuperInterfaceToTSuperInterface, TClass tClass,
			TInterface tSuperInterface, TypeAccess eTypeAccess, TypeToTAbstractType eClassDeclarationToTClass,
			Type eSuperInterface) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge eSuperInterfaceToTSuperInterface__tSuperInterface____target = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge eClassDeclarationToTClass__tClass____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eTypeAccess__eSuperInterface____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eSuperInterface__eTypeAccess____usagesInTypeAccess = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eClassDeclaration__eTypeAccess____superInterfaces = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eSuperInterfaceToTSuperInterface__eSuperInterface____source = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge eClassDeclarationToTClass__eClassDeclaration____source = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String eSuperInterfaceToTSuperInterface__tSuperInterface____target_name_prime = "target";
		String eClassDeclarationToTClass__tClass____target_name_prime = "target";
		String eTypeAccess__eSuperInterface____type_name_prime = "type";
		String eSuperInterface__eTypeAccess____usagesInTypeAccess_name_prime = "usagesInTypeAccess";
		String eClassDeclaration__eTypeAccess____superInterfaces_name_prime = "superInterfaces";
		String eSuperInterfaceToTSuperInterface__eSuperInterface____source_name_prime = "source";
		String eClassDeclarationToTClass__eClassDeclaration____source_name_prime = "source";
		isApplicableMatch.getAllContextElements().add(eClassDeclaration);
		isApplicableMatch.getAllContextElements().add(eSuperInterfaceToTSuperInterface);
		isApplicableMatch.getAllContextElements().add(tClass);
		isApplicableMatch.getAllContextElements().add(tSuperInterface);
		isApplicableMatch.getAllContextElements().add(eTypeAccess);
		isApplicableMatch.getAllContextElements().add(eClassDeclarationToTClass);
		isApplicableMatch.getAllContextElements().add(eSuperInterface);
		eSuperInterfaceToTSuperInterface__tSuperInterface____target.setSrc(eSuperInterfaceToTSuperInterface);
		eSuperInterfaceToTSuperInterface__tSuperInterface____target.setTrg(tSuperInterface);
		isApplicableMatch.getAllContextElements().add(eSuperInterfaceToTSuperInterface__tSuperInterface____target);
		eClassDeclarationToTClass__tClass____target.setSrc(eClassDeclarationToTClass);
		eClassDeclarationToTClass__tClass____target.setTrg(tClass);
		isApplicableMatch.getAllContextElements().add(eClassDeclarationToTClass__tClass____target);
		eTypeAccess__eSuperInterface____type.setSrc(eTypeAccess);
		eTypeAccess__eSuperInterface____type.setTrg(eSuperInterface);
		isApplicableMatch.getAllContextElements().add(eTypeAccess__eSuperInterface____type);
		eSuperInterface__eTypeAccess____usagesInTypeAccess.setSrc(eSuperInterface);
		eSuperInterface__eTypeAccess____usagesInTypeAccess.setTrg(eTypeAccess);
		isApplicableMatch.getAllContextElements().add(eSuperInterface__eTypeAccess____usagesInTypeAccess);
		eClassDeclaration__eTypeAccess____superInterfaces.setSrc(eClassDeclaration);
		eClassDeclaration__eTypeAccess____superInterfaces.setTrg(eTypeAccess);
		isApplicableMatch.getAllContextElements().add(eClassDeclaration__eTypeAccess____superInterfaces);
		eSuperInterfaceToTSuperInterface__eSuperInterface____source.setSrc(eSuperInterfaceToTSuperInterface);
		eSuperInterfaceToTSuperInterface__eSuperInterface____source.setTrg(eSuperInterface);
		isApplicableMatch.getAllContextElements().add(eSuperInterfaceToTSuperInterface__eSuperInterface____source);
		eClassDeclarationToTClass__eClassDeclaration____source.setSrc(eClassDeclarationToTClass);
		eClassDeclarationToTClass__eClassDeclaration____source.setTrg(eClassDeclaration);
		isApplicableMatch.getAllContextElements().add(eClassDeclarationToTClass__eClassDeclaration____source);
		eSuperInterfaceToTSuperInterface__tSuperInterface____target
				.setName(eSuperInterfaceToTSuperInterface__tSuperInterface____target_name_prime);
		eClassDeclarationToTClass__tClass____target.setName(eClassDeclarationToTClass__tClass____target_name_prime);
		eTypeAccess__eSuperInterface____type.setName(eTypeAccess__eSuperInterface____type_name_prime);
		eSuperInterface__eTypeAccess____usagesInTypeAccess
				.setName(eSuperInterface__eTypeAccess____usagesInTypeAccess_name_prime);
		eClassDeclaration__eTypeAccess____superInterfaces
				.setName(eClassDeclaration__eTypeAccess____superInterfaces_name_prime);
		eSuperInterfaceToTSuperInterface__eSuperInterface____source
				.setName(eSuperInterfaceToTSuperInterface__eSuperInterface____source_name_prime);
		eClassDeclarationToTClass__eClassDeclaration____source
				.setName(eClassDeclarationToTClass__eClassDeclaration____source_name_prime);
		return new Object[] { eClassDeclaration, eSuperInterfaceToTSuperInterface, tClass, tSuperInterface, eTypeAccess,
				eClassDeclarationToTClass, eSuperInterface, isApplicableMatch,
				eSuperInterfaceToTSuperInterface__tSuperInterface____target,
				eClassDeclarationToTClass__tClass____target, eTypeAccess__eSuperInterface____type,
				eSuperInterface__eTypeAccess____usagesInTypeAccess, eClassDeclaration__eTypeAccess____superInterfaces,
				eSuperInterfaceToTSuperInterface__eSuperInterface____source,
				eClassDeclarationToTClass__eClassDeclaration____source };
	}

	public static final Object[] pattern_ClassImplementsInterface_2_4_solveCSP_bindingFBBBBBBBBB(
			ClassImplementsInterface _this, IsApplicableMatch isApplicableMatch, ClassDeclaration eClassDeclaration,
			TypeToTAbstractType eSuperInterfaceToTSuperInterface, TClass tClass, TInterface tSuperInterface,
			TypeAccess eTypeAccess, TypeToTAbstractType eClassDeclarationToTClass, Type eSuperInterface) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, eClassDeclaration,
				eSuperInterfaceToTSuperInterface, tClass, tSuperInterface, eTypeAccess, eClassDeclarationToTClass,
				eSuperInterface);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, eClassDeclaration, eSuperInterfaceToTSuperInterface,
					tClass, tSuperInterface, eTypeAccess, eClassDeclarationToTClass, eSuperInterface };
		}
		return null;
	}

	public static final Object[] pattern_ClassImplementsInterface_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ClassImplementsInterface_2_4_solveCSP_bindingAndBlackFBBBBBBBBB(
			ClassImplementsInterface _this, IsApplicableMatch isApplicableMatch, ClassDeclaration eClassDeclaration,
			TypeToTAbstractType eSuperInterfaceToTSuperInterface, TClass tClass, TInterface tSuperInterface,
			TypeAccess eTypeAccess, TypeToTAbstractType eClassDeclarationToTClass, Type eSuperInterface) {
		Object[] result_pattern_ClassImplementsInterface_2_4_solveCSP_binding = pattern_ClassImplementsInterface_2_4_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, eClassDeclaration, eSuperInterfaceToTSuperInterface, tClass, tSuperInterface,
				eTypeAccess, eClassDeclarationToTClass, eSuperInterface);
		if (result_pattern_ClassImplementsInterface_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_ClassImplementsInterface_2_4_solveCSP_binding[0];

			Object[] result_pattern_ClassImplementsInterface_2_4_solveCSP_black = pattern_ClassImplementsInterface_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_ClassImplementsInterface_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, eClassDeclaration,
						eSuperInterfaceToTSuperInterface, tClass, tSuperInterface, eTypeAccess,
						eClassDeclarationToTClass, eSuperInterface };
			}
		}
		return null;
	}

	public static final boolean pattern_ClassImplementsInterface_2_5_checkCSP_expressionFBB(
			ClassImplementsInterface _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ClassImplementsInterface_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_ClassImplementsInterface_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "ClassImplementsInterface";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_ClassImplementsInterface_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ClassImplementsInterface_10_1_initialbindings_blackBBBB(
			ClassImplementsInterface _this, Match match, TClass tClass, TInterface tSuperInterface) {
		return new Object[] { _this, match, tClass, tSuperInterface };
	}

	public static final Object[] pattern_ClassImplementsInterface_10_2_SolveCSP_bindingFBBBB(
			ClassImplementsInterface _this, Match match, TClass tClass, TInterface tSuperInterface) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, tClass, tSuperInterface);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, tClass, tSuperInterface };
		}
		return null;
	}

	public static final Object[] pattern_ClassImplementsInterface_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ClassImplementsInterface_10_2_SolveCSP_bindingAndBlackFBBBB(
			ClassImplementsInterface _this, Match match, TClass tClass, TInterface tSuperInterface) {
		Object[] result_pattern_ClassImplementsInterface_10_2_SolveCSP_binding = pattern_ClassImplementsInterface_10_2_SolveCSP_bindingFBBBB(
				_this, match, tClass, tSuperInterface);
		if (result_pattern_ClassImplementsInterface_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_ClassImplementsInterface_10_2_SolveCSP_binding[0];

			Object[] result_pattern_ClassImplementsInterface_10_2_SolveCSP_black = pattern_ClassImplementsInterface_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_ClassImplementsInterface_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, tClass, tSuperInterface };
			}
		}
		return null;
	}

	public static final boolean pattern_ClassImplementsInterface_10_3_CheckCSP_expressionFBB(
			ClassImplementsInterface _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ClassImplementsInterface_10_4_collectelementstobetranslated_blackBBB(
			Match match, TClass tClass, TInterface tSuperInterface) {
		return new Object[] { match, tClass, tSuperInterface };
	}

	public static final Object[] pattern_ClassImplementsInterface_10_4_collectelementstobetranslated_greenBBBFF(
			Match match, TClass tClass, TInterface tSuperInterface) {
		EMoflonEdge tSuperInterface__tClass____implementedBy = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tClass__tSuperInterface____implements = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String tSuperInterface__tClass____implementedBy_name_prime = "implementedBy";
		String tClass__tSuperInterface____implements_name_prime = "implements";
		tSuperInterface__tClass____implementedBy.setSrc(tSuperInterface);
		tSuperInterface__tClass____implementedBy.setTrg(tClass);
		match.getToBeTranslatedEdges().add(tSuperInterface__tClass____implementedBy);
		tClass__tSuperInterface____implements.setSrc(tClass);
		tClass__tSuperInterface____implements.setTrg(tSuperInterface);
		match.getToBeTranslatedEdges().add(tClass__tSuperInterface____implements);
		tSuperInterface__tClass____implementedBy.setName(tSuperInterface__tClass____implementedBy_name_prime);
		tClass__tSuperInterface____implements.setName(tClass__tSuperInterface____implements_name_prime);
		return new Object[] { match, tClass, tSuperInterface, tSuperInterface__tClass____implementedBy,
				tClass__tSuperInterface____implements };
	}

	public static final Object[] pattern_ClassImplementsInterface_10_5_collectcontextelements_blackBBB(Match match,
			TClass tClass, TInterface tSuperInterface) {
		return new Object[] { match, tClass, tSuperInterface };
	}

	public static final Object[] pattern_ClassImplementsInterface_10_5_collectcontextelements_greenBBB(Match match,
			TClass tClass, TInterface tSuperInterface) {
		match.getContextNodes().add(tClass);
		match.getContextNodes().add(tSuperInterface);
		return new Object[] { match, tClass, tSuperInterface };
	}

	public static final void pattern_ClassImplementsInterface_10_6_registerobjectstomatch_expressionBBBB(
			ClassImplementsInterface _this, Match match, TClass tClass, TInterface tSuperInterface) {
		_this.registerObjectsToMatch_BWD(match, tClass, tSuperInterface);

	}

	public static final boolean pattern_ClassImplementsInterface_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ClassImplementsInterface_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_ClassImplementsInterface_11_1_performtransformation_bindingFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("eClassDeclaration");
		EObject _localVariable_1 = isApplicableMatch.getObject("eSuperInterfaceToTSuperInterface");
		EObject _localVariable_2 = isApplicableMatch.getObject("tClass");
		EObject _localVariable_3 = isApplicableMatch.getObject("tSuperInterface");
		EObject _localVariable_4 = isApplicableMatch.getObject("eClassDeclarationToTClass");
		EObject _localVariable_5 = isApplicableMatch.getObject("eSuperInterface");
		EObject tmpEClassDeclaration = _localVariable_0;
		EObject tmpESuperInterfaceToTSuperInterface = _localVariable_1;
		EObject tmpTClass = _localVariable_2;
		EObject tmpTSuperInterface = _localVariable_3;
		EObject tmpEClassDeclarationToTClass = _localVariable_4;
		EObject tmpESuperInterface = _localVariable_5;
		if (tmpEClassDeclaration instanceof ClassDeclaration) {
			ClassDeclaration eClassDeclaration = (ClassDeclaration) tmpEClassDeclaration;
			if (tmpESuperInterfaceToTSuperInterface instanceof TypeToTAbstractType) {
				TypeToTAbstractType eSuperInterfaceToTSuperInterface = (TypeToTAbstractType) tmpESuperInterfaceToTSuperInterface;
				if (tmpTClass instanceof TClass) {
					TClass tClass = (TClass) tmpTClass;
					if (tmpTSuperInterface instanceof TInterface) {
						TInterface tSuperInterface = (TInterface) tmpTSuperInterface;
						if (tmpEClassDeclarationToTClass instanceof TypeToTAbstractType) {
							TypeToTAbstractType eClassDeclarationToTClass = (TypeToTAbstractType) tmpEClassDeclarationToTClass;
							if (tmpESuperInterface instanceof Type) {
								Type eSuperInterface = (Type) tmpESuperInterface;
								return new Object[] { eClassDeclaration, eSuperInterfaceToTSuperInterface, tClass,
										tSuperInterface, eClassDeclarationToTClass, eSuperInterface,
										isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassImplementsInterface_11_1_performtransformation_blackBBBBBBFBB(
			ClassDeclaration eClassDeclaration, TypeToTAbstractType eSuperInterfaceToTSuperInterface, TClass tClass,
			TInterface tSuperInterface, TypeToTAbstractType eClassDeclarationToTClass, Type eSuperInterface,
			ClassImplementsInterface _this, IsApplicableMatch isApplicableMatch) {
		if (!eClassDeclaration.equals(eSuperInterface)) {
			if (!eClassDeclarationToTClass.equals(eSuperInterfaceToTSuperInterface)) {
				for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
					if (tmpCsp instanceof CSP) {
						CSP csp = (CSP) tmpCsp;
						return new Object[] { eClassDeclaration, eSuperInterfaceToTSuperInterface, tClass,
								tSuperInterface, eClassDeclarationToTClass, eSuperInterface, csp, _this,
								isApplicableMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassImplementsInterface_11_1_performtransformation_bindingAndBlackFFFFFFFBB(
			ClassImplementsInterface _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_ClassImplementsInterface_11_1_performtransformation_binding = pattern_ClassImplementsInterface_11_1_performtransformation_bindingFFFFFFB(
				isApplicableMatch);
		if (result_pattern_ClassImplementsInterface_11_1_performtransformation_binding != null) {
			ClassDeclaration eClassDeclaration = (ClassDeclaration) result_pattern_ClassImplementsInterface_11_1_performtransformation_binding[0];
			TypeToTAbstractType eSuperInterfaceToTSuperInterface = (TypeToTAbstractType) result_pattern_ClassImplementsInterface_11_1_performtransformation_binding[1];
			TClass tClass = (TClass) result_pattern_ClassImplementsInterface_11_1_performtransformation_binding[2];
			TInterface tSuperInterface = (TInterface) result_pattern_ClassImplementsInterface_11_1_performtransformation_binding[3];
			TypeToTAbstractType eClassDeclarationToTClass = (TypeToTAbstractType) result_pattern_ClassImplementsInterface_11_1_performtransformation_binding[4];
			Type eSuperInterface = (Type) result_pattern_ClassImplementsInterface_11_1_performtransformation_binding[5];

			Object[] result_pattern_ClassImplementsInterface_11_1_performtransformation_black = pattern_ClassImplementsInterface_11_1_performtransformation_blackBBBBBBFBB(
					eClassDeclaration, eSuperInterfaceToTSuperInterface, tClass, tSuperInterface,
					eClassDeclarationToTClass, eSuperInterface, _this, isApplicableMatch);
			if (result_pattern_ClassImplementsInterface_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_ClassImplementsInterface_11_1_performtransformation_black[6];

				return new Object[] { eClassDeclaration, eSuperInterfaceToTSuperInterface, tClass, tSuperInterface,
						eClassDeclarationToTClass, eSuperInterface, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassImplementsInterface_11_1_performtransformation_greenBFB(
			ClassDeclaration eClassDeclaration, Type eSuperInterface) {
		TypeAccess eTypeAccess = JavaFactory.eINSTANCE.createTypeAccess();
		eTypeAccess.setType(eSuperInterface);
		eClassDeclaration.getSuperInterfaces().add(eTypeAccess);
		return new Object[] { eClassDeclaration, eTypeAccess, eSuperInterface };
	}

	public static final Object[] pattern_ClassImplementsInterface_11_2_collecttranslatedelements_blackB(
			TypeAccess eTypeAccess) {
		return new Object[] { eTypeAccess };
	}

	public static final Object[] pattern_ClassImplementsInterface_11_2_collecttranslatedelements_greenFB(
			TypeAccess eTypeAccess) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(eTypeAccess);
		return new Object[] { ruleresult, eTypeAccess };
	}

	public static final Object[] pattern_ClassImplementsInterface_11_3_bookkeepingforedges_blackBBBBBBBB(
			PerformRuleResult ruleresult, EObject eClassDeclaration, EObject eSuperInterfaceToTSuperInterface,
			EObject tClass, EObject tSuperInterface, EObject eTypeAccess, EObject eClassDeclarationToTClass,
			EObject eSuperInterface) {
		if (!eClassDeclaration.equals(eSuperInterfaceToTSuperInterface)) {
			if (!eClassDeclaration.equals(tClass)) {
				if (!eClassDeclaration.equals(tSuperInterface)) {
					if (!eClassDeclaration.equals(eTypeAccess)) {
						if (!eClassDeclaration.equals(eClassDeclarationToTClass)) {
							if (!eClassDeclaration.equals(eSuperInterface)) {
								if (!eSuperInterfaceToTSuperInterface.equals(tClass)) {
									if (!eSuperInterfaceToTSuperInterface.equals(tSuperInterface)) {
										if (!eSuperInterfaceToTSuperInterface.equals(eTypeAccess)) {
											if (!tClass.equals(tSuperInterface)) {
												if (!eTypeAccess.equals(tClass)) {
													if (!eTypeAccess.equals(tSuperInterface)) {
														if (!eClassDeclarationToTClass
																.equals(eSuperInterfaceToTSuperInterface)) {
															if (!eClassDeclarationToTClass.equals(tClass)) {
																if (!eClassDeclarationToTClass
																		.equals(tSuperInterface)) {
																	if (!eClassDeclarationToTClass
																			.equals(eTypeAccess)) {
																		if (!eClassDeclarationToTClass
																				.equals(eSuperInterface)) {
																			if (!eSuperInterface.equals(
																					eSuperInterfaceToTSuperInterface)) {
																				if (!eSuperInterface.equals(tClass)) {
																					if (!eSuperInterface
																							.equals(tSuperInterface)) {
																						if (!eSuperInterface
																								.equals(eTypeAccess)) {
																							return new Object[] {
																									ruleresult,
																									eClassDeclaration,
																									eSuperInterfaceToTSuperInterface,
																									tClass,
																									tSuperInterface,
																									eTypeAccess,
																									eClassDeclarationToTClass,
																									eSuperInterface };
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_ClassImplementsInterface_11_3_bookkeepingforedges_greenBBBBBBFFFFF(
			PerformRuleResult ruleresult, EObject eClassDeclaration, EObject tClass, EObject tSuperInterface,
			EObject eTypeAccess, EObject eSuperInterface) {
		EMoflonEdge eTypeAccess__eSuperInterface____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eSuperInterface__eTypeAccess____usagesInTypeAccess = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eClassDeclaration__eTypeAccess____superInterfaces = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSuperInterface__tClass____implementedBy = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tClass__tSuperInterface____implements = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "ClassImplementsInterface";
		String eTypeAccess__eSuperInterface____type_name_prime = "type";
		String eSuperInterface__eTypeAccess____usagesInTypeAccess_name_prime = "usagesInTypeAccess";
		String eClassDeclaration__eTypeAccess____superInterfaces_name_prime = "superInterfaces";
		String tSuperInterface__tClass____implementedBy_name_prime = "implementedBy";
		String tClass__tSuperInterface____implements_name_prime = "implements";
		eTypeAccess__eSuperInterface____type.setSrc(eTypeAccess);
		eTypeAccess__eSuperInterface____type.setTrg(eSuperInterface);
		ruleresult.getCreatedEdges().add(eTypeAccess__eSuperInterface____type);
		eSuperInterface__eTypeAccess____usagesInTypeAccess.setSrc(eSuperInterface);
		eSuperInterface__eTypeAccess____usagesInTypeAccess.setTrg(eTypeAccess);
		ruleresult.getCreatedEdges().add(eSuperInterface__eTypeAccess____usagesInTypeAccess);
		eClassDeclaration__eTypeAccess____superInterfaces.setSrc(eClassDeclaration);
		eClassDeclaration__eTypeAccess____superInterfaces.setTrg(eTypeAccess);
		ruleresult.getCreatedEdges().add(eClassDeclaration__eTypeAccess____superInterfaces);
		tSuperInterface__tClass____implementedBy.setSrc(tSuperInterface);
		tSuperInterface__tClass____implementedBy.setTrg(tClass);
		ruleresult.getTranslatedEdges().add(tSuperInterface__tClass____implementedBy);
		tClass__tSuperInterface____implements.setSrc(tClass);
		tClass__tSuperInterface____implements.setTrg(tSuperInterface);
		ruleresult.getTranslatedEdges().add(tClass__tSuperInterface____implements);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		eTypeAccess__eSuperInterface____type.setName(eTypeAccess__eSuperInterface____type_name_prime);
		eSuperInterface__eTypeAccess____usagesInTypeAccess
				.setName(eSuperInterface__eTypeAccess____usagesInTypeAccess_name_prime);
		eClassDeclaration__eTypeAccess____superInterfaces
				.setName(eClassDeclaration__eTypeAccess____superInterfaces_name_prime);
		tSuperInterface__tClass____implementedBy.setName(tSuperInterface__tClass____implementedBy_name_prime);
		tClass__tSuperInterface____implements.setName(tClass__tSuperInterface____implements_name_prime);
		return new Object[] { ruleresult, eClassDeclaration, tClass, tSuperInterface, eTypeAccess, eSuperInterface,
				eTypeAccess__eSuperInterface____type, eSuperInterface__eTypeAccess____usagesInTypeAccess,
				eClassDeclaration__eTypeAccess____superInterfaces, tSuperInterface__tClass____implementedBy,
				tClass__tSuperInterface____implements };
	}

	public static final void pattern_ClassImplementsInterface_11_5_registerobjects_expressionBBBBBBBBB(
			ClassImplementsInterface _this, PerformRuleResult ruleresult, EObject eClassDeclaration,
			EObject eSuperInterfaceToTSuperInterface, EObject tClass, EObject tSuperInterface, EObject eTypeAccess,
			EObject eClassDeclarationToTClass, EObject eSuperInterface) {
		_this.registerObjects_BWD(ruleresult, eClassDeclaration, eSuperInterfaceToTSuperInterface, tClass,
				tSuperInterface, eTypeAccess, eClassDeclarationToTClass, eSuperInterface);

	}

	public static final PerformRuleResult pattern_ClassImplementsInterface_11_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ClassImplementsInterface_12_1_preparereturnvalue_bindingFB(
			ClassImplementsInterface _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ClassImplementsInterface_12_1_preparereturnvalue_blackFBB(EClass eClass,
			ClassImplementsInterface _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ClassImplementsInterface_12_1_preparereturnvalue_bindingAndBlackFFB(
			ClassImplementsInterface _this) {
		Object[] result_pattern_ClassImplementsInterface_12_1_preparereturnvalue_binding = pattern_ClassImplementsInterface_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_ClassImplementsInterface_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_ClassImplementsInterface_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_ClassImplementsInterface_12_1_preparereturnvalue_black = pattern_ClassImplementsInterface_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_ClassImplementsInterface_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_ClassImplementsInterface_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassImplementsInterface_12_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "ClassImplementsInterface";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_ClassImplementsInterface_12_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("tClass");
		EObject _localVariable_1 = match.getObject("tSuperInterface");
		EObject tmpTClass = _localVariable_0;
		EObject tmpTSuperInterface = _localVariable_1;
		if (tmpTClass instanceof TClass) {
			TClass tClass = (TClass) tmpTClass;
			if (tmpTSuperInterface instanceof TInterface) {
				TInterface tSuperInterface = (TInterface) tmpTSuperInterface;
				return new Object[] { tClass, tSuperInterface, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ClassImplementsInterface_12_2_corematch_blackFFBBFFB(TClass tClass,
			TInterface tSuperInterface, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (TypeToTAbstractType eSuperInterfaceToTSuperInterface : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tSuperInterface, TypeToTAbstractType.class, "target")) {
			Type eSuperInterface = eSuperInterfaceToTSuperInterface.getSource();
			if (eSuperInterface != null) {
				for (TypeToTAbstractType eClassDeclarationToTClass : org.moflon.core.utilities.eMoflonEMFUtil
						.getOppositeReferenceTyped(tClass, TypeToTAbstractType.class, "target")) {
					if (!eClassDeclarationToTClass.equals(eSuperInterfaceToTSuperInterface)) {
						Type tmpEClassDeclaration = eClassDeclarationToTClass.getSource();
						if (tmpEClassDeclaration instanceof ClassDeclaration) {
							ClassDeclaration eClassDeclaration = (ClassDeclaration) tmpEClassDeclaration;
							if (!eClassDeclaration.equals(eSuperInterface)) {
								_result.add(new Object[] { eClassDeclaration, eSuperInterfaceToTSuperInterface, tClass,
										tSuperInterface, eClassDeclarationToTClass, eSuperInterface, match });
							}
						}

					}
				}
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_ClassImplementsInterface_12_3_findcontext_blackBBBBBB(
			ClassDeclaration eClassDeclaration, TypeToTAbstractType eSuperInterfaceToTSuperInterface, TClass tClass,
			TInterface tSuperInterface, TypeToTAbstractType eClassDeclarationToTClass, Type eSuperInterface) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!eClassDeclaration.equals(eSuperInterface)) {
			if (!eClassDeclarationToTClass.equals(eSuperInterfaceToTSuperInterface)) {
				if (tSuperInterface.equals(eSuperInterfaceToTSuperInterface.getTarget())) {
					if (tClass.equals(eClassDeclarationToTClass.getTarget())) {
						if (eSuperInterface.equals(eSuperInterfaceToTSuperInterface.getSource())) {
							if (tSuperInterface.getImplementedBy().contains(tClass)) {
								if (eClassDeclaration.equals(eClassDeclarationToTClass.getSource())) {
									_result.add(new Object[] { eClassDeclaration, eSuperInterfaceToTSuperInterface,
											tClass, tSuperInterface, eClassDeclarationToTClass, eSuperInterface });
								}
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_ClassImplementsInterface_12_3_findcontext_greenBBBBBBFFFFFFF(
			ClassDeclaration eClassDeclaration, TypeToTAbstractType eSuperInterfaceToTSuperInterface, TClass tClass,
			TInterface tSuperInterface, TypeToTAbstractType eClassDeclarationToTClass, Type eSuperInterface) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge eSuperInterfaceToTSuperInterface__tSuperInterface____target = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge eClassDeclarationToTClass__tClass____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eSuperInterfaceToTSuperInterface__eSuperInterface____source = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tSuperInterface__tClass____implementedBy = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tClass__tSuperInterface____implements = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eClassDeclarationToTClass__eClassDeclaration____source = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String eSuperInterfaceToTSuperInterface__tSuperInterface____target_name_prime = "target";
		String eClassDeclarationToTClass__tClass____target_name_prime = "target";
		String eSuperInterfaceToTSuperInterface__eSuperInterface____source_name_prime = "source";
		String tSuperInterface__tClass____implementedBy_name_prime = "implementedBy";
		String tClass__tSuperInterface____implements_name_prime = "implements";
		String eClassDeclarationToTClass__eClassDeclaration____source_name_prime = "source";
		isApplicableMatch.getAllContextElements().add(eClassDeclaration);
		isApplicableMatch.getAllContextElements().add(eSuperInterfaceToTSuperInterface);
		isApplicableMatch.getAllContextElements().add(tClass);
		isApplicableMatch.getAllContextElements().add(tSuperInterface);
		isApplicableMatch.getAllContextElements().add(eClassDeclarationToTClass);
		isApplicableMatch.getAllContextElements().add(eSuperInterface);
		eSuperInterfaceToTSuperInterface__tSuperInterface____target.setSrc(eSuperInterfaceToTSuperInterface);
		eSuperInterfaceToTSuperInterface__tSuperInterface____target.setTrg(tSuperInterface);
		isApplicableMatch.getAllContextElements().add(eSuperInterfaceToTSuperInterface__tSuperInterface____target);
		eClassDeclarationToTClass__tClass____target.setSrc(eClassDeclarationToTClass);
		eClassDeclarationToTClass__tClass____target.setTrg(tClass);
		isApplicableMatch.getAllContextElements().add(eClassDeclarationToTClass__tClass____target);
		eSuperInterfaceToTSuperInterface__eSuperInterface____source.setSrc(eSuperInterfaceToTSuperInterface);
		eSuperInterfaceToTSuperInterface__eSuperInterface____source.setTrg(eSuperInterface);
		isApplicableMatch.getAllContextElements().add(eSuperInterfaceToTSuperInterface__eSuperInterface____source);
		tSuperInterface__tClass____implementedBy.setSrc(tSuperInterface);
		tSuperInterface__tClass____implementedBy.setTrg(tClass);
		isApplicableMatch.getAllContextElements().add(tSuperInterface__tClass____implementedBy);
		tClass__tSuperInterface____implements.setSrc(tClass);
		tClass__tSuperInterface____implements.setTrg(tSuperInterface);
		isApplicableMatch.getAllContextElements().add(tClass__tSuperInterface____implements);
		eClassDeclarationToTClass__eClassDeclaration____source.setSrc(eClassDeclarationToTClass);
		eClassDeclarationToTClass__eClassDeclaration____source.setTrg(eClassDeclaration);
		isApplicableMatch.getAllContextElements().add(eClassDeclarationToTClass__eClassDeclaration____source);
		eSuperInterfaceToTSuperInterface__tSuperInterface____target
				.setName(eSuperInterfaceToTSuperInterface__tSuperInterface____target_name_prime);
		eClassDeclarationToTClass__tClass____target.setName(eClassDeclarationToTClass__tClass____target_name_prime);
		eSuperInterfaceToTSuperInterface__eSuperInterface____source
				.setName(eSuperInterfaceToTSuperInterface__eSuperInterface____source_name_prime);
		tSuperInterface__tClass____implementedBy.setName(tSuperInterface__tClass____implementedBy_name_prime);
		tClass__tSuperInterface____implements.setName(tClass__tSuperInterface____implements_name_prime);
		eClassDeclarationToTClass__eClassDeclaration____source
				.setName(eClassDeclarationToTClass__eClassDeclaration____source_name_prime);
		return new Object[] { eClassDeclaration, eSuperInterfaceToTSuperInterface, tClass, tSuperInterface,
				eClassDeclarationToTClass, eSuperInterface, isApplicableMatch,
				eSuperInterfaceToTSuperInterface__tSuperInterface____target,
				eClassDeclarationToTClass__tClass____target,
				eSuperInterfaceToTSuperInterface__eSuperInterface____source, tSuperInterface__tClass____implementedBy,
				tClass__tSuperInterface____implements, eClassDeclarationToTClass__eClassDeclaration____source };
	}

	public static final Object[] pattern_ClassImplementsInterface_12_4_solveCSP_bindingFBBBBBBBB(
			ClassImplementsInterface _this, IsApplicableMatch isApplicableMatch, ClassDeclaration eClassDeclaration,
			TypeToTAbstractType eSuperInterfaceToTSuperInterface, TClass tClass, TInterface tSuperInterface,
			TypeToTAbstractType eClassDeclarationToTClass, Type eSuperInterface) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, eClassDeclaration,
				eSuperInterfaceToTSuperInterface, tClass, tSuperInterface, eClassDeclarationToTClass, eSuperInterface);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, eClassDeclaration, eSuperInterfaceToTSuperInterface,
					tClass, tSuperInterface, eClassDeclarationToTClass, eSuperInterface };
		}
		return null;
	}

	public static final Object[] pattern_ClassImplementsInterface_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ClassImplementsInterface_12_4_solveCSP_bindingAndBlackFBBBBBBBB(
			ClassImplementsInterface _this, IsApplicableMatch isApplicableMatch, ClassDeclaration eClassDeclaration,
			TypeToTAbstractType eSuperInterfaceToTSuperInterface, TClass tClass, TInterface tSuperInterface,
			TypeToTAbstractType eClassDeclarationToTClass, Type eSuperInterface) {
		Object[] result_pattern_ClassImplementsInterface_12_4_solveCSP_binding = pattern_ClassImplementsInterface_12_4_solveCSP_bindingFBBBBBBBB(
				_this, isApplicableMatch, eClassDeclaration, eSuperInterfaceToTSuperInterface, tClass, tSuperInterface,
				eClassDeclarationToTClass, eSuperInterface);
		if (result_pattern_ClassImplementsInterface_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_ClassImplementsInterface_12_4_solveCSP_binding[0];

			Object[] result_pattern_ClassImplementsInterface_12_4_solveCSP_black = pattern_ClassImplementsInterface_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_ClassImplementsInterface_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, eClassDeclaration,
						eSuperInterfaceToTSuperInterface, tClass, tSuperInterface, eClassDeclarationToTClass,
						eSuperInterface };
			}
		}
		return null;
	}

	public static final boolean pattern_ClassImplementsInterface_12_5_checkCSP_expressionFBB(
			ClassImplementsInterface _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ClassImplementsInterface_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_ClassImplementsInterface_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "ClassImplementsInterface";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_ClassImplementsInterface_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ClassImplementsInterface_20_1_preparereturnvalue_bindingFB(
			ClassImplementsInterface _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ClassImplementsInterface_20_1_preparereturnvalue_blackFBBF(EClass __eClass,
			ClassImplementsInterface _this) {
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

	public static final Object[] pattern_ClassImplementsInterface_20_1_preparereturnvalue_bindingAndBlackFFBF(
			ClassImplementsInterface _this) {
		Object[] result_pattern_ClassImplementsInterface_20_1_preparereturnvalue_binding = pattern_ClassImplementsInterface_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_ClassImplementsInterface_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_ClassImplementsInterface_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_ClassImplementsInterface_20_1_preparereturnvalue_black = pattern_ClassImplementsInterface_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_ClassImplementsInterface_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ClassImplementsInterface_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_ClassImplementsInterface_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassImplementsInterface_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_ClassImplementsInterface_20_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_implementedBy) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpTSuperInterface = _edge_implementedBy.getSrc();
		if (tmpTSuperInterface instanceof TInterface) {
			TInterface tSuperInterface = (TInterface) tmpTSuperInterface;
			EObject tmpTClass = _edge_implementedBy.getTrg();
			if (tmpTClass instanceof TClass) {
				TClass tClass = (TClass) tmpTClass;
				if (tSuperInterface.getImplementedBy().contains(tClass)) {
					_result.add(new Object[] { tClass, tSuperInterface, _edge_implementedBy });
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_ClassImplementsInterface_20_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ClassImplementsInterface_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			ClassImplementsInterface _this, Match match, TClass tClass, TInterface tSuperInterface) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, tClass, tSuperInterface);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ClassImplementsInterface_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			ClassImplementsInterface _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ClassImplementsInterface_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_ClassImplementsInterface_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_ClassImplementsInterface_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ClassImplementsInterface_21_1_preparereturnvalue_bindingFB(
			ClassImplementsInterface _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ClassImplementsInterface_21_1_preparereturnvalue_blackFBBF(EClass __eClass,
			ClassImplementsInterface _this) {
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

	public static final Object[] pattern_ClassImplementsInterface_21_1_preparereturnvalue_bindingAndBlackFFBF(
			ClassImplementsInterface _this) {
		Object[] result_pattern_ClassImplementsInterface_21_1_preparereturnvalue_binding = pattern_ClassImplementsInterface_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_ClassImplementsInterface_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_ClassImplementsInterface_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_ClassImplementsInterface_21_1_preparereturnvalue_black = pattern_ClassImplementsInterface_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_ClassImplementsInterface_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ClassImplementsInterface_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_ClassImplementsInterface_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassImplementsInterface_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_ClassImplementsInterface_21_2_testcorematchandDECs_black_nac_0B(
			TypeAccess eTypeAccess) {
		for (Annotation __DEC_eTypeAccess_type_370339 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(eTypeAccess, Annotation.class, "type")) {
			return new Object[] { eTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_ClassImplementsInterface_21_2_testcorematchandDECs_black_nac_1BB(
			TypeAccess eTypeAccess, Type eSuperInterface) {
		for (ArrayType __DEC_eTypeAccess_elementType_76368 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(eTypeAccess, ArrayType.class, "elementType")) {
			if (!eSuperInterface.equals(__DEC_eTypeAccess_elementType_76368)) {
				return new Object[] { eTypeAccess, eSuperInterface };
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassImplementsInterface_21_2_testcorematchandDECs_black_nac_2B(
			TypeAccess eTypeAccess) {
		for (ClassInstanceCreation __DEC_eTypeAccess_type_702156 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(eTypeAccess, ClassInstanceCreation.class, "type")) {
			return new Object[] { eTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_ClassImplementsInterface_21_2_testcorematchandDECs_black_nac_3BBB(
			TypeAccess eTypeAccess, ClassDeclaration eClassDeclaration, Type eSuperInterface) {
		if (!eClassDeclaration.equals(eSuperInterface)) {
			for (ClassDeclaration __DEC_eTypeAccess_superClass_509842 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(eTypeAccess, ClassDeclaration.class, "superClass")) {
				if (!eClassDeclaration.equals(__DEC_eTypeAccess_superClass_509842)) {
					if (!eSuperInterface.equals(__DEC_eTypeAccess_superClass_509842)) {
						return new Object[] { eTypeAccess, eClassDeclaration, eSuperInterface };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassImplementsInterface_21_2_testcorematchandDECs_black_nac_4B(
			TypeAccess eTypeAccess) {
		for (MethodDeclaration __DEC_eTypeAccess_returnType_299283 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(eTypeAccess, MethodDeclaration.class, "returnType")) {
			return new Object[] { eTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_ClassImplementsInterface_21_2_testcorematchandDECs_black_nac_5BB(
			TypeAccess eTypeAccess, Type eSuperInterface) {
		for (ParameterizedType __DEC_eTypeAccess_type_221112 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(eTypeAccess, ParameterizedType.class, "type")) {
			if (!eSuperInterface.equals(__DEC_eTypeAccess_type_221112)) {
				return new Object[] { eTypeAccess, eSuperInterface };
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassImplementsInterface_21_2_testcorematchandDECs_black_nac_6B(
			TypeAccess eTypeAccess) {
		for (TypeLiteral __DEC_eTypeAccess_type_927764 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(eTypeAccess, TypeLiteral.class, "type")) {
			return new Object[] { eTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_ClassImplementsInterface_21_2_testcorematchandDECs_black_nac_7B(
			TypeAccess eTypeAccess) {
		for (AnnotationMemberValuePair __DEC_eTypeAccess_value_568733 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(eTypeAccess, AnnotationMemberValuePair.class, "value")) {
			return new Object[] { eTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_ClassImplementsInterface_21_2_testcorematchandDECs_black_nac_8BB(
			ClassDeclaration eClassDeclaration, TypeAccess eTypeAccess) {
		if (eTypeAccess.equals(eClassDeclaration.getSuperClass())) {
			return new Object[] { eClassDeclaration, eTypeAccess };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ClassImplementsInterface_21_2_testcorematchandDECs_blackFFFB(
			EMoflonEdge _edge_type) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpETypeAccess = _edge_type.getSrc();
		if (tmpETypeAccess instanceof TypeAccess) {
			TypeAccess eTypeAccess = (TypeAccess) tmpETypeAccess;
			EObject tmpESuperInterface = _edge_type.getTrg();
			if (tmpESuperInterface instanceof Type) {
				Type eSuperInterface = (Type) tmpESuperInterface;
				if (eSuperInterface.equals(eTypeAccess.getType())) {
					if (pattern_ClassImplementsInterface_21_2_testcorematchandDECs_black_nac_0B(eTypeAccess) == null) {
						if (pattern_ClassImplementsInterface_21_2_testcorematchandDECs_black_nac_2B(
								eTypeAccess) == null) {
							if (pattern_ClassImplementsInterface_21_2_testcorematchandDECs_black_nac_4B(
									eTypeAccess) == null) {
								if (pattern_ClassImplementsInterface_21_2_testcorematchandDECs_black_nac_6B(
										eTypeAccess) == null) {
									if (pattern_ClassImplementsInterface_21_2_testcorematchandDECs_black_nac_7B(
											eTypeAccess) == null) {
										if (pattern_ClassImplementsInterface_21_2_testcorematchandDECs_black_nac_1BB(
												eTypeAccess, eSuperInterface) == null) {
											if (pattern_ClassImplementsInterface_21_2_testcorematchandDECs_black_nac_5BB(
													eTypeAccess, eSuperInterface) == null) {
												for (AbstractTypeDeclaration tmpEClassDeclaration : org.moflon.core.utilities.eMoflonEMFUtil
														.getOppositeReferenceTyped(eTypeAccess,
																AbstractTypeDeclaration.class, "superInterfaces")) {
													if (tmpEClassDeclaration instanceof ClassDeclaration) {
														ClassDeclaration eClassDeclaration = (ClassDeclaration) tmpEClassDeclaration;
														if (!eClassDeclaration.equals(eSuperInterface)) {
															if (pattern_ClassImplementsInterface_21_2_testcorematchandDECs_black_nac_3BBB(
																	eTypeAccess, eClassDeclaration,
																	eSuperInterface) == null) {
																if (pattern_ClassImplementsInterface_21_2_testcorematchandDECs_black_nac_8BB(
																		eClassDeclaration, eTypeAccess) == null) {
																	_result.add(new Object[] { eClassDeclaration,
																			eTypeAccess, eSuperInterface, _edge_type });
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_ClassImplementsInterface_21_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ClassImplementsInterface_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
			ClassImplementsInterface _this, Match match, ClassDeclaration eClassDeclaration, TypeAccess eTypeAccess,
			Type eSuperInterface) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, eClassDeclaration, eTypeAccess, eSuperInterface);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ClassImplementsInterface_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			ClassImplementsInterface _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ClassImplementsInterface_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_ClassImplementsInterface_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_ClassImplementsInterface_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ClassImplementsInterface_24_1_prepare_blackB(ClassImplementsInterface _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_ClassImplementsInterface_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_ClassImplementsInterface_24_2_matchsrctrgcontext_bindingFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		EObject _localVariable_0 = sourceMatch.getObject("eClassDeclaration");
		EObject _localVariable_1 = targetMatch.getObject("tClass");
		EObject _localVariable_2 = targetMatch.getObject("tSuperInterface");
		EObject _localVariable_3 = sourceMatch.getObject("eTypeAccess");
		EObject _localVariable_4 = sourceMatch.getObject("eSuperInterface");
		EObject tmpEClassDeclaration = _localVariable_0;
		EObject tmpTClass = _localVariable_1;
		EObject tmpTSuperInterface = _localVariable_2;
		EObject tmpETypeAccess = _localVariable_3;
		EObject tmpESuperInterface = _localVariable_4;
		if (tmpEClassDeclaration instanceof ClassDeclaration) {
			ClassDeclaration eClassDeclaration = (ClassDeclaration) tmpEClassDeclaration;
			if (tmpTClass instanceof TClass) {
				TClass tClass = (TClass) tmpTClass;
				if (tmpTSuperInterface instanceof TInterface) {
					TInterface tSuperInterface = (TInterface) tmpTSuperInterface;
					if (tmpETypeAccess instanceof TypeAccess) {
						TypeAccess eTypeAccess = (TypeAccess) tmpETypeAccess;
						if (tmpESuperInterface instanceof Type) {
							Type eSuperInterface = (Type) tmpESuperInterface;
							return new Object[] { eClassDeclaration, tClass, tSuperInterface, eTypeAccess,
									eSuperInterface, sourceMatch, targetMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassImplementsInterface_24_2_matchsrctrgcontext_blackBBBBBBB(
			ClassDeclaration eClassDeclaration, TClass tClass, TInterface tSuperInterface, TypeAccess eTypeAccess,
			Type eSuperInterface, Match sourceMatch, Match targetMatch) {
		if (!eClassDeclaration.equals(eSuperInterface)) {
			if (!sourceMatch.equals(targetMatch)) {
				return new Object[] { eClassDeclaration, tClass, tSuperInterface, eTypeAccess, eSuperInterface,
						sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassImplementsInterface_24_2_matchsrctrgcontext_bindingAndBlackFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_ClassImplementsInterface_24_2_matchsrctrgcontext_binding = pattern_ClassImplementsInterface_24_2_matchsrctrgcontext_bindingFFFFFBB(
				sourceMatch, targetMatch);
		if (result_pattern_ClassImplementsInterface_24_2_matchsrctrgcontext_binding != null) {
			ClassDeclaration eClassDeclaration = (ClassDeclaration) result_pattern_ClassImplementsInterface_24_2_matchsrctrgcontext_binding[0];
			TClass tClass = (TClass) result_pattern_ClassImplementsInterface_24_2_matchsrctrgcontext_binding[1];
			TInterface tSuperInterface = (TInterface) result_pattern_ClassImplementsInterface_24_2_matchsrctrgcontext_binding[2];
			TypeAccess eTypeAccess = (TypeAccess) result_pattern_ClassImplementsInterface_24_2_matchsrctrgcontext_binding[3];
			Type eSuperInterface = (Type) result_pattern_ClassImplementsInterface_24_2_matchsrctrgcontext_binding[4];

			Object[] result_pattern_ClassImplementsInterface_24_2_matchsrctrgcontext_black = pattern_ClassImplementsInterface_24_2_matchsrctrgcontext_blackBBBBBBB(
					eClassDeclaration, tClass, tSuperInterface, eTypeAccess, eSuperInterface, sourceMatch, targetMatch);
			if (result_pattern_ClassImplementsInterface_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { eClassDeclaration, tClass, tSuperInterface, eTypeAccess, eSuperInterface,
						sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassImplementsInterface_24_3_solvecsp_bindingFBBBBBBBB(
			ClassImplementsInterface _this, ClassDeclaration eClassDeclaration, TClass tClass,
			TInterface tSuperInterface, TypeAccess eTypeAccess, Type eSuperInterface, Match sourceMatch,
			Match targetMatch) {
		CSP _localVariable_5 = _this.isApplicable_solveCsp_CC(eClassDeclaration, tClass, tSuperInterface, eTypeAccess,
				eSuperInterface, sourceMatch, targetMatch);
		CSP csp = _localVariable_5;
		if (csp != null) {
			return new Object[] { csp, _this, eClassDeclaration, tClass, tSuperInterface, eTypeAccess, eSuperInterface,
					sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_ClassImplementsInterface_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ClassImplementsInterface_24_3_solvecsp_bindingAndBlackFBBBBBBBB(
			ClassImplementsInterface _this, ClassDeclaration eClassDeclaration, TClass tClass,
			TInterface tSuperInterface, TypeAccess eTypeAccess, Type eSuperInterface, Match sourceMatch,
			Match targetMatch) {
		Object[] result_pattern_ClassImplementsInterface_24_3_solvecsp_binding = pattern_ClassImplementsInterface_24_3_solvecsp_bindingFBBBBBBBB(
				_this, eClassDeclaration, tClass, tSuperInterface, eTypeAccess, eSuperInterface, sourceMatch,
				targetMatch);
		if (result_pattern_ClassImplementsInterface_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_ClassImplementsInterface_24_3_solvecsp_binding[0];

			Object[] result_pattern_ClassImplementsInterface_24_3_solvecsp_black = pattern_ClassImplementsInterface_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_ClassImplementsInterface_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, eClassDeclaration, tClass, tSuperInterface, eTypeAccess,
						eSuperInterface, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_ClassImplementsInterface_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_ClassImplementsInterface_24_5_matchcorrcontext_blackBFBBFBBB(
			ClassDeclaration eClassDeclaration, TClass tClass, TInterface tSuperInterface, Type eSuperInterface,
			Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!eClassDeclaration.equals(eSuperInterface)) {
			if (!sourceMatch.equals(targetMatch)) {
				for (TypeToTAbstractType eSuperInterfaceToTSuperInterface : org.moflon.core.utilities.eMoflonEMFUtil
						.getOppositeReferenceTyped(tSuperInterface, TypeToTAbstractType.class, "target")) {
					if (eSuperInterface.equals(eSuperInterfaceToTSuperInterface.getSource())) {
						for (TypeToTAbstractType eClassDeclarationToTClass : org.moflon.core.utilities.eMoflonEMFUtil
								.getOppositeReferenceTyped(tClass, TypeToTAbstractType.class, "target")) {
							if (!eClassDeclarationToTClass.equals(eSuperInterfaceToTSuperInterface)) {
								if (eClassDeclaration.equals(eClassDeclarationToTClass.getSource())) {
									_result.add(new Object[] { eClassDeclaration, eSuperInterfaceToTSuperInterface,
											tClass, tSuperInterface, eClassDeclarationToTClass, eSuperInterface,
											sourceMatch, targetMatch });
								}
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_ClassImplementsInterface_24_5_matchcorrcontext_greenBBBBF(
			TypeToTAbstractType eSuperInterfaceToTSuperInterface, TypeToTAbstractType eClassDeclarationToTClass,
			Match sourceMatch, Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "ClassImplementsInterface";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(eSuperInterfaceToTSuperInterface);
		ccMatch.getAllContextElements().add(eClassDeclarationToTClass);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { eSuperInterfaceToTSuperInterface, eClassDeclarationToTClass, sourceMatch, targetMatch,
				ccMatch };
	}

	public static final Object[] pattern_ClassImplementsInterface_24_6_createcorrespondence_blackBBBBBB(
			ClassDeclaration eClassDeclaration, TClass tClass, TInterface tSuperInterface, TypeAccess eTypeAccess,
			Type eSuperInterface, CCMatch ccMatch) {
		if (!eClassDeclaration.equals(eSuperInterface)) {
			return new Object[] { eClassDeclaration, tClass, tSuperInterface, eTypeAccess, eSuperInterface, ccMatch };
		}
		return null;
	}

	public static final Object[] pattern_ClassImplementsInterface_24_7_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_ClassImplementsInterface_24_7_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "ClassImplementsInterface";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_ClassImplementsInterface_24_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_ClassImplementsInterface_27_1_matchtggpattern_black_nac_0B(
			TypeAccess eTypeAccess) {
		for (Annotation __DEC_eTypeAccess_type_525937 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(eTypeAccess, Annotation.class, "type")) {
			return new Object[] { eTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_ClassImplementsInterface_27_1_matchtggpattern_black_nac_1BB(
			TypeAccess eTypeAccess, Type eSuperInterface) {
		for (ArrayType __DEC_eTypeAccess_elementType_153674 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(eTypeAccess, ArrayType.class, "elementType")) {
			if (!eSuperInterface.equals(__DEC_eTypeAccess_elementType_153674)) {
				return new Object[] { eTypeAccess, eSuperInterface };
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassImplementsInterface_27_1_matchtggpattern_black_nac_2B(
			TypeAccess eTypeAccess) {
		for (ClassInstanceCreation __DEC_eTypeAccess_type_766530 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(eTypeAccess, ClassInstanceCreation.class, "type")) {
			return new Object[] { eTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_ClassImplementsInterface_27_1_matchtggpattern_black_nac_3BBB(
			TypeAccess eTypeAccess, ClassDeclaration eClassDeclaration, Type eSuperInterface) {
		if (!eClassDeclaration.equals(eSuperInterface)) {
			for (ClassDeclaration __DEC_eTypeAccess_superClass_182252 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(eTypeAccess, ClassDeclaration.class, "superClass")) {
				if (!eClassDeclaration.equals(__DEC_eTypeAccess_superClass_182252)) {
					if (!eSuperInterface.equals(__DEC_eTypeAccess_superClass_182252)) {
						return new Object[] { eTypeAccess, eClassDeclaration, eSuperInterface };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassImplementsInterface_27_1_matchtggpattern_black_nac_4B(
			TypeAccess eTypeAccess) {
		for (MethodDeclaration __DEC_eTypeAccess_returnType_765130 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(eTypeAccess, MethodDeclaration.class, "returnType")) {
			return new Object[] { eTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_ClassImplementsInterface_27_1_matchtggpattern_black_nac_5BB(
			TypeAccess eTypeAccess, Type eSuperInterface) {
		for (ParameterizedType __DEC_eTypeAccess_type_354902 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(eTypeAccess, ParameterizedType.class, "type")) {
			if (!eSuperInterface.equals(__DEC_eTypeAccess_type_354902)) {
				return new Object[] { eTypeAccess, eSuperInterface };
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassImplementsInterface_27_1_matchtggpattern_black_nac_6B(
			TypeAccess eTypeAccess) {
		for (TypeLiteral __DEC_eTypeAccess_type_451708 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(eTypeAccess, TypeLiteral.class, "type")) {
			return new Object[] { eTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_ClassImplementsInterface_27_1_matchtggpattern_black_nac_7B(
			TypeAccess eTypeAccess) {
		for (AnnotationMemberValuePair __DEC_eTypeAccess_value_374484 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(eTypeAccess, AnnotationMemberValuePair.class, "value")) {
			return new Object[] { eTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_ClassImplementsInterface_27_1_matchtggpattern_black_nac_8BB(
			ClassDeclaration eClassDeclaration, TypeAccess eTypeAccess) {
		if (eTypeAccess.equals(eClassDeclaration.getSuperClass())) {
			return new Object[] { eClassDeclaration, eTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_ClassImplementsInterface_27_1_matchtggpattern_blackBBB(
			ClassDeclaration eClassDeclaration, TypeAccess eTypeAccess, Type eSuperInterface) {
		if (!eClassDeclaration.equals(eSuperInterface)) {
			if (eSuperInterface.equals(eTypeAccess.getType())) {
				if (eClassDeclaration.getSuperInterfaces().contains(eTypeAccess)) {
					if (pattern_ClassImplementsInterface_27_1_matchtggpattern_black_nac_0B(eTypeAccess) == null) {
						if (pattern_ClassImplementsInterface_27_1_matchtggpattern_black_nac_1BB(eTypeAccess,
								eSuperInterface) == null) {
							if (pattern_ClassImplementsInterface_27_1_matchtggpattern_black_nac_2B(
									eTypeAccess) == null) {
								if (pattern_ClassImplementsInterface_27_1_matchtggpattern_black_nac_3BBB(eTypeAccess,
										eClassDeclaration, eSuperInterface) == null) {
									if (pattern_ClassImplementsInterface_27_1_matchtggpattern_black_nac_4B(
											eTypeAccess) == null) {
										if (pattern_ClassImplementsInterface_27_1_matchtggpattern_black_nac_5BB(
												eTypeAccess, eSuperInterface) == null) {
											if (pattern_ClassImplementsInterface_27_1_matchtggpattern_black_nac_6B(
													eTypeAccess) == null) {
												if (pattern_ClassImplementsInterface_27_1_matchtggpattern_black_nac_7B(
														eTypeAccess) == null) {
													if (pattern_ClassImplementsInterface_27_1_matchtggpattern_black_nac_8BB(
															eClassDeclaration, eTypeAccess) == null) {
														return new Object[] { eClassDeclaration, eTypeAccess,
																eSuperInterface };
													}
												}
											}
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

	public static final boolean pattern_ClassImplementsInterface_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ClassImplementsInterface_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_ClassImplementsInterface_28_1_matchtggpattern_blackBB(TClass tClass,
			TInterface tSuperInterface) {
		if (tSuperInterface.getImplementedBy().contains(tClass)) {
			return new Object[] { tClass, tSuperInterface };
		}
		return null;
	}

	public static final boolean pattern_ClassImplementsInterface_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ClassImplementsInterface_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_ClassImplementsInterface_29_1_createresult_blackB(
			ClassImplementsInterface _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_ClassImplementsInterface_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_ClassImplementsInterface_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, ClassDeclaration eClassDeclaration) {
		if (ruleResult.getSourceObjects().contains(eClassDeclaration)) {
			return new Object[] { ruleResult, eClassDeclaration };
		}
		return null;
	}

	public static final Object[] pattern_ClassImplementsInterface_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, TypeToTAbstractType eClassDeclarationToTClass) {
		if (ruleResult.getCorrObjects().contains(eClassDeclarationToTClass)) {
			return new Object[] { ruleResult, eClassDeclarationToTClass };
		}
		return null;
	}

	public static final Object[] pattern_ClassImplementsInterface_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, TClass tClass) {
		if (ruleResult.getTargetObjects().contains(tClass)) {
			return new Object[] { ruleResult, tClass };
		}
		return null;
	}

	public static final Object[] pattern_ClassImplementsInterface_29_2_isapplicablecore_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, TypeToTAbstractType eSuperInterfaceToTSuperInterface) {
		if (ruleResult.getCorrObjects().contains(eSuperInterfaceToTSuperInterface)) {
			return new Object[] { ruleResult, eSuperInterfaceToTSuperInterface };
		}
		return null;
	}

	public static final Object[] pattern_ClassImplementsInterface_29_2_isapplicablecore_black_nac_4BB(
			ModelgeneratorRuleResult ruleResult, TInterface tSuperInterface) {
		if (ruleResult.getTargetObjects().contains(tSuperInterface)) {
			return new Object[] { ruleResult, tSuperInterface };
		}
		return null;
	}

	public static final Object[] pattern_ClassImplementsInterface_29_2_isapplicablecore_black_nac_5BB(
			ModelgeneratorRuleResult ruleResult, Type eSuperInterface) {
		if (ruleResult.getSourceObjects().contains(eSuperInterface)) {
			return new Object[] { ruleResult, eSuperInterface };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ClassImplementsInterface_29_2_isapplicablecore_blackFFFFFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList eClassDeclarationToTClassList : ruleEntryContainer.getRuleEntryList()) {
			for (RuleEntryList eSuperInterfaceToTSuperInterfaceList : ruleEntryContainer.getRuleEntryList()) {
				if (!eClassDeclarationToTClassList.equals(eSuperInterfaceToTSuperInterfaceList)) {
					for (EObject tmpEClassDeclarationToTClass : eClassDeclarationToTClassList.getEntryObjects()) {
						if (tmpEClassDeclarationToTClass instanceof TypeToTAbstractType) {
							TypeToTAbstractType eClassDeclarationToTClass = (TypeToTAbstractType) tmpEClassDeclarationToTClass;
							Type tmpEClassDeclaration = eClassDeclarationToTClass.getSource();
							if (tmpEClassDeclaration instanceof ClassDeclaration) {
								ClassDeclaration eClassDeclaration = (ClassDeclaration) tmpEClassDeclaration;
								TAbstractType tmpTClass = eClassDeclarationToTClass.getTarget();
								if (tmpTClass instanceof TClass) {
									TClass tClass = (TClass) tmpTClass;
									if (pattern_ClassImplementsInterface_29_2_isapplicablecore_black_nac_1BB(ruleResult,
											eClassDeclarationToTClass) == null) {
										if (pattern_ClassImplementsInterface_29_2_isapplicablecore_black_nac_0BB(
												ruleResult, eClassDeclaration) == null) {
											if (pattern_ClassImplementsInterface_29_2_isapplicablecore_black_nac_2BB(
													ruleResult, tClass) == null) {
												for (EObject tmpESuperInterfaceToTSuperInterface : eSuperInterfaceToTSuperInterfaceList
														.getEntryObjects()) {
													if (tmpESuperInterfaceToTSuperInterface instanceof TypeToTAbstractType) {
														TypeToTAbstractType eSuperInterfaceToTSuperInterface = (TypeToTAbstractType) tmpESuperInterfaceToTSuperInterface;
														if (!eClassDeclarationToTClass
																.equals(eSuperInterfaceToTSuperInterface)) {
															TAbstractType tmpTSuperInterface = eSuperInterfaceToTSuperInterface
																	.getTarget();
															if (tmpTSuperInterface instanceof TInterface) {
																TInterface tSuperInterface = (TInterface) tmpTSuperInterface;
																Type eSuperInterface = eSuperInterfaceToTSuperInterface
																		.getSource();
																if (eSuperInterface != null) {
																	if (!eClassDeclaration.equals(eSuperInterface)) {
																		if (pattern_ClassImplementsInterface_29_2_isapplicablecore_black_nac_3BB(
																				ruleResult,
																				eSuperInterfaceToTSuperInterface) == null) {
																			if (pattern_ClassImplementsInterface_29_2_isapplicablecore_black_nac_4BB(
																					ruleResult,
																					tSuperInterface) == null) {
																				if (pattern_ClassImplementsInterface_29_2_isapplicablecore_black_nac_5BB(
																						ruleResult,
																						eSuperInterface) == null) {
																					_result.add(new Object[] {
																							eClassDeclarationToTClassList,
																							eClassDeclaration,
																							eClassDeclarationToTClass,
																							tClass,
																							eSuperInterfaceToTSuperInterfaceList,
																							eSuperInterfaceToTSuperInterface,
																							tSuperInterface,
																							eSuperInterface,
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
		return _result;
	}

	public static final Object[] pattern_ClassImplementsInterface_29_3_solveCSP_bindingFBBBBBBBBB(
			ClassImplementsInterface _this, IsApplicableMatch isApplicableMatch, ClassDeclaration eClassDeclaration,
			TypeToTAbstractType eSuperInterfaceToTSuperInterface, TClass tClass, TInterface tSuperInterface,
			TypeToTAbstractType eClassDeclarationToTClass, Type eSuperInterface, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, eClassDeclaration,
				eSuperInterfaceToTSuperInterface, tClass, tSuperInterface, eClassDeclarationToTClass, eSuperInterface,
				ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, eClassDeclaration, eSuperInterfaceToTSuperInterface,
					tClass, tSuperInterface, eClassDeclarationToTClass, eSuperInterface, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_ClassImplementsInterface_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ClassImplementsInterface_29_3_solveCSP_bindingAndBlackFBBBBBBBBB(
			ClassImplementsInterface _this, IsApplicableMatch isApplicableMatch, ClassDeclaration eClassDeclaration,
			TypeToTAbstractType eSuperInterfaceToTSuperInterface, TClass tClass, TInterface tSuperInterface,
			TypeToTAbstractType eClassDeclarationToTClass, Type eSuperInterface, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_ClassImplementsInterface_29_3_solveCSP_binding = pattern_ClassImplementsInterface_29_3_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, eClassDeclaration, eSuperInterfaceToTSuperInterface, tClass, tSuperInterface,
				eClassDeclarationToTClass, eSuperInterface, ruleResult);
		if (result_pattern_ClassImplementsInterface_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_ClassImplementsInterface_29_3_solveCSP_binding[0];

			Object[] result_pattern_ClassImplementsInterface_29_3_solveCSP_black = pattern_ClassImplementsInterface_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_ClassImplementsInterface_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, eClassDeclaration,
						eSuperInterfaceToTSuperInterface, tClass, tSuperInterface, eClassDeclarationToTClass,
						eSuperInterface, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_ClassImplementsInterface_29_4_checkCSP_expressionFBB(
			ClassImplementsInterface _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ClassImplementsInterface_29_5_checknacs_blackBBBBBB(
			ClassDeclaration eClassDeclaration, TypeToTAbstractType eSuperInterfaceToTSuperInterface, TClass tClass,
			TInterface tSuperInterface, TypeToTAbstractType eClassDeclarationToTClass, Type eSuperInterface) {
		if (!eClassDeclaration.equals(eSuperInterface)) {
			if (!eClassDeclarationToTClass.equals(eSuperInterfaceToTSuperInterface)) {
				return new Object[] { eClassDeclaration, eSuperInterfaceToTSuperInterface, tClass, tSuperInterface,
						eClassDeclarationToTClass, eSuperInterface };
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassImplementsInterface_29_6_perform_blackBBBBBBB(
			ClassDeclaration eClassDeclaration, TypeToTAbstractType eSuperInterfaceToTSuperInterface, TClass tClass,
			TInterface tSuperInterface, TypeToTAbstractType eClassDeclarationToTClass, Type eSuperInterface,
			ModelgeneratorRuleResult ruleResult) {
		if (!eClassDeclaration.equals(eSuperInterface)) {
			if (!eClassDeclarationToTClass.equals(eSuperInterfaceToTSuperInterface)) {
				return new Object[] { eClassDeclaration, eSuperInterfaceToTSuperInterface, tClass, tSuperInterface,
						eClassDeclarationToTClass, eSuperInterface, ruleResult };
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassImplementsInterface_29_6_perform_greenBBBFBB(
			ClassDeclaration eClassDeclaration, TClass tClass, TInterface tSuperInterface, Type eSuperInterface,
			ModelgeneratorRuleResult ruleResult) {
		TypeAccess eTypeAccess = JavaFactory.eINSTANCE.createTypeAccess();
		tSuperInterface.getImplementedBy().add(tClass);
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		eTypeAccess.setType(eSuperInterface);
		eClassDeclaration.getSuperInterfaces().add(eTypeAccess);
		ruleResult.getSourceObjects().add(eTypeAccess);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { eClassDeclaration, tClass, tSuperInterface, eTypeAccess, eSuperInterface, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_ClassImplementsInterface_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //ClassImplementsInterfaceImpl
