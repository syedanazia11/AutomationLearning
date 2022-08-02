package sampleprograms;

public class FindIfKeyPresentInArray { 
	public static void main(String[] args) { 
		// TODO Auto-generated method stub 
		int numbers[] = {10,120,30,40,150}; 
		int key = 120; 
		boolean foundkeyelement = false; 
		for (int i=0;i<numbers.length;i++) { 
			if (numbers[i] == key) { 
				foundkeyelement = true; 
				break; 
			}  
		}
		if (foundkeyelement){ 
			System.out.println("The key is present in the array"); 
		}else { 
			System.out.println("The key wasnt found"); 
		}	
	}
	
}

