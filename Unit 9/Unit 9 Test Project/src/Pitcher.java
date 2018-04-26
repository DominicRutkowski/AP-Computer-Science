// Dominic Rutkowski
//
/* The Pitcher class is a type of BaseballPlayer
   that plays baseball as a pitcher and has a
   statistic called earned run average.
*/

public class Pitcher extends BaseballPlayer
{
	private double inningsPitched;
	private int earnedRuns;
	private String earnedRunAverage;

	public Pitcher(String name, int numberOfGames, double inningsPitched, int earnedRuns)
	{
		super(name, numberOfGames);
		this.inningsPitched = inningsPitched;
		this.earnedRuns = earnedRuns;
		setStat();
	}

	public String toString()
	{
		return super.toString() + "Earned Run Average: " + earnedRunAverage + "\n";
	}

	public void setStat()
	{
		earnedRunAverage = String.format("%.2f", (double) (9 * earnedRuns) / inningsPitched);
	}
}