// Dominic Rutkowski
//
/* The BaseballPlayer class represents a baseball
   player It has a name and a number of games played.
*/

public abstract class BaseballPlayer
{
	private String name;
	private int numberOfGames;

	public BaseballPlayer(String name, int numberOfGames)
	{
		this.name = name;
		this.numberOfGames = numberOfGames;
	}

	public String toString()
	{
		return "Name: " + name + "\nGames: " + numberOfGames + "\n";
	}

	public abstract void setStat();
}