package core;

public class StaticDemo {

	public static void main(String[] args) {

		KB k = new KB();
		k.add();//
		System.out.println(k.a);//
		KB.sub();
		System.out.println(KB.x); // static property can be access using class name 
					//we don't require to create object for that , 
					//yes we can also access it using object/instance 
		
	}

}

class KB {
	int a = 10;
	static int x = 10;
	void add() {
		System.out.println("KB::add()");
	}
	
	
	static void sub() {
		System.out.println("KB::sub()");
	}
}
