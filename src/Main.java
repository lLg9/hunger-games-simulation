import sim.Arena;
import sim.Hog;
import sim.Melon;
import sim.Plant;
import sim.Simulation;


public class Main extends Object {

    public static void main(String[] args) {
        System.out.println("CMD simulation demo");

        Simulation theSimulation = Simulation.getInstance();
        //theSimulation.initSimulationFromCode();
        try{
            theSimulation.initSimulationFromFile("infile.txt");
        }
        catch(Exception e){
            System.out.println("I/O exception occurred...");
        }

        theSimulation.launchSimulation();

    }

}
