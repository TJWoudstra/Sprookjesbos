package nl.woudstra.sprookjesbos.GUI;

import nl.woudstra.sprookjesbos.characters.Team;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Tieme & Sylvia on 3-5-2017.
 */
public class SprookjebosFrame extends JFrame {
    private Battlepanel battlepanel;

    public SprookjebosFrame(Team player){
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sprookjesbos V0.1");
        setMinimumSize(new Dimension(1200,700));
        battlepanel = new Battlepanel(player);
        add(BorderLayout.CENTER, battlepanel);
    }

    public Battlepanel getBattlepanel() {
        return battlepanel;
    }


}
