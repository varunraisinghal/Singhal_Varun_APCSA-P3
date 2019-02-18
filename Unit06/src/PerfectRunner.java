//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

import java.util.Scanner; 

public class PerfectRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		int x = 0;

		while (x < 10)
			{
				System.out.print("Enter a number :: ");
				int num = keyboard.nextInt();
				Perfect s = new Perfect(num);
				s.isPerfect();
				System.out.println(s.toString() + "\n");
				x++;
			}
				
	}
}