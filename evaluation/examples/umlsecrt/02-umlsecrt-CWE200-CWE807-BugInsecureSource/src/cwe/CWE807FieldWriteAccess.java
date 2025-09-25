package cwe;

import org.gravity.security.annotations.requirements.Critical;

import secret.ProtectedValues;

@Critical(integrity = "value:boolean")
public class CWE807FieldWriteAccess {

	public static void main(String[] args) {
		ProtectedValues protectedValues = new ProtectedValues();
		boolean value = protectedValues.getValue();
		System.out.println("Value before change: " + value);
		
		//Illegal assignment
		protectedValues.value = !value;
		
		System.out.println("VIOLATION: Changed value: " + protectedValues.value+ ", expected vlaue: "+value);
	}

}
