package core;

import java.util.Scanner;

public class TwoDArray {
	public static void main(String[] args) {

		int a[][] = new int[3][4];

		Scanner scr = new Scanner(System.in);
		// rM
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.println("Enter number");
				a[i][j] = scr.nextInt();
			}
		}

		System.out.println("Elements in the Array");

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println("");
		}

	}
}
