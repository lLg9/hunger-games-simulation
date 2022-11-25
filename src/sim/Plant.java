package sim;

import utils.Coords;

public abstract class Plant extends Entity implements Edible {
    public Plant(Coords position, Arena arena) {
        super(position, arena);
    }
}
