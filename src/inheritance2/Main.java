package inheritance2;

import inheritance.Appliance;
import inheritance.WashingMachine;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Appliance app = new Appliance();
		
		String s ="Ketaki";
	
//		AirFryer airFryer = new AirFryer("Phillips Airfryer", "HGH6576", 100);
//		
//		
//		airFryer.setNum("11");
//		airFryer.displaySpecifications();
		
		//Object/Reference variable
		//Mac is a reference variable of Type Macbook
		Macbook mac = new Macbook();
//		mac.orderAdditionalMemory();
//		mac.displayCustomerReviews();
//		mac.displaySpecifications();
		
		
		//Parent Reference variable  - Referring to an object of child class using parent reference variable
		Laptop laptop = new Macbook();
		
		Appliance appliance = new Macbook();
		
		Appliance appliance2 = new AirFryer();
		
		Appliance appliance3 = new WashingMachine();
		
		//appliance.displayCustomerReviews();
		
		//Method called depends on the object - in this case Macbook
		appliance.displaySpecifications();
		
		System.out.println("_________________________________________");
		
		//appliance2.displayCustomerReviews();
		appliance2.displaySpecifications();//Method called depends on the object - in this case Airfryer's overloaded method will be called
		
		System.out.println("_________________________________________");
		//appliance3.displayCustomerReviews();
		appliance3.displaySpecifications();//Here since we do not have an overloaded method in washing machine it will call parent class method
	
		Appliance hplaptop = new Laptop();
		
		hplaptop.displayCustomerReviews();
		
		
		Laptop laptop3 = new Laptop();
		laptop3.orderAdditionalMemory();
		
	
	
	}

}
