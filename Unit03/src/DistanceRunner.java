//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class DistanceRunner
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter X1:: ");
		int xOne = keyboard.nextInt();
		System.out.println("Enter Y1:: ");
		int yOne = keyboard.nextInt();
		System.out.println("Enter X2:: ");
		int xTwo = keyboard.nextInt();
		System.out.println("Enter Y2:: ");
		int yTwo = keyboard.nextInt();
		
		Distance test = new Distance();
		test.setCoordinates(xOne, yOne, xTwo, yTwo);
		test.calcDistance();
		test.print();
		
		
		System.out.println("Enter X1:: ");
		int xOne1 = keyboard.nextInt();
		System.out.println("Enter Y1:: ");
		int yOne1 = keyboard.nextInt();
		System.out.println("Enter X2:: ");
		int xTwo1 = keyboard.nextInt();
		System.out.println("Enter Y2:: ");
		int yTwo1 = keyboard.nextInt();
		
		Distance test1 = new Distance();
		test1.setCoordinates(xOne1, yOne1, xTwo1, yTwo1);
		test1.calcDistance();
		test1.print();
		
		
		System.out.println("Enter X1:: ");
		int xOne2 = keyboard.nextInt();
		System.out.println("Enter Y1:: ");
		int yOne2 = keyboard.nextInt();
		System.out.println("Enter X2:: ");
		int xTwo2 = keyboard.nextInt();
		System.out.println("Enter Y2:: ");
		int yTwo2 = keyboard.nextInt();
		
		
		Distance test2 = new Distance();
		test2.setCoordinates(xOne2, yOne2, xTwo2, yTwo2);
		test2.calcDistance();
		test2.print();
			
	}
}