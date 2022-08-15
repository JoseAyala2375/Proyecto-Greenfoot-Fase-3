import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Carretera extends World
{
    GreenfootSound backgroundMusic = new GreenfootSound("BeepBox-Song.mp3");
    public void started()
    {
        backgroundMusic.playLoop();
    }
    public void stopped()
    {
        backgroundMusic.pause();
    }
    /**
    Counter counter = new Counter();
    */
    public Carretera()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1080, 720, 1);
        
        prepare();
    }
    /**
    public Counter getCounter(){
        return counter;
    }
    */
    private void prepare()
    {
        Carro carro = new Carro();
        addObject(carro, 5, 360);
        Cono[] conos = new Cono[3];
        for (int i=0; i<conos.length; i++)
        {
            conos[i] = new Cono();
            int conoY = Greenfoot.getRandomNumber(getHeight());
            addObject(conos[i], 1080, conoY);
        }
        
        Petróleo[] petroleos = new Petróleo[2];
        for (int i=0; i<petroleos.length; i++)
        {
            petroleos[i] = new Petróleo();
            int petroleoY = Greenfoot.getRandomNumber(getHeight());
            addObject(petroleos[i], 1080, petroleoY);
        }
        
        Planta[] plantas = new Planta[1];
        for (int i=0; i<plantas.length; i++)
        {
            plantas[i] = new Planta();
            int plantasY = Greenfoot.getRandomNumber(getHeight());
            addObject(plantas[i], 1080, plantasY);
        }
    }
}
