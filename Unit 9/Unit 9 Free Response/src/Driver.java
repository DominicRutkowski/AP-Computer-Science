import java.util.ArrayList;

public class Driver
{
	private ArrayList<Quadrilateral> list = new ArrayList<Quadrilateral>();

	private Driver()
	{
		list.add(new Parallelogram("ABCD", new Point(3, 4), new Point(0, 0), new Point(8, 0)));
	}

	public static void main(String[] args)
	{
		Driver app = new Driver();
	}
}