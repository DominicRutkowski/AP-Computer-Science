// Dominic Rutkowski
//
/*
*/

public class DataSet
{
    private static double max;
    private static double min;
    private static double ave;
    private static double sum;
    private static int count;

    public DataSet()
    {
        max = 0;
        min = 0;
        ave = 0;
        sum = 0;
        count = 0;
    }

    public DataSet(Measurable data)
    {
        if (data.accept())
        {
            count++;
            double measure = data.getMeasure();
            sum += measure;
            if (count == 1)
            {
                max = measure;
                min = measure;
            }
            else
            {
                if (measure > max)
                {
                    max = measure;
                }
                if (measure < min)
                {
                    min = measure;
                }
            }
            ave = sum / count;
        }
    }

    public double getMax()
    {
        return max;
    }

    public double getMin()
    {
        return min;
    }

    public double getAve()
    {
        return ave;
    }
}