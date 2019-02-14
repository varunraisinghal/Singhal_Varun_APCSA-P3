//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class LetterRemoverRunner
{
	public static void main( String args[] )
	{
		LetterRemover s = new LetterRemover();
		s.setRemover("I am Sam I am", 'a');
		s.removeLetters();
		System.out.print(s);
											
	}
}