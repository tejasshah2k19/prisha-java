package abstraction;

public class AbstractionDemo {
	public static void main(String[] args) {
		SBI s = new SBI();
		s.wid();
		s.dep();
		s.interest();
	}
}

abstract class RBI { // if class is an abstract then you can not create instance of it.
	abstract void wid(); // abstract

	void interest() {
		//
	}

	abstract void dep();
}

abstract class ICICI extends RBI {
	abstract void insurance();

	void dep() {
	}
}

class Prudential extends ICICI {
	void wid() {
	}

	void insurance() {
	}

}

class SBI extends RBI {
	void wid() {

	}

	void dep() {

	}
}

class PNB extends RBI {
	void wid() {

	}

	void dep() {

	}
}
