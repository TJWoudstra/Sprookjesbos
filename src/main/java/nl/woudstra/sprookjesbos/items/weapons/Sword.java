package nl.woudstra.sprookjesbos.items.weapons;

import nl.woudstra.sprookjesbos.items.Weapon;

/**
 * Created by Tieme on 28-4-2017.
 */
public abstract class Sword extends Weapon {
    int weaponSpeed = 60;
    int recoveryTimeAfterAttack = 30;
    int criticalHitRate = 20;
    int changeOfHit = 90;
}
