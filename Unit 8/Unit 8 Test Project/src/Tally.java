// Dominic Rutkowski
//
/*
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
                return;
            }
        }
    }

    public int[] getTally()
    {
        return tally;
    }
}