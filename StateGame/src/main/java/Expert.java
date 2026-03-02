public class Expert extends Level {
    public Expert(Player player) {
        super(player);
    }

    @Override
    void act() {
        int dice = getPlayer().throwDice();
        System.out.println("You throw..." + dice);
        String[] options = {"to train", "to meditate", "to fight"};
        switch (this.getPlayer().readUserChoice(options)) {
            case 1:
                this.getPlayer().train(dice);
                break;
            case 2:
                this.getPlayer().meditate(dice);
                break;
            case 3:
                this.getPlayer().fight(dice);
                break;
        }
        if (this.getPlayer().getExperience() >= 35 && this.getPlayer().getHealth() >= 10) {
            this.getPlayer().setLevel(new Master(this.getPlayer()));
        }
    }

    @Override
    public String toString() {
        return "Expert";
    }
}
