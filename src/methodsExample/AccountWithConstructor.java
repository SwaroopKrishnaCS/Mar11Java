package methodsExample;

public class AccountWithConstructor {

	public String nameOFAccountHolder;
	public String accountType;
	private String accountNumber;

	private double balance;
	private int pin;

//	public AccountWithConstructor(String name, String acctType, String acctNum, double bal, int pinNumber) {
//		nameOFAccountHolder = name;
//		accountType = acctType;
//		accountNumber = acctNum;
//		balance = bal;
//		pin = pinNumber;
//	}

	public AccountWithConstructor(String nameOFAccountHolder, String accountType, String accountNumber, double balance,
			int pin) {
		super();
		this.nameOFAccountHolder = nameOFAccountHolder;
		this.accountType = accountType;
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.pin = pin;
	}

	public AccountWithConstructor() {

	}

	public AccountWithConstructor(String nameOFAccountHolder, String accountType) {

	}

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

	private boolean validatePin(int pinEntered) {

		if (pin == pinEntered) {
			return true;
		}
		return false;

	}

	public boolean validateCredentials(String accountNumberEntered, int pinEntered) {
		if (accountNumber.equals(accountNumberEntered)) {
			if (validatePin(pinEntered)) {
				return true;
			}
		}
		return false;
	}

	public AccountWithConstructor getAccountIfValidCredentials(String accountNumberEntered, int pinEntered,
			AccountWithConstructor[] accounts) {

		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getAccountNumber().equals(accountNumberEntered)) {
				if (accounts[i].pin == pinEntered) {
					return accounts[i];
				}
			}
		}
		return null;
	}

	public void displayAccountDetails() {
		System.out.println("Account Holder Name: " + getNameOfAccountHolder());
		System.out.println("Type Of Account: " + getAccountType());
		System.out.println("Account Balance: " + getBalance());
	}

}
