public class Trapezoid extends Quadrilateral
{
	private Point topLeft;
	private Point botLeft;
	private Point botRight;
	private Point topRight;

	public Trapezoid(String lbl, Point tL, Point bL, Point bR, Point tR)
	{
		super(lbl);
		topLeft = tL;
		botLeft = bL;
		botRight = bR;
		topRight = tR;
	}

	public double perimeter()
	{
		double top = distance(topLeft, topRight);
		double bot = distance(botLeft, botRight);
		double left = distance(topLeft, botLeft);
		double right = distance(topRight, botRight);
		return top + bot + left + right;
	}

	public double area()
	{
		int height = topLeft.getY() - botLeft.getY();
		double base = (double) (distance(topLeft, topRight) + distance(botLeft, botRight)) / 2;
		return base * height;
	}
}