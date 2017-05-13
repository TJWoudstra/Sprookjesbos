package nl.woudstra.sprookjesbos.GUI;

import nl.woudstra.sprookjesbos.characters.Knight;
import nl.woudstra.sprookjesbos.characters.Team;

/**
 * Created by Tieme & Sylvia on 3-5-2017.
 */
public class SprookjebosFrameTest {
    public static void main(String[] args){
        Team mainCharacters = new Team();
        for(String name : new String[]{"Tieme", "Sylvia", "Bouke", "Friso", "Jiske"}){
            mainCharacters.addCharacter(new Knight(name));
        }
        mainCharacters.getCharacter("Tieme").getStatus().incrementLevel();
        mainCharacters.getCharacter("Bouke").getStatus().incrementLevel();
        mainCharacters.getCharacter("Bouke").getStatus().incrementLevel();
        mainCharacters.getCharacter("Friso").getStatus().incrementLevel();


        SprookjebosFrame sprookjebosFrame = new SprookjebosFrame(mainCharacters);
        sprookjebosFrame.setVisible(true);
    }
   }
