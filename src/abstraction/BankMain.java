package abstraction;

public class BankMain {

	public static void main(String arg[]) {
		NationalBank cibc = new CIBC();
		NationalBank td = new TDBank();
		
		cibc.interestonSaving();
		
		td.interestonSaving();
		
		
	}
}
