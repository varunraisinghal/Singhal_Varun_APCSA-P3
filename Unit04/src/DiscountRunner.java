//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Varun Singhal
//Date - 02/05/19
//Class - AP Comp Sci A
//Lab  - 3

import static java.lang.System.*;
import java.util.Scanner;

public class DiscountRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		int x = 0;
		while (x < 5)
		{
			out.print("Enter the original bill amount :: ");
			double amt = keyboard.nextDouble();
			amt = Discount.getDiscountedBill(amt);
			System.out.print("Bill after discount :: ");
			System.out.printf("%.2f\n",amt);
			System.out.println("\n");
			x++;
		}

		

	}
}