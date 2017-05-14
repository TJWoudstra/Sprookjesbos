package nl.woudstra.sprookjesbos.GUI;

import nl.woudstra.sprookjesbos.GUI.utils.ImageReader;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import javax.swing.JPanel;

/**
 * Created by Tieme on 3-5-2017.
 */
public class PlaatjeOefening extends JPanel{

    private BufferedImage image;

    public PlaatjeOefening() {
        image = ImageReader.getBufferedImage("Knight.JPG");
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.drawImage(image, 0, 0, this); // see javadoc for more info on the parameters
    }

}