import java.util.Random;

public class Archer extends Warrior<Bow, woodenShield>{

    public Archer(String name, Bow bow, woodenShield woodenShield, int health) {
        super(name, bow, woodenShield, health);
    }
     int range(){
         Random random = new Random();
         return random.nextInt(weapon.range());
     }

    @Override
    public String toString() {
        return String.format("Archer %s", super.toString());
    }
}
