import java.util.ArrayList;
import java.util.List;

public class Characters<T extends Warrior> {
    List<T> characters = new ArrayList<>();

    public Characters<T> add(T warrior) {
        characters.add(warrior);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (T item : characters) {
            sb.append(item);
            sb.append("\n");
        }
        sb.append(String.format("Helth all = %d, Damage all = %d, Range all = %d", helthPoint(), getDamage(), maxRange()));
        return sb.toString();
    }

    public int helthPoint() {
        int sum = 0;
        for (T item : characters) {
            sum += item.getHealth();
        }
        return sum;
    }

    public int getDamage() {
        int sum = 0;
        for (T item : characters) {
            sum += item.getWeapon().damage();
        }
        return sum;
    }

    public int maxRange() {
        int max = 0;
        for (T item : characters) {
            if (item instanceof Archer) {
                if (max < ((Archer)item).range()){
                    max = ((Archer)item).range();
                }
            }
        }
        return max;
    }
}
