//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;

public class Paddle extends Block
{
   //instance variables
   private int speed;

   public Paddle()
   {
	  super(10,10);
      speed =5;
   }
   
 //add the other Paddle constructors

   public Paddle(int x, int y) {
	   super(x, y);
   }

   public Paddle(int x, int y, int w, int h) {
	   super(x, y, w, h);
   }
   
   public Paddle(int x, int y, int thes) {
	   super(x, y);
	   setSpeed(thes);
   }
   
   public Paddle(int x, int y, int w, int h, int thes) {
	   super(x, y, w, h);
	   setSpeed(thes);
   }
   
   public Paddle(int x, int y, int w, int h, Color a, int thes) {
	   super(x, y, w, h, a);
	   setSpeed(thes);
   }
   
   public void setSpeed (int s) {
	   speed = s;
   }

   public void moveUpAndDraw(Graphics window)
   {
	   draw(window, Color.WHITE);
	   setPos(getX(), getY() - getSpeed());
	   draw(window, getColor());
   }

   public void moveDownAndDraw(Graphics window)
   {
	   draw(window, Color.WHITE);
	   setPos(getX(), getY() + getSpeed());
	   draw(window, getColor());
   }

   public int getSpeed() {
	   return speed;
   }
   
 //add a toString() method
   public String toString() {
	   
	 return this.getX() + " " + this.getY() + " " + this.getWidth() 
		+ " " + this.getHeight() + " " + this.getColor() 
		+ " " +  speed;
}
}