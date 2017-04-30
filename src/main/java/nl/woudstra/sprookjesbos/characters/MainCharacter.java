package nl.woudstra.sprookjesbos.characters;

/**
 * Created by Tieme on 28-4-2017.
 */
public abstract class MainCharacter extends Character {
    public static int totalMainCharacters;
    public static int totalMainCharactersAlive;

    private String name;
    private int experience;
    final int mainCharacterID;

    private int basicHitPoints;       //maxHitPoints == basicHitpoints + addditionalHitpoints
    private int additionalHitpoints;
    private int basicSpellPoints;     //maxSpellPoints == basicSpellpoints + addditionalSpellpoints
    private int additionalSpellPoints;

    WeaponPossibilities weaponPossibilities;    //weapons a maincharacter can handle
    ArmorPossibilities armorPossibilities;      //armor a maincharacter can wear
    Equipment equipment;                        //weapon(s) and armor a character wears

    public MainCharacter() {
        totalMainCharacters++;
        mainCharacterID = totalMainCharacters - 1;
        totalMainCharactersAlive++;
        name = "Character" + totalMainCharacters;
        weaponPossibilities = new WeaponPossibilities();
        armorPossibilities = new ArmorPossibilities();
        equipment = new Equipment();
    }

    public void incrementLevel(){
        basicHitPoints = (int) (1.05 * basicHitPoints);
        setMaxHitPoints(basicHitPoints + additionalHitpoints);
        setHitPoints( (int) (1.05 * getHitPoints() ) );
        basicSpellPoints = (int) (1.05 * basicSpellPoints);
        setMaxSpellPoints(basicSpellPoints + additionalSpellPoints);
        setSpellPoints( (int) (1.05 * getSpellPoints() ) );
        setLevel(getLevel() + 1);
    }

    public void simpleAttack(Character character){
        int damage = 20 + (int) (Math.random() * 10);
        System.out.println("damage: " + damage );
        character.setHitPoints(character.getHitPoints() - damage);

        if(character.getHitPoints() == 0) character.status.setAlive(false);
    }

    //getters & setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getBasicHitPoints() {
        return basicHitPoints;
    }

    public void setBasicHitPoints(int basicHitPoints) {
        this.basicHitPoints = basicHitPoints;
    }

    public int getAdditionalHitpoints() {
        return additionalHitpoints;
    }

    public void setAdditionalHitpoints(int additionalHitpoints) {
        this.additionalHitpoints = additionalHitpoints;
    }

    public int getBasicSpellPoints() {
        return basicSpellPoints;
    }

    public void setBasicSpellPoints(int basicSpellPoints) {
        this.basicSpellPoints = basicSpellPoints;
    }

    public int getAdditionalSpellPoints() {
        return additionalSpellPoints;
    }

    public void setAdditionalSpellPoints(int additionalSpellPoints) {
        this.additionalSpellPoints = additionalSpellPoints;
    }
}
