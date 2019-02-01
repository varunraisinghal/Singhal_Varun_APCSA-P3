//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Varun Singhal
//Date - 02/01/19

public class Rect
{
	public static double perimeter( int length, int width )
	{
		int perimeter = 0;
		perimeter = (int) 2 * length;
		perimeter = perimeter + (int) 2 * width;
		return perimeter;
	}
}