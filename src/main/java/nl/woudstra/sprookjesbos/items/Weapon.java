package nl.woudstra.sprookjesbos.items;

/**
 * Created by Tieme on 28-4-2017.
 */
public abstract class Weapon extends Item {
    boolean controlOverAttack = true;

    int weaponSpeed;
    int recoveryTimeAfterAttack;
    int criticalHitRate;
    int chanceOfHit;
    int timesOfAttack = 1;
    int handsUsedForWeapon = 1;

    int minimumDamage;
    int randomDamage;
    int timesRandomDamage;
    String damageType = "Physical";

    public int weaponDamage(){
        int damage = minimumDamage + ((int) Math.random() * randomDamage);
        return damage;
    }

}
