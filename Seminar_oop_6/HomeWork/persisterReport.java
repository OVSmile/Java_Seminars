public class persisterReport implements Report{
	private final User user;

	public persisterReport(User user) {
		this.user = user;
	}
	@Override
	public void report() {
		System.out.println("Report for user: " + user.getName());
	}
}