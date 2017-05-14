package nl.woudstra.sprookjesbos.GUI;

import nl.woudstra.sprookjesbos.characters.Knight;
import nl.woudstra.sprookjesbos.characters.Team;
import nl.woudstra.sprookjesbos.characters.enemies.AngryBird;

/**
 * Created by Tieme & Sylvia on 3-5-2017.
 */
public class SprookjebosFrameTest {
    public static void main(String[] args){
        Team player = new Team();
        for(String name : new String[]{"Tieme", "Sylvia", "Bouke", "Friso", "Jiske"}){
            player.addCharacter(new Knight(name));
        }
        player.getCharacter("Tieme").getStatus().incrementLevel();
        player.getCharacter("Bouke").getStatus().incrementLevel();
        player.getCharacter("Bouke").getStatus().incrementLevel();
        player.getCharacter("Friso").getStatus().incrementLevel();

        player.getCharacter("Sylvia").setFrontPosition(true);
        player.getCharacter("Friso").setFrontPosition(true);

        Team enemy = new Team();
        enemy.addCharacter(new AngryBird());
        enemy.addCharacter(new AngryBird());

        SprookjebosFrame sprookjebosFrame = new SprookjebosFrame(player, enemy);
        sprookjebosFrame.setVisible(true);
    }
   }
