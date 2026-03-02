public class Player {
    private String playerName;
    private int playerPoint = 0;

    public Player(String playerName) {
        this.playerName = playerName;
    }

    public int getPlayerPoint() {
        return playerPoint;
    }
    public void move(int points) {
        this.playerPoint += points;
    }
    public String getPlayerName() {
        return playerName;
    }
}
