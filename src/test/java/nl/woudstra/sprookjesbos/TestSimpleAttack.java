package nl.woudstra.sprookjesbos;

import nl.woudstra.sprookjesbos.characters.Knight;
import nl.woudstra.sprookjesbos.characters.enemies.TestEnemy;

/**
 * Created by Tieme on 28-4-2017.
 */
public class TestSimpleAttack {
    public static void main(String [] args){
        Knight knight = new Knight();
        TestEnemy testEnemy = new TestEnemy();

        System.out.println("start HP van enemy: " + testEnemy.getHitPoints());
        knight.simpleAttack(testEnemy);
        System.out.println("hitpoints enemy: "+ testEnemy.getHitPoints());
        System.out.println("enemy nog in leven: "+ testEnemy.status.isAlive());
        knight.simpleAttack(testEnemy);
        System.out.println("hitpoints enemy: "+ testEnemy.getHitPoints());
        System.out.println("enemy nog in leven: "+ testEnemy.status.isAlive());
        knight.simpleAttack(testEnemy);
        System.out.println("hitpoints enemy: "+ testEnemy.getHitPoints());
        System.out.println("enemy nog in leven: "+ testEnemy.status.isAlive());
    }
}
