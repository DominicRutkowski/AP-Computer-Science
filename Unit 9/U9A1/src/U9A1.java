// Dominic Rutkowski
//
/* This class demonstrates inheritance by
   testing the HourlyWorker, SalariedWorker,
   and PieceWorker classes, each of which
   extend the Worker superclass.
*/

import java.awt.Container;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class U9A1 extends JFrame
{
	private JTextArea text = new JTextArea();

	private U9A1()
	{
		testHourly();
		testSalaried();
		testPiece();

		text.setFont(new Font("Monospaced", Font.PLAIN, 12));
		Container cont = getContentPane();
		cont.add(text);
		setSize(500, 500);
		setVisible(true);
	}

	private void testHourly()
	{
		HourlyWorker johnDoe = new HourlyWorker("John Doe", 9.48, 43);
		String pay = String.format("$%.2f", johnDoe.wage());
		text.append("Test Hourly Worker Class\n");
		text.append("------------------------\n");
		text.append("Wage for " + johnDoe.getName() + " = " + pay + "\n\n");
	}

	private void testSalaried()
	{
		SalariedWorker karenJones = new SalariedWorker("Karen Jones", 25.76, 52);
		String pay = String.format("$%.2f", karenJones.wage());
		text.append("Test Salaried Worker Class\n");
		text.append("--------------------------\n");
		text.append("Wage for " + karenJones.getName() + " = " + pay + "\n\n");
	}

	private void testPiece()
	{
		PieceWorker wesleySmith = new PieceWorker("Wesley Smith", 5.65, 36);
		String pay = String.format("$%.2f", wesleySmith.wage(1025));
		text.append("Test Piece Worker Class\n");
		text.append("-----------------------\n");
		text.append("Wage for " + wesleySmith.getName() + " = " + pay + "\n\n");
	}

	public static void main(String[] args)
	{
		U9A1 app = new U9A1();
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}