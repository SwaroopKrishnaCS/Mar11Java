package inheritance2;

import inheritance.Appliance;

public class Laptop extends Appliance{

	
	public Laptop(String name, String modelNumber, double price) {
		super(name, modelNumber, price);
		// TODO Auto-generated constructor stub
	}

	public Laptop() {
		// TODO Auto-generated constructor stub
	}

	public void displaySpecifications() {
		System.out.println("Display specifications of "+name);
		System.out.println("Show processor details");
		System.out.println("Show Memory details");
	}
}
