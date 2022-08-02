package introduction;

public class SwitchDemo {

	public static void main(String[] args) {
		
		char grade = 'A';
		
		switch(grade) {
		
		case 'A':
			System.out.println("First class with distiction");
			break;
		case 'B':
			System.out.println("First class");
			break;
		case 'C':
			System.out.println("Second class");
			break;
		default: 
			System.out.println("Fail");
		}

	}

}
