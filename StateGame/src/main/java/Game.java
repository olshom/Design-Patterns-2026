import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        System.out.println("Welcome to master game. What is your name?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        new Player(name).play();
    }
}
