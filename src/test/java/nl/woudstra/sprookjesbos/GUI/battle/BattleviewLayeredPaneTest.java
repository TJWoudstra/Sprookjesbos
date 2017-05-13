package nl.woudstra.sprookjesbos.GUI.battle;

import nl.woudstra.sprookjesbos.GUI.battle.Testscripts.BattleviewLayeredPane;
import nl.woudstra.sprookjesbos.GUI.battle.Testscripts.KnightPanel;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Tieme & Sylvia on 7-5-2017.
 */
public class BattleviewLayeredPaneTest {
    public static void main(String [] args){
        JFrame frame = new JFrame();
        frame.setSize(1000, 1000);

        BattleviewLayeredPane battleviewLayeredPane = new BattleviewLayeredPane();

        KnightPanel knightPanel = new KnightPanel(battleviewLayeredPane.x, battleviewLayeredPane.y);

        battleviewLayeredPane.add(knightPanel, 1);

        frame.add(BorderLayout.CENTER, battleviewLayeredPane);



        frame.setVisible(true);
    }

}