import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class platform here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class platform extends scrollObjects
{
    /**
     * Act - do whatever the platform wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        
    }
    
    public platform (int width, int height)
    {
        GreenfootImage image = getImage();
        image.scale(width, height);
        setImage(image);
    }
    
    
}
