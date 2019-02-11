//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

import java.util.Scanner;

public class WordsCompareRunner
{
   public static void main( String args[] )
   {
	   Scanner keyboard = new Scanner(System.in);
	   WordsCompare test = new WordsCompare("abe","ape");
	   
	   int x = 0;
	   while (x < 8)
	   {
		   out.print("Word one :: ");
		   String string1 = keyboard.nextLine();
		   
		   out.print("Word two :: ");
		   String string2 = keyboard.nextLine();
		   
		   test.setWords(string1, string2);
		   test.compare();
		   out.println( test.toString() );
		   x++;
	   }


	}
}