package nl.woudstra.sprookjesbos.characters.enemies;

import nl.woudstra.sprookjesbos.characters.Character;

/**
 * Created by Tieme & Sylvia on 13-5-2017.
 */
public abstract class Enemy extends Character {
    private int x_position;
    private int y_position;

    //constructor
    public Enemy(int x_position, int y_position){
        this.x_position = x_position;
        this.y_position = y_position;
    }

    //getters & setters
    public int getX_position() {
        return x_position;
    }

    public void setX_position(int x_position) {
        this.x_position = x_position;
    }

    public int getY_position() {
        return y_position;
    }

    public void setY_position(int y_position) {
        this.y_position = y_position;
    }

}
