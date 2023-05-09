public class Hare extends Herbivores implements Walkable, Swimming{

    public Hare(String name) {
        super(name);
    }

    @Override
    public String say() {
        return "Pfie";
    }

    @Override
    public String toString() {
        return String.format("Hare, %s", super.toString());
    }

    @Override
    public int walkSpeed() {
        return 7;
    }

    @Override
    public int swimSpeed() {
        return 1;
    }
}
