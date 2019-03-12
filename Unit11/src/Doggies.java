//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;

public class Doggies
{
	private Dog[] pups;


	public Doggies(int size)
	{
		pups = new Dog[size];
	}
	
	public void set(int spot, int age, String name)
	{
		Dog bigDumb = new Dog(age, name);
		if ( 0 < spot && spot < pups.length -1 )
		{
			pups[spot] = bigDumb;
		}
		//put a new Dog in the array at spot 
		//make sure spot is in bounds		
	}

	public String getNameOfOldest()
	{
		int dogChecker = 0;
		for (int i = 0; i < pups.length; i++)
		{
			if (pups[dogChecker].getAge() < pups[i].getAge())
			{
				dogChecker = i;
			}
		}
		return pups[dogChecker].getName();
	}

	public String getNameOfYoungest()
	{
		int dogChecker = 0;
		for (int i = 0; i < 1; i++)
		{
			if (pups[dogChecker].getAge() > pups[i].getAge())
			{
				dogChecker = i;
			}
		}
		return pups[dogChecker].getName();
	}

	public String toString()
	{
		return ""+Arrays.toString(pups);
	}
}