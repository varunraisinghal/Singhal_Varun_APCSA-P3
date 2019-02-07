//(c) A+ Computer Science
// www.apluscompsci.com
//Name - Varun Singhal
//Date - 02/01/19

public class Line
{
	public static double getSlope( int x1, int y1, int x2, int y2 )
	{
		double partY = 0;
		double partX = 0;
		double slope = 0;
		partY = y2 - y1;
		partX = x2 - x1;
		slope = partY / partX;
		return slope;
	}

}	