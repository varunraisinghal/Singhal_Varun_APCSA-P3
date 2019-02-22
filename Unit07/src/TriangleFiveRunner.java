//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

import java.util.Scanner;

public class TriangleFiveRunner
{
   public static void main(String args[])
   {
		Scanner keyboard = new Scanner(System.in);
		
		int x = 0;
		
		while (x < 5)
		{
			out.print("Enter a letter :: ");
			String letter = keyboard.next();
			char c = letter.charAt(0);
			
			out.print("Enter an amount :: ");
			int amt = keyboard.nextInt();
			
			TriangleFive s = new TriangleFive(c, amt);
			out.print(s.toString());
			out.print("\n");
			x++;
		}

   }
   
}