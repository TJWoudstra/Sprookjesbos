package nl.woudstra.sprookjesbos.characters.enemies;

import nl.woudstra.sprookjesbos.characters.Character;

/**
 * Created by Tieme on 28-4-2017.
 */
public class TestEnemy extends Enemy {
    public TestEnemy(int x, int y) {
        super(x, y);
        setMaxHitPoints(50);
        setHitPoints(50);
    }
}
