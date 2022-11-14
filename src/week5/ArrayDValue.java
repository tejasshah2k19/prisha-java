package week5;

public class ArrayDValue {

	public static void main(String[] args) {

		int b[] = { 100, 200, 300, 400, 500 };
		
		
		int a[] = new int[10];

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

		// a[0] = 1;
		a[0] = 2147483647;
		System.out.println(a[20]);// no compilation error
	}
}

//data type -> size 

//int size 32 bits -> 4byte ->	4294967295 [ -2147483647  0 2147483647 ] 
//int => 1  5 10 

//0000 0000 0000 0001
//0000 0101 
//0000 1010 
//0001 0001

//20bits 
//0001 1000 0110 1010 0000

//255 / 2 => 8 bit =>    -128 to  +127 