package nl.woudstra.sprookjesbos.GUI.battle;

import nl.woudstra.sprookjesbos.characters.BaseCharacter;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Tieme on 10-5-2017.
 */
public class AttackPanel extends JPanel {
    private JButton attackButton, specialMove1Button, specialMove2Button, specialMove3Button, itemButton;
    private BaseCharacter baseCharacter;
    private JLabel titleLabel;

    public AttackPanel(BaseCharacter baseCharacter){
        this.baseCharacter = baseCharacter;

        if(!baseCharacter.getAttacks().isEmpty()){
            attackButton = new JButton(baseCharacter.getAttacks().get(0).getDescription());
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
