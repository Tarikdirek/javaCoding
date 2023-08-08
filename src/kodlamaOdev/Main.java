package kodlamaOdev;

public class Main {

	public static void main(String[] args) {
		Student student = new Student(1,"Tarık","Direk","takdirek@hotmail.com","12345");
		Instructor instructor = new Instructor(2,"Engin","Demirog","engin@yahoo.com","321654","ozgecmis");
		
		User[] users = new User[] {student,instructor};
		
		for (User user : users) {
			System.out.println(user.id);
		}
		
		UserManager userManager = new StudentManager(student);
		userManager.add();
	}

}
