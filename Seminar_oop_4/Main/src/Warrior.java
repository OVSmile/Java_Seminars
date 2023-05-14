import java.util.Random;

public class Warrior{
    private String name;

    private Weapon weapon;

    private int health;

    public Warrior(String name, Weapon weapon, int health) {
        this.name = name;
        this.weapon = weapon;
        this.health = health;
    }



    @Override
    public String toString() {
        return String.format("Warrior {name = %s, weapon = %d, health = %d",name, weapon, health);
    }

    public int hit() {
        Random random = new Random();
        return random.nextInt(weapon.damage());
    }

}
