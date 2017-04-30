package nl.woudstra.sprookjesbos;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Tieme & Sylvia on 30-4-2017.
 */
public class battlemenu {
    public static void main(String[] args){
        Knight knight = new Knight();
        MainCharacter[] mainCharacters = new MainCharacter[MainCharacter.totalMainCharacters];

        JFrame frame = new JFrame();
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //message area south
        JTextArea messageField = new JTextArea(5, 20);
        messageField.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(messageField);
        messageField.setLineWrap(true);
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        frame.getContentPane().add(BorderLayout.SOUTH, scrollPane);

        //Panel east
        JPanel characterStatistics = new JPanel();
        characterStatistics.setBackground(Color.darkGray);
        characterStatistics.setLayout(new BoxLayout(characterStatistics, BoxLayout.Y_AXIS));

        JTextField nameText = new JTextField(knight.getName());
        JTextField hitpointsText = new JTextField("HP: "+ knight.getHitPoints() + "/" + knight.getMaxHitPoints());
        JTextField spellpointsField = new JTextField("SP: " + knight.getSpellPoints() + "/" + knight.getMaxSpellPoints());

        characterStatistics.add(nameText);
        characterStatistics.add(hitpointsText);
        characterStatistics.add(spellpointsField);

        frame.getContentPane().add(BorderLayout.EAST, characterStatistics);

        frame.setVisible(true);
    }
}
