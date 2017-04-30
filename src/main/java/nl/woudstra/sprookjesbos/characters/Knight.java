package nl.woudstra.sprookjesbos.characters;

import nl.woudstra.sprookjesbos.characters.MainCharacter;

/**
 * Created by Tieme on 28-4-2017.
 */
public class Knight extends MainCharacter {
    public Knight() {
        setMaxHitPoints(200);
        setBasicHitPoints(getMaxHitPoints());
        setHitPoints(getMaxHitPoints() );

        setMaxSpellPoints(20);
        setBasicSpellPoints(getMaxSpellPoints());
        setSpellPoints(getMaxSpellPoints());

        statistics.setSpeed(30);
        statistics.setStrength(50);
        statistics.setMagicPower(10);

        weaponPossibilities.setCanHandleSword(true);

        armorPossibilities.setCanWearShield(true);

    }
}
