//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Varun Singhal

import static java.lang.System.*;

import java.text.DecimalFormat;
import java.util.Scanner;

public class AddSubMult
{
	public static double check( double a, double b )
	{
		double result = 0;
		if (a > b)
		{
			result = a - b;
		}
		else if (b > a)
		{
			result = b - a;
		}
		else
		{
			result = b * a;
		}

		return result;
	}
}