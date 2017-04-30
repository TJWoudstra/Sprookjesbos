package nl.woudstra.sprookjesbos;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Tieme on 29-4-2017.
 */
public class KnightTest {

    @Test
    public void itShouldInitializeCorrectly(){
        Knight knight = new Knight();
        assertEquals(0, knight.level);
        assertEquals(200, knight.hitPoints);
        assertEquals(200, knight.maxHitPoints);
        assertEquals(20, knight.spellPoints);
        assertEquals(20, knight.maxSpellPoints);
        System.out.println("Knight level: "+ knight.level);
        System.out.println("hitpoints: " + knight.hitPoints + "/" + knight.maxHitPoints);
        System.out.println("spellpoints: " + knight.spellPoints + "/" + knight.maxSpellPoints);
        knight.incrementLevel();
        System.out.println("Knight level: "+ knight.level);
        System.out.println("hitpoints: " + knight.hitPoints + "/" + knight.maxHitPoints);
        System.out.println("spellpoints: " + knight.spellPoints + "/" + knight.maxSpellPoints);
    }
}