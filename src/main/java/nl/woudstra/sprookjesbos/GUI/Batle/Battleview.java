package nl.woudstra.sprookjesbos.GUI.Batle;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Tieme & Sylvia on 2-5-2017.
 */
public class Battleview extends JPanel {
    public void paintComponent(Graphics graphics){
        Image background = new ImageIcon(getClass().getResource("Weiland.jpg")).getImage();
        graphics.drawImage(background, 0, 0, this);
    }
}
