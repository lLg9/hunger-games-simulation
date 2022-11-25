package sim;


import java.util.Set;
import java.util.TreeSet;

public class Arena {
    //fields
    private final TreeSet<Entity> entities;

    //methods
    public Arena() {
        entities = new TreeSet<Entity>();
    }

    public Set<Entity> getEntities() {
        // TODO: megelőzni a kiszivárogtatást
        return entities;
    }
    public void addEntity(Entity e) {
        entities.add(e);
    }
    public Entity getEntityWithId(int id) {
        for (Entity e : entities) {
            if(e.id == id)
                return e;
        }
        return null;
    }

    public void nextTick() {
        for (Entity e : entities)
            e.nextTick();
    }

    public void printArena(){
        //TODO: implement
        System.out.println("TODO: implement Simulation::printArena()");
    }


}
