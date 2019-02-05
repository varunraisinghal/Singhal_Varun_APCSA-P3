//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Varun Singhal
//Date - 02/05/19
//Class - AP Comp Sci A
//Lab  - 3

import static java.lang.System.*;
import java.util.Scanner;

public class Discount
{
	double bill = 0;

	public static double getDiscountedBill(double bill)
	{
		if (bill > 2000)
		{
			bill = (int) (bill * 0.85);
		}
		
		out.print("Bill after discount :: " + bill);
		return bill;
	}
}	