package nl.woudstra.sprookjesbos.GUI.Batle;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Tieme on 3-5-2017.
 */
public class CharacterInformationPanel extends JPanel {

    private CharacterInformation[] characterInformation;

    public CharacterInformation getCharacterInformation(int character) {
        return characterInformation[character];
    }

    public CharacterInformationPanel(){
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS ));

        javax.swing.border.Border border = BorderFactory.createEmptyBorder(5,5,5,5);
        setBorder(border);

        setBackground(Color.lightGray);

        characterInformation = new CharacterInformation[5];

        for(int i = 0; i < characterInformation.length; i++){
            characterInformation[i] = new CharacterInformation();
            add(characterInformation[i]);
        }
        for(int i = 0;i<24;i++) {
            add(new JLabel(" "));
        }
    }
}
