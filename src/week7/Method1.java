package week7;

public class Method1 {

	public static void main(String[] args) {
		add();
		sub(10, 2);
//		System.out.println(add());
		System.out.println(mul(5, 5));
		int ans = mul(6, 6);
		System.out.println(ans);
	}

	// no return no argument
	static void add() {
		int a = 10;
		int b = 20;
		int ans = a + b;
		System.out.println(ans);
	}

	// no return with argument
	static void sub(int a, int b) {
		int ans = a - b;
		System.out.println(ans);
	}

	// return with argument
	static int mul(int a, int b) {
		return a * b;
	}

	// return with no argument
	static int div() {
		int a = 10; // StdIn.readInt();
		int b = 2;
		return a / b;
	}

}

class Demo2 {
	public static void main(String[] args) {
		int x = 3, y = 4;
		int z = add(multiply(square(x), y), add(x, square(y)));
		System.out.println(z);
	}

	public static int add(int a, int b) {
		return a + b;
	}

	public static int multiply(int a, int b) {
		return a * b;
	}

	public static int square(int a) {
		return a * a;
	}
}
