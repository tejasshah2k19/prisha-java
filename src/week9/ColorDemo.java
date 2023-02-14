package week9;

import java.awt.Color;

public class ColorDemo {

	public static void main(String[] args) {
		Color c = new Color(0, 0, 0);
		System.out.println(c.getRed());
		System.out.println(c.getBlue());
		System.out.println(c.getGreen());

		System.out.println(c.toString());


		
		Color myc = new Color(125,120,110);
		StdDraw.setPenColor(myc);
		StdDraw.filledSquare(0.50, .6, .3);

		
		Color red = new Color(255,0,0);
		StdDraw.setPenColor(red);
		StdDraw.filledSquare(0.50, .6, .2);

		Color green = new Color(0,255,0);
		StdDraw.setPenColor(green);
		StdDraw.filledSquare(0.50, .6, .1);
 
		
		
		
//		Color blue = new Color(0,0,255);
//		StdDraw.setPenColor(blue);
//		StdDraw.filledSquare(0.25, 1, .2);
//		
	}
}
