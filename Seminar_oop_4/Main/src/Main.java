public class Main {
    public static void main(String[] args) {
        Characters<Archer> archerCharacters = new Characters<>();
        archerCharacters.add(new Archer("Legolas", new Bow(), new woodenShield(), 50))
                        .add((new Archer("Robin Hood", new Bow(), new woodenShield(), 45)));

        Characters<Barbarian> barbarianCharacters = new Characters<>();
        barbarianCharacters.add(new Barbarian("Mrak", new Axe(), new ironShield(), 100))
                            .add(new Barbarian("Conan", new Axe(), new ironShield(), 95));

        System.out.println(archerCharacters);
        System.out.println(barbarianCharacters);

        Battle battle = new Battle(new Archer("Legolas", new Bow(), new woodenShield(), 20),
                        new Barbarian("Mrak", new Axe(), new ironShield(), 30));

        Warrior winner = battle.fight();

        System.out.printf("The winner of the battle\n" + winner);
    }
}