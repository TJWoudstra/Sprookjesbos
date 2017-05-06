package nl.woudstra.sprookjesbos.GUI;

import nl.woudstra.sprookjesbos.GUI.Batle.Battleview;
import nl.woudstra.sprookjesbos.GUI.Batle.CharacterInformationPanel;
import nl.woudstra.sprookjesbos.GUI.Batle.InformationPanel;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Tieme & Sylvia on 3-5-2017.
 */
public class Battlepanel extends JPanel {
    private InformationPanel informationPanel;                  //south
    private Battleview battleview;                              //center
    private CharacterInformationPanel characterInformationPanel;     //east

    public InformationPanel getInformationPanel() {
        return informationPanel;
    }

    public Battleview getBattleview() {
        return battleview;
    }

    public CharacterInformationPanel getCharacterInformation() {
        return characterInformationPanel;
    }


    public Battlepanel(){
        setLayout(new BorderLayout());    //layout

        informationPanel = new InformationPanel();    //informationPanel
        add(BorderLayout.SOUTH, informationPanel);

        // battleview werkt nog niet
        battleview = new Battleview();
        add(BorderLayout.CENTER, battleview);

        characterInformationPanel = new CharacterInformationPanel();  //characterinformation
        add(BorderLayout.EAST, characterInformationPanel);
    }

}
