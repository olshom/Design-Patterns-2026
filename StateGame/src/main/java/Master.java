public class Master extends Level {
    public Master(Player player) {
        super(player);
    }

    @Override
    public void act() {
        System.out.println("Master finished his adventures");
        this.getPlayer().setLevel(null);
    }

    @Override
    public String toString() {
        return "Master";
    }
}


