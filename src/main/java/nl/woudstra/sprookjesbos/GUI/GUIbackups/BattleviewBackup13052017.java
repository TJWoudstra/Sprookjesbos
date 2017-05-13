package nl.woudstra.sprookjesbos.GUI.GUIbackups;

import nl.woudstra.sprookjesbos.characters.MainCharacter;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

/**
 * Created by Tieme & Sylvia on 2-5-2017.
 */
public class BattleviewBackup13052017 extends JPanel {
    private MainCharacter[] mainCharacters;

    private BufferedImage backgroundBattle;
    private BufferedImage knightImage;

    public BattleviewBackup13052017(MainCharacter[] mainCharacters) {
        this.mainCharacters = mainCharacters;
        try {
            backgroundBattle = ImageIO.read(getClass().getResource("/images/Weiland.jpg"));
            knightImage = ImageIO.read(getClass().getResource("/images/Knight.gif"));

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
        Image scaledKnight = knightImage.getScaledInstance(x / 13,y / 10,Image.SCALE_SMOOTH );

        g.drawImage(scaledBackground, 0, 0, this); // see javadoc for more info on the parameters

        g.drawImage(scaledKnight,x1, y1,this);

    }
}
