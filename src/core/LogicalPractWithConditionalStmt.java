package core;

public class LogicalPractWithConditionalStmt {

	public static void main(String[] args) {

		int n = 5;
		int ans = 1;
		for (int i = 1; i <= n; i++) {
//			System.out.println("Royal");

			if (i % 2 == 0) {
				System.out.println(i);
			}

		}
		System.out.println(ans);// 120
		// 5

		// ans => 120
		// 1 * 2 * 3 * 4 * 5

		// num = 152
		// 1+5+2

		/*
		 * 
		 * 
		 * 152%10 => 2 sum = 2 152/10 => 15
		 * 
		 * 15%10 => 5 sum =2+5 15/10 => 1
		 * 
		 * 1%10 => 1 sum => 2 + 5 + 1 1/10 => 0
		 * 
		 */

		int num = 15216;
		int sum = num % 10;

		while (num > 9) {
			int r = num % 10; // 2
			num = num / 10; // 152/10 => 0
		}
		sum = sum + num;

		System.out.println(sum);

		// 1521 => 1 , 1 => 2
	}
}
