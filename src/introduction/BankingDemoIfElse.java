package introduction;

public class BankingDemoIfElse {

	public static void main(String[] args) {
		
		double accountBalance = 10000;
		double withdrawAmount = 2000;
		
		int pin = 123;
		
		if(pin == 123) {
			if(accountBalance > withdrawAmount) {
				accountBalance = accountBalance - withdrawAmount;
				System.out.println("Account balance is "+accountBalance);
			} else {
				System.out.println("Amount insufficient");
			}
		} else {
			System.out.println("Incorrect pin");
		}

	}

}
