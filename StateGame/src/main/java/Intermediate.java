public class Intermediate extends Level {
    public Intermediate(Player player) {
        super(player);
    }

    @Override
    void act() {
        int dice = getPlayer().throwDice();
        System.out.println("You throw..." + dice);
        String[] options = {"to train", "to meditate"};
        switch (this.getPlayer().readUserChoice(options)) {
            case 1:
                this.getPlayer().train(dice);
                break;
            case 2:
                this.getPlayer().meditate(dice);
                break;
        }
        if (this.getPlayer().getExperience() >= 20 && this.getPlayer().getHealth() >= 10){
            this.getPlayer().setLevel(new Expert(this.getPlayer()));
        }
    }
    @Override
    public String toString() {
        return "Intermediate";
    }
}
