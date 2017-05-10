package nl.woudstra.sprookjesbos.GUI.Batle;

import nl.woudstra.sprookjesbos.characters.MainCharacter;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Tieme on 10-5-2017.
 */
public class AttackPanel extends JPanel {
    private JButton attackButton, specialMove1Button, specialMove2Button, specialMove3Button, itemButton;
    private MainCharacter mainCharacter;
    private JLabel titleLabel;

    public AttackPanel(MainCharacter mainCharacter){
        this.mainCharacter = mainCharacter;

        titleLabel = new JLabel("Select move for "+ mainCharacter.getName());
        attackButton = new JButton("Attack");
        attackButton.addActionListener(new AttackListener());

        itemButton = new JButton("Item");
        itemButton.addActionListener(new ItemListener());

        super.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        add(titleLabel);
        add(new JLabel(" "));
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
