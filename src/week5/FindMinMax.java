package week5;

public class FindMinMax {

	public static void main(String[] args) {
		int a[] = { 1, 4, 6, 18, 31, 16, 8 };

		int max = a[0];
		int min = a[0];
		int minIndex = 0;
		int maxIndex = 0;

		for (int i = 0; i < a.length; i++) {
			if (max < a[i]) {
				max = a[i];
				maxIndex = i;
			}
			if (min > a[i]) {
				min = a[i];
				minIndex = i;
			}
		}
		System.out.println("Max => " + max);// 31 -> 4
		System.out.println("Min => " + min);// 1 -> 0
		System.out.println("Max value index => " + maxIndex);
		System.out.println("Min Value index => " + minIndex);
	}
}
