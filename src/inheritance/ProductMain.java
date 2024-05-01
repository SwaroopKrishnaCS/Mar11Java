package inheritance;

import inheritance2.AirFryer;
import inheritance2.Laptop;

public class ProductMain {

	public static void main(String[] args) {
		
		Appliance laptop = new Appliance("Asus Laptop", "FX506HF-BS51-CB", 900);
		
		AirFryer airfryer = new AirFryer();
		
		//laptop.displaySpecifications();
		
		
		Laptop hpLaptop = new Laptop();
		hpLaptop.name ="HP laptop";
		hpLaptop.modelNumber="x82198";
		hpLaptop.price=900;
		
		System.out.println("Display price : "+hpLaptop.price);
		hpLaptop.displayCustomerReviews();
		
		hpLaptop.displaySpecifications();
		
		airfryer.name="AirFryer";
		airfryer.modelNumber="90189";
		airfryer.price=70;
		
		Reviews airfryerReview = new Reviews();
		airfryerReview.rating =4;
		String[] airfryercomments = {"Good product", "excellent airfryer", "Stopped working after 6 months"
		};
		airfryerReview.setComments(airfryercomments);
		
		airfryer. customerReview = airfryerReview;
		
		airfryer.displaySpecifications();
		airfryer.displayCustomerReviews();
		
		WashingMachine washingMachine = new WashingMachine();
		washingMachine.setNum("10");
		
		Reviews customerReviewForWM = new Reviews();
		customerReviewForWM.setRating(3.5);
		
		String[] comments = {"Good product", "excellent", "Stopped working after 6 months"
		};
		
		customerReviewForWM.setComments(comments);
		
		washingMachine.customerReview = customerReviewForWM;
		
		washingMachine.displayCustomerReviews();
	}

}
