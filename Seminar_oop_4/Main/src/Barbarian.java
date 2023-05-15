public class Barbarian extends Warrior<Axe, ironShield>{

    public Barbarian(String name, Axe axe, ironShield ironShield, int health) {
        super(name, axe, ironShield, health);
    }

    @Override
    public String toString() {
        return String.format("Barbarian %s", super.toString());
    }
}
