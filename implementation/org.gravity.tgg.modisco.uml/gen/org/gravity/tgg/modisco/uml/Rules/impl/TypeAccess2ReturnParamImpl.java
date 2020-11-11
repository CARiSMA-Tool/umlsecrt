/**
 */
package org.gravity.tgg.modisco.uml.Rules.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.LinkedList;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;

import org.eclipse.modisco.java.AbstractTypeDeclaration;
import org.eclipse.modisco.java.Annotation;
import org.eclipse.modisco.java.AnnotationMemberValuePair;
import org.eclipse.modisco.java.ArrayInitializer;
import org.eclipse.modisco.java.ArrayType;
import org.eclipse.modisco.java.ClassDeclaration;
import org.eclipse.modisco.java.MethodDeclaration;
import org.eclipse.modisco.java.ParameterizedType;
import org.eclipse.modisco.java.SingleVariableDeclaration;
import org.eclipse.modisco.java.Type;
import org.eclipse.modisco.java.TypeAccess;

import org.eclipse.modisco.java.emf.JavaFactory;

import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.Parameter;
import org.eclipse.uml2.uml.ParameterDirectionKind;
import org.eclipse.uml2.uml.UMLFactory;

import org.gravity.tgg.modisco.uml.NamedElement2NamedElement;

import org.gravity.tgg.modisco.uml.Rules.RulesPackage;
import org.gravity.tgg.modisco.uml.Rules.TypeAccess2ReturnParam;

