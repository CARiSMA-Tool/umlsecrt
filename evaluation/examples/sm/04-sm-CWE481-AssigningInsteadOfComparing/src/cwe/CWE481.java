package cwe;

import secret.ProtectedValues;

public class CWE481 {

	public static void main(String[] args) {
		ProtectedValues p = new ProtectedValues();
        System.out.println("isZero is: " + p.zeroOrOne); // We have the rights to read the protected value
        
        if(p.zeroOrOne = true) /* FLAW: should be == and INCIDENTIAL CWE 571 Expression Is Always True */
        {
        	System.out.println("zeroOrOne is 0");
        }
        System.out.println("isZero is: " + p.zeroOrOne);
	}
}
