public class ironShield implements Shield{

    @Override
    public int blocking() {
        return 4;
    }

    @Override
    public String toString() {
        return String.format("Iron shield, block: %d", blocking());
    }
}
