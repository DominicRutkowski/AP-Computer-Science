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

public class TicTacToe extends Application
{
	private Board board;

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
}