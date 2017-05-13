package nl.woudstra.sprookjesbos.characters;

import nl.woudstra.sprookjesbos.characters.attack.BasicAttack;

/**
 * Created by Tieme on 28-4-2017.
 */
public class Knight extends Character {

    public String getType(){
        return "Knight";
    }

    public Knight(String name) {
        super(name, 200, 20);
        setImageLocation("Knight.gif");

        Statistics statistics = getStatistics();
        statistics.setSpeed(30);
        statistics.setStrength(50);
        statistics.setMagicPower(10);

        Abilities abilities = getAbilities();
        abilities.setAbleToHandleSword(true);
        abilities.setAbleToWearShield(true);

        addAttack(new BasicAttack(20, 10, "Simple attack"));
    }
}
