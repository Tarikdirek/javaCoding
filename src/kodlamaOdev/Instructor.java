package kodlamaOdev;

public class Instructor extends User {
	
	public Instructor(int id,String firstName,String lastName,String email,String password,String resume) {
		this();
		this.id = id;
		this.firstName=firstName;
		this.lastName=lastName;
		this.email = email;
		this.password=password;
		this.resume = resume;
	}
	
	public Instructor() {}
	
	String firstName;
	String lastName;
	String resume;
}
