package week5;

public class ArrayRightShift {
	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5 };
		// rightshit
		// 1 1 2 3 4

		for (int k = 1; k <= 2; k++) {
			int tmp = a[a.length - 1]; // 5
			for (int i = a.length - 1; i >= 1; i--) {
				a[i] = a[i - 1]; // we cant take for each
			}
//			a[5] = tmp; // ArrayIndexOutofBoundsException
			a[0] = tmp;
		}
		for (int x : a) {
			System.out.println(x);
		}
	}

}
