package nl.woudstra.sprookjesbos.GUI;

import nl.woudstra.sprookjesbos.GUI.battle.Battleview;
import nl.woudstra.sprookjesbos.GUI.battle.CharacterInformationPanel;
import nl.woudstra.sprookjesbos.GUI.battle.InformationPanel;
import nl.woudstra.sprookjesbos.characters.Team;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Tieme & Sylvia on 3-5-2017.
 */
public class Battlepanel extends JPanel {
    private Team player;

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

    public Battlepanel(Team player){
        this.player = player;
        setLayout(new BorderLayout());    //layout

        informationPanel = new InformationPanel();    //informationPanel
        add(BorderLayout.SOUTH, informationPanel);

        battleview = new Battleview(player);   //battleview
        add(BorderLayout.CENTER, battleview);

        characterInformationPanel = new CharacterInformationPanel(player);  //characterinformation
        add(BorderLayout.EAST, characterInformationPanel);
    }

}
