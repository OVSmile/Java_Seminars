public class Bow implements Weapon{
    @Override
    public int damage() {
        return 6;
    }

    public int range(){
        return 20;
    }

    @Override
    public String toString() {
        return String.format("Bow, damage: %d, range: %d", damage(), range());
    }
}
