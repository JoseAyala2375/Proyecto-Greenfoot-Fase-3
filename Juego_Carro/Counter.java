import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class Counter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Counter extends Actor
{
    int cuentaTotal = 0;
    
    public void act()
    {
        setImage(new GreenfootImage("Puntuación:" + cuentaTotal, 42, null, null));
    }
    
    public void addScore()
    {
        cuentaTotal += 1;
    }
    
    public void resetScore()
    {
        cuentaTotal = 0;
    }
}
