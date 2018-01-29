public class Q3
{
	public static void main(String[] args)
	{
		Q3 app = new Q3();
	}
	
	private Q3()
	{
		int[][] test = {{1,2,3},{4,5,6}};
		int target = 3;
		Position pos = getPos(test, target);
		if (pos != null)
		{
			System.out.println(pos.toString());
		}
		else
		{
			System.out.println("null");
		}
	}
	
	public static Position getPos(int[][] arr, int n)
	{
		for (int row = 0; row < arr.length; row++)
		{
			for (int col = 0; col < arr[row].length; col++)
			{
				if (arr[row][col] == n)
				{
					return new Position(row, col);
				}
			}
		}
		return null;
	}
}