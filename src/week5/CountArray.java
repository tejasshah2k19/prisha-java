package week5;

public class CountArray {

//	public static void main(String[] args) {
//		int a[] = { 8, 4, 6, 8, 31, 16, 8 };
//		int count = 0;
//		int find = 8;//  
//
//		for (int i = 0; i < a.length; i++) {
//			if (a[i] == find) {
//				count++;
//			}
//		}
//		System.out.println("count =>  " + count);
//		if(count == 0){
	//		S.o.p("Num not found");
	//	}
//	
//	}

//	public static void main(String[] args) {
//		int a[] = { 8, 4, 6, 8, 31, 16, 8 };
//		int count = 0;
//		int find = 8;// 8 or 7 or 6
//
//		for (int i = 0; i < a.length; i++) {
//			if (a[i] == 8 || a[i] == 7 || a[i] == 6) {
//				count++;
//			}
//		}
//		System.out.println("count =>  " + count);
//
//	}

	public static void main(String[] args) {
		int a[] = { 8, 4, 6, 8, 31, 16, 9 };
		int count = 0;
		int find = 8;// 8 or 7 or 6

		for (int i = 0; i < a.length; i++) {
			if (a[i] % 3 == 0) {
				count++;
				System.out.println(a[i]);// i
			}
		}
		System.out.println("count =>  " + count);

	}

}
