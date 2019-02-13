//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class LetterRemover
{
   private String sentence;
   private char lookFor;

	public LetterRemover()
	{
		setRemover("",' ');
	}
	
	public LetterRemover(String s, char rem)
	{
		setRemover(s, rem);
	}

	public void setRemover(String s, char rem)
	{
		sentence = s;
		lookFor = rem;
	}

	public String removeLetters()
	{
		int i = 0;
		String cleaned = sentence;
		while (i < cleaned.length())
		{
			
		}

		return cleaned;
	}

	public String toString()
	{
		return sentence + " - letter to remove " + lookFor;
	}
}