package nl.woudstra.sprookjesbos;

import nl.woudstra.sprookjesbos.characters.*;
import nl.woudstra.sprookjesbos.characters.enemies.TestEnemy;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static org.junit.Assert.*;

/**
 * Created by Tieme & Sylvia on 30-4-2017.
 */
public class AttackTest {

    @Test
    public void enemyShouldDieAfter2Attacks(){
        Knight knight = new Knight();
        TestEnemy testEnemy = new TestEnemy(1,1);

        knight.simpleAttack(testEnemy); // damage = 20 + 5, health = 50 - 25 = 25
        assertEquals(25, testEnemy.getHitPoints());
        assertEquals(true, testEnemy.status.isAlive());

        knight.simpleAttack(testEnemy); // damage = 20 + 8, health = 25 - 28 = -3, but cannot be negative
        assertEquals(0, testEnemy.getHitPoints());
        assertEquals(false, testEnemy.status.isAlive());
    }

    @Test
    public void testSeededRandom(){
        List<Integer> values = new ArrayList<Integer>();
        Random random = new Random(1);
        for(int i = 0;i<5;i++){
            values.add(random.nextInt(10));
        }
        assertEquals(new Integer(5), values.get(0));
        assertEquals(new Integer(8), values.get(1));
        assertEquals(new Integer(7), values.get(2));
        assertEquals(new Integer(3), values.get(3));
        assertEquals(new Integer(4), values.get(4));
    }

}