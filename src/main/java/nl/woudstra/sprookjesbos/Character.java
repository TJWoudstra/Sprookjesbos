package nl.woudstra.sprookjesbos;

/**
 * Created by Tieme on 9-4-2017.
 */
public abstract class Character {
    boolean isFriendly;
    boolean isAlive = true;
    boolean isUndead;
    boolean isBoss;
    boolean canUseSpells;
    boolean canUsePotions;
    boolean canAttack = true;

    int hitPoints;      //hitpoints, spellpoints, armor
    int maxHitPoints;
    int spellPoints;
    int maxSpellPoints;
    int armor;

    int level;

    int speed;     //statistieken
    int strength;
    int magicPower;

    int fireResistance;   //resistances
    int waterResistance;
    int earthResistance;
    int airResistance;

    int blockRate;

    public abstract void attack(Character character);

}
