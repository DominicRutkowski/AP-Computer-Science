import java.util.Random;

public class FreeResponse
{
	private int[] ary = new int[10000];

	public FreeResponse()
	{
		fillArray();
	}

	public static void main(String[] args)
	{
		FreeResponse app = new FreeResponse();
	}

	private void fillArray()
	{
		Random generator = new Random();
		for (int j = 0; j < ary.length; j++)
		{
			ary[j]= generator.nextInt(9000) + 1000;
		}
	}
}