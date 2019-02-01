//© A+ Computer Science  -  www.apluscompsci.com
//Name - Varun Singhal
//Date - 02/01/19
//Class - AP Comp Sci A
//Lab  - 3

public class Cone
{
	public static double volume( double radius, int height)
	{	
		double volume = 0;
		volume = radius * radius;
		volume = volume * height;
		volume = volume * Math.PI;
		volume = volume / (int) 3;
		return volume;
	}
}