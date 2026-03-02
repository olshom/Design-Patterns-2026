import java.util.Random;
import java.util.Scanner;

public class Player {
    private static Scanner scanner = new Scanner(System.in);
    private final String name;
    private int experience;
    private int health;
    private Level level;
    public Player(String name) {
        this.name = name;
        this.experience = 0;
        this.health = 0;
        this.level = new Novice(this);
    }

    public void play(){
        while (true){
            if (level == null){
                System.out.println("Game over");
                break;
            }
            level.act();
        }
    }
    public void setLevel(Level level){ this.level = level; }
    public int getExperience(){ return this.experience; }
    public int getHealth(){ return this.health; }
    public void train(int points){
        System.out.println("Training");
        this.experience += points;
    }
    public void meditate(int points){
        System.out.println("Meditation");
        this.health += points;
    }
    public void fight(int points){
        System.out.println("Fight!!!");
        this.health -= points;
        this.experience += points*2;
    }
    public int readUserChoice(String[] options) {
        // print options
        System.out.println(this.name + ", your level is " + this.level);
        System.out.println(this.name + ", your experience is " + this.experience);
        System.out.println(this.name + ", your health is " + this.health);
        System.out.println("\nSelect an option:");
        for (int i = 1; i <= options.length; i++) {
            System.out.println(i + ". " + options[i-1]);
        }
        // read user input
        return scanner.nextInt();
    }

    public int throwDice(){
        Random rand = new Random();
        int dice = rand.nextInt(6) + 1;
        return dice;
    }
}
