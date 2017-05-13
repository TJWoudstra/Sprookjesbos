package nl.woudstra.sprookjesbos.GUI.utils;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.nio.file.Paths;

/**
 * Created by bouke on 13-5-17.
 */
public class ImageReader {

    public static BufferedImage getImage(String imageName){
        BufferedImage image = null;

        try {
            image = ImageIO.read(ClassLoader.getSystemResourceAsStream("images/" + imageName));
        } catch(Exception e){
            System.out.println("Failed to load image: " + imageName);
        }

        return image;
    }
}
