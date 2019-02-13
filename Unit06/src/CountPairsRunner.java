//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*;

import java.util.Scanner; 

public class CountPairsRunner
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		int i = 0;
		while (i < 11)
		{
			System.out.print("Choose a string you would like to check :: ");
			String string1 = keyboard.nextLine();
			System.out.println( CountPairs.pairCounter(string1) );
			i++;
		}
		//add in all of the provided test cases from the lab handout	
	}
}