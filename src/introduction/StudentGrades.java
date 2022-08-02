package introduction;


public class StudentGrades {

	public static void main(String[] args) {
		
		StudentGrades student = new StudentGrades();
		String grade;
		
		grade = student.findGrade(90);
		student.displayGrade("John", grade);
		grade = student.findGrade(67);
		student.displayGrade("Mark", grade);
		
	}
	
	public String findGrade(int score) {
		String grade;
		if(score >=90 && score <100) {
			grade = "A";
		} else if(score >=80 && score <90) {
			grade = "B";
		} else if(score >=70 && score <80) {
			grade = "C";
		} else {
			grade = "D";
		}
	return grade;
	}
	
	public void displayGrade(String studentName, String grade) {
		System.out.println("The grade of "+studentName + " is "+grade);
	}

}
