import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.text.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List

/**
 * A class that represents a picture.  This class inherits from 
 * SimplePicture and allows the student to add functionality to
 * the Picture class.  
 * 
 * @author 
 */
public class Picture extends SimplePicture 
{
  ///////////////////// constructors //////////////////////////////////
  
  /**
   * Constructor that takes no arguments 
   */
  public Picture ()
  {
    /* not needed but use it to show students the implicit call to super()
     * child constructors always call a parent constructor 
     */
    super();  
  }
  
  /**
   * Constructor that takes a file name and creates the picture 
   * @param fileName the name of the file to create the picture from
   */
  public Picture(String fileName)
  {
    // let the parent class handle this fileName
    super(fileName);
  }
  
  /**
   * Constructor that takes the width and height
   * @param height the height of the desired picture
   * @param width the width of the desired picture
   */
  public Picture(int height, int width)
  {
    // let the parent class handle this width and height
    super(width,height);
  }
  
  /**
   * Constructor that takes a picture and creates a 
   * copy of that picture
   * @param copyPicture the picture to copy
   */
  public Picture(Picture copyPicture)
  {
    // let the parent class do the copy
    super(copyPicture);
  }
  
  /**
   * Constructor that takes a buffered image
   * @param image the buffered image to use
   */
  public Picture(BufferedImage image)
  {
    super(image);
  }
  
  ////////////////////// methods ///////////////////////////////////////
  
  /**
   * Method to return a string with information about this picture.
   * @return a string with information about the picture such as fileName,
   * height and width.
   */
  public String toString()
  {
    String output = "Picture, filename " + getFileName() + 
      " height " + getHeight() 
      + " width " + getWidth();
    return output;    
  }
  
  public void encode (Picture messagePict)
  {
	 Pixel[][] messagePixels = messagePict.getPixels2D();
	 Pixel[][] currPixels = this.getPixels2D();
	 Pixel currPixel = null;
	 Pixel messagePixel = null;
	 int count = 0;
	 for (int row = 0; row < this.getHeight(); row++)
	 {
		 for (int col = 0; col < this.getWidth(); col++)
		 {
			 currPixel = currPixels[row][col];
			 int number = currPixel.getRed() * currPixel.getGreen();
			 if ((number % 10) % 2 != 0)
			 {
				 currPixel.setRed(currPixel.getRed() - 1);
				 currPixel.setGreen(currPixel.getGreen() - 1);
			 }
			 messagePixel = messagePixels[row][col];
			 if (messagePixel.colorDistance(Color.BLACK) < 50)
			 {
				 currPixel.setRed(currPixel.getRed() + 1);
				 currPixel.setGreen(currPixel.getGreen() + 1);
				 count++;
			 }
		 }
	 }
	 System.out.println(count);
  }
  
