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
		
		out.print("Enter the original bill amount :: ");
		double amt = keyboard.nextDouble();
		
		Discount.getDiscountedBill(amt);
		
		out.print("Enter the original bill amount :: ");
		double amt1 = keyboard.nextDouble();
		
		Discount.getDiscountedBill(amt1);
		
		out.print("Enter the original bill amount :: ");
		double amt2 = keyboard.nextDouble();
		
		Discount.getDiscountedBill(amt2);
		
		out.print("Enter the original bill amount :: ");
		double amt3 = keyboard.nextDouble();
		
		Discount.getDiscountedBill(amt3);
		
		out.print("Enter the original bill amount :: ");
		double amt4 = keyboard.nextDouble();
		
		Discount.getDiscountedBill(amt4);
	}
}