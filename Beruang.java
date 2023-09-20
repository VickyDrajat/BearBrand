import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Beruang here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Beruang extends Actor
{
    /**
     * Act - do whatever the Beruang wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        moveAndTurn();
        eat();
    }
    public void moveAndTurn()
    {
        move(4);
        
        if (Greenfoot.isKeyDown("left"))
        {
            turn(-3);
        }
        if (Greenfoot.isKeyDown("right"))
        {
            turn(3);
        }
    }
    
    public void eat()
    {
        Actor Apel;
        Apel = getOneObjectAtOffset(0,0,Apel.class);
        if (Apel != null)
        {
            World world;
            world = getWorld();
            world.removeObject(Apel);
            addScore();
        }
    }
    
    public void addScore()
    {
        if(!getWorld().getObjects(Counter.class).isEmpty())
        {
            ((Counter) getWorld().getObjects(Counter.class).get(0)).add(1);
        }
    }
}
