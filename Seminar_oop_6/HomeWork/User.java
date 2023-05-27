public class User{

	User user = new User("Bob");
	private String name;

	public User(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
}