public class Player extends Employee {
    private PlayerPosition playerPosition;
    private int height;

    public Player(String name, int age, PlayerPosition playerPosition, int height) {
        super( name, age);
        this.playerPosition = playerPosition;
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public PlayerPosition getPlayerPosition() {
        return playerPosition;
    }

    public String toString() {
        return "Name: %s, age: %s, position: %s, height: %s \n ".formatted( getName(),getAge(),getPlayerPosition(),getHeight()).toUpperCase();
    }
}
