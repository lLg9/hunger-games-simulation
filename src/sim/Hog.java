package sim;

import utils.Coords;

import java.util.TreeMap;

public class Hog extends Animal {

    public static final TreeMap<Edible, Runnable> = new TreeMap<>();


    public Hog(Coords position, Arena arena) {
        super(position, arena, 15);
    }

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
                        ((Entity)foodSourceTarget).getPosition().distanceSq(this)
                    > e.getPosition().distanceSq(this.getPosition()))
                    foodSourceTarget = (Edible)e;
            }

        }
        if (foodSourceTarget == null) {

        }
    }
}
