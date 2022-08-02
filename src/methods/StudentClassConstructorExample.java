package methods;

class Student {
	String studentName;
	int rollNumber;
	String studentBranch;
	
//	Student() {
//		System.out.println("Default constructor");
//	}
	
	Student(String name, int roll, String branch) {
		System.out.println("constructor");
		studentName = name;
		rollNumber = roll;
		studentBranch = branch;
	}
	
	void displayDetails() {
		System.out.println("Student Name: "+studentName);
		System.out.println("Roll Number: "+rollNumber);
		System.out.println("Student Branch: "+studentBranch);
	}
}

public class StudentClassConstructorExample {

	public static void main(String[] args) {
		
		Student st1 = new Student("John", 1, "CS");
		Student st2 = new Student("Mark", 2, "EC");
		st1.displayDetails();
		st2.displayDetails();
	}

}
