package recur;

import java.util.Scanner;

public class Avengers {

	int spiderman(int num) {

		int ans = num * num;
		return ans;
	}

	public static void main(String[] args) {
		int num;
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter num");
		num = scr.nextInt();

		Avengers a = new Avengers();
		int ans = a.spiderman(num);
		System.out.println(ans);

	}
}
