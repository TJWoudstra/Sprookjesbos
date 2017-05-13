package nl.woudstra.sprookjesbos.GUI.battle;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

/**
 * Created by Tieme on 3-5-2017.
 */
public class CharacterInformation extends JPanel {
    JTextField hpText, spText;

    JLabel hpLabel, spLabel, characterLabel, nameLabel;

    //setters
    public void setHpText(String hpText) {
        this.hpText.setText(hpText);
    }

    public void setSpText(String spText) {
        this.spText.setText(spText);
    }

    public void setCharacterLabel(String characterLabel) {
        this.characterLabel.setText(characterLabel);
    }

    public void setNameLabel(String nameLabel) {
        this.nameLabel.setText(nameLabel);
    }

    //constructor
    public CharacterInformation(){
        setLayout(new GridLayout(3,2,10,10));   //set layout
        Border border = BorderFactory.createEmptyBorder(5,5,5,5);
        setBackground(Color.lightGray);
        setMaximumSize(new Dimension(300, 80));

        characterLabel = new JLabel("  Type");   //initialize textfields & labels
        nameLabel = new JLabel("Name");

        hpText = new JTextField(10);
        hpText.setEditable(false);
        spText = new JTextField(10);
        spText.setEditable(false);

        hpLabel = new JLabel("  HP:");
        spLabel = new JLabel("  SP:");

        add(characterLabel);                //add textfields & labels
        add(nameLabel);
        add(hpLabel);
        add(hpText);
        add(spLabel);
        add(spText);
    }
}
