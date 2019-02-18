//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*;

import java.util.Scanner;

public class TriangleOneRunner
{
	public static void main ( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		int x = 0;
		while (x < 5)
		{
			System.out.print("Enter a word :: ");
			String str = keyboard.nextLine();
			
			TriangleOne s = new TriangleOne(str);
			
			s.print();
			System.out.println();
			x++;
		}

	}
}