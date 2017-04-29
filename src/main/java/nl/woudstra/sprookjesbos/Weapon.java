package nl.woudstra.sprookjesbos;

/**
 * Created by Tieme on 28-4-2017.
 */
public abstract class Weapon extends Item {
    boolean controlOverAttack = true;

    int weaponSpeed;
    int recoveryTimeAfterAttack;
    int criticalHitRate;
    int changeOfHit;
    int timesOfAttack = 1;
    int handsUsedForWeapon = 1;

    int minimumDamage;
    int randomDamage;
    String damageType = "Physical";

    public int weaponDamage(){
        int damage = minimumDamage + ((int) Math.random() * randomDamage);
        return damage;
    }

}
