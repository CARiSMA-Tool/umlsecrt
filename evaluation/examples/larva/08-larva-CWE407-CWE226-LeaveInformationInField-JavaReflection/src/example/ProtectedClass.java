package example;


//@Critical(secrecy= {"example.ProtectedClass.s:String"})
public class ProtectedClass {
	
//	@Secrecy@Integrity
	private String m() {
		System.out.println("[SUBJECT] m()");
		params("", this);
		return "secret";
	}
	
	private void params(String s, ProtectedClass p) {
		
	}
	
	String s = "Secret of field s";

//	@CounterMeasure
//	private String c() {
//		System.out.println(s);
//		return "replacement";
//	}
}
