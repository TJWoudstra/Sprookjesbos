package nl.woudstra.sprookjesbos.GUI.battle;

import nl.woudstra.sprookjesbos.characters.Team;
import nl.woudstra.sprookjesbos.characters.Character;

import javax.swing.*;
import java.awt.*;
import java.util.List;
import java.util.ArrayList;

/**
 * Created by Tieme on 3-5-2017.
 */
public class CharacterInformationPanel extends JPanel {
    private Team player;
    private List<CharacterInformation> characterInformations = new ArrayList<>();
    private AttackPanel attackPanel;

    //constructor
    public CharacterInformationPanel(Team player){
        this.player = player;
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS ));

        javax.swing.border.Border border = BorderFactory.createEmptyBorder(5,5,5,5);
        setBorder(border);

        setBackground(Color.lightGray);

        for(Character character : player.getCharacters()){
            CharacterInformation ci = new CharacterInformation();
            ci.setCharacterLabel(character.getType());
            ci.setNameLabel(character.getName());
            ci.setHpText(character.getStatus().getHitPoints() + " / " + character.getStatus().getMaxHitPoints());
            ci.setSpText(character.getStatus().getSpellPoints() + " / " + character.getStatus().getMaxSpellPoints());
            characterInformations.add(ci);
            add(ci);
            attackPanel = new AttackPanel(character);
            add(attackPanel);
        }

        add(new JLabel(" "));
    }

}
