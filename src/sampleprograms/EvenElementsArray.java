package sampleprograms;

public class EvenElementsArray {

	public static void main(String[] args) {
	
		int[] numbers = {1, 2, 3, 4, 5};
		
		for (int i=0;i<numbers.length; i = i+2) {
			System.out.println(numbers[i]);
		}

	}

}
