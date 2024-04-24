package firstDayJava;

import methodsExample.AccountWithConstructor;

public class MainClass {

	public static void main(String[] args) {
		
		System.out.println("Today is Thursday");
		
		MobilePhone mp=new MobilePhone();
		
		mp.makeCalls();
		
		mp.sendText();
		
		
		
		String nameOfBrand= mp.brandName;
		
		System.out.println(nameOfBrand);
		
		
		AccountWithConstructor swaroopAcct = new AccountWithConstructor("Swaroop", "Savings", "7890123456", 4678.9, 0234);
		
		System.out.println("Name of Account Holder: "+swaroopAcct.nameOFAccountHolder);
		
		System.out.println("Account Type: "+swaroopAcct.accountType);
		

		
		
	}
	
}
