import java.util.ArrayList;

public abstract class Map {
    abstract Tile createTile(
    );
    public void display(){
        for(int x=0; x < 10; x++){
            for(int y=0; y <10; y++) {
                Tile specificTile = createTile();
                System.out.print(specificTile.getCharacter());
            }
            System.out.println("");
        }
    }
}
