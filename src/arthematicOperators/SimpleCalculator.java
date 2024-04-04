package arthematicOperators;

public class SimpleCalculator {

	int num1 = 25;
	int num2 = 10;
	int result = 0; // This variable save results

	/*
	 * this method add 2 numbers this method add 2 number and subtract 1 number
	 */
	void addTwoNumbers() {
		int c = 10;
		result = num1 + num2 - c;
		System.out.println("Sum. of three numbers: " + result);
		System.out.println(c);// this statement print the value of variable c
	}

	// this method Subtract 2 numbers
	void subtractTwoNumbers() {
		result = num1 - num2;
		System.out.println("Result of subtracting two numbers: " + result +" wow!!!!! Result achieved");

	}

	// this method multiply 2 numbers
	void multiplyTwoNumbers() {
		result = num1 * num2;
		System.out.println("Multiplication of two numbers: " + result);
	}

	void getQuoOfTwoNumbers() {
		result = num1 / num2;
		System.out.println("Quo. of two numbers: " + result);
	}

	void getRemOfTwoNumbers() {
		result = num1 % num2;
		System.out.println("Remainder. of two numbers: " + result);
	}

}
