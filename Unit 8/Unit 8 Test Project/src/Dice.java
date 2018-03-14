// Dominic Rutkowski
//
/*
*/

public class Dice implements Measurable
{
    private int die1;
    private int die2;
    private String sum;

    public Dice(int die1, int die2)
    {
        this.die1 = die1;
        this.die2 = die2;
        setSum();
    }

    private void setSum()
    {
        sum = Integer.toString(die1 + die2);
    }

    public String getResult()
    {
        return sum;
    }
}