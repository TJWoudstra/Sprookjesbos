package nl.woudstra.sprookjesbos;

import nl.woudstra.sprookjesbos.characters.*;
import nl.woudstra.sprookjesbos.characters.enemies.TestEnemy;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Tieme & Sylvia on 30-4-2017.
 */
public class AttackTest {

    @Test
    public void enemyShouldDieAfter3Attacks(){
        Knight knight = new Knight();
        TestEnemy testEnemy = new TestEnemy();

        knight.simpleAttack(testEnemy);
        knight.simpleAttack(testEnemy);
        knight.simpleAttack(testEnemy);
        assertEquals(false, testEnemy.status.isAlive());
        assertEquals(0, testEnemy.getHitPoints());
    }

}