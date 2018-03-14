// Dominic Rutkowski
//
/*
*/

import java.awt.Container;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class U8Test extends JFrame
{
    private U8Test()
    {
        JTextArea text = new JTextArea();

        String[] diceOutcomes = {"2","3","4","5","6","7","8","9","10","11","12"};
        Tally diceTally = new Tally(diceOutcomes);
        for (int i = 0; i < 100; i++)
        {
            Dice dice = new Dice(inclusiveRandom(1, 6), inclusiveRandom(1, 6));
            diceTally.process(dice);
        }
        text.append("\tDice Tally\n");
        text.append("\t----------\n\n");
        text.append("Item\t\tTally\n");
        text.append("----\t\t-----\n");
        for (int i = 0; i < diceOutcomes.length; i++)
        {
            text.append(" " + diceOutcomes[i] + "\t\t " + diceTally.getTally()[i] + "\n");
        }

        String[] quizOutcomes = {"A","B","C","D","F"};
        Tally quizTally = new Tally(quizOutcomes);
        for (int i = 0; i < 100; i++)
        {
            Quiz quiz = new Quiz(inclusiveRandom(50, 100));
            quizTally.process(quiz);
        }
        text.append("\n\n\tQuiz Tally\n");
        text.append("\t----------\n\n");
        text.append("Item\t\tTally\n");
        text.append("----\t\t-----\n");
        for (int i = 0; i < quizOutcomes.length; i++)
        {
            text.append(" " + quizOutcomes[i] + "\t\t " + quizTally.getTally()[i] + "\n");
        }

        text.setFont(new Font("Monospaced", Font.PLAIN, 12));
        Container cont = getContentPane();
        cont.add(text);
        setSize(300, 500);
        setVisible(true);
    }

    private int inclusiveRandom(int min, int max)
    {
        return (int) (Math.random() * (max - min) + min);
    }

    public static void main(String[] args)
    {
        U8Test app = new U8Test();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}