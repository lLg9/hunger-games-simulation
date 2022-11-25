package sim;

import utils.Coords;

public abstract class Animal extends Entity implements Eater {

    //private fields

    private int food;

    //constructors

    public Animal(Coords position, Arena arena) {
        this(position, arena, 10);
    }
    public Animal(Coords position, Arena arena, int initialFood) {
        super(position, arena);
        this.food = initialFood;
    }

    //public methods

    @Override
    public void nextTick() {
        Edible dinner = this.foodAtSameCoords();
        if (null != dinner){
            this.eat(dinner);
        }
        else{
            this.moveTowardsNearestPlant();
            this.food -= 1;
        }
    }

    //returns null is there is no food on the same coordinate
    private Edible foodAtSameCoords(){
        System.out.println("TODO: implement Animal::foodAtSameCoords()");
        return null;
    }

    private void moveTowardsNearestPlant(){

        Edible foodSourceTarget = null;
        for (Entity e : arena.getEntities()) {
            // 25 = 2^2 because this is less computationally intensive
            if (e instanceof Edible) {
                if (foodSourceTarget == null ||
                        ((Entity)foodSourceTarget).getPosition().distanceSq(this.getPosition())
                    > e.getPosition().distanceSq(this.getPosition()))
                    foodSourceTarget = (Edible)e;
            }

        }
        if (foodSourceTarget != null) {
            this.moveTowards(((Entity)foodSourceTarget).getPosition());
        }
    }

    private void moveTowards(Coords c){
        System.out.println("TODO: implement Animal::moveTowards()");

        if (this.position.x < c.x)
            this.position.x += 1;
        else if (this.position.x > c.x)
            this.position.x -= 1;

        if (this.position.y < c.y)
            this.position.y += 1;
        else if (this.position.y > c.y)
            this.position.y -= 1;
    }
}
