public class Wolf extends Predator implements Walkable{

    public Wolf(String name) {
        super(name);
    }

    @Override
    public String say() {
        return "Uuu";
    }

    @Override
    public String toString() {
        return "Wolf, " + super.toString();
    }

    @Override
    public int walkSpeed() {
        return 6;
    }
}
