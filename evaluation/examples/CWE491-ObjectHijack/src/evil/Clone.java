package evil;

import example.SomeObject;

public class Clone extends SomeObject {
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}
