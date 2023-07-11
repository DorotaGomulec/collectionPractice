import java.util.ArrayList;
import java.util.Scanner;

public class Player extends Employee {
    PlayerPosition playerPosition;
    int height;
    public Player() {}
    public Player(String name, int age, PlayerPosition playerPosition, int height) {
        super( name, age);
        this.playerPosition = playerPosition;
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public PlayerPosition getPlayerPosition() {
        return playerPosition;
    }

    public void setPlayerPosition(PlayerPosition playerPosition) {
        this.playerPosition = playerPosition;
    }

    public String toString() {
        return "Name: " + name + ", age: " + age + ", position: " + playerPosition + " , heigh: " + height + "\n";
    }
}
