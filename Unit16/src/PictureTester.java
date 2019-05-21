/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("C:\\Users\\singhalv3635\\Documents\\GitHub\\Singhal_Varun_APCSA-P3\\Unit16\\src\\Images\\beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
  public static void testKeepOnlyBlue()
  {
	  Picture beach = new Picture("C:\\Users\\singhalv3635\\Documents\\GitHub\\Singhal_Varun_APCSA-P3\\Unit16\\src\\Images\\beach.jpg");
	  beach.explore();
	  beach.keepOnlyBlue();
	  beach.explore();
  }
  
  public static void testKeepOnlyRed()
  {
	  Picture beach = new Picture("C:\\Users\\singhalv3635\\Documents\\GitHub\\Singhal_Varun_APCSA-P3\\Unit16\\src\\Images\\beach.jpg");
	  beach.explore();
	  beach.keepOnlyRed();
	  beach.explore();			  
  }
  
  public static void testKeepOnlyGreen()
  {
	  Picture beach = new Picture("C:\\Users\\singhalv3635\\Documents\\GitHub\\Singhal_Varun_APCSA-P3\\Unit16\\src\\Images\\beach.jpg");
	  beach.explore();
	  beach.keepOnlyGreen();
	  beach.explore();
  }
  
  public static void testNegate()
  {
	  Picture beach = new Picture("C:\\Users\\singhalv3635\\Documents\\GitHub\\Singhal_Varun_APCSA-P3\\Unit16\\src\\Images\\beach.jpg");
	  beach.explore();
	  beach.negate();
	  beach.explore();
  }
  
  public static void testGrayscale()
  {
	  Picture beach = new Picture("C:\\Users\\singhalv3635\\Documents\\GitHub\\Singhal_Varun_APCSA-P3\\Unit16\\src\\Images\\beach.jpg");
	  beach.explore();
	  beach.grayscale();
	  beach.explore();
  } 
  
  public static void testFixUnderwater()
  {
	  Picture water = new Picture("C:\\Users\\singhalv3635\\Documents\\GitHub\\Singhal_Varun_APCSA-P3\\Unit16\\src\\Images\\water.jpg");
	  water.explore();
	  water.fixUnderwater();
	  water.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("C:\\Users\\singhalv3635\\Documents\\GitHub\\Singhal_Varun_APCSA-P3\\Unit16\\src\\Images\\caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
  public static void testMirrorVerticalRightToLeft()
  {
	  Picture caterpillar = new Picture("C:\\Users\\singhalv3635\\Documents\\GitHub\\Singhal_Varun_APCSA-P3\\Unit16\\src\\Images\\caterpillar.jpg");
	  caterpillar.explore();
	  caterpillar.mirrorVerticalRightToLeft();
	  caterpillar.explore();
  }
  
  public static void testMirrorHorizontal()
  {
	  Picture motorcycle = new Picture("C:\\Users\\singhalv3635\\Documents\\GitHub\\Singhal_Varun_APCSA-P3\\Unit16\\src\\Images\\redMotorcycle.jpg");
	  motorcycle.explore();
	  motorcycle.mirrorHorizontal();
	  motorcycle.explore();
  }
  
  public static void testMirrorHorizontalBotToTop()
  {
	  Picture motorcycle = new Picture("C:\\Users\\singhalv3635\\Documents\\GitHub\\Singhal_Varun_APCSA-P3\\Unit16\\src\\Images\\redMotorcycle.jpg");
	  motorcycle.explore();
	  motorcycle.mirrorHorizontalBotToTop();
	  motorcycle.explore();
  }
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("C:\\Users\\singhalv3635\\Documents\\GitHub\\Singhal_Varun_APCSA-P3\\Unit16\\src\\Images\\temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  public static void testMirrorArms()
  {
	  Picture snowman = new Picture("C:\\Users\\singhalv3635\\Documents\\GitHub\\Singhal_Varun_APCSA-P3\\Unit16\\src\\Images\\snowman.jpg");
	  snowman.explore();
	  snowman.mirrorArms();
	  snowman.explore();
  }
  
  public static void testMirrorGull()
  {
	  Picture seagull = new Picture("C:\\Users\\singhalv3635\\Documents\\GitHub\\Singhal_Varun_APCSA-P3\\Unit16\\src\\Images\\seagull.jpg");
	  seagull.explore();
	  seagull.mirrorGull();
	  seagull.explore();
  }
  
  public static void testMirrorDiagonal()
  {
	  Picture beach = new Picture("C:\\Users\\singhalv3635\\Documents\\GitHub\\Singhal_Varun_APCSA-P3\\Unit16\\src\\Images\\beach.jpg");
	  beach.explore();
	  beach.mirrorDiagonal();
	  beach.explore();
  }
  
  public static void testCopy()
  {
	  Picture flower1 = new Picture("C:\\Users\\singhalv3635\\Documents\\GitHub\\Singhal_Varun_APCSA-P3\\Unit16\\src\\Images\\flower1.jpg");
	  flower1.explore();
	  flower1.copy(flower1, 10, 40);
	  flower1.explore();
  }
  
  public static void testCopy1()
  {
	  Picture flower1 = new Picture("C:\\Users\\singhalv3635\\Documents\\GitHub\\Singhal_Varun_APCSA-P3\\Unit16\\src\\Images\\flower1.jpg");
	  flower1.explore();
	  flower1.copy1(flower1, 10, 40, 30, 50);
	  flower1.explore();
  }
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("C:\\Users\\singhalv3635\\Documents\\GitHub\\Singhal_Varun_APCSA-P3\\Unit16\\src\\Images\\640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  public static void testMyCollage()
  {
	  Picture canvas = new Picture("C:\\Users\\singhalv3635\\Documents\\GitHub\\Singhal_Varun_APCSA-P3\\Unit16\\src\\Images\\640x480.jpg");
	  canvas.myCollage();
	  canvas.explore();			  
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("C:\\Users\\singhalv3635\\Documents\\GitHub\\Singhal_Varun_APCSA-P3\\Unit16\\src\\Images\\swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  
  public static void testChromakey()
  {
	Picture mark = new Picture("C:\\Users\\singhalv3635\\Documents\\GitHub\\Singhal_Varun_APCSA-P3\\Unit16\\src\\Images\\blue-mark.jpg");
  	Picture moon = new Picture("C:\\Users\\singhalv3635\\Documents\\GitHub\\Singhal_Varun_APCSA-P3\\Unit16\\src\\Images\\moon-surface.jpg");
  	mark.chromakey(moon); 
 	mark.explore();
  }
  
  public static void testEncodeandDecode1()
  {
	  Picture beach = new Picture("C:\\Users\\Varun Singhal\\Documents\\GitHub\\-Singhal_Varun_APCSA-P3\\Unit16\\src\\Images\\beach.jpg");
	  Picture message = new Picture("C:\\Users\\Varun Singhal\\Documents\\GitHub\\-Singhal_Varun_APCSA-P3\\Unit16\\src\\Images\\msg.jpg");
	  beach.explore();
	  beach.encode(message);
	  beach.explore();
	  beach.decode().explore();
  }
  
  public static void testEncodeandDecode2()
  {
	  Picture beach = new Picture("C:\\Users\\Varun Singhal\\Documents\\GitHub\\-Singhal_Varun_APCSA-P3\\Unit16\\src\\Images\\beach.jpg");
	  Picture apple1 = new Picture("C:\\Users\\Varun Singhal\\Documents\\GitHub\\-Singhal_Varun_APCSA-P3\\Unit16\\src\\Images\\apple1.jpg");
	  Picture smallApple1 = apple1.scale(0.4,0.54);
	  beach.explore();
	  smallApple1.explore();
	  beach.encode(smallApple1);
	  beach.explore();
	  beach.decode().explore();;
  }

  /** Main method for testing.  Every class can have a main
    * method in Java */
  
  public static void main(String[] args)
  {
	  
	 //testChromakey();
	  testEncodeandDecode1();
	 testEncodeandDecode2();
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    //testZeroBlue(); 
    //testKeepOnlyBlue(); 
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
    //testGrayscale();
    //testFixUnderwater();
    //testMirrorVertical();
	//testMirrorVerticalRightToLeft();
	//testMirrorHorizontal();
	//testMirrorHorizontalBotToTop();
    //testMirrorTemple();
    //testMirrorArms();
    //testMirrorGull();
    //testMirrorDiagonal();
    //testCollage();
    //testMyCollage();
    //testCopy();
    //testCopy1();
    //testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
	  
  }
}