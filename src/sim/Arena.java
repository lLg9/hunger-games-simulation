package sim;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Set;
import java.util.TreeSet;

public class Arena {
    private final TreeSet<Entity> entities;
    public Arena() {
        entities = new TreeSet<Entity>();
    }

    public Set<Entity> getEntities() {
        return entities;
        // TODO: megelőzni a kiszivárogtatást
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


}
