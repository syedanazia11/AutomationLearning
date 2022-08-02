package introduction;

public class StringConcatDemo {
	
	// + 

	public static void main(String[] args) {
		
		int a = 10;
		int b = 25;
		
		String str1 = "Hello";
		String str2 = "World";
		
		System.out.println(a+b);
		
		System.out.println(str1+str2);
		
		System.out.println(a+b+str1+str2);
		
		System.out.println(str1+str2+a+b);
		
		System.out.println(str1+str2+(a+b));
		
		System.out.print("Hello"+"\n");
		System.out.println("World");
		
		

	}

}
