package week9;

public class StringDemo {

	public static void main(String[] args) {
		// classname objectname = new classname();
		// classname objectname = new classname(value);

		String s2 = "royal";
		String s3 = "royal";
		String s4 = "royal123";

		String s = new String("royal");
		System.out.println(s);
		System.out.println(s2);

		// memory address
		System.out.println(s2 == s3); // true == will check memory address
		System.out.println(s == s2); // false

		// value
		System.out.println(s2.equals(s3));// true
		System.out.println(s.equals(s2));// true
	
		//object -> access property [ variable method ] 
		
		//obj.var 
		//obj.method() 
	}

}
