package nl.woudstra.sprookjesbos.characters.attack;

import nl.woudstra.sprookjesbos.characters.Character;
import java.util.Random;

/**
 * Created by bouke on 13-5-17.
 */
public class BasicAttack implements Attack {
    private int minDamage = 0;
    private int varDamage = 0;
    private String description;
    private Random dice = new Random();

    public BasicAttack(int minDamage, int varDamage, String description){
        this.minDamage = minDamage;
        this.varDamage = varDamage;
        this.description = description;
    }

    @Override
    public void attack(Character character) {
        int damage = minDamage + dice.nextInt(varDamage);
        character.getStatus().applyDamage(damage);
    }

    @Override
    public void setSeed(long seed) {
        dice.setSeed(seed);
    }

    @Override
    public String getDescription() {
        return description;
    }
}
