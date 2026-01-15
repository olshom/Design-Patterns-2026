import java.util.Random;

public class WildernessMap extends Map{
    @Override
    public Tile createTile() {
        Tile [] tiles = {new SwampTile(), new WaterTile(), new ForestTile()};
        Random random = new Random();
        return tiles[(int) (random.nextInt(3))];
    }
}
