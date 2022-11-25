package week9;

public class EqualsCompare {

	public static void main(String[] args) {

		String s1 = "royal";
		String s2 = "royal";
		String s3 = "god";
		// equals and compareTo both are used to compare - check string are
		// equal or not
		// what is the difference?
		// equals method return boolean [ same -> true , not same -> false ]
		// compareTo method return integer [ same -> 0, not same -> + - ]
		// character difference
		// p
		// r
		// p-r [ negative ] , r-p [positive]

		System.out.println(s1.equals(s2)); // true
		System.out.println(s1.compareTo(s2));// 0

		System.out.println(s1.equals(s3));// false
		System.out.println(s1.compareTo(s3));// royal - god
	}
}
