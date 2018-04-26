// Dominic Rutkowski
//
/* The Fielder class is a type of BaseballPlayer
   that plays baseball as a fielder and has a
   statistic called fielding percentage.
*/

public class Fielder extends BaseballPlayer
{
	private int assists;
	private int putouts;
	private int errors;
	private String fieldingPercentage;

	public Fielder(String name, int numberOfGames, int assists, int putouts, int errors)
	{
		super(name, numberOfGames);
		this.assists = assists;
		this.putouts = putouts;
		this.errors = errors;
		setStat();
	}

	public String toString()
	{
		return super.toString() + "Fielding Percentage: " + fieldingPercentage + "\n";
	}

	public void setStat()
	{
		fieldingPercentage = String.format("%.3f", (double) (assists + putouts) / (assists + putouts + errors));
	}
}