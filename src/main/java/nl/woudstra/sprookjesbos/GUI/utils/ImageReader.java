package nl.woudstra.sprookjesbos.GUI.utils;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.nio.file.Paths;

/**
 * Created by bouke on 13-5-17.
 */
public class ImageReader {

    public static BufferedImage getBufferedImage(String imageName){
        BufferedImage image = null;

        try {
            image = ImageIO.read(ClassLoader.getSystemResourceAsStream("images/" + imageName));
        } catch(Exception e){
            System.out.println("Failed to load image: " + imageName);
        }

        return image;
    }

    public static Image getImage(String imageName, int x, int y, int imageScale){
        BufferedImage image = getBufferedImage(imageName);
        return image.getScaledInstance(x, y, imageScale);
    }
}