import org.gravity.tgg.modisco.uml.TypeAccess2Parameter;
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
 * An implementation of the model object '<em><b>Type Access2 Return Param</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class TypeAccess2ReturnParamImpl extends AbstractRuleImpl implements TypeAccess2ReturnParam {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeAccess2ReturnParamImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getTypeAccess2ReturnParam();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, MethodDeclaration method, Type jType, TypeAccess typeAccess) {

		Object[] result1_black = TypeAccess2ReturnParamImpl
				.pattern_TypeAccess2ReturnParam_0_1_initialbindings_blackBBBBB(this, match, method, jType, typeAccess);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[method] = " + method + ", " + "[jType] = " + jType + ", "
					+ "[typeAccess] = " + typeAccess + ".");
		}

		Object[] result2_bindingAndBlack = TypeAccess2ReturnParamImpl
				.pattern_TypeAccess2ReturnParam_0_2_SolveCSP_bindingAndBlackFBBBBB(this, match, method, jType,
						typeAccess);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[method] = " + method + ", " + "[jType] = " + jType + ", "
					+ "[typeAccess] = " + typeAccess + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (TypeAccess2ReturnParamImpl.pattern_TypeAccess2ReturnParam_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = TypeAccess2ReturnParamImpl
					.pattern_TypeAccess2ReturnParam_0_4_collectelementstobetranslated_blackBBBB(match, method, jType,
							typeAccess);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching failed." + " Variables: " + "[match] = " + match + ", " + "[method] = "
								+ method + ", " + "[jType] = " + jType + ", " + "[typeAccess] = " + typeAccess + ".");
			}
			TypeAccess2ReturnParamImpl.pattern_TypeAccess2ReturnParam_0_4_collectelementstobetranslated_greenBBBBFFF(
					match, method, jType, typeAccess);
			//nothing EMoflonEdge typeAccess__jType____type = (EMoflonEdge) result4_green[4];
			//nothing EMoflonEdge jType__typeAccess____usagesInTypeAccess = (EMoflonEdge) result4_green[5];
			//nothing EMoflonEdge method__typeAccess____returnType = (EMoflonEdge) result4_green[6];

			Object[] result5_black = TypeAccess2ReturnParamImpl
					.pattern_TypeAccess2ReturnParam_0_5_collectcontextelements_blackBBBB(match, method, jType,
							typeAccess);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching failed." + " Variables: " + "[match] = " + match + ", " + "[method] = "
								+ method + ", " + "[jType] = " + jType + ", " + "[typeAccess] = " + typeAccess + ".");
			}
			TypeAccess2ReturnParamImpl.pattern_TypeAccess2ReturnParam_0_5_collectcontextelements_greenBBB(match, method,
					jType);

			// 
			TypeAccess2ReturnParamImpl.pattern_TypeAccess2ReturnParam_0_6_registerobjectstomatch_expressionBBBBB(this,
					match, method, jType, typeAccess);
			return TypeAccess2ReturnParamImpl.pattern_TypeAccess2ReturnParam_0_7_expressionF();
		} else {
			return TypeAccess2ReturnParamImpl.pattern_TypeAccess2ReturnParam_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = TypeAccess2ReturnParamImpl
				.pattern_TypeAccess2ReturnParam_1_1_performtransformation_bindingAndBlackFFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		NamedElement2NamedElement m2o = (NamedElement2NamedElement) result1_bindingAndBlack[0];
		Operation operation = (Operation) result1_bindingAndBlack[1];
		MethodDeclaration method = (MethodDeclaration) result1_bindingAndBlack[2];
		NamedElement2NamedElement ne2ne = (NamedElement2NamedElement) result1_bindingAndBlack[3];
		Type jType = (Type) result1_bindingAndBlack[4];
		TypeAccess typeAccess = (TypeAccess) result1_bindingAndBlack[5];
		org.eclipse.uml2.uml.Type uType = (org.eclipse.uml2.uml.Type) result1_bindingAndBlack[6];
		CSP csp = (CSP) result1_bindingAndBlack[7];
		Object[] result1_green = TypeAccess2ReturnParamImpl
				.pattern_TypeAccess2ReturnParam_1_1_performtransformation_greenBBFBFB(operation, typeAccess, uType,
						csp);
		TypeAccess2Parameter ta2p = (TypeAccess2Parameter) result1_green[2];
		Parameter returnParam = (Parameter) result1_green[4];

		Object[] result2_black = TypeAccess2ReturnParamImpl
				.pattern_TypeAccess2ReturnParam_1_2_collecttranslatedelements_blackBBB(typeAccess, ta2p, returnParam);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[typeAccess] = " + typeAccess
					+ ", " + "[ta2p] = " + ta2p + ", " + "[returnParam] = " + returnParam + ".");
		}
		Object[] result2_green = TypeAccess2ReturnParamImpl
				.pattern_TypeAccess2ReturnParam_1_2_collecttranslatedelements_greenFBBB(typeAccess, ta2p, returnParam);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = TypeAccess2ReturnParamImpl
				.pattern_TypeAccess2ReturnParam_1_3_bookkeepingforedges_blackBBBBBBBBBB(ruleresult, m2o, operation,
						method, ne2ne, jType, typeAccess, ta2p, uType, returnParam);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[m2o] = " + m2o + ", " + "[operation] = " + operation + ", " + "[method] = " + method
					+ ", " + "[ne2ne] = " + ne2ne + ", " + "[jType] = " + jType + ", " + "[typeAccess] = " + typeAccess
					+ ", " + "[ta2p] = " + ta2p + ", " + "[uType] = " + uType + ", " + "[returnParam] = " + returnParam
					+ ".");
		}
		TypeAccess2ReturnParamImpl.pattern_TypeAccess2ReturnParam_1_3_bookkeepingforedges_greenBBBBBBBBFFFFFFF(
				ruleresult, operation, method, jType, typeAccess, ta2p, uType, returnParam);
		//nothing EMoflonEdge operation__returnParam____ownedParameter = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge typeAccess__jType____type = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge jType__typeAccess____usagesInTypeAccess = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge ta2p__typeAccess____source = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge method__typeAccess____returnType = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge ta2p__returnParam____target = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge returnParam__uType____type = (EMoflonEdge) result3_green[14];

		// 
		// 
		TypeAccess2ReturnParamImpl.pattern_TypeAccess2ReturnParam_1_5_registerobjects_expressionBBBBBBBBBBB(this,
				ruleresult, m2o, operation, method, ne2ne, jType, typeAccess, ta2p, uType, returnParam);
		return TypeAccess2ReturnParamImpl.pattern_TypeAccess2ReturnParam_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = TypeAccess2ReturnParamImpl
				.pattern_TypeAccess2ReturnParam_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = TypeAccess2ReturnParamImpl
				.pattern_TypeAccess2ReturnParam_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = TypeAccess2ReturnParamImpl
				.pattern_TypeAccess2ReturnParam_2_2_corematch_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		MethodDeclaration method = (MethodDeclaration) result2_binding[0];
		Type jType = (Type) result2_binding[1];
		TypeAccess typeAccess = (TypeAccess) result2_binding[2];
		for (Object[] result2_black : TypeAccess2ReturnParamImpl
				.pattern_TypeAccess2ReturnParam_2_2_corematch_blackFFBFBBFB(method, jType, typeAccess, match)) {
			NamedElement2NamedElement m2o = (NamedElement2NamedElement) result2_black[0];
			Operation operation = (Operation) result2_black[1];
			NamedElement2NamedElement ne2ne = (NamedElement2NamedElement) result2_black[3];
			org.eclipse.uml2.uml.Type uType = (org.eclipse.uml2.uml.Type) result2_black[6];
			// ForEach 
			for (Object[] result3_black : TypeAccess2ReturnParamImpl
					.pattern_TypeAccess2ReturnParam_2_3_findcontext_blackBBBBBBB(m2o, operation, method, ne2ne, jType,
							typeAccess, uType)) {
				Object[] result3_green = TypeAccess2ReturnParamImpl
						.pattern_TypeAccess2ReturnParam_2_3_findcontext_greenBBBBBBBFFFFFFFF(m2o, operation, method,
								ne2ne, jType, typeAccess, uType);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[7];
				//nothing EMoflonEdge m2o__operation____target = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge ne2ne__jType____source = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge typeAccess__jType____type = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge jType__typeAccess____usagesInTypeAccess = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge method__typeAccess____returnType = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge m2o__method____source = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge ne2ne__uType____target = (EMoflonEdge) result3_green[14];

				Object[] result4_bindingAndBlack = TypeAccess2ReturnParamImpl
						.pattern_TypeAccess2ReturnParam_2_4_solveCSP_bindingAndBlackFBBBBBBBBB(this, isApplicableMatch,
								m2o, operation, method, ne2ne, jType, typeAccess, uType);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[m2o] = " + m2o + ", "
							+ "[operation] = " + operation + ", " + "[method] = " + method + ", " + "[ne2ne] = " + ne2ne
							+ ", " + "[jType] = " + jType + ", " + "[typeAccess] = " + typeAccess + ", " + "[uType] = "
							+ uType + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (TypeAccess2ReturnParamImpl.pattern_TypeAccess2ReturnParam_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = TypeAccess2ReturnParamImpl
							.pattern_TypeAccess2ReturnParam_2_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					TypeAccess2ReturnParamImpl.pattern_TypeAccess2ReturnParam_2_6_addmatchtoruleresult_greenBB(
							ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return TypeAccess2ReturnParamImpl.pattern_TypeAccess2ReturnParam_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, MethodDeclaration method, Type jType, TypeAccess typeAccess) {
		match.registerObject("method", method);
		match.registerObject("jType", jType);
		match.registerObject("typeAccess", typeAccess);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, MethodDeclaration method, Type jType, TypeAccess typeAccess) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, NamedElement2NamedElement m2o,
			Operation operation, MethodDeclaration method, NamedElement2NamedElement ne2ne, Type jType,
			TypeAccess typeAccess, org.eclipse.uml2.uml.Type uType) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables
		Variable var_returnParam_direction = CSPFactoryHelper.eINSTANCE.createVariable("returnParam.direction", csp);
		var_returnParam_direction.setType("uml.ParameterDirectionKind");

		// Create constraints
		IsReturn isReturn = new IsReturn();

		csp.getConstraints().add(isReturn);

		// Solve CSP
		isReturn.setRuleName("NoRuleName");
		isReturn.solve(var_returnParam_direction);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("m2o", m2o);
		isApplicableMatch.registerObject("operation", operation);
		isApplicableMatch.registerObject("method", method);
		isApplicableMatch.registerObject("ne2ne", ne2ne);
		isApplicableMatch.registerObject("jType", jType);
		isApplicableMatch.registerObject("typeAccess", typeAccess);
		isApplicableMatch.registerObject("uType", uType);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject m2o, EObject operation, EObject method,
			EObject ne2ne, EObject jType, EObject typeAccess, EObject ta2p, EObject uType, EObject returnParam) {
		ruleresult.registerObject("m2o", m2o);
		ruleresult.registerObject("operation", operation);
		ruleresult.registerObject("method", method);
		ruleresult.registerObject("ne2ne", ne2ne);
		ruleresult.registerObject("jType", jType);
		ruleresult.registerObject("typeAccess", typeAccess);
		ruleresult.registerObject("ta2p", ta2p);
		ruleresult.registerObject("uType", uType);
		ruleresult.registerObject("returnParam", returnParam);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("typeAccess").eClass())
				.equals("java.TypeAccess.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, Operation operation, org.eclipse.uml2.uml.Type uType,
			Parameter returnParam) {

		Object[] result1_black = TypeAccess2ReturnParamImpl
				.pattern_TypeAccess2ReturnParam_10_1_initialbindings_blackBBBBB(this, match, operation, uType,
						returnParam);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[operation] = " + operation + ", " + "[uType] = " + uType + ", "
					+ "[returnParam] = " + returnParam + ".");
		}

		Object[] result2_bindingAndBlack = TypeAccess2ReturnParamImpl
				.pattern_TypeAccess2ReturnParam_10_2_SolveCSP_bindingAndBlackFBBBBB(this, match, operation, uType,
						returnParam);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[operation] = " + operation + ", " + "[uType] = " + uType + ", "
					+ "[returnParam] = " + returnParam + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (TypeAccess2ReturnParamImpl.pattern_TypeAccess2ReturnParam_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = TypeAccess2ReturnParamImpl
					.pattern_TypeAccess2ReturnParam_10_4_collectelementstobetranslated_blackBBBB(match, operation,
							uType, returnParam);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[operation] = " + operation + ", " + "[uType] = " + uType + ", " + "[returnParam] = "
						+ returnParam + ".");
			}
			TypeAccess2ReturnParamImpl.pattern_TypeAccess2ReturnParam_10_4_collectelementstobetranslated_greenBBBBFF(
					match, operation, uType, returnParam);
			//nothing EMoflonEdge operation__returnParam____ownedParameter = (EMoflonEdge) result4_green[4];
			//nothing EMoflonEdge returnParam__uType____type = (EMoflonEdge) result4_green[5];

			Object[] result5_black = TypeAccess2ReturnParamImpl
					.pattern_TypeAccess2ReturnParam_10_5_collectcontextelements_blackBBBB(match, operation, uType,
							returnParam);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[operation] = " + operation + ", " + "[uType] = " + uType + ", " + "[returnParam] = "
						+ returnParam + ".");
			}
			TypeAccess2ReturnParamImpl.pattern_TypeAccess2ReturnParam_10_5_collectcontextelements_greenBBB(match,
					operation, uType);

			// 
			TypeAccess2ReturnParamImpl.pattern_TypeAccess2ReturnParam_10_6_registerobjectstomatch_expressionBBBBB(this,
					match, operation, uType, returnParam);
			return TypeAccess2ReturnParamImpl.pattern_TypeAccess2ReturnParam_10_7_expressionF();
		} else {
			return TypeAccess2ReturnParamImpl.pattern_TypeAccess2ReturnParam_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = TypeAccess2ReturnParamImpl
				.pattern_TypeAccess2ReturnParam_11_1_performtransformation_bindingAndBlackFFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		NamedElement2NamedElement m2o = (NamedElement2NamedElement) result1_bindingAndBlack[0];
		Operation operation = (Operation) result1_bindingAndBlack[1];
		MethodDeclaration method = (MethodDeclaration) result1_bindingAndBlack[2];
		NamedElement2NamedElement ne2ne = (NamedElement2NamedElement) result1_bindingAndBlack[3];
		Type jType = (Type) result1_bindingAndBlack[4];
		org.eclipse.uml2.uml.Type uType = (org.eclipse.uml2.uml.Type) result1_bindingAndBlack[5];
		Parameter returnParam = (Parameter) result1_bindingAndBlack[6];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[7];
		Object[] result1_green = TypeAccess2ReturnParamImpl
				.pattern_TypeAccess2ReturnParam_11_1_performtransformation_greenBBFFB(method, jType, returnParam);
		TypeAccess typeAccess = (TypeAccess) result1_green[2];
		TypeAccess2Parameter ta2p = (TypeAccess2Parameter) result1_green[3];

		Object[] result2_black = TypeAccess2ReturnParamImpl
				.pattern_TypeAccess2ReturnParam_11_2_collecttranslatedelements_blackBBB(typeAccess, ta2p, returnParam);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[typeAccess] = " + typeAccess
					+ ", " + "[ta2p] = " + ta2p + ", " + "[returnParam] = " + returnParam + ".");
		}
		Object[] result2_green = TypeAccess2ReturnParamImpl
				.pattern_TypeAccess2ReturnParam_11_2_collecttranslatedelements_greenFBBB(typeAccess, ta2p, returnParam);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = TypeAccess2ReturnParamImpl
				.pattern_TypeAccess2ReturnParam_11_3_bookkeepingforedges_blackBBBBBBBBBB(ruleresult, m2o, operation,
						method, ne2ne, jType, typeAccess, ta2p, uType, returnParam);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[m2o] = " + m2o + ", " + "[operation] = " + operation + ", " + "[method] = " + method
					+ ", " + "[ne2ne] = " + ne2ne + ", " + "[jType] = " + jType + ", " + "[typeAccess] = " + typeAccess
					+ ", " + "[ta2p] = " + ta2p + ", " + "[uType] = " + uType + ", " + "[returnParam] = " + returnParam
					+ ".");
		}
		TypeAccess2ReturnParamImpl.pattern_TypeAccess2ReturnParam_11_3_bookkeepingforedges_greenBBBBBBBBFFFFFFF(
				ruleresult, operation, method, jType, typeAccess, ta2p, uType, returnParam);
		//nothing EMoflonEdge operation__returnParam____ownedParameter = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge typeAccess__jType____type = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge jType__typeAccess____usagesInTypeAccess = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge ta2p__typeAccess____source = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge method__typeAccess____returnType = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge ta2p__returnParam____target = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge returnParam__uType____type = (EMoflonEdge) result3_green[14];

		// 
		// 
		TypeAccess2ReturnParamImpl.pattern_TypeAccess2ReturnParam_11_5_registerobjects_expressionBBBBBBBBBBB(this,
				ruleresult, m2o, operation, method, ne2ne, jType, typeAccess, ta2p, uType, returnParam);
		return TypeAccess2ReturnParamImpl.pattern_TypeAccess2ReturnParam_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = TypeAccess2ReturnParamImpl
				.pattern_TypeAccess2ReturnParam_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = TypeAccess2ReturnParamImpl
				.pattern_TypeAccess2ReturnParam_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = TypeAccess2ReturnParamImpl
				.pattern_TypeAccess2ReturnParam_12_2_corematch_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		Operation operation = (Operation) result2_binding[0];
		org.eclipse.uml2.uml.Type uType = (org.eclipse.uml2.uml.Type) result2_binding[1];
		Parameter returnParam = (Parameter) result2_binding[2];
		for (Object[] result2_black : TypeAccess2ReturnParamImpl
				.pattern_TypeAccess2ReturnParam_12_2_corematch_blackFBFFFBBB(operation, uType, returnParam, match)) {
			NamedElement2NamedElement m2o = (NamedElement2NamedElement) result2_black[0];
			MethodDeclaration method = (MethodDeclaration) result2_black[2];
			NamedElement2NamedElement ne2ne = (NamedElement2NamedElement) result2_black[3];
			Type jType = (Type) result2_black[4];
			// ForEach 
			for (Object[] result3_black : TypeAccess2ReturnParamImpl
					.pattern_TypeAccess2ReturnParam_12_3_findcontext_blackBBBBBBB(m2o, operation, method, ne2ne, jType,
							uType, returnParam)) {
				Object[] result3_green = TypeAccess2ReturnParamImpl
						.pattern_TypeAccess2ReturnParam_12_3_findcontext_greenBBBBBBBFFFFFFF(m2o, operation, method,
								ne2ne, jType, uType, returnParam);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[7];
				//nothing EMoflonEdge m2o__operation____target = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge ne2ne__jType____source = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge operation__returnParam____ownedParameter = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge m2o__method____source = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge ne2ne__uType____target = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge returnParam__uType____type = (EMoflonEdge) result3_green[13];

				Object[] result4_bindingAndBlack = TypeAccess2ReturnParamImpl
						.pattern_TypeAccess2ReturnParam_12_4_solveCSP_bindingAndBlackFBBBBBBBBB(this, isApplicableMatch,
								m2o, operation, method, ne2ne, jType, uType, returnParam);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[m2o] = " + m2o + ", "
							+ "[operation] = " + operation + ", " + "[method] = " + method + ", " + "[ne2ne] = " + ne2ne
							+ ", " + "[jType] = " + jType + ", " + "[uType] = " + uType + ", " + "[returnParam] = "
							+ returnParam + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (TypeAccess2ReturnParamImpl.pattern_TypeAccess2ReturnParam_12_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = TypeAccess2ReturnParamImpl
							.pattern_TypeAccess2ReturnParam_12_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					TypeAccess2ReturnParamImpl.pattern_TypeAccess2ReturnParam_12_6_addmatchtoruleresult_greenBB(
							ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return TypeAccess2ReturnParamImpl.pattern_TypeAccess2ReturnParam_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, Operation operation, org.eclipse.uml2.uml.Type uType,
			Parameter returnParam) {
		match.registerObject("operation", operation);
		match.registerObject("uType", uType);
		match.registerObject("returnParam", returnParam);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, Operation operation, org.eclipse.uml2.uml.Type uType,
			Parameter returnParam) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals

		// Create attribute variables
		Variable var_returnParam_direction = CSPFactoryHelper.eINSTANCE.createVariable("returnParam.direction", true,
				csp);
		var_returnParam_direction.setValue(returnParam.getDirection());
		var_returnParam_direction.setType("uml.ParameterDirectionKind");

		// Create unbound variables

		// Create constraints
		IsReturn isReturn = new IsReturn();

		csp.getConstraints().add(isReturn);

		// Solve CSP
		isReturn.setRuleName("NoRuleName");
		isReturn.solve(var_returnParam_direction);
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, NamedElement2NamedElement m2o,
			Operation operation, MethodDeclaration method, NamedElement2NamedElement ne2ne, Type jType,
			org.eclipse.uml2.uml.Type uType, Parameter returnParam) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("m2o", m2o);
		isApplicableMatch.registerObject("operation", operation);
		isApplicableMatch.registerObject("method", method);
		isApplicableMatch.registerObject("ne2ne", ne2ne);
		isApplicableMatch.registerObject("jType", jType);
		isApplicableMatch.registerObject("uType", uType);
		isApplicableMatch.registerObject("returnParam", returnParam);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject m2o, EObject operation, EObject method,
			EObject ne2ne, EObject jType, EObject typeAccess, EObject ta2p, EObject uType, EObject returnParam) {
		ruleresult.registerObject("m2o", m2o);
		ruleresult.registerObject("operation", operation);
		ruleresult.registerObject("method", method);
		ruleresult.registerObject("ne2ne", ne2ne);
		ruleresult.registerObject("jType", jType);
		ruleresult.registerObject("typeAccess", typeAccess);
		ruleresult.registerObject("ta2p", ta2p);
		ruleresult.registerObject("uType", uType);
		ruleresult.registerObject("returnParam", returnParam);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("returnParam").eClass())
				.equals("uml.Parameter.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_994(EMoflonEdge _edge_ownedParameter) {

		Object[] result1_bindingAndBlack = TypeAccess2ReturnParamImpl
				.pattern_TypeAccess2ReturnParam_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = TypeAccess2ReturnParamImpl
				.pattern_TypeAccess2ReturnParam_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : TypeAccess2ReturnParamImpl
				.pattern_TypeAccess2ReturnParam_20_2_testcorematchandDECs_blackFFFB(_edge_ownedParameter)) {
			Operation operation = (Operation) result2_black[0];
			org.eclipse.uml2.uml.Type uType = (org.eclipse.uml2.uml.Type) result2_black[1];
			Parameter returnParam = (Parameter) result2_black[2];
			Object[] result2_green = TypeAccess2ReturnParamImpl
					.pattern_TypeAccess2ReturnParam_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (TypeAccess2ReturnParamImpl
					.pattern_TypeAccess2ReturnParam_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
							this, match, operation, uType, returnParam)) {
				// 
				if (TypeAccess2ReturnParamImpl
						.pattern_TypeAccess2ReturnParam_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = TypeAccess2ReturnParamImpl
							.pattern_TypeAccess2ReturnParam_20_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					TypeAccess2ReturnParamImpl.pattern_TypeAccess2ReturnParam_20_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return TypeAccess2ReturnParamImpl.pattern_TypeAccess2ReturnParam_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_1018(EMoflonEdge _edge_type) {

		Object[] result1_bindingAndBlack = TypeAccess2ReturnParamImpl
				.pattern_TypeAccess2ReturnParam_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = TypeAccess2ReturnParamImpl
				.pattern_TypeAccess2ReturnParam_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : TypeAccess2ReturnParamImpl
				.pattern_TypeAccess2ReturnParam_21_2_testcorematchandDECs_blackFFFB(_edge_type)) {
			MethodDeclaration method = (MethodDeclaration) result2_black[0];
			Type jType = (Type) result2_black[1];
			TypeAccess typeAccess = (TypeAccess) result2_black[2];
			Object[] result2_green = TypeAccess2ReturnParamImpl
					.pattern_TypeAccess2ReturnParam_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (TypeAccess2ReturnParamImpl
					.pattern_TypeAccess2ReturnParam_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
							this, match, method, jType, typeAccess)) {
				// 
				if (TypeAccess2ReturnParamImpl
						.pattern_TypeAccess2ReturnParam_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = TypeAccess2ReturnParamImpl
							.pattern_TypeAccess2ReturnParam_21_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					TypeAccess2ReturnParamImpl.pattern_TypeAccess2ReturnParam_21_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return TypeAccess2ReturnParamImpl.pattern_TypeAccess2ReturnParam_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("TypeAccess2ReturnParam");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		Variable var_returnParam_direction = CSPFactoryHelper.eINSTANCE.createVariable("returnParam", true, csp);
		var_returnParam_direction.setValue(__helper.getValue("returnParam", "direction"));
		var_returnParam_direction.setType("uml.ParameterDirectionKind");

		IsReturn isReturn0 = new IsReturn();
		csp.getConstraints().add(isReturn0);

		isReturn0.setRuleName("TypeAccess2ReturnParam");
		isReturn0.solve(var_returnParam_direction);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_returnParam_direction.setBound(false);
			isReturn0.solve(var_returnParam_direction);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
				__helper.setValue("returnParam", "direction", var_returnParam_direction.getValue());
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
		ruleResult.setRule("TypeAccess2ReturnParam");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		Variable var_returnParam_direction = CSPFactoryHelper.eINSTANCE.createVariable("returnParam", true, csp);
		var_returnParam_direction.setValue(__helper.getValue("returnParam", "direction"));
		var_returnParam_direction.setType("uml.ParameterDirectionKind");

		IsReturn isReturn0 = new IsReturn();
		csp.getConstraints().add(isReturn0);

		isReturn0.setRuleName("TypeAccess2ReturnParam");
		isReturn0.solve(var_returnParam_direction);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			isReturn0.solve(var_returnParam_direction);
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

		Object[] result1_black = TypeAccess2ReturnParamImpl.pattern_TypeAccess2ReturnParam_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = TypeAccess2ReturnParamImpl.pattern_TypeAccess2ReturnParam_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = TypeAccess2ReturnParamImpl
				.pattern_TypeAccess2ReturnParam_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFBB(sourceMatch,
						targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		Operation operation = (Operation) result2_bindingAndBlack[0];
		MethodDeclaration method = (MethodDeclaration) result2_bindingAndBlack[1];
		Type jType = (Type) result2_bindingAndBlack[2];
		TypeAccess typeAccess = (TypeAccess) result2_bindingAndBlack[3];
		org.eclipse.uml2.uml.Type uType = (org.eclipse.uml2.uml.Type) result2_bindingAndBlack[4];
		Parameter returnParam = (Parameter) result2_bindingAndBlack[5];

		Object[] result3_bindingAndBlack = TypeAccess2ReturnParamImpl
				.pattern_TypeAccess2ReturnParam_24_3_solvecsp_bindingAndBlackFBBBBBBBBB(this, operation, method, jType,
						typeAccess, uType, returnParam, sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[operation] = " + operation + ", " + "[method] = " + method + ", " + "[jType] = " + jType + ", "
					+ "[typeAccess] = " + typeAccess + ", " + "[uType] = " + uType + ", " + "[returnParam] = "
					+ returnParam + ", " + "[sourceMatch] = " + sourceMatch + ", " + "[targetMatch] = " + targetMatch
					+ ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (TypeAccess2ReturnParamImpl.pattern_TypeAccess2ReturnParam_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : TypeAccess2ReturnParamImpl
					.pattern_TypeAccess2ReturnParam_24_5_matchcorrcontext_blackFBBFBBBB(operation, method, jType, uType,
							sourceMatch, targetMatch)) {
				NamedElement2NamedElement m2o = (NamedElement2NamedElement) result5_black[0];
				NamedElement2NamedElement ne2ne = (NamedElement2NamedElement) result5_black[3];
				Object[] result5_green = TypeAccess2ReturnParamImpl
						.pattern_TypeAccess2ReturnParam_24_5_matchcorrcontext_greenBBBBF(m2o, ne2ne, sourceMatch,
								targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[4];

				Object[] result6_black = TypeAccess2ReturnParamImpl
						.pattern_TypeAccess2ReturnParam_24_6_createcorrespondence_blackBBBBBBB(operation, method, jType,
								typeAccess, uType, returnParam, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[operation] = "
							+ operation + ", " + "[method] = " + method + ", " + "[jType] = " + jType + ", "
							+ "[typeAccess] = " + typeAccess + ", " + "[uType] = " + uType + ", " + "[returnParam] = "
							+ returnParam + ", " + "[ccMatch] = " + ccMatch + ".");
				}
				TypeAccess2ReturnParamImpl.pattern_TypeAccess2ReturnParam_24_6_createcorrespondence_greenBFBB(
						typeAccess, returnParam, ccMatch);
				//nothing TypeAccess2Parameter ta2p = (TypeAccess2Parameter) result6_green[1];

				Object[] result7_black = TypeAccess2ReturnParamImpl
						.pattern_TypeAccess2ReturnParam_24_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				TypeAccess2ReturnParamImpl.pattern_TypeAccess2ReturnParam_24_7_addtoreturnedresult_greenBB(result,
						ccMatch);

			}

		} else {
		}
		return TypeAccess2ReturnParamImpl.pattern_TypeAccess2ReturnParam_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(Operation operation, MethodDeclaration method, Type jType,
			TypeAccess typeAccess, org.eclipse.uml2.uml.Type uType, Parameter returnParam, Match sourceMatch,
			Match targetMatch) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals

		// Create attribute variables
		Variable var_returnParam_direction = CSPFactoryHelper.eINSTANCE.createVariable("returnParam.direction", true,
				csp);
		var_returnParam_direction.setValue(returnParam.getDirection());
		var_returnParam_direction.setType("uml.ParameterDirectionKind");

		// Create unbound variables

		// Create constraints
		IsReturn isReturn = new IsReturn();

		csp.getConstraints().add(isReturn);

		// Solve CSP
		isReturn.setRuleName("NoRuleName");
		isReturn.solve(var_returnParam_direction);
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
	public boolean checkDEC_FWD(MethodDeclaration method, Type jType, TypeAccess typeAccess) {// 
		Object[] result1_black = TypeAccess2ReturnParamImpl
				.pattern_TypeAccess2ReturnParam_27_1_matchtggpattern_blackBBB(method, jType, typeAccess);
		if (result1_black != null) {
			return TypeAccess2ReturnParamImpl.pattern_TypeAccess2ReturnParam_27_2_expressionF();
		} else {
			return TypeAccess2ReturnParamImpl.pattern_TypeAccess2ReturnParam_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(Operation operation, org.eclipse.uml2.uml.Type uType, Parameter returnParam) {// 
		Object[] result1_black = TypeAccess2ReturnParamImpl
				.pattern_TypeAccess2ReturnParam_28_1_matchtggpattern_blackBBB(operation, uType, returnParam);
		if (result1_black != null) {
			return TypeAccess2ReturnParamImpl.pattern_TypeAccess2ReturnParam_28_2_expressionF();
		} else {
			return TypeAccess2ReturnParamImpl.pattern_TypeAccess2ReturnParam_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer,
			NamedElement2NamedElement m2oParameter, NamedElement2NamedElement ne2neParameter) {

		Object[] result1_black = TypeAccess2ReturnParamImpl
				.pattern_TypeAccess2ReturnParam_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = TypeAccess2ReturnParamImpl.pattern_TypeAccess2ReturnParam_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : TypeAccess2ReturnParamImpl
				.pattern_TypeAccess2ReturnParam_29_2_isapplicablecore_blackFFFFFFFFBB(ruleEntryContainer, ruleResult)) {
			//nothing RuleEntryList m2oList = (RuleEntryList) result2_black[0];
			NamedElement2NamedElement m2o = (NamedElement2NamedElement) result2_black[1];
			Operation operation = (Operation) result2_black[2];
			MethodDeclaration method = (MethodDeclaration) result2_black[3];
			//nothing RuleEntryList ne2neList = (RuleEntryList) result2_black[4];
			NamedElement2NamedElement ne2ne = (NamedElement2NamedElement) result2_black[5];
			Type jType = (Type) result2_black[6];
			org.eclipse.uml2.uml.Type uType = (org.eclipse.uml2.uml.Type) result2_black[7];

			Object[] result3_bindingAndBlack = TypeAccess2ReturnParamImpl
					.pattern_TypeAccess2ReturnParam_29_3_solveCSP_bindingAndBlackFBBBBBBBBB(this, isApplicableMatch,
							m2o, operation, method, ne2ne, jType, uType, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[m2o] = " + m2o + ", "
						+ "[operation] = " + operation + ", " + "[method] = " + method + ", " + "[ne2ne] = " + ne2ne
						+ ", " + "[jType] = " + jType + ", " + "[uType] = " + uType + ", " + "[ruleResult] = "
						+ ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (TypeAccess2ReturnParamImpl.pattern_TypeAccess2ReturnParam_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = TypeAccess2ReturnParamImpl
						.pattern_TypeAccess2ReturnParam_29_5_checknacs_blackBBBBBB(m2o, operation, method, ne2ne, jType,
								uType);
				if (result5_black != null) {

					Object[] result6_black = TypeAccess2ReturnParamImpl
							.pattern_TypeAccess2ReturnParam_29_6_perform_blackBBBBBBB(m2o, operation, method, ne2ne,
									jType, uType, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[m2o] = " + m2o + ", "
								+ "[operation] = " + operation + ", " + "[method] = " + method + ", " + "[ne2ne] = "
								+ ne2ne + ", " + "[jType] = " + jType + ", " + "[uType] = " + uType + ", "
								+ "[ruleResult] = " + ruleResult + ".");
					}
					TypeAccess2ReturnParamImpl.pattern_TypeAccess2ReturnParam_29_6_perform_greenBBBFFBFBB(operation,
							method, jType, uType, ruleResult, csp);
					//nothing TypeAccess typeAccess = (TypeAccess) result6_green[3];
					//nothing TypeAccess2Parameter ta2p = (TypeAccess2Parameter) result6_green[4];
					//nothing Parameter returnParam = (Parameter) result6_green[6];

				} else {
				}

			} else {
			}

		}
		return TypeAccess2ReturnParamImpl.pattern_TypeAccess2ReturnParam_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, NamedElement2NamedElement m2o,
			Operation operation, MethodDeclaration method, NamedElement2NamedElement ne2ne, Type jType,
			org.eclipse.uml2.uml.Type uType, ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables
		Variable var_returnParam_direction = CSPFactoryHelper.eINSTANCE.createVariable("returnParam.direction", csp);
		var_returnParam_direction.setType("uml.ParameterDirectionKind");

		// Create constraints
		IsReturn isReturn = new IsReturn();

		csp.getConstraints().add(isReturn);

		// Solve CSP
		isReturn.setRuleName("NoRuleName");
		isReturn.solve(var_returnParam_direction);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("m2o", m2o);
		isApplicableMatch.registerObject("operation", operation);
		isApplicableMatch.registerObject("method", method);
		isApplicableMatch.registerObject("ne2ne", ne2ne);
		isApplicableMatch.registerObject("jType", jType);
		isApplicableMatch.registerObject("uType", uType);
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
		case RulesPackage.TYPE_ACCESS2_RETURN_PARAM___IS_APPROPRIATE_FWD__MATCH_METHODDECLARATION_TYPE_TYPEACCESS:
			return isAppropriate_FWD((Match) arguments.get(0), (MethodDeclaration) arguments.get(1),
					(Type) arguments.get(2), (TypeAccess) arguments.get(3));
		case RulesPackage.TYPE_ACCESS2_RETURN_PARAM___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.TYPE_ACCESS2_RETURN_PARAM___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.TYPE_ACCESS2_RETURN_PARAM___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_METHODDECLARATION_TYPE_TYPEACCESS:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (MethodDeclaration) arguments.get(1),
					(Type) arguments.get(2), (TypeAccess) arguments.get(3));
			return null;
		case RulesPackage.TYPE_ACCESS2_RETURN_PARAM___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_METHODDECLARATION_TYPE_TYPEACCESS:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (MethodDeclaration) arguments.get(1),
					(Type) arguments.get(2), (TypeAccess) arguments.get(3));
		case RulesPackage.TYPE_ACCESS2_RETURN_PARAM___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.TYPE_ACCESS2_RETURN_PARAM___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_NAMEDELEMENT2NAMEDELEMENT_OPERATION_METHODDECLARATION_NAMEDELEMENT2NAMEDELEMENT_TYPE_TYPEACCESS_TYPE:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0),
					(NamedElement2NamedElement) arguments.get(1), (Operation) arguments.get(2),
					(MethodDeclaration) arguments.get(3), (NamedElement2NamedElement) arguments.get(4),
					(Type) arguments.get(5), (TypeAccess) arguments.get(6),
					(org.eclipse.uml2.uml.Type) arguments.get(7));
		case RulesPackage.TYPE_ACCESS2_RETURN_PARAM___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.TYPE_ACCESS2_RETURN_PARAM___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9));
			return null;
		case RulesPackage.TYPE_ACCESS2_RETURN_PARAM___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.TYPE_ACCESS2_RETURN_PARAM___IS_APPROPRIATE_BWD__MATCH_OPERATION_TYPE_PARAMETER:
			return isAppropriate_BWD((Match) arguments.get(0), (Operation) arguments.get(1),
					(org.eclipse.uml2.uml.Type) arguments.get(2), (Parameter) arguments.get(3));
		case RulesPackage.TYPE_ACCESS2_RETURN_PARAM___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.TYPE_ACCESS2_RETURN_PARAM___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.TYPE_ACCESS2_RETURN_PARAM___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_OPERATION_TYPE_PARAMETER:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (Operation) arguments.get(1),
					(org.eclipse.uml2.uml.Type) arguments.get(2), (Parameter) arguments.get(3));
			return null;
		case RulesPackage.TYPE_ACCESS2_RETURN_PARAM___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_OPERATION_TYPE_PARAMETER:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (Operation) arguments.get(1),
					(org.eclipse.uml2.uml.Type) arguments.get(2), (Parameter) arguments.get(3));
		case RulesPackage.TYPE_ACCESS2_RETURN_PARAM___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.TYPE_ACCESS2_RETURN_PARAM___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_NAMEDELEMENT2NAMEDELEMENT_OPERATION_METHODDECLARATION_NAMEDELEMENT2NAMEDELEMENT_TYPE_TYPE_PARAMETER:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
					(NamedElement2NamedElement) arguments.get(1), (Operation) arguments.get(2),
					(MethodDeclaration) arguments.get(3), (NamedElement2NamedElement) arguments.get(4),
					(Type) arguments.get(5), (org.eclipse.uml2.uml.Type) arguments.get(6),
					(Parameter) arguments.get(7));
		case RulesPackage.TYPE_ACCESS2_RETURN_PARAM___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.TYPE_ACCESS2_RETURN_PARAM___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9));
			return null;
		case RulesPackage.TYPE_ACCESS2_RETURN_PARAM___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.TYPE_ACCESS2_RETURN_PARAM___IS_APPROPRIATE_BWD_EMOFLON_EDGE_994__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_994((EMoflonEdge) arguments.get(0));
		case RulesPackage.TYPE_ACCESS2_RETURN_PARAM___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1018__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_1018((EMoflonEdge) arguments.get(0));
		case RulesPackage.TYPE_ACCESS2_RETURN_PARAM___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.TYPE_ACCESS2_RETURN_PARAM___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.TYPE_ACCESS2_RETURN_PARAM___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.TYPE_ACCESS2_RETURN_PARAM___IS_APPLICABLE_SOLVE_CSP_CC__OPERATION_METHODDECLARATION_TYPE_TYPEACCESS_TYPE_PARAMETER_MATCH_MATCH:
			return isApplicable_solveCsp_CC((Operation) arguments.get(0), (MethodDeclaration) arguments.get(1),
					(Type) arguments.get(2), (TypeAccess) arguments.get(3),
					(org.eclipse.uml2.uml.Type) arguments.get(4), (Parameter) arguments.get(5),
					(Match) arguments.get(6), (Match) arguments.get(7));
		case RulesPackage.TYPE_ACCESS2_RETURN_PARAM___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.TYPE_ACCESS2_RETURN_PARAM___CHECK_DEC_FWD__METHODDECLARATION_TYPE_TYPEACCESS:
			return checkDEC_FWD((MethodDeclaration) arguments.get(0), (Type) arguments.get(1),
					(TypeAccess) arguments.get(2));
		case RulesPackage.TYPE_ACCESS2_RETURN_PARAM___CHECK_DEC_BWD__OPERATION_TYPE_PARAMETER:
			return checkDEC_BWD((Operation) arguments.get(0), (org.eclipse.uml2.uml.Type) arguments.get(1),
					(Parameter) arguments.get(2));
		case RulesPackage.TYPE_ACCESS2_RETURN_PARAM___GENERATE_MODEL__RULEENTRYCONTAINER_NAMEDELEMENT2NAMEDELEMENT_NAMEDELEMENT2NAMEDELEMENT:
			return generateModel((RuleEntryContainer) arguments.get(0), (NamedElement2NamedElement) arguments.get(1),
					(NamedElement2NamedElement) arguments.get(2));
		case RulesPackage.TYPE_ACCESS2_RETURN_PARAM___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_NAMEDELEMENT2NAMEDELEMENT_OPERATION_METHODDECLARATION_NAMEDELEMENT2NAMEDELEMENT_TYPE_TYPE_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
					(NamedElement2NamedElement) arguments.get(1), (Operation) arguments.get(2),
					(MethodDeclaration) arguments.get(3), (NamedElement2NamedElement) arguments.get(4),
					(Type) arguments.get(5), (org.eclipse.uml2.uml.Type) arguments.get(6),
					(ModelgeneratorRuleResult) arguments.get(7));
		case RulesPackage.TYPE_ACCESS2_RETURN_PARAM___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_0_1_initialbindings_blackBBBBB(
			TypeAccess2ReturnParam _this, Match match, MethodDeclaration method, Type jType, TypeAccess typeAccess) {
		return new Object[] { _this, match, method, jType, typeAccess };
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_0_2_SolveCSP_bindingFBBBBB(TypeAccess2ReturnParam _this,
			Match match, MethodDeclaration method, Type jType, TypeAccess typeAccess) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, method, jType, typeAccess);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, method, jType, typeAccess };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_0_2_SolveCSP_bindingAndBlackFBBBBB(
			TypeAccess2ReturnParam _this, Match match, MethodDeclaration method, Type jType, TypeAccess typeAccess) {
		Object[] result_pattern_TypeAccess2ReturnParam_0_2_SolveCSP_binding = pattern_TypeAccess2ReturnParam_0_2_SolveCSP_bindingFBBBBB(
				_this, match, method, jType, typeAccess);
		if (result_pattern_TypeAccess2ReturnParam_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_TypeAccess2ReturnParam_0_2_SolveCSP_binding[0];

			Object[] result_pattern_TypeAccess2ReturnParam_0_2_SolveCSP_black = pattern_TypeAccess2ReturnParam_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_TypeAccess2ReturnParam_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, method, jType, typeAccess };
			}
		}
		return null;
	}

	public static final boolean pattern_TypeAccess2ReturnParam_0_3_CheckCSP_expressionFBB(TypeAccess2ReturnParam _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_0_4_collectelementstobetranslated_blackBBBB(Match match,
			MethodDeclaration method, Type jType, TypeAccess typeAccess) {
		return new Object[] { match, method, jType, typeAccess };
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_0_4_collectelementstobetranslated_greenBBBBFFF(
			Match match, MethodDeclaration method, Type jType, TypeAccess typeAccess) {
		EMoflonEdge typeAccess__jType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge jType__typeAccess____usagesInTypeAccess = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge method__typeAccess____returnType = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(typeAccess);
		String typeAccess__jType____type_name_prime = "type";
		String jType__typeAccess____usagesInTypeAccess_name_prime = "usagesInTypeAccess";
		String method__typeAccess____returnType_name_prime = "returnType";
		typeAccess__jType____type.setSrc(typeAccess);
		typeAccess__jType____type.setTrg(jType);
		match.getToBeTranslatedEdges().add(typeAccess__jType____type);
		jType__typeAccess____usagesInTypeAccess.setSrc(jType);
		jType__typeAccess____usagesInTypeAccess.setTrg(typeAccess);
		match.getToBeTranslatedEdges().add(jType__typeAccess____usagesInTypeAccess);
		method__typeAccess____returnType.setSrc(method);
		method__typeAccess____returnType.setTrg(typeAccess);
		match.getToBeTranslatedEdges().add(method__typeAccess____returnType);
		typeAccess__jType____type.setName(typeAccess__jType____type_name_prime);
		jType__typeAccess____usagesInTypeAccess.setName(jType__typeAccess____usagesInTypeAccess_name_prime);
		method__typeAccess____returnType.setName(method__typeAccess____returnType_name_prime);
		return new Object[] { match, method, jType, typeAccess, typeAccess__jType____type,
				jType__typeAccess____usagesInTypeAccess, method__typeAccess____returnType };
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_0_5_collectcontextelements_blackBBBB(Match match,
			MethodDeclaration method, Type jType, TypeAccess typeAccess) {
		return new Object[] { match, method, jType, typeAccess };
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_0_5_collectcontextelements_greenBBB(Match match,
			MethodDeclaration method, Type jType) {
		match.getContextNodes().add(method);
		match.getContextNodes().add(jType);
		return new Object[] { match, method, jType };
	}

	public static final void pattern_TypeAccess2ReturnParam_0_6_registerobjectstomatch_expressionBBBBB(
			TypeAccess2ReturnParam _this, Match match, MethodDeclaration method, Type jType, TypeAccess typeAccess) {
		_this.registerObjectsToMatch_FWD(match, method, jType, typeAccess);

	}

	public static final boolean pattern_TypeAccess2ReturnParam_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_TypeAccess2ReturnParam_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_1_1_performtransformation_bindingFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("m2o");
		EObject _localVariable_1 = isApplicableMatch.getObject("operation");
		EObject _localVariable_2 = isApplicableMatch.getObject("method");
		EObject _localVariable_3 = isApplicableMatch.getObject("ne2ne");
		EObject _localVariable_4 = isApplicableMatch.getObject("jType");
		EObject _localVariable_5 = isApplicableMatch.getObject("typeAccess");
		EObject _localVariable_6 = isApplicableMatch.getObject("uType");
		EObject tmpM2o = _localVariable_0;
		EObject tmpOperation = _localVariable_1;
		EObject tmpMethod = _localVariable_2;
		EObject tmpNe2ne = _localVariable_3;
		EObject tmpJType = _localVariable_4;
		EObject tmpTypeAccess = _localVariable_5;
		EObject tmpUType = _localVariable_6;
		if (tmpM2o instanceof NamedElement2NamedElement) {
			NamedElement2NamedElement m2o = (NamedElement2NamedElement) tmpM2o;
			if (tmpOperation instanceof Operation) {
				Operation operation = (Operation) tmpOperation;
				if (tmpMethod instanceof MethodDeclaration) {
					MethodDeclaration method = (MethodDeclaration) tmpMethod;
					if (tmpNe2ne instanceof NamedElement2NamedElement) {
						NamedElement2NamedElement ne2ne = (NamedElement2NamedElement) tmpNe2ne;
						if (tmpJType instanceof Type) {
							Type jType = (Type) tmpJType;
							if (tmpTypeAccess instanceof TypeAccess) {
								TypeAccess typeAccess = (TypeAccess) tmpTypeAccess;
								if (tmpUType instanceof org.eclipse.uml2.uml.Type) {
									org.eclipse.uml2.uml.Type uType = (org.eclipse.uml2.uml.Type) tmpUType;
									return new Object[] { m2o, operation, method, ne2ne, jType, typeAccess, uType,
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

	public static final Object[] pattern_TypeAccess2ReturnParam_1_1_performtransformation_blackBBBBBBBFBB(
			NamedElement2NamedElement m2o, Operation operation, MethodDeclaration method,
			NamedElement2NamedElement ne2ne, Type jType, TypeAccess typeAccess, org.eclipse.uml2.uml.Type uType,
			TypeAccess2ReturnParam _this, IsApplicableMatch isApplicableMatch) {
		if (!m2o.equals(ne2ne)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { m2o, operation, method, ne2ne, jType, typeAccess, uType, csp, _this,
							isApplicableMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_1_1_performtransformation_bindingAndBlackFFFFFFFFBB(
			TypeAccess2ReturnParam _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_TypeAccess2ReturnParam_1_1_performtransformation_binding = pattern_TypeAccess2ReturnParam_1_1_performtransformation_bindingFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_TypeAccess2ReturnParam_1_1_performtransformation_binding != null) {
			NamedElement2NamedElement m2o = (NamedElement2NamedElement) result_pattern_TypeAccess2ReturnParam_1_1_performtransformation_binding[0];
			Operation operation = (Operation) result_pattern_TypeAccess2ReturnParam_1_1_performtransformation_binding[1];
			MethodDeclaration method = (MethodDeclaration) result_pattern_TypeAccess2ReturnParam_1_1_performtransformation_binding[2];
			NamedElement2NamedElement ne2ne = (NamedElement2NamedElement) result_pattern_TypeAccess2ReturnParam_1_1_performtransformation_binding[3];
			Type jType = (Type) result_pattern_TypeAccess2ReturnParam_1_1_performtransformation_binding[4];
			TypeAccess typeAccess = (TypeAccess) result_pattern_TypeAccess2ReturnParam_1_1_performtransformation_binding[5];
			org.eclipse.uml2.uml.Type uType = (org.eclipse.uml2.uml.Type) result_pattern_TypeAccess2ReturnParam_1_1_performtransformation_binding[6];

			Object[] result_pattern_TypeAccess2ReturnParam_1_1_performtransformation_black = pattern_TypeAccess2ReturnParam_1_1_performtransformation_blackBBBBBBBFBB(
					m2o, operation, method, ne2ne, jType, typeAccess, uType, _this, isApplicableMatch);
			if (result_pattern_TypeAccess2ReturnParam_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_TypeAccess2ReturnParam_1_1_performtransformation_black[7];

				return new Object[] { m2o, operation, method, ne2ne, jType, typeAccess, uType, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_1_1_performtransformation_greenBBFBFB(
			Operation operation, TypeAccess typeAccess, org.eclipse.uml2.uml.Type uType, CSP csp) {
		TypeAccess2Parameter ta2p = UmlFactory.eINSTANCE.createTypeAccess2Parameter();
		Parameter returnParam = UMLFactory.eINSTANCE.createParameter();
		Object _localVariable_0 = csp.getValue("returnParam", "direction");
		ta2p.setSource(typeAccess);
		operation.getOwnedParameters().add(returnParam);
		ta2p.setTarget(returnParam);
		returnParam.setType(uType);
		ParameterDirectionKind returnParam_direction_prime = (ParameterDirectionKind) _localVariable_0;
		returnParam.setDirection(returnParam_direction_prime);
		return new Object[] { operation, typeAccess, ta2p, uType, returnParam, csp };
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_1_2_collecttranslatedelements_blackBBB(
			TypeAccess typeAccess, TypeAccess2Parameter ta2p, Parameter returnParam) {
		return new Object[] { typeAccess, ta2p, returnParam };
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_1_2_collecttranslatedelements_greenFBBB(
			TypeAccess typeAccess, TypeAccess2Parameter ta2p, Parameter returnParam) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(typeAccess);
		ruleresult.getCreatedLinkElements().add(ta2p);
		ruleresult.getCreatedElements().add(returnParam);
		return new Object[] { ruleresult, typeAccess, ta2p, returnParam };
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_1_3_bookkeepingforedges_blackBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject m2o, EObject operation, EObject method, EObject ne2ne, EObject jType,
			EObject typeAccess, EObject ta2p, EObject uType, EObject returnParam) {
		if (!m2o.equals(operation)) {
			if (!m2o.equals(method)) {
				if (!m2o.equals(ne2ne)) {
					if (!m2o.equals(typeAccess)) {
						if (!m2o.equals(ta2p)) {
							if (!m2o.equals(uType)) {
								if (!m2o.equals(returnParam)) {
									if (!operation.equals(typeAccess)) {
										if (!operation.equals(ta2p)) {
											if (!operation.equals(uType)) {
												if (!operation.equals(returnParam)) {
													if (!method.equals(operation)) {
														if (!method.equals(ne2ne)) {
															if (!method.equals(typeAccess)) {
																if (!method.equals(ta2p)) {
																	if (!method.equals(uType)) {
																		if (!method.equals(returnParam)) {
																			if (!ne2ne.equals(operation)) {
																				if (!ne2ne.equals(typeAccess)) {
																					if (!ne2ne.equals(ta2p)) {
																						if (!ne2ne.equals(uType)) {
																							if (!ne2ne.equals(
																									returnParam)) {
																								if (!jType
																										.equals(m2o)) {
																									if (!jType.equals(
																											operation)) {
																										if (!jType
																												.equals(method)) {
																											if (!jType
																													.equals(ne2ne)) {
																												if (!jType
																														.equals(typeAccess)) {
																													if (!jType
																															.equals(ta2p)) {
																														if (!jType
																																.equals(uType)) {
																															if (!jType
																																	.equals(returnParam)) {
																																if (!typeAccess
																																		.equals(uType)) {
																																	if (!ta2p
																																			.equals(typeAccess)) {
																																		if (!ta2p
																																				.equals(uType)) {
																																			if (!returnParam
																																					.equals(typeAccess)) {
																																				if (!returnParam
																																						.equals(ta2p)) {
																																					if (!returnParam
																																							.equals(uType)) {
																																						return new Object[] {
																																								ruleresult,
																																								m2o,
																																								operation,
																																								method,
																																								ne2ne,
																																								jType,
																																								typeAccess,
																																								ta2p,
																																								uType,
																																								returnParam };
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_TypeAccess2ReturnParam_1_3_bookkeepingforedges_greenBBBBBBBBFFFFFFF(
			PerformRuleResult ruleresult, EObject operation, EObject method, EObject jType, EObject typeAccess,
			EObject ta2p, EObject uType, EObject returnParam) {
		EMoflonEdge operation__returnParam____ownedParameter = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge typeAccess__jType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge jType__typeAccess____usagesInTypeAccess = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge ta2p__typeAccess____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge method__typeAccess____returnType = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge ta2p__returnParam____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge returnParam__uType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "TypeAccess2ReturnParam";
		String operation__returnParam____ownedParameter_name_prime = "ownedParameter";
		String typeAccess__jType____type_name_prime = "type";
		String jType__typeAccess____usagesInTypeAccess_name_prime = "usagesInTypeAccess";
		String ta2p__typeAccess____source_name_prime = "source";
		String method__typeAccess____returnType_name_prime = "returnType";
		String ta2p__returnParam____target_name_prime = "target";
		String returnParam__uType____type_name_prime = "type";
		operation__returnParam____ownedParameter.setSrc(operation);
		operation__returnParam____ownedParameter.setTrg(returnParam);
		ruleresult.getCreatedEdges().add(operation__returnParam____ownedParameter);
		typeAccess__jType____type.setSrc(typeAccess);
		typeAccess__jType____type.setTrg(jType);
		ruleresult.getTranslatedEdges().add(typeAccess__jType____type);
		jType__typeAccess____usagesInTypeAccess.setSrc(jType);
		jType__typeAccess____usagesInTypeAccess.setTrg(typeAccess);
		ruleresult.getTranslatedEdges().add(jType__typeAccess____usagesInTypeAccess);
		ta2p__typeAccess____source.setSrc(ta2p);
		ta2p__typeAccess____source.setTrg(typeAccess);
		ruleresult.getCreatedEdges().add(ta2p__typeAccess____source);
		method__typeAccess____returnType.setSrc(method);
		method__typeAccess____returnType.setTrg(typeAccess);
		ruleresult.getTranslatedEdges().add(method__typeAccess____returnType);
		ta2p__returnParam____target.setSrc(ta2p);
		ta2p__returnParam____target.setTrg(returnParam);
		ruleresult.getCreatedEdges().add(ta2p__returnParam____target);
		returnParam__uType____type.setSrc(returnParam);
		returnParam__uType____type.setTrg(uType);
		ruleresult.getCreatedEdges().add(returnParam__uType____type);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		operation__returnParam____ownedParameter.setName(operation__returnParam____ownedParameter_name_prime);
		typeAccess__jType____type.setName(typeAccess__jType____type_name_prime);
		jType__typeAccess____usagesInTypeAccess.setName(jType__typeAccess____usagesInTypeAccess_name_prime);
		ta2p__typeAccess____source.setName(ta2p__typeAccess____source_name_prime);
		method__typeAccess____returnType.setName(method__typeAccess____returnType_name_prime);
		ta2p__returnParam____target.setName(ta2p__returnParam____target_name_prime);
		returnParam__uType____type.setName(returnParam__uType____type_name_prime);
		return new Object[] { ruleresult, operation, method, jType, typeAccess, ta2p, uType, returnParam,
				operation__returnParam____ownedParameter, typeAccess__jType____type,
				jType__typeAccess____usagesInTypeAccess, ta2p__typeAccess____source, method__typeAccess____returnType,
				ta2p__returnParam____target, returnParam__uType____type };
	}

	public static final void pattern_TypeAccess2ReturnParam_1_5_registerobjects_expressionBBBBBBBBBBB(
			TypeAccess2ReturnParam _this, PerformRuleResult ruleresult, EObject m2o, EObject operation, EObject method,
			EObject ne2ne, EObject jType, EObject typeAccess, EObject ta2p, EObject uType, EObject returnParam) {
		_this.registerObjects_FWD(ruleresult, m2o, operation, method, ne2ne, jType, typeAccess, ta2p, uType,
				returnParam);

	}

	public static final PerformRuleResult pattern_TypeAccess2ReturnParam_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_2_1_preparereturnvalue_bindingFB(
			TypeAccess2ReturnParam _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_2_1_preparereturnvalue_blackFBB(EClass eClass,
			TypeAccess2ReturnParam _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_2_1_preparereturnvalue_bindingAndBlackFFB(
			TypeAccess2ReturnParam _this) {
		Object[] result_pattern_TypeAccess2ReturnParam_2_1_preparereturnvalue_binding = pattern_TypeAccess2ReturnParam_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_TypeAccess2ReturnParam_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_TypeAccess2ReturnParam_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_TypeAccess2ReturnParam_2_1_preparereturnvalue_black = pattern_TypeAccess2ReturnParam_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_TypeAccess2ReturnParam_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_TypeAccess2ReturnParam_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_2_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "TypeAccess2ReturnParam";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_2_2_corematch_bindingFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("method");
		EObject _localVariable_1 = match.getObject("jType");
		EObject _localVariable_2 = match.getObject("typeAccess");
		EObject tmpMethod = _localVariable_0;
		EObject tmpJType = _localVariable_1;
		EObject tmpTypeAccess = _localVariable_2;
		if (tmpMethod instanceof MethodDeclaration) {
			MethodDeclaration method = (MethodDeclaration) tmpMethod;
			if (tmpJType instanceof Type) {
				Type jType = (Type) tmpJType;
				if (tmpTypeAccess instanceof TypeAccess) {
					TypeAccess typeAccess = (TypeAccess) tmpTypeAccess;
					return new Object[] { method, jType, typeAccess, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_TypeAccess2ReturnParam_2_2_corematch_blackFFBFBBFB(
			MethodDeclaration method, Type jType, TypeAccess typeAccess, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (NamedElement2NamedElement ne2ne : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(jType,
				NamedElement2NamedElement.class, "source")) {
			NamedElement tmpUType = ne2ne.getTarget();
			if (tmpUType instanceof org.eclipse.uml2.uml.Type) {
				org.eclipse.uml2.uml.Type uType = (org.eclipse.uml2.uml.Type) tmpUType;
				for (NamedElement2NamedElement m2o : org.moflon.core.utilities.eMoflonEMFUtil
						.getOppositeReferenceTyped(method, NamedElement2NamedElement.class, "source")) {
					if (!m2o.equals(ne2ne)) {
						NamedElement tmpOperation = m2o.getTarget();
						if (tmpOperation instanceof Operation) {
							Operation operation = (Operation) tmpOperation;
							_result.add(
									new Object[] { m2o, operation, method, ne2ne, jType, typeAccess, uType, match });
						}

					}
				}
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_TypeAccess2ReturnParam_2_3_findcontext_blackBBBBBBB(
			NamedElement2NamedElement m2o, Operation operation, MethodDeclaration method,
			NamedElement2NamedElement ne2ne, Type jType, TypeAccess typeAccess, org.eclipse.uml2.uml.Type uType) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!m2o.equals(ne2ne)) {
			if (operation.equals(m2o.getTarget())) {
				if (jType.equals(ne2ne.getSource())) {
					if (jType.equals(typeAccess.getType())) {
						if (typeAccess.equals(method.getReturnType())) {
							if (method.equals(m2o.getSource())) {
								if (uType.equals(ne2ne.getTarget())) {
									_result.add(
											new Object[] { m2o, operation, method, ne2ne, jType, typeAccess, uType });
								}
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_2_3_findcontext_greenBBBBBBBFFFFFFFF(
			NamedElement2NamedElement m2o, Operation operation, MethodDeclaration method,
			NamedElement2NamedElement ne2ne, Type jType, TypeAccess typeAccess, org.eclipse.uml2.uml.Type uType) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge m2o__operation____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge ne2ne__jType____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge typeAccess__jType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge jType__typeAccess____usagesInTypeAccess = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge method__typeAccess____returnType = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge m2o__method____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge ne2ne__uType____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String m2o__operation____target_name_prime = "target";
		String ne2ne__jType____source_name_prime = "source";
		String typeAccess__jType____type_name_prime = "type";
		String jType__typeAccess____usagesInTypeAccess_name_prime = "usagesInTypeAccess";
		String method__typeAccess____returnType_name_prime = "returnType";
		String m2o__method____source_name_prime = "source";
		String ne2ne__uType____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(m2o);
		isApplicableMatch.getAllContextElements().add(operation);
		isApplicableMatch.getAllContextElements().add(method);
		isApplicableMatch.getAllContextElements().add(ne2ne);
		isApplicableMatch.getAllContextElements().add(jType);
		isApplicableMatch.getAllContextElements().add(typeAccess);
		isApplicableMatch.getAllContextElements().add(uType);
		m2o__operation____target.setSrc(m2o);
		m2o__operation____target.setTrg(operation);
		isApplicableMatch.getAllContextElements().add(m2o__operation____target);
		ne2ne__jType____source.setSrc(ne2ne);
		ne2ne__jType____source.setTrg(jType);
		isApplicableMatch.getAllContextElements().add(ne2ne__jType____source);
		typeAccess__jType____type.setSrc(typeAccess);
		typeAccess__jType____type.setTrg(jType);
		isApplicableMatch.getAllContextElements().add(typeAccess__jType____type);
		jType__typeAccess____usagesInTypeAccess.setSrc(jType);
		jType__typeAccess____usagesInTypeAccess.setTrg(typeAccess);
		isApplicableMatch.getAllContextElements().add(jType__typeAccess____usagesInTypeAccess);
		method__typeAccess____returnType.setSrc(method);
		method__typeAccess____returnType.setTrg(typeAccess);
		isApplicableMatch.getAllContextElements().add(method__typeAccess____returnType);
		m2o__method____source.setSrc(m2o);
		m2o__method____source.setTrg(method);
		isApplicableMatch.getAllContextElements().add(m2o__method____source);
		ne2ne__uType____target.setSrc(ne2ne);
		ne2ne__uType____target.setTrg(uType);
		isApplicableMatch.getAllContextElements().add(ne2ne__uType____target);
		m2o__operation____target.setName(m2o__operation____target_name_prime);
		ne2ne__jType____source.setName(ne2ne__jType____source_name_prime);
		typeAccess__jType____type.setName(typeAccess__jType____type_name_prime);
		jType__typeAccess____usagesInTypeAccess.setName(jType__typeAccess____usagesInTypeAccess_name_prime);
		method__typeAccess____returnType.setName(method__typeAccess____returnType_name_prime);
		m2o__method____source.setName(m2o__method____source_name_prime);
		ne2ne__uType____target.setName(ne2ne__uType____target_name_prime);
		return new Object[] { m2o, operation, method, ne2ne, jType, typeAccess, uType, isApplicableMatch,
				m2o__operation____target, ne2ne__jType____source, typeAccess__jType____type,
				jType__typeAccess____usagesInTypeAccess, method__typeAccess____returnType, m2o__method____source,
				ne2ne__uType____target };
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_2_4_solveCSP_bindingFBBBBBBBBB(
			TypeAccess2ReturnParam _this, IsApplicableMatch isApplicableMatch, NamedElement2NamedElement m2o,
			Operation operation, MethodDeclaration method, NamedElement2NamedElement ne2ne, Type jType,
			TypeAccess typeAccess, org.eclipse.uml2.uml.Type uType) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, m2o, operation, method, ne2ne, jType,
				typeAccess, uType);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, m2o, operation, method, ne2ne, jType, typeAccess,
					uType };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_2_4_solveCSP_bindingAndBlackFBBBBBBBBB(
			TypeAccess2ReturnParam _this, IsApplicableMatch isApplicableMatch, NamedElement2NamedElement m2o,
			Operation operation, MethodDeclaration method, NamedElement2NamedElement ne2ne, Type jType,
			TypeAccess typeAccess, org.eclipse.uml2.uml.Type uType) {
		Object[] result_pattern_TypeAccess2ReturnParam_2_4_solveCSP_binding = pattern_TypeAccess2ReturnParam_2_4_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, m2o, operation, method, ne2ne, jType, typeAccess, uType);
		if (result_pattern_TypeAccess2ReturnParam_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_TypeAccess2ReturnParam_2_4_solveCSP_binding[0];

			Object[] result_pattern_TypeAccess2ReturnParam_2_4_solveCSP_black = pattern_TypeAccess2ReturnParam_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_TypeAccess2ReturnParam_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, m2o, operation, method, ne2ne, jType, typeAccess,
						uType };
			}
		}
		return null;
	}

	public static final boolean pattern_TypeAccess2ReturnParam_2_5_checkCSP_expressionFBB(TypeAccess2ReturnParam _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "TypeAccess2ReturnParam";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_TypeAccess2ReturnParam_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_10_1_initialbindings_blackBBBBB(
			TypeAccess2ReturnParam _this, Match match, Operation operation, org.eclipse.uml2.uml.Type uType,
			Parameter returnParam) {
		return new Object[] { _this, match, operation, uType, returnParam };
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_10_2_SolveCSP_bindingFBBBBB(
			TypeAccess2ReturnParam _this, Match match, Operation operation, org.eclipse.uml2.uml.Type uType,
			Parameter returnParam) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, operation, uType, returnParam);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, operation, uType, returnParam };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_10_2_SolveCSP_bindingAndBlackFBBBBB(
			TypeAccess2ReturnParam _this, Match match, Operation operation, org.eclipse.uml2.uml.Type uType,
			Parameter returnParam) {
		Object[] result_pattern_TypeAccess2ReturnParam_10_2_SolveCSP_binding = pattern_TypeAccess2ReturnParam_10_2_SolveCSP_bindingFBBBBB(
				_this, match, operation, uType, returnParam);
		if (result_pattern_TypeAccess2ReturnParam_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_TypeAccess2ReturnParam_10_2_SolveCSP_binding[0];

			Object[] result_pattern_TypeAccess2ReturnParam_10_2_SolveCSP_black = pattern_TypeAccess2ReturnParam_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_TypeAccess2ReturnParam_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, operation, uType, returnParam };
			}
		}
		return null;
	}

	public static final boolean pattern_TypeAccess2ReturnParam_10_3_CheckCSP_expressionFBB(TypeAccess2ReturnParam _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_10_4_collectelementstobetranslated_blackBBBB(
			Match match, Operation operation, org.eclipse.uml2.uml.Type uType, Parameter returnParam) {
		return new Object[] { match, operation, uType, returnParam };
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_10_4_collectelementstobetranslated_greenBBBBFF(
			Match match, Operation operation, org.eclipse.uml2.uml.Type uType, Parameter returnParam) {
		EMoflonEdge operation__returnParam____ownedParameter = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge returnParam__uType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(returnParam);
		String operation__returnParam____ownedParameter_name_prime = "ownedParameter";
		String returnParam__uType____type_name_prime = "type";
		operation__returnParam____ownedParameter.setSrc(operation);
		operation__returnParam____ownedParameter.setTrg(returnParam);
		match.getToBeTranslatedEdges().add(operation__returnParam____ownedParameter);
		returnParam__uType____type.setSrc(returnParam);
		returnParam__uType____type.setTrg(uType);
		match.getToBeTranslatedEdges().add(returnParam__uType____type);
		operation__returnParam____ownedParameter.setName(operation__returnParam____ownedParameter_name_prime);
		returnParam__uType____type.setName(returnParam__uType____type_name_prime);
		return new Object[] { match, operation, uType, returnParam, operation__returnParam____ownedParameter,
				returnParam__uType____type };
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_10_5_collectcontextelements_blackBBBB(Match match,
			Operation operation, org.eclipse.uml2.uml.Type uType, Parameter returnParam) {
		return new Object[] { match, operation, uType, returnParam };
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_10_5_collectcontextelements_greenBBB(Match match,
			Operation operation, org.eclipse.uml2.uml.Type uType) {
		match.getContextNodes().add(operation);
		match.getContextNodes().add(uType);
		return new Object[] { match, operation, uType };
	}

	public static final void pattern_TypeAccess2ReturnParam_10_6_registerobjectstomatch_expressionBBBBB(
			TypeAccess2ReturnParam _this, Match match, Operation operation, org.eclipse.uml2.uml.Type uType,
			Parameter returnParam) {
		_this.registerObjectsToMatch_BWD(match, operation, uType, returnParam);

	}

	public static final boolean pattern_TypeAccess2ReturnParam_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_TypeAccess2ReturnParam_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_11_1_performtransformation_bindingFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("m2o");
		EObject _localVariable_1 = isApplicableMatch.getObject("operation");
		EObject _localVariable_2 = isApplicableMatch.getObject("method");
		EObject _localVariable_3 = isApplicableMatch.getObject("ne2ne");
		EObject _localVariable_4 = isApplicableMatch.getObject("jType");
		EObject _localVariable_5 = isApplicableMatch.getObject("uType");
		EObject _localVariable_6 = isApplicableMatch.getObject("returnParam");
		EObject tmpM2o = _localVariable_0;
		EObject tmpOperation = _localVariable_1;
		EObject tmpMethod = _localVariable_2;
		EObject tmpNe2ne = _localVariable_3;
		EObject tmpJType = _localVariable_4;
		EObject tmpUType = _localVariable_5;
		EObject tmpReturnParam = _localVariable_6;
		if (tmpM2o instanceof NamedElement2NamedElement) {
			NamedElement2NamedElement m2o = (NamedElement2NamedElement) tmpM2o;
			if (tmpOperation instanceof Operation) {
				Operation operation = (Operation) tmpOperation;
				if (tmpMethod instanceof MethodDeclaration) {
					MethodDeclaration method = (MethodDeclaration) tmpMethod;
					if (tmpNe2ne instanceof NamedElement2NamedElement) {
						NamedElement2NamedElement ne2ne = (NamedElement2NamedElement) tmpNe2ne;
						if (tmpJType instanceof Type) {
							Type jType = (Type) tmpJType;
							if (tmpUType instanceof org.eclipse.uml2.uml.Type) {
								org.eclipse.uml2.uml.Type uType = (org.eclipse.uml2.uml.Type) tmpUType;
								if (tmpReturnParam instanceof Parameter) {
									Parameter returnParam = (Parameter) tmpReturnParam;
									return new Object[] { m2o, operation, method, ne2ne, jType, uType, returnParam,
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

	public static final Object[] pattern_TypeAccess2ReturnParam_11_1_performtransformation_blackBBBBBBBFBB(
			NamedElement2NamedElement m2o, Operation operation, MethodDeclaration method,
			NamedElement2NamedElement ne2ne, Type jType, org.eclipse.uml2.uml.Type uType, Parameter returnParam,
			TypeAccess2ReturnParam _this, IsApplicableMatch isApplicableMatch) {
		if (!m2o.equals(ne2ne)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { m2o, operation, method, ne2ne, jType, uType, returnParam, csp, _this,
							isApplicableMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_11_1_performtransformation_bindingAndBlackFFFFFFFFBB(
			TypeAccess2ReturnParam _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_TypeAccess2ReturnParam_11_1_performtransformation_binding = pattern_TypeAccess2ReturnParam_11_1_performtransformation_bindingFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_TypeAccess2ReturnParam_11_1_performtransformation_binding != null) {
			NamedElement2NamedElement m2o = (NamedElement2NamedElement) result_pattern_TypeAccess2ReturnParam_11_1_performtransformation_binding[0];
			Operation operation = (Operation) result_pattern_TypeAccess2ReturnParam_11_1_performtransformation_binding[1];
			MethodDeclaration method = (MethodDeclaration) result_pattern_TypeAccess2ReturnParam_11_1_performtransformation_binding[2];
			NamedElement2NamedElement ne2ne = (NamedElement2NamedElement) result_pattern_TypeAccess2ReturnParam_11_1_performtransformation_binding[3];
			Type jType = (Type) result_pattern_TypeAccess2ReturnParam_11_1_performtransformation_binding[4];
			org.eclipse.uml2.uml.Type uType = (org.eclipse.uml2.uml.Type) result_pattern_TypeAccess2ReturnParam_11_1_performtransformation_binding[5];
			Parameter returnParam = (Parameter) result_pattern_TypeAccess2ReturnParam_11_1_performtransformation_binding[6];

			Object[] result_pattern_TypeAccess2ReturnParam_11_1_performtransformation_black = pattern_TypeAccess2ReturnParam_11_1_performtransformation_blackBBBBBBBFBB(
					m2o, operation, method, ne2ne, jType, uType, returnParam, _this, isApplicableMatch);
			if (result_pattern_TypeAccess2ReturnParam_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_TypeAccess2ReturnParam_11_1_performtransformation_black[7];

				return new Object[] { m2o, operation, method, ne2ne, jType, uType, returnParam, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_11_1_performtransformation_greenBBFFB(
			MethodDeclaration method, Type jType, Parameter returnParam) {
		TypeAccess typeAccess = JavaFactory.eINSTANCE.createTypeAccess();
		TypeAccess2Parameter ta2p = UmlFactory.eINSTANCE.createTypeAccess2Parameter();
		typeAccess.setType(jType);
		method.setReturnType(typeAccess);
		ta2p.setSource(typeAccess);
		ta2p.setTarget(returnParam);
		return new Object[] { method, jType, typeAccess, ta2p, returnParam };
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_11_2_collecttranslatedelements_blackBBB(
			TypeAccess typeAccess, TypeAccess2Parameter ta2p, Parameter returnParam) {
		return new Object[] { typeAccess, ta2p, returnParam };
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_11_2_collecttranslatedelements_greenFBBB(
			TypeAccess typeAccess, TypeAccess2Parameter ta2p, Parameter returnParam) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(typeAccess);
		ruleresult.getCreatedLinkElements().add(ta2p);
		ruleresult.getTranslatedElements().add(returnParam);
		return new Object[] { ruleresult, typeAccess, ta2p, returnParam };
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_11_3_bookkeepingforedges_blackBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject m2o, EObject operation, EObject method, EObject ne2ne, EObject jType,
			EObject typeAccess, EObject ta2p, EObject uType, EObject returnParam) {
		if (!m2o.equals(operation)) {
			if (!m2o.equals(method)) {
				if (!m2o.equals(ne2ne)) {
					if (!m2o.equals(typeAccess)) {
						if (!m2o.equals(ta2p)) {
							if (!m2o.equals(uType)) {
								if (!m2o.equals(returnParam)) {
									if (!operation.equals(typeAccess)) {
										if (!operation.equals(ta2p)) {
											if (!operation.equals(uType)) {
												if (!operation.equals(returnParam)) {
													if (!method.equals(operation)) {
														if (!method.equals(ne2ne)) {
															if (!method.equals(typeAccess)) {
																if (!method.equals(ta2p)) {
																	if (!method.equals(uType)) {
																		if (!method.equals(returnParam)) {
																			if (!ne2ne.equals(operation)) {
																				if (!ne2ne.equals(typeAccess)) {
																					if (!ne2ne.equals(ta2p)) {
																						if (!ne2ne.equals(uType)) {
																							if (!ne2ne.equals(
																									returnParam)) {
																								if (!jType
																										.equals(m2o)) {
																									if (!jType.equals(
																											operation)) {
																										if (!jType
																												.equals(method)) {
																											if (!jType
																													.equals(ne2ne)) {
																												if (!jType
																														.equals(typeAccess)) {
																													if (!jType
																															.equals(ta2p)) {
																														if (!jType
																																.equals(uType)) {
																															if (!jType
																																	.equals(returnParam)) {
																																if (!typeAccess
																																		.equals(uType)) {
																																	if (!ta2p
																																			.equals(typeAccess)) {
																																		if (!ta2p
																																				.equals(uType)) {
																																			if (!returnParam
																																					.equals(typeAccess)) {
																																				if (!returnParam
																																						.equals(ta2p)) {
																																					if (!returnParam
																																							.equals(uType)) {
																																						return new Object[] {
																																								ruleresult,
																																								m2o,
																																								operation,
																																								method,
																																								ne2ne,
																																								jType,
																																								typeAccess,
																																								ta2p,
																																								uType,
																																								returnParam };
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_TypeAccess2ReturnParam_11_3_bookkeepingforedges_greenBBBBBBBBFFFFFFF(
			PerformRuleResult ruleresult, EObject operation, EObject method, EObject jType, EObject typeAccess,
			EObject ta2p, EObject uType, EObject returnParam) {
		EMoflonEdge operation__returnParam____ownedParameter = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge typeAccess__jType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge jType__typeAccess____usagesInTypeAccess = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge ta2p__typeAccess____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge method__typeAccess____returnType = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge ta2p__returnParam____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge returnParam__uType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "TypeAccess2ReturnParam";
		String operation__returnParam____ownedParameter_name_prime = "ownedParameter";
		String typeAccess__jType____type_name_prime = "type";
		String jType__typeAccess____usagesInTypeAccess_name_prime = "usagesInTypeAccess";
		String ta2p__typeAccess____source_name_prime = "source";
		String method__typeAccess____returnType_name_prime = "returnType";
		String ta2p__returnParam____target_name_prime = "target";
		String returnParam__uType____type_name_prime = "type";
		operation__returnParam____ownedParameter.setSrc(operation);
		operation__returnParam____ownedParameter.setTrg(returnParam);
		ruleresult.getTranslatedEdges().add(operation__returnParam____ownedParameter);
		typeAccess__jType____type.setSrc(typeAccess);
		typeAccess__jType____type.setTrg(jType);
		ruleresult.getCreatedEdges().add(typeAccess__jType____type);
		jType__typeAccess____usagesInTypeAccess.setSrc(jType);
		jType__typeAccess____usagesInTypeAccess.setTrg(typeAccess);
		ruleresult.getCreatedEdges().add(jType__typeAccess____usagesInTypeAccess);
		ta2p__typeAccess____source.setSrc(ta2p);
		ta2p__typeAccess____source.setTrg(typeAccess);
		ruleresult.getCreatedEdges().add(ta2p__typeAccess____source);
		method__typeAccess____returnType.setSrc(method);
		method__typeAccess____returnType.setTrg(typeAccess);
		ruleresult.getCreatedEdges().add(method__typeAccess____returnType);
		ta2p__returnParam____target.setSrc(ta2p);
		ta2p__returnParam____target.setTrg(returnParam);
		ruleresult.getCreatedEdges().add(ta2p__returnParam____target);
		returnParam__uType____type.setSrc(returnParam);
		returnParam__uType____type.setTrg(uType);
		ruleresult.getTranslatedEdges().add(returnParam__uType____type);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		operation__returnParam____ownedParameter.setName(operation__returnParam____ownedParameter_name_prime);
		typeAccess__jType____type.setName(typeAccess__jType____type_name_prime);
		jType__typeAccess____usagesInTypeAccess.setName(jType__typeAccess____usagesInTypeAccess_name_prime);
		ta2p__typeAccess____source.setName(ta2p__typeAccess____source_name_prime);
		method__typeAccess____returnType.setName(method__typeAccess____returnType_name_prime);
		ta2p__returnParam____target.setName(ta2p__returnParam____target_name_prime);
		returnParam__uType____type.setName(returnParam__uType____type_name_prime);
		return new Object[] { ruleresult, operation, method, jType, typeAccess, ta2p, uType, returnParam,
				operation__returnParam____ownedParameter, typeAccess__jType____type,
				jType__typeAccess____usagesInTypeAccess, ta2p__typeAccess____source, method__typeAccess____returnType,
				ta2p__returnParam____target, returnParam__uType____type };
	}

	public static final void pattern_TypeAccess2ReturnParam_11_5_registerobjects_expressionBBBBBBBBBBB(
			TypeAccess2ReturnParam _this, PerformRuleResult ruleresult, EObject m2o, EObject operation, EObject method,
			EObject ne2ne, EObject jType, EObject typeAccess, EObject ta2p, EObject uType, EObject returnParam) {
		_this.registerObjects_BWD(ruleresult, m2o, operation, method, ne2ne, jType, typeAccess, ta2p, uType,
				returnParam);

	}

	public static final PerformRuleResult pattern_TypeAccess2ReturnParam_11_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_12_1_preparereturnvalue_bindingFB(
			TypeAccess2ReturnParam _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_12_1_preparereturnvalue_blackFBB(EClass eClass,
			TypeAccess2ReturnParam _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_12_1_preparereturnvalue_bindingAndBlackFFB(
			TypeAccess2ReturnParam _this) {
		Object[] result_pattern_TypeAccess2ReturnParam_12_1_preparereturnvalue_binding = pattern_TypeAccess2ReturnParam_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_TypeAccess2ReturnParam_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_TypeAccess2ReturnParam_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_TypeAccess2ReturnParam_12_1_preparereturnvalue_black = pattern_TypeAccess2ReturnParam_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_TypeAccess2ReturnParam_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_TypeAccess2ReturnParam_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_12_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "TypeAccess2ReturnParam";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_12_2_corematch_bindingFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("operation");
		EObject _localVariable_1 = match.getObject("uType");
		EObject _localVariable_2 = match.getObject("returnParam");
		EObject tmpOperation = _localVariable_0;
		EObject tmpUType = _localVariable_1;
		EObject tmpReturnParam = _localVariable_2;
		if (tmpOperation instanceof Operation) {
			Operation operation = (Operation) tmpOperation;
			if (tmpUType instanceof org.eclipse.uml2.uml.Type) {
				org.eclipse.uml2.uml.Type uType = (org.eclipse.uml2.uml.Type) tmpUType;
				if (tmpReturnParam instanceof Parameter) {
					Parameter returnParam = (Parameter) tmpReturnParam;
					return new Object[] { operation, uType, returnParam, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_TypeAccess2ReturnParam_12_2_corematch_blackFBFFFBBB(
			Operation operation, org.eclipse.uml2.uml.Type uType, Parameter returnParam, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (NamedElement2NamedElement m2o : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(operation, NamedElement2NamedElement.class, "target")) {
			org.eclipse.modisco.java.NamedElement tmpMethod = m2o.getSource();
			if (tmpMethod instanceof MethodDeclaration) {
				MethodDeclaration method = (MethodDeclaration) tmpMethod;
				for (NamedElement2NamedElement ne2ne : org.moflon.core.utilities.eMoflonEMFUtil
						.getOppositeReferenceTyped(uType, NamedElement2NamedElement.class, "target")) {
					if (!m2o.equals(ne2ne)) {
						org.eclipse.modisco.java.NamedElement tmpJType = ne2ne.getSource();
						if (tmpJType instanceof Type) {
							Type jType = (Type) tmpJType;
							_result.add(
									new Object[] { m2o, operation, method, ne2ne, jType, uType, returnParam, match });
						}

					}
				}
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_TypeAccess2ReturnParam_12_3_findcontext_blackBBBBBBB(
			NamedElement2NamedElement m2o, Operation operation, MethodDeclaration method,
			NamedElement2NamedElement ne2ne, Type jType, org.eclipse.uml2.uml.Type uType, Parameter returnParam) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!m2o.equals(ne2ne)) {
			if (operation.equals(m2o.getTarget())) {
				if (jType.equals(ne2ne.getSource())) {
					if (operation.getOwnedParameters().contains(returnParam)) {
						if (method.equals(m2o.getSource())) {
							if (uType.equals(ne2ne.getTarget())) {
								if (uType.equals(returnParam.getType())) {
									_result.add(
											new Object[] { m2o, operation, method, ne2ne, jType, uType, returnParam });
								}
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_12_3_findcontext_greenBBBBBBBFFFFFFF(
			NamedElement2NamedElement m2o, Operation operation, MethodDeclaration method,
			NamedElement2NamedElement ne2ne, Type jType, org.eclipse.uml2.uml.Type uType, Parameter returnParam) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge m2o__operation____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge ne2ne__jType____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge operation__returnParam____ownedParameter = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge m2o__method____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge ne2ne__uType____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge returnParam__uType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String m2o__operation____target_name_prime = "target";
		String ne2ne__jType____source_name_prime = "source";
		String operation__returnParam____ownedParameter_name_prime = "ownedParameter";
		String m2o__method____source_name_prime = "source";
		String ne2ne__uType____target_name_prime = "target";
		String returnParam__uType____type_name_prime = "type";
		isApplicableMatch.getAllContextElements().add(m2o);
		isApplicableMatch.getAllContextElements().add(operation);
		isApplicableMatch.getAllContextElements().add(method);
		isApplicableMatch.getAllContextElements().add(ne2ne);
		isApplicableMatch.getAllContextElements().add(jType);
		isApplicableMatch.getAllContextElements().add(uType);
		isApplicableMatch.getAllContextElements().add(returnParam);
		m2o__operation____target.setSrc(m2o);
		m2o__operation____target.setTrg(operation);
		isApplicableMatch.getAllContextElements().add(m2o__operation____target);
		ne2ne__jType____source.setSrc(ne2ne);
		ne2ne__jType____source.setTrg(jType);
		isApplicableMatch.getAllContextElements().add(ne2ne__jType____source);
		operation__returnParam____ownedParameter.setSrc(operation);
		operation__returnParam____ownedParameter.setTrg(returnParam);
		isApplicableMatch.getAllContextElements().add(operation__returnParam____ownedParameter);
		m2o__method____source.setSrc(m2o);
		m2o__method____source.setTrg(method);
		isApplicableMatch.getAllContextElements().add(m2o__method____source);
		ne2ne__uType____target.setSrc(ne2ne);
		ne2ne__uType____target.setTrg(uType);
		isApplicableMatch.getAllContextElements().add(ne2ne__uType____target);
		returnParam__uType____type.setSrc(returnParam);
		returnParam__uType____type.setTrg(uType);
		isApplicableMatch.getAllContextElements().add(returnParam__uType____type);
		m2o__operation____target.setName(m2o__operation____target_name_prime);
		ne2ne__jType____source.setName(ne2ne__jType____source_name_prime);
		operation__returnParam____ownedParameter.setName(operation__returnParam____ownedParameter_name_prime);
		m2o__method____source.setName(m2o__method____source_name_prime);
		ne2ne__uType____target.setName(ne2ne__uType____target_name_prime);
		returnParam__uType____type.setName(returnParam__uType____type_name_prime);
		return new Object[] { m2o, operation, method, ne2ne, jType, uType, returnParam, isApplicableMatch,
				m2o__operation____target, ne2ne__jType____source, operation__returnParam____ownedParameter,
				m2o__method____source, ne2ne__uType____target, returnParam__uType____type };
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_12_4_solveCSP_bindingFBBBBBBBBB(
			TypeAccess2ReturnParam _this, IsApplicableMatch isApplicableMatch, NamedElement2NamedElement m2o,
			Operation operation, MethodDeclaration method, NamedElement2NamedElement ne2ne, Type jType,
			org.eclipse.uml2.uml.Type uType, Parameter returnParam) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, m2o, operation, method, ne2ne, jType,
				uType, returnParam);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, m2o, operation, method, ne2ne, jType, uType,
					returnParam };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_12_4_solveCSP_bindingAndBlackFBBBBBBBBB(
			TypeAccess2ReturnParam _this, IsApplicableMatch isApplicableMatch, NamedElement2NamedElement m2o,
			Operation operation, MethodDeclaration method, NamedElement2NamedElement ne2ne, Type jType,
			org.eclipse.uml2.uml.Type uType, Parameter returnParam) {
		Object[] result_pattern_TypeAccess2ReturnParam_12_4_solveCSP_binding = pattern_TypeAccess2ReturnParam_12_4_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, m2o, operation, method, ne2ne, jType, uType, returnParam);
		if (result_pattern_TypeAccess2ReturnParam_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_TypeAccess2ReturnParam_12_4_solveCSP_binding[0];

			Object[] result_pattern_TypeAccess2ReturnParam_12_4_solveCSP_black = pattern_TypeAccess2ReturnParam_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_TypeAccess2ReturnParam_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, m2o, operation, method, ne2ne, jType, uType,
						returnParam };
			}
		}
		return null;
	}

	public static final boolean pattern_TypeAccess2ReturnParam_12_5_checkCSP_expressionFBB(TypeAccess2ReturnParam _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "TypeAccess2ReturnParam";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_TypeAccess2ReturnParam_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_20_1_preparereturnvalue_bindingFB(
			TypeAccess2ReturnParam _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_20_1_preparereturnvalue_blackFBBF(EClass __eClass,
			TypeAccess2ReturnParam _this) {
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

	public static final Object[] pattern_TypeAccess2ReturnParam_20_1_preparereturnvalue_bindingAndBlackFFBF(
			TypeAccess2ReturnParam _this) {
		Object[] result_pattern_TypeAccess2ReturnParam_20_1_preparereturnvalue_binding = pattern_TypeAccess2ReturnParam_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_TypeAccess2ReturnParam_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_TypeAccess2ReturnParam_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_TypeAccess2ReturnParam_20_1_preparereturnvalue_black = pattern_TypeAccess2ReturnParam_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_TypeAccess2ReturnParam_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_TypeAccess2ReturnParam_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_TypeAccess2ReturnParam_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_TypeAccess2ReturnParam_20_2_testcorematchandDECs_blackFFFB(
			EMoflonEdge _edge_ownedParameter) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpOperation = _edge_ownedParameter.getSrc();
		if (tmpOperation instanceof Operation) {
			Operation operation = (Operation) tmpOperation;
			EObject tmpReturnParam = _edge_ownedParameter.getTrg();
			if (tmpReturnParam instanceof Parameter) {
				Parameter returnParam = (Parameter) tmpReturnParam;
				if (operation.getOwnedParameters().contains(returnParam)) {
					org.eclipse.uml2.uml.Type uType = returnParam.getType();
					if (uType != null) {
						_result.add(new Object[] { operation, uType, returnParam, _edge_ownedParameter });
					}

				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_20_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_TypeAccess2ReturnParam_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
			TypeAccess2ReturnParam _this, Match match, Operation operation, org.eclipse.uml2.uml.Type uType,
			Parameter returnParam) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, operation, uType, returnParam);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_TypeAccess2ReturnParam_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			TypeAccess2ReturnParam _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_TypeAccess2ReturnParam_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_21_1_preparereturnvalue_bindingFB(
			TypeAccess2ReturnParam _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_21_1_preparereturnvalue_blackFBBF(EClass __eClass,
			TypeAccess2ReturnParam _this) {
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

	public static final Object[] pattern_TypeAccess2ReturnParam_21_1_preparereturnvalue_bindingAndBlackFFBF(
			TypeAccess2ReturnParam _this) {
		Object[] result_pattern_TypeAccess2ReturnParam_21_1_preparereturnvalue_binding = pattern_TypeAccess2ReturnParam_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_TypeAccess2ReturnParam_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_TypeAccess2ReturnParam_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_TypeAccess2ReturnParam_21_1_preparereturnvalue_black = pattern_TypeAccess2ReturnParam_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_TypeAccess2ReturnParam_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_TypeAccess2ReturnParam_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_TypeAccess2ReturnParam_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_21_2_testcorematchandDECs_black_nac_0BB(
			TypeAccess typeAccess, Type jType) {
		for (AbstractTypeDeclaration __DEC_typeAccess_superInterfaces_568046 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeAccess, AbstractTypeDeclaration.class, "superInterfaces")) {
			if (!jType.equals(__DEC_typeAccess_superInterfaces_568046)) {
				return new Object[] { typeAccess, jType };
			}
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_21_2_testcorematchandDECs_black_nac_1B(
			TypeAccess typeAccess) {
		for (Annotation __DEC_typeAccess_type_311071 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeAccess, Annotation.class, "type")) {
			return new Object[] { typeAccess };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_21_2_testcorematchandDECs_black_nac_2BB(
			TypeAccess typeAccess, Type jType) {
		for (ArrayType __DEC_typeAccess_elementType_87053 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeAccess, ArrayType.class, "elementType")) {
			if (!jType.equals(__DEC_typeAccess_elementType_87053)) {
				return new Object[] { typeAccess, jType };
			}
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_21_2_testcorematchandDECs_black_nac_3BB(
			TypeAccess typeAccess, Type jType) {
		for (ClassDeclaration __DEC_typeAccess_superClass_247258 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeAccess, ClassDeclaration.class, "superClass")) {
			if (!jType.equals(__DEC_typeAccess_superClass_247258)) {
				return new Object[] { typeAccess, jType };
			}
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_21_2_testcorematchandDECs_black_nac_4BB(
			TypeAccess typeAccess, Type jType) {
		for (ParameterizedType __DEC_typeAccess_type_126592 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeAccess, ParameterizedType.class, "type")) {
			if (!jType.equals(__DEC_typeAccess_type_126592)) {
				return new Object[] { typeAccess, jType };
			}
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_21_2_testcorematchandDECs_black_nac_5B(
			TypeAccess typeAccess) {
		for (SingleVariableDeclaration __DEC_typeAccess_type_913538 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeAccess, SingleVariableDeclaration.class, "type")) {
			return new Object[] { typeAccess };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_21_2_testcorematchandDECs_black_nac_6B(
			TypeAccess typeAccess) {
		for (AnnotationMemberValuePair __DEC_typeAccess_value_626157 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeAccess, AnnotationMemberValuePair.class, "value")) {
			return new Object[] { typeAccess };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_21_2_testcorematchandDECs_black_nac_7B(
			TypeAccess typeAccess) {
		for (ArrayInitializer __DEC_typeAccess_expressions_850318 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeAccess, ArrayInitializer.class, "expressions")) {
			return new Object[] { typeAccess };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_TypeAccess2ReturnParam_21_2_testcorematchandDECs_blackFFFB(
			EMoflonEdge _edge_type) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpTypeAccess = _edge_type.getSrc();
		if (tmpTypeAccess instanceof TypeAccess) {
			TypeAccess typeAccess = (TypeAccess) tmpTypeAccess;
			EObject tmpJType = _edge_type.getTrg();
			if (tmpJType instanceof Type) {
				Type jType = (Type) tmpJType;
				if (jType.equals(typeAccess.getType())) {
					if (pattern_TypeAccess2ReturnParam_21_2_testcorematchandDECs_black_nac_1B(typeAccess) == null) {
						if (pattern_TypeAccess2ReturnParam_21_2_testcorematchandDECs_black_nac_5B(typeAccess) == null) {
							if (pattern_TypeAccess2ReturnParam_21_2_testcorematchandDECs_black_nac_6B(
									typeAccess) == null) {
								if (pattern_TypeAccess2ReturnParam_21_2_testcorematchandDECs_black_nac_7B(
										typeAccess) == null) {
									if (pattern_TypeAccess2ReturnParam_21_2_testcorematchandDECs_black_nac_0BB(
											typeAccess, jType) == null) {
										if (pattern_TypeAccess2ReturnParam_21_2_testcorematchandDECs_black_nac_2BB(
												typeAccess, jType) == null) {
											if (pattern_TypeAccess2ReturnParam_21_2_testcorematchandDECs_black_nac_3BB(
													typeAccess, jType) == null) {
												if (pattern_TypeAccess2ReturnParam_21_2_testcorematchandDECs_black_nac_4BB(
														typeAccess, jType) == null) {
													for (MethodDeclaration method : org.moflon.core.utilities.eMoflonEMFUtil
															.getOppositeReferenceTyped(typeAccess,
																	MethodDeclaration.class, "returnType")) {
														_result.add(
																new Object[] { method, jType, typeAccess, _edge_type });
													}
												}
											}
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

	public static final Object[] pattern_TypeAccess2ReturnParam_21_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_TypeAccess2ReturnParam_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
			TypeAccess2ReturnParam _this, Match match, MethodDeclaration method, Type jType, TypeAccess typeAccess) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, method, jType, typeAccess);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_TypeAccess2ReturnParam_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			TypeAccess2ReturnParam _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_TypeAccess2ReturnParam_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_24_1_prepare_blackB(TypeAccess2ReturnParam _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_24_2_matchsrctrgcontext_bindingFFFFFFBB(
			Match targetMatch, Match sourceMatch) {
		EObject _localVariable_0 = targetMatch.getObject("operation");
		EObject _localVariable_1 = sourceMatch.getObject("method");
		EObject _localVariable_2 = sourceMatch.getObject("jType");
		EObject _localVariable_3 = sourceMatch.getObject("typeAccess");
		EObject _localVariable_4 = targetMatch.getObject("uType");
		EObject _localVariable_5 = targetMatch.getObject("returnParam");
		EObject tmpOperation = _localVariable_0;
		EObject tmpMethod = _localVariable_1;
		EObject tmpJType = _localVariable_2;
		EObject tmpTypeAccess = _localVariable_3;
		EObject tmpUType = _localVariable_4;
		EObject tmpReturnParam = _localVariable_5;
		if (tmpOperation instanceof Operation) {
			Operation operation = (Operation) tmpOperation;
			if (tmpMethod instanceof MethodDeclaration) {
				MethodDeclaration method = (MethodDeclaration) tmpMethod;
				if (tmpJType instanceof Type) {
					Type jType = (Type) tmpJType;
					if (tmpTypeAccess instanceof TypeAccess) {
						TypeAccess typeAccess = (TypeAccess) tmpTypeAccess;
						if (tmpUType instanceof org.eclipse.uml2.uml.Type) {
							org.eclipse.uml2.uml.Type uType = (org.eclipse.uml2.uml.Type) tmpUType;
							if (tmpReturnParam instanceof Parameter) {
								Parameter returnParam = (Parameter) tmpReturnParam;
								return new Object[] { operation, method, jType, typeAccess, uType, returnParam,
										targetMatch, sourceMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_24_2_matchsrctrgcontext_blackBBBBBBBB(
			Operation operation, MethodDeclaration method, Type jType, TypeAccess typeAccess,
			org.eclipse.uml2.uml.Type uType, Parameter returnParam, Match sourceMatch, Match targetMatch) {
		if (!sourceMatch.equals(targetMatch)) {
			return new Object[] { operation, method, jType, typeAccess, uType, returnParam, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_TypeAccess2ReturnParam_24_2_matchsrctrgcontext_binding = pattern_TypeAccess2ReturnParam_24_2_matchsrctrgcontext_bindingFFFFFFBB(
				targetMatch, sourceMatch);
		if (result_pattern_TypeAccess2ReturnParam_24_2_matchsrctrgcontext_binding != null) {
			Operation operation = (Operation) result_pattern_TypeAccess2ReturnParam_24_2_matchsrctrgcontext_binding[0];
			MethodDeclaration method = (MethodDeclaration) result_pattern_TypeAccess2ReturnParam_24_2_matchsrctrgcontext_binding[1];
			Type jType = (Type) result_pattern_TypeAccess2ReturnParam_24_2_matchsrctrgcontext_binding[2];
			TypeAccess typeAccess = (TypeAccess) result_pattern_TypeAccess2ReturnParam_24_2_matchsrctrgcontext_binding[3];
			org.eclipse.uml2.uml.Type uType = (org.eclipse.uml2.uml.Type) result_pattern_TypeAccess2ReturnParam_24_2_matchsrctrgcontext_binding[4];
			Parameter returnParam = (Parameter) result_pattern_TypeAccess2ReturnParam_24_2_matchsrctrgcontext_binding[5];

			Object[] result_pattern_TypeAccess2ReturnParam_24_2_matchsrctrgcontext_black = pattern_TypeAccess2ReturnParam_24_2_matchsrctrgcontext_blackBBBBBBBB(
					operation, method, jType, typeAccess, uType, returnParam, sourceMatch, targetMatch);
			if (result_pattern_TypeAccess2ReturnParam_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { operation, method, jType, typeAccess, uType, returnParam, sourceMatch,
						targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_24_3_solvecsp_bindingFBBBBBBBBB(
			TypeAccess2ReturnParam _this, Operation operation, MethodDeclaration method, Type jType,
			TypeAccess typeAccess, org.eclipse.uml2.uml.Type uType, Parameter returnParam, Match sourceMatch,
			Match targetMatch) {
		CSP _localVariable_6 = _this.isApplicable_solveCsp_CC(operation, method, jType, typeAccess, uType, returnParam,
				sourceMatch, targetMatch);
		CSP csp = _localVariable_6;
		if (csp != null) {
			return new Object[] { csp, _this, operation, method, jType, typeAccess, uType, returnParam, sourceMatch,
					targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_24_3_solvecsp_bindingAndBlackFBBBBBBBBB(
			TypeAccess2ReturnParam _this, Operation operation, MethodDeclaration method, Type jType,
			TypeAccess typeAccess, org.eclipse.uml2.uml.Type uType, Parameter returnParam, Match sourceMatch,
			Match targetMatch) {
		Object[] result_pattern_TypeAccess2ReturnParam_24_3_solvecsp_binding = pattern_TypeAccess2ReturnParam_24_3_solvecsp_bindingFBBBBBBBBB(
				_this, operation, method, jType, typeAccess, uType, returnParam, sourceMatch, targetMatch);
		if (result_pattern_TypeAccess2ReturnParam_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_TypeAccess2ReturnParam_24_3_solvecsp_binding[0];

			Object[] result_pattern_TypeAccess2ReturnParam_24_3_solvecsp_black = pattern_TypeAccess2ReturnParam_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_TypeAccess2ReturnParam_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, operation, method, jType, typeAccess, uType, returnParam, sourceMatch,
						targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_TypeAccess2ReturnParam_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_TypeAccess2ReturnParam_24_5_matchcorrcontext_blackFBBFBBBB(
			Operation operation, MethodDeclaration method, Type jType, org.eclipse.uml2.uml.Type uType,
			Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (NamedElement2NamedElement m2o : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(operation, NamedElement2NamedElement.class, "target")) {
				if (method.equals(m2o.getSource())) {
					for (NamedElement2NamedElement ne2ne : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(jType, NamedElement2NamedElement.class, "source")) {
						if (!m2o.equals(ne2ne)) {
							if (uType.equals(ne2ne.getTarget())) {
								_result.add(new Object[] { m2o, operation, method, ne2ne, jType, uType, sourceMatch,
										targetMatch });
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_24_5_matchcorrcontext_greenBBBBF(
			NamedElement2NamedElement m2o, NamedElement2NamedElement ne2ne, Match sourceMatch, Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "TypeAccess2ReturnParam";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(m2o);
		ccMatch.getAllContextElements().add(ne2ne);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { m2o, ne2ne, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_24_6_createcorrespondence_blackBBBBBBB(
			Operation operation, MethodDeclaration method, Type jType, TypeAccess typeAccess,
			org.eclipse.uml2.uml.Type uType, Parameter returnParam, CCMatch ccMatch) {
		return new Object[] { operation, method, jType, typeAccess, uType, returnParam, ccMatch };
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_24_6_createcorrespondence_greenBFBB(
			TypeAccess typeAccess, Parameter returnParam, CCMatch ccMatch) {
		TypeAccess2Parameter ta2p = UmlFactory.eINSTANCE.createTypeAccess2Parameter();
		ta2p.setSource(typeAccess);
		ta2p.setTarget(returnParam);
		ccMatch.getCreateCorr().add(ta2p);
		return new Object[] { typeAccess, ta2p, returnParam, ccMatch };
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_24_7_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_24_7_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "TypeAccess2ReturnParam";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_TypeAccess2ReturnParam_24_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_27_1_matchtggpattern_black_nac_0BB(
			TypeAccess typeAccess, Type jType) {
		for (AbstractTypeDeclaration __DEC_typeAccess_superInterfaces_272102 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeAccess, AbstractTypeDeclaration.class, "superInterfaces")) {
			if (!jType.equals(__DEC_typeAccess_superInterfaces_272102)) {
				return new Object[] { typeAccess, jType };
			}
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_27_1_matchtggpattern_black_nac_1B(
			TypeAccess typeAccess) {
		for (Annotation __DEC_typeAccess_type_380541 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeAccess, Annotation.class, "type")) {
			return new Object[] { typeAccess };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_27_1_matchtggpattern_black_nac_2BB(
			TypeAccess typeAccess, Type jType) {
		for (ArrayType __DEC_typeAccess_elementType_661985 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeAccess, ArrayType.class, "elementType")) {
			if (!jType.equals(__DEC_typeAccess_elementType_661985)) {
				return new Object[] { typeAccess, jType };
			}
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_27_1_matchtggpattern_black_nac_3BB(
			TypeAccess typeAccess, Type jType) {
		for (ClassDeclaration __DEC_typeAccess_superClass_100475 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeAccess, ClassDeclaration.class, "superClass")) {
			if (!jType.equals(__DEC_typeAccess_superClass_100475)) {
				return new Object[] { typeAccess, jType };
			}
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_27_1_matchtggpattern_black_nac_4BB(
			TypeAccess typeAccess, Type jType) {
		for (ParameterizedType __DEC_typeAccess_type_18208 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeAccess, ParameterizedType.class, "type")) {
			if (!jType.equals(__DEC_typeAccess_type_18208)) {
				return new Object[] { typeAccess, jType };
			}
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_27_1_matchtggpattern_black_nac_5B(
			TypeAccess typeAccess) {
		for (SingleVariableDeclaration __DEC_typeAccess_type_195424 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeAccess, SingleVariableDeclaration.class, "type")) {
			return new Object[] { typeAccess };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_27_1_matchtggpattern_black_nac_6B(
			TypeAccess typeAccess) {
		for (AnnotationMemberValuePair __DEC_typeAccess_value_718579 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeAccess, AnnotationMemberValuePair.class, "value")) {
			return new Object[] { typeAccess };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_27_1_matchtggpattern_black_nac_7B(
			TypeAccess typeAccess) {
		for (ArrayInitializer __DEC_typeAccess_expressions_976001 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeAccess, ArrayInitializer.class, "expressions")) {
			return new Object[] { typeAccess };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_27_1_matchtggpattern_blackBBB(MethodDeclaration method,
			Type jType, TypeAccess typeAccess) {
		if (jType.equals(typeAccess.getType())) {
			if (typeAccess.equals(method.getReturnType())) {
				if (pattern_TypeAccess2ReturnParam_27_1_matchtggpattern_black_nac_0BB(typeAccess, jType) == null) {
					if (pattern_TypeAccess2ReturnParam_27_1_matchtggpattern_black_nac_1B(typeAccess) == null) {
						if (pattern_TypeAccess2ReturnParam_27_1_matchtggpattern_black_nac_2BB(typeAccess,
								jType) == null) {
							if (pattern_TypeAccess2ReturnParam_27_1_matchtggpattern_black_nac_3BB(typeAccess,
									jType) == null) {
								if (pattern_TypeAccess2ReturnParam_27_1_matchtggpattern_black_nac_4BB(typeAccess,
										jType) == null) {
									if (pattern_TypeAccess2ReturnParam_27_1_matchtggpattern_black_nac_5B(
											typeAccess) == null) {
										if (pattern_TypeAccess2ReturnParam_27_1_matchtggpattern_black_nac_6B(
												typeAccess) == null) {
											if (pattern_TypeAccess2ReturnParam_27_1_matchtggpattern_black_nac_7B(
													typeAccess) == null) {
												return new Object[] { method, jType, typeAccess };
											}
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

	public static final boolean pattern_TypeAccess2ReturnParam_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_TypeAccess2ReturnParam_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_28_1_matchtggpattern_blackBBB(Operation operation,
			org.eclipse.uml2.uml.Type uType, Parameter returnParam) {
		if (operation.getOwnedParameters().contains(returnParam)) {
			if (uType.equals(returnParam.getType())) {
				return new Object[] { operation, uType, returnParam };
			}
		}
		return null;
	}

	public static final boolean pattern_TypeAccess2ReturnParam_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_TypeAccess2ReturnParam_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_29_1_createresult_blackB(TypeAccess2ReturnParam _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, NamedElement2NamedElement m2o) {
		if (ruleResult.getCorrObjects().contains(m2o)) {
			return new Object[] { ruleResult, m2o };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, Operation operation) {
		if (ruleResult.getTargetObjects().contains(operation)) {
			return new Object[] { ruleResult, operation };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, MethodDeclaration method) {
		if (ruleResult.getSourceObjects().contains(method)) {
			return new Object[] { ruleResult, method };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_29_2_isapplicablecore_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, NamedElement2NamedElement ne2ne) {
		if (ruleResult.getCorrObjects().contains(ne2ne)) {
			return new Object[] { ruleResult, ne2ne };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_29_2_isapplicablecore_black_nac_4BB(
			ModelgeneratorRuleResult ruleResult, Type jType) {
		if (ruleResult.getSourceObjects().contains(jType)) {
			return new Object[] { ruleResult, jType };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_29_2_isapplicablecore_black_nac_5BB(
			ModelgeneratorRuleResult ruleResult, org.eclipse.uml2.uml.Type uType) {
		if (ruleResult.getTargetObjects().contains(uType)) {
			return new Object[] { ruleResult, uType };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_TypeAccess2ReturnParam_29_2_isapplicablecore_blackFFFFFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList m2oList : ruleEntryContainer.getRuleEntryList()) {
			for (RuleEntryList ne2neList : ruleEntryContainer.getRuleEntryList()) {
				if (!m2oList.equals(ne2neList)) {
					for (EObject tmpM2o : m2oList.getEntryObjects()) {
						if (tmpM2o instanceof NamedElement2NamedElement) {
							NamedElement2NamedElement m2o = (NamedElement2NamedElement) tmpM2o;
							NamedElement tmpOperation = m2o.getTarget();
							if (tmpOperation instanceof Operation) {
								Operation operation = (Operation) tmpOperation;
								org.eclipse.modisco.java.NamedElement tmpMethod = m2o.getSource();
								if (tmpMethod instanceof MethodDeclaration) {
									MethodDeclaration method = (MethodDeclaration) tmpMethod;
									if (pattern_TypeAccess2ReturnParam_29_2_isapplicablecore_black_nac_0BB(ruleResult,
											m2o) == null) {
										if (pattern_TypeAccess2ReturnParam_29_2_isapplicablecore_black_nac_1BB(
												ruleResult, operation) == null) {
											if (pattern_TypeAccess2ReturnParam_29_2_isapplicablecore_black_nac_2BB(
													ruleResult, method) == null) {
												for (EObject tmpNe2ne : ne2neList.getEntryObjects()) {
													if (tmpNe2ne instanceof NamedElement2NamedElement) {
														NamedElement2NamedElement ne2ne = (NamedElement2NamedElement) tmpNe2ne;
														if (!m2o.equals(ne2ne)) {
															org.eclipse.modisco.java.NamedElement tmpJType = ne2ne
																	.getSource();
															if (tmpJType instanceof Type) {
																Type jType = (Type) tmpJType;
																NamedElement tmpUType = ne2ne.getTarget();
																if (tmpUType instanceof org.eclipse.uml2.uml.Type) {
																	org.eclipse.uml2.uml.Type uType = (org.eclipse.uml2.uml.Type) tmpUType;
																	if (pattern_TypeAccess2ReturnParam_29_2_isapplicablecore_black_nac_3BB(
																			ruleResult, ne2ne) == null) {
																		if (pattern_TypeAccess2ReturnParam_29_2_isapplicablecore_black_nac_4BB(
																				ruleResult, jType) == null) {
																			if (pattern_TypeAccess2ReturnParam_29_2_isapplicablecore_black_nac_5BB(
																					ruleResult, uType) == null) {
																				_result.add(new Object[] { m2oList, m2o,
																						operation, method, ne2neList,
																						ne2ne, jType, uType,
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
		return _result;
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_29_3_solveCSP_bindingFBBBBBBBBB(
			TypeAccess2ReturnParam _this, IsApplicableMatch isApplicableMatch, NamedElement2NamedElement m2o,
			Operation operation, MethodDeclaration method, NamedElement2NamedElement ne2ne, Type jType,
			org.eclipse.uml2.uml.Type uType, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, m2o, operation, method, ne2ne, jType,
				uType, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, m2o, operation, method, ne2ne, jType, uType,
					ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_29_3_solveCSP_bindingAndBlackFBBBBBBBBB(
			TypeAccess2ReturnParam _this, IsApplicableMatch isApplicableMatch, NamedElement2NamedElement m2o,
			Operation operation, MethodDeclaration method, NamedElement2NamedElement ne2ne, Type jType,
			org.eclipse.uml2.uml.Type uType, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_TypeAccess2ReturnParam_29_3_solveCSP_binding = pattern_TypeAccess2ReturnParam_29_3_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, m2o, operation, method, ne2ne, jType, uType, ruleResult);
		if (result_pattern_TypeAccess2ReturnParam_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_TypeAccess2ReturnParam_29_3_solveCSP_binding[0];

			Object[] result_pattern_TypeAccess2ReturnParam_29_3_solveCSP_black = pattern_TypeAccess2ReturnParam_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_TypeAccess2ReturnParam_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, m2o, operation, method, ne2ne, jType, uType,
						ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_TypeAccess2ReturnParam_29_4_checkCSP_expressionFBB(TypeAccess2ReturnParam _this,
			CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_29_5_checknacs_blackBBBBBB(
			NamedElement2NamedElement m2o, Operation operation, MethodDeclaration method,
			NamedElement2NamedElement ne2ne, Type jType, org.eclipse.uml2.uml.Type uType) {
		if (!m2o.equals(ne2ne)) {
			return new Object[] { m2o, operation, method, ne2ne, jType, uType };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_29_6_perform_blackBBBBBBB(NamedElement2NamedElement m2o,
			Operation operation, MethodDeclaration method, NamedElement2NamedElement ne2ne, Type jType,
			org.eclipse.uml2.uml.Type uType, ModelgeneratorRuleResult ruleResult) {
		if (!m2o.equals(ne2ne)) {
			return new Object[] { m2o, operation, method, ne2ne, jType, uType, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_29_6_perform_greenBBBFFBFBB(Operation operation,
			MethodDeclaration method, Type jType, org.eclipse.uml2.uml.Type uType, ModelgeneratorRuleResult ruleResult,
			CSP csp) {
		TypeAccess typeAccess = JavaFactory.eINSTANCE.createTypeAccess();
		TypeAccess2Parameter ta2p = UmlFactory.eINSTANCE.createTypeAccess2Parameter();
		Parameter returnParam = UMLFactory.eINSTANCE.createParameter();
		Object _localVariable_0 = csp.getValue("returnParam", "direction");
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_1 = ruleResult.getIncrementedPerformCount();
		typeAccess.setType(jType);
		method.setReturnType(typeAccess);
		ruleResult.getSourceObjects().add(typeAccess);
		ta2p.setSource(typeAccess);
		ruleResult.getCorrObjects().add(ta2p);
		operation.getOwnedParameters().add(returnParam);
		ta2p.setTarget(returnParam);
		returnParam.setType(uType);
		ruleResult.getTargetObjects().add(returnParam);
		ParameterDirectionKind returnParam_direction_prime = (ParameterDirectionKind) _localVariable_0;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_1);
		returnParam.setDirection(returnParam_direction_prime);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { operation, method, jType, typeAccess, ta2p, uType, returnParam, ruleResult, csp };
	}

	public static final ModelgeneratorRuleResult pattern_TypeAccess2ReturnParam_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //TypeAccess2ReturnParamImpl
