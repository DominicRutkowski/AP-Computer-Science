// Dominic Rutkowski
//
/* This application determines a trip itinerary
   for a golf vacation around Iowa. It starts at
   the most remote location and proceeds to the
   nearest location each time thereafter.
*/

public class U5Test
{
	public static void main(String[] args)
	{
		String[] names = {"Iowa City", "Ames", "Waterloo", "Ottumwa", "Burlington"};
		int[][] chart = {{0, 121, 81, 83, 82},
						 {121, 0, 96, 116, 190},
						 {81, 96, 0, 117, 154},
						 {83, 116, 117, 0, 77},
						 {82, 190, 154, 77, 0}};
		DistanceChart golfVacation = new DistanceChart(names, chart);
		String[] itinerary = golfVacation.makeItinerary();
		System.out.println("The Itinerary\n-------------");
		for (String i : itinerary)
		{
			System.out.println(i);
		}
	}
}