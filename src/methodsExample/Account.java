package methodsExample;

public class Account {
	
	String nameOFAccountHolder;
	String accountType;
	String accountNumber;
	
	double balance;
	int pin;
	
	public String getNameOfAccountHolder() {
		return nameOFAccountHolder;
	}
	
	
	public double getBalance() {
		return balance;
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
	
	public String getAccountType() {
		return accountType;
	}
	
	public boolean validatePin(int pinEntered) {
		
		if (pin==pinEntered) {
			return true;
		}
		return false;
		
	}
	
	public boolean validateCredentials(String accountNumberEntered, int pinEntered) {
		if(accountNumber.equals(accountNumberEntered)) {
			if(validatePin(pinEntered)) {
				return true;
			}
		}
		return false;
	}
	

}
