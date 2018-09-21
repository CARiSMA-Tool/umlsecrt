package org.gravity.tgg.modisco.uml.csp.constraints;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ThreadLocalRandom;

import org.moflon.tgg.csp.constraints.*;
import org.moflon.tgg.language.csp.Variable;
import org.moflon.tgg.language.csp.impl.TGGConstraintImpl;

public class JVisibility2umlVisibility extends TGGConstraintImpl {
	private static final Map<org.eclipse.gmt.modisco.java.VisibilityKind, org.eclipse.uml2.uml.VisibilityKind> jToU = new HashMap<>(4);
	private static final Map<org.eclipse.uml2.uml.VisibilityKind, org.eclipse.gmt.modisco.java.VisibilityKind> uToJ = new HashMap<>(4);
	
	static {
		jToU.put(org.eclipse.gmt.modisco.java.VisibilityKind.PRIVATE, org.eclipse.uml2.uml.VisibilityKind.PRIVATE_LITERAL);
		jToU.put(org.eclipse.gmt.modisco.java.VisibilityKind.PROTECTED, org.eclipse.uml2.uml.VisibilityKind.PROTECTED_LITERAL);
		jToU.put(org.eclipse.gmt.modisco.java.VisibilityKind.NONE, org.eclipse.uml2.uml.VisibilityKind.PACKAGE_LITERAL);
		jToU.put(org.eclipse.gmt.modisco.java.VisibilityKind.PUBLIC, org.eclipse.uml2.uml.VisibilityKind.PUBLIC_LITERAL);
		
		uToJ.put(org.eclipse.uml2.uml.VisibilityKind.PRIVATE_LITERAL, org.eclipse.gmt.modisco.java.VisibilityKind.PRIVATE);
		uToJ.put(org.eclipse.uml2.uml.VisibilityKind.PROTECTED_LITERAL, org.eclipse.gmt.modisco.java.VisibilityKind.PROTECTED);
		uToJ.put(org.eclipse.uml2.uml.VisibilityKind.PACKAGE_LITERAL, org.eclipse.gmt.modisco.java.VisibilityKind.NONE);
		uToJ.put(org.eclipse.uml2.uml.VisibilityKind.PUBLIC_LITERAL, org.eclipse.gmt.modisco.java.VisibilityKind.PUBLIC);
	}
	
	public void solve(Variable var_0, Variable var_1){
    	String bindingStates = getBindingStates(var_0, var_1);
    	
    	switch(bindingStates){
    	case "BB":
    		setSatisfied(jToU.get(var_0.getValue())==var_1.getValue());
    		break;
    	case "BF":
    		var_1.bindToValue(jToU.get(var_0.getValue()));
    		setSatisfied(true);
    		break;
    	case "FB":
    		var_0.bindToValue(uToJ.get(var_1.getValue()));
    		setSatisfied(true);
    		break;
    	case "FF":
    		@SuppressWarnings("unchecked") Entry<org.eclipse.gmt.modisco.java.VisibilityKind, org.eclipse.uml2.uml.VisibilityKind>[] entries = jToU.entrySet().toArray(new Map.Entry[jToU.size()]);
    		int selection = ThreadLocalRandom.current().nextInt(entries.length);
    		var_0.bindToValue(entries[selection].getKey());
    		var_1.bindToValue(entries[selection].getValue());
    		setSatisfied(true);
    		break;
    	default: 
    		throw new UnsupportedOperationException("This case in the constraint has not been implemented yet: " + bindingStates);
    	}
    	
  	}	  
}