package nl.woudstra.sprookjesbos.characters.properties;

/**
 * Created by Tieme on 30-4-2017.
 */
public class CharacterStatus {
    private static final double GROW_LEVEL_FACTOR = 1.05;
    private boolean isAlive = true;

    private int basicHitpoints = 0; // calculated based on level
    private int additionalHitpoints = 0; // calculated based on items, potions, etc
    private int hitPoints = 0;
    private int basicSpellpoints = 0;
    private int additionalSpellpoints = 0;
    private int spellPoints = 0;
    private int level = 0;
    private int experience = 0;

    private boolean isFriendly = false;
    private boolean isUndead = false;
    private boolean isBoss = false;
    private boolean canUseSpells = false;
    private boolean canUsePotions = false;
    private boolean canAttack = true;

    public CharacterStatus(int hitpoints, int spellpoints) {
        this.basicHitpoints = hitpoints;
        this.hitPoints = hitpoints;
        this.basicSpellpoints = spellpoints;
        this.spellPoints = spellpoints;
    }

    //getters & setters

    public void incrementLevel(){
        level++;
        this.hitPoints = (int) (hitPoints * GROW_LEVEL_FACTOR);
        this.basicHitpoints = (int) (basicHitpoints * GROW_LEVEL_FACTOR);
        this.spellPoints = (int) (spellPoints * GROW_LEVEL_FACTOR);
        this.basicSpellpoints = (int) (basicSpellpoints * GROW_LEVEL_FACTOR);
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        if(hitPoints <= 0) {
            this.hitPoints = 0;
            this.isAlive = false;
        } else if(hitPoints > getMaxHitPoints()){
            this.hitPoints = getMaxHitPoints();
        } else {
            this.hitPoints = hitPoints;
        }
    }

    public void setAdditionalHitpoints(int additionalHitpoints) {
        this.additionalHitpoints = additionalHitpoints;
    }

    public void setAdditionalSpellpoints(int additionalSpellpoints){
        this.additionalSpellpoints = additionalSpellpoints;
    }

    public void applyDamage(int damage) {
        setHitPoints(hitPoints - damage);
    }

    public int getMaxHitPoints() {
        return basicHitpoints + additionalHitpoints;
    }

    public int getSpellPoints() {
        return spellPoints;
    }

    public void setSpellPoints(int spellPoints) {
        if(spellPoints < 0)
            this.spellPoints = 0;
        else if(spellPoints > getMaxSpellPoints())
            this.spellPoints = getMaxSpellPoints();
        else {
            this.spellPoints = spellPoints;
        }
    }

    public int getMaxSpellPoints() {
        return basicSpellpoints + additionalSpellpoints;
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
