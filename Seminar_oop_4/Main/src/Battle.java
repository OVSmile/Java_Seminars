public class Battle {
    private final Warrior one;
    private final Warrior two;

    public Battle(Warrior one, Warrior two) {

        this.one = one;
        this.two = two;
    }

    public Warrior fight() {
        while (one.getHealth() > 0 && two.getHealth() > 0) {
            int hitOne = one.hit();
            System.out.printf("Hit damage Warior one: %s. \n", hitOne);
            two.setHealth((two.getHealth()) - hitOne);
            System.out.printf("Warior two have got %s helth. \n", two.getHealth());
            if (two.getHealth() <= 0) {
                System.out.println("Winner: ");
                return one;
            }

            int hitTwo = two.hit();
            System.out.printf("Hit damage Warior two: %s. \n", hitTwo);
            one.setHealth((one.getHealth()) - hitTwo);
            System.out.printf("Warior one have got %s helth. \n", one.getHealth());
        }
        return two;
    }
}
