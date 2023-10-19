package cwe;

import secret.ProtectedValues;

public class CWE807FieldWriteAccess {

	public static void main(String[] args) {
		ProtectedValues protectedValues = new ProtectedValues();
		boolean value = protectedValues.getValue();
		System.out.println("Value before change: " + value);
		
		//Illegal assignment
		protectedValues.value = !value;
		
		System.out.println("VIOLATION: Changed value: " + protectedValues.getValue()+ ", expected vlaue: "+value);
	}

}
