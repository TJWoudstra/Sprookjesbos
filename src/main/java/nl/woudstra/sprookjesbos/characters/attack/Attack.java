package nl.woudstra.sprookjesbos.characters.attack;

import nl.woudstra.sprookjesbos.characters.Character;

/**
 * Created by bouke on 13-5-17.
 */
public interface Attack {
    void attack(Character character);
    void setSeed(long seed);
    String getDescription();
}
