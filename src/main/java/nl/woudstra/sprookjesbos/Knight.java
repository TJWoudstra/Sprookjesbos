package nl.woudstra.sprookjesbos;

/**
 * Created by Tieme on 28-4-2017.
 */
public class Knight extends MainCharacter {
    public Knight() {
        hitPoints = 200;
        spellPoints = 20;

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
