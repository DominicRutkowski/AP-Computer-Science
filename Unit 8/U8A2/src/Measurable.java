// Dominic Rutkowski
//
/* Allows an instance of a class with a measurable field to be
   passed to methods requiring an object with a measurable field,
   given that the object meets certain requirements.
*/

public interface Measurable
{
	double getMeasure();

	boolean accept();
}