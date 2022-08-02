package methods;

public class EvenOddNumber {
	
	boolean findEvenOrOdd(int num1) {
		if(num1%2 == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	void displayOddOrEven(boolean value) {
		if(value) {
			System.out.println("Even");
		} else {
			System.out.println("Odd");
		}
	}

	public static void main(String[] args) {
		
		EvenOddNumber obj = new EvenOddNumber();
		boolean value = obj.findEvenOrOdd(45);
		obj.displayOddOrEven(value);
	}

}
