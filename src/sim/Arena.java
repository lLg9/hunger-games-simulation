package sim;


import java.util.Set;
import java.util.TreeSet;

public class Arena {
    //private fields

    private final TreeSet<Entity> entities;
    private int size;

    //public methods

    public Arena() {
        entities = new TreeSet<Entity>();
    }

    //public methods realted to entity

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

    //public methods related to simulation

    public void setSize(int s){
        this.size = s;
    }

    public void nextTick() {
        for (Entity e : entities)
            e.nextTick();
    }

    public void printArena(){
        //TODO: implement
        System.out.println("TODO: implement Simulation::printArena()");

        char [][] output = new char[size][size];
        for (int i = 0; i<size; i++)
            for (int j = 0; j<size; j++)
                output[i][j] = '_';

        for (Entity e : entities){
            output[e.getPosition().x][e.getPosition().y] = e.displaySymbol();
        }

        for (int i = 0; i<size; i++)
            for (int j = 0; j<size; j++)
                System.out.print(Character.toString(output[i][j]));
            System.out.println("");
    }
}
