package nl.woudstra.sprookjesbos;

/**
 * Created by Tieme on 28-4-2017.
 */
public abstract class MainCharacter extends Character {
    public static int totalMainCharacters;
    public static int totalMainCharactersAlive;

    String name;
    int experience;
    int basicHitPoints;
    int additionalHitpoints;
    int basicSpellPoints;
    int additionalSpellPoints;

    //wapens die character kan dragen nog verder uitwerken
    boolean canHandleSword;
    boolean canWearShield;

    //items nog verder aanvullen met Shield, Shoes, Ring1, Ring2, Amulet, Armor, Helmet
    Weapon weapon;

    public MainCharacter() {
        totalMainCharacters++;
        totalMainCharactersAlive++;
        name = "Character" + totalMainCharacters;

    }
    //hitpoints herzien vanwege hitpoints door items
    public void growLevel(){
        hitPoints = (int) (1.05 * hitPoints);
        basicHitPoints = (int) (1.05 * basicHitPoints);
        maxHitPoints = basicHitPoints + additionalHitpoints;
        spellPoints = (int) (1.05 * spellPoints);
        basicSpellPoints = (int) (1.05 * basicSpellPoints);
        maxSpellPoints = basicSpellPoints + additionalSpellPoints;
        level++;
    }

    public void attack(Character character) {
        //zonder wapen
        if (weapon == null) {
            //indien niet raak
            if (Math.random() < 0.3) {
                System.out.println("Miss!");
            } else {
                System.out.println("Aanval zonder wapen"); // nog verder uitwerken!!!!
            }
        }
            //met wapen
        else{
                if (100 * Math.random() > weapon.changeOfHit) {   // indien niet raak
                    System.out.println("Miss!");
                } else {
                    boolean criticalHit = 100 * Math.random() < weapon.criticalHitRate;
                    if (criticalHit) {
                        int damage;  // veel verder uitwerken
                    }
                }
            }
        }

    public void simpleAttack(Character character){
        int damage = 20 + (int) (Math.random() * 10);
        System.out.println("damage: " + damage );
        character.hitPoints -= damage;
        if(character.hitPoints < 0){
            character.hitPoints = 0;
            character.isAlive = false;
        }
    }
}
