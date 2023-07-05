package core;

public class OverrideDemo {

	public static void main(String[] args) {

	}
}

class X {
	void add() {

	}
}

class Y extends X {
	void add() {

	}
}

class Z extends X {
	// add()
	void add(int x) {

	}
}

class Q {
	void add() {

	}

	void add(int x) {

	}
}

class XX {
	protected void add() {

	}
}

class L extends XX {
	public void add() {

	}
}

class K {
	void add() {

	}

	void add(int x) {

	}

	void add(float y) {

	}

}
