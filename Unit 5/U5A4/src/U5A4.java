// Dominic Rutkowski
//
/* This application simulates the Game of
   Life, a mathematical "game" that generates
   a pattern of occupied cells moving around.
*/

import javax.swing.JFrame;
import javax.swing.JTextArea;
import java.awt.Container;
import java.awt.Font;

public class U5A4 extends JFrame
{
	private JTextArea output;
	private String[][] board = {{" ", " ", " ", " ", " ", " "},
			{" ", " ", "*", " ", " ", " "},
			{" ", " ", " ", "*", " ", " "},
			{" ", "*", "*", "*", " ", " "},
			{" ", " ", " ", " ", " ", " "},
			{" ", " ", " ", " ", " ", " "}};
	
	private U5A4()
	{
		Container cont = getContentPane();
		output = new JTextArea();
		output.setFont(new Font("Monospaced", Font.PLAIN, 16));
		
		for (int i = 0; i <= 4; i++)
		{
			if (i % 2 == 0)
			{
				output.append("Generation " + i + "\n");
				printMatrix();
			}
			changeMatrix();
		}
		
		cont.add(output);
		setSize(200, 500);
		setVisible(true);
	}
	
	private void changeMatrix()
	{
		String[][] tempBoard = new String[6][6];
		for (int i = 0; i < 6; i++)
		{
			for (int j = 0; j < 6; j++)
			{
				int neighbors = numberOfNeighbors(i, j);
				if (board[i][j].equals("*")) // Occupied
				{
					if (neighbors >= 4 || neighbors <= 1)
					{
						tempBoard[i][j] = " ";
					}
					else
					{
						tempBoard[i][j] = "*";
					}
				}
				else // Vacant
				{
					if (neighbors == 3)
					{
						tempBoard[i][j] = "*";
					}
					else
					{
						tempBoard[i][j] = " ";
					}
				}
			}
		}
		board = tempBoard;
	}
	
	private int numberOfNeighbors(int row, int column)
	{
		int neighbors = 0;
		int previousRow = row - 1;
		int nextRow = row + 1;
		int previousColumn = column - 1;
		int nextColumn = column + 1;
		if (previousRow >= 0 && previousColumn >= 0 && board[previousRow][previousColumn].equals("*")) // Top left
		{
			neighbors++;
		}
		if (previousRow >= 0 && nextColumn <= 5 && board[previousRow][nextColumn].equals("*")) // Top right
		{
			neighbors++;
		}
		if (nextRow <= 5 && previousColumn >= 0 && board[nextRow][previousColumn].equals("*")) // Bottom left
		{
			neighbors++;
		}
		if (nextRow <= 5 && nextColumn <= 5 && board[nextRow][nextColumn].equals("*")) // Bottom right
		{
			neighbors++;
		}
		if (previousRow >= 0 && board[previousRow][column].equals("*")) // Top
		{
			neighbors++;
		}
		if (previousColumn >= 0 && board[row][previousColumn].equals("*")) // Left
		{
			neighbors++;
		}
		if (nextRow <= 5 && board[nextRow][column].equals("*")) // Right
		{
			neighbors++;
		}
		if (nextColumn <= 5 && board[row][nextColumn].equals("*")) // Bottom
		{
			neighbors++;
		}
		return neighbors;
	}
	
	private void printMatrix()
	{
		for (int i = 0; i < 6; i++)
		{
			output.append("|");
			for (int j = 0; j < 6; j++)
			{
				output.append(board[i][j] + "|");
			}
			output.append("\n-------------\n");
		}
	}
	
	public static void main(String[] args)
	{
		U5A4 app = new U5A4();
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}