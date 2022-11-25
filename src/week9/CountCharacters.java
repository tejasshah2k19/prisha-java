package week9;

public class CountCharacters {

	public static void main(String[] args) {
		// 0
		String str = "royal education ahmedabad guj ahmedabad";// count total characters

		String s1 = "royal edu";// a e i o u
		String s2 = "royal edu ahd";// d ?
		String s3 = "royal";

		System.out.println(str.length());// 5

		// royal
		// 01234
		System.out.println(str.charAt(0));
//		System.out.println(str.charAt(5));//.StringIndexOutOfBoundsException

		// count how many spaces ? how many words in string?
		// count vowel in a string ?
		// count particular character(s) in a string?

		// in array -> length is a keyword
		// in string -> length is a method()

		int space = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ') { // "" => string , '' => character
				space++;
			}
		}
		System.out.println("Total space = > " + space);
		System.out.println("Total Words => " + (space + 1));

	}
}
