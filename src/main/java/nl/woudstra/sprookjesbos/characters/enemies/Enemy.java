package nl.woudstra.sprookjesbos.characters.enemies;

import nl.woudstra.sprookjesbos.characters.BaseCharacter;

/**
 * Created by bouke on 14-5-17.
 */
public class Enemy extends BaseCharacter {
    private int horizontalPosition = 0;
    private int verticalPosition = 0;

    public Enemy(String name, int maxHitpoints, int maxSpellpoints, String imageName) {
        super(name, maxHitpoints, maxSpellpoints, imageName);
    }

    public void setGridPosition(int horizontalPosition, int verticalPosition){
        this.horizontalPosition = horizontalPosition;
        this.verticalPosition = verticalPosition;
    }

    public int getHorizontalPosition() {
        return horizontalPosition;
    }

    public int getVerticalPosition() {
        return verticalPosition;
    }
}
