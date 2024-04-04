package firstDayJava;

public class MainClass {

	public static void main(String[] args) {
		
		System.out.println("Today is Thursday");
		
		MobilePhone mp=new MobilePhone();
		
		mp.makeCalls();
		
		mp.sendText();
		
		
		
		String nameOfBrand= mp.brandName;
		
		System.out.println(nameOfBrand);
		

		
		
	}
	
}
