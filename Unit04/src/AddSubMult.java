//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Varun Singhal

import static java.lang.System.*; 
import java.util.Scanner;

public class AddSubMult
{
	public static double check( double a, double b )
	{
		if (a > b)
		{
			return 	a - b;
		}
		else if (b > a)
		{
			return b - a;
		}
		return b * a;
	}
}