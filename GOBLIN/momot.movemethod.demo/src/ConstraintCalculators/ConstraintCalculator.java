package ConstraintCalculators;

import java.util.Map;

import org.eclipse.emf.henshin.interpreter.EGraph;
import org.gravity.typegraph.basic.TMember;
import org.gravity.typegraph.basic.TVisibility;
import org.gravity.typegraph.basic.TypeGraph;

import FitnessCalculators.IFitnessCalculator;
import momotFiles.Utility;

public abstract class ConstraintCalculator implements IFitnessCalculator{


	
	@Override
	public double calculate(EGraph graph) {
		return calculate(Utility.getPG(graph));
	}
	
	
	public double calculate(TypeGraph graph){
		return violations(graph).size();
	}
	
	
	public Map<TMember, TVisibility>  violations(EGraph graph) {
		return violations(Utility.getPG(graph));
	}
	public abstract Map<TMember, TVisibility> violations(TypeGraph graph);
	
}
