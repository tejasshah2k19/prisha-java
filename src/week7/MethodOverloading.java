package week7;

public class MethodOverloading {

	public static void main(String[] args) {
		// 10,20
		add(1, 2);
		add(2, 3);
//		add(2.0, 3.0); // point value -> double 
		add(2.0F, 3.0f);
		add(2f, 3f);// float,float

		// byte
		// short
		// char
		// int
		// long
		// float
		// double

		// boolean

		double d = Math.random();
		System.out.println(d);
		System.out.println(d * 10);
		System.out.println(d * 100);// 12.32323
		System.out.println(Math.random() * 100);

//		d * 100; 
	}

//method having same with different argument/parameter 
	static void add(int a, int b) {
		System.out.println("int()");
		System.out.println(a + b);
	}

	static void add(float a, float b) {
		System.out.println("float()");
		System.out.println(a + b);
	}

//	int add(int x,int y) {
//		return x+y;
//	}

//	void add(int c, int d) {
//		System.out.println(c + d);
//	}
}
