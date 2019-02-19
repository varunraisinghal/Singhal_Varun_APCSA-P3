//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import static java.lang.System.*;

import java.util.Scanner;

public class DoubleRunner
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		double one = 0, two = 0, three = 0, four = 0;
		int x = 0;
		
		while ( x < 6 )
		{
			System.out.print("Enter number :: ");
			one = keyboard.nextDouble();
			System.out.print("Enter number :: ");
			two = keyboard.nextDouble();
			System.out.print("Enter number :: ");
			three = keyboard.nextDouble();
			System.out.print("Enter number :: ");
			four = keyboard.nextDouble();
			
			BiggestDouble run = new BiggestDouble(one, two, three, four);
			System.out.println(run + "\n");
			
			x++;
		}
				
	}
}