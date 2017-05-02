package nl.woudstra.sprookjesbos.GUI;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Tieme & Sylvia on 30-4-2017.
 */
public class BackgroundOefening {
    JFrame frame;
    Backgroundpanel backgroundpanel;

    public void createMenu(){
        frame = new JFrame();
        frame.setTitle("Batle");
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        backgroundpanel = new Backgroundpanel();
        frame.setContentPane(backgroundpanel);

        //Panel background

        frame.setVisible(true);
    }



}
