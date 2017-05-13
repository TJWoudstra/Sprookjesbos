package nl.woudstra.sprookjesbos.GUI.battle;

import nl.woudstra.sprookjesbos.characters.Character;
import nl.woudstra.sprookjesbos.characters.Team;

import java.util.ArrayList;
import java.util.List;
import nl.woudstra.sprookjesbos.GUI.utils.ImageReader;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

/**
 * Created by Tieme & Sylvia on 2-5-2017.
 */
public class Battleview extends JPanel {
    private Team mainCharacters;
    private Team enemies;
    private List<BufferedImage> mainCharacterImages = new ArrayList<>();
    private Image scaledBackGroundImage;

    private BufferedImage backgroundBattle;
    private BufferedImage knightImage;

    public Battleview(Team mainCharacters) {
        enemies = new Team();
        enemies.addCharacter(new Character("Test enemy", 50, 50));
        this.mainCharacters = mainCharacters;

        backgroundBattle = ImageReader.getImage("Weiland.jpg");
        for(Character character : mainCharacters.getCharacters()){
            mainCharacterImages.add(ImageReader.getImage(character.getImageLocation()));
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

        Image scaledKnight = mainCharacterImages.get(0).getScaledInstance(x / 13,y / 10,Image.SCALE_SMOOTH );

        g.drawImage(scaledBackGroundImage, 0, 0, this); // see javadoc for more info on the parameters

        g.drawImage(scaledKnight,x1, y1,this);
    }
}
