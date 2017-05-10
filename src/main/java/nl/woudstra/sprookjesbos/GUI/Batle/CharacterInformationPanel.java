package nl.woudstra.sprookjesbos.GUI.Batle;

import nl.woudstra.sprookjesbos.characters.MainCharacter;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Tieme on 3-5-2017.
 */
public class CharacterInformationPanel extends JPanel {
    private MainCharacter[] mainCharacters;
    private CharacterInformation[] characterInformation;
    private AttackPanel attackPanel;

    public CharacterInformation getCharacterInformation(int character) {
        return characterInformation[character];
    }

    //constructor
    public CharacterInformationPanel(MainCharacter[] mainCharacters){
        this.mainCharacters = mainCharacters;
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS ));

        javax.swing.border.Border border = BorderFactory.createEmptyBorder(5,5,5,5);
        setBorder(border);

        setBackground(Color.lightGray);

        characterInformation = new CharacterInformation[mainCharacters.length];

        for(int i = 0; i < characterInformation.length; i++){
            characterInformation[i] = new CharacterInformation();

            characterInformation[i].setCharacterLabel(mainCharacters[i].getType());
            characterInformation[i].setNameLabel(mainCharacters[i].getName());
            characterInformation[i].setHpText(mainCharacters[i].hpText());
            characterInformation[i].setSpText(mainCharacters[i].spText());

            add(characterInformation[i]);
        }
        add(new JLabel(" "));

    }

    public void setAttackPanel(MainCharacter mainCharacter){
        attackPanel = new AttackPanel(mainCharacter);
        add(attackPanel);
    }
}
