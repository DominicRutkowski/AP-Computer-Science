// Dominic Rutkowski
//
/* This driver class demonstrates inheritance, abstract
   classes, and polymorphism by creating different
   types of baseball players, calculating several
   statistics about them, and printing them out.
*/

import java.util.ArrayList;

public class U9Test
{
	public static void main(String[] args)
	{
		ArrayList<BaseballPlayer> players = new ArrayList<BaseballPlayer>();
		players.add(new Hitter("Tyler Lawson", 29, 78, 25));
		players.add(new Hitter("Jason Brown", 16, 54, 13));
		players.add(new Pitcher("Tom Jensen", 9, 50.7, 18));
		players.add(new Pitcher("Jason Brown", 10, 72.3, 15));
		players.add(new Fielder("Willie Starks", 30, 11, 97, 4));
		players.add(new Fielder("Jason Brown", 16, 23, 6, 3));
		for (BaseballPlayer player : players)
		{
			System.out.println(player);
		}
	}
}