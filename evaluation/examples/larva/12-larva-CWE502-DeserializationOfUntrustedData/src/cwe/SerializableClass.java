package cwe;

import java.io.Serializable;

public class SerializableClass implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6724907857148841814L;

	public void doSomething(CWE502 cwe) {
		System.out.println("I am GOOD: ");
		cwe.api();
	}
}
