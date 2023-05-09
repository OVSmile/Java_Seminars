public class meat extends Product{

    private final String type;

    public meat(String name, Integer cost, String type) {
        super(name, cost);
        this.type = type;

    }

    @Override
    public String toString() {
        return super.toString() + " " + type;
    }
}
