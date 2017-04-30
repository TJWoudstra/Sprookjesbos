package nl.woudstra.sprookjesbos;

/**
 * Created by Tieme on 9-4-2017.
 */
public abstract class Character {
    CharacterStatus status;
    Resistances resistances;

    private int hitPoints;                      //hitpoints, spellpoints
    private int maxHitPoints;
    private int spellPoints;
    private int maxSpellPoints;

    private int armor;                          //armor, blockrate
    private int blockRate;

    private int level;                          //level

    public Character() {
        status = new CharacterStatus();
        resistances = new Resistances();
    }
                                                //getters & setters

    public int getHitPoints() {                 //getters & setters
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        if(hitPoints < 0)
            this.hitPoints = 0;
        else if(hitPoints > maxHitPoints)
            this.hitPoints = maxHitPoints;
        else{
            this.hitPoints = hitPoints;
        }
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

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public int getBlockRate() {
        return blockRate;
    }

    public void setBlockRate(int blockRate) {
        this.blockRate = blockRate;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
