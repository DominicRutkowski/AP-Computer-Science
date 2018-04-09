public class Rectangle implements Shape, Comparable
{
	private double length;
	private double width;

	public Rectangle(double length, double width)
	{
		this.length = length;
		this.width = width;
	}

	public double area()
	{
		return length * width;
	}

	public double perimeter()
	{
		return 2 * (length + width);
	}

	public String toString()
	{
		return "Rectangle [" + length + ", " + width + "]";
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