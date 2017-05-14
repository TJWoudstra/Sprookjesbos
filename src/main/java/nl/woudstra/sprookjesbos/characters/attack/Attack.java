package nl.woudstra.sprookjesbos.characters.attack;

import nl.woudstra.sprookjesbos.characters.BaseCharacter;

/**
 * Created by bouke on 13-5-17.
 */
public interface Attack {
    void attack(BaseCharacter baseCharacter);
    void setSeed(long seed);
    String getDescription();
}
