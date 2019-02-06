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
		amt = Discount.getDiscountedBill(amt);
		System.out.print("Bill after discount :: ");
		System.out.printf("%.2f\n",amt);
		System.out.println("\n");
		
		out.print("Enter the original bill amount :: ");
		double amt1 = keyboard.nextDouble();
		amt1 = Discount.getDiscountedBill(amt1);
		System.out.print("Bill after discount :: ");
		System.out.printf("%.2f\n",amt1);
		System.out.println("\n");
		
		out.print("Enter the original bill amount :: ");
		double amt2 = keyboard.nextDouble();
		amt2 = Discount.getDiscountedBill(amt2);
		System.out.print("Bill after discount :: ");
		System.out.printf("%.2f\n",amt2);
		System.out.println("\n");
		
		out.print("Enter the original bill amount :: ");
		double amt3 = keyboard.nextDouble();
		amt3 = Discount.getDiscountedBill(amt3);
		System.out.print("Bill after discount :: ");
		System.out.printf("%.2f\n",amt3);
		System.out.println("\n");
		
		out.print("Enter the original bill amount :: ");
		double amt4 = keyboard.nextDouble();
		amt4 = Discount.getDiscountedBill(amt4);
		System.out.print("Bill after discount :: ");
		System.out.printf("%.2f\n",amt4);
		System.out.println("\n");
	}
}