import java.util.Random;

public class Game {
    public static void main(String[] args) {
        Map map = Game.createMap();
        map.display();
    }
    public static Map createMap(){
        return Math.random()<0.5 ? new CityMap() : new WildernessMap();
    }
}
