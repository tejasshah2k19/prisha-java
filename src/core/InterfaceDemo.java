package core;

//internface --> is a pure abstract class 

abstract class AA {
	int x;
	final int y = 12;

	abstract void add();

	void sub() {
		// logic
	}

}

public class InterfaceDemo {

}

//pure abstract class 
interface James {

	public static final int MAX = 10;// final

	void add();

	public abstract void sub();
}

//class A extends B  -> if B is a class 

class JamesImpl implements James {

	public void add() {

	}

	public void sub() {

	}
}
