//(c) A+ Computer Science
// www.apluscompsci.com
//Name - Varun Singhal

import static java.lang.System.*;

public class Triples
{
   private int number;

	public Triples()
	{
		setNum(0);
	}

	public Triples(int num)
	{
		setNum(num);
	}

	public void setNum(int num)
	{
		number = num;
	}
	
	private int greatestCommonFactor(int a, int b, int c)
	{
		int max = 1;
		for (int i = 1; i <= c; i++) 
		{
			if ( (a % i == 0) && (b % i == 0) && (c % i == 0))
			{
				if (i > max) 
				{
					max = i;
				}
				else
				{
					
				}
			}
			else
			{
				
			}
		}
		return max;	
	}

	public String toString()
	{
		String output = "";
		for (int a = 1; a <= number; a++) 
		{
			for (int b = 1; b <= number; b++)
			{
				for (int c = 1; c <= number; c++)
				{
					if (a <= b) 
					{
						if (((a % 2 == 0) && (b % 2 == 1)) || ((a % 2 == 1) && (b % 2 ==0)))
						{
							if (greatestCommonFactor(a,b,c) == 1)
							{
								if (a*a + b*b == c*c)
								{
									output += ""+a + " " + b + " " + c +"" + "\n";
								}
							}
						}
					}
				}
			}
		}
		
		return output + "\n";
	








	}
}