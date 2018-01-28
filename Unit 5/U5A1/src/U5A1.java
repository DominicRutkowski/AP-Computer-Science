// Dominic Rutkowski
//
/* This application determines certain statistics
   based on the AP Exam scores and grades of a
   previous class of AP Computer Science students.
*/

public class U5A1
{
	public static void main(String[] args)
	{
		U5A1 app = new U5A1();
	}
	
	private U5A1()
	{
		int[] apExam = {4,5,5,5,3,2,5,4,5,4,3,4,5,4,4,5,4};
		int[] grades = {5,5,5,5,4,4,5,3,5,4,4,5,5,4,4,5,4};
		
		double apExamMean = calculateAverage(apExam);
		double gradesMean = calculateAverage(grades);
		
		System.out.printf("Mean of AP Exams = %.2f%n", apExamMean);
		System.out.printf("Mean of Grades   = %.2f%n%n", gradesMean);
		
		double apExamStandardDeviation = calculateStandardDeviation(apExam, apExamMean);
		double gradesStandardDeviation = calculateStandardDeviation(grades, gradesMean);
		
		System.out.printf("Standard Deviation of AP Exams = %.2f%n", apExamStandardDeviation);
		System.out.printf("Standard Deviation of Grades   = %.2f%n%n", gradesStandardDeviation);
		
		double correlation = calculateCorrelation(apExam,
				grades,
				apExamMean,
				gradesMean,
				apExamStandardDeviation,
				gradesStandardDeviation);
		
		System.out.printf("Correlation = %.2f%n", correlation);
	}
	
	private double calculateAverage(int[] arr)
	{
		int accumulator = 0;
		for (int i : arr)
		{
			accumulator += i;
		}
		return (double) accumulator / arr.length;
	}
	
	private double calculateStandardDeviation(int[] arr, double mean)
	{
		double accumulator = 0;
		for (int i : arr)
		{
			accumulator += Math.pow(i - mean, 2);
		}
		return Math.sqrt(accumulator / arr.length);
	}
	
	private double calculateCorrelation(int[] apExam,
	                                    int[] grades,
	                                    double apExamMean,
	                                    double gradesMean,
	                                    double apExamStandardDeviation,
	                                    double gradesStandardDeviation)
	{
		double accumulator = 0;
		for (int i = 0; i < apExam.length; i++)
		{
			int currentApExam = apExam[i];
			int currentGrades = grades[i];
			accumulator += ((currentApExam - apExamMean) * (currentGrades - gradesMean)) /
					((apExam.length - 1) * apExamStandardDeviation * gradesStandardDeviation);
		}
		return accumulator;
	}
}