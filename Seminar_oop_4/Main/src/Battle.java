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
            int blockTwo = two.block();
            System.out.printf("Hit damage Warior one: %s. \n", hitOne);
            if ((hitOne - blockTwo) > 0) {
                two.setHealth((two.getHealth()) - (hitOne - blockTwo));
                System.out.printf("Warior two blocked %s damage and has %s helth. \n", blockTwo, two.getHealth());
            } else {
                System.out.printf("Warior two blocked the blow and has %s helth. \n", two.getHealth());
            }

            if (two.getHealth() <= 0) {
                System.out.println("Winner: ");
                return one;
            }

            int hitTwo = two.hit();
            int blockOne = one.block();
            System.out.printf("Hit damage Warior two: %s. \n", hitTwo);
            if ((hitTwo - blockOne) > 0) {
                one.setHealth((one.getHealth()) - (hitTwo - blockOne));
                System.out.printf("Warior one blocked %s damage and has %s helth. \n", blockOne, one.getHealth());
            }else {
                System.out.printf("Warior one blocked the blow and has %s helth. \n", one.getHealth());
            }
        }
        return two;
    }
}
