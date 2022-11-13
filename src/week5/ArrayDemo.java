package week5;

import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
		// array is a collection of same type data.

		int a[];
		a = new int[30];

		int[] b = new int[30];
		// a[0] a[1] a[2] .... a[29]
		// index - always starts with 0 and ends with size-1
		// subscript
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;

		int x[] = new int[7];// 7

		Scanner scr = new Scanner(System.in); // int char float double string
		// ClassName objectName = new ClassName();

		for (int i = 0; i < x.length; i++) { // 7
			System.out.println("Enter value");
			x[i] = scr.nextInt(); // x[0] x[1] x[2] x[3] x[4]
		}
		// nextInt();
		// nextFloat();
		// nextDouble();
		// next(); //royal
		// nextLine(); // royal edu ahd ind
		// System.out.println(x);// memory address - hashcode

		for (int i = 0; i < x.length; i++) {// 7
			System.out.println(x[i]);
		}

	}
}
