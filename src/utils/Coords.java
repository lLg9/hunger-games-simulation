package utils;

public class Coords {
    public final int x;
    public final int y;

    public Coords(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distanceSq(Coords other) {
        return 10;
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
