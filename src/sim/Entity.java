package sim;

import utils.Coords;

import java.util.ArrayList;

public abstract class Entity {
    private static int lastId = 0;

    public final int id;
    protected Arena arena;

    protected Entity(Coords position, Arena arena) throws EnumConstantNotPresentException {
        this.id = ++Entity.lastId;
        this.position = position;
        this.arena = arena;
    }
    protected Coords position;
    public Coords getPosition() { return this.position; }
    public abstract String displayName();
    public abstract void nextTick();
}
