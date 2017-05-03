package nl.woudstra.sprookjesbos.GUI;

import nl.woudstra.sprookjesbos.GUI.Batle.Battleview;
import nl.woudstra.sprookjesbos.GUI.Batle.InformationPanel;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Tieme & Sylvia on 3-5-2017.
 */
public class Battlepanel extends JPanel {
    InformationPanel informationPanel; //south
    Battleview battleview;             //center

    public Battlepanel(){
        setLayout(new BorderLayout());
        informationPanel = new InformationPanel();
        add(BorderLayout.SOUTH, informationPanel);

        // battleview werkt nog niet


    }

}
