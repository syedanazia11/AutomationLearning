package introduction;

public class Copy1ArrayToAnother {

	public static void main(String[] args) {
		
		
		String str1[] = {"John","Mark","Bob"};
		String str2[] = new String[str1.length];
		
//		str2 = str1;
		
		
		for(int i=0;i<str1.length;i++) {
			str2[i] = str1[i];
		}
		
		str2[1] = "Syeda";
		
		for(int i=0;i<str1.length;i++) {
			System.out.println(str1[i]);
		}
		
		for(int i=0;i<str2.length;i++) {
			System.out.println(str2[i]);
		}

	}

}
