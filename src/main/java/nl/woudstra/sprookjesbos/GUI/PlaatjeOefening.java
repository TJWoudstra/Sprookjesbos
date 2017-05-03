package nl.woudstra.sprookjesbos.GUI;

/**
 * Created by Tieme on 3-5-2017.
 */

import java.awt.Graphics;
        import java.awt.image.BufferedImage;
        import java.io.File;
        import java.io.IOException;
        import java.util.logging.Level;
        import java.util.logging.Logger;
        import javax.imageio.ImageIO;
        import javax.swing.JPanel;

public class PlaatjeOefening extends JPanel{

    private BufferedImage image;

    public PlaatjeOefening() {
        try {
            image = ImageIO.read(new File("/src/afbeeldingen/Achtergrond.jpg"));
        } catch (IOException ex) {
            // handle exception...
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(image, 0, 0, this); // see javadoc for more info on the parameters
    }

}