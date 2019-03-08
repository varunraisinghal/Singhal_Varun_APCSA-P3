//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Varun Singhal
//Date - 03/08/19

import java.util.List;
import java.util.ArrayList;

public class ListDown
{
	//go() will return true if all numbers in numArray
	//are in decreasing order [31,12,6,2,1]
	public static boolean go(List<Integer> numArray)
	{
		
		int i = 0;
		while(i < numArray.size() - 1)
		{
			if(numArray.get(i + 1) >= numArray.get(i))
			{
				return false;
			}
			i++;
		}

		return true;
	}	
}