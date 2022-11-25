package sim;

public class Melon extends Plant {
    private int size;

    public Melon() {
        this(5);
    }
    public Melon(int initialSize) {
        this.size = initialSize;
    }

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
