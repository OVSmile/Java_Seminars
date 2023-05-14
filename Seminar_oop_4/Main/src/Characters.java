import java.util.ArrayList;
import java.util.List;

public class Characters<T> {
    List<T> characters = new ArrayList<>();

    public Characters<T> add(T warrior) {
        characters.add(warrior);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (T item: characters) {
            sb.append(item);
            sb.append("\n");

        }
        return sb.toString();
    }
}
