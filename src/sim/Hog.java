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

        // AI
        Edible foodSourceTarget = null;
        for (Entity e : arena.getEntities()) {
            // 25 = 2^2 because this is less computationally intensive
            if (this.getPosition().distanceSq(e.getPosition()) > 25)
                continue;
            if (e instanceof Edible) {
                if (foodSourceTarget == null ||
                        ((Entity)foodSourceTarget).getPosition().distanceSq(this.getPosition())
                    > e.getPosition().distanceSq(this.getPosition()))
                    foodSourceTarget = (Edible)e;
            }

        }
        if (foodSourceTarget == null) {

        }
    }

    @Override 
    public void eat(Edible ed)
    {
        System.out.println("TODO: implement Hog::eat()");
    }
}
