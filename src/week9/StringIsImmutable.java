package week9;

public class StringIsImmutable {

	public static void main(String[] args) {
		// immutable
		String str = "royaledu";
		System.out.println(str);
		str = str.toUpperCase();
		System.out.println(str);

		String str2 = "royal";
		str2.toLowerCase();
		str2 = str2.toUpperCase();
		str2 = str2.toLowerCase();
		str2 = str2.toLowerCase().toUpperCase();
		System.out.println(str2);
	}
}