  	public Picture decode()
  	{
  		Pixel[][] pixels = this.getPixels2D();
  		int height = this.getHeight();
  		int width = this.getWidth();
  		Pixel currPixel = null;
  		Pixel messagePixel = null;
		Picture messagePicture = new Picture(height, width);
  		Pixel[][] messagePixels = messagePicture.getPixels2D();
  		int count = 0; 
  		for (int row = 400; row < 430; row++)
  		{
  			for (int col = 240; col < 280; col++)
  			{
  				messagePixel = messagePixels[row][col];
  				messagePixel.setColor(Color.BLACK);
  			}
  		}
  		for (int row = 0; row < this.getHeight(); row++)
  		{
  			for (int col = 0; col < this.getWidth(); col++)
  			{
  				currPixel = pixels[row][col];
  				messagePixel = messagePixels[row][col];
  				int number = currPixel.getRed() * currPixel.getGreen();
  				if ((number % 10) % 2 != 0)
  				{
  					messagePixel.setColor(Color.BLACK);
  				}

  			}
  		}
  		

  		System.out.println(count);
  		return messagePicture;
  	}
  /** Method to set the blue to 0 */
  public void zeroBlue()
  {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        pixelObj.setBlue(0);
      }
    }
  }

  public void keepOnlyBlue()
  {
	  Pixel[][] pixels = this.getPixels2D();
	  for (Pixel[] rowArray : pixels)
	  {
		  for (Pixel pixelObj : rowArray)
		  {
			  pixelObj.setRed(0);
			  pixelObj.setGreen(0);
		  }
	  }
  }
  
  public void keepOnlyRed()
  {
	  Pixel[][] pixels = this.getPixels2D();
	  for (Pixel[] rowArray : pixels)
	  {
		  for (Pixel pixelObj : rowArray)
		  {
			  pixelObj.setBlue(0);
			  pixelObj.setGreen(0);
		  }
	  }
  }
  
  public void keepOnlyGreen()
  {
	  Pixel[][] pixels = this.getPixels2D();
	  for (Pixel[] rowArray : pixels)
	  {
		  for (Pixel pixelObj : rowArray)
		  {
			  pixelObj.setBlue(0);
			  pixelObj.setRed(0);
		  }
	  }
  }
  
  public void chromakey(Picture newBack) 
  {
	  System.out.println("Michelle Zhang");
	  System.out.println("Period 2");
	  System.out.println("5/08/2018");
	  System.out.println("Computer #4");
		
	  Pixel oldPixel = null;
	  Pixel newPixel = null;
	  
	  Pixel[][] pixels = this.getPixels2D();
	  Pixel[][] fromPixels = newBack.getPixels2D();
	  for (int r = 0; r < pixels.length; r++)
	  {
		  for (int c = 0; c < pixels[r].length; c++ )
			 {
			  	if (pixels[r][c].getBlue() > pixels[r][c].getRed())
					{
			  		oldPixel = pixels[r][c];
					newPixel = fromPixels[r][c];
					oldPixel.setColor(newPixel.getColor());
				  	
					}
			 }
	  }
  }
	  
  
  public void negate()
  {
	  Pixel[][] pixels = this.getPixels2D();
	  for (Pixel[] rowArray : pixels)
	  {
		  for (Pixel pixelObj : rowArray)
		  {
			  pixelObj.setRed(255 - pixelObj.getRed());
			  pixelObj.setGreen(255 - pixelObj.getGreen());
			  pixelObj.setBlue(255-pixelObj.getBlue());
		  }
	  }
  }
  
  public void grayscale()
  {  
	  Pixel[][] pixels = this.getPixels2D();
	  for (Pixel[] rowArray : pixels)
	  {
		  for (Pixel pixelObj : rowArray)
		  {
			  int average = (pixelObj.getRed() + pixelObj.getGreen() + pixelObj.getBlue()) / 3;
			  pixelObj.setRed(average);
			  pixelObj.setGreen(average);
			  pixelObj.setBlue(average);
		  }
	  }
  }
  
  public void fixUnderwater() 
  {
	  Pixel[][] pixels = this.getPixels2D();
	  for (Pixel[] rowArray : pixels)
	  {
		  for (Pixel pixelObj : rowArray)
		  {
			  pixelObj.setRed(pixelObj.getRed() + 150);
		  }
	  }
  }
	  
  /** Method that mirrors the picture around a 
    * vertical mirror in the center of the picture
    * from left to right */
  public void mirrorVertical()
  {
    Pixel[][] pixels = this.getPixels2D();
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int width = pixels[0].length;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; col < width / 2; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][width - 1 - col];
        rightPixel.setColor(leftPixel.getColor());
      }
    } 
  }
  
  public void mirrorVerticalRightToLeft()
  {
	Pixel[][] pixels = this.getPixels2D();
	Pixel leftPixel = null;
	Pixel rightPixel = null;
	int width = pixels[0].length;
	for (int row = 0; row < pixels.length; row++)
	{
	  for (int col = 0; col < width / 2; col++)
	  {
	    leftPixel = pixels[row][col];
	    rightPixel = pixels[row][width - 1 - col];
	    leftPixel.setColor(rightPixel.getColor());
	  }
	}
  }
  
  public void mirrorHorizontal()
  {
	 Pixel[][] pixels = this.getPixels2D();
	 Pixel topPixel = null;
	 Pixel bottomPixel = null;
	 int height = pixels.length;
	 for (int row = 0; row < (height/2); row++)
	 {
		 for (int col = 0; col < pixels[0].length; col++)
		 {
			 topPixel = pixels[row][col];
			 bottomPixel = pixels[height - 1 - row][col];
			 bottomPixel.setColor(topPixel.getColor());
		 }
	 }
  }
  
  public void mirrorHorizontalBotToTop()
  {
	 Pixel[][] pixels = this.getPixels2D();
	 Pixel topPixel = null;
	 Pixel bottomPixel = null;
	 int height = pixels.length;
	 for (int row = 0; row < (height/2); row++)
	 {
		 for (int col = 0; col < pixels[0].length; col++)
		 {
			 topPixel = pixels[row][col];
			 bottomPixel = pixels[height - 1- row][col];
			 topPixel.setColor(bottomPixel.getColor());
		 }
	 }
  }
  
  /** Mirror just part of a picture of a temple */
  public void mirrorTemple()
  {
	int count = 0;
    int mirrorPoint = 276;
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    Pixel[][] pixels = this.getPixels2D();
    
    // loop through the rows
    for (int row = 27; row < 97; row++)
    {
      // loop from 13 to just before the mirror point
      for (int col = 13; col < mirrorPoint; col++)
      {
        count++;
        leftPixel = pixels[row][col];      
        rightPixel = pixels[row]                       
                         [mirrorPoint - col + mirrorPoint];
        rightPixel.setColor(leftPixel.getColor());
      }
    }
    
    System.out.print(count);
  }
  
  public void mirrorArms()
  {
	  Pixel topPixel = null;
	  Pixel bottomPixel = null;
	  Pixel[][] pixels1 = this.getPixels2D();
	  
	  int newmirrorPoint = 225;
	  for (int row = 160; row < newmirrorPoint; row++)
	  {
		  for (int col = 243; col < 298; col++)
		  {
			  topPixel = pixels1[row][col];
			  bottomPixel = pixels1[newmirrorPoint - row + newmirrorPoint][col];
			  bottomPixel.setColor(topPixel.getColor());
		  }
	  }

	  Pixel rightPixel = null;
	  Pixel leftPixel = null;
	  Pixel[][]pixels = this.getPixels2D();
	  
	  int mirrorPoint = 206;
	  for (int row = 225; row < 295; row++)
	  {
		  for (int col = mirrorPoint; col < 300; col++)
		  {
			  rightPixel = pixels[row][col];
			  leftPixel = pixels[row][mirrorPoint - col + mirrorPoint];
			  leftPixel.setColor(rightPixel.getColor());
		  }
	  }
	 
  }
  
  public void mirrorGull()
  {
	  Pixel rightPixel = null;
	  Pixel leftPixel = null;
	  Pixel[][] pixels = this.getPixels2D();
	  
	  int mirrorPoint = 365;
	  for (int row = 228; row < 320; row++)
	  {
		  for (int col = 226; col < mirrorPoint; col++)
		  {
			  leftPixel = pixels[row][col];
			  rightPixel = pixels[row][mirrorPoint - col + mirrorPoint];
			  rightPixel.setColor(leftPixel.getColor());
		  }
	  }
  }
  
  public void mirrorDiagonal()
  {
	  Pixel onePixel = null;
	  Pixel twoPixel = null;
	  Pixel [][] pixels = this.getPixels2D();
	  int mirrorPoint = pixels.length;
	  
	  for (int row = 0; row < mirrorPoint; row++)
	  {
		  for (int col = 0; col < mirrorPoint; col++)
		  {
			  onePixel = pixels[row][col];
			  twoPixel = pixels[col][row];
			  onePixel.setColor(twoPixel.getColor());
		  }
	  }
  }
	 
  /** copy from the passed fromPic to the
    * specified startRow and startCol in the
    * current picture
    * @param fromPic the picture to copy from
    * @param startRow the start row to copy to
    * @param startCol the start col to copy to
    */
  public void copy(Picture fromPic, 
                 int startRow, int startCol)
  {
    Pixel fromPixel = null;
    Pixel toPixel = null;
    Pixel[][] toPixels = this.getPixels2D();
    Pixel[][] fromPixels = fromPic.getPixels2D();
    for (int fromRow = 0, toRow = startRow; 
         fromRow < fromPixels.length &&
         toRow < toPixels.length; 
         fromRow++, toRow++)
    {
      for (int fromCol = 0, toCol = startCol; 
           fromCol < fromPixels[0].length &&
           toCol < toPixels[0].length;  
           fromCol++, toCol++)
      {
        fromPixel = fromPixels[fromRow][fromCol];
        toPixel = toPixels[toRow][toCol];
        toPixel.setColor(fromPixel.getColor());
      }
    }   
  }
  
  public void copy1(Picture fromPic, int startRow, int startCol, int endRow, int endCol) 
  {
	Pixel fromPixel = null;
	Pixel toPixel = null;
	Pixel[][] toPixels = this.getPixels2D();
	Pixel[][] fromPixels = fromPic.getPixels2D();
	for (int fromRow = 0, toRow = startRow;
		 fromRow < fromPixels.length && 
		 toRow < endRow;
	     fromRow++, toRow++)
		{
  		for (int fromCol = 0, toCol = startCol;
  			 fromCol < fromPixels[0].length &&
  			 toCol < endCol;
  			 fromCol++, toCol++)
		{
  			fromPixel = fromPixels[fromRow][fromCol];
  			toPixel = toPixels[toRow][toCol];
  			toPixel.setColor(fromPixel.getColor());
  		}
	}
  }
  

  /** Method to create a collage of several pictures */
  public void createCollage()
  {
    Picture flower1 = new Picture("C:\\Users\\singhalv3635\\Documents\\GitHub\\Singhal_Varun_APCSA-P3\\Unit16\\src\\Images\\flower1.jpg");
    Picture flower2 = new Picture("C:\\Users\\singhalv3635\\Documents\\GitHub\\Singhal_Varun_APCSA-P3\\Unit16\\src\\Images\\flower2.jpg");
    this.copy(flower1,0,0);
    this.copy(flower2,100,0);
    this.copy(flower1,200,0);
    Picture flowerNoBlue = new Picture(flower2);
    flowerNoBlue.zeroBlue();
    this.copy(flowerNoBlue,300,0);
    this.copy(flower1,400,0);
    this.copy(flower2,500,0);
    this.mirrorVertical();
    this.write("C:\\Users\\singhalv3635\\Documents\\GitHub\\Singhal_Varun_APCSA-P3\\Unit16\\src\\Images\\collage.jpg");
  }
  
  public void myCollage()
  {
	Picture flower1 = new Picture("C:\\Users\\singhalv3635\\Documents\\GitHub\\Singhal_Varun_APCSA-P3\\Unit16\\src\\Images\\flower1.jpg");
	Picture flower2 = new Picture("C:\\Users\\singhalv3635\\Documents\\GitHub\\Singhal_Varun_APCSA-P3\\Unit16\\src\\Images\\flower2.jpg");
	Picture flower3 = new Picture("C:\\Users\\singhalv3635\\Documents\\GitHub\\Singhal_Varun_APCSA-P3\\Unit16\\src\\Images\\flower1.jpg");
	this.copy(flower1, 0, 0);
	this.copy(flower2, 100, 0);
	Picture flowergrayscale = new Picture(flower1);
	flowergrayscale.grayscale();
	this.copy(flowergrayscale, 200, 0);
	Picture floweronlyblue = new Picture(flower2);
	floweronlyblue.keepOnlyBlue();
	this.copy(floweronlyblue, 300, 0);
	Picture floweronlyred = new Picture(flower3);
	floweronlyred.keepOnlyRed();
	this.copy(floweronlyred, 400, 0);
	this.copy(flower3, 500, 0);
	this.mirrorVertical();
	this.write("C:\\Users\\singhalv3635\\Documents\\GitHub\\Singhal_Varun_APCSA-P3\\Unit16\\src\\Images\\mycollage.jpg");
  }
  
  /** Method to show large changes in color 
    * @param edgeDist the distance for finding edges
    */
  public void edgeDetection(int edgeDist)
  {
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    Pixel topPixel = null;
    Pixel bottomPixel = null;
    Pixel[][] pixels = this.getPixels2D();
    Color rightColor = null;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; 
           col < pixels[0].length-1; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][col+1];
        rightColor = rightPixel.getColor();
        if (leftPixel.colorDistance(rightColor) > 
            edgeDist)
          leftPixel.setColor(Color.BLACK);
        else
          leftPixel.setColor(Color.WHITE);
      }
    }
    
    Color bottomColor = null;
    for (int row = 0; row < pixels.length; row++)
    {
    	for (int col = 0; col < pixels[0].length - 1; col++)
    	{
    		topPixel = pixels[row][col];
    		bottomPixel = pixels[row][col + 1];
    		bottomColor = bottomPixel.getColor();
    		if (topPixel.colorDistance(bottomColor) > edgeDist)
    		{
    			topPixel.setColor(Color.BLACK);
    		}
    		else
    		{
    			bottomPixel.setColor(Color.WHITE);
    		}
    	}
    }
  } 
  
  
  
  /* Main method for testing - each class in Java can have a main 
   * method 
   */
  public static void main(String[] args) 
  {
    Picture beach = new Picture("C:\\Users\\singhalv3635\\Documents\\GitHub\\Singhal_Varun_APCSA-P3\\Unit16\\src\\Images\\beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
}


  