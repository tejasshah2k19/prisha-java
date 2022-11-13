package week5;

public class ArraySumAvg {

	public static void main(String[] args) {
		int a[] = { 1, 4, 6, 18, 31, 16, 8 };

		int sum = 0;

		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
		}
		int avg = sum / a.length;// 25.25=>25
		System.out.println("sum => " + sum);
		System.out.println("AVg => " + (sum / a.length));
	}
}
