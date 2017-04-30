package nl.woudstra.sprookjesbos;

/**
 * Created by Tieme on 30-4-2017.
 */
public class CharacterStatus {
    private boolean isAlive = true;

    private boolean isFriendly;
    private boolean isUndead;
    private boolean isBoss;
    private boolean canUseSpells;
    private boolean canUsePotions;
    private boolean canAttack = true;

    //getters & setters

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public boolean isFriendly() {
        return isFriendly;
    }

    public void setFriendly(boolean friendly) {
        isFriendly = friendly;
    }

    public boolean isUndead() {
        return isUndead;
    }

    public void setUndead(boolean undead) {
        isUndead = undead;
    }

    public boolean isBoss() {
        return isBoss;
    }

    public void setBoss(boolean boss) {
        isBoss = boss;
    }

    public boolean isCanUseSpells() {
        return canUseSpells;
    }

    public void setCanUseSpells(boolean canUseSpells) {
        this.canUseSpells = canUseSpells;
    }

    public boolean isCanUsePotions() {
        return canUsePotions;
    }

    public void setCanUsePotions(boolean canUsePotions) {
        this.canUsePotions = canUsePotions;
    }

    public boolean isCanAttack() {
        return canAttack;
    }

    public void setCanAttack(boolean canAttack) {
        this.canAttack = canAttack;
    }
}
