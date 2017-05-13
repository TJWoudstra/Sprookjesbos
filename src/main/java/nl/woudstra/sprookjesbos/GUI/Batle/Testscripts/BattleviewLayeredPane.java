package nl.woudstra.sprookjesbos.GUI.Batle.Testscripts;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

/**
 * Created by Tieme & Sylvia on 2-5-2017.
 */
public class BattleviewLayeredPane extends JLayeredPane {

    private BufferedImage backgroundBattle;
    public int x;
    public int y;


    public BattleviewLayeredPane() {
        try {
            backgroundBattle = ImageIO.read(getClass().getResource("/images/Weiland.jpg"));

        } catch (IOException ex) {
            // handle exception...
        }
        x = getWidth();
        y = getHeight();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);



        int x1 = (int) (0.8 * x);
        int y1 = (int) (0.3 * y);

        Image scaledBackground = backgroundBattle.getScaledInstance(x,y,Image.SCALE_SMOOTH);

        g.drawImage(backgroundBattle, 0, 0, this); // see javadoc for more info on the parameters

    }
}
