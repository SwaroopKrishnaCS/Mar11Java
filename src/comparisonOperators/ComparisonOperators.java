package comparisonOperators;

public class ComparisonOperators {

	int a = 15;
	int b = 15;
	boolean result = false;

	public void isAGreaterThanB() {
		result = a > b;
		System.out.println("Is A greater than B :" + result);
	}
	
	public void isAGreaterThanOrEqualToB() {
		result = a >= b;
		System.out.println("Is A greater than B :" + result);
	}

	public void compareTwoNumbers() {
		result = a == b;
		System.out.println("Is A equal to B :" + result);
	}

}
