public class woodenShield implements Shield{

    @Override
    public int blocking() {
        return 2;
    }

    @Override
    public String toString() {
        return String.format("Wooden shield, block: %d", blocking());
    }
}
