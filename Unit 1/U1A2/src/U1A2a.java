// Dominic Rutkowski
//
/* This application logs five
   rectangles to the console.
*/

import java.awt.Rectangle;

public class U1A2a
{
	public static void main(String[] args)
	{
		// Constructs rectangles 1-3
		Rectangle one = new Rectangle(5, 10, 20, 30);
		Rectangle two = new Rectangle(10, 25, 35, 15);
		Rectangle three = new Rectangle(20, 30, 10, 25);
		
		// Logs rectangles 1-3 to console and skips a line
		System.out.println(one);
		System.out.println(two);
		System.out.println(three);
		System.out.println("");
		
		// Constructs rectangles 4&5
		Rectangle four = one.intersection(two);
		Rectangle five = one.intersection(three);
		
		// Logs rectangles 4&5 to console
		System.out.println(four);
		System.out.println(five);
	}
}