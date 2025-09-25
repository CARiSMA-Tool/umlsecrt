package example;

public class SomeObject implements Cloneable {

	private String readOnly = "Secret";
	private boolean clone = false;

	/* FLAW: clone() method not declared final */
	protected Object clone() throws CloneNotSupportedException {
		SomeObject objectBad = (SomeObject) super.clone();
		objectBad.clone = true;
		return objectBad;
	}

	public boolean isClone() {
		return clone;
	}

	public String read() {
		return readOnly;
	}
}
