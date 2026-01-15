
import java.util.Random;

public class CityMap extends Map{
    @Override
    public Tile createTile() {
        Tile [] tiles = {new RoadTile(), new BuildingTile()};
        Random random = new Random();
        return tiles[(int) (random.nextInt(2))];
    }
}
