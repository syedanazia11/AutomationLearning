package introduction;

public class OperatorsDemo {
	
	// Arithematic operators +, -,*, /
	// Relational operators >, <, >=, <=, ==, !=
	// Logical operators &&, ||

	public static void main(String[] args) {
		
		int num1 = 200;
		int num2 = 150;
		int num3 = 140;
		
		String str1 = "Java";
		
		if(num1 > num2 & num1 > num3) {
			System.out.println("Num1 is the greatest");
		} else if(num2 > num3) {
			System.out.println("Num2 is the greatest");
		} else {
			System.out.println("Num3 is the greatest");
		}
		
		if(str1 == "Java") {
			System.out.println("String matches");
		} else {
			System.out.println("Strings do not match");
		}
		
		
	}

}
