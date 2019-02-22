//(c) A+ Computer Science
// www.apluscompsci.com
//Name - Varun Singhal  

import static java.lang.System.*;

import java.util.Scanner;

public class TriplesRunner
{
   public static void main(String args[])
   {
		Scanner keyboard = new Scanner(System.in);
		
		int x = 0;
		
		while (x < 1)
		{
			out.print("Enter a number :: ");
			int num = keyboard.nextInt();
			
			Triples s = new Triples(num);
			out.print(s.toString());
			x++;
		}

   }
}