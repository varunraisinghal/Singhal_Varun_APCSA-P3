//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*;

import java.util.Scanner;

public class WordRunner
{
	public static void main ( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		int x = 0;
		
		while (x < 5)
		{
			System.out.print("Enter a word :: ");
			String str = keyboard.nextLine();
			
			Word s = new Word(str);
			
			System.out.println(s.toString() + "\n");
			x++;
		}

	}
}