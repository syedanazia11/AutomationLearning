package methods;

public class CalculatorDemo {
	
	int addition(int num1, int num2) {
		int sum = num1+num2;
		System.out.println("Sum: "+sum);
		return sum;
	}
	
	void subtraction(int num1, int num2) {
		int diff = num1-num2;
		System.out.println("Difference: "+diff);
	}
	
	void product(int num1, int num2) {
		int product = num1*num2;
		System.out.println("Product: "+product);
	}

	public static void main(String[] args) {
		
		CalculatorDemo calc = new CalculatorDemo();
		int result = calc.addition(12,30);
		calc.addition(result, 40);
		calc.subtraction(40, 60);

	}

}
