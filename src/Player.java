

public class Player extends Employee{
    PlayerPosition playerPosition;
    int height;

    public Player(String name, int age, PlayerPosition playerPosition, int number, int height) {
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
}
