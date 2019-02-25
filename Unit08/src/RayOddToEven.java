//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RayOddToEven
{
	public static int go(int[] ray)
	{
		
		for (int i = 0; i < ray.length; i++)
		{
			if ((ray[i] % 2) == 1)
			{
				for (int a = 1; a < ray.length; a++)
				{
					if ((ray[a] % 2) == 0)
					{
						int num = a - i;
						return Math.abs(num);
					}
				}
			}
		}
		return -1;

	}
}