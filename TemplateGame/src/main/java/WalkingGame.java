import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class WalkingGame extends Game {
    int finalPoint = 25;
    ArrayList<Player> players = new ArrayList<>();
    Player winner;
    boolean endOfGame = false;
    Scanner sc = new Scanner(System.in);

    @Override
    public void initializeGame(int numberOfPlayers) {
        for (int i = 0; i < numberOfPlayers; i++) {
            System.out.println("Enter player " + i + " name: ");
            String playerName = sc.nextLine();
            players.add(new Player(playerName));
        }
    }

    @Override
    public boolean endOfGame() {
        return endOfGame;
    }

    @Override
    public void playSingleTurn(int player) {
        System.out.println("Player " + players.get(player).getPlayerName() + "'s turn");
        Random rand = new Random();
        int dice = rand.nextInt(6) + 1;
        System.out.println(players.get(player).getPlayerName() + " throws " + dice);
        players.get(player).move(dice);
        System.out.println(players.get(player).getPlayerName() + " is moving to the point " + players.get(player).getPlayerPoint());
        if (players.get(player).getPlayerPoint()>=finalPoint){
            endOfGame = true;
            winner = players.get(player);
        }
    }

    @Override
    public void displayWinner() {
        System.out.println("Winner: " + winner.getPlayerName());
    }
}
