package sampleprograms;

public class OccurrenceOfChar {

	public static void main(String[] args) {
		String str1 = "This is java programming";
		
		char charArray[] = str1.replace(" ", "").toCharArray();
		int count =0;
		char key = 'a';
		
		for(int i=0;i<charArray.length;i++) {
			if(charArray[i] == key) {
				count++;
			}
		}
		
		System.out.println("Occurrence of "+key+" is: "+count);

	}

}
