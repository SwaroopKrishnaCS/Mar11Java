package methodsExample;

public class ConstructorsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AccountWithConstructor parbhjotAcct = new AccountWithConstructor("Prabhjot", "Savings", "321654987", 6521.03,
				6547);

		System.out.println(parbhjotAcct.getBalance());

		AccountWithConstructor gianAcct = new AccountWithConstructor("Gian", "TFSA", "321654988", 6521.03, 1234);

//		System.out.println("Gian PIN Number: "+ gianAcct.pin );
		
		System.out.println(gianAcct.getBalance());
		
//		AccountWithConstructor accouConstructor = new AccountWithConstructor();
//		
//		System.out.println(accouConstructor.getBalance());
		
//		gianAcct.pin =4567;
		
//		System.out.println("Gian PIN Number: "+ gianAcct.pin );
		
		
	
		
	}

}
