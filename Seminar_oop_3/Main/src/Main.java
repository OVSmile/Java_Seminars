import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Personal personal = new Personal();
        personal.addUser(new User("John", "Dorian", 25))
                .addUser(new User("Christopher", "Turk", 25))
                .addUser(new User("Elliot", "Reid", 24));

        Personal personal2 = new Personal();
        personal2.addUser(new User("Percival","Cox",40));


        User user = new User("Carla", "Espinosa", 26);
        user.setSubordinate(personal);

        personal2.addUser(user);
        User bigBoss = new User("Robert","Kelso",55);
        bigBoss.setSubordinate(personal2);

        Company company = new Company(bigBoss);

        for (User listSub : company) {
            System.out.println(listSub);
        }

//        for (User user : personal) {
//            System.out.println(user);
//        }
//        List<User> users = personal.toList();
//        System.out.println("--------");
//        System.out.println(users);
//
//        Collections.sort(users);
//        System.out.println("--------");
//        System.out.println(users);
    }
}