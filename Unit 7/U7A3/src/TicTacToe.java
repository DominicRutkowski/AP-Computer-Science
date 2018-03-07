// Dominic Rutkowski
//
/* This JavaFX application allows
   the user to play tic-tac-toe.
*/

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

public class TicTacToe extends Application
{
	private Board board;
	private Piece next = new Piece("X");
	private int[] scores = {0,0,0,0,0,0,0,0};
	private boolean won = false;

	public void start(Stage primaryStage) throws Exception
	{
		primaryStage.setTitle("Tic-Tac-Toe");

		initBoard();

		GridPane grid = new GridPane();
		grid.setStyle("-fx-border-width: 1px");
		grid.setStyle("-fx-border-color: #000000");
		Button[][] buttons = new Button[3][3];
		for (int i = 0; i < 3; i++)
		{
			for (int j = 0; j < 3; j++)
			{
				buttons[i][j] = new Button();
				buttons[i][j].setStyle("-fx-background-color: #ffffff");
				buttons[i][j].setStyle("-fx-border-width: 1px");
				buttons[i][j].setStyle("-fx-border-color: #000000");
				buttons[i][j].setPrefWidth(100);
				buttons[i][j].setPrefHeight(100);
				int finalI = i;
				int finalJ = j;
				buttons[i][j].setOnAction(event -> registerClick(finalI, finalJ));
				grid.add(buttons[i][j], j, i, 1, 1);
			}
		}
		Scene scene = new Scene(grid, 300, 300);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	private void initBoard()
	{
		board = new Board(3, 3);
		for (int i = 0; i < board.getBoard().length; i++)
		{
			for (int j = 0; j < board.getBoard()[i].length; j++)
			{
				board.addPiece(new Piece(), i, j);
			}
		}
		board.drawBoard();
	}

	private void registerClick(int row, int col)
	{
		if (!won)
		{
			if (!board.isOccupied(row, col))
			{
				board.addPiece(next, row, col);
				board.drawBoard();
				int add;
				if (next.getID().equals("X"))
				{
					add = 1;
				}
				else
				{
					add = -1;
				}
				scores[row] += add;
				scores[3 + col] += add;
				if (row + col == 2)
				{
					scores[6] += add;
				}
				if (row == col)
				{
					scores[7] += add;
				}
				detectWin();
				if (!won)
				{
					checkForTie();
				}
				if (next.getID().equals("X"))
				{
					next = new Piece("O");
				}
				else
				{
					next = new Piece("X");
				}
			}
			else
			{
				JOptionPane.showMessageDialog(null, "That space is occupied.", "Tic-Tac-Toe Message", JOptionPane.WARNING_MESSAGE);
			}
		}
		else
		{
			JOptionPane.showMessageDialog(null, "The game is over.", "Tic-Tac-Toe Message", JOptionPane.WARNING_MESSAGE);
		}
	}

	private void detectWin()
	{
		for (int i = 0; i < scores.length; i++)
		{
			if (Math.abs(scores[i]) == 3)
			{
				won = true;
				if (i < 3)
				{
					if (board.getBoard()[i][0].equals(new Piece("X")))
					{
						winner("X");
					}
					else
					{
						winner("O");
					}
				}
				else if (i < 6)
				{
					if (board.getBoard()[0][i - 3].equals(new Piece("X")))
					{
						winner("X");
					}
					else
					{
						winner("O");
					}
				}
				else if (i == 6)
				{
					if (board.getBoard()[0][2].equals(new Piece("X")))
					{
						winner("X");
					}
					else
					{
						winner("O");
					}
				}
				else
				{
					if (board.getBoard()[0][0].equals(new Piece("X")))
					{
						winner("X");
					}
					else
					{
						winner("O");
					}
				}
				return;
			}
		}
	}

	private void winner(String winner)
	{
		JOptionPane.showMessageDialog(null, "The game was won by " + winner + ".", "Tic-Tac-Toe Results", JOptionPane.INFORMATION_MESSAGE);
	}

	private void checkForTie()
	{
		for (int i = 0; i < 3; i++)
		{
			for (int j = 0; j < 3; j++)
			{
				if (!board.isOccupied(i, j))
				{
					return;
				}
			}
		}
		JOptionPane.showMessageDialog(null, "The game is tied.", "Tic-Tac-Toe Results", JOptionPane.INFORMATION_MESSAGE);
	}
}