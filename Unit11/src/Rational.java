//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 

class Rational implements Comparable<Rational>
{
	//add two instance variables
	private int numerator1;
	private int denominator1;

	//write two constructors
	public Rational()
	{
		numerator1 = 1;
		denominator1 = 1;
	}
	
	public Rational(int n, int d)
	{
		setRational(n,d);
	}

	//write a setRational method
	public void setRational(int n, int d)
	{
		setNumerator(n);
		setDenominator(d);
	}

	//write  a set method for numerator and denominator
	public void setNumerator(int n)
	{
		numerator1 = n;
	}
	
	public void setDenominator(int d)
	{
		denominator1 = d;
	}
	
	public void add(Rational other)
	{
		//num1/den1 + num2/den2 
		//new numerator = (num1 * den2 + num2 * den1)
		//new denominator = (den1 * den2)
		int numerator = (numerator1 * other.denominator1 + other.numerator1 * denominator1);
		int denominator = (denominator1 * other.denominator1);
		numerator1 = numerator;
		denominator1 = denominator;
		reduce();

	}

	private void reduce()
	{
		int gcd = gcd(numerator1,denominator1);
		numerator1 /= gcd;
		denominator1 /= gcd;

	}

	private int gcd(int numOne, int numTwo)
	{
		int lower = 0;
		int gcd = 1;
		if(numOne > numTwo)
		{
			lower = numTwo;
		}
		else 
		{
			lower = numOne;
		}
		for(int i = 1; i <= lower; i++) 
		{
			if(numOne % i == 0 && numTwo % i == 0) 
			{
				gcd = i;
			}
		}
		return gcd;
	}

	public Object clone ()
	{
		return this;
	}


	//ACCESSORS

	//write get methods for numerator and denominator
	public int getNumerator() 
	{
		return numerator1;
	}
	public int getDenominator()
	{
		return denominator1;
	}
	
	public boolean equals( Object obj )
	{
		if(obj == null)
		{
			return false;
		}
		if(obj == this) 
		{
			return true;
		}
		if(obj instanceof Rational)
		{
			Rational compare = (Rational) obj;
			return compare.getDenominator() == denominator1 && compare.getNumerator() == numerator1;
		}
		return false;
	}

	public int compareTo(Rational other)
	{
		if(equals(other))
		{
			return 0;
		}
		
		double total = (double)numerator1/denominator1;
		double otherTotal = (double)other.numerator1/other.denominator1;
		if(otherTotal < total) 
		{
			return 1;
		}
		return -1;
	}

	public String toString() 
	{
		return numerator1 + "/" + denominator1;
	}
}