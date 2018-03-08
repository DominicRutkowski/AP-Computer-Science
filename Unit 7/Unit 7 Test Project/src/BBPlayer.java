// Dominic Rutkowski
//
/* This class represents baseball players.
   It stores information about their uniform
   number, position, year, and points per game.
*/

public class BBPlayer
{
	private int num;
	private int year;
	private char pos;
	private double ppg;

	public BBPlayer(String input)
	{
		String[] out = new String[4];
		int counter = 0;
		String entry = "";
		for (int i = 0; i < input.length(); i++)
		{
			if (input.charAt(i) == ' ')
			{
				out[counter] = entry;
				counter++;
				entry = "";
			}
			else
			{
				entry += input.charAt(i);
			}
		}
		out[counter] = entry;
		num = Integer.parseInt(out[0]);
		year = Integer.parseInt(out[1]);
		pos = out[2].charAt(0);
		ppg = Double.parseDouble(out[3]);
	}

	public int getNum()
	{
		return num;
	}

	public int getYear()
	{
		return year;
	}

	public char getPos()
	{
		return pos;
	}

	public double getPpg()
	{
		return ppg;
	}
}