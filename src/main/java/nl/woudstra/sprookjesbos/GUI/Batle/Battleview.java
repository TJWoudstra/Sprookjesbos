package nl.woudstra.sprookjesbos.GUI.Batle;

import nl.woudstra.sprookjesbos.characters.MainCharacter;
import nl.woudstra.sprookjesbos.characters.enemies.Enemy;
import nl.woudstra.sprookjesbos.characters.enemies.TestEnemy;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

/**
 * Created by Tieme & Sylvia on 2-5-2017.
 */
public class Battleview extends JPanel {
    private MainCharacter[] mainCharacters;
    private Enemy[] enemies;
    private Image[] scaledMainCharacterImages;
    private Image scaledBackGroundImage;


    private BufferedImage backgroundBattle;
    private BufferedImage knightImage;

    public Battleview(MainCharacter[] mainCharacters) {
        enemies = new Enemy[]{new TestEnemy()};         //tijdelijk om te testen

        this.mainCharacters = mainCharacters;
        try {
            backgroundBattle = ImageIO.read(getClass().getResource("/images/Weiland.JPG"));
            for(int i = 0; i < mainCharacters.length;i++){
                mainCharacters[i].setCharacterImage(ImageIO.read(getClass().getResource(mainCharacters[i].getImageLocation())));
            }

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

        scaledBackGroundImage = backgroundBattle.getScaledInstance(x,y,Image.SCALE_SMOOTH);

        Image scaledKnight = mainCharacters[0].getCharacterImage().getScaledInstance(x / 13,y / 10,Image.SCALE_SMOOTH );

        g.drawImage(scaledBackGroundImage, 0, 0, this); // see javadoc for more info on the parameters

        g.drawImage(scaledKnight,x1, y1,this);


    }
}
