package takeInputFromUser;

import java.util.Scanner;

public class TakeUserInput {

	
	
	void takeTheInput() {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the name of user: ");
		String name=sc.next();
		
		System.out.println("Enter the age of user: ");
		int age=sc.nextInt();
		
		System.out.println("Name of the user is " +name + " age is "+ age );
	
	}
}
