import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Personal implements Iterable<User>{

    List<User> Users = new ArrayList<>();

    @Override
    public Iterator<User> iterator() {
        return new Iterator<User>() {

            int index = 0;

            @Override
            public boolean hasNext() {
                return index < Users.size();
            }

            @Override
            public User next() {
                return Users.get(index++);
            }
        };
    }

    public Personal addUser(User user){
        Users.add(user);
        return this;
    }

    public List<User> toList(){
        List<User> results = new ArrayList<>();
        for (User user: this) {
            results.add(user);
        }
        return results;
    }

    public int size(){
        return Users.size();
    }
}
