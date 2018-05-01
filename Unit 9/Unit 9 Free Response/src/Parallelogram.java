public class Parallelogram extends Quadrilateral
{
	private Point topLeft;
	private Point botLeft;
	private Point botRight;

	public Parallelogram(String lbl, Point tL, Point bL, Point bR)
	{
		super(lbl);
		topLeft = tL;
		botLeft = bL;
		botRight = bR;
	}

	public double perimeter()
	{
		return 2 * (distance(topLeft, botLeft) + distance(botLeft, botRight));
	}

	public double area()
	{
		double a = distance(topLeft, botLeft);
		double b = distance(botLeft, botRight);
		double c = distance(topLeft, botRight);
		double s = (a + b + c) / 2;
		return Math.sqrt(s * (s - a) * (s - b) * (s - c));
	}
}
