package example;

import java.util.Set;

import java.util.HashSet;

public class Teacher implements Cloneable {
	
	private static Set<String> INSTANCES = new HashSet<>();
	
	public Object clone() {

		try {
			return super.clone();
		} catch (java.lang.CloneNotSupportedException e) {

			throw new RuntimeException(e.toString());
		}
	}

	public String name;
	
//	@Secrecy@Integrity
	public String clas;

	public Teacher(String name, String clas) {
		// Some dummy security check (only one instance per name)
		if(INSTANCES.contains(name)) {
			throw new SecurityException();
		}
		INSTANCES.add(name);
		
		this.name = name;
		this.clas = clas;
	}
}
