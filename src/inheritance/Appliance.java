package inheritance;

public class Appliance {

	private String num;
	String defaultVariable;
	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getDefaultVariable() {
		return defaultVariable;
	}

	public void setDefaultVariable(String defaultVariable) {
		this.defaultVariable = defaultVariable;
	}

	protected String name;
	protected String modelNumber;
	protected double price;
	
	//Has a concept - Composition
	public Reviews customerReview;
	
	public Appliance() {
		
	}
	
	public Appliance(String name, String modelNumber, double price) {
		super();
		this.name = name;
		this.modelNumber = modelNumber;
		this.price = price;
	}

	public void displayCustomerReviews() {
		System.out.println("Display customer rating");
		System.out.println("display customer comments");
	}
	
	public void checkOffer() {
		System.out.println("Check for offers");
	}
	
	public void displaySpecifications() {
		System.out.println("Display specifications of "+name);
	}
	
	
}
