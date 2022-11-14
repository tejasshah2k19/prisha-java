package week5;

public class ArrayCopy {

	public static void main(String[] args) {
		int a[] = { 1, 2, 33, 44, 55, 66 };

		int b[] = new int[a.length];

		b = a;

		System.out.println("Elements in Array B ");
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
			a[i] = a[i] * 2;
		}

		// we can not use for each loop when we need to modify array value inside loop
		// read only
		// for each - enhanced for loop
		System.out.println("Elements in Array B ");
		for (int x : b) {
			System.out.println(x);// 1
			x = 90;
		}

	}
}
