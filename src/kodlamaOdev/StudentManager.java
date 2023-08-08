package kodlamaOdev;

public class StudentManager extends UserManager {
	Student _student;
	
	public StudentManager(Student student) {
		_student=student;
	}
	
	
	public void add() {
		System.out.println(_student.firstName + " adli ogrenci eklendi");
	}
}
