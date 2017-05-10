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

        SprookjebosFrame sprookjebosFrame = new SprookjebosFrame();
        sprookjebosFrame.setMainCharacters();
        sprookjebosFrame.startBatle();

        sprookjebosFrame.getBattlepanel().getCharacterInformation().setAttackPanel(sprookjebosFrame.getMaincharacter(0));
        sprookjebosFrame.setVisible(true);
        }

    }
