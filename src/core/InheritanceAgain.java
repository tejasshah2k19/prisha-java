package core;

public class InheritanceAgain {

	public static void main(String[] args) {

			C c = new C();
			c.name = ""; // P :: name 
			c.add(); // P :: add() 
	}
}

//inheritance 
class P {
	String name; //v 
	
	void add() { //m 
		System.out.println(" P :: add() ");
	}
}


class C extends P{
	//name 
	//add() 
}