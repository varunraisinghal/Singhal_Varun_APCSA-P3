//(c) A+ Computer Science 
//www.apluscompsci.com

//Name - Varun Singhal
//Date - 02/04/19
//Class - AP Comp Sci A
//Lab  - 3

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class DistanceRunner
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		out.print("Enter X1:: ");
		int xOne = keyboard.nextInt();
		out.print("Enter Y1:: ");
		int yOne = keyboard.nextInt();
		out.print("Enter X2:: ");
		int xTwo = keyboard.nextInt();
		out.print("Enter Y2:: ");
		int yTwo = keyboard.nextInt();
		
		Distance test = new Distance();
		test.setCoordinates(xOne, yOne, xTwo, yTwo);
		test.calcDistance();
		test.print();
		
		
		out.print("Enter X1:: ");
		int xOne1 = keyboard.nextInt();
		out.print("Enter Y1:: ");
		int yOne1 = keyboard.nextInt();
		out.print("Enter X2:: ");
		int xTwo1 = keyboard.nextInt();
		out.print("Enter Y2:: ");
		int yTwo1 = keyboard.nextInt();
		
		Distance test1 = new Distance();
		test1.setCoordinates(xOne1, yOne1, xTwo1, yTwo1);
		test1.calcDistance();
		test1.print();
		
		
		out.print("Enter X1:: ");
		int xOne2 = keyboard.nextInt();
		out.print("Enter Y1:: ");
		int yOne2 = keyboard.nextInt();
		out.print("Enter X2:: ");
		int xTwo2 = keyboard.nextInt();
		out.print("Enter Y2:: ");
		int yTwo2 = keyboard.nextInt();
		
		
		Distance test2 = new Distance();
		test2.setCoordinates(xOne2, yOne2, xTwo2, yTwo2);
		test2.calcDistance();
		test2.print();
			
	}
}