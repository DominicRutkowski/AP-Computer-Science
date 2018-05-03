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
		int height = topLeft.getY() - botLeft.getY();
		return distance(botLeft, botRight) * height;
	}
}
