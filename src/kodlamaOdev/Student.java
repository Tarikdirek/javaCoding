package kodlamaOdev;

public class Student extends User {
	
	public Student(int id,String firstName,String lastName,String email,String password) {
		this();
		this.id=id;
		this.firstName=firstName;
		this.lastName=lastName;
		this.email = email;
		this.password=password;
	}
	public Student() {}
	
	String firstName;
	String lastName;
}
