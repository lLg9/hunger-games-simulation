package sim;

import java.util.Timer;
import utils.Coords;

public class Simulation {

    //singleton pattern related members

    private static Simulation instance = null;
  
    private Simulation()
    {
        arena = new Arena();
    }
  
    public static Simulation getInstance()
    {
        if (instance == null)
            instance = new Simulation();
  
        return instance;
    }

    //private fileds

    private Arena arena;


    //public game methods

    public void initSimulationFromCode(){
    	//TODO: set arena size, and add entities to the arena from code
        System.out.println("TODO: implement initSimulationFromCode()");

        arena.setSize(20);
        arena.addEntity(new Hog(new Coords(3,3), arena));
        arena.addEntity(new Hog(new Coords(5,13), arena));
        arena.addEntity(new Hog(new Coords(14,15), arena));
        arena.addEntity(new Melon(new Coords(9,9), arena, 2));
        arena.addEntity(new Melon(new Coords(17,18), arena, 2));
        arena.addEntity(new Melon(new Coords(0,0), arena, 2));
        arena.addEntity(new Melon(new Coords(3,11), arena, 2));
        arena.addEntity(new Melon(new Coords(2,19), arena, 2));
    }

    public void initSimulationFromFile(String path){
    	//TODO: parse arena size and entities from the file, and add init the game accordingly
        System.out.println("TODO: implement initSimulationFromFile(String path()");

    }

    public void launchSimulation(){

        Timer t = new java.util.Timer();
        t .schedule( 
            new java.util.TimerTask() {
                @Override
                public void run() {
                    arena.nextTick();
                    arena.printArena();
                }
            }, 
            1000,
            1000
        ); 
    }

}