package nl.woudstra.sprookjesbos;

import nl.woudstra.sprookjesbos.characters.MainCharacter;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Tieme & Sylvia on 30-4-2017.
 */
public class battlemenu {
    JFrame frame;
    JTextArea messageField;

    public void createMenu(){
        frame = new JFrame("Battle");
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //message area south
        messageField = new JTextArea(5, 20);
        messageField.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(messageField);
        messageField.setLineWrap(true);
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        frame.getContentPane().add(BorderLayout.SOUTH, scrollPane);

        //Panel east
        Box characterBox = new Box(BoxLayout.Y_AXIS);
        characterBox.setLayout(new BoxLayout(characterBox, BoxLayout.Y_AXIS));

        frame.getContentPane().add(BorderLayout.EAST, characterBox);
        frame.setVisible(true);


    }
    public void createCharacterPanel(MainCharacter mainCharacter){
        JPanel characterPanel = new JPanel();
        characterPanel.setLayout(new BoxLayout(characterPanel, BoxLayout.Y_AXIS));

        JTextField nameText = new JTextField(mainCharacter.getName());
        JTextField hitpointsText = new JTextField("HP: "+ mainCharacter.getHitPoints() + "/" + mainCharacter.getMaxHitPoints());
        JTextField spellpointsField = new JTextField("SP: " + mainCharacter.getSpellPoints() + "/" + mainCharacter.getMaxSpellPoints());

        characterPanel.add(nameText);
        characterPanel.add(hitpointsText);
        characterPanel.add(spellpointsField);
    }
}
