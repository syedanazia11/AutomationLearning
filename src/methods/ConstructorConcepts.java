package methods;

public class ConstructorConcepts {
	
	//zero argument constructor
	ConstructorConcepts() {
		System.out.println("This is a constructor");
	}
	
	// 1 parameter constructor
	ConstructorConcepts(int i) {
		System.out.println("This is parameterized constructor");
		System.out.println("i: "+i);
	}
	
	ConstructorConcepts(int i, int j) {
		System.out.println("This is 2 parameter constructor");
		System.out.println("i: "+i);
		System.out.println("j: "+j);
	}
	
	void sum(int i, int j) {
		int res = i+j;
		System.out.println(res);
	}

	public static void main(String[] args) {
		
		ConstructorConcepts obj = new ConstructorConcepts(12);
		obj.sum(10, 40);

	}

}
