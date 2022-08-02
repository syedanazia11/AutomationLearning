package sampleprograms;

public class ReverseWordsInString {

	public static void main(String[] args) {
		
		String str = "This is a test string";
		String[] strArray = str.split(" ");
//		strArray = {"This", "is", "a", "test", "string"};
		
		for(int i=0;i<strArray.length;i++) {
//			strArray[0] = This;
//			char[] ch = {'T', 'h','i','s'};

			char[] ch = strArray[i].toCharArray();
			for(int j=ch.length-1;j>=0;j--) {
				System.out.print(ch[j]);
			}
			System.out.print(" ");
		}
		
		//output = sihT si a tset gnirts
		//gnirts tset a si sihT

	}

}
