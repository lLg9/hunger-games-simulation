package sim;

import utils.Coords;

public abstract class Animal extends Entity implements Eater {
    private int food;

    public Animal(Coords position, Arena arena) {
        this(position, arena, 10);
    }
    public Animal(Coords position, Arena arena, int initialFood) {
        super(position, arena);
        this.food = initialFood;
    }
    @Override
    public void nextTick() {
        food -= 1;
    }
}
