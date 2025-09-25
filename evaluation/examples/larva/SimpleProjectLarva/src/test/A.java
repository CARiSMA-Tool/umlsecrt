package test;

import other.B;

public class A {
	public static void main(String[] args) {
		new A().m1();
	}

	private void m1() {
		System.out.println("m1");
		new B().m2();
	}
}
