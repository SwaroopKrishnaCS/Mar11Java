package stringExamples;

import java.util.Arrays;

public class StringDemo {
	
	public static void main(String[] args) {
		
		String name = "Swaroop Krishna";
		char[] characterArray = name.toCharArray();
		
		System.out.println(Arrays.toString(characterArray));
		
		String firstAndLastName = "Rajinder Kaur";
		String [] nameArray = firstAndLastName.split(" ");
		
		System.out.println("First Name:"+ nameArray[0]);
		System.out.println("Last Name:"+ nameArray[1]);
		
		
		String splitAString = "Arshpreet&wants&to&see&if&string&can&be&split&without&space";
		
		String[]splitStringToArray = splitAString.split("&");
		
		System.out.println(Arrays.toString(splitStringToArray));
		
		String [] splitExample = splitAString.split("string");
		System.out.println(Arrays.toString(splitExample));
		
	}

}
