package inheritance2;

import inheritance.Appliance;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Appliance app = new Appliance();
		
		
		AirFryer airFryer = new AirFryer("Phillips Airfryer", "HGH6576", 100);
		
		
		airFryer.setNum("11");
		airFryer.displaySpecifications();
		
	}

}
