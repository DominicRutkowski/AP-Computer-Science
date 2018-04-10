public class RightTriangle implements Shape, Comparable
{
	private double leg1;
	private double leg2;

	public RightTriangle(double leg1, double leg2)
	{
		this.leg1 = leg1;
		this.leg2 = leg2;
	}

	public double area()
	{
		return leg1 * leg2 / 2;
	}

	public double perimeter()
	{
		return leg1 + leg2 + Math.sqrt(Math.pow(leg1, 2) + Math.pow(leg2, 2));
	}

	public String toString()
	{
		return "RightTriangle[" + leg1 + ", " + leg2 + "]";
	}

	public int compareTo(Object object)
	{
		Shape shape = (Shape) object;
		if (this.area() > shape.area())
		{
			return 1;
		}
		if (this.area() < shape.area())
		{
			return -1;
		}
		if (this.perimeter() > shape.perimeter())
		{
			return 1;
		}
		if (this.perimeter() < shape.perimeter())
		{
			return -1;
		}
		return 0;
	}
}