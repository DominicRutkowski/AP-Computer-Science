// Dominic Rutkowski
//
/* The DistanceChart class simulates a golf vacation
   given city names and distances between each city.
   It can plan an itinerary for said vacation starting
   at the most remote city and visiting the nearest city
   to the previous city thereafter.
*/

public class DistanceChart
{
	private String[] cityNames;
	private int[][] distances;
	
	public DistanceChart(String[] cityNames, int[][] distances)
	{
		this.cityNames = cityNames; // "this" refers to the current object, so this.cityNames is the instance field of the class
		this.distances = distances;
	}
	
	private int findRemoteCity()
	{
		int maxIndex = 0;
		int max = 0;
		for (int i = 0; i < distances.length; i++)
		{
			int[] currentArray = distances[i];
			int accumulator = 0;
			for (int j : currentArray)
			{
				accumulator += j;
			}
			if (accumulator > max)
			{
				max = accumulator;
				maxIndex = i;
			}
		}
		return maxIndex;
	}
	
	private int findNearestCity(int i)
	{
		int minIndex = 0;
		int min = Integer.MAX_VALUE;
		for (int j = 0; j < distances[i].length; j++)
		{
			int current = distances[i][j];
			if (current < min && current != 0)
			{
				min = current;
				minIndex = j;
			}
		}
		for (int[] j : distances)
		{
			for (int k = 0; k < j.length; k++)
			{
				if (k == i)
				{
					j[k] = Integer.MAX_VALUE;
				}
			}
		}
		return minIndex;
	}
	
	public String[] makeItinerary()
	{
		String[] itinerary = new String[cityNames.length];
		int index = findRemoteCity();
		itinerary[0] = cityNames[index];
		for (int i = 1; i < itinerary.length; i++)
		{
			index = findNearestCity(index);
			itinerary[i] = cityNames[index];
		}
		return itinerary;
	}
}