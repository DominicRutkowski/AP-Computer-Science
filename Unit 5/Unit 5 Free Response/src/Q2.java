public class Q2
{
	public static void main(String[] args)
	{
		Q2 app = new Q2();
	}
	
	private Q2()
	{
		int[] test = {1,2,3,4,5};
		int[] test2 = {2,1,3,4,5};
		System.out.println(ascending(test));
		System.out.println(ascending(test2));
	}
	
	private Boolean ascending(int[] arr)
	{
		for (int i = 0; i + 1 < arr.length; i++)
		{
			if (arr[i] > arr[i + 1])
			{
				return false;
			}
		}
		return true;
	}
}