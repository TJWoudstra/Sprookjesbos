package nl.woudstra.sprookjesbos.GUI.battle;

import nl.woudstra.sprookjesbos.characters.enemies.Enemy;
import nl.woudstra.sprookjesbos.characters.player.Player;

import nl.woudstra.sprookjesbos.GUI.utils.ImageReader;
import java.util.List;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Tieme & Sylvia on 2-5-2017.
 */
public class Battleview extends JPanel {
    private List<Player> players;
    private List<Enemy> enemies;

    public Battleview(List<Player> players, List<Enemy> enemies) {
        this.players = players;
        this.enemies = enemies;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // draw background
        g.drawImage(ImageReader.getImage("Weiland.jpg", getWidth(), getHeight(), Image.SCALE_SMOOTH), 0, 0, this);

        // draw players
        int playerIndex = 0;
        for(Player player : players){
            Image characterImage = ImageReader.getImage(player.getImageName(), getWidth() / 13, getHeight() / 10, Image.SCALE_SMOOTH);
            g.drawImage(characterImage, getHPosPlayer(player.isFrontPosition()), getVPosPlayer(playerIndex), this);
            playerIndex++;
        }

        // draw enemies
        int enemyIndex = 0;
        for(Enemy enemy : enemies){
            Image enemyImage = ImageReader.getImage(enemy.getImageName(), getWidth() / 13, getHeight() / 10, Image.SCALE_SMOOTH);
            g.drawImage(enemyImage, 0, getVposEnemy(enemyIndex), this);
            enemyIndex++;
        }
    }

    private int getHPosPlayer(boolean frontPosition){
        return (int) (getWidth() * (frontPosition ? 0.83 : 0.90));
    }

    private int getVPosPlayer(int indexPlayer){
        double start = 0.25;
        double increase = 0.15;
        double factor = start + increase * indexPlayer;
        return (int) (factor * getHeight());
    }

    private int getVposEnemy(int indexEnemy){
        return getVPosPlayer(indexEnemy * 2);
    }
}
