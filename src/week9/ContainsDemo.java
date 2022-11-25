package week9;

public class ContainsDemo {

	public static void main(String[] args) {

		String s4 = "This is pablo iscobar From US-WC";
		String sub = "PabLo";

		System.out.println(s4.contains(sub)); // true
		System.out.println(s4.contains(sub)); // false

		// ignore case
		s4 = s4.toUpperCase();// PABLO ISCOBAR
		sub = sub.toUpperCase(); // PABLO
		System.out.println(s4.contains(sub)); // true

		// PABLO ISCOBAR
		// PABLO

		System.out.println(s4.startsWith(sub));
		System.out.println(s4.endsWith(sub));

	}
}
