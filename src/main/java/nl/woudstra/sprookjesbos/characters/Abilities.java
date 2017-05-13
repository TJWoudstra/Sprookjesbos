package nl.woudstra.sprookjesbos.characters;

/**
 * Created by bouke on 13-5-17.
 */
public class Abilities {
    private boolean ableToWearShield = false;
    private boolean ableToHandleSword = false;

    public boolean isAbleToWearShield() {
        return ableToWearShield;
    }

    public void setAbleToWearShield(boolean ableToWearShield) {
        this.ableToWearShield = ableToWearShield;
    }

    public boolean isAbleToHandleSword() {
        return ableToHandleSword;
    }

    public void setAbleToHandleSword(boolean ableToHandleSword) {
        this.ableToHandleSword = ableToHandleSword;
    }
}
