package nl.woudstra.sprookjesbos.GUI;

import nl.woudstra.sprookjesbos.GUI.Batle.Battleview;
import nl.woudstra.sprookjesbos.GUI.Batle.CharacterInformationPanel;
import nl.woudstra.sprookjesbos.GUI.Batle.InformationPanel;
import nl.woudstra.sprookjesbos.characters.MainCharacter;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Tieme & Sylvia on 3-5-2017.
 */
public class Battlepanel extends JPanel {
    private MainCharacter[] mainCharacters;

    private InformationPanel informationPanel;                  //south
    private Battleview battleview;                              //center
    private CharacterInformationPanel characterInformationPanel;     //east

    //getters
    public InformationPanel getInformationPanel() {
        return informationPanel;
    }

    public Battleview getBattleview() {
        return battleview;
    }

    public CharacterInformationPanel getCharacterInformation() {
        return characterInformationPanel;
    }

    //constructor

    public Battlepanel(MainCharacter[] mainCharacters){
        this.mainCharacters = mainCharacters;
        setLayout(new BorderLayout());    //layout

        informationPanel = new InformationPanel();    //informationPanel
        add(BorderLayout.SOUTH, informationPanel);

        battleview = new Battleview(mainCharacters);   //battleview
        add(BorderLayout.CENTER, battleview);

        characterInformationPanel = new CharacterInformationPanel(mainCharacters);  //characterinformation
        add(BorderLayout.EAST, characterInformationPanel);
    }

}
