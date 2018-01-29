public class Q4
{
	public static void main(String[] args)
	{
		Q4 app = new Q4();
	}
	
	private Q4()
	{
		int[][] test = {{7,11,4,8},{10,5,9,6}};
		Position[][] result = getSuc(test);
		for (Position[] i : result)
		{
			for (Position j : i)
			{
				if (j != null)
				{
					System.out.println(j);
				}
				else
				{
					System.out.println("null");
				}
			}
		}
	}
	
	private Position[][] getSuc(int[][] arr)
	{
		Position[][] array = new Position[arr.length][arr[0].length];
		for (int row = 0; row < arr.length; row++)
		{
			for (int col = 0; col < arr[row].length; col++)
			{
				int suc = arr[row][col] + 1;
				array[row][col] = Q3.getPos(arr, suc);
			}
		}
		return array;
	}
}