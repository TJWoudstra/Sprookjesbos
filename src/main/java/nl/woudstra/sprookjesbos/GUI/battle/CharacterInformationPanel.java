package nl.woudstra.sprookjesbos.GUI.battle;

import nl.woudstra.sprookjesbos.characters.BaseCharacter;
import nl.woudstra.sprookjesbos.characters.player.Player;

import javax.swing.*;
import java.awt.*;
import java.util.List;
import java.util.ArrayList;

/**
 * Created by Tieme on 3-5-2017.
 */
public class CharacterInformationPanel extends JPanel {
    private List<Player> players;
    private List<CharacterInformation> characterInformations = new ArrayList<>();
    private AttackPanel attackPanel;

    //constructor
    public CharacterInformationPanel(List<Player> players){
        this.players = players;
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS ));

        javax.swing.border.Border border = BorderFactory.createEmptyBorder(5,5,5,5);
        setBorder(border);

        setBackground(Color.lightGray);

        for(Player player : players){
            CharacterInformation ci = new CharacterInformation();
            ci.setCharacterLabel(player.getType());
            ci.setNameLabel(player.getName());
            ci.setHpText(player.getStatus().getHitPoints() + " / " + player.getStatus().getMaxHitPoints());
            ci.setSpText(player.getStatus().getSpellPoints() + " / " + player.getStatus().getMaxSpellPoints());
            characterInformations.add(ci);
            add(ci);
        }

        attackPanel = new AttackPanel(players.get(0));
        add(attackPanel);

        add(new JLabel(" "));
    }

}
