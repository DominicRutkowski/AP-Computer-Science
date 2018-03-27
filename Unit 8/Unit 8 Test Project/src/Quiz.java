// Dominic Rutkowski
//
/* The Quiz class simulates a quiz. It stores the
   letter and numerical grade, the form of which can
   be measured for the purposes of the Tally class.
*/

public class Quiz implements Measurable
{
	private int score;
	private String grade;

	public Quiz(int score)
	{
		this.score = score;
		setGrade();
	}

	private void setGrade()
	{
		if (score >= 90)
		{
			grade = "A";
		}
		else if (score >= 80)
		{
			grade = "B";
		}
		else if (score >= 70)
		{
			grade = "C";
		}
		else if (score >= 60)
		{
			grade = "D";
		}
		else
		{
			grade = "F";
		}
	}

	public String getResult()
	{
		return grade;
	}
}