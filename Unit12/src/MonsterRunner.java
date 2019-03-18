//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class MonsterRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		
		//ask for name and size
		System.out.print("Enter 1st Monster's Name : ");
		String monsterName1 = keyboard.next();
		
		System.out.print("Enter 1st Monster's Size : ");
		int monsterSize1 = keyboard.nextInt();
		//instantiate monster one
		Monster monster1 = new Skeleton(monsterName1, monsterSize1);
		//ask for name and size
		System.out.print("Enter 2nd Monster's Name : ");
		String monsterName2 = keyboard.next();
		
		System.out.print("Enter 2nd Monster's Size : ");
		int monsterSize2 = keyboard.nextInt();
		//instantiate monster two
		Monster monster2 = new Skeleton(monsterName2, monsterSize2);
		
		out.print("Monster 1 - " + monsterName1 + " " + monsterSize1);
		out.print("\nMonster 2 - " + monsterName2 + " " + monsterSize2);
		out.print("\n");
		if (monster1.isBigger(monster2))
		{
			out.println("Monster one is bigger than Monster two.");
		}
		if (monster1.isSmaller(monster2))
		{
			out.println("Monster one is smaller than Monster two.");
		}
		if (monster1.namesTheSame(monster2) == true)
		{
			out.println("Monster one has the same name as Monster two.");
		}
		if (monster1.namesTheSame(monster2) == false)
		{
			out.println("Monster one does not have the same name as Monster two.");
		}
	}
}