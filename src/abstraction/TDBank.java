package abstraction;

public class TDBank extends NationalBank {

	@Override
	public void interestonSaving() {
		// TODO Auto-generated method stub
		System.out.println("Provide 1.2% interest on saving ");
	}
	
	public  void provideLoans() {
		System.out.println("Provide loans starting from prime rate 5.1%");
	}

	
}
