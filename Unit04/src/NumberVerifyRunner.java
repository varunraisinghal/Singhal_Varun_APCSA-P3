//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date - 
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class NumberVerifyRunner
{
	public static void main ( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		//add in input
		int x = 0;
		while (x < 5)
		{
			System.out.print("Enter a whole number :: ");
			int num = keyboard.nextInt();
			System.out.println(num + " is odd :: " + NumberVerify.isOdd(num));
			System.out.println(num + " is even :: " + NumberVerify.isEven(num) + "\n");
			x++;
		}
		
		
		//add in more test cases
	}
}