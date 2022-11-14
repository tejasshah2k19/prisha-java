package week5;

public class ArrayLeftShift {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5 };
		// leftshit
		// 2 3 4 5 5

		for (int k = 1; k <= 2; k++) {
			int tmp = a[0];
			for (int i = 0; i < a.length - 1; i++) {
				a[i] = a[i + 1]; // we cant take for each
			}
//				a[5] = tmp; // ArrayIndexOutofBoundsException
			a[a.length - 1] = tmp;
		}
		for (int x : a) {
			System.out.println(x);
		}
	}
}
