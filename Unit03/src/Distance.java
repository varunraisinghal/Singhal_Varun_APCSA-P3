//(c) A+ Computer Science 
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class Distance
{
	private int xOne,yOne,xTwo,yTwo;
	private double distance;

	public Distance()
	{
		xOne = 0;
		yOne = 0;
		xTwo = 0;
		yTwo = 0;
	}

	public Distance(int x1, int y1, int x2, int y2)
	{
		setCoordinates(0,0,0,0);
		distance = 0.0;
	}

	public void setCoordinates(int x1, int y1, int x2, int y2)
	{
		xOne = x1;
		yOne = y1;
		xTwo = x2;
		yTwo = y2;
	}

	public void calcDistance()
	{
		int xPortion = xOne - xTwo; 
		xPortion = (int) Math.pow(xPortion, 2);
		
		int yPortion = yOne - yTwo;
		yPortion = (int) Math.pow(yPortion, 2);
		distance = Math.sqrt(xPortion + yPortion); 
	}
	
	public double getDistance()
	{
		return distance;
	}
	
	public void print()
	{
		System.out.println("distance == " + String.format("%.3f",getDistance()) + "\n");
	}
	
	//complete print or the toString

	public String toString()
	{
		return "";
	}
}