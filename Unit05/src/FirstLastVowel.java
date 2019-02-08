//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Varun Singhal
//Date - 02/08/19


public class FirstLastVowel
{
   public static String go( String a )
	{
	   String str = a.toLowerCase();
	   if (str.startsWith("a") || str.startsWith("e") || str.startsWith("i") || str.startsWith("o") || str.startsWith("u") || str.endsWith("a") || str.endsWith("e") || str.endsWith("i") || str.endsWith("o") || str.endsWith("u"))
	   {
		   return "yes";
	   }
		return "no";
	}
}