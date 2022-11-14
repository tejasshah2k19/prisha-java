package week5;

import java.util.Arrays;

public class ArrayRemoveData {

	public static void main(String[] args) {

		int a[] = { 1, 20, 1, 40, 40, 6, 7 };
		// 1 20 0 40 0 6 7

		// 1 20 40 6 7

		Arrays.sort(a);
		// 1 1 6 7 20 40 40
		// i j
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					a[j] = 0;
				}
			}
		}

		System.out.println("After Duplicate remove:-");
		for (int x : a) {
			if (x != 0) {
				System.out.println(x);
			}
		}

	}

}
