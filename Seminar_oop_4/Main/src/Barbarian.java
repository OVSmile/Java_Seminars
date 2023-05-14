public class Barbarian extends Warrior<Axe>{

    public Barbarian(String name, Axe axe, int health) {
        super(name, axe, health);
    }

    @Override
    public String toString() {
        return String.format("Barbarian %s", super.toString());
    }
}