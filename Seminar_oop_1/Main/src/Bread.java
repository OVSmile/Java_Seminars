public class Bread extends Product {

    private final String variety;

    public Bread(String name, Integer cost, String variety) {
        super(name, cost);
        this.variety = variety;
    }

    @Override
    public String toString() {return super.toString() + " " + variety;}

}
