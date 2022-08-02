package introduction;

public class LocalGlobalVariables {
	
	int x = 25; //global variable - scope is in the entire program. any method can use it
	
	void method1() {
		int i = 10; //local variable - scope is within the method1
		System.out.println(i);
	}
	
	
	void method2() {
		int j=20; //local variable -scope is within method2
		System.out.println(j);
		System.out.println(x);
	}

	public static void main(String[] args) {
		LocalGlobalVariables obj = new LocalGlobalVariables();
		System.out.println(obj.x);
//		System.out.println(j); Cannot access local variables

	}

}
