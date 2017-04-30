package nl.woudstra.sprookjesbos;

/**
 * Created by Tieme on 28-4-2017.
 */
public class Knight extends MainCharacter {
    public Knight() {
        setMaxHitPoints(200);
        setHitPoints(getMaxHitPoints() );

        setMaxSpellPoints(20);
        setSpellPoints(getMaxSpellPoints());

        maxHitPoints = hitPoints;
        basicHitPoints = hitPoints;
        maxSpellPoints = spellPoints;
        basicSpellPoints = spellPoints;

        speed = 30;
        strength = 50;
        magicPower = 10;

        canHandleSword = true;
        canWearShield = true;
        canUsePotions = true;

    }
}
