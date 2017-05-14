package nl.woudstra.sprookjesbos;

import nl.woudstra.sprookjesbos.characters.player.Knight;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Tieme on 29-4-2017.
 */
public class KnightTest {

    @Test
    public void itShouldInitializeCorrectly(){
        Knight knight = new Knight("TestKnight");
        assertEquals("TestKnight",knight.getName());
        assertEquals(0, knight.getStatus().getLevel());
        assertEquals(200, knight.getStatus().getHitPoints());
        assertEquals(200, knight.getStatus().getMaxHitPoints());
        assertEquals(20, knight.getStatus().getSpellPoints());
        assertEquals(20, knight.getStatus().getMaxSpellPoints());
        knight.getStatus().incrementLevel();
        assertEquals(1, knight.getStatus().getLevel());
        assertEquals(210, knight.getStatus().getHitPoints());
        assertEquals(210, knight.getStatus().getMaxHitPoints());
        assertEquals(21, knight.getStatus().getSpellPoints());
        assertEquals(21, knight.getStatus().getMaxSpellPoints());
        knight.getStatus().incrementLevel();
        assertEquals(2, knight.getStatus().getLevel());
        assertEquals(220, knight.getStatus().getHitPoints());
        assertEquals(220, knight.getStatus().getMaxHitPoints());
    }
}