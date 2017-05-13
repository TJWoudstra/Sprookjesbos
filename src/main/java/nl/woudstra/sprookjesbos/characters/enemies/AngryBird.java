package nl.woudstra.sprookjesbos.characters.enemies;

/**
 * Created by Tieme & Sylvia on 13-5-2017.
 */
public class AngryBird extends Enemy {
    public AngryBird(int x_position, int y_position){
        super(x_position, y_position);
        setMaxHitPoints(50);
        setHitPoints(50);
        setImageLocation("/images/AngryBird.gif");
    }
}
