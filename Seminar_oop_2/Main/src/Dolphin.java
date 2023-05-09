public class Dolphin extends Predator implements Swimming{

    public Dolphin(String name) {
        super(name);
    }

    @Override
    public String say() {
        return "Trrr";
    }

    @Override
    public int swimSpeed() {
        return 25;
    }

    @Override
    public String toString() {
        return String.format("Dolphin, %s", super.toString());
    }
}
