// Dominic Rutkowski
//
/* The Tally class uses the Measurable interface
   to count/tally items in a set of data such as
   dice rolls or grades.
*/
public class Tally
{
	private static String[] item;
	private static int[] tally;
	
	public Tally(String[] item)
	{
		Tally.item = item.clone();
		tally = new int[item.length];
	}
	
	public void process(Measurable x)
	{
		for (int i = 0; i < item.length; i++)
		{
			if (item[i].equals(x.getResult()))
			{
				tally[i]++;
				break;
			}
		}
	}
	
	public int[] getTally()
	{
		return tally;
	}
}