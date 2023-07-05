package core;

public class AccessModifierSpecifier {

	public static void main(String[] args) {

	}
}

class Parent {
	private void sub() {

	}

	// default
	void add() {
	}

	protected void div() {

	}

	public void mul() {

	}

}
// private default protected public 

// static abstract final stirctfp 

class Child extends Parent {

	void seeParent() {
		// super.sub(); //private
		super.add();
		super.div();
		super.mul();
	}
}

class NonChild {
//
	void seeNonParent() {
		Parent p = new Parent();
		// p.sub();
		p.add();
		p.div();
		p.mul();
	}
}
