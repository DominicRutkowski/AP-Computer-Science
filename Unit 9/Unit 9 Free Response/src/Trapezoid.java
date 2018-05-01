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
		double top = distance(topLeft, topRight);
		double bot = distance(botLeft, botRight);
		double left = distance(topLeft, botLeft);
		double right = distance(topRight, botRight);
		double h = distance(topLeft, botRight);
		double s1 = (left + bot + h) / 2;
		double s2 = (top + right + h) / 2;
		return Math.sqrt(s1 * (s1 - left) * (s1 - bot) * (s1 - h)) + Math.sqrt(s2 * (s2 - top) * (s2 - right) * (s2 - h));
	}
}