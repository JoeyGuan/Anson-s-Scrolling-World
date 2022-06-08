import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class world here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class world extends scrollingWorld
{   
    /**
     * Constructor for objects of class world.
     * 
     */
    public world()
    {
        super(900, 900, 1);
        
        snek sneks = new snek(200, 20);
        addObject(sneks, getWidth() / 2, getHeight() / 2);      
        platform platforms = new platform(2000, 50);
        addObject(platforms, getWidth() / 2, getHeight() - 300);
    }
}
