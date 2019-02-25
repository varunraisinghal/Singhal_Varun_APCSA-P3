//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Varun Singhal
//Date - 02/25/19

public class DownRunner
{
	public static void main( String args[] )
	{	
		RayDown a = new RayDown();
		int array[] = {-99,1,2,3,4,5,6,7,8,9,10,123455};
		System.out.println(RayDown.go(array));
		
		int array1[] = {10,9,8,7,6,5,4,3,2,1,-99};
		System.out.println(RayDown.go(array1));
		
		int array2[] = {10,20,30,40,50,-11818,40,30,20,10};
		System.out.println(RayDown.go(array2));
		
		int array3[] = {32767};
		System.out.println(RayDown.go(array3));
		
		int array4[] = {255,255};
		System.out.println(RayDown.go(array4));
		
		int array5[] = {9,10,-88,100,-555,1000};
		System.out.println(RayDown.go(array5));
		
		int array6[] = {10,10,10,11,456};
		System.out.println(RayDown.go(array6));
		
		int array7[] = {-111,1,2,3,9,11,20,30};
		System.out.println(RayDown.go(array7));
		
		int array8[] = {9,8,7,6,5,4,3,2,0,-2,-989};
		System.out.println(RayDown.go(array8));
		
		int array9[] = {12,15,18,21,23,1000};
		System.out.println(RayDown.go(array9));
		
		int array10[] = {250,19,17,15,13,11,10,9,6,3,2,1,-455};
		System.out.println(RayDown.go(array10));
		
		int array11[] = {9,10,-8,10000,-5000,1000};
		System.out.println(RayDown.go(array11));
		
		
	}
}