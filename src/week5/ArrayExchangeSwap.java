package week5;

public class ArrayExchangeSwap {

	public static void main(String[] args) {
		int a[] = { 11, 22, 33, 44, 55 };
		// 11 22 55 44 33
		int i = 2;// index 0 1 2 3 4
		int j = 4;
		int tmp;
		// position 1 2 3 4 5
		tmp = a[i];
		a[i] = a[j];
		a[j] = tmp;

		for (int x : a) {
			System.out.println(x);
		}

	}
}
