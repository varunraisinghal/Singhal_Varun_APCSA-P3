//(c) A+ Computer Science
// www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class Quadratic
{
	private int a, b, c;
	private double rootOne;
	private double rootTwo;

	public Quadratic()
	{
		
	}

	public Quadratic(int quadA, int quadB, int quadC)
	{
		a = quadA;
		b = quadB;
		c = quadC;
	}

	public void setEquation(int quadA, int quadB, int quadC)
	{
		a = quadA;
		b = quadB;
		c = quadC;
 	}

	public void calcRoots( )
	{
		if ((a == b) && (b== c) && (c == 0))
		{
	    	System.out.println("Quadratic variables not initialized"); 			
		}
		else if (a ==0)
		{
	    	System.out.println("Quadratic variables - Divide by zero not permitted (a = 0)"); 	
		}
		else
		{
			rootOne = (-b + Math.sqrt(b*b-4*a*c))/(2*a);
				
			rootTwo = (-b - Math.sqrt(b*b-4*a*c))/(2*a);
		}
		
	}

    public void print()
    {
    	System.out.println("root One is : " + rootOne);
    	System.out.println("root Two is : " + rootTwo);    	
    	
    }
    
    //complete either print or the toString()

	public String toString()
	{
		return "";
	}
}