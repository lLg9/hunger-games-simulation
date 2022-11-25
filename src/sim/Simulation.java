package sim;

public class Simulation {
    private static Simulation instance = null;
  
    private Arena arena;
  
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

    //public game methods

    public void initSimulationFromCode(){
    	//TODO: set arena size, and add entities to the arena from code
        System.out.println("TODO: implement initSimulationFromCode()");
    }

    public void initSimulationFromFile(String path){
    	//TODO: parse arena size and entities from the file, and add init the game accordingly
        System.out.println("TODO: implement initSimulationFromFile(String path()");

    }

    public void run(){
        //TODO: implement with a timer, call nextTick on Arena on each tick, and print the current state of the arena
        System.out.println("TODO: implement Simulation::run()");
    }

}