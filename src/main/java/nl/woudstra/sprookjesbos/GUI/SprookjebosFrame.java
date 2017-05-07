package nl.woudstra.sprookjesbos.GUI;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Tieme & Sylvia on 3-5-2017.
 */
public class SprookjebosFrame extends JFrame {
    private Battlepanel battlepanel;

    public void startBatle(){
        battlepanel = new Battlepanel();
        add(BorderLayout.CENTER, battlepanel);

    }
    public Battlepanel getBattlepanel() {
        return battlepanel;
    }


    public SprookjebosFrame(){
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sprookjesbos V0.1");
        setMinimumSize(new Dimension(1200,700));
        }
}
