package core;

import java.util.Scanner;

public class ArrayDemo1D {

	public static void main(String[] args) {
			int a[] = new int[5];
			Scanner scr= new Scanner(System.in);
			
			for(int i=0;i<5;i++) {
				System.out.println("Enter value");
				a[i] = scr.nextInt(); 
			}
			
			for(int i=0;i<5;i++) {
				System.out.println(a[i]); 
			}
			int max = a[0]; // 10 
			for(int i=1;i<5;i++) {
				if(max < a[i]) {
					max = a[i];
				}
			}
			System.out.println("max => "+max);
	}
	
}
