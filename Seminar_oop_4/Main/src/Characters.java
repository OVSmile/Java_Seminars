import java.util.ArrayList;
import java.util.List;

public class Characters<T extends Warrior, E extends Warrior> {
    List<T> charactersW = new ArrayList<>();
    List<E> charactersS = new ArrayList<>();

    public Characters add(T warriorW, E warriorS) {
        charactersW.add(warriorW);
        charactersS.add(warriorS);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (T item : charactersW) {
            sb.append(item);
            sb.append("\n");
        }
        for (E item : charactersS) {
            sb.append(item);
            sb.append("\n");
        }
        sb.append(String.format("Helth all = %d, Damage all = %d, Range all = %d, Block = %d", helthPoint(), getDamage(), maxRange(), minShield()));
        return sb.toString();
    }

    public int helthPoint() {
        int sum = 0;
        for (T item : charactersW) {
            sum += item.getHealth();
        }
        return sum;
    }

    public int getDamage() {
        int sum = 0;
        for (T item : charactersW) {
            sum += item.getWeapon().damage();
        }
        return sum;
    }

    public int maxRange() {
        int max = 0;
        for (T item : charactersW) {
            if (item instanceof Archer) {
                if (max < ((Archer) item).range()) {
                    max = ((Archer) item).range();
                }
            }
        }
        return max;
    }

    public int minShield() {
        int min = 4;
        for (E item : charactersS) {
            if (min > item.block()) {
                min = item.block();
            }
        }
        return min;
    }
}