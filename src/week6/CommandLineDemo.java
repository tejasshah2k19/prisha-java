package week6;

public class CommandLineDemo {
	public static void main(String[] args) {
		// print all
		// for(int i=0;i<args.length;i++){
		// System.out.println(args[i]);
		// }
		boolean ans = 3 > 5;
		
		// System.out.println(Integer.parseInt(args[0]) + Integer.parseInt(args[1]));
		int sum = 0;
		for (int i = 0; i < args.length; i++) {
			int num = Integer.parseInt(args[i]);
			sum = sum + num;
		}
		System.out.println("sum => " + sum);
		// Double.parseDouble("");
		// Float.parseFloat("");
	}
}