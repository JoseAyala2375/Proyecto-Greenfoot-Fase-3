import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Carro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Carro extends Actor
{
    /**
     * Act - do whatever the Carro wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move (2);
        if (Greenfoot.isKeyDown("left"))
        {
            turn (-2);
        }
        if (Greenfoot.isKeyDown("right"))
        {
            turn (2);
        }
        Actor Cono;
        Cono= getOneObjectAtOffset (0,0, Cono.class);
        if (Cono!=null)
        {
            World world;
            world = getWorld();
            Greenfoot.playSound("choque.wav");
            world.removeObject(Cono);
            /**
            Counter counter = world.getCounter();
            counter.addScore();
            */
            getWorld().showText("¡TE ESTRELLASTE!",540,360);
            Greenfoot.stop();
        }
        Actor Petróleo;
        Petróleo= getOneObjectAtOffset (0,0, Petróleo.class);
        if (Petróleo!=null)
        {
            World world;
            world = getWorld();
            Greenfoot.playSound("choque.wav");
            world.removeObject(Petróleo);
            getWorld().showText("¡TE ESTRELLASTE!",540,360);
            Greenfoot.stop();
        }
        Actor Planta;
        Planta=getOneObjectAtOffset(0,0, Planta.class);
        if (Planta!=null)
        {
           World world;
           world= getWorld();
           Greenfoot.playSound("choque.wav");
           world.removeObject(Planta);
           getWorld().showText("¡TE ESTRELLASTE!",540,360);
           Greenfoot.stop();
        }
        }
}
