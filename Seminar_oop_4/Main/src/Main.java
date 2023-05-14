public class Main {
    public static void main(String[] args) {
        Characters<Archer> archerCharacters = new Characters<>();
        archerCharacters.add(new Archer("Legolas", new Bow(), 50))
                .add(new Archer("Elf", new Bow(), 45));

        Characters<Barbarian> barbarianCharacters = new Characters<>();
        barbarianCharacters.add(new Barbarian("Mrak", new Axe(), 100))
                .add(new Barbarian("Conan", new Axe(), 95));

        System.out.println(archerCharacters);
        System.out.println(barbarianCharacters);

        Battle battle = new Battle(new Archer("Legolas", new Bow(), 20),
                        new Barbarian("Mrak", new Axe(), 30));

        Warrior winner = battle.fight();
        System.out.println(winner);

    }
}