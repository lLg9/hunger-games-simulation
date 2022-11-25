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
    public Edible foodAtSameCoords(){
        System.out.println("TODO: implement Animal::foodAtSameCoords()");
        return null;
    }

    public void moveTowardsNearestPlant(){
        System.out.println("TODO: implement Animal::moveTowardsNearestPlant()");
    }
}
