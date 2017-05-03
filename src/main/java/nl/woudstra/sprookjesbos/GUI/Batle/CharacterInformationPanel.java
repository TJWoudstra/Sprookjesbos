package nl.woudstra.sprookjesbos.GUI.Batle;

import javafx.scene.layout.Border;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Tieme on 3-5-2017.
 */
public class CharacterInformationPanel extends JPanel {

    private CharacterInformation[] characterInformation;

    public CharacterInformation[] getCharacterInformation() {
        return characterInformation;
    }

    public CharacterInformationPanel(){
        setLayout(new GridLayout(6, 1, 10, 10));
        javax.swing.border.Border border = BorderFactory.createEmptyBorder(5,5,5,5);
        setBorder(border);

        setBackground(Color.lightGray);

        characterInformation = new CharacterInformation[5];

        for(int i = 0; i < characterInformation.length; i++){
            characterInformation[i] = new CharacterInformation();
            add(characterInformation[i]);
        }

        add(new JButton("button"));

    }
}
