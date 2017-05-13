package nl.woudstra.sprookjesbos.GUI.battle;

import nl.woudstra.sprookjesbos.characters.Character;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Tieme on 10-5-2017.
 */
public class AttackPanel extends JPanel {
    private JButton attackButton, specialMove1Button, specialMove2Button, specialMove3Button, itemButton;
    private Character character;
    private JLabel titleLabel;

    public AttackPanel(Character character){
        this.character = character;

        if(!character.getAttacks().isEmpty()){
            attackButton = new JButton(character.getAttacks().get(0).getDescription());
        }
        attackButton.addActionListener(new AttackListener());

        itemButton = new JButton("Use item");
        itemButton.addActionListener(new ItemListener());

        super.setLayout(new BoxLayout(this, BoxLayout.X_AXIS));

        add(attackButton);
        add(itemButton);

    }

    class AttackListener implements ActionListener{
        public void actionPerformed(ActionEvent event){
           //hier moet aanval komen
        }
    }
    class ItemListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            // hier moet item kunnen worden gekozen
        }
    }
}
