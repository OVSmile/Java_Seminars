public class Duck extends Herbivores implements Walkable, Flyable, Swimming{
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

    @Override
    public int swimSpeed() {
        return 5;
    }
}
