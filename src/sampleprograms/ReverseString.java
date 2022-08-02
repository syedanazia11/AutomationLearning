package sampleprograms;

public class ReverseString {

	public static void main(String[] args) {
		
		String str1 = "This is java programming";
		
		String strArr[] = str1.split(" ");
		
		for(int i=0;i<strArr.length;i++) {
			char[] chArr = strArr[i].toCharArray();
			for(int j=chArr.length-1;j>=0;j--) {
				System.out.print(chArr[j]);
			}
			System.out.print(" ");
		}
		

	}

}
