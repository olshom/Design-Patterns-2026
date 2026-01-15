
public abstract class Tile {
    protected String description;
    protected char character;
    char getCharacter() { return character; }
    String getDescription(){ return description; }
    abstract void action();
}
