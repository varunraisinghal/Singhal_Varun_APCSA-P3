	//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

import java.util.Scanner;

public class ToyRunner
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
	   	String choice="";
			do
			{
				out.print("Enter the toy:: ");
				String toy = keyboard.nextLine();
		
				out.print("Enter the count:: ");
	 			int count = keyboard.nextInt();			

				System.out.println(toy + " " + count);
				System.out.print("\nDo you want to enter another toy? ");
				choice=keyboard.next();
				System.out.print("\n");
				keyboard.nextLine();
				
			}while(choice.equals("Y")||choice.equals("y"));		
	}
}