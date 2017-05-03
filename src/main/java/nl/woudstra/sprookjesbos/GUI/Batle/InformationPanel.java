package nl.woudstra.sprookjesbos.GUI.Batle;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Tieme & Sylvia on 3-5-2017.
 */
public class InformationPanel extends JPanel {
    JTextArea messageField;

    public InformationPanel(){
        setBackground(Color.darkGray);
        messageField = new JTextArea(5, 80);
        messageField.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(messageField);
        messageField.setLineWrap(true);
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        this.add(scrollPane);
    }
}
