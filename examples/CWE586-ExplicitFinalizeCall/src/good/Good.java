package good;


import org.gravity.security.annotations.requirements.Critical;

import cwe.Finalizable;

@Critical(integrity = {"finalize():void"})
public class Good {
	public static void main(String[] args) throws Throwable {
		Finalizable finalizable = new Finalizable();
		System.out.println(finalizable.readFirstLine());
		finalizable.finalize();
	}
}
