package utils;

public class Coords {

    //public fields
    public int x;
    public int y;

    //constructor

    public Coords(int x, int y) {
        this.x = x;
        this.y = y;
    }

    //public methods

    public double distanceSq(Coords other) {
        return Math.pow(this.x-other.x, 2) + Math.pow(this.y-other.y, 2);
    }

    public double distance(Coords other) {
        return Math.sqrt(this.distanceSq(other));
    }

    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Coords))
            return false;
        return ((Coords)other).x == this.x &&
                ((Coords)other).y == this.y;
    }
}
