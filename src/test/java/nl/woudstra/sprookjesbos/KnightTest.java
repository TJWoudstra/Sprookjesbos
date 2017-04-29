package nl.woudstra.sprookjesbos;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Tieme on 29-4-2017.
 */
public class KnightTest {

    @Test
    // Test the initial values and check the values after increase of level
    public void itShouldInitializeCorrectly(){
        Knight knight = new Knight();
        assertEquals(0, knight.level);
        assertEquals(200, knight.hitPoints);
        assertEquals(200, knight.maxHitPoints);
        assertEquals(20, knight.spellPoints);
        assertEquals(20, knight.maxSpellPoints);
        knight.growLevel();
        assertEquals(1, knight.level);
        assertEquals(210, knight.hitPoints);
        assertEquals(210, knight.maxHitPoints);
        assertEquals(21, knight.spellPoints);
        assertEquals(21, knight.maxSpellPoints);
    }
}