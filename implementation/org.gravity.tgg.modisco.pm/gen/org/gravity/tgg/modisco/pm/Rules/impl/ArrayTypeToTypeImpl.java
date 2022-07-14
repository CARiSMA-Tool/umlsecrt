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
import org.eclipse.modisco.java.AnnotationTypeMemberDeclaration;
import org.eclipse.modisco.java.ArrayType;
import org.eclipse.modisco.java.ClassDeclaration;
import org.eclipse.modisco.java.ClassInstanceCreation;
import org.eclipse.modisco.java.MethodDeclaration;
import org.eclipse.modisco.java.Model;
import org.eclipse.modisco.java.ParameterizedType;
import org.eclipse.modisco.java.Type;
import org.eclipse.modisco.java.TypeAccess;
import org.eclipse.modisco.java.TypeLiteral;

import org.eclipse.modisco.java.emf.JavaFactory;

import org.gravity.tgg.modisco.pm.ModelToTypeGraph;
import org.gravity.tgg.modisco.pm.PmFactory;

import org.gravity.tgg.modisco.pm.Rules.ArrayTypeToType;
import org.gravity.tgg.modisco.pm.Rules.RulesPackage;

import org.gravity.tgg.modisco.pm.TypeToTAbstractType;

import org.gravity.typegraph.basic.TAbstractType;
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
 * An implementation of the model object '<em><b>Array Type To Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ArrayTypeToTypeImpl extends AbstractRuleImpl implements ArrayTypeToType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArrayTypeToTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getArrayTypeToType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, ArrayType mArrayType, Model mModel, TypeAccess mTypeAccess,
			Type mType) {

		Object[] result1_black = ArrayTypeToTypeImpl.pattern_ArrayTypeToType_0_1_initialbindings_blackBBBBBB(this,
				match, mArrayType, mModel, mTypeAccess, mType);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[mArrayType] = " + mArrayType + ", " + "[mModel] = " + mModel
					+ ", " + "[mTypeAccess] = " + mTypeAccess + ", " + "[mType] = " + mType + ".");
		}

		Object[] result2_bindingAndBlack = ArrayTypeToTypeImpl
				.pattern_ArrayTypeToType_0_2_SolveCSP_bindingAndBlackFBBBBBB(this, match, mArrayType, mModel,
						mTypeAccess, mType);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[mArrayType] = " + mArrayType + ", " + "[mModel] = " + mModel
					+ ", " + "[mTypeAccess] = " + mTypeAccess + ", " + "[mType] = " + mType + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (ArrayTypeToTypeImpl.pattern_ArrayTypeToType_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = ArrayTypeToTypeImpl
					.pattern_ArrayTypeToType_0_4_collectelementstobetranslated_blackBBBBB(match, mArrayType, mModel,
							mTypeAccess, mType);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[mArrayType] = " + mArrayType + ", " + "[mModel] = " + mModel + ", " + "[mTypeAccess] = "
						+ mTypeAccess + ", " + "[mType] = " + mType + ".");
			}
			ArrayTypeToTypeImpl.pattern_ArrayTypeToType_0_4_collectelementstobetranslated_greenBBBBBFFFF(match,
					mArrayType, mModel, mTypeAccess, mType);
			//nothing EMoflonEdge mArrayType__mTypeAccess____elementType = (EMoflonEdge) result4_green[5];
			//nothing EMoflonEdge mTypeAccess__mType____type = (EMoflonEdge) result4_green[6];
			//nothing EMoflonEdge mType__mTypeAccess____usagesInTypeAccess = (EMoflonEdge) result4_green[7];
			//nothing EMoflonEdge mModel__mArrayType____orphanTypes = (EMoflonEdge) result4_green[8];

			Object[] result5_black = ArrayTypeToTypeImpl.pattern_ArrayTypeToType_0_5_collectcontextelements_blackBBBBB(
					match, mArrayType, mModel, mTypeAccess, mType);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[mArrayType] = " + mArrayType + ", " + "[mModel] = " + mModel + ", " + "[mTypeAccess] = "
						+ mTypeAccess + ", " + "[mType] = " + mType + ".");
			}
			ArrayTypeToTypeImpl.pattern_ArrayTypeToType_0_5_collectcontextelements_greenBBB(match, mModel, mType);

			// 
			ArrayTypeToTypeImpl.pattern_ArrayTypeToType_0_6_registerobjectstomatch_expressionBBBBBB(this, match,
					mArrayType, mModel, mTypeAccess, mType);
			return ArrayTypeToTypeImpl.pattern_ArrayTypeToType_0_7_expressionF();
		} else {
			return ArrayTypeToTypeImpl.pattern_ArrayTypeToType_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = ArrayTypeToTypeImpl
				.pattern_ArrayTypeToType_1_1_performtransformation_bindingAndBlackFFFFFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		ArrayType mArrayType = (ArrayType) result1_bindingAndBlack[0];
		Model mModel = (Model) result1_bindingAndBlack[1];
		TypeAccess mTypeAccess = (TypeAccess) result1_bindingAndBlack[2];
		Type mType = (Type) result1_bindingAndBlack[3];
		TypeGraph tModel = (TypeGraph) result1_bindingAndBlack[4];
		ModelToTypeGraph modelToTypeGraph = (ModelToTypeGraph) result1_bindingAndBlack[5];
		TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result1_bindingAndBlack[6];
		TAbstractType tAbstractType = (TAbstractType) result1_bindingAndBlack[7];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[8];
		Object[] result1_green = ArrayTypeToTypeImpl
				.pattern_ArrayTypeToType_1_1_performtransformation_greenBFB(mArrayType, tAbstractType);
		TypeToTAbstractType arrayTypeToTArrayClass = (TypeToTAbstractType) result1_green[1];

		Object[] result2_black = ArrayTypeToTypeImpl.pattern_ArrayTypeToType_1_2_collecttranslatedelements_blackBBB(
				mArrayType, mTypeAccess, arrayTypeToTArrayClass);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[mArrayType] = " + mArrayType
					+ ", " + "[mTypeAccess] = " + mTypeAccess + ", " + "[arrayTypeToTArrayClass] = "
					+ arrayTypeToTArrayClass + ".");
		}
		Object[] result2_green = ArrayTypeToTypeImpl.pattern_ArrayTypeToType_1_2_collecttranslatedelements_greenFBBB(
				mArrayType, mTypeAccess, arrayTypeToTArrayClass);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = ArrayTypeToTypeImpl.pattern_ArrayTypeToType_1_3_bookkeepingforedges_blackBBBBBBBBBB(
				ruleresult, mArrayType, mModel, mTypeAccess, mType, tModel, modelToTypeGraph, mTypeToTType,
				arrayTypeToTArrayClass, tAbstractType);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[mArrayType] = " + mArrayType + ", " + "[mModel] = " + mModel + ", " + "[mTypeAccess] = "
					+ mTypeAccess + ", " + "[mType] = " + mType + ", " + "[tModel] = " + tModel + ", "
					+ "[modelToTypeGraph] = " + modelToTypeGraph + ", " + "[mTypeToTType] = " + mTypeToTType + ", "
					+ "[arrayTypeToTArrayClass] = " + arrayTypeToTArrayClass + ", " + "[tAbstractType] = "
					+ tAbstractType + ".");
		}
		ArrayTypeToTypeImpl.pattern_ArrayTypeToType_1_3_bookkeepingforedges_greenBBBBBBBFFFFFF(ruleresult, mArrayType,
				mModel, mTypeAccess, mType, arrayTypeToTArrayClass, tAbstractType);
		//nothing EMoflonEdge mArrayType__mTypeAccess____elementType = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge mTypeAccess__mType____type = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge mType__mTypeAccess____usagesInTypeAccess = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge mModel__mArrayType____orphanTypes = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge arrayTypeToTArrayClass__mArrayType____source = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge arrayTypeToTArrayClass__tAbstractType____target = (EMoflonEdge) result3_green[12];

		// 
		// 
		ArrayTypeToTypeImpl.pattern_ArrayTypeToType_1_5_registerobjects_expressionBBBBBBBBBBB(this, ruleresult,
				mArrayType, mModel, mTypeAccess, mType, tModel, modelToTypeGraph, mTypeToTType, arrayTypeToTArrayClass,
				tAbstractType);
		return ArrayTypeToTypeImpl.pattern_ArrayTypeToType_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = ArrayTypeToTypeImpl
				.pattern_ArrayTypeToType_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ArrayTypeToTypeImpl
				.pattern_ArrayTypeToType_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = ArrayTypeToTypeImpl.pattern_ArrayTypeToType_2_2_corematch_bindingFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		ArrayType mArrayType = (ArrayType) result2_binding[0];
		Model mModel = (Model) result2_binding[1];
		TypeAccess mTypeAccess = (TypeAccess) result2_binding[2];
		Type mType = (Type) result2_binding[3];
		for (Object[] result2_black : ArrayTypeToTypeImpl
				.pattern_ArrayTypeToType_2_2_corematch_blackBBBBFFFFB(mArrayType, mModel, mTypeAccess, mType, match)) {
			TypeGraph tModel = (TypeGraph) result2_black[4];
			ModelToTypeGraph modelToTypeGraph = (ModelToTypeGraph) result2_black[5];
			TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result2_black[6];
			TAbstractType tAbstractType = (TAbstractType) result2_black[7];
			// ForEach 
			for (Object[] result3_black : ArrayTypeToTypeImpl.pattern_ArrayTypeToType_2_3_findcontext_blackBBBBBBBB(
					mArrayType, mModel, mTypeAccess, mType, tModel, modelToTypeGraph, mTypeToTType, tAbstractType)) {
				Object[] result3_green = ArrayTypeToTypeImpl
						.pattern_ArrayTypeToType_2_3_findcontext_greenBBBBBBBBFFFFFFFFFFF(mArrayType, mModel,
								mTypeAccess, mType, tModel, modelToTypeGraph, mTypeToTType, tAbstractType);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[8];
				//nothing EMoflonEdge mArrayType__mTypeAccess____elementType = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge modelToTypeGraph__tModel____target = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge mTypeToTType__mType____source = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge mTypeAccess__mType____type = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge mType__mTypeAccess____usagesInTypeAccess = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge tModel__tAbstractType____ownedTypes = (EMoflonEdge) result3_green[14];
				//nothing EMoflonEdge tAbstractType__tModel____model = (EMoflonEdge) result3_green[15];
				//nothing EMoflonEdge mModel__mArrayType____orphanTypes = (EMoflonEdge) result3_green[16];
				//nothing EMoflonEdge modelToTypeGraph__mModel____source = (EMoflonEdge) result3_green[17];
				//nothing EMoflonEdge mTypeToTType__tAbstractType____target = (EMoflonEdge) result3_green[18];

				Object[] result4_bindingAndBlack = ArrayTypeToTypeImpl
						.pattern_ArrayTypeToType_2_4_solveCSP_bindingAndBlackFBBBBBBBBBB(this, isApplicableMatch,
								mArrayType, mModel, mTypeAccess, mType, tModel, modelToTypeGraph, mTypeToTType,
								tAbstractType);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[mArrayType] = " + mArrayType
							+ ", " + "[mModel] = " + mModel + ", " + "[mTypeAccess] = " + mTypeAccess + ", "
							+ "[mType] = " + mType + ", " + "[tModel] = " + tModel + ", " + "[modelToTypeGraph] = "
							+ modelToTypeGraph + ", " + "[mTypeToTType] = " + mTypeToTType + ", " + "[tAbstractType] = "
							+ tAbstractType + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (ArrayTypeToTypeImpl.pattern_ArrayTypeToType_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = ArrayTypeToTypeImpl
							.pattern_ArrayTypeToType_2_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					ArrayTypeToTypeImpl.pattern_ArrayTypeToType_2_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return ArrayTypeToTypeImpl.pattern_ArrayTypeToType_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, ArrayType mArrayType, Model mModel, TypeAccess mTypeAccess,
			Type mType) {
		match.registerObject("mArrayType", mArrayType);
		match.registerObject("mModel", mModel);
		match.registerObject("mTypeAccess", mTypeAccess);
		match.registerObject("mType", mType);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, ArrayType mArrayType, Model mModel, TypeAccess mTypeAccess,
			Type mType) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, ArrayType mArrayType, Model mModel,
			TypeAccess mTypeAccess, Type mType, TypeGraph tModel, ModelToTypeGraph modelToTypeGraph,
			TypeToTAbstractType mTypeToTType, TAbstractType tAbstractType) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("mArrayType", mArrayType);
		isApplicableMatch.registerObject("mModel", mModel);
		isApplicableMatch.registerObject("mTypeAccess", mTypeAccess);
		isApplicableMatch.registerObject("mType", mType);
		isApplicableMatch.registerObject("tModel", tModel);
		isApplicableMatch.registerObject("modelToTypeGraph", modelToTypeGraph);
		isApplicableMatch.registerObject("mTypeToTType", mTypeToTType);
		isApplicableMatch.registerObject("tAbstractType", tAbstractType);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject mArrayType, EObject mModel,
			EObject mTypeAccess, EObject mType, EObject tModel, EObject modelToTypeGraph, EObject mTypeToTType,
			EObject arrayTypeToTArrayClass, EObject tAbstractType) {
		ruleresult.registerObject("mArrayType", mArrayType);
		ruleresult.registerObject("mModel", mModel);
		ruleresult.registerObject("mTypeAccess", mTypeAccess);
		ruleresult.registerObject("mType", mType);
		ruleresult.registerObject("tModel", tModel);
		ruleresult.registerObject("modelToTypeGraph", modelToTypeGraph);
		ruleresult.registerObject("mTypeToTType", mTypeToTType);
		ruleresult.registerObject("arrayTypeToTArrayClass", arrayTypeToTArrayClass);
		ruleresult.registerObject("tAbstractType", tAbstractType);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("mArrayType").eClass())
						.equals("java.ArrayType.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("mTypeAccess").eClass())
						.equals("java.TypeAccess.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, TypeGraph tModel, TAbstractType tAbstractType) {

		Object[] result1_black = ArrayTypeToTypeImpl.pattern_ArrayTypeToType_10_1_initialbindings_blackBBBB(this, match,
				tModel, tAbstractType);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[match] = " + match
							+ ", " + "[tModel] = " + tModel + ", " + "[tAbstractType] = " + tAbstractType + ".");
		}

		Object[] result2_bindingAndBlack = ArrayTypeToTypeImpl
				.pattern_ArrayTypeToType_10_2_SolveCSP_bindingAndBlackFBBBB(this, match, tModel, tAbstractType);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[match] = " + match
							+ ", " + "[tModel] = " + tModel + ", " + "[tAbstractType] = " + tAbstractType + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (ArrayTypeToTypeImpl.pattern_ArrayTypeToType_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = ArrayTypeToTypeImpl
					.pattern_ArrayTypeToType_10_4_collectelementstobetranslated_blackBBB(match, tModel, tAbstractType);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[tModel] = " + tModel + ", " + "[tAbstractType] = " + tAbstractType + ".");
			}

			Object[] result5_black = ArrayTypeToTypeImpl
					.pattern_ArrayTypeToType_10_5_collectcontextelements_blackBBB(match, tModel, tAbstractType);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[tModel] = " + tModel + ", " + "[tAbstractType] = " + tAbstractType + ".");
			}
			ArrayTypeToTypeImpl.pattern_ArrayTypeToType_10_5_collectcontextelements_greenBBBFF(match, tModel,
					tAbstractType);
			//nothing EMoflonEdge tModel__tAbstractType____ownedTypes = (EMoflonEdge) result5_green[3];
			//nothing EMoflonEdge tAbstractType__tModel____model = (EMoflonEdge) result5_green[4];

			// 
			ArrayTypeToTypeImpl.pattern_ArrayTypeToType_10_6_registerobjectstomatch_expressionBBBB(this, match, tModel,
					tAbstractType);
			return ArrayTypeToTypeImpl.pattern_ArrayTypeToType_10_7_expressionF();
		} else {
			return ArrayTypeToTypeImpl.pattern_ArrayTypeToType_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {
		// [user code injected with eMoflon]

		// TODO: implement this method here but do not remove the injection marker 
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {
		// [user code injected with eMoflon]

		// TODO: implement this method here but do not remove the injection marker 
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, TypeGraph tModel, TAbstractType tAbstractType) {
		match.registerObject("tModel", tModel);
		match.registerObject("tAbstractType", tAbstractType);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, TypeGraph tModel, TAbstractType tAbstractType) {// Create CSP
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
	public boolean checkTypes_BWD(Match match) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_TypeGraph_0(TypeGraph tModel) {

		Object[] result1_bindingAndBlack = ArrayTypeToTypeImpl
				.pattern_ArrayTypeToType_17_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = ArrayTypeToTypeImpl.pattern_ArrayTypeToType_17_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : ArrayTypeToTypeImpl
				.pattern_ArrayTypeToType_17_2_testcorematchandDECs_blackBF(tModel)) {
			TAbstractType tAbstractType = (TAbstractType) result2_black[1];
			Object[] result2_green = ArrayTypeToTypeImpl
					.pattern_ArrayTypeToType_17_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (ArrayTypeToTypeImpl
					.pattern_ArrayTypeToType_17_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(this, match,
							tModel, tAbstractType)) {
				// 
				if (ArrayTypeToTypeImpl
						.pattern_ArrayTypeToType_17_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(this,
								match)) {

					Object[] result5_black = ArrayTypeToTypeImpl
							.pattern_ArrayTypeToType_17_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					ArrayTypeToTypeImpl.pattern_ArrayTypeToType_17_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return ArrayTypeToTypeImpl.pattern_ArrayTypeToType_17_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_90(EMoflonEdge _edge_elementType) {

		Object[] result1_bindingAndBlack = ArrayTypeToTypeImpl
				.pattern_ArrayTypeToType_18_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = ArrayTypeToTypeImpl.pattern_ArrayTypeToType_18_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : ArrayTypeToTypeImpl
				.pattern_ArrayTypeToType_18_2_testcorematchandDECs_blackFFFFB(_edge_elementType)) {
			ArrayType mArrayType = (ArrayType) result2_black[0];
			Model mModel = (Model) result2_black[1];
			TypeAccess mTypeAccess = (TypeAccess) result2_black[2];
			Type mType = (Type) result2_black[3];
			Object[] result2_green = ArrayTypeToTypeImpl
					.pattern_ArrayTypeToType_18_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (ArrayTypeToTypeImpl
					.pattern_ArrayTypeToType_18_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(this,
							match, mArrayType, mModel, mTypeAccess, mType)) {
				// 
				if (ArrayTypeToTypeImpl
						.pattern_ArrayTypeToType_18_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(this,
								match)) {

					Object[] result5_black = ArrayTypeToTypeImpl
							.pattern_ArrayTypeToType_18_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					ArrayTypeToTypeImpl.pattern_ArrayTypeToType_18_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return ArrayTypeToTypeImpl.pattern_ArrayTypeToType_18_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("ArrayTypeToType");
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
		ruleResult.setRule("ArrayTypeToType");
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

		Object[] result1_black = ArrayTypeToTypeImpl.pattern_ArrayTypeToType_21_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = ArrayTypeToTypeImpl.pattern_ArrayTypeToType_21_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = ArrayTypeToTypeImpl
				.pattern_ArrayTypeToType_21_2_matchsrctrgcontext_bindingAndBlackFFFFFFBB(sourceMatch, targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		ArrayType mArrayType = (ArrayType) result2_bindingAndBlack[0];
		Model mModel = (Model) result2_bindingAndBlack[1];
		TypeAccess mTypeAccess = (TypeAccess) result2_bindingAndBlack[2];
		Type mType = (Type) result2_bindingAndBlack[3];
		TypeGraph tModel = (TypeGraph) result2_bindingAndBlack[4];
		TAbstractType tAbstractType = (TAbstractType) result2_bindingAndBlack[5];

		Object[] result3_bindingAndBlack = ArrayTypeToTypeImpl
				.pattern_ArrayTypeToType_21_3_solvecsp_bindingAndBlackFBBBBBBBBB(this, mArrayType, mModel, mTypeAccess,
						mType, tModel, tAbstractType, sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[mArrayType] = " + mArrayType + ", " + "[mModel] = " + mModel + ", " + "[mTypeAccess] = "
					+ mTypeAccess + ", " + "[mType] = " + mType + ", " + "[tModel] = " + tModel + ", "
					+ "[tAbstractType] = " + tAbstractType + ", " + "[sourceMatch] = " + sourceMatch + ", "
					+ "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (ArrayTypeToTypeImpl.pattern_ArrayTypeToType_21_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : ArrayTypeToTypeImpl
					.pattern_ArrayTypeToType_21_5_matchcorrcontext_blackBBBFFBBB(mModel, mType, tModel, tAbstractType,
							sourceMatch, targetMatch)) {
				ModelToTypeGraph modelToTypeGraph = (ModelToTypeGraph) result5_black[3];
				TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result5_black[4];
				Object[] result5_green = ArrayTypeToTypeImpl.pattern_ArrayTypeToType_21_5_matchcorrcontext_greenBBBBF(
						modelToTypeGraph, mTypeToTType, sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[4];

				Object[] result6_black = ArrayTypeToTypeImpl
						.pattern_ArrayTypeToType_21_6_createcorrespondence_blackBBBBBBB(mArrayType, mModel, mTypeAccess,
								mType, tModel, tAbstractType, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[mArrayType] = "
							+ mArrayType + ", " + "[mModel] = " + mModel + ", " + "[mTypeAccess] = " + mTypeAccess
							+ ", " + "[mType] = " + mType + ", " + "[tModel] = " + tModel + ", " + "[tAbstractType] = "
							+ tAbstractType + ", " + "[ccMatch] = " + ccMatch + ".");
				}
				ArrayTypeToTypeImpl.pattern_ArrayTypeToType_21_6_createcorrespondence_greenBFBB(mArrayType,
						tAbstractType, ccMatch);
				//nothing TypeToTAbstractType arrayTypeToTArrayClass = (TypeToTAbstractType) result6_green[1];

				Object[] result7_black = ArrayTypeToTypeImpl
						.pattern_ArrayTypeToType_21_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				ArrayTypeToTypeImpl.pattern_ArrayTypeToType_21_7_addtoreturnedresult_greenBB(result, ccMatch);

			}

		} else {
		}
		return ArrayTypeToTypeImpl.pattern_ArrayTypeToType_21_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(ArrayType mArrayType, Model mModel, TypeAccess mTypeAccess, Type mType,
			TypeGraph tModel, TAbstractType tAbstractType, Match sourceMatch, Match targetMatch) {// Create CSP
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
	public boolean checkDEC_FWD(ArrayType mArrayType, Model mModel, TypeAccess mTypeAccess, Type mType) {// 
		Object[] result1_black = ArrayTypeToTypeImpl.pattern_ArrayTypeToType_24_1_matchtggpattern_blackBBBB(mArrayType,
				mModel, mTypeAccess, mType);
		if (result1_black != null) {
			return ArrayTypeToTypeImpl.pattern_ArrayTypeToType_24_2_expressionF();
		} else {
			return ArrayTypeToTypeImpl.pattern_ArrayTypeToType_24_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(TypeGraph tModel, TAbstractType tAbstractType) {// 
		Object[] result1_black = ArrayTypeToTypeImpl.pattern_ArrayTypeToType_25_1_matchtggpattern_blackBB(tModel,
				tAbstractType);
		if (result1_black != null) {
			return ArrayTypeToTypeImpl.pattern_ArrayTypeToType_25_2_expressionF();
		} else {
			return ArrayTypeToTypeImpl.pattern_ArrayTypeToType_25_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer,
			ModelToTypeGraph modelToTypeGraphParameter) {

		Object[] result1_black = ArrayTypeToTypeImpl.pattern_ArrayTypeToType_26_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = ArrayTypeToTypeImpl.pattern_ArrayTypeToType_26_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : ArrayTypeToTypeImpl
				.pattern_ArrayTypeToType_26_2_isapplicablecore_blackFFFFFFFBB(ruleEntryContainer, ruleResult)) {
			//nothing RuleEntryList modelToTypeGraphList = (RuleEntryList) result2_black[0];
			Model mModel = (Model) result2_black[1];
			ModelToTypeGraph modelToTypeGraph = (ModelToTypeGraph) result2_black[2];
			TypeGraph tModel = (TypeGraph) result2_black[3];
			TAbstractType tAbstractType = (TAbstractType) result2_black[4];
			TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result2_black[5];
			Type mType = (Type) result2_black[6];

			Object[] result3_bindingAndBlack = ArrayTypeToTypeImpl
					.pattern_ArrayTypeToType_26_3_solveCSP_bindingAndBlackFBBBBBBBBB(this, isApplicableMatch, mModel,
							mType, tModel, modelToTypeGraph, mTypeToTType, tAbstractType, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[mModel] = " + mModel + ", "
						+ "[mType] = " + mType + ", " + "[tModel] = " + tModel + ", " + "[modelToTypeGraph] = "
						+ modelToTypeGraph + ", " + "[mTypeToTType] = " + mTypeToTType + ", " + "[tAbstractType] = "
						+ tAbstractType + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (ArrayTypeToTypeImpl.pattern_ArrayTypeToType_26_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = ArrayTypeToTypeImpl.pattern_ArrayTypeToType_26_5_checknacs_blackBBBBBB(mModel,
						mType, tModel, modelToTypeGraph, mTypeToTType, tAbstractType);
				if (result5_black != null) {

					Object[] result6_black = ArrayTypeToTypeImpl.pattern_ArrayTypeToType_26_6_perform_blackBBBBBBB(
							mModel, mType, tModel, modelToTypeGraph, mTypeToTType, tAbstractType, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[mModel] = " + mModel
								+ ", " + "[mType] = " + mType + ", " + "[tModel] = " + tModel + ", "
								+ "[modelToTypeGraph] = " + modelToTypeGraph + ", " + "[mTypeToTType] = " + mTypeToTType
								+ ", " + "[tAbstractType] = " + tAbstractType + ", " + "[ruleResult] = " + ruleResult
								+ ".");
					}
					ArrayTypeToTypeImpl.pattern_ArrayTypeToType_26_6_perform_greenFBFBFBB(mModel, mType, tAbstractType,
							ruleResult);
					//nothing ArrayType mArrayType = (ArrayType) result6_green[0];
					//nothing TypeAccess mTypeAccess = (TypeAccess) result6_green[2];
					//nothing TypeToTAbstractType arrayTypeToTArrayClass = (TypeToTAbstractType) result6_green[4];

				} else {
				}

			} else {
			}

		}
		return ArrayTypeToTypeImpl.pattern_ArrayTypeToType_26_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, Model mModel, Type mType,
			TypeGraph tModel, ModelToTypeGraph modelToTypeGraph, TypeToTAbstractType mTypeToTType,
			TAbstractType tAbstractType, ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("mModel", mModel);
		isApplicableMatch.registerObject("mType", mType);
		isApplicableMatch.registerObject("tModel", tModel);
		isApplicableMatch.registerObject("modelToTypeGraph", modelToTypeGraph);
		isApplicableMatch.registerObject("mTypeToTType", mTypeToTType);
		isApplicableMatch.registerObject("tAbstractType", tAbstractType);
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
		case RulesPackage.ARRAY_TYPE_TO_TYPE___IS_APPROPRIATE_FWD__MATCH_ARRAYTYPE_MODEL_TYPEACCESS_TYPE:
			return isAppropriate_FWD((Match) arguments.get(0), (ArrayType) arguments.get(1), (Model) arguments.get(2),
					(TypeAccess) arguments.get(3), (Type) arguments.get(4));
		case RulesPackage.ARRAY_TYPE_TO_TYPE___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.ARRAY_TYPE_TO_TYPE___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.ARRAY_TYPE_TO_TYPE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_ARRAYTYPE_MODEL_TYPEACCESS_TYPE:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (ArrayType) arguments.get(1), (Model) arguments.get(2),
					(TypeAccess) arguments.get(3), (Type) arguments.get(4));
			return null;
		case RulesPackage.ARRAY_TYPE_TO_TYPE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_ARRAYTYPE_MODEL_TYPEACCESS_TYPE:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (ArrayType) arguments.get(1),
					(Model) arguments.get(2), (TypeAccess) arguments.get(3), (Type) arguments.get(4));
		case RulesPackage.ARRAY_TYPE_TO_TYPE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.ARRAY_TYPE_TO_TYPE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_ARRAYTYPE_MODEL_TYPEACCESS_TYPE_TYPEGRAPH_MODELTOTYPEGRAPH_TYPETOTABSTRACTTYPE_TABSTRACTTYPE:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (ArrayType) arguments.get(1),
					(Model) arguments.get(2), (TypeAccess) arguments.get(3), (Type) arguments.get(4),
					(TypeGraph) arguments.get(5), (ModelToTypeGraph) arguments.get(6),
					(TypeToTAbstractType) arguments.get(7), (TAbstractType) arguments.get(8));
		case RulesPackage.ARRAY_TYPE_TO_TYPE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.ARRAY_TYPE_TO_TYPE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9));
			return null;
		case RulesPackage.ARRAY_TYPE_TO_TYPE___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.ARRAY_TYPE_TO_TYPE___IS_APPROPRIATE_BWD__MATCH_TYPEGRAPH_TABSTRACTTYPE:
			return isAppropriate_BWD((Match) arguments.get(0), (TypeGraph) arguments.get(1),
					(TAbstractType) arguments.get(2));
		case RulesPackage.ARRAY_TYPE_TO_TYPE___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.ARRAY_TYPE_TO_TYPE___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.ARRAY_TYPE_TO_TYPE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TYPEGRAPH_TABSTRACTTYPE:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (TypeGraph) arguments.get(1),
					(TAbstractType) arguments.get(2));
			return null;
		case RulesPackage.ARRAY_TYPE_TO_TYPE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TYPEGRAPH_TABSTRACTTYPE:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (TypeGraph) arguments.get(1),
					(TAbstractType) arguments.get(2));
		case RulesPackage.ARRAY_TYPE_TO_TYPE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.ARRAY_TYPE_TO_TYPE___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.ARRAY_TYPE_TO_TYPE___IS_APPROPRIATE_BWD_TYPE_GRAPH_0__TYPEGRAPH:
			return isAppropriate_BWD_TypeGraph_0((TypeGraph) arguments.get(0));
		case RulesPackage.ARRAY_TYPE_TO_TYPE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_90__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_90((EMoflonEdge) arguments.get(0));
		case RulesPackage.ARRAY_TYPE_TO_TYPE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.ARRAY_TYPE_TO_TYPE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.ARRAY_TYPE_TO_TYPE___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.ARRAY_TYPE_TO_TYPE___IS_APPLICABLE_SOLVE_CSP_CC__ARRAYTYPE_MODEL_TYPEACCESS_TYPE_TYPEGRAPH_TABSTRACTTYPE_MATCH_MATCH:
			return isApplicable_solveCsp_CC((ArrayType) arguments.get(0), (Model) arguments.get(1),
					(TypeAccess) arguments.get(2), (Type) arguments.get(3), (TypeGraph) arguments.get(4),
					(TAbstractType) arguments.get(5), (Match) arguments.get(6), (Match) arguments.get(7));
		case RulesPackage.ARRAY_TYPE_TO_TYPE___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.ARRAY_TYPE_TO_TYPE___CHECK_DEC_FWD__ARRAYTYPE_MODEL_TYPEACCESS_TYPE:
			return checkDEC_FWD((ArrayType) arguments.get(0), (Model) arguments.get(1), (TypeAccess) arguments.get(2),
					(Type) arguments.get(3));
		case RulesPackage.ARRAY_TYPE_TO_TYPE___CHECK_DEC_BWD__TYPEGRAPH_TABSTRACTTYPE:
			return checkDEC_BWD((TypeGraph) arguments.get(0), (TAbstractType) arguments.get(1));
		case RulesPackage.ARRAY_TYPE_TO_TYPE___GENERATE_MODEL__RULEENTRYCONTAINER_MODELTOTYPEGRAPH:
			return generateModel((RuleEntryContainer) arguments.get(0), (ModelToTypeGraph) arguments.get(1));
		case RulesPackage.ARRAY_TYPE_TO_TYPE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_MODEL_TYPE_TYPEGRAPH_MODELTOTYPEGRAPH_TYPETOTABSTRACTTYPE_TABSTRACTTYPE_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (Model) arguments.get(1),
					(Type) arguments.get(2), (TypeGraph) arguments.get(3), (ModelToTypeGraph) arguments.get(4),
					(TypeToTAbstractType) arguments.get(5), (TAbstractType) arguments.get(6),
					(ModelgeneratorRuleResult) arguments.get(7));
		case RulesPackage.ARRAY_TYPE_TO_TYPE___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_ArrayTypeToType_0_1_initialbindings_blackBBBBBB(ArrayTypeToType _this,
			Match match, ArrayType mArrayType, Model mModel, TypeAccess mTypeAccess, Type mType) {
		if (!mArrayType.equals(mType)) {
			return new Object[] { _this, match, mArrayType, mModel, mTypeAccess, mType };
		}
		return null;
	}

	public static final Object[] pattern_ArrayTypeToType_0_2_SolveCSP_bindingFBBBBBB(ArrayTypeToType _this, Match match,
			ArrayType mArrayType, Model mModel, TypeAccess mTypeAccess, Type mType) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, mArrayType, mModel, mTypeAccess, mType);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, mArrayType, mModel, mTypeAccess, mType };
		}
		return null;
	}

	public static final Object[] pattern_ArrayTypeToType_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ArrayTypeToType_0_2_SolveCSP_bindingAndBlackFBBBBBB(ArrayTypeToType _this,
			Match match, ArrayType mArrayType, Model mModel, TypeAccess mTypeAccess, Type mType) {
		Object[] result_pattern_ArrayTypeToType_0_2_SolveCSP_binding = pattern_ArrayTypeToType_0_2_SolveCSP_bindingFBBBBBB(
				_this, match, mArrayType, mModel, mTypeAccess, mType);
		if (result_pattern_ArrayTypeToType_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_ArrayTypeToType_0_2_SolveCSP_binding[0];

			Object[] result_pattern_ArrayTypeToType_0_2_SolveCSP_black = pattern_ArrayTypeToType_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_ArrayTypeToType_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, mArrayType, mModel, mTypeAccess, mType };
			}
		}
		return null;
	}

	public static final boolean pattern_ArrayTypeToType_0_3_CheckCSP_expressionFBB(ArrayTypeToType _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ArrayTypeToType_0_4_collectelementstobetranslated_blackBBBBB(Match match,
			ArrayType mArrayType, Model mModel, TypeAccess mTypeAccess, Type mType) {
		if (!mArrayType.equals(mType)) {
			return new Object[] { match, mArrayType, mModel, mTypeAccess, mType };
		}
		return null;
	}

	public static final Object[] pattern_ArrayTypeToType_0_4_collectelementstobetranslated_greenBBBBBFFFF(Match match,
			ArrayType mArrayType, Model mModel, TypeAccess mTypeAccess, Type mType) {
		EMoflonEdge mArrayType__mTypeAccess____elementType = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mTypeAccess__mType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mType__mTypeAccess____usagesInTypeAccess = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mModel__mArrayType____orphanTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(mArrayType);
		match.getToBeTranslatedNodes().add(mTypeAccess);
		String mArrayType__mTypeAccess____elementType_name_prime = "elementType";
		String mTypeAccess__mType____type_name_prime = "type";
		String mType__mTypeAccess____usagesInTypeAccess_name_prime = "usagesInTypeAccess";
		String mModel__mArrayType____orphanTypes_name_prime = "orphanTypes";
		mArrayType__mTypeAccess____elementType.setSrc(mArrayType);
		mArrayType__mTypeAccess____elementType.setTrg(mTypeAccess);
		match.getToBeTranslatedEdges().add(mArrayType__mTypeAccess____elementType);
		mTypeAccess__mType____type.setSrc(mTypeAccess);
		mTypeAccess__mType____type.setTrg(mType);
		match.getToBeTranslatedEdges().add(mTypeAccess__mType____type);
		mType__mTypeAccess____usagesInTypeAccess.setSrc(mType);
		mType__mTypeAccess____usagesInTypeAccess.setTrg(mTypeAccess);
		match.getToBeTranslatedEdges().add(mType__mTypeAccess____usagesInTypeAccess);
		mModel__mArrayType____orphanTypes.setSrc(mModel);
		mModel__mArrayType____orphanTypes.setTrg(mArrayType);
		match.getToBeTranslatedEdges().add(mModel__mArrayType____orphanTypes);
		mArrayType__mTypeAccess____elementType.setName(mArrayType__mTypeAccess____elementType_name_prime);
		mTypeAccess__mType____type.setName(mTypeAccess__mType____type_name_prime);
		mType__mTypeAccess____usagesInTypeAccess.setName(mType__mTypeAccess____usagesInTypeAccess_name_prime);
		mModel__mArrayType____orphanTypes.setName(mModel__mArrayType____orphanTypes_name_prime);
		return new Object[] { match, mArrayType, mModel, mTypeAccess, mType, mArrayType__mTypeAccess____elementType,
				mTypeAccess__mType____type, mType__mTypeAccess____usagesInTypeAccess,
				mModel__mArrayType____orphanTypes };
	}

	public static final Object[] pattern_ArrayTypeToType_0_5_collectcontextelements_blackBBBBB(Match match,
			ArrayType mArrayType, Model mModel, TypeAccess mTypeAccess, Type mType) {
		if (!mArrayType.equals(mType)) {
			return new Object[] { match, mArrayType, mModel, mTypeAccess, mType };
		}
		return null;
	}

	public static final Object[] pattern_ArrayTypeToType_0_5_collectcontextelements_greenBBB(Match match, Model mModel,
			Type mType) {
		match.getContextNodes().add(mModel);
		match.getContextNodes().add(mType);
		return new Object[] { match, mModel, mType };
	}

	public static final void pattern_ArrayTypeToType_0_6_registerobjectstomatch_expressionBBBBBB(ArrayTypeToType _this,
			Match match, ArrayType mArrayType, Model mModel, TypeAccess mTypeAccess, Type mType) {
		_this.registerObjectsToMatch_FWD(match, mArrayType, mModel, mTypeAccess, mType);

	}

	public static final boolean pattern_ArrayTypeToType_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ArrayTypeToType_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_ArrayTypeToType_1_1_performtransformation_bindingFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("mArrayType");
		EObject _localVariable_1 = isApplicableMatch.getObject("mModel");
		EObject _localVariable_2 = isApplicableMatch.getObject("mTypeAccess");
		EObject _localVariable_3 = isApplicableMatch.getObject("mType");
		EObject _localVariable_4 = isApplicableMatch.getObject("tModel");
		EObject _localVariable_5 = isApplicableMatch.getObject("modelToTypeGraph");
		EObject _localVariable_6 = isApplicableMatch.getObject("mTypeToTType");
		EObject _localVariable_7 = isApplicableMatch.getObject("tAbstractType");
		EObject tmpMArrayType = _localVariable_0;
		EObject tmpMModel = _localVariable_1;
		EObject tmpMTypeAccess = _localVariable_2;
		EObject tmpMType = _localVariable_3;
		EObject tmpTModel = _localVariable_4;
		EObject tmpModelToTypeGraph = _localVariable_5;
		EObject tmpMTypeToTType = _localVariable_6;
		EObject tmpTAbstractType = _localVariable_7;
		if (tmpMArrayType instanceof ArrayType) {
			ArrayType mArrayType = (ArrayType) tmpMArrayType;
			if (tmpMModel instanceof Model) {
				Model mModel = (Model) tmpMModel;
				if (tmpMTypeAccess instanceof TypeAccess) {
					TypeAccess mTypeAccess = (TypeAccess) tmpMTypeAccess;
					if (tmpMType instanceof Type) {
						Type mType = (Type) tmpMType;
						if (tmpTModel instanceof TypeGraph) {
							TypeGraph tModel = (TypeGraph) tmpTModel;
							if (tmpModelToTypeGraph instanceof ModelToTypeGraph) {
								ModelToTypeGraph modelToTypeGraph = (ModelToTypeGraph) tmpModelToTypeGraph;
								if (tmpMTypeToTType instanceof TypeToTAbstractType) {
									TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) tmpMTypeToTType;
									if (tmpTAbstractType instanceof TAbstractType) {
										TAbstractType tAbstractType = (TAbstractType) tmpTAbstractType;
										return new Object[] { mArrayType, mModel, mTypeAccess, mType, tModel,
												modelToTypeGraph, mTypeToTType, tAbstractType, isApplicableMatch };
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

	public static final Object[] pattern_ArrayTypeToType_1_1_performtransformation_blackBBBBBBBBFBB(
			ArrayType mArrayType, Model mModel, TypeAccess mTypeAccess, Type mType, TypeGraph tModel,
			ModelToTypeGraph modelToTypeGraph, TypeToTAbstractType mTypeToTType, TAbstractType tAbstractType,
			ArrayTypeToType _this, IsApplicableMatch isApplicableMatch) {
		if (!mArrayType.equals(mType)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { mArrayType, mModel, mTypeAccess, mType, tModel, modelToTypeGraph,
							mTypeToTType, tAbstractType, csp, _this, isApplicableMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ArrayTypeToType_1_1_performtransformation_bindingAndBlackFFFFFFFFFBB(
			ArrayTypeToType _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_ArrayTypeToType_1_1_performtransformation_binding = pattern_ArrayTypeToType_1_1_performtransformation_bindingFFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_ArrayTypeToType_1_1_performtransformation_binding != null) {
			ArrayType mArrayType = (ArrayType) result_pattern_ArrayTypeToType_1_1_performtransformation_binding[0];
			Model mModel = (Model) result_pattern_ArrayTypeToType_1_1_performtransformation_binding[1];
			TypeAccess mTypeAccess = (TypeAccess) result_pattern_ArrayTypeToType_1_1_performtransformation_binding[2];
			Type mType = (Type) result_pattern_ArrayTypeToType_1_1_performtransformation_binding[3];
			TypeGraph tModel = (TypeGraph) result_pattern_ArrayTypeToType_1_1_performtransformation_binding[4];
			ModelToTypeGraph modelToTypeGraph = (ModelToTypeGraph) result_pattern_ArrayTypeToType_1_1_performtransformation_binding[5];
			TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result_pattern_ArrayTypeToType_1_1_performtransformation_binding[6];
			TAbstractType tAbstractType = (TAbstractType) result_pattern_ArrayTypeToType_1_1_performtransformation_binding[7];

			Object[] result_pattern_ArrayTypeToType_1_1_performtransformation_black = pattern_ArrayTypeToType_1_1_performtransformation_blackBBBBBBBBFBB(
					mArrayType, mModel, mTypeAccess, mType, tModel, modelToTypeGraph, mTypeToTType, tAbstractType,
					_this, isApplicableMatch);
			if (result_pattern_ArrayTypeToType_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_ArrayTypeToType_1_1_performtransformation_black[8];

				return new Object[] { mArrayType, mModel, mTypeAccess, mType, tModel, modelToTypeGraph, mTypeToTType,
						tAbstractType, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ArrayTypeToType_1_1_performtransformation_greenBFB(ArrayType mArrayType,
			TAbstractType tAbstractType) {
		TypeToTAbstractType arrayTypeToTArrayClass = PmFactory.eINSTANCE.createTypeToTAbstractType();
		arrayTypeToTArrayClass.setSource(mArrayType);
		arrayTypeToTArrayClass.setTarget(tAbstractType);
		return new Object[] { mArrayType, arrayTypeToTArrayClass, tAbstractType };
	}

	public static final Object[] pattern_ArrayTypeToType_1_2_collecttranslatedelements_blackBBB(ArrayType mArrayType,
			TypeAccess mTypeAccess, TypeToTAbstractType arrayTypeToTArrayClass) {
		return new Object[] { mArrayType, mTypeAccess, arrayTypeToTArrayClass };
	}

	public static final Object[] pattern_ArrayTypeToType_1_2_collecttranslatedelements_greenFBBB(ArrayType mArrayType,
			TypeAccess mTypeAccess, TypeToTAbstractType arrayTypeToTArrayClass) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(mArrayType);
		ruleresult.getTranslatedElements().add(mTypeAccess);
		ruleresult.getCreatedLinkElements().add(arrayTypeToTArrayClass);
		return new Object[] { ruleresult, mArrayType, mTypeAccess, arrayTypeToTArrayClass };
	}

	public static final Object[] pattern_ArrayTypeToType_1_3_bookkeepingforedges_blackBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject mArrayType, EObject mModel, EObject mTypeAccess, EObject mType,
			EObject tModel, EObject modelToTypeGraph, EObject mTypeToTType, EObject arrayTypeToTArrayClass,
			EObject tAbstractType) {
		if (!mArrayType.equals(mModel)) {
			if (!mArrayType.equals(mTypeAccess)) {
				if (!mArrayType.equals(mType)) {
					if (!mArrayType.equals(tModel)) {
						if (!mArrayType.equals(modelToTypeGraph)) {
							if (!mArrayType.equals(mTypeToTType)) {
								if (!mArrayType.equals(tAbstractType)) {
									if (!mModel.equals(mTypeAccess)) {
										if (!mModel.equals(mType)) {
											if (!mModel.equals(tModel)) {
												if (!mModel.equals(modelToTypeGraph)) {
													if (!mModel.equals(mTypeToTType)) {
														if (!mModel.equals(tAbstractType)) {
															if (!mTypeAccess.equals(tModel)) {
																if (!mTypeAccess.equals(modelToTypeGraph)) {
																	if (!mTypeAccess.equals(mTypeToTType)) {
																		if (!mTypeAccess.equals(tAbstractType)) {
																			if (!mType.equals(mTypeAccess)) {
																				if (!mType.equals(tModel)) {
																					if (!mType
																							.equals(modelToTypeGraph)) {
																						if (!mType
																								.equals(mTypeToTType)) {
																							if (!mType.equals(
																									tAbstractType)) {
																								if (!modelToTypeGraph
																										.equals(tModel)) {
																									if (!modelToTypeGraph
																											.equals(tAbstractType)) {
																										if (!mTypeToTType
																												.equals(tModel)) {
																											if (!mTypeToTType
																													.equals(modelToTypeGraph)) {
																												if (!mTypeToTType
																														.equals(tAbstractType)) {
																													if (!arrayTypeToTArrayClass
																															.equals(mArrayType)) {
																														if (!arrayTypeToTArrayClass
																																.equals(mModel)) {
																															if (!arrayTypeToTArrayClass
																																	.equals(mTypeAccess)) {
																																if (!arrayTypeToTArrayClass
																																		.equals(mType)) {
																																	if (!arrayTypeToTArrayClass
																																			.equals(tModel)) {
																																		if (!arrayTypeToTArrayClass
																																				.equals(modelToTypeGraph)) {
																																			if (!arrayTypeToTArrayClass
																																					.equals(mTypeToTType)) {
																																				if (!arrayTypeToTArrayClass
																																						.equals(tAbstractType)) {
																																					if (!tAbstractType
																																							.equals(tModel)) {
																																						return new Object[] {
																																								ruleresult,
																																								mArrayType,
																																								mModel,
																																								mTypeAccess,
																																								mType,
																																								tModel,
																																								modelToTypeGraph,
																																								mTypeToTType,
																																								arrayTypeToTArrayClass,
																																								tAbstractType };
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_ArrayTypeToType_1_3_bookkeepingforedges_greenBBBBBBBFFFFFF(
			PerformRuleResult ruleresult, EObject mArrayType, EObject mModel, EObject mTypeAccess, EObject mType,
			EObject arrayTypeToTArrayClass, EObject tAbstractType) {
		EMoflonEdge mArrayType__mTypeAccess____elementType = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mTypeAccess__mType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mType__mTypeAccess____usagesInTypeAccess = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mModel__mArrayType____orphanTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge arrayTypeToTArrayClass__mArrayType____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge arrayTypeToTArrayClass__tAbstractType____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "ArrayTypeToType";
		String mArrayType__mTypeAccess____elementType_name_prime = "elementType";
		String mTypeAccess__mType____type_name_prime = "type";
		String mType__mTypeAccess____usagesInTypeAccess_name_prime = "usagesInTypeAccess";
		String mModel__mArrayType____orphanTypes_name_prime = "orphanTypes";
		String arrayTypeToTArrayClass__mArrayType____source_name_prime = "source";
		String arrayTypeToTArrayClass__tAbstractType____target_name_prime = "target";
		mArrayType__mTypeAccess____elementType.setSrc(mArrayType);
		mArrayType__mTypeAccess____elementType.setTrg(mTypeAccess);
		ruleresult.getTranslatedEdges().add(mArrayType__mTypeAccess____elementType);
		mTypeAccess__mType____type.setSrc(mTypeAccess);
		mTypeAccess__mType____type.setTrg(mType);
		ruleresult.getTranslatedEdges().add(mTypeAccess__mType____type);
		mType__mTypeAccess____usagesInTypeAccess.setSrc(mType);
		mType__mTypeAccess____usagesInTypeAccess.setTrg(mTypeAccess);
		ruleresult.getTranslatedEdges().add(mType__mTypeAccess____usagesInTypeAccess);
		mModel__mArrayType____orphanTypes.setSrc(mModel);
		mModel__mArrayType____orphanTypes.setTrg(mArrayType);
		ruleresult.getTranslatedEdges().add(mModel__mArrayType____orphanTypes);
		arrayTypeToTArrayClass__mArrayType____source.setSrc(arrayTypeToTArrayClass);
		arrayTypeToTArrayClass__mArrayType____source.setTrg(mArrayType);
		ruleresult.getCreatedEdges().add(arrayTypeToTArrayClass__mArrayType____source);
		arrayTypeToTArrayClass__tAbstractType____target.setSrc(arrayTypeToTArrayClass);
		arrayTypeToTArrayClass__tAbstractType____target.setTrg(tAbstractType);
		ruleresult.getCreatedEdges().add(arrayTypeToTArrayClass__tAbstractType____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		mArrayType__mTypeAccess____elementType.setName(mArrayType__mTypeAccess____elementType_name_prime);
		mTypeAccess__mType____type.setName(mTypeAccess__mType____type_name_prime);
		mType__mTypeAccess____usagesInTypeAccess.setName(mType__mTypeAccess____usagesInTypeAccess_name_prime);
		mModel__mArrayType____orphanTypes.setName(mModel__mArrayType____orphanTypes_name_prime);
		arrayTypeToTArrayClass__mArrayType____source.setName(arrayTypeToTArrayClass__mArrayType____source_name_prime);
		arrayTypeToTArrayClass__tAbstractType____target
				.setName(arrayTypeToTArrayClass__tAbstractType____target_name_prime);
		return new Object[] { ruleresult, mArrayType, mModel, mTypeAccess, mType, arrayTypeToTArrayClass, tAbstractType,
				mArrayType__mTypeAccess____elementType, mTypeAccess__mType____type,
				mType__mTypeAccess____usagesInTypeAccess, mModel__mArrayType____orphanTypes,
				arrayTypeToTArrayClass__mArrayType____source, arrayTypeToTArrayClass__tAbstractType____target };
	}

	public static final void pattern_ArrayTypeToType_1_5_registerobjects_expressionBBBBBBBBBBB(ArrayTypeToType _this,
			PerformRuleResult ruleresult, EObject mArrayType, EObject mModel, EObject mTypeAccess, EObject mType,
			EObject tModel, EObject modelToTypeGraph, EObject mTypeToTType, EObject arrayTypeToTArrayClass,
			EObject tAbstractType) {
		_this.registerObjects_FWD(ruleresult, mArrayType, mModel, mTypeAccess, mType, tModel, modelToTypeGraph,
				mTypeToTType, arrayTypeToTArrayClass, tAbstractType);

	}

	public static final PerformRuleResult pattern_ArrayTypeToType_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ArrayTypeToType_2_1_preparereturnvalue_bindingFB(ArrayTypeToType _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ArrayTypeToType_2_1_preparereturnvalue_blackFBB(EClass eClass,
			ArrayTypeToType _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ArrayTypeToType_2_1_preparereturnvalue_bindingAndBlackFFB(
			ArrayTypeToType _this) {
		Object[] result_pattern_ArrayTypeToType_2_1_preparereturnvalue_binding = pattern_ArrayTypeToType_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_ArrayTypeToType_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_ArrayTypeToType_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_ArrayTypeToType_2_1_preparereturnvalue_black = pattern_ArrayTypeToType_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_ArrayTypeToType_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_ArrayTypeToType_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ArrayTypeToType_2_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "ArrayTypeToType";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_ArrayTypeToType_2_2_corematch_bindingFFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("mArrayType");
		EObject _localVariable_1 = match.getObject("mModel");
		EObject _localVariable_2 = match.getObject("mTypeAccess");
		EObject _localVariable_3 = match.getObject("mType");
		EObject tmpMArrayType = _localVariable_0;
		EObject tmpMModel = _localVariable_1;
		EObject tmpMTypeAccess = _localVariable_2;
		EObject tmpMType = _localVariable_3;
		if (tmpMArrayType instanceof ArrayType) {
			ArrayType mArrayType = (ArrayType) tmpMArrayType;
			if (tmpMModel instanceof Model) {
				Model mModel = (Model) tmpMModel;
				if (tmpMTypeAccess instanceof TypeAccess) {
					TypeAccess mTypeAccess = (TypeAccess) tmpMTypeAccess;
					if (tmpMType instanceof Type) {
						Type mType = (Type) tmpMType;
						return new Object[] { mArrayType, mModel, mTypeAccess, mType, match };
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ArrayTypeToType_2_2_corematch_blackBBBBFFFFB(ArrayType mArrayType,
			Model mModel, TypeAccess mTypeAccess, Type mType, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!mArrayType.equals(mType)) {
			for (TypeToTAbstractType mTypeToTType : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(mType, TypeToTAbstractType.class, "source")) {
				TAbstractType tAbstractType = mTypeToTType.getTarget();
				if (tAbstractType != null) {
					for (ModelToTypeGraph modelToTypeGraph : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(mModel, ModelToTypeGraph.class, "source")) {
						TypeGraph tModel = modelToTypeGraph.getTarget();
						if (tModel != null) {
							_result.add(new Object[] { mArrayType, mModel, mTypeAccess, mType, tModel, modelToTypeGraph,
									mTypeToTType, tAbstractType, match });
						}

					}
				}

			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_ArrayTypeToType_2_3_findcontext_blackBBBBBBBB(ArrayType mArrayType,
			Model mModel, TypeAccess mTypeAccess, Type mType, TypeGraph tModel, ModelToTypeGraph modelToTypeGraph,
			TypeToTAbstractType mTypeToTType, TAbstractType tAbstractType) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!mArrayType.equals(mType)) {
			if (mTypeAccess.equals(mArrayType.getElementType())) {
				if (tModel.equals(modelToTypeGraph.getTarget())) {
					if (mType.equals(mTypeToTType.getSource())) {
						if (mType.equals(mTypeAccess.getType())) {
							if (tModel.getOwnedTypes().contains(tAbstractType)) {
								if (mModel.getOrphanTypes().contains(mArrayType)) {
									if (mModel.equals(modelToTypeGraph.getSource())) {
										if (tAbstractType.equals(mTypeToTType.getTarget())) {
											_result.add(new Object[] { mArrayType, mModel, mTypeAccess, mType, tModel,
													modelToTypeGraph, mTypeToTType, tAbstractType });
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

	public static final Object[] pattern_ArrayTypeToType_2_3_findcontext_greenBBBBBBBBFFFFFFFFFFF(ArrayType mArrayType,
			Model mModel, TypeAccess mTypeAccess, Type mType, TypeGraph tModel, ModelToTypeGraph modelToTypeGraph,
			TypeToTAbstractType mTypeToTType, TAbstractType tAbstractType) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge mArrayType__mTypeAccess____elementType = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge modelToTypeGraph__tModel____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mTypeToTType__mType____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mTypeAccess__mType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mType__mTypeAccess____usagesInTypeAccess = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tModel__tAbstractType____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAbstractType__tModel____model = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mModel__mArrayType____orphanTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge modelToTypeGraph__mModel____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mTypeToTType__tAbstractType____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String mArrayType__mTypeAccess____elementType_name_prime = "elementType";
		String modelToTypeGraph__tModel____target_name_prime = "target";
		String mTypeToTType__mType____source_name_prime = "source";
		String mTypeAccess__mType____type_name_prime = "type";
		String mType__mTypeAccess____usagesInTypeAccess_name_prime = "usagesInTypeAccess";
		String tModel__tAbstractType____ownedTypes_name_prime = "ownedTypes";
		String tAbstractType__tModel____model_name_prime = "model";
		String mModel__mArrayType____orphanTypes_name_prime = "orphanTypes";
		String modelToTypeGraph__mModel____source_name_prime = "source";
		String mTypeToTType__tAbstractType____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(mArrayType);
		isApplicableMatch.getAllContextElements().add(mModel);
		isApplicableMatch.getAllContextElements().add(mTypeAccess);
		isApplicableMatch.getAllContextElements().add(mType);
		isApplicableMatch.getAllContextElements().add(tModel);
		isApplicableMatch.getAllContextElements().add(modelToTypeGraph);
		isApplicableMatch.getAllContextElements().add(mTypeToTType);
		isApplicableMatch.getAllContextElements().add(tAbstractType);
		mArrayType__mTypeAccess____elementType.setSrc(mArrayType);
		mArrayType__mTypeAccess____elementType.setTrg(mTypeAccess);
		isApplicableMatch.getAllContextElements().add(mArrayType__mTypeAccess____elementType);
		modelToTypeGraph__tModel____target.setSrc(modelToTypeGraph);
		modelToTypeGraph__tModel____target.setTrg(tModel);
		isApplicableMatch.getAllContextElements().add(modelToTypeGraph__tModel____target);
		mTypeToTType__mType____source.setSrc(mTypeToTType);
		mTypeToTType__mType____source.setTrg(mType);
		isApplicableMatch.getAllContextElements().add(mTypeToTType__mType____source);
		mTypeAccess__mType____type.setSrc(mTypeAccess);
		mTypeAccess__mType____type.setTrg(mType);
		isApplicableMatch.getAllContextElements().add(mTypeAccess__mType____type);
		mType__mTypeAccess____usagesInTypeAccess.setSrc(mType);
		mType__mTypeAccess____usagesInTypeAccess.setTrg(mTypeAccess);
		isApplicableMatch.getAllContextElements().add(mType__mTypeAccess____usagesInTypeAccess);
		tModel__tAbstractType____ownedTypes.setSrc(tModel);
		tModel__tAbstractType____ownedTypes.setTrg(tAbstractType);
		isApplicableMatch.getAllContextElements().add(tModel__tAbstractType____ownedTypes);
		tAbstractType__tModel____model.setSrc(tAbstractType);
		tAbstractType__tModel____model.setTrg(tModel);
		isApplicableMatch.getAllContextElements().add(tAbstractType__tModel____model);
		mModel__mArrayType____orphanTypes.setSrc(mModel);
		mModel__mArrayType____orphanTypes.setTrg(mArrayType);
		isApplicableMatch.getAllContextElements().add(mModel__mArrayType____orphanTypes);
		modelToTypeGraph__mModel____source.setSrc(modelToTypeGraph);
		modelToTypeGraph__mModel____source.setTrg(mModel);
		isApplicableMatch.getAllContextElements().add(modelToTypeGraph__mModel____source);
		mTypeToTType__tAbstractType____target.setSrc(mTypeToTType);
		mTypeToTType__tAbstractType____target.setTrg(tAbstractType);
		isApplicableMatch.getAllContextElements().add(mTypeToTType__tAbstractType____target);
		mArrayType__mTypeAccess____elementType.setName(mArrayType__mTypeAccess____elementType_name_prime);
		modelToTypeGraph__tModel____target.setName(modelToTypeGraph__tModel____target_name_prime);
		mTypeToTType__mType____source.setName(mTypeToTType__mType____source_name_prime);
		mTypeAccess__mType____type.setName(mTypeAccess__mType____type_name_prime);
		mType__mTypeAccess____usagesInTypeAccess.setName(mType__mTypeAccess____usagesInTypeAccess_name_prime);
		tModel__tAbstractType____ownedTypes.setName(tModel__tAbstractType____ownedTypes_name_prime);
		tAbstractType__tModel____model.setName(tAbstractType__tModel____model_name_prime);
		mModel__mArrayType____orphanTypes.setName(mModel__mArrayType____orphanTypes_name_prime);
		modelToTypeGraph__mModel____source.setName(modelToTypeGraph__mModel____source_name_prime);
		mTypeToTType__tAbstractType____target.setName(mTypeToTType__tAbstractType____target_name_prime);
		return new Object[] { mArrayType, mModel, mTypeAccess, mType, tModel, modelToTypeGraph, mTypeToTType,
				tAbstractType, isApplicableMatch, mArrayType__mTypeAccess____elementType,
				modelToTypeGraph__tModel____target, mTypeToTType__mType____source, mTypeAccess__mType____type,
				mType__mTypeAccess____usagesInTypeAccess, tModel__tAbstractType____ownedTypes,
				tAbstractType__tModel____model, mModel__mArrayType____orphanTypes, modelToTypeGraph__mModel____source,
				mTypeToTType__tAbstractType____target };
	}

	public static final Object[] pattern_ArrayTypeToType_2_4_solveCSP_bindingFBBBBBBBBBB(ArrayTypeToType _this,
			IsApplicableMatch isApplicableMatch, ArrayType mArrayType, Model mModel, TypeAccess mTypeAccess, Type mType,
			TypeGraph tModel, ModelToTypeGraph modelToTypeGraph, TypeToTAbstractType mTypeToTType,
			TAbstractType tAbstractType) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, mArrayType, mModel, mTypeAccess,
				mType, tModel, modelToTypeGraph, mTypeToTType, tAbstractType);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mArrayType, mModel, mTypeAccess, mType, tModel,
					modelToTypeGraph, mTypeToTType, tAbstractType };
		}
		return null;
	}

	public static final Object[] pattern_ArrayTypeToType_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ArrayTypeToType_2_4_solveCSP_bindingAndBlackFBBBBBBBBBB(ArrayTypeToType _this,
			IsApplicableMatch isApplicableMatch, ArrayType mArrayType, Model mModel, TypeAccess mTypeAccess, Type mType,
			TypeGraph tModel, ModelToTypeGraph modelToTypeGraph, TypeToTAbstractType mTypeToTType,
			TAbstractType tAbstractType) {
		Object[] result_pattern_ArrayTypeToType_2_4_solveCSP_binding = pattern_ArrayTypeToType_2_4_solveCSP_bindingFBBBBBBBBBB(
				_this, isApplicableMatch, mArrayType, mModel, mTypeAccess, mType, tModel, modelToTypeGraph,
				mTypeToTType, tAbstractType);
		if (result_pattern_ArrayTypeToType_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_ArrayTypeToType_2_4_solveCSP_binding[0];

			Object[] result_pattern_ArrayTypeToType_2_4_solveCSP_black = pattern_ArrayTypeToType_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_ArrayTypeToType_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mArrayType, mModel, mTypeAccess, mType, tModel,
						modelToTypeGraph, mTypeToTType, tAbstractType };
			}
		}
		return null;
	}

	public static final boolean pattern_ArrayTypeToType_2_5_checkCSP_expressionFBB(ArrayTypeToType _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ArrayTypeToType_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_ArrayTypeToType_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "ArrayTypeToType";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_ArrayTypeToType_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ArrayTypeToType_10_1_initialbindings_blackBBBB(ArrayTypeToType _this,
			Match match, TypeGraph tModel, TAbstractType tAbstractType) {
		return new Object[] { _this, match, tModel, tAbstractType };
	}

	public static final Object[] pattern_ArrayTypeToType_10_2_SolveCSP_bindingFBBBB(ArrayTypeToType _this, Match match,
			TypeGraph tModel, TAbstractType tAbstractType) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, tModel, tAbstractType);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, tModel, tAbstractType };
		}
		return null;
	}

	public static final Object[] pattern_ArrayTypeToType_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ArrayTypeToType_10_2_SolveCSP_bindingAndBlackFBBBB(ArrayTypeToType _this,
			Match match, TypeGraph tModel, TAbstractType tAbstractType) {
		Object[] result_pattern_ArrayTypeToType_10_2_SolveCSP_binding = pattern_ArrayTypeToType_10_2_SolveCSP_bindingFBBBB(
				_this, match, tModel, tAbstractType);
		if (result_pattern_ArrayTypeToType_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_ArrayTypeToType_10_2_SolveCSP_binding[0];

			Object[] result_pattern_ArrayTypeToType_10_2_SolveCSP_black = pattern_ArrayTypeToType_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_ArrayTypeToType_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, tModel, tAbstractType };
			}
		}
		return null;
	}

	public static final boolean pattern_ArrayTypeToType_10_3_CheckCSP_expressionFBB(ArrayTypeToType _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ArrayTypeToType_10_4_collectelementstobetranslated_blackBBB(Match match,
			TypeGraph tModel, TAbstractType tAbstractType) {
		return new Object[] { match, tModel, tAbstractType };
	}

	public static final Object[] pattern_ArrayTypeToType_10_5_collectcontextelements_blackBBB(Match match,
			TypeGraph tModel, TAbstractType tAbstractType) {
		return new Object[] { match, tModel, tAbstractType };
	}

	public static final Object[] pattern_ArrayTypeToType_10_5_collectcontextelements_greenBBBFF(Match match,
			TypeGraph tModel, TAbstractType tAbstractType) {
		EMoflonEdge tModel__tAbstractType____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAbstractType__tModel____model = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(tModel);
		match.getContextNodes().add(tAbstractType);
		String tModel__tAbstractType____ownedTypes_name_prime = "ownedTypes";
		String tAbstractType__tModel____model_name_prime = "model";
		tModel__tAbstractType____ownedTypes.setSrc(tModel);
		tModel__tAbstractType____ownedTypes.setTrg(tAbstractType);
		match.getContextEdges().add(tModel__tAbstractType____ownedTypes);
		tAbstractType__tModel____model.setSrc(tAbstractType);
		tAbstractType__tModel____model.setTrg(tModel);
		match.getContextEdges().add(tAbstractType__tModel____model);
		tModel__tAbstractType____ownedTypes.setName(tModel__tAbstractType____ownedTypes_name_prime);
		tAbstractType__tModel____model.setName(tAbstractType__tModel____model_name_prime);
		return new Object[] { match, tModel, tAbstractType, tModel__tAbstractType____ownedTypes,
				tAbstractType__tModel____model };
	}

	public static final void pattern_ArrayTypeToType_10_6_registerobjectstomatch_expressionBBBB(ArrayTypeToType _this,
			Match match, TypeGraph tModel, TAbstractType tAbstractType) {
		_this.registerObjectsToMatch_BWD(match, tModel, tAbstractType);

	}

	public static final boolean pattern_ArrayTypeToType_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ArrayTypeToType_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_ArrayTypeToType_17_1_preparereturnvalue_bindingFB(ArrayTypeToType _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ArrayTypeToType_17_1_preparereturnvalue_blackFBBF(EClass __eClass,
			ArrayTypeToType _this) {
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

	public static final Object[] pattern_ArrayTypeToType_17_1_preparereturnvalue_bindingAndBlackFFBF(
			ArrayTypeToType _this) {
		Object[] result_pattern_ArrayTypeToType_17_1_preparereturnvalue_binding = pattern_ArrayTypeToType_17_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_ArrayTypeToType_17_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_ArrayTypeToType_17_1_preparereturnvalue_binding[0];

			Object[] result_pattern_ArrayTypeToType_17_1_preparereturnvalue_black = pattern_ArrayTypeToType_17_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_ArrayTypeToType_17_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ArrayTypeToType_17_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_ArrayTypeToType_17_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_ArrayTypeToType_17_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_ArrayTypeToType_17_2_testcorematchandDECs_blackBF(TypeGraph tModel) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (TAbstractType tAbstractType : tModel.getOwnedTypes()) {
			_result.add(new Object[] { tModel, tAbstractType });
		}
		return _result;
	}

	public static final Object[] pattern_ArrayTypeToType_17_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ArrayTypeToType_17_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			ArrayTypeToType _this, Match match, TypeGraph tModel, TAbstractType tAbstractType) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, tModel, tAbstractType);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ArrayTypeToType_17_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			ArrayTypeToType _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ArrayTypeToType_17_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_ArrayTypeToType_17_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_ArrayTypeToType_17_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ArrayTypeToType_18_1_preparereturnvalue_bindingFB(ArrayTypeToType _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ArrayTypeToType_18_1_preparereturnvalue_blackFBBF(EClass __eClass,
			ArrayTypeToType _this) {
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

	public static final Object[] pattern_ArrayTypeToType_18_1_preparereturnvalue_bindingAndBlackFFBF(
			ArrayTypeToType _this) {
		Object[] result_pattern_ArrayTypeToType_18_1_preparereturnvalue_binding = pattern_ArrayTypeToType_18_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_ArrayTypeToType_18_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_ArrayTypeToType_18_1_preparereturnvalue_binding[0];

			Object[] result_pattern_ArrayTypeToType_18_1_preparereturnvalue_black = pattern_ArrayTypeToType_18_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_ArrayTypeToType_18_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ArrayTypeToType_18_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_ArrayTypeToType_18_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_ArrayTypeToType_18_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_ArrayTypeToType_18_2_testcorematchandDECs_black_nac_0BB(TypeAccess mTypeAccess,
			Type mType) {
		for (AbstractTypeDeclaration __DEC_mTypeAccess_superInterfaces_65982 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mTypeAccess, AbstractTypeDeclaration.class, "superInterfaces")) {
			if (!mType.equals(__DEC_mTypeAccess_superInterfaces_65982)) {
				return new Object[] { mTypeAccess, mType };
			}
		}
		return null;
	}

	public static final Object[] pattern_ArrayTypeToType_18_2_testcorematchandDECs_black_nac_1B(
			TypeAccess mTypeAccess) {
		for (Annotation __DEC_mTypeAccess_type_641699 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mTypeAccess, Annotation.class, "type")) {
			return new Object[] { mTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_ArrayTypeToType_18_2_testcorematchandDECs_black_nac_2B(
			TypeAccess mTypeAccess) {
		for (AnnotationTypeMemberDeclaration __DEC_mTypeAccess_type_642737 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mTypeAccess, AnnotationTypeMemberDeclaration.class, "type")) {
			return new Object[] { mTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_ArrayTypeToType_18_2_testcorematchandDECs_black_nac_3B(
			TypeAccess mTypeAccess) {
		for (ClassInstanceCreation __DEC_mTypeAccess_type_35938 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mTypeAccess, ClassInstanceCreation.class, "type")) {
			return new Object[] { mTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_ArrayTypeToType_18_2_testcorematchandDECs_black_nac_4BB(TypeAccess mTypeAccess,
			Type mType) {
		for (ClassDeclaration __DEC_mTypeAccess_superClass_595331 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mTypeAccess, ClassDeclaration.class, "superClass")) {
			if (!mType.equals(__DEC_mTypeAccess_superClass_595331)) {
				return new Object[] { mTypeAccess, mType };
			}
		}
		return null;
	}

	public static final Object[] pattern_ArrayTypeToType_18_2_testcorematchandDECs_black_nac_5B(
			TypeAccess mTypeAccess) {
		for (MethodDeclaration __DEC_mTypeAccess_returnType_316780 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mTypeAccess, MethodDeclaration.class, "returnType")) {
			return new Object[] { mTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_ArrayTypeToType_18_2_testcorematchandDECs_black_nac_6BB(TypeAccess mTypeAccess,
			Type mType) {
		for (ParameterizedType __DEC_mTypeAccess_type_816102 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mTypeAccess, ParameterizedType.class, "type")) {
			if (!mType.equals(__DEC_mTypeAccess_type_816102)) {
				return new Object[] { mTypeAccess, mType };
			}
		}
		return null;
	}

	public static final Object[] pattern_ArrayTypeToType_18_2_testcorematchandDECs_black_nac_7B(
			TypeAccess mTypeAccess) {
		for (TypeLiteral __DEC_mTypeAccess_type_579932 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mTypeAccess, TypeLiteral.class, "type")) {
			return new Object[] { mTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_ArrayTypeToType_18_2_testcorematchandDECs_black_nac_8B(
			TypeAccess mTypeAccess) {
		for (AnnotationMemberValuePair __DEC_mTypeAccess_value_577581 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mTypeAccess, AnnotationMemberValuePair.class, "value")) {
			return new Object[] { mTypeAccess };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ArrayTypeToType_18_2_testcorematchandDECs_blackFFFFB(
			EMoflonEdge _edge_elementType) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpMArrayType = _edge_elementType.getSrc();
		if (tmpMArrayType instanceof ArrayType) {
			ArrayType mArrayType = (ArrayType) tmpMArrayType;
			EObject tmpMTypeAccess = _edge_elementType.getTrg();
			if (tmpMTypeAccess instanceof TypeAccess) {
				TypeAccess mTypeAccess = (TypeAccess) tmpMTypeAccess;
				if (mTypeAccess.equals(mArrayType.getElementType())) {
					Type mType = mTypeAccess.getType();
					if (mType != null) {
						if (!mArrayType.equals(mType)) {
							if (pattern_ArrayTypeToType_18_2_testcorematchandDECs_black_nac_1B(mTypeAccess) == null) {
								if (pattern_ArrayTypeToType_18_2_testcorematchandDECs_black_nac_2B(
										mTypeAccess) == null) {
									if (pattern_ArrayTypeToType_18_2_testcorematchandDECs_black_nac_3B(
											mTypeAccess) == null) {
										if (pattern_ArrayTypeToType_18_2_testcorematchandDECs_black_nac_5B(
												mTypeAccess) == null) {
											if (pattern_ArrayTypeToType_18_2_testcorematchandDECs_black_nac_7B(
													mTypeAccess) == null) {
												if (pattern_ArrayTypeToType_18_2_testcorematchandDECs_black_nac_8B(
														mTypeAccess) == null) {
													if (pattern_ArrayTypeToType_18_2_testcorematchandDECs_black_nac_0BB(
															mTypeAccess, mType) == null) {
														if (pattern_ArrayTypeToType_18_2_testcorematchandDECs_black_nac_4BB(
																mTypeAccess, mType) == null) {
															if (pattern_ArrayTypeToType_18_2_testcorematchandDECs_black_nac_6BB(
																	mTypeAccess, mType) == null) {
																for (Model mModel : org.moflon.core.utilities.eMoflonEMFUtil
																		.getOppositeReferenceTyped(mArrayType,
																				Model.class, "orphanTypes")) {
																	_result.add(new Object[] { mArrayType, mModel,
																			mTypeAccess, mType, _edge_elementType });
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_ArrayTypeToType_18_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ArrayTypeToType_18_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(
			ArrayTypeToType _this, Match match, ArrayType mArrayType, Model mModel, TypeAccess mTypeAccess,
			Type mType) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, mArrayType, mModel, mTypeAccess, mType);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ArrayTypeToType_18_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			ArrayTypeToType _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ArrayTypeToType_18_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_ArrayTypeToType_18_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_ArrayTypeToType_18_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ArrayTypeToType_21_1_prepare_blackB(ArrayTypeToType _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_ArrayTypeToType_21_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_ArrayTypeToType_21_2_matchsrctrgcontext_bindingFFFFFFBB(Match sourceMatch,
			Match targetMatch) {
		EObject _localVariable_0 = sourceMatch.getObject("mArrayType");
		EObject _localVariable_1 = sourceMatch.getObject("mModel");
		EObject _localVariable_2 = sourceMatch.getObject("mTypeAccess");
		EObject _localVariable_3 = sourceMatch.getObject("mType");
		EObject _localVariable_4 = targetMatch.getObject("tModel");
		EObject _localVariable_5 = targetMatch.getObject("tAbstractType");
		EObject tmpMArrayType = _localVariable_0;
		EObject tmpMModel = _localVariable_1;
		EObject tmpMTypeAccess = _localVariable_2;
		EObject tmpMType = _localVariable_3;
		EObject tmpTModel = _localVariable_4;
		EObject tmpTAbstractType = _localVariable_5;
		if (tmpMArrayType instanceof ArrayType) {
			ArrayType mArrayType = (ArrayType) tmpMArrayType;
			if (tmpMModel instanceof Model) {
				Model mModel = (Model) tmpMModel;
				if (tmpMTypeAccess instanceof TypeAccess) {
					TypeAccess mTypeAccess = (TypeAccess) tmpMTypeAccess;
					if (tmpMType instanceof Type) {
						Type mType = (Type) tmpMType;
						if (tmpTModel instanceof TypeGraph) {
							TypeGraph tModel = (TypeGraph) tmpTModel;
							if (tmpTAbstractType instanceof TAbstractType) {
								TAbstractType tAbstractType = (TAbstractType) tmpTAbstractType;
								return new Object[] { mArrayType, mModel, mTypeAccess, mType, tModel, tAbstractType,
										sourceMatch, targetMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ArrayTypeToType_21_2_matchsrctrgcontext_blackBBBBBBBB(ArrayType mArrayType,
			Model mModel, TypeAccess mTypeAccess, Type mType, TypeGraph tModel, TAbstractType tAbstractType,
			Match sourceMatch, Match targetMatch) {
		if (!mArrayType.equals(mType)) {
			if (!sourceMatch.equals(targetMatch)) {
				return new Object[] { mArrayType, mModel, mTypeAccess, mType, tModel, tAbstractType, sourceMatch,
						targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ArrayTypeToType_21_2_matchsrctrgcontext_bindingAndBlackFFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_ArrayTypeToType_21_2_matchsrctrgcontext_binding = pattern_ArrayTypeToType_21_2_matchsrctrgcontext_bindingFFFFFFBB(
				sourceMatch, targetMatch);
		if (result_pattern_ArrayTypeToType_21_2_matchsrctrgcontext_binding != null) {
			ArrayType mArrayType = (ArrayType) result_pattern_ArrayTypeToType_21_2_matchsrctrgcontext_binding[0];
			Model mModel = (Model) result_pattern_ArrayTypeToType_21_2_matchsrctrgcontext_binding[1];
			TypeAccess mTypeAccess = (TypeAccess) result_pattern_ArrayTypeToType_21_2_matchsrctrgcontext_binding[2];
			Type mType = (Type) result_pattern_ArrayTypeToType_21_2_matchsrctrgcontext_binding[3];
			TypeGraph tModel = (TypeGraph) result_pattern_ArrayTypeToType_21_2_matchsrctrgcontext_binding[4];
			TAbstractType tAbstractType = (TAbstractType) result_pattern_ArrayTypeToType_21_2_matchsrctrgcontext_binding[5];

			Object[] result_pattern_ArrayTypeToType_21_2_matchsrctrgcontext_black = pattern_ArrayTypeToType_21_2_matchsrctrgcontext_blackBBBBBBBB(
					mArrayType, mModel, mTypeAccess, mType, tModel, tAbstractType, sourceMatch, targetMatch);
			if (result_pattern_ArrayTypeToType_21_2_matchsrctrgcontext_black != null) {

				return new Object[] { mArrayType, mModel, mTypeAccess, mType, tModel, tAbstractType, sourceMatch,
						targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ArrayTypeToType_21_3_solvecsp_bindingFBBBBBBBBB(ArrayTypeToType _this,
			ArrayType mArrayType, Model mModel, TypeAccess mTypeAccess, Type mType, TypeGraph tModel,
			TAbstractType tAbstractType, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_6 = _this.isApplicable_solveCsp_CC(mArrayType, mModel, mTypeAccess, mType, tModel,
				tAbstractType, sourceMatch, targetMatch);
		CSP csp = _localVariable_6;
		if (csp != null) {
			return new Object[] { csp, _this, mArrayType, mModel, mTypeAccess, mType, tModel, tAbstractType,
					sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_ArrayTypeToType_21_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ArrayTypeToType_21_3_solvecsp_bindingAndBlackFBBBBBBBBB(ArrayTypeToType _this,
			ArrayType mArrayType, Model mModel, TypeAccess mTypeAccess, Type mType, TypeGraph tModel,
			TAbstractType tAbstractType, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_ArrayTypeToType_21_3_solvecsp_binding = pattern_ArrayTypeToType_21_3_solvecsp_bindingFBBBBBBBBB(
				_this, mArrayType, mModel, mTypeAccess, mType, tModel, tAbstractType, sourceMatch, targetMatch);
		if (result_pattern_ArrayTypeToType_21_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_ArrayTypeToType_21_3_solvecsp_binding[0];

			Object[] result_pattern_ArrayTypeToType_21_3_solvecsp_black = pattern_ArrayTypeToType_21_3_solvecsp_blackB(
					csp);
			if (result_pattern_ArrayTypeToType_21_3_solvecsp_black != null) {

				return new Object[] { csp, _this, mArrayType, mModel, mTypeAccess, mType, tModel, tAbstractType,
						sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_ArrayTypeToType_21_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_ArrayTypeToType_21_5_matchcorrcontext_blackBBBFFBBB(Model mModel,
			Type mType, TypeGraph tModel, TAbstractType tAbstractType, Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (ModelToTypeGraph modelToTypeGraph : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(tModel, ModelToTypeGraph.class, "target")) {
				if (mModel.equals(modelToTypeGraph.getSource())) {
					for (TypeToTAbstractType mTypeToTType : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(mType, TypeToTAbstractType.class, "source")) {
						if (tAbstractType.equals(mTypeToTType.getTarget())) {
							_result.add(new Object[] { mModel, mType, tModel, modelToTypeGraph, mTypeToTType,
									tAbstractType, sourceMatch, targetMatch });
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_ArrayTypeToType_21_5_matchcorrcontext_greenBBBBF(
			ModelToTypeGraph modelToTypeGraph, TypeToTAbstractType mTypeToTType, Match sourceMatch, Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "ArrayTypeToType";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(modelToTypeGraph);
		ccMatch.getAllContextElements().add(mTypeToTType);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { modelToTypeGraph, mTypeToTType, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_ArrayTypeToType_21_6_createcorrespondence_blackBBBBBBB(ArrayType mArrayType,
			Model mModel, TypeAccess mTypeAccess, Type mType, TypeGraph tModel, TAbstractType tAbstractType,
			CCMatch ccMatch) {
		if (!mArrayType.equals(mType)) {
			return new Object[] { mArrayType, mModel, mTypeAccess, mType, tModel, tAbstractType, ccMatch };
		}
		return null;
	}

	public static final Object[] pattern_ArrayTypeToType_21_6_createcorrespondence_greenBFBB(ArrayType mArrayType,
			TAbstractType tAbstractType, CCMatch ccMatch) {
		TypeToTAbstractType arrayTypeToTArrayClass = PmFactory.eINSTANCE.createTypeToTAbstractType();
		arrayTypeToTArrayClass.setSource(mArrayType);
		arrayTypeToTArrayClass.setTarget(tAbstractType);
		ccMatch.getCreateCorr().add(arrayTypeToTArrayClass);
		return new Object[] { mArrayType, arrayTypeToTArrayClass, tAbstractType, ccMatch };
	}

	public static final Object[] pattern_ArrayTypeToType_21_7_addtoreturnedresult_blackBB(IsApplicableRuleResult result,
			CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_ArrayTypeToType_21_7_addtoreturnedresult_greenBB(IsApplicableRuleResult result,
			CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "ArrayTypeToType";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_ArrayTypeToType_21_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_ArrayTypeToType_24_1_matchtggpattern_black_nac_0BB(TypeAccess mTypeAccess,
			Type mType) {
		for (AbstractTypeDeclaration __DEC_mTypeAccess_superInterfaces_227520 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mTypeAccess, AbstractTypeDeclaration.class, "superInterfaces")) {
			if (!mType.equals(__DEC_mTypeAccess_superInterfaces_227520)) {
				return new Object[] { mTypeAccess, mType };
			}
		}
		return null;
	}

	public static final Object[] pattern_ArrayTypeToType_24_1_matchtggpattern_black_nac_1B(TypeAccess mTypeAccess) {
		for (Annotation __DEC_mTypeAccess_type_661052 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mTypeAccess, Annotation.class, "type")) {
			return new Object[] { mTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_ArrayTypeToType_24_1_matchtggpattern_black_nac_2B(TypeAccess mTypeAccess) {
		for (AnnotationTypeMemberDeclaration __DEC_mTypeAccess_type_516084 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mTypeAccess, AnnotationTypeMemberDeclaration.class, "type")) {
			return new Object[] { mTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_ArrayTypeToType_24_1_matchtggpattern_black_nac_3B(TypeAccess mTypeAccess) {
		for (ClassInstanceCreation __DEC_mTypeAccess_type_161324 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mTypeAccess, ClassInstanceCreation.class, "type")) {
			return new Object[] { mTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_ArrayTypeToType_24_1_matchtggpattern_black_nac_4BB(TypeAccess mTypeAccess,
			Type mType) {
		for (ClassDeclaration __DEC_mTypeAccess_superClass_462503 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mTypeAccess, ClassDeclaration.class, "superClass")) {
			if (!mType.equals(__DEC_mTypeAccess_superClass_462503)) {
				return new Object[] { mTypeAccess, mType };
			}
		}
		return null;
	}

	public static final Object[] pattern_ArrayTypeToType_24_1_matchtggpattern_black_nac_5B(TypeAccess mTypeAccess) {
		for (MethodDeclaration __DEC_mTypeAccess_returnType_481309 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mTypeAccess, MethodDeclaration.class, "returnType")) {
			return new Object[] { mTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_ArrayTypeToType_24_1_matchtggpattern_black_nac_6BB(TypeAccess mTypeAccess,
			Type mType) {
		for (ParameterizedType __DEC_mTypeAccess_type_388957 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mTypeAccess, ParameterizedType.class, "type")) {
			if (!mType.equals(__DEC_mTypeAccess_type_388957)) {
				return new Object[] { mTypeAccess, mType };
			}
		}
		return null;
	}

	public static final Object[] pattern_ArrayTypeToType_24_1_matchtggpattern_black_nac_7B(TypeAccess mTypeAccess) {
		for (TypeLiteral __DEC_mTypeAccess_type_739561 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mTypeAccess, TypeLiteral.class, "type")) {
			return new Object[] { mTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_ArrayTypeToType_24_1_matchtggpattern_black_nac_8B(TypeAccess mTypeAccess) {
		for (AnnotationMemberValuePair __DEC_mTypeAccess_value_344737 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mTypeAccess, AnnotationMemberValuePair.class, "value")) {
			return new Object[] { mTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_ArrayTypeToType_24_1_matchtggpattern_blackBBBB(ArrayType mArrayType,
			Model mModel, TypeAccess mTypeAccess, Type mType) {
		if (!mArrayType.equals(mType)) {
			if (mTypeAccess.equals(mArrayType.getElementType())) {
				if (mType.equals(mTypeAccess.getType())) {
					if (mModel.getOrphanTypes().contains(mArrayType)) {
						if (pattern_ArrayTypeToType_24_1_matchtggpattern_black_nac_0BB(mTypeAccess, mType) == null) {
							if (pattern_ArrayTypeToType_24_1_matchtggpattern_black_nac_1B(mTypeAccess) == null) {
								if (pattern_ArrayTypeToType_24_1_matchtggpattern_black_nac_2B(mTypeAccess) == null) {
									if (pattern_ArrayTypeToType_24_1_matchtggpattern_black_nac_3B(
											mTypeAccess) == null) {
										if (pattern_ArrayTypeToType_24_1_matchtggpattern_black_nac_4BB(mTypeAccess,
												mType) == null) {
											if (pattern_ArrayTypeToType_24_1_matchtggpattern_black_nac_5B(
													mTypeAccess) == null) {
												if (pattern_ArrayTypeToType_24_1_matchtggpattern_black_nac_6BB(
														mTypeAccess, mType) == null) {
													if (pattern_ArrayTypeToType_24_1_matchtggpattern_black_nac_7B(
															mTypeAccess) == null) {
														if (pattern_ArrayTypeToType_24_1_matchtggpattern_black_nac_8B(
																mTypeAccess) == null) {
															return new Object[] { mArrayType, mModel, mTypeAccess,
																	mType };
														}
													}
												}
											}
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

	public static final boolean pattern_ArrayTypeToType_24_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ArrayTypeToType_24_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_ArrayTypeToType_25_1_matchtggpattern_blackBB(TypeGraph tModel,
			TAbstractType tAbstractType) {
		if (tModel.getOwnedTypes().contains(tAbstractType)) {
			return new Object[] { tModel, tAbstractType };
		}
		return null;
	}

	public static final boolean pattern_ArrayTypeToType_25_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ArrayTypeToType_25_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_ArrayTypeToType_26_1_createresult_blackB(ArrayTypeToType _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_ArrayTypeToType_26_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_ArrayTypeToType_26_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, Model mModel) {
		if (ruleResult.getSourceObjects().contains(mModel)) {
			return new Object[] { ruleResult, mModel };
		}
		return null;
	}

	public static final Object[] pattern_ArrayTypeToType_26_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, ModelToTypeGraph modelToTypeGraph) {
		if (ruleResult.getCorrObjects().contains(modelToTypeGraph)) {
			return new Object[] { ruleResult, modelToTypeGraph };
		}
		return null;
	}

	public static final Object[] pattern_ArrayTypeToType_26_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, TypeGraph tModel) {
		if (ruleResult.getTargetObjects().contains(tModel)) {
			return new Object[] { ruleResult, tModel };
		}
		return null;
	}

	public static final Object[] pattern_ArrayTypeToType_26_2_isapplicablecore_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, TAbstractType tAbstractType) {
		if (ruleResult.getTargetObjects().contains(tAbstractType)) {
			return new Object[] { ruleResult, tAbstractType };
		}
		return null;
	}

	public static final Object[] pattern_ArrayTypeToType_26_2_isapplicablecore_black_nac_4BB(
			ModelgeneratorRuleResult ruleResult, TypeToTAbstractType mTypeToTType) {
		if (ruleResult.getCorrObjects().contains(mTypeToTType)) {
			return new Object[] { ruleResult, mTypeToTType };
		}
		return null;
	}

	public static final Object[] pattern_ArrayTypeToType_26_2_isapplicablecore_black_nac_5BB(
			ModelgeneratorRuleResult ruleResult, Type mType) {
		if (ruleResult.getSourceObjects().contains(mType)) {
			return new Object[] { ruleResult, mType };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ArrayTypeToType_26_2_isapplicablecore_blackFFFFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList modelToTypeGraphList : ruleEntryContainer.getRuleEntryList()) {
			for (EObject tmpModelToTypeGraph : modelToTypeGraphList.getEntryObjects()) {
				if (tmpModelToTypeGraph instanceof ModelToTypeGraph) {
					ModelToTypeGraph modelToTypeGraph = (ModelToTypeGraph) tmpModelToTypeGraph;
					Model mModel = modelToTypeGraph.getSource();
					if (mModel != null) {
						TypeGraph tModel = modelToTypeGraph.getTarget();
						if (tModel != null) {
							if (pattern_ArrayTypeToType_26_2_isapplicablecore_black_nac_1BB(ruleResult,
									modelToTypeGraph) == null) {
								if (pattern_ArrayTypeToType_26_2_isapplicablecore_black_nac_0BB(ruleResult,
										mModel) == null) {
									if (pattern_ArrayTypeToType_26_2_isapplicablecore_black_nac_2BB(ruleResult,
											tModel) == null) {
										for (TAbstractType tAbstractType : tModel.getOwnedTypes()) {
											if (pattern_ArrayTypeToType_26_2_isapplicablecore_black_nac_3BB(ruleResult,
													tAbstractType) == null) {
												for (TypeToTAbstractType mTypeToTType : org.moflon.core.utilities.eMoflonEMFUtil
														.getOppositeReferenceTyped(tAbstractType,
																TypeToTAbstractType.class, "target")) {
													Type mType = mTypeToTType.getSource();
													if (mType != null) {
														if (pattern_ArrayTypeToType_26_2_isapplicablecore_black_nac_4BB(
																ruleResult, mTypeToTType) == null) {
															if (pattern_ArrayTypeToType_26_2_isapplicablecore_black_nac_5BB(
																	ruleResult, mType) == null) {
																_result.add(new Object[] { modelToTypeGraphList, mModel,
																		modelToTypeGraph, tModel, tAbstractType,
																		mTypeToTType, mType, ruleEntryContainer,
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
		return _result;
	}

	public static final Object[] pattern_ArrayTypeToType_26_3_solveCSP_bindingFBBBBBBBBB(ArrayTypeToType _this,
			IsApplicableMatch isApplicableMatch, Model mModel, Type mType, TypeGraph tModel,
			ModelToTypeGraph modelToTypeGraph, TypeToTAbstractType mTypeToTType, TAbstractType tAbstractType,
			ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, mModel, mType, tModel,
				modelToTypeGraph, mTypeToTType, tAbstractType, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mModel, mType, tModel, modelToTypeGraph, mTypeToTType,
					tAbstractType, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_ArrayTypeToType_26_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ArrayTypeToType_26_3_solveCSP_bindingAndBlackFBBBBBBBBB(ArrayTypeToType _this,
			IsApplicableMatch isApplicableMatch, Model mModel, Type mType, TypeGraph tModel,
			ModelToTypeGraph modelToTypeGraph, TypeToTAbstractType mTypeToTType, TAbstractType tAbstractType,
			ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_ArrayTypeToType_26_3_solveCSP_binding = pattern_ArrayTypeToType_26_3_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, mModel, mType, tModel, modelToTypeGraph, mTypeToTType, tAbstractType,
				ruleResult);
		if (result_pattern_ArrayTypeToType_26_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_ArrayTypeToType_26_3_solveCSP_binding[0];

			Object[] result_pattern_ArrayTypeToType_26_3_solveCSP_black = pattern_ArrayTypeToType_26_3_solveCSP_blackB(
					csp);
			if (result_pattern_ArrayTypeToType_26_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mModel, mType, tModel, modelToTypeGraph,
						mTypeToTType, tAbstractType, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_ArrayTypeToType_26_4_checkCSP_expressionFBB(ArrayTypeToType _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ArrayTypeToType_26_5_checknacs_blackBBBBBB(Model mModel, Type mType,
			TypeGraph tModel, ModelToTypeGraph modelToTypeGraph, TypeToTAbstractType mTypeToTType,
			TAbstractType tAbstractType) {
		return new Object[] { mModel, mType, tModel, modelToTypeGraph, mTypeToTType, tAbstractType };
	}

	public static final Object[] pattern_ArrayTypeToType_26_6_perform_blackBBBBBBB(Model mModel, Type mType,
			TypeGraph tModel, ModelToTypeGraph modelToTypeGraph, TypeToTAbstractType mTypeToTType,
			TAbstractType tAbstractType, ModelgeneratorRuleResult ruleResult) {
		return new Object[] { mModel, mType, tModel, modelToTypeGraph, mTypeToTType, tAbstractType, ruleResult };
	}

	public static final Object[] pattern_ArrayTypeToType_26_6_perform_greenFBFBFBB(Model mModel, Type mType,
			TAbstractType tAbstractType, ModelgeneratorRuleResult ruleResult) {
		ArrayType mArrayType = JavaFactory.eINSTANCE.createArrayType();
		TypeAccess mTypeAccess = JavaFactory.eINSTANCE.createTypeAccess();
		TypeToTAbstractType arrayTypeToTArrayClass = PmFactory.eINSTANCE.createTypeToTAbstractType();
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		mModel.getOrphanTypes().add(mArrayType);
		ruleResult.getSourceObjects().add(mArrayType);
		mArrayType.setElementType(mTypeAccess);
		mTypeAccess.setType(mType);
		ruleResult.getSourceObjects().add(mTypeAccess);
		arrayTypeToTArrayClass.setSource(mArrayType);
		arrayTypeToTArrayClass.setTarget(tAbstractType);
		ruleResult.getCorrObjects().add(arrayTypeToTArrayClass);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { mArrayType, mModel, mTypeAccess, mType, arrayTypeToTArrayClass, tAbstractType,
				ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_ArrayTypeToType_26_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //ArrayTypeToTypeImpl
