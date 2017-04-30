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
        assertEquals(0, knight.getLevel());
        assertEquals(200, knight.getHitPoints());
        assertEquals(200, knight.getMaxHitPoints());
        assertEquals(20, knight.getSpellPoints());
        assertEquals(20, knight.getMaxSpellPoints());
        knight.incrementLevel();
        assertEquals(1, knight.getLevel());
        assertEquals(210, knight.getHitPoints());
        assertEquals(210, knight.getMaxHitPoints());
        assertEquals(21, knight.getSpellPoints());
        assertEquals(21, knight.getMaxSpellPoints());
        knight.incrementLevel();
        assertEquals(2, knight.getLevel());
        assertEquals(220, knight.getHitPoints());
        assertEquals(220, knight.getMaxHitPoints());
    }
}