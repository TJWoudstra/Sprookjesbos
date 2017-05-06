package nl.woudstra.sprookjesbos.GUI.Batle;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

/**
 * Created by Tieme & Sylvia on 2-5-2017.
 */
public class Battleview extends JPanel {

    private BufferedImage backgroundBattle;
    private BufferedImage knightImage;

    public Battleview() {
        try {
            backgroundBattle = ImageIO.read(getClass().getResource("/images/Weiland.JPG"));
            knightImage = ImageIO.read(getClass().getResource("/images/Knight.JPG"));

        } catch (IOException ex) {
            // handle exception...
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        int x = super.getWidth();
        int y = super.getHeight();

        int x1 = (int) (0.8 * x);
        int y1 = (int) (0.3 * y);

        Image scaledBackground = backgroundBattle.getScaledInstance(x,y,Image.SCALE_SMOOTH);
        Image scaledKnight = knightImage.getScaledInstance(x / 10,y / 10,Image.SCALE_SMOOTH );

        g.drawImage(scaledBackground, 0, 0, this); // see javadoc for more info on the parameters

        g.drawImage(scaledKnight,x1, y1,this);

    }
}
