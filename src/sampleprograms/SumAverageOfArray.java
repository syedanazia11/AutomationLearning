package sampleprograms;

public class SumAverageOfArray {

	public static void main(String[] args) {

		int numbers[] = {10, 20, 30, 40, 50};
		int sum=0;
		int avg = 0;
		
		for(int i=0;i<numbers.length;i++) {
			sum = sum + numbers[i];
		}
		
		avg = sum/numbers.length;
		
		System.out.println("Sum of array is: "+sum);
		System.out.println("Average is: "+avg);

	}

}
