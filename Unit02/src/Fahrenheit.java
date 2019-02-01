//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Varun Singhal 
//Date - 02/01/19

public class Fahrenheit
{
	public static double convert( double f )
	{
		double convertFahrenheit = 0;
		convertFahrenheit = f - (int) 32;
		convertFahrenheit = convertFahrenheit * (int) 5;
		convertFahrenheit = convertFahrenheit / (int) 9;
		return convertFahrenheit;
	}
}