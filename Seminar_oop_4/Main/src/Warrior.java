import java.util.Random;

public class Warrior<T extends Weapon, E extends Shield>{
    private String name;

    public void setHealth(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }
    private int health;

    public T getWeapon() {
        return weapon;
    }

    protected T weapon;

    public E getShield() {
        return shield;
    }

    protected E shield;

    public Warrior(String name, T weapon, E shield, int health) {
        this.name = name;
        this.weapon = weapon;
        this.shield = shield;
        this.health = health;
    }



    @Override
    public String toString() {
        return String.format("name: %s, weapon: %s, shield: %s, health: %d",name, weapon, shield, health);
    }

    public int hit() {
        Random random = new Random();
        return random.nextInt(weapon.damage());
    }

    public int block() {
        Random random = new Random();
        return random.nextInt(shield.blocking());
    }

}
