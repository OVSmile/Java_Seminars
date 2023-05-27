public class SaveTo implements SaveAs{
    private final User user;

    public SaveTo (User user) {
        this.user = user;
    }

    @Override
    public void save() {
        System.out.println("Save user: " + user.getName());
    }
}
