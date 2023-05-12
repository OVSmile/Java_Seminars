import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Company implements Iterable<User> {
    private User user;

    public Company(User user) {
        this.user = user;
    }

    private List<User> deepTree(User user) {
        List<User> listSub = new ArrayList<>();
        listSub.add(user);
        if (user.getSubordinate() == null || user.getSubordinate().size() == 0) {
            return listSub;
        }

        for (User item: user.getSubordinate()) {
            listSub.addAll(deepTree(item));
        }
        return  listSub;
    }

    @Override
    public Iterator<User> iterator() {

        return new Iterator<User>() {
            List<User> iterUser = deepTree(user);
            Iterator<User> iterator = iterUser.iterator();
            @Override
            public boolean hasNext() {
                return iterator.hasNext();
            }

            @Override
            public User next() {
                return iterator.next();
            }
        };
    }
}