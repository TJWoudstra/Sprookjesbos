package nl.woudstra.sprookjesbos.GUI;

import nl.woudstra.sprookjesbos.characters.Knight;
import nl.woudstra.sprookjesbos.characters.MainCharacter;

import javax.swing.*;

import static org.junit.Assert.*;

/**
 * Created by Tieme & Sylvia on 3-5-2017.
 */
public class SprookjebosFrameTest {
    public static void main(String[] args){
        MainCharacter[] mainCharacters = new MainCharacter[5];
        System.out.println(mainCharacters.length);

        for (int i = 0;i<mainCharacters.length;i++){
            mainCharacters[i] = new Knight();
        }
        mainCharacters[0].setName("Tieme");
        mainCharacters[0].incrementLevel();
        mainCharacters[1].setName("Sylvia");
        mainCharacters[2].setName("Bouke");
        mainCharacters[2].incrementLevel();
        mainCharacters[2].incrementLevel();
        mainCharacters[3].setName("Friso");
        mainCharacters[3].incrementLevel();
        mainCharacters[4].setName("Jiske");

        SprookjebosFrame sprookjebosFrame = new SprookjebosFrame();
        sprookjebosFrame.startBatle();
        sprookjebosFrame.setVisible(true);

        for (int i = 0;i<mainCharacters.length;i++){
            sprookjebosFrame.getBattlepanel().getCharacterInformation().getCharacterInformation(i).setHpText(mainCharacters[i].getHitPoints()+" / "+mainCharacters[i].getMaxHitPoints());
            sprookjebosFrame.getBattlepanel().getCharacterInformation().getCharacterInformation(i).setSpText(mainCharacters[i].getSpellPoints()+" / "+mainCharacters[i].getMaxSpellPoints());
            sprookjebosFrame.getBattlepanel().getCharacterInformation().getCharacterInformation(i).setCharacterLabel("  "+mainCharacters[i].getType());
            sprookjebosFrame.getBattlepanel().getCharacterInformation().getCharacterInformation(i).setNameLabel(mainCharacters[i].getName());
        }

    }
}