//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Varun Singhal
//Date - 03/08/19

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class DownRunner
{
	public static void main( String args[] )
	{											
		ArrayList<Integer>test;
		test = new ArrayList<Integer>();
		
		int[] list = new int[] {-99,1,2,3,4,5,6,7,8,9,10,12345};
		for(int n = 0; n < list.length; n++)
		{
			test.add(list[n]);
		}
		System.out.println(ListDown.go(test));
		
		test.clear();
		
		int[] list1 = new int[] {10,9,8,7,6,5,4,3,2,1,-99};
		for(int n = 0; n < list1.length; n++)
		{
			test.add(list1[n]);		
		}
		System.out.println(ListDown.go(test));
		
		test.clear();
		
		int[] list2 = new int[] {10,20,30,40,50,-11818,40,30,20,10};
		for(int n = 0; n < list2.length; n++) 
		{
			test.add(list2[n]);		
		}
		System.out.println(ListDown.go(test));
		
		test.clear();
		
		int[] list3 = new int[] {32767};
		for(int n = 0; n < list3.length; n++)
		{
			test.add(list3[n]);		
		}
		System.out.println(ListDown.go(test));
				
		test.clear();
		
		int[] list4 = new int[] {255,255};
		for(int n = 0; n < list4.length; n++)
		{
			test.add(list4[n]);		
		}
		System.out.println(ListDown.go(test));
		
		test.clear();
		
		int[] list5 = new int[] {9,10,-88,100,-555,1000};
		for(int n = 0; n < list5.length; n++)
		{
			test.add(list5[n]);		
		}
		System.out.println(ListDown.go(test));
		
		test.clear();
		
		int[] list6 = new int[] {10,10,10,11,456};
		for(int n = 0; n < list6.length; n++)
		{
			test.add(list6[n]);		
		}
		System.out.println(ListDown.go(test));
		
		test.clear();
		
		int[] list7 = new int[] {-111,1,2,3,9,11,20,30};
		for(int n = 0; n < list7.length; n++)
		{
			test.add(list7[n]);		
		}
		System.out.println(ListDown.go(test));
		
		test.clear();
		
		int[] list8 = new int[] {9,8,7,6,5,4,3,2,0,-2,-989};
		for(int n = 0; n < list8.length; n++)
		{
			test.add(list8[n]);		
		}
		System.out.println(ListDown.go(test));
		
		test.clear();
		
		int[] list9 = new int[] {12,15,18,21,23,1000};
		for(int n = 0; n < list9.length; n++)
		{
			test.add(list9[n]);		
		}
		System.out.println(ListDown.go(test));
		
		test.clear();
		
		int[] list10 = new int[] {250,19,17,15,13,11,10,9,6,3,2,1,-455};
		for(int n = 0; n < list10.length; n++)
		{
			test.add(list10[n]);		
		}
		System.out.println(ListDown.go(test));
		
		test.clear();
		
		int[] list11 = new int[] {9,10,-8,10000,-5000,1000};
		for(int n = 0; n < list11.length; n++)
		{
			test.add(list11[n]);		
		}
		System.out.println(ListDown.go(test));
	}
}