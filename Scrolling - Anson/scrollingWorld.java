import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class scrollingWorld extends World
{    
    private int xOff, yOff, xDirection, yDirection, width, height;
    public int speed = 20;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public scrollingWorld (int width, int height, int cellsize)
    {    
        super(width, height, cellsize, false);
        this.width = width;
        this.height = height;
    }
    
    public void shiftX(int xDirection)
    {
        this.xDirection = xDirection;
        if(this.xDirection < 0)
        {
            xOff = 1;
        }
        if(this.xDirection > 0)
        {
            xOff = -1;
        }
        GreenfootImage bg = new GreenfootImage(getBackground());
        getBackground().drawImage(bg, (speed * xOff), 0);
        getBackground().drawImage(bg, (getWidth() * xOff * -1) + (speed * xOff) , 0);
    }
    
    public void shiftY(int yDirection)
    {
        this.yDirection = yDirection;
        if(this.yDirection < 0)
        {
            yOff = 1;
        }
        if(this.yDirection > 0)
        {
            yOff = -1;
        }
        GreenfootImage bg = new GreenfootImage(getBackground());
        getBackground().drawImage(bg, 0, (speed * yOff));
        getBackground().drawImage(bg, 0, (getHeight() * yOff * -1) + (speed * yOff));
    }
}
