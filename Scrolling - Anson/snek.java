import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class snek here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class snek extends scrollActor
{
    private static final int GRAVITY = 2;
    private int STEP;
    private int velocity = 0;
    private int margins;
    
    public snek (int margins, int speed)
    {
        super(margins, speed);
        STEP = speed;
        this.margins = margins;
    }
    /**
     * Act - do whatever the snek wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        fall();
        movement();
    }
    
       public void fall()
    {
        setLocation(getX(), getY()+velocity);
        if(onGround())
        {
            velocity = 0;
            
            while(onGround())
            {
                setLocation(getX(), getY()-1);
            }
            setLocation(getX(), getY()+1);
        }
        else if (velocity < 0 && bumpedHead())
        {
            velocity = 0;
            
            while(bumpedHead())
            {
                setLocation(getX(), getY()+1);
            }
        }
        else
        {
            velocity += GRAVITY; 
        }
        
    }
    
    public void movement()
    {
        int x = getX();
        if(Greenfoot.isKeyDown("up") && onGround())
        {
            velocity = -25;
        }
        if(Greenfoot.isKeyDown("left") && canMoveLeft())
        {
            x -= STEP;
        }
        if(Greenfoot.isKeyDown("right") && canMoveRight())
        {
            x += STEP;
        }
        
        if (x > ((world)getWorld()).getWidth() - margins)
        {
            setLocation(getX(), getY());
            ((world)getWorld()).shiftX(1);
        }
        else if (x < margins)
        {
            setLocation(getX(), getY());
            ((world)getWorld()).shiftX(-1);
        }
        else
        {
            setLocation(x, getY());
        }
    }
    
    public boolean onGround()
    {
        boolean isOnGround = false;
        if (getOneObjectAtOffset(getImage().getWidth()/2, getImage().getHeight()/2, platform.class) != null ||
            getOneObjectAtOffset(getImage().getWidth()/-2, getImage().getHeight()/2, platform.class) != null)
        {
            isOnGround = true;
        }
        return isOnGround;
    }
    
    public boolean bumpedHead()
    {
        boolean didBumpHead = false;
        if (getOneObjectAtOffset(getImage().getWidth()/2, getImage().getHeight()/-2, platform.class) != null ||
            getOneObjectAtOffset(getImage().getWidth()/-2, getImage().getHeight()/-2, platform.class) != null)
        {
            didBumpHead = true;
        }
        return didBumpHead;
    }
    
    public boolean canMoveLeft()
    {
        boolean canMoveL = true;
        if (getOneObjectAtOffset(getImage().getWidth()/-2-STEP, getImage().getHeight()/-2, platform.class) != null ||
            getOneObjectAtOffset(getImage().getWidth()/-2-STEP, getImage().getHeight()/2-1, platform.class) != null)
            {
                canMoveL = false;
            }
        return canMoveL;
    }
    
    public boolean canMoveRight()
    {
        boolean canMoveR = true;
        if (getOneObjectAtOffset(getImage().getWidth()/2+STEP, getImage().getHeight()/-2, platform.class) != null ||
            getOneObjectAtOffset(getImage().getWidth()/2+STEP, getImage().getHeight()/2-1, platform.class) != null)
            {
                canMoveR = false;
            }
        return canMoveR;
    }
}
