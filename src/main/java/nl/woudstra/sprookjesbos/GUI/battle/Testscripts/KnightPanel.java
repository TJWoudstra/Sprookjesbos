package nl.woudstra.sprookjesbos.GUI.battle.Testscripts;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

/**
 * Created by Tieme & Sylvia on 7-5-2017.
 */
public class KnightPanel extends JPanel {
    private BufferedImage knightImage;
    int x, y;

    public KnightPanel(int x, int y) {
        setSize(x, y);
        this.x = x;
        this.y = y;
        try {
            knightImage = ImageIO.read(getClass().getResource("/images/Knight.gif"));

        } catch (IOException ex) {
            // handle exception...
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Image scaledKnight = knightImage.getScaledInstance(x / 13,y / 10,Image.SCALE_SMOOTH );

        g.drawImage(scaledKnight,0, 0,this);

    }
}


