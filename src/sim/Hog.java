package sim;

import utils.Coords;

import java.util.TreeMap;

public class Hog extends Animal implements Eater{

    //public fields
    //TODO: implement different behavior for each Edible
    //public static final TreeMap<Edible, Runnable> treeMap = new TreeMap<>();

    //constructor

    public Hog(Coords position, Arena arena) {
        super(position, arena, 15);
    }

    //public methods

    @Override
    public String displayName() {
        return "Hog";
    }

    @Override
    public void nextTick() {
        super.nextTick();
    }

    @Override 
    public void eat(Edible ed)
    {
        System.out.println("TODO: implement Hog::eat()");
    }
}
