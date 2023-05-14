import java.util.Random;

public class Warrior<T extends Weapon>{
    private String name;

    public void setHealth(int health) {
        this.health = health;
    }

    public T getWeapon() {
        return weapon;
    }

    protected T weapon;

    public int getHealth() {
        return health;
    }

    private int health;

    public Warrior(String name, T weapon, int health) {
        this.name = name;
        this.weapon = weapon;
        this.health = health;
    }



    @Override
    public String toString() {
        return String.format("name: %s, weapon: %s, health: %d",name, weapon, health);
    }

    public int hit() {
        Random random = new Random();
        return random.nextInt(weapon.damage());
    }

}
