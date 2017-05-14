package nl.woudstra.sprookjesbos.GUI.battle.Testscripts;

import nl.woudstra.sprookjesbos.GUI.utils.ImageReader;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

/**
 * Created by Tieme & Sylvia on 2-5-2017.
 */
public class BattleviewLayeredPane extends JLayeredPane {

    private BufferedImage backgroundBattle;
    public int x;
    public int y;


    public BattleviewLayeredPane() {
        backgroundBattle = ImageReader.getBufferedImage("Weiland.jpg");
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
