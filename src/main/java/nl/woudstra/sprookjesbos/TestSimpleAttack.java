package nl.woudstra.sprookjesbos;

/**
 * Created by Tieme on 28-4-2017.
 */
public class TestSimpleAttack {
    public static void main(String [] args){
        Knight knight = new Knight();
        TestEnemy testEnemy = new TestEnemy();

        System.out.println("start HP van enemy: " + testEnemy.hitPoints);
        knight.simpleAttack(testEnemy);
        System.out.println("hitpoints enemy: "+ testEnemy.hitPoints);
        System.out.println("enemy nog in leven: "+ testEnemy.isAlive);
        knight.simpleAttack(testEnemy);
        System.out.println("hitpoints enemy: "+ testEnemy.hitPoints);
        System.out.println("enemy nog in leven: "+ testEnemy.isAlive);
        knight.simpleAttack(testEnemy);
        System.out.println("hitpoints enemy: "+ testEnemy.hitPoints);
        System.out.println("enemy nog in leven: "+ testEnemy.isAlive);
    }
}
