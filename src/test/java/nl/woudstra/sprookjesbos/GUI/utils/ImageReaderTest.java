package nl.woudstra.sprookjesbos.GUI.utils;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by bouke on 13-5-17.
 */
public class ImageReaderTest {
    @Test
    public void getBufferedImage() throws Exception {
        assertTrue(ImageReader.getBufferedImage("Knight.gif") != null);
    }

}