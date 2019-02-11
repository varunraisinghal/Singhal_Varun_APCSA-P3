//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  - 

import static java.lang.System.*;

import java.util.Scanner;

public class StringEqualityRunner
{
	public static void main( String args[] )
	{
		StringEquality stringEquality = new StringEquality("hello", "goodbye");
		Scanner keyboard = new Scanner(System.in);
		int x = 0;
		while ( x < 7)
		{
			out.print("Enter a word you would like to compare :: ");
			String word1 = keyboard.nextLine();
			out.print("Enter a word you would like to compare :: ");
			String word2 = keyboard.nextLine();
			stringEquality.setWords(word1, word2);
			stringEquality.checkEquality();
			System.out.println(stringEquality.toString());
			x++;
		}

		
		
	}
}