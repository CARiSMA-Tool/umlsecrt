package example;

import org.gravity.security.annotations.requirements.Critical;

import hash.HashFunction;

@Critical(integrity = { "hash.MethodCall.hash(String):int" }, secrecy = { "hash.MethodCall.hash(String):int" })
public class MethodCall {

	public static void main(String[] args) {
		MethodCall m = new MethodCall();
		m.storePassword("password");
	}

	private void storePassword(String passwd) {
		HashFunction.hash(passwd);
	}
}
