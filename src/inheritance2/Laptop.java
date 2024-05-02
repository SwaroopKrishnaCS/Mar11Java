package inheritance2;

import inheritance.Appliance;

public class Laptop extends Appliance{

	
	public Laptop(String name, String modelNumber, double price) {
		super(name, modelNumber, price);
		// TODO Auto-generated constructor stub
	}

	public Laptop() {
		// TODO Auto-generated constructor stub
		//System.out.println("In laptop no-arg constructor");
	}

	//Method Overriding - Run time Polymorphism
	@Override 
	public void displaySpecifications() {
		System.out.println("Display specifications of "+name);
		System.out.println("Show processor details");
		System.out.println("Show Memory details");
	}
	
	public void orderAdditionalMemory() {
		System.out.println("Placing an order for additional memory");
	}
}
