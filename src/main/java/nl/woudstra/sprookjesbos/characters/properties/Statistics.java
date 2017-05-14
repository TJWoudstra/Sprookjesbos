package nl.woudstra.sprookjesbos.characters.properties;

/**
 * Created by Tieme on 30-4-2017.
 */
public class Statistics {
    private int speed;
    private int strength;
    private int magicPower;

    //constructors

    public Statistics() {
        speed = 30;
        strength = 30;
        magicPower = 30;
    }

    public Statistics(int speed, int strength, int magicPower) {
        this.speed = speed;
        this.strength = strength;
        this.magicPower = magicPower;
    }

    //getters & setters

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public void setMagicPower(int magicPower) {
        this.magicPower = magicPower;
    }
}
