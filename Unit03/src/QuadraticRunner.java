//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class QuadraticRunner
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter a: ");
		int a = keyboard.nextInt();
		
		System.out.print("Enter b: ");
		int b = keyboard.nextInt();
		
		System.out.print("Enter c: ");
		int c = keyboard.nextInt();		
		
		Quadratic Quad = new Quadratic(a, b, c); 
		Quad.calcRoots();
		Quad.print();
	
//		Quadratic Quad1 = new Quadratic(); 
//		Quad1.setEquation(a, b, c);
//		Quad1.calcRoots();
//		Quad1.print();
//		
	}
}