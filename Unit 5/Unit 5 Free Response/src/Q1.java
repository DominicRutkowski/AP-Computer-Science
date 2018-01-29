public class Q1
{
	public static void main(String[] args)
	{
		Q1 app = new Q1();
	}
	
	private Q1()
	{
		int test = 123456789;
		int[] result = separate(test);
		for (int i : result)
		{
			System.out.println(i);
		}
	}
	
	private int[] separate(int n)
	{
		String number = Integer.toString(n);
		int[] array = new int[number.length()];
		for (int i = 0; i < number.length(); i++)
		{
			array[i] = Integer.parseInt(number.substring(i, i + 1));
		}
		return array;
	}
}