package nl.woudstra.sprookjesbos.GUI;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Tieme & Sylvia on 2-5-2017.
 */
public class Backgroundpanel extends JPanel {
    public void paintComponent(Graphics graphics){
        Image background = new ImageIcon(getClass().getResource("Bibliotheken.Afbeeldingen.Weiland.jpg")).getImage();
        graphics.drawImage(background, 0, 0, this);
    }
}
