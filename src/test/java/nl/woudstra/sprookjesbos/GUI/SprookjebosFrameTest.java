package nl.woudstra.sprookjesbos.GUI;

import nl.woudstra.sprookjesbos.characters.enemies.Enemy;
import nl.woudstra.sprookjesbos.characters.player.Knight;
import nl.woudstra.sprookjesbos.characters.enemies.AngryBird;
import nl.woudstra.sprookjesbos.characters.player.Player;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tieme & Sylvia on 3-5-2017.
 */
public class SprookjebosFrameTest {
    public static void main(String[] args){
        List<Player> players = new ArrayList<>();
        for(String name : new String[]{"Tieme", "Sylvia", "Bouke", "Friso", "Jiske"}){
            players.add(new Knight(name));
        }
        players.get(0).getStatus().incrementLevel();
        players.get(2).getStatus().incrementLevel();
        players.get(2).getStatus().incrementLevel();
        players.get(3).getStatus().incrementLevel();
        players.get(1).setFrontPosition(true);
        players.get(3).setFrontPosition(true);

        List<Enemy> enemies = new ArrayList<>();
        enemies.add(new AngryBird());
        enemies.add(new AngryBird());
        enemies.add(new AngryBird());
        enemies.add(new AngryBird());
        enemies.add(new AngryBird());
        enemies.get(0).setGridPosition(1,1);
        enemies.get(1).setGridPosition(2,2);
        enemies.get(2).setGridPosition(1,2);
        enemies.get(3).setGridPosition(6,3);
        enemies.get(4).setGridPosition(10,4);




        SprookjebosFrame sprookjebosFrame = new SprookjebosFrame(players, enemies);
        sprookjebosFrame.setVisible(true);
    }
   }
