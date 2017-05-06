package nl.woudstra.sprookjesbos.GUI.Batle;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

/**
 * Created by Tieme on 3-5-2017.
 */
public class CharacterInformation extends JPanel {
    JTextField hpText, spText;

    JLabel hpLabel, spLabel, characterLabel, nameLabel;

    //getters & setters
    public JLabel getCharacterLabel() {
        return characterLabel;
    }

    public JLabel getNameLabel() {
        return nameLabel;
    }

    public JTextField getHpText() {
        return hpText;
    }

    public JTextField getSpText() {
        return spText;
    }

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

    public CharacterInformation(){
        setLayout(new GridLayout(3,2,10,10));   //set layout
        Border border = BorderFactory.createEmptyBorder(0,5,0,5);
        setBackground(Color.lightGray);

        characterLabel = new JLabel("  Type");   //initialize textfields & labels
        nameLabel = new JLabel("Name");

        hpText = new JTextField(10);
        spText = new JTextField(10);

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
