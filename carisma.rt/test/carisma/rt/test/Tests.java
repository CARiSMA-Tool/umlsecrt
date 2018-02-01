package carisma.rt.test;

import org.junit.Test;

import carisma.rt.CarismaRT;

public class Tests {

	@Test
	public void codeInjection() {
		CarismaRT.main(new String[] { "example.CodeInjection", "-cp", "/h../examples/CodeInjection/bin"});
	}
	
	@Test
	public void javaReflection() {
		CarismaRT.main(new String[] {"example.A", "-cp", "../examples/JavaReflection/bin"});
	}
}
