package nl.woudstra.sprookjesbos.characters;

import nl.woudstra.sprookjesbos.characters.attack.Attack;

import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by Tieme on 9-4-2017.
 */
public class Character {
    private Resistances resistances = new Resistances();
    private Statistics statistics = new Statistics();
    private Abilities abilities = new Abilities();
    private Equipment equipment = new Equipment();
    private List<Attack> attacks = new ArrayList<>();
    private CharacterStatus status;

    private String name;
    private String imageLocation;
    private int armor;                          //armor, blockrate
    private int blockRate;

    public Character(String name, int maxHitpoints, int maxSpellpoints) {
        this.name = name;
        this.status = new CharacterStatus(maxHitpoints, maxSpellpoints);
    }

    public CharacterStatus getStatus() {
        return status;
    }

    public Resistances getResistances() {
        return resistances;
    }

    public Statistics getStatistics() {
        return statistics;
    }

    public Abilities getAbilities() {
        return abilities;
    }

    public Equipment getEquipment() {
        return equipment;
    }

    public String getName() {
        return name;
    }

    public List<Attack> getAttacks(){
        return attacks;
    }

    public void addAttack(Attack attack){
        attacks.add(attack);
    }

    public String getType(){
        return "Character";
    }

    public String getImageLocation() {
        return imageLocation;
    }

    public void setImageLocation(String imageLocation) {
        this.imageLocation = imageLocation;
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


}
