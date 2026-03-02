public class Novice extends Level {
    public Novice(Player player) {
        super(player);
    }
    @Override
    public void act() {
        int dice = getPlayer().throwDice();
        System.out.println("You throw..." + dice);
        String[] options = {"to train"};
        switch (this.getPlayer().readUserChoice(options)) {
            case 1:
                this.getPlayer().train(dice);
                break;
        }
        if (this.getPlayer().getExperience() >= 12){
            this.getPlayer().setLevel(new Intermediate(this.getPlayer()));
        }
    }

    @Override
    public String toString() {
        return "Novice";
    }
}
