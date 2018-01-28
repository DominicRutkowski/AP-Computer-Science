// Dominic Rutkowski
//
/* The Lottery class simulates a Lottery by picking
   five random numbers from 1 to 59 and a powerball
   from 1 - 35. It can check how much many a given
   ticket wins.
*/

public class Lottery
{
	private int[] numbers = new int[5];
	private int powerball;
	
	public Lottery()
	{
		setNumbers();
		powerball = (int) ((35 * Math.random()) + 1);
	}
	
	private void setNumbers()
	{
		int[] values = {1,2,3,4,5,6,7,8,9,10,
				11,12,13,14,15,16,17,18,19,20,
				21,22,23,24,25,26,27,28,29,30,
				31,32,33,34,35,36,37,38,39,40,
				41,42,43,44,45,46,47,48,49,50,
				51,52,53,54,55,56,57,58,59};
		int index;
		for (int i = 0; i < numbers.length; i++)
		{
			do
			{
				index = (int) (59 * Math.random());
			}
			while (values[index] == 0);
			numbers[i] = values[index];
			values[index] = 0;
		}
	}
	
	public int check(int[] nums, int pb)
	{
		int matches = 0;
		for (int i : numbers)
		{
			for (int j : nums)
			{
				if (j == i)
				{
					matches++;
				}
			}
		}
		
		boolean pbMatches = false;
		if (pb == powerball)
		{
			pbMatches = true;
		}
		
		if (matches == 5 && pbMatches)
		{
			return 1000000;
		}
		else if (matches == 5)
		{
			return 500000;
		}
		else if (matches == 4 && pbMatches)
		{
			return 10000;
		}
		else if (matches == 4 || (matches == 3 && pbMatches))
		{
			return 100;
		}
		else if (matches == 3 || (matches == 2 && pbMatches))
		{
			return 7;
		}
		else if (pbMatches)
		{
			return 4;
		}
		else
		{
			return 0;
		}
	}
	
	public int[] getNumbers()
	{
		return numbers;
	}
	
	public int getPowerball()
	{
		return powerball;
	}
}