package sim;

import utils.Coords;

public class Melon extends Plant {

    //private fields
    
    private int size;

    //constructors

    public Melon() {
        this(new Coords(0,0), null, 5);
    }

    public Melon(Coords position, Arena arena, int initialSize) {
        super(position, arena);
        this.size = initialSize;
    }

    //puclic methods

    @Override
    public void getEatenBy(Eater e) {
        // check for carnivore only
        // TODO: make carnivores happen
        // then increment food value

    }

    @Override
    public String displayName() {
        return "Melon";
    }

    @Override
    public void nextTick() {
        this.size += 1;
    }

    public int getSize() {
        return size;
    }
}
