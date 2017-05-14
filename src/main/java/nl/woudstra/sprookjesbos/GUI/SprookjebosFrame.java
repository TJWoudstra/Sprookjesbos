package nl.woudstra.sprookjesbos.GUI;

import nl.woudstra.sprookjesbos.characters.enemies.Enemy;
import nl.woudstra.sprookjesbos.characters.player.Player;

import java.util.List;
import javax.swing.*;
import java.awt.*;

/**
 * Created by Tieme & Sylvia on 3-5-2017.
 */
public class SprookjebosFrame extends JFrame {
    private Battlepanel battlepanel;

    public SprookjebosFrame(List<Player> players, List<Enemy> enemies){
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sprookjesbos V0.1");
        setMinimumSize(new Dimension(1200,700));
        battlepanel = new Battlepanel(players, enemies);
        add(BorderLayout.CENTER, battlepanel);
    }

    public Battlepanel getBattlepanel() {
        return battlepanel;
    }


}
