package nl.woudstra.sprookjesbos.characters;

import nl.woudstra.sprookjesbos.characters.attack.Attack;
import nl.woudstra.sprookjesbos.characters.properties.CharacterStatus;
import nl.woudstra.sprookjesbos.characters.properties.Equipment;
import nl.woudstra.sprookjesbos.characters.properties.Resistances;
import nl.woudstra.sprookjesbos.characters.properties.Statistics;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tieme on 9-4-2017.
 */
public class BaseCharacter {
    private Resistances resistances = new Resistances();
    private Statistics statistics = new Statistics();
    private List<Attack> attacks = new ArrayList<>();
    private CharacterStatus status;

    private String name;
    private String imageName;
    private int armor;                          //armor, blockrate
    private int blockRate;

    public BaseCharacter(String name, int maxHitpoints, int maxSpellpoints, String imageName) {
        this.name = name;
        this.status = new CharacterStatus(maxHitpoints, maxSpellpoints);
        this.imageName = imageName;
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
        return "BaseCharacter";
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
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
