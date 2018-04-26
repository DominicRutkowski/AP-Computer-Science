// Dominic Rutkowski
//
/* The Hitter class is a type of BaseballPlayer
   that plays baseball as a hitter and has a
   statistic called batting average.
*/

public class Hitter extends BaseballPlayer
{
	private int bats;
	private int hits;
	private String battingAverage;

	public Hitter(String name, int numberOfGames, int bats, int hits)
	{
		super(name, numberOfGames);
		this.bats = bats;
		this.hits = hits;
		setStat();
	}

	public String toString()
	{
		return super.toString() + "Batting Average: " + battingAverage + "\n";
	}

	public void setStat()
	{
		battingAverage = String.format("%.3f", (double) hits / bats);
	}
}