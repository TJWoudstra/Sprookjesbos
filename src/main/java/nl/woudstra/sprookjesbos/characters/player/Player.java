package nl.woudstra.sprookjesbos.characters.player;

import nl.woudstra.sprookjesbos.characters.BaseCharacter;
import nl.woudstra.sprookjesbos.characters.properties.Abilities;
import nl.woudstra.sprookjesbos.characters.properties.Equipment;

/**
 * Created by bouke on 14-5-17.
 */
public class Player extends BaseCharacter {
    private Abilities abilities = new Abilities();
    private Equipment equipment = new Equipment();
    private boolean frontPosition;
    private int experience = 0;

    public Player(String name, int maxHitpoints, int maxSpellpoints, String imageName) {
        super(name, maxHitpoints, maxSpellpoints, imageName);
    }

    public int getExperience() {
        return experience;
    }

    public void addExperience(int amount){
        experience += amount;
    }

    public boolean isFrontPosition() {
        return frontPosition;
    }

    public void setFrontPosition(boolean frontPosition) {
        this.frontPosition = frontPosition;
    }

    public Abilities getAbilities(){
        return abilities;
    }

    public Equipment getEquipment() {
        return equipment;
    }
}
