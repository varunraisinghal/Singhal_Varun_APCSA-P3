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
   
   public Paddle(int x, int y){
	   super(x,y);
	   speed = 5;
   }

   public Paddle(int x, int y, int spd){
	   super(x,y);
	   speed = spd;
   }
   
   public Paddle(int x, int y, int width, int height, int spd){
	   super(x,y,width,height);
	   speed = spd;
   }
   
   public Paddle(int x, int y, int width, int height, Color col, int spd){
	   super(x,y,width,height,col);
	   speed = spd;
   }
   //add the other Paddle constructors



   public void moveUpAndDraw(Graphics window)
   {
	   draw(window,Color.WHITE);
			//setY
	   setY(getY()-speed);
			//draw the ball at its new location
	   draw(window);

   }

   public void moveDownAndDraw(Graphics window)
   {
	   draw(window,Color.WHITE);
		//setY
	   setY(getY()+speed);
		//draw the ball at its new location
	   draw(window);

   }

   //add get methods
   public int getSpeed(){
	   return speed;
   }
   
   public boolean equals(Object obj)
	{
		if(super.equals((Paddle) obj) && getSpeed() == ((Paddle) obj).getSpeed()){
			return true;
		}
		return false;
	}   

   
   //add a toString() method
   public String toString(){
		String output = super.toString() + " " + getSpeed();
		return output;
	}
}