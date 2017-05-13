package nl.woudstra.sprookjesbos.characters;

/**
 * Created by Tieme on 30-4-2017.
 */
public class CharacterStatus {
    private static final double GROW_LEVEL_FACTOR = 1.05;
    private boolean isAlive = true;

    private int hitPoints = 0;                      //hitpoints, spellpoints
    private int maxHitPoints = 0;
    private int spellPoints = 0;
    private int maxSpellPoints = 0;
    private int level = 0;
    private int experience = 0;

    private boolean isFriendly = false;
    private boolean isUndead = false;
    private boolean isBoss = false;
    private boolean canUseSpells = false;
    private boolean canUsePotions = false;
    private boolean canAttack = true;

    public CharacterStatus(int maxHitPoints, int maxSpellPoints) {
        this.maxHitPoints = maxHitPoints;
        this.hitPoints = maxHitPoints;
        this.maxSpellPoints = maxSpellPoints;
        this.spellPoints = maxSpellPoints;
    }

    //getters & setters

    public void incrementLevel(){
        level++;
        this.hitPoints = (int) (hitPoints * GROW_LEVEL_FACTOR);
        this.maxHitPoints = (int) (maxHitPoints * GROW_LEVEL_FACTOR);
        this.spellPoints = (int) (spellPoints * GROW_LEVEL_FACTOR);
        this.maxSpellPoints = (int) (maxSpellPoints * GROW_LEVEL_FACTOR);
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        if(hitPoints <= 0) {
            this.hitPoints = 0;
            this.isAlive = false;
        } else if(hitPoints > maxHitPoints){
            this.hitPoints = maxHitPoints;
        } else {
            this.hitPoints = hitPoints;
        }
    }

    public void applyDamage(int damage) {
        setHitPoints(hitPoints - damage);
    }

    public int getMaxHitPoints() {
        return maxHitPoints;
    }

    public void setMaxHitPoints(int maxHitPoints) {
        this.maxHitPoints = maxHitPoints;
    }

    public int getSpellPoints() {
        return spellPoints;
    }

    public void setSpellPoints(int spellPoints) {
        if(spellPoints < 0)
            this.spellPoints = 0;
        else if(spellPoints > maxSpellPoints)
            this.spellPoints = maxSpellPoints;
        else {
            this.spellPoints = spellPoints;
        }
    }

    public int getMaxSpellPoints() {
        return maxSpellPoints;
    }

    public void setMaxSpellPoints(int maxSpellPoints) {
        this.maxSpellPoints = maxSpellPoints;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

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
