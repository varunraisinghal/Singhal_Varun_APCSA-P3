//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*;

public class Word
{
	private String word;

	public Word()
	{
		setString("");
	}

	public Word(String s)
	{
		setString(s);
	}

	public void setString(String s)
	{
		word = s;
	}

	public char getFirstChar()
	{
		return word.charAt(0);
	}

	public char getLastChar()
	{
		return word.charAt(word.length() - 1);
	}

	public String getBackWards()
	{
		String back = "";
		for (int i = word.length(); i >= 1; i--) 
		{
			back = back + word.substring(i-1, i);
		}
		return back;
	}

 	public String toString()
 	{
 		String output = getFirstChar() + "\n" + getLastChar() + "\n" + getBackWards() + "\n" + word;
 		return output;
	}
}