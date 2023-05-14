import java.util.Random;

public class Archer extends Warrior{

    public Archer(String name, Bow bow, int health) {
        super(name, bow, health);
    }
     int range(){
         Random random = new Random();
         return random.nextInt(((Bow)weapon).range());
     }

    @Override
    public String toString() {
        return String.format("Archer %s", super.toString());
    }
}
