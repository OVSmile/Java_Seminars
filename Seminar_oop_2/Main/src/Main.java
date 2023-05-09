public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        zoo.setRadio(new Radio());
        zoo.addList(new Wolf("Wolf"))
                .addList(new Hare("Hare"))
                .addList(new Duck("Donald"))
                .addList(new Bat("Batman"));

        System.out.println("Все животные зоопарка");
        for (var item : zoo.getListAnimal()) {
            System.out.println(item);
        }
        System.out.println();
        System.out.println("Звуки");
        for (var item : zoo.getSayble()) {
            System.out.println(item.say());
        }
        System.out.println();
        System.out.println("Могут ходить");
        for (var item : zoo.walkables()) {
            System.out.printf("%s, Speed: %d\n", item.toString(), item.walkSpeed());
        }
        System.out.println();
        System.out.println("Могут летать");
        for (var item : zoo.flyables()) {
            System.out.printf("%s, Speed: %d\n", item.toString(), item.flySpeed());
        }
        System.out.println();
        System.out.println("Быстрее всех бегает>");
        System.out.println("Winner" + zoo.winnerWalk());

        System.out.println();
        System.out.println("Быстрее всех летает");
        System.out.println("Winner" + zoo.winnerFly());
    }
}