//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date - 
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class StringRunner
{
	public static void main ( String[] args )
	{
		int x = 0;
		while (x < 8)
			{
				StringOddOrEven stringOddOrEven = new StringOddOrEven("cat");
				Scanner keyboard = new Scanner(System.in);
				out.print("Enter a word :: ");
				String word = keyboard.nextLine();
				stringOddOrEven.setString(word);
				stringOddOrEven.isEven();
				System.out.println(stringOddOrEven.toString() + "\n");
				x++;
			}

		
	}
}