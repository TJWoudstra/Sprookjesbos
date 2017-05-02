package nl.woudstra.sprookjesbos.GUI;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Tieme & Sylvia on 30-4-2017.
 */
public class Batleframe{
    JFrame frame;
    Backgroundpanel backgroundpanel;
    JTextArea messageField;

    public void createMenu(int numberOfMainCharacters){
        frame = new JFrame();
        frame.setTitle("Batle");
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        backgroundpanel = new Backgroundpanel();
        frame.setContentPane(backgroundpanel);

        //message area south
        messageField = new JTextArea(5, 20);
        messageField.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(messageField);
        messageField.setLineWrap(true);
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        frame.getContentPane().add(BorderLayout.SOUTH, scrollPane);

        //Panel background


        frame.setVisible(true);
    }



}
