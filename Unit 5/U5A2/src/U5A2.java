// Dominic Rutkowski
//
/* This Java application simulates 1,000,000
   lottery tickets and determines how many
   tickets win, and how much they win.
*/

public class U5A2
{
	public static void main(String[] args)
	{
		U5A2 app = new U5A2();
	}
	
	private U5A2()
	{
		Lottery lotto = new Lottery();
		int[] numbers;
		int powerball;
		
		int money;
		int winners4 = 0;
		int winners7 = 0;
		int winners100 = 0;
		int winners10k = 0;
		int winners500k = 0;
		int winners1m = 0;
		
		System.out.println("This Week's Numbers Are:");
		for (int i : lotto.getNumbers())
		{
			System.out.print(i + "  ");
		}
		System.out.println(lotto.getPowerball() + "\n");
		
		for (int i = 1; i <= 1000000; i++)
		{
			numbers = getNumbers();
			powerball = (int) ((35 * Math.random()) + 1);
			money = lotto.check(numbers, powerball);
			
			if (money == 4)
			{
				winners4++;
			}
			else if (money == 7)
			{
				winners7++;
			}
			else if (money == 100)
			{
				winners100++;
			}
			else if (money == 10000)
			{
				winners10k++;
				printPlayer(numbers, powerball, i, money);
			}
			else if (money == 500000)
			{
				winners500k++;
				printPlayer(numbers, powerball, i, money);
			}
			else if (money == 1000000)
			{
				winners1m++;
				printPlayer(numbers, powerball, i, money);
			}
		}
		
		System.out.println("$4 Winners:         " + winners4);
		System.out.println("$7 Winners:         " + winners7);
		System.out.println("$100 Winners:       " + winners100);
		System.out.println("$10,000 Winners:    " + winners10k);
		System.out.println("$500,000 Winners:   " + winners500k);
		System.out.println("$1,000,000 Winners: " + winners1m);
	}
	
	private void printPlayer(int[] nums, int pb, int i, int prize)
	{
		System.out.println("Player #" + i + " wins: $" + prize);
		for (int j : nums)
		{
			System.out.print(j + "  ");
		}
		System.out.println(pb + "\n");
	}
	
	private int[] getNumbers()
	{
		int[] result = new int[5];
		int[] values = {1,2,3,4,5,6,7,8,9,10,
				11,12,13,14,15,16,17,18,19,20,
				21,22,23,24,25,26,27,28,29,30,
				31,32,33,34,35,36,37,38,39,40,
				41,42,43,44,45,46,47,48,49,50,
				51,52,53,54,55,56,57,58,59};
		int index;
		for (int i = 0; i < result.length; i++)
		{
			do
			{
				index = (int) (59 * Math.random());
			}
			while (values[index] == 0);
			result[i] = values[index];
			values[index] = 0;
		}
		return result;
	}
}