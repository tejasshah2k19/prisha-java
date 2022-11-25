package week8;

public class RecursioIntro {

	public static void main(String[] args) {

//		printName(3);
//		printNum(3);
//		System.out.println(factorial(5));
//		System.out.println(power(2, 3));
//		System.out.println(sumofn(5));
		System.out.println(count7(717));
	}

	static void add() {
		sub();
		System.out.println("add()");
	}

	static void sub() {
		System.out.println("sub");
	}

	// recursion -> function call itself

	static void sqr() {
		System.out.println("sqr()");
		sqr();// calling itself
	}

//	static void printName(int count) {
//		for (int i = 1; i <= count; i++) {
//			System.out.println("Royal");
//		}
//	}

	static void printName(int count) {
		System.out.println("Royal");// royal royal royal
		count--;
		if (count != 0)
			printName(count);
	}

	// 3
	static void printNum(int n) {

		if (n != 0) {
			printNum(n - 1);// 2
			System.out.println(n);// 3
		}
	}

//	public static int factorial(int num) {
//		// 5 => 1 * 2 * 3 * 4 * 5
//		int ans = 1;
//		for (int i = 1; i <= num; i++) {
//			ans = ans * i;// 1 * 2 * 3 * 4 *5
//		}
//		return ans;
//	}
	// 5
	public static int factorial(int num) {
		if (num == 1)
			return 1;
		return num * factorial(num - 1);
		// 5 * 4 * 3 * 2 * 1;
	}

	public static int sumofn(int num) {
		if (num == 1)
			return 1;
		return num + sumofn(num - 1);
		// 5 * 4 * 3 * 2 * 1;
	}

	public static int power(int x, int n) {
		if (n == 1)
			return x;
		return x * power(x, n - 1);
	}

	public static int count7(int n) {// 717
		int count = 0;

		while (n > 0) {
			int x = n % 10;// 7 
			if (x == 7) {
				count++;// 2
			}
			n = n/10;//0
		}

		return count;

	}

}
