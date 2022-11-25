package sim;

import java.util.Timer;

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
    }

    public void initSimulationFromFile(String path){
    	//TODO: parse arena size and entities from the file, and add init the game accordingly
        System.out.println("TODO: implement initSimulationFromFile(String path()");

    }

    public void launchSimulation(){
        //TODO: implement with a timer, call nextTick on Arena on each tick, and print the current state of the arena
        System.out.println("TODO: implement Simulation::launchSimulation()");

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