//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;

public class Ball extends Block implements Collidable
{
	private int xSpeed;
	private int ySpeed;


	//add the other Ball constructors
	public Ball()
	{
		super(200,200);
		xSpeed = 3;
		ySpeed = 1;
	}
	
	public Ball(int x, int y)
	{
		super(x,y);
		xSpeed = 3;
		ySpeed = 1;
	}
	
	public Ball(int x, int y, int width, int height)
	{
		super(x,y,width,height);
		xSpeed = 3;
		ySpeed = 1;
		setColor(Color.RED);
	}
	
	public Ball(int x, int y, int width, int height, Color col)
	{
		super(x,y,width,height,col);
		xSpeed = 3;
		ySpeed = 1;
	}
	
	public Ball(int x, int y, int width, int height, Color col, int xSpd, int ySpd)
	{
		super(x,y,width,height,col);
		setXSpeed(xSpd);
		setYSpeed(ySpd);
	}
	
	public Ball(int x, int y, int width, int height, int xSpd, int ySpd)
	{
		super(x,y,width,height);
		setXSpeed(xSpd);
		setYSpeed(ySpd);
	}

	   
   //add the set methods
   public void setXSpeed(int xSpd){
	   xSpeed = xSpd;
   }
   
   public void setYSpeed(int ySpd){
	   ySpeed = ySpd;
   }

   
   public void moveAndDraw(Graphics window)
   {
   	//draw a white ball at old ball location
	  draw(window,Color.WHITE);
      setX(getX()+xSpeed);
		//setY
      setY(getY()+ySpeed);
		//draw the ball at its new location
      draw(window);
   }
   
	public boolean equals(Object obj)
	{
		if(super.equals((Ball) obj) && getXSpeed() == ((Ball) obj).getXSpeed() && getYSpeed() == ((Ball) obj).getYSpeed()){
			return true;
		}
		return false;
	}   

   //add the get methods
	
	public int getXSpeed(){
		return xSpeed;
	}
	
	public int getYSpeed(){
		return ySpeed;
	}
	
	
	public boolean didCollideLeft(Object obj){
		Block x = (Block) obj;
		return getX() - getWidth() <= x.getX() - x.getWidth();
	}
	public boolean didCollideRight(Object obj){
		Block x = (Block) obj;
		return getX() - getWidth() >= x.getX() - x.getWidth();
	}
	public boolean didCollideTop(Object obj){
		Block x = (Block) obj;
		return getY() - getHeight() <= x.getY() - x.getHeight();
	}
	public boolean didCollideBottom(Object obj){
		Block x = (Block) obj;
		return getY() - getHeight() >= x.getY() - x.getHeight();
	}

   //add a toString() method
	public String toString(){
		String output = super.toString() + xSpeed + " " + ySpeed;
		return output;
	}
}