package week5;

public class LastIndex {

	public static int lastIndexOf(int a[], int item) {
		for (int i = a.length - 1; i >= 0; i--) {
			if (a[i] == item) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int a[]= {1,2,3,3,1,2};
		System.out.println(lastIndexOf(a, 2));
	}
}
