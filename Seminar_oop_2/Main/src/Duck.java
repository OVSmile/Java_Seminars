public class Duck extends Herbivores implements Walkable, Flyable{
    public Duck(String name) {
        super(name);
    }

    @Override
    public String say() {
        return "Kri";
    }

    @Override
    public String toString() {
        return String.format("Duck, %s", super.toString());
    }

    @Override
    public int flySpeed() {
        return 10;
    }

    @Override
    public int walkSpeed() {
        return 3;
    }
}
