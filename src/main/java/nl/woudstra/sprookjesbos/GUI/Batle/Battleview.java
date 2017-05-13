package nl.woudstra.sprookjesbos.GUI.Batle;

import nl.woudstra.sprookjesbos.characters.MainCharacter;
import nl.woudstra.sprookjesbos.characters.enemies.AngryBird;
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
    private Image[] scaledEnemyImages;
    private Image scaledBackGroundImage;

    private double[] y1;     // for x,y position maincharacters
    private double[] x1;


    private BufferedImage backgroundBattle;
    private BufferedImage knightImage;

    public Battleview(MainCharacter[] mainCharacters) {
        enemies = new Enemy[]{new AngryBird(1,1), new AngryBird(3,3)};         //temporary for testing

        y1 = new double[]{0.25, 0.4, 0.55, 0.7, 0.85};                         //x, y positions maincharacters
        x1 = new double[]{0.83, 0.9};

        this.mainCharacters = mainCharacters;
        try {
            backgroundBattle = ImageIO.read(getClass().getResource("/images/Weiland.JPG"));

            for(int i = 0; i < mainCharacters.length;i++){                    //load images maincharacters
                mainCharacters[i].setCharacterImage(ImageIO.read(getClass().getResource(mainCharacters[i].getImageLocation())));
            }

            for(int i = 0;i<enemies.length;i++){
                enemies[i].setCharacterImage(ImageIO.read(getClass().getResource(enemies[i].getImageLocation())));
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

        scaledBackGroundImage = backgroundBattle.getScaledInstance(x,y,Image.SCALE_SMOOTH);   //images scaled on screenwidth/height

        scaledMainCharacterImages = new Image[mainCharacters.length];
        for(int i = 0; i < mainCharacters.length;i++){
            scaledMainCharacterImages[i] = mainCharacters[i].getCharacterImage().getScaledInstance(x / 13,y / 10,Image.SCALE_SMOOTH );
        }

        scaledEnemyImages = new Image[enemies.length];
        for(int i = 0;i<enemies.length;i++){
            scaledEnemyImages[i] = enemies[i].getCharacterImage().getScaledInstance(x / 13,y / 10,Image.SCALE_SMOOTH );
        }

        g.drawImage(scaledBackGroundImage, 0, 0, this);                        // draw scaled background, maincharacters, enemies
        for(int i = 0; i < mainCharacters.length;i++){
            if(mainCharacters[i].isFrontPosition()){
                g.drawImage(scaledMainCharacterImages[i],((int) (x1[0] * x)),((int) (y1[i] * y)),this);
            } else{
                g.drawImage(scaledMainCharacterImages[i],((int) (x1[1] * x)),((int) (y1[i] * y)),this);
            }
        }
        for(int i = 0; i<enemies.length;i++){
            g.drawImage(scaledEnemyImages[i],0,((int) (y1[enemies[i].getY_position()-1] * y)),this);
        }
    }
}
