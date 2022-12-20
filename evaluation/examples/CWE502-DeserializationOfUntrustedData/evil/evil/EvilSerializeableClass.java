package evil;

import cwe.CWE502;
import cwe.SerializableClass;

public class EvilSerializeableClass extends SerializableClass {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6724907857148841814L;

	public void doSomething(CWE502 cwe) {
		System.out.println("I am EVIL: ");
		cwe.secret();
	}
}
