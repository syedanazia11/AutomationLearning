package introduction;

public class StringsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String fName = "Syeda"; //String Literals
		String lName = new String("Nazia"); // Using new operator
		
		
		String newFName = "Syeda";
		String newLName = new String("Nazia");
		
		fName = "Syeda1";
		
		int x=10;
		x=15;
		
		//StringBuffer and StringBuilder
		
		StringBuffer xyz = new StringBuffer("String1");
		System.out.println(xyz);
		
		xyz.append("NewString");
		xyz.delete(7,15);
		System.out.println("After " +xyz);
		
		StringBuilder stringBuild = new StringBuilder("String1");
		System.out.println(stringBuild);

	}

}
