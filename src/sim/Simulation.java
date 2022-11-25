package sim;

class Simulation {
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
    }

    public void initSimulationFromFile(String path){
    	//TODO: parse arena size and entities from the file, and add init the game accordingly
    }

}