package nl.woudstra.sprookjesbos.GUI;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Tieme & Sylvia on 3-5-2017.
 */
public class SprookjebosFrame extends JFrame {
    private Battlepanel mainPanel;

    public void startBatle(){
        mainPanel = new Battlepanel();
        add(BorderLayout.CENTER, mainPanel);

    }
    public JPanel getMainPanel() {
        return mainPanel;
    }


    public SprookjebosFrame(){
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sprookjesbos");
        }
}
