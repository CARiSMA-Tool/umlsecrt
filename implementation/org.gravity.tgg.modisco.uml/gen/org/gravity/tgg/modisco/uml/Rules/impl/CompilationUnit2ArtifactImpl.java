/**
 */
package org.gravity.tgg.modisco.uml.Rules.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.LinkedList;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;

import org.eclipse.modisco.java.CompilationUnit;
import org.eclipse.modisco.java.Model;

import org.eclipse.modisco.java.emf.JavaFactory;

import org.eclipse.uml2.uml.Artifact;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.UMLFactory;

import org.gravity.tgg.modisco.uml.JavaModel2UMLPackage;

import org.gravity.tgg.modisco.uml.Rules.CompilationUnit2Artifact;
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
 * An implementation of the model object '<em><b>Compilation Unit2 Artifact</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class CompilationUnit2ArtifactImpl extends AbstractRuleImpl implements CompilationUnit2Artifact {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompilationUnit2ArtifactImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getCompilationUnit2Artifact();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, CompilationUnit compilationUnit, Model jm) {

		Object[] result1_black = CompilationUnit2ArtifactImpl
				.pattern_CompilationUnit2Artifact_0_1_initialbindings_blackBBBB(this, match, compilationUnit, jm);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[match] = " + match
							+ ", " + "[compilationUnit] = " + compilationUnit + ", " + "[jm] = " + jm + ".");
		}

		Object[] result2_bindingAndBlack = CompilationUnit2ArtifactImpl
				.pattern_CompilationUnit2Artifact_0_2_SolveCSP_bindingAndBlackFBBBB(this, match, compilationUnit, jm);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[match] = " + match
							+ ", " + "[compilationUnit] = " + compilationUnit + ", " + "[jm] = " + jm + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (CompilationUnit2ArtifactImpl.pattern_CompilationUnit2Artifact_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = CompilationUnit2ArtifactImpl
					.pattern_CompilationUnit2Artifact_0_4_collectelementstobetranslated_blackBBB(match, compilationUnit,
							jm);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[compilationUnit] = " + compilationUnit + ", " + "[jm] = " + jm + ".");
			}
			CompilationUnit2ArtifactImpl.pattern_CompilationUnit2Artifact_0_4_collectelementstobetranslated_greenBBBF(
					match, compilationUnit, jm);
			//nothing EMoflonEdge jm__compilationUnit____compilationUnits = (EMoflonEdge) result4_green[3];

			Object[] result5_black = CompilationUnit2ArtifactImpl
					.pattern_CompilationUnit2Artifact_0_5_collectcontextelements_blackBBB(match, compilationUnit, jm);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[compilationUnit] = " + compilationUnit + ", " + "[jm] = " + jm + ".");
			}
			CompilationUnit2ArtifactImpl.pattern_CompilationUnit2Artifact_0_5_collectcontextelements_greenBB(match, jm);

			// 
			CompilationUnit2ArtifactImpl.pattern_CompilationUnit2Artifact_0_6_registerobjectstomatch_expressionBBBB(
					this, match, compilationUnit, jm);
			return CompilationUnit2ArtifactImpl.pattern_CompilationUnit2Artifact_0_7_expressionF();
		} else {
			return CompilationUnit2ArtifactImpl.pattern_CompilationUnit2Artifact_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = CompilationUnit2ArtifactImpl
				.pattern_CompilationUnit2Artifact_1_1_performtransformation_bindingAndBlackFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		org.eclipse.uml2.uml.Model um = (org.eclipse.uml2.uml.Model) result1_bindingAndBlack[0];
		CompilationUnit compilationUnit = (CompilationUnit) result1_bindingAndBlack[1];
		Model jm = (Model) result1_bindingAndBlack[2];
		JavaModel2UMLPackage jm2um = (JavaModel2UMLPackage) result1_bindingAndBlack[3];
		CSP csp = (CSP) result1_bindingAndBlack[4];
		Object[] result1_green = CompilationUnit2ArtifactImpl
				.pattern_CompilationUnit2Artifact_1_1_performtransformation_greenBFBFB(um, compilationUnit, csp);
		Artifact artifact = (Artifact) result1_green[1];
		org.gravity.tgg.modisco.uml.CompilationUnit2Artifact c2a = (org.gravity.tgg.modisco.uml.CompilationUnit2Artifact) result1_green[3];

		Object[] result2_black = CompilationUnit2ArtifactImpl
				.pattern_CompilationUnit2Artifact_1_2_collecttranslatedelements_blackBBB(artifact, compilationUnit,
						c2a);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[artifact] = " + artifact + ", "
					+ "[compilationUnit] = " + compilationUnit + ", " + "[c2a] = " + c2a + ".");
		}
		Object[] result2_green = CompilationUnit2ArtifactImpl
				.pattern_CompilationUnit2Artifact_1_2_collecttranslatedelements_greenFBBB(artifact, compilationUnit,
						c2a);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = CompilationUnit2ArtifactImpl
				.pattern_CompilationUnit2Artifact_1_3_bookkeepingforedges_blackBBBBBBB(ruleresult, um, artifact,
						compilationUnit, jm, c2a, jm2um);
		if (result3_black == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult + ", " + "[um] = " + um
							+ ", " + "[artifact] = " + artifact + ", " + "[compilationUnit] = " + compilationUnit + ", "
							+ "[jm] = " + jm + ", " + "[c2a] = " + c2a + ", " + "[jm2um] = " + jm2um + ".");
		}
		CompilationUnit2ArtifactImpl.pattern_CompilationUnit2Artifact_1_3_bookkeepingforedges_greenBBBBBBFFFF(
				ruleresult, um, artifact, compilationUnit, jm, c2a);
		//nothing EMoflonEdge um__artifact____packagedElement = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge jm__compilationUnit____compilationUnits = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge c2a__compilationUnit____source = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge c2a__artifact____target = (EMoflonEdge) result3_green[9];

		// 
		// 
		CompilationUnit2ArtifactImpl.pattern_CompilationUnit2Artifact_1_5_registerobjects_expressionBBBBBBBB(this,
				ruleresult, um, artifact, compilationUnit, jm, c2a, jm2um);
		return CompilationUnit2ArtifactImpl.pattern_CompilationUnit2Artifact_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = CompilationUnit2ArtifactImpl
				.pattern_CompilationUnit2Artifact_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = CompilationUnit2ArtifactImpl
				.pattern_CompilationUnit2Artifact_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = CompilationUnit2ArtifactImpl
				.pattern_CompilationUnit2Artifact_2_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		CompilationUnit compilationUnit = (CompilationUnit) result2_binding[0];
		Model jm = (Model) result2_binding[1];
		for (Object[] result2_black : CompilationUnit2ArtifactImpl
				.pattern_CompilationUnit2Artifact_2_2_corematch_blackFBBFB(compilationUnit, jm, match)) {
			org.eclipse.uml2.uml.Model um = (org.eclipse.uml2.uml.Model) result2_black[0];
			JavaModel2UMLPackage jm2um = (JavaModel2UMLPackage) result2_black[3];
			// ForEach 
			for (Object[] result3_black : CompilationUnit2ArtifactImpl
					.pattern_CompilationUnit2Artifact_2_3_findcontext_blackBBBB(um, compilationUnit, jm, jm2um)) {
				Object[] result3_green = CompilationUnit2ArtifactImpl
						.pattern_CompilationUnit2Artifact_2_3_findcontext_greenBBBBFFFF(um, compilationUnit, jm, jm2um);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[4];
				//nothing EMoflonEdge jm__compilationUnit____compilationUnits = (EMoflonEdge) result3_green[5];
				//nothing EMoflonEdge jm2um__jm____source = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge jm2um__um____target = (EMoflonEdge) result3_green[7];

				Object[] result4_bindingAndBlack = CompilationUnit2ArtifactImpl
						.pattern_CompilationUnit2Artifact_2_4_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch,
								um, compilationUnit, jm, jm2um);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[um] = " + um + ", "
							+ "[compilationUnit] = " + compilationUnit + ", " + "[jm] = " + jm + ", " + "[jm2um] = "
							+ jm2um + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (CompilationUnit2ArtifactImpl.pattern_CompilationUnit2Artifact_2_5_checkCSP_expressionFBB(this,
						csp)) {

					Object[] result6_black = CompilationUnit2ArtifactImpl
							.pattern_CompilationUnit2Artifact_2_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					CompilationUnit2ArtifactImpl.pattern_CompilationUnit2Artifact_2_6_addmatchtoruleresult_greenBB(
							ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return CompilationUnit2ArtifactImpl.pattern_CompilationUnit2Artifact_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, CompilationUnit compilationUnit, Model jm) {
		match.registerObject("compilationUnit", compilationUnit);
		match.registerObject("jm", jm);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, CompilationUnit compilationUnit, Model jm) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, org.eclipse.uml2.uml.Model um,
			CompilationUnit compilationUnit, Model jm, JavaModel2UMLPackage jm2um) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_compilationUnit_originalFilePath = CSPFactoryHelper.eINSTANCE
				.createVariable("compilationUnit.originalFilePath", true, csp);
		var_compilationUnit_originalFilePath.setValue(compilationUnit.getOriginalFilePath());
		var_compilationUnit_originalFilePath.setType("String");
		Variable var_compilationUnit_name = CSPFactoryHelper.eINSTANCE.createVariable("compilationUnit.name", true,
				csp);
		var_compilationUnit_name.setValue(compilationUnit.getName());
		var_compilationUnit_name.setType("String");

		// Create unbound variables
		Variable var_artifact_fileName = CSPFactoryHelper.eINSTANCE.createVariable("artifact.fileName", csp);
		var_artifact_fileName.setType("String");
		Variable var_artifact_name = CSPFactoryHelper.eINSTANCE.createVariable("artifact.name", csp);
		var_artifact_name.setType("String");

		// Create constraints
		Eq eq = new Eq();
		Eq eq_0 = new Eq();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(eq_0);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_compilationUnit_originalFilePath, var_artifact_fileName);
		eq_0.setRuleName("NoRuleName");
		eq_0.solve(var_compilationUnit_name, var_artifact_name);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("um", um);
		isApplicableMatch.registerObject("compilationUnit", compilationUnit);
		isApplicableMatch.registerObject("jm", jm);
		isApplicableMatch.registerObject("jm2um", jm2um);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject um, EObject artifact, EObject compilationUnit,
			EObject jm, EObject c2a, EObject jm2um) {
		ruleresult.registerObject("um", um);
		ruleresult.registerObject("artifact", artifact);
		ruleresult.registerObject("compilationUnit", compilationUnit);
		ruleresult.registerObject("jm", jm);
		ruleresult.registerObject("c2a", c2a);
		ruleresult.registerObject("jm2um", jm2um);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("compilationUnit").eClass())
				.equals("java.CompilationUnit.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, org.eclipse.uml2.uml.Model um, Artifact artifact) {

		Object[] result1_black = CompilationUnit2ArtifactImpl
				.pattern_CompilationUnit2Artifact_10_1_initialbindings_blackBBBB(this, match, um, artifact);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[um] = " + um + ", " + "[artifact] = " + artifact + ".");
		}

		Object[] result2_bindingAndBlack = CompilationUnit2ArtifactImpl
				.pattern_CompilationUnit2Artifact_10_2_SolveCSP_bindingAndBlackFBBBB(this, match, um, artifact);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[um] = " + um + ", " + "[artifact] = " + artifact + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (CompilationUnit2ArtifactImpl.pattern_CompilationUnit2Artifact_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = CompilationUnit2ArtifactImpl
					.pattern_CompilationUnit2Artifact_10_4_collectelementstobetranslated_blackBBB(match, um, artifact);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[um] = " + um + ", " + "[artifact] = " + artifact + ".");
			}
			CompilationUnit2ArtifactImpl
					.pattern_CompilationUnit2Artifact_10_4_collectelementstobetranslated_greenBBBF(match, um, artifact);
			//nothing EMoflonEdge um__artifact____packagedElement = (EMoflonEdge) result4_green[3];

			Object[] result5_black = CompilationUnit2ArtifactImpl
					.pattern_CompilationUnit2Artifact_10_5_collectcontextelements_blackBBB(match, um, artifact);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[um] = " + um + ", " + "[artifact] = " + artifact + ".");
			}
			CompilationUnit2ArtifactImpl.pattern_CompilationUnit2Artifact_10_5_collectcontextelements_greenBB(match,
					um);

			// 
			CompilationUnit2ArtifactImpl.pattern_CompilationUnit2Artifact_10_6_registerobjectstomatch_expressionBBBB(
					this, match, um, artifact);
			return CompilationUnit2ArtifactImpl.pattern_CompilationUnit2Artifact_10_7_expressionF();
		} else {
			return CompilationUnit2ArtifactImpl.pattern_CompilationUnit2Artifact_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = CompilationUnit2ArtifactImpl
				.pattern_CompilationUnit2Artifact_11_1_performtransformation_bindingAndBlackFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		org.eclipse.uml2.uml.Model um = (org.eclipse.uml2.uml.Model) result1_bindingAndBlack[0];
		Artifact artifact = (Artifact) result1_bindingAndBlack[1];
		Model jm = (Model) result1_bindingAndBlack[2];
		JavaModel2UMLPackage jm2um = (JavaModel2UMLPackage) result1_bindingAndBlack[3];
		CSP csp = (CSP) result1_bindingAndBlack[4];
		Object[] result1_green = CompilationUnit2ArtifactImpl
				.pattern_CompilationUnit2Artifact_11_1_performtransformation_greenBFBFB(artifact, jm, csp);
		CompilationUnit compilationUnit = (CompilationUnit) result1_green[1];
		org.gravity.tgg.modisco.uml.CompilationUnit2Artifact c2a = (org.gravity.tgg.modisco.uml.CompilationUnit2Artifact) result1_green[3];

		Object[] result2_black = CompilationUnit2ArtifactImpl
				.pattern_CompilationUnit2Artifact_11_2_collecttranslatedelements_blackBBB(artifact, compilationUnit,
						c2a);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[artifact] = " + artifact + ", "
					+ "[compilationUnit] = " + compilationUnit + ", " + "[c2a] = " + c2a + ".");
		}
		Object[] result2_green = CompilationUnit2ArtifactImpl
				.pattern_CompilationUnit2Artifact_11_2_collecttranslatedelements_greenFBBB(artifact, compilationUnit,
						c2a);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = CompilationUnit2ArtifactImpl
				.pattern_CompilationUnit2Artifact_11_3_bookkeepingforedges_blackBBBBBBB(ruleresult, um, artifact,
						compilationUnit, jm, c2a, jm2um);
		if (result3_black == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult + ", " + "[um] = " + um
							+ ", " + "[artifact] = " + artifact + ", " + "[compilationUnit] = " + compilationUnit + ", "
							+ "[jm] = " + jm + ", " + "[c2a] = " + c2a + ", " + "[jm2um] = " + jm2um + ".");
		}
		CompilationUnit2ArtifactImpl.pattern_CompilationUnit2Artifact_11_3_bookkeepingforedges_greenBBBBBBFFFF(
				ruleresult, um, artifact, compilationUnit, jm, c2a);
		//nothing EMoflonEdge um__artifact____packagedElement = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge jm__compilationUnit____compilationUnits = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge c2a__compilationUnit____source = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge c2a__artifact____target = (EMoflonEdge) result3_green[9];

		// 
		// 
		CompilationUnit2ArtifactImpl.pattern_CompilationUnit2Artifact_11_5_registerobjects_expressionBBBBBBBB(this,
				ruleresult, um, artifact, compilationUnit, jm, c2a, jm2um);
		return CompilationUnit2ArtifactImpl.pattern_CompilationUnit2Artifact_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = CompilationUnit2ArtifactImpl
				.pattern_CompilationUnit2Artifact_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = CompilationUnit2ArtifactImpl
				.pattern_CompilationUnit2Artifact_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = CompilationUnit2ArtifactImpl
				.pattern_CompilationUnit2Artifact_12_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		org.eclipse.uml2.uml.Model um = (org.eclipse.uml2.uml.Model) result2_binding[0];
		Artifact artifact = (Artifact) result2_binding[1];
		for (Object[] result2_black : CompilationUnit2ArtifactImpl
				.pattern_CompilationUnit2Artifact_12_2_corematch_blackBBFFB(um, artifact, match)) {
			Model jm = (Model) result2_black[2];
			JavaModel2UMLPackage jm2um = (JavaModel2UMLPackage) result2_black[3];
			// ForEach 
			for (Object[] result3_black : CompilationUnit2ArtifactImpl
					.pattern_CompilationUnit2Artifact_12_3_findcontext_blackBBBB(um, artifact, jm, jm2um)) {
				Object[] result3_green = CompilationUnit2ArtifactImpl
						.pattern_CompilationUnit2Artifact_12_3_findcontext_greenBBBBFFFF(um, artifact, jm, jm2um);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[4];
				//nothing EMoflonEdge um__artifact____packagedElement = (EMoflonEdge) result3_green[5];
				//nothing EMoflonEdge jm2um__jm____source = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge jm2um__um____target = (EMoflonEdge) result3_green[7];

				Object[] result4_bindingAndBlack = CompilationUnit2ArtifactImpl
						.pattern_CompilationUnit2Artifact_12_4_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch,
								um, artifact, jm, jm2um);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[um] = " + um + ", "
							+ "[artifact] = " + artifact + ", " + "[jm] = " + jm + ", " + "[jm2um] = " + jm2um + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (CompilationUnit2ArtifactImpl.pattern_CompilationUnit2Artifact_12_5_checkCSP_expressionFBB(this,
						csp)) {

					Object[] result6_black = CompilationUnit2ArtifactImpl
							.pattern_CompilationUnit2Artifact_12_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					CompilationUnit2ArtifactImpl.pattern_CompilationUnit2Artifact_12_6_addmatchtoruleresult_greenBB(
							ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return CompilationUnit2ArtifactImpl.pattern_CompilationUnit2Artifact_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, org.eclipse.uml2.uml.Model um, Artifact artifact) {
		match.registerObject("um", um);
		match.registerObject("artifact", artifact);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, org.eclipse.uml2.uml.Model um, Artifact artifact) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, org.eclipse.uml2.uml.Model um,
			Artifact artifact, Model jm, JavaModel2UMLPackage jm2um) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_artifact_fileName = CSPFactoryHelper.eINSTANCE.createVariable("artifact.fileName", true, csp);
		var_artifact_fileName.setValue(artifact.getFileName());
		var_artifact_fileName.setType("String");
		Variable var_artifact_name = CSPFactoryHelper.eINSTANCE.createVariable("artifact.name", true, csp);
		var_artifact_name.setValue(artifact.getName());
		var_artifact_name.setType("String");

		// Create unbound variables
		Variable var_compilationUnit_originalFilePath = CSPFactoryHelper.eINSTANCE
				.createVariable("compilationUnit.originalFilePath", csp);
		var_compilationUnit_originalFilePath.setType("String");
		Variable var_compilationUnit_name = CSPFactoryHelper.eINSTANCE.createVariable("compilationUnit.name", csp);
		var_compilationUnit_name.setType("String");

		// Create constraints
		Eq eq = new Eq();
		Eq eq_0 = new Eq();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(eq_0);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_compilationUnit_originalFilePath, var_artifact_fileName);
		eq_0.setRuleName("NoRuleName");
		eq_0.solve(var_compilationUnit_name, var_artifact_name);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("um", um);
		isApplicableMatch.registerObject("artifact", artifact);
		isApplicableMatch.registerObject("jm", jm);
		isApplicableMatch.registerObject("jm2um", jm2um);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject um, EObject artifact, EObject compilationUnit,
			EObject jm, EObject c2a, EObject jm2um) {
		ruleresult.registerObject("um", um);
		ruleresult.registerObject("artifact", artifact);
		ruleresult.registerObject("compilationUnit", compilationUnit);
		ruleresult.registerObject("jm", jm);
		ruleresult.registerObject("c2a", c2a);
		ruleresult.registerObject("jm2um", jm2um);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("artifact").eClass()).equals("uml.Artifact.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_396(EMoflonEdge _edge_packagedElement) {

		Object[] result1_bindingAndBlack = CompilationUnit2ArtifactImpl
				.pattern_CompilationUnit2Artifact_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = CompilationUnit2ArtifactImpl
				.pattern_CompilationUnit2Artifact_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : CompilationUnit2ArtifactImpl
				.pattern_CompilationUnit2Artifact_20_2_testcorematchandDECs_blackFFB(_edge_packagedElement)) {
			org.eclipse.uml2.uml.Model um = (org.eclipse.uml2.uml.Model) result2_black[0];
			Artifact artifact = (Artifact) result2_black[1];
			Object[] result2_green = CompilationUnit2ArtifactImpl
					.pattern_CompilationUnit2Artifact_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (CompilationUnit2ArtifactImpl
					.pattern_CompilationUnit2Artifact_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
							this, match, um, artifact)) {
				// 
				if (CompilationUnit2ArtifactImpl
						.pattern_CompilationUnit2Artifact_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = CompilationUnit2ArtifactImpl
							.pattern_CompilationUnit2Artifact_20_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					CompilationUnit2ArtifactImpl.pattern_CompilationUnit2Artifact_20_5_Addmatchtoruleresult_greenBBBB(
							match, __performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return CompilationUnit2ArtifactImpl.pattern_CompilationUnit2Artifact_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_407(EMoflonEdge _edge_compilationUnits) {

		Object[] result1_bindingAndBlack = CompilationUnit2ArtifactImpl
				.pattern_CompilationUnit2Artifact_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = CompilationUnit2ArtifactImpl
				.pattern_CompilationUnit2Artifact_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : CompilationUnit2ArtifactImpl
				.pattern_CompilationUnit2Artifact_21_2_testcorematchandDECs_blackFFB(_edge_compilationUnits)) {
			CompilationUnit compilationUnit = (CompilationUnit) result2_black[0];
			Model jm = (Model) result2_black[1];
			Object[] result2_green = CompilationUnit2ArtifactImpl
					.pattern_CompilationUnit2Artifact_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (CompilationUnit2ArtifactImpl
					.pattern_CompilationUnit2Artifact_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
							this, match, compilationUnit, jm)) {
				// 
				if (CompilationUnit2ArtifactImpl
						.pattern_CompilationUnit2Artifact_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = CompilationUnit2ArtifactImpl
							.pattern_CompilationUnit2Artifact_21_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					CompilationUnit2ArtifactImpl.pattern_CompilationUnit2Artifact_21_5_Addmatchtoruleresult_greenBBBB(
							match, __performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return CompilationUnit2ArtifactImpl.pattern_CompilationUnit2Artifact_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("CompilationUnit2Artifact");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		Variable var_compilationUnit_originalFilePath = CSPFactoryHelper.eINSTANCE.createVariable("compilationUnit",
				true, csp);
		var_compilationUnit_originalFilePath.setValue(__helper.getValue("compilationUnit", "originalFilePath"));
		var_compilationUnit_originalFilePath.setType("String");

		Variable var_artifact_fileName = CSPFactoryHelper.eINSTANCE.createVariable("artifact", true, csp);
		var_artifact_fileName.setValue(__helper.getValue("artifact", "fileName"));
		var_artifact_fileName.setType("String");

		Variable var_compilationUnit_name = CSPFactoryHelper.eINSTANCE.createVariable("compilationUnit", true, csp);
		var_compilationUnit_name.setValue(__helper.getValue("compilationUnit", "name"));
		var_compilationUnit_name.setType("String");

		Variable var_artifact_name = CSPFactoryHelper.eINSTANCE.createVariable("artifact", true, csp);
		var_artifact_name.setValue(__helper.getValue("artifact", "name"));
		var_artifact_name.setType("String");

		Eq eq0 = new Eq();
		csp.getConstraints().add(eq0);

		Eq eq1 = new Eq();
		csp.getConstraints().add(eq1);

		eq0.setRuleName("CompilationUnit2Artifact");
		eq0.solve(var_compilationUnit_originalFilePath, var_artifact_fileName);

		eq1.setRuleName("CompilationUnit2Artifact");
		eq1.solve(var_compilationUnit_name, var_artifact_name);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_artifact_fileName.setBound(false);
			var_artifact_name.setBound(false);
			eq0.solve(var_compilationUnit_originalFilePath, var_artifact_fileName);
			eq1.solve(var_compilationUnit_name, var_artifact_name);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
				__helper.setValue("artifact", "fileName", var_artifact_fileName.getValue());
				__helper.setValue("artifact", "name", var_artifact_name.getValue());
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
		ruleResult.setRule("CompilationUnit2Artifact");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		Variable var_compilationUnit_originalFilePath = CSPFactoryHelper.eINSTANCE.createVariable("compilationUnit",
				true, csp);
		var_compilationUnit_originalFilePath.setValue(__helper.getValue("compilationUnit", "originalFilePath"));
		var_compilationUnit_originalFilePath.setType("String");

		Variable var_artifact_fileName = CSPFactoryHelper.eINSTANCE.createVariable("artifact", true, csp);
		var_artifact_fileName.setValue(__helper.getValue("artifact", "fileName"));
		var_artifact_fileName.setType("String");

		Variable var_compilationUnit_name = CSPFactoryHelper.eINSTANCE.createVariable("compilationUnit", true, csp);
		var_compilationUnit_name.setValue(__helper.getValue("compilationUnit", "name"));
		var_compilationUnit_name.setType("String");

		Variable var_artifact_name = CSPFactoryHelper.eINSTANCE.createVariable("artifact", true, csp);
		var_artifact_name.setValue(__helper.getValue("artifact", "name"));
		var_artifact_name.setType("String");

		Eq eq0 = new Eq();
		csp.getConstraints().add(eq0);

		Eq eq1 = new Eq();
		csp.getConstraints().add(eq1);

		eq0.setRuleName("CompilationUnit2Artifact");
		eq0.solve(var_compilationUnit_originalFilePath, var_artifact_fileName);

		eq1.setRuleName("CompilationUnit2Artifact");
		eq1.solve(var_compilationUnit_name, var_artifact_name);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_compilationUnit_originalFilePath.setBound(false);
			var_compilationUnit_name.setBound(false);
			eq0.solve(var_compilationUnit_originalFilePath, var_artifact_fileName);
			eq1.solve(var_compilationUnit_name, var_artifact_name);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
				__helper.setValue("compilationUnit", "originalFilePath",
						var_compilationUnit_originalFilePath.getValue());
				__helper.setValue("compilationUnit", "name", var_compilationUnit_name.getValue());
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

		Object[] result1_black = CompilationUnit2ArtifactImpl
				.pattern_CompilationUnit2Artifact_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = CompilationUnit2ArtifactImpl.pattern_CompilationUnit2Artifact_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = CompilationUnit2ArtifactImpl
				.pattern_CompilationUnit2Artifact_24_2_matchsrctrgcontext_bindingAndBlackFFFFBB(sourceMatch,
						targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		org.eclipse.uml2.uml.Model um = (org.eclipse.uml2.uml.Model) result2_bindingAndBlack[0];
		Artifact artifact = (Artifact) result2_bindingAndBlack[1];
		CompilationUnit compilationUnit = (CompilationUnit) result2_bindingAndBlack[2];
		Model jm = (Model) result2_bindingAndBlack[3];

		Object[] result3_bindingAndBlack = CompilationUnit2ArtifactImpl
				.pattern_CompilationUnit2Artifact_24_3_solvecsp_bindingAndBlackFBBBBBBB(this, um, artifact,
						compilationUnit, jm, sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[um] = " + um + ", " + "[artifact] = " + artifact + ", " + "[compilationUnit] = "
					+ compilationUnit + ", " + "[jm] = " + jm + ", " + "[sourceMatch] = " + sourceMatch + ", "
					+ "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (CompilationUnit2ArtifactImpl.pattern_CompilationUnit2Artifact_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : CompilationUnit2ArtifactImpl
					.pattern_CompilationUnit2Artifact_24_5_matchcorrcontext_blackBBFBB(um, jm, sourceMatch,
							targetMatch)) {
				JavaModel2UMLPackage jm2um = (JavaModel2UMLPackage) result5_black[2];
				Object[] result5_green = CompilationUnit2ArtifactImpl
						.pattern_CompilationUnit2Artifact_24_5_matchcorrcontext_greenBBBF(jm2um, sourceMatch,
								targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[3];

				Object[] result6_black = CompilationUnit2ArtifactImpl
						.pattern_CompilationUnit2Artifact_24_6_createcorrespondence_blackBBBBB(um, artifact,
								compilationUnit, jm, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[um] = " + um + ", "
							+ "[artifact] = " + artifact + ", " + "[compilationUnit] = " + compilationUnit + ", "
							+ "[jm] = " + jm + ", " + "[ccMatch] = " + ccMatch + ".");
				}
				CompilationUnit2ArtifactImpl.pattern_CompilationUnit2Artifact_24_6_createcorrespondence_greenBBFB(
						artifact, compilationUnit, ccMatch);
				//nothing org.gravity.tgg.modisco.uml.CompilationUnit2Artifact c2a = (org.gravity.tgg.modisco.uml.CompilationUnit2Artifact) result6_green[2];

				Object[] result7_black = CompilationUnit2ArtifactImpl
						.pattern_CompilationUnit2Artifact_24_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				CompilationUnit2ArtifactImpl.pattern_CompilationUnit2Artifact_24_7_addtoreturnedresult_greenBB(result,
						ccMatch);

			}

		} else {
		}
		return CompilationUnit2ArtifactImpl.pattern_CompilationUnit2Artifact_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(org.eclipse.uml2.uml.Model um, Artifact artifact,
			CompilationUnit compilationUnit, Model jm, Match sourceMatch, Match targetMatch) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals

		// Create attribute variables
		Variable var_compilationUnit_originalFilePath = CSPFactoryHelper.eINSTANCE
				.createVariable("compilationUnit.originalFilePath", true, csp);
		var_compilationUnit_originalFilePath.setValue(compilationUnit.getOriginalFilePath());
		var_compilationUnit_originalFilePath.setType("String");
		Variable var_artifact_fileName = CSPFactoryHelper.eINSTANCE.createVariable("artifact.fileName", true, csp);
		var_artifact_fileName.setValue(artifact.getFileName());
		var_artifact_fileName.setType("String");
		Variable var_compilationUnit_name = CSPFactoryHelper.eINSTANCE.createVariable("compilationUnit.name", true,
				csp);
		var_compilationUnit_name.setValue(compilationUnit.getName());
		var_compilationUnit_name.setType("String");
		Variable var_artifact_name = CSPFactoryHelper.eINSTANCE.createVariable("artifact.name", true, csp);
		var_artifact_name.setValue(artifact.getName());
		var_artifact_name.setType("String");

		// Create unbound variables

		// Create constraints
		Eq eq = new Eq();
		Eq eq_0 = new Eq();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(eq_0);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_compilationUnit_originalFilePath, var_artifact_fileName);
		eq_0.setRuleName("NoRuleName");
		eq_0.solve(var_compilationUnit_name, var_artifact_name);
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
	public boolean checkDEC_FWD(CompilationUnit compilationUnit, Model jm) {// 
		Object[] result1_black = CompilationUnit2ArtifactImpl
				.pattern_CompilationUnit2Artifact_27_1_matchtggpattern_blackBB(compilationUnit, jm);
		if (result1_black != null) {
			return CompilationUnit2ArtifactImpl.pattern_CompilationUnit2Artifact_27_2_expressionF();
		} else {
			return CompilationUnit2ArtifactImpl.pattern_CompilationUnit2Artifact_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(org.eclipse.uml2.uml.Model um, Artifact artifact) {// 
		Object[] result1_black = CompilationUnit2ArtifactImpl
				.pattern_CompilationUnit2Artifact_28_1_matchtggpattern_blackBB(um, artifact);
		if (result1_black != null) {
			return CompilationUnit2ArtifactImpl.pattern_CompilationUnit2Artifact_28_2_expressionF();
		} else {
			return CompilationUnit2ArtifactImpl.pattern_CompilationUnit2Artifact_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer,
			JavaModel2UMLPackage jm2umParameter) {

		Object[] result1_black = CompilationUnit2ArtifactImpl
				.pattern_CompilationUnit2Artifact_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = CompilationUnit2ArtifactImpl
				.pattern_CompilationUnit2Artifact_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : CompilationUnit2ArtifactImpl
				.pattern_CompilationUnit2Artifact_29_2_isapplicablecore_blackFFFFBB(ruleEntryContainer, ruleResult)) {
			//nothing RuleEntryList jm2umList = (RuleEntryList) result2_black[0];
			org.eclipse.uml2.uml.Model um = (org.eclipse.uml2.uml.Model) result2_black[1];
			JavaModel2UMLPackage jm2um = (JavaModel2UMLPackage) result2_black[2];
			Model jm = (Model) result2_black[3];

			Object[] result3_bindingAndBlack = CompilationUnit2ArtifactImpl
					.pattern_CompilationUnit2Artifact_29_3_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch, um,
							jm, jm2um, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[um] = " + um + ", " + "[jm] = " + jm
						+ ", " + "[jm2um] = " + jm2um + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (CompilationUnit2ArtifactImpl.pattern_CompilationUnit2Artifact_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = CompilationUnit2ArtifactImpl
						.pattern_CompilationUnit2Artifact_29_5_checknacs_blackBBB(um, jm, jm2um);
				if (result5_black != null) {

					Object[] result6_black = CompilationUnit2ArtifactImpl
							.pattern_CompilationUnit2Artifact_29_6_perform_blackBBBB(um, jm, jm2um, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching failed." + " Variables: " + "[um] = " + um + ", " + "[jm] = " + jm
										+ ", " + "[jm2um] = " + jm2um + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					CompilationUnit2ArtifactImpl.pattern_CompilationUnit2Artifact_29_6_perform_greenBFFBFBB(um, jm,
							ruleResult, csp);
					//nothing Artifact artifact = (Artifact) result6_green[1];
					//nothing CompilationUnit compilationUnit = (CompilationUnit) result6_green[2];
					//nothing org.gravity.tgg.modisco.uml.CompilationUnit2Artifact c2a = (org.gravity.tgg.modisco.uml.CompilationUnit2Artifact) result6_green[4];

				} else {
				}

			} else {
			}

		}
		return CompilationUnit2ArtifactImpl.pattern_CompilationUnit2Artifact_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, org.eclipse.uml2.uml.Model um, Model jm,
			JavaModel2UMLPackage jm2um, ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables
		Variable var_compilationUnit_originalFilePath = CSPFactoryHelper.eINSTANCE
				.createVariable("compilationUnit.originalFilePath", csp);
		var_compilationUnit_originalFilePath.setType("String");
		Variable var_artifact_fileName = CSPFactoryHelper.eINSTANCE.createVariable("artifact.fileName", csp);
		var_artifact_fileName.setType("String");
		Variable var_compilationUnit_name = CSPFactoryHelper.eINSTANCE.createVariable("compilationUnit.name", csp);
		var_compilationUnit_name.setType("String");
		Variable var_artifact_name = CSPFactoryHelper.eINSTANCE.createVariable("artifact.name", csp);
		var_artifact_name.setType("String");

		// Create constraints
		Eq eq = new Eq();
		Eq eq_0 = new Eq();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(eq_0);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_compilationUnit_originalFilePath, var_artifact_fileName);
		eq_0.setRuleName("NoRuleName");
		eq_0.solve(var_compilationUnit_name, var_artifact_name);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("um", um);
		isApplicableMatch.registerObject("jm", jm);
		isApplicableMatch.registerObject("jm2um", jm2um);
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
		case RulesPackage.COMPILATION_UNIT2_ARTIFACT___IS_APPROPRIATE_FWD__MATCH_COMPILATIONUNIT_MODEL:
			return isAppropriate_FWD((Match) arguments.get(0), (CompilationUnit) arguments.get(1),
					(Model) arguments.get(2));
		case RulesPackage.COMPILATION_UNIT2_ARTIFACT___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.COMPILATION_UNIT2_ARTIFACT___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.COMPILATION_UNIT2_ARTIFACT___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_COMPILATIONUNIT_MODEL:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (CompilationUnit) arguments.get(1),
					(Model) arguments.get(2));
			return null;
		case RulesPackage.COMPILATION_UNIT2_ARTIFACT___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_COMPILATIONUNIT_MODEL:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (CompilationUnit) arguments.get(1),
					(Model) arguments.get(2));
		case RulesPackage.COMPILATION_UNIT2_ARTIFACT___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.COMPILATION_UNIT2_ARTIFACT___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_MODEL_COMPILATIONUNIT_MODEL_JAVAMODEL2UMLPACKAGE:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0),
					(org.eclipse.uml2.uml.Model) arguments.get(1), (CompilationUnit) arguments.get(2),
					(Model) arguments.get(3), (JavaModel2UMLPackage) arguments.get(4));
		case RulesPackage.COMPILATION_UNIT2_ARTIFACT___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.COMPILATION_UNIT2_ARTIFACT___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6));
			return null;
		case RulesPackage.COMPILATION_UNIT2_ARTIFACT___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.COMPILATION_UNIT2_ARTIFACT___IS_APPROPRIATE_BWD__MATCH_MODEL_ARTIFACT:
			return isAppropriate_BWD((Match) arguments.get(0), (org.eclipse.uml2.uml.Model) arguments.get(1),
					(Artifact) arguments.get(2));
		case RulesPackage.COMPILATION_UNIT2_ARTIFACT___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.COMPILATION_UNIT2_ARTIFACT___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.COMPILATION_UNIT2_ARTIFACT___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_MODEL_ARTIFACT:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (org.eclipse.uml2.uml.Model) arguments.get(1),
					(Artifact) arguments.get(2));
			return null;
		case RulesPackage.COMPILATION_UNIT2_ARTIFACT___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_MODEL_ARTIFACT:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (org.eclipse.uml2.uml.Model) arguments.get(1),
					(Artifact) arguments.get(2));
		case RulesPackage.COMPILATION_UNIT2_ARTIFACT___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.COMPILATION_UNIT2_ARTIFACT___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_MODEL_ARTIFACT_MODEL_JAVAMODEL2UMLPACKAGE:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
					(org.eclipse.uml2.uml.Model) arguments.get(1), (Artifact) arguments.get(2),
					(Model) arguments.get(3), (JavaModel2UMLPackage) arguments.get(4));
		case RulesPackage.COMPILATION_UNIT2_ARTIFACT___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.COMPILATION_UNIT2_ARTIFACT___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6));
			return null;
		case RulesPackage.COMPILATION_UNIT2_ARTIFACT___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.COMPILATION_UNIT2_ARTIFACT___IS_APPROPRIATE_BWD_EMOFLON_EDGE_396__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_396((EMoflonEdge) arguments.get(0));
		case RulesPackage.COMPILATION_UNIT2_ARTIFACT___IS_APPROPRIATE_FWD_EMOFLON_EDGE_407__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_407((EMoflonEdge) arguments.get(0));
		case RulesPackage.COMPILATION_UNIT2_ARTIFACT___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.COMPILATION_UNIT2_ARTIFACT___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.COMPILATION_UNIT2_ARTIFACT___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.COMPILATION_UNIT2_ARTIFACT___IS_APPLICABLE_SOLVE_CSP_CC__MODEL_ARTIFACT_COMPILATIONUNIT_MODEL_MATCH_MATCH:
			return isApplicable_solveCsp_CC((org.eclipse.uml2.uml.Model) arguments.get(0), (Artifact) arguments.get(1),
					(CompilationUnit) arguments.get(2), (Model) arguments.get(3), (Match) arguments.get(4),
					(Match) arguments.get(5));
		case RulesPackage.COMPILATION_UNIT2_ARTIFACT___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.COMPILATION_UNIT2_ARTIFACT___CHECK_DEC_FWD__COMPILATIONUNIT_MODEL:
			return checkDEC_FWD((CompilationUnit) arguments.get(0), (Model) arguments.get(1));
		case RulesPackage.COMPILATION_UNIT2_ARTIFACT___CHECK_DEC_BWD__MODEL_ARTIFACT:
			return checkDEC_BWD((org.eclipse.uml2.uml.Model) arguments.get(0), (Artifact) arguments.get(1));
		case RulesPackage.COMPILATION_UNIT2_ARTIFACT___GENERATE_MODEL__RULEENTRYCONTAINER_JAVAMODEL2UMLPACKAGE:
			return generateModel((RuleEntryContainer) arguments.get(0), (JavaModel2UMLPackage) arguments.get(1));
		case RulesPackage.COMPILATION_UNIT2_ARTIFACT___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_MODEL_MODEL_JAVAMODEL2UMLPACKAGE_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
					(org.eclipse.uml2.uml.Model) arguments.get(1), (Model) arguments.get(2),
					(JavaModel2UMLPackage) arguments.get(3), (ModelgeneratorRuleResult) arguments.get(4));
		case RulesPackage.COMPILATION_UNIT2_ARTIFACT___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_CompilationUnit2Artifact_0_1_initialbindings_blackBBBB(
			CompilationUnit2Artifact _this, Match match, CompilationUnit compilationUnit, Model jm) {
		return new Object[] { _this, match, compilationUnit, jm };
	}

	public static final Object[] pattern_CompilationUnit2Artifact_0_2_SolveCSP_bindingFBBBB(
			CompilationUnit2Artifact _this, Match match, CompilationUnit compilationUnit, Model jm) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, compilationUnit, jm);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, compilationUnit, jm };
		}
		return null;
	}

	public static final Object[] pattern_CompilationUnit2Artifact_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_CompilationUnit2Artifact_0_2_SolveCSP_bindingAndBlackFBBBB(
			CompilationUnit2Artifact _this, Match match, CompilationUnit compilationUnit, Model jm) {
		Object[] result_pattern_CompilationUnit2Artifact_0_2_SolveCSP_binding = pattern_CompilationUnit2Artifact_0_2_SolveCSP_bindingFBBBB(
				_this, match, compilationUnit, jm);
		if (result_pattern_CompilationUnit2Artifact_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_CompilationUnit2Artifact_0_2_SolveCSP_binding[0];

			Object[] result_pattern_CompilationUnit2Artifact_0_2_SolveCSP_black = pattern_CompilationUnit2Artifact_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_CompilationUnit2Artifact_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, compilationUnit, jm };
			}
		}
		return null;
	}

	public static final boolean pattern_CompilationUnit2Artifact_0_3_CheckCSP_expressionFBB(
			CompilationUnit2Artifact _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_CompilationUnit2Artifact_0_4_collectelementstobetranslated_blackBBB(
			Match match, CompilationUnit compilationUnit, Model jm) {
		return new Object[] { match, compilationUnit, jm };
	}

	public static final Object[] pattern_CompilationUnit2Artifact_0_4_collectelementstobetranslated_greenBBBF(
			Match match, CompilationUnit compilationUnit, Model jm) {
		EMoflonEdge jm__compilationUnit____compilationUnits = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(compilationUnit);
		String jm__compilationUnit____compilationUnits_name_prime = "compilationUnits";
		jm__compilationUnit____compilationUnits.setSrc(jm);
		jm__compilationUnit____compilationUnits.setTrg(compilationUnit);
		match.getToBeTranslatedEdges().add(jm__compilationUnit____compilationUnits);
		jm__compilationUnit____compilationUnits.setName(jm__compilationUnit____compilationUnits_name_prime);
		return new Object[] { match, compilationUnit, jm, jm__compilationUnit____compilationUnits };
	}

	public static final Object[] pattern_CompilationUnit2Artifact_0_5_collectcontextelements_blackBBB(Match match,
			CompilationUnit compilationUnit, Model jm) {
		return new Object[] { match, compilationUnit, jm };
	}

	public static final Object[] pattern_CompilationUnit2Artifact_0_5_collectcontextelements_greenBB(Match match,
			Model jm) {
		match.getContextNodes().add(jm);
		return new Object[] { match, jm };
	}

	public static final void pattern_CompilationUnit2Artifact_0_6_registerobjectstomatch_expressionBBBB(
			CompilationUnit2Artifact _this, Match match, CompilationUnit compilationUnit, Model jm) {
		_this.registerObjectsToMatch_FWD(match, compilationUnit, jm);

	}

	public static final boolean pattern_CompilationUnit2Artifact_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_CompilationUnit2Artifact_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_CompilationUnit2Artifact_1_1_performtransformation_bindingFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("um");
		EObject _localVariable_1 = isApplicableMatch.getObject("compilationUnit");
		EObject _localVariable_2 = isApplicableMatch.getObject("jm");
		EObject _localVariable_3 = isApplicableMatch.getObject("jm2um");
		EObject tmpUm = _localVariable_0;
		EObject tmpCompilationUnit = _localVariable_1;
		EObject tmpJm = _localVariable_2;
		EObject tmpJm2um = _localVariable_3;
		if (tmpUm instanceof org.eclipse.uml2.uml.Model) {
			org.eclipse.uml2.uml.Model um = (org.eclipse.uml2.uml.Model) tmpUm;
			if (tmpCompilationUnit instanceof CompilationUnit) {
				CompilationUnit compilationUnit = (CompilationUnit) tmpCompilationUnit;
				if (tmpJm instanceof Model) {
					Model jm = (Model) tmpJm;
					if (tmpJm2um instanceof JavaModel2UMLPackage) {
						JavaModel2UMLPackage jm2um = (JavaModel2UMLPackage) tmpJm2um;
						return new Object[] { um, compilationUnit, jm, jm2um, isApplicableMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_CompilationUnit2Artifact_1_1_performtransformation_blackBBBBFBB(
			org.eclipse.uml2.uml.Model um, CompilationUnit compilationUnit, Model jm, JavaModel2UMLPackage jm2um,
			CompilationUnit2Artifact _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { um, compilationUnit, jm, jm2um, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_CompilationUnit2Artifact_1_1_performtransformation_bindingAndBlackFFFFFBB(
			CompilationUnit2Artifact _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_CompilationUnit2Artifact_1_1_performtransformation_binding = pattern_CompilationUnit2Artifact_1_1_performtransformation_bindingFFFFB(
				isApplicableMatch);
		if (result_pattern_CompilationUnit2Artifact_1_1_performtransformation_binding != null) {
			org.eclipse.uml2.uml.Model um = (org.eclipse.uml2.uml.Model) result_pattern_CompilationUnit2Artifact_1_1_performtransformation_binding[0];
			CompilationUnit compilationUnit = (CompilationUnit) result_pattern_CompilationUnit2Artifact_1_1_performtransformation_binding[1];
			Model jm = (Model) result_pattern_CompilationUnit2Artifact_1_1_performtransformation_binding[2];
			JavaModel2UMLPackage jm2um = (JavaModel2UMLPackage) result_pattern_CompilationUnit2Artifact_1_1_performtransformation_binding[3];

			Object[] result_pattern_CompilationUnit2Artifact_1_1_performtransformation_black = pattern_CompilationUnit2Artifact_1_1_performtransformation_blackBBBBFBB(
					um, compilationUnit, jm, jm2um, _this, isApplicableMatch);
			if (result_pattern_CompilationUnit2Artifact_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_CompilationUnit2Artifact_1_1_performtransformation_black[4];

				return new Object[] { um, compilationUnit, jm, jm2um, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_CompilationUnit2Artifact_1_1_performtransformation_greenBFBFB(
			org.eclipse.uml2.uml.Model um, CompilationUnit compilationUnit, CSP csp) {
		Artifact artifact = UMLFactory.eINSTANCE.createArtifact();
		org.gravity.tgg.modisco.uml.CompilationUnit2Artifact c2a = UmlFactory.eINSTANCE
				.createCompilationUnit2Artifact();
		Object _localVariable_0 = csp.getValue("artifact", "fileName");
		Object _localVariable_1 = csp.getValue("artifact", "name");
		um.getPackagedElements().add(artifact);
		c2a.setSource(compilationUnit);
		c2a.setTarget(artifact);
		String artifact_fileName_prime = (String) _localVariable_0;
		String artifact_name_prime = (String) _localVariable_1;
		artifact.setFileName(artifact_fileName_prime);
		artifact.setName(artifact_name_prime);
		return new Object[] { um, artifact, compilationUnit, c2a, csp };
	}

	public static final Object[] pattern_CompilationUnit2Artifact_1_2_collecttranslatedelements_blackBBB(
			Artifact artifact, CompilationUnit compilationUnit,
			org.gravity.tgg.modisco.uml.CompilationUnit2Artifact c2a) {
		return new Object[] { artifact, compilationUnit, c2a };
	}

	public static final Object[] pattern_CompilationUnit2Artifact_1_2_collecttranslatedelements_greenFBBB(
			Artifact artifact, CompilationUnit compilationUnit,
			org.gravity.tgg.modisco.uml.CompilationUnit2Artifact c2a) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(artifact);
		ruleresult.getTranslatedElements().add(compilationUnit);
		ruleresult.getCreatedLinkElements().add(c2a);
		return new Object[] { ruleresult, artifact, compilationUnit, c2a };
	}

	public static final Object[] pattern_CompilationUnit2Artifact_1_3_bookkeepingforedges_blackBBBBBBB(
			PerformRuleResult ruleresult, EObject um, EObject artifact, EObject compilationUnit, EObject jm,
			EObject c2a, EObject jm2um) {
		if (!artifact.equals(um)) {
			if (!artifact.equals(compilationUnit)) {
				if (!artifact.equals(jm)) {
					if (!artifact.equals(c2a)) {
						if (!artifact.equals(jm2um)) {
							if (!compilationUnit.equals(um)) {
								if (!compilationUnit.equals(jm)) {
									if (!compilationUnit.equals(jm2um)) {
										if (!jm.equals(um)) {
											if (!jm.equals(jm2um)) {
												if (!c2a.equals(um)) {
													if (!c2a.equals(compilationUnit)) {
														if (!c2a.equals(jm)) {
															if (!c2a.equals(jm2um)) {
																if (!jm2um.equals(um)) {
																	return new Object[] { ruleresult, um, artifact,
																			compilationUnit, jm, c2a, jm2um };
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_CompilationUnit2Artifact_1_3_bookkeepingforedges_greenBBBBBBFFFF(
			PerformRuleResult ruleresult, EObject um, EObject artifact, EObject compilationUnit, EObject jm,
			EObject c2a) {
		EMoflonEdge um__artifact____packagedElement = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge jm__compilationUnit____compilationUnits = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c2a__compilationUnit____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c2a__artifact____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "CompilationUnit2Artifact";
		String um__artifact____packagedElement_name_prime = "packagedElement";
		String jm__compilationUnit____compilationUnits_name_prime = "compilationUnits";
		String c2a__compilationUnit____source_name_prime = "source";
		String c2a__artifact____target_name_prime = "target";
		um__artifact____packagedElement.setSrc(um);
		um__artifact____packagedElement.setTrg(artifact);
		ruleresult.getCreatedEdges().add(um__artifact____packagedElement);
		jm__compilationUnit____compilationUnits.setSrc(jm);
		jm__compilationUnit____compilationUnits.setTrg(compilationUnit);
		ruleresult.getTranslatedEdges().add(jm__compilationUnit____compilationUnits);
		c2a__compilationUnit____source.setSrc(c2a);
		c2a__compilationUnit____source.setTrg(compilationUnit);
		ruleresult.getCreatedEdges().add(c2a__compilationUnit____source);
		c2a__artifact____target.setSrc(c2a);
		c2a__artifact____target.setTrg(artifact);
		ruleresult.getCreatedEdges().add(c2a__artifact____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		um__artifact____packagedElement.setName(um__artifact____packagedElement_name_prime);
		jm__compilationUnit____compilationUnits.setName(jm__compilationUnit____compilationUnits_name_prime);
		c2a__compilationUnit____source.setName(c2a__compilationUnit____source_name_prime);
		c2a__artifact____target.setName(c2a__artifact____target_name_prime);
		return new Object[] { ruleresult, um, artifact, compilationUnit, jm, c2a, um__artifact____packagedElement,
				jm__compilationUnit____compilationUnits, c2a__compilationUnit____source, c2a__artifact____target };
	}

	public static final void pattern_CompilationUnit2Artifact_1_5_registerobjects_expressionBBBBBBBB(
			CompilationUnit2Artifact _this, PerformRuleResult ruleresult, EObject um, EObject artifact,
			EObject compilationUnit, EObject jm, EObject c2a, EObject jm2um) {
		_this.registerObjects_FWD(ruleresult, um, artifact, compilationUnit, jm, c2a, jm2um);

	}

	public static final PerformRuleResult pattern_CompilationUnit2Artifact_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_CompilationUnit2Artifact_2_1_preparereturnvalue_bindingFB(
			CompilationUnit2Artifact _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_CompilationUnit2Artifact_2_1_preparereturnvalue_blackFBB(EClass eClass,
			CompilationUnit2Artifact _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_CompilationUnit2Artifact_2_1_preparereturnvalue_bindingAndBlackFFB(
			CompilationUnit2Artifact _this) {
		Object[] result_pattern_CompilationUnit2Artifact_2_1_preparereturnvalue_binding = pattern_CompilationUnit2Artifact_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_CompilationUnit2Artifact_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_CompilationUnit2Artifact_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_CompilationUnit2Artifact_2_1_preparereturnvalue_black = pattern_CompilationUnit2Artifact_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_CompilationUnit2Artifact_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_CompilationUnit2Artifact_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_CompilationUnit2Artifact_2_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "CompilationUnit2Artifact";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_CompilationUnit2Artifact_2_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("compilationUnit");
		EObject _localVariable_1 = match.getObject("jm");
		EObject tmpCompilationUnit = _localVariable_0;
		EObject tmpJm = _localVariable_1;
		if (tmpCompilationUnit instanceof CompilationUnit) {
			CompilationUnit compilationUnit = (CompilationUnit) tmpCompilationUnit;
			if (tmpJm instanceof Model) {
				Model jm = (Model) tmpJm;
				return new Object[] { compilationUnit, jm, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_CompilationUnit2Artifact_2_2_corematch_blackFBBFB(
			CompilationUnit compilationUnit, Model jm, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (JavaModel2UMLPackage jm2um : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(jm,
				JavaModel2UMLPackage.class, "source")) {
			org.eclipse.uml2.uml.Package tmpUm = jm2um.getTarget();
			if (tmpUm instanceof org.eclipse.uml2.uml.Model) {
				org.eclipse.uml2.uml.Model um = (org.eclipse.uml2.uml.Model) tmpUm;
				_result.add(new Object[] { um, compilationUnit, jm, jm2um, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_CompilationUnit2Artifact_2_3_findcontext_blackBBBB(
			org.eclipse.uml2.uml.Model um, CompilationUnit compilationUnit, Model jm, JavaModel2UMLPackage jm2um) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (jm.getCompilationUnits().contains(compilationUnit)) {
			if (jm.equals(jm2um.getSource())) {
				if (um.equals(jm2um.getTarget())) {
					_result.add(new Object[] { um, compilationUnit, jm, jm2um });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_CompilationUnit2Artifact_2_3_findcontext_greenBBBBFFFF(
			org.eclipse.uml2.uml.Model um, CompilationUnit compilationUnit, Model jm, JavaModel2UMLPackage jm2um) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge jm__compilationUnit____compilationUnits = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge jm2um__jm____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge jm2um__um____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String jm__compilationUnit____compilationUnits_name_prime = "compilationUnits";
		String jm2um__jm____source_name_prime = "source";
		String jm2um__um____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(um);
		isApplicableMatch.getAllContextElements().add(compilationUnit);
		isApplicableMatch.getAllContextElements().add(jm);
		isApplicableMatch.getAllContextElements().add(jm2um);
		jm__compilationUnit____compilationUnits.setSrc(jm);
		jm__compilationUnit____compilationUnits.setTrg(compilationUnit);
		isApplicableMatch.getAllContextElements().add(jm__compilationUnit____compilationUnits);
		jm2um__jm____source.setSrc(jm2um);
		jm2um__jm____source.setTrg(jm);
		isApplicableMatch.getAllContextElements().add(jm2um__jm____source);
		jm2um__um____target.setSrc(jm2um);
		jm2um__um____target.setTrg(um);
		isApplicableMatch.getAllContextElements().add(jm2um__um____target);
		jm__compilationUnit____compilationUnits.setName(jm__compilationUnit____compilationUnits_name_prime);
		jm2um__jm____source.setName(jm2um__jm____source_name_prime);
		jm2um__um____target.setName(jm2um__um____target_name_prime);
		return new Object[] { um, compilationUnit, jm, jm2um, isApplicableMatch,
				jm__compilationUnit____compilationUnits, jm2um__jm____source, jm2um__um____target };
	}

	public static final Object[] pattern_CompilationUnit2Artifact_2_4_solveCSP_bindingFBBBBBB(
			CompilationUnit2Artifact _this, IsApplicableMatch isApplicableMatch, org.eclipse.uml2.uml.Model um,
			CompilationUnit compilationUnit, Model jm, JavaModel2UMLPackage jm2um) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, um, compilationUnit, jm, jm2um);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, um, compilationUnit, jm, jm2um };
		}
		return null;
	}

	public static final Object[] pattern_CompilationUnit2Artifact_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_CompilationUnit2Artifact_2_4_solveCSP_bindingAndBlackFBBBBBB(
			CompilationUnit2Artifact _this, IsApplicableMatch isApplicableMatch, org.eclipse.uml2.uml.Model um,
			CompilationUnit compilationUnit, Model jm, JavaModel2UMLPackage jm2um) {
		Object[] result_pattern_CompilationUnit2Artifact_2_4_solveCSP_binding = pattern_CompilationUnit2Artifact_2_4_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, um, compilationUnit, jm, jm2um);
		if (result_pattern_CompilationUnit2Artifact_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_CompilationUnit2Artifact_2_4_solveCSP_binding[0];

			Object[] result_pattern_CompilationUnit2Artifact_2_4_solveCSP_black = pattern_CompilationUnit2Artifact_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_CompilationUnit2Artifact_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, um, compilationUnit, jm, jm2um };
			}
		}
		return null;
	}

	public static final boolean pattern_CompilationUnit2Artifact_2_5_checkCSP_expressionFBB(
			CompilationUnit2Artifact _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_CompilationUnit2Artifact_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_CompilationUnit2Artifact_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "CompilationUnit2Artifact";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_CompilationUnit2Artifact_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_CompilationUnit2Artifact_10_1_initialbindings_blackBBBB(
			CompilationUnit2Artifact _this, Match match, org.eclipse.uml2.uml.Model um, Artifact artifact) {
		return new Object[] { _this, match, um, artifact };
	}

	public static final Object[] pattern_CompilationUnit2Artifact_10_2_SolveCSP_bindingFBBBB(
			CompilationUnit2Artifact _this, Match match, org.eclipse.uml2.uml.Model um, Artifact artifact) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, um, artifact);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, um, artifact };
		}
		return null;
	}

	public static final Object[] pattern_CompilationUnit2Artifact_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_CompilationUnit2Artifact_10_2_SolveCSP_bindingAndBlackFBBBB(
			CompilationUnit2Artifact _this, Match match, org.eclipse.uml2.uml.Model um, Artifact artifact) {
		Object[] result_pattern_CompilationUnit2Artifact_10_2_SolveCSP_binding = pattern_CompilationUnit2Artifact_10_2_SolveCSP_bindingFBBBB(
				_this, match, um, artifact);
		if (result_pattern_CompilationUnit2Artifact_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_CompilationUnit2Artifact_10_2_SolveCSP_binding[0];

			Object[] result_pattern_CompilationUnit2Artifact_10_2_SolveCSP_black = pattern_CompilationUnit2Artifact_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_CompilationUnit2Artifact_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, um, artifact };
			}
		}
		return null;
	}

	public static final boolean pattern_CompilationUnit2Artifact_10_3_CheckCSP_expressionFBB(
			CompilationUnit2Artifact _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_CompilationUnit2Artifact_10_4_collectelementstobetranslated_blackBBB(
			Match match, org.eclipse.uml2.uml.Model um, Artifact artifact) {
		return new Object[] { match, um, artifact };
	}

	public static final Object[] pattern_CompilationUnit2Artifact_10_4_collectelementstobetranslated_greenBBBF(
			Match match, org.eclipse.uml2.uml.Model um, Artifact artifact) {
		EMoflonEdge um__artifact____packagedElement = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(artifact);
		String um__artifact____packagedElement_name_prime = "packagedElement";
		um__artifact____packagedElement.setSrc(um);
		um__artifact____packagedElement.setTrg(artifact);
		match.getToBeTranslatedEdges().add(um__artifact____packagedElement);
		um__artifact____packagedElement.setName(um__artifact____packagedElement_name_prime);
		return new Object[] { match, um, artifact, um__artifact____packagedElement };
	}

	public static final Object[] pattern_CompilationUnit2Artifact_10_5_collectcontextelements_blackBBB(Match match,
			org.eclipse.uml2.uml.Model um, Artifact artifact) {
		return new Object[] { match, um, artifact };
	}

	public static final Object[] pattern_CompilationUnit2Artifact_10_5_collectcontextelements_greenBB(Match match,
			org.eclipse.uml2.uml.Model um) {
		match.getContextNodes().add(um);
		return new Object[] { match, um };
	}

	public static final void pattern_CompilationUnit2Artifact_10_6_registerobjectstomatch_expressionBBBB(
			CompilationUnit2Artifact _this, Match match, org.eclipse.uml2.uml.Model um, Artifact artifact) {
		_this.registerObjectsToMatch_BWD(match, um, artifact);

	}

	public static final boolean pattern_CompilationUnit2Artifact_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_CompilationUnit2Artifact_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_CompilationUnit2Artifact_11_1_performtransformation_bindingFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("um");
		EObject _localVariable_1 = isApplicableMatch.getObject("artifact");
		EObject _localVariable_2 = isApplicableMatch.getObject("jm");
		EObject _localVariable_3 = isApplicableMatch.getObject("jm2um");
		EObject tmpUm = _localVariable_0;
		EObject tmpArtifact = _localVariable_1;
		EObject tmpJm = _localVariable_2;
		EObject tmpJm2um = _localVariable_3;
		if (tmpUm instanceof org.eclipse.uml2.uml.Model) {
			org.eclipse.uml2.uml.Model um = (org.eclipse.uml2.uml.Model) tmpUm;
			if (tmpArtifact instanceof Artifact) {
				Artifact artifact = (Artifact) tmpArtifact;
				if (tmpJm instanceof Model) {
					Model jm = (Model) tmpJm;
					if (tmpJm2um instanceof JavaModel2UMLPackage) {
						JavaModel2UMLPackage jm2um = (JavaModel2UMLPackage) tmpJm2um;
						return new Object[] { um, artifact, jm, jm2um, isApplicableMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_CompilationUnit2Artifact_11_1_performtransformation_blackBBBBFBB(
			org.eclipse.uml2.uml.Model um, Artifact artifact, Model jm, JavaModel2UMLPackage jm2um,
			CompilationUnit2Artifact _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { um, artifact, jm, jm2um, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_CompilationUnit2Artifact_11_1_performtransformation_bindingAndBlackFFFFFBB(
			CompilationUnit2Artifact _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_CompilationUnit2Artifact_11_1_performtransformation_binding = pattern_CompilationUnit2Artifact_11_1_performtransformation_bindingFFFFB(
				isApplicableMatch);
		if (result_pattern_CompilationUnit2Artifact_11_1_performtransformation_binding != null) {
			org.eclipse.uml2.uml.Model um = (org.eclipse.uml2.uml.Model) result_pattern_CompilationUnit2Artifact_11_1_performtransformation_binding[0];
			Artifact artifact = (Artifact) result_pattern_CompilationUnit2Artifact_11_1_performtransformation_binding[1];
			Model jm = (Model) result_pattern_CompilationUnit2Artifact_11_1_performtransformation_binding[2];
			JavaModel2UMLPackage jm2um = (JavaModel2UMLPackage) result_pattern_CompilationUnit2Artifact_11_1_performtransformation_binding[3];

			Object[] result_pattern_CompilationUnit2Artifact_11_1_performtransformation_black = pattern_CompilationUnit2Artifact_11_1_performtransformation_blackBBBBFBB(
					um, artifact, jm, jm2um, _this, isApplicableMatch);
			if (result_pattern_CompilationUnit2Artifact_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_CompilationUnit2Artifact_11_1_performtransformation_black[4];

				return new Object[] { um, artifact, jm, jm2um, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_CompilationUnit2Artifact_11_1_performtransformation_greenBFBFB(
			Artifact artifact, Model jm, CSP csp) {
		CompilationUnit compilationUnit = JavaFactory.eINSTANCE.createCompilationUnit();
		org.gravity.tgg.modisco.uml.CompilationUnit2Artifact c2a = UmlFactory.eINSTANCE
				.createCompilationUnit2Artifact();
		Object _localVariable_0 = csp.getValue("compilationUnit", "originalFilePath");
		Object _localVariable_1 = csp.getValue("compilationUnit", "name");
		jm.getCompilationUnits().add(compilationUnit);
		c2a.setSource(compilationUnit);
		c2a.setTarget(artifact);
		String compilationUnit_originalFilePath_prime = (String) _localVariable_0;
		String compilationUnit_name_prime = (String) _localVariable_1;
		compilationUnit.setOriginalFilePath(compilationUnit_originalFilePath_prime);
		compilationUnit.setName(compilationUnit_name_prime);
		return new Object[] { artifact, compilationUnit, jm, c2a, csp };
	}

	public static final Object[] pattern_CompilationUnit2Artifact_11_2_collecttranslatedelements_blackBBB(
			Artifact artifact, CompilationUnit compilationUnit,
			org.gravity.tgg.modisco.uml.CompilationUnit2Artifact c2a) {
		return new Object[] { artifact, compilationUnit, c2a };
	}

	public static final Object[] pattern_CompilationUnit2Artifact_11_2_collecttranslatedelements_greenFBBB(
			Artifact artifact, CompilationUnit compilationUnit,
			org.gravity.tgg.modisco.uml.CompilationUnit2Artifact c2a) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(artifact);
		ruleresult.getCreatedElements().add(compilationUnit);
		ruleresult.getCreatedLinkElements().add(c2a);
		return new Object[] { ruleresult, artifact, compilationUnit, c2a };
	}

	public static final Object[] pattern_CompilationUnit2Artifact_11_3_bookkeepingforedges_blackBBBBBBB(
			PerformRuleResult ruleresult, EObject um, EObject artifact, EObject compilationUnit, EObject jm,
			EObject c2a, EObject jm2um) {
		if (!artifact.equals(um)) {
			if (!artifact.equals(compilationUnit)) {
				if (!artifact.equals(jm)) {
					if (!artifact.equals(c2a)) {
						if (!artifact.equals(jm2um)) {
							if (!compilationUnit.equals(um)) {
								if (!compilationUnit.equals(jm)) {
									if (!compilationUnit.equals(jm2um)) {
										if (!jm.equals(um)) {
											if (!jm.equals(jm2um)) {
												if (!c2a.equals(um)) {
													if (!c2a.equals(compilationUnit)) {
														if (!c2a.equals(jm)) {
															if (!c2a.equals(jm2um)) {
																if (!jm2um.equals(um)) {
																	return new Object[] { ruleresult, um, artifact,
																			compilationUnit, jm, c2a, jm2um };
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_CompilationUnit2Artifact_11_3_bookkeepingforedges_greenBBBBBBFFFF(
			PerformRuleResult ruleresult, EObject um, EObject artifact, EObject compilationUnit, EObject jm,
			EObject c2a) {
		EMoflonEdge um__artifact____packagedElement = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge jm__compilationUnit____compilationUnits = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c2a__compilationUnit____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c2a__artifact____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "CompilationUnit2Artifact";
		String um__artifact____packagedElement_name_prime = "packagedElement";
		String jm__compilationUnit____compilationUnits_name_prime = "compilationUnits";
		String c2a__compilationUnit____source_name_prime = "source";
		String c2a__artifact____target_name_prime = "target";
		um__artifact____packagedElement.setSrc(um);
		um__artifact____packagedElement.setTrg(artifact);
		ruleresult.getTranslatedEdges().add(um__artifact____packagedElement);
		jm__compilationUnit____compilationUnits.setSrc(jm);
		jm__compilationUnit____compilationUnits.setTrg(compilationUnit);
		ruleresult.getCreatedEdges().add(jm__compilationUnit____compilationUnits);
		c2a__compilationUnit____source.setSrc(c2a);
		c2a__compilationUnit____source.setTrg(compilationUnit);
		ruleresult.getCreatedEdges().add(c2a__compilationUnit____source);
		c2a__artifact____target.setSrc(c2a);
		c2a__artifact____target.setTrg(artifact);
		ruleresult.getCreatedEdges().add(c2a__artifact____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		um__artifact____packagedElement.setName(um__artifact____packagedElement_name_prime);
		jm__compilationUnit____compilationUnits.setName(jm__compilationUnit____compilationUnits_name_prime);
		c2a__compilationUnit____source.setName(c2a__compilationUnit____source_name_prime);
		c2a__artifact____target.setName(c2a__artifact____target_name_prime);
		return new Object[] { ruleresult, um, artifact, compilationUnit, jm, c2a, um__artifact____packagedElement,
				jm__compilationUnit____compilationUnits, c2a__compilationUnit____source, c2a__artifact____target };
	}

	public static final void pattern_CompilationUnit2Artifact_11_5_registerobjects_expressionBBBBBBBB(
			CompilationUnit2Artifact _this, PerformRuleResult ruleresult, EObject um, EObject artifact,
			EObject compilationUnit, EObject jm, EObject c2a, EObject jm2um) {
		_this.registerObjects_BWD(ruleresult, um, artifact, compilationUnit, jm, c2a, jm2um);

	}

	public static final PerformRuleResult pattern_CompilationUnit2Artifact_11_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_CompilationUnit2Artifact_12_1_preparereturnvalue_bindingFB(
			CompilationUnit2Artifact _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_CompilationUnit2Artifact_12_1_preparereturnvalue_blackFBB(EClass eClass,
			CompilationUnit2Artifact _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_CompilationUnit2Artifact_12_1_preparereturnvalue_bindingAndBlackFFB(
			CompilationUnit2Artifact _this) {
		Object[] result_pattern_CompilationUnit2Artifact_12_1_preparereturnvalue_binding = pattern_CompilationUnit2Artifact_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_CompilationUnit2Artifact_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_CompilationUnit2Artifact_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_CompilationUnit2Artifact_12_1_preparereturnvalue_black = pattern_CompilationUnit2Artifact_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_CompilationUnit2Artifact_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_CompilationUnit2Artifact_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_CompilationUnit2Artifact_12_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "CompilationUnit2Artifact";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_CompilationUnit2Artifact_12_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("um");
		EObject _localVariable_1 = match.getObject("artifact");
		EObject tmpUm = _localVariable_0;
		EObject tmpArtifact = _localVariable_1;
		if (tmpUm instanceof org.eclipse.uml2.uml.Model) {
			org.eclipse.uml2.uml.Model um = (org.eclipse.uml2.uml.Model) tmpUm;
			if (tmpArtifact instanceof Artifact) {
				Artifact artifact = (Artifact) tmpArtifact;
				return new Object[] { um, artifact, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_CompilationUnit2Artifact_12_2_corematch_blackBBFFB(
			org.eclipse.uml2.uml.Model um, Artifact artifact, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (JavaModel2UMLPackage jm2um : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(um,
				JavaModel2UMLPackage.class, "target")) {
			Model jm = jm2um.getSource();
			if (jm != null) {
				_result.add(new Object[] { um, artifact, jm, jm2um, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_CompilationUnit2Artifact_12_3_findcontext_blackBBBB(
			org.eclipse.uml2.uml.Model um, Artifact artifact, Model jm, JavaModel2UMLPackage jm2um) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (um.getPackagedElements().contains(artifact)) {
			if (jm.equals(jm2um.getSource())) {
				if (um.equals(jm2um.getTarget())) {
					_result.add(new Object[] { um, artifact, jm, jm2um });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_CompilationUnit2Artifact_12_3_findcontext_greenBBBBFFFF(
			org.eclipse.uml2.uml.Model um, Artifact artifact, Model jm, JavaModel2UMLPackage jm2um) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge um__artifact____packagedElement = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge jm2um__jm____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge jm2um__um____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String um__artifact____packagedElement_name_prime = "packagedElement";
		String jm2um__jm____source_name_prime = "source";
		String jm2um__um____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(um);
		isApplicableMatch.getAllContextElements().add(artifact);
		isApplicableMatch.getAllContextElements().add(jm);
		isApplicableMatch.getAllContextElements().add(jm2um);
		um__artifact____packagedElement.setSrc(um);
		um__artifact____packagedElement.setTrg(artifact);
		isApplicableMatch.getAllContextElements().add(um__artifact____packagedElement);
		jm2um__jm____source.setSrc(jm2um);
		jm2um__jm____source.setTrg(jm);
		isApplicableMatch.getAllContextElements().add(jm2um__jm____source);
		jm2um__um____target.setSrc(jm2um);
		jm2um__um____target.setTrg(um);
		isApplicableMatch.getAllContextElements().add(jm2um__um____target);
		um__artifact____packagedElement.setName(um__artifact____packagedElement_name_prime);
		jm2um__jm____source.setName(jm2um__jm____source_name_prime);
		jm2um__um____target.setName(jm2um__um____target_name_prime);
		return new Object[] { um, artifact, jm, jm2um, isApplicableMatch, um__artifact____packagedElement,
				jm2um__jm____source, jm2um__um____target };
	}

	public static final Object[] pattern_CompilationUnit2Artifact_12_4_solveCSP_bindingFBBBBBB(
			CompilationUnit2Artifact _this, IsApplicableMatch isApplicableMatch, org.eclipse.uml2.uml.Model um,
			Artifact artifact, Model jm, JavaModel2UMLPackage jm2um) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, um, artifact, jm, jm2um);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, um, artifact, jm, jm2um };
		}
		return null;
	}

	public static final Object[] pattern_CompilationUnit2Artifact_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_CompilationUnit2Artifact_12_4_solveCSP_bindingAndBlackFBBBBBB(
			CompilationUnit2Artifact _this, IsApplicableMatch isApplicableMatch, org.eclipse.uml2.uml.Model um,
			Artifact artifact, Model jm, JavaModel2UMLPackage jm2um) {
		Object[] result_pattern_CompilationUnit2Artifact_12_4_solveCSP_binding = pattern_CompilationUnit2Artifact_12_4_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, um, artifact, jm, jm2um);
		if (result_pattern_CompilationUnit2Artifact_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_CompilationUnit2Artifact_12_4_solveCSP_binding[0];

			Object[] result_pattern_CompilationUnit2Artifact_12_4_solveCSP_black = pattern_CompilationUnit2Artifact_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_CompilationUnit2Artifact_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, um, artifact, jm, jm2um };
			}
		}
		return null;
	}

	public static final boolean pattern_CompilationUnit2Artifact_12_5_checkCSP_expressionFBB(
			CompilationUnit2Artifact _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_CompilationUnit2Artifact_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_CompilationUnit2Artifact_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "CompilationUnit2Artifact";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_CompilationUnit2Artifact_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_CompilationUnit2Artifact_20_1_preparereturnvalue_bindingFB(
			CompilationUnit2Artifact _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_CompilationUnit2Artifact_20_1_preparereturnvalue_blackFBBF(EClass __eClass,
			CompilationUnit2Artifact _this) {
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

	public static final Object[] pattern_CompilationUnit2Artifact_20_1_preparereturnvalue_bindingAndBlackFFBF(
			CompilationUnit2Artifact _this) {
		Object[] result_pattern_CompilationUnit2Artifact_20_1_preparereturnvalue_binding = pattern_CompilationUnit2Artifact_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_CompilationUnit2Artifact_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_CompilationUnit2Artifact_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_CompilationUnit2Artifact_20_1_preparereturnvalue_black = pattern_CompilationUnit2Artifact_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_CompilationUnit2Artifact_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_CompilationUnit2Artifact_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_CompilationUnit2Artifact_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_CompilationUnit2Artifact_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_CompilationUnit2Artifact_20_2_testcorematchandDECs_black_nac_0B(
			Artifact artifact) {
		for (org.eclipse.uml2.uml.Class __DEC_artifact_nestedClassifier_642995 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(artifact, org.eclipse.uml2.uml.Class.class, "nestedClassifier")) {
			return new Object[] { artifact };
		}
		return null;
	}

	public static final Object[] pattern_CompilationUnit2Artifact_20_2_testcorematchandDECs_black_nac_1B(
			Artifact artifact) {
		for (Interface __DEC_artifact_nestedClassifier_523146 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(artifact, Interface.class, "nestedClassifier")) {
			return new Object[] { artifact };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_CompilationUnit2Artifact_20_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_packagedElement) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpUm = _edge_packagedElement.getSrc();
		if (tmpUm instanceof org.eclipse.uml2.uml.Model) {
			org.eclipse.uml2.uml.Model um = (org.eclipse.uml2.uml.Model) tmpUm;
			EObject tmpArtifact = _edge_packagedElement.getTrg();
			if (tmpArtifact instanceof Artifact) {
				Artifact artifact = (Artifact) tmpArtifact;
				if (um.getPackagedElements().contains(artifact)) {
					if (pattern_CompilationUnit2Artifact_20_2_testcorematchandDECs_black_nac_0B(artifact) == null) {
						if (pattern_CompilationUnit2Artifact_20_2_testcorematchandDECs_black_nac_1B(artifact) == null) {
							_result.add(new Object[] { um, artifact, _edge_packagedElement });
						}
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_CompilationUnit2Artifact_20_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_CompilationUnit2Artifact_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			CompilationUnit2Artifact _this, Match match, org.eclipse.uml2.uml.Model um, Artifact artifact) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, um, artifact);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_CompilationUnit2Artifact_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			CompilationUnit2Artifact _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_CompilationUnit2Artifact_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_CompilationUnit2Artifact_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_CompilationUnit2Artifact_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_CompilationUnit2Artifact_21_1_preparereturnvalue_bindingFB(
			CompilationUnit2Artifact _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_CompilationUnit2Artifact_21_1_preparereturnvalue_blackFBBF(EClass __eClass,
			CompilationUnit2Artifact _this) {
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

	public static final Object[] pattern_CompilationUnit2Artifact_21_1_preparereturnvalue_bindingAndBlackFFBF(
			CompilationUnit2Artifact _this) {
		Object[] result_pattern_CompilationUnit2Artifact_21_1_preparereturnvalue_binding = pattern_CompilationUnit2Artifact_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_CompilationUnit2Artifact_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_CompilationUnit2Artifact_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_CompilationUnit2Artifact_21_1_preparereturnvalue_black = pattern_CompilationUnit2Artifact_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_CompilationUnit2Artifact_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_CompilationUnit2Artifact_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_CompilationUnit2Artifact_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_CompilationUnit2Artifact_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_CompilationUnit2Artifact_21_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_compilationUnits) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpJm = _edge_compilationUnits.getSrc();
		if (tmpJm instanceof Model) {
			Model jm = (Model) tmpJm;
			EObject tmpCompilationUnit = _edge_compilationUnits.getTrg();
			if (tmpCompilationUnit instanceof CompilationUnit) {
				CompilationUnit compilationUnit = (CompilationUnit) tmpCompilationUnit;
				if (jm.getCompilationUnits().contains(compilationUnit)) {
					_result.add(new Object[] { compilationUnit, jm, _edge_compilationUnits });
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_CompilationUnit2Artifact_21_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_CompilationUnit2Artifact_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			CompilationUnit2Artifact _this, Match match, CompilationUnit compilationUnit, Model jm) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, compilationUnit, jm);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_CompilationUnit2Artifact_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			CompilationUnit2Artifact _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_CompilationUnit2Artifact_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_CompilationUnit2Artifact_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_CompilationUnit2Artifact_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_CompilationUnit2Artifact_24_1_prepare_blackB(CompilationUnit2Artifact _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_CompilationUnit2Artifact_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_CompilationUnit2Artifact_24_2_matchsrctrgcontext_bindingFFFFBB(
			Match targetMatch, Match sourceMatch) {
		EObject _localVariable_0 = targetMatch.getObject("um");
		EObject _localVariable_1 = targetMatch.getObject("artifact");
		EObject _localVariable_2 = sourceMatch.getObject("compilationUnit");
		EObject _localVariable_3 = sourceMatch.getObject("jm");
		EObject tmpUm = _localVariable_0;
		EObject tmpArtifact = _localVariable_1;
		EObject tmpCompilationUnit = _localVariable_2;
		EObject tmpJm = _localVariable_3;
		if (tmpUm instanceof org.eclipse.uml2.uml.Model) {
			org.eclipse.uml2.uml.Model um = (org.eclipse.uml2.uml.Model) tmpUm;
			if (tmpArtifact instanceof Artifact) {
				Artifact artifact = (Artifact) tmpArtifact;
				if (tmpCompilationUnit instanceof CompilationUnit) {
					CompilationUnit compilationUnit = (CompilationUnit) tmpCompilationUnit;
					if (tmpJm instanceof Model) {
						Model jm = (Model) tmpJm;
						return new Object[] { um, artifact, compilationUnit, jm, targetMatch, sourceMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_CompilationUnit2Artifact_24_2_matchsrctrgcontext_blackBBBBBB(
			org.eclipse.uml2.uml.Model um, Artifact artifact, CompilationUnit compilationUnit, Model jm,
			Match sourceMatch, Match targetMatch) {
		if (!sourceMatch.equals(targetMatch)) {
			return new Object[] { um, artifact, compilationUnit, jm, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_CompilationUnit2Artifact_24_2_matchsrctrgcontext_bindingAndBlackFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_CompilationUnit2Artifact_24_2_matchsrctrgcontext_binding = pattern_CompilationUnit2Artifact_24_2_matchsrctrgcontext_bindingFFFFBB(
				targetMatch, sourceMatch);
		if (result_pattern_CompilationUnit2Artifact_24_2_matchsrctrgcontext_binding != null) {
			org.eclipse.uml2.uml.Model um = (org.eclipse.uml2.uml.Model) result_pattern_CompilationUnit2Artifact_24_2_matchsrctrgcontext_binding[0];
			Artifact artifact = (Artifact) result_pattern_CompilationUnit2Artifact_24_2_matchsrctrgcontext_binding[1];
			CompilationUnit compilationUnit = (CompilationUnit) result_pattern_CompilationUnit2Artifact_24_2_matchsrctrgcontext_binding[2];
			Model jm = (Model) result_pattern_CompilationUnit2Artifact_24_2_matchsrctrgcontext_binding[3];

			Object[] result_pattern_CompilationUnit2Artifact_24_2_matchsrctrgcontext_black = pattern_CompilationUnit2Artifact_24_2_matchsrctrgcontext_blackBBBBBB(
					um, artifact, compilationUnit, jm, sourceMatch, targetMatch);
			if (result_pattern_CompilationUnit2Artifact_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { um, artifact, compilationUnit, jm, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_CompilationUnit2Artifact_24_3_solvecsp_bindingFBBBBBBB(
			CompilationUnit2Artifact _this, org.eclipse.uml2.uml.Model um, Artifact artifact,
			CompilationUnit compilationUnit, Model jm, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_4 = _this.isApplicable_solveCsp_CC(um, artifact, compilationUnit, jm, sourceMatch,
				targetMatch);
		CSP csp = _localVariable_4;
		if (csp != null) {
			return new Object[] { csp, _this, um, artifact, compilationUnit, jm, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_CompilationUnit2Artifact_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_CompilationUnit2Artifact_24_3_solvecsp_bindingAndBlackFBBBBBBB(
			CompilationUnit2Artifact _this, org.eclipse.uml2.uml.Model um, Artifact artifact,
			CompilationUnit compilationUnit, Model jm, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_CompilationUnit2Artifact_24_3_solvecsp_binding = pattern_CompilationUnit2Artifact_24_3_solvecsp_bindingFBBBBBBB(
				_this, um, artifact, compilationUnit, jm, sourceMatch, targetMatch);
		if (result_pattern_CompilationUnit2Artifact_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_CompilationUnit2Artifact_24_3_solvecsp_binding[0];

			Object[] result_pattern_CompilationUnit2Artifact_24_3_solvecsp_black = pattern_CompilationUnit2Artifact_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_CompilationUnit2Artifact_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, um, artifact, compilationUnit, jm, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_CompilationUnit2Artifact_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_CompilationUnit2Artifact_24_5_matchcorrcontext_blackBBFBB(
			org.eclipse.uml2.uml.Model um, Model jm, Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (JavaModel2UMLPackage jm2um : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(jm,
					JavaModel2UMLPackage.class, "source")) {
				if (um.equals(jm2um.getTarget())) {
					_result.add(new Object[] { um, jm, jm2um, sourceMatch, targetMatch });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_CompilationUnit2Artifact_24_5_matchcorrcontext_greenBBBF(
			JavaModel2UMLPackage jm2um, Match sourceMatch, Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "CompilationUnit2Artifact";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(jm2um);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { jm2um, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_CompilationUnit2Artifact_24_6_createcorrespondence_blackBBBBB(
			org.eclipse.uml2.uml.Model um, Artifact artifact, CompilationUnit compilationUnit, Model jm,
			CCMatch ccMatch) {
		return new Object[] { um, artifact, compilationUnit, jm, ccMatch };
	}

	public static final Object[] pattern_CompilationUnit2Artifact_24_6_createcorrespondence_greenBBFB(Artifact artifact,
			CompilationUnit compilationUnit, CCMatch ccMatch) {
		org.gravity.tgg.modisco.uml.CompilationUnit2Artifact c2a = UmlFactory.eINSTANCE
				.createCompilationUnit2Artifact();
		c2a.setSource(compilationUnit);
		c2a.setTarget(artifact);
		ccMatch.getCreateCorr().add(c2a);
		return new Object[] { artifact, compilationUnit, c2a, ccMatch };
	}

	public static final Object[] pattern_CompilationUnit2Artifact_24_7_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_CompilationUnit2Artifact_24_7_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "CompilationUnit2Artifact";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_CompilationUnit2Artifact_24_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_CompilationUnit2Artifact_27_1_matchtggpattern_blackBB(
			CompilationUnit compilationUnit, Model jm) {
		if (jm.getCompilationUnits().contains(compilationUnit)) {
			return new Object[] { compilationUnit, jm };
		}
		return null;
	}

	public static final boolean pattern_CompilationUnit2Artifact_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_CompilationUnit2Artifact_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_CompilationUnit2Artifact_28_1_matchtggpattern_black_nac_0B(Artifact artifact) {
		for (org.eclipse.uml2.uml.Class __DEC_artifact_nestedClassifier_343879 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(artifact, org.eclipse.uml2.uml.Class.class, "nestedClassifier")) {
			return new Object[] { artifact };
		}
		return null;
	}

	public static final Object[] pattern_CompilationUnit2Artifact_28_1_matchtggpattern_black_nac_1B(Artifact artifact) {
		for (Interface __DEC_artifact_nestedClassifier_629388 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(artifact, Interface.class, "nestedClassifier")) {
			return new Object[] { artifact };
		}
		return null;
	}

	public static final Object[] pattern_CompilationUnit2Artifact_28_1_matchtggpattern_blackBB(
			org.eclipse.uml2.uml.Model um, Artifact artifact) {
		if (um.getPackagedElements().contains(artifact)) {
			if (pattern_CompilationUnit2Artifact_28_1_matchtggpattern_black_nac_0B(artifact) == null) {
				if (pattern_CompilationUnit2Artifact_28_1_matchtggpattern_black_nac_1B(artifact) == null) {
					return new Object[] { um, artifact };
				}
			}
		}
		return null;
	}

	public static final boolean pattern_CompilationUnit2Artifact_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_CompilationUnit2Artifact_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_CompilationUnit2Artifact_29_1_createresult_blackB(
			CompilationUnit2Artifact _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_CompilationUnit2Artifact_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_CompilationUnit2Artifact_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, org.eclipse.uml2.uml.Model um) {
		if (ruleResult.getTargetObjects().contains(um)) {
			return new Object[] { ruleResult, um };
		}
		return null;
	}

	public static final Object[] pattern_CompilationUnit2Artifact_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, JavaModel2UMLPackage jm2um) {
		if (ruleResult.getCorrObjects().contains(jm2um)) {
			return new Object[] { ruleResult, jm2um };
		}
		return null;
	}

	public static final Object[] pattern_CompilationUnit2Artifact_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, Model jm) {
		if (ruleResult.getSourceObjects().contains(jm)) {
			return new Object[] { ruleResult, jm };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_CompilationUnit2Artifact_29_2_isapplicablecore_blackFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList jm2umList : ruleEntryContainer.getRuleEntryList()) {
			for (EObject tmpJm2um : jm2umList.getEntryObjects()) {
				if (tmpJm2um instanceof JavaModel2UMLPackage) {
					JavaModel2UMLPackage jm2um = (JavaModel2UMLPackage) tmpJm2um;
					org.eclipse.uml2.uml.Package tmpUm = jm2um.getTarget();
					if (tmpUm instanceof org.eclipse.uml2.uml.Model) {
						org.eclipse.uml2.uml.Model um = (org.eclipse.uml2.uml.Model) tmpUm;
						Model jm = jm2um.getSource();
						if (jm != null) {
							if (pattern_CompilationUnit2Artifact_29_2_isapplicablecore_black_nac_1BB(ruleResult,
									jm2um) == null) {
								if (pattern_CompilationUnit2Artifact_29_2_isapplicablecore_black_nac_0BB(ruleResult,
										um) == null) {
									if (pattern_CompilationUnit2Artifact_29_2_isapplicablecore_black_nac_2BB(ruleResult,
											jm) == null) {
										_result.add(new Object[] { jm2umList, um, jm2um, jm, ruleEntryContainer,
												ruleResult });
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

	public static final Object[] pattern_CompilationUnit2Artifact_29_3_solveCSP_bindingFBBBBBB(
			CompilationUnit2Artifact _this, IsApplicableMatch isApplicableMatch, org.eclipse.uml2.uml.Model um,
			Model jm, JavaModel2UMLPackage jm2um, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, um, jm, jm2um, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, um, jm, jm2um, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_CompilationUnit2Artifact_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_CompilationUnit2Artifact_29_3_solveCSP_bindingAndBlackFBBBBBB(
			CompilationUnit2Artifact _this, IsApplicableMatch isApplicableMatch, org.eclipse.uml2.uml.Model um,
			Model jm, JavaModel2UMLPackage jm2um, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_CompilationUnit2Artifact_29_3_solveCSP_binding = pattern_CompilationUnit2Artifact_29_3_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, um, jm, jm2um, ruleResult);
		if (result_pattern_CompilationUnit2Artifact_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_CompilationUnit2Artifact_29_3_solveCSP_binding[0];

			Object[] result_pattern_CompilationUnit2Artifact_29_3_solveCSP_black = pattern_CompilationUnit2Artifact_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_CompilationUnit2Artifact_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, um, jm, jm2um, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_CompilationUnit2Artifact_29_4_checkCSP_expressionFBB(
			CompilationUnit2Artifact _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_CompilationUnit2Artifact_29_5_checknacs_blackBBB(org.eclipse.uml2.uml.Model um,
			Model jm, JavaModel2UMLPackage jm2um) {
		return new Object[] { um, jm, jm2um };
	}

	public static final Object[] pattern_CompilationUnit2Artifact_29_6_perform_blackBBBB(org.eclipse.uml2.uml.Model um,
			Model jm, JavaModel2UMLPackage jm2um, ModelgeneratorRuleResult ruleResult) {
		return new Object[] { um, jm, jm2um, ruleResult };
	}

	public static final Object[] pattern_CompilationUnit2Artifact_29_6_perform_greenBFFBFBB(
			org.eclipse.uml2.uml.Model um, Model jm, ModelgeneratorRuleResult ruleResult, CSP csp) {
		Artifact artifact = UMLFactory.eINSTANCE.createArtifact();
		CompilationUnit compilationUnit = JavaFactory.eINSTANCE.createCompilationUnit();
		org.gravity.tgg.modisco.uml.CompilationUnit2Artifact c2a = UmlFactory.eINSTANCE
				.createCompilationUnit2Artifact();
		Object _localVariable_0 = csp.getValue("artifact", "fileName");
		Object _localVariable_1 = csp.getValue("artifact", "name");
		Object _localVariable_2 = csp.getValue("compilationUnit", "originalFilePath");
		Object _localVariable_3 = csp.getValue("compilationUnit", "name");
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_4 = ruleResult.getIncrementedPerformCount();
		um.getPackagedElements().add(artifact);
		ruleResult.getTargetObjects().add(artifact);
		jm.getCompilationUnits().add(compilationUnit);
		ruleResult.getSourceObjects().add(compilationUnit);
		c2a.setSource(compilationUnit);
		c2a.setTarget(artifact);
		ruleResult.getCorrObjects().add(c2a);
		String artifact_fileName_prime = (String) _localVariable_0;
		String artifact_name_prime = (String) _localVariable_1;
		String compilationUnit_originalFilePath_prime = (String) _localVariable_2;
		String compilationUnit_name_prime = (String) _localVariable_3;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_4);
		artifact.setFileName(artifact_fileName_prime);
		artifact.setName(artifact_name_prime);
		compilationUnit.setOriginalFilePath(compilationUnit_originalFilePath_prime);
		compilationUnit.setName(compilationUnit_name_prime);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { um, artifact, compilationUnit, jm, c2a, ruleResult, csp };
	}

	public static final ModelgeneratorRuleResult pattern_CompilationUnit2Artifact_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //CompilationUnit2ArtifactImpl
