import java.util.ArrayList;

public class Driver
{
    private Driver()
    {
        ArrayList<Comparable> list = new ArrayList<Comparable>();

        list.add(new Rectangle(5.2, 8.5));
        list.add(new Rectangle(3.9, 4.7));

        list.add(new RightTriangle(3.7, 5.1));
        list.add(new RightTriangle(1.8, 8.6));

        list.add(new Rectangle(8.7, 5.5));
        list.add(new RightTriangle(7.9, 6.4));

        list.add(new Rectangle(4.0, 5.0));
        list.add(new Rectangle(5.0, 4.0));

        list.add(new RightTriangle(3.0, 3.0));
        list.add(new RightTriangle(2.0, 6.0));

        for (int i = 0; i < 10; i += 2)
        {
            Comparable first = list.get(i);
            Comparable second = list.get(i + 1);
            System.out.println(toString(first.compareTo(second), (Shape) first, (Shape) second));
        }
    }

    private String toString(int comparison, Shape first, Shape second)
    {
        if (comparison == -1)
        {
            return first.toString() + " is less than " + second.toString();
        }
        if (comparison == 1)
        {
            return first.toString() + " is greater than " + second.toString();
        }
        return "Shapes are equal";
    }

    public static void main(String[] args)
    {
        Driver app = new Driver();
    }
}