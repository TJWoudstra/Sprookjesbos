package nl.woudstra.sprookjesbos.items;

/**
 * Created by Tieme on 3-5-2017.
 */
public abstract class Item {
    private int value;
    private boolean canBeSold;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public boolean CanBeSold() {
        return canBeSold;
    }

    public void setCanBeSold(boolean canBeSold) {
        this.canBeSold = canBeSold;
    }
}
