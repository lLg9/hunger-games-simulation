package sim;

import utils.Coords;

import java.util.ArrayList;

public abstract class Entity {

    //private&protected fields
    private static int lastId = 0;
    protected Arena arena;
    protected Coords position;

    //protected constructor
    protected Entity(Coords position, Arena arena) {
        this.id = ++Entity.lastId;
        this.position = position;
        this.arena = arena;
    }

    //public fileds
    public final int id;

    //public methods
    public Coords getPosition() { return this.position; }
    
    public abstract String displayName();
    public abstract void nextTick();
}
