import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class scrollActor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class scrollActor extends Actor
{
    private int margins, speed;
    /**
     * Act - do whatever the scrollActor wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public scrollActor(int margins, int speed)
    {
        this.margins = margins;
        this.speed = speed;
    }
}
