package core;

public class InheritanceDemo {

	public static void main(String[] args) {
		//
	//	S objS = new S();
		//objS.add(); 
		
		T objT = new T();
		objT.sub();
		objT.add(); // no 
	}
}

//Parent
class S {
	void add() {
		System.out.println("Add from S");
	}
}

//Child 
class T extends S{
	void sub() {
		System.out.println("Sub From T");
	}
}
