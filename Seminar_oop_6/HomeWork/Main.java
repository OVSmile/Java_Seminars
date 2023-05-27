public class Main{
	public static void main(String[] args){
		User user = new User("Bob");

		persisterReport persisterReport = new persisterReport(user);
		persisterReport.report();

		SaveTo saveTo = new SaveTo(user);
		saveTo.save();
	}
}