public class Axe implements Weapon{

    @Override
    public int damage() {
        return 10;
    }

    @Override
    public String toString() {
        return String.format("Axe, damage: %d", damage());
    }


}
