public class Yigurt extends Product{
    private final String flavor;

    public Yigurt(String name, Integer cost, String flavor) {
        super(name, cost);
        this.flavor = flavor;
    }

    @Override
    public String toString() {
        return super.toString() + " " + flavor;
    }
}
