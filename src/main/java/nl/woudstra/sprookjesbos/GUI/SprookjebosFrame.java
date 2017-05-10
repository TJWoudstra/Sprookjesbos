package nl.woudstra.sprookjesbos.GUI;

import nl.woudstra.sprookjesbos.characters.Knight;
import nl.woudstra.sprookjesbos.characters.MainCharacter;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Tieme & Sylvia on 3-5-2017.
 */
public class SprookjebosFrame extends JFrame {
    private Battlepanel battlepanel;
    private MainCharacter[] mainCharacters;

    public void startBatle(){
        battlepanel = new Battlepanel(mainCharacters);
        add(BorderLayout.CENTER, battlepanel);

    }

    // simpele setMainCharacters om te kunnen testen
    public void setMainCharacters(){
        mainCharacters = new MainCharacter[5];
        for(int i = 0; i < mainCharacters.length; i++){
            mainCharacters[i] = new Knight();
            }
        mainCharacters[0].setName("Tieme");
        mainCharacters[0].incrementLevel();
        mainCharacters[1].setName("Sylvia");
        mainCharacters[2].setName("Bouke");
        mainCharacters[2].incrementLevel();
        mainCharacters[2].incrementLevel();
        mainCharacters[3].setName("Friso");
        mainCharacters[3].incrementLevel();
        mainCharacters[4].setName("Jiske");
    }

    public MainCharacter getMaincharacter(int i){
        if (i<mainCharacters.length){
            return mainCharacters[i];
        }
        else return new Knight();
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
