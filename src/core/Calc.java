package core;

import java.util.Scanner;

public class Calc {

	// variable
	// methods

	int no1, no2, ans;
	Scanner scr = new Scanner(System.in);

	void add() {

		System.out.println("Enter two numbers");
		no1 = scr.nextInt();
		no2 = scr.nextInt();
		ans = no1 + no2;
		System.out.println("Addition = " + ans);
	}

	void sub() {
		System.out.println("Enter two numbers");
		no1 = scr.nextInt();
		no2 = scr.nextInt();
		ans = no1 - no2;
		System.out.println("Subtraction = " + ans);
	}

	public static void main(String[] args) {
		Calc obj = new Calc();
		obj.add();
		obj.sub();
	}
}
